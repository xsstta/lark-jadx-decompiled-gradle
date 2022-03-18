package com.ss.android.lark.chatsetting.impl.p2p;

import android.text.TextUtils;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.larksuite.framework.mvp.BaseModel;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.chat.entity.Channel;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chat.ChatSetting;
import com.ss.android.lark.chat.entity.chatter.ChatChatter;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.chatsetting.ChatSettingModule;
import com.ss.android.lark.chatsetting.dto.AbstractC34496c;
import com.ss.android.lark.chatsetting.dto.AbstractC34497d;
import com.ss.android.lark.chatsetting.dto.AbstractC34499f;
import com.ss.android.lark.chatsetting.dto.C34495a;
import com.ss.android.lark.chatsetting.dto.Profile;
import com.ss.android.lark.chatsetting.dto.PushChatRelationListener;
import com.ss.android.lark.chatsetting.dto.Shortcut;
import com.ss.android.lark.chatsetting.impl.p2p.AbstractC35020b;
import com.ss.android.lark.chatsetting.impl.statistics.chat.ChatHitPoint;
import com.ss.android.lark.chatsetting.impl.statistics.chatbox.ChatBoxHitPoint;
import com.ss.android.lark.chatsetting.p1693a.AbstractC34461c;
import com.ss.android.lark.utils.C57782ag;
import com.ss.android.lark.utils.rxjava.C57865c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.lark.chatsetting.impl.p2p.c */
public class C35025c extends BaseModel implements AbstractC35020b.AbstractC35021a {

    /* renamed from: a */
    public AbstractC34461c.AbstractC34471j f90370a;

    /* renamed from: b */
    public AbstractC35020b.AbstractC35021a.AbstractC35022a f90371b;

    /* renamed from: c */
    public Chat f90372c;

    /* renamed from: d */
    public Profile f90373d;

    /* renamed from: e */
    public Shortcut f90374e;

    /* renamed from: f */
    private AbstractC34461c.AbstractC34466e f90375f;

    /* renamed from: g */
    private AbstractC34461c.AbstractC34476o f90376g;

    /* renamed from: h */
    private Chatter f90377h;

    /* renamed from: i */
    private PushChatRelationListener f90378i = new PushChatRelationListener() {
        /* class com.ss.android.lark.chatsetting.impl.p2p.C35025c.C350261 */

        @Override // com.ss.android.lark.chatsetting.dto.PushChatRelationListener
        /* renamed from: a */
        public void mo127537a(Chat chat) {
            C35025c.this.mo129084a(chat);
        }
    };

    /* renamed from: j */
    private AbstractC34499f f90379j = new AbstractC34499f() {
        /* class com.ss.android.lark.chatsetting.impl.p2p.C35025c.C350316 */

        @Override // com.ss.android.lark.chatsetting.dto.AbstractC34499f
        /* renamed from: a */
        public void mo127529a(List<Shortcut> list) {
            C35025c.this.mo129086a(list);
        }
    };

    /* renamed from: k */
    private AbstractC34496c f90380k = new AbstractC34496c() {
        /* class com.ss.android.lark.chatsetting.impl.p2p.C35025c.C350327 */

        @Override // com.ss.android.lark.chatsetting.dto.AbstractC34496c
        /* renamed from: a */
        public void mo127526a(Chatter chatter) {
            C35025c.this.mo129085a(chatter);
        }
    };

    /* renamed from: l */
    private AbstractC34497d f90381l = new AbstractC34497d() {
        /* class com.ss.android.lark.chatsetting.impl.p2p.C35025c.C350338 */

        @Override // com.ss.android.lark.chatsetting.dto.AbstractC34497d
        /* renamed from: a */
        public void mo127527a(Chatter chatter) {
            C35025c.this.mo129087b(chatter);
        }
    };

    @Override // com.ss.android.lark.chatsetting.impl.p2p.AbstractC35020b.AbstractC35021a
    /* renamed from: f */
    public boolean mo129063f() {
        return true;
    }

    @Override // com.ss.android.lark.chatsetting.impl.p2p.AbstractC35020b.AbstractC35021a
    /* renamed from: a */
    public Chatter mo129049a() {
        return this.f90377h;
    }

    @Override // com.ss.android.lark.chatsetting.impl.p2p.AbstractC35020b.AbstractC35021a
    /* renamed from: b */
    public Chat mo129055b() {
        return this.f90372c;
    }

