package com.bytedance.ee.bear.middleground.permission.collaborator.manager.doc.singlepage;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.Group;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.ee.bear.facade.common.widget.MainViewPager;
import com.bytedance.ee.bear.middleground.permission.collaborator.invite.C9706c;
import com.bytedance.ee.bear.middleground.permission.collaborator.manager.doc.singlepage.DocCollaboratorManagerContract;
import com.bytedance.ee.bear.middleground.permission.lock.LockBannerView;
import com.bytedance.ee.bear.middleground_permission_export.model.permissionset.DocPermSetInfo;
import com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e;
import com.bytedance.ee.bear.widgets.BaseTitleBar;
import com.larksuite.suite.R;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\b\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0012H\u0016J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0012H\u0002J\b\u0010\u0017\u001a\u00020\u0012H\u0016J\b\u0010\u0018\u001a\u00020\u0012H\u0016J\b\u0010\u0019\u001a\u00020\u0012H\u0002J\b\u0010\u001a\u001a\u00020\u0012H\u0002J\b\u0010\u001b\u001a\u00020\u0012H\u0002J\u0010\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\u0015H\u0016J \u0010\u001e\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020\u00152\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0015H\u0016J\u0010\u0010#\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020\u0015H\u0016J\u0010\u0010$\u001a\u00020\u00122\u0006\u0010%\u001a\u00020\u0015H\u0002J\u0010\u0010&\u001a\u00020\u00122\u0006\u0010'\u001a\u00020\u0015H\u0016J\u0012\u0010(\u001a\u00020\u00122\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016J\b\u0010)\u001a\u00020\u0012H\u0002J\b\u0010*\u001a\u00020\u0012H\u0016J \u0010*\u001a\u00020\u00122\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u000200H\u0016J\b\u00101\u001a\u00020\u0012H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u000bj\b\u0012\u0004\u0012\u00020\u0004`\fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X.¢\u0006\u0002\n\u0000¨\u00062"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/collaborator/manager/doc/singlepage/DocCollaboratorManagerView;", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/manager/doc/singlepage/DocCollaboratorManagerContract$IView;", "Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;", "fragment", "Landroidx/fragment/app/Fragment;", "rootView", "Landroid/view/View;", "permSetInfo", "Lcom/bytedance/ee/bear/middleground_permission_export/model/permissionset/DocPermSetInfo;", "(Landroidx/fragment/app/Fragment;Landroid/view/View;Lcom/bytedance/ee/bear/middleground_permission_export/model/permissionset/DocPermSetInfo;)V", "tabs", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "viewDelegate", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/manager/doc/singlepage/DocCollaboratorManagerContract$IView$IViewDelegate;", "viewPageAdapter", "Landroidx/fragment/app/FragmentPagerAdapter;", "create", "", "destroy", "getCurrentTabIndex", "", "hideIndicator", "hideLockBanner", "hideSinglePageTab", "initIndicator", "initTitleBar", "initViewPager", "onPageScrollStateChanged", "state", "onPageScrolled", "position", "positionOffset", "", "positionOffsetPixels", "onPageSelected", "onTabSelected", "index", "setTitle", "count", "setViewDelegate", "showIndicator", "showLockBanner", "tips", "", "canUnlock", "", "clickListener", "Landroid/view/View$OnClickListener;", "showSinglePageTab", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.manager.b.a.e */
public final class DocCollaboratorManagerView implements ViewPager.OnPageChangeListener, DocCollaboratorManagerContract.IView {

    /* renamed from: a */
    public DocCollaboratorManagerContract.IView.IViewDelegate f26335a;

    /* renamed from: b */
    public ArrayList<Fragment> f26336b = new ArrayList<>();

    /* renamed from: c */
    private FragmentPagerAdapter f26337c;

    /* renamed from: d */
    private Fragment f26338d;

    /* renamed from: e */
    private final View f26339e;

