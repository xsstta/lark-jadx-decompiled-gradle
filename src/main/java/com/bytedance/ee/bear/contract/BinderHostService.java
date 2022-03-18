package com.bytedance.ee.bear.contract;

import android.app.Application;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.bytedance.ee.bear.contract.BinderIMarkFeedCallback;
import com.bytedance.ee.bear.contract.BinderIProcessStart;
import com.bytedance.ee.bear.service.exception.InvokeRemoteException;
import com.bytedance.ee.bear.service.remote.AbstractC10957d;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.android.HwBuildEx;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public interface BinderHostService extends IInterface, ak, AbstractC10957d {

    public static abstract class Stub extends Binder implements BinderHostService {
        public IBinder asBinder() {
            return this;
        }

        @Override // com.bytedance.ee.bear.service.base.AbstractC10913a
        public void destroy() {
        }

        @Override // com.bytedance.ee.bear.service.base.AbstractC10913a
        public void init(Application application) {
        }

        public boolean isNewRemoteService() {
            return false;
        }

        @Override // com.bytedance.ee.bear.service.base.AbstractC10913a
        public void lazyInit(Application application) {
        }

        private static class Proxy implements BinderHostService {
            private IBinder mRemote;

            @Override // com.bytedance.ee.bear.service.base.AbstractC10913a
            public void destroy() {
            }

            public String getInterfaceDescriptor() {
                return "com.bytedance.ee.bear.contract.BinderHostService";
            }

            @Override // com.bytedance.ee.bear.service.base.AbstractC10913a
            public void init(Application application) {
            }

            public boolean isNewRemoteService() {
                return false;
            }

            @Override // com.bytedance.ee.bear.service.base.AbstractC10913a
            public void lazyInit(Application application) {
            }

            public IBinder asBinder() {
                return this.mRemote;
            }

            @Override // com.bytedance.ee.bear.contract.ak
            public void fetchEmojis() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.ee.bear.contract.BinderHostService");
                    this.mRemote.transact(14, obtain, obtain2, 0);
                    obtain2.readException();
                    obtain2.recycle();
                    obtain.recycle();
                } catch (RemoteException e) {
                    throw new InvokeRemoteException(e);
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }

            @Override // com.bytedance.ee.bear.contract.ak
            public List<String> getRecentReactionList() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.ee.bear.contract.BinderHostService");
                    this.mRemote.transact(10, obtain, obtain2, 0);
                    obtain2.readException();
                    ArrayList readArrayList = obtain2.readArrayList(getClass().getClassLoader());
                    obtain2.recycle();
                    obtain.recycle();
                    return readArrayList;
                } catch (RemoteException e) {
                    throw new InvokeRemoteException(e);
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }

            @Override // com.bytedance.ee.bear.contract.ak
            public List<String> getWholeReactionList() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.ee.bear.contract.BinderHostService");
                    this.mRemote.transact(11, obtain, obtain2, 0);
                    obtain2.readException();
                    ArrayList readArrayList = obtain2.readArrayList(getClass().getClassLoader());
                    obtain2.recycle();
                    obtain.recycle();
                    return readArrayList;
                } catch (RemoteException e) {
                    throw new InvokeRemoteException(e);
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }

            @Override // com.bytedance.ee.bear.contract.ak
            public void goToCustomService() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.ee.bear.contract.BinderHostService");
                    this.mRemote.transact(17, obtain, obtain2, 0);
                    obtain2.readException();
                    obtain2.recycle();
                    obtain.recycle();
                } catch (RemoteException e) {
                    throw new InvokeRemoteException(e);
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }

            @Override // com.bytedance.ee.bear.contract.ak
            public void goToHelpCenter() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.ee.bear.contract.BinderHostService");
                    this.mRemote.transact(18, obtain, obtain2, 0);
                    obtain2.readException();
                    obtain2.recycle();
                    obtain.recycle();
                } catch (RemoteException e) {
                    throw new InvokeRemoteException(e);
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }

            @Override // com.bytedance.ee.bear.contract.ak
            public void onProcessStart() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.ee.bear.contract.BinderHostService");
                    this.mRemote.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                    obtain2.recycle();
                    obtain.recycle();
                } catch (RemoteException e) {
                    throw new InvokeRemoteException(e);
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }

            @Override // com.bytedance.ee.bear.contract.ak
            public void routeToLarkAbout() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.ee.bear.contract.BinderHostService");
                    this.mRemote.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                    obtain2.recycle();
                    obtain.recycle();
                } catch (RemoteException e) {
                    throw new InvokeRemoteException(e);
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }

            Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // com.bytedance.ee.bear.contract.ak
            public void addProcessStartCallback(BinderIProcessStart binderIProcessStart) {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.ee.bear.contract.BinderHostService");
                    if (binderIProcessStart != null) {
                        iBinder = binderIProcessStart.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    this.mRemote.transact(8, obtain, obtain2, 0);
                    obtain2.readException();
                    obtain2.recycle();
                    obtain.recycle();
                } catch (RemoteException e) {
                    throw new InvokeRemoteException(e);
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }

            @Override // com.bytedance.ee.bear.contract.ak
            public String getEmojiImageFromNet(String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.ee.bear.contract.BinderHostService");
                    obtain.writeString(str);
                    this.mRemote.transact(13, obtain, obtain2, 0);
                    obtain2.readException();
                    String readString = obtain2.readString();
                    obtain2.recycle();
                    obtain.recycle();
                    return readString;
                } catch (RemoteException e) {
                    throw new InvokeRemoteException(e);
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }

            @Override // com.bytedance.ee.bear.contract.ak
            public void handleQrResult(String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.ee.bear.contract.BinderHostService");
                    obtain.writeString(str);
                    this.mRemote.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                    obtain2.recycle();
                    obtain.recycle();
                } catch (RemoteException e) {
                    throw new InvokeRemoteException(e);
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }

            @Override // com.bytedance.ee.bear.contract.ak
            public boolean isFeedCardShortcut(String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.ee.bear.contract.BinderHostService");
                    obtain.writeString(str);
                    boolean z = false;
                    this.mRemote.transact(20, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    obtain2.recycle();
                    obtain.recycle();
                    return z;
                } catch (RemoteException e) {
                    throw new InvokeRemoteException(e);
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }

            @Override // com.bytedance.ee.bear.contract.ak
            public void jumpToLarkFeed(String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.ee.bear.contract.BinderHostService");
                    obtain.writeString(str);
                    this.mRemote.transact(26, obtain, obtain2, 0);
                    obtain2.readException();
                    obtain2.recycle();
                    obtain.recycle();
                } catch (RemoteException e) {
                    throw new InvokeRemoteException(e);
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }

            @Override // com.bytedance.ee.bear.contract.ak
            public String recognizeQRCode(String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.ee.bear.contract.BinderHostService");
                    obtain.writeString(str);
                    this.mRemote.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                    String readString = obtain2.readString();
                    obtain2.recycle();
                    obtain.recycle();
                    return readString;
                } catch (RemoteException e) {
                    throw new InvokeRemoteException(e);
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }

            @Override // com.bytedance.ee.bear.contract.ak
            public void removeProcessStartCallback(BinderIProcessStart binderIProcessStart) {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.ee.bear.contract.BinderHostService");
                    if (binderIProcessStart != null) {
                        iBinder = binderIProcessStart.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    this.mRemote.transact(9, obtain, obtain2, 0);
                    obtain2.readException();
                    obtain2.recycle();
                    obtain.recycle();
                } catch (RemoteException e) {
                    throw new InvokeRemoteException(e);
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }

            @Override // com.bytedance.ee.bear.contract.ak
            public void routeTabDocs(int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.ee.bear.contract.BinderHostService");
                    obtain.writeInt(i);
                    this.mRemote.transact(16, obtain, obtain2, 0);
                    obtain2.readException();
                    obtain2.recycle();
                    obtain.recycle();
                } catch (RemoteException e) {
                    throw new InvokeRemoteException(e);
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }

            @Override // com.bytedance.ee.bear.contract.ak
            public void updateOrder(String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.ee.bear.contract.BinderHostService");
                    obtain.writeString(str);
                    this.mRemote.transact(15, obtain, obtain2, 0);
                    obtain2.readException();
                    obtain2.recycle();
                    obtain.recycle();
                } catch (RemoteException e) {
                    throw new InvokeRemoteException(e);
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }

            @Override // com.bytedance.ee.bear.contract.ak
            public Bundle doCommand(Bundle bundle) {
                Bundle bundle2;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.ee.bear.contract.BinderHostService");
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.mRemote.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        bundle2 = (Bundle) Bundle.CREATOR.createFromParcel(obtain2);
                    } else {
                        bundle2 = null;
                    }
                    obtain2.recycle();
                    obtain.recycle();
                    return bundle2;
                } catch (RemoteException e) {
                    throw new InvokeRemoteException(e);
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }

            @Override // com.bytedance.ee.bear.contract.ak
            public void getResMapFromNet(int i, List<String> list) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.ee.bear.contract.BinderHostService");
                    obtain.writeInt(i);
                    obtain.writeList(list);
                    this.mRemote.transact(12, obtain, obtain2, 0);
                    obtain2.readException();
                    obtain2.recycle();
                    obtain.recycle();
                } catch (RemoteException e) {
                    throw new InvokeRemoteException(e);
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }

            @Override // com.bytedance.ee.bear.contract.ak
            public void goToProfileMain(String str, String str2) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.ee.bear.contract.BinderHostService");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    this.mRemote.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    obtain2.recycle();
                    obtain.recycle();
                } catch (RemoteException e) {
                    throw new InvokeRemoteException(e);
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }

            @Override // com.bytedance.ee.bear.contract.ak
            public void openExternalUrl(String str, Map<String, String> map) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.ee.bear.contract.BinderHostService");
                    obtain.writeString(str);
                    obtain.writeMap(map);
                    this.mRemote.transact(21, obtain, obtain2, 0);
                    obtain2.readException();
                    obtain2.recycle();
                    obtain.recycle();
                } catch (RemoteException e) {
                    throw new InvokeRemoteException(e);
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }

            @Override // com.bytedance.ee.bear.contract.ak
            public void shareTextPlain(String str, String str2) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.ee.bear.contract.BinderHostService");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    this.mRemote.transact(22, obtain, obtain2, 0);
                    obtain2.readException();
                    obtain2.recycle();
                    obtain.recycle();
                } catch (RemoteException e) {
                    throw new InvokeRemoteException(e);
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }

            @Override // com.bytedance.ee.bear.contract.ak
            public void shareImages(String str, String str2, ArrayList<Uri> arrayList) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.ee.bear.contract.BinderHostService");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeList(arrayList);
                    this.mRemote.transact(24, obtain, obtain2, 0);
                    obtain2.readException();
                    obtain2.recycle();
                    obtain.recycle();
                } catch (RemoteException e) {
                    throw new InvokeRemoteException(e);
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }

            @Override // com.bytedance.ee.bear.contract.ak
            public void shareTextPlain(String str, String str2, boolean z) {
                int i;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.ee.bear.contract.BinderHostService");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    if (z) {
                        i = 1;
                    } else {
                        i = 0;
                    }
                    obtain.writeInt(i);
                    this.mRemote.transact(23, obtain, obtain2, 0);
                    obtain2.readException();
                    obtain2.recycle();
                    obtain.recycle();
                } catch (RemoteException e) {
                    throw new InvokeRemoteException(e);
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }

            @Override // com.bytedance.ee.bear.contract.ak
            public void markFeedCardShortcut(boolean z, int i, String str, BinderIMarkFeedCallback binderIMarkFeedCallback) {
                int i2;
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.ee.bear.contract.BinderHostService");
                    if (z) {
                        i2 = 1;
                    } else {
                        i2 = 0;
                    }
                    obtain.writeInt(i2);
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    if (binderIMarkFeedCallback != null) {
                        iBinder = binderIMarkFeedCallback.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    this.mRemote.transact(19, obtain, obtain2, 0);
                    obtain2.readException();
                    obtain2.recycle();
                    obtain.recycle();
                } catch (RemoteException e) {
                    throw new InvokeRemoteException(e);
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }

            @Override // com.bytedance.ee.bear.contract.ak
            public void shareImages(String str, String str2, ArrayList<Uri> arrayList, boolean z) {
                int i;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.ee.bear.contract.BinderHostService");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeList(arrayList);
                    if (z) {
                        i = 1;
                    } else {
                        i = 0;
                    }
                    obtain.writeInt(i);
                    this.mRemote.transact(25, obtain, obtain2, 0);
                    obtain2.readException();
                    obtain2.recycle();
                    obtain.recycle();
                } catch (RemoteException e) {
                    throw new InvokeRemoteException(e);
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }

            @Override // com.bytedance.ee.bear.contract.ak
            public void notifyAnnouncementChange(String str, String str2, boolean z, String str3, IBinder iBinder) {
                int i;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.ee.bear.contract.BinderHostService");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    if (z) {
                        i = 1;
                    } else {
                        i = 0;
                    }
                    obtain.writeInt(i);
                    obtain.writeString(str3);
                    obtain.writeStrongBinder(iBinder);
                    this.mRemote.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    obtain2.recycle();
                    obtain.recycle();
                } catch (RemoteException e) {
                    throw new InvokeRemoteException(e);
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }
        }

        public Stub() {
            attachInterface(this, "com.bytedance.ee.bear.contract.BinderHostService");
        }

        public static BinderHostService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.bytedance.ee.bear.contract.BinderHostService");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof BinderHostService)) {
                return new Proxy(iBinder);
            }
            return (BinderHostService) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            Bundle bundle;
            boolean z;
            if (i != 1598968902) {
                boolean z2 = false;
                switch (i) {
                    case 1:
                        parcel.enforceInterface("com.bytedance.ee.bear.contract.BinderHostService");
                        if (parcel.readInt() != 0) {
                            bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                        } else {
                            bundle = null;
                        }
                        Bundle doCommand = doCommand(bundle);
                        parcel2.writeNoException();
                        if (doCommand != null) {
                            parcel2.writeInt(1);
                            doCommand.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    case 2:
                        parcel.enforceInterface("com.bytedance.ee.bear.contract.BinderHostService");
                        goToProfileMain(parcel.readString(), parcel.readString());
                        parcel2.writeNoException();
                        return true;
                    case 3:
                        parcel.enforceInterface("com.bytedance.ee.bear.contract.BinderHostService");
                        String readString = parcel.readString();
                        String readString2 = parcel.readString();
                        if (parcel.readInt() == 0) {
                            z = false;
                        } else {
                            z = true;
                        }
                        notifyAnnouncementChange(readString, readString2, z, parcel.readString(), parcel.readStrongBinder());
                        parcel2.writeNoException();
                        return true;
                    case 4:
                        parcel.enforceInterface("com.bytedance.ee.bear.contract.BinderHostService");
                        String recognizeQRCode = recognizeQRCode(parcel.readString());
                        parcel2.writeNoException();
                        parcel2.writeString(recognizeQRCode);
                        return true;
                    case 5:
                        parcel.enforceInterface("com.bytedance.ee.bear.contract.BinderHostService");
                        handleQrResult(parcel.readString());
                        parcel2.writeNoException();
                        return true;
                    case 6:
                        parcel.enforceInterface("com.bytedance.ee.bear.contract.BinderHostService");
                        routeToLarkAbout();
                        parcel2.writeNoException();
                        return true;
                    case 7:
                        parcel.enforceInterface("com.bytedance.ee.bear.contract.BinderHostService");
                        onProcessStart();
                        parcel2.writeNoException();
                        return true;
                    case 8:
                        parcel.enforceInterface("com.bytedance.ee.bear.contract.BinderHostService");
                        addProcessStartCallback(BinderIProcessStart.Stub.asInterface(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        return true;
                    case 9:
                        parcel.enforceInterface("com.bytedance.ee.bear.contract.BinderHostService");
                        removeProcessStartCallback(BinderIProcessStart.Stub.asInterface(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        return true;
                    case 10:
                        parcel.enforceInterface("com.bytedance.ee.bear.contract.BinderHostService");
                        List<String> recentReactionList = getRecentReactionList();
                        parcel2.writeNoException();
                        parcel2.writeList(recentReactionList);
                        return true;
                    case 11:
                        parcel.enforceInterface("com.bytedance.ee.bear.contract.BinderHostService");
                        List<String> wholeReactionList = getWholeReactionList();
                        parcel2.writeNoException();
                        parcel2.writeList(wholeReactionList);
                        return true;
                    case HwBuildEx.VersionCodes.EMUI_5_1 /*{ENCODED_INT: 12}*/:
                        parcel.enforceInterface("com.bytedance.ee.bear.contract.BinderHostService");
                        getResMapFromNet(parcel.readInt(), parcel.readArrayList(getClass().getClassLoader()));
                        parcel2.writeNoException();
                        return true;
                    case 13:
                        parcel.enforceInterface("com.bytedance.ee.bear.contract.BinderHostService");
                        String emojiImageFromNet = getEmojiImageFromNet(parcel.readString());
                        parcel2.writeNoException();
                        parcel2.writeString(emojiImageFromNet);
                        return true;
                    case 14:
                        parcel.enforceInterface("com.bytedance.ee.bear.contract.BinderHostService");
                        fetchEmojis();
                        parcel2.writeNoException();
                        return true;
                    case 15:
                        parcel.enforceInterface("com.bytedance.ee.bear.contract.BinderHostService");
                        updateOrder(parcel.readString());
                        parcel2.writeNoException();
                        return true;
                    case 16:
                        parcel.enforceInterface("com.bytedance.ee.bear.contract.BinderHostService");
                        routeTabDocs(parcel.readInt());
                        parcel2.writeNoException();
                        return true;
                    case 17:
                        parcel.enforceInterface("com.bytedance.ee.bear.contract.BinderHostService");
                        goToCustomService();
                        parcel2.writeNoException();
                        return true;
                    case 18:
                        parcel.enforceInterface("com.bytedance.ee.bear.contract.BinderHostService");
                        goToHelpCenter();
                        parcel2.writeNoException();
                        return true;
                    case 19:
                        parcel.enforceInterface("com.bytedance.ee.bear.contract.BinderHostService");
                        if (parcel.readInt() != 0) {
                            z2 = true;
                        }
                        markFeedCardShortcut(z2, parcel.readInt(), parcel.readString(), BinderIMarkFeedCallback.Stub.asInterface(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        return true;
                    case 20:
                        parcel.enforceInterface("com.bytedance.ee.bear.contract.BinderHostService");
                        boolean isFeedCardShortcut = isFeedCardShortcut(parcel.readString());
                        parcel2.writeNoException();
                        parcel2.writeInt(isFeedCardShortcut ? 1 : 0);
                        return true;
                    case 21:
                        parcel.enforceInterface("com.bytedance.ee.bear.contract.BinderHostService");
                        openExternalUrl(parcel.readString(), parcel.readHashMap(getClass().getClassLoader()));
                        parcel2.writeNoException();
                        return true;
                    case 22:
                        parcel.enforceInterface("com.bytedance.ee.bear.contract.BinderHostService");
                        shareTextPlain(parcel.readString(), parcel.readString());
                        parcel2.writeNoException();
                        return true;
                    case 23:
                        parcel.enforceInterface("com.bytedance.ee.bear.contract.BinderHostService");
                        String readString3 = parcel.readString();
                        String readString4 = parcel.readString();
                        if (parcel.readInt() != 0) {
                            z2 = true;
                        }
                        shareTextPlain(readString3, readString4, z2);
                        parcel2.writeNoException();
                        return true;
                    case 24:
                        parcel.enforceInterface("com.bytedance.ee.bear.contract.BinderHostService");
                        shareImages(parcel.readString(), parcel.readString(), parcel.readArrayList(getClass().getClassLoader()));
                        parcel2.writeNoException();
                        return true;
                    case AvailableCode.ERROR_ON_ACTIVITY_RESULT /*{ENCODED_INT: 25}*/:
                        parcel.enforceInterface("com.bytedance.ee.bear.contract.BinderHostService");
                        String readString5 = parcel.readString();
                        String readString6 = parcel.readString();
                        ArrayList readArrayList = parcel.readArrayList(getClass().getClassLoader());
                        if (parcel.readInt() != 0) {
                            z2 = true;
                        }
                        shareImages(readString5, readString6, readArrayList, z2);
                        parcel2.writeNoException();
                        return true;
                    case 26:
                        parcel.enforceInterface("com.bytedance.ee.bear.contract.BinderHostService");
                        jumpToLarkFeed(parcel.readString());
                        parcel2.writeNoException();
                        return true;
                    default:
                        return super.onTransact(i, parcel, parcel2, i2);
                }
            } else {
                parcel2.writeString("com.bytedance.ee.bear.contract.BinderHostService");
                return true;
            }
        }
    }
}
