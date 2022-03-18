package com.bytedance.push;

import android.content.Context;
import com.bytedance.push.interfaze.AbstractC20442e;
import com.bytedance.push.interfaze.AbstractC20443f;
import com.bytedance.push.interfaze.AbstractC20445h;
import com.bytedance.push.interfaze.AbstractC20450m;
import com.bytedance.push.interfaze.AbstractC20452o;
import com.bytedance.push.interfaze.IMonitor;
import com.bytedance.push.interfaze.IPushMsgHandler;
import com.bytedance.push.interfaze.IThirdSupportService;
import com.bytedance.push.log.C20472a;
import com.bytedance.push.log.ILogger;
import com.bytedance.push.notification.C20494h;
import com.bytedance.push.notification.C20497i;
import com.bytedance.push.p884f.C20419c;
import com.bytedance.push.p884f.C20420d;
import com.bytedance.push.p886g.C20433a;
import com.bytedance.push.third.C20547e;
import com.ss.android.message.AbstractC59434a;
import com.ss.android.message.p3002a.C59436a;
import java.util.Map;
import org.json.JSONObject;

public class PushSupporter implements AbstractC20452o {
    private static PushSupporter supporter = new PushSupporter();
    private C20433a mCommonParamProvider;
    private C20386c mConfiguration;
    private volatile JSONObject mFrontierSetting;
    private final C20472a mLogger = new C20472a();
    private volatile IMonitor mMonitor;
    private volatile AbstractC20443f mNotificationService;
    private volatile IPushMsgHandler mPushHandler;
    private volatile C20410f mSenderService;
    private volatile C20431g mThirdService;

    public AbstractC20445h getPushRedbadgeManager() {
        return null;
    }

    public static AbstractC20452o get() {
        return supporter;
    }

    @Override // com.bytedance.push.interfaze.AbstractC20452o
    public C20386c getConfiguration() {
        return this.mConfiguration;
    }

    public JSONObject getFrontierSetting() {
        return this.mFrontierSetting;
    }

    @Override // com.bytedance.push.interfaze.AbstractC20452o
    public Map<String, String> getCommonParams() {
        return this.mCommonParamProvider.mo68893a();
    }

    public AbstractC59434a getPushAdapter() {
        return C20547e.m74826a();
    }

    @Override // com.bytedance.push.interfaze.AbstractC20452o
    public AbstractC20442e getStatisticsService() {
        return getConfiguration().f49791m;
    }

    public static ILogger logger() {
        return get().getLogger();
    }

    public static IMonitor monitor() {
        return get().getMonitor();
    }

    public static IPushMsgHandler pushHandler() {
        return get().getPushHandler();
    }

    public static AbstractC20442e statisticsService() {
        return get().getStatisticsService();
    }

    public static IThirdSupportService thirdService() {
        return get().getThirdService();
    }

    @Override // com.bytedance.push.interfaze.AbstractC20452o
    public ILogger getLogger() {
        if (getConfiguration() == null) {
            return this.mLogger;
        }
        ILogger iLogger = getConfiguration().f49777H;
        if (iLogger == null) {
            return this.mLogger;
        }
        return iLogger;
    }

    @Override // com.bytedance.push.interfaze.AbstractC20452o
    public AbstractC20443f getNotificationService() {
        if (this.mNotificationService == null) {
            synchronized (this) {
                if (this.mNotificationService == null) {
                    this.mNotificationService = new C20494h(this);
                }
            }
        }
        return this.mNotificationService;
    }

    @Override // com.bytedance.push.interfaze.AbstractC20452o
    public IPushMsgHandler getPushHandler() {
        if (this.mPushHandler == null) {
            synchronized (this) {
                if (this.mPushHandler == null) {
                    this.mPushHandler = new C20497i(getConfiguration());
                }
            }
        }
        return this.mPushHandler;
    }

    @Override // com.bytedance.push.interfaze.AbstractC20452o
    public AbstractC20450m getSenderService() {
        if (this.mSenderService == null) {
            synchronized (this) {
                if (this.mSenderService == null) {
                    this.mSenderService = new C20410f();
                }
            }
        }
        return this.mSenderService;
    }

    @Override // com.bytedance.push.interfaze.AbstractC20452o
    public IMonitor getMonitor() {
        if (this.mMonitor == null) {
            synchronized (this) {
                if (this.mMonitor == null) {
                    if (C59436a.m230732b(getConfiguration().f49779a)) {
                        this.mMonitor = new C20419c(getConfiguration());
                    } else {
                        this.mMonitor = new C20420d();
                    }
                }
            }
        }
        return this.mMonitor;
    }

    @Override // com.bytedance.push.interfaze.AbstractC20452o
    public IThirdSupportService getThirdService() {
        if (this.mThirdService == null) {
            synchronized (this) {
                if (this.mThirdService == null) {
                    this.mThirdService = new C20431g(getSenderService(), getPushHandler(), getConfiguration());
                }
            }
        }
        return this.mThirdService;
    }

    @Override // com.bytedance.push.interfaze.AbstractC20452o
    public void setFrontierSetting(JSONObject jSONObject) {
        this.mFrontierSetting = jSONObject;
    }

    @Override // com.bytedance.push.interfaze.AbstractC20452o
    public void init(C20386c cVar, C20433a aVar) {
        this.mConfiguration = cVar;
        this.mCommonParamProvider = aVar;
    }

    public String filterUrl(Context context, String str) {
        if (getConfiguration().f49794p != null) {
            return getConfiguration().f49794p.mo68933a(context, str);
        }
        return str;
    }
}
