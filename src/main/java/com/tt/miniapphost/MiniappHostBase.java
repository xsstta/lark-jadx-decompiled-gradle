package com.tt.miniapphost;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSON;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.foundation.schedulers.Action;
import com.bytedance.ee.lark.infra.foundation.schedulers.Function;
import com.bytedance.ee.lark.infra.foundation.schedulers.Observable;
import com.bytedance.ee.lark.infra.foundation.schedulers.Schedulers;
import com.bytedance.ee.lark.infra.foundation.schedulers.Subscriber;
import com.bytedance.ee.lark.infra.sandbox.context.AbstractC12887b;
import com.bytedance.ee.lark.infra.sandbox.context.AbstractC12888c;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.bytedance.ee.ref.impl.host.HostExtensionManager;
import com.bytedance.ee.ref.impl.host.HostInterface;
import com.bytedance.sysoptimizer.BadParcelableCrashOptimizer;
import com.larksuite.component.openplatform.api.AbstractC24361a;
import com.larksuite.component.openplatform.api.AbstractC24365b;
import com.larksuite.component.openplatform.api.AbstractC24367c;
import com.larksuite.component.openplatform.api.entity.C24377a;
import com.larksuite.component.openplatform.api.entity.OPContainerBundle;
import com.larksuite.component.openplatform.api.lifecycle.OPContainerLifecycleEventEnum;
import com.larksuite.component.openplatform.api.p1104c.AbstractC24370c;
import com.larksuite.component.openplatform.core.container.impl.C24491h;
import com.larksuite.component.openplatform.core.p1106a.C24401b;
import com.larksuite.component.openplatform.core.utils.C25529d;
import com.larksuite.component.openplatform.plugins.container.AbstractC25576a;
import com.larksuite.component.universe_design.util.UDUiModeUtils;
import com.larksuite.framework.apiplugin.LKEvent;
import com.larksuite.framework.apiplugin.common.OpenPlatform;
import com.larksuite.suite.R;
import com.ss.android.lark.sdk.C53241h;
import com.tt.frontendapiinterface.ApiHandlerManager;
import com.tt.miniapp.AppbrandApplicationImpl;
import com.tt.miniapp.C66546p;
import com.tt.miniapp.debug.InspectDebugHelper;
import com.tt.miniapp.event.C66036d;
import com.tt.miniapp.manager.C66375a;
import com.tt.miniapp.manager.C66420d;
import com.tt.miniapp.manager.C66452l;
import com.tt.miniapp.p3327s.AbstractC66736a;
import com.tt.miniapp.p3327s.AbstractC66737b;
import com.tt.miniapp.p3327s.AbstractC66738c;
import com.tt.miniapp.process.p3316a.C66612a;
import com.tt.miniapp.shortcut.ShortcutService;
import com.tt.miniapp.titlemenu.DialogC66908d;
import com.tt.miniapp.util.C67018a;
import com.tt.miniapp.util.C67053q;
import com.tt.miniapp.util.C67070z;
import com.tt.miniapp.util.MpTimeLineReporter;
import com.tt.miniapp.util.TimeLogger;
import com.tt.miniapp.view.swipeback.C67224a;
import com.tt.miniapp.view.swipeback.SwipeBackLayout;
import com.tt.miniapphost.data.C67485a;
import com.tt.miniapphost.entity.AppInfoEntity;
import com.tt.miniapphost.entity.C67521a;
import com.tt.miniapphost.host.HostDependManager;
import com.tt.miniapphost.p3362a.p3363a.AbstractC67433a;
import com.tt.miniapphost.p3362a.p3364b.C67440a;
import com.tt.miniapphost.p3362a.p3365c.C67448a;
import com.tt.miniapphost.p3371e.p3372a.C67500a;
import com.tt.miniapphost.p3371e.p3372a.C67501b;
import com.tt.miniapphost.process.C67556a;
import com.tt.miniapphost.process.data.CrossProcessDataEntity;
import com.tt.miniapphost.process.p3375a.C67560a;
import com.tt.miniapphost.process.p3376b.AbstractC67565b;
import com.tt.miniapphost.util.C67590h;
import com.tt.miniapphost.util.MiniAppProcessUtils;
import com.tt.miniapphost.util.ProcessUtil;
import com.tt.miniapphost.util.TimeMeter;
import com.tt.miniapphost.view.BaseActivity;
import com.tt.option.share.ShareInfoModel;
import com.tt.p3256b.AbstractC65679a;
import com.tt.refer.common.base.AppType;
import com.tt.refer.common.util.C67866g;
import java.io.Serializable;
import org.json.JSONException;
import org.json.JSONObject;

public class MiniappHostBase extends BaseActivity implements AbstractC66737b {
    protected String appId;
    protected AbstractC67497e mActivityProxy;
    private AppbrandApplicationImpl mApp;
    private boolean mCurDarkMode;
    private int mDefaultFragmentBackground;
    private volatile boolean mFirstUpdateSnapshot = true;
    private AbstractC24361a mGadgetAppContainer;
    protected AbstractC67433a mGadgetContext;
    private boolean mIsOnActivityStackTop;
    private boolean mNeedUpdateSnapshotWhenOnStart;
    private TimeMeter mOnActivityStartTime;
    public volatile boolean mTriggeredHomeOrRecentApp;
    private int mUiMode;
    public Runnable mUpdateSnapshotRunnable;
    private boolean mUseNewContainer;

