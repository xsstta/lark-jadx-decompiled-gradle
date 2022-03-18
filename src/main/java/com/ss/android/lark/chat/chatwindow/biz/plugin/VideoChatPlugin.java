package com.ss.android.lark.chat.chatwindow.biz.plugin;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.larksuite.suite.R;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.chat.chatwindow.biz.plugin.core.BaseChatPlugin;
import com.ss.android.lark.chat.chatwindow.chat.v2.component.IChatWindowApp;
import com.ss.android.lark.chat.chatwindow.chat.v2.component.titlebar.ITitlebarComponent;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.ChatChatter;
import com.ss.android.lark.chat.export.ui.p1673c.AbstractC34033a;
import com.ss.android.lark.chatwindow.p1720a.p1721a.C35219b;
import com.ss.android.lark.dependency.AbstractC36474h;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.desktopmode.view.C36592a;
import com.ss.android.lark.statistics.chat.ChatHitPointNew;
import com.ss.android.lark.statistics.chat.ChatStatisticUtil;
import com.ss.android.lark.ui.IActionTitlebar;
import com.ss.android.lark.utils.UIHelper;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u0016H\u0016J\u0010\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\"\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006!"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/biz/plugin/VideoChatPlugin;", "Lcom/ss/android/lark/chat/chatwindow/biz/plugin/core/BaseChatPlugin;", "()V", "chatApp", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/IChatWindowApp;", "getChatApp", "()Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/IChatWindowApp;", "setChatApp", "(Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/IChatWindowApp;)V", "titleBarRightView", "Lcom/ss/android/lark/chat/export/ui/titlebar/IChatTitleRightAction;", "getTitleBarRightView", "()Lcom/ss/android/lark/chat/export/ui/titlebar/IChatTitleRightAction;", "setTitleBarRightView", "(Lcom/ss/android/lark/chat/export/ui/titlebar/IChatTitleRightAction;)V", "titlebarComponent", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/titlebar/ITitlebarComponent;", "getTitlebarComponent", "()Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/titlebar/ITitlebarComponent;", "setTitlebarComponent", "(Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/titlebar/ITitlebarComponent;)V", "onCreate", "", "initData", "Lcom/ss/android/lark/chatwindow/model/data/ChatWindowInitData;", "onDestroy", "sendVcBtnClickEvent", "chat", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "setupTitlebarEntry", "titleComponent", "p2p2Chatter", "Lcom/ss/android/lark/chat/entity/chatter/ChatChatter;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.chatwindow.biz.plugin.h */
public final class VideoChatPlugin extends BaseChatPlugin {

    /* renamed from: a */
    public ITitlebarComponent f85202a;

    /* renamed from: b */
    public IChatWindowApp f85203b;

    /* renamed from: c */
    private AbstractC34033a f85204c;

