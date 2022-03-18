package com.ss.android.lark.calendar.impl.features.arrange.arrangetime.widget;

import android.view.MotionEvent;
import android.widget.HorizontalScrollView;
import com.ss.android.lark.calendar.impl.features.arrange.arrangetime.widget.OverHorizScrollView;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\bR\u0010\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0004\n\u0002\u0010\u0005R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/arrange/arrangetime/widget/OverScrollObserver;", "", "()V", "mOnScrollListenerImpl", "com/ss/android/lark/calendar/impl/features/arrange/arrangetime/widget/OverScrollObserver$mOnScrollListenerImpl$1", "Lcom/ss/android/lark/calendar/impl/features/arrange/arrangetime/widget/OverScrollObserver$mOnScrollListenerImpl$1;", "mScrollViewObservers", "Ljava/util/ArrayList;", "Lcom/ss/android/lark/calendar/impl/features/arrange/arrangetime/widget/OverHorizScrollView;", "addObserver", "", "scrollView", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.arrange.arrangetime.widget.c */
public final class OverScrollObserver {

    /* renamed from: a */
    public final ArrayList<OverHorizScrollView> f75566a = new ArrayList<>();

    /* renamed from: b */
    private final C30235a f75567b = new C30235a(this);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016J\u0012\u0010\u000b\u001a\u00020\u00072\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J\u0012\u0010\u000e\u001a\u00020\u00072\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003H\u0016R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"com/ss/android/lark/calendar/impl/features/arrange/arrangetime/widget/OverScrollObserver$mOnScrollListenerImpl$1", "Lcom/ss/android/lark/calendar/impl/features/arrange/arrangetime/widget/OverHorizScrollView$ScrollListener;", "mScrollTrigger", "Landroid/widget/HorizontalScrollView;", "hasTrigger", "", "onScroll", "", "scrollX", "", "scrollY", "onTouch", "ev", "Landroid/view/MotionEvent;", "setTrigger", "scrollView", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.arrange.arrangetime.widget.c$a */
    public static final class C30235a implements OverHorizScrollView.ScrollListener {

        /* renamed from: a */
        final /* synthetic */ OverScrollObserver f75568a;

        /* renamed from: b */
        private HorizontalScrollView f75569b;

        @Override // com.ss.android.lark.calendar.impl.features.arrange.arrangetime.widget.OverHorizScrollView.ScrollListener
        /* renamed from: a */
        public boolean mo109082a() {
            if (this.f75569b != null) {
                return true;
            }
            return false;
        }

        @Override // com.ss.android.lark.calendar.impl.features.arrange.arrangetime.widget.OverHorizScrollView.ScrollListener
        /* renamed from: a */
        public void mo109081a(HorizontalScrollView horizontalScrollView) {
            this.f75569b = horizontalScrollView;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C30235a(OverScrollObserver cVar) {
            this.f75568a = cVar;
        }

        @Override // com.ss.android.lark.calendar.impl.features.arrange.arrangetime.widget.OverHorizScrollView.ScrollListener
        /* renamed from: a */
        public void mo109080a(MotionEvent motionEvent) {
            Iterator<OverHorizScrollView> it = this.f75568a.f75566a.iterator();
            while (it.hasNext()) {
                OverHorizScrollView next = it.next();
                if (next != this.f75569b) {
                    next.onTouchEvent(motionEvent);
                }
            }
        }

        @Override // com.ss.android.lark.calendar.impl.features.arrange.arrangetime.widget.OverHorizScrollView.ScrollListener
        /* renamed from: a */
        public void mo109079a(int i, int i2) {
            Iterator<OverHorizScrollView> it = this.f75568a.f75566a.iterator();
            while (it.hasNext()) {
                OverHorizScrollView next = it.next();
                if (next != this.f75569b) {
                    next.scrollTo(i, i2);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo109126a(OverHorizScrollView overHorizScrollView) {
        Intrinsics.checkParameterIsNotNull(overHorizScrollView, "scrollView");
        if (!this.f75566a.contains(overHorizScrollView)) {
            this.f75566a.add(overHorizScrollView);
            overHorizScrollView.setScrollViewListener(this.f75567b);
        }
    }
}
