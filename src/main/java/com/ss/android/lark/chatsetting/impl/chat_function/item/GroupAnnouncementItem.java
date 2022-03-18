package com.ss.android.lark.chatsetting.impl.chat_function.item;

import android.content.Context;
import android.content.Intent;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chat.ChatAnnouncement;
import com.ss.android.lark.chatsetting.ChatSettingModule;
import com.ss.android.lark.chatsetting.impl.group.announcement.LarkGroupAnnouncementEditActivity;
import com.ss.android.lark.chatsetting.impl.statistics.ChatSettingExtraParams;
import com.ss.android.lark.chatsetting.impl.statistics.ChatSettingHitPointNew;
import com.ss.android.lark.chatsetting.p1693a.AbstractC34461c;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.chat_function_view.ChatFunctionBadge;
import com.ss.android.lark.widget.chat_function_view.IChatFunctionItem;
import com.ss.android.lark.widget.chat_function_view.IItemClickListener;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0012H\u0002R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\fXD¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u0012X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\u00020\u0016X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001e"}, d2 = {"Lcom/ss/android/lark/chatsetting/impl/chat_function/item/GroupAnnouncementItem;", "Lcom/ss/android/lark/widget/chat_function_view/IChatFunctionItem;", "mChat", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "(Lcom/ss/android/lark/chat/entity/chat/Chat;)V", "badge", "Lcom/ss/android/lark/widget/chat_function_view/ChatFunctionBadge;", "getBadge", "()Lcom/ss/android/lark/widget/chat_function_view/ChatFunctionBadge;", "setBadge", "(Lcom/ss/android/lark/widget/chat_function_view/ChatFunctionBadge;)V", "iconRes", "", "getIconRes", "()I", "id", "getId", "label", "", "getLabel", "()Ljava/lang/String;", "onItemClickListener", "Lcom/ss/android/lark/widget/chat_function_view/IItemClickListener;", "getOnItemClickListener", "()Lcom/ss/android/lark/widget/chat_function_view/IItemClickListener;", "startGroupAnnouncement", "", "context", "Landroid/content/Context;", "chatId", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chatsetting.impl.a.b.e */
public final class GroupAnnouncementItem implements IChatFunctionItem {

    /* renamed from: a */
    public final Chat f89063a;

    /* renamed from: b */
    private final int f89064b = 1;

    /* renamed from: c */
    private final String f89065c;

    /* renamed from: d */
    private final int f89066d;

    /* renamed from: e */
    private ChatFunctionBadge f89067e;

    /* renamed from: f */
    private final IItemClickListener f89068f;

    @Override // com.ss.android.lark.widget.chat_function_view.IChatFunctionItem
    /* renamed from: a */
    public int mo127572a() {
        return this.f89064b;
    }

    @Override // com.ss.android.lark.widget.chat_function_view.IChatFunctionItem
    /* renamed from: b */
    public ChatFunctionBadge mo127574b() {
        return this.f89067e;
    }

    @Override // com.ss.android.lark.widget.chat_function_view.IChatFunctionItem
    /* renamed from: c */
    public IItemClickListener mo127575c() {
        return this.f89068f;
    }

    @Override // com.ss.android.lark.widget.chat_function_view.IChatFunctionItem
    /* renamed from: d */
    public String mo127576d() {
        return this.f89065c;
    }

    @Override // com.ss.android.lark.widget.chat_function_view.IChatFunctionItem
    /* renamed from: g */
    public int mo127579g() {
        return this.f89066d;
    }

    @Override // com.ss.android.lark.widget.chat_function_view.IChatFunctionItem
    /* renamed from: e */
    public String mo127577e() {
        return IChatFunctionItem.C58374a.m226274b(this);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/chatsetting/impl/chat_function/item/GroupAnnouncementItem$onItemClickListener$1", "Lcom/ss/android/lark/widget/chat_function_view/IItemClickListener;", "onClick", "", "context", "Landroid/content/Context;", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.a.b.e$a */
    public static final class C34515a implements IItemClickListener {

        /* renamed from: a */
        final /* synthetic */ GroupAnnouncementItem f89069a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C34515a(GroupAnnouncementItem eVar) {
            this.f89069a = eVar;
        }

        @Override // com.ss.android.lark.widget.chat_function_view.IItemClickListener
        /* renamed from: a */
        public void mo127580a(Context context) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            ChatSettingHitPointNew.m136630b(ChatSettingExtraParams.Click.ANNOUNCEMENT.plus(ChatSettingExtraParams.Target.IM_GROUP_ANNOUNCEMENT_VIEW));
            ChatAnnouncement chatAnnouncement = this.f89069a.f89063a.getChatAnnouncement();
            Intrinsics.checkExpressionValueIsNotNull(chatAnnouncement, "mChat.chatAnnouncement");
            if (chatAnnouncement.isUseOpenDoc()) {
                StringBuilder sb = new StringBuilder();
                sb.append("AnnounceUrl = ");
                ChatAnnouncement chatAnnouncement2 = this.f89069a.f89063a.getChatAnnouncement();
                Intrinsics.checkExpressionValueIsNotNull(chatAnnouncement2, "mChat.chatAnnouncement");
                sb.append(chatAnnouncement2.getAnnounceUrl());
                Log.m165379d("gotoAnnouncementActivity", sb.toString());
                AbstractC34461c a = ChatSettingModule.m133639a();
                Intrinsics.checkExpressionValueIsNotNull(a, "ChatSettingModule.getDependency()");
                AbstractC34461c.AbstractC34464c c = a.mo127272c();
                Intrinsics.checkExpressionValueIsNotNull(c, "ChatSettingModule.getDep…       .browserDependency");
                ChatAnnouncement chatAnnouncement3 = this.f89069a.f89063a.getChatAnnouncement();
                Intrinsics.checkExpressionValueIsNotNull(chatAnnouncement3, "mChat.chatAnnouncement");
                c.mo127302a(context, chatAnnouncement3.getAnnounceUrl());
                return;
            }
            GroupAnnouncementItem eVar = this.f89069a;
            String id = eVar.f89063a.getId();
            Intrinsics.checkExpressionValueIsNotNull(id, "mChat.getId()");
            eVar.mo127581a(context, id);
        }
    }

    @Override // com.ss.android.lark.widget.chat_function_view.IChatFunctionItem
    /* renamed from: a */
    public void mo127573a(ChatFunctionBadge aVar) {
        this.f89067e = aVar;
    }

    public GroupAnnouncementItem(Chat chat) {
        String str;
        int i;
        Intrinsics.checkParameterIsNotNull(chat, "mChat");
        this.f89063a = chat;
        if (chat.isThread()) {
            str = UIHelper.getString(R.string.Lark_Groups_Announcement);
            Intrinsics.checkExpressionValueIsNotNull(str, "UIHelper.getString(R.str…Lark_Groups_Announcement)");
        } else {
            str = UIHelper.getString(R.string.Lark_Legacy_Announcement);
            Intrinsics.checkExpressionValueIsNotNull(str, "UIHelper.getString(R.str…Lark_Legacy_Announcement)");
        }
        this.f89065c = str;
        if (DesktopUtil.m144307b()) {
            i = R.drawable.side_menu_announcement_desktop_selector;
        } else {
            i = R.drawable.ud_icon_boards_colorful;
        }
        this.f89066d = i;
        this.f89068f = new C34515a(this);
    }

    /* renamed from: a */
    public final void mo127581a(Context context, String str) {
        Intent intent = new Intent(context, LarkGroupAnnouncementEditActivity.class);
        intent.putExtra("chatID", str);
        context.startActivity(intent);
    }
}
