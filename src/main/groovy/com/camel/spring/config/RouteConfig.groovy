package com.camel.spring.config

import com.camel.spring.beans.MyFileProcessor
import org.apache.camel.builder.RouteBuilder
/**
 * Created by Mohsan on 20-03-2015.
 */
public class RouteConfig extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        from("activemq:test").bean(MyFileProcessor,"processBody").to("file:C:\\datafiles\\output");
    }
}
