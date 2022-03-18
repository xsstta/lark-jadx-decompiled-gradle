package com.ss.android.lark.chatsetting.impl.group.setting;

import android.app.Activity;
import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.larksuite.framework.callback.C25975i;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.larksuite.framework.mvp.BasePresenter;
import com.larksuite.framework.thread.CoreThreadPool;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chat.ChatSetting;
import com.ss.android.lark.chat.entity.chat.TeamChatType;
import com.ss.android.lark.chat.entity.chatter.ChatChatter;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.chatsetting.ChatSettingModule;
import com.ss.android.lark.chatsetting.dto.Shortcut;
import com.ss.android.lark.chatsetting.impl.C34501a;
import com.ss.android.lark.chatsetting.impl.group.setting.C34947f;
import com.ss.android.lark.chatsetting.impl.group.setting.C34950g;
import com.ss.android.lark.chatsetting.impl.group.setting.C34965i;
import com.ss.android.lark.chatsetting.impl.group.setting.GroupSettingView;
import com.ss.android.lark.chatsetting.impl.statistics.ChatSettingHitPointNew;
import com.ss.android.lark.chatsetting.impl.statistics.ChatStatisticUtil;
import com.ss.android.lark.chatsetting.impl.statistics.group.GroupHitPoint;
import com.ss.android.lark.chatsetting.impl.statistics.ownership.OwnershipHitPoint;
import com.ss.android.lark.chatsetting.impl.statistics.setting.SettingHitPoint;
import com.ss.android.lark.chatsetting.p1693a.AbstractC34461c;
import com.ss.android.lark.chatsetting.p1693a.C34457a;
import com.ss.android.lark.desktopmode.p1787a.C36516a;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.team.entity.Team;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.utils.rxjava.C57865c;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.lark.chatsetting.impl.group.setting.g */
public class C34950g extends BasePresenter<C34965i.AbstractC34966a, C34965i.AbstractC34968b, C34965i.AbstractC34968b.AbstractC34969a> {

