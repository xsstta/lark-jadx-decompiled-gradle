package com.ss.android.lark.invitation.v2;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.i18n.claymore.ClaymoreImpl;
import com.bytedance.lark.pb.basic.v1.ChatApplication;
import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.contact.v1.GetDepartmentInactiveInfoRequest;
import com.bytedance.lark.pb.contact.v1.GetDepartmentInactiveInfoResponse;
import com.bytedance.lark.pb.contact.v1.GetDepartmentInvitationUrlRequest;
import com.bytedance.lark.pb.contact.v1.GetDepartmentInvitationUrlResponse;
import com.bytedance.lark.pb.contact.v1.GetInvitationLinkRequest;
import com.bytedance.lark.pb.contact.v1.GetInvitationLinkResponse;
import com.bytedance.lark.pb.contact.v1.GetUserInvitationMessageRequest;
import com.bytedance.lark.pb.contact.v1.GetUserInvitationMessageResponse;
import com.bytedance.lark.pb.contact.v1.GetUserProfileRequest;
import com.bytedance.lark.pb.contact.v1.GetUserProfileResponse;
import com.bytedance.lark.pb.contact.v1.InvitationPlatformType;
import com.bytedance.lark.pb.contact.v1.InviteInfo;
import com.bytedance.lark.pb.contact.v1.SearchUserByContactPointRequest;
import com.bytedance.lark.pb.contact.v1.SearchUserByContactPointResponse;
import com.bytedance.lark.pb.contact.v1.SendUserInvitationRequest;
import com.bytedance.lark.pb.contact.v1.SendUserInvitationResponse;
import com.bytedance.lark.pb.contact.v1.SetAdminInvitationRequest;
import com.bytedance.lark.pb.contact.v1.SetAdminInvitationResponse;
import com.bytedance.lark.pb.contact.v1.SetBannerBeginTimeRequest;
import com.bytedance.lark.pb.feed.v1.GetActivityBannerRequest;
import com.bytedance.lark.pb.feed.v1.GetActivityBannerResponse;
import com.bytedance.lark.pb.im.v1.ProcessChatApplicationRequest;
import com.bytedance.lark.pb.im.v2.GetContactTokenRequest;
import com.bytedance.lark.pb.im.v2.GetContactTokenResponse;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.squareup.wire.ProtoAdapter;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.inv.export.api.InvitationServiceApi;
import com.ss.android.lark.inv.export.util.C40108g;
import com.ss.android.lark.inv.export.util.C40147z;
import com.ss.android.lark.inv.export.util.InvApmUtils;
import com.ss.android.lark.inv.export.util.InvAppreciableUtils;
import com.ss.android.lark.invitation.v2.InvitationServiceApiImpl;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.pb.collaboration.PullCollaborationInviteQrCodeRequest;
import com.ss.android.lark.pb.collaboration.PullCollaborationInviteQrCodeResponse;
import com.ss.android.lark.pb.flow.TrySetUGEventStateRequest;
import com.ss.android.lark.pb.users.CheckContactIsLinkedToUserRequest;
import com.ss.android.lark.profile.entity.C52260a;
import com.ss.android.lark.sdk.SdkSender;
import com.ss.android.lark.util.share_preference.UserSP;
import com.ss.android.lark.utils.C57768af;
import com.ss.android.lark.utils.rxjava.C57865c;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@ClaymoreImpl(InvitationServiceApi.class)
public class InvitationServiceApiImpl implements InvitationServiceApi {
    static /* synthetic */ Object lambda$setBannerBeginTimeRequest$3(byte[] bArr) throws IOException {
        return null;
    }

