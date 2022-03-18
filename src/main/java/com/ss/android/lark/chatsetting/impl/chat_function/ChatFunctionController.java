package com.ss.android.lark.chatsetting.impl.chat_function;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.chat.entity.p1663c.AbstractC33978b;
import com.ss.android.lark.chat.entity.p1663c.AbstractC33980d;
import com.ss.android.lark.chat.entity.p1664d.AbstractC33987b;
import com.ss.android.lark.chatsetting.ChatSettingModule;
import com.ss.android.lark.chatsetting.impl.chat_function.ChatFunctionAdapter;
import com.ss.android.lark.chatsetting.impl.chat_function.ChatFunctionModel;
import com.ss.android.lark.chatsetting.impl.chat_function.item.CalendarEventItem;
import com.ss.android.lark.chatsetting.impl.chat_function.item.ChatSearchItem;
import com.ss.android.lark.chatsetting.impl.chat_function.item.GroupAnnouncementItem;
import com.ss.android.lark.chatsetting.impl.chat_function.item.MeetingMinuteItem;
import com.ss.android.lark.chatsetting.impl.chat_function.item.PinItem;
import com.ss.android.lark.chatsetting.impl.chat_function.item.TodoListItem;
import com.ss.android.lark.chatsetting.impl.statistics.announce_opendoc.AnnounceOpenDocHitPoint;
import com.ss.android.lark.chatsetting.impl.statistics.chat_function.ChatFunctionHitPoint;
import com.ss.android.lark.chatsetting.p1693a.AbstractC34461c;
import com.ss.android.lark.widget.chat_function_view.ChatFunctionBadge;
import com.ss.android.lark.widget.chat_function_view.ChatFunctionView;
import com.ss.android.lark.widget.chat_function_view.IChatFunctionBinder;
import com.ss.android.lark.widget.chat_function_view.IChatFunctionController;
import com.ss.android.lark.widget.chat_function_view.IChatFunctionItem;
import com.ss.android.lark.widget.chat_function_view.OnItemUpdateListener;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000§\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002*\u00016\u0018\u0000 N*\b\b\u0000\u0010\u0001*\u00020\u0002*\u000e\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00010\u00042\u00020\u0005:\u0001NBG\b\u0012\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00028\u0001\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012¢\u0006\u0002\u0010\u0014J\u0018\u0010.\u001a\u00020/2\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u00020\u0013H\u0016J\u0018\u00103\u001a\u00020/2\u0006\u00100\u001a\u0002012\u0006\u00104\u001a\u000201H\u0016J\u0019\u00105\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u000106H\u0002¢\u0006\u0002\u00107J\b\u00108\u001a\u000209H\u0002J\b\u0010:\u001a\u00020&H\u0002J\b\u0010;\u001a\u00020/H\u0016J\u0012\u0010<\u001a\u0004\u0018\u00010\u00132\u0006\u00104\u001a\u000201H\u0016J\n\u0010=\u001a\u0004\u0018\u00010\u0013H\u0016J\b\u0010>\u001a\u000201H\u0016J\u0012\u0010?\u001a\u0004\u0018\u00010@2\u0006\u00104\u001a\u000201H\u0016J\u0010\u0010A\u001a\u00020B2\u0006\u00104\u001a\u000201H\u0016J\b\u0010C\u001a\u00020/H\u0002J\b\u0010D\u001a\u00020/H\u0002J\b\u0010E\u001a\u00020/H\u0002J\u0010\u0010F\u001a\u00020/2\u0006\u0010G\u001a\u00020\u0013H\u0002J\u0010\u0010H\u001a\u00020/2\u0006\u0010G\u001a\u00020\u0013H\u0002J\u0010\u0010I\u001a\u00020/2\u0006\u00104\u001a\u000201H\u0016J\b\u0010J\u001a\u00020/H\u0016J\u0010\u0010K\u001a\u00020/2\u0006\u0010L\u001a\u00020MH\u0016R\u001a\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0016X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u00028\u0001X\u0004¢\u0006\u0004\n\u0002\u0010\u0017R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0018\u001a\u00020\u00198BX\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u001e\u001a\u00020\u001f8BX\u0002¢\u0006\f\n\u0004\b\"\u0010\u001d\u001a\u0004\b \u0010!R\u0010\u0010#\u001a\u0004\u0018\u00010$X\u000e¢\u0006\u0002\n\u0000R\u001b\u0010%\u001a\u00020&8BX\u0002¢\u0006\f\n\u0004\b)\u0010\u001d\u001a\u0004\b'\u0010(R\u000e\u0010*\u001a\u00020+X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010,\u001a\u0004\u0018\u00010-X\u000e¢\u0006\u0002\n\u0000¨\u0006O"}, d2 = {"Lcom/ss/android/lark/chatsetting/impl/chat_function/ChatFunctionController;", "VH", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "B", "Lcom/ss/android/lark/widget/chat_function_view/IChatFunctionBinder;", "Lcom/ss/android/lark/widget/chat_function_view/IChatFunctionController;", "context", "Landroid/content/Context;", "chat", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "currChatter", "Lcom/ss/android/lark/chat/entity/chatter/Chatter;", "chatFunctionView", "Lcom/ss/android/lark/widget/chat_function_view/ChatFunctionView;", "binder", "layoutManager", "Landroidx/recyclerview/widget/RecyclerView$LayoutManager;", "itemList", "", "Lcom/ss/android/lark/widget/chat_function_view/IChatFunctionItem;", "(Landroid/content/Context;Lcom/ss/android/lark/chat/entity/chat/Chat;Lcom/ss/android/lark/chat/entity/chatter/Chatter;Lcom/ss/android/lark/widget/chat_function_view/ChatFunctionView;Lcom/ss/android/lark/widget/chat_function_view/IChatFunctionBinder;Landroidx/recyclerview/widget/RecyclerView$LayoutManager;Ljava/util/List;)V", "adapter", "Lcom/ss/android/lark/chatsetting/impl/chat_function/ChatFunctionAdapter;", "Lcom/ss/android/lark/widget/chat_function_view/IChatFunctionBinder;", "docModuleDependency", "Lcom/ss/android/lark/chatsetting/dependency/IChatSettingModuleDependency$IDocDependency;", "getDocModuleDependency", "()Lcom/ss/android/lark/chatsetting/dependency/IChatSettingModuleDependency$IDocDependency;", "docModuleDependency$delegate", "Lkotlin/Lazy;", "mChatSettingSetting4Calendar", "Lcom/ss/android/lark/chat/entity/meeting/IMeetingChatSettingDependency;", "getMChatSettingSetting4Calendar", "()Lcom/ss/android/lark/chat/entity/meeting/IMeetingChatSettingDependency;", "mChatSettingSetting4Calendar$delegate", "mListener", "Lcom/ss/android/lark/chat/entity/page/IAnnoucementCloseListener;", "mOnItemClickListener", "Lcom/ss/android/lark/chatsetting/impl/chat_function/ChatFunctionAdapter$OnItemClickListener;", "getMOnItemClickListener", "()Lcom/ss/android/lark/chatsetting/impl/chat_function/ChatFunctionAdapter$OnItemClickListener;", "mOnItemClickListener$delegate", "model", "Lcom/ss/android/lark/chatsetting/impl/chat_function/ChatFunctionModel;", "settingMeetingDependency", "Lcom/ss/android/lark/chat/entity/meeting/IChatSettingMeetingDependency;", "addMenu", "", "index", "", "menuItem", "addMenuById", "menuId", "createChatSetting4Calendar", "com/ss/android/lark/chatsetting/impl/chat_function/ChatFunctionController$createChatSetting4Calendar$1", "()Lcom/ss/android/lark/chatsetting/impl/chat_function/ChatFunctionController$createChatSetting4Calendar$1;", "createModelDelegate", "Lcom/ss/android/lark/chatsetting/impl/chat_function/ChatFunctionModel$Delegate;", "createOnItemClickListener", "destroy", "findMenuById", "getHightestPriorityBadgeMenu", "getMenuCount", "getViewById", "Landroid/view/View;", "hasMenu", "", "initMeetingDependency", "initModel", "initView", "onClickItem", "item", "onClickItemHitPoint", "removeMenuById", "restart", "setOnMenuItemUpdateListener", "listener", "Lcom/ss/android/lark/widget/chat_function_view/OnItemUpdateListener;", "Companion", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chatsetting.impl.a.b */
public final class ChatFunctionController<VH extends RecyclerView.ViewHolder, B extends IChatFunctionBinder<VH>> implements IChatFunctionController {

    /* renamed from: f */
    public static final Companion f89013f = new Companion(null);

    /* renamed from: a */
    public final ChatFunctionView f89014a;

    /* renamed from: b */
    public List<IChatFunctionItem> f89015b;

    /* renamed from: c */
    public final ChatFunctionAdapter<VH, B> f89016c;

    /* renamed from: d */
    public final Chat f89017d;

    /* renamed from: e */
    public AbstractC33978b f89018e;

    /* renamed from: g */
    private final Context f89019g;

    /* renamed from: h */
    private final B f89020h;

    /* renamed from: i */
    private final RecyclerView.LayoutManager f89021i;

    /* renamed from: j */
    private final ChatFunctionModel f89022j;

    /* renamed from: k */
    private final Chatter f89023k;

    /* renamed from: l */
    private final Lazy f89024l;

    /* renamed from: m */
    private final Lazy f89025m;

    /* renamed from: n */
    private final Lazy f89026n;

    /* renamed from: o */
    private AbstractC33987b f89027o;

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\u000e\b\u0001\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "VH", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "B", "Lcom/ss/android/lark/widget/chat_function_view/IChatFunctionBinder;", "onAnnounceClose"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.a.b$f */
    public static final class C34508f implements AbstractC33987b {

        /* renamed from: a */
        final /* synthetic */ ChatFunctionController f89033a;

        C34508f(ChatFunctionController bVar) {
            this.f89033a = bVar;
        }
    }

    /* renamed from: f */
    private final AbstractC34461c.AbstractC34468g m133958f() {
        return (AbstractC34461c.AbstractC34468g) this.f89024l.getValue();
    }

    /* renamed from: g */
    private final AbstractC33980d m133959g() {
        return (AbstractC33980d) this.f89025m.getValue();
    }

    /* renamed from: h */
    private final ChatFunctionAdapter.OnItemClickListener m133960h() {
        return (ChatFunctionAdapter.OnItemClickListener) this.f89026n.getValue();
    }

    @Override // com.ss.android.lark.widget.chat_function_view.IChatFunctionController
    /* renamed from: b */
    public void mo127562b() {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002Je\u0010\u0005\u001a\u00020\u0006\"\b\b\u0002\u0010\u0007*\u00020\b\"\u000e\b\u0003\u0010\t*\b\u0012\u0004\u0012\u0002H\u00070\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u0002H\t2\u0006\u0010\u0014\u001a\u00020\u00152\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017¢\u0006\u0002\u0010\u0019J.\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/ss/android/lark/chatsetting/impl/chat_function/ChatFunctionController$Companion;", "", "()V", "TAG", "", "newInstance", "Lcom/ss/android/lark/widget/chat_function_view/IChatFunctionController;", "VH", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "B", "Lcom/ss/android/lark/widget/chat_function_view/IChatFunctionBinder;", "context", "Landroid/content/Context;", "chat", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "currChatter", "Lcom/ss/android/lark/chat/entity/chatter/Chatter;", "chatFunctionView", "Lcom/ss/android/lark/widget/chat_function_view/ChatFunctionView;", "binder", "layoutManager", "Landroidx/recyclerview/widget/RecyclerView$LayoutManager;", "itemList", "", "Lcom/ss/android/lark/widget/chat_function_view/IChatFunctionItem;", "(Landroid/content/Context;Lcom/ss/android/lark/chat/entity/chat/Chat;Lcom/ss/android/lark/chat/entity/chatter/Chatter;Lcom/ss/android/lark/widget/chat_function_view/ChatFunctionView;Lcom/ss/android/lark/widget/chat_function_view/IChatFunctionBinder;Landroidx/recyclerview/widget/RecyclerView$LayoutManager;Ljava/util/List;)Lcom/ss/android/lark/widget/chat_function_view/IChatFunctionController;", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.a.b$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final IChatFunctionController mo127567a(Context context, Chat chat, Chatter chatter, List<IChatFunctionItem> list) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            Intrinsics.checkParameterIsNotNull(chat, "chat");
            Intrinsics.checkParameterIsNotNull(list, "itemList");
            return new ChatFunctionNoViewController(context, chat, chatter, list);
        }

        /* renamed from: a */
        public final <VH extends RecyclerView.ViewHolder, B extends IChatFunctionBinder<VH>> IChatFunctionController mo127566a(Context context, Chat chat, Chatter chatter, ChatFunctionView chatFunctionView, B b, RecyclerView.LayoutManager layoutManager, List<IChatFunctionItem> list) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            Intrinsics.checkParameterIsNotNull(chat, "chat");
            Intrinsics.checkParameterIsNotNull(chatFunctionView, "chatFunctionView");
            Intrinsics.checkParameterIsNotNull(b, "binder");
            Intrinsics.checkParameterIsNotNull(layoutManager, "layoutManager");
            Intrinsics.checkParameterIsNotNull(list, "itemList");
            return new ChatFunctionController(context, chat, chatter, chatFunctionView, b, layoutManager, list, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0015\n\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0001\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0004\"\u000e\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00020\u0005H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "com/ss/android/lark/chatsetting/impl/chat_function/ChatFunctionController$createChatSetting4Calendar$1", "VH", "B", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lcom/ss/android/lark/widget/chat_function_view/IChatFunctionBinder;", "invoke", "()Lcom/ss/android/lark/chatsetting/impl/chat_function/ChatFunctionController$createChatSetting4Calendar$1;"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.a.b$g */
    static final class C34509g extends Lambda implements Function0<C34503b> {
        final /* synthetic */ ChatFunctionController this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34509g(ChatFunctionController bVar) {
            super(0);
            this.this$0 = bVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final C34503b invoke() {
            return this.this$0.mo127564d();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\u000e\b\u0001\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/chatsetting/impl/chat_function/ChatFunctionAdapter$OnItemClickListener;", "VH", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "B", "Lcom/ss/android/lark/widget/chat_function_view/IChatFunctionBinder;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.a.b$h */
    static final class C34510h extends Lambda implements Function0<ChatFunctionAdapter.OnItemClickListener> {
        final /* synthetic */ ChatFunctionController this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34510h(ChatFunctionController bVar) {
            super(0);
            this.this$0 = bVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ChatFunctionAdapter.OnItemClickListener invoke() {
            return this.this$0.mo127565e();
        }
    }

    /* renamed from: l */
    private final ChatFunctionModel.Delegate m133964l() {
        return new C34504c(this);
    }

    @Override // com.ss.android.lark.widget.chat_function_view.IChatFunctionController
    /* renamed from: a */
    public IChatFunctionItem mo127557a() {
        return this.f89016c.mo127542a();
    }

    /* renamed from: d */
    public final C34503b mo127564d() {
        return new C34503b(this);
    }

    /* renamed from: e */
    public final ChatFunctionAdapter.OnItemClickListener mo127565e() {
        return new C34506d(this);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0005H\u0016J\u0012\u0010\b\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J\u0018\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u0005H\u0002¨\u0006\u000e"}, d2 = {"com/ss/android/lark/chatsetting/impl/chat_function/ChatFunctionController$createModelDelegate$1", "Lcom/ss/android/lark/chatsetting/impl/chat_function/ChatFunctionModel$Delegate;", "onPinReadStateChanged", "", "hasUnreadPin", "", "onTodoListReadStateChanged", "isTodoUnClick", "onUpdateOpenAppFeed", "openAppFeed", "Lcom/ss/android/lark/chat/entity/openapp/OpenAppFeed;", "updateTodoItemBadge", "todoItem", "Lcom/ss/android/lark/chatsetting/impl/chat_function/item/TodoListItem;", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.a.b$c */
    public static final class C34504c implements ChatFunctionModel.Delegate {

        /* renamed from: a */
        final /* synthetic */ ChatFunctionController f89029a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/ss/android/lark/chatsetting/impl/chat_function/ChatFunctionController$createModelDelegate$1$onTodoListReadStateChanged$1", "Lcom/ss/android/lark/chatsetting/impl/chat_function/item/TodoListItem$ITodoClickListener;", "onTodoItemClicked", "", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.chatsetting.impl.a.b$c$a */
        public static final class C34505a implements TodoListItem.ITodoClickListener {

            /* renamed from: a */
            final /* synthetic */ C34504c f89030a;

            /* renamed from: b */
            final /* synthetic */ IChatFunctionItem f89031b;

            @Override // com.ss.android.lark.chatsetting.impl.chat_function.item.TodoListItem.ITodoClickListener
            /* renamed from: a */
            public void mo127571a() {
                this.f89030a.mo127568a((TodoListItem) this.f89031b, false);
            }

            C34505a(C34504c cVar, IChatFunctionItem dVar) {
                this.f89030a = cVar;
                this.f89031b = dVar;
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C34504c(ChatFunctionController bVar) {
            this.f89029a = bVar;
        }

        @Override // com.ss.android.lark.chatsetting.impl.chat_function.ChatFunctionModel.Delegate
        /* renamed from: a */
        public void mo127569a(boolean z) {
            IChatFunctionItem b = this.f89029a.f89016c.mo127547b(3);
            if (b != null) {
                ChatFunctionBadge aVar = new ChatFunctionBadge();
                aVar.mo197613a(z);
                b.mo127573a(aVar);
                this.f89029a.f89016c.mo127544a(b);
            }
        }

        @Override // com.ss.android.lark.chatsetting.impl.chat_function.ChatFunctionModel.Delegate
        /* renamed from: b */
        public void mo127570b(boolean z) {
            IChatFunctionItem b = this.f89029a.f89016c.mo127547b(16);
            if (b != null && (b instanceof TodoListItem)) {
                TodoListItem hVar = (TodoListItem) b;
                mo127568a(hVar, z);
                hVar.mo127582a(new C34505a(this, b));
            }
        }

        /* renamed from: a */
        public final void mo127568a(TodoListItem hVar, boolean z) {
            ChatFunctionBadge aVar = new ChatFunctionBadge();
            aVar.mo197613a(z);
            hVar.mo127573a(aVar);
            this.f89029a.f89016c.mo127544a(hVar);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001\"\b\b\u0000\u0010\u0003*\u00020\u0004\"\u000e\b\u0001\u0010\u0005*\b\u0012\u0004\u0012\u0002H\u00030\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/chatsetting/dependency/IChatSettingModuleDependency$IDocDependency;", "kotlin.jvm.PlatformType", "VH", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "B", "Lcom/ss/android/lark/widget/chat_function_view/IChatFunctionBinder;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.a.b$e */
    static final class C34507e extends Lambda implements Function0<AbstractC34461c.AbstractC34468g> {
        public static final C34507e INSTANCE = new C34507e();

        C34507e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final AbstractC34461c.AbstractC34468g invoke() {
            AbstractC34461c a = ChatSettingModule.m133639a();
            Intrinsics.checkExpressionValueIsNotNull(a, "ChatSettingModule.getDependency()");
            return a.mo127258C();
        }
    }

    /* renamed from: j */
    private final void m133962j() {
        this.f89022j.create();
        this.f89022j.mo127589c();
        this.f89022j.mo127586a();
        this.f89022j.mo127588b();
    }

    @Override // com.ss.android.lark.widget.chat_function_view.IChatFunctionController
    /* renamed from: c */
    public void mo127563c() {
        this.f89022j.destroy();
        AbstractC33978b bVar = this.f89018e;
        if (bVar != null) {
            bVar.mo124337c();
        }
        m133958f().mo127387b(this.f89027o);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0007\u001a\u00020\u0003H\u0016J\b\u0010\b\u001a\u00020\u0003H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/chatsetting/impl/chat_function/ChatFunctionController$createChatSetting4Calendar$1", "Lcom/ss/android/lark/chat/entity/meeting/IMeetingChatSettingDependency;", "showMeetingMinuteRedDot", "", "isShow", "", "showMeetingMinuteRedDotEditing", "sideMenuInsertCalendarEventIcon", "sideMenuInsertMeetingMinuteIcon", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.a.b$b */
    public static final class C34503b implements AbstractC33980d {

        /* renamed from: a */
        final /* synthetic */ ChatFunctionController f89028a;

        @Override // com.ss.android.lark.chat.entity.p1663c.AbstractC33980d
        /* renamed from: a */
        public void mo124338a() {
            AbstractC33978b bVar;
            if (this.f89028a.f89016c.mo127547b(5) == null && !this.f89028a.f89017d.isEdu() && (bVar = this.f89028a.f89018e) != null) {
                this.f89028a.f89016c.mo127543a(0, new CalendarEventItem(bVar));
            }
        }

        @Override // com.ss.android.lark.chat.entity.p1663c.AbstractC33980d
        /* renamed from: b */
        public void mo124340b() {
            AbstractC33978b bVar;
            if (this.f89028a.f89016c.mo127547b(6) == null && !this.f89028a.f89017d.isEdu() && (bVar = this.f89028a.f89018e) != null) {
                this.f89028a.f89016c.mo127543a(1, new MeetingMinuteItem(bVar));
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C34503b(ChatFunctionController bVar) {
            this.f89028a = bVar;
        }

        @Override // com.ss.android.lark.chat.entity.p1663c.AbstractC33980d
        /* renamed from: a */
        public void mo124339a(boolean z) {
            IChatFunctionItem b = this.f89028a.f89016c.mo127547b(6);
            if (b != null) {
                ChatFunctionBadge aVar = new ChatFunctionBadge();
                aVar.mo197613a(z);
                aVar.mo197614b(5);
                b.mo127573a(aVar);
                this.f89028a.f89016c.mo127544a(b);
            }
        }

        @Override // com.ss.android.lark.chat.entity.p1663c.AbstractC33980d
        /* renamed from: b */
        public void mo124341b(boolean z) {
            IChatFunctionItem b = this.f89028a.f89016c.mo127547b(6);
            if (b != null) {
                ChatFunctionBadge aVar = new ChatFunctionBadge();
                aVar.mo197613a(z);
                aVar.mo197612a(R.drawable.title_right_reddot_edit);
                aVar.mo197614b(0);
                b.mo127573a(aVar);
                this.f89028a.f89016c.mo127544a(b);
            }
        }
    }

    /* renamed from: i */
    private final void m133961i() {
        this.f89014a.mo197607a(this.f89016c, this.f89021i);
        this.f89016c.mo127546a(this.f89015b);
        this.f89014a.getRecyclerView().setItemAnimator(null);
        this.f89027o = new C34508f(this);
        m133958f().mo127385a(this.f89027o);
    }

    /* renamed from: k */
    private final void m133963k() {
        if (this.f89017d.isMeeting() && (this.f89019g instanceof Activity)) {
            AbstractC34461c a = ChatSettingModule.m133639a();
            Intrinsics.checkExpressionValueIsNotNull(a, "ChatSettingModule.getDependency()");
            this.f89018e = a.mo127282l().mo127305a((Activity) this.f89019g, this.f89017d.getId(), this.f89017d.getName(), m133959g());
        }
    }

    /* renamed from: a */
    public final void mo127560a(IChatFunctionItem dVar) {
        m133957b(dVar);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/chatsetting/impl/chat_function/ChatFunctionController$createOnItemClickListener$1", "Lcom/ss/android/lark/chatsetting/impl/chat_function/ChatFunctionAdapter$OnItemClickListener;", "onItemClick", "", "item", "Lcom/ss/android/lark/widget/chat_function_view/IChatFunctionItem;", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.a.b$d */
    public static final class C34506d implements ChatFunctionAdapter.OnItemClickListener {

        /* renamed from: a */
        final /* synthetic */ ChatFunctionController f89032a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C34506d(ChatFunctionController bVar) {
            this.f89032a = bVar;
        }

        @Override // com.ss.android.lark.chatsetting.impl.chat_function.ChatFunctionAdapter.OnItemClickListener
        /* renamed from: a */
        public void mo127548a(IChatFunctionItem dVar) {
            Intrinsics.checkParameterIsNotNull(dVar, "item");
            this.f89032a.mo127560a(dVar);
        }
    }

    @Override // com.ss.android.lark.widget.chat_function_view.IChatFunctionController
    /* renamed from: a */
    public View mo127556a(int i) {
        int a = this.f89016c.mo127541a(i);
        if (a < 0) {
            return null;
        }
        return this.f89021i.getChildAt(a);
    }

    @Override // com.ss.android.lark.widget.chat_function_view.IChatFunctionController
    /* renamed from: a */
    public void mo127561a(OnItemUpdateListener fVar) {
        Intrinsics.checkParameterIsNotNull(fVar, "listener");
        this.f89016c.mo127545a(fVar);
    }

    /* renamed from: b */
    private final void m133957b(IChatFunctionItem dVar) {
        boolean z;
        String a = ChatFunctionHitPoint.f90517a.mo129190a(this.f89017d, this.f89023k);
        AbstractC34461c a2 = ChatSettingModule.m133639a();
        Intrinsics.checkExpressionValueIsNotNull(a2, "ChatSettingModule.getDependency()");
        boolean a3 = a2.mo127277g().mo127413a(this.f89017d.getOwnerId());
        String id = this.f89017d.getId();
        Intrinsics.checkExpressionValueIsNotNull(id, "chat.getId()");
        boolean isSecret = this.f89017d.isSecret();
        Chatter chatter = this.f89023k;
        if (chatter != null) {
            z = chatter.isBot();
        } else {
            z = false;
        }
        boolean isMeeting = this.f89017d.isMeeting();
        int a4 = dVar.mo127572a();
        if (a4 == 1) {
            ChatFunctionHitPoint.f90517a.mo129192a(a, a3);
            ChatFunctionHitPoint.f90517a.mo129196c(this.f89017d);
            AnnounceOpenDocHitPoint.Companion aVar = AnnounceOpenDocHitPoint.f90514a;
            Chat.Type type = this.f89017d.getType();
            Intrinsics.checkExpressionValueIsNotNull(type, "chat.type");
            aVar.mo129186a("sidebar", type.getNumber());
        } else if (a4 == 2) {
            AbstractC34461c a5 = ChatSettingModule.m133639a();
            Intrinsics.checkExpressionValueIsNotNull(a5, "ChatSettingModule.getDependency()");
            a5.mo127288r().mo127436a(this.f89017d.getId());
        } else if (a4 == 3) {
            ChatFunctionHitPoint.f90517a.mo129193a(a, a3, id, isSecret, z, isMeeting);
            ChatFunctionHitPoint.f90517a.mo129197d(this.f89017d);
        } else if (a4 == 5) {
            ChatFunctionHitPoint.f90517a.mo129195b(a, a3);
            ChatFunctionHitPoint.f90517a.mo129200g(this.f89017d);
        } else if (a4 == 6) {
            ChatFunctionHitPoint.f90517a.mo129199f(this.f89017d);
        } else if (a4 == 8) {
            ChatFunctionHitPoint.f90517a.mo129198e(this.f89017d);
        } else if (a4 == 9) {
            ChatFunctionHitPoint.Companion aVar2 = ChatFunctionHitPoint.f90517a;
            String d = this.f89022j.mo127590d();
            if (d == null) {
                d = "";
            }
            aVar2.mo129191a(d);
        }
    }

    /* renamed from: a */
    public void mo127559a(int i, IChatFunctionItem dVar) {
        Intrinsics.checkParameterIsNotNull(dVar, "menuItem");
        this.f89016c.mo127543a(i, dVar);
    }

    @Override // com.ss.android.lark.widget.chat_function_view.IChatFunctionController
    /* renamed from: a */
    public void mo127558a(int i, int i2) {
        if (i2 == 1) {
            mo127559a(i, new GroupAnnouncementItem(this.f89017d));
        } else if (i2 == 2) {
            mo127559a(i, new ChatSearchItem(this.f89017d));
        } else if (i2 == 3) {
            mo127559a(i, new PinItem(this.f89017d));
        }
    }

    private ChatFunctionController(Context context, Chat chat, Chatter chatter, ChatFunctionView chatFunctionView, B b, RecyclerView.LayoutManager layoutManager, List<IChatFunctionItem> list) {
        this.f89015b = new ArrayList();
        this.f89024l = LazyKt.lazy(C34507e.INSTANCE);
        this.f89025m = LazyKt.lazy(new C34509g(this));
        this.f89026n = LazyKt.lazy(new C34510h(this));
        this.f89019g = context;
        this.f89017d = chat;
        this.f89023k = chatter;
        this.f89014a = chatFunctionView;
        this.f89020h = b;
        this.f89021i = layoutManager;
        this.f89015b = list;
        this.f89016c = new ChatFunctionAdapter<>(context, b, m133960h());
        m133961i();
        this.f89022j = new ChatFunctionModel(m133964l(), chat, chatter);
        m133962j();
        m133963k();
    }

    public /* synthetic */ ChatFunctionController(Context context, Chat chat, Chatter chatter, ChatFunctionView chatFunctionView, IChatFunctionBinder bVar, RecyclerView.LayoutManager layoutManager, List list, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, chat, chatter, chatFunctionView, bVar, layoutManager, list);
    }
}
