package com.ss.android.lark.calendar.impl.features.calendars.selector;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.calendars.selector.C30397a;
import com.ss.android.lark.calendar.impl.features.calendars.selector.CalendarSelectorContract;
import com.ss.android.lark.calendar.impl.features.calendars.selector.vh.CalendarCellVH;
import com.ss.android.lark.calendar.impl.features.calendars.selector.vh.DataListItem;
import com.ss.android.lark.calendar.impl.features.calendars.selector.widget.CalendarManagerDialog;
import com.ss.android.lark.calendar.impl.features.common.helper.CalendarLogHelper;
import com.ss.android.lark.calendar.impl.features.settings.account.AccountDataListItem;
import com.ss.android.lark.calendar.impl.framework.hitpoint.event.CalendarHitPoint;
import com.ss.android.lark.calendar.impl.framework.hitpoint.p1572c.C32501e;
import com.ss.android.lark.calendar.impl.framework.hitpoint.performance.CalendarPerfMonitor;
import com.ss.android.lark.calendar.impl.utils.C32673y;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.ui.CommonTitleBar;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u000e\u0018\u0000 52\u00020\u0001:\u00015B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0014H\u0016J\b\u0010\u0016\u001a\u00020\u0014H\u0002J\b\u0010\u0017\u001a\u00020\u0014H\u0002J\b\u0010\u0018\u001a\u00020\u0014H\u0002J\u0006\u0010\u0019\u001a\u00020\u0014J\u0010\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\u0010\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u001cH\u0016J\u0018\u0010\u001f\u001a\u00020\u00142\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020!H\u0002J\u0018\u0010#\u001a\u00020\u00142\u0006\u0010$\u001a\u00020!2\u0006\u0010%\u001a\u00020!H\u0002J\u0016\u0010&\u001a\u00020\u00142\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u001c0(H\u0016J\u0018\u0010)\u001a\u00020\u00142\u0006\u0010*\u001a\u00020\u00122\u0006\u0010+\u001a\u00020\u0010H\u0016J\u0010\u0010,\u001a\u00020\u00142\u0006\u0010-\u001a\u00020\u001cH\u0002J\u0010\u0010.\u001a\u00020\u00142\u0006\u0010/\u001a\u00020\u001cH\u0016J\b\u00100\u001a\u00020\u0014H\u0016J\b\u00101\u001a\u00020\u0014H\u0016J\b\u00102\u001a\u00020\u0014H\u0002J\b\u00103\u001a\u00020\u0014H\u0002J\b\u00104\u001a\u00020\u0014H\u0002R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u00066"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendars/selector/CalendarSelectorView;", "Lcom/ss/android/lark/calendar/impl/features/calendars/selector/CalendarSelectorContract$ICalendarSelectorView;", "rootView", "Landroid/view/View;", "(Landroid/view/View;)V", "mAdapter", "Lcom/ss/android/lark/calendar/impl/features/calendars/selector/CalendarSelectorAdapter;", "mContext", "Landroid/content/Context;", "mHoverTipsWindow", "Lcom/ss/android/lark/desktopmode/view/HoverTipsWindow;", "mLayoutManager", "Landroidx/recyclerview/widget/LinearLayoutManager;", "mScrollToAccountRunnable", "Ljava/lang/Runnable;", "mViewAction", "Lcom/ss/android/lark/calendar/impl/features/calendars/selector/CalendarSelectorContract$IViewAction;", "mViewData", "Lcom/ss/android/lark/calendar/impl/features/calendars/selector/CalendarSelectorContract$IViewData;", "create", "", "destroy", "initRecycleView", "initTitleBar", "jumpToSubscribeCalendar", "onCaptured", "scrollToBlinkCalendar", "calendarId", "", "scrollToNewAccount", "newAccount", "scrollToNewImportGoogleCal", "accPosition", "", "newCalendarCount", "scrollToPosition", "position", "count", "setCalendarSynced", "syncedCalendarIds", "", "setDependency", "vi", "vo", "setSyncedStatus", "serverId", "setUpdateCalendarErr", "syncErrorCalId", "showCalendars", "showLocalCalendars", "startImportActivity", "startNewCalendarActivity", "startSubscribeActivity", "Companion", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.calendars.selector.e */
public final class CalendarSelectorView implements CalendarSelectorContract.ICalendarSelectorView {

    /* renamed from: c */
    public static final Companion f76144c = new Companion(null);

