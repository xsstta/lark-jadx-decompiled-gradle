package com.bytedance.ies.bullet.service.base.lynx;

import com.bytedance.ies.bullet.service.base.api.IBulletService;
import com.bytedance.ies.bullet.service.base.api.IServiceToken;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH&J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u000bH&J\b\u0010\u000e\u001a\u00020\u000fH&R\u0018\u0010\u0002\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/bytedance/ies/bullet/service/base/lynx/ILynxKitService;", "Lcom/bytedance/ies/bullet/service/base/api/IBulletService;", "lynxConfig", "Lcom/bytedance/ies/bullet/service/base/lynx/ILynxConfig;", "getLynxConfig", "()Lcom/bytedance/ies/bullet/service/base/lynx/ILynxConfig;", "setLynxConfig", "(Lcom/bytedance/ies/bullet/service/base/lynx/ILynxConfig;)V", "createLynxDelegate", "Lcom/bytedance/ies/bullet/service/base/lynx/ILynxViewDelegate;", "context", "Lcom/bytedance/ies/bullet/service/base/api/IServiceToken;", "initKit", "", "ready", "", "x-servicecenter_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.bytedance.ies.bullet.service.base.b.b */
public interface ILynxKitService extends IBulletService {
    /* renamed from: a */
    ILynxViewDelegate mo52665a(IServiceToken jVar);
}
