package com.ss.android.lark.chat.chatwindow.biz.plugin;

import android.content.Context;
import android.content.DialogInterface;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.C1177w;
import androidx.lifecycle.LifecycleOwner;
import com.larksuite.component.universe_design.dialog.UDDialogBuilder;
import com.larksuite.component.universe_design.toast.UDToast;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.suite.R;
import com.ss.android.lark.C29407b;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.biz.im.api.ChatBundle;
import com.ss.android.lark.biz.im.api.ChatWindowPrepareData;
import com.ss.android.lark.chat.base.model.dispatch.RemoveTopNoticeMsgAction;
import com.ss.android.lark.chat.base.model.p1602a.AbstractC32919a;
import com.ss.android.lark.chat.base.model.p1602a.C32920b;
import com.ss.android.lark.chat.base.view.p1603a.AbstractC32928b;
import com.ss.android.lark.chat.base.view.vo.message.PostContentVO;
import com.ss.android.lark.chat.chatwindow.biz.plugin.core.BaseChatPlugin;
import com.ss.android.lark.chat.chatwindow.chat.banner.AbstractC33152a;
import com.ss.android.lark.chat.chatwindow.chat.banner.AbstractC33186e;
import com.ss.android.lark.chat.chatwindow.chat.banner.component.TopNoticeMessageBanner;
import com.ss.android.lark.chat.chatwindow.chat.menu.IMessageMenuProvider;
import com.ss.android.lark.chat.chatwindow.chat.p1613b.p1615b.AbstractC33120i;
import com.ss.android.lark.chat.chatwindow.chat.v2.component.IChatWindowApp;
import com.ss.android.lark.chat.chatwindow.chat.v2.component.message.IMessageListComponent;
import com.ss.android.lark.chat.chatwindow.chat.v2.component.titlebar.ITitlebarComponent;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.ChatChatter;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.export.ui.p1672b.C34029b;
import com.ss.android.lark.chat.export.vo.ContentVO;
import com.ss.android.lark.chat.message_menu.MessageActionManager;
import com.ss.android.lark.chat.topnoticemessage.MessageTopNoticeModel;
import com.ss.android.lark.chat.topnoticemessage.MessageTopNoticeProvider;
import com.ss.android.lark.chat.topnoticemessage.banner.TopNoticeBannerController;
import com.ss.android.lark.chat.topnoticemessage.message.TopNoticeMessage;
import com.ss.android.lark.chat.topnoticemessage.message.entity.AnnouncementTopNoticeMessage;
import com.ss.android.lark.chat.topnoticemessage.message.entity.GeneralTopNoticeMessage;
import com.ss.android.lark.chat.topnoticemessage.message.entity.ITopNoticeMessage;
import com.ss.android.lark.chat.topnoticemessage.p1685c.C34321b;
import com.ss.android.lark.chat.utils.C34339g;
import com.ss.android.lark.chat.vo.AbsMessageVO;
import com.ss.android.lark.chat.vo.ChatMessageVO;
import com.ss.android.lark.chatwindow.p1720a.p1721a.C35219b;
import com.ss.android.lark.dependency.AbstractC36450aa;
import com.ss.android.lark.dependency.AbstractC36461ah;
import com.ss.android.lark.dependency.AbstractC36474h;
import com.ss.android.lark.dependency.IBrowserDependency;
import com.ss.android.lark.dto.chat.ProfileSource;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.statistics.chat.ChatHitPointExtraParams;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.recyclerview.hive.AbstractC59010e;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KDeclarationContainer;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Õ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b*\u0001\u0006\u0018\u0000 a2\u00020\u00012\u00020\u00022\u00020\u0003:\u0002abB\u0005¢\u0006\u0002\u0010\u0004J\u0010\u0010(\u001a\u00020\u000e2\u0006\u0010)\u001a\u00020\fH\u0002J\u0012\u0010*\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030,0+H\u0016J\u0019\u0010-\u001a\u00020.2\n\u0010/\u001a\u0006\u0012\u0002\b\u00030,H\u0000¢\u0006\u0002\b0J(\u00101\u001a\u0006\u0012\u0002\b\u0003022\u0006\u00103\u001a\u0002042\u0006\u00105\u001a\u0002062\n\u0010/\u001a\u0006\u0012\u0002\b\u000307H\u0016J\u0010\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020;H\u0002J\u0010\u0010<\u001a\u0002092\u0006\u0010=\u001a\u00020>H\u0002J\u0010\u0010?\u001a\u00020\u000e2\u0006\u0010@\u001a\u00020AH\u0002J\u0016\u0010B\u001a\u0002092\f\u0010=\u001a\b\u0012\u0002\b\u0003\u0018\u00010CH\u0002J\b\u0010D\u001a\u00020\u000eH\u0002J\r\u0010E\u001a\u00020\u000eH\u0000¢\u0006\u0002\bFJ\b\u0010G\u001a\u000209H\u0002J\u001a\u0010H\u001a\u0002092\u0006\u0010)\u001a\u00020\f2\b\u0010I\u001a\u0004\u0018\u00010\u001aH\u0002J\b\u0010J\u001a\u00020\u000eH\u0002J\b\u0010K\u001a\u00020\u000eH\u0016J\b\u0010L\u001a\u00020\u000eH\u0002J\b\u0010M\u001a\u000209H\u0016J\u0018\u0010N\u001a\u0002092\u0006\u0010O\u001a\u00020P2\u0006\u0010Q\u001a\u00020RH\u0016J\b\u0010S\u001a\u000209H\u0016J\u0010\u0010T\u001a\u0002092\u0006\u0010I\u001a\u00020UH\u0016J\u0010\u0010V\u001a\u0002092\u0006\u0010W\u001a\u00020XH\u0016J\u0014\u0010Y\u001a\u0002092\n\u0010Z\u001a\u0006\u0012\u0002\b\u00030CH\u0016J\b\u0010[\u001a\u000209H\u0002J!\u0010\\\u001a\u0002092\n\u0010]\u001a\u0006\u0012\u0002\b\u00030,2\u0006\u0010^\u001a\u00020\u000eH\u0000¢\u0006\u0002\b_J\b\u0010`\u001a\u000209H\u0002R\u0010\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0004\n\u0002\u0010\u0007R\u0016\u0010\b\u001a\n \n*\u0004\u0018\u00010\t0\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX.¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X.¢\u0006\u0002\n\u0000R\u001c\u0010\u0011\u001a\n \n*\u0004\u0018\u00010\u00120\u0012X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0015\u001a\u00020\u0016X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X.¢\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u001c\u001a\n \n*\u0004\u0018\u00010\u001d0\u001dX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX.¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020!X.¢\u0006\u0002\n\u0000R\u001c\u0010\"\u001a\u0004\u0018\u00010#X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'¨\u0006c"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/biz/plugin/MessageTopNoticePlugin;", "Lcom/ss/android/lark/chat/chatwindow/biz/plugin/core/BaseChatPlugin;", "Lcom/ss/android/lark/chat/topnoticemessage/banner/TopNoticeBannerController$BannerClickHandler;", "Lcom/ss/android/lark/chat/chatwindow/chat/menu/IMessageMenuProvider;", "()V", "bannerListener", "com/ss/android/lark/chat/chatwindow/biz/plugin/MessageTopNoticePlugin$bannerListener$1", "Lcom/ss/android/lark/chat/chatwindow/biz/plugin/MessageTopNoticePlugin$bannerListener$1;", "browserModule", "Lcom/ss/android/lark/dependency/IBrowserDependency;", "kotlin.jvm.PlatformType", "currentChat", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "enableTopNoticeMessage", "", "liftCycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "loginDependency", "Lcom/ss/android/lark/dependency/ILoginDependency;", "getLoginDependency$im_chat_chat_productionUsRelease", "()Lcom/ss/android/lark/dependency/ILoginDependency;", "messageActionProvider", "Lcom/ss/android/lark/chat/topnoticemessage/MessageTopNoticeProvider;", "messageList", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/message/IMessageListComponent;", "p2pChatChatter", "Lcom/ss/android/lark/chat/entity/chatter/ChatChatter;", "pluginEnable", "profileModule", "Lcom/ss/android/lark/dependency/IProfileDependency;", "titleBar", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/titlebar/ITitlebarComponent;", "topNoticeBanner", "Lcom/ss/android/lark/chat/chatwindow/chat/banner/component/TopNoticeMessageBanner;", "topNoticeModel", "Lcom/ss/android/lark/chat/topnoticemessage/MessageTopNoticeModel;", "getTopNoticeModel$im_chat_chat_productionUsRelease", "()Lcom/ss/android/lark/chat/topnoticemessage/MessageTopNoticeModel;", "setTopNoticeModel$im_chat_chat_productionUsRelease", "(Lcom/ss/android/lark/chat/topnoticemessage/MessageTopNoticeModel;)V", "checkEnablePluginBeforeInit", "chat", "getMenuFilter", "Lcom/ss/android/lark/chat/base/view/menu/IMenuFilter;", "Lcom/ss/android/lark/chat/vo/AbsMessageVO;", "getMenuIconAndLabel", "Lcom/ss/android/lark/chat/chatwindow/biz/plugin/MessageTopNoticePlugin$InnerMenuInfo;", "item", "getMenuIconAndLabel$im_chat_chat_productionUsRelease", "getMenuItem", "Lcom/ss/android/lark/chat/export/ui/menu/MenuItem;", "menuHandler", "Lcom/ss/android/lark/chat/chatwindow/chat/menu/handler/IMenuHandlerHub;", "hiveHolder", "Lcom/ss/android/lark/widget/recyclerview/hive/HiveHolder;", "Lcom/ss/android/lark/chat/vo/ChatMessageVO;", "handleAnnouncementMsgClick", "", "docUrl", "", "handleChatMsgClick", "message", "Lcom/ss/android/lark/chat/entity/message/Message;", "handleMessageRemoveOrRecallIfNeed", "action", "Lcom/ss/android/lark/chat/base/model/dispatch/Action;", "handleTopNoticeMessage", "Lcom/ss/android/lark/chat/topnoticemessage/message/entity/ITopNoticeMessage;", "hasRemovePermission", "hasTopNoticeMessage", "hasTopNoticeMessage$im_chat_chat_productionUsRelease", "initBanner", "initSelf", "chatter", "isAdminOrOwner", "isEnabled", "isSelfTopNoticeMsg", "onBannerClose", "onCreate", "chatApp", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/IChatWindowApp;", "initData", "Lcom/ss/android/lark/chatwindow/model/data/ChatWindowInitData;", "onDestroy", "onMessageTopperClick", "Lcom/ss/android/lark/chat/entity/chatter/Chatter;", "onNewIntent", "bundle", "Lcom/ss/android/lark/biz/im/api/ChatBundle;", "onTopNoticeMsgClick", "noticeMessage", "showNoticeRemoveDialog", "toggleStickyTopMessage", "messageVO", "isPinTop", "toggleStickyTopMessage$im_chat_chat_productionUsRelease", "unInitSelfIfNeed", "Companion", "InnerMenuInfo", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.chatwindow.biz.plugin.c */
public final class MessageTopNoticePlugin extends BaseChatPlugin implements IMessageMenuProvider, TopNoticeBannerController.BannerClickHandler {

    /* renamed from: d */
    public static final Companion f85165d = new Companion(null);

    /* renamed from: a */
    public Chat f85166a;

    /* renamed from: b */
    public ChatChatter f85167b;

    /* renamed from: c */
    public boolean f85168c;

    /* renamed from: e */
    private IMessageListComponent f85169e;

    /* renamed from: f */
    private ITitlebarComponent f85170f;

    /* renamed from: g */
    private TopNoticeMessageBanner f85171g;

    /* renamed from: h */
    private MessageTopNoticeModel f85172h;

    /* renamed from: l */
    private final IBrowserDependency f85173l;

    /* renamed from: m */
    private final AbstractC36461ah f85174m;

    /* renamed from: n */
    private final AbstractC36450aa f85175n;

    /* renamed from: o */
    private LifecycleOwner f85176o;

    /* renamed from: p */
    private final boolean f85177p;

    /* renamed from: q */
    private final MessageTopNoticeProvider f85178q = new MessageTopNoticeProvider(this);

    /* renamed from: r */
    private final C33069c f85179r = new C33069c(this);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/biz/plugin/MessageTopNoticePlugin$Companion;", "", "()V", "BANNER_MUTEX_CODE", "", "TAG", "", "TOP_NOTICE_PRIORITY", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.biz.plugin.c$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00032\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0017"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/biz/plugin/MessageTopNoticePlugin$InnerMenuInfo;", "", "actionPinTop", "", "label", "", "iconRes", "", "(ZLjava/lang/String;I)V", "getActionPinTop", "()Z", "getIconRes", "()I", "getLabel", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "toString", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.biz.plugin.c$b */
    public static final class InnerMenuInfo {

        /* renamed from: a */
        private final boolean f85180a;

        /* renamed from: b */
        private final String f85181b;

        /* renamed from: c */
        private final int f85182c;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InnerMenuInfo)) {
                return false;
            }
            InnerMenuInfo bVar = (InnerMenuInfo) obj;
            return this.f85180a == bVar.f85180a && Intrinsics.areEqual(this.f85181b, bVar.f85181b) && this.f85182c == bVar.f85182c;
        }

        public int hashCode() {
            boolean z = this.f85180a;
            if (z) {
                z = true;
            }
            int i = z ? 1 : 0;
            int i2 = z ? 1 : 0;
            int i3 = z ? 1 : 0;
            int i4 = i * 31;
            String str = this.f85181b;
            return ((i4 + (str != null ? str.hashCode() : 0)) * 31) + this.f85182c;
        }

        public String toString() {
            return "InnerMenuInfo(actionPinTop=" + this.f85180a + ", label=" + this.f85181b + ", iconRes=" + this.f85182c + ")";
        }

        /* renamed from: a */
        public final boolean mo122174a() {
            return this.f85180a;
        }

        /* renamed from: b */
        public final String mo122175b() {
            return this.f85181b;
        }

        /* renamed from: c */
        public final int mo122176c() {
            return this.f85182c;
        }

        public InnerMenuInfo(boolean z, String str, int i) {
            Intrinsics.checkParameterIsNotNull(str, "label");
            this.f85180a = z;
            this.f85181b = str;
            this.f85182c = i;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/chat/chatwindow/biz/plugin/MessageTopNoticePlugin$onCreate$1", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/message/IMessageListComponent$IListComponentCallbacks;", "onChatUpdate", "", "chat", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.biz.plugin.c$h */
    public static final class C33074h implements IMessageListComponent.IListComponentCallbacks {

        /* renamed from: a */
        final /* synthetic */ MessageTopNoticePlugin f85190a;

        @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.message.IMessageListComponent.IListComponentCallbacks
        /* renamed from: a */
        public void mo122152a() {
            IMessageListComponent.IListComponentCallbacks.C33556a.m130094a(this);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C33074h(MessageTopNoticePlugin cVar) {
            this.f85190a = cVar;
        }

        @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.message.IMessageListComponent.IListComponentCallbacks
        /* renamed from: a */
        public void mo122153a(Chat chat) {
            Intrinsics.checkParameterIsNotNull(chat, "chat");
            this.f85190a.f85166a = chat;
        }

        @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.message.IMessageListComponent.IListComponentCallbacks
        /* renamed from: a */
        public void mo122154a(ChatChatter chatChatter) {
            Intrinsics.checkParameterIsNotNull(chatChatter, "chatChatter");
            IMessageListComponent.IListComponentCallbacks.C33556a.m130096a(this, chatChatter);
        }
    }

    /* renamed from: b */
    public final MessageTopNoticeModel mo122166b() {
        return this.f85172h;
    }

    /* renamed from: c */
    public final AbstractC36450aa mo122168c() {
        return this.f85175n;
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.menu.IMessageMenuProvider
    /* renamed from: g */
    public boolean mo122172g() {
        return this.f85168c;
    }

    /* renamed from: a */
    public final boolean mo122165a(AbstractC32919a aVar) {
        C1177w<ITopNoticeMessage<?>> a;
        if (!this.f85168c) {
            return false;
        }
        boolean z = aVar instanceof RemoveTopNoticeMsgAction;
        MessageTopNoticeModel bVar = this.f85172h;
        ITopNoticeMessage<?> b = (bVar == null || (a = bVar.mo126857a()) == null) ? null : a.mo5927b();
        boolean z2 = b instanceof GeneralTopNoticeMessage;
        if (!z || !z2) {
            return false;
        }
        if (aVar != null) {
            RemoveTopNoticeMsgAction fVar = (RemoveTopNoticeMsgAction) aVar;
            String a2 = fVar.mo121565a();
            if (b == null) {
                throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.chat.topnoticemessage.message.entity.GeneralTopNoticeMessage");
            } else if (!Intrinsics.areEqual(a2, ((GeneralTopNoticeMessage) b).mo126900f().getId())) {
                return false;
            } else {
                if (fVar.mo121566b()) {
                    MessageTopNoticeModel bVar2 = this.f85172h;
                    if (bVar2 != null) {
                        bVar2.mo126861a(true);
                    }
                } else {
                    MessageTopNoticeModel bVar3 = this.f85172h;
                    if (bVar3 != null) {
                        bVar3.mo126864b(true);
                    }
                }
                return true;
            }
        } else {
            throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.chat.base.model.dispatch.RemoveTopNoticeMsgAction");
        }
    }

    /* renamed from: a */
    public final void mo122162a(AbsMessageVO<?> aVar, boolean z) {
        Intrinsics.checkParameterIsNotNull(aVar, "messageVO");
        if (this.f85168c) {
            if (!z) {
                MessageTopNoticeModel bVar = this.f85172h;
                if (bVar != null) {
                    MessageTopNoticeModel.m133006a(bVar, false, 1, (Object) null);
                    return;
                }
                return;
            }
            ContentVO g = aVar.mo121699g();
            if (!(g instanceof PostContentVO) || !((PostContentVO) g).mo121882n()) {
                MessageTopNoticeModel bVar2 = this.f85172h;
                if (bVar2 != null) {
                    bVar2.mo126860a(aVar.mo121681a());
                    return;
                }
                return;
            }
            MessageTopNoticeModel bVar3 = this.f85172h;
            if (bVar3 != null) {
                bVar3.mo126867e();
            }
        }
    }

    /* renamed from: a */
    public final void mo122164a(ITopNoticeMessage<?> cVar) {
        TopNoticeMessageBanner bVar = this.f85171g;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("topNoticeBanner");
        }
        if (bVar.mo122353g()) {
            if (Intrinsics.areEqual(cVar, TopNoticeMessage.f88632a.mo126894a())) {
                ITitlebarComponent bVar2 = this.f85170f;
                if (bVar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("titleBar");
                }
                bVar2.mo123667a(SmActions.ACTION_ONTHECALL_EXIT, false, null);
                return;
            }
            TopNoticeMessageBanner bVar3 = this.f85171g;
            if (bVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("topNoticeBanner");
            }
            bVar3.mo122361a(cVar);
        } else if (cVar != null && (!Intrinsics.areEqual(cVar, TopNoticeMessage.f88632a.mo126894a()))) {
            ITitlebarComponent bVar4 = this.f85170f;
            if (bVar4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("titleBar");
            }
            bVar4.mo123667a(SmActions.ACTION_ONTHECALL_EXIT, true, cVar);
        }
    }

    @Override // com.ss.android.lark.chat.topnoticemessage.banner.TopNoticeBannerController.BannerClickHandler
    /* renamed from: a */
    public void mo122163a(Chatter chatter) {
        Intrinsics.checkParameterIsNotNull(chatter, "chatter");
        Log.m165389i("MessageTopNoticePlugin", "onMessageTopperClick: mstType " + chatter.getId());
        C34321b.m133058a(this, ChatHitPointExtraParams.Click.PIN_TO_TOP_OWNER);
        AbstractC36461ah ahVar = this.f85174m;
        Context i = mo122128i();
        ProfileSource.C36868a a = new ProfileSource.C36868a().mo136066c(chatter.getId()).mo136061a(Boolean.valueOf(chatter.isBot()));
        Chat chat = this.f85166a;
        if (chat == null) {
            Intrinsics.throwUninitializedPropertyAccessException("currentChat");
        }
        ProfileSource.C36868a a2 = a.mo136065b(chat.getId()).mo136064b(0).mo136060a(1);
        Chat chat2 = this.f85166a;
        if (chat2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("currentChat");
        }
        ahVar.mo134436a(i, a2.mo136062a(C34339g.m133170d(chat2)).mo136063a());
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0005\u001a\u00020\u0003H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/chat/chatwindow/biz/plugin/MessageTopNoticePlugin$bannerListener$1", "Lcom/ss/android/lark/chat/chatwindow/chat/banner/IBannerListener;", "onClose", "", "onHide", "onShow", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.biz.plugin.c$c */
    public static final class C33069c implements AbstractC33186e {

        /* renamed from: a */
        final /* synthetic */ MessageTopNoticePlugin f85183a;

        @Override // com.ss.android.lark.chat.chatwindow.chat.banner.AbstractC33186e
        /* renamed from: b */
        public void mo122181b() {
        }

        @Override // com.ss.android.lark.chat.chatwindow.chat.banner.AbstractC33186e
        /* renamed from: c */
        public void mo122182c() {
        }

        @Override // com.ss.android.lark.chat.chatwindow.chat.banner.AbstractC33186e
        /* renamed from: a */
        public void mo122180a() {
            C34321b.m133060b(this.f85183a);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C33069c(MessageTopNoticePlugin cVar) {
            this.f85183a = cVar;
        }
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.menu.IMessageMenuProvider
    /* renamed from: f */
    public AbstractC32928b<AbsMessageVO<?>> mo122171f() {
        return new C33070d(this);
    }

    /* renamed from: m */
    private final void m127870m() {
        MessageTopNoticeModel bVar = this.f85172h;
        if (bVar != null) {
            for (T t : bVar.mo126865c()) {
                LifecycleOwner lifecycleOwner = this.f85176o;
                if (lifecycleOwner == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("liftCycleOwner");
                }
                t.mo5922a(lifecycleOwner);
            }
            bVar.mo126868f();
        }
        ITitlebarComponent bVar2 = this.f85170f;
        if (bVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("titleBar");
        }
        bVar2.mo123667a(SmActions.ACTION_ONTHECALL_EXIT, false, null);
    }

    /* renamed from: o */
    private final boolean m127872o() {
        C1177w<ITopNoticeMessage<?>> a;
        ITopNoticeMessage<?> b;
        Chatter a2;
        MessageTopNoticeModel bVar = this.f85172h;
        if (bVar == null || (a = bVar.mo126857a()) == null || (b = a.mo5927b()) == null || (a2 = b.mo126895a()) == null) {
            return false;
        }
        String id = a2.getId();
        AbstractC36450aa aaVar = this.f85175n;
        Intrinsics.checkExpressionValueIsNotNull(aaVar, "loginDependency");
        return Intrinsics.areEqual(id, aaVar.mo134394a());
    }

    @Override // com.ss.android.lark.chat.chatwindow.biz.plugin.core.IChatPlugin, com.ss.android.lark.chat.chatwindow.biz.plugin.core.BaseChatPlugin
    public void as_() {
        super.as_();
        m127870m();
        ITitlebarComponent bVar = this.f85170f;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("titleBar");
        }
        bVar.mo123664a(SmActions.ACTION_ONTHECALL_EXIT);
        C32920b.from(mo122130k().getActivity()).unregisterActionHandler(new C33078d(new C33076j(this)));
        MessageActionManager.f84892a.mo121934b(this.f85178q);
    }

    @Override // com.ss.android.lark.chat.topnoticemessage.banner.TopNoticeBannerController.BannerClickHandler
    /* renamed from: d */
    public void mo122169d() {
        Log.m165389i("MessageTopNoticePlugin", "onBannerClose");
        C34321b.m133058a(this, ChatHitPointExtraParams.Click.CLOSE_PIN_TO_TOP);
        if (m127871n()) {
            m127873p();
            return;
        }
        MessageTopNoticeModel bVar = this.f85172h;
        if (bVar != null) {
            MessageTopNoticeModel.m133007b(bVar, false, 1, null);
        }
    }

    /* renamed from: e */
    public final boolean mo122170e() {
        Chat chat = this.f85166a;
        if (chat == null) {
            Intrinsics.throwUninitializedPropertyAccessException("currentChat");
        }
        if (!chat.isAdmin()) {
            Chat chat2 = this.f85166a;
            if (chat2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("currentChat");
            }
            String ownerId = chat2.getOwnerId();
            AbstractC36450aa aaVar = this.f85175n;
            Intrinsics.checkExpressionValueIsNotNull(aaVar, "loginDependency");
            if (Intrinsics.areEqual(ownerId, aaVar.mo134394a())) {
                return true;
            }
            return false;
        }
        return true;
    }

    /* renamed from: h */
    public final boolean mo122173h() {
        ITopNoticeMessage<?> cVar;
        C1177w<ITopNoticeMessage<?>> a;
        MessageTopNoticeModel bVar = this.f85172h;
        if (bVar == null || (a = bVar.mo126857a()) == null) {
            cVar = null;
        } else {
            cVar = a.mo5927b();
        }
        if (cVar == null || !(!Intrinsics.areEqual(cVar, TopNoticeMessage.f88632a.mo126894a()))) {
            return false;
        }
        return true;
    }

    public MessageTopNoticePlugin() {
        AbstractC36474h b = C29990c.m110930b();
        Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
        this.f85173l = b.mo134593u();
        AbstractC36474h b2 = C29990c.m110930b();
        Intrinsics.checkExpressionValueIsNotNull(b2, "ChatModuleInstanceHolder.getDependency()");
        this.f85174m = b2.mo134523V();
        AbstractC36474h b3 = C29990c.m110930b();
        Intrinsics.checkExpressionValueIsNotNull(b3, "ChatModuleInstanceHolder.getDependency()");
        this.f85175n = b3.mo134515N();
        C29407b a = C29990c.m110929a();
        Intrinsics.checkExpressionValueIsNotNull(a, "ChatModuleInstanceHolder.getChatModule()");
        boolean K = a.mo104184K();
        this.f85177p = K;
        this.f85168c = K;
    }

    /* renamed from: l */
    private final void m127869l() {
        AbstractC33152a.AbstractC33153a a = TopNoticeMessageBanner.f85377h.mo122390a().mo122357a(this.f85177p).mo122355a(5).mo122359b(65535).mo122356a(this.f85179r);
        if (a != null) {
            TopNoticeMessageBanner.Builder aVar = (TopNoticeMessageBanner.Builder) a;
            aVar.mo122387a(this);
            this.f85171g = aVar.mo122358a();
            ITitlebarComponent bVar = this.f85170f;
            if (bVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("titleBar");
            }
            TopNoticeMessageBanner bVar2 = this.f85171g;
            if (bVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("topNoticeBanner");
            }
            bVar.mo123668a(bVar2);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.chat.chatwindow.chat.banner.component.TopNoticeMessageBanner.Builder");
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0040  */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean m127871n() {
        /*
            r7 = this;
            com.ss.android.lark.chat.entity.chat.Chat r0 = r7.f85166a
            java.lang.String r1 = "currentChat"
            if (r0 != 0) goto L_0x0009
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
        L_0x0009:
            boolean r0 = r0.isP2PChat()
            com.ss.android.lark.chat.entity.chat.Chat r2 = r7.f85166a
            if (r2 != 0) goto L_0x0014
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
        L_0x0014:
            boolean r2 = r2.isAdmin()
            r3 = 0
            r4 = 1
            if (r2 != 0) goto L_0x003b
            com.ss.android.lark.chat.entity.chat.Chat r2 = r7.f85166a
            if (r2 != 0) goto L_0x0023
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
        L_0x0023:
            java.lang.String r2 = r2.getOwnerId()
            com.ss.android.lark.dependency.aa r5 = r7.f85175n
            java.lang.String r6 = "loginDependency"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r5, r6)
            java.lang.String r5 = r5.mo134394a()
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r5)
            if (r2 == 0) goto L_0x0039
            goto L_0x003b
        L_0x0039:
            r2 = 0
            goto L_0x003c
        L_0x003b:
            r2 = 1
        L_0x003c:
            com.ss.android.lark.chat.entity.chat.Chat r5 = r7.f85166a
            if (r5 != 0) goto L_0x0043
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
        L_0x0043:
            com.ss.android.lark.chat.entity.chat.Chat$TopNoticePermissionSetting r1 = r5.getTopNoticePermissionSetting()
            if (r0 != 0) goto L_0x0055
            if (r2 != 0) goto L_0x0055
            boolean r0 = r7.m127872o()
            if (r0 == 0) goto L_0x0056
            com.ss.android.lark.chat.entity.chat.Chat$TopNoticePermissionSetting r0 = com.ss.android.lark.chat.entity.chat.Chat.TopNoticePermissionSetting.ALL_MEMBER
            if (r1 != r0) goto L_0x0056
        L_0x0055:
            r3 = 1
        L_0x0056:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.chat.chatwindow.biz.plugin.MessageTopNoticePlugin.m127871n():boolean");
    }

    /* renamed from: p */
    private final void m127873p() {
        int i;
        Chat chat = this.f85166a;
        if (chat == null) {
            Intrinsics.throwUninitializedPropertyAccessException("currentChat");
        }
        if (chat.isP2PChat()) {
            i = R.string.Lark_IMChatPin_RemovePinItemPM_PopupText;
        } else {
            i = R.string.Lark_IMChatPin_RemovePinItemGroup_PopupText;
        }
        ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) new UDDialogBuilder(mo122128i()).title(R.string.Lark_IMChatPin_RemovePinItem_PopupTitle)).message(i)).addActionButton(R.id.ud_dialog_btn_secondary, R.string.Lark_IMChatPin_RemovvePinItemGoBack_PopupButton, (DialogInterface.OnClickListener) null)).addActionButton(R.id.ud_dialog_btn_primary, R.string.Lark_IMChatPin_RemovePinItemRemove_PopupButton, new DialogInterface$OnClickListenerC33077k(this))).show();
        C34321b.m133056a(this);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0016\u0010\u0002\u001a\u0012\u0012\u0002\b\u0003 \u0004*\b\u0012\u0002\b\u0003\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/chat/topnoticemessage/message/entity/ITopNoticeMessage;", "kotlin.jvm.PlatformType", "onChanged", "com/ss/android/lark/chat/chatwindow/biz/plugin/MessageTopNoticePlugin$initSelf$1$1"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.biz.plugin.c$f */
    public static final class C33072f<T> implements AbstractC1178x<ITopNoticeMessage<?>> {

        /* renamed from: a */
        final /* synthetic */ MessageTopNoticePlugin f85188a;

        C33072f(MessageTopNoticePlugin cVar) {
            this.f85188a = cVar;
        }

        /* renamed from: a */
        public final void onChanged(ITopNoticeMessage<?> cVar) {
            this.f85188a.mo122164a(cVar);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0015\u0010\u0002\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "p1", "Lcom/ss/android/lark/chat/base/model/dispatch/Action;", "Lkotlin/ParameterName;", "name", "action", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.biz.plugin.c$i */
    static final /* synthetic */ class C33075i extends FunctionReference implements Function1<AbstractC32919a, Boolean> {
        C33075i(MessageTopNoticePlugin cVar) {
            super(1, cVar);
        }

        @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.KCallable
        public final String getName() {
            return "handleMessageRemoveOrRecallIfNeed";
        }

        @Override // kotlin.jvm.internal.CallableReference
        public final KDeclarationContainer getOwner() {
            return Reflection.getOrCreateKotlinClass(MessageTopNoticePlugin.class);
        }

        @Override // kotlin.jvm.internal.CallableReference
        public final String getSignature() {
            return "handleMessageRemoveOrRecallIfNeed(Lcom/ss/android/lark/chat/base/model/dispatch/Action;)Z";
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Boolean invoke(AbstractC32919a aVar) {
            return Boolean.valueOf(invoke(aVar));
        }

        public final boolean invoke(AbstractC32919a aVar) {
            Intrinsics.checkParameterIsNotNull(aVar, "p1");
            return ((MessageTopNoticePlugin) this.receiver).mo122165a(aVar);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0015\u0010\u0002\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "p1", "Lcom/ss/android/lark/chat/base/model/dispatch/Action;", "Lkotlin/ParameterName;", "name", "action", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.biz.plugin.c$j */
    static final /* synthetic */ class C33076j extends FunctionReference implements Function1<AbstractC32919a, Boolean> {
        C33076j(MessageTopNoticePlugin cVar) {
            super(1, cVar);
        }

        @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.KCallable
        public final String getName() {
            return "handleMessageRemoveOrRecallIfNeed";
        }

        @Override // kotlin.jvm.internal.CallableReference
        public final KDeclarationContainer getOwner() {
            return Reflection.getOrCreateKotlinClass(MessageTopNoticePlugin.class);
        }

        @Override // kotlin.jvm.internal.CallableReference
        public final String getSignature() {
            return "handleMessageRemoveOrRecallIfNeed(Lcom/ss/android/lark/chat/base/model/dispatch/Action;)Z";
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Boolean invoke(AbstractC32919a aVar) {
            return Boolean.valueOf(invoke(aVar));
        }

        public final boolean invoke(AbstractC32919a aVar) {
            Intrinsics.checkParameterIsNotNull(aVar, "p1");
            return ((MessageTopNoticePlugin) this.receiver).mo122165a(aVar);
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ Chat m127864a(MessageTopNoticePlugin cVar) {
        Chat chat = cVar.f85166a;
        if (chat == null) {
            Intrinsics.throwUninitializedPropertyAccessException("currentChat");
        }
        return chat;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012*\u0010\u0002\u001a&\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0012\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/chat/export/ui/menu/MenuItem;", "", "kotlin.jvm.PlatformType", "onSelected"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.biz.plugin.c$e */
    static final class C33071e<T> implements C34029b.AbstractC34032b<Object> {

        /* renamed from: a */
        final /* synthetic */ MessageTopNoticePlugin f85185a;

        /* renamed from: b */
        final /* synthetic */ ChatMessageVO f85186b;

        /* renamed from: c */
        final /* synthetic */ InnerMenuInfo f85187c;

        C33071e(MessageTopNoticePlugin cVar, ChatMessageVO cVar2, InnerMenuInfo bVar) {
            this.f85185a = cVar;
            this.f85186b = cVar2;
            this.f85187c = bVar;
        }

        @Override // com.ss.android.lark.chat.export.ui.p1672b.C34029b.AbstractC34032b
        public final void onSelected(C34029b<Object> bVar) {
            this.f85185a.mo122162a(this.f85186b, this.f85187c.mo122174a());
            C34321b.m133057a(this.f85185a, this.f85186b, this.f85187c);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "kotlin.jvm.PlatformType", "onChanged", "com/ss/android/lark/chat/chatwindow/biz/plugin/MessageTopNoticePlugin$initSelf$1$2"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.biz.plugin.c$g */
    public static final class C33073g<T> implements AbstractC1178x<ErrorResult> {

        /* renamed from: a */
        final /* synthetic */ MessageTopNoticePlugin f85189a;

        C33073g(MessageTopNoticePlugin cVar) {
            this.f85189a = cVar;
        }

        /* renamed from: a */
        public final void onChanged(ErrorResult errorResult) {
            Context i = this.f85189a.mo122128i();
            Intrinsics.checkExpressionValueIsNotNull(errorResult, "it");
            String displayMsg = errorResult.getDisplayMsg();
            if (displayMsg == null) {
                displayMsg = "";
            }
            UDToast.show(i, displayMsg);
        }
    }

    /* renamed from: a */
    private final void m127866a(Message message) {
        int position = message.getPosition();
        IMessageListComponent iMessageListComponent = this.f85169e;
        if (iMessageListComponent == null) {
            Intrinsics.throwUninitializedPropertyAccessException("messageList");
        }
        iMessageListComponent.mo123305a(position, true, false, null);
    }

    /* renamed from: a */
    private final void m127867a(String str) {
        this.f85173l.mo134330a(mo122128i(), str);
    }

    @Override // com.ss.android.lark.chat.topnoticemessage.banner.TopNoticeBannerController.BannerClickHandler
    /* renamed from: b */
    public void mo122167b(ITopNoticeMessage<?> cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "noticeMessage");
        Log.m165389i("MessageTopNoticePlugin", "onTopNoticeMsgClick: mstType " + cVar.mo126896b());
        C34321b.m133058a(this, ChatHitPointExtraParams.Click.CLICK_PIN_TO_TOP);
        if (cVar instanceof GeneralTopNoticeMessage) {
            m127866a(((GeneralTopNoticeMessage) cVar).mo126900f());
        } else if (cVar instanceof AnnouncementTopNoticeMessage) {
            m127867a(((AnnouncementTopNoticeMessage) cVar).mo126900f());
        }
    }

    /* renamed from: a */
    private final boolean m127868a(Chat chat) {
        boolean isThread = chat.isThread();
        boolean z = (!chat.isSecret()) & (!isThread) & this.f85168c;
        this.f85168c = z;
        return z;
    }

    /* renamed from: a */
    public final InnerMenuInfo mo122160a(AbsMessageVO<?> aVar) {
        ITopNoticeMessage<?> cVar;
        C1177w<ITopNoticeMessage<?>> a;
        Intrinsics.checkParameterIsNotNull(aVar, "item");
        String string = UIHelper.getString(R.string.Lark_IMChatPin_PinMessage_Option);
        Intrinsics.checkExpressionValueIsNotNull(string, "UIHelper.getString(R.str…hatPin_PinMessage_Option)");
        boolean z = true;
        InnerMenuInfo bVar = new InnerMenuInfo(true, string, R.drawable.ud_icon_set_top_outlined);
        String string2 = UIHelper.getString(R.string.Lark_IMChatPin_RemovePin_Option);
        Intrinsics.checkExpressionValueIsNotNull(string2, "UIHelper.getString(R.str…ChatPin_RemovePin_Option)");
        InnerMenuInfo bVar2 = new InnerMenuInfo(false, string2, R.drawable.ud_icon_set_top_cancel_outlined);
        if (!mo122173h()) {
            return bVar;
        }
        MessageTopNoticeModel bVar3 = this.f85172h;
        if (bVar3 == null || (a = bVar3.mo126857a()) == null) {
            cVar = null;
        } else {
            cVar = a.mo5927b();
        }
        if (!(cVar instanceof AnnouncementTopNoticeMessage)) {
            return (!(cVar instanceof GeneralTopNoticeMessage) || !Intrinsics.areEqual(((GeneralTopNoticeMessage) cVar).mo126900f().getId(), aVar.mo121681a()) || !m127871n()) ? bVar : bVar2;
        }
        ContentVO g = aVar.mo121699g();
        if (!(g instanceof PostContentVO) || !((PostContentVO) g).mo121882n()) {
            z = false;
        }
        return (!z || !m127871n()) ? bVar : bVar2;
    }

    @Override // com.ss.android.lark.chat.chatwindow.biz.plugin.core.IChatPlugin, com.ss.android.lark.chat.chatwindow.biz.plugin.core.BaseChatPlugin
    /* renamed from: a */
    public void mo122127a(ChatBundle chatBundle) {
        Intrinsics.checkParameterIsNotNull(chatBundle, "bundle");
        super.mo122127a(chatBundle);
        ChatWindowPrepareData chatWindowPrepareData = chatBundle.f74040n;
        if (chatWindowPrepareData != null) {
            Intrinsics.checkExpressionValueIsNotNull(chatWindowPrepareData, "bundle.chatWindowInitData ?: return");
            Chat chat = chatWindowPrepareData.chat;
            if (chat != null) {
                m127870m();
                m127865a(chat, chatWindowPrepareData.p2pChatter);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.biz.plugin.c$k */
    public static final class DialogInterface$OnClickListenerC33077k implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ MessageTopNoticePlugin f85191a;

        DialogInterface$OnClickListenerC33077k(MessageTopNoticePlugin cVar) {
            this.f85191a = cVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            C34321b.m133061c(this.f85191a);
            MessageTopNoticeModel b = this.f85191a.mo122166b();
            if (b != null) {
                MessageTopNoticeModel.m133006a(b, false, 1, (Object) null);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012&\u0010\u0002\u001a\"\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u000b\u0012\u0002\b\u0003\u0018\u00010\u0003¨\u0006\u00010\u0003¨\u0006\u00012\u0016\u0010\u0006\u001a\u0012\u0012\u0002\b\u0003 \u0005*\b\u0012\u0002\b\u0003\u0018\u00010\u00070\u0007H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "", "menuItem", "Lcom/ss/android/lark/chat/export/ui/menu/MenuItem;", "", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "Lcom/ss/android/lark/chat/vo/AbsMessageVO;", "accept"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.biz.plugin.c$d */
    static final class C33070d<T> implements AbstractC32928b<AbsMessageVO<?>> {

        /* renamed from: a */
        final /* synthetic */ MessageTopNoticePlugin f85184a;

        C33070d(MessageTopNoticePlugin cVar) {
            this.f85184a = cVar;
        }

        /* renamed from: a */
        public final boolean accept(C34029b<Object> bVar, AbsMessageVO<?> aVar) {
            ChatChatter chatChatter;
            if (bVar.f87966a != 14) {
                return true;
            }
            if (!this.f85184a.f85168c || ((MessageTopNoticePlugin.m127864a(this.f85184a).isP2PChat() && (chatChatter = this.f85184a.f85167b) != null && chatChatter.isDimission()) || MessageTopNoticePlugin.m127864a(this.f85184a).isThread() || MessageTopNoticePlugin.m127864a(this.f85184a).isSuper() || MessageTopNoticePlugin.m127864a(this.f85184a).isSecret())) {
                return false;
            }
            Chat.TopNoticePermissionSetting topNoticePermissionSetting = MessageTopNoticePlugin.m127864a(this.f85184a).getTopNoticePermissionSetting();
            if (MessageTopNoticePlugin.m127864a(this.f85184a).isP2PChat() || this.f85184a.mo122170e() || topNoticePermissionSetting == Chat.TopNoticePermissionSetting.ALL_MEMBER) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: a */
    private final void m127865a(Chat chat, ChatChatter chatChatter) {
        if (m127868a(chat)) {
            this.f85166a = chat;
            this.f85167b = chatChatter;
            String id = chat.getId();
            Intrinsics.checkExpressionValueIsNotNull(id, "chat.getId()");
            MessageTopNoticeModel bVar = new MessageTopNoticeModel(id);
            C1177w<ITopNoticeMessage<?>> a = bVar.mo126857a();
            LifecycleOwner lifecycleOwner = this.f85176o;
            if (lifecycleOwner == null) {
                Intrinsics.throwUninitializedPropertyAccessException("liftCycleOwner");
            }
            a.mo5923a(lifecycleOwner, new C33072f(this));
            C1177w<ErrorResult> b = bVar.mo126863b();
            LifecycleOwner lifecycleOwner2 = this.f85176o;
            if (lifecycleOwner2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("liftCycleOwner");
            }
            b.mo5923a(lifecycleOwner2, new C33073g(this));
            bVar.mo126866d();
            this.f85172h = bVar;
        }
    }

    @Override // com.ss.android.lark.chat.chatwindow.biz.plugin.core.IChatPlugin, com.ss.android.lark.chat.chatwindow.biz.plugin.core.BaseChatPlugin
    /* renamed from: a */
    public void mo122114a(IChatWindowApp dVar, C35219b bVar) {
        Intrinsics.checkParameterIsNotNull(dVar, "chatApp");
        Intrinsics.checkParameterIsNotNull(bVar, "initData");
        super.mo122114a(dVar, bVar);
        this.f85169e = (IMessageListComponent) dVar.mo123122a(IMessageListComponent.class);
        this.f85170f = (ITitlebarComponent) dVar.mo123122a(ITitlebarComponent.class);
        IMessageListComponent iMessageListComponent = this.f85169e;
        if (iMessageListComponent == null) {
            Intrinsics.throwUninitializedPropertyAccessException("messageList");
        }
        iMessageListComponent.mo121971a(new C33074h(this));
        IMessageListComponent iMessageListComponent2 = this.f85169e;
        if (iMessageListComponent2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("messageList");
        }
        iMessageListComponent2.mo123306a(this);
        LifecycleOwner viewLifecycleOwner = mo122130k().getViewLifecycleOwner();
        Intrinsics.checkExpressionValueIsNotNull(viewLifecycleOwner, "hostFragment.viewLifecycleOwner");
        this.f85176o = viewLifecycleOwner;
        C32920b.from(mo122130k().getActivity()).registerActionListener(new C33078d(new C33075i(this)));
        MessageActionManager.f84892a.mo121933a(this.f85178q);
        m127869l();
        Chat chat = bVar.f90956f;
        Intrinsics.checkExpressionValueIsNotNull(chat, "initData.chat");
        m127865a(chat, bVar.f90957g);
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.menu.IMessageMenuProvider
    /* renamed from: a */
    public C34029b<?> mo122161a(AbstractC33120i iVar, AbstractC59010e eVar, ChatMessageVO<?> cVar) {
        Intrinsics.checkParameterIsNotNull(iVar, "menuHandler");
        Intrinsics.checkParameterIsNotNull(eVar, "hiveHolder");
        Intrinsics.checkParameterIsNotNull(cVar, "item");
        InnerMenuInfo a = mo122160a(cVar);
        C34029b<?> a2 = C34029b.m131930a().mo126127a(14).mo126133b(a.mo122175b()).mo126132b(a.mo122176c()).mo126134c(R.color.chat_operation_item_color_selector).mo126128a(new C33071e(this, cVar, a)).mo126131a();
        Intrinsics.checkExpressionValueIsNotNull(a2, "MenuItem.newBuilder<Any>…   }\n            .build()");
        return a2;
    }
}
