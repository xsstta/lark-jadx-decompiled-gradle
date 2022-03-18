package com.ss.android.lark.chat.service.p1678a.p1679a;

import android.text.TextUtils;
import com.bytedance.lark.pb.basic.v1.Trace;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.chat.entity.message.Message;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.lark.chat.service.a.a.b */
public class C34118b {

    /* renamed from: a */
    public final Message f88300a;

    /* renamed from: b */
    public final String f88301b;

    /* renamed from: c */
    public final long f88302c;

    /* renamed from: d */
    public final Trace f88303d;

    /* renamed from: a */
    public Map<String, Object> mo126543a() {
        HashMap hashMap = new HashMap();
        Trace trace = this.f88303d;
        if (!(trace == null || trace.spans == null)) {
            for (Trace.Span span : this.f88303d.spans) {
                if (!TextUtils.isEmpty(span.name) && span.duration_millis != null) {
                    hashMap.put(span.name, span.duration_millis);
                    if (!CollectionUtils.isEmpty(span.attributes)) {
                        hashMap.putAll(span.attributes);
                    }
                }
            }
        }
        return hashMap;
    }

    public C34118b(Message message, String str, long j, Trace trace) {
        this.f88300a = message;
        this.f88301b = str;
        this.f88302c = j;
        this.f88303d = trace;
    }
}
