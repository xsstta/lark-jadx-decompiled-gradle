package com.google.android.datatransport.runtime.p972b;

/* renamed from: com.google.android.datatransport.runtime.b.b */
public final class C21404b {
    /* renamed from: a */
    public static <TInput, TResult, TException extends Throwable> TResult m77461a(int i, TInput tinput, AbstractC21403a<TInput, TResult, TException> aVar, AbstractC21405c<TInput, TResult> cVar) throws Throwable {
        TResult a;
        if (i < 1) {
            return aVar.mo72594a(tinput);
        }
        do {
            a = aVar.mo72594a(tinput);
            tinput = cVar.mo72595a(tinput, a);
            if (tinput == null) {
                break;
            }
            i--;
        } while (i >= 1);
        return a;
    }
}
