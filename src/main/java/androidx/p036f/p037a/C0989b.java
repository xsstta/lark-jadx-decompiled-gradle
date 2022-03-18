package androidx.p036f.p037a;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import android.util.SparseBooleanArray;
import androidx.collection.ArrayMap;
import androidx.core.graphics.C0768a;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* renamed from: androidx.f.a.b */
public final class C0989b {

    /* renamed from: a */
    static final AbstractC0992b f3777a = new AbstractC0992b() {
        /* class androidx.p036f.p037a.C0989b.C09901 */

        /* renamed from: a */
        private boolean m4866a(float[] fArr) {
            if (fArr[2] <= 0.05f) {
                return true;
            }
            return false;
        }

        /* renamed from: b */
        private boolean m4867b(float[] fArr) {
            if (fArr[2] >= 0.95f) {
                return true;
            }
            return false;
        }

        /* renamed from: c */
        private boolean m4868c(float[] fArr) {
            if (fArr[0] < 10.0f || fArr[0] > 37.0f || fArr[1] > 0.82f) {
                return false;
            }
            return true;
        }

        @Override // androidx.p036f.p037a.C0989b.AbstractC0992b
        /* renamed from: a */
        public boolean mo5040a(int i, float[] fArr) {
            if (m4867b(fArr) || m4866a(fArr) || m4868c(fArr)) {
                return false;
            }
            return true;
        }
    };

    /* renamed from: b */
    private final List<C0993c> f3778b;

    /* renamed from: c */
    private final List<C0994c> f3779c;

    /* renamed from: d */
    private final Map<C0994c, C0993c> f3780d = new ArrayMap();

    /* renamed from: e */
    private final SparseBooleanArray f3781e = new SparseBooleanArray();

    /* renamed from: f */
    private final C0993c f3782f = m4863c();

    /* renamed from: androidx.f.a.b$b */
    public interface AbstractC0992b {
        /* renamed from: a */
        boolean mo5040a(int i, float[] fArr);
    }

    /* renamed from: androidx.f.a.b$c */
    public static final class C0993c {

        /* renamed from: a */
        private final int f3791a;

        /* renamed from: b */
        private final int f3792b;

        /* renamed from: c */
        private final int f3793c;

        /* renamed from: d */
        private final int f3794d;

        /* renamed from: e */
        private final int f3795e;

        /* renamed from: f */
        private boolean f3796f;

        /* renamed from: g */
        private int f3797g;

        /* renamed from: h */
        private int f3798h;

        /* renamed from: i */
        private float[] f3799i;

        /* renamed from: a */
        public int mo5043a() {
            return this.f3794d;
        }

        /* renamed from: c */
        public int mo5045c() {
            return this.f3795e;
        }

        /* renamed from: d */
        public int mo5046d() {
            m4875f();
            return this.f3797g;
        }

        /* renamed from: e */
        public int mo5047e() {
            m4875f();
            return this.f3798h;
        }

        public int hashCode() {
            return (this.f3794d * 31) + this.f3795e;
        }

        /* renamed from: b */
        public float[] mo5044b() {
            if (this.f3799i == null) {
                this.f3799i = new float[3];
            }
            C0768a.m3710a(this.f3791a, this.f3792b, this.f3793c, this.f3799i);
            return this.f3799i;
        }

        /* renamed from: f */
        private void m4875f() {
            int i;
            int i2;
            if (!this.f3796f) {
                int a = C0768a.m3707a(-1, this.f3794d, 4.5f);
                int a2 = C0768a.m3707a(-1, this.f3794d, 3.0f);
                if (a == -1 || a2 == -1) {
                    int a3 = C0768a.m3707a(-16777216, this.f3794d, 4.5f);
                    int a4 = C0768a.m3707a(-16777216, this.f3794d, 3.0f);
                    if (a3 == -1 || a4 == -1) {
                        if (a != -1) {
                            i = C0768a.m3716c(-1, a);
                        } else {
                            i = C0768a.m3716c(-16777216, a3);
                        }
                        this.f3798h = i;
                        if (a2 != -1) {
                            i2 = C0768a.m3716c(-1, a2);
                        } else {
                            i2 = C0768a.m3716c(-16777216, a4);
                        }
                        this.f3797g = i2;
                        this.f3796f = true;
                        return;
                    }
                    this.f3798h = C0768a.m3716c(-16777216, a3);
                    this.f3797g = C0768a.m3716c(-16777216, a4);
                    this.f3796f = true;
                    return;
                }
                this.f3798h = C0768a.m3716c(-1, a);
                this.f3797g = C0768a.m3716c(-1, a2);
                this.f3796f = true;
            }
        }

