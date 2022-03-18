package com.ss.android.lark.contact.impl.setting.one_way_contact.permission;

import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.BaseModel;
import com.ss.android.lark.contact.impl.setting.one_way_contact.permission.IChatPermissionContract;
import com.ss.android.lark.contact.impl.setting.service.PrivacyService;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u00020\u00052\u0010\u0010\u0006\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u0007H\u0016J \u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\b2\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0007H\u0016¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/contact/impl/setting/one_way_contact/permission/ChatPermissionModel;", "Lcom/larksuite/framework/mvp/BaseModel;", "Lcom/ss/android/lark/contact/impl/setting/one_way_contact/permission/IChatPermissionContract$IModel;", "()V", "getCoordinationAuth", "", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "setCoordinationAuth", ShareHitPoint.f121869d, "", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.contact.impl.setting.one_way_contact.permission.b */
public final class ChatPermissionModel extends BaseModel implements IChatPermissionContract.IModel {
    @Override // com.ss.android.lark.contact.impl.setting.one_way_contact.permission.IChatPermissionContract.IModel
    /* renamed from: a */
    public void mo132539a(IGetDataCallback<Integer> iGetDataCallback) {
        PrivacyService.m141400a().mo132589f(getCallbackManager().wrapAndAddGetDataCallback(iGetDataCallback));
    }

    @Override // com.ss.android.lark.contact.impl.setting.one_way_contact.permission.IChatPermissionContract.IModel
    /* renamed from: a */
    public void mo132538a(int i, IGetDataCallback<Boolean> iGetDataCallback) {
        PrivacyService.m141400a().mo132574a(i, getCallbackManager().wrapAndAddGetDataCallback(iGetDataCallback));
    }
}
