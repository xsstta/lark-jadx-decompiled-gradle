package com.larksuite.component.webview.container.impl.inject;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.larksuite.component.webview.container.impl.jsapi.InjectJSApiWrapper;
import com.larksuite.component.webview.container.impl.mvp.InjectWebViewDelegateWrapper;
import com.larksuite.component.webview.container.impl.queryapi.InjectQueryApiWrapper;
import com.ss.android.lark.log.Log;
import java.util.ArrayList;

public final class IBrowserSubProcessProxy implements IInterface, IBrowserSubProcess {
    private IBinder mRemote;

    public String getInterfaceDescriptor() {
        return "com.larksuite.component.webview.container.impl.inject.IBrowserSubProcess";
    }

    public IBinder asBinder() {
        return this.mRemote;
    }

    @Override // com.larksuite.component.webview.container.impl.inject.IBrowserSubProcess
    public void finishInjection(String str) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.larksuite.component.webview.container.impl.inject.IBrowserSubProcess");
            obtain.writeString(str);
            this.mRemote.transact(5, obtain, obtain2, 0);
            obtain2.readException();
        } catch (RemoteException e) {
            e.printStackTrace();
            Log.m165385e("IBrowserSubProcessProxy", "call method finishInjection throw RemoteException", e, true);
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
        obtain2.recycle();
        obtain.recycle();
    }

    @Override // com.larksuite.component.webview.container.impl.inject.IBrowserSubProcess
    public void startInjection(String str) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.larksuite.component.webview.container.impl.inject.IBrowserSubProcess");
            obtain.writeString(str);
            this.mRemote.transact(1, obtain, obtain2, 0);
            obtain2.readException();
        } catch (RemoteException e) {
            e.printStackTrace();
            Log.m165385e("IBrowserSubProcessProxy", "call method startInjection throw RemoteException", e, true);
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
        obtain2.recycle();
        obtain.recycle();
    }

    public IBrowserSubProcessProxy(Context context, IBinder iBinder) {
        this.mRemote = iBinder;
    }

    @Override // com.larksuite.component.webview.container.impl.inject.IBrowserSubProcess
    public void registerJSApiHandler(String str, ArrayList<InjectJSApiWrapper> arrayList) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.larksuite.component.webview.container.impl.inject.IBrowserSubProcess");
            obtain.writeString(str);
            obtain.writeList(arrayList);
            this.mRemote.transact(2, obtain, obtain2, 0);
            obtain2.readException();
        } catch (RemoteException e) {
            e.printStackTrace();
            Log.m165385e("IBrowserSubProcessProxy", "call method registerJSApiHandler throw RemoteException", e, true);
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
        obtain2.recycle();
        obtain.recycle();
    }

    @Override // com.larksuite.component.webview.container.impl.inject.IBrowserSubProcess
    public void registerQueryApiHandler(String str, ArrayList<InjectQueryApiWrapper> arrayList) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.larksuite.component.webview.container.impl.inject.IBrowserSubProcess");
            obtain.writeString(str);
            obtain.writeList(arrayList);
            this.mRemote.transact(3, obtain, obtain2, 0);
            obtain2.readException();
        } catch (RemoteException e) {
            e.printStackTrace();
            Log.m165385e("IBrowserSubProcessProxy", "call method registerQueryApiHandler throw RemoteException", e, true);
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
        obtain2.recycle();
        obtain.recycle();
    }

    @Override // com.larksuite.component.webview.container.impl.inject.IBrowserSubProcess
    public void registerWebViewDelegate(String str, InjectWebViewDelegateWrapper injectWebViewDelegateWrapper) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.larksuite.component.webview.container.impl.inject.IBrowserSubProcess");
            obtain.writeString(str);
            if (injectWebViewDelegateWrapper != null) {
                obtain.writeInt(1);
                injectWebViewDelegateWrapper.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.mRemote.transact(4, obtain, obtain2, 0);
            obtain2.readException();
        } catch (RemoteException e) {
            e.printStackTrace();
            Log.m165385e("IBrowserSubProcessProxy", "call method registerWebViewDelegate throw RemoteException", e, true);
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
        obtain2.recycle();
        obtain.recycle();
    }
}
