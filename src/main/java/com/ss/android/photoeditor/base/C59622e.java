package com.ss.android.photoeditor.base;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.Handler;
import android.os.Looper;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.ss.android.lark.log.Log;
import com.ss.android.photoeditor.p3010b.C59610b;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.photoeditor.base.e */
public class C59622e {

    /* renamed from: a */
    public static boolean f147982a;

    /* renamed from: c */
    private static volatile C59622e f147983c;

    /* renamed from: b */
    public List<AbstractC59624a> f147984b = new ArrayList();

    /* renamed from: d */
    private List<AbstractC59624a> f147985d = new ArrayList();

    /* renamed from: e */
    private List<AbstractC59624a> f147986e = new ArrayList();

    /* renamed from: f */
    private AbstractC59626c f147987f;

    /* renamed from: g */
    private Bitmap f147988g;

    /* renamed from: h */
    private Handler f147989h = new Handler(Looper.getMainLooper());

    /* renamed from: i */
    private int f147990i = 0;

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.photoeditor.base.e$c */
    public interface AbstractC59626c {
        /* renamed from: a */
        void mo203128a(int i);
    }

    /* renamed from: com.ss.android.photoeditor.base.e$b */
    public static class C59625b {

        /* renamed from: a */
        public RectF f147995a;

        /* renamed from: b */
        public RectF f147996b;

        /* renamed from: c */
        public int f147997c;

        /* renamed from: d */
        public boolean f147998d;

        /* renamed from: e */
        protected Bitmap f147999e;

        /* renamed from: f */
        protected Bitmap f148000f;

        /* renamed from: g */
        protected Canvas f148001g = new Canvas(this.f148000f);

        /* renamed from: a */
        public Bitmap mo203118a() {
            return this.f147999e;
        }

        /* renamed from: b */
        public Bitmap mo203121b() {
            return this.f148000f;
        }

        /* renamed from: c */
        public int mo203123c() {
            return this.f147997c;
        }

        /* renamed from: d */
        public Canvas mo203124d() {
            return this.f148001g;
        }

        /* renamed from: e */
        public RectF mo203125e() {
            return this.f147995a;
        }

        /* renamed from: f */
        public RectF mo203126f() {
            return this.f147996b;
        }

        /* renamed from: g */
        public void mo203127g() {
            this.f147999e = null;
            this.f148000f = null;
        }

        /* renamed from: a */
        public final C59625b mo203119a(AbstractC59624a aVar) {
            return aVar.mo203110b(this);
        }

        /* renamed from: b */
        public final C59625b mo203122b(AbstractC59624a aVar) {
            return aVar.mo203106a(this);
        }

        /* renamed from: a */
        public void mo203120a(C59625b bVar) {
            this.f148001g.drawBitmap(bVar.f148000f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (Paint) null);
        }

        public C59625b(C59625b bVar) {
            this.f147999e = bVar.f147999e;
            this.f147995a = new RectF(bVar.f147995a);
            this.f147996b = new RectF(bVar.f147996b);
            this.f147997c = bVar.f147997c;
            this.f147998d = bVar.f147998d;
            this.f148000f = Bitmap.createBitmap(bVar.f148000f);
        }

