package com.ss.android.lark.chat.chatwindow.chat.v2.plugin;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.chat.chatwindow.biz.component.keyboard.ChatKeyboardFgUtil;
import com.ss.android.lark.chat.chatwindow.biz.component.keyboard.IKeyboardComponent;
import com.ss.android.lark.chat.chatwindow.biz.component.keyboard.IKeyboardCreator;
import com.ss.android.lark.chat.chatwindow.biz.plugin.core.BaseChatPlugin;
import com.ss.android.lark.chat.chatwindow.chat.v2.component.IChatWindowApp;
import com.ss.android.lark.chat.chatwindow.chat.v2.component.titlebar.ITitlebarComponent;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.ChatChatter;
import com.ss.android.lark.chat.entity.keyboard.IPlusItem;
import com.ss.android.lark.chat.entity.p1663c.AbstractC33977a;
import com.ss.android.lark.chat.entity.p1663c.AbstractC33979c;
import com.ss.android.lark.chatwindow.p1720a.p1721a.C35219b;
import com.ss.android.lark.dependency.AbstractC36450aa;
import com.ss.android.lark.dependency.AbstractC36474h;
import com.ss.android.lark.dependency.ICalendarDependency;
import com.ss.android.lark.keyboard.KeyBoard;
import com.ss.android.lark.keyboard.plugin.tool.more.event.EventPlusItem;
import com.ss.android.lark.keyboard.plugin.tool.more.event.IEventDependency;
import com.ss.android.lark.statistics.event.EventHitPoint;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u0012B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0018\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0018\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u0011\u001a\u00020\nH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX.¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/chat/v2/plugin/CalendarPlugin;", "Lcom/ss/android/lark/chat/chatwindow/biz/plugin/core/BaseChatPlugin;", "()V", "keyboardComponent", "Lcom/ss/android/lark/chat/chatwindow/biz/component/keyboard/IKeyboardComponent;", "meetingDependency", "Lcom/ss/android/lark/chat/entity/meeting/IChatMeetingDependency;", "titlebarComponent", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/titlebar/ITitlebarComponent;", "initCommonChat", "", "chatApp", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/IChatWindowApp;", "initData", "Lcom/ss/android/lark/chatwindow/model/data/ChatWindowInitData;", "initMeetingChat", "onCreate", "onDestroy", "CalendarEventPlusItemPlugin", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.plugin.a */
public final class CalendarPlugin extends BaseChatPlugin {

    /* renamed from: a */
    public AbstractC33977a f86909a;

    /* renamed from: b */
    public ITitlebarComponent f86910b;

    /* renamed from: c */
    public IKeyboardComponent f86911c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\n\u0010\u0017\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u0018\u001a\u00020\u0019H\u0016R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0002X\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u001a"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/chat/v2/plugin/CalendarPlugin$CalendarEventPlusItemPlugin;", "Lcom/ss/android/lark/chat/chatwindow/biz/component/keyboard/IKeyboardCreator$IPlugin;", "Lcom/ss/android/lark/chat/entity/keyboard/IPlusItem;", "pluginContext", "Lcom/ss/android/lark/chat/chatwindow/biz/component/keyboard/IKeyboardCreator$PluginContext;", "(Lcom/ss/android/lark/chat/chatwindow/chat/v2/plugin/CalendarPlugin;Lcom/ss/android/lark/chat/chatwindow/biz/component/keyboard/IKeyboardCreator$PluginContext;)V", "chat", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "getChat", "()Lcom/ss/android/lark/chat/entity/chat/Chat;", "chatter", "Lcom/ss/android/lark/chat/entity/chatter/ChatChatter;", "getChatter", "()Lcom/ss/android/lark/chat/entity/chatter/ChatChatter;", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "item", "getPluginContext", "()Lcom/ss/android/lark/chat/chatwindow/biz/component/keyboard/IKeyboardCreator$PluginContext;", "getName", "", "getPlugin", "isEnable", "", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.plugin.a$a */
    public final class CalendarEventPlusItemPlugin implements IKeyboardCreator.IPlugin<IPlusItem> {

        /* renamed from: a */
        final /* synthetic */ CalendarPlugin f86912a;

        /* renamed from: b */
        private final Chat f86913b;

        /* renamed from: c */
        private final ChatChatter f86914c;

        /* renamed from: d */
        private final Context f86915d;

