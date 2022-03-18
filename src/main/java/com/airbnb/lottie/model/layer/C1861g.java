package com.airbnb.lottie.model.layer;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Typeface;
import androidx.collection.C0516c;
import com.airbnb.lottie.AbstractC1810j;
import com.airbnb.lottie.C1792d;
import com.airbnb.lottie.C1868o;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.C1833b;
import com.airbnb.lottie.model.C1834c;
import com.airbnb.lottie.model.DocumentData;
import com.airbnb.lottie.model.content.C1845j;
import com.airbnb.lottie.model.p073a.C1829k;
import com.airbnb.lottie.p067a.p068a.C1740d;
import com.airbnb.lottie.p067a.p069b.AbstractC1758a;
import com.airbnb.lottie.p067a.p069b.C1777n;
import com.airbnb.lottie.p067a.p069b.C1779p;
import com.airbnb.lottie.p071c.C1791h;
import com.airbnb.lottie.p072d.C1795c;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.airbnb.lottie.model.layer.g */
public class C1861g extends AbstractC1852a {

    /* renamed from: f */
    private final StringBuilder f6448f = new StringBuilder(2);

    /* renamed from: g */
    private final RectF f6449g = new RectF();

    /* renamed from: h */
    private final Matrix f6450h = new Matrix();

    /* renamed from: i */
    private final Paint f6451i = new Paint(1) {
        /* class com.airbnb.lottie.model.layer.C1861g.C18621 */

        {
            setStyle(Paint.Style.FILL);
        }
    };

    /* renamed from: j */
    private final Paint f6452j = new Paint(1) {
        /* class com.airbnb.lottie.model.layer.C1861g.C18632 */

        {
            setStyle(Paint.Style.STROKE);
        }
    };

    /* renamed from: k */
    private final Map<C1834c, List<C1740d>> f6453k = new HashMap();

    /* renamed from: l */
    private final C0516c<String> f6454l = new C0516c<>();

    /* renamed from: m */
    private final C1777n f6455m;

    /* renamed from: n */
    private final LottieDrawable f6456n;

    /* renamed from: o */
    private final C1792d f6457o;

    /* renamed from: p */
    private AbstractC1758a<Integer, Integer> f6458p;

    /* renamed from: q */
    private AbstractC1758a<Integer, Integer> f6459q;

    /* renamed from: r */
    private AbstractC1758a<Integer, Integer> f6460r;

    /* renamed from: s */
    private AbstractC1758a<Integer, Integer> f6461s;

    /* renamed from: t */
    private AbstractC1758a<Float, Float> f6462t;

    /* renamed from: u */
    private AbstractC1758a<Float, Float> f6463u;

    /* renamed from: v */
    private AbstractC1758a<Float, Float> f6464v;

    /* renamed from: w */
    private AbstractC1758a<Float, Float> f6465w;

    /* renamed from: x */
    private AbstractC1758a<Float, Float> f6466x;

    /* renamed from: y */
    private AbstractC1758a<Float, Float> f6467y;

    @Override // com.airbnb.lottie.model.layer.AbstractC1852a, com.airbnb.lottie.p067a.p068a.AbstractC1741e
    /* renamed from: a */
    public void mo8933a(RectF rectF, Matrix matrix, boolean z) {
        super.mo8933a(rectF, matrix, z);
        rectF.set(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (float) this.f6457o.mo9062d().width(), (float) this.f6457o.mo9062d().height());
    }

    /* renamed from: a */
    private void m8384a(String str, DocumentData documentData, Matrix matrix, C1833b bVar, Canvas canvas, float f, float f2) {
        float floatValue;
        for (int i = 0; i < str.length(); i++) {
            C1834c a = this.f6457o.mo9068j().mo3047a(C1834c.m8173a(str.charAt(i), bVar.mo9151a(), bVar.mo9153c()));
            if (a != null) {
                m8380a(a, matrix, f2, documentData, canvas);
                float b = ((float) a.mo9155b()) * f2 * C1791h.m8011a() * f;
                float f3 = ((float) documentData.f6242e) / 10.0f;
                AbstractC1758a<Float, Float> aVar = this.f6465w;
                if (aVar != null) {
                    floatValue = aVar.mo8960g().floatValue();
                } else {
                    AbstractC1758a<Float, Float> aVar2 = this.f6464v;
                    if (aVar2 != null) {
                        floatValue = aVar2.mo8960g().floatValue();
                    }
                    canvas.translate(b + (f3 * f), BitmapDescriptorFactory.HUE_RED);
                }
                f3 += floatValue;
                canvas.translate(b + (f3 * f), BitmapDescriptorFactory.HUE_RED);
            }
        }
    }

