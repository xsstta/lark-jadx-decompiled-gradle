package com.ss.android.lark.profile.service;

import android.text.TextUtils;
import com.bytedance.lark.pb.basic.v1.Chatter;
import com.bytedance.lark.pb.contact.v1.GetChatterDescriptionsResponse;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.profile.dto.ChatterDescriptionResponse;
import com.ss.android.lark.profile.dto.DeleteChatterDescriptionResponse;
import com.ss.android.lark.profile.entity.ChatterDescription;
import java.util.ArrayList;

/* renamed from: com.ss.android.lark.profile.service.c */
public class C52892c {
    /* renamed from: a */
    public static DeleteChatterDescriptionResponse m204609a(com.bytedance.lark.pb.contact.v1.DeleteChatterDescriptionResponse deleteChatterDescriptionResponse) {
        return new DeleteChatterDescriptionResponse();
    }

    /* renamed from: a */
    public static ChatterDescriptionResponse.ChatterDescriptionsResponse m204608a(GetChatterDescriptionsResponse getChatterDescriptionsResponse) {
        ArrayList arrayList = new ArrayList();
        for (GetChatterDescriptionsResponse.Pair pair : getChatterDescriptionsResponse.pairs) {
            if (!TextUtils.isEmpty(pair.description) || pair.description_type != Chatter.Description.Type.ON_DEFAULT) {
                arrayList.add(new ChatterDescription(pair.description, ChatterDescription.Type.valueOf(pair.description_type.getValue())));
                Log.m165379d("UserStatus", pair.description);
            }
        }
        return new ChatterDescriptionResponse.ChatterDescriptionsResponse(arrayList, getChatterDescriptionsResponse.has_more.booleanValue());
    }
}
