package com.ss.android.lark.chat.chatwindow.secretchat.plugin;

import android.content.DialogInterface;
import android.view.Window;
import androidx.fragment.app.FragmentActivity;
import com.larksuite.component.ui.dialog.C25639g;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.suite.R;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.chat.C32805a;
import com.ss.android.lark.chat.api.service.p1600b.C32821b;
import com.ss.android.lark.chat.chatwindow.biz.component.keyboard.IKeyboardComponent;
import com.ss.android.lark.chat.chatwindow.biz.plugin.core.BaseChatPlugin;
import com.ss.android.lark.chat.chatwindow.chat.C33218d;
import com.ss.android.lark.chat.chatwindow.chat.v2.component.IChatWindowApp;
import com.ss.android.lark.chat.chatwindow.chat.v2.component.message.IMessageListComponent;
import com.ss.android.lark.chat.chatwindow.chat.v2.component.titlebar.ITitlebarComponent;
import com.ss.android.lark.chat.chatwindow.chat.v2.widget.RecyclerViewItemDetector;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.ChatChatter;
import com.ss.android.lark.chat.entity.message.AbstractC34006a;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.vo.ChatMessageVO;
import com.ss.android.lark.chatwindow.p1720a.p1721a.C35219b;
import com.ss.android.lark.dependency.AbstractC36450aa;
import com.ss.android.lark.dependency.AbstractC36474h;
import com.ss.android.lark.keyboard.KeyBoard;
import com.ss.android.lark.keyboard.plugin.tool.burnlife.BurnLifeKBPlugin;
import com.ss.android.lark.keyboard.plugin.tool.burnlife.IBurnLifeDependency;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.util.share_preference.UserSP;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0018\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\nH\u0016J\b\u0010\u0015\u001a\u00020\nH\u0002J\u0018\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/secretchat/plugin/SecretChatPlugin;", "Lcom/ss/android/lark/chat/chatwindow/biz/plugin/core/BaseChatPlugin;", "()V", "mBurnLifeKBPlugin", "Lcom/ss/android/lark/keyboard/plugin/tool/burnlife/BurnLifeKBPlugin;", "mChatApp", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/IChatWindowApp;", "mMonitorHandler", "Lcom/ss/android/lark/chat/chatwindow/chat/ChatMonitorHandler;", "enableScreenshots", "", "enable", "", "getBurnLifePlugin", "chat", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "onCreate", "chatApp", "initData", "Lcom/ss/android/lark/chatwindow/model/data/ChatWindowInitData;", "onDestroy", "prepareForSecretChat", "updateBurnLife", "chatId", "", "burnLife", "", "Companion", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.chatwindow.secretchat.plugin.a */
public final class SecretChatPlugin extends BaseChatPlugin {

    /* renamed from: d */
    public static final Companion f87403d = new Companion(null);

    /* renamed from: a */
    public C33218d f87404a;

    /* renamed from: b */
    public IChatWindowApp f87405b;

    /* renamed from: c */
    public BurnLifeKBPlugin f87406c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/secretchat/plugin/SecretChatPlugin$Companion;", "", "()V", "SP_KEY_HAS_READ_SECRET_CHAT_TOPS", "", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.secretchat.plugin.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/chat/chatwindow/secretchat/plugin/SecretChatPlugin$onCreate$1", "Lcom/ss/android/lark/chat/chatwindow/biz/component/keyboard/IKeyboardComponent$IKeyboardComponentCallbacks;", "onKeyboardReady", "", "keyboard", "Lcom/ss/android/lark/keyboard/KeyBoard;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.secretchat.plugin.a$c */
    public static final class C33913c implements IKeyboardComponent.IKeyboardComponentCallbacks {

        /* renamed from: a */
        final /* synthetic */ SecretChatPlugin f87409a;

        /* renamed from: b */
        final /* synthetic */ C35219b f87410b;

        /* renamed from: c */
        final /* synthetic */ IKeyboardComponent f87411c;

        @Override // com.ss.android.lark.chat.chatwindow.biz.component.keyboard.IKeyboardComponent.IKeyboardComponentCallbacks
        /* renamed from: a */
        public void mo122065a() {
            IKeyboardComponent.IKeyboardComponentCallbacks.C33036a.m127734a(this);
        }

