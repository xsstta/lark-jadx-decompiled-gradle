package com.ss.android.lark.chatsetting.impl.chat_function.item;

import android.content.Context;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.p1663c.AbstractC33978b;
import com.ss.android.lark.chatsetting.impl.statistics.ChatSettingExtraParams;
import com.ss.android.lark.chatsetting.impl.statistics.ChatSettingHitPointNew;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.chat_function_view.ChatFunctionBadge;
import com.ss.android.lark.widget.chat_function_view.IChatFunctionItem;
import com.ss.android.lark.widget.chat_function_view.IItemClickListener;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\fXD¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u0012X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\u00020\u0016X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/ss/android/lark/chatsetting/impl/chat_function/item/MeetingMinuteItem;", "Lcom/ss/android/lark/widget/chat_function_view/IChatFunctionItem;", "mSettingMeetingDependency", "Lcom/ss/android/lark/chat/entity/meeting/IChatSettingMeetingDependency;", "(Lcom/ss/android/lark/chat/entity/meeting/IChatSettingMeetingDependency;)V", "badge", "Lcom/ss/android/lark/widget/chat_function_view/ChatFunctionBadge;", "getBadge", "()Lcom/ss/android/lark/widget/chat_function_view/ChatFunctionBadge;", "setBadge", "(Lcom/ss/android/lark/widget/chat_function_view/ChatFunctionBadge;)V", "iconRes", "", "getIconRes", "()I", "id", "getId", "label", "", "getLabel", "()Ljava/lang/String;", "onItemClickListener", "Lcom/ss/android/lark/widget/chat_function_view/IItemClickListener;", "getOnItemClickListener", "()Lcom/ss/android/lark/widget/chat_function_view/IItemClickListener;", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chatsetting.impl.a.b.f */
public final class MeetingMinuteItem implements IChatFunctionItem {

    /* renamed from: a */
    public final AbstractC33978b f89070a;

    /* renamed from: b */
    private final int f89071b = 6;

    /* renamed from: c */
    private final String f89072c;

    /* renamed from: d */
    private final int f89073d;

    /* renamed from: e */
    private ChatFunctionBadge f89074e;

    /* renamed from: f */
    private final IItemClickListener f89075f;

    @Override // com.ss.android.lark.widget.chat_function_view.IChatFunctionItem
    /* renamed from: a */
    public int mo127572a() {
        return this.f89071b;
    }

    @Override // com.ss.android.lark.widget.chat_function_view.IChatFunctionItem
    /* renamed from: b */
    public ChatFunctionBadge mo127574b() {
        return this.f89074e;
    }

    @Override // com.ss.android.lark.widget.chat_function_view.IChatFunctionItem
    /* renamed from: c */
    public IItemClickListener mo127575c() {
        return this.f89075f;
    }

    @Override // com.ss.android.lark.widget.chat_function_view.IChatFunctionItem
    /* renamed from: d */
    public String mo127576d() {
        return this.f89072c;
    }

    @Override // com.ss.android.lark.widget.chat_function_view.IChatFunctionItem
    /* renamed from: g */
    public int mo127579g() {
        return this.f89073d;
    }

    @Override // com.ss.android.lark.widget.chat_function_view.IChatFunctionItem
    /* renamed from: e */
    public String mo127577e() {
        return IChatFunctionItem.C58374a.m226274b(this);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/chatsetting/impl/chat_function/item/MeetingMinuteItem$onItemClickListener$1", "Lcom/ss/android/lark/widget/chat_function_view/IItemClickListener;", "onClick", "", "context", "Landroid/content/Context;", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.a.b.f$a */
    public static final class C34516a implements IItemClickListener {

        /* renamed from: a */
        final /* synthetic */ MeetingMinuteItem f89076a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C34516a(MeetingMinuteItem fVar) {
            this.f89076a = fVar;
        }

        @Override // com.ss.android.lark.widget.chat_function_view.IItemClickListener
        /* renamed from: a */
        public void mo127580a(Context context) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            ChatSettingHitPointNew.m136630b(ChatSettingExtraParams.Click.MEETING_DOCS.plus(ChatSettingExtraParams.Target.IM_CHAT_CAL_VIEW));
            this.f89076a.f89070a.mo124336b();
        }
    }

    @Override // com.ss.android.lark.widget.chat_function_view.IChatFunctionItem
    /* renamed from: a */
    public void mo127573a(ChatFunctionBadge aVar) {
        this.f89074e = aVar;
    }

    public MeetingMinuteItem(AbstractC33978b bVar) {
        int i;
        Intrinsics.checkParameterIsNotNull(bVar, "mSettingMeetingDependency");
        this.f89070a = bVar;
        String string = UIHelper.getString(R.string.Calendar_MeetingNotes_MeetingNotes);
        Intrinsics.checkExpressionValueIsNotNull(string, "UIHelper.getString(R.str…eetingNotes_MeetingNotes)");
        this.f89072c = string;
        if (DesktopUtil.m144307b()) {
            i = R.drawable.side_menu_meeting_minute_desktop_selector;
        } else {
            i = R.drawable.ud_icon_note_colorful;
        }
        this.f89073d = i;
        this.f89075f = new C34516a(this);
    }
}
