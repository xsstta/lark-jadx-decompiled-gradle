package com.ss.android.lark.appsetting.api.p1370a;

import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.basic.v1.SyncDataStrategy;
import com.bytedance.lark.pb.settings.v1.GetSettingsRequest;
import com.bytedance.lark.pb.settings.v1.GetSettingsResponse;
import com.bytedance.lark.pb.settings.v1.PushSettings;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.appsetting.api.C29219d;
import com.ss.android.lark.appsetting.api.p1371b.C29218a;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.sdk.C53248k;
import com.ss.android.lark.sdk.SdkSender;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.ss.android.lark.appsetting.api.a.a */
public class C29211a {

    /* renamed from: com.ss.android.lark.appsetting.api.a.a$a */
    private static class C29213a {

        /* renamed from: a */
        public static C29211a f73148a = new C29211a();
    }

    private C29211a() {
    }

    /* renamed from: a */
    public static C29211a m107458a() {
        return C29213a.f73148a;
    }

    /* renamed from: b */
    public void mo103609b() {
        C29219d.m107477a().mo103629b();
    }

    /* renamed from: a */
    public void mo103607a(IGetDataCallback<Map<String, String>> iGetDataCallback) {
        C53248k.m205912a().mo181697a(Command.PUSH_SETTINGS, new C53248k.AbstractC53250a() {
            /* class com.ss.android.lark.appsetting.api.p1370a.$$Lambda$a$eUILqnqOx3aEdrw8sVc5zujZPLk */

            @Override // com.ss.android.lark.sdk.C53248k.AbstractC53250a
            public final void onPush(byte[] bArr, String str, boolean z, boolean z2) {
                C29211a.m107460a(IGetDataCallback.this, bArr, str, z, z2);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ Map m107459a(byte[] bArr) throws IOException {
        Set<String> set;
        GetSettingsResponse decode = GetSettingsResponse.ADAPTER.decode(bArr);
        StringBuilder sb = new StringBuilder();
        sb.append("GetSettingsResponse: ");
        if (decode.field_groups == null) {
            set = Collections.EMPTY_SET;
        } else {
            set = decode.field_groups.keySet();
        }
        sb.append(C29218a.m107472a(set));
        Log.m165379d("SettingFetcherImpl", sb.toString());
        return decode.field_groups;
    }

    /* renamed from: a */
    public void mo103608a(boolean z, List<String> list, final IGetDataCallback<Map<String, String>> iGetDataCallback) {
        GetSettingsRequest.C19155a a = new GetSettingsRequest.C19155a().mo65459a(list);
        if (z) {
            a.f47295b = SyncDataStrategy.FORCE_SERVER;
        }
        Log.m165389i("SettingFetcherImpl", "pullAppSettings: " + C29218a.m107472a(list));
        SdkSender.asynSendRequestNonWrap(Command.GET_SETTINGS, a, new IGetDataCallback<Map<String, String>>() {
            /* class com.ss.android.lark.appsetting.api.p1370a.C29211a.C292121 */

            /* renamed from: a */
            public void onSuccess(Map<String, String> map) {
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onSuccess(map);
                }
                C29219d.m107477a().mo103628a(map);
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Log.m165383e("SettingFetcherImpl", "pullAppSettings onError:" + errorResult);
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onError(errorResult);
                }
            }
        }, $$Lambda$a$9gbepdLk8opNGut0oe42g4LSwVM.INSTANCE);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m107460a(IGetDataCallback iGetDataCallback, byte[] bArr, String str, boolean z, boolean z2) {
        Set<String> set;
        try {
            PushSettings decode = PushSettings.ADAPTER.decode(bArr);
            if (iGetDataCallback != null) {
                iGetDataCallback.onSuccess(decode.field_groups);
            }
            C29219d.m107477a().mo103628a(decode.field_groups);
            StringBuilder sb = new StringBuilder();
            sb.append("onPush PushSetting fields:");
            if (decode.field_groups == null) {
                set = Collections.EMPTY_SET;
            } else {
                set = decode.field_groups.keySet();
            }
            sb.append(C29218a.m107472a(set));
            sb.append(", fromServerPipe = ");
            sb.append(z);
            sb.append(", offlinePush = ");
            sb.append(z2);
            Log.m165379d("SettingFetcherImpl", sb.toString());
        } catch (IOException e) {
            Log.m165383e("SettingFetcherImpl", "failed to parse push_settings, e:" + e);
            if (iGetDataCallback != null) {
                iGetDataCallback.onError(new ErrorResult(e));
            }
        }
    }
}
