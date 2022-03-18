package com.larksuite.component.openplatform.core.container.crossprocess.impl;

import android.content.Context;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.larksuite.component.openplatform.api.AbstractC24367c;
import com.larksuite.component.openplatform.core.container.crossprocess.IHostProcessHandleEvent;
import com.larksuite.component.openplatform.core.container.impl.C24491h;
import com.larksuite.component.openplatform.core.p1106a.C24401b;
import com.larksuite.component.openplatform.plugins.config.LKOpenApiAccessConfig;
import com.larksuite.framework.apiplugin.LKEvent;
import com.larksuite.framework.apiplugin.entity.LKBasePluginResult;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.manis.annotation.RemoteServiceImpl;

@RemoteServiceImpl(service = IHostProcessHandleEvent.class)
public class HostProcessHandleEventImpl extends AbsHostProcessHandleEventImpl implements IHostProcessHandleEvent {
    private Context mContext;

    public HostProcessHandleEventImpl(Context context) {
        this.mContext = context;
    }

    @Override // com.larksuite.component.openplatform.core.container.crossprocess.IHostProcessHandleEvent
    public void notifyAppContainerOnDestroy(String str) {
        AppBrandLogger.m52830i("HostProcessHandleEventImpl", "notifyAppContainerOnDestroy:" + str);
        AbstractC24367c c = C24401b.m89051c();
        if (c instanceof C24401b) {
            ((C24401b) c).mo87196c(str);
        }
    }

    @Override // com.larksuite.component.openplatform.core.container.crossprocess.IHostProcessHandleEvent
    public void notifyAppContainerOnCreate(String str, LKOpenApiAccessConfig lKOpenApiAccessConfig) {
        AppBrandLogger.m52830i("HostProcessHandleEventImpl", "notifyAppContainerOnCreate:" + str);
        AbstractC24367c c = C24401b.m89051c();
        if (c instanceof C24401b) {
            ((C24401b) c).mo87195a(str, lKOpenApiAccessConfig);
        }
    }

    @Override // com.larksuite.component.openplatform.core.container.crossprocess.IHostProcessHandleEvent
    public LKBasePluginResult dispatchEventToHostProcess(String str, LKEvent lKEvent, IHostProcessHandleEvent.HandleEventCallback handleEventCallback, long j) {
        boolean z;
        AbstractC24367c c = C24401b.m89051c();
        if (!(c instanceof C24401b)) {
            return LKBasePluginResult.f64237b;
        }
        C24491h d = ((C24401b) c).mo87197d(str);
        StringBuilder sb = new StringBuilder();
        sb.append("mockAppIdentify:");
        sb.append(str);
        sb.append(" mockAppContainer:");
        if (d != null) {
            z = true;
        } else {
            z = false;
        }
        sb.append(z);
        Log.m165389i("HostProcessHandleEventImpl", sb.toString());
        return sendEventInHostProcess(lKEvent, handleEventCallback, str, d, this.mContext);
    }
}
