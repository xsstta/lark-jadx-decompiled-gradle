package com.ss.android.lark.money.redpacket.p2369b;

import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.lark.pb.basic.v1.C14928Entity;
import com.bytedance.lark.pb.basic.v1.Channel;
import com.bytedance.lark.pb.basic.v1.Chat;
import com.bytedance.lark.pb.basic.v1.Chatter;
import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.basic.v1.HongbaoContent;
import com.bytedance.lark.pb.basic.v1.HongbaoCover;
import com.bytedance.lark.pb.basic.v1.ImageSetPassThrough;
import com.bytedance.lark.pb.im.v1.GetGrabHongbaoRecordRequest;
import com.bytedance.lark.pb.im.v1.GetGrabHongbaoRecordResponse;
import com.bytedance.lark.pb.im.v1.GetHongbaoInfoRequest;
import com.bytedance.lark.pb.im.v1.GetHongbaoInfoResponse;
import com.bytedance.lark.pb.im.v1.GetHongbaoRecvDetailRequest;
import com.bytedance.lark.pb.im.v1.GetHongbaoRecvDetailResponse;
import com.bytedance.lark.pb.im.v1.GetPayTokenRequest;
import com.bytedance.lark.pb.im.v1.GetPayTokenResponse;
import com.bytedance.lark.pb.im.v1.GetSendHongbaoRecordRequest;
import com.bytedance.lark.pb.im.v1.GetSendHongbaoRecordResponse;
import com.bytedance.lark.pb.im.v1.GrabHongbaoRecord;
import com.bytedance.lark.pb.im.v1.GrabHongbaoRequest;
import com.bytedance.lark.pb.im.v1.GrabHongbaoResponse;
import com.bytedance.lark.pb.im.v1.HongbaoRecvDetail;
import com.bytedance.lark.pb.im.v1.HongbaoType;
import com.bytedance.lark.pb.im.v1.SendHongbaoRecord;
import com.bytedance.lark.pb.im.v1.SendHongbaoRequest;
import com.bytedance.lark.pb.im.v1.SendHongbaoResponse;
import com.bytedance.lark.pb.im.v1.UpdateHongbaoRequest;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.api.IChatParser;
import com.ss.android.lark.chat.api.IChatterParser;
import com.ss.android.lark.chat.entity.message.content.RedPacketContent;
import com.ss.android.lark.chat.entity.redpacket.RedPacketCover;
import com.ss.android.lark.image.entity.PassThroughImage;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.money.MoneyModule;
import com.ss.android.lark.money.p2364a.p2365a.C48022a;
import com.ss.android.lark.money.redpacket.dto.PayURLType;
import com.ss.android.lark.money.redpacket.dto.RedPacketDataWrapper;
import com.ss.android.lark.money.redpacket.dto.RedPacketDetail;
import com.ss.android.lark.money.redpacket.dto.RedPacketDetailItem;
import com.ss.android.lark.money.redpacket.dto.RedPacketGrabResponse;
import com.ss.android.lark.money.redpacket.dto.RedPacketHistoryItem;
import com.ss.android.lark.money.redpacket.dto.RedPacketHistoryResponse;
import com.ss.android.lark.money.redpacket.dto.RedPacketInfo;
import com.ss.android.lark.money.redpacket.dto.SendRedPacketResponse;
import com.ss.android.lark.sdk.SdkSender;
import com.ss.android.lark.util.share_preference.UserSP;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.utils.rxjava.LarkRxSchedulers;
import com.ss.android.lark.utils.rxjava.ReportErrorConsumer;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Consumer;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* renamed from: com.ss.android.lark.money.redpacket.b.d */
public class C48040d implements AbstractC48037a {

    /* renamed from: a */
    private boolean f120935a;

    /* renamed from: b */
    private IChatterParser f120936b;

    /* renamed from: c */
    private IChatParser f120937c;

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.money.redpacket.b.d$a */
    public static final class C48052a {

        /* renamed from: a */
        public static final C48040d f120961a = new C48040d();
    }

    /* renamed from: a */
    public static C48040d m189602a() {
        return C48052a.f120961a;
    }

    /* renamed from: a */
    public void mo168231a(Context context) {
        if (!this.f120935a) {
            this.f120935a = true;
            m189609b(context);
        }
    }

