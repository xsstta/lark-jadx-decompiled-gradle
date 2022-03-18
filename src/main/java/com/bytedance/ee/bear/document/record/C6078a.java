package com.bytedance.ee.bear.document.record;

import android.util.ArrayMap;
import java.util.Map;

/* renamed from: com.bytedance.ee.bear.document.record.a */
public class C6078a {

    /* renamed from: a */
    private Map<String, RecordModel> f16957a = new ArrayMap();

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.document.record.a$a */
    public static final class C6079a {

        /* renamed from: a */
        static C6078a f16958a = new C6078a();
    }

    /* renamed from: a */
    public static C6078a m24584a() {
        return C6079a.f16958a;
    }

    /* renamed from: b */
    public void mo24575b() {
        this.f16957a.clear();
    }

    /* renamed from: a */
    public RecordModel mo24573a(String str) {
        return this.f16957a.get(str);
    }

    /* renamed from: a */
    public void mo24574a(String str, RecordModel recordModel) {
        this.f16957a.put(str, recordModel);
    }
}
