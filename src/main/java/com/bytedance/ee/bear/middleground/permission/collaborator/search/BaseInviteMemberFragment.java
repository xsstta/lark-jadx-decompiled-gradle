package com.bytedance.ee.bear.middleground.permission.collaborator.search;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import androidx.core.graphics.C0768a;
import androidx.fragment.app.DialogInterface$OnCancelListenerC1021b;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.ee.bear.middleground.permission.PermissionAnalyticV2;
import com.bytedance.ee.bear.middleground.permission.collaborator.invite.InviteMemberParams;
import com.bytedance.ee.bear.middleground.permission.collaborator.search.newsearch.ISearchUserActDependency;
import com.bytedance.ee.bear.middleground.permission.collaborator.search.newsearch.dep.SelectDepFragment;
import com.bytedance.ee.bear.middleground.permission.collaborator.search.newsearch.user.NewSearchUserFragment;
import com.bytedance.ee.bear.p522q.p523a.C10548d;
import com.bytedance.ee.bear.share.export.AbstractC11003a;
import com.bytedance.ee.bear.share.export.UserInfo;
import com.bytedance.ee.bear.watermark.interfaces.IWatermarkManager;
import com.bytedance.ee.bear.widget.statusbar.C11789c;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p718t.C13741f;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.koin.java.KoinJavaComponent;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u0000 12\u00020\u00012\u00020\u00022\u00020\u0003:\u00011B\u0005¢\u0006\u0002\u0010\u0004J\b\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\u000eH&J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\fH&J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0010H\u0002J\b\u0010\u0015\u001a\u00020\u0010H\u0002J\b\u0010\u0016\u001a\u00020\u0010H\u0016J\u0012\u0010\u0017\u001a\u00020\u00102\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J&\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J$\u0010 \u001a\u00020\f2\b\u0010!\u001a\u0004\u0018\u00010\"2\u0006\u0010#\u001a\u00020\u00132\b\u0010$\u001a\u0004\u0018\u00010%H\u0016J\b\u0010&\u001a\u00020\u0010H\u0016J\b\u0010'\u001a\u00020\u0010H\u0016J\u001a\u0010(\u001a\u00020\u00102\u0006\u0010)\u001a\u00020\u001b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\u000e\u0010*\u001a\b\u0012\u0004\u0012\u00020,0+H&J\b\u0010-\u001a\u00020\u0010H\u0002J\u0010\u0010.\u001a\u00020\u00102\u0006\u0010/\u001a\u000200H\u0004R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u00062"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/collaborator/search/BaseInviteMemberFragment;", "Landroidx/fragment/app/DialogFragment;", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/search/newsearch/ISearchUserActDependency;", "Landroid/content/DialogInterface$OnKeyListener;", "()V", "viewModel", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/search/InviteMemberViewModel;", "getViewModel", "()Lcom/bytedance/ee/bear/middleground/permission/collaborator/search/InviteMemberViewModel;", "setViewModel", "(Lcom/bytedance/ee/bear/middleground/permission/collaborator/search/InviteMemberViewModel;)V", "back", "", "buildInviteParams", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/InviteMemberParams;", "finish", "", "fromSharePanel", "getAnimations", "", "hideShareFragment", "initFragment", "jumpSelectedDep", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onKey", "dialog", "Landroid/content/DialogInterface;", "keyCode", "event", "Landroid/view/KeyEvent;", "onResume", "onStart", "onViewCreated", "view", "originUserInfoList", "Ljava/util/ArrayList;", "Lcom/bytedance/ee/bear/share/export/UserInfo;", "showShareFragment", "transformFragment", "fragment", "Landroidx/fragment/app/Fragment;", "Companion", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.search.a */
public abstract class BaseInviteMemberFragment extends DialogInterface$OnCancelListenerC1021b implements DialogInterface.OnKeyListener, ISearchUserActDependency {

    /* renamed from: c */
    public static final Companion f26559c = new Companion(null);

    /* renamed from: d */
    private InviteMemberViewModel f26560d;

    /* renamed from: e */
    private HashMap f26561e;

