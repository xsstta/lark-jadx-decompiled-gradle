package pl.droidsonroids.gif;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.SystemClock;
import android.widget.MediaController;
import java.io.File;
import java.io.IOException;
import java.util.Locale;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import pl.droidsonroids.gif.p3531a.AbstractC70147a;

/* renamed from: pl.droidsonroids.gif.c */
public class C70149c extends Drawable implements Animatable, MediaController.MediaPlayerControl {

    /* renamed from: a */
    final ScheduledThreadPoolExecutor f175248a;

    /* renamed from: b */
    volatile boolean f175249b;

    /* renamed from: c */
    long f175250c;

    /* renamed from: d */
    protected final Paint f175251d;

    /* renamed from: e */
    final Bitmap f175252e;

    /* renamed from: f */
    final GifInfoHandle f175253f;

    /* renamed from: g */
    final ConcurrentLinkedQueue<AbstractC70146a> f175254g;

    /* renamed from: h */
    final boolean f175255h;

    /* renamed from: i */
    final HandlerC70162g f175256i;

    /* renamed from: j */
    ScheduledFuture<?> f175257j;

    /* renamed from: k */
    private final Rect f175258k;

    /* renamed from: l */
    private ColorStateList f175259l;

    /* renamed from: m */
    private PorterDuffColorFilter f175260m;

    /* renamed from: n */
    private PorterDuff.Mode f175261n;

    /* renamed from: o */
    private final C70167k f175262o;

    /* renamed from: p */
    private final Rect f175263p;

    /* renamed from: q */
    private int f175264q;

    /* renamed from: r */
    private int f175265r;

    /* renamed from: s */
    private AbstractC70147a f175266s;

    public boolean canPause() {
        return true;
    }

    public int getAudioSessionId() {
        return 0;
    }

    public int getBufferPercentage() {
        return 100;
    }

    public int getIntrinsicHeight() {
        return this.f175265r;
    }

    public int getIntrinsicWidth() {
        return this.f175264q;
    }

    public boolean isPlaying() {
        return this.f175249b;
    }

    public boolean isRunning() {
        return this.f175249b;
    }

    public void pause() {
        stop();
    }

    /* renamed from: b */
    public boolean mo247273b() {
        return this.f175253f.mo247215m();
    }

    /* renamed from: d */
    public int mo247278d() {
        return this.f175253f.mo247220r();
    }

    /* renamed from: f */
    public int mo247281f() {
        return this.f175253f.mo247211i();
    }

    public int getAlpha() {
        return this.f175251d.getAlpha();
    }

    public ColorFilter getColorFilter() {
        return this.f175251d.getColorFilter();
    }

    public int getCurrentPosition() {
        return this.f175253f.mo247210h();
    }

    public int getDuration() {
        return this.f175253f.mo247209g();
    }

    public void invalidateSelf() {
        super.invalidateSelf();
        m268933j();
    }

    /* renamed from: h */
    private void m268931h() {
        this.f175249b = false;
        this.f175256i.removeMessages(-1);
        this.f175253f.mo247197a();
    }

    /* renamed from: i */
    private void m268932i() {
        ScheduledFuture<?> scheduledFuture = this.f175257j;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.f175256i.removeMessages(-1);
    }

    /* renamed from: a */
    public void mo247270a() {
        m268931h();
        this.f175252e.recycle();
    }

    /* renamed from: c */
    public void mo247274c() {
        this.f175248a.execute(new AbstractRunnableC70168l(this) {
            /* class pl.droidsonroids.gif.C70149c.C701501 */

            @Override // pl.droidsonroids.gif.AbstractRunnableC70168l
            /* renamed from: a */
            public void mo247310a() {
                if (C70149c.this.f175253f.mo247204c()) {
                    C70149c.this.start();
                }
            }
        });
    }

    public boolean canSeekBackward() {
        if (mo247278d() > 1) {
            return true;
        }
        return false;
    }

