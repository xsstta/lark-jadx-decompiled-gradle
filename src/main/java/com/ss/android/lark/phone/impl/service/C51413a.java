package com.ss.android.lark.phone.impl.service;

import android.text.TextUtils;
import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.contact.v1.GetEmergencyCallNumberRequest;
import com.bytedance.lark.pb.contact.v1.GetEmergencyCallNumberResponse;
import com.bytedance.lark.pb.contact.v1.GetPhoneQueryDailyQuotaRequest;
import com.bytedance.lark.pb.contact.v1.GetPhoneQueryDailyQuotaResponse;
import com.bytedance.lark.pb.contact.v1.SendPhoneQueryQuotaApplyRequest;
import com.bytedance.lark.pb.contact.v1.SendPhoneQueryQuotaApplyResponse;
import com.bytedance.lark.pb.contact.v1.SetPhoneQueryQuotaRequest;
import com.bytedance.lark.pb.contact.v1.SetPhoneQueryQuotaResponse;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.message.content.CardContent;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.pb.users.CheckUserPhoneNumberRequest;
import com.ss.android.lark.pb.users.CheckUserPhoneNumberResponse;
import com.ss.android.lark.phone.C51341b;
import com.ss.android.lark.phone.impl.common.PhoneControlStatus;
import com.ss.android.lark.phone.impl.service.entity.C51425a;
import com.ss.android.lark.phone.impl.service.entity.PhoneQueryControlInfo;
import com.ss.android.lark.phone.impl.service.entity.PhoneQueryDailyAmountInfo;
import com.ss.android.lark.sdk.SdkSender;
import com.ss.android.lark.utils.rxjava.C57865c;
import java.io.IOException;

/* renamed from: com.ss.android.lark.phone.impl.service.a */
public class C51413a {

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.phone.impl.service.a$a */
    public static class C51424a {

        /* renamed from: a */
        public static C51413a f127964a = new C51413a();
    }

    /* renamed from: a */
    public static C51413a m199326a() {
        return C51424a.f127964a;
    }

    /* renamed from: a */
    public void mo177046a(String str, String str2, IGetDataCallback<String> iGetDataCallback) {
        if (TextUtils.isEmpty(str)) {
            if (iGetDataCallback != null) {
                iGetDataCallback.onError(new ErrorResult("user id is empty"));
            }
        } else if (!TextUtils.isEmpty(str2)) {
            SdkSender.asynSendRequestNonWrap(Command.SET_PHONE_QUERY_QUOTA, new SetPhoneQueryQuotaRequest.C16396a().mo58543a(str).mo58545b(str2), iGetDataCallback, new SdkSender.IParser<String>() {
                /* class com.ss.android.lark.phone.impl.service.C51413a.C514184 */

                /* renamed from: a */
                public String parse(byte[] bArr) throws IOException {
                    return SetPhoneQueryQuotaResponse.ADAPTER.decode(bArr).msg;
                }
            });
        } else if (iGetDataCallback != null) {
            iGetDataCallback.onError(new ErrorResult("quota is empty"));
        }
    }

    /* renamed from: a */
    public CardContent mo177040a(int i) {
        return (CardContent) SdkSender.sendRequest(Command.SEND_PHONE_QUERY_QUOTA_APPLY, new SendPhoneQueryQuotaApplyRequest.C16372a().mo58482a(Integer.valueOf(i)), new SdkSender.IParser<CardContent>() {
            /* class com.ss.android.lark.phone.impl.service.C51413a.C514195 */

            /* renamed from: a */
            public CardContent parse(byte[] bArr) throws IOException {
                return C51341b.m199137a().mo144004d().mo144008a(SendPhoneQueryQuotaApplyResponse.ADAPTER.decode(bArr).card_content);
            }
        });
    }

    /* renamed from: a */
    public PhoneQueryControlInfo mo177041a(CheckUserPhoneNumberResponse checkUserPhoneNumberResponse) {
        PhoneQueryControlInfo phoneQueryControlInfo = new PhoneQueryControlInfo();
        phoneQueryControlInfo.setControlStatus(PhoneControlStatus.forNumber(checkUserPhoneNumberResponse.mstatus.intValue()));
        phoneQueryControlInfo.setPhoneNum(checkUserPhoneNumberResponse.mphone_number);
        phoneQueryControlInfo.setTodayCallCount(String.valueOf(checkUserPhoneNumberResponse.mtoday_call_count));
        phoneQueryControlInfo.setAnnouncement(checkUserPhoneNumberResponse.mannouncement);
        phoneQueryControlInfo.setLeaderId(String.valueOf(checkUserPhoneNumberResponse.mleader_id));
        return phoneQueryControlInfo;
    }

