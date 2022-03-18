package com.ss.android.lark.invitation.v2.feat.external.contact.v2;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.larksuite.suite.R;
import com.ss.android.lark.contact.entity.mobile.ContactsMobileFeishuInfo;
import com.ss.android.lark.inv.export.dependency.IInvitationModuleDependency;
import com.ss.android.lark.inv.export.ui.C40098a;
import com.ss.android.lark.inv.export.ui.SearchEditText;
import com.ss.android.lark.inv.export.util.C40129q;
import com.ss.android.lark.inv.export.util.C40147z;
import com.ss.android.lark.inv.export.util.InvApmUtils;
import com.ss.android.lark.inv.export.util.InvAppreciableUtils;
import com.ss.android.lark.inv.export.util.InvErrorView;
import com.ss.android.lark.inv.export.util.InvRequestUtils;
import com.ss.android.lark.invitation.v2.feat.external.contact.v2.invite.InviteExternalContactInviteFragment;
import com.ss.android.lark.invitation.v2.feat.external.contact.v2.invite.InviteExternalContactInviteItem;
import com.ss.android.lark.invitation.v2.feat.external.contact.v2.using.InviteExternalContactUsingFragment;
import com.ss.android.lark.invitation.v2.p2051b.C40156a;
import com.ss.android.lark.invitation.v2.statistic.InvHitPoint;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.ui.IActionTitlebar;
import com.ss.android.lark.utils.C57783ah;
import com.ss.android.lark.utils.C57832h;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.utils.ViewUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 +2\u00020\u0001:\u0001+B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0002J\b\u0010\u001a\u001a\u00020\u0019H\u0002J\b\u0010\u001b\u001a\u00020\u0019H\u0002J\u0018\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u0015H\u0002J&\u0010\u001f\u001a\u0004\u0018\u00010 2\u0006\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$2\b\u0010%\u001a\u0004\u0018\u00010&H\u0016J\b\u0010'\u001a\u00020\u0019H\u0016J\u001a\u0010(\u001a\u00020\u00192\u0006\u0010)\u001a\u00020 2\b\u0010%\u001a\u0004\u0018\u00010&H\u0016J\b\u0010*\u001a\u00020\u0019H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX.¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u00110\u0010j\b\u0012\u0004\u0012\u00020\u0011`\u0012X\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X.¢\u0006\u0002\n\u0000¨\u0006,"}, d2 = {"Lcom/ss/android/lark/invitation/v2/feat/external/contact/v2/InviteExternalContactV2Fragment;", "Lcom/ss/android/lark/inv/export/ui/InvBaseFragment;", "()V", "from", "", "iecErrorView", "Lcom/ss/android/lark/inv/export/util/InvErrorView;", "index", "", "inviteFragment", "Lcom/ss/android/lark/invitation/v2/feat/external/contact/v2/invite/InviteExternalContactInviteFragment;", "isFirst", "", "loading", "Lcom/ss/android/lark/utils/ViewUtils$PageLoadingDialog;", "mFragmentInfos", "Ljava/util/ArrayList;", "Lcom/ss/android/lark/invitation/v2/common/FragmentInfo;", "Lkotlin/collections/ArrayList;", "request", "Lcom/ss/android/lark/inv/export/util/InvRequestUtils$LocalAndServerRequest;", "Lcom/ss/android/lark/contact/entity/mobile/ContactsMobileFeishuInfo;", "usingFragment", "Lcom/ss/android/lark/invitation/v2/feat/external/contact/v2/using/InviteExternalContactUsingFragment;", "fetchData", "", "init", "initSearchView", "initView", "isFromLocal", "info", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onViewCreated", "view", "showLoading", "Companion", "core_invitation_v2_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.invitation.v2.feat.external.contact.v2.a */
public final class InviteExternalContactV2Fragment extends C40098a {

    /* renamed from: f */
    public static final Companion f102218f = new Companion(null);

    /* renamed from: a */
    public ViewUtils.C57757c f102219a;

    /* renamed from: b */
    public ArrayList<C40156a> f102220b = new ArrayList<>();

    /* renamed from: c */
    public int f102221c;

    /* renamed from: d */
    public String f102222d;

    /* renamed from: e */
    public InvErrorView f102223e;

    /* renamed from: g */
    private boolean f102224g = true;

    /* renamed from: h */
    private InvRequestUtils.LocalAndServerRequest<ContactsMobileFeishuInfo> f102225h;

    /* renamed from: i */
    private InviteExternalContactUsingFragment f102226i;

