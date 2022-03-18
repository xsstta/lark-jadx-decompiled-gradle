package com.bytedance.ies.bullet.service.base;

import com.bytedance.ies.bullet.service.base.api.IBulletService;
import java.util.List;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J<\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\fH&J\"\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\r2\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fH&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0014"}, d2 = {"Lcom/bytedance/ies/bullet/service/base/ISchemaService;", "Lcom/bytedance/ies/bullet/service/base/api/IBulletService;", "config", "Lcom/bytedance/ies/bullet/service/base/ISchemaConfig;", "getConfig", "()Lcom/bytedance/ies/bullet/service/base/ISchemaConfig;", "convert", "Landroid/net/Uri;", "uri", "bundle", "Landroid/os/Bundle;", "packageNames", "", "", "hooks", "Lcom/bytedance/ies/bullet/service/base/IConvertHook;", "extractDetailFromPrefix", "Lcom/bytedance/ies/bullet/service/base/ChannelBundleModel;", "url", "prefixList", "x-servicecenter_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.bytedance.ies.bullet.service.base.i */
public interface ISchemaService extends IBulletService {
    /* renamed from: a */
    ChannelBundleModel mo52669a(String str, List<String> list);

    /* renamed from: b */
    ISchemaConfig mo52670b();
}
