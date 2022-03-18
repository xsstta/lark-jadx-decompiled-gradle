package com.bytedance.ee.bear.middleground.permission.setting.linkshare;

import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.list.dto.FolderVersion;
import com.bytedance.ee.bear.middleground.permission.collaborator.manager.folder.C9829a;
import com.bytedance.ee.bear.middleground.permission.sharefolder.FolderPermissionManager;
import com.bytedance.ee.bear.middleground.permission.sharefolder.FolderPermissionManagerDispatcher;
import com.bytedance.ee.bear.middleground_permission_export.model.AbstractC10169g;
import com.bytedance.ee.bear.middleground_permission_export.model.folder.ShareFolderPublicPermission;
import com.bytedance.ee.bear.service.C10917c;
import io.reactivex.AbstractC68307f;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.middleground.permission.setting.linkshare.r */
public class C10078r implements AbstractC10036j {

    /* renamed from: a */
    private C10917c f27230a;

    /* renamed from: b */
    private C9829a f27231b;

    /* renamed from: c */
    private boolean f27232c;

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        m41929a();
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        C9829a aVar = this.f27231b;
        if (aVar != null) {
            aVar.mo37388a();
        }
    }

    /* renamed from: a */
    private void m41929a() {
        this.f27231b = new C9829a((NetService) KoinJavaComponent.m268610a(NetService.class));
    }

    C10078r(C10917c cVar, boolean z) {
        this.f27230a = cVar;
        this.f27232c = z;
    }

    @Override // com.bytedance.ee.bear.middleground.permission.setting.linkshare.AbstractC10036j
    /* renamed from: a */
    public AbstractC68307f<Boolean> mo38347a(String str, int i) {
        return FolderPermissionManager.m41235a(str, i);
    }

    @Override // com.bytedance.ee.bear.middleground.permission.setting.linkshare.AbstractC10036j
    /* renamed from: b */
    public void mo38350b(String str, AbstractC10169g gVar) {
        this.f27231b.mo37390b(str, gVar, this.f27232c);
    }

    @Override // com.bytedance.ee.bear.middleground.permission.setting.linkshare.AbstractC10036j
    /* renamed from: c */
    public void mo38351c(String str, AbstractC10169g gVar) {
        this.f27231b.mo37391c(str, gVar, this.f27232c);
    }

    @Override // com.bytedance.ee.bear.middleground.permission.setting.linkshare.AbstractC10036j
    /* renamed from: d */
    public void mo38352d(String str, AbstractC10169g gVar) {
        this.f27231b.mo37392d(str, gVar, this.f27232c);
    }

    @Override // com.bytedance.ee.bear.middleground.permission.setting.linkshare.AbstractC10036j
    /* renamed from: a */
    public AbstractC68307f<ShareFolderPublicPermission> mo38348a(String str, FolderVersion folderVersion) {
        return FolderPermissionManagerDispatcher.m41256a(folderVersion.isShareFolderV2()).mo37735a(str, folderVersion);
    }

    @Override // com.bytedance.ee.bear.middleground.permission.setting.linkshare.AbstractC10036j
    /* renamed from: a */
    public void mo38349a(String str, AbstractC10169g gVar) {
        this.f27231b.mo37389a(str, gVar, this.f27232c);
    }
}
