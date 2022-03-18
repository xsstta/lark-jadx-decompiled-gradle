package com.ss.android.lark.calendar.impl.features.events.edit.part;

import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarSchemaCollection;
import com.ss.android.lark.calendar.impl.utils.SchemaHelper;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\bM\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\b\u0010S\u001a\u00020TH\u0002J\b\u0010U\u001a\u00020TH\u0002R\u001a\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\nR\u001a\u0010\u000e\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\b\"\u0004\b\u0010\u0010\nR\u001a\u0010\u0011\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\b\"\u0004\b\u0013\u0010\nR\u001a\u0010\u0014\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\b\"\u0004\b\u0016\u0010\nR\u001a\u0010\u0017\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\b\"\u0004\b\u0019\u0010\nR\u001a\u0010\u001a\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\b\"\u0004\b\u001c\u0010\nR\u001a\u0010\u001d\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\b\"\u0004\b\u001f\u0010\nR\u001a\u0010 \u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\b\"\u0004\b\"\u0010\nR\u001a\u0010#\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\b\"\u0004\b%\u0010\nR\u001a\u0010&\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\b\"\u0004\b(\u0010\nR\u001a\u0010)\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\b\"\u0004\b+\u0010\nR\u001a\u0010,\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\b\"\u0004\b.\u0010\nR\u001a\u0010/\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\b\"\u0004\b1\u0010\nR\u001a\u00102\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u0010\b\"\u0004\b4\u0010\nR\u001a\u00105\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u0010\b\"\u0004\b7\u0010\nR\u001a\u00108\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010\b\"\u0004\b:\u0010\nR\u001a\u0010;\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b<\u0010\b\"\u0004\b=\u0010\nR\u001a\u0010>\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b?\u0010\b\"\u0004\b@\u0010\nR\u001a\u0010A\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bB\u0010\b\"\u0004\bC\u0010\nR\u001a\u0010D\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bE\u0010\b\"\u0004\bF\u0010\nR\u001a\u0010G\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bH\u0010\b\"\u0004\bI\u0010\nR\u001a\u0010J\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bK\u0010\b\"\u0004\bL\u0010\nR\u001a\u0010M\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bN\u0010\b\"\u0004\bO\u0010\nR\u001a\u0010P\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bQ\u0010\b\"\u0004\bR\u0010\nR\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006V"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/part/EditSchemaUIVisible;", "", "schemaCollection", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarSchemaCollection;", "(Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarSchemaCollection;)V", "isAttachmentEditable", "", "isAttachmentEditable$calendar_impl_release", "()Z", "setAttachmentEditable$calendar_impl_release", "(Z)V", "isAttachmentShow", "isAttachmentShow$calendar_impl_release", "setAttachmentShow$calendar_impl_release", "isAttendeeEditable", "isAttendeeEditable$calendar_impl_release", "setAttendeeEditable$calendar_impl_release", "isAttendeeShow", "isAttendeeShow$calendar_impl_release", "setAttendeeShow$calendar_impl_release", "isCalendarEditable", "isCalendarEditable$calendar_impl_release", "setCalendarEditable$calendar_impl_release", "isCalendarShow", "isCalendarShow$calendar_impl_release", "setCalendarShow$calendar_impl_release", "isColorEditable", "isColorEditable$calendar_impl_release", "setColorEditable$calendar_impl_release", "isColorShow", "isColorShow$calendar_impl_release", "setColorShow$calendar_impl_release", "isDeleteShow", "isDeleteShow$calendar_impl_release", "setDeleteShow$calendar_impl_release", "isDescriptionEditable", "isDescriptionEditable$calendar_impl_release", "setDescriptionEditable$calendar_impl_release", "isDescriptionShow", "isDescriptionShow$calendar_impl_release", "setDescriptionShow$calendar_impl_release", "isFreeBusyEditable", "isFreeBusyEditable$calendar_impl_release", "setFreeBusyEditable$calendar_impl_release", "isFreeBusyShow", "isFreeBusyShow$calendar_impl_release", "setFreeBusyShow$calendar_impl_release", "isLocationEditable", "isLocationEditable$calendar_impl_release", "setLocationEditable$calendar_impl_release", "isLocationShow", "isLocationShow$calendar_impl_release", "setLocationShow$calendar_impl_release", "isMeetingRoomEditable", "isMeetingRoomEditable$calendar_impl_release", "setMeetingRoomEditable$calendar_impl_release", "isMeetingRoomShow", "isMeetingRoomShow$calendar_impl_release", "setMeetingRoomShow$calendar_impl_release", "isReminderEditable", "isReminderEditable$calendar_impl_release", "setReminderEditable$calendar_impl_release", "isReminderShow", "isReminderShow$calendar_impl_release", "setReminderShow$calendar_impl_release", "isRepeatEditable", "isRepeatEditable$calendar_impl_release", "setRepeatEditable$calendar_impl_release", "isRepeatShow", "isRepeatShow$calendar_impl_release", "setRepeatShow$calendar_impl_release", "isScopeEditable", "isScopeEditable$calendar_impl_release", "setScopeEditable$calendar_impl_release", "isScopeShow", "isScopeShow$calendar_impl_release", "setScopeShow$calendar_impl_release", "isSummaryEditable", "isSummaryEditable$calendar_impl_release", "setSummaryEditable$calendar_impl_release", "isTimeEditable", "isTimeEditable$calendar_impl_release", "setTimeEditable$calendar_impl_release", "refreshItemEditable", "", "refreshItemVisible", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.part.f */
public final class EditSchemaUIVisible {

