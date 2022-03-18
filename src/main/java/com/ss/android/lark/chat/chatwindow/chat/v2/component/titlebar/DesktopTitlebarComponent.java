package com.ss.android.lark.chat.chatwindow.chat.v2.component.titlebar;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.larksuite.component.ui.tag.LarkNameTag;
import com.larksuite.suite.R;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.appreciablelib.Scene;
import com.ss.android.lark.chat.chatwindow.chat.SecretTagProvider;
import com.ss.android.lark.chat.chatwindow.chat.p1612a.C33085b;
import com.ss.android.lark.chat.chatwindow.chat.v2.component.titlebar.TitlebarComponent;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.ChatChatter;
import com.ss.android.lark.chat.entity.chatter.TagInfo;
import com.ss.android.lark.chat.utils.C34336c;
import com.ss.android.lark.chat.utils.C34339g;
import com.ss.android.lark.chatwindow.view.C35266c;
import com.ss.android.lark.dependency.AbstractC36461ah;
import com.ss.android.lark.dependency.AbstractC36474h;
import com.ss.android.lark.dto.chat.ProfileSource;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.listener.AbstractView$OnClickListenerC58542c;
import com.ss.android.lark.widget.listener.OnSingleClickListener;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u001a\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u0016H\u0016J\b\u0010\u001c\u001a\u00020\u0016H\u0016J\b\u0010\u001d\u001a\u00020\u0016H\u0016J\b\u0010\u001e\u001a\u00020\u0016H\u0016R\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u001f"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/titlebar/DesktopTitlebarComponent;", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/titlebar/TitlebarComponent;", "listener", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/titlebar/TitlebarComponent$OnTitlebarListener;", "dependenceViewModel", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/titlebar/ITitleDependenceViewModel;", "titleBarComponentDependency", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/titlebar/TitlebarComponent$ITitleBarComponentDependency;", "(Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/titlebar/TitlebarComponent$OnTitlebarListener;Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/titlebar/ITitleDependenceViewModel;Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/titlebar/TitlebarComponent$ITitleBarComponentDependency;)V", "getDependenceViewModel", "()Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/titlebar/ITitleDependenceViewModel;", "setDependenceViewModel", "(Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/titlebar/ITitleDependenceViewModel;)V", "getListener", "()Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/titlebar/TitlebarComponent$OnTitlebarListener;", "setListener", "(Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/titlebar/TitlebarComponent$OnTitlebarListener;)V", "getTitleBarComponentDependency", "()Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/titlebar/TitlebarComponent$ITitleBarComponentDependency;", "setTitleBarComponentDependency", "(Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/titlebar/TitlebarComponent$ITitleBarComponentDependency;)V", "bindTitlebar", "", "chat", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "p2pChatter", "Lcom/ss/android/lark/chat/entity/chatter/ChatChatter;", "changeToDarkMode", "hideTitle", "initTitlebar", "showTitle", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
public final class DesktopTitlebarComponent extends TitlebarComponent {

    /* renamed from: m */
    private TitlebarComponent.OnTitlebarListener f86821m;

    /* renamed from: n */
    private ITitleDependenceViewModel f86822n;

