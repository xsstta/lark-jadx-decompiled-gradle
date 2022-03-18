package com.ss.android.lark.profile.service;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.bytedance.lark.pb.basic.v1.Chatter;
import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.contact.v1.DeleteChatterDescriptionRequest;
import com.bytedance.lark.pb.contact.v1.DeleteChatterDescriptionResponse;
import com.bytedance.lark.pb.contact.v1.GetChatterDescriptionsRequest;
import com.bytedance.lark.pb.contact.v1.GetChatterDescriptionsResponse;
import com.bytedance.lark.pb.contact.v1.GetUserProfileRequest;
import com.bytedance.lark.pb.contact.v1.GetUserProfileResponse;
import com.bytedance.lark.pb.contact.v1.UpdateChatterRequest;
import com.bytedance.lark.pb.contact.v1.UpdateChatterResponse;
import com.bytedance.lark.pb.contact.v2.GetUserProfileResponse;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.biz.core.api.ProfileResponse;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.profile.C52239a;
import com.ss.android.lark.profile.dto.ChatterDescriptionResponse;
import com.ss.android.lark.profile.entity.C52260a;
import com.ss.android.lark.profile.entity.ChatterDescription;
import com.ss.android.lark.profile.entity.Profile;
import com.ss.android.lark.profile.func.user_profile.infos.Profile2DepartmentDataParser;
import com.ss.android.lark.profile.v2.entity.BaseField;
import com.ss.android.lark.profile.v2.service.ModelParser;
import com.ss.android.lark.sdk.SdkSender;
import com.ss.android.lark.util.share_preference.C57744a;
import com.ss.android.lark.utils.rxjava.C57865c;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.lark.profile.service.d */
public class C52893d implements AbstractC52891b {

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.profile.service.d$a */
    public static class C52903a {

        /* renamed from: a */
        static C52893d f130716a = new C52893d();
    }

    /* renamed from: b */
    public static C52893d m204612b() {
        return C52903a.f130716a;
    }

    /* renamed from: a */
    public void mo180511a(String str, Profile profile) {
        if (str.equals(C52239a.m202617d().mo133587q().mo133622a()) && profile != null && profile.isValid()) {
            mo180513b(profile);
        }
    }

    @Override // com.ss.android.lark.profile.service.AbstractC52890a
    /* renamed from: a */
    public void mo180508a(final String str, final IGetDataCallback<ProfileResponse> iGetDataCallback) {
        C57865c.m224574a(new C57865c.AbstractC57873d<Profile>() {
            /* class com.ss.android.lark.profile.service.C52893d.C528941 */

            /* renamed from: a */
            public Profile produce() {
                return C52893d.this.mo180510a(str);
            }
        }, new C57865c.AbstractC57871b<Profile>() {
            /* class com.ss.android.lark.profile.service.C52893d.C528963 */

            /* renamed from: a */
            public void consume(Profile profile) {
                if (profile != null && profile.isValid() && profile.hasDepartment() && profile.hasEmail()) {
                    C52893d.this.mo180511a(profile.getId(), profile);
                    ProfileResponse profileResponse = new ProfileResponse();
                    profileResponse.profile = profile;
                    profileResponse.statusCode = profile.getDescription().type.getNumber();
                    IGetDataCallback iGetDataCallback = iGetDataCallback;
                    if (iGetDataCallback != null) {
                        iGetDataCallback.onSuccess(profileResponse);
                    }
                }
                C52893d.this.mo180509b(str, iGetDataCallback);
            }
        });
    }

    /* renamed from: a */
    public void mo180512a(String str, String str2, IGetDataCallback<ProfileResponse> iGetDataCallback) {
        GetUserProfileRequest.C16280a aVar = new GetUserProfileRequest.C16280a();
        if (!TextUtils.isEmpty(str)) {
            aVar.mo58277a(str);
        }
        if (!TextUtils.isEmpty(str2)) {
            aVar.mo58280b(str2);
        }
        SdkSender.asynSendRequestNonWrap(Command.GET_USER_PROFILE, aVar, iGetDataCallback, new SdkSender.IParser<ProfileResponse>() {
            /* class com.ss.android.lark.profile.service.C52893d.C529029 */

            /* renamed from: a */
            public ProfileResponse parse(byte[] bArr) throws IOException {
                return C52893d.m204610a(C52260a.m202784a(GetUserProfileResponse.ADAPTER.decode(bArr), C52239a.m202617d().mo133587q().mo133624c()));
            }
        });
    }

