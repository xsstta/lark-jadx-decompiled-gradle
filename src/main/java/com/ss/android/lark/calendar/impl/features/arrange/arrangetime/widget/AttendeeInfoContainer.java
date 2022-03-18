package com.ss.android.lark.calendar.impl.features.arrange.arrangetime.widget;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.huawei.hms.location.LocationRequest;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.arrange.arrangetime.widget.AttendeeInfoView;
import com.ss.android.lark.calendar.impl.features.arrange.p1441a.AbstractC30095b;
import com.ss.android.lark.calendar.impl.features.calendarview.CalendarDate;
import com.ss.android.lark.calendar.impl.framework.hitpoint.event.GeneralHitPoint;
import com.ss.android.lark.calendar.impl.utils.C32634ae;
import com.ss.android.lark.calendar.impl.utils.C32646c;
import com.ss.android.lark.calendar.impl.utils.ao;
import com.ss.android.lark.calendar.p1430a.C30022a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0013\u0018\u00002\u00020\u0001:\u00012B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nB)\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0002\u0010\fJ\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\tJ\u000e\u0010\u001d\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\tJ\"\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u001f\u001a\u00020 2\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00140\u0013J\u0016\u0010\"\u001a\u0012\u0012\u0004\u0012\u00020\u00140\u000fj\b\u0012\u0004\u0012\u00020\u0014`\u0011J\u0010\u0010#\u001a\u00020\t2\u0006\u0010$\u001a\u00020\u0014H\u0002J\u0006\u0010%\u001a\u00020\u0019J\u0006\u0010&\u001a\u00020\u0019J\u000e\u0010'\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\tJ\u0006\u0010(\u001a\u00020\u0019JN\u0010)\u001a\u00020\u00192\u0016\u0010*\u001a\u0012\u0012\u0004\u0012\u00020\u00140\u000fj\b\u0012\u0004\u0012\u00020\u0014`\u00112\u0016\u0010+\u001a\u0012\u0012\u0004\u0012\u00020\u00140\u000fj\b\u0012\u0004\u0012\u00020\u0014`\u00112\u0016\u0010,\u001a\u0012\u0012\u0004\u0012\u00020\u00140\u000fj\b\u0012\u0004\u0012\u00020\u0014`\u0011J\u000e\u0010-\u001a\u00020\u00192\u0006\u0010.\u001a\u00020\u0017J\u000e\u0010/\u001a\u00020\u00192\u0006\u00100\u001a\u00020\tJ\u0006\u00101\u001a\u00020\u0019R\u000e\u0010\r\u001a\u00020\tXD¢\u0006\u0002\n\u0000R\u001e\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u00100\u000fj\b\u0012\u0004\u0012\u00020\u0010`\u0011X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00140\u0013X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u000e¢\u0006\u0002\n\u0000¨\u00063"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/arrange/arrangetime/widget/AttendeeInfoContainer;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "ANIM_DURATION", "mAttendeeInfoViews", "Ljava/util/ArrayList;", "Lcom/ss/android/lark/calendar/impl/features/arrange/arrangetime/widget/AttendeeInfoView;", "Lkotlin/collections/ArrayList;", "mAttendeeTimeZone", "", "", "mCurMarginLeft", "mToLeftListener", "Lcom/ss/android/lark/calendar/impl/features/arrange/arrangetime/widget/AttendeeInfoContainer$ToLeftListener;", "addAvatarNameView", "", "attendee", "Lcom/ss/android/lark/calendar/impl/features/arrange/base/IArrangeBaseData;", "width", "addSelectChatterView", "bindAttendeeTimeZone", "startTime", "", "attendeeTimeZone", "getAllAttendeeCalendarId", "getClickIndex", "calendarId", "hideAllAttendeeIcon", "hideAllToLeftArrow", "refreshView", "resetAllViews", "setAttendeeBusyIcon", "busyCalendarIds", "outWorkHourCalendarIds", "bothConflictCalendarIds", "setToLeftListener", "listener", "setViewToLeft", "targetIndex", "showCurrentTime", "ToLeftListener", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class AttendeeInfoContainer extends FrameLayout {

    /* renamed from: a */
    public final ArrayList<AttendeeInfoView> f75464a;

    /* renamed from: b */
    public ToLeftListener f75465b;

    /* renamed from: c */
    private final int f75466c;

    /* renamed from: d */
    private int f75467d;

    /* renamed from: e */
    private Map<String, String> f75468e;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/arrange/arrangetime/widget/AttendeeInfoContainer$ToLeftListener;", "", "onClickAdd", "", "onToLeft", "targetIndex", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.arrange.arrangetime.widget.AttendeeInfoContainer$a */
    public interface ToLeftListener {
        /* renamed from: a */
        void mo108954a();

        /* renamed from: a */
        void mo108955a(int i);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\b"}, d2 = {"com/ss/android/lark/calendar/impl/features/arrange/arrangetime/widget/AttendeeInfoContainer$addSelectChatterView$1", "Lcom/ss/android/lark/calendar/impl/features/arrange/arrangetime/widget/AttendeeInfoView$ClickLeftListener;", "onAddAttendeeClick", "", "onAvatarClick", "calendarId", "", "onToLeftClick", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.arrange.arrangetime.widget.AttendeeInfoContainer$c */
    public static final class C30209c implements AttendeeInfoView.ClickLeftListener {

        /* renamed from: a */
        final /* synthetic */ AttendeeInfoContainer f75470a;

        @Override // com.ss.android.lark.calendar.impl.features.arrange.arrangetime.widget.AttendeeInfoView.ClickLeftListener
        /* renamed from: a */
        public void mo109007a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "calendarId");
        }

        @Override // com.ss.android.lark.calendar.impl.features.arrange.arrangetime.widget.AttendeeInfoView.ClickLeftListener
        /* renamed from: b */
        public void mo109008b(String str) {
            Intrinsics.checkParameterIsNotNull(str, "calendarId");
        }

        @Override // com.ss.android.lark.calendar.impl.features.arrange.arrangetime.widget.AttendeeInfoView.ClickLeftListener
        /* renamed from: a */
        public void mo109006a() {
            ToLeftListener aVar = this.f75470a.f75465b;
            if (aVar != null) {
                aVar.mo108954a();
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C30209c(AttendeeInfoContainer attendeeInfoContainer) {
            this.f75470a = attendeeInfoContainer;
        }
    }

    /* renamed from: b */
    public final void mo109000b() {
        removeAllViews();
        this.f75464a.clear();
        this.f75467d = 0;
    }

    /* renamed from: d */
    public final void mo109002d() {
        mo108997a(System.currentTimeMillis() / ((long) 1000), this.f75468e);
    }

    /* renamed from: c */
    public final void mo109001c() {
        Iterator<T> it = this.f75464a.iterator();
        while (it.hasNext()) {
            it.next().mo109017e();
        }
    }

    /* renamed from: a */
    public final void mo108995a() {
        Iterator<AttendeeInfoView> it = this.f75464a.iterator();
        while (it.hasNext()) {
            it.next().mo109014b();
        }
    }

    public final ArrayList<String> getAllAttendeeCalendarId() {
        ArrayList<String> arrayList = new ArrayList<>();
        Iterator<T> it = this.f75464a.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getCalednarId());
        }
        return arrayList;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\b"}, d2 = {"com/ss/android/lark/calendar/impl/features/arrange/arrangetime/widget/AttendeeInfoContainer$addAvatarNameView$1", "Lcom/ss/android/lark/calendar/impl/features/arrange/arrangetime/widget/AttendeeInfoView$ClickLeftListener;", "onAddAttendeeClick", "", "onAvatarClick", "calendarId", "", "onToLeftClick", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.arrange.arrangetime.widget.AttendeeInfoContainer$b */
    public static final class C30208b implements AttendeeInfoView.ClickLeftListener {

        /* renamed from: a */
        final /* synthetic */ AttendeeInfoContainer f75469a;

        @Override // com.ss.android.lark.calendar.impl.features.arrange.arrangetime.widget.AttendeeInfoView.ClickLeftListener
        /* renamed from: a */
        public void mo109006a() {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C30208b(AttendeeInfoContainer attendeeInfoContainer) {
            this.f75469a = attendeeInfoContainer;
        }

        @Override // com.ss.android.lark.calendar.impl.features.arrange.arrangetime.widget.AttendeeInfoView.ClickLeftListener
        /* renamed from: a */
        public void mo109007a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "calendarId");
            int a = this.f75469a.mo108994a(str);
            if (a > 0 && a < this.f75469a.f75464a.size()) {
                ToLeftListener aVar = this.f75469a.f75465b;
                if (aVar != null) {
                    aVar.mo108955a(a);
                }
                this.f75469a.setViewToLeft(a);
            }
        }

        @Override // com.ss.android.lark.calendar.impl.features.arrange.arrangetime.widget.AttendeeInfoView.ClickLeftListener
        /* renamed from: b */
        public void mo109008b(String str) {
            Intrinsics.checkParameterIsNotNull(str, "calendarId");
            int a = this.f75469a.mo108994a(str);
            if (a <= 0 || a >= this.f75469a.f75464a.size()) {
                this.f75469a.mo108995a();
            } else {
                GeneralHitPoint.m124192a("on");
            }
        }
    }

    public final void setToLeftListener(ToLeftListener aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "listener");
        this.f75465b = aVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public AttendeeInfoContainer(Context context) {
        this(context, null);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* renamed from: a */
    public final int mo108994a(String str) {
        Iterator<AttendeeInfoView> it = this.f75464a.iterator();
        int i = -1;
        while (it.hasNext()) {
            i++;
            if (str.equals(it.next().getCalednarId())) {
                break;
            }
        }
        return i;
    }

    /* renamed from: a */
    public final void mo108996a(int i) {
        Context context = getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "context");
        AttendeeInfoView attendeeInfoView = new AttendeeInfoView(context);
        attendeeInfoView.mo109018f();
        addView(attendeeInfoView);
        ViewGroup.LayoutParams layoutParams = attendeeInfoView.getLayoutParams();
        if (layoutParams != null) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            layoutParams2.width = i;
            layoutParams2.leftMargin = this.f75467d;
            attendeeInfoView.setLayoutParams(layoutParams2);
            this.f75467d += i;
            attendeeInfoView.setClickListener(new C30209c(this));
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
    }

    public final void setViewToLeft(int i) {
        AttendeeInfoView attendeeInfoView = this.f75464a.get(i);
        Intrinsics.checkExpressionValueIsNotNull(attendeeInfoView, "mAttendeeInfoViews[targetIndex]");
        AttendeeInfoView attendeeInfoView2 = attendeeInfoView;
        this.f75464a.remove(i);
        this.f75464a.add(0, attendeeInfoView2);
        ao.m125224a(attendeeInfoView2, 0, (long) this.f75466c);
        ViewGroup.LayoutParams layoutParams = attendeeInfoView2.getLayoutParams();
        if (layoutParams != null) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            int i2 = 1;
            if (1 <= i) {
                while (true) {
                    AttendeeInfoView attendeeInfoView3 = this.f75464a.get(i2);
                    Intrinsics.checkExpressionValueIsNotNull(attendeeInfoView3, "mAttendeeInfoViews[i]");
                    AttendeeInfoView attendeeInfoView4 = attendeeInfoView3;
                    ViewGroup.LayoutParams layoutParams3 = attendeeInfoView4.getLayoutParams();
                    if (layoutParams3 != null) {
                        FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) layoutParams3;
                        int i3 = layoutParams4.width;
                        layoutParams4.leftMargin += layoutParams2.width;
                        layoutParams4.width = i3;
                        attendeeInfoView4.setLayoutParams(layoutParams4);
                        if (i2 != i) {
                            i2++;
                        } else {
                            return;
                        }
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                    }
                }
            }
        } else {
            throw new TypeCastException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public AttendeeInfoContainer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* renamed from: a */
    public final void mo108998a(AbstractC30095b bVar, int i) {
        Intrinsics.checkParameterIsNotNull(bVar, "attendee");
        Context context = getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "context");
        AttendeeInfoView attendeeInfoView = new AttendeeInfoView(context);
        attendeeInfoView.mo109011a(bVar);
        addView(attendeeInfoView);
        ViewGroup.LayoutParams layoutParams = attendeeInfoView.getLayoutParams();
        if (layoutParams != null) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            layoutParams2.width = i;
            layoutParams2.leftMargin = this.f75467d;
            attendeeInfoView.setLayoutParams(layoutParams2);
            this.f75467d += i;
            attendeeInfoView.setClickListener(new C30208b(this));
            this.f75464a.add(attendeeInfoView);
            if (CollectionUtils.isNotEmpty(this.f75464a)) {
                this.f75464a.get(0).setShowViewTimeZoneGuide(true);
                return;
            }
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
    }

    /* renamed from: a */
    public final void mo108997a(long j, Map<String, String> map) {
        boolean z;
        TimeZone timeZone;
        String[] strArr;
        Intrinsics.checkParameterIsNotNull(map, "attendeeTimeZone");
        if (map.size() < 2) {
            Iterator<AttendeeInfoView> it = this.f75464a.iterator();
            while (it.hasNext()) {
                it.next().mo109015c();
            }
            return;
        }
        this.f75468e = map;
        Collection<String> values = map.values();
        Iterator<String> it2 = values.iterator();
        String next = it2.next();
        while (true) {
            String str = next;
            if (!TextUtils.isEmpty(str)) {
                TimeZone timeZone2 = TimeZone.getTimeZone(str);
                Iterator<String> it3 = values.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        z = false;
                        break;
                    }
                    String next2 = it3.next();
                    if (!TextUtils.isEmpty(next2) && !TimeZone.getTimeZone(next2).equals(timeZone2)) {
                        z = true;
                        break;
                    }
                }
                if (z) {
                    TimeZone timeZone3 = TimeZone.getDefault();
                    HashMap hashMap = new HashMap();
                    Iterator<AttendeeInfoView> it4 = this.f75464a.iterator();
                    boolean z2 = false;
                    while (it4.hasNext()) {
                        AttendeeInfoView next3 = it4.next();
                        if (!next3.getIsCrossTenantAttendee()) {
                            if (TextUtils.isEmpty(map.get(next3.getCalednarId()))) {
                                timeZone = timeZone3;
                            } else {
                                timeZone = TimeZone.getTimeZone(map.get(next3.getCalednarId()));
                            }
                            if (C30022a.f74883b.mo112695c()) {
                                long j2 = ((long) 1000) * j;
                                strArr = new String[]{C32646c.m125255a(j2, timeZone, false), C32634ae.m125183c(R.array.Lark_Calendar_WeekAbbr)[new CalendarDate(new Date(j2), timeZone).getWeekDay() - 1]};
                            } else {
                                long j3 = ((long) 1000) * j;
                                strArr = new String[]{C32646c.m125255a(j3, timeZone, false), C32646c.m125265a(timeZone, j3)};
                            }
                            if (!z2) {
                                String str2 = strArr[0];
                                Intrinsics.checkExpressionValueIsNotNull(str2, "timeWeek[0]");
                                String str3 = strArr[1];
                                Intrinsics.checkExpressionValueIsNotNull(str3, "timeWeek[1]");
                                z2 = next3.mo109013a(str2, str3, false);
                            }
                            hashMap.put(next3.getCalednarId(), strArr);
                        }
                    }
                    if (z2) {
                        Iterator<AttendeeInfoView> it5 = this.f75464a.iterator();
                        while (it5.hasNext()) {
                            AttendeeInfoView next4 = it5.next();
                            String[] strArr2 = (String[]) hashMap.get(next4.getCalednarId());
                            if (strArr2 != null) {
                                next4.mo109013a(strArr2[0], strArr2[1], true);
                            }
                        }
                        return;
                    }
                    return;
                }
                Iterator<AttendeeInfoView> it6 = this.f75464a.iterator();
                while (it6.hasNext()) {
                    it6.next().mo109015c();
                }
                return;
            } else if (it2.hasNext()) {
                next = it2.next();
            } else {
                Iterator<AttendeeInfoView> it7 = this.f75464a.iterator();
                while (it7.hasNext()) {
                    it7.next().mo109015c();
                }
                return;
            }
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public AttendeeInfoContainer(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* renamed from: a */
    public final void mo108999a(ArrayList<String> arrayList, ArrayList<String> arrayList2, ArrayList<String> arrayList3) {
        boolean z;
        boolean z2;
        boolean z3;
        Intrinsics.checkParameterIsNotNull(arrayList, "busyCalendarIds");
        Intrinsics.checkParameterIsNotNull(arrayList2, "outWorkHourCalendarIds");
        Intrinsics.checkParameterIsNotNull(arrayList3, "bothConflictCalendarIds");
        Iterator<AttendeeInfoView> it = this.f75464a.iterator();
        while (it.hasNext()) {
            AttendeeInfoView next = it.next();
            Iterator<String> it2 = arrayList.iterator();
            while (true) {
                z = true;
                if (!it2.hasNext()) {
                    z2 = false;
                    break;
                }
                if (next.getCalednarId().equals(it2.next())) {
                    z2 = true;
                    break;
                }
            }
            Iterator<String> it3 = arrayList2.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    z3 = false;
                    break;
                }
                if (next.getCalednarId().equals(it3.next())) {
                    z3 = true;
                    break;
                }
            }
            Iterator<String> it4 = arrayList3.iterator();
            while (true) {
                if (!it4.hasNext()) {
                    z = false;
                    break;
                }
                if (next.getCalednarId().equals(it4.next())) {
                    break;
                }
            }
            next.mo109012a(z2, z3, z);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AttendeeInfoContainer(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f75466c = LocationRequest.PRIORITY_HD_ACCURACY;
        this.f75464a = new ArrayList<>();
        this.f75468e = new HashMap();
    }
}
