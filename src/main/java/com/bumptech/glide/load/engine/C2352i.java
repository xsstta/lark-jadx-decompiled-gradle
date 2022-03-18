package com.bumptech.glide.load.engine;

import android.util.Log;
import androidx.core.util.Pools;
import com.bumptech.glide.load.AbstractC2391g;
import com.bumptech.glide.load.C2390f;
import com.bumptech.glide.load.p083a.AbstractC2149e;
import com.bumptech.glide.load.resource.p094e.AbstractC2485e;
import com.bumptech.glide.util.C2567j;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bumptech.glide.load.engine.i */
public class C2352i<DataType, ResourceType, Transcode> {

    /* renamed from: a */
    private final Class<DataType> f7806a;

    /* renamed from: b */
    private final List<? extends AbstractC2391g<DataType, ResourceType>> f7807b;

    /* renamed from: c */
    private final AbstractC2485e<ResourceType, Transcode> f7808c;

    /* renamed from: d */
    private final Pools.AbstractC0839a<List<Throwable>> f7809d;

    /* renamed from: e */
    private final String f7810e;

    /* renamed from: com.bumptech.glide.load.engine.i$a */
    interface AbstractC2353a<ResourceType> {
        /* renamed from: a */
        AbstractC2383u<ResourceType> mo10822a(AbstractC2383u<ResourceType> uVar);
    }

    public String toString() {
        return "DecodePath{ dataClass=" + this.f7806a + ", decoders=" + this.f7807b + ", transcoder=" + this.f7808c + '}';
    }

    /* renamed from: a */
    private AbstractC2383u<ResourceType> m10004a(AbstractC2149e<DataType> eVar, int i, int i2, C2390f fVar) throws GlideException {
        List<Throwable> list = (List) C2567j.m10894a((Object) this.f7809d.acquire());
        try {
            return m10005a(eVar, i, i2, fVar, list);
        } finally {
            this.f7809d.release(list);
        }
    }

    /* renamed from: a */
    public AbstractC2383u<Transcode> mo10832a(AbstractC2149e<DataType> eVar, int i, int i2, C2390f fVar, AbstractC2353a<ResourceType> aVar) throws GlideException {
        return this.f7808c.mo11044a(aVar.mo10822a(m10004a(eVar, i, i2, fVar)), fVar);
    }

    /* renamed from: a */
    private AbstractC2383u<ResourceType> m10005a(AbstractC2149e<DataType> eVar, int i, int i2, C2390f fVar, List<Throwable> list) throws GlideException {
        int size = this.f7807b.size();
        AbstractC2383u<ResourceType> uVar = null;
        for (int i3 = 0; i3 < size; i3++) {
            AbstractC2391g gVar = (AbstractC2391g) this.f7807b.get(i3);
            try {
                if (gVar.mo10904a(eVar.mo10504a(), fVar)) {
                    uVar = gVar.mo10903a(eVar.mo10504a(), i, i2, fVar);
                }
            } catch (IOException | OutOfMemoryError | RuntimeException e) {
                if (Log.isLoggable("DecodePath", 2)) {
                    Log.v("DecodePath", "Failed to decode data for " + gVar, e);
                }
                list.add(e);
            }
            if (uVar != null) {
                break;
            }
        }
        if (uVar != null) {
            return uVar;
        }
        throw new GlideException(this.f7810e, new ArrayList(list));
    }

    public C2352i(Class<DataType> cls, Class<ResourceType> cls2, Class<Transcode> cls3, List<? extends AbstractC2391g<DataType, ResourceType>> list, AbstractC2485e<ResourceType, Transcode> eVar, Pools.AbstractC0839a<List<Throwable>> aVar) {
        this.f7806a = cls;
        this.f7807b = list;
        this.f7808c = eVar;
        this.f7809d = aVar;
        this.f7810e = "Failed DecodePath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }
}