    /* renamed from: a */
    private void m8379a(DocumentData documentData, C1833b bVar, Matrix matrix, Canvas canvas) {
        float f;
        float a = C1791h.m8013a(matrix);
        Typeface a2 = this.f6456n.mo8850a(bVar.mo9151a(), bVar.mo9153c());
        if (a2 != null) {
            String str = documentData.f6238a;
            C1868o x = this.f6456n.mo8923x();
            if (x != null) {
                str = x.mo9312a(str);
            }
            this.f6451i.setTypeface(a2);
            AbstractC1758a<Float, Float> aVar = this.f6467y;
            if (aVar != null) {
                f = aVar.mo8960g().floatValue();
            } else {
                AbstractC1758a<Float, Float> aVar2 = this.f6466x;
                if (aVar2 != null) {
                    f = aVar2.mo8960g().floatValue();
                } else {
                    f = documentData.f6240c;
                }
            }
            this.f6451i.setTextSize(f * C1791h.m8011a());
            this.f6452j.setTypeface(this.f6451i.getTypeface());
            this.f6452j.setTextSize(this.f6451i.getTextSize());
            float a3 = documentData.f6243f * C1791h.m8011a();
            List<String> a4 = m8375a(str);
            int size = a4.size();
            for (int i = 0; i < size; i++) {
                String str2 = a4.get(i);
                m8377a(documentData.f6241d, canvas, this.f6452j.measureText(str2));
                canvas.translate(BitmapDescriptorFactory.HUE_RED, (((float) i) * a3) - ((((float) (size - 1)) * a3) / 2.0f));
                m8383a(str2, documentData, canvas, a);
                canvas.setMatrix(matrix);
            }
        }
    }

    /* renamed from: a */
    private void m8383a(String str, DocumentData documentData, Canvas canvas, float f) {
        float floatValue;
        int i = 0;
        while (i < str.length()) {
            String a = m8373a(str, i);
            i += a.length();
            m8382a(a, documentData, canvas);
            float measureText = this.f6451i.measureText(a, 0, 1);
            float f2 = ((float) documentData.f6242e) / 10.0f;
            AbstractC1758a<Float, Float> aVar = this.f6465w;
            if (aVar != null) {
                floatValue = aVar.mo8960g().floatValue();
            } else {
                AbstractC1758a<Float, Float> aVar2 = this.f6464v;
                if (aVar2 != null) {
                    floatValue = aVar2.mo8960g().floatValue();
                } else {
                    canvas.translate(measureText + (f2 * f), BitmapDescriptorFactory.HUE_RED);
                }
            }
            f2 += floatValue;
            canvas.translate(measureText + (f2 * f), BitmapDescriptorFactory.HUE_RED);
        }
    }

    /* renamed from: a */
    private void m8380a(C1834c cVar, Matrix matrix, float f, DocumentData documentData, Canvas canvas) {
        List<C1740d> a = m8374a(cVar);
        for (int i = 0; i < a.size(); i++) {
            Path e = a.get(i).mo8942e();
            e.computeBounds(this.f6449g, false);
            this.f6450h.set(matrix);
            this.f6450h.preTranslate(BitmapDescriptorFactory.HUE_RED, (-documentData.f6244g) * C1791h.m8011a());
            this.f6450h.preScale(f, f);
            e.transform(this.f6450h);
            if (documentData.f6248k) {
                m8376a(e, this.f6451i, canvas);
                m8376a(e, this.f6452j, canvas);
            } else {
                m8376a(e, this.f6452j, canvas);
                m8376a(e, this.f6451i, canvas);
            }
        }
    }

