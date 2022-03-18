package com.ss.android.lark.app.task;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.device.v1.SetDeviceRequest;
import com.bytedance.lark.pb.tool.v1.InitNetRequest;
import com.bytedance.lark.pb.tool.v1.SetAccessTokenOnlyRequest;
import com.larksuite.framework.launch.task.AsyncLaunchTask;
import com.ss.android.lark.app.util.OpenSSLEnvUtil;
import com.ss.android.lark.dynamicconfig.DynamicConfigModule;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.passport_api.IPassportApi;
import com.ss.android.lark.platform.network.C51860c;
import com.ss.android.lark.sdk.SdkSender;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57765ac;
import com.ss.android.lark.utils.UIHelper;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class InitImSdkSimpleTask extends AsyncLaunchTask {
    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ Object m106182a(byte[] bArr) throws IOException {
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ Object m106183b(byte[] bArr) throws IOException {
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static /* synthetic */ Object m106184c(byte[] bArr) throws IOException {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo102719g() {
        DynamicConfigModule.m145552b().mo136167a();
    }

    /* renamed from: h */
    private void m106185h() {
        m106186i();
        m106187j();
        m106188k();
    }

    /* renamed from: k */
    private void m106188k() {
        InitNetRequest.C19713a aVar = new InitNetRequest.C19713a();
        ArrayList arrayList = new ArrayList();
        arrayList.add(InitNetRequest.HostAlias.DOCS_DRIVE);
        arrayList.add(InitNetRequest.HostAlias.DOCS_API);
        aVar.mo66816a(arrayList);
        SdkSender.asynSendRequestNonWrap(Command.INIT_NET, aVar, null, $$Lambda$InitImSdkSimpleTask$UfXMe0dsyrNKlgkcF2l0KhZexTo.INSTANCE);
    }

    /* renamed from: i */
    private void m106186i() {
        String deviceId = ((IPassportApi) ApiUtils.getApi(IPassportApi.class)).getDeviceId();
        Log.m165389i("InitImSdkSimpleTask", "setDeviceId: deviceId start ");
        if (!TextUtils.isEmpty(deviceId)) {
            SetDeviceRequest.C16592a aVar = new SetDeviceRequest.C16592a();
            HashMap hashMap = new HashMap();
            hashMap.put("device_model", Build.MODEL);
            aVar.mo59022a(deviceId).mo59025b(Build.VERSION.RELEASE).mo59026c(Build.MODEL).mo59023a(hashMap).mo59027d(UIHelper.getAppName()).mo59028e(((IPassportApi) ApiUtils.getApi(IPassportApi.class)).getDevicePlatform());
            SdkSender.asynSendRequestNonWrap(Command.SET_DEVICE, aVar, null, $$Lambda$InitImSdkSimpleTask$cQXPjVZnm3cQX9GAQJSp7HfKVM.INSTANCE);
            return;
        }
        Log.m165383e("InitImSdkSimpleTask", "setDeviceId()... deviceId is empty");
    }

    /* renamed from: j */
    private void m106187j() {
        String session = ((IPassportApi) ApiUtils.getApi(IPassportApi.class)).getSession();
        Log.m165389i("InitImSdkSimpleTask", "setAccessTokenOnlyRequest: start");
        if (!TextUtils.isEmpty(session)) {
            SetAccessTokenOnlyRequest.C19747a aVar = new SetAccessTokenOnlyRequest.C19747a();
            aVar.mo66897a(session);
            aVar.mo66899b(((IPassportApi) ApiUtils.getApi(IPassportApi.class)).getUserId());
            SdkSender.asynSendRequestNonWrap(Command.SET_ACCESS_TOKEN_ONLY, aVar, null, $$Lambda$InitImSdkSimpleTask$8xDesriiagg9nlX_WXRle5P04tY.INSTANCE);
            Log.m165389i("InitImSdkSimpleTask", "setAccessTokenOnlyRequest()... ok");
            return;
        }
        Log.m165383e("InitImSdkSimpleTask", "setAccessTokenOnlyRequest()... token is empty");
    }

    @Override // com.larksuite.framework.launch.task.AbstractLaunchTask, com.larksuite.framework.launch.task.ILaunchTask
    /* renamed from: a */
    public void mo43817a(Context context) {
        if (C57765ac.m224192f(context)) {
            mo102719g();
            Log.m165389i("InitImSdkSimpleTask", "start init simple rust sdk");
            OpenSSLEnvUtil.f72905b.mo103200a();
            C51860c cVar = new C51860c();
            cVar.mo178030a();
            IPassportApi iPassportApi = (IPassportApi) ApiUtils.getApi(IPassportApi.class);
            cVar.mo178031a(context, iPassportApi.oldSdkEnv(), iPassportApi.envType(), iPassportApi.getUserUnit());
            m106185h();
            iPassportApi.initSessionExpiredProcessor(context);
        }
    }
}
