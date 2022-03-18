package com.ss.android.lark.chatthread;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.larksuite.framework.utils.KeyboardUtils;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.biz.im.api.ChatBundle;
import com.ss.android.lark.biz.im.api.OpenApp;
import com.ss.android.lark.chat.api.service.p1600b.C32821b;
import com.ss.android.lark.chat.api.service.p1600b.C32835d;
import com.ss.android.lark.chat.api.service.p1600b.C32848e;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.ChatChatter;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.chat.entity.message.MessageInfo;
import com.ss.android.lark.chat.service.AbstractC34296k;
import com.ss.android.lark.chat.service.AbstractC34297l;
import com.ss.android.lark.chatthread.C35121d;
import com.ss.android.lark.desktopmode.C36512a;
import com.ss.android.lark.desktopmode.base.DesktopConstants;
import com.ss.android.lark.desktopmode.base.DrawerParams;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.dto.p1815d.C36871a;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.navigation.Navigation;
import com.ss.android.lark.utils.rxjava.C57865c;

/* renamed from: com.ss.android.lark.chatthread.d */
public class C35121d {

    /* renamed from: a */
    private static AbstractC34296k f90735a = C32821b.m126120a();

    /* renamed from: b */
    private static AbstractC34297l f90736b = C32835d.m126323c();

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ MessageInfo m137106a(String str) {
        return C32848e.m126401b().mo121106b(str);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ C35123a m137107a(MessageInfo messageInfo) {
        OpenApp openApp;
        C36871a c = f90735a.mo121045c(messageInfo.getMessage().getChatId());
        Chat a = c.mo136109a();
        if (a == null || a.getRole() != Chat.Role.MEMBER) {
            return null;
        }
        ChatChatter b = f90736b.mo121202b(a.getId(), a.getP2pChatterId());
        if (c.mo136110b() == null) {
            openApp = new OpenApp();
        } else {
            openApp = c.mo136110b();
        }
        return new C35123a(b, a, openApp);
    }

    /* renamed from: a */
    public static void m137109a(Context context, String str, String str2) {
        m137110a(context, str, (String) null, str2);
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.chatthread.d$a */
    public static class C35123a {

        /* renamed from: a */
        public Chatter f90738a;

        /* renamed from: b */
        public Chat f90739b;

        /* renamed from: c */
        public OpenApp f90740c;

        public C35123a(Chatter chatter, Chat chat, OpenApp openApp) {
            this.f90738a = chatter;
            this.f90739b = chat;
            this.f90740c = openApp;
        }
    }

    /* renamed from: a */
    public static void m137108a(Context context, ChatChatter chatChatter, MessageInfo messageInfo) {
        if (messageInfo != null) {
            C29990c.m110930b().mo134577e().mo120957a(ChatBundle.SourceType.CHAT.value);
            m137112a(Navigation.from(context), (String) null, chatChatter, messageInfo);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m137113a(Navigation navigation, String str, MessageInfo messageInfo) {
        if (messageInfo != null) {
            m137112a(navigation, str, messageInfo.getMessageSender(), messageInfo);
        }
    }

    /* renamed from: a */
    public static void m137110a(Context context, String str, String str2, String str3) {
        if (!(context instanceof ChatThreadActivity)) {
            C29990c.m110930b().mo134577e().mo120957a(ChatBundle.SourceType.CHAT.value);
            C57865c.m224574a(new C57865c.AbstractC57873d(str3) {
                /* class com.ss.android.lark.chatthread.$$Lambda$d$V4JMiyznNuVeiNYX901p2efZDY */
                public final /* synthetic */ String f$0;

                {
                    this.f$0 = r1;
                }

                @Override // com.ss.android.lark.utils.rxjava.C57865c.AbstractC57873d
                public final Object produce() {
                    return C35121d.m137106a(this.f$0);
                }
            }, new C57865c.AbstractC57871b(str2) {
                /* class com.ss.android.lark.chatthread.$$Lambda$d$YOOE2GFuiHf4oNyqeFb3GbdYsTg */
                public final /* synthetic */ String f$1;

                {
                    this.f$1 = r2;
                }

                @Override // com.ss.android.lark.utils.rxjava.C57865c.AbstractC57871b
                public final void consume(Object obj) {
                    C35121d.m137113a(Navigation.this, this.f$1, (MessageInfo) obj);
                }
            });
        }
    }

    /* renamed from: a */
    private static void m137112a(Navigation navigation, String str, ChatChatter chatChatter, MessageInfo messageInfo) {
        Context context = navigation.getContext();
        if ((context instanceof Activity) && KeyboardUtils.isSoftShowing((Activity) context)) {
            KeyboardUtils.hideKeyboard(context);
        }
        C57865c.m224574a(new C57865c.AbstractC57873d() {
            /* class com.ss.android.lark.chatthread.$$Lambda$d$leCCMa2btLdJhUEhxAhyPqcFQ */

            @Override // com.ss.android.lark.utils.rxjava.C57865c.AbstractC57873d
            public final Object produce() {
                return C35121d.m137107a(MessageInfo.this);
            }
        }, new C57865c.AbstractC57871b(chatChatter, context, navigation) {
            /* class com.ss.android.lark.chatthread.$$Lambda$d$HISFlUi8E8vkvo_FCm7JbPFgk */
            public final /* synthetic */ ChatChatter f$1;
            public final /* synthetic */ Context f$2;
            public final /* synthetic */ Navigation f$3;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
            }

            @Override // com.ss.android.lark.utils.rxjava.C57865c.AbstractC57871b
            public final void consume(Object obj) {
                C35121d.m137111a(MessageInfo.this, this.f$1, this.f$2, this.f$3, (C35121d.C35123a) obj);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m137111a(MessageInfo messageInfo, ChatChatter chatChatter, Context context, Navigation navigation, C35123a aVar) {
        if (aVar.f90739b == null || (aVar.f90739b.isP2PChat() && aVar.f90738a == null)) {
            Log.m165382e("Failed to open chat, id:" + messageInfo.getMessage().getChatId());
            return;
        }
        final Bundle bundle = new Bundle();
        bundle.putSerializable("extra.selfChatter", chatChatter);
        bundle.putSerializable("extra.message", messageInfo);
        bundle.putSerializable("extra.chat", aVar.f90739b);
        bundle.putSerializable("extra.p2p.selfChatter", aVar.f90738a);
        bundle.putSerializable("extra.open.app", aVar.f90740c);
        if (DesktopUtil.m144301a(context)) {
            navigation.openActivity(ChatThreadFragment.class.getName(), new Navigation.AbstractC57856b() {
                /* class com.ss.android.lark.chatthread.C35121d.C351221 */

                @Override // com.ss.android.lark.utils.navigation.Navigation.AbstractC57856b
                public void onOpenPage() {
                    ChatThreadFragment bVar = new ChatThreadFragment();
                    bVar.setArguments(bundle);
                    C36512a.m144041a().mo134761a(bVar, new DrawerParams.C36565a(DesktopConstants.UIType.DRAWER_NORMAL_C1).mo134930b());
                }
            });
            return;
        }
        Intent intent = new Intent(context, ChatThreadActivity.class);
        intent.putExtras(bundle);
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        navigation.openActivity(intent);
    }
}
