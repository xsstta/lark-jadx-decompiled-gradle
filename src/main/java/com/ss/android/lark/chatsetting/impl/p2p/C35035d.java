package com.ss.android.lark.chatsetting.impl.p2p;

import android.app.Activity;
import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.larksuite.framework.mvp.BasePresenter;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.chatsetting.ChatSettingModule;
import com.ss.android.lark.chatsetting.dto.C34495a;
import com.ss.android.lark.chatsetting.dto.Profile;
import com.ss.android.lark.chatsetting.impl.C34501a;
import com.ss.android.lark.chatsetting.impl.p2p.AbstractC35020b;
import com.ss.android.lark.chatsetting.impl.p2p.P2pSettingView;
import com.ss.android.lark.chatsetting.impl.statistics.group.GroupHitPoint;
import com.ss.android.lark.chatsetting.impl.statistics.setting.SettingHitPoint;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.UIHelper;
import java.util.HashMap;

/* renamed from: com.ss.android.lark.chatsetting.impl.p2p.d */
public class C35035d extends BasePresenter<AbstractC35020b.AbstractC35021a, AbstractC35020b.AbstractC35023b, AbstractC35020b.AbstractC35023b.AbstractC35024a> {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public AbstractC35020b.AbstractC35023b.AbstractC35024a createViewDelegate() {
        return new C35045b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public AbstractC35020b.AbstractC35021a.AbstractC35022a mo129099b() {
        return new C35038a();
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        m136486c();
    }

    /* renamed from: com.ss.android.lark.chatsetting.impl.p2p.d$b */
    public class C35045b implements AbstractC35020b.AbstractC35023b.AbstractC35024a {
        @Override // com.ss.android.lark.chatsetting.impl.p2p.AbstractC35020b.AbstractC35023b.AbstractC35024a
        /* renamed from: d */
        public boolean mo129079d() {
            return ((AbstractC35020b.AbstractC35021a) C35035d.this.getModel()).mo129063f();
        }

        @Override // com.ss.android.lark.chatsetting.impl.p2p.AbstractC35020b.AbstractC35023b.AbstractC35024a
        /* renamed from: e */
        public boolean mo129080e() {
            return ((AbstractC35020b.AbstractC35021a) C35035d.this.getModel()).mo129064g();
        }

        @Override // com.ss.android.lark.chatsetting.impl.p2p.AbstractC35020b.AbstractC35023b.AbstractC35024a
        /* renamed from: a */
        public void mo129072a() {
            ((AbstractC35020b.AbstractC35021a) C35035d.this.getModel()).mo129056b(new UIGetDataCallback(new IGetDataCallback<Chat>() {
                /* class com.ss.android.lark.chatsetting.impl.p2p.C35035d.C35045b.C350461 */

                /* renamed from: a */
                public void onSuccess(Chat chat) {
                    ((AbstractC35020b.AbstractC35023b) C35035d.this.getView()).mo129027c();
                }

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    Log.m165382e(errorResult.toString());
                    ((AbstractC35020b.AbstractC35023b) C35035d.this.getView()).mo129014a(R.string.Lark_Legacy_EndFailed);
                }
            }));
        }

