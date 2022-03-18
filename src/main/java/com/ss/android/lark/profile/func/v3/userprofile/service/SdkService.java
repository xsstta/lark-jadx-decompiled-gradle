package com.ss.android.lark.profile.func.v3.userprofile.service;

import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.contact.v1.UpdateFocusChatterRequest;
import com.bytedance.lark.pb.contact.v1.UpdateFocusChatterResponse;
import com.bytedance.lark.pb.contact.v2.GetUserProfileRequest;
import com.bytedance.lark.pb.contact.v2.GetUserProfileResponse;
import com.bytedance.lark.pb.contact.v2.PatchSelfUserProfileRequest;
import com.bytedance.lark.pb.contact.v2.PatchSelfUserProfileResponse;
import com.larksuite.rucket.impl.sdkimpl.annotation.SdkCall;
import com.larksuite.rucket.job.RucketJob;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H'J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00032\u0006\u0010\u0005\u001a\u00020\tH'J\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00032\u0006\u0010\u0005\u001a\u00020\fH'¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/profile/func/v3/userprofile/service/SdkService;", "", "getUserProfile", "Lcom/larksuite/rucket/job/RucketJob;", "Lcom/bytedance/lark/pb/contact/v2/GetUserProfileResponse;", "request", "Lcom/bytedance/lark/pb/contact/v2/GetUserProfileRequest;", "updateFocusChatter", "Lcom/bytedance/lark/pb/contact/v1/UpdateFocusChatterResponse;", "Lcom/bytedance/lark/pb/contact/v1/UpdateFocusChatterRequest;", "uploadProfileCoverKey", "Lcom/bytedance/lark/pb/contact/v2/PatchSelfUserProfileResponse;", "Lcom/bytedance/lark/pb/contact/v2/PatchSelfUserProfileRequest;", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.profile.func.v3.userprofile.b.a */
public interface SdkService {
    @SdkCall(Command.UPDATE_FOCUS_CHATTER)
    /* renamed from: a */
    RucketJob<UpdateFocusChatterResponse> mo180101a(UpdateFocusChatterRequest updateFocusChatterRequest);

    @SdkCall(Command.GET_USER_PROFILE_V2)
    /* renamed from: a */
    RucketJob<GetUserProfileResponse> mo180102a(GetUserProfileRequest getUserProfileRequest);

    @SdkCall(Command.PATCH_SELF_USER_PROFILE)
    /* renamed from: a */
    RucketJob<PatchSelfUserProfileResponse> mo180103a(PatchSelfUserProfileRequest patchSelfUserProfileRequest);
}
