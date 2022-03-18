package com.ss.android.lark.mail.impl.p2168g;

import android.text.TextUtils;
import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.basic.v1.DisplayRule;
import com.bytedance.lark.pb.basic.v1.SendHttpRequest;
import com.bytedance.lark.pb.basic.v1.SendHttpResponse;
import com.bytedance.lark.pb.basic.v1.SyncDataStrategy;
import com.bytedance.lark.pb.calendar.v1.GetTimezoneByCityResponse;
import com.bytedance.lark.pb.email.client.v1.FilterType;
import com.bytedance.lark.pb.email.client.v1.MailAccount;
import com.bytedance.lark.pb.email.client.v1.MailAddCollaboratorsRequest;
import com.bytedance.lark.pb.email.client.v1.MailAddCollaboratorsResponse;
import com.bytedance.lark.pb.email.client.v1.MailAddFolderRequest;
import com.bytedance.lark.pb.email.client.v1.MailAddFolderResponse;
import com.bytedance.lark.pb.email.client.v1.MailAddLabelRequest;
import com.bytedance.lark.pb.email.client.v1.MailAddLabelResponse;
import com.bytedance.lark.pb.email.client.v1.MailAtContactResponse;
import com.bytedance.lark.pb.email.client.v1.MailCanSendExternalRequest;
import com.bytedance.lark.pb.email.client.v1.MailCanSendExternalResponse;
import com.bytedance.lark.pb.email.client.v1.MailCancelScheduleSendRequest;
import com.bytedance.lark.pb.email.client.v1.MailCancelScheduleSendResponse;
import com.bytedance.lark.pb.email.client.v1.MailCancelShareThreadResponse;
import com.bytedance.lark.pb.email.client.v1.MailContactSearchResponse;
import com.bytedance.lark.pb.email.client.v1.MailCreateDraftResponse;
import com.bytedance.lark.pb.email.client.v1.MailCreateForwardMessageDraftResponse;
import com.bytedance.lark.pb.email.client.v1.MailCreateShareMessageDraftResponse;
import com.bytedance.lark.pb.email.client.v1.MailCreateShareThreadRequest;
import com.bytedance.lark.pb.email.client.v1.MailCreateShareThreadResponse;
import com.bytedance.lark.pb.email.client.v1.MailDeleteFolderRequest;
import com.bytedance.lark.pb.email.client.v1.MailDeleteFolderResponse;
import com.bytedance.lark.pb.email.client.v1.MailDeleteLabelRequest;
import com.bytedance.lark.pb.email.client.v1.MailDeleteLabelResponse;
import com.bytedance.lark.pb.email.client.v1.MailDeleteLargeFileResponse;
import com.bytedance.lark.pb.email.client.v1.MailDeleteMultiDraftResponse;
import com.bytedance.lark.pb.email.client.v1.MailEditMessageResponse;
import com.bytedance.lark.pb.email.client.v1.MailGetAccountResponse;
import com.bytedance.lark.pb.email.client.v1.MailGetDocsByUrlsResponse;
import com.bytedance.lark.pb.email.client.v1.MailGetDraftItemRequest;
import com.bytedance.lark.pb.email.client.v1.MailGetDraftItemResponse;
import com.bytedance.lark.pb.email.client.v1.MailGetLabelThreadsEnoughRequest;
import com.bytedance.lark.pb.email.client.v1.MailGetLabelThreadsEnoughResponse;
import com.bytedance.lark.pb.email.client.v1.MailGetLabelsRequest;
import com.bytedance.lark.pb.email.client.v1.MailGetLabelsResponse;
import com.bytedance.lark.pb.email.client.v1.MailGetLargeFileCanShareToExternalRequest;
import com.bytedance.lark.pb.email.client.v1.MailGetLargeFileCanShareToExternalResponse;
import com.bytedance.lark.pb.email.client.v1.MailGetMessageFullBodyResponse;
import com.bytedance.lark.pb.email.client.v1.MailGetMessageItemResponse;
import com.bytedance.lark.pb.email.client.v1.MailGetMessageListResponse;
import com.bytedance.lark.pb.email.client.v1.MailGetMigrationDetailsRequest;
import com.bytedance.lark.pb.email.client.v1.MailGetMigrationDetailsResponse;
import com.bytedance.lark.pb.email.client.v1.MailGetMultiThreadItemsResponse;
import com.bytedance.lark.pb.email.client.v1.MailGetOAuthURLRequest;
import com.bytedance.lark.pb.email.client.v1.MailGetOAuthURLResponse;
import com.bytedance.lark.pb.email.client.v1.MailGetRecallDetailResponse;
import com.bytedance.lark.pb.email.client.v1.MailGetScheduleMessageCountRequest;
import com.bytedance.lark.pb.email.client.v1.MailGetScheduleMessageCountResponse;
import com.bytedance.lark.pb.email.client.v1.MailGetShareThreadOwnerInfoResponse;
import com.bytedance.lark.pb.email.client.v1.MailGetSignatureResponse;
import com.bytedance.lark.pb.email.client.v1.MailGetSmartInboxPreviewCardRequest;
import com.bytedance.lark.pb.email.client.v1.MailGetSmartInboxPreviewCardResponse;
import com.bytedance.lark.pb.email.client.v1.MailGetSmartReplyResponse;
import com.bytedance.lark.pb.email.client.v1.MailGetTenantDomainsRequest;
import com.bytedance.lark.pb.email.client.v1.MailGetTenantDomainsResponse;
import com.bytedance.lark.pb.email.client.v1.MailGetThreadCollaboratorsInfoResponse;
import com.bytedance.lark.pb.email.client.v1.MailGetThreadItemResponse;
import com.bytedance.lark.pb.email.client.v1.MailGetThreadListRequest;
import com.bytedance.lark.pb.email.client.v1.MailGetThreadListResponse;
import com.bytedance.lark.pb.email.client.v1.MailGetTimeZoneByCityRequest;
import com.bytedance.lark.pb.email.client.v1.MailGetUnreadCountRequest;
import com.bytedance.lark.pb.email.client.v1.MailGetUnreadCountResponse;
import com.bytedance.lark.pb.email.client.v1.MailLastVersionNewUserFlagResponse;
import com.bytedance.lark.pb.email.client.v1.MailMoveMultiLabelResponse;
import com.bytedance.lark.pb.email.client.v1.MailMoveToFolderResponse;
import com.bytedance.lark.pb.email.client.v1.MailMultiThreadDeletePermanentlyResponse;
import com.bytedance.lark.pb.email.client.v1.MailMutMultiLabelResponse;
import com.bytedance.lark.pb.email.client.v1.MailNoticeClientEventRequest;
import com.bytedance.lark.pb.email.client.v1.MailNoticeClientEventResponse;
import com.bytedance.lark.pb.email.client.v1.MailOpenEmlRequest;
import com.bytedance.lark.pb.email.client.v1.MailOpenEmlResponse;
import com.bytedance.lark.pb.email.client.v1.MailRecallMessageResponse;
import com.bytedance.lark.pb.email.client.v1.MailRefreshThreadListRequest;
import com.bytedance.lark.pb.email.client.v1.MailRefreshThreadListResponse;
import com.bytedance.lark.pb.email.client.v1.MailReplyCalendarEventRequest;
import com.bytedance.lark.pb.email.client.v1.MailReplyCalendarEventResponse;
import com.bytedance.lark.pb.email.client.v1.MailSearchShareMemberRequest;
import com.bytedance.lark.pb.email.client.v1.MailSearchShareMemberResponse;
import com.bytedance.lark.pb.email.client.v1.MailSelectAllRequest;
import com.bytedance.lark.pb.email.client.v1.MailSelectAllResponse;
import com.bytedance.lark.pb.email.client.v1.MailSendDraftResponse;
import com.bytedance.lark.pb.email.client.v1.MailShareAttachmentRequest;
import com.bytedance.lark.pb.email.client.v1.MailShareAttachmentResponse;
import com.bytedance.lark.pb.email.client.v1.MailSmartReplyInfo;
import com.bytedance.lark.pb.email.client.v1.MailSwitchAccountRequest;
import com.bytedance.lark.pb.email.client.v1.MailSwitchAccountResponse;
import com.bytedance.lark.pb.email.client.v1.MailTranslateMessagesResponse;
import com.bytedance.lark.pb.email.client.v1.MailUndoRequest;
import com.bytedance.lark.pb.email.client.v1.MailUndoResponse;
import com.bytedance.lark.pb.email.client.v1.MailUnsubscribeResponse;
import com.bytedance.lark.pb.email.client.v1.MailUpdateAccountRequest;
import com.bytedance.lark.pb.email.client.v1.MailUpdateAccountResponse;
import com.bytedance.lark.pb.email.client.v1.MailUpdateClientTabSettingRequest;
import com.bytedance.lark.pb.email.client.v1.MailUpdateClientTabSettingResponse;
import com.bytedance.lark.pb.email.client.v1.MailUpdateCollaboratorsRoleRequest;
import com.bytedance.lark.pb.email.client.v1.MailUpdateCollaboratorsRoleResponse;
import com.bytedance.lark.pb.email.client.v1.MailUpdateDraftResponse;
import com.bytedance.lark.pb.email.client.v1.MailUpdateFolderRequest;
import com.bytedance.lark.pb.email.client.v1.MailUpdateFolderResponse;
import com.bytedance.lark.pb.email.client.v1.MailUpdateLabelRequest;
import com.bytedance.lark.pb.email.client.v1.MailUpdateLabelResponse;
import com.bytedance.lark.pb.email.client.v1.MailUpdateOutboxActionRequest;
import com.bytedance.lark.pb.email.client.v1.MailUpdateOutboxActionResponse;
import com.bytedance.lark.pb.email.client.v1.MailUpdateSignatureUsageResponse;
import com.bytedance.lark.pb.email.client.v1.SetMailsAllReadRequest;
import com.bytedance.lark.pb.email.client.v1.SetMailsAllReadResponse;
import com.bytedance.lark.pb.email.client.v1.UserPayload;
import com.bytedance.lark.pb.email.v1.DeleteMailDraftResponse;
import com.bytedance.lark.pb.email.v1.MailSendCardResponse;
import com.bytedance.lark.pb.feed.v1.GetFeedCardsV2Response;
import com.bytedance.lark.pb.im.v1.GetTranslateLanguagesRequest;
import com.bytedance.lark.pb.im.v1.GetTranslateLanguagesResponse;
import com.bytedance.lark.pb.im.v1.SrcLanguageConfig;
import com.bytedance.lark.pb.search.v1.MultiLocalIntegrationSearchResponse;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.utils.CollectionUtils;
import com.squareup.wire.ProtoAdapter;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mail.impl.C41816b;
import com.ss.android.lark.mail.impl.action.PushMultiThreadAction;
import com.ss.android.lark.mail.impl.entity.C42096i;
import com.ss.android.lark.mail.impl.entity.C42099l;
import com.ss.android.lark.mail.impl.entity.CreateDraft;
import com.ss.android.lark.mail.impl.entity.EntSignatureUsage;
import com.ss.android.lark.mail.impl.entity.MailAddress;
import com.ss.android.lark.mail.impl.entity.MailDraft;
import com.ss.android.lark.mail.impl.entity.MailMessage;
import com.ss.android.lark.mail.impl.entity.MailThread;
import com.ss.android.lark.mail.impl.entity.TranslationSetting;
import com.ss.android.lark.mail.impl.message.plugin.translation.Language;
import com.ss.android.lark.mail.impl.mulprocess.C43213b;
import com.ss.android.lark.mail.impl.mulprocess.entity.ByteArray;
import com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService;
import com.ss.android.lark.mail.impl.p2168g.p2169a.C42130j;
import com.ss.android.lark.mail.impl.service.C43374f;
import com.ss.android.lark.mail.impl.utils.C43770l;
import com.ss.android.lark.mail.impl.utils.C43849u;
import com.ss.android.lark.mail.impl.widget.time.multitimezone.TimeZoneItemData;
import com.ss.android.lark.mail.impl.widget.time.multitimezone.TimeZoneUtils;
import com.ss.android.lark.pb.mails.DeleteMailExternalContactResponse;
import com.ss.android.lark.pb.mails.GetMessageSendStatusByMessageIDResponse;
import com.ss.android.lark.sdk.SdkSender;
import ee.android.framework.manis.C68183b;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* renamed from: com.ss.android.lark.mail.impl.g.e */
public class C42176e {

    /* renamed from: a */
    C42130j f107230a;

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.mail.impl.g.e$a */
    public static class C42186a {

        /* renamed from: a */
        public static final C42176e f107342a = new C42176e(null);
    }

