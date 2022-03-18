package com.bytedance.push.third;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import com.bytedance.push.PushSupporter;
import com.bytedance.push.log.ILogger;
import com.bytedance.push.p879a.C20381a;
import com.bytedance.push.p880b.C20385a;
import com.bytedance.push.utils.C20552c;
import com.ss.android.pushmanager.p3019a.C59959a;
import com.ss.android.ug.bus.C60442b;
import org.json.JSONObject;

public class PushManager implements IPushAdapter {
    private static volatile PushManager sPushManager;

    @Override // com.bytedance.push.third.IPushAdapter
    public boolean requestNotificationPermission(int i) {
        return false;
    }

    private PushManager() {
    }

    public static PushManager inst() {
        if (sPushManager == null) {
            synchronized (PushManager.class) {
                if (sPushManager == null) {
                    sPushManager = new PushManager();
                }
            }
        }
        return sPushManager;
    }

    @Override // com.bytedance.push.third.IPushAdapter
    public void unregisterPush(Context context, int i) {
        IPushAdapter adapterInstance = PushChannelHelper.inst(context).getAdapterInstance(i);
        if (adapterInstance != null) {
            try {
                adapterInstance.unregisterPush(context, i);
            } catch (Throwable unused) {
            }
        }
    }

    @Override // com.bytedance.push.third.IPushAdapter
    public boolean isPushAvailable(Context context, int i) {
        IPushAdapter adapterInstance = PushChannelHelper.inst(context).getAdapterInstance(i);
        if (adapterInstance == null) {
            return false;
        }
        try {
            return adapterInstance.isPushAvailable(context, i);
        } catch (Throwable unused) {
            return false;
        }
    }

    @Override // com.bytedance.push.third.IPushAdapter
    public void registerPush(Context context, int i) {
        IPushAdapter adapterInstance = PushChannelHelper.inst(context).getAdapterInstance(i);
        if (adapterInstance != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("channel", i);
                ((C59959a.AbstractC59961b) C60442b.m234863a(C59959a.AbstractC59961b.class)).mo68799a("push_registered", jSONObject);
                PushSupporter.monitor().monitorRegisterSender(i);
                adapterInstance.registerPush(context, i);
            } catch (Throwable unused) {
            }
        }
    }

    @Override // com.bytedance.push.third.IPushAdapter
    public boolean checkThirdPushConfig(String str, Context context) {
        boolean z = true;
        for (Integer num : PushChannelHelper.inst(context).getChannels()) {
            IPushAdapter adapterInstance = PushChannelHelper.inst(context).getAdapterInstance(num.intValue());
            if (adapterInstance != null) {
                try {
                    z &= adapterInstance.checkThirdPushConfig(str, context);
                } catch (Throwable th) {
                    ILogger logger = PushSupporter.logger();
                    logger.mo68949d(str, "check pushType error: " + Log.getStackTraceString(th));
                    z = false;
                }
            }
        }
        try {
            return C20385a.m74262a(context, str) & z & C20381a.m74252a(context).mo68749a(str);
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            C20552c.m74850b(str, "check pushType error: " + Log.getStackTraceString(e));
            return false;
        }
    }

    @Override // com.bytedance.push.third.IPushAdapter
    public void trackPush(Context context, int i, Object obj) {
        IPushAdapter adapterInstance = PushChannelHelper.inst(context).getAdapterInstance(i);
        if (adapterInstance != null) {
            try {
                adapterInstance.trackPush(context, i, obj);
            } catch (Throwable unused) {
            }
        }
    }

    @Override // com.bytedance.push.third.IPushAdapter
    public void setAlias(Context context, String str, int i) {
        IPushAdapter adapterInstance = PushChannelHelper.inst(context).getAdapterInstance(i);
        if (adapterInstance != null) {
            try {
                adapterInstance.setAlias(context, str, i);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }
}
