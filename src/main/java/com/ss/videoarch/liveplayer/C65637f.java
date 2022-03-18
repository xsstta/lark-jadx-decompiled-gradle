package com.ss.videoarch.liveplayer;

import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/* renamed from: com.ss.videoarch.liveplayer.f */
public class C65637f implements InvocationHandler {

    /* renamed from: a */
    private final WeakReference<C65638g> f165221a;

    public C65637f(C65638g gVar) {
        this.f165221a = new WeakReference<>(gVar);
    }

    @Override // java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
        C65638g gVar = this.f165221a.get();
        if (gVar == null) {
            return null;
        }
        if (method.getName().equals("updateFrameTerminatedDTS") && objArr.length >= 3) {
            gVar.mo229667a(((Integer) objArr[0]).intValue(), ((Long) objArr[1]).longValue(), ((Long) objArr[2]).longValue());
        } else if (method.getName().equals("frameDTSNotify") && objArr.length >= 3) {
            gVar.mo229673b(((Integer) objArr[0]).intValue(), ((Long) objArr[1]).longValue(), ((Long) objArr[2]).longValue());
        }
        return null;
    }
}
