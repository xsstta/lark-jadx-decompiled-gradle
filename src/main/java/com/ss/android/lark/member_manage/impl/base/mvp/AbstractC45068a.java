package com.ss.android.lark.member_manage.impl.base.mvp;

import android.text.TextUtils;
import com.larksuite.framework.callback.C25975i;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.BaseModel;
import com.larksuite.framework.thread.CoreThreadPool;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.ChatChatter;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.member_manage.GroupMemberManageModule;
import com.ss.android.lark.member_manage.dependency.IGroupMemberManageModuleDependency;
import com.ss.android.lark.member_manage.impl.base.mvp.IGroupMemberBaseContract;
import com.ss.android.lark.member_manage.impl.base.p2258a.AbstractRunnableC45034a;
import com.ss.android.lark.member_manage.impl.base.p2259b.AbstractC45053b;
import com.ss.android.lark.member_manage.impl.base.p2259b.AbstractC45054c;
import com.ss.android.lark.member_manage.impl.bean.C45084c;
import com.ss.android.lark.member_manage.impl.bean.SelectBeansResult;
import com.ss.android.lark.member_manage.impl.bean.SelectMemberInitData;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.lark.member_manage.impl.base.mvp.a */
public abstract class AbstractC45068a extends BaseModel implements IGroupMemberBaseContract.AbstractC45065a {

    /* renamed from: a */
    public SelectMemberInitData f114103a;

    /* renamed from: b */
    protected List<C45084c> f114104b = new ArrayList();

    /* renamed from: c */
    protected SelectBeansResult f114105c = new SelectBeansResult(false, new ArrayList(), new LinkedHashMap(), false);

    /* renamed from: d */
    public List<C45084c> f114106d = new ArrayList();

    /* renamed from: e */
    public Map<String, C45084c> f114107e = new LinkedHashMap();

    /* renamed from: f */
    protected IGroupMemberManageModuleDependency.AbstractC44881d f114108f = GroupMemberManageModule.m177902a().getChatterDependency();

    /* renamed from: g */
    protected AbstractRunnableC45034a f114109g;

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract AbstractRunnableC45034a mo159465c(IGetDataCallback<SelectBeansResult> iGetDataCallback);

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public abstract AbstractC45054c mo159467f();

    @Override // com.ss.android.lark.member_manage.impl.base.mvp.IGroupMemberBaseContract.AbstractC45065a
    /* renamed from: a */
    public SelectBeansResult mo159433a() {
        return this.f114105c;
    }

    @Override // com.ss.android.lark.member_manage.impl.base.mvp.IGroupMemberBaseContract.AbstractC45065a
    /* renamed from: b */
    public List<C45084c> mo159440b() {
        return this.f114106d;
    }

    @Override // com.ss.android.lark.member_manage.impl.base.mvp.IGroupMemberBaseContract.AbstractC45065a
    /* renamed from: c */
    public Map<String, C45084c> mo159441c() {
        return this.f114107e;
    }

    @Override // com.ss.android.lark.member_manage.impl.base.mvp.IGroupMemberBaseContract.AbstractC45065a
    /* renamed from: e */
    public void mo159443e() {
        this.f114106d.clear();
    }

