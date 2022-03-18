package com.ss.android.lark.chatwindow.view.sidemenu.item;

import android.content.Context;
import com.larksuite.suite.R;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.chat.entity.openapp.C34019a;
import com.ss.android.lark.dependency.AbstractC36474h;
import com.ss.android.lark.dependency.IChatSettingDependency;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.chat_function_view.ChatFunctionBadge;
import com.ss.android.lark.widget.chat_function_view.IChatFunctionItem;
import com.ss.android.lark.widget.chat_function_view.IItemClickListener;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001 B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\b\u0010\u001f\u001a\u00020\u0012H\u0002R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\u00020\u0012X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u0012XD¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u0018X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u001cX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lcom/ss/android/lark/chatwindow/view/sidemenu/item/ChatSettingItem;", "Lcom/ss/android/lark/widget/chat_function_view/IChatFunctionItem;", "chat", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "chatter", "Lcom/ss/android/lark/chat/entity/chatter/Chatter;", "openAppFeed", "Lcom/ss/android/lark/chat/entity/openapp/OpenAppFeed;", "dependency", "Lcom/ss/android/lark/chatwindow/view/sidemenu/item/ChatSettingItem$ChatSettingItemDependency;", "(Lcom/ss/android/lark/chat/entity/chat/Chat;Lcom/ss/android/lark/chat/entity/chatter/Chatter;Lcom/ss/android/lark/chat/entity/openapp/OpenAppFeed;Lcom/ss/android/lark/chatwindow/view/sidemenu/item/ChatSettingItem$ChatSettingItemDependency;)V", "badge", "Lcom/ss/android/lark/widget/chat_function_view/ChatFunctionBadge;", "getBadge", "()Lcom/ss/android/lark/widget/chat_function_view/ChatFunctionBadge;", "setBadge", "(Lcom/ss/android/lark/widget/chat_function_view/ChatFunctionBadge;)V", "iconRes", "", "getIconRes", "()I", "id", "getId", "label", "", "getLabel", "()Ljava/lang/String;", "onItemClickListener", "Lcom/ss/android/lark/widget/chat_function_view/IItemClickListener;", "getOnItemClickListener", "()Lcom/ss/android/lark/widget/chat_function_view/IItemClickListener;", "getHideSettingItemMask", "ChatSettingItemDependency", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chatwindow.view.sidemenu.a.a */
public final class ChatSettingItem implements IChatFunctionItem {

    /* renamed from: a */
    public final Chat f91208a;

    /* renamed from: b */
    public final Chatter f91209b;

    /* renamed from: c */
    public final ChatSettingItemDependency f91210c;

    /* renamed from: d */
    private final int f91211d = 4;

    /* renamed from: e */
    private final String f91212e;

    /* renamed from: f */
    private final int f91213f;

    /* renamed from: g */
    private ChatFunctionBadge f91214g;

    /* renamed from: h */
    private final IItemClickListener f91215h;

