package com.ss.android.lark.browser.manis;

import android.content.Context;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;
import java.util.Map;

public final class AppConfigStub extends Binder implements IInterface, AppConfig {
    public final AppConfigImpl base;

    public IBinder asBinder() {
        return this;
    }

    @Override // com.ss.android.lark.browser.manis.AppConfig
    public List<String> getJSAPIWhiteList() {
        return this.base.getJSAPIWhiteList();
    }

    @Override // com.ss.android.lark.browser.manis.AppConfig
    public int getSampleTextMaxContentLength() {
        return this.base.getSampleTextMaxContentLength();
    }

    @Override // com.ss.android.lark.browser.manis.AppConfig
    public Map<String, String> getSchemaHandleList() {
        return this.base.getSchemaHandleList();
    }

    @Override // com.ss.android.lark.browser.manis.AppConfig
    public List<String> getSecLinkWhiteList() {
        return this.base.getSecLinkWhiteList();
    }

    @Override // com.ss.android.lark.browser.manis.AppConfig
    public boolean isUrlEnableForWebTranslate(String str) {
        return this.base.isUrlEnableForWebTranslate(str);
    }

    public AppConfigStub(Context context) {
        this.base = new AppConfigImpl(context);
        attachInterface(this, "com.ss.android.lark.browser.manis.AppConfig");
    }

    public static AppConfigProxy asInterface(Context context, IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.ss.android.lark.browser.manis.AppConfig");
        if (queryLocalInterface == null || !(queryLocalInterface instanceof AppConfigProxy)) {
            return new AppConfigProxy(context, iBinder);
        }
        return (AppConfigProxy) queryLocalInterface;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            parcel.enforceInterface("com.ss.android.lark.browser.manis.AppConfig");
            Map<String, String> schemaHandleList = getSchemaHandleList();
            parcel2.writeNoException();
            parcel2.writeMap(schemaHandleList);
            return true;
        } else if (i == 2) {
            parcel.enforceInterface("com.ss.android.lark.browser.manis.AppConfig");
            List<String> secLinkWhiteList = getSecLinkWhiteList();
            parcel2.writeNoException();
            parcel2.writeList(secLinkWhiteList);
            return true;
        } else if (i == 3) {
            parcel.enforceInterface("com.ss.android.lark.browser.manis.AppConfig");
            List<String> jSAPIWhiteList = getJSAPIWhiteList();
            parcel2.writeNoException();
            parcel2.writeList(jSAPIWhiteList);
            return true;
        } else if (i == 4) {
            parcel.enforceInterface("com.ss.android.lark.browser.manis.AppConfig");
            int sampleTextMaxContentLength = getSampleTextMaxContentLength();
            parcel2.writeNoException();
            parcel2.writeInt(sampleTextMaxContentLength);
            return true;
        } else if (i == 5) {
            parcel.enforceInterface("com.ss.android.lark.browser.manis.AppConfig");
            boolean isUrlEnableForWebTranslate = isUrlEnableForWebTranslate(parcel.readString());
            parcel2.writeNoException();
            parcel2.writeInt(isUrlEnableForWebTranslate ? 1 : 0);
            return true;
        } else if (i != 1598968902) {
            return super.onTransact(i, parcel, parcel2, i2);
        } else {
            parcel2.writeString("com.ss.android.lark.browser.manis.AppConfig");
            return true;
        }
    }
}
