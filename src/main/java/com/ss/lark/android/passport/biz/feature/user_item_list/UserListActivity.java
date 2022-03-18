package com.ss.lark.android.passport.biz.feature.user_item_list;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.larksuite.suite.R;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.p2069j.p2070a.C40654u;
import com.ss.android.lark.passport.infra.base.architecture.BaseActivity;
import com.ss.android.lark.passport.infra.base.router.C49087a;
import com.ss.android.lark.passport.infra.base.router.C49092f;
import com.ss.android.lark.passport.infra.base.router.RouterAnno;
import com.ss.android.lark.passport.infra.statistics.StatisticsHelper;
import com.ss.android.lark.passport.infra.watcher.WatcherHelper;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;
import com.ss.lark.android.passport.biz.base.ui.BaseUiContainer;
import com.ss.lark.android.passport.biz.feature.user_item_list.mvp.C65112a;
import com.ss.lark.android.passport.biz.feature.user_item_list.mvp.C65116b;
import com.ss.lark.android.passport.biz.feature.user_item_list.mvp.C65117c;
import com.ss.lark.android.passport.biz.feature.user_item_list.mvp.UserListView;

@RouterAnno(name = "user_list", teaName = "passport_choose_team_view")
public class UserListActivity extends BaseActivity<C65117c> {

    /* renamed from: h */
    private C65112a.AbstractC65113a f163967h;

    /* renamed from: a */
    public Context mo224270a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public void mo170968a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.passport.infra.base.architecture.BaseActivity, androidx.appcompat.app.AppCompatActivity
    public void attachBaseContext(Context context) {
        m255692a(this, context);
    }

    /* renamed from: c */
    public Resources mo170970c() {
        return super.getResources();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m255690a(this, configuration);
    }

    public AssetManager getAssets() {
        return m255694c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m255691a(this);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.passport.infra.base.architecture.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m255693b(this);
    }

    /* renamed from: w */
    public void mo224274w() {
        super.onStop();
    }

    /* renamed from: x */
    public AssetManager mo224275x() {
        return super.getAssets();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C65112a.AbstractC65113a mo170969b() {
        return new C65116b(getIntent());
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.passport.infra.base.architecture.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity
    public void onDestroy() {
        ((C65117c) this.f123050a).cn_();
        super.onDestroy();
    }

    /* renamed from: y */
    private void m255695y() {
        if (this.f163967h == null) {
            this.f163967h = mo170969b();
        }
        this.f123050a = mo224271a(this.f163967h, mo170967a(), C49092f.m193521a());
        ((C65117c) this.f123050a).mo171169a();
    }

    @Override // com.ss.android.lark.passport.infra.base.architecture.BaseActivity
    /* renamed from: j */
    public void mo171138j() {
        if (this.f163967h == null) {
            this.f163967h = mo170969b();
        }
        StatisticsHelper.m193775a(new StatisticsHelper.StatisticsEvent("passport_choose_team_view").mo171607a("is_create_join_show", String.valueOf(UserListStatisticsHelper.m255713a(this.f163967h.mo224295c()))).mo171607a("flow_type", this.f163967h.cz_()));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C65112a.AbstractC65114b mo170967a() {
        return new UserListView(this);
    }

    /* renamed from: a */
    public static Resources m255691a(UserListActivity userListActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(userListActivity);
        }
        return userListActivity.mo170970c();
    }

    /* renamed from: c */
    public static AssetManager m255694c(UserListActivity userListActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(userListActivity);
        }
        return userListActivity.mo224275x();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.ss.android.lark.passport.infra.base.architecture.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        BaseUiContainer.m252995a(this, R.layout.signin_sdk_activity_user_list);
        WatcherHelper.m193664a(this.f123055f, C40654u.f103184g);
        m255695y();
    }

    /* renamed from: b */
    public static void m255693b(UserListActivity userListActivity) {
        userListActivity.mo224274w();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            UserListActivity userListActivity2 = userListActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    userListActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public static void m255692a(UserListActivity userListActivity, Context context) {
        userListActivity.mo170968a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(userListActivity);
        }
    }

    /* renamed from: a */
    public static Context m255690a(UserListActivity userListActivity, Configuration configuration) {
        Context a = userListActivity.mo224270a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C65117c mo224271a(C65112a.AbstractC65113a aVar, C65112a.AbstractC65114b bVar, C49087a aVar2) {
        return new C65117c(this, aVar, bVar, aVar2, this.f123055f, this.f123052c);
    }
}
