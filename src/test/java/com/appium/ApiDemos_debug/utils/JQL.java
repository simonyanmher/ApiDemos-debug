package com.appium.ApiDemos_debug.utils;

public class JQL {
    private final String JQL;

    public JQL(String JQL) {
        this.JQL = "summary ~ \"" + JQL.substring(0, JQL.indexOf(' ')) + "\"";
    }

    public String getJQL() {
        return JQL;
    }
}
