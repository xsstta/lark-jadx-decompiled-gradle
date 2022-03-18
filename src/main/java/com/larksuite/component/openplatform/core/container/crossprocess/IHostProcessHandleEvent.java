package com.larksuite.component.openplatform.core.container.crossprocess;

import com.bytedance.ee.lark.plugin_annotation.bean.PluginEnv;
import com.bytedance.ee.lark.plugin_annotation.bean.Scope;
import com.larksuite.component.openplatform.plugins.config.LKOpenApiAccessConfig;
import com.larksuite.framework.apiplugin.LKEvent;
import com.larksuite.framework.apiplugin.entity.LKBasePluginResult;
import com.ss.android.lark.manis.annotation.RemoteCallback;
import com.ss.android.lark.manis.annotation.RemoteService;
import ee.android.framework.manis.interfaces.IHookInterface;
import java.io.Serializable;
import java.util.List;

@RemoteService
public interface IHostProcessHandleEvent extends IHookInterface {

    @RemoteCallback
    public interface HandleEventCallback extends Serializable {
        LKBasePluginResult dispatchEventToAppProcess(LKEvent lKEvent, long j);

        void onFail(int i, String str);

        void onLinkTraceId(String str);

        void onSuccess(String str);
    }

    LKBasePluginResult dispatchEventToHostProcess(String str, LKEvent lKEvent, HandleEventCallback handleEventCallback, long j);

    List<IPCPluginConfig> getAppEnvPluginConfigs();

    List<IPCPluginConfig> getBizEnvPluginConfigsForWebApp();

    void notifyAppContainerOnCreate(String str, LKOpenApiAccessConfig lKOpenApiAccessConfig);

    void notifyAppContainerOnDestroy(String str);

    void sendAsyncHandleResultToHostProcess(long j, String str, int i, String str2);

    public static class IPCPluginConfig implements Serializable {
        public List<String> mEventList;
        public List<LKOpenApiAccessConfig> mOpenConditions;
        public String mPluginClass;
        public PluginEnv mPluginEnv;
        public Scope mScope;

        public String toString() {
            String str;
            StringBuilder sb = new StringBuilder();
            sb.append("IPCPluginConfig{mPluginClass='");
            sb.append(this.mPluginClass);
            sb.append('\'');
            sb.append(", mEventList=");
            List<String> list = this.mEventList;
            String str2 = "";
            if (list != null) {
                str = list.toString();
            } else {
                str = str2;
            }
            sb.append(str);
            sb.append(", mOpenConditions=");
            List<LKOpenApiAccessConfig> list2 = this.mOpenConditions;
            if (list2 != null) {
                str2 = list2.toString();
            }
            sb.append(str2);
            sb.append(", mScope=");
            sb.append(this.mScope);
            sb.append(", mPluginEnv=");
            sb.append(this.mPluginEnv);
            sb.append('}');
            return sb.toString();
        }
    }
}