    /* renamed from: c */
    private Profile m204614c() {
        GetUserProfileRequest.C16280a aVar = new GetUserProfileRequest.C16280a();
        String a = C52239a.m202617d().mo133587q().mo133622a();
        if (!TextUtils.isEmpty(a)) {
            aVar.mo58277a(a);
        }
        Profile a2 = m204611a(aVar);
        if (a2 != null) {
            return a2;
        }
        return (Profile) SdkSender.sendRequest(Command.GET_USER_PROFILE, aVar, new SdkSender.IParser<Profile>() {
            /* class com.ss.android.lark.profile.service.C52893d.AnonymousClass10 */

            /* renamed from: a */
            public Profile parse(byte[] bArr) throws IOException {
                return C52260a.m202784a(GetUserProfileResponse.ADAPTER.decode(bArr), C52239a.m202617d().mo133587q().mo133624c());
            }
        });
    }

    @Override // com.ss.android.lark.profile.service.AbstractC52890a
    /* renamed from: a */
    public Profile mo180502a() {
        String string = C57744a.m224104a().getString("key_profile");
        if (!TextUtils.isEmpty(string)) {
            return (Profile) JSONObject.parseObject(string, Profile.class);
        }
        Profile c = m204614c();
        mo180513b(c);
        return c;
    }

    @Override // com.ss.android.lark.profile.service.AbstractC52890a
    /* renamed from: a */
    public String mo180503a(BaseField baseField) {
        return Profile2DepartmentDataParser.f130315a.mo179912a(baseField);
    }

    /* renamed from: a */
    private Profile m204611a(GetUserProfileRequest.C16280a aVar) {
        return SdkSender.syncSendMayError(Command.GET_USER_PROFILE, aVar, new SdkSender.IParser<Profile>() {
            /* class com.ss.android.lark.profile.service.C52893d.C528952 */

            /* renamed from: a */
            public Profile parse(byte[] bArr) throws IOException {
                return C52260a.m202784a(GetUserProfileResponse.ADAPTER.decode(bArr), C52239a.m202617d().mo133587q().mo133624c());
            }
        }).f131572a;
    }

    /* renamed from: a */
    public static ProfileResponse m204610a(Profile profile) {
        Profile profile2;
        ProfileResponse profileResponse = new ProfileResponse();
        if (profile != null) {
            if (profile.isValid()) {
                profile2 = profile;
            } else {
                profile2 = null;
            }
            profileResponse.profile = profile2;
            profileResponse.statusCode = profile.getDescription().type.getNumber();
        }
        return profileResponse;
    }

    /* renamed from: b */
    public void mo180513b(Profile profile) {
        String str;
        if (profile != null) {
            str = JSONObject.toJSONString(profile);
        } else {
            str = "";
        }
        C57744a.m224104a().putString("key_profile", str);
    }

    /* renamed from: a */
    public Profile mo180510a(String str) {
        GetUserProfileRequest.C16280a aVar = new GetUserProfileRequest.C16280a();
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        aVar.mo58277a(str);
        SdkSender.C53233d syncSendMayError = SdkSender.syncSendMayError(Command.GET_USER_PROFILE, aVar, new SdkSender.IParser<Profile>() {
            /* class com.ss.android.lark.profile.service.C52893d.C528974 */

            /* renamed from: a */
            public Profile parse(byte[] bArr) throws IOException {
                return C52260a.m202784a(GetUserProfileResponse.ADAPTER.decode(bArr), C52239a.m202617d().mo133587q().mo133624c());
            }
        });
        if (syncSendMayError.f131573b == null) {
            return syncSendMayError.f131572a;
        }
        Log.m165382e("get profile failed: " + syncSendMayError.f131573b);
        return null;
    }

    @Override // com.ss.android.lark.profile.service.AbstractC52890a
    /* renamed from: a */
    public ArrayList<BaseField> mo180504a(List<GetUserProfileResponse.Field> list) {
        return ModelParser.f130758a.mo180742a(list);
    }

