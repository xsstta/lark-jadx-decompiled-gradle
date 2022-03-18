package com.ss.android.lark.chatsetting.impl.common_view.chatsetting;

import android.content.DialogInterface;
import android.view.View;
import com.google.firebase.messaging.Constants;
import com.larksuite.component.universe_design.dialog.UDListDialogController;
import com.larksuite.component.universe_design.dialog.actionpanel.UDActionPanelBuilder;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chatsetting.impl.common_view.base.SettingNavigationPiece;
import com.ss.android.lark.piece.data.DataObserver;
import com.ss.android.lark.piece.p2465b.C51468a;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000A\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0004\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007J\n\u0010\b\u001a\u0004\u0018\u00010\tH\u0014J\u0006\u0010\n\u001a\u00020\u000bJ\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0007H\u0016J\u0010\u0010\u000f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0007H\u0016J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u0007H\u0016J\b\u0010\u0012\u001a\u00020\u0011H&J\b\u0010\u0013\u001a\u00020\u0011H\u0014J\u0018\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0004R\u0010\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0004\n\u0002\u0010\u0005¨\u0006\u0019"}, d2 = {"Lcom/ss/android/lark/chatsetting/impl/common_view/chatsetting/ChatSettingNavigationPiece;", "Lcom/ss/android/lark/chatsetting/impl/common_view/base/SettingNavigationPiece;", "()V", "chatChangedObserver", "com/ss/android/lark/chatsetting/impl/common_view/chatsetting/ChatSettingNavigationPiece$chatChangedObserver$1", "Lcom/ss/android/lark/chatsetting/impl/common_view/chatsetting/ChatSettingNavigationPiece$chatChangedObserver$1;", "getChat", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "getContentClickListener", "Landroid/view/View$OnClickListener;", "getPageType", "", "isContentViewEnable", "", "chat", "isContentViewVisible", "onChatChanged", "", "onClick", "registerShareData", "showAdminSelectDialog", "title", "", "selectedAction", "Lcom/ss/android/lark/chatsetting/impl/common_view/chatsetting/OnDialogSelectedAction;", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
public abstract class ChatSettingNavigationPiece extends SettingNavigationPiece {

    /* renamed from: a */
    private final C34536a f89187a = new C34536a(this, true);

    /* renamed from: c */
    public boolean mo127668c(Chat chat) {
        Intrinsics.checkParameterIsNotNull(chat, "chat");
        return true;
    }

    /* renamed from: m */
    public abstract void mo127669m();

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.chatsetting.impl.common_view.base.SettingBasePiece
    /* renamed from: g */
    public View.OnClickListener mo127636g() {
        return new View$OnClickListenerC34537b(this);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.chatsetting.impl.common_view.base.SettingBasePiece
    /* renamed from: e */
    public void mo127634e() {
        super.mo127634e();
        mo177190a(Chat.class, this.f89187a);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0018, code lost:
        if ((r0 instanceof com.ss.android.lark.chat.entity.chat.Chat) != false) goto L_0x001c;
     */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.ss.android.lark.chat.entity.chat.Chat mo127670n() {
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
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.chatsetting.impl.common_view.chatsetting.ChatSettingNavigationPiece.mo127670n():com.ss.android.lark.chat.entity.chat.Chat");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/chatsetting/impl/common_view/chatsetting/ChatSettingNavigationPiece$chatChangedObserver$1", "Lcom/ss/android/lark/piece/data/DataObserver;", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "onValue", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.common_view.chatsetting.ChatSettingNavigationPiece$a */
    public static final class C34536a extends DataObserver<Chat> {

        /* renamed from: a */
        final /* synthetic */ ChatSettingNavigationPiece f89188a;

        /* renamed from: a */
        public void mo127664a(Chat chat) {
            if (chat != null) {
                this.f89188a.mo127665a(chat);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34536a(ChatSettingNavigationPiece chatSettingNavigationPiece, boolean z) {
            super(z);
            this.f89188a = chatSettingNavigationPiece;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.common_view.chatsetting.ChatSettingNavigationPiece$b */
    static final class View$OnClickListenerC34537b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ChatSettingNavigationPiece f89189a;

        View$OnClickListenerC34537b(ChatSettingNavigationPiece chatSettingNavigationPiece) {
            this.f89189a = chatSettingNavigationPiece;
        }

        public final void onClick(View view) {
            this.f89189a.mo127669m();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/chatsetting/impl/common_view/chatsetting/ChatSettingNavigationPiece$showAdminSelectDialog$1", "Lcom/larksuite/component/universe_design/dialog/UDListDialogController$OnItemClickListener;", "onItemClick", "", "index", "", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.common_view.chatsetting.ChatSettingNavigationPiece$c */
    public static final class C34538c implements UDListDialogController.OnItemClickListener {

        /* renamed from: a */
        final /* synthetic */ OnDialogSelectedAction f89190a;

        C34538c(OnDialogSelectedAction bVar) {
            this.f89190a = bVar;
        }

        @Override // com.larksuite.component.universe_design.dialog.UDListDialogController.OnItemClickListener
        public void onItemClick(int i) {
            boolean z = true;
            if (i != 1) {
                z = false;
            }
            this.f89190a.mo127681a(z);
        }
    }

    /* renamed from: b */
    public boolean mo127667b(Chat chat) {
        Intrinsics.checkParameterIsNotNull(chat, "chat");
        return mo127633d();
    }

    /* renamed from: a */
    public void mo127665a(Chat chat) {
        Intrinsics.checkParameterIsNotNull(chat, "chat");
        mo127628a(mo127667b(chat), mo127668c(chat));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo127666a(String str, OnDialogSelectedAction bVar) {
        Intrinsics.checkParameterIsNotNull(str, "title");
        Intrinsics.checkParameterIsNotNull(bVar, "selectedAction");
        ((UDActionPanelBuilder) ((UDActionPanelBuilder) ((UDActionPanelBuilder) ((UDActionPanelBuilder) new UDActionPanelBuilder(mo177180C()).title(str)).mo90870a(CollectionsKt.listOf((Object[]) new String[]{C51468a.m199493c(R.string.Lark_GroupManagement_EveryoneInThisGroup, mo177180C()), C51468a.m199493c(R.string.Lark_GroupManagement_OnlyGroupOwnerAndGroupAdmin, mo177180C())}))).mo90869a(new C34538c(bVar))).addActionButton(R.id.ud_dialog_btn_cancel, R.string.Lark_Legacy_Cancel, (DialogInterface.OnClickListener) null)).show();
    }
}
