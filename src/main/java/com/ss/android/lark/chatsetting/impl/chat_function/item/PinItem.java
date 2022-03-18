package com.ss.android.lark.chatsetting.impl.chat_function.item;

import android.content.Context;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.chat.Chat;
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

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\fXD¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u0012X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\u00020\u0016X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/ss/android/lark/chatsetting/impl/chat_function/item/PinItem;", "Lcom/ss/android/lark/widget/chat_function_view/IChatFunctionItem;", "mChat", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "(Lcom/ss/android/lark/chat/entity/chat/Chat;)V", "badge", "Lcom/ss/android/lark/widget/chat_function_view/ChatFunctionBadge;", "getBadge", "()Lcom/ss/android/lark/widget/chat_function_view/ChatFunctionBadge;", "setBadge", "(Lcom/ss/android/lark/widget/chat_function_view/ChatFunctionBadge;)V", "iconRes", "", "getIconRes", "()I", "id", "getId", "label", "", "getLabel", "()Ljava/lang/String;", "onItemClickListener", "Lcom/ss/android/lark/widget/chat_function_view/IItemClickListener;", "getOnItemClickListener", "()Lcom/ss/android/lark/widget/chat_function_view/IItemClickListener;", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chatsetting.impl.a.b.g */
public final class PinItem implements IChatFunctionItem {

    /* renamed from: a */
    public final Chat f89077a;

    /* renamed from: b */
    private final int f89078b = 3;

    /* renamed from: c */
    private final String f89079c;

    /* renamed from: d */
    private final int f89080d;

    /* renamed from: e */
    private ChatFunctionBadge f89081e;

    /* renamed from: f */
    private final IItemClickListener f89082f;

    @Override // com.ss.android.lark.widget.chat_function_view.IChatFunctionItem
    /* renamed from: a */
    public int mo127572a() {
        return this.f89078b;
    }

    @Override // com.ss.android.lark.widget.chat_function_view.IChatFunctionItem
    /* renamed from: b */
    public ChatFunctionBadge mo127574b() {
        return this.f89081e;
    }

    @Override // com.ss.android.lark.widget.chat_function_view.IChatFunctionItem
    /* renamed from: c */
    public IItemClickListener mo127575c() {
        return this.f89082f;
    }

    @Override // com.ss.android.lark.widget.chat_function_view.IChatFunctionItem
    /* renamed from: d */
    public String mo127576d() {
        return this.f89079c;
    }

    @Override // com.ss.android.lark.widget.chat_function_view.IChatFunctionItem
    /* renamed from: g */
    public int mo127579g() {
        return this.f89080d;
    }

    @Override // com.ss.android.lark.widget.chat_function_view.IChatFunctionItem
    /* renamed from: e */
    public String mo127577e() {
        return IChatFunctionItem.C58374a.m226274b(this);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/chatsetting/impl/chat_function/item/PinItem$onItemClickListener$1", "Lcom/ss/android/lark/widget/chat_function_view/IItemClickListener;", "onClick", "", "context", "Landroid/content/Context;", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.a.b.g$a */
    public static final class C34517a implements IItemClickListener {

        /* renamed from: a */
        final /* synthetic */ PinItem f89083a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C34517a(PinItem gVar) {
            this.f89083a = gVar;
        }

        @Override // com.ss.android.lark.widget.chat_function_view.IItemClickListener
        /* renamed from: a */
        public void mo127580a(Context context) {
            int i;
            Intrinsics.checkParameterIsNotNull(context, "context");
            ChatSettingHitPointNew.m136630b(ChatSettingExtraParams.Click.PIN.plus(ChatSettingExtraParams.Target.IM_CHAT_PIN_VIEW));
            if (this.f89083a.f89077a.isThread()) {
                AbstractC34461c a = ChatSettingModule.m133639a();
                Intrinsics.checkExpressionValueIsNotNull(a, "ChatSettingModule.getDependency()");
                a.mo127290t().mo127419a(this.f89083a.f89077a.getId(), this.f89083a.f89077a.getOwnerId(), context, this.f89083a.f89077a.isSuper(), this.f89083a.f89077a.getUserCount());
                return;
            }
            if (this.f89083a.f89077a.isGroup()) {
                i = this.f89083a.f89077a.getUserCount();
            } else if (this.f89083a.f89077a.isSoloChat()) {
                i = 1;
            } else {
                i = 2;
            }
            AbstractC34461c a2 = ChatSettingModule.m133639a();
            Intrinsics.checkExpressionValueIsNotNull(a2, "ChatSettingModule.getDependency()");
            a2.mo127290t().mo127420a(this.f89083a.f89077a.getId(), this.f89083a.f89077a.getOwnerId(), context, this.f89083a.f89077a.isGroup(), this.f89083a.f89077a.isSuper(), i);
        }
    }

    @Override // com.ss.android.lark.widget.chat_function_view.IChatFunctionItem
    /* renamed from: a */
    public void mo127573a(ChatFunctionBadge aVar) {
        this.f89081e = aVar;
    }

    public PinItem(Chat chat) {
        int i;
        Intrinsics.checkParameterIsNotNull(chat, "mChat");
        this.f89077a = chat;
        String string = UIHelper.getString(R.string.Lark_Legacy_Pin);
        Intrinsics.checkExpressionValueIsNotNull(string, "UIHelper.getString(R.string.Lark_Legacy_Pin)");
        this.f89079c = string;
        if (DesktopUtil.m144307b()) {
            i = R.drawable.side_menu_pin_desktop_selector;
        } else {
            i = R.drawable.ud_icon_pin_colorful;
        }
        this.f89080d = i;
        this.f89082f = new C34517a(this);
    }
}
