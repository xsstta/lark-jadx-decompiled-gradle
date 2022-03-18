package com.alibaba.fastjson;

class JSONStreamContext {
    protected final JSONStreamContext parent;
    protected int state;

    public JSONStreamContext(JSONStreamContext jSONStreamContext, int i) {
        this.parent = jSONStreamContext;
        this.state = i;
    }
}
