package com.ss.android.lark.platform.dybrid;

import com.larksuite.component.webview.container.p1169a.AbstractC25820a;
import com.larksuite.component.webview.container.p1169a.C25821b;
import com.ss.android.lark.biz.core.api.UrlParams;
import com.ss.android.lark.passport.infra.service.ServiceFinder;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0002J\u0010\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\tJ\b\u0010\n\u001a\u00020\u0006H\u0002J\b\u0010\u000b\u001a\u00020\u0006H\u0002J\u0006\u0010\f\u001a\u00020\u0006R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/platform/dybrid/OpenKAUrlChecker;", "", "()V", "FEATURE_KEY_WEBVIEW_DISALLOW_MAIN_PROCESS_RUN", "", "baseCheckerIsReady", "", "canRunInMainProcess", "params", "Lcom/ss/android/lark/biz/core/api/UrlParams;", "disAllowMainProcessRun", "isSSOLoginType", "shouldInterceptOverrideUrlLoading", "core-integrator_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.platform.j.b */
public final class OpenKAUrlChecker {

    /* renamed from: a */
    public static final OpenKAUrlChecker f128776a = new OpenKAUrlChecker();

    private OpenKAUrlChecker() {
    }

    /* renamed from: a */
    public final boolean mo177950a() {
        if (!m200888b()) {
        }
        return false;
    }

    /* renamed from: b */
    private final boolean m200888b() {
        if (!m200889c() && m200890d()) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    private final boolean m200889c() {
        boolean z;
        AbstractC25820a a = C25821b.m93347a();
        if (a != null) {
            z = a.mo91848a("lark.browser.webview.main.process.run");
        } else {
            z = true;
        }
        if (z) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    private final boolean m200890d() {
        if (Intrinsics.areEqual("SSO", ServiceFinder.m193752g().getLoginTypeChannel())) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final boolean mo177951a(UrlParams urlParams) {
        if (m200888b() && urlParams != null) {
            return urlParams.f73905o;
        }
        return false;
    }
}
