package com.ss.android.lark.calendar.impl.features.calendars.detail.fragment;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.component.universe_design.color.UDColorUtils;
import com.larksuite.component.universe_design.toast.UDToast;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.calendars.detail.view.CalendarDetailHeaderView;
import com.ss.android.lark.calendar.impl.features.calendars.detail.view.CalendarDetailScrollView;
import com.ss.android.lark.calendar.impl.features.calendars.detail.view.CalendarDetailToolbar;
import com.ss.android.lark.calendar.impl.features.calendars.detail.view.CalendarInstanceListView;
import com.ss.android.lark.calendar.impl.features.calendars.detail.viewmodel.CalendarDetailInfo;
import com.ss.android.lark.calendar.impl.features.calendars.detail.viewmodel.CalendarMemberInfo;
import com.ss.android.lark.calendar.impl.features.common.widget.BehavioralScrollListener;
import com.ss.android.lark.calendar.impl.features.common.widget.BehavioralScrollView;
import com.ss.android.lark.calendar.impl.features.events.edit.EditActivityEntrance;
import com.ss.android.lark.calendar.impl.features.recyclerview.AdapterList;
import com.ss.android.lark.calendar.impl.framework.hitpoint.event2.CalendarDetailHitPoint;
import com.ss.android.lark.calendar.impl.framework.viewmodel.ActionDispatcher;
import com.ss.android.lark.calendar.impl.framework.viewmodel.StatusData;
import com.ss.android.lark.calendar.impl.utils.C32659l;
import com.ss.android.lark.calendar.impl.utils.LinearGradientProvider;
import com.ss.android.lark.calendar.impl.utils.RoundRectDrawable;
import com.ss.android.lark.calendar.impl.utils.an;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.StatusBarUtil;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0006\u0010&\u001a\u00020'J\u0012\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010\u000bH\u0016J \u0010+\u001a\u00020)2\u0006\u0010*\u001a\u00020,2\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020.H\u0016J\u0016\u00100\u001a\u00020)2\u000e\u00101\u001a\n\u0012\u0004\u0012\u000203\u0018\u000102J\u0012\u00104\u001a\u00020)2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0002J\u0018\u00105\u001a\u00020)2\u0010\u00106\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0018\u000102J\u0014\u00107\u001a\u00020)2\f\u00108\u001a\b\u0012\u0004\u0012\u00020309J\u0010\u0010:\u001a\u00020)2\b\u0010;\u001a\u0004\u0018\u00010<J\u0016\u0010=\u001a\u00020)2\u000e\u0010>\u001a\n\u0012\u0004\u0012\u00020?\u0018\u000102R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\n \f*\u0004\u0018\u00010\u000b0\u000bX\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\n \f*\u0004\u0018\u00010\u000e0\u000eX\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000f\u001a\n \f*\u0004\u0018\u00010\u00100\u0010X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0013\u001a\n \f*\u0004\u0018\u00010\u000b0\u000bX\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0014\u001a\n \f*\u0004\u0018\u00010\u00150\u0015X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0016\u001a\n \f*\u0004\u0018\u00010\u00170\u0017X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0018\u001a\n \f*\u0004\u0018\u00010\u000b0\u000bX\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0019\u001a\n \f*\u0004\u0018\u00010\u001a0\u001aX\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u001b\u001a\n \f*\u0004\u0018\u00010\u001c0\u001cX\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u001d\u001a\n \f*\u0004\u0018\u00010\u000b0\u000bX\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u001e\u001a\n \f*\u0004\u0018\u00010\u001f0\u001fX\u0004¢\u0006\u0002\n\u0000R\u0016\u0010 \u001a\n \f*\u0004\u0018\u00010\u000b0\u000bX\u0004¢\u0006\u0002\n\u0000R\u0016\u0010!\u001a\n \f*\u0004\u0018\u00010\"0\"X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010#\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%¨\u0006@"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendars/detail/fragment/CalendarDetailView;", "Lcom/ss/android/lark/calendar/impl/features/common/widget/BehavioralScrollListener;", "Landroid/view/View$OnClickListener;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "actionDispatcher", "Lcom/ss/android/lark/calendar/impl/framework/viewmodel/ActionDispatcher;", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Lcom/ss/android/lark/calendar/impl/framework/viewmodel/ActionDispatcher;)V", "addEvent", "Landroid/view/View;", "kotlin.jvm.PlatformType", "colorBg", "Landroid/widget/ImageView;", "context", "Landroid/content/Context;", "detailInfo", "Lcom/ss/android/lark/calendar/impl/features/calendars/detail/viewmodel/CalendarDetailInfo;", "errorClose", "errorImage", "Landroidx/appcompat/widget/AppCompatImageView;", "errorText", "Landroid/widget/TextView;", "errorView", "header", "Lcom/ss/android/lark/calendar/impl/features/calendars/detail/view/CalendarDetailHeaderView;", "listView", "Lcom/ss/android/lark/calendar/impl/features/calendars/detail/view/CalendarInstanceListView;", "roundBg", "scrollView", "Lcom/ss/android/lark/calendar/impl/features/calendars/detail/view/CalendarDetailScrollView;", "subscribeTip", "toolbar", "Lcom/ss/android/lark/calendar/impl/features/calendars/detail/view/CalendarDetailToolbar;", "view", "getView", "()Landroid/view/View;", "canLoadPast", "", "onClick", "", "v", "onScrollChanged", "Lcom/ss/android/lark/calendar/impl/features/common/widget/BehavioralScrollView;", "from", "", "to", "updateDelete", "deleteStatus", "Lcom/ss/android/lark/calendar/impl/framework/viewmodel/StatusData;", "", "updateDetail", "updateDetailStatus", "detailStatus", "updateList", "list", "Lcom/ss/android/lark/calendar/impl/features/recyclerview/AdapterList;", "updateOwner", "owner", "Lcom/ss/android/lark/calendar/impl/features/calendars/detail/viewmodel/CalendarMemberInfo;", "updateSubscribeStatus", "subscribe", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.calendars.detail.fragment.a */
public final class CalendarDetailView implements View.OnClickListener, BehavioralScrollListener {

