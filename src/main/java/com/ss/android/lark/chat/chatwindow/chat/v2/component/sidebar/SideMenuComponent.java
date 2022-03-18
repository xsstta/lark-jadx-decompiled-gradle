package com.ss.android.lark.chat.chatwindow.chat.v2.component.sidebar;

import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1178x;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.larksuite.suite.R;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.base.fragment.BaseFragment;
import com.ss.android.lark.chat.chatwindow.chat.v2.component.IComponentCallbacks;
import com.ss.android.lark.chat.chatwindow.chat.v2.component.sidebar.ISideMenuComponent;
import com.ss.android.lark.chat.chatwindow.chat.v2.component.titlebar.ITitlebarComponent;
import com.ss.android.lark.chat.chatwindow.chat.v2.p1638a.C33427a;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.ChatChatter;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.chat.entity.openapp.C34019a;
import com.ss.android.lark.chatwindow.p1720a.p1721a.C35219b;
import com.ss.android.lark.chatwindow.view.sidemenu.DesktopSideMenuItemBinder;
import com.ss.android.lark.chatwindow.view.sidemenu.item.ChatSettingItem;
import com.ss.android.lark.dependency.AbstractC36474h;
import com.ss.android.lark.dependency.IChatSettingDependency;
import com.ss.android.lark.desktopmode.C36512a;
import com.ss.android.lark.framework.larkwidget.Widget;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.utils.statistics.PerfLog;
import com.ss.android.lark.widget.chat_function_view.ChatFunctionView;
import com.ss.android.lark.widget.chat_function_view.IChatFunctionController;
import com.ss.android.lark.widget.chat_function_view.IChatFunctionItem;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\n\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0002J\b\u0010\u001e\u001a\u00020\u001fH\u0016J\b\u0010 \u001a\u00020\u001fH\u0016J\b\u0010!\u001a\u00020\u001fH\u0016J\u0010\u0010\"\u001a\u00020\u001f2\u0006\u0010\u001a\u001a\u00020\u001bH\u0002R!\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078VX\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u000e¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/sidebar/SideMenuComponent;", "Lcom/ss/android/lark/framework/larkwidget/Widget;", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/sidebar/ISideMenuComponent;", "dependenceViewModel", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/sidebar/ISideMenuDependenceViewModel;", "(Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/sidebar/ISideMenuDependenceViewModel;)V", "callbacks", "", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/IComponentCallbacks;", "getCallbacks", "()Ljava/util/List;", "callbacks$delegate", "Lkotlin/Lazy;", "mChatFunctionController", "Lcom/ss/android/lark/widget/chat_function_view/IChatFunctionController;", "mChatFunctionView", "Lcom/ss/android/lark/widget/chat_function_view/ChatFunctionView;", "mDesktopSideMenuItemBinder", "Lcom/ss/android/lark/chatwindow/view/sidemenu/DesktopSideMenuItemBinder;", "mMeetingRoleProvider", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/titlebar/ITitlebarComponent$MeetingRoleProvider;", "mOpenAppFeed", "Lcom/ss/android/lark/chat/entity/openapp/OpenAppFeed;", "getChatFunctionItems", "", "Lcom/ss/android/lark/widget/chat_function_view/IChatFunctionItem;", "initData", "Lcom/ss/android/lark/chatwindow/model/data/ChatWindowInitData;", "getContext", "Landroid/content/Context;", "onCreate", "", "onDestroy", "onFragmentBringToFront", "setupSideMenu", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
public final class SideMenuComponent extends Widget implements ISideMenuComponent {

    /* renamed from: a */
    public ITitlebarComponent.MeetingRoleProvider f86676a;

    /* renamed from: b */
    private final Lazy f86677b = LazyKt.lazy(C33648a.INSTANCE);

    /* renamed from: c */
    private ChatFunctionView f86678c;

    /* renamed from: d */
    private IChatFunctionController f86679d;

    /* renamed from: e */
    private DesktopSideMenuItemBinder f86680e;

    /* renamed from: g */
    private C34019a f86681g;

