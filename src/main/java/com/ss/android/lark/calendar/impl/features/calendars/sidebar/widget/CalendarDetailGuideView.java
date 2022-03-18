package com.ss.android.lark.calendar.impl.features.calendars.sidebar.widget;

import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.calendars.selector.vh.CalendarCellVH;
import com.ss.android.lark.calendar.impl.features.calendars.selector.vh.DataListItem;
import com.ss.android.lark.calendar.impl.features.common.widget.guide.CalendarGuideManager;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.Calendar;
import com.ss.android.lark.calendar.impl.utils.C32659l;
import com.ss.android.lark.calendar.impl.utils.an;
import com.ss.android.ttvecamera.p3038g.C60375c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\r\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007JR\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u0013H\u0016J\b\u0010\u001b\u001a\u00020\u000fH\u0016J\u0010\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u0011H\u0002J\u0018\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u0011H\u0002R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006 "}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendars/sidebar/widget/CalendarDetailGuideView;", "Landroid/view/View$OnLayoutChangeListener;", "Ljava/lang/Runnable;", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "container", "Landroid/widget/FrameLayout;", "(Landroidx/recyclerview/widget/RecyclerView;Landroid/widget/FrameLayout;)V", "getContainer", "()Landroid/widget/FrameLayout;", "needShow", "", "getRecyclerView", "()Landroidx/recyclerview/widget/RecyclerView;", "onLayoutChange", "", "v", "Landroid/view/View;", "left", "", "top", "right", "bottom", "oldLeft", "oldTop", "oldRight", "oldBottom", "run", "show", "anchor", "showAt", "contentView", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.calendars.sidebar.widget.a */
public final class CalendarDetailGuideView implements View.OnLayoutChangeListener, Runnable {

    /* renamed from: a */
    private boolean f76488a;

    /* renamed from: b */
    private final RecyclerView f76489b;

    /* renamed from: c */
    private final FrameLayout f76490c;

    /* renamed from: a */
    public final FrameLayout mo110305a() {
        return this.f76490c;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.sidebar.widget.a$b */
    public static final class RunnableC30578b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ CalendarDetailGuideView f76493a;

        /* renamed from: b */
        final /* synthetic */ View f76494b;

        /* renamed from: c */
        final /* synthetic */ View f76495c;

        RunnableC30578b(CalendarDetailGuideView aVar, View view, View view2) {
            this.f76493a = aVar;
            this.f76494b = view;
            this.f76495c = view2;
        }

        public final void run() {
            CalendarDetailGuideView aVar = this.f76493a;
            View view = this.f76494b;
            Intrinsics.checkExpressionValueIsNotNull(view, "contentView");
            aVar.mo110306a(view, this.f76495c);
        }
    }

    public void run() {
        View childAt;
        DataListItem a;
        Calendar o;
        View view = null;
        int childCount = this.f76489b.getChildCount();
        int i = 0;
        View view2 = view;
        while (true) {
            if (i >= childCount) {
                break;
            }
            childAt = this.f76489b.getChildAt(i);
            int[] iArr = new int[2];
            childAt.getLocationInWindow(iArr);
            if (iArr[1] >= 0) {
                int i2 = iArr[1];
                Intrinsics.checkExpressionValueIsNotNull(childAt, C60375c.f150914a);
                if (i2 + childAt.getHeight() > this.f76489b.getHeight()) {
                    continue;
                } else {
                    RecyclerView.ViewHolder childViewHolder = this.f76489b.getChildViewHolder(childAt);
                    if (!(!(childViewHolder instanceof CalendarCellVH) || (a = ((CalendarCellVH) childViewHolder).mo109848a()) == null || (o = a.mo109830o()) == null)) {
                        if (o.getType() == Calendar.Type.ACTIVITY || o.getType() == Calendar.Type.OTHER) {
                            view = childAt;
                        } else if (o.getSelfAccessRole() == Calendar.AccessRole.OWNER && o.getType() == Calendar.Type.PRIMARY && view2 == null) {
                            view2 = childAt;
                        }
                    }
                }
            }
            i++;
        }
        view = childAt;
        if (view != null) {
            view2 = view;
        }
        if (view2 != null) {
            m113614a(view2);
        }
    }

