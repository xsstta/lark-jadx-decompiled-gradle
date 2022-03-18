package com.ss.android.photoeditor.mosaic;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.CornerPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.view.MotionEvent;
import com.huawei.hms.location.LocationRequest;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;
import com.ss.android.photoeditor.base.C59614a;
import com.ss.android.photoeditor.base.C59622e;
import com.ss.ttm.player.MediaPlayer;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.photoeditor.mosaic.a */
public class C59734a extends AbstractMosaicStrategy {

    /* renamed from: n */
    private static int f148342n = 128;

    /* renamed from: A */
    private float f148343A;

    /* renamed from: B */
    private boolean f148344B = false;

    /* renamed from: C */
    private List<C59735a.C59736a> f148345C = new ArrayList();

    /* renamed from: o */
    private int f148346o = MediaPlayer.MEDIA_PLAYER_OPTION_USE_CODEC_POOL;

    /* renamed from: p */
    private int f148347p = LocationRequest.PRIORITY_HD_ACCURACY;

    /* renamed from: q */
    private int f148348q = 3;

    /* renamed from: r */
    private int f148349r;

    /* renamed from: s */
    private int[][] f148350s;

    /* renamed from: t */
    private C59741c f148351t = new C59741c(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);

    /* renamed from: u */
    private C59741c f148352u = new C59741c(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);

    /* renamed from: v */
    private Paint f148353v;

    /* renamed from: w */
    private RectF f148354w;

    /* renamed from: x */
    private float f148355x;

    /* renamed from: y */
    private float f148356y;

    /* renamed from: z */
    private float f148357z;

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.photoeditor.mosaic.a$a */
    public static class C59735a extends C59622e.AbstractC59624a {

        /* renamed from: b */
        private List<C59736a> f148358b;

        /* renamed from: c */
        private RectF f148359c;

        /* renamed from: d */
        private RectF f148360d;

        /* renamed from: e */
        private int f148361e;

        /* renamed from: f */
        private int f148362f;

        /* renamed from: g */
        private RectF f148363g;

        /* renamed from: h */
        private RectF f148364h = new RectF();

        /* renamed from: i */
        private RectF f148365i;

        /* renamed from: j */
        private RectF f148366j;

        @Override // com.ss.android.photoeditor.base.C59622e.AbstractC59624a
        /* renamed from: a */
        public RectF mo203105a() {
            return this.f148359c;
        }

        @Override // com.ss.android.photoeditor.base.C59622e.AbstractC59624a
        /* renamed from: b */
        public RectF mo203109b() {
            return this.f148360d;
        }

        @Override // com.ss.android.photoeditor.base.C59622e.AbstractC59624a
        /* renamed from: c */
        public Bitmap mo203111c() {
            Bitmap createBitmap = Bitmap.createBitmap((int) this.f148363g.width(), (int) this.f148363g.height(), Bitmap.Config.ARGB_4444);
            Canvas canvas = new Canvas(createBitmap);
            for (int i = 0; i < this.f148358b.size(); i++) {
                C59736a aVar = this.f148358b.get(i);
                m231680a(canvas, aVar.f148367a, aVar.f148368b);
            }
            Bitmap createBitmap2 = Bitmap.createBitmap((int) this.f148360d.width(), (int) this.f148360d.height(), Bitmap.Config.ARGB_4444);
            Canvas canvas2 = new Canvas(createBitmap2);
            Matrix matrix = new Matrix();
            float width = this.f148359c.width() / this.f148363g.width();
            matrix.postScale(width, width);
            matrix.postTranslate(this.f148359c.left - this.f148360d.left, this.f148359c.top - this.f148360d.top);
            canvas2.drawBitmap(createBitmap, matrix, null);
            return createBitmap2;
        }