    /* renamed from: a */
    public CalendarSelectorContract.IViewAction f76145a;

    /* renamed from: b */
    public final View f76146b;

    /* renamed from: d */
    private C30397a f76147d;

    /* renamed from: e */
    private LinearLayoutManager f76148e;

    /* renamed from: f */
    private Context f76149f;

    /* renamed from: g */
    private Runnable f76150g;

    /* renamed from: h */
    private CalendarSelectorContract.IViewData f76151h;

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendars/selector/CalendarSelectorView$Companion;", "", "()V", "DIALOG_MARGIN_LEFT_IN_DP", "", "DIALOG_MARGIN_TOP_IN_DP", "TAG", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.selector.e$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        m113080h();
        m113081i();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0005\u001a\u00020\u0003H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0002¨\u0006\u0007"}, d2 = {"com/ss/android/lark/calendar/impl/features/calendars/selector/CalendarSelectorView$jumpToSubscribeCalendar$dialog$1", "Lcom/ss/android/lark/calendar/impl/features/calendars/selector/widget/CalendarManagerDialog$Delegate;", "importCalendar", "", "newCalendar", "subscribeCalendar", "subscribePerfMonitor", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.selector.e$d */
    public static final class C30416d implements CalendarManagerDialog.Delegate {

        /* renamed from: a */
        final /* synthetic */ CalendarSelectorView f76154a;

