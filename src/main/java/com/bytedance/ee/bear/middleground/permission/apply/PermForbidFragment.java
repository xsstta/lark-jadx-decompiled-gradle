package com.bytedance.ee.bear.middleground.permission.apply;

import android.content.Context;
import android.os.Bundle;
import android.text.Html;
import android.text.Spanned;
import android.text.SpannedString;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.bytedance.ee.bear.basesdk.C4484g;
import com.bytedance.ee.bear.contract.AccountService;
import com.bytedance.ee.bear.contract.an;
import com.bytedance.ee.bear.facade.common.C7667e;
import com.bytedance.ee.bear.middleground.permission.PermissionAnalyticV2;
import com.bytedance.ee.bear.p522q.C10539a;
import com.bytedance.ee.bear.widgets.BaseTitleBar;
import com.bytedance.ee.bear.widgets.universedesign.SpaceEmptyState;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p705h.C13666a;
import com.larksuite.suite.R;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.koin.java.KoinJavaComponent;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 !2\u00020\u0001:\u0001!B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0002J\u0012\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J&\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\u001a\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u001f\u001a\u00020\u00192\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\b\u0010 \u001a\u00020\u0015H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/apply/PermForbidFragment;", "Lcom/bytedance/ee/bear/facade/common/BaseFragment;", "()V", "fromVc", "", "isBackVisible", "isShowMasterTips", "isShowSlaveTips", "isWiki", "masterTipsId", "", "module", "", "publicPerm", "subType", "token", ShareHitPoint.f121869d, "userPerm", "getOwnerText", "Landroid/text/Spanned;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onViewCreated", "view", "parseArgs", "Companion", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.middleground.permission.apply.f */
public final class PermForbidFragment extends C7667e {

    /* renamed from: i */
    public static final Companion f25710i = new Companion(null);

    /* renamed from: a */
    public String f25711a = "";

    /* renamed from: b */
    public int f25712b;

    /* renamed from: c */
    public String f25713c = "";

    /* renamed from: d */
    public boolean f25714d;

    /* renamed from: e */
    public boolean f25715e;

    /* renamed from: f */
    public String f25716f = "";

    /* renamed from: g */
    public String f25717g = "";

    /* renamed from: h */
    public String f25718h = "";

    /* renamed from: j */
    private boolean f25719j = true;

    /* renamed from: k */
    private int f25720k = -1;

    /* renamed from: l */
    private boolean f25721l = true;

    /* renamed from: m */
    private boolean f25722m = true;

    /* renamed from: n */
    private HashMap f25723n;

    @JvmStatic
    /* renamed from: a */
    public static final void m39525a(FragmentManager fragmentManager, int i, boolean z, int i2, boolean z2, boolean z3, String str, int i3, String str2, boolean z4, boolean z5, String str3, String str4, String str5) {
        f25710i.mo36634a(fragmentManager, i, z, i2, z2, z3, str, i3, str2, z4, z5, str3, str4, str5);
    }

