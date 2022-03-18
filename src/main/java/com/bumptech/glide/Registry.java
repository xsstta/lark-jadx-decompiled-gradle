package com.bumptech.glide;

import androidx.core.util.Pools;
import com.bumptech.glide.load.AbstractC2136a;
import com.bumptech.glide.load.AbstractC2391g;
import com.bumptech.glide.load.AbstractC2392h;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.engine.AbstractC2383u;
import com.bumptech.glide.load.engine.C2352i;
import com.bumptech.glide.load.engine.C2380s;
import com.bumptech.glide.load.p083a.AbstractC2149e;
import com.bumptech.glide.load.p083a.C2151f;
import com.bumptech.glide.load.p085b.AbstractC2233n;
import com.bumptech.glide.load.p085b.AbstractC2235o;
import com.bumptech.glide.load.p085b.C2236p;
import com.bumptech.glide.load.resource.p094e.AbstractC2485e;
import com.bumptech.glide.load.resource.p094e.C2486f;
import com.bumptech.glide.p081b.C2106a;
import com.bumptech.glide.p081b.C2108b;
import com.bumptech.glide.p081b.C2109c;
import com.bumptech.glide.p081b.C2110d;
import com.bumptech.glide.p081b.C2111e;
import com.bumptech.glide.p081b.C2113f;
import com.bumptech.glide.util.p097a.C2545a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Registry {

    /* renamed from: a */
    private final C2236p f7267a;

    /* renamed from: b */
    private final C2106a f7268b;

    /* renamed from: c */
    private final C2111e f7269c;

    /* renamed from: d */
    private final C2113f f7270d;

    /* renamed from: e */
    private final C2151f f7271e;

    /* renamed from: f */
    private final C2486f f7272f;

    /* renamed from: g */
    private final C2108b f7273g;

    /* renamed from: h */
    private final C2110d f7274h = new C2110d();

    /* renamed from: i */
    private final C2109c f7275i = new C2109c();

    /* renamed from: j */
    private final Pools.AbstractC0839a<List<Throwable>> f7276j;

    /* renamed from: a */
    public <Data, TResource, Transcode> C2380s<Data, TResource, Transcode> mo10306a(Class<Data> cls, Class<TResource> cls2, Class<Transcode> cls3) {
        C2380s<Data, TResource, Transcode> a = this.f7275i.mo10335a(cls, cls2, cls3);
        if (this.f7275i.mo10337a(a)) {
            return null;
        }
        if (a == null) {
            List<C2352i<Data, TResource, Transcode>> c = m9086c(cls, cls2, cls3);
            if (c.isEmpty()) {
                a = null;
            } else {
                a = new C2380s<>(cls, cls2, cls3, c, this.f7276j);
            }
            this.f7275i.mo10336a(cls, cls2, cls3, a);
        }
        return a;
    }

    /* renamed from: a */
    public boolean mo10308a(AbstractC2383u<?> uVar) {
        return this.f7270d.mo10346a(uVar.mo10877c()) != null;
    }

    /* renamed from: a */
    public <X> AbstractC2136a<X> mo10305a(X x) throws NoSourceEncoderAvailableException {
        AbstractC2136a<X> a = this.f7268b.mo10330a(x.getClass());
        if (a != null) {
            return a;
        }
        throw new NoSourceEncoderAvailableException(x.getClass());
    }

    /* renamed from: a */
    public List<ImageHeaderParser> mo10307a() {
        List<ImageHeaderParser> a = this.f7273g.mo10333a();
        if (!a.isEmpty()) {
            return a;
        }
        throw new NoImageHeaderParserException();
    }

    public static final class NoImageHeaderParserException extends MissingComponentException {
        public NoImageHeaderParserException() {
            super("Failed to find image header parser.");
        }
    }

    public Registry() {
        Pools.AbstractC0839a<List<Throwable>> a = C2545a.m10849a();
        this.f7276j = a;
        this.f7267a = new C2236p(a);
        this.f7268b = new C2106a();
        this.f7269c = new C2111e();
        this.f7270d = new C2113f();
        this.f7271e = new C2151f();
        this.f7272f = new C2486f();
        this.f7273g = new C2108b();
        mo10304a(Arrays.asList("Gif", "Bitmap", "BitmapDrawable"));
    }

    public static class MissingComponentException extends RuntimeException {
        public MissingComponentException(String str) {
            super(str);
        }
    }

    /* renamed from: a */
    public Registry mo10296a(ImageHeaderParser imageHeaderParser) {
        this.f7273g.mo10334a(imageHeaderParser);
        return this;
    }

    /* renamed from: a */
    public Registry mo10297a(AbstractC2149e.AbstractC2150a<?> aVar) {
        this.f7271e.mo10509a(aVar);
        return this;
    }

    /* renamed from: c */
    public <Model> List<AbstractC2233n<Model, ?>> mo10318c(Model model) {
        return this.f7267a.mo10603a((Object) model);
    }

    public static class NoResultEncoderAvailableException extends MissingComponentException {
        public NoResultEncoderAvailableException(Class<?> cls) {
            super("Failed to find result encoder for resource class: " + cls + ", you may need to consider registering a new Encoder for the requested type or DiskCacheStrategy.DATA/DiskCacheStrategy.NONE if caching your transformed resource is unnecessary.");
        }
    }

    public static class NoSourceEncoderAvailableException extends MissingComponentException {
        public NoSourceEncoderAvailableException(Class<?> cls) {
            super("Failed to find source encoder for data class: " + cls);
        }
    }

    public static class NoModelLoaderAvailableException extends MissingComponentException {
        public NoModelLoaderAvailableException(Object obj) {
            super("Failed to find any ModelLoaders registered for model class: " + obj.getClass());
        }

        public NoModelLoaderAvailableException(Class<?> cls, Class<?> cls2) {
            super("Failed to find any ModelLoaders for model: " + cls + " and data: " + cls2);
        }

        public <M> NoModelLoaderAvailableException(M m, List<AbstractC2233n<M, ?>> list) {
            super("Found ModelLoaders for model class: " + list + ", but none that handle this specific model instance: " + ((Object) m));
        }
    }

    /* renamed from: b */
    public <X> AbstractC2149e<X> mo10314b(X x) {
        return this.f7271e.mo10508a((Object) x);
    }

    /* renamed from: b */
    public <X> AbstractC2392h<X> mo10315b(AbstractC2383u<X> uVar) throws NoResultEncoderAvailableException {
        AbstractC2392h<X> a = this.f7270d.mo10346a(uVar.mo10877c());
        if (a != null) {
            return a;
        }
        throw new NoResultEncoderAvailableException(uVar.mo10877c());
    }

    /* renamed from: a */
    public final Registry mo10304a(List<String> list) {
        ArrayList arrayList = new ArrayList(list.size());
        arrayList.addAll(list);
        arrayList.add(0, "legacy_prepend_all");
        arrayList.add("legacy_append");
        this.f7269c.mo10342a(arrayList);
        return this;
    }

    /* renamed from: b */
    public <TResource> Registry mo10309b(Class<TResource> cls, AbstractC2392h<TResource> hVar) {
        this.f7270d.mo10348b(cls, hVar);
        return this;
    }

    /* renamed from: a */
    public <Data> Registry mo10298a(Class<Data> cls, AbstractC2136a<Data> aVar) {
        this.f7268b.mo10331a(cls, aVar);
        return this;
    }

    /* renamed from: a */
    public <TResource> Registry mo10299a(Class<TResource> cls, AbstractC2392h<TResource> hVar) {
        this.f7270d.mo10347a(cls, hVar);
        return this;
    }

    /* renamed from: c */
    public <Model, Data> Registry mo10317c(Class<Model> cls, Class<Data> cls2, AbstractC2235o<? extends Model, ? extends Data> oVar) {
        this.f7267a.mo10606c(cls, cls2, oVar);
        return this;
    }

    /* renamed from: b */
    public <Model, Data> Registry mo10310b(Class<Model> cls, Class<Data> cls2, AbstractC2235o<Model, Data> oVar) {
        this.f7267a.mo10605b(cls, cls2, oVar);
        return this;
    }

    /* renamed from: b */
    public <Data, TResource> Registry mo10311b(Class<Data> cls, Class<TResource> cls2, AbstractC2391g<Data, TResource> gVar) {
        mo10313b("legacy_prepend_all", cls, cls2, gVar);
        return this;
    }

    /* renamed from: b */
    public <TResource, Transcode> Registry mo10312b(Class<TResource> cls, Class<Transcode> cls2, AbstractC2485e<TResource, Transcode> eVar) {
        this.f7272f.mo11048b(cls, cls2, eVar);
        return this;
    }

    /* renamed from: c */
    private <Data, TResource, Transcode> List<C2352i<Data, TResource, Transcode>> m9086c(Class<Data> cls, Class<TResource> cls2, Class<Transcode> cls3) {
        ArrayList arrayList = new ArrayList();
        for (Class cls4 : this.f7269c.mo10343b(cls, cls2)) {
            for (Class cls5 : this.f7272f.mo11047b(cls4, cls3)) {
                arrayList.add(new C2352i(cls, cls4, cls5, this.f7269c.mo10340a(cls, cls4), this.f7272f.mo11045a(cls4, cls5), this.f7276j));
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public <Model, Data> Registry mo10300a(Class<Model> cls, Class<Data> cls2, AbstractC2235o<Model, Data> oVar) {
        this.f7267a.mo10604a(cls, cls2, oVar);
        return this;
    }

    /* renamed from: a */
    public <Data, TResource> Registry mo10301a(Class<Data> cls, Class<TResource> cls2, AbstractC2391g<Data, TResource> gVar) {
        mo10303a("legacy_append", cls, cls2, gVar);
        return this;
    }

    /* renamed from: a */
    public <TResource, Transcode> Registry mo10302a(Class<TResource> cls, Class<Transcode> cls2, AbstractC2485e<TResource, Transcode> eVar) {
        this.f7272f.mo11046a(cls, cls2, eVar);
        return this;
    }

    /* renamed from: b */
    public <Model, TResource, Transcode> List<Class<?>> mo10316b(Class<Model> cls, Class<TResource> cls2, Class<Transcode> cls3) {
        List<Class<?>> a = this.f7274h.mo10338a(cls, cls2, cls3);
        if (a == null) {
            a = new ArrayList<>();
            for (Class<?> cls4 : this.f7267a.mo10602a((Class<?>) cls)) {
                for (Class<?> cls5 : this.f7269c.mo10343b(cls4, cls2)) {
                    if (!this.f7272f.mo11047b(cls5, cls3).isEmpty() && !a.contains(cls5)) {
                        a.add(cls5);
                    }
                }
            }
            this.f7274h.mo10339a(cls, cls2, cls3, Collections.unmodifiableList(a));
        }
        return a;
    }

    /* renamed from: b */
    public <Data, TResource> Registry mo10313b(String str, Class<Data> cls, Class<TResource> cls2, AbstractC2391g<Data, TResource> gVar) {
        this.f7269c.mo10344b(str, gVar, cls, cls2);
        return this;
    }

    /* renamed from: a */
    public <Data, TResource> Registry mo10303a(String str, Class<Data> cls, Class<TResource> cls2, AbstractC2391g<Data, TResource> gVar) {
        this.f7269c.mo10341a(str, gVar, cls, cls2);
        return this;
    }
}
