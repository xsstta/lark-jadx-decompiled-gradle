package com.larksuite.component.universe_design.datepicker.impl;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.viewpager.widget.PagerAdapter;
import com.larksuite.component.universe_design.datepicker.impl.infinite.InfiniteViewPager;
import com.larksuite.component.universe_design.datepicker.impl.infinite.OnSmoothScrollFinishListener;
import com.larksuite.component.universe_design.datepicker.impl.infinite.OnViewPagerChange;
import com.larksuite.component.universe_design.datepicker.impl.listener.IMonthViewListener;
import com.larksuite.component.universe_design.datepicker.impl.monthview.MonthView;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u001b\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\t\u001a\u0004\u0018\u00010\nJ\u0006\u0010\u000b\u001a\u00020\fJ\b\u0010\r\u001a\u0004\u0018\u00010\nJ\b\u0010\u000e\u001a\u0004\u0018\u00010\nJ\b\u0010\u000f\u001a\u00020\u0010H\u0002J\u000e\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\fJ\u0010\u0010\u0013\u001a\u00020\u00102\b\u0010\u0007\u001a\u0004\u0018\u00010\bR\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/larksuite/component/universe_design/datepicker/impl/MonthViewPager;", "Lcom/larksuite/component/universe_design/datepicker/impl/infinite/InfiniteViewPager;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "viewPageListener", "Lcom/larksuite/component/universe_design/datepicker/impl/listener/IMonthViewListener;", "getCenterView", "Lcom/larksuite/component/universe_design/datepicker/impl/monthview/MonthView;", "getCenterViewHeight", "", "getLeftView", "getRightView", "initView", "", "scrollToPage", "offset", "setViewPageListener", "universe-ui-datepicker_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class MonthViewPager extends InfiniteViewPager {

    /* renamed from: a */
    public IMonthViewListener f63190a;

    public MonthViewPager(Context context) {
        this(context, null, 2, null);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/larksuite/component/universe_design/datepicker/impl/MonthViewPager$initView$1", "Lcom/larksuite/component/universe_design/datepicker/impl/infinite/OnViewPagerChange;", "afterPageRotateChange", "", "rotateOperation", "", "universe-ui-datepicker_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.universe_design.datepicker.impl.MonthViewPager$a */
    public static final class C25737a implements OnViewPagerChange {

        /* renamed from: a */
        final /* synthetic */ MonthViewPager f63191a;

        @Override // com.larksuite.component.universe_design.datepicker.impl.infinite.OnViewPagerChange
        /* renamed from: a */
        public void mo90454a() {
            OnViewPagerChange.C25742a.m92705a(this);
        }

        @Override // com.larksuite.component.universe_design.datepicker.impl.infinite.OnViewPagerChange
        /* renamed from: b */
        public void mo90457b(int i) {
            OnViewPagerChange.C25742a.m92706a(this, i);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C25737a(MonthViewPager monthViewPager) {
            this.f63191a = monthViewPager;
        }

        @Override // com.larksuite.component.universe_design.datepicker.impl.infinite.OnViewPagerChange
        /* renamed from: a */
        public void mo90455a(int i) {
            PagerAdapter adapter = this.f63191a.getAdapter();
            if (!(adapter instanceof MonthCalendarViewAdapter)) {
                adapter = null;
            }
            MonthCalendarViewAdapter aVar = (MonthCalendarViewAdapter) adapter;
            if (aVar == null) {
                return;
            }
            if (i == 0) {
                IMonthViewListener cVar = this.f63191a.f63190a;
                if (cVar != null) {
                    cVar.mo90445a(aVar.mo90469e());
                }
                IMonthViewListener cVar2 = this.f63191a.f63190a;
                if (cVar2 != null) {
                    cVar2.mo90446b();
                }
            } else if (i == 1) {
                IMonthViewListener cVar3 = this.f63191a.f63190a;
                if (cVar3 != null) {
                    cVar3.mo90445a(aVar.mo90468d());
                }
                IMonthViewListener cVar4 = this.f63191a.f63190a;
                if (cVar4 != null) {
                    cVar4.mo90444a();
                }
            }
        }

        @Override // com.larksuite.component.universe_design.datepicker.impl.infinite.OnViewPagerChange
        /* renamed from: a */
        public void mo90456a(View view, View view2) {
            Intrinsics.checkParameterIsNotNull(view, "from");
            Intrinsics.checkParameterIsNotNull(view2, "to");
            OnViewPagerChange.C25742a.m92707a(this, view, view2);
        }

        @Override // com.larksuite.component.universe_design.datepicker.impl.infinite.OnViewPagerChange
        /* renamed from: b */
        public void mo90458b(View view, View view2) {
            Intrinsics.checkParameterIsNotNull(view, "from");
            Intrinsics.checkParameterIsNotNull(view2, "to");
            OnViewPagerChange.C25742a.m92708b(this, view, view2);
        }
    }

    public final int getCenterViewHeight() {
        MonthView centerView = getCenterView();
        if (centerView != null) {
            return centerView.getCurrentHeight();
        }
        return 0;
    }

    /* renamed from: a */
    private final void m92603a() {
        setWillNotDraw(false);
        setOffscreenPageLimit(3);
        mo90536a(new C25737a(this));
    }

    public final MonthView getCenterView() {
        PagerAdapter adapter = getAdapter();
        if (!(adapter instanceof MonthCalendarViewAdapter)) {
            adapter = null;
        }
        MonthCalendarViewAdapter aVar = (MonthCalendarViewAdapter) adapter;
        if (aVar != null) {
            return (MonthView) aVar.mo90545c(1);
        }
        return null;
    }

    public final MonthView getLeftView() {
        PagerAdapter adapter = getAdapter();
        if (!(adapter instanceof MonthCalendarViewAdapter)) {
            adapter = null;
        }
        MonthCalendarViewAdapter aVar = (MonthCalendarViewAdapter) adapter;
        if (aVar != null) {
            return (MonthView) aVar.mo90545c(0);
        }
        return null;
    }

    public final MonthView getRightView() {
        PagerAdapter adapter = getAdapter();
        if (!(adapter instanceof MonthCalendarViewAdapter)) {
            adapter = null;
        }
        MonthCalendarViewAdapter aVar = (MonthCalendarViewAdapter) adapter;
        if (aVar != null) {
            return (MonthView) aVar.mo90545c(2);
        }
        return null;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/larksuite/component/universe_design/datepicker/impl/MonthViewPager$scrollToPage$1", "Lcom/larksuite/component/universe_design/datepicker/impl/infinite/OnSmoothScrollFinishListener;", "onSmoothScrollFinish", "", "universe-ui-datepicker_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.universe_design.datepicker.impl.MonthViewPager$b */
    public static final class C25738b implements OnSmoothScrollFinishListener {

        /* renamed from: a */
        final /* synthetic */ MonthViewPager f63192a;

        /* renamed from: b */
        final /* synthetic */ int f63193b;

        @Override // com.larksuite.component.universe_design.datepicker.impl.infinite.OnSmoothScrollFinishListener
        /* renamed from: a */
        public void mo90459a() {
            IMonthViewListener cVar;
            MonthCalendarViewAdapter aVar = (MonthCalendarViewAdapter) this.f63192a.getAdapter();
            if (aVar != null) {
                aVar.mo90465b();
            }
            int i = this.f63193b;
            if (i < 0) {
                IMonthViewListener cVar2 = this.f63192a.f63190a;
                if (cVar2 != null) {
                    cVar2.mo90444a();
                }
            } else if (i > 0 && (cVar = this.f63192a.f63190a) != null) {
                cVar.mo90446b();
            }
        }

        C25738b(MonthViewPager monthViewPager, int i) {
            this.f63192a = monthViewPager;
            this.f63193b = i;
        }
    }

    public final void setViewPageListener(IMonthViewListener cVar) {
        this.f63190a = cVar;
    }

    /* renamed from: a */
    public final void mo90448a(int i) {
        int i2;
        if (i > 0) {
            i2 = 2;
        } else {
            i2 = 0;
        }
        mo90535a(i2, false);
        setOnSmoothScrollFinishListener(new C25738b(this, i));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MonthViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkParameterIsNotNull(context, "context");
        m92603a();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MonthViewPager(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
