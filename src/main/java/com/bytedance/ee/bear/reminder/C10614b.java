package com.bytedance.ee.bear.reminder;

import com.bytedance.ee.bear.contract.C5234y;
import java.util.HashMap;

/* renamed from: com.bytedance.ee.bear.reminder.b */
public class C10614b {

    /* renamed from: a */
    private String f28524a;

    /* renamed from: b */
    private String f28525b;

    /* renamed from: a */
    public void mo40126a(String str) {
        this.f28524a = str;
    }

    /* renamed from: b */
    public void mo40127b(String str) {
        this.f28525b = str;
    }

    /* renamed from: c */
    public void mo40128c(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("file_id", this.f28524a);
        hashMap.put("file_type", this.f28525b);
        hashMap.put("module", this.f28525b);
        hashMap.put("action", str);
        C5234y.m21391b().mo21079a("client_reminder_operation", hashMap);
    }
}
