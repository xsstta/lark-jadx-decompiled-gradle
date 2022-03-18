package com.ss.android.lark.mail.impl.p2168g;

import com.bytedance.lark.pb.basic.v1.Command;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.squareup.wire.Message;
import com.ss.android.lark.mail.impl.C41816b;
import com.ss.android.lark.mail.impl.p2171h.p2173b.C42310r;
import com.ss.android.lark.mail.impl.p2171h.p2175c.C42344d;
import com.ss.android.lark.sdk.SdkSender;

/* renamed from: com.ss.android.lark.mail.impl.g.d */
public class C42174d {
    /* renamed from: a */
    public static <T> void m168343a(Command command, Message.Builder builder, final IGetDataCallback<T> iGetDataCallback, SdkSender.IParser<T> iParser) {
        String str = "";
        if (builder != null) {
            str = builder.hashCode() + str;
        } else if (iParser != null) {
            str = iParser.hashCode() + str;
        }
        final String str2 = System.currentTimeMillis() + str;
        ((C42310r) C42344d.m169092a(C42310r.class, C41816b.m166115a().mo150132b(), str2)).mo152321b(command.toString());
        SdkSender.asynSendRequestNonWrap(command, builder, new IGetDataCallback<T>() {
            /* class com.ss.android.lark.mail.impl.p2168g.C42174d.C421751 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onError(errorResult);
                }
                ((C42310r) C42344d.m169092a(C42310r.class, C41816b.m166115a().mo150132b(), str2)).mo152437h(errorResult.getMessage());
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback, com.larksuite.framework.callback.IRequestCallback
            public void onSuccess(T t) {
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onSuccess(t);
                }
                ((C42310r) C42344d.m169092a(C42310r.class, C41816b.m166115a().mo150132b(), str2)).mo152318a("success", 0);
            }
        }, iParser);
    }
}
