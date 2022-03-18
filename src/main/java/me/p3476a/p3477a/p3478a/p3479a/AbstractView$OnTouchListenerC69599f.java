package me.p3476a.p3477a.p3478a.p3479a;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.util.Log;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import com.huawei.hms.location.LocationRequest;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import me.p3476a.p3477a.p3478a.p3479a.AbstractC69596e;
import me.p3476a.p3477a.p3478a.p3479a.p3480a.AbstractC69588a;

/* renamed from: me.a.a.a.a.f */
public abstract class AbstractView$OnTouchListenerC69599f implements View.OnTouchListener, AbstractC69593b {

    /* renamed from: a */
    protected final C69605f f173981a = new C69605f();

    /* renamed from: b */
    protected final AbstractC69588a f173982b;

    /* renamed from: c */
    protected final C69603d f173983c;

    /* renamed from: d */
    protected final C69606g f173984d;

    /* renamed from: e */
    protected final C69601b f173985e;

    /* renamed from: f */
    protected AbstractC69602c f173986f;

    /* renamed from: g */
    protected AbstractC69594c f173987g = new AbstractC69596e.C69597a();

    /* renamed from: h */
    protected AbstractC69595d f173988h = new AbstractC69596e.C69598b();

    /* renamed from: i */
    protected float f173989i;

    /* access modifiers changed from: protected */
    /* renamed from: me.a.a.a.a.f$c */
    public interface AbstractC69602c {
        /* renamed from: a */
        int mo243161a();

        /* renamed from: a */
        void mo243164a(AbstractC69602c cVar);

        /* renamed from: a */
        boolean mo243165a(MotionEvent motionEvent);

        /* renamed from: b */
        boolean mo243167b(MotionEvent motionEvent);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract AbstractC69604e mo243143a();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo243144a(View view, float f);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo243145a(View view, float f, MotionEvent motionEvent);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract AbstractC69600a mo243146b();

    /* access modifiers changed from: protected */
    /* renamed from: me.a.a.a.a.f$a */
    public static abstract class AbstractC69600a {

        /* renamed from: a */
        public Property<View, Float> f173990a;

        /* renamed from: b */
        public float f173991b;

        /* renamed from: c */
        public float f173992c;

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public abstract void mo243147a(View view);

