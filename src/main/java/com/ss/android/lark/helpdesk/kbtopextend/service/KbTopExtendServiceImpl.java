package com.ss.android.lark.helpdesk.kbtopextend.service;

import com.google.firebase.messaging.Constants;
import com.huawei.hms.feature.dynamic.DynamicModule;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.helpdesk.monitor.HelpDeskMonitor;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.pb.improto.Command;
import com.ss.android.lark.pb.openbanner.ContainerTag;
import com.ss.android.lark.pb.openbanner.OpenBannerPostRequest;
import com.ss.android.lark.pb.openbanner.OpenBannerPullRequest;
import com.ss.android.lark.pb.openbanner.OpenBannerResponse;
import com.ss.android.lark.pb.openbanner.TargetType;
import com.ss.android.lark.sdk.C53248k;
import com.ss.android.lark.sdk.SdkSender;
import java.io.IOException;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0018B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JB\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u00042\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0016J`\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u00042\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0016J\u0010\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0006H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/ss/android/lark/helpdesk/kbtopextend/service/KbTopExtendServiceImpl;", "Lcom/ss/android/lark/helpdesk/kbtopextend/service/KbTopExtendService;", "()V", "TAG", "", "getBannerResponse", "", "targetId", "targetType", "", "containerTag", "context", "userId", "getCallback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/pb/openbanner/OpenBannerResponse;", "postBannerResponse", "resourceId", "resourceType", "value", "registerKbTopExtendPush", "openBannerPushListener", "Lcom/ss/android/lark/helpdesk/kbtopextend/service/KbTopExtendServiceImpl$OpenBannerPushListener;", "unRegisterKbTopExtendPush", "OpenBannerPushListener", "im_helpdesk_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.helpdesk.kbtopextend.a.a */
public final class KbTopExtendServiceImpl {

    /* renamed from: a */
    public static final KbTopExtendServiceImpl f99668a = new KbTopExtendServiceImpl();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/helpdesk/kbtopextend/service/KbTopExtendServiceImpl$OpenBannerPushListener;", "", "onReceiveData", "", "openBannerResponse", "Lcom/ss/android/lark/pb/openbanner/OpenBannerResponse;", "im_helpdesk_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.helpdesk.kbtopextend.a.a$a */
    public interface OpenBannerPushListener {
        /* renamed from: a */
        void mo141987a(OpenBannerResponse openBannerResponse);
    }

    private KbTopExtendServiceImpl() {
    }

    /* renamed from: a */
    public void mo141983a() {
        C53248k.m205912a().mo181699a(Command.OPEN_BANNER_PUSH);
        Log.m165389i("KbTopExtendServiceImpl", "openBanner push unregister");
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/pb/openbanner/OpenBannerResponse;", "kotlin.jvm.PlatformType", "it", "", "parse"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.helpdesk.kbtopextend.a.a$c */
    public static final class C38752c<T> implements SdkSender.IParser<T> {

        /* renamed from: a */
        public static final C38752c f99674a = new C38752c();

        C38752c() {
        }

        /* renamed from: a */
        public final OpenBannerResponse parse(byte[] bArr) {
            return OpenBannerResponse.ADAPTER.decode(bArr);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/pb/openbanner/OpenBannerResponse;", "kotlin.jvm.PlatformType", "it", "", "parse"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.helpdesk.kbtopextend.a.a$e */
    public static final class C38754e<T> implements SdkSender.IParser<T> {

        /* renamed from: a */
        public static final C38754e f99682a = new C38754e();

        C38754e() {
        }

        /* renamed from: a */
        public final OpenBannerResponse parse(byte[] bArr) {
            return OpenBannerResponse.ADAPTER.decode(bArr);
        }
    }

    /* renamed from: a */
    public void mo141984a(OpenBannerPushListener aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "openBannerPushListener");
        Log.m165389i("KbTopExtendServiceImpl", "openBannerData push register");
        C53248k.m205912a().mo181700a(Command.OPEN_BANNER_PUSH, new C38755f(aVar));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/helpdesk/kbtopextend/service/KbTopExtendServiceImpl$getBannerResponse$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/pb/openbanner/OpenBannerResponse;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "im_helpdesk_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.helpdesk.kbtopextend.a.a$b */
    public static final class C38751b implements IGetDataCallback<OpenBannerResponse> {

        /* renamed from: a */
        final /* synthetic */ String f99669a;

        /* renamed from: b */
        final /* synthetic */ int f99670b;

        /* renamed from: c */
        final /* synthetic */ int f99671c;

        /* renamed from: d */
        final /* synthetic */ long f99672d;

        /* renamed from: e */
        final /* synthetic */ IGetDataCallback f99673e;

        /* renamed from: a */
        public void onSuccess(OpenBannerResponse openBannerResponse) {
            int i;
            List<OpenBannerResponse.Container.Resource> list;
            long currentTimeMillis = System.currentTimeMillis();
            if (openBannerResponse != null) {
                Integer num = openBannerResponse.mcode;
                if (num != null && num.intValue() == 0) {
                    HelpDeskMonitor.m153000a(HelpDeskMonitor.f99630a, "open_banner_pull_result", this.f99669a, Integer.valueOf(this.f99670b), Integer.valueOf(this.f99671c), null, null, Long.valueOf(currentTimeMillis - this.f99672d), "success", null, 304, null);
                    this.f99673e.onSuccess(openBannerResponse);
                    StringBuilder sb = new StringBuilder();
                    sb.append("openBannerData pull is valid,resource size is ");
                    OpenBannerResponse.Container container = openBannerResponse.mcontainer;
                    if (container == null || (list = container.mresource_list) == null) {
                        i = 0;
                    } else {
                        i = list.size();
                    }
                    sb.append(i);
                    Log.m165389i("KbTopExtendServiceImpl", sb.toString());
                    return;
                }
                Log.m165383e("KbTopExtendServiceImpl", "openBannerData pull success but data is invalid");
                return;
            }
            Log.m165383e("KbTopExtendServiceImpl", "openBannerData pull success but data is null");
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            HelpDeskMonitor.m153000a(HelpDeskMonitor.f99630a, "open_banner_pull_result", this.f99669a, Integer.valueOf(this.f99670b), Integer.valueOf(this.f99671c), null, null, Long.valueOf(System.currentTimeMillis() - this.f99672d), "failure", errorResult.getDebugMsg(), 48, null);
            Log.m165383e("KbTopExtendServiceImpl", "openBanner push error," + errorResult.getDebugMsg() + ',' + errorResult.getErrorCode());
            this.f99673e.onError(errorResult);
        }

        C38751b(String str, int i, int i2, long j, IGetDataCallback iGetDataCallback) {
            this.f99669a = str;
            this.f99670b = i;
            this.f99671c = i2;
            this.f99672d = j;
            this.f99673e = iGetDataCallback;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/helpdesk/kbtopextend/service/KbTopExtendServiceImpl$postBannerResponse$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/pb/openbanner/OpenBannerResponse;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "im_helpdesk_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.helpdesk.kbtopextend.a.a$d */
    public static final class C38753d implements IGetDataCallback<OpenBannerResponse> {

        /* renamed from: a */
        final /* synthetic */ IGetDataCallback f99675a;

        /* renamed from: b */
        final /* synthetic */ String f99676b;

        /* renamed from: c */
        final /* synthetic */ int f99677c;

        /* renamed from: d */
        final /* synthetic */ int f99678d;

        /* renamed from: e */
        final /* synthetic */ String f99679e;

        /* renamed from: f */
        final /* synthetic */ String f99680f;

        /* renamed from: g */
        final /* synthetic */ long f99681g;

        /* renamed from: a */
        public void onSuccess(OpenBannerResponse openBannerResponse) {
            int i;
            List<OpenBannerResponse.Container.Resource> list;
            if (openBannerResponse != null) {
                this.f99675a.onSuccess(openBannerResponse);
                Integer num = openBannerResponse.mcode;
                if (num != null && num.intValue() == 0) {
                    HelpDeskMonitor.m153000a(HelpDeskMonitor.f99630a, "open_banner_button_post_result", this.f99676b, Integer.valueOf(this.f99677c), Integer.valueOf(this.f99678d), this.f99679e, this.f99680f, Long.valueOf(System.currentTimeMillis() - this.f99681g), "success", null, DynamicModule.f58006b, null);
                    StringBuilder sb = new StringBuilder();
                    sb.append("openBannerData postResponse is valid,resource size is ");
                    OpenBannerResponse.Container container = openBannerResponse.mcontainer;
                    if (container == null || (list = container.mresource_list) == null) {
                        i = 0;
                    } else {
                        i = list.size();
                    }
                    sb.append(i);
                    Log.m165389i("KbTopExtendServiceImpl", sb.toString());
                    return;
                }
                Log.m165383e("KbTopExtendServiceImpl", "openBannerData postResponse success but data is invalid");
                return;
            }
            Log.m165383e("KbTopExtendServiceImpl", "openBannerData postResponse success but data is empty");
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            HelpDeskMonitor.f99630a.mo141951a("open_banner_button_post_result", this.f99676b, Integer.valueOf(this.f99677c), Integer.valueOf(this.f99678d), this.f99679e, this.f99680f, Long.valueOf(System.currentTimeMillis() - this.f99681g), "failure", errorResult.getDebugMsg());
            Log.m165383e("KbTopExtendServiceImpl", "openBanner postResponse error," + errorResult.getDebugMsg() + ',' + errorResult.getErrorCode());
            this.f99675a.onError(errorResult);
        }

        C38753d(IGetDataCallback iGetDataCallback, String str, int i, int i2, String str2, String str3, long j) {
            this.f99675a = iGetDataCallback;
            this.f99676b = str;
            this.f99677c = i;
            this.f99678d = i2;
            this.f99679e = str2;
            this.f99680f = str3;
            this.f99681g = j;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\n¢\u0006\u0002\b\t"}, d2 = {"<anonymous>", "", "request", "", "sid", "", "fromServerPipe", "", "offlinePush", "onPush"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.helpdesk.kbtopextend.a.a$f */
    public static final class C38755f implements C53248k.AbstractC53250a {

        /* renamed from: a */
        final /* synthetic */ OpenBannerPushListener f99683a;

        C38755f(OpenBannerPushListener aVar) {
            this.f99683a = aVar;
        }

        @Override // com.ss.android.lark.sdk.C53248k.AbstractC53250a
        public final void onPush(byte[] bArr, String str, boolean z, boolean z2) {
            int i;
            List<OpenBannerResponse.Container.Resource> list;
            Intrinsics.checkParameterIsNotNull(bArr, "request");
            try {
                OpenBannerResponse decode = OpenBannerResponse.ADAPTER.decode(bArr);
                if (decode != null) {
                    Integer num = decode.mcode;
                    if (num != null) {
                        if (num.intValue() == 0) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("openBanner push is valid,");
                            sb.append("resource size is ");
                            OpenBannerResponse.Container container = decode.mcontainer;
                            if (container == null || (list = container.mresource_list) == null) {
                                i = 0;
                            } else {
                                i = list.size();
                            }
                            sb.append(i);
                            Log.m165389i("KbTopExtendServiceImpl", sb.toString());
                            this.f99683a.mo141987a(decode);
                            return;
                        }
                    }
                    Log.m165383e("KbTopExtendServiceImpl", "openBannerData push success but data is invalid");
                    return;
                }
                Log.m165383e("KbTopExtendServiceImpl", "openBannerData push success but data is null");
            } catch (IOException e) {
                Log.m165383e("KbTopExtendServiceImpl", "openBanner push error," + e.getMessage());
            }
        }
    }

    /* renamed from: a */
    public void mo141985a(String str, int i, int i2, String str2, String str3, IGetDataCallback<OpenBannerResponse> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(str, "targetId");
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "getCallback");
        long currentTimeMillis = System.currentTimeMillis();
        HelpDeskMonitor.m153000a(HelpDeskMonitor.f99630a, "open_banner_pull_start", str, Integer.valueOf(i), Integer.valueOf(i2), null, null, null, null, null, 496, null);
        Log.m165389i("KbTopExtendServiceImpl", "openBanner pull data begin");
        OpenBannerPullRequest.C49992a aVar = new OpenBannerPullRequest.C49992a();
        aVar.mo173781a(str).mo173780a(TargetType.fromValue(i)).mo173779a(ContainerTag.fromValue(i2)).mo173783b(str2).mo173784c(str3);
        SdkSender.sendPassThroughRequest(Command.OPEN_BANNER_PULL, aVar, new C38751b(str, i, i2, currentTimeMillis, iGetDataCallback), C38752c.f99674a);
    }

    /* renamed from: a */
    public void mo141986a(String str, int i, int i2, String str2, String str3, String str4, String str5, String str6, IGetDataCallback<OpenBannerResponse> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(str, "targetId");
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "getCallback");
        long currentTimeMillis = System.currentTimeMillis();
        HelpDeskMonitor.m153000a(HelpDeskMonitor.f99630a, "open_banner_button_post_start", str, Integer.valueOf(i), Integer.valueOf(i2), str3, str4, null, null, null, 448, null);
        Log.m165389i("KbTopExtendServiceImpl", "openBanner post data begin：");
        OpenBannerPostRequest.C49990a aVar = new OpenBannerPostRequest.C49990a();
        aVar.mo173769a(str).mo173768a(TargetType.fromValue(i)).mo173767a(ContainerTag.fromValue(i2)).mo173771b(str2).mo173773d(str3).mo173774e(str4).mo173775f(str5).mo173772c(str6);
        SdkSender.sendPassThroughRequest(Command.OPEN_BANNER_POST, aVar, new C38753d(iGetDataCallback, str, i, i2, str3, str4, currentTimeMillis), C38754e.f99682a);
    }
}
