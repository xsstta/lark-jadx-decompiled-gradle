package com.lynx.react.bridge;

import androidx.core.util.Pools;

/* renamed from: com.lynx.react.bridge.b */
public class C26518b implements AbstractC26517a {

    /* renamed from: a */
    private static final Pools.SimplePool<C26518b> f65564a = new Pools.SimplePool<>(10);

    /* renamed from: b */
    private ReadableArray f65565b;

    /* renamed from: c */
    private int f65566c = -1;

    private C26518b() {
    }

    @Override // com.lynx.react.bridge.AbstractC26517a
    /* renamed from: b */
    public boolean mo94066b() {
        ReadableArray readableArray = this.f65565b;
        if (readableArray != null) {
            return readableArray.getBoolean(this.f65566c);
        }
        throw new IllegalStateException("This dynamic value has been recycled");
    }

    @Override // com.lynx.react.bridge.AbstractC26517a
    /* renamed from: c */
    public double mo94067c() {
        ReadableArray readableArray = this.f65565b;
        if (readableArray != null) {
            return readableArray.getDouble(this.f65566c);
        }
        throw new IllegalStateException("This dynamic value has been recycled");
    }

    @Override // com.lynx.react.bridge.AbstractC26517a
    /* renamed from: d */
    public int mo94068d() {
        ReadableArray readableArray = this.f65565b;
        if (readableArray != null) {
            return readableArray.getInt(this.f65566c);
        }
        throw new IllegalStateException("This dynamic value has been recycled");
    }

    @Override // com.lynx.react.bridge.AbstractC26517a
    /* renamed from: e */
    public String mo94069e() {
        ReadableArray readableArray = this.f65565b;
        if (readableArray != null) {
            return readableArray.getString(this.f65566c);
        }
        throw new IllegalStateException("This dynamic value has been recycled");
    }

    @Override // com.lynx.react.bridge.AbstractC26517a
    /* renamed from: f */
    public ReadableArray mo94070f() {
        ReadableArray readableArray = this.f65565b;
        if (readableArray != null) {
            return readableArray.getArray(this.f65566c);
        }
        throw new IllegalStateException("This dynamic value has been recycled");
    }

    @Override // com.lynx.react.bridge.AbstractC26517a
    /* renamed from: g */
    public ReadableType mo94071g() {
        ReadableArray readableArray = this.f65565b;
        if (readableArray != null) {
            return readableArray.getType(this.f65566c);
        }
        throw new IllegalStateException("This dynamic value has been recycled");
    }

    @Override // com.lynx.react.bridge.AbstractC26517a
    /* renamed from: a */
    public boolean mo94065a() {
        ReadableArray readableArray = this.f65565b;
        if (readableArray != null) {
            return readableArray.isNull(this.f65566c);
        }
        throw new IllegalStateException("This dynamic value has been recycled");
    }

    /* renamed from: a */
    public static C26518b m96096a(ReadableArray readableArray, int i) {
        C26518b acquire = f65564a.acquire();
        if (acquire == null) {
            acquire = new C26518b();
        }
        acquire.f65565b = readableArray;
        acquire.f65566c = i;
        return acquire;
    }
}
