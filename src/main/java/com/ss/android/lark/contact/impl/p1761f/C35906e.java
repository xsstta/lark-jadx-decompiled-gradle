package com.ss.android.lark.contact.impl.p1761f;

import android.text.TextUtils;
import com.bytedance.lark.pb.basic.v1.ActionType;
import com.bytedance.lark.pb.basic.v1.ChatApplication;
import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.basic.v1.DeniedReason;
import com.bytedance.lark.pb.basic.v1.SyncDataStrategy;
import com.bytedance.lark.pb.contact.v1.GetContactsCombineChatRequest;
import com.bytedance.lark.pb.contact.v1.GetContactsCombineChatResponse;
import com.bytedance.lark.pb.contact.v1.PullManagedSchoolNodeRequest;
import com.bytedance.lark.pb.contact.v1.PullManagedSchoolNodeResponse;
import com.bytedance.lark.pb.contact.v2.DeleteSingleNamecardRequest;
import com.bytedance.lark.pb.contact.v2.GetAuthChattersRequest;
import com.bytedance.lark.pb.contact.v2.GetAuthChattersResponse;
import com.bytedance.lark.pb.contact.v2.GetContactEntriesRequest;
import com.bytedance.lark.pb.contact.v2.GetContactEntriesResponse;
import com.bytedance.lark.pb.contact.v2.GetExternContactsCombineAuthInfoRequest;
import com.bytedance.lark.pb.contact.v2.GetExternContactsCombineAuthInfoResponse;
import com.bytedance.lark.pb.contact.v2.GetExternalContactsAuthRequest;
import com.bytedance.lark.pb.contact.v2.GetExternalContactsAuthResponse;
import com.bytedance.lark.pb.contact.v2.GetNamecardListRequest;
import com.bytedance.lark.pb.contact.v2.GetNamecardListResponse;
import com.bytedance.lark.pb.contact.v2.GetNamecardsByIDsRequest;
import com.bytedance.lark.pb.contact.v2.GetNamecardsByIDsResponse;
import com.bytedance.lark.pb.contact.v2.GetUserRelationRequest;
import com.bytedance.lark.pb.contact.v2.GetUserRelationResponse;
import com.bytedance.lark.pb.contact.v2.IgnoreContactApplyRequest;
import com.bytedance.lark.pb.contact.v2.MSendContactApplicationRequest;
import com.bytedance.lark.pb.contact.v2.NamecardMetaInfo;
import com.bytedance.lark.pb.contact.v2.Phone;
import com.bytedance.lark.pb.contact.v2.SetSingleNamecardRequest;
import com.bytedance.lark.pb.contact.v2.SetSingleNamecardResponse;
import com.bytedance.lark.pb.contact.v2.SetupBlockUserRequest;
import com.bytedance.lark.pb.contact.v2.SourceInfo;
import com.bytedance.lark.pb.contact.v2.UpdateSingleNamecardRequest;
import com.bytedance.lark.pb.im.v1.DeleteContactRequest;
import com.bytedance.lark.pb.im.v1.GetChatApplicationBadgeRequest;
import com.bytedance.lark.pb.im.v1.GetChatApplicationBadgeResponse;
import com.bytedance.lark.pb.im.v1.GetChatApplicationsRequest;
import com.bytedance.lark.pb.im.v1.GetChatApplicationsResponse;
import com.bytedance.lark.pb.im.v1.GetContactTokenRequest;
import com.bytedance.lark.pb.im.v1.GetContactTokenResponse;
import com.bytedance.lark.pb.im.v1.GetMyGroupChatsRequest;
import com.bytedance.lark.pb.im.v1.GetMyGroupChatsResponse;
import com.bytedance.lark.pb.im.v1.ProcessChatApplicationRequest;
import com.bytedance.lark.pb.im.v1.ResetContactTokenRequest;
import com.bytedance.lark.pb.im.v1.ResetContactTokenResponse;
import com.bytedance.lark.pb.im.v1.SendChatApplicationRequest;
import com.bytedance.lark.pb.im.v1.UpdateChatApplicationMeReadRequest;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.squareup.wire.ProtoAdapter;
import com.ss.android.lark.biz.core.api.ContactSource;
import com.ss.android.lark.chat.api.IChatParser;
import com.ss.android.lark.chat.api.IChatterParser;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.contact.C35358a;
import com.ss.android.lark.contact.dto.C35392a;
import com.ss.android.lark.contact.dto.C35393d;
import com.ss.android.lark.contact.dto.ChatApplication;
import com.ss.android.lark.contact.dto.SchoolContactStructureResponse;
import com.ss.android.lark.contact.entity.UserRelationResponse;
import com.ss.android.lark.contact.impl.contacts_email.entity.GetBusinessCardResult;
import com.ss.android.lark.contact.impl.entity.ChatApplicationGetType;
import com.ss.android.lark.contact.impl.entity.ContactEntriesResult;
import com.ss.android.lark.contact.impl.interfaces.AbstractC35936a;
import com.ss.android.lark.contact.impl.p1760e.C35874a;
import com.ss.android.lark.contact.impl.p1760e.C35876b;
import com.ss.android.lark.contact.impl.p1760e.C35878d;
import com.ss.android.lark.contact.p1733b.AbstractC35361b;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.sdk.SdkSender;
import com.ss.android.lark.utils.rxjava.C57865c;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.lark.contact.impl.f.e */
public class C35906e implements AbstractC35936a {

