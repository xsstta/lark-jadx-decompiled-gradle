package com.bytedance.ee.lark.infra.cookie;

import android.text.TextUtils;
import com.bytedance.ee.lark.infra.cookie.p619d.C12761a;
import com.bytedance.ee.lark.infra.cookie.p620e.C12765b;
import com.bytedance.ee.lark.infra.foundation.utils.IMonitorCreator;
import com.bytedance.ee.lark.infra.foundation.utils.StringUtil;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.ss.android.lark.opmonitor.service.OPMonitor;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Cookie;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u001f\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0016J0\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0012\u001a\u00020\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\n\u0010\u0017\u001a\u00060\u0018j\u0002`\u0019H\u0016J\u0006\u0010\u001a\u001a\u00020\u001bJ\b\u0010\u001c\u001a\u00020\u001bH\u0002J\u0018\u0010\u001d\u001a\u00020\u001e2\u000e\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010 H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\u0001X\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006!"}, d2 = {"Lcom/bytedance/ee/lark/infra/cookie/AppCookiePersistentWrapper;", "Lcom/bytedance/ee/lark/infra/cookie/CommonCookiePersistentWrapper;", "appContext", "Lcom/bytedance/ee/lark/infra/sandbox/context/IAppContext;", "(Lcom/bytedance/ee/lark/infra/sandbox/context/IAppContext;)V", "getAppContext", "()Lcom/bytedance/ee/lark/infra/sandbox/context/IAppContext;", "commonCookiePersistentWrapper", "monitorCreator", "Lcom/bytedance/ee/lark/infra/foundation/utils/IMonitorCreator;", "getMonitorCreator", "()Lcom/bytedance/ee/lark/infra/foundation/utils/IMonitorCreator;", "setMonitorCreator", "(Lcom/bytedance/ee/lark/infra/foundation/utils/IMonitorCreator;)V", "loadAll", "", "Lokhttp3/Cookie;", "loadForRequest", "url", "Lokhttp3/HttpUrl;", "excludeCookies", "", "", "debugInfo", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "needReadOldCookie", "", "needWriteOldCookie", "saveAll", "", "cookies", "", "ECOInfra_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.bytedance.ee.lark.infra.cookie.b */
public final class AppCookiePersistentWrapper extends CommonCookiePersistentWrapper {

    /* renamed from: b */
    private final CommonCookiePersistentWrapper f34130b;

    /* renamed from: c */
    private IMonitorCreator f34131c;

    /* renamed from: d */
    private final IAppContext f34132d;

    @Override // com.bytedance.ee.lark.infra.cookie.CommonCookiePersistentWrapper, com.bytedance.ee.lark.infra.cookie.persistence.AbstractC12770a
    /* renamed from: a */
    public List<Cookie> mo48275a() {
        this.f34130b.mo48275a();
        return super.mo48275a();
    }

    /* renamed from: d */
    private final boolean m52764d() {
        C12765b a = C12765b.m52782a();
        Intrinsics.checkExpressionValueIsNotNull(a, "CookieIsolateSettingHandler.get()");
        C12765b.C12767a b = a.mo48283b();
        Intrinsics.checkExpressionValueIsNotNull(b, "CookieIsolateSettingHand…get().cookieIsolateConfig");
        int a2 = b.mo48285a();
        if (a2 == 0 || a2 == 2) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final boolean mo48279b() {
        C12765b a = C12765b.m52782a();
        Intrinsics.checkExpressionValueIsNotNull(a, "CookieIsolateSettingHandler.get()");
        C12765b.C12767a b = a.mo48283b();
        Intrinsics.checkExpressionValueIsNotNull(b, "CookieIsolateSettingHand…get().cookieIsolateConfig");
        if (b.mo48285a() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo48277a(IMonitorCreator iMonitorCreator) {
        this.f34131c = iMonitorCreator;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AppCookiePersistentWrapper(com.bytedance.ee.lark.infra.sandbox.context.IAppContext r6) {
        /*
            r5 = this;
            java.lang.String r0 = "appContext"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r6, r0)
            android.content.Context r0 = r6.getApplicationContext()
            java.lang.String r1 = "appContext.applicationContext"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            com.bytedance.ee.lark.infra.cookie.a.c r2 = new com.bytedance.ee.lark.infra.cookie.a.c
            r2.<init>()
            com.bytedance.ee.lark.infra.cookie.a.a r2 = (com.bytedance.ee.lark.infra.cookie.p616a.AbstractC12754a) r2
            com.bytedance.ee.lark.infra.cookie.persistence.c r3 = new com.bytedance.ee.lark.infra.cookie.persistence.c
            android.content.Context r4 = r6.getApplicationContext()
            r3.<init>(r4, r6)
            com.bytedance.ee.lark.infra.cookie.persistence.a r3 = (com.bytedance.ee.lark.infra.cookie.persistence.AbstractC12770a) r3
            r5.<init>(r0, r2, r3)
            r5.f34132d = r6
            com.bytedance.ee.lark.infra.cookie.c r0 = new com.bytedance.ee.lark.infra.cookie.c
            android.content.Context r6 = r6.getApplicationContext()
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r6, r1)
            r0.<init>(r6)
            r5.f34130b = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.lark.infra.cookie.AppCookiePersistentWrapper.<init>(com.bytedance.ee.lark.infra.sandbox.context.IAppContext):void");
    }

    @Override // com.bytedance.ee.lark.infra.cookie.CommonCookiePersistentWrapper, com.bytedance.ee.lark.infra.cookie.persistence.AbstractC12770a
    /* renamed from: a */
    public void mo48278a(Collection<Cookie> collection) {
        String str;
        IMonitorCreator iMonitorCreator;
        String str2;
        super.mo48278a(collection);
        if (m52764d()) {
            this.f34130b.mo48278a(collection);
        }
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        String str3 = "";
        if (collection == null || !(!collection.isEmpty())) {
            str = str3;
        } else {
            str = str3;
            for (T t : collection) {
                if (TextUtils.isEmpty(str)) {
                    str = t.domain();
                    Intrinsics.checkExpressionValueIsNotNull(str, "it.domain()");
                }
                String name = t.name();
                if (name == null || (str2 = StringUtil.m52869a(name, 0, 0, null, 7, null)) == null) {
                    str2 = "null";
                }
                sb.append(str2);
                sb.append(" ");
            }
        }
        if (sb.length() <= 0) {
            z = false;
        }
        if (z && (iMonitorCreator = this.f34131c) != null) {
            OPMonitor createOPMonitor = iMonitorCreator.createOPMonitor("op_common_cookie_sync", C12761a.f34144b);
            Intrinsics.checkExpressionValueIsNotNull(createOPMonitor, "it.createOPMonitor(\n    …orCodes.WRITE_APP_COOKIE)");
            if (str != null) {
                str3 = str;
            }
            OPMonitor addCategoryValue = createOPMonitor.addCategoryValue("url_domain", str3);
            C12765b a = C12765b.m52782a();
            Intrinsics.checkExpressionValueIsNotNull(a, "CookieIsolateSettingHandler.get()");
            C12765b.C12767a b = a.mo48283b();
            Intrinsics.checkExpressionValueIsNotNull(b, "CookieIsolateSettingHand…get().cookieIsolateConfig");
            addCategoryValue.addCategoryValue("mode", Integer.valueOf(b.mo48285a())).addCategoryValue("names", sb.toString()).addCategoryValue("app_id", this.f34132d.getAppId()).flush();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0158, code lost:
        if (r2 != false) goto L_0x015a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x01c0, code lost:
        if (r15 != false) goto L_0x01c2;
     */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x01af  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x01b1  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x01b4  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x01c6  */
    @Override // com.bytedance.ee.lark.infra.cookie.CommonCookiePersistentWrapper
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List<okhttp3.Cookie> mo48276a(okhttp3.HttpUrl r25, java.util.Set<java.lang.String> r26, java.lang.StringBuilder r27) {
        /*
        // Method dump skipped, instructions count: 563
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.lark.infra.cookie.AppCookiePersistentWrapper.mo48276a(okhttp3.HttpUrl, java.util.Set, java.lang.StringBuilder):java.util.List");
    }
}
