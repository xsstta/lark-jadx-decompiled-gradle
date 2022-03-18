package com.ss.android.lark.contact.impl.setting.one_way_contact.block_list;

import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.BaseModel;
import com.ss.android.lark.contact.impl.setting.one_way_contact.block_list.IPrivacyBlockListContract;
import com.ss.android.lark.contact.impl.setting.one_way_contact.entity.BlockListInfo;
import com.ss.android.lark.contact.impl.setting.service.PrivacyService;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00142\u00020\u00012\u00020\u0002:\u0001\u0014B\u0005¢\u0006\u0002\u0010\u0003J(\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u00072\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\rH\u0016J\b\u0010\u000e\u001a\u00020\u0005H\u0016J\"\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u00052\u0010\u0010\f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0018\u00010\rH\u0016J\b\u0010\u0012\u001a\u00020\u0007H\u0016J\u0018\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0007H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/ss/android/lark/contact/impl/setting/one_way_contact/block_list/PrivacyBlockListModel;", "Lcom/larksuite/framework/mvp/BaseModel;", "Lcom/ss/android/lark/contact/impl/setting/one_way_contact/block_list/IPrivacyBlockListContract$IModel;", "()V", "mCurrentCursor", "", "mIsHasMore", "", "deleteExceptionUser", "", "userId", UpdateKey.STATUS, "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "getCurrentCursor", "getExceptionUserList", "cursor", "Lcom/ss/android/lark/contact/impl/setting/one_way_contact/entity/BlockListInfo;", "isHasMore", "updateParameter", "Companion", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.contact.impl.setting.one_way_contact.block_list.b */
public final class PrivacyBlockListModel extends BaseModel implements IPrivacyBlockListContract.IModel {

    /* renamed from: a */
    public static final Companion f93126a = new Companion(null);

    /* renamed from: b */
    private String f93127b = "0";

    /* renamed from: c */
    private boolean f93128c = true;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/contact/impl/setting/one_way_contact/block_list/PrivacyBlockListModel$Companion;", "", "()V", "TAG", "", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.contact.impl.setting.one_way_contact.block_list.b$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.ss.android.lark.contact.impl.setting.one_way_contact.block_list.IPrivacyBlockListContract.IModel
    /* renamed from: a */
    public String mo132470a() {
        return this.f93127b;
    }

    @Override // com.ss.android.lark.contact.impl.setting.one_way_contact.block_list.IPrivacyBlockListContract.IModel
    /* renamed from: b */
    public boolean mo132474b() {
        return this.f93128c;
    }

    @Override // com.ss.android.lark.contact.impl.setting.one_way_contact.block_list.IPrivacyBlockListContract.IModel
    /* renamed from: a */
    public void mo132472a(String str, boolean z) {
        Intrinsics.checkParameterIsNotNull(str, "cursor");
        this.f93127b = str;
        this.f93128c = z;
    }

    @Override // com.ss.android.lark.contact.impl.setting.one_way_contact.block_list.IPrivacyBlockListContract.IModel
    /* renamed from: a */
    public void mo132471a(String str, IGetDataCallback<BlockListInfo> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(str, "cursor");
        PrivacyService.m141400a().mo132578a(str, getCallbackManager().wrapAndAddGetDataCallback(iGetDataCallback));
    }

    @Override // com.ss.android.lark.contact.impl.setting.one_way_contact.block_list.IPrivacyBlockListContract.IModel
    /* renamed from: a */
    public void mo132473a(String str, boolean z, IGetDataCallback<Boolean> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(str, "userId");
        PrivacyService.m141400a().mo132580a(str, z, getCallbackManager().wrapAndAddGetDataCallback(iGetDataCallback));
    }
}