    /* renamed from: a */
    private final View f75675a;

    /* renamed from: b */
    private final Context f75676b;

    /* renamed from: c */
    private final ImageView f75677c;

    /* renamed from: d */
    private final View f75678d;

    /* renamed from: e */
    private final CalendarDetailToolbar f75679e;

    /* renamed from: f */
    private final CalendarDetailScrollView f75680f;

    /* renamed from: g */
    private final CalendarDetailHeaderView f75681g;

    /* renamed from: h */
    private final CalendarInstanceListView f75682h;

    /* renamed from: i */
    private final View f75683i;

    /* renamed from: j */
    private final View f75684j;

    /* renamed from: k */
    private final View f75685k;

    /* renamed from: l */
    private final View f75686l;

    /* renamed from: m */
    private final AppCompatImageView f75687m;

    /* renamed from: n */
    private final TextView f75688n;

    /* renamed from: o */
    private CalendarDetailInfo f75689o;

    /* renamed from: p */
    private final ActionDispatcher f75690p;

    /* renamed from: a */
    public final View mo109260a() {
        return this.f75675a;
    }

    /* renamed from: b */
    public final boolean mo109267b() {
        CalendarDetailScrollView calendarDetailScrollView = this.f75680f;
        Intrinsics.checkExpressionValueIsNotNull(calendarDetailScrollView, "scrollView");
        if (calendarDetailScrollView.getScrollY() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo109262a(CalendarMemberInfo eVar) {
        Log.m165389i("CalendarDetailFragment", "updateOwner: " + eVar);
        this.f75681g.mo109272a(eVar);
    }

    /* renamed from: b */
    public final void mo109266b(StatusData<String> gVar) {
        Log.m165389i("CalendarDetailFragment", "updateSubscribeStatus: " + gVar);
        this.f75681g.mo109273a(gVar);
    }

    /* renamed from: a */
    public final void mo109261a(AdapterList<Object> aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "list");
        Log.m165389i("CalendarDetailFragment", "updateList: " + aVar.size());
        this.f75682h.setList(aVar);
    }

    /* renamed from: a */
    private final void m112401a(CalendarDetailInfo cVar) {
        Integer num;
        int i;
        boolean z;
        this.f75689o = cVar;
        if (cVar != null) {
            num = Integer.valueOf(cVar.mo109182f());
        } else {
            num = null;
        }
        if (num == null || num.intValue() == 0) {
            Context context = this.f75676b;
            Intrinsics.checkExpressionValueIsNotNull(context, "context");
            i = UDColorUtils.getColor(context, R.color.ud_B500);
        } else {
            i = num.intValue();
        }
        this.f75677c.setBackgroundColor(i);
        this.f75679e.mo109281a(cVar);
        this.f75681g.mo109271a(cVar);
        View view = this.f75683i;
        Intrinsics.checkExpressionValueIsNotNull(view, "addEvent");
        boolean z2 = true;
        if (cVar == null || !cVar.mo109185i() || !cVar.mo109187k()) {
            z = false;
        } else {
            z = true;
        }
        an.m125213a(view, z);
        View view2 = this.f75684j;
        Intrinsics.checkExpressionValueIsNotNull(view2, "subscribeTip");
        if (cVar == null || cVar.mo109185i()) {
            z2 = false;
        }
        an.m125213a(view2, z2);
    }

    /* renamed from: c */
    public final void mo109268c(StatusData<Object> gVar) {
        Log.m165389i("CalendarDetailFragment", "updateDelete: " + gVar);
        if (gVar == null) {
            return;
        }
        if (gVar.mo118790c()) {
            ActionDispatcher.C32507a.m124446a(this.f75690p, "ACTION_CLOSE", null, 2, null);
            Context context = this.f75676b;
            Intrinsics.checkExpressionValueIsNotNull(context, "context");
            UDToast.show(context, (int) R.string.Calendar_Toast_Deleted);
        } else if (gVar.mo118791d() && !gVar.mo118788a()) {
            gVar.mo118787a(true);
            Context context2 = this.f75676b;
            Intrinsics.checkExpressionValueIsNotNull(context2, "context");
            UDToast.show(context2, (int) R.string.Calendar_Common_FailToDelete);
        }
    }

    public void onClick(View view) {
        Activity activityFromView;
        if (Intrinsics.areEqual(view, this.f75677c)) {
            BehavioralScrollView.m116290a(this.f75680f, 0, 0, (Function1) null, 6, (Object) null);
            this.f75682h.mo109286a();
        } else if (Intrinsics.areEqual(view, this.f75683i)) {
            CalendarDetailInfo cVar = this.f75689o;
            if (cVar != null && (activityFromView = UIUtils.getActivityFromView(view)) != null) {
                Activity activity = activityFromView;
                EditActivityEntrance.f79940a.mo114661a(activity, cVar.mo109177a()).mo108156b(activity);
                CalendarDetailHitPoint.f83361a.mo118746a(cVar.mo109177a(), "add_event");
            }
        } else if (Intrinsics.areEqual(view, this.f75684j)) {
            ActionDispatcher.C32507a.m124446a(this.f75690p, "ACTION_SUBSCRIBE", null, 2, null);
        } else if (Intrinsics.areEqual(view, this.f75686l)) {
            ActionDispatcher.C32507a.m124446a(this.f75690p, "ACTION_CLOSE", null, 2, null);
        } else if (Intrinsics.areEqual(view, this.f75685k)) {
            ActionDispatcher.C32507a.m124446a(this.f75690p, "ACTION_REFRESH", null, 2, null);
        }
    }

    /* renamed from: a */
    public final void mo109264a(StatusData<CalendarDetailInfo> gVar) {
        CalendarDetailInfo cVar;
        Log.m165389i("CalendarDetailFragment", "updateDetailStatus: " + gVar);
        if (gVar != null) {
            cVar = gVar.mo118792e();
        } else {
            cVar = null;
        }
        m112401a(cVar);
        View view = this.f75685k;
        Intrinsics.checkExpressionValueIsNotNull(view, "errorView");
        int i = 8;
        if (gVar != null && gVar.mo118791d()) {
            Object f = gVar.mo118793f();
            if (Intrinsics.areEqual(f, "REFRESH_EXTRA_PRIVACY")) {
                this.f75688n.setText(R.string.Calendar_SubscribeCalendar_PrivateCalendarCannotBeSubscribed);
                this.f75687m.setImageResource(R.drawable.illustration_placeholder_common_no_preview);
                this.f75685k.setOnClickListener(null);
            } else if (Intrinsics.areEqual(f, "REFRESH_EXTRA_NOT_SUPPORT")) {
                this.f75688n.setText(R.string.Calendar_Onboarding_TypeCalendarDetailsNotSupported);
                this.f75687m.setImageResource(R.drawable.illustration_placeholder_common_no_schedule);
                this.f75685k.setOnClickListener(null);
            } else if (Intrinsics.areEqual(f, "REFRESH_EXTRA_DELETED")) {
                this.f75688n.setText(R.string.Calendar_Common_CalendarDeleted);
                this.f75687m.setImageResource(R.drawable.illustration_placeholder_common_no_schedule);
                this.f75685k.setOnClickListener(null);
            } else if (gVar.mo118792e() == null) {
                this.f75688n.setText(R.string.Calendar_Common_FailToLoad3);
                this.f75687m.setImageResource(R.drawable.illustration_empty_negative_load_failed);
                this.f75685k.setOnClickListener(this);
            }
            i = 0;
        }
        view.setVisibility(i);
    }

    @Override // com.ss.android.lark.calendar.impl.features.common.widget.BehavioralScrollListener
    /* renamed from: b */
    public void mo109265b(BehavioralScrollView behavioralScrollView, int i, int i2) {
        Intrinsics.checkParameterIsNotNull(behavioralScrollView, "v");
        BehavioralScrollListener.C31156a.m116315a(this, behavioralScrollView, i, i2);
    }

    @Override // com.ss.android.lark.calendar.impl.features.common.widget.BehavioralScrollListener
    /* renamed from: a */
    public void mo109263a(BehavioralScrollView behavioralScrollView, int i, int i2) {
        Intrinsics.checkParameterIsNotNull(behavioralScrollView, "v");
        float scrollY = ((float) behavioralScrollView.getScrollY()) / ((float) behavioralScrollView.getMaxScroll());
        this.f75679e.mo109280a(scrollY);
        this.f75681g.mo109270a(scrollY);
        View view = this.f75678d;
        Intrinsics.checkExpressionValueIsNotNull(view, "roundBg");
        View view2 = this.f75678d;
        Intrinsics.checkExpressionValueIsNotNull(view2, "roundBg");
        int top = view2.getTop() - behavioralScrollView.getScrollY();
        CalendarDetailToolbar calendarDetailToolbar = this.f75679e;
        Intrinsics.checkExpressionValueIsNotNull(calendarDetailToolbar, "toolbar");
        view.setY((float) Math.max(top, calendarDetailToolbar.getBottom()));
    }

    public CalendarDetailView(LayoutInflater layoutInflater, ViewGroup viewGroup, ActionDispatcher aVar) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        Intrinsics.checkParameterIsNotNull(aVar, "actionDispatcher");
        this.f75690p = aVar;
        View inflate = layoutInflater.inflate(R.layout.calendar_fragment_calendar_detail, viewGroup, false);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "inflater.inflate(R.layou…detail, container, false)");
        this.f75675a = inflate;
        Context context = inflate.getContext();
        this.f75676b = context;
        ImageView imageView = (ImageView) inflate.findViewById(R.id.cal_color_bg);
        this.f75677c = imageView;
        View findViewById = inflate.findViewById(R.id.cal_round_bg);
        this.f75678d = findViewById;
        CalendarDetailToolbar calendarDetailToolbar = (CalendarDetailToolbar) inflate.findViewById(R.id.cal_toolbar);
        this.f75679e = calendarDetailToolbar;
        CalendarDetailScrollView calendarDetailScrollView = (CalendarDetailScrollView) inflate.findViewById(R.id.cal_scroll_view);
        this.f75680f = calendarDetailScrollView;
        CalendarDetailHeaderView calendarDetailHeaderView = (CalendarDetailHeaderView) inflate.findViewById(R.id.cal_header_view);
        this.f75681g = calendarDetailHeaderView;
        CalendarInstanceListView calendarInstanceListView = (CalendarInstanceListView) inflate.findViewById(R.id.cal_instance_list_view);
        this.f75682h = calendarInstanceListView;
        View findViewById2 = inflate.findViewById(R.id.add_event);
        this.f75683i = findViewById2;
        View findViewById3 = inflate.findViewById(R.id.subscribe_tip);
        this.f75684j = findViewById3;
        View findViewById4 = inflate.findViewById(R.id.error_view);
        this.f75685k = findViewById4;
        View findViewById5 = inflate.findViewById(R.id.error_close);
        this.f75686l = findViewById5;
        this.f75687m = (AppCompatImageView) inflate.findViewById(R.id.error_image);
        this.f75688n = (TextView) inflate.findViewById(R.id.error_text);
        View findViewById6 = inflate.findViewById(R.id.status_bar_space);
        Intrinsics.checkExpressionValueIsNotNull(findViewById6, "view.findViewById<View>(R.id.status_bar_space)");
        ViewGroup.LayoutParams layoutParams = findViewById6.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = StatusBarUtil.getStatusBarHeight(context);
        }
        calendarDetailToolbar.setActionDispatcher(aVar);
        calendarDetailHeaderView.setActionDispatcher(aVar);
        calendarInstanceListView.setActionDispatcher(aVar);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "roundBg");
        Intrinsics.checkExpressionValueIsNotNull(context, "context");
        findViewById.setBackground(new RoundRectDrawable(UDColorUtils.getColor(context, R.color.bg_float), C32659l.m125335a((Number) 10), C32659l.m125335a((Number) 10), 0, 0, false, 32, null));
        Intrinsics.checkExpressionValueIsNotNull(context, "context");
        int color = UDColorUtils.getColor(context, R.color.bg_float);
        Intrinsics.checkExpressionValueIsNotNull(findViewById3, "subscribeTip");
        findViewById3.setBackground(new RoundRectDrawable().mo120303a(new LinearGradientProvider(new int[]{UDColorUtils.getAlphaColor(color, BitmapDescriptorFactory.HUE_RED), color}, null, null, null, 14, null)));
        CalendarDetailView aVar2 = this;
        imageView.setOnClickListener(aVar2);
        findViewById2.setOnClickListener(aVar2);
        findViewById3.setOnClickListener(aVar2);
        findViewById5.setOnClickListener(aVar2);
        findViewById4.setOnClickListener(aVar2);
        calendarDetailScrollView.getListeners().add(this);
    }
}
