package com.ss.android.lark.chatsetting.impl.common_view.chatsetting;

import android.widget.CompoundButton;
import com.google.firebase.messaging.Constants;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chatsetting.impl.common_view.base.SettingSwitchPiece;
import com.ss.android.lark.piece.data.DataObserver;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0004\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0004J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0007H&J\n\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0014J\b\u0010\r\u001a\u00020\u000eH\u0004J\u0010\u0010\u000f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0007H\u0014J\u0010\u0010\u0010\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0007H\u0014J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\n\u001a\u00020\u0007H\u0014J\u0010\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\tH&J\b\u0010\u0015\u001a\u00020\u0012H\u0014R\u0010\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0004\n\u0002\u0010\u0005¨\u0006\u0016"}, d2 = {"Lcom/ss/android/lark/chatsetting/impl/common_view/chatsetting/ChatSettingSwitchPiece;", "Lcom/ss/android/lark/chatsetting/impl/common_view/base/SettingSwitchPiece;", "()V", "chatChangedObserver", "com/ss/android/lark/chatsetting/impl/common_view/chatsetting/ChatSettingSwitchPiece$chatChangedObserver$1", "Lcom/ss/android/lark/chatsetting/impl/common_view/chatsetting/ChatSettingSwitchPiece$chatChangedObserver$1;", "getChat", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "getCheckedState", "", "chat", "getOnCheckedChangeListener", "Landroid/widget/CompoundButton$OnCheckedChangeListener;", "getPageType", "", "isContentViewEnable", "isContentViewVisible", "onChatChanged", "", "onCheckedChanged", "isChecked", "registerShareData", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
public abstract class ChatSettingSwitchPiece extends SettingSwitchPiece {

    /* renamed from: b */
    private final C34539a f89191b = new C34539a(this, true);

    /* renamed from: b */
    public abstract boolean mo127674b(Chat chat);

    /* renamed from: d */
    public abstract void mo127676d(boolean z);

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public boolean mo127677d(Chat chat) {
        Intrinsics.checkParameterIsNotNull(chat, "chat");
        return true;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.chatsetting.impl.common_view.base.SettingSwitchPiece
    /* renamed from: m */
    public CompoundButton.OnCheckedChangeListener mo127652m() {
        return new C34540b(this);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.chatsetting.impl.common_view.base.SettingBasePiece
    /* renamed from: e */
    public void mo127634e() {
        super.mo127634e();
        mo177190a(Chat.class, this.f89191b);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0018, code lost:
        if ((r0 instanceof com.ss.android.lark.chat.entity.chat.Chat) != false) goto L_0x001c;
     */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.ss.android.lark.chat.entity.chat.Chat mo127678n() {
        /*
            r3 = this;
            com.ss.android.lark.piece.a.c r0 = r3.mo177203q()
            java.lang.Class<com.ss.android.lark.chat.entity.chat.Chat> r1 = com.ss.android.lark.chat.entity.chat.Chat.class
            java.util.concurrent.ConcurrentHashMap r0 = r0.mo177165a()
            java.lang.Object r0 = r0.get(r1)
            r1 = 0
            if (r0 == 0) goto L_0x001b
            java.lang.String r2 = "dataMap[key] ?: return null"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r2)
            boolean r2 = r0 instanceof com.ss.android.lark.chat.entity.chat.Chat
            if (r2 == 0) goto L_0x001b
            goto L_0x001c
        L_0x001b:
            r0 = r1
        L_0x001c:
            com.ss.android.lark.chat.entity.chat.Chat r0 = (com.ss.android.lark.chat.entity.chat.Chat) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.chatsetting.impl.common_view.chatsetting.ChatSettingSwitchPiece.mo127678n():com.ss.android.lark.chat.entity.chat.Chat");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/chatsetting/impl/common_view/chatsetting/ChatSettingSwitchPiece$chatChangedObserver$1", "Lcom/ss/android/lark/piece/data/DataObserver;", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "onValue", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.common_view.chatsetting.ChatSettingSwitchPiece$a */
    public static final class C34539a extends DataObserver<Chat> {

        /* renamed from: a */
        final /* synthetic */ ChatSettingSwitchPiece f89192a;

        /* renamed from: a */
        public void mo127664a(Chat chat) {
            if (chat != null) {
                this.f89192a.mo127673a(chat);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34539a(ChatSettingSwitchPiece chatSettingSwitchPiece, boolean z) {
            super(z);
            this.f89192a = chatSettingSwitchPiece;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public boolean mo127675c(Chat chat) {
        Intrinsics.checkParameterIsNotNull(chat, "chat");
        return mo127633d();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo127673a(Chat chat) {
        Intrinsics.checkParameterIsNotNull(chat, "chat");
        mo127649c(mo127674b(chat));
        mo127628a(mo127675c(chat), mo127677d(chat));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "buttonView", "Landroid/widget/CompoundButton;", "kotlin.jvm.PlatformType", "isChecked", "", "onCheckedChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.common_view.chatsetting.ChatSettingSwitchPiece$b */
    static final class C34540b implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: a */
        final /* synthetic */ ChatSettingSwitchPiece f89193a;

        C34540b(ChatSettingSwitchPiece chatSettingSwitchPiece) {
            this.f89193a = chatSettingSwitchPiece;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            this.f89193a.mo127676d(z);
        }
    }
}
