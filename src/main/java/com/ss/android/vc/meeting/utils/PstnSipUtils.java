package com.ss.android.vc.meeting.utils;

import android.text.TextUtils;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.pb.videochat.GetPstnSipFeatureConfigRequest;
import com.ss.android.lark.pb.videoconference.v1.GetAdminSettingsResponse;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.utils.rxjava.LarkRxSchedulers;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60733aa;
import com.ss.android.vc.common.p3083e.C60754h;
import com.ss.android.vc.common.p3083e.C60773o;
import com.ss.android.vc.dependency.AbstractC60907u;
import com.ss.android.vc.dependency.VideoChatModuleDependency;
import com.ss.android.vc.dependency.ar;
import com.ss.android.vc.entity.AdminSettings;
import com.ss.android.vc.entity.ParticipantType;
import com.ss.android.vc.entity.PstnDetailInfoResponse;
import com.ss.android.vc.entity.VCFeatureConfig;
import com.ss.android.vc.entity.VideoChatH323Setting;
import com.ss.android.vc.entity.p3092a.C60930c;
import com.ss.android.vc.entity.response.C60991z;
import com.ss.android.vc.meeting.module.meetingdialog.meetinginfo.pstn.PstnInviteInfo;
import com.ss.android.vc.meeting.module.meetingdialog.pstn.country.C62413e;
import com.ss.android.vc.meeting.module.meetingdialog.pstn.country.CountryListManifest;
import com.ss.android.vc.net.request.AbstractC63598b;
import com.ss.android.vc.net.request.C63602e;
import com.ss.android.vc.net.request.VcBizSender;
import com.ss.android.vc.net.service.GetUserInfoListener;
import com.ss.android.vc.net.service.UserInfoService;
import com.ss.android.vc.net.service.VideoChatUser;
import com.ss.android.vc.service.C63634c;
import com.ss.android.vcxp.annotation.XClass;
import com.ss.android.vcxp.annotation.XProcess;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.functions.AbstractC68318j;
import io.reactivex.functions.Consumer;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00032\u00020\u0001:\u0002\u0003\u0004B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0005"}, d2 = {"Lcom/ss/android/vc/meeting/utils/PstnSipUtils;", "", "()V", "Companion", "ResultWrapper", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
@XClass(isStatic = true, runOnProcess = XProcess.VC)
public final class PstnSipUtils {

    /* renamed from: a */
    public static final String f160322a = f160322a;

