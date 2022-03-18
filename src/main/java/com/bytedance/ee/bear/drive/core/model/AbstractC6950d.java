package com.bytedance.ee.bear.drive.core.model;

import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.ee.bear.drive.core.model.d */
public interface AbstractC6950d {
    /* renamed from: a */
    void mo27384a(int i);

    /* renamed from: a */
    void mo27385a(long j);

    /* renamed from: a */
    void mo27386a(C6951a aVar);

    /* renamed from: a */
    void mo27387a(String str);

    /* renamed from: a */
    void mo27388a(List<Integer> list);

    /* renamed from: a */
    void mo27389a(Map<String, String> map);

    /* renamed from: a */
    void mo27390a(boolean z);

    /* renamed from: b */
    void mo27391b(String str);

    /* renamed from: b */
    void mo27392b(boolean z);

    /* renamed from: c */
    void mo27393c(String str);

    /* renamed from: c */
    void mo27394c(boolean z);

    /* renamed from: d */
    void mo27395d(String str);

    /* renamed from: d */
    void mo27396d(boolean z);

    /* renamed from: e */
    void mo27397e(String str);

    /* renamed from: n */
    List<Integer> mo27398n();

    /* renamed from: o */
    C6951a mo27399o();

    /* renamed from: com.bytedance.ee.bear.drive.core.model.d$a */
    public static final class C6951a {

        /* renamed from: a */
        public final int f18798a;

        /* renamed from: b */
        public final String f18799b;

        public String toString() {
            return "PreviewEntity{previewType=" + this.f18798a + ", previewExt='" + this.f18799b + '\'' + '}';
        }

        public C6951a(int i, String str) {
            this.f18798a = i;
            this.f18799b = str;
        }
    }
}
