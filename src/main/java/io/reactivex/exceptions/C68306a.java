package io.reactivex.exceptions;

import io.reactivex.internal.util.C68981f;

/* renamed from: io.reactivex.exceptions.a */
public final class C68306a {
    /* renamed from: a */
    public static RuntimeException m265070a(Throwable th) {
        throw C68981f.m265557a(th);
    }

    /* renamed from: b */
    public static void m265071b(Throwable th) {
        if (th instanceof VirtualMachineError) {
            throw ((VirtualMachineError) th);
        } else if (th instanceof ThreadDeath) {
            throw ((ThreadDeath) th);
        } else if (th instanceof LinkageError) {
            throw ((LinkageError) th);
        }
    }
}