    /* renamed from: a */
    AbstractC35361b.AbstractC35367f f92845a;

    /* renamed from: b */
    IChatterParser f92846b;

    /* renamed from: c */
    IChatParser f92847c = this.f92845a.mo130194a();

    /* renamed from: com.ss.android.lark.contact.impl.f.e$a */
    private static class C35916a {

        /* renamed from: a */
        static C35906e f92880a = new C35906e();
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public static /* synthetic */ String m140692j(byte[] bArr) throws IOException {
        return "";
    }

    /* renamed from: lambda$-o1iW7P66MjThwxQG2HoxuvsKZ0  reason: not valid java name */
    public static /* synthetic */ Boolean m270498lambda$o1iW7P66MjThwxQG2HoxuvsKZ0(byte[] bArr) {
        return true;
    }

    public static /* synthetic */ Boolean lambda$H3yD3E6b_Ckn2b99PmJovKi89EQ(byte[] bArr) {
        return true;
    }

    public static /* synthetic */ Boolean lambda$iBWOODnqemBheqbZFqKOqmbWz6o(byte[] bArr) {
        return true;
    }

    /* renamed from: a */
    public static C35906e m140678a() {
        return C35916a.f92880a;
    }

    /* renamed from: a */
    public void mo132148a(final List<String> list, IGetDataCallback<GetBusinessCardResult> iGetDataCallback) {
        SdkSender.asynSendRequestNonWrap(Command.GET_NAMECARDS_BY_IDS, new GetNamecardsByIDsRequest.C16480a().mo58750a(list), iGetDataCallback, new SdkSender.IParser<GetBusinessCardResult>() {
            /* class com.ss.android.lark.contact.impl.p1761f.C35906e.AnonymousClass10 */

            /* renamed from: a */
            public GetBusinessCardResult parse(byte[] bArr) throws IOException {
                return C35878d.m140608a((String) list.get(0), GetNamecardsByIDsResponse.ADAPTER.decode(bArr));
            }
        });
    }

    /* renamed from: a */
    public void mo132142a(GetBusinessCardResult bVar, IGetDataCallback<String> iGetDataCallback) {
        SdkSender.asynSendRequestNonWrap(Command.SET_SINGLE_NAMECARD, new SetSingleNamecardRequest.C16558a().mo58940a(m140675a(bVar)), iGetDataCallback, new SdkSender.IParser<String>() {
            /* class com.ss.android.lark.contact.impl.p1761f.C35906e.AnonymousClass16 */

            /* renamed from: a */
            public String parse(byte[] bArr) throws IOException {
                return SetSingleNamecardResponse.ADAPTER.decode(bArr).namecard_id;
            }
        });
    }

    @Override // com.ss.android.lark.contact.impl.interfaces.AbstractC35936a
    /* renamed from: a */
    public void mo132139a(long j, int i, IGetDataCallback<C35393d> iGetDataCallback) {
        m140680a(j, i, false, iGetDataCallback);
    }

    @Override // com.ss.android.lark.contact.impl.interfaces.AbstractC35936a
    /* renamed from: a */
    public void mo132143a(String str, int i, IGetDataCallback<AbstractC35936a.C35940d> iGetDataCallback) {
        m140681a(str, i, ChatApplicationGetType.BEFORE, "", iGetDataCallback);
    }

    /* renamed from: a */
    public List<Chat> mo132137a(long j, int i, boolean z) {
        return (List) SdkSender.syncSend(Command.GET_MY_GROUP_CHATS, new GetMyGroupChatsRequest.C17645a().mo61689a(z ? GetMyGroupChatsRequest.Type.ADMINISTRATE : GetMyGroupChatsRequest.Type.JOIN).mo61691a(Long.valueOf(j)).mo61690a(Integer.valueOf(i)), new SdkSender.IParser<List<Chat>>() {
            /* class com.ss.android.lark.contact.impl.p1761f.C35906e.AnonymousClass20 */

            /* renamed from: a */
            public List<Chat> parse(byte[] bArr) throws IOException {
                GetMyGroupChatsResponse decode = GetMyGroupChatsResponse.ADAPTER.decode(bArr);
                ArrayList arrayList = new ArrayList();
                if (decode == null) {
                    return arrayList;
                }
                return C35906e.this.f92847c.getChatList(decode.chats);
            }
        });
    }

    @Override // com.ss.android.lark.contact.p1735d.AbstractC35389d
    /* renamed from: a */
    public void mo130277a(String str, String str2, String str3, String str4, String str5, ContactSource contactSource, IGetDataCallback<Boolean> iGetDataCallback) {
        SendChatApplicationRequest.C18011a a = new SendChatApplicationRequest.C18011a().mo62560a(str2);
        if (!TextUtils.isEmpty(str3)) {
            a.mo62562b(str3);
        }
        if (!TextUtils.isEmpty(str5)) {
            a.mo62563c(str5);
        }
        if (contactSource != null) {
            a.f45111d = contactSource.getSender();
            a.f45113f = contactSource.getSourceName();
            a.mo62559a(com.bytedance.lark.pb.basic.v1.ContactSource.fromValue(contactSource.getSourceType()));
            a.f45114g = contactSource.getSenderId();
            a.f45115h = contactSource.getSourceId();
            a.f45116i = contactSource.getSubSourceType();
        }
        a.f45118k = str4;
        a.f45117j = str;
        SdkSender.asynSendRequestNonWrap(Command.SEND_CHAT_APPLICATION, a, iGetDataCallback, new SdkSender.IParser<Boolean>() {
            /* class com.ss.android.lark.contact.impl.p1761f.C35906e.AnonymousClass22 */

            /* renamed from: a */
            public Boolean parse(byte[] bArr) {
                return true;
            }
        });
    }