        C59625b(Bitmap bitmap, RectF rectF, RectF rectF2, int i, boolean z) {
            this.f147999e = bitmap;
            this.f147995a = new RectF(rectF);
            this.f147996b = new RectF(rectF2);
            this.f147997c = i;
            this.f147998d = z;
            this.f148000f = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_4444);
        }
    }

    /* renamed from: d */
    public List<AbstractC59624a> mo203096d() {
        return this.f147985d;
    }

    /* renamed from: g */
    public Bitmap mo203099g() {
        return mo203087a(mo203094c());
    }

    /* renamed from: a */
    public static C59622e m231233a() {
        if (f147983c == null) {
            synchronized (C59622e.class) {
                if (f147983c == null) {
                    f147983c = new C59622e();
                }
            }
        }
        return f147983c;
    }

    /* renamed from: m */
    private void m231239m() {
        AbstractC59626c cVar = this.f147987f;
        if (cVar != null) {
            cVar.mo203128a(this.f147985d.size() - this.f147990i);
        }
    }

    /* renamed from: c */
    public C59625b mo203094c() {
        C59625b b = m231235b(m231238l());
        for (AbstractC59624a aVar : this.f147985d) {
            b = b.mo203122b(aVar);
        }
        return b;
    }

    /* renamed from: e */
    public AbstractC59624a mo203097e() {
        if (this.f147985d.size() <= 0) {
            return null;
        }
        List<AbstractC59624a> list = this.f147985d;
        return list.get(list.size() - 1);
    }

    /* renamed from: f */
    public C59625b mo203098f() {
        C59625b k = mo203103k();
        for (AbstractC59624a aVar : this.f147985d) {
            k = k.mo203122b(aVar);
        }
        return k;
    }

    /* renamed from: j */
    public int mo203102j() {
        for (int size = this.f147984b.size() - 1; size >= 0; size--) {
            if (this.f147984b.get(size).f147993a != null) {
                return size;
            }
        }
        return -1;
    }

    private C59622e() {
        C59641k.m231334a("EditActionManager", "call <init>");
    }

    /* renamed from: b */
    public void mo203092b() {
        this.f147985d.clear();
        this.f147984b.clear();
        this.f147986e.clear();
        this.f147989h.removeCallbacksAndMessages(null);
        this.f147989h = null;
        this.f147990i = 0;
        this.f147987f = null;
        f147983c = null;
        C59641k.m231334a("EditActionManager", "call destroy");
    }

    /* renamed from: k */
    public C59625b mo203103k() {
        Bitmap bitmap = this.f147988g;
        if (bitmap == null) {
            bitmap = Bitmap.createBitmap(10, 10, Bitmap.Config.ARGB_4444);
            C59641k.m231335b("EditActionManager", "mOriginBmp is null");
        }
        RectF rectF = new RectF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (float) bitmap.getWidth(), (float) bitmap.getHeight());
        return new C59625b(bitmap, rectF, rectF, 0, false);
    }

    /* renamed from: l */
    private C59625b m231238l() {
        C59625b bVar;
        int j = mo203102j();
        if (j == -1) {
            bVar = mo203103k();
        } else {
            bVar = new C59625b(this.f147984b.get(j).f147993a);
        }
        long currentTimeMillis = System.currentTimeMillis();
        int i = 0;
        for (int i2 = j + 1; i2 < this.f147984b.size(); i2++) {
            i++;
            bVar = bVar.mo203119a(this.f147984b.get(i2));
        }
        long currentTimeMillis2 = System.currentTimeMillis();
        Log.m165379d("getEditResult-Immutable", "For times = " + i + ", time = " + (currentTimeMillis2 - currentTimeMillis));
        return bVar;
    }

    /* renamed from: h */
    public AbstractC59624a mo203100h() {
        AbstractC59624a aVar = null;
        if (this.f147985d.size() > 0) {
            List<AbstractC59624a> list = this.f147985d;
            AbstractC59624a aVar2 = list.get(list.size() - 1);
            if (!aVar2.mo203116h()) {
                this.f147986e.remove(aVar2);
                List<AbstractC59624a> list2 = this.f147985d;
                list2.remove(list2.size() - 1);
                aVar2.mo203112d();
            } else if (this.f147984b.size() > this.f147990i) {
                this.f147984b.remove(aVar2);
                List<AbstractC59624a> list3 = this.f147985d;
                list3.remove(list3.size() - 1);
                aVar2.mo203112d();
            }
            aVar = aVar2;
        }
        m231239m();
        return aVar;
    }

    /* renamed from: i */
    public void mo203101i() {
        if (this.f147986e.size() > 1) {
            for (int i = 0; i < this.f147986e.size(); i++) {
                this.f147986e.get(i).f147993a = null;
            }
            f147982a = true;
            for (int i2 = 3; i2 < this.f147986e.size(); i2 += 4) {
                C59625b k = mo203103k();
                int i3 = i2 - 1;
                while (true) {
                    if (i3 < 0) {
                        break;
                    } else if (this.f147986e.get(i3).f147993a != null) {
                        k = new C59625b(this.f147986e.get(i3).f147993a);
                        break;
                    } else {
                        i3--;
                    }
                }
                while (true) {
                    i3++;
                    if (i3 > i2) {
                        break;
                    }
                    k = k.mo203119a(this.f147986e.get(i3));
                }
                this.f147986e.get(i2).f147993a = k;
            }
            f147982a = false;
        }
    }

    /* renamed from: com.ss.android.photoeditor.base.e$a */
    public static abstract class AbstractC59624a {

        /* renamed from: a */
        public C59625b f147993a;

        /* renamed from: b */
        private Matrix f147994b;

        /* renamed from: a */
        public abstract RectF mo203105a();

        /* renamed from: a */
        public abstract C59625b mo203106a(C59625b bVar);

        /* renamed from: a */
        public void mo203107a(Canvas canvas) {
        }

        /* renamed from: a */
        public boolean mo203108a(PointF pointF, RectF rectF) {
            return false;
        }

        /* renamed from: b */
        public abstract RectF mo203109b();

        /* renamed from: c */
        public abstract Bitmap mo203111c();

        /* renamed from: d */
        public void mo203112d() {
        }

        /* renamed from: e */
        public boolean mo203113e() {
            return true;
        }

        /* renamed from: f */
        public boolean mo203114f() {
            return false;
        }

        /* renamed from: g */
        public void mo203115g() {
        }

        /* renamed from: h */
        public boolean mo203116h() {
            return true;
        }

        /* renamed from: i */
        public void mo203117i() {
            float f;
            float f2;
            C59625b f3 = C59622e.m231233a().mo203098f();
            if (mo203109b() != null && mo203105a() != null) {
                RectF rectF = new RectF(mo203109b());
                RectF rectF2 = new RectF(mo203105a());
                RectF rectF3 = new RectF(f3.mo203125e());
                RectF rectF4 = new RectF(f3.mo203126f());
                float width = ((float) f3.f148000f.getWidth()) / rectF4.width();
                C59610b.m231211a(rectF4, (float) BitmapDescriptorFactory.HUE_RED, (float) BitmapDescriptorFactory.HUE_RED, width);
                C59610b.m231211a(rectF3, (float) BitmapDescriptorFactory.HUE_RED, (float) BitmapDescriptorFactory.HUE_RED, width);
                float f4 = -rectF4.left;
                float f5 = -rectF4.top;
                rectF4.offset(f4, f5);
                rectF3.offset(f4, f5);
                if ((f3.mo203123c() / 90) % 2 == 0) {
                    f2 = rectF3.width();
                    f = rectF2.width();
                } else {
                    f2 = rectF3.height();
                    f = rectF2.width();
                }
                float f6 = f2 / f;
                C59610b.m231211a(rectF2, (float) BitmapDescriptorFactory.HUE_RED, (float) BitmapDescriptorFactory.HUE_RED, f6);
                C59610b.m231211a(rectF, (float) BitmapDescriptorFactory.HUE_RED, (float) BitmapDescriptorFactory.HUE_RED, f6);
                float centerX = rectF3.centerX() - rectF2.centerX();
                float centerY = rectF3.centerY() - rectF2.centerY();
                rectF.offset(centerX, centerY);
                rectF2.offset(centerX, centerY);
                this.f147994b = new Matrix();
                float width2 = rectF.width() / mo203109b().width();
                this.f147994b.postScale(width2, width2);
                this.f147994b.postTranslate(rectF.left, rectF.top);
                this.f147994b.postRotate((float) (-f3.mo203123c()), rectF3.centerX(), rectF3.centerY());
            }
        }

        /* renamed from: b */
        public C59625b mo203110b(C59625b bVar) {
            if (!C59622e.f147982a && !mo203113e()) {
                return bVar;
            }
            if (this.f147994b != null) {
                long currentTimeMillis = System.currentTimeMillis();
                Canvas d = bVar.mo203124d();
                Paint paint = new Paint();
                paint.setAntiAlias(true);
                paint.setFilterBitmap(true);
                d.drawBitmap(mo203111c(), this.f147994b, paint);
                long currentTimeMillis2 = System.currentTimeMillis();
                Log.m165379d("GX_apply", "apply : draw to parent use = " + (currentTimeMillis2 - currentTimeMillis));
            }
            mo203107a(bVar.mo203124d());
            return bVar;
        }
    }

    /* renamed from: d */
    private void m231236d(AbstractC59624a aVar) {
        this.f147986e.add(aVar);
    }

    /* renamed from: a */
    public void mo203089a(AbstractC59626c cVar) {
        this.f147987f = cVar;
        cVar.mo203128a(this.f147985d.size() - this.f147990i);
    }

    /* renamed from: b */
    public void mo203093b(AbstractC59624a aVar) {
        this.f147985d.add(aVar);
        aVar.mo203117i();
        if (aVar.mo203116h()) {
            m231237e(aVar);
        } else {
            m231236d(aVar);
        }
        m231239m();
    }

    /* renamed from: c */
    public void mo203095c(AbstractC59624a aVar) {
        int indexOf;
        if (!aVar.mo203116h() && (indexOf = this.f147986e.indexOf(aVar)) >= 0) {
            for (indexOf = this.f147986e.indexOf(aVar); indexOf < this.f147986e.size(); indexOf++) {
                this.f147986e.get(indexOf).f147993a = null;
            }
        }
    }

    /* renamed from: b */
    private C59625b m231235b(C59625b bVar) {
        if (this.f147986e.size() == 0) {
            return bVar;
        }
        long currentTimeMillis = System.currentTimeMillis();
        int i = 0;
        C59625b bVar2 = null;
        int size = this.f147986e.size() - 1;
        while (true) {
            if (size < 0) {
                break;
            } else if (this.f147986e.get(size).f147993a != null) {
                bVar2 = this.f147986e.get(size).f147993a;
                break;
            } else {
                size--;
            }
        }
        if (bVar2 != null) {
            bVar.mo203120a(bVar2);
        } else {
            size = -1;
        }
        while (true) {
            size++;
            if (size < this.f147986e.size()) {
                i++;
                bVar = bVar.mo203119a(this.f147986e.get(size));
            } else {
                long currentTimeMillis2 = System.currentTimeMillis();
                Log.m165379d("getEditResult--Variable", "For times = " + i + ", time = " + (currentTimeMillis2 - currentTimeMillis));
                return bVar;
            }
        }
    }

    /* renamed from: e */
    private void m231237e(final AbstractC59624a aVar) {
        if (this.f147984b.size() - this.f147990i > 80) {
            int i = 0;
            C59625b bVar = null;
            while (true) {
                if (i >= this.f147984b.size()) {
                    break;
                }
                AbstractC59624a aVar2 = this.f147984b.get(i);
                if (aVar2.f147993a != null) {
                    if (bVar != null) {
                        this.f147990i = i + 1;
                        break;
                    }
                    bVar = aVar2.f147993a;
                    aVar2.f147993a.mo203127g();
                    aVar2.f147993a = null;
                }
                i++;
            }
        }
        this.f147984b.add(aVar);
        if (this.f147984b.size() % 4 == 0) {
            this.f147989h.post(new Runnable() {
                /* class com.ss.android.photoeditor.base.C59622e.RunnableC596231 */

                public void run() {
                    C59625b bVar;
                    int j = C59622e.this.mo203102j();
                    if (j == -1) {
                        bVar = C59622e.this.mo203103k();
                    } else {
                        bVar = new C59625b(C59622e.this.f147984b.get(j).f147993a);
                    }
                    while (true) {
                        j++;
                        if (j < C59622e.this.f147984b.size()) {
                            bVar = bVar.mo203119a(C59622e.this.f147984b.get(j));
                        } else {
                            aVar.f147993a = bVar;
                            return;
                        }
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public void mo203088a(Bitmap bitmap) {
        this.f147988g = bitmap;
        C59641k.m231334a("EditActionManager", "call setOriginBitmap : " + bitmap);
    }

    /* renamed from: a */
    public Bitmap mo203087a(C59625b bVar) {
        RectF rectF = new RectF(bVar.mo203125e());
        RectF rectF2 = new RectF(bVar.mo203126f());
        Bitmap b = bVar.mo203121b();
        Bitmap createBitmap = Bitmap.createBitmap(b.getWidth(), b.getHeight(), Bitmap.Config.ARGB_4444);
        Canvas canvas = new Canvas(createBitmap);
        canvas.drawBitmap(bVar.f147999e, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (Paint) null);
        canvas.drawBitmap(b, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (Paint) null);
        float width = ((float) createBitmap.getWidth()) / rectF2.width();
        C59610b.m231211a(rectF, (float) BitmapDescriptorFactory.HUE_RED, (float) BitmapDescriptorFactory.HUE_RED, width);
        C59610b.m231211a(rectF2, (float) BitmapDescriptorFactory.HUE_RED, (float) BitmapDescriptorFactory.HUE_RED, width);
        Bitmap createBitmap2 = Bitmap.createBitmap(Math.max((int) rectF.width(), 1), Math.max((int) rectF.height(), 1), Bitmap.Config.ARGB_4444);
        Canvas canvas2 = new Canvas(createBitmap2);
        Matrix matrix = new Matrix();
        matrix.postTranslate(rectF2.left - rectF.left, rectF2.top - rectF.top);
        canvas2.drawBitmap(createBitmap, matrix, null);
        float c = (float) bVar.mo203123c();
        if (c == BitmapDescriptorFactory.HUE_RED) {
            return createBitmap2;
        }
        matrix.reset();
        matrix.postRotate(c);
        Bitmap createBitmap3 = Bitmap.createBitmap(createBitmap2, 0, 0, createBitmap2.getWidth(), createBitmap2.getHeight(), matrix, true);
        matrix.reset();
        return createBitmap3;
    }

    /* renamed from: a */
    public boolean mo203091a(AbstractC59624a aVar) {
        int i = -1;
        if (aVar != null) {
            int indexOf = this.f147985d.indexOf(aVar);
            if (indexOf == -1) {
                return true;
            }
            i = indexOf;
        }
        C59625b k = mo203103k();
        for (int i2 = i + 1; i2 < this.f147985d.size(); i2++) {
            k = k.mo203122b(this.f147985d.get(i2));
        }
        return k.f147998d;
    }

    /* renamed from: a */
    private boolean m231234a(PointF pointF, RectF rectF) {
        List<AbstractC59624a> d = m231233a().mo203096d();
        for (int size = d.size() - 1; size >= 0; size--) {
            AbstractC59624a aVar = d.get(size);
            if (aVar.mo203114f() && aVar.mo203108a(pointF, rectF)) {
                aVar.mo203115g();
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public boolean mo203090a(RectF rectF, float f, float f2) {
        float f3;
        float f4;
        RectF rectF2 = new RectF(rectF);
        C59625b f5 = m231233a().mo203098f();
        PointF pointF = new PointF(f, f2);
        RectF rectF3 = new RectF(f5.f147995a);
        RectF rectF4 = new RectF(f5.f147996b);
        if ((f5.mo203123c() / 90) % 2 == 0) {
            f4 = rectF3.width();
            f3 = rectF2.width();
        } else {
            f4 = rectF3.height();
            f3 = rectF2.width();
        }
        float f6 = f4 / f3;
        C59610b.m231211a(rectF2, (float) BitmapDescriptorFactory.HUE_RED, (float) BitmapDescriptorFactory.HUE_RED, f6);
        pointF.x *= f6;
        pointF.y *= f6;
        C59610b.m231213a(rectF2, -f5.f147997c, (float) BitmapDescriptorFactory.HUE_RED, (float) BitmapDescriptorFactory.HUE_RED);
        C59610b.m231210a(pointF, (float) BitmapDescriptorFactory.HUE_RED, (float) BitmapDescriptorFactory.HUE_RED, -f5.f147997c);
        float centerX = rectF3.centerX() - rectF2.centerX();
        float centerY = rectF3.centerY() - rectF2.centerY();
        rectF2.offset(centerX, centerY);
        pointF.x += centerX;
        pointF.y += centerY;
        pointF.x -= rectF4.left;
        pointF.y -= rectF4.top;
        return m231234a(pointF, new RectF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, rectF4.width(), rectF4.height()));
    }
}