    public boolean isInHostStack() {
        return false;
    }

    @Override // com.tt.miniapp.p3327s.AbstractC66737b
    public void mismatchHost() {
    }

    @Override // com.tt.miniapp.p3327s.AbstractC66737b
    public void showNotSupportView(AppInfoEntity appInfoEntity, int i) {
    }

    public AbstractC67497e getActivityProxy() {
        return this.mActivityProxy;
    }

    public int getDefaultFragmentBackground() {
        return this.mDefaultFragmentBackground;
    }

    public boolean isOnActivityStackTop() {
        return this.mIsOnActivityStackTop;
    }

    public boolean isTriggeredHomeOrRecentApp() {
        return this.mTriggeredHomeOrRecentApp;
    }

    @Override // com.tt.miniapp.p3327s.AbstractC66737b
    public void offline() {
        C67070z.m261391a(this, 5, this.mGadgetContext);
    }

    public void updateSnapShotView() {
        updateSnapShotView(false);
    }

    private void startCacheSpecialCrossProcessData() {
        C67866g.m264025a(new Action() {
            /* class com.tt.miniapphost.MiniappHostBase.C674309 */

            @Override // com.bytedance.ee.lark.infra.foundation.schedulers.Action
            public void act() {
                C67556a.m262928a();
                C67556a.m262947d();
                C67556a.m262949f();
                C66612a.m260219a(AppbrandApplicationImpl.getInst(MiniappHostBase.this.mGadgetContext).getAppInfo().appId);
            }
        }, C67554l.m262725b());
    }

    public SwipeBackLayout getSwipeBackLayout() {
        AbstractC67497e eVar = this.mActivityProxy;
        if (eVar != null) {
            return eVar.mo231019l();
        }
        return null;
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onPostResume() {
        super.onPostResume();
        AbstractC67497e eVar = this.mActivityProxy;
        if (eVar != null) {
            eVar.mo231020m();
        }
    }

    public void onUserInteraction() {
        AbstractC67497e eVar = this.mActivityProxy;
        if (eVar != null) {
            eVar.mo232137z();
        }
        super.onUserInteraction();
    }

    public void onUserLeaveHint() {
        AbstractC67497e eVar = this.mActivityProxy;
        if (eVar != null) {
            eVar.mo231024n();
        }
        super.onUserLeaveHint();
    }

    public void clearSwipeBackground() {
        final SwipeBackLayout swipeBackLayout = getSwipeBackLayout();
        if (swipeBackLayout != null && swipeBackLayout.getBackground() != null) {
            C67866g.m264027a(new Runnable() {
                /* class com.tt.miniapphost.MiniappHostBase.RunnableC674298 */

                public void run() {
                    swipeBackLayout.mo233715a(null);
                }
            });
        }
    }

    @Override // androidx.activity.ComponentActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onBackPressed() {
        AppBrandLogger.m52830i("MiniappHostBase", "onBackPressed");
        AbstractC67497e eVar = this.mActivityProxy;
        if (eVar != null) {
            eVar.mo232135x();
        }
    }

    /* access modifiers changed from: protected */
    public void onRestart() {
        super.onRestart();
        AppBrandLogger.m52830i("MiniappHostBase", "onRestart");
        C67448a.m262353a().mo234177a(this.mGadgetContext.mo234165e());
    }

    public boolean swipeBackPriority() {
        AbstractC67497e eVar = this.mActivityProxy;
        if (eVar != null) {
            return eVar.mo232129r();
        }
        if (getSupportFragmentManager().getBackStackEntryCount() <= 1) {
            return true;
        }
        return false;
    }