    @Override // com.ss.android.lark.contact.p1735d.AbstractC35389d
    /* renamed from: a */
    public void mo130278a(String str, boolean z, IGetDataCallback<Boolean> iGetDataCallback) {
        m140682a(str, ChatApplication.Status.AGREED, Boolean.valueOf(z), iGetDataCallback);
    }

    @Override // com.ss.android.lark.contact.impl.interfaces.AbstractC35936a
    /* renamed from: a */
    public void mo132145a(String str, IGetDataCallback<Boolean> iGetDataCallback) {
        m140682a(str, ChatApplication.Status.DELETED, (Boolean) false, iGetDataCallback);
    }

    @Override // com.ss.android.lark.contact.p1735d.AbstractC35389d
    /* renamed from: b */
    public void mo130284b(boolean z, IGetDataCallback<Boolean> iGetDataCallback) {
        SdkSender.asynSendRequestNonWrap(Command.UPDATE_CHAT_APPLICATION_ME_READ, new UpdateChatApplicationMeReadRequest.C18133a().mo62883a(Boolean.valueOf(z)), iGetDataCallback, new SdkSender.IParser() {
            /* class com.ss.android.lark.contact.impl.p1761f.C35906e.C359093 */

            /* renamed from: a */
            public Boolean parse(byte[] bArr) {
                return true;
            }
        });
    }

    @Override // com.ss.android.lark.contact.impl.interfaces.AbstractC35936a
    /* renamed from: a */
    public void mo132140a(IGetDataCallback<AbstractC35936a.C35937a> iGetDataCallback) {
        SdkSender.asynSendRequestNonWrap(Command.GET_CHAT_APPLICATION_BADGE, new GetChatApplicationBadgeRequest.C17486a(), iGetDataCallback, new SdkSender.IParser<AbstractC35936a.C35937a>() {
            /* class com.ss.android.lark.contact.impl.p1761f.C35906e.C359104 */

            /* renamed from: a */
            public AbstractC35936a.C35937a parse(byte[] bArr) throws IOException {
                GetChatApplicationBadgeResponse decode = GetChatApplicationBadgeResponse.ADAPTER.decode(bArr);
                AbstractC35936a.C35937a aVar = new AbstractC35936a.C35937a();
                aVar.mo132216a(decode.chat_badge.intValue());
                aVar.mo132217b(decode.friend_badge.intValue());
                return aVar;
            }
        });
    }

    @Override // com.ss.android.lark.contact.p1735d.AbstractC35389d
    /* renamed from: a */
    public void mo130276a(int i, List<String> list, String str, final IGetDataCallback<Map<String, Integer>> iGetDataCallback) {
        HashMap hashMap = new HashMap();
        for (String str2 : list) {
            hashMap.put(str2, str);
        }
        ActionType fromValue = ActionType.fromValue(i);
        if (fromValue == null) {
            fromValue = ActionType.UNKNOWN_ACTION;
        }
        GetAuthChattersRequest.C16436a a = new GetAuthChattersRequest.C16436a().mo58647a(fromValue).mo58648a(hashMap);
        C359137 r4 = new IGetDataCallback<GetAuthChattersResponse>() {
            /* class com.ss.android.lark.contact.impl.p1761f.C35906e.C359137 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onError(errorResult);
                }
                Log.m165382e(errorResult.getDisplayMsg());
            }

            /* renamed from: a */
            public void onSuccess(GetAuthChattersResponse getAuthChattersResponse) {
                if (getAuthChattersResponse == null) {
                    IGetDataCallback iGetDataCallback = iGetDataCallback;
                    if (iGetDataCallback != null) {
                        iGetDataCallback.onError(new ErrorResult("result is null"));
                        return;
                    }
                    return;
                }
                HashMap hashMap = new HashMap();
                if (getAuthChattersResponse.auth_result == null) {
                    IGetDataCallback iGetDataCallback2 = iGetDataCallback;
                    if (iGetDataCallback2 != null) {
                        iGetDataCallback2.onSuccess(hashMap);
                    }
                } else if (iGetDataCallback != null) {
                    Map<String, DeniedReason> map = getAuthChattersResponse.auth_result.denied_reasons;
                    for (String str : map.keySet()) {
                        hashMap.put(str, Integer.valueOf(map.get(str).getValue()));
                    }
                    iGetDataCallback.onSuccess(hashMap);
                }
            }
        };
        Command command = Command.GET_AUTH_CHATTERS;
        ProtoAdapter<GetAuthChattersResponse> protoAdapter = GetAuthChattersResponse.ADAPTER;
        protoAdapter.getClass();
        SdkSender.asynSendRequestNonWrap(command, a, r4, new SdkSender.IParser() {
            /* class com.ss.android.lark.contact.impl.p1761f.$$Lambda$K8t64ML06ZCe52VEWd9vU4muXs */

            @Override // com.ss.android.lark.sdk.SdkSender.IParser
            public final Object parse(byte[] bArr) {
                return (GetAuthChattersResponse) ProtoAdapter.this.decode(bArr);
            }
        });
    }

