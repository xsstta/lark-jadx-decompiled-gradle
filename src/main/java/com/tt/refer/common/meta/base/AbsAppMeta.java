package com.tt.refer.common.meta.base;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;

public abstract class AbsAppMeta {
    protected String appId;
    protected String appVersion;
    protected C67793a authData = new C67793a();
    protected C67794b bizData = new C67794b();
    protected String compileVersion;
    protected String icon;
    protected String identifier;
    protected String name;
    protected C67795c packageData = new C67795c();

    @Retention(RetentionPolicy.SOURCE)
    public @interface MetaSource {
    }

    /* renamed from: com.tt.refer.common.meta.base.AbsAppMeta$a */
    protected static class C67793a {
        protected C67793a() {
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: com.tt.refer.common.meta.base.AbsAppMeta$b */
    public static class C67794b {

        /* renamed from: f */
        public String f170753f;

        /* renamed from: g */
        public int f170754g;

        protected C67794b() {
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: com.tt.refer.common.meta.base.AbsAppMeta$c */
    public static class C67795c {

        /* renamed from: a */
        public List<String> f170755a;

        /* renamed from: b */
        public String f170756b;

        protected C67795c() {
        }
    }

    public String getAppId() {
        return this.appId;
    }

    public String getAppVersion() {
        return this.appVersion;
    }

    public String getCompileVersion() {
        return this.compileVersion;
    }

    public String getIcon() {
        return this.icon;
    }

    public String getIdentifier() {
        return this.identifier;
    }

    public String getName() {
        return this.name;
    }

    public int getMetaSource() {
        return this.bizData.f170754g;
    }

    public String getVersionType() {
        return this.bizData.f170753f;
    }

    public void setAppId(String str) {
        this.appId = str;
    }

    public void setAppVersion(String str) {
        this.appVersion = str;
    }

    public void setCompileVersion(String str) {
        this.compileVersion = str;
    }

    public void setIcon(String str) {
        this.icon = str;
    }

    public void setIdentifier(String str) {
        this.identifier = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setMetaSource(int i) {
        this.bizData.f170754g = i;
    }

    public void setVersionType(String str) {
        this.bizData.f170753f = str;
    }
}
