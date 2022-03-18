package com.bytedance.pipeline;

import com.bytedance.pipeline.AbstractC20247l;
import java.util.List;

/* renamed from: com.bytedance.pipeline.a */
public abstract class AbstractC20230a<IN, OUT> extends AbstractC20247l<IN, OUT> {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract String mo52189a(AbstractC20233b<OUT> bVar, IN in);

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.bytedance.pipeline.b<OUT> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.pipeline.AbstractC20235d
    public final Object a_(AbstractC20233b<OUT> bVar, IN in) throws Throwable {
        String a = mo52189a(new C20250m(bVar), in);
        AbstractC20247l.C20248a aVar = mo52216a().get(a);
        if (aVar != null) {
            List<C20240h> list = aVar.f49526a;
            Object proceed = C20234c.m73893a(list, bVar, this).proceed(in);
            if (!mo68512a(list)) {
                return proceed;
            }
            return bVar.proceed(proceed);
        }
        throw new IllegalArgumentException("can not found branch, branch name is：" + a);
    }
}