    /* renamed from: o */
    private TitlebarComponent.ITitleBarComponentDependency f86823o;

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.titlebar.ITitlebarComponent, com.ss.android.lark.chat.chatwindow.chat.v2.component.titlebar.TitlebarComponent
    /* renamed from: c */
    public void mo121985c() {
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.titlebar.TitlebarComponent
    /* renamed from: f */
    public void mo123646f() {
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.titlebar.TitlebarComponent
    /* renamed from: g */
    public void mo123647g() {
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.titlebar.TitlebarComponent
    /* renamed from: b */
    public void mo123645b() {
        mo123687p().setHeight(UIHelper.dp2px(48.0f));
        mo123687p().removeAllActions();
        mo123687p().setRightVisible(true);
        mo123687p().setLeftVisible(false);
        mo123687p().setSecLeftVisible(false);
        LinearLayout leftLayout = mo123687p().getLeftLayout();
        Intrinsics.checkExpressionValueIsNotNull(leftLayout, "leftLayout");
        if (leftLayout.getChildCount() == 0) {
            leftLayout.removeAllViews();
            View a = C35266c.m137762a(leftLayout.getContext());
            ImageView imageView = (ImageView) a.findViewById(R.id.setting_iv);
            Intrinsics.checkExpressionValueIsNotNull(imageView, "settingView");
            imageView.setVisibility(8);
            leftLayout.addView(a, new LinearLayout.LayoutParams(-2, -2));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/chat/chatwindow/chat/v2/component/titlebar/DesktopTitlebarComponent$bindTitlebar$2", "Lcom/ss/android/lark/widget/listener/OnSingleClickListener;", "onSingleClick", "", "v", "Landroid/view/View;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.titlebar.DesktopTitlebarComponent$b */
    public static final class C33700b extends OnSingleClickListener {

        /* renamed from: a */
        final /* synthetic */ DesktopTitlebarComponent f86827a;

        /* renamed from: b */
        final /* synthetic */ Chat f86828b;

        /* renamed from: c */
        final /* synthetic */ ChatChatter f86829c;

        @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
        public void onSingleClick(View view) {
            Intrinsics.checkParameterIsNotNull(view, "v");
            this.f86827a.mo123674a(this.f86828b, this.f86829c, "config_sidebar");
        }

        C33700b(DesktopTitlebarComponent desktopTitlebarComponent, Chat chat, ChatChatter chatChatter) {
            this.f86827a = desktopTitlebarComponent;
            this.f86828b = chat;
            this.f86829c = chatChatter;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/chat/chatwindow/chat/v2/component/titlebar/DesktopTitlebarComponent$bindTitlebar$1", "Lcom/ss/android/lark/widget/listener/OnLocateClickListener;", "onLocateClick", "", "v", "Landroid/view/View;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.titlebar.DesktopTitlebarComponent$a */
    public static final class C33699a extends AbstractView$OnClickListenerC58542c {

        /* renamed from: a */
        final /* synthetic */ DesktopTitlebarComponent f86824a;

        /* renamed from: b */
        final /* synthetic */ ChatChatter f86825b;

        /* renamed from: c */
        final /* synthetic */ Chat f86826c;

        @Override // com.ss.android.lark.widget.listener.AbstractView$OnClickListenerC58542c
        /* renamed from: a */
        public void mo123648a(View view) {
            Intrinsics.checkParameterIsNotNull(view, "v");
            AbstractC36474h b = C29990c.m110930b();
            Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
            AbstractC36461ah V = b.mo134523V();
            Context y = this.f86824a.mo123693y();
            ProfileSource.C36868a aVar = new ProfileSource.C36868a();
            ChatChatter chatChatter = this.f86825b;
            if (chatChatter == null) {
                Intrinsics.throwNpe();
            }
            ProfileSource.C36868a c = aVar.mo136066c(chatChatter.getId());
            ChatChatter chatChatter2 = this.f86825b;
            if (chatChatter2 == null) {
                Intrinsics.throwNpe();
            }
            V.mo134436a(y, c.mo136061a(Boolean.valueOf(chatChatter2.isBot())).mo136060a(0).mo136062a(C34339g.m133170d(this.f86826c)).mo136063a());
        }

        C33699a(DesktopTitlebarComponent desktopTitlebarComponent, ChatChatter chatChatter, Chat chat) {
            this.f86824a = desktopTitlebarComponent;
            this.f86825b = chatChatter;
            this.f86826c = chat;
        }
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.titlebar.TitlebarComponent
    /* renamed from: a */
    public void mo123644a(Chat chat, ChatChatter chatChatter) {
        Scene scene;
        Intrinsics.checkParameterIsNotNull(chat, "chat");
        mo123690v().setVisibility(0);
        ImageView imageView = (ImageView) mo123687p().findViewById(R.id.chat_avatar_iv);
        String avatarKey = chat.getAvatarKey();
        Intrinsics.checkExpressionValueIsNotNull(avatarKey, "chat.getAvatarKey()");
        if (chat.isSecret()) {
            scene = Scene.SecretChat;
        } else if (chat.isThread()) {
            scene = Scene.Thread;
        } else {
            scene = Scene.Chat;
        }
        C34336c.m133130a(mo123693y(), imageView, avatarKey, chat.getEntityId(), UIHelper.dp2px(32.0f), UIHelper.dp2px(32.0f), scene);
        TextView textView = (TextView) mo123687p().findViewById(R.id.chat_name_tv);
        String name = chat.getName();
        Intrinsics.checkExpressionValueIsNotNull(name, "chat.getName()");
        if (chat.isP2PChat() && chatChatter != null && !TextUtils.isEmpty(chatChatter.getAlias())) {
            name = chatChatter.getAlias();
            Intrinsics.checkExpressionValueIsNotNull(name, "p2pChatter!!.getAlias()");
        }
        Intrinsics.checkExpressionValueIsNotNull(textView, "chatNameTV");
        textView.setText(name);
        if (chat.isP2PChat() && chatChatter != null) {
            imageView.setOnClickListener(new C33699a(this, chatChatter, chat));
        }
        TextView textView2 = (TextView) mo123687p().findViewById(R.id.tag_wrapper);
        C33085b a = C33085b.m127936a(chat, chatChatter).mo122241a(C29990c.m110930b());
        if (chat.isSecret()) {
            a.mo122240a(new SecretTagProvider());
        }
        LarkNameTag.ChatTagBuilder a2 = a.mo122239a(mo141183J().getContext());
        if (chat.isEdu()) {
            TagInfo.Companion aVar = TagInfo.Companion;
            Intrinsics.checkExpressionValueIsNotNull(a2, "builder");
            TagInfo.Factory a3 = TagInfo.Companion.mo124874a();
            Intrinsics.checkExpressionValueIsNotNull(textView2, "tagWrapper");
            Context context = textView2.getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "tagWrapper.context");
            aVar.mo124876a(a2, a3.mo124879a(context));
            a2.mo90037h(false);
        }
        LarkNameTag e = a2.mo90027e();
        Intrinsics.checkExpressionValueIsNotNull(textView2, "tagWrapper");
        e.mo90004a(textView2);
        textView2.setVisibility(0);
        mo123687p().getLeftLayout().setOnClickListener(new C33700b(this, chat, chatChatter));
        ImageView imageView2 = (ImageView) mo123687p().findViewById(R.id.setting_iv);
        Intrinsics.checkExpressionValueIsNotNull(imageView2, "settingView");
        imageView2.setVisibility(0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DesktopTitlebarComponent(TitlebarComponent.OnTitlebarListener eVar, ITitleDependenceViewModel aVar, TitlebarComponent.ITitleBarComponentDependency cVar) {
        super(eVar, aVar, cVar);
        Intrinsics.checkParameterIsNotNull(eVar, "listener");
        Intrinsics.checkParameterIsNotNull(aVar, "dependenceViewModel");
        this.f86821m = eVar;
        this.f86822n = aVar;
        this.f86823o = cVar;
    }
}
