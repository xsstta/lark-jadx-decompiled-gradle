package com.ss.android.lark.member_manage.impl.select_ding_member;

import android.app.Activity;
import android.os.Bundle;
import com.larksuite.framework.callback.CallbackManager;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.mvp.BasePresenter;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.message.MessageInfo;
import com.ss.android.lark.chat.entity.message.MessageUnReadInfo;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.member_manage.impl.base.mvp.IGroupMemberBaseContract;
import com.ss.android.lark.member_manage.impl.bean.SelectBeansResult;
import com.ss.android.lark.member_manage.impl.bean.SelectMemberInitData;
import com.ss.android.lark.member_manage.impl.select_ding_member.AbstractC45166g;
import com.ss.android.lark.member_manage.impl.select_ding_member.C45160c;
import java.util.ArrayList;

/* renamed from: com.ss.android.lark.member_manage.impl.select_ding_member.j */
public class C45173j extends BasePresenter<AbstractC45166g.AbstractC45167a, AbstractC45166g.AbstractC45169b, IGroupMemberBaseContract.AbstractC45066b.AbstractC45067a> {

    /* renamed from: a */
    public C45157b f114357a;

    /* renamed from: b */
    private CallbackManager f114358b = new CallbackManager();

    /* renamed from: c */
    private C45160c f114359c;

    /* renamed from: d */
    private Bundle f114360d;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public IGroupMemberBaseContract.AbstractC45066b.AbstractC45067a createViewDelegate() {
        return new C45164e(this.f114359c, this.f114357a);
    }

    /* renamed from: b */
    public void mo159703b() {
        ((AbstractC45166g.AbstractC45167a) getModel()).mo159435a(new IGetDataCallback<SelectBeansResult>() {
            /* class com.ss.android.lark.member_manage.impl.select_ding_member.C45173j.C451752 */

            /* renamed from: a */
            public void onSuccess(final SelectBeansResult dVar) {
                UICallbackExecutor.execute(new Runnable() {
                    /* class com.ss.android.lark.member_manage.impl.select_ding_member.C45173j.C451752.RunnableC451761 */

                    public void run() {
                        ((AbstractC45166g.AbstractC45169b) C45173j.this.getView()).mo159449d(dVar);
                        ((AbstractC45166g.AbstractC45169b) C45173j.this.getView()).mo159448b(new ArrayList(C45173j.this.f114357a.mo159441c().values()));
                    }
                });
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(final ErrorResult errorResult) {
                UICallbackExecutor.execute(new Runnable() {
                    /* class com.ss.android.lark.member_manage.impl.select_ding_member.C45173j.C451752.RunnableC451772 */

                    public void run() {
                        Log.m165382e(errorResult.toString());
                        ((AbstractC45166g.AbstractC45169b) C45173j.this.getView()).mo159393a(errorResult.getDisplayMsg());
                    }
                });
            }
        });
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        this.f114358b.cancelCallbacks();
        this.f114358b = null;
        super.destroy();
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        ((AbstractC45166g.AbstractC45167a) getModel()).mo159434a(this.f114360d, new IGetDataCallback<SelectMemberInitData>() {
            /* class com.ss.android.lark.member_manage.impl.select_ding_member.C45173j.C451741 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
            }

            /* renamed from: a */
            public void onSuccess(SelectMemberInitData selectMemberInitData) {
                ((AbstractC45166g.AbstractC45169b) C45173j.this.getView()).mo159447a(selectMemberInitData.getChat());
                C45173j.this.mo159702a(selectMemberInitData.getMessageInfo());
                C45173j.this.mo159703b();
            }
        });
    }

    /* renamed from: a */
    public void mo159702a(MessageInfo messageInfo) {
        if (messageInfo == null) {
            ((AbstractC45166g.AbstractC45169b) getView()).mo159698a((MessageUnReadInfo) null);
            return;
        }
        Message message = messageInfo.getMessage();
        ((AbstractC45166g.AbstractC45167a) getModel()).mo159693b(message.getChatId(), message.getId(), new IGetDataCallback<MessageUnReadInfo>() {
            /* class com.ss.android.lark.member_manage.impl.select_ding_member.C45173j.C451783 */

            /* renamed from: a */
            public void onSuccess(MessageUnReadInfo cVar) {
                ((AbstractC45166g.AbstractC45169b) C45173j.this.getView()).mo159698a(cVar);
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                ((AbstractC45166g.AbstractC45169b) C45173j.this.getView()).mo159698a((MessageUnReadInfo) null);
            }
        });
    }

    public C45173j(Activity activity, Bundle bundle, C45160c.AbstractC45162a aVar) {
        this.f114360d = bundle;
        this.f114359c = new C45160c(activity, aVar);
        C45157b bVar = new C45157b();
        this.f114357a = bVar;
        setModel(bVar);
        setView(this.f114359c);
        this.f114359c.setViewDelegate(createViewDelegate());
    }
}
