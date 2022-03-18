package com.bytedance.push.interfaze;

import com.bytedance.push.C20386c;
import com.bytedance.push.log.ILogger;
import com.bytedance.push.p886g.C20433a;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.bytedance.push.interfaze.o */
public interface AbstractC20452o {
    Map<String, String> getCommonParams();

    C20386c getConfiguration();

    ILogger getLogger();

    IMonitor getMonitor();

    AbstractC20443f getNotificationService();

    IPushMsgHandler getPushHandler();

    AbstractC20450m getSenderService();

    AbstractC20442e getStatisticsService();

    IThirdSupportService getThirdService();

    void init(C20386c cVar, C20433a aVar);

    void setFrontierSetting(JSONObject jSONObject);
}
