package nl.dionsegijn.konfetti;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nl.dionsegijn.konfetti.emitters.RenderSystem;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0010\t\n\u0002\b\t\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u001c\u001a\u00020\u001dJ\u0012\u0010\u001e\u001a\u00020\u00002\n\u0010\u0005\u001a\u00020\u0006\"\u00020\u001dJ\u0014\u0010\u001e\u001a\u00020\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001fJ\u001f\u0010 \u001a\u00020\u00002\u0012\u0010\u0013\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00150\u0014\"\u00020\u0015¢\u0006\u0002\u0010!J\u001f\u0010\"\u001a\u00020\u00002\u0012\u0010#\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00180\u0014\"\u00020\u0018¢\u0006\u0002\u0010$J\u000e\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u001dJ\u0006\u0010(\u001a\u00020)J\u000e\u0010*\u001a\u00020&2\u0006\u0010*\u001a\u00020+J\u000e\u0010,\u001a\u00020\u00002\u0006\u0010-\u001a\u00020.J\u0016\u0010,\u001a\u00020\u00002\u0006\u0010/\u001a\u00020.2\u0006\u00100\u001a\u00020.J\u000e\u00101\u001a\u00020\u00002\u0006\u00102\u001a\u00020)J\u0016\u00103\u001a\u00020\u00002\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u000205J3\u00103\u001a\u00020\u00002\u0006\u00107\u001a\u0002052\n\b\u0002\u00108\u001a\u0004\u0018\u0001052\u0006\u00109\u001a\u0002052\n\b\u0002\u0010:\u001a\u0004\u0018\u000105¢\u0006\u0002\u0010;J\u000e\u0010<\u001a\u00020\u00002\u0006\u0010=\u001a\u000205J\u0016\u0010<\u001a\u00020\u00002\u0006\u0010>\u001a\u0002052\u0006\u0010?\u001a\u000205J\u000e\u0010@\u001a\u00020\u00002\u0006\u0010A\u001a\u00020BJ\b\u0010C\u001a\u00020&H\u0002J\u0010\u0010D\u001a\u00020&2\u0006\u0010*\u001a\u00020+H\u0002J\u0018\u0010E\u001a\u00020&2\u0006\u0010F\u001a\u00020\u001d2\u0006\u0010G\u001a\u00020\u001dH\u0007J\u0018\u0010E\u001a\u00020&2\u0006\u0010F\u001a\u00020\u001d2\u0006\u0010H\u001a\u00020BH\u0007J\u0016\u0010I\u001a\u00020&2\u0006\u0010F\u001a\u00020\u001d2\u0006\u0010H\u001a\u00020BJ\u0016\u0010J\u001a\u00020&2\u0006\u0010F\u001a\u00020\u001d2\u0006\u0010G\u001a\u00020\u001dR\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u00020\u000eX.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014X\u000e¢\u0006\u0004\n\u0002\u0010\u0016R\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u0014X\u000e¢\u0006\u0004\n\u0002\u0010\u0019R\u000e\u0010\u001a\u001a\u00020\u001bX\u000e¢\u0006\u0002\n\u0000¨\u0006K"}, d2 = {"Lnl/dionsegijn/konfetti/ParticleSystem;", "", "konfettiView", "Lnl/dionsegijn/konfetti/KonfettiView;", "(Lnl/dionsegijn/konfetti/KonfettiView;)V", "colors", "", "confettiConfig", "Lnl/dionsegijn/konfetti/models/ConfettiConfig;", "location", "Lnl/dionsegijn/konfetti/models/LocationModule;", "random", "Ljava/util/Random;", "renderSystem", "Lnl/dionsegijn/konfetti/emitters/RenderSystem;", "getRenderSystem$konfetti_release", "()Lnl/dionsegijn/konfetti/emitters/RenderSystem;", "setRenderSystem$konfetti_release", "(Lnl/dionsegijn/konfetti/emitters/RenderSystem;)V", "shapes", "", "Lnl/dionsegijn/konfetti/models/Shape;", "[Lnl/dionsegijn/konfetti/models/Shape;", "sizes", "Lnl/dionsegijn/konfetti/models/Size;", "[Lnl/dionsegijn/konfetti/models/Size;", "velocity", "Lnl/dionsegijn/konfetti/modules/VelocityModule;", "activeParticles", "", "addColors", "", "addShapes", "([Lnl/dionsegijn/konfetti/models/Shape;)Lnl/dionsegijn/konfetti/ParticleSystem;", "addSizes", "possibleSizes", "([Lnl/dionsegijn/konfetti/models/Size;)Lnl/dionsegijn/konfetti/ParticleSystem;", "burst", "", "amount", "doneEmitting", "", "emitter", "Lnl/dionsegijn/konfetti/emitters/Emitter;", "setDirection", "degrees", "", "minDegrees", "maxDegrees", "setFadeOutEnabled", "fade", "setPosition", "x", "", "y", "minX", "maxX", "minY", "maxY", "(FLjava/lang/Float;FLjava/lang/Float;)Lnl/dionsegijn/konfetti/ParticleSystem;", "setSpeed", "speed", "minSpeed", "maxSpeed", "setTimeToLive", "timeInMs", "", "start", "startRenderSystem", "stream", "particlesPerSecond", "maxParticles", "emittingTime", "streamFor", "streamMaxParticles", "konfetti_release"}, mo238835k = 1, mv = {1, 1, 10})
/* renamed from: nl.dionsegijn.konfetti.c */
public final class ParticleSystem {

    /* renamed from: a */
    public RenderSystem f174105a;

    /* renamed from: a */
    public final RenderSystem mo243593a() {
        RenderSystem bVar = this.f174105a;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("renderSystem");
        }
        return bVar;
    }

    /* renamed from: b */
    public final boolean mo243594b() {
        RenderSystem bVar = this.f174105a;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("renderSystem");
        }
        return bVar.mo243591a();
    }
}
