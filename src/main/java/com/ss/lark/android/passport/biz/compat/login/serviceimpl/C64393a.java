package com.ss.lark.android.passport.biz.compat.login.serviceimpl;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.suite.R;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.passport.infra.config.PassportConfigHelper;
import com.ss.android.lark.passport.infra.log.PassportLog;
import com.ss.android.lark.passport.signinsdk_api.base.AbstractC49347c;
import com.ss.android.lark.passport.signinsdk_api.base.p2456b.C49346b;
import com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49394g;
import com.ss.lark.android.passport.biz.compat.login.C64388c;
import com.ss.lark.android.passport.biz.feature.TeamConversionApi;
import com.ss.lark.android.passport.biz.feature.country.CountrySelectActivity;

/* renamed from: com.ss.lark.android.passport.biz.compat.login.serviceimpl.a */
public class C64393a implements AbstractC49394g {

    /* renamed from: com.ss.lark.android.passport.biz.compat.login.serviceimpl.a$a */
    private static class C64394a {

        /* renamed from: a */
        public static final C64393a f162679a = new C64393a();
    }

    /* renamed from: b */
    public static C64393a m253096b() {
        return C64394a.f162679a;
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49394g
    /* renamed from: a */
    public boolean mo172434a() {
        return PassportConfigHelper.m193025g();
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49394g
    /* renamed from: a */
    public boolean mo172435a(Activity activity) {
        if (activity == null || !activity.getClass().getName().startsWith("com.ss.lark.android.signin.v2.featurec")) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49394g
    /* renamed from: a */
    public AbstractC49347c mo172431a(Context context, String str, IGetDataCallback<Boolean> iGetDataCallback) {
        return TeamConversionApi.m254370a(context, PassportLog.f123351c.mo171474a(), str, new C49346b(iGetDataCallback));
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49394g
    /* renamed from: b */
    public boolean mo172436b(Context context, String str, IGetDataCallback<Boolean> iGetDataCallback) {
        return C64388c.m253090a().mo222943a(context, str, new C49346b(iGetDataCallback));
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49394g
    /* renamed from: a */
    public void mo172432a(Activity activity, int i, int i2, int i3, int i4) {
        Intent intent = new Intent(activity, CountrySelectActivity.class);
        intent.putExtra("extra_key_from", i4);
        intent.putExtra("extra_key_exits_anim", i3);
        activity.startActivityForResult(intent, i);
        if (i2 != 0) {
            activity.overridePendingTransition(i2, R.anim.signin_sdk_activity_no_anim);
        }
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49394g
    /* renamed from: a */
    public void mo172433a(Fragment fragment, int i, int i2, int i3, int i4) {
        FragmentActivity activity = fragment.getActivity();
        if (activity != null) {
            Intent intent = new Intent(fragment.getContext(), CountrySelectActivity.class);
            intent.putExtra("extra_key_from", i4);
            intent.putExtra("extra_key_exits_anim", i3);
            activity.startActivityFromFragment(fragment, intent, i);
            if (i2 != 0) {
                activity.overridePendingTransition(i2, R.anim.signin_sdk_activity_no_anim);
                return;
            }
            return;
        }
        Log.m165383e("LoginExServiceImpl", "openCountrySelect()...activity is null");
    }
}
