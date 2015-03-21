package com.camel.spring.beans

import org.springframework.stereotype.Component

/**
 * Created by Mohsan on 20-03-2015.
 */
@Component
class MyFileProcessor {

    public String processBody(String body){
        println "recieved $body from file"
        return body.reverse()
    }

}
