package com.ss.android.lark.moments.impl.common.widget.keyboard.at;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.base.fragment.BaseFragment;
import com.ss.android.lark.moments.impl.common.widget.keyboard.at.MomentsAtAdapter;
import com.ss.android.lark.search.widget.BasePicker;
import com.ss.android.lark.search.widget.ChatterPicker;
import com.ss.android.lark.searchcommon.dto.info.SearchBaseInfo;
import com.ss.android.lark.ui.CommonTitleBar;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0002J\u0006\u0010\u0005\u001a\u00020\u0006J&\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016J\u001a\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\b2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016¨\u0006\u0012"}, d2 = {"Lcom/ss/android/lark/moments/impl/common/widget/keyboard/at/MomentsSelectChatterFragment;", "Lcom/ss/android/lark/base/fragment/BaseFragment;", "()V", "initView", "", "onBackPressed", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "Companion", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.moments.impl.common.widget.keyboard.at.g */
public final class MomentsSelectChatterFragment extends BaseFragment {

    /* renamed from: a */
    public static final Companion f119327a = new Companion(null);

    /* renamed from: b */
    private HashMap f119328b;

    /* renamed from: a */
    public View mo166290a(int i) {
        if (this.f119328b == null) {
            this.f119328b = new HashMap();
        }
        View view = (View) this.f119328b.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f119328b.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: b */
    public void mo166292b() {
        HashMap hashMap = this.f119328b;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.base.fragment.BaseFragment, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo166292b();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/moments/impl/common/widget/keyboard/at/MomentsSelectChatterFragment$Companion;", "", "()V", "newInstance", "Lcom/ss/android/lark/moments/impl/common/widget/keyboard/at/MomentsSelectChatterFragment;", "argus", "Landroid/os/Bundle;", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.common.widget.keyboard.at.g$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final MomentsSelectChatterFragment mo166293a(Bundle bundle) {
            MomentsSelectChatterFragment gVar = new MomentsSelectChatterFragment();
            gVar.setArguments(bundle);
            return gVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\n\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u0016J\n\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/moments/impl/common/widget/keyboard/at/MomentsSelectChatterFragment$initView$3", "Lcom/ss/android/lark/search/widget/BasePicker$IViewDependency;", "getActivity", "Landroidx/fragment/app/FragmentActivity;", "getFragmentManager", "Landroidx/fragment/app/FragmentManager;", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.common.widget.keyboard.at.g$d */
    public static final class C47312d implements BasePicker.IViewDependency {

        /* renamed from: a */
        final /* synthetic */ MomentsSelectChatterFragment f119331a;

        /* renamed from: a */
        public FragmentActivity mo110056b() {
            return this.f119331a.getActivity();
        }

        @Override // com.ss.android.lark.search.widget.BasePicker.IViewDependency
        /* renamed from: c */
        public FragmentManager mo110057c() {
            FragmentActivity activity = this.f119331a.getActivity();
            if (activity != null) {
                return activity.getSupportFragmentManager();
            }
            return null;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C47312d(MomentsSelectChatterFragment gVar) {
            this.f119331a = gVar;
        }
    }

    /* renamed from: a */
    public final boolean mo166291a() {
        return ((ChatterPicker) mo166290a(R.id.chatterPicker)).mo183501f();
    }

    /* renamed from: c */
    private final void m187374c() {
        ((CommonTitleBar) mo166290a(R.id.titleBar)).setTitle(UIUtils.getString(getActivity(), R.string.Lark_Community_PleaseSelectMentionPerson));
        ((CommonTitleBar) mo166290a(R.id.titleBar)).setLeftClickListener(new View$OnClickListenerC47310b(this));
        ((ChatterPicker) ((ChatterPicker) ((ChatterPicker) mo166290a(R.id.chatterPicker)).mo183559a(new C47311c(this))).mo183560a(new C47312d(this))).mo183483a();
        ((ChatterPicker) mo166290a(R.id.chatterPicker)).setDisableExternalChatter(true);
        ((ChatterPicker) mo166290a(R.id.chatterPicker)).mo183570b(R.string.Lark_Community_MentionMemberByName);
        MomentsAtFirstScreenFragment dVar = new MomentsAtFirstScreenFragment();
        dVar.mo166283a(new C47313e(this));
        ((ChatterPicker) mo166290a(R.id.chatterPicker)).mo183567a(dVar);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J$\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016J\u0018\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\tH\u0016¨\u0006\r"}, d2 = {"com/ss/android/lark/moments/impl/common/widget/keyboard/at/MomentsSelectChatterFragment$initView$2", "Lcom/ss/android/lark/search/widget/BasePicker$IOnPickNotify;", "onChanged", "", "ids", "", "", "infoList", "", "Lcom/ss/android/lark/searchcommon/dto/info/SearchBaseInfo;", "onSelected", "id", "info", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.common.widget.keyboard.at.g$c */
    public static final class C47311c extends BasePicker.IOnPickNotify {

        /* renamed from: a */
        final /* synthetic */ MomentsSelectChatterFragment f119330a;

        @Override // com.ss.android.lark.search.widget.BasePicker.IOnPickNotify
        /* renamed from: a */
        public void mo110051a(List<String> list, List<SearchBaseInfo> list2) {
            Intrinsics.checkParameterIsNotNull(list, "ids");
            Intrinsics.checkParameterIsNotNull(list2, "infoList");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C47311c(MomentsSelectChatterFragment gVar) {
            this.f119330a = gVar;
        }

        @Override // com.ss.android.lark.search.widget.BasePicker.IOnPickNotify
        /* renamed from: a */
        public void mo110050a(String str, SearchBaseInfo searchBaseInfo) {
            Intrinsics.checkParameterIsNotNull(str, "id");
            Intrinsics.checkParameterIsNotNull(searchBaseInfo, "info");
            FragmentActivity activity = this.f119330a.getActivity();
            if (activity != null) {
                ((MomentsAtSelectActivity) activity).mo166270a(searchBaseInfo);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.moments.impl.common.widget.keyboard.at.MomentsAtSelectActivity");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¨\u0006\u0007"}, d2 = {"com/ss/android/lark/moments/impl/common/widget/keyboard/at/MomentsSelectChatterFragment$initView$4", "Lcom/ss/android/lark/moments/impl/common/widget/keyboard/at/MomentsAtAdapter$IAtUserClickListener;", "onSelectUser", "", "userId", "", "userName", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.common.widget.keyboard.at.g$e */
    public static final class C47313e implements MomentsAtAdapter.IAtUserClickListener {

        /* renamed from: a */
        final /* synthetic */ MomentsSelectChatterFragment f119332a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C47313e(MomentsSelectChatterFragment gVar) {
            this.f119332a = gVar;
        }

        @Override // com.ss.android.lark.moments.impl.common.widget.keyboard.at.MomentsAtAdapter.IAtUserClickListener
        /* renamed from: a */
        public void mo166280a(String str, String str2) {
            Intrinsics.checkParameterIsNotNull(str, "userId");
            Intrinsics.checkParameterIsNotNull(str2, "userName");
            SearchBaseInfo searchBaseInfo = new SearchBaseInfo();
            searchBaseInfo.setId(str);
            searchBaseInfo.setTitle(str2);
            FragmentActivity activity = this.f119332a.getActivity();
            if (activity != null) {
                ((MomentsAtSelectActivity) activity).mo166270a(searchBaseInfo);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.moments.impl.common.widget.keyboard.at.MomentsAtSelectActivity");
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.common.widget.keyboard.at.g$b */
    public static final class View$OnClickListenerC47310b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ MomentsSelectChatterFragment f119329a;

        View$OnClickListenerC47310b(MomentsSelectChatterFragment gVar) {
            this.f119329a = gVar;
        }

        public final void onClick(View view) {
            FragmentActivity activity = this.f119329a.getActivity();
            if (activity != null) {
                ((MomentsAtSelectActivity) activity).finish();
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.moments.impl.common.widget.keyboard.at.MomentsAtSelectActivity");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.onViewCreated(view, bundle);
        m187374c();
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.moments_fragment_select_at, viewGroup, false);
    }
}
