package com.tt.miniapp.p3298k;

import android.text.TextUtils;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.tt.frontendapiinterface.ApiResult;
import com.tt.miniapp.AppbrandApplicationImpl;
import com.tt.miniapphost.C67432a;
import com.tt.miniapphost.entity.AppInfoEntity;
import com.tt.miniapphost.process.C67556a;
import java.util.List;

/* renamed from: com.tt.miniapp.k.h */
public class C66282h {
    /* renamed from: b */
    public static boolean m259344b(IAppContext iAppContext) {
        C66262a a = C66262a.m259263a();
        String str = AppbrandApplicationImpl.getInst(iAppContext).getAppInfo().scene;
        for (String str2 : a.f167246c) {
            if (TextUtils.equals(str2, str)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public static boolean m259345c(IAppContext iAppContext) {
        List<String> h = C67556a.m262951h();
        String str = C67432a.m262319a(iAppContext).getAppInfo().appId;
        if (h == null) {
            return false;
        }
        for (String str2 : h) {
            if (str.contentEquals(str2)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public static ApiResult m259342a(IAppContext iAppContext) {
        AppInfoEntity appInfo = C67432a.m262319a(iAppContext).getAppInfo();
        if (appInfo == null) {
            return ApiResult.fail("common env error");
        }
        if (TextUtils.isEmpty(appInfo.appId)) {
            return ApiResult.fail("get appId error");
        }
        if (appInfo.isBox()) {
            return ApiResult.fail("box app not support");
        }
        if (!C66262a.m259264b()) {
            return ApiResult.fail("favorites function offline");
        }
        if (!C66262a.m259265c()) {
            return ApiResult.fail("favorites function offline");
        }
        if (m259345c(iAppContext)) {
            return ApiResult.fail("had added to favorites list");
        }
        return ApiResult.success();
    }

    /* renamed from: a */
    public static String m259343a(String str, int i) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        if (i < 0) {
            return "";
        }
        if (str.length() <= i) {
            return str;
        }
        return str.substring(0, i - 1) + "…";
    }
}
