package com.ss.android.lark.share_group;

import android.app.Activity;
import android.os.Bundle;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.BasePresenter;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.share_group.C54807b;
import com.ss.android.lark.share_group.ShareGroupProfileView;

/* renamed from: com.ss.android.lark.share_group.j */
public class C54840j extends BasePresenter<C54807b.AbstractC54808a, C54807b.AbstractC54809b, C54807b.AbstractC54809b.AbstractC54810a> {

    /* renamed from: a */
    ShareGroupProfileView.AbstractC54802a f135396a;

    /* renamed from: com.ss.android.lark.share_group.j$a */
    public class C54843a implements C54807b.AbstractC54809b.AbstractC54810a {
        @Override // com.ss.android.lark.share_group.C54807b.AbstractC54809b.AbstractC54810a
        /* renamed from: b */
        public void mo187022b() {
            C54840j.this.f135396a.mo187013a();
        }

        @Override // com.ss.android.lark.share_group.C54807b.AbstractC54809b.AbstractC54810a
        /* renamed from: a */
        public void mo187021a() {
            GroupProfileData a = ((C54807b.AbstractC54808a) C54840j.this.getModel()).mo187018a();
            if (a != null && a.getChatOwner() != null) {
                C54840j.this.f135396a.mo187014a(a.getChatOwner(), a.getChat());
            }
        }

        public C54843a() {
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C54807b.AbstractC54809b.AbstractC54810a createViewDelegate() {
        return new C54843a();
    }

    /* renamed from: a */
    public void mo187069a(Bundle bundle) {
        boolean z = bundle.getBoolean("params_could_apply", true);
        final boolean z2 = bundle.getBoolean("params_is_from_recommend_group", false);
        if (z) {
            ((C54807b.AbstractC54808a) getModel()).mo187019a(bundle, new IGetDataCallback<GroupProfileData>() {
                /* class com.ss.android.lark.share_group.C54840j.C548411 */

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                }

                /* renamed from: a */
                public void onSuccess(GroupProfileData groupProfileData) {
                    GroupProfileData a = ((C54807b.AbstractC54808a) C54840j.this.getModel()).mo187018a();
                    if (a != null) {
                        Chatter chatOwner = a.getChatOwner();
                        Chat chat = a.getChat();
                        if (chatOwner != null) {
                            ((C54807b.AbstractC54809b) C54840j.this.getView()).mo187010a(chat, chatOwner);
                        }
                        if (chat != null) {
                            ((C54807b.AbstractC54809b) C54840j.this.getView()).mo187011a(a, z2);
                        }
                    }
                }
            });
        } else {
            ((C54807b.AbstractC54808a) getModel()).mo187020b(bundle, new IGetDataCallback<GroupProfileData>() {
                /* class com.ss.android.lark.share_group.C54840j.C548422 */

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                }

                /* renamed from: a */
                public void onSuccess(GroupProfileData groupProfileData) {
                    GroupProfileData a = ((C54807b.AbstractC54808a) C54840j.this.getModel()).mo187018a();
                    if (a != null) {
                        Chatter chatOwner = a.getChatOwner();
                        Chat chat = a.getChat();
                        if (chatOwner != null) {
                            ((C54807b.AbstractC54809b) C54840j.this.getView()).mo187010a(chat, chatOwner);
                        }
                        if (chat != null) {
                            ((C54807b.AbstractC54809b) C54840j.this.getView()).mo187009a(a.getChat());
                        }
                    }
                }
            });
        }
    }

    public C54840j(Activity activity, ShareGroupProfileView.AbstractC54802a aVar) {
        ShareGroupProfileView shareGroupProfileView = new ShareGroupProfileView(activity, aVar);
        C54835i iVar = new C54835i();
        this.f135396a = aVar;
        setModel(iVar);
        setView(shareGroupProfileView);
        shareGroupProfileView.setViewDelegate(createViewDelegate());
    }
}
