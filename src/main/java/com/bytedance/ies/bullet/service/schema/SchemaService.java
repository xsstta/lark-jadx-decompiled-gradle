package com.bytedance.ies.bullet.service.schema;

import com.bytedance.ies.bullet.service.base.ChannelBundleModel;
import com.bytedance.ies.bullet.service.base.ISchemaConfig;
import com.bytedance.ies.bullet.service.base.ISchemaService;
import com.bytedance.ies.bullet.service.base.impl.BaseBulletService;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00162\u00020\u00012\u00020\u0002:\u0001\u0016B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J6\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000eH\u0016J \u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u000f2\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eH\u0016R\u0014\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0017"}, d2 = {"Lcom/bytedance/ies/bullet/service/schema/SchemaService;", "Lcom/bytedance/ies/bullet/service/base/impl/BaseBulletService;", "Lcom/bytedance/ies/bullet/service/base/ISchemaService;", "config", "Lcom/bytedance/ies/bullet/service/base/ISchemaConfig;", "(Lcom/bytedance/ies/bullet/service/base/ISchemaConfig;)V", "getConfig", "()Lcom/bytedance/ies/bullet/service/base/ISchemaConfig;", "convert", "Landroid/net/Uri;", "uri", "bundle", "Landroid/os/Bundle;", "packageNames", "", "", "hooks", "Lcom/bytedance/ies/bullet/service/base/IConvertHook;", "extractDetailFromPrefix", "Lcom/bytedance/ies/bullet/service/base/ChannelBundleModel;", "url", "prefixList", "Companion", "x-schema_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.bytedance.ies.bullet.service.schema.c */
public final class SchemaService extends BaseBulletService implements ISchemaService {

    /* renamed from: a */
    public static final Companion f37967a = new Companion(null);

    /* renamed from: b */
    private final ISchemaConfig f37968b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ies/bullet/service/schema/SchemaService$Companion;", "", "()V", "MODULE", "", "x-schema_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.bytedance.ies.bullet.service.schema.c$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.bytedance.ies.bullet.service.base.ISchemaService
    /* renamed from: b */
    public ISchemaConfig mo52670b() {
        return this.f37968b;
    }

    public SchemaService(ISchemaConfig hVar) {
        Intrinsics.checkParameterIsNotNull(hVar, "config");
        this.f37968b = hVar;
    }

    @Override // com.bytedance.ies.bullet.service.base.ISchemaService
    /* renamed from: a */
    public ChannelBundleModel mo52669a(String str, List<String> list) {
        Intrinsics.checkParameterIsNotNull(str, "url");
        ChannelBundleParser aVar = ChannelBundleParser.f37959a;
        if (list == null) {
            list = mo52670b().mo52668a();
        }
        return aVar.mo52804a(str, list);
    }
}