        @Override // com.ss.android.lark.chatsetting.impl.p2p.AbstractC35020b.AbstractC35023b.AbstractC35024a
        /* renamed from: c */
        public void mo129076c() {
            final Chatter a = ((AbstractC35020b.AbstractC35021a) C35035d.this.getModel()).mo129049a();
            m136499a(a, new AbstractC35052a() {
                /* class com.ss.android.lark.chatsetting.impl.p2p.C35035d.C35045b.C350483 */

                /* access modifiers changed from: package-private */
                @Override // com.ss.android.lark.chatsetting.impl.p2p.C35035d.C35045b.AbstractC35052a
                /* renamed from: a */
                public void mo129109a() {
                    ((AbstractC35020b.AbstractC35023b) C35035d.this.getView()).mo129028c(a);
                }

                /* access modifiers changed from: package-private */
                @Override // com.ss.android.lark.chatsetting.impl.p2p.C35035d.C35045b.AbstractC35052a
                /* renamed from: b */
                public void mo129110b() {
                    ((AbstractC35020b.AbstractC35023b) C35035d.this.getView()).mo129014a(R.string.Lark_NewContacts_BlockedUnableToXToastGeneral);
                }

                /* access modifiers changed from: package-private */
                @Override // com.ss.android.lark.chatsetting.impl.p2p.C35035d.C35045b.AbstractC35052a
                /* renamed from: c */
                public void mo129111c() {
                    ((AbstractC35020b.AbstractC35023b) C35035d.this.getView()).mo129018a(a, UIHelper.getString(R.string.Lark_NewContacts_NeedToAddToContactstShareContactCardDialogContent), "share_confirm");
                }

                /* access modifiers changed from: package-private */
                @Override // com.ss.android.lark.chatsetting.impl.p2p.C35035d.C35045b.AbstractC35052a
                /* renamed from: d */
                public void mo129112d() {
                    ((AbstractC35020b.AbstractC35023b) C35035d.this.getView()).mo129014a(R.string.Lark_NewContacts_BlockedOthersUnableToXToastGeneral);
                }
            }, 21);
        }

        @Override // com.ss.android.lark.chatsetting.impl.p2p.AbstractC35020b.AbstractC35023b.AbstractC35024a
        /* renamed from: b */
        public void mo129074b() {
            GroupHitPoint.f90519a.mo129250j();
            GroupHitPoint.f90519a.mo129232d(((AbstractC35020b.AbstractC35021a) C35035d.this.getModel()).mo129055b().getId());
            GroupHitPoint.f90519a.mo129258l(((AbstractC35020b.AbstractC35021a) C35035d.this.getModel()).mo129055b().getId());
            final Chatter a = ((AbstractC35020b.AbstractC35021a) C35035d.this.getModel()).mo129049a();
            if (a != null) {
                if (a.isDimission()) {
                    ((AbstractC35020b.AbstractC35023b) C35035d.this.getView()).mo129014a(R.string.Lark_Legacy_ChatWindowP2pChatterDeactiviedCreateGroupTip);
                } else {
                    m136499a(a, new AbstractC35052a() {
                        /* class com.ss.android.lark.chatsetting.impl.p2p.C35035d.C35045b.C350472 */

                        /* access modifiers changed from: package-private */
                        @Override // com.ss.android.lark.chatsetting.impl.p2p.C35035d.C35045b.AbstractC35052a
                        /* renamed from: a */
                        public void mo129109a() {
                            ((AbstractC35020b.AbstractC35023b) C35035d.this.getView()).mo129013a();
                        }

                        /* access modifiers changed from: package-private */
                        @Override // com.ss.android.lark.chatsetting.impl.p2p.C35035d.C35045b.AbstractC35052a
                        /* renamed from: b */
                        public void mo129110b() {
                            ((AbstractC35020b.AbstractC35023b) C35035d.this.getView()).mo129014a(R.string.Lark_NewContacts_CantAddToGroupBlockedTip);
                        }

                        /* access modifiers changed from: package-private */
                        @Override // com.ss.android.lark.chatsetting.impl.p2p.C35035d.C35045b.AbstractC35052a
                        /* renamed from: d */
                        public void mo129112d() {
                            ((AbstractC35020b.AbstractC35023b) C35035d.this.getView()).mo129014a(R.string.Lark_NewContacts_CantAddToGroupBlockedOthersTip);
                        }

                        /* access modifiers changed from: package-private */
                        @Override // com.ss.android.lark.chatsetting.impl.p2p.C35035d.C35045b.AbstractC35052a
                        /* renamed from: c */
                        public void mo129111c() {
                            ((AbstractC35020b.AbstractC35023b) C35035d.this.getView()).mo129018a(a, UIHelper.mustacheFormat((int) R.string.Lark_NewContacts_NeedToAddToContactstGroupOneDialogContent, "Name", a.getLocalizedName()), "group_confirm");
                        }
                    }, 2);
                }
            }
        }

