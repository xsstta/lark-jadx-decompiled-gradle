package com.ss.android.lark.moments.impl.categoryedit;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.ViewModelLazy;
import androidx.swiperefreshlayout.widget.CircularProgressDrawable;
import com.bytedance.lark.pb.moments.v1.Tab;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.framework.utils.DeviceUtils;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.base.activity.ActivityAnimationManager;
import com.ss.android.lark.base.fragment.BaseFragmentActivity;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.moments.impl.categorydetail.MomentsCategoryDetailActivity;
import com.ss.android.lark.moments.impl.categoryedit.CategoryDragLayout;
import com.ss.android.lark.moments.impl.categoryedit.OnClickTabItemListener;
import com.ss.android.lark.moments.impl.common.span.FakeBoldSpan;
import com.ss.android.lark.moments.impl.common.utils.C47282k;
import com.ss.android.lark.moments.impl.common.utils.SpinDrawableUtils;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.ui.CommonTitleBarConstants;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.listener.OnSingleClickListener;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000W\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0004\u0018\u0000 '2\u00020\u0001:\u0001'B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u001e\u001a\u00020\u001fH\u0016J\b\u0010 \u001a\u00020\u001fH\u0016J\b\u0010!\u001a\u00020\"H\u0002J\u0012\u0010#\u001a\u00020\"2\b\u0010$\u001a\u0004\u0018\u00010%H\u0014J\b\u0010&\u001a\u00020\"H\u0002R\u0010\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0004\n\u0002\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\n\u001a\u00020\u000b8BX\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0014\u001a\u00020\u00158BX\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u000f\u001a\u0004\b\u0016\u0010\u0017R\u001b\u0010\u0019\u001a\u00020\u001a8BX\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u000f\u001a\u0004\b\u001b\u0010\u001c¨\u0006("}, d2 = {"Lcom/ss/android/lark/moments/impl/categoryedit/MomentsCategoryEditActivity;", "Lcom/ss/android/lark/base/fragment/BaseFragmentActivity;", "()V", "clickTabListener", "com/ss/android/lark/moments/impl/categoryedit/MomentsCategoryEditActivity$clickTabListener$1", "Lcom/ss/android/lark/moments/impl/categoryedit/MomentsCategoryEditActivity$clickTabListener$1;", "gridBinder", "Lcom/ss/android/lark/moments/impl/categoryedit/MomentsCategoryGridBinder;", "isEditing", "", "loadingDrawable", "Landroidx/swiperefreshlayout/widget/CircularProgressDrawable;", "getLoadingDrawable", "()Landroidx/swiperefreshlayout/widget/CircularProgressDrawable;", "loadingDrawable$delegate", "Lkotlin/Lazy;", "resultIntent", "Landroid/content/Intent;", "getResultIntent", "()Landroid/content/Intent;", "suffixHandler", "Lcom/ss/android/lark/moments/impl/categoryedit/LoadingTextHandler;", "getSuffixHandler", "()Lcom/ss/android/lark/moments/impl/categoryedit/LoadingTextHandler;", "suffixHandler$delegate", "vm", "Lcom/ss/android/lark/moments/impl/categoryedit/MomentsEditCategoryViewModel;", "getVm", "()Lcom/ss/android/lark/moments/impl/categoryedit/MomentsEditCategoryViewModel;", "vm$delegate", "getEnterAnimationConfig", "Lcom/ss/android/lark/base/activity/ActivityAnimationManager$AnimationConfig;", "getExitAnimationConfig", "initEvent", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onEditClicked", "Companion", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class MomentsCategoryEditActivity extends BaseFragmentActivity {

    /* renamed from: a */
    public static final Companion f119206a = new Companion(null);

    /* renamed from: b */
    private final Lazy f119207b = new ViewModelLazy(Reflection.getOrCreateKotlinClass(MomentsEditCategoryViewModel.class), new MomentsCategoryEditActivity$$special$$inlined$viewModels$2(this), new MomentsCategoryEditActivity$$special$$inlined$viewModels$1(this));

    /* renamed from: c */
    private final Lazy f119208c = LazyKt.lazy(new C47262e(this));

    /* renamed from: d */
    private boolean f119209d;

    /* renamed from: e */
    private MomentsCategoryGridBinder f119210e = new MomentsCategoryGridBinder();

    /* renamed from: f */
    private final Lazy f119211f = LazyKt.lazy(new C47268k(this));

    /* renamed from: g */
    private final Intent f119212g = new Intent();

    /* renamed from: h */
    private final C47259b f119213h = new C47259b(this);

    /* renamed from: i */
    private HashMap f119214i;

    /* renamed from: a */
    public Context mo166114a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public View mo166115a(int i) {
        if (this.f119214i == null) {
            this.f119214i = new HashMap();
        }
        View view = (View) this.f119214i.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f119214i.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: a */
    public final MomentsEditCategoryViewModel mo166116a() {
        return (MomentsEditCategoryViewModel) this.f119207b.getValue();
    }

    /* renamed from: a */
    public void mo166117a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m187165a(this, context);
    }

    /* renamed from: b */
    public final CircularProgressDrawable mo166118b() {
        return (CircularProgressDrawable) this.f119208c.getValue();
    }

    /* renamed from: c */
    public final LoadingTextHandler mo166119c() {
        return (LoadingTextHandler) this.f119211f.getValue();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m187163a(this, configuration);
    }

    /* renamed from: f */
    public Resources mo166123f() {
        return super.getResources();
    }

    /* renamed from: g */
    public void mo166124g() {
        super.onStop();
    }

    public AssetManager getAssets() {
        return m187167c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m187164a(this);
    }

    /* renamed from: h */
    public AssetManager mo166126h() {
        return super.getAssets();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m187166b(this);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J$\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0011\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tXT¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/ss/android/lark/moments/impl/categoryedit/MomentsCategoryEditActivity$Companion;", "", "()V", "KEY_CLICKED_ID", "", "KEY_CURRENT_SELECTED_ID", "KEY_ORDERED_TABS", "KEY_SELECTED_TABS", "REQUEST_CODE_EDIT_CATEGORY", "", "startCategoryEditActivity", "", "frag", "Landroidx/fragment/app/Fragment;", "tabs", "", "Lcom/bytedance/lark/pb/moments/v1/Tab;", "currentTabId", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.categoryedit.MomentsCategoryEditActivity$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo166127a(Fragment fragment, List<Tab> list, String str) {
            Intrinsics.checkParameterIsNotNull(fragment, "frag");
            Intrinsics.checkParameterIsNotNull(list, "tabs");
            Intrinsics.checkParameterIsNotNull(str, "currentTabId");
            Intent intent = new Intent(fragment.getContext(), MomentsCategoryEditActivity.class);
            Bundle bundle = new Bundle();
            bundle.putSerializable("key_selected_tabs", new ArrayList(list));
            bundle.putString("key_current_selected_id", str);
            Intent putExtras = intent.putExtras(bundle);
            Intrinsics.checkExpressionValueIsNotNull(putExtras, "Intent(frag.context, Mom…rentTabId)\n            })");
            C47282k.m187260a(fragment, putExtras, 1879);
        }
    }

    /* renamed from: d */
    public final Intent mo166121d() {
        return this.f119212g;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0016J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\t\u001a\u00020\u0003H\u0016J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\fH\u0016¨\u0006\r"}, d2 = {"com/ss/android/lark/moments/impl/categoryedit/MomentsCategoryEditActivity$clickTabListener$1", "Lcom/ss/android/lark/moments/impl/categoryedit/OnClickTabItemListener;", "onClickMoreTab", "", "id", "", "name", "iconKey", "onClickMyTab", "onEditClicked", "setMoreSubTitleVisible", "visibility", "", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.categoryedit.MomentsCategoryEditActivity$b */
    public static final class C47259b implements OnClickTabItemListener {

        /* renamed from: a */
        final /* synthetic */ MomentsCategoryEditActivity f119215a;

        @Override // com.ss.android.lark.moments.impl.categoryedit.OnClickTabItemListener
        /* renamed from: a */
        public void mo166108a() {
            this.f119215a.mo166122e();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C47259b(MomentsCategoryEditActivity momentsCategoryEditActivity) {
            this.f119215a = momentsCategoryEditActivity;
        }

        @Override // com.ss.android.lark.moments.impl.categoryedit.OnClickTabItemListener
        /* renamed from: a */
        public void mo166110a(CategoryItemView aVar) {
            Intrinsics.checkParameterIsNotNull(aVar, "view");
            OnClickTabItemListener.C47278a.m187214a(this, aVar);
        }

        @Override // com.ss.android.lark.moments.impl.categoryedit.OnClickTabItemListener
        /* renamed from: a */
        public void mo166109a(int i) {
            TextView textView = (TextView) this.f119215a.mo166115a(R.id.tvMoreCategorySubtitle);
            Intrinsics.checkExpressionValueIsNotNull(textView, "tvMoreCategorySubtitle");
            textView.setVisibility(i);
        }

        @Override // com.ss.android.lark.moments.impl.categoryedit.OnClickTabItemListener
        /* renamed from: a */
        public void mo166111a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "id");
            if (Intrinsics.areEqual((Object) this.f119215a.mo166116a().getForceRefresh().mo5927b(), (Object) true)) {
                ArrayList<Tab> childrenData = ((CategoryDragLayout) this.f119215a.mo166115a(R.id.selectedDragLayout)).getChildrenData();
                MomentsCategoryEditActivity momentsCategoryEditActivity = this.f119215a;
                momentsCategoryEditActivity.setResult(-1, momentsCategoryEditActivity.mo166121d().putExtra("key_ordered_tabs", childrenData));
            }
            MomentsCategoryEditActivity momentsCategoryEditActivity2 = this.f119215a;
            momentsCategoryEditActivity2.setResult(-1, momentsCategoryEditActivity2.mo166121d().putExtra("key_clicked_id", str));
            this.f119215a.finish();
        }

        @Override // com.ss.android.lark.moments.impl.categoryedit.OnClickTabItemListener
        /* renamed from: a */
        public void mo166112a(String str, String str2, String str3) {
            Intrinsics.checkParameterIsNotNull(str, "id");
            Intrinsics.checkParameterIsNotNull(str2, "name");
            Intrinsics.checkParameterIsNotNull(str3, "iconKey");
            MomentsCategoryDetailActivity.f119067d.mo165974a(this.f119215a, str, str2, str3);
        }

        @Override // com.ss.android.lark.moments.impl.categoryedit.OnClickTabItemListener
        /* renamed from: a */
        public boolean mo166113a(View view, boolean z, boolean z2) {
            Intrinsics.checkParameterIsNotNull(view, "v");
            return OnClickTabItemListener.C47278a.m187215a(this, view, z, z2);
        }
    }

    @Override // com.ss.android.lark.base.fragment.BaseFragmentActivity
    public ActivityAnimationManager.AnimationConfig getEnterAnimationConfig() {
        return new ActivityAnimationManager.AnimationConfig(ActivityAnimationManager.ANIM_SLIDE_UP_IN);
    }

    @Override // com.ss.android.lark.base.fragment.BaseFragmentActivity
    public ActivityAnimationManager.AnimationConfig getExitAnimationConfig() {
        return new ActivityAnimationManager.AnimationConfig(ActivityAnimationManager.ANIM_SLIDE_BOTTOM_OUT);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroidx/swiperefreshlayout/widget/CircularProgressDrawable;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.categoryedit.MomentsCategoryEditActivity$e */
    static final class C47262e extends Lambda implements Function0<CircularProgressDrawable> {
        final /* synthetic */ MomentsCategoryEditActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47262e(MomentsCategoryEditActivity momentsCategoryEditActivity) {
            super(0);
            this.this$0 = momentsCategoryEditActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final CircularProgressDrawable invoke() {
            return SpinDrawableUtils.f119255a.mo166216a(this.this$0, UIHelper.getColor(R.color.primary_pri_500), UIHelper.dp2px(6.0f), UIHelper.dp2px(2.0f));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/moments/impl/categoryedit/LoadingTextHandler;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.categoryedit.MomentsCategoryEditActivity$k */
    static final class C47268k extends Lambda implements Function0<LoadingTextHandler> {
        final /* synthetic */ MomentsCategoryEditActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47268k(MomentsCategoryEditActivity momentsCategoryEditActivity) {
            super(0);
            this.this$0 = momentsCategoryEditActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final LoadingTextHandler invoke() {
            TextView textView = (TextView) this.this$0.mo166115a(R.id.tvMoreCategorySubtitle);
            Intrinsics.checkExpressionValueIsNotNull(textView, "tvMoreCategorySubtitle");
            String string = UIUtils.getString(this.this$0, R.string.Lark_Community_LoadingToast);
            Intrinsics.checkExpressionValueIsNotNull(string, "UIUtils.getString(this, …k_Community_LoadingToast)");
            return new LoadingTextHandler(textView, string);
        }
    }

    /* renamed from: i */
    private final void m187168i() {
        ((CategoryDragLayout) mo166115a(R.id.selectedDragLayout)).setOnDragItemClickListener(new C47260c(this));
        ((CategoryDragLayout) mo166115a(R.id.unSelectedDragLayout)).setOnDragItemClickListener(new C47261d(this));
    }

    /* renamed from: e */
    public final void mo166122e() {
        if (this.f119209d) {
            ImageView imageView = (ImageView) mo166115a(R.id.ivLoading);
            Intrinsics.checkExpressionValueIsNotNull(imageView, "ivLoading");
            imageView.setVisibility(0);
            mo166118b().start();
            TextView textView = (TextView) mo166115a(R.id.tvEdit);
            Intrinsics.checkExpressionValueIsNotNull(textView, "tvEdit");
            textView.setVisibility(8);
            ((CategoryDragLayout) mo166115a(R.id.selectedDragLayout)).mo166093c();
            ((CategoryDragLayout) mo166115a(R.id.unSelectedDragLayout)).mo166093c();
            TextView textView2 = (TextView) mo166115a(R.id.tvMyCategorySubtitle);
            Intrinsics.checkExpressionValueIsNotNull(textView2, "tvMyCategorySubtitle");
            textView2.setVisibility(8);
            TextView textView3 = (TextView) mo166115a(R.id.tvMoreCategorySubtitle);
            Intrinsics.checkExpressionValueIsNotNull(textView3, "tvMoreCategorySubtitle");
            textView3.setVisibility(8);
            CategoryDragLayout categoryDragLayout = (CategoryDragLayout) mo166115a(R.id.unSelectedDragLayout);
            Intrinsics.checkExpressionValueIsNotNull(categoryDragLayout, "unSelectedDragLayout");
            if (categoryDragLayout.getChildCount() <= 0) {
                TextView textView4 = (TextView) mo166115a(R.id.tvMoreCategory);
                Intrinsics.checkExpressionValueIsNotNull(textView4, "tvMoreCategory");
                textView4.setVisibility(8);
                TextView textView5 = (TextView) mo166115a(R.id.tvMoreCategorySubtitle);
                Intrinsics.checkExpressionValueIsNotNull(textView5, "tvMoreCategorySubtitle");
                textView5.setVisibility(8);
            }
            mo166116a().saveTabsOrder(((CategoryDragLayout) mo166115a(R.id.selectedDragLayout)).getChildrenTabIds());
        } else {
            TextView textView6 = (TextView) mo166115a(R.id.tvEdit);
            Intrinsics.checkExpressionValueIsNotNull(textView6, "tvEdit");
            MomentsCategoryEditActivity momentsCategoryEditActivity = this;
            textView6.setText(UIUtils.getString(momentsCategoryEditActivity, R.string.Lark_Community_Done));
            ((CategoryDragLayout) mo166115a(R.id.selectedDragLayout)).mo166092b();
            ((CategoryDragLayout) mo166115a(R.id.unSelectedDragLayout)).mo166092b();
            TextView textView7 = (TextView) mo166115a(R.id.tvMyCategorySubtitle);
            Intrinsics.checkExpressionValueIsNotNull(textView7, "tvMyCategorySubtitle");
            textView7.setVisibility(0);
            TextView textView8 = (TextView) mo166115a(R.id.tvMoreCategory);
            Intrinsics.checkExpressionValueIsNotNull(textView8, "tvMoreCategory");
            textView8.setVisibility(0);
            CategoryDragLayout categoryDragLayout2 = (CategoryDragLayout) mo166115a(R.id.unSelectedDragLayout);
            Intrinsics.checkExpressionValueIsNotNull(categoryDragLayout2, "unSelectedDragLayout");
            if (categoryDragLayout2.getChildCount() > 0) {
                TextView textView9 = (TextView) mo166115a(R.id.tvMoreCategorySubtitle);
                Intrinsics.checkExpressionValueIsNotNull(textView9, "tvMoreCategorySubtitle");
                textView9.setVisibility(0);
                TextView textView10 = (TextView) mo166115a(R.id.tvMoreCategorySubtitle);
                Intrinsics.checkExpressionValueIsNotNull(textView10, "tvMoreCategorySubtitle");
                textView10.setText(UIUtils.getString(momentsCategoryEditActivity, R.string.Lark_Community_ClickToAddCategory));
            } else {
                TextView textView11 = (TextView) mo166115a(R.id.tvMoreCategorySubtitle);
                Intrinsics.checkExpressionValueIsNotNull(textView11, "tvMoreCategorySubtitle");
                textView11.setVisibility(8);
            }
        }
        this.f119209d = !this.f119209d;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/moments/impl/categoryedit/MomentsCategoryEditActivity$initEvent$1", "Lcom/ss/android/lark/moments/impl/categoryedit/CategoryDragLayout$OnItemActionClickListener;", "onItemActionClick", "", "view", "Lcom/ss/android/lark/moments/impl/categoryedit/CategoryItemView;", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.categoryedit.MomentsCategoryEditActivity$c */
    public static final class C47260c implements CategoryDragLayout.OnItemActionClickListener {

        /* renamed from: a */
        final /* synthetic */ MomentsCategoryEditActivity f119216a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C47260c(MomentsCategoryEditActivity momentsCategoryEditActivity) {
            this.f119216a = momentsCategoryEditActivity;
        }

        @Override // com.ss.android.lark.moments.impl.categoryedit.CategoryDragLayout.OnItemActionClickListener
        /* renamed from: a */
        public void mo166103a(CategoryItemView aVar) {
            Intrinsics.checkParameterIsNotNull(aVar, "view");
            ((CategoryDragLayout) this.f119216a.mo166115a(R.id.selectedDragLayout)).removeView(aVar);
            TabData tabData = aVar.getTabData();
            if (tabData != null) {
                ((CategoryDragLayout) this.f119216a.mo166115a(R.id.unSelectedDragLayout)).mo166090a(tabData, 0);
            }
            CategoryDragLayout categoryDragLayout = (CategoryDragLayout) this.f119216a.mo166115a(R.id.unSelectedDragLayout);
            Intrinsics.checkExpressionValueIsNotNull(categoryDragLayout, "unSelectedDragLayout");
            if (categoryDragLayout.getChildCount() > 0) {
                TextView textView = (TextView) this.f119216a.mo166115a(R.id.tvMoreCategorySubtitle);
                Intrinsics.checkExpressionValueIsNotNull(textView, "tvMoreCategorySubtitle");
                textView.setVisibility(0);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/moments/impl/categoryedit/MomentsCategoryEditActivity$initEvent$2", "Lcom/ss/android/lark/moments/impl/categoryedit/CategoryDragLayout$OnItemActionClickListener;", "onItemActionClick", "", "view", "Lcom/ss/android/lark/moments/impl/categoryedit/CategoryItemView;", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.categoryedit.MomentsCategoryEditActivity$d */
    public static final class C47261d implements CategoryDragLayout.OnItemActionClickListener {

        /* renamed from: a */
        final /* synthetic */ MomentsCategoryEditActivity f119217a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C47261d(MomentsCategoryEditActivity momentsCategoryEditActivity) {
            this.f119217a = momentsCategoryEditActivity;
        }

        @Override // com.ss.android.lark.moments.impl.categoryedit.CategoryDragLayout.OnItemActionClickListener
        /* renamed from: a */
        public void mo166103a(CategoryItemView aVar) {
            Intrinsics.checkParameterIsNotNull(aVar, "view");
            ((CategoryDragLayout) this.f119217a.mo166115a(R.id.unSelectedDragLayout)).removeView(aVar);
            TabData tabData = aVar.getTabData();
            if (tabData != null) {
                ((CategoryDragLayout) this.f119217a.mo166115a(R.id.selectedDragLayout)).mo166089a(tabData);
            }
            CategoryDragLayout categoryDragLayout = (CategoryDragLayout) this.f119217a.mo166115a(R.id.unSelectedDragLayout);
            Intrinsics.checkExpressionValueIsNotNull(categoryDragLayout, "unSelectedDragLayout");
            if (categoryDragLayout.getChildCount() <= 0) {
                TextView textView = (TextView) this.f119217a.mo166115a(R.id.tvMoreCategorySubtitle);
                Intrinsics.checkExpressionValueIsNotNull(textView, "tvMoreCategorySubtitle");
                textView.setVisibility(8);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/moments/impl/categoryedit/MomentsCategoryEditActivity$onCreate$5", "Lcom/ss/android/lark/widget/listener/OnSingleClickListener;", "onSingleClick", "", "v", "Landroid/view/View;", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.categoryedit.MomentsCategoryEditActivity$f */
    public static final class C47263f extends OnSingleClickListener {

        /* renamed from: a */
        final /* synthetic */ MomentsCategoryEditActivity f119218a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C47263f(MomentsCategoryEditActivity momentsCategoryEditActivity) {
            this.f119218a = momentsCategoryEditActivity;
        }

        @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
        public void onSingleClick(View view) {
            this.f119218a.mo166122e();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "tabs", "", "Lcom/ss/android/lark/moments/impl/categoryedit/TabData;", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.categoryedit.MomentsCategoryEditActivity$g */
    static final class C47264g<T> implements AbstractC1178x<List<? extends TabData>> {

        /* renamed from: a */
        final /* synthetic */ MomentsCategoryEditActivity f119219a;

        C47264g(MomentsCategoryEditActivity momentsCategoryEditActivity) {
            this.f119219a = momentsCategoryEditActivity;
        }

        /* renamed from: a */
        public final void onChanged(List<TabData> list) {
            Intrinsics.checkExpressionValueIsNotNull(list, "tabs");
            ((CategoryDragLayout) this.f119219a.mo166115a(R.id.selectedDragLayout)).setItems(list);
        }
    }

    /* renamed from: a */
    public static Resources m187164a(MomentsCategoryEditActivity momentsCategoryEditActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(momentsCategoryEditActivity);
        }
        return momentsCategoryEditActivity.mo166123f();
    }

    /* renamed from: c */
    public static AssetManager m187167c(MomentsCategoryEditActivity momentsCategoryEditActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(momentsCategoryEditActivity);
        }
        return momentsCategoryEditActivity.mo166126h();
    }

    /* renamed from: b */
    public static void m187166b(MomentsCategoryEditActivity momentsCategoryEditActivity) {
        momentsCategoryEditActivity.mo166124g();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            MomentsCategoryEditActivity momentsCategoryEditActivity2 = momentsCategoryEditActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    momentsCategoryEditActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Boolean;)V"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.categoryedit.MomentsCategoryEditActivity$i */
    static final class C47266i<T> implements AbstractC1178x<Boolean> {

        /* renamed from: a */
        final /* synthetic */ MomentsCategoryEditActivity f119221a;

        C47266i(MomentsCategoryEditActivity momentsCategoryEditActivity) {
            this.f119221a = momentsCategoryEditActivity;
        }

        /* renamed from: a */
        public final void onChanged(Boolean bool) {
            Intrinsics.checkExpressionValueIsNotNull(bool, "it");
            if (bool.booleanValue()) {
                TextView textView = (TextView) this.f119221a.mo166115a(R.id.tvEdit);
                Intrinsics.checkExpressionValueIsNotNull(textView, "tvEdit");
                textView.setText(UIUtils.getString(this.f119221a, R.string.Lark_Community_Edit));
                TextView textView2 = (TextView) this.f119221a.mo166115a(R.id.tvEdit);
                Intrinsics.checkExpressionValueIsNotNull(textView2, "tvEdit");
                textView2.setVisibility(0);
                ImageView imageView = (ImageView) this.f119221a.mo166115a(R.id.ivLoading);
                Intrinsics.checkExpressionValueIsNotNull(imageView, "ivLoading");
                imageView.setVisibility(8);
                if (this.f119221a.mo166118b().isRunning()) {
                    this.f119221a.mo166118b().stop();
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "tabs", "", "Lcom/ss/android/lark/moments/impl/categoryedit/TabData;", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.categoryedit.MomentsCategoryEditActivity$h */
    static final class C47265h<T> implements AbstractC1178x<List<? extends TabData>> {

        /* renamed from: a */
        final /* synthetic */ MomentsCategoryEditActivity f119220a;

        C47265h(MomentsCategoryEditActivity momentsCategoryEditActivity) {
            this.f119220a = momentsCategoryEditActivity;
        }

        /* renamed from: a */
        public final void onChanged(List<TabData> list) {
            TextView textView = (TextView) this.f119220a.mo166115a(R.id.tvEdit);
            Intrinsics.checkExpressionValueIsNotNull(textView, "tvEdit");
            textView.setClickable(true);
            TextView textView2 = (TextView) this.f119220a.mo166115a(R.id.tvEdit);
            Intrinsics.checkExpressionValueIsNotNull(textView2, "tvEdit");
            textView2.setEnabled(true);
            if (list.isEmpty()) {
                TextView textView3 = (TextView) this.f119220a.mo166115a(R.id.tvMoreCategory);
                Intrinsics.checkExpressionValueIsNotNull(textView3, "tvMoreCategory");
                textView3.setVisibility(8);
                TextView textView4 = (TextView) this.f119220a.mo166115a(R.id.tvMoreCategorySubtitle);
                Intrinsics.checkExpressionValueIsNotNull(textView4, "tvMoreCategorySubtitle");
                textView4.setVisibility(8);
            }
            Intrinsics.checkExpressionValueIsNotNull(list, "tabs");
            ((CategoryDragLayout) this.f119220a.mo166115a(R.id.unSelectedDragLayout)).setItems(list);
            this.f119220a.mo166119c().removeCallbacksAndMessages(null);
            TextView textView5 = (TextView) this.f119220a.mo166115a(R.id.tvMoreCategorySubtitle);
            Intrinsics.checkExpressionValueIsNotNull(textView5, "tvMoreCategorySubtitle");
            textView5.setText(UIUtils.getString(this.f119220a, R.string.Lark_Community_ClickToAddCategory));
            TextView textView6 = (TextView) this.f119220a.mo166115a(R.id.tvMoreCategorySubtitle);
            Intrinsics.checkExpressionValueIsNotNull(textView6, "tvMoreCategorySubtitle");
            textView6.setVisibility(8);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Boolean;)V"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.categoryedit.MomentsCategoryEditActivity$j */
    static final class C47267j<T> implements AbstractC1178x<Boolean> {

        /* renamed from: a */
        final /* synthetic */ MomentsCategoryEditActivity f119222a;

        C47267j(MomentsCategoryEditActivity momentsCategoryEditActivity) {
            this.f119222a = momentsCategoryEditActivity;
        }

        /* renamed from: a */
        public final void onChanged(Boolean bool) {
            Intrinsics.checkExpressionValueIsNotNull(bool, "it");
            if (bool.booleanValue()) {
                ArrayList<Tab> childrenData = ((CategoryDragLayout) this.f119222a.mo166115a(R.id.selectedDragLayout)).getChildrenData();
                MomentsCategoryEditActivity momentsCategoryEditActivity = this.f119222a;
                momentsCategoryEditActivity.setResult(-1, momentsCategoryEditActivity.mo166121d().putExtra("key_ordered_tabs", childrenData));
                TextView textView = (TextView) this.f119222a.mo166115a(R.id.tvEdit);
                Intrinsics.checkExpressionValueIsNotNull(textView, "tvEdit");
                textView.setText(UIUtils.getString(this.f119222a, R.string.Lark_Community_Edit));
            } else {
                MomentsCategoryEditActivity momentsCategoryEditActivity2 = this.f119222a;
                LKUIToast.show(momentsCategoryEditActivity2, UIUtils.getString(momentsCategoryEditActivity2, R.string.Lark_Community_UnableToMakeChangesToast));
                ((CategoryDragLayout) this.f119222a.mo166115a(R.id.selectedDragLayout)).mo166092b();
                ((CategoryDragLayout) this.f119222a.mo166115a(R.id.unSelectedDragLayout)).mo166092b();
                TextView textView2 = (TextView) this.f119222a.mo166115a(R.id.tvMyCategory);
                Intrinsics.checkExpressionValueIsNotNull(textView2, "tvMyCategory");
                textView2.setVisibility(0);
                TextView textView3 = (TextView) this.f119222a.mo166115a(R.id.tvMyCategorySubtitle);
                Intrinsics.checkExpressionValueIsNotNull(textView3, "tvMyCategorySubtitle");
                textView3.setVisibility(0);
                TextView textView4 = (TextView) this.f119222a.mo166115a(R.id.tvMoreCategory);
                Intrinsics.checkExpressionValueIsNotNull(textView4, "tvMoreCategory");
                textView4.setVisibility(0);
                CategoryDragLayout categoryDragLayout = (CategoryDragLayout) this.f119222a.mo166115a(R.id.unSelectedDragLayout);
                Intrinsics.checkExpressionValueIsNotNull(categoryDragLayout, "unSelectedDragLayout");
                if (categoryDragLayout.getChildCount() <= 0) {
                    TextView textView5 = (TextView) this.f119222a.mo166115a(R.id.tvMoreCategorySubtitle);
                    Intrinsics.checkExpressionValueIsNotNull(textView5, "tvMoreCategorySubtitle");
                    textView5.setVisibility(8);
                } else {
                    TextView textView6 = (TextView) this.f119222a.mo166115a(R.id.tvMoreCategorySubtitle);
                    Intrinsics.checkExpressionValueIsNotNull(textView6, "tvMoreCategorySubtitle");
                    textView6.setVisibility(0);
                }
            }
            TextView textView7 = (TextView) this.f119222a.mo166115a(R.id.tvEdit);
            Intrinsics.checkExpressionValueIsNotNull(textView7, "tvEdit");
            textView7.setVisibility(0);
            ImageView imageView = (ImageView) this.f119222a.mo166115a(R.id.ivLoading);
            Intrinsics.checkExpressionValueIsNotNull(imageView, "ivLoading");
            imageView.setVisibility(8);
            if (this.f119222a.mo166118b().isRunning()) {
                this.f119222a.mo166118b().stop();
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.moments_activity_edit_category);
        MomentsEditCategoryViewModel a = mo166116a();
        String stringExtra = getIntent().getStringExtra("key_current_selected_id");
        if (stringExtra == null) {
            stringExtra = "";
        }
        a.setCurrentSelected(stringExtra);
        MomentsEditCategoryViewModel a2 = mo166116a();
        Serializable serializableExtra = getIntent().getSerializableExtra("key_selected_tabs");
        if (!(serializableExtra instanceof List)) {
            serializableExtra = null;
        }
        a2.setSelectedTabs((List) serializableExtra);
        ((CommonTitleBar) mo166115a(R.id.titleBar)).setLeftText(CommonTitleBarConstants.Lark_Legacy_Cancel);
        ((CommonTitleBar) mo166115a(R.id.titleBar)).setLeftImageDrawable(null);
        MomentsCategoryEditActivity momentsCategoryEditActivity = this;
        ((CommonTitleBar) mo166115a(R.id.titleBar)).setTitle(FakeBoldSpan.f119246a.mo166167a(UIUtils.getString(momentsCategoryEditActivity, R.string.Lark_Community_Categories)));
        ((ImageView) mo166115a(R.id.ivLoading)).setImageDrawable(mo166118b());
        ImageView imageView = (ImageView) mo166115a(R.id.ivLoading);
        Intrinsics.checkExpressionValueIsNotNull(imageView, "ivLoading");
        imageView.setVisibility(8);
        m187168i();
        TextView textView = (TextView) mo166115a(R.id.tvMyCategory);
        Intrinsics.checkExpressionValueIsNotNull(textView, "tvMyCategory");
        textView.setText(FakeBoldSpan.f119246a.mo166167a(UIUtils.getString(momentsCategoryEditActivity, R.string.Lark_Community_Category)));
        TextView textView2 = (TextView) mo166115a(R.id.tvMoreCategory);
        Intrinsics.checkExpressionValueIsNotNull(textView2, "tvMoreCategory");
        textView2.setText(FakeBoldSpan.f119246a.mo166167a(UIUtils.getString(momentsCategoryEditActivity, R.string.Lark_Community_MoreCategories)));
        TextView textView3 = (TextView) mo166115a(R.id.tvMoreCategorySubtitle);
        Intrinsics.checkExpressionValueIsNotNull(textView3, "tvMoreCategorySubtitle");
        textView3.setVisibility(0);
        mo166119c().sendEmptyMessage(0);
        TextView textView4 = (TextView) mo166115a(R.id.tvMyCategory);
        Intrinsics.checkExpressionValueIsNotNull(textView4, "tvMyCategory");
        TextPaint paint = textView4.getPaint();
        TextView textView5 = (TextView) mo166115a(R.id.tvMyCategorySubtitle);
        Intrinsics.checkExpressionValueIsNotNull(textView5, "tvMyCategorySubtitle");
        TextPaint paint2 = textView5.getPaint();
        TextView textView6 = (TextView) mo166115a(R.id.tvEdit);
        Intrinsics.checkExpressionValueIsNotNull(textView6, "tvEdit");
        TextPaint paint3 = textView6.getPaint();
        String string = UIUtils.getString(momentsCategoryEditActivity, R.string.Lark_Community_Category);
        String string2 = UIUtils.getString(momentsCategoryEditActivity, R.string.Lark_Community_ReorderCategoriesDesc);
        String string3 = UIUtils.getString(momentsCategoryEditActivity, R.string.Lark_Community_Edit);
        String string4 = UIUtils.getString(momentsCategoryEditActivity, R.string.Lark_Community_MoreCategories);
        String string5 = UIUtils.getString(momentsCategoryEditActivity, R.string.Lark_Community_ClickToAddCategory);
        if (((int) (paint.measureText(string) + paint2.measureText(string2) + paint3.measureText(string3))) > DeviceUtils.getScreenWidth(momentsCategoryEditActivity) - UIUtils.dp2px(momentsCategoryEditActivity, 60.0f)) {
            TextView textView7 = (TextView) mo166115a(R.id.tvMyCategorySubtitle);
            Intrinsics.checkExpressionValueIsNotNull(textView7, "tvMyCategorySubtitle");
            ViewGroup.LayoutParams layoutParams = textView7.getLayoutParams();
            if (!(layoutParams instanceof ConstraintLayout.LayoutParams)) {
                layoutParams = null;
            }
            ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
            if (layoutParams2 != null) {
                layoutParams2.f2816h = -1;
                layoutParams2.f2819k = -1;
                layoutParams2.f2824p = -1;
                layoutParams2.f2817i = R.id.tvMyCategory;
                layoutParams2.f2825q = R.id.tvMyCategory;
                layoutParams2.setMargins(0, UIUtils.dp2px(momentsCategoryEditActivity, 8.0f), 0, 0);
            }
            CategoryDragLayout categoryDragLayout = (CategoryDragLayout) mo166115a(R.id.selectedDragLayout);
            Intrinsics.checkExpressionValueIsNotNull(categoryDragLayout, "selectedDragLayout");
            ViewGroup.LayoutParams layoutParams3 = categoryDragLayout.getLayoutParams();
            if (!(layoutParams3 instanceof ConstraintLayout.LayoutParams)) {
                layoutParams3 = null;
            }
            ConstraintLayout.LayoutParams layoutParams4 = (ConstraintLayout.LayoutParams) layoutParams3;
            if (layoutParams4 != null) {
                layoutParams4.f2817i = R.id.tvMyCategorySubtitle;
            }
        }
        if (((int) (paint.measureText(string4) + paint2.measureText(string5))) > DeviceUtils.getScreenWidth(momentsCategoryEditActivity) - UIUtils.dp2px(momentsCategoryEditActivity, 50.0f)) {
            TextView textView8 = (TextView) mo166115a(R.id.tvMoreCategorySubtitle);
            Intrinsics.checkExpressionValueIsNotNull(textView8, "tvMoreCategorySubtitle");
            ViewGroup.LayoutParams layoutParams5 = textView8.getLayoutParams();
            if (!(layoutParams5 instanceof ConstraintLayout.LayoutParams)) {
                layoutParams5 = null;
            }
            ConstraintLayout.LayoutParams layoutParams6 = (ConstraintLayout.LayoutParams) layoutParams5;
            if (layoutParams6 != null) {
                layoutParams6.f2816h = -1;
                layoutParams6.f2819k = -1;
                layoutParams6.f2824p = -1;
                layoutParams6.f2817i = R.id.tvMoreCategory;
                layoutParams6.f2825q = R.id.tvMoreCategory;
                layoutParams6.setMargins(0, UIUtils.dp2px(momentsCategoryEditActivity, 8.0f), 0, 0);
            }
            CategoryDragLayout categoryDragLayout2 = (CategoryDragLayout) mo166115a(R.id.unSelectedDragLayout);
            Intrinsics.checkExpressionValueIsNotNull(categoryDragLayout2, "unSelectedDragLayout");
            ViewGroup.LayoutParams layoutParams7 = categoryDragLayout2.getLayoutParams();
            if (!(layoutParams7 instanceof ConstraintLayout.LayoutParams)) {
                layoutParams7 = null;
            }
            ConstraintLayout.LayoutParams layoutParams8 = (ConstraintLayout.LayoutParams) layoutParams7;
            if (layoutParams8 != null) {
                layoutParams8.f2817i = R.id.tvMoreCategorySubtitle;
            }
        }
        TextView textView9 = (TextView) mo166115a(R.id.tvEdit);
        Intrinsics.checkExpressionValueIsNotNull(textView9, "tvEdit");
        textView9.setText(UIUtils.getString(momentsCategoryEditActivity, R.string.Lark_Community_Edit));
        TextView textView10 = (TextView) mo166115a(R.id.tvEdit);
        Intrinsics.checkExpressionValueIsNotNull(textView10, "tvEdit");
        textView10.setClickable(false);
        TextView textView11 = (TextView) mo166115a(R.id.tvEdit);
        Intrinsics.checkExpressionValueIsNotNull(textView11, "tvEdit");
        textView11.setEnabled(false);
        ((TextView) mo166115a(R.id.tvEdit)).setOnClickListener(new C47263f(this));
        this.f119210e.mo166145a((CategoryDragLayout) mo166115a(R.id.selectedDragLayout));
        this.f119210e.mo166147b((CategoryDragLayout) mo166115a(R.id.unSelectedDragLayout));
        ((CategoryDragLayout) mo166115a(R.id.selectedDragLayout)).setOnClickMyTabListener(this.f119213h);
        ((CategoryDragLayout) mo166115a(R.id.unSelectedDragLayout)).setOnClickMyTabListener(this.f119213h);
        ((CategoryDragLayout) mo166115a(R.id.selectedDragLayout)).setBinder(this.f119210e);
        ((CategoryDragLayout) mo166115a(R.id.selectedDragLayout)).setCurrentTabId(mo166116a().getCurrentTabId());
        ((CategoryDragLayout) mo166115a(R.id.unSelectedDragLayout)).setBinder(this.f119210e);
        ((CategoryDragLayout) mo166115a(R.id.unSelectedDragLayout)).setEnableChangePosition(false);
        CategoryDragLayout categoryDragLayout3 = (CategoryDragLayout) mo166115a(R.id.unSelectedDragLayout);
        Intrinsics.checkExpressionValueIsNotNull(categoryDragLayout3, "unSelectedDragLayout");
        categoryDragLayout3.setMinimumHeight(UIUtils.dp2px(momentsCategoryEditActivity, 80.0f));
        MomentsCategoryEditActivity momentsCategoryEditActivity2 = this;
        mo166116a().getSelectedTabs().mo5923a(momentsCategoryEditActivity2, new C47264g(this));
        mo166116a().getUnSelectedTabs().mo5923a(momentsCategoryEditActivity2, new C47265h(this));
        mo166116a().getNoNeedToRequestOrder().mo5923a(momentsCategoryEditActivity2, new C47266i(this));
        mo166116a().getSaveFinish().mo5923a(momentsCategoryEditActivity2, new C47267j(this));
        mo166116a().getTabs();
    }

    /* renamed from: a */
    public static void m187165a(MomentsCategoryEditActivity momentsCategoryEditActivity, Context context) {
        momentsCategoryEditActivity.mo166117a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(momentsCategoryEditActivity);
        }
    }

    /* renamed from: a */
    public static Context m187163a(MomentsCategoryEditActivity momentsCategoryEditActivity, Configuration configuration) {
        Context a = momentsCategoryEditActivity.mo166114a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}
