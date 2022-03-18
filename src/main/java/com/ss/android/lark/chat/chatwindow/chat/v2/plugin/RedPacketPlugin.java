package com.ss.android.lark.chat.chatwindow.chat.v2.plugin;

import android.content.Context;
import android.content.DialogInterface;
import androidx.fragment.app.Fragment;
import com.larksuite.component.ui.dialog.C25639g;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.chat.chatwindow.biz.component.keyboard.ChatKeyboardFgUtil;
import com.ss.android.lark.chat.chatwindow.biz.component.keyboard.IKeyboardComponent;
import com.ss.android.lark.chat.chatwindow.biz.component.keyboard.IKeyboardCreator;
import com.ss.android.lark.chat.chatwindow.biz.plugin.core.BaseChatPlugin;
import com.ss.android.lark.chat.chatwindow.chat.v2.component.IChatWindowApp;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.ChatChatter;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.chat.entity.keyboard.IPlusItem;
import com.ss.android.lark.chatwindow.p1720a.p1721a.C35219b;
import com.ss.android.lark.contact.entity.Contact;
import com.ss.android.lark.contact.entity.UserRelationResponse;
import com.ss.android.lark.dependency.AbstractC36450aa;
import com.ss.android.lark.dependency.AbstractC36456ae;
import com.ss.android.lark.dependency.AbstractC36474h;
import com.ss.android.lark.dependency.AbstractC36493i;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.keyboard.KeyBoard;
import com.ss.android.lark.keyboard.plugin.tool.more.redpacket.IRedPacketDependency;
import com.ss.android.lark.keyboard.plugin.tool.more.redpacket.RedPacketPlusItem;
import com.ss.android.lark.statistics.redpacket.RedPacketHitPoint;
import com.ss.android.lark.widget.dialog.CommonLoadingDialog;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u000bB\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/chat/v2/plugin/RedPacketPlugin;", "Lcom/ss/android/lark/chat/chatwindow/biz/plugin/core/BaseChatPlugin;", "()V", "keyboardComponent", "Lcom/ss/android/lark/chat/chatwindow/biz/component/keyboard/IKeyboardComponent;", "onCreate", "", "chatApp", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/IChatWindowApp;", "initData", "Lcom/ss/android/lark/chatwindow/model/data/ChatWindowInitData;", "RedPacketPlusItemPlugin", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.plugin.m */
public final class RedPacketPlugin extends BaseChatPlugin {

    /* renamed from: a */
    public IKeyboardComponent f87108a;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0012\u0010\u0017\u001a\u00020\u00182\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0002J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\n\u0010\u001b\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u001c\u001a\u00020\u001dH\u0016R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0002X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006\u001e"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/chat/v2/plugin/RedPacketPlugin$RedPacketPlusItemPlugin;", "Lcom/ss/android/lark/chat/chatwindow/biz/component/keyboard/IKeyboardCreator$IPlugin;", "Lcom/ss/android/lark/chat/entity/keyboard/IPlusItem;", "pluginContext", "Lcom/ss/android/lark/chat/chatwindow/biz/component/keyboard/IKeyboardCreator$PluginContext;", "(Lcom/ss/android/lark/chat/chatwindow/chat/v2/plugin/RedPacketPlugin;Lcom/ss/android/lark/chat/chatwindow/biz/component/keyboard/IKeyboardCreator$PluginContext;)V", "chat", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "getChat", "()Lcom/ss/android/lark/chat/entity/chat/Chat;", "chatter", "Lcom/ss/android/lark/chat/entity/chatter/ChatChatter;", "getChatter", "()Lcom/ss/android/lark/chat/entity/chatter/ChatChatter;", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "item", "getItem", "()Lcom/ss/android/lark/chat/entity/keyboard/IPlusItem;", "setItem", "(Lcom/ss/android/lark/chat/entity/keyboard/IPlusItem;)V", "createPluginImpl", "Lcom/ss/android/lark/keyboard/plugin/tool/more/redpacket/RedPacketPlusItem;", "getName", "", "getPlugin", "isEnable", "", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.plugin.m$a */
    public final class RedPacketPlusItemPlugin implements IKeyboardCreator.IPlugin<IPlusItem> {

