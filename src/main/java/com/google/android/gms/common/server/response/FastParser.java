package com.google.android.gms.common.server.response;

import com.google.android.gms.common.server.response.FastJsonResponse;
import java.math.BigDecimal;
import java.math.BigInteger;

public class FastParser<T extends FastJsonResponse> {

    /* renamed from: a */
    private static final char[] f53146a = {'u', 'l', 'l'};

    /* renamed from: b */
    private static final char[] f53147b = {'r', 'u', 'e'};

    /* renamed from: c */
    private static final char[] f53148c = {'r', 'u', 'e', '\"'};

    /* renamed from: d */
    private static final char[] f53149d = {'a', 'l', 's', 'e'};

    /* renamed from: e */
    private static final char[] f53150e = {'a', 'l', 's', 'e', '\"'};

    /* renamed from: f */
    private static final char[] f53151f = {'\n'};

    /* renamed from: g */
    private static final AbstractC21788a<Integer> f53152g = new C21789a();

    /* renamed from: h */
    private static final AbstractC21788a<Long> f53153h = new C21790b();

    /* renamed from: i */
    private static final AbstractC21788a<Float> f53154i = new C21791c();

    /* renamed from: j */
    private static final AbstractC21788a<Double> f53155j = new C21792d();

    /* renamed from: k */
    private static final AbstractC21788a<Boolean> f53156k = new C21793e();

    /* renamed from: l */
    private static final AbstractC21788a<String> f53157l = new C21794f();

    /* renamed from: m */
    private static final AbstractC21788a<BigInteger> f53158m = new C21795g();

    /* renamed from: n */
    private static final AbstractC21788a<BigDecimal> f53159n = new C21796h();

    /* access modifiers changed from: private */
    /* renamed from: com.google.android.gms.common.server.response.FastParser$a */
    public interface AbstractC21788a<O> {
    }

    public static class ParseException extends Exception {
        public ParseException(String str) {
            super(str);
        }

        public ParseException(String str, Throwable th) {
            super(str, th);
        }

        public ParseException(Throwable th) {
            super(th);
        }
    }
}
