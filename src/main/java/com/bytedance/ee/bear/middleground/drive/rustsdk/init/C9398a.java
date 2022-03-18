package com.bytedance.ee.bear.middleground.drive.rustsdk.init;

import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.basic.v1.SetReqIdSuffixRequest;
import com.bytedance.lark.pb.tool.v1.SetNetworkProxyRequest;
import com.ss.android.lark.sdk.SdkSender;
import java.io.IOException;

/* renamed from: com.bytedance.ee.bear.middleground.drive.rustsdk.init.a */
public class C9398a {
    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ Object m38822a(byte[] bArr) throws IOException {
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ Object m38825b(byte[] bArr) throws IOException {
        return null;
    }

    /* renamed from: a */
    public static void m38823a(String str) {
        SdkSender.asynSendRequestNonWrap(Command.SET_REQ_ID_SUFFIX, new SetReqIdSuffixRequest.C15276a().mo55594a(str), null, $$Lambda$a$vYalT6N8zPjzRwpww9P_AiSoA0Y.INSTANCE);
    }

    /* renamed from: b */
    private static String m38826b(String str, String str2, boolean z) {
        String str3;
        if (z) {
            str3 = "https://";
        } else {
            str3 = "http://";
        }
        return str3 + str + ":" + str2;
    }

    /* renamed from: a */
    public static void m38824a(String str, String str2, boolean z) {
        SetNetworkProxyRequest.C19759a aVar = new SetNetworkProxyRequest.C19759a();
        aVar.mo66928a(m38826b(str, str2, z));
        SdkSender.asynSendRequestNonWrap(Command.SET_NETWORK_PROXY, aVar, null, $$Lambda$a$Oh7FVFSV2iH5SgvNi1V8AJZc2JI.INSTANCE);
    }
}
