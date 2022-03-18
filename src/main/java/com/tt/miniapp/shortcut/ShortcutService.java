package com.tt.miniapp.shortcut;

import android.app.Activity;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import com.tt.miniapp.AppbrandApplicationImpl;
import com.tt.miniapp.AppbrandServiceManager;
import com.tt.miniapp.shortcut.C66817a;
import com.tt.miniapp.shortcut.ShortcutResult;
import com.tt.miniapp.shortcut.p3329b.C66838e;
import com.tt.miniapphost.AppbrandContext;
import com.tt.miniapphost.entity.AppInfoEntity;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import me.ele.lancet.base.annotations.Skip;

public class ShortcutService extends AppbrandServiceManager.ServiceBase {
    private IAppContext appContext = this.mApp.getiAppContext();
    private Map<IAppContext, BroadcastReceiver> appContextBroadcastReceiverMap = new HashMap();
    public Context mContext;
    private boolean mLastResult;
    private boolean mOpenSettingPage;
    private List<C66838e> mShortcutRequestPool = new ArrayList();
    private boolean mShouldShowDialog = true;

    public void onActivityPause() {
        this.mShouldShowDialog = false;
    }

    public List<C66838e> getPendingList() {
        return this.mShortcutRequestPool;
    }

    public boolean isShowDialog() {
        return this.mShouldShowDialog;
    }

    public void unregisterIntentCallback() {
        BroadcastReceiver remove = this.appContextBroadcastReceiverMap.remove(this.appContext);
        if (remove != null) {
            AppbrandContext.getInst().getApplicationContext().unregisterReceiver(remove);
        }
    }

    public void setOpenSettingPage(boolean z) {
        this.mOpenSettingPage = z;
    }

    public void setShortcutState(boolean z) {
        this.mLastResult = z;
    }

    public ShortcutService(AppbrandApplicationImpl appbrandApplicationImpl) {
        super(appbrandApplicationImpl);
    }

    private void addShortcutAuto(IAppContext iAppContext) {
        final AppInfoEntity appInfo = AppbrandApplicationImpl.getInst(iAppContext).getAppInfo();
        if (appInfo != null) {
            AppbrandContext.getMainHandler().postDelayed(new Runnable() {
                /* class com.tt.miniapp.shortcut.ShortcutService.RunnableC668161 */

                public void run() {
                    C66827b.m260741a("user", ShortcutService.this.mApp.getiAppContext());
                    C66817a a = new C66817a.C66818a().mo232743c(appInfo.appId).mo232740a(appInfo.icon).mo232742b(appInfo.appName).mo232739a(appInfo.type).mo232741a();
                    ShortcutService shortcutService = ShortcutService.this;
                    shortcutService.tryToAddShortcut((Activity) shortcutService.mContext, a);
                }
            }, 300);
        }
    }

    private C66838e getPendingRequest(String str) {
        for (C66838e eVar : this.mShortcutRequestPool) {
            if (TextUtils.equals(str, eVar.f168601b)) {
                return eVar;
            }
        }
        return null;
    }

    public void onActivityResume(IAppContext iAppContext) {
        this.mShouldShowDialog = true;
        if (this.mOpenSettingPage) {
            this.mOpenSettingPage = false;
            if (!this.mLastResult) {
                addShortcutAuto(iAppContext);
            }
        }
    }

    public void onResult(String str) {
        C66838e pendingRequest = getPendingRequest(str);
        if (pendingRequest != null) {
            pendingRequest.mo232769a(new ShortcutResult(ShortcutResult.Result.NEED_CHECK, null));
        }
    }

    private void registerIntentCallback(String str) {
        if (this.appContextBroadcastReceiverMap.get(this.appContext) == null) {
            ShortcutResultReceiver shortcutResultReceiver = new ShortcutResultReceiver(this.appContext);
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("com.tt.appbrand.shorcut." + str);
            INVOKEVIRTUAL_com_tt_miniapp_shortcut_ShortcutService_com_bytedance_sysoptimizer_ReceiverRegisterLancet_registerReceiver(AppbrandContext.getInst().getApplicationContext(), shortcutResultReceiver, intentFilter);
            this.appContextBroadcastReceiverMap.put(this.appContext, shortcutResultReceiver);
        }
    }

    public void tryToAddShortcut(Activity activity, C66817a aVar) {
        if (activity == null || aVar == null) {
            AppBrandLogger.m52830i("ShortcutService", "tryToAddShortCut is called, but params is null");
            C66827b.m260742a("no", "add shortcut params error", this.mApp.getiAppContext());
            return;
        }
        this.mContext = activity;
        this.mLastResult = false;
        this.mShouldShowDialog = true;
        C66838e eVar = new C66838e(activity, aVar, this.mApp.getiAppContext());
        eVar.mo232768a();
        this.mShortcutRequestPool.add(eVar);
        registerIntentCallback(aVar.mo232737c());
    }

    @Skip({"com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer"})
    public static Intent INVOKEVIRTUAL_com_tt_miniapp_shortcut_ShortcutService_com_bytedance_sysoptimizer_ReceiverRegisterLancet_registerReceiver(Application application, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        try {
            return application.registerReceiver(broadcastReceiver, intentFilter);
        } catch (Exception e) {
            if (ReceiverRegisterCrashOptimizer.fixedOpen()) {
                return ReceiverRegisterCrashOptimizer.registerReceiver(broadcastReceiver, intentFilter);
            }
            throw e;
        }
    }
}
