package com.ss.android.lark.chat.api.service;

import com.bytedance.lark.pb.im.v1.GetChatLimitInfoResponse;
import com.bytedance.lark.pb.im.v1.GetChatLinkTokenResponse;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.biz.im.api.ChatBundle;
import com.ss.android.lark.biz.im.api.ChatQRCodeInfoResponse;
import com.ss.android.lark.biz.im.api.ImageHistoryResponse;
import com.ss.android.lark.chat.entity.chat.AddChatChatterApply;
import com.ss.android.lark.chat.entity.chat.AvatarMeta;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chat.ChatApplyInfo;
import com.ss.android.lark.chat.entity.chat.ChatSetting;
import com.ss.android.lark.chat.entity.chat.ChatShareInfo;
import com.ss.android.lark.chat.entity.chat.PickChatEntity;
import com.ss.android.lark.chat.entity.chatter.ChatChatter;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.export.entity.chat.OpenChat;
import com.ss.android.lark.dto.chat.C36869c;
import com.ss.android.lark.dto.chat.C36870f;
import com.ss.android.lark.dto.chat.ChatChatterResponse;
import com.ss.android.lark.dto.chat.ChatInactiveMemberResponse;
import com.ss.android.lark.dto.chat.ChatLinkInfoResponse;
import com.ss.android.lark.dto.chat.ChatLinkTokenResponse;
import com.ss.android.lark.dto.chat.ChatQRCodeTokenResponse;
import com.ss.android.lark.dto.chat.GetChatJoinLeaveHistoryResponse;
import com.ss.android.lark.dto.chat.PullChatShareHistoryResponse;
import com.ss.android.lark.dto.group.ChatChatterKickInfo;
import com.ss.android.lark.dto.group.GroupRecallEntity;
import com.ss.android.lark.dto.p1815d.C36871a;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;
import java.util.Map;

public interface IChatService {

    @Retention(RetentionPolicy.SOURCE)
    public @interface ChatChatterScene {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface Condition {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface RecallChatterSource {
    }

    /* renamed from: a */
    ImageHistoryResponse mo120984a(String str, String str2, ImageHistoryResponse.Direction direction, List<ImageHistoryResponse.ResourceType> list, int i);

    /* renamed from: a */
    Chat mo120985a(String str);

    /* renamed from: a */
    Chat mo120986a(String str, String str2);

    /* renamed from: a */
    ChatChatterResponse mo120987a(String str, String str2, int i, int i2, boolean z, int i3);

    /* renamed from: a */
    ChatChatterResponse mo120988a(String str, String str2, int i, boolean z, int i2);

    /* renamed from: a */
    C36870f mo120989a(String str, String str2, String str3, boolean z);

    /* renamed from: a */
    String mo120990a(Chat chat);

    /* renamed from: a */
    Map<String, Chat> mo120991a(List<String> list);

    /* renamed from: a */
    void mo120992a(String str, int i, IGetDataCallback<Chat> iGetDataCallback);

    /* renamed from: a */
    void mo120993a(String str, int i, boolean z, IGetDataCallback<ChatQRCodeTokenResponse> iGetDataCallback);

    /* renamed from: a */
    void mo120994a(String str, IGetDataCallback<Chat> iGetDataCallback);

    /* renamed from: a */
    void mo120995a(String str, AddChatChatterApply.Ways ways, List<String> list, String str2, String str3, String str4, IGetDataCallback<Boolean> iGetDataCallback);

    /* renamed from: a */
    void mo120996a(String str, Chat.AddMemberPermission addMemberPermission, Chat.ShareCardPermission shareCardPermission, IGetDataCallback<Chat> iGetDataCallback);

    /* renamed from: a */
    void mo120997a(String str, Chat.AtAllPermission atAllPermission, IGetDataCallback<Chat> iGetDataCallback);

    /* renamed from: a */
    void mo120998a(String str, Chat.BuzzPermissionSetting buzzPermissionSetting, IGetDataCallback<Chat> iGetDataCallback);

    /* renamed from: a */
    void mo120999a(String str, Chat.CreateVideoConferenceSetting createVideoConferenceSetting, IGetDataCallback<Chat> iGetDataCallback);

    /* renamed from: a */
    void mo121000a(String str, Chat.GroupMailSendPermissionType groupMailSendPermissionType, IGetDataCallback<Chat> iGetDataCallback);

    /* renamed from: a */
    void mo121001a(String str, Chat.MessagePosition messagePosition, IGetDataCallback<Chat> iGetDataCallback);

    /* renamed from: a */
    void mo121002a(String str, Chat.PinPermissionSetting pinPermissionSetting, IGetDataCallback<Chat> iGetDataCallback);

    /* renamed from: a */
    void mo121003a(String str, Chat.PostType postType, List<String> list, List<String> list2, IGetDataCallback<Void> iGetDataCallback);

    /* renamed from: a */
    void mo121004a(String str, Chat.SystemMessageVisible systemMessageVisible, IGetDataCallback<Chat> iGetDataCallback);