        public String toString() {
            return getClass().getSimpleName() + " [RGB: #" + Integer.toHexString(mo5043a()) + ']' + " [HSL: " + Arrays.toString(mo5044b()) + ']' + " [Population: " + this.f3795e + ']' + " [Title Text: #" + Integer.toHexString(mo5046d()) + ']' + " [Body Text: #" + Integer.toHexString(mo5047e()) + ']';
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C0993c cVar = (C0993c) obj;
            if (this.f3795e == cVar.f3795e && this.f3794d == cVar.f3794d) {
                return true;
            }
            return false;
        }

        public C0993c(int i, int i2) {
            this.f3791a = Color.red(i);
            this.f3792b = Color.green(i);
            this.f3793c = Color.blue(i);
            this.f3794d = i;
            this.f3795e = i2;
        }
    }

    /* renamed from: a */
    public C0993c mo5038a() {
        return this.f3782f;
    }

    /* renamed from: c */
    private C0993c m4863c() {
        int size = this.f3778b.size();
        int i = Integer.MIN_VALUE;
        C0993c cVar = null;
        for (int i2 = 0; i2 < size; i2++) {
            C0993c cVar2 = this.f3778b.get(i2);
            if (cVar2.mo5045c() > i) {
                i = cVar2.mo5045c();
                cVar = cVar2;
            }
        }
        return cVar;
    }

    /* renamed from: androidx.f.a.b$a */
    public static final class C0991a {

        /* renamed from: a */
        private final List<C0993c> f3783a;

        /* renamed from: b */
        private final Bitmap f3784b;

        /* renamed from: c */
        private final List<C0994c> f3785c;

        /* renamed from: d */
        private int f3786d = 16;

        /* renamed from: e */
        private int f3787e = 12544;

        /* renamed from: f */
        private int f3788f = -1;

        /* renamed from: g */
        private final List<AbstractC0992b> f3789g;

        /* renamed from: h */
        private Rect f3790h;

        /* renamed from: a */
        public C0989b mo5042a() {
            List<C0993c> list;
            AbstractC0992b[] bVarArr;
            Bitmap bitmap = this.f3784b;
            if (bitmap != null) {
                Bitmap b = m4871b(bitmap);
                Rect rect = this.f3790h;
                if (!(b == this.f3784b || rect == null)) {
                    double width = ((double) b.getWidth()) / ((double) this.f3784b.getWidth());
                    rect.left = (int) Math.floor(((double) rect.left) * width);
                    rect.top = (int) Math.floor(((double) rect.top) * width);
                    rect.right = Math.min((int) Math.ceil(((double) rect.right) * width), b.getWidth());
                    rect.bottom = Math.min((int) Math.ceil(((double) rect.bottom) * width), b.getHeight());
                }
                int[] a = m4870a(b);
                int i = this.f3786d;
                if (this.f3789g.isEmpty()) {
                    bVarArr = null;
                } else {
                    List<AbstractC0992b> list2 = this.f3789g;
                    bVarArr = (AbstractC0992b[]) list2.toArray(new AbstractC0992b[list2.size()]);
                }
                C0986a aVar = new C0986a(a, i, bVarArr);
                if (b != this.f3784b) {
                    b.recycle();
                }
                list = aVar.mo5027a();
            } else {
                list = this.f3783a;
                if (list == null) {
                    throw new AssertionError();
                }
            }
            C0989b bVar = new C0989b(list, this.f3785c);
            bVar.mo5039b();
            return bVar;
        }

        /* renamed from: a */
        public C0991a mo5041a(int i) {
            this.f3787e = i;
            this.f3788f = -1;
            return this;
        }

        public C0991a(Bitmap bitmap) {
            ArrayList arrayList = new ArrayList();
            this.f3785c = arrayList;
            ArrayList arrayList2 = new ArrayList();
            this.f3789g = arrayList2;
            if (bitmap == null || bitmap.isRecycled()) {
                throw new IllegalArgumentException("Bitmap is not valid");
            }
            arrayList2.add(C0989b.f3777a);
            this.f3784b = bitmap;
            this.f3783a = null;
            arrayList.add(C0994c.f3800a);
            arrayList.add(C0994c.f3801b);
            arrayList.add(C0994c.f3802c);
            arrayList.add(C0994c.f3803d);
            arrayList.add(C0994c.f3804e);
            arrayList.add(C0994c.f3805f);
        }

