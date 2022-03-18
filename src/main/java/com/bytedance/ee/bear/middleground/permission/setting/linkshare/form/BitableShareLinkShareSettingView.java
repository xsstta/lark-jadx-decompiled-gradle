package com.bytedance.ee.bear.middleground.permission.setting.linkshare.form;

import android.app.Activity;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ee.bear.contract.AccountService;
import com.bytedance.ee.bear.contract.an;
import com.bytedance.ee.bear.docshost.AbstractC5586d;
import com.bytedance.ee.bear.facade.common.widget.recyclerview.LinearLayoutManagerWrapper;
import com.bytedance.ee.bear.middleground.permission.PermBitableShareAnalytic;
import com.bytedance.ee.bear.middleground.permission.setting.linkshare.C10037k;
import com.bytedance.ee.bear.middleground.permission.setting.linkshare.C10039l;
import com.bytedance.ee.bear.middleground.permission.setting.linkshare.LinkShareItem;
import com.bytedance.ee.bear.middleground.permission.setting.linkshare.form.IBitableShareLinkShareSettingContract;
import com.bytedance.ee.bear.middleground.permission.util.ToCUtil;
import com.bytedance.ee.bear.middleground_permission_export.model.permissionset.BitableSharePermSetInfo;
import com.bytedance.ee.bear.widgets.AbstractC11840f;
import com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e;
import com.bytedance.ee.bear.widgets.BaseTitleBar;
import com.bytedance.ee.bear.widgets.C11824c;
import com.bytedance.ee.log.C13479a;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.larksuite.suite.R;
import com.ss.android.socialbase.downloader.downloader.AbstractC60044a;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.koin.java.KoinJavaComponent;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \"2\u00020\u0001:\u0001\"B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u0018H\u0016J\u0018\u0010\u001a\u001a\u0012\u0012\u0004\u0012\u00020\u001c0\u001bj\b\u0012\u0004\u0012\u00020\u001c`\u001dH\u0002J\b\u0010\u001e\u001a\u00020\u0018H\u0016J\u0010\u0010\u001f\u001a\u00020\u00182\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0012\u0010 \u001a\u00020\u00182\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\b\u0010!\u001a\u00020\u0018H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX.¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0010X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u000e¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/setting/linkshare/form/BitableShareLinkShareSettingView;", "Lcom/bytedance/ee/bear/middleground/permission/setting/linkshare/form/IBitableShareLinkShareSettingContract$IView;", "activity", "Landroid/app/Activity;", "rootView", "Landroid/view/View;", "bitableSharePermSetInfo", "Lcom/bytedance/ee/bear/middleground_permission_export/model/permissionset/BitableSharePermSetInfo;", "(Landroid/app/Activity;Landroid/view/View;Lcom/bytedance/ee/bear/middleground_permission_export/model/permissionset/BitableSharePermSetInfo;)V", "getActivity", "()Landroid/app/Activity;", "adapter", "Lcom/bytedance/ee/bear/middleground/permission/setting/linkshare/LinkShareAdapter;", "getBitableSharePermSetInfo", "()Lcom/bytedance/ee/bear/middleground_permission_export/model/permissionset/BitableSharePermSetInfo;", "currentItem", "", "loadingDialog", "Lcom/bytedance/ee/bear/widgets/LoadingDialog;", "getRootView", "()Landroid/view/View;", "viewDelegate", "Lcom/bytedance/ee/bear/middleground/permission/setting/linkshare/form/IBitableShareLinkShareSettingContract$IView$IViewDelegate;", "create", "", "destroy", "getItems", "Ljava/util/ArrayList;", "Lcom/bytedance/ee/bear/middleground/permission/setting/linkshare/LinkShareItem;", "Lkotlin/collections/ArrayList;", "hideLoading", "setCurrentItem", "setViewDelegate", "showLoading", "Companion", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.middleground.permission.setting.linkshare.a.d */
public final class BitableShareLinkShareSettingView implements IBitableShareLinkShareSettingContract.IView {

