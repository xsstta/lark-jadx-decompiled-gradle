package com.larksuite.component.openplatform.core.container.impl;

import com.larksuite.component.blockit.AbstractC24076f;
import com.larksuite.component.openplatform.core.plugin.OPPlugin;
import com.larksuite.framework.apiplugin.LKEvent;
import com.larksuite.framework.apiplugin.entity.LKPluginHandleResult;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25896g;

public class CancelPlugin extends OPPlugin {
    private final AbstractC24076f mICreatorListener;

    public CancelPlugin(AbstractC24076f fVar) {
        this.mICreatorListener = fVar;
    }

    @Override // com.larksuite.framework.apiplugin.AbstractC25889a, com.larksuite.framework.apiplugin.AbstractC25937e
    public void addEvents(AbstractC25896g gVar) {
        super.addEvents(gVar);
        gVar.mo92192a("cancel");
    }

    @Override // com.larksuite.component.openplatform.core.plugin.OPPlugin, com.larksuite.framework.apiplugin.AbstractC25889a, com.larksuite.framework.apiplugin.AbstractC25937e, com.larksuite.framework.apiplugin.p1175a.AbstractC25899j
    public LKPluginHandleResult handleEvent(LKEvent lKEvent) {
        this.mICreatorListener.mo86424a();
        return super.handleEvent(lKEvent);
    }
}
