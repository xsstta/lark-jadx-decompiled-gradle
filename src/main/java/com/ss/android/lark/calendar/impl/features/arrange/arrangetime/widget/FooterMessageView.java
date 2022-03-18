package com.ss.android.lark.calendar.impl.features.arrange.arrangetime.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.arrange.arrangetime.model.ArrangeConflictUnit;
import com.ss.android.lark.calendar.impl.features.calendarview.CalendarDate;
import com.ss.android.lark.calendar.impl.features.events.detail.widget.TimeShowTextView;
import com.ss.android.lark.calendar.impl.utils.C32634ae;
import com.ss.android.lark.calendar.impl.utils.C32646c;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u001aB\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nB)\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0002\u0010\fJ\u0016\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012J\u000e\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0016J\u0006\u0010\u0017\u001a\u00020\u0010J\u0010\u0010\u0018\u001a\u00020\u00102\b\u0010\u0019\u001a\u0004\u0018\u00010\u000eR\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/arrange/arrangetime/widget/FooterMessageView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "mClickListener", "Lcom/ss/android/lark/calendar/impl/features/arrange/arrangetime/widget/FooterMessageView$OnClickListener;", "bindDate", "", "startDateTime", "Lcom/ss/android/lark/calendar/impl/features/calendarview/CalendarDate;", "endDateTime", "bindResult", "result", "Lcom/ss/android/lark/calendar/impl/features/arrange/arrangetime/model/ArrangeConflictUnit;", "hideFinishIcon", "setClickListener", "listener", "OnClickListener", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class FooterMessageView extends LinearLayout {

    /* renamed from: a */
    public OnClickListener f75515a;

    /* renamed from: b */
    private HashMap f75516b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/arrange/arrangetime/widget/FooterMessageView$OnClickListener;", "", "onFinishClick", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.arrange.arrangetime.widget.FooterMessageView$a */
    public interface OnClickListener {
        /* renamed from: a */
        void mo108958a();
    }

    /* renamed from: a */
    public View mo109057a(int i) {
        if (this.f75516b == null) {
            this.f75516b = new HashMap();
        }
        View view = (View) this.f75516b.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f75516b.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: a */
    public final void mo109058a() {
        ImageView imageView = (ImageView) mo109057a(R.id.ivFinish);
        Intrinsics.checkExpressionValueIsNotNull(imageView, "ivFinish");
        imageView.setVisibility(8);
    }

    public final void setClickListener(OnClickListener aVar) {
        this.f75515a = aVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public FooterMessageView(Context context) {
        this(context, null);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* renamed from: a */
    public final void mo109059a(ArrangeConflictUnit arrangeConflictUnit) {
        Intrinsics.checkParameterIsNotNull(arrangeConflictUnit, "result");
        if (arrangeConflictUnit.isShowInWorkHourFormat()) {
            TextView textView = (TextView) mo109057a(R.id.tvGuestStart);
            Intrinsics.checkExpressionValueIsNotNull(textView, "tvGuestStart");
            textView.setText(C32634ae.m125180a(R.plurals.Calendar_Plural_GuestOnBusy, arrangeConflictUnit.getConflictGuestNum()));
            LinearLayout linearLayout = (LinearLayout) mo109057a(R.id.llWorkHourFormat);
            Intrinsics.checkExpressionValueIsNotNull(linearLayout, "llWorkHourFormat");
            linearLayout.setVisibility(0);
            TextView textView2 = (TextView) mo109057a(R.id.tvResultStatus);
            Intrinsics.checkExpressionValueIsNotNull(textView2, "tvResultStatus");
            textView2.setVisibility(8);
            if (arrangeConflictUnit.getHasBusyAttendee() && arrangeConflictUnit.getHasOutWorkHourAttendee()) {
                ImageView imageView = (ImageView) mo109057a(R.id.imgNotWork);
                Intrinsics.checkExpressionValueIsNotNull(imageView, "imgNotWork");
                imageView.setVisibility(0);
                TextView textView3 = (TextView) mo109057a(R.id.tvNotWork);
                Intrinsics.checkExpressionValueIsNotNull(textView3, "tvNotWork");
                textView3.setVisibility(0);
                ImageView imageView2 = (ImageView) mo109057a(R.id.imgBusy);
                Intrinsics.checkExpressionValueIsNotNull(imageView2, "imgBusy");
                imageView2.setVisibility(0);
                TextView textView4 = (TextView) mo109057a(R.id.tvBusy);
                Intrinsics.checkExpressionValueIsNotNull(textView4, "tvBusy");
                textView4.setVisibility(0);
                TextView textView5 = (TextView) mo109057a(R.id.tvDivider);
                Intrinsics.checkExpressionValueIsNotNull(textView5, "tvDivider");
                textView5.setVisibility(0);
            } else if (arrangeConflictUnit.getHasOutWorkHourAttendee()) {
                ImageView imageView3 = (ImageView) mo109057a(R.id.imgNotWork);
                Intrinsics.checkExpressionValueIsNotNull(imageView3, "imgNotWork");
                imageView3.setVisibility(0);
                TextView textView6 = (TextView) mo109057a(R.id.tvNotWork);
                Intrinsics.checkExpressionValueIsNotNull(textView6, "tvNotWork");
                textView6.setVisibility(0);
                ImageView imageView4 = (ImageView) mo109057a(R.id.imgBusy);
                Intrinsics.checkExpressionValueIsNotNull(imageView4, "imgBusy");
                imageView4.setVisibility(8);
                TextView textView7 = (TextView) mo109057a(R.id.tvBusy);
                Intrinsics.checkExpressionValueIsNotNull(textView7, "tvBusy");
                textView7.setVisibility(8);
                TextView textView8 = (TextView) mo109057a(R.id.tvDivider);
                Intrinsics.checkExpressionValueIsNotNull(textView8, "tvDivider");
                textView8.setVisibility(8);
            } else if (arrangeConflictUnit.getHasBusyAttendee()) {
                ImageView imageView5 = (ImageView) mo109057a(R.id.imgNotWork);
                Intrinsics.checkExpressionValueIsNotNull(imageView5, "imgNotWork");
                imageView5.setVisibility(8);
                TextView textView9 = (TextView) mo109057a(R.id.tvNotWork);
                Intrinsics.checkExpressionValueIsNotNull(textView9, "tvNotWork");
                textView9.setVisibility(8);
                ImageView imageView6 = (ImageView) mo109057a(R.id.imgBusy);
                Intrinsics.checkExpressionValueIsNotNull(imageView6, "imgBusy");
                imageView6.setVisibility(0);
                TextView textView10 = (TextView) mo109057a(R.id.tvBusy);
                Intrinsics.checkExpressionValueIsNotNull(textView10, "tvBusy");
                textView10.setVisibility(0);
                TextView textView11 = (TextView) mo109057a(R.id.tvDivider);
                Intrinsics.checkExpressionValueIsNotNull(textView11, "tvDivider");
                textView11.setVisibility(8);
            }
        } else {
            LinearLayout linearLayout2 = (LinearLayout) mo109057a(R.id.llWorkHourFormat);
            Intrinsics.checkExpressionValueIsNotNull(linearLayout2, "llWorkHourFormat");
            linearLayout2.setVisibility(8);
            TextView textView12 = (TextView) mo109057a(R.id.tvResultStatus);
            Intrinsics.checkExpressionValueIsNotNull(textView12, "tvResultStatus");
            textView12.setVisibility(0);
            TextView textView13 = (TextView) mo109057a(R.id.tvResultStatus);
            Intrinsics.checkExpressionValueIsNotNull(textView13, "tvResultStatus");
            textView13.setText(arrangeConflictUnit.getConflictStr());
            int a = C32634ae.m125178a(R.color.lkui_N600);
            int i = C30234a.f75565a[arrangeConflictUnit.getConflictColor().ordinal()];
            if (i == 1) {
                a = C32634ae.m125178a(R.color.lkui_B500);
            } else if (i == 2) {
                a = C32634ae.m125178a(R.color.lkui_R500);
            } else if (i == 3) {
                a = C32634ae.m125178a(R.color.lkui_N500);
            }
            ((TextView) mo109057a(R.id.tvResultStatus)).setTextColor(a);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public FooterMessageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* renamed from: a */
    public final void mo109060a(CalendarDate calendarDate, CalendarDate calendarDate2) {
        Intrinsics.checkParameterIsNotNull(calendarDate, "startDateTime");
        Intrinsics.checkParameterIsNotNull(calendarDate2, "endDateTime");
        TimeShowTextView timeShowTextView = (TimeShowTextView) mo109057a(R.id.tvSelectDate);
        Intrinsics.checkExpressionValueIsNotNull(timeShowTextView, "tvSelectDate");
        timeShowTextView.setText(C32646c.m125248a(calendarDate.getTimeInMilliSeconds(), calendarDate2.getTimeInMilliSeconds(), calendarDate.getTimeZone(), false));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public FooterMessageView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FooterMessageView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Intrinsics.checkParameterIsNotNull(context, "context");
        LayoutInflater.from(context).inflate(R.layout.arrange_footer_message, (ViewGroup) this, true);
        ((ImageView) mo109057a(R.id.ivFinish)).setOnClickListener(new View.OnClickListener(this) {
            /* class com.ss.android.lark.calendar.impl.features.arrange.arrangetime.widget.FooterMessageView.View$OnClickListenerC302221 */

            /* renamed from: a */
            final /* synthetic */ FooterMessageView f75517a;

            {
                this.f75517a = r1;
            }

            public final void onClick(View view) {
                OnClickListener aVar = this.f75517a.f75515a;
                if (aVar != null) {
                    aVar.mo108958a();
                }
            }
        });
    }
}
