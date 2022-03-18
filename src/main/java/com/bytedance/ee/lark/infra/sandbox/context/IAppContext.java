package com.bytedance.ee.lark.infra.sandbox.context;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.larksuite.component.openplatform.plugins.config.LKOpenApiAccessConfig;
import com.larksuite.component.openplatform.plugins.container.AbstractC25576a;
import com.larksuite.framework.apiplugin.AbstractC25905b;
import com.larksuite.framework.apiplugin.AbstractC25937e;
import com.larksuite.framework.apiplugin.LKEvent;
import com.larksuite.framework.apiplugin.entity.LKBasePluginResult;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25891b;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25894e;
import com.ss.android.lark.opmonitor.trace.OPTrace;
import com.tt.refer.common.base.AppType;
import org.json.JSONObject;

public interface IAppContext {
    void bindAppContainer(AbstractC25891b bVar);

    void destroy();

    <T extends IBaseService> T findServiceByInterface(Class<T> cls);

    LKOpenApiAccessConfig getApiAccessConfig();

    AbstractC25891b getAppContainer();

    String getAppId();

    String getAppIdentify();

    AppType getAppType();

    Context getApplicationContext();

    AbstractC25905b getBridgeContext();

    String getContainerType();

    Activity getCurrentActivity();

    AbstractC25891b getCurrentNode();

    int getCurrentTheme();

    AbstractC25576a getDefaultPluginContainer();

    <T> T getExtra();

    <T> T getExtra(String str);

    AbstractC12888c getGadgetInteractiveProxy();

    String getTraceId();

    OPTrace getTracingSpan();

    void initTrace();

    boolean isDestroyed();

    boolean isDestroying();

    boolean isEmbedContainer();

    boolean isInParallelWindow();

    boolean isNewContainer();

    <T> void putExtra(String str, T t);

    void putExtras(AbstractC12886a aVar);

    <T extends IBaseService> boolean registerService(Class<T> cls, T t);

    void removeExtra(String str);

    LKBasePluginResult sendEvent(LKEvent lKEvent);

    LKBasePluginResult sendEvent(String str);

    LKBasePluginResult sendEvent(String str, JSONObject jSONObject);

    LKBasePluginResult sendEvent(String str, JSONObject jSONObject, AbstractC25894e eVar);

    void sendEvent(String str, Bundle bundle);

    void setApiAccessConfig(LKOpenApiAccessConfig lKOpenApiAccessConfig);

    void setAppId(String str);

    void setAppIdentify(String str);

    void setContainerType(String str);

    void setCurrentActivity(Activity activity);

    void setCurrentTheme(int i);

    void setDefaultPluginContainer(AbstractC25576a aVar);

    void setExtra(Object obj);

    void setGadgetInteractiveProxy(AbstractC12888c cVar);

    void setInParallelWindow(boolean z);

    void startActivityForResult(Intent intent, int i);

    void startDestroy();

    void unRegisterOnResultAllPlugin();

    void unRegisterOnResultPlugin(AbstractC25937e eVar);
}
