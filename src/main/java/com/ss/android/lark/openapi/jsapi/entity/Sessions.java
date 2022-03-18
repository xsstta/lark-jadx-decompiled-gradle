package com.ss.android.lark.openapi.jsapi.entity;

import java.util.List;

public class Sessions implements BaseJSModel {
    private List<String> sessions;

    public List<String> getSessions() {
        return this.sessions;
    }

    public void setSessions(List<String> list) {
        this.sessions = list;
    }
}
