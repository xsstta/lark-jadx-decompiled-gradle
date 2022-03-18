package com.bytedance.ee.falcon.inspector.jsonrpc.protocol;

import com.bytedance.ee.falcon.inspector.json.JsonProperty;
import org.json.JSONObject;

/* renamed from: com.bytedance.ee.falcon.inspector.jsonrpc.protocol.c */
public class C12662c {
    @JsonProperty

    /* renamed from: a */
    public Long f33905a;
    @JsonProperty(required = true)

    /* renamed from: b */
    public String f33906b;
    @JsonProperty

    /* renamed from: c */
    public JSONObject f33907c;

    public C12662c() {
    }

    public C12662c(Long l, String str, JSONObject jSONObject) {
        this.f33905a = l;
        this.f33906b = str;
        this.f33907c = jSONObject;
    }
}
