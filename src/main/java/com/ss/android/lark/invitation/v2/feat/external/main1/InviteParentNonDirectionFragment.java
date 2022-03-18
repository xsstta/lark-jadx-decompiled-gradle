package com.ss.android.lark.invitation.v2.feat.external.main1;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.lark.pb.contact.v1.InvitationSource;
import com.larksuite.suite.R;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.inv.export.ui.C40098a;
import com.ss.android.lark.invitation.v2.feat.edu.nonDirectional.InviteParentNonDirectionPresenter;
import com.ss.android.lark.invitation.v2.feat.edu.nonDirectional.InviteParentNonDirectionView;
import com.ss.android.lark.log.Log;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0005¢\u0006\u0002\u0010\u0002J&\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\u001a\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\n2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/ss/android/lark/invitation/v2/feat/external/main1/InviteParentNonDirectionFragment;", "Lcom/ss/android/lark/inv/export/ui/InvBaseFragment;", "()V", "from", "", "getFrom", "()Ljava/lang/String;", "setFrom", "(Ljava/lang/String;)V", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "", "view", "Companion", "core_invitation_v2_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.invitation.v2.feat.external.b.a */
public final class InviteParentNonDirectionFragment extends C40098a {

    /* renamed from: a */
    public static final Companion f102186a = new Companion(null);

    /* renamed from: b */
    private HashMap f102187b;

    /* renamed from: a */
    public View mo145903a(int i) {
        if (this.f102187b == null) {
            this.f102187b = new HashMap();
        }
        View view = (View) this.f102187b.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f102187b.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: a */
    public void mo145904a() {
        HashMap hashMap = this.f102187b;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.base.fragment.BaseFragment, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo145904a();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/invitation/v2/feat/external/main1/InviteParentNonDirectionFragment$Companion;", "", "()V", "TAG", "", "newInstance", "Lcom/ss/android/lark/invitation/v2/feat/external/main1/InviteParentNonDirectionFragment;", "args", "Landroid/os/Bundle;", "core_invitation_v2_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.invitation.v2.feat.external.b.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final InviteParentNonDirectionFragment mo145905a(Bundle bundle) {
            InviteParentNonDirectionFragment aVar = new InviteParentNonDirectionFragment();
            aVar.setArguments(bundle);
            return aVar;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        String str;
        String str2;
        String str3;
        String str4;
        String string;
        String string2;
        String string3;
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        if (arguments == null || (str = arguments.getString(ShareHitPoint.f121869d)) == null) {
            str = "qr_code";
        }
        Intrinsics.checkExpressionValueIsNotNull(str, "arguments?.getString(Inv…onPage.Param.Type.QR_CODE");
        Bundle arguments2 = getArguments();
        if (arguments2 == null || (string3 = arguments2.getString("from_scenes")) == null) {
            str2 = "edu_contact";
        } else {
            str2 = string3;
        }
        Intrinsics.checkExpressionValueIsNotNull(str2, "arguments?.getString(Inv…ENES) ?: From.EDU_CONTACT");
        Bundle arguments3 = getArguments();
        if (arguments3 == null || (string2 = arguments3.getString("departments")) == null) {
            str3 = "";
        } else {
            str3 = string2;
        }
        Intrinsics.checkExpressionValueIsNotNull(str3, "arguments?.getString(InvRouter.DEPARTMENTS) ?: \"\"");
        Bundle arguments4 = getArguments();
        if (arguments4 == null || (string = arguments4.getString("chat_id")) == null) {
            str4 = "";
        } else {
            str4 = string;
        }
        Intrinsics.checkExpressionValueIsNotNull(str4, "arguments?.getString(Inv…Page.Param.CHAT_ID) ?: \"\"");
        Intrinsics.areEqual(str2, "edu_contact");
        InvitationSource invitationSource = InvitationSource.HOME_SCHOOL_CONTACT;
        Log.m165389i("InvitationModule", "onCreate InviteMemberShareActivity from: " + str2 + ", type: " + str + ", departments: " + str3 + ", chatId: " + str4 + ", source: " + invitationSource);
        new InviteParentNonDirectionView(this).mo145594a(new InviteParentNonDirectionPresenter(str2, str, str3, str4, invitationSource));
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        return LayoutInflater.from(getContext()).inflate(R.layout.inv_invite_parent_nondirection_view, viewGroup, false);
    }
}
