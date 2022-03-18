package com.ss.android.lark.ug.dyflow.common;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.ss.android.lark.ug.dyflow.common.data.FlowStepData;

public interface IFlowStepDelegate extends IInterface {

    public static class Default implements IFlowStepDelegate {
        public IBinder asBinder() {
            return null;
        }

        @Override // com.ss.android.lark.ug.dyflow.common.IFlowStepDelegate
        public String getFlowParam(String str) throws RemoteException {
            return null;
        }

        @Override // com.ss.android.lark.ug.dyflow.common.IFlowStepDelegate
        public FlowStepData getStepData() throws RemoteException {
            return null;
        }

        @Override // com.ss.android.lark.ug.dyflow.common.IFlowStepDelegate
        public boolean handleSlotAction(String str, boolean z) throws RemoteException {
            return false;
        }

        @Override // com.ss.android.lark.ug.dyflow.common.IFlowStepDelegate
        public void notifyExtExit(int i, String str) throws RemoteException {
        }

        @Override // com.ss.android.lark.ug.dyflow.common.IFlowStepDelegate
        public boolean runStep(String str) throws RemoteException {
            return false;
        }
    }

    public static abstract class Stub extends Binder implements IFlowStepDelegate {
        public IBinder asBinder() {
            return this;
        }

        /* access modifiers changed from: private */
        public static class Proxy implements IFlowStepDelegate {
            public static IFlowStepDelegate sDefaultImpl;
            private IBinder mRemote;

            public String getInterfaceDescriptor() {
                return "com.ss.android.lark.ug.dyflow.common.IFlowStepDelegate";
            }

            public IBinder asBinder() {
                return this.mRemote;
            }

            @Override // com.ss.android.lark.ug.dyflow.common.IFlowStepDelegate
            public FlowStepData getStepData() throws RemoteException {
                FlowStepData flowStepData;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.lark.ug.dyflow.common.IFlowStepDelegate");
                    if (!this.mRemote.transact(1, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getStepData();
                    }
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        flowStepData = FlowStepData.CREATOR.createFromParcel(obtain2);
                    } else {
                        flowStepData = null;
                    }
                    obtain2.recycle();
                    obtain.recycle();
                    return flowStepData;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // com.ss.android.lark.ug.dyflow.common.IFlowStepDelegate
            public String getFlowParam(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.lark.ug.dyflow.common.IFlowStepDelegate");
                    obtain.writeString(str);
                    if (!this.mRemote.transact(3, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getFlowParam(str);
                    }
                    obtain2.readException();
                    String readString = obtain2.readString();
                    obtain2.recycle();
                    obtain.recycle();
                    return readString;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.lark.ug.dyflow.common.IFlowStepDelegate
            public boolean runStep(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.lark.ug.dyflow.common.IFlowStepDelegate");
                    obtain.writeString(str);
                    boolean z = false;
                    if (!this.mRemote.transact(2, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().runStep(str);
                    }
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    obtain2.recycle();
                    obtain.recycle();
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.lark.ug.dyflow.common.IFlowStepDelegate
            public boolean handleSlotAction(String str, boolean z) throws RemoteException {
                int i;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.lark.ug.dyflow.common.IFlowStepDelegate");
                    obtain.writeString(str);
                    boolean z2 = true;
                    if (z) {
                        i = 1;
                    } else {
                        i = 0;
                    }
                    obtain.writeInt(i);
                    if (!this.mRemote.transact(4, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().handleSlotAction(str, z);
                    }
                    obtain2.readException();
                    if (obtain2.readInt() == 0) {
                        z2 = false;
                    }
                    obtain2.recycle();
                    obtain.recycle();
                    return z2;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.lark.ug.dyflow.common.IFlowStepDelegate
            public void notifyExtExit(int i, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.lark.ug.dyflow.common.IFlowStepDelegate");
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    if (this.mRemote.transact(5, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().notifyExtExit(i, str);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public static IFlowStepDelegate getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public Stub() {
            attachInterface(this, "com.ss.android.lark.ug.dyflow.common.IFlowStepDelegate");
        }

        public static IFlowStepDelegate asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.ss.android.lark.ug.dyflow.common.IFlowStepDelegate");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof IFlowStepDelegate)) {
                return new Proxy(iBinder);
            }
            return (IFlowStepDelegate) queryLocalInterface;
        }

        public static boolean setDefaultImpl(IFlowStepDelegate iFlowStepDelegate) {
            if (Proxy.sDefaultImpl != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            } else if (iFlowStepDelegate == null) {
                return false;
            } else {
                Proxy.sDefaultImpl = iFlowStepDelegate;
                return true;
            }
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            boolean z = false;
            if (i == 1) {
                parcel.enforceInterface("com.ss.android.lark.ug.dyflow.common.IFlowStepDelegate");
                FlowStepData stepData = getStepData();
                parcel2.writeNoException();
                if (stepData != null) {
                    parcel2.writeInt(1);
                    stepData.writeToParcel(parcel2, 1);
                } else {
                    parcel2.writeInt(0);
                }
                return true;
            } else if (i == 2) {
                parcel.enforceInterface("com.ss.android.lark.ug.dyflow.common.IFlowStepDelegate");
                boolean runStep = runStep(parcel.readString());
                parcel2.writeNoException();
                parcel2.writeInt(runStep ? 1 : 0);
                return true;
            } else if (i == 3) {
                parcel.enforceInterface("com.ss.android.lark.ug.dyflow.common.IFlowStepDelegate");
                String flowParam = getFlowParam(parcel.readString());
                parcel2.writeNoException();
                parcel2.writeString(flowParam);
                return true;
            } else if (i == 4) {
                parcel.enforceInterface("com.ss.android.lark.ug.dyflow.common.IFlowStepDelegate");
                String readString = parcel.readString();
                if (parcel.readInt() != 0) {
                    z = true;
                }
                boolean handleSlotAction = handleSlotAction(readString, z);
                parcel2.writeNoException();
                parcel2.writeInt(handleSlotAction ? 1 : 0);
                return true;
            } else if (i == 5) {
                parcel.enforceInterface("com.ss.android.lark.ug.dyflow.common.IFlowStepDelegate");
                notifyExtExit(parcel.readInt(), parcel.readString());
                parcel2.writeNoException();
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("com.ss.android.lark.ug.dyflow.common.IFlowStepDelegate");
                return true;
            }
        }
    }

    String getFlowParam(String str) throws RemoteException;

    FlowStepData getStepData() throws RemoteException;

    boolean handleSlotAction(String str, boolean z) throws RemoteException;

    void notifyExtExit(int i, String str) throws RemoteException;

    boolean runStep(String str) throws RemoteException;
}
