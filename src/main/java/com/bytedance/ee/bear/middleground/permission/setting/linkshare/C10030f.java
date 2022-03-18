package com.bytedance.ee.bear.middleground.permission.setting.linkshare;

import com.bytedance.ee.bear.middleground.permission.PermFGUtils;
import com.bytedance.ee.bear.middleground.permission.permission.doc.DocPermissionFetcher;
import com.bytedance.ee.bear.middleground.permission.setting.manager.DocPermissionManager;
import com.bytedance.ee.bear.middleground.permission.setting.manager.DocPublicPermissionManager;
import com.bytedance.ee.bear.middleground_permission_export.model.AbstractC10169g;
import com.bytedance.ee.bear.middleground_permission_export.model.doc.IDocPublicPermission;
import io.reactivex.AbstractC68307f;

/* renamed from: com.bytedance.ee.bear.middleground.permission.setting.linkshare.f */
public class C10030f implements AbstractC10033h {

    /* renamed from: a */
    private DocPublicPermissionManager f27119a;

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        this.f27119a = new DocPublicPermissionManager(PermFGUtils.m39533b());
    }

    @Override // com.bytedance.ee.bear.middleground.permission.setting.linkshare.AbstractC10033h
    /* renamed from: a */
    public AbstractC68307f<IDocPublicPermission> mo38337a(String str, int i) {
        return new DocPermissionFetcher().mo38097c(str, i);
    }

    @Override // com.bytedance.ee.bear.middleground.permission.setting.linkshare.AbstractC10033h
    /* renamed from: a */
    public AbstractC68307f<Boolean> mo38338a(String str, int i, int i2) {
        return DocPermissionManager.m41991a(i, str, i2);
    }

    @Override // com.bytedance.ee.bear.middleground.permission.setting.linkshare.AbstractC10033h
    /* renamed from: b */
    public void mo38340b(int i, String str, int i2, AbstractC10169g gVar) {
        this.f27119a.mo38463b(str, i, i2, gVar);
    }

    @Override // com.bytedance.ee.bear.middleground.permission.setting.linkshare.AbstractC10033h
    /* renamed from: c */
    public void mo38341c(int i, String str, int i2, AbstractC10169g gVar) {
        this.f27119a.mo38465c(str, i, i2, gVar);
    }

    @Override // com.bytedance.ee.bear.middleground.permission.setting.linkshare.AbstractC10033h
    /* renamed from: d */
    public void mo38342d(int i, String str, int i2, AbstractC10169g gVar) {
        this.f27119a.mo38467d(str, i, i2, gVar);
    }

    @Override // com.bytedance.ee.bear.middleground.permission.setting.linkshare.AbstractC10033h
    /* renamed from: e */
    public void mo38343e(int i, String str, int i2, AbstractC10169g gVar) {
        this.f27119a.mo38469e(str, i, i2, gVar);
    }

    @Override // com.bytedance.ee.bear.middleground.permission.setting.linkshare.AbstractC10033h
    /* renamed from: a */
    public void mo38339a(int i, String str, int i2, AbstractC10169g gVar) {
        this.f27119a.mo38459a(str, i, i2, gVar);
    }
}
