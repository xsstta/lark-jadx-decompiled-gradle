package com.ss.android.lark.chat.topnoticemessage;

import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.im.v1.GetChatTopNoticeRequest;
import com.bytedance.lark.pb.im.v1.GetChatTopNoticeResponse;
import com.bytedance.lark.pb.im.v1.PatchChatTopNoticeRequest;
import com.bytedance.lark.pb.im.v1.PatchChatTopNoticeResponse;
import com.bytedance.lark.pb.im.v1.PushChatTopNoticeInfo;
import com.larksuite.rucket.impl.sdkimpl.annotation.SdkCall;
import com.larksuite.rucket.impl.sdkimpl.annotation.SdkPush;
import com.larksuite.rucket.job.RucketJob;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H'J\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\u0006\u0010\u0007\u001a\u00020\bH'J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00032\u0006\u0010\u0007\u001a\u00020\u000bH'¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/chat/topnoticemessage/ITopNoticeService;", "", "chatTopNoticePush", "Lcom/larksuite/rucket/job/RucketJob;", "Lcom/bytedance/lark/pb/im/v1/PushChatTopNoticeInfo;", "getChatTopNotice", "Lcom/bytedance/lark/pb/im/v1/GetChatTopNoticeResponse;", "request", "Lcom/bytedance/lark/pb/im/v1/GetChatTopNoticeRequest;", "patchChatTopNotice", "Lcom/bytedance/lark/pb/im/v1/PatchChatTopNoticeResponse;", "Lcom/bytedance/lark/pb/im/v1/PatchChatTopNoticeRequest;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.topnoticemessage.a */
public interface ITopNoticeService {
    @SdkPush(Command.PUSH_CHAT_TOP_NOTICE)
    /* renamed from: a */
    RucketJob<PushChatTopNoticeInfo> mo126845a();

    @SdkCall(Command.GET_CHAT_TOP_NOTICE)
    /* renamed from: a */
    RucketJob<GetChatTopNoticeResponse> mo126846a(GetChatTopNoticeRequest getChatTopNoticeRequest);

    @SdkCall(Command.PATCH_CHAT_TOP_NOTICE)
    /* renamed from: a */
    RucketJob<PatchChatTopNoticeResponse> mo126847a(PatchChatTopNoticeRequest patchChatTopNoticeRequest);
}
