package com.ss.android.lark.chatsetting.impl.chat_function.item;

import android.content.Context;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.ChatChatter;
import com.ss.android.lark.chatsetting.ChatSettingModule;
import com.ss.android.lark.chatsetting.impl.statistics.ChatSettingExtraParams;
import com.ss.android.lark.chatsetting.impl.statistics.ChatSettingHitPointNew;
import com.ss.android.lark.chatsetting.p1693a.AbstractC34461c;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.chat_function_view.ChatFunctionBadge;
import com.ss.android.lark.widget.chat_function_view.IChatFunctionItem;
import com.ss.android.lark.widget.chat_function_view.IItemClickListener;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u000eXD¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u0014X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\u00020\u0018X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcom/ss/android/lark/chatsetting/impl/chat_function/item/FindTimeItem;", "Lcom/ss/android/lark/widget/chat_function_view/IChatFunctionItem;", "mChat", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "mChatter", "Lcom/ss/android/lark/chat/entity/chatter/ChatChatter;", "(Lcom/ss/android/lark/chat/entity/chat/Chat;Lcom/ss/android/lark/chat/entity/chatter/ChatChatter;)V", "badge", "Lcom/ss/android/lark/widget/chat_function_view/ChatFunctionBadge;", "getBadge", "()Lcom/ss/android/lark/widget/chat_function_view/ChatFunctionBadge;", "setBadge", "(Lcom/ss/android/lark/widget/chat_function_view/ChatFunctionBadge;)V", "iconRes", "", "getIconRes", "()I", "id", "getId", "label", "", "getLabel", "()Ljava/lang/String;", "onItemClickListener", "Lcom/ss/android/lark/widget/chat_function_view/IItemClickListener;", "getOnItemClickListener", "()Lcom/ss/android/lark/widget/chat_function_view/IItemClickListener;", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chatsetting.impl.a.b.d */
public final class FindTimeItem implements IChatFunctionItem {

    /* renamed from: a */
    public final Chat f89055a;

    /* renamed from: b */
    public final ChatChatter f89056b;

    /* renamed from: c */
    private final int f89057c = 8;

    /* renamed from: d */
    private final String f89058d;

    /* renamed from: e */
    private final int f89059e;

    /* renamed from: f */
    private ChatFunctionBadge f89060f;

    /* renamed from: g */
    private final IItemClickListener f89061g;

    @Override // com.ss.android.lark.widget.chat_function_view.IChatFunctionItem
    /* renamed from: a */
    public int mo127572a() {
        return this.f89057c;
    }

    @Override // com.ss.android.lark.widget.chat_function_view.IChatFunctionItem
    /* renamed from: b */
    public ChatFunctionBadge mo127574b() {
        return this.f89060f;
    }

    @Override // com.ss.android.lark.widget.chat_function_view.IChatFunctionItem
    /* renamed from: c */
    public IItemClickListener mo127575c() {
        return this.f89061g;
    }

    @Override // com.ss.android.lark.widget.chat_function_view.IChatFunctionItem
    /* renamed from: d */
    public String mo127576d() {
        return this.f89058d;
    }

    @Override // com.ss.android.lark.widget.chat_function_view.IChatFunctionItem
    /* renamed from: g */
    public int mo127579g() {
        return this.f89059e;
    }

    @Override // com.ss.android.lark.widget.chat_function_view.IChatFunctionItem
    /* renamed from: e */
    public String mo127577e() {
        return IChatFunctionItem.C58374a.m226274b(this);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/chatsetting/impl/chat_function/item/FindTimeItem$onItemClickListener$1", "Lcom/ss/android/lark/widget/chat_function_view/IItemClickListener;", "onClick", "", "context", "Landroid/content/Context;", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.a.b.d$a */
    public static final class C34514a implements IItemClickListener {

        /* renamed from: a */
        final /* synthetic */ FindTimeItem f89062a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C34514a(FindTimeItem dVar) {
            this.f89062a = dVar;
        }

        @Override // com.ss.android.lark.widget.chat_function_view.IItemClickListener
        /* renamed from: a */
        public void mo127580a(Context context) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            ChatSettingHitPointNew.m136630b(ChatSettingExtraParams.Click.CAL.plus(ChatSettingExtraParams.Target.CAL_CALENDAR_CHAT_VIEW));
            AbstractC34461c a = ChatSettingModule.m133639a();
            Intrinsics.checkExpressionValueIsNotNull(a, "ChatSettingModule.getDependency()");
            a.mo127282l().mo127307a(context, this.f89062a.f89055a, this.f89062a.f89056b);
        }
    }

    @Override // com.ss.android.lark.widget.chat_function_view.IChatFunctionItem
    /* renamed from: a */
    public void mo127573a(ChatFunctionBadge aVar) {
        this.f89060f = aVar;
    }

    public FindTimeItem(Chat chat, ChatChatter chatChatter) {
        String str;
        int i;
        Intrinsics.checkParameterIsNotNull(chat, "mChat");
        this.f89055a = chat;
        this.f89056b = chatChatter;
        if (chat.isP2PChat()) {
            str = UIHelper.getString(R.string.Calendar_ChatFindTime_FindTimeSingle);
            Intrinsics.checkExpressionValueIsNotNull(str, "UIHelper.getString(R.str…tFindTime_FindTimeSingle)");
        } else {
            str = UIHelper.getString(R.string.Calendar_ChatFindTime_FindTimePlural);
            Intrinsics.checkExpressionValueIsNotNull(str, "UIHelper.getString(R.str…tFindTime_FindTimePlural)");
        }
        this.f89058d = str;
        if (DesktopUtil.m144307b()) {
            i = R.drawable.side_menu_calendar_find_time_desktop_selector;
        } else {
            i = R.drawable.ud_icon_calendar_chat_colorful;
        }
        this.f89059e = i;
        this.f89061g = new C34514a(this);
    }
}