        @Override // com.ss.android.photoeditor.base.C59622e.AbstractC59624a
        /* renamed from: a */
        public C59622e.C59625b mo203106a(C59622e.C59625b bVar) {
            this.f148365i = new RectF(bVar.f147995a);
            this.f148366j = new RectF(bVar.f147996b);
            return bVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.ss.android.photoeditor.mosaic.a$a$a */
        public static class C59736a {

            /* renamed from: a */
            public final int[][] f148367a;

            /* renamed from: b */
            public final int[][][] f148368b;

            public C59736a(int[][] iArr, int[][][] iArr2) {
                this.f148367a = iArr;
                this.f148368b = iArr2;
            }
        }

        /* renamed from: a */
        private void m231680a(Canvas canvas, int[][] iArr, int[][][] iArr2) {
            int i = this.f148361e / this.f148362f;
            Paint paint = new Paint();
            paint.setAntiAlias(true);
            for (int i2 = 0; i2 < i; i2++) {
                int i3 = this.f148362f * i2;
                for (int i4 = 0; i4 < i; i4++) {
                    int i5 = iArr[i3][this.f148362f * i4];
                    if (i5 != 0) {
                        paint.setColor(i5);
                        int i6 = iArr2[i2][i4][0];
                        int i7 = iArr2[i2][i4][1];
                        int i8 = this.f148362f;
                        int i9 = i6 + i8;
                        int i10 = i8 + i7;
                        if (((float) i6) >= this.f148363g.right) {
                            i6 = (int) (this.f148363g.right - 1.0f);
                        }
                        if (((float) i7) >= this.f148363g.bottom) {
                            i7 = (int) (this.f148363g.bottom - 1.0f);
                        }
                        if (((float) i9) >= this.f148363g.right) {
                            i9 = (int) (this.f148363g.right - 1.0f);
                        }
                        if (((float) i10) >= this.f148363g.bottom) {
                            i10 = (int) (this.f148363g.bottom - 1.0f);
                        }
                        if (this.f148364h == null) {
                            this.f148364h = new RectF();
                        }
                        this.f148364h.set(((float) i6) - this.f148363g.left, ((float) i7) - this.f148363g.top, ((float) i9) - this.f148363g.left, ((float) i10) - this.f148363g.top);
                        canvas.drawRect(this.f148364h, paint);
                    }
                }
            }
        }

        public C59735a(List<C59736a> list, RectF rectF, int i, int i2, RectF rectF2, RectF rectF3) {
            this.f148358b = new ArrayList(list);
            this.f148359c = new RectF(rectF);
            this.f148361e = i;
            this.f148362f = i2;
            this.f148363g = new RectF(rectF2);
            this.f148360d = rectF3;
        }
    }

    /* renamed from: a */
    public int[][] mo203388a(C59741c cVar) {
        int[][] a = m231666a(cVar.f148393c);
        int i = this.f148349r;
        int[] iArr = new int[2];
        iArr[1] = i;
        iArr[0] = i;
        int[][] iArr2 = (int[][]) Array.newInstance(int.class, iArr);
        int i2 = (int) (cVar.f148391a - this.f148286e.left);
        int i3 = (int) (cVar.f148392b - this.f148286e.top);
        if (i2 < 0) {
            i2 = 0;
        }
        if (i3 < 0) {
            i3 = 0;
        }
        int pixel = this.f148282a.getPixel(Math.min((int) ((((float) this.f148282a.getWidth()) / this.f148286e.width()) * ((float) i2)), this.f148282a.getWidth() - 1), Math.min((int) ((((float) this.f148282a.getHeight()) / this.f148286e.height()) * ((float) i3)), this.f148282a.getHeight() - 1));
        int red = Color.red(pixel);
        int green = Color.green(pixel);
        int blue = Color.blue(pixel);
        int i4 = this.f148349r / this.f148348q;
        for (int i5 = 0; i5 < i4; i5++) {
            for (int i6 = 0; i6 < i4; i6++) {
                int i7 = this.f148348q;
                int i8 = i5 * i7;
                int i9 = i7 * i6;
                if (a[i8][i9] != 0) {
                    iArr2[i8][i9] = Color.argb(a[i8][i9], red, green, blue);
                }
            }
        }
        return iArr2;
    }