    /* renamed from: a */
    private void m8382a(String str, DocumentData documentData, Canvas canvas) {
        if (documentData.f6248k) {
            m8381a(str, this.f6451i, canvas);
            m8381a(str, this.f6452j, canvas);
            return;
        }
        m8381a(str, this.f6452j, canvas);
        m8381a(str, this.f6451i, canvas);
    }

    /* renamed from: a */
    private void m8381a(String str, Paint paint, Canvas canvas) {
        if (paint.getColor() != 0) {
            if (paint.getStyle() != Paint.Style.STROKE || paint.getStrokeWidth() != BitmapDescriptorFactory.HUE_RED) {
                canvas.drawText(str, 0, str.length(), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, paint);
            }
        }
    }

    /* renamed from: a */
    private boolean m8385a(int i) {
        return Character.getType(i) == 16 || Character.getType(i) == 27 || Character.getType(i) == 6 || Character.getType(i) == 28 || Character.getType(i) == 19;
    }

    @Override // com.airbnb.lottie.model.AbstractC1848e, com.airbnb.lottie.model.layer.AbstractC1852a
    /* renamed from: a */
    public <T> void mo8935a(T t, C1795c<T> cVar) {
        super.mo8935a(t, cVar);
        if (t == AbstractC1810j.f6198a) {
            AbstractC1758a<Integer, Integer> aVar = this.f6459q;
            if (aVar != null) {
                mo9298b(aVar);
            }
            if (cVar == null) {
                this.f6459q = null;
                return;
            }
            C1779p pVar = new C1779p(cVar);
            this.f6459q = pVar;
            pVar.mo8953a(this);
            mo9294a(this.f6459q);
        } else if (t == AbstractC1810j.f6199b) {
            AbstractC1758a<Integer, Integer> aVar2 = this.f6461s;
            if (aVar2 != null) {
                mo9298b(aVar2);
            }
            if (cVar == null) {
                this.f6461s = null;
                return;
            }
            C1779p pVar2 = new C1779p(cVar);
            this.f6461s = pVar2;
            pVar2.mo8953a(this);
            mo9294a(this.f6461s);
        } else if (t == AbstractC1810j.f6212o) {
            AbstractC1758a<Float, Float> aVar3 = this.f6463u;
            if (aVar3 != null) {
                mo9298b(aVar3);
            }
            if (cVar == null) {
                this.f6463u = null;
                return;
            }
            C1779p pVar3 = new C1779p(cVar);
            this.f6463u = pVar3;
            pVar3.mo8953a(this);
            mo9294a(this.f6463u);
        } else if (t == AbstractC1810j.f6213p) {
            AbstractC1758a<Float, Float> aVar4 = this.f6465w;
            if (aVar4 != null) {
                mo9298b(aVar4);
            }
            if (cVar == null) {
                this.f6465w = null;
                return;
            }
            C1779p pVar4 = new C1779p(cVar);
            this.f6465w = pVar4;
            pVar4.mo8953a(this);
            mo9294a(this.f6465w);
        } else if (t == AbstractC1810j.f6195B) {
            AbstractC1758a<Float, Float> aVar5 = this.f6467y;
            if (aVar5 != null) {
                mo9298b(aVar5);
            }
            if (cVar == null) {
                this.f6467y = null;
                return;
            }
            C1779p pVar5 = new C1779p(cVar);
            this.f6467y = pVar5;
            pVar5.mo8953a(this);
            mo9294a(this.f6467y);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.airbnb.lottie.model.layer.g$3 */
    public static /* synthetic */ class C18643 {

        /* renamed from: a */
        static final /* synthetic */ int[] f6470a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.airbnb.lottie.model.DocumentData$Justification[] r0 = com.airbnb.lottie.model.DocumentData.Justification.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.airbnb.lottie.model.layer.C1861g.C18643.f6470a = r0
                com.airbnb.lottie.model.DocumentData$Justification r1 = com.airbnb.lottie.model.DocumentData.Justification.LEFT_ALIGN     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.airbnb.lottie.model.layer.C1861g.C18643.f6470a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.airbnb.lottie.model.DocumentData$Justification r1 = com.airbnb.lottie.model.DocumentData.Justification.RIGHT_ALIGN     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.airbnb.lottie.model.layer.C1861g.C18643.f6470a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.airbnb.lottie.model.DocumentData$Justification r1 = com.airbnb.lottie.model.DocumentData.Justification.CENTER     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.model.layer.C1861g.C18643.<clinit>():void");
        }
    }

    /* renamed from: a */
    private List<String> m8375a(String str) {
        return Arrays.asList(str.replaceAll("\r\n", "\r").replaceAll("\n", "\r").split("\r"));
    }

    /* renamed from: a */
    private List<C1740d> m8374a(C1834c cVar) {
        if (this.f6453k.containsKey(cVar)) {
            return this.f6453k.get(cVar);
        }
        List<C1845j> a = cVar.mo9154a();
        int size = a.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            arrayList.add(new C1740d(this.f6456n, this, a.get(i)));
        }
        this.f6453k.put(cVar, arrayList);
        return arrayList;
    }

