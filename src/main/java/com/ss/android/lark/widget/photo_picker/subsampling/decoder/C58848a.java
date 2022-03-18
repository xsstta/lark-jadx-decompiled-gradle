package com.ss.android.lark.widget.photo_picker.subsampling.decoder;

import android.graphics.Bitmap;
import java.lang.reflect.InvocationTargetException;

/* renamed from: com.ss.android.lark.widget.photo_picker.subsampling.decoder.a */
public class C58848a<T> implements AbstractC58849b<T> {

    /* renamed from: a */
    private final Class<? extends T> f145579a;

    /* renamed from: b */
    private final Bitmap.Config f145580b;

    @Override // com.ss.android.lark.widget.photo_picker.subsampling.decoder.AbstractC58849b
    /* renamed from: b */
    public T mo199026b() throws IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        if (this.f145580b == null) {
            return (T) this.f145579a.newInstance();
        }
        return (T) this.f145579a.getConstructor(Bitmap.Config.class).newInstance(this.f145580b);
    }

    public C58848a(Class<? extends T> cls) {
        this(cls, null);
    }

    public C58848a(Class<? extends T> cls, Bitmap.Config config) {
        this.f145579a = cls;
        this.f145580b = config;
    }
}
