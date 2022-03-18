package com.bytedance.ee.lark.infra.cookie.p620e;

import android.text.TextUtils;
import com.bytedance.ee.lark.infra.cookie.p620e.C12765b;
import com.bytedance.ee.lark.infra.foundation.dependency.DependencyMgr;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.bytedance.ee.lark.infra.cookie.e.a */
public class C12763a {

    /* renamed from: a */
    private static Map<String, Integer> f34146a = new ConcurrentHashMap();

    /* renamed from: b */
    private static EnumC12764a f34147b = EnumC12764a.DEFAULT;

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ee.lark.infra.cookie.e.a$a */
    public enum EnumC12764a {
        DEFAULT,
        OPEN,
        CLOSE
    }

    /* renamed from: a */
    public static boolean m52780a() {
        if (f34147b == EnumC12764a.CLOSE) {
            return false;
        }
        if (f34147b == EnumC12764a.OPEN) {
            return true;
        }
        if (DependencyMgr.m52809a().mo48299a("openplatform.gadget.cookie.del")) {
            AppBrandLogger.m52830i("CookieFgSwitch", "fg is true,delete and sync!");
            f34147b = EnumC12764a.OPEN;
            return true;
        }
        f34147b = EnumC12764a.CLOSE;
        AppBrandLogger.m52830i("CookieFgSwitch", "fg is false,not delete and sync!");
        return false;
    }

    /* renamed from: a */
    public static boolean m52781a(String str) {
        int i;
        if (TextUtils.isEmpty(str)) {
            AppBrandLogger.m52829e("CookieFgSwitch", "useCookieIsolate app id is empty!");
            return false;
        }
        Integer num = f34146a.get(str);
        if (num == null) {
            i = -1;
        } else {
            i = num.intValue();
        }
        if (i == 0) {
            return false;
        }
        if (i == 1) {
            return true;
        }
        boolean a = DependencyMgr.m52809a().mo48299a("openplatform.gadget.cookie.isolate");
        C12765b.C12767a b = C12765b.m52782a().mo48283b();
        List<String> b2 = b.mo48288b();
        boolean c = b.mo48289c();
        if (!a) {
            AppBrandLogger.m52830i("CookieFgSwitch", "fg is false,close cookie isolate");
        } else if (c) {
            AppBrandLogger.m52830i("CookieFgSwitch", "fg is true,applyAll is true,open cookie isolate,app id:", str);
            f34146a.put(str, 1);
            return true;
        } else if (b2.contains(str)) {
            AppBrandLogger.m52830i("CookieFgSwitch", "fg is true,app id in white list,open cookie isolate,app id:", str);
            f34146a.put(str, 1);
            return true;
        } else {
            AppBrandLogger.m52830i("CookieFgSwitch", "fg is open app id not in white list,close cookie isolate,app id:", str);
        }
        f34146a.put(str, 0);
        return false;
    }
}
