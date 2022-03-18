package com.ss.android.lark.mail.impl.p2168g;

import android.text.TextUtils;
import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.email.client.v1.Draft;
import com.bytedance.lark.pb.email.client.v1.MailAtContactRequest;
import com.bytedance.lark.pb.email.client.v1.MailAtContactResponse;
import com.bytedance.lark.pb.email.client.v1.MailCancelShareThreadRequest;
import com.bytedance.lark.pb.email.client.v1.MailCancelShareThreadResponse;
import com.bytedance.lark.pb.email.client.v1.MailContactSearchRequest;
import com.bytedance.lark.pb.email.client.v1.MailContactSearchResponse;
import com.bytedance.lark.pb.email.client.v1.MailCreateDocRequest;
import com.bytedance.lark.pb.email.client.v1.MailCreateDocResponse;
import com.bytedance.lark.pb.email.client.v1.MailCreateDraftRequest;
import com.bytedance.lark.pb.email.client.v1.MailCreateDraftResponse;
import com.bytedance.lark.pb.email.client.v1.MailCreateForwardMessageDraftRequest;
import com.bytedance.lark.pb.email.client.v1.MailCreateForwardMessageDraftResponse;
import com.bytedance.lark.pb.email.client.v1.MailCreateShareMessageDraftRequest;
import com.bytedance.lark.pb.email.client.v1.MailCreateShareMessageDraftResponse;
import com.bytedance.lark.pb.email.client.v1.MailDeleteLargeFileRequest;
import com.bytedance.lark.pb.email.client.v1.MailDeleteLargeFileResponse;
import com.bytedance.lark.pb.email.client.v1.MailDeleteMultiDraftResponse;
import com.bytedance.lark.pb.email.client.v1.MailDeleteMultiDraftsRequest;
import com.bytedance.lark.pb.email.client.v1.MailEditMessageRequest;
import com.bytedance.lark.pb.email.client.v1.MailEditMessageResponse;
import com.bytedance.lark.pb.email.client.v1.MailGetAccountRequest;
import com.bytedance.lark.pb.email.client.v1.MailGetAccountResponse;
import com.bytedance.lark.pb.email.client.v1.MailGetDocsByUrlsRequest;
import com.bytedance.lark.pb.email.client.v1.MailGetDocsByUrlsResponse;
import com.bytedance.lark.pb.email.client.v1.MailGetForwardMessageListFromNetRequest;
import com.bytedance.lark.pb.email.client.v1.MailGetForwardMessageListRequest;
import com.bytedance.lark.pb.email.client.v1.MailGetMessageFullBodyRequest;
import com.bytedance.lark.pb.email.client.v1.MailGetMessageFullBodyResponse;
import com.bytedance.lark.pb.email.client.v1.MailGetMessageItemRequest;
import com.bytedance.lark.pb.email.client.v1.MailGetMessageItemResponse;
import com.bytedance.lark.pb.email.client.v1.MailGetMessageListFromNetRequest;
import com.bytedance.lark.pb.email.client.v1.MailGetMessageListRequest;
import com.bytedance.lark.pb.email.client.v1.MailGetMessageListResponse;
import com.bytedance.lark.pb.email.client.v1.MailGetMultiThreadItemsRequest;
import com.bytedance.lark.pb.email.client.v1.MailGetMultiThreadItemsResponse;
import com.bytedance.lark.pb.email.client.v1.MailGetRecallDetailRequest;
import com.bytedance.lark.pb.email.client.v1.MailGetRecallDetailResponse;
import com.bytedance.lark.pb.email.client.v1.MailGetShareThreadOwnerInfoRequest;
import com.bytedance.lark.pb.email.client.v1.MailGetShareThreadOwnerInfoResponse;
import com.bytedance.lark.pb.email.client.v1.MailGetSignatureResponse;
import com.bytedance.lark.pb.email.client.v1.MailGetSignaturesRequest;
import com.bytedance.lark.pb.email.client.v1.MailGetSmartReplyRequest;
import com.bytedance.lark.pb.email.client.v1.MailGetSmartReplyResponse;
import com.bytedance.lark.pb.email.client.v1.MailGetThreadCollaboratorsInfoRequest;
import com.bytedance.lark.pb.email.client.v1.MailGetThreadCollaboratorsInfoResponse;
import com.bytedance.lark.pb.email.client.v1.MailGetThreadItemRequest;
import com.bytedance.lark.pb.email.client.v1.MailGetThreadItemResponse;
import com.bytedance.lark.pb.email.client.v1.MailLastVersionNewUserFlagRequest;
import com.bytedance.lark.pb.email.client.v1.MailLastVersionNewUserFlagResponse;
import com.bytedance.lark.pb.email.client.v1.MailMoveMultiLabelRequest;
import com.bytedance.lark.pb.email.client.v1.MailMoveMultiLabelResponse;
import com.bytedance.lark.pb.email.client.v1.MailMoveToFolderRequest;
import com.bytedance.lark.pb.email.client.v1.MailMoveToFolderResponse;
import com.bytedance.lark.pb.email.client.v1.MailMultiThreadDeletePermanentlyRequest;
import com.bytedance.lark.pb.email.client.v1.MailMultiThreadDeletePermanentlyResponse;
import com.bytedance.lark.pb.email.client.v1.MailMutMultiLabelRequest;
import com.bytedance.lark.pb.email.client.v1.MailMutMultiLabelResponse;
import com.bytedance.lark.pb.email.client.v1.MailRecallMessageRequest;
import com.bytedance.lark.pb.email.client.v1.MailRecallMessageResponse;
import com.bytedance.lark.pb.email.client.v1.MailReplyCalendarEventRequest;
import com.bytedance.lark.pb.email.client.v1.MailReplyCalendarEventResponse;
import com.bytedance.lark.pb.email.client.v1.MailSendDraftRequest;
import com.bytedance.lark.pb.email.client.v1.MailSendDraftResponse;
import com.bytedance.lark.pb.email.client.v1.MailSmartReplyInfo;
import com.bytedance.lark.pb.email.client.v1.MailTranslateMessagesRequest;
import com.bytedance.lark.pb.email.client.v1.MailTranslateMessagesResponse;
import com.bytedance.lark.pb.email.client.v1.MailUnsubscribeRequest;
import com.bytedance.lark.pb.email.client.v1.MailUnsubscribeResponse;
import com.bytedance.lark.pb.email.client.v1.MailUpdateDraftRequest;
import com.bytedance.lark.pb.email.client.v1.MailUpdateDraftResponse;
import com.bytedance.lark.pb.email.client.v1.MailUpdateOutboxActionRequest;
import com.bytedance.lark.pb.email.client.v1.MailUpdateOutboxActionResponse;
import com.bytedance.lark.pb.email.client.v1.MailUpdateSignatureUsageRequest;
import com.bytedance.lark.pb.email.client.v1.MailUpdateSignatureUsageResponse;
import com.bytedance.lark.pb.email.client.v1.ReportType;
import com.bytedance.lark.pb.email.v1.DeleteMailDraftRequest;
import com.bytedance.lark.pb.email.v1.DeleteMailDraftResponse;
import com.bytedance.lark.pb.email.v1.MailSendCardRequest;
import com.bytedance.lark.pb.email.v1.MailSendCardResponse;
import com.bytedance.lark.pb.search.v1.IntegrationSearchRequest;
import com.bytedance.lark.pb.search.v1.Scene;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.utils.CollectionUtils;
import com.squareup.wire.ProtoAdapter;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mail.impl.action.PushMultiThreadAction;
import com.ss.android.lark.mail.impl.compose.C41970e;
import com.ss.android.lark.mail.impl.entity.C42093e;
import com.ss.android.lark.mail.impl.entity.C42099l;
import com.ss.android.lark.mail.impl.entity.CreateDraft;
import com.ss.android.lark.mail.impl.entity.EntSignatureUsage;
import com.ss.android.lark.mail.impl.entity.MailDraft;
import com.ss.android.lark.mail.impl.entity.MailMessage;
import com.ss.android.lark.mail.impl.entity.MailThread;
import com.ss.android.lark.mail.impl.mulprocess.entity.ByteArray;
import com.ss.android.lark.mail.impl.p2168g.p2169a.C42130j;
import com.ss.android.lark.mail.impl.service.C43277a;
import com.ss.android.lark.mail.impl.utils.C43760c;
import com.ss.android.lark.mail.impl.utils.C43853v;
import com.ss.android.lark.pb.mailentities.MailRequestBase;
import com.ss.android.lark.pb.mailentities.SharedEmailAccount;
import com.ss.android.lark.pb.mails.DeleteMailExternalContactRequest;
import com.ss.android.lark.pb.mails.DeleteMailExternalContactResponse;
import com.ss.android.lark.pb.mails.GetMessageSendStatusByMessageIDRequest;
import com.ss.android.lark.pb.mails.GetMessageSendStatusByMessageIDResponse;
import com.ss.android.lark.sdk.SdkSender;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.lark.mail.impl.g.c */
public class C42164c {
    /* renamed from: a */
    public static void m168272a(String str, String str2, IGetDataCallback<DeleteMailDraftResponse> iGetDataCallback, SdkSender.IParser iParser) {
        if (iParser == null) {
            ProtoAdapter<DeleteMailDraftResponse> protoAdapter = DeleteMailDraftResponse.ADAPTER;
            protoAdapter.getClass();
            iParser = new SdkSender.IParser() {
                /* class com.ss.android.lark.mail.impl.p2168g.$$Lambda$OhM8fB2M14tQNGN0Y_5tKlinidE */

                @Override // com.ss.android.lark.sdk.SdkSender.IParser
                public final Object parse(byte[] bArr) {
                    return ProtoAdapter.this.decode(bArr);
                }
            };
        }
        C42174d.m168343a(Command.DELETE_MAIL_DRAFT, new DeleteMailDraftRequest.C17002a().mo60068b(str).mo60066a(str2), iGetDataCallback, iParser);
    }

