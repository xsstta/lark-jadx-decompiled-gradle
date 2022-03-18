package com.android.installreferrer.api;

import android.content.Context;
import android.os.RemoteException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public abstract class InstallReferrerClient {

    @Retention(RetentionPolicy.SOURCE)
    public @interface InstallReferrerResponse {
    }

    /* renamed from: a */
    public abstract void mo9716a(AbstractC1917a aVar);

    /* renamed from: a */
    public abstract boolean mo9717a();

    /* renamed from: b */
    public abstract void mo9718b();

    /* renamed from: c */
    public abstract C1918b mo9719c() throws RemoteException;

    /* renamed from: com.android.installreferrer.api.InstallReferrerClient$a */
    public static final class C1914a {

        /* renamed from: a */
        private final Context f6550a;

        /* renamed from: a */
        public InstallReferrerClient mo9720a() {
            Context context = this.f6550a;
            if (context != null) {
                return new InstallReferrerClientImpl(context);
            }
            throw new IllegalArgumentException("Please provide a valid Context.");
        }

        private C1914a(Context context) {
            this.f6550a = context;
        }
    }

    /* renamed from: a */
    public static C1914a m8543a(Context context) {
        return new C1914a(context);
    }
}