    @Override // com.ss.android.photoeditor.mosaic.AbstractMosaicStrategy
    /* renamed from: a */
    public void mo203349a(MotionEvent motionEvent) {
        if (this.f148282a != null && this.f148283b != null) {
            int action = motionEvent.getAction();
            if (action == 0) {
                this.f148344B = false;
                this.f148357z = motionEvent.getX();
                this.f148343A = motionEvent.getY();
                m231669b(motionEvent);
            } else if (action != 1) {
                if (action == 2) {
                    if (this.f148344B || C59614a.m231217a(this.f148294m, this.f148357z, this.f148343A, motionEvent.getX(), motionEvent.getY())) {
                        this.f148344B = true;
                        m231671c(motionEvent);
                    }
                }
            } else if (this.f148344B) {
                m231674h();
                m231675i();
            }
        }
    }

    /* renamed from: h */
    private void m231674h() {
        m231665a(true);
    }

    /* renamed from: i */
    private void m231675i() {
        C59622e.m231233a().mo203093b(new C59735a(this.f148345C, this.f148287f, this.f148349r, this.f148348q, this.f148286e, new RectF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, this.f148288g.width(), this.f148288g.height())));
        this.f148345C.clear();
    }

    @Override // com.ss.android.photoeditor.mosaic.AbstractMosaicStrategy
    /* renamed from: e */
    public void mo203359e() {
        Paint paint = new Paint();
        this.f148353v = paint;
        m231664a(paint);
        if (this.f148349r == 0) {
            mo203346a(f148342n);
        }
        this.f148283b = Bitmap.createBitmap((int) this.f148286e.width(), (int) this.f148286e.height(), Bitmap.Config.ARGB_4444);
        this.f148284c = new Canvas(this.f148283b);
        mo203356c();
    }

    /* renamed from: g */
    private void m231673g() {
        Bitmap decodeResource = BitmapFactory.decodeResource(this.f148294m.getResources(), R.drawable.photo_editor_mosaic_brush);
        int i = this.f148349r;
        Bitmap a = C59742d.m231713a(decodeResource, i, i, true);
        int i2 = this.f148349r;
        int[] iArr = new int[2];
        iArr[1] = i2;
        iArr[0] = i2;
        this.f148350s = (int[][]) Array.newInstance(int.class, iArr);
        for (int i3 = 0; i3 < this.f148349r; i3++) {
            for (int i4 = 0; i4 < this.f148349r; i4++) {
                this.f148350s[i3][i4] = Color.alpha(a.getPixel(i3, i4));
            }
        }
        a.recycle();
    }

    /* renamed from: a */
    private void m231665a(boolean z) {
        this.f148293l.mo203361a(this.f148283b, true);
    }

    /* renamed from: b */
    private void m231670b(C59741c cVar) {
        cVar.f148391a = this.f148355x;
        cVar.f148392b = this.f148356y;
    }

    public C59734a(Context context) {
        super(context);
    }

    /* renamed from: b */
    private void m231669b(MotionEvent motionEvent) {
        this.f148345C.clear();
        this.f148351t = new C59741c(motionEvent.getX(), motionEvent.getY());
    }

    /* renamed from: c */
    private void m231672c(C59741c cVar) {
        float width = this.f148286e.width() / this.f148287f.width();
        float f = ((cVar.f148391a - this.f148287f.left) * width) + this.f148286e.left;
        float f2 = ((cVar.f148392b - this.f148287f.top) * width) + this.f148286e.top;
        this.f148355x = cVar.f148391a;
        this.f148356y = cVar.f148392b;
        cVar.f148391a = f;
        cVar.f148392b = f2;
    }

