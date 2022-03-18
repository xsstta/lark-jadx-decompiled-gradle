package com.ss.android.lark.guide.biz.onboarding;

import android.net.Uri;
import android.text.TextUtils;
import com.ss.android.lark.guide.C38548a;
import com.ss.android.lark.guide.biz.p1923c.AbstractC38589a;

/* renamed from: com.ss.android.lark.guide.biz.onboarding.b */
public class C38597b implements AbstractC38589a {
    @Override // com.ss.android.lark.guide.biz.p1923c.AbstractC38589a
    /* renamed from: a */
    public boolean mo141342a(Uri uri) {
        if (uri == null) {
            return false;
        }
        String format = String.format("//%s%s", uri.getHost(), uri.getPath());
        if (TextUtils.equals(format, "//client/guide/onboarding/setteam")) {
            PageOpener.f99148a.mo141346a(C38548a.m152027a().mo141251b(), "update_bot", null);
            return true;
        } else if (TextUtils.equals(format, "//client/guide/new_onboarding_setteam")) {
            String queryParameter = uri.getQueryParameter("from");
            if (TextUtils.equals(queryParameter, "update_bot")) {
                PageOpener.f99148a.mo141346a(C38548a.m152027a().mo141251b(), "update_bot", null);
            } else if (!TextUtils.equals(queryParameter, "banner")) {
                return false;
            } else {
                PageOpener.f99148a.mo141346a(C38548a.m152027a().mo141251b(), "banner", null);
            }
            return true;
        } else if (!TextUtils.equals(format, "//client/guide/create_or_join_team")) {
            return false;
        } else {
            PageOpener.f99148a.mo141345a(C38548a.m152027a().mo141251b(), uri.getQueryParameter("hit_from"));
            return true;
        }
    }
}
