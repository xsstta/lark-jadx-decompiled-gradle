package com.bytedance.ee.bear.net;

import com.bytedance.ee.bear.net.ServerResult;
import io.reactivex.functions.Function;
import java.util.List;

/* renamed from: com.bytedance.ee.bear.net.d */
public class C10277d<T extends ServerResult> implements Function<T, T> {

    /* renamed from: a */
    private final List<AbstractC10300u> f27753a;

    /* renamed from: b */
    private final String f27754b;

    /* renamed from: a */
    public T apply(T t) throws Exception {
        List<AbstractC10300u> list;
        int code = t.getCode();
        if (code == 5 && (list = this.f27753a) != null) {
            for (AbstractC10300u uVar : list) {
                uVar.mo30719a(this.f27754b);
            }
        }
        if (code == 0) {
            return t;
        }
        if (t instanceof RawServerResult) {
            throw new ServerResultException(code, t.getMsg(), t.getData(), ((RawServerResult) t).getJson());
        }
        throw new ServerResultException(code, t.getMsg(), t.getData(), "");
    }

    C10277d(String str, List<AbstractC10300u> list) {
        this.f27753a = list;
        this.f27754b = str;
    }
}