        /* renamed from: e */
        private IPlusItem f86916e;

        /* renamed from: f */
        private final IKeyboardCreator.PluginContext f86917f;

        @Override // com.ss.android.lark.chat.chatwindow.biz.component.keyboard.IKeyboardCreator.IPlugin
        /* renamed from: a */
        public String mo122012a() {
            return "plus_event";
        }

        /* renamed from: b */
        public final Chat mo123743b() {
            return this.f86913b;
        }

        /* renamed from: e */
        public final ChatChatter mo123744e() {
            return this.f86914c;
        }

        /* renamed from: f */
        public final Context mo123745f() {
            return this.f86915d;
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\n\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\b"}, d2 = {"com/ss/android/lark/chat/chatwindow/chat/v2/plugin/CalendarPlugin$CalendarEventPlusItemPlugin$getPlugin$1", "Lcom/ss/android/lark/keyboard/plugin/tool/more/event/IEventDependency;", "createEvent", "", "getChat", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "getUserId", "", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.plugin.a$a$a */
        public static final class C33734a implements IEventDependency {

            /* renamed from: a */
            final /* synthetic */ CalendarEventPlusItemPlugin f86918a;

            @Override // com.ss.android.lark.keyboard.plugin.tool.more.event.IEventDependency
            /* renamed from: b */
            public Chat mo123211b() {
                return this.f86918a.mo123743b();
            }

            @Override // com.ss.android.lark.keyboard.plugin.tool.more.event.IEventDependency
            /* renamed from: c */
            public String mo123212c() {
                AbstractC36474h b = C29990c.m110930b();
                Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
                AbstractC36450aa N = b.mo134515N();
                Intrinsics.checkExpressionValueIsNotNull(N, "ChatModuleInstanceHolder…endency().loginDependency");
                return N.mo134394a();
            }

            @Override // com.ss.android.lark.keyboard.plugin.tool.more.event.IEventDependency
            /* renamed from: a */
            public void mo123210a() {
                String str;
                List<String> list = null;
                if (this.f86918a.mo123743b().isSoloChat() || (this.f86918a.mo123744e() != null && this.f86918a.mo123744e().isBot())) {
                    str = null;
                } else {
                    str = this.f86918a.mo123743b().getId();
                }
                if (this.f86918a.mo123743b().isGroup()) {
                    AbstractC36474h b = C29990c.m110930b();
                    Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
                    AbstractC36450aa N = b.mo134515N();
                    Intrinsics.checkExpressionValueIsNotNull(N, "ChatModuleInstanceHolder…endency().loginDependency");
                    list = CollectionsKt.listOf(N.mo134394a());
                } else if (!this.f86918a.mo123743b().isSoloChat() && this.f86918a.mo123744e() != null && !this.f86918a.mo123744e().isBot()) {
                    AbstractC36474h b2 = C29990c.m110930b();
                    Intrinsics.checkExpressionValueIsNotNull(b2, "ChatModuleInstanceHolder.getDependency()");
                    AbstractC36450aa N2 = b2.mo134515N();
                    Intrinsics.checkExpressionValueIsNotNull(N2, "ChatModuleInstanceHolder…endency().loginDependency");
                    list = CollectionsKt.listOf((Object[]) new String[]{N2.mo134394a(), this.f86918a.mo123744e().getId()});
                }
                AbstractC36474h b3 = C29990c.m110930b();
                Intrinsics.checkExpressionValueIsNotNull(b3, "ChatModuleInstanceHolder.getDependency()");
                b3.mo134517P().mo134340a(this.f86918a.mo123745f(), str, list);
                EventHitPoint.f135703a.mo187477a(this.f86918a.mo123743b());
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            C33734a(CalendarEventPlusItemPlugin aVar) {
                this.f86918a = aVar;
            }
        }

        @Override // com.ss.android.lark.chat.chatwindow.biz.component.keyboard.IKeyboardCreator.IPlugin
        /* renamed from: d */
        public boolean mo122015d() {
            if (this.f86913b.isCrossWithKa() || this.f86913b.isSuper()) {
                return false;
            }
            return true;
        }

        /* renamed from: g */
        public IPlusItem mo122014c() {
            if (this.f86916e == null) {
                this.f86916e = new EventPlusItem(new C33734a(this));
            }
            return this.f86916e;
        }

        public CalendarEventPlusItemPlugin(CalendarPlugin aVar, IKeyboardCreator.PluginContext cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "pluginContext");
            this.f86912a = aVar;
            this.f86917f = cVar;
            this.f86913b = cVar.mo122078c();
            this.f86914c = cVar.mo122079d();
            Context requireContext = cVar.mo122076a().requireContext();
            Intrinsics.checkExpressionValueIsNotNull(requireContext, "pluginContext.host.requireContext()");
            this.f86915d = requireContext;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/chat/chatwindow/chat/v2/plugin/CalendarPlugin$initCommonChat$1", "Lcom/ss/android/lark/chat/chatwindow/biz/component/keyboard/IKeyboardComponent$IKeyboardComponentCallbacks;", "onKeyboardReady", "", "keyboard", "Lcom/ss/android/lark/keyboard/KeyBoard;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.plugin.a$b */
    public static final class C33735b implements IKeyboardComponent.IKeyboardComponentCallbacks {

        /* renamed from: a */
        final /* synthetic */ CalendarPlugin f86919a;

        /* renamed from: b */
        final /* synthetic */ IChatWindowApp f86920b;

        /* renamed from: c */
        final /* synthetic */ C35219b f86921c;

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
            IKeyboardComponent.IKeyboardComponentCallbacks.C33036a.m127735a(this, fVar);
            CalendarPlugin aVar = this.f86919a;
            Object o = this.f86920b.mo123193o();
            if (o != null) {
                Chat chat = this.f86921c.f90956f;
                Intrinsics.checkExpressionValueIsNotNull(chat, "initData.chat");
                CalendarEventPlusItemPlugin aVar2 = new CalendarEventPlusItemPlugin(aVar, new IKeyboardCreator.PluginContext((Fragment) o, fVar, chat, this.f86921c.f90957g, null));
                CalendarPlugin.m130818a(this.f86919a).mo121977a(aVar2.mo122012a(), aVar2);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type androidx.fragment.app.Fragment");
        }

        C33735b(CalendarPlugin aVar, IChatWindowApp dVar, C35219b bVar) {
            this.f86919a = aVar;
            this.f86920b = dVar;
            this.f86921c = bVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016J\b\u0010\u0007\u001a\u00020\u0003H\u0016J\b\u0010\b\u001a\u00020\u0003H\u0016J\b\u0010\t\u001a\u00020\u0003H\u0016J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0011\u001a\u00020\u0003H\u0016J\b\u0010\u0012\u001a\u00020\u0003H\u0016J\u0010\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\fH\u0016¨\u0006\u0015"}, d2 = {"com/ss/android/lark/chat/chatwindow/chat/v2/plugin/CalendarPlugin$initMeetingChat$1", "Lcom/ss/android/lark/chat/entity/meeting/IMeetingChatDependency;", "addChatBannerView", "", "view", "Landroid/view/View;", "closeSideMenu", "hideChatBannerView", "openOwnerShipSettingActivity", "openSideMenu", "scrollMenuToPosition", "index", "", "showMeetingMinuteRedDot", "isShow", "", "showMeetingMinuteRedDotEditing", "sideMenuInsertCalendarEventIcon", "sideMenuInsertMeetingMinuteIcon", "updateChatStyle", "style", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.plugin.a$c */
    public static final class C33736c implements AbstractC33979c {

        /* renamed from: a */
        final /* synthetic */ CalendarPlugin f86922a;

        /* renamed from: b */
        final /* synthetic */ C35219b f86923b;

        @Override // com.ss.android.lark.chat.entity.p1663c.AbstractC33979c
        /* renamed from: a */
        public void mo123748a(int i) {
        }

        @Override // com.ss.android.lark.chat.entity.p1663c.AbstractC33979c
        /* renamed from: a */
        public void mo123750a(boolean z) {
        }

        @Override // com.ss.android.lark.chat.entity.p1663c.AbstractC33979c
        /* renamed from: b */
        public void mo123751b() {
        }

        @Override // com.ss.android.lark.chat.entity.p1663c.AbstractC33979c
        /* renamed from: b */
        public void mo123752b(boolean z) {
        }

        @Override // com.ss.android.lark.chat.entity.p1663c.AbstractC33979c
        /* renamed from: c */
        public void mo123753c() {
        }

        @Override // com.ss.android.lark.chat.entity.p1663c.AbstractC33979c
        /* renamed from: a */
        public void mo123747a() {
            ITitlebarComponent.C33731a.m130810a(CalendarPlugin.m130819b(this.f86922a), 1, false, null, 4, null);
        }

        @Override // com.ss.android.lark.chat.entity.p1663c.AbstractC33979c
        /* renamed from: a */
        public void mo123749a(View view) {
            Intrinsics.checkParameterIsNotNull(view, "view");
            CalendarPlugin.m130819b(this.f86922a).mo123665a(1, view);
            ITitlebarComponent.C33731a.m130810a(CalendarPlugin.m130819b(this.f86922a), 1, true, null, 4, null);
        }

        C33736c(CalendarPlugin aVar, C35219b bVar) {
            this.f86922a = aVar;
            this.f86923b = bVar;
        }
    }

    @Override // com.ss.android.lark.chat.chatwindow.biz.plugin.core.IChatPlugin, com.ss.android.lark.chat.chatwindow.biz.plugin.core.BaseChatPlugin
    public void as_() {
        super.as_();
        AbstractC33977a aVar = this.f86909a;
        if (aVar != null) {
            aVar.mo124333a();
        }
        this.f86909a = null;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/ss/android/lark/chat/chatwindow/chat/v2/plugin/CalendarPlugin$initMeetingChat$2", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/titlebar/ITitlebarComponent$MeetingRoleProvider;", "getMeetingRole", "", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.plugin.a$d */
    public static final class C33737d implements ITitlebarComponent.MeetingRoleProvider {

        /* renamed from: a */
        final /* synthetic */ CalendarPlugin f86924a;

        @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.titlebar.ITitlebarComponent.MeetingRoleProvider
        /* renamed from: a */
        public int mo123717a() {
            if (this.f86924a.f86909a == null) {
                return 0;
            }
            AbstractC33977a aVar = this.f86924a.f86909a;
            if (aVar == null) {
                Intrinsics.throwNpe();
            }
            return aVar.mo124334b();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C33737d(CalendarPlugin aVar) {
            this.f86924a = aVar;
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ IKeyboardComponent m130818a(CalendarPlugin aVar) {
        IKeyboardComponent cVar = aVar.f86911c;
        if (cVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("keyboardComponent");
        }
        return cVar;
    }

    /* renamed from: b */
    public static final /* synthetic */ ITitlebarComponent m130819b(CalendarPlugin aVar) {
        ITitlebarComponent bVar = aVar.f86910b;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("titlebarComponent");
        }
        return bVar;
    }

    /* renamed from: b */
    private final void m130820b(IChatWindowApp dVar, C35219b bVar) {
        if (ChatKeyboardFgUtil.f85002a.mo122016a()) {
            IKeyboardComponent cVar = this.f86911c;
            if (cVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("keyboardComponent");
            }
            cVar.mo121971a(new C33735b(this, dVar, bVar));
        }
    }

    @Override // com.ss.android.lark.chat.chatwindow.biz.plugin.core.IChatPlugin, com.ss.android.lark.chat.chatwindow.biz.plugin.core.BaseChatPlugin
    /* renamed from: a */
    public void mo122114a(IChatWindowApp dVar, C35219b bVar) {
        Intrinsics.checkParameterIsNotNull(dVar, "chatApp");
        Intrinsics.checkParameterIsNotNull(bVar, "initData");
        super.mo122114a(dVar, bVar);
        this.f86910b = (ITitlebarComponent) dVar.mo123122a(ITitlebarComponent.class);
        this.f86911c = (IKeyboardComponent) dVar.mo123122a(IKeyboardComponent.class);
        m130821c(dVar, bVar);
        m130820b(dVar, bVar);
    }

    /* renamed from: c */
    private final void m130821c(IChatWindowApp dVar, C35219b bVar) {
        if (bVar.f90956f.isMeeting()) {
            AbstractC36474h b = C29990c.m110930b();
            Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
            ICalendarDependency P = b.mo134517P();
            Context i = mo122128i();
            if (i != null) {
                this.f86909a = P.mo134335a((Activity) i, bVar.f90955e, bVar.f90956f.getName(), new C33736c(this, bVar));
                ITitlebarComponent bVar2 = this.f86910b;
                if (bVar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("titlebarComponent");
                }
                bVar2.mo123671a(new C33737d(this));
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.app.Activity");
        }
    }
}