    public boolean canSeekForward() {
        if (mo247278d() > 1) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public int mo247280e() {
        return this.f175252e.getRowBytes() * this.f175252e.getHeight();
    }

    /* renamed from: g */
    public int mo247282g() {
        int j = this.f175253f.mo247212j();
        if (j == 0 || j < this.f175253f.mo247206e()) {
            return j;
        }
        return j - 1;
    }

    public int getOpacity() {
        if (!this.f175253f.mo247221s() || this.f175251d.getAlpha() < 255) {
            return -2;
        }
        return -1;
    }

    public boolean isStateful() {
        ColorStateList colorStateList;
        if (super.isStateful() || ((colorStateList = this.f175259l) != null && colorStateList.isStateful())) {
            return true;
        }
        return false;
    }

    public void start() {
        synchronized (this) {
            if (!this.f175249b) {
                this.f175249b = true;
                mo247272a(this.f175253f.mo247203b());
            }
        }
    }

    public void stop() {
        synchronized (this) {
            if (this.f175249b) {
                this.f175249b = false;
                m268932i();
                this.f175253f.mo247205d();
            }
        }
    }

    /* renamed from: j */
    private void m268933j() {
        if (this.f175255h && this.f175249b) {
            long j = this.f175250c;
            if (j != Long.MIN_VALUE) {
                long max = Math.max(0L, j - SystemClock.uptimeMillis());
                this.f175250c = Long.MIN_VALUE;
                this.f175248a.remove(this.f175262o);
                this.f175257j = this.f175248a.schedule(this.f175262o, max, TimeUnit.MILLISECONDS);
            }
        }
    }

    public String toString() {
        return String.format(Locale.ENGLISH, "GIF: size: %dx%d, frames: %d, error: %d", Integer.valueOf(this.f175253f.mo247218p()), Integer.valueOf(this.f175253f.mo247219q()), Integer.valueOf(this.f175253f.mo247220r()), Integer.valueOf(this.f175253f.mo247207f()));
    }

    public C70149c(File file) throws IOException {
        this(file.getPath());
    }

    public void setAlpha(int i) {
        this.f175251d.setAlpha(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f175251d.setColorFilter(colorFilter);
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        this.f175258k.set(rect);
        AbstractC70147a aVar = this.f175266s;
        if (aVar != null) {
            aVar.mo247265a(rect);
        }
    }

    public void setDither(boolean z) {
        this.f175251d.setDither(z);
        invalidateSelf();
    }

    public void setFilterBitmap(boolean z) {
        this.f175251d.setFilterBitmap(z);
        invalidateSelf();
    }

    public void setTintList(ColorStateList colorStateList) {
        this.f175259l = colorStateList;
        this.f175260m = m268929a(colorStateList, this.f175261n);
        invalidateSelf();
    }

    public void setTintMode(PorterDuff.Mode mode) {
        this.f175261n = mode;
        this.f175260m = m268929a(this.f175259l, mode);
        invalidateSelf();
    }

    public C70149c(AssetFileDescriptor assetFileDescriptor) throws IOException {
        this(new GifInfoHandle(assetFileDescriptor), null, null, true);
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        ColorStateList colorStateList = this.f175259l;
        if (colorStateList == null || (mode = this.f175261n) == null) {
            return false;
        }
        this.f175260m = m268929a(colorStateList, mode);
        return true;
    }

    public void seekTo(final int i) {
        if (i >= 0) {
            this.f175248a.execute(new AbstractRunnableC70168l(this) {
                /* class pl.droidsonroids.gif.C70149c.C701512 */

                @Override // pl.droidsonroids.gif.AbstractRunnableC70168l
                /* renamed from: a */
                public void mo247310a() {
                    C70149c.this.f175253f.mo247201a(i, C70149c.this.f175252e);
                    this.f175285c.f175256i.sendEmptyMessageAtTime(-1, 0);
                }
            });
            return;
        }
        throw new IllegalArgumentException("Position is not positive");
    }

    /* renamed from: a */
    public void mo247271a(int i) {
        this.f175253f.mo247200a(i);
    }

    public void draw(Canvas canvas) {
        boolean z;
        if (this.f175260m == null || this.f175251d.getColorFilter() != null) {
            z = false;
        } else {
            this.f175251d.setColorFilter(this.f175260m);
            z = true;
        }
        AbstractC70147a aVar = this.f175266s;
        if (aVar == null) {
            canvas.drawBitmap(this.f175252e, this.f175263p, this.f175258k, this.f175251d);
        } else {
            aVar.mo247264a(canvas, this.f175251d, this.f175252e);
        }
        if (z) {
            this.f175251d.setColorFilter(null);
        }
    }

    public C70149c(String str) throws IOException {
        this(new GifInfoHandle(str), null, null, true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo247272a(long j) {
        if (this.f175255h) {
            this.f175250c = 0;
            this.f175256i.sendEmptyMessageAtTime(-1, 0);
            return;
        }
        m268932i();
        this.f175257j = this.f175248a.schedule(this.f175262o, Math.max(j, 0L), TimeUnit.MILLISECONDS);
    }

    /* renamed from: a */
    public static C70149c m268930a(Resources resources, int i) {
        try {
            return new C70149c(resources, i);
        } catch (IOException unused) {
            return null;
        }
    }

    public C70149c(ContentResolver contentResolver, Uri uri) throws IOException {
        this(GifInfoHandle.m268882a(contentResolver, uri), null, null, true);
    }

    /* renamed from: a */
    private PorterDuffColorFilter m268929a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        if (!this.f175255h) {
            if (z) {
                if (z2) {
                    mo247274c();
                }
                if (visible) {
                    start();
                }
            } else if (visible) {
                stop();
            }
        }
        return visible;
    }

    public C70149c(Resources resources, int i) throws Resources.NotFoundException, IOException {
        this(resources.openRawResourceFd(i));
        float a = C70155e.m268946a(resources, i);
        this.f175265r = (int) (((float) this.f175253f.mo247219q()) * a);
        this.f175264q = (int) (((float) this.f175253f.mo247218p()) * a);
    }

    C70149c(GifInfoHandle gifInfoHandle, C70149c cVar, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor, boolean z) {
        this.f175249b = true;
        this.f175250c = Long.MIN_VALUE;
        this.f175258k = new Rect();
        this.f175251d = new Paint(6);
        this.f175254g = new ConcurrentLinkedQueue<>();
        C70167k kVar = new C70167k(this);
        this.f175262o = kVar;
        this.f175255h = z;
        this.f175248a = scheduledThreadPoolExecutor == null ? C70152d.m268945a() : scheduledThreadPoolExecutor;
        this.f175253f = gifInfoHandle;
        Bitmap bitmap = null;
        if (cVar != null) {
            synchronized (cVar.f175253f) {
                if (!cVar.f175253f.mo247215m() && cVar.f175253f.mo247219q() >= gifInfoHandle.mo247219q() && cVar.f175253f.mo247218p() >= gifInfoHandle.mo247218p()) {
                    cVar.m268931h();
                    Bitmap bitmap2 = cVar.f175252e;
                    bitmap2.eraseColor(0);
                    bitmap = bitmap2;
                }
            }
        }
        if (bitmap == null) {
            this.f175252e = Bitmap.createBitmap(gifInfoHandle.mo247218p(), gifInfoHandle.mo247219q(), Bitmap.Config.ARGB_8888);
        } else {
            this.f175252e = bitmap;
        }
        this.f175252e.setHasAlpha(!gifInfoHandle.mo247221s());
        this.f175263p = new Rect(0, 0, gifInfoHandle.mo247218p(), gifInfoHandle.mo247219q());
        this.f175256i = new HandlerC70162g(this);
        kVar.mo247310a();
        this.f175264q = gifInfoHandle.mo247218p();
        this.f175265r = gifInfoHandle.mo247219q();
    }
}
