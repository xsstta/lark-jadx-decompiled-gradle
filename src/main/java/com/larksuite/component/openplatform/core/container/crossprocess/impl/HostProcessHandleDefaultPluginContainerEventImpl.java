package com.larksuite.component.openplatform.core.container.crossprocess.impl;

import android.content.Context;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.larksuite.component.openplatform.core.container.C24458a;
import com.larksuite.component.openplatform.core.container.C24474c;
import com.larksuite.component.openplatform.core.container.crossprocess.IHostProcessHandleDefaultPluginContainerEvent;
import com.larksuite.component.openplatform.core.container.crossprocess.IHostProcessHandleEvent;
import com.larksuite.component.openplatform.plugins.config.LKOpenApiAccessConfig;
import com.larksuite.framework.apiplugin.LKEvent;
import com.larksuite.framework.apiplugin.entity.LKBasePluginResult;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.manis.annotation.RemoteServiceImpl;

@RemoteServiceImpl(service = IHostProcessHandleDefaultPluginContainerEvent.class)
public class HostProcessHandleDefaultPluginContainerEventImpl extends AbsHostProcessHandleEventImpl implements IHostProcessHandleDefaultPluginContainerEvent {
    private Context mContext;

    public HostProcessHandleDefaultPluginContainerEventImpl(Context context) {
        this.mContext = context;
    }

    @Override // com.larksuite.component.openplatform.core.container.crossprocess.IHostProcessHandleEvent
    public void notifyAppContainerOnDestroy(String str) {
        AppBrandLogger.m52830i("HostProcessHandleDefaultPluginContainerEventImpl", "notifyAppContainerOnDestroy:" + str);
        C24458a.m89213a().mo87268a(str);
    }

    @Override // com.larksuite.component.openplatform.core.container.crossprocess.IHostProcessHandleEvent
    public void notifyAppContainerOnCreate(String str, LKOpenApiAccessConfig lKOpenApiAccessConfig) {
        String str2;
        Object[] objArr = new Object[1];
        StringBuilder sb = new StringBuilder();
        sb.append("notifyAppContainerOnCreate:");
        sb.append(str);
        sb.append(" apiAccessConfig:");
        if (lKOpenApiAccessConfig != null) {
            str2 = lKOpenApiAccessConfig.toString();
        } else {
            str2 = "";
        }
        sb.append(str2);
        objArr[0] = sb.toString();
        AppBrandLogger.m52830i("HostProcessHandleDefaultPluginContainerEventImpl", objArr);
        C24458a.m89213a().mo87267a(this.mContext, str, lKOpenApiAccessConfig);
    }

    @Override // com.larksuite.component.openplatform.core.container.crossprocess.IHostProcessHandleEvent
    public LKBasePluginResult dispatchEventToHostProcess(String str, LKEvent lKEvent, IHostProcessHandleEvent.HandleEventCallback handleEventCallback, long j) {
        boolean z;
        C24474c b = C24458a.m89213a().mo87269b(str);
        if (b == null) {
            return LKBasePluginResult.f64237b;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("mock container id:");
        sb.append(str);
        sb.append(" container:");
        if (b != null) {
            z = true;
        } else {
            z = false;
        }
        sb.append(z);
        Log.m165389i("HostProcessHandleDefaultPluginContainerEventImpl", sb.toString());
        return sendEventInHostProcess(lKEvent, handleEventCallback, str, b, this.mContext);
    }
}