    @Override // com.ss.android.lark.chatsetting.impl.p2p.AbstractC35020b.AbstractC35021a
    /* renamed from: e */
    public void mo129062e() {
        C57865c.m224574a(new C57865c.AbstractC57873d<Shortcut>() {
            /* class com.ss.android.lark.chatsetting.impl.p2p.C35025c.C350272 */

            /* renamed from: a */
            public Shortcut produce() {
                List<Shortcut> a = C35025c.this.f90370a.mo127390a(Collections.singletonList(C35025c.this.f90372c.getId()));
                if (CollectionUtils.isEmpty(a)) {
                    return null;
                }
                return a.get(0);
            }
        }, new C57865c.AbstractC57871b<Shortcut>() {
            /* class com.ss.android.lark.chatsetting.impl.p2p.C35025c.C350283 */

            /* renamed from: a */
            public void consume(Shortcut shortcut) {
                boolean z;
                C35025c.this.f90374e = shortcut;
                if (shortcut != null) {
                    z = true;
                } else {
                    z = false;
                }
                C35025c.this.f90371b.mo129070b(z);
            }
        });
    }

    @Override // com.ss.android.lark.chatsetting.impl.p2p.AbstractC35020b.AbstractC35021a
    /* renamed from: g */
    public boolean mo129064g() {
        return !this.f90372c.isSecret();
    }

    @Override // com.ss.android.lark.chatsetting.impl.p2p.AbstractC35020b.AbstractC35021a
    /* renamed from: c */
    public ChatChatter mo129058c() {
        return this.f90375f.mo127313a(this.f90372c.getId(), this.f90377h.getId());
    }

    @Override // com.ss.android.lark.chatsetting.impl.p2p.AbstractC35020b.AbstractC35021a
    /* renamed from: d */
    public ChatChatter mo129061d() {
        return this.f90375f.mo127313a(this.f90372c.getId(), this.f90376g.mo127412a());
    }

    @Override // com.ss.android.lark.chatsetting.impl.p2p.AbstractC35020b.AbstractC35021a
    /* renamed from: h */
    public boolean mo129065h() {
        String str;
        String a = ChatSettingModule.m133639a().mo127277g().mo127412a();
        Chatter chatter = this.f90377h;
        if (chatter == null) {
            str = null;
        } else {
            str = chatter.getId();
        }
        return C57782ag.m224242a(a, str);
    }

