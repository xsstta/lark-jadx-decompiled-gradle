package com.ss.android.lark.mail.impl.message.plugin;

import android.text.TextUtils;
import com.bytedance.lark.pb.email.v1.MailSendCardResponse;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mail.impl.p2168g.C42176e;
import java.util.List;

/* renamed from: com.ss.android.lark.mail.impl.message.plugin.d */
public class C42960d {

    /* renamed from: a */
    private final String f109397a = "ShareHandler";

    /* renamed from: com.ss.android.lark.mail.impl.message.plugin.d$a */
    public interface AbstractC42962a {
        /* renamed from: a */
        void mo153858a(boolean z);
    }

    /* renamed from: a */
    public void mo154080a(List<String> list, String str, List<String> list2, String str2, final AbstractC42962a aVar) {
        Log.m165389i("ShareHandler", "sendToChat");
        if (TextUtils.isEmpty(str) || CollectionUtils.isEmpty(list2)) {
            Log.m165383e("ShareHandler", "sendToChat invalid content");
            if (aVar != null) {
                aVar.mo153858a(false);
            }
        } else if (CollectionUtils.isEmpty(list)) {
            Log.m165383e("ShareHandler", "sendToChat empty chat ID list");
            if (aVar != null) {
                aVar.mo153858a(false);
            }
        } else {
            C42176e.m168344a().mo152220a(str, list2, list, str2, false, new IGetDataCallback<MailSendCardResponse>() {
                /* class com.ss.android.lark.mail.impl.message.plugin.C42960d.C429611 */

                /* renamed from: a */
                public void onSuccess(MailSendCardResponse mailSendCardResponse) {
                    Log.m165389i("ShareHandler", "sendToChat onSuccess");
                    AbstractC42962a aVar = aVar;
                    if (aVar != null) {
                        aVar.mo153858a(true);
                    }
                }

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    Log.m165383e("ShareHandler", "sendToChat onError");
                    AbstractC42962a aVar = aVar;
                    if (aVar != null) {
                        aVar.mo153858a(false);
                    }
                }
            });
        }
    }
}
