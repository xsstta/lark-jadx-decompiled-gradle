package com.google.android.gms.dynamic;

import android.content.Context;
import android.os.IBinder;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.internal.Preconditions;

public abstract class RemoteCreator<T> {

    /* renamed from: a */
    private final String f53225a;

    /* renamed from: b */
    private T f53226b;

    protected RemoteCreator(String str) {
        this.f53225a = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract T mo73728b(IBinder iBinder);

    public static class RemoteCreatorException extends Exception {
        public RemoteCreatorException(String str) {
            super(str);
        }

        public RemoteCreatorException(String str, Throwable th) {
            super(str, th);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final T mo73875a(Context context) throws RemoteCreatorException {
        if (this.f53226b == null) {
            Preconditions.checkNotNull(context);
            Context remoteContext = GooglePlayServicesUtilLight.getRemoteContext(context);
            if (remoteContext != null) {
                try {
                    this.f53226b = mo73728b((IBinder) remoteContext.getClassLoader().loadClass(this.f53225a).newInstance());
                } catch (ClassNotFoundException e) {
                    throw new RemoteCreatorException("Could not load creator class.", e);
                } catch (InstantiationException e2) {
                    throw new RemoteCreatorException("Could not instantiate creator.", e2);
                } catch (IllegalAccessException e3) {
                    throw new RemoteCreatorException("Could not access creator.", e3);
                }
            } else {
                throw new RemoteCreatorException("Could not get remote context.");
            }
        }
        return this.f53226b;
    }
}
