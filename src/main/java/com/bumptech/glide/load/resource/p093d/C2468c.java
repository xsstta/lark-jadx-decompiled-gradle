package com.bumptech.glide.load.resource.p093d;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import androidx.p042i.p043a.p044a.AbstractC1094b;
import com.bumptech.glide.ComponentCallbacks2C2115c;
import com.bumptech.glide.gifdecoder.GifDecoder;
import com.bumptech.glide.load.AbstractC2393i;
import com.bumptech.glide.load.resource.p093d.C2473g;
import com.bumptech.glide.util.C2567j;
import java.nio.ByteBuffer;
import java.util.List;

/* renamed from: com.bumptech.glide.load.resource.d.c */
public class C2468c extends Drawable implements Animatable, AbstractC1094b, C2473g.AbstractC2475b {

    /* renamed from: a */
    private final C2469a f8052a;

    /* renamed from: b */
    private boolean f8053b;

    /* renamed from: c */
    private boolean f8054c;

    /* renamed from: d */
    private boolean f8055d;

    /* renamed from: e */
    private boolean f8056e;

    /* renamed from: f */
    private int f8057f;

    /* renamed from: g */
    private int f8058g;

    /* renamed from: h */
    private boolean f8059h;

    /* renamed from: i */
    private Paint f8060i;

    /* renamed from: j */
    private Rect f8061j;

    /* renamed from: k */
    private List<AbstractC1094b.AbstractC1095a> f8062k;

    /* renamed from: h */
    private void m10412h() {
        this.f8057f = 0;
    }

    public int getOpacity() {
        return -2;
    }

    public Drawable.ConstantState getConstantState() {
        return this.f8052a;
    }

    public boolean isRunning() {
        return this.f8053b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bumptech.glide.load.resource.d.c$a */
    public static final class C2469a extends Drawable.ConstantState {

        /* renamed from: a */
        final C2473g f8063a;

        public int getChangingConfigurations() {
            return 0;
        }

        public Drawable newDrawable() {
            return new C2468c(this);
        }

        C2469a(C2473g gVar) {
            this.f8063a = gVar;
        }

        public Drawable newDrawable(Resources resources) {
            return newDrawable();
        }
    }

    public void stop() {
        this.f8054c = false;
        m10414j();
    }

    /* renamed from: j */
    private void m10414j() {
        this.f8053b = false;
        this.f8052a.f8063a.mo11027b(this);
    }

    /* renamed from: k */
    private Rect m10415k() {
        if (this.f8061j == null) {
            this.f8061j = new Rect();
        }
        return this.f8061j;
    }

    /* renamed from: l */
    private Paint m10416l() {
        if (this.f8060i == null) {
            this.f8060i = new Paint(2);
        }
        return this.f8060i;
    }

    /* renamed from: m */
    private Drawable.Callback m10417m() {
        Drawable.Callback callback = getCallback();
        while (callback instanceof Drawable) {
            callback = ((Drawable) callback).getCallback();
        }
        return callback;
    }

    /* renamed from: a */
    public int mo10998a() {
        return this.f8052a.f8063a.mo11029d();
    }

    /* renamed from: b */
    public Bitmap mo11000b() {
        return this.f8052a.f8063a.mo11022a();
    }

    /* renamed from: c */
    public ByteBuffer mo11001c() {
        return this.f8052a.f8063a.mo11031f();
    }

    /* renamed from: d */
    public int mo11002d() {
        return this.f8052a.f8063a.mo11032g();
    }

    /* renamed from: e */
    public int mo11004e() {
        return this.f8052a.f8063a.mo11030e();
    }

    /* renamed from: g */
    public void mo11006g() {
        this.f8055d = true;
        this.f8052a.f8063a.mo11033h();
    }

    public int getIntrinsicHeight() {
        return this.f8052a.f8063a.mo11028c();
    }

    public int getIntrinsicWidth() {
        return this.f8052a.f8063a.mo11026b();
    }

    public void start() {
        this.f8054c = true;
        m10412h();
        if (this.f8056e) {
            m10413i();
        }
    }

    /* renamed from: n */
    private void m10418n() {
        List<AbstractC1094b.AbstractC1095a> list = this.f8062k;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                this.f8062k.get(i).mo5744a(this);
            }
        }
    }

    /* renamed from: i */
    private void m10413i() {
        C2567j.m10898a(!this.f8055d, "You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request.");
        if (this.f8052a.f8063a.mo11032g() == 1) {
            invalidateSelf();
        } else if (!this.f8053b) {
            this.f8053b = true;
            this.f8052a.f8063a.mo11025a(this);
            invalidateSelf();
        }
    }

    @Override // com.bumptech.glide.load.resource.p093d.C2473g.AbstractC2475b
    /* renamed from: f */
    public void mo11005f() {
        if (m10417m() == null) {
            stop();
            invalidateSelf();
            return;
        }
        invalidateSelf();
        if (mo11004e() == mo11002d() - 1) {
            this.f8057f++;
        }
        int i = this.f8058g;
        if (i != -1 && this.f8057f >= i) {
            m10418n();
            stop();
        }
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f8059h = true;
    }

    public void setAlpha(int i) {
        m10416l().setAlpha(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        m10416l().setColorFilter(colorFilter);
    }

    C2468c(C2469a aVar) {
        this.f8056e = true;
        this.f8058g = -1;
        this.f8052a = (C2469a) C2567j.m10894a(aVar);
    }

    public void draw(Canvas canvas) {
        if (!this.f8055d) {
            if (this.f8059h) {
                Gravity.apply(119, getIntrinsicWidth(), getIntrinsicHeight(), getBounds(), m10415k());
                this.f8059h = false;
            }
            canvas.drawBitmap(this.f8052a.f8063a.mo11034i(), (Rect) null, m10415k(), m10416l());
        }
    }

    /* renamed from: a */
    public void mo10999a(AbstractC2393i<Bitmap> iVar, Bitmap bitmap) {
        this.f8052a.f8063a.mo11023a(iVar, bitmap);
    }

    public boolean setVisible(boolean z, boolean z2) {
        C2567j.m10898a(!this.f8055d, "Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View's visibility.");
        this.f8056e = z;
        if (!z) {
            m10414j();
        } else if (this.f8054c) {
            m10413i();
        }
        return super.setVisible(z, z2);
    }

    public C2468c(Context context, GifDecoder gifDecoder, AbstractC2393i<Bitmap> iVar, int i, int i2, Bitmap bitmap) {
        this(new C2469a(new C2473g(ComponentCallbacks2C2115c.m9149b(context), gifDecoder, i, i2, iVar, bitmap)));
    }
}