    /* renamed from: c */
    private void m231671c(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        C59741c cVar = new C59741c(x, y);
        this.f148352u = cVar;
        float a = C59742d.m231708a(this.f148351t, cVar);
        this.f148352u.f148393c = a;
        if (C59742d.m231709a(this.f148351t.f148391a, this.f148351t.f148392b, x, y) > this.f148349r) {
            int a2 = C59742d.m231709a(this.f148351t.f148391a, this.f148351t.f148392b, x, y) / this.f148349r;
            for (int i = 1; i < a2; i++) {
                float f = (float) i;
                float f2 = (float) a2;
                m231662a(this.f148284c, new C59741c(this.f148351t.f148391a + ((((x - this.f148351t.f148391a) * f) / f2) * 1.0f), this.f148351t.f148392b + ((((y - this.f148351t.f148392b) * f) / f2) * 1.0f), a));
                m231665a(false);
            }
        }
        if (C59742d.m231709a(this.f148351t.f148391a, this.f148351t.f148392b, x, y) > 20) {
            m231662a(this.f148284c, this.f148352u);
            this.f148351t = this.f148352u;
            m231665a(false);
        }
    }

    /* renamed from: a */
    private void m231664a(Paint paint) {
        if (paint != null) {
            paint.reset();
            paint.setStyle(Paint.Style.STROKE);
            paint.setAntiAlias(true);
            paint.setPathEffect(new CornerPathEffect(10.0f));
            paint.setStrokeWidth((float) this.f148349r);
            paint.setStrokeJoin(Paint.Join.ROUND);
            paint.setStrokeCap(Paint.Cap.ROUND);
        }
    }

    /* renamed from: a */
    private int[][] m231666a(float f) {
        int i;
        int i2;
        float f2 = (float) ((((double) f) * 3.141592653589793d) / 180.0d);
        int i3 = this.f148349r;
        int[] iArr = new int[2];
        iArr[1] = i3;
        iArr[0] = i3;
        int[][] iArr2 = (int[][]) Array.newInstance(int.class, iArr);
        int i4 = this.f148349r / 2;
        int i5 = 0;
        while (i5 < this.f148349r) {
            int i6 = 0;
            while (true) {
                int i7 = this.f148349r;
                if (i6 >= i7) {
                    break;
                }
                if (i5 >= i7) {
                    i5 = i7 - 1;
                }
                if (i6 >= i7) {
                    i6 = i7 - 1;
                }
                if (f2 != BitmapDescriptorFactory.HUE_RED) {
                    double d = (double) (i5 - i4);
                    double d2 = (double) f2;
                    double d3 = (double) (i6 - i4);
                    double d4 = (double) i4;
                    float cos = (float) ((int) (((Math.cos(d2) * d) - (Math.sin(d2) * d3)) + d4));
                    float sin = (float) ((int) ((d * Math.sin(d2)) + (d3 * Math.cos(d2)) + d4));
                    i2 = (int) cos;
                    i = (int) sin;
                    if (((double) (cos - ((float) i2))) > 0.5d) {
                        i2++;
                    }
                    if (((double) (sin - ((float) i))) > 0.5d) {
                        i++;
                    }
                } else {
                    i2 = i5;
                    i = i6;
                }
                int i8 = this.f148349r;
                if (i2 >= i8) {
                    i2 = i8 - 1;
                }
                if (i >= i8) {
                    i = i8 - 1;
                }
                if (i2 < 0) {
                    i2 = 0;
                }
                if (i < 0) {
                    i = 0;
                }
                iArr2[i2][i] = this.f148350s[i5][i6];
                i6++;
            }
            i5++;
        }
        for (int i9 = 0; i9 < iArr2.length; i9++) {
            int a = m231660a(iArr2[i9], 0);
            int b = m231668b(iArr2[i9], iArr2[i9].length - 1);
            if (a < b) {
                m231661a(a, b, iArr2[i9]);
            }
        }
        return iArr2;
    }

    @Override // com.ss.android.photoeditor.mosaic.AbstractMosaicStrategy
    /* renamed from: a */
    public void mo203346a(int i) {
        this.f148349r = (int) (((float) i) * 1.4f);
        m231673g();
    }

