package com.larksuite.component.openplatform.plugins.container;

import com.larksuite.framework.apiplugin.AbstractC25889a;
import com.larksuite.framework.apiplugin.annotation.LKPluginFunction;
import com.larksuite.framework.apiplugin.common.GetApiAccessConfig;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25897h;

public class DefaultContainerPlugin extends AbstractC25889a {
    private C25577b container;

    @Override // com.larksuite.framework.apiplugin.AbstractC25937e
    public void onRelease() {
        this.container = null;
    }

    public DefaultContainerPlugin(C25577b bVar) {
        this.container = bVar;
    }

    @LKPluginFunction(async = true, eventName = {"getApiAccessConfig"})
    public void getDomains(AbstractC25897h<GetApiAccessConfig.GetDomainResponse> hVar) {
        GetApiAccessConfig.GetDomainResponse getDomainResponse = new GetApiAccessConfig.GetDomainResponse();
        if (this.container.f62220a != null) {
            if (this.container.f62220a.getDomain() != null) {
                getDomainResponse.mDomain = this.container.f62220a.getDomain().name();
            }
            getDomainResponse.mScene = this.container.f62220a.getScene();
            if (this.container.f62220a.getBizType() != null) {
                getDomainResponse.mBizType = this.container.f62220a.getBizType().name();
            }
        }
        hVar.callback(getDomainResponse);
    }
}