    /* renamed from: a */
    public static C42176e m168344a() {
        return C42186a.f107342a;
    }

    /* renamed from: a */
    public void mo152203a(String str, final IGetDataCallback<GetMessageSendStatusByMessageIDResponse> iGetDataCallback) {
        if (C41816b.m166115a().mo150120a() == C43213b.f109974a) {
            C42164c.m168268a(str, iGetDataCallback, (SdkSender.IParser) null);
        } else {
            ((IRustService) C68183b.m264839a().mo237086a(C41816b.m166115a().mo150132b(), IRustService.class)).fetchSendStatus(str, new IRustService.AbstractC43219a() {
                /* class com.ss.android.lark.mail.impl.p2168g.C42176e.AnonymousClass12 */

                @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService.AbstractC43219a
                public void onFail() {
                }

                @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService.AbstractC43219a
                public void onSuc(ByteArray byteArray) {
                    try {
                        GetMessageSendStatusByMessageIDResponse decode = GetMessageSendStatusByMessageIDResponse.ADAPTER.decode(byteArray.mo154623a());
                        IGetDataCallback iGetDataCallback = iGetDataCallback;
                        if (iGetDataCallback != null) {
                            iGetDataCallback.onSuccess(decode);
                        }
                    } catch (IOException unused) {
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public void mo152221a(String str, Map<String, String> map, String str2, boolean z, IGetDataCallback<SendHttpResponse> iGetDataCallback) {
        SendHttpRequest.C15253a aVar = new SendHttpRequest.C15253a();
        aVar.mo55528a(str).mo55529a(map).mo55533c(str2).mo55526a(z ? SendHttpRequest.Method.POST : SendHttpRequest.Method.GET);
        Command command = Command.SEND_HTTP;
        ProtoAdapter<SendHttpResponse> protoAdapter = SendHttpResponse.ADAPTER;
        protoAdapter.getClass();
        C42174d.m168343a(command, aVar, iGetDataCallback, new SdkSender.IParser() {
            /* class com.ss.android.lark.mail.impl.p2168g.$$Lambda$nlGhYri8FPznwzigG1jXpA4FnXA */

            @Override // com.ss.android.lark.sdk.SdkSender.IParser
            public final Object parse(byte[] bArr) {
                return (SendHttpResponse) ProtoAdapter.this.decode(bArr);
            }
        });
    }

    /* renamed from: a */
    public void mo152199a(String str, long j, long j2, IGetDataCallback<Boolean> iGetDataCallback) {
        C42174d.m168343a(Command.MAIL_GET_LABEL_THREADS_ENOUGH, new MailGetLabelThreadsEnoughRequest.C16720a().mo59368a(str).mo59367a(Long.valueOf(j)).mo59370b(Long.valueOf(j2)), iGetDataCallback, new SdkSender.IParser<Boolean>() {
            /* class com.ss.android.lark.mail.impl.p2168g.C42176e.AnonymousClass33 */

            /* renamed from: a */
            public Boolean parse(byte[] bArr) throws IOException {
                return MailGetLabelThreadsEnoughResponse.ADAPTER.decode(bArr).enough;
            }
        });
    }

    /* renamed from: a */
    public void mo152207a(String str, String str2, final IGetDataCallback<DeleteMailDraftResponse> iGetDataCallback) {
        if (C41816b.m166115a().mo150120a() == C43213b.f109974a) {
            C42164c.m168272a(str, str2, iGetDataCallback, (SdkSender.IParser) null);
        } else {
            ((IRustService) C68183b.m264839a().mo237086a(C41816b.m166115a().mo150132b(), IRustService.class)).deleteDraft(str, str2, new IRustService.AbstractC43219a() {
                /* class com.ss.android.lark.mail.impl.p2168g.C42176e.AnonymousClass42 */

                @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService.AbstractC43219a
                public void onFail() {
                }

                @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService.AbstractC43219a
                public void onSuc(ByteArray byteArray) {
                    try {
                        DeleteMailDraftResponse decode = DeleteMailDraftResponse.ADAPTER.decode(byteArray.mo154623a());
                        IGetDataCallback iGetDataCallback = iGetDataCallback;
                        if (iGetDataCallback != null) {
                            iGetDataCallback.onSuccess(decode);
                        }
                    } catch (IOException unused) {
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public void mo152216a(String str, List<String> list, final IGetDataCallback<MailDeleteMultiDraftResponse> iGetDataCallback) {
        if (C41816b.m166115a().mo150120a() == C43213b.f109974a) {
            C42164c.m168277a(str, list, iGetDataCallback, (SdkSender.IParser) null);
        } else {
            ((IRustService) C68183b.m264839a().mo237086a(C41816b.m166115a().mo150132b(), IRustService.class)).deleteMultiDraft(str, list, new IRustService.AbstractC43219a() {
                /* class com.ss.android.lark.mail.impl.p2168g.C42176e.AnonymousClass53 */

                @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService.AbstractC43219a
                public void onFail() {
                }

                @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService.AbstractC43219a
                public void onSuc(ByteArray byteArray) {
                    try {
                        MailDeleteMultiDraftResponse decode = MailDeleteMultiDraftResponse.ADAPTER.decode(byteArray.mo154623a());
                        IGetDataCallback iGetDataCallback = iGetDataCallback;
                        if (iGetDataCallback != null) {
                            iGetDataCallback.onSuccess(decode);
                        }
                    } catch (IOException unused) {
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public void mo152201a(String str, FilterType filterType, long j, long j2, IGetDataCallback<C42096i> iGetDataCallback) {
        Log.m165388i("loadData getThreadList:");
        MailGetThreadListRequest.C16804a aVar = new MailGetThreadListRequest.C16804a();
        aVar.f43268b = str;
        aVar.f43269c = Long.valueOf(j);
        aVar.f43270d = Long.valueOf(j2);
        aVar.f43267a = filterType;
        C42174d.m168343a(Command.MAIL_GET_THREAD_LIST, aVar, iGetDataCallback, new SdkSender.IParser<C42096i>() {
            /* class com.ss.android.lark.mail.impl.p2168g.C42176e.AnonymousClass64 */

            /* renamed from: a */
            public C42096i parse(byte[] bArr) throws IOException {
                C42096i iVar = new C42096i();
                MailGetThreadListResponse decode = MailGetThreadListResponse.ADAPTER.decode(bArr);
                iVar.mo151945a(C42176e.this.f107230a.mo152085a(decode.thread_items));
                iVar.mo151946a(decode.is_last_page.booleanValue());
                iVar.mo151947b(decode.is_from_db.booleanValue());
                return iVar;
            }
        });
    }

    /* renamed from: a */
    public void mo152226a(List<String> list, String str, List<String> list2, List<String> list3, int i, String str2, final IGetDataCallback<MailMutMultiLabelResponse> iGetDataCallback) {
        if (C41816b.m166115a().mo150120a() == C43213b.f109974a) {
            C42164c.m168283a(list, str, list2, list3, i, str2, iGetDataCallback, (SdkSender.IParser) null);
        } else {
            ((IRustService) C68183b.m264839a().mo237086a(C41816b.m166115a().mo150132b(), IRustService.class)).moveThreadListLabel(list, str, list2, list3, i, str2, new IRustService.AbstractC43219a() {
                /* class com.ss.android.lark.mail.impl.p2168g.C42176e.C421793 */

                @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService.AbstractC43219a
                public void onFail() {
                }

                @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService.AbstractC43219a
                public void onSuc(ByteArray byteArray) {
                    try {
                        MailMutMultiLabelResponse decode = MailMutMultiLabelResponse.ADAPTER.decode(byteArray.mo154623a());
                        IGetDataCallback iGetDataCallback = iGetDataCallback;
                        if (iGetDataCallback != null) {
                            iGetDataCallback.onSuccess(decode);
                        }
                    } catch (IOException unused) {
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public void mo152213a(final String str, ArrayList<String> arrayList, String str2, final IGetDataCallback<C42099l> iGetDataCallback) {
        if (C41816b.m166115a().mo150120a() == C43213b.f109974a) {
            C42164c.m168275a(str, arrayList, str2, new IGetDataCallback<C42099l>() {
                /* class com.ss.android.lark.mail.impl.p2168g.C42176e.C421804 */

                /* renamed from: a */
                public void onSuccess(C42099l lVar) {
                    IGetDataCallback iGetDataCallback = iGetDataCallback;
                    if (iGetDataCallback != null) {
                        iGetDataCallback.onSuccess(lVar);
                    }
                }

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    IGetDataCallback iGetDataCallback = iGetDataCallback;
                    if (iGetDataCallback != null) {
                        iGetDataCallback.onError(errorResult);
                    }
                }
            }, (SdkSender.IParser) null);
        } else {
            ((IRustService) C68183b.m264839a().mo237086a(C41816b.m166115a().mo150132b(), IRustService.class)).getThreadInfoFromDB(str, arrayList, str2, new IRustService.AbstractC43219a() {
                /* class com.ss.android.lark.mail.impl.p2168g.C42176e.C421815 */

                @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService.AbstractC43219a
                public void onFail() {
                    IGetDataCallback iGetDataCallback = iGetDataCallback;
                    if (iGetDataCallback != null) {
                        iGetDataCallback.onError(new ErrorResult("onFail"));
                    }
                }

                @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService.AbstractC43219a
                public void onSuc(ByteArray byteArray) {
                    try {
                        C42099l a = C42176e.m168344a().mo152190a(MailGetMessageListResponse.ADAPTER.decode(byteArray.mo154623a()), str);
                        IGetDataCallback iGetDataCallback = iGetDataCallback;
                        if (iGetDataCallback != null) {
                            iGetDataCallback.onSuccess(a);
                        }
                    } catch (IOException unused) {
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public void mo152200a(String str, long j, boolean z, IGetDataCallback<MailSelectAllResponse> iGetDataCallback) {
        Log.m165388i("cleanAll labelID:" + str + " maxTimestamp:" + j + " isUnread:" + z);
        MailSelectAllRequest.C16880a aVar = new MailSelectAllRequest.C16880a();
        aVar.f43345a = str;
        aVar.f43347c = Long.valueOf(j + 1);
        aVar.f43351g = Boolean.valueOf(z);
        ArrayList arrayList = new ArrayList();
        arrayList.add("PERMANENT_DELETE");
        aVar.f43349e = arrayList;
        C42174d.m168343a(Command.MAIL_SELECT_ALL, aVar, iGetDataCallback, new SdkSender.IParser<MailSelectAllResponse>() {
            /* class com.ss.android.lark.mail.impl.p2168g.C42176e.AnonymousClass10 */

            /* renamed from: a */
            public MailSelectAllResponse parse(byte[] bArr) throws IOException {
                return MailSelectAllResponse.ADAPTER.decode(bArr);
            }
        });
    }

    /* renamed from: a */
    public void mo152215a(String str, List<String> list, long j, final IGetDataCallback<PushMultiThreadAction.C41799a> iGetDataCallback) {
        if (C41816b.m166115a().mo150120a() == C43213b.f109974a) {
            C42164c.m168276a(str, list, j, iGetDataCallback, (SdkSender.IParser) null);
        } else {
            ((IRustService) C68183b.m264839a().mo237086a(C41816b.m166115a().mo150132b(), IRustService.class)).getMultiThreadItem(str, list, j, new IRustService.AbstractC43219a() {
                /* class com.ss.android.lark.mail.impl.p2168g.C42176e.AnonymousClass13 */

                @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService.AbstractC43219a
                public void onFail() {
                }

                @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService.AbstractC43219a
                public void onSuc(ByteArray byteArray) {
                    try {
                        MailGetMultiThreadItemsResponse decode = MailGetMultiThreadItemsResponse.ADAPTER.decode(byteArray.mo154623a());
                        List<MailThread> a = C42130j.m168150a().mo152085a(decode.thread_items);
                        List<String> list = decode.disappeared_thread_ids;
                        IGetDataCallback iGetDataCallback = iGetDataCallback;
                        if (iGetDataCallback != null) {
                            iGetDataCallback.onSuccess(new PushMultiThreadAction.C41799a(a, list));
                        }
                    } catch (IOException unused) {
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public void mo152210a(String str, String str2, String str3, String str4, String str5, boolean z, IGetDataCallback<MailAddLabelResponse> iGetDataCallback) {
        MailAddLabelRequest.C16632a aVar = new MailAddLabelRequest.C16632a();
        aVar.f43069c = str2;
        aVar.f43068b = str3;
        aVar.f43067a = str4;
        aVar.f43070d = Boolean.valueOf(z);
        aVar.f43071e = str5;
        C42174d.m168343a(Command.MAIL_ADD_LABEL_REQUEST, aVar, iGetDataCallback, new SdkSender.IParser<MailAddLabelResponse>() {
            /* class com.ss.android.lark.mail.impl.p2168g.C42176e.AnonymousClass15 */

            /* renamed from: a */
            public MailAddLabelResponse parse(byte[] bArr) throws IOException {
                return MailAddLabelResponse.ADAPTER.decode(bArr);
            }
        });
    }

    /* renamed from: a */
    public void mo152209a(String str, String str2, String str3, String str4, String str5, String str6, boolean z, IGetDataCallback<MailUpdateLabelResponse> iGetDataCallback) {
        MailUpdateLabelRequest.C16952a aVar = new MailUpdateLabelRequest.C16952a();
        aVar.f43452a = str;
        aVar.f43455d = str4;
        aVar.f43454c = str5;
        aVar.f43453b = str6;
        aVar.f43458g = str2;
        aVar.f43456e = Boolean.valueOf(z);
        C42174d.m168343a(Command.MAIL_UPDATE_LABEL_REQUEST, aVar, iGetDataCallback, new SdkSender.IParser<MailUpdateLabelResponse>() {
            /* class com.ss.android.lark.mail.impl.p2168g.C42176e.AnonymousClass16 */

            /* renamed from: a */
            public MailUpdateLabelResponse parse(byte[] bArr) throws IOException {
                return MailUpdateLabelResponse.ADAPTER.decode(bArr);
            }
        });
    }

    /* renamed from: a */
    public void mo152202a(String str, MailReplyCalendarEventRequest.Option option, final IGetDataCallback<MailReplyCalendarEventResponse> iGetDataCallback) {
        if (C41816b.m166115a().mo150120a() == C43213b.f109974a) {
            C42164c.m168267a(str, option.getValue(), iGetDataCallback, (SdkSender.IParser) null);
        } else {
            ((IRustService) C68183b.m264839a().mo237086a(C41816b.m166115a().mo150132b(), IRustService.class)).replyCalendar(str, option.getValue(), new IRustService.AbstractC43219a() {
                /* class com.ss.android.lark.mail.impl.p2168g.C42176e.AnonymousClass24 */

                @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService.AbstractC43219a
                public void onFail() {
                }

                @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService.AbstractC43219a
                public void onSuc(ByteArray byteArray) {
                    try {
                        IGetDataCallback iGetDataCallback = iGetDataCallback;
                        if (iGetDataCallback != null) {
                            iGetDataCallback.onSuccess(MailReplyCalendarEventResponse.ADAPTER.decode(byteArray.mo154623a()));
                        }
                    } catch (IOException unused) {
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public void mo152224a(List<String> list, String str, IGetDataCallback<MailCancelScheduleSendResponse> iGetDataCallback) {
        MailCancelScheduleSendRequest.C16646a aVar = new MailCancelScheduleSendRequest.C16646a();
        if (!TextUtils.isEmpty(str)) {
            aVar.mo59181a(str);
        } else {
            aVar.mo59182a(list);
        }
        SdkSender.asynSendRequestNonWrap(Command.MAIL_CANCEL_SCHEDULE_SEND, aVar, iGetDataCallback, new SdkSender.IParser<MailCancelScheduleSendResponse>() {
            /* class com.ss.android.lark.mail.impl.p2168g.C42176e.AnonymousClass26 */

            /* renamed from: a */
            public MailCancelScheduleSendResponse parse(byte[] bArr) throws IOException {
                return MailCancelScheduleSendResponse.ADAPTER.decode(bArr);
            }
        });
    }

    /* renamed from: a */
    public void mo152223a(List<String> list, final IGetDataCallback iGetDataCallback) {
        if (C41816b.m166115a().mo150120a() == C43213b.f109974a) {
            C42164c.m168281a(list, iGetDataCallback, (SdkSender.IParser) null);
        } else {
            ((IRustService) C68183b.m264839a().mo237086a(C41816b.m166115a().mo150132b(), IRustService.class)).fetchDocInfo(list, new IRustService.AbstractC43219a() {
                /* class com.ss.android.lark.mail.impl.p2168g.C42176e.AnonymousClass30 */

                @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService.AbstractC43219a
                public void onFail() {
                }

                @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService.AbstractC43219a
                public void onSuc(ByteArray byteArray) {
                    try {
                        IGetDataCallback iGetDataCallback = iGetDataCallback;
                        if (iGetDataCallback != null) {
                            iGetDataCallback.onSuccess(MailGetDocsByUrlsResponse.ADAPTER.decode(byteArray.mo154623a()));
                        }
                    } catch (IOException unused) {
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public void mo152227a(boolean z, IGetDataCallback<MailGetOAuthURLResponse> iGetDataCallback) {
        C42174d.m168343a(Command.MAIL_GET_OAUTH_URL, new MailGetOAuthURLRequest.C16758a().mo59455a(z ? MailGetOAuthURLRequest.OAuthType.EXCHANGE : MailGetOAuthURLRequest.OAuthType.GOOGLE), iGetDataCallback, new SdkSender.IParser<MailGetOAuthURLResponse>() {
            /* class com.ss.android.lark.mail.impl.p2168g.C42176e.AnonymousClass31 */

            /* renamed from: a */
            public MailGetOAuthURLResponse parse(byte[] bArr) throws IOException {
                return MailGetOAuthURLResponse.ADAPTER.decode(bArr);
            }
        });
    }

    /* renamed from: b */
    public void mo152239b(boolean z, IGetDataCallback<MailUpdateClientTabSettingResponse> iGetDataCallback) {
        MailUpdateClientTabSettingRequest.C16934a aVar = new MailUpdateClientTabSettingRequest.C16934a();
        aVar.mo59840a(Boolean.valueOf(z));
        C42174d.m168343a(Command.MAIL_UPDATE_CLIENT_TAB_SETTING, aVar, iGetDataCallback, new SdkSender.IParser<MailUpdateClientTabSettingResponse>() {
            /* class com.ss.android.lark.mail.impl.p2168g.C42176e.AnonymousClass32 */

            /* renamed from: a */
            public MailUpdateClientTabSettingResponse parse(byte[] bArr) throws IOException {
                return MailUpdateClientTabSettingResponse.ADAPTER.decode(bArr);
            }
        });
    }

    /* renamed from: a */
    public void mo152206a(String str, String str2, MailUpdateOutboxActionRequest.OutboxAction outboxAction, final IGetDataCallback<MailUpdateOutboxActionResponse> iGetDataCallback) {
        if (C41816b.m166115a().mo150120a() == C43213b.f109974a) {
            C42164c.m168271a(str, str2, outboxAction.getValue(), iGetDataCallback, (SdkSender.IParser) null);
        } else {
            ((IRustService) C68183b.m264839a().mo237086a(C41816b.m166115a().mo150132b(), IRustService.class)).requestOutboxAction(str, str2, outboxAction.getValue(), new IRustService.AbstractC43219a() {
                /* class com.ss.android.lark.mail.impl.p2168g.C42176e.AnonymousClass34 */

                @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService.AbstractC43219a
                public void onFail() {
                }

                @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService.AbstractC43219a
                public void onSuc(ByteArray byteArray) {
                    try {
                        IGetDataCallback iGetDataCallback = iGetDataCallback;
                        if (iGetDataCallback != null) {
                            iGetDataCallback.onSuccess(MailUpdateOutboxActionResponse.ADAPTER.decode(byteArray.mo154623a()));
                        }
                    } catch (IOException unused) {
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public void mo152214a(String str, ArrayList<UserPayload> arrayList, boolean z, String str2, IGetDataCallback<MailCreateShareThreadResponse> iGetDataCallback) {
        Log.m165389i("MailRustService", "createShareThread");
        if (TextUtils.isEmpty(str)) {
            Log.m165389i("MailRustService", "createShareThread invalid parameters");
            return;
        }
        MailCreateShareThreadRequest.C16680a aVar = new MailCreateShareThreadRequest.C16680a();
        aVar.mo59274a(str).mo59275a(arrayList).mo59273a(Boolean.valueOf(z)).mo59277b(str2);
        C42174d.m168343a(Command.MAIL_CREATE_SHARE_THREAD, aVar, iGetDataCallback, new SdkSender.IParser<MailCreateShareThreadResponse>() {
            /* class com.ss.android.lark.mail.impl.p2168g.C42176e.AnonymousClass37 */

            /* renamed from: a */
            public MailCreateShareThreadResponse parse(byte[] bArr) throws IOException {
                return MailCreateShareThreadResponse.ADAPTER.decode(bArr);
            }
        });
    }

    /* renamed from: a */
    public void mo152218a(String str, List<UserPayload> list, String str2, boolean z, IGetDataCallback<MailAddCollaboratorsResponse> iGetDataCallback) {
        if (TextUtils.isEmpty(str) || CollectionUtils.isEmpty(list)) {
            Log.m165383e("MailRustService", "addCollaborators invalid parameters");
            return;
        }
        MailAddCollaboratorsRequest.C16624a aVar = new MailAddCollaboratorsRequest.C16624a();
        aVar.mo59131a(str).mo59132a(list).mo59130a(Boolean.valueOf(z)).mo59134b(str2);
        Command command = Command.MAIL_ADD_COLLABORATORS;
        ProtoAdapter<MailAddCollaboratorsResponse> protoAdapter = MailAddCollaboratorsResponse.ADAPTER;
        protoAdapter.getClass();
        C42174d.m168343a(command, aVar, iGetDataCallback, new SdkSender.IParser() {
            /* class com.ss.android.lark.mail.impl.p2168g.$$Lambda$wBJBdCmDd2_xxfYlKDsMarYSe4 */

            @Override // com.ss.android.lark.sdk.SdkSender.IParser
            public final Object parse(byte[] bArr) {
                return (MailAddCollaboratorsResponse) ProtoAdapter.this.decode(bArr);
            }
        });
    }

    /* renamed from: a */
    public void mo152220a(String str, List<String> list, List<String> list2, String str2, boolean z, final IGetDataCallback<MailSendCardResponse> iGetDataCallback) {
        if (C41816b.m166115a().mo150120a() == C43213b.f109974a) {
            C42164c.m168279a(str, list, list2, str2, z, iGetDataCallback, null);
        } else {
            ((IRustService) C68183b.m264839a().mo237086a(C41816b.m166115a().mo150132b(), IRustService.class)).forwardToChat(str, list, list2, str2, z, new IRustService.AbstractC43219a() {
                /* class com.ss.android.lark.mail.impl.p2168g.C42176e.AnonymousClass43 */

                @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService.AbstractC43219a
                public void onFail() {
                }

                @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService.AbstractC43219a
                public void onSuc(ByteArray byteArray) {
                    try {
                        IGetDataCallback iGetDataCallback = iGetDataCallback;
                        if (iGetDataCallback != null) {
                            iGetDataCallback.onSuccess(MailSendCardResponse.ADAPTER.decode(byteArray.mo154623a()));
                        }
                    } catch (IOException unused) {
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public void mo152217a(String str, List<String> list, final IGetDataCallback<MailMultiThreadDeletePermanentlyResponse> iGetDataCallback, SdkSender.IParser iParser) {
        if (C41816b.m166115a().mo150120a() == C43213b.f109974a) {
            C42164c.m168290b(str, list, iGetDataCallback, iParser);
        } else {
            ((IRustService) C68183b.m264839a().mo237086a(C41816b.m166115a().mo150132b(), IRustService.class)).deleteThreadPermanently(str, list, new IRustService.AbstractC43219a() {
                /* class com.ss.android.lark.mail.impl.p2168g.C42176e.AnonymousClass46 */

                @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService.AbstractC43219a
                public void onFail() {
                }

                @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService.AbstractC43219a
                public void onSuc(ByteArray byteArray) {
                    try {
                        IGetDataCallback iGetDataCallback = iGetDataCallback;
                        if (iGetDataCallback != null) {
                            iGetDataCallback.onSuccess(MailMultiThreadDeletePermanentlyResponse.ADAPTER.decode(byteArray.mo154623a()));
                        }
                    } catch (IOException unused) {
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public void mo152222a(String str, boolean z, final IGetDataCallback<MailGetMessageFullBodyResponse> iGetDataCallback) {
        if (C41816b.m166115a().mo150120a() == C43213b.f109974a) {
            C42164c.m168291b(str, z, iGetDataCallback, (SdkSender.IParser) null);
        } else {
            ((IRustService) C68183b.m264839a().mo237086a(C41816b.m166115a().mo150132b(), IRustService.class)).fetchMessageFullBody(str, z, new IRustService.AbstractC43219a() {
                /* class com.ss.android.lark.mail.impl.p2168g.C42176e.AnonymousClass47 */

                @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService.AbstractC43219a
                public void onFail() {
                }

                @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService.AbstractC43219a
                public void onSuc(ByteArray byteArray) {
                    try {
                        IGetDataCallback iGetDataCallback = iGetDataCallback;
                        if (iGetDataCallback != null) {
                            iGetDataCallback.onSuccess(MailGetMessageFullBodyResponse.ADAPTER.decode(byteArray.mo154623a()));
                        }
                    } catch (IOException unused) {
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public void mo152204a(String str, CreateDraft createDraft, final IGetDataCallback<MailCreateForwardMessageDraftResponse> iGetDataCallback) {
        if (C41816b.m166115a().mo150120a() == C43213b.f109974a) {
            C42164c.m168269a(str, createDraft, iGetDataCallback, (SdkSender.IParser) null);
        } else {
            ((IRustService) C68183b.m264839a().mo237086a(C41816b.m166115a().mo150132b(), IRustService.class)).createSendToChatMessageDraft(str, createDraft, new IRustService.AbstractC43219a() {
                /* class com.ss.android.lark.mail.impl.p2168g.C42176e.AnonymousClass49 */

                @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService.AbstractC43219a
                public void onFail() {
                }

                @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService.AbstractC43219a
                public void onSuc(ByteArray byteArray) {
                    try {
                        IGetDataCallback iGetDataCallback = iGetDataCallback;
                        if (iGetDataCallback != null) {
                            iGetDataCallback.onSuccess(MailCreateForwardMessageDraftResponse.ADAPTER.decode(byteArray.mo154623a()));
                        }
                    } catch (IOException unused) {
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public void mo152212a(String str, String str2, boolean z, final IGetDataCallback<MailUnsubscribeResponse> iGetDataCallback) {
        if (C41816b.m166115a().mo150120a() == C43213b.f109974a) {
            C42164c.m168274a(str, str2, z, iGetDataCallback, (SdkSender.IParser) null);
        } else {
            ((IRustService) C68183b.m264839a().mo237086a(C41816b.m166115a().mo150132b(), IRustService.class)).requestUnsubscribe(str, str2, z, new IRustService.AbstractC43219a() {
                /* class com.ss.android.lark.mail.impl.p2168g.C42176e.AnonymousClass52 */

                @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService.AbstractC43219a
                public void onFail() {
                    IGetDataCallback iGetDataCallback = iGetDataCallback;
                    if (iGetDataCallback != null) {
                        iGetDataCallback.onError(new ErrorResult("onFail"));
                    }
                }

                @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService.AbstractC43219a
                public void onSuc(ByteArray byteArray) {
                    try {
                        IGetDataCallback iGetDataCallback = iGetDataCallback;
                        if (iGetDataCallback != null) {
                            iGetDataCallback.onSuccess(MailUnsubscribeResponse.ADAPTER.decode(byteArray.mo154623a()));
                        }
                    } catch (IOException e) {
                        iGetDataCallback.onError(new ErrorResult(e.getMessage()));
                    }
                }
            });
        }
    }

    /* renamed from: b */
    public void mo152238b(List<String> list, final IGetDataCallback<MailDeleteLargeFileResponse> iGetDataCallback) {
        if (C41816b.m166115a().mo150120a() == C43213b.f109974a) {
            C42164c.m168292b(list, iGetDataCallback, (SdkSender.IParser) null);
        } else {
            ((IRustService) C68183b.m264839a().mo237086a(C41816b.m166115a().mo150132b(), IRustService.class)).removeLargeFileFromDrive(list, new IRustService.AbstractC43219a() {
                /* class com.ss.android.lark.mail.impl.p2168g.C42176e.AnonymousClass56 */

                @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService.AbstractC43219a
                public void onFail() {
                }

                @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService.AbstractC43219a
                public void onSuc(ByteArray byteArray) {
                    try {
                        IGetDataCallback iGetDataCallback = iGetDataCallback;
                        if (iGetDataCallback != null) {
                            iGetDataCallback.onSuccess(MailDeleteLargeFileResponse.ADAPTER.decode(byteArray.mo154623a()));
                        }
                    } catch (IOException unused) {
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public void mo152219a(String str, List<MailMessage> list, String str2, boolean z, boolean z2, String str3, final IGetDataCallback<MailTranslateMessagesResponse> iGetDataCallback) {
        Log.m165389i("MailRustService", "fetchTranslation");
        if (C41816b.m166115a().mo150120a() == C43213b.f109974a) {
            C42164c.m168278a(str, list, str2, z, z2, str3, iGetDataCallback, (SdkSender.IParser) null);
        } else {
            ((IRustService) C68183b.m264839a().mo237086a(C41816b.m166115a().mo150132b(), IRustService.class)).fetchTranslation(str, list, str2, z, z2, str3, new IRustService.AbstractC43219a() {
                /* class com.ss.android.lark.mail.impl.p2168g.C42176e.AnonymousClass57 */

                @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService.AbstractC43219a
                public void onFail() {
                }

                @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService.AbstractC43219a
                public void onSuc(ByteArray byteArray) {
                    try {
                        IGetDataCallback iGetDataCallback = iGetDataCallback;
                        if (iGetDataCallback != null) {
                            iGetDataCallback.onSuccess(MailTranslateMessagesResponse.ADAPTER.decode(byteArray.mo154623a()));
                        }
                    } catch (IOException unused) {
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public void mo152229a(boolean z, boolean z2, final IGetDataCallback<MailGetAccountResponse> iGetDataCallback) {
        if (C41816b.m166115a().mo150120a() == C43213b.f109974a) {
            C42164c.m168285a(z, z2, iGetDataCallback, (SdkSender.IParser) null);
        } else {
            ((IRustService) C68183b.m264839a().mo237086a(C41816b.m166115a().mo150132b(), IRustService.class)).getAccountList(z, z2, new IRustService.AbstractC43219a() {
                /* class com.ss.android.lark.mail.impl.p2168g.C42176e.AnonymousClass58 */

                @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService.AbstractC43219a
                public void onFail() {
                }

                @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService.AbstractC43219a
                public void onSuc(ByteArray byteArray) {
                    try {
                        MailGetAccountResponse decode = MailGetAccountResponse.ADAPTER.decode(byteArray.mo154623a());
                        IGetDataCallback iGetDataCallback = iGetDataCallback;
                        if (iGetDataCallback != null) {
                            iGetDataCallback.onSuccess(decode);
                        }
                    } catch (IOException unused) {
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public void mo152211a(String str, String str2, List<String> list, IGetDataCallback<MailShareAttachmentResponse> iGetDataCallback) {
        Log.m165389i("MailRustService", "shareDriveFile");
        MailShareAttachmentRequest.C16890a aVar = new MailShareAttachmentRequest.C16890a();
        aVar.mo59740a(str).mo59743b(str2).mo59741a(list);
        Command command = Command.MAIL_SHARE_ATTACHMENT;
        ProtoAdapter<MailShareAttachmentResponse> protoAdapter = MailShareAttachmentResponse.ADAPTER;
        protoAdapter.getClass();
        C42174d.m168343a(command, aVar, iGetDataCallback, new SdkSender.IParser() {
            /* class com.ss.android.lark.mail.impl.p2168g.$$Lambda$Wewx912IC5uitc_A5vqQOC9GEw */

            @Override // com.ss.android.lark.sdk.SdkSender.IParser
            public final Object parse(byte[] bArr) {
                return (MailShareAttachmentResponse) ProtoAdapter.this.decode(bArr);
            }
        });
    }

    /* renamed from: a */
    public void mo152208a(String str, String str2, String str3, Long l, IGetDataCallback<MailUpdateFolderResponse> iGetDataCallback) {
        MailUpdateFolderRequest.C16948a aVar = new MailUpdateFolderRequest.C16948a();
        aVar.f43447a = str;
        aVar.f43448b = str2;
        aVar.f43449c = str3;
        aVar.f43450d = l;
        C42174d.m168343a(Command.MAIL_UPDATE_FOLDER, aVar, iGetDataCallback, new SdkSender.IParser<MailUpdateFolderResponse>() {
            /* class com.ss.android.lark.mail.impl.p2168g.C42176e.AnonymousClass63 */

            /* renamed from: a */
            public MailUpdateFolderResponse parse(byte[] bArr) throws IOException {
                return MailUpdateFolderResponse.ADAPTER.decode(bArr);
            }
        });
    }

    /* renamed from: a */
    public void mo152225a(List<String> list, String str, String str2, final IGetDataCallback<MailMoveToFolderResponse> iGetDataCallback) {
        Log.m165388i("moveToFolder fromFolder:" + str + " toFolder:" + str2);
        if (C41816b.m166115a().mo150120a() != C43213b.f109974a) {
            ((IRustService) C68183b.m264839a().mo237086a(C41816b.m166115a().mo150132b(), IRustService.class)).moveToAggregation(list, str, str2, new IRustService.AbstractC43219a() {
                /* class com.ss.android.lark.mail.impl.p2168g.C42176e.AnonymousClass67 */

                @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService.AbstractC43219a
                public void onFail() {
                }

                @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService.AbstractC43219a
                public void onSuc(ByteArray byteArray) {
                    try {
                        IGetDataCallback iGetDataCallback = iGetDataCallback;
                        if (iGetDataCallback != null) {
                            iGetDataCallback.onSuccess(MailMoveToFolderResponse.ADAPTER.decode(byteArray.mo154623a()));
                        }
                    } catch (IOException unused) {
                    }
                }
            });
        } else if (C43374f.m172264f().mo155125m()) {
            C42164c.m168293b(list, str, str2, iGetDataCallback, (SdkSender.IParser) null);
        } else {
            C42164c.m168282a(list, str, str2, iGetDataCallback, new SdkSender.IParser() {
                /* class com.ss.android.lark.mail.impl.p2168g.C42176e.AnonymousClass66 */

                @Override // com.ss.android.lark.sdk.SdkSender.IParser
                public Object parse(byte[] bArr) throws IOException {
                    return new MailMoveToFolderResponse(MailMoveMultiLabelResponse.ADAPTER.decode(bArr).uuid);
                }
            });
        }
    }

    /* renamed from: a */
    public void mo152228a(boolean z, String str, IGetDataCallback<MailGetSignatureResponse> iGetDataCallback) {
        C42164c.m168284a(z, str, iGetDataCallback);
    }

    /* renamed from: a */
    public void mo152205a(String str, EntSignatureUsage entSignatureUsage, IGetDataCallback<MailUpdateSignatureUsageResponse> iGetDataCallback) {
        C42164c.m168270a(str, entSignatureUsage, iGetDataCallback);
    }

    private C42176e() {
        this.f107230a = C42130j.m168150a();
    }

    /* renamed from: c */
    public void mo152240c() {
        MailNoticeClientEventRequest.C16840a aVar = new MailNoticeClientEventRequest.C16840a();
        aVar.mo59628a(MailNoticeClientEventRequest.Event.MAIL_PAGE_INACTIVE).mo59629a(Long.valueOf(System.currentTimeMillis()));
        C42174d.m168343a(Command.MAIL_NOTICE_CLIENT_EVENT_REQUEST, aVar, null, new SdkSender.IParser<MailNoticeClientEventResponse>() {
            /* class com.ss.android.lark.mail.impl.p2168g.C42176e.AnonymousClass40 */

            /* renamed from: a */
            public MailNoticeClientEventResponse parse(byte[] bArr) throws IOException {
                return MailNoticeClientEventResponse.ADAPTER.decode(bArr);
            }
        });
    }

    /* renamed from: b */
    public void mo152230b() {
        MailNoticeClientEventRequest.C16840a aVar = new MailNoticeClientEventRequest.C16840a();
        aVar.mo59628a(MailNoticeClientEventRequest.Event.MAIL_PAGE_ACTIVE).mo59629a(Long.valueOf(System.currentTimeMillis()));
        C42174d.m168343a(Command.MAIL_NOTICE_CLIENT_EVENT_REQUEST, aVar, null, new SdkSender.IParser<MailNoticeClientEventResponse>() {
            /* class com.ss.android.lark.mail.impl.p2168g.C42176e.AnonymousClass39 */

            /* renamed from: a */
            public MailNoticeClientEventResponse parse(byte[] bArr) throws IOException {
                return MailNoticeClientEventResponse.ADAPTER.decode(bArr);
            }
        });
    }

    /* synthetic */ C42176e(C421771 r1) {
        this();
    }

    /* renamed from: com.ss.android.lark.mail.impl.g.e$1 */
    class C421771 implements SdkSender.IParser<MultiLocalIntegrationSearchResponse> {
        /* renamed from: a */
        public MultiLocalIntegrationSearchResponse parse(byte[] bArr) throws IOException {
            return MultiLocalIntegrationSearchResponse.ADAPTER.decode(bArr);
        }
    }

    /* renamed from: a */
    public void mo152193a(IGetDataCallback<MailGetLabelsResponse> iGetDataCallback) {
        C42174d.m168343a(Command.MAIL_GET_LABELS, new MailGetLabelsRequest.C16724a(), iGetDataCallback, new SdkSender.IParser<MailGetLabelsResponse>() {
            /* class com.ss.android.lark.mail.impl.p2168g.C42176e.AnonymousClass14 */

            /* renamed from: a */
            public MailGetLabelsResponse parse(byte[] bArr) throws IOException {
                return MailGetLabelsResponse.ADAPTER.decode(bArr);
            }
        });
    }

    /* renamed from: b */
    public void mo152231b(IGetDataCallback<MailGetScheduleMessageCountResponse> iGetDataCallback) {
        SdkSender.asynSendRequestNonWrap(Command.MAIL_GET_SCHEDULE_SEND_MESSAGE_COUNT, new MailGetScheduleMessageCountRequest.C16768a(), iGetDataCallback, new SdkSender.IParser<MailGetScheduleMessageCountResponse>() {
            /* class com.ss.android.lark.mail.impl.p2168g.C42176e.AnonymousClass27 */

            /* renamed from: a */
            public MailGetScheduleMessageCountResponse parse(byte[] bArr) throws IOException {
                return MailGetScheduleMessageCountResponse.ADAPTER.decode(bArr);
            }
        });
    }

    /* renamed from: c */
    public void mo152241c(IGetDataCallback<MailGetMigrationDetailsResponse> iGetDataCallback) {
        MailGetMigrationDetailsRequest.C16746a aVar = new MailGetMigrationDetailsRequest.C16746a();
        Command command = Command.MAIL_GET_MIGRATION_DETAILS;
        ProtoAdapter<MailGetMigrationDetailsResponse> protoAdapter = MailGetMigrationDetailsResponse.ADAPTER;
        protoAdapter.getClass();
        C42174d.m168343a(command, aVar, iGetDataCallback, new SdkSender.IParser() {
            /* class com.ss.android.lark.mail.impl.p2168g.$$Lambda$7YFEilF1MMGzJmWY9R1Y3FWpqo */

            @Override // com.ss.android.lark.sdk.SdkSender.IParser
            public final Object parse(byte[] bArr) {
                return (MailGetMigrationDetailsResponse) ProtoAdapter.this.decode(bArr);
            }
        });
    }

    /* renamed from: d */
    public void mo152246d(IGetDataCallback<MailGetTenantDomainsResponse> iGetDataCallback) {
        MailGetTenantDomainsRequest.C16792a aVar = new MailGetTenantDomainsRequest.C16792a();
        Command command = Command.MAIL_GET_TENANT_DOMAINS;
        ProtoAdapter<MailGetTenantDomainsResponse> protoAdapter = MailGetTenantDomainsResponse.ADAPTER;
        protoAdapter.getClass();
        C42174d.m168343a(command, aVar, iGetDataCallback, new SdkSender.IParser() {
            /* class com.ss.android.lark.mail.impl.p2168g.$$Lambda$UTQHvEoLKvwXkVgvZgYxxF1LILA */

            @Override // com.ss.android.lark.sdk.SdkSender.IParser
            public final Object parse(byte[] bArr) {
                return (MailGetTenantDomainsResponse) ProtoAdapter.this.decode(bArr);
            }
        });
    }

    /* renamed from: e */
    public void mo152249e(IGetDataCallback<MailGetLargeFileCanShareToExternalResponse> iGetDataCallback) {
        MailGetLargeFileCanShareToExternalRequest.C16728a aVar = new MailGetLargeFileCanShareToExternalRequest.C16728a();
        Command command = Command.MAIL_GET_LARGE_FILE_CAN_SHARE_TO_EXTERNAL;
        ProtoAdapter<MailGetLargeFileCanShareToExternalResponse> protoAdapter = MailGetLargeFileCanShareToExternalResponse.ADAPTER;
        protoAdapter.getClass();
        C42174d.m168343a(command, aVar, iGetDataCallback, new SdkSender.IParser() {
            /* class com.ss.android.lark.mail.impl.p2168g.$$Lambda$cIahMpQ6_oWN7eJjjG1D2gS5a9M */

            @Override // com.ss.android.lark.sdk.SdkSender.IParser
            public final Object parse(byte[] bArr) {
                return (MailGetLargeFileCanShareToExternalResponse) ProtoAdapter.this.decode(bArr);
            }
        });
    }

    /* renamed from: f */
    public void mo152252f(IGetDataCallback<TranslationSetting> iGetDataCallback) {
        C42174d.m168343a(Command.GET_TRANSLATE_LANGUAGES_SETTING, new GetTranslateLanguagesRequest.C17729a().mo61896a(SyncDataStrategy.FORCE_SERVER), iGetDataCallback, new SdkSender.IParser<TranslationSetting>() {
            /* class com.ss.android.lark.mail.impl.p2168g.C42176e.AnonymousClass60 */

            /* renamed from: a */
            public TranslationSetting parse(byte[] bArr) throws IOException {
                DisplayRule displayRule;
                int i;
                SrcLanguageConfig srcLanguageConfig;
                GetTranslateLanguagesResponse decode = GetTranslateLanguagesResponse.ADAPTER.decode(bArr);
                TranslationSetting translationSetting = new TranslationSetting();
                if (decode.global_conf != null) {
                    displayRule = decode.global_conf.rule;
                } else {
                    displayRule = DisplayRule.UNKNOWN_RULE;
                }
                translationSetting.f107012c = displayRule.getValue();
                if (decode.auto_translate_global_switch.booleanValue()) {
                    i = decode.switch_scopes.intValue();
                } else {
                    i = 0;
                }
                translationSetting.f107013d = i;
                String str = decode.target_language;
                String str2 = null;
                if (!TextUtils.isEmpty(str) && CollectionUtils.isNotEmpty(decode.supported_languages)) {
                    str2 = decode.supported_languages.get(str);
                }
                if (TextUtils.isEmpty(str2)) {
                    str2 = str;
                }
                translationSetting.mo151783a(new Language(str, str2));
                ArrayList arrayList = new ArrayList();
                Locale m = C41816b.m166115a().mo150146m();
                if (m == null || m.getLanguage() == null || m.getCountry() == null) {
                    m = Locale.US;
                }
                String str3 = m.getLanguage() + "_" + m.getCountry();
                if (!TextUtils.isEmpty(str3)) {
                    str3 = str3.toLowerCase();
                }
                if (!(decode.src_lanugages == null || decode.src_languages_config == null)) {
                    for (String str4 : decode.src_lanugages) {
                        if (!TextUtils.isEmpty(str4) && (srcLanguageConfig = decode.src_languages_config.get(str4)) != null) {
                            TranslationSetting.LanguageSetting languageSetting = new TranslationSetting.LanguageSetting();
                            languageSetting.f107019a = str4;
                            languageSetting.f107020b = srcLanguageConfig.language;
                            if (CollectionUtils.isNotEmpty(srcLanguageConfig.i18n_language)) {
                                languageSetting.f107021c = srcLanguageConfig.i18n_language.get(str3);
                            }
                            if (TextUtils.isEmpty(languageSetting.f107021c)) {
                                languageSetting.f107021c = languageSetting.f107020b;
                            }
                            languageSetting.f107023e = srcLanguageConfig.scopes.intValue();
                            languageSetting.f107022d = srcLanguageConfig.rule.getValue();
                            arrayList.add(languageSetting);
                        }
                    }
                }
                translationSetting.mo151784a(arrayList);
                translationSetting.mo151785a(decode.language_keys, decode.supported_languages);
                return translationSetting;
            }
        });
    }

    /* renamed from: g */
    public void mo152255g(final IGetDataCallback<MailLastVersionNewUserFlagResponse> iGetDataCallback) {
        if (C41816b.m166115a().mo150120a() == C43213b.f109974a) {
            C42164c.m168263a(iGetDataCallback, (SdkSender.IParser) null);
        } else {
            ((IRustService) C68183b.m264839a().mo237086a(C41816b.m166115a().mo150132b(), IRustService.class)).fetchIsLastVersionNewUser(new IRustService.AbstractC43219a() {
                /* class com.ss.android.lark.mail.impl.p2168g.C42176e.AnonymousClass61 */

                @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService.AbstractC43219a
                public void onFail() {
                }

                @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService.AbstractC43219a
                public void onSuc(ByteArray byteArray) {
                    try {
                        IGetDataCallback iGetDataCallback = iGetDataCallback;
                        if (iGetDataCallback != null) {
                            iGetDataCallback.onSuccess(MailLastVersionNewUserFlagResponse.ADAPTER.decode(byteArray.mo154623a()));
                        }
                    } catch (IOException unused) {
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public void mo152191a(int i, IGetDataCallback<GetFeedCardsV2Response> iGetDataCallback) {
        Log.m165389i("MailRustService", "fetchRecentChatters");
    }

    /* renamed from: a */
    public void mo152194a(IGetDataCallback<MailCanSendExternalResponse> iGetDataCallback, MailAddress mailAddress) {
        MailCanSendExternalRequest.C16642a aVar = new MailCanSendExternalRequest.C16642a();
        aVar.mo59172a(C42130j.m168150a().mo152072a(mailAddress));
        Command command = Command.MAIL_CAN_SEND_EXTERNAL;
        ProtoAdapter<MailCanSendExternalResponse> protoAdapter = MailCanSendExternalResponse.ADAPTER;
        protoAdapter.getClass();
        C42174d.m168343a(command, aVar, iGetDataCallback, new SdkSender.IParser() {
            /* class com.ss.android.lark.mail.impl.p2168g.$$Lambda$srGjI2tk72lwnoMQOvRyxOaMPSw */

            @Override // com.ss.android.lark.sdk.SdkSender.IParser
            public final Object parse(byte[] bArr) {
                return (MailCanSendExternalResponse) ProtoAdapter.this.decode(bArr);
            }
        });
    }

    /* renamed from: g */
    public void mo152256g(String str, IGetDataCallback<MailUndoResponse> iGetDataCallback) {
        SdkSender.asynSendRequestNonWrap(Command.MAIL_UNDO, new MailUndoRequest.C16922a().mo59811a(str), iGetDataCallback, new SdkSender.IParser<MailUndoResponse>() {
            /* class com.ss.android.lark.mail.impl.p2168g.C42176e.AnonymousClass25 */

            /* renamed from: a */
            public MailUndoResponse parse(byte[] bArr) throws IOException {
                return MailUndoResponse.ADAPTER.decode(bArr);
            }
        });
    }

    /* renamed from: h */
    public void mo152258h(String str, IGetDataCallback<ArrayList<TimeZoneItemData>> iGetDataCallback) {
        SdkSender.asynSendRequestNonWrap(Command.MAIL_GET_TIMEZONE_BY_CITY, new MailGetTimeZoneByCityRequest.C16810a().mo59565a(str), iGetDataCallback, new SdkSender.IParser<ArrayList<TimeZoneItemData>>() {
            /* class com.ss.android.lark.mail.impl.p2168g.C42176e.AnonymousClass28 */

            /* renamed from: a */
            public ArrayList<TimeZoneItemData> parse(byte[] bArr) throws IOException {
                GetTimezoneByCityResponse decode = GetTimezoneByCityResponse.ADAPTER.decode(bArr);
                ArrayList<TimeZoneItemData> arrayList = new ArrayList<>();
                if (decode.city_timezones == null) {
                    return arrayList;
                }
                for (GetTimezoneByCityResponse.CityTimezone cityTimezone : decode.city_timezones) {
                    TimeZoneItemData iVar = new TimeZoneItemData(cityTimezone.timezone.timezone_id, cityTimezone.timezone.timezone_name, TimeZoneUtils.m174942a(cityTimezone.timezone.timezone_offset.intValue()));
                    iVar.mo157042a(new ArrayList<>(cityTimezone.city_names));
                    arrayList.add(iVar);
                }
                return arrayList;
            }
        });
    }

    /* renamed from: o */
    public void mo152266o(String str, IGetDataCallback<MailGetDraftItemResponse> iGetDataCallback) {
        MailGetDraftItemRequest.C16712a aVar = new MailGetDraftItemRequest.C16712a();
        aVar.f43176a = str;
        Command command = Command.MAIL_GET_DRAFT_ITEM;
        ProtoAdapter<MailGetDraftItemResponse> protoAdapter = MailGetDraftItemResponse.ADAPTER;
        protoAdapter.getClass();
        C42174d.m168343a(command, aVar, iGetDataCallback, new SdkSender.IParser() {
            /* class com.ss.android.lark.mail.impl.p2168g.$$Lambda$AQtdeGTdv4MuMfL7WdTHyUxZeMU */

            @Override // com.ss.android.lark.sdk.SdkSender.IParser
            public final Object parse(byte[] bArr) {
                return (MailGetDraftItemResponse) ProtoAdapter.this.decode(bArr);
            }
        });
    }

    /* renamed from: p */
    public void mo152267p(String str, IGetDataCallback<MailSwitchAccountResponse> iGetDataCallback) {
        MailSwitchAccountRequest.C16906a aVar = new MailSwitchAccountRequest.C16906a();
        aVar.f43393a = str;
        Command command = Command.MAIL_SWITCH_ACCOUNT;
        ProtoAdapter<MailSwitchAccountResponse> protoAdapter = MailSwitchAccountResponse.ADAPTER;
        protoAdapter.getClass();
        C42174d.m168343a(command, aVar, iGetDataCallback, new SdkSender.IParser() {
            /* class com.ss.android.lark.mail.impl.p2168g.$$Lambda$ER5TbWUBsa7ARWDYBE3PFd2H8mc */

            @Override // com.ss.android.lark.sdk.SdkSender.IParser
            public final Object parse(byte[] bArr) {
                return (MailSwitchAccountResponse) ProtoAdapter.this.decode(bArr);
            }
        });
    }

    /* renamed from: q */
    public void mo152268q(String str, IGetDataCallback<MailDeleteFolderResponse> iGetDataCallback) {
        MailDeleteFolderRequest.C16684a aVar = new MailDeleteFolderRequest.C16684a();
        aVar.f43157a = str;
        C42174d.m168343a(Command.MAIL_DELETE_FOLDER, aVar, iGetDataCallback, new SdkSender.IParser<MailDeleteFolderResponse>() {
            /* class com.ss.android.lark.mail.impl.p2168g.C42176e.AnonymousClass65 */

            /* renamed from: a */
            public MailDeleteFolderResponse parse(byte[] bArr) throws IOException {
                return MailDeleteFolderResponse.ADAPTER.decode(bArr);
            }
        });
    }

    /* renamed from: a */
    public void mo152192a(MailAccount mailAccount, IGetDataCallback<MailUpdateAccountResponse> iGetDataCallback) {
        Log.m165388i("fuck toggleSettings : " + C43770l.m173501a(14));
        C42174d.m168343a(Command.MAIL_UPDATE_ACCOUNT, new MailUpdateAccountRequest.C16930a().mo59831a(mailAccount), iGetDataCallback, new SdkSender.IParser<MailUpdateAccountResponse>() {
            /* class com.ss.android.lark.mail.impl.p2168g.C42176e.AnonymousClass29 */

            /* renamed from: a */
            public MailUpdateAccountResponse parse(byte[] bArr) throws IOException {
                return MailUpdateAccountResponse.ADAPTER.decode(bArr);
            }
        });
    }

    /* renamed from: d */
    public void mo152247d(String str, IGetDataCallback<MailGetSmartInboxPreviewCardResponse> iGetDataCallback) {
        MailGetSmartInboxPreviewCardRequest.C16780a aVar = new MailGetSmartInboxPreviewCardRequest.C16780a();
        aVar.f43253a = str;
        C42174d.m168343a(Command.MAIL_GET_SMART_INBOX_PREVIEW_CARD, aVar, iGetDataCallback, new SdkSender.IParser<MailGetSmartInboxPreviewCardResponse>() {
            /* class com.ss.android.lark.mail.impl.p2168g.C42176e.C421782 */

            /* renamed from: a */
            public MailGetSmartInboxPreviewCardResponse parse(byte[] bArr) throws IOException {
                return MailGetSmartInboxPreviewCardResponse.ADAPTER.decode(bArr);
            }
        });
    }

    /* renamed from: e */
    public void mo152250e(String str, IGetDataCallback<SetMailsAllReadResponse> iGetDataCallback) {
        SetMailsAllReadRequest.C16978a aVar = new SetMailsAllReadRequest.C16978a();
        aVar.f43548a = str;
        C42174d.m168343a(Command.MAIL_SET_ALL_READ, aVar, iGetDataCallback, new SdkSender.IParser<SetMailsAllReadResponse>() {
            /* class com.ss.android.lark.mail.impl.p2168g.C42176e.C421859 */

            /* renamed from: a */
            public SetMailsAllReadResponse parse(byte[] bArr) throws IOException {
                return SetMailsAllReadResponse.ADAPTER.decode(bArr);
            }
        });
    }

    /* renamed from: f */
    public void mo152253f(String str, IGetDataCallback<MailDeleteLabelResponse> iGetDataCallback) {
        MailDeleteLabelRequest.C16688a aVar = new MailDeleteLabelRequest.C16688a();
        aVar.f43159a = str;
        C42174d.m168343a(Command.MAIL_DELETE_LABEL_REQUEST, aVar, iGetDataCallback, new SdkSender.IParser<MailDeleteLabelResponse>() {
            /* class com.ss.android.lark.mail.impl.p2168g.C42176e.AnonymousClass17 */

            /* renamed from: a */
            public MailDeleteLabelResponse parse(byte[] bArr) throws IOException {
                return MailDeleteLabelResponse.ADAPTER.decode(bArr);
            }
        });
    }

    /* renamed from: i */
    public void mo152260i(String str, final IGetDataCallback<MailGetThreadCollaboratorsInfoResponse> iGetDataCallback) {
        if (C41816b.m166115a().mo150120a() == C43213b.f109974a) {
            C42164c.m168300f(str, iGetDataCallback, null);
        } else {
            ((IRustService) C68183b.m264839a().mo237086a(C41816b.m166115a().mo150132b(), IRustService.class)).fetchCollaboratorList(str, new IRustService.AbstractC43219a() {
                /* class com.ss.android.lark.mail.impl.p2168g.C42176e.AnonymousClass35 */

                @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService.AbstractC43219a
                public void onFail() {
                }

                @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService.AbstractC43219a
                public void onSuc(ByteArray byteArray) {
                    try {
                        IGetDataCallback iGetDataCallback = iGetDataCallback;
                        if (iGetDataCallback != null) {
                            iGetDataCallback.onSuccess(MailGetThreadCollaboratorsInfoResponse.ADAPTER.decode(byteArray.mo154623a()));
                        }
                    } catch (IOException unused) {
                    }
                }
            });
        }
    }

    /* renamed from: j */
    public void mo152261j(String str, final IGetDataCallback<MailCancelShareThreadResponse> iGetDataCallback) {
        if (C41816b.m166115a().mo150120a() == C43213b.f109974a) {
            C42164c.m168302g(str, iGetDataCallback, null);
        } else {
            ((IRustService) C68183b.m264839a().mo237086a(C41816b.m166115a().mo150132b(), IRustService.class)).cancelShareThread(str, new IRustService.AbstractC43219a() {
                /* class com.ss.android.lark.mail.impl.p2168g.C42176e.AnonymousClass38 */

                @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService.AbstractC43219a
                public void onFail() {
                }

                @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService.AbstractC43219a
                public void onSuc(ByteArray byteArray) {
                    try {
                        IGetDataCallback iGetDataCallback = iGetDataCallback;
                        if (iGetDataCallback != null) {
                            iGetDataCallback.onSuccess(MailCancelShareThreadResponse.ADAPTER.decode(byteArray.mo154623a()));
                        }
                    } catch (IOException unused) {
                    }
                }
            });
        }
    }

    /* renamed from: k */
    public void mo152262k(String str, final IGetDataCallback<MailGetShareThreadOwnerInfoResponse> iGetDataCallback) {
        if (C41816b.m166115a().mo150120a() == C43213b.f109974a) {
            C42164c.m168298e(str, iGetDataCallback, null);
        } else {
            ((IRustService) C68183b.m264839a().mo237086a(C41816b.m166115a().mo150132b(), IRustService.class)).fetchShareOwnerInfo(str, new IRustService.AbstractC43219a() {
                /* class com.ss.android.lark.mail.impl.p2168g.C42176e.AnonymousClass41 */

                @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService.AbstractC43219a
                public void onFail() {
                }

                @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService.AbstractC43219a
                public void onSuc(ByteArray byteArray) {
                    try {
                        IGetDataCallback iGetDataCallback = iGetDataCallback;
                        if (iGetDataCallback != null) {
                            iGetDataCallback.onSuccess(MailGetShareThreadOwnerInfoResponse.ADAPTER.decode(byteArray.mo154623a()));
                        }
                    } catch (IOException unused) {
                    }
                }
            });
        }
    }

    /* renamed from: l */
    public void mo152263l(String str, final IGetDataCallback<MailRecallMessageResponse> iGetDataCallback) {
        if (C41816b.m166115a().mo150120a() == C43213b.f109974a) {
            C42164c.m168296d(str, iGetDataCallback, null);
        } else {
            ((IRustService) C68183b.m264839a().mo237086a(C41816b.m166115a().mo150132b(), IRustService.class)).requestRecall(str, new IRustService.AbstractC43219a() {
                /* class com.ss.android.lark.mail.impl.p2168g.C42176e.AnonymousClass50 */

                @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService.AbstractC43219a
                public void onFail() {
                }

                @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService.AbstractC43219a
                public void onSuc(ByteArray byteArray) {
                    try {
                        IGetDataCallback iGetDataCallback = iGetDataCallback;
                        if (iGetDataCallback != null) {
                            iGetDataCallback.onSuccess(MailRecallMessageResponse.ADAPTER.decode(byteArray.mo154623a()));
                        }
                    } catch (IOException unused) {
                    }
                }
            });
        }
    }

    /* renamed from: m */
    public void mo152264m(String str, final IGetDataCallback<MailGetRecallDetailResponse> iGetDataCallback) {
        if (C41816b.m166115a().mo150120a() == C43213b.f109974a) {
            C42164c.m168303h(str, iGetDataCallback, null);
        } else {
            ((IRustService) C68183b.m264839a().mo237086a(C41816b.m166115a().mo150132b(), IRustService.class)).fetchRecallDetail(str, new IRustService.AbstractC43219a() {
                /* class com.ss.android.lark.mail.impl.p2168g.C42176e.AnonymousClass51 */

                @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService.AbstractC43219a
                public void onFail() {
                }

                @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService.AbstractC43219a
                public void onSuc(ByteArray byteArray) {
                    try {
                        IGetDataCallback iGetDataCallback = iGetDataCallback;
                        if (iGetDataCallback != null) {
                            iGetDataCallback.onSuccess(MailGetRecallDetailResponse.ADAPTER.decode(byteArray.mo154623a()));
                        }
                    } catch (IOException unused) {
                    }
                }
            });
        }
    }

    /* renamed from: n */
    public void mo152265n(String str, final IGetDataCallback<List<MailSmartReplyInfo>> iGetDataCallback) {
        if (C41816b.m166115a().mo150120a() == C43213b.f109974a) {
            C42164c.m168294c(str, new IGetDataCallback<List<MailSmartReplyInfo>>() {
                /* class com.ss.android.lark.mail.impl.p2168g.C42176e.AnonymousClass54 */

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    Log.m165382e("getSmartReply err :" + errorResult);
                    IGetDataCallback iGetDataCallback = iGetDataCallback;
                    if (iGetDataCallback != null) {
                        iGetDataCallback.onError(errorResult);
                    }
                }

                /* renamed from: a */
                public void onSuccess(List<MailSmartReplyInfo> list) {
                    if (iGetDataCallback == null || CollectionUtils.isEmpty(list) || list.size() < 3) {
                        Log.m165382e("getSmartReply err");
                        iGetDataCallback.onError(new ErrorResult(""));
                        return;
                    }
                    iGetDataCallback.onSuccess(list);
                }
            }, null);
        } else {
            ((IRustService) C68183b.m264839a().mo237086a(C41816b.m166115a().mo150132b(), IRustService.class)).getSmartReply(str, new IRustService.AbstractC43219a() {
                /* class com.ss.android.lark.mail.impl.p2168g.C42176e.AnonymousClass55 */

                @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService.AbstractC43219a
                public void onFail() {
                    IGetDataCallback iGetDataCallback = iGetDataCallback;
                    if (iGetDataCallback != null) {
                        iGetDataCallback.onError(new ErrorResult("onFail"));
                    }
                }

                @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService.AbstractC43219a
                public void onSuc(ByteArray byteArray) {
                    try {
                        MailGetSmartReplyResponse decode = MailGetSmartReplyResponse.ADAPTER.decode(byteArray.mo154623a());
                        if (decode != null && !CollectionUtils.isEmpty(decode.smart_reply_msgs_info)) {
                            if (iGetDataCallback == null || CollectionUtils.isEmpty(decode.smart_reply_msgs_info) || decode.smart_reply_msgs_info.size() < 3) {
                                Log.m165382e("getSmartReply err");
                                iGetDataCallback.onError(new ErrorResult("getSmartReply err"));
                                return;
                            }
                            iGetDataCallback.onSuccess(decode.smart_reply_msgs_info);
                        }
                    } catch (IOException e) {
                        IGetDataCallback iGetDataCallback = iGetDataCallback;
                        if (iGetDataCallback != null) {
                            iGetDataCallback.onError(new ErrorResult(e.getMessage()));
                        }
                    }
                }
            });
        }
    }

    /* renamed from: c */
    public void mo152242c(String str, IGetDataCallback<MailOpenEmlResponse> iGetDataCallback) {
        MailOpenEmlRequest.C16848a aVar = new MailOpenEmlRequest.C16848a();
        aVar.f43313a = str;
        C42174d.m168343a(Command.MAIL_OPEN_EML_REQUEST, aVar, iGetDataCallback, new SdkSender.IParser<MailOpenEmlResponse>() {
            /* class com.ss.android.lark.mail.impl.p2168g.C42176e.AnonymousClass69 */

            /* renamed from: a */
            public MailOpenEmlResponse parse(byte[] bArr) throws IOException {
                return MailOpenEmlResponse.ADAPTER.decode(bArr);
            }
        });
    }

    /* renamed from: a */
    public C42099l mo152190a(MailGetMessageListResponse mailGetMessageListResponse, String str) {
        C42099l lVar = new C42099l();
        lVar.mo151981b(this.f107230a.mo152086b(mailGetMessageListResponse.drafts));
        lVar.mo151977a(this.f107230a.mo152087c(mailGetMessageListResponse.message_items));
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

    /* renamed from: b */
    public void mo152232b(CreateDraft createDraft, final IGetDataCallback<MailCreateShareMessageDraftResponse> iGetDataCallback) {
        Log.m165389i("MailRustService", "createShareMessageDraft");
        if (createDraft == null || TextUtils.isEmpty(createDraft.mo151070a()) || TextUtils.isEmpty(createDraft.mo151071b()) || createDraft.mo151072c() == null) {
            Log.m165383e("MailRustService", "createShareDraft invalid parameters");
        } else if (C41816b.m166115a().mo150120a() == C43213b.f109974a) {
            C42164c.m168286b(createDraft, iGetDataCallback, (SdkSender.IParser) null);
        } else {
            ((IRustService) C68183b.m264839a().mo237086a(C41816b.m166115a().mo150132b(), IRustService.class)).createShareMessageDraft(createDraft, new IRustService.AbstractC43219a() {
                /* class com.ss.android.lark.mail.impl.p2168g.C42176e.AnonymousClass20 */

                @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService.AbstractC43219a
                public void onFail() {
                    IGetDataCallback iGetDataCallback = iGetDataCallback;
                    if (iGetDataCallback != null) {
                        iGetDataCallback.onError(new ErrorResult(""));
                    }
                }

                @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService.AbstractC43219a
                public void onSuc(ByteArray byteArray) {
                    try {
                        MailCreateShareMessageDraftResponse decode = MailCreateShareMessageDraftResponse.ADAPTER.decode(byteArray.mo154623a());
                        IGetDataCallback iGetDataCallback = iGetDataCallback;
                        if (iGetDataCallback != null) {
                            iGetDataCallback.onSuccess(decode);
                        }
                    } catch (IOException e) {
                        Log.m165384e("MailRustService", "createShareMessageDraft", e);
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public void mo152195a(CreateDraft createDraft, final IGetDataCallback<MailDraft> iGetDataCallback) {
        if (C41816b.m166115a().mo150120a() == C43213b.f109974a) {
            C42164c.m168264a(createDraft, iGetDataCallback, (SdkSender.IParser) null);
        } else {
            ((IRustService) C68183b.m264839a().mo237086a(C41816b.m166115a().mo150132b(), IRustService.class)).createDraft(createDraft, new IRustService.AbstractC43219a() {
                /* class com.ss.android.lark.mail.impl.p2168g.C42176e.AnonymousClass18 */

                @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService.AbstractC43219a
                public void onFail() {
                }

                @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService.AbstractC43219a
                public void onSuc(ByteArray byteArray) {
                    try {
                        MailCreateDraftResponse decode = MailCreateDraftResponse.ADAPTER.decode(byteArray.mo154623a());
                        IGetDataCallback iGetDataCallback = iGetDataCallback;
                        if (iGetDataCallback != null) {
                            iGetDataCallback.onSuccess(C42130j.m168150a().mo152078a(decode.draft));
                        }
                    } catch (IOException unused) {
                    }
                }
            });
        }
    }

    /* renamed from: c */
    public void mo152245c(boolean z, IGetDataCallback<MailGetUnreadCountResponse> iGetDataCallback) {
        MailGetUnreadCountRequest.C16812a aVar = new MailGetUnreadCountRequest.C16812a();
        aVar.f43281a = Boolean.valueOf(z);
        Command command = Command.MAIL_GET_UNREAD_COUNT;
        ProtoAdapter<MailGetUnreadCountResponse> protoAdapter = MailGetUnreadCountResponse.ADAPTER;
        protoAdapter.getClass();
        C42174d.m168343a(command, aVar, iGetDataCallback, new SdkSender.IParser() {
            /* class com.ss.android.lark.mail.impl.p2168g.$$Lambda$3sAvm32i5RHZfxd3xbhgAy3sl_U */

            @Override // com.ss.android.lark.sdk.SdkSender.IParser
            public final Object parse(byte[] bArr) {
                return (MailGetUnreadCountResponse) ProtoAdapter.this.decode(bArr);
            }
        });
    }

    /* renamed from: b */
    public void mo152234b(String str, final IGetDataCallback<DeleteMailExternalContactResponse> iGetDataCallback) {
        if (C41816b.m166115a().mo150120a() == C43213b.f109974a) {
            C42164c.m168287b(str, iGetDataCallback, (SdkSender.IParser) null);
        } else {
            ((IRustService) C68183b.m264839a().mo237086a(C41816b.m166115a().mo150132b(), IRustService.class)).deleteExternalAddress(str, new IRustService.AbstractC43219a() {
                /* class com.ss.android.lark.mail.impl.p2168g.C42176e.AnonymousClass23 */

                @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService.AbstractC43219a
                public void onFail() {
                }

                @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService.AbstractC43219a
                public void onSuc(ByteArray byteArray) {
                    try {
                        DeleteMailExternalContactResponse decode = DeleteMailExternalContactResponse.ADAPTER.decode(byteArray.mo154623a());
                        IGetDataCallback iGetDataCallback = iGetDataCallback;
                        if (iGetDataCallback != null) {
                            iGetDataCallback.onSuccess(decode);
                        }
                    } catch (IOException unused) {
                    }
                }
            });
        }
    }

    /* renamed from: c */
    public void mo152244c(String str, List<String> list, IGetDataCallback<MailMultiThreadDeletePermanentlyResponse> iGetDataCallback) {
        ProtoAdapter<MailMultiThreadDeletePermanentlyResponse> protoAdapter = MailMultiThreadDeletePermanentlyResponse.ADAPTER;
        protoAdapter.getClass();
        mo152217a(str, list, iGetDataCallback, new SdkSender.IParser() {
            /* class com.ss.android.lark.mail.impl.p2168g.$$Lambda$OhM8fB2M14tQNGN0Y_5tKlinidE */

            @Override // com.ss.android.lark.sdk.SdkSender.IParser
            public final Object parse(byte[] bArr) {
                return ProtoAdapter.this.decode(bArr);
            }
        });
    }

    /* renamed from: b */
    public void mo152235b(final String str, final String str2, final IGetDataCallback<C42099l> iGetDataCallback) {
        m168344a().mo152213a(str, new ArrayList<>(), str2, new IGetDataCallback<C42099l>() {
            /* class com.ss.android.lark.mail.impl.p2168g.C42176e.C421848 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                C42176e.m168344a();
                C42176e.m168345b(str, new ArrayList(), str2, iGetDataCallback);
            }

            /* renamed from: a */
            public void onSuccess(C42099l lVar) {
                if (!CollectionUtils.isEmpty(lVar.mo151979b()) || !CollectionUtils.isEmpty(lVar.mo151973a())) {
                    iGetDataCallback.onSuccess(lVar);
                    return;
                }
                C42176e.m168344a();
                C42176e.m168345b(str, new ArrayList(), str2, iGetDataCallback);
            }
        });
    }

    /* renamed from: h */
    public void mo152259h(String str, String str2, IGetDataCallback<MailAddFolderResponse> iGetDataCallback) {
        MailAddFolderRequest.C16628a aVar = new MailAddFolderRequest.C16628a();
        aVar.f43064a = str;
        aVar.f43065b = str2;
        C42174d.m168343a(Command.MAIL_ADD_FOLDER, aVar, iGetDataCallback, new SdkSender.IParser<MailAddFolderResponse>() {
            /* class com.ss.android.lark.mail.impl.p2168g.C42176e.AnonymousClass62 */

            /* renamed from: a */
            public MailAddFolderResponse parse(byte[] bArr) throws IOException {
                return MailAddFolderResponse.ADAPTER.decode(bArr);
            }
        });
    }

    /* renamed from: d */
    public void mo152248d(String str, String str2, final IGetDataCallback<MailDraft> iGetDataCallback) {
        if (C41816b.m166115a().mo150120a() == C43213b.f109974a) {
            C42164c.m168295c(str, str2, iGetDataCallback, null);
        } else {
            ((IRustService) C68183b.m264839a().mo237086a(C41816b.m166115a().mo150132b(), IRustService.class)).reEdit(str, str2, new IRustService.AbstractC43219a() {
                /* class com.ss.android.lark.mail.impl.p2168g.C42176e.AnonymousClass19 */

                @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService.AbstractC43219a
                public void onFail() {
                }

                @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService.AbstractC43219a
                public void onSuc(ByteArray byteArray) {
                    try {
                        MailEditMessageResponse decode = MailEditMessageResponse.ADAPTER.decode(byteArray.mo154623a());
                        IGetDataCallback iGetDataCallback = iGetDataCallback;
                        if (iGetDataCallback != null) {
                            iGetDataCallback.onSuccess(C42130j.m168150a().mo152078a(decode.draft));
                        }
                    } catch (IOException unused) {
                    }
                }
            });
        }
    }

    /* renamed from: e */
    public void mo152251e(String str, String str2, final IGetDataCallback<MailGetMessageListResponse> iGetDataCallback) {
        if (C41816b.m166115a().mo150120a() == C43213b.f109974a) {
            C42164c.m168299e(str, str2, iGetDataCallback, null);
        } else {
            ((IRustService) C68183b.m264839a().mo237086a(C41816b.m166115a().mo150132b(), IRustService.class)).getForwardInfoFromDB(str, str2, new IRustService.AbstractC43219a() {
                /* class com.ss.android.lark.mail.impl.p2168g.C42176e.AnonymousClass44 */

                @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService.AbstractC43219a
                public void onFail() {
                }

                @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService.AbstractC43219a
                public void onSuc(ByteArray byteArray) {
                    try {
                        IGetDataCallback iGetDataCallback = iGetDataCallback;
                        if (iGetDataCallback != null) {
                            iGetDataCallback.onSuccess(MailGetMessageListResponse.ADAPTER.decode(byteArray.mo154623a()));
                        }
                    } catch (IOException unused) {
                    }
                }
            });
        }
    }

    /* renamed from: f */
    public void mo152254f(String str, String str2, final IGetDataCallback<MailGetMessageListResponse> iGetDataCallback) {
        if (C41816b.m166115a().mo150120a() == C43213b.f109974a) {
            C42164c.m168297d(str, str2, iGetDataCallback, null);
        } else {
            ((IRustService) C68183b.m264839a().mo237086a(C41816b.m166115a().mo150132b(), IRustService.class)).getForwardInfoFromNet(str, str2, new IRustService.AbstractC43219a() {
                /* class com.ss.android.lark.mail.impl.p2168g.C42176e.AnonymousClass45 */

                @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService.AbstractC43219a
                public void onFail() {
                }

                @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService.AbstractC43219a
                public void onSuc(ByteArray byteArray) {
                    try {
                        IGetDataCallback iGetDataCallback = iGetDataCallback;
                        if (iGetDataCallback != null) {
                            iGetDataCallback.onSuccess(MailGetMessageListResponse.ADAPTER.decode(byteArray.mo154623a()));
                        }
                    } catch (IOException unused) {
                    }
                }
            });
        }
    }

    /* renamed from: g */
    public void mo152257g(String str, String str2, final IGetDataCallback<MailAtContactResponse> iGetDataCallback) {
        if (C41816b.m166115a().mo150120a() == C43213b.f109974a) {
            C42164c.m168301f(str, str2, iGetDataCallback, null);
        } else {
            ((IRustService) C68183b.m264839a().mo237086a(C41816b.m166115a().mo150132b(), IRustService.class)).fetchMentionContact(str, str2, new IRustService.AbstractC43219a() {
                /* class com.ss.android.lark.mail.impl.p2168g.C42176e.AnonymousClass59 */

                @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService.AbstractC43219a
                public void onFail() {
                }

                @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService.AbstractC43219a
                public void onSuc(ByteArray byteArray) {
                    try {
                        IGetDataCallback iGetDataCallback = iGetDataCallback;
                        if (iGetDataCallback != null) {
                            iGetDataCallback.onSuccess(MailAtContactResponse.ADAPTER.decode(byteArray.mo154623a()));
                        }
                    } catch (IOException unused) {
                    }
                }
            });
        }
    }

    /* renamed from: c */
    public void mo152243c(String str, String str2, final IGetDataCallback<MailThread> iGetDataCallback) {
        if (C41816b.m166115a().mo150120a() == C43213b.f109974a) {
            C42164c.m168288b(str, str2, iGetDataCallback, (SdkSender.IParser) null);
        } else {
            ((IRustService) C68183b.m264839a().mo237086a(C41816b.m166115a().mo150132b(), IRustService.class)).getThreadItemById(str, str2, new IRustService.AbstractC43219a() {
                /* class com.ss.android.lark.mail.impl.p2168g.C42176e.AnonymousClass11 */

                @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService.AbstractC43219a
                public void onFail() {
                    Log.m165388i("getThreadItemById onFail");
                }

                @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService.AbstractC43219a
                public void onSuc(ByteArray byteArray) {
                    Log.m165388i("getThreadItemById onSuc");
                    try {
                        MailGetThreadItemResponse decode = MailGetThreadItemResponse.ADAPTER.decode(byteArray.mo154623a());
                        IGetDataCallback iGetDataCallback = iGetDataCallback;
                        if (iGetDataCallback != null) {
                            iGetDataCallback.onSuccess(C42130j.m168150a().mo152081a(decode.thread_item));
                        }
                    } catch (IOException unused) {
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public void mo152196a(MailDraft mailDraft, String str, final IGetDataCallback<MailSendDraftResponse> iGetDataCallback) {
        if (C41816b.m166115a().mo150120a() == C43213b.f109974a) {
            C42164c.m168265a(mailDraft, str, iGetDataCallback, (SdkSender.IParser) null);
        } else {
            ((IRustService) C68183b.m264839a().mo237086a(C41816b.m166115a().mo150132b(), IRustService.class)).sendDraft(mailDraft, str, new IRustService.AbstractC43219a() {
                /* class com.ss.android.lark.mail.impl.p2168g.C42176e.AnonymousClass22 */

                @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService.AbstractC43219a
                public void onFail() {
                }

                @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService.AbstractC43219a
                public void onSuc(ByteArray byteArray) {
                    try {
                        MailSendDraftResponse decode = MailSendDraftResponse.ADAPTER.decode(byteArray.mo154623a());
                        IGetDataCallback iGetDataCallback = iGetDataCallback;
                        if (iGetDataCallback != null) {
                            iGetDataCallback.onSuccess(decode);
                        }
                    } catch (IOException unused) {
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public void mo152197a(MailDraft mailDraft, boolean z, final IGetDataCallback<MailDraft> iGetDataCallback) {
        if (C41816b.m166115a().mo150120a() == C43213b.f109974a) {
            C42164c.m168266a(mailDraft, z, iGetDataCallback, (SdkSender.IParser) null);
        } else {
            ((IRustService) C68183b.m264839a().mo237086a(C41816b.m166115a().mo150132b(), IRustService.class)).updateDraft(mailDraft, z, new IRustService.AbstractC43219a() {
                /* class com.ss.android.lark.mail.impl.p2168g.C42176e.AnonymousClass21 */

                @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService.AbstractC43219a
                public void onFail() {
                }

                @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService.AbstractC43219a
                public void onSuc(ByteArray byteArray) {
                    try {
                        MailUpdateDraftResponse decode = MailUpdateDraftResponse.ADAPTER.decode(byteArray.mo154623a());
                        IGetDataCallback iGetDataCallback = iGetDataCallback;
                        if (iGetDataCallback != null) {
                            iGetDataCallback.onSuccess(C42176e.this.f107230a.mo152078a(decode.draft));
                        }
                    } catch (IOException unused) {
                    }
                }
            });
        }
    }

    /* renamed from: b */
    public void mo152236b(String str, List<UserPayload> list, IGetDataCallback<MailUpdateCollaboratorsRoleResponse> iGetDataCallback) {
        Log.m165389i("MailRustService", "updateCollaboratorsPermissionCode");
        if (TextUtils.isEmpty(str) || CollectionUtils.isEmpty(list)) {
            Log.m165383e("MailRustService", "updateCollaboratorsPermissionCode invalid parameters");
            return;
        }
        MailUpdateCollaboratorsRoleRequest.C16938a aVar = new MailUpdateCollaboratorsRoleRequest.C16938a();
        aVar.mo59849a(str).mo59850a(list);
        Command command = Command.MAIL_UPDATE_COLLABORATORS_ROLE;
        ProtoAdapter<MailUpdateCollaboratorsRoleResponse> protoAdapter = MailUpdateCollaboratorsRoleResponse.ADAPTER;
        protoAdapter.getClass();
        C42174d.m168343a(command, aVar, iGetDataCallback, new SdkSender.IParser() {
            /* class com.ss.android.lark.mail.impl.p2168g.$$Lambda$879wyX8r5DuHkAnFr4nvWd0LKRs */

            @Override // com.ss.android.lark.sdk.SdkSender.IParser
            public final Object parse(byte[] bArr) {
                return (MailUpdateCollaboratorsRoleResponse) ProtoAdapter.this.decode(bArr);
            }
        });
    }

    /* renamed from: b */
    public void mo152237b(String str, boolean z, final IGetDataCallback<MailMessage> iGetDataCallback) {
        if (C41816b.m166115a().mo150120a() == C43213b.f109974a) {
            C42164c.m168280a(str, z, iGetDataCallback, (SdkSender.IParser) null);
        } else {
            ((IRustService) C68183b.m264839a().mo237086a(C41816b.m166115a().mo150132b(), IRustService.class)).getMessageItem(str, z, new IRustService.AbstractC43219a() {
                /* class com.ss.android.lark.mail.impl.p2168g.C42176e.AnonymousClass48 */

                @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService.AbstractC43219a
                public void onFail() {
                }

                @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService.AbstractC43219a
                public void onSuc(ByteArray byteArray) {
                    try {
                        if (iGetDataCallback != null) {
                            iGetDataCallback.onSuccess(C42130j.m168150a().mo152080a(MailGetMessageItemResponse.ADAPTER.decode(byteArray.mo154623a()).message));
                        }
                    } catch (IOException unused) {
                    }
                }
            });
        }
    }

    /* renamed from: b */
    public static void m168345b(final String str, ArrayList<String> arrayList, String str2, final IGetDataCallback<C42099l> iGetDataCallback) {
        if (C41816b.m166115a().mo150120a() == C43213b.f109974a) {
            C42164c.m168289b(str, arrayList, str2, new IGetDataCallback<C42099l>() {
                /* class com.ss.android.lark.mail.impl.p2168g.C42176e.C421826 */

                /* renamed from: a */
                public void onSuccess(C42099l lVar) {
                    IGetDataCallback iGetDataCallback = iGetDataCallback;
                    if (iGetDataCallback != null) {
                        iGetDataCallback.onSuccess(lVar);
                    }
                }

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    IGetDataCallback iGetDataCallback = iGetDataCallback;
                    if (iGetDataCallback != null) {
                        iGetDataCallback.onError(errorResult);
                    }
                }
            }, (SdkSender.IParser) null);
        } else {
            ((IRustService) C68183b.m264839a().mo237086a(C41816b.m166115a().mo150132b(), IRustService.class)).getThreadInfoFromNet(str, arrayList, str2, new IRustService.AbstractC43219a() {
                /* class com.ss.android.lark.mail.impl.p2168g.C42176e.C421837 */

                @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService.AbstractC43219a
                public void onFail() {
                    IGetDataCallback iGetDataCallback = iGetDataCallback;
                    if (iGetDataCallback != null) {
                        iGetDataCallback.onError(new ErrorResult("onFail"));
                    }
                }

                @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService.AbstractC43219a
                public void onSuc(ByteArray byteArray) {
                    try {
                        C42099l a = C42176e.m168344a().mo152190a(MailGetMessageListResponse.ADAPTER.decode(byteArray.mo154623a()), str);
                        IGetDataCallback iGetDataCallback = iGetDataCallback;
                        if (iGetDataCallback != null) {
                            iGetDataCallback.onSuccess(a);
                        }
                    } catch (IOException unused) {
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public MailContactSearchResponse mo152189a(String str, int i, int i2, String str2) {
        Log.m165389i("RecipientSelectView", "getContactsGroupList: " + str + ", thread:" + C43849u.m173830c());
        if (C41816b.m166115a().mo150120a() == C43213b.f109974a) {
            return C42164c.m168258a(str, i, i2, str2, (SdkSender.IParser) null);
        }
        ByteArray contactsGroupList = ((IRustService) C68183b.m264839a().mo237086a(C41816b.m166115a().mo150132b(), IRustService.class)).getContactsGroupList(str, i, i2, str2);
        if (contactsGroupList != null) {
            try {
                return MailContactSearchResponse.ADAPTER.decode(contactsGroupList.mo154623a());
            } catch (IOException unused) {
            }
        } else {
            Log.m165388i("getNetMailContactsList byteArray null");
            return null;
        }
    }

    /* renamed from: b */
    public void mo152233b(String str, FilterType filterType, long j, long j2, IGetDataCallback<MailRefreshThreadListResponse> iGetDataCallback) {
        Log.m165388i("loadData refreshThreadList labelId:" + str + " firstThreadTimestamp:" + j + " length:" + j2 + " filterType:" + filterType.getValue());
        MailRefreshThreadListRequest.C16858a aVar = new MailRefreshThreadListRequest.C16858a();
        aVar.f43322a = str;
        aVar.f43324c = Long.valueOf(j);
        aVar.f43325d = Long.valueOf(j2);
        aVar.f43323b = filterType;
        C42174d.m168343a(Command.MAIL_REFRESH_THREAD_LIST, aVar, iGetDataCallback, new SdkSender.IParser<MailRefreshThreadListResponse>() {
            /* class com.ss.android.lark.mail.impl.p2168g.C42176e.AnonymousClass68 */

            /* renamed from: a */
            public MailRefreshThreadListResponse parse(byte[] bArr) throws IOException {
                return MailRefreshThreadListResponse.ADAPTER.decode(bArr);
            }
        });
    }

    /* renamed from: a */
    public void mo152198a(String str, int i, int i2, boolean z, IGetDataCallback<MailSearchShareMemberResponse> iGetDataCallback) {
        Log.m165389i("MailRustService", "searchCollaboratingCandidates");
        MailSearchShareMemberRequest.C16876a aVar = new MailSearchShareMemberRequest.C16876a();
        aVar.mo59707a(str).mo59706a(Integer.valueOf(i)).mo59709b(Integer.valueOf(i2)).mo59705a(Boolean.valueOf(z));
        C42174d.m168343a(Command.MAIL_SEARCH_SHARE_MEMBER, aVar, iGetDataCallback, new SdkSender.IParser<MailSearchShareMemberResponse>() {
            /* class com.ss.android.lark.mail.impl.p2168g.C42176e.AnonymousClass36 */

            /* renamed from: a */
            public MailSearchShareMemberResponse parse(byte[] bArr) throws IOException {
                return MailSearchShareMemberResponse.ADAPTER.decode(bArr);
            }
        });
    }
}
