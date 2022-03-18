package com.ss.android.lark.passport.device.service.impl.deviceid;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.i18n.claymore.ClaymoreImpl;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.utils.C26255ag;
import com.ss.android.lark.applogbridge.AppLogProxy;
import com.ss.android.lark.applogbridge.listener.IDeviceIdListener;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.passport.infra.service.ServiceFinder;
import com.ss.android.lark.passport.signinsdk_api.entity.DeviceId;
import com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49390d;
import com.ss.android.lark.util.share_preference.C57744a;
import com.ss.android.lark.utils.C57859q;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

@ClaymoreImpl(AbstractC49390d.class)
public class DeviceIdService implements AbstractC49390d {
    public final List<IGetDataCallback<DeviceId>> mCallbacks = new ArrayList();
    private final List<AbstractC49390d.AbstractC49391a> mDeviceIdChangeListeners = new ArrayList();
    private IDeviceIdListener mDeviceIdListener;
    private volatile Map<String, String> mIds = new HashMap();
    public final HandlerC48996a mTimeoutHandler = new HandlerC48996a(Looper.getMainLooper());

    @Override // com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49390d
    public String getDeviceIdFromLocal() {
        return loadDeviceIDFromLocal();
    }

    private static String getDeviceIdKey() {
        return getDeviceIdKey(ServiceFinder.m193749d().getUserUnit());
    }