    /* renamed from: a */
    public SdkSender.C53233d<PhoneQueryDailyAmountInfo> mo177042a(String str) {
        T t = (T) new PhoneQueryDailyAmountInfo();
        if (TextUtils.isEmpty(str)) {
            Log.m165382e("syncGetPhoneQueryDailyAmount failed: user id is empty");
            SdkSender.C53233d<PhoneQueryDailyAmountInfo> dVar = new SdkSender.C53233d<>();
            dVar.f131573b = new ErrorResult("count is illegal");
            dVar.f131572a = t;
            return dVar;
        }
        return SdkSender.syncSendMayError(Command.GET_PHONE_QUERY_DAILY_QUOTA, new GetPhoneQueryDailyQuotaRequest.C16260a().mo58235a(str), new SdkSender.IParser() {
            /* class com.ss.android.lark.phone.impl.service.$$Lambda$a$k_qNPpmICFIoYeWtKlPmPNtHWX8 */

            @Override // com.ss.android.lark.sdk.SdkSender.IParser
            public final Object parse(byte[] bArr) {
                return C51413a.m199327a(PhoneQueryDailyAmountInfo.this, bArr);
            }
        });
    }

    /* renamed from: b */
    public void mo177047b(final String str, final IGetDataCallback<PhoneQueryDailyAmountInfo> iGetDataCallback) {
        C57865c.m224576a(new Runnable() {
            /* class com.ss.android.lark.phone.impl.service.C51413a.RunnableC514152 */

            public void run() {
                SdkSender.C53233d<PhoneQueryDailyAmountInfo> a = C51413a.this.mo177042a(str);
                if (a.f131573b != null) {
                    IGetDataCallback iGetDataCallback = iGetDataCallback;
                    if (iGetDataCallback != null) {
                        iGetDataCallback.onError(a.f131573b);
                    }
                } else {
                    IGetDataCallback iGetDataCallback2 = iGetDataCallback;
                    if (iGetDataCallback2 != null) {
                        iGetDataCallback2.onSuccess(a.f131572a);
                    }
                }
                C51413a.this.mo177049c(str, new IGetDataCallback<PhoneQueryDailyAmountInfo>() {
                    /* class com.ss.android.lark.phone.impl.service.C51413a.RunnableC514152.C514161 */

                    /* renamed from: a */
                    public void onSuccess(PhoneQueryDailyAmountInfo phoneQueryDailyAmountInfo) {
                        if (iGetDataCallback != null) {
                            iGetDataCallback.onSuccess(phoneQueryDailyAmountInfo);
                        }
                    }

                    @Override // com.larksuite.framework.callback.IGetDataCallback
                    public void onError(ErrorResult errorResult) {
                        if (iGetDataCallback != null) {
                            iGetDataCallback.onError(errorResult);
                        }
                    }
                });
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ PhoneQueryDailyAmountInfo m199327a(PhoneQueryDailyAmountInfo phoneQueryDailyAmountInfo, byte[] bArr) throws IOException {
        GetPhoneQueryDailyQuotaResponse decode = GetPhoneQueryDailyQuotaResponse.ADAPTER.decode(bArr);
        phoneQueryDailyAmountInfo.setDailyQuota(decode.daily_quota.intValue());
        phoneQueryDailyAmountInfo.setMaxLimit(decode.max_limit.intValue());
        return phoneQueryDailyAmountInfo;
    }

    /* renamed from: c */
    public void mo177049c(String str, IGetDataCallback<PhoneQueryDailyAmountInfo> iGetDataCallback) {
        if (!TextUtils.isEmpty(str)) {
            SdkSender.asynSendRequestNonWrap(Command.GET_PHONE_QUERY_DAILY_QUOTA, new GetPhoneQueryDailyQuotaRequest.C16260a().mo58235a(str), iGetDataCallback, new SdkSender.IParser<PhoneQueryDailyAmountInfo>() {
                /* class com.ss.android.lark.phone.impl.service.C51413a.C514173 */

                /* renamed from: a */
                public PhoneQueryDailyAmountInfo parse(byte[] bArr) throws IOException {
                    GetPhoneQueryDailyQuotaResponse decode = GetPhoneQueryDailyQuotaResponse.ADAPTER.decode(bArr);
                    PhoneQueryDailyAmountInfo phoneQueryDailyAmountInfo = new PhoneQueryDailyAmountInfo();
                    phoneQueryDailyAmountInfo.setDailyQuota(decode.daily_quota.intValue());
                    phoneQueryDailyAmountInfo.setMaxLimit(decode.max_limit.intValue());
                    return phoneQueryDailyAmountInfo;
                }
            });
        } else if (iGetDataCallback != null) {
            iGetDataCallback.onError(new ErrorResult("user id is empty"));
        }
    }

    /* renamed from: a */
    public void mo177044a(final PhoneQueryControlInfo phoneQueryControlInfo, final IGetDataCallback<Message> iGetDataCallback) {
        CoreThreadPool.getDefault().getFixedThreadPool().execute(new Runnable() {
            /* class com.ss.android.lark.phone.impl.service.C51413a.RunnableC514217 */

            public void run() {
                int i;
                PhoneQueryControlInfo phoneQueryControlInfo = phoneQueryControlInfo;
                if (phoneQueryControlInfo == null) {
                    iGetDataCallback.onError(new ErrorResult("PhoneQueryControlInfo is null"));
                    return;
                }
                if (TextUtils.isEmpty(phoneQueryControlInfo.getTodayCallCount())) {
                    i = 0;
                } else {
                    i = Integer.parseInt(phoneQueryControlInfo.getTodayCallCount());
                }
                final CardContent a = C51413a.m199326a().mo177040a(i);
                if (a == null) {
                    iGetDataCallback.onError(new ErrorResult("cardContent is null"));
                    return;
                }
                String leaderId = phoneQueryControlInfo.getLeaderId();
                if (TextUtils.isEmpty(leaderId)) {
                    iGetDataCallback.onError(new ErrorResult("leader id is empty"));
                } else {
                    C51341b.m199137a().mo144004d().mo144013b(leaderId, new IGetDataCallback<Chat>() {
                        /* class com.ss.android.lark.phone.impl.service.C51413a.RunnableC514217.C514221 */

                        /* renamed from: a */
                        public void onSuccess(Chat chat) {
                            C51413a.this.mo177043a(chat, a, iGetDataCallback);
                        }

                        @Override // com.larksuite.framework.callback.IGetDataCallback
                        public void onError(ErrorResult errorResult) {
                            Log.m165383e("PhoneService", "createP2pChatIfNeed failed: " + errorResult.getDebugMsg());
                            if (errorResult.getErrorCode() == 4051) {
                                C51341b.m199137a().mo144004d().mo144012b(errorResult.getDisplayMsg());
                            }
                        }
                    });
                }
            }
        });
    }

    /* renamed from: a */
    public void mo177045a(String str, IGetDataCallback<PhoneQueryControlInfo> iGetDataCallback) {
        if (!TextUtils.isEmpty(str)) {
            SdkSender.sendPassThroughRequest(com.ss.android.lark.pb.improto.Command.CHECK_USER_PHONE_NUMBER, new CheckUserPhoneNumberRequest.C50260a().mo174389a(Long.valueOf(str)), iGetDataCallback, new SdkSender.IParser<PhoneQueryControlInfo>() {
                /* class com.ss.android.lark.phone.impl.service.C51413a.C514141 */

                /* renamed from: a */
                public PhoneQueryControlInfo parse(byte[] bArr) throws IOException {
                    return C51413a.this.mo177041a(CheckUserPhoneNumberResponse.ADAPTER.decode(bArr));
                }
            });
        } else if (iGetDataCallback != null) {
            iGetDataCallback.onError(new ErrorResult("user id is empty"));
        }
    }

    /* renamed from: b */
    public void mo177048b(String str, String str2, IGetDataCallback<C51425a> iGetDataCallback) {
        if (TextUtils.isEmpty(str)) {
            if (iGetDataCallback != null) {
                iGetDataCallback.onError(new ErrorResult("callerPhoneNumber id is empty"));
            }
        } else if (!TextUtils.isEmpty(str2)) {
            SdkSender.asynSendRequestNonWrap(Command.GET_EMERGENCY_CALL_NUMBER, new GetEmergencyCallNumberRequest.C16240a().mo58189b(str2).mo58187a(str), iGetDataCallback, new SdkSender.IParser<C51425a>() {
                /* class com.ss.android.lark.phone.impl.service.C51413a.C514206 */

                /* renamed from: a */
                public C51425a parse(byte[] bArr) throws IOException {
                    GetEmergencyCallNumberResponse decode = GetEmergencyCallNumberResponse.ADAPTER.decode(bArr);
                    return new C51425a(decode.call_id, decode.emergency_call_number, decode.need_reason.booleanValue());
                }
            });
        } else if (iGetDataCallback != null) {
            iGetDataCallback.onError(new ErrorResult("calleeUserId id is empty"));
        }
    }

    /* renamed from: a */
    public void mo177043a(Chat chat, CardContent cardContent, final IGetDataCallback<Message> iGetDataCallback) {
        C51341b.m199137a().mo144004d().mo144011a(chat.getId(), cardContent, new IGetDataCallback<String>() {
            /* class com.ss.android.lark.phone.impl.service.C51413a.C514238 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                iGetDataCallback.onError(errorResult);
            }

            /* renamed from: a */
            public void onSuccess(String str) {
                Message a = C51341b.m199137a().mo144004d().mo144007a(str);
                if (a == null) {
                    iGetDataCallback.onError(new ErrorResult("message is null"));
                } else {
                    iGetDataCallback.onSuccess(a);
                }
            }
        });
    }
}