        @Override // com.ss.android.lark.calendar.impl.features.calendars.selector.widget.CalendarManagerDialog.Delegate
        /* renamed from: a */
        public void mo109751a() {
            this.f76154a.mo109797d();
            C32501e.m124360b("add_cal");
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendars.selector.widget.CalendarManagerDialog.Delegate
        /* renamed from: b */
        public void mo109752b() {
            m113101d();
            this.f76154a.mo109798e();
            C32501e.m124360b("subscribe_cal");
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendars.selector.widget.CalendarManagerDialog.Delegate
        /* renamed from: c */
        public void mo109753c() {
            this.f76154a.mo109799f();
            C32501e.m124360b("tripartite_add");
        }

        /* renamed from: d */
        private final void m113101d() {
            CalendarPerfMonitor.m124415a("key_subscribe_contact_calendar", "cal_perf_common", "scene_type", "subscribe_calendar", "extra_name", "contact_calendar");
            CalendarPerfMonitor.m124415a("key_subscribe_meetingroom_calendar", "cal_perf_common", "scene_type", "subscribe_calendar", "extra_name", "meetingroom_calendar");
            CalendarPerfMonitor.m124415a("key_subscribe_public_calendar", "cal_perf_common", "scene_type", "subscribe_calendar", "extra_name", "public_calendar");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C30416d(CalendarSelectorView eVar) {
            this.f76154a = eVar;
        }
    }

    /* renamed from: d */
    public final void mo109797d() {
        CalendarSelectorContract.IViewAction eVar = this.f76145a;
        if (eVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewAction");
        }
        eVar.mo109717a();
    }

    /* renamed from: e */
    public final void mo109798e() {
        CalendarSelectorContract.IViewAction eVar = this.f76145a;
        if (eVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewAction");
        }
        eVar.mo109721b();
    }

    /* renamed from: f */
    public final void mo109799f() {
        CalendarSelectorContract.IViewAction eVar = this.f76145a;
        if (eVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewAction");
        }
        eVar.mo109723c();
    }

    /* renamed from: g */
    public final void mo109800g() {
        List<DataListItem> list;
        CalendarLogHelper dVar = CalendarLogHelper.f78612a;
        C30397a aVar = this.f76147d;
        if (aVar != null) {
            list = aVar.mo109736b();
        } else {
            list = null;
        }
        dVar.mo112732a(list);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.selector.e$e */
    public static final class RunnableC30417e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ CalendarSelectorView f76155a;

        /* renamed from: b */
        final /* synthetic */ int f76156b;

        /* renamed from: c */
        final /* synthetic */ int f76157c;

        RunnableC30417e(CalendarSelectorView eVar, int i, int i2) {
            this.f76155a = eVar;
            this.f76156b = i;
            this.f76157c = i2;
        }

        public final void run() {
            ((RecyclerView) this.f76155a.f76146b.findViewById(R.id.calendarsRV)).smoothScrollToPosition(this.f76156b + this.f76157c);
            ((RecyclerView) this.f76155a.f76146b.findViewById(R.id.calendarsRV)).postDelayed(new Runnable(this) {
                /* class com.ss.android.lark.calendar.impl.features.calendars.selector.CalendarSelectorView.RunnableC30417e.RunnableC304181 */

                /* renamed from: a */
                final /* synthetic */ RunnableC30417e f76158a;

                {
                    this.f76158a = r1;
                }

                public final void run() {
                    ((RecyclerView) this.f76158a.f76155a.f76146b.findViewById(R.id.calendarsRV)).smoothScrollToPosition(this.f76158a.f76156b);
                }
            }, 1000);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.selector.e$f */
    public static final class RunnableC30419f implements Runnable {

        /* renamed from: a */
        final /* synthetic */ CalendarSelectorView f76159a;

        /* renamed from: b */
        final /* synthetic */ int f76160b;

        /* renamed from: c */
        final /* synthetic */ int f76161c;

        RunnableC30419f(CalendarSelectorView eVar, int i, int i2) {
            this.f76159a = eVar;
            this.f76160b = i;
            this.f76161c = i2;
        }

        public final void run() {
            ((RecyclerView) this.f76159a.f76146b.findViewById(R.id.calendarsRV)).smoothScrollToPosition(this.f76160b + this.f76161c);
            ((RecyclerView) this.f76159a.f76146b.findViewById(R.id.calendarsRV)).postDelayed(new Runnable(this) {
                /* class com.ss.android.lark.calendar.impl.features.calendars.selector.CalendarSelectorView.RunnableC30419f.RunnableC304201 */

                /* renamed from: a */
                final /* synthetic */ RunnableC30419f f76162a;

                {
                    this.f76162a = r1;
                }

                public final void run() {
                    ((RecyclerView) this.f76162a.f76159a.f76146b.findViewById(R.id.calendarsRV)).smoothScrollToPosition(this.f76162a.f76160b);
                }
            }, 1000);
        }
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendars.selector.CalendarSelectorContract.ICalendarSelectorView
    /* renamed from: a */
    public void mo109765a() {
        CalendarSelectorContract.IViewData fVar = this.f76151h;
        if (fVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewData");
        }
        List<DataListItem> a = fVar.mo109776a();
        C30397a aVar = this.f76147d;
        if (aVar != null) {
            aVar.mo109737b(a);
        }
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendars.selector.CalendarSelectorContract.ICalendarSelectorView
    /* renamed from: b */
    public void mo109768b() {
        CalendarSelectorContract.IViewData fVar = this.f76151h;
        if (fVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewData");
        }
        List<DataListItem> b = fVar.mo109777b();
        C30397a aVar = this.f76147d;
        if (aVar != null) {
            aVar.mo109739c(b);
        }
    }

    /* renamed from: c */
    public final void mo109796c() {
        CalendarHitPoint.m124163v();
        Context context = this.f76146b.getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "rootView.context");
        new CalendarManagerDialog(context, new C30416d(this), false, 4, null).mo109749a();
        C32501e.m124361c();
    }

    /* renamed from: h */
    private final void m113080h() {
        C30397a aVar = new C30397a();
        this.f76147d = aVar;
        if (aVar != null) {
            aVar.mo109733a(new C30414b(this));
        }
        this.f76148e = new LinearLayoutManager(this.f76146b.getContext(), 1, false);
        RecyclerView recyclerView = (RecyclerView) this.f76146b.findViewById(R.id.calendarsRV);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView, "rootView.calendarsRV");
        recyclerView.setLayoutManager(this.f76148e);
        RecyclerView recyclerView2 = (RecyclerView) this.f76146b.findViewById(R.id.calendarsRV);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView2, "rootView.calendarsRV");
        recyclerView2.setAdapter(this.f76147d);
    }

    /* renamed from: i */
    private final void m113081i() {
        RelativeLayout relativeLayout = (RelativeLayout) this.f76146b.findViewById(R.id.titleBarContainer);
        Intrinsics.checkExpressionValueIsNotNull(relativeLayout, "rootView.titleBarContainer");
        ViewGroup.LayoutParams layoutParams = relativeLayout.getLayoutParams();
        if (layoutParams != null) {
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            ImageView imageView = (ImageView) this.f76146b.findViewById(R.id.addCalendarIV);
            Intrinsics.checkExpressionValueIsNotNull(imageView, "rootView.addCalendarIV");
            ViewGroup.LayoutParams layoutParams3 = imageView.getLayoutParams();
            if (layoutParams3 != null) {
                RelativeLayout.LayoutParams layoutParams4 = (RelativeLayout.LayoutParams) layoutParams3;
                ((CommonTitleBar) this.f76146b.findViewById(R.id.titleBar)).setTitle(R.string.Calendar_Nav_Calendars);
                TextView textView = (TextView) this.f76146b.findViewById(R.id.desktopTitle);
                Intrinsics.checkExpressionValueIsNotNull(textView, "rootView.desktopTitle");
                textView.setVisibility(8);
                ((ImageView) this.f76146b.findViewById(R.id.addCalendarIV)).setImageResource(R.drawable.ud_icon_add_outlined);
                ((ImageView) this.f76146b.findViewById(R.id.addCalendarIV)).setColorFilter(UIUtils.getColor(this.f76149f, R.color.text_title));
                ((CommonTitleBar) this.f76146b.findViewById(R.id.titleBar)).setLeftVisible(true);
                layoutParams2.height = -2;
                layoutParams4.rightMargin = UIUtils.dp2px(this.f76149f, 18.0f);
                layoutParams4.width = UIUtils.dp2px(this.f76149f, 24.0f);
                layoutParams4.height = UIUtils.dp2px(this.f76149f, 24.0f);
                RelativeLayout relativeLayout2 = (RelativeLayout) this.f76146b.findViewById(R.id.titleBarContainer);
                Intrinsics.checkExpressionValueIsNotNull(relativeLayout2, "rootView.titleBarContainer");
                relativeLayout2.setLayoutParams(layoutParams2);
                ImageView imageView2 = (ImageView) this.f76146b.findViewById(R.id.addCalendarIV);
                Intrinsics.checkExpressionValueIsNotNull(imageView2, "rootView.addCalendarIV");
                imageView2.setLayoutParams(layoutParams4);
                ((ImageView) this.f76146b.findViewById(R.id.addCalendarIV)).setOnClickListener(new View$OnClickListenerC30415c(this));
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        }
        throw new TypeCastException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000/\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\"\u0010\u0004\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0016J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u000b\u001a\u00020\u00032\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0010H\u0016¨\u0006\u0011"}, d2 = {"com/ss/android/lark/calendar/impl/features/calendars/selector/CalendarSelectorView$initRecycleView$1", "Lcom/ss/android/lark/calendar/impl/features/calendars/selector/CalendarSelectorAdapter$OnRecyclerViewItemClickListener;", "onAddCalendarClick", "", "onCalendarItemClick", "calendarId", "", "isVisible", "", "isLocalCal", "onCalendarManageIconClick", "onGotoAccountManagePage", "accountItem", "Lcom/ss/android/lark/calendar/impl/features/settings/account/AccountDataListItem;", "onSelected", "select", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.selector.e$b */
    public static final class C30414b implements C30397a.AbstractC30399a {

        /* renamed from: a */
        final /* synthetic */ CalendarSelectorView f76152a;

        @Override // com.ss.android.lark.calendar.impl.features.calendars.selector.C30397a.AbstractC30399a
        /* renamed from: a */
        public void mo109743a() {
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendars.selector.C30397a.AbstractC30399a
        /* renamed from: a */
        public void mo109744a(int i) {
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendars.selector.C30397a.AbstractC30399a
        /* renamed from: b */
        public /* synthetic */ void mo109748b() {
            C30397a.AbstractC30399a.CC.$default$b(this);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C30414b(CalendarSelectorView eVar) {
            this.f76152a = eVar;
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendars.selector.C30397a.AbstractC30399a
        /* renamed from: a */
        public void mo109745a(AccountDataListItem aVar) {
            if (aVar != null) {
                CalendarSelectorView.m113076a(this.f76152a).mo109718a(aVar);
            }
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendars.selector.C30397a.AbstractC30399a
        /* renamed from: a */
        public void mo109746a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "calendarId");
            CalendarSelectorView.m113076a(this.f76152a).mo109719a(str);
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendars.selector.C30397a.AbstractC30399a
        /* renamed from: a */
        public void mo109747a(String str, boolean z, boolean z2) {
            String str2;
            if (str == null) {
                return;
            }
            if (z2) {
                CalendarSelectorView.m113076a(this.f76152a).mo109722b(str, z);
                return;
            }
            if (z) {
                str2 = "checkCal";
            } else {
                str2 = "uncheckCal";
            }
            Log.m165389i("CalendarSelectorView", C32673y.m125369a(str2));
            CalendarSelectorView.m113076a(this.f76152a).mo109720a(str, z);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.selector.e$c */
    public static final class View$OnClickListenerC30415c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ CalendarSelectorView f76153a;

        View$OnClickListenerC30415c(CalendarSelectorView eVar) {
            this.f76153a = eVar;
        }

        public final void onClick(View view) {
            this.f76153a.mo109796c();
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ CalendarSelectorContract.IViewAction m113076a(CalendarSelectorView eVar) {
        CalendarSelectorContract.IViewAction eVar2 = eVar.f76145a;
        if (eVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewAction");
        }
        return eVar2;
    }

    public CalendarSelectorView(View view) {
        Intrinsics.checkParameterIsNotNull(view, "rootView");
        this.f76146b = view;
        Context context = view.getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "rootView.context");
        this.f76149f = context;
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendars.selector.CalendarSelectorContract.ICalendarSelectorView
    /* renamed from: c */
    public void mo109770c(String str) {
        int[] b;
        Intrinsics.checkParameterIsNotNull(str, "calendarId");
        C30397a aVar = this.f76147d;
        if (aVar != null && (b = aVar.mo109738b(str)) != null) {
            m113077a(b[0], b[1]);
        }
    }

    /* renamed from: d */
    private final void m113079d(String str) {
        int i;
        C30397a aVar = this.f76147d;
        if (aVar != null) {
            i = aVar.getItemCount();
        } else {
            i = 0;
        }
        for (int i2 = 0; i2 < i; i2++) {
            RecyclerView.ViewHolder findViewHolderForAdapterPosition = ((RecyclerView) this.f76146b.findViewById(R.id.calendarsRV)).findViewHolderForAdapterPosition(i2);
            if (findViewHolderForAdapterPosition instanceof CalendarCellVH) {
                CalendarCellVH cVar = (CalendarCellVH) findViewHolderForAdapterPosition;
                if (Intrinsics.areEqual(str, cVar.mo109852d())) {
                    cVar.mo109853e();
                }
            }
        }
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendars.selector.CalendarSelectorContract.ICalendarSelectorView
    /* renamed from: b */
    public void mo109769b(String str) {
        int[] a;
        Intrinsics.checkParameterIsNotNull(str, "newAccount");
        C30397a aVar = this.f76147d;
        if (aVar != null && (a = aVar.mo109735a(str)) != null) {
            m113078b(a[0], a[1]);
        }
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendars.selector.CalendarSelectorContract.ICalendarSelectorView
    /* renamed from: a */
    public void mo109766a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "syncErrorCalId");
        m113079d(str);
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendars.selector.CalendarSelectorContract.ICalendarSelectorView
    /* renamed from: a */
    public void mo109767a(List<String> list) {
        Intrinsics.checkParameterIsNotNull(list, "syncedCalendarIds");
        for (String str : list) {
            m113079d(str);
        }
    }

    /* renamed from: a */
    private final void m113077a(int i, int i2) {
        LinearLayoutManager linearLayoutManager = this.f76148e;
        if (linearLayoutManager != null) {
            linearLayoutManager.scrollToPositionWithOffset(0, 0);
        }
        RunnableC30419f fVar = new RunnableC30419f(this, i, i2);
        this.f76150g = fVar;
        if (fVar != null) {
            UICallbackExecutor.removeCallbacks(fVar);
        }
        UICallbackExecutor.executeDelayed(this.f76150g, 1000);
    }

    /* renamed from: b */
    private final void m113078b(int i, int i2) {
        LinearLayoutManager linearLayoutManager = this.f76148e;
        if (linearLayoutManager != null) {
            linearLayoutManager.scrollToPositionWithOffset(0, 0);
        }
        this.f76146b.postDelayed(new RunnableC30417e(this, i, i2), 1000);
    }

    /* renamed from: a */
    public void mo109795a(CalendarSelectorContract.IViewData fVar, CalendarSelectorContract.IViewAction eVar) {
        Intrinsics.checkParameterIsNotNull(fVar, "vi");
        Intrinsics.checkParameterIsNotNull(eVar, "vo");
        this.f76151h = fVar;
        this.f76145a = eVar;
    }
}