        protected AbstractC69600a() {
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: me.a.a.a.a.f$e */
    public static abstract class AbstractC69604e {

        /* renamed from: a */
        public float f174000a;

        /* renamed from: b */
        public float f174001b;

        /* renamed from: c */
        public boolean f174002c;

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public abstract boolean mo243148a(View view, MotionEvent motionEvent);

        protected AbstractC69604e() {
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: me.a.a.a.a.f$f */
    public static class C69605f {

        /* renamed from: a */
        protected int f174003a;

        /* renamed from: b */
        protected float f174004b;

        /* renamed from: c */
        protected boolean f174005c;

        protected C69605f() {
        }
    }

    /* renamed from: me.a.a.a.a.f$g */
    protected class C69606g implements AbstractC69602c {

        /* renamed from: a */
        protected final float f174006a;

        /* renamed from: b */
        protected final float f174007b;

        /* renamed from: c */
        final AbstractC69604e f174008c;

        /* renamed from: d */
        int f174009d;

        @Override // me.p3476a.p3477a.p3478a.p3479a.AbstractView$OnTouchListenerC69599f.AbstractC69602c
        /* renamed from: a */
        public int mo243161a() {
            return this.f174009d;
        }

        @Override // me.p3476a.p3477a.p3478a.p3479a.AbstractView$OnTouchListenerC69599f.AbstractC69602c
        /* renamed from: b */
        public boolean mo243167b(MotionEvent motionEvent) {
            AbstractView$OnTouchListenerC69599f fVar = AbstractView$OnTouchListenerC69599f.this;
            fVar.mo243157a(fVar.f173985e);
            return false;
        }

        @Override // me.p3476a.p3477a.p3478a.p3479a.AbstractView$OnTouchListenerC69599f.AbstractC69602c
        /* renamed from: a */
        public void mo243164a(AbstractC69602c cVar) {
            int i;
            if (AbstractView$OnTouchListenerC69599f.this.f173981a.f174005c) {
                i = 1;
            } else {
                i = 2;
            }
            this.f174009d = i;
            AbstractView$OnTouchListenerC69599f.this.f173987g.mo243155a(AbstractView$OnTouchListenerC69599f.this, cVar.mo243161a(), mo243161a());
        }

        @Override // me.p3476a.p3477a.p3478a.p3479a.AbstractView$OnTouchListenerC69599f.AbstractC69602c
        /* renamed from: a */
        public boolean mo243165a(MotionEvent motionEvent) {
            float f;
            if (AbstractView$OnTouchListenerC69599f.this.f173981a.f174003a != motionEvent.getPointerId(0)) {
                AbstractView$OnTouchListenerC69599f fVar = AbstractView$OnTouchListenerC69599f.this;
                fVar.mo243157a(fVar.f173985e);
                return true;
            }
            View a = AbstractView$OnTouchListenerC69599f.this.f173982b.mo243149a();
            if (!this.f174008c.mo243148a(a, motionEvent)) {
                return true;
            }
            float f2 = this.f174008c.f174001b;
            if (this.f174008c.f174002c == AbstractView$OnTouchListenerC69599f.this.f173981a.f174005c) {
                f = this.f174006a;
            } else {
                f = this.f174007b;
            }
            float f3 = f2 / f;
            float f4 = this.f174008c.f174000a + f3;
            if ((!AbstractView$OnTouchListenerC69599f.this.f173981a.f174005c || this.f174008c.f174002c || f4 > AbstractView$OnTouchListenerC69599f.this.f173981a.f174004b) && (AbstractView$OnTouchListenerC69599f.this.f173981a.f174005c || !this.f174008c.f174002c || f4 < AbstractView$OnTouchListenerC69599f.this.f173981a.f174004b)) {
                if (a.getParent() != null) {
                    a.getParent().requestDisallowInterceptTouchEvent(true);
                }
                long eventTime = motionEvent.getEventTime() - motionEvent.getHistoricalEventTime(0);
                if (eventTime > 0) {
                    AbstractView$OnTouchListenerC69599f.this.f173989i = f3 / ((float) eventTime);
                }
                AbstractView$OnTouchListenerC69599f.this.mo243144a(a, f4);
                AbstractView$OnTouchListenerC69599f.this.f173988h.mo243156a(AbstractView$OnTouchListenerC69599f.this, this.f174009d, f4);
                return true;
            }
            AbstractView$OnTouchListenerC69599f fVar2 = AbstractView$OnTouchListenerC69599f.this;
            fVar2.mo243145a(a, fVar2.f173981a.f174004b, motionEvent);
            AbstractView$OnTouchListenerC69599f.this.f173988h.mo243156a(AbstractView$OnTouchListenerC69599f.this, this.f174009d, BitmapDescriptorFactory.HUE_RED);
            AbstractView$OnTouchListenerC69599f fVar3 = AbstractView$OnTouchListenerC69599f.this;
            fVar3.mo243157a(fVar3.f173983c);
            return true;
        }

        public C69606g(float f, float f2) {
            this.f174008c = AbstractView$OnTouchListenerC69599f.this.mo243143a();
            this.f174006a = f;
            this.f174007b = f2;
        }
    }

    /* renamed from: d */
    public View mo243158d() {
        return this.f173982b.mo243149a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo243159e() {
        mo243158d().setOnTouchListener(this);
        mo243158d().setOverScrollMode(2);
    }

    @Override // me.p3476a.p3477a.p3478a.p3479a.AbstractC69593b
    /* renamed from: c */
    public void mo243154c() {
        if (this.f173986f != this.f173983c) {
            Log.w("OverScrollDecor", "Decorator detached while over-scroll is in effect. You might want to add a precondition of that getCurrentState()==STATE_IDLE, first.");
        }
        mo243158d().setOnTouchListener(null);
        mo243158d().setOverScrollMode(0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: me.a.a.a.a.f$b */
    public class C69601b implements Animator.AnimatorListener, ValueAnimator.AnimatorUpdateListener, AbstractC69602c {

        /* renamed from: a */
        protected final Interpolator f173993a = new DecelerateInterpolator();

        /* renamed from: b */
        protected final float f173994b;

        /* renamed from: c */
        protected final float f173995c;

        /* renamed from: d */
        protected final AbstractC69600a f173996d;

        @Override // me.p3476a.p3477a.p3478a.p3479a.AbstractView$OnTouchListenerC69599f.AbstractC69602c
        /* renamed from: a */
        public int mo243161a() {
            return 3;
        }

        @Override // me.p3476a.p3477a.p3478a.p3479a.AbstractView$OnTouchListenerC69599f.AbstractC69602c
        /* renamed from: a */
        public boolean mo243165a(MotionEvent motionEvent) {
            return true;
        }

        @Override // me.p3476a.p3477a.p3478a.p3479a.AbstractView$OnTouchListenerC69599f.AbstractC69602c
        /* renamed from: b */
        public boolean mo243167b(MotionEvent motionEvent) {
            return true;
        }

        public void onAnimationCancel(Animator animator) {
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public Animator mo243166b() {
            View a = AbstractView$OnTouchListenerC69599f.this.f173982b.mo243149a();
            this.f173996d.mo243147a(a);
            float f = AbstractView$OnTouchListenerC69599f.this.f173989i;
            float f2 = BitmapDescriptorFactory.HUE_RED;
            if (f == BitmapDescriptorFactory.HUE_RED || ((AbstractView$OnTouchListenerC69599f.this.f173989i < BitmapDescriptorFactory.HUE_RED && AbstractView$OnTouchListenerC69599f.this.f173981a.f174005c) || (AbstractView$OnTouchListenerC69599f.this.f173989i > BitmapDescriptorFactory.HUE_RED && !AbstractView$OnTouchListenerC69599f.this.f173981a.f174005c))) {
                return mo243162a(this.f173996d.f173991b);
            }
            float f3 = (-AbstractView$OnTouchListenerC69599f.this.f173989i) / this.f173994b;
            if (f3 >= BitmapDescriptorFactory.HUE_RED) {
                f2 = f3;
            }
            float f4 = this.f173996d.f173991b + (((-AbstractView$OnTouchListenerC69599f.this.f173989i) * AbstractView$OnTouchListenerC69599f.this.f173989i) / this.f173995c);
            ObjectAnimator a2 = mo243163a(a, (int) f2, f4);
            ObjectAnimator a3 = mo243162a(f4);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playSequentially(a2, a3);
            return animatorSet;
        }

        public void onAnimationEnd(Animator animator) {
            AbstractView$OnTouchListenerC69599f fVar = AbstractView$OnTouchListenerC69599f.this;
            fVar.mo243157a(fVar.f173983c);
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            AbstractView$OnTouchListenerC69599f.this.f173988h.mo243156a(AbstractView$OnTouchListenerC69599f.this, 3, ((Float) valueAnimator.getAnimatedValue()).floatValue());
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public ObjectAnimator mo243162a(float f) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(AbstractView$OnTouchListenerC69599f.this.f173982b.mo243149a(), this.f173996d.f173990a, AbstractView$OnTouchListenerC69599f.this.f173981a.f174004b);
            ofFloat.setDuration((long) Math.max((int) ((Math.abs(f) / this.f173996d.f173992c) * 800.0f), (int) LocationRequest.PRIORITY_HD_ACCURACY));
            ofFloat.setInterpolator(this.f173993a);
            ofFloat.addUpdateListener(this);
            return ofFloat;
        }

        @Override // me.p3476a.p3477a.p3478a.p3479a.AbstractView$OnTouchListenerC69599f.AbstractC69602c
        /* renamed from: a */
        public void mo243164a(AbstractC69602c cVar) {
            AbstractView$OnTouchListenerC69599f.this.f173987g.mo243155a(AbstractView$OnTouchListenerC69599f.this, cVar.mo243161a(), mo243161a());
            Animator b = mo243166b();
            b.addListener(this);
            b.start();
        }

        public C69601b(float f) {
            this.f173994b = f;
            this.f173995c = f * 2.0f;
            this.f173996d = AbstractView$OnTouchListenerC69599f.this.mo243146b();
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public ObjectAnimator mo243163a(View view, int i, float f) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, this.f173996d.f173990a, f);
            ofFloat.setDuration((long) i);
            ofFloat.setInterpolator(this.f173993a);
            ofFloat.addUpdateListener(this);
            return ofFloat;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: me.a.a.a.a.f$d */
    public class C69603d implements AbstractC69602c {

        /* renamed from: a */
        final AbstractC69604e f173998a;

        @Override // me.p3476a.p3477a.p3478a.p3479a.AbstractView$OnTouchListenerC69599f.AbstractC69602c
        /* renamed from: a */
        public int mo243161a() {
            return 0;
        }

        @Override // me.p3476a.p3477a.p3478a.p3479a.AbstractView$OnTouchListenerC69599f.AbstractC69602c
        /* renamed from: b */
        public boolean mo243167b(MotionEvent motionEvent) {
            return false;
        }

        public C69603d() {
            this.f173998a = AbstractView$OnTouchListenerC69599f.this.mo243143a();
        }

        @Override // me.p3476a.p3477a.p3478a.p3479a.AbstractView$OnTouchListenerC69599f.AbstractC69602c
        /* renamed from: a */
        public void mo243164a(AbstractC69602c cVar) {
            AbstractView$OnTouchListenerC69599f.this.f173987g.mo243155a(AbstractView$OnTouchListenerC69599f.this, cVar.mo243161a(), mo243161a());
        }

        @Override // me.p3476a.p3477a.p3478a.p3479a.AbstractView$OnTouchListenerC69599f.AbstractC69602c
        /* renamed from: a */
        public boolean mo243165a(MotionEvent motionEvent) {
            if (!this.f173998a.mo243148a(AbstractView$OnTouchListenerC69599f.this.f173982b.mo243149a(), motionEvent)) {
                return false;
            }
            if ((!AbstractView$OnTouchListenerC69599f.this.f173982b.mo243150b() || !this.f173998a.f174002c) && (!AbstractView$OnTouchListenerC69599f.this.f173982b.mo243151c() || this.f173998a.f174002c)) {
                return false;
            }
            AbstractView$OnTouchListenerC69599f.this.f173981a.f174003a = motionEvent.getPointerId(0);
            AbstractView$OnTouchListenerC69599f.this.f173981a.f174004b = this.f173998a.f174000a;
            AbstractView$OnTouchListenerC69599f.this.f173981a.f174005c = this.f173998a.f174002c;
            AbstractView$OnTouchListenerC69599f fVar = AbstractView$OnTouchListenerC69599f.this;
            fVar.mo243157a(fVar.f173984d);
            return AbstractView$OnTouchListenerC69599f.this.f173984d.mo243165a(motionEvent);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo243157a(AbstractC69602c cVar) {
        AbstractC69602c cVar2 = this.f173986f;
        this.f173986f = cVar;
        cVar.mo243164a(cVar2);
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 1) {
            if (action == 2) {
                return this.f173986f.mo243165a(motionEvent);
            }
            if (action != 3) {
                return false;
            }
        }
        return this.f173986f.mo243167b(motionEvent);
    }

    public AbstractView$OnTouchListenerC69599f(AbstractC69588a aVar, float f, float f2, float f3) {
        this.f173982b = aVar;
        this.f173985e = new C69601b(f);
        this.f173984d = new C69606g(f2, f3);
        C69603d dVar = new C69603d();
        this.f173983c = dVar;
        this.f173986f = dVar;
        mo243159e();
    }
}
