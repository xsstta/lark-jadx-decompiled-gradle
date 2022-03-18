package com.ss.android.lark.invite_new_tenant.p2065c;

import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.contact.v1.GetMyPromotionLinkRequest;
import com.bytedance.lark.pb.contact.v1.GetMyPromotionLinkResponse;
import com.bytedance.lark.pb.contact.v1.GetPromotionRuleRequest;
import com.bytedance.lark.pb.contact.v1.GetPromotionRuleResponse;
import com.bytedance.lark.pb.contact.v1.SetBusinessInvitationRequest;
import com.bytedance.lark.pb.contact.v1.SetBusinessInvitationResponse;
import com.bytedance.lark.pb.statistics.v1.GetMobileCodeRequest;
import com.bytedance.lark.pb.statistics.v1.GetMobileCodeResponse;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.utils.C26249aa;
import com.ss.android.lark.invite_new_tenant.invite.all.p2067a.C40547a;
import com.ss.android.lark.invite_new_tenant.invite.single.mobile.entity.MobileCode;
import com.ss.android.lark.invite_new_tenant.rule.p2068a.C40624a;
import com.ss.android.lark.invite_new_tenant.service.IInviteNewTenantService;
import com.ss.android.lark.sdk.SdkSender;
import java.io.IOException;

/* renamed from: com.ss.android.lark.invite_new_tenant.c.a */
public class C40536a implements IInviteNewTenantService {

    /* renamed from: com.ss.android.lark.invite_new_tenant.c.a$a */
    private static class C40537a {

        /* renamed from: a */
        public static final C40536a f102944a = new C40536a();
    }

    /* renamed from: a */
    public static C40536a m160445a() {
        return C40537a.f102944a;
    }

    /* renamed from: a */
    private SetBusinessInvitationRequest.Type m160444a(IInviteNewTenantService.ContactType contactType) {
        if (contactType == IInviteNewTenantService.ContactType.EMAIL) {
            return SetBusinessInvitationRequest.Type.EMAIL;
        }
        return SetBusinessInvitationRequest.Type.MOBILE;
    }

    /* renamed from: b */
    public void mo146647b(IGetDataCallback<C40624a> iGetDataCallback) {
        SdkSender.asynSendRequestNonWrap(Command.GET_PROMOTION_RULE, new GetPromotionRuleRequest.C16264a(), iGetDataCallback, $$Lambda$a$yG8yd4BgTEUWf5WSsftfGlANQ1s.INSTANCE);
    }

    /* renamed from: c */
    public void mo146648c(IGetDataCallback<C40547a> iGetDataCallback) {
        SdkSender.asynSendRequestNonWrap(Command.GET_MY_PROMOTION_LINK, new GetMyPromotionLinkRequest.C16256a(), iGetDataCallback, $$Lambda$a$2T3pzPv83DvfXfll1dxeUQkMv4.INSTANCE);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ C40547a m160446a(byte[] bArr) throws IOException {
        C40547a aVar = new C40547a();
        aVar.f102964a = GetMyPromotionLinkResponse.ADAPTER.decode(bArr).url;
        return aVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ IInviteNewTenantService.C40631b m160448b(byte[] bArr) throws IOException {
        IInviteNewTenantService.C40631b bVar = new IInviteNewTenantService.C40631b();
        bVar.f103058a = SetBusinessInvitationResponse.ADAPTER.decode(bArr).success.booleanValue();
        return bVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static /* synthetic */ C40624a m160449c(byte[] bArr) throws IOException {
        C40624a aVar = new C40624a();
        aVar.mo146757a(GetPromotionRuleResponse.ADAPTER.decode(bArr).text);
        return aVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ MobileCode m160447a(GetMobileCodeResponse.MobileCode mobileCode) {
        MobileCode mobileCode2 = new MobileCode();
        mobileCode2.code = mobileCode.code;
        mobileCode2.name = mobileCode.name;
        mobileCode2.enName = mobileCode.en_name;
        mobileCode2.key = mobileCode.key.intValue();
        return mobileCode2;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static /* synthetic */ IInviteNewTenantService.C40630a m160450d(byte[] bArr) throws IOException {
        GetMobileCodeResponse decode = GetMobileCodeResponse.ADAPTER.decode(bArr);
        IInviteNewTenantService.C40630a aVar = new IInviteNewTenantService.C40630a();
        aVar.f103056a.addAll(C26249aa.m94984a(decode.mobile_codes, $$Lambda$a$mA_Zwx4VHTeXebNB5u8QEtFAxQA.INSTANCE));
        for (Integer num : decode.hot_keys) {
            if (aVar.f103056a.size() > num.intValue() && aVar.f103056a.get(num.intValue()) != null) {
                aVar.f103057b.add(aVar.f103056a.get(num.intValue()));
            }
        }
        return aVar;
    }

    /* renamed from: a */
    public void mo146645a(IGetDataCallback<IInviteNewTenantService.C40630a> iGetDataCallback) {
        SdkSender.asynSendRequestNonWrap(Command.GET_MOBILE_CODE, new GetMobileCodeRequest.C19409a(), iGetDataCallback, $$Lambda$a$LyZU6CMHUOIooTkvaEdvYYjId8.INSTANCE);
    }

    /* renamed from: a */
    public void mo146646a(IInviteNewTenantService.ContactType contactType, String str, IGetDataCallback<IInviteNewTenantService.C40631b> iGetDataCallback) {
        SetBusinessInvitationRequest.C16386a aVar = new SetBusinessInvitationRequest.C16386a();
        aVar.f42650a = m160444a(contactType);
        aVar.f42651b = str;
        SdkSender.asynSendRequestNonWrap(Command.SET_BUSINESS_INVITATION, aVar, iGetDataCallback, $$Lambda$a$Nr3vlscxlXMJmB1tPt3JcmoLacI.INSTANCE);
    }
}
