package com.bytedance.ee.bear.drive.view.preview.pdf;

import android.graphics.Bitmap;
import android.graphics.pdf.PdfRenderer;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.engine.p087a.AbstractC2283e;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p718t.C13749l;
import java.io.File;

/* renamed from: com.bytedance.ee.bear.drive.view.preview.pdf.b */
public class C7414b {

    /* renamed from: f */
    private static final Bitmap.Config f19964f = Bitmap.Config.ARGB_8888;

    /* renamed from: a */
    private volatile PdfRenderer f19965a;

    /* renamed from: b */
    private int f19966b;

    /* renamed from: c */
    private String f19967c;

    /* renamed from: d */
    private volatile boolean f19968d;

    /* renamed from: e */
    private volatile boolean f19969e;

    /* renamed from: g */
    private int f19970g;

    /* renamed from: h */
    private int f19971h;

    /* renamed from: com.bytedance.ee.bear.drive.view.preview.pdf.b$a */
    public static class C7415a {

        /* renamed from: a */
        Bitmap f19972a;

        /* renamed from: b */
        int f19973b;

        /* renamed from: c */
        int f19974c;

        /* renamed from: d */
        Throwable f19975d;

        /* renamed from: b */
        public Bitmap mo28956b() {
            return this.f19972a;
        }

        /* renamed from: c */
        public int mo28957c() {
            return this.f19973b;
        }

        /* renamed from: d */
        public Throwable mo28958d() {
            return this.f19975d;
        }

        /* renamed from: e */
        public int mo28959e() {
            return this.f19974c;
        }

        /* renamed from: a */
        public boolean mo28955a() {
            if (this.f19975d != null || this.f19972a == null) {
                return false;
            }
            return true;
        }

        public C7415a(Throwable th) {
            this.f19975d = th;
        }

        public C7415a(Bitmap bitmap, int i, int i2) {
            this.f19972a = bitmap;
            this.f19973b = i2;
            this.f19974c = i;
        }
    }

    /* renamed from: b */
    public int mo28951b() {
        return this.f19966b;
    }

    /* renamed from: c */
    public boolean mo28952c() {
        return this.f19969e;
    }

    /* renamed from: e */
    public boolean mo28954e() {
        if (this.f19968d || this.f19965a == null) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public void mo28948a() throws Exception {
        this.f19965a = new PdfRenderer(ParcelFileDescriptor.open(new File(this.f19967c), 268435456));
        this.f19966b = this.f19965a.getPageCount();
    }

    /* renamed from: d */
    public void mo28953d() {
        this.f19968d = true;
        if (this.f19969e) {
            C13479a.m54764b("PdfRender", "PdfRenderer close but isOpeningPage, watting openPage done to manual close");
        } else if (this.f19965a != null) {
            try {
                this.f19965a.close();
                C13479a.m54764b("PdfRender", "PdfRenderer close success");
            } catch (Throwable th) {
                this.f19965a = null;
                throw th;
            }
            this.f19965a = null;
        }
    }

    /* renamed from: a */
    public synchronized void mo28949a(int i) {
        int a = C13749l.m55736a();
        int b = C13749l.m55748b();
        if (i == 1) {
            this.f19970g = Math.min(a, b);
            this.f19971h = Math.max(a, b);
        } else {
            int max = Math.max(a, b);
            this.f19970g = max;
            this.f19971h = (max * max) / Math.min(a, b);
        }
    }

    public C7414b(String str, int i) {
        this.f19967c = str;
        mo28949a(i);
    }

    /* renamed from: a */
    private int[] m29677a(PdfRenderer.Page page, boolean z) {
        int i;
        int i2;
        C13479a.m54772d("PdfRender", "calculateWH, isPresentationMode: " + z + ", screenWidth: " + this.f19970g + ", screenHeight: " + this.f19971h);
        if (!z) {
            double width = (((double) this.f19970g) * 1.0d) / ((double) page.getWidth());
            i = (int) (((double) page.getWidth()) * width);
            i2 = (int) (((double) page.getHeight()) * width);
        } else {
            double min = Math.min((((double) this.f19970g) * 1.0d) / ((double) page.getWidth()), (((double) this.f19971h) * 1.0d) / ((double) page.getHeight()));
            i = (int) (((double) page.getWidth()) * min);
            i2 = (int) (((double) page.getHeight()) * min);
        }
        return new int[]{i, i2};
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0037, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0038, code lost:
        if (r5 != null) goto L_0x003a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x003e, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x003f, code lost:
        r6.addSuppressed(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0042, code lost:
        throw r0;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized int[] mo28950a(int r5, boolean r6) {
        /*
        // Method dump skipped, instructions count: 122
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.bear.drive.view.preview.pdf.C7414b.mo28950a(int, boolean):int[]");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0058, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0059, code lost:
        if (r5 != null) goto L_0x005b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x005f, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0060, code lost:
        r6.addSuppressed(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0063, code lost:
        throw r7;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized com.bytedance.ee.bear.drive.view.preview.pdf.C7414b.C7415a mo28947a(int r5, boolean r6, com.bumptech.glide.load.engine.p087a.AbstractC2283e r7) {
        /*
        // Method dump skipped, instructions count: 154
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.bear.drive.view.preview.pdf.C7414b.mo28947a(int, boolean, com.bumptech.glide.load.engine.a.e):com.bytedance.ee.bear.drive.view.preview.pdf.b$a");
    }

    /* renamed from: a */
    private Bitmap m29676a(int i, int i2, Bitmap.Config config, AbstractC2283e eVar) {
        Bitmap bitmap;
        if (eVar != null) {
            bitmap = eVar.mo10690a(i, i2, config);
        } else {
            bitmap = null;
        }
        if (bitmap != null) {
            return bitmap;
        }
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, config);
        C13479a.m54772d("PdfRender", "get bitmap from pool failure. create new one. bitmapSize: " + (createBitmap.getHeight() * createBitmap.getRowBytes()));
        return createBitmap;
    }
}
