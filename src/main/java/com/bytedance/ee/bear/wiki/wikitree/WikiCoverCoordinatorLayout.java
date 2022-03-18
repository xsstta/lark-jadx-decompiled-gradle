package com.bytedance.ee.bear.wiki.wikitree;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

public class WikiCoverCoordinatorLayout extends CoordinatorLayout {

    /* renamed from: f */
    private AbstractC12052b f32531f;

    /* renamed from: g */
    private AbstractC12051a f32532g;

    /* renamed from: h */
    private float f32533h;

    /* renamed from: i */
    private float f32534i;

    /* renamed from: com.bytedance.ee.bear.wiki.wikitree.WikiCoverCoordinatorLayout$a */
    public interface AbstractC12051a {
        boolean onInterceptTouchEvent(MotionEvent motionEvent);
    }

    /* renamed from: com.bytedance.ee.bear.wiki.wikitree.WikiCoverCoordinatorLayout$b */
    public interface AbstractC12052b {
        /* renamed from: a */
        void mo46157a();

        /* renamed from: a */
        void mo46158a(float f, float f2);
    }

    public WikiCoverCoordinatorLayout(Context context) {
        super(context);
    }

    public void setInterceptTouchEventListener(AbstractC12051a aVar) {
        this.f32532g = aVar;
    }

    public void setOnScrollListener(AbstractC12052b bVar) {
        this.f32531f = bVar;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        boolean z = false;
        if (action == 0) {
            this.f32533h = motionEvent.getX();
            this.f32534i = motionEvent.getY();
            AbstractC12051a aVar = this.f32532g;
            if (aVar != null) {
                z = aVar.onInterceptTouchEvent(motionEvent);
            }
        } else if (action == 2) {
            AbstractC12051a aVar2 = this.f32532g;
            if (aVar2 != null) {
                z = aVar2.onInterceptTouchEvent(motionEvent);
            }
            this.f32533h = motionEvent.getX();
            this.f32534i = motionEvent.getY();
        }
        if (z) {
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000e, code lost:
        if (r0 != 4) goto L_0x003a;
     */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            int r0 = r6.getAction()
            r1 = 1
            if (r0 == r1) goto L_0x0033
            r2 = 2
            if (r0 == r2) goto L_0x0011
            r6 = 3
            if (r0 == r6) goto L_0x0033
            r6 = 4
            if (r0 == r6) goto L_0x0033
            goto L_0x003a
        L_0x0011:
            com.bytedance.ee.bear.wiki.wikitree.WikiCoverCoordinatorLayout$b r0 = r5.f32531f
            if (r0 == 0) goto L_0x0026
            float r2 = r6.getX()
            float r3 = r5.f32533h
            float r2 = r2 - r3
            float r3 = r6.getY()
            float r4 = r5.f32534i
            float r3 = r3 - r4
            r0.mo46158a(r2, r3)
        L_0x0026:
            float r0 = r6.getX()
            r5.f32533h = r0
            float r6 = r6.getY()
            r5.f32534i = r6
            goto L_0x003a
        L_0x0033:
            com.bytedance.ee.bear.wiki.wikitree.WikiCoverCoordinatorLayout$b r6 = r5.f32531f
            if (r6 == 0) goto L_0x003a
            r6.mo46157a()
        L_0x003a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.bear.wiki.wikitree.WikiCoverCoordinatorLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public WikiCoverCoordinatorLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public WikiCoverCoordinatorLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
