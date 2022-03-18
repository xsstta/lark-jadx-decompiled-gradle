package com.ss.android.lark.member_manage.impl.base.mvp;

import android.text.TextUtils;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.member_manage.impl.base.mvp.AbstractC45074b;
import com.ss.android.lark.member_manage.impl.base.mvp.IGroupMemberBaseContract;
import com.ss.android.lark.member_manage.impl.base.p2259b.AbstractC45053b;
import com.ss.android.lark.member_manage.impl.bean.C45084c;
import com.ss.android.lark.member_manage.impl.bean.SelectBeansResult;
import java.util.List;

/* renamed from: com.ss.android.lark.member_manage.impl.base.mvp.b */
public abstract class AbstractC45074b implements IGroupMemberBaseContract.AbstractC45066b.AbstractC45067a {

    /* renamed from: a */
    protected IGroupMemberBaseContract.AbstractC45066b f114121a;

    /* renamed from: b */
    protected IGroupMemberBaseContract.AbstractC45065a f114122b;

    @Override // com.ss.android.lark.member_manage.impl.base.mvp.IGroupMemberBaseContract.AbstractC45066b.AbstractC45067a
    /* renamed from: c */
    public boolean mo159457c() {
        return this.f114122b.mo159445h();
    }

    @Override // com.ss.android.lark.member_manage.impl.base.mvp.IGroupMemberBaseContract.AbstractC45066b.AbstractC45067a
    /* renamed from: d */
    public boolean mo159459d() {
        return this.f114122b.mo159446i();
    }

    @Override // com.ss.android.lark.member_manage.impl.base.mvp.IGroupMemberBaseContract.AbstractC45066b.AbstractC45067a
    /* renamed from: a */
    public void mo159450a() {
        m178813b(this.f114122b.mo159444g());
    }

    @Override // com.ss.android.lark.member_manage.impl.base.mvp.IGroupMemberBaseContract.AbstractC45066b.AbstractC45067a
    /* renamed from: b */
    public void mo159455b() {
        this.f114122b.mo159442d(new UIGetDataCallback(new IGetDataCallback<SelectBeansResult>() {
            /* class com.ss.android.lark.member_manage.impl.base.mvp.AbstractC45074b.C450751 */

            /* access modifiers changed from: private */
            /* renamed from: a */
            public /* synthetic */ void m178823a() {
                AbstractC45074b.this.f114121a.mo159413g();
            }

            /* access modifiers changed from: private */
            /* renamed from: b */
            public /* synthetic */ void m178824b(SelectBeansResult dVar) {
                AbstractC45074b.this.f114121a.mo159401b(dVar);
            }

            /* renamed from: a */
            public void onSuccess(SelectBeansResult dVar) {
                UICallbackExecutor.execute(new Runnable(dVar) {
                    /* class com.ss.android.lark.member_manage.impl.base.mvp.$$Lambda$b$1$hr2hi437_CGHnLtvoUGpFoSZAy8 */
                    public final /* synthetic */ SelectBeansResult f$1;

                    {
                        this.f$1 = r2;
                    }

                    public final void run() {
                        AbstractC45074b.C450751.lambda$hr2hi437_CGHnLtvoUGpFoSZAy8(AbstractC45074b.C450751.this, this.f$1);
                    }
                });
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                UICallbackExecutor.execute(new Runnable() {
                    /* class com.ss.android.lark.member_manage.impl.base.mvp.$$Lambda$b$1$8amfKs6ShMAQ7KIMHYnhlIgPMio */

                    public final void run() {
                        AbstractC45074b.C450751.lambda$8amfKs6ShMAQ7KIMHYnhlIgPMio(AbstractC45074b.C450751.this);
                    }
                });
            }
        }));
    }

