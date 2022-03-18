package com.bytedance.ee.bear.sheet.actionsheet;

import android.app.Dialog;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import androidx.lifecycle.C1177w;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ee.bear.browser.plugin.C4950k;
import com.bytedance.ee.bear.document.independentpanel.IndependentDialogFragment;
import com.bytedance.ee.bear.watermark.interfaces.IWatermarkManager;
import com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e;
import com.bytedance.ee.bear.widgets.panel.CommonActionPanelLayout;
import com.bytedance.ee.util.p708k.AbstractC13687a;
import com.bytedance.ee.util.p718t.C13746i;
import com.bytedance.ee.util.p718t.C13749l;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KDeclarationContainer;
import org.koin.java.KoinJavaComponent;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 *2\u00020\u0001:\u0001*B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0002J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u0010\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u0010\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u0012\u0010\u001b\u001a\u00020\u00142\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J&\u0010\u001e\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\b\u0010#\u001a\u00020\u0014H\u0016J\u001a\u0010$\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\b\u0010%\u001a\u00020\u0014H\u0016J\u0010\u0010&\u001a\u00020\u00142\u0006\u0010'\u001a\u00020(H\u0002J\b\u0010)\u001a\u00020\u0014H\u0002R\u0014\u0010\u0003\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u0002\n\u0000¨\u0006+"}, d2 = {"Lcom/bytedance/ee/bear/sheet/actionsheet/ActionSheetFragment;", "Lcom/bytedance/ee/bear/document/independentpanel/IndependentDialogFragment;", "()V", "exitAnimDuration", "", "getExitAnimDuration", "()J", "mAdapter", "Lcom/bytedance/ee/bear/sheet/actionsheet/ActionSheetItemAdapter;", "mViewModel", "Lcom/bytedance/ee/bear/sheet/actionsheet/ActionSheetViewModel;", "panel", "Lcom/bytedance/ee/bear/widgets/panel/CommonActionPanelLayout;", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "root", "Landroid/widget/FrameLayout;", "getMeasuredHeight", "", "initPanel", "", "view", "Landroid/view/View;", "initRecyclerView", "onConfigurationChanged", "newConfig", "Landroid/content/res/Configuration;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onStart", "onViewCreated", "setViewModelInactive", "updateData", "sheetsActionSheetModel", "Lcom/bytedance/ee/bear/sheet/actionsheet/ActionSheetModel;", "updateDragViewHeight", "Companion", "sheet_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.sheet.a.a */
public final class ActionSheetFragment extends IndependentDialogFragment {

    /* renamed from: d */
    public static final String f29649d = f29649d;

    /* renamed from: e */
    public static final Companion f29650e = new Companion(null);

    /* renamed from: c */
    public ActionSheetViewModel f29651c;

    /* renamed from: f */
    private ActionSheetItemAdapter f29652f;

    /* renamed from: i */
    private FrameLayout f29653i;

    /* renamed from: j */
    private CommonActionPanelLayout f29654j;

    /* renamed from: k */
    private RecyclerView f29655k;

    /* renamed from: l */
    private final long f29656l = 200;

    /* renamed from: m */
    private HashMap f29657m;