    @Override // com.ss.android.lark.contact.p1735d.AbstractC35389d
    /* renamed from: a */
    public void mo130279a(List<String> list, int i, final IGetDataCallback<Map<String, Integer>> iGetDataCallback) {
        ActionType fromValue = ActionType.fromValue(i);
        if (fromValue == null) {
            fromValue = ActionType.UNKNOWN_ACTION;
        }
        GetExternalContactsAuthRequest.C16462a a = new GetExternalContactsAuthRequest.C16462a().mo58711a(list).mo58710a(fromValue);
        C359148 r4 = new IGetDataCallback<GetExternalContactsAuthResponse>() {
            /* class com.ss.android.lark.contact.impl.p1761f.C35906e.C359148 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onError(errorResult);
                }
            }

            /* renamed from: a */
            public void onSuccess(GetExternalContactsAuthResponse getExternalContactsAuthResponse) {
                if (getExternalContactsAuthResponse == null || getExternalContactsAuthResponse.id2denied_reason == null) {
                    IGetDataCallback iGetDataCallback = iGetDataCallback;
                    if (iGetDataCallback != null) {
                        iGetDataCallback.onError(new ErrorResult("result is null"));
                        return;
                    }
                    return;
                }
                HashMap hashMap = new HashMap();
                for (Map.Entry<String, DeniedReason> entry : getExternalContactsAuthResponse.id2denied_reason.entrySet()) {
                    hashMap.put(entry.getKey(), Integer.valueOf(entry.getValue().getValue()));
                }
                IGetDataCallback iGetDataCallback2 = iGetDataCallback;
                if (iGetDataCallback2 != null) {
                    iGetDataCallback2.onSuccess(hashMap);
                }
            }
        };
        Command command = Command.GET_EXTERNAL_CONTACTS_AUTH;
        ProtoAdapter<GetExternalContactsAuthResponse> protoAdapter = GetExternalContactsAuthResponse.ADAPTER;
        protoAdapter.getClass();
        SdkSender.asynSendRequestNonWrap(command, a, r4, new SdkSender.IParser() {
            /* class com.ss.android.lark.contact.impl.p1761f.$$Lambda$8cgZyONEOpZleNLO14ope8UpHc */

            @Override // com.ss.android.lark.sdk.SdkSender.IParser
            public final Object parse(byte[] bArr) {
                return (GetExternalContactsAuthResponse) ProtoAdapter.this.decode(bArr);
            }
        });
    }

    @Override // com.ss.android.lark.contact.impl.interfaces.AbstractC35936a
    /* renamed from: a */
    public void mo132147a(String str, String str2, int i, IGetDataCallback<AbstractC35936a.C35939c> iGetDataCallback) {
        GetContactsCombineChatRequest.C16220a a = new GetContactsCombineChatRequest.C16220a().mo58132b(str).mo58129a(Integer.valueOf(i));
        if (!TextUtils.isEmpty(str2)) {
            a.mo58130a(str2);
        }
        if (C35358a.m138143a().mo130180y() && C35358a.m138143a().mo130181z()) {
            a.f42396d = ActionType.INVITE_SAME_CRYPTO_CHAT;
        }
        SdkSender.asynSendRequestNonWrap(Command.GET_CONTACTS_COMBINE_CHAT, a, iGetDataCallback, $$Lambda$e$h5RMr_slbHB_8O7J5bHYgT_jOiQ.INSTANCE);
    }

    @Override // com.ss.android.lark.contact.impl.interfaces.AbstractC35936a
    /* renamed from: a */
    public void mo132146a(String str, String str2, int i, int i2, IGetDataCallback<AbstractC35936a.C35939c> iGetDataCallback) {
        SdkSender.asynSendRequestNonWrap(Command.GET_EXTERN_CONTACTS_COMBINE_AUTH_INFO, new GetExternContactsCombineAuthInfoRequest.C16454a().mo58688a(Integer.valueOf(str)).mo58689a(Long.valueOf((long) i)).mo58690a(str2).mo58687a(ActionType.fromValue(i2)), iGetDataCallback, $$Lambda$e$KnLqDoYF9Y9Ag4NriYJYW_0WMvY.INSTANCE);
    }

    @Override // com.ss.android.lark.contact.p1735d.AbstractC35389d
    /* renamed from: a */
    public UserRelationResponse mo130274a(String str) {
        return (UserRelationResponse) SdkSender.syncSend(Command.GET_USER_RELATION, new GetUserRelationRequest.C16534a().mo58869a(str), $$Lambda$e$on9WsA4v3CqRK1l7giPslDidHs.INSTANCE);
    }