    /* renamed from: d */
    public static final Companion f27088d = new Companion(null);

    /* renamed from: a */
    public IBitableShareLinkShareSettingContract.IView.IViewDelegate f27089a;

    /* renamed from: b */
    public C10037k f27090b;

    /* renamed from: c */
    public int f27091c;

    /* renamed from: e */
    private C11824c f27092e;

    /* renamed from: f */
    private final Activity f27093f;

    /* renamed from: g */
    private final View f27094g;

    /* renamed from: h */
    private final BitableSharePermSetInfo f27095h;

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/setting/linkshare/form/BitableShareLinkShareSettingView$Companion;", "", "()V", "TAG", "", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.setting.linkshare.a.d$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: c */
    public final Activity mo38327c() {
        return this.f27093f;
    }

    @Override // com.bytedance.ee.bear.middleground.permission.setting.linkshare.form.IBitableShareLinkShareSettingContract.IView
    /* renamed from: b */
    public void mo38326b() {
        C11824c cVar = this.f27092e;
        if (cVar != null) {
            cVar.mo45303c();
        }
    }

    @Override // com.bytedance.ee.bear.middleground.permission.setting.linkshare.form.IBitableShareLinkShareSettingContract.IView
    /* renamed from: a */
    public void mo38323a() {
        if (this.f27092e == null) {
            this.f27092e = new C11824c(this.f27093f);
        }
        C11824c cVar = this.f27092e;
        if (cVar != null) {
            cVar.mo45304d();
        }
    }

