package com.ss.android.lark.mail.impl.message.recall.sender.detail;

import androidx.lifecycle.C1177w;
import com.bytedance.lark.pb.email.client.v1.MailGetRecallDetailResponse;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.mail.impl.message.recall.sender.detail.C42997a;
import com.ss.android.lark.mail.impl.p2168g.C42176e;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.lark.mail.impl.message.recall.sender.detail.d */
public class C43005d implements C42997a.AbstractC42998a {

    /* renamed from: a */
    public C1177w<Integer> f109490a = new C1177w<>();

    /* renamed from: b */
    public C1177w<List<C43001b>> f109491b = new C1177w<>();

    /* renamed from: c */
    private String f109492c;

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
    }

    @Override // com.ss.android.lark.mail.impl.message.recall.sender.detail.C42997a.AbstractC42998a
    /* renamed from: a */
    public C1177w<Integer> mo154160a() {
        return this.f109490a;
    }

    @Override // com.ss.android.lark.mail.impl.message.recall.sender.detail.C42997a.AbstractC42998a
    /* renamed from: b */
    public C1177w<List<C43001b>> mo154161b() {
        return this.f109491b;
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        this.f109490a.mo5929b((Integer) 1);
    }

    @Override // com.ss.android.lark.mail.impl.message.recall.sender.detail.C42997a.AbstractC42998a
    /* renamed from: c */
    public void mo154162c() {
        C42176e.m168344a().mo152264m(this.f109492c, new IGetDataCallback<MailGetRecallDetailResponse>() {
            /* class com.ss.android.lark.mail.impl.message.recall.sender.detail.C43005d.C430061 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                C43005d.this.f109490a.mo5926a((Integer) -1);
            }

            /* renamed from: a */
            public void onSuccess(MailGetRecallDetailResponse mailGetRecallDetailResponse) {
                ArrayList arrayList = new ArrayList();
                for (MailGetRecallDetailResponse.Item item : mailGetRecallDetailResponse.items) {
                    arrayList.add(new C43001b(item));
                }
                C43005d.this.f109491b.mo5926a(arrayList);
                C43005d.this.f109490a.mo5926a((Integer) 2);
            }
        });
        if (this.f109490a.mo5927b().intValue() != 2) {
            this.f109490a.mo5926a((Integer) 1);
        }
    }

    public C43005d(String str) {
        this.f109492c = str;
    }
}
