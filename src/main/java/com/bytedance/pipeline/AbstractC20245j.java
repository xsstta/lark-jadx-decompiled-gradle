package com.bytedance.pipeline;

import com.bytedance.pipeline.AbstractC20247l;
import com.bytedance.pipeline.C20243i;
import java.util.List;

/* renamed from: com.bytedance.pipeline.j */
public abstract class AbstractC20245j<IN, OUT> extends AbstractC20247l<IN, OUT> {

    /* renamed from: a */
    private String f49522a;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract String mo52204a(AbstractC20233b<OUT> bVar, IN in);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract String mo52205a(AbstractC20233b<OUT> bVar, IN in, Throwable th, String str);

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: com.bytedance.pipeline.b<OUT> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.pipeline.AbstractC20235d
    public final Object a_(AbstractC20233b<OUT> bVar, IN in) throws Throwable {
        this.f49522a = mo52204a(new C20250m(bVar), in);
        AbstractC20247l.C20248a aVar = mo52216a().get(this.f49522a);
        while (aVar != null) {
            List<C20240h> list = aVar.f49526a;
            try {
                Object proceed = C20234c.m73893a(list, bVar, this).proceed(in);
                if (!mo68512a(list)) {
                    return proceed;
                }
                return bVar.proceed(proceed);
            } catch (C20243i.C20244a e) {
                this.f49522a = mo52205a(new C20250m(bVar), in, e.getCause(), this.f49522a);
                aVar = mo52216a().get(this.f49522a);
            } catch (Throwable th) {
                this.f49522a = mo52205a(new C20250m(bVar), in, th, this.f49522a);
                aVar = mo52216a().get(this.f49522a);
            }
        }
        throw new IllegalArgumentException("can not found branch，branch name is：" + this.f49522a);
    }
}