    /* renamed from: d */
    private final ArrayList<LinkShareItem> m41703d() {
        boolean z;
        AccountService.Account f = ((an) KoinJavaComponent.m268613a(an.class, null, null, 6, null)).mo16408f();
        boolean a = ((AbstractC5586d) KoinJavaComponent.m268613a(AbstractC5586d.class, null, null, 6, null)).mo22259a();
        boolean b = ToCUtil.f26828a.mo37760b(f);
        boolean z2 = false;
        if (b || a) {
            z = true;
        } else {
            z = false;
        }
        ArrayList<LinkShareItem> arrayListOf = CollectionsKt.arrayListOf(C10039l.m41787b(this.f27093f, 9));
        if (!z) {
            arrayListOf.add(C10039l.m41787b(this.f27093f, 10));
        }
        arrayListOf.add(C10039l.m41787b(this.f27093f, 11));
        StringBuilder sb = new StringBuilder();
        sb.append("account == null: ");
        if (f == null) {
            z2 = true;
        }
        sb.append(z2);
        sb.append(", ");
        sb.append("hideOrgItem = ");
        sb.append(z);
        sb.append(", ");
        sb.append("isConsumer = ");
        sb.append(b);
        sb.append(", ");
        sb.append("canRemoveOrg = ");
        sb.append(a);
        sb.append(", ");
        C13479a.m54764b("BitableShareLinkShareSettingView", sb.toString());
        return arrayListOf;
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        ((BaseTitleBar) this.f27094g.findViewById(R.id.share_link_title)).setTitle(R.string.Bitable_Form_PermissionSettings);
        ((BaseTitleBar) this.f27094g.findViewById(R.id.share_link_title)).setLeftClickListener(new C10022b(this));
        C10037k kVar = new C10037k(this.f27093f, m41703d());
        this.f27090b = kVar;
        if (kVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
        }
        kVar.mo70668a((BaseQuickAdapter.AbstractC20911a) new C10023c(this));
        RecyclerView recyclerView = (RecyclerView) this.f27094g.findViewById(R.id.share_link_share_list);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView, "rootView.share_link_share_list");
        recyclerView.setLayoutManager(new LinearLayoutManagerWrapper(this.f27093f));
        RecyclerView recyclerView2 = (RecyclerView) this.f27094g.findViewById(R.id.share_link_share_list);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView2, "rootView.share_link_share_list");
        C10037k kVar2 = this.f27090b;
        if (kVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
        }
        recyclerView2.setAdapter(kVar2);
        mo38324a(C10039l.m41785a(this.f27095h.mo38779a()));
    }

    /* renamed from: a */
    public void setViewDelegate(IBitableShareLinkShareSettingContract.IView.IViewDelegate aVar) {
        this.f27089a = aVar;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0014¨\u0006\u0006"}, d2 = {"com/bytedance/ee/bear/middleground/permission/setting/linkshare/form/BitableShareLinkShareSettingView$create$1", "Lcom/bytedance/ee/bear/widgets/SafeClickListener;", "onClicked", "", "v", "Landroid/view/View;", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.setting.linkshare.a.d$b */
    public static final class C10022b extends AbstractView$OnClickListenerC11839e {

        /* renamed from: a */
        final /* synthetic */ BitableShareLinkShareSettingView f27096a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C10022b(BitableShareLinkShareSettingView dVar) {
            this.f27096a = dVar;
        }

        /* access modifiers changed from: protected */
        @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
        /* renamed from: a */
        public void mo16698a(View view) {
            PermBitableShareAnalytic.f25618a.mo36531e();
            this.f27096a.mo38327c().finish();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J,\u0010\u0002\u001a\u00020\u00032\u0010\u0010\u0004\u001a\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\tH\u0014¨\u0006\n"}, d2 = {"com/bytedance/ee/bear/middleground/permission/setting/linkshare/form/BitableShareLinkShareSettingView$create$2", "Lcom/bytedance/ee/bear/widgets/SafeOnItemClickListener;", "onItemClicked", "", AbstractC60044a.f149675a, "Lcom/chad/library/adapter/base/BaseQuickAdapter;", "view", "Landroid/view/View;", "position", "", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.setting.linkshare.a.d$c */
    public static final class C10023c extends AbstractC11840f {

        /* renamed from: a */
        final /* synthetic */ BitableShareLinkShareSettingView f27097a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C10023c(BitableShareLinkShareSettingView dVar) {
            this.f27097a = dVar;
        }

        /* access modifiers changed from: protected */
        @Override // com.bytedance.ee.bear.widgets.AbstractC11840f
        /* renamed from: a */
        public void mo38328a(BaseQuickAdapter<?, ?> baseQuickAdapter, View view, int i) {
            IBitableShareLinkShareSettingContract.IView.IViewDelegate aVar = this.f27097a.f27089a;
            if (aVar != null) {
                aVar.mo38315a((LinkShareItem) BitableShareLinkShareSettingView.m41702a(this.f27097a).mo70685d(i), this.f27097a.f27091c);
            }
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ C10037k m41702a(BitableShareLinkShareSettingView dVar) {
        C10037k kVar = dVar.f27090b;
        if (kVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
        }
        return kVar;
    }

    @Override // com.bytedance.ee.bear.middleground.permission.setting.linkshare.form.IBitableShareLinkShareSettingContract.IView
    /* renamed from: a */
    public void mo38324a(int i) {
        this.f27091c = i;
        C10037k kVar = this.f27090b;
        if (kVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
        }
        kVar.mo33373b(i);
        C10037k kVar2 = this.f27090b;
        if (kVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
        }
        kVar2.notifyDataSetChanged();
    }

    public BitableShareLinkShareSettingView(Activity activity, View view, BitableSharePermSetInfo bitableSharePermSetInfo) {
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        Intrinsics.checkParameterIsNotNull(view, "rootView");
        Intrinsics.checkParameterIsNotNull(bitableSharePermSetInfo, "bitableSharePermSetInfo");
        this.f27093f = activity;
        this.f27094g = view;
        this.f27095h = bitableSharePermSetInfo;
    }
}