    /* renamed from: a */
    public View mo36632a(int i) {
        if (this.f25723n == null) {
            this.f25723n = new HashMap();
        }
        View view = (View) this.f25723n.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f25723n.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: a */
    public void mo36633a() {
        HashMap hashMap = this.f25723n;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo36633a();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0013H\u0002J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0007J|\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u00132\u0006\u0010 \u001a\u00020\u001e2\u0006\u0010!\u001a\u00020\u001e2\u0006\u0010\"\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\u00132\b\u0010$\u001a\u0004\u0018\u00010\u00042\u0006\u0010%\u001a\u00020\u001e2\u0006\u0010&\u001a\u00020\u001e2\u0006\u0010'\u001a\u00020\u00042\u0006\u0010(\u001a\u00020\u00042\b\u0010)\u001a\u0004\u0018\u00010\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006*"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/apply/PermForbidFragment$Companion;", "", "()V", "EXTRA_FROM_VC", "", "EXTRA_IS_BACK_VISIBLE", "EXTRA_IS_SHOW_MASTER_TIPS", "EXTRA_IS_SHOW_SLAVE_TIPS", "EXTRA_IS_WIKI", "EXTRA_MASTER_TIPS", "EXTRA_MODULE", "EXTRA_PUBLIC_PERM", "EXTRA_SUB_TYPE", "EXTRA_TOKEN", "EXTRA_TYPE", "EXTRA_USER_PERM", "PARAMS", "TAG", "checkContainerId", "", "containerId", "newInstance", "Lcom/bytedance/ee/bear/middleground/permission/apply/PermForbidFragment;", "params", "Lcom/bytedance/ee/bear/middleground/permission/apply/NoPermission;", "showPermForbidFragment", "", "fm", "Landroidx/fragment/app/FragmentManager;", "showMasterTips", "", "masterTipsId", "showSlaveTips", "backVisible", "token", ShareHitPoint.f121869d, "subType", "fromVc", "isWiki", "module", "userPerm", "publicPerm", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.apply.f$a */
    public static final class Companion {
        /* renamed from: a */
        private final int m39530a(int i) {
            if (i != -1) {
                return i;
            }
            return 16908290;
        }

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final void mo36634a(FragmentManager fragmentManager, int i, boolean z, int i2, boolean z2, boolean z3, String str, int i3, String str2, boolean z4, boolean z5, String str3, String str4, String str5) {
            String str6;
            Intrinsics.checkParameterIsNotNull(fragmentManager, "fm");
            Intrinsics.checkParameterIsNotNull(str, "token");
            Intrinsics.checkParameterIsNotNull(str3, "module");
            Intrinsics.checkParameterIsNotNull(str4, "userPerm");
            PermForbidFragment fVar = new PermForbidFragment();
            Bundle bundle = new Bundle();
            bundle.putBoolean("extra_is_show_master_tips", z);
            bundle.putInt("extra_master_tips", i2);
            bundle.putBoolean("extra_is_show_slave_tips", z2);
            bundle.putBoolean("extra_is_back_visible", z3);
            bundle.putString("extra_token", str);
            bundle.putInt("extra_type", i3);
            String str7 = "";
            if (str2 != null) {
                str6 = str2;
            } else {
                str6 = str7;
            }
            bundle.putString("extra_sub_type", str6);
            bundle.putBoolean("extra_from_vc", z4);
            bundle.putBoolean("extra_is_wiki", z5);
            bundle.putString("extra_module", str3);
            bundle.putString("extra_user_perm", str4);
            if (str5 != null) {
                str7 = str5;
            }
            bundle.putString("extra_public_perm", str7);
            fVar.setArguments(bundle);
            fragmentManager.beginTransaction().replace(m39530a(i), fVar).commitAllowingStateLoss();
        }
    }

    /* renamed from: c */
    private final Spanned m39527c() {
        String str;
        String c = C4484g.m18494b().mo17252c();
        AccountService.Account f = ((an) KoinJavaComponent.m268613a(an.class, null, null, 6, null)).mo16408f();
        if (f == null) {
            return new SpannedString("");
        }
        String a = C13666a.m55443a(c, f.f14585b, f.f14596m);
        if (f.mo19681c()) {
            str = getString(R.string.Doc_Permission_PersonalAccount);
        } else {
            str = f.f14593j;
        }
        Context context = getContext();
        Spanned fromHtml = Html.fromHtml(C10539a.m43639a(context, R.string.Doc_Permission_CurrentUserCannotAccess, "user", C9561c.m39496a(a + " (" + str + ')')));
        Intrinsics.checkExpressionValueIsNotNull(fromHtml, "Html.fromHtml(UIHelper.m…rName ($userIdentity)\")))");
        return fromHtml;
    }

    /* renamed from: b */
    private final void m39526b() {
        boolean z;
        boolean z2;
        String str;
        int i;
        String str2;
        boolean z3;
        String str3;
        String str4;
        String string;
        Bundle arguments = getArguments();
        boolean z4 = true;
        if (arguments != null) {
            z = arguments.getBoolean("extra_is_show_master_tips", true);
        } else {
            z = true;
        }
        this.f25719j = z;
        Bundle arguments2 = getArguments();
        int i2 = -1;
        if (arguments2 != null) {
            i2 = arguments2.getInt("extra_master_tips", -1);
        }
        this.f25720k = i2;
        Bundle arguments3 = getArguments();
        if (arguments3 != null) {
            z2 = arguments3.getBoolean("extra_is_show_slave_tips", true);
        } else {
            z2 = true;
        }
        this.f25721l = z2;
        Bundle arguments4 = getArguments();
        if (arguments4 != null) {
            z4 = arguments4.getBoolean("extra_is_back_visible", true);
        }
        this.f25722m = z4;
        Bundle arguments5 = getArguments();
        String str5 = "";
        if (arguments5 == null || (str = arguments5.getString("extra_token", str5)) == null) {
            str = str5;
        }
        this.f25711a = str;
        Bundle arguments6 = getArguments();
        boolean z5 = false;
        if (arguments6 != null) {
            i = arguments6.getInt("extra_type", 0);
        } else {
            i = 0;
        }
        this.f25712b = i;
        Bundle arguments7 = getArguments();
        if (arguments7 == null || (str2 = arguments7.getString("extra_sub_type", str5)) == null) {
            str2 = str5;
        }
        this.f25713c = str2;
        Bundle arguments8 = getArguments();
        if (arguments8 != null) {
            z3 = arguments8.getBoolean("extra_from_vc", false);
        } else {
            z3 = false;
        }
        this.f25714d = z3;
        Bundle arguments9 = getArguments();
        if (arguments9 != null) {
            z5 = arguments9.getBoolean("extra_is_wiki", false);
        }
        this.f25715e = z5;
        Bundle arguments10 = getArguments();
        if (arguments10 == null || (str3 = arguments10.getString("extra_module", str5)) == null) {
            str3 = str5;
        }
        this.f25716f = str3;
        Bundle arguments11 = getArguments();
        if (arguments11 == null || (str4 = arguments11.getString("extra_user_perm")) == null) {
            str4 = str5;
        }
        this.f25717g = str4;
        Bundle arguments12 = getArguments();
        if (!(arguments12 == null || (string = arguments12.getString("extra_public_perm", str5)) == null)) {
            str5 = string;
        }
        this.f25718h = str5;
        C13479a.m54764b("PermApplyFragment", "isShowMasterTips: " + this.f25719j + ", " + "isShowSlaveTips: " + this.f25721l + ", " + "isBackVisible: " + this.f25722m);
    }

    @Override // com.bytedance.ee.bear.facade.common.C7718l, androidx.fragment.app.Fragment, com.bytedance.ee.bear.facade.common.C7667e
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m39526b();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.apply.f$b */
    static final class View$OnClickListenerC9573b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ PermForbidFragment f25724a;

        View$OnClickListenerC9573b(PermForbidFragment fVar) {
            this.f25724a = fVar;
        }

        public final void onClick(View view) {
            FragmentActivity activity = this.f25724a.getActivity();
            if (activity != null) {
                activity.onBackPressed();
            }
            PermissionAnalyticV2.m39667d(this.f25724a.f25711a, this.f25724a.f25712b, this.f25724a.f25713c, this.f25724a.f25714d, this.f25724a.f25715e, this.f25724a.f25716f, this.f25724a.f25717g, this.f25724a.f25718h);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.onViewCreated(view, bundle);
        ((BaseTitleBar) mo36632a(R.id.permission_title_bar)).setDividerVisible(false);
        ((BaseTitleBar) mo36632a(R.id.permission_title_bar)).setLeftIconVisibility(this.f25722m);
        SpaceEmptyState spaceEmptyState = (SpaceEmptyState) mo36632a(R.id.no_data_empty_state);
        Intrinsics.checkExpressionValueIsNotNull(spaceEmptyState, "no_data_empty_state");
        ViewGroup.LayoutParams layoutParams = spaceEmptyState.getLayoutParams();
        layoutParams.width = (int) ((getResources().getDimension(R.dimen.ud_emptystate_padding_horizontal) * ((float) 2)) + getResources().getDimension(R.dimen.space_permission_forbid_max_width));
        SpaceEmptyState spaceEmptyState2 = (SpaceEmptyState) mo36632a(R.id.no_data_empty_state);
        Intrinsics.checkExpressionValueIsNotNull(spaceEmptyState2, "no_data_empty_state");
        spaceEmptyState2.setLayoutParams(layoutParams);
        int i = this.f25720k;
        if (i == -1) {
            i = R.string.Doc_Permission_AdminNotAuthorizeCross;
        }
        ((SpaceEmptyState) mo36632a(R.id.no_data_empty_state)).setTitle(view.getContext().getString(i));
        ((SpaceEmptyState) mo36632a(R.id.no_data_empty_state)).mo90950b(this.f25719j);
        ((SpaceEmptyState) mo36632a(R.id.no_data_empty_state)).setDesc(m39527c());
        ((SpaceEmptyState) mo36632a(R.id.no_data_empty_state)).mo90951c(this.f25721l);
        ((BaseTitleBar) mo36632a(R.id.permission_title_bar)).setLeftClickListener(new View$OnClickListenerC9573b(this));
        PermissionAnalyticV2.m39647b(this.f25711a, this.f25712b, this.f25713c, this.f25714d, this.f25715e, this.f25716f, this.f25717g, this.f25718h);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.permission_forbid, viewGroup, false);
    }
}