    public void notifyUpdateSnapShot() {
        boolean c = AppbrandApplicationImpl.getInst(this.mGadgetContext).getForeBackgroundManager().mo231961c();
        AppBrandLogger.m52830i("MiniappHostBase", "notifyUpdateSnapShot isBackground:", Boolean.valueOf(c));
        if (c) {
            clearSwipeBackground();
            this.mNeedUpdateSnapshotWhenOnStart = true;
            return;
        }
        updateSnapShotView();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onPause() {
        super.onPause();
        AppBrandLogger.m52830i("MiniappHostBase", "onPause");
        AbstractC24361a aVar = this.mGadgetAppContainer;
        if (aVar != null) {
            aVar.mo87108a(OPContainerLifecycleEventEnum.ON_HIDE, new Object[0]);
        } else {
            AbstractC67497e eVar = this.mActivityProxy;
            if (eVar != null) {
                eVar.mo231011d();
            }
        }
        this.mIsOnActivityStackTop = false;
        ((ShortcutService) AppbrandApplicationImpl.getInst(this.mGadgetContext).getService(ShortcutService.class)).onActivityPause();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tt.miniapphost.view.BaseActivity
    public void onStart() {
        super.onStart();
        AppBrandLogger.m52830i("MiniappHostBase", "onStart");
        if (this.mActivityProxy instanceof C66546p) {
            if (this.mTriggeredHomeOrRecentApp) {
                updateSnapShotView(true);
            } else if (this.mNeedUpdateSnapshotWhenOnStart) {
                updateSnapShotView();
            }
        }
        getWindow().clearFlags(8192);
        this.mNeedUpdateSnapshotWhenOnStart = false;
        C66452l.m259767a();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        super.onStop();
        AppBrandLogger.m52830i("MiniappHostBase", "onStop");
        AbstractC24361a aVar = this.mGadgetAppContainer;
        if (aVar != null) {
            aVar.mo87108a(OPContainerLifecycleEventEnum.ON_STOP, new Object[0]);
            return;
        }
        AbstractC67497e eVar = this.mActivityProxy;
        if (eVar != null) {
            eVar.mo231003a(this.mOnActivityStartTime);
        }
    }

    /* access modifiers changed from: protected */
    public void setActivityTaskDescription() {
        final AppInfoEntity appInfo = this.mApp.getAppInfo();
        if (appInfo != null && !isInHostStack()) {
            Observable.create(new Function<Bitmap>() {
                /* class com.tt.miniapphost.MiniappHostBase.C674256 */

                /* renamed from: a */
                public Bitmap fun() {
                    if (TextUtils.isEmpty(appInfo.icon)) {
                        return null;
                    }
                    try {
                        byte[] a = C67053q.m261328a(appInfo.icon);
                        if (a == null || a.length <= 0) {
                            return null;
                        }
                        return BitmapFactory.decodeByteArray(a, 0, a.length);
                    } catch (Exception e) {
                        AppBrandLogger.stacktrace(6, "MiniappHostBase", e.getStackTrace());
                        return null;
                    }
                }
            }).schudleOn(Schedulers.longIO()).observeOn(Schedulers.ui()).subscribe(new Subscriber.ResultableSubscriber<Bitmap>() {
                /* class com.tt.miniapphost.MiniappHostBase.C674245 */

                @Override // com.bytedance.ee.lark.infra.foundation.schedulers.Subscriber
                public void onError(Throwable th) {
                    MiniappHostBase.this.setTaskDescription(new ActivityManager.TaskDescription(appInfo.appName));
                }

                /* renamed from: a */
                public void onSuccess(Bitmap bitmap) {
                    if (bitmap != null) {
                        MiniappHostBase.this.setTaskDescription(new ActivityManager.TaskDescription(appInfo.appName, bitmap));
                        return;
                    }
                    onError(new NullPointerException("bitmap == null"));
                }
            });
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity, com.tt.miniapphost.view.BaseActivity
    public void onDestroy() {
        super.onDestroy();
        AppBrandLogger.m52830i("MiniappHostBase", "onDestroy");
        AbstractC24361a aVar = this.mGadgetAppContainer;
        if (aVar != null) {
            aVar.mo87108a(OPContainerLifecycleEventEnum.ON_DESTROY, new Object[0]);
        } else {
            AbstractC67497e eVar = this.mActivityProxy;
            if (eVar != null) {
                eVar.mo231013f();
            }
        }
        if (ProcessUtil.isMiniappProcess()) {
            AbstractC67433a aVar2 = this.mGadgetContext;
            if (aVar2 != null && this.mGadgetAppContainer == null) {
                aVar2.destroy();
            }
            ProcessUtil.killCurrentMiniAppProcess();
            return;
        }
        AbstractC67433a aVar3 = this.mGadgetContext;
        if (aVar3 != null) {
            AppbrandApplicationImpl.getInst(aVar3).finish();
            if (this.mGadgetAppContainer == null) {
                this.mGadgetContext.destroy();
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onResume() {
        super.onResume();
        AppBrandLogger.m52830i("MiniappHostBase", "onResume");
        C67448a.m262353a().mo234177a(this.mGadgetContext.mo234165e());
        C67485a.m262488a(this.mGadgetContext).mo234292m().setAppActivity(this);
        if (AppbrandApplicationImpl.getInst(this.mGadgetContext).getJumToApp()) {
            AppbrandApplicationImpl.getInst(this.mGadgetContext).getAppInfo().scene = HostDependManager.getInst().getScene("back_mp");
        }
        AppbrandApplicationImpl.getInst(this.mGadgetContext).setJumpToApp(false);
        AbstractC24361a aVar = this.mGadgetAppContainer;
        if (aVar != null) {
            aVar.mo87108a(OPContainerLifecycleEventEnum.ON_SHOW, new Object[0]);
        } else if (this.mActivityProxy != null) {
            this.mOnActivityStartTime.start();
            this.mActivityProxy.mo231009c();
        }
        this.mIsOnActivityStackTop = true;
        ((ShortcutService) AppbrandApplicationImpl.getInst(this.mGadgetContext).getService(ShortcutService.class)).onActivityResume(this.mGadgetContext);
    }

    @Override // com.tt.miniapp.p3327s.AbstractC66737b
    public void requestAppInfoSuccess(AppInfoEntity appInfoEntity) {
        setActivityTaskDescription();
    }

    public void setDefaultFragmentBackground(int i) {
        this.mDefaultFragmentBackground = i;
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity, com.tt.miniapphost.view.BaseActivity
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        AppbrandContext.tryKillIfNotInit(context);
    }

    public void onTrimMemory(int i) {
        AbstractC67497e eVar = this.mActivityProxy;
        if (eVar != null) {
            eVar.mo231007b(i);
        }
    }

    public void setSwipeBackEnable(boolean z) {
        AbstractC67497e eVar = this.mActivityProxy;
        if (eVar != null) {
            eVar.mo232118a(z);
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        AbstractC67497e eVar = this.mActivityProxy;
        if (eVar != null) {
            eVar.mo231008b(bundle);
        }
    }

    private void overrideActivityInAnimation(boolean z) {
        if (!z && !this.mGadgetContext.mo234169i()) {
            HostDependManager.getInst().overridePendingTransition(this, R.anim.microapp_i_slide_in_top, R.anim.microapp_i_slide_in_no, 1);
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity
    public View findViewById(int i) {
        AbstractC67497e eVar = this.mActivityProxy;
        if (eVar == null) {
            return super.findViewById(i);
        }
        if (eVar.mo232123e(i) == null) {
            return super.findViewById(i);
        }
        return this.mActivityProxy.mo232123e(i);
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        TimeLogger.getInstance(this.mGadgetContext).logTimeDuration("MiniappHostBase_onRestoreInstanceState");
    }

    private void callLifeCycleOnCreate(Intent intent) {
        AbstractC65679a miniAppLifeCycleInstance = HostDependManager.getInst().getMiniAppLifeCycleInstance(this.mGadgetContext);
        if (miniAppLifeCycleInstance != null) {
            AppBrandLogger.m52830i("MiniappHostBase", "callLifeCycleOnCreate");
            miniAppLifeCycleInstance.mo49082b(intent);
            return;
        }
        AppBrandLogger.m52829e("MiniappHostBase", "miniAppLifeCycleInstance is null");
    }

    private void updateSnapShotView(boolean z) {
        final long j;
        AppBrandLogger.m52830i("MiniappHostBase", "updateSnapShotView");
        final SwipeBackLayout swipeBackLayout = getSwipeBackLayout();
        if (swipeBackLayout == null || !swipeBackLayout.mo233721c()) {
            AppBrandLogger.m52830i("MiniappHostBase", "swipeBackLayout == null || !swipeBackLayout.isEnableGesture()");
        } else if (this.mTriggeredHomeOrRecentApp) {
            AppBrandLogger.m52830i("MiniappHostBase", "updateSnapShotView mTriggeredHomeOrRecentApp");
        } else {
            if (this.mFirstUpdateSnapshot) {
                j = 100;
            } else {
                j = 0;
            }
            this.mFirstUpdateSnapshot = false;
            AppBrandLogger.m52830i("MiniappHostBase", "updateSnapShotView getSnapshot");
            C67556a.m262940a(z, new AbstractC67565b() {
                /* class com.tt.miniapphost.MiniappHostBase.C674267 */

                @Override // com.tt.miniapphost.process.p3376b.AbstractC67565b
                /* renamed from: a */
                public void mo48979a() {
                    AppBrandLogger.m52830i("MiniappHostBase", "updateSnapShotView HostProcessNotExist clearSwipeBackground");
                    MiniappHostBase.this.clearSwipeBackground();
                }

                @Override // com.tt.miniapphost.process.p3376b.AbstractC67565b
                /* renamed from: a */
                public void mo48980a(final CrossProcessDataEntity crossProcessDataEntity) {
                    AppBrandLogger.m52830i("MiniappHostBase", "getSnapshot callback callbackData:", crossProcessDataEntity);
                    mo234711d();
                    C67866g.m264026a(new Action() {
                        /* class com.tt.miniapphost.MiniappHostBase.C674267.C674271 */

                        @Override // com.bytedance.ee.lark.infra.foundation.schedulers.Action
                        public void act() {
                            String str;
                            CrossProcessDataEntity crossProcessDataEntity = crossProcessDataEntity;
                            if (crossProcessDataEntity != null) {
                                str = crossProcessDataEntity.mo234744b("snapshot");
                            } else {
                                str = null;
                            }
                            if (TextUtils.isEmpty(str)) {
                                AppBrandLogger.m52829e("MiniappHostBase", "getSnapshot callback null snapshotFilePath");
                                return;
                            }
                            try {
                                C67866g.m264031b(MiniappHostBase.this.mUpdateSnapshotRunnable);
                                if (!swipeBackLayout.mo233721c()) {
                                    AppBrandLogger.m52830i("MiniappHostBase", "!swipeBackLayout.isEnableGesture() onIpcCallback");
                                    return;
                                }
                                final BitmapDrawable a = C66452l.m259764a(MiniappHostBase.this.getResources(), str);
                                if (a == null) {
                                    AppBrandLogger.m52829e("MiniappHostBase", "getSnapshot snapshotDrawable error");
                                    return;
                                }
                                MiniappHostBase.this.mUpdateSnapshotRunnable = new Runnable() {
                                    /* class com.tt.miniapphost.MiniappHostBase.C674267.C674271.RunnableC674281 */

                                    public void run() {
                                        swipeBackLayout.mo233715a(a);
                                    }
                                };
                                C67866g.m264028a(MiniappHostBase.this.mUpdateSnapshotRunnable, j);
                            } catch (Exception e) {
                                AppBrandLogger.eWithThrowable("MiniappHostBase", "setSnapshotAsBackground", e);
                            }
                        }
                    }, C67554l.m262725b(), false);
                }
            }, this.mGadgetContext);
        }
    }

    public final boolean beforeOnCreate(Bundle bundle) {
        overrideActivityInAnimation(false);
        AppBrandLogger.m52830i("MiniappHostBase", "beforeOnCreate");
        this.mOnActivityStartTime = new TimeMeter();
        Intent intent = getIntent();
        if (intent != null && intent.hasExtra("microapp_url")) {
            return true;
        }
        AppBrandLogger.m52829e("MiniappHostBase", "onCreate fail, intent == ", intent);
        C67070z.m261391a(this, 7, this.mGadgetContext);
        C67224a.f169674a = "others";
        C67224a.f169675b = true;
        C67475d.m262459a((String) null, (String) null, (String) null, (String) null, false, 0L, "fail", "error intent", (IAppContext) this.mGadgetContext);
        return false;
    }

    /* access modifiers changed from: protected */
    public AbstractC67497e createRealActivity(int i) {
        Serializable serializable;
        this.mApp = AppbrandApplicationImpl.getInst(this.mGadgetContext);
        if (!this.mUseNewContainer) {
            return new C66546p(this, null, this.mGadgetContext, this, new AbstractC66738c() {
                /* class com.tt.miniapphost.MiniappHostBase.C674212 */

                @Override // com.tt.miniapp.p3327s.AbstractC66738c
                /* renamed from: a */
                public void mo232569a() {
                }
            }, new AbstractC66736a() {
                /* class com.tt.miniapphost.MiniappHostBase.C674223 */

                @Override // com.tt.miniapp.p3327s.AbstractC66736a
                /* renamed from: a */
                public void mo87356a(View view) {
                    MiniappHostBase.this.setContentView(view);
                }
            });
        }
        AbstractC24367c c = C24401b.m89051c();
        Bundle extras = getIntent().getExtras();
        AppInfoEntity appInfoEntity = (AppInfoEntity) extras.get("microapp_appinfo");
        AbstractC24365b a = c.mo87130a(appInfoEntity.appId);
        extras.putString(C24377a.f60157b, appInfoEntity.appId);
        extras.putSerializable(C24377a.f60160e, AppType.GadgetAPP);
        Bundle bundle = extras.getBundle("mp_launch_extra");
        if (!(bundle == null || (serializable = bundle.getSerializable("api_access_config")) == null)) {
            extras.putSerializable("apiAccessConfig", serializable);
        }
        OPContainerBundle oPContainerBundle = new OPContainerBundle(extras, this);
        oPContainerBundle.mo87147a(new AbstractC24370c() {
            /* class com.tt.miniapphost.MiniappHostBase.C674234 */

            @Override // com.larksuite.component.openplatform.api.p1104c.AbstractC24370c
            /* renamed from: a */
            public void mo49118a() {
            }

            @Override // com.larksuite.component.openplatform.api.p1104c.AbstractC24370c
            /* renamed from: a */
            public void mo49119a(String str, String str2) {
            }

            @Override // com.larksuite.component.openplatform.api.p1104c.AbstractC24370c
            public void ai_() {
            }
        });
        AbstractC24361a a2 = a.mo87126a(oPContainerBundle);
        this.mGadgetAppContainer = a2;
        return ((C24491h) a2).mo87354s();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity, com.tt.miniapphost.view.BaseActivity
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (!TextUtils.isEmpty(C25529d.m91164e(this.mGadgetContext))) {
            boolean a = UDUiModeUtils.m93320a(configuration);
            if (a != this.mCurDarkMode) {
                this.mCurDarkMode = a;
                if (this.mApp.getForeBackgroundManager().mo231961c()) {
                    C67070z.m261391a(this, 12, this.mGadgetContext);
                    AppBrandLogger.m52830i("MiniappHostBase", "dark mode changed : kill silent for : " + this.appId);
                } else {
                    AbstractC67433a aVar = this.mGadgetContext;
                    if (aVar == null) {
                        AppBrandLogger.m52830i("MiniappHostBase", "cur activity is null");
                        return;
                    }
                    AppInfoEntity appInfo = AppbrandApplicationImpl.getInst(aVar).getAppInfo();
                    if (appInfo == null) {
                        AppBrandLogger.m52830i("MiniappHostBase", "cur app info is null");
                        return;
                    } else if (TextUtils.isEmpty(appInfo.appId)) {
                        AppBrandLogger.m52830i("MiniappHostBase", "cur app id is null");
                        return;
                    } else {
                        String schema = AppbrandApplicationImpl.getInst(this.mGadgetContext).getSchema();
                        if (TextUtils.isEmpty(schema)) {
                            AppBrandLogger.m52830i("MiniappHostBase", "cur app schema is null");
                            return;
                        }
                        C66612a.m260227a(appInfo.appId, schema, false);
                        AppBrandLogger.m52830i("MiniappHostBase", "dark mode changed : restart for : " + this.appId);
                    }
                }
            }
        } else {
            boolean a2 = UDUiModeUtils.m93320a(configuration);
            if (a2 != this.mCurDarkMode) {
                AbstractC67497e eVar = this.mActivityProxy;
                if (eVar instanceof C66546p) {
                    this.mCurDarkMode = a2;
                    ((C66546p) eVar).mo232126o();
                    DialogC66908d.m260930a(this.mGadgetContext).dismiss();
                    C67485a.m262488a(this.mGadgetContext).mo234273C();
                }
            }
        }
        AppbrandApplicationImpl.getInst(this.mGadgetContext).notifyConfigurationChange(configuration);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        AppBrandLogger.m52830i("MiniappHostBase", "onNewIntent");
        ((MpTimeLineReporter) AppbrandApplicationImpl.getInst(this.mGadgetContext).getService(MpTimeLineReporter.class)).addPoint("activity_on_create_begin", new MpTimeLineReporter.C67015a().mo233114a("start_type", 2).mo233115a());
        HostInterface hostInterface = HostExtensionManager.getInstance().getHostInterface();
        if (!hostInterface.inspectModeIsOpen() || hostInterface.brandApplicationCanDebug(this.appId)) {
            if (this.mActivityProxy != null) {
                overrideActivityInAnimation(C67018a.m261209a(intent));
                this.mActivityProxy.mo230999a(intent);
            }
            this.mTriggeredHomeOrRecentApp = false;
            this.mNeedUpdateSnapshotWhenOnStart = true;
            return;
        }
        AppBrandLogger.m52830i("MiniappHostBase", "onNewIntent isInspectMode ,appId-" + this.appId + " will be killed");
        MiniAppProcessUtils.killCurrentProcess(AppbrandContext.getInst().getApplicationContext());
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity, com.tt.miniapphost.view.BaseActivity
    public void onCreate(Bundle bundle) {
        int i;
        AbstractC67497e eVar;
        super.onCreate(null);
        if (AppbrandContext.getInst().getApplicationContext() == null) {
            AppBrandLogger.m52829e("MiniappHostBase", "application context is null, do not init.");
            finish();
            return;
        }
        Intent intent = getIntent();
        if (intent != null) {
            i = intent.getIntExtra("app_type", 1);
        } else {
            i = 1;
        }
        String stringExtra = intent.getStringExtra("microapp_url");
        if (TextUtils.isEmpty(stringExtra)) {
            AppBrandLogger.m52829e("MiniappHostBase", "schema is empty, now finish activity");
            new C67500a(C67501b.f170244l, C67448a.m262353a().mo234190i()).setResultTypeFail().setErrorMessage("schema is empty").flush();
            finish();
            return;
        }
        String stringExtra2 = intent.getStringExtra("sandbox_env_name");
        String str = C66375a.m259513a(stringExtra).appId;
        this.appId = str;
        C66612a.m260234b(str, stringExtra2);
        this.mUseNewContainer = C25529d.m91148a(this.appId, "standard");
        AppBrandLogger.m52830i("MiniappHostBase", "useNewContainer:" + this.mUseNewContainer);
        if (this.mUseNewContainer) {
            setContentView(R.layout.mini_activity_gadget_new_container);
        }
        AbstractC12887b a = C67440a.m262344a(AppType.GadgetAPP, this.appId);
        AbstractC67433a b = C67448a.m262353a().mo234181b(a);
        this.mGadgetContext = b;
        if (b == null) {
            this.mGadgetContext = C67448a.m262353a().mo234190i();
        }
        if (!TextUtils.isEmpty(stringExtra2)) {
            this.mGadgetContext.mo234160a(stringExtra2);
        }
        this.mGadgetContext.setCurrentActivity(this);
        C67448a.m262353a().mo234182b(this.mGadgetContext);
        TimeLogger.getInstance(this.mGadgetContext).logTimeDuration("MiniappHostBase_onCreate");
        callLifeCycleOnCreate(getIntent());
        this.mGadgetContext.mo234157a(a);
        C67485a.m262488a(this.mGadgetContext).mo234292m().setAppActivity(this);
        Bundle INVOKEVIRTUAL_com_tt_miniapphost_MiniappHostBase_com_bytedance_sysoptimizer_BadParcelableLancet_getBundleExtra = INVOKEVIRTUAL_com_tt_miniapphost_MiniappHostBase_com_bytedance_sysoptimizer_BadParcelableLancet_getBundleExtra(intent, "mp_launch_extra");
        if (INVOKEVIRTUAL_com_tt_miniapphost_MiniappHostBase_com_bytedance_sysoptimizer_BadParcelableLancet_getBundleExtra != null) {
            boolean z = INVOKEVIRTUAL_com_tt_miniapphost_MiniappHostBase_com_bytedance_sysoptimizer_BadParcelableLancet_getBundleExtra.getBoolean("is_magic_window", false);
            AppBrandLogger.m52830i("MiniappHostBase", "set mini host window type to magic window ；" + z);
            this.mGadgetContext.setInParallelWindow(z);
        }
        this.mActivityProxy = createRealActivity(i);
        if (C25529d.m91166g(this.mGadgetContext)) {
            AbstractC24361a aVar = this.mGadgetAppContainer;
            if (aVar == null) {
                C25529d.m91151b(this.mGadgetContext);
            } else {
                aVar.mo87128a(new AbstractC12888c() {
                    /* class com.tt.miniapphost.$$Lambda$bKW6oWUheZSmQtpmpnOeLumAx_w */

                    @Override // com.bytedance.ee.lark.infra.sandbox.context.AbstractC12888c
                    public final void startActivityForResult(Intent intent, int i) {
                        MiniappHostBase.this.startActivityForResult(intent, i);
                    }
                });
            }
        }
        if (beforeOnCreate(bundle)) {
            AbstractC24361a aVar2 = this.mGadgetAppContainer;
            if (aVar2 != null) {
                aVar2.mo87108a(OPContainerLifecycleEventEnum.ON_CREATE, bundle);
            } else {
                AbstractC67497e eVar2 = this.mActivityProxy;
                if (eVar2 != null) {
                    eVar2.mo231002a(bundle, getIntent().getExtras());
                }
            }
            if (ProcessUtil.isMiniappProcess() || C25529d.m91166g(this.mGadgetContext)) {
                getWindow().setBackgroundDrawable(new ColorDrawable(0));
                getWindow().getDecorView().setBackgroundDrawable(null);
            }
            if (this.mGadgetAppContainer == null && (eVar = this.mActivityProxy) != null) {
                eVar.mo231006b();
            }
            AbstractC24361a aVar3 = this.mGadgetAppContainer;
            if (aVar3 != null) {
                aVar3.mo87107a((FrameLayout) findViewById(R.id.gadget_app_container_root));
            }
        }
        updateSnapShotView();
        AppbrandApplicationImpl.getInst(this.mGadgetContext).getForeBackgroundManager().mo231957a();
        if (!isInHostStack()) {
            AppbrandApplicationImpl.getInst(this.mGadgetContext).getForeBackgroundManager().mo231958a(new C66420d.C66427b() {
                /* class com.tt.miniapphost.MiniappHostBase.C674201 */

                @Override // com.tt.miniapp.manager.C66420d.C66427b, com.tt.miniapp.manager.C66420d.AbstractC66428c
                /* renamed from: d */
                public void mo88043d() {
                    MiniappHostBase.this.mTriggeredHomeOrRecentApp = true;
                    AppbrandApplicationImpl.getInst(MiniappHostBase.this.mGadgetContext).setJumpToApp(false);
                    MiniappHostBase.this.clearSwipeBackground();
                }
            });
        }
        startCacheSpecialCrossProcessData();
        this.mCurDarkMode = UDUiModeUtils.m93319a(this);
        HostInterface hostInterface = HostExtensionManager.getInstance().getHostInterface();
        if (hostInterface.inspectModeIsOpen()) {
            AppBrandLogger.m52830i("MiniappHostBase", "inspectModeIsOpen");
            if (!hostInterface.brandApplicationCanDebug(this.appId)) {
                AppBrandLogger.m52830i("MiniappHostBase", "onCreate isInspectMode ,appId-" + this.appId + " will be killed");
                MiniAppProcessUtils.killCurrentProcess(AppbrandContext.getInst().getApplicationContext());
                return;
            }
            InspectDebugHelper.f166565a.mo230980a(this);
        }
    }

    @Override // com.tt.miniapp.p3327s.AbstractC66737b
    public void requestAppInfoFail(String str, String str2) {
        C67070z.m261391a(this, 3, this.mGadgetContext);
    }

    private void shareResultEvent(String str, String str2) {
        C66036d.m258591a(str2, "inside", str, (String) null, false, (IAppContext) this.mGadgetContext);
    }

    public void onSaveInstanceState(Bundle bundle, PersistableBundle persistableBundle) {
        TimeLogger.getInstance(this.mGadgetContext).logTimeDuration("MiniappHostBase_onSaveInstanceState");
    }

    @Override // androidx.activity.ComponentActivity, androidx.fragment.app.FragmentActivity
    public void startActivityForResult(Intent intent, int i) {
        super.startActivityForResult(intent, i);
        AbstractC67497e eVar = this.mActivityProxy;
        if (eVar != null) {
            eVar.mo231000a(intent, i);
        }
    }

    public static Bundle INVOKEVIRTUAL_com_tt_miniapphost_MiniappHostBase_com_bytedance_sysoptimizer_BadParcelableLancet_getBundleExtra(Intent intent, String str) {
        Bundle bundleExtra = intent.getBundleExtra(str);
        Context context = BadParcelableCrashOptimizer.getContext();
        if (!(bundleExtra == null || context == null)) {
            bundleExtra.setClassLoader(context.getClassLoader());
        }
        return bundleExtra;
    }

    private void sendShareInfoToMainProcess(ShareInfoModel shareInfoModel, C67521a aVar) {
        JSONObject jSONObject;
        if (aVar != null) {
            if (shareInfoModel != null) {
                jSONObject = shareInfoModel.toJson();
            } else {
                jSONObject = new JSONObject();
            }
            CrossProcessDataEntity a = C67560a.m262955a("anchorAction", CrossProcessDataEntity.C67574a.m263013a().mo234760a("anchorAction", (Object) "ADD").mo234760a("anchorShareInfo", (Object) jSONObject.toString()).mo234763b());
            if (aVar.mo234463a() != "ADD") {
                return;
            }
            if (a == null || !a.mo234746d("anchorActionResult")) {
                shareResultEvent("fail", aVar.mo234466d());
                HostDependManager.getInst().showToast(this, null, C67590h.m263073a((int) R.string.microapp_m_anchor_request_share_info_fail), 0, null);
                return;
            }
            shareResultEvent("success", aVar.mo234466d());
            C67224a.f169674a = "anchor_add";
            C67224a.f169675b = false;
            C67070z.m261391a(this, 12, this.mGadgetContext);
        }
    }

    private void updateAnchorBtn(C67521a aVar, Button button) {
        int i;
        int i2;
        ViewGroup.LayoutParams layoutParams = button.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            if (this.mApp.getAppInfo().isLandScape) {
                i2 = R.dimen.microapp_m_anthor_bottom_land;
            } else {
                i2 = R.dimen.microapp_m_anthor_bottom_port;
            }
            marginLayoutParams.bottomMargin = getResources().getDimensionPixelSize(i2);
            button.setLayoutParams(layoutParams);
        }
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(aVar.mo234465c());
        gradientDrawable.setCornerRadius(C67590h.m263065a(this, 27.0f));
        button.setBackground(gradientDrawable);
        button.setText(aVar.mo234464b());
        if ("ADD".equals(aVar.mo234463a()) || "REMOVE".equals(aVar.mo234463a())) {
            button.setVisibility(0);
            if ("ADD".equals(aVar.mo234463a())) {
                i = 2131234522;
            } else {
                i = 2131234523;
            }
            button.setCompoundDrawablesWithIntrinsicBounds(i, 0, 0, 0);
            return;
        }
        button.setVisibility(0);
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ActivityCompat.OnRequestPermissionsResultCallback, androidx.fragment.app.FragmentActivity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        AbstractC24361a aVar = this.mGadgetAppContainer;
        if (aVar != null) {
            aVar.mo87106a(i, strArr, iArr);
            return;
        }
        AbstractC67497e eVar = this.mActivityProxy;
        if (eVar != null) {
            eVar.mo230998a(i, strArr, iArr);
        }
    }

    private void sendActivityResultEvent(int i, int i2, Intent intent) {
        try {
            OpenPlatform.Requests.OnActivityResult onActivityResult = new OpenPlatform.Requests.OnActivityResult();
            onActivityResult.mRequestCode = i;
            onActivityResult.mResultCode = i2;
            LKEvent a = new LKEvent.C25888a().mo92168a("onActivityResult").mo92169a(new JSONObject(JSON.toJSONString(onActivityResult))).mo92162a(this).mo92171a();
            a.mo92133b("intentData", intent);
            this.mGadgetContext.sendEvent(a);
        } catch (JSONException e) {
            C53241h.m205895a("MiniappHostBase", "JSONException", e);
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.fragment.app.FragmentActivity
    public void onActivityResult(int i, int i2, Intent intent) {
        AbstractC24361a aVar = this.mGadgetAppContainer;
        if (aVar == null || !aVar.mo87111a(i, i2, intent)) {
            AbstractC25576a defaultPluginContainer = this.mGadgetContext.getDefaultPluginContainer();
            AbstractC67497e eVar = this.mActivityProxy;
            if (eVar == null || !eVar.mo232119a(i, i2, intent)) {
                AppBrandLogger.m52830i("MiniappHostBase", "use plugin container to activity result");
                if (defaultPluginContainer == null || !defaultPluginContainer.mo87111a(i, i2, intent)) {
                    ApiHandlerManager.getInst(this.mGadgetContext).unRegisterActivityResultAllHandler();
                    ApiHandlerManager.getInst(this.mGadgetContext).unRegisterNewActivityResultAllHandler();
                    if (defaultPluginContainer != null) {
                        defaultPluginContainer.mo92186x();
                    }
                    sendActivityResultEvent(i, i2, intent);
                    super.onActivityResult(i, i2, intent);
                    return;
                }
                defaultPluginContainer.mo92186x();
                return;
            }
            ApiHandlerManager.getInst(this.mGadgetContext).unRegisterActivityResultAllHandler();
            ApiHandlerManager.getInst(this.mGadgetContext).unRegisterNewActivityResultAllHandler();
            if (defaultPluginContainer != null) {
                defaultPluginContainer.mo92186x();
                return;
            }
            return;
        }
        this.mGadgetAppContainer.mo92186x();
    }
}
