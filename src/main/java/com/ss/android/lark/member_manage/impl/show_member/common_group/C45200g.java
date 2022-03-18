package com.ss.android.lark.member_manage.impl.show_member.common_group;

import android.text.TextUtils;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.ChatChatter;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.member_manage.impl.base.mvp.AbstractC45074b;
import com.ss.android.lark.member_manage.impl.bean.C45084c;
import com.ss.android.lark.member_manage.impl.bean.SelectBeansResult;
import com.ss.android.lark.member_manage.impl.show_member.common_group.C45190b;
import com.ss.android.lark.member_manage.impl.show_member.common_group.C45200g;
import com.ss.android.lark.member_manage.impl.statistics.PerfGroupMemberMonitor;
import com.ss.android.lark.member_manage.impl.statistics.group.GroupHitPoint;
import com.ss.android.lark.utils.UIHelper;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.lark.member_manage.impl.show_member.common_group.g */
public class C45200g extends AbstractC45074b implements C45190b.AbstractC45193b.AbstractC45194a {

    /* renamed from: c */
    int f114395c;

    /* renamed from: d */
    public String f114396d;

    /* renamed from: e */
    C45190b.AbstractC45193b f114397e;

    /* renamed from: f */
    C45190b.AbstractC45191a f114398f;

    /* renamed from: g */
    private List<String> f114399g;

    @Override // com.ss.android.lark.member_manage.impl.base.mvp.IGroupMemberBaseContract.AbstractC45066b.AbstractC45067a
    /* renamed from: d */
    public void mo159458d(C45084c cVar) {
    }

    @Override // com.ss.android.lark.member_manage.impl.show_member.common_group.C45190b.AbstractC45193b.AbstractC45194a
    /* renamed from: g */
    public void mo159772g() {
        mo159776h();
    }

    /* renamed from: i */
    private void m179399i() {
        this.f114398f.mo159755k();
        this.f114397e.aW_();
    }

    /* renamed from: j */
    private void m179400j() {
        this.f114395c = 1;
        this.f114397e.aV_();
        this.f114398f.aT_();
    }

    /* renamed from: h */
    public void mo159776h() {
        this.f114395c = 2;
        this.f114397e.aU_();
        this.f114398f.mo159754j();
    }

    @Override // com.ss.android.lark.member_manage.impl.base.mvp.IGroupMemberBaseContract.AbstractC45066b.AbstractC45067a
    /* renamed from: e */
    public void mo159460e() {
        int i = this.f114395c;
        if (i == 1) {
            mo159771a(new ArrayList(this.f114398f.mo159441c().keySet()));
        } else if (i == 7) {
            m179396b(new ArrayList(this.f114398f.mo159441c().keySet()));
        }
    }

    @Override // com.ss.android.lark.member_manage.impl.base.mvp.IGroupMemberBaseContract.AbstractC45066b.AbstractC45067a
    /* renamed from: f */
    public void mo159461f() {
        int i = this.f114395c;
        if (i == 1) {
            mo159776h();
        } else if (i == 7) {
            Map<String, C45084c> c = this.f114398f.mo159441c();
            if (this.f114397e.mo159768i()) {
                m179399i();
            } else if (CollectionUtils.isEmpty(c)) {
                this.f114397e.mo159766c(new ArrayList());
            } else {
                m179396b(new ArrayList(c.keySet()));
            }
        } else if (i == 2) {
            GroupHitPoint.f114612b.mo159950a();
            m179400j();
        }
    }

    /* renamed from: c */
    private void m179397c(List<String> list) {
        this.f114398f.mo159752b(list, new UIGetDataCallback(new IGetDataCallback<Map<String, Chatter>>() {
            /* class com.ss.android.lark.member_manage.impl.show_member.common_group.C45200g.C452032 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
            }

            /* renamed from: a */
            public void onSuccess(Map<String, Chatter> map) {
                ArrayList arrayList = new ArrayList();
                for (Chatter chatter : map.values()) {
                    arrayList.add(new ChatChatter(chatter));
                }
                C45200g.this.f114397e.mo159766c(arrayList);
            }
        }));
    }

