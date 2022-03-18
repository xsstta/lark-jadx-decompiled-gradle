package com.airbnb.lottie;

import android.graphics.Rect;
import androidx.collection.C0516c;
import androidx.collection.C0525g;
import com.airbnb.lottie.model.C1833b;
import com.airbnb.lottie.model.C1834c;
import com.airbnb.lottie.model.C1850g;
import com.airbnb.lottie.model.layer.Layer;
import com.airbnb.lottie.p071c.C1787d;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* renamed from: com.airbnb.lottie.d */
public class C1792d {

    /* renamed from: a */
    private final C1815m f6132a = new C1815m();

    /* renamed from: b */
    private final HashSet<String> f6133b = new HashSet<>();

    /* renamed from: c */
    private Map<String, List<Layer>> f6134c;

    /* renamed from: d */
    private Map<String, C1806f> f6135d;

    /* renamed from: e */
    private Map<String, C1833b> f6136e;

    /* renamed from: f */
    private List<C1850g> f6137f;

    /* renamed from: g */
    private C0525g<C1834c> f6138g;

    /* renamed from: h */
    private C0516c<Layer> f6139h;

    /* renamed from: i */
    private List<Layer> f6140i;

    /* renamed from: j */
    private Rect f6141j;

    /* renamed from: k */
    private float f6142k;

    /* renamed from: l */
    private float f6143l;

    /* renamed from: m */
    private float f6144m;

    /* renamed from: n */
    private boolean f6145n;

    /* renamed from: o */
    private int f6146o = 0;

    /* renamed from: b */
    public int mo9057b() {
        return this.f6146o;
    }

    /* renamed from: c */
    public C1815m mo9060c() {
        return this.f6132a;
    }

    /* renamed from: d */
    public Rect mo9062d() {
        return this.f6141j;
    }

    /* renamed from: f */
    public float mo9064f() {
        return this.f6142k;
    }

    /* renamed from: g */
    public float mo9065g() {
        return this.f6143l;
    }

    /* renamed from: h */
    public float mo9066h() {
        return this.f6144m;
    }

    /* renamed from: i */
    public List<Layer> mo9067i() {
        return this.f6140i;
    }

    /* renamed from: j */
    public C0525g<C1834c> mo9068j() {
        return this.f6138g;
    }

    /* renamed from: k */
    public Map<String, C1833b> mo9069k() {
        return this.f6136e;
    }

    /* renamed from: l */
    public Map<String, C1806f> mo9070l() {
        return this.f6135d;
    }

    /* renamed from: m */
    public float mo9071m() {
        return this.f6143l - this.f6142k;
    }

    /* renamed from: e */
    public float mo9063e() {
        return (float) ((long) ((mo9071m() / this.f6144m) * 1000.0f));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("LottieComposition:\n");
        for (Layer layer : this.f6140i) {
            sb.append(layer.mo9270a("\t"));
        }
        return sb.toString();
    }

    /* renamed from: a */
    public boolean mo9056a() {
        return this.f6145n;
    }

    /* renamed from: a */
    public void mo9055a(boolean z) {
        this.f6145n = z;
    }

    /* renamed from: a */
    public void mo9052a(int i) {
        this.f6146o += i;
    }

    /* renamed from: b */
    public void mo9059b(boolean z) {
        this.f6132a.mo9124a(z);
    }

    /* renamed from: a */
    public Layer mo9051a(long j) {
        return this.f6139h.mo2959a(j);
    }

    /* renamed from: b */
    public List<Layer> mo9058b(String str) {
        return this.f6134c.get(str);
    }

    /* renamed from: a */
    public void mo9054a(String str) {
        C1787d.m7973b(str);
        this.f6133b.add(str);
    }

    /* renamed from: c */
    public C1850g mo9061c(String str) {
        this.f6137f.size();
        for (int i = 0; i < this.f6137f.size(); i++) {
            C1850g gVar = this.f6137f.get(i);
            if (gVar.mo9264a(str)) {
                return gVar;
            }
        }
        return null;
    }

    /* renamed from: a */
    public void mo9053a(Rect rect, float f, float f2, float f3, List<Layer> list, C0516c<Layer> cVar, Map<String, List<Layer>> map, Map<String, C1806f> map2, C0525g<C1834c> gVar, Map<String, C1833b> map3, List<C1850g> list2) {
        this.f6141j = rect;
        this.f6142k = f;
        this.f6143l = f2;
        this.f6144m = f3;
        this.f6140i = list;
        this.f6139h = cVar;
        this.f6134c = map;
        this.f6135d = map2;
        this.f6138g = gVar;
        this.f6136e = map3;
        this.f6137f = list2;
    }
}
