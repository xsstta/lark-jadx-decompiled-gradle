package com.google.android.gms.common.api.internal;

final class cn implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ cm f52820a;

    cn(cm cmVar) {
        this.f52820a = cmVar;
    }

    public final void run() {
        this.f52820a.f52818m.lock();
        try {
            this.f52820a.m78657e();
        } finally {
            this.f52820a.f52818m.unlock();
        }
    }
}