        @Override // com.ss.android.lark.chatsetting.impl.p2p.AbstractC35020b.AbstractC35023b.AbstractC35024a
        /* renamed from: f */
        public void mo129081f() {
            Chatter a = ((AbstractC35020b.AbstractC35021a) C35035d.this.getModel()).mo129049a();
            if (a == null) {
                Log.m165383e("P2pSettingPresenter", "current chatter is null");
            } else if (!a.isProfileEnable()) {
                Log.m165389i("P2pSettingPresenter", "unsupported click, do nothing here:" + a);
            } else if (a.isAnonymous()) {
                Log.m165389i("P2pSettingPresenter", "chatter is anonymous block avatar click");
            } else if (a.isUser()) {
                ((AbstractC35020b.AbstractC35023b) C35035d.this.getView()).mo129025b(((AbstractC35020b.AbstractC35021a) C35035d.this.getModel()).mo129049a().getId());
            } else if (a.isBot()) {
                ((AbstractC35020b.AbstractC35023b) C35035d.this.getView()).mo129029c(((AbstractC35020b.AbstractC35021a) C35035d.this.getModel()).mo129049a().getId());
            } else {
                Log.m165383e("P2pSettingPresenter", "unsupported chatter type, do nothing here:" + a);
            }
        }

        @Override // com.ss.android.lark.chatsetting.impl.p2p.AbstractC35020b.AbstractC35023b.AbstractC35024a
        /* renamed from: g */
        public void mo129082g() {
            SettingHitPoint.f90520a.mo129275b(((AbstractC35020b.AbstractC35021a) C35035d.this.getModel()).mo129055b().getId());
            Chatter a = ((AbstractC35020b.AbstractC35021a) C35035d.this.getModel()).mo129049a();
            if (a != null) {
                String id = a.getId();
                final HashMap hashMap = new HashMap();
                if (a.isBot()) {
                    ((AbstractC35020b.AbstractC35021a) C35035d.this.getModel()).mo129059c(new IGetDataCallback<C34495a>() {
                        /* class com.ss.android.lark.chatsetting.impl.p2p.C35035d.C35045b.C350516 */

                        @Override // com.larksuite.framework.callback.IGetDataCallback
                        public void onError(ErrorResult errorResult) {
                        }

                        /* renamed from: a */
                        public void onSuccess(C34495a aVar) {
                            if (aVar == null || TextUtils.isEmpty(aVar.mo127519a())) {
                                Log.m165383e("P2pSettingPresenter", "botchat is null or app id is empty");
                                return;
                            }
                            hashMap.put(ShareHitPoint.f121869d, "app");
                            HashMap hashMap = new HashMap();
                            hashMap.put("app_id", aVar.mo127519a());
                            hashMap.put("params", Uri.encode(JSONObject.toJSONString(hashMap)));
                            ((AbstractC35020b.AbstractC35023b) C35035d.this.getView()).mo129032d(C34501a.m133931a(hashMap));
                        }
                    });
                    return;
                }
                hashMap.put(ShareHitPoint.f121869d, "chatter");
                HashMap hashMap2 = new HashMap();
                hashMap2.put("chatter_id", id);
                hashMap2.put("is_cross_tenant", Integer.valueOf(C35035d.this.mo129098a(a.getTenantId()) ? 1 : 0));
                hashMap.put("params", Uri.encode(JSONObject.toJSONString(hashMap2)));
                ((AbstractC35020b.AbstractC35023b) C35035d.this.getView()).mo129032d(C34501a.m133931a(hashMap));
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.ss.android.lark.chatsetting.impl.p2p.d$b$a */
        public abstract class AbstractC35052a {
            /* access modifiers changed from: package-private */
            /* renamed from: a */
            public abstract void mo129109a();

            /* access modifiers changed from: package-private */
            /* renamed from: b */
            public abstract void mo129110b();

            /* access modifiers changed from: package-private */
            /* renamed from: c */
            public abstract void mo129111c();

            /* access modifiers changed from: package-private */
            /* renamed from: d */
            public abstract void mo129112d();

            AbstractC35052a() {
            }

            /* access modifiers changed from: package-private */
            /* renamed from: a */
            public void mo129116a(ErrorResult errorResult) {
                mo129109a();
            }
        }

        public C35045b() {
        }

        @Override // com.ss.android.lark.chatsetting.impl.p2p.AbstractC35020b.AbstractC35023b.AbstractC35024a
        /* renamed from: b */
        public void mo129075b(boolean z) {
            SettingHitPoint.f90520a.mo129277c(((AbstractC35020b.AbstractC35021a) C35035d.this.getModel()).mo129055b(), z);
            ((AbstractC35020b.AbstractC35021a) C35035d.this.getModel()).mo129057b(z);
        }

        @Override // com.ss.android.lark.chatsetting.impl.p2p.AbstractC35020b.AbstractC35023b.AbstractC35024a
        /* renamed from: c */
        public void mo129077c(boolean z) {
            SettingHitPoint.f90520a.mo129274b(((AbstractC35020b.AbstractC35021a) C35035d.this.getModel()).mo129055b(), z);
            ((AbstractC35020b.AbstractC35021a) C35035d.this.getModel()).mo129060c(z);
        }

        @Override // com.ss.android.lark.chatsetting.impl.p2p.AbstractC35020b.AbstractC35023b.AbstractC35024a
        /* renamed from: d */
        public void mo129078d(boolean z) {
            SettingHitPoint.f90520a.mo129264a();
            SettingHitPoint.f90520a.mo129280e(((AbstractC35020b.AbstractC35021a) C35035d.this.getModel()).mo129055b(), z);
            ((AbstractC35020b.AbstractC35021a) C35035d.this.getModel()).mo129054a(z, new UIGetDataCallback(new IGetDataCallback<Chat>() {
                /* class com.ss.android.lark.chatsetting.impl.p2p.C35035d.C35045b.C350505 */

                /* renamed from: a */
                public void onSuccess(Chat chat) {
                }

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    Log.m165382e("Failed to fix auto translate state:" + errorResult);
                    ((AbstractC35020b.AbstractC35023b) C35035d.this.getView()).mo129033d(((AbstractC35020b.AbstractC35021a) C35035d.this.getModel()).mo129055b().isAutoTranslate());
                    if (!TextUtils.isEmpty(errorResult.getDisplayMsg())) {
                        ((AbstractC35020b.AbstractC35023b) C35035d.this.getView()).mo129021a(errorResult.getDisplayMsg());
                    }
                }
            }));
        }

        /* renamed from: a */
        private boolean m136500a(Chatter chatter) {
            if (chatter.isBot()) {
                return false;
            }
            if (!ChatSettingModule.m133639a().mo127268a("lark.client.contact.opt")) {
                Log.m165379d("P2pSettingPresenter", "FG lark.client.contact.opt Disabled");
                return false;
            }
            String tenantId = chatter.getTenantId();
            if (chatter.isCustomer()) {
                return true;
            }
            return !TextUtils.equals(tenantId, ChatSettingModule.m133639a().mo127277g().mo127415c());
        }

        @Override // com.ss.android.lark.chatsetting.impl.p2p.AbstractC35020b.AbstractC35023b.AbstractC35024a
        /* renamed from: a */
        public void mo129073a(boolean z) {
            Log.m165379d("onChatSettingChange", "isRemind = " + z);
            SettingHitPoint.f90520a.mo129279d(((AbstractC35020b.AbstractC35021a) C35035d.this.getModel()).mo129055b(), z);
            ((AbstractC35020b.AbstractC35021a) C35035d.this.getModel()).mo129053a(z);
        }

        /* renamed from: a */
        private void m136499a(Chatter chatter, final AbstractC35052a aVar, int i) {
            if (!m136500a(chatter)) {
                aVar.mo129109a();
                return;
            }
            ((AbstractC35020b.AbstractC35021a) C35035d.this.getModel()).mo129050a(i, chatter.getId(), ((AbstractC35020b.AbstractC35021a) C35035d.this.getModel()).mo129055b().getId(), new UIGetDataCallback(new IGetDataCallback<Integer>() {
                /* class com.ss.android.lark.chatsetting.impl.p2p.C35035d.C35045b.C350494 */

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    Log.m165379d("P2pSettingPresenter", "get auth chatter: " + errorResult.getDebugMsg());
                    aVar.mo129116a(errorResult);
                }

                /* renamed from: a */
                public void onSuccess(Integer num) {
                    if (num == null) {
                        aVar.mo129109a();
                        return;
                    }
                    int intValue = num.intValue();
                    if (intValue == 1) {
                        aVar.mo129110b();
                    } else if (intValue == 5) {
                        aVar.mo129112d();
                    } else if (intValue != 6) {
                        ((AbstractC35020b.AbstractC35023b) C35035d.this.getView()).mo129014a(R.string.Lark_NewContacts_NeedToAddToContactsDialogTitle);
                        Log.m165383e("P2pSettingPresenter", "deniedReason not in switch range: " + num);
                    } else {
                        aVar.mo129111c();
                    }
                }
            }));
        }
    }

