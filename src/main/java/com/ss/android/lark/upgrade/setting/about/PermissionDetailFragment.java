package com.ss.android.lark.upgrade.setting.about;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.AbstractC0203c;
import androidx.activity.OnBackPressedDispatcher;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.transition.C1554t;
import com.larksuite.suite.R;
import com.ss.android.lark.base.fragment.BaseFragment;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.upgrade.setting.about.PermissionItemViewGroup;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0006\u001a\u00020\u00072\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002J\b\u0010\b\u001a\u00020\tH\u0002J\u0012\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J\u0012\u0010\r\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J&\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J\b\u0010\u0014\u001a\u00020\tH\u0016J\b\u0010\u0015\u001a\u00020\tH\u0002J \u0010\u0016\u001a\u00020\t*\u00020\u000f2\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\t0\u0018H\u0002R\u001a\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/ss/android/lark/upgrade/setting/about/PermissionDetailFragment;", "Lcom/ss/android/lark/base/fragment/BaseFragment;", "()V", "permissions", "", "", "checkPermissionGroup", "", "initAllPermissionItemsStatus", "", "onActivityCreated", "savedInstanceState", "Landroid/os/Bundle;", "onCreate", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onStart", "startApplicationDetailsSettings", "forEach", "action", "Lkotlin/Function1;", "core_upgrade_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.upgrade.setting.about.d */
public final class PermissionDetailFragment extends BaseFragment {

    /* renamed from: a */
    public final List<List<String>> f142187a = CollectionsKt.listOf((Object[]) new List[]{CollectionsKt.listOf("android.permission.CAMERA"), CollectionsKt.listOf((Object[]) new String[]{"android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE"}), CollectionsKt.listOf((Object[]) new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}), CollectionsKt.listOf((Object[]) new String[]{"android.permission.READ_CONTACTS", "android.permission.WRITE_CONTACTS"}), CollectionsKt.listOf("android.permission.RECORD_AUDIO"), CollectionsKt.listOf((Object[]) new String[]{"android.permission.READ_CALENDAR", "android.permission.WRITE_CALENDAR"})});

    /* renamed from: b */
    private HashMap f142188b;

    /* renamed from: a */
    public View mo195855a(int i) {
        if (this.f142188b == null) {
            this.f142188b = new HashMap();
        }
        View view = (View) this.f142188b.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f142188b.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: b */
    public void mo195858b() {
        HashMap hashMap = this.f142188b;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.base.fragment.BaseFragment, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo195858b();
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        m224037c();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/ss/android/lark/upgrade/setting/about/PermissionDetailFragment$onActivityCreated$1", "Landroidx/activity/OnBackPressedCallback;", "handleOnBackPressed", "", "core_upgrade_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.upgrade.setting.about.d$b */
    public static final class C57706b extends AbstractC0203c {

        /* renamed from: a */
        final /* synthetic */ PermissionDetailFragment f142190a;

        @Override // androidx.activity.AbstractC0203c
        public void handleOnBackPressed() {
            this.f142190a.getParentFragmentManager().beginTransaction().remove(this.f142190a).commit();
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C57706b(PermissionDetailFragment dVar, boolean z) {
            super(z);
            this.f142190a = dVar;
        }
    }

    /* renamed from: c */
    private final void m224037c() {
        Ref.IntRef intRef = new Ref.IntRef();
        intRef.element = 0;
        View requireView = requireView();
        Intrinsics.checkExpressionValueIsNotNull(requireView, "requireView()");
        m224036a(requireView, new C57704a(this, intRef));
    }

    /* renamed from: a */
    public final void mo195856a() {
        try {
            Context requireContext = requireContext();
            Intrinsics.checkExpressionValueIsNotNull(requireContext, "requireContext()");
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS", Uri.fromParts("package", requireContext.getPackageName(), null));
            intent.addFlags(268435456);
            startActivity(intent);
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.upgrade.setting.about.d$a */
    public static final class C57704a extends Lambda implements Function1<View, Unit> {
        final /* synthetic */ Ref.IntRef $index;
        final /* synthetic */ PermissionDetailFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C57704a(PermissionDetailFragment dVar, Ref.IntRef intRef) {
            super(1);
            this.this$0 = dVar;
            this.$index = intRef;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke(view);
            return Unit.INSTANCE;
        }

        public final void invoke(View view) {
            PermissionItemViewGroup.Status status;
            Intrinsics.checkParameterIsNotNull(view, "it");
            if (view instanceof PermissionItemViewGroup) {
                PermissionItemViewGroup permissionItemViewGroup = (PermissionItemViewGroup) view;
                PermissionDetailFragment dVar = this.this$0;
                List<List<String>> list = dVar.f142187a;
                Ref.IntRef intRef = this.$index;
                int i = intRef.element;
                intRef.element = i + 1;
                if (dVar.mo195857a(list.get(i))) {
                    status = PermissionItemViewGroup.Status.ON;
                } else {
                    status = PermissionItemViewGroup.Status.OFF;
                }
                permissionItemViewGroup.setStatus(status);
                view.setOnClickListener(new View.OnClickListener(this) {
                    /* class com.ss.android.lark.upgrade.setting.about.PermissionDetailFragment.C57704a.View$OnClickListenerC577051 */

                    /* renamed from: a */
                    final /* synthetic */ C57704a f142189a;

                    {
                        this.f142189a = r1;
                    }

                    public final void onClick(View view) {
                        this.f142189a.this$0.mo195856a();
                    }
                });
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.upgrade.setting.about.d$c */
    static final class View$OnClickListenerC57707c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ PermissionDetailFragment f142191a;

        View$OnClickListenerC57707c(PermissionDetailFragment dVar) {
            this.f142191a = dVar;
        }

        public final void onClick(View view) {
            OnBackPressedDispatcher onBackPressedDispatcher;
            FragmentActivity activity = this.f142191a.getActivity();
            if (activity != null && (onBackPressedDispatcher = activity.getOnBackPressedDispatcher()) != null) {
                onBackPressedDispatcher.onBackPressed();
            }
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.base.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C1554t a = C1554t.m7120a(requireContext());
        setEnterTransition(a.mo8053a(R.transition.fragment_permission_detail_slide_right));
        setExitTransition(a.mo8053a(R.transition.fragment_permission_detail_slide_right));
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        FragmentActivity requireActivity = requireActivity();
        Intrinsics.checkExpressionValueIsNotNull(requireActivity, "requireActivity()");
        requireActivity.getOnBackPressedDispatcher().addCallback(getViewLifecycleOwner(), new C57706b(this, true));
        ((CommonTitleBar) mo195855a(R.id.title_bar)).setLeftClickListener(new View$OnClickListenerC57707c(this));
    }

    /* renamed from: a */
    public final boolean mo195857a(List<String> list) {
        boolean z;
        List<String> list2 = list;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                if (ContextCompat.checkSelfPermission(requireContext(), it.next()) == 0) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (z) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    private final void m224036a(View view, Function1<? super View, Unit> function1) {
        function1.invoke(view);
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                Intrinsics.checkExpressionValueIsNotNull(childAt, "child");
                m224036a(childAt, function1);
            }
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.fragment_permission_detail, viewGroup, false);
    }
}
