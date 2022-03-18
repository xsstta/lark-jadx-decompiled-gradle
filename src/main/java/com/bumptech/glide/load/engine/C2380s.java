package com.bumptech.glide.load.engine;

import androidx.core.util.Pools;
import com.bumptech.glide.load.C2390f;
import com.bumptech.glide.load.engine.C2352i;
import com.bumptech.glide.load.p083a.AbstractC2149e;
import com.bumptech.glide.util.C2567j;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/* renamed from: com.bumptech.glide.load.engine.s */
public class C2380s<Data, ResourceType, Transcode> {

    /* renamed from: a */
    private final Class<Data> f7892a;

    /* renamed from: b */
    private final Pools.AbstractC0839a<List<Throwable>> f7893b;

    /* renamed from: c */
    private final List<? extends C2352i<Data, ResourceType, Transcode>> f7894c;

    /* renamed from: d */
    private final String f7895d;

    public String toString() {
        return "LoadPath{decodePaths=" + Arrays.toString(this.f7894c.toArray()) + '}';
    }

    public C2380s(Class<Data> cls, Class<ResourceType> cls2, Class<Transcode> cls3, List<C2352i<Data, ResourceType, Transcode>> list, Pools.AbstractC0839a<List<Throwable>> aVar) {
        this.f7892a = cls;
        this.f7893b = aVar;
        this.f7894c = (List) C2567j.m10897a((Collection) list);
        this.f7895d = "Failed LoadPath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    /* renamed from: a */
    public AbstractC2383u<Transcode> mo10888a(AbstractC2149e<Data> eVar, C2390f fVar, int i, int i2, C2352i.AbstractC2353a<ResourceType> aVar) throws GlideException {
        List<Throwable> list = (List) C2567j.m10894a((Object) this.f7893b.acquire());
        try {
            return m10096a(eVar, fVar, i, i2, aVar, list);
        } finally {
            this.f7893b.release(list);
        }
    }

    /* renamed from: a */
    private AbstractC2383u<Transcode> m10096a(AbstractC2149e<Data> eVar, C2390f fVar, int i, int i2, C2352i.AbstractC2353a<ResourceType> aVar, List<Throwable> list) throws GlideException {
        int size = this.f7894c.size();
        AbstractC2383u<Transcode> uVar = null;
        for (int i3 = 0; i3 < size; i3++) {
            try {
                uVar = ((C2352i) this.f7894c.get(i3)).mo10832a(eVar, i, i2, fVar, aVar);
            } catch (GlideException e) {
                list.add(e);
            }
            if (uVar != null) {
                break;
            }
        }
        if (uVar != null) {
            return uVar;
        }
        throw new GlideException(this.f7895d, new ArrayList(list));
    }
}
