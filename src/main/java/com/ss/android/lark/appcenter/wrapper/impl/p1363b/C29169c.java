package com.ss.android.lark.appcenter.wrapper.impl.p1363b;

import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.openplatform.v1.AppType;
import com.bytedance.lark.pb.openplatform.v1.FeedbackRecentAppRequest;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.sdk.SdkSender;

/* renamed from: com.ss.android.lark.appcenter.wrapper.impl.b.c */
public class C29169c {
    /* renamed from: a */
    public static void m107223a(String str, int i, IGetDataCallback<String> iGetDataCallback) {
        SdkSender.asynSendRequestNonWrap(Command.FEEDBACK_RECENT_APP, new FeedbackRecentAppRequest.C18647a().mo64210a(str).mo64209a(AppType.fromValue(i)), iGetDataCallback, new SdkSender.IParser<String>() {
            /* class com.ss.android.lark.appcenter.wrapper.impl.p1363b.C29169c.C291701 */

            /* renamed from: a */
            public String parse(byte[] bArr) {
                return "";
            }
        });
    }
}