    /* renamed from: a */
    public AbstractC34461c.AbstractC34476o f90239a = ChatSettingModule.m133639a().mo127277g();

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        super.destroy();
    }

    /* renamed from: e */
    private C34965i.AbstractC34966a.AbstractC34967a m136052e() {
        return new C34965i.AbstractC34966a.AbstractC34967a() {
            /* class com.ss.android.lark.chatsetting.impl.group.setting.C34950g.C349602 */

            /* access modifiers changed from: private */
            /* access modifiers changed from: public */
            /* renamed from: b */
            private /* synthetic */ void m136088b() {
                ((C34965i.AbstractC34968b) C34950g.this.getView()).mo128785a();
            }

            @Override // com.ss.android.lark.chatsetting.impl.group.setting.C34965i.AbstractC34966a.AbstractC34967a
            /* renamed from: a */
            public void mo128912a() {
                UICallbackExecutor.execute(new Runnable() {
                    /* class com.ss.android.lark.chatsetting.impl.group.setting.$$Lambda$g$2$79MfA951TlugqEcwnIwpz7LPVk */

                    public final void run() {
                        C34950g.C349602.this.m136088b();
                    }
                });
            }

            /* access modifiers changed from: private */
            /* access modifiers changed from: public */
            /* renamed from: c */
            private /* synthetic */ void m136093c(boolean z) {
                ((C34965i.AbstractC34968b) C34950g.this.getView()).mo128821g(z);
            }

            /* access modifiers changed from: private */
            /* access modifiers changed from: public */
            /* renamed from: d */
            private /* synthetic */ void m136094d(boolean z) {
                ((C34965i.AbstractC34968b) C34950g.this.getView()).mo128807b(z);
            }

            /* access modifiers changed from: private */
            /* access modifiers changed from: public */
            /* renamed from: b */
            private /* synthetic */ void m136089b(Chat chat) {
                ((C34965i.AbstractC34968b) C34950g.this.getView()).mo128813d(chat.isInBox());
            }

            @Override // com.ss.android.lark.chatsetting.impl.group.setting.C34965i.AbstractC34966a.AbstractC34967a
            /* renamed from: a */
            public void mo128913a(Chat chat) {
                UICallbackExecutor.execute(new Runnable(chat) {
                    /* class com.ss.android.lark.chatsetting.impl.group.setting.$$Lambda$g$2$yc_MAg2AqoyTyHWExtCmMSNEpco */
                    public final /* synthetic */ Chat f$1;

                    {
                        this.f$1 = r2;
                    }

                    public final void run() {
                        C34950g.C349602.this.m136089b((C34950g.C349602) this.f$1);
                    }
                });
            }

            /* access modifiers changed from: private */
            /* access modifiers changed from: public */
            /* renamed from: b */
            private /* synthetic */ void m136092b(List list) {
                ((C34965i.AbstractC34968b) C34950g.this.getView()).mo128794a(((C34965i.AbstractC34966a) C34950g.this.getModel()).mo128744a(), list);
            }

            @Override // com.ss.android.lark.chatsetting.impl.group.setting.C34965i.AbstractC34966a.AbstractC34967a
            /* renamed from: a */
            public void mo128916a(List<ChatChatter> list) {
                UICallbackExecutor.execute(new Runnable(list) {
                    /* class com.ss.android.lark.chatsetting.impl.group.setting.$$Lambda$g$2$TwgBwPuP0yR6SFiBilAqqIOdgNQ */
                    public final /* synthetic */ List f$1;

                    {
                        this.f$1 = r2;
                    }

                    public final void run() {
                        C34950g.C349602.this.m136092b((C34950g.C349602) this.f$1);
                    }
                });
            }

            @Override // com.ss.android.lark.chatsetting.impl.group.setting.C34965i.AbstractC34966a.AbstractC34967a
            /* renamed from: a */
            public void mo128917a(boolean z) {
                UICallbackExecutor.execute(new Runnable(z) {
                    /* class com.ss.android.lark.chatsetting.impl.group.setting.$$Lambda$g$2$bIAeDK6AQWOwErG64cduVPXmGr4 */
                    public final /* synthetic */ boolean f$1;

                    {
                        this.f$1 = r2;
                    }

                    public final void run() {
                        C34950g.C349602.this.m136094d(this.f$1);
                    }
                });
            }

            @Override // com.ss.android.lark.chatsetting.impl.group.setting.C34965i.AbstractC34966a.AbstractC34967a
            /* renamed from: b */
            public void mo128918b(boolean z) {
                UICallbackExecutor.execute(new Runnable(z) {
                    /* class com.ss.android.lark.chatsetting.impl.group.setting.$$Lambda$g$2$2QEvp2CSVfXyu3fzZk2F14AWxYI */
                    public final /* synthetic */ boolean f$1;

                    {
                        this.f$1 = r2;
                    }

                    public final void run() {
                        C34950g.C349602.this.m136093c(this.f$1);
                    }
                });
            }

            /* access modifiers changed from: private */
            /* access modifiers changed from: public */
            /* renamed from: b */
            private /* synthetic */ void m136091b(Chat chat, Team team) {
                ((C34965i.AbstractC34968b) C34950g.this.getView()).mo128792a(chat, team);
            }

            @Override // com.ss.android.lark.chatsetting.impl.group.setting.C34965i.AbstractC34966a.AbstractC34967a
            /* renamed from: a */
            public void mo128915a(Chat chat, Team team) {
                UICallbackExecutor.execute(new Runnable(chat, team) {
                    /* class com.ss.android.lark.chatsetting.impl.group.setting.$$Lambda$g$2$M0FeDlmPSeKhnfWaAqQCu2phgs */
                    public final /* synthetic */ Chat f$1;
                    public final /* synthetic */ Team f$2;

                    {
                        this.f$1 = r2;
                        this.f$2 = r3;
                    }

                    public final void run() {
                        C34950g.C349602.this.m136091b(this.f$1, this.f$2);
                    }
                });
            }

            /* access modifiers changed from: private */
            /* access modifiers changed from: public */
            /* renamed from: b */
            private /* synthetic */ void m136090b(Chat chat, Chat chat2, List list) {
                ((C34965i.AbstractC34968b) C34950g.this.getView()).mo128790a(chat, chat2, list);
            }

            @Override // com.ss.android.lark.chatsetting.impl.group.setting.C34965i.AbstractC34966a.AbstractC34967a
            /* renamed from: a */
            public void mo128914a(Chat chat, Chat chat2, List<ChatChatter> list) {
                UICallbackExecutor.execute(new Runnable(chat, chat2, list) {
                    /* class com.ss.android.lark.chatsetting.impl.group.setting.$$Lambda$g$2$dPsrB8GYmVvX1e8N1Ca9Zc53yk */
                    public final /* synthetic */ Chat f$1;
                    public final /* synthetic */ Chat f$2;
                    public final /* synthetic */ List f$3;

                    {
                        this.f$1 = r2;
                        this.f$2 = r3;
                        this.f$3 = r4;
                    }

                    public final void run() {
                        C34950g.C349602.this.m136090b(this.f$1, this.f$2, this.f$3);
                    }
                });
            }
        };
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C34965i.AbstractC34968b.AbstractC34969a createViewDelegate() {
        return new C34965i.AbstractC34968b.AbstractC34969a() {
            /* class com.ss.android.lark.chatsetting.impl.group.setting.C34950g.C349511 */

            @Override // com.ss.android.lark.chatsetting.impl.group.setting.C34965i.AbstractC34968b.AbstractC34969a
            /* renamed from: f */
            public boolean mo128898f() {
                return ((C34965i.AbstractC34966a) C34950g.this.getModel()).mo128773g();
            }

            @Override // com.ss.android.lark.chatsetting.impl.group.setting.C34965i.AbstractC34968b.AbstractC34969a
            /* renamed from: h */
            public boolean mo128900h() {
                return ((C34965i.AbstractC34966a) C34950g.this.getModel()).mo128772f();
            }

            @Override // com.ss.android.lark.chatsetting.impl.group.setting.C34965i.AbstractC34968b.AbstractC34969a
            /* renamed from: l */
            public Team mo128904l() {
                return ((C34965i.AbstractC34966a) C34950g.this.getModel()).mo128759b();
            }

            @Override // com.ss.android.lark.chatsetting.impl.group.setting.C34965i.AbstractC34968b.AbstractC34969a
            /* renamed from: m */
            public boolean mo128905m() {
                return ((C34965i.AbstractC34966a) C34950g.this.getModel()).mo128767c();
            }

            @Override // com.ss.android.lark.chatsetting.impl.group.setting.C34965i.AbstractC34968b.AbstractC34969a
            /* renamed from: e */
            public void mo128895e() {
                GroupHitPoint.f90519a.mo129260m(C34950g.this.mo128885d());
                C34950g.this.mo128884c();
            }

            @Override // com.ss.android.lark.chatsetting.impl.group.setting.C34965i.AbstractC34968b.AbstractC34969a
            /* renamed from: k */
            public boolean mo128903k() {
                Chat d = C34950g.this.mo128885d();
                if (d == null || !d.isTeam()) {
                    return false;
                }
                return true;
            }

            @Override // com.ss.android.lark.chatsetting.impl.group.setting.C34965i.AbstractC34968b.AbstractC34969a
            /* renamed from: n */
            public boolean mo128906n() {
                return ((C34965i.AbstractC34966a) C34950g.this.getModel()).mo128744a().isRemind();
            }

            @Override // com.ss.android.lark.chatsetting.impl.group.setting.C34965i.AbstractC34968b.AbstractC34969a
            /* renamed from: a */
            public void mo128886a() {
                GroupHitPoint.f90519a.mo129241g();
                Chat a = ((C34965i.AbstractC34966a) C34950g.this.getModel()).mo128744a();
                if (a.isEdu()) {
                    GroupHitPoint.f90519a.mo129215a(true);
                }
                ((C34965i.AbstractC34968b) C34950g.this.getView()).mo128814e(a);
            }

            @Override // com.ss.android.lark.chatsetting.impl.group.setting.C34965i.AbstractC34968b.AbstractC34969a
            /* renamed from: d */
            public void mo128893d() {
                Chat a = ((C34965i.AbstractC34966a) C34950g.this.getModel()).mo128744a();
                GroupHitPoint.f90519a.mo129249i(a.getId());
                ChatSettingHitPointNew.m136622a(ChatSettingHitPointNew.ChatSettingClickParams.IM_GROUP_MANAGE_VIEW);
                ((C34965i.AbstractC34968b) C34950g.this.getView()).mo128820g(a);
            }

            @Override // com.ss.android.lark.chatsetting.impl.group.setting.C34965i.AbstractC34968b.AbstractC34969a
            /* renamed from: j */
            public void mo128902j() {
                boolean z;
                Chat d = C34950g.this.mo128885d();
                GroupHitPoint.f90519a.mo129230d(d);
                Team l = mo128904l();
                if (d == null || l == null || !String.valueOf(l.getDefaultChatId()).equals(d.getId())) {
                    z = false;
                } else {
                    z = true;
                }
                ((C34965i.AbstractC34968b) C34950g.this.getView()).mo128805b(d, z);
            }

            @Override // com.ss.android.lark.chatsetting.impl.group.setting.C34965i.AbstractC34968b.AbstractC34969a
            /* renamed from: c */
            public void mo128891c() {
                Chat a = ((C34965i.AbstractC34966a) C34950g.this.getModel()).mo128744a();
                if (a != null) {
                    GroupHitPoint.f90519a.mo129251j(a);
                    ChatSettingHitPointNew.m136622a(ChatSettingHitPointNew.ChatSettingClickParams.IM_GROUP_MEMBER_VIEW);
                    Team b = ((C34965i.AbstractC34966a) C34950g.this.getModel()).mo128759b();
                    if (b == null || !a.isTeam() || a.getTeamChatType() != TeamChatType.TEAM_CHAT_TYPE_PRIVATE) {
                        ((C34965i.AbstractC34968b) C34950g.this.getView()).mo128818f(a);
                    } else {
                        ((C34965i.AbstractC34968b) C34950g.this.getView()).mo128797a(b, a);
                    }
                }
            }

            @Override // com.ss.android.lark.chatsetting.impl.group.setting.C34965i.AbstractC34968b.AbstractC34969a
            /* renamed from: g */
            public void mo128899g() {
                String id = ((C34965i.AbstractC34966a) C34950g.this.getModel()).mo128744a().getId();
                SettingHitPoint.f90520a.mo129275b(id);
                HashMap hashMap = new HashMap();
                hashMap.put(ShareHitPoint.f121869d, "chat");
                HashMap hashMap2 = new HashMap();
                hashMap2.put("chat_id", id);
                hashMap.put("params", Uri.encode(JSONObject.toJSONString(hashMap2)));
                ((C34965i.AbstractC34968b) C34950g.this.getView()).mo128806b(C34501a.m133931a(hashMap));
            }

            @Override // com.ss.android.lark.chatsetting.impl.group.setting.C34965i.AbstractC34968b.AbstractC34969a
            /* renamed from: i */
            public void mo128901i() {
                Chat d = C34950g.this.mo128885d();
                OwnershipHitPoint.f90525a.mo129286a("manage_group_secret", d.getId());
                GroupHitPoint.f90519a.mo129245h();
                GroupHitPoint.f90519a.mo129227c(d.getId());
                if (d.getMemberCount() == 1) {
                    ((C34965i.AbstractC34968b) C34950g.this.getView()).mo128787a(R.string.Lark_Legacy_ChangeOwner, R.string.Lark_Legacy_ChatGroupInfoTransferOnlyownerContent);
                } else {
                    ((C34965i.AbstractC34968b) C34950g.this.getView()).mo128809c(d);
                }
            }

            @Override // com.ss.android.lark.chatsetting.impl.group.setting.C34965i.AbstractC34968b.AbstractC34969a
            /* renamed from: b */
            public void mo128889b() {
                int i;
                Log.m165388i("click leave group");
                Chat a = ((C34965i.AbstractC34966a) C34950g.this.getModel()).mo128744a();
                if (a == null) {
                    Log.m165382e("leave group failed: current chat is null");
                    ((C34965i.AbstractC34968b) C34950g.this.getView()).mo128786a(R.string.Lark_Legacy_Groupfail);
                    return;
                }
                GroupHitPoint.f90519a.mo129247i();
                int d = ((C34965i.AbstractC34966a) C34950g.this.getModel()).mo128768d();
                boolean a2 = ChatSettingModule.m133639a().mo127282l().mo127309a(d);
                if (C34950g.this.f90239a.mo127413a(a.getOwnerId()) && a.getMemberCount() > 1) {
                    Log.m165388i("leave group gotoGroupQuitActivity");
                    ((C34965i.AbstractC34968b) C34950g.this.getView()).mo128795a(a, a2);
                } else if (!C34950g.this.f90239a.mo127413a(a.getOwnerId()) || a.getMemberCount() != 1) {
                    Log.m165388i("leave group showQuitConfirmDialog");
                    if (((C34965i.AbstractC34966a) C34950g.this.getModel()).mo128774h() == null) {
                        i = 0;
                    } else {
                        i = ((C34965i.AbstractC34966a) C34950g.this.getModel()).mo128774h().getOnCallRole();
                    }
                    ((C34965i.AbstractC34968b) C34950g.this.getView()).mo128788a(a, d, i);
                } else {
                    Log.m165389i("GroupSettingPresenter", "show dissolve dialog");
                    ((C34965i.AbstractC34968b) C34950g.this.getView()).mo128822h(a);
                }
            }

            @Override // com.ss.android.lark.chatsetting.impl.group.setting.C34965i.AbstractC34968b.AbstractC34969a
            /* renamed from: a */
            public void mo128887a(Chat.MessagePosition messagePosition) {
                ((C34965i.AbstractC34966a) C34950g.this.getModel()).mo128747a(messagePosition, new UIGetDataCallback(new IGetDataCallback<Chat>() {
                    /* class com.ss.android.lark.chatsetting.impl.group.setting.C34950g.C349511.C349543 */

                    /* renamed from: a */
                    public void onSuccess(Chat chat) {
                        if (chat != null) {
                            ((C34965i.AbstractC34968b) C34950g.this.getView()).mo128789a(chat, chat.getMessagePosition());
                        }
                    }

                    @Override // com.larksuite.framework.callback.IGetDataCallback
                    public void onError(ErrorResult errorResult) {
                        Log.m165383e("GroupSettingPresenter", "update MessagePosition failed");
                        ((C34965i.AbstractC34968b) C34950g.this.getView()).mo128789a(((C34965i.AbstractC34966a) C34950g.this.getModel()).mo128744a(), ((C34965i.AbstractC34966a) C34950g.this.getModel()).mo128744a().getMessagePosition());
                    }
                }));
            }

            @Override // com.ss.android.lark.chatsetting.impl.group.setting.C34965i.AbstractC34968b.AbstractC34969a
            /* renamed from: b */
            public void mo128890b(final boolean z) {
                ((C34965i.AbstractC34966a) C34950g.this.getModel()).mo128758a(z, new UIGetDataCallback(new IGetDataCallback<Shortcut>() {
                    /* class com.ss.android.lark.chatsetting.impl.group.setting.C34950g.C349511.C349532 */

                    /* renamed from: a */
                    public void onSuccess(Shortcut shortcut) {
                    }

                    @Override // com.larksuite.framework.callback.IGetDataCallback
                    public void onError(ErrorResult errorResult) {
                        ((C34965i.AbstractC34968b) C34950g.this.getView()).mo128807b(!z);
                    }
                }));
            }

            @Override // com.ss.android.lark.chatsetting.impl.group.setting.C34965i.AbstractC34968b.AbstractC34969a
            /* renamed from: c */
            public void mo128892c(final boolean z) {
                ((C34965i.AbstractC34966a) C34950g.this.getModel()).mo128766c(z, new IGetDataCallback<Object>() {
                    /* class com.ss.android.lark.chatsetting.impl.group.setting.C34950g.C349511.C349554 */

                    @Override // com.larksuite.framework.callback.IGetDataCallback, com.larksuite.framework.callback.IRequestCallback
                    public void onSuccess(Object obj) {
                    }

                    @Override // com.larksuite.framework.callback.IGetDataCallback
                    public void onError(ErrorResult errorResult) {
                        Log.m165382e("changeChatBoxSetting fail : " + errorResult.toString());
                        ((C34965i.AbstractC34968b) C34950g.this.getView()).mo128810c(z ^ true);
                    }
                });
            }

            @Override // com.ss.android.lark.chatsetting.impl.group.setting.C34965i.AbstractC34968b.AbstractC34969a
            /* renamed from: f */
            public void mo128897f(final boolean z) {
                GroupHitPoint.f90519a.mo129255k(C34950g.this.mo128885d().getId());
                ((C34965i.AbstractC34966a) C34950g.this.getModel()).mo128769d(new IGetDataCallback<Chat>() {
                    /* class com.ss.android.lark.chatsetting.impl.group.setting.C34950g.C349511.C349598 */

                    /* renamed from: a */
                    public void onSuccess(Chat chat) {
                        ((C34965i.AbstractC34968b) C34950g.this.getView()).mo128801b();
                        ChatStatisticUtil.m136661c(chat);
                        if (chat.isTenant()) {
                            GroupHitPoint.f90519a.mo129218b();
                        } else if (chat.is_department()) {
                            GroupHitPoint.f90519a.mo129206a();
                        } else {
                            GroupHitPoint.f90519a.mo129208a(chat);
                        }
                    }

                    @Override // com.larksuite.framework.callback.IGetDataCallback
                    public void onError(ErrorResult errorResult) {
                        if (z) {
                            ((C34965i.AbstractC34968b) C34950g.this.getView()).mo128798a(UIHelper.getString(R.string.Lark_Legacy_EndFailed));
                        } else {
                            ((C34965i.AbstractC34968b) C34950g.this.getView()).mo128798a(errorResult.getDisplayMsg(UIHelper.getString(R.string.Lark_Legacy_DissolveGroupFailed)));
                        }
                    }
                });
            }

            @Override // com.ss.android.lark.chatsetting.impl.group.setting.C34965i.AbstractC34968b.AbstractC34969a
            /* renamed from: e */
            public void mo128896e(boolean z) {
                if (z) {
                    ((C34965i.AbstractC34966a) C34950g.this.getModel()).mo128760b(new UIGetDataCallback(new IGetDataCallback<Object>() {
                        /* class com.ss.android.lark.chatsetting.impl.group.setting.C34950g.C349511.C349576 */

                        @Override // com.larksuite.framework.callback.IGetDataCallback, com.larksuite.framework.callback.IRequestCallback
                        public void onSuccess(Object obj) {
                        }

                        @Override // com.larksuite.framework.callback.IGetDataCallback
                        public void onError(ErrorResult errorResult) {
                            Log.m165382e("favorite topic group failed:" + errorResult);
                            ((C34965i.AbstractC34968b) C34950g.this.getView()).mo128821g(((C34965i.AbstractC34966a) C34950g.this.getModel()).mo128775i());
                            if (!TextUtils.isEmpty(errorResult.getDisplayMsg())) {
                                ((C34965i.AbstractC34968b) C34950g.this.getView()).mo128798a(errorResult.getDisplayMsg());
                            }
                        }
                    }));
                } else {
                    ((C34965i.AbstractC34966a) C34950g.this.getModel()).mo128764c(new UIGetDataCallback(new IGetDataCallback<Object>() {
                        /* class com.ss.android.lark.chatsetting.impl.group.setting.C34950g.C349511.C349587 */

                        @Override // com.larksuite.framework.callback.IGetDataCallback, com.larksuite.framework.callback.IRequestCallback
                        public void onSuccess(Object obj) {
                        }

                        @Override // com.larksuite.framework.callback.IGetDataCallback
                        public void onError(ErrorResult errorResult) {
                            Log.m165382e("cancel topic group favorite failed:" + errorResult);
                            ((C34965i.AbstractC34968b) C34950g.this.getView()).mo128821g(((C34965i.AbstractC34966a) C34950g.this.getModel()).mo128775i());
                            if (!TextUtils.isEmpty(errorResult.getDisplayMsg())) {
                                ((C34965i.AbstractC34968b) C34950g.this.getView()).mo128798a(errorResult.getDisplayMsg());
                            }
                        }
                    }));
                }
            }

            @Override // com.ss.android.lark.chatsetting.impl.group.setting.C34965i.AbstractC34968b.AbstractC34969a
            /* renamed from: a */
            public void mo128888a(final boolean z) {
                ((C34965i.AbstractC34966a) C34950g.this.getModel()).mo128763b(z, new UIGetDataCallback(new IGetDataCallback<ChatSetting>() {
                    /* class com.ss.android.lark.chatsetting.impl.group.setting.C34950g.C349511.C349521 */

                    /* renamed from: a */
                    public void onSuccess(ChatSetting chatSetting) {
                        ((C34965i.AbstractC34968b) C34950g.this.getView()).mo128799a(chatSetting.isRemind());
                    }

                    @Override // com.larksuite.framework.callback.IGetDataCallback
                    public void onError(ErrorResult errorResult) {
                        ((C34965i.AbstractC34968b) C34950g.this.getView()).mo128798a(errorResult.getDisplayMsg(UIHelper.getString(R.string.Lark_Legacy_ChatGroupInfoSetReminderFailed)));
                        ((C34965i.AbstractC34968b) C34950g.this.getView()).mo128799a(!z);
                    }
                }));
            }

            @Override // com.ss.android.lark.chatsetting.impl.group.setting.C34965i.AbstractC34968b.AbstractC34969a
            /* renamed from: d */
            public void mo128894d(boolean z) {
                SettingHitPoint.f90520a.mo129264a();
                SettingHitPoint.f90520a.mo129280e(C34950g.this.mo128885d(), z);
                ((C34965i.AbstractC34966a) C34950g.this.getModel()).mo128770d(z, new UIGetDataCallback(new IGetDataCallback<Chat>() {
                    /* class com.ss.android.lark.chatsetting.impl.group.setting.C34950g.C349511.C349565 */

                    /* renamed from: a */
                    public void onSuccess(Chat chat) {
                    }

                    @Override // com.larksuite.framework.callback.IGetDataCallback
                    public void onError(ErrorResult errorResult) {
                        Log.m165382e("change auto translate setting failed:" + errorResult);
                        ((C34965i.AbstractC34968b) C34950g.this.getView()).mo128819f(((C34965i.AbstractC34966a) C34950g.this.getModel()).mo128744a().isAutoTranslate());
                        if (!TextUtils.isEmpty(errorResult.getDisplayMsg())) {
                            ((C34965i.AbstractC34968b) C34950g.this.getView()).mo128798a(errorResult.getDisplayMsg());
                        }
                    }
                }));
            }
        };
    }

    /* renamed from: d */
    public Chat mo128885d() {
        return ((C34965i.AbstractC34966a) getModel()).mo128744a();
    }

    /* renamed from: a */
    public void mo128877a() {
        ((C34965i.AbstractC34968b) getView()).mo128802b(((C34965i.AbstractC34966a) getModel()).mo128744a());
    }

    /* renamed from: c */
    public void mo128884c() {
        final Chat a = ((C34965i.AbstractC34966a) getModel()).mo128744a();
        if (a != null) {
            C34457a.m133685a().mo127255b(a.getId(), true);
            Long.toString(new Date().getTime());
            ((C34965i.AbstractC34966a) getModel()).mo128756a(a.getId(), Collections.singleton(ChatSettingModule.m133639a().mo127277g().mo127412a()), new UIGetDataCallback(new IGetDataCallback<Chat>() {
                /* class com.ss.android.lark.chatsetting.impl.group.setting.C34950g.C349635 */

                /* renamed from: a */
                public void onSuccess(Chat chat) {
                    ChatStatisticUtil.m136663d(a);
                    if (a.isMeeting()) {
                        ChatSettingModule.m133639a().mo127282l().mo127306a();
                    }
                }

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    ((C34965i.AbstractC34968b) C34950g.this.getView()).mo128798a(errorResult.getDisplayMsg(UIHelper.getString(R.string.Lark_Legacy_Groupfail)));
                    C34457a.m133685a().mo127255b(a.getId(), false);
                }
            }));
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: c */
    private /* synthetic */ C34947f.C34949a m136051c(String str) {
        return ((C34965i.AbstractC34966a) getModel()).mo128745a(str);
    }

    /* renamed from: b */
    private void m136049b(String str) {
        CoreThreadPool.getDefault().getCachedThreadPool().execute(new Runnable(str, new C25975i(new IGetDataCallback<C34947f.C34949a>() {
            /* class com.ss.android.lark.chatsetting.impl.group.setting.C34950g.C349613 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Log.m165386e("GroupSettingPresenter", errorResult);
            }

            /* renamed from: a */
            public void onSuccess(C34947f.C34949a aVar) {
                if (aVar != null) {
                    ((C34965i.AbstractC34966a) C34950g.this.getModel()).mo128757a(aVar.f90233c);
                    ((C34965i.AbstractC34968b) C34950g.this.getView()).mo128804b(aVar.f90232b, aVar.f90233c);
                }
            }
        })) {
            /* class com.ss.android.lark.chatsetting.impl.group.setting.$$Lambda$g$uckn2a8cm0IYvHV42rtTRlKdbo */
            public final /* synthetic */ String f$1;
            public final /* synthetic */ IGetDataCallback f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void run() {
                C34950g.this.m136048a((C34950g) this.f$1, (String) this.f$2);
            }
        });
    }

    /* renamed from: a */
    public void mo128878a(final ChatSetting chatSetting) {
        ((C34965i.AbstractC34966a) getModel()).mo128746a(new UIGetDataCallback(new IGetDataCallback<Map<String, ChatSetting>>() {
            /* class com.ss.android.lark.chatsetting.impl.group.setting.C34950g.C349624 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                ((C34965i.AbstractC34968b) C34950g.this.getView()).mo128798a(errorResult.getDisplayMsg(UIHelper.getString(R.string.Lark_Legacy_GetGroupSettingFail)));
                ((C34965i.AbstractC34968b) C34950g.this.getView()).mo128799a(C34950g.this.mo128883b(chatSetting));
            }

            /* renamed from: a */
            public void onSuccess(Map<String, ChatSetting> map) {
                Chat a = ((C34965i.AbstractC34966a) C34950g.this.getModel()).mo128744a();
                if (map == null || map.get(a.getId()) == null) {
                    ((C34965i.AbstractC34968b) C34950g.this.getView()).mo128799a(C34950g.this.mo128883b(chatSetting));
                } else {
                    ((C34965i.AbstractC34968b) C34950g.this.getView()).mo128799a(map.get(a.getId()).isRemind());
                }
            }
        }));
    }

    /* renamed from: b */
    public boolean mo128883b(ChatSetting chatSetting) {
        if (chatSetting != null) {
            return chatSetting.isRemind();
        }
        Log.m165382e("chatSetting is null");
        return true;
    }

    /* renamed from: a */
    public void mo128879a(Chatter chatter) {
        ((C34965i.AbstractC34966a) getModel()).mo128751a(chatter, new UIGetDataCallback(new IGetDataCallback<Chat>() {
            /* class com.ss.android.lark.chatsetting.impl.group.setting.C34950g.C349646 */

            /* renamed from: a */
            public void onSuccess(Chat chat) {
                ChatStatisticUtil.m136658a(chat, "chat_manage");
                ((C34965i.AbstractC34968b) C34950g.this.getView()).mo128786a(R.string.Lark_Legacy_ChangeOwnerSuccess);
                ((C34965i.AbstractC34968b) C34950g.this.getView()).mo128802b(chat);
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                ((C34965i.AbstractC34968b) C34950g.this.getView()).mo128798a(errorResult.getDisplayMsg(UIHelper.getString(R.string.Lark_Legacy_ChangeOwnerFailed)));
            }
        }));
    }

    /* renamed from: a */
    public void mo128880a(String str) {
        ((C34965i.AbstractC34968b) getView()).mo128793a(((C34965i.AbstractC34966a) getModel()).mo128744a(), str);
    }

    /* renamed from: a */
    public void mo128881a(String str, int i) {
        m136050b(str, i);
        m136049b(str);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m136048a(String str, IGetDataCallback iGetDataCallback) {
        ((C34965i.AbstractC34966a) getModel()).mo128755a(str, iGetDataCallback, iGetDataCallback);
    }

    /* renamed from: b */
    private void m136050b(String str, int i) {
        C57865c.m224574a(new C57865c.AbstractC57873d(str) {
            /* class com.ss.android.lark.chatsetting.impl.group.setting.$$Lambda$g$D5kkGGieOPlqdZr68ESaJfbApTE */
            public final /* synthetic */ String f$1;

            {
                this.f$1 = r2;
            }

            @Override // com.ss.android.lark.utils.rxjava.C57865c.AbstractC57873d
            public final Object produce() {
                return C34950g.this.m136051c(this.f$1);
            }
        }, new C57865c.AbstractC57871b(str, i) {
            /* class com.ss.android.lark.chatsetting.impl.group.setting.$$Lambda$g$E4VNilZho4_rucrhN04G4tZnxDk */
            public final /* synthetic */ String f$1;
            public final /* synthetic */ int f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            @Override // com.ss.android.lark.utils.rxjava.C57865c.AbstractC57871b
            public final void consume(Object obj) {
                C34950g.this.m136047a(this.f$1, this.f$2, (C34947f.C34949a) obj);
            }
        });
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m136047a(String str, int i, C34947f.C34949a aVar) {
        if (getView() == null) {
            Log.m165397w("GroupSettingPresenter", "before date back, activity destroy");
        } else if (aVar == null || aVar.f90232b == null) {
            Log.m165383e("GroupSettingPresenter", "fatal error! can't get chat by current getChatId:" + str);
            ((C34965i.AbstractC34968b) getView()).mo128785a();
        } else {
            if (getModel() != null) {
                aVar.f90237g = i;
                ((C34965i.AbstractC34966a) getModel()).mo128753a(aVar);
            }
            ((C34965i.AbstractC34968b) getView()).mo128791a(aVar.f90232b, aVar.f90234d, aVar.f90235e, aVar.f90236f, aVar.f90231a, ((C34965i.AbstractC34966a) getModel()).mo128771e(), aVar.f90238h);
            mo128878a(aVar.f90234d);
            ((C34965i.AbstractC34966a) getModel()).mo128748a(aVar.f90232b);
        }
    }

    public C34950g(GroupSettingView.AbstractC34936a aVar, Activity activity, C36516a<?> aVar2, boolean z, boolean z2, boolean z3, boolean z4) {
        GroupSettingView groupSettingView = new GroupSettingView(activity, aVar, aVar2, z, z2, z3, z4);
        GroupSettingModel groupSettingModel = new GroupSettingModel();
        setView(groupSettingView);
        setModel(groupSettingModel);
        groupSettingView.setViewDelegate(createViewDelegate());
        groupSettingModel.mo128754a(m136052e());
    }
}
