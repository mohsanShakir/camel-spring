package com.camel.spring.config

import com.camel.spring.beans.CaseProcessor
import com.camel.spring.domain.Case
import org.apache.camel.builder.RouteBuilder
import org.apache.camel.model.dataformat.JsonLibrary
/**
 * Created by Mohsan on 20-03-2015.
 */
public class RouteConfig extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        from("activemq:test").unmarshal().json(JsonLibrary.Jackson,Case.class)
                .bean(CaseProcessor,"process").to("stream:out");
    }
}
