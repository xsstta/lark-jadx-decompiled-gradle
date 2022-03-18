package com.ss.android.lark.edu.creategroup.primarypage;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.component.ui.dialog.C25639g;
import com.larksuite.component.ui.dialog.DialogC25637f;
import com.larksuite.component.ui.loading.LKUIStatus;
import com.larksuite.suite.R;
import com.ss.android.lark.base.fragment.BaseFragment;
import com.ss.android.lark.edu.creategroup.primarypage.EduClassesModel;
import com.ss.android.lark.edu.dto.ClassInfoResponse;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.widget.ptr.LKUIPtrClassicFrameLayout;
import com.ss.android.lark.widget.recyclerview.CommonRecyclerView;
import java.util.HashMap;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.KProperty;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000o\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t*\u0001\u0014\u0018\u0000 32\u00020\u0001:\u00013B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u001e\u001a\u00020\u001fH\u0002J\u0010\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\"H\u0002J\u0006\u0010#\u001a\u00020\u001fJ\u0012\u0010$\u001a\u00020\u001f2\b\u0010%\u001a\u0004\u0018\u00010&H\u0016J&\u0010'\u001a\u0004\u0018\u00010\n2\u0006\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010+2\b\u0010%\u001a\u0004\u0018\u00010&H\u0016J\b\u0010,\u001a\u00020\u001fH\u0002J\b\u0010-\u001a\u00020\u001fH\u0002J\b\u0010.\u001a\u00020\u001fH\u0002J\b\u0010/\u001a\u00020\u001fH\u0002J\b\u00100\u001a\u00020\u001fH\u0002J\b\u00101\u001a\u00020\u001fH\u0002J\u0010\u00102\u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\"H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX.¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX.¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX.¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u00020\u0014X\u0004¢\u0006\u0004\n\u0002\u0010\u0015R\u001b\u0010\u0016\u001a\u00020\f8BX\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0017\u0010\u0018R\u000e\u0010\u001b\u001a\u00020\u001cX.¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001cX.¢\u0006\u0002\n\u0000¨\u00064"}, d2 = {"Lcom/ss/android/lark/edu/creategroup/primarypage/CreateEduGroupFragment;", "Lcom/ss/android/lark/base/fragment/BaseFragment;", "()V", "adapter", "Lcom/ss/android/lark/edu/creategroup/primarypage/EduClassInfoListAdapter;", "classListRV", "Lcom/ss/android/lark/widget/recyclerview/CommonRecyclerView;", "classListWrapper", "Lcom/ss/android/lark/widget/ptr/LKUIPtrClassicFrameLayout;", "createGroupCover", "Landroid/view/View;", "currentY", "", "dragStartY", "ivBack", "Landroid/widget/ImageView;", "lastState", "loadingView", "Lcom/larksuite/component/ui/loading/LKUIStatus;", "scrollListener", "com/ss/android/lark/edu/creategroup/primarypage/CreateEduGroupFragment$scrollListener$1", "Lcom/ss/android/lark/edu/creategroup/primarypage/CreateEduGroupFragment$scrollListener$1;", "touchSlop", "getTouchSlop", "()I", "touchSlop$delegate", "Lkotlin/Lazy;", "tvSubTitle", "Landroid/widget/TextView;", "tvTitle", "bindViews", "", "handleClassInfoUpdate", "response", "Lcom/ss/android/lark/edu/dto/ClassInfoResponse;", "handleScrollEvent", "onActivityCreated", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "removeLoadingView", "setupClassList", "setupLoadingView", "setupTitle", "setupView", "setupViewModel", "showLoadFailDialog", "Companion", "features_edu_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.edu.creategroup.primarypage.b */
public final class CreateEduGroupFragment extends BaseFragment {

    /* renamed from: a */
    static final /* synthetic */ KProperty[] f94946a = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(CreateEduGroupFragment.class), "touchSlop", "getTouchSlop()I"))};

    /* renamed from: e */
    public static final Companion f94947e = new Companion(null);

    /* renamed from: b */
    public int f94948b;

    /* renamed from: c */
    public int f94949c;

    /* renamed from: d */
    public int f94950d;

    /* renamed from: f */
    private TextView f94951f;

    /* renamed from: g */
    private TextView f94952g;

    /* renamed from: h */
    private ImageView f94953h;

    /* renamed from: i */
    private View f94954i;

    /* renamed from: j */
    private CommonRecyclerView f94955j;

    /* renamed from: k */
    private LKUIPtrClassicFrameLayout f94956k;

    /* renamed from: l */
    private EduClassInfoListAdapter f94957l;

    /* renamed from: m */
    private LKUIStatus f94958m;

    /* renamed from: n */
    private final Lazy f94959n = LazyKt.lazy(new C36941h(this));

    /* renamed from: o */
    private final C36935b f94960o = new C36935b(this);

    /* renamed from: p */
    private HashMap f94961p;

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u000e\u0010\u0007\u001a\n \u0004*\u0004\u0018\u00010\b0\bH\n¢\u0006\u0002\b\t"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "keyCode", "", "<anonymous parameter 2>", "Landroid/view/KeyEvent;", "onKey"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.edu.creategroup.primarypage.b$g */
    public static final class DialogInterface$OnKeyListenerC36940g implements DialogInterface.OnKeyListener {

        /* renamed from: a */
        public static final DialogInterface$OnKeyListenerC36940g f94966a = new DialogInterface$OnKeyListenerC36940g();

        DialogInterface$OnKeyListenerC36940g() {
        }

        public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
            return i == 4;
        }
    }

    /* renamed from: a */
    public final int mo136340a() {
        Lazy lazy = this.f94959n;
        KProperty kProperty = f94946a[0];
        return ((Number) lazy.getValue()).intValue();
    }

    /* renamed from: c */
    public void mo136343c() {
        HashMap hashMap = this.f94961p;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.base.fragment.BaseFragment, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo136343c();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/edu/creategroup/primarypage/CreateEduGroupFragment$Companion;", "", "()V", "_TAG", "", "features_edu_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.edu.creategroup.primarypage.b$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: f */
    private final void m145817f() {
        m145815d();
        m145820i();
        m145818g();
        m145819h();
    }

    /* renamed from: j */
    private final void m145821j() {
        LKUIStatus lKUIStatus = this.f94958m;
        if (lKUIStatus != null) {
            lKUIStatus.mo89849f();
        }
        this.f94958m = null;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.edu.creategroup.primarypage.b$h */
    static final class C36941h extends Lambda implements Function0<Integer> {
        final /* synthetic */ CreateEduGroupFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C36941h(CreateEduGroupFragment bVar) {
            super(0);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'int' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public final Integer invoke() {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(this.this$0.getContext());
            Intrinsics.checkExpressionValueIsNotNull(viewConfiguration, "ViewConfiguration.get(context)");
            return viewConfiguration.getScaledTouchSlop();
        }
    }

    /* renamed from: e */
    private final void m145816e() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            EduClassesModel.Companion aVar = EduClassesModel.Companion;
            Intrinsics.checkExpressionValueIsNotNull(activity, "it");
            aVar.mo136355a(activity).getSource().mo5923a(this, new C36942c(new C36937d(this)));
        }
    }

    /* renamed from: g */
    private final void m145818g() {
        ImageView imageView = this.f94953h;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ivBack");
        }
        imageView.setOnClickListener(new View$OnClickListenerC36936c(this));
        TextView textView = this.f94951f;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tvTitle");
        }
        textView.setText(R.string.Lark_Education_TeacherBotOnboardMsgCardCreateGroupButton);
        TextView textView2 = this.f94952g;
        if (textView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tvSubTitle");
        }
        textView2.setText(R.string.Lark_Education_SchoolParentGroupSubtitle);
    }

    /* renamed from: i */
    private final void m145820i() {
        View view;
        View view2 = getView();
        if (view2 != null) {
            view = view2.getRootView();
        } else {
            view = null;
        }
        if (view != null) {
            LKUIStatus a = new LKUIStatus.C25680a((ViewGroup) view).mo89859a();
            a.mo89837a();
            this.f94958m = a;
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup");
    }

    /* renamed from: d */
    private final void m145815d() {
        View view = getView();
        if (view != null) {
            View findViewById = view.findViewById(R.id.iv_back);
            Intrinsics.checkExpressionValueIsNotNull(findViewById, "it.findViewById(R.id.iv_back)");
            this.f94953h = (ImageView) findViewById;
            View findViewById2 = view.findViewById(R.id.tv_main_title);
            Intrinsics.checkExpressionValueIsNotNull(findViewById2, "it.findViewById(R.id.tv_main_title)");
            this.f94951f = (TextView) findViewById2;
            View findViewById3 = view.findViewById(R.id.tv_subtitle);
            Intrinsics.checkExpressionValueIsNotNull(findViewById3, "it.findViewById(R.id.tv_subtitle)");
            this.f94952g = (TextView) findViewById3;
            View findViewById4 = view.findViewById(R.id.rv_classes);
            Intrinsics.checkExpressionValueIsNotNull(findViewById4, "it.findViewById(R.id.rv_classes)");
            this.f94955j = (CommonRecyclerView) findViewById4;
            View findViewById5 = view.findViewById(R.id.class_list_wrapper);
            Intrinsics.checkExpressionValueIsNotNull(findViewById5, "it.findViewById(R.id.class_list_wrapper)");
            this.f94956k = (LKUIPtrClassicFrameLayout) findViewById5;
            Intrinsics.checkExpressionValueIsNotNull(view, "it");
            View inflate = LayoutInflater.from(view.getContext()).inflate(R.layout.view_create_edu_cover, (ViewGroup) null, false);
            inflate.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -2));
            Intrinsics.checkExpressionValueIsNotNull(inflate, "LayoutInflater.from(it.c…ONTENT)\n                }");
            this.f94954i = inflate;
        }
    }

    /* renamed from: h */
    private final void m145819h() {
        this.f94957l = new EduClassInfoListAdapter();
        CommonRecyclerView commonRecyclerView = this.f94955j;
        if (commonRecyclerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("classListRV");
        }
        commonRecyclerView.setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
        CommonRecyclerView commonRecyclerView2 = this.f94955j;
        if (commonRecyclerView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("classListRV");
        }
        EduClassInfoListAdapter dVar = this.f94957l;
        if (dVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
        }
        commonRecyclerView2.setAdapter(dVar);
        EduClassInfoListAdapter dVar2 = this.f94957l;
        if (dVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
        }
        View view = this.f94954i;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("createGroupCover");
        }
        dVar2.mo136350a(view);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            EduClassesModel.Companion aVar = EduClassesModel.Companion;
            Intrinsics.checkExpressionValueIsNotNull(activity, "it");
            EduClassesSource.m145836a(aVar.mo136355a(activity).getSource(), 0, 1, null);
        }
        LKUIPtrClassicFrameLayout lKUIPtrClassicFrameLayout = this.f94956k;
        if (lKUIPtrClassicFrameLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("classListWrapper");
        }
        lKUIPtrClassicFrameLayout.disableWhenHorizontalMove(true);
        CommonRecyclerView commonRecyclerView3 = this.f94955j;
        if (commonRecyclerView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("classListRV");
        }
        commonRecyclerView3.addOnScrollListener(this.f94960o);
    }

    /* renamed from: b */
    public final void mo136342b() {
        int findLastVisibleItemPosition;
        FragmentActivity activity;
        Log.m165379d("CreateEduGroupFragment", "handleScrollEvent!!!");
        CommonRecyclerView commonRecyclerView = this.f94955j;
        if (commonRecyclerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("classListRV");
        }
        RecyclerView.LayoutManager layoutManager = commonRecyclerView.getLayoutManager();
        if ((layoutManager instanceof LinearLayoutManager) && (findLastVisibleItemPosition = ((LinearLayoutManager) layoutManager).findLastVisibleItemPosition()) != -1) {
            EduClassInfoListAdapter dVar = this.f94957l;
            if (dVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adapter");
            }
            if (dVar.getItemCount() - findLastVisibleItemPosition <= 8 && (activity = getActivity()) != null) {
                EduClassesModel.Companion aVar = EduClassesModel.Companion;
                Intrinsics.checkExpressionValueIsNotNull(activity, "it");
                aVar.mo136355a(activity).getSource().mo136358b(findLastVisibleItemPosition);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J \u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0007H\u0016¨\u0006\u000b"}, d2 = {"com/ss/android/lark/edu/creategroup/primarypage/CreateEduGroupFragment$scrollListener$1", "Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;", "onScrollStateChanged", "", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "newState", "", "onScrolled", "dx", "dy", "features_edu_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.edu.creategroup.primarypage.b$b */
    public static final class C36935b extends RecyclerView.OnScrollListener {

        /* renamed from: a */
        final /* synthetic */ CreateEduGroupFragment f94962a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C36935b(CreateEduGroupFragment bVar) {
            this.f94962a = bVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            Intrinsics.checkParameterIsNotNull(recyclerView, "recyclerView");
            super.onScrollStateChanged(recyclerView, i);
            if (this.f94962a.f94950d == 0 && i == 1) {
                CreateEduGroupFragment bVar = this.f94962a;
                bVar.f94949c = bVar.f94948b;
            }
            if (i == 0 && this.f94962a.f94950d != 0) {
                this.f94962a.f94949c = -1;
            }
            this.f94962a.f94950d = i;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            Intrinsics.checkParameterIsNotNull(recyclerView, "recyclerView");
            super.onScrolled(recyclerView, i, i2);
            this.f94962a.f94948b += i2;
            if (this.f94962a.f94949c != -1 && this.f94962a.f94948b - this.f94962a.f94949c > this.f94962a.mo136340a()) {
                this.f94962a.mo136342b();
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.edu.creategroup.primarypage.b$c */
    public static final class View$OnClickListenerC36936c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ CreateEduGroupFragment f94963a;

        View$OnClickListenerC36936c(CreateEduGroupFragment bVar) {
            this.f94963a = bVar;
        }

        public final void onClick(View view) {
            this.f94963a.finish();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0015\u0010\u0002\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "p1", "Lcom/ss/android/lark/edu/dto/ClassInfoResponse;", "Lkotlin/ParameterName;", "name", "response", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.edu.creategroup.primarypage.b$d */
    public static final /* synthetic */ class C36937d extends FunctionReference implements Function1<ClassInfoResponse, Unit> {
        C36937d(CreateEduGroupFragment bVar) {
            super(1, bVar);
        }

        @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.KCallable
        public final String getName() {
            return "handleClassInfoUpdate";
        }

        @Override // kotlin.jvm.internal.CallableReference
        public final KDeclarationContainer getOwner() {
            return Reflection.getOrCreateKotlinClass(CreateEduGroupFragment.class);
        }

        @Override // kotlin.jvm.internal.CallableReference
        public final String getSignature() {
            return "handleClassInfoUpdate(Lcom/ss/android/lark/edu/dto/ClassInfoResponse;)V";
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ClassInfoResponse aVar) {
            invoke(aVar);
            return Unit.INSTANCE;
        }

        public final void invoke(ClassInfoResponse aVar) {
            Intrinsics.checkParameterIsNotNull(aVar, "p1");
            ((CreateEduGroupFragment) this.receiver).mo136341a(aVar);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "onDismiss", "com/ss/android/lark/edu/creategroup/primarypage/CreateEduGroupFragment$showLoadFailDialog$2$1"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.edu.creategroup.primarypage.b$e */
    public static final class DialogInterface$OnDismissListenerC36938e implements DialogInterface.OnDismissListener {

        /* renamed from: a */
        final /* synthetic */ CreateEduGroupFragment f94964a;

        DialogInterface$OnDismissListenerC36938e(CreateEduGroupFragment bVar) {
            this.f94964a = bVar;
        }

        public final void onDismiss(DialogInterface dialogInterface) {
            this.f94964a.finish();
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        m145817f();
        m145816e();
    }

    /* renamed from: a */
    public final void mo136341a(ClassInfoResponse aVar) {
        if (aVar.mo136414d()) {
            EduClassInfoListAdapter dVar = this.f94957l;
            if (dVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adapter");
            }
            dVar.mo136352a(aVar.mo136413c());
        } else {
            m145814b(aVar);
        }
        m145821j();
    }

    /* renamed from: b */
    private final void m145814b(ClassInfoResponse aVar) {
        String str;
        String e = aVar.mo136415e();
        if (TextUtils.isEmpty(e) || aVar.mo136416f() == 1) {
            Context context = getContext();
            if (context != null) {
                str = context.getString(R.string.Lark_Education_CreateGroupNoPermissionDialogContent);
            } else {
                str = null;
            }
            e = str;
        }
        DialogC25637f b = new C25639g(getContext()).mo89242c(e).mo89224a(R.id.lkui_dialog_btn_right, R.string.Lark_Legacy_ConfirmInfo, new DialogInterface$OnClickListenerC36939f(this)).mo89233b();
        b.setOnDismissListener(new DialogInterface$OnDismissListenerC36938e(this));
        b.setCanceledOnTouchOutside(false);
        b.setOnKeyListener(DialogInterface$OnKeyListenerC36940g.f94966a);
        b.show();
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.edu.creategroup.primarypage.b$f */
    public static final class DialogInterface$OnClickListenerC36939f implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ CreateEduGroupFragment f94965a;

        DialogInterface$OnClickListenerC36939f(CreateEduGroupFragment bVar) {
            this.f94965a = bVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            this.f94965a.finish();
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.activity_create_edu_group, viewGroup, false);
    }
}
