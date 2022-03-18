package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.AbstractC2136a;
import com.bumptech.glide.load.C2390f;
import com.bumptech.glide.load.engine.p088b.AbstractC2302a;
import java.io.File;

/* renamed from: com.bumptech.glide.load.engine.e */
class C2339e<DataType> implements AbstractC2302a.AbstractC2304b {

    /* renamed from: a */
    private final AbstractC2136a<DataType> f7741a;

    /* renamed from: b */
    private final DataType f7742b;

    /* renamed from: c */
    private final C2390f f7743c;

    @Override // com.bumptech.glide.load.engine.p088b.AbstractC2302a.AbstractC2304b
    /* renamed from: a */
    public boolean mo10725a(File file) {
        return this.f7741a.mo10479a(this.f7742b, file, this.f7743c);
    }

    C2339e(AbstractC2136a<DataType> aVar, DataType datatype, C2390f fVar) {
        this.f7741a = aVar;
        this.f7742b = datatype;
        this.f7743c = fVar;
    }
}
