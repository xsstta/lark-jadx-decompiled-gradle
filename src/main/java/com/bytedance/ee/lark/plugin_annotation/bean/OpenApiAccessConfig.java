package com.bytedance.ee.lark.plugin_annotation.bean;

import java.io.Serializable;

public class OpenApiAccessConfig implements Serializable {
    public LKOpenApiBizType mBizType;
    public LKOpenApiBizDomain mDomain;
    public boolean mPublicToJS;
    public String mScene;

    private OpenApiAccessConfig() {
    }

    public LKOpenApiBizType getBizType() {
        return this.mBizType;
    }

    public LKOpenApiBizDomain getDomain() {
        return this.mDomain;
    }

    public String getScene() {
        return this.mScene;
    }

    public boolean isPublicToJS() {
        return this.mPublicToJS;
    }

    /* renamed from: com.bytedance.ee.lark.plugin_annotation.bean.OpenApiAccessConfig$a */
    public static final class C12923a {

        /* renamed from: a */
        private LKOpenApiBizDomain f34413a = LKOpenApiBizDomain.OPEN_PLATFORM;

        /* renamed from: b */
        private LKOpenApiBizType f34414b;

        /* renamed from: c */
        private String f34415c = "";

        /* renamed from: d */
        private boolean f34416d = true;

        /* renamed from: a */
        public OpenApiAccessConfig mo48794a() {
            OpenApiAccessConfig openApiAccessConfig = new OpenApiAccessConfig();
            openApiAccessConfig.mDomain = this.f34413a;
            openApiAccessConfig.mPublicToJS = this.f34416d;
            openApiAccessConfig.mScene = this.f34415c;
            openApiAccessConfig.mBizType = this.f34414b;
            return openApiAccessConfig;
        }

        /* renamed from: a */
        public C12923a mo48790a(LKOpenApiBizDomain lKOpenApiBizDomain) {
            this.f34413a = lKOpenApiBizDomain;
            return this;
        }

        /* renamed from: a */
        public C12923a mo48791a(LKOpenApiBizType lKOpenApiBizType) {
            this.f34414b = lKOpenApiBizType;
            return this;
        }

        /* renamed from: a */
        public C12923a mo48792a(String str) {
            this.f34415c = str;
            return this;
        }

        /* renamed from: a */
        public C12923a mo48793a(boolean z) {
            this.f34416d = z;
            return this;
        }
    }

    public String toString() {
        return "LKOpenApiAccessConfig{mDomain=" + this.mDomain + ", mBizType=" + this.mBizType + ", mScene='" + this.mScene + '\'' + ", mPublicToJS=" + this.mPublicToJS + '}';
    }

    public void updateDomain(LKOpenApiBizDomain lKOpenApiBizDomain) {
        this.mDomain = lKOpenApiBizDomain;
    }

    public static OpenApiAccessConfig createOpenApiConfig(LKOpenApiBizDomain lKOpenApiBizDomain, LKOpenApiBizType lKOpenApiBizType, String str, boolean z) {
        return new C12923a().mo48791a(lKOpenApiBizType).mo48790a(lKOpenApiBizDomain).mo48793a(z).mo48792a(str).mo48794a();
    }
}