    /* renamed from: b */
    private void m178813b(String str) {
        this.f114122b.mo159437a(str, new AbstractC45053b<List<C45084c>>() {
            /* class com.ss.android.lark.member_manage.impl.base.mvp.AbstractC45074b.C450762 */

            @Override // com.ss.android.lark.member_manage.impl.base.p2259b.AbstractC45053b
            /* renamed from: a */
            public void mo159378a(final String str) {
                UICallbackExecutor.execute(new Runnable() {
                    /* class com.ss.android.lark.member_manage.impl.base.mvp.AbstractC45074b.C450762.RunnableC450782 */

                    public void run() {
                        AbstractC45074b.this.f114121a.mo159402b(str);
                    }
                });
            }

            @Override // com.ss.android.lark.member_manage.impl.base.p2259b.AbstractC45053b
            /* renamed from: a */
            public void mo159379a(final String str, final ErrorResult errorResult) {
                UICallbackExecutor.execute(new Runnable() {
                    /* class com.ss.android.lark.member_manage.impl.base.mvp.AbstractC45074b.C450762.RunnableC450793 */

                    public void run() {
                        AbstractC45074b.this.f114121a.mo159395a(str, errorResult);
                    }
                });
            }

            /* renamed from: a */
            public void mo159377a(final List<C45084c> list, final String str) {
                UICallbackExecutor.execute(new Runnable() {
                    /* class com.ss.android.lark.member_manage.impl.base.mvp.AbstractC45074b.C450762.RunnableC450771 */

                    public void run() {
                        AbstractC45074b.this.f114121a.mo159396a(str, list);
                    }
                });
            }
        });
    }

    @Override // com.ss.android.lark.member_manage.impl.base.mvp.IGroupMemberBaseContract.AbstractC45066b.AbstractC45067a
    /* renamed from: a */
    public void mo159451a(C45084c cVar) {
        this.f114122b.mo159436a(cVar, false);
        this.f114121a.mo159392a(this.f114122b.mo159433a(), this.f114122b.mo159440b(), this.f114122b.mo159441c());
    }

    /* renamed from: b */
    public void mo159473b(C45084c cVar) {
        this.f114122b.mo159438a(cVar.mo159513h(), cVar.mo159512g().mo159533h(), new IGetDataCallback<Chatter>() {
            /* class com.ss.android.lark.member_manage.impl.base.mvp.AbstractC45074b.C450803 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
            }

            /* renamed from: a */
            public void onSuccess(Chatter chatter) {
                UICallbackExecutor.execute(new Runnable(chatter) {
                    /* class com.ss.android.lark.member_manage.impl.base.mvp.$$Lambda$b$3$gri1g1VDQLMPkH4e0FOAAR5fayw */
                    public final /* synthetic */ Chatter f$1;

                    {
                        this.f$1 = r2;
                    }

                    public final void run() {
                        AbstractC45074b.C450803.lambda$gri1g1VDQLMPkH4e0FOAAR5fayw(AbstractC45074b.C450803.this, this.f$1);
                    }
                });
            }

            /* access modifiers changed from: private */
            /* renamed from: b */
            public /* synthetic */ void m178830b(Chatter chatter) {
                if (chatter != null) {
                    if (!chatter.isProfileEnable()) {
                        Log.m165389i("GroupMemberBaseViewDelegate", "unsupported click, do nothing here:" + chatter.getId());
                    } else if (chatter.isUser()) {
                        AbstractC45074b.this.f114121a.mo159388a(chatter);
                    } else if (chatter.isBot()) {
                        AbstractC45074b.this.f114121a.mo159407c(chatter.getId());
                    } else {
                        Log.m165383e("GroupMemberBaseViewDelegate", "unsupported chatter type, do nothing here:" + chatter.getId());
                    }
                }
            }
        });
    }

    @Override // com.ss.android.lark.member_manage.impl.base.mvp.IGroupMemberBaseContract.AbstractC45066b.AbstractC45067a
    /* renamed from: a */
    public void mo159453a(String str) {
        if (TextUtils.isEmpty(str)) {
            this.f114121a.mo159449d(this.f114122b.mo159433a());
        }
        this.f114122b.mo159443e();
        this.f114121a.mo159412f();
        m178813b(str);
    }

    public AbstractC45074b(IGroupMemberBaseContract.AbstractC45066b bVar, IGroupMemberBaseContract.AbstractC45065a aVar) {
        this.f114121a = bVar;
        this.f114122b = aVar;
    }

    @Override // com.ss.android.lark.member_manage.impl.base.mvp.IGroupMemberBaseContract.AbstractC45066b.AbstractC45067a
    /* renamed from: a */
    public void mo159452a(C45084c cVar, boolean z) {
        this.f114122b.mo159436a(cVar, z);
        this.f114121a.mo159392a(this.f114122b.mo159433a(), this.f114122b.mo159440b(), this.f114122b.mo159441c());
    }

    @Override // com.ss.android.lark.member_manage.impl.base.mvp.IGroupMemberBaseContract.AbstractC45066b.AbstractC45067a
    /* renamed from: a */
    public void mo159454a(List<C45084c> list, boolean z) {
        this.f114122b.mo159439a(list, z);
        this.f114121a.mo159392a(this.f114122b.mo159433a(), this.f114122b.mo159440b(), this.f114122b.mo159441c());
    }
}
