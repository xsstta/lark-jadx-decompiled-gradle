package com.ss.android.lark.mail.impl.entity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.lark.mail.impl.entity.h */
public class C42095h {

    /* renamed from: a */
    private List<MailEntSignature> f107089a = new ArrayList();

    /* renamed from: b */
    private List<EntSignatureUsage> f107090b = new ArrayList();

    /* renamed from: c */
    private Map<String, EntOptionalSignature> f107091c = new HashMap();

    /* renamed from: a */
    public List<MailEntSignature> mo151938a() {
        return this.f107089a;
    }

    /* renamed from: b */
    public List<EntSignatureUsage> mo151941b() {
        return this.f107090b;
    }

    /* renamed from: c */
    public Map<String, EntOptionalSignature> mo151943c() {
        return this.f107091c;
    }

    /* renamed from: a */
    public void mo151939a(List<MailEntSignature> list) {
        this.f107089a = list;
    }

    /* renamed from: b */
    public void mo151942b(List<EntSignatureUsage> list) {
        this.f107090b = list;
    }

    /* renamed from: a */
    public void mo151940a(Map<String, EntOptionalSignature> map) {
        this.f107091c = map;
    }
}
