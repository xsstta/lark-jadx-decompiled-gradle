package com.bytedance.ee.bear.middleground.permission.collaborator.manager.p478b;

import com.bytedance.ee.bear.contract.net.AbstractC5204e;
import com.bytedance.ee.bear.middleground.permission.collaborator.AbstractC9636d;
import com.bytedance.ee.bear.middleground.permission.collaborator.ShareUserInfoResult;
import com.bytedance.ee.bear.middleground.permission.permission.doc.DocPermissionFetcher;
import com.bytedance.ee.bear.middleground.permission.setting.manager.DocPermissionManager;
import com.bytedance.ee.bear.middleground_permission_export.model.AbstractC10169g;
import com.bytedance.ee.bear.middleground_permission_export.model.doc.IDocPublicPermission;
import com.bytedance.ee.bear.middleground_permission_export.model.doc.IDocUserPermission;
import com.bytedance.ee.bear.share.export.UserInfo;
import com.bytedance.ee.log.C13479a;
import io.reactivex.AbstractC68307f;

/* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.manager.b.d */
public class C9821d implements AbstractC9827g {
    /* renamed from: a */
    private void m40539a() {
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        m40539a();
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.manager.p478b.AbstractC9827g
    /* renamed from: b */
    public AbstractC68307f<Boolean> mo37334b(String str, int i) {
        return DocPermissionManager.m41990a(i, str);
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.manager.p478b.AbstractC9827g
    /* renamed from: a */
    public AbstractC68307f<IDocPublicPermission> mo37328a(String str, int i) {
        return new DocPermissionFetcher().mo38097c(str, i);
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.manager.p478b.AbstractC9827g
    /* renamed from: c */
    public AbstractC68307f<IDocUserPermission> mo37336c(String str, int i) {
        return new DocPermissionFetcher().mo38096b(str, i);
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.manager.p478b.AbstractC9827g
    /* renamed from: a */
    public AbstractC68307f<Boolean> mo37330a(String str, int i, UserInfo userInfo) {
        return DocPermissionManager.m41994a(i, str, userInfo.getId(), userInfo.getOwnerType());
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.manager.p478b.AbstractC9827g
    /* renamed from: b */
    public void mo37335b(String str, int i, UserInfo userInfo, AbstractC9636d dVar) {
        DocPermissionManager.m42001a(i, str, userInfo, (AbstractC10169g) dVar);
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.manager.p478b.AbstractC9827g
    /* renamed from: a */
    public void mo37332a(String str, int i, UserInfo userInfo, AbstractC9636d dVar) {
        DocPermissionManager.m42000a(i, str, userInfo, dVar);
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.manager.p478b.AbstractC9827g
    /* renamed from: a */
    public AbstractC68307f<Boolean> mo37329a(String str, int i, int i2, UserInfo userInfo) {
        return DocPermissionManager.m41995a(i, str, userInfo.getId(), userInfo.getOwnerType(), i2);
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.manager.p478b.AbstractC9827g
    /* renamed from: a */
    public void mo37333a(String str, int i, String str2, AbstractC5204e<ShareUserInfoResult> eVar) {
        DocPermissionManager.m41989a(i, str, str2, eVar);
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.manager.p478b.AbstractC9827g
    /* renamed from: a */
    public void mo37331a(String str, int i, int i2, UserInfo userInfo, AbstractC9636d dVar) {
        if (userInfo.getPermission() == 0) {
            C13479a.m54764b("DocumentCollaboratorManageModel", "setCollaboratorPermission()... from not perm to " + i2);
            DocPermissionManager.m41998a(i, str, userInfo, i2, dVar);
            return;
        }
        DocPermissionManager.m42004b(i, str, userInfo, i2, dVar);
    }
}
