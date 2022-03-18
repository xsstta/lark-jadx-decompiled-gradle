package com.ss.android.lark.calendar.impl.features.arrange.arrangetime.widget;

import android.app.Activity;
import android.content.Context;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.joooonho.SelectableRoundedImageView;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.common.widget.guide.CalendarGuideManager;
import com.ss.android.lark.calendar.p1430a.C30022a;
import com.ss.android.lark.ui.p2892a.C57582a;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\u0018\u00002\u00020\u0001:\u0001,B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nB)\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0002\u0010\fJ\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017J\u0006\u0010\u0018\u001a\u00020\u0010J\u0006\u0010\u0019\u001a\u00020\u000eJ\u0006\u0010\u001a\u001a\u00020\u0015J\u0006\u0010\u001b\u001a\u00020\u0015J\u0006\u0010\u001c\u001a\u00020\u0015J\u000e\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u001e\u001a\u00020\u0012J\u001e\u0010\u001f\u001a\u00020\u00152\u0006\u0010 \u001a\u00020\u000e2\u0006\u0010!\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020\u000eJ\u000e\u0010#\u001a\u00020\u00152\u0006\u0010$\u001a\u00020\u000eJ\u0006\u0010%\u001a\u00020\u0015J\u0006\u0010&\u001a\u00020\u0015J\u001e\u0010'\u001a\u00020\u000e2\u0006\u0010(\u001a\u00020\u00102\u0006\u0010)\u001a\u00020\u00102\u0006\u0010*\u001a\u00020\u000eJ\u0006\u0010+\u001a\u00020\u0015R\u000e\u0010\r\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000¨\u0006-"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/arrange/arrangetime/widget/AttendeeInfoView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "isCrossTenant", "", "mCalendarId", "", "mClickListener", "Lcom/ss/android/lark/calendar/impl/features/arrange/arrangetime/widget/AttendeeInfoView$ClickLeftListener;", "mIsShowViewTimeZoneGuide", "bindData", "", "attendee", "Lcom/ss/android/lark/calendar/impl/features/arrange/base/IArrangeBaseData;", "getCalednarId", "getIsCrossTenantAttendee", "hideLeftArrow", "hideTimeZoneStr", "hindAllIcons", "setClickListener", "listener", "setIconVisibility", "isBusy", "outWorkHour", "bothConflict", "setShowViewTimeZoneGuide", "isShow", "showAddChatterView", "showLeftArrow", "showTimeWeekStr", "timeStr", "timeZoneStr", "forceTwoLine", "showViewTimeZoneGuide", "ClickLeftListener", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class AttendeeInfoView extends LinearLayout {

    /* renamed from: a */
    public String f75471a;

    /* renamed from: b */
    public ClickLeftListener f75472b;

    /* renamed from: c */
    private boolean f75473c;

    /* renamed from: d */
    private boolean f75474d;

    /* renamed from: e */
    private HashMap f75475e;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/arrange/arrangetime/widget/AttendeeInfoView$ClickLeftListener;", "", "onAddAttendeeClick", "", "onAvatarClick", "calendarId", "", "onToLeftClick", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.arrange.arrangetime.widget.AttendeeInfoView$a */
    public interface ClickLeftListener {
        /* renamed from: a */
        void mo109006a();

        /* renamed from: a */
        void mo109007a(String str);

        /* renamed from: b */
        void mo109008b(String str);
    }

    /* renamed from: a */
    public View mo109009a(int i) {
        if (this.f75475e == null) {
            this.f75475e = new HashMap();
        }
        View view = (View) this.f75475e.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f75475e.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final String getCalednarId() {
        return this.f75471a;
    }

    public final boolean getIsCrossTenantAttendee() {
        return this.f75473c;
    }

    /* renamed from: b */
    public final void mo109014b() {
        ((SelectableRoundedImageView) mo109009a(R.id.ivAttendeeAvatar)).clearColorFilter();
        ImageView imageView = (ImageView) mo109009a(R.id.ivLeftArrow);
        Intrinsics.checkExpressionValueIsNotNull(imageView, "ivLeftArrow");
        imageView.setVisibility(8);
    }

    /* renamed from: c */
    public final void mo109015c() {
        TextView textView = (TextView) mo109009a(R.id.attendeeTime);
        Intrinsics.checkExpressionValueIsNotNull(textView, "attendeeTime");
        textView.setVisibility(8);
        TextView textView2 = (TextView) mo109009a(R.id.attendeeWeek);
        Intrinsics.checkExpressionValueIsNotNull(textView2, "attendeeWeek");
        textView2.setVisibility(8);
    }

    /* renamed from: e */
    public final void mo109017e() {
        ImageView imageView = (ImageView) mo109009a(R.id.ivSingleIcon);
        Intrinsics.checkExpressionValueIsNotNull(imageView, "ivSingleIcon");
        imageView.setVisibility(4);
        ImageView imageView2 = (ImageView) mo109009a(R.id.ivSecondIcon);
        Intrinsics.checkExpressionValueIsNotNull(imageView2, "ivSecondIcon");
        imageView2.setVisibility(4);
    }

    /* renamed from: a */
    public final void mo109010a() {
        ((SelectableRoundedImageView) mo109009a(R.id.ivAttendeeAvatar)).setColorFilter(-7829368, PorterDuff.Mode.MULTIPLY);
        ImageView imageView = (ImageView) mo109009a(R.id.ivLeftArrow);
        Intrinsics.checkExpressionValueIsNotNull(imageView, "ivLeftArrow");
        imageView.setVisibility(0);
    }

    /* renamed from: d */
    public final void mo109016d() {
        TextView textView;
        if (C30022a.f74883b.mo112695c() && this.f75474d && !CalendarGuideManager.f78922a.mo113198e()) {
            if (UIUtils.isVisible((TextView) mo109009a(R.id.attendeeWeek))) {
                textView = (TextView) mo109009a(R.id.attendeeWeek);
            } else if (UIUtils.isVisible((TextView) mo109009a(R.id.attendeeTime))) {
                textView = (TextView) mo109009a(R.id.attendeeTime);
            } else {
                textView = null;
            }
            if (textView != null) {
                CalendarGuideManager aVar = CalendarGuideManager.f78922a;
                Context context = textView.getContext();
                if (context != null) {
                    aVar.mo113192b((Activity) context, textView);
                    this.f75474d = false;
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type android.app.Activity");
            }
        }
    }

    /* renamed from: f */
    public final void mo109018f() {
        SelectableRoundedImageView selectableRoundedImageView = (SelectableRoundedImageView) mo109009a(R.id.ivAttendeeAvatar);
        Intrinsics.checkExpressionValueIsNotNull(selectableRoundedImageView, "ivAttendeeAvatar");
        selectableRoundedImageView.setVisibility(8);
        TextView textView = (TextView) mo109009a(R.id.attendeeNameTV);
        Intrinsics.checkExpressionValueIsNotNull(textView, "attendeeNameTV");
        textView.setVisibility(8);
        TextView textView2 = (TextView) mo109009a(R.id.attendeeTime);
        Intrinsics.checkExpressionValueIsNotNull(textView2, "attendeeTime");
        textView2.setVisibility(8);
        TextView textView3 = (TextView) mo109009a(R.id.attendeeWeek);
        Intrinsics.checkExpressionValueIsNotNull(textView3, "attendeeWeek");
        textView3.setVisibility(8);
        ImageView imageView = (ImageView) mo109009a(R.id.ivAddAttendee);
        Intrinsics.checkExpressionValueIsNotNull(imageView, "ivAddAttendee");
        imageView.setVisibility(0);
        mo109017e();
    }

    public final void setShowViewTimeZoneGuide(boolean z) {
        this.f75474d = z;
    }

    public final void setClickListener(ClickLeftListener aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "listener");
        this.f75472b = aVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public AttendeeInfoView(Context context) {
        this(context, null);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x007a, code lost:
        if ((!kotlin.jvm.internal.Intrinsics.areEqual(r11, r2.mo108271c())) != false) goto L_0x007e;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo109011a(com.ss.android.lark.calendar.impl.features.arrange.p1441a.AbstractC30095b r11) {
        /*
        // Method dump skipped, instructions count: 155
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.calendar.impl.features.arrange.arrangetime.widget.AttendeeInfoView.mo109011a(com.ss.android.lark.calendar.impl.features.arrange.a.b):void");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public AttendeeInfoView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public AttendeeInfoView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* renamed from: a */
    public final void mo109012a(boolean z, boolean z2, boolean z3) {
        if (!z && !z2 && !z3) {
            ImageView imageView = (ImageView) mo109009a(R.id.ivSingleIcon);
            Intrinsics.checkExpressionValueIsNotNull(imageView, "ivSingleIcon");
            imageView.setVisibility(4);
            ImageView imageView2 = (ImageView) mo109009a(R.id.ivSecondIcon);
            Intrinsics.checkExpressionValueIsNotNull(imageView2, "ivSecondIcon");
            imageView2.setVisibility(4);
        } else if (z3) {
            ((ImageView) mo109009a(R.id.ivSingleIcon)).setImageResource(R.drawable.ud_icon_work_time_colorful);
            ImageView imageView3 = (ImageView) mo109009a(R.id.ivSingleIcon);
            Intrinsics.checkExpressionValueIsNotNull(imageView3, "ivSingleIcon");
            imageView3.setVisibility(0);
            ((ImageView) mo109009a(R.id.ivSecondIcon)).setImageResource(R.drawable.icon_arrange_busy_wrap);
            ImageView imageView4 = (ImageView) mo109009a(R.id.ivSecondIcon);
            Intrinsics.checkExpressionValueIsNotNull(imageView4, "ivSecondIcon");
            imageView4.setVisibility(0);
            ImageView imageView5 = (ImageView) mo109009a(R.id.ivSingleIcon);
            Intrinsics.checkExpressionValueIsNotNull(imageView5, "ivSingleIcon");
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(imageView5.getLayoutParams());
            layoutParams.leftMargin = C57582a.m223601a(getContext(), 39.0f);
            layoutParams.topMargin = C57582a.m223601a(getContext(), 40.0f);
            ImageView imageView6 = (ImageView) mo109009a(R.id.ivSingleIcon);
            Intrinsics.checkExpressionValueIsNotNull(imageView6, "ivSingleIcon");
            imageView6.setLayoutParams(layoutParams);
        } else {
            ImageView imageView7 = (ImageView) mo109009a(R.id.ivSingleIcon);
            Intrinsics.checkExpressionValueIsNotNull(imageView7, "ivSingleIcon");
            imageView7.setVisibility(0);
            ImageView imageView8 = (ImageView) mo109009a(R.id.ivSecondIcon);
            Intrinsics.checkExpressionValueIsNotNull(imageView8, "ivSecondIcon");
            imageView8.setVisibility(4);
            ImageView imageView9 = (ImageView) mo109009a(R.id.ivSingleIcon);
            Intrinsics.checkExpressionValueIsNotNull(imageView9, "ivSingleIcon");
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(imageView9.getLayoutParams());
            layoutParams2.leftMargin = C57582a.m223601a(getContext(), 31.0f);
            layoutParams2.topMargin = C57582a.m223601a(getContext(), 40.0f);
            ImageView imageView10 = (ImageView) mo109009a(R.id.ivSingleIcon);
            Intrinsics.checkExpressionValueIsNotNull(imageView10, "ivSingleIcon");
            imageView10.setLayoutParams(layoutParams2);
            if (z) {
                ((ImageView) mo109009a(R.id.ivSingleIcon)).setImageResource(R.drawable.icon_arrange_busy_wrap);
            } else if (z2) {
                ((ImageView) mo109009a(R.id.ivSingleIcon)).setImageResource(R.drawable.ud_icon_work_time_colorful);
            }
        }
    }

    /* renamed from: a */
    public final boolean mo109013a(String str, String str2, boolean z) {
        Intrinsics.checkParameterIsNotNull(str, "timeStr");
        Intrinsics.checkParameterIsNotNull(str2, "timeZoneStr");
        TextView textView = (TextView) mo109009a(R.id.attendeeTime);
        Intrinsics.checkExpressionValueIsNotNull(textView, "attendeeTime");
        textView.setText(str + ' ' + str2);
        TextView textView2 = (TextView) mo109009a(R.id.attendeeTime);
        Intrinsics.checkExpressionValueIsNotNull(textView2, "attendeeTime");
        boolean z2 = false;
        textView2.setVisibility(0);
        TextView textView3 = (TextView) mo109009a(R.id.attendeeWeek);
        Intrinsics.checkExpressionValueIsNotNull(textView3, "attendeeWeek");
        textView3.setVisibility(8);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ((TextView) mo109009a(R.id.attendeeTime)).measure(makeMeasureSpec, makeMeasureSpec);
        TextView textView4 = (TextView) mo109009a(R.id.attendeeTime);
        Intrinsics.checkExpressionValueIsNotNull(textView4, "attendeeTime");
        int measuredWidth = textView4.getMeasuredWidth();
        measure(makeMeasureSpec, makeMeasureSpec);
        if (measuredWidth >= getWidth() - C57582a.m223601a(getContext(), 8.0f) || z) {
            TextView textView5 = (TextView) mo109009a(R.id.attendeeTime);
            Intrinsics.checkExpressionValueIsNotNull(textView5, "attendeeTime");
            textView5.setText(str);
            TextView textView6 = (TextView) mo109009a(R.id.attendeeWeek);
            Intrinsics.checkExpressionValueIsNotNull(textView6, "attendeeWeek");
            textView6.setText(str2);
            ((TextView) mo109009a(R.id.attendeeTime)).measure(makeMeasureSpec, makeMeasureSpec);
            ((TextView) mo109009a(R.id.attendeeWeek)).measure(makeMeasureSpec, makeMeasureSpec);
            TextView textView7 = (TextView) mo109009a(R.id.attendeeWeek);
            Intrinsics.checkExpressionValueIsNotNull(textView7, "attendeeWeek");
            textView7.setVisibility(0);
            z2 = true;
        }
        TextView textView8 = (TextView) mo109009a(R.id.attendeeTime);
        Intrinsics.checkExpressionValueIsNotNull(textView8, "attendeeTime");
        int measuredWidth2 = textView8.getMeasuredWidth();
        SelectableRoundedImageView selectableRoundedImageView = (SelectableRoundedImageView) mo109009a(R.id.ivAttendeeAvatar);
        Intrinsics.checkExpressionValueIsNotNull(selectableRoundedImageView, "ivAttendeeAvatar");
        if (measuredWidth2 <= selectableRoundedImageView.getMeasuredWidth()) {
            TextView textView9 = (TextView) mo109009a(R.id.attendeeNameTV);
            Intrinsics.checkExpressionValueIsNotNull(textView9, "attendeeNameTV");
            int measuredWidth3 = textView9.getMeasuredWidth();
            SelectableRoundedImageView selectableRoundedImageView2 = (SelectableRoundedImageView) mo109009a(R.id.ivAttendeeAvatar);
            Intrinsics.checkExpressionValueIsNotNull(selectableRoundedImageView2, "ivAttendeeAvatar");
            if (measuredWidth3 <= selectableRoundedImageView2.getMeasuredWidth()) {
                TextView textView10 = (TextView) mo109009a(R.id.attendeeWeek);
                Intrinsics.checkExpressionValueIsNotNull(textView10, "attendeeWeek");
                int measuredWidth4 = textView10.getMeasuredWidth();
                SelectableRoundedImageView selectableRoundedImageView3 = (SelectableRoundedImageView) mo109009a(R.id.ivAttendeeAvatar);
                Intrinsics.checkExpressionValueIsNotNull(selectableRoundedImageView3, "ivAttendeeAvatar");
                if (measuredWidth4 <= selectableRoundedImageView3.getMeasuredWidth()) {
                    TextView textView11 = (TextView) mo109009a(R.id.attendeeNameTV);
                    Intrinsics.checkExpressionValueIsNotNull(textView11, "attendeeNameTV");
                    textView11.setGravity(17);
                    TextView textView12 = (TextView) mo109009a(R.id.attendeeTime);
                    Intrinsics.checkExpressionValueIsNotNull(textView12, "attendeeTime");
                    textView12.setGravity(17);
                    TextView textView13 = (TextView) mo109009a(R.id.attendeeWeek);
                    Intrinsics.checkExpressionValueIsNotNull(textView13, "attendeeWeek");
                    textView13.setGravity(17);
                    mo109016d();
                    return z2;
                }
            }
        }
        TextView textView14 = (TextView) mo109009a(R.id.attendeeNameTV);
        Intrinsics.checkExpressionValueIsNotNull(textView14, "attendeeNameTV");
        textView14.setGravity(3);
        TextView textView15 = (TextView) mo109009a(R.id.attendeeTime);
        Intrinsics.checkExpressionValueIsNotNull(textView15, "attendeeTime");
        textView15.setGravity(3);
        TextView textView16 = (TextView) mo109009a(R.id.attendeeWeek);
        Intrinsics.checkExpressionValueIsNotNull(textView16, "attendeeWeek");
        textView16.setGravity(3);
        mo109016d();
        return z2;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AttendeeInfoView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f75471a = "";
        LayoutInflater.from(context).inflate(R.layout.arrange_attendee_avatar_name, (ViewGroup) this, true);
        ((SelectableRoundedImageView) mo109009a(R.id.ivAttendeeAvatar)).setOnClickListener(new View.OnClickListener(this) {
            /* class com.ss.android.lark.calendar.impl.features.arrange.arrangetime.widget.AttendeeInfoView.View$OnClickListenerC302101 */

            /* renamed from: a */
            final /* synthetic */ AttendeeInfoView f75476a;

            {
                this.f75476a = r1;
            }

            public final void onClick(View view) {
                this.f75476a.mo109010a();
                ClickLeftListener aVar = this.f75476a.f75472b;
                if (aVar != null) {
                    aVar.mo109008b(this.f75476a.f75471a);
                }
            }
        });
        ((ImageView) mo109009a(R.id.ivLeftArrow)).setOnClickListener(new View.OnClickListener(this) {
            /* class com.ss.android.lark.calendar.impl.features.arrange.arrangetime.widget.AttendeeInfoView.View$OnClickListenerC302112 */

            /* renamed from: a */
            final /* synthetic */ AttendeeInfoView f75477a;

            {
                this.f75477a = r1;
            }

            public final void onClick(View view) {
                this.f75477a.mo109014b();
                ClickLeftListener aVar = this.f75477a.f75472b;
                if (aVar != null) {
                    aVar.mo109007a(this.f75477a.f75471a);
                }
            }
        });
        ((ImageView) mo109009a(R.id.ivAddAttendee)).setOnClickListener(new View.OnClickListener(this) {
            /* class com.ss.android.lark.calendar.impl.features.arrange.arrangetime.widget.AttendeeInfoView.View$OnClickListenerC302123 */

            /* renamed from: a */
            final /* synthetic */ AttendeeInfoView f75478a;

            {
                this.f75478a = r1;
            }

            public final void onClick(View view) {
                ClickLeftListener aVar = this.f75478a.f75472b;
                if (aVar != null) {
                    aVar.mo109006a();
                }
            }
        });
    }
}
