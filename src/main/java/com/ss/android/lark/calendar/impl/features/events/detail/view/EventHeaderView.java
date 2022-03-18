package com.ss.android.lark.calendar.impl.features.events.detail.view;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.method.ScrollingMovementMethod;
import android.text.style.BackgroundColorSpan;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.ScaleAnimation;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.lark.pb.calendar.v1.CalendarEventDisplayInfo;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.component.ui.p1153e.C25653b;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.calendarview.widget.RequestLoadingDialog;
import com.ss.android.lark.calendar.impl.features.events.detail.ICalendarDetailContact;
import com.ss.android.lark.calendar.impl.features.events.detail.idata.IHeaderData;
import com.ss.android.lark.calendar.impl.features.events.detail.widget.C31475c;
import com.ss.android.lark.calendar.impl.features.events.detail.widget.C31481d;
import com.ss.android.lark.calendar.impl.features.events.detail.widget.MeetingViewContainer;
import com.ss.android.lark.calendar.impl.features.events.detail.widget.TimeShowTextView;
import com.ss.android.lark.calendar.impl.framework.hitpoint.event.GeneralHitPoint;
import com.ss.android.lark.calendar.impl.utils.C32632ac;
import com.ss.android.lark.calendar.impl.utils.C32634ae;
import com.ss.android.lark.calendar.impl.utils.C32673y;
import com.ss.android.lark.log.Log;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\u0018\u0000 *2\u00020\u0001:\u0001*B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\b\u0010\u0011\u001a\u00020\u0012H\u0002J\u000e\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0015J\u000e\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0015J\u0006\u0010\u0017\u001a\u00020\u0012J\u000e\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0015J\u0016\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u0010J\u000e\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0015J\u0018\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0002J\u0010\u0010!\u001a\u00020\u00122\u0006\u0010\"\u001a\u00020\u001eH\u0002J\u001a\u0010#\u001a\u00020\u00122\b\u0010$\u001a\u0004\u0018\u00010\u001e2\u0006\u0010%\u001a\u00020 H\u0002J\u0018\u0010&\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010'\u001a\u00020\u001eH\u0002J\u0006\u0010(\u001a\u00020\u0012J\u0006\u0010)\u001a\u00020\u0012R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX.¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X.¢\u0006\u0002\n\u0000¨\u0006+"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/detail/view/EventHeaderView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "mCopyToast", "Lcom/ss/android/lark/calendar/impl/features/calendarview/widget/RequestLoadingDialog;", "mHeaderData", "Lcom/ss/android/lark/calendar/impl/features/events/detail/idata/IHeaderData;", "mViewAction", "Lcom/ss/android/lark/calendar/impl/features/events/detail/ICalendarDetailContact$IDetailViewAction;", "initMeetingContainerListener", "", "refreshRule", "alpha", "", "refreshSummary", "refreshTime", "setDependency", "viewIn", "viewOut", "setMeetingContainerAlpha", "setRule", "rule", "", "isShowRule", "", "setSummary", "summary", "setTime", "timeStr", "isSameday", "showCompleteTextDialog", "allText", "showHeaderPanel", "showMeetingContainer", "Companion", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class EventHeaderView extends LinearLayout {

    /* renamed from: d */
    public static final Companion f79625d = new Companion(null);

    /* renamed from: a */
    public IHeaderData f79626a;

    /* renamed from: b */
    public ICalendarDetailContact.IDetailViewAction f79627b;

    /* renamed from: c */
    public RequestLoadingDialog f79628c;

    /* renamed from: e */
    private HashMap f79629e;

    /* renamed from: a */
    public View mo114076a(int i) {
        if (this.f79629e == null) {
            this.f79629e = new HashMap();
        }
        View view = (View) this.f79629e.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f79629e.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/detail/view/EventHeaderView$Companion;", "", "()V", "TAG", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.view.EventHeaderView$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\u0003H\u0016J\b\u0010\u000b\u001a\u00020\u0003H\u0016¨\u0006\f"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/detail/view/EventHeaderView$setSummary$2", "Lcom/ss/android/lark/calendar/impl/features/events/detail/widget/CopyPopWindow$CopyPopWindowCallBack;", "finishCopy", "", "getCopyText", "", "ifShowPopWindow", "", "xLocation", "", "onPopWindowDismiss", "onPopWindowShow", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.view.EventHeaderView$f */
    public static final class C31430f implements C31475c.AbstractC31480a {

        /* renamed from: a */
        final /* synthetic */ EventHeaderView f79637a;

        /* renamed from: b */
        final /* synthetic */ String f79638b;

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.widget.C31475c.AbstractC31480a
        /* renamed from: a */
        public boolean mo114000a(int i) {
            return true;
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.widget.C31475c.AbstractC31480a
        /* renamed from: c */
        public String mo114002c() {
            return this.f79638b;
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.widget.C31475c.AbstractC31480a
        /* renamed from: d */
        public void mo114003d() {
            RequestLoadingDialog requestLoadingDialog = this.f79637a.f79628c;
            if (requestLoadingDialog != null) {
                requestLoadingDialog.mo112593d(R.string.Calendar_Share_Copied);
            }
            RequestLoadingDialog requestLoadingDialog2 = this.f79637a.f79628c;
            if (requestLoadingDialog2 != null) {
                requestLoadingDialog2.show();
            }
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.widget.C31475c.AbstractC31480a
        /* renamed from: a */
        public void mo113999a() {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f79638b);
            spannableStringBuilder.setSpan(new BackgroundColorSpan(C25653b.m91893a(C32634ae.m125178a(R.color.ud_N00), 0.66f)), 0, this.f79638b.length(), 33);
            TextView textView = (TextView) this.f79637a.mo114076a(R.id.summaryTV);
            Intrinsics.checkExpressionValueIsNotNull(textView, "summaryTV");
            textView.setText(spannableStringBuilder);
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.widget.C31475c.AbstractC31480a
        /* renamed from: b */
        public void mo114001b() {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f79638b);
            spannableStringBuilder.setSpan(new BackgroundColorSpan(0), 0, this.f79638b.length(), 33);
            TextView textView = (TextView) this.f79637a.mo114076a(R.id.summaryTV);
            Intrinsics.checkExpressionValueIsNotNull(textView, "summaryTV");
            textView.setText(spannableStringBuilder);
        }

        C31430f(EventHeaderView eventHeaderView, String str) {
            this.f79637a = eventHeaderView;
            this.f79638b = str;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\u0003H\u0016J\b\u0010\u000b\u001a\u00020\u0003H\u0016¨\u0006\f"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/detail/view/EventHeaderView$setRule$2", "Lcom/ss/android/lark/calendar/impl/features/events/detail/widget/CopyPopWindow$CopyPopWindowCallBack;", "finishCopy", "", "getCopyText", "", "ifShowPopWindow", "", "xLocation", "", "onPopWindowDismiss", "onPopWindowShow", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.view.EventHeaderView$d */
    public static final class C31428d implements C31475c.AbstractC31480a {

        /* renamed from: a */
        final /* synthetic */ EventHeaderView f79633a;

        /* renamed from: b */
        final /* synthetic */ String f79634b;

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.widget.C31475c.AbstractC31480a
        /* renamed from: a */
        public boolean mo114000a(int i) {
            return true;
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.widget.C31475c.AbstractC31480a
        /* renamed from: c */
        public String mo114002c() {
            String str = this.f79634b;
            Intrinsics.checkExpressionValueIsNotNull(str, "parseResult");
            return str;
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.widget.C31475c.AbstractC31480a
        /* renamed from: d */
        public void mo114003d() {
            RequestLoadingDialog requestLoadingDialog = this.f79633a.f79628c;
            if (requestLoadingDialog != null) {
                requestLoadingDialog.mo112593d(R.string.Calendar_Share_Copied);
            }
            RequestLoadingDialog requestLoadingDialog2 = this.f79633a.f79628c;
            if (requestLoadingDialog2 != null) {
                requestLoadingDialog2.show();
            }
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.widget.C31475c.AbstractC31480a
        /* renamed from: a */
        public void mo113999a() {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f79634b);
            spannableStringBuilder.setSpan(new BackgroundColorSpan(C25653b.m91893a(C32634ae.m125178a(R.color.ud_N00), 0.66f)), 0, this.f79634b.length(), 33);
            TextView textView = (TextView) this.f79633a.mo114076a(R.id.ruleView);
            Intrinsics.checkExpressionValueIsNotNull(textView, "ruleView");
            textView.setText(spannableStringBuilder);
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.widget.C31475c.AbstractC31480a
        /* renamed from: b */
        public void mo114001b() {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f79634b);
            spannableStringBuilder.setSpan(new BackgroundColorSpan(0), 0, this.f79634b.length(), 33);
            TextView textView = (TextView) this.f79633a.mo114076a(R.id.ruleView);
            Intrinsics.checkExpressionValueIsNotNull(textView, "ruleView");
            textView.setText(spannableStringBuilder);
        }

        C31428d(EventHeaderView eventHeaderView, String str) {
            this.f79633a = eventHeaderView;
            this.f79634b = str;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0005\u001a\u00020\u0003H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/detail/view/EventHeaderView$initMeetingContainerListener$1", "Lcom/ss/android/lark/calendar/impl/features/events/detail/widget/MeetingViewContainer$MeetingViewClickListener;", "onClickMeetingGroup", "", "onClickMeetingMinute", "onClickMeetingVideo", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.view.EventHeaderView$b */
    public static final class C31426b implements MeetingViewContainer.MeetingViewClickListener {

        /* renamed from: a */
        final /* synthetic */ EventHeaderView f79630a;

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.widget.MeetingViewContainer.MeetingViewClickListener
        /* renamed from: b */
        public void mo114087b() {
            EventHeaderView.m118234a(this.f79630a).mo113556j();
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.widget.MeetingViewContainer.MeetingViewClickListener
        /* renamed from: a */
        public void mo114086a() {
            Log.m165389i("EventHeaderView", C32673y.m125369a("group"));
            EventHeaderView.m118234a(this.f79630a).mo113555i();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C31426b(EventHeaderView eventHeaderView) {
            this.f79630a = eventHeaderView;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\u0003H\u0016J\b\u0010\u000b\u001a\u00020\u0003H\u0016¨\u0006\f"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/detail/view/EventHeaderView$setTime$1", "Lcom/ss/android/lark/calendar/impl/features/events/detail/widget/CopyPopWindow$CopyPopWindowCallBack;", "finishCopy", "", "getCopyText", "", "ifShowPopWindow", "", "xLocation", "", "onPopWindowDismiss", "onPopWindowShow", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.view.EventHeaderView$g */
    public static final class C31431g implements C31475c.AbstractC31480a {

        /* renamed from: a */
        final /* synthetic */ EventHeaderView f79639a;

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.widget.C31475c.AbstractC31480a
        /* renamed from: c */
        public String mo114002c() {
            TimeShowTextView timeShowTextView = (TimeShowTextView) this.f79639a.mo114076a(R.id.timeView);
            Intrinsics.checkExpressionValueIsNotNull(timeShowTextView, "timeView");
            return timeShowTextView.getText().toString();
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.widget.C31475c.AbstractC31480a
        /* renamed from: d */
        public void mo114003d() {
            RequestLoadingDialog requestLoadingDialog = this.f79639a.f79628c;
            if (requestLoadingDialog != null) {
                requestLoadingDialog.mo112593d(R.string.Calendar_Share_Copied);
            }
            RequestLoadingDialog requestLoadingDialog2 = this.f79639a.f79628c;
            if (requestLoadingDialog2 != null) {
                requestLoadingDialog2.show();
            }
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.widget.C31475c.AbstractC31480a
        /* renamed from: b */
        public void mo114001b() {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(mo114002c());
            spannableStringBuilder.setSpan(new BackgroundColorSpan(0), 0, mo114002c().length(), 33);
            TimeShowTextView timeShowTextView = (TimeShowTextView) this.f79639a.mo114076a(R.id.timeView);
            Intrinsics.checkExpressionValueIsNotNull(timeShowTextView, "timeView");
            timeShowTextView.setText(spannableStringBuilder);
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.widget.C31475c.AbstractC31480a
        /* renamed from: a */
        public void mo113999a() {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(mo114002c());
            spannableStringBuilder.setSpan(new BackgroundColorSpan(C25653b.m91893a(C32634ae.m125178a(R.color.ud_N00), 0.66f)), 0, mo114002c().length(), 33);
            TimeShowTextView timeShowTextView = (TimeShowTextView) this.f79639a.mo114076a(R.id.timeView);
            Intrinsics.checkExpressionValueIsNotNull(timeShowTextView, "timeView");
            timeShowTextView.setText(spannableStringBuilder);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C31431g(EventHeaderView eventHeaderView) {
            this.f79639a = eventHeaderView;
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.widget.C31475c.AbstractC31480a
        /* renamed from: a */
        public boolean mo114000a(int i) {
            int a = ((TimeShowTextView) this.f79639a.mo114076a(R.id.timeView)).mo114200a();
            TimeShowTextView timeShowTextView = (TimeShowTextView) this.f79639a.mo114076a(R.id.timeView);
            Intrinsics.checkExpressionValueIsNotNull(timeShowTextView, "timeView");
            if (i <= a + timeShowTextView.getPaddingLeft()) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: d */
    private final void m118237d() {
        ((MeetingViewContainer) mo114076a(R.id.meetingContainer)).setClickListener(new C31426b(this));
    }

    /* renamed from: b */
    public final void mo114081b() {
        IHeaderData cVar = this.f79626a;
        if (cVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mHeaderData");
        }
        String c = cVar.mo113682c();
        IHeaderData cVar2 = this.f79626a;
        if (cVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mHeaderData");
        }
        m118235a(c, cVar2.mo113683d());
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/detail/view/EventHeaderView$showCompleteTextDialog$2", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "onGlobalLayout", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.view.EventHeaderView$i */
    public static final class ViewTreeObserver$OnGlobalLayoutListenerC31433i implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: a */
        final /* synthetic */ TextView f79641a;

        public void onGlobalLayout() {
            TextView textView = this.f79641a;
            Intrinsics.checkExpressionValueIsNotNull(textView, "textView");
            if (textView.getLineCount() <= 1) {
                TextView textView2 = this.f79641a;
                Intrinsics.checkExpressionValueIsNotNull(textView2, "textView");
                textView2.setGravity(17);
            } else {
                TextView textView3 = this.f79641a;
                Intrinsics.checkExpressionValueIsNotNull(textView3, "textView");
                textView3.setGravity(3);
            }
            TextView textView4 = this.f79641a;
            Intrinsics.checkExpressionValueIsNotNull(textView4, "textView");
            textView4.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }

        ViewTreeObserver$OnGlobalLayoutListenerC31433i(TextView textView) {
            this.f79641a = textView;
        }
    }

    /* renamed from: c */
    public final void mo114083c() {
        MeetingViewContainer meetingViewContainer = (MeetingViewContainer) mo114076a(R.id.meetingContainer);
        IHeaderData cVar = this.f79626a;
        if (cVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mHeaderData");
        }
        CalendarEventDisplayInfo.ButtonDisplayType i = cVar.mo113688i();
        IHeaderData cVar2 = this.f79626a;
        if (cVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mHeaderData");
        }
        CalendarEventDisplayInfo.ButtonDisplayType j = cVar2.mo113689j();
        IHeaderData cVar3 = this.f79626a;
        if (cVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mHeaderData");
        }
        boolean g = cVar3.mo113686g();
        IHeaderData cVar4 = this.f79626a;
        if (cVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mHeaderData");
        }
        meetingViewContainer.mo114191a(i, j, g, cVar4.mo113687h());
    }

    /* renamed from: a */
    public final void mo114077a() {
        IHeaderData cVar = this.f79626a;
        if (cVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mHeaderData");
        }
        setSummary(cVar.mo113681b());
        IHeaderData cVar2 = this.f79626a;
        if (cVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mHeaderData");
        }
        String c = cVar2.mo113682c();
        IHeaderData cVar3 = this.f79626a;
        if (cVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mHeaderData");
        }
        m118235a(c, cVar3.mo113683d());
        IHeaderData cVar4 = this.f79626a;
        if (cVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mHeaderData");
        }
        String f = cVar4.mo113685f();
        IHeaderData cVar5 = this.f79626a;
        if (cVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mHeaderData");
        }
        m118236b(f, cVar5.mo113684e());
        mo114083c();
        m118237d();
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.view.EventHeaderView$h */
    public static final class View$OnClickListenerC31432h implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ Dialog f79640a;

        View$OnClickListenerC31432h(Dialog dialog) {
            this.f79640a = dialog;
        }

        public final void onClick(View view) {
            Dialog dialog = this.f79640a;
            if (dialog != null && dialog.isShowing()) {
                this.f79640a.dismiss();
            }
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public EventHeaderView(Context context) {
        this(context, null);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* renamed from: a */
    public static final /* synthetic */ ICalendarDetailContact.IDetailViewAction m118234a(EventHeaderView eventHeaderView) {
        ICalendarDetailContact.IDetailViewAction cVar = eventHeaderView.f79627b;
        if (cVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewAction");
        }
        return cVar;
    }

    /* renamed from: a */
    public final void mo114078a(float f) {
        ((TextView) mo114076a(R.id.summaryTV)).setTextColor(Color.argb((int) (f * ((float) 255)), 255, 255, 255));
    }

    /* renamed from: c */
    public final void mo114084c(float f) {
        ((TextView) mo114076a(R.id.ruleView)).setTextColor(Color.argb((int) (f * ((float) 153)), 255, 255, 255));
    }

    public final void setMeetingContainerAlpha(float f) {
        MeetingViewContainer meetingViewContainer = (MeetingViewContainer) mo114076a(R.id.meetingContainer);
        Intrinsics.checkExpressionValueIsNotNull(meetingViewContainer, "meetingContainer");
        meetingViewContainer.setAlpha(f);
    }

    /* renamed from: b */
    public final void mo114082b(float f) {
        ((TimeShowTextView) mo114076a(R.id.timeView)).setTextColor(Color.argb((int) (f * ((float) 255)), 255, 255, 255));
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.view.EventHeaderView$c */
    public static final class View$OnClickListenerC31427c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ EventHeaderView f79631a;

        /* renamed from: b */
        final /* synthetic */ String f79632b;

        View$OnClickListenerC31427c(EventHeaderView eventHeaderView, String str) {
            this.f79631a = eventHeaderView;
            this.f79632b = str;
        }

        public final void onClick(View view) {
            int lineCount;
            TextView textView = (TextView) this.f79631a.mo114076a(R.id.ruleView);
            Intrinsics.checkExpressionValueIsNotNull(textView, "ruleView");
            Layout layout = textView.getLayout();
            if (layout != null && (lineCount = layout.getLineCount()) > 0 && layout.getEllipsisCount(lineCount - 1) > 0) {
                EventHeaderView eventHeaderView = this.f79631a;
                TextView textView2 = (TextView) eventHeaderView.mo114076a(R.id.ruleView);
                Intrinsics.checkExpressionValueIsNotNull(textView2, "ruleView");
                Context context = textView2.getContext();
                Intrinsics.checkExpressionValueIsNotNull(context, "ruleView.context");
                String str = this.f79632b;
                Intrinsics.checkExpressionValueIsNotNull(str, "parseResult");
                eventHeaderView.mo114079a(context, str);
                GeneralHitPoint.m124230b("repeat");
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.view.EventHeaderView$e */
    public static final class View$OnClickListenerC31429e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ EventHeaderView f79635a;

        /* renamed from: b */
        final /* synthetic */ String f79636b;

        View$OnClickListenerC31429e(EventHeaderView eventHeaderView, String str) {
            this.f79635a = eventHeaderView;
            this.f79636b = str;
        }

        public final void onClick(View view) {
            int lineCount;
            TextView textView = (TextView) this.f79635a.mo114076a(R.id.summaryTV);
            Intrinsics.checkExpressionValueIsNotNull(textView, "summaryTV");
            Layout layout = textView.getLayout();
            if (layout != null && (lineCount = layout.getLineCount()) > 0 && layout.getEllipsisCount(lineCount - 1) > 0) {
                EventHeaderView eventHeaderView = this.f79635a;
                TextView textView2 = (TextView) eventHeaderView.mo114076a(R.id.summaryTV);
                Intrinsics.checkExpressionValueIsNotNull(textView2, "summaryTV");
                Context context = textView2.getContext();
                Intrinsics.checkExpressionValueIsNotNull(context, "summaryTV.context");
                eventHeaderView.mo114079a(context, this.f79636b);
                GeneralHitPoint.m124230b("title");
            }
        }
    }

    private final void setSummary(String str) {
        TextView textView = (TextView) mo114076a(R.id.summaryTV);
        Intrinsics.checkExpressionValueIsNotNull(textView, "summaryTV");
        textView.setText(str);
        ((TextView) mo114076a(R.id.summaryTV)).setOnClickListener(new View$OnClickListenerC31429e(this, str));
        TextView textView2 = (TextView) mo114076a(R.id.summaryTV);
        Intrinsics.checkExpressionValueIsNotNull(textView2, "summaryTV");
        C31481d.m118441a((TextView) mo114076a(R.id.summaryTV), new C31430f(this, textView2.getText().toString()));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public EventHeaderView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* renamed from: a */
    private final void m118235a(String str, boolean z) {
        ((TimeShowTextView) mo114076a(R.id.timeView)).mo114201a(str, z);
        TimeShowTextView timeShowTextView = (TimeShowTextView) mo114076a(R.id.timeView);
        Intrinsics.checkExpressionValueIsNotNull(timeShowTextView, "timeView");
        timeShowTextView.setVisibility(0);
        C31481d.m118441a((TimeShowTextView) mo114076a(R.id.timeView), new C31431g(this));
    }

    /* renamed from: b */
    private final void m118236b(String str, boolean z) {
        if (!z) {
            TextView textView = (TextView) mo114076a(R.id.ruleView);
            Intrinsics.checkExpressionValueIsNotNull(textView, "ruleView");
            textView.setVisibility(8);
            return;
        }
        TextView textView2 = (TextView) mo114076a(R.id.ruleView);
        Intrinsics.checkExpressionValueIsNotNull(textView2, "ruleView");
        textView2.setVisibility(0);
        String b = C32632ac.m125171b(str);
        TextView textView3 = (TextView) mo114076a(R.id.ruleView);
        Intrinsics.checkExpressionValueIsNotNull(textView3, "ruleView");
        textView3.setText(b);
        ((TextView) mo114076a(R.id.ruleView)).setOnClickListener(new View$OnClickListenerC31427c(this, b));
        C31481d.m118441a((TextView) mo114076a(R.id.ruleView), new C31428d(this, b));
    }

    /* renamed from: a */
    public final void mo114079a(Context context, String str) {
        WindowManager.LayoutParams attributes;
        Dialog dialog = new Dialog(context, R.style.CalendarCopyDialogStyle);
        Window window = dialog.getWindow();
        if (window != null) {
            window.setContentView(View.inflate(context, R.layout.dialog_calendar_detail_text, null));
        }
        TextView textView = (TextView) dialog.findViewById(R.id.calendar_dialog_text);
        ((ViewGroup) dialog.findViewById(R.id.calendar_dialog_root)).setOnClickListener(new View$OnClickListenerC31432h(dialog));
        Intrinsics.checkExpressionValueIsNotNull(textView, "textView");
        textView.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver$OnGlobalLayoutListenerC31433i(textView));
        textView.setMovementMethod(ScrollingMovementMethod.getInstance());
        textView.setText(str);
        textView.setTextIsSelectable(true);
        Window window2 = dialog.getWindow();
        if (window2 != null) {
            window2.setBackgroundDrawableResource(R.color.black_alpha_30);
        }
        if (!(window2 == null || (attributes = window2.getAttributes()) == null)) {
            attributes.windowAnimations = 0;
        }
        dialog.setCanceledOnTouchOutside(true);
        dialog.setCancelable(true);
        AnimationSet animationSet = new AnimationSet(true);
        ScaleAnimation scaleAnimation = new ScaleAnimation(0.8f, 1.0f, 0.8f, 1.0f, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setDuration(100);
        animationSet.addAnimation(scaleAnimation);
        animationSet.addAnimation(new AlphaAnimation((float) BitmapDescriptorFactory.HUE_RED, 1.0f));
        textView.startAnimation(animationSet);
        dialog.show();
    }

    /* renamed from: a */
    public final void mo114080a(IHeaderData cVar, ICalendarDetailContact.IDetailViewAction cVar2) {
        Intrinsics.checkParameterIsNotNull(cVar, "viewIn");
        Intrinsics.checkParameterIsNotNull(cVar2, "viewOut");
        this.f79626a = cVar;
        this.f79627b = cVar2;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EventHeaderView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
        LayoutInflater.from(context).inflate(R.layout.calendar_event_detail_header_view, this);
        RequestLoadingDialog requestLoadingDialog = new RequestLoadingDialog((Activity) context);
        this.f79628c = requestLoadingDialog;
        if (requestLoadingDialog != null) {
            requestLoadingDialog.mo112594e(SmActions.ACTION_ONTHECALL_EXIT);
        }
    }
}