    private void setBannerBeginTimeRequest() {
        SdkSender.asynSendRequestNonWrap(Command.SET_BANNER_BEGIN_TIME, new SetBannerBeginTimeRequest.C16384a(), new IGetDataCallback<Object>() {
            /* class com.ss.android.lark.invitation.v2.InvitationServiceApiImpl.C401512 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Log.m165384e("InvitationModule", "set banner begin time onError:" + errorResult, (Throwable) null);
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback, com.larksuite.framework.callback.IRequestCallback
            public void onSuccess(Object obj) {
                Log.m165380d("InvitationModule", "set banner begin time success", null);
                UserSP.getInstance().putBoolean("isSetBannerBeginTime", true);
            }
        }, $$Lambda$InvitationServiceApiImpl$s2jsUh8464uMVNBmqo6GFXqzUEk.INSTANCE);
    }

    @Override // com.ss.android.lark.inv.export.api.InvitationServiceApi
    public boolean hasInviteMemberPermission() {
        C57768af.C57772b bVar = new C57768af.C57772b();
        checkInviteMemberPermission(new C57865c.AbstractC57871b() {
            /* class com.ss.android.lark.invitation.v2.$$Lambda$hkOu9h2786VeXrWeIfUY2uv06qc */

            @Override // com.ss.android.lark.utils.rxjava.C57865c.AbstractC57871b
            public final void consume(Object obj) {
                C57768af.C57772b.this.mo196072a((Boolean) obj);
            }
        });
        return ((Boolean) bVar.mo196071a()).booleanValue();
    }

    @Override // com.ss.android.lark.inv.export.api.InvitationServiceApi
    public boolean isAdmin() {
        final C57768af.C57772b bVar = new C57768af.C57772b();
        isAdmin(new IGetDataCallback<Boolean>() {
            /* class com.ss.android.lark.invitation.v2.InvitationServiceApiImpl.C401534 */

            /* renamed from: a */
            public void onSuccess(Boolean bool) {
                bVar.mo196072a(bool);
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Log.m165383e("InvitationModule", errorResult.getDebugMsg());
                bVar.mo196072a(false);
                InvAppreciableUtils.f101934a.mo145658b(errorResult);
            }
        });
        return ((Boolean) bVar.mo196071a()).booleanValue();
    }

    private SdkSender.IParser<InvitationServiceApi.C40084c> getParser(boolean z) {
        return new SdkSender.IParser(z) {
            /* class com.ss.android.lark.invitation.v2.$$Lambda$InvitationServiceApiImpl$_mcBPjfXil7CrePGM37tXce8o */
            public final /* synthetic */ boolean f$1;

            {
                this.f$1 = r2;
            }

            @Override // com.ss.android.lark.sdk.SdkSender.IParser
            public final Object parse(byte[] bArr) {
                return InvitationServiceApiImpl.this.lambda$getParser$0$InvitationServiceApiImpl(this.f$1, bArr);
            }
        };
    }

    static /* synthetic */ Boolean lambda$agreeFriendRequest$6(byte[] bArr) throws IOException {
        return true;
    }