    /* renamed from: a */
    public static void m168277a(String str, List<String> list, IGetDataCallback<MailDeleteMultiDraftResponse> iGetDataCallback, SdkSender.IParser iParser) {
        if (iParser == null) {
            ProtoAdapter<MailDeleteMultiDraftResponse> protoAdapter = MailDeleteMultiDraftResponse.ADAPTER;
            protoAdapter.getClass();
            iParser = new SdkSender.IParser() {
                /* class com.ss.android.lark.mail.impl.p2168g.$$Lambda$OhM8fB2M14tQNGN0Y_5tKlinidE */

                @Override // com.ss.android.lark.sdk.SdkSender.IParser
                public final Object parse(byte[] bArr) {
                    return ProtoAdapter.this.decode(bArr);
                }
            };
        }
        C42174d.m168343a(Command.MAIL_DELETE_MULTI_DRAFT, new MailDeleteMultiDraftsRequest.C16698a().mo59314a(str).mo59315a(list), iGetDataCallback, iParser);
    }

    /* renamed from: a */
    public static void m168285a(boolean z, boolean z2, IGetDataCallback<MailGetAccountResponse> iGetDataCallback, SdkSender.IParser iParser) {
        if (iParser == null) {
            ProtoAdapter<MailGetAccountResponse> protoAdapter = MailGetAccountResponse.ADAPTER;
            protoAdapter.getClass();
            iParser = new SdkSender.IParser() {
                /* class com.ss.android.lark.mail.impl.p2168g.$$Lambda$OhM8fB2M14tQNGN0Y_5tKlinidE */

                @Override // com.ss.android.lark.sdk.SdkSender.IParser
                public final Object parse(byte[] bArr) {
                    return ProtoAdapter.this.decode(bArr);
                }
            };
        }
        MailGetAccountRequest.C16704a aVar = new MailGetAccountRequest.C16704a();
        aVar.f43168a = Boolean.valueOf(z);
        aVar.f43169b = Boolean.valueOf(z2);
        C42174d.m168343a(Command.MAIL_GET_ACCOUNT, aVar, iGetDataCallback, iParser);
    }

    /* renamed from: a */
    public static void m168268a(String str, IGetDataCallback<GetMessageSendStatusByMessageIDResponse> iGetDataCallback, SdkSender.IParser iParser) {
        if (iParser == null) {
            ProtoAdapter<GetMessageSendStatusByMessageIDResponse> protoAdapter = GetMessageSendStatusByMessageIDResponse.ADAPTER;
            protoAdapter.getClass();
            iParser = new SdkSender.IParser() {
                /* class com.ss.android.lark.mail.impl.p2168g.$$Lambda$OhM8fB2M14tQNGN0Y_5tKlinidE */

                @Override // com.ss.android.lark.sdk.SdkSender.IParser
                public final Object parse(byte[] bArr) {
                    return ProtoAdapter.this.decode(bArr);
                }
            };
        }
        SdkSender.sendPassThroughRequest(com.ss.android.lark.pb.improto.Command.MAIL_GET_MESSAGE_SEND_STATUS, new GetMessageSendStatusByMessageIDRequest.C49833a().mo173425a(str).mo173424a(m168262a()), iGetDataCallback, iParser);
    }

    /* renamed from: a */
    public static void m168283a(List<String> list, String str, List<String> list2, List<String> list3, int i, String str2, IGetDataCallback<MailMutMultiLabelResponse> iGetDataCallback, SdkSender.IParser iParser) {
        if (iParser == null) {
            iParser = new SdkSender.IParser<MailMutMultiLabelResponse>() {
                /* class com.ss.android.lark.mail.impl.p2168g.C42164c.C421651 */

                /* renamed from: a */
                public MailMutMultiLabelResponse parse(byte[] bArr) throws IOException {
                    return MailMutMultiLabelResponse.ADAPTER.decode(bArr);
                }
            };
        }
        MailMutMultiLabelRequest.C16836a aVar = new MailMutMultiLabelRequest.C16836a();
        aVar.f43302a = list;
        aVar.f43303b = list2;
        aVar.f43304c = list3;
        aVar.f43305d = str;
        if (i >= 0) {
            aVar.f43306e = ReportType.fromValue(i);
        }
        if (!TextUtils.isEmpty(str2)) {
            aVar.f43307f = str2;
        }
        C42174d.m168343a(Command.MAIL_MUT_MULTI_LABEL_REQUEST, aVar, iGetDataCallback, iParser);
    }