    @Override // com.ss.android.lark.money.redpacket.p2369b.AbstractC48037a
    /* renamed from: a */
    public void mo168217a(long j, int i, String str, RedPacketContent.Type type, String str2, String str3, Long l, IGetDataCallback<SendRedPacketResponse> iGetDataCallback) {
        Channel build = new Channel.Builder().type(Channel.Type.CHAT).id(str2).build();
        SdkSender.asynSendRequestNonWrap(Command.SEND_HONGBAO, new SendHongbaoRequest.Builder().total_amount(Long.valueOf(j)).total_num(Integer.valueOf(i)).subject(str).type(HongbaoContent.Type.fromValue(type.getNumber())).channel(build).sdk_config(str3).cover_id(l).device_info(new SendHongbaoRequest.DeviceInfo.Builder().finance_sdk_version(C48022a.m189555a()).build()), iGetDataCallback, new SdkSender.IParser() {
            /* class com.ss.android.lark.money.redpacket.p2369b.C48040d.C480411 */

            /* renamed from: a */
            public SendRedPacketResponse parse(byte[] bArr) throws IOException {
                SendHongbaoResponse decode = SendHongbaoResponse.ADAPTER.decode(bArr);
                return new SendRedPacketResponse(decode.pay_url, PayURLType.fromServerPayURLType(decode.pay_url_type));
            }
        });
    }

    @Override // com.ss.android.lark.money.redpacket.p2369b.AbstractC48037a
    /* renamed from: a */
    public void mo168220a(String str, boolean z, IGetDataCallback<RedPacketGrabResponse> iGetDataCallback) {
        SdkSender.asynSendRequestNonWrap(Command.GRAB_HONGBAO, new GrabHongbaoRequest.Builder().id(str).is_return_name_auth(true).hongbao_type(z ? HongbaoType.COMMERCIAL : HongbaoType.NORMAL).device_info(new GrabHongbaoRequest.DeviceInfo.Builder().finance_sdk_version(C48022a.m189555a()).build()), iGetDataCallback, new SdkSender.IParser() {
            /* class com.ss.android.lark.money.redpacket.p2369b.C48040d.C480475 */

            /* renamed from: a */
            public RedPacketGrabResponse parse(byte[] bArr) throws IOException {
                GrabHongbaoResponse decode = GrabHongbaoResponse.ADAPTER.decode(bArr);
                return new RedPacketGrabResponse(decode.amount.longValue(), decode.is_real_name_authed.booleanValue(), decode.auth_url);
            }
        });
    }

    @Override // com.ss.android.lark.money.redpacket.p2369b.AbstractC48037a
    /* renamed from: a */
    public void mo168221a(String str, boolean z, boolean z2, boolean z3, IGetDataCallback<String> iGetDataCallback) {
        UpdateHongbaoRequest.Builder builder = new UpdateHongbaoRequest.Builder();
        builder.id(str).clicked(true).grabbed(Boolean.valueOf(z2)).grabbed_finish(Boolean.valueOf(z3));
        builder.hongbao_type(z ? HongbaoType.COMMERCIAL : HongbaoType.NORMAL);
        SdkSender.asynSendRequestNonWrap(Command.UPDATE_HONGBAO, builder, iGetDataCallback, new SdkSender.IParser() {
            /* class com.ss.android.lark.money.redpacket.p2369b.C48040d.C480486 */

            /* renamed from: a */
            public String parse(byte[] bArr) throws IOException {
                return "";
            }
        });
    }

    @Override // com.ss.android.lark.money.redpacket.p2369b.AbstractC48037a
    /* renamed from: a */
    public void mo168219a(String str, String str2, boolean z, IGetDataCallback<RedPacketDetail> iGetDataCallback) {
        GetHongbaoRecvDetailRequest.Builder builder = new GetHongbaoRecvDetailRequest.Builder();
        builder.id(str).count(20);
        if (!TextUtils.isEmpty(str2)) {
            builder.cursor(str2);
        }
        builder.hongbao_type(z ? HongbaoType.COMMERCIAL : HongbaoType.NORMAL);
        SdkSender.asynSendRequestNonWrap(Command.GET_HONGBAO_RECV_DETAIL, builder, iGetDataCallback, new SdkSender.IParser() {
            /* class com.ss.android.lark.money.redpacket.p2369b.$$Lambda$d$WSO_JTQX4uTtl1PXbEO7IBLLtv8 */

            @Override // com.ss.android.lark.sdk.SdkSender.IParser
            public final Object parse(byte[] bArr) {
                return C48040d.this.m189606a((C48040d) bArr);
            }
        });
    }

