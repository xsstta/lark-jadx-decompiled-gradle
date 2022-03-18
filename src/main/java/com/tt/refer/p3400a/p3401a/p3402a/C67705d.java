package com.tt.refer.p3400a.p3401a.p3402a;

import com.tt.frontendapiinterface.IApiOutputParam;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: com.tt.refer.a.a.a.d */
public class C67705d implements IApiOutputParam {

    /* renamed from: a */
    private final JSONObject f170549a;

    /* renamed from: a */
    public Iterator<String> mo235002a() {
        return this.f170549a.keys();
    }

    public C67705d(JSONObject jSONObject) {
        this.f170549a = jSONObject;
    }

    /* renamed from: a */
    public <T> T mo235001a(String str) {
        T t = (T) this.f170549a.opt(str);
        if (t == JSONObject.NULL) {
            return null;
        }
        return t;
    }
}