    /* renamed from: a */
    private String m8373a(String str, int i) {
        int codePointAt = str.codePointAt(i);
        int charCount = Character.charCount(codePointAt) + i;
        while (charCount < str.length()) {
            int codePointAt2 = str.codePointAt(charCount);
            if (!m8385a(codePointAt2)) {
                break;
            }
            charCount += Character.charCount(codePointAt2);
            codePointAt = (codePointAt * 31) + codePointAt2;
        }
        long j = (long) codePointAt;
        if (this.f6454l.mo2972d(j)) {
            return this.f6454l.mo2959a(j);
        }
        this.f6448f.setLength(0);
        while (i < charCount) {
            int codePointAt3 = str.codePointAt(i);
            this.f6448f.appendCodePoint(codePointAt3);
            i += Character.charCount(codePointAt3);
        }
        String sb = this.f6448f.toString();
        this.f6454l.mo2965b(j, sb);
        return sb;
    }

    C1861g(LottieDrawable lottieDrawable, Layer layer) {
        super(lottieDrawable, layer);
        this.f6456n = lottieDrawable;
        this.f6457o = layer.mo9269a();
        C1777n d = layer.mo9288s().mo9135a();
        this.f6455m = d;
        d.mo8953a(this);
        mo9294a(d);
        C1829k t = layer.mo9289t();
        if (!(t == null || t.f6255a == null)) {
            AbstractC1758a<Integer, Integer> a = t.f6255a.mo9135a();
            this.f6458p = a;
            a.mo8953a(this);
            mo9294a(this.f6458p);
        }
        if (!(t == null || t.f6256b == null)) {
            AbstractC1758a<Integer, Integer> a2 = t.f6256b.mo9135a();
            this.f6460r = a2;
            a2.mo8953a(this);
            mo9294a(this.f6460r);
        }
        if (!(t == null || t.f6257c == null)) {
            AbstractC1758a<Float, Float> a3 = t.f6257c.mo9135a();
            this.f6462t = a3;
            a3.mo8953a(this);
            mo9294a(this.f6462t);
        }
        if (t != null && t.f6258d != null) {
            AbstractC1758a<Float, Float> a4 = t.f6258d.mo9135a();
            this.f6464v = a4;
            a4.mo8953a(this);
            mo9294a(this.f6464v);
        }
    }

