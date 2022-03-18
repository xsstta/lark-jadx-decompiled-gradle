package com.ss.android.lark.member_manage.impl.change_owner;

import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.member_manage.impl.base.mvp.AbstractC45074b;
import com.ss.android.lark.member_manage.impl.bean.C45084c;
import com.ss.android.lark.member_manage.impl.change_owner.AbstractC45117h;

/* renamed from: com.ss.android.lark.member_manage.impl.change_owner.g */
public class C45114g extends AbstractC45074b {

    /* renamed from: c */
    AbstractC45117h.AbstractC45119b f114228c;

    @Override // com.ss.android.lark.member_manage.impl.base.mvp.IGroupMemberBaseContract.AbstractC45066b.AbstractC45067a
    /* renamed from: d */
    public void mo159458d(C45084c cVar) {
    }

    @Override // com.ss.android.lark.member_manage.impl.base.mvp.IGroupMemberBaseContract.AbstractC45066b.AbstractC45067a
    /* renamed from: e */
    public void mo159460e() {
    }

    @Override // com.ss.android.lark.member_manage.impl.base.mvp.IGroupMemberBaseContract.AbstractC45066b.AbstractC45067a
    /* renamed from: f */
    public void mo159461f() {
    }

    @Override // com.ss.android.lark.member_manage.impl.base.mvp.IGroupMemberBaseContract.AbstractC45066b.AbstractC45067a
    /* renamed from: c */
    public void mo159456c(C45084c cVar) {
        this.f114122b.mo159438a(cVar.mo159513h(), cVar.mo159512g().mo159533h(), new IGetDataCallback<Chatter>() {
            /* class com.ss.android.lark.member_manage.impl.change_owner.C45114g.C451151 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
            }

            /* renamed from: a */
            public void onSuccess(final Chatter chatter) {
                UICallbackExecutor.execute(new Runnable() {
                    /* class com.ss.android.lark.member_manage.impl.change_owner.C45114g.C451151.RunnableC451161 */

                    public void run() {
                        if (chatter != null) {
                            C45114g.this.f114228c.mo159591b(chatter);
                        }
                    }
                });
            }
        });
    }

    public C45114g(AbstractC45117h.AbstractC45119b bVar, AbstractC45117h.AbstractC45118a aVar) {
        super(bVar, aVar);
        this.f114228c = bVar;
    }
}
