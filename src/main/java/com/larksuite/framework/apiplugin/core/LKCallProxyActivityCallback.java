package com.larksuite.framework.apiplugin.core;

import android.app.Activity;
import android.os.Parcelable;
import java.io.Serializable;

public interface LKCallProxyActivityCallback extends Parcelable, Serializable {
    void onCreated(Activity activity);
}
