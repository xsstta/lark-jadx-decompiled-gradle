package net.lucode.hackware.magicindicator;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;

/* renamed from: net.lucode.hackware.magicindicator.b */
public class C69615b {

    /* renamed from: a */
    private SparseBooleanArray f174021a = new SparseBooleanArray();

    /* renamed from: b */
    private SparseArray<Float> f174022b = new SparseArray<>();

    /* renamed from: c */
    private int f174023c;

    /* renamed from: d */
    private int f174024d;

    /* renamed from: e */
    private int f174025e;

    /* renamed from: f */
    private float f174026f;

    /* renamed from: g */
    private int f174027g;

    /* renamed from: h */
    private boolean f174028h;

    /* renamed from: i */
    private AbstractC69616a f174029i;

    /* renamed from: net.lucode.hackware.magicindicator.b$a */
    public interface AbstractC69616a {
        /* renamed from: a */
        void mo137866a(int i, int i2);

        /* renamed from: a */
        void mo137867a(int i, int i2, float f, boolean z);

        /* renamed from: b */
        void mo137869b(int i, int i2);

        /* renamed from: b */
        void mo137870b(int i, int i2, float f, boolean z);
    }

    /* renamed from: a */
    public int mo243184a() {
        return this.f174023c;
    }

    /* renamed from: b */
    public int mo243189b() {
        return this.f174024d;
    }

    /* renamed from: c */
    public int mo243191c() {
        return this.f174027g;
    }

    /* renamed from: a */
    public void mo243187a(AbstractC69616a aVar) {
        this.f174029i = aVar;
    }

    /* renamed from: b */
    public void mo243190b(int i) {
        this.f174027g = i;
    }

    /* renamed from: d */
    private void m267401d(int i) {
        AbstractC69616a aVar = this.f174029i;
        if (aVar != null) {
            aVar.mo137866a(i, this.f174023c);
        }
        this.f174021a.put(i, false);
    }

    /* renamed from: e */
    private void m267402e(int i) {
        AbstractC69616a aVar = this.f174029i;
        if (aVar != null) {
            aVar.mo137869b(i, this.f174023c);
        }
        this.f174021a.put(i, true);
    }

    /* renamed from: a */
    public void mo243188a(boolean z) {
        this.f174028h = z;
    }

    /* renamed from: c */
    public void mo243192c(int i) {
        this.f174023c = i;
        this.f174021a.clear();
        this.f174022b.clear();
    }

    /* renamed from: a */
    public void mo243185a(int i) {
        this.f174025e = this.f174024d;
        this.f174024d = i;
        m267401d(i);
        for (int i2 = 0; i2 < this.f174023c; i2++) {
            if (i2 != this.f174024d && !this.f174021a.get(i2)) {
                m267402e(i2);
            }
        }
    }

    /* renamed from: a */
    public void mo243186a(int i, float f, int i2) {
        boolean z;
        boolean z2;
        float f2 = ((float) i) + f;
        float f3 = this.f174026f;
        if (f3 <= f2) {
            z = true;
        } else {
            z = false;
        }
        if (this.f174027g == 0) {
            for (int i3 = 0; i3 < this.f174023c; i3++) {
                if (i3 != this.f174024d) {
                    if (!this.f174021a.get(i3)) {
                        m267402e(i3);
                    }
                    if (this.f174022b.get(i3, Float.valueOf((float) BitmapDescriptorFactory.HUE_RED)).floatValue() != 1.0f) {
                        m267400b(i3, 1.0f, false, true);
                    }
                }
            }
            m267399a(this.f174024d, 1.0f, false, true);
            m267401d(this.f174024d);
        } else if (f2 != f3) {
            int i4 = i + 1;
            if (f != BitmapDescriptorFactory.HUE_RED || !z) {
                z2 = true;
            } else {
                i4 = i - 1;
                z2 = false;
            }
            for (int i5 = 0; i5 < this.f174023c; i5++) {
                if (!(i5 == i || i5 == i4 || this.f174022b.get(i5, Float.valueOf((float) BitmapDescriptorFactory.HUE_RED)).floatValue() == 1.0f)) {
                    m267400b(i5, 1.0f, z, true);
                }
            }
            if (!z2) {
                float f4 = 1.0f - f;
                m267400b(i4, f4, true, false);
                m267399a(i, f4, true, false);
            } else if (z) {
                m267400b(i, f, true, false);
                m267399a(i4, f, true, false);
            } else {
                float f5 = 1.0f - f;
                m267400b(i4, f5, false, false);
                m267399a(i, f5, false, false);
            }
        } else {
            return;
        }
        this.f174026f = f2;
    }

    /* renamed from: a */
    private void m267399a(int i, float f, boolean z, boolean z2) {
        if (this.f174028h || i == this.f174024d || this.f174027g == 1 || z2) {
            AbstractC69616a aVar = this.f174029i;
            if (aVar != null) {
                aVar.mo137867a(i, this.f174023c, f, z);
            }
            this.f174022b.put(i, Float.valueOf(1.0f - f));
        }
    }

    /* renamed from: b */
    private void m267400b(int i, float f, boolean z, boolean z2) {
        if (!(this.f174028h || i == this.f174025e || this.f174027g == 1)) {
            int i2 = this.f174024d;
            if ((!(i == i2 - 1 || i == i2 + 1) || this.f174022b.get(i, Float.valueOf((float) BitmapDescriptorFactory.HUE_RED)).floatValue() == 1.0f) && !z2) {
                return;
            }
        }
        AbstractC69616a aVar = this.f174029i;
        if (aVar != null) {
            aVar.mo137870b(i, this.f174023c, f, z);
        }
        this.f174022b.put(i, Float.valueOf(f));
    }
}
