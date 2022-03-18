package com.ss.android.lark.chatwindow;

import android.util.LruCache;
import com.huawei.hms.location.LocationRequest;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.utils.am;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.biz.im.api.AbstractC29623p;
import com.ss.android.lark.biz.im.api.ChatWindowPrepareData;
import com.ss.android.lark.biz.im.api.OpenApp;
import com.ss.android.lark.chat.api.service.p1600b.C32821b;
import com.ss.android.lark.chat.api.service.p1600b.C32835d;
import com.ss.android.lark.chat.api.service.p1600b.C32881i;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.ChatChatter;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.chat.entity.thread.TopicGroup;
import com.ss.android.lark.chat.service.AbstractC34296k;
import com.ss.android.lark.chat.service.AbstractC34297l;
import com.ss.android.lark.chat.service.impl.AbstractC34230k;
import com.ss.android.lark.chat.service.impl.C34209g;
import com.ss.android.lark.dependency.AbstractC36450aa;
import com.ss.android.lark.dto.p1815d.C36871a;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.threadwindow.C56146m;
import com.ss.android.lark.utils.rxjava.C57865c;

/* renamed from: com.ss.android.lark.chatwindow.f */
public class C35242f {

    /* renamed from: a */
    public AbstractC34296k f91007a;

    /* renamed from: b */
    private AbstractC34297l f91008b;

    /* renamed from: c */
    private AbstractC36450aa f91009c;

    /* renamed from: d */
    private final AbstractC34230k f91010d;

    /* renamed from: e */
    private LruCache<String, Chat> f91011e;

    /* renamed from: f */
    private am<ChatChatter> f91012f;

    /* renamed from: g */
    private AbstractC29623p f91013g;

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.chatwindow.f$a */
    public static class C35246a {

        /* renamed from: a */
        static C35242f f91020a = new C35242f();
    }

    /* renamed from: a */
    public static C35242f m137613a() {
        return C35246a.f91020a;
    }

    /* renamed from: c */
    private void m137615c() {
        C34209g.m132771a().mo126756a(this.f91013g);
    }

    /* renamed from: b */
    public void mo129707b() {
        LruCache<String, Chat> lruCache = this.f91011e;
        if (lruCache != null) {
            lruCache.evictAll();
        }
        am<ChatChatter> amVar = this.f91012f;
        if (amVar != null) {
            amVar.mo93368a();
        }
    }

    private C35242f() {
        this.f91007a = C32821b.m126120a();
        this.f91008b = C32835d.m126323c();
        this.f91009c = C29990c.m110930b().mo134515N();
        this.f91010d = C32881i.m126556a();
        this.f91011e = new LruCache<>(LocationRequest.PRIORITY_HD_ACCURACY);
        this.f91012f = new am<>(LocationRequest.PRIORITY_HD_ACCURACY);
        this.f91013g = new AbstractC29623p() {
            /* class com.ss.android.lark.chatwindow.C35242f.C352431 */

            @Override // com.ss.android.lark.biz.im.api.AbstractC29623p
            public void onPushChatter(Chatter chatter) {
                C35242f.this.mo129705a(chatter);
            }
        };
        m137615c();
    }

    /* renamed from: a */
    public ChatWindowPrepareData mo129703a(String str) {
        return mo129704a(str, this.f91009c.mo134394a());
    }

    /* renamed from: a */
    public void mo129705a(Chatter chatter) {
        if (chatter != null && (chatter instanceof ChatChatter)) {
            m137614a((ChatChatter) chatter, false);
        }
    }

    /* renamed from: a */
    private void m137614a(ChatChatter chatChatter, boolean z) {
        ChatChatter a = this.f91012f.mo93367a(chatChatter.getChatId(), chatChatter.getId());
        if (a == null && !z) {
            return;
        }
        if (a == null || a.getUpdateTime() <= chatChatter.getUpdateTime()) {
            this.f91012f.mo93369a(chatChatter.getId(), chatChatter.getId(), chatChatter);
        }
    }

    /* renamed from: a */
    public ChatWindowPrepareData mo129704a(String str, String str2) {
        C36871a c = this.f91007a.mo121045c(str);
        if (c == null) {
            Log.m165382e("prepare botChat in ChatWindow , but cannot get botChat" + str);
            return null;
        }
        Chat a = c.mo136109a();
        if (a != null) {
            this.f91011e.put(str, a);
        }
        if (this.f91012f.mo93367a(str, str2) == null) {
            this.f91012f.mo93369a(str, str2, this.f91008b.mo121185a(str, str2));
        }
        if (a == null) {
            Log.m165382e("prepare chat in ChatWindow , but cannot get chat" + str);
            return null;
        }
        if (a.getType() == Chat.Type.P2P) {
            String a2 = this.f91007a.mo120990a(a);
            if (this.f91012f.mo93367a(str, a2) == null) {
                if (c == null || c.mo136111c() == null) {
                    this.f91012f.mo93369a(str, a2, this.f91008b.mo121185a(str, a2));
                } else {
                    this.f91012f.mo93369a(str, a2, new ChatChatter(c.mo136111c()));
                }
            }
        }
        return m137612a(str, str2, c.mo136110b());
    }

    /* renamed from: a */
    public void mo129706a(final String str, final IGetDataCallback<ChatWindowPrepareData> iGetDataCallback) {
        final String a = this.f91009c.mo134394a();
        C57865c.m224574a(new C57865c.AbstractC57873d<ChatWindowPrepareData>() {
            /* class com.ss.android.lark.chatwindow.C35242f.C352442 */

            /* renamed from: a */
            public ChatWindowPrepareData produce() {
                return C35242f.this.mo129704a(str, a);
            }
        }, new C57865c.AbstractC57871b<ChatWindowPrepareData>() {
            /* class com.ss.android.lark.chatwindow.C35242f.C352453 */

            /* renamed from: a */
            public void consume(ChatWindowPrepareData chatWindowPrepareData) {
                if (chatWindowPrepareData != null) {
                    iGetDataCallback.onSuccess(chatWindowPrepareData);
                } else {
                    iGetDataCallback.onError(new ErrorResult(""));
                }
            }
        });
    }

    /* renamed from: a */
    private ChatWindowPrepareData m137612a(String str, String str2, OpenApp openApp) {
        ChatChatter a = this.f91012f.mo93367a(str, str2);
        Chat chat = this.f91011e.get(str);
        if (chat.getType() == Chat.Type.P2P) {
            ChatChatter a2 = this.f91008b.mo121185a(chat.getId(), chat.getP2pChatterId());
            if (a2 != null) {
                return new ChatWindowPrepareData(chat, a2, a, openApp, null);
            }
            Log.m165382e("opening p2p chat in ChatWindow , but cannot get chatter");
            return null;
        } else if (chat.getChatMode() != Chat.ChatMode.THREAD_V2) {
            return new ChatWindowPrepareData(chat, null, a, openApp, null);
        } else {
            TopicGroup a3 = this.f91010d.mo106482a(str, C56146m.m218888a());
            if (a3 == null || a3.getChat() == null) {
                Log.m165388i("prepare chat from cache chat");
                return new ChatWindowPrepareData(chat, null, a, openApp, a3);
            }
            Log.m165388i("prepare chat from topGroup");
            return new ChatWindowPrepareData(a3.getChat(), null, a, openApp, a3);
        }
    }
}
