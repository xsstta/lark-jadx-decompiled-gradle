package com.ss.android.lark.calendar.impl.features.events.edit.container;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.calendarview.CalendarDate;
import com.ss.android.lark.calendar.impl.features.events.edit.helper.MeetingRoomStrategyHelper;
import com.ss.android.lark.calendar.impl.features.events.edit.listener.view.IDetailItemListener;
import com.ss.android.lark.calendar.impl.features.events.edit.listener.view.IHideFeatureListener;
import com.ss.android.lark.calendar.impl.utils.C32634ae;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u001b\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0011\u001a\u00020\u0012H\u0002J\b\u0010\u0013\u001a\u00020\u0012H\u0002J\u0006\u0010\u0014\u001a\u00020\bJ\u0006\u0010\u0015\u001a\u00020\u0012J\u000e\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u000bJ\u000e\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\rJ\u0010\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\u000e\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u001e\u001a\u00020\u001cJ\u000e\u0010\u001f\u001a\u00020\u00122\u0006\u0010 \u001a\u00020\u001cJ\u0010\u0010!\u001a\u00020\u00122\u0006\u0010\"\u001a\u00020\u001cH\u0002J\u000e\u0010#\u001a\u00020\u00122\u0006\u0010$\u001a\u00020\bJ\u0006\u0010%\u001a\u00020\u0012J\u0010\u0010&\u001a\u00020\u00122\u0006\u0010'\u001a\u00020(H\u0016J2\u0010)\u001a\u00020\u00122\u0006\u0010*\u001a\u00020\b2\b\u0010+\u001a\u0004\u0018\u00010,2\b\u0010-\u001a\u0004\u0018\u00010\u001c2\u0006\u0010.\u001a\u00020\b2\u0006\u0010/\u001a\u00020(J\u0006\u00100\u001a\u00020\u0012R\u0011\u0010\u0007\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX.¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX.¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000¨\u00061"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/container/RepeatContainer;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "isChangeTipShow", "", "()Z", "mDetailItemListener", "Lcom/ss/android/lark/calendar/impl/features/events/edit/listener/view/IDetailItemListener;", "mHideFeatureListener", "Lcom/ss/android/lark/calendar/impl/features/events/edit/listener/view/IHideFeatureListener;", "mIsChangeTipShow", "mIsEditable", "mIsRepeatEndUsable", "initListener", "", "initView", "isRepeatEndUsable", "judgeToShowGoogleCountRuleRepeatEndDesc", "setDetailItemListener", "detailItemListener", "setOnHideListener", "hideFeatureListener", "setRepeatContainerEndText", "repeatEndTip", "", "setRepeatDesc", "repeat", "setRepeatEndDesc", "repeatEnd", "setRepeatEndInvalidText", "repeatEndLimitStr", "setRepeatEndUsable", "repeatEndUsable", "setUnEditable", "setVisibility", "visibility", "", "showInvalidateRepeatEndStatus", "isShowInvalidateStatus", "repeatEndLimitDate", "Lcom/ss/android/lark/calendar/impl/features/calendarview/CalendarDate;", "repeatEndLimitMtRoomName", "isRepeatEndBeforeStart", "meetingRoomSize", "showValidateRepeatEndStatus", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class RepeatContainer extends LinearLayout {

    /* renamed from: a */
    public boolean f80150a;

    /* renamed from: b */
    public IDetailItemListener f80151b;

    /* renamed from: c */
    public IHideFeatureListener f80152c;

    /* renamed from: d */
    private boolean f80153d;

    /* renamed from: e */
    private boolean f80154e;

    /* renamed from: f */
    private HashMap f80155f;

    public RepeatContainer(Context context) {
        this(context, null, 2, null);
    }

    /* renamed from: a */
    public View mo114820a(int i) {
        if (this.f80155f == null) {
            this.f80155f = new HashMap();
        }
        View view = (View) this.f80155f.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f80155f.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: a */
    public final boolean mo114822a() {
        return this.f80153d;
    }

    /* renamed from: e */
    private final void m119167e() {
        ((TextView) mo114820a(R.id.tv_repeat)).setOnClickListener(new View$OnClickListenerC31605a(this));
        ((TextView) mo114820a(R.id.tv_repeat_end)).setOnClickListener(new View$OnClickListenerC31606b(this));
        ((LinearLayout) mo114820a(R.id.ll_delete_container)).setOnClickListener(new View$OnClickListenerC31607c(this));
    }

    /* renamed from: f */
    private final void m119168f() {
        LayoutInflater.from(getContext()).inflate(R.layout.view_event_repeat_container, this);
        String b = C32634ae.m125182b(R.string.Calendar_Edit_Within730Day);
        Intrinsics.checkExpressionValueIsNotNull(b, "ResUtil.getString(R.stri…lendar_Edit_Within730Day)");
        setRepeatContainerEndText(b);
    }

    /* renamed from: c */
    public final void mo114824c() {
        ((TextView) mo114820a(R.id.tv_repeat_end)).setTextColor(C32634ae.m125178a(R.color.text_title));
        RelativeLayout relativeLayout = (RelativeLayout) mo114820a(R.id.ll_change_repeat_end_date);
        Intrinsics.checkExpressionValueIsNotNull(relativeLayout, "ll_change_repeat_end_date");
        relativeLayout.setVisibility(8);
        this.f80153d = false;
    }

    /* renamed from: d */
    public final void mo114825d() {
        this.f80150a = false;
        setEnabled(false);
        LinearLayout linearLayout = (LinearLayout) mo114820a(R.id.ll_delete_container);
        Intrinsics.checkExpressionValueIsNotNull(linearLayout, "ll_delete_container");
        linearLayout.setVisibility(8);
        ((TextView) mo114820a(R.id.tv_repeat)).setTextColor(C32634ae.m125178a(R.color.text_placeholder));
        ((TextView) mo114820a(R.id.tv_repeat_end)).setTextColor(C32634ae.m125178a(R.color.text_placeholder));
    }

    /* renamed from: b */
    public final void mo114823b() {
        if (this.f80154e) {
            ((TextView) mo114820a(R.id.tv_repeat_end)).setTextColor(C32634ae.m125178a(R.color.text_title));
            TextView textView = (TextView) mo114820a(R.id.tv_repeat_end);
            Intrinsics.checkExpressionValueIsNotNull(textView, "tv_repeat_end");
            textView.setClickable(true);
            return;
        }
        ((TextView) mo114820a(R.id.tv_repeat_end)).setTextColor(C32634ae.m125178a(R.color.text_disable));
        TextView textView2 = (TextView) mo114820a(R.id.tv_repeat_end);
        Intrinsics.checkExpressionValueIsNotNull(textView2, "tv_repeat_end");
        textView2.setText(getResources().getString(R.string.Calendar_RRule_NeverEnds));
        TextView textView3 = (TextView) mo114820a(R.id.tv_repeat_end);
        Intrinsics.checkExpressionValueIsNotNull(textView3, "tv_repeat_end");
        textView3.setClickable(false);
    }

    public final void setRepeatEndUsable(boolean z) {
        this.f80154e = z;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/edit/container/RepeatContainer$setRepeatContainerEndText$clickableSpan$1", "Landroid/text/style/ClickableSpan;", "onClick", "", "view", "Landroid/view/View;", "updateDrawState", "ds", "Landroid/text/TextPaint;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.container.RepeatContainer$d */
    public static final class C31608d extends ClickableSpan {

        /* renamed from: a */
        final /* synthetic */ RepeatContainer f80159a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C31608d(RepeatContainer repeatContainer) {
            this.f80159a = repeatContainer;
        }

        public void onClick(View view) {
            Intrinsics.checkParameterIsNotNull(view, "view");
            RepeatContainer.m119165a(this.f80159a).mo114370d();
        }

        public void updateDrawState(TextPaint textPaint) {
            Intrinsics.checkParameterIsNotNull(textPaint, "ds");
            super.updateDrawState(textPaint);
            textPaint.setColor(C32634ae.m125178a(R.color.primary_pri_500));
            textPaint.setUnderlineText(false);
            textPaint.clearShadowLayer();
        }
    }

    public final void setDetailItemListener(IDetailItemListener bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "detailItemListener");
        this.f80151b = bVar;
    }

    public final void setOnHideListener(IHideFeatureListener cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "hideFeatureListener");
        this.f80152c = cVar;
    }

    /* renamed from: a */
    public static final /* synthetic */ IDetailItemListener m119165a(RepeatContainer repeatContainer) {
        IDetailItemListener bVar = repeatContainer.f80151b;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDetailItemListener");
        }
        return bVar;
    }

    /* renamed from: b */
    public static final /* synthetic */ IHideFeatureListener m119166b(RepeatContainer repeatContainer) {
        IHideFeatureListener cVar = repeatContainer.f80152c;
        if (cVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mHideFeatureListener");
        }
        return cVar;
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        IHideFeatureListener cVar = this.f80152c;
        if (cVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mHideFeatureListener");
        }
        cVar.mo114309a();
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.container.RepeatContainer$a */
    public static final class View$OnClickListenerC31605a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ RepeatContainer f80156a;

        View$OnClickListenerC31605a(RepeatContainer repeatContainer) {
            this.f80156a = repeatContainer;
        }

        public final void onClick(View view) {
            if (this.f80156a.f80150a) {
                RepeatContainer.m119165a(this.f80156a).mo114360a(14);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.container.RepeatContainer$b */
    public static final class View$OnClickListenerC31606b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ RepeatContainer f80157a;

        View$OnClickListenerC31606b(RepeatContainer repeatContainer) {
            this.f80157a = repeatContainer;
        }

        public final void onClick(View view) {
            if (this.f80157a.f80150a) {
                RepeatContainer.m119165a(this.f80157a).mo114360a(16);
            }
        }
    }

    private final void setRepeatEndInvalidText(String str) {
        TextView textView = (TextView) mo114820a(R.id.tv_change_repeat_end_date);
        Intrinsics.checkExpressionValueIsNotNull(textView, "tv_change_repeat_end_date");
        textView.setText(str);
    }

    public final void setRepeatDesc(String str) {
        Intrinsics.checkParameterIsNotNull(str, "repeat");
        TextView textView = (TextView) mo114820a(R.id.tv_repeat);
        Intrinsics.checkExpressionValueIsNotNull(textView, "tv_repeat");
        textView.setText(str);
    }

    public final void setRepeatEndDesc(String str) {
        Intrinsics.checkParameterIsNotNull(str, "repeatEnd");
        TextView textView = (TextView) mo114820a(R.id.tv_repeat_end);
        Intrinsics.checkExpressionValueIsNotNull(textView, "tv_repeat_end");
        textView.setText(str);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.container.RepeatContainer$c */
    public static final class View$OnClickListenerC31607c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ RepeatContainer f80158a;

        View$OnClickListenerC31607c(RepeatContainer repeatContainer) {
            this.f80158a = repeatContainer;
        }

        public final void onClick(View view) {
            this.f80158a.setVisibility(8);
            TextView textView = (TextView) this.f80158a.mo114820a(R.id.tv_repeat_end);
            Intrinsics.checkExpressionValueIsNotNull(textView, "tv_repeat_end");
            textView.setText(this.f80158a.getResources().getString(R.string.Calendar_RRule_NeverEnds));
            RepeatContainer.m119166b(this.f80158a).mo114310a(14);
        }
    }

    private final void setRepeatContainerEndText(String str) {
        String str2 = str + C32634ae.m125182b(R.string.Calendar_Edit_AutoAdjust);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str2);
        spannableStringBuilder.setSpan(new C31608d(this), str.length(), str2.length(), 33);
        TextView textView = (TextView) mo114820a(R.id.tv_change_repeat_end_date);
        Intrinsics.checkExpressionValueIsNotNull(textView, "tv_change_repeat_end_date");
        textView.setText(spannableStringBuilder);
        TextView textView2 = (TextView) mo114820a(R.id.tv_change_repeat_end_date);
        Intrinsics.checkExpressionValueIsNotNull(textView2, "tv_change_repeat_end_date");
        textView2.setMovementMethod(LinkMovementMethod.getInstance());
        TextView textView3 = (TextView) mo114820a(R.id.tv_change_repeat_end_date);
        Intrinsics.checkExpressionValueIsNotNull(textView3, "tv_change_repeat_end_date");
        textView3.setHighlightColor(C32634ae.m125178a(R.color.transparent));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RepeatContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f80150a = true;
        this.f80154e = true;
        m119168f();
        m119167e();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RepeatContainer(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* renamed from: a */
    public final void mo114821a(boolean z, CalendarDate calendarDate, String str, boolean z2, int i) {
        ((TextView) mo114820a(R.id.tv_repeat_end)).setTextColor(C32634ae.m125178a(R.color.function_danger_500));
        if (z) {
            String a = MeetingRoomStrategyHelper.f79934a.mo114627a(calendarDate, str, z2, i);
            if (!z2) {
                setRepeatContainerEndText(a);
            } else {
                setRepeatEndInvalidText(a);
            }
            RelativeLayout relativeLayout = (RelativeLayout) mo114820a(R.id.ll_change_repeat_end_date);
            Intrinsics.checkExpressionValueIsNotNull(relativeLayout, "ll_change_repeat_end_date");
            relativeLayout.setVisibility(0);
            this.f80153d = true;
        }
    }
}
