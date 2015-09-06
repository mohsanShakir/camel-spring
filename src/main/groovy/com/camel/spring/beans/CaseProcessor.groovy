package com.camel.spring.beans

import com.camel.spring.domain.Case
import org.apache.camel.Exchange
import org.springframework.stereotype.Component
/**
 * Created by Mohsan on 20-03-2015.
 */
@Component
class CaseProcessor {

    public Case process(Exchange exchange){
        Case sag = exchange.getIn().getBody(Case.class)
        return sag
    }

}