    @Override // com.ss.android.lark.money.redpacket.p2369b.AbstractC48037a
    /* renamed from: a */
    public void mo168218a(IGetDataCallback<String> iGetDataCallback) {
        SdkSender.asynSendRequestNonWrap(Command.GET_PAY_TOKEN, new GetPayTokenRequest.Builder(), iGetDataCallback, new SdkSender.IParser() {
            /* class com.ss.android.lark.money.redpacket.p2369b.C48040d.AnonymousClass10 */

            /* renamed from: a */
            public String parse(byte[] bArr) throws IOException {
                String str = GetPayTokenResponse.ADAPTER.decode(bArr).pay_token;
                UserSP.getInstance().putString("key.sp.pay.token", str);
                return str;
            }
        });
    }

    @Override // com.ss.android.lark.money.redpacket.p2369b.AbstractC48037a
    /* renamed from: a */
    public void mo168216a(int i, String str, int i2, IGetDataCallback<RedPacketHistoryResponse> iGetDataCallback) {
        GetSendHongbaoRecordRequest.Builder builder = new GetSendHongbaoRecordRequest.Builder();
        builder.year(Integer.valueOf(i)).cursor(str).count(Integer.valueOf(i2));
        SdkSender.asynSendRequestNonWrap(Command.GET_SEND_HONGBAO_RECORD, builder, iGetDataCallback, new SdkSender.IParser<RedPacketHistoryResponse>() {
            /* class com.ss.android.lark.money.redpacket.p2369b.C48040d.C480442 */

            /* renamed from: a */
            public RedPacketHistoryResponse parse(byte[] bArr) throws IOException {
                GetSendHongbaoRecordResponse decode = GetSendHongbaoRecordResponse.ADAPTER.decode(bArr);
                RedPacketHistoryResponse redPacketHistoryResponse = new RedPacketHistoryResponse();
                redPacketHistoryResponse.totalNum = decode.total_num.intValue();
                redPacketHistoryResponse.totalAmount = decode.total_amount.longValue();
                redPacketHistoryResponse.hasMore = decode.has_more.booleanValue();
                redPacketHistoryResponse.nextCursor = decode.next_cursor;
                redPacketHistoryResponse.redPacketHistoryItemList = C48040d.this.mo168230a(decode.entity, decode.records);
                return redPacketHistoryResponse;
            }
        });
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.money.redpacket.b.d$4 */
    public static /* synthetic */ class C480464 {

        /* renamed from: a */
        static final /* synthetic */ int[] f120952a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.bytedance.lark.pb.basic.v1.HongbaoCover$CoverType[] r0 = com.bytedance.lark.pb.basic.v1.HongbaoCover.CoverType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ss.android.lark.money.redpacket.p2369b.C48040d.C480464.f120952a = r0
                com.bytedance.lark.pb.basic.v1.HongbaoCover$CoverType r1 = com.bytedance.lark.pb.basic.v1.HongbaoCover.CoverType.CUSTOMIZE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.ss.android.lark.money.redpacket.p2369b.C48040d.C480464.f120952a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.bytedance.lark.pb.basic.v1.HongbaoCover$CoverType r1 = com.bytedance.lark.pb.basic.v1.HongbaoCover.CoverType.TEMPLATE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.money.redpacket.p2369b.C48040d.C480464.<clinit>():void");
        }
    }

    private C48040d() {
        this.f120936b = MoneyModule.getDependency().getChatDependency().getChatterParser();
        this.f120937c = MoneyModule.getDependency().getChatDependency().getChatParser();
    }

    /* renamed from: b */
    public boolean mo168233b() {
        Locale languageSetting = MoneyModule.getDependency().getLanguageDependency().getLanguageSetting();
        if (languageSetting != null && Locale.SIMPLIFIED_CHINESE.getLanguage().equals(languageSetting.getLanguage()) && Locale.SIMPLIFIED_CHINESE.getCountry().equals(languageSetting.getCountry())) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private PassThroughImage m189601a(ImageSetPassThrough imageSetPassThrough) {
        if (imageSetPassThrough == null) {
            return null;
        }
        return new PassThroughImage(imageSetPassThrough.key, imageSetPassThrough.fs_unit, imageSetPassThrough.crypto);
    }

    /* renamed from: b */
    private void m189609b(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext instanceof Application) {
            C48022a.m189556a((Application) applicationContext);
        }
    }