    /* renamed from: a */
    private int m231660a(int[] iArr, int i) {
        while (i < iArr.length - 3 && (iArr[i] <= 3 || iArr[i + 1] <= 3)) {
            i++;
        }
        return i;
    }

    /* renamed from: b */
    private int m231668b(int[] iArr, int i) {
        while (i > 3 && (iArr[i] <= 3 || iArr[i - 1] <= 3)) {
            i--;
        }
        return i;
    }

    /* renamed from: a */
    private void m231662a(Canvas canvas, C59741c cVar) {
        canvas.drawColor(0, PorterDuff.Mode.CLEAR);
        m231672c(cVar);
        int[][] a = mo203388a(cVar);
        int[][][] a2 = m231667a(cVar.f148393c, cVar);
        m231670b(cVar);
        this.f148345C.add(new C59735a.C59736a(a, a2));
        m231663a(canvas, a, a2);
    }

    /* renamed from: a */
    private int[][][] m231667a(float f, C59741c cVar) {
        int i = (int) (cVar.f148391a - ((float) (this.f148349r / 2)));
        int i2 = (int) (cVar.f148392b - ((float) (this.f148349r / 2)));
        if (((float) i) < this.f148286e.left) {
            i = (int) this.f148286e.left;
        }
        if (((float) i2) < this.f148286e.top) {
            i2 = (int) this.f148286e.top;
        }
        int i3 = this.f148349r / this.f148348q;
        int[] iArr = new int[3];
        iArr[2] = 2;
        iArr[1] = i3;
        iArr[0] = i3;
        int[][][] iArr2 = (int[][][]) Array.newInstance(int.class, iArr);
        for (int i4 = 0; i4 < i3; i4++) {
            int i5 = this.f148348q * i4;
            for (int i6 = 0; i6 < i3; i6++) {
                int i7 = this.f148348q;
                int i8 = i7 * i6;
                int i9 = i5 + i7;
                int i10 = this.f148349r;
                int i11 = i7 + i8;
                iArr2[i4][i6][0] = i + i5;
                iArr2[i4][i6][1] = i8 + i2;
            }
        }
        return iArr2;
    }

    /* renamed from: a */
    private void m231661a(int i, int i2, int[] iArr) {
        while (true) {
            i++;
            if (i >= i2) {
                return;
            }
            if (iArr[i] == 0) {
                iArr[i] = iArr[m231668b(iArr, i)] + 16;
            } else {
                iArr[i] = iArr[i] + 50;
            }
        }
    }

    /* renamed from: a */
    private void m231663a(Canvas canvas, int[][] iArr, int[][][] iArr2) {
        int i = this.f148349r / this.f148348q;
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = this.f148348q * i2;
            for (int i4 = 0; i4 < i; i4++) {
                int i5 = iArr[i3][this.f148348q * i4];
                if (i5 != 0) {
                    paint.setColor(i5);
                    int i6 = iArr2[i2][i4][0];
                    int i7 = iArr2[i2][i4][1];
                    int i8 = this.f148348q;
                    int i9 = i6 + i8;
                    int i10 = i8 + i7;
                    if (((float) i6) >= this.f148286e.right) {
                        i6 = (int) (this.f148286e.right - 1.0f);
                    }
                    if (((float) i7) >= this.f148286e.bottom) {
                        i7 = (int) (this.f148286e.bottom - 1.0f);
                    }
                    if (((float) i9) >= this.f148286e.right) {
                        i9 = (int) (this.f148286e.right - 1.0f);
                    }
                    if (((float) i10) >= this.f148286e.bottom) {
                        i10 = (int) (this.f148286e.bottom - 1.0f);
                    }
                    if (this.f148354w == null) {
                        this.f148354w = new RectF();
                    }
                    this.f148354w.set(((float) i6) - this.f148286e.left, ((float) i7) - this.f148286e.top, ((float) i9) - this.f148286e.left, ((float) i10) - this.f148286e.top);
                    canvas.drawRect(this.f148354w, paint);
                }
            }
        }
    }
}