    /* renamed from: d */
    private void m179398d(List<String> list) {
        this.f114398f.mo159753c(list, new UIGetDataCallback(new IGetDataCallback<Map<String, ChatChatter>>() {
            /* class com.ss.android.lark.member_manage.impl.show_member.common_group.C45200g.C452043 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
            }

            /* renamed from: a */
            public void onSuccess(Map<String, ChatChatter> map) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(map.values());
                C45200g.this.f114397e.mo159766c(arrayList);
            }
        }));
    }

    /* renamed from: b */
    private void m179396b(List<String> list) {
        if (!TextUtils.isEmpty(this.f114396d)) {
            m179398d(list);
        } else if (!CollectionUtils.isEmpty(this.f114399g)) {
            m179397c(list);
        }
    }

    @Override // com.ss.android.lark.member_manage.impl.base.mvp.IGroupMemberBaseContract.AbstractC45066b.AbstractC45067a, com.ss.android.lark.member_manage.impl.base.mvp.AbstractC45074b
    /* renamed from: a */
    public void mo159453a(String str) {
        super.mo159453a(str);
        PerfGroupMemberMonitor.m179719a(PerfGroupMemberMonitor.ActionType.SEARCH);
    }

    @Override // com.ss.android.lark.member_manage.impl.base.mvp.IGroupMemberBaseContract.AbstractC45066b.AbstractC45067a
    /* renamed from: c */
    public void mo159456c(C45084c cVar) {
        if (this.f114395c == 7) {
            m179396b(Collections.singletonList(cVar.mo159513h()));
        } else {
            mo159473b(cVar);
        }
    }

    @Override // com.ss.android.lark.member_manage.impl.base.mvp.AbstractC45074b
    /* renamed from: b */
    public void mo159473b(C45084c cVar) {
        this.f114398f.mo159438a(cVar.mo159513h(), cVar.mo159512g().mo159533h(), new IGetDataCallback<Chatter>() {
            /* class com.ss.android.lark.member_manage.impl.show_member.common_group.C45200g.C452054 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
            }

            /* renamed from: a */
            public void onSuccess(final Chatter chatter) {
                UICallbackExecutor.execute(new Runnable() {
                    /* class com.ss.android.lark.member_manage.impl.show_member.common_group.C45200g.C452054.RunnableC452061 */

                    public void run() {
                        Chatter chatter = chatter;
                        if (chatter != null) {
                            if (!chatter.isProfileEnable()) {
                                Log.m165389i("ShowMemberDelegate", "unsupported click, do nothing here:" + chatter.getId());
                            } else if (chatter.isUser()) {
                                if (!TextUtils.isEmpty(C45200g.this.f114396d)) {
                                    Chat l = C45200g.this.f114398f.mo159756l();
                                    if (l != null) {
                                        C45200g.this.f114397e.mo159389a(chatter, C45200g.this.f114396d, l.getName());
                                    } else {
                                        C45200g.this.f114397e.mo159388a(chatter);
                                    }
                                } else {
                                    C45200g.this.f114397e.mo159388a(chatter);
                                }
                            } else if (chatter.isBot()) {
                                C45200g.this.f114397e.mo159407c(chatter.getId());
                            } else {
                                Log.m165383e("ShowMemberDelegate", "unsupported chatter type, do nothing here:" + chatter.getId());
                            }
                        }
                    }
                });
            }
        });
    }

    @Override // com.ss.android.lark.member_manage.impl.show_member.common_group.C45190b.AbstractC45193b.AbstractC45194a
    /* renamed from: a */
    public void mo159771a(List<String> list) {
        PerfGroupMemberMonitor.m179719a(PerfGroupMemberMonitor.ActionType.DELETE);
        this.f114398f.mo159749a(new ArrayList(list), new IGetDataCallback<Chat>() {
            /* class com.ss.android.lark.member_manage.impl.show_member.common_group.C45200g.C452011 */

            /* access modifiers changed from: private */
            /* renamed from: a */
            public /* synthetic */ void m179413a(ErrorResult errorResult) {
                C45200g.this.f114397e.mo159757a(errorResult);
            }

            /* renamed from: a */
            public void onSuccess(Chat chat) {
                UICallbackExecutor.execute(new Runnable() {
                    /* class com.ss.android.lark.member_manage.impl.show_member.common_group.C45200g.C452011.RunnableC452021 */

                    public void run() {
                        if (C45200g.this.f114395c == 2) {
                            C45200g.this.f114397e.mo159410d(UIHelper.getString(R.string.Lark_Legacy_RemovedToast));
                        }
                        C45200g.this.f114397e.mo159758a(C45200g.this.f114398f.mo159433a());
                        C45200g.this.mo159776h();
                    }
                });
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                UICallbackExecutor.execute(new Runnable(errorResult) {
                    /* class com.ss.android.lark.member_manage.impl.show_member.common_group.$$Lambda$g$1$C2iQOiFlCXjWCw2Ae9Xf0bQT_ic */
                    public final /* synthetic */ ErrorResult f$1;

                    {
                        this.f$1 = r2;
                    }

                    public final void run() {
                        C45200g.C452011.lambda$C2iQOiFlCXjWCw2Ae9Xf0bQT_ic(C45200g.C452011.this, this.f$1);
                    }
                });
            }
        });
    }

    @Override // com.ss.android.lark.member_manage.impl.show_member.common_group.C45190b.AbstractC45193b.AbstractC45194a
    /* renamed from: a */
    public void mo159770a(String str, IGetDataCallback<Chat> iGetDataCallback) {
        this.f114398f.mo159747a(str, iGetDataCallback);
    }

    @Override // com.ss.android.lark.member_manage.impl.show_member.common_group.C45190b.AbstractC45193b.AbstractC45194a
    /* renamed from: a */
    public void mo159769a(Chat chat, IGetDataCallback<SelectBeansResult> iGetDataCallback) {
        this.f114398f.mo159746a(chat);
        this.f114398f.mo159435a(iGetDataCallback);
    }

    public C45200g(C45190b.AbstractC45193b bVar, C45190b.AbstractC45191a aVar, int i, String str) {
        super(bVar, aVar);
        this.f114395c = i;
        this.f114396d = str;
        this.f114398f = aVar;
        this.f114397e = bVar;
    }

    public C45200g(C45190b.AbstractC45193b bVar, C45190b.AbstractC45191a aVar, int i, List<String> list) {
        super(bVar, aVar);
        this.f114395c = i;
        this.f114399g = list;
        this.f114398f = aVar;
        this.f114397e = bVar;
    }

    /* renamed from: a */
    public void mo159775a(String str, List<String> list, List<String> list2, IGetDataCallback<Boolean> iGetDataCallback) {
        this.f114398f.mo159748a(str, list, list2, iGetDataCallback);
    }
}
