package me.p3476a.p3477a.p3478a.p3479a;

import android.view.MotionEvent;
import android.view.View;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import me.p3476a.p3477a.p3478a.p3479a.AbstractView$OnTouchListenerC69599f;
import me.p3476a.p3477a.p3478a.p3479a.p3480a.AbstractC69588a;

/* renamed from: me.a.a.a.a.a */
public class C69585a extends AbstractView$OnTouchListenerC69599f {

    /* renamed from: me.a.a.a.a.a$b */
    protected static class C69587b extends AbstractView$OnTouchListenerC69599f.AbstractC69604e {
        protected C69587b() {
        }

        @Override // me.p3476a.p3477a.p3478a.p3479a.AbstractView$OnTouchListenerC69599f.AbstractC69604e
        /* renamed from: a */
        public boolean mo243148a(View view, MotionEvent motionEvent) {
            boolean z = false;
            if (motionEvent.getHistorySize() == 0) {
                return false;
            }
            float y = motionEvent.getY(0) - motionEvent.getHistoricalY(0, 0);
            float x = motionEvent.getX(0) - motionEvent.getHistoricalX(0, 0);
            if (Math.abs(x) < Math.abs(y)) {
                return false;
            }
            this.f174000a = view.getTranslationX();
            this.f174001b = x;
            if (this.f174001b > BitmapDescriptorFactory.HUE_RED) {
                z = true;
            }
            this.f174002c = z;
            return true;
        }
    }

    /* renamed from: me.a.a.a.a.a$a */
    protected static class C69586a extends AbstractView$OnTouchListenerC69599f.AbstractC69600a {
        public C69586a() {
            this.f173990a = View.TRANSLATION_X;
        }

        /* access modifiers changed from: protected */
        @Override // me.p3476a.p3477a.p3478a.p3479a.AbstractView$OnTouchListenerC69599f.AbstractC69600a
        /* renamed from: a */
        public void mo243147a(View view) {
            this.f173991b = view.getTranslationX();
            this.f173992c = (float) view.getWidth();
        }
    }

    /* access modifiers changed from: protected */
    @Override // me.p3476a.p3477a.p3478a.p3479a.AbstractView$OnTouchListenerC69599f
    /* renamed from: a */
    public AbstractView$OnTouchListenerC69599f.AbstractC69604e mo243143a() {
        return new C69587b();
    }

    /* access modifiers changed from: protected */
    @Override // me.p3476a.p3477a.p3478a.p3479a.AbstractView$OnTouchListenerC69599f
    /* renamed from: b */
    public AbstractView$OnTouchListenerC69599f.AbstractC69600a mo243146b() {
        return new C69586a();
    }

    public C69585a(AbstractC69588a aVar) {
        this(aVar, 3.0f, 1.0f, -2.0f);
    }

    /* access modifiers changed from: protected */
    @Override // me.p3476a.p3477a.p3478a.p3479a.AbstractView$OnTouchListenerC69599f
    /* renamed from: a */
    public void mo243144a(View view, float f) {
        view.setTranslationX(f);
    }

    /* access modifiers changed from: protected */
    @Override // me.p3476a.p3477a.p3478a.p3479a.AbstractView$OnTouchListenerC69599f
    /* renamed from: a */
    public void mo243145a(View view, float f, MotionEvent motionEvent) {
        view.setTranslationX(f);
        motionEvent.offsetLocation(f - motionEvent.getX(0), BitmapDescriptorFactory.HUE_RED);
    }

    public C69585a(AbstractC69588a aVar, float f, float f2, float f3) {
        super(aVar, f3, f, f2);
    }
}