    /* renamed from: a */
    private RedPacketCover m189600a(HongbaoCover hongbaoCover) {
        RedPacketCover.CoverType coverType;
        if (hongbaoCover == null) {
            return null;
        }
        int i = C480464.f120952a[hongbaoCover.cover_type.ordinal()];
        if (i == 1) {
            coverType = RedPacketCover.CoverType.CUSTOMIZE;
        } else if (i != 2) {
            coverType = RedPacketCover.CoverType.UNKNOWN;
        } else {
            coverType = RedPacketCover.CoverType.TEMPLATE;
        }
        return new RedPacketCover(hongbaoCover.id.longValue(), hongbaoCover.name, coverType, m189601a(hongbaoCover.main_cover), m189601a(hongbaoCover.message_cover), m189601a(hongbaoCover.head_cover), m189601a(hongbaoCover.company_logo));
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ Object m189606a(byte[] bArr) throws IOException {
        GetHongbaoRecvDetailResponse decode = GetHongbaoRecvDetailResponse.ADAPTER.decode(bArr);
        List<RedPacketDetailItem> a = m189607a(decode);
        RedPacketDetail redPacketDetail = new RedPacketDetail();
        redPacketDetail.detailList = a;
        redPacketDetail.hasMore = decode.has_more.booleanValue();
        redPacketDetail.nextCursor = decode.next_cursor;
        redPacketDetail.grabNum = decode.grab_num.intValue();
        redPacketDetail.luckyUserId = decode.lucky_user_id;
        redPacketDetail.totalGrabAmount = decode.total_grab_amount.longValue();
        return redPacketDetail;
    }

    /* renamed from: a */
    private List<RedPacketDetailItem> m189607a(GetHongbaoRecvDetailResponse getHongbaoRecvDetailResponse) {
        Chatter chatter;
        ArrayList arrayList = new ArrayList();
        C14928Entity entity = getHongbaoRecvDetailResponse.entity;
        if (entity == null) {
            return arrayList;
        }
        Map<String, Chatter> map = entity.chatters;
        for (HongbaoRecvDetail hongbaoRecvDetail : getHongbaoRecvDetailResponse.details) {
            RedPacketDetailItem redPacketDetailItem = new RedPacketDetailItem();
            IChatterParser iChatterParser = this.f120936b;
            if (map == null) {
                chatter = null;
            } else {
                chatter = map.get(hongbaoRecvDetail.user_id);
            }
            redPacketDetailItem.chatter = iChatterParser.getChatter(chatter);
            redPacketDetailItem.amount = hongbaoRecvDetail.amount.longValue();
            redPacketDetailItem.time = hongbaoRecvDetail.time.longValue();
            arrayList.add(redPacketDetailItem);
        }
        return arrayList;
    }

    /* renamed from: a */
    private Observable<RedPacketInfo> m189604a(final String str, final boolean z) {
        return Observable.create(new ObservableOnSubscribe<RedPacketInfo>() {
            /* class com.ss.android.lark.money.redpacket.p2369b.C48040d.AnonymousClass11 */

            @Override // io.reactivex.ObservableOnSubscribe
            public void subscribe(final ObservableEmitter<RedPacketInfo> observableEmitter) throws Exception {
                C48040d.this.mo168223b(str, z, new IGetDataCallback<RedPacketInfo>() {
                    /* class com.ss.android.lark.money.redpacket.p2369b.C48040d.AnonymousClass11.C480421 */

                    /* renamed from: a */
                    public void onSuccess(RedPacketInfo redPacketInfo) {
                        if (redPacketInfo != null) {
                            observableEmitter.onNext(redPacketInfo);
                            observableEmitter.onComplete();
                            return;
                        }
                        observableEmitter.onError(new ErrorResult(UIHelper.getString(R.string.Lark_Legacy_UnknownError)));
                    }

                    @Override // com.larksuite.framework.callback.IGetDataCallback
                    public void onError(ErrorResult errorResult) {
                        Log.m165383e("RedPacketService", "getPacketInfo failed, id:" + str);
                        observableEmitter.onError(new ErrorResult(errorResult.getMessage()));
                    }
                });
            }
        }).subscribeOn(LarkRxSchedulers.computation());
    }

    /* renamed from: b */
    private Observable<RedPacketDetail> m189608b(final String str, final boolean z) {
        return Observable.create(new ObservableOnSubscribe<RedPacketDetail>() {
            /* class com.ss.android.lark.money.redpacket.p2369b.C48040d.AnonymousClass12 */

            @Override // io.reactivex.ObservableOnSubscribe
            public void subscribe(final ObservableEmitter<RedPacketDetail> observableEmitter) throws Exception {
                C48040d.this.mo168219a(str, "", z, new IGetDataCallback<RedPacketDetail>() {
                    /* class com.ss.android.lark.money.redpacket.p2369b.C48040d.AnonymousClass12.C480431 */

                    /* renamed from: a */
                    public void onSuccess(RedPacketDetail redPacketDetail) {
                        observableEmitter.onNext(redPacketDetail);
                        observableEmitter.onComplete();
                    }

                    @Override // com.larksuite.framework.callback.IGetDataCallback
                    public void onError(ErrorResult errorResult) {
                        Log.m165383e("RedPacketService", "getDetailList failed, id:" + str);
                        RedPacketDetail redPacketDetail = new RedPacketDetail();
                        redPacketDetail.hasMore = true;
                        redPacketDetail.detailList = new ArrayList();
                        redPacketDetail.isFakeResult = true;
                        observableEmitter.onNext(redPacketDetail);
                        observableEmitter.onComplete();
                    }
                });
            }
        }).subscribeOn(LarkRxSchedulers.computation());
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ Object m189605a(String str, byte[] bArr) throws IOException {
        return m189603a(str, GetHongbaoInfoResponse.ADAPTER.decode(bArr));
    }

    /* renamed from: a */
    private RedPacketInfo m189603a(String str, GetHongbaoInfoResponse getHongbaoInfoResponse) {
        RedPacketInfo redPacketInfo = new RedPacketInfo();
        if (getHongbaoInfoResponse == null) {
            return redPacketInfo;
        }
        C14928Entity entity = getHongbaoInfoResponse.entity;
        if (entity != null && CollectionUtils.isNotEmpty(entity.chatters)) {
            redPacketInfo.chatter = this.f120936b.getChatter(entity.chatters.get(getHongbaoInfoResponse.user_id));
        }
        redPacketInfo.totalAmount = getHongbaoInfoResponse.total_amount.longValue();
        redPacketInfo.totalNum = getHongbaoInfoResponse.total_num.intValue();
        redPacketInfo.grabNum = getHongbaoInfoResponse.grab_num.intValue();
        redPacketInfo.subject = getHongbaoInfoResponse.subject;
        redPacketInfo.type = RedPacketContent.Type.Companion.valueOf(getHongbaoInfoResponse.type.getValue());
        redPacketInfo.hasGrabbed = getHongbaoInfoResponse.has_grabbed.booleanValue();
        redPacketInfo.isExpired = getHongbaoInfoResponse.is_expired.booleanValue();
        redPacketInfo.luckyUserId = getHongbaoInfoResponse.lucky_user_id;
        redPacketInfo.grabAmount = getHongbaoInfoResponse.grab_amount.longValue();
        redPacketInfo.totalGrabAmount = getHongbaoInfoResponse.total_grab_amount.longValue();
        redPacketInfo.cover = m189600a(getHongbaoInfoResponse.cover);
        redPacketInfo.redPacketId = str;
        return redPacketInfo;
    }

    /* renamed from: b */
    public List<RedPacketHistoryItem> mo168232b(C14928Entity entity, List<GrabHongbaoRecord> list) {
        Map map;
        Map map2;
        String str;
        ArrayList arrayList = new ArrayList();
        if (entity == null || CollectionUtils.isEmpty(entity.chatters)) {
            map = new HashMap();
        } else {
            map = entity.chatters;
        }
        if (entity == null || CollectionUtils.isEmpty(entity.chats)) {
            map2 = new HashMap();
        } else {
            map2 = entity.chats;
        }
        for (GrabHongbaoRecord grabHongbaoRecord : list) {
            RedPacketHistoryItem redPacketHistoryItem = new RedPacketHistoryItem();
            redPacketHistoryItem.id = grabHongbaoRecord.id;
            redPacketHistoryItem.amount = grabHongbaoRecord.grab_amount.longValue();
            redPacketHistoryItem.time = grabHongbaoRecord.grab_time.longValue();
            redPacketHistoryItem.isP2P = grabHongbaoRecord.is_p2p.booleanValue();
            String str2 = "";
            if (grabHongbaoRecord.sender_id == null) {
                str = str2;
            } else {
                str = grabHongbaoRecord.sender_id;
            }
            redPacketHistoryItem.chatter = this.f120936b.getChatter((Chatter) map.get(str));
            if (!grabHongbaoRecord.is_p2p.booleanValue()) {
                if (grabHongbaoRecord.chat_id != null) {
                    str2 = grabHongbaoRecord.chat_id;
                }
                redPacketHistoryItem.chat = this.f120937c.getChat((Chat) map2.get(str2));
            }
            arrayList.add(redPacketHistoryItem);
        }
        return arrayList;
    }

    /* renamed from: a */
    public List<RedPacketHistoryItem> mo168230a(C14928Entity entity, List<SendHongbaoRecord> list) {
        Map map;
        Map map2;
        ArrayList arrayList = new ArrayList();
        if (entity == null || CollectionUtils.isEmpty(entity.chatters)) {
            map = new HashMap();
        } else {
            map = entity.chatters;
        }
        if (entity == null || CollectionUtils.isEmpty(entity.chats)) {
            map2 = new HashMap();
        } else {
            map2 = entity.chats;
        }
        for (SendHongbaoRecord sendHongbaoRecord : list) {
            RedPacketHistoryItem redPacketHistoryItem = new RedPacketHistoryItem();
            redPacketHistoryItem.id = sendHongbaoRecord.id;
            redPacketHistoryItem.amount = sendHongbaoRecord.total_amount.longValue();
            redPacketHistoryItem.time = sendHongbaoRecord.create_time.longValue();
            redPacketHistoryItem.totalNum = sendHongbaoRecord.total_num.intValue();
            redPacketHistoryItem.grabNum = sendHongbaoRecord.grab_num.intValue();
            redPacketHistoryItem.isExpired = sendHongbaoRecord.is_expired.booleanValue();
            redPacketHistoryItem.isP2P = sendHongbaoRecord.is_p2p.booleanValue();
            String str = "";
            if (sendHongbaoRecord.is_p2p.booleanValue()) {
                if (sendHongbaoRecord.receiver_id != null) {
                    str = sendHongbaoRecord.receiver_id;
                }
                redPacketHistoryItem.chatter = this.f120936b.getChatter((Chatter) map.get(str));
            } else {
                if (sendHongbaoRecord.chat_id != null) {
                    str = sendHongbaoRecord.chat_id;
                }
                redPacketHistoryItem.chat = this.f120937c.getChat((Chat) map2.get(str));
            }
            arrayList.add(redPacketHistoryItem);
        }
        return arrayList;
    }

    @Override // com.ss.android.lark.money.redpacket.p2369b.AbstractC48037a
    /* renamed from: c */
    public void mo168224c(String str, final boolean z, final IGetDataCallback<RedPacketDataWrapper> iGetDataCallback) {
        Observable.zip(m189604a(str, z), m189608b(str, z), new BiFunction<RedPacketInfo, RedPacketDetail, RedPacketDataWrapper>() {
            /* class com.ss.android.lark.money.redpacket.p2369b.C48040d.C480519 */

            /* renamed from: a */
            public RedPacketDataWrapper apply(RedPacketInfo redPacketInfo, RedPacketDetail redPacketDetail) throws Exception {
                int i;
                RedPacketDataWrapper redPacketDataWrapper = new RedPacketDataWrapper();
                redPacketDataWrapper.info = redPacketInfo;
                redPacketDataWrapper.detail = redPacketDetail;
                if (redPacketDataWrapper.detail != null && !redPacketDataWrapper.detail.isFakeResult && !z) {
                    if (CollectionUtils.isEmpty(redPacketDataWrapper.detail.detailList)) {
                        i = 0;
                    } else {
                        i = redPacketDataWrapper.detail.detailList.size();
                    }
                    Log.m165389i("RedPacketService", String.format("getRedPacketInfoAndRecord, mysterious code: mysterious code：(%d, %d) mysterious code：(%d, %d) gmysterious code：%d", Long.valueOf(redPacketDataWrapper.info.totalGrabAmount), Long.valueOf(redPacketDataWrapper.detail.totalGrabAmount), Integer.valueOf(redPacketDataWrapper.info.grabNum), Integer.valueOf(redPacketDataWrapper.detail.grabNum), Integer.valueOf(i)));
                    redPacketDataWrapper.info.totalGrabAmount = redPacketDataWrapper.detail.totalGrabAmount;
                    redPacketDataWrapper.info.luckyUserId = redPacketDataWrapper.detail.luckyUserId;
                    redPacketDataWrapper.info.grabNum = redPacketDataWrapper.detail.grabNum;
                }
                return redPacketDataWrapper;
            }
        }).subscribe(new Consumer<RedPacketDataWrapper>() {
            /* class com.ss.android.lark.money.redpacket.p2369b.C48040d.C480497 */

            /* renamed from: a */
            public void accept(RedPacketDataWrapper redPacketDataWrapper) throws Exception {
                iGetDataCallback.onSuccess(redPacketDataWrapper);
            }
        }, new ReportErrorConsumer() {
            /* class com.ss.android.lark.money.redpacket.p2369b.C48040d.C480508 */

            @Override // com.ss.android.lark.utils.rxjava.ReportErrorConsumer
            public void accept(Throwable th) throws Exception {
                iGetDataCallback.onError(new ErrorResult(th.getMessage()));
            }

            /* access modifiers changed from: protected */
            @Override // com.ss.android.lark.utils.rxjava.ReportErrorConsumer
            public void error(Throwable th) throws Exception {
                iGetDataCallback.onError(new ErrorResult(th.getMessage()));
            }
        });
    }

    @Override // com.ss.android.lark.money.redpacket.p2369b.AbstractC48037a
    /* renamed from: b */
    public void mo168223b(String str, boolean z, IGetDataCallback<RedPacketInfo> iGetDataCallback) {
        HongbaoType hongbaoType;
        GetHongbaoInfoRequest.Builder builder = new GetHongbaoInfoRequest.Builder();
        builder.id(str);
        if (z) {
            hongbaoType = HongbaoType.COMMERCIAL;
        } else {
            hongbaoType = HongbaoType.NORMAL;
        }
        builder.hongbao_type(hongbaoType);
        SdkSender.asynSendRequestNonWrap(Command.GET_HONGBAO_INFO, builder, iGetDataCallback, new SdkSender.IParser(str) {
            /* class com.ss.android.lark.money.redpacket.p2369b.$$Lambda$d$CV7PJthJ3yzlny9NKRe7AhuxUM */
            public final /* synthetic */ String f$1;

            {
                this.f$1 = r2;
            }

            @Override // com.ss.android.lark.sdk.SdkSender.IParser
            public final Object parse(byte[] bArr) {
                return C48040d.this.m189605a((C48040d) this.f$1, (String) bArr);
            }
        });
    }

    @Override // com.ss.android.lark.money.redpacket.p2369b.AbstractC48037a
    /* renamed from: b */
    public void mo168222b(int i, String str, int i2, IGetDataCallback<RedPacketHistoryResponse> iGetDataCallback) {
        GetGrabHongbaoRecordRequest.Builder builder = new GetGrabHongbaoRecordRequest.Builder();
        builder.year(Integer.valueOf(i)).cursor(str).count(Integer.valueOf(i2));
        SdkSender.asynSendRequestNonWrap(Command.GET_GRAB_HONGBAO_RECORD, builder, iGetDataCallback, new SdkSender.IParser<RedPacketHistoryResponse>() {
            /* class com.ss.android.lark.money.redpacket.p2369b.C48040d.C480453 */

            /* renamed from: a */
            public RedPacketHistoryResponse parse(byte[] bArr) throws IOException {
                GetGrabHongbaoRecordResponse decode = GetGrabHongbaoRecordResponse.ADAPTER.decode(bArr);
                RedPacketHistoryResponse redPacketHistoryResponse = new RedPacketHistoryResponse();
                redPacketHistoryResponse.totalAmount = decode.total_amount.longValue();
                redPacketHistoryResponse.totalNum = decode.total_num.intValue();
                redPacketHistoryResponse.hasMore = decode.has_more.booleanValue();
                redPacketHistoryResponse.nextCursor = decode.next_cursor;
                redPacketHistoryResponse.redPacketHistoryItemList = C48040d.this.mo168232b(decode.entity, decode.records);
                return redPacketHistoryResponse;
            }
        });
    }
}
