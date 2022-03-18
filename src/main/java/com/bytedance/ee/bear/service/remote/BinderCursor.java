package com.bytedance.ee.bear.service.remote;

import android.database.Cursor;
import android.database.MatrixCursor;
import android.os.Bundle;
import android.os.IBinder;

public class BinderCursor extends MatrixCursor {
    static final String[] DEFAULT_COLUMNS = {"s"};
    private Bundle mBinderExtra;

    public Bundle getExtras() {
        return this.mBinderExtra;
    }

    static BinderCursor makeCursor(IBinder iBinder) {
        return new BinderCursor(DEFAULT_COLUMNS, iBinder);
    }

    static IBinder getBinder(Cursor cursor) {
        Bundle extras = cursor.getExtras();
        extras.setClassLoader(BinderParcel.class.getClassLoader());
        return ((BinderParcel) extras.getParcelable("service_channel")).mo41529a();
    }

    private BinderCursor(String[] strArr, IBinder iBinder) {
        super(strArr);
        Bundle bundle = new Bundle();
        this.mBinderExtra = bundle;
        bundle.putParcelable("service_channel", new BinderParcel(iBinder));
    }
}
