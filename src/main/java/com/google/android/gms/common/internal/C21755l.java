package com.google.android.gms.common.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.view.View;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.RemoteCreator;

/* renamed from: com.google.android.gms.common.internal.l */
public final class C21755l extends RemoteCreator<ISignInButtonCreator> {

    /* renamed from: a */
    private static final C21755l f53096a = new C21755l();

    private C21755l() {
        super("com.google.android.gms.common.ui.SignInButtonCreatorImpl");
    }

    /* renamed from: a */
    public static View m79005a(Context context, int i, int i2) throws RemoteCreator.RemoteCreatorException {
        return f53096a.m79006b(context, i, i2);
    }

    /* renamed from: b */
    private final View m79006b(Context context, int i, int i2) throws RemoteCreator.RemoteCreatorException {
        try {
            SignInButtonConfig signInButtonConfig = new SignInButtonConfig(i, i2, null);
            return (View) ObjectWrapper.unwrap(((ISignInButtonCreator) mo73875a(context)).newSignInButtonFromConfig(ObjectWrapper.wrap(context), signInButtonConfig));
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder(64);
            sb.append("Could not get button with size ");
            sb.append(i);
            sb.append(" and color ");
            sb.append(i2);
            throw new RemoteCreator.RemoteCreatorException(sb.toString(), e);
        }
    }

    /* renamed from: a */
    public final ISignInButtonCreator mo73728b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ISignInButtonCreator");
        if (queryLocalInterface instanceof ISignInButtonCreator) {
            return (ISignInButtonCreator) queryLocalInterface;
        }
        return new zah(iBinder);
    }
}
