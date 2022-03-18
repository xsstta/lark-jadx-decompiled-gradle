package com.ss.android.lark.calendar.impl.features.events.detail.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.lark.pb.calendar.v1.CalendarEventDisplayInfo;
import com.larksuite.component.universe_design.icon.UDIconUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.utils.C32634ae;
import com.ss.android.lark.calendar.impl.utils.an;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001:\u0001$B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\b\u0010\u0015\u001a\u00020\u0016H\u0002J\b\u0010\u0017\u001a\u00020\u0016H\u0002J\u0018\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0012H\u0002J\u0018\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u0012H\u0002J\u000e\u0010\u001f\u001a\u00020\u00162\u0006\u0010 \u001a\u00020\fJ&\u0010!\u001a\u00020\u00162\u0006\u0010\"\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u001e\u001a\u00020\u0012J\b\u0010#\u001a\u00020\u0016H\u0002R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0012X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0012X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0012X\u000e¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/detail/widget/MeetingViewContainer;", "Landroid/widget/RelativeLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "mClickListener", "Lcom/ss/android/lark/calendar/impl/features/events/detail/widget/MeetingViewContainer$MeetingViewClickListener;", "getMClickListener$calendar_impl_release", "()Lcom/ss/android/lark/calendar/impl/features/events/detail/widget/MeetingViewContainer$MeetingViewClickListener;", "setMClickListener$calendar_impl_release", "(Lcom/ss/android/lark/calendar/impl/features/events/detail/widget/MeetingViewContainer$MeetingViewClickListener;)V", "mGroupShow", "", "mMinuteShow", "mVideoShow", "init", "", "initListener", "refreshGroupBtnStyle", "isGroupSHow", "Lcom/bytedance/lark/pb/calendar/v1/CalendarEventDisplayInfo$ButtonDisplayType;", "isHasGroup", "refreshMinuteBtnStyle", "isMinuteShow", "isHasMinute", "setClickListener", "clickListener", "showMeetingZone", "isGroupShow", "updateVisibility", "MeetingViewClickListener", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class MeetingViewContainer extends RelativeLayout {

    /* renamed from: a */
    private boolean f79752a;

    /* renamed from: b */
    private boolean f79753b;

    /* renamed from: c */
    private boolean f79754c;

    /* renamed from: d */
    private MeetingViewClickListener f79755d;

    /* renamed from: e */
    private HashMap f79756e;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/detail/widget/MeetingViewContainer$MeetingViewClickListener;", "", "onClickMeetingGroup", "", "onClickMeetingMinute", "onClickMeetingVideo", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.widget.MeetingViewContainer$a */
    public interface MeetingViewClickListener {
        /* renamed from: a */
        void mo114086a();

        /* renamed from: b */
        void mo114087b();
    }

    /* renamed from: a */
    public View mo114190a(int i) {
        if (this.f79756e == null) {
            this.f79756e = new HashMap();
        }
        View view = (View) this.f79756e.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f79756e.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final MeetingViewClickListener getMClickListener$calendar_impl_release() {
        return this.f79755d;
    }

    /* renamed from: a */
    private final void m118405a() {
        LayoutInflater.from(getContext()).inflate(R.layout.view_calendar_meeting_container, this);
        m118407b();
    }

    /* renamed from: c */
    private final void m118409c() {
        int i;
        if (this.f79752a || this.f79753b || this.f79754c) {
            i = 0;
        } else {
            i = 8;
        }
        setVisibility(i);
    }

    /* renamed from: b */
    private final void m118407b() {
        ((LinearLayout) mo114190a(R.id.meetingGroupZone)).setOnClickListener(new View$OnClickListenerC31468b(this));
        ((LinearLayout) mo114190a(R.id.meetingMinuteZone)).setOnClickListener(new View$OnClickListenerC31469c(this));
    }

    public final void setMClickListener$calendar_impl_release(MeetingViewClickListener aVar) {
        this.f79755d = aVar;
    }

    public final void setClickListener(MeetingViewClickListener aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "clickListener");
        this.f79755d = aVar;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MeetingViewContainer(Context context) {
        super(context);
        Intrinsics.checkParameterIsNotNull(context, "context");
        m118405a();
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.widget.MeetingViewContainer$b */
    public static final class View$OnClickListenerC31468b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ MeetingViewContainer f79757a;

        View$OnClickListenerC31468b(MeetingViewContainer meetingViewContainer) {
            this.f79757a = meetingViewContainer;
        }

        public final void onClick(View view) {
            if (this.f79757a.getMClickListener$calendar_impl_release() != null) {
                MeetingViewClickListener mClickListener$calendar_impl_release = this.f79757a.getMClickListener$calendar_impl_release();
                if (mClickListener$calendar_impl_release == null) {
                    Intrinsics.throwNpe();
                }
                mClickListener$calendar_impl_release.mo114086a();
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.widget.MeetingViewContainer$c */
    public static final class View$OnClickListenerC31469c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ MeetingViewContainer f79758a;

        View$OnClickListenerC31469c(MeetingViewContainer meetingViewContainer) {
            this.f79758a = meetingViewContainer;
        }

        public final void onClick(View view) {
            if (this.f79758a.getMClickListener$calendar_impl_release() != null) {
                MeetingViewClickListener mClickListener$calendar_impl_release = this.f79758a.getMClickListener$calendar_impl_release();
                if (mClickListener$calendar_impl_release == null) {
                    Intrinsics.throwNpe();
                }
                mClickListener$calendar_impl_release.mo114087b();
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MeetingViewContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkParameterIsNotNull(context, "context");
        m118405a();
    }

    /* renamed from: a */
    private final void m118406a(CalendarEventDisplayInfo.ButtonDisplayType buttonDisplayType, boolean z) {
        if (z) {
            TextView textView = (TextView) mo114190a(R.id.meetingGroupTV);
            Intrinsics.checkExpressionValueIsNotNull(textView, "meetingGroupTV");
            textView.setText(C32634ae.m125182b(R.string.Calendar_Legacy_EnterGroup));
            Context context = getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "context");
            ((ImageView) mo114190a(R.id.meetingGroupIcon)).setImageDrawable(UDIconUtils.getIconDrawable(context, R.drawable.ud_icon_chat_outlined));
        } else {
            TextView textView2 = (TextView) mo114190a(R.id.meetingGroupTV);
            Intrinsics.checkExpressionValueIsNotNull(textView2, "meetingGroupTV");
            textView2.setText(C32634ae.m125182b(R.string.Calendar_Legacy_CreateGroup));
            Context context2 = getContext();
            Intrinsics.checkExpressionValueIsNotNull(context2, "context");
            ((ImageView) mo114190a(R.id.meetingGroupIcon)).setImageDrawable(UDIconUtils.getIconDrawable(context2, R.drawable.ud_icon_add_chat_outlined));
        }
        if (buttonDisplayType == CalendarEventDisplayInfo.ButtonDisplayType.SHOWN_ATTENDEE_LIST_INVISIBLE) {
            ((TextView) mo114190a(R.id.meetingGroupTV)).setTextColor(C32634ae.m125178a(R.color.static_white_40));
            ImageView imageView = (ImageView) mo114190a(R.id.meetingGroupIcon);
            Intrinsics.checkExpressionValueIsNotNull(imageView, "meetingGroupIcon");
            imageView.getDrawable().mutate().setTint(C32634ae.m125178a(R.color.static_white_40));
        }
    }

    /* renamed from: b */
    private final void m118408b(CalendarEventDisplayInfo.ButtonDisplayType buttonDisplayType, boolean z) {
        if (z) {
            TextView textView = (TextView) mo114190a(R.id.meetingMinuteTV);
            Intrinsics.checkExpressionValueIsNotNull(textView, "meetingMinuteTV");
            textView.setText(C32634ae.m125182b(R.string.Calendar_Legacy_ViewNotes));
            Context context = getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "context");
            ((ImageView) mo114190a(R.id.meetingMinuteIcon)).setImageDrawable(UDIconUtils.getIconDrawable(context, R.drawable.ud_icon_doc_outlined));
        } else {
            TextView textView2 = (TextView) mo114190a(R.id.meetingMinuteTV);
            Intrinsics.checkExpressionValueIsNotNull(textView2, "meetingMinuteTV");
            textView2.setText(C32634ae.m125182b(R.string.Calendar_Legacy_CreateNotes));
            Context context2 = getContext();
            Intrinsics.checkExpressionValueIsNotNull(context2, "context");
            ((ImageView) mo114190a(R.id.meetingMinuteIcon)).setImageDrawable(UDIconUtils.getIconDrawable(context2, R.drawable.ud_icon_add_doc_outlined));
        }
        if (buttonDisplayType == CalendarEventDisplayInfo.ButtonDisplayType.SHOWN_ATTENDEE_LIST_INVISIBLE) {
            ((TextView) mo114190a(R.id.meetingMinuteTV)).setTextColor(C32634ae.m125178a(R.color.static_white_40));
            ImageView imageView = (ImageView) mo114190a(R.id.meetingMinuteIcon);
            Intrinsics.checkExpressionValueIsNotNull(imageView, "meetingMinuteIcon");
            imageView.getDrawable().mutate().setTint(C32634ae.m125178a(R.color.static_white_40));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MeetingViewContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
        m118405a();
    }

    /* renamed from: a */
    public final void mo114191a(CalendarEventDisplayInfo.ButtonDisplayType buttonDisplayType, CalendarEventDisplayInfo.ButtonDisplayType buttonDisplayType2, boolean z, boolean z2) {
        boolean z3;
        Intrinsics.checkParameterIsNotNull(buttonDisplayType, "isGroupShow");
        Intrinsics.checkParameterIsNotNull(buttonDisplayType2, "isMinuteShow");
        boolean z4 = true;
        if (buttonDisplayType != CalendarEventDisplayInfo.ButtonDisplayType.HIDDEN) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.f79752a = z3;
        if (buttonDisplayType2 == CalendarEventDisplayInfo.ButtonDisplayType.HIDDEN) {
            z4 = false;
        }
        this.f79754c = z4;
        LinearLayout linearLayout = (LinearLayout) mo114190a(R.id.meetingGroupZone);
        Intrinsics.checkExpressionValueIsNotNull(linearLayout, "meetingGroupZone");
        an.m125213a(linearLayout, this.f79752a);
        LinearLayout linearLayout2 = (LinearLayout) mo114190a(R.id.meetingMinuteZone);
        Intrinsics.checkExpressionValueIsNotNull(linearLayout2, "meetingMinuteZone");
        an.m125213a(linearLayout2, this.f79754c);
        m118406a(buttonDisplayType, z);
        m118408b(buttonDisplayType2, z2);
        boolean z5 = this.f79752a;
        if (z5 && this.f79754c) {
            LinearLayout linearLayout3 = (LinearLayout) mo114190a(R.id.meetingGroupZone);
            Intrinsics.checkExpressionValueIsNotNull(linearLayout3, "meetingGroupZone");
            linearLayout3.setGravity(17);
            LinearLayout linearLayout4 = (LinearLayout) mo114190a(R.id.meetingMinuteZone);
            Intrinsics.checkExpressionValueIsNotNull(linearLayout4, "meetingMinuteZone");
            linearLayout4.setGravity(17);
            View a = mo114190a(R.id.meetingZoneBarrier);
            Intrinsics.checkExpressionValueIsNotNull(a, "meetingZoneBarrier");
            a.setVisibility(0);
        } else if (z5) {
            LinearLayout linearLayout5 = (LinearLayout) mo114190a(R.id.meetingGroupZone);
            Intrinsics.checkExpressionValueIsNotNull(linearLayout5, "meetingGroupZone");
            linearLayout5.setGravity(8388611);
            View a2 = mo114190a(R.id.meetingZoneBarrier);
            Intrinsics.checkExpressionValueIsNotNull(a2, "meetingZoneBarrier");
            a2.setVisibility(8);
        } else if (this.f79754c) {
            LinearLayout linearLayout6 = (LinearLayout) mo114190a(R.id.meetingMinuteZone);
            Intrinsics.checkExpressionValueIsNotNull(linearLayout6, "meetingMinuteZone");
            linearLayout6.setGravity(8388611);
            View a3 = mo114190a(R.id.meetingZoneBarrier);
            Intrinsics.checkExpressionValueIsNotNull(a3, "meetingZoneBarrier");
            a3.setVisibility(8);
        }
        m118409c();
    }
}
