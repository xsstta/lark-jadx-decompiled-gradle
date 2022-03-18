package com.ss.android.lark.calendar.impl.features.events.edit.part;

import com.ss.android.lark.calendar.impl.features.events.edit.part.EditEventUIVisible;
import com.ss.android.lark.calendar.p1430a.C30022a;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\r\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0016\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\b0\u000bj\b\u0012\u0004\u0012\u00020\b`\fJ\u0016\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\b0\u000bj\b\u0012\u0004\u0012\u00020\b`\fJ\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u000fJ\u0006\u0010\u0012\u001a\u00020\bJ\u0006\u0010\u0013\u001a\u00020\bJ\u0006\u0010\u0014\u001a\u00020\bJ\u0006\u0010\u0015\u001a\u00020\bJ\u0006\u0010\u0016\u001a\u00020\u0017J\u0006\u0010\u0018\u001a\u00020\bJ\u0006\u0010\u0019\u001a\u00020\bJ\u0006\u0010\u001a\u001a\u00020\bJ\u0006\u0010\u001b\u001a\u00020\bJ\u0006\u0010\u001c\u001a\u00020\bJ\u0006\u0010\u001d\u001a\u00020\bJ\u0006\u0010\u001e\u001a\u00020\bJ\u0006\u0010\u001f\u001a\u00020\bJ\u0006\u0010 \u001a\u00020\bJ\u0006\u0010!\u001a\u00020\bJ\u0006\u0010\"\u001a\u00020\bJ\u0006\u0010#\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000¨\u0006$"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/part/EditViewPartVisible;", "", "eventSchema", "Lcom/ss/android/lark/calendar/impl/features/events/edit/part/EditSchemaUIVisible;", "eventUIVisible", "Lcom/ss/android/lark/calendar/impl/features/events/edit/part/EditEventUIVisible;", "(Lcom/ss/android/lark/calendar/impl/features/events/edit/part/EditSchemaUIVisible;Lcom/ss/android/lark/calendar/impl/features/events/edit/part/EditEventUIVisible;)V", "mIsAttachmentShow", "", "mIsDescriptionShow", "getCalendarFourItemEditableList", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "getCalendarFourItemShowList", "getRepeatUIState", "Lkotlin/Pair;", "Lcom/ss/android/lark/calendar/impl/features/events/edit/part/EditEventUIVisible$EditUIState;", "Lcom/ss/android/lark/calendar/impl/features/events/edit/part/EditEventUIVisible$DisableReason;", "isAttachmentEditable", "isAttachmentShow", "isAttendeeEditable", "isAttendeeShow", "isDeleteShow", "", "isDescriptionEditable", "isDescriptionShow", "isLocationEditable", "isLocationShow", "isMeetingRoomEditable", "isMeetingRoomShow", "isReminderEditable", "isReminderShow", "isRepeatEditable", "isRepeatShow", "isSummaryEditable", "isTimeEditable", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.part.h */
public final class EditViewPartVisible {

    /* renamed from: a */
    private final boolean f81363a = C30022a.f74886e.mo112722b();

    /* renamed from: b */
    private final boolean f81364b = C30022a.f74886e.mo112723c();

    /* renamed from: c */
    private final EditSchemaUIVisible f81365c;

    /* renamed from: d */
    private final EditEventUIVisible f81366d;

    /* renamed from: o */
    public final boolean mo116392o() {
        return false;
    }

    /* renamed from: e */
    public final boolean mo116382e() {
        return this.f81365c.mo116337f();
    }

    /* renamed from: f */
    public final boolean mo116383f() {
        return this.f81365c.mo116351t();
    }

    /* renamed from: g */
    public final boolean mo116384g() {
        return this.f81365c.mo116339h();
    }

    /* renamed from: i */
    public final boolean mo116386i() {
        return this.f81365c.mo116338g();
    }

    /* renamed from: k */
    public final boolean mo116388k() {
        return this.f81365c.mo116340i();
    }

    /* renamed from: l */
    public final boolean mo116389l() {
        if (!this.f81365c.mo116341j() || !this.f81363a) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final boolean mo116378a() {
        if (!this.f81365c.mo116344m() || this.f81366d.mo116208a()) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public final boolean mo116379b() {
        if (!this.f81365c.mo116345n() || this.f81366d.mo116212e()) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public final boolean mo116380c() {
        if (!this.f81365c.mo116332a() || this.f81366d.mo116210c()) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public final boolean mo116381d() {
        if (!this.f81365c.mo116346o() || this.f81366d.mo116211d()) {
            return false;
        }
        return true;
    }

    /* renamed from: h */
    public final boolean mo116385h() {
        if (!this.f81365c.mo116353v() || this.f81366d.mo116214g()) {
            return false;
        }
        return true;
    }

    /* renamed from: j */
    public final boolean mo116387j() {
        if (!this.f81365c.mo116352u() || this.f81366d.mo116213f()) {
            return false;
        }
        return true;
    }

    /* renamed from: m */
    public final boolean mo116390m() {
        if (!this.f81365c.mo116355x() || this.f81366d.mo116215h()) {
            return false;
        }
        return true;
    }

    /* renamed from: n */
    public final boolean mo116391n() {
        if (!this.f81365c.mo116342k() || this.f81366d.mo116217j() || !this.f81364b) {
            return false;
        }
        return true;
    }

    /* renamed from: p */
    public final int mo116393p() {
        if (this.f81365c.mo116343l()) {
            return this.f81366d.mo116209b();
        }
        return 0;
    }

    /* renamed from: s */
    public final Pair<EditEventUIVisible.EditUIState, EditEventUIVisible.DisableReason> mo116396s() {
        if (!this.f81365c.mo116354w()) {
            return TuplesKt.to(EditEventUIVisible.EditUIState.GONE, EditEventUIVisible.DisableReason.SPECIAL_SCHEMA);
        }
        return this.f81366d.mo116219l();
    }

    /* renamed from: q */
    public final ArrayList<Boolean> mo116394q() {
        boolean z;
        ArrayList<Boolean> arrayList = new ArrayList<>();
        if (!this.f81365c.mo116333b() || this.f81366d.mo116216i()) {
            z = false;
        } else {
            z = true;
        }
        arrayList.add(Boolean.valueOf(z));
        arrayList.add(Boolean.valueOf(this.f81365c.mo116334c()));
        arrayList.add(Boolean.valueOf(this.f81365c.mo116335d()));
        arrayList.add(Boolean.valueOf(this.f81365c.mo116336e()));
        return arrayList;
    }

    /* renamed from: r */
    public final ArrayList<Boolean> mo116395r() {
        boolean z;
        ArrayList<Boolean> arrayList = new ArrayList<>();
        arrayList.add(Boolean.valueOf(this.f81365c.mo116347p()));
        if (!this.f81365c.mo116348q() || !this.f81366d.mo116218k()) {
            z = false;
        } else {
            z = true;
        }
        arrayList.add(Boolean.valueOf(z));
        arrayList.add(Boolean.valueOf(this.f81365c.mo116349r()));
        arrayList.add(Boolean.valueOf(this.f81365c.mo116350s()));
        return arrayList;
    }

    public EditViewPartVisible(EditSchemaUIVisible fVar, EditEventUIVisible editEventUIVisible) {
        Intrinsics.checkParameterIsNotNull(fVar, "eventSchema");
        Intrinsics.checkParameterIsNotNull(editEventUIVisible, "eventUIVisible");
        this.f81365c = fVar;
        this.f81366d = editEventUIVisible;
    }
}
