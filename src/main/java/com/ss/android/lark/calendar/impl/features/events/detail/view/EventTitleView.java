package com.ss.android.lark.calendar.impl.features.events.detail.view;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.events.detail.ICalendarDetailContact;
import com.ss.android.lark.calendar.impl.features.events.detail.idata.ITitleData;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.entity.SpanMenuItem;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.widget.dialog.SpanListDialogBuilder;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.widget.dialog.SpanListDialogController;
import com.ss.android.lark.calendar.impl.framework.hitpoint.event2.CalendarEventHitPoint;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEvent;
import com.ss.android.lark.calendar.impl.utils.C32634ae;
import com.ss.android.lark.calendar.impl.utils.C32673y;
import com.ss.android.lark.calendar.impl.utils.p1577a.AbstractView$OnClickListenerC32626b;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.ui.IActionTitlebar;
import com.ss.android.lark.utils.UIHelper;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\b\u0018\u0000 ,2\u00020\u0001:\u0001,B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u001a\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0002J\b\u0010\u001e\u001a\u00020\u0019H\u0002J\b\u0010\u001f\u001a\u00020\u0019H\u0002J\b\u0010 \u001a\u00020\u0019H\u0002J\b\u0010!\u001a\u00020\u0019H\u0002J\b\u0010\"\u001a\u00020\u0019H\u0014J\u000e\u0010#\u001a\u00020\u00192\u0006\u0010$\u001a\u00020%J\u0016\u0010&\u001a\u00020\u00192\u0006\u0010'\u001a\u00020\u00152\u0006\u0010(\u001a\u00020\u0017J\u0006\u0010)\u001a\u00020\u0019J\u0006\u0010*\u001a\u00020\u0019J\b\u0010+\u001a\u00020\u0019H\u0002R\u001a\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X.¢\u0006\u0002\n\u0000¨\u0006-"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/detail/view/EventTitleView;", "Lcom/ss/android/lark/ui/CommonTitleBar;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "hintShow", "", "getHintShow", "()Z", "setHintShow", "(Z)V", "mActionViews", "Ljava/util/ArrayList;", "Landroid/view/View;", "mTitleData", "Lcom/ss/android/lark/calendar/impl/features/events/detail/idata/ITitleData;", "mViewAction", "Lcom/ss/android/lark/calendar/impl/features/events/detail/ICalendarDetailContact$IDetailViewAction;", "addActionImpl", "", "drawable", "Landroid/graphics/drawable/Drawable;", "clickListener", "Landroid/view/View$OnClickListener;", "checkHintToast", "clearActions", "initView", "onClickMore", "onFinishInflate", "refreshTitleAlpha", "ratio", "", "setDependency", "viewIn", "viewOut", "showActions", "showTitleText", "updateSecLeftTextPadding", "Companion", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class EventTitleView extends CommonTitleBar {

    /* renamed from: d */
    public static final Companion f79642d = new Companion(null);

    /* renamed from: a */
    public ITitleData f79643a;

    /* renamed from: b */
    public ICalendarDetailContact.IDetailViewAction f79644b;

    /* renamed from: c */
    public final ArrayList<View> f79645c;

    /* renamed from: e */
    private boolean f79646e;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/detail/view/EventTitleView$Companion;", "", "()V", "TAG", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.view.EventTitleView$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final boolean getHintShow() {
        return this.f79646e;
    }

    /* renamed from: e */
    private final void m118268e() {
        removeAllActions();
        this.f79645c.clear();
    }

    /* renamed from: f */
    private final void m118269f() {
        getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver$OnGlobalLayoutListenerC31439g(this));
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        setLeftImageResource(R.drawable.ud_icon_left_outlined, R.color.static_white);
        m118267d();
    }

    /* renamed from: d */
    private final void m118267d() {
        setDividerVisible(false);
        setBackgroundColor(Color.argb(0, 255, 255, 255));
        setLeftTextPadding(15, 0, 0, 0);
        setSecLeftTextTypeface(1);
        setSecLeftTextColor(Color.argb(0, 255, 255, 255));
    }

    /* renamed from: g */
    private final void m118270g() {
        if (!this.f79646e) {
            ITitleData dVar = this.f79643a;
            if (dVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mTitleData");
            }
            if (dVar.mo113704o()) {
                this.f79646e = true;
                LKUIToast.show(getContext(), UIHelper.mustacheFormat((int) R.string.Calendar_Common_AppOutOfDateToast));
            }
        }
    }

    /* renamed from: a */
    public final void mo114092a() {
        ITitleData dVar = this.f79643a;
        if (dVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTitleData");
        }
        setSecLeftText(dVar.mo113690a());
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/detail/view/EventTitleView$updateSecLeftTextPadding$1", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "onGlobalLayout", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.view.EventTitleView$g */
    public static final class ViewTreeObserver$OnGlobalLayoutListenerC31439g implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: a */
        final /* synthetic */ EventTitleView f79654a;

        public void onGlobalLayout() {
            this.f79654a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            int dp2px = UIUtils.dp2px(this.f79654a.getContext(), 42.0f);
            Iterator<View> it = this.f79654a.f79645c.iterator();
            while (it.hasNext()) {
                View next = it.next();
                Intrinsics.checkExpressionValueIsNotNull(next, "actionView");
                dp2px += next.getMeasuredHeight();
            }
            this.f79654a.setSecLeftTextPadding(0, 0, UIUtils.px2dp(this.f79654a.getContext(), (float) dp2px), 0);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        ViewTreeObserver$OnGlobalLayoutListenerC31439g(EventTitleView eventTitleView) {
            this.f79654a = eventTitleView;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0174, code lost:
        if (r0.mo113702m() != false) goto L_0x0176;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo114095b() {
        /*
        // Method dump skipped, instructions count: 418
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.calendar.impl.features.events.detail.view.EventTitleView.mo114095b():void");
    }

    /* renamed from: c */
    public final void mo114096c() {
        ArrayList arrayList = new ArrayList();
        ITitleData dVar = this.f79643a;
        if (dVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTitleData");
        }
        int n = dVar.mo113703n();
        boolean z = true;
        if (n == 1) {
            SpanMenuItem.Builder a = new SpanMenuItem.Builder().mo115308a(CalendarEvent.Span.THIS_EVENT);
            String b = C32634ae.m125182b(R.string.Calendar_Event_CancelEvent);
            Intrinsics.checkExpressionValueIsNotNull(b, "ResUtil.getString(R.stri…lendar_Event_CancelEvent)");
            arrayList.add(a.mo115309a(b).mo115318d(true).mo115324i());
        }
        if (n == 2) {
            SpanMenuItem.Builder a2 = new SpanMenuItem.Builder().mo115308a(CalendarEvent.Span.THIS_EVENT);
            String b2 = C32634ae.m125182b(R.string.Calendar_Event_DeleteEvent);
            Intrinsics.checkExpressionValueIsNotNull(b2, "ResUtil.getString(R.stri…lendar_Event_DeleteEvent)");
            arrayList.add(a2.mo115309a(b2).mo115318d(true).mo115324i());
        }
        ITitleData dVar2 = this.f79643a;
        if (dVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTitleData");
        }
        if (dVar2.mo113700k()) {
            SpanMenuItem.Builder a3 = new SpanMenuItem.Builder().mo115308a(CalendarEvent.Span.ALL_EVENTS);
            String b3 = C32634ae.m125182b(R.string.Calendar_Transfer_Transfer);
            Intrinsics.checkExpressionValueIsNotNull(b3, "ResUtil.getString(R.stri…lendar_Transfer_Transfer)");
            arrayList.add(a3.mo115309a(b3).mo115324i());
        }
        ITitleData dVar3 = this.f79643a;
        if (dVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTitleData");
        }
        if (dVar3.mo113702m()) {
            SpanMenuItem.Builder a4 = new SpanMenuItem.Builder().mo115308a(CalendarEvent.Span.FUTURE_EVENTS);
            String b4 = C32634ae.m125182b(R.string.Calendar_Detail_Report);
            Intrinsics.checkExpressionValueIsNotNull(b4, "ResUtil.getString(R.string.Calendar_Detail_Report)");
            arrayList.add(a4.mo115309a(b4).mo115324i());
        }
        ITitleData dVar4 = this.f79643a;
        if (dVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTitleData");
        }
        String b5 = dVar4.mo113691b();
        if (b5 == null) {
            b5 = "";
        }
        ITitleData dVar5 = this.f79643a;
        if (dVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTitleData");
        }
        String c = dVar5.mo113692c();
        ITitleData dVar6 = this.f79643a;
        if (dVar6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTitleData");
        }
        boolean m = dVar6.mo113702m();
        ITitleData dVar7 = this.f79643a;
        if (dVar7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTitleData");
        }
        boolean k = dVar7.mo113700k();
        ITitleData dVar8 = this.f79643a;
        if (dVar8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTitleData");
        }
        if (dVar8.mo113703n() == 0) {
            z = false;
        }
        CalendarEventHitPoint.m124347a(b5, c, m, k, z);
        Context context = getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "context");
        ((SpanListDialogBuilder) new SpanListDialogBuilder(context).mo116008a(arrayList).mo116007a(new C31435c(this)).addActionButton(R.id.ud_dialog_btn_cancel, R.string.Calendar_Common_Cancel, (DialogInterface.OnClickListener) null)).show();
    }

    public final void setHintShow(boolean z) {
        this.f79646e = z;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/detail/view/EventTitleView$addActionImpl$action$1", "Lcom/ss/android/lark/ui/IActionTitlebar$ImageAction;", "performAction", "", "view", "Landroid/view/View;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.view.EventTitleView$b */
    public static final class C31434b extends IActionTitlebar.C57573a {

        /* renamed from: a */
        final /* synthetic */ View.OnClickListener f79647a;

        /* renamed from: b */
        final /* synthetic */ Drawable f79648b;

        @Override // com.ss.android.lark.ui.IActionTitlebar.Action, com.ss.android.lark.ui.IActionTitlebar.BaseAction
        public void performAction(View view) {
            View.OnClickListener onClickListener = this.f79647a;
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31434b(View.OnClickListener onClickListener, Drawable drawable, Drawable drawable2) {
            super(drawable2);
            this.f79647a = onClickListener;
            this.f79648b = drawable;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/detail/view/EventTitleView$onClickMore$1", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/widget/dialog/SpanListDialogController$OnItemClickListener;", "onItemClick", "", "span", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEvent$Span;", "isChecked", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.view.EventTitleView$c */
    public static final class C31435c implements SpanListDialogController.OnItemClickListener {

        /* renamed from: a */
        final /* synthetic */ EventTitleView f79649a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C31435c(EventTitleView eventTitleView) {
            this.f79649a = eventTitleView;
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.widget.dialog.SpanListDialogController.OnItemClickListener
        /* renamed from: a */
        public void mo109576a(CalendarEvent.Span span, boolean z) {
            if (span != null) {
                int i = C31453e.f79697a[span.ordinal()];
                if (i == 1) {
                    CalendarEventHitPoint.m124344a(EventTitleView.m118264a(this.f79649a).mo113691b(), EventTitleView.m118264a(this.f79649a).mo113692c(), "delete_event", (String) null, (String) null, 24, (Object) null);
                    CalendarEventHitPoint.m124349b(EventTitleView.m118264a(this.f79649a).mo113691b(), EventTitleView.m118264a(this.f79649a).mo113692c(), "delete");
                    EventTitleView.m118266b(this.f79649a).mo113548c();
                } else if (i == 2) {
                    CalendarEventHitPoint.m124349b(EventTitleView.m118264a(this.f79649a).mo113691b(), EventTitleView.m118264a(this.f79649a).mo113692c(), "report");
                    EventTitleView.m118266b(this.f79649a).mo113550d();
                } else if (i == 3) {
                    CalendarEventHitPoint.m124349b(EventTitleView.m118264a(this.f79649a).mo113691b(), EventTitleView.m118264a(this.f79649a).mo113692c(), "transfer");
                    EventTitleView.m118266b(this.f79649a).mo113551e();
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/detail/view/EventTitleView$showActions$moreAction$1", "Lcom/ss/android/lark/calendar/impl/utils/debounce/DebouncingClickListener;", "doClick", "", "v", "Landroid/view/View;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.view.EventTitleView$e */
    public static final class C31437e extends AbstractView$OnClickListenerC32626b {

        /* renamed from: a */
        final /* synthetic */ EventTitleView f79652a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C31437e(EventTitleView eventTitleView) {
            this.f79652a = eventTitleView;
        }

        @Override // com.ss.android.lark.calendar.impl.utils.p1577a.AbstractView$OnClickListenerC32626b
        /* renamed from: a */
        public void mo108751a(View view) {
            Intrinsics.checkParameterIsNotNull(view, "v");
            Log.m165389i("EventTitleView", C32673y.m125369a("more"));
            CalendarEventHitPoint.m124344a(EventTitleView.m118264a(this.f79652a).mo113691b(), EventTitleView.m118264a(this.f79652a).mo113692c(), "more_action", (String) null, (String) null, 24, (Object) null);
            this.f79652a.mo114096c();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/detail/view/EventTitleView$showActions$shareAction$1", "Lcom/ss/android/lark/calendar/impl/utils/debounce/DebouncingClickListener;", "doClick", "", "v", "Landroid/view/View;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.view.EventTitleView$f */
    public static final class C31438f extends AbstractView$OnClickListenerC32626b {

        /* renamed from: a */
        final /* synthetic */ EventTitleView f79653a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C31438f(EventTitleView eventTitleView) {
            this.f79653a = eventTitleView;
        }

        @Override // com.ss.android.lark.calendar.impl.utils.p1577a.AbstractView$OnClickListenerC32626b
        /* renamed from: a */
        public void mo108751a(View view) {
            Intrinsics.checkParameterIsNotNull(view, "v");
            Log.m165389i("EventTitleView", C32673y.m125369a("share_icon"));
            CalendarEventHitPoint.m124344a(EventTitleView.m118264a(this.f79653a).mo113691b(), EventTitleView.m118264a(this.f79653a).mo113692c(), "share_event", (String) null, (String) null, 24, (Object) null);
            EventTitleView.m118266b(this.f79653a).mo113536a();
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public EventTitleView(Context context) {
        this(context, null);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* renamed from: a */
    public static final /* synthetic */ ITitleData m118264a(EventTitleView eventTitleView) {
        ITitleData dVar = eventTitleView.f79643a;
        if (dVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTitleData");
        }
        return dVar;
    }

    /* renamed from: b */
    public static final /* synthetic */ ICalendarDetailContact.IDetailViewAction m118266b(EventTitleView eventTitleView) {
        ICalendarDetailContact.IDetailViewAction cVar = eventTitleView.f79644b;
        if (cVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewAction");
        }
        return cVar;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/detail/view/EventTitleView$showActions$editAction$1", "Lcom/ss/android/lark/calendar/impl/utils/debounce/DebouncingClickListener;", "doClick", "", "v", "Landroid/view/View;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.view.EventTitleView$d */
    public static final class C31436d extends AbstractView$OnClickListenerC32626b {

        /* renamed from: a */
        final /* synthetic */ EventTitleView f79650a;

        /* renamed from: b */
        final /* synthetic */ boolean f79651b;

        @Override // com.ss.android.lark.calendar.impl.utils.p1577a.AbstractView$OnClickListenerC32626b
        /* renamed from: a */
        public void mo108751a(View view) {
            Intrinsics.checkParameterIsNotNull(view, "v");
            Log.m165389i("EventTitleView", C32673y.m125369a("edit"));
            if (this.f79651b) {
                LKUIToast.show(this.f79650a.getContext(), UIHelper.mustacheFormat((int) R.string.Calendar_Edit_CantEditNeedUpdateToast));
                return;
            }
            CalendarEventHitPoint.m124344a(EventTitleView.m118264a(this.f79650a).mo113691b(), EventTitleView.m118264a(this.f79650a).mo113692c(), "edit_event", (String) null, (String) null, 24, (Object) null);
            EventTitleView.m118266b(this.f79650a).mo113545b();
        }

        C31436d(EventTitleView eventTitleView, boolean z) {
            this.f79650a = eventTitleView;
            this.f79651b = z;
        }
    }

    /* renamed from: a */
    public final void mo114093a(float f) {
        setSecLeftTextColor(Color.argb((int) (f * ((float) 255)), 255, 255, 255));
        m118269f();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public EventTitleView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* renamed from: a */
    private final void m118265a(Drawable drawable, View.OnClickListener onClickListener) {
        this.f79645c.add(addAction(new C31434b(onClickListener, drawable, drawable)));
    }

    /* renamed from: a */
    public final void mo114094a(ITitleData dVar, ICalendarDetailContact.IDetailViewAction cVar) {
        Intrinsics.checkParameterIsNotNull(dVar, "viewIn");
        Intrinsics.checkParameterIsNotNull(cVar, "viewOut");
        this.f79643a = dVar;
        this.f79644b = cVar;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EventTitleView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f79645c = new ArrayList<>();
    }
}