    /* renamed from: b */
    public final ITitlebarComponent mo122205b() {
        ITitlebarComponent bVar = this.f85202a;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("titlebarComponent");
        }
        return bVar;
    }

    @Override // com.ss.android.lark.chat.chatwindow.biz.plugin.core.IChatPlugin, com.ss.android.lark.chat.chatwindow.biz.plugin.core.BaseChatPlugin
    public void as_() {
        super.as_();
        AbstractC34033a aVar = this.f85204c;
        if (aVar != null) {
            aVar.mo126139a();
        }
        AbstractC36474h b = C29990c.m110930b();
        Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
        b.mo134516O().mo134477a();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/chat/chatwindow/biz/plugin/VideoChatPlugin$setupTitlebarEntry$view$1", "Lcom/ss/android/lark/ui/IActionTitlebar$ViewAction;", "performAction", "", "view", "Landroid/view/View;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.biz.plugin.h$b */
    public static final class C33080b extends IActionTitlebar.C57575b {

        /* renamed from: a */
        final /* synthetic */ VideoChatPlugin f85207a;

        /* renamed from: b */
        final /* synthetic */ Chat f85208b;

        /* renamed from: c */
        final /* synthetic */ View f85209c;

        /* renamed from: d */
        final /* synthetic */ FrameLayout f85210d;

        @Override // com.ss.android.lark.ui.IActionTitlebar.Action, com.ss.android.lark.ui.IActionTitlebar.BaseAction
        public void performAction(View view) {
            ChatStatisticUtil.m213141b(this.f85208b);
            this.f85207a.mo122204a(this.f85208b);
            View view2 = this.f85209c;
            if (view2 != null) {
                view2.performClick();
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33080b(VideoChatPlugin hVar, Chat chat, View view, FrameLayout frameLayout, View view2) {
            super(view2);
            this.f85207a = hVar;
            this.f85208b = chat;
            this.f85209c = view;
            this.f85210d = frameLayout;
        }
    }

    /* renamed from: a */
    public final void mo122204a(Chat chat) {
        if (chat.isP2PChat()) {
            ChatHitPointNew.Companion.m213105a(ChatHitPointNew.f135660c, chat, "multiple_call", "im_call_select_view", (Map) null, 8, (Object) null);
        } else {
            ChatHitPointNew.Companion.m213105a(ChatHitPointNew.f135660c, chat, "meeting", "vc_meeting_pre_view", (Map) null, 8, (Object) null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\b"}, d2 = {"com/ss/android/lark/chat/chatwindow/biz/plugin/VideoChatPlugin$setupTitlebarEntry$wrapView$1", "Landroid/widget/FrameLayout;", "onInterceptHoverEvent", "", "event", "Landroid/view/MotionEvent;", "onInterceptTouchEvent", "ev", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.biz.plugin.h$c */
    public static final class C33081c extends FrameLayout {

        /* renamed from: a */
        final /* synthetic */ VideoChatPlugin f85211a;

        public boolean onInterceptHoverEvent(MotionEvent motionEvent) {
            Intrinsics.checkParameterIsNotNull(motionEvent, "event");
            return true;
        }

        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            return true;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33081c(VideoChatPlugin hVar, Context context) {
            super(context);
            this.f85211a = hVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00060\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "v", "Landroid/view/View;", "kotlin.jvm.PlatformType", "event", "Landroid/view/MotionEvent;", "onHover"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.biz.plugin.h$a */
    static final class View$OnHoverListenerC33079a implements View.OnHoverListener {

        /* renamed from: a */
        final /* synthetic */ C36592a f85205a;

        /* renamed from: b */
        final /* synthetic */ FrameLayout f85206b;

        View$OnHoverListenerC33079a(C36592a aVar, FrameLayout frameLayout) {
            this.f85205a = aVar;
            this.f85206b = frameLayout;
        }

        public final boolean onHover(View view, MotionEvent motionEvent) {
            Intrinsics.checkExpressionValueIsNotNull(motionEvent, "event");
            if (motionEvent.getAction() == 9) {
                this.f85205a.mo135001b(this.f85206b, -5, 0);
            } else if (motionEvent.getAction() == 10) {
                this.f85205a.dismiss();
            }
            return false;
        }
    }

    @Override // com.ss.android.lark.chat.chatwindow.biz.plugin.core.IChatPlugin, com.ss.android.lark.chat.chatwindow.biz.plugin.core.BaseChatPlugin
    /* renamed from: a */
    public void mo122114a(IChatWindowApp dVar, C35219b bVar) {
        Intrinsics.checkParameterIsNotNull(dVar, "chatApp");
        Intrinsics.checkParameterIsNotNull(bVar, "initData");
        super.mo122114a(dVar, bVar);
        this.f85203b = dVar;
        ITitlebarComponent bVar2 = (ITitlebarComponent) dVar.mo123122a(ITitlebarComponent.class);
        this.f85202a = bVar2;
        if (bVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("titlebarComponent");
        }
        bVar2.getLifecycle().addObserver(new VideoChatPlugin$onCreate$1(this, bVar));
    }

    /* renamed from: a */
    public final void mo122203a(ITitlebarComponent bVar, Chat chat, ChatChatter chatChatter) {
        FrameLayout.LayoutParams layoutParams;
        View view;
        int i;
        AbstractC36474h b = C29990c.m110930b();
        IChatWindowApp dVar = this.f85203b;
        if (dVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("chatApp");
        }
        AbstractC34033a a = b.mo134530a((Activity) dVar.mo123135f(), chat, chatChatter);
        if (a != null) {
            this.f85204c = a;
            IChatWindowApp dVar2 = this.f85203b;
            if (dVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("chatApp");
            }
            C33081c cVar = new C33081c(this, dVar2.mo123135f());
            Context context = cVar.getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "wrapView.context");
            float dimension = context.getResources().getDimension(R.dimen.chat_icon_desktop);
            if (DesktopUtil.m144307b()) {
                int i2 = (int) dimension;
                layoutParams = new FrameLayout.LayoutParams(i2, i2);
            } else {
                layoutParams = new FrameLayout.LayoutParams(-2, -2);
            }
            layoutParams.gravity = 16;
            AbstractC34033a aVar = this.f85204c;
            if (aVar != null) {
                IChatWindowApp dVar3 = this.f85203b;
                if (dVar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("chatApp");
                }
                view = aVar.mo126138a((Activity) dVar3.mo123135f());
            } else {
                view = null;
            }
            cVar.addView(view, layoutParams);
            bVar.mo123663a(0, new C33080b(this, chat, view, cVar, cVar)).setPadding(0, 0, UIHelper.dp2px(12.0f), 0);
            IChatWindowApp dVar4 = this.f85203b;
            if (dVar4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("chatApp");
            }
            if (DesktopUtil.m144301a(dVar4.mo123135f())) {
                C36592a.C36593a aVar2 = new C36592a.C36593a();
                IChatWindowApp dVar5 = this.f85203b;
                if (dVar5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("chatApp");
                }
                Context f = dVar5.mo123135f();
                if (chat.isP2PChat()) {
                    i = R.string.Lark_Legacy_StartCall;
                } else {
                    i = R.string.Lark_Legacy_VideoMeeting;
                }
                C36592a.C36593a a2 = aVar2.mo135002a(f.getString(i));
                IChatWindowApp dVar6 = this.f85203b;
                if (dVar6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("chatApp");
                }
                cVar.setOnHoverListener(new View$OnHoverListenerC33079a(a2.mo135003a(dVar6.mo123135f()), cVar));
            }
        }
    }
}