        /* renamed from: a */
        private int[] m4870a(Bitmap bitmap) {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            int[] iArr = new int[(width * height)];
            bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
            Rect rect = this.f3790h;
            if (rect == null) {
                return iArr;
            }
            int width2 = rect.width();
            int height2 = this.f3790h.height();
            int[] iArr2 = new int[(width2 * height2)];
            for (int i = 0; i < height2; i++) {
                System.arraycopy(iArr, ((this.f3790h.top + i) * width) + this.f3790h.left, iArr2, i * width2, width2);
            }
            return iArr2;
        }

        /* renamed from: b */
        private Bitmap m4871b(Bitmap bitmap) {
            int max;
            int i;
            double d = -1.0d;
            if (this.f3787e > 0) {
                int width = bitmap.getWidth() * bitmap.getHeight();
                int i2 = this.f3787e;
                if (width > i2) {
                    d = Math.sqrt(((double) i2) / ((double) width));
                }
            } else if (this.f3788f > 0 && (max = Math.max(bitmap.getWidth(), bitmap.getHeight())) > (i = this.f3788f)) {
                d = ((double) i) / ((double) max);
            }
            if (d <= 0.0d) {
                return bitmap;
            }
            return Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(((double) bitmap.getWidth()) * d), (int) Math.ceil(((double) bitmap.getHeight()) * d), false);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo5039b() {
        int size = this.f3779c.size();
        for (int i = 0; i < size; i++) {
            C0994c cVar = this.f3779c.get(i);
            cVar.mo5061k();
            this.f3780d.put(cVar, m4859a(cVar));
        }
        this.f3781e.clear();
    }

    /* renamed from: a */
    public static C0991a m4858a(Bitmap bitmap) {
        return new C0991a(bitmap);
    }

    /* renamed from: a */
    private C0993c m4859a(C0994c cVar) {
        C0993c b = m4862b(cVar);
        if (b != null && cVar.mo5060j()) {
            this.f3781e.append(b.mo5043a(), true);
        }
        return b;
    }

    /* renamed from: b */
    private C0993c m4862b(C0994c cVar) {
        int size = this.f3778b.size();
        float f = BitmapDescriptorFactory.HUE_RED;
        C0993c cVar2 = null;
        for (int i = 0; i < size; i++) {
            C0993c cVar3 = this.f3778b.get(i);
            if (m4860a(cVar3, cVar)) {
                float b = m4861b(cVar3, cVar);
                if (cVar2 == null || b > f) {
                    cVar2 = cVar3;
                    f = b;
                }
            }
        }
        return cVar2;
    }

    C0989b(List<C0993c> list, List<C0994c> list2) {
        this.f3778b = list;
        this.f3779c = list2;
    }

    /* renamed from: a */
    private boolean m4860a(C0993c cVar, C0994c cVar2) {
        float[] b = cVar.mo5044b();
        if (b[1] < cVar2.mo5051a() || b[1] > cVar2.mo5053c() || b[2] < cVar2.mo5054d() || b[2] > cVar2.mo5056f() || this.f3781e.get(cVar.mo5043a())) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    private float m4861b(C0993c cVar, C0994c cVar2) {
        int i;
        float f;
        float f2;
        float[] b = cVar.mo5044b();
        C0993c cVar3 = this.f3782f;
        if (cVar3 != null) {
            i = cVar3.mo5045c();
        } else {
            i = 1;
        }
        float g = cVar2.mo5057g();
        float f3 = BitmapDescriptorFactory.HUE_RED;
        if (g > BitmapDescriptorFactory.HUE_RED) {
            f = cVar2.mo5057g() * (1.0f - Math.abs(b[1] - cVar2.mo5052b()));
        } else {
            f = BitmapDescriptorFactory.HUE_RED;
        }
        if (cVar2.mo5058h() > BitmapDescriptorFactory.HUE_RED) {
            f2 = cVar2.mo5058h() * (1.0f - Math.abs(b[2] - cVar2.mo5055e()));
        } else {
            f2 = BitmapDescriptorFactory.HUE_RED;
        }
        if (cVar2.mo5059i() > BitmapDescriptorFactory.HUE_RED) {
            f3 = cVar2.mo5059i() * (((float) cVar.mo5045c()) / ((float) i));
        }
        return f + f2 + f3;
    }
}
