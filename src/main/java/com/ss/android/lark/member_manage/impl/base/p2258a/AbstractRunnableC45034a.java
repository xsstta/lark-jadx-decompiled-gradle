package com.ss.android.lark.member_manage.impl.base.p2258a;

import android.text.TextUtils;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.ChatChatter;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.member_manage.GroupMemberManageModule;
import com.ss.android.lark.member_manage.dependency.IGroupMemberManageModuleDependency;
import com.ss.android.lark.member_manage.dto.GroupManageChatChatterResponse;
import com.ss.android.lark.member_manage.impl.base.p2258a.AbstractRunnableC45034a;
import com.ss.android.lark.member_manage.impl.bean.C45083b;
import com.ss.android.lark.member_manage.impl.bean.C45084c;
import com.ss.android.lark.member_manage.impl.bean.C45086f;
import com.ss.android.lark.member_manage.impl.bean.SelectBeansResult;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.ss.android.lark.member_manage.impl.base.a.a */
public abstract class AbstractRunnableC45034a implements AbstractC45037b, Runnable {

    /* renamed from: a */
    protected String f114030a;

    /* renamed from: b */
    public Chat f114031b;

    /* renamed from: c */
    protected Map<String, C45084c> f114032c;

    /* renamed from: d */
    IGroupMemberManageModuleDependency.AbstractC44881d f114033d;

    /* renamed from: e */
    IGroupMemberManageModuleDependency.IChatDependency f114034e;

    /* renamed from: f */
    public IGetDataCallback<SelectBeansResult> f114035f;

    /* renamed from: g */
    public String f114036g;

    /* renamed from: h */
    protected int f114037h;

    /* renamed from: i */
    private boolean f114038i;

    /* renamed from: j */
    private C45083b f114039j;

    /* renamed from: k */
    private Set<String> f114040k;

    /* renamed from: a */
    public abstract void mo159313a(String str, String str2, IGetDataCallback<GroupManageChatChatterResponse> iGetDataCallback);

    /* renamed from: b */
    public Chat mo159316b() {
        return this.f114031b;
    }

    /* renamed from: c */
    public boolean mo159319c() {
        return !TextUtils.isEmpty(this.f114036g);
    }

    public void run() {
        if (this.f114035f != null && this.f114031b != null) {
            mo159310a();
        }
    }