    @Override // com.larksuite.framework.mvp.BaseModel, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        AbstractC34461c.AbstractC34481t e = ChatSettingModule.m133639a().mo127275e();
        if (this.f90372c != null) {
            e.mo127431a(String.valueOf(hashCode()), this.f90372c.getId(), this.f90378i);
        }
        ChatSettingModule.m133639a().mo127278h().mo127392a(this.f90379j);
        ChatSettingModule.m133639a().mo127274d().mo127321a(this.f90380k);
        ChatSettingModule.m133639a().mo127274d().mo127322a(this.f90381l);
    }

    @Override // com.larksuite.framework.mvp.BaseModel, com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        super.destroy();
        AbstractC34461c.AbstractC34481t e = ChatSettingModule.m133639a().mo127275e();
        ChatSettingModule.m133639a().mo127278h().mo127397b(this.f90379j);
        ChatSettingModule.m133639a().mo127274d().mo127352b(this.f90380k);
        ChatSettingModule.m133639a().mo127274d().mo127353b(this.f90381l);
        if (this.f90372c != null) {
            e.mo127433b(String.valueOf(hashCode()), this.f90372c.getId(), this.f90378i);
        }
    }

    @Override // com.ss.android.lark.chatsetting.impl.p2p.AbstractC35020b.AbstractC35021a
    /* renamed from: a */
    public void mo129052a(AbstractC35020b.AbstractC35021a.AbstractC35022a aVar) {
        this.f90371b = aVar;
    }

    /* renamed from: b */
    public void mo129087b(Chatter chatter) {
        if (chatter != null && TextUtils.equals(this.f90377h.getId(), chatter.getId())) {
            this.f90377h = chatter;
            this.f90371b.mo129069b(chatter);
        }
    }

    @Override // com.ss.android.lark.chatsetting.impl.p2p.AbstractC35020b.AbstractC35021a
    /* renamed from: a */
    public void mo129051a(final IGetDataCallback<Profile> iGetDataCallback) {
        IGetDataCallback<Profile> iGetDataCallback2 = (IGetDataCallback) getCallbackManager().wrapAndAddCallback(new IGetDataCallback<Profile>() {
            /* class com.ss.android.lark.chatsetting.impl.p2p.C35025c.AnonymousClass13 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                iGetDataCallback.onError(errorResult);
            }

            /* renamed from: a */
            public void onSuccess(Profile profile) {
                C35025c.this.f90373d = profile;
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onSuccess(C35025c.this.f90373d);
                }
            }
        });
        if (this.f90377h.getType() == Chatter.ChatterType.BOT) {
            iGetDataCallback2.onSuccess(new Profile("", ""));
        } else {
            ChatSettingModule.m133639a().mo127280j().mo127427a(this.f90377h.getId(), iGetDataCallback2);
        }
    }

    @Override // com.ss.android.lark.chatsetting.impl.p2p.AbstractC35020b.AbstractC35021a
    /* renamed from: b */
    public void mo129056b(final IGetDataCallback<Chat> iGetDataCallback) {
        Chat chat = this.f90372c;
        if (chat != null && !TextUtils.isEmpty(chat.getId())) {
            this.f90375f.mo127375f(this.f90372c.getId(), (IGetDataCallback) getCallbackManager().wrapAndAddCallback(new IGetDataCallback<Chat>() {
                /* class com.ss.android.lark.chatsetting.impl.p2p.C35025c.C350349 */

                /* renamed from: a */
                public void onSuccess(Chat chat) {
                    IGetDataCallback iGetDataCallback = iGetDataCallback;
                    if (iGetDataCallback != null) {
                        iGetDataCallback.onSuccess(chat);
                    }
                }

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    IGetDataCallback iGetDataCallback = iGetDataCallback;
                    if (iGetDataCallback != null) {
                        iGetDataCallback.onError(errorResult);
                    }
                }
            }));
        } else if (iGetDataCallback != null) {
            iGetDataCallback.onError(new ErrorResult("currentchat or currentchat id is empty"));
        }
    }

    @Override // com.ss.android.lark.chatsetting.impl.p2p.AbstractC35020b.AbstractC35021a
    /* renamed from: c */
    public void mo129059c(IGetDataCallback<C34495a> iGetDataCallback) {
        final UIGetDataCallback wrapAndAddGetDataCallback = getCallbackManager().wrapAndAddGetDataCallback(iGetDataCallback);
        C57865c.m224576a(new Runnable() {
            /* class com.ss.android.lark.chatsetting.impl.p2p.C35025c.RunnableC350294 */

            public void run() {
                C34495a b = ChatSettingModule.m133639a().mo127270b(C35025c.this.f90372c.getId());
                UIGetDataCallback uIGetDataCallback = wrapAndAddGetDataCallback;
                if (uIGetDataCallback != null) {
                    uIGetDataCallback.onSuccess(b);
                }
            }
        });
    }

    /* renamed from: a */
    public void mo129084a(Chat chat) {
        if (chat != null && chat.getId().equals(this.f90372c.getId())) {
            this.f90371b.mo129066a(chat, this.f90372c);
            this.f90372c = chat;
        }
    }

    @Override // com.ss.android.lark.chatsetting.impl.p2p.AbstractC35020b.AbstractC35021a
    /* renamed from: b */
    public void mo129057b(final boolean z) {
        UIGetDataCallback wrapAndAddGetDataCallback = getCallbackManager().wrapAndAddGetDataCallback(new IGetDataCallback<Object>() {
            /* class com.ss.android.lark.chatsetting.impl.p2p.C35025c.AnonymousClass11 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                C35025c.this.f90371b.mo129071c(!z);
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback, com.larksuite.framework.callback.IRequestCallback
            public void onSuccess(Object obj) {
                C35025c.this.f90371b.mo129071c(z);
            }
        });
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.f90372c.getId());
        if (z) {
            this.f90370a.mo127393a(arrayList, wrapAndAddGetDataCallback);
            ChatBoxHitPoint.f90518a.mo129202a("bot", "chat_setting", this.f90372c.getId(), !this.f90372c.isRemind());
            return;
        }
        this.f90370a.mo127394a(arrayList, this.f90372c.isRemind(), wrapAndAddGetDataCallback);
        ChatBoxHitPoint.f90518a.mo129201a("bot", "chat_setting", this.f90372c.getId());
    }

    @Override // com.ss.android.lark.chatsetting.impl.p2p.AbstractC35020b.AbstractC35021a
    /* renamed from: c */
    public void mo129060c(final boolean z) {
        Shortcut shortcut = new Shortcut(Channel.Type.CHAT, this.f90372c.getId());
        UIGetDataCallback wrapAndAddGetDataCallback = getCallbackManager().wrapAndAddGetDataCallback(new IGetDataCallback<Shortcut>() {
            /* class com.ss.android.lark.chatsetting.impl.p2p.C35025c.AnonymousClass12 */

            /* renamed from: a */
            public void onSuccess(Shortcut shortcut) {
                if (z) {
                    C35025c.this.f90374e = shortcut;
                } else {
                    C35025c.this.f90374e = null;
                }
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                C35025c.this.f90371b.mo129070b(!z);
            }
        });
        if (z) {
            this.f90370a.mo127391a(shortcut, wrapAndAddGetDataCallback);
        } else {
            this.f90370a.mo127396b(shortcut, wrapAndAddGetDataCallback);
        }
    }

    /* renamed from: a */
    public void mo129085a(Chatter chatter) {
        if (chatter != null && chatter.getId().equals(this.f90377h.getId())) {
            this.f90377h.setAlias(chatter.getAlias());
            this.f90371b.mo129067a(chatter);
        }
    }

    /* renamed from: a */
    public void mo129086a(List<Shortcut> list) {
        if (!CollectionUtils.isEmpty(list)) {
            boolean z = false;
            String id = this.f90372c.getId();
            Iterator<Shortcut> it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (TextUtils.equals(it.next().getChannel().getId(), id)) {
                        z = true;
                        break;
                    }
                } else {
                    break;
                }
            }
            this.f90371b.mo129070b(z);
        }
    }

    @Override // com.ss.android.lark.chatsetting.impl.p2p.AbstractC35020b.AbstractC35021a
    /* renamed from: a */
    public void mo129053a(final boolean z) {
        String str;
        this.f90375f.mo127374e(this.f90372c.getId(), z, getCallbackManager().wrapAndAddGetDataCallback(new IGetDataCallback<ChatSetting>() {
            /* class com.ss.android.lark.chatsetting.impl.p2p.C35025c.AnonymousClass10 */

            /* renamed from: a */
            public void onSuccess(ChatSetting chatSetting) {
                C35025c.this.f90371b.mo129068a(chatSetting.isRemind());
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                C35025c.this.f90371b.mo129068a(!z);
            }
        }));
        Chatter chatter = this.f90377h;
        if (chatter != null) {
            if (chatter.isBot()) {
                str = "single_bot";
            } else {
                str = "single";
            }
            if (z) {
                ChatHitPoint.f90516a.mo129188b(str, this.f90372c.getId());
            } else {
                ChatHitPoint.f90516a.mo129187a(str, this.f90372c.getId());
            }
        }
    }

    public C35025c(Chatter chatter, Chat chat) {
        this.f90372c = chat;
        this.f90377h = chatter;
        this.f90375f = ChatSettingModule.m133639a().mo127274d();
        this.f90370a = ChatSettingModule.m133639a().mo127278h();
        this.f90376g = ChatSettingModule.m133639a().mo127277g();
    }

    @Override // com.ss.android.lark.chatsetting.impl.p2p.AbstractC35020b.AbstractC35021a
    /* renamed from: a */
    public void mo129054a(boolean z, IGetDataCallback<Chat> iGetDataCallback) {
        this.f90375f.mo127343a(this.f90372c.getId(), z, (IGetDataCallback) getCallbackManager().wrapAndAddCallback(iGetDataCallback));
    }

    @Override // com.ss.android.lark.chatsetting.impl.p2p.AbstractC35020b.AbstractC35021a
    /* renamed from: a */
    public void mo129050a(int i, final String str, String str2, final IGetDataCallback<Integer> iGetDataCallback) {
        mo129083a(i, Collections.singletonList(str), str2, new IGetDataCallback<Map<String, Integer>>() {
            /* class com.ss.android.lark.chatsetting.impl.p2p.C35025c.C350305 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                iGetDataCallback.onError(errorResult);
            }

            /* renamed from: a */
            public void onSuccess(Map<String, Integer> map) {
                if (map == null) {
                    iGetDataCallback.onSuccess(null);
                } else {
                    iGetDataCallback.onSuccess(map.get(str));
                }
            }
        });
    }

    /* renamed from: a */
    public void mo129083a(int i, List<String> list, String str, IGetDataCallback<Map<String, Integer>> iGetDataCallback) {
        ChatSettingModule.m133639a().mo127292v().mo127382a(i, list, str, iGetDataCallback);
    }
}
