package com.ss.android.lark.chat.api.service.p1600b;

import android.text.TextUtils;
import com.bytedance.lark.pb.basic.v1.AddChatChatterApply;
import com.bytedance.lark.pb.basic.v1.AvatarMeta;
import com.bytedance.lark.pb.basic.v1.C14928Entity;
import com.bytedance.lark.pb.basic.v1.Chat;
import com.bytedance.lark.pb.basic.v1.ChatMailSetting;
import com.bytedance.lark.pb.basic.v1.ChatShareInfo;
import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.basic.v1.ContactSource;
import com.bytedance.lark.pb.basic.v1.Doc;
import com.bytedance.lark.pb.basic.v1.PickEntities;
import com.bytedance.lark.pb.basic.v1.SyncDataStrategy;
import com.bytedance.lark.pb.behavior.v1.EnterChatRequest;
import com.bytedance.lark.pb.behavior.v1.ExitChatRequest;
import com.bytedance.lark.pb.contact.v1.GetDepartmentInactiveInfoRequest;
import com.bytedance.lark.pb.contact.v1.GetDepartmentInactiveInfoResponse;
import com.bytedance.lark.pb.contact.v1.GetDepartmentInvitationUrlRequest;
import com.bytedance.lark.pb.contact.v1.GetDepartmentInvitationUrlResponse;
import com.bytedance.lark.pb.contact.v1.InvitationSource;
import com.bytedance.lark.pb.im.v1.AddChatChattersRequest;
import com.bytedance.lark.pb.im.v1.AddChatChattersResponse;
import com.bytedance.lark.pb.im.v1.CheckChattersInChatRequest;
import com.bytedance.lark.pb.im.v1.CheckChattersInChatResponse;
import com.bytedance.lark.pb.im.v1.CheckPublicChatNameIsExistRequest;
import com.bytedance.lark.pb.im.v1.CheckPublicChatNameIsExistResponse;
import com.bytedance.lark.pb.im.v1.CreateAddChatChatterApplyRequest;
import com.bytedance.lark.pb.im.v1.CreateAddChatChatterApplyResponse;
import com.bytedance.lark.pb.im.v1.CreateChatLastReadPositionRequest;
import com.bytedance.lark.pb.im.v1.CreateChatRequest;
import com.bytedance.lark.pb.im.v1.CreateChatResponse;
import com.bytedance.lark.pb.im.v1.CreateDepartmentChatRequest;
import com.bytedance.lark.pb.im.v1.CreateDepartmentChatResponse;
import com.bytedance.lark.pb.im.v1.CreateOrDeleteChatLastDraftIdRequest;
import com.bytedance.lark.pb.im.v1.CreateP2PChatSource;
import com.bytedance.lark.pb.im.v1.CreateP2PChatsRequest;
import com.bytedance.lark.pb.im.v1.CreateP2PChatsResponse;
import com.bytedance.lark.pb.im.v1.DeleteChatChattersRequest;
import com.bytedance.lark.pb.im.v1.DisableChatSharedRequest;
import com.bytedance.lark.pb.im.v1.GenerateUrlPreviewEntityRequest;
import com.bytedance.lark.pb.im.v1.GenerateUrlPreviewEntityResponse;
import com.bytedance.lark.pb.im.v1.GetAddChatChatterApplyRequest;
import com.bytedance.lark.pb.im.v1.GetAddChatChatterApplyResponse;
import com.bytedance.lark.pb.im.v1.GetChatAdminUsersRequest;
import com.bytedance.lark.pb.im.v1.GetChatAdminUsersResponse;
import com.bytedance.lark.pb.im.v1.GetChatAvatarMetaRequest;
import com.bytedance.lark.pb.im.v1.GetChatAvatarMetaResponse;
import com.bytedance.lark.pb.im.v1.GetChatChatterKickRequest;
import com.bytedance.lark.pb.im.v1.GetChatChatterKickResponse;
import com.bytedance.lark.pb.im.v1.GetChatChattersRequest;
import com.bytedance.lark.pb.im.v1.GetChatChattersResponse;
import com.bytedance.lark.pb.im.v1.GetChatJoinLeaveHistoryRequest;
import com.bytedance.lark.pb.im.v1.GetChatLimitInfoRequest;
import com.bytedance.lark.pb.im.v1.GetChatLimitInfoResponse;
import com.bytedance.lark.pb.im.v1.GetChatLinkInfoRequest;
import com.bytedance.lark.pb.im.v1.GetChatLinkInfoResponse;
import com.bytedance.lark.pb.im.v1.GetChatLinkTokenRequest;
import com.bytedance.lark.pb.im.v1.GetChatLinkTokenResponse;
import com.bytedance.lark.pb.im.v1.GetChatPostUsersRequest;
import com.bytedance.lark.pb.im.v1.GetChatPostUsersResponse;
import com.bytedance.lark.pb.im.v1.GetChatQRCodeInfoRequest;
import com.bytedance.lark.pb.im.v1.GetChatQRCodeInfoResponse;
import com.bytedance.lark.pb.im.v1.GetChatQRCodeTokenRequest;
import com.bytedance.lark.pb.im.v1.GetChatQRCodeTokenResponse;
import com.bytedance.lark.pb.im.v1.GetMentionChatChattersRequest;
import com.bytedance.lark.pb.im.v1.GetMentionChatChattersResponse;
import com.bytedance.lark.pb.im.v1.GetP2PChatsByChatterIdsRequest;
import com.bytedance.lark.pb.im.v1.GetP2PChatsByChatterIdsResponse;
import com.bytedance.lark.pb.im.v1.MGetChatsRequest;
import com.bytedance.lark.pb.im.v1.MGetChatsResponse;
import com.bytedance.lark.pb.im.v1.PatchChatAdminUsersRequest;
import com.bytedance.lark.pb.im.v1.PatchChatShareStatusRequest;
import com.bytedance.lark.pb.im.v1.PullChatShareHistoryRequest;
import com.bytedance.lark.pb.im.v1.SendChatterViaLinkRequest;
import com.bytedance.lark.pb.im.v1.SendChatterViaLinkResponse;
import com.bytedance.lark.pb.im.v1.SubscribeChatEventRequest;
import com.bytedance.lark.pb.im.v1.SubscribeChatEventResponse;
import com.bytedance.lark.pb.im.v1.UpdateAddChatChatterApplyRequest;
import com.bytedance.lark.pb.im.v1.UpdateAddChatChatterApplyResponse;
import com.bytedance.lark.pb.im.v1.UpdateChatPostUsersRequest;
import com.bytedance.lark.pb.im.v1.UpdateChatRequest;
import com.bytedance.lark.pb.im.v1.UpdateChatResponse;
import com.bytedance.lark.pb.media.v1.ChatResourceType;
import com.bytedance.lark.pb.media.v1.GetChatResourcesRequest;
import com.bytedance.lark.pb.media.v1.GetChatResourcesResponse;
import com.bytedance.lark.pb.space.doc.v1.GetDocByURLsRequest;
import com.bytedance.lark.pb.space.doc.v1.GetDocByURLsResponse;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.utils.C26256ah;
import com.larksuite.framework.utils.CollectionUtils;
import com.squareup.wire.ProtoAdapter;
import com.ss.android.lark.C29990c;
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
import com.ss.android.lark.chat.entity.chatter.C33982a;
import com.ss.android.lark.chat.entity.chatter.ChatChatter;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.preview.UrlPreviewEntity;
import com.ss.android.lark.chat.export.entity.chat.OpenChat;
import com.ss.android.lark.chat.service.AbstractC34296k;
import com.ss.android.lark.chat.service.AbstractC34297l;
import com.ss.android.lark.chat.utils.SDKSendUtils;
import com.ss.android.lark.dependency.AbstractC36450aa;
import com.ss.android.lark.doc.entity.DocResult;
import com.ss.android.lark.doc.entity.DocType;
import com.ss.android.lark.doc.entity.Icon;
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
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mm.module.participant.ParticipantRepo;
import com.ss.android.lark.p2851u.p2852a.C57310e;
import com.ss.android.lark.p2851u.p2852a.C57313f;
import com.ss.android.lark.p2851u.p2852a.C57314g;
import com.ss.android.lark.parser.internal.ModelParserPickChatEntity;
import com.ss.android.lark.parser.internal.ModelParserPreview;
import com.ss.android.lark.pb.chats.CheckWithdrawPickEntitiesInChatRequest;
import com.ss.android.lark.pb.chats.CheckWithdrawPickEntitiesInChatResponse;
import com.ss.android.lark.pb.chats.PullChatLinkTokenRequest;
import com.ss.android.lark.pb.chats.PullChatLinkTokenResponse;
import com.ss.android.lark.pb.chats.PullChatQRCodeTokenRequest;
import com.ss.android.lark.pb.chats.PullChatQRCodeTokenResponse;
import com.ss.android.lark.pb.chats.PullChatShareTokenInfoRequest;
import com.ss.android.lark.pb.chats.PullChatShareTokenInfoResponse;
import com.ss.android.lark.pb.edu.EduJoinChatPreCheckRequest;
import com.ss.android.lark.pb.edu.EduJoinChatPreCheckResponse;
import com.ss.android.lark.sdk.C53253l;
import com.ss.android.lark.sdk.SdkSender;
import com.ss.android.lark.utils.rxjava.C57865c;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.lark.chat.api.service.b.b */
public class C32821b implements AbstractC34296k {

    /* renamed from: a */
    private final AbstractC34297l f84264a;

    /* renamed from: b */
    private final AbstractC36450aa f84265b;

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.chat.api.service.b.b$a */
    public static final class C32831a {

