package com.larksuite.component.openplatform.core.container.impl;

import com.larksuite.framework.apiplugin.AbstractC25937e;
import com.larksuite.framework.apiplugin.LKEvent;
import com.larksuite.framework.apiplugin.entity.LKPluginHandleResult;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25896g;

/* renamed from: com.larksuite.component.openplatform.core.container.impl.b */
public class C24481b extends AbstractC25937e {

    /* renamed from: a */
    private final AbstractC24482a f60403a;

    /* renamed from: com.larksuite.component.openplatform.core.container.impl.b$a */
    public interface AbstractC24482a {
        void onHideLoadingCalled();
    }

    @Override // com.larksuite.framework.apiplugin.AbstractC25937e
    public void onRelease() {
    }

    public C24481b(AbstractC24482a aVar) {
        this.f60403a = aVar;
    }

    @Override // com.larksuite.framework.apiplugin.AbstractC25937e
    public void addEvents(AbstractC25896g gVar) {
        gVar.mo92192a("hideBlockLoading");
    }

    @Override // com.larksuite.framework.apiplugin.AbstractC25937e, com.larksuite.framework.apiplugin.p1175a.AbstractC25899j
    public LKPluginHandleResult handleEvent(LKEvent lKEvent) {
        this.f60403a.onHideLoadingCalled();
        return lKEvent.mo92154u();
    }
}
