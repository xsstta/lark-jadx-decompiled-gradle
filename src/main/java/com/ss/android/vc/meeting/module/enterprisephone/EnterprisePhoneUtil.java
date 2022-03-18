package com.ss.android.vc.meeting.module.enterprisephone;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import com.larksuite.component.universe_design.dialog.UDDialogBuilder;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.export.entity.chatter.OpenChatter;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.util.share_preference.C57744a;
import com.ss.android.vc.common.lifecycle.VCAppLifeCycle;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60738ac;
import com.ss.android.vc.common.p3083e.C60773o;
import com.ss.android.vc.dependency.IVideoChatDependency;
import com.ss.android.vc.dependency.VideoChatModuleDependency;
import com.ss.android.vc.entity.response.C60974h;
import com.ss.android.vc.net.push.VideoChatPush;
import com.ss.android.vc.net.request.AbstractC63598b;
import com.ss.android.vc.net.request.C63602e;
import com.ss.android.vc.net.request.VcBizSender;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00042\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rJ \u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0004H\u0002J\b\u0010\u0014\u001a\u00020\u0004H\u0007J\"\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u000b\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0004H\u0002J(\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0004J\u0006\u0010\u0019\u001a\u00020\nJ\u0006\u0010\u001a\u001a\u00020\nJ\u0006\u0010\u001b\u001a\u00020\nJ\u0006\u0010\u001c\u001a\u00020\nJ\u001e\u0010\u001d\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0004J\u0006\u0010\u001e\u001a\u00020\nJ\u0006\u0010\u001f\u001a\u00020\nJ\u0006\u0010 \u001a\u00020\nJ \u0010!\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0004H\u0007J\u0018\u0010!\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0004H\u0007J\b\u0010\"\u001a\u00020\nH\u0007J\u0010\u0010#\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u0012\u0010$\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"Lcom/ss/android/vc/meeting/module/enterprisephone/EnterprisePhoneUtil;", "", "()V", "TAG", "", "TAG_PREFIX", "isRequesting", "", "phoneId", "createEnterprisePhoneByPhoneNumber", "", "phoneNumber", "callback", "Lcom/ss/android/vc/net/request/IVcGetDataCallback;", "Lcom/ss/android/vc/entity/response/CreateEnterprisePhoneEntity;", "createEnterprisePhoneByUserId", "chatter", "Lcom/ss/android/lark/chat/export/entity/chatter/OpenChatter;", "chatId", ShareHitPoint.f121868c, "getLastPhoneNumber", "onCreateEnterprisePhoneByPhoneNumberSuccess", "activity", "Landroid/app/Activity;", "onCreateEnterprisePhoneByUserIdSuccess", "onEnterprisePhoneAreaCodeLimitError", "onEnterprisePhoneCallSelfLimitError", "onEnterprisePhoneError", "onEnterprisePhoneInLandLimitError", "onEnterprisePhoneNoPermissionError", "onEnterprisePhoneNumberLimitError", "onEnterprisePhoneQuotaLimitError", "onEnterprisePhoneUserQuotaLimitError", "openCallingPage", "openDialPage", "openEnterprisePhoneDialPage", "saveLastPhoneNumber", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.meeting.module.enterprisephone.e */
public final class EnterprisePhoneUtil {

    /* renamed from: a */
    public static final EnterprisePhoneUtil f154649a = new EnterprisePhoneUtil();

    /* renamed from: b */
    private static String f154650b = "";

    /* renamed from: c */
    private static boolean f154651c;

    private EnterprisePhoneUtil() {
    }

