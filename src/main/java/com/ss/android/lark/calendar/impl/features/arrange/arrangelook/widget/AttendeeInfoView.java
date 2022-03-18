package com.ss.android.lark.calendar.impl.features.arrange.arrangelook.widget;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.joooonho.SelectableRoundedImageView;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.arrange.p1441a.AbstractC30095b;
import com.ss.android.lark.calendar.impl.features.calendarview.CalendarDate;
import com.ss.android.lark.calendar.impl.features.common.widget.guide.CalendarGuideManager;
import com.ss.android.lark.calendar.impl.features.events.detail.p1507d.C31256c;
import com.ss.android.lark.calendar.impl.utils.C32634ae;
import com.ss.android.lark.calendar.impl.utils.C32646c;
import com.ss.android.lark.calendar.p1430a.C30022a;
import com.ss.android.lark.ui.p2892a.C57582a;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0014\u0018\u0000 32\u00020\u0001:\u00013B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nB)\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0002\u0010\fJ0\u0010\u0017\u001a\u00020\u00182\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010J\u001a\u0010\u001c\u001a\u00020\u00182\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00110\u0013J\u0014\u0010\u001e\u001a\u00020\u00182\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\u0010J\u0010\u0010!\u001a\u00020\u00182\u0006\u0010\"\u001a\u00020 H\u0002J\u0010\u0010#\u001a\u00020\u00182\u0006\u0010\"\u001a\u00020 H\u0002J\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010J\u0006\u0010%\u001a\u00020\u0018J\b\u0010&\u001a\u00020\u0018H\u0002J\u001c\u0010'\u001a\u00020\u000e2\b\u0010(\u001a\u0004\u0018\u00010\u00112\b\u0010)\u001a\u0004\u0018\u00010\u0011H\u0002J\u0006\u0010*\u001a\u00020\u0018J\u000e\u0010+\u001a\u00020\u00182\u0006\u0010,\u001a\u00020\u0016J\u0006\u0010-\u001a\u00020\u0018J(\u0010.\u001a\u00020\u00182\u0006\u0010/\u001a\u00020\u00112\u0006\u00100\u001a\u00020\u00112\u0006\u00101\u001a\u00020\u00112\u0006\u00102\u001a\u00020\u0011H\u0002R\u000e\u0010\r\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00110\u0013X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u000e¢\u0006\u0002\n\u0000¨\u00064"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/arrange/arrangelook/widget/AttendeeInfoView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "isAttendeeDiffTenant", "", "mAttendeeOrder", "Ljava/util/ArrayList;", "", "mAttendeeTimeZone", "", "mIsShowedViewTimeZoneGuide", "mSelectStartTime", "", "bindAttendeeIcon", "", "conflictList", "outWorkHourList", "bothConflictList", "bindAttendeeTimeZone", "attendeeTimeZone", "bindData", "attendeeList", "Lcom/ss/android/lark/calendar/impl/features/arrange/base/IArrangeBaseData;", "bindMeData", "attendee", "bindTargetData", "getAttendeeOrder", "hideAllAttendeeIcon", "hideTimeZoneStr", "isNotSameTenant", "one", "second", "noSelectTime", "selectTimeChange", "startTime", "showTimeZoneGuide", "showTimeZoneStr", "firstTimeStr", "firstTimeZoneStr", "secondTimeStr", "secondTimeZoneStr", "Companion", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class AttendeeInfoView extends LinearLayout {

    /* renamed from: a */
    public static final Companion f75314a = new Companion(null);

    /* renamed from: b */
    private boolean f75315b;

    /* renamed from: c */
    private final ArrayList<String> f75316c;

    /* renamed from: d */
    private long f75317d;

    /* renamed from: e */
    private boolean f75318e;

    /* renamed from: f */
    private Map<String, String> f75319f;

    /* renamed from: g */
    private HashMap f75320g;

    /* renamed from: a */
    public View mo108796a(int i) {
        if (this.f75320g == null) {
            this.f75320g = new HashMap();
        }
        View view = (View) this.f75320g.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f75320g.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/arrange/arrangelook/widget/AttendeeInfoView$Companion;", "", "()V", "NO_SELECT_TIME", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.arrange.arrangelook.widget.AttendeeInfoView$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final ArrayList<String> getAttendeeOrder() {
        return this.f75316c;
    }

    /* renamed from: a */
    public final void mo108797a() {
        this.f75317d = -1;
        mo108801a(this.f75319f);
    }

    /* renamed from: b */
    public final void mo108802b() {
        TextView textView;
        if (C30022a.f74883b.mo112695c() && !this.f75315b && !CalendarGuideManager.f78922a.mo113198e()) {
            TextView textView2 = (TextView) mo108796a(R.id.tvTargetTime);
            if (textView2 == null || textView2.getVisibility() != 0) {
                textView = null;
            } else {
                textView = (TextView) mo108796a(R.id.tvTargetTime);
            }
            if (textView != null) {
                CalendarGuideManager aVar = CalendarGuideManager.f78922a;
                Context context = textView.getContext();
                if (context != null) {
                    aVar.mo113192b((Activity) context, textView);
                    this.f75315b = true;
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type android.app.Activity");
            }
        }
    }

    /* renamed from: c */
    public final void mo108803c() {
        ImageView imageView = (ImageView) mo108796a(R.id.ivMeAttendeeSingleIcon);
        Intrinsics.checkExpressionValueIsNotNull(imageView, "ivMeAttendeeSingleIcon");
        imageView.setVisibility(4);
        ImageView imageView2 = (ImageView) mo108796a(R.id.ivMeAttendeeSecondIcon);
        Intrinsics.checkExpressionValueIsNotNull(imageView2, "ivMeAttendeeSecondIcon");
        imageView2.setVisibility(4);
        ImageView imageView3 = (ImageView) mo108796a(R.id.ivOtherAttendeeSingleIcon);
        Intrinsics.checkExpressionValueIsNotNull(imageView3, "ivOtherAttendeeSingleIcon");
        imageView3.setVisibility(4);
        ImageView imageView4 = (ImageView) mo108796a(R.id.ivOtherAttendeeSecondIcon);
        Intrinsics.checkExpressionValueIsNotNull(imageView4, "ivOtherAttendeeSecondIcon");
        imageView4.setVisibility(4);
    }

    /* renamed from: d */
    private final void m111808d() {
        TextView textView = (TextView) mo108796a(R.id.tvTargetTime);
        Intrinsics.checkExpressionValueIsNotNull(textView, "tvTargetTime");
        textView.setVisibility(8);
        TextView textView2 = (TextView) mo108796a(R.id.tvTargetName);
        Intrinsics.checkExpressionValueIsNotNull(textView2, "tvTargetName");
        ViewGroup.LayoutParams layoutParams = textView2.getLayoutParams();
        if (layoutParams != null) {
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
            layoutParams2.height = -1;
            layoutParams2.topMargin = C57582a.m223601a(getContext(), (float) BitmapDescriptorFactory.HUE_RED);
            TextView textView3 = (TextView) mo108796a(R.id.tvTargetName);
            Intrinsics.checkExpressionValueIsNotNull(textView3, "tvTargetName");
            textView3.setLayoutParams(layoutParams2);
            TextView textView4 = (TextView) mo108796a(R.id.tvTargetName);
            Intrinsics.checkExpressionValueIsNotNull(textView4, "tvTargetName");
            textView4.setGravity(16);
            TextView textView5 = (TextView) mo108796a(R.id.tvMeTime);
            Intrinsics.checkExpressionValueIsNotNull(textView5, "tvMeTime");
            textView5.setVisibility(8);
            TextView textView6 = (TextView) mo108796a(R.id.tvMeName);
            Intrinsics.checkExpressionValueIsNotNull(textView6, "tvMeName");
            ViewGroup.LayoutParams layoutParams3 = textView6.getLayoutParams();
            if (layoutParams3 != null) {
                RelativeLayout.LayoutParams layoutParams4 = (RelativeLayout.LayoutParams) layoutParams3;
                layoutParams4.topMargin = C57582a.m223601a(getContext(), (float) BitmapDescriptorFactory.HUE_RED);
                layoutParams4.height = -1;
                TextView textView7 = (TextView) mo108796a(R.id.tvMeName);
                Intrinsics.checkExpressionValueIsNotNull(textView7, "tvMeName");
                textView7.setLayoutParams(layoutParams4);
                TextView textView8 = (TextView) mo108796a(R.id.tvMeName);
                Intrinsics.checkExpressionValueIsNotNull(textView8, "tvMeName");
                textView8.setGravity(16);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        }
        throw new TypeCastException("null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
    }

    /* renamed from: a */
    public final void mo108798a(long j) {
        this.f75317d = j;
        mo108801a(this.f75319f);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public AttendeeInfoView(Context context) {
        this(context, null);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* renamed from: b */
    private final void m111807b(AbstractC30095b bVar) {
        C31256c.m117135a(getContext(), (SelectableRoundedImageView) mo108796a(R.id.ivMeAvatar), 40, 40, bVar.getAvatarKey(), bVar.getAttendeeCalendarId(), bVar.getLocalizedDisplayName(), true, bVar.getAvatarEntityId());
        TextView textView = (TextView) mo108796a(R.id.tvMeTime);
        Intrinsics.checkExpressionValueIsNotNull(textView, "tvMeTime");
        textView.setVisibility(8);
    }

    /* renamed from: a */
    private final void m111804a(AbstractC30095b bVar) {
        C31256c.m117135a(getContext(), (SelectableRoundedImageView) mo108796a(R.id.ivTargetAvatar), 40, 40, bVar.getAvatarKey(), bVar.getAttendeeCalendarId(), bVar.getLocalizedDisplayName(), true, bVar.getAvatarEntityId());
        TextView textView = (TextView) mo108796a(R.id.tvTargetName);
        Intrinsics.checkExpressionValueIsNotNull(textView, "tvTargetName");
        textView.setText(bVar.getLocalizedDisplayName());
        TextView textView2 = (TextView) mo108796a(R.id.tvTargetTime);
        Intrinsics.checkExpressionValueIsNotNull(textView2, "tvTargetTime");
        textView2.setVisibility(8);
    }

    /* renamed from: a */
    public final void mo108799a(ArrayList<AbstractC30095b> arrayList) {
        Intrinsics.checkParameterIsNotNull(arrayList, "attendeeList");
        if (arrayList.size() >= 2) {
            AbstractC30095b bVar = arrayList.get(0);
            Intrinsics.checkExpressionValueIsNotNull(bVar, "attendeeList[0]");
            String tenantId = bVar.getTenantId();
            AbstractC30095b bVar2 = arrayList.get(1);
            Intrinsics.checkExpressionValueIsNotNull(bVar2, "attendeeList[1]");
            this.f75318e = m111806a(tenantId, bVar2.getTenantId());
            this.f75316c.clear();
            ArrayList<String> arrayList2 = this.f75316c;
            AbstractC30095b bVar3 = arrayList.get(0);
            Intrinsics.checkExpressionValueIsNotNull(bVar3, "attendeeList[0]");
            arrayList2.add(bVar3.getAttendeeCalendarId());
            ArrayList<String> arrayList3 = this.f75316c;
            AbstractC30095b bVar4 = arrayList.get(1);
            Intrinsics.checkExpressionValueIsNotNull(bVar4, "attendeeList[1]");
            arrayList3.add(bVar4.getAttendeeCalendarId());
            AbstractC30095b bVar5 = arrayList.get(0);
            Intrinsics.checkExpressionValueIsNotNull(bVar5, "attendeeList[0]");
            m111804a(bVar5);
            AbstractC30095b bVar6 = arrayList.get(1);
            Intrinsics.checkExpressionValueIsNotNull(bVar6, "attendeeList[1]");
            m111807b(bVar6);
        }
    }

    /* renamed from: a */
    public final void mo108801a(Map<String, String> map) {
        boolean z;
        long j;
        Intrinsics.checkParameterIsNotNull(map, "attendeeTimeZone");
        if (map.size() < 2 || this.f75316c.size() < 2) {
            m111808d();
            return;
        }
        this.f75319f = map;
        String str = map.get(this.f75316c.get(0));
        String str2 = map.get(this.f75316c.get(1));
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            m111808d();
            return;
        }
        TimeZone timeZone = TimeZone.getTimeZone(str);
        TimeZone timeZone2 = TimeZone.getTimeZone(str2);
        if (timeZone.equals(timeZone2) || this.f75318e) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            long j2 = this.f75317d;
            if (j2 == -1) {
                j = System.currentTimeMillis();
            } else {
                j = j2 * ((long) 1000);
            }
            String a = C32646c.m125255a(j, timeZone, false);
            String a2 = C32646c.m125255a(j, timeZone2, false);
            String a3 = C32646c.m125265a(timeZone, j);
            String a4 = C32646c.m125265a(timeZone2, j);
            if (C30022a.f74883b.mo112695c()) {
                CalendarDate calendarDate = new CalendarDate(new Date(j), timeZone);
                CalendarDate calendarDate2 = new CalendarDate(new Date(j), timeZone2);
                String[] c = C32634ae.m125183c(R.array.Lark_Calendar_WeekAbbr);
                String str3 = c[calendarDate.getWeekDay() - 1];
                String str4 = c[calendarDate2.getWeekDay() - 1];
                Intrinsics.checkExpressionValueIsNotNull(a, "targetStr");
                Intrinsics.checkExpressionValueIsNotNull(str3, "targetWeekDay");
                Intrinsics.checkExpressionValueIsNotNull(a2, "meStr");
                Intrinsics.checkExpressionValueIsNotNull(str4, "meWeekDay");
                m111805a(a, str3, a2, str4);
                return;
            }
            Intrinsics.checkExpressionValueIsNotNull(a, "targetStr");
            Intrinsics.checkExpressionValueIsNotNull(a3, "targetTimeZoneStr");
            Intrinsics.checkExpressionValueIsNotNull(a2, "meStr");
            Intrinsics.checkExpressionValueIsNotNull(a4, "meTimeZoneStr");
            m111805a(a, a3, a2, a4);
            return;
        }
        m111808d();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public AttendeeInfoView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* renamed from: a */
    private final boolean m111806a(String str, String str2) {
        boolean z;
        boolean z2;
        String str3 = str;
        if (str3 == null || str3.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return false;
        }
        String str4 = str2;
        if (str4 == null || str4.length() == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2 || !(!Intrinsics.areEqual(str, str2))) {
            return false;
        }
        return true;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public AttendeeInfoView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* renamed from: a */
    public final void mo108800a(ArrayList<String> arrayList, ArrayList<String> arrayList2, ArrayList<String> arrayList3) {
        Intrinsics.checkParameterIsNotNull(arrayList, "conflictList");
        Intrinsics.checkParameterIsNotNull(arrayList2, "outWorkHourList");
        Intrinsics.checkParameterIsNotNull(arrayList3, "bothConflictList");
        if (this.f75316c.size() >= 2) {
            String str = this.f75316c.get(0);
            Intrinsics.checkExpressionValueIsNotNull(str, "mAttendeeOrder[0]");
            String str2 = str;
            if (arrayList.contains(str2)) {
                ImageView imageView = (ImageView) mo108796a(R.id.ivOtherAttendeeSecondIcon);
                Intrinsics.checkExpressionValueIsNotNull(imageView, "ivOtherAttendeeSecondIcon");
                imageView.setVisibility(4);
                ImageView imageView2 = (ImageView) mo108796a(R.id.ivOtherAttendeeSingleIcon);
                Intrinsics.checkExpressionValueIsNotNull(imageView2, "ivOtherAttendeeSingleIcon");
                imageView2.setVisibility(0);
                ((ImageView) mo108796a(R.id.ivOtherAttendeeSingleIcon)).setImageResource(R.drawable.icon_arrange_busy_wrap);
                ImageView imageView3 = (ImageView) mo108796a(R.id.ivOtherAttendeeSingleIcon);
                Intrinsics.checkExpressionValueIsNotNull(imageView3, "ivOtherAttendeeSingleIcon");
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(imageView3.getLayoutParams());
                layoutParams.leftMargin = C57582a.m223601a(getContext(), 31.0f);
                layoutParams.topMargin = C57582a.m223601a(getContext(), 40.0f);
                ImageView imageView4 = (ImageView) mo108796a(R.id.ivOtherAttendeeSingleIcon);
                Intrinsics.checkExpressionValueIsNotNull(imageView4, "ivOtherAttendeeSingleIcon");
                imageView4.setLayoutParams(layoutParams);
            } else if (arrayList2.contains(str2)) {
                ImageView imageView5 = (ImageView) mo108796a(R.id.ivOtherAttendeeSecondIcon);
                Intrinsics.checkExpressionValueIsNotNull(imageView5, "ivOtherAttendeeSecondIcon");
                imageView5.setVisibility(4);
                ImageView imageView6 = (ImageView) mo108796a(R.id.ivOtherAttendeeSingleIcon);
                Intrinsics.checkExpressionValueIsNotNull(imageView6, "ivOtherAttendeeSingleIcon");
                imageView6.setVisibility(0);
                ((ImageView) mo108796a(R.id.ivOtherAttendeeSingleIcon)).setImageResource(R.drawable.ud_icon_work_time_colorful);
                ImageView imageView7 = (ImageView) mo108796a(R.id.ivOtherAttendeeSingleIcon);
                Intrinsics.checkExpressionValueIsNotNull(imageView7, "ivOtherAttendeeSingleIcon");
                RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(imageView7.getLayoutParams());
                layoutParams2.leftMargin = C57582a.m223601a(getContext(), 31.0f);
                layoutParams2.topMargin = C57582a.m223601a(getContext(), 40.0f);
                ImageView imageView8 = (ImageView) mo108796a(R.id.ivOtherAttendeeSingleIcon);
                Intrinsics.checkExpressionValueIsNotNull(imageView8, "ivOtherAttendeeSingleIcon");
                imageView8.setLayoutParams(layoutParams2);
            } else if (arrayList3.contains(str2)) {
                ImageView imageView9 = (ImageView) mo108796a(R.id.ivOtherAttendeeSingleIcon);
                Intrinsics.checkExpressionValueIsNotNull(imageView9, "ivOtherAttendeeSingleIcon");
                imageView9.setVisibility(0);
                ((ImageView) mo108796a(R.id.ivOtherAttendeeSingleIcon)).setImageResource(R.drawable.ud_icon_work_time_colorful);
                ImageView imageView10 = (ImageView) mo108796a(R.id.ivOtherAttendeeSecondIcon);
                Intrinsics.checkExpressionValueIsNotNull(imageView10, "ivOtherAttendeeSecondIcon");
                imageView10.setVisibility(0);
                ((ImageView) mo108796a(R.id.ivOtherAttendeeSecondIcon)).setImageResource(R.drawable.icon_arrange_busy_wrap);
                ImageView imageView11 = (ImageView) mo108796a(R.id.ivOtherAttendeeSingleIcon);
                Intrinsics.checkExpressionValueIsNotNull(imageView11, "ivOtherAttendeeSingleIcon");
                RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(imageView11.getLayoutParams());
                layoutParams3.leftMargin = C57582a.m223601a(getContext(), 39.0f);
                layoutParams3.topMargin = C57582a.m223601a(getContext(), 40.0f);
                ImageView imageView12 = (ImageView) mo108796a(R.id.ivOtherAttendeeSingleIcon);
                Intrinsics.checkExpressionValueIsNotNull(imageView12, "ivOtherAttendeeSingleIcon");
                imageView12.setLayoutParams(layoutParams3);
            } else {
                ImageView imageView13 = (ImageView) mo108796a(R.id.ivOtherAttendeeSingleIcon);
                Intrinsics.checkExpressionValueIsNotNull(imageView13, "ivOtherAttendeeSingleIcon");
                imageView13.setVisibility(4);
                ImageView imageView14 = (ImageView) mo108796a(R.id.ivOtherAttendeeSecondIcon);
                Intrinsics.checkExpressionValueIsNotNull(imageView14, "ivOtherAttendeeSecondIcon");
                imageView14.setVisibility(4);
            }
            String str3 = this.f75316c.get(1);
            Intrinsics.checkExpressionValueIsNotNull(str3, "mAttendeeOrder[1]");
            String str4 = str3;
            if (arrayList.contains(str4)) {
                ImageView imageView15 = (ImageView) mo108796a(R.id.ivMeAttendeeSecondIcon);
                Intrinsics.checkExpressionValueIsNotNull(imageView15, "ivMeAttendeeSecondIcon");
                imageView15.setVisibility(4);
                ImageView imageView16 = (ImageView) mo108796a(R.id.ivMeAttendeeSingleIcon);
                Intrinsics.checkExpressionValueIsNotNull(imageView16, "ivMeAttendeeSingleIcon");
                imageView16.setVisibility(0);
                ((ImageView) mo108796a(R.id.ivMeAttendeeSingleIcon)).setImageResource(R.drawable.icon_arrange_busy_wrap);
                ImageView imageView17 = (ImageView) mo108796a(R.id.ivMeAttendeeSingleIcon);
                Intrinsics.checkExpressionValueIsNotNull(imageView17, "ivMeAttendeeSingleIcon");
                RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(imageView17.getLayoutParams());
                layoutParams4.leftMargin = C57582a.m223601a(getContext(), 31.0f);
                layoutParams4.topMargin = C57582a.m223601a(getContext(), 40.0f);
                ImageView imageView18 = (ImageView) mo108796a(R.id.ivMeAttendeeSingleIcon);
                Intrinsics.checkExpressionValueIsNotNull(imageView18, "ivMeAttendeeSingleIcon");
                imageView18.setLayoutParams(layoutParams4);
            } else if (arrayList2.contains(str4)) {
                ImageView imageView19 = (ImageView) mo108796a(R.id.ivMeAttendeeSecondIcon);
                Intrinsics.checkExpressionValueIsNotNull(imageView19, "ivMeAttendeeSecondIcon");
                imageView19.setVisibility(4);
                ImageView imageView20 = (ImageView) mo108796a(R.id.ivMeAttendeeSingleIcon);
                Intrinsics.checkExpressionValueIsNotNull(imageView20, "ivMeAttendeeSingleIcon");
                imageView20.setVisibility(0);
                ((ImageView) mo108796a(R.id.ivMeAttendeeSingleIcon)).setImageResource(R.drawable.ud_icon_work_time_colorful);
                ImageView imageView21 = (ImageView) mo108796a(R.id.ivMeAttendeeSingleIcon);
                Intrinsics.checkExpressionValueIsNotNull(imageView21, "ivMeAttendeeSingleIcon");
                RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(imageView21.getLayoutParams());
                layoutParams5.leftMargin = C57582a.m223601a(getContext(), 31.0f);
                layoutParams5.topMargin = C57582a.m223601a(getContext(), 40.0f);
                ImageView imageView22 = (ImageView) mo108796a(R.id.ivMeAttendeeSingleIcon);
                Intrinsics.checkExpressionValueIsNotNull(imageView22, "ivMeAttendeeSingleIcon");
                imageView22.setLayoutParams(layoutParams5);
            } else if (arrayList3.contains(str4)) {
                ImageView imageView23 = (ImageView) mo108796a(R.id.ivMeAttendeeSingleIcon);
                Intrinsics.checkExpressionValueIsNotNull(imageView23, "ivMeAttendeeSingleIcon");
                imageView23.setVisibility(0);
                ((ImageView) mo108796a(R.id.ivMeAttendeeSingleIcon)).setImageResource(R.drawable.ud_icon_work_time_colorful);
                ImageView imageView24 = (ImageView) mo108796a(R.id.ivMeAttendeeSecondIcon);
                Intrinsics.checkExpressionValueIsNotNull(imageView24, "ivMeAttendeeSecondIcon");
                imageView24.setVisibility(0);
                ((ImageView) mo108796a(R.id.ivMeAttendeeSecondIcon)).setImageResource(R.drawable.icon_arrange_busy_wrap);
                ImageView imageView25 = (ImageView) mo108796a(R.id.ivMeAttendeeSingleIcon);
                Intrinsics.checkExpressionValueIsNotNull(imageView25, "ivMeAttendeeSingleIcon");
                RelativeLayout.LayoutParams layoutParams6 = new RelativeLayout.LayoutParams(imageView25.getLayoutParams());
                layoutParams6.leftMargin = C57582a.m223601a(getContext(), 39.0f);
                layoutParams6.topMargin = C57582a.m223601a(getContext(), 40.0f);
                ImageView imageView26 = (ImageView) mo108796a(R.id.ivMeAttendeeSingleIcon);
                Intrinsics.checkExpressionValueIsNotNull(imageView26, "ivMeAttendeeSingleIcon");
                imageView26.setLayoutParams(layoutParams6);
            } else {
                ImageView imageView27 = (ImageView) mo108796a(R.id.ivMeAttendeeSingleIcon);
                Intrinsics.checkExpressionValueIsNotNull(imageView27, "ivMeAttendeeSingleIcon");
                imageView27.setVisibility(4);
                ImageView imageView28 = (ImageView) mo108796a(R.id.ivMeAttendeeSecondIcon);
                Intrinsics.checkExpressionValueIsNotNull(imageView28, "ivMeAttendeeSecondIcon");
                imageView28.setVisibility(4);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AttendeeInfoView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f75316c = new ArrayList<>();
        this.f75317d = -1;
        LayoutInflater.from(context).inflate(R.layout.arrange_look_attendee_view, (ViewGroup) this, true);
        this.f75319f = new HashMap();
    }

    /* renamed from: a */
    private final void m111805a(String str, String str2, String str3, String str4) {
        boolean z;
        boolean z2;
        TextView textView = (TextView) mo108796a(R.id.tvTargetTime);
        Intrinsics.checkExpressionValueIsNotNull(textView, "tvTargetTime");
        textView.setText(str + ' ' + str2);
        TextView textView2 = (TextView) mo108796a(R.id.tvMeTime);
        Intrinsics.checkExpressionValueIsNotNull(textView2, "tvMeTime");
        textView2.setText(str3 + ' ' + str4);
        TextView textView3 = (TextView) mo108796a(R.id.tvTargetTime);
        Intrinsics.checkExpressionValueIsNotNull(textView3, "tvTargetTime");
        textView3.setVisibility(0);
        TextView textView4 = (TextView) mo108796a(R.id.tvMeTime);
        Intrinsics.checkExpressionValueIsNotNull(textView4, "tvMeTime");
        textView4.setVisibility(0);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ((TextView) mo108796a(R.id.tvTargetTime)).measure(makeMeasureSpec, makeMeasureSpec);
        TextView textView5 = (TextView) mo108796a(R.id.tvTargetTime);
        Intrinsics.checkExpressionValueIsNotNull(textView5, "tvTargetTime");
        int measuredWidth = textView5.getMeasuredWidth();
        RelativeLayout relativeLayout = (RelativeLayout) mo108796a(R.id.rlTargetTextContainer);
        Intrinsics.checkExpressionValueIsNotNull(relativeLayout, "rlTargetTextContainer");
        if (measuredWidth > relativeLayout.getMeasuredWidth()) {
            TextView textView6 = (TextView) mo108796a(R.id.tvTargetTime);
            Intrinsics.checkExpressionValueIsNotNull(textView6, "tvTargetTime");
            textView6.setText(str + "\n" + str2);
            z = true;
        } else {
            z = false;
        }
        TextView textView7 = (TextView) mo108796a(R.id.tvTargetName);
        Intrinsics.checkExpressionValueIsNotNull(textView7, "tvTargetName");
        ViewGroup.LayoutParams layoutParams = textView7.getLayoutParams();
        if (layoutParams != null) {
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
            layoutParams2.topMargin = C57582a.m223601a(getContext(), 16.0f);
            layoutParams2.height = -2;
            TextView textView8 = (TextView) mo108796a(R.id.tvTargetName);
            Intrinsics.checkExpressionValueIsNotNull(textView8, "tvTargetName");
            textView8.setLayoutParams(layoutParams2);
            TextView textView9 = (TextView) mo108796a(R.id.tvTargetName);
            Intrinsics.checkExpressionValueIsNotNull(textView9, "tvTargetName");
            textView9.setGravity(0);
            ((TextView) mo108796a(R.id.tvMeTime)).measure(makeMeasureSpec, makeMeasureSpec);
            TextView textView10 = (TextView) mo108796a(R.id.tvMeTime);
            Intrinsics.checkExpressionValueIsNotNull(textView10, "tvMeTime");
            int measuredWidth2 = textView10.getMeasuredWidth();
            RelativeLayout relativeLayout2 = (RelativeLayout) mo108796a(R.id.rlMeTextContainer);
            Intrinsics.checkExpressionValueIsNotNull(relativeLayout2, "rlMeTextContainer");
            if (measuredWidth2 > relativeLayout2.getMeasuredWidth()) {
                TextView textView11 = (TextView) mo108796a(R.id.tvMeTime);
                Intrinsics.checkExpressionValueIsNotNull(textView11, "tvMeTime");
                textView11.setText(str3 + "\n" + str4);
                z2 = true;
            } else {
                z2 = z;
            }
            TextView textView12 = (TextView) mo108796a(R.id.tvMeName);
            Intrinsics.checkExpressionValueIsNotNull(textView12, "tvMeName");
            ViewGroup.LayoutParams layoutParams3 = textView12.getLayoutParams();
            if (layoutParams3 != null) {
                RelativeLayout.LayoutParams layoutParams4 = (RelativeLayout.LayoutParams) layoutParams3;
                layoutParams4.topMargin = C57582a.m223601a(getContext(), 16.0f);
                layoutParams4.height = -2;
                TextView textView13 = (TextView) mo108796a(R.id.tvMeName);
                Intrinsics.checkExpressionValueIsNotNull(textView13, "tvMeName");
                textView13.setLayoutParams(layoutParams4);
                TextView textView14 = (TextView) mo108796a(R.id.tvMeName);
                Intrinsics.checkExpressionValueIsNotNull(textView14, "tvMeName");
                textView14.setGravity(0);
                if (z2) {
                    TextView textView15 = (TextView) mo108796a(R.id.tvTargetTime);
                    Intrinsics.checkExpressionValueIsNotNull(textView15, "tvTargetTime");
                    textView15.setText(str + "\n" + str2);
                    TextView textView16 = (TextView) mo108796a(R.id.tvMeTime);
                    Intrinsics.checkExpressionValueIsNotNull(textView16, "tvMeTime");
                    textView16.setText(str3 + "\n" + str4);
                }
                mo108802b();
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        }
        throw new TypeCastException("null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
    }
}
