package com.ss.android.lark.browser.biz.p1413a;

import android.content.Context;
import android.text.TextUtils;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.framework.utils.aq;
import com.ss.android.lark.browser.C29638a;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.openapi.jsapi.AbstractC48760b;
import com.ss.android.lark.openapi.jsapi.AbstractC48761c;
import com.ss.android.lark.openapi.jsapi.AbstractC48762d;
import com.ss.android.lark.openapi.permission.bean.C48768a;
import java.util.List;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* renamed from: com.ss.android.lark.browser.biz.a.a */
public class C29642a implements AbstractC48762d {
    @Override // com.ss.android.lark.openapi.jsapi.AbstractC48762d
    /* renamed from: a */
    public boolean mo50753a() {
        return true;
    }

    /* renamed from: c */
    private boolean m109711c(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        for (String str2 : C29643b.m109717b()) {
            if (str.equalsIgnoreCase(str2)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    private boolean m109710b(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        List<String> c = C29638a.m109622a().getManisDependency().mo107703c();
        if (!CollectionUtils.isEmpty(c)) {
            for (String str2 : c) {
                if (str.equalsIgnoreCase(str2)) {
                    Log.m165379d("MessengerPermissionChecker", "hitJSAPIWhiteList(), hit: " + str2);
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public boolean mo106872a(String str) {
        if (TextUtils.isEmpty(str)) {
            Log.m165383e("MessengerPermissionChecker", "checkPermissionByHost but host is empty.");
            return false;
        }
        List<String> b = C29638a.m109622a().getManisDependency().mo107699b();
        try {
            if (!CollectionUtils.isEmpty(b)) {
                for (String str2 : b) {
                    Log.m165379d("MessengerPermissionChecker", "hitSecLinkWhiteList: apiList" + str2);
                    if (Pattern.compile(str2).matcher(str).matches()) {
                        Log.m165379d("MessengerPermissionChecker", "hitSecLinkWhiteList(), hit: " + str);
                        return true;
                    }
                }
                return false;
            }
            Log.m165383e("MessengerPermissionChecker", "hitSecLinkWhiteList: apiList is null");
            return false;
        } catch (PatternSyntaxException e) {
            Log.m165391i("MessengerPermissionChecker", e);
        } catch (UnsupportedOperationException e2) {
            Log.m165391i("MessengerPermissionChecker", e2);
        } catch (IllegalArgumentException e3) {
            Log.m165391i("MessengerPermissionChecker", e3);
        } catch (Exception e4) {
            Log.m165391i("MessengerPermissionChecker", e4);
        }
    }

    @Override // com.ss.android.lark.openapi.jsapi.AbstractC48762d
    /* renamed from: a */
    public AbstractC48760b mo50752a(Context context, AbstractC48761c cVar, String str, String str2) {
        if (!mo50753a()) {
            return C48768a.m192107a();
        }
        String b = aq.m95059b(str2);
        if (m109711c(b)) {
            return C48768a.m192107a();
        }
        if (mo106872a(b)) {
            return C48768a.m192107a();
        }
        if (m109710b(str)) {
            return C48768a.m192107a();
        }
        Log.m165383e("MessengerPermissionChecker", "checkPermission failed, url: " + str2 + " , api: " + str);
        return C48768a.m192108a(-1, str + " has no permission");
    }
}
