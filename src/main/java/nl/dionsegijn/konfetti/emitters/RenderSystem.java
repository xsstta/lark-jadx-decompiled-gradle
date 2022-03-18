package nl.dionsegijn.konfetti.emitters;

import android.graphics.Canvas;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nl.dionsegijn.konfetti.Confetti;
import nl.dionsegijn.konfetti.models.Vector;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0007\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010¢\u0006\u0002\u0010\u0011J\b\u0010\u001b\u001a\u00020\u001cH\u0002J\u0006\u0010\u001d\u001a\u00020\u001eJ\u0006\u0010\u001f\u001a\u00020 J\u0016\u0010!\u001a\u00020\u001c2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0007X\u0004¢\u0006\u0004\n\u0002\u0010\u0019R\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0004¢\u0006\u0004\n\u0002\u0010\u001aR\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006&"}, d2 = {"Lnl/dionsegijn/konfetti/emitters/RenderSystem;", "", "location", "Lnl/dionsegijn/konfetti/models/LocationModule;", "velocity", "Lnl/dionsegijn/konfetti/modules/VelocityModule;", "sizes", "", "Lnl/dionsegijn/konfetti/models/Size;", "shapes", "Lnl/dionsegijn/konfetti/models/Shape;", "colors", "", "config", "Lnl/dionsegijn/konfetti/models/ConfettiConfig;", "emitter", "Lnl/dionsegijn/konfetti/emitters/Emitter;", "(Lnl/dionsegijn/konfetti/models/LocationModule;Lnl/dionsegijn/konfetti/modules/VelocityModule;[Lnl/dionsegijn/konfetti/models/Size;[Lnl/dionsegijn/konfetti/models/Shape;[ILnl/dionsegijn/konfetti/models/ConfettiConfig;Lnl/dionsegijn/konfetti/emitters/Emitter;)V", "gravity", "Lnl/dionsegijn/konfetti/models/Vector;", "particles", "", "Lnl/dionsegijn/konfetti/Confetti;", "random", "Ljava/util/Random;", "[Lnl/dionsegijn/konfetti/models/Shape;", "[Lnl/dionsegijn/konfetti/models/Size;", "addConfetti", "", "getActiveParticles", "", "isDoneEmitting", "", "render", "canvas", "Landroid/graphics/Canvas;", "deltaTime", "", "konfetti_release"}, mo238835k = 1, mv = {1, 1, 10})
/* renamed from: nl.dionsegijn.konfetti.a.b */
public final class RenderSystem {

    /* renamed from: a */
    private Vector f174101a;

    /* renamed from: b */
    private final List<Confetti> f174102b;

    /* renamed from: c */
    private final Emitter f174103c;

    /* renamed from: a */
    public final boolean mo243591a() {
        if (!this.f174103c.mo243589a() || this.f174102b.size() != 0) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo243590a(Canvas canvas, float f) {
        Intrinsics.checkParameterIsNotNull(canvas, "canvas");
        this.f174103c.mo243588a(f);
        for (int size = this.f174102b.size() - 1; size >= 0; size--) {
            Confetti aVar = this.f174102b.get(size);
            aVar.mo243586a(this.f174101a);
            aVar.mo243585a(canvas, f);
            if (aVar.mo243587a()) {
                this.f174102b.remove(size);
            }
        }
    }
}
