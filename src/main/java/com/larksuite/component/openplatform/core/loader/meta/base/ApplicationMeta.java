package com.larksuite.component.openplatform.core.loader.meta.base;

import com.google.gson.annotations.SerializedName;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;
import java.util.Map;

public class ApplicationMeta {

    /* renamed from: a */
    private String f60520a;

    /* renamed from: b */
    private String f60521b;

    /* renamed from: c */
    private String f60522c;

    /* renamed from: d */
    private String f60523d;

    /* renamed from: e */
    private Map<String, C24549a> f60524e;
    @SerializedName("useOpenSchemaWhiteList")

    /* renamed from: f */
    private boolean f60525f;
    @SerializedName("openSchemaWhiteList")

    /* renamed from: g */
    private List<C24550b> f60526g;

    @Retention(RetentionPolicy.SOURCE)
    public @interface ExtensionType {
    }

    /* renamed from: com.larksuite.component.openplatform.core.loader.meta.base.ApplicationMeta$a */
    public static class C24549a {
        @SerializedName("extension_id")

        /* renamed from: a */
        private String f60527a;
        @SerializedName("meta")

        /* renamed from: b */
        private String f60528b;
        @SerializedName(HiAnalyticsConstant.HaKey.BI_KEY_VERSION)

        /* renamed from: c */
        private String f60529c;
        @SerializedName("extension_type")

        /* renamed from: d */
        private String f60530d;
        @SerializedName("basic_lib_version")

        /* renamed from: e */
        private String f60531e;

        /* renamed from: a */
        public String mo87482a() {
            return this.f60531e;
        }

        /* renamed from: b */
        public String mo87483b() {
            return this.f60529c;
        }

        /* renamed from: c */
        public String mo87484c() {
            return this.f60527a;
        }

        /* renamed from: d */
        public String mo87485d() {
            return this.f60528b;
        }

        /* renamed from: e */
        public String mo87486e() {
            return this.f60530d;
        }
    }

    /* renamed from: com.larksuite.component.openplatform.core.loader.meta.base.ApplicationMeta$b */
    public static class C24550b {
        @SerializedName("host")

        /* renamed from: a */
        private String f60532a;
        @SerializedName("schema")

        /* renamed from: b */
        private String f60533b;

        /* renamed from: a */
        public String mo87487a() {
            return this.f60532a;
        }

        /* renamed from: b */
        public String mo87489b() {
            return this.f60533b;
        }

        /* renamed from: a */
        public void mo87488a(String str) {
            this.f60532a = str;
        }

        /* renamed from: b */
        public void mo87490b(String str) {
            this.f60533b = str;
        }
    }

    /* renamed from: a */
    public String mo87468a() {
        return this.f60520a;
    }

    /* renamed from: b */
    public String mo87473b() {
        return this.f60521b;
    }

    /* renamed from: c */
    public String mo87475c() {
        return this.f60522c;
    }

    /* renamed from: d */
    public String mo87477d() {
        return this.f60523d;
    }

    /* renamed from: e */
    public Map<String, C24549a> mo87479e() {
        return this.f60524e;
    }

    /* renamed from: f */
    public List<C24550b> mo87480f() {
        return this.f60526g;
    }

    /* renamed from: g */
    public boolean mo87481g() {
        return this.f60525f;
    }

    /* renamed from: a */
    public void mo87469a(String str) {
        this.f60520a = str;
    }

    /* renamed from: b */
    public void mo87474b(String str) {
        this.f60521b = str;
    }

    /* renamed from: c */
    public void mo87476c(String str) {
        this.f60522c = str;
    }

    /* renamed from: d */
    public void mo87478d(String str) {
        this.f60523d = str;
    }

    /* renamed from: a */
    public void mo87470a(List<C24550b> list) {
        this.f60526g = list;
    }

    /* renamed from: a */
    public void mo87471a(Map<String, C24549a> map) {
        this.f60524e = map;
    }

    /* renamed from: a */
    public void mo87472a(boolean z) {
        this.f60525f = z;
    }
}
