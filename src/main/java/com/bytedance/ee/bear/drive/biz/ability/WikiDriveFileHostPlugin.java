package com.bytedance.ee.bear.drive.biz.ability;

import com.bytedance.ee.bear.browser.plugin.BasePlugin;
import com.bytedance.ee.bear.browser.plugin.C4943e;
import com.bytedance.ee.bear.browser.plugin.PluginHostAbility;
import com.bytedance.ee.bear.drive.ability.FileHostAbility;
import com.bytedance.ee.bear.drive.core.DrivePluginHost;
import com.bytedance.ee.bear.drive.core.model.AbstractC6946a;
import com.bytedance.ee.bear.drive.core.model.AbstractC6947b;
import com.bytedance.ee.log.C13479a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\fB\u0005¢\u0006\u0002\u0010\u0004J\u000f\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0002\u0010\u0007J\u0012\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016J\u0012\u0010\u000b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\r"}, d2 = {"Lcom/bytedance/ee/bear/drive/biz/ability/WikiDriveFileHostPlugin;", "Lcom/bytedance/ee/bear/browser/plugin/BasePlugin;", "Lcom/bytedance/ee/bear/drive/core/DrivePluginHost;", "Lcom/bytedance/ee/bear/drive/ability/FileHostAbility;", "()V", "getFileSize", "", "()Ljava/lang/Long;", "onAttachToHost", "", "host", "onDetachFromHost", "Companion", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class WikiDriveFileHostPlugin extends BasePlugin<DrivePluginHost> implements FileHostAbility {
    public static final Companion Companion = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ee/bear/drive/biz/ability/WikiDriveFileHostPlugin$Companion;", "", "()V", "TAG", "", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.biz.ability.WikiDriveFileHostPlugin$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.bytedance.ee.bear.drive.ability.FileHostAbility
    public Long getFileSize() {
        Long l;
        Object obj;
        AbstractC6947b a;
        AbstractC6946a fileModel = ((DrivePluginHost) getHost()).mo27261l().getFileModel();
        if (fileModel == null || (a = fileModel.mo27322a()) == null) {
            l = null;
        } else {
            l = Long.valueOf(a.f18787c);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("getFileSize = ");
        if (l != null) {
            obj = l;
        } else {
            obj = "0";
        }
        sb.append(obj);
        C13479a.m54764b("WikiDriveFileHostPlugin", sb.toString());
        return l;
    }

    public void onAttachToHost(DrivePluginHost aVar) {
        super.onAttachToHost((C4943e) aVar);
        if (aVar != null) {
            aVar.mo19545a((PluginHostAbility) this);
        }
    }

    public void onDetachFromHost(DrivePluginHost aVar) {
        super.onDetachFromHost((C4943e) aVar);
        if (aVar != null) {
            aVar.mo19553b((PluginHostAbility) this);
        }
    }
}
