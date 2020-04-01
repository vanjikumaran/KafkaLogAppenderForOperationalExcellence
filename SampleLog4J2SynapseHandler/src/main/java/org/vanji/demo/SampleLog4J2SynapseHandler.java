package org.vanji.demo;


import org.apache.synapse.AbstractSynapseHandler;
import org.apache.synapse.MessageContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SampleLog4J2SynapseHandler extends AbstractSynapseHandler {

    public static final Logger logger = LogManager.getLogger(SampleLog4J2SynapseHandler.class);

    public boolean handleRequestInFlow(MessageContext synCtx) {
        logger.debug("**************** handle Request IN FLOW **********************");
        return true;
    }
    public boolean handleRequestOutFlow(MessageContext synCtx) {
        logger.debug("**************** handle Request OUT FLOW **********************");
        return true;
    }
    public boolean handleResponseInFlow(MessageContext synCtx) {
        logger.debug("**************** handle Response IN FLOW **********************");
        return true;
    }
    public boolean handleResponseOutFlow(MessageContext synCtx) {
        logger.debug("**************** handle Response IN FLOW **********************");
        return true;
    }
}

