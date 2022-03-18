package com.ss.android.lark.calendar.impl.features.arrange.arrangetime.laucher;

import android.app.Activity;
import android.os.Bundle;
import com.ss.android.lark.calendar.impl.features.arrange.arrangetime.ArrangeActivity;
import com.ss.android.lark.calendar.impl.features.calendarview.CalendarDate;
import com.ss.android.lark.calendar.impl.features.events.edit.EditActivityEntrance;
import com.ss.android.lark.calendar.p1430a.C30022a;
import java.util.ArrayList;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u0000 72\u00020\u0001:\u00017Bg\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0016\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u00050\bj\b\u0012\u0004\u0012\u00020\u0005`\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u0011¢\u0006\u0002\u0010\u0012J\b\u0010/\u001a\u000200H\u0002J\b\u00101\u001a\u000202H\u0002J\b\u00103\u001a\u000202H\u0002J\b\u00104\u001a\u00020\u000eH\u0002J\u0006\u00105\u001a\u000202J\b\u00106\u001a\u000202H\u0002R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR*\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u00050\bj\b\u0012\u0004\u0012\u00020\u0005`\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001a\u0010\f\u001a\u00020\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001a\u0010\r\u001a\u00020\u000eX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010#\"\u0004\b$\u0010%R\u001a\u0010\u000f\u001a\u00020\u000eX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010#\"\u0004\b&\u0010%R\u001a\u0010\u0010\u001a\u00020\u0011X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u001a\u0010\n\u001a\u00020\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010 \"\u0004\b,\u0010\"R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u0018\"\u0004\b.\u0010\u001a¨\u00068"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/arrange/arrangetime/laucher/ArrangeMeetingLauncher;", "", "activity", "Landroid/app/Activity;", "chatId", "", "summary", "chatterIds", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "startTime", "", "endTime", "isAtAll", "", "isMeeting", "preferredScene", "Lcom/ss/android/lark/calendar/impl/features/arrange/arrangetime/laucher/Scene;", "(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;JJZZLcom/ss/android/lark/calendar/impl/features/arrange/arrangetime/laucher/Scene;)V", "getActivity", "()Landroid/app/Activity;", "setActivity", "(Landroid/app/Activity;)V", "getChatId", "()Ljava/lang/String;", "setChatId", "(Ljava/lang/String;)V", "getChatterIds", "()Ljava/util/ArrayList;", "setChatterIds", "(Ljava/util/ArrayList;)V", "getEndTime", "()J", "setEndTime", "(J)V", "()Z", "setAtAll", "(Z)V", "setMeeting", "getPreferredScene", "()Lcom/ss/android/lark/calendar/impl/features/arrange/arrangetime/laucher/Scene;", "setPreferredScene", "(Lcom/ss/android/lark/calendar/impl/features/arrange/arrangetime/laucher/Scene;)V", "getStartTime", "setStartTime", "getSummary", "setSummary", "getBundleForArrangeTimeActivity", "Landroid/os/Bundle;", "gotoEditActivity", "", "initEndTime", "isTimeCrossDay", "startArrangeMeeting", "startArrangeTimeActivity", "Companion", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.arrange.arrangetime.laucher.b */
public final class ArrangeMeetingLauncher {

    /* renamed from: a */
    public static final Companion f75448a = new Companion(null);

    /* renamed from: b */
    private Activity f75449b;

    /* renamed from: c */
    private String f75450c;

    /* renamed from: d */
    private String f75451d;

    /* renamed from: e */
    private ArrayList<String> f75452e;

    /* renamed from: f */
    private long f75453f;

    /* renamed from: g */
    private long f75454g;

    /* renamed from: h */
    private boolean f75455h;

    /* renamed from: i */
    private boolean f75456i;

    /* renamed from: j */
    private Scene f75457j;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/arrange/arrangetime/laucher/ArrangeMeetingLauncher$Companion;", "", "()V", "MAX_ARRANGE_SIZE", "", "TAG", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.arrange.arrangetime.laucher.b$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: b */
    private final void m112096b() {
        long j = this.f75454g;
        if (j == -1 || j < this.f75453f) {
            this.f75454g = this.f75453f + ((long) (C30022a.f74884c.mo108456c().getDefaultEventDuration() * 60));
        }
    }

    /* renamed from: c */
    private final boolean m112097c() {
        if (new CalendarDate(new Date(this.f75453f)).getJulianDay() != new CalendarDate(new Date(this.f75454g)).getJulianDay()) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    private final void m112098d() {
        ArrayList<String> arrayList;
        ArrayList<String> arrayList2;
        ArrayList<String> arrayList3 = null;
        if (!this.f75455h || this.f75456i) {
            arrayList2 = arrayList3;
            arrayList = this.f75452e;
        } else {
            ArrayList<String> arrayList4 = new ArrayList<>();
            arrayList4.add(this.f75450c);
            arrayList = arrayList3;
            arrayList2 = arrayList4;
        }
        EditActivityEntrance.Companion aVar = EditActivityEntrance.f79940a;
        Activity activity = this.f75449b;
        long j = this.f75453f;
        long j2 = this.f75454g;
        String str = this.f75450c;
        String str2 = this.f75451d;
        if (str2 == null) {
            str2 = "";
        }
        aVar.mo114664a(activity, j, j2, str, arrayList2, arrayList, str2);
    }

    /* renamed from: e */
    private final void m112099e() {
        boolean z;
        ArrayList<String> arrayList = this.f75452e;
        if (arrayList == null || arrayList.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            C30022a.f74882a.appRouter().mo108210a(ArrangeActivity.class).mo108151a(m112100f()).mo108156b(this.f75449b);
        }
    }

    /* renamed from: f */
    private final Bundle m112100f() {
        Bundle bundle = new Bundle();
        bundle.putInt("calendar_arrange_source", 3);
        bundle.putLong("event_start_time", this.f75453f);
        bundle.putStringArrayList("calendar_arrange_selected_chatter_ids", this.f75452e);
        bundle.putString("chat_id", this.f75450c);
        bundle.putString("event_summary", this.f75451d);
        bundle.putBoolean("calendar_is_meeting_chat", this.f75456i);
        bundle.putBoolean("calendar_arrange_meeting_is_at_all", this.f75455h);
        long j = this.f75454g;
        if (j != -1) {
            bundle.putLong("event_end_time", j);
        }
        return bundle;
    }

    /* renamed from: a */
    public final void mo108973a() {
        boolean z;
        if (this.f75450c.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            m112096b();
            if (this.f75452e.size() > 30 || m112097c()) {
                m112098d();
                return;
            }
            int i = C30207c.f75458a[this.f75457j.ordinal()];
            if (i == 1) {
                m112098d();
            } else if (i == 2) {
                m112099e();
            }
        }
    }

    public ArrangeMeetingLauncher(Activity activity, String str, String str2, ArrayList<String> arrayList, long j, long j2, boolean z, boolean z2, Scene scene) {
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        Intrinsics.checkParameterIsNotNull(str, "chatId");
        Intrinsics.checkParameterIsNotNull(arrayList, "chatterIds");
        Intrinsics.checkParameterIsNotNull(scene, "preferredScene");
        this.f75449b = activity;
        this.f75450c = str;
        this.f75451d = str2;
        this.f75452e = arrayList;
        this.f75453f = j;
        this.f75454g = j2;
        this.f75455h = z;
        this.f75456i = z2;
        this.f75457j = scene;
    }
}