        /* renamed from: a */
        public static final C32821b f84318a = new C32821b();
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public static /* synthetic */ Void m126150k(byte[] bArr) throws IOException {
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public static /* synthetic */ Object m126151l(byte[] bArr) throws IOException {
        return null;
    }

    public static /* synthetic */ Boolean lambda$TCfoZVBlpv6GpnpwSwUGEmbQYro(byte[] bArr) {
        return true;
    }

    public static /* synthetic */ Boolean lambda$Zref5_GUwhKGOmXa8bm0gvYPRQk(byte[] bArr) {
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public static /* synthetic */ Void m126152m(byte[] bArr) throws IOException {
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public static /* synthetic */ Object m126153n(byte[] bArr) throws IOException {
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public static /* synthetic */ Object m126154o(byte[] bArr) throws IOException {
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: u */
    public static /* synthetic */ Chat m126161u(byte[] bArr) throws IOException {
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: w */
    public static /* synthetic */ Boolean m126163w(byte[] bArr) throws IOException {
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: x */
    public static /* synthetic */ Chat m126164x(byte[] bArr) throws IOException {
        return null;
    }

    /* renamed from: a */
    public static C32821b m126120a() {
        return C32831a.f84318a;
    }

    @Override // com.ss.android.lark.chat.api.service.IChatService
    /* renamed from: a */
    public Chat mo120985a(String str) {
        SDKSendUtils.m133260a();
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Chat e = mo121056e(str);
        if (e != null) {
            return e;
        }
        Map<String, Chat> b = mo121033b(Collections.singletonList(str));
        return !CollectionUtils.isEmpty(b) ? b.get(str) : e;
    }

    @Override // com.ss.android.lark.chat.api.service.IChatService
    /* renamed from: a */
    public void mo120994a(final String str, final IGetDataCallback<Chat> iGetDataCallback) {
        if (!TextUtils.isEmpty(str)) {
            C57865c.m224576a(new Runnable() {
                /* class com.ss.android.lark.chat.api.service.p1600b.C32821b.RunnableC328221 */

                public void run() {
                    Chat a = C32821b.this.mo120985a(str);
                    if (a == null) {
                        IGetDataCallback iGetDataCallback = iGetDataCallback;
                        if (iGetDataCallback != null) {
                            iGetDataCallback.onError(new ErrorResult("chat is null"));
                            return;
                        }
                        return;
                    }
                    IGetDataCallback iGetDataCallback2 = iGetDataCallback;
                    if (iGetDataCallback2 != null) {
                        iGetDataCallback2.onSuccess(a);
                    }
                }
            });
        } else if (iGetDataCallback != null) {
            iGetDataCallback.onError(new ErrorResult("chatId is empty"));
        }
    }

    @Override // com.ss.android.lark.chat.api.service.IChatService
    /* renamed from: a */
    public Chat mo120986a(String str, String str2) {
        Chat g = mo121064g(str);
        return g == null ? mo121132a(false, str, (ChatBundle.C29592c) null) : g;
    }

    @Override // com.ss.android.lark.chat.api.service.IChatService
    /* renamed from: a */
    public void mo121031a(boolean z, String str, ChatBundle.C29592c cVar, IGetDataCallback<Chat> iGetDataCallback) {
        SdkSender.asynSendRequestNonWrap(Command.CREATE_CHAT, m126129b(z, str, cVar), iGetDataCallback, new SdkSender.IParser() {
            /* class com.ss.android.lark.chat.api.service.p1600b.$$Lambda$b$rGjoEy2FdNp5iVMig3haJ_dkfZ4 */

            @Override // com.ss.android.lark.sdk.SdkSender.IParser
            public final Object parse(byte[] bArr) {
                return C32821b.this.m126130b(bArr);
            }
        }, C29990c.m110930b().mo134577e().mo120973e("get_chat_launcher_info"));
    }

    /* renamed from: a */
    public Chat mo121132a(boolean z, String str, ChatBundle.C29592c cVar) {
        C53253l e = C29990c.m110930b().mo134577e().mo120973e("get_chat_launcher_info");
        return SdkSender.syncSendMayError(Command.CREATE_CHAT, m126129b(z, str, cVar), new SdkSender.IParser() {
            /* class com.ss.android.lark.chat.api.service.p1600b.$$Lambda$b$rGjoEy2FdNp5iVMig3haJ_dkfZ4 */

            @Override // com.ss.android.lark.sdk.SdkSender.IParser
            public final Object parse(byte[] bArr) {
                return C32821b.this.m126130b(bArr);
            }
        }, e).f131572a;
    }

    @Override // com.ss.android.lark.chat.api.service.IChatService
    /* renamed from: b */
    public void mo121036b(String str, IGetDataCallback<Boolean> iGetDataCallback) {
        if (TextUtils.isEmpty(str)) {
            iGetDataCallback.onError(new ErrorResult("group name is empty"));
        }
        SdkSender.asynSendRequestNonWrap(Command.CHECK_PUBLIC_CHAT_NAME_IS_EXIST, new CheckPublicChatNameIsExistRequest.C17326a().mo60838a(str), iGetDataCallback, new SdkSender.IParser<Boolean>() {
            /* class com.ss.android.lark.chat.api.service.p1600b.C32821b.AnonymousClass33 */

            /* renamed from: a */
            public Boolean parse(byte[] bArr) throws IOException {
                return CheckPublicChatNameIsExistResponse.ADAPTER.decode(bArr).is_exist;
            }
        });
    }

    @Override // com.ss.android.lark.chat.api.service.IChatService
    /* renamed from: a */
    public void mo121022a(String str, List<String> list, String str2, String str3, IGetDataCallback<Chat> iGetDataCallback) {
        SdkSender.asynSendRequestNonWrap(Command.CREATE_DEPARTMENT_CHAT, new CreateDepartmentChatRequest.C17348a().mo60911a(list).mo60910a(str).mo60913b(str2).mo60914c(str3), iGetDataCallback, new SdkSender.IParser<Chat>() {
            /* class com.ss.android.lark.chat.api.service.p1600b.C32821b.AnonymousClass34 */

            /* renamed from: a */
            public Chat parse(byte[] bArr) throws IOException {
                Iterator<Chat> it = C57310e.m222093b(CreateDepartmentChatResponse.ADAPTER.decode(bArr).entity.chats).values().iterator();
                if (it.hasNext()) {
                    return it.next();
                }
                return null;
            }
        });
    }

    @Override // com.ss.android.lark.chat.api.service.IChatService
    /* renamed from: a */
    public void mo121027a(List<String> list, IGetDataCallback<Map<String, ? extends OpenChat>> iGetDataCallback) {
        SdkSender.asynSendRequestNonWrap(Command.CREATE_P2P_CHATS, new CreateP2PChatsRequest.C17368a().mo60965a(list), iGetDataCallback, new SdkSender.IParser<Map<String, ? extends OpenChat>>() {
            /* class com.ss.android.lark.chat.api.service.p1600b.C32821b.AnonymousClass35 */

            /* renamed from: a */
            public Map<String, ? extends OpenChat> parse(byte[] bArr) throws IOException {
                return C57310e.m222093b(CreateP2PChatsResponse.ADAPTER.decode(bArr).entity.chats);
            }
        });
    }

    @Override // com.ss.android.lark.chat.api.service.IChatService
    /* renamed from: a */
    public void mo121012a(String str, String str2, IGetDataCallback<Chat> iGetDataCallback) {
        m126126a(new UpdateChatRequest.C18137a().mo62912a(str).mo62916b(str2), iGetDataCallback);
    }

    @Override // com.ss.android.lark.chat.api.service.IChatService
    /* renamed from: a */
    public void mo121006a(String str, Iterable<String> iterable, int i, IGetDataCallback<Chat> iGetDataCallback) {
        mo121008a(str, iterable, Collections.emptyList(), i, iGetDataCallback);
    }

    @Override // com.ss.android.lark.chat.api.service.IChatService
    /* renamed from: a */
    public void mo121008a(String str, Iterable<String> iterable, Iterable<PickChatEntity> iterable2, int i, IGetDataCallback<Chat> iGetDataCallback) {
        ArrayList arrayList = new ArrayList();
        for (String str2 : iterable) {
            arrayList.add(str2);
        }
        ArrayList arrayList2 = new ArrayList();
        for (PickChatEntity pickChatEntity : iterable2) {
            arrayList2.add(pickChatEntity);
        }
        List<PickEntities> a = ModelParserPickChatEntity.m222170a((Collection<? extends PickChatEntity>) arrayList2);
        if (CollectionUtils.isEmpty(arrayList)) {
            List<String> b = ModelParserPickChatEntity.m222173b(arrayList2);
            if (CollectionUtils.isNotEmpty(b)) {
                arrayList.addAll(b);
            }
        }
        SdkSender.asynSendRequestNonWrap(Command.DELETE_CHAT_CHATTERS, new DeleteChatChattersRequest.C17396a().mo61053a(str).mo61054a(arrayList).mo61057b(a).mo61052a(new DeleteChatChattersRequest.DeleteChatChatterOption(Boolean.valueOf(i == 2))), iGetDataCallback, $$Lambda$b$g33VA0tyQcIbzgwU7lWb1okI214.INSTANCE);
    }

    @Override // com.ss.android.lark.chat.api.service.IChatService
    /* renamed from: a */
    public void mo121029a(List<String> list, String str, IGetDataCallback<Map<String, Boolean>> iGetDataCallback) {
        SdkSender.asynSendRequestNonWrap(Command.CHECK_CHATTERS_IN_CHAT, new CheckChattersInChatRequest.C17322a().mo60828a(str).mo60829a(list), iGetDataCallback, $$Lambda$b$AgZFfRYxdGZ_wdv68vqTpkWYrCU.INSTANCE);
    }

    @Override // com.ss.android.lark.chat.api.service.IChatService
    /* renamed from: b */
    public void mo121043b(List<GroupRecallEntity> list, String str, final IGetDataCallback<List<GroupRecallEntity>> iGetDataCallback) {
        final HashMap hashMap = new HashMap(list.size());
        for (GroupRecallEntity groupRecallEntity : list) {
            hashMap.put(groupRecallEntity.mo124690b(), groupRecallEntity);
        }
        CheckWithdrawPickEntitiesInChatRequest.C49578a aVar = new CheckWithdrawPickEntitiesInChatRequest.C49578a();
        aVar.f124193a = str;
        aVar.f124194b = ModelParserPickChatEntity.m222171a((List<? extends PickChatEntity>) list);
        com.ss.android.lark.pb.improto.Command command = com.ss.android.lark.pb.improto.Command.CHECK_WITHDRAW_PICK_ENTITIES_IN_CHAT;
        AnonymousClass36 r6 = new IGetDataCallback<CheckWithdrawPickEntitiesInChatResponse>() {
            /* class com.ss.android.lark.chat.api.service.p1600b.C32821b.AnonymousClass36 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                iGetDataCallback.onError(errorResult);
            }

            /* renamed from: a */
            public void onSuccess(CheckWithdrawPickEntitiesInChatResponse checkWithdrawPickEntitiesInChatResponse) {
                for (Map.Entry<String, Boolean> entry : checkWithdrawPickEntitiesInChatResponse.mallow_withdraw.entrySet()) {
                    if (!entry.getValue().booleanValue()) {
                        hashMap.remove(entry.getKey());
                    }
                }
                iGetDataCallback.onSuccess(new ArrayList(hashMap.values()));
            }
        };
        ProtoAdapter<CheckWithdrawPickEntitiesInChatResponse> protoAdapter = CheckWithdrawPickEntitiesInChatResponse.ADAPTER;
        protoAdapter.getClass();
        SdkSender.sendPassThroughRequest(command, aVar, r6, new SdkSender.IParser() {
            /* class com.ss.android.lark.chat.api.service.p1600b.$$Lambda$OaSDaLGkZuaDuOVZtT8wccnbP8U */

            @Override // com.ss.android.lark.sdk.SdkSender.IParser
            public final Object parse(byte[] bArr) {
                return (CheckWithdrawPickEntitiesInChatResponse) ProtoAdapter.this.decode(bArr);
            }
        });
    }

    @Override // com.ss.android.lark.chat.api.service.IChatService
    /* renamed from: a */
    public void mo121016a(String str, String str2, Iterable<String> iterable, IGetDataCallback<Chat> iGetDataCallback) {
        ArrayList arrayList = new ArrayList();
        for (String str3 : iterable) {
            arrayList.add(str3);
        }
        SdkSender.asynSendRequestNonWrap(Command.DELETE_CHAT_CHATTERS, new DeleteChatChattersRequest.C17396a().mo61053a(str).mo61054a(arrayList).mo61056b(str2), iGetDataCallback, new SdkSender.IParser<Chat>() {
            /* class com.ss.android.lark.chat.api.service.p1600b.C32821b.AnonymousClass37 */

            /* renamed from: a */
            public Chat parse(byte[] bArr) {
                return null;
            }
        });
    }

    @Override // com.ss.android.lark.chat.api.service.IChatService
    /* renamed from: a */
    public void mo121007a(String str, Iterable<String> iterable, IGetDataCallback<Chat> iGetDataCallback) {
        ArrayList arrayList = new ArrayList();
        for (String str2 : iterable) {
            arrayList.add(str2);
        }
        SdkSender.asynSendRequestNonWrap(Command.ADD_CHAT_CHATTERS, new AddChatChattersRequest.C17282a().mo60728a(str).mo60729a(arrayList).mo60727a(AddChatChattersRequest.Type.INVITATION), iGetDataCallback, new SdkSender.IParser<Chat>() {
            /* class com.ss.android.lark.chat.api.service.p1600b.C32821b.C328232 */

            /* renamed from: a */
            public Chat parse(byte[] bArr) throws IOException {
                return null;
            }
        });
    }

    @Override // com.ss.android.lark.chat.api.service.IChatService
    /* renamed from: a */
    public void mo121021a(String str, List<PickChatEntity> list, IGetDataCallback<Chat> iGetDataCallback) {
        AddChatChattersRequest.C17282a aVar = new AddChatChattersRequest.C17282a();
        List<String> b = ModelParserPickChatEntity.m222173b(list);
        aVar.mo60728a(str).mo60729a(b).mo60732b(ModelParserPickChatEntity.m222170a((Collection<? extends PickChatEntity>) list)).mo60727a(AddChatChattersRequest.Type.INVITATION);
        SdkSender.asynSendRequestNonWrap(Command.ADD_CHAT_CHATTERS, aVar, iGetDataCallback, $$Lambda$b$9kYpKzgg4LBDbCyHCZNhS3z7MmQ.INSTANCE);
    }

    @Override // com.ss.android.lark.chat.api.service.IChatService
    /* renamed from: a */
    public void mo121024a(String str, final boolean z, IGetDataCallback<ChatSetting> iGetDataCallback) {
        final long currentTimeMillis = System.currentTimeMillis() / 1000;
        SdkSender.asynSendRequestNonWrap(Command.UPDATE_CHAT, new UpdateChatRequest.C18137a().mo62912a(str).mo62910a(Boolean.valueOf(z)), iGetDataCallback, new SdkSender.IParser<ChatSetting>() {
            /* class com.ss.android.lark.chat.api.service.p1600b.C32821b.C328243 */

            /* renamed from: a */
            public ChatSetting parse(byte[] bArr) throws IOException {
                UpdateChatResponse decode = UpdateChatResponse.ADAPTER.decode(bArr);
                C14928Entity entity = decode.entity;
                Chat a = C57310e.m222079a(entity.chats.get(decode.chat_id), entity.mail_setting);
                return C57310e.m222081a(a.getId(), z, currentTimeMillis, a.isInBox());
            }
        });
    }

    @Override // com.ss.android.lark.chat.api.service.IChatService
    /* renamed from: a */
    public void mo120992a(String str, int i, IGetDataCallback<Chat> iGetDataCallback) {
        SdkSender.asynSendRequestNonWrap(Command.UPDATE_CHAT, new UpdateChatRequest.C18137a().mo62912a(str).mo62911a(Integer.valueOf(i)), iGetDataCallback, new SdkSender.IParser<Chat>() {
            /* class com.ss.android.lark.chat.api.service.p1600b.C32821b.C328254 */

            /* renamed from: a */
            public Chat parse(byte[] bArr) throws IOException {
                UpdateChatResponse decode = UpdateChatResponse.ADAPTER.decode(bArr);
                C14928Entity entity = decode.entity;
                return C57310e.m222079a(entity.chats.get(decode.chat_id), entity.mail_setting);
            }
        });
    }

    @Override // com.ss.android.lark.chat.api.service.IChatService
    /* renamed from: b */
    public void mo121039b(String str, String str2, IGetDataCallback<Chat> iGetDataCallback) {
        m126126a(new UpdateChatRequest.C18137a().mo62912a(str).mo62918c(str2), iGetDataCallback);
    }

    @Override // com.ss.android.lark.chat.api.service.IChatService
    /* renamed from: b */
    public void mo121041b(String str, boolean z, IGetDataCallback<Chat> iGetDataCallback) {
        if (C26256ah.m95012a(str, 0) != 0) {
            m126126a(new UpdateChatRequest.C18137a().mo62912a(str).mo62915b(Boolean.valueOf(z)), iGetDataCallback);
        } else if (iGetDataCallback != null) {
            iGetDataCallback.onError(new ErrorResult("lChatId == 0, getChatId " + str));
        }
    }

    @Override // com.ss.android.lark.chat.api.service.IChatService
    /* renamed from: b */
    public void mo121042b(List<String> list, IGetDataCallback<Map<String, ChatSetting>> iGetDataCallback) {
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (String str : list) {
                arrayList.add(str);
            }
            SdkSender.asynSendRequestNonWrap(Command.MGET_CHATS, new MGetChatsRequest.C17799a().mo62061a(arrayList), iGetDataCallback, new SdkSender.IParser<Map<String, ChatSetting>>() {
                /* class com.ss.android.lark.chat.api.service.p1600b.C32821b.C328265 */

                /* renamed from: a */
                public Map<String, ChatSetting> parse(byte[] bArr) throws IOException {
                    C14928Entity entity = MGetChatsResponse.ADAPTER.decode(bArr).entity;
                    HashMap hashMap = new HashMap();
                    C32821b.m126128a(entity.chats, hashMap);
                    return hashMap;
                }
            });
        }
    }

    @Override // com.ss.android.lark.chat.api.service.IChatService
    /* renamed from: a */
    public void mo120993a(String str, int i, boolean z, IGetDataCallback<ChatQRCodeTokenResponse> iGetDataCallback) {
        SdkSender.sendPassThroughRequest(com.ss.android.lark.pb.improto.Command.PULL_CHAT_QRCODE_TOKEN, new PullChatQRCodeTokenRequest.C49596a().mo172920a(str).mo172919a(Integer.valueOf(i)).mo172918a(Boolean.valueOf(z)), iGetDataCallback, new SdkSender.IParser<ChatQRCodeTokenResponse>() {
            /* class com.ss.android.lark.chat.api.service.p1600b.C32821b.AnonymousClass10 */

            /* renamed from: a */
            public ChatQRCodeTokenResponse parse(byte[] bArr) throws IOException {
                PullChatQRCodeTokenResponse decode = PullChatQRCodeTokenResponse.ADAPTER.decode(bArr);
                return new ChatQRCodeTokenResponse(decode.mtoken, decode.mshared_url, decode.mexpire_time.longValue(), decode.mis_unlimited.booleanValue());
            }
        });
    }

    @Override // com.ss.android.lark.chat.api.service.IChatService
    /* renamed from: a */
    public void mo121017a(String str, String str2, String str3, IGetDataCallback<Chat> iGetDataCallback) {
        SdkSender.asynSendRequestNonWrap(Command.ADD_CHAT_CHATTERS, new AddChatChattersRequest.C17282a().mo60728a(str).mo60734d(str2).mo60731b(str3).mo60727a(AddChatChattersRequest.Type.QRCODE), iGetDataCallback, new SdkSender.IParser<Chat>() {
            /* class com.ss.android.lark.chat.api.service.p1600b.C32821b.AnonymousClass15 */

            /* renamed from: a */
            public Chat parse(byte[] bArr) throws IOException {
                AddChatChattersResponse decode = AddChatChattersResponse.ADAPTER.decode(bArr);
                C14928Entity entity = decode.entity;
                if (entity == null) {
                    return null;
                }
                return C57310e.m222078a(entity.chats.get(decode.chat_id));
            }
        });
    }

    @Override // com.ss.android.lark.chat.api.service.IChatService
    /* renamed from: a */
    public Map<String, Chat> mo120991a(List<String> list) {
        HashMap hashMap = new HashMap();
        if (CollectionUtils.isEmpty(list)) {
            return hashMap;
        }
        SDKSendUtils.m133260a();
        Map<String, Chat> map = (Map) SdkSender.syncSend(Command.MGET_CHATS, new MGetChatsRequest.C17799a().mo62061a(list), $$Lambda$b$LLBcYxlhMXtvJc6zLXUuOSYQ2qQ.INSTANCE);
        return map == null ? new HashMap() : map;
    }

    @Override // com.ss.android.lark.chat.api.service.IChatService
    /* renamed from: b */
    public boolean mo121044b(Chat chat) {
        return chat != null && chat.getRole() == Chat.Role.MEMBER;
    }

    @Override // com.ss.android.lark.chat.api.service.IChatService
    /* renamed from: a */
    public ChatChatterResponse mo120988a(String str, String str2, int i, boolean z, int i2) {
        GetChatChattersRequest.C17506a b = new GetChatChattersRequest.C17506a().mo61329a(str).mo61332b(Integer.valueOf(i2));
        b.mo61327a(Boolean.valueOf(z));
        if (!TextUtils.isEmpty(str2)) {
            b.mo61334c(str2);
        }
        if (i > 0) {
            b.mo61328a(Integer.valueOf(i));
        }
        ChatChatterResponse aVar = (ChatChatterResponse) SdkSender.syncSend(Command.GET_CHAT_CHATTERS, b, new SdkSender.IParser(str) {
            /* class com.ss.android.lark.chat.api.service.p1600b.$$Lambda$b$F_u3P6dqvtqTkLz4FnYERbJB1_k */
            public final /* synthetic */ String f$1;

            {
                this.f$1 = r2;
            }

            @Override // com.ss.android.lark.sdk.SdkSender.IParser
            public final Object parse(byte[] bArr) {
                return C32821b.this.m126146i(this.f$1, bArr);
            }
        });
        return aVar != null ? aVar : new ChatChatterResponse();
    }

    @Override // com.ss.android.lark.chat.api.service.IChatService
    /* renamed from: a */
    public ChatChatterResponse mo120987a(String str, String str2, int i, int i2, boolean z, int i3) {
        GetChatChattersRequest.C17506a b = new GetChatChattersRequest.C17506a().mo61329a(str).mo61332b(Integer.valueOf(i3));
        b.mo61327a(Boolean.valueOf(z));
        b.mo61326a(GetChatChattersRequest.Condition.fromValue(i2));
        if (!TextUtils.isEmpty(str2)) {
            b.mo61334c(str2);
        }
        if (i > 0) {
            b.mo61328a(Integer.valueOf(i));
        }
        ChatChatterResponse aVar = (ChatChatterResponse) SdkSender.syncSend(Command.GET_CHAT_CHATTERS, b, new SdkSender.IParser(str) {
            /* class com.ss.android.lark.chat.api.service.p1600b.$$Lambda$b$qGQA7cUVdZAJtVVkmbbT44eLzVo */
            public final /* synthetic */ String f$1;

            {
                this.f$1 = r2;
            }

            @Override // com.ss.android.lark.sdk.SdkSender.IParser
            public final Object parse(byte[] bArr) {
                return C32821b.this.m126143h(this.f$1, bArr);
            }
        });
        return aVar != null ? aVar : new ChatChatterResponse();
    }

    @Override // com.ss.android.lark.chat.api.service.IChatService
    /* renamed from: a */
    public void mo121010a(String str, String str2, int i, boolean z, int i2, IGetDataCallback<ChatChatterResponse> iGetDataCallback, int i3) {
        GetChatChattersRequest.C17506a b = new GetChatChattersRequest.C17506a().mo61329a(str).mo61332b(Integer.valueOf(i3));
        if (z) {
            b.mo61331b((Boolean) true);
        } else {
            b.mo61327a((Boolean) true);
        }
        if (!TextUtils.isEmpty(str2)) {
            b.mo61334c(str2);
        }
        if (i > 0) {
            b.mo61328a(Integer.valueOf(i));
        }
        b.mo61326a(GetChatChattersRequest.Condition.fromValue(i2));
        SdkSender.asynSendRequestNonWrap(Command.GET_CHAT_CHATTERS, b, iGetDataCallback, new SdkSender.IParser(str) {
            /* class com.ss.android.lark.chat.api.service.p1600b.$$Lambda$b$sAodMG7oUxu339XAH8uMVMd6kSE */
            public final /* synthetic */ String f$1;

            {
                this.f$1 = r2;
            }

            @Override // com.ss.android.lark.sdk.SdkSender.IParser
            public final Object parse(byte[] bArr) {
                return C32821b.this.m126141g(this.f$1, bArr);
            }
        });
    }

    @Override // com.ss.android.lark.chat.api.service.IChatService
    /* renamed from: a */
    public void mo121011a(String str, String str2, int i, boolean z, IGetDataCallback<ChatChatterResponse> iGetDataCallback, int i2) {
        GetChatChattersRequest.C17506a b = new GetChatChattersRequest.C17506a().mo61329a(str).mo61332b(Integer.valueOf(i2));
        if (z) {
            b.mo61331b((Boolean) true);
        } else {
            b.mo61327a((Boolean) true);
        }
        if (!TextUtils.isEmpty(str2)) {
            b.mo61334c(str2);
        }
        if (i > 0) {
            b.mo61328a(Integer.valueOf(i));
        }
        SdkSender.asynSendRequestNonWrap(Command.GET_CHAT_CHATTERS, b, iGetDataCallback, new SdkSender.IParser(str) {
            /* class com.ss.android.lark.chat.api.service.p1600b.$$Lambda$b$qjMwWK4UxTtkp4ay8cwGg3e6wg */
            public final /* synthetic */ String f$1;

            {
                this.f$1 = r2;
            }

            @Override // com.ss.android.lark.sdk.SdkSender.IParser
            public final Object parse(byte[] bArr) {
                return C32821b.this.m126139f(this.f$1, bArr);
            }
        });
    }

    @Override // com.ss.android.lark.chat.api.service.IChatService
    /* renamed from: a */
    public void mo121020a(String str, String str2, boolean z, IGetDataCallback<ChatChatterResponse> iGetDataCallback, int i) {
        GetChatChattersRequest.C17506a b = new GetChatChattersRequest.C17506a().mo61329a(str).mo61332b(Integer.valueOf(i));
        b.mo61327a(Boolean.valueOf(z));
        b.mo61333b(str2);
        SdkSender.asynSendRequestNonWrap(Command.GET_CHAT_CHATTERS, b, iGetDataCallback, new SdkSender.IParser(str) {
            /* class com.ss.android.lark.chat.api.service.p1600b.$$Lambda$b$qJ3t2sOI9NndMOisTn74wR4aPM */
            public final /* synthetic */ String f$1;

            {
                this.f$1 = r2;
            }

            @Override // com.ss.android.lark.sdk.SdkSender.IParser
            public final Object parse(byte[] bArr) {
                return C32821b.this.m126137e(this.f$1, bArr);
            }
        });
    }

    @Override // com.ss.android.lark.chat.api.service.IChatService
    /* renamed from: a */
    public void mo121019a(String str, String str2, boolean z, int i, IGetDataCallback<ChatChatterResponse> iGetDataCallback, int i2) {
        GetChatChattersRequest.C17506a b = new GetChatChattersRequest.C17506a().mo61329a(str).mo61332b(Integer.valueOf(i2));
        b.mo61327a(Boolean.valueOf(z));
        b.mo61333b(str2);
        b.mo61326a(GetChatChattersRequest.Condition.fromValue(i));
        SdkSender.asynSendRequestNonWrap(Command.GET_CHAT_CHATTERS, b, iGetDataCallback, new SdkSender.IParser(str) {
            /* class com.ss.android.lark.chat.api.service.p1600b.$$Lambda$b$upkf2uLGfmq7TWr8Xy_CT36jX0 */
            public final /* synthetic */ String f$1;

            {
                this.f$1 = r2;
            }

            @Override // com.ss.android.lark.sdk.SdkSender.IParser
            public final Object parse(byte[] bArr) {
                return C32821b.this.m126135d(this.f$1, bArr);
            }
        });
    }

    @Override // com.ss.android.lark.chat.api.service.IChatService
    /* renamed from: a */
    public void mo121018a(String str, String str2, String str3, boolean z, IGetDataCallback<C36870f> iGetDataCallback) {
        GetMentionChatChattersRequest.C17605a aVar = new GetMentionChatChattersRequest.C17605a();
        aVar.mo61590a(str).mo61592b(str2).mo61589a(Boolean.valueOf(z));
        SdkSender.asynSendRequestNonWrap(Command.GET_MENTION_CHAT_CHATTERS, aVar, str3, iGetDataCallback, new SdkSender.IParser(str3, str) {
            /* class com.ss.android.lark.chat.api.service.p1600b.$$Lambda$b$kgCTxLghsVhTUMQkwR_ZvYWZcPM */
            public final /* synthetic */ String f$1;
            public final /* synthetic */ String f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            @Override // com.ss.android.lark.sdk.SdkSender.IParser
            public final Object parse(byte[] bArr) {
                return C32821b.this.m126131b(this.f$1, this.f$2, bArr);
            }
        });
    }

    @Override // com.ss.android.lark.chat.api.service.IChatService
    /* renamed from: a */
    public C36870f mo120989a(String str, String str2, String str3, boolean z) {
        GetMentionChatChattersRequest.C17605a aVar = new GetMentionChatChattersRequest.C17605a();
        aVar.mo61590a(str).mo61592b(str2).mo61589a(Boolean.valueOf(z));
        return (C36870f) SdkSender.sendRequest(Command.GET_MENTION_CHAT_CHATTERS, aVar, str3, new SdkSender.IParser(str3, str) {
            /* class com.ss.android.lark.chat.api.service.p1600b.$$Lambda$b$1FiT8rdZXRd8tTrAg2CWsSEeTpM */
            public final /* synthetic */ String f$1;
            public final /* synthetic */ String f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            @Override // com.ss.android.lark.sdk.SdkSender.IParser
            public final Object parse(byte[] bArr) {
                return C32821b.this.m126123a(this.f$1, this.f$2, bArr);
            }
        });
    }

    @Override // com.ss.android.lark.chat.api.service.IChatService
    /* renamed from: a */
    public void mo121013a(final String str, String str2, ImageHistoryResponse.Direction direction, List<ImageHistoryResponse.ResourceType> list, int i, IGetDataCallback<ImageHistoryResponse> iGetDataCallback) {
        GetChatResourcesRequest.C18224a a = new GetChatResourcesRequest.C18224a().mo63170a(str).mo63168a(GetChatResourcesRequest.Direction.fromValue(direction.getNumber())).mo63169a(Integer.valueOf(i));
        if (!CollectionUtils.isEmpty(m126145h(list))) {
            a.mo63171a(m126145h(list));
        }
        if (!TextUtils.isEmpty(str2)) {
            a.mo63173b(str2);
        }
        SdkSender.asynSendRequestNonWrap(Command.GET_CHAT_RESOURCES, a, iGetDataCallback, new SdkSender.IParser<ImageHistoryResponse>() {
            /* class com.ss.android.lark.chat.api.service.p1600b.C32821b.AnonymousClass20 */

            /* renamed from: a */
            public ImageHistoryResponse parse(byte[] bArr) throws IOException {
                return C57310e.m222074a(GetChatResourcesResponse.ADAPTER.decode(bArr), str);
            }
        });
    }

    @Override // com.ss.android.lark.chat.api.service.IChatService
    /* renamed from: a */
    public void mo121001a(String str, Chat.MessagePosition messagePosition, IGetDataCallback<Chat> iGetDataCallback) {
        m126126a(new UpdateChatRequest.C18137a().mo62912a(str).mo62903a(Chat.MessagePosition.Enum.fromValue(messagePosition.getNumber())), iGetDataCallback);
    }

    @Override // com.ss.android.lark.chat.api.service.IChatService
    /* renamed from: a */
    public void mo120996a(String str, Chat.AddMemberPermission addMemberPermission, Chat.ShareCardPermission shareCardPermission, IGetDataCallback<com.ss.android.lark.chat.entity.chat.Chat> iGetDataCallback) {
        m126126a(new UpdateChatRequest.C18137a().mo62912a(str).mo62898a(Chat.AddMemberPermission.Enum.fromValue(addMemberPermission.getNumber())).mo62906a(Chat.ShareCardPermission.Enum.fromValue(shareCardPermission.getNumber())), iGetDataCallback);
    }

    @Override // com.ss.android.lark.chat.api.service.IChatService
    /* renamed from: a */
    public void mo120997a(String str, Chat.AtAllPermission atAllPermission, IGetDataCallback<com.ss.android.lark.chat.entity.chat.Chat> iGetDataCallback) {
        m126126a(new UpdateChatRequest.C18137a().mo62912a(str).mo62900a(Chat.AtAllPermission.Enum.fromValue(atAllPermission.getNumber())), iGetDataCallback);
    }

    @Override // com.ss.android.lark.chat.api.service.IChatService
    /* renamed from: a */
    public void mo121004a(String str, Chat.SystemMessageVisible systemMessageVisible, IGetDataCallback<com.ss.android.lark.chat.entity.chat.Chat> iGetDataCallback) {
        m126126a(new UpdateChatRequest.C18137a().mo62912a(str).mo62907a(Chat.SystemMessageVisible.Enum.fromValue(systemMessageVisible.getNumber())), iGetDataCallback);
    }

    @Override // com.ss.android.lark.chat.api.service.IChatService
    /* renamed from: a */
    public void mo120998a(String str, Chat.BuzzPermissionSetting buzzPermissionSetting, IGetDataCallback<com.ss.android.lark.chat.entity.chat.Chat> iGetDataCallback) {
        m126126a(new UpdateChatRequest.C18137a().mo62912a(str).mo62901a(Chat.CreateUrgentSetting.Enum.fromValue(buzzPermissionSetting.getNumber())), iGetDataCallback);
    }

    @Override // com.ss.android.lark.chat.api.service.IChatService
    /* renamed from: a */
    public void mo120999a(String str, Chat.CreateVideoConferenceSetting createVideoConferenceSetting, IGetDataCallback<com.ss.android.lark.chat.entity.chat.Chat> iGetDataCallback) {
        m126126a(new UpdateChatRequest.C18137a().mo62912a(str).mo62902a(Chat.CreateVideoConferenceSetting.Enum.fromValue(createVideoConferenceSetting.getNumber())), iGetDataCallback);
    }

    @Override // com.ss.android.lark.chat.api.service.IChatService
    /* renamed from: a */
    public void mo121002a(String str, Chat.PinPermissionSetting pinPermissionSetting, IGetDataCallback<com.ss.android.lark.chat.entity.chat.Chat> iGetDataCallback) {
        m126126a(new UpdateChatRequest.C18137a().mo62912a(str).mo62905a(Chat.PinPermissionSetting.Enum.fromValue(pinPermissionSetting.getNumber())), iGetDataCallback);
    }

    @Override // com.ss.android.lark.chat.api.service.IChatService
    /* renamed from: a */
    public void mo121005a(String str, Chat.TopNoticePermissionSetting topNoticePermissionSetting, IGetDataCallback<com.ss.android.lark.chat.entity.chat.Chat> iGetDataCallback) {
        m126126a(new UpdateChatRequest.C18137a().mo62912a(str).mo62908a(Chat.TopNoticePermissionSetting.Enum.fromValue(topNoticePermissionSetting.getNumber())), iGetDataCallback);
    }

    @Override // com.ss.android.lark.chat.api.service.IChatService
    /* renamed from: a */
    public void mo121000a(String str, Chat.GroupMailSendPermissionType groupMailSendPermissionType, IGetDataCallback<com.ss.android.lark.chat.entity.chat.Chat> iGetDataCallback) {
        UpdateChatRequest.C18137a a = new UpdateChatRequest.C18137a().mo62912a(str);
        a.mo62909a(ChatMailSetting.SendPermission.fromValue(groupMailSendPermissionType.getNumber()));
        m126126a(a, iGetDataCallback);
    }

    @Override // com.ss.android.lark.chat.api.service.IChatService
    /* renamed from: a */
    public void mo121026a(String str, boolean z, Chat.GroupMailSendPermissionType groupMailSendPermissionType, IGetDataCallback<com.ss.android.lark.chat.entity.chat.Chat> iGetDataCallback) {
        UpdateChatRequest.C18137a a = new UpdateChatRequest.C18137a().mo62912a(str);
        a.mo62923f(Boolean.valueOf(z)).mo62909a(ChatMailSetting.SendPermission.fromValue(groupMailSendPermissionType.getNumber()));
        m126126a(a, iGetDataCallback);
    }

    @Override // com.ss.android.lark.chat.api.service.IChatService
    /* renamed from: a */
    public void mo121025a(String str, boolean z, Chat.AddMemberPermission addMemberPermission, Chat.ShareCardPermission shareCardPermission, IGetDataCallback<com.ss.android.lark.chat.entity.chat.Chat> iGetDataCallback) {
        UpdateChatRequest.C18137a a = new UpdateChatRequest.C18137a().mo62912a(str);
        a.mo62921e(Boolean.valueOf(z));
        if (addMemberPermission != null) {
            a.mo62898a(Chat.AddMemberPermission.Enum.fromValue(addMemberPermission.getNumber()));
        }
        if (shareCardPermission != null) {
            a.mo62906a(Chat.ShareCardPermission.Enum.fromValue(shareCardPermission.getNumber()));
        }
        m126126a(a, iGetDataCallback);
    }

    @Override // com.ss.android.lark.chat.api.service.IChatService
    /* renamed from: a */
    public void mo121030a(List<String> list, List<String> list2) {
        SubscribeChatEventRequest.C18085a aVar = new SubscribeChatEventRequest.C18085a();
        if (CollectionUtils.isNotEmpty(list)) {
            aVar.mo62759a(list);
        }
        if (CollectionUtils.isNotEmpty(list2)) {
            aVar.mo62761b(list2);
        }
        SdkSender.asynSendRequestNonWrap(Command.SUBSCRIBE_CHAT_EVENT, aVar, new IGetDataCallback<String>() {
            /* class com.ss.android.lark.chat.api.service.p1600b.C32821b.AnonymousClass26 */

            /* renamed from: a */
            public void onSuccess(String str) {
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
            }
        }, new SdkSender.IParser<String>() {
            /* class com.ss.android.lark.chat.api.service.p1600b.C32821b.AnonymousClass27 */

            /* renamed from: a */
            public String parse(byte[] bArr) throws IOException {
                SubscribeChatEventResponse.ADAPTER.decode(bArr);
                return "";
            }
        });
    }

    @Override // com.ss.android.lark.chat.api.service.IChatService
    /* renamed from: a */
    public void mo120995a(String str, AddChatChatterApply.Ways ways, List<String> list, String str2, String str3, String str4, IGetDataCallback<Boolean> iGetDataCallback) {
        SdkSender.asynSendRequestNonWrap(Command.CREATE_ADD_CHAT_CHATTER_APPLY, new CreateAddChatChatterApplyRequest.C17332a().mo60852a(str).mo60851a(AddChatChatterApply.Ways.fromValue(ways.getValue())).mo60855b(str2).mo60853a(list).mo60856c(str3).mo60857d(str4), iGetDataCallback, $$Lambda$b$BNT_PLhBwkKZmDQHmFsjCvJy68g.INSTANCE);
    }

    @Override // com.ss.android.lark.chat.api.service.IChatService
    /* renamed from: a */
    public void mo121014a(String str, String str2, AddChatChatterApply.Status status, IGetDataCallback<Boolean> iGetDataCallback) {
        SdkSender.asynSendRequestNonWrap(Command.UPDATE_ADD_CHAT_CHATTER_APPLY, new UpdateAddChatChatterApplyRequest.C18129a().mo62873a(str).mo62875b(str2).mo62871a(AddChatChatterApply.Status.fromValue(status.getValue())), iGetDataCallback, $$Lambda$b$fTHq02rppgdwYPUwuqX82TVILDI.INSTANCE);
    }

    @Override // com.ss.android.lark.chat.api.service.IChatService
    /* renamed from: a */
    public String mo120990a(com.ss.android.lark.chat.entity.chat.Chat chat) {
        if (chat.getType() != Chat.Type.P2P) {
            return null;
        }
        if (!TextUtils.isEmpty(chat.getP2pChatterId())) {
            return chat.getP2pChatterId();
        }
        String[] split = chat.getKey().split(":");
        String a = this.f84265b.mo134394a();
        for (String str : Arrays.asList(split)) {
            if (!str.equals(a)) {
                return str;
            }
        }
        return split[0];
    }

    @Override // com.ss.android.lark.chat.api.service.IChatService
    /* renamed from: a */
    public void mo121003a(String str, Chat.PostType postType, List<String> list, List<String> list2, IGetDataCallback<Void> iGetDataCallback) {
        UpdateChatPostUsersRequest.C18135a aVar = new UpdateChatPostUsersRequest.C18135a();
        aVar.mo62889a(str).mo62888a(Chat.PostType.fromValue(postType.getNumber()));
        if (list != null) {
            aVar.mo62890a(list);
        }
        if (list2 != null) {
            aVar.mo62892b(list2);
        }
        SdkSender.asynSendRequestNonWrap(Command.UPDATE_CHAT_POST_USERS, aVar, iGetDataCallback, $$Lambda$b$XfZmETvNt2vQzfQDgX7LsrhIVI.INSTANCE);
    }

    /* renamed from: b */
    public void mo121134b(String str, String str2) {
        CreateOrDeleteChatLastDraftIdRequest.C17364a aVar = new CreateOrDeleteChatLastDraftIdRequest.C17364a();
        aVar.mo60951a(str).mo60953b(str2);
        SdkSender.asynSendRequestNonWrap(Command.CREATE_OR_DELETE_CHAT_LAST_DRAFT_ID, aVar, null, $$Lambda$b$xOFA4lIaCi6tcbFk3EqLXgtmoBY.INSTANCE);
    }

    /* renamed from: a */
    public void mo121133a(String str, int i, int i2, IGetDataCallback<Void> iGetDataCallback) {
        CreateChatLastReadPositionRequest.C17336a aVar = new CreateChatLastReadPositionRequest.C17336a();
        aVar.mo60867a(str).mo60866a(Integer.valueOf(i)).mo60865a(Float.valueOf((float) i2));
        SdkSender.asynSendRequestNonWrap(Command.CREATE_CHAT_LAST_READ_POSITION, aVar, iGetDataCallback, $$Lambda$b$NIu2uEySFBAsQTVD84jtMM7bTo.INSTANCE);
    }

    @Override // com.ss.android.lark.chat.api.service.IChatService
    /* renamed from: a */
    public void mo121009a(String str, String str2, int i, IGetDataCallback<PullChatShareHistoryResponse> iGetDataCallback) {
        PullChatShareHistoryRequest.C17857a aVar = new PullChatShareHistoryRequest.C17857a();
        aVar.mo62227a(str).mo62226a(Integer.valueOf(i)).mo62229b(str2);
        SdkSender.asynSendRequestNonWrap(Command.PULL_CHAT_SHARE_HISTORY, aVar, iGetDataCallback, $$Lambda$b$40gy0Sz124k3LIPZOGWquwHuCXk.INSTANCE);
    }

    @Override // com.ss.android.lark.chat.api.service.IChatService
    /* renamed from: a */
    public void mo121028a(List<String> list, ChatShareInfo.ShareStatus shareStatus, IGetDataCallback<Boolean> iGetDataCallback) {
        PatchChatShareStatusRequest.C17819a aVar = new PatchChatShareStatusRequest.C17819a();
        aVar.mo62119a(list).mo62118a(ChatShareInfo.ShareStatus.fromValue(shareStatus.getValue()));
        SdkSender.asynSendRequestNonWrap(Command.PATCH_CHAT_SHARE_STATUS, aVar, iGetDataCallback, $$Lambda$b$Zref5_GUwhKGOmXa8bm0gvYPRQk.INSTANCE);
    }

    @Override // com.ss.android.lark.chat.api.service.IChatService
    /* renamed from: b */
    public void mo121038b(String str, String str2, int i, IGetDataCallback<GetChatJoinLeaveHistoryResponse> iGetDataCallback) {
        GetChatJoinLeaveHistoryRequest.C17512a aVar = new GetChatJoinLeaveHistoryRequest.C17512a();
        aVar.mo61347a(str).mo61349b(str2).mo61346a(Integer.valueOf(i));
        SdkSender.asynSendRequestNonWrap(Command.GET_CHAT_JOIN_LEAVE_HISTORY, aVar, iGetDataCallback, $$Lambda$b$Hkv8vxGy_O_6SirbvoUzOy7uKr0.INSTANCE);
    }

    @Override // com.ss.android.lark.chat.api.service.IChatService
    /* renamed from: a */
    public void mo121015a(String str, String str2, AvatarMeta avatarMeta, IGetDataCallback<com.ss.android.lark.chat.entity.chat.Chat> iGetDataCallback) {
        com.bytedance.lark.pb.basic.v1.AvatarMeta a = new AvatarMeta.C14696a().mo54117a(avatarMeta.getText()).mo54115a(AvatarMeta.Type.fromValue(avatarMeta.getType().getValue())).mo54116a(Integer.valueOf(avatarMeta.getColor())).mo54119b(Integer.valueOf(avatarMeta.getBorderColor())).mo54120c(Integer.valueOf(avatarMeta.getBackgroundColor())).mo54121d(Integer.valueOf(avatarMeta.getCenterColor())).build();
        UpdateChatRequest.C18137a aVar = new UpdateChatRequest.C18137a();
        aVar.mo62912a(str).mo62896a(a).mo62924f(str2);
        m126126a(aVar, iGetDataCallback);
    }

    @Override // com.ss.android.lark.chat.api.service.IChatService
    /* renamed from: b */
    public void mo121040b(String str, List<String> list, final IGetDataCallback<Map<String, Boolean>> iGetDataCallback) {
        EduJoinChatPreCheckRequest.C49632a aVar = new EduJoinChatPreCheckRequest.C49632a();
        aVar.f124277a = str;
        aVar.f124278b = list;
        com.ss.android.lark.pb.improto.Command command = com.ss.android.lark.pb.improto.Command.EDU_JOIN_CHAT_PRE_CHECK;
        AnonymousClass32 r4 = new IGetDataCallback<EduJoinChatPreCheckResponse>() {
            /* class com.ss.android.lark.chat.api.service.p1600b.C32821b.AnonymousClass32 */

            /* renamed from: a */
            public void onSuccess(EduJoinChatPreCheckResponse eduJoinChatPreCheckResponse) {
                iGetDataCallback.onSuccess(eduJoinChatPreCheckResponse.muser_ids);
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                iGetDataCallback.onError(errorResult);
            }
        };
        ProtoAdapter<EduJoinChatPreCheckResponse> protoAdapter = EduJoinChatPreCheckResponse.ADAPTER;
        protoAdapter.getClass();
        SdkSender.sendPassThroughRequest(command, aVar, r4, new SdkSender.IParser() {
            /* class com.ss.android.lark.chat.api.service.p1600b.$$Lambda$Me9YGWZGx5fpTXjWB_vq_5IXgwg */

            @Override // com.ss.android.lark.sdk.SdkSender.IParser
            public final Object parse(byte[] bArr) {
                return (EduJoinChatPreCheckResponse) ProtoAdapter.this.decode(bArr);
            }
        });
    }

    @Override // com.ss.android.lark.chat.api.service.IChatService
    /* renamed from: a */
    public void mo121023a(String str, List<String> list, List<String> list2, IGetDataCallback<Boolean> iGetDataCallback) {
        SdkSender.asynSendRequestNonWrap(Command.PATCH_CHAT_ADMIN_USERS, new PatchChatAdminUsersRequest.C17817a().mo62111a(str).mo62112a(list).mo62114b(list2), iGetDataCallback, $$Lambda$b$TCfoZVBlpv6GpnpwSwUGEmbQYro.INSTANCE);
    }

    private C32821b() {
        this.f84265b = C29990c.m110930b().mo134515N();
        this.f84264a = C32835d.m126323c();
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public static /* synthetic */ Boolean m126155p(byte[] bArr) throws IOException {
        UpdateAddChatChatterApplyResponse.ADAPTER.decode(bArr);
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public static /* synthetic */ Boolean m126156q(byte[] bArr) throws IOException {
        UpdateAddChatChatterApplyResponse.ADAPTER.decode(bArr);
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: r */
    public static /* synthetic */ Boolean m126158r(byte[] bArr) throws IOException {
        CreateAddChatChatterApplyResponse.ADAPTER.decode(bArr);
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: t */
    public static /* synthetic */ String m126160t(byte[] bArr) throws IOException {
        PullChatShareTokenInfoResponse decode = PullChatShareTokenInfoResponse.ADAPTER.decode(bArr);
        if (decode != null) {
            return decode.minviter_id;
        }
        return "";
    }

    /* access modifiers changed from: private */
    /* renamed from: v */
    public static /* synthetic */ Map m126162v(byte[] bArr) throws IOException {
        return CheckChattersInChatResponse.ADAPTER.decode(bArr).chatters;
    }

    /* renamed from: a */
    public static Map<String, com.ss.android.lark.chat.entity.chat.Chat> m126125a(byte[] bArr) throws IOException {
        MGetChatsResponse decode = MGetChatsResponse.ADAPTER.decode(bArr);
        C14928Entity entity = decode.entity;
        m126128a(entity.chats, new HashMap());
        return C57310e.m222090a(entity.chats, decode.chat_option_info, entity.mail_setting);
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static /* synthetic */ ChatChatterKickInfo m126138e(byte[] bArr) throws IOException {
        GetChatChatterKickResponse decode = GetChatChatterKickResponse.ADAPTER.decode(bArr);
        if (decode.chat_chatter_kick_info != null) {
            return new ChatChatterKickInfo(decode.chat_chatter_kick_info.chat_id, decode.chat_chatter_kick_info.reason);
        }
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public static /* synthetic */ ChatInactiveMemberResponse m126142g(byte[] bArr) throws IOException {
        GetDepartmentInactiveInfoResponse decode = GetDepartmentInactiveInfoResponse.ADAPTER.decode(bArr);
        return new ChatInactiveMemberResponse(decode.has_invite_permission.booleanValue(), decode.inactive_member_count.intValue());
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public static /* synthetic */ GetChatJoinLeaveHistoryResponse m126144h(byte[] bArr) throws IOException {
        com.bytedance.lark.pb.im.v1.GetChatJoinLeaveHistoryResponse decode = com.bytedance.lark.pb.im.v1.GetChatJoinLeaveHistoryResponse.ADAPTER.decode(bArr);
        return new GetChatJoinLeaveHistoryResponse(C57310e.m222092b(decode.chatter_history), decode.has_more.booleanValue(), decode.next_cursor);
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public static /* synthetic */ PullChatShareHistoryResponse m126148j(byte[] bArr) throws IOException {
        com.bytedance.lark.pb.im.v1.PullChatShareHistoryResponse decode = com.bytedance.lark.pb.im.v1.PullChatShareHistoryResponse.ADAPTER.decode(bArr);
        return new PullChatShareHistoryResponse(C57313f.m222097a(decode.share_history), decode.has_more, decode.next_cursor);
    }

    /* access modifiers changed from: private */
    /* renamed from: s */
    public static /* synthetic */ Map m126159s(byte[] bArr) throws IOException {
        MGetChatsResponse decode = MGetChatsResponse.ADAPTER.decode(bArr);
        C14928Entity entity = decode.entity;
        return C57310e.m222090a(entity.chats, decode.chat_option_info, entity.mail_setting);
    }

    @Override // com.ss.android.lark.chat.api.service.IChatService
    /* renamed from: c */
    public C36871a mo121045c(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        C36871a k = mo121140k(str);
        if (k == null || k.mo136109a() == null) {
            return mo121142m(str);
        }
        return k;
    }

    @Override // com.ss.android.lark.chat.api.service.IChatService
    /* renamed from: d */
    public int mo121052d(String str) {
        if (mo121056e(str) != null) {
            try {
                return mo121141l(str);
            } catch (Throwable unused) {
            }
        }
        return 0;
    }

    @Override // com.ss.android.lark.chat.api.service.IChatService
    /* renamed from: f */
    public ChatSetting mo121060f(String str) {
        return mo121135d(Collections.singletonList(str)).get(str);
    }

    @Override // com.ss.android.lark.chat.api.service.IChatService
    /* renamed from: i */
    public GetChatLimitInfoResponse mo121072i(String str) {
        GetChatLimitInfoRequest.C17516a a = new GetChatLimitInfoRequest.C17516a().mo61357a(str);
        Command command = Command.GET_CHAT_LIMIT_INFO;
        ProtoAdapter<GetChatLimitInfoResponse> protoAdapter = GetChatLimitInfoResponse.ADAPTER;
        protoAdapter.getClass();
        return (GetChatLimitInfoResponse) SdkSender.syncSend(command, a, new SdkSender.IParser() {
            /* class com.ss.android.lark.chat.api.service.p1600b.$$Lambda$U80xdbqkkmHG6b3owfau9TJdCqQ */

            @Override // com.ss.android.lark.sdk.SdkSender.IParser
            public final Object parse(byte[] bArr) {
                return (GetChatLimitInfoResponse) ProtoAdapter.this.decode(bArr);
            }
        });
    }

    /* renamed from: l */
    public int mo121141l(String str) {
        Integer num = mo121137e(Collections.singletonList(str)).get(str);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    /* renamed from: n */
    public void mo121143n(String str) {
        SdkSender.asynSendRequestNonWrap(Command.ENTER_CHAT, new EnterChatRequest.C15448a().mo55998a(str), null, $$Lambda$b$7VSW8ghdEm9sjTXMkb6JE2YhRw.INSTANCE);
    }

    /* renamed from: o */
    public void mo121145o(String str) {
        SdkSender.asynSendRequestNonWrap(Command.EXIT_CHAT, new ExitChatRequest.C15450a().mo56003a(str), null, $$Lambda$b$0v_PaTQvELQaichkcKrxa1mQ30Q.INSTANCE);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public com.ss.android.lark.chat.entity.chat.Chat m126130b(byte[] bArr) throws IOException {
        Iterator<com.ss.android.lark.chat.entity.chat.Chat> it = C57310e.m222093b(CreateChatResponse.ADAPTER.decode(bArr).entity.chats).values().iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static /* synthetic */ List m126136d(byte[] bArr) throws IOException {
        GetChatAdminUsersResponse decode = GetChatAdminUsersResponse.ADAPTER.decode(bArr);
        List<String> list = decode.admin_users;
        Map<String, Chatter> a = C57314g.m222104a(decode.entity);
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            arrayList.add(a.get(str));
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public static /* synthetic */ C36869c m126140f(byte[] bArr) throws IOException {
        GetDepartmentInvitationUrlResponse decode = GetDepartmentInvitationUrlResponse.ADAPTER.decode(bArr);
        if (decode == null || decode.class_path_name == null) {
            return new C36869c();
        }
        return new C36869c(decode.class_path_name.tenant_name, decode.class_path_name.campus_name, decode.class_path_name.grade_name, decode.class_path_name.class_name);
    }

    /* renamed from: h */
    private List<ChatResourceType> m126145h(List<ImageHistoryResponse.ResourceType> list) {
        ArrayList arrayList = new ArrayList();
        if (CollectionUtils.isEmpty(list)) {
            return arrayList;
        }
        for (ImageHistoryResponse.ResourceType resourceType : list) {
            arrayList.add(ChatResourceType.fromValue(resourceType.getNumber()));
        }
        return arrayList;
    }

    @Override // com.ss.android.lark.chat.api.service.IChatService
    /* renamed from: c */
    public Map<String, com.ss.android.lark.chat.entity.chat.Chat> mo121046c(List<String> list) {
        SDKSendUtils.m133260a();
        Map<String, com.ss.android.lark.chat.entity.chat.Chat> map = (Map) SdkSender.sendRequest(Command.MGET_CHATS, new MGetChatsRequest.C17799a().mo62061a(list).mo62060a((Boolean) true).mo62059a(SyncDataStrategy.FORCE_SERVER), new SdkSender.IParser<Map<String, com.ss.android.lark.chat.entity.chat.Chat>>() {
            /* class com.ss.android.lark.chat.api.service.p1600b.C32821b.AnonymousClass23 */

            /* renamed from: a */
            public Map<String, com.ss.android.lark.chat.entity.chat.Chat> parse(byte[] bArr) throws IOException {
                return C32821b.m126125a(bArr);
            }
        });
        if (map == null) {
            return new HashMap();
        }
        return map;
    }

    @Override // com.ss.android.lark.chat.api.service.IChatService
    /* renamed from: e */
    public com.ss.android.lark.chat.entity.chat.Chat mo121056e(String str) {
        return mo120991a(Collections.singletonList(str)).get(str);
    }

    @Override // com.ss.android.lark.chat.api.service.IChatService
    /* renamed from: g */
    public com.ss.android.lark.chat.entity.chat.Chat mo121064g(final String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return (com.ss.android.lark.chat.entity.chat.Chat) SdkSender.syncSend(Command.GET_P2P_CHATS_BY_CHATTER_IDS, new GetP2PChatsByChatterIdsRequest.C17657a().mo61717a(Collections.singletonList(str)), new SdkSender.IParser<com.ss.android.lark.chat.entity.chat.Chat>() {
            /* class com.ss.android.lark.chat.api.service.p1600b.C32821b.AnonymousClass18 */

            /* renamed from: a */
            public com.ss.android.lark.chat.entity.chat.Chat parse(byte[] bArr) throws IOException {
                Map<String, com.bytedance.lark.pb.basic.v1.Chat> map = GetP2PChatsByChatterIdsResponse.ADAPTER.decode(bArr).chatter_id2chat;
                if (map.keySet().contains(str)) {
                    return C57310e.m222078a(map.get(str));
                }
                return null;
            }
        });
    }

    @Override // com.ss.android.lark.chat.api.service.IChatService
    /* renamed from: j */
    public ChatChatterKickInfo mo121074j(String str) {
        return (ChatChatterKickInfo) SdkSender.sendRequest(Command.GET_CHAT_CHATTER_KICK_INFO, new GetChatChatterKickRequest.C17498a().mo61306a(str), (int) ParticipantRepo.f117150c, $$Lambda$b$barIwN4AX8IuemAQ97IZ5M0kIME.INSTANCE);
    }

    /* renamed from: k */
    public C36871a mo121140k(String str) {
        List<String> singletonList = Collections.singletonList(str);
        if (CollectionUtils.isEmpty(singletonList)) {
            return null;
        }
        SDKSendUtils.m133260a();
        return (C36871a) SdkSender.syncSend(Command.MGET_CHATS, new MGetChatsRequest.C17799a().mo62061a(singletonList), new SdkSender.IParser(str) {
            /* class com.ss.android.lark.chat.api.service.p1600b.$$Lambda$b$Ek5o1woBKOFpMbrepZ5zdiWk4D0 */
            public final /* synthetic */ String f$0;

            {
                this.f$0 = r1;
            }

            @Override // com.ss.android.lark.sdk.SdkSender.IParser
            public final Object parse(byte[] bArr) {
                return C32821b.m126124a(this.f$0, bArr);
            }
        });
    }

    /* renamed from: m */
    public C36871a mo121142m(final String str) {
        SDKSendUtils.m133260a();
        C36871a aVar = (C36871a) SdkSender.sendRequest(Command.MGET_CHATS, new MGetChatsRequest.C17799a().mo62061a(Collections.singletonList(str)).mo62060a((Boolean) true), new SdkSender.IParser<C36871a>() {
            /* class com.ss.android.lark.chat.api.service.p1600b.C32821b.AnonymousClass22 */

            /* renamed from: a */
            public C36871a parse(byte[] bArr) throws IOException {
                return C32821b.m126124a(str, bArr);
            }
        });
        if (aVar == null) {
            return new C36871a();
        }
        return aVar;
    }

    /* renamed from: d */
    public Map<String, ChatSetting> mo121135d(List<String> list) {
        HashMap hashMap = new HashMap();
        if (CollectionUtils.isEmpty(list)) {
            return hashMap;
        }
        SDKSendUtils.m133260a();
        return (Map) SdkSender.syncSend(Command.MGET_CHATS, new MGetChatsRequest.C17799a().mo62061a(list), new SdkSender.IParser<Map<String, ChatSetting>>() {
            /* class com.ss.android.lark.chat.api.service.p1600b.C32821b.AnonymousClass17 */

            /* renamed from: a */
            public Map<String, ChatSetting> parse(byte[] bArr) throws IOException {
                return C57310e.m222088a(MGetChatsResponse.ADAPTER.decode(bArr).entity.chats);
            }
        });
    }

    /* renamed from: e */
    public Map<String, Integer> mo121137e(List<String> list) {
        HashMap hashMap = new HashMap();
        if (CollectionUtils.isEmpty(list)) {
            return hashMap;
        }
        Map<String, com.ss.android.lark.chat.entity.chat.Chat> g = mo121139g(list);
        HashMap hashMap2 = new HashMap();
        for (com.ss.android.lark.chat.entity.chat.Chat chat : g.values()) {
            hashMap2.put(chat.getId(), Integer.valueOf(chat.getLastMessagePosition()));
        }
        return hashMap2;
    }

    /* renamed from: f */
    public Map<String, Message> mo121138f(List<String> list) {
        HashMap hashMap = new HashMap();
        if (CollectionUtils.isEmpty(list)) {
            return hashMap;
        }
        Map<String, com.ss.android.lark.chat.entity.chat.Chat> g = mo121139g(list);
        HashMap hashMap2 = new HashMap();
        for (com.ss.android.lark.chat.entity.chat.Chat chat : g.values()) {
            hashMap2.put(chat.getId(), chat.getLastMessageId());
        }
        Map<String, Message> c = C32848e.m126401b().mo121108c(new ArrayList(hashMap2.values()));
        HashMap hashMap3 = new HashMap();
        for (String str : hashMap2.keySet()) {
            Message message = c.get((String) hashMap2.get(str));
            if (message != null) {
                hashMap3.put(str, message);
            }
        }
        return hashMap3;
    }

    /* renamed from: g */
    public Map<String, com.ss.android.lark.chat.entity.chat.Chat> mo121139g(List<String> list) {
        HashMap hashMap = new HashMap();
        if (CollectionUtils.isEmpty(list)) {
            return hashMap;
        }
        SDKSendUtils.m133260a();
        return (Map) SdkSender.syncSend(Command.MGET_CHATS, new MGetChatsRequest.C17799a().mo62061a(list), new SdkSender.IParser<Map<String, com.ss.android.lark.chat.entity.chat.Chat>>() {
            /* class com.ss.android.lark.chat.api.service.p1600b.C32821b.AnonymousClass29 */

            /* renamed from: a */
            public Map<String, com.ss.android.lark.chat.entity.chat.Chat> parse(byte[] bArr) throws IOException {
                MGetChatsResponse decode = MGetChatsResponse.ADAPTER.decode(bArr);
                return C57310e.m222090a(decode.entity.chats, decode.chat_option_info, decode.entity.mail_setting);
            }
        });
    }

    @Override // com.ss.android.lark.chat.api.service.IChatService
    /* renamed from: h */
    public Message mo121068h(String str) {
        return mo121138f(Collections.singletonList(str)).get(str);
    }

    @Override // com.ss.android.lark.chat.api.service.IChatService
    /* renamed from: b */
    public com.ss.android.lark.chat.entity.chat.Chat mo121032b(String str) {
        SDKSendUtils.m133260a();
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Map<String, com.ss.android.lark.chat.entity.chat.Chat> c = mo121046c(Collections.singletonList(str));
        if (!CollectionUtils.isEmpty(c)) {
            return c.get(str);
        }
        return null;
    }

    @Override // com.ss.android.lark.chat.api.service.IChatService
    /* renamed from: b */
    public Map<String, com.ss.android.lark.chat.entity.chat.Chat> mo121033b(List<String> list) {
        Map<String, com.ss.android.lark.chat.entity.chat.Chat> c;
        ArrayList arrayList = new ArrayList(list);
        Map<String, com.ss.android.lark.chat.entity.chat.Chat> a = mo120991a(arrayList);
        arrayList.removeAll(a.keySet());
        if (arrayList.isEmpty() || (c = mo121046c(arrayList)) == null) {
            return a;
        }
        a.putAll(c);
        return a;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ ChatChatterResponse m126135d(String str, byte[] bArr) throws IOException {
        return m126121a(str, GetChatChattersResponse.ADAPTER.decode(bArr));
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ ChatChatterResponse m126137e(String str, byte[] bArr) throws IOException {
        return m126121a(str, GetChatChattersResponse.ADAPTER.decode(bArr));
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public /* synthetic */ ChatChatterResponse m126139f(String str, byte[] bArr) throws IOException {
        return m126121a(str, GetChatChattersResponse.ADAPTER.decode(bArr));
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public /* synthetic */ ChatChatterResponse m126141g(String str, byte[] bArr) throws IOException {
        return m126121a(str, GetChatChattersResponse.ADAPTER.decode(bArr));
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public /* synthetic */ ChatChatterResponse m126143h(String str, byte[] bArr) throws IOException {
        return m126121a(str, GetChatChattersResponse.ADAPTER.decode(bArr));
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public /* synthetic */ ChatChatterResponse m126146i(String str, byte[] bArr) throws IOException {
        return m126121a(str, GetChatChattersResponse.ADAPTER.decode(bArr));
    }

    @Override // com.ss.android.lark.chat.api.service.IChatService
    /* renamed from: c */
    public void mo121051c(List<String> list, final IGetDataCallback<Boolean> iGetDataCallback) {
        mo121136d(list, new IGetDataCallback<Map<String, com.ss.android.lark.chat.entity.chat.Chat>>() {
            /* class com.ss.android.lark.chat.api.service.p1600b.C32821b.AnonymousClass13 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                iGetDataCallback.onError(errorResult);
            }

            /* renamed from: a */
            public void onSuccess(Map<String, com.ss.android.lark.chat.entity.chat.Chat> map) {
                boolean z;
                Iterator<String> it = map.keySet().iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (map.get(it.next()).getRole().equals(Chat.Role.MEMBER)) {
                            z = true;
                            break;
                        }
                    } else {
                        z = false;
                        break;
                    }
                }
                iGetDataCallback.onSuccess(Boolean.valueOf(z));
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public /* synthetic */ void m126157q(String str, final IGetDataCallback iGetDataCallback) {
        com.ss.android.lark.chat.entity.chat.Chat g = mo121064g(str);
        if (g != null) {
            iGetDataCallback.onSuccess(g);
        } else {
            mo121031a(false, str, (ChatBundle.C29592c) null, (IGetDataCallback<com.ss.android.lark.chat.entity.chat.Chat>) new IGetDataCallback<com.ss.android.lark.chat.entity.chat.Chat>() {
                /* class com.ss.android.lark.chat.api.service.p1600b.C32821b.AnonymousClass12 */

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    iGetDataCallback.onError(errorResult);
                }

                /* renamed from: a */
                public void onSuccess(com.ss.android.lark.chat.entity.chat.Chat chat) {
                    if (chat == null) {
                        iGetDataCallback.onError(new ErrorResult("putChat failed: chat is null"));
                    } else {
                        iGetDataCallback.onSuccess(chat);
                    }
                }
            });
        }
    }

    @Override // com.ss.android.lark.chat.api.service.IChatService
    /* renamed from: k */
    public void mo121076k(String str, IGetDataCallback<ChatInactiveMemberResponse> iGetDataCallback) {
        SdkSender.asynSendRequestNonWrap(Command.GET_DEPARTMENT_INACTIVE_INFO, new GetDepartmentInactiveInfoRequest.C16228a().mo58156b(str), iGetDataCallback, $$Lambda$b$xOcBR_A4aI4lOHvkPviGhfQh46k.INSTANCE);
    }

    @Override // com.ss.android.lark.chat.api.service.IChatService
    /* renamed from: m */
    public void mo121078m(String str, IGetDataCallback<List<Chatter>> iGetDataCallback) {
        SdkSender.asynSendRequestNonWrap(Command.GET_CHAT_ADMIN_USERS, new GetChatAdminUsersRequest.C17482a().mo61267a(str).mo61266a(SyncDataStrategy.FORCE_SERVER), iGetDataCallback, $$Lambda$b$GjXy8M9UfSpCGnk51PD8_vPsKKs.INSTANCE);
    }

    /* renamed from: p */
    public void mo121147p(String str, IGetDataCallback<UrlPreviewEntity> iGetDataCallback) {
        SdkSender.asynSendRequestNonWrap(Command.GENERATE_URL_PREVIEW_ENTITY, new GenerateUrlPreviewEntityRequest.C17458a().mo61202a(str), iGetDataCallback, new SdkSender.IParser<UrlPreviewEntity>() {
            /* class com.ss.android.lark.chat.api.service.p1600b.C32821b.AnonymousClass25 */

            /* renamed from: a */
            public UrlPreviewEntity parse(byte[] bArr) throws IOException {
                com.bytedance.lark.pb.basic.v1.UrlPreviewEntity urlPreviewEntity = GenerateUrlPreviewEntityResponse.ADAPTER.decode(bArr).preview_entity;
                if (urlPreviewEntity != null) {
                    return ModelParserPreview.m222175a(urlPreviewEntity);
                }
                return null;
            }
        });
    }

    /* renamed from: a */
    public static C36871a m126124a(String str, byte[] bArr) throws IOException {
        MGetChatsResponse decode = MGetChatsResponse.ADAPTER.decode(bArr);
        C14928Entity entity = decode.entity;
        m126128a(entity.chats, new HashMap());
        return C57310e.m222083a(str, entity.chats, entity.open_apps, C57314g.m222100a(entity, str).mo124894a(), decode.chat_option_info);
    }

    @Override // com.ss.android.lark.chat.api.service.IChatService
    /* renamed from: i */
    public void mo121073i(String str, IGetDataCallback<List<ChatChatter>> iGetDataCallback) {
        GetChatPostUsersRequest.C17538a aVar = new GetChatPostUsersRequest.C17538a();
        aVar.mo61419a(str);
        SdkSender.asynSendRequestNonWrap(Command.GET_CHAT_POST_USERS, aVar, iGetDataCallback, new SdkSender.IParser(str) {
            /* class com.ss.android.lark.chat.api.service.p1600b.$$Lambda$b$1cDvGfIL1Ky3kgEuaXa4Ntn0zVM */
            public final /* synthetic */ String f$0;

            {
                this.f$0 = r1;
            }

            @Override // com.ss.android.lark.sdk.SdkSender.IParser
            public final Object parse(byte[] bArr) {
                return C32821b.m126132b(this.f$0, bArr);
            }
        });
    }

    @Override // com.ss.android.lark.chat.api.service.IChatService
    /* renamed from: l */
    public void mo121077l(String str, IGetDataCallback<C36869c> iGetDataCallback) {
        GetDepartmentInvitationUrlRequest.C16232a aVar = new GetDepartmentInvitationUrlRequest.C16232a();
        aVar.mo58167b(str).mo58164a(InvitationSource.HOME_SCHOOL_CHAT);
        SdkSender.asynSendRequestNonWrap(Command.GET_DEPARTMENT_INVITATION_URL, aVar, iGetDataCallback, $$Lambda$b$e0C6X_oHf6VaM3MR3iOVYF0R1IM.INSTANCE);
    }

    /* renamed from: n */
    public void mo121144n(String str, IGetDataCallback<String> iGetDataCallback) {
        SdkSender.sendPassThroughRequest(com.ss.android.lark.pb.improto.Command.PULL_CHAT_SHARE_TOKEN_INFO, new PullChatShareTokenInfoRequest.C49600a().mo172929a(str), iGetDataCallback, $$Lambda$b$iPR_HaF79ekqa_g3TFTn8NOOhA.INSTANCE);
    }

    /* renamed from: o */
    public void mo121146o(final String str, IGetDataCallback<DocResult> iGetDataCallback) {
        SdkSender.asynSendRequestNonWrap(Command.GET_DOC_BY_URLS, new GetDocByURLsRequest.C19251a().mo65697a(Collections.singletonList(str)), iGetDataCallback, new SdkSender.IParser<DocResult>() {
            /* class com.ss.android.lark.chat.api.service.p1600b.C32821b.AnonymousClass24 */

            /* renamed from: a */
            public DocResult parse(byte[] bArr) throws IOException {
                Doc doc = GetDocByURLsResponse.ADAPTER.decode(bArr).docs.get(str);
                if (doc == null) {
                    return null;
                }
                com.ss.android.lark.doc.entity.Doc doc2 = new com.ss.android.lark.doc.entity.Doc();
                doc2.setName(doc.name);
                doc2.setAbstract(doc.abstract_);
                doc2.setOwnerName(doc.owner_name);
                doc2.setUrl(doc.url);
                doc2.setDocType(DocType.forNumber(doc.type.getValue()));
                doc2.setCreateTime(doc.create_time.longValue());
                doc2.setUpdateTime(doc.update_time.longValue());
                doc2.setIconKey(doc.icon_key);
                Icon icon = new Icon();
                if (doc.icon != null) {
                    icon.setValue(doc.icon.value);
                    icon.setType(doc.icon.type.getValue());
                }
                doc2.setIcon(icon);
                return new DocResult(doc2, null);
            }
        });
    }

    /* renamed from: a */
    private ChatChatterResponse m126121a(String str, GetChatChattersResponse getChatChattersResponse) {
        String str2;
        if (getChatChattersResponse == null) {
            return new ChatChatterResponse();
        }
        ArrayList arrayList = new ArrayList();
        C33982a a = C57314g.m222100a(getChatChattersResponse.entity, str);
        HashMap hashMap = new HashMap(32);
        for (GetChatChattersResponse.LetterMap letterMap : getChatChattersResponse.letter_maps) {
            m126127a(str, letterMap.chatter_ids, arrayList, a);
            for (String str3 : letterMap.chatter_ids) {
                hashMap.put(str3, letterMap.letter);
            }
        }
        m126127a(str, getChatChattersResponse.chatter_ids, arrayList, a);
        if (TextUtils.isEmpty(getChatChattersResponse.cursor)) {
            str2 = null;
        } else {
            str2 = getChatChattersResponse.cursor;
        }
        return new ChatChatterResponse(getChatChattersResponse.member_count.intValue(), getChatChattersResponse.show_search.booleanValue(), str2, arrayList, hashMap, new HashMap(getChatChattersResponse.chatter_id2department_name));
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static /* synthetic */ ChatApplyInfo m126133c(String str, byte[] bArr) throws IOException {
        GetAddChatChatterApplyResponse decode = GetAddChatChatterApplyResponse.ADAPTER.decode(bArr);
        ArrayList arrayList = new ArrayList();
        C33982a a = C57314g.m222100a(decode.entity, str);
        for (com.bytedance.lark.pb.basic.v1.AddChatChatterApply addChatChatterApply : decode.applies) {
            if (a.mo124893a(addChatChatterApply.invitee_id) != null) {
                arrayList.add(new com.ss.android.lark.chat.entity.chat.AddChatChatterApply(addChatChatterApply.reason, AddChatChatterApply.Status.Companion.mo124351a(addChatChatterApply.status.getValue()), AddChatChatterApply.Ways.Companion.mo124354a(addChatChatterApply.way.getValue()), a.mo124893a(addChatChatterApply.inviter_id), a.mo124893a(addChatChatterApply.invitee_id)));
            }
        }
        return new ChatApplyInfo(arrayList, decode.next_cursor, decode.has_more.booleanValue());
    }

    @Override // com.ss.android.lark.chat.api.service.IChatService
    /* renamed from: j */
    public void mo121075j(String str, IGetDataCallback<com.ss.android.lark.chat.entity.chat.AvatarMeta> iGetDataCallback) {
        GetChatAvatarMetaRequest.C17494a aVar = new GetChatAvatarMetaRequest.C17494a();
        aVar.mo61297a(str);
        SdkSender.asynSendRequestNonWrap(Command.GET_CHAT_AVATAR_META, aVar, iGetDataCallback, new SdkSender.IParser<com.ss.android.lark.chat.entity.chat.AvatarMeta>() {
            /* class com.ss.android.lark.chat.api.service.p1600b.C32821b.AnonymousClass30 */

            /* renamed from: a */
            public com.ss.android.lark.chat.entity.chat.AvatarMeta parse(byte[] bArr) throws IOException {
                return C57310e.m222076a(GetChatAvatarMetaResponse.ADAPTER.decode(bArr).avatar_meta);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ List m126132b(String str, byte[] bArr) throws IOException {
        GetChatPostUsersResponse decode = GetChatPostUsersResponse.ADAPTER.decode(bArr);
        ArrayList arrayList = new ArrayList(decode.user_ids.size());
        if (decode.entity != null) {
            C33982a a = C57314g.m222100a(decode.entity, str);
            for (String str2 : decode.user_ids) {
                arrayList.add(a.mo124892a(str, str2));
            }
        }
        return arrayList;
    }

    @Override // com.ss.android.lark.chat.api.service.IChatService
    /* renamed from: d */
    public void mo121053d(String str, IGetDataCallback<Boolean> iGetDataCallback) {
        SdkSender.asynSendRequestNonWrap(Command.DISABLE_CHAT_SHARED, new DisableChatSharedRequest.C17446a().mo61175a(str), iGetDataCallback, $$Lambda$b$S4gS0AU1PK12Ev9coCVk_yyj474.INSTANCE);
    }

    @Override // com.ss.android.lark.chat.api.service.IChatService
    /* renamed from: e */
    public void mo121057e(String str, IGetDataCallback<ChatQRCodeInfoResponse> iGetDataCallback) {
        GetChatQRCodeInfoRequest.C17542a aVar = new GetChatQRCodeInfoRequest.C17542a();
        if (!TextUtils.isEmpty(str)) {
            aVar.mo61428a(str);
            SdkSender.asynSendRequestNonWrap(Command.GET_CHAT_QRCODE_INFO, aVar, iGetDataCallback, new SdkSender.IParser<ChatQRCodeInfoResponse>() {
                /* class com.ss.android.lark.chat.api.service.p1600b.C32821b.C328287 */

                /* renamed from: a */
                public ChatQRCodeInfoResponse parse(byte[] bArr) throws IOException {
                    Map map;
                    GetChatQRCodeInfoResponse decode = GetChatQRCodeInfoResponse.ADAPTER.decode(bArr);
                    if (decode.entity == null) {
                        map = new HashMap();
                    } else {
                        map = C57310e.m222093b(decode.entity.chats);
                    }
                    com.ss.android.lark.chat.entity.chat.Chat chat = null;
                    if (!CollectionUtils.isEmpty(map) && !TextUtils.isEmpty(decode.chat_id)) {
                        chat = (com.ss.android.lark.chat.entity.chat.Chat) map.get(decode.chat_id);
                    }
                    return new ChatQRCodeInfoResponse(decode.already_in_chat.booleanValue(), chat, decode.inviter_id, decode.is_inviter_can_add_member.booleanValue(), decode.show_msg, decode.inviter_url);
                }
            });
        }
    }

    @Override // com.ss.android.lark.chat.api.service.IChatService
    /* renamed from: f */
    public void mo121061f(String str, IGetDataCallback<ChatLinkInfoResponse> iGetDataCallback) {
        GetChatLinkInfoRequest.C17520a aVar = new GetChatLinkInfoRequest.C17520a();
        aVar.mo61366a(str);
        SdkSender.asynSendRequestNonWrap(Command.GET_CHAT_SHARE_LINK_INFO, aVar, iGetDataCallback, new SdkSender.IParser<ChatLinkInfoResponse>() {
            /* class com.ss.android.lark.chat.api.service.p1600b.C32821b.C328309 */

            /* renamed from: a */
            public ChatLinkInfoResponse parse(byte[] bArr) throws IOException {
                return new ChatLinkInfoResponse(GetChatLinkInfoResponse.ADAPTER.decode(bArr));
            }
        });
    }

    @Override // com.ss.android.lark.chat.api.service.IChatService
    /* renamed from: g */
    public void mo121065g(String str, IGetDataCallback<com.ss.android.lark.chat.entity.chat.Chat> iGetDataCallback) {
        SendChatterViaLinkRequest.C18013a aVar = new SendChatterViaLinkRequest.C18013a();
        aVar.mo62567a(str);
        SdkSender.asynSendRequestNonWrap(Command.SEND_CHATTER_VIA_CHAT_LINK, aVar, iGetDataCallback, new SdkSender.IParser<com.ss.android.lark.chat.entity.chat.Chat>() {
            /* class com.ss.android.lark.chat.api.service.p1600b.C32821b.AnonymousClass16 */

            /* renamed from: a */
            public com.ss.android.lark.chat.entity.chat.Chat parse(byte[] bArr) throws IOException {
                SendChatterViaLinkResponse decode = SendChatterViaLinkResponse.ADAPTER.decode(bArr);
                return C57310e.m222078a(decode.entity.chats.get(decode.chat_id));
            }
        });
    }

    @Override // com.ss.android.lark.chat.api.service.IChatService
    /* renamed from: h */
    public void mo121069h(String str, IGetDataCallback<com.ss.android.lark.chat.entity.chat.Chat> iGetDataCallback) {
        m126126a(new UpdateChatRequest.C18137a().mo62912a(str).mo62917c((Boolean) true), iGetDataCallback);
    }

    /* renamed from: a */
    private void m126126a(UpdateChatRequest.C18137a aVar, IGetDataCallback<com.ss.android.lark.chat.entity.chat.Chat> iGetDataCallback) {
        SdkSender.asynSendRequestNonWrap(Command.UPDATE_CHAT, aVar, iGetDataCallback, new SdkSender.IParser<com.ss.android.lark.chat.entity.chat.Chat>() {
            /* class com.ss.android.lark.chat.api.service.p1600b.C32821b.AnonymousClass28 */

            /* renamed from: a */
            public com.ss.android.lark.chat.entity.chat.Chat parse(byte[] bArr) throws IOException {
                UpdateChatResponse decode = UpdateChatResponse.ADAPTER.decode(bArr);
                C14928Entity entity = decode.entity;
                return C57310e.m222079a(entity.chats.get(decode.chat_id), entity.mail_setting);
            }
        });
    }

    @Override // com.ss.android.lark.chat.api.service.IChatService
    /* renamed from: c */
    public void mo121048c(String str, IGetDataCallback<com.ss.android.lark.chat.entity.chat.Chat> iGetDataCallback) {
        if (TextUtils.isEmpty(str)) {
            iGetDataCallback.onError(new ErrorResult("chatterId is empty"));
        } else {
            C57865c.m224576a(new Runnable(str, iGetDataCallback) {
                /* class com.ss.android.lark.chat.api.service.p1600b.$$Lambda$b$WxkdPIdZJfiD9lfyFWD5E2x00I */
                public final /* synthetic */ String f$1;
                public final /* synthetic */ IGetDataCallback f$2;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                }

                public final void run() {
                    C32821b.this.m126157q(this.f$1, this.f$2);
                }
            });
        }
    }

    /* renamed from: a */
    public static void m126128a(Map<String, com.bytedance.lark.pb.basic.v1.Chat> map, Map<String, ChatSetting> map2) {
        for (String str : map.keySet()) {
            com.bytedance.lark.pb.basic.v1.Chat chat = map.get(str);
            ChatSetting chatSetting = new ChatSetting();
            chatSetting.setChatId(str);
            chatSetting.setUpdateTime(chat.update_time.longValue());
            chatSetting.setRemind(chat.is_remind.booleanValue());
            chatSetting.setInBox(chat.is_in_box.booleanValue());
            map2.put(str, chatSetting);
        }
    }

    /* renamed from: d */
    public void mo121136d(List<String> list, IGetDataCallback<Map<String, com.ss.android.lark.chat.entity.chat.Chat>> iGetDataCallback) {
        if (list != null) {
            SdkSender.asynSendRequestNonWrap(Command.MGET_CHATS, new MGetChatsRequest.C17799a().mo62061a(list).mo62060a((Boolean) true), iGetDataCallback, new SdkSender.IParser<Map<String, com.ss.android.lark.chat.entity.chat.Chat>>() {
                /* class com.ss.android.lark.chat.api.service.p1600b.C32821b.AnonymousClass31 */

                /* renamed from: a */
                public Map<String, com.ss.android.lark.chat.entity.chat.Chat> parse(byte[] bArr) throws IOException {
                    return C32821b.m126125a(bArr);
                }
            });
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ C36870f m126123a(String str, String str2, byte[] bArr) throws IOException {
        return m126122a(str, str2, GetMentionChatChattersResponse.ADAPTER.decode(bArr));
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ C36870f m126131b(String str, String str2, byte[] bArr) throws IOException {
        return m126122a(str, str2, GetMentionChatChattersResponse.ADAPTER.decode(bArr));
    }

    @Override // com.ss.android.lark.chat.api.service.IChatService
    /* renamed from: b */
    public void mo121037b(String str, Chat.SystemMessageVisible systemMessageVisible, IGetDataCallback<com.ss.android.lark.chat.entity.chat.Chat> iGetDataCallback) {
        m126126a(new UpdateChatRequest.C18137a().mo62912a(str).mo62914b(Chat.SystemMessageVisible.Enum.fromValue(systemMessageVisible.getNumber())), iGetDataCallback);
    }

    /* renamed from: b */
    private CreateChatRequest.C17340a m126129b(boolean z, String str, ChatBundle.C29592c cVar) {
        String a = this.f84265b.mo134394a();
        CreateChatRequest.C17340a a2 = new CreateChatRequest.C17340a().mo60878a(Chat.Type.P2P).mo60882a(CollectionUtils.asList(new String[]{str, a})).mo60880a(Boolean.valueOf(z)).mo60877a(Chat.ChatMode.DEFAULT);
        if (cVar != null) {
            a2.mo60879a(new CreateP2PChatSource.C17366a().mo60957a(ContactSource.fromValue(cVar.f74079a)).mo60961c(cVar.f74080b).mo60958a(cVar.f74081c).mo60960b(cVar.f74082d).build());
        }
        return a2;
    }

    /* renamed from: a */
    private C36870f m126122a(String str, String str2, GetMentionChatChattersResponse getMentionChatChattersResponse) {
        if (getMentionChatChattersResponse == null || getMentionChatChattersResponse.entity == null) {
            return new C36870f();
        }
        C33982a a = C57314g.m222100a(getMentionChatChattersResponse.entity, str2);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (String str3 : getMentionChatChattersResponse.wanted_mention_ids) {
            ChatChatter a2 = a.mo124892a(str2, str3);
            if (a2 != null) {
                arrayList.add(a2);
            }
        }
        for (String str4 : getMentionChatChattersResponse.in_chat_chatter_ids) {
            ChatChatter a3 = a.mo124892a(str2, str4);
            if (a3 != null) {
                arrayList2.add(a3);
            }
        }
        for (String str5 : getMentionChatChattersResponse.out_chat_chatter_ids) {
            ChatChatter a4 = a.mo124892a(str2, str5);
            if (a4 != null) {
                arrayList3.add(new ChatChatter(a4));
            }
        }
        return new C36870f(arrayList, arrayList2, arrayList3, getMentionChatChattersResponse.wanted_mention_tags, getMentionChatChattersResponse.show_search.booleanValue(), str);
    }

    @Override // com.ss.android.lark.chat.api.service.IChatService
    /* renamed from: c */
    public void mo121047c(String str, int i, IGetDataCallback<GetChatLinkTokenResponse> iGetDataCallback) {
        String str2;
        GetChatLinkTokenRequest.C17524a aVar = new GetChatLinkTokenRequest.C17524a();
        GetChatLinkTokenRequest.C17524a a = aVar.mo61376a(str).mo61375a(Integer.valueOf(i));
        if (C29990c.m110930b().mo134574b()) {
            str2 = "Lark";
        } else {
            str2 = "Feishu";
        }
        a.mo61378b(str2);
        SdkSender.asynSendRequestNonWrap(Command.GET_CHAT_LINK_TOKEN, aVar, iGetDataCallback, new SdkSender.IParser<GetChatLinkTokenResponse>() {
            /* class com.ss.android.lark.chat.api.service.p1600b.C32821b.C328298 */

            /* renamed from: a */
            public GetChatLinkTokenResponse parse(byte[] bArr) throws IOException {
                return GetChatLinkTokenResponse.ADAPTER.decode(bArr);
            }
        });
    }

    @Override // com.ss.android.lark.chat.api.service.IChatService
    /* renamed from: d */
    public void mo121054d(String str, String str2, IGetDataCallback<com.ss.android.lark.chat.entity.chat.Chat> iGetDataCallback) {
        if (C26256ah.m95012a(str, 0) != 0) {
            m126126a(new UpdateChatRequest.C18137a().mo62912a(str).mo62920d(str2), iGetDataCallback);
        } else if (iGetDataCallback != null) {
            iGetDataCallback.onError(new ErrorResult("lChatId == 0, getChatId " + str));
        }
    }

    @Override // com.ss.android.lark.chat.api.service.IChatService
    /* renamed from: e */
    public void mo121058e(String str, String str2, IGetDataCallback<com.ss.android.lark.chat.entity.chat.Chat> iGetDataCallback) {
        SdkSender.asynSendRequestNonWrap(Command.ADD_CHAT_CHATTERS, new AddChatChattersRequest.C17282a().mo60733c(str).mo60731b(str2).mo60727a(AddChatChattersRequest.Type.SHARE), iGetDataCallback, new SdkSender.IParser<com.ss.android.lark.chat.entity.chat.Chat>() {
            /* class com.ss.android.lark.chat.api.service.p1600b.C32821b.AnonymousClass14 */

            /* renamed from: a */
            public com.ss.android.lark.chat.entity.chat.Chat parse(byte[] bArr) throws IOException {
                com.ss.android.lark.chat.entity.chat.Chat chat;
                AddChatChattersResponse decode = AddChatChattersResponse.ADAPTER.decode(bArr);
                C14928Entity entity = decode.entity;
                if (entity != null) {
                    chat = C57310e.m222079a(entity.chats.get(decode.chat_id), entity.mail_setting);
                } else {
                    chat = new com.ss.android.lark.chat.entity.chat.Chat();
                }
                String str = decode.join_group_application_id;
                return chat;
            }
        });
    }

    @Override // com.ss.android.lark.chat.api.service.IChatService
    /* renamed from: f */
    public void mo121062f(String str, String str2, final IGetDataCallback<com.ss.android.lark.chat.entity.chat.Chat> iGetDataCallback) {
        com.ss.android.lark.chat.entity.chat.Chat g = mo121064g(str);
        if (g != null) {
            iGetDataCallback.onSuccess(g);
        } else {
            mo121031a(false, str, (ChatBundle.C29592c) null, (IGetDataCallback<com.ss.android.lark.chat.entity.chat.Chat>) new IGetDataCallback<com.ss.android.lark.chat.entity.chat.Chat>() {
                /* class com.ss.android.lark.chat.api.service.p1600b.C32821b.AnonymousClass19 */

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    iGetDataCallback.onError(errorResult);
                }

                /* renamed from: a */
                public void onSuccess(com.ss.android.lark.chat.entity.chat.Chat chat) {
                    if (chat != null) {
                        iGetDataCallback.onSuccess(chat);
                    } else {
                        iGetDataCallback.onError(new ErrorResult("chat is null"));
                    }
                }
            });
        }
    }

    @Override // com.ss.android.lark.chat.api.service.IChatService
    /* renamed from: g */
    public void mo121066g(String str, String str2, IGetDataCallback<com.ss.android.lark.chat.entity.chat.Chat> iGetDataCallback) {
        if (C26256ah.m95012a(str, 0) != 0) {
            m126126a(new UpdateChatRequest.C18137a().mo62912a(str).mo62924f(str2), iGetDataCallback);
        } else if (iGetDataCallback != null) {
            iGetDataCallback.onError(new ErrorResult("lChatId == 0, getChatId " + str));
        }
    }

    @Override // com.ss.android.lark.chat.api.service.IChatService
    /* renamed from: h */
    public void mo121070h(String str, String str2, IGetDataCallback<ChatApplyInfo> iGetDataCallback) {
        SdkSender.asynSendRequestNonWrap(Command.GET_ADD_CHAT_CHATTER_APPLY, new GetAddChatChatterApplyRequest.C17462a().mo61211a(str).mo61211a(str).mo61213b(str2), iGetDataCallback, new SdkSender.IParser(str) {
            /* class com.ss.android.lark.chat.api.service.p1600b.$$Lambda$b$9eHiH3VQS6gMInZUIAW9CcRrJA */
            public final /* synthetic */ String f$0;

            {
                this.f$0 = r1;
            }

            @Override // com.ss.android.lark.sdk.SdkSender.IParser
            public final Object parse(byte[] bArr) {
                return C32821b.m126133c(this.f$0, bArr);
            }
        });
    }

    @Override // com.ss.android.lark.chat.api.service.IChatService
    /* renamed from: c */
    public void mo121049c(String str, String str2, IGetDataCallback<com.ss.android.lark.chat.entity.chat.Chat> iGetDataCallback) {
        long a = C26256ah.m95012a(str, 0);
        long a2 = C26256ah.m95012a(str2, 0);
        if (a != 0 && a2 != 0) {
            m126126a(new UpdateChatRequest.C18137a().mo62912a(str).mo62922e(str2), iGetDataCallback);
        } else if (iGetDataCallback != null) {
            iGetDataCallback.onError(new ErrorResult("lChatId == 0 || lOwnerId == 0, " + str + " " + str2));
        }
    }

    @Override // com.ss.android.lark.chat.api.service.IChatService
    /* renamed from: d */
    public void mo121055d(String str, boolean z, IGetDataCallback<com.ss.android.lark.chat.entity.chat.Chat> iGetDataCallback) {
        UpdateChatRequest.C18137a a = new UpdateChatRequest.C18137a().mo62912a(str);
        a.mo62923f(Boolean.valueOf(z));
        m126126a(a, iGetDataCallback);
    }

    @Override // com.ss.android.lark.chat.api.service.IChatService
    /* renamed from: e */
    public void mo121059e(String str, boolean z, IGetDataCallback<com.ss.android.lark.chat.entity.chat.Chat> iGetDataCallback) {
        UpdateChatRequest.C18137a aVar = new UpdateChatRequest.C18137a();
        aVar.mo62912a(str).mo62919d(Boolean.valueOf(z));
        m126126a(aVar, iGetDataCallback);
    }

    @Override // com.ss.android.lark.chat.api.service.IChatService
    /* renamed from: f */
    public void mo121063f(String str, boolean z, IGetDataCallback<Boolean> iGetDataCallback) {
        SdkSender.asynSendRequestNonWrap(Command.UPDATE_ADD_CHAT_CHATTER_APPLY, new UpdateAddChatChatterApplyRequest.C18129a().mo62873a(str).mo62872a(Boolean.valueOf(z)), iGetDataCallback, $$Lambda$b$Ozl8wmugl2o9TGDpxEkFMPNggM.INSTANCE);
    }

    @Override // com.ss.android.lark.chat.api.service.IChatService
    /* renamed from: g */
    public void mo121067g(String str, boolean z, IGetDataCallback<com.ss.android.lark.chat.entity.chat.Chat> iGetDataCallback) {
        Chat.AddMemberApply.Enum r3;
        if (z) {
            r3 = Chat.AddMemberApply.Enum.NEED_APPLY;
        } else {
            r3 = Chat.AddMemberApply.Enum.NO_APPLY;
        }
        m126126a(new UpdateChatRequest.C18137a().mo62912a(str).mo62897a(r3), iGetDataCallback);
    }

    @Override // com.ss.android.lark.chat.api.service.IChatService
    /* renamed from: h */
    public void mo121071h(String str, boolean z, IGetDataCallback<com.ss.android.lark.chat.entity.chat.Chat> iGetDataCallback) {
        Chat.MessageVisibilitySetting.Enum r3;
        UpdateChatRequest.C18137a a = new UpdateChatRequest.C18137a().mo62912a(str);
        if (z) {
            r3 = Chat.MessageVisibilitySetting.Enum.ALL_MESSAGES;
        } else {
            r3 = Chat.MessageVisibilitySetting.Enum.ONLY_NEW_MESSAGES;
        }
        a.mo62904a(r3);
        m126126a(a, iGetDataCallback);
    }

    @Override // com.ss.android.lark.chat.api.service.IChatService
    /* renamed from: b */
    public void mo121034b(String str, int i, IGetDataCallback<ChatQRCodeTokenResponse> iGetDataCallback) {
        if (!TextUtils.isEmpty(str)) {
            GetChatQRCodeTokenRequest.C17546a aVar = new GetChatQRCodeTokenRequest.C17546a();
            aVar.mo61438a(str).mo61437a(Integer.valueOf(i));
            SdkSender.asynSendRequestNonWrap(Command.GET_CHAT_QRCODE_TOKEN, aVar, iGetDataCallback, new SdkSender.IParser<ChatQRCodeTokenResponse>() {
                /* class com.ss.android.lark.chat.api.service.p1600b.C32821b.C328276 */

                /* renamed from: a */
                public ChatQRCodeTokenResponse parse(byte[] bArr) throws IOException {
                    GetChatQRCodeTokenResponse decode = GetChatQRCodeTokenResponse.ADAPTER.decode(bArr);
                    return new ChatQRCodeTokenResponse(decode.token, decode.url, decode.expire_time.longValue());
                }
            });
        }
    }

    @Override // com.ss.android.lark.chat.api.service.IChatService
    /* renamed from: c */
    public void mo121050c(String str, boolean z, IGetDataCallback<com.ss.android.lark.chat.entity.chat.Chat> iGetDataCallback) {
        Chat.AnonymousSetting anonymousSetting;
        if (C26256ah.m95012a(str, 0) != 0) {
            if (z) {
                anonymousSetting = Chat.AnonymousSetting.ALLOWED;
            } else {
                anonymousSetting = Chat.AnonymousSetting.NOT_ALLOWED;
            }
            m126126a(new UpdateChatRequest.C18137a().mo62912a(str).mo62899a(Chat.AnonymousSetting.Enum.fromValue(anonymousSetting.getNumber())), iGetDataCallback);
        } else if (iGetDataCallback != null) {
            iGetDataCallback.onError(new ErrorResult("lChatId == 0, getChatId " + str));
        }
    }

    /* renamed from: a */
    private void m126127a(String str, List<String> list, List<ChatChatter> list2, C33982a aVar) {
        for (String str2 : list) {
            ChatChatter a = aVar.mo124892a(str, str2);
            if (a != null) {
                list2.add(a);
            } else {
                Log.m165383e("ChatService", "has no chatter entity, chatId: " + str + "  chatterId: " + str2);
            }
        }
    }

    @Override // com.ss.android.lark.chat.api.service.IChatService
    /* renamed from: b */
    public void mo121035b(String str, int i, boolean z, IGetDataCallback<ChatLinkTokenResponse> iGetDataCallback) {
        String str2;
        PullChatLinkTokenRequest.C49588a a = new PullChatLinkTokenRequest.C49588a().mo172898a(str).mo172897a(Integer.valueOf(i));
        if (C29990c.m110930b().mo134574b()) {
            str2 = "Lark";
        } else {
            str2 = "Feishu";
        }
        SdkSender.sendPassThroughRequest(com.ss.android.lark.pb.improto.Command.PULL_CHAT_LINK_TOKEN, a.mo172900b(str2).mo172896a(Boolean.valueOf(z)), iGetDataCallback, new SdkSender.IParser<ChatLinkTokenResponse>() {
            /* class com.ss.android.lark.chat.api.service.p1600b.C32821b.AnonymousClass11 */

            /* renamed from: a */
            public ChatLinkTokenResponse parse(byte[] bArr) throws IOException {
                PullChatLinkTokenResponse decode = PullChatLinkTokenResponse.ADAPTER.decode(bArr);
                return new ChatLinkTokenResponse(decode.mtoken, decode.mshared_url, decode.mkouLing, decode.mexpire_time.longValue(), decode.mis_unlimited.booleanValue());
            }
        });
    }

    @Override // com.ss.android.lark.chat.api.service.IChatService
    /* renamed from: a */
    public ImageHistoryResponse mo120984a(final String str, String str2, ImageHistoryResponse.Direction direction, List<ImageHistoryResponse.ResourceType> list, int i) {
        GetChatResourcesRequest.C18224a a = new GetChatResourcesRequest.C18224a().mo63170a(str).mo63168a(GetChatResourcesRequest.Direction.fromValue(direction.getNumber())).mo63169a(Integer.valueOf(i));
        if (!CollectionUtils.isEmpty(m126145h(list))) {
            a.mo63171a(m126145h(list));
        }
        if (!TextUtils.isEmpty(str2)) {
            a.mo63173b(str2);
        }
        return (ImageHistoryResponse) SdkSender.syncSend(Command.GET_CHAT_RESOURCES, a, new SdkSender.IParser<ImageHistoryResponse>() {
            /* class com.ss.android.lark.chat.api.service.p1600b.C32821b.AnonymousClass21 */

            /* renamed from: a */
            public ImageHistoryResponse parse(byte[] bArr) throws IOException {
                return C57310e.m222074a(GetChatResourcesResponse.ADAPTER.decode(bArr), str);
            }
        });
    }
}