    /* renamed from: b */
    public static final Companion f160323b = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002Jz\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00042\b\u0010\t\u001a\u0004\u0018\u00010\u00042\b\u0010\n\u001a\u0004\u0018\u00010\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0002J\u0001\u0010\u0019\u001a\u00020\u001a2\b\u0010\b\u001a\u0004\u0018\u00010\u00042\b\u0010\t\u001a\u0004\u0018\u00010\u00042\b\u0010\n\u001a\u0004\u0018\u00010\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u00042\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0002J\u001c\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0!0 2\u0006\u0010\"\u001a\u00020\u0004H\u0002J\u000e\u0010#\u001a\b\u0012\u0004\u0012\u00020\u000f0 H\u0002J&\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140!0 2\u0006\u0010%\u001a\u00020\u00042\b\u0010&\u001a\u0004\u0018\u00010\u0004H\u0002J4\u0010'\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0!0 2\u0006\u0010(\u001a\u00020\u00042\u0006\u0010%\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\u00042\u0006\u0010)\u001a\u00020*H\u0002Jd\u0010+\u001a\u00020,2\b\u0010%\u001a\u0004\u0018\u00010\u00042\b\u0010(\u001a\u0004\u0018\u00010\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00042\b\u0010\n\u001a\u0004\u0018\u00010\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\u00042\b\u0010\"\u001a\u0004\u0018\u00010\u00042\u0006\u0010)\u001a\u00020*2\b\u0010\t\u001a\u0004\u0018\u00010\u00042\u000e\u0010-\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010.J\u0016\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00040 2\u0006\u0010%\u001a\u00020\u0004H\u0002J&\u00100\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040!0 2\b\u00101\u001a\u0004\u0018\u00010\u00042\u0006\u0010(\u001a\u00020\u0004H\u0002J\u001c\u00102\u001a\b\u0012\u0004\u0012\u00020\u00180 2\f\u00103\u001a\b\u0012\u0004\u0012\u00020\u00040\u0016H\u0002J\b\u00104\u001a\u00020\rH\u0002J,\u00105\u001a\u00020\r2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u000e\u00106\u001a\n\u0012\u0004\u0012\u000207\u0018\u00010\u0016H\u0002J\u0012\u00108\u001a\u00020\r2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0002R\u0014\u0010\u0003\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u00069"}, d2 = {"Lcom/ss/android/vc/meeting/utils/PstnSipUtils$Companion;", "", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "buildPstnCopyMessage", "meetingTitle", "meetingTimeStr", "attendeeName", "meetingUrl", "isInterviewMeeting", "", "manifest", "Lcom/ss/android/vc/meeting/module/meetingdialog/pstn/country/CountryListManifest;", "sipDomain", "adminSettings", "Lcom/ss/android/vc/entity/AdminSettings;", "h323Setting", "Lcom/ss/android/vc/entity/VideoChatH323Setting;", "i18nKeys", "", "entity", "Lcom/ss/android/vc/entity/response/GetViewI18nTemplateEntity;", "buildPstnDetailInfoResponse", "Lcom/ss/android/vc/entity/PstnDetailInfoResponse;", "vcFeatureConfig", "Lcom/ss/android/vc/entity/VCFeatureConfig;", "adminSettingsResponse", "Lcom/ss/android/lark/pb/videoconference/v1/GetAdminSettingsResponse;", "getAdminSettingsObservable", "Lio/reactivex/Observable;", "Lcom/ss/android/vc/meeting/utils/PstnSipUtils$ResultWrapper;", "tenantId", "getCountryListManifest", "getH323FeatureConfig", "uniqueId", "meetingNumber", "getPstnAndSipFeatureConfig", "userId", "calendarType", "Lcom/ss/android/lark/pb/videochat/GetPstnSipFeatureConfigRequest$CalendarType;", "getPstnDetailInfoX", "", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "getSipDomainStrObservable", "getUserName", "userName", "getViewI18nTemplateObservable", "keys", "isH323Enable", "isPstnEnable", "pstnInviteInfos", "Lcom/ss/android/vc/meeting/module/meetingdialog/meetinginfo/pstn/PstnInviteInfo;", "isSipEnable", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.utils.PstnSipUtils$a */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: a */
        public final String mo219586a() {
            return PstnSipUtils.f160322a;
        }

        /* renamed from: a */
        public final void mo219587a(String str, String str2, String str3, String str4, String str5, String str6, GetPstnSipFeatureConfigRequest.CalendarType calendarType, String str7, IGetDataCallback<PstnDetailInfoResponse> iGetDataCallback) {
            Intrinsics.checkParameterIsNotNull(calendarType, "calendarType");
            if (str == null || str2 == null || str6 == null) {
                String str8 = str == null ? "uniqueId is null" : str2 == null ? "userId is null" : str6 == null ? "tenantId is null" : "param invalid";
                C60700b.m235861e(mo219586a(), "[getPstnDetailInfoX]", "param invalid");
                if (iGetDataCallback != null) {
                    iGetDataCallback.onError(new ErrorResult(str8));
                    return;
                }
                return;
            }
            String b = C60754h.m236086b(str5);
            ArrayList arrayList = new ArrayList();
            arrayList.add("View_MV_InvitesToFeishuMeeting");
            arrayList.add("View_N_MeetingTopicColon");
            arrayList.add("View_MV_MeetingTimeHere");
            arrayList.add("View_M_MeetingIdColon");
            arrayList.add("View_N_MeetingLinkColon");
            Companion aVar = this;
            Observable.combineLatest(aVar.m248741a(arrayList).observeOn(LarkRxSchedulers.io()), aVar.m248747c().observeOn(LarkRxSchedulers.io()), aVar.m248745b(str).observeOn(LarkRxSchedulers.io()), aVar.m248740a(str2, str, str6, calendarType).observeOn(LarkRxSchedulers.io()), aVar.m248738a(str6).observeOn(LarkRxSchedulers.io()), aVar.m248739a(str, b).observeOn(LarkRxSchedulers.io()), aVar.m248746b(str4, str2).observeOn(LarkRxSchedulers.io()), new C63470e(calendarType, str3, str7, str5, arrayList)).subscribeOn(LarkRxSchedulers.io()).observeOn(LarkRxSchedulers.mainThread()).subscribe(new C63471f(iGetDataCallback), new C63472g(iGetDataCallback));
        }

        /* renamed from: b */
        public final boolean mo219588b() {
            return C63634c.m249496b("byteview.meeting.copyh323invitation");
        }

        /* renamed from: c */
        private final Observable<CountryListManifest> m248747c() {
            Observable<CountryListManifest> create = Observable.create(C63465b.f160325a);
            Intrinsics.checkExpressionValueIsNotNull(create, "Observable.create { emit…nComplete()\n            }");
            return create;
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "pstnDetailInfoResponse", "Lcom/ss/android/vc/entity/PstnDetailInfoResponse;", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.vc.meeting.utils.PstnSipUtils$a$f */
        public static final class C63471f<T> implements Consumer<PstnDetailInfoResponse> {

            /* renamed from: a */
            final /* synthetic */ IGetDataCallback f160339a;

            C63471f(IGetDataCallback iGetDataCallback) {
                this.f160339a = iGetDataCallback;
            }

            /* renamed from: a */
            public final void accept(PstnDetailInfoResponse hVar) {
                IGetDataCallback iGetDataCallback = this.f160339a;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onSuccess(hVar);
                }
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "emitter", "Lio/reactivex/ObservableEmitter;", "Lcom/ss/android/vc/meeting/utils/PstnSipUtils$ResultWrapper;", "Lcom/ss/android/lark/pb/videoconference/v1/GetAdminSettingsResponse;", "subscribe"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.vc.meeting.utils.PstnSipUtils$a$a */
        public static final class C63464a<T> implements ObservableOnSubscribe<T> {

            /* renamed from: a */
            final /* synthetic */ String f160324a;

            C63464a(String str) {
                this.f160324a = str;
            }

            @Override // io.reactivex.ObservableOnSubscribe
            public final void subscribe(ObservableEmitter<ResultWrapper<GetAdminSettingsResponse>> observableEmitter) {
                Intrinsics.checkParameterIsNotNull(observableEmitter, "emitter");
                try {
                    observableEmitter.onNext(new ResultWrapper<>(VcBizSender.syncGetAdminSettingsResponse(this.f160324a)));
                    observableEmitter.onComplete();
                } catch (IOException e) {
                    observableEmitter.onError(e);
                }
            }
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "emitter", "Lio/reactivex/ObservableEmitter;", "Lcom/ss/android/vc/meeting/module/meetingdialog/pstn/country/CountryListManifest;", "subscribe"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.vc.meeting.utils.PstnSipUtils$a$b */
        public static final class C63465b<T> implements ObservableOnSubscribe<T> {

            /* renamed from: a */
            public static final C63465b f160325a = new C63465b();

            C63465b() {
            }

            @Override // io.reactivex.ObservableOnSubscribe
            public final void subscribe(ObservableEmitter<CountryListManifest> observableEmitter) {
                Intrinsics.checkParameterIsNotNull(observableEmitter, "emitter");
                CountryListManifest b = C62413e.m243942a().mo215805b(ar.m236694a());
                if (b == null) {
                    b = new CountryListManifest();
                }
                observableEmitter.onNext(b);
                observableEmitter.onComplete();
            }
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "emitter", "Lio/reactivex/ObservableEmitter;", "Lcom/ss/android/vc/meeting/utils/PstnSipUtils$ResultWrapper;", "Lcom/ss/android/vc/entity/VCFeatureConfig;", "subscribe"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.vc.meeting.utils.PstnSipUtils$a$d */
        public static final class C63468d<T> implements ObservableOnSubscribe<T> {

            /* renamed from: a */
            final /* synthetic */ String f160329a;

            /* renamed from: b */
            final /* synthetic */ String f160330b;

            /* renamed from: c */
            final /* synthetic */ String f160331c;

            /* renamed from: d */
            final /* synthetic */ GetPstnSipFeatureConfigRequest.CalendarType f160332d;

            C63468d(String str, String str2, String str3, GetPstnSipFeatureConfigRequest.CalendarType calendarType) {
                this.f160329a = str;
                this.f160330b = str2;
                this.f160331c = str3;
                this.f160332d = calendarType;
            }

            @Override // io.reactivex.ObservableOnSubscribe
            public final void subscribe(final ObservableEmitter<ResultWrapper<VCFeatureConfig>> observableEmitter) {
                Intrinsics.checkParameterIsNotNull(observableEmitter, "emitter");
                try {
                    VcBizSender.getPstnSipFeatureConfig(this.f160329a, this.f160330b, this.f160331c, this.f160332d, new AbstractC63598b<VCFeatureConfig>() {
                        /* class com.ss.android.vc.meeting.utils.PstnSipUtils.Companion.C63468d.C634691 */

                        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: io.reactivex.ObservableEmitter */
                        /* JADX WARN: Multi-variable type inference failed */
                        /* renamed from: a */
                        public void onSuccess(VCFeatureConfig vCFeatureConfig) {
                            observableEmitter.onNext(new ResultWrapper(vCFeatureConfig));
                            observableEmitter.onComplete();
                        }

                        @Override // com.ss.android.vc.net.request.AbstractC63598b
                        public void onError(C63602e eVar) {
                            Intrinsics.checkParameterIsNotNull(eVar, "err");
                            observableEmitter.onError(eVar.f160599b);
                        }
                    });
                } catch (IOException e) {
                    observableEmitter.onError(e);
                }
            }
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "throwable", "", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.vc.meeting.utils.PstnSipUtils$a$g */
        public static final class C63472g<T> implements Consumer<Throwable> {

            /* renamed from: a */
            final /* synthetic */ IGetDataCallback f160340a;

            C63472g(IGetDataCallback iGetDataCallback) {
                this.f160340a = iGetDataCallback;
            }

            /* renamed from: a */
            public final void accept(Throwable th) {
                IGetDataCallback iGetDataCallback = this.f160340a;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onError(new ErrorResult(th.getMessage()));
                }
            }
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "emitter", "Lio/reactivex/ObservableEmitter;", "", "subscribe"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.vc.meeting.utils.PstnSipUtils$a$h */
        public static final class C63473h<T> implements ObservableOnSubscribe<T> {

            /* renamed from: a */
            final /* synthetic */ String f160341a;

            C63473h(String str) {
                this.f160341a = str;
            }

            @Override // io.reactivex.ObservableOnSubscribe
            public final void subscribe(final ObservableEmitter<String> observableEmitter) {
                Intrinsics.checkParameterIsNotNull(observableEmitter, "emitter");
                try {
                    VcBizSender.getSIPDomainByUniqueID(this.f160341a, new AbstractC63598b<String>() {
                        /* class com.ss.android.vc.meeting.utils.PstnSipUtils.Companion.C63473h.C634741 */

                        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: io.reactivex.ObservableEmitter */
                        /* JADX WARN: Multi-variable type inference failed */
                        /* renamed from: a */
                        public void onSuccess(String str) {
                            ObservableEmitter observableEmitter = observableEmitter;
                            if (str == null) {
                                str = "";
                            }
                            observableEmitter.onNext(str);
                            observableEmitter.onComplete();
                        }

                        @Override // com.ss.android.vc.net.request.AbstractC63598b
                        public void onError(C63602e eVar) {
                            Intrinsics.checkParameterIsNotNull(eVar, "err");
                            observableEmitter.onError(eVar.f160599b);
                        }
                    });
                } catch (IOException e) {
                    observableEmitter.onError(e);
                }
            }
        }

        /* renamed from: a */
        private final Observable<ResultWrapper<GetAdminSettingsResponse>> m248738a(String str) {
            Observable<ResultWrapper<GetAdminSettingsResponse>> create = Observable.create(new C63464a(str));
            Intrinsics.checkExpressionValueIsNotNull(create, "Observable.create { emit…          }\n            }");
            return create;
        }

        /* renamed from: b */
        private final Observable<String> m248745b(String str) {
            Observable<String> subscribeOn = Observable.create(new C63473h(str)).subscribeOn(LarkRxSchedulers.io());
            Intrinsics.checkExpressionValueIsNotNull(subscribeOn, "Observable.create { emit…On(LarkRxSchedulers.io())");
            return subscribeOn;
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "emitter", "Lio/reactivex/ObservableEmitter;", "Lcom/ss/android/vc/entity/response/GetViewI18nTemplateEntity;", "subscribe"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.vc.meeting.utils.PstnSipUtils$a$j */
        public static final class C63477j<T> implements ObservableOnSubscribe<T> {

            /* renamed from: a */
            final /* synthetic */ List f160346a;

            C63477j(List list) {
                this.f160346a = list;
            }

            @Override // io.reactivex.ObservableOnSubscribe
            public final void subscribe(ObservableEmitter<C60991z> observableEmitter) {
                Intrinsics.checkParameterIsNotNull(observableEmitter, "emitter");
                try {
                    C60991z e = VcBizSender.m249266e(this.f160346a);
                    if (e == null) {
                        e = new C60991z();
                    }
                    observableEmitter.onNext(e);
                    observableEmitter.onComplete();
                } catch (IOException e2) {
                    observableEmitter.onError(e2);
                }
            }
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "emitter", "Lio/reactivex/ObservableEmitter;", "Lcom/ss/android/vc/meeting/utils/PstnSipUtils$ResultWrapper;", "Lcom/ss/android/vc/entity/VideoChatH323Setting;", "subscribe"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.vc.meeting.utils.PstnSipUtils$a$c */
        public static final class C63466c<T> implements ObservableOnSubscribe<T> {

            /* renamed from: a */
            final /* synthetic */ String f160326a;

            /* renamed from: b */
            final /* synthetic */ String f160327b;

            C63466c(String str, String str2) {
                this.f160326a = str;
                this.f160327b = str2;
            }

            @Override // io.reactivex.ObservableOnSubscribe
            public final void subscribe(final ObservableEmitter<ResultWrapper<VideoChatH323Setting>> observableEmitter) {
                String str;
                boolean z;
                Intrinsics.checkParameterIsNotNull(observableEmitter, "emitter");
                try {
                    if (PstnSipUtils.f160323b.mo219588b() && (str = this.f160326a) != null) {
                        if (str.length() == 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (!z) {
                            VcBizSender.getH323Setting(this.f160327b, this.f160326a, new AbstractC63598b<VideoChatH323Setting>() {
                                /* class com.ss.android.vc.meeting.utils.PstnSipUtils.Companion.C63466c.C634671 */

                                /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: io.reactivex.ObservableEmitter */
                                /* JADX WARN: Multi-variable type inference failed */
                                /* renamed from: a */
                                public void onSuccess(VideoChatH323Setting videoChatH323Setting) {
                                    observableEmitter.onNext(new ResultWrapper(videoChatH323Setting));
                                    observableEmitter.onComplete();
                                }

                                @Override // com.ss.android.vc.net.request.AbstractC63598b
                                public void onError(C63602e eVar) {
                                    Intrinsics.checkParameterIsNotNull(eVar, "err");
                                    observableEmitter.onError(eVar.f160599b);
                                }
                            });
                            return;
                        }
                    }
                    observableEmitter.onNext(new ResultWrapper<>(null));
                    observableEmitter.onComplete();
                } catch (IOException e) {
                    observableEmitter.onError(e);
                }
            }
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "emitter", "Lio/reactivex/ObservableEmitter;", "Lcom/ss/android/vc/meeting/utils/PstnSipUtils$ResultWrapper;", "", "subscribe"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.vc.meeting.utils.PstnSipUtils$a$i */
        public static final class C63475i<T> implements ObservableOnSubscribe<T> {

            /* renamed from: a */
            final /* synthetic */ String f160343a;

            /* renamed from: b */
            final /* synthetic */ String f160344b;

            C63475i(String str, String str2) {
                this.f160343a = str;
                this.f160344b = str2;
            }

            @Override // io.reactivex.ObservableOnSubscribe
            public final void subscribe(final ObservableEmitter<ResultWrapper<String>> observableEmitter) {
                String name;
                boolean z;
                Intrinsics.checkParameterIsNotNull(observableEmitter, "emitter");
                String str = this.f160343a;
                boolean z2 = false;
                if (str != null) {
                    if (str.length() > 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        observableEmitter.onNext(new ResultWrapper<>(this.f160343a));
                        observableEmitter.onComplete();
                        return;
                    }
                }
                VideoChatUser userInfoInCache = UserInfoService.getUserInfoInCache(this.f160344b, ParticipantType.LARK_USER);
                if (!(userInfoInCache == null || (name = userInfoInCache.getName()) == null)) {
                    if (name.length() > 0) {
                        z2 = true;
                    }
                    if (z2) {
                        observableEmitter.onNext(new ResultWrapper<>(userInfoInCache.getName()));
                        observableEmitter.onComplete();
                        return;
                    }
                }
                try {
                    UserInfoService.getChatterById(this.f160344b, new GetUserInfoListener() {
                        /* class com.ss.android.vc.meeting.utils.PstnSipUtils.Companion.C63475i.C634761 */

                        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: io.reactivex.ObservableEmitter */
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // com.ss.android.vc.net.service.GetUserInfoListener
                        public final void onGetUserInfo(VideoChatUser videoChatUser) {
                            ObservableEmitter observableEmitter = observableEmitter;
                            Intrinsics.checkExpressionValueIsNotNull(videoChatUser, "it");
                            observableEmitter.onNext(new ResultWrapper(videoChatUser.getName()));
                            observableEmitter.onComplete();
                        }
                    });
                } catch (IOException e) {
                    observableEmitter.onError(e);
                }
            }
        }

        /* renamed from: a */
        private final Observable<C60991z> m248741a(List<String> list) {
            Observable<C60991z> create = Observable.create(new C63477j(list));
            Intrinsics.checkExpressionValueIsNotNull(create, "Observable.create { emit…          }\n            }");
            return create;
        }

        /* renamed from: a */
        private final boolean m248743a(VCFeatureConfig vCFeatureConfig) {
            VCFeatureConfig.Sip sip;
            boolean b = C63634c.m249496b("byteview.meeting.android.copysipinvitation");
            boolean z = true;
            if (vCFeatureConfig == null || (sip = vCFeatureConfig.getSip()) == null || !sip.isSipCallInEnable()) {
                z = false;
            }
            return b & z;
        }

        /* renamed from: a */
        private final Observable<ResultWrapper<VideoChatH323Setting>> m248739a(String str, String str2) {
            Observable<ResultWrapper<VideoChatH323Setting>> create = Observable.create(new C63466c(str2, str));
            Intrinsics.checkExpressionValueIsNotNull(create, "Observable.create { emit…          }\n            }");
            return create;
        }

        /* renamed from: b */
        private final Observable<ResultWrapper<String>> m248746b(String str, String str2) {
            Observable<ResultWrapper<String>> create = Observable.create(new C63475i(str, str2));
            Intrinsics.checkExpressionValueIsNotNull(create, "Observable.create { emit…          }\n            }");
            return create;
        }

        /* renamed from: a */
        private final boolean m248744a(VCFeatureConfig vCFeatureConfig, AdminSettings adminSettings, List<PstnInviteInfo> list) {
            boolean z;
            VCFeatureConfig.Pstn pstn;
            boolean z2 = false;
            if (CollectionUtils.isEmpty(list)) {
                return false;
            }
            boolean b = C63634c.m249496b("byteview.meeting.android.copyinvitation");
            if (adminSettings == null || !adminSettings.pstnEnableIncomingCall) {
                z = false;
            } else {
                z = true;
            }
            boolean z3 = z & b;
            if (!(vCFeatureConfig == null || (pstn = vCFeatureConfig.getPstn()) == null || !pstn.isPstnCallInEnabled())) {
                z2 = true;
            }
            return z3 & z2;
        }

        /* renamed from: a */
        private final Observable<ResultWrapper<VCFeatureConfig>> m248740a(String str, String str2, String str3, GetPstnSipFeatureConfigRequest.CalendarType calendarType) {
            Observable<ResultWrapper<VCFeatureConfig>> create = Observable.create(new C63468d(str, str2, str3, calendarType));
            Intrinsics.checkExpressionValueIsNotNull(create, "Observable.create { emit…          }\n            }");
            return create;
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\t2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\tH\n¢\u0006\u0002\b\u0010"}, d2 = {"<anonymous>", "Lcom/ss/android/vc/entity/PstnDetailInfoResponse;", "templateEntity", "Lcom/ss/android/vc/entity/response/GetViewI18nTemplateEntity;", "manifest", "Lcom/ss/android/vc/meeting/module/meetingdialog/pstn/country/CountryListManifest;", "sipDomain", "", "vcFeatureConfigWrapper", "Lcom/ss/android/vc/meeting/utils/PstnSipUtils$ResultWrapper;", "Lcom/ss/android/vc/entity/VCFeatureConfig;", "adminSettingsResponseWrapper", "Lcom/ss/android/lark/pb/videoconference/v1/GetAdminSettingsResponse;", "h323SettingWrapper", "Lcom/ss/android/vc/entity/VideoChatH323Setting;", "userNameWrapper", "apply"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.vc.meeting.utils.PstnSipUtils$a$e */
        public static final class C63470e<T1, T2, T3, T4, T5, T6, T7, R> implements AbstractC68318j<C60991z, CountryListManifest, String, ResultWrapper<VCFeatureConfig>, ResultWrapper<GetAdminSettingsResponse>, ResultWrapper<VideoChatH323Setting>, ResultWrapper<String>, PstnDetailInfoResponse> {

            /* renamed from: a */
            final /* synthetic */ GetPstnSipFeatureConfigRequest.CalendarType f160334a;

            /* renamed from: b */
            final /* synthetic */ String f160335b;

            /* renamed from: c */
            final /* synthetic */ String f160336c;

            /* renamed from: d */
            final /* synthetic */ String f160337d;

            /* renamed from: e */
            final /* synthetic */ List f160338e;

            C63470e(GetPstnSipFeatureConfigRequest.CalendarType calendarType, String str, String str2, String str3, List list) {
                this.f160334a = calendarType;
                this.f160335b = str;
                this.f160336c = str2;
                this.f160337d = str3;
                this.f160338e = list;
            }

            /* renamed from: a */
            public final PstnDetailInfoResponse mo219592a(C60991z zVar, CountryListManifest countryListManifest, String str, ResultWrapper<VCFeatureConfig> bVar, ResultWrapper<GetAdminSettingsResponse> bVar2, ResultWrapper<VideoChatH323Setting> bVar3, ResultWrapper<String> bVar4) {
                boolean z;
                Intrinsics.checkParameterIsNotNull(zVar, "templateEntity");
                Intrinsics.checkParameterIsNotNull(countryListManifest, "manifest");
                Intrinsics.checkParameterIsNotNull(str, "sipDomain");
                Intrinsics.checkParameterIsNotNull(bVar, "vcFeatureConfigWrapper");
                Intrinsics.checkParameterIsNotNull(bVar2, "adminSettingsResponseWrapper");
                Intrinsics.checkParameterIsNotNull(bVar3, "h323SettingWrapper");
                Intrinsics.checkParameterIsNotNull(bVar4, "userNameWrapper");
                if (GetPstnSipFeatureConfigRequest.CalendarType.CALENDAR_TYPE_INTERVIEW.getValue() == this.f160334a.getValue()) {
                    z = true;
                } else {
                    z = false;
                }
                Companion aVar = PstnSipUtils.f160323b;
                String str2 = this.f160335b;
                String str3 = this.f160336c;
                String a = bVar4.mo219596a();
                if (a == null) {
                    a = "";
                }
                return aVar.mo219585a(str2, str3, a, this.f160337d, z, countryListManifest, str, bVar.mo219596a(), bVar2.mo219596a(), bVar3.mo219596a(), this.f160338e, zVar);
            }
        }

        /* renamed from: a */
        private final String m248742a(String str, String str2, String str3, String str4, boolean z, CountryListManifest countryListManifest, String str5, AdminSettings adminSettings, VideoChatH323Setting videoChatH323Setting, List<String> list, C60991z zVar) {
            String str6;
            String str7;
            boolean z2;
            String str8;
            String str9 = "";
            if (str != null) {
                str6 = str;
            } else {
                str6 = str9;
            }
            if (z) {
                str6 = UIHelper.mustacheFormat((int) R.string.View_M_VideoInterviewNameBraces, "name", str6);
                Intrinsics.checkExpressionValueIsNotNull(str6, "UIHelper.mustacheFormat(…ngTopic\n                )");
            }
            if (TextUtils.isEmpty(str6)) {
                str6 = C60773o.m236119a((int) R.string.View_G_ServerNoTitle);
                Intrinsics.checkExpressionValueIsNotNull(str6, "VCCommonUtils.getString(…ing.View_G_ServerNoTitle)");
            }
            String b = C60754h.m236086b(str4);
            Intrinsics.checkExpressionValueIsNotNull(b, "MeetNumberUtil.parseMeet…romMeetingUrl(meetingUrl)");
            StringBuilder sb = new StringBuilder();
            if (!(zVar == null || zVar.f152731a == null)) {
                for (String str10 : list) {
                    if (Intrinsics.areEqual(str10, "View_MV_InvitesToFeishuMeeting")) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (str3 != null) {
                            str8 = str3;
                        } else {
                            str8 = str9;
                        }
                        linkedHashMap.put("name", str8);
                        AbstractC60907u larkAppDependency = VideoChatModuleDependency.getLarkAppDependency();
                        str7 = str9;
                        Intrinsics.checkExpressionValueIsNotNull(larkAppDependency, "VideoChatModuleDependency.getLarkAppDependency()");
                        String b2 = larkAppDependency.mo196409b();
                        Intrinsics.checkExpressionValueIsNotNull(b2, "VideoChatModuleDependenc…pDependency().larkAppName");
                        linkedHashMap.put("appName", b2);
                        sb.append(UIHelper.mustacheFormat((int) R.string.View_MV_InvitesToFeishuMeeting, linkedHashMap));
                        sb.append("\n");
                    } else {
                        str7 = str9;
                        if (Intrinsics.areEqual(str10, "View_MV_MeetingTimeHere")) {
                            String str11 = str2;
                            if (str11 == null || str11.length() == 0) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if (!z2) {
                                sb.append(UIHelper.mustacheFormat((int) R.string.View_MV_MeetingTimeHere, "time", str2));
                                sb.append("\n");
                            }
                        }
                        if (Intrinsics.areEqual(str10, "View_M_MeetingIdColon") && !TextUtils.isEmpty(b)) {
                            String str12 = zVar.f152731a.get(str10);
                            if (TextUtils.isEmpty(str12)) {
                                str12 = C60773o.m236119a((int) R.string.View_M_MeetingIdColon);
                            }
                            sb.append(str12);
                            sb.append(C60754h.m236085a(b) + "\n");
                        } else if (Intrinsics.areEqual(str10, "View_N_MeetingTopicColon")) {
                            String str13 = zVar.f152731a.get(str10);
                            if (TextUtils.isEmpty(str13)) {
                                str13 = C60773o.m236119a((int) R.string.View_N_MeetingTopicColon);
                            }
                            sb.append(str13);
                            sb.append(str6 + "\n");
                        } else if (Intrinsics.areEqual(str10, "View_N_MeetingLinkColon") && !TextUtils.isEmpty(str4)) {
                            String str14 = zVar.f152731a.get(str10);
                            if (TextUtils.isEmpty(str14)) {
                                str14 = C60773o.m236119a((int) R.string.View_N_MeetingLinkColon);
                            }
                            sb.append(str14);
                            sb.append(Intrinsics.stringPlus(str4, "\n"));
                        }
                    }
                    str9 = str7;
                }
                if (!(adminSettings == null || countryListManifest == null || TextUtils.isEmpty(b))) {
                    C60733aa.m235983a(b, adminSettings, countryListManifest, sb);
                }
                if (!TextUtils.isEmpty(str5) && !TextUtils.isEmpty(b)) {
                    C60733aa.m235988a(b, str5, sb);
                }
                if (videoChatH323Setting != null && CollectionUtils.isNotEmpty(videoChatH323Setting.getH323AccessList())) {
                    C60733aa.m235984a(b, videoChatH323Setting, sb);
                }
            }
            return sb.toString();
        }

        /* renamed from: a */
        public final PstnDetailInfoResponse mo219585a(String str, String str2, String str3, String str4, boolean z, CountryListManifest countryListManifest, String str5, VCFeatureConfig vCFeatureConfig, GetAdminSettingsResponse getAdminSettingsResponse, VideoChatH323Setting videoChatH323Setting, List<String> list, C60991z zVar) {
            String str6;
            String str7;
            AdminSettings a = C60930c.m236829a(getAdminSettingsResponse);
            List<PstnInviteInfo> a2 = C60733aa.m235981a(a, countryListManifest);
            Intrinsics.checkExpressionValueIsNotNull(a2, "VCTextUtils.getPstnInvit…(adminSettings, manifest)");
            Companion aVar = this;
            boolean a3 = aVar.m248744a(vCFeatureConfig, a, a2);
            boolean a4 = aVar.m248743a(vCFeatureConfig);
            String str8 = null;
            if (!a3 && !a4) {
                str7 = aVar.m248742a(str, str2, str3, str4, z, null, null, null, null, list, zVar);
                str6 = str8;
            } else if (countryListManifest == null || countryListManifest.getData() == null || CollectionUtils.isEmpty(a2)) {
                return new PstnDetailInfoResponse(false, null, null, null, null, 16, null);
            } else {
                StringCompanionObject mVar = StringCompanionObject.f173215a;
                str6 = String.format("%s (%s)", Arrays.copyOf(new Object[]{a2.get(0).mo215503b(), a2.get(0).mo215502a()}, 2));
                Intrinsics.checkExpressionValueIsNotNull(str6, "java.lang.String.format(format, *args)");
                str7 = aVar.m248742a(str, str2, str3, str4, z, countryListManifest, str5, a, videoChatH323Setting, list, zVar);
            }
            return new PstnDetailInfoResponse(a3, str7, str6, getAdminSettingsResponse, videoChatH323Setting);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00018\u0000¢\u0006\u0002\u0010\u0004J\u0010\u0010\t\u001a\u0004\u0018\u00018\u0000HÆ\u0003¢\u0006\u0002\u0010\u0006J \u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00018\u0000HÆ\u0001¢\u0006\u0002\u0010\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u001e\u0010\u0003\u001a\u0004\u0018\u00018\u0000X\u000e¢\u0006\u0010\n\u0002\u0010\b\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004¨\u0006\u0013"}, d2 = {"Lcom/ss/android/vc/meeting/utils/PstnSipUtils$ResultWrapper;", "T", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "(Ljava/lang/Object;)V", "getData", "()Ljava/lang/Object;", "setData", "Ljava/lang/Object;", "component1", "copy", "(Ljava/lang/Object;)Lcom/ss/android/vc/meeting/utils/PstnSipUtils$ResultWrapper;", "equals", "", "other", "hashCode", "", "toString", "", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.utils.PstnSipUtils$b */
    public static final class ResultWrapper<T> {

        /* renamed from: a */
        private T f160347a;

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof ResultWrapper) && Intrinsics.areEqual(this.f160347a, ((ResultWrapper) obj).f160347a);
            }
            return true;
        }

        public int hashCode() {
            T t = this.f160347a;
            if (t != null) {
                return t.hashCode();
            }
            return 0;
        }

        public String toString() {
            return "ResultWrapper(data=" + ((Object) this.f160347a) + ")";
        }

        /* renamed from: a */
        public final T mo219596a() {
            return this.f160347a;
        }

        public ResultWrapper(T t) {
            this.f160347a = t;
        }
    }
}