    /* renamed from: j */
    private InviteExternalContactInviteFragment f102227j;

    /* renamed from: k */
    private HashMap f102228k;

    /* renamed from: a */
    public View mo145953a(int i) {
        if (this.f102228k == null) {
            this.f102228k = new HashMap();
        }
        View view = (View) this.f102228k.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f102228k.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: c */
    public void mo145957c() {
        HashMap hashMap = this.f102228k;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.base.fragment.BaseFragment, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo145957c();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/invitation/v2/feat/external/contact/v2/InviteExternalContactV2Fragment$Companion;", "", "()V", "newInstance", "Lcom/ss/android/lark/invitation/v2/feat/external/contact/v2/InviteExternalContactV2Fragment;", "args", "Landroid/os/Bundle;", "core_invitation_v2_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.invitation.v2.feat.external.contact.v2.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final InviteExternalContactV2Fragment mo145958a(Bundle bundle) {
            InviteExternalContactV2Fragment aVar = new InviteExternalContactV2Fragment();
            aVar.setArguments(bundle);
            return aVar;
        }
    }

    /* renamed from: a */
    public final void mo145954a() {
        m159474d();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0002H\u0016J\u0016\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\tH\u0016J\u0016\u0010\n\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\tH\u0016J\b\u0010\u000b\u001a\u00020\u0007H\u0016J\u001a\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0016J\u0012\u0010\u000e\u001a\u00020\u00072\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0007H\u0016¨\u0006\u0012"}, d2 = {"com/ss/android/lark/invitation/v2/feat/external/contact/v2/InviteExternalContactV2Fragment$fetchData$1", "Lcom/ss/android/lark/inv/export/util/InvRequestUtils$LocalAndServerRequestCallback;", "Lcom/ss/android/lark/contact/entity/mobile/ContactsMobileFeishuInfo;", "isLocalDataValid", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "loadLocalData", "", "callback", "Lcom/larksuite/framework/callback/UIGetDataCallback;", "loadServerData", "onHideLoading", "onShowData", "isFromLocal", "onShowError", "error", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onShowLoading", "core_invitation_v2_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.invitation.v2.feat.external.contact.v2.a$b */
    public static final class C40233b implements InvRequestUtils.LocalAndServerRequestCallback<ContactsMobileFeishuInfo> {

        /* renamed from: a */
        final /* synthetic */ InviteExternalContactV2Fragment f102229a;

        @Override // com.ss.android.lark.inv.export.util.InvRequestUtils.LocalAndServerRequestCallback
        /* renamed from: a */
        public void mo130825a() {
            this.f102229a.mo145956b();
        }

        @Override // com.ss.android.lark.inv.export.util.InvRequestUtils.LocalAndServerRequestCallback
        /* renamed from: b */
        public void mo130832b() {
            ViewUtils.C57757c cVar = this.f102229a.f102219a;
            if (cVar != null) {
                cVar.mo196042e();
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C40233b(InviteExternalContactV2Fragment aVar) {
            this.f102229a = aVar;
        }

        @Override // com.ss.android.lark.inv.export.util.InvRequestUtils.LocalAndServerRequestCallback
        /* renamed from: a */
        public void mo130826a(ErrorResult errorResult) {
            InviteExternalContactV2Fragment.m159473b(this.f102229a).mo145638a();
            if (errorResult != null) {
                InvApmUtils.m158963a("contact_opt_contact_list_fetch_fail", (Map) null, errorResult, 2, (Object) null);
                InvAppreciableUtils.f101934a.mo145660c(errorResult);
            }
        }

        @Override // com.ss.android.lark.inv.export.util.InvRequestUtils.LocalAndServerRequestCallback
        /* renamed from: b */
        public void mo130833b(UIGetDataCallback<ContactsMobileFeishuInfo> uIGetDataCallback) {
            Intrinsics.checkParameterIsNotNull(uIGetDataCallback, "callback");
            IInvitationModuleDependency a = C40147z.m159160a();
            Intrinsics.checkExpressionValueIsNotNull(a, "InvUtils.getDep()");
            a.getContactDependency().mo145579a(false, uIGetDataCallback);
        }

        @Override // com.ss.android.lark.inv.export.util.InvRequestUtils.LocalAndServerRequestCallback
        /* renamed from: a */
        public void mo130827a(UIGetDataCallback<ContactsMobileFeishuInfo> uIGetDataCallback) {
            Intrinsics.checkParameterIsNotNull(uIGetDataCallback, "callback");
            IInvitationModuleDependency a = C40147z.m159160a();
            Intrinsics.checkExpressionValueIsNotNull(a, "InvUtils.getDep()");
            a.getContactDependency().mo145579a(true, uIGetDataCallback);
        }

        /* renamed from: a */
        public boolean mo130830a(ContactsMobileFeishuInfo bVar) {
            Intrinsics.checkParameterIsNotNull(bVar, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            return !bVar.mo130643a().isEmpty();
        }

        /* renamed from: a */
        public void mo130828a(boolean z, ContactsMobileFeishuInfo bVar) {
            if (bVar == null) {
                mo130826a((ErrorResult) null);
            } else {
                this.f102229a.mo145955a(z, bVar);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0003H\u0016J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0006\u001a\u00020\u0003H\u0016¨\u0006\t¸\u0006\u0000"}, d2 = {"com/ss/android/lark/invitation/v2/feat/external/contact/v2/InviteExternalContactV2Fragment$initView$1$2", "Landroidx/fragment/app/FragmentPagerAdapter;", "getCount", "", "getItem", "Landroidx/fragment/app/Fragment;", "position", "getPageTitle", "", "core_invitation_v2_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.invitation.v2.feat.external.contact.v2.a$h */
    public static final class C40239h extends FragmentPagerAdapter {

        /* renamed from: a */
        final /* synthetic */ InviteExternalContactV2Fragment f102237a;

        /* renamed from: b */
        final /* synthetic */ ContactsMobileFeishuInfo f102238b;

        @Override // androidx.viewpager.widget.PagerAdapter
        public int getCount() {
            return this.f102237a.f102220b.size();
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public CharSequence getPageTitle(int i) {
            return this.f102237a.f102220b.get(i).f102007b;
        }

        @Override // androidx.fragment.app.FragmentPagerAdapter
        public Fragment getItem(int i) {
            Fragment fragment = this.f102237a.f102220b.get(i).f102006a;
            Intrinsics.checkExpressionValueIsNotNull(fragment, "mFragmentInfos[position].fragment");
            return fragment;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C40239h(FragmentManager fragmentManager, InviteExternalContactV2Fragment aVar, ContactsMobileFeishuInfo bVar) {
            super(fragmentManager);
            this.f102237a = aVar;
            this.f102238b = bVar;
        }
    }

    @Override // androidx.fragment.app.Fragment, com.ss.android.lark.inv.export.ui.C40098a
    public void onDestroy() {
        super.onDestroy();
        InvRequestUtils.LocalAndServerRequest<ContactsMobileFeishuInfo> aVar = this.f102225h;
        if (aVar != null) {
            aVar.mo145710b();
        }
    }

    /* renamed from: d */
    private final void m159474d() {
        InvApmUtils.m158958a("contact_opt_contact_list_timing_ms");
        this.f102225h = InvRequestUtils.m159144b(new C40233b(this));
    }

    /* renamed from: b */
    public final void mo145956b() {
        InvErrorView invErrorView = this.f102223e;
        if (invErrorView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("iecErrorView");
        }
        invErrorView.mo145640b();
        if (this.f102219a == null) {
            ViewUtils.C57757c d = ViewUtils.m224155d(getContext());
            d.mo196036a(new DialogInterface$OnCancelListenerC40242k(this));
            this.f102219a = d;
        }
        ViewUtils.C57757c cVar = this.f102219a;
        if (cVar != null) {
            cVar.mo196039b();
        }
    }

    /* renamed from: e */
    private final void m159475e() {
        ((SearchEditText) mo145953a(R.id.iecSearchEt)).setTextWithoutSpaceChangedListener(C40234c.f102230a);
        ((SearchEditText) mo145953a(R.id.iecSearchEt)).addTextChangedListener(new C40235d(this));
        SearchEditText searchEditText = (SearchEditText) mo145953a(R.id.iecSearchEt);
        Intrinsics.checkExpressionValueIsNotNull(searchEditText, "iecSearchEt");
        searchEditText.setOnFocusChangeListener(View$OnFocusChangeListenerC40236e.f102232a);
        C57832h.m224490a((ImageView) mo145953a(R.id.iecSearchClearIv));
        ((ImageView) mo145953a(R.id.iecSearchClearIv)).setOnClickListener(new View$OnClickListenerC40237f(this));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J*\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0016J*\u0010\f\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016¨\u0006\u000e"}, d2 = {"com/ss/android/lark/invitation/v2/feat/external/contact/v2/InviteExternalContactV2Fragment$initSearchView$2", "Landroid/text/TextWatcher;", "afterTextChanged", "", "s", "Landroid/text/Editable;", "beforeTextChanged", "", "start", "", "count", "after", "onTextChanged", "before", "core_invitation_v2_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.invitation.v2.feat.external.contact.v2.a$d */
    public static final class C40235d implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ InviteExternalContactV2Fragment f102231a;

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C40235d(InviteExternalContactV2Fragment aVar) {
            this.f102231a = aVar;
        }

        public void afterTextChanged(Editable editable) {
            boolean z;
            ImageView imageView = (ImageView) this.f102231a.mo145953a(R.id.iecSearchClearIv);
            Intrinsics.checkExpressionValueIsNotNull(imageView, "iecSearchClearIv");
            int i = 0;
            if (String.valueOf(editable).length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                i = 8;
            }
            imageView.setVisibility(i);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.invitation.v2.feat.external.contact.v2.a$i */
    static final class View$OnClickListenerC40240i implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ InviteExternalContactV2Fragment f102239a;

        View$OnClickListenerC40240i(InviteExternalContactV2Fragment aVar) {
            this.f102239a = aVar;
        }

        public final void onClick(View view) {
            this.f102239a.mo145954a();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "onCancel", "com/ss/android/lark/invitation/v2/feat/external/contact/v2/InviteExternalContactV2Fragment$showLoading$1$1"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.invitation.v2.feat.external.contact.v2.a$k */
    public static final class DialogInterface$OnCancelListenerC40242k implements DialogInterface.OnCancelListener {

        /* renamed from: a */
        final /* synthetic */ InviteExternalContactV2Fragment f102241a;

        DialogInterface$OnCancelListenerC40242k(InviteExternalContactV2Fragment aVar) {
            this.f102241a = aVar;
        }

        public final void onCancel(DialogInterface dialogInterface) {
            this.f102241a.finish();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "onTextChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.invitation.v2.feat.external.contact.v2.a$c */
    public static final class C40234c implements SearchEditText.AbstractC40097a {

        /* renamed from: a */
        public static final C40234c f102230a = new C40234c();

        C40234c() {
        }

        @Override // com.ss.android.lark.inv.export.ui.SearchEditText.AbstractC40097a
        /* renamed from: a */
        public final void mo145636a(String str) {
            C57783ah.m224245a().mo196093a(R.id.UiMessageExternalContactSearch, str);
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ String m159472a(InviteExternalContactV2Fragment aVar) {
        String str = aVar.f102222d;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("from");
        }
        return str;
    }

    /* renamed from: b */
    public static final /* synthetic */ InvErrorView m159473b(InviteExternalContactV2Fragment aVar) {
        InvErrorView invErrorView = aVar.f102223e;
        if (invErrorView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("iecErrorView");
        }
        return invErrorView;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.invitation.v2.feat.external.contact.v2.a$f */
    public static final class View$OnClickListenerC40237f implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ InviteExternalContactV2Fragment f102233a;

        View$OnClickListenerC40237f(InviteExternalContactV2Fragment aVar) {
            this.f102233a = aVar;
        }

        public final void onClick(View view) {
            ((SearchEditText) this.f102233a.mo145953a(R.id.iecSearchEt)).setText("");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J \u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005H\u0016J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0005H\u0016¨\u0006\f¸\u0006\u0000"}, d2 = {"com/ss/android/lark/invitation/v2/feat/external/contact/v2/InviteExternalContactV2Fragment$initView$1$1", "Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;", "onPageScrollStateChanged", "", "state", "", "onPageScrolled", "position", "positionOffset", "", "positionOffsetPixels", "onPageSelected", "core_invitation_v2_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.invitation.v2.feat.external.contact.v2.a$g */
    public static final class C40238g implements ViewPager.OnPageChangeListener {

        /* renamed from: a */
        final /* synthetic */ ViewPager f102234a;

        /* renamed from: b */
        final /* synthetic */ InviteExternalContactV2Fragment f102235b;

        /* renamed from: c */
        final /* synthetic */ ContactsMobileFeishuInfo f102236c;

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i, float f, int i2) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int i) {
            this.f102235b.f102221c = i;
            C40129q.m159107a(ViewUtils.m224141a(this.f102234a.getContext()));
            if (this.f102235b.f102221c == 0) {
                InvHitPoint.m160396n();
            } else {
                InvHitPoint.m160398o();
            }
        }

        C40238g(ViewPager viewPager, InviteExternalContactV2Fragment aVar, ContactsMobileFeishuInfo bVar) {
            this.f102234a = viewPager;
            this.f102235b = aVar;
            this.f102236c = bVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/invitation/v2/feat/external/contact/v2/InviteExternalContactV2Fragment$onViewCreated$action$1", "Lcom/ss/android/lark/ui/IActionTitlebar$TextAction;", "performAction", "", "view", "Landroid/view/View;", "core_invitation_v2_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.invitation.v2.feat.external.contact.v2.a$j */
    public static final class C40241j extends IActionTitlebar.TextAction {

        /* renamed from: a */
        final /* synthetic */ InviteExternalContactV2Fragment f102240a;

        @Override // com.ss.android.lark.ui.IActionTitlebar.Action, com.ss.android.lark.ui.IActionTitlebar.BaseAction
        public void performAction(View view) {
            Intrinsics.checkParameterIsNotNull(view, "view");
            Intent intent = new Intent();
            intent.putExtra(InviteExternalContactV2Fragment.m159472a(this.f102240a), "jump");
            this.f102240a.setResult(-1, intent);
            this.f102240a.finish();
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C40241j(InviteExternalContactV2Fragment aVar, String str, int i) {
            super(str, i);
            this.f102240a = aVar;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/view/View;", "kotlin.jvm.PlatformType", "hasFocus", "", "onFocusChange"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.invitation.v2.feat.external.contact.v2.a$e */
    public static final class View$OnFocusChangeListenerC40236e implements View.OnFocusChangeListener {

        /* renamed from: a */
        public static final View$OnFocusChangeListenerC40236e f102232a = new View$OnFocusChangeListenerC40236e();

        View$OnFocusChangeListenerC40236e() {
        }

        public final void onFocusChange(View view, boolean z) {
            if (z) {
                InvHitPoint.m160400p();
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        String str;
        String str2;
        String string;
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.onViewCreated(view, bundle);
        InvAppreciableUtils.f101934a.mo145662d(true);
        View findViewById = view.findViewById(R.id.iecErrorView);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "view.findViewById(R.id.iecErrorView)");
        this.f102223e = (InvErrorView) findViewById;
        InviteExternalContactInviteItem.Companion aVar = InviteExternalContactInviteItem.f102249e;
        Bundle arguments = getArguments();
        String str3 = "";
        if (arguments == null || (str = arguments.getString("invite_msg")) == null) {
            str = str3;
        }
        aVar.mo145979a(str);
        InviteExternalContactInviteItem.Companion aVar2 = InviteExternalContactInviteItem.f102249e;
        Bundle arguments2 = getArguments();
        if (arguments2 == null || (str2 = arguments2.getString("unique_id")) == null) {
            str2 = str3;
        }
        aVar2.mo145980b(str2);
        Bundle arguments3 = getArguments();
        if (!(arguments3 == null || (string = arguments3.getString("from_scenes")) == null)) {
            str3 = string;
        }
        this.f102222d = str3;
        if (str3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("from");
        }
        if (Intrinsics.areEqual("onboarding", str3)) {
            CommonTitleBar commonTitleBar = (CommonTitleBar) mo145953a(R.id.iecTitleBar);
            Intrinsics.checkExpressionValueIsNotNull(commonTitleBar, "iecTitleBar");
            TextView leftText = commonTitleBar.getLeftText();
            Intrinsics.checkExpressionValueIsNotNull(leftText, "iecTitleBar.leftText");
            leftText.setVisibility(8);
            ((CommonTitleBar) mo145953a(R.id.iecTitleBar)).addAction(new C40241j(this, UIHelper.getString(R.string.Lark_Guide_VideoSkip), R.color.lkui_B500));
        }
        InvErrorView invErrorView = this.f102223e;
        if (invErrorView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("iecErrorView");
        }
        invErrorView.setOnClickListener(new View$OnClickListenerC40240i(this));
        mo145954a();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00ea, code lost:
        if (kotlin.jvm.internal.Intrinsics.areEqual("onboarding", r6) != false) goto L_0x00ec;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo145955a(boolean r5, com.ss.android.lark.contact.entity.mobile.ContactsMobileFeishuInfo r6) {
        /*
        // Method dump skipped, instructions count: 280
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.invitation.v2.feat.external.contact.v2.InviteExternalContactV2Fragment.mo145955a(boolean, com.ss.android.lark.contact.entity.mobile.b):void");
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.inv_invite_external_contact_v2_view, viewGroup, false);
    }
}
