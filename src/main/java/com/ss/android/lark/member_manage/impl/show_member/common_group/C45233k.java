package com.ss.android.lark.member_manage.impl.show_member.common_group;

import android.text.TextUtils;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.ChatChatter;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.member_manage.GroupMemberManageModule;
import com.ss.android.lark.member_manage.dto.GroupManageChatChatterResponse;
import com.ss.android.lark.member_manage.impl.base.p2258a.AbstractRunnableC45034a;
import com.ss.android.lark.member_manage.impl.bean.C45083b;
import com.ss.android.lark.member_manage.impl.bean.C45084c;
import com.ss.android.lark.member_manage.impl.bean.SelectBeansResult;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.ss.android.lark.member_manage.impl.show_member.common_group.k */
public class C45233k extends AbstractRunnableC45034a {

    /* renamed from: i */
    private List<String> f114477i;

    /* renamed from: j */
    private IGetDataCallback<SelectBeansResult> f114478j;

    /* renamed from: k */
    private List<ChatChatter> f114479k;

    /* renamed from: l */
    private HashMap<String, String> f114480l;

    @Override // com.ss.android.lark.member_manage.impl.base.p2258a.AbstractC45037b
    /* renamed from: b */
    public List<Chatter> mo159323b(List<Chatter> list) {
        return list;
    }

    @Override // com.ss.android.lark.member_manage.impl.base.p2258a.AbstractC45037b
    /* renamed from: c */
    public List<C45084c> mo159324c(List<C45084c> list) {
        return list;
    }

    @Override // com.ss.android.lark.member_manage.impl.base.p2258a.AbstractRunnableC45034a
    public void run() {
        if (this.f114478j != null && !CollectionUtils.isEmpty(this.f114477i)) {
            mo159310a();
        }
    }

    @Override // com.ss.android.lark.member_manage.impl.base.p2258a.AbstractRunnableC45034a
    /* renamed from: a */
    public void mo159310a() {
        List<Chatter> a = GroupMemberManageModule.m177902a().getChatterDependency().mo143780a(this.f114477i);
        ArrayList arrayList = new ArrayList();
        for (Chatter chatter : a) {
            arrayList.add(new ChatChatter(chatter));
        }
        if (m179502d(arrayList)) {
            m179503e(arrayList);
        } else {
            this.f114478j.onError(new ErrorResult("no result"));
        }
    }

    /* renamed from: d */
    private boolean m179502d(List<ChatChatter> list) {
        if (list == null) {
            return false;
        }
        return CollectionUtils.isNotEmpty(list);
    }

    /* renamed from: a */
    private List<C45084c> m179500a(C45083b bVar) {
        return mo159324c(mo159309a(mo159323b(new ArrayList(bVar.mo159492a())), bVar.mo159500d(), bVar.mo159501e(), bVar.mo159497b()));
    }

    /* renamed from: e */
    private void m179503e(List<ChatChatter> list) {
        C45083b f = m179504f(list);
        for (C45084c cVar : mo159308a((List<ChatChatter>) new ArrayList())) {
            this.f114032c.put(cVar.mo159513h(), cVar);
        }
        UICallbackExecutor.execute(new Runnable(f, m179500a(f)) {
            /* class com.ss.android.lark.member_manage.impl.show_member.common_group.$$Lambda$k$nUDs9g6iBwiw2FIESufBFl9v_c */
            public final /* synthetic */ C45083b f$1;
            public final /* synthetic */ List f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void run() {
                C45233k.this.m179501a(this.f$1, this.f$2);
            }
        });
    }

    /* renamed from: f */
    private C45083b m179504f(List<ChatChatter> list) {
        C45083b bVar = new C45083b();
        this.f114479k = list;
        bVar.mo159494a(new ArrayList(this.f114479k));
        bVar.mo159496a(false);
        this.f114480l = new HashMap<>();
        for (ChatChatter chatChatter : list) {
            String namePy = chatChatter.getChatter().getNamePy();
            if (!TextUtils.isEmpty(namePy) && namePy.length() > 0) {
                this.f114480l.put(chatChatter.getId(), namePy.substring(0, 1).toUpperCase());
            }
        }
        bVar.mo159495a(this.f114480l);
        return bVar;
    }

    public C45233k(List<String> list, IGetDataCallback<SelectBeansResult> iGetDataCallback) {
        super(iGetDataCallback, "", new Chat(), true);
        this.f114478j = iGetDataCallback;
        this.f114477i = list;
    }

    /* access modifiers changed from: private */
    @Override // com.ss.android.lark.member_manage.impl.base.p2258a.AbstractRunnableC45034a
    /* renamed from: a */
    public /* synthetic */ void m179501a(C45083b bVar, List list) {
        this.f114478j.onSuccess(new SelectBeansResult(bVar.mo159499c(), list, this.f114032c, CollectionUtils.isNotEmpty(bVar.mo159500d())));
    }

    @Override // com.ss.android.lark.member_manage.impl.base.p2258a.AbstractRunnableC45034a
    /* renamed from: a */
    public void mo159313a(String str, String str2, IGetDataCallback<GroupManageChatChatterResponse> iGetDataCallback) {
        boolean z;
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        List<ChatChatter> list = this.f114479k;
        if (!(list == null || this.f114480l == null)) {
            for (ChatChatter chatChatter : list) {
                boolean z2 = true;
                if (TextUtils.isEmpty(chatChatter.getNamePy()) || !chatChatter.getNamePy().contains(str2)) {
                    z = false;
                } else {
                    z = true;
                }
                if (TextUtils.isEmpty(chatChatter.getLocalizedName()) || !chatChatter.getLocalizedName().contains(str2)) {
                    z2 = false;
                }
                if (z || z2) {
                    arrayList.add(chatChatter);
                    hashMap.put(chatChatter.getId(), this.f114480l.get(chatChatter.getId()));
                }
            }
        }
        iGetDataCallback.onSuccess(new GroupManageChatChatterResponse(arrayList.size(), false, "", arrayList, hashMap, null));
    }
}
