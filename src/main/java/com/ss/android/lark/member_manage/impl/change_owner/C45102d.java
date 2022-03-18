package com.ss.android.lark.member_manage.impl.change_owner;

import android.os.Bundle;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.member_manage.GroupMemberManageModule;
import com.ss.android.lark.member_manage.impl.base.mvp.AbstractC45068a;
import com.ss.android.lark.member_manage.impl.base.p2258a.AbstractRunnableC45034a;
import com.ss.android.lark.member_manage.impl.base.p2259b.AbstractC45053b;
import com.ss.android.lark.member_manage.impl.base.p2259b.AbstractC45054c;
import com.ss.android.lark.member_manage.impl.base.p2259b.C45051a;
import com.ss.android.lark.member_manage.impl.bean.C45084c;
import com.ss.android.lark.member_manage.impl.bean.SelectBeansResult;
import com.ss.android.lark.member_manage.impl.bean.SelectMemberInitData;
import com.ss.android.lark.member_manage.impl.change_owner.AbstractC45117h;
import com.ss.android.lark.utils.rxjava.C57865c;
import java.util.List;

/* renamed from: com.ss.android.lark.member_manage.impl.change_owner.d */
public class C45102d extends AbstractC45068a implements AbstractC45117h.AbstractC45118a {

    /* renamed from: h */
    C45051a f114207h = new C45051a();

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.member_manage.impl.base.mvp.AbstractC45068a
    /* renamed from: f */
    public AbstractC45054c mo159467f() {
        return this.f114207h;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.member_manage.impl.base.mvp.AbstractC45068a
    /* renamed from: c */
    public AbstractRunnableC45034a mo159465c(IGetDataCallback<SelectBeansResult> iGetDataCallback) {
        return new C45101c(this.f114103a, mo159464b(iGetDataCallback));
    }

    @Override // com.ss.android.lark.member_manage.impl.base.mvp.IGroupMemberBaseContract.AbstractC45065a
    /* renamed from: a */
    public void mo159437a(String str, AbstractC45053b<List<C45084c>> bVar) {
        this.f114207h.mo159374a(this.f114109g, mo159466d(), str, mo159462a(bVar));
    }

    @Override // com.ss.android.lark.member_manage.impl.base.mvp.IGroupMemberBaseContract.AbstractC45065a
    /* renamed from: a */
    public void mo159434a(Bundle bundle, final IGetDataCallback<SelectMemberInitData> iGetDataCallback) {
        final String string = bundle.getString("key_chat_id");
        C57865c.m224574a(new C57865c.AbstractC57873d<SelectMemberInitData>() {
            /* class com.ss.android.lark.member_manage.impl.change_owner.C45102d.C451031 */

            /* renamed from: a */
            public SelectMemberInitData produce() {
                SelectMemberInitData selectMemberInitData = new SelectMemberInitData();
                selectMemberInitData.setChat(GroupMemberManageModule.m177902a().getChatDependency().mo143743a(string));
                return selectMemberInitData;
            }
        }, new C57865c.AbstractC57871b<SelectMemberInitData>() {
            /* class com.ss.android.lark.member_manage.impl.change_owner.C45102d.C451042 */

            /* renamed from: a */
            public void consume(SelectMemberInitData selectMemberInitData) {
                C45102d.this.f114103a = selectMemberInitData;
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onSuccess(selectMemberInitData);
                }
            }
        });
    }
}