    @Override // com.ss.android.lark.member_manage.impl.base.mvp.IGroupMemberBaseContract.AbstractC45065a
    /* renamed from: i */
    public boolean mo159446i() {
        return this.f114109g.mo159319c();
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public String mo159466d() {
        return this.f114103a.getChat().getId();
    }

    @Override // com.ss.android.lark.member_manage.impl.base.mvp.IGroupMemberBaseContract.AbstractC45065a
    /* renamed from: g */
    public String mo159444g() {
        return mo159467f().mo159373a();
    }

    @Override // com.ss.android.lark.member_manage.impl.base.mvp.IGroupMemberBaseContract.AbstractC45065a
    /* renamed from: h */
    public boolean mo159445h() {
        return mo159467f().mo159375b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public AbstractC45053b<List<C45084c>> mo159462a(final AbstractC45053b<List<C45084c>> bVar) {
        return new AbstractC45053b<List<C45084c>>() {
            /* class com.ss.android.lark.member_manage.impl.base.mvp.AbstractC45068a.C450702 */

            @Override // com.ss.android.lark.member_manage.impl.base.p2259b.AbstractC45053b
            /* renamed from: a */
            public void mo159378a(String str) {
                AbstractC45068a.this.f114106d = new ArrayList();
                AbstractC45053b bVar = bVar;
                if (bVar != null) {
                    bVar.mo159378a(str);
                }
            }

            @Override // com.ss.android.lark.member_manage.impl.base.p2259b.AbstractC45053b
            /* renamed from: a */
            public void mo159379a(String str, ErrorResult errorResult) {
                AbstractC45053b bVar = bVar;
                if (bVar != null) {
                    bVar.mo159379a(str, errorResult);
                }
            }

            /* renamed from: a */
            public void mo159377a(List<C45084c> list, String str) {
                for (C45084c cVar : list) {
                    if (AbstractC45068a.this.f114107e.keySet().contains(cVar.mo159513h())) {
                        cVar.mo159503b(true);
                    } else {
                        cVar.mo159503b(false);
                    }
                }
                AbstractC45068a.this.f114106d = list;
                AbstractC45053b bVar = bVar;
                if (bVar != null) {
                    bVar.mo159377a(list, str);
                }
            }
        };
    }

    /* renamed from: a */
    public void mo159463a(Chat chat) {
        this.f114103a.setChat(chat);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public IGetDataCallback<SelectBeansResult> mo159464b(final IGetDataCallback<SelectBeansResult> iGetDataCallback) {
        return new C25975i(new IGetDataCallback<SelectBeansResult>() {
            /* class com.ss.android.lark.member_manage.impl.base.mvp.AbstractC45068a.C450691 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onError(errorResult);
                }
            }

            /* renamed from: a */
            public void onSuccess(SelectBeansResult dVar) {
                List<C45084c> b = dVar.mo159516b();
                AbstractC45068a.this.f114105c = new SelectBeansResult(dVar.mo159515a(), b, dVar.mo159517c(), dVar.mo159518d());
                AbstractC45068a.this.f114107e.putAll(dVar.mo159517c());
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onSuccess(AbstractC45068a.this.f114105c);
                }
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ void m178786e(final IGetDataCallback iGetDataCallback) {
        this.f114109g.mo159312a((IGetDataCallback) getCallbackManager().wrapCallback(new IGetDataCallback<SelectBeansResult>() {
            /* class com.ss.android.lark.member_manage.impl.base.mvp.AbstractC45068a.C450735 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                iGetDataCallback.onError(errorResult);
            }

            /* renamed from: a */
            public void onSuccess(SelectBeansResult dVar) {
                AbstractC45068a.this.f114105c.mo159516b().addAll(dVar.mo159516b());
                iGetDataCallback.onSuccess(dVar);
            }
        }));
    }

    @Override // com.ss.android.lark.member_manage.impl.base.mvp.IGroupMemberBaseContract.AbstractC45065a
    /* renamed from: a */
    public void mo159435a(IGetDataCallback<SelectBeansResult> iGetDataCallback) {
        this.f114109g = mo159465c((IGetDataCallback) getCallbackManager().wrapCallback(iGetDataCallback));
        CoreThreadPool.getDefault().getCachedThreadPool().execute(this.f114109g);
    }

    @Override // com.ss.android.lark.member_manage.impl.base.mvp.IGroupMemberBaseContract.AbstractC45065a
    /* renamed from: d */
    public void mo159442d(IGetDataCallback<SelectBeansResult> iGetDataCallback) {
        CoreThreadPool.getDefault().getCachedThreadPool().execute(new Runnable(iGetDataCallback) {
            /* class com.ss.android.lark.member_manage.impl.base.mvp.$$Lambda$a$C4_suD0bnNA8iKqoNIjvFnM7RE */
            public final /* synthetic */ IGetDataCallback f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                AbstractC45068a.m270815lambda$C4_suD0bnNA8iKqoNIjvFnM7RE(AbstractC45068a.this, this.f$1);
            }
        });
    }

    /* renamed from: b */
    private void m178784b(C45084c cVar, boolean z) {
        List<C45084c> b = this.f114105c.mo159516b();
        if (!CollectionUtils.isEmpty(b)) {
            for (C45084c cVar2 : b) {
                if (cVar2.mo159513h().equals(cVar.mo159513h())) {
                    cVar2.mo159503b(z);
                    return;
                }
            }
        }
    }

    /* renamed from: c */
    private void m178785c(C45084c cVar, boolean z) {
        if (!CollectionUtils.isEmpty(this.f114106d)) {
            for (C45084c cVar2 : this.f114106d) {
                if (cVar2.mo159513h().equals(cVar.mo159513h())) {
                    cVar2.mo159503b(z);
                    return;
                }
            }
        }
    }

    @Override // com.ss.android.lark.member_manage.impl.base.mvp.IGroupMemberBaseContract.AbstractC45065a
    /* renamed from: a */
    public void mo159436a(C45084c cVar, boolean z) {
        String h = cVar.mo159513h();
        if (z && !this.f114107e.keySet().contains(h)) {
            this.f114107e.put(h, cVar);
        } else if (!z && this.f114107e.keySet().contains(h)) {
            this.f114107e.remove(h);
        }
        this.f114109g.mo159315a(this.f114107e);
        m178784b(cVar, z);
        m178785c(cVar, z);
    }

    @Override // com.ss.android.lark.member_manage.impl.base.mvp.IGroupMemberBaseContract.AbstractC45065a
    /* renamed from: a */
    public void mo159439a(List<C45084c> list, boolean z) {
        if (list != null) {
            for (C45084c cVar : list) {
                if (cVar != null && !TextUtils.isEmpty(cVar.mo159513h())) {
                    mo159436a(cVar, z);
                }
            }
        }
    }

    @Override // com.ss.android.lark.member_manage.impl.base.mvp.IGroupMemberBaseContract.AbstractC45065a
    /* renamed from: a */
    public void mo159438a(final String str, String str2, final IGetDataCallback<Chatter> iGetDataCallback) {
        if (TextUtils.isEmpty(str2)) {
            final IGetDataCallback iGetDataCallback2 = (IGetDataCallback) getCallbackManager().wrapCallback(iGetDataCallback);
            this.f114108f.mo143782a(str, new IGetDataCallback<Chatter>() {
                /* class com.ss.android.lark.member_manage.impl.base.mvp.AbstractC45068a.C450713 */

                /* renamed from: a */
                public void onSuccess(Chatter chatter) {
                    iGetDataCallback2.onSuccess(chatter);
                }

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    iGetDataCallback2.onError(errorResult);
                }
            });
            return;
        }
        this.f114108f.mo143783a(str2, Collections.singletonList(str), getCallbackManager().wrapAndAddGetDataCallback(new IGetDataCallback<Map<String, ChatChatter>>() {
            /* class com.ss.android.lark.member_manage.impl.base.mvp.AbstractC45068a.C450724 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                iGetDataCallback.onError(errorResult);
            }

            /* renamed from: a */
            public void onSuccess(Map<String, ChatChatter> map) {
                iGetDataCallback.onSuccess(map.get(str));
            }
        }));
    }
}
