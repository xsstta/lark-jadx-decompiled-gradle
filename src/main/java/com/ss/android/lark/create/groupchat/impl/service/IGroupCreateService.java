package com.ss.android.lark.create.groupchat.impl.service;

import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.im.v1.CreateChatRequest;
import com.bytedance.lark.pb.im.v1.CreateChatResponse;
import com.larksuite.rucket.impl.base.request.RequestConfigImpl;
import com.larksuite.rucket.impl.sdkimpl.annotation.SdkCall;
import com.larksuite.rucket.impl.serverimpl.annotation.ServerCall;
import com.larksuite.rucket.job.RucketJob;
import com.ss.android.lark.pb.chats.PullChangeGroupMemberAuthorizationRequest;
import com.ss.android.lark.pb.chats.PullChangeGroupMemberAuthorizationResponse;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J3\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u001b\u0010\u0007\u001a\u0017\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bj\u0002`\u000b¢\u0006\u0002\b\fH'J\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00032\u0006\u0010\u0005\u001a\u00020\u000fH'¨\u0006\u0010"}, d2 = {"Lcom/ss/android/lark/create/groupchat/impl/service/IGroupCreateService;", "", "createGroupChat", "Lcom/larksuite/rucket/job/RucketJob;", "Lcom/bytedance/lark/pb/im/v1/CreateChatResponse;", "request", "Lcom/bytedance/lark/pb/im/v1/CreateChatRequest;", "requestConfig", "Lkotlin/Function1;", "Lcom/larksuite/rucket/impl/base/request/RequestConfigImpl;", "", "Lcom/larksuite/rucket/impl/base/request/RequestConfig;", "Lkotlin/ExtensionFunctionType;", "pullCreateGroupAuthorization", "Lcom/ss/android/lark/pb/chats/PullChangeGroupMemberAuthorizationResponse;", "Lcom/ss/android/lark/pb/chats/PullChangeGroupMemberAuthorizationRequest;", "im_create-group-chat_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.create.groupchat.impl.a.h */
public interface IGroupCreateService {
    @SdkCall(Command.CREATE_CHAT)
    /* renamed from: a */
    RucketJob<CreateChatResponse> mo133830a(CreateChatRequest createChatRequest, Function1<? super RequestConfigImpl, Unit> function1);

    @ServerCall(com.ss.android.lark.pb.improto.Command.PULL_CHANGE_GROUP_MEMBER_AUTHORIZATION)
    /* renamed from: a */
    RucketJob<PullChangeGroupMemberAuthorizationResponse> mo133831a(PullChangeGroupMemberAuthorizationRequest pullChangeGroupMemberAuthorizationRequest);
}
