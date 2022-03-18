package com.ss.android.lark.chat.service.impl;

import android.text.TextUtils;
import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.im.v1.GetMyCustomerServiceChatRequest;
import com.bytedance.lark.pb.im.v1.GetMyCustomerServiceChatResponse;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.chat.service.AbstractC34123d;
import com.ss.android.lark.sdk.SdkSender;
import com.ss.android.lark.util.share_preference.UserSP;
import java.io.IOException;

/* renamed from: com.ss.android.lark.chat.service.impl.h */
public class C34215h implements AbstractC34123d {

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.chat.service.impl.h$a */
    public static final class C34217a {

        /* renamed from: a */
        public static final AbstractC34123d f88523a = new C34215h();
    }

    private C34215h() {
    }

    /* renamed from: a */
    public static AbstractC34123d m132788a() {
        return C34217a.f88523a;
    }

    @Override // com.ss.android.lark.chat.service.AbstractC34123d
    /* renamed from: a */
    public void mo126551a(IGetDataCallback<String> iGetDataCallback) {
        final UserSP instance = UserSP.getInstance();
        if (!instance.getBoolean("key_first_fetch_custom_id", true)) {
            String string = instance.getString("key_my_customer_service");
            if (!TextUtils.isEmpty(string)) {
                iGetDataCallback.onSuccess(string);
                return;
            }
        }
        SdkSender.asynSendRequestNonWrap(Command.GET_MY_CUSTOMER_SERVICE_CHAT, new GetMyCustomerServiceChatRequest.C17641a(), iGetDataCallback, new SdkSender.IParser<String>() {
            /* class com.ss.android.lark.chat.service.impl.C34215h.C342161 */

            /* renamed from: a */
            public String parse(byte[] bArr) throws IOException {
                String str = GetMyCustomerServiceChatResponse.ADAPTER.decode(bArr).chat.id;
                instance.putString("key_my_customer_service", str);
                instance.putBoolean("key_first_fetch_custom_id", false);
                return str;
            }
        });
    }
}
