package com.ss.android.lark.member_manage.impl.show_member.common_group;

import android.os.Bundle;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.thread.CoreThreadPool;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.ChatChatter;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.member_manage.GroupMemberManageModule;
import com.ss.android.lark.member_manage.dependency.IGroupMemberManageModuleDependency;
import com.ss.android.lark.member_manage.impl.base.mvp.AbstractC45068a;
import com.ss.android.lark.member_manage.impl.base.p2258a.AbstractRunnableC45034a;
import com.ss.android.lark.member_manage.impl.base.p2259b.AbstractC45053b;
import com.ss.android.lark.member_manage.impl.base.p2259b.AbstractC45054c;
import com.ss.android.lark.member_manage.impl.base.p2259b.C45051a;
import com.ss.android.lark.member_manage.impl.bean.C45084c;
import com.ss.android.lark.member_manage.impl.bean.C45086f;
import com.ss.android.lark.member_manage.impl.bean.SelectBeansResult;
import com.ss.android.lark.member_manage.impl.bean.SelectMemberInitData;
import com.ss.android.lark.member_manage.impl.show_member.common_group.C45190b;
import com.ss.android.lark.team.entity.Team;
import com.ss.android.lark.utils.rxjava.C57865c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.lark.member_manage.impl.show_member.common_group.h */
public class C45207h extends AbstractC45068a implements C45190b.AbstractC45191a {

    /* renamed from: h */
    int f114407h;

    /* renamed from: i */
    C45051a f114408i = new C45051a();

    /* renamed from: j */
    protected String f114409j;

    /* renamed from: k */
    IGroupMemberManageModuleDependency.IChatDependency f114410k = GroupMemberManageModule.m177902a().getChatDependency();

    /* renamed from: l */
    private List<String> f114411l;

    /* renamed from: m */
    private C45190b.AbstractC45191a.AbstractC45192a f114412m;

    @Override // com.ss.android.lark.member_manage.impl.show_member.common_group.C45190b.AbstractC45191a
    public void aT_() {
        this.f114407h = 1;
    }

    @Override // com.ss.android.lark.member_manage.impl.show_member.common_group.C45190b.AbstractC45191a
    /* renamed from: j */
    public void mo159754j() {
        this.f114407h = 2;
    }