    /* renamed from: c */
    private void m136486c() {
        final C35053e eVar = new C35053e();
        eVar.f90432a = ((AbstractC35020b.AbstractC35021a) getModel()).mo129055b();
        eVar.f90433b = ((AbstractC35020b.AbstractC35021a) getModel()).mo129049a();
        eVar.f90435d = ((AbstractC35020b.AbstractC35021a) getModel()).mo129058c();
        eVar.f90434c = ((AbstractC35020b.AbstractC35021a) getModel()).mo129061d();
        if (eVar.f90433b.isBot()) {
            ((AbstractC35020b.AbstractC35021a) getModel()).mo129059c(new IGetDataCallback<C34495a>() {
                /* class com.ss.android.lark.chatsetting.impl.p2p.C35035d.C350361 */

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    Log.m165383e("P2pSettingPresenter", errorResult.toString());
                }

                /* renamed from: a */
                public void onSuccess(C34495a aVar) {
                    String str;
                    C35053e eVar = eVar;
                    C35035d dVar = C35035d.this;
                    Chatter chatter = eVar.f90433b;
                    if (aVar != null) {
                        str = aVar.mo127519a();
                    } else {
                        str = null;
                    }
                    eVar.f90436e = dVar.mo129097a(chatter, str, ((AbstractC35020b.AbstractC35021a) C35035d.this.getModel()).mo129065h());
                    ((AbstractC35020b.AbstractC35023b) C35035d.this.getView()).mo129020a(eVar);
                }
            });
        } else {
            eVar.f90436e = mo129097a(eVar.f90433b, null, ((AbstractC35020b.AbstractC35021a) getModel()).mo129065h());
            ((AbstractC35020b.AbstractC35023b) getView()).mo129020a(eVar);
        }
        ((AbstractC35020b.AbstractC35021a) getModel()).mo129051a(new UIGetDataCallback(new IGetDataCallback<Profile>() {
            /* class com.ss.android.lark.chatsetting.impl.p2p.C35035d.C350372 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                ((AbstractC35020b.AbstractC35023b) C35035d.this.getView()).mo129023b();
            }

            /* renamed from: a */
            public void onSuccess(Profile profile) {
                ((AbstractC35020b.AbstractC35023b) C35035d.this.getView()).mo129016a(((AbstractC35020b.AbstractC35021a) C35035d.this.getModel()).mo129055b(), ((AbstractC35020b.AbstractC35021a) C35035d.this.getModel()).mo129049a(), profile);
            }
        }));
        ((AbstractC35020b.AbstractC35021a) getModel()).mo129062e();
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.chatsetting.impl.p2p.d$a */
    public class C35038a implements AbstractC35020b.AbstractC35021a.AbstractC35022a {
        private C35038a() {
        }

