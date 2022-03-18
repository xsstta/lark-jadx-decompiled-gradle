package com.larksuite.framework.ui.p1198b;

import android.graphics.Rect;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: com.larksuite.framework.ui.b.b */
public class C26186b implements RecyclerView.AbstractC1338g {

    /* renamed from: a */
    public final RecyclerView f64665a;

    /* renamed from: b */
    public final C26198f f64666b;

    /* renamed from: c */
    private final GestureDetector f64667c;

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1338g
    /* renamed from: a */
    public void mo6561a(boolean z) {
    }

    /* renamed from: com.larksuite.framework.ui.b.b$a */
    private class C26188a extends GestureDetector.SimpleOnGestureListener {
        public boolean onDoubleTap(MotionEvent motionEvent) {
            return true;
        }

        private C26188a() {
        }

        public boolean onSingleTapUp(MotionEvent motionEvent) {
            int a = C26186b.this.f64666b.mo93180a((int) motionEvent.getX(), (int) motionEvent.getY());
            if (a == -1) {
                return false;
            }
            m94723a(C26186b.this.f64666b.mo93181a(C26186b.this.f64665a, a), motionEvent, a);
            return true;
        }

        /* renamed from: a */
        private void m94723a(View view, MotionEvent motionEvent, int i) {
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                    m94723a(viewGroup.getChildAt(i2), motionEvent, i);
                }
            }
            m94724b(view, motionEvent, i);
        }

        /* renamed from: b */
        private View m94724b(View view, MotionEvent motionEvent, int i) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            Rect rect = new Rect();
            view.getHitRect(rect);
            if (view.getVisibility() != 0 || !view.dispatchTouchEvent(motionEvent) || rect.left >= rect.right || rect.top >= rect.bottom || x < rect.left || x >= rect.right || y < rect.top) {
                return null;
            }
            view.setTag(Integer.valueOf(i));
            view.performClick();
            return view;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1338g
    /* renamed from: b */
    public void mo6563b(RecyclerView recyclerView, MotionEvent motionEvent) {
        this.f64667c.onTouchEvent(motionEvent);
    }

    public C26186b(RecyclerView recyclerView, C26198f fVar) {
        this.f64667c = new GestureDetector(recyclerView.getContext(), new C26188a());
        this.f64665a = recyclerView;
        this.f64666b = fVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1338g
    /* renamed from: a */
    public boolean mo6562a(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (this.f64667c.onTouchEvent(motionEvent)) {
            return true;
        }
        if (motionEvent.getAction() != 0 || this.f64666b.mo93180a((int) motionEvent.getX(), (int) motionEvent.getY()) == -1) {
            return false;
        }
        return true;
    }
}