    /* renamed from: a */
    public View mo37436a(int i) {
        if (this.f26561e == null) {
            this.f26561e = new HashMap();
        }
        View view = (View) this.f26561e.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f26561e.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: f */
    public int mo37439f() {
        return R.style.ActionSheetAnimation;
    }

    /* renamed from: g */
    public abstract InviteMemberParams mo37440g();

    /* renamed from: h */
    public abstract ArrayList<UserInfo> mo37441h();

    /* renamed from: i */
    public abstract boolean mo37442i();

    /* renamed from: m */
    public void mo37446m() {
        HashMap hashMap = this.f26561e;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC1021b, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo37446m();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/collaborator/search/BaseInviteMemberFragment$Companion;", "", "()V", "TAG", "", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.search.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        m40795q();
    }

    /* renamed from: p */
    private final void m40794p() {
        if (mo37442i()) {
            ((AbstractC11003a) KoinJavaComponent.m268613a(AbstractC11003a.class, null, null, 6, null)).mo41766b();
        }
    }

    /* renamed from: q */
    private final void m40795q() {
        if (mo37442i()) {
            ((AbstractC11003a) KoinJavaComponent.m268613a(AbstractC11003a.class, null, null, 6, null)).mo41767c();
        }
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.search.newsearch.ISearchUserActDependency
    /* renamed from: k */
    public void mo37444k() {
        View view = getView();
        if (view != null && view.requestFocus()) {
            C10548d.m43697a(getView());
        }
        m40794p();
        mo5513b();
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.search.newsearch.ISearchUserActDependency
    /* renamed from: l */
    public void mo37445l() {
        mo37437a(SelectDepFragment.f26752c.mo37667a(mo37441h(), mo37440g()));
    }

    /* renamed from: r */
    private final void m40796r() {
        if (getChildFragmentManager().findFragmentByTag(NewSearchUserFragment.class.getName()) == null) {
            InviteMemberViewModel fVar = this.f26560d;
            if (fVar != null) {
                fVar.clearDataAndListener();
            }
            getChildFragmentManager().beginTransaction().add(R.id.share_search_content_frame, NewSearchUserFragment.f26768a.mo37684a(mo37441h(), mo37440g()), NewSearchUserFragment.class.getName()).commitAllowingStateLoss();
        }
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.search.newsearch.ISearchUserActDependency
    /* renamed from: j */
    public boolean mo37443j() {
        if (!isAdded()) {
            C13479a.m54758a("InviteMemberFragment", "back()...but isAdd=false");
            return false;
        }
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkExpressionValueIsNotNull(childFragmentManager, "childFragmentManager");
        if (childFragmentManager.getBackStackEntryCount() >= 1) {
            FragmentManager childFragmentManager2 = getChildFragmentManager();
            Intrinsics.checkExpressionValueIsNotNull(childFragmentManager2, "childFragmentManager");
            C13741f.m55704a(childFragmentManager2);
            childFragmentManager2.popBackStack();
            return true;
        }
        mo37444k();
        return false;
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC1021b, androidx.fragment.app.Fragment
    public void onStart() {
        Window window;
        boolean z;
        super.onStart();
        Dialog v_ = v_();
        if (v_ != null && (window = v_.getWindow()) != null) {
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.width = -1;
            attributes.height = -1;
            attributes.softInputMode = 16;
            window.setAttributes(attributes);
            window.setDimAmount(BitmapDescriptorFactory.HUE_RED);
            window.setWindowAnimations(mo37439f());
            window.setBackgroundDrawableResource(17170445);
            int color = UIUtils.getColor(getActivity(), R.color.bg_body);
            if (C0768a.m3714b(-1, color) <= ((double) 3.0f)) {
                z = true;
            } else {
                z = false;
            }
            C11789c.m48867a(window, color, z);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo37438a(InviteMemberViewModel fVar) {
        this.f26560d = fVar;
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC1021b, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo5510a(0, R.style.InviteMemberFullDialogFragment);
        PermissionAnalyticV2.m39674f();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo37437a(Fragment fragment) {
        Intrinsics.checkParameterIsNotNull(fragment, "fragment");
        getChildFragmentManager().beginTransaction().setCustomAnimations(R.anim.facade_slide_right_in, R.anim.facade_slide_left_out, R.anim.facade_slide_left_in, R.anim.facade_slide_right_out).add(R.id.share_search_content_frame, fragment).addToBackStack(null).commitAllowingStateLoss();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.onViewCreated(view, bundle);
        Dialog v_ = v_();
        if (v_ != null) {
            v_.setOnKeyListener(this);
        }
        m40796r();
        ((IWatermarkManager) KoinJavaComponent.m268613a(IWatermarkManager.class, null, null, 6, null)).mo40646a((FrameLayout) mo37436a(R.id.share_search_content_frame));
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.fragment_invite_member, viewGroup, false);
    }

    public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        if (i == 4 && keyEvent != null && keyEvent.getAction() == 0) {
            return mo37443j();
        }
        if (i == 4 && keyEvent != null && keyEvent.getAction() == 1) {
            return true;
        }
        return false;
    }
}
