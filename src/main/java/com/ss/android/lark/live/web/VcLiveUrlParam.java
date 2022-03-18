package com.ss.android.lark.live.web;

import java.io.Serializable;

public class VcLiveUrlParam implements Serializable {
    private int mSource;
    private String mTitle;
    private String mUrl;

    public @interface LiveUrlParamSource {
    }

    /* renamed from: com.ss.android.lark.live.web.VcLiveUrlParam$a */
    public static class C41526a {

        /* renamed from: a */
        public String f105565a;

        /* renamed from: b */
        public String f105566b;

        /* renamed from: c */
        public int f105567c;
    }

    private VcLiveUrlParam() {
    }

    public int source() {
        return this.mSource;
    }

    public String url() {
        return this.mUrl;
    }

    public static C41526a newBuilder() {
        return new C41526a();
    }

    public VcLiveUrlParam(C41526a aVar) {
        this.mTitle = aVar.f105565a;
        this.mUrl = aVar.f105566b;
        this.mSource = aVar.f105567c;
    }
}
