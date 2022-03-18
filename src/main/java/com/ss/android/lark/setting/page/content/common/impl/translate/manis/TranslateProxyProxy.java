package com.ss.android.lark.setting.page.content.common.impl.translate.manis;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.setting.page.content.common.impl.translate.manis.AbstractC54255a;
import com.ss.android.lark.setting.page.content.common.impl.translate.manis.dto.TransmissionData;

public final class TranslateProxyProxy implements IInterface, TranslateProxy {
    private IBinder mRemote;

    public String getInterfaceDescriptor() {
        return "com.ss.android.lark.setting.page.content.common.impl.translate.manis.TranslateProxy";
    }

    public IBinder asBinder() {
        return this.mRemote;
    }

    @Override // com.ss.android.lark.setting.page.content.common.impl.translate.manis.TranslateProxy
    public void getTargetLangList(AbstractC54255a.AbstractC54256a aVar) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.lark.setting.page.content.common.impl.translate.manis.TranslateProxy");
            if (aVar != null) {
                obtain.writeStrongBinder(new TransmissionDataCallbackStub(aVar).asBinder());
            } else {
                obtain.writeStrongBinder(null);
            }
            this.mRemote.transact(5, obtain, obtain2, 0);
            obtain2.readException();
        } catch (RemoteException e) {
            e.printStackTrace();
            Log.m165385e("TranslateProxyProxy", "call method getTargetLangList throw RemoteException", e, true);
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
        obtain2.recycle();
        obtain.recycle();
    }

    public TranslateProxyProxy(Context context, IBinder iBinder) {
        this.mRemote = iBinder;
    }

    @Override // com.ss.android.lark.setting.page.content.common.impl.translate.manis.TranslateProxy
    public void detectSourceLanguage(TransmissionData transmissionData, AbstractC54255a.AbstractC54256a aVar) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.lark.setting.page.content.common.impl.translate.manis.TranslateProxy");
            if (transmissionData != null) {
                obtain.writeInt(1);
                transmissionData.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            if (aVar != null) {
                obtain.writeStrongBinder(new TransmissionDataCallbackStub(aVar).asBinder());
            } else {
                obtain.writeStrongBinder(null);
            }
            this.mRemote.transact(2, obtain, obtain2, 0);
            obtain2.readException();
        } catch (RemoteException e) {
            e.printStackTrace();
            Log.m165385e("TranslateProxyProxy", "call method detectSourceLanguage throw RemoteException", e, true);
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
        obtain2.recycle();
        obtain.recycle();
    }

    @Override // com.ss.android.lark.setting.page.content.common.impl.translate.manis.TranslateProxy
    public void sendTranslateRequest(TransmissionData transmissionData, AbstractC54255a.AbstractC54256a aVar) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.lark.setting.page.content.common.impl.translate.manis.TranslateProxy");
            if (transmissionData != null) {
                obtain.writeInt(1);
                transmissionData.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            if (aVar != null) {
                obtain.writeStrongBinder(new TransmissionDataCallbackStub(aVar).asBinder());
            } else {
                obtain.writeStrongBinder(null);
            }
            this.mRemote.transact(3, obtain, obtain2, 0);
            obtain2.readException();
        } catch (RemoteException e) {
            e.printStackTrace();
            Log.m165385e("TranslateProxyProxy", "call method sendTranslateRequest throw RemoteException", e, true);
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
        obtain2.recycle();
        obtain.recycle();
    }

    @Override // com.ss.android.lark.setting.page.content.common.impl.translate.manis.TranslateProxy
    public void setAutoTranslate(boolean z, AbstractC54255a.AbstractC54257b bVar) {
        int i;
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.lark.setting.page.content.common.impl.translate.manis.TranslateProxy");
            if (z) {
                i = 1;
            } else {
                i = 0;
            }
            obtain.writeInt(i);
            if (bVar != null) {
                obtain.writeStrongBinder(new VoidCallbackStub(bVar).asBinder());
            } else {
                obtain.writeStrongBinder(null);
            }
            this.mRemote.transact(6, obtain, obtain2, 0);
            obtain2.readException();
        } catch (RemoteException e) {
            e.printStackTrace();
            Log.m165385e("TranslateProxyProxy", "call method setAutoTranslate throw RemoteException", e, true);
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
        obtain2.recycle();
        obtain.recycle();
    }

    @Override // com.ss.android.lark.setting.page.content.common.impl.translate.manis.TranslateProxy
    public void updateGlobalAutoTranslateScope(int i, AbstractC54255a.AbstractC54257b bVar) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.lark.setting.page.content.common.impl.translate.manis.TranslateProxy");
            obtain.writeInt(i);
            if (bVar != null) {
                obtain.writeStrongBinder(new VoidCallbackStub(bVar).asBinder());
            } else {
                obtain.writeStrongBinder(null);
            }
            this.mRemote.transact(1, obtain, obtain2, 0);
            obtain2.readException();
        } catch (RemoteException e) {
            e.printStackTrace();
            Log.m165385e("TranslateProxyProxy", "call method updateGlobalAutoTranslateScope throw RemoteException", e, true);
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
        obtain2.recycle();
        obtain.recycle();
    }

    @Override // com.ss.android.lark.setting.page.content.common.impl.translate.manis.TranslateProxy
    public void getWebTranslateSetting(String str, String str2, AbstractC54255a.AbstractC54256a aVar) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.lark.setting.page.content.common.impl.translate.manis.TranslateProxy");
            obtain.writeString(str);
            obtain.writeString(str2);
            if (aVar != null) {
                obtain.writeStrongBinder(new TransmissionDataCallbackStub(aVar).asBinder());
            } else {
                obtain.writeStrongBinder(null);
            }
            this.mRemote.transact(4, obtain, obtain2, 0);
            obtain2.readException();
        } catch (RemoteException e) {
            e.printStackTrace();
            Log.m165385e("TranslateProxyProxy", "call method getWebTranslateSetting throw RemoteException", e, true);
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
        obtain2.recycle();
        obtain.recycle();
    }

    @Override // com.ss.android.lark.setting.page.content.common.impl.translate.manis.TranslateProxy
    public void setUnTranslateThisLanguage(TransmissionData transmissionData, boolean z, AbstractC54255a.AbstractC54257b bVar) {
        int i;
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.lark.setting.page.content.common.impl.translate.manis.TranslateProxy");
            if (transmissionData != null) {
                obtain.writeInt(1);
                transmissionData.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            if (z) {
                i = 1;
            } else {
                i = 0;
            }
            obtain.writeInt(i);
            if (bVar != null) {
                obtain.writeStrongBinder(new VoidCallbackStub(bVar).asBinder());
            } else {
                obtain.writeStrongBinder(null);
            }
            this.mRemote.transact(7, obtain, obtain2, 0);
            obtain2.readException();
        } catch (RemoteException e) {
            e.printStackTrace();
            Log.m165385e("TranslateProxyProxy", "call method setUnTranslateThisLanguage throw RemoteException", e, true);
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
        obtain2.recycle();
        obtain.recycle();
    }

    @Override // com.ss.android.lark.setting.page.content.common.impl.translate.manis.TranslateProxy
    public void setUnTranslateThisSite(String str, boolean z, AbstractC54255a.AbstractC54257b bVar) {
        int i;
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.lark.setting.page.content.common.impl.translate.manis.TranslateProxy");
            obtain.writeString(str);
            if (z) {
                i = 1;
            } else {
                i = 0;
            }
            obtain.writeInt(i);
            if (bVar != null) {
                obtain.writeStrongBinder(new VoidCallbackStub(bVar).asBinder());
            } else {
                obtain.writeStrongBinder(null);
            }
            this.mRemote.transact(8, obtain, obtain2, 0);
            obtain2.readException();
        } catch (RemoteException e) {
            e.printStackTrace();
            Log.m165385e("TranslateProxyProxy", "call method setUnTranslateThisSite throw RemoteException", e, true);
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
        obtain2.recycle();
        obtain.recycle();
    }
}
