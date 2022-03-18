package com.larksuite.component.openplatform.core.loader.meta.impl.block;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.larksuite.component.openplatform.core.block.C24421i;
import com.larksuite.component.openplatform.core.loader.meta.impl.block.C24566e;
import com.tt.miniapphost.host.HostDependManager;
import com.tt.refer.common.meta.AbstractC67783a;
import com.tt.refer.common.meta.AbstractC67788b;
import com.tt.refer.common.pkg.PackageEntity;
import com.tt.refer.common.util.C67859c;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class BlockMetaFetcher extends AbstractC67788b<C24566e.C24567a, C24560a> {

    @Retention(RetentionPolicy.SOURCE)
    public @interface BlockMetaLegalityCheckResultType {
    }

    /* access modifiers changed from: protected */
    @Override // com.tt.refer.common.meta.AbstractC67788b
    /* renamed from: a */
    public boolean mo50336a(int i) {
        return i != 0;
    }

    /* renamed from: a */
    public PackageEntity mo50334a(C24560a aVar) {
        PackageEntity packageEntity = new PackageEntity();
        packageEntity.setAppId(aVar.getAppId());
        packageEntity.setIdentifier(aVar.getIdentifier());
        packageEntity.setPackageName(aVar.mo87517e());
        packageEntity.setUrls(aVar.mo87519g());
        packageEntity.setMd5(aVar.mo87520h());
        packageEntity.setJsonMeta(aVar.toString());
        return packageEntity;
    }

    public BlockMetaFetcher(AbstractC67783a aVar, IAppContext iAppContext) {
        super(aVar, iAppContext);
        mo235275a(new C24421i(iAppContext));
    }

    /* renamed from: a */
    private boolean m89571a(String str, String str2) {
        this.f170741c.getTracingSpan().mo92224i("app_start_load_fetcher", "versionIsOk:", "blockMinVersion:", str, "currentVersion:", str2);
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return true;
        }
        return C67859c.m263997a(str2, str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo50332a(C24560a aVar, C24566e.C24567a aVar2, Context context) {
        boolean featureGating = HostDependManager.getInst().getFeatureGating("openplatform.block.enable.apicache");
        this.f170741c.getTracingSpan().mo92224i("app_start_load_fetcher", "enableBlockVersionCheck:", Boolean.valueOf(featureGating));
        if (featureGating && !m89571a(aVar.mo87507a(), (String) this.f170741c.getExtra("basic_lib_version"))) {
            return 1;
        }
        return 0;
    }
}
