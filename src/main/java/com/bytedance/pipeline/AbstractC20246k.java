package com.bytedance.pipeline;

import com.bytedance.pipeline.C20243i;

/* renamed from: com.bytedance.pipeline.k */
public abstract class AbstractC20246k<IN, OUT> extends AbstractC20235d<IN, OUT> {

    /* renamed from: a */
    private IN f49523a;

    /* renamed from: b */
    private boolean f49524b = true;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract boolean mo52217a(Throwable th);

    /* JADX WARN: Type inference failed for: r0v0, types: [IN, OUT] */
    /* access modifiers changed from: protected */
    /* renamed from: b */
    public OUT mo52218b() {
        return this.f49523a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final IN mo68511h() {
        return this.f49523a;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.pipeline.AbstractC20235d
    /* renamed from: a */
    public void mo52179a(Object... objArr) {
        super.mo52179a(objArr);
        if (objArr != null && objArr.length > 0) {
            this.f49524b = ((Boolean) objArr[0]).booleanValue();
        }
    }

    @Override // com.bytedance.pipeline.AbstractC20235d
    public final Object a_(AbstractC20233b<OUT> bVar, IN in) throws Throwable {
        this.f49523a = in;
        try {
            return bVar.proceed(mo52218b());
        } catch (C20243i.C20244a e) {
            return m73921a(bVar, in, e.getCause());
        } catch (Throwable th) {
            return m73921a(bVar, in, th);
        }
    }

    /* renamed from: a */
    private Object m73921a(AbstractC20233b<OUT> bVar, IN in, Throwable th) throws Throwable {
        while (mo52217a(th) && this.f49524b) {
            try {
                return bVar.proceed(mo52218b());
            } catch (C20243i.C20244a e) {
                th = e.getCause();
            } catch (Throwable th2) {
                th = th2;
            }
        }
        throw th;
    }
}
