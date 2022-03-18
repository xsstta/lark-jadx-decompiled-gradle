package com.ss.android.lark.guide.biz.onboarding.tour.p1926a;

import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.onboarding.v1.GetTrustedMailInfoRequest;
import com.bytedance.lark.pb.onboarding.v1.GetTrustedMailInfoResponse;
import com.bytedance.lark.pb.onboarding.v1.PutTrustedMailRequest;
import com.bytedance.lark.pb.onboarding.v1.PutTrustedMailResponse;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.guide.biz.onboarding.tour.entity.C38604a;
import com.ss.android.lark.guide.biz.onboarding.tour.entity.C38605b;
import com.ss.android.lark.guide.biz.onboarding.tour.entity.TrustedMailRequestParam;
import com.ss.android.lark.guide.biz.onboarding.tour.page.ldr.entity.LdrServiceData;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.pb.entities.PlatformType;
import com.ss.android.lark.pb.flow.BizEventReportRequest;
import com.ss.android.lark.pb.flow.GetLDRServiceAppLinkRequest;
import com.ss.android.lark.pb.flow.GetLDRServiceAppLinkResponse;
import com.ss.android.lark.pb.flow.Option;
import com.ss.android.lark.sdk.SdkSender;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.lark.guide.biz.onboarding.tour.a.b */
public class C38600b implements AbstractC38599a {

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.guide.biz.onboarding.tour.a.b$a */
    public static final class C38603a {

        /* renamed from: a */
        public static final C38600b f99176a = new C38600b();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ Object m152250a(byte[] bArr) throws IOException {
        return null;
    }

    /* renamed from: a */
    public static AbstractC38599a m152249a() {
        return C38603a.f99176a;
    }

    @Override // com.ss.android.lark.guide.biz.onboarding.tour.p1926a.AbstractC38599a
    /* renamed from: a */
    public void mo141373a(IGetDataCallback<C38604a> iGetDataCallback) {
        SdkSender.asynSendRequestNonWrap(Command.GET_TRUSTED_MAIL_INFO, new GetTrustedMailInfoRequest.C18594a(), iGetDataCallback, $$Lambda$b$FRsho3XLReIHXLySlLq5Q673QeM.INSTANCE);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static /* synthetic */ C38604a m152252c(byte[] bArr) throws IOException {
        GetTrustedMailInfoResponse decode = GetTrustedMailInfoResponse.ADAPTER.decode(bArr);
        return new C38604a(decode.need_set.booleanValue(), decode.mail);
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static /* synthetic */ C38605b m152253d(byte[] bArr) throws IOException {
        PutTrustedMailResponse decode = PutTrustedMailResponse.ADAPTER.decode(bArr);
        return new C38605b(decode.is_success.booleanValue(), decode.status_code.intValue(), decode.status_message);
    }

    @Override // com.ss.android.lark.guide.biz.onboarding.tour.p1926a.AbstractC38599a
    /* renamed from: b */
    public void mo141376b(IGetDataCallback<List<LdrServiceData>> iGetDataCallback) {
        SdkSender.sendPassThroughRequest(com.ss.android.lark.pb.improto.Command.GET_LDR_SERVICE_APPLINK, new GetLDRServiceAppLinkRequest.C49756a().mo173250a(PlatformType.PlatformAndroid), iGetDataCallback, $$Lambda$b$IRhUu3G0D3jktHceUzsK_BSc10.INSTANCE);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ List m152251b(byte[] bArr) throws IOException {
        GetLDRServiceAppLinkResponse decode = GetLDRServiceAppLinkResponse.ADAPTER.decode(bArr);
        ArrayList arrayList = new ArrayList();
        for (Option option : decode.moptions) {
            LdrServiceData aVar = new LdrServiceData();
            aVar.mo141407a(option.mtitle);
            aVar.mo141409b(option.msub_title);
            aVar.mo141411c(option.mimg_url);
            aVar.mo141413d(option.mevent_key);
            aVar.mo141417f(option.mtea_event);
            aVar.mo141415e(decode.mapp_link);
            aVar.mo141419g(decode.mbutton_report_event_key);
            arrayList.add(aVar);
        }
        if (arrayList.size() > 3) {
            return arrayList.subList(0, 3);
        }
        return arrayList;
    }

    @Override // com.ss.android.lark.guide.biz.onboarding.tour.p1926a.AbstractC38599a
    /* renamed from: a */
    public void mo141374a(TrustedMailRequestParam trustedMailRequestParam, final IGetDataCallback<C38605b> iGetDataCallback) {
        if (trustedMailRequestParam != null) {
            PutTrustedMailRequest.C18612a aVar = new PutTrustedMailRequest.C18612a();
            aVar.mo64131a(trustedMailRequestParam.mo141378a());
            aVar.mo64130a(trustedMailRequestParam.mo141379b());
            SdkSender.asynSendRequestNonWrap(Command.PUT_TRUSTED_MAIL, aVar, new IGetDataCallback<C38605b>() {
                /* class com.ss.android.lark.guide.biz.onboarding.tour.p1926a.C38600b.C386011 */

                /* renamed from: a */
                public void onSuccess(C38605b bVar) {
                    IGetDataCallback iGetDataCallback = iGetDataCallback;
                    if (iGetDataCallback != null) {
                        iGetDataCallback.onSuccess(bVar);
                    }
                }

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    IGetDataCallback iGetDataCallback = iGetDataCallback;
                    if (iGetDataCallback != null) {
                        iGetDataCallback.onError(errorResult);
                    }
                    Log.m165386e("TourService", errorResult);
                }
            }, $$Lambda$b$uVzvUD2mOg94xLfOq3ULCvjjujE.INSTANCE);
        } else if (iGetDataCallback != null) {
            Log.m165383e("TourService", "params is null");
            iGetDataCallback.onError(new ErrorResult("params is null"));
        }
    }

    @Override // com.ss.android.lark.guide.biz.onboarding.tour.p1926a.AbstractC38599a
    /* renamed from: a */
    public void mo141375a(List<String> list, Map<String, String> map) {
        if (!CollectionUtils.isEmpty(list)) {
            BizEventReportRequest.C49754a aVar = new BizEventReportRequest.C49754a();
            aVar.mo173243a("").mo173244a(list);
            if (map != null) {
                aVar.mo173245a(map);
            }
            SdkSender.sendPassThroughRequest(com.ss.android.lark.pb.improto.Command.BIZ_EVENT_REPORT, aVar, new IGetDataCallback<Object>() {
                /* class com.ss.android.lark.guide.biz.onboarding.tour.p1926a.C38600b.C386022 */

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    Log.m165384e("TourService", "bizEventReport error", errorResult);
                }

                @Override // com.larksuite.framework.callback.IGetDataCallback, com.larksuite.framework.callback.IRequestCallback
                public void onSuccess(Object obj) {
                    Log.m165389i("TourService", "bizEventReport Success");
                }
            }, $$Lambda$b$hDhvcSIMPCKQvzSnsXIv7ATs0ZQ.INSTANCE);
        }
    }
}
