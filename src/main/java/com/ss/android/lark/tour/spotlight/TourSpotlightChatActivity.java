package com.ss.android.lark.tour.spotlight;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.chatwindow.ChatWindowActivity;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.statistics.tour.TourHitPoint;
import com.ss.android.lark.tour.block.ActionBlockManager;
import com.ss.android.lark.tour.spotlight.TourSpotlightChatActivity;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;

public class TourSpotlightChatActivity extends ChatWindowActivity {

    /* renamed from: a */
    public int f141157a;

    /* renamed from: b */
    private boolean f141158b = true;

    /* renamed from: c */
    private Handler f141159c = new Handler();

    /* renamed from: a */
    public Context mo194396a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public void mo194397a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m222005a(this, context);
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m222003a(this, configuration);
    }

    public AssetManager getAssets() {
        return m222007c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m222004a(this);
    }

    /* renamed from: i */
    public Resources mo194400i() {
        return super.getResources();
    }

    /* renamed from: j */
    public void mo194401j() {
        super.onStop();
    }

    /* renamed from: k */
    public AssetManager mo194402k() {
        return super.getAssets();
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.chatwindow.ChatWindowActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m222006b(this);
    }

    /* renamed from: l */
    private void m222008l() {
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            this.f141157a = extras.getInt("key_chat_type");
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.chatwindow.ChatWindowActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onDestroy() {
        super.onDestroy();
        ActionBlockManager.f141152c.mo194393b(3);
        C29990c.m110930b().mo134583k().mo134724d("key_tour_chat_spotlight");
    }

    /* access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onResume() {
        super.onResume();
        if (this.f141158b) {
            this.f141158b = false;
            RunnableC572971 r0 = new Runnable() {
                /* class com.ss.android.lark.tour.spotlight.TourSpotlightChatActivity.RunnableC572971 */

                public void run() {
                    View a = C57298a.m222015a("keyboard_container");
                    if (a != null) {
                        a.post(new Runnable(a) {
                            /* class com.ss.android.lark.tour.spotlight.$$Lambda$TourSpotlightChatActivity$1$SwTP1BoYrY5KwIcKBm7oIPZ_D0 */
                            public final /* synthetic */ View f$1;

                            {
                                this.f$1 = r2;
                            }

                            public final void run() {
                                TourSpotlightChatActivity.RunnableC572971.this.m222014a(this.f$1);
                            }
                        });
                    }
                }

                /* access modifiers changed from: private */
                /* access modifiers changed from: public */
                /* renamed from: a */
                private /* synthetic */ void m222014a(View view) {
                    if (!TourSpotlightChatActivity.this.isDestroyed()) {
                        C29990c.m110930b().mo134583k().mo134718a(view, TourSpotlightChatActivity.this.f141157a);
                    }
                }
            };
            if (C57298a.m222015a("keyboard_container") != null) {
                r0.run();
            } else {
                this.f141159c.postDelayed(r0, 1000);
            }
            TourHitPoint.f135912a.mo187757a();
        }
    }

    /* renamed from: a */
    public static Resources m222004a(TourSpotlightChatActivity tourSpotlightChatActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(tourSpotlightChatActivity);
        }
        return tourSpotlightChatActivity.mo194400i();
    }

    /* renamed from: c */
    public static AssetManager m222007c(TourSpotlightChatActivity tourSpotlightChatActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(tourSpotlightChatActivity);
        }
        return tourSpotlightChatActivity.mo194402k();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.ss.android.lark.chatwindow.ChatWindowActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        C29990c.m110930b().mo134583k().mo134723c("key_tour_chat_spotlight");
        super.onCreate(bundle);
        m222008l();
        ActionBlockManager.f141152c.mo194390a(3);
    }

    /* renamed from: b */
    public static void m222006b(TourSpotlightChatActivity tourSpotlightChatActivity) {
        tourSpotlightChatActivity.mo194401j();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            TourSpotlightChatActivity tourSpotlightChatActivity2 = tourSpotlightChatActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    tourSpotlightChatActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public static void m222005a(TourSpotlightChatActivity tourSpotlightChatActivity, Context context) {
        tourSpotlightChatActivity.mo194397a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(tourSpotlightChatActivity);
        }
    }

    /* renamed from: a */
    public static Context m222003a(TourSpotlightChatActivity tourSpotlightChatActivity, Configuration configuration) {
        Context a = tourSpotlightChatActivity.mo194396a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}