    /* renamed from: a */
    private boolean f81325a = true;

    /* renamed from: b */
    private boolean f81326b = true;

    /* renamed from: c */
    private boolean f81327c = true;

    /* renamed from: d */
    private boolean f81328d = true;

    /* renamed from: e */
    private boolean f81329e = true;

    /* renamed from: f */
    private boolean f81330f = true;

    /* renamed from: g */
    private boolean f81331g = true;

    /* renamed from: h */
    private boolean f81332h = true;

    /* renamed from: i */
    private boolean f81333i = true;

    /* renamed from: j */
    private boolean f81334j = true;

    /* renamed from: k */
    private boolean f81335k = true;

    /* renamed from: l */
    private boolean f81336l = true;

    /* renamed from: m */
    private boolean f81337m = true;

    /* renamed from: n */
    private boolean f81338n = true;

    /* renamed from: o */
    private boolean f81339o = true;

    /* renamed from: p */
    private boolean f81340p = true;

    /* renamed from: q */
    private boolean f81341q = true;

    /* renamed from: r */
    private boolean f81342r = true;

    /* renamed from: s */
    private boolean f81343s = true;

    /* renamed from: t */
    private boolean f81344t = true;

    /* renamed from: u */
    private boolean f81345u = true;

    /* renamed from: v */
    private boolean f81346v = true;

    /* renamed from: w */
    private boolean f81347w = true;

    /* renamed from: x */
    private boolean f81348x = true;

    /* renamed from: y */
    private boolean f81349y;

    /* renamed from: z */
    private final CalendarSchemaCollection f81350z;

    /* renamed from: a */
    public final boolean mo116332a() {
        return this.f81325a;
    }

    /* renamed from: b */
    public final boolean mo116333b() {
        return this.f81326b;
    }

    /* renamed from: c */
    public final boolean mo116334c() {
        return this.f81327c;
    }

    /* renamed from: d */
    public final boolean mo116335d() {
        return this.f81328d;
    }

    /* renamed from: e */
    public final boolean mo116336e() {
        return this.f81329e;
    }

    /* renamed from: f */
    public final boolean mo116337f() {
        return this.f81330f;
    }

    /* renamed from: g */
    public final boolean mo116338g() {
        return this.f81331g;
    }

    /* renamed from: h */
    public final boolean mo116339h() {
        return this.f81332h;
    }

    /* renamed from: i */
    public final boolean mo116340i() {
        return this.f81333i;
    }

    /* renamed from: j */
    public final boolean mo116341j() {
        return this.f81334j;
    }