    @Override // com.ss.android.lark.profile.service.AbstractC52890a
    /* renamed from: b */
    public void mo180509b(String str, IGetDataCallback<ProfileResponse> iGetDataCallback) {
        m204613b(str, "", iGetDataCallback);
    }

    @Override // com.ss.android.lark.profile.service.AbstractC52890a
    /* renamed from: a */
    public void mo180506a(ChatterDescription chatterDescription, IGetDataCallback<Boolean> iGetDataCallback) {
        SdkSender.asynSendRequestNonWrap(Command.DELETE_CHATTER_DESCRIPTION, new DeleteChatterDescriptionRequest.C16156a().mo57977a(new Chatter.Description.C14819a().mo54405a(chatterDescription.description).mo54404a(Chatter.Description.Type.fromValue(chatterDescription.type.getNumber())).build()), iGetDataCallback, new SdkSender.IParser<Boolean>() {
            /* class com.ss.android.lark.profile.service.C52893d.C529018 */

            /* renamed from: a */
            public Boolean parse(byte[] bArr) throws IOException {
                try {
                    C52892c.m204609a(DeleteChatterDescriptionResponse.ADAPTER.decode(bArr));
                    return true;
                } catch (Exception e) {
                    Log.m165382e(e.getMessage());
                    throw new RuntimeException("delete User Status fail");
                }
            }
        });
    }

    /* renamed from: b */
    private void m204613b(final String str, String str2, final IGetDataCallback<ProfileResponse> iGetDataCallback) {
        mo180512a(str, str2, new IGetDataCallback<ProfileResponse>() {
            /* class com.ss.android.lark.profile.service.C52893d.C528985 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onError(errorResult);
                }
            }

            /* renamed from: a */
            public void onSuccess(ProfileResponse profileResponse) {
                if (profileResponse != null) {
                    C52893d.this.mo180511a(str, profileResponse.profile);
                    IGetDataCallback iGetDataCallback = iGetDataCallback;
                    if (iGetDataCallback != null) {
                        iGetDataCallback.onSuccess(profileResponse);
                    }
                }
            }
        });
    }

    @Override // com.ss.android.lark.profile.service.AbstractC52890a
    /* renamed from: a */
    public void mo180505a(int i, int i2, IGetDataCallback<ChatterDescriptionResponse.ChatterDescriptionsResponse> iGetDataCallback) {
        SdkSender.asynSendRequestNonWrap(Command.GET_CHATTER_DESCRIPTIONS, new GetChatterDescriptionsRequest.C16188a().mo58053a(Integer.valueOf(i2)).mo58055b(Integer.valueOf(i)), iGetDataCallback, new SdkSender.IParser<ChatterDescriptionResponse.ChatterDescriptionsResponse>() {
            /* class com.ss.android.lark.profile.service.C52893d.C529007 */

            /* renamed from: a */
            public ChatterDescriptionResponse.ChatterDescriptionsResponse parse(byte[] bArr) throws IOException {
                try {
                    return C52892c.m204608a(GetChatterDescriptionsResponse.ADAPTER.decode(bArr));
                } catch (Exception e) {
                    Log.m165382e(e.getMessage());
                    throw new RuntimeException("fetch User History Status fail");
                }
            }
        });
    }

    @Override // com.ss.android.lark.profile.service.AbstractC52890a
    /* renamed from: a */
    public void mo180507a(String str, int i, IGetDataCallback<String> iGetDataCallback) {
        SdkSender.asynSendRequestNonWrap(Command.UPDATE_CHATTER, new UpdateChatterRequest.C16406a().mo58566a(str).mo58565a(Chatter.Description.Type.fromValue(i)), iGetDataCallback, new SdkSender.IParser<String>() {
            /* class com.ss.android.lark.profile.service.C52893d.C528996 */

            /* renamed from: a */
            public String parse(byte[] bArr) throws IOException {
                try {
                    return UpdateChatterResponse.ADAPTER.decode(bArr).message;
                } catch (Exception e) {
                    Log.m165382e(e.getMessage());
                    throw new RuntimeException("update User Status fail");
                }
            }
        });
    }
}
