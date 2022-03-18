package com.ss.android.lark.biz.core.api;

import android.content.Context;
import com.larksuite.framework.callback.AbstractC25974h;
import com.larksuite.framework.callback.IGetDataCallback;

/* renamed from: com.ss.android.lark.biz.core.api.r */
public interface AbstractC29575r {
    /* renamed from: a */
    int mo105826a(String str);

    /* renamed from: a */
    void mo105827a(Context context, String str, String str2, String str3, int i, int i2, String str4, String str5, IGetDataCallback<String> iGetDataCallback, AbstractC25974h hVar);

    /* renamed from: a */
    void mo105828a(Context context, String str, String str2, String str3, int i, String str4, String str5, IGetDataCallback<String> iGetDataCallback, AbstractC25974h hVar);

    /* renamed from: a */
    void mo105829a(Context context, String str, String str2, String str3, IGetDataCallback<String> iGetDataCallback, AbstractC25974h hVar);

    /* renamed from: a */
    void mo105830a(String str, String str2);

    /* renamed from: a */
    void mo105831a(String str, String str2, int i, int i2, IGetDataCallback<FileState> iGetDataCallback);

    /* renamed from: a */
    void mo105832a(String str, String str2, int i, IGetDataCallback<FileState> iGetDataCallback);

    /* renamed from: a */
    void mo105833a(String str, String str2, IGetDataCallback<Boolean> iGetDataCallback);

    /* renamed from: a */
    void mo105834a(String str, String str2, String str3, int i);

    /* renamed from: a */
    void mo105835a(String str, String str2, String str3, int i, IGetDataCallback<Boolean> iGetDataCallback);

    /* renamed from: b */
    String mo105836b(String str);

    /* renamed from: b */
    void mo105837b(Context context, String str, String str2, String str3, int i, int i2, String str4, String str5, IGetDataCallback<String> iGetDataCallback, AbstractC25974h hVar);

    /* renamed from: b */
    void mo105838b(Context context, String str, String str2, String str3, int i, String str4, String str5, IGetDataCallback<String> iGetDataCallback, AbstractC25974h hVar);

    /* renamed from: com.ss.android.lark.biz.core.api.r$a */
    public static class C29576a<T> {

        /* renamed from: a */
        private AbstractC25974h f74010a;

        /* renamed from: b */
        private IGetDataCallback<T> f74011b;

        /* renamed from: c */
        private String f74012c;

        /* renamed from: a */
        public AbstractC25974h mo105839a() {
            return this.f74010a;
        }

        /* renamed from: b */
        public IGetDataCallback<T> mo105840b() {
            return this.f74011b;
        }

        /* renamed from: c */
        public String mo105841c() {
            return this.f74012c;
        }

        public C29576a(AbstractC25974h hVar, IGetDataCallback<T> iGetDataCallback, String str) {
            this.f74010a = hVar;
            this.f74011b = iGetDataCallback;
            this.f74012c = str;
        }
    }

    /* renamed from: com.ss.android.lark.biz.core.api.r$b */
    public static class C29577b {

        /* renamed from: a */
        public String f74013a;

        public C29577b(String str) {
            this.f74013a = str;
        }
    }
}
