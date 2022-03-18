package com.bytedance.crash.entity;

import com.bytedance.crash.C3756h;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.json.JSONObject;

/* renamed from: com.bytedance.crash.entity.a */
public class C3740a {

    /* renamed from: a */
    private static final ConcurrentLinkedQueue<C3756h> f11529a = new ConcurrentLinkedQueue<>();

    /* renamed from: b */
    private static final ConcurrentHashMap<Integer, C3756h> f11530b = new ConcurrentHashMap<>();

    /* renamed from: com.bytedance.crash.entity.a$a */
    public interface AbstractC3741a {
        /* renamed from: a */
        boolean mo15109a(JSONObject jSONObject);
    }
}
