package com.camel.spring.beans

import org.apache.camel.ProducerTemplate
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component
/**
 * Created by Mohsan on 21-03-2015.
 */
@Component
class MessageSender {

    @Autowired
    ProducerTemplate camelTemplate


    public void sendMesssage(){
        camelTemplate.sendBody("activemq:test","blablu")
    }



}
