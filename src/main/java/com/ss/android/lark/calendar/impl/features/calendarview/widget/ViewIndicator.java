package com.ss.android.lark.calendar.impl.features.calendarview.widget;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.larksuite.component.universe_design.tab.UDTab;
import com.larksuite.component.universe_design.tab.UDTabItem;
import com.larksuite.component.universe_design.tab.UDTabLayout;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.calendars.sidebar.CalendarSideBarEntrance;
import com.ss.android.lark.calendar.impl.features.calendarview.p1467c.C30667a;
import com.ss.android.lark.calendar.impl.features.common.widget.guide.CalendarGuideManager;
import com.ss.android.lark.calendar.impl.framework.hitpoint.event.GeneralHitPoint;
import com.ss.android.lark.calendar.impl.framework.hitpoint.event2.CalendarMainHitPoint;
import com.ss.android.lark.calendar.impl.utils.an;
import com.ss.android.lark.utils.UIHelper;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u0000 \u00142\u00020\u0001:\u0002\u0014\u0015B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\u000f\u001a\u00020\u0010H\u0002J\b\u0010\u0011\u001a\u00020\u0010H\u0002J\u0006\u0010\u0012\u001a\u00020\u0010J\u0006\u0010\u0013\u001a\u00020\u0010R\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0016"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/widget/ViewIndicator;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "clickListener", "Lcom/ss/android/lark/calendar/impl/features/calendarview/widget/ViewIndicator$IndicatorClickListener;", "getClickListener", "()Lcom/ss/android/lark/calendar/impl/features/calendarview/widget/ViewIndicator$IndicatorClickListener;", "setClickListener", "(Lcom/ss/android/lark/calendar/impl/features/calendarview/widget/ViewIndicator$IndicatorClickListener;)V", "handleOnCalendarClick", "", "handleOnRoomClick", "selectCalendar", "selectRoom", "Companion", "IndicatorClickListener", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class ViewIndicator extends LinearLayout {

    /* renamed from: a */
    public static final Companion f78521a = new Companion(null);

    /* renamed from: b */
    private IndicatorClickListener f78522b;

    /* renamed from: c */
    private HashMap f78523c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/widget/ViewIndicator$IndicatorClickListener;", "", "onCalendarSelected", "", "onRoomSelected", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.widget.ViewIndicator$b */
    public interface IndicatorClickListener {
        /* renamed from: a */
        void mo111870a();

        /* renamed from: b */
        void mo111871b();
    }

    public ViewIndicator(Context context) {
        this(context, null, 0, 6, null);
    }

    public ViewIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* renamed from: a */
    public View mo112651a(int i) {
        if (this.f78523c == null) {
            this.f78523c = new HashMap();
        }
        View view = (View) this.f78523c.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f78523c.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/widget/ViewIndicator$Companion;", "", "()V", "POSITION_CALENDAR", "", "POSITION_ROOM", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.widget.ViewIndicator$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final IndicatorClickListener getClickListener() {
        return this.f78522b;
    }

    /* renamed from: d */
    public final void mo112655d() {
        if (((UDTabLayout) mo112651a(R.id.viewTab)).getSelectPosition() != 1) {
            ((UDTabLayout) mo112651a(R.id.viewTab)).selectTabAt(1);
        }
        ImageView imageView = (ImageView) mo112651a(R.id.sidebarEntrance);
        Intrinsics.checkExpressionValueIsNotNull(imageView, "sidebarEntrance");
        imageView.setVisibility(8);
        View a = mo112651a(R.id.sidebarEntranceDot);
        Intrinsics.checkExpressionValueIsNotNull(a, "sidebarEntranceDot");
        a.setVisibility(8);
    }

    /* renamed from: a */
    public final void mo112652a() {
        GeneralHitPoint.m124172J("resource_view");
        if (!C30667a.m114021c()) {
            GeneralHitPoint.m124169B();
        }
        ImageView imageView = (ImageView) mo112651a(R.id.sidebarEntrance);
        Intrinsics.checkExpressionValueIsNotNull(imageView, "sidebarEntrance");
        imageView.setVisibility(8);
        View a = mo112651a(R.id.sidebarEntranceDot);
        Intrinsics.checkExpressionValueIsNotNull(a, "sidebarEntranceDot");
        a.setVisibility(8);
        C30667a.m114022d();
        IndicatorClickListener bVar = this.f78522b;
        if (bVar != null) {
            bVar.mo111871b();
        }
    }

    /* renamed from: b */
    public final void mo112653b() {
        GeneralHitPoint.m124172J("calendar_view");
        ImageView imageView = (ImageView) mo112651a(R.id.sidebarEntrance);
        Intrinsics.checkExpressionValueIsNotNull(imageView, "sidebarEntrance");
        imageView.setVisibility(0);
        View a = mo112651a(R.id.sidebarEntranceDot);
        Intrinsics.checkExpressionValueIsNotNull(a, "sidebarEntranceDot");
        if (an.m125213a(a, CalendarGuideManager.f78922a.mo113190a())) {
            View a2 = mo112651a(R.id.sidebarEntranceDot);
            Intrinsics.checkExpressionValueIsNotNull(a2, "sidebarEntranceDot");
            an.m125209a(a2);
        }
        C30667a.m114023e();
        IndicatorClickListener bVar = this.f78522b;
        if (bVar != null) {
            bVar.mo111870a();
        }
        if (!C30667a.m114021c()) {
            CalendarMainHitPoint.m124362a();
        }
    }

    /* renamed from: c */
    public final void mo112654c() {
        if (((UDTabLayout) mo112651a(R.id.viewTab)).getSelectPosition() != 0) {
            ((UDTabLayout) mo112651a(R.id.viewTab)).selectTabAt(0);
        }
        ImageView imageView = (ImageView) mo112651a(R.id.sidebarEntrance);
        Intrinsics.checkExpressionValueIsNotNull(imageView, "sidebarEntrance");
        imageView.setVisibility(0);
        View a = mo112651a(R.id.sidebarEntranceDot);
        Intrinsics.checkExpressionValueIsNotNull(a, "sidebarEntranceDot");
        if (an.m125213a(a, CalendarGuideManager.f78922a.mo113190a())) {
            View a2 = mo112651a(R.id.sidebarEntranceDot);
            Intrinsics.checkExpressionValueIsNotNull(a2, "sidebarEntranceDot");
            an.m125209a(a2);
        }
    }

    public final void setClickListener(IndicatorClickListener bVar) {
        this.f78522b = bVar;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ViewIndicator(final Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
        LayoutInflater.from(context).inflate(R.layout.view_indicator, (ViewGroup) this, true);
        mo112654c();
        ((ImageView) mo112651a(R.id.sidebarEntrance)).setOnClickListener(new View.OnClickListener(this) {
            /* class com.ss.android.lark.calendar.impl.features.calendarview.widget.ViewIndicator.View$OnClickListenerC310971 */

            /* renamed from: a */
            final /* synthetic */ ViewIndicator f78524a;

            {
                this.f78524a = r1;
            }

            public final void onClick(View view) {
                CalendarMainHitPoint.m124364a("calendar_list_open", null, null, 6, null);
                CalendarSideBarEntrance.m113510a(context);
                View a = this.f78524a.mo112651a(R.id.sidebarEntranceDot);
                Intrinsics.checkExpressionValueIsNotNull(a, "sidebarEntranceDot");
                if (a.getVisibility() == 0) {
                    View a2 = this.f78524a.mo112651a(R.id.sidebarEntranceDot);
                    Intrinsics.checkExpressionValueIsNotNull(a2, "sidebarEntranceDot");
                    a2.setVisibility(8);
                    CalendarGuideManager.f78922a.mo113191b();
                }
            }
        });
        ((UDTabLayout) mo112651a(R.id.viewTab)).addOnTabSelectedListener(new UDTabLayout.OnTabSelectedListener(this) {
            /* class com.ss.android.lark.calendar.impl.features.calendarview.widget.ViewIndicator.C310982 */

            /* renamed from: a */
            final /* synthetic */ ViewIndicator f78526a;

            @Override // com.larksuite.component.universe_design.tab.UDTabLayout.OnTabSelectedListener
            /* renamed from: a */
            public void mo53906a(UDTab bVar) {
                Intrinsics.checkParameterIsNotNull(bVar, "tab");
            }

            @Override // com.larksuite.component.universe_design.tab.UDTabLayout.OnTabSelectedListener
            /* renamed from: b */
            public void mo53907b(UDTab bVar) {
                Intrinsics.checkParameterIsNotNull(bVar, "tab");
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            {
                this.f78526a = r1;
            }

            @Override // com.larksuite.component.universe_design.tab.UDTabLayout.OnTabSelectedListener
            /* renamed from: c */
            public void mo53908c(UDTab bVar) {
                Intrinsics.checkParameterIsNotNull(bVar, "tab");
                int d = bVar.mo91343d();
                if (d == 0) {
                    this.f78526a.mo112653b();
                } else if (d == 1) {
                    this.f78526a.mo112652a();
                }
            }
        });
        ((ImageView) mo112651a(R.id.sidebarEntrance)).setColorFilter(UIHelper.getColor(R.color.icon_n2));
        CalendarGuideManager.f78922a.mo113199f((Activity) (!(context instanceof Activity) ? null : context), (UDTabItem) mo112651a(R.id.roomTabItem));
        GeneralHitPoint.m124170C();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ViewIndicator(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