        @Override // com.ss.android.lark.chatsetting.impl.p2p.AbstractC35020b.AbstractC35021a.AbstractC35022a
        /* renamed from: b */
        public void mo129069b(final Chatter chatter) {
            UICallbackExecutor.execute(new Runnable() {
                /* class com.ss.android.lark.chatsetting.impl.p2p.C35035d.C35038a.RunnableC350435 */

                public void run() {
                    ((AbstractC35020b.AbstractC35023b) C35035d.this.getView()).mo129024b(chatter);
                }
            });
        }

        @Override // com.ss.android.lark.chatsetting.impl.p2p.AbstractC35020b.AbstractC35021a.AbstractC35022a
        /* renamed from: c */
        public void mo129071c(final boolean z) {
            UICallbackExecutor.execute(new Runnable() {
                /* class com.ss.android.lark.chatsetting.impl.p2p.C35035d.C35038a.RunnableC350402 */

                public void run() {
                    ((AbstractC35020b.AbstractC35023b) C35035d.this.getView()).mo129030c(z);
                }
            });
        }

        @Override // com.ss.android.lark.chatsetting.impl.p2p.AbstractC35020b.AbstractC35021a.AbstractC35022a
        /* renamed from: a */
        public void mo129067a(final Chatter chatter) {
            UICallbackExecutor.execute(new Runnable() {
                /* class com.ss.android.lark.chatsetting.impl.p2p.C35035d.C35038a.RunnableC350413 */

                public void run() {
                    ((AbstractC35020b.AbstractC35023b) C35035d.this.getView()).mo129017a(chatter);
                }
            });
        }