    /* renamed from: k */
    public final boolean mo116342k() {
        return this.f81335k;
    }

    /* renamed from: l */
    public final boolean mo116343l() {
        return this.f81336l;
    }

    /* renamed from: m */
    public final boolean mo116344m() {
        return this.f81337m;
    }

    /* renamed from: n */
    public final boolean mo116345n() {
        return this.f81338n;
    }

    /* renamed from: o */
    public final boolean mo116346o() {
        return this.f81339o;
    }

    /* renamed from: p */
    public final boolean mo116347p() {
        return this.f81340p;
    }

    /* renamed from: q */
    public final boolean mo116348q() {
        return this.f81341q;
    }

    /* renamed from: r */
    public final boolean mo116349r() {
        return this.f81342r;
    }

    /* renamed from: s */
    public final boolean mo116350s() {
        return this.f81343s;
    }

    /* renamed from: t */
    public final boolean mo116351t() {
        return this.f81344t;
    }

    /* renamed from: u */
    public final boolean mo116352u() {
        return this.f81345u;
    }

    /* renamed from: v */
    public final boolean mo116353v() {
        return this.f81346v;
    }

    /* renamed from: w */
    public final boolean mo116354w() {
        return this.f81347w;
    }

    /* renamed from: x */
    public final boolean mo116355x() {
        return this.f81348x;
    }

    /* renamed from: y */
    private final void m121235y() {
        boolean z;
        if (this.f81350z != null) {
            this.f81325a = SchemaHelper.f83746a.mo120313a("Attendee", this.f81350z);
            this.f81326b = SchemaHelper.f83746a.mo120313a("Calendar", this.f81350z);
            this.f81327c = SchemaHelper.f83746a.mo120313a("Color", this.f81350z);
            this.f81328d = SchemaHelper.f83746a.mo120313a("Scope", this.f81350z);
            this.f81329e = SchemaHelper.f83746a.mo120313a("FreeBusy", this.f81350z);
            this.f81330f = SchemaHelper.f83746a.mo120313a("Reminder", this.f81350z);
            this.f81333i = SchemaHelper.f83746a.mo120313a("Rrule", this.f81350z);
            this.f81336l = SchemaHelper.f83746a.mo120313a("DeleteIcon", this.f81350z);
            String c = SchemaHelper.f83746a.mo120316c("DeleteIcon", this.f81350z);
            if (c == null || c.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                this.f81336l = false;
            }
        }
    }

    /* renamed from: z */
    private final void m121236z() {
        if (this.f81350z != null) {
            this.f81337m = SchemaHelper.f83746a.mo120315b("Title", this.f81350z);
            this.f81338n = SchemaHelper.f83746a.mo120315b("Time", this.f81350z);
            this.f81339o = SchemaHelper.f83746a.mo120315b("Attendee", this.f81350z);
            this.f81340p = SchemaHelper.f83746a.mo120315b("Calendar", this.f81350z);
            this.f81341q = SchemaHelper.f83746a.mo120315b("Color", this.f81350z);
            this.f81342r = SchemaHelper.f83746a.mo120315b("Scope", this.f81350z);
            this.f81343s = SchemaHelper.f83746a.mo120315b("FreeBusy", this.f81350z);
            this.f81344t = SchemaHelper.f83746a.mo120315b("Reminder", this.f81350z);
            this.f81345u = SchemaHelper.f83746a.mo120315b("MeetingRoom", this.f81350z);
            this.f81346v = SchemaHelper.f83746a.mo120315b("Location", this.f81350z);
            this.f81347w = SchemaHelper.f83746a.mo120315b("Rrule", this.f81350z);
            this.f81348x = SchemaHelper.f83746a.mo120315b("Description", this.f81350z);
            this.f81349y = SchemaHelper.f83746a.mo120315b("Attachment", this.f81350z);
        }
    }

    public EditSchemaUIVisible(CalendarSchemaCollection calendarSchemaCollection) {
        this.f81350z = calendarSchemaCollection;
        m121235y();
        m121236z();
    }
}
