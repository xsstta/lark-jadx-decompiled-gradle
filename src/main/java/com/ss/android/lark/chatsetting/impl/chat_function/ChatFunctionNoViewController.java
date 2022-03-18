package com.ss.android.lark.chatsetting.impl.chat_function;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.chat.entity.p1663c.AbstractC33978b;
import com.ss.android.lark.chat.entity.p1663c.AbstractC33980d;
import com.ss.android.lark.chatsetting.ChatSettingModule;
import com.ss.android.lark.chatsetting.impl.chat_function.ChatFunctionModel;
import com.ss.android.lark.chatsetting.impl.chat_function.item.CalendarEventItem;
import com.ss.android.lark.chatsetting.impl.chat_function.item.ChatSearchItem;
import com.ss.android.lark.chatsetting.impl.chat_function.item.GroupAnnouncementItem;
import com.ss.android.lark.chatsetting.impl.chat_function.item.MeetingMinuteItem;
import com.ss.android.lark.chatsetting.impl.chat_function.item.PinItem;
import com.ss.android.lark.chatsetting.p1693a.AbstractC34461c;
import com.ss.android.lark.widget.chat_function_view.ChatFunctionBadge;
import com.ss.android.lark.widget.chat_function_view.IChatFunctionController;
import com.ss.android.lark.widget.chat_function_view.IChatFunctionItem;
import com.ss.android.lark.widget.chat_function_view.OnItemUpdateListener;
import java.util.List;
import java.util.ListIterator;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000m\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t*\u0001 \u0018\u00002\u00020\u0001B/\b\u0010\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0002\u0010\u000bJ\u0018\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\nH\u0016J\u0018\u0010\u001d\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001bH\u0016J\r\u0010\u001f\u001a\u00020 H\u0002¢\u0006\u0002\u0010!J\b\u0010\"\u001a\u00020#H\u0002J\b\u0010$\u001a\u00020\u0019H\u0016J\u0012\u0010%\u001a\u0004\u0018\u00010\n2\u0006\u0010\u001e\u001a\u00020\u001bH\u0016J\n\u0010&\u001a\u0004\u0018\u00010\nH\u0016J\b\u0010'\u001a\u00020\u001bH\u0016J\u0012\u0010(\u001a\u0004\u0018\u00010)2\u0006\u0010\u001e\u001a\u00020\u001bH\u0016J\u0010\u0010*\u001a\u00020+2\u0006\u0010\u001e\u001a\u00020\u001bH\u0016J\b\u0010,\u001a\u00020\u0019H\u0002J\b\u0010-\u001a\u00020\u0019H\u0002J\u0010\u0010.\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\u001bH\u0016J\b\u0010/\u001a\u00020\u0019H\u0016J\u0010\u00100\u001a\u00020\u00192\u0006\u00101\u001a\u00020\u0015H\u0016J\u0010\u00102\u001a\u00020\u00192\u0006\u00103\u001a\u00020\nH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\f\u001a\u00020\r8BX\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0012\u001a\u00020\u0013X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u000e¢\u0006\u0002\n\u0000¨\u00064"}, d2 = {"Lcom/ss/android/lark/chatsetting/impl/chat_function/ChatFunctionNoViewController;", "Lcom/ss/android/lark/widget/chat_function_view/IChatFunctionController;", "context", "Landroid/content/Context;", "chat", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "currChatter", "Lcom/ss/android/lark/chat/entity/chatter/Chatter;", "itemList", "", "Lcom/ss/android/lark/widget/chat_function_view/IChatFunctionItem;", "(Landroid/content/Context;Lcom/ss/android/lark/chat/entity/chat/Chat;Lcom/ss/android/lark/chat/entity/chatter/Chatter;Ljava/util/List;)V", "mChatSettingSetting4Calendar", "Lcom/ss/android/lark/chat/entity/meeting/IMeetingChatSettingDependency;", "getMChatSettingSetting4Calendar", "()Lcom/ss/android/lark/chat/entity/meeting/IMeetingChatSettingDependency;", "mChatSettingSetting4Calendar$delegate", "Lkotlin/Lazy;", "model", "Lcom/ss/android/lark/chatsetting/impl/chat_function/ChatFunctionModel;", "onItemUpdateListener", "Lcom/ss/android/lark/widget/chat_function_view/OnItemUpdateListener;", "settingMeetingDependency", "Lcom/ss/android/lark/chat/entity/meeting/IChatSettingMeetingDependency;", "addMenu", "", "index", "", "menuItem", "addMenuById", "menuId", "createChatSetting4Calendar", "com/ss/android/lark/chatsetting/impl/chat_function/ChatFunctionNoViewController$createChatSetting4Calendar$1", "()Lcom/ss/android/lark/chatsetting/impl/chat_function/ChatFunctionNoViewController$createChatSetting4Calendar$1;", "createModelDelegate", "Lcom/ss/android/lark/chatsetting/impl/chat_function/ChatFunctionModel$Delegate;", "destroy", "findMenuById", "getHightestPriorityBadgeMenu", "getMenuCount", "getViewById", "Landroid/view/View;", "hasMenu", "", "initMeetingDependency", "initModel", "removeMenuById", "restart", "setOnMenuItemUpdateListener", "listener", "updateMenu", "item", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chatsetting.impl.a.e */
public final class ChatFunctionNoViewController implements IChatFunctionController {

    /* renamed from: a */
    public final Chat f89103a;

    /* renamed from: b */
    public AbstractC33978b f89104b;

    /* renamed from: c */
    private final Context f89105c;

    /* renamed from: d */
    private final List<IChatFunctionItem> f89106d;

    /* renamed from: e */
    private final ChatFunctionModel f89107e;

    /* renamed from: f */
    private final Chatter f89108f;

    /* renamed from: g */
    private OnItemUpdateListener f89109g;

    /* renamed from: h */
    private final Lazy f89110h = LazyKt.lazy(new C34525c(this));

    /* renamed from: e */
    private final AbstractC33980d m134070e() {
        return (AbstractC33980d) this.f89110h.getValue();
    }

    @Override // com.ss.android.lark.widget.chat_function_view.IChatFunctionController
    /* renamed from: a */
    public View mo127556a(int i) {
        return null;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\t\n\u0000\n\u0002\b\u0003*\u0001\u0001\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "com/ss/android/lark/chatsetting/impl/chat_function/ChatFunctionNoViewController$createChatSetting4Calendar$1", "invoke", "()Lcom/ss/android/lark/chatsetting/impl/chat_function/ChatFunctionNoViewController$createChatSetting4Calendar$1;"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.a.e$c */
    static final class C34525c extends Lambda implements Function0<C34523a> {
        final /* synthetic */ ChatFunctionNoViewController this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34525c(ChatFunctionNoViewController eVar) {
            super(0);
            this.this$0 = eVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final C34523a invoke() {
            return this.this$0.mo127597d();
        }
    }

    /* renamed from: h */
    private final ChatFunctionModel.Delegate m134073h() {
        return new C34524b(this);
    }

    @Override // com.ss.android.lark.widget.chat_function_view.IChatFunctionController
    /* renamed from: b */
    public void mo127562b() {
        this.f89107e.mo127588b();
    }

    /* renamed from: d */
    public final C34523a mo127597d() {
        return new C34523a(this);
    }

    @Override // com.ss.android.lark.widget.chat_function_view.IChatFunctionController
    /* renamed from: c */
    public void mo127563c() {
        this.f89107e.destroy();
        AbstractC33978b bVar = this.f89104b;
        if (bVar != null) {
            bVar.mo124337c();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0007\u001a\u00020\u0003H\u0016J\b\u0010\b\u001a\u00020\u0003H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/chatsetting/impl/chat_function/ChatFunctionNoViewController$createChatSetting4Calendar$1", "Lcom/ss/android/lark/chat/entity/meeting/IMeetingChatSettingDependency;", "showMeetingMinuteRedDot", "", "isShow", "", "showMeetingMinuteRedDotEditing", "sideMenuInsertCalendarEventIcon", "sideMenuInsertMeetingMinuteIcon", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.a.e$a */
    public static final class C34523a implements AbstractC33980d {

        /* renamed from: a */
        final /* synthetic */ ChatFunctionNoViewController f89111a;

        @Override // com.ss.android.lark.chat.entity.p1663c.AbstractC33980d
        /* renamed from: a */
        public void mo124338a() {
            AbstractC33978b bVar;
            if (this.f89111a.mo127596b(5) == null && (bVar = this.f89111a.f89104b) != null) {
                this.f89111a.mo127594a(0, new CalendarEventItem(bVar));
            }
        }

        @Override // com.ss.android.lark.chat.entity.p1663c.AbstractC33980d
        /* renamed from: b */
        public void mo124340b() {
            AbstractC33978b bVar;
            if (this.f89111a.mo127596b(6) == null && (bVar = this.f89111a.f89104b) != null) {
                this.f89111a.mo127594a(1, new MeetingMinuteItem(bVar));
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C34523a(ChatFunctionNoViewController eVar) {
            this.f89111a = eVar;
        }

        @Override // com.ss.android.lark.chat.entity.p1663c.AbstractC33980d
        /* renamed from: a */
        public void mo124339a(boolean z) {
            IChatFunctionItem b = this.f89111a.mo127596b(6);
            if (b != null) {
                ChatFunctionBadge aVar = new ChatFunctionBadge();
                aVar.mo197613a(z);
                aVar.mo197614b(5);
                b.mo127573a(aVar);
                this.f89111a.mo127595a(b);
            }
        }

        @Override // com.ss.android.lark.chat.entity.p1663c.AbstractC33980d
        /* renamed from: b */
        public void mo124341b(boolean z) {
            IChatFunctionItem b = this.f89111a.mo127596b(6);
            if (b != null) {
                ChatFunctionBadge aVar = new ChatFunctionBadge();
                aVar.mo197613a(z);
                aVar.mo197612a(R.drawable.title_right_reddot_edit);
                aVar.mo197614b(0);
                b.mo127573a(aVar);
                this.f89111a.mo127595a(b);
            }
        }
    }

    /* renamed from: f */
    private final void m134071f() {
        this.f89107e.create();
        this.f89107e.mo127589c();
        this.f89107e.mo127586a();
        this.f89107e.mo127588b();
    }

    /* renamed from: g */
    private final void m134072g() {
        if (this.f89103a.isMeeting() && (this.f89105c instanceof Activity)) {
            AbstractC34461c a = ChatSettingModule.m133639a();
            Intrinsics.checkExpressionValueIsNotNull(a, "ChatSettingModule.getDependency()");
            this.f89104b = a.mo127282l().mo127305a((Activity) this.f89105c, this.f89103a.getId(), this.f89103a.getName(), m134070e());
        }
    }

    @Override // com.ss.android.lark.widget.chat_function_view.IChatFunctionController
    /* renamed from: a */
    public IChatFunctionItem mo127557a() {
        int i;
        ChatFunctionBadge b;
        IChatFunctionItem dVar = null;
        for (IChatFunctionItem dVar2 : this.f89106d) {
            ChatFunctionBadge b2 = dVar2.mo127574b();
            if (b2 != null && (b2.mo197615b() || b2.mo197616c() > 0)) {
                if (dVar != null) {
                    if (dVar == null || (b = dVar.mo127574b()) == null) {
                        i = 0;
                    } else {
                        i = b.mo197617d();
                    }
                    if (b2.mo197617d() <= i) {
                    }
                }
                dVar = dVar2;
            }
        }
        return dVar;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0005H\u0016J\u0012\u0010\b\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016¨\u0006\u000b"}, d2 = {"com/ss/android/lark/chatsetting/impl/chat_function/ChatFunctionNoViewController$createModelDelegate$1", "Lcom/ss/android/lark/chatsetting/impl/chat_function/ChatFunctionModel$Delegate;", "onPinReadStateChanged", "", "hasUnreadPin", "", "onTodoListReadStateChanged", "isTodoUnClick", "onUpdateOpenAppFeed", "openAppFeed", "Lcom/ss/android/lark/chat/entity/openapp/OpenAppFeed;", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.a.e$b */
    public static final class C34524b implements ChatFunctionModel.Delegate {

        /* renamed from: a */
        final /* synthetic */ ChatFunctionNoViewController f89112a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C34524b(ChatFunctionNoViewController eVar) {
            this.f89112a = eVar;
        }

        @Override // com.ss.android.lark.chatsetting.impl.chat_function.ChatFunctionModel.Delegate
        /* renamed from: a */
        public void mo127569a(boolean z) {
            IChatFunctionItem b = this.f89112a.mo127596b(3);
            if (b != null) {
                ChatFunctionBadge aVar = new ChatFunctionBadge();
                aVar.mo197613a(z);
                b.mo127573a(aVar);
                this.f89112a.mo127595a(b);
            }
        }

        @Override // com.ss.android.lark.chatsetting.impl.chat_function.ChatFunctionModel.Delegate
        /* renamed from: b */
        public void mo127570b(boolean z) {
            IChatFunctionItem b = this.f89112a.mo127596b(16);
            if (b != null) {
                ChatFunctionBadge aVar = new ChatFunctionBadge();
                aVar.mo197613a(z);
                b.mo127573a(aVar);
                this.f89112a.mo127595a(b);
            }
        }
    }

    @Override // com.ss.android.lark.widget.chat_function_view.IChatFunctionController
    /* renamed from: a */
    public void mo127561a(OnItemUpdateListener fVar) {
        Intrinsics.checkParameterIsNotNull(fVar, "listener");
        this.f89109g = fVar;
    }

    /* renamed from: a */
    public final void mo127595a(IChatFunctionItem dVar) {
        IChatFunctionItem b = mo127596b(dVar.mo127572a());
        if (b != null) {
            this.f89106d.set(this.f89106d.indexOf(b), dVar);
            OnItemUpdateListener fVar = this.f89109g;
            if (fVar != null) {
                fVar.onItemUpdated(dVar);
            }
        }
    }

    /* renamed from: b */
    public IChatFunctionItem mo127596b(int i) {
        IChatFunctionItem dVar;
        boolean z;
        List<IChatFunctionItem> list = this.f89106d;
        ListIterator<IChatFunctionItem> listIterator = list.listIterator(list.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                dVar = null;
                break;
            }
            dVar = listIterator.previous();
            if (dVar.mo127572a() == i) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                break;
            }
        }
        return dVar;
    }

    /* renamed from: a */
    public void mo127594a(int i, IChatFunctionItem dVar) {
        Intrinsics.checkParameterIsNotNull(dVar, "menuItem");
        this.f89106d.add(i, dVar);
    }

    @Override // com.ss.android.lark.widget.chat_function_view.IChatFunctionController
    /* renamed from: a */
    public void mo127558a(int i, int i2) {
        if (i2 == 1) {
            mo127594a(i, new GroupAnnouncementItem(this.f89103a));
        } else if (i2 == 2) {
            mo127594a(i, new ChatSearchItem(this.f89103a));
        } else if (i2 == 3) {
            mo127594a(i, new PinItem(this.f89103a));
        }
    }

    public ChatFunctionNoViewController(Context context, Chat chat, Chatter chatter, List<IChatFunctionItem> list) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(chat, "chat");
        Intrinsics.checkParameterIsNotNull(list, "itemList");
        this.f89105c = context;
        this.f89103a = chat;
        this.f89108f = chatter;
        this.f89106d = list;
        this.f89107e = new ChatFunctionModel(m134073h(), chat, chatter);
        m134071f();
        m134072g();
    }
}