    @Override // com.ss.android.lark.contact.p1735d.AbstractC35389d
    /* renamed from: a */
    public Map<String, Integer> mo130275a(Map<String, String> map) {
        if (map.isEmpty()) {
            return new HashMap();
        }
        return (Map) SdkSender.syncSend(Command.GET_AUTH_CHATTERS, new GetAuthChattersRequest.C16436a().mo58647a(ActionType.SHARE_MESSAGE_SELECT_USER).mo58648a(map), $$Lambda$e$VmBP_A55NnAYOWb1zhbXc3rrCDc.INSTANCE);
    }

    @Override // com.ss.android.lark.contact.p1735d.AbstractC35389d
    /* renamed from: a */
    public void mo130280a(List<String> list, String str, ContactSource contactSource, IGetDataCallback<Boolean> iGetDataCallback) {
        HashMap hashMap = new HashMap();
        SourceInfo a = m140676a(contactSource);
        for (String str2 : list) {
            hashMap.put(str2, a);
        }
        SdkSender.asynSendRequestNonWrap(Command.MSEND_CONTACT_APPLICATION, new MSendContactApplicationRequest.C16544a().mo58893a(list).mo58892a(str).mo58894a(hashMap), iGetDataCallback, $$Lambda$e$H3yD3E6b_Ckn2b99PmJovKi89EQ.INSTANCE);
    }

    @Override // com.ss.android.lark.contact.impl.interfaces.AbstractC35936a
    /* renamed from: a */
    public AbstractC35936a.C35939c mo132136a(String str, String str2, int i) {
        GetContactsCombineChatRequest.C16220a a = new GetContactsCombineChatRequest.C16220a().mo58132b(str).mo58129a(Integer.valueOf(i));
        if (!TextUtils.isEmpty(str2)) {
            a.mo58130a(str2);
        }
        return (AbstractC35936a.C35939c) SdkSender.sendRequest(Command.GET_CONTACTS_COMBINE_CHAT, a, $$Lambda$e$kLRJfDnBdxBDbzIzqfmoj7SPhY.INSTANCE);
    }

    @Override // com.ss.android.lark.contact.impl.interfaces.AbstractC35936a
    /* renamed from: a */
    public void mo132149a(final boolean z, final IGetDataCallback<SchoolContactStructureResponse> iGetDataCallback) {
        C57865c.m224576a(new Runnable() {
            /* class com.ss.android.lark.contact.impl.p1761f.C35906e.AnonymousClass13 */

            public void run() {
                IGetDataCallback iGetDataCallback;
                SchoolContactStructureResponse a = C35906e.this.mo132135a(z);
                if (!(a == null || (iGetDataCallback = iGetDataCallback) == null)) {
                    iGetDataCallback.onSuccess(a);
                }
                C35906e.this.mo132153c(z, iGetDataCallback);
            }
        });
    }

    /* renamed from: a */
    public void mo132144a(String str, int i, ChatApplication.Type type, ChatApplicationGetType chatApplicationGetType, String str2, IGetDataCallback<AbstractC35936a.C35938b> iGetDataCallback) {
        GetChatApplicationsRequest.C17490a a = new GetChatApplicationsRequest.C17490a().mo61287a(str).mo61286a(Integer.valueOf(i)).mo61284a(ChatApplication.Type.fromValue(type.getNumber())).mo61285a(GetChatApplicationsRequest.GetType.fromValue(chatApplicationGetType.getNumber()));
        if (!TextUtils.isEmpty(str2)) {
            a.mo61289b(str2);
        }
        SdkSender.asynSendRequestNonWrap(Command.GET_CHAT_APPLICATIONS, a, iGetDataCallback, new SdkSender.IParser<AbstractC35936a.C35938b>() {
            /* class com.ss.android.lark.contact.impl.p1761f.C35906e.AnonymousClass14 */

            /* renamed from: a */
            public AbstractC35936a.C35938b parse(byte[] bArr) throws IOException {
                GetChatApplicationsResponse decode = GetChatApplicationsResponse.ADAPTER.decode(bArr);
                Map<String, Chat> chatMap = C35906e.this.f92847c.getChatMap(decode.entity.chats);
                List<com.ss.android.lark.contact.dto.ChatApplication> a = C35874a.m140581a(decode.applications);
                boolean booleanValue = decode.has_more.booleanValue();
                AbstractC35936a.C35938b bVar = new AbstractC35936a.C35938b();
                bVar.mo132220a(chatMap);
                bVar.mo132219a(a);
                bVar.mo132221a(booleanValue);
                return bVar;
            }
        });
    }

    @Override // com.ss.android.lark.contact.impl.interfaces.AbstractC35936a
    /* renamed from: a */
    public void mo132141a(IGetDataCallback<ContactEntriesResult> iGetDataCallback, SyncDataStrategy syncDataStrategy) {
        SdkSender.asynSendRequestNonWrap(Command.GET_CONTACT_ENTRIES, new GetContactEntriesRequest.C16448a().mo58674a(syncDataStrategy), iGetDataCallback, new SdkSender.IParser<ContactEntriesResult>() {
            /* class com.ss.android.lark.contact.impl.p1761f.C35906e.AnonymousClass15 */

            /* renamed from: a */
            public ContactEntriesResult parse(byte[] bArr) throws IOException {
                return new ContactEntriesResult(GetContactEntriesResponse.ADAPTER.decode(bArr));
            }
        });
    }

