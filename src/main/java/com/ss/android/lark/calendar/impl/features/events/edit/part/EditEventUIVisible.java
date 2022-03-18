package com.ss.android.lark.calendar.impl.features.events.edit.part;

import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b-\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0002FGBq\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0016\u0010\r\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\u0002\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001e\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u001b\"\u0004\b \u0010\u001dR\u001a\u0010!\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u001b\"\u0004\b#\u0010\u001dR\u001a\u0010$\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u001b\"\u0004\b&\u0010\u001dR\u001a\u0010'\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u001b\"\u0004\b)\u0010\u001dR\u001a\u0010*\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u001b\"\u0004\b,\u0010\u001dR\u001a\u0010-\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u001b\"\u0004\b/\u0010\u001dR\u001a\u00100\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u001b\"\u0004\b2\u0010\u001dR\u001a\u00103\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\u001b\"\u0004\b5\u0010\u001dR\u001a\u00106\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u0010\u001b\"\u0004\b8\u0010\u001dR\u001a\u00109\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010\u001b\"\u0004\b;\u0010\u001dR\u001a\u0010<\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010\u001b\"\u0004\b>\u0010\u001dR(\u0010?\u001a\u0010\u0012\u0004\u0012\u00020@\u0012\u0006\u0012\u0004\u0018\u00010A0\u000eX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bB\u0010C\"\u0004\bD\u0010E¨\u0006H"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/part/EditEventUIVisible;", "", "editType", "", "isLocalEvent", "", "isGoogleEvent", "isExchangeEvent", "isExceptionEvent", "guestCanInvite", "guestCanSeeOtherGuests", "isAttendeeEmpty", "isAllDay", "resourceNeedApprovalType", "Lkotlin/Pair;", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/helper/NeedApprovalType;", "", "deletable", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEvent$Deletable;", "(IZZZZZZZZLkotlin/Pair;Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEvent$Deletable;)V", "deleteBtnType", "getDeleteBtnType$calendar_impl_release", "()I", "setDeleteBtnType$calendar_impl_release", "(I)V", "isColorEditable", "isColorEditable$calendar_impl_release", "()Z", "setColorEditable$calendar_impl_release", "(Z)V", "isDisableAttendeeSelect", "isDisableAttendeeSelect$calendar_impl_release", "setDisableAttendeeSelect$calendar_impl_release", "isDisableColor", "isDisableColor$calendar_impl_release", "setDisableColor$calendar_impl_release", "isDisableDateSelect", "isDisableDateSelect$calendar_impl_release", "setDisableDateSelect$calendar_impl_release", "isDisableDeleteAttachment", "isDisableDeleteAttachment$calendar_impl_release", "setDisableDeleteAttachment$calendar_impl_release", "isDisableDescription", "isDisableDescription$calendar_impl_release", "setDisableDescription$calendar_impl_release", "isDisableLocation", "isDisableLocation$calendar_impl_release", "setDisableLocation$calendar_impl_release", "isDisableMeetingRoom", "isDisableMeetingRoom$calendar_impl_release", "setDisableMeetingRoom$calendar_impl_release", "isDisableSummaryEdit", "isDisableSummaryEdit$calendar_impl_release", "setDisableSummaryEdit$calendar_impl_release", "isHideAttachmentView", "isHideAttachmentView$calendar_impl_release", "setHideAttachmentView$calendar_impl_release", "isHideAttendeeView", "isHideAttendeeView$calendar_impl_release", "setHideAttendeeView$calendar_impl_release", "isRemoveCalendarView", "isRemoveCalendarView$calendar_impl_release", "setRemoveCalendarView$calendar_impl_release", "repeatUIState", "Lcom/ss/android/lark/calendar/impl/features/events/edit/part/EditEventUIVisible$EditUIState;", "Lcom/ss/android/lark/calendar/impl/features/events/edit/part/EditEventUIVisible$DisableReason;", "getRepeatUIState$calendar_impl_release", "()Lkotlin/Pair;", "setRepeatUIState$calendar_impl_release", "(Lkotlin/Pair;)V", "DisableReason", "EditUIState", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class EditEventUIVisible {

    /* renamed from: a */
    private boolean f81260a;

    /* renamed from: b */
    private int f81261b;

    /* renamed from: c */
    private boolean f81262c;

    /* renamed from: d */
    private boolean f81263d;

    /* renamed from: e */
    private boolean f81264e;

    /* renamed from: f */
    private boolean f81265f;

    /* renamed from: g */
    private boolean f81266g;

    /* renamed from: h */
    private boolean f81267h;

    /* renamed from: i */
    private boolean f81268i;

    /* renamed from: j */
    private boolean f81269j;

    /* renamed from: k */
    private boolean f81270k;

    /* renamed from: l */
    private boolean f81271l;

    /* renamed from: m */
    private boolean f81272m = true;

    /* renamed from: n */
    private Pair<? extends EditUIState, ? extends DisableReason> f81273n = TuplesKt.to(EditUIState.SHOW, null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/part/EditEventUIVisible$EditUIState;", "", "(Ljava/lang/String;I)V", "GONE", "DISABLE", "SHOW", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    public enum EditUIState {
        GONE,
        DISABLE,
        SHOW
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000b\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/part/EditEventUIVisible$DisableReason;", "", "(Ljava/lang/String;I)V", "limitedDuration", "", "getLimitedDuration", "()Ljava/lang/Long;", "setLimitedDuration", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "TOTAL_APPROVAL", "TIME_LIMITED_APPROVAL", "PART_EDIT", "EXCEPTION_EVENT", "SPECIAL_SCHEMA", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    public enum DisableReason {
        TOTAL_APPROVAL,
        TIME_LIMITED_APPROVAL,
        PART_EDIT,
        EXCEPTION_EVENT,
        SPECIAL_SCHEMA;
        
        private Long limitedDuration;

        public final Long getLimitedDuration() {
            return this.limitedDuration;
        }

        public final void setLimitedDuration(Long l) {
            this.limitedDuration = l;
        }
    }

    /* renamed from: a */
    public final boolean mo116208a() {
        return this.f81260a;
    }

    /* renamed from: b */
    public final int mo116209b() {
        return this.f81261b;
    }

    /* renamed from: c */
    public final boolean mo116210c() {
        return this.f81262c;
    }

    /* renamed from: d */
    public final boolean mo116211d() {
        return this.f81263d;
    }

    /* renamed from: e */
    public final boolean mo116212e() {
        return this.f81264e;
    }

    /* renamed from: f */
    public final boolean mo116213f() {
        return this.f81265f;
    }

    /* renamed from: g */
    public final boolean mo116214g() {
        return this.f81266g;
    }

    /* renamed from: h */
    public final boolean mo116215h() {
        return this.f81267h;
    }

    /* renamed from: i */
    public final boolean mo116216i() {
        return this.f81269j;
    }

    /* renamed from: j */
    public final boolean mo116217j() {
        return this.f81270k;
    }

    /* renamed from: k */
    public final boolean mo116218k() {
        return this.f81272m;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: kotlin.Pair<? extends com.ss.android.lark.calendar.impl.features.events.edit.part.EditEventUIVisible$EditUIState, ? extends com.ss.android.lark.calendar.impl.features.events.edit.part.EditEventUIVisible$DisableReason>, kotlin.Pair<com.ss.android.lark.calendar.impl.features.events.edit.part.EditEventUIVisible$EditUIState, com.ss.android.lark.calendar.impl.features.events.edit.part.EditEventUIVisible$DisableReason> */
    /* renamed from: l */
    public final Pair<EditUIState, DisableReason> mo116219l() {
        return this.f81273n;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0071  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public EditEventUIVisible(int r10, boolean r11, boolean r12, boolean r13, boolean r14, boolean r15, boolean r16, boolean r17, boolean r18, kotlin.Pair<? extends com.ss.android.lark.calendar.impl.features.meetingroom.helper.NeedApprovalType, java.lang.Long> r19, com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEvent.Deletable r20) {
        /*
        // Method dump skipped, instructions count: 265
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.calendar.impl.features.events.edit.part.EditEventUIVisible.<init>(int, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, kotlin.Pair, com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEvent$Deletable):void");
    }
}