    /* renamed from: f */
    private final DocPermSetInfo f26340f;

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrollStateChanged(int i) {
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrolled(int i, float f, int i2) {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0003H\u0016¨\u0006\u0007"}, d2 = {"com/bytedance/ee/bear/middleground/permission/collaborator/manager/doc/singlepage/DocCollaboratorManagerView$initViewPager$1", "Landroidx/fragment/app/FragmentPagerAdapter;", "getCount", "", "getItem", "Landroidx/fragment/app/Fragment;", "position", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.manager.b.a.e$e */
    public static final class C9768e extends FragmentPagerAdapter {

        /* renamed from: a */
        final /* synthetic */ DocCollaboratorManagerView f26345a;

        @Override // androidx.viewpager.widget.PagerAdapter
        public int getCount() {
            return this.f26345a.f26336b.size();
        }

        @Override // androidx.fragment.app.FragmentPagerAdapter
        public Fragment getItem(int i) {
            Fragment fragment = this.f26345a.f26336b.get(i);
            Intrinsics.checkExpressionValueIsNotNull(fragment, "tabs[position]");
            return fragment;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C9768e(DocCollaboratorManagerView eVar, FragmentManager fragmentManager) {
            super(fragmentManager);
            this.f26345a = eVar;
        }
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.manager.doc.singlepage.DocCollaboratorManagerContract.IView
    /* renamed from: a */
    public void mo37221a() {
        ((LockBannerView) this.f26339e.findViewById(R.id.lockBanner)).mo37769b();
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.manager.doc.singlepage.DocCollaboratorManagerContract.IView
    /* renamed from: b */
    public void mo37224b() {
        ((LockBannerView) this.f26339e.findViewById(R.id.lockBanner)).mo37767a();
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        m40405f();
        m40406g();
        m40407h();
        mo37253b(0);
    }

    /* renamed from: i */
    private final void m40408i() {
        Group group = (Group) this.f26339e.findViewById(R.id.indicatorGroup);
        Intrinsics.checkExpressionValueIsNotNull(group, "rootView.indicatorGroup");
        group.setVisibility(0);
    }

    /* renamed from: j */
    private final void m40409j() {
        Group group = (Group) this.f26339e.findViewById(R.id.indicatorGroup);
        Intrinsics.checkExpressionValueIsNotNull(group, "rootView.indicatorGroup");
        group.setVisibility(8);
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.manager.doc.singlepage.DocCollaboratorManagerContract.IView
    /* renamed from: e */
    public int mo37227e() {
        MainViewPager mainViewPager = (MainViewPager) this.f26339e.findViewById(R.id.viewPager);
        Intrinsics.checkExpressionValueIsNotNull(mainViewPager, "rootView.viewPager");
        return mainViewPager.getCurrentItem();
    }

    /* renamed from: g */
    private final void m40406g() {
        ((TextView) this.f26339e.findViewById(R.id.containerTabText)).setOnClickListener(new C9764a(this));
        ((TextView) this.f26339e.findViewById(R.id.singlePermTabText)).setOnClickListener(new C9765b(this));
        m40409j();
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.manager.doc.singlepage.DocCollaboratorManagerContract.IView
    /* renamed from: c */
    public void mo37225c() {
        m40409j();
        mo37253b(0);
        ((MainViewPager) this.f26339e.findViewById(R.id.viewPager)).setCanScroll(false);
        for (T t : this.f26336b) {
            if (t instanceof IDocCollaboratorSubViewController) {
                t.mo37271a(false);
            }
        }
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.manager.doc.singlepage.DocCollaboratorManagerContract.IView
    /* renamed from: d */
    public void mo37226d() {
        m40408i();
        ((MainViewPager) this.f26339e.findViewById(R.id.viewPager)).setCanScroll(true);
        for (T t : this.f26336b) {
            if (t instanceof IDocCollaboratorSubViewController) {
                t.mo37271a(true);
            }
        }
    }

    /* renamed from: f */
    private final void m40405f() {
        ((BaseTitleBar) this.f26339e.findViewById(R.id.titleBar)).setLeftClickListener(new C9766c(this));
        ((BaseTitleBar) this.f26339e.findViewById(R.id.titleBar)).setActionIconTint(R.color.icon_n1);
        ((BaseTitleBar) this.f26339e.findViewById(R.id.titleBar)).mo45070a(new C9767d(this, R.drawable.ud_icon_member_add_outlined));
        ((BaseTitleBar) this.f26339e.findViewById(R.id.titleBar)).setTitle(R.string.Doc_Permission_Collaborators);
    }

    /* renamed from: h */
    private final void m40407h() {
        this.f26336b.add(DocCollaboratorSubFragment.f26346a.mo37272a(1, this.f26340f));
        this.f26336b.add(DocCollaboratorSubFragment.f26346a.mo37272a(2, this.f26340f));
        this.f26337c = new C9768e(this, this.f26338d.getChildFragmentManager());
        MainViewPager mainViewPager = (MainViewPager) this.f26339e.findViewById(R.id.viewPager);
        Intrinsics.checkExpressionValueIsNotNull(mainViewPager, "rootView.viewPager");
        FragmentPagerAdapter fragmentPagerAdapter = this.f26337c;
        if (fragmentPagerAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewPageAdapter");
        }
        mainViewPager.setAdapter(fragmentPagerAdapter);
        ((MainViewPager) this.f26339e.findViewById(R.id.viewPager)).addOnPageChangeListener(this);
    }

    /* renamed from: a */
    public void setViewDelegate(DocCollaboratorManagerContract.IView.IViewDelegate aVar) {
        this.f26335a = aVar;
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageSelected(int i) {
        mo37253b(i);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0014¨\u0006\u0006"}, d2 = {"com/bytedance/ee/bear/middleground/permission/collaborator/manager/doc/singlepage/DocCollaboratorManagerView$initIndicator$1", "Lcom/bytedance/ee/bear/widgets/SafeClickListener;", "onClicked", "", "v", "Landroid/view/View;", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.manager.b.a.e$a */
    public static final class C9764a extends AbstractView$OnClickListenerC11839e {

        /* renamed from: a */
        final /* synthetic */ DocCollaboratorManagerView f26341a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C9764a(DocCollaboratorManagerView eVar) {
            this.f26341a = eVar;
        }

        /* access modifiers changed from: protected */
        @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
        /* renamed from: a */
        public void mo16698a(View view) {
            this.f26341a.mo37253b(0);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0014¨\u0006\u0006"}, d2 = {"com/bytedance/ee/bear/middleground/permission/collaborator/manager/doc/singlepage/DocCollaboratorManagerView$initIndicator$2", "Lcom/bytedance/ee/bear/widgets/SafeClickListener;", "onClicked", "", "v", "Landroid/view/View;", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.manager.b.a.e$b */
    public static final class C9765b extends AbstractView$OnClickListenerC11839e {

        /* renamed from: a */
        final /* synthetic */ DocCollaboratorManagerView f26342a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C9765b(DocCollaboratorManagerView eVar) {
            this.f26342a = eVar;
        }

        /* access modifiers changed from: protected */
        @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
        /* renamed from: a */
        public void mo16698a(View view) {
            this.f26342a.mo37253b(1);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0014¨\u0006\u0006"}, d2 = {"com/bytedance/ee/bear/middleground/permission/collaborator/manager/doc/singlepage/DocCollaboratorManagerView$initTitleBar$1", "Lcom/bytedance/ee/bear/widgets/SafeClickListener;", "onClicked", "", "v", "Landroid/view/View;", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.manager.b.a.e$c */
    public static final class C9766c extends AbstractView$OnClickListenerC11839e {

        /* renamed from: a */
        final /* synthetic */ DocCollaboratorManagerView f26343a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C9766c(DocCollaboratorManagerView eVar) {
            this.f26343a = eVar;
        }

        /* access modifiers changed from: protected */
        @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
        /* renamed from: a */
        public void mo16698a(View view) {
            DocCollaboratorManagerContract.IView.IViewDelegate aVar = this.f26343a.f26335a;
            if (aVar != null) {
                aVar.mo37228a();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/bytedance/ee/bear/middleground/permission/collaborator/manager/doc/singlepage/DocCollaboratorManagerView$initTitleBar$2", "Lcom/bytedance/ee/bear/widgets/BaseTitleBar$ImageAction;", "performAction", "", "view", "Landroid/view/View;", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.manager.b.a.e$d */
    public static final class C9767d extends BaseTitleBar.C11803d {

        /* renamed from: a */
        final /* synthetic */ DocCollaboratorManagerView f26344a;

        @Override // com.bytedance.ee.bear.widgets.BaseTitleBar.AbstractC11800a, com.bytedance.ee.bear.widgets.BaseTitleBar.C11801b
        /* renamed from: a */
        public void mo16854a(View view) {
            super.mo16854a(view);
            DocCollaboratorManagerContract.IView.IViewDelegate aVar = this.f26344a.f26335a;
            if (aVar != null) {
                aVar.mo37229b();
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C9767d(DocCollaboratorManagerView eVar, int i) {
            super(i);
            this.f26344a = eVar;
        }
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.manager.doc.singlepage.DocCollaboratorManagerContract.IView
    /* renamed from: a */
    public void mo37222a(int i) {
        ((BaseTitleBar) this.f26339e.findViewById(R.id.titleBar)).setTitle(C9706c.m40178a(this.f26339e.getContext(), i));
    }

    /* renamed from: b */
    public final void mo37253b(int i) {
        boolean z;
        int i2;
        int i3;
        Context context = this.f26339e.getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "rootView.context");
        int color = context.getResources().getColor(R.color.primary_pri_500);
        Context context2 = this.f26339e.getContext();
        Intrinsics.checkExpressionValueIsNotNull(context2, "rootView.context");
        int color2 = context2.getResources().getColor(R.color.text_caption);
        int i4 = 0;
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        TextView textView = (TextView) this.f26339e.findViewById(R.id.containerTabText);
        if (z) {
            i2 = color;
        } else {
            i2 = color2;
        }
        textView.setTextColor(i2);
        TextView textView2 = (TextView) this.f26339e.findViewById(R.id.singlePermTabText);
        if (z) {
            color = color2;
        }
        textView2.setTextColor(color);
        ImageView imageView = (ImageView) this.f26339e.findViewById(R.id.containerIndicator);
        Intrinsics.checkExpressionValueIsNotNull(imageView, "rootView.containerIndicator");
        if (z) {
            i3 = 0;
        } else {
            i3 = 4;
        }
        imageView.setVisibility(i3);
        ImageView imageView2 = (ImageView) this.f26339e.findViewById(R.id.singlePageIndicator);
        Intrinsics.checkExpressionValueIsNotNull(imageView2, "rootView.singlePageIndicator");
        if (z) {
            i4 = 4;
        }
        imageView2.setVisibility(i4);
        MainViewPager mainViewPager = (MainViewPager) this.f26339e.findViewById(R.id.viewPager);
        Intrinsics.checkExpressionValueIsNotNull(mainViewPager, "rootView.viewPager");
        mainViewPager.setCurrentItem(i);
    }

    public DocCollaboratorManagerView(Fragment fragment, View view, DocPermSetInfo docPermSetInfo) {
        Intrinsics.checkParameterIsNotNull(fragment, "fragment");
        Intrinsics.checkParameterIsNotNull(view, "rootView");
        Intrinsics.checkParameterIsNotNull(docPermSetInfo, "permSetInfo");
        this.f26338d = fragment;
        this.f26339e = view;
        this.f26340f = docPermSetInfo;
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.manager.doc.singlepage.DocCollaboratorManagerContract.IView
    /* renamed from: a */
    public void mo37223a(String str, boolean z, View.OnClickListener onClickListener) {
        Intrinsics.checkParameterIsNotNull(str, "tips");
        Intrinsics.checkParameterIsNotNull(onClickListener, "clickListener");
        ((LockBannerView) this.f26339e.findViewById(R.id.lockBanner)).mo37768a(str, z, onClickListener);
    }
}
