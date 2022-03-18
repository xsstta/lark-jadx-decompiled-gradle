package com.airbnb.lottie.model.content;

import android.graphics.PointF;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.layer.AbstractC1852a;
import com.airbnb.lottie.model.p073a.AbstractC1831m;
import com.airbnb.lottie.model.p073a.C1820b;
import com.airbnb.lottie.p067a.p068a.AbstractC1739c;
import com.airbnb.lottie.p067a.p068a.C1751n;

public class PolystarShape implements AbstractC1837b {

    /* renamed from: a */
    private final String f6286a;

    /* renamed from: b */
    private final Type f6287b;

    /* renamed from: c */
    private final C1820b f6288c;

    /* renamed from: d */
    private final AbstractC1831m<PointF, PointF> f6289d;

    /* renamed from: e */
    private final C1820b f6290e;

    /* renamed from: f */
    private final C1820b f6291f;

    /* renamed from: g */
    private final C1820b f6292g;

    /* renamed from: h */
    private final C1820b f6293h;

    /* renamed from: i */
    private final C1820b f6294i;

    /* renamed from: j */
    private final boolean f6295j;

    /* renamed from: a */
    public String mo9165a() {
        return this.f6286a;
    }

    /* renamed from: b */
    public Type mo9166b() {
        return this.f6287b;
    }

    /* renamed from: c */
    public C1820b mo9167c() {
        return this.f6288c;
    }

    /* renamed from: d */
    public AbstractC1831m<PointF, PointF> mo9168d() {
        return this.f6289d;
    }

    /* renamed from: e */
    public C1820b mo9169e() {
        return this.f6290e;
    }

    /* renamed from: f */
    public C1820b mo9170f() {
        return this.f6291f;
    }

    /* renamed from: g */
    public C1820b mo9171g() {
        return this.f6292g;
    }

    /* renamed from: h */
    public C1820b mo9172h() {
        return this.f6293h;
    }

    /* renamed from: i */
    public C1820b mo9173i() {
        return this.f6294i;
    }

    /* renamed from: j */
    public boolean mo9174j() {
        return this.f6295j;
    }

    public enum Type {
        STAR(1),
        POLYGON(2);
        
        private final int value;

        public static Type forValue(int i) {
            Type[] values = values();
            for (Type type : values) {
                if (type.value == i) {
                    return type;
                }
            }
            return null;
        }

        private Type(int i) {
            this.value = i;
        }
    }

    @Override // com.airbnb.lottie.model.content.AbstractC1837b
    /* renamed from: a */
    public AbstractC1739c mo9140a(LottieDrawable lottieDrawable, AbstractC1852a aVar) {
        return new C1751n(lottieDrawable, aVar, this);
    }

    public PolystarShape(String str, Type type, C1820b bVar, AbstractC1831m<PointF, PointF> mVar, C1820b bVar2, C1820b bVar3, C1820b bVar4, C1820b bVar5, C1820b bVar6, boolean z) {
        this.f6286a = str;
        this.f6287b = type;
        this.f6288c = bVar;
        this.f6289d = mVar;
        this.f6290e = bVar2;
        this.f6291f = bVar3;
        this.f6292g = bVar4;
        this.f6293h = bVar5;
        this.f6294i = bVar6;
        this.f6295j = z;
    }
}
