package com.ss.android.lark.chat.chatwindow.chat.p1613b.p1615b;

import android.content.Context;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.suite.R;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.statistics.p2701o.C54970a;

/* renamed from: com.ss.android.lark.chat.chatwindow.chat.b.b.x */
public class C33137x implements AbstractC33118g {

    /* renamed from: a */
    public Context f85276a;

    public C33137x(Context context) {
        this.f85276a = context;
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.p1613b.p1615b.AbstractC33118g
    /* renamed from: a */
    public void mo122315a(String str, String str2) {
        C54970a.m213419a(2, true);
        C29990c.m110930b().mo134502A().mo134384a(str, str2, new IGetDataCallback<Boolean>() {
            /* class com.ss.android.lark.chat.chatwindow.chat.p1613b.p1615b.C33137x.C331381 */

            /* renamed from: a */
            public void onSuccess(Boolean bool) {
                LKUIToast.show(C33137x.this.f85276a, (int) R.string.Lark_Legacy_AddStickerSuccess);
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                LKUIToast.show(C33137x.this.f85276a, errorResult.getDisplayMsg());
            }
        });
    }
}
