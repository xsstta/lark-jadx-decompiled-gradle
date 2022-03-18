package com.larksuite.component.openplatform.core.plugin;

import com.larksuite.component.openplatform.core.container.p1118a.AbstractC24461b;
import com.larksuite.component.openplatform.plugins.config.LKOpenApiAccessConfig;
import com.larksuite.framework.apiplugin.annotation.LKPluginFunction;
import com.larksuite.framework.apiplugin.common.GetApiAccessConfig;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25897h;

public class OPAbsAppContainerPlugin extends OPPlugin {
    public AbstractC24461b mAbsAppContainer;

    @Override // com.larksuite.component.openplatform.core.plugin.OPPlugin, com.larksuite.framework.apiplugin.AbstractC25937e
    public void onRelease() {
    }

    public OPAbsAppContainerPlugin(AbstractC24461b bVar) {
        this.mAbsAppContainer = bVar;
    }

    @LKPluginFunction(async = true, eventName = {"getApiAccessConfig"})
    public void getDomain(AbstractC25897h<GetApiAccessConfig.GetDomainResponse> hVar) {
        GetApiAccessConfig.GetDomainResponse getDomainResponse = new GetApiAccessConfig.GetDomainResponse();
        LKOpenApiAccessConfig q = this.mAbsAppContainer.mo87299q();
        if (q != null) {
            if (q.getDomain() != null) {
                getDomainResponse.mDomain = q.getDomain().name();
            }
            getDomainResponse.mScene = q.getScene();
            if (q.getBizType() != null) {
                getDomainResponse.mBizType = q.getBizType().name();
            }
        }
        hVar.callback(getDomainResponse);
    }
}
