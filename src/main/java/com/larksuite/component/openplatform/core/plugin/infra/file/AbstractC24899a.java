package com.larksuite.component.openplatform.core.plugin.infra.file;

import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.tt.frontendapiinterface.ApiCallResultHelper;
import com.tt.refer.p3400a.p3401a.AbstractC67709b;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.larksuite.component.openplatform.core.plugin.infra.file.a */
public abstract class AbstractC24899a<I, O> {

    /* renamed from: a */
    protected String f61047a;

    /* renamed from: b */
    protected I f61048b;

    /* renamed from: c */
    protected Map<String, C24900a> f61049c = new HashMap();

    /* renamed from: d */
    protected String f61050d;

    /* renamed from: e */
    protected HashMap<String, Object> f61051e;

    /* renamed from: f */
    protected IAppContext f61052f;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract O mo87966a(Throwable th);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo87972a(I i) throws Exception;

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract boolean mo87976b() throws Exception;

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract O mo87979c();

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract O mo87981d();

    /* renamed from: com.larksuite.component.openplatform.core.plugin.infra.file.a$a */
    protected class C24900a<T> {

        /* renamed from: a */
        T f61053a;

        /* renamed from: b */
        boolean f61054b;

        /* renamed from: a */
        public T mo87985a() {
            return this.f61053a;
        }

        public C24900a(T t, boolean z) {
            this.f61053a = t;
            this.f61054b = z;
        }
    }

    /* renamed from: a */
    public IAppContext mo87965a() {
        return this.f61052f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public AbstractC67709b mo87983e() {
        return (AbstractC67709b) mo87965a().findServiceByInterface(AbstractC67709b.class);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public AbstractC67709b.AbstractC67710a mo87984f() {
        return (AbstractC67709b.AbstractC67710a) mo87983e().mo235130i();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public String mo87975b(String... strArr) {
        return ApiCallResultHelper.generateNoSuchFileInfo(strArr);
    }

    public AbstractC24899a(String str) {
        this.f61047a = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public boolean mo87977b(File file) {
        return mo87984f().mo235035a(file);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public String mo87980c(String str) {
        if (!TextUtils.isEmpty(str)) {
            return str.trim();
        }
        return str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public String mo87982d(String str) {
        return mo87984f().mo235044c(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String mo87970a(String... strArr) {
        return ApiCallResultHelper.generateFilePermissionDenyInfo(strArr);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String mo87967a(String str) {
        C24900a aVar = this.f61049c.get(str);
        if (aVar == null) {
            return "";
        }
        Object a = aVar.mo87985a();
        if (a instanceof String) {
            return (String) a;
        }
        throw new ClassCastException("key:" + str);
    }

    /* renamed from: b */
    public O mo87974b(I i) {
        this.f61048b = i;
        try {
            mo87972a((Object) i);
            if (mo87976b()) {
                return mo87979c();
            }
            return mo87981d();
        } catch (Exception e) {
            AppBrandLogger.m52829e("AbsFileCtrl", e);
            return mo87966a((Throwable) e);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public boolean mo87978b(String str) {
        C24900a aVar = this.f61049c.get(str);
        if (aVar == null) {
            return false;
        }
        Object a = aVar.mo87985a();
        if (a instanceof Boolean) {
            return ((Boolean) a).booleanValue();
        }
        throw new ClassCastException("key:" + str);
    }

    /* renamed from: a */
    public void mo87971a(IAppContext iAppContext) {
        this.f61052f = iAppContext;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo87973a(File file) {
        return mo87984f().mo235046c(file);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String mo87969a(String str, Object... objArr) {
        return String.format(str, objArr);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String mo87968a(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str3)) {
            return str + ":" + str2;
        }
        return str + ":" + str2 + " " + str3;
    }
}