    /* access modifiers changed from: package-private */
    @Override // com.airbnb.lottie.model.layer.AbstractC1852a
    /* renamed from: b */
    public void mo9297b(Canvas canvas, Matrix matrix, int i) {
        int i2;
        canvas.save();
        if (!this.f6456n.mo8924y()) {
            canvas.setMatrix(matrix);
        }
        DocumentData documentData = (DocumentData) this.f6455m.mo8960g();
        C1833b bVar = this.f6457o.mo9069k().get(documentData.f6239b);
        if (bVar == null) {
            canvas.restore();
            return;
        }
        AbstractC1758a<Integer, Integer> aVar = this.f6459q;
        if (aVar != null) {
            this.f6451i.setColor(aVar.mo8960g().intValue());
        } else {
            AbstractC1758a<Integer, Integer> aVar2 = this.f6458p;
            if (aVar2 != null) {
                this.f6451i.setColor(aVar2.mo8960g().intValue());
            } else {
                this.f6451i.setColor(documentData.f6245h);
            }
        }
        AbstractC1758a<Integer, Integer> aVar3 = this.f6461s;
        if (aVar3 != null) {
            this.f6452j.setColor(aVar3.mo8960g().intValue());
        } else {
            AbstractC1758a<Integer, Integer> aVar4 = this.f6460r;
            if (aVar4 != null) {
                this.f6452j.setColor(aVar4.mo8960g().intValue());
            } else {
                this.f6452j.setColor(documentData.f6246i);
            }
        }
        if (this.f6407e.mo8987a() == null) {
            i2 = 100;
        } else {
            i2 = this.f6407e.mo8987a().mo8960g().intValue();
        }
        int i3 = (i2 * 255) / 100;
        this.f6451i.setAlpha(i3);
        this.f6452j.setAlpha(i3);
        AbstractC1758a<Float, Float> aVar5 = this.f6463u;
        if (aVar5 != null) {
            this.f6452j.setStrokeWidth(aVar5.mo8960g().floatValue());
        } else {
            AbstractC1758a<Float, Float> aVar6 = this.f6462t;
            if (aVar6 != null) {
                this.f6452j.setStrokeWidth(aVar6.mo8960g().floatValue());
            } else {
                this.f6452j.setStrokeWidth(documentData.f6247j * C1791h.m8011a() * C1791h.m8013a(matrix));
            }
        }
        if (this.f6456n.mo8924y()) {
            m8378a(documentData, matrix, bVar, canvas);
        } else {
            m8379a(documentData, bVar, matrix, canvas);
        }
        canvas.restore();
    }

    /* renamed from: a */
    private void m8376a(Path path, Paint paint, Canvas canvas) {
        if (paint.getColor() != 0) {
            if (paint.getStyle() != Paint.Style.STROKE || paint.getStrokeWidth() != BitmapDescriptorFactory.HUE_RED) {
                canvas.drawPath(path, paint);
            }
        }
    }

    /* renamed from: a */
    private void m8377a(DocumentData.Justification justification, Canvas canvas, float f) {
        int i = C18643.f6470a[justification.ordinal()];
        if (i == 2) {
            canvas.translate(-f, BitmapDescriptorFactory.HUE_RED);
        } else if (i == 3) {
            canvas.translate((-f) / 2.0f, BitmapDescriptorFactory.HUE_RED);
        }
    }

    /* renamed from: a */
    private float m8372a(String str, C1833b bVar, float f, float f2) {
        float f3 = BitmapDescriptorFactory.HUE_RED;
        for (int i = 0; i < str.length(); i++) {
            C1834c a = this.f6457o.mo9068j().mo3047a(C1834c.m8173a(str.charAt(i), bVar.mo9151a(), bVar.mo9153c()));
            if (a != null) {
                f3 = (float) (((double) f3) + (a.mo9155b() * ((double) f) * ((double) C1791h.m8011a()) * ((double) f2)));
            }
        }
        return f3;
    }

    /* renamed from: a */
    private void m8378a(DocumentData documentData, Matrix matrix, C1833b bVar, Canvas canvas) {
        float f;
        AbstractC1758a<Float, Float> aVar = this.f6467y;
        if (aVar != null) {
            f = aVar.mo8960g().floatValue();
        } else {
            AbstractC1758a<Float, Float> aVar2 = this.f6466x;
            if (aVar2 != null) {
                f = aVar2.mo8960g().floatValue();
            } else {
                f = documentData.f6240c;
            }
        }
        float f2 = f / 100.0f;
        float a = C1791h.m8013a(matrix);
        String str = documentData.f6238a;
        float a2 = documentData.f6243f * C1791h.m8011a();
        List<String> a3 = m8375a(str);
        int size = a3.size();
        for (int i = 0; i < size; i++) {
            String str2 = a3.get(i);
            float a4 = m8372a(str2, bVar, f2, a);
            canvas.save();
            m8377a(documentData.f6241d, canvas, a4);
            canvas.translate(BitmapDescriptorFactory.HUE_RED, (((float) i) * a2) - ((((float) (size - 1)) * a2) / 2.0f));
            m8384a(str2, documentData, matrix, bVar, canvas, a, f2);
            canvas.restore();
        }
    }
}
