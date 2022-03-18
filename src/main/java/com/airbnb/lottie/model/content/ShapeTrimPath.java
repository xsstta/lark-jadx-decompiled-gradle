package com.airbnb.lottie.model.content;

import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.layer.AbstractC1852a;
import com.airbnb.lottie.model.p073a.C1820b;
import com.airbnb.lottie.p067a.p068a.AbstractC1739c;
import com.airbnb.lottie.p067a.p068a.C1757s;

public class ShapeTrimPath implements AbstractC1837b {

    /* renamed from: a */
    private final String f6308a;

    /* renamed from: b */
    private final Type f6309b;

    /* renamed from: c */
    private final C1820b f6310c;

    /* renamed from: d */
    private final C1820b f6311d;

    /* renamed from: e */
    private final C1820b f6312e;

    /* renamed from: f */
    private final boolean f6313f;

    /* renamed from: a */
    public String mo9187a() {
        return this.f6308a;
    }

    /* renamed from: b */
    public Type mo9188b() {
        return this.f6309b;
    }

    /* renamed from: c */
    public C1820b mo9189c() {
        return this.f6311d;
    }

    /* renamed from: d */
    public C1820b mo9190d() {
        return this.f6310c;
    }

    /* renamed from: e */
    public C1820b mo9191e() {
        return this.f6312e;
    }

    /* renamed from: f */
    public boolean mo9192f() {
        return this.f6313f;
    }

    public String toString() {
        return "Trim Path: {start: " + this.f6310c + ", end: " + this.f6311d + ", offset: " + this.f6312e + "}";
    }

    public enum Type {
        SIMULTANEOUSLY,
        INDIVIDUALLY;

        public static Type forId(int i) {
            if (i == 1) {
                return SIMULTANEOUSLY;
            }
            if (i == 2) {
                return INDIVIDUALLY;
            }
            throw new IllegalArgumentException("Unknown trim path type " + i);
        }
    }

    @Override // com.airbnb.lottie.model.content.AbstractC1837b
    /* renamed from: a */
    public AbstractC1739c mo9140a(LottieDrawable lottieDrawable, AbstractC1852a aVar) {
        return new C1757s(aVar, this);
    }

    public ShapeTrimPath(String str, Type type, C1820b bVar, C1820b bVar2, C1820b bVar3, boolean z) {
        this.f6308a = str;
        this.f6309b = type;
        this.f6310c = bVar;
        this.f6311d = bVar2;
        this.f6312e = bVar3;
        this.f6313f = z;
    }
}
