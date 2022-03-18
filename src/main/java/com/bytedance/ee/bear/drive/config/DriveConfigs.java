package com.bytedance.ee.bear.drive.config;

import com.bytedance.ee.bear.browser.plugin.AbstractC4948i;
import com.bytedance.ee.bear.browser.plugin.C4943e;
import com.bytedance.ee.bear.browser.plugin.C4946h;
import com.bytedance.ee.bear.drive.config.plugin.DriveImAttachmentPlugins;
import com.bytedance.ee.bear.drive.config.plugin.DriveLocalFilePlugins;
import com.bytedance.ee.bear.drive.config.plugin.DriveSpaceAttachmentPlugins;
import com.bytedance.ee.bear.drive.config.plugin.DriveSpaceFilePlugins;
import com.bytedance.ee.bear.drive.config.plugin.DriveSpaceThirdPartyAttachmentPlugins;
import com.bytedance.ee.bear.drive.config.plugin.common.DriveCommonPlugins;
import com.bytedance.ee.bear.drive.core.DrivePluginHost;
import com.bytedance.ee.bear.drive.core.load.IFileLoader;
import com.bytedance.ee.bear.drive.loader.impl.IMFileLoader;
import com.bytedance.ee.bear.drive.loader.impl.LocalFileLoader;
import com.bytedance.ee.bear.drive.loader.impl.SpaceFileLoader;
import com.bytedance.ee.log.C13479a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\nH\u0016¨\u0006\u000b"}, d2 = {"Lcom/bytedance/ee/bear/drive/config/DriveConfigs;", "Lcom/bytedance/ee/bear/browser/plugin/PluginListProvider;", "()V", "createBizPluginList", "Lcom/bytedance/ee/bear/browser/plugin/PluginList;", "host", "Lcom/bytedance/ee/bear/drive/core/DrivePluginHost;", "getFileLoader", "Lcom/bytedance/ee/bear/drive/core/load/IFileLoader;", "getPluginList", "Lcom/bytedance/ee/bear/browser/plugin/PluginHost;", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.drive.config.c */
public final class DriveConfigs implements AbstractC4948i {
    @Override // com.bytedance.ee.bear.browser.plugin.AbstractC4948i
    /* renamed from: a */
    public C4946h mo17011a(C4943e eVar) {
        Intrinsics.checkParameterIsNotNull(eVar, "host");
        DrivePluginHost aVar = (DrivePluginHost) eVar;
        C4946h a = C4946h.m20451a(DriveCommonPlugins.f18706a.mo27233a(aVar), m27351b(aVar));
        Intrinsics.checkExpressionValueIsNotNull(a, "PluginList.merge(DriveCo…uginHost), bizPluginList)");
        return a;
    }

    /* renamed from: b */
    private final C4946h m27351b(DrivePluginHost aVar) {
        int bizType = aVar.mo27261l().getBizType();
        C13479a.m54764b("DriveComponent", "createBizPluginList() bizType=" + bizType);
        if (bizType == 1) {
            return DriveLocalFilePlugins.f18707a.mo27234a(aVar);
        }
        if (bizType == 2) {
            return DriveSpaceFilePlugins.f18709a.mo27236a(aVar);
        }
        if (bizType == 3) {
            return DriveImAttachmentPlugins.f18705a.mo27232a(aVar);
        }
        if (bizType == 4) {
            return DriveSpaceAttachmentPlugins.f18708a.mo27235a(aVar);
        }
        if (bizType == 5) {
            return DriveSpaceThirdPartyAttachmentPlugins.f18710a.mo27237a(aVar);
        }
        C13479a.m54758a("DriveComponent", "not found bizType in createBizPluginList()");
        C4946h a = C4946h.m20453a(new C4946h.C4947a[0]);
        Intrinsics.checkExpressionValueIsNotNull(a, "PluginList.newList()");
        return a;
    }

    /* renamed from: a */
    public final IFileLoader mo27179a(DrivePluginHost aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "host");
        int bizType = aVar.mo27261l().getBizType();
        C13479a.m54764b("DriveComponent", "getFileLoader() bizType=" + bizType);
        if (bizType == 1) {
            return new LocalFileLoader(aVar);
        }
        if (bizType != 3) {
            return new SpaceFileLoader(aVar);
        }
        return new IMFileLoader(aVar);
    }
}