    /* renamed from: a */
    void mo121005a(String str, Chat.TopNoticePermissionSetting topNoticePermissionSetting, IGetDataCallback<Chat> iGetDataCallback);

    /* renamed from: a */
    void mo121006a(String str, Iterable<String> iterable, int i, IGetDataCallback<Chat> iGetDataCallback);

    /* renamed from: a */
    void mo121007a(String str, Iterable<String> iterable, IGetDataCallback<Chat> iGetDataCallback);

    /* renamed from: a */
    void mo121008a(String str, Iterable<String> iterable, Iterable<PickChatEntity> iterable2, int i, IGetDataCallback<Chat> iGetDataCallback);

    /* renamed from: a */
    void mo121009a(String str, String str2, int i, IGetDataCallback<PullChatShareHistoryResponse> iGetDataCallback);

    /* renamed from: a */
    void mo121010a(String str, String str2, int i, boolean z, int i2, IGetDataCallback<ChatChatterResponse> iGetDataCallback, int i3);

    /* renamed from: a */
    void mo121011a(String str, String str2, int i, boolean z, IGetDataCallback<ChatChatterResponse> iGetDataCallback, int i2);

    /* renamed from: a */
    void mo121012a(String str, String str2, IGetDataCallback<Chat> iGetDataCallback);

    /* renamed from: a */
    void mo121013a(String str, String str2, ImageHistoryResponse.Direction direction, List<ImageHistoryResponse.ResourceType> list, int i, IGetDataCallback<ImageHistoryResponse> iGetDataCallback);

    /* renamed from: a */
    void mo121014a(String str, String str2, AddChatChatterApply.Status status, IGetDataCallback<Boolean> iGetDataCallback);

    /* renamed from: a */
    void mo121015a(String str, String str2, AvatarMeta avatarMeta, IGetDataCallback<Chat> iGetDataCallback);

    /* renamed from: a */
    void mo121016a(String str, String str2, Iterable<String> iterable, IGetDataCallback<Chat> iGetDataCallback);

    /* renamed from: a */
    void mo121017a(String str, String str2, String str3, IGetDataCallback<Chat> iGetDataCallback);

    /* renamed from: a */
    void mo121018a(String str, String str2, String str3, boolean z, IGetDataCallback<C36870f> iGetDataCallback);

    /* renamed from: a */
    void mo121019a(String str, String str2, boolean z, int i, IGetDataCallback<ChatChatterResponse> iGetDataCallback, int i2);

    /* renamed from: a */
    void mo121020a(String str, String str2, boolean z, IGetDataCallback<ChatChatterResponse> iGetDataCallback, int i);

    /* renamed from: a */
    void mo121021a(String str, List<PickChatEntity> list, IGetDataCallback<Chat> iGetDataCallback);

    /* renamed from: a */
    void mo121022a(String str, List<String> list, String str2, String str3, IGetDataCallback<Chat> iGetDataCallback);

    /* renamed from: a */
    void mo121023a(String str, List<String> list, List<String> list2, IGetDataCallback<Boolean> iGetDataCallback);

    /* renamed from: a */
    void mo121024a(String str, boolean z, IGetDataCallback<ChatSetting> iGetDataCallback);

    /* renamed from: a */
    void mo121025a(String str, boolean z, Chat.AddMemberPermission addMemberPermission, Chat.ShareCardPermission shareCardPermission, IGetDataCallback<Chat> iGetDataCallback);

    /* renamed from: a */
    void mo121026a(String str, boolean z, Chat.GroupMailSendPermissionType groupMailSendPermissionType, IGetDataCallback<Chat> iGetDataCallback);

    /* renamed from: a */
    void mo121027a(List<String> list, IGetDataCallback<Map<String, ? extends OpenChat>> iGetDataCallback);

    /* renamed from: a */
    void mo121028a(List<String> list, ChatShareInfo.ShareStatus shareStatus, IGetDataCallback<Boolean> iGetDataCallback);

    /* renamed from: a */
    void mo121029a(List<String> list, String str, IGetDataCallback<Map<String, Boolean>> iGetDataCallback);

    /* renamed from: a */
    void mo121030a(List<String> list, List<String> list2);

    /* renamed from: a */
    void mo121031a(boolean z, String str, ChatBundle.C29592c cVar, IGetDataCallback<Chat> iGetDataCallback);

    /* renamed from: b */
    Chat mo121032b(String str);

    /* renamed from: b */
    Map<String, Chat> mo121033b(List<String> list);

    /* renamed from: b */
    void mo121034b(String str, int i, IGetDataCallback<ChatQRCodeTokenResponse> iGetDataCallback);

    /* renamed from: b */
    void mo121035b(String str, int i, boolean z, IGetDataCallback<ChatLinkTokenResponse> iGetDataCallback);

    /* renamed from: b */
    void mo121036b(String str, IGetDataCallback<Boolean> iGetDataCallback);