    @Override // com.bytedance.ee.bear.document.independentpanel.IndependentDialogFragment
    /* renamed from: h */
    public void mo18784h() {
        HashMap hashMap = this.f29657m;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC1021b, androidx.fragment.app.Fragment, com.bytedance.ee.bear.document.independentpanel.IndependentDialogFragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo18784h();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/bytedance/ee/bear/sheet/actionsheet/ActionSheetFragment$Companion;", "", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "sheet_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.sheet.a.a$a */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: a */
        public final String mo42028a() {
            return ActionSheetFragment.f29649d;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.bytedance.ee.bear.document.independentpanel.IndependentDialogFragment
    /* renamed from: f */
    public long mo18782f() {
        return this.f29656l;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0005"}, d2 = {"com/bytedance/ee/bear/sheet/actionsheet/ActionSheetFragment$initPanel$1", "Lcom/bytedance/ee/bear/widgets/panel/CommonActionPanelLayout$SimpleActionListener;", "onClickLeftIcon", "", "onDragPanelToClose", "sheet_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.sheet.a.a$b */
    public static final class C11019b extends CommonActionPanelLayout.SimpleActionListener {

        /* renamed from: a */
        final /* synthetic */ ActionSheetFragment f29658a;

        @Override // com.bytedance.ee.bear.widgets.panel.CommonActionPanelLayout.OnActionListener, com.bytedance.ee.bear.widgets.panel.CommonActionPanelLayout.SimpleActionListener
        /* renamed from: c */
        public void mo18786c() {
            ActionSheetViewModel fVar = this.f29658a.f29651c;
            if (fVar != null) {
                fVar.onCancel();
            }
        }

        @Override // com.bytedance.ee.bear.widgets.panel.CommonActionPanelLayout.OnActionListener, com.bytedance.ee.bear.widgets.panel.CommonActionPanelLayout.SimpleActionListener
        /* renamed from: d */
        public void mo18838d() {
            ActionSheetViewModel fVar = this.f29658a.f29651c;
            if (fVar != null) {
                fVar.onCancel();
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C11019b(ActionSheetFragment aVar) {
            this.f29658a = aVar;
        }
    }

    @Override // com.bytedance.ee.bear.document.independentpanel.IndependentDialogFragment
    /* renamed from: g */
    public void mo18783g() {
        ActionSheetViewModel fVar = this.f29651c;
        if (fVar != null) {
            fVar.setActive(false);
        }
    }

    /* renamed from: j */
    private final int m45884j() {
        CommonActionPanelLayout commonActionPanelLayout = this.f29654j;
        if (commonActionPanelLayout != null) {
            commonActionPanelLayout.measure(0, 0);
        }
        CommonActionPanelLayout commonActionPanelLayout2 = this.f29654j;
        if (commonActionPanelLayout2 != null) {
            return commonActionPanelLayout2.getMeasuredHeight();
        }
        return 0;
    }

    /* renamed from: i */
    public final void mo42027i() {
        float f;
        float b = (float) C13749l.m55748b();
        Resources resources = getResources();
        Intrinsics.checkExpressionValueIsNotNull(resources, "resources");
        Configuration configuration = resources.getConfiguration();
        if (configuration == null || 2 != configuration.orientation) {
            f = 0.6f;
        } else {
            f = 0.8f;
        }
        float min = Math.min((float) m45884j(), b * f);
        CommonActionPanelLayout commonActionPanelLayout = this.f29654j;
        if (commonActionPanelLayout != null) {
            commonActionPanelLayout.mo45436a(BitmapDescriptorFactory.HUE_RED, min, min);
        }
        CommonActionPanelLayout commonActionPanelLayout2 = this.f29654j;
        if (commonActionPanelLayout2 != null) {
            commonActionPanelLayout2.mo45435a(min);
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC1021b, androidx.fragment.app.Fragment
    public void onStart() {
        Window window;
        super.onStart();
        Dialog v_ = v_();
        WindowManager.LayoutParams layoutParams = null;
        if (v_ != null) {
            window = v_.getWindow();
        } else {
            window = null;
        }
        if (window != null) {
            layoutParams = window.getAttributes();
        }
        if (layoutParams != null) {
            layoutParams.gravity = 80;
        }
        if (layoutParams != null) {
            layoutParams.y = C13746i.m55722a(getContext());
        }
        if (layoutParams != null) {
            layoutParams.windowAnimations = R.style.ActionSheetDialogAnimation;
        }
        if (window != null) {
            window.setAttributes(layoutParams);
        }
        if (window != null) {
            window.setLayout(-1, -1);
        }
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
        }
        mo5512a(false);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0015\u0010\u0002\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "p1", "Lcom/bytedance/ee/bear/sheet/actionsheet/ActionSheetItem;", "Lkotlin/ParameterName;", "name", "item", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.sheet.a.a$c */
    public static final /* synthetic */ class C11020c extends FunctionReference implements Function1<ActionSheetItem, Unit> {
        C11020c(ActionSheetViewModel fVar) {
            super(1, fVar);
        }

        @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.KCallable
        public final String getName() {
            return "onClickItem";
        }

        @Override // kotlin.jvm.internal.CallableReference
        public final KDeclarationContainer getOwner() {
            return Reflection.getOrCreateKotlinClass(ActionSheetViewModel.class);
        }

        @Override // kotlin.jvm.internal.CallableReference
        public final String getSignature() {
            return "onClickItem(Lcom/bytedance/ee/bear/sheet/actionsheet/ActionSheetItem;)V";
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ActionSheetItem cVar) {
            invoke(cVar);
            return Unit.INSTANCE;
        }

        public final void invoke(ActionSheetItem cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "p1");
            ((ActionSheetViewModel) this.receiver).onClickItem(cVar);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0014¨\u0006\u0006"}, d2 = {"com/bytedance/ee/bear/sheet/actionsheet/ActionSheetFragment$onCreate$1", "Lcom/bytedance/ee/util/observer/DiffObserver;", "Lcom/bytedance/ee/bear/sheet/actionsheet/ActionSheetModel;", "onChange", "", "model", "sheet_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.sheet.a.a$e */
    public static final class C11022e extends AbstractC13687a<ActionSheetModel> {

        /* renamed from: a */
        final /* synthetic */ ActionSheetFragment f29659a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C11022e(ActionSheetFragment aVar) {
            this.f29659a = aVar;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo18510a(ActionSheetModel eVar) {
            if (eVar != null) {
                this.f29659a.mo42026a(eVar);
                this.f29659a.mo42027i();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0014¨\u0006\u0006"}, d2 = {"com/bytedance/ee/bear/sheet/actionsheet/ActionSheetFragment$onViewCreated$1", "Lcom/bytedance/ee/bear/widgets/SafeClickListener;", "onClicked", "", "v", "Landroid/view/View;", "sheet_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.sheet.a.a$f */
    public static final class C11023f extends AbstractView$OnClickListenerC11839e {

        /* renamed from: a */
        final /* synthetic */ ActionSheetFragment f29660a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C11023f(ActionSheetFragment aVar) {
            this.f29660a = aVar;
        }

        /* access modifiers changed from: protected */
        @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
        /* renamed from: a */
        public void mo16698a(View view) {
            ActionSheetViewModel fVar = this.f29660a.f29651c;
            if (fVar != null) {
                fVar.onCancel();
            }
        }
    }

    /* renamed from: a */
    private final void m45882a(View view) {
        CommonActionPanelLayout commonActionPanelLayout = (CommonActionPanelLayout) view.findViewById(R.id.sheets_actionsheet_panel);
        this.f29654j = commonActionPanelLayout;
        if (commonActionPanelLayout != null) {
            commonActionPanelLayout.setOnActionListener(new C11019b(this));
        }
    }

    /* renamed from: a */
    public final void mo42026a(ActionSheetModel eVar) {
        String a = eVar.mo42050a();
        CommonActionPanelLayout commonActionPanelLayout = this.f29654j;
        if (commonActionPanelLayout != null) {
            commonActionPanelLayout.setTitleBarVisible(!TextUtils.isEmpty(a));
        }
        CommonActionPanelLayout commonActionPanelLayout2 = this.f29654j;
        if (commonActionPanelLayout2 != null) {
            commonActionPanelLayout2.setTitle(a);
        }
        ActionSheetItemAdapter dVar = this.f29652f;
        if (dVar != null) {
            dVar.mo42045a(eVar.mo42053b());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onConfigurationChanged(Configuration configuration) {
        Intrinsics.checkParameterIsNotNull(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        mo42027i();
        FrameLayout frameLayout = this.f29653i;
        if (frameLayout != null) {
            ((IWatermarkManager) KoinJavaComponent.m268613a(IWatermarkManager.class, null, null, 6, null)).mo40653b(frameLayout);
            ((IWatermarkManager) KoinJavaComponent.m268613a(IWatermarkManager.class, null, null, 6, null)).mo40646a(frameLayout);
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC1021b, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        C1177w<ActionSheetModel> sheetsActionSheetModel;
        super.onCreate(bundle);
        ActionSheetViewModel fVar = (ActionSheetViewModel) C4950k.m20474a(this, ActionSheetViewModel.class);
        this.f29651c = fVar;
        if (fVar != null && (sheetsActionSheetModel = fVar.getSheetsActionSheetModel()) != null) {
            sheetsActionSheetModel.mo5923a(this, new C11022e(this));
        }
    }

    /* renamed from: b */
    private final void m45883b(View view) {
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.sheets_actionsheet_list);
        this.f29655k = recyclerView;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        }
        ActionSheetItemAdapter dVar = new ActionSheetItemAdapter();
        this.f29652f = dVar;
        ActionSheetViewModel fVar = this.f29651c;
        if (fVar != null) {
            if (dVar != null) {
                dVar.mo42046a(new C11020c(fVar));
            }
            ActionSheetItemAdapter dVar2 = this.f29652f;
            if (dVar2 != null) {
                dVar2.mo42047a(new C11021d(fVar));
            }
        }
        RecyclerView recyclerView2 = this.f29655k;
        if (recyclerView2 != null) {
            recyclerView2.setAdapter(this.f29652f);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0015\u0010\u0002\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u00062\u0015\u0010\u0007\u001a\u00110\b¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\t¢\u0006\u0002\b\n"}, d2 = {"<anonymous>", "", "p1", "Lcom/bytedance/ee/bear/sheet/actionsheet/ActionSheetItem;", "Lkotlin/ParameterName;", "name", "item", "p2", "Lcom/bytedance/ee/bear/sheet/actionsheet/RightIcon;", "rightIcon", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.sheet.a.a$d */
    public static final /* synthetic */ class C11021d extends FunctionReference implements Function2<ActionSheetItem, RightIcon, Unit> {
        C11021d(ActionSheetViewModel fVar) {
            super(2, fVar);
        }

        @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.KCallable
        public final String getName() {
            return "onClickItemRightIcon";
        }

        @Override // kotlin.jvm.internal.CallableReference
        public final KDeclarationContainer getOwner() {
            return Reflection.getOrCreateKotlinClass(ActionSheetViewModel.class);
        }

        @Override // kotlin.jvm.internal.CallableReference
        public final String getSignature() {
            return "onClickItemRightIcon(Lcom/bytedance/ee/bear/sheet/actionsheet/ActionSheetItem;Lcom/bytedance/ee/bear/sheet/actionsheet/RightIcon;)V";
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(ActionSheetItem cVar, RightIcon hVar) {
            invoke(cVar, hVar);
            return Unit.INSTANCE;
        }

        public final void invoke(ActionSheetItem cVar, RightIcon hVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "p1");
            Intrinsics.checkParameterIsNotNull(hVar, "p2");
            ((ActionSheetViewModel) this.receiver).onClickItemRightIcon(cVar, hVar);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.onViewCreated(view, bundle);
        this.f29653i = (FrameLayout) view.findViewById(R.id.sheets_actionsheet_root);
        view.setOnClickListener(new C11023f(this));
        m45882a(view);
        m45883b(view);
        ((IWatermarkManager) KoinJavaComponent.m268613a(IWatermarkManager.class, null, null, 6, null)).mo40646a(this.f29653i);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.sheets_actionsheet_fragment, viewGroup, false);
    }
}
