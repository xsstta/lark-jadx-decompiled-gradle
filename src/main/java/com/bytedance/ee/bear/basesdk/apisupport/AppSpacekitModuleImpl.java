package com.bytedance.ee.bear.basesdk.apisupport;

import android.app.Application;
import com.bytedance.ee.bear.basesdk.AbstractC4463c;
import com.bytedance.ee.bear.contract.config.DocDynamicConfig;
import com.bytedance.ee.util.io.NonProguard;
import com.ss.android.lark.integrator.ccm.dependency.C39278a;

final class AppSpacekitModuleImpl implements AbstractC4429o, NonProguard {
    private final C39278a appSpacekitModule = new C39278a();

    @Override // com.bytedance.ee.bear.basesdk.apisupport.AbstractC4429o
    public Application application() {
        return this.appSpacekitModule.application();
    }

    @Override // com.bytedance.ee.bear.basesdk.apisupport.AbstractC4429o
    public AbstractC4433s dependency() {
        return this.appSpacekitModule.dependency();
    }

    @Override // com.bytedance.ee.bear.basesdk.apisupport.AbstractC4429o
    public AbstractC4463c docBaseConfig() {
        return this.appSpacekitModule.docBaseConfig();
    }

    @Override // com.bytedance.ee.bear.basesdk.apisupport.AbstractC4429o
    public DocDynamicConfig docDynamicConfig() {
        return this.appSpacekitModule.docDynamicConfig();
    }

    AppSpacekitModuleImpl() {
    }
}
