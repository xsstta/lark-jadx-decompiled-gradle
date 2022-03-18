package com.bumptech.glide.p081b;

import com.bumptech.glide.load.ImageHeaderParser;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bumptech.glide.b.b */
public final class C2108b {

    /* renamed from: a */
    private final List<ImageHeaderParser> f7281a = new ArrayList();

    /* renamed from: a */
    public synchronized List<ImageHeaderParser> mo10333a() {
        return this.f7281a;
    }

    /* renamed from: a */
    public synchronized void mo10334a(ImageHeaderParser imageHeaderParser) {
        this.f7281a.add(imageHeaderParser);
    }
}
