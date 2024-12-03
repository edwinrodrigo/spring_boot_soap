package com.ifis.ws_ifis.configuration;



import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.config.annotation.WsConfigurerAdapter;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import org.springframework.ws.wsdl.WsdlDefinition;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.ws.wsdl.wsdl11.SimpleWsdl11Definition;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;

@EnableWs
@Configuration
public class WebServiceConfig extends WsConfigurerAdapter {

    @Bean(name = "messageDispatcherServlet")
    public ServletRegistrationBean<MessageDispatcherServlet> messageDispatcherServlet(ApplicationContext applicationContext) {
        MessageDispatcherServlet servlet = new MessageDispatcherServlet();
        servlet.setApplicationContext(applicationContext);
        servlet.setTransformWsdlLocations(true);
        return new ServletRegistrationBean<>(servlet, "/ws-ifis/*");
    }

    @Bean(name = "IfisWS")
    public WsdlDefinition defaultWsdl11Definition(XsdSchema ifisSchema) {
        //IfisWSSoapBinding
//        DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
//        wsdl11Definition.setPortTypeName("MetodosPort");
//        wsdl11Definition.setServiceName("IfisWS");
//        wsdl11Definition.setLocationUri("http://localhost:8080/ws-ifis/IfisWS");
//        wsdl11Definition.setTargetNamespace("http://trafficcontrol.com.ec");
//        wsdl11Definition.setSchema(ifisSchema);

        SimpleWsdl11Definition simple = new SimpleWsdl11Definition();
        simple.setWsdl(new ClassPathResource("IfisWS.wsdl"));


        return simple;
    }

    @Bean
    public XsdSchema ifisSchema() {
        return new SimpleXsdSchema(new ClassPathResource("IfisWS.xsd"));
    }

}
