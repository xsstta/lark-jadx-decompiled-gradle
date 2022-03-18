package com.bytedance.ee.bear.middleground.permission.setting.linkshare.form;

import com.bytedance.ee.bear.contract.net.SimpleRequestResult;
import com.bytedance.ee.bear.middleground.permission.permission.bitableshare.BitableSharePermissionManager;
import com.bytedance.ee.bear.middleground.permission.setting.linkshare.form.IBitableShareLinkShareSettingContract;
import com.bytedance.ee.bear.middleground_permission_export.model.form.IBitableSharePublicPermission;
import com.bytedance.ee.bear.middleground_permission_export.model.permissionset.BitableSharePermSetInfo;
import io.reactivex.AbstractC68307f;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\bH\u0016J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0016J\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000b2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/setting/linkshare/form/BitableShareLinkShareSettingModel;", "Lcom/bytedance/ee/bear/middleground/permission/setting/linkshare/form/IBitableShareLinkShareSettingContract$IModel;", "info", "Lcom/bytedance/ee/bear/middleground_permission_export/model/permissionset/BitableSharePermSetInfo;", "(Lcom/bytedance/ee/bear/middleground_permission_export/model/permissionset/BitableSharePermSetInfo;)V", "getInfo", "()Lcom/bytedance/ee/bear/middleground_permission_export/model/permissionset/BitableSharePermSetInfo;", "create", "", "destroy", "fetchPublicPermission", "Lio/reactivex/Flowable;", "Lcom/bytedance/ee/bear/middleground_permission_export/model/form/IBitableSharePublicPermission;", "updateLinkShareEntity", "Lcom/bytedance/ee/bear/contract/net/SimpleRequestResult;", "newLinkShareEntity", "", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.middleground.permission.setting.linkshare.a.b */
public final class BitableShareLinkShareSettingModel implements IBitableShareLinkShareSettingContract.IModel {

    /* renamed from: a */
    private final BitableSharePermSetInfo f27073a;

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
    }

    @Override // com.bytedance.ee.bear.middleground.permission.setting.linkshare.form.IBitableShareLinkShareSettingContract.IModel
    /* renamed from: a */
    public AbstractC68307f<IBitableSharePublicPermission> mo38310a() {
        return BitableSharePermissionManager.m41322a(this.f27073a.mo38783d(), this.f27073a.mo38785e().getShareToken());
    }

    public BitableShareLinkShareSettingModel(BitableSharePermSetInfo bitableSharePermSetInfo) {
        Intrinsics.checkParameterIsNotNull(bitableSharePermSetInfo, "info");
        this.f27073a = bitableSharePermSetInfo;
    }

    @Override // com.bytedance.ee.bear.middleground.permission.setting.linkshare.form.IBitableShareLinkShareSettingContract.IModel
    /* renamed from: a */
    public AbstractC68307f<SimpleRequestResult> mo38311a(int i) {
        return BitableSharePermissionManager.m41320a(this.f27073a.mo38785e().getShareToken(), i);
    }
}
