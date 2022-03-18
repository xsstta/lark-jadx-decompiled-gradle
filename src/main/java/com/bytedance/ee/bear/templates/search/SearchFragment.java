package com.bytedance.ee.bear.templates.search;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.Group;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.AbstractC1142af;
import androidx.lifecycle.aj;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.ee.bear.appsetting.C4211a;
import com.bytedance.ee.bear.facade.common.AbstractC7664b;
import com.bytedance.ee.bear.facade.common.C7667e;
import com.bytedance.ee.bear.p522q.p523a.C10548d;
import com.bytedance.ee.bear.templates.TemplateReport;
import com.bytedance.ee.bear.templates.TemplateReportV2;
import com.bytedance.ee.bear.templates.center.C11455b;
import com.bytedance.ee.bear.templates.center.Tab2;
import com.bytedance.ee.bear.templates.center.TemplateCenterViewModel;
import com.bytedance.ee.bear.templates.search.recommend.RecommendView;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.bear.widgets.universedesign.SpaceEditText;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p712o.p713a.C13716b;
import com.google.firebase.messaging.Constants;
import com.larksuite.suite.R;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import net.lucode.hackware.magicindicator.MagicIndicator;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.C69619a;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u001e2\u00020\u00012\u00020\u0002:\u0001\u001eB\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\f\u001a\u00020\rH\u0002J\"\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J&\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0017J\b\u0010\u001c\u001a\u00020\rH\u0016J\b\u0010\u001d\u001a\u00020\rH\u0016R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\t¨\u0006\u001f"}, d2 = {"Lcom/bytedance/ee/bear/templates/search/SearchFragment;", "Lcom/bytedance/ee/bear/facade/common/BaseFragment;", "Lcom/bytedance/ee/bear/facade/common/ActivityResultHandler;", "()V", "dispose", "Lio/reactivex/disposables/Disposable;", "templateCenViewModel", "Lcom/bytedance/ee/bear/templates/center/TemplateCenterViewModel;", "getTemplateCenViewModel", "()Lcom/bytedance/ee/bear/templates/center/TemplateCenterViewModel;", "templateCenViewModel$delegate", "Lkotlin/Lazy;", "finish", "", "onActivityResult", "requestCode", "", "resultCode", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Landroid/content/Intent;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onDestroyView", "Companion", "templates-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.templates.search.a */
public final class SearchFragment extends C7667e implements AbstractC7664b {

    /* renamed from: a */
    static final /* synthetic */ KProperty[] f31294a = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(SearchFragment.class), "templateCenViewModel", "getTemplateCenViewModel()Lcom/bytedance/ee/bear/templates/center/TemplateCenterViewModel;"))};

    /* renamed from: b */
    public static final Companion f31295b = new Companion(null);

    /* renamed from: c */
    private Disposable f31296c;

    /* renamed from: d */
    private final Lazy f31297d = LazyKt.lazy(new C11629l(this));

    /* renamed from: e */
    private HashMap f31298e;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u000e\u0010\u0007\u001a\n \u0004*\u0004\u0018\u00010\b0\bH\n¢\u0006\u0002\b\t"}, d2 = {"<anonymous>", "", "v", "Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "actionId", "", "event", "Landroid/view/KeyEvent;", "onEditorAction"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.search.a$f */
    static final class C11623f implements TextView.OnEditorActionListener {

        /* renamed from: a */
        public static final C11623f f31303a = new C11623f();

        C11623f() {
        }

        public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            return i == 3;
        }
    }

    /* renamed from: a */
    public final TemplateCenterViewModel mo44615a() {
        Lazy lazy = this.f31297d;
        KProperty kProperty = f31294a[0];
        return (TemplateCenterViewModel) lazy.getValue();
    }

    /* renamed from: c */
    public void mo44617c() {
        HashMap hashMap = this.f31298e;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/bytedance/ee/bear/templates/search/SearchFragment$Companion;", "", "()V", "TAG", "", "newInstant", "Landroidx/fragment/app/Fragment;", "context", "Landroid/content/Context;", "templates-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.search.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final Fragment mo44618a(Context context) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            Fragment instantiate = Fragment.instantiate(context, SearchFragment.class.getName(), new Bundle());
            Intrinsics.checkExpressionValueIsNotNull(instantiate, "Fragment.instantiate(con…lass.java.name, Bundle())");
            return instantiate;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.search.a$j */
    static final class RunnableC11627j implements Runnable {

        /* renamed from: a */
        final /* synthetic */ SpaceEditText f31309a;

        RunnableC11627j(SpaceEditText spaceEditText) {
            this.f31309a = spaceEditText;
        }

        public final void run() {
            C10548d.m43703b(this.f31309a);
        }
    }

    @Override // com.bytedance.ee.bear.facade.common.C7667e, com.bytedance.ee.bear.facade.common.C7718l, androidx.fragment.app.Fragment
    public void onDestroy() {
        TemplateReportV2.f31015b.mo44240a("ccm_template_systemcenter_view_click");
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        Disposable disposable = this.f31296c;
        if (disposable != null) {
            disposable.dispose();
        }
        super.onDestroyView();
        mo44617c();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/bytedance/ee/bear/templates/center/TemplateCenterViewModel;", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.search.a$l */
    static final class C11629l extends Lambda implements Function0<TemplateCenterViewModel> {
        final /* synthetic */ SearchFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C11629l(SearchFragment aVar) {
            super(0);
            this.this$0 = aVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final TemplateCenterViewModel invoke() {
            return (TemplateCenterViewModel) aj.m5366a(this.this$0.requireActivity()).mo6005a(TemplateCenterViewModel.class);
        }
    }

    /* renamed from: b */
    public final void mo44616b() {
        FragmentManager supportFragmentManager;
        C10548d.m43696a(getContext());
        FragmentActivity activity = getActivity();
        if (activity != null && (supportFragmentManager = activity.getSupportFragmentManager()) != null) {
            supportFragmentManager.popBackStack();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.search.a$b */
    static final class View$OnClickListenerC11619b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ SearchFragment f31299a;

        View$OnClickListenerC11619b(SearchFragment aVar) {
            this.f31299a = aVar;
        }

        public final void onClick(View view) {
            this.f31299a.mo44616b();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.search.a$c */
    static final class View$OnClickListenerC11620c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ SearchFragment f31300a;

        View$OnClickListenerC11620c(SearchFragment aVar) {
            this.f31300a = aVar;
        }

        public final void onClick(View view) {
            this.f31300a.mo44616b();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "throwable", "", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.search.a$h */
    static final class C11625h<T> implements Consumer<Throwable> {

        /* renamed from: a */
        public static final C11625h f31308a = new C11625h();

        C11625h() {
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            C13479a.m54761a("TemplateSearchFragment", th);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.search.a$i */
    static final class C11626i extends Lambda implements Function1<String, Unit> {
        final /* synthetic */ SpaceEditText $et;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C11626i(SpaceEditText spaceEditText) {
            super(1);
            this.$et = spaceEditText;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke(str);
            return Unit.INSTANCE;
        }

        public final void invoke(String str) {
            Intrinsics.checkParameterIsNotNull(str, "it");
            this.$et.setText(str);
            this.$et.setSelection(str.length());
            TemplateReportV2.f31015b.mo44244a(true);
            TemplateReport.f31011b.mo44227a("click_searchrecommendwords", str);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.search.a$d */
    static final class View$OnClickListenerC11621d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ SpaceEditText f31301a;

        View$OnClickListenerC11621d(SpaceEditText spaceEditText) {
            this.f31301a = spaceEditText;
        }

        public final void onClick(View view) {
            C13479a.m54764b("TemplateSearchFragment", "clear input");
            TemplateReportV2.f31015b.mo44261h();
            this.f31301a.setText("");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\r\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "s", "", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.search.a$g */
    static final class C11624g<T> implements Consumer<CharSequence> {

        /* renamed from: a */
        final /* synthetic */ SearchFragment f31304a;

        /* renamed from: b */
        final /* synthetic */ RecommendView f31305b;

        /* renamed from: c */
        final /* synthetic */ Group f31306c;

        /* renamed from: d */
        final /* synthetic */ ImageView f31307d;

        C11624g(SearchFragment aVar, RecommendView recommendView, Group group, ImageView imageView) {
            this.f31304a = aVar;
            this.f31305b = recommendView;
            this.f31306c = group;
            this.f31307d = imageView;
        }

        /* renamed from: a */
        public final void accept(CharSequence charSequence) {
            boolean z;
            TemplateReport.f31011b.mo44234d(String.valueOf(charSequence));
            this.f31304a.mo44615a().getSearchContent().mo5929b(String.valueOf(charSequence));
            if (String.valueOf(charSequence).length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                RecommendView recommendView = this.f31305b;
                Intrinsics.checkExpressionValueIsNotNull(recommendView, "recommendView");
                recommendView.setVisibility(0);
                Group group = this.f31306c;
                Intrinsics.checkExpressionValueIsNotNull(group, "group");
                group.setVisibility(8);
                ImageView imageView = this.f31307d;
                Intrinsics.checkExpressionValueIsNotNull(imageView, "clear");
                imageView.setVisibility(8);
                return;
            }
            RecommendView recommendView2 = this.f31305b;
            Intrinsics.checkExpressionValueIsNotNull(recommendView2, "recommendView");
            recommendView2.setVisibility(8);
            Group group2 = this.f31306c;
            Intrinsics.checkExpressionValueIsNotNull(group2, "group");
            group2.setVisibility(0);
            ImageView imageView2 = this.f31307d;
            Intrinsics.checkExpressionValueIsNotNull(imageView2, "clear");
            imageView2.setVisibility(0);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00060\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "v", "Landroid/view/View;", "kotlin.jvm.PlatformType", "event", "Landroid/view/MotionEvent;", "onTouch"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.search.a$e */
    static final class View$OnTouchListenerC11622e implements View.OnTouchListener {

        /* renamed from: a */
        public static final View$OnTouchListenerC11622e f31302a = new View$OnTouchListenerC11622e();

        View$OnTouchListenerC11622e() {
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            Intrinsics.checkExpressionValueIsNotNull(motionEvent, "event");
            if (motionEvent.getAction() != 1) {
                return false;
            }
            TemplateReport.m47953a(TemplateReport.f31011b, "click_searchplace", null, 2, null);
            return false;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u000e\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u0005H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "index", "", "tab", "Lcom/bytedance/ee/bear/templates/center/Tab2;", "kotlin.jvm.PlatformType", "onTabSelected"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.search.a$k */
    static final class C11628k implements C11455b.AbstractC11458a {

        /* renamed from: a */
        final /* synthetic */ ViewPager f31310a;

        C11628k(ViewPager viewPager) {
            this.f31310a = viewPager;
        }

        @Override // com.bytedance.ee.bear.templates.center.C11455b.AbstractC11458a
        /* renamed from: a */
        public final void mo44011a(int i, Tab2 tab2) {
            ViewPager viewPager = this.f31310a;
            Intrinsics.checkExpressionValueIsNotNull(viewPager, "vp");
            viewPager.setCurrentItem(i);
            if (tab2 != null) {
                int i2 = C11651b.f31366a[tab2.ordinal()];
                if (i2 == 1) {
                    TemplateReportV2.f31015b.mo44257f();
                    return;
                } else if (i2 == 2) {
                    TemplateReportV2.f31015b.mo44254e();
                    return;
                }
            }
            TemplateReportV2.f31015b.mo44251d();
        }
    }

    @Override // com.bytedance.ee.bear.facade.common.AbstractC7664b, androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        String stringExtra;
        super.onActivityResult(i, i2, intent);
        if (205 == i2 && intent != null && (stringExtra = intent.getStringExtra("token")) != null) {
            AbstractC1142af a = aj.m5366a(requireActivity()).mo6005a(TemplateCenterViewModel.class);
            Intrinsics.checkExpressionValueIsNotNull(a, "ViewModelProviders.of(re…terViewModel::class.java)");
            ((TemplateCenterViewModel) a).getDeleteToken().mo5929b(stringExtra);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        TemplateReportV2.f31015b.mo44240a("ccm_template_search_result_view_click");
        View inflate = layoutInflater.inflate(R.layout.template_search_fragment, viewGroup, false);
        ArrayList arrayList = new ArrayList();
        arrayList.add(Tab2.SYSTEM);
        if (C4211a.m17514a().mo16536a("spacekit.mobile.template_optimization_v4_custom", false)) {
            arrayList.add(Tab2.CUSTOM);
        }
        if (C4211a.m17514a().mo16536a("spacekit.mobile.template_optimization_v4_business", false)) {
            arrayList.add(Tab2.BUSNISS);
        }
        MagicIndicator magicIndicator = (MagicIndicator) inflate.findViewById(R.id.template_search_ir);
        ViewPager viewPager = (ViewPager) inflate.findViewById(R.id.template_search_vp);
        SpaceEditText spaceEditText = (SpaceEditText) inflate.findViewById(R.id.template_search_et);
        ImageView imageView = (ImageView) inflate.findViewById(R.id.search_clear_icon);
        inflate.findViewById(R.id.template_search_back).setOnClickListener(new View$OnClickListenerC11619b(this));
        inflate.findViewById(R.id.template_search_cancel).setOnClickListener(new View$OnClickListenerC11620c(this));
        RecommendView recommendView = (RecommendView) inflate.findViewById(R.id.template_search_recommendView);
        imageView.setOnClickListener(new View$OnClickListenerC11621d(spaceEditText));
        spaceEditText.setOnTouchListener(View$OnTouchListenerC11622e.f31302a);
        spaceEditText.setOnEditorActionListener(C11623f.f31303a);
        this.f31296c = C13716b.m55614a(spaceEditText).debounce(300, TimeUnit.MILLISECONDS, C11678b.m48480d()).observeOn(C11678b.m48481e()).subscribe(new C11624g(this, recommendView, (Group) inflate.findViewById(R.id.template_search_group), imageView), C11625h.f31308a);
        recommendView.setClickItemListener(new C11626i(spaceEditText));
        inflate.post(new RunnableC11627j(spaceEditText));
        Intrinsics.checkExpressionValueIsNotNull(viewPager, "vp");
        viewPager.setAdapter(new TemplateSearchVPAdapter(this, arrayList));
        C11455b bVar = new C11455b(getActivity(), magicIndicator, arrayList, new C11628k(viewPager));
        C69619a aVar = new C69619a(getActivity());
        aVar.setAdapter(bVar);
        aVar.setAdjustMode(true);
        Intrinsics.checkExpressionValueIsNotNull(magicIndicator, "ir");
        magicIndicator.setNavigator(aVar);
        TemplateReportV2.m47969a(TemplateReportV2.f31015b, "ccm_template_search_result_view", (String) null, 2, (Object) null);
        return inflate;
    }
}
