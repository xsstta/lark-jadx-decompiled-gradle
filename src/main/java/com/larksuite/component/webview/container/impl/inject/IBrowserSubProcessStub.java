package com.larksuite.component.webview.container.impl.inject;

import android.content.Context;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.larksuite.component.webview.container.impl.jsapi.InjectJSApiWrapper;
import com.larksuite.component.webview.container.impl.mvp.InjectWebViewDelegateWrapper;
import com.larksuite.component.webview.container.impl.queryapi.InjectQueryApiWrapper;
import java.util.ArrayList;

public final class IBrowserSubProcessStub extends Binder implements IInterface, IBrowserSubProcess {
    public final BrowserSubProcessImpl base;

    public IBinder asBinder() {
        return this;
    }

    @Override // com.larksuite.component.webview.container.impl.inject.IBrowserSubProcess
    public void finishInjection(String str) {
        this.base.finishInjection(str);
    }

    @Override // com.larksuite.component.webview.container.impl.inject.IBrowserSubProcess
    public void startInjection(String str) {
        this.base.startInjection(str);
    }

    public IBrowserSubProcessStub(Context context) {
        this.base = new BrowserSubProcessImpl(context);
        attachInterface(this, "com.larksuite.component.webview.container.impl.inject.IBrowserSubProcess");
    }

    @Override // com.larksuite.component.webview.container.impl.inject.IBrowserSubProcess
    public void registerJSApiHandler(String str, ArrayList<InjectJSApiWrapper> arrayList) {
        this.base.registerJSApiHandler(str, arrayList);
    }

    @Override // com.larksuite.component.webview.container.impl.inject.IBrowserSubProcess
    public void registerQueryApiHandler(String str, ArrayList<InjectQueryApiWrapper> arrayList) {
        this.base.registerQueryApiHandler(str, arrayList);
    }

    @Override // com.larksuite.component.webview.container.impl.inject.IBrowserSubProcess
    public void registerWebViewDelegate(String str, InjectWebViewDelegateWrapper injectWebViewDelegateWrapper) {
        this.base.registerWebViewDelegate(str, injectWebViewDelegateWrapper);
    }

    public static IBrowserSubProcessProxy asInterface(Context context, IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.larksuite.component.webview.container.impl.inject.IBrowserSubProcess");
        if (queryLocalInterface == null || !(queryLocalInterface instanceof IBrowserSubProcessProxy)) {
            return new IBrowserSubProcessProxy(context, iBinder);
        }
        return (IBrowserSubProcessProxy) queryLocalInterface;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        InjectWebViewDelegateWrapper injectWebViewDelegateWrapper;
        if (i == 1) {
            parcel.enforceInterface("com.larksuite.component.webview.container.impl.inject.IBrowserSubProcess");
            startInjection(parcel.readString());
            parcel2.writeNoException();
            return true;
        } else if (i == 2) {
            parcel.enforceInterface("com.larksuite.component.webview.container.impl.inject.IBrowserSubProcess");
            registerJSApiHandler(parcel.readString(), parcel.readArrayList(getClass().getClassLoader()));
            parcel2.writeNoException();
            return true;
        } else if (i == 3) {
            parcel.enforceInterface("com.larksuite.component.webview.container.impl.inject.IBrowserSubProcess");
            registerQueryApiHandler(parcel.readString(), parcel.readArrayList(getClass().getClassLoader()));
            parcel2.writeNoException();
            return true;
        } else if (i == 4) {
            parcel.enforceInterface("com.larksuite.component.webview.container.impl.inject.IBrowserSubProcess");
            String readString = parcel.readString();
            if (parcel.readInt() != 0) {
                injectWebViewDelegateWrapper = InjectWebViewDelegateWrapper.CREATOR.createFromParcel(parcel);
            } else {
                injectWebViewDelegateWrapper = null;
            }
            registerWebViewDelegate(readString, injectWebViewDelegateWrapper);
            parcel2.writeNoException();
            return true;
        } else if (i == 5) {
            parcel.enforceInterface("com.larksuite.component.webview.container.impl.inject.IBrowserSubProcess");
            finishInjection(parcel.readString());
            parcel2.writeNoException();
            return true;
        } else if (i != 1598968902) {
            return super.onTransact(i, parcel, parcel2, i2);
        } else {
            parcel2.writeString("com.larksuite.component.webview.container.impl.inject.IBrowserSubProcess");
            return true;
        }
    }
}
