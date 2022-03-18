package com.larksuite.component.openplatform.infra.p1137a.p1138a;

import android.os.Trace;
import android.text.TextUtils;
import android.util.SparseArray;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.foundation.utils.StringUtil;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.larksuite.component.openplatform.core.utils.C25529d;
import com.tt.miniapp.jsbridge.C66240d;
import com.tt.miniapphost.C67475d;
import com.tt.refer.common.meta.AbstractC67796c;
import com.tt.refer.common.meta.base.AbsAppMeta;
import com.tt.refer.common.meta.base.AbsMetaLoadEntity;
import java.util.HashMap;

/* renamed from: com.larksuite.component.openplatform.infra.a.a.a */
public class C25532a<T extends AbsAppMeta, E extends AbsMetaLoadEntity> implements AbstractC67796c<T, E> {

    /* renamed from: a */
    protected String f62161a;

    /* renamed from: b */
    protected String f62162b;

    /* renamed from: c */
    protected String f62163c;

    /* renamed from: d */
    protected String f62164d;

    /* renamed from: e */
    protected String f62165e;

    /* renamed from: f */
    protected String f62166f;

    /* renamed from: g */
    protected SparseArray<T> f62167g = new SparseArray<>();

    /* renamed from: h */
    protected E f62168h;

    /* renamed from: i */
    protected IAppContext f62169i;

    @Override // com.bytedance.ee.lark.infra.sandbox.context.IBaseService
    public IAppContext getAppContext() {
        return this.f62169i;
    }

    @Override // com.tt.refer.common.meta.AbstractC67796c
    /* renamed from: b */
    public HashMap<String, Object> mo88674b() {
        return mo50340a(0);
    }

    @Override // com.tt.refer.common.meta.AbstractC67796c
    /* renamed from: a */
    public T mo88670a() {
        return this.f62167g.get(0);
    }

    @Override // com.bytedance.ee.lark.infra.sandbox.context.IBaseService
    public void release() {
        AppBrandLogger.m52830i("AbsBaseCommonInfoServic", "release....");
    }

    @Override // com.tt.refer.common.meta.AbstractC67796c
    /* renamed from: a */
    public void mo88673a(E e) {
        this.f62168h = e;
    }

    @Override // com.tt.refer.common.meta.AbstractC67796c
    /* renamed from: a */
    public void mo88671a(T t) {
        this.f62167g.put(0, t);
    }

    public C25532a(IAppContext iAppContext) {
        this.f62169i = iAppContext;
    }

    @Override // com.tt.refer.common.meta.AbstractC67796c
    /* renamed from: a */
    public HashMap<String, Object> mo50340a(int i) {
        String str;
        IAppContext iAppContext;
        T t;
        T t2;
        String str2;
        HashMap<String, Object> hashMap = new HashMap<>();
        Trace.beginSection("computeNewContainer");
        String str3 = "1";
        if (TextUtils.isEmpty(this.f62166f)) {
            if (C25529d.m91158c(this.f62169i)) {
                str2 = str3;
            } else {
                str2 = "";
            }
            this.f62166f = str2;
        }
        Trace.endSection();
        Trace.beginSection("computeAppId");
        if (TextUtils.isEmpty(this.f62161a)) {
            if (!TextUtils.isEmpty(this.f62169i.getAppId())) {
                this.f62161a = this.f62169i.getAppId();
            } else {
                E e = this.f62168h;
                if (e != null) {
                    this.f62161a = e.getAppId();
                } else {
                    T t3 = this.f62167g.get(i);
                    if (t3 != null) {
                        this.f62161a = t3.getAppId();
                    }
                }
            }
        }
        Trace.endSection();
        Trace.beginSection("computeIdentifier");
        if (TextUtils.isEmpty(this.f62162b)) {
            if (!TextUtils.isEmpty(this.f62169i.getAppIdentify())) {
                this.f62162b = this.f62169i.getAppIdentify();
            } else {
                E e2 = this.f62168h;
                if (e2 != null) {
                    this.f62162b = e2.getIdentifier();
                } else {
                    T t4 = this.f62167g.get(i);
                    if (t4 != null) {
                        this.f62162b = t4.getIdentifier();
                    }
                }
            }
        }
        Trace.endSection();
        Trace.beginSection("computeAppNameAndVersion");
        if (TextUtils.isEmpty(this.f62163c) && (t2 = this.f62167g.get(i)) != null) {
            this.f62163c = t2.getAppVersion();
        }
        if (TextUtils.isEmpty(this.f62164d) && (t = this.f62167g.get(i)) != null) {
            this.f62164d = t.getCompileVersion();
        }
        Trace.endSection();
        Trace.beginSection("computeAppType");
        if (!((!TextUtils.isEmpty(this.f62165e) && !"unknown".equals(this.f62165e)) || (iAppContext = this.f62169i) == null || iAppContext.getAppType() == null)) {
            this.f62165e = C67475d.m262448a(this.f62169i.getAppType());
        }
        Trace.endSection();
        Trace.beginSection("computeAddParams");
        hashMap.put("new_container", this.f62166f);
        hashMap.put("gadget_is_ssb", Boolean.valueOf(C25529d.m91167h(this.f62169i)));
        if (!C66240d.m259242a()) {
            str3 = "0";
        }
        hashMap.put("is_falcon_js_engine", str3);
        hashMap.put("app_id", StringUtil.f34171a.mo48349a(this.f62161a));
        if (TextUtils.isEmpty(this.f62161a)) {
            str = "none";
        } else {
            str = this.f62161a;
        }
        hashMap.put("application_id", str);
        hashMap.put("app_version", StringUtil.f34171a.mo48349a(this.f62163c));
        hashMap.put("compile_version", StringUtil.f34171a.mo48349a(this.f62164d));
        hashMap.put("identifier", StringUtil.f34171a.mo48349a(this.f62162b));
        hashMap.put("app_type", StringUtil.f34171a.mo48349a(this.f62165e));
        hashMap.put("solution_id", "none");
        hashMap.put("scene_type", "none");
        Trace.endSection();
        return hashMap;
    }

    @Override // com.tt.refer.common.meta.AbstractC67796c
    /* renamed from: a */
    public void mo88672a(T t, int i) {
        this.f62167g.put(i, t);
    }
}
