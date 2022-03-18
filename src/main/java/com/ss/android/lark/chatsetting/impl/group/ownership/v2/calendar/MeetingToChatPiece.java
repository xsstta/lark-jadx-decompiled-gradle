package com.ss.android.lark.chatsetting.impl.group.ownership.v2.calendar;

import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import com.google.firebase.messaging.Constants;
import com.larksuite.component.universe_design.dialog.UDDialogBuilder;
import com.larksuite.component.universe_design.toast.UDToast;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chatsetting.ChatSettingModule;
import com.ss.android.lark.chatsetting.impl.common_view.base.SettingCenterTextPiece;
import com.ss.android.lark.chatsetting.impl.group.ownership.v2.calendar.CalendarHitPoint;
import com.ss.android.lark.chatsetting.impl.p1698b.C34526a;
import com.ss.android.lark.chatsetting.p1693a.AbstractC34461c;
import com.ss.android.lark.piece.data.DataObserver;
import com.ss.android.lark.piece.p2465b.C51468a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007*\u0002\u0004\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u0004\u0018\u00010\nJ\n\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0014J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\nJ\b\u0010\u0010\u001a\u00020\u0011H\u0014J\b\u0010\u0012\u001a\u00020\u0013H\u0014J\b\u0010\u0014\u001a\u00020\u0013H\u0002J\b\u0010\u0015\u001a\u00020\u0013H\u0002J\b\u0010\u0016\u001a\u00020\u0013H\u0002J\b\u0010\u0017\u001a\u00020\u0011H\u0016J\b\u0010\u0018\u001a\u00020\u0011H\u0016J\b\u0010\u0019\u001a\u00020\u0013H\u0002R\u0010\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0004\n\u0002\u0010\u0005R\u0010\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0004\n\u0002\u0010\b¨\u0006\u001a"}, d2 = {"Lcom/ss/android/lark/chatsetting/impl/group/ownership/v2/calendar/MeetingToChatPiece;", "Lcom/ss/android/lark/chatsetting/impl/common_view/base/SettingCenterTextPiece;", "()V", "chatObserver", "com/ss/android/lark/chatsetting/impl/group/ownership/v2/calendar/MeetingToChatPiece$chatObserver$1", "Lcom/ss/android/lark/chatsetting/impl/group/ownership/v2/calendar/MeetingToChatPiece$chatObserver$1;", "isMeetingChangedObserver", "com/ss/android/lark/chatsetting/impl/group/ownership/v2/calendar/MeetingToChatPiece$isMeetingChangedObserver$1", "Lcom/ss/android/lark/chatsetting/impl/group/ownership/v2/calendar/MeetingToChatPiece$isMeetingChangedObserver$1;", "getChat", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "getContentClickListener", "Landroid/view/View$OnClickListener;", "isContentViewVisible", "", "chat", "itemType", "", "registerShareData", "", "reopenChat", "sendClickBtnEvent", "showTransferToGroupConfirmDialog", "titleColorRes", "titleRes", "transferToChat", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class MeetingToChatPiece extends SettingCenterTextPiece {

    /* renamed from: a */
    private final C34873a f90041a = new C34873a(this, true);

    /* renamed from: b */
    private final C34875c f90042b = new C34875c(this, true);

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.chatsetting.impl.common_view.base.SettingBasePiece
    /* renamed from: f */
    public int mo127635f() {
        return 34;
    }

    @Override // com.ss.android.lark.chatsetting.impl.common_view.base.SettingCenterTextPiece
    /* renamed from: j */
    public int mo127642j() {
        return R.string.Calendar_Setting_TransformToNormalGroup;
    }

    @Override // com.ss.android.lark.chatsetting.impl.common_view.base.SettingCenterTextPiece
    /* renamed from: k */
    public int mo127643k() {
        return R.color.text_placeholder;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.chatsetting.impl.common_view.base.SettingBasePiece
    /* renamed from: g */
    public View.OnClickListener mo127636g() {
        return new View$OnClickListenerC34874b(this);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.chatsetting.impl.common_view.base.SettingBasePiece
    /* renamed from: e */
    public void mo127634e() {
        super.mo127634e();
        mo177190a(Chat.class, this.f90041a);
        mo177190a("is_meeting_changed", this.f90042b);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0018, code lost:
        if ((r0 instanceof com.ss.android.lark.chat.entity.chat.Chat) != false) goto L_0x001c;
     */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.ss.android.lark.chat.entity.chat.Chat mo128676p() {
        /*
            r3 = this;
            com.ss.android.lark.piece.a.c r0 = r3.mo177203q()
            java.lang.Class<com.ss.android.lark.chat.entity.chat.Chat> r1 = com.ss.android.lark.chat.entity.chat.Chat.class
            java.util.concurrent.ConcurrentHashMap r0 = r0.mo177165a()
            java.lang.Object r0 = r0.get(r1)
            r1 = 0
            if (r0 == 0) goto L_0x001b
            java.lang.String r2 = "dataMap[key] ?: return null"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r2)
            boolean r2 = r0 instanceof com.ss.android.lark.chat.entity.chat.Chat
            if (r2 == 0) goto L_0x001b
            goto L_0x001c
        L_0x001b:
            r0 = r1
        L_0x001c:
            com.ss.android.lark.chat.entity.chat.Chat r0 = (com.ss.android.lark.chat.entity.chat.Chat) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.chatsetting.impl.group.ownership.v2.calendar.MeetingToChatPiece.mo128676p():com.ss.android.lark.chat.entity.chat.Chat");
    }

    /* renamed from: l */
    public final void mo128672l() {
        CalendarHitPoint.f90049a.mo128683a();
        Chat p = mo128676p();
        if (p != null) {
            CalendarHitPoint.Companion aVar = CalendarHitPoint.f90049a;
            String createTime = p.getCreateTime();
            Intrinsics.checkExpressionValueIsNotNull(createTime, "chat.createTime");
            String id = p.getId();
            Intrinsics.checkExpressionValueIsNotNull(id, "chat.getId()");
            aVar.mo128684a(createTime, id);
        }
    }

    /* renamed from: n */
    public final void mo128674n() {
        Chat p = mo128676p();
        if (p != null) {
            UIGetDataCallback uIGetDataCallback = new UIGetDataCallback(new C34878f(this));
            AbstractC34461c a = ChatSettingModule.m133639a();
            Intrinsics.checkExpressionValueIsNotNull(a, "ChatSettingModule.getDependency()");
            a.mo127282l().mo127308a(p.getId(), (IGetDataCallback) mo177209w().wrapAndAddCallback(uIGetDataCallback));
        }
    }

    /* renamed from: o */
    public final void mo128675o() {
        String id;
        Chat p = mo128676p();
        if (p != null && (id = p.getId()) != null) {
            Intrinsics.checkExpressionValueIsNotNull(id, "getChat()?.getId() ?: return");
            if (mo177206t()) {
                AbstractC34461c a = ChatSettingModule.m133639a();
                Intrinsics.checkExpressionValueIsNotNull(a, "ChatSettingModule.getDependency()");
                a.mo127274d().mo127318a(mo177180C(), id);
                mo177212z();
            }
        }
    }

    /* renamed from: m */
    public final void mo128673m() {
        ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) new UDDialogBuilder(mo177180C()).title(R.string.Calendar_Setting_ConfirmTransform)).titleLineCount(2)).message(R.string.Calendar_Setting_TransformGroupConfirmSubtitle)).addActionButton(R.id.ud_dialog_btn_primary, R.string.Lark_Legacy_ConfirmTip, new DialogInterface$OnClickListenerC34876d(this))).addActionButton(R.id.ud_dialog_btn_secondary, R.string.Lark_Legacy_Cancel, DialogInterface$OnClickListenerC34877e.f90047a)).show();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0017\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"com/ss/android/lark/chatsetting/impl/group/ownership/v2/calendar/MeetingToChatPiece$transferToChat$callback$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "(Ljava/lang/Boolean;)V", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.v2.calendar.MeetingToChatPiece$f */
    public static final class C34878f implements IGetDataCallback<Boolean> {

        /* renamed from: a */
        final /* synthetic */ MeetingToChatPiece f90048a;

        /* renamed from: a */
        public void onSuccess(Boolean bool) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C34878f(MeetingToChatPiece meetingToChatPiece) {
            this.f90048a = meetingToChatPiece;
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            Context C = this.f90048a.mo177180C();
            String displayMsg = errorResult.getDisplayMsg(C51468a.m199493c(R.string.Calendar_SubscribeCalendar_OperationFailed, this.f90048a.mo177180C()));
            Intrinsics.checkExpressionValueIsNotNull(displayMsg, "err.getDisplayMsg(R.stri…String(requireContext()))");
            UDToast.show(C, displayMsg);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/chatsetting/impl/group/ownership/v2/calendar/MeetingToChatPiece$chatObserver$1", "Lcom/ss/android/lark/piece/data/DataObserver;", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "onValue", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.v2.calendar.MeetingToChatPiece$a */
    public static final class C34873a extends DataObserver<Chat> {

        /* renamed from: a */
        final /* synthetic */ MeetingToChatPiece f90043a;

        /* renamed from: a */
        public void mo127664a(Chat chat) {
            if (chat != null) {
                MeetingToChatPiece meetingToChatPiece = this.f90043a;
                meetingToChatPiece.mo127631b(meetingToChatPiece.mo128671a(chat));
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34873a(MeetingToChatPiece meetingToChatPiece, boolean z) {
            super(z);
            this.f90043a = meetingToChatPiece;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.v2.calendar.MeetingToChatPiece$b */
    static final class View$OnClickListenerC34874b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ MeetingToChatPiece f90044a;

        View$OnClickListenerC34874b(MeetingToChatPiece meetingToChatPiece) {
            this.f90044a = meetingToChatPiece;
        }

        public final void onClick(View view) {
            this.f90044a.mo128672l();
            this.f90044a.mo128673m();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"com/ss/android/lark/chatsetting/impl/group/ownership/v2/calendar/MeetingToChatPiece$isMeetingChangedObserver$1", "Lcom/ss/android/lark/piece/data/DataObserver;", "", "onValue", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "(Ljava/lang/Boolean;)V", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.v2.calendar.MeetingToChatPiece$c */
    public static final class C34875c extends DataObserver<Boolean> {

        /* renamed from: a */
        final /* synthetic */ MeetingToChatPiece f90045a;

        /* renamed from: a */
        public void mo127664a(Boolean bool) {
            if (Intrinsics.areEqual((Object) bool, (Object) true)) {
                this.f90045a.mo128675o();
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34875c(MeetingToChatPiece meetingToChatPiece, boolean z) {
            super(z);
            this.f90045a = meetingToChatPiece;
        }
    }

    /* renamed from: a */
    public final boolean mo128671a(Chat chat) {
        Intrinsics.checkParameterIsNotNull(chat, "chat");
        if (!chat.isMeeting() || !C34526a.m134090a(chat)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "dialog", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.v2.calendar.MeetingToChatPiece$e */
    public static final class DialogInterface$OnClickListenerC34877e implements DialogInterface.OnClickListener {

        /* renamed from: a */
        public static final DialogInterface$OnClickListenerC34877e f90047a = new DialogInterface$OnClickListenerC34877e();

        DialogInterface$OnClickListenerC34877e() {
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            CalendarHitPoint.f90049a.mo128686c();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "dialog", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.v2.calendar.MeetingToChatPiece$d */
    public static final class DialogInterface$OnClickListenerC34876d implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ MeetingToChatPiece f90046a;

        DialogInterface$OnClickListenerC34876d(MeetingToChatPiece meetingToChatPiece) {
            this.f90046a = meetingToChatPiece;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            this.f90046a.mo128674n();
            CalendarHitPoint.f90049a.mo128685b();
        }
    }
}
