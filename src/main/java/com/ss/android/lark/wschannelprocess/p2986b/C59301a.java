package com.ss.android.lark.wschannelprocess.p2986b;

import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.basic.v1.SetInOfflineModeRequest;
import com.bytedance.lark.pb.basic.v1.SetInofflineModeResponse;
import com.bytedance.lark.pb.basic.v1.SpinUpFrontierRequest;
import com.bytedance.lark.pb.basic.v1.SpinUpFrontierResponse;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.sdk.SdkSender;
import java.io.IOException;

/* renamed from: com.ss.android.lark.wschannelprocess.b.a */
public class C59301a {
    /* renamed from: a */
    public static void m230265a(boolean z) {
        SetInOfflineModeRequest.C15272a a = new SetInOfflineModeRequest.C15272a().mo55585a(Boolean.valueOf(z));
        Log.m165389i("WschannelProcRustWrapper", "setOfflineMode isOffline = " + z);
        SdkSender.syncSendMayError(Command.SET_IN_OFFLINE_MODE, a, new SdkSender.IParser<SetInofflineModeResponse>() {
            /* class com.ss.android.lark.wschannelprocess.p2986b.C59301a.C593032 */

            /* renamed from: a */
            public SetInofflineModeResponse parse(byte[] bArr) throws IOException {
                return SetInofflineModeResponse.ADAPTER.decode(bArr);
            }
        });
    }

    /* renamed from: a */
    public static void m230264a(String str, String str2, int i, String str3) {
        SpinUpFrontierRequest.C15290a aVar = new SpinUpFrontierRequest.C15290a();
        Log.m165389i("WschannelProcRustWrapper", "SpinUpFrontier");
        aVar.mo55626a(str).mo55628b(str2);
        aVar.mo55625a(SpinUpFrontierRequest.EnvType.fromValue(i)).mo55629c(str3);
        SdkSender.syncSendMayError(Command.SPIN_UP_FRONTIER, aVar, new SdkSender.IParser<SpinUpFrontierResponse>() {
            /* class com.ss.android.lark.wschannelprocess.p2986b.C59301a.C593021 */

            /* renamed from: a */
            public SpinUpFrontierResponse parse(byte[] bArr) throws IOException {
                return SpinUpFrontierResponse.ADAPTER.decode(bArr);
            }
        });
    }
}
