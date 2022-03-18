package com.bytedance.pipeline;

import java.io.Serializable;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.pipeline.m */
public final class C20250m<IN> implements AbstractC20233b<IN>, Serializable {
    private AbstractC20233b<IN> mChain;

    @Override // com.bytedance.pipeline.AbstractC20233b
    public Object restart() throws Exception {
        return this.mChain.restart();
    }

    public Object resume() throws Exception {
        throw new UnsupportedOperationException();
    }

    public C20250m(AbstractC20233b<IN> bVar) {
        this.mChain = bVar;
    }

    @Override // com.bytedance.pipeline.AbstractC20233b
    public <I> I getInputForType(Class<? extends AbstractC20235d<I, ?>> cls) {
        return (I) this.mChain.getInputForType(cls);
    }

    @Override // com.bytedance.pipeline.AbstractC20233b
    public <T> T getInterceptorByType(Class<? extends AbstractC20235d> cls) {
        return (T) this.mChain.getInterceptorByType(cls);
    }

    @Override // com.bytedance.pipeline.AbstractC20233b
    public <O> O getOutputForType(Class<? extends AbstractC20235d<?, O>> cls) {
        return (O) this.mChain.getOutputForType(cls);
    }

    @Override // com.bytedance.pipeline.AbstractC20233b
    public Object getPipelineData(String str) {
        return this.mChain.getPipelineData(str);
    }

    @Override // com.bytedance.pipeline.AbstractC20233b
    public Object proceed(IN in) throws Exception {
        return this.mChain.proceed(in);
    }

    @Override // com.bytedance.pipeline.AbstractC20233b
    public void setPipelineData(String str, Object obj) {
        this.mChain.setPipelineData(str, obj);
    }
}
