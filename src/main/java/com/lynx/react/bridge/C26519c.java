package com.lynx.react.bridge;

import androidx.core.util.Pools;

/* renamed from: com.lynx.react.bridge.c */
public class C26519c implements AbstractC26517a {

    /* renamed from: a */
    private static final Pools.SimplePool<C26519c> f65567a = new Pools.SimplePool<>(10);

    /* renamed from: b */
    private ReadableMap f65568b;

    /* renamed from: c */
    private String f65569c;

    private C26519c() {
    }

    @Override // com.lynx.react.bridge.AbstractC26517a
    /* renamed from: b */
    public boolean mo94066b() {
        String str;
        ReadableMap readableMap = this.f65568b;
        if (readableMap != null && (str = this.f65569c) != null) {
            return readableMap.getBoolean(str);
        }
        throw new IllegalStateException("This dynamic value has been recycled");
    }

    @Override // com.lynx.react.bridge.AbstractC26517a
    /* renamed from: c */
    public double mo94067c() {
        String str;
        ReadableMap readableMap = this.f65568b;
        if (readableMap != null && (str = this.f65569c) != null) {
            return readableMap.getDouble(str);
        }
        throw new IllegalStateException("This dynamic value has been recycled");
    }

    @Override // com.lynx.react.bridge.AbstractC26517a
    /* renamed from: d */
    public int mo94068d() {
        String str;
        ReadableMap readableMap = this.f65568b;
        if (readableMap != null && (str = this.f65569c) != null) {
            return readableMap.getInt(str);
        }
        throw new IllegalStateException("This dynamic value has been recycled");
    }

    @Override // com.lynx.react.bridge.AbstractC26517a
    /* renamed from: e */
    public String mo94069e() {
        String str;
        ReadableMap readableMap = this.f65568b;
        if (readableMap != null && (str = this.f65569c) != null) {
            return readableMap.getString(str);
        }
        throw new IllegalStateException("This dynamic value has been recycled");
    }

    @Override // com.lynx.react.bridge.AbstractC26517a
    /* renamed from: f */
    public ReadableArray mo94070f() {
        String str;
        ReadableMap readableMap = this.f65568b;
        if (readableMap != null && (str = this.f65569c) != null) {
            return readableMap.getArray(str);
        }
        throw new IllegalStateException("This dynamic value has been recycled");
    }

    @Override // com.lynx.react.bridge.AbstractC26517a
    /* renamed from: g */
    public ReadableType mo94071g() {
        String str;
        ReadableMap readableMap = this.f65568b;
        if (readableMap != null && (str = this.f65569c) != null) {
            return readableMap.getType(str);
        }
        throw new IllegalStateException("This dynamic value has been recycled");
    }

    @Override // com.lynx.react.bridge.AbstractC26517a
    /* renamed from: a */
    public boolean mo94065a() {
        String str;
        ReadableMap readableMap = this.f65568b;
        if (readableMap != null && (str = this.f65569c) != null) {
            return readableMap.isNull(str);
        }
        throw new IllegalStateException("This dynamic value has been recycled");
    }

    /* renamed from: a */
    public static C26519c m96104a(ReadableMap readableMap, String str) {
        C26519c acquire = f65567a.acquire();
        if (acquire == null) {
            acquire = new C26519c();
        }
        acquire.f65568b = readableMap;
        acquire.f65569c = str;
        return acquire;
    }
}