    /* renamed from: a */
    public final void mo213542a(String str, AbstractC63598b<C60974h> bVar) {
        Intrinsics.checkParameterIsNotNull(str, "phoneNumber");
        if (f154651c) {
            C60700b.m235851b("EnterprisePhoneLog_EnterprisePhoneUtil", "[createEnterprisePhoneByPhoneNumber]", "isRequesting return");
            return;
        }
        f154651c = true;
        C60700b.m235851b("EnterprisePhoneLog_EnterprisePhoneUtil", "[createEnterprisePhoneByPhoneNumber2]", "send request");
        VcBizSender.m249158a(str).mo219889a(new C61649a(bVar, str));
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m240608a() {
        Activity c = VCAppLifeCycle.m236256c();
        EnterprisePhoneUtil eVar = f154649a;
        Intrinsics.checkExpressionValueIsNotNull(c, "activity");
        eVar.m240609a(c);
    }

    /* renamed from: h */
    public final void mo213548h() {
        C60700b.m235851b("EnterprisePhoneLog_EnterprisePhoneUtil", "[onEnterprisePhoneError]", "error toast");
        C60738ac.m236023a((int) R.string.View_VM_ErrorTryAgain);
    }

    @JvmStatic
    /* renamed from: b */
    public static final String m240615b() {
        StringBuilder sb = new StringBuilder();
        IVideoChatDependency dependency = VideoChatModuleDependency.getDependency();
        Intrinsics.checkExpressionValueIsNotNull(dependency, "VideoChatModuleDependency.getDependency()");
        sb.append(dependency.getUserId());
        sb.append(VideoChatModuleDependency.m236629b());
        int hashCode = sb.toString().hashCode();
        C57744a a = C57744a.m224104a();
        String string = a.getString("sp_key_enterprise_phone_last_phone_number" + hashCode, "");
        Intrinsics.checkExpressionValueIsNotNull(string, "GlobalSP.getInstance().g…ONE_NUMBER + uniqueId,\"\")");
        return string;
    }

    /* renamed from: c */
    public final void mo213543c() {
        C60700b.m235851b("EnterprisePhoneLog_EnterprisePhoneUtil", "[onEnterprisePhoneAreaCodeLimitError]", "area code should be added");
        Activity c = VCAppLifeCycle.m236256c();
        Intrinsics.checkExpressionValueIsNotNull(c, "VCAppLifeCycle.getTopActivity()");
        UDDialogBuilder eVar = new UDDialogBuilder(c);
        String a = C60773o.m236119a((int) R.string.View_MV_CallFail_PopUp);
        Intrinsics.checkExpressionValueIsNotNull(a, "VCCommonUtils.getString(…g.View_MV_CallFail_PopUp)");
        String a2 = C60773o.m236119a((int) R.string.View_MV_AddAreaCodeFixedLine_PopUp);
        Intrinsics.checkExpressionValueIsNotNull(a2, "VCCommonUtils.getString(…dAreaCodeFixedLine_PopUp)");
        String a3 = C60773o.m236119a((int) R.string.View_MV_GotIt_PhonePopUpButton);
        Intrinsics.checkExpressionValueIsNotNull(a3, "VCCommonUtils.getString(…V_GotIt_PhonePopUpButton)");
        ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) eVar.title(a)).message(a2)).addActionButton(R.id.ud_dialog_btn_primary, a3, (DialogInterface.OnClickListener) null)).show();
    }

    /* renamed from: d */
    public final void mo213544d() {
        C60700b.m235851b("EnterprisePhoneLog_EnterprisePhoneUtil", "[onEnterprisePhoneInLandLimitError]", "phone number should be inland");
        Activity c = VCAppLifeCycle.m236256c();
        Intrinsics.checkExpressionValueIsNotNull(c, "VCAppLifeCycle.getTopActivity()");
        UDDialogBuilder eVar = new UDDialogBuilder(c);
        String a = C60773o.m236119a((int) R.string.View_MV_CallFail_PopUp);
        Intrinsics.checkExpressionValueIsNotNull(a, "VCCommonUtils.getString(…g.View_MV_CallFail_PopUp)");
        String a2 = C60773o.m236119a((int) R.string.View_MV_SupportDialingChineseMainland_PopUp);
        Intrinsics.checkExpressionValueIsNotNull(a2, "VCCommonUtils.getString(…ingChineseMainland_PopUp)");
        String a3 = C60773o.m236119a((int) R.string.View_MV_GotIt_PhonePopUpButton);
        Intrinsics.checkExpressionValueIsNotNull(a3, "VCCommonUtils.getString(…V_GotIt_PhonePopUpButton)");
        ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) eVar.title(a)).message(a2)).addActionButton(R.id.ud_dialog_btn_primary, a3, (DialogInterface.OnClickListener) null)).show();
    }

    /* renamed from: e */
    public final void mo213545e() {
        C60700b.m235851b("EnterprisePhoneLog_EnterprisePhoneUtil", "[onEnterprisePhoneCallSelfLimitError]", "cannot call self");
        Activity c = VCAppLifeCycle.m236256c();
        Intrinsics.checkExpressionValueIsNotNull(c, "VCAppLifeCycle.getTopActivity()");
        UDDialogBuilder eVar = new UDDialogBuilder(c);
        String a = C60773o.m236119a((int) R.string.View_MV_CallFail_PopUp);
        Intrinsics.checkExpressionValueIsNotNull(a, "VCCommonUtils.getString(…g.View_MV_CallFail_PopUp)");
        String a2 = C60773o.m236119a((int) R.string.View_MV_UnableCallSelf_PopUp);
        Intrinsics.checkExpressionValueIsNotNull(a2, "VCCommonUtils.getString(…_MV_UnableCallSelf_PopUp)");
        String a3 = C60773o.m236119a((int) R.string.View_MV_GotIt_PhonePopUpButton);
        Intrinsics.checkExpressionValueIsNotNull(a3, "VCCommonUtils.getString(…V_GotIt_PhonePopUpButton)");
        ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) eVar.title(a)).message(a2)).addActionButton(R.id.ud_dialog_btn_primary, a3, (DialogInterface.OnClickListener) null)).show();
    }

    /* renamed from: f */
    public final void mo213546f() {
        C60700b.m235851b("EnterprisePhoneLog_EnterprisePhoneUtil", "[onEnterprisePhoneNumberLimitError]", "special phone number is not supported");
        Activity c = VCAppLifeCycle.m236256c();
        Intrinsics.checkExpressionValueIsNotNull(c, "VCAppLifeCycle.getTopActivity()");
        UDDialogBuilder eVar = new UDDialogBuilder(c);
        String a = C60773o.m236119a((int) R.string.View_MV_CallFail_PopUp);
        Intrinsics.checkExpressionValueIsNotNull(a, "VCCommonUtils.getString(…g.View_MV_CallFail_PopUp)");
        String a2 = C60773o.m236119a((int) R.string.View_MV_UnableCallThisNum_PopUp);
        Intrinsics.checkExpressionValueIsNotNull(a2, "VCCommonUtils.getString(…_UnableCallThisNum_PopUp)");
        String a3 = C60773o.m236119a((int) R.string.View_MV_TransferToPersonal_PhonePopUpButton);
        Intrinsics.checkExpressionValueIsNotNull(a3, "VCCommonUtils.getString(…ersonal_PhonePopUpButton)");
        String a4 = C60773o.m236119a((int) R.string.View_MV_GotIt_PhonePopUpButton);
        Intrinsics.checkExpressionValueIsNotNull(a4, "VCCommonUtils.getString(…V_GotIt_PhonePopUpButton)");
        ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) eVar.title(a)).message(a2)).addActionButton(R.id.ud_dialog_btn_primary, a3, DialogInterface$OnClickListenerC61651c.f154656a)).addActionButton(R.id.ud_dialog_btn_secondary, a4, (DialogInterface.OnClickListener) null)).show();
    }

    /* renamed from: g */
    public final void mo213547g() {
        C60700b.m235851b("EnterprisePhoneLog_EnterprisePhoneUtil", "[onEnterprisePhoneUserQuotaLimitError]", "time reach limit");
        Activity c = VCAppLifeCycle.m236256c();
        Intrinsics.checkExpressionValueIsNotNull(c, "VCAppLifeCycle.getTopActivity()");
        UDDialogBuilder eVar = new UDDialogBuilder(c);
        String a = C60773o.m236119a((int) R.string.View_MV_InsufficientBalance_OfficePhonePopUp);
        Intrinsics.checkExpressionValueIsNotNull(a, "VCCommonUtils.getString(…Balance_OfficePhonePopUp)");
        String a2 = C60773o.m236119a((int) R.string.View_MV_InsufficientBalanceContact_OfficePhonePopUp);
        Intrinsics.checkExpressionValueIsNotNull(a2, "VCCommonUtils.getString(…Contact_OfficePhonePopUp)");
        String a3 = C60773o.m236119a((int) R.string.View_MV_GotIt_PhonePopUpButton);
        Intrinsics.checkExpressionValueIsNotNull(a3, "VCCommonUtils.getString(…V_GotIt_PhonePopUpButton)");
        ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) eVar.title(a)).message(a2)).addActionButton(R.id.ud_dialog_btn_primary, a3, (DialogInterface.OnClickListener) null)).show();
    }

    /* renamed from: a */
    private final void m240609a(Activity activity) {
        C60700b.m235851b("EnterprisePhoneLog_EnterprisePhoneUtil", "[openEnterprisePhoneDialPage]", "show dial page");
        Intent intent = new Intent(activity, EnterprisePhoneActivity.class);
        intent.putExtra("fragment_type_key", "fragment_type_dial");
        activity.startActivity(intent);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/vc/meeting/module/enterprisephone/EnterprisePhoneUtil$createEnterprisePhoneByUserId$1", "Lcom/ss/android/vc/net/request/IVcGetDataCallback;", "Lcom/ss/android/vc/entity/response/CreateEnterprisePhoneEntity;", "onError", "", "err", "Lcom/ss/android/vc/net/request/VcErrorResult;", "onSuccess", "response", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.enterprisephone.e$b */
    public static final class C61650b implements AbstractC63598b<C60974h> {

        /* renamed from: a */
        final /* synthetic */ OpenChatter f154654a;

        /* renamed from: b */
        final /* synthetic */ String f154655b;

        /* renamed from: a */
        public void onSuccess(C60974h hVar) {
            if (hVar != null) {
                EnterprisePhoneUtil eVar = EnterprisePhoneUtil.f154649a;
                EnterprisePhoneUtil.f154651c = false;
                EnterprisePhoneUtil eVar2 = EnterprisePhoneUtil.f154649a;
                EnterprisePhoneUtil.f154650b = hVar.f152690a;
                C60700b.m235851b("EnterprisePhoneLog_EnterprisePhoneUtil", "[createEnterprisePhoneByUserId3]", "onSuccess:" + hVar);
                EnterprisePhoneUtil eVar3 = EnterprisePhoneUtil.f154649a;
                Activity c = VCAppLifeCycle.m236256c();
                Intrinsics.checkExpressionValueIsNotNull(c, "VCAppLifeCycle.getTopActivity()");
                OpenChatter openChatter = this.f154654a;
                String str = this.f154655b;
                EnterprisePhoneUtil eVar4 = EnterprisePhoneUtil.f154649a;
                eVar3.mo213540a(c, openChatter, str, EnterprisePhoneUtil.f154650b);
            }
        }

        @Override // com.ss.android.vc.net.request.AbstractC63598b
        public void onError(C63602e eVar) {
            Intrinsics.checkParameterIsNotNull(eVar, "err");
            EnterprisePhoneUtil eVar2 = EnterprisePhoneUtil.f154649a;
            EnterprisePhoneUtil.f154651c = false;
            C60700b.m235864f("EnterprisePhoneLog_EnterprisePhoneUtil", "[createEnterprisePhoneByUserId4]", "onError:" + eVar);
            switch (eVar.mo219899a()) {
                case 235000:
                    EnterprisePhoneUtil eVar3 = EnterprisePhoneUtil.f154649a;
                    Activity c = VCAppLifeCycle.m236256c();
                    Intrinsics.checkExpressionValueIsNotNull(c, "VCAppLifeCycle.getTopActivity()");
                    eVar3.mo213539a(c, this.f154654a, this.f154655b);
                    return;
                case 235001:
                    return;
                case 235002:
                    EnterprisePhoneUtil.f154649a.mo213546f();
                    return;
                case 235003:
                    EnterprisePhoneUtil.f154649a.mo213545e();
                    return;
                case 235004:
                    EnterprisePhoneUtil.f154649a.mo213544d();
                    return;
                case 235005:
                    EnterprisePhoneUtil.f154649a.mo213547g();
                    return;
                case 235006:
                    EnterprisePhoneUtil.f154649a.mo213543c();
                    return;
                default:
                    EnterprisePhoneUtil.f154649a.mo213548h();
                    return;
            }
        }

        C61650b(OpenChatter openChatter, String str) {
            this.f154654a = openChatter;
            this.f154655b = str;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/vc/meeting/module/enterprisephone/EnterprisePhoneUtil$createEnterprisePhoneByPhoneNumber$1", "Lcom/ss/android/vc/net/request/IVcGetDataCallback;", "Lcom/ss/android/vc/entity/response/CreateEnterprisePhoneEntity;", "onError", "", "err", "Lcom/ss/android/vc/net/request/VcErrorResult;", "onSuccess", "response", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.enterprisephone.e$a */
    public static final class C61649a implements AbstractC63598b<C60974h> {

        /* renamed from: a */
        final /* synthetic */ AbstractC63598b f154652a;

        /* renamed from: b */
        final /* synthetic */ String f154653b;

        /* renamed from: a */
        public void onSuccess(C60974h hVar) {
            if (hVar != null) {
                EnterprisePhoneUtil eVar = EnterprisePhoneUtil.f154649a;
                EnterprisePhoneUtil.f154651c = false;
                EnterprisePhoneUtil eVar2 = EnterprisePhoneUtil.f154649a;
                EnterprisePhoneUtil.f154650b = hVar.f152690a;
                C60700b.m235851b("EnterprisePhoneLog_EnterprisePhoneUtil", "[createEnterprisePhoneByPhoneNumber3]", "onSuccess:" + hVar);
                AbstractC63598b bVar = this.f154652a;
                if (bVar != null) {
                    bVar.onSuccess(hVar);
                }
                EnterprisePhoneUtil eVar3 = EnterprisePhoneUtil.f154649a;
                Activity c = VCAppLifeCycle.m236256c();
                Intrinsics.checkExpressionValueIsNotNull(c, "VCAppLifeCycle.getTopActivity()");
                String str = this.f154653b;
                EnterprisePhoneUtil eVar4 = EnterprisePhoneUtil.f154649a;
                eVar3.mo213541a(c, str, EnterprisePhoneUtil.f154650b);
            }
        }

        @Override // com.ss.android.vc.net.request.AbstractC63598b
        public void onError(C63602e eVar) {
            Intrinsics.checkParameterIsNotNull(eVar, "err");
            EnterprisePhoneUtil eVar2 = EnterprisePhoneUtil.f154649a;
            EnterprisePhoneUtil.f154651c = false;
            C60700b.m235864f("EnterprisePhoneLog_EnterprisePhoneUtil", "[createEnterprisePhoneByPhoneNumber4]", "onError:" + eVar);
            AbstractC63598b bVar = this.f154652a;
            if (bVar != null) {
                bVar.onError(eVar);
            }
            switch (eVar.mo219899a()) {
                case 235000:
                case 235001:
                    return;
                case 235002:
                    EnterprisePhoneUtil.f154649a.mo213546f();
                    return;
                case 235003:
                    EnterprisePhoneUtil.f154649a.mo213545e();
                    return;
                case 235004:
                    EnterprisePhoneUtil.f154649a.mo213544d();
                    return;
                case 235005:
                    EnterprisePhoneUtil.f154649a.mo213547g();
                    return;
                case 235006:
                    EnterprisePhoneUtil.f154649a.mo213543c();
                    return;
                default:
                    EnterprisePhoneUtil.f154649a.mo213548h();
                    return;
            }
        }

        C61649a(AbstractC63598b bVar, String str) {
            this.f154652a = bVar;
            this.f154653b = str;
        }
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m240613a(String str) {
        StringBuilder sb = new StringBuilder();
        IVideoChatDependency dependency = VideoChatModuleDependency.getDependency();
        Intrinsics.checkExpressionValueIsNotNull(dependency, "VideoChatModuleDependency.getDependency()");
        sb.append(dependency.getUserId());
        sb.append(VideoChatModuleDependency.m236629b());
        int hashCode = sb.toString().hashCode();
        if (str != null) {
            C57744a a = C57744a.m224104a();
            a.putString("sp_key_enterprise_phone_last_phone_number" + hashCode, str);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.enterprisephone.e$c */
    public static final class DialogInterface$OnClickListenerC61651c implements DialogInterface.OnClickListener {

        /* renamed from: a */
        public static final DialogInterface$OnClickListenerC61651c f154656a = new DialogInterface$OnClickListenerC61651c();

        DialogInterface$OnClickListenerC61651c() {
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            Activity c = VCAppLifeCycle.m236256c();
            Intent intent = new Intent("android.intent.action.DIAL");
            intent.setData(Uri.parse("tel:" + EnterprisePhoneUtil.m240615b()));
            c.startActivity(intent);
        }
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m240614a(String str, String str2) {
        Intrinsics.checkParameterIsNotNull(str, "phoneNumber");
        Intrinsics.checkParameterIsNotNull(str2, ShareHitPoint.f121868c);
        VideoChatPush.m249004a().mo219733b();
        f154649a.mo213542a(str, (AbstractC63598b<C60974h>) null);
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m240610a(OpenChatter openChatter, String str, String str2) {
        Intrinsics.checkParameterIsNotNull(openChatter, "chatter");
        Intrinsics.checkParameterIsNotNull(str, "chatId");
        Intrinsics.checkParameterIsNotNull(str2, ShareHitPoint.f121868c);
        VideoChatPush.m249004a().mo219733b();
        f154649a.m240616b(openChatter, str, str2);
    }

    /* renamed from: b */
    private final void m240616b(OpenChatter openChatter, String str, String str2) {
        if (f154651c) {
            C60700b.m235851b("EnterprisePhoneLog_EnterprisePhoneUtil", "[createEnterprisePhoneByUserId]", "isRequesting return");
            return;
        }
        f154651c = true;
        C60700b.m235851b("EnterprisePhoneLog_EnterprisePhoneUtil", "[createEnterprisePhoneByUserId2]", "send request, source:" + str2);
        VcBizSender.m249178a(openChatter.getId(), str).mo219889a(new C61650b(openChatter, str));
    }

    /* renamed from: a */
    public final void mo213539a(Activity activity, OpenChatter openChatter, String str) {
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        Intrinsics.checkParameterIsNotNull(openChatter, "chatter");
        Intrinsics.checkParameterIsNotNull(str, "chatId");
        C60700b.m235851b("EnterprisePhoneLog_EnterprisePhoneUtil", "[onEnterprisePhoneNoPermissionError]", "no permission");
        Intent intent = new Intent(activity, EnterprisePhoneActivity.class);
        intent.putExtra("fragment_type_key", "fragment_type_limit");
        intent.putExtra("open_chatter", openChatter);
        intent.putExtra("chat_id", str);
        activity.startActivity(intent);
    }

    /* renamed from: a */
    public final void mo213541a(Activity activity, String str, String str2) {
        if (activity instanceof EnterprisePhoneActivity) {
            C60700b.m235851b("EnterprisePhoneLog_EnterprisePhoneUtil", "[onCreateEnterprisePhoneByPhoneNumberSuccess1]", "show dial calling page");
            Intent intent = new Intent(activity, EnterprisePhoneActivity.class);
            intent.putExtra("fragment_type_key", "fragment_type_dial_calling");
            intent.putExtra("phone_number", str);
            intent.putExtra("phone_id", str2);
            ((EnterprisePhoneActivity) activity).mo213477a(intent);
            return;
        }
        C60700b.m235851b("EnterprisePhoneLog_EnterprisePhoneUtil", "[onCreateEnterprisePhoneByPhoneNumberSuccess2]", "show phone calling page");
        Intent intent2 = new Intent(activity, EnterprisePhoneActivity.class);
        intent2.putExtra("fragment_type_key", "fragment_type_phone_calling");
        intent2.putExtra("phone_number", str);
        intent2.putExtra("phone_id", str2);
        activity.startActivity(intent2);
    }

    /* renamed from: a */
    public final void mo213540a(Activity activity, OpenChatter openChatter, String str, String str2) {
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        Intrinsics.checkParameterIsNotNull(openChatter, "chatter");
        Intrinsics.checkParameterIsNotNull(str, "chatId");
        C60700b.m235851b("EnterprisePhoneLog_EnterprisePhoneUtil", "[onCreateEnterprisePhoneByUserIdSuccess]", "show success page");
        Intent intent = new Intent(activity, EnterprisePhoneActivity.class);
        intent.putExtra("fragment_type_key", "fragment_type_normal_calling");
        intent.putExtra("open_chatter", openChatter);
        intent.putExtra("chat_id", str);
        intent.putExtra("phone_id", str2);
        activity.startActivity(intent);
    }
}