        @Override // com.ss.android.lark.chat.chatwindow.biz.component.keyboard.IKeyboardComponent.IKeyboardComponentCallbacks
        /* renamed from: b */
        public void mo122067b() {
            IKeyboardComponent.IKeyboardComponentCallbacks.C33036a.m127736b(this);
        }

        @Override // com.ss.android.lark.chat.chatwindow.biz.component.keyboard.IKeyboardComponent.IKeyboardComponentCallbacks
        /* renamed from: a */
        public void mo122066a(KeyBoard fVar) {
            Intrinsics.checkParameterIsNotNull(fVar, "keyboard");
            SecretChatPlugin aVar = this.f87409a;
            Chat chat = this.f87410b.f90956f;
            Intrinsics.checkExpressionValueIsNotNull(chat, "initData.chat");
            aVar.f87406c = aVar.mo123961a(chat);
            BurnLifeKBPlugin aVar2 = this.f87409a.f87406c;
            if (aVar2 != null) {
                this.f87411c.mo121978a("burnLife", aVar2);
            }
        }

        C33913c(SecretChatPlugin aVar, C35219b bVar, IKeyboardComponent cVar) {
            this.f87409a = aVar;
            this.f87410b = bVar;
            this.f87411c = cVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/chat/chatwindow/secretchat/plugin/SecretChatPlugin$onCreate$3", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/message/IMessageListComponent$IListComponentCallbacks;", "onChatUpdate", "", "chat", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.secretchat.plugin.a$d */
    public static final class C33914d implements IMessageListComponent.IListComponentCallbacks {

        /* renamed from: a */
        final /* synthetic */ SecretChatPlugin f87412a;

        @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.message.IMessageListComponent.IListComponentCallbacks
        /* renamed from: a */
        public void mo122152a() {
            IMessageListComponent.IListComponentCallbacks.C33556a.m130094a(this);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C33914d(SecretChatPlugin aVar) {
            this.f87412a = aVar;
        }

        @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.message.IMessageListComponent.IListComponentCallbacks
        /* renamed from: a */
        public void mo122154a(ChatChatter chatChatter) {
            Intrinsics.checkParameterIsNotNull(chatChatter, "chatChatter");
            IMessageListComponent.IListComponentCallbacks.C33556a.m130096a(this, chatChatter);
        }

        @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.message.IMessageListComponent.IListComponentCallbacks
        /* renamed from: a */
        public void mo122153a(Chat chat) {
            Intrinsics.checkParameterIsNotNull(chat, "chat");
            IMessageListComponent.IListComponentCallbacks.C33556a.m130095a(this, chat);
            BurnLifeKBPlugin aVar = this.f87412a.f87406c;
            if (aVar != null) {
                aVar.mo147411a(chat.getBurnLife());
            }
        }
    }

    @Override // com.ss.android.lark.chat.chatwindow.biz.plugin.core.IChatPlugin, com.ss.android.lark.chat.chatwindow.biz.plugin.core.BaseChatPlugin
    public void as_() {
        super.as_();
        C33218d dVar = this.f87404a;
        if (dVar != null) {
            dVar.mo122448a();
        }
        this.f87404a = null;
        C32805a.m125891a().mo120931b();
        m131257a(true);
    }

    /* renamed from: b */
    private final void m131258b() {
        if (mo122130k().getActivity() != null) {
            if (!UserSP.getInstance().getBoolean("secret_chat_tip_readed", false)) {
                AbstractC36474h b = C29990c.m110930b();
                Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
                AbstractC36450aa N = b.mo134515N();
                Intrinsics.checkExpressionValueIsNotNull(N, "ChatModuleInstanceHolder…endency().loginDependency");
                if (!N.mo134401d()) {
                    String string = mo122128i().getString(R.string.Lark_Legacy_SecretChatNote);
                    Intrinsics.checkExpressionValueIsNotNull(string, "context.getString(R.stri…rk_Legacy_SecretChatNote)");
                    String string2 = mo122128i().getString(R.string.Lark_Legacy_AgreeAndUse);
                    Intrinsics.checkExpressionValueIsNotNull(string2, "context.getString(R.stri….Lark_Legacy_AgreeAndUse)");
                    String string3 = mo122128i().getString(R.string.Lark_Legacy_NotNow);
                    Intrinsics.checkExpressionValueIsNotNull(string3, "context.getString(R.string.Lark_Legacy_NotNow)");
                    new C25639g(mo122128i()).mo89237b(string).mo89238b(true).mo89247e(false).mo89246d(false).mo89251j(15).mo89225a(R.id.lkui_dialog_btn_left, string3, new DialogInterface$OnClickListenerC33917g(this)).mo89225a(R.id.lkui_dialog_btn_right, string2, DialogInterface$OnClickListenerC33918h.f87416a).mo89239c();
                }
            }
            m131257a(false);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001J\u001a\u0010\u0003\u001a\u00020\u00042\u0010\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0006H\u0016J\b\u0010\u0007\u001a\u00020\u0004H\u0016J \u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0016¨\u0006\u000e"}, d2 = {"com/ss/android/lark/chat/chatwindow/secretchat/plugin/SecretChatPlugin$onCreate$4", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/widget/RecyclerViewItemDetector$ItemDetectListener;", "Lcom/ss/android/lark/chat/vo/ChatMessageVO;", "onItemDetected", "", "itemList", "", "onReachToBottom", "onScrollPassed", "scrolled", "", "scrolledStartIndex", "", "scrolledEndIndex", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.secretchat.plugin.a$e */
    public static final class C33915e implements RecyclerViewItemDetector.ItemDetectListener<ChatMessageVO<?>> {

        /* renamed from: a */
        final /* synthetic */ SecretChatPlugin f87413a;

        @Override // com.ss.android.lark.chat.chatwindow.chat.v2.widget.RecyclerViewItemDetector.ItemDetectListener
        /* renamed from: a */
        public void mo122146a() {
        }

        @Override // com.ss.android.lark.chat.chatwindow.chat.v2.widget.RecyclerViewItemDetector.ItemDetectListener
        /* renamed from: a */
        public void mo122148a(boolean z, int i, int i2) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C33915e(SecretChatPlugin aVar) {
            this.f87413a = aVar;
        }

        @Override // com.ss.android.lark.chat.chatwindow.chat.v2.widget.RecyclerViewItemDetector.ItemDetectListener
        /* renamed from: a */
        public void mo122147a(List<? extends ChatMessageVO<?>> list) {
            Intrinsics.checkParameterIsNotNull(list, "itemList");
            ArrayList arrayList = new ArrayList();
            Iterator<? extends ChatMessageVO<?>> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((ChatMessageVO) it.next()).mo121681a());
            }
            C33218d dVar = this.f87413a.f87404a;
            if (dVar != null) {
                dVar.mo122449a(arrayList);
            }
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ IChatWindowApp m131256a(SecretChatPlugin aVar) {
        IChatWindowApp dVar = aVar.f87405b;
        if (dVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mChatApp");
        }
        return dVar;
    }

    /* renamed from: a */
    public final BurnLifeKBPlugin mo123961a(Chat chat) {
        return new BurnLifeKBPlugin(chat.getBurnLife(), chat.isGroup(), new C33912b(this, chat));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u001f\n\u0000\n\u0002\u0010\u001e\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012*\u0010\u0003\u001a&\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00020\u0002 \u0005*\u0012\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00060\u0004H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "Ljava/util/ArrayList;", "", "ids", "", "kotlin.jvm.PlatformType", "", "getEmptyMessages"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.secretchat.plugin.a$f */
    static final class C33916f implements C33218d.AbstractC33219a {

        /* renamed from: a */
        final /* synthetic */ IMessageListComponent f87414a;

        C33916f(IMessageListComponent iMessageListComponent) {
            this.f87414a = iMessageListComponent;
        }

        /* renamed from: b */
        public final ArrayList<String> mo122450a(Collection<String> collection) {
            Message message;
            IMessageListComponent iMessageListComponent = this.f87414a;
            Intrinsics.checkExpressionValueIsNotNull(collection, "ids");
            List<AbstractC34006a> a = iMessageListComponent.mo123303a(collection);
            ArrayList<String> arrayList = new ArrayList<>();
            for (AbstractC34006a aVar : a) {
                if (aVar != null) {
                    message = aVar.getMessage();
                } else {
                    message = null;
                }
                if (message != null && message.isCryptoIntermediate()) {
                    arrayList.add(message.getId());
                }
            }
            return arrayList;
        }
    }

    /* renamed from: a */
    private final void m131257a(boolean z) {
        if (mo122130k().getActivity() != null) {
            FragmentActivity activity = mo122130k().getActivity();
            if (activity == null) {
                Intrinsics.throwNpe();
            }
            Intrinsics.checkExpressionValueIsNotNull(activity, "hostFragment.activity!!");
            Window window = activity.getWindow();
            if (z) {
                window.clearFlags(8192);
            } else {
                window.setFlags(8192, 8192);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¨\u0006\u0007"}, d2 = {"com/ss/android/lark/chat/chatwindow/secretchat/plugin/SecretChatPlugin$getBurnLifePlugin$1", "Lcom/ss/android/lark/keyboard/plugin/tool/burnlife/IBurnLifeDependency;", "onUpdateBurnLifeLife", "", "burnTime", "", "originBurnLife", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.secretchat.plugin.a$b */
    public static final class C33912b implements IBurnLifeDependency {

        /* renamed from: a */
        final /* synthetic */ SecretChatPlugin f87407a;

        /* renamed from: b */
        final /* synthetic */ Chat f87408b;

        C33912b(SecretChatPlugin aVar, Chat chat) {
            this.f87407a = aVar;
            this.f87408b = chat;
        }

        @Override // com.ss.android.lark.keyboard.plugin.tool.burnlife.IBurnLifeDependency
        /* renamed from: a */
        public void mo123963a(int i, int i2) {
            SecretChatPlugin aVar = this.f87407a;
            String id = this.f87408b.getId();
            Intrinsics.checkExpressionValueIsNotNull(id, "chat.getId()");
            aVar.mo123962a(id, i);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.secretchat.plugin.a$g */
    public static final class DialogInterface$OnClickListenerC33917g implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ SecretChatPlugin f87415a;

        DialogInterface$OnClickListenerC33917g(SecretChatPlugin aVar) {
            this.f87415a = aVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            SecretChatPlugin.m131256a(this.f87415a).mo123138i();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.secretchat.plugin.a$h */
    public static final class DialogInterface$OnClickListenerC33918h implements DialogInterface.OnClickListener {

        /* renamed from: a */
        public static final DialogInterface$OnClickListenerC33918h f87416a = new DialogInterface$OnClickListenerC33918h();

        DialogInterface$OnClickListenerC33918h() {
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            UserSP.getInstance().putBoolean("secret_chat_tip_readed", true);
        }
    }

    @Override // com.ss.android.lark.chat.chatwindow.biz.plugin.core.IChatPlugin, com.ss.android.lark.chat.chatwindow.biz.plugin.core.BaseChatPlugin
    /* renamed from: a */
    public void mo122114a(IChatWindowApp dVar, C35219b bVar) {
        Intrinsics.checkParameterIsNotNull(dVar, "chatApp");
        Intrinsics.checkParameterIsNotNull(bVar, "initData");
        super.mo122114a(dVar, bVar);
        this.f87405b = dVar;
        if (bVar.f90956f.isSecret()) {
            IKeyboardComponent cVar = (IKeyboardComponent) dVar.mo123122a(IKeyboardComponent.class);
            cVar.mo121971a(new C33913c(this, bVar, cVar));
            ITitlebarComponent bVar2 = (ITitlebarComponent) dVar.mo123122a(ITitlebarComponent.class);
            bVar2.getLifecycle().addObserver(new SecretChatPlugin$onCreate$2(bVar2));
            IMessageListComponent iMessageListComponent = (IMessageListComponent) dVar.mo123122a(IMessageListComponent.class);
            iMessageListComponent.mo121971a(new C33914d(this));
            iMessageListComponent.mo123313a(new C33915e(this));
            this.f87404a = new C33218d(new C33916f(iMessageListComponent));
            Log.m165379d("ChatWindowLog", "initMonitorHandler finish");
            m131258b();
        }
    }

    /* renamed from: a */
    public final void mo123962a(String str, int i) {
        C32821b.m126120a().mo120992a(str, i, (IGetDataCallback<Chat>) null);
    }
}
