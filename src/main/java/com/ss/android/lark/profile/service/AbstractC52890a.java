package com.ss.android.lark.profile.service;

import com.bytedance.lark.pb.contact.v2.GetUserProfileResponse;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.biz.core.api.ProfileResponse;
import com.ss.android.lark.profile.dto.ChatterDescriptionResponse;
import com.ss.android.lark.profile.entity.ChatterDescription;
import com.ss.android.lark.profile.entity.Profile;
import com.ss.android.lark.profile.v2.entity.BaseField;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.lark.profile.service.a */
public interface AbstractC52890a {
    /* renamed from: a */
    Profile mo180502a();

    /* renamed from: a */
    String mo180503a(BaseField baseField);

    /* renamed from: a */
    ArrayList<BaseField> mo180504a(List<GetUserProfileResponse.Field> list);

    /* renamed from: a */
    void mo180505a(int i, int i2, IGetDataCallback<ChatterDescriptionResponse.ChatterDescriptionsResponse> iGetDataCallback);

    /* renamed from: a */
    void mo180506a(ChatterDescription chatterDescription, IGetDataCallback<Boolean> iGetDataCallback);

    /* renamed from: a */
    void mo180507a(String str, int i, IGetDataCallback<String> iGetDataCallback);

    /* renamed from: a */
    void mo180508a(String str, IGetDataCallback<ProfileResponse> iGetDataCallback);

    /* renamed from: b */
    void mo180509b(String str, IGetDataCallback<ProfileResponse> iGetDataCallback);
}