    /* renamed from: a */
    public static void m168276a(String str, List<String> list, long j, IGetDataCallback<PushMultiThreadAction.C41799a> iGetDataCallback, SdkSender.IParser iParser) {
        if (iParser == null) {
            iParser = new SdkSender.IParser<PushMultiThreadAction.C41799a>() {
                /* class com.ss.android.lark.mail.impl.p2168g.C42164c.AnonymousClass11 */

                /* renamed from: a */
                public PushMultiThreadAction.C41799a parse(byte[] bArr) throws IOException {
                    MailGetMultiThreadItemsResponse decode = MailGetMultiThreadItemsResponse.ADAPTER.decode(bArr);
                    return new PushMultiThreadAction.C41799a(C42130j.m168150a().mo152085a(decode.thread_items), decode.disappeared_thread_ids);
                }
            };
        }
        C42174d.m168343a(Command.MAIL_GET_MULTI_THREAD_ITEMS, new MailGetMultiThreadItemsRequest.C16750a().mo59437a(str).mo59438a(list).mo59436a(Long.valueOf(j)), iGetDataCallback, iParser);
    }

    /* renamed from: a */
    public static void m168275a(final String str, ArrayList<String> arrayList, String str2, IGetDataCallback<C42099l> iGetDataCallback, SdkSender.IParser iParser) {
        if (iParser == null) {
            iParser = new SdkSender.IParser<C42099l>() {
                /* class com.ss.android.lark.mail.impl.p2168g.C42164c.AnonymousClass33 */

                /* renamed from: a */
                public C42099l parse(byte[] bArr) throws IOException {
                    return C42164c.m168259a(MailGetMessageListResponse.ADAPTER.decode(bArr), str);
                }
            };
        }
        C42174d.m168343a(Command.MAIL_GET_MESSAGE_LIST_FROM_DB, new MailGetMessageListRequest.C16742a().mo59417a(str).mo59420b(str2).mo59418a(arrayList), iGetDataCallback, iParser);
    }

    /* renamed from: a */
    public static void m168266a(MailDraft mailDraft, boolean z, IGetDataCallback<MailDraft> iGetDataCallback, SdkSender.IParser iParser) {
        SdkSender.IParser r0 = iParser == null ? new SdkSender.IParser<MailDraft>() {
            /* class com.ss.android.lark.mail.impl.p2168g.C42164c.C421695 */

            /* renamed from: a */
            public MailDraft parse(byte[] bArr) throws IOException {
                return C42130j.m168150a().mo152078a(MailUpdateDraftResponse.ADAPTER.decode(bArr).draft);
            }
        } : iParser;
        Draft a = C42130j.m168150a().mo152073a(mailDraft);
        MailUpdateDraftRequest.C16944a aVar = new MailUpdateDraftRequest.C16944a();
        aVar.mo59865a(a.id);
        MailUpdateDraftRequest.Payload payload = new MailUpdateDraftRequest.Payload(a.from, a.to, a.cc, a.bcc, a.body_html, a.body_plaintext, a.subject, a.images, a.attachments, a.docs_permissions, a.thread_id, a.is_send_separately);
        aVar.mo59864a(Boolean.valueOf(z));
        aVar.mo59863a(payload);
        C42174d.m168343a(Command.MAIL_UPDATE_DRAFT, aVar, iGetDataCallback, r0);
    }