    /* renamed from: a */
    private final void m113614a(View view) {
        this.f76488a = false;
        CalendarGuideManager.f78922a.mo113195d();
        this.f76489b.stopScroll();
        View inflate = LayoutInflater.from(this.f76490c.getContext()).inflate(R.layout.calendar_view_calendar_detail_guide, (ViewGroup) this.f76490c, false);
        View findViewById = inflate.findViewById(R.id.guide_dot_top);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "v.findViewById<View>(R.id.guide_dot_top)");
        an.m125209a(findViewById);
        View findViewById2 = inflate.findViewById(R.id.guide_image);
        Intrinsics.checkExpressionValueIsNotNull(findViewById2, "v.findViewById<View>(R.id.guide_image)");
        an.m125210a(findViewById2, Integer.valueOf(C32659l.m125335a((Number) 4)));
        View findViewById3 = inflate.findViewById(R.id.guide_dot_bottom);
        Intrinsics.checkExpressionValueIsNotNull(findViewById3, "v.findViewById<View>(R.id.guide_dot_bottom)");
        an.m125209a(findViewById3);
        inflate.setOnTouchListener(new View$OnTouchListenerC30577a(this, inflate));
        View findViewById4 = inflate.findViewById(R.id.content_view);
        Intrinsics.checkExpressionValueIsNotNull(findViewById4, "contentView");
        findViewById4.setAlpha(BitmapDescriptorFactory.HUE_RED);
        this.f76490c.addView(inflate, new FrameLayout.LayoutParams(-1, -1));
        inflate.post(new RunnableC30578b(this, findViewById4, view));
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00060\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/view/View;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "Landroid/view/MotionEvent;", "onTouch"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.sidebar.widget.a$a */
    public static final class View$OnTouchListenerC30577a implements View.OnTouchListener {

        /* renamed from: a */
        final /* synthetic */ CalendarDetailGuideView f76491a;

        /* renamed from: b */
        final /* synthetic */ View f76492b;

        View$OnTouchListenerC30577a(CalendarDetailGuideView aVar, View view) {
            this.f76491a = aVar;
            this.f76492b = view;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            View view2 = this.f76492b;
            Intrinsics.checkExpressionValueIsNotNull(view2, "v");
            view2.setVisibility(8);
            this.f76491a.mo110305a().removeView(this.f76492b);
            return false;
        }
    }

    public CalendarDetailGuideView(RecyclerView recyclerView, FrameLayout frameLayout) {
        Intrinsics.checkParameterIsNotNull(recyclerView, "recyclerView");
        Intrinsics.checkParameterIsNotNull(frameLayout, "container");
        this.f76489b = recyclerView;
        this.f76490c = frameLayout;
        boolean c = CalendarGuideManager.f78922a.mo113194c();
        this.f76488a = c;
        if (c) {
            recyclerView.addOnLayoutChangeListener(this);
        }
    }

    /* renamed from: a */
    public final void mo110306a(View view, View view2) {
        float f;
        int[] iArr = new int[2];
        view2.getLocationInWindow(iArr);
        int height = iArr[1] + (view2.getHeight() / 2);
        this.f76490c.getLocationInWindow(iArr);
        int i = iArr[1];
        if (height > this.f76490c.getHeight() / 2) {
            View findViewById = view.findViewById(R.id.guide_dot_top);
            Intrinsics.checkExpressionValueIsNotNull(findViewById, "contentView.findViewById<View>(R.id.guide_dot_top)");
            findViewById.setVisibility(4);
            View findViewById2 = view.findViewById(R.id.guide_triangle_top);
            Intrinsics.checkExpressionValueIsNotNull(findViewById2, "contentView.findViewById…(R.id.guide_triangle_top)");
            findViewById2.setVisibility(4);
            f = ((((float) height) - ((float) i)) - ((float) view.getHeight())) + ((float) C32659l.m125335a((Number) 12));
        } else {
            View findViewById3 = view.findViewById(R.id.guide_dot_bottom);
            Intrinsics.checkExpressionValueIsNotNull(findViewById3, "contentView.findViewById…w>(R.id.guide_dot_bottom)");
            findViewById3.setVisibility(4);
            View findViewById4 = view.findViewById(R.id.guide_triangle_bottom);
            Intrinsics.checkExpressionValueIsNotNull(findViewById4, "contentView.findViewById…id.guide_triangle_bottom)");
            findViewById4.setVisibility(4);
            f = (((float) height) - ((float) i)) - ((float) C32659l.m125335a((Number) 12));
        }
        if (f < BitmapDescriptorFactory.HUE_RED) {
            f = BitmapDescriptorFactory.HUE_RED;
        } else if (f > ((float) (this.f76490c.getHeight() - view.getHeight()))) {
            f = ((float) this.f76490c.getHeight()) - ((float) view.getHeight());
        }
        view.setY(f);
        view.animate().alpha(1.0f).start();
    }

    public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (this.f76488a) {
            CalendarDetailGuideView aVar = this;
            this.f76489b.removeCallbacks(aVar);
            this.f76489b.postDelayed(aVar, 200);
        }
    }
}
