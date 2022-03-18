package com.airbnb.lottie.model.content;

import com.airbnb.lottie.model.p073a.C1822d;
import com.airbnb.lottie.model.p073a.C1826h;

public class Mask {

    /* renamed from: a */
    private final MaskMode f6279a;

    /* renamed from: b */
    private final C1826h f6280b;

    /* renamed from: c */
    private final C1822d f6281c;

    /* renamed from: d */
    private final boolean f6282d;

    public enum MaskMode {
        MASK_MODE_ADD,
        MASK_MODE_SUBTRACT,
        MASK_MODE_INTERSECT,
        MASK_MODE_NONE
    }

    /* renamed from: a */
    public MaskMode mo9157a() {
        return this.f6279a;
    }

    /* renamed from: b */
    public C1826h mo9158b() {
        return this.f6280b;
    }

    /* renamed from: c */
    public C1822d mo9159c() {
        return this.f6281c;
    }

    /* renamed from: d */
    public boolean mo9160d() {
        return this.f6282d;
    }

    public Mask(MaskMode maskMode, C1826h hVar, C1822d dVar, boolean z) {
        this.f6279a = maskMode;
        this.f6280b = hVar;
        this.f6281c = dVar;
        this.f6282d = z;
    }
}
