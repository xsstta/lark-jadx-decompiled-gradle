package com.bytedance.ee.bear.drive.view.preview.image.progressloader.decode;

import com.bytedance.ee.bear.drive.view.preview.image.progressloader.p369b.AbstractC7296c;

public class ImageWrapper<D, E> {

    /* renamed from: a */
    private final boolean f19626a;

    /* renamed from: b */
    private final AbstractC7296c<D> f19627b;

    /* renamed from: c */
    private final AbstractC7296c<E> f19628c;

    /* renamed from: d */
    private final Type f19629d;

    public enum Type {
        ENCODED,
        DECODED
    }

    /* renamed from: a */
    public boolean mo28585a() {
        return this.f19626a;
    }

    /* renamed from: b */
    public AbstractC7296c<D> mo28586b() {
        return this.f19627b;
    }

    /* renamed from: c */
    public AbstractC7296c<E> mo28587c() {
        return this.f19628c;
    }

    /* renamed from: d */
    public Type mo28588d() {
        return this.f19629d;
    }

    /* renamed from: a */
    public static <D, E> ImageWrapper<D, E> m29300a(AbstractC7296c<D> cVar, boolean z) {
        return new ImageWrapper<>(cVar, null, Type.DECODED, z);
    }

    /* renamed from: b */
    public static <D, E> ImageWrapper<D, E> m29301b(AbstractC7296c<E> cVar, boolean z) {
        return new ImageWrapper<>(null, cVar, Type.ENCODED, z);
    }

    private ImageWrapper(AbstractC7296c<D> cVar, AbstractC7296c<E> cVar2, Type type, boolean z) {
        this.f19627b = cVar;
        this.f19628c = cVar2;
        this.f19629d = type;
        this.f19626a = z;
    }
}
