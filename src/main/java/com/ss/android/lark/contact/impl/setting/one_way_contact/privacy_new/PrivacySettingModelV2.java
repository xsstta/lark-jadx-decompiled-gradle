package com.ss.android.lark.contact.impl.setting.one_way_contact.privacy_new;

import com.bytedance.lark.pb.basic.v1.UniversalUserSetting;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.BaseModel;
import com.ss.android.lark.contact.impl.setting.one_way_contact.privacy_new.IPrivacySettingContactV2;
import com.ss.android.lark.contact.impl.setting.service.PrivacyService;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u00020\u00052\u0010\u0010\u0006\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u0007H\u0016J\b\u0010\t\u001a\u00020\nH\u0016J \u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\n2\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0007H\u0016¨\u0006\u000e"}, d2 = {"Lcom/ss/android/lark/contact/impl/setting/one_way_contact/privacy_new/PrivacySettingModelV2;", "Lcom/larksuite/framework/mvp/BaseModel;", "Lcom/ss/android/lark/contact/impl/setting/one_way_contact/privacy_new/IPrivacySettingContactV2$IModel;", "()V", "getBlockNumber", "", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "getUserPhoneCheckSetting", "", "updateUserPhoneCheckSetting", "isChecked", "Lcom/bytedance/lark/pb/basic/v1/UniversalUserSetting;", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.contact.impl.setting.one_way_contact.privacy_new.c */
public final class PrivacySettingModelV2 extends BaseModel implements IPrivacySettingContactV2.IModel {
    @Override // com.ss.android.lark.contact.impl.setting.one_way_contact.privacy_new.IPrivacySettingContactV2.IModel
    /* renamed from: a */
    public boolean mo132557a() {
        PrivacyService a = PrivacyService.m141400a();
        Intrinsics.checkExpressionValueIsNotNull(a, "PrivacyService.getInstance()");
        return a.mo132587d();
    }

    @Override // com.ss.android.lark.contact.impl.setting.one_way_contact.privacy_new.IPrivacySettingContactV2.IModel
    /* renamed from: a */
    public void mo132555a(IGetDataCallback<Integer> iGetDataCallback) {
        PrivacyService.m141400a().mo132590g(getCallbackManager().wrapAndAddGetDataCallback(iGetDataCallback));
    }

    @Override // com.ss.android.lark.contact.impl.setting.one_way_contact.privacy_new.IPrivacySettingContactV2.IModel
    /* renamed from: a */
    public void mo132556a(boolean z, IGetDataCallback<UniversalUserSetting> iGetDataCallback) {
        PrivacyService.m141400a().mo132581a(z, getCallbackManager().wrapAndAddGetDataCallback(iGetDataCallback));
    }
}
