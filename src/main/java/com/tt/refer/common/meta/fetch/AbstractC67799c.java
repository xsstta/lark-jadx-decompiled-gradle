package com.tt.refer.common.meta.fetch;

import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.network.p622a.p623a.C12805d;
import com.bytedance.ee.lark.infra.network.p628c.p629a.C12827e;
import com.bytedance.ee.lark.infra.network.p628c.p629a.C12830f;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.ss.android.lark.optrace.api.TracingCoreSpan;
import com.tt.miniapp.errorcode.ErrorCode;
import com.tt.miniapp.manager.C66434g;
import com.tt.miniapp.manager.appinfo.C66411c;
import com.tt.miniapphost.AppbrandContext;
import com.tt.refer.common.meta.fetch.C67803g;

/* renamed from: com.tt.refer.common.meta.fetch.c */
public abstract class AbstractC67799c {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract C12827e mo87492a(C67803g<? extends C67803g.AbstractC67804a> gVar);

    /* renamed from: a */
    public <T> C67805h<T> mo235303a(C67803g<? extends C67803g.AbstractC67804a> gVar, AbstractC67802f<T> fVar, IAppContext iAppContext) {
        String str;
        C67805h<T> hVar = new C67805h<>();
        C66411c e = gVar.mo235314e();
        if (e == null || TextUtils.isEmpty(e.f167670c)) {
            hVar.mo235321a(ErrorCode.META.INVALID_TT_CODE.getCode(), ErrorCode.META.INVALID_TT_CODE.getDesc());
            AppBrandLogger.m52829e("app_start_load_meta_request", "ttCode is not Set!");
            return hVar;
        }
        C12827e a = mo87492a(gVar);
        TracingCoreSpan a2 = C12805d.m52895a((TracingCoreSpan) AppbrandContext.getInst().getTracing(), true, iAppContext);
        a.mo48431a(a2);
        hVar.mo235319a(a2);
        C12830f a3 = C66434g.m259707a().mo231984a(a, iAppContext);
        AppBrandLogger.m52830i("app_start_load_meta_request", "doRequest :  url is  ", a.mo48450m(), " & value = ", a3.mo48466d());
        String d = a3.mo48466d();
        if (TextUtils.isEmpty(d) && a3.mo48468f() != null) {
            Throwable f = a3.mo48468f();
            while (f.getCause() != null) {
                f = f.getCause();
            }
            if (f != null) {
                AppBrandLogger.m52829e("app_start_load_meta_request", "meta request error and root cause:", f.getMessage());
                hVar.mo235321a("unknown", "request error: " + f.getMessage());
                return hVar;
            }
        }
        if (fVar != null) {
            try {
                d = fVar.b_(d);
                T b = fVar.mo50346b(d);
                fVar.mo235305a((Object) b);
                hVar.mo235320a((Object) b);
            } catch (MetaException e2) {
                AppBrandLogger.m52829e("app_start_load_meta_request", "getAppMetaFromNet->MetaException: errorCode:", e2.getErrorCode(), "errorMsg:", e2.getErrorMsg());
                String errorCode = e2.getErrorCode();
                if (e2.isServerError()) {
                    str = "meta_server_error:" + e2.getErrorMsg();
                } else {
                    str = e2.getErrorMsg();
                }
                hVar.mo235321a(errorCode, str);
                AppBrandLogger.m52829e("app_start_load_meta_request", "error meta:", d);
            } catch (Exception e3) {
                AppBrandLogger.m52829e("app_start_load_meta_request", "getAppMetaFromNet->Exception", e3.getMessage());
                hVar.mo235321a("unknown", e3.getMessage());
                AppBrandLogger.m52829e("app_start_load_meta_request", "error meta:", d);
            }
        } else {
            hVar.mo235321a(ErrorCode.META.PARSER_NULL.getCode(), ErrorCode.META.PARSER_NULL.getDesc());
            AppBrandLogger.m52829e("app_start_load_meta_request", "meta parser is not set!");
        }
        return hVar;
    }
}
