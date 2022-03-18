package com.google.android.play.core.tasks;

import com.google.android.play.core.splitcompat.C22679r;
import java.util.concurrent.ExecutionException;

/* renamed from: com.google.android.play.core.tasks.c */
public final class C22731c {
    /* renamed from: a */
    public static <ResultT> Task<ResultT> m82677a(Exception exc) {
        C22744p pVar = new C22744p();
        pVar.mo79095a(exc);
        return pVar;
    }

    /* renamed from: a */
    public static <ResultT> Task<ResultT> m82678a(ResultT resultt) {
        C22744p pVar = new C22744p();
        pVar.mo79096a((Object) resultt);
        return pVar;
    }

    /* renamed from: a */
    public static <ResultT> ResultT m82679a(Task<ResultT> task) throws ExecutionException, InterruptedException {
        C22679r.m82539a(task, "Task must not be null");
        if (task.isComplete()) {
            return (ResultT) m82681b(task);
        }
        C22745q qVar = new C22745q(null);
        m82680a(task, qVar);
        qVar.mo79099a();
        return (ResultT) m82681b(task);
    }

    /* renamed from: a */
    private static void m82680a(Task<?> task, C22745q qVar) {
        task.addOnSuccessListener(C22730b.f56247b, qVar);
        task.addOnFailureListener(C22730b.f56247b, qVar);
    }

    /* renamed from: b */
    private static <ResultT> ResultT m82681b(Task<ResultT> task) throws ExecutionException {
        if (task.isSuccessful()) {
            return task.getResult();
        }
        throw new ExecutionException(task.getException());
    }
}
