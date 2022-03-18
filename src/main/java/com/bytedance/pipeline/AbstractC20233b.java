package com.bytedance.pipeline;

/* renamed from: com.bytedance.pipeline.b */
public interface AbstractC20233b<IN> {
    <I> I getInputForType(Class<? extends AbstractC20235d<I, ?>> cls);

    <T> T getInterceptorByType(Class<? extends AbstractC20235d> cls);

    <O> O getOutputForType(Class<? extends AbstractC20235d<?, O>> cls);

    Object getPipelineData(String str);

    Object proceed(IN in) throws Exception;

    Object restart() throws Exception;

    void setPipelineData(String str, Object obj);
}
