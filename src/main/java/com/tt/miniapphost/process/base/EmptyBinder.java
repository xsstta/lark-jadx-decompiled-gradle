package com.tt.miniapphost.process.base;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;

public class EmptyBinder extends Binder implements IInterface {
    public IBinder asBinder() {
        return this;
    }

    public EmptyBinder() {
        attachInterface(this, "com.tt.miniapphost.process.base.EmptyBinder");
    }
}
