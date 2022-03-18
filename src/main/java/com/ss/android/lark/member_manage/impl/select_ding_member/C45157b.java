package com.ss.android.lark.member_manage.impl.select_ding_member;

import android.os.Bundle;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.message.MessageInfo;
import com.ss.android.lark.chat.entity.message.MessageUnReadInfo;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.member_manage.GroupMemberManageModule;
import com.ss.android.lark.member_manage.impl.base.mvp.AbstractC45068a;
import com.ss.android.lark.member_manage.impl.base.p2258a.AbstractRunnableC45034a;
import com.ss.android.lark.member_manage.impl.base.p2259b.AbstractC45053b;
import com.ss.android.lark.member_manage.impl.base.p2259b.AbstractC45054c;
import com.ss.android.lark.member_manage.impl.base.p2259b.C45051a;
import com.ss.android.lark.member_manage.impl.bean.C45084c;
import com.ss.android.lark.member_manage.impl.bean.SelectBeansResult;
import com.ss.android.lark.member_manage.impl.bean.SelectMemberInitData;
import com.ss.android.lark.member_manage.impl.select_ding_member.AbstractC45166g;
import com.ss.android.lark.utils.rxjava.C57865c;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.lark.member_manage.impl.select_ding_member.b */
public class C45157b extends AbstractC45068a implements AbstractC45166g.AbstractC45167a {

    /* renamed from: h */
    C45051a f114337h = new C45051a();

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.member_manage.impl.base.mvp.AbstractC45068a
    /* renamed from: f */
    public AbstractC45054c mo159467f() {
        return this.f114337h;
    }

    @Override // com.ss.android.lark.member_manage.impl.select_ding_member.AbstractC45166g.AbstractC45167a
    /* renamed from: j */
    public AbstractC45166g.AbstractC45167a.C45168a mo159694j() {
        if (this.f114103a.getMessageInfo() != null) {
            return new AbstractC45166g.AbstractC45167a.C45168a(this.f114103a.getMessageInfo().getMessage(), new ArrayList(mo159441c().keySet()));
        }
        Log.m165382e("urgent message is null");
        return null;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.member_manage.impl.base.mvp.AbstractC45068a
    /* renamed from: c */
    public AbstractRunnableC45034a mo159465c(IGetDataCallback<SelectBeansResult> iGetDataCallback) {
        return new C45163d(this.f114103a, mo159464b(iGetDataCallback));
    }

    @Override // com.ss.android.lark.member_manage.impl.select_ding_member.AbstractC45166g.AbstractC45167a
    /* renamed from: a */
    public boolean mo159692a(long j) {
        return GroupMemberManageModule.m177902a().isInZenMode(j);
    }

    @Override // com.ss.android.lark.member_manage.impl.base.mvp.IGroupMemberBaseContract.AbstractC45065a
    /* renamed from: a */
    public void mo159437a(String str, AbstractC45053b<List<C45084c>> bVar) {
        this.f114337h.mo159374a(this.f114109g, mo159466d(), str, mo159462a(bVar));
    }

    @Override // com.ss.android.lark.member_manage.impl.base.mvp.IGroupMemberBaseContract.AbstractC45065a
    /* renamed from: a */
    public void mo159434a(Bundle bundle, final IGetDataCallback<SelectMemberInitData> iGetDataCallback) {
        final String string = bundle.getString("key_chat_id");
        final String string2 = bundle.getString("key_message_id");
        C57865c.m224574a(new C57865c.AbstractC57873d<SelectMemberInitData>() {
            /* class com.ss.android.lark.member_manage.impl.select_ding_member.C45157b.C451581 */

            /* renamed from: a */
            public SelectMemberInitData produce() {
                SelectMemberInitData selectMemberInitData = new SelectMemberInitData();
                Chat a = GroupMemberManageModule.m177902a().getChatDependency().mo143743a(string);
                MessageInfo a2 = GroupMemberManageModule.m177902a().getMessageDependency().mo143796a(string2);
                selectMemberInitData.setChat(a);
                selectMemberInitData.setMessageInfo(a2);
                return selectMemberInitData;
            }
        }, new C57865c.AbstractC57871b<SelectMemberInitData>() {
            /* class com.ss.android.lark.member_manage.impl.select_ding_member.C45157b.C451592 */

            /* renamed from: a */
            public void consume(SelectMemberInitData selectMemberInitData) {
                C45157b.this.f114103a = selectMemberInitData;
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onSuccess(selectMemberInitData);
                }
            }
        });
    }

    @Override // com.ss.android.lark.member_manage.impl.select_ding_member.AbstractC45166g.AbstractC45167a
    /* renamed from: b */
    public void mo159693b(String str, String str2, IGetDataCallback<MessageUnReadInfo> iGetDataCallback) {
        GroupMemberManageModule.m177902a().getChatDependency().mo143770c(str, str2, iGetDataCallback);
    }
}
