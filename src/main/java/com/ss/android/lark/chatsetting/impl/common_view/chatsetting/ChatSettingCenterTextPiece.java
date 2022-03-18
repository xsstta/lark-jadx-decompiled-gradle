package com.ss.android.lark.chatsetting.impl.common_view.chatsetting;

import com.google.firebase.messaging.Constants;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chatsetting.impl.common_view.base.SettingCenterTextPiece;
import com.ss.android.lark.piece.data.DataObserver;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0004\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007J\n\u0010\b\u001a\u0004\u0018\u00010\tH\u0014J\u0006\u0010\n\u001a\u00020\u000bJ\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0007H\u0016J\u0010\u0010\u000f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0007H\u0016J\b\u0010\u0010\u001a\u00020\rH\u0014J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\u0007H\u0016J\b\u0010\u0013\u001a\u00020\u0012H&J\b\u0010\u0014\u001a\u00020\u0012H\u0014R\u0010\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0004\n\u0002\u0010\u0005¨\u0006\u0015"}, d2 = {"Lcom/ss/android/lark/chatsetting/impl/common_view/chatsetting/ChatSettingCenterTextPiece;", "Lcom/ss/android/lark/chatsetting/impl/common_view/base/SettingCenterTextPiece;", "()V", "chatChangedObserver", "com/ss/android/lark/chatsetting/impl/common_view/chatsetting/ChatSettingCenterTextPiece$chatChangedObserver$1", "Lcom/ss/android/lark/chatsetting/impl/common_view/chatsetting/ChatSettingCenterTextPiece$chatChangedObserver$1;", "getChat", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "getContentClickListener", "Landroid/view/View$OnClickListener;", "getPageType", "", "isContentViewEnable", "", "chat", "isContentViewVisible", "isDefaultVisible", "onChatChanged", "", "onClick", "registerShareData", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
public abstract class ChatSettingCenterTextPiece extends SettingCenterTextPiece {

    /* renamed from: a */
    private final C34535a f89185a = new C34535a(this, true);

    /* renamed from: c */
    public boolean mo127662c(Chat chat) {
        Intrinsics.checkParameterIsNotNull(chat, "chat");
        return true;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.chatsetting.impl.common_view.base.SettingBasePiece
    /* renamed from: d */
    public boolean mo127633d() {
        return false;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/chatsetting/impl/common_view/chatsetting/ChatSettingCenterTextPiece$chatChangedObserver$1", "Lcom/ss/android/lark/piece/data/DataObserver;", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "onValue", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.common_view.chatsetting.ChatSettingCenterTextPiece$a */
    public static final class C34535a extends DataObserver<Chat> {

        /* renamed from: a */
        final /* synthetic */ ChatSettingCenterTextPiece f89186a;

        /* renamed from: a */
        public void mo127664a(Chat chat) {
            if (chat != null) {
                this.f89186a.mo127660a(chat);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34535a(ChatSettingCenterTextPiece chatSettingCenterTextPiece, boolean z) {
            super(z);
            this.f89186a = chatSettingCenterTextPiece;
        }
    }

    /* renamed from: b */
    public boolean mo127661b(Chat chat) {
        Intrinsics.checkParameterIsNotNull(chat, "chat");
        return mo127633d();
    }

    /* renamed from: a */
    public void mo127660a(Chat chat) {
        Intrinsics.checkParameterIsNotNull(chat, "chat");
        mo127628a(mo127661b(chat), mo127662c(chat));
    }
}