    @Override // com.ss.android.lark.inv.export.api.InvitationServiceApi
    public void checkInviteMemberPermission(final C57865c.AbstractC57871b<Boolean> bVar) {
        isAdmin(null);
        pullInvitePermission(new IGetDataCallback<InvitationServiceApi.InvitePermissionResult>() {
            /* class com.ss.android.lark.invitation.v2.InvitationServiceApiImpl.C401523 */

            /* access modifiers changed from: private */
            /* renamed from: a */
            public static /* synthetic */ void m159171a(C57865c.AbstractC57871b bVar) {
                bVar.consume(false);
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Log.m165383e("InvitationModule", errorResult.getDebugMsg());
                C57865c.AbstractC57871b bVar = bVar;
                if (bVar != null) {
                    UICallbackExecutor.execute(new Runnable() {
                        /* class com.ss.android.lark.invitation.v2.$$Lambda$InvitationServiceApiImpl$3$yCgFtG268sxOA2ieoB3zS0Gs4 */

                        public final void run() {
                            InvitationServiceApiImpl.C401523.m159171a(C57865c.AbstractC57871b.this);
                        }
                    });
                }
            }

            /* renamed from: a */
            public void onSuccess(InvitationServiceApi.InvitePermissionResult invitePermissionResult) {
                C57865c.AbstractC57871b bVar = bVar;
                if (bVar != null) {
                    UICallbackExecutor.execute(new Runnable(invitePermissionResult) {
                        /* class com.ss.android.lark.invitation.v2.$$Lambda$InvitationServiceApiImpl$3$XGY7AbuTNEKzJ6xi7xd1YVc5wk */
                        public final /* synthetic */ InvitationServiceApi.InvitePermissionResult f$1;

                        {
                            this.f$1 = r2;
                        }

                        public final void run() {
                            InvitationServiceApiImpl.C401523.m159172a(C57865c.AbstractC57871b.this, this.f$1);
                        }
                    });
                }
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public static /* synthetic */ void m159172a(C57865c.AbstractC57871b bVar, InvitationServiceApi.InvitePermissionResult invitePermissionResult) {
                bVar.consume(Boolean.valueOf(invitePermissionResult.enableShow));
            }
        });
    }

    @Override // com.ss.android.lark.inv.export.api.InvitationServiceApi
    public void getContactTokenV2(IGetDataCallback<GetContactTokenResponse> iGetDataCallback) {
        Command command = Command.GET_CONTACT_TOKEN_V2;
        GetContactTokenRequest.C18178a aVar = new GetContactTokenRequest.C18178a();
        InvApmUtils.GetDataCallback bVar = new InvApmUtils.GetDataCallback(iGetDataCallback, "ug_invite_external_nondirectional_get_invite_info");
        ProtoAdapter<GetContactTokenResponse> protoAdapter = GetContactTokenResponse.ADAPTER;
        protoAdapter.getClass();
        SdkSender.asynSendRequestNonWrap(command, aVar, bVar, new SdkSender.IParser() {
            /* class com.ss.android.lark.invitation.v2.$$Lambda$VzO7r2Ym2ki3ixwuXd4nwZSJlc */

            @Override // com.ss.android.lark.sdk.SdkSender.IParser
            public final Object parse(byte[] bArr) {
                return (GetContactTokenResponse) ProtoAdapter.this.decode(bArr);
            }
        });
    }

    @Override // com.ss.android.lark.inv.export.api.InvitationServiceApi
    public void pullInviteActivityBanner(IGetDataCallback<InvitationServiceApi.InviteActivityBannerResult> iGetDataCallback) {
        pullInvitePermission(null);
        isAdmin(null);
        SdkSender.asynSendRequestNonWrap(Command.GET_ACTIVITY_BANNER, new GetActivityBannerRequest.C17140a(), iGetDataCallback, $$Lambda$InvitationServiceApiImpl$ka4wGdKF0Cu_mzNjRy5C8l8BvZQ.INSTANCE);
    }

    @Override // com.ss.android.lark.inv.export.api.InvitationServiceApi
    public void shouldGuideExternal(IGetDataCallback<Boolean> iGetDataCallback) {
        TrySetUGEventStateRequest.C49766a aVar = new TrySetUGEventStateRequest.C49766a();
        aVar.f124652a = "guide_add_contact";
        aVar.f124653b = "1";
        SdkSender.sendPassThroughRequest(com.ss.android.lark.pb.improto.Command.TRY_SET_UG_EVENT_STATE, aVar, new InvApmUtils.GetDataCallback(iGetDataCallback, "ug_invite_external_guide"), $$Lambda$InvitationServiceApiImpl$2eeMisCavw65qcfL5SCJAFHvSJ4.INSTANCE);
    }

    private static List<Long> getDepartmentsFromString(String str) {
        ArrayList arrayList = new ArrayList();
        if (TextUtils.isEmpty(str)) {
            return arrayList;
        }
        String[] split = str.split(",");
        if (split.length == 0) {
            return arrayList;
        }
        for (String str2 : split) {
            try {
                arrayList.add(Long.valueOf(Long.parseLong(str2)));
            } catch (Exception unused) {
            }
        }
        return arrayList;
    }

    static /* synthetic */ Boolean lambda$isAdmin$5(byte[] bArr) throws IOException {
        boolean isAdmin = C52260a.m202784a(GetUserProfileResponse.ADAPTER.decode(bArr), C40147z.m159160a().getLoginDependency().mo145590f()).getIsAdmin();
        UserSP.getInstance().putBoolean("user_sp_is_admin", isAdmin);
        return Boolean.valueOf(isAdmin);
    }

    private void pullInvitePermission(IGetDataCallback<InvitationServiceApi.InvitePermissionResult> iGetDataCallback) {
        if (C40147z.m159160a().isFgEnable("invite.member.enable")) {
            GetUserInvitationMessageRequest.C16276a aVar = new GetUserInvitationMessageRequest.C16276a();
            aVar.f42472a = InvitationPlatformType.PlatformAndroid;
            SdkSender.asynSendRequestNonWrap(Command.GET_USER_INVITATION_MESSAGE, aVar, iGetDataCallback, $$Lambda$InvitationServiceApiImpl$9vJc7zis_guoUVOD3LZmlofulc.INSTANCE);
        } else if (iGetDataCallback != null) {
            iGetDataCallback.onSuccess(new InvitationServiceApi.InvitePermissionResult());
        }
    }

    @Override // com.ss.android.lark.inv.export.api.InvitationServiceApi
    public void isAdmin(IGetDataCallback<Boolean> iGetDataCallback) {
        GetUserProfileRequest.C16280a aVar = new GetUserProfileRequest.C16280a();
        String a = C40147z.m159160a().getLoginDependency().mo145582a();
        if (!TextUtils.isEmpty(a)) {
            aVar.mo58277a(a);
        }
        SdkSender.asynSendRequestNonWrap(Command.GET_USER_PROFILE, aVar, iGetDataCallback, $$Lambda$InvitationServiceApiImpl$j4wx07WcAK_pM0cIywcULu5lOA.INSTANCE);
    }

    @Override // com.ss.android.lark.inv.export.api.InvitationServiceApi
    public void pullInvitePermission4Banner(IGetDataCallback<InvitationServiceApi.InvitePermissionResult> iGetDataCallback) {
        if (C40147z.m159160a().isFgEnable("invite.member.enable")) {
            Log.m165389i("InvitationModule", "pullInvitePermission4Banner");
            GetUserInvitationMessageRequest.C16276a aVar = new GetUserInvitationMessageRequest.C16276a();
            aVar.f42472a = InvitationPlatformType.PlatformAndroid;
            SdkSender.asynSendRequestNonWrap(Command.GET_USER_INVITATION_MESSAGE, aVar, iGetDataCallback, new SdkSender.IParser() {
                /* class com.ss.android.lark.invitation.v2.$$Lambda$InvitationServiceApiImpl$NIdjohqg0SCLDVi6gdY2NBVfwTc */

                @Override // com.ss.android.lark.sdk.SdkSender.IParser
                public final Object parse(byte[] bArr) {
                    return InvitationServiceApiImpl.this.lambda$pullInvitePermission4Banner$1$InvitationServiceApiImpl(bArr);
                }
            });
        } else if (iGetDataCallback != null) {
            iGetDataCallback.onSuccess(new InvitationServiceApi.InvitePermissionResult());
        }
    }

    static /* synthetic */ InvitationServiceApi.InviteActivityBannerResult lambda$pullInviteActivityBanner$2(byte[] bArr) throws IOException {
        GetActivityBannerResponse decode = GetActivityBannerResponse.ADAPTER.decode(bArr);
        if (decode == null || !decode.activity_summary.booleanValue() || TextUtils.isEmpty(decode.activity_summary_url)) {
            return null;
        }
        Log.m165389i("InvitationModule", "pullInviteActivityBanner " + decode.activity_summary + " " + TextUtils.isEmpty(decode.activity_summary_url));
        return new InvitationServiceApi.InviteActivityBannerResult(decode.activity_summary.booleanValue(), Uri.parse(decode.activity_summary_url).buildUpon().appendQueryParameter("op_platform_service", "hide_image_copy_link").toString());
    }

    static /* synthetic */ InvitationServiceApi.InvitePermissionResult lambda$pullInvitePermission$4(byte[] bArr) throws IOException {
        boolean z;
        GetUserInvitationMessageResponse decode = GetUserInvitationMessageResponse.ADAPTER.decode(bArr);
        UserSP.getInstance().putBoolean("invite_member_permission", decode.enable_show.booleanValue());
        boolean booleanValue = decode.enable_show.booleanValue();
        boolean z2 = true;
        if (decode.banner_status.getValue() == GetUserInvitationMessageResponse.BannerStatus.ClosedBanner.getValue()) {
            z = true;
        } else {
            z = false;
        }
        if (decode.banner_status.getValue() != GetUserInvitationMessageResponse.BannerStatus.CanClosedBanner.getValue()) {
            z2 = false;
        }
        InvitationServiceApi.InvitePermissionResult invitePermissionResult = new InvitationServiceApi.InvitePermissionResult(booleanValue, z, z2);
        Log.m165389i("InvitationModule", invitePermissionResult.toString());
        return invitePermissionResult;
    }

    public /* synthetic */ InvitationServiceApi.InvitePermissionResult lambda$pullInvitePermission4Banner$1$InvitationServiceApiImpl(byte[] bArr) throws IOException {
        boolean z;
        GetUserInvitationMessageResponse decode = GetUserInvitationMessageResponse.ADAPTER.decode(bArr);
        boolean z2 = true;
        if (decode.banner_status.getValue() == GetUserInvitationMessageResponse.BannerStatus.ClosedBanner.getValue()) {
            z = true;
        } else {
            z = false;
        }
        if (decode.banner_status.getValue() != GetUserInvitationMessageResponse.BannerStatus.CanClosedBanner.getValue()) {
            z2 = false;
        }
        if (!UserSP.getInstance().contains("isSetBannerBeginTime") && decode.enable_show.booleanValue() && !z) {
            setBannerBeginTimeRequest();
        }
        UserSP.getInstance().putBoolean("invite_member_permission", decode.enable_show.booleanValue());
        return new InvitationServiceApi.InvitePermissionResult(decode.enable_show.booleanValue(), z, z2);
    }

    @Override // com.ss.android.lark.inv.export.api.InvitationServiceApi
    public void getInviteNewMemberUrl(String str, IGetDataCallback<GetInvitationLinkResponse> iGetDataCallback) {
        getInviteNewMemberUrl(false, str, iGetDataCallback);
    }

    @Override // com.ss.android.lark.inv.export.api.InvitationServiceApi
    public void agreeFriendRequest(String str, IGetDataCallback<Boolean> iGetDataCallback) {
        SdkSender.asynSendRequestNonWrap(Command.PROCESS_CHAT_APPLICATION, new ProcessChatApplicationRequest.C17851a().mo62213b(str).mo62209a(ChatApplication.Status.AGREED), iGetDataCallback, $$Lambda$InvitationServiceApiImpl$cCii1BALucA2p2wRcOCSMeNCVlQ.INSTANCE);
    }

    @Override // com.ss.android.lark.inv.export.api.InvitationServiceApi
    public void getDepartmentInactiveInfo(GetDepartmentInactiveInfoRequest.C16228a aVar, IGetDataCallback<GetDepartmentInactiveInfoResponse> iGetDataCallback) {
        Command command = Command.GET_DEPARTMENT_INACTIVE_INFO;
        InvApmUtils.GetDataCallback bVar = new InvApmUtils.GetDataCallback(iGetDataCallback, "ug_invite_parent_nondirectional_get_inactive_info");
        ProtoAdapter<GetDepartmentInactiveInfoResponse> protoAdapter = GetDepartmentInactiveInfoResponse.ADAPTER;
        protoAdapter.getClass();
        SdkSender.asynSendRequestNonWrap(command, aVar, bVar, new SdkSender.IParser() {
            /* class com.ss.android.lark.invitation.v2.$$Lambda$WSmQ43Ca93iaDGiRLPlQXBe0Mo */

            @Override // com.ss.android.lark.sdk.SdkSender.IParser
            public final Object parse(byte[] bArr) {
                return (GetDepartmentInactiveInfoResponse) ProtoAdapter.this.decode(bArr);
            }
        });
    }

    @Override // com.ss.android.lark.inv.export.api.InvitationServiceApi
    public void getDepartmentInvitationInfo(GetDepartmentInvitationUrlRequest.C16232a aVar, IGetDataCallback<GetDepartmentInvitationUrlResponse> iGetDataCallback) {
        Command command = Command.GET_DEPARTMENT_INVITATION_URL;
        InvApmUtils.GetDataCallback bVar = new InvApmUtils.GetDataCallback(iGetDataCallback, "ug_invite_parent_nondirectional_get_invite_info");
        ProtoAdapter<GetDepartmentInvitationUrlResponse> protoAdapter = GetDepartmentInvitationUrlResponse.ADAPTER;
        protoAdapter.getClass();
        SdkSender.asynSendRequestNonWrap(command, aVar, bVar, new SdkSender.IParser() {
            /* class com.ss.android.lark.invitation.v2.$$Lambda$G9v4rCDbLX1PfD4Utilb9YmXnms */

            @Override // com.ss.android.lark.sdk.SdkSender.IParser
            public final Object parse(byte[] bArr) {
                return (GetDepartmentInvitationUrlResponse) ProtoAdapter.this.decode(bArr);
            }
        });
    }

    @Override // com.ss.android.lark.inv.export.api.InvitationServiceApi
    public void search(String str, IGetDataCallback<SearchUserByContactPointResponse> iGetDataCallback) {
        Command command = Command.SEARCH_USER_BY_CONTACT_POINT;
        SearchUserByContactPointRequest.C16364a a = new SearchUserByContactPointRequest.C16364a().mo58461a(str);
        InvApmUtils.GetDataCallback bVar = new InvApmUtils.GetDataCallback(iGetDataCallback, "ug_invite_external_orientation_search");
        ProtoAdapter<SearchUserByContactPointResponse> protoAdapter = SearchUserByContactPointResponse.ADAPTER;
        protoAdapter.getClass();
        SdkSender.asynSendRequestNonWrap(command, a, bVar, new SdkSender.IParser() {
            /* class com.ss.android.lark.invitation.v2.$$Lambda$0266hJEgVEnHjkR_AWefcpxoHE8 */

            @Override // com.ss.android.lark.sdk.SdkSender.IParser
            public final Object parse(byte[] bArr) {
                return (SearchUserByContactPointResponse) ProtoAdapter.this.decode(bArr);
            }
        });
    }

    @Override // com.ss.android.lark.inv.export.api.InvitationServiceApi
    public void getCollaborationInviteQrcode(boolean z, IGetDataCallback<PullCollaborationInviteQrCodeResponse> iGetDataCallback) {
        PullCollaborationInviteQrCodeRequest.C49604a aVar = new PullCollaborationInviteQrCodeRequest.C49604a();
        aVar.mo172938a(Boolean.valueOf(z));
        com.ss.android.lark.pb.improto.Command command = com.ss.android.lark.pb.improto.Command.PULL_COLLABORATION_INVITE_QRCODE;
        InvApmUtils.GetDataCallback bVar = new InvApmUtils.GetDataCallback(iGetDataCallback, "ug_collaboration_invite_qrcode");
        ProtoAdapter<PullCollaborationInviteQrCodeResponse> protoAdapter = PullCollaborationInviteQrCodeResponse.ADAPTER;
        protoAdapter.getClass();
        SdkSender.sendPassThroughRequest(command, aVar, bVar, new SdkSender.IParser() {
            /* class com.ss.android.lark.invitation.v2.$$Lambda$5Ghr1dtUO8X7L5tBUYa1ruwss44 */

            @Override // com.ss.android.lark.sdk.SdkSender.IParser
            public final Object parse(byte[] bArr) {
                return (PullCollaborationInviteQrCodeResponse) ProtoAdapter.this.decode(bArr);
            }
        });
    }

    public /* synthetic */ InvitationServiceApi.C40084c lambda$getParser$0$InvitationServiceApiImpl(boolean z, byte[] bArr) throws IOException {
        Map<String, InviteInfo> map;
        SetAdminInvitationResponse decode = SetAdminInvitationResponse.ADAPTER.decode(bArr);
        InvitationServiceApi.C40084c cVar = new InvitationServiceApi.C40084c();
        if (z) {
            map = decode.email;
        } else {
            map = decode.mobile;
        }
        if (decode.success.booleanValue() || (map != null && !map.isEmpty())) {
            cVar.f101878c = decode.need_approval.booleanValue();
            if (map != null && !map.isEmpty()) {
                for (Map.Entry<String, InviteInfo> entry : map.entrySet()) {
                    InviteInfo value = entry.getValue();
                    Log.m165383e("InvitationModule", value.status_code + ": " + value.status_message);
                    InvitationServiceApi.C40082a aVar = new InvitationServiceApi.C40082a();
                    processError(z, value, aVar);
                    cVar.f101877b.put(entry.getKey(), aVar);
                }
            }
            return cVar;
        }
        cVar.f101876a = true;
        return cVar;
    }

    @Override // com.ss.android.lark.inv.export.api.InvitationServiceApi
    public void checkContactUsingApp(List<String> list, List<String> list2, IGetDataCallback<Map<String, Boolean>> iGetDataCallback) {
        CheckContactIsLinkedToUserRequest.C50256a aVar = new CheckContactIsLinkedToUserRequest.C50256a();
        aVar.mo174381b(list);
        aVar.mo174379a(list2);
        SdkSender.sendPassThroughRequest(com.ss.android.lark.pb.improto.Command.CHECK_CONTACT_IS_LINKED_TO_USER, aVar, new InvApmUtils.GetDataCallback(iGetDataCallback, "ug_contact_contact_is_linked_to_user"), $$Lambda$InvitationServiceApiImpl$iYgoU9OII_Hxcs6RLnv7zlMNM.INSTANCE);
    }

    @Override // com.ss.android.lark.inv.export.api.InvitationServiceApi
    public SdkSender.C53233d<InvitationServiceApi.C40084c> invite(InvitationServiceApi.C40083b bVar, boolean z, String str) {
        final C57768af.C57772b bVar2 = new C57768af.C57772b();
        final SdkSender.C53233d dVar = new SdkSender.C53233d();
        invite(bVar, z, str, new IGetDataCallback<InvitationServiceApi.C40084c>() {
            /* class com.ss.android.lark.invitation.v2.InvitationServiceApiImpl.C401501 */

            /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: com.ss.android.lark.inv.export.api.InvitationServiceApi$c */
            /* JADX WARN: Multi-variable type inference failed */
            /* renamed from: a */
            public void onSuccess(InvitationServiceApi.C40084c cVar) {
                dVar.f131572a = cVar;
                bVar2.mo196072a(dVar);
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                dVar.f131573b = errorResult;
                bVar2.mo196072a(dVar);
            }
        });
        return (SdkSender.C53233d) bVar2.mo196071a();
    }

    private void processError(boolean z, InviteInfo inviteInfo, InvitationServiceApi.C40082a aVar) {
        aVar.f101873c = inviteInfo.status_code.intValue();
        if (inviteInfo.status_code.intValue() == 20001502) {
            aVar.f101871a = InvitationServiceApi.InviteErrorType.FORMAT_EMAIL;
        } else if (inviteInfo.status_code.intValue() == 20001505) {
            aVar.f101871a = InvitationServiceApi.InviteErrorType.FORMAT_MOBILE;
        } else if (inviteInfo.status_code.intValue() == 20001506) {
            if (z) {
                aVar.f101871a = InvitationServiceApi.InviteErrorType.FORMAT_EMAIL;
            } else {
                aVar.f101871a = InvitationServiceApi.InviteErrorType.FORMAT_MOBILE;
            }
        } else if (inviteInfo.status_code.intValue() == 20001601 || inviteInfo.status_code.intValue() == 20001602) {
            aVar.f101871a = InvitationServiceApi.InviteErrorType.FORMAT_NAME;
        } else {
            aVar.f101871a = InvitationServiceApi.InviteErrorType.OTHERS;
        }
        aVar.f101872b = inviteInfo.status_message;
    }

    @Override // com.ss.android.lark.inv.export.api.InvitationServiceApi
    public void getInviteNewMemberUrl(boolean z, String str, IGetDataCallback<GetInvitationLinkResponse> iGetDataCallback) {
        GetInvitationLinkRequest.C16252a aVar = new GetInvitationLinkRequest.C16252a();
        aVar.f42449a = InvitationPlatformType.PlatformAndroid;
        aVar.f42450b = Boolean.valueOf(z);
        List<Long> departmentsFromString = getDepartmentsFromString(str);
        if (!departmentsFromString.isEmpty()) {
            aVar.mo58218a(departmentsFromString.get(0));
        }
        HashMap a = C40108g.m159014a(Pair.create("refresh", Boolean.valueOf(z)));
        Command command = Command.GET_INVITATION_LINK;
        InvApmUtils.GetDataCallback bVar = new InvApmUtils.GetDataCallback(iGetDataCallback, "ug_invite_member_nondirectional_get_invite_info", a);
        ProtoAdapter<GetInvitationLinkResponse> protoAdapter = GetInvitationLinkResponse.ADAPTER;
        protoAdapter.getClass();
        SdkSender.asynSendRequestNonWrap(command, aVar, bVar, new SdkSender.IParser() {
            /* class com.ss.android.lark.invitation.v2.$$Lambda$zaCsF9SEB3NSiXMRH0i6zSwCcD4 */

            @Override // com.ss.android.lark.sdk.SdkSender.IParser
            public final Object parse(byte[] bArr) {
                return (GetInvitationLinkResponse) ProtoAdapter.this.decode(bArr);
            }
        });
    }

    @Override // com.ss.android.lark.inv.export.api.InvitationServiceApi
    public void sendContent(String str, boolean z, IGetDataCallback<SendUserInvitationResponse> iGetDataCallback) {
        String str2;
        SendUserInvitationRequest.Type type;
        Pair[] pairArr = new Pair[1];
        if (z) {
            str2 = "phone";
        } else {
            str2 = "email";
        }
        pairArr[0] = Pair.create(ShareHitPoint.f121869d, str2);
        HashMap a = C40108g.m159014a(pairArr);
        Command command = Command.SEND_USER_INVITATION;
        SendUserInvitationRequest.C16376a a2 = new SendUserInvitationRequest.C16376a().mo58492a(str);
        if (z) {
            type = SendUserInvitationRequest.Type.MOBILE;
        } else {
            type = SendUserInvitationRequest.Type.EMAIL;
        }
        SendUserInvitationRequest.C16376a a3 = a2.mo58491a(type);
        InvApmUtils.GetDataCallback bVar = new InvApmUtils.GetDataCallback(iGetDataCallback, "ug_invite_external_orientation_invite", a);
        ProtoAdapter<SendUserInvitationResponse> protoAdapter = SendUserInvitationResponse.ADAPTER;
        protoAdapter.getClass();
        SdkSender.asynSendRequestNonWrap(command, a3, bVar, new SdkSender.IParser() {
            /* class com.ss.android.lark.invitation.v2.$$Lambda$euPEFP2gOhdnVFqz6XameFZtrfw */

            @Override // com.ss.android.lark.sdk.SdkSender.IParser
            public final Object parse(byte[] bArr) {
                return (SendUserInvitationResponse) ProtoAdapter.this.decode(bArr);
            }
        });
    }

    @Override // com.ss.android.lark.inv.export.api.InvitationServiceApi
    public void invite(InvitationServiceApi.C40083b bVar, boolean z, String str, IGetDataCallback<InvitationServiceApi.C40084c> iGetDataCallback) {
        String str2;
        SetAdminInvitationRequest.C16380a c = new SetAdminInvitationRequest.C16380a().mo58501a(InvitationPlatformType.PlatformAndroid).mo58506c(bVar.f101875b);
        if (z) {
            c.mo58505b(bVar.f101874a).mo58502a(SetAdminInvitationRequest.ContactPointType.EMAIL);
        } else {
            c.mo58503a(bVar.f101874a).mo58502a(SetAdminInvitationRequest.ContactPointType.MOBILE);
        }
        c.f42643f = getDepartmentsFromString(str);
        Pair[] pairArr = new Pair[1];
        if (z) {
            str2 = "email";
        } else {
            str2 = "phone";
        }
        pairArr[0] = Pair.create(ShareHitPoint.f121869d, str2);
        SdkSender.asynSendRequestNonWrap(Command.SET_ADMIN_INVITATION, c, new InvApmUtils.GetDataCallback(iGetDataCallback, "ug_invite_member_orientation_invite", C40108g.m159014a(pairArr)), getParser(z));
    }
}
