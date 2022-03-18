package com.ss.android.lark.app.initiator;

import android.content.Context;
import com.larksuite.component.safemode.SafeModeConstants;
import com.larksuite.component.safemode.SafeModeManager;
import com.larksuite.framework.launch.task.ILaunchTask;
import com.ss.android.lark.app.task.DoubleThreadQuickenInit;
import com.ss.android.lark.app.task.InitGuideTask;
import com.ss.android.lark.app.task.InitHotfixModuleTask;
import com.ss.android.lark.app.task.InitMonitorTask;
import com.ss.android.lark.app.task.ScheduleUploadNetLogTask;
import com.ss.android.lark.app.taskv2.central.InitSafeModeTask;
import com.ss.android.lark.app.taskv2.preload.GadgetJatoTask;
import com.ss.android.lark.app.taskv2.preload.initVPNSDKTask;
import com.ss.android.lark.app.util.OpenSSLEnvUtil;
import com.ss.android.lark.featuregating.C37239a;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.openplatform_api.IOpenPlatformApi;
import com.ss.android.lark.utils.ApiUtils;

/* renamed from: com.ss.android.lark.app.initiator.i */
public class C28919i extends C28912b {
    @Override // com.ss.android.lark.app.initiator.C28912b, com.ss.android.lark.app.initiator.AbstractC28915e
    /* renamed from: b */
    public void mo102527b(Context context) {
        super.mo102527b(context);
        OpenSSLEnvUtil.f72905b.mo103200a();
    }

    @Override // com.ss.android.lark.app.initiator.C28912b, com.ss.android.lark.app.initiator.AbstractC28915e
    /* renamed from: a */
    public void mo102526a(Context context) {
        super.mo102526a(context);
        boolean a = C37239a.m146648b().mo136952a("lark.android.double.thread.gadget", false);
        Log.m165389i("MiniAppProcessInitor", "lark.android.double.thread.gadget:" + a);
        if (a) {
            this.f72532a.mo102769a(new DoubleThreadQuickenInit()).mo102770a(context);
        }
        this.f72532a.mo102769a(new GadgetJatoTask()).mo102770a(context);
    }

    @Override // com.ss.android.lark.app.initiator.C28912b, com.ss.android.lark.app.initiator.AbstractC28915e
    /* renamed from: c */
    public void mo102528c(Context context) {
        super.mo102528c(context);
        this.f72532a.mo102769a(new InitHotfixModuleTask()).mo102769a(new InitMonitorTask()).mo102769a(new InitGuideTask()).mo102769a(new initVPNSDKTask()).mo102769a(new ScheduleUploadNetLogTask(1));
        ILaunchTask initOPMonitorTask = ((IOpenPlatformApi) ApiUtils.getApi(IOpenPlatformApi.class)).getInitOPMonitorTask();
        if (initOPMonitorTask != null) {
            this.f72532a.mo102769a(initOPMonitorTask);
        }
        if (SafeModeManager.f62333a.mo88864a() != SafeModeConstants.SafeModeLevel.NONE) {
            this.f72532a.mo102769a(new InitSafeModeTask().mo92544a(InitHotfixModuleTask.class));
        }
        this.f72532a.mo102770a(context);
        ((IOpenPlatformApi) ApiUtils.getApi(IOpenPlatformApi.class)).afterAppOnCreate(context);
    }
}
