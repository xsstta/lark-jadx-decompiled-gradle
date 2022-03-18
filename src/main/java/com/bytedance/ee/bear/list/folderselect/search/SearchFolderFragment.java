package com.bytedance.ee.bear.list.folderselect.search;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.contract.route.parcelable.DocOperateBean;
import com.bytedance.ee.bear.facade.common.C7667e;
import com.bytedance.ee.bear.list.folderselect.AbstractC8402d;
import com.bytedance.ee.bear.list.folderselect.search.SearchFolderPresenter;
import com.bytedance.ee.bear.p522q.p523a.C10548d;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.service.C10929e;
import com.larksuite.suite.R;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.koin.java.KoinJavaComponent;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u0000 ,2\u00020\u00012\u00020\u0002:\u0001,B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\rH\u0002J\u0010\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\rH\u0016J\u0012\u0010\u0016\u001a\u00020\r2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J&\u0010\u0019\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\u001a\u0010\u001e\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\u00052\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J@\u0010 \u001a\u00020\r2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\"2\u0006\u0010)\u001a\u00020'2\u0006\u0010*\u001a\u00020\"H\u0016J\b\u0010+\u001a\u00020\rH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u0002\n\u0000¨\u0006-"}, d2 = {"Lcom/bytedance/ee/bear/list/folderselect/search/SearchFolderFragment;", "Lcom/bytedance/ee/bear/facade/common/BaseFragment;", "Lcom/bytedance/ee/bear/list/folderselect/search/SearchFolderPresenter$IDependence;", "()V", "mRootView", "Landroid/view/View;", "operateBean", "Lcom/bytedance/ee/bear/contract/route/parcelable/DocOperateBean;", "serviceContext", "Lcom/bytedance/ee/bear/service/ServiceContext;", "trigger", "Lcom/bytedance/ee/bear/list/folderselect/IOpenPageTrigger;", "finish", "", "finishWithResult", "intent", "Landroid/content/Intent;", "initMVP", "onAttach", "context", "Landroid/content/Context;", "onBackClicked", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onViewCreated", "view", "openSubFolder", "folderType", "", "destToken", "", "destName", "isShareFolder", "", "permission", "isDestExternal", "ownerType", "parseBundle", "Companion", "list_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.list.folderselect.search.c */
public final class SearchFolderFragment extends C7667e implements SearchFolderPresenter.IDependence {

    /* renamed from: a */
    public static final Companion f22775a = new Companion(null);

    /* renamed from: b */
    private View f22776b;

    /* renamed from: c */
    private DocOperateBean f22777c = new DocOperateBean();

    /* renamed from: d */
    private AbstractC8402d f22778d;

    /* renamed from: e */
    private final C10917c f22779e = new C10917c(new C10929e());

    /* renamed from: f */
    private HashMap f22780f;

    @JvmStatic
    /* renamed from: a */
    public static final SearchFolderFragment m34961a(Context context, DocOperateBean docOperateBean) {
        return f22775a.mo33027a(context, docOperateBean);
    }

    /* renamed from: b */
    public void mo33026b() {
        HashMap hashMap = this.f22780f;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo33026b();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/bytedance/ee/bear/list/folderselect/search/SearchFolderFragment$Companion;", "", "()V", "TAG", "", "newInstance", "Lcom/bytedance/ee/bear/list/folderselect/search/SearchFolderFragment;", "context", "Landroid/content/Context;", "operateBean", "Lcom/bytedance/ee/bear/contract/route/parcelable/DocOperateBean;", "list_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.list.folderselect.search.c$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final SearchFolderFragment mo33027a(Context context, DocOperateBean docOperateBean) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            Intrinsics.checkParameterIsNotNull(docOperateBean, "operateBean");
            Bundle bundle = new Bundle();
            bundle.putParcelable("EXTRA_OPERATE_BEAN", docOperateBean);
            Fragment instantiate = Fragment.instantiate(context, SearchFolderFragment.class.getName(), bundle);
            if (instantiate != null) {
                return (SearchFolderFragment) instantiate;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.bytedance.ee.bear.list.folderselect.search.SearchFolderFragment");
        }
    }

    /* renamed from: c */
    private final void m34962c() {
        DocOperateBean docOperateBean;
        Bundle arguments = getArguments();
        if (arguments == null || (docOperateBean = (DocOperateBean) arguments.getParcelable("EXTRA_OPERATE_BEAN")) == null) {
            docOperateBean = new DocOperateBean();
        }
        this.f22777c = docOperateBean;
    }

    @Override // com.bytedance.ee.bear.list.folderselect.search.SearchFolderPresenter.IDependence
    /* renamed from: a */
    public void mo33023a() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.onBackPressed();
        }
        C10548d.m43696a(getContext());
    }

    /* renamed from: d */
    private final void m34963d() {
        if (getContext() == null) {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                activity.finish();
                return;
            }
            return;
        }
        NetService netService = (NetService) KoinJavaComponent.m268613a(NetService.class, null, null, 6, null);
        Context requireContext = requireContext();
        Intrinsics.checkExpressionValueIsNotNull(requireContext, "requireContext()");
        View view = this.f22776b;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRootView");
        }
        SearchFolderView fVar = new SearchFolderView(requireContext, view, this.f22779e, this.f22777c);
        SearchFolderModel dVar = new SearchFolderModel(this.f22777c, netService);
        Context requireContext2 = requireContext();
        Intrinsics.checkExpressionValueIsNotNull(requireContext2, "requireContext()");
        new SearchFolderPresenter(requireContext2, this, dVar, fVar, this, this.f22777c, this.f22779e).create();
    }

    @Override // com.bytedance.ee.bear.facade.common.C7667e, com.bytedance.ee.bear.facade.common.C7718l, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m34962c();
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        super.onAttach(context);
        if (context instanceof AbstractC8402d) {
            this.f22778d = (AbstractC8402d) context;
        }
    }

    @Override // com.bytedance.ee.bear.list.folderselect.search.SearchFolderPresenter.IDependence
    /* renamed from: a */
    public void mo33025a(Intent intent) {
        Intrinsics.checkParameterIsNotNull(intent, "intent");
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.setResult(-1, intent);
        }
        FragmentActivity activity2 = getActivity();
        if (activity2 != null) {
            activity2.finish();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.onViewCreated(view, bundle);
        m34963d();
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.fragment_search_folder, viewGroup, false);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "inflater.inflate(R.layou…folder, container, false)");
        this.f22776b = inflate;
        if (inflate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRootView");
        }
        return inflate;
    }

    @Override // com.bytedance.ee.bear.list.folderselect.search.SearchFolderPresenter.IDependence
    /* renamed from: a */
    public void mo33024a(int i, String str, String str2, boolean z, int i2, boolean z2, int i3) {
        Intrinsics.checkParameterIsNotNull(str, "destToken");
        Intrinsics.checkParameterIsNotNull(str2, "destName");
        AbstractC8402d dVar = this.f22778d;
        if (dVar != null) {
            dVar.mo32828a(i, str, str2, z, i2, z2, i3);
        }
    }
}