    public C35906e() {
        AbstractC35361b.AbstractC35367f j = C35358a.m138143a().mo130165j();
        this.f92845a = j;
        this.f92846b = j.mo130202b();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ SchoolContactStructureResponse m140677a(byte[] bArr) throws IOException {
        return C35876b.m140586a(PullManagedSchoolNodeResponse.ADAPTER.decode(bArr));
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ AbstractC35936a.C35939c m140683b(byte[] bArr) throws IOException {
        return C35878d.m140609a(GetContactsCombineChatResponse.ADAPTER.decode(bArr));
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public static /* synthetic */ AbstractC35936a.C35939c m140690h(byte[] bArr) throws IOException {
        return C35878d.m140610a(GetExternContactsCombineAuthInfoResponse.ADAPTER.decode(bArr));
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public static /* synthetic */ AbstractC35936a.C35939c m140691i(byte[] bArr) throws IOException {
        return C35878d.m140609a(GetContactsCombineChatResponse.ADAPTER.decode(bArr));
    }

    @Override // com.ss.android.lark.contact.p1735d.AbstractC35389d
    /* renamed from: c */
    public void mo130285c(IGetDataCallback<String> iGetDataCallback) {
        SdkSender.asynSendRequestNonWrap(Command.RESET_CONTACT_TOKEN, new ResetContactTokenRequest.C18007a(), iGetDataCallback, new SdkSender.IParser<String>() {
            /* class com.ss.android.lark.contact.impl.p1761f.C35906e.C359126 */

            /* renamed from: a */
            public String parse(byte[] bArr) throws IOException {
                return ResetContactTokenResponse.ADAPTER.decode(bArr).token;
            }
        });
    }

    /* renamed from: a */
    private SourceInfo m140676a(ContactSource contactSource) {
        SourceInfo.C16566a aVar = new SourceInfo.C16566a();
        if (contactSource == null) {
            return aVar.build();
        }
        if (contactSource.getSender() != null) {
            aVar.mo58961a(contactSource.getSender());
        }
        if (contactSource.getSenderId() != null) {
            aVar.mo58964c(contactSource.getSenderId());
        }
        if (contactSource.getSourceName() != null) {
            aVar.mo58963b(contactSource.getSourceName());
        }
        if (contactSource.getSourceId() != null) {
            aVar.mo58965d(contactSource.getSourceId());
        }
        if (contactSource.getSubSourceType() != null) {
            aVar.mo58966e(contactSource.getSubSourceType());
        }
        aVar.mo58960a(com.bytedance.lark.pb.basic.v1.ContactSource.fromValue(contactSource.getSourceType()));
        return aVar.build();
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static /* synthetic */ Map m140687e(byte[] bArr) throws IOException {
        GetAuthChattersResponse decode = GetAuthChattersResponse.ADAPTER.decode(bArr);
        if (decode.auth_result == null) {
            return new HashMap(0);
        }
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, DeniedReason> entry : decode.auth_result.denied_reasons.entrySet()) {
            hashMap.put(entry.getKey(), Integer.valueOf(entry.getValue().getValue()));
        }
        return hashMap;
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public static /* synthetic */ UserRelationResponse m140688f(byte[] bArr) throws IOException {
        GetUserRelationResponse decode = GetUserRelationResponse.ADAPTER.decode(bArr);
        return new UserRelationResponse.C35401a(decode.is_friend.booleanValue(), decode.has_block.booleanValue(), decode.has_apply.booleanValue(), decode.has_be_applied.booleanValue()).mo130564a(decode.has_be_applied_id).mo130567b(decode.be_applied_reason).mo130565a(decode.has_be_block.booleanValue()).mo130568b(decode.be_ctrl_add_contact.booleanValue()).mo130569c(decode.in_collaboration.booleanValue()).mo130566a();
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public static /* synthetic */ UserRelationResponse m140689g(byte[] bArr) throws IOException {
        GetUserRelationResponse decode = GetUserRelationResponse.ADAPTER.decode(bArr);
        return new UserRelationResponse.C35401a(decode.is_friend.booleanValue(), decode.has_block.booleanValue(), decode.has_apply.booleanValue(), decode.has_be_applied.booleanValue()).mo130564a(decode.has_be_applied_id).mo130567b(decode.be_applied_reason).mo130565a(decode.has_be_block.booleanValue()).mo130568b(decode.be_ctrl_add_contact.booleanValue()).mo130569c(decode.in_collaboration.booleanValue()).mo130566a();
    }

    @Override // com.ss.android.lark.contact.p1735d.AbstractC35389d
    /* renamed from: b */
    public void mo130281b(IGetDataCallback<String> iGetDataCallback) {
        SdkSender.asynSendRequestNonWrap(Command.GET_CONTACT_TOKEN, new GetContactTokenRequest.C17558a(), iGetDataCallback, new SdkSender.IParser<String>() {
            /* class com.ss.android.lark.contact.impl.p1761f.C35906e.C359115 */

            /* renamed from: a */
            public String parse(byte[] bArr) throws IOException {
                return GetContactTokenResponse.ADAPTER.decode(bArr).invite_url;
            }
        });
    }

    /* renamed from: a */
    private NamecardMetaInfo m140675a(GetBusinessCardResult bVar) {
        Phone phone;
        if (bVar.mo131017e() != null) {
            phone = new Phone.C16552a().mo58922a(bVar.mo131017e().mo131027a()).mo58924b(bVar.mo131017e().mo131028b()).mo58925c(bVar.mo131017e().mo131029c()).build();
        } else {
            phone = null;
        }
        return new NamecardMetaInfo.C16546a().mo58901a(bVar.mo131007a()).mo58903b(bVar.mo131011b()).mo58904c(bVar.mo131013c()).mo58905d(bVar.mo131015d()).mo58899a(phone).mo58906e(bVar.mo131019f()).mo58907f(bVar.mo131021g()).mo58908g(bVar.mo131023h()).mo58900a(bVar.mo131026j()).build();
    }

    /* renamed from: a */
    public SchoolContactStructureResponse mo132135a(boolean z) {
        PullManagedSchoolNodeRequest.C16342a aVar = new PullManagedSchoolNodeRequest.C16342a();
        aVar.mo58411a(Boolean.valueOf(z));
        aVar.mo58413b(false);
        return (SchoolContactStructureResponse) SdkSender.syncSend(Command.GET_MANAGED_NODES, aVar, new SdkSender.IParser<SchoolContactStructureResponse>() {
            /* class com.ss.android.lark.contact.impl.p1761f.C35906e.AnonymousClass12 */

            /* renamed from: a */
            public SchoolContactStructureResponse parse(byte[] bArr) throws IOException {
                return C35876b.m140586a(PullManagedSchoolNodeResponse.ADAPTER.decode(bArr));
            }
        });
    }

    @Override // com.ss.android.lark.contact.impl.interfaces.AbstractC35936a
    /* renamed from: a */
    public void mo132138a(int i, IGetDataCallback<List<Chat>> iGetDataCallback) {
        m140679a(i, false, iGetDataCallback);
    }

    @Override // com.ss.android.lark.contact.p1735d.AbstractC35389d
    /* renamed from: c */
    public void mo130286c(String str, IGetDataCallback<UserRelationResponse> iGetDataCallback) {
        SdkSender.asynSendRequestNonWrap(Command.GET_USER_RELATION, new GetUserRelationRequest.C16534a().mo58869a(str), iGetDataCallback, $$Lambda$e$_mMXx5hWSxwUIKQfRGkZN7kNdKY.INSTANCE);
    }

    @Override // com.ss.android.lark.contact.p1735d.AbstractC35389d
    /* renamed from: d */
    public void mo130287d(String str, IGetDataCallback<Boolean> iGetDataCallback) {
        SdkSender.asynSendRequestNonWrap(Command.IGNORE_CONTACT_APPLY, new IgnoreContactApplyRequest.C16538a().mo58878a(str), iGetDataCallback, new SdkSender.IParser<Boolean>() {
            /* class com.ss.android.lark.contact.impl.p1761f.C35906e.C359159 */

            /* renamed from: a */
            public Boolean parse(byte[] bArr) throws IOException {
                return true;
            }
        });
    }

    @Override // com.ss.android.lark.contact.p1735d.AbstractC35389d
    /* renamed from: e */
    public void mo130288e(String str, IGetDataCallback<Boolean> iGetDataCallback) {
        SdkSender.asynSendRequestNonWrap(Command.DELETE_CONTACT, new DeleteContactRequest.C17402a().mo61071a(str), iGetDataCallback, new SdkSender.IParser<Boolean>() {
            /* class com.ss.android.lark.contact.impl.p1761f.C35906e.AnonymousClass11 */

            /* renamed from: a */
            public Boolean parse(byte[] bArr) throws IOException {
                return true;
            }
        });
    }

    /* renamed from: c */
    public void mo132153c(boolean z, IGetDataCallback<SchoolContactStructureResponse> iGetDataCallback) {
        PullManagedSchoolNodeRequest.C16342a aVar = new PullManagedSchoolNodeRequest.C16342a();
        aVar.mo58411a(Boolean.valueOf(z));
        SdkSender.asynSendRequestNonWrap(Command.GET_MANAGED_NODES, aVar, iGetDataCallback, $$Lambda$e$NeGJvmBExJtF1Dw1GBlHOs7E3sk.INSTANCE);
    }

    /* renamed from: b */
    public void mo132151b(GetBusinessCardResult bVar, IGetDataCallback<String> iGetDataCallback) {
        SdkSender.asynSendRequestNonWrap(Command.UPDATE_SINGLE_NAMECARD, new UpdateSingleNamecardRequest.C16568a().mo58970a(m140675a(bVar)), iGetDataCallback, $$Lambda$e$CBTUqhXR1w8KF0RzsuTGT_eF8o.INSTANCE);
    }

    @Override // com.ss.android.lark.contact.p1735d.AbstractC35389d
    /* renamed from: b */
    public void mo130282b(String str, IGetDataCallback<Boolean> iGetDataCallback) {
        SdkSender.asynSendRequestNonWrap(Command.DELETE_SINGLE_NAMECARD, new DeleteSingleNamecardRequest.C16430a().mo58631a(str), iGetDataCallback, $$Lambda$e$iBWOODnqemBheqbZFqKOqmbWz6o.INSTANCE);
    }

    /* renamed from: a */
    private void m140679a(final int i, final boolean z, final IGetDataCallback<List<Chat>> iGetDataCallback) {
        C57865c.m224576a(new Runnable() {
            /* class com.ss.android.lark.contact.impl.p1761f.C35906e.AnonymousClass17 */

            public void run() {
                List<Chat> a = C35906e.this.mo132137a(0, i, z);
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback == null) {
                    return;
                }
                if (a != null) {
                    iGetDataCallback.onSuccess(a);
                } else {
                    iGetDataCallback.onError(new ErrorResult("local group list null"));
                }
            }
        });
    }

    @Override // com.ss.android.lark.contact.impl.interfaces.AbstractC35936a
    /* renamed from: b */
    public void mo132150b(long j, int i, IGetDataCallback<C35393d> iGetDataCallback) {
        m140680a(j, i, true, iGetDataCallback);
    }

    /* renamed from: b */
    public void mo132152b(String str, int i, IGetDataCallback<C35392a> iGetDataCallback) {
        SdkSender.asynSendRequestNonWrap(Command.GET_NAMECARD_LIST, new GetNamecardListRequest.C16466a().mo58721a(str).mo58720a(Integer.valueOf(i)), iGetDataCallback, new SdkSender.IParser<C35392a>() {
            /* class com.ss.android.lark.contact.impl.p1761f.C35906e.C359071 */

            /* renamed from: a */
            public C35392a parse(byte[] bArr) throws IOException {
                return C35878d.m140606a(GetNamecardListResponse.ADAPTER.decode(bArr));
            }
        });
    }

    @Override // com.ss.android.lark.contact.p1735d.AbstractC35389d
    /* renamed from: b */
    public void mo130283b(String str, boolean z, IGetDataCallback<Boolean> iGetDataCallback) {
        SdkSender.asynSendRequestNonWrap(Command.SETUP_BLOCK_USER, new SetupBlockUserRequest.C16562a().mo58949a(Boolean.valueOf(z)).mo58950a(str), iGetDataCallback, $$Lambda$e$o1iW7P66MjThwxQG2HoxuvsKZ0.INSTANCE);
    }

    /* renamed from: a */
    private void m140680a(long j, int i, boolean z, final IGetDataCallback<C35393d> iGetDataCallback) {
        m140684b(j, i, z, new IGetDataCallback<C35393d>() {
            /* class com.ss.android.lark.contact.impl.p1761f.C35906e.AnonymousClass18 */

            /* renamed from: a */
            public void onSuccess(C35393d dVar) {
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onSuccess(dVar);
                }
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onError(errorResult);
                }
            }
        });
    }

    /* renamed from: b */
    private void m140684b(long j, int i, boolean z, IGetDataCallback<C35393d> iGetDataCallback) {
        GetMyGroupChatsRequest.Type type;
        if (z) {
            type = GetMyGroupChatsRequest.Type.ADMINISTRATE;
        } else {
            type = GetMyGroupChatsRequest.Type.JOIN;
        }
        SdkSender.asynSendRequestNonWrap(Command.GET_MY_GROUP_CHATS, new GetMyGroupChatsRequest.C17645a().mo61690a(Integer.valueOf(i)).mo61689a(type).mo61691a(Long.valueOf(j)), iGetDataCallback, new SdkSender.IParser<C35393d>() {
            /* class com.ss.android.lark.contact.impl.p1761f.C35906e.AnonymousClass19 */

            /* renamed from: a */
            public C35393d parse(byte[] bArr) throws IOException {
                GetMyGroupChatsResponse decode = GetMyGroupChatsResponse.ADAPTER.decode(bArr);
                C35393d dVar = new C35393d();
                dVar.mo130386a(C35906e.this.f92847c.getChatList(decode.chats));
                dVar.mo130387a(decode.has_more.booleanValue());
                dVar.mo130385a(decode.min_time.longValue());
                return dVar;
            }
        });
    }

    /* renamed from: a */
    private void m140682a(String str, ChatApplication.Status status, Boolean bool, IGetDataCallback<Boolean> iGetDataCallback) {
        SdkSender.asynSendRequestNonWrap(Command.PROCESS_CHAT_APPLICATION, new ProcessChatApplicationRequest.C17851a().mo62211a(str).mo62209a(ChatApplication.Status.fromValue(status.getNumber())).mo62210a(bool), iGetDataCallback, new SdkSender.IParser<Boolean>() {
            /* class com.ss.android.lark.contact.impl.p1761f.C35906e.C359082 */

            /* renamed from: a */
            public Boolean parse(byte[] bArr) {
                return true;
            }
        });
    }

    /* renamed from: a */
    private void m140681a(String str, int i, ChatApplicationGetType chatApplicationGetType, String str2, final IGetDataCallback<AbstractC35936a.C35940d> iGetDataCallback) {
        mo132144a(str, i, ChatApplication.Type.FRIEND, chatApplicationGetType, str2, new IGetDataCallback<AbstractC35936a.C35938b>() {
            /* class com.ss.android.lark.contact.impl.p1761f.C35906e.AnonymousClass21 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onError(errorResult);
                }
            }

            /* renamed from: a */
            public void onSuccess(AbstractC35936a.C35938b bVar) {
                AbstractC35936a.C35940d dVar = new AbstractC35936a.C35940d();
                dVar.mo132238a(bVar.mo132218a());
                dVar.mo132239a(bVar.mo132222b());
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onSuccess(dVar);
                }
            }
        });
    }
}
