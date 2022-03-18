package nl.dionsegijn.konfetti;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nl.dionsegijn.konfetti.listeners.OnParticleSystemUpdateListener;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u001bB\u0011\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004B\u001b\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B#\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0006\u0010\u0012\u001a\u00020\u000fJ\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eJ\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0014J\u0006\u0010\u0018\u001a\u00020\u0015J\u000e\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u000fR\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u000e¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lnl/dionsegijn/konfetti/KonfettiView;", "Landroid/view/View;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "onParticleSystemUpdateListener", "Lnl/dionsegijn/konfetti/listeners/OnParticleSystemUpdateListener;", "systems", "", "Lnl/dionsegijn/konfetti/ParticleSystem;", "timer", "Lnl/dionsegijn/konfetti/KonfettiView$TimerIntegration;", "build", "getActiveSystems", "onDraw", "", "canvas", "Landroid/graphics/Canvas;", "reset", "start", "particleSystem", "TimerIntegration", "konfetti_release"}, mo238835k = 1, mv = {1, 1, 10})
public final class KonfettiView extends View {

    /* renamed from: a */
    private final List<ParticleSystem> f174082a = new ArrayList();

    /* renamed from: b */
    private TimerIntegration f174083b = new TimerIntegration();

    /* renamed from: c */
    private OnParticleSystemUpdateListener f174084c;

    public final List<ParticleSystem> getActiveSystems() {
        return this.f174082a;
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0006J\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lnl/dionsegijn/konfetti/KonfettiView$TimerIntegration;", "", "()V", "previousTime", "", "getDeltaTime", "", "reset", "", "konfetti_release"}, mo238835k = 1, mv = {1, 1, 10})
    /* renamed from: nl.dionsegijn.konfetti.KonfettiView$a */
    public static final class TimerIntegration {

        /* renamed from: a */
        private long f174085a = -1;

        /* renamed from: a */
        public final void mo243583a() {
            this.f174085a = -1;
        }

        /* renamed from: b */
        public final float mo243584b() {
            if (this.f174085a == -1) {
                this.f174085a = System.nanoTime();
            }
            long nanoTime = System.nanoTime();
            this.f174085a = nanoTime;
            return ((float) ((nanoTime - this.f174085a) / ((long) 1000000))) / ((float) 1000);
        }
    }

    public KonfettiView(Context context) {
        super(context);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        Intrinsics.checkParameterIsNotNull(canvas, "canvas");
        super.onDraw(canvas);
        float b = this.f174083b.mo243584b();
        for (int size = this.f174082a.size() - 1; size >= 0; size--) {
            ParticleSystem cVar = this.f174082a.get(size);
            cVar.mo243593a().mo243590a(canvas, b);
            if (cVar.mo243594b()) {
                this.f174082a.remove(size);
                OnParticleSystemUpdateListener aVar = this.f174084c;
                if (aVar != null) {
                    aVar.mo243592a(this, cVar, this.f174082a.size());
                }
            }
        }
        if (this.f174082a.size() != 0) {
            invalidate();
        } else {
            this.f174083b.mo243583a();
        }
    }

    public KonfettiView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public KonfettiView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
