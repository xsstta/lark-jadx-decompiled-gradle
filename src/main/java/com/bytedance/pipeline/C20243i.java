package com.bytedance.pipeline;

import com.bytedance.pipeline.p859a.AbstractC20231a;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.pipeline.i */
public final class C20243i implements AbstractC20233b, Serializable {
    private Map<String, Object> mBundleData;
    private int mIndex;
    protected AbstractC20237f mInterceptorFactory;
    private List<C20240h> mPipes;
    private AbstractC20235d mPreInterceptor;

    /* access modifiers changed from: protected */
    public Map<String, Object> getBundleData() {
        return this.mBundleData;
    }

    @Override // com.bytedance.pipeline.AbstractC20233b
    public Object restart() throws Exception {
        this.mIndex = 0;
        this.mPreInterceptor = null;
        return proceed(null);
    }

    public Object resume() throws Exception {
        if (this.mPreInterceptor == null) {
            return null;
        }
        try {
            C20240h hVar = this.mPipes.get(this.mIndex - 1);
            AbstractC20231a b = hVar.mo68502b();
            C20243i iVar = new C20243i(this.mPipes, this.mIndex, this.mInterceptorFactory, this.mPreInterceptor);
            iVar.setBundleData(this.mBundleData);
            IN in = this.mPreInterceptor.f49512d;
            AbstractC20235d dVar = this.mPreInterceptor;
            dVar.mo68489a(iVar, dVar.f49511c, this.mPreInterceptor.f49513e, b, hVar.mo68503c());
            AbstractC20235d dVar2 = this.mPreInterceptor;
            Object a_ = dVar2.a_(dVar2.mo68497g(), in);
            this.mPreInterceptor.mo68495e();
            return a_;
        } catch (C20244a e) {
            this.mPreInterceptor.mo68492c(e.getCause());
            throw e;
        } catch (Throwable th) {
            this.mPreInterceptor.mo68490b(th);
            throw new C20244a(th);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.pipeline.i$a */
    public static final class C20244a extends Exception {
        C20244a(Throwable th) {
            super(th);
        }
    }

    /* access modifiers changed from: protected */
    public void setBundleData(Map<String, Object> map) {
        this.mBundleData = map;
    }

    @Override // com.bytedance.pipeline.AbstractC20233b
    public Object getPipelineData(String str) {
        return this.mBundleData.get(str);
    }

    /* renamed from: a */
    private AbstractC20235d m73918a(Class cls) {
        AbstractC20235d dVar = this.mPreInterceptor;
        while (dVar != null && dVar.getClass() != cls) {
            dVar = dVar.f49511c;
        }
        return dVar;
    }

    @Override // com.bytedance.pipeline.AbstractC20233b
    public Object getInputForType(Class cls) {
        AbstractC20235d a = m73918a(cls);
        if (a != null) {
            return a.f49512d;
        }
        throw new IllegalArgumentException("can not find pre Interceptor , class:" + cls);
    }

    @Override // com.bytedance.pipeline.AbstractC20233b
    public Object getInterceptorByType(Class cls) {
        AbstractC20235d a = m73918a(cls);
        if (a != null) {
            return a;
        }
        throw new IllegalArgumentException("can not find pre Interceptor , class:" + cls);
    }

    @Override // com.bytedance.pipeline.AbstractC20233b
    public Object getOutputForType(Class cls) {
        AbstractC20235d a = m73918a(cls);
        if (a != null) {
            return a.f49513e;
        }
        throw new IllegalArgumentException("can not find pre Interceptor , class:" + cls);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r10v0, resolved type: java.lang.Object */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.pipeline.AbstractC20233b
    public Object proceed(Object obj) throws Exception {
        AbstractC20235d dVar = this.mPreInterceptor;
        if (dVar != null) {
            dVar.f49513e = obj;
            this.mPreInterceptor.mo68496f();
        }
        if (this.mIndex >= this.mPipes.size()) {
            return obj;
        }
        C20240h hVar = this.mPipes.get(this.mIndex);
        Class<? extends AbstractC20235d> a = hVar.mo68501a();
        AbstractC20235d dVar2 = (AbstractC20235d) this.mInterceptorFactory.mo68500a(a);
        if (dVar2 != null) {
            AbstractC20231a b = hVar.mo68502b();
            C20243i iVar = new C20243i(this.mPipes, this.mIndex + 1, this.mInterceptorFactory, dVar2);
            iVar.setBundleData(this.mBundleData);
            dVar2.mo68489a(iVar, this.mPreInterceptor, obj, b, hVar.mo68503c());
            dVar2.mo68493d();
            try {
                Object a_ = dVar2.a_(iVar, obj);
                dVar2.mo68495e();
                return a_;
            } catch (C20244a e) {
                dVar2.mo68492c(e.getCause());
                throw e;
            } catch (Throwable th) {
                dVar2.mo68490b(th);
                throw new C20244a(th);
            }
        } else {
            throw new IllegalArgumentException("interceptor == null , index = " + obj + " , class: " + a);
        }
    }

    @Override // com.bytedance.pipeline.AbstractC20233b
    public void setPipelineData(String str, Object obj) {
        this.mBundleData.put(str, obj);
    }

    C20243i(List<C20240h> list, int i, AbstractC20237f fVar, AbstractC20235d dVar) {
        HashMap hashMap = new HashMap();
        this.mBundleData = hashMap;
        this.mPipes = list;
        this.mIndex = i;
        this.mInterceptorFactory = fVar;
        this.mPreInterceptor = dVar;
        hashMap.put("req_type", 1);
        this.mBundleData.put("sync_task_id", 0);
    }
}
