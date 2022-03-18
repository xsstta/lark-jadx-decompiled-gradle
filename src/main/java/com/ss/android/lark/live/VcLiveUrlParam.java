package com.ss.android.lark.live;

import android.net.Uri;
import android.text.TextUtils;
import java.io.Serializable;
import java.math.BigInteger;

public class VcLiveUrlParam implements Serializable {
    private String mBaseUrl;
    private String mLiveId;
    private int mSource;
    private String mTitle;
    private String mUrl;

    public @interface LiveUrlParamSource {
    }

    private VcLiveUrlParam() {
    }

    public String getBaseUrl() {
        return this.mBaseUrl;
    }

    public String getLiveId() {
        return this.mLiveId;
    }

    public int source() {
        return this.mSource;
    }

    public String url() {
        return this.mUrl;
    }

    public static C41473a newBuilder() {
        return new C41473a();
    }

    /* renamed from: com.ss.android.lark.live.VcLiveUrlParam$a */
    public static class C41473a {

        /* renamed from: a */
        public String f105441a;

        /* renamed from: b */
        public String f105442b;

        /* renamed from: c */
        public int f105443c;

        /* renamed from: a */
        public VcLiveUrlParam mo149272a() {
            return new VcLiveUrlParam(this);
        }

        /* renamed from: a */
        public C41473a mo149270a(int i) {
            this.f105443c = i;
            return this;
        }

        /* renamed from: a */
        public C41473a mo149271a(String str) {
            this.f105442b = str;
            return this;
        }
    }

    public VcLiveUrlParam(C41473a aVar) {
        this.mTitle = aVar.f105441a;
        this.mUrl = aVar.f105442b;
        this.mSource = aVar.f105443c;
        this.mLiveId = parserLiveId(this.mUrl);
        this.mBaseUrl = parseBaseUrl(this.mUrl);
    }

    private static String parseBaseUrl(String str) {
        try {
            Uri parse = Uri.parse(str);
            String host = parse.getHost();
            String scheme = parse.getScheme();
            if (TextUtils.isEmpty(host) || TextUtils.isEmpty(scheme)) {
                return null;
            }
            return String.format("%s://%s", scheme, host);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    private static String parserLiveId(String str) {
        try {
            String path = Uri.parse(str).getPath();
            if (TextUtils.isEmpty(path) || !path.startsWith("/s/")) {
                return null;
            }
            return new BigInteger(path.substring(3, path.length()), 36).toString();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
