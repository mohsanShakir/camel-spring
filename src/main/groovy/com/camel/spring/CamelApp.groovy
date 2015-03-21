package com.camel.spring
import com.camel.spring.beans.MessageSender
import com.camel.spring.config.SpringConfig
import org.springframework.context.annotation.AnnotationConfigApplicationContext
/**
 * Created by Mohsan on 20-03-2015.
 */
class CamelApp {

    public static void main(String[] arguments) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig);

        MessageSender messageSender = context.getBean(MessageSender)
        messageSender.sendMesssage()

        Thread.sleep(1000)
        context.close()
    }

}