    @Override // com.larksuite.framework.mvp.BaseModel, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
    }

    @Override // com.larksuite.framework.mvp.BaseModel, com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        super.destroy();
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.member_manage.impl.base.mvp.AbstractC45068a
    /* renamed from: f */
    public AbstractC45054c mo159467f() {
        return this.f114408i;
    }

    @Override // com.ss.android.lark.member_manage.impl.show_member.common_group.C45190b.AbstractC45191a
    /* renamed from: a */
    public void mo159749a(final List<String> list, IGetDataCallback<Chat> iGetDataCallback) {
        if (this.f114409j != null) {
            final IGetDataCallback iGetDataCallback2 = (IGetDataCallback) getCallbackManager().wrapAndAddCallback(iGetDataCallback);
            this.f114410k.mo143750a(this.f114409j, list, new IGetDataCallback<Chat>() {
                /* class com.ss.android.lark.member_manage.impl.show_member.common_group.C45207h.C452114 */

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    IGetDataCallback iGetDataCallback = iGetDataCallback2;
                    if (iGetDataCallback != null) {
                        iGetDataCallback.onError(errorResult);
                    }
                }

                /* renamed from: a */
                public void onSuccess(Chat chat) {
                    C45207h.this.mo159786a(list);
                    IGetDataCallback iGetDataCallback = iGetDataCallback2;
                    if (iGetDataCallback != null) {
                        iGetDataCallback.onSuccess(chat);
                    }
                }
            });
        }
    }

    @Override // com.ss.android.lark.member_manage.impl.show_member.common_group.C45190b.AbstractC45191a
    /* renamed from: k */
    public void mo159755k() {
        this.f114107e.clear();
    }

    @Override // com.ss.android.lark.member_manage.impl.show_member.common_group.C45190b.AbstractC45191a
    /* renamed from: l */
    public Chat mo159756l() {
        return this.f114103a.getChat();
    }

    /* renamed from: a */
    public void mo159785a(C45190b.AbstractC45191a.AbstractC45192a aVar) {
        this.f114412m = aVar;
    }

    @Override // com.ss.android.lark.member_manage.impl.base.mvp.AbstractC45068a, com.ss.android.lark.member_manage.impl.base.mvp.IGroupMemberBaseContract.AbstractC45065a
    /* renamed from: d */
    public void mo159442d(final IGetDataCallback<SelectBeansResult> iGetDataCallback) {
        super.mo159442d(new IGetDataCallback<SelectBeansResult>() {
            /* class com.ss.android.lark.member_manage.impl.show_member.common_group.C45207h.C452081 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                iGetDataCallback.onError(errorResult);
            }

            /* renamed from: a */
            public void onSuccess(SelectBeansResult dVar) {
                C45207h.this.mo159784a(dVar);
                iGetDataCallback.onSuccess(dVar);
            }
        });
    }

    public C45207h(int i) {
        this.f114407h = i;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.member_manage.impl.base.mvp.AbstractC45068a
    /* renamed from: c */
    public AbstractRunnableC45034a mo159465c(IGetDataCallback<SelectBeansResult> iGetDataCallback) {
        if (this.f114407h == 1) {
            return new C45196d(this.f114103a, mo159464b(iGetDataCallback));
        }
        List<String> list = this.f114411l;
        if (list != null) {
            return new C45233k(list, mo159464b(iGetDataCallback));
        }
        return new C45199f(this.f114103a, mo159464b(iGetDataCallback));
    }

    /* renamed from: a */
    public void mo159784a(SelectBeansResult dVar) {
        List<C45084c> b = dVar.mo159516b();
        ArrayList arrayList = new ArrayList(b.size());
        for (C45084c cVar : b) {
            if (cVar.mo159512g().mo159529e() != Chatter.ChatterType.BOT) {
                arrayList.add(cVar);
            }
        }
        b.clear();
        b.addAll(arrayList);
    }

    /* renamed from: a */
    public void mo159786a(List<String> list) {
        if (!CollectionUtils.isEmpty(list)) {
            List<C45084c> b = this.f114105c.mo159516b();
            ArrayList arrayList = new ArrayList();
            for (String str : list) {
                for (C45084c cVar : b) {
                    if (cVar.mo159513h().equals(str)) {
                        arrayList.add(cVar);
                    }
                }
            }
            b.removeAll(arrayList);
            this.f114107e.clear();
        }
    }

    @Override // com.ss.android.lark.member_manage.impl.show_member.common_group.C45190b.AbstractC45191a
    /* renamed from: b */
    public void mo159752b(List<String> list, IGetDataCallback<Map<String, Chatter>> iGetDataCallback) {
        if (this.f114411l != null) {
            this.f114108f.mo143784a(list, iGetDataCallback);
        }
    }

    @Override // com.ss.android.lark.member_manage.impl.show_member.common_group.C45190b.AbstractC45191a
    /* renamed from: a */
    public void mo159745a(long j, IGetDataCallback<Team> iGetDataCallback) {
        GroupMemberManageModule.m177902a().getTeamDependency().mo143777a(j, (IGetDataCallback) getCallbackManager().wrapAndAddCallback(iGetDataCallback));
    }

    @Override // com.ss.android.lark.member_manage.impl.show_member.common_group.C45190b.AbstractC45191a
    /* renamed from: b */
    public void mo159751b(final String str, final IGetDataCallback<Integer> iGetDataCallback) {
        CoreThreadPool.getDefault().getCachedThreadPool().execute(new Runnable() {
            /* class com.ss.android.lark.member_manage.impl.show_member.common_group.C45207h.RunnableC452125 */

            public void run() {
                Chat a = C45207h.this.f114410k.mo143743a(str);
                if (a != null && a.isEdu()) {
                    C45207h.this.f114410k.mo143764b(str, iGetDataCallback);
                }
            }
        });
    }

    @Override // com.ss.android.lark.member_manage.impl.show_member.common_group.C45190b.AbstractC45191a
    /* renamed from: c */
    public void mo159753c(List<String> list, IGetDataCallback<Map<String, ChatChatter>> iGetDataCallback) {
        if (this.f114409j != null) {
            this.f114108f.mo143783a(this.f114409j, list, (IGetDataCallback) getCallbackManager().wrapAndAddCallback(iGetDataCallback));
        }
    }

    /* renamed from: d */
    private void m179419d(List<String> list, IGetDataCallback<SelectMemberInitData> iGetDataCallback) {
        if (this.f114411l != null) {
            SelectMemberInitData selectMemberInitData = new SelectMemberInitData();
            Chat chat = new Chat();
            chat.setMemberCount(this.f114411l.size());
            selectMemberInitData.setChat(chat);
            this.f114103a = selectMemberInitData;
            if (iGetDataCallback != null) {
                iGetDataCallback.onSuccess(selectMemberInitData);
            }
        }
    }

    @Override // com.ss.android.lark.member_manage.impl.base.mvp.IGroupMemberBaseContract.AbstractC45065a
    /* renamed from: a */
    public void mo159434a(Bundle bundle, IGetDataCallback<SelectMemberInitData> iGetDataCallback) {
        this.f114409j = bundle.getString("key_chat_id");
        this.f114411l = bundle.getStringArrayList("key_chatter_ids");
        ArrayList<String> stringArrayList = bundle.getStringArrayList("key_checked_ids");
        C45195c cVar = new C45195c();
        cVar.mo159773a(bundle.getBoolean("key_filter_bot", true));
        if (this.f114411l != null) {
            m179419d(stringArrayList, iGetDataCallback);
        } else if (this.f114409j != null) {
            m179418a(cVar, stringArrayList, iGetDataCallback);
        }
    }

    /* renamed from: a */
    public void mo159783a(Chat chat, List<String> list) {
        if (!CollectionUtils.isEmpty(list)) {
            Map<String, Chatter> b = this.f114108f.mo143787b(list);
            List<C45084c> a = C45086f.m178890a(chat, new ArrayList(b.values()), this.f114108f.mo143779a(), new HashMap(), null);
            if (!CollectionUtils.isEmpty(a)) {
                for (C45084c cVar : a) {
                    this.f114107e.put(cVar.mo159513h(), cVar);
                }
            }
        }
    }

    @Override // com.ss.android.lark.member_manage.impl.show_member.common_group.C45190b.AbstractC45191a
    /* renamed from: a */
    public void mo159747a(String str, IGetDataCallback<Chat> iGetDataCallback) {
        this.f114410k.mo143771d(mo159756l().getId(), str, getCallbackManager().wrapAndAddGetDataCallback(iGetDataCallback));
    }

    @Override // com.ss.android.lark.member_manage.impl.base.mvp.IGroupMemberBaseContract.AbstractC45065a
    /* renamed from: a */
    public void mo159437a(String str, AbstractC45053b<List<C45084c>> bVar) {
        this.f114408i.mo159374a(this.f114109g, mo159466d(), str, mo159462a(bVar));
    }

    /* renamed from: a */
    private void m179418a(final C45195c cVar, final List<String> list, final IGetDataCallback<SelectMemberInitData> iGetDataCallback) {
        C57865c.m224574a(new C57865c.AbstractC57873d<SelectMemberInitData>() {
            /* class com.ss.android.lark.member_manage.impl.show_member.common_group.C45207h.C452092 */

            /* renamed from: a */
            public SelectMemberInitData produce() {
                SelectMemberInitData selectMemberInitData = new SelectMemberInitData();
                Chat a = C45207h.this.f114410k.mo143743a(C45207h.this.f114409j);
                C45207h.this.mo159783a(a, list);
                selectMemberInitData.setChat(a);
                selectMemberInitData.setSelectedIds(list);
                selectMemberInitData.setMemberFilter(cVar);
                return selectMemberInitData;
            }
        }, new C57865c.AbstractC57871b<SelectMemberInitData>() {
            /* class com.ss.android.lark.member_manage.impl.show_member.common_group.C45207h.C452103 */

            /* renamed from: a */
            public void consume(SelectMemberInitData selectMemberInitData) {
                C45207h.this.f114103a = selectMemberInitData;
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onSuccess(selectMemberInitData);
                }
            }
        });
    }

    @Override // com.ss.android.lark.member_manage.impl.show_member.common_group.C45190b.AbstractC45191a
    /* renamed from: a */
    public void mo159748a(String str, List<String> list, List<String> list2, IGetDataCallback<Boolean> iGetDataCallback) {
        this.f114410k.mo143759a(str, list, list2, getCallbackManager().wrapAndAddGetDataCallback(iGetDataCallback));
    }
}
