package com.ss.android.lark.chatsetting.service;

import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.im.v1.GetChatAdminUsersRequest;
import com.bytedance.lark.pb.im.v1.GetChatAdminUsersResponse;
import com.bytedance.lark.pb.im.v1.GetTeamsByIdsRequest;
import com.bytedance.lark.pb.im.v1.GetTeamsByIdsResponse;
import com.bytedance.lark.pb.im.v1.UpdateChatRequest;
import com.bytedance.lark.pb.im.v1.UpdateChatResponse;
import com.larksuite.rucket.impl.sdkimpl.annotation.SdkCall;
import com.larksuite.rucket.impl.serverimpl.annotation.ServerCall;
import com.larksuite.rucket.job.RucketJob;
import com.ss.android.lark.pb.chats.PullChatMemberSettingRequest;
import com.ss.android.lark.pb.chats.PullChatMemberSettingResponse;
import com.ss.android.lark.pb.misc.PullChatMemberSuppRoleApprovalSettingRequest;
import com.ss.android.lark.pb.misc.PullChatMemberSuppRoleApprovalSettingResponse;
import com.ss.android.lark.pb.misc.PutChatMemberSuppRoleApprovalRequest;
import com.ss.android.lark.pb.misc.PutChatMemberSuppRoleApprovalResponse;
import com.ss.android.lark.pb.team.PullAvatarMetaRequest;
import com.ss.android.lark.pb.team.PullAvatarMetaResponse;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H'J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00032\u0006\u0010\u0005\u001a\u00020\tH'J\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00032\u0006\u0010\u0005\u001a\u00020\fH'J\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00032\u0006\u0010\u0005\u001a\u00020\u000fH'J\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u00032\u0006\u0010\u0005\u001a\u00020\u0012H'J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00032\u0006\u0010\u0005\u001a\u00020\u0015H'J\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u00032\u0006\u0010\u0005\u001a\u00020\u0018H'¨\u0006\u0019"}, d2 = {"Lcom/ss/android/lark/chatsetting/service/IChatSettingService;", "", "getAvatarMetaByKey", "Lcom/larksuite/rucket/job/RucketJob;", "Lcom/ss/android/lark/pb/team/PullAvatarMetaResponse;", "request", "Lcom/ss/android/lark/pb/team/PullAvatarMetaRequest;", "getChatAdminList", "Lcom/bytedance/lark/pb/im/v1/GetChatAdminUsersResponse;", "Lcom/bytedance/lark/pb/im/v1/GetChatAdminUsersRequest;", "getTeam", "Lcom/bytedance/lark/pb/im/v1/GetTeamsByIdsResponse;", "Lcom/bytedance/lark/pb/im/v1/GetTeamsByIdsRequest;", "pullChatMemberSetting", "Lcom/ss/android/lark/pb/chats/PullChatMemberSettingResponse;", "Lcom/ss/android/lark/pb/chats/PullChatMemberSettingRequest;", "pullChatMemberSuppRoleApprovalSetting", "Lcom/ss/android/lark/pb/misc/PullChatMemberSuppRoleApprovalSettingResponse;", "Lcom/ss/android/lark/pb/misc/PullChatMemberSuppRoleApprovalSettingRequest;", "putChatMemberSuppRoleApproval", "Lcom/ss/android/lark/pb/misc/PutChatMemberSuppRoleApprovalResponse;", "Lcom/ss/android/lark/pb/misc/PutChatMemberSuppRoleApprovalRequest;", "updateChat", "Lcom/bytedance/lark/pb/im/v1/UpdateChatResponse;", "Lcom/bytedance/lark/pb/im/v1/UpdateChatRequest;", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chatsetting.b.c */
public interface IChatSettingService {
    @SdkCall(Command.GET_CHAT_ADMIN_USERS)
    /* renamed from: a */
    RucketJob<GetChatAdminUsersResponse> mo127466a(GetChatAdminUsersRequest getChatAdminUsersRequest);

    @SdkCall(Command.GET_TEAMS_BY_IDS)
    /* renamed from: a */
    RucketJob<GetTeamsByIdsResponse> mo127467a(GetTeamsByIdsRequest getTeamsByIdsRequest);

    @SdkCall(Command.UPDATE_CHAT)
    /* renamed from: a */
    RucketJob<UpdateChatResponse> mo127468a(UpdateChatRequest updateChatRequest);

    @ServerCall(com.ss.android.lark.pb.improto.Command.PULL_CHAT_MEMBER_SETTING)
    /* renamed from: a */
    RucketJob<PullChatMemberSettingResponse> mo127469a(PullChatMemberSettingRequest pullChatMemberSettingRequest);

    @ServerCall(com.ss.android.lark.pb.improto.Command.PULL_CHAT_MEMBER_SUPP_ROLE_APPROVAL_SETTING)
    /* renamed from: a */
    RucketJob<PullChatMemberSuppRoleApprovalSettingResponse> mo127470a(PullChatMemberSuppRoleApprovalSettingRequest pullChatMemberSuppRoleApprovalSettingRequest);

    @ServerCall(com.ss.android.lark.pb.improto.Command.PUT_CHAT_MEMBER_SUPP_ROLE_APPROVAL)
    /* renamed from: a */
    RucketJob<PutChatMemberSuppRoleApprovalResponse> mo127471a(PutChatMemberSuppRoleApprovalRequest putChatMemberSuppRoleApprovalRequest);

    @ServerCall(com.ss.android.lark.pb.improto.Command.PULL_AVATAR_META)
    /* renamed from: a */
    RucketJob<PullAvatarMetaResponse> mo127472a(PullAvatarMetaRequest pullAvatarMetaRequest);
}
