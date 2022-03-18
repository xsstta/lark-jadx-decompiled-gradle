package com.ss.android.lark.passport.signinsdk_api.interfaces;

import android.content.Context;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.passport.signinsdk_api.entity.DeviceId;
import org.json.JSONObject;

/* renamed from: com.ss.android.lark.passport.signinsdk_api.interfaces.d */
public interface AbstractC49390d {

    /* renamed from: com.ss.android.lark.passport.signinsdk_api.interfaces.d$a */
    public interface AbstractC49391a {
        void onDeviceIdChange(String str);
    }

    void addDeviceIdChangeListener(AbstractC49391a aVar);

    void clearAppLogDidCache();

    String getDeviceId();

    void getDeviceId(Context context, IGetDataCallback<DeviceId> iGetDataCallback);

    void getDeviceId(Context context, IGetDataCallback<DeviceId> iGetDataCallback, long j);

    String getDeviceIdFromLocal();

    String getDeviceIdFromLocalByUnit(String str);

    JSONObject getDeviceInfo(Context context);

    String getInstallId();

    boolean removeDeviceIdChangeListener(AbstractC49391a aVar);
}
