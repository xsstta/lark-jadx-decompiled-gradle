package com.google.android.material.circularreveal;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import com.google.android.material.circularreveal.AbstractC22213b;
import com.google.android.material.p987h.C22309a;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class CircularRevealHelper {

    /* renamed from: a */
    public static final int f54276a;

    /* renamed from: b */
    private final AbstractC22210a f54277b;

    /* renamed from: c */
    private final View f54278c;

    /* renamed from: d */
    private final Path f54279d = new Path();

    /* renamed from: e */
    private final Paint f54280e = new Paint(7);

    /* renamed from: f */
    private final Paint f54281f;

    /* renamed from: g */
    private AbstractC22213b.C22218d f54282g;

    /* renamed from: h */
    private Drawable f54283h;

    /* renamed from: i */
    private boolean f54284i;

    /* renamed from: j */
    private boolean f54285j;

    @Retention(RetentionPolicy.SOURCE)
    public @interface Strategy {
    }

    /* renamed from: com.google.android.material.circularreveal.CircularRevealHelper$a */
    public interface AbstractC22210a {
        /* renamed from: a */
        void mo77236a(Canvas canvas);

        /* renamed from: c */
        boolean mo77237c();
    }

    /* renamed from: e */
    public Drawable mo77257e() {
        return this.f54283h;
    }

    /* renamed from: d */
    public int mo77256d() {
        return this.f54281f.getColor();
    }

    /* renamed from: j */
    private boolean m80340j() {
        if (this.f54284i || this.f54283h == null || this.f54282g == null) {
            return false;
        }
        return true;
    }

    static {
        if (Build.VERSION.SDK_INT >= 21) {
            f54276a = 2;
        } else if (Build.VERSION.SDK_INT >= 18) {
            f54276a = 1;
        } else {
            f54276a = 0;
        }
    }

    /* renamed from: h */
    private boolean m80338h() {
        boolean z;
        AbstractC22213b.C22218d dVar = this.f54282g;
        if (dVar == null || dVar.mo77279a()) {
            z = true;
        } else {
            z = false;
        }
        if (f54276a != 0) {
            return !z;
        }
        if (z || !this.f54285j) {
            return false;
        }
        return true;
    }

    /* renamed from: i */
    private boolean m80339i() {
        if (this.f54284i || Color.alpha(this.f54281f.getColor()) == 0) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public AbstractC22213b.C22218d mo77255c() {
        AbstractC22213b.C22218d dVar = this.f54282g;
        if (dVar == null) {
            return null;
        }
        AbstractC22213b.C22218d dVar2 = new AbstractC22213b.C22218d(dVar);
        if (dVar2.mo77279a()) {
            dVar2.f54295c = m80335b(dVar2);
        }
        return dVar2;
    }

    /* renamed from: f */
    public boolean mo77258f() {
        if (!this.f54277b.mo77237c() || m80338h()) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    private void m80337g() {
        if (f54276a == 1) {
            this.f54279d.rewind();
            AbstractC22213b.C22218d dVar = this.f54282g;
            if (dVar != null) {
                this.f54279d.addCircle(dVar.f54293a, this.f54282g.f54294b, this.f54282g.f54295c, Path.Direction.CW);
            }
        }
        this.f54278c.invalidate();
    }

    /* renamed from: a */
    public void mo77249a() {
        if (f54276a == 0) {
            this.f54284i = true;
            this.f54285j = false;
            this.f54278c.buildDrawingCache();
            Bitmap drawingCache = this.f54278c.getDrawingCache();
            if (!(drawingCache != null || this.f54278c.getWidth() == 0 || this.f54278c.getHeight() == 0)) {
                drawingCache = Bitmap.createBitmap(this.f54278c.getWidth(), this.f54278c.getHeight(), Bitmap.Config.ARGB_8888);
                this.f54278c.draw(new Canvas(drawingCache));
            }
            if (drawingCache != null) {
                this.f54280e.setShader(new BitmapShader(drawingCache, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP));
            }
            this.f54284i = false;
            this.f54285j = true;
        }
    }

    /* renamed from: b */
    public void mo77254b() {
        if (f54276a == 0) {
            this.f54285j = false;
            this.f54278c.destroyDrawingCache();
            this.f54280e.setShader(null);
            this.f54278c.invalidate();
        }
    }

    /* renamed from: a */
    public void mo77252a(Drawable drawable) {
        this.f54283h = drawable;
        this.f54278c.invalidate();
    }

    /* renamed from: a */
    public void mo77250a(int i) {
        this.f54281f.setColor(i);
        this.f54278c.invalidate();
    }

    /* renamed from: b */
    private float m80335b(AbstractC22213b.C22218d dVar) {
        return C22309a.m80781a(dVar.f54293a, dVar.f54294b, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (float) this.f54278c.getWidth(), (float) this.f54278c.getHeight());
    }

    public CircularRevealHelper(AbstractC22210a aVar) {
        this.f54277b = aVar;
        View view = (View) aVar;
        this.f54278c = view;
        view.setWillNotDraw(false);
        Paint paint = new Paint(1);
        this.f54281f = paint;
        paint.setColor(0);
    }

    /* renamed from: b */
    private void m80336b(Canvas canvas) {
        if (m80340j()) {
            Rect bounds = this.f54283h.getBounds();
            float width = this.f54282g.f54293a - (((float) bounds.width()) / 2.0f);
            float height = this.f54282g.f54294b - (((float) bounds.height()) / 2.0f);
            canvas.translate(width, height);
            this.f54283h.draw(canvas);
            canvas.translate(-width, -height);
        }
    }

    /* renamed from: a */
    public void mo77253a(AbstractC22213b.C22218d dVar) {
        if (dVar == null) {
            this.f54282g = null;
        } else {
            AbstractC22213b.C22218d dVar2 = this.f54282g;
            if (dVar2 == null) {
                this.f54282g = new AbstractC22213b.C22218d(dVar);
            } else {
                dVar2.mo77278a(dVar);
            }
            if (C22309a.m80783b(dVar.f54295c, m80335b(dVar), 1.0E-4f)) {
                this.f54282g.f54295c = Float.MAX_VALUE;
            }
        }
        m80337g();
    }

    /* renamed from: a */
    public void mo77251a(Canvas canvas) {
        if (m80338h()) {
            int i = f54276a;
            if (i == 0) {
                canvas.drawCircle(this.f54282g.f54293a, this.f54282g.f54294b, this.f54282g.f54295c, this.f54280e);
                if (m80339i()) {
                    canvas.drawCircle(this.f54282g.f54293a, this.f54282g.f54294b, this.f54282g.f54295c, this.f54281f);
                }
            } else if (i == 1) {
                int save = canvas.save();
                canvas.clipPath(this.f54279d);
                this.f54277b.mo77236a(canvas);
                if (m80339i()) {
                    canvas.drawRect(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (float) this.f54278c.getWidth(), (float) this.f54278c.getHeight(), this.f54281f);
                }
                canvas.restoreToCount(save);
            } else if (i == 2) {
                this.f54277b.mo77236a(canvas);
                if (m80339i()) {
                    canvas.drawRect(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (float) this.f54278c.getWidth(), (float) this.f54278c.getHeight(), this.f54281f);
                }
            } else {
                throw new IllegalStateException("Unsupported strategy " + i);
            }
        } else {
            this.f54277b.mo77236a(canvas);
            if (m80339i()) {
                canvas.drawRect(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (float) this.f54278c.getWidth(), (float) this.f54278c.getHeight(), this.f54281f);
            }
        }
        m80336b(canvas);
    }
}
