package com.ss.android.lark.mail.impl.message.send.state;

import androidx.lifecycle.C1177w;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mail.impl.entity.SendStatusDetail;
import com.ss.android.lark.mail.impl.message.send.state.C43019a;
import com.ss.android.lark.mail.impl.p2168g.C42176e;
import com.ss.android.lark.mail.impl.p2168g.p2169a.C42130j;
import com.ss.android.lark.pb.mails.GetMessageSendStatusByMessageIDResponse;
import java.util.List;

/* renamed from: com.ss.android.lark.mail.impl.message.send.state.c */
public class C43026c implements C43019a.AbstractC43020a {

    /* renamed from: a */
    public C1177w<Integer> f109526a = new C1177w<>();

    /* renamed from: b */
    public C1177w<List<SendStatusDetail>> f109527b = new C1177w<>();

    /* renamed from: c */
    private String f109528c;

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
    }

    @Override // com.ss.android.lark.mail.impl.message.send.state.C43019a.AbstractC43020a
    /* renamed from: a */
    public C1177w<Integer> mo154191a() {
        return this.f109526a;
    }

    @Override // com.ss.android.lark.mail.impl.message.send.state.C43019a.AbstractC43020a
    /* renamed from: b */
    public C1177w<List<SendStatusDetail>> mo154192b() {
        return this.f109527b;
    }

    @Override // com.ss.android.lark.mail.impl.message.send.state.C43019a.AbstractC43020a
    /* renamed from: c */
    public void mo154193c() {
        this.f109526a.mo5929b((Integer) 1);
        C42176e.m168344a().mo152203a(this.f109528c, new IGetDataCallback<GetMessageSendStatusByMessageIDResponse>() {
            /* class com.ss.android.lark.mail.impl.message.send.state.C43026c.C430271 */

            /* renamed from: a */
            public void onSuccess(GetMessageSendStatusByMessageIDResponse getMessageSendStatusByMessageIDResponse) {
                if (getMessageSendStatusByMessageIDResponse == null || getMessageSendStatusByMessageIDResponse.mdetails == null) {
                    Log.m165389i("SendStatusDetailModel", "fetchSendStatus empty");
                    C43026c.this.f109526a.mo5926a((Integer) -1);
                    return;
                }
                Log.m165389i("SendStatusDetailModel", "fetchSendStatus success");
                C43026c.this.f109527b.mo5926a(C42130j.m168150a().mo152089e(getMessageSendStatusByMessageIDResponse.mdetails));
                C43026c.this.f109526a.mo5926a((Integer) 2);
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Log.m165397w("SendStatusDetailModel", "fetchSendStatus err:" + errorResult);
                C43026c.this.f109526a.mo5926a((Integer) -1);
            }
        });
        if (this.f109526a.mo5927b().intValue() != 2) {
            this.f109526a.mo5926a((Integer) 1);
        }
    }

    public C43026c(String str) {
        this.f109528c = str;
    }
}
