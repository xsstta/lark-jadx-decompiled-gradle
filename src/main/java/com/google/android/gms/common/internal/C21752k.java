package com.google.android.gms.common.internal;

import com.google.android.gms.common.api.AbstractC21635e;
import com.google.android.gms.common.api.AbstractC21641i;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.C21640h;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: com.google.android.gms.common.internal.k */
public class C21752k {

    /* renamed from: a */
    private static final AbstractC21754b f53095a = new C21772t();

    /* renamed from: com.google.android.gms.common.internal.k$a */
    public interface AbstractC21753a<R extends AbstractC21641i, T> {
        /* renamed from: a */
        T mo73066a(R r);
    }

    /* renamed from: com.google.android.gms.common.internal.k$b */
    public interface AbstractC21754b {
        /* renamed from: a */
        ApiException mo73726a(Status status);
    }

    /* renamed from: a */
    public static <R extends AbstractC21641i, T> Task<T> m79002a(AbstractC21635e<R> eVar, AbstractC21753a<R, T> aVar) {
        AbstractC21754b bVar = f53095a;
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        eVar.mo73291a(new C21773u(eVar, taskCompletionSource, aVar, bVar));
        return taskCompletionSource.getTask();
    }

    /* renamed from: a */
    public static <R extends AbstractC21641i, T extends C21640h<R>> Task<T> m79001a(AbstractC21635e<R> eVar, T t) {
        return m79002a(eVar, new C21774v(t));
    }

    /* renamed from: a */
    public static <R extends AbstractC21641i> Task<Void> m79000a(AbstractC21635e<R> eVar) {
        return m79002a(eVar, new C21775w());
    }
}
