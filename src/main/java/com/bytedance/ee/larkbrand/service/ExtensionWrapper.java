package com.bytedance.ee.larkbrand.service;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.bytedance.ee.larkbrand.service.extension.AbstractC13310b;
import com.bytedance.ee.larkbrand.service.extension.AbstractC13311d;
import com.bytedance.ee.larkbrand.service.extension.AbstractC13312e;
import com.bytedance.ee.larkbrand.service.extension.AbstractC13313f;
import com.bytedance.ee.larkbrand.service.extension.AbstractC13314g;
import com.bytedance.ee.larkbrand.service.extension.AbstractC13316h;
import com.bytedance.ee.larkbrand.service.extension.AbstractC13317i;
import com.bytedance.ee.larkbrand.service.extension.AbstractC13320j;
import com.bytedance.ee.larkbrand.service.extension.AbstractC13322k;
import com.bytedance.ee.larkbrand.service.extension.AbstractC13326l;
import com.bytedance.ee.larkbrand.service.extension.AbstractC13327q;
import com.bytedance.ee.larkbrand.service.extension.AppLogger;
import com.bytedance.ee.larkbrand.service.extension.BadgeWrapper;
import com.bytedance.ee.larkbrand.service.extension.MiniMonitor;
import com.bytedance.ee.larkbrand.service.extension.OpenLarkNativeWrapper;
import com.bytedance.ee.larkbrand.service.extension.OpenLarkWebWrapper;
import com.bytedance.ee.larkbrand.service.extension.ShareToLarkWrapper;
import com.bytedance.ee.larkbrand.service.extension.TTWebviewSchedulerWrapper;
import com.bytedance.ee.larkbrand.service.p663a.AbstractC13304a;
import com.bytedance.ee.larkbrand.service.p663a.AbstractC13305b;
import com.bytedance.ee.larkbrand.service.p663a.AbstractC13307d;
import com.bytedance.ee.larkbrand.service.p663a.AbstractC13309e;

public interface ExtensionWrapper extends AbstractC13305b, AbstractC13307d, AbstractC13309e, MiniMonitor, AppLogger, AbstractC13310b, BadgeWrapper, AbstractC13311d, AbstractC13312e, AbstractC13313f, AbstractC13314g, AbstractC13316h, AbstractC13317i, AbstractC13320j, AbstractC13322k, AbstractC13326l, OpenLarkNativeWrapper, OpenLarkWebWrapper, ShareToLarkWrapper, TTWebviewSchedulerWrapper, AbstractC13327q {

    /* renamed from: com.bytedance.ee.larkbrand.service.ExtensionWrapper$a */
    public interface AbstractC13303a {
        /* renamed from: a */
        void mo48821a(String str);

        /* renamed from: b */
        void mo48822b(String str);
    }

    void decodeQRCodeActivity(String str, Activity activity);

    int getCurNetworkLevel();

    void getDeviceId(AbstractC13303a aVar);

    boolean getFeatureGating(String str);

    boolean getFeatureGating(String str, boolean z);

    AbstractC13304a getMapModel();

    long getServerTime();

    String getTTWebViewSoVersion();

    boolean isUsingTTWebView();

    void onMiniappActivityCreate(Intent intent);

    void onMiniappServiceBind(Intent intent);

    void onMiniappServiceStart(Intent intent, int i, int i2);

    void onOpen(String str, boolean z);

    void preHandleIntent(Context context, Intent intent, int i, int i2, String str);
}