    private static String getDeviceIdOldKey() {
        if (ServiceFinder.m193749d().isBuildinEnv()) {
            return "key_device_id";
        }
        if (ServiceFinder.m193748c().isLarkPackage()) {
            return "feishu_key_device_id";
        }
        return "larksuite_key_device_id";
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49390d
    public String getDeviceId() {
        String loadDeviceIDFromLocal = loadDeviceIDFromLocal();
        if (!isValidDeviceId(loadDeviceIDFromLocal)) {
            getDeviceId(ServiceFinder.m193748c().getApplicationContext(), null);
        }
        return loadDeviceIDFromLocal;
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49390d
    public String getInstallId() {
        if (C57744a.m224104a().getString("key_install_id") != null) {
            return C57744a.m224104a().getString("key_install_id");
        }
        return null;
    }

    public DeviceIdService() {
        C489952 r0 = new IDeviceIdListener() {
            /* class com.ss.android.lark.passport.device.service.impl.deviceid.DeviceIdService.C489952 */

            @Override // com.ss.android.lark.applogbridge.listener.IDeviceIdListener
            /* renamed from: a */
            public void mo101371a(String str, String str2, String str3) {
                Log.m165389i("DeviceIdService", "mDeviceIdListener onIdLoaded did:" + str);
            }

            @Override // com.ss.android.lark.applogbridge.listener.IDeviceIdListener
            /* renamed from: a */
            public void mo101372a(boolean z, String str, String str2, String str3, String str4, String str5, String str6) {
                Log.m165389i("DeviceIdService", "mDeviceIdListener onDeviceIdChanged changed:" + z + ", oldDid:" + str + ", newDid" + str2);
                if (!TextUtils.isEmpty(str4)) {
                    C57744a.m224104a().putString("key_install_id", str4);
                }
                DeviceIdService.this.notifyDeviceIdChangeListener(str2);
            }
        };
        this.mDeviceIdListener = r0;
        AppLogProxy.addDeviceIdListener(r0);
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49390d
    public void clearAppLogDidCache() {
        try {
            SharedPreferences.Editor edit = ServiceFinder.m193748c().getApplicationContext().getSharedPreferences("applog_stats", 0).edit();
            edit.putString("device_id", "");
            edit.putLong("last_config_time", 0);
            C26255ag.m95009a(edit);
        } catch (Exception unused) {
        }
    }

    private String loadDeviceIDFromLocal() {
        String str;
        String deviceIdKey = getDeviceIdKey();
        String str2 = this.mIds.get(deviceIdKey);
        if (isValidDeviceId(str2)) {
            return str2;
        }
        synchronized (this.mIds) {
            str = this.mIds.get(deviceIdKey);
            if (!isValidDeviceId(str)) {
                str = C57744a.m224104a().getString(deviceIdKey);
                if (TextUtils.isEmpty(str)) {
                    Log.m165385e("DeviceIdService", "message", new Exception("DeviceId newKey value is null"), true);
                    str = C57744a.m224104a().getString(getDeviceIdOldKey());
                }
                this.mIds.put(deviceIdKey, str);
                Log.m165389i("DeviceIdService", "loadDeviceIDFromLocal from GlobalSP cache key:" + deviceIdKey + ", encrypted did:" + C57859q.m224566b(str));
            }
        }
        if (!isValidDeviceId(str)) {
            return "";
        }
        return str;
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49390d
    public String getDeviceIdFromLocalByUnit(String str) {
        return loadDeviceIDFromLocal(str);
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49390d
    public JSONObject getDeviceInfo(Context context) {
        return C48997a.m192953a(context);
    }

    private static String getDeviceIdKey(String str) {
        return str + "-" + "key_device_id";
    }

    private boolean isValidDeviceId(String str) {
        if (TextUtils.isEmpty(str) || "0".equals(str)) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49390d
    public void addDeviceIdChangeListener(AbstractC49390d.AbstractC49391a aVar) {
        synchronized (this.mDeviceIdChangeListeners) {
            if (!contains(aVar, this.mDeviceIdChangeListeners.iterator())) {
                this.mDeviceIdChangeListeners.add(aVar);
            }
        }
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49390d
    public boolean removeDeviceIdChangeListener(AbstractC49390d.AbstractC49391a aVar) {
        if (aVar == null) {
            return false;
        }
        synchronized (this.mDeviceIdChangeListeners) {
            for (AbstractC49390d.AbstractC49391a aVar2 : this.mDeviceIdChangeListeners) {
                if (aVar.equals(aVar2)) {
                    return true;
                }
            }
            return false;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.passport.device.service.impl.deviceid.DeviceIdService$a */
    public class HandlerC48996a extends Handler {
        public void handleMessage(Message message) {
            boolean remove;
            super.handleMessage(message);
            if (message.obj != null && (message.obj instanceof IGetDataCallback)) {
                IGetDataCallback iGetDataCallback = (IGetDataCallback) message.obj;
                synchronized (DeviceIdService.this) {
                    remove = DeviceIdService.this.mCallbacks.remove(iGetDataCallback);
                }
                Log.m165389i("DeviceIdService", "TimeoutHandler removed:" + remove);
                if (remove) {
                    iGetDataCallback.onError(new ErrorResult("getDeviceId timeout removed:" + remove));
                }
            }
        }

        public HandlerC48996a(Looper looper) {
            super(looper);
        }
    }

    private String loadDeviceIDFromLocal(String str) {
        String str2;
        String deviceIdKey = getDeviceIdKey(str);
        String str3 = this.mIds.get(deviceIdKey);
        if (isValidDeviceId(str3)) {
            return str3;
        }
        synchronized (this.mIds) {
            str2 = this.mIds.get(deviceIdKey);
            if (!isValidDeviceId(str2)) {
                str2 = C57744a.m224104a().getString(deviceIdKey);
                if (TextUtils.isEmpty(str2)) {
                    Log.m165383e("DeviceIdService", "DeviceId newKey value is null");
                    str2 = C57744a.m224104a().getString(getDeviceIdOldKey());
                }
                this.mIds.put(deviceIdKey, str2);
                Log.m165389i("DeviceIdService", "loadDeviceIDFromLocal from GlobalSP cache key:" + deviceIdKey + ", did:" + str2);
            }
        }
        if (!isValidDeviceId(str2)) {
            return "";
        }
        return str2;
    }

    public void notifyDeviceIdChangeListener(String str) {
        boolean z;
        String loadDeviceIDFromLocal = loadDeviceIDFromLocal();
        if (isValidDeviceId(loadDeviceIDFromLocal)) {
            Log.m165389i("DeviceIdService", "lark cached did:" + loadDeviceIDFromLocal + ", new did:" + str);
        } else if (!isValidDeviceId(str)) {
            Log.m165389i("DeviceIdService", "notifyDeviceIdChangeListener newDid is empty");
        } else {
            Log.m165389i("DeviceIdService", "notifyDeviceIdChangeListener changed=true, newDid=" + str);
            if ((!ServiceFinder.m193748c().isLarkPackage() || !ServiceFinder.m193749d().isBuildinEnv()) && (ServiceFinder.m193748c().isLarkPackage() || ServiceFinder.m193749d().isBuildinEnv())) {
                z = false;
            } else {
                z = true;
            }
            notifySuccess(ServiceFinder.m193748c().getApplicationContext(), str);
            saveDeviceIdToLocal(ServiceFinder.m193748c().getApplicationContext(), str);
            Log.m165389i("DeviceIdService", "onDeviceIdChange set rust deviceId = " + str + ", oldDid:" + loadDeviceIDFromLocal + ", isOverSeaTenant:" + z);
            ServiceFinder.m193761p().setDeviceId(str);
            synchronized (this.mDeviceIdChangeListeners) {
                for (AbstractC49390d.AbstractC49391a aVar : this.mDeviceIdChangeListeners) {
                    aVar.onDeviceIdChange(str);
                }
            }
        }
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49390d
    public void getDeviceId(Context context, IGetDataCallback<DeviceId> iGetDataCallback) {
        internalGetDeviceId(context, iGetDataCallback);
    }

    public void saveDeviceIdToLocal(Context context, String str) {
        saveDeviceInfo(context, str);
    }

    private <T> boolean contains(T t, Iterator<T> it) {
        if (!(t == null || it == null)) {
            while (it.hasNext()) {
                if (t.equals(it.next())) {
                    return true;
                }
            }
        }
        return false;
    }

    private void notifySuccess(Context context, String str) {
        ArrayList<IGetDataCallback> arrayList;
        if (isValidDeviceId(str)) {
            saveDeviceInfo(context, str);
            synchronized (this) {
                arrayList = new ArrayList(this.mCallbacks);
                this.mCallbacks.clear();
            }
            for (IGetDataCallback iGetDataCallback : arrayList) {
                iGetDataCallback.onSuccess(new DeviceId(str));
            }
        }
    }

    private void saveDeviceInfo(Context context, String str) {
        String deviceIdKey = getDeviceIdKey();
        synchronized (this.mIds) {
            this.mIds.put(deviceIdKey, str);
        }
        C57744a.m224104a().putString(deviceIdKey, str);
        C57744a.m224104a().putString("key_device_info", C48997a.m192953a(context).toString());
    }

    private boolean internalGetDeviceId(Context context, IGetDataCallback<DeviceId> iGetDataCallback) {
        String loadDeviceIDFromLocal = loadDeviceIDFromLocal();
        if (!isValidDeviceId(loadDeviceIDFromLocal)) {
            if (iGetDataCallback != null) {
                synchronized (this) {
                    this.mCallbacks.add(iGetDataCallback);
                }
            }
            if (ServiceFinder.m193752g().isWsChannelProcess(context)) {
                return false;
            }
            String applogDomain = ServiceFinder.m193752g().getApplogDomain();
            if (!TextUtils.isEmpty(applogDomain)) {
                AppLogProxy.setUriRuntime(applogDomain);
                Log.m165389i("DeviceIdService", "getDeviceId deviceId is empty, current applog regionDomain=" + applogDomain + ", unit=" + ServiceFinder.m193749d().getUserUnit());
            } else {
                Log.m165383e("DeviceIdService", "unknown applog domain is empty, current applog unit=" + ServiceFinder.m193749d().getUserUnit());
            }
            return false;
        } else if (iGetDataCallback == null) {
            return true;
        } else {
            iGetDataCallback.onSuccess(new DeviceId(loadDeviceIDFromLocal));
            return true;
        }
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49390d
    public void getDeviceId(Context context, final IGetDataCallback<DeviceId> iGetDataCallback, long j) {
        final int hashCode = Long.valueOf(System.currentTimeMillis()).hashCode();
        C489941 r1 = new IGetDataCallback<DeviceId>() {
            /* class com.ss.android.lark.passport.device.service.impl.deviceid.DeviceIdService.C489941 */

            /* renamed from: a */
            public void onSuccess(DeviceId deviceId) {
                DeviceIdService.this.mTimeoutHandler.removeMessages(hashCode);
                iGetDataCallback.onSuccess(deviceId);
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                DeviceIdService.this.mTimeoutHandler.removeMessages(hashCode);
                iGetDataCallback.onError(errorResult);
            }
        };
        if (!internalGetDeviceId(context, r1)) {
            if (j <= 0) {
                Log.m165389i("DeviceIdService", "getDeviceId timeoutMillis:" + j);
                return;
            }
            Message obtain = Message.obtain(this.mTimeoutHandler);
            obtain.what = hashCode;
            obtain.obj = r1;
            this.mTimeoutHandler.sendMessageDelayed(obtain, j);
            Log.m165389i("DeviceIdService", "getDeviceId with timeout:" + j);
        }
    }
}