    /* renamed from: i */
    private final C34019a f91216i;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J \u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH&J\"\u0010\u000b\u001a\u00020\u00052\b\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0003H&¨\u0006\u0011"}, d2 = {"Lcom/ss/android/lark/chatwindow/view/sidemenu/item/ChatSettingItem$ChatSettingItemDependency;", "", "getEventSettingRole", "", "gotoGroupSettingActivity", "", "chatId", "", "meetingRole", "isOnCall", "", "startP2PSetting", "chatter", "Lcom/ss/android/lark/chat/entity/chatter/Chatter;", "curChat", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "hideSettingItemMask", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatwindow.view.sidemenu.a.a$a */
    public interface ChatSettingItemDependency {
        /* renamed from: a */
        int mo123537a();

        /* renamed from: a */
        void mo123538a(Chatter chatter, Chat chat, int i);

        /* renamed from: a */
        void mo123539a(String str, int i, boolean z);
    }

    @Override // com.ss.android.lark.widget.chat_function_view.IChatFunctionItem
    /* renamed from: a */
    public int mo127572a() {
        return this.f91211d;
    }

    @Override // com.ss.android.lark.widget.chat_function_view.IChatFunctionItem
    /* renamed from: b */
    public ChatFunctionBadge mo127574b() {
        return this.f91214g;
    }

    @Override // com.ss.android.lark.widget.chat_function_view.IChatFunctionItem
    /* renamed from: c */
    public IItemClickListener mo127575c() {
        return this.f91215h;
    }

    @Override // com.ss.android.lark.widget.chat_function_view.IChatFunctionItem
    /* renamed from: d */
    public String mo127576d() {
        return this.f91212e;
    }

    @Override // com.ss.android.lark.widget.chat_function_view.IChatFunctionItem
    /* renamed from: g */
    public int mo127579g() {
        return this.f91213f;
    }

    @Override // com.ss.android.lark.widget.chat_function_view.IChatFunctionItem
    /* renamed from: e */
    public String mo127577e() {
        return IChatFunctionItem.C58374a.m226274b(this);
    }

    /* renamed from: f */
    public final int mo129891f() {
        if (this.f91216i == null) {
            return 0;
        }
        AbstractC36474h b = C29990c.m110930b();
        Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
        IChatSettingDependency w = b.mo134595w();
        Intrinsics.checkExpressionValueIsNotNull(w, "chatSettingDependency");
        return w.mo134347a() | w.mo134360b() | w.mo134364c();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/chatwindow/view/sidemenu/item/ChatSettingItem$onItemClickListener$1", "Lcom/ss/android/lark/widget/chat_function_view/IItemClickListener;", "onClick", "", "context", "Landroid/content/Context;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatwindow.view.sidemenu.a.a$b */
    public static final class C35301b implements IItemClickListener {

        /* renamed from: a */
        final /* synthetic */ ChatSettingItem f91217a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C35301b(ChatSettingItem aVar) {
            this.f91217a = aVar;
        }

        @Override // com.ss.android.lark.widget.chat_function_view.IItemClickListener
        /* renamed from: a */
        public void mo127580a(Context context) {
            int i;
            Intrinsics.checkParameterIsNotNull(context, "context");
            if (!this.f91217a.f91208a.isP2PChat()) {
                if (!this.f91217a.f91208a.isMeeting() || this.f91217a.f91210c == null) {
                    i = 0;
                } else {
                    i = this.f91217a.f91210c.mo123537a();
                }
                ChatSettingItemDependency aVar = this.f91217a.f91210c;
                String id = this.f91217a.f91208a.getId();
                Intrinsics.checkExpressionValueIsNotNull(id, "chat.getId()");
                aVar.mo123539a(id, i, this.f91217a.f91208a.isOnCall());
                return;
            }
            this.f91217a.f91210c.mo123538a(this.f91217a.f91209b, this.f91217a.f91208a, this.f91217a.mo129891f());
        }
    }

    @Override // com.ss.android.lark.widget.chat_function_view.IChatFunctionItem
    /* renamed from: a */
    public void mo127573a(ChatFunctionBadge aVar) {
        this.f91214g = aVar;
    }

    public ChatSettingItem(Chat chat, Chatter chatter, C34019a aVar, ChatSettingItemDependency aVar2) {
        Intrinsics.checkParameterIsNotNull(chat, "chat");
        Intrinsics.checkParameterIsNotNull(aVar2, "dependency");
        this.f91208a = chat;
        this.f91209b = chatter;
        this.f91216i = aVar;
        this.f91210c = aVar2;
        String string = UIHelper.getString(R.string.Lark_Legacy_Setting);
        Intrinsics.checkExpressionValueIsNotNull(string, "UIHelper.getString(R.string.Lark_Legacy_Setting)");
        this.f91212e = string;
        this.f91213f = R.drawable.side_menu_setting_desktop_selector;
        this.f91215h = new C35301b(this);
    }
}