        @Override // com.ss.android.lark.chatsetting.impl.p2p.AbstractC35020b.AbstractC35021a.AbstractC35022a
        /* renamed from: b */
        public void mo129070b(final boolean z) {
            UICallbackExecutor.execute(new Runnable() {
                /* class com.ss.android.lark.chatsetting.impl.p2p.C35035d.C35038a.RunnableC350446 */

                public void run() {
                    ((AbstractC35020b.AbstractC35023b) C35035d.this.getView()).mo129026b(z);
                }
            });
        }

        @Override // com.ss.android.lark.chatsetting.impl.p2p.AbstractC35020b.AbstractC35021a.AbstractC35022a
        /* renamed from: a */
        public void mo129068a(final boolean z) {
            UICallbackExecutor.execute(new Runnable() {
                /* class com.ss.android.lark.chatsetting.impl.p2p.C35035d.C35038a.RunnableC350391 */

                public void run() {
                    ((AbstractC35020b.AbstractC35023b) C35035d.this.getView()).mo129022a(z);
                }
            });
        }

        @Override // com.ss.android.lark.chatsetting.impl.p2p.AbstractC35020b.AbstractC35021a.AbstractC35022a
        /* renamed from: a */
        public void mo129066a(final Chat chat, final Chat chat2) {
            UICallbackExecutor.execute(new Runnable() {
                /* class com.ss.android.lark.chatsetting.impl.p2p.C35035d.C35038a.RunnableC350424 */

                public void run() {
                    ((AbstractC35020b.AbstractC35023b) C35035d.this.getView()).mo129015a(chat, chat2);
                }
            });
        }
    }

    /* renamed from: a */
    public boolean mo129098a(String str) {
        return !TextUtils.equals(str, ChatSettingModule.m133639a().mo127277g().mo127415c());
    }

    /* renamed from: a */
    public boolean mo129097a(Chatter chatter, String str, boolean z) {
        if (ChatSettingModule.m133639a().mo127260E()) {
            return false;
        }
        if (!TextUtils.isEmpty(str) || !chatter.isBot()) {
            return !z;
        }
        return false;
    }

    public C35035d(Activity activity, P2pSettingView.AbstractC35017a aVar, Chat chat, Chatter chatter, int i) {
        C35025c cVar = new C35025c(chatter, chat);
        P2pSettingView p2pSettingView = new P2pSettingView(aVar, activity, i);
        setModel(cVar);
        setView(p2pSettingView);
        p2pSettingView.setViewDelegate(createViewDelegate());
        cVar.mo129052a(mo129099b());
    }
}
