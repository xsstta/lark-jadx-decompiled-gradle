package nl.dionsegijn.konfetti;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import com.google.firebase.messaging.Constants;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nl.dionsegijn.konfetti.models.Shape;
import nl.dionsegijn.konfetti.models.Vector;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0003¢\u0006\u0002\u0010\u0010J\u000e\u0010/\u001a\u0002002\u0006\u00101\u001a\u00020\u0003J\u0010\u00102\u001a\u0002002\u0006\u00103\u001a\u000204H\u0002J\b\u0010)\u001a\u00020\u001fH\u0002J\u0006\u00105\u001a\u00020\rJ\u0016\u00106\u001a\u0002002\u0006\u00103\u001a\u0002042\u0006\u00107\u001a\u00020\u001fJ\u0010\u00108\u001a\u0002002\u0006\u00107\u001a\u00020\u001fH\u0002J\u0010\u00109\u001a\u0002002\u0006\u00107\u001a\u00020\u001fH\u0002R\u000e\u0010\u000e\u001a\u00020\u0003X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\n\u001a\u00020\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u000e\u0010\u001e\u001a\u00020\u001fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020!X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020#X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u001fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u001fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\u001fX\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u000e\u0010+\u001a\u00020\u001fX\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u001b\"\u0004\b-\u0010\u001dR\u000e\u0010.\u001a\u00020\u001fX\u000e¢\u0006\u0002\n\u0000¨\u0006:"}, d2 = {"Lnl/dionsegijn/konfetti/Confetti;", "", "location", "Lnl/dionsegijn/konfetti/models/Vector;", "color", "", "size", "Lnl/dionsegijn/konfetti/models/Size;", "shape", "Lnl/dionsegijn/konfetti/models/Shape;", "lifespan", "", "fadeOut", "", "acceleration", "velocity", "(Lnl/dionsegijn/konfetti/models/Vector;ILnl/dionsegijn/konfetti/models/Size;Lnl/dionsegijn/konfetti/models/Shape;JZLnl/dionsegijn/konfetti/models/Vector;Lnl/dionsegijn/konfetti/models/Vector;)V", "alpha", "getColor", "()I", "getFadeOut", "()Z", "getLifespan", "()J", "setLifespan", "(J)V", "getLocation", "()Lnl/dionsegijn/konfetti/models/Vector;", "setLocation", "(Lnl/dionsegijn/konfetti/models/Vector;)V", "mass", "", "paint", "Landroid/graphics/Paint;", "rectF", "Landroid/graphics/RectF;", "rotation", "rotationSpeed", "rotationWidth", "getShape", "()Lnl/dionsegijn/konfetti/models/Shape;", "getSize", "()Lnl/dionsegijn/konfetti/models/Size;", "speedF", "getVelocity", "setVelocity", "width", "applyForce", "", "force", Constants.ScionAnalytics.MessageType.DISPLAY_NOTIFICATION, "canvas", "Landroid/graphics/Canvas;", "isDead", "render", "deltaTime", "update", "updateAlpha", "konfetti_release"}, mo238835k = 1, mv = {1, 1, 10})
/* renamed from: nl.dionsegijn.konfetti.a */
public final class Confetti {

    /* renamed from: a */
    private final float f174086a;

    /* renamed from: b */
    private float f174087b;

    /* renamed from: c */
    private final Paint f174088c;

    /* renamed from: d */
    private float f174089d;

    /* renamed from: e */
    private float f174090e;

    /* renamed from: f */
    private float f174091f;

    /* renamed from: g */
    private RectF f174092g;

    /* renamed from: h */
    private float f174093h;

    /* renamed from: i */
    private int f174094i;

    /* renamed from: j */
    private Vector f174095j;

    /* renamed from: k */
    private final Shape f174096k;

    /* renamed from: l */
    private long f174097l;

    /* renamed from: m */
    private final boolean f174098m;

    /* renamed from: n */
    private Vector f174099n;

    /* renamed from: o */
    private Vector f174100o;

    /* renamed from: b */
    private final float m267488b() {
        return this.f174087b;
    }

    /* renamed from: a */
    public final boolean mo243587a() {
        if (((float) this.f174094i) <= BitmapDescriptorFactory.HUE_RED) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo243586a(Vector aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "force");
        Vector a = Vector.m267500a(aVar, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 3, null);
        a.mo243600b(this.f174086a);
        this.f174099n.mo243598a(a);
    }

    /* renamed from: b */
    private final void m267489b(float f) {
        if (this.f174098m) {
            float f2 = ((float) 5) * f;
            float f3 = this.f174093h;
            int i = this.f174094i;
            if (((float) i) - (f2 * f3) < ((float) 0)) {
                this.f174094i = 0;
            } else {
                this.f174094i = i - ((int) (f2 * f3));
            }
        } else {
            this.f174094i = 0;
        }
    }

    /* renamed from: a */
    private final void m267486a(float f) {
        this.f174100o.mo243598a(this.f174099n);
        Vector a = Vector.m267500a(this.f174100o, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 3, null);
        a.mo243597a(this.f174093h * f);
        this.f174095j.mo243598a(a);
        long j = this.f174097l;
        if (j <= 0) {
            m267489b(f);
        } else {
            this.f174097l = j - ((long) (((float) 1000) * f));
        }
        float f2 = this.f174089d * f * this.f174093h;
        float f3 = this.f174090e + f2;
        this.f174090e = f3;
        if (f3 >= ((float) 360)) {
            this.f174090e = BitmapDescriptorFactory.HUE_RED;
        }
        float f4 = this.f174091f - f2;
        this.f174091f = f4;
        if (f4 < ((float) 0)) {
            this.f174091f = this.f174087b;
        }
    }

    /* renamed from: a */
    private final void m267487a(Canvas canvas) {
        if (this.f174095j.mo243599b() > ((float) canvas.getHeight())) {
            this.f174097l = 0;
        } else if (this.f174095j.mo243595a() <= ((float) canvas.getWidth())) {
            float f = (float) 0;
            if (this.f174095j.mo243595a() + m267488b() >= f && this.f174095j.mo243599b() + m267488b() >= f) {
                float a = this.f174095j.mo243595a() + (this.f174087b - this.f174091f);
                float a2 = this.f174095j.mo243595a() + this.f174091f;
                if (a > a2) {
                    float f2 = a + a2;
                    a2 = f2 - a2;
                    a = f2 - a2;
                }
                this.f174088c.setAlpha(this.f174094i);
                this.f174092g.set(a, this.f174095j.mo243599b(), a2, this.f174095j.mo243599b() + m267488b());
                canvas.save();
                canvas.rotate(this.f174090e, this.f174092g.centerX(), this.f174092g.centerY());
                int i = C69643b.f174104a[this.f174096k.ordinal()];
                if (i == 1) {
                    canvas.drawOval(this.f174092g, this.f174088c);
                } else if (i == 2) {
                    canvas.drawRect(this.f174092g, this.f174088c);
                }
                canvas.restore();
            }
        }
    }

    /* renamed from: a */
    public final void mo243585a(Canvas canvas, float f) {
        Intrinsics.checkParameterIsNotNull(canvas, "canvas");
        m267486a(f);
        m267487a(canvas);
    }
}
