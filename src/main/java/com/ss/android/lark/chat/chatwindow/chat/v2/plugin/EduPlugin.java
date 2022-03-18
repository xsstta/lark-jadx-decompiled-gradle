package com.ss.android.lark.chat.chatwindow.chat.v2.plugin;

import com.google.firebase.messaging.Constants;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.chat.api.service.p1600b.C32821b;
import com.ss.android.lark.chat.chatwindow.biz.plugin.core.BaseChatPlugin;
import com.ss.android.lark.chat.chatwindow.chat.banner.component.EduInviteParentBanner;
import com.ss.android.lark.chat.chatwindow.chat.v2.component.IChatWindowApp;
import com.ss.android.lark.chat.chatwindow.chat.v2.component.titlebar.ITitlebarComponent;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chatwindow.p1720a.p1721a.C35219b;
import com.ss.android.lark.dto.chat.ChatInactiveMemberResponse;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.util.share_preference.C57744a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0007\u001a\u00020\bH\u0002J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/chat/v2/plugin/EduPlugin;", "Lcom/ss/android/lark/chat/chatwindow/biz/plugin/core/BaseChatPlugin;", "()V", "initChat", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "titlebarComponent", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/titlebar/ITitlebarComponent;", "initInviteParentState", "", "onCreate", "chatApp", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/IChatWindowApp;", "initData", "Lcom/ss/android/lark/chatwindow/model/data/ChatWindowInitData;", "Companion", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.plugin.d */
public final class EduPlugin extends BaseChatPlugin {

    /* renamed from: c */
    public static final Companion f86929c = new Companion(null);

    /* renamed from: a */
    public Chat f86930a;

    /* renamed from: b */
    public ITitlebarComponent f86931b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/chat/v2/plugin/EduPlugin$Companion;", "", "()V", "INVITE_BANNER_KEY", "", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.plugin.d$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: b */
    public final void mo123754b() {
        Chat chat = this.f86930a;
        if (chat == null) {
            Intrinsics.throwUninitializedPropertyAccessException("initChat");
        }
        if (chat.isEdu()) {
            C57744a a = C57744a.m224104a();
            StringBuilder sb = new StringBuilder();
            sb.append("chat_invite_parent_");
            Chat chat2 = this.f86930a;
            if (chat2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("initChat");
            }
            sb.append(chat2.getId());
            if (!a.getBoolean(sb.toString(), false)) {
                C32821b a2 = C32821b.m126120a();
                Chat chat3 = this.f86930a;
                if (chat3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("initChat");
                }
                a2.mo121076k(chat3.getId(), (IGetDataCallback) mo122129j().wrapAndAddCallback(new C33739b(this)));
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/chat/chatwindow/chat/v2/plugin/EduPlugin$initInviteParentState$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/dto/chat/ChatInactiveMemberResponse;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.plugin.d$b */
    public static final class C33739b implements IGetDataCallback<ChatInactiveMemberResponse> {

        /* renamed from: a */
        final /* synthetic */ EduPlugin f86932a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C33739b(EduPlugin dVar) {
            this.f86932a = dVar;
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            Log.m165383e("ChatWindowLog", "getChatInactiveInfo failed:" + errorResult);
        }

        /* renamed from: a */
        public void onSuccess(ChatInactiveMemberResponse bVar) {
            if (bVar != null && bVar.mo136077a() && bVar.mo136078b() > 0) {
                EduPlugin.m130849a(this.f86932a).mo123667a(64, true, new EduInviteParentBanner.C33180a(EduPlugin.m130850b(this.f86932a).getId(), bVar.mo136078b()));
            }
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ ITitlebarComponent m130849a(EduPlugin dVar) {
        ITitlebarComponent bVar = dVar.f86931b;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("titlebarComponent");
        }
        return bVar;
    }

    /* renamed from: b */
    public static final /* synthetic */ Chat m130850b(EduPlugin dVar) {
        Chat chat = dVar.f86930a;
        if (chat == null) {
            Intrinsics.throwUninitializedPropertyAccessException("initChat");
        }
        return chat;
    }

    @Override // com.ss.android.lark.chat.chatwindow.biz.plugin.core.IChatPlugin, com.ss.android.lark.chat.chatwindow.biz.plugin.core.BaseChatPlugin
    /* renamed from: a */
    public void mo122114a(IChatWindowApp dVar, C35219b bVar) {
        Intrinsics.checkParameterIsNotNull(dVar, "chatApp");
        Intrinsics.checkParameterIsNotNull(bVar, "initData");
        super.mo122114a(dVar, bVar);
        Chat chat = bVar.f90956f;
        Intrinsics.checkExpressionValueIsNotNull(chat, "initData.chat");
        this.f86930a = chat;
        ITitlebarComponent bVar2 = (ITitlebarComponent) dVar.mo123122a(ITitlebarComponent.class);
        this.f86931b = bVar2;
        if (bVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("titlebarComponent");
        }
        bVar2.getLifecycle().addObserver(new EduPlugin$onCreate$1(this));
    }
}