    /* renamed from: a */
    public void mo159310a() {
        GroupManageChatChatterResponse a = this.f114034e.mo143744a(this.f114030a, this.f114036g, this.f114037h, 0);
        if (mo159317b(a)) {
            mo159318c(a);
        }
        this.f114034e.mo143756a(this.f114030a, "", this.f114038i, this.f114037h, new IGetDataCallback<GroupManageChatChatterResponse>() {
            /* class com.ss.android.lark.member_manage.impl.base.p2258a.AbstractRunnableC45034a.C450351 */

            /* access modifiers changed from: private */
            /* renamed from: a */
            public /* synthetic */ void m178612a() {
                AbstractRunnableC45034a.this.f114035f.onError(new ErrorResult("no result"));
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public /* synthetic */ void m178613a(ErrorResult errorResult) {
                AbstractRunnableC45034a.this.f114035f.onError(errorResult);
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                UICallbackExecutor.execute(new Runnable(errorResult) {
                    /* class com.ss.android.lark.member_manage.impl.base.p2258a.$$Lambda$a$1$c2d9ukpoC3bN8czafSdF_0PuJ8 */
                    public final /* synthetic */ ErrorResult f$1;

                    {
                        this.f$1 = r2;
                    }

                    public final void run() {
                        AbstractRunnableC45034a.C450351.m270811lambda$c2d9ukpoC3bN8czafSdF_0PuJ8(AbstractRunnableC45034a.C450351.this, this.f$1);
                    }
                });
            }

            /* renamed from: a */
            public void onSuccess(GroupManageChatChatterResponse bVar) {
                if (!AbstractRunnableC45034a.this.mo159317b(bVar)) {
                    UICallbackExecutor.execute(new Runnable() {
                        /* class com.ss.android.lark.member_manage.impl.base.p2258a.$$Lambda$a$1$u1nUdMEWSRUqDZl1L9yJ11s_40 */

                        public final void run() {
                            AbstractRunnableC45034a.C450351.m270812lambda$u1nUdMEWSRUqDZl1L9yJ11s_40(AbstractRunnableC45034a.C450351.this);
                        }
                    });
                } else {
                    AbstractRunnableC45034a.this.mo159318c(bVar);
                }
            }
        }, 0, -1);
    }

    /* renamed from: a */
    public void mo159311a(int i) {
        this.f114037h = i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public List<C45084c> mo159308a(List<ChatChatter> list) {
        return new ArrayList(0);
    }

    /* renamed from: b */
    public boolean mo159317b(GroupManageChatChatterResponse bVar) {
        if (bVar == null) {
            return false;
        }
        if (CollectionUtils.isNotEmpty(bVar.mo158906d()) || TextUtils.isEmpty(bVar.mo158905c())) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private List<C45084c> m178596a(C45083b bVar) {
        return mo159324c(mo159309a(mo159323b(new ArrayList(bVar.mo159492a())), bVar.mo159500d(), bVar.mo159501e(), bVar.mo159497b()));
    }

    /* renamed from: d */
    private C45083b m178598d(GroupManageChatChatterResponse bVar) {
        C45083b bVar2 = new C45083b();
        bVar2.mo159494a(new ArrayList(bVar.mo158906d()));
        bVar2.mo159496a(bVar.mo158904b());
        bVar2.mo159495a(bVar.mo158907e());
        bVar2.mo159493a(this.f114033d.mo143779a());
        bVar2.mo159498b(bVar.mo158909f());
        this.f114039j = bVar2;
        return bVar2;
    }

    /* renamed from: c */
    public void mo159318c(GroupManageChatChatterResponse bVar) {
        this.f114036g = bVar.mo158905c();
        C45083b d = m178598d(bVar);
        for (C45084c cVar : mo159308a(bVar.mo158906d())) {
            this.f114032c.put(cVar.mo159513h(), cVar);
        }
        List<C45084c> a = m178596a(d);
        mo159314a(a);
        UICallbackExecutor.execute(new Runnable(d, a) {
            /* class com.ss.android.lark.member_manage.impl.base.p2258a.$$Lambda$a$eV64VpCWDdTwlK3UtZh1VfCk */
            public final /* synthetic */ C45083b f$1;
            public final /* synthetic */ List f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void run() {
                AbstractRunnableC45034a.m270810lambda$eV64VpCWDdTwlK3UtZh1VfCk(AbstractRunnableC45034a.this, this.f$1, this.f$2);
            }
        });
    }

    /* renamed from: a */
    public C45083b mo159307a(GroupManageChatChatterResponse bVar) {
        if (this.f114039j == null) {
            return m178598d(bVar);
        }
        List<ChatChatter> d = bVar.mo158906d();
        this.f114039j.mo159492a().addAll(d);
        Map<String, String> e = bVar.mo158907e();
        if (!(this.f114039j.mo159500d() == null || e == null)) {
            this.f114039j.mo159500d().putAll(e);
        }
        C45083b bVar2 = new C45083b();
        bVar2.mo159494a(new ArrayList(d));
        bVar2.mo159496a(bVar.mo158904b());
        bVar2.mo159493a(this.f114039j.mo159497b());
        bVar2.mo159495a(this.f114039j.mo159500d());
        bVar2.mo159498b(bVar.mo158909f());
        return bVar2;
    }

    /* renamed from: a */
    public void mo159312a(final IGetDataCallback<SelectBeansResult> iGetDataCallback) {
        this.f114034e.mo143756a(this.f114030a, this.f114036g, this.f114038i, this.f114037h, new IGetDataCallback<GroupManageChatChatterResponse>() {
            /* class com.ss.android.lark.member_manage.impl.base.p2258a.AbstractRunnableC45034a.C450362 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                iGetDataCallback.onError(errorResult);
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public static /* synthetic */ void m178615a(IGetDataCallback iGetDataCallback) {
                iGetDataCallback.onError(new ErrorResult("no result"));
            }

            /* renamed from: a */
            public void onSuccess(GroupManageChatChatterResponse bVar) {
                if (!AbstractRunnableC45034a.this.mo159317b(bVar)) {
                    UICallbackExecutor.execute(new Runnable() {
                        /* class com.ss.android.lark.member_manage.impl.base.p2258a.$$Lambda$a$2$MiBycJXOznKe7LHGzpKGjoi_wI */

                        public final void run() {
                            AbstractRunnableC45034a.C450362.m270813lambda$MiBycJXOznKe7LHGzpKGjoi_wI(IGetDataCallback.this);
                        }
                    });
                    return;
                }
                AbstractRunnableC45034a.this.f114036g = bVar.mo158905c();
                C45083b a = AbstractRunnableC45034a.this.mo159307a(bVar);
                List<C45084c> c = AbstractRunnableC45034a.this.mo159324c(AbstractRunnableC45034a.this.mo159309a(a.mo159492a(), a.mo159500d(), a.mo159501e(), a.mo159497b()));
                AbstractRunnableC45034a.this.mo159314a(c);
                iGetDataCallback.onSuccess(new SelectBeansResult(a.mo159499c(), c, AbstractRunnableC45034a.this.f114032c, CollectionUtils.isNotEmpty(a.mo159500d())));
            }
        }, this.f114040k.size(), -1);
    }

    /* renamed from: a */
    public void mo159314a(Collection<C45084c> collection) {
        if (!CollectionUtils.isEmpty(collection)) {
            for (C45084c cVar : collection) {
                if (cVar != null && !TextUtils.isEmpty(cVar.mo159513h())) {
                    this.f114040k.add(cVar.mo159513h());
                }
            }
        }
    }

    /* renamed from: a */
    public void mo159315a(Map<String, C45084c> map) {
        this.f114032c.clear();
        this.f114032c.putAll(map);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m178597a(C45083b bVar, List list) {
        this.f114035f.onSuccess(new SelectBeansResult(bVar.mo159499c(), list, this.f114032c, CollectionUtils.isNotEmpty(bVar.mo159500d())));
    }

    public AbstractRunnableC45034a(IGetDataCallback<SelectBeansResult> iGetDataCallback, String str, Chat chat) {
        this(iGetDataCallback, str, chat, false);
    }

    /* renamed from: a */
    public List<C45084c> mo159309a(List<Chatter> list, Map<String, String> map, Map<String, String> map2, Chatter chatter) {
        return C45086f.m178890a(this.f114031b, list, chatter, map, map2);
    }

    public AbstractRunnableC45034a(IGetDataCallback<SelectBeansResult> iGetDataCallback, String str, Chat chat, boolean z) {
        this.f114032c = new LinkedHashMap();
        this.f114033d = GroupMemberManageModule.m177902a().getChatterDependency();
        this.f114034e = GroupMemberManageModule.m177902a().getChatDependency();
        this.f114036g = "";
        this.f114038i = false;
        this.f114037h = 1;
        this.f114040k = new HashSet();
        this.f114035f = iGetDataCallback;
        this.f114038i = z;
        this.f114031b = chat;
        this.f114030a = str;
    }
}
