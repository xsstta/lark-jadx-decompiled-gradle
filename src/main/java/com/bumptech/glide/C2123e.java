package com.bumptech.glide;

import android.content.Context;
import android.content.ContextWrapper;
import android.widget.ImageView;
import com.bumptech.glide.ComponentCallbacks2C2115c;
import com.bumptech.glide.load.engine.C2360k;
import com.bumptech.glide.load.engine.p087a.AbstractC2278b;
import com.bumptech.glide.request.AbstractC2536f;
import com.bumptech.glide.request.C2537g;
import com.bumptech.glide.request.p095a.AbstractC2523k;
import com.bumptech.glide.request.p095a.C2519g;
import java.util.List;
import java.util.Map;

/* renamed from: com.bumptech.glide.e */
public class C2123e extends ContextWrapper {

    /* renamed from: a */
    static final AbstractC2135h<?, ?> f7332a = new C2105b();

    /* renamed from: b */
    private final AbstractC2278b f7333b;

    /* renamed from: c */
    private final Registry f7334c;

    /* renamed from: d */
    private final C2519g f7335d;

    /* renamed from: e */
    private final ComponentCallbacks2C2115c.AbstractC2116a f7336e;

    /* renamed from: f */
    private final List<AbstractC2536f<Object>> f7337f;

    /* renamed from: g */
    private final Map<Class<?>, AbstractC2135h<?, ?>> f7338g;

    /* renamed from: h */
    private final C2360k f7339h;

    /* renamed from: i */
    private final boolean f7340i;

    /* renamed from: j */
    private final int f7341j;

    /* renamed from: k */
    private C2537g f7342k;

    /* renamed from: a */
    public List<AbstractC2536f<Object>> mo10379a() {
        return this.f7337f;
    }

    /* renamed from: c */
    public C2360k mo10381c() {
        return this.f7339h;
    }

    /* renamed from: d */
    public Registry mo10382d() {
        return this.f7334c;
    }

    /* renamed from: e */
    public int mo10383e() {
        return this.f7341j;
    }

    /* renamed from: f */
    public AbstractC2278b mo10384f() {
        return this.f7333b;
    }

    /* renamed from: g */
    public boolean mo10385g() {
        return this.f7340i;
    }

    /* renamed from: b */
    public synchronized C2537g mo10380b() {
        if (this.f7342k == null) {
            this.f7342k = (C2537g) this.f7336e.mo10365a().mo11158o();
        }
        return this.f7342k;
    }

    /* renamed from: a */
    public <T> AbstractC2135h<?, T> mo10377a(Class<T> cls) {
        AbstractC2135h<?, T> hVar = (AbstractC2135h<?, T>) this.f7338g.get(cls);
        if (hVar == null) {
            for (Map.Entry<Class<?>, AbstractC2135h<?, ?>> entry : this.f7338g.entrySet()) {
                if (entry.getKey().isAssignableFrom(cls)) {
                    hVar = (AbstractC2135h<?, T>) entry.getValue();
                }
            }
        }
        return hVar == null ? (AbstractC2135h<?, T>) f7332a : hVar;
    }

    /* renamed from: a */
    public <X> AbstractC2523k<ImageView, X> mo10378a(ImageView imageView, Class<X> cls) {
        return this.f7335d.mo11186a(imageView, cls);
    }

    public C2123e(Context context, AbstractC2278b bVar, Registry registry, C2519g gVar, ComponentCallbacks2C2115c.AbstractC2116a aVar, Map<Class<?>, AbstractC2135h<?, ?>> map, List<AbstractC2536f<Object>> list, C2360k kVar, boolean z, int i) {
        super(context.getApplicationContext());
        this.f7333b = bVar;
        this.f7334c = registry;
        this.f7335d = gVar;
        this.f7336e = aVar;
        this.f7337f = list;
        this.f7338g = map;
        this.f7339h = kVar;
        this.f7340i = z;
        this.f7341j = i;
    }
}
