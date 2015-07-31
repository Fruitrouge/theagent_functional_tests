package com.theagent.util;

/**
 * Created by karla.jarquin on 31/07/2015.
 */
public class TestUtils {
    private static final String THE_AGENT_BASE_URL = "http://mlamamra.theagent.fruitrouge.com";
    public static final String THE_AGENT_BASE_URL_PROPERTY = "theagent.base.url";

    public static String getTheAgentBaseUrl() {
        return System.getProperty(THE_AGENT_BASE_URL_PROPERTY, THE_AGENT_BASE_URL);
    }
}