    /* renamed from: h */
    private final ISideMenuDependenceViewModel f86682h;

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.IComponent
    /* renamed from: a */
    public List<IComponentCallbacks> mo121968a() {
        return (List) this.f86677b.getValue();
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.IComponent
    /* renamed from: h */
    public boolean mo121990h() {
        return ISideMenuComponent.C33651a.m130420a(this);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Ljava/util/ArrayList;", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/IComponentCallbacks;", "Lkotlin/collections/ArrayList;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.sidebar.SideMenuComponent$a */
    static final class C33648a extends Lambda implements Function0<ArrayList<IComponentCallbacks>> {
        public static final C33648a INSTANCE = new C33648a();

        C33648a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ArrayList<IComponentCallbacks> invoke() {
            return new ArrayList<>();
        }
    }

    /* renamed from: b */
    public void mo123536b() {
        C36512a.m144041a().mo134757a(this.f86678c);
    }

    @Override // com.ss.android.lark.framework.larkwidget.Widget
    /* renamed from: r */
    public void mo122001r() {
        super.mo122001r();
        IChatFunctionController cVar = this.f86679d;
        if (cVar != null) {
            cVar.mo127563c();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00005\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J \u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH\u0016J\"\u0010\u000b\u001a\u00020\u00052\b\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0003H\u0016¨\u0006\u0011"}, d2 = {"com/ss/android/lark/chat/chatwindow/chat/v2/component/sidebar/SideMenuComponent$getChatFunctionItems$1", "Lcom/ss/android/lark/chatwindow/view/sidemenu/item/ChatSettingItem$ChatSettingItemDependency;", "getEventSettingRole", "", "gotoGroupSettingActivity", "", "chatId", "", "meetingRole", "isOnCall", "", "startP2PSetting", "chatter", "Lcom/ss/android/lark/chat/entity/chatter/Chatter;", "curChat", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "hideSettingItemMask", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.sidebar.SideMenuComponent$b */
    public static final class C33649b implements ChatSettingItem.ChatSettingItemDependency {

        /* renamed from: a */
        final /* synthetic */ SideMenuComponent f86683a;

        /* renamed from: b */
        final /* synthetic */ C35219b f86684b;

        @Override // com.ss.android.lark.chatwindow.view.sidemenu.item.ChatSettingItem.ChatSettingItemDependency
        /* renamed from: a */
        public int mo123537a() {
            if (!this.f86684b.f90956f.isMeeting() || this.f86683a.f86676a == null) {
                return 0;
            }
            ITitlebarComponent.MeetingRoleProvider cVar = this.f86683a.f86676a;
            if (cVar == null) {
                Intrinsics.throwNpe();
            }
            return cVar.mo123717a();
        }

        C33649b(SideMenuComponent sideMenuComponent, C35219b bVar) {
            this.f86683a = sideMenuComponent;
            this.f86684b = bVar;
        }

        @Override // com.ss.android.lark.chatwindow.view.sidemenu.item.ChatSettingItem.ChatSettingItemDependency
        /* renamed from: a */
        public void mo123538a(Chatter chatter, Chat chat, int i) {
            Intrinsics.checkParameterIsNotNull(chat, "curChat");
            AbstractC36474h b = C29990c.m110930b();
            Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
            IChatSettingDependency w = b.mo134595w();
            Context c = this.f86683a.mo121985c();
            if (c != null) {
                Activity activity = (Activity) c;
                Object o = this.f86683a.mo141195o();
                if (o != null) {
                    w.mo134353a(activity, (BaseFragment) o, chatter, this.f86684b.f90956f, i, 8, -1);
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.base.fragment.BaseFragment");
            }
            throw new TypeCastException("null cannot be cast to non-null type android.app.Activity");
        }

        @Override // com.ss.android.lark.chatwindow.view.sidemenu.item.ChatSettingItem.ChatSettingItemDependency
        /* renamed from: a */
        public void mo123539a(String str, int i, boolean z) {
            int i2;
            Intrinsics.checkParameterIsNotNull(str, "chatId");
            if (!this.f86684b.f90956f.isMeeting() || this.f86683a.f86676a == null) {
                i2 = 0;
            } else {
                ITitlebarComponent.MeetingRoleProvider cVar = this.f86683a.f86676a;
                if (cVar == null) {
                    Intrinsics.throwNpe();
                }
                i2 = cVar.mo123717a();
            }
            AbstractC36474h b = C29990c.m110930b();
            Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
            IChatSettingDependency w = b.mo134595w();
            Context c = this.f86683a.mo121985c();
            Object o = this.f86683a.mo141195o();
            if (o != null) {
                w.mo134356a(c, (BaseFragment) o, str, i2, z, 7, -1);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.base.fragment.BaseFragment");
        }
    }

    /* renamed from: c */
    public final Context mo121985c() {
        Object o = mo141195o();
        if (o != null) {
            return ((Fragment) o).getContext();
        }
        throw new TypeCastException("null cannot be cast to non-null type androidx.fragment.app.Fragment");
    }

    @Override // com.ss.android.lark.framework.larkwidget.Widget
    /* renamed from: e */
    public void mo121987e() {
        super.mo121987e();
        PerfLog.start("sidemenu_init", "");
        C33427a.m129533a(this.f86682h.getInitData(), this, new C33650c(this));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/chatwindow/model/data/ChatWindowInitData;", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.sidebar.SideMenuComponent$c */
    static final class C33650c<T> implements AbstractC1178x<C35219b> {

        /* renamed from: a */
        final /* synthetic */ SideMenuComponent f86685a;

        C33650c(SideMenuComponent sideMenuComponent) {
            this.f86685a = sideMenuComponent;
        }

        /* renamed from: a */
        public final void onChanged(C35219b bVar) {
            PerfLog.start("sidemenu_init_with_data", "");
            SideMenuComponent sideMenuComponent = this.f86685a;
            Intrinsics.checkExpressionValueIsNotNull(bVar, "it");
            sideMenuComponent.mo123535a(bVar);
        }
    }

    public SideMenuComponent(ISideMenuDependenceViewModel bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "dependenceViewModel");
        this.f86682h = bVar;
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.IComponent
    /* renamed from: a */
    public void mo121971a(IComponentCallbacks gVar) {
        Intrinsics.checkParameterIsNotNull(gVar, "callback");
        ISideMenuComponent.C33651a.m130419a(this, gVar);
    }

    /* renamed from: b */
    private final List<IChatFunctionItem> m130406b(C35219b bVar) {
        AbstractC36474h b = C29990c.m110930b();
        Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
        List<IChatFunctionItem> a = b.mo134595w().mo134351a(bVar.f90958h, bVar.f90957g, bVar.f90956f, true);
        Chat chat = bVar.f90956f;
        Intrinsics.checkExpressionValueIsNotNull(chat, "initData.chat");
        a.add(new ChatSettingItem(chat, bVar.f90957g, this.f86681g, new C33649b(this, bVar)));
        Intrinsics.checkExpressionValueIsNotNull(a, "items");
        return a;
    }

    /* renamed from: a */
    public final void mo123535a(C35219b bVar) {
        Context c = mo121985c();
        if (c == null) {
            Intrinsics.throwNpe();
        }
        ChatFunctionView chatFunctionView = new ChatFunctionView(c);
        ViewGroup.LayoutParams layoutParams = chatFunctionView.getRecyclerView().getLayoutParams();
        layoutParams.width = -1;
        layoutParams.height = -1;
        chatFunctionView.getRecyclerView().setLayoutParams(layoutParams);
        chatFunctionView.setBackgroundColor(UIHelper.getColor(R.color.lkui_N200));
        chatFunctionView.setPaddingRelative(0, 0, 0, 0);
        Context c2 = mo121985c();
        if (c2 == null) {
            Intrinsics.throwNpe();
        }
        this.f86680e = new DesktopSideMenuItemBinder(c2);
        AbstractC36474h b = C29990c.m110930b();
        Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
        IChatSettingDependency w = b.mo134595w();
        Context c3 = mo121985c();
        if (c3 == null) {
            Intrinsics.throwNpe();
        }
        if (c3 != null) {
            Activity activity = (Activity) c3;
            Chat chat = bVar.f90956f;
            ChatChatter chatChatter = bVar.f90957g;
            DesktopSideMenuItemBinder bVar2 = this.f86680e;
            Context c4 = mo121985c();
            if (c4 == null) {
                Intrinsics.throwNpe();
            }
            IChatFunctionController a = w.mo134348a(activity, chat, chatChatter, chatFunctionView, bVar2, new LinearLayoutManager(c4), m130406b(bVar));
            this.f86679d = a;
            DesktopSideMenuItemBinder bVar3 = this.f86680e;
            if (bVar3 != null) {
                bVar3.mo129898a(a);
            }
            chatFunctionView.setSideMenuViewDelegate(this.f86680e);
            C36512a.m144041a().mo134757a(chatFunctionView);
            this.f86678c = chatFunctionView;
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.app.Activity");
    }
}
