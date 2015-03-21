package com.camel.spring.config
import org.apache.activemq.ActiveMQConnectionFactory
import org.apache.camel.CamelContext
import org.apache.camel.ProducerTemplate
import org.apache.camel.component.jms.JmsComponent
import org.apache.camel.impl.DefaultCamelContext
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration
/**
 * Created by Mohsan on 20-03-2015.
 */
@Configuration
@ComponentScan(basePackages = ["com.camel.spring.beans"])
class SpringConfig {

    @Bean
    public CamelContext camel() throws Exception{
        CamelContext camelContext = new DefaultCamelContext();
        camelContext.addRoutes(new RouteConfig());
        camelContext.addComponent("activemq", JmsComponent.jmsComponentAutoAcknowledge(connectionFactory()));
        camelContext.start();
        return camelContext;
    }


    @Bean
    public ProducerTemplate camelTemplate(){
        camel().createProducerTemplate()
    }

    @Bean
    public ActiveMQConnectionFactory connectionFactory() {
        ActiveMQConnectionFactory activeMQConnectionFactory = new ActiveMQConnectionFactory();
        activeMQConnectionFactory.setBrokerURL("tcp://localhost:61616");
        return activeMQConnectionFactory;
    }






}
