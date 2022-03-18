package com.ss.android.lark.invitation.v2.feat.member.guide;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.larksuite.suite.R;
import com.ss.android.lark.inv.export.ui.C40098a;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 -2\u00020\u0001:\u0001-B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J&\u0010$\u001a\u0004\u0018\u00010%2\u0006\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010)2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\b\u0010*\u001a\u00020!H\u0016J\u001a\u0010+\u001a\u00020!2\u0006\u0010,\u001a\u00020%2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u0015X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\u00020\u001bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f¨\u0006."}, d2 = {"Lcom/ss/android/lark/invitation/v2/feat/member/guide/InviteMemberGuideFragment;", "Lcom/ss/android/lark/inv/export/ui/InvBaseFragment;", "()V", "from", "", "getFrom", "()Ljava/lang/String;", "setFrom", "(Ljava/lang/String;)V", "invitationMethod", "Lcom/ss/android/lark/invitation/v2/feat/member/guide/InviteMemberGuideFragment$Companion$InvitationMethod;", "getInvitationMethod", "()Lcom/ss/android/lark/invitation/v2/feat/member/guide/InviteMemberGuideFragment$Companion$InvitationMethod;", "setInvitationMethod", "(Lcom/ss/android/lark/invitation/v2/feat/member/guide/InviteMemberGuideFragment$Companion$InvitationMethod;)V", "isAccessExperiment", "", "()Z", "setAccessExperiment", "(Z)V", "presenter", "Lcom/ss/android/lark/invitation/v2/feat/member/guide/InviteMemberGuidePresenter;", "getPresenter", "()Lcom/ss/android/lark/invitation/v2/feat/member/guide/InviteMemberGuidePresenter;", "setPresenter", "(Lcom/ss/android/lark/invitation/v2/feat/member/guide/InviteMemberGuidePresenter;)V", "versionId", "", "getVersionId", "()I", "setVersionId", "(I)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onResume", "onViewCreated", "view", "Companion", "core_invitation_v2_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class InviteMemberGuideFragment extends C40098a {

    /* renamed from: c */
    public static final Companion f102547c = new Companion(null);

    /* renamed from: a */
    public String f102548a;

    /* renamed from: b */
    public InviteMemberGuidePresenter f102549b;

    /* renamed from: d */
    private boolean f102550d;

    /* renamed from: e */
    private Companion.InvitationMethod f102551e = Companion.InvitationMethod.UNKNOWN;

    /* renamed from: f */
    private int f102552f;

    /* renamed from: g */
    private HashMap f102553g;

    /* renamed from: a */
    public View mo146291a(int i) {
        if (this.f102553g == null) {
            this.f102553g = new HashMap();
        }
        View view = (View) this.f102553g.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f102553g.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: d */
    public void mo146295d() {
        HashMap hashMap = this.f102553g;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.base.fragment.BaseFragment, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo146295d();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0007B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/invitation/v2/feat/member/guide/InviteMemberGuideFragment$Companion;", "", "()V", "newInstance", "Lcom/ss/android/lark/invitation/v2/feat/member/guide/InviteMemberGuideFragment;", "args", "Landroid/os/Bundle;", "InvitationMethod", "core_invitation_v2_release"}, mo238835k = 1, mv = {1, 1, 16})
    public static final class Companion {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0001\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/invitation/v2/feat/member/guide/InviteMemberGuideFragment$Companion$InvitationMethod;", "", "methodId", "", "(Ljava/lang/String;II)V", "getMethodId", "()I", GrsBaseInfo.CountryCodeSource.UNKNOWN, "SKIP", "LINK", "QR_CODE", "Companion", "core_invitation_v2_release"}, mo238835k = 1, mv = {1, 1, 16})
        public enum InvitationMethod {
            UNKNOWN(0),
            SKIP(1),
            LINK(2),
            QR_CODE(3);
            
            public static final Companion Companion = new Companion(null);
            private final int methodId;

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/invitation/v2/feat/member/guide/InviteMemberGuideFragment$Companion$InvitationMethod$Companion;", "", "()V", "valueOf", "Lcom/ss/android/lark/invitation/v2/feat/member/guide/InviteMemberGuideFragment$Companion$InvitationMethod;", "methodId", "", "core_invitation_v2_release"}, mo238835k = 1, mv = {1, 1, 16})
            /* renamed from: com.ss.android.lark.invitation.v2.feat.member.guide.InviteMemberGuideFragment$Companion$InvitationMethod$a  reason: collision with other inner class name */
            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                /* renamed from: a */
                public final InvitationMethod mo146298a(int i) {
                    InvitationMethod invitationMethod;
                    boolean z;
                    InvitationMethod[] values = InvitationMethod.values();
                    int length = values.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length) {
                            invitationMethod = null;
                            break;
                        }
                        invitationMethod = values[i2];
                        if (invitationMethod.getMethodId() == i) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z) {
                            break;
                        }
                        i2++;
                    }
                    if (invitationMethod != null) {
                        return invitationMethod;
                    }
                    return InvitationMethod.UNKNOWN;
                }
            }

            public final int getMethodId() {
                return this.methodId;
            }

            private InvitationMethod(int i) {
                this.methodId = i;
            }
        }

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final InviteMemberGuideFragment mo146296a(Bundle bundle) {
            InviteMemberGuideFragment inviteMemberGuideFragment = new InviteMemberGuideFragment();
            inviteMemberGuideFragment.setArguments(bundle);
            return inviteMemberGuideFragment;
        }
    }

    /* renamed from: b */
    public final boolean mo146293b() {
        return this.f102550d;
    }

    /* renamed from: c */
    public final Companion.InvitationMethod mo146294c() {
        return this.f102551e;
    }

    /* renamed from: a */
    public final String mo146292a() {
        String str = this.f102548a;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("from");
        }
        return str;
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        InviteMemberGuidePresenter aVar = this.f102549b;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("presenter");
        }
        aVar.mo146327g();
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.base.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        String str;
        boolean z;
        int i;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments == null || (str = arguments.getString("from_scenes")) == null) {
            str = "unknown";
        }
        this.f102548a = str;
        Bundle arguments2 = getArguments();
        int i2 = 0;
        if (arguments2 != null) {
            z = arguments2.getBoolean("is_access_experiment");
        } else {
            z = false;
        }
        this.f102550d = z;
        Companion.InvitationMethod.Companion aVar = Companion.InvitationMethod.Companion;
        Bundle arguments3 = getArguments();
        if (arguments3 != null) {
            i = arguments3.getInt("invitation_method");
        } else {
            i = 0;
        }
        this.f102551e = aVar.mo146298a(i);
        Bundle arguments4 = getArguments();
        if (arguments4 != null) {
            i2 = arguments4.getInt("version_id");
        }
        this.f102552f = i2;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.onViewCreated(view, bundle);
        this.f102549b = new InviteMemberGuidePresenter();
        InviteMemberGuideView inviteMemberGuideView = new InviteMemberGuideView(this);
        InviteMemberGuidePresenter aVar = this.f102549b;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("presenter");
        }
        inviteMemberGuideView.mo145594a(aVar);
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.inv_invite_member_guide_view, viewGroup, false);
    }
}