    /* renamed from: b */
    void mo121037b(String str, Chat.SystemMessageVisible systemMessageVisible, IGetDataCallback<Chat> iGetDataCallback);

    /* renamed from: b */
    void mo121038b(String str, String str2, int i, IGetDataCallback<GetChatJoinLeaveHistoryResponse> iGetDataCallback);

    /* renamed from: b */
    void mo121039b(String str, String str2, IGetDataCallback<Chat> iGetDataCallback);

    /* renamed from: b */
    void mo121040b(String str, List<String> list, IGetDataCallback<Map<String, Boolean>> iGetDataCallback);

    /* renamed from: b */
    void mo121041b(String str, boolean z, IGetDataCallback<Chat> iGetDataCallback);

    /* renamed from: b */
    void mo121042b(List<String> list, IGetDataCallback<Map<String, ChatSetting>> iGetDataCallback);

    /* renamed from: b */
    void mo121043b(List<GroupRecallEntity> list, String str, IGetDataCallback<List<GroupRecallEntity>> iGetDataCallback);

    /* renamed from: b */
    boolean mo121044b(Chat chat);

    /* renamed from: c */
    C36871a mo121045c(String str);

    /* renamed from: c */
    Map<String, Chat> mo121046c(List<String> list);

    /* renamed from: c */
    void mo121047c(String str, int i, IGetDataCallback<GetChatLinkTokenResponse> iGetDataCallback);

    /* renamed from: c */
    void mo121048c(String str, IGetDataCallback<Chat> iGetDataCallback);

    /* renamed from: c */
    void mo121049c(String str, String str2, IGetDataCallback<Chat> iGetDataCallback);

    /* renamed from: c */
    void mo121050c(String str, boolean z, IGetDataCallback<Chat> iGetDataCallback);

    /* renamed from: c */
    void mo121051c(List<String> list, IGetDataCallback<Boolean> iGetDataCallback);

    /* renamed from: d */
    int mo121052d(String str);

    /* renamed from: d */
    void mo121053d(String str, IGetDataCallback<Boolean> iGetDataCallback);

    /* renamed from: d */
    void mo121054d(String str, String str2, IGetDataCallback<Chat> iGetDataCallback);

    /* renamed from: d */
    void mo121055d(String str, boolean z, IGetDataCallback<Chat> iGetDataCallback);

    /* renamed from: e */
    Chat mo121056e(String str);

    /* renamed from: e */
    void mo121057e(String str, IGetDataCallback<ChatQRCodeInfoResponse> iGetDataCallback);

    /* renamed from: e */
    void mo121058e(String str, String str2, IGetDataCallback<Chat> iGetDataCallback);

    /* renamed from: e */
    void mo121059e(String str, boolean z, IGetDataCallback<Chat> iGetDataCallback);

    /* renamed from: f */
    ChatSetting mo121060f(String str);

    /* renamed from: f */
    void mo121061f(String str, IGetDataCallback<ChatLinkInfoResponse> iGetDataCallback);

    /* renamed from: f */
    void mo121062f(String str, String str2, IGetDataCallback<Chat> iGetDataCallback);

    /* renamed from: f */
    void mo121063f(String str, boolean z, IGetDataCallback<Boolean> iGetDataCallback);

    /* renamed from: g */
    Chat mo121064g(String str);

    /* renamed from: g */
    void mo121065g(String str, IGetDataCallback<Chat> iGetDataCallback);

    /* renamed from: g */
    void mo121066g(String str, String str2, IGetDataCallback<Chat> iGetDataCallback);

    /* renamed from: g */
    void mo121067g(String str, boolean z, IGetDataCallback<Chat> iGetDataCallback);

    /* renamed from: h */
    Message mo121068h(String str);

    /* renamed from: h */
    void mo121069h(String str, IGetDataCallback<Chat> iGetDataCallback);

    /* renamed from: h */
    void mo121070h(String str, String str2, IGetDataCallback<ChatApplyInfo> iGetDataCallback);

    /* renamed from: h */
    void mo121071h(String str, boolean z, IGetDataCallback<Chat> iGetDataCallback);

    /* renamed from: i */
    GetChatLimitInfoResponse mo121072i(String str);

    /* renamed from: i */
    void mo121073i(String str, IGetDataCallback<List<ChatChatter>> iGetDataCallback);

    /* renamed from: j */
    ChatChatterKickInfo mo121074j(String str);

    /* renamed from: j */
    void mo121075j(String str, IGetDataCallback<AvatarMeta> iGetDataCallback);

    /* renamed from: k */
    void mo121076k(String str, IGetDataCallback<ChatInactiveMemberResponse> iGetDataCallback);

    /* renamed from: l */
    void mo121077l(String str, IGetDataCallback<C36869c> iGetDataCallback);

    /* renamed from: m */
    void mo121078m(String str, IGetDataCallback<List<Chatter>> iGetDataCallback);
}
