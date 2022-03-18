package com.bytedance.kit.nglynx;

import com.bytedance.ies.bullet.service.base.api.IServiceToken;
import com.bytedance.ies.bullet.service.base.impl.BaseBulletService;
import com.bytedance.ies.bullet.service.base.lynx.ILynxConfig;
import com.bytedance.ies.bullet.service.base.lynx.ILynxKitService;
import com.bytedance.ies.bullet.service.base.lynx.ILynxViewDelegate;
import com.bytedance.kit.nglynx.init.LynxConfig;
import com.bytedance.kit.nglynx.init.LynxKit;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B\u0007\b\u0016¢\u0006\u0002\u0010\u0003B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u0010\u001a\u00020\u0011H\u0016R\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\u0006¨\u0006\u0012"}, d2 = {"Lcom/bytedance/kit/nglynx/LynxKitService;", "Lcom/bytedance/ies/bullet/service/base/impl/BaseBulletService;", "Lcom/bytedance/ies/bullet/service/base/lynx/ILynxKitService;", "()V", "lynxConfig", "Lcom/bytedance/ies/bullet/service/base/lynx/ILynxConfig;", "(Lcom/bytedance/ies/bullet/service/base/lynx/ILynxConfig;)V", "getLynxConfig", "()Lcom/bytedance/ies/bullet/service/base/lynx/ILynxConfig;", "setLynxConfig", "createLynxDelegate", "Lcom/bytedance/ies/bullet/service/base/lynx/ILynxViewDelegate;", "context", "Lcom/bytedance/ies/bullet/service/base/api/IServiceToken;", "initKit", "", "ready", "", "x-lynx-kit_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.bytedance.kit.nglynx.d */
public class LynxKitService extends BaseBulletService implements ILynxKitService {

    /* renamed from: a */
    private ILynxConfig f38586a;

    /* renamed from: b */
    public ILynxConfig mo53789b() {
        return this.f38586a;
    }

    public LynxKitService() {
        this(new ILynxConfig() {
            /* class com.bytedance.kit.nglynx.LynxKitService.C145731 */
        });
    }

    @Override // com.bytedance.ies.bullet.service.base.lynx.ILynxKitService
    /* renamed from: a */
    public ILynxViewDelegate mo52665a(IServiceToken jVar) {
        Intrinsics.checkParameterIsNotNull(jVar, "context");
        return new LynxKitView(jVar, this);
    }

    public LynxKitService(ILynxConfig aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "lynxConfig");
        this.f38586a = aVar;
    }

    /* renamed from: b */
    public void mo53790b(IServiceToken jVar) {
        Intrinsics.checkParameterIsNotNull(jVar, "context");
        ILynxConfig b = mo53789b();
        if (!(b instanceof LynxConfig)) {
            b = null;
        }
        if (b != null) {
            LynxKit.f38569a.mo53772a((LynxConfig) b, jVar);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.bytedance.kit.nglynx.init.LynxConfig");
    }
}
