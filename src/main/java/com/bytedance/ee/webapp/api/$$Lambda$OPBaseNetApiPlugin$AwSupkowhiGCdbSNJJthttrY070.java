package com.bytedance.ee.webapp.api;

import com.bytedance.lark.pb.basic.v1.SendHttpResponse;
import com.ss.android.lark.sdk.SdkSender;

/* renamed from: com.bytedance.ee.webapp.api.-$$Lambda$OPBaseNetApiPlugin$AwSupkowhiGCdbSNJJthttrY070  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$OPBaseNetApiPlugin$AwSupkowhiGCdbSNJJthttrY070 implements SdkSender.IParser {
    public static final /* synthetic */ $$Lambda$OPBaseNetApiPlugin$AwSupkowhiGCdbSNJJthttrY070 INSTANCE = new $$Lambda$OPBaseNetApiPlugin$AwSupkowhiGCdbSNJJthttrY070();

    private /* synthetic */ $$Lambda$OPBaseNetApiPlugin$AwSupkowhiGCdbSNJJthttrY070() {
    }

    @Override // com.ss.android.lark.sdk.SdkSender.IParser
    public final Object parse(byte[] bArr) {
        return SendHttpResponse.ADAPTER.decode(bArr);
    }
}
