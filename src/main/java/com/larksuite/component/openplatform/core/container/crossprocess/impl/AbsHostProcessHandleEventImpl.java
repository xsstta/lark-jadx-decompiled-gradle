package com.larksuite.component.openplatform.core.container.crossprocess.impl;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.plugin_annotation.bean.PluginEnv;
import com.larksuite.component.openplatform.core.container.C24458a;
import com.larksuite.component.openplatform.core.container.crossprocess.C24476a;
import com.larksuite.component.openplatform.core.container.crossprocess.IHostProcessHandleEvent;
import com.larksuite.component.openplatform.core.p1121d.C24498b;
import com.larksuite.component.openplatform.core.utils.C25529d;
import com.larksuite.component.openplatform.plugins.config.LKPluginConfig;
import com.larksuite.component.openplatform.plugins.p1142a.AbstractC25556c;
import com.larksuite.framework.apiplugin.LKEvent;
import com.larksuite.framework.apiplugin.entity.LKBasePluginResult;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25891b;
import com.ss.android.lark.log.Log;
import com.tt.miniapp.errorcode.ApiCode;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public abstract class AbsHostProcessHandleEventImpl implements IHostProcessHandleEvent {
    @Override // com.larksuite.component.openplatform.core.container.crossprocess.IHostProcessHandleEvent
    public List<IHostProcessHandleEvent.IPCPluginConfig> getAppEnvPluginConfigs() {
        return getPluginConfigsByEnv(PluginEnv.APP_ENV);
    }

    @Override // com.larksuite.component.openplatform.core.container.crossprocess.IHostProcessHandleEvent
    public List<IHostProcessHandleEvent.IPCPluginConfig> getBizEnvPluginConfigsForWebApp() {
        Log.m165389i("AbsHostProcessHandleEventImpl", "get biz env plugin");
        return getPluginConfigsByEnv(PluginEnv.BIZ_ENV);
    }

    private List<IHostProcessHandleEvent.IPCPluginConfig> getPluginConfigsByEnv(PluginEnv pluginEnv) {
        Log.m165389i("AbsHostProcessHandleEventImpl", "env:" + pluginEnv);
        AbstractC25556c cVar = (AbstractC25556c) C24498b.m89361a().mo87139a(AbstractC25556c.class);
        ArrayList arrayList = new ArrayList();
        if (cVar != null) {
            for (LKPluginConfig lKPluginConfig : cVar.mo88697a(pluginEnv)) {
                IHostProcessHandleEvent.IPCPluginConfig iPCPluginConfig = new IHostProcessHandleEvent.IPCPluginConfig();
                iPCPluginConfig.mOpenConditions = lKPluginConfig.mOpenConditions;
                iPCPluginConfig.mEventList = lKPluginConfig.getEventList();
                iPCPluginConfig.mPluginClass = lKPluginConfig.mPluginClassName;
                iPCPluginConfig.mPluginEnv = lKPluginConfig.mPluginEnv;
                iPCPluginConfig.mScope = lKPluginConfig.mScope;
                Log.m165389i("AbsHostProcessHandleEventImpl", "config plugin:" + iPCPluginConfig.toString());
                arrayList.add(iPCPluginConfig);
            }
        } else {
            Log.m165383e("AbsHostProcessHandleEventImpl", "PluginConfigProvider is null");
        }
        return arrayList;
    }

    @Override // com.larksuite.component.openplatform.core.container.crossprocess.IHostProcessHandleEvent
    public void sendAsyncHandleResultToHostProcess(long j, String str, int i, String str2) {
        LKEvent lKEvent = C24458a.m89213a().f60349a.get(Long.valueOf(j));
        if (lKEvent == null) {
            AppBrandLogger.m52829e("AbsHostProcessHandleEventImpl", "callBackId:" + j + " event is null");
        } else if (!TextUtils.isEmpty(str)) {
            AppBrandLogger.m52830i("AbsHostProcessHandleEventImpl", "callback success result");
            try {
                lKEvent.mo92127a(new JSONObject(str));
            } catch (JSONException e) {
                AppBrandLogger.m52829e("AbsHostProcessHandleEventImpl", "JSONException", e);
                lKEvent.mo92116a(ApiCode.GENERAL_JSON_ERROR.code, new JSONObject());
            }
        } else {
            AppBrandLogger.m52830i("AbsHostProcessHandleEventImpl", "errorCode:" + i);
            JSONObject jSONObject = new JSONObject();
            if (!TextUtils.isEmpty(str2)) {
                try {
                    jSONObject = new JSONObject(str2);
                } catch (JSONException e2) {
                    AppBrandLogger.m52829e("AbsHostProcessHandleEventImpl", "JSONException", e2);
                }
            }
            lKEvent.mo92116a(i, jSONObject);
        }
    }

    public LKBasePluginResult sendEventInHostProcess(LKEvent lKEvent, IHostProcessHandleEvent.HandleEventCallback handleEventCallback, String str, AbstractC25891b bVar, Context context) {
        Object obj;
        C24476a.m89285a().mo87340a(str, handleEventCallback);
        Object[] objArr = new Object[1];
        StringBuilder sb = new StringBuilder();
        sb.append("dispatchEventToHostProcess event:");
        sb.append(lKEvent.mo92146m());
        sb.append(" eventParams length:");
        if (lKEvent.mo92147n() != null) {
            obj = Integer.valueOf(lKEvent.mo92147n().length());
        } else {
            obj = "";
        }
        sb.append(obj);
        sb.append(" eventSourceEnv:");
        sb.append(lKEvent.mo92141h());
        objArr[0] = sb.toString();
        AppBrandLogger.m52830i("AbsHostProcessHandleEventImpl", objArr);
        return C25529d.m91133a(lKEvent, handleEventCallback, bVar, context, null);
    }
}