    /* renamed from: a */
    public static void m168273a(String str, String str2, String str3, String str4, IGetDataCallback<MailCreateDocResponse> iGetDataCallback, SdkSender.IParser iParser) {
        Log.m165388i("createDoc");
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            Log.m165382e("createDoc invalid data");
            return;
        }
        if (iParser == null) {
            iParser = new SdkSender.IParser<MailCreateDocResponse>() {
                /* class com.ss.android.lark.mail.impl.p2168g.C42164c.C421706 */

                /* renamed from: a */
                public MailCreateDocResponse parse(byte[] bArr) throws IOException {
                    return MailCreateDocResponse.ADAPTER.decode(bArr);
                }
            };
        }
        MailCreateDocRequest.C16660a aVar = new MailCreateDocRequest.C16660a();
        aVar.mo59216a(str).mo59218b(str2).mo59219c(str3).mo59220d(str4);
        C42174d.m168343a(Command.MAIL_CREATE_DOC, aVar, iGetDataCallback, iParser);
    }

    /* renamed from: a */
    public static void m168281a(List<String> list, IGetDataCallback iGetDataCallback, SdkSender.IParser iParser) {
        if (iParser == null) {
            iParser = new SdkSender.IParser<MailGetDocsByUrlsResponse>() {
                /* class com.ss.android.lark.mail.impl.p2168g.C42164c.C421717 */

                /* renamed from: a */
                public MailGetDocsByUrlsResponse parse(byte[] bArr) throws IOException {
                    return MailGetDocsByUrlsResponse.ADAPTER.decode(bArr);
                }
            };
        }
        MailGetDocsByUrlsRequest.C16708a aVar = new MailGetDocsByUrlsRequest.C16708a();
        aVar.mo59338a(list);
        C42174d.m168343a(Command.MAIL_GET_DOCS_BY_URLS, aVar, iGetDataCallback, iParser);
    }

    /* renamed from: a */
    public static void m168282a(List<String> list, String str, String str2, IGetDataCallback iGetDataCallback, SdkSender.IParser iParser) {
        if (iParser == null) {
            iParser = new SdkSender.IParser<MailMoveMultiLabelResponse>() {
                /* class com.ss.android.lark.mail.impl.p2168g.C42164c.C421728 */

                /* renamed from: a */
                public MailMoveMultiLabelResponse parse(byte[] bArr) throws IOException {
                    return MailMoveMultiLabelResponse.ADAPTER.decode(bArr);
                }
            };
        }
        MailMoveMultiLabelRequest.C16824a aVar = new MailMoveMultiLabelRequest.C16824a();
        aVar.f43292b = str;
        aVar.f43293c = str2;
        aVar.f43291a = list;
        C42174d.m168343a(Command.MAIL_MOVE_MULTI_LABEL_REQUEST, aVar, iGetDataCallback, iParser);
    }

    /* renamed from: a */
    public static void m168278a(String str, List<MailMessage> list, String str2, boolean z, boolean z2, String str3, IGetDataCallback iGetDataCallback, SdkSender.IParser iParser) {
        Log.m165388i("fetchTranslation");
        if (TextUtils.isEmpty(str) || CollectionUtils.isEmpty(list)) {
            Log.m165382e("fetchTranslation invalid data");
            return;
        }
        SdkSender.IParser r0 = iParser == null ? new SdkSender.IParser<MailTranslateMessagesResponse>() {
            /* class com.ss.android.lark.mail.impl.p2168g.C42164c.C421739 */

            /* renamed from: a */
            public MailTranslateMessagesResponse parse(byte[] bArr) throws IOException {
                return MailTranslateMessagesResponse.ADAPTER.decode(bArr);
            }
        } : iParser;
        boolean f = C43853v.m173848f();
        ArrayList arrayList = new ArrayList();
        for (MailMessage mailMessage : list) {
            if (!(mailMessage == null || TextUtils.isEmpty(mailMessage.mo151581b()) || mailMessage.mo151553F() == null)) {
                arrayList.add(new MailTranslateMessagesRequest.TranslateMessage(mailMessage.mo151581b(), str, Boolean.valueOf(mailMessage.mo151550C()), mailMessage.mo151553F(), Boolean.valueOf(f), str3));
            }
        }
        MailTranslateMessagesRequest.C16916a aVar = new MailTranslateMessagesRequest.C16916a();
        aVar.mo59797a(arrayList).mo59796a(str2).mo59795a(Boolean.valueOf(z));
        if (!z2) {
            List<String> d = C43853v.m173846d();
            if (CollectionUtils.isNotEmpty(d)) {
                aVar.mo59799b(d);
            }
        }
        C42174d.m168343a(Command.MAIL_TRANSLATE_MESSAGES, aVar, iGetDataCallback, r0);
    }

    /* renamed from: a */
    public static void m168274a(String str, String str2, boolean z, IGetDataCallback iGetDataCallback, SdkSender.IParser iParser) {
        if (iParser == null) {
            iParser = new SdkSender.IParser<MailUnsubscribeResponse>() {
                /* class com.ss.android.lark.mail.impl.p2168g.C42164c.AnonymousClass14 */

                /* renamed from: a */
                public MailUnsubscribeResponse parse(byte[] bArr) throws IOException {
                    return MailUnsubscribeResponse.ADAPTER.decode(bArr);
                }
            };
        }
        MailUnsubscribeRequest.C16926a aVar = new MailUnsubscribeRequest.C16926a();
        aVar.mo59821a(str).mo59823b(str2).mo59820a(Boolean.valueOf(z));
        SdkSender.asynSendRequestNonWrap(Command.MAIL_UNSUBSCRIBE, aVar, iGetDataCallback, iParser);
    }

    /* renamed from: a */
    public static void m168269a(String str, CreateDraft createDraft, IGetDataCallback iGetDataCallback, SdkSender.IParser iParser) {
        Log.m165388i("createSendToChatMessageDraft");
        if (TextUtils.isEmpty(str) || createDraft == null || TextUtils.isEmpty(createDraft.mo151071b()) || iGetDataCallback == null) {
            Log.m165382e("createSendToChatMessageDraft invalid parameters");
            return;
        }
        if (iParser == null) {
            iParser = new SdkSender.IParser<MailCreateForwardMessageDraftResponse>() {
                /* class com.ss.android.lark.mail.impl.p2168g.C42164c.AnonymousClass15 */

                /* renamed from: a */
                public MailCreateForwardMessageDraftResponse parse(byte[] bArr) throws IOException {
                    return MailCreateForwardMessageDraftResponse.ADAPTER.decode(bArr);
                }
            };
        }
        MailCreateForwardMessageDraftRequest.C16668a aVar = new MailCreateForwardMessageDraftRequest.C16668a();
        aVar.mo59242a(createDraft.mo151071b()).mo59244b(str).mo59240a(createDraft.mo151072c()).mo59245c(createDraft.mo151077g()).mo59241a(Boolean.valueOf(!C41970e.m166941d().mo150951a()));
        String a = C43760c.m173464a(createDraft.mo151075e(), createDraft.mo151076f());
        if (!TextUtils.isEmpty(a)) {
            aVar.f43134d = a;
        }
        C42174d.m168343a(Command.MAIL_CREATE_FORWARD_MESSAGE_DRAFT, aVar, iGetDataCallback, iParser);
    }

    /* renamed from: a */
    public static void m168280a(String str, boolean z, IGetDataCallback iGetDataCallback, SdkSender.IParser iParser) {
        if (iParser == null) {
            iParser = new SdkSender.IParser<MailMessage>() {
                /* class com.ss.android.lark.mail.impl.p2168g.C42164c.AnonymousClass16 */

                /* renamed from: a */
                public MailMessage parse(byte[] bArr) throws IOException {
                    return C42130j.m168150a().mo152080a(MailGetMessageItemResponse.ADAPTER.decode(bArr).message);
                }
            };
        }
        MailGetMessageItemRequest.C16736a aVar = new MailGetMessageItemRequest.C16736a();
        aVar.f43198a = str;
        aVar.f43199b = Boolean.valueOf(z);
        C42174d.m168343a(Command.MAIL_GET_MESSAGE_ITEM, aVar, iGetDataCallback, iParser);
    }

    /* renamed from: a */
    public static void m168279a(String str, List<String> list, List<String> list2, String str2, boolean z, IGetDataCallback iGetDataCallback, SdkSender.IParser iParser) {
        Log.m165388i("forwardToChat");
        if (TextUtils.isEmpty(str) || CollectionUtils.isEmpty(list) || CollectionUtils.isEmpty(list2)) {
            Log.m165382e("forwardToChat invalid parameters");
            return;
        }
        if (iParser == null) {
            iParser = new SdkSender.IParser<MailSendCardResponse>() {
                /* class com.ss.android.lark.mail.impl.p2168g.C42164c.AnonymousClass20 */

                /* renamed from: a */
                public MailSendCardResponse parse(byte[] bArr) throws IOException {
                    return MailSendCardResponse.ADAPTER.decode(bArr);
                }
            };
        }
        MailSendCardRequest.C17038a aVar = new MailSendCardRequest.C17038a();
        aVar.mo60157a(str).mo60158a(list).mo60161b(list2).mo60162c(list2).mo60160b(str2).mo60156a(Boolean.valueOf(z));
        C42174d.m168343a(Command.MAIL_SEND_CARD_REQUEST, aVar, iGetDataCallback, iParser);
    }

    /* renamed from: a */
    public static void m168267a(String str, int i, IGetDataCallback iGetDataCallback, SdkSender.IParser iParser) {
        if (iParser == null) {
            iParser = new SdkSender.IParser<MailReplyCalendarEventResponse>() {
                /* class com.ss.android.lark.mail.impl.p2168g.C42164c.AnonymousClass24 */

                /* renamed from: a */
                public MailReplyCalendarEventResponse parse(byte[] bArr) throws IOException {
                    return MailReplyCalendarEventResponse.ADAPTER.decode(bArr);
                }
            };
        }
        MailReplyCalendarEventRequest.C16862a aVar = new MailReplyCalendarEventRequest.C16862a();
        aVar.mo59675a(str);
        aVar.mo59674a(MailReplyCalendarEventRequest.Option.fromValue(i));
        C42174d.m168343a(Command.MAIL_REPLY_CALENDAR_EVENT, aVar, iGetDataCallback, iParser);
    }

    /* renamed from: a */
    public static void m168271a(String str, String str2, int i, IGetDataCallback iGetDataCallback, SdkSender.IParser iParser) {
        if (iParser == null) {
            iParser = new SdkSender.IParser<MailUpdateOutboxActionResponse>() {
                /* class com.ss.android.lark.mail.impl.p2168g.C42164c.AnonymousClass29 */

                /* renamed from: a */
                public MailUpdateOutboxActionResponse parse(byte[] bArr) throws IOException {
                    return MailUpdateOutboxActionResponse.ADAPTER.decode(bArr);
                }
            };
        }
        MailUpdateOutboxActionRequest.C16956a aVar = new MailUpdateOutboxActionRequest.C16956a();
        aVar.mo59893b(str).mo59891a(str2).mo59890a(MailUpdateOutboxActionRequest.OutboxAction.fromValue(i));
        C42174d.m168343a(Command.MAIL_UPDATE_OUTBOX_ACTION_REQUEST, aVar, iGetDataCallback, iParser);
    }

    /* renamed from: a */
    public static void m168284a(boolean z, String str, IGetDataCallback<MailGetSignatureResponse> iGetDataCallback) {
        C42174d.m168343a(Command.MAIL_GET_SIGNATURE, new MailGetSignaturesRequest.C16778a().mo59496a(Boolean.valueOf(z)).mo59497a(str), iGetDataCallback, new SdkSender.IParser<MailGetSignatureResponse>() {
            /* class com.ss.android.lark.mail.impl.p2168g.C42164c.AnonymousClass32 */

            /* renamed from: a */
            public MailGetSignatureResponse parse(byte[] bArr) throws IOException {
                return MailGetSignatureResponse.ADAPTER.decode(bArr);
            }
        });
    }

    /* renamed from: a */
    public static void m168270a(String str, EntSignatureUsage entSignatureUsage, IGetDataCallback<MailUpdateSignatureUsageResponse> iGetDataCallback) {
        MailUpdateSignatureUsageRequest.C16960a aVar = new MailUpdateSignatureUsageRequest.C16960a();
        aVar.mo59902a(str);
        aVar.mo59901a(C42130j.m168150a().mo152074a(entSignatureUsage));
        C42174d.m168343a(Command.MAIL_UPDATE_SIGNATURE_USAGE, aVar, iGetDataCallback, new SdkSender.IParser<MailUpdateSignatureUsageResponse>() {
            /* class com.ss.android.lark.mail.impl.p2168g.C42164c.AnonymousClass34 */

            /* renamed from: a */
            public MailUpdateSignatureUsageResponse parse(byte[] bArr) throws IOException {
                return MailUpdateSignatureUsageResponse.ADAPTER.decode(bArr);
            }
        });
    }

    /* renamed from: a */
    private static MailRequestBase m168262a() {
        C42093e l = C43277a.m171921a().mo154948l();
        SharedEmailAccount.C49825a aVar = new SharedEmailAccount.C49825a();
        if (l != null) {
            aVar.mo173402a(Long.valueOf(Long.parseLong(l.mo151848b()))).mo173406c(l.mo151851c()).mo173403a(l.mo151855e()).mo173405b(l.mo151853d());
        }
        return new MailRequestBase.C49821a().mo173393a(aVar.build()).build();
    }

    /* renamed from: a */
    public static void m168263a(IGetDataCallback iGetDataCallback, SdkSender.IParser iParser) {
        if (iParser == null) {
            iParser = new SdkSender.IParser<MailLastVersionNewUserFlagResponse>() {
                /* class com.ss.android.lark.mail.impl.p2168g.C42164c.AnonymousClass31 */

                /* renamed from: a */
                public MailLastVersionNewUserFlagResponse parse(byte[] bArr) throws IOException {
                    return MailLastVersionNewUserFlagResponse.ADAPTER.decode(bArr);
                }
            };
        }
        MailLastVersionNewUserFlagRequest.C16820a aVar = new MailLastVersionNewUserFlagRequest.C16820a();
        aVar.build();
        C42174d.m168343a(Command.MAIL_GET_LAST_VERSION_NEW_USER_FLAG, aVar, iGetDataCallback, iParser);
    }

    /* renamed from: a */
    public static C42099l m168259a(MailGetMessageListResponse mailGetMessageListResponse, String str) {
        C42099l lVar = new C42099l();
        lVar.mo151981b(C42130j.m168150a().mo152086b(mailGetMessageListResponse.drafts));
        lVar.mo151977a(C42130j.m168150a().mo152087c(mailGetMessageListResponse.message_items));
        lVar.mo151976a(str);
        lVar.mo151974a(mailGetMessageListResponse.code);
        lVar.mo151978a(mailGetMessageListResponse.is_external.booleanValue());
        lVar.mo151975a(mailGetMessageListResponse.security_level);
        lVar.mo151987d(mailGetMessageListResponse.label_ids);
        lVar.mo151982b(mailGetMessageListResponse.is_flagged.booleanValue());
        lVar.mo151980b(mailGetMessageListResponse.subject);
        lVar.mo151985c(mailGetMessageListResponse.is_read.booleanValue());
        return lVar;
    }

    /* renamed from: a */
    public static ByteArray m168260a(String str, int i) {
        return (ByteArray) SdkSender.sendRequest(Command.INTEGRATION_SEARCH, new IntegrationSearchRequest.C18831a().mo64662a(str).mo64661a(Integer.valueOf(i)).mo64664b(Integer.valueOf(i + 19)).mo64660a(Scene.Type.SEARCH_CHATTERS), new SdkSender.IParser<ByteArray>() {
            /* class com.ss.android.lark.mail.impl.p2168g.C42164c.C421673 */

            /* renamed from: a */
            public ByteArray parse(byte[] bArr) throws IOException {
                ByteArray byteArray = new ByteArray();
                byteArray.mo154622a(bArr);
                return byteArray;
            }
        });
    }

    /* renamed from: c */
    public static void m168294c(String str, IGetDataCallback iGetDataCallback, SdkSender.IParser iParser) {
        if (iParser == null) {
            iParser = new SdkSender.IParser<List<MailSmartReplyInfo>>() {
                /* class com.ss.android.lark.mail.impl.p2168g.C42164c.AnonymousClass12 */

                /* renamed from: a */
                public List<MailSmartReplyInfo> parse(byte[] bArr) throws IOException {
                    MailGetSmartReplyResponse decode = MailGetSmartReplyResponse.ADAPTER.decode(bArr);
                    if (decode == null || CollectionUtils.isEmpty(decode.smart_reply_msgs_info)) {
                        return null;
                    }
                    return decode.smart_reply_msgs_info;
                }
            };
        }
        MailGetSmartReplyRequest.C16784a aVar = new MailGetSmartReplyRequest.C16784a();
        aVar.f43255a = str;
        C42174d.m168343a(Command.MAIL_GET_SMART_REPLY, aVar, iGetDataCallback, iParser);
    }

    /* renamed from: d */
    public static void m168296d(String str, IGetDataCallback iGetDataCallback, SdkSender.IParser iParser) {
        if (iParser == null) {
            iParser = new SdkSender.IParser<MailRecallMessageResponse>() {
                /* class com.ss.android.lark.mail.impl.p2168g.C42164c.AnonymousClass13 */

                /* renamed from: a */
                public MailRecallMessageResponse parse(byte[] bArr) throws IOException {
                    return MailRecallMessageResponse.ADAPTER.decode(bArr);
                }
            };
        }
        MailRecallMessageRequest.C16854a aVar = new MailRecallMessageRequest.C16854a();
        aVar.f43321a = str;
        C42174d.m168343a(Command.MAIL_RECALL, aVar, iGetDataCallback, iParser);
    }

    /* renamed from: g */
    public static void m168302g(String str, IGetDataCallback iGetDataCallback, SdkSender.IParser iParser) {
        if (!TextUtils.isEmpty(str)) {
            if (iParser == null) {
                iParser = new SdkSender.IParser<MailCancelShareThreadResponse>() {
                    /* class com.ss.android.lark.mail.impl.p2168g.C42164c.AnonymousClass26 */

                    /* renamed from: a */
                    public MailCancelShareThreadResponse parse(byte[] bArr) throws IOException {
                        return MailCancelShareThreadResponse.ADAPTER.decode(bArr);
                    }
                };
            }
            MailCancelShareThreadRequest.C16650a aVar = new MailCancelShareThreadRequest.C16650a();
            aVar.mo59191a(str);
            C42174d.m168343a(Command.MAIL_CANCEL_SHARE_THREAD, aVar, iGetDataCallback, iParser);
        }
    }

    /* renamed from: h */
    public static void m168303h(String str, IGetDataCallback iGetDataCallback, SdkSender.IParser iParser) {
        if (iParser == null) {
            iParser = new SdkSender.IParser<MailGetRecallDetailResponse>() {
                /* class com.ss.android.lark.mail.impl.p2168g.C42164c.AnonymousClass27 */

                /* renamed from: a */
                public MailGetRecallDetailResponse parse(byte[] bArr) throws IOException {
                    return MailGetRecallDetailResponse.ADAPTER.decode(bArr);
                }
            };
        }
        MailGetRecallDetailRequest.C16762a aVar = new MailGetRecallDetailRequest.C16762a();
        aVar.f43232a = str;
        C42174d.m168343a(Command.MAIL_GET_RECALL_DETAIL, aVar, iGetDataCallback, iParser);
    }

    /* renamed from: b */
    public static void m168287b(String str, IGetDataCallback<DeleteMailExternalContactResponse> iGetDataCallback, SdkSender.IParser iParser) {
        if (iParser == null) {
            ProtoAdapter<DeleteMailExternalContactResponse> protoAdapter = DeleteMailExternalContactResponse.ADAPTER;
            protoAdapter.getClass();
            iParser = new SdkSender.IParser() {
                /* class com.ss.android.lark.mail.impl.p2168g.$$Lambda$OhM8fB2M14tQNGN0Y_5tKlinidE */

                @Override // com.ss.android.lark.sdk.SdkSender.IParser
                public final Object parse(byte[] bArr) {
                    return ProtoAdapter.this.decode(bArr);
                }
            };
        }
        SdkSender.sendPassThroughRequest(com.ss.android.lark.pb.improto.Command.MAIL_DELETE_MAIL_EXTERNAL_CONTACT, new DeleteMailExternalContactRequest.C49829a().mo173415a(str).mo173414a(m168262a()), iGetDataCallback, iParser);
    }

    /* renamed from: e */
    public static void m168298e(String str, IGetDataCallback iGetDataCallback, SdkSender.IParser iParser) {
        Log.m165388i("fetchShareOwnerInfo");
        if (TextUtils.isEmpty(str)) {
            Log.m165382e("fetchShareOwnerInfo invalid thread id");
            return;
        }
        if (iParser == null) {
            iParser = new SdkSender.IParser<MailGetShareThreadOwnerInfoResponse>() {
                /* class com.ss.android.lark.mail.impl.p2168g.C42164c.AnonymousClass21 */

                /* renamed from: a */
                public MailGetShareThreadOwnerInfoResponse parse(byte[] bArr) throws IOException {
                    return MailGetShareThreadOwnerInfoResponse.ADAPTER.decode(bArr);
                }
            };
        }
        MailGetShareThreadOwnerInfoRequest.C16772a aVar = new MailGetShareThreadOwnerInfoRequest.C16772a();
        aVar.f43245a = str;
        C42174d.m168343a(Command.MAIL_GET_SHARE_THREAD_OWNER_INFO, aVar, iGetDataCallback, iParser);
    }

    /* renamed from: f */
    public static void m168300f(String str, IGetDataCallback iGetDataCallback, SdkSender.IParser iParser) {
        Log.m165388i("fetchCollaboratorList");
        if (TextUtils.isEmpty(str)) {
            Log.m165382e("fetchCollaboratorList invalid thread");
            return;
        }
        if (iParser == null) {
            iParser = new SdkSender.IParser<MailGetThreadCollaboratorsInfoResponse>() {
                /* class com.ss.android.lark.mail.impl.p2168g.C42164c.AnonymousClass23 */

                /* renamed from: a */
                public MailGetThreadCollaboratorsInfoResponse parse(byte[] bArr) throws IOException {
                    return MailGetThreadCollaboratorsInfoResponse.ADAPTER.decode(bArr);
                }
            };
        }
        MailGetThreadCollaboratorsInfoRequest.C16796a aVar = new MailGetThreadCollaboratorsInfoRequest.C16796a();
        aVar.mo59534a(str);
        C42174d.m168343a(Command.MAIL_GET_THREAD_COLLABORATORS_INFO, aVar, iGetDataCallback, iParser);
    }

    /* renamed from: b */
    public static void m168286b(CreateDraft createDraft, IGetDataCallback<MailCreateShareMessageDraftResponse> iGetDataCallback, SdkSender.IParser iParser) {
        Log.m165389i("MailRustMulProcessConver", "createShareMessageDraft");
        if (iParser == null) {
            iParser = new SdkSender.IParser<MailCreateShareMessageDraftResponse>() {
                /* class com.ss.android.lark.mail.impl.p2168g.C42164c.AnonymousClass38 */

                /* renamed from: a */
                public MailCreateShareMessageDraftResponse parse(byte[] bArr) throws IOException {
                    return MailCreateShareMessageDraftResponse.ADAPTER.decode(bArr);
                }
            };
        }
        MailCreateShareMessageDraftRequest.C16676a aVar = new MailCreateShareMessageDraftRequest.C16676a();
        aVar.mo59264b(createDraft.mo151070a()).mo59262a(createDraft.mo151071b()).mo59261a(createDraft.mo151072c());
        String a = C43760c.m173464a(createDraft.mo151075e(), createDraft.mo151076f());
        if (!TextUtils.isEmpty(a)) {
            aVar.mo59265c(a);
        }
        SdkSender.asynSendRequestNonWrap(Command.MAIL_CREATE_SHARE_MESSAGE_DRAFT, aVar, iGetDataCallback, iParser);
    }

    /* renamed from: a */
    public static void m168264a(CreateDraft createDraft, IGetDataCallback<MailDraft> iGetDataCallback, SdkSender.IParser iParser) {
        if (iParser == null) {
            iParser = new SdkSender.IParser<MailDraft>() {
                /* class com.ss.android.lark.mail.impl.p2168g.C42164c.AnonymousClass36 */

                /* renamed from: a */
                public MailDraft parse(byte[] bArr) throws IOException {
                    return C42130j.m168150a().mo152078a(MailCreateDraftResponse.ADAPTER.decode(bArr).draft);
                }
            };
        }
        MailCreateDraftRequest.C16664a aVar = new MailCreateDraftRequest.C16664a();
        if (!TextUtils.isEmpty(createDraft.mo151071b())) {
            aVar.mo59230a(createDraft.mo151071b());
        }
        if (!TextUtils.isEmpty(createDraft.mo151070a())) {
            aVar.mo59232b(createDraft.mo151070a());
        }
        if (!TextUtils.isEmpty(createDraft.mo151073d())) {
            aVar.f43127d = createDraft.mo151073d();
        }
        String a = C43760c.m173464a(createDraft.mo151075e(), createDraft.mo151076f());
        if (!TextUtils.isEmpty(a)) {
            aVar.f43128e = a;
        }
        aVar.mo59228a(createDraft.mo151072c());
        aVar.mo59229a(Boolean.valueOf(!C41970e.m166941d().mo150951a()));
        C42174d.m168343a(Command.MAIL_CREATE_DRAFT, aVar, iGetDataCallback, iParser);
    }

    /* renamed from: b */
    public static void m168292b(List<String> list, IGetDataCallback iGetDataCallback, SdkSender.IParser iParser) {
        if (iParser == null) {
            iParser = new SdkSender.IParser<MailDeleteLargeFileResponse>() {
                /* class com.ss.android.lark.mail.impl.p2168g.C42164c.AnonymousClass10 */

                /* renamed from: a */
                public MailDeleteLargeFileResponse parse(byte[] bArr) throws IOException {
                    return MailDeleteLargeFileResponse.ADAPTER.decode(bArr);
                }
            };
        }
        C42174d.m168343a(Command.MAIL_DELETE_LARGE_FILE, new MailDeleteLargeFileRequest.C16692a().mo59301a(list), iGetDataCallback, iParser);
    }

    /* renamed from: b */
    public static void m168288b(String str, String str2, IGetDataCallback<MailThread> iGetDataCallback, SdkSender.IParser iParser) {
        if (iParser == null) {
            iParser = new SdkSender.IParser<MailThread>() {
                /* class com.ss.android.lark.mail.impl.p2168g.C42164c.AnonymousClass22 */

                /* renamed from: a */
                public MailThread parse(byte[] bArr) throws IOException {
                    return C42130j.m168150a().mo152081a(MailGetThreadItemResponse.ADAPTER.decode(bArr).thread_item);
                }
            };
        }
        C42174d.m168343a(Command.MAIL_GET_THREAD_ITEM, new MailGetThreadItemRequest.C16800a().mo59545b(str).mo59543a(str2), iGetDataCallback, iParser);
    }

    /* renamed from: e */
    public static void m168299e(String str, String str2, IGetDataCallback iGetDataCallback, SdkSender.IParser iParser) {
        if (iParser == null) {
            iParser = new SdkSender.IParser<MailGetMessageListResponse>() {
                /* class com.ss.android.lark.mail.impl.p2168g.C42164c.AnonymousClass19 */

                /* renamed from: a */
                public MailGetMessageListResponse parse(byte[] bArr) throws IOException {
                    return MailGetMessageListResponse.ADAPTER.decode(bArr);
                }
            };
        }
        MailGetForwardMessageListRequest.C16718a aVar = new MailGetForwardMessageListRequest.C16718a();
        aVar.mo59363b(str2).mo59361a(str);
        C42174d.m168343a(Command.MAIL_GET_FORWARD_MESSAGE_LIST_FROM_DB, aVar, iGetDataCallback, iParser);
    }

    /* renamed from: f */
    public static void m168301f(String str, String str2, IGetDataCallback iGetDataCallback, SdkSender.IParser iParser) {
        if (iParser == null) {
            iParser = new SdkSender.IParser<MailAtContactResponse>() {
                /* class com.ss.android.lark.mail.impl.p2168g.C42164c.AnonymousClass25 */

                /* renamed from: a */
                public MailAtContactResponse parse(byte[] bArr) throws IOException {
                    return MailAtContactResponse.ADAPTER.decode(bArr);
                }
            };
        }
        Log.m165388i("fetchMentionContact");
        MailAtContactRequest.C16638a aVar = new MailAtContactRequest.C16638a();
        aVar.mo59164b(str);
        aVar.mo59162a(str2);
        C42174d.m168343a(Command.MAIL_AT_CONTACT_SEARCH, aVar, iGetDataCallback, iParser);
    }

    /* renamed from: c */
    public static void m168295c(String str, String str2, IGetDataCallback<MailDraft> iGetDataCallback, SdkSender.IParser iParser) {
        if (iParser == null) {
            iParser = new SdkSender.IParser<MailDraft>() {
                /* class com.ss.android.lark.mail.impl.p2168g.C42164c.AnonymousClass37 */

                /* renamed from: a */
                public MailDraft parse(byte[] bArr) throws IOException {
                    return C42130j.m168150a().mo152078a(MailEditMessageResponse.ADAPTER.decode(bArr).draft);
                }
            };
        }
        MailEditMessageRequest.C16700a aVar = new MailEditMessageRequest.C16700a();
        aVar.mo59322b(str).mo59320a(str2);
        C42174d.m168343a(Command.MAIL_EDIT_MESSAGE, aVar, iGetDataCallback, iParser);
    }

    /* renamed from: d */
    public static void m168297d(String str, String str2, IGetDataCallback iGetDataCallback, SdkSender.IParser iParser) {
        if (iParser == null) {
            iParser = new SdkSender.IParser<MailGetMessageListResponse>() {
                /* class com.ss.android.lark.mail.impl.p2168g.C42164c.AnonymousClass18 */

                /* renamed from: a */
                public MailGetMessageListResponse parse(byte[] bArr) throws IOException {
                    return MailGetMessageListResponse.ADAPTER.decode(bArr);
                }
            };
        }
        MailGetForwardMessageListFromNetRequest.C16716a aVar = new MailGetForwardMessageListFromNetRequest.C16716a();
        aVar.mo59357b(str2).mo59355a(str);
        C42174d.m168343a(Command.MAIL_GET_FORWARD_MESSAGE_LIST_FROM_NET, aVar, iGetDataCallback, iParser);
    }

    /* renamed from: a */
    public static ByteArray m168261a(String str, int i, int i2, String str2) {
        return (ByteArray) SdkSender.sendRequest(Command.MAIL_CONTACT_SEARCH, new MailContactSearchRequest.C16654a().mo59200a(Integer.valueOf(i)).mo59203b(Integer.valueOf(i2)).mo59201a(str).mo59204b(str2), new SdkSender.IParser<ByteArray>() {
            /* class com.ss.android.lark.mail.impl.p2168g.C42164c.C421662 */

            /* renamed from: a */
            public ByteArray parse(byte[] bArr) throws IOException {
                ByteArray byteArray = new ByteArray();
                byteArray.mo154622a(bArr);
                return byteArray;
            }
        });
    }

    /* renamed from: b */
    public static void m168290b(String str, List<String> list, IGetDataCallback iGetDataCallback, SdkSender.IParser iParser) {
        if (!CollectionUtils.isEmpty(list)) {
            if ("TRASH".equals(str) || "SPAM".equals(str)) {
                if (iParser == null) {
                    iParser = new SdkSender.IParser<MailMultiThreadDeletePermanentlyResponse>() {
                        /* class com.ss.android.lark.mail.impl.p2168g.C42164c.AnonymousClass28 */

                        /* renamed from: a */
                        public MailMultiThreadDeletePermanentlyResponse parse(byte[] bArr) throws IOException {
                            return MailMultiThreadDeletePermanentlyResponse.ADAPTER.decode(bArr);
                        }
                    };
                }
                MailMultiThreadDeletePermanentlyRequest.C16832a aVar = new MailMultiThreadDeletePermanentlyRequest.C16832a();
                aVar.mo59610a(str).mo59611a(list);
                C42174d.m168343a(Command.MAIL_MULTI_THREADS_DELETE_PERMANENTLY, aVar, iGetDataCallback, iParser);
            }
        }
    }

    /* renamed from: b */
    public static void m168291b(String str, boolean z, IGetDataCallback iGetDataCallback, SdkSender.IParser iParser) {
        if (iParser == null) {
            iParser = new SdkSender.IParser<MailGetMessageFullBodyResponse>() {
                /* class com.ss.android.lark.mail.impl.p2168g.C42164c.AnonymousClass17 */

                /* renamed from: a */
                public MailGetMessageFullBodyResponse parse(byte[] bArr) throws IOException {
                    return MailGetMessageFullBodyResponse.ADAPTER.decode(bArr);
                }
            };
        }
        MailGetMessageFullBodyRequest.C16732a aVar = new MailGetMessageFullBodyRequest.C16732a();
        aVar.f43194a = str;
        aVar.f43195b = Boolean.valueOf(z);
        C42174d.m168343a(Command.MAIL_GET_MESSAGE_FULL_BODY, aVar, iGetDataCallback, iParser);
    }

    /* renamed from: a */
    public static void m168265a(MailDraft mailDraft, String str, IGetDataCallback<MailSendDraftResponse> iGetDataCallback, SdkSender.IParser iParser) {
        if (iParser == null) {
            iParser = new SdkSender.IParser<MailSendDraftResponse>() {
                /* class com.ss.android.lark.mail.impl.p2168g.C42164c.C421684 */

                /* renamed from: a */
                public MailSendDraftResponse parse(byte[] bArr) throws IOException {
                    return MailSendDraftResponse.ADAPTER.decode(bArr);
                }
            };
        }
        MailSendDraftRequest.C16884a aVar = new MailSendDraftRequest.C16884a();
        aVar.mo59725a(C42130j.m168150a().mo152073a(mailDraft));
        if (mailDraft.mo151319D() > 0) {
            aVar.mo59726a(Long.valueOf(mailDraft.mo151319D()));
        }
        if (!TextUtils.isEmpty(str)) {
            aVar.mo59727a(str);
        }
        C42174d.m168343a(Command.MAIL_SEND_DRAFT, aVar, iGetDataCallback, iParser);
    }

    /* renamed from: a */
    public static MailContactSearchResponse m168258a(String str, int i, int i2, String str2, SdkSender.IParser iParser) {
        if (iParser == null) {
            iParser = new SdkSender.IParser<MailContactSearchResponse>() {
                /* class com.ss.android.lark.mail.impl.p2168g.C42164c.AnonymousClass39 */

                /* renamed from: a */
                public MailContactSearchResponse parse(byte[] bArr) throws IOException {
                    return MailContactSearchResponse.ADAPTER.decode(bArr);
                }
            };
        }
        return (MailContactSearchResponse) SdkSender.sendRequest(Command.MAIL_CONTACT_SEARCH, new MailContactSearchRequest.C16654a().mo59200a(Integer.valueOf(i)).mo59203b(Integer.valueOf(i2)).mo59201a(str).mo59204b(str2), iParser);
    }

    /* renamed from: b */
    public static void m168289b(final String str, ArrayList<String> arrayList, String str2, IGetDataCallback<C42099l> iGetDataCallback, SdkSender.IParser iParser) {
        if (iParser == null) {
            iParser = new SdkSender.IParser<C42099l>() {
                /* class com.ss.android.lark.mail.impl.p2168g.C42164c.AnonymousClass35 */

                /* renamed from: a */
                public C42099l parse(byte[] bArr) throws IOException {
                    return C42164c.m168259a(MailGetMessageListResponse.ADAPTER.decode(bArr), str);
                }
            };
        }
        C42174d.m168343a(Command.MAIL_GET_MESSAGE_LIST_FROM_NET, new MailGetMessageListFromNetRequest.C16740a().mo59410a(str).mo59413b(str2).mo59411a(arrayList), iGetDataCallback, iParser);
    }

    /* renamed from: b */
    public static void m168293b(List<String> list, String str, String str2, IGetDataCallback iGetDataCallback, SdkSender.IParser iParser) {
        if (iParser == null) {
            iParser = new SdkSender.IParser<MailMoveToFolderResponse>() {
                /* class com.ss.android.lark.mail.impl.p2168g.C42164c.AnonymousClass30 */

                /* renamed from: a */
                public MailMoveToFolderResponse parse(byte[] bArr) throws IOException {
                    return MailMoveToFolderResponse.ADAPTER.decode(bArr);
                }
            };
        }
        MailMoveToFolderRequest.C16828a aVar = new MailMoveToFolderRequest.C16828a();
        aVar.f43296a = list;
        aVar.f43297b = str;
        aVar.f43298c = str2;
        C42174d.m168343a(Command.MAIL_MOVE_FOLDER, aVar, iGetDataCallback, iParser);
    }
}