        /* renamed from: a */
        final /* synthetic */ RedPacketPlugin f87109a;

        /* renamed from: b */
        private final Chat f87110b;

        /* renamed from: c */
        private final Context f87111c;

        /* renamed from: d */
        private final ChatChatter f87112d;

        /* renamed from: e */
        private IPlusItem f87113e;

        @Override // com.ss.android.lark.chat.chatwindow.biz.component.keyboard.IKeyboardCreator.IPlugin
        /* renamed from: a */
        public String mo122012a() {
            return "plus_red_packet";
        }

        /* renamed from: b */
        public final Chat mo123839b() {
            return this.f87110b;
        }

        /* renamed from: e */
        public final Context mo123840e() {
            return this.f87111c;
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\b\u0010\b\u001a\u00020\u0003H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/chat/chatwindow/chat/v2/plugin/RedPacketPlugin$RedPacketPlusItemPlugin$createPluginImpl$1", "Lcom/ss/android/lark/keyboard/plugin/tool/more/redpacket/IRedPacketDependency;", "isSendRedPacketDeniedByUserRelation", "", "target", "Lcom/ss/android/lark/chat/entity/chatter/Chatter;", "currentChat", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "sendRedPacket", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.plugin.m$a$a */
        public static final class C33810a implements IRedPacketDependency {

            /* renamed from: a */
            final /* synthetic */ RedPacketPlusItemPlugin f87114a;

            /* renamed from: b */
            final /* synthetic */ ChatChatter f87115b;

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016J\b\u0010\u0007\u001a\u00020\u0003H\u0016¨\u0006\b"}, d2 = {"com/ss/android/lark/chat/chatwindow/chat/v2/plugin/RedPacketPlugin$RedPacketPlusItemPlugin$createPluginImpl$1$sendRedPacket$1", "Lcom/ss/android/lark/dependency/IMoneyDependency$IGetPluginCallback;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onLoading", "onSuccess", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
            /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.plugin.m$a$a$a */
            public static final class C33811a implements AbstractC36456ae.AbstractC36457a {

                /* renamed from: a */
                final /* synthetic */ C33810a f87116a;

                /* renamed from: b */
                final /* synthetic */ CommonLoadingDialog f87117b;

                /* renamed from: c */
                final /* synthetic */ Ref.ObjectRef f87118c;

                /* renamed from: d */
                final /* synthetic */ Ref.ObjectRef f87119d;

                @Override // com.ss.android.lark.dependency.AbstractC36456ae.AbstractC36457a
                /* renamed from: b */
                public void mo122737b() {
                    this.f87117b.show(this.f87116a.f87114a.mo123840e());
                }

                @Override // com.ss.android.lark.dependency.AbstractC36456ae.AbstractC36457a
                /* renamed from: a */
                public void mo122735a() {
                    this.f87117b.dismiss();
                    AbstractC36474h b = C29990c.m110930b();
                    Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
                    b.mo134598z().mo134426a(this.f87116a.f87114a.mo123840e(), this.f87116a.f87114a.mo123839b().getId(), !this.f87116a.f87114a.mo123839b().isP2PChat(), this.f87116a.f87114a.mo123839b().getUserCount(), this.f87118c.element, this.f87119d.element);
                }

                @Override // com.ss.android.lark.dependency.AbstractC36456ae.AbstractC36457a
                /* renamed from: a */
                public void mo122736a(ErrorResult errorResult) {
                    Intrinsics.checkParameterIsNotNull(errorResult, "err");
                    this.f87117b.dismiss();
                    LKUIToast.show(this.f87116a.f87114a.mo123840e(), (int) R.string.Lark_Legacy_ErrorMessageTip);
                }

                C33811a(C33810a aVar, CommonLoadingDialog commonLoadingDialog, Ref.ObjectRef objectRef, Ref.ObjectRef objectRef2) {
                    this.f87116a = aVar;
                    this.f87117b = commonLoadingDialog;
                    this.f87118c = objectRef;
                    this.f87119d = objectRef2;
                }
            }

            @Override // com.ss.android.lark.keyboard.plugin.tool.more.redpacket.IRedPacketDependency
            /* renamed from: a */
            public boolean mo123213a() {
                String str;
                if (m131015a(this.f87115b, this.f87114a.mo123839b())) {
                    return false;
                }
                AbstractC36474h b = C29990c.m110930b();
                Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
                boolean au = b.au();
                if (au) {
                    RedPacketHitPoint.Companion aVar = RedPacketHitPoint.f135904a;
                    if (this.f87114a.mo123839b().isP2PChat()) {
                        str = "single";
                    } else {
                        str = "group";
                    }
                    aVar.mo187704a(str);
                    Ref.ObjectRef objectRef = new Ref.ObjectRef();
                    objectRef.element = "";
                    Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
                    objectRef2.element = "";
                    ChatChatter chatChatter = this.f87115b;
                    if (chatChatter != null) {
                        T t = (T) chatChatter.getId();
                        Intrinsics.checkExpressionValueIsNotNull(t, "chatter.getId()");
                        objectRef.element = t;
                        T t2 = (T) this.f87115b.getLocalizedName();
                        Intrinsics.checkExpressionValueIsNotNull(t2, "chatter.getLocalizedName()");
                        objectRef2.element = t2;
                    }
                    RedPacketHitPoint.Companion aVar2 = RedPacketHitPoint.f135904a;
                    AbstractC36474h b2 = C29990c.m110930b();
                    Intrinsics.checkExpressionValueIsNotNull(b2, "ChatModuleInstanceHolder.getDependency()");
                    AbstractC36474h.AbstractC36484j am = b2.am();
                    AbstractC36474h b3 = C29990c.m110930b();
                    Intrinsics.checkExpressionValueIsNotNull(b3, "ChatModuleInstanceHolder.getDependency()");
                    AbstractC36456ae z = b3.mo134598z();
                    Intrinsics.checkExpressionValueIsNotNull(z, "ChatModuleInstanceHolder…endency().moneyDependency");
                    boolean a = am.mo134626a(z.mo134423a());
                    AbstractC36474h b4 = C29990c.m110930b();
                    Intrinsics.checkExpressionValueIsNotNull(b4, "ChatModuleInstanceHolder.getDependency()");
                    AbstractC36474h.AbstractC36484j am2 = b4.am();
                    AbstractC36474h b5 = C29990c.m110930b();
                    Intrinsics.checkExpressionValueIsNotNull(b5, "ChatModuleInstanceHolder.getDependency()");
                    AbstractC36456ae z2 = b5.mo134598z();
                    Intrinsics.checkExpressionValueIsNotNull(z2, "ChatModuleInstanceHolder…endency().moneyDependency");
                    aVar2.mo187705a(a, am2.mo134627b(z2.mo134423a()));
                    CommonLoadingDialog commonLoadingDialog = new CommonLoadingDialog();
                    AbstractC36474h b6 = C29990c.m110930b();
                    Intrinsics.checkExpressionValueIsNotNull(b6, "ChatModuleInstanceHolder.getDependency()");
                    b6.mo134598z().mo134427a(new C33811a(this, commonLoadingDialog, objectRef, objectRef2));
                } else {
                    new C25639g(this.f87114a.mo123840e()).mo89254m(R.string.Lark_Legacy_HongbaoUpgrade).mo89224a(R.id.lkui_dialog_btn_right, R.string.Lark_Legacy_IKnow, (DialogInterface.OnClickListener) null).mo89239c();
                }
                return au;
            }

            C33810a(RedPacketPlusItemPlugin aVar, ChatChatter chatChatter) {
                this.f87114a = aVar;
                this.f87115b = chatChatter;
            }

            /* renamed from: a */
            private final boolean m131015a(Chatter chatter, Chat chat) {
                ChatChatter chatChatter;
                if (!chat.isP2PChat() || !chat.isCrossTenant()) {
                    return false;
                }
                AbstractC36474h b = C29990c.m110930b();
                Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
                AbstractC36493i ah = b.ah();
                if (chatter == null) {
                    Intrinsics.throwNpe();
                }
                UserRelationResponse a = ah.mo134645a(chatter.getId());
                if (a == null) {
                    return false;
                }
                if (a.isHasBeBlocked()) {
                    LKUIToast.show(this.f87114a.mo123840e(), (int) R.string.Lark_NewContacts_CantSendHongbaoDueToBlock);
                    return true;
                } else if (a.isHasBlock()) {
                    LKUIToast.show(this.f87114a.mo123840e(), (int) R.string.Lark_NewContacts_CantSendHongbaoDueToBlockOthers);
                    return true;
                } else if (a.isFriend() || (chatChatter = this.f87115b) == null) {
                    return false;
                } else {
                    Contact contact = new Contact(chatChatter.getId(), null, this.f87115b.getLocalizedName());
                    ArrayList<Contact> arrayList = new ArrayList<>();
                    arrayList.add(contact);
                    arrayList.set(0, contact);
                    AbstractC36474h b2 = C29990c.m110930b();
                    Intrinsics.checkExpressionValueIsNotNull(b2, "ChatModuleInstanceHolder.getDependency()");
                    b2.ah().mo134647a(this.f87114a.mo123840e(), UIUtils.getString(this.f87114a.mo123840e(), R.string.Lark_NewContacts_NeedToAddToContactstHongbaoOneDialogContent), "hongbao_confirm", arrayList, null);
                    return true;
                }
            }
        }

        /* renamed from: f */
        public IPlusItem mo122014c() {
            if (this.f87113e == null) {
                this.f87113e = m131008a(this.f87112d);
            }
            return this.f87113e;
        }

        @Override // com.ss.android.lark.chat.chatwindow.biz.component.keyboard.IKeyboardCreator.IPlugin
        /* renamed from: d */
        public boolean mo122015d() {
            if (this.f87110b.isSuper() || this.f87110b.isCrossWithKa() || DesktopUtil.m144301a(this.f87111c)) {
                return false;
            }
            AbstractC36474h b = C29990c.m110930b();
            Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
            if (!b.ab().mo134600a("chat.hongbao")) {
                return false;
            }
            AbstractC36474h b2 = C29990c.m110930b();
            Intrinsics.checkExpressionValueIsNotNull(b2, "ChatModuleInstanceHolder.getDependency()");
            if (!b2.at()) {
                return false;
            }
            AbstractC36474h b3 = C29990c.m110930b();
            Intrinsics.checkExpressionValueIsNotNull(b3, "ChatModuleInstanceHolder.getDependency()");
            if (b3.mo134574b()) {
                return false;
            }
            AbstractC36474h b4 = C29990c.m110930b();
            Intrinsics.checkExpressionValueIsNotNull(b4, "ChatModuleInstanceHolder.getDependency()");
            if (b4.mo134575c()) {
                AbstractC36474h b5 = C29990c.m110930b();
                Intrinsics.checkExpressionValueIsNotNull(b5, "ChatModuleInstanceHolder.getDependency()");
                AbstractC36450aa N = b5.mo134515N();
                Intrinsics.checkExpressionValueIsNotNull(N, "ChatModuleInstanceHolder…endency().loginDependency");
                boolean d = N.mo134401d();
                AbstractC36474h b6 = C29990c.m110930b();
                Intrinsics.checkExpressionValueIsNotNull(b6, "ChatModuleInstanceHolder.getDependency()");
                boolean a = b6.mo134586n().mo134685a("hongbao.enable");
                if (!d && !a) {
                    return false;
                }
            }
            if (this.f87110b.isCrossTenant()) {
                AbstractC36474h b7 = C29990c.m110930b();
                Intrinsics.checkExpressionValueIsNotNull(b7, "ChatModuleInstanceHolder.getDependency()");
                if (!b7.mo134586n().mo134685a("hongbao.cross.tenant")) {
                    return false;
                }
            }
            if (!this.f87110b.isP2PChat()) {
                return true;
            }
            ChatChatter chatChatter = this.f87112d;
            if (chatChatter == null || chatChatter.isBot()) {
                return false;
            }
            String id = chatChatter.getId();
            AbstractC36474h b8 = C29990c.m110930b();
            Intrinsics.checkExpressionValueIsNotNull(b8, "ChatModuleInstanceHolder.getDependency()");
            AbstractC36450aa N2 = b8.mo134515N();
            Intrinsics.checkExpressionValueIsNotNull(N2, "ChatModuleInstanceHolder…endency().loginDependency");
            if (Intrinsics.areEqual(id, N2.mo134394a())) {
                return false;
            }
            return true;
        }

        /* renamed from: a */
        private final RedPacketPlusItem m131008a(ChatChatter chatChatter) {
            return new RedPacketPlusItem(new C33810a(this, chatChatter));
        }

        public RedPacketPlusItemPlugin(RedPacketPlugin mVar, IKeyboardCreator.PluginContext cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "pluginContext");
            this.f87109a = mVar;
            this.f87110b = cVar.mo122078c();
            Context requireContext = cVar.mo122076a().requireContext();
            Intrinsics.checkExpressionValueIsNotNull(requireContext, "pluginContext.host.requireContext()");
            this.f87111c = requireContext;
            this.f87112d = cVar.mo122079d();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/chat/chatwindow/chat/v2/plugin/RedPacketPlugin$onCreate$1", "Lcom/ss/android/lark/chat/chatwindow/biz/component/keyboard/IKeyboardComponent$IKeyboardComponentCallbacks;", "onKeyboardReady", "", "keyboard", "Lcom/ss/android/lark/keyboard/KeyBoard;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.plugin.m$b */
    public static final class C33812b implements IKeyboardComponent.IKeyboardComponentCallbacks {

        /* renamed from: a */
        final /* synthetic */ RedPacketPlugin f87120a;

        /* renamed from: b */
        final /* synthetic */ IChatWindowApp f87121b;

        /* renamed from: c */
        final /* synthetic */ Chat f87122c;

        /* renamed from: d */
        final /* synthetic */ ChatChatter f87123d;

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
            Object o = this.f87121b.mo123193o();
            if (o != null) {
                Chat chat = this.f87122c;
                Intrinsics.checkExpressionValueIsNotNull(chat, "chat");
                RedPacketPlusItemPlugin aVar = new RedPacketPlusItemPlugin(this.f87120a, new IKeyboardCreator.PluginContext((Fragment) o, fVar, chat, this.f87123d, null));
                RedPacketPlugin.m131006a(this.f87120a).mo121977a(aVar.mo122012a(), aVar);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type androidx.fragment.app.Fragment");
        }

        C33812b(RedPacketPlugin mVar, IChatWindowApp dVar, Chat chat, ChatChatter chatChatter) {
            this.f87120a = mVar;
            this.f87121b = dVar;
            this.f87122c = chat;
            this.f87123d = chatChatter;
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ IKeyboardComponent m131006a(RedPacketPlugin mVar) {
        IKeyboardComponent cVar = mVar.f87108a;
        if (cVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("keyboardComponent");
        }
        return cVar;
    }

    @Override // com.ss.android.lark.chat.chatwindow.biz.plugin.core.IChatPlugin, com.ss.android.lark.chat.chatwindow.biz.plugin.core.BaseChatPlugin
    /* renamed from: a */
    public void mo122114a(IChatWindowApp dVar, C35219b bVar) {
        Intrinsics.checkParameterIsNotNull(dVar, "chatApp");
        Intrinsics.checkParameterIsNotNull(bVar, "initData");
        super.mo122114a(dVar, bVar);
        if (ChatKeyboardFgUtil.f85002a.mo122016a()) {
            Chat chat = bVar.f90956f;
            ChatChatter chatChatter = bVar.f90957g;
            IKeyboardComponent cVar = (IKeyboardComponent) dVar.mo123122a(IKeyboardComponent.class);
            this.f87108a = cVar;
            if (cVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("keyboardComponent");
            }
            cVar.mo121971a(new C33812b(this, dVar, chat, chatChatter));
        }
    }
}
