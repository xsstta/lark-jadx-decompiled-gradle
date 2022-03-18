package com.ss.android.lark.todo.impl.features.detail;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.C1177w;
import com.huawei.hms.location.ActivityIdentificationData;
import com.larksuite.component.universe_design.button.UDButton;
import com.larksuite.framework.p1173a.p1174a.C25877a;
import com.larksuite.framework.section.IActionDispatcher;
import com.larksuite.framework.section.IViewAbility;
import com.larksuite.framework.section.IViewModelAbility;
import com.larksuite.framework.section.SectionManager;
import com.larksuite.framework.section.ViewSection;
import com.larksuite.framework.section.utils.DebounceView;
import com.larksuite.framework.section.utils.MutableLiveDataPlus;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.keyboard.plugin.input.RichTextEmojiconEditText;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.todo.impl.features.detail.DetailBaseFragment;
import com.ss.android.lark.todo.impl.features.detail.sections.AssigneeInlineSection;
import com.ss.android.lark.todo.impl.features.detail.sections.SummaryInlineSection;
import com.ss.android.lark.todo.impl.features.detail.sections.TimeInlineSection;
import com.ss.android.lark.todo.impl.features.detail.viewmodel.ITodoDetailViewDataStore;
import com.ss.android.lark.todo.impl.features.detail.viewmodel.ITodoKeyboardViewModel;
import com.ss.android.lark.todo.impl.features.detail.viewmodel.RichTextShowBean;
import com.ss.android.lark.todo.impl.features.detail.viewmodel.SummaryInlineViewModel;
import com.ss.android.lark.todo.impl.features.detail.viewmodel.TodoDetailModel;
import com.ss.android.lark.todo.impl.features.detail.viewmodel.TodoKeyboardViewModel;
import com.ss.android.lark.todo.impl.features.detail.widget.KeyboardScrollView;
import com.ss.android.lark.todo.impl.framework.hitpoint.event.TodoGeneralHitPoint;
import com.ss.android.lark.todo.impl.framework.hitpoint.event.TodoHitPoint;
import com.ss.android.lark.todo.impl.utils.LogMessageUtil;
import com.ss.android.lark.todo.impl.utils.ResUtil;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u00012\u00020\u0002:\u00014B\u0005¢\u0006\u0002\u0010\u0003J\u0006\u0010\u0018\u001a\u00020\u0019J\b\u0010\u001a\u001a\u00020\u001bH\u0002J\u001c\u0010\u001c\u001a\u00020\u001b2\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u0015H\u0016J\b\u0010\u001e\u001a\u00020\u001bH\u0002J\b\u0010\u001f\u001a\u00020\u001bH\u0002J\b\u0010 \u001a\u00020\u0005H\u0002J\b\u0010!\u001a\u00020\u0005H\u0002J&\u0010\"\u001a\u0004\u0018\u00010#2\u0006\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010'2\b\u0010(\u001a\u0004\u0018\u00010)H\u0016J\u0010\u0010*\u001a\u00020\u001b2\u0006\u0010+\u001a\u00020\u0005H\u0016J\b\u0010,\u001a\u00020\u001bH\u0016J\b\u0010-\u001a\u00020\u001bH\u0016J\b\u0010.\u001a\u00020\u001bH\u0016J\b\u0010/\u001a\u00020\u001bH\u0002J\"\u00100\u001a\u00020\u001b2\u0006\u00101\u001a\u00020\u00132\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u0015J\b\u00102\u001a\u00020\u001bH\u0016J\u0010\u00103\u001a\u00020\u001b2\u0006\u0010+\u001a\u00020\u0005H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\r\"\u0004\b\u0011\u0010\u000fR\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0015X\u000e¢\u0006\u0002\n\u0000¨\u00065"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/detail/TodoKeyboardFragment;", "Lcom/ss/android/lark/todo/impl/features/detail/DetailBaseFragment;", "Lcom/ss/android/lark/todo/impl/features/detail/IMVInitiator;", "()V", "createFromActionNext", "", "finishCallback", "Lcom/ss/android/lark/todo/impl/features/detail/DetailBaseFragment$FinishCallBack;", "getFinishCallback", "()Lcom/ss/android/lark/todo/impl/features/detail/DetailBaseFragment$FinishCallBack;", "setFinishCallback", "(Lcom/ss/android/lark/todo/impl/features/detail/DetailBaseFragment$FinishCallBack;)V", "isAddToActivity", "()Z", "setAddToActivity", "(Z)V", "isFragVisible", "setFragVisible", "mViewModel", "Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/TodoKeyboardViewModel;", "sectionManager", "Lcom/larksuite/framework/section/SectionManager;", "Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/ITodoDetailViewDataStore;", "Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/TodoDetailModel;", "getToastY", "", "hideKeyboard", "", "initMVComposer", "sectionMgr", "initView", "initViewModel", "isCreateFromMessageToolbar", "isShowCreateAndSend", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onFragVisibilityChange", "isVisible", "onResume", "onStop", "refreshPage", "requestFocus", "setViewModel", "viewModel", "syncData", "updateFragmentVisible", "ActionManager", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.impl.features.detail.e */
public final class TodoKeyboardFragment extends DetailBaseFragment implements IMVInitiator {

    /* renamed from: a */
    public TodoKeyboardViewModel f140069a;

    /* renamed from: b */
    public SectionManager<ITodoDetailViewDataStore, TodoDetailModel> f140070b;

    /* renamed from: c */
    private boolean f140071c;

    /* renamed from: d */
    private boolean f140072d;

    /* renamed from: e */
    private boolean f140073e;

    /* renamed from: f */
    private DetailBaseFragment.FinishCallBack f140074f = new C56693b();

    /* renamed from: g */
    private HashMap f140075g;

    @Override // com.ss.android.lark.todo.impl.features.detail.DetailBaseFragment
    /* renamed from: a */
    public View mo192093a(int i) {
        if (this.f140075g == null) {
            this.f140075g = new HashMap();
        }
        View view = (View) this.f140075g.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f140075g.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.ss.android.lark.todo.impl.features.detail.DetailBaseFragment
    /* renamed from: d */
    public void mo192102d() {
    }

    @Override // com.ss.android.lark.todo.impl.features.detail.DetailBaseFragment
    /* renamed from: e */
    public void mo192103e() {
    }

    @Override // com.ss.android.lark.todo.impl.features.detail.DetailBaseFragment
    /* renamed from: f */
    public void mo192104f() {
        HashMap hashMap = this.f140075g;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.base.fragment.BaseFragment, com.ss.android.lark.todo.impl.features.detail.DetailBaseFragment, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo192104f();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/todo/impl/features/detail/TodoKeyboardFragment$finishCallback$1", "Lcom/ss/android/lark/todo/impl/features/detail/DetailBaseFragment$FinishCallBack;", "onFinish", "", "fragment", "Lcom/ss/android/lark/todo/impl/features/detail/DetailBaseFragment;", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.e$b */
    public static final class C56693b implements DetailBaseFragment.FinishCallBack {
        C56693b() {
        }
    }

    @Override // com.ss.android.lark.todo.impl.features.detail.DetailBaseFragment
    /* renamed from: a */
    public boolean mo192097a() {
        return this.f140073e;
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (this.f140072d) {
            m220525c(true);
        }
    }

    /* renamed from: i */
    private final void m220527i() {
        TodoKeyboardViewModel afVar = this.f140069a;
        if (afVar != null) {
            afVar.getKeyboardViewModel().getState().mo5923a(getViewLifecycleOwner(), new C56702k(afVar, this));
        }
    }

    /* renamed from: j */
    private final void m220528j() {
        TodoDetailModel e;
        C1177w<Boolean> keyboardSummaryRequestFocus;
        SectionManager<ITodoDetailViewDataStore, TodoDetailModel> hVar = this.f140070b;
        if (hVar != null && (e = hVar.mo92076e()) != null && (keyboardSummaryRequestFocus = e.getKeyboardSummaryRequestFocus()) != null) {
            keyboardSummaryRequestFocus.mo5926a((Boolean) true);
        }
    }

    /* renamed from: k */
    private final boolean m220529k() {
        ITodoKeyboardViewModel keyboardViewModel;
        TodoKeyboardViewModel afVar = this.f140069a;
        if (afVar == null || (keyboardViewModel = afVar.getKeyboardViewModel()) == null) {
            return false;
        }
        return keyboardViewModel.getCreateFromMessageToolbar();
    }

    /* renamed from: l */
    private final boolean m220530l() {
        ITodoKeyboardViewModel keyboardViewModel;
        TodoKeyboardViewModel afVar = this.f140069a;
        if (afVar == null || (keyboardViewModel = afVar.getKeyboardViewModel()) == null) {
            return false;
        }
        return keyboardViewModel.isShowCreateAndSend();
    }

    /* renamed from: g */
    public final int mo192699g() {
        if (!this.f140071c) {
            return 0;
        }
        this.f140071c = false;
        int[] iArr = new int[2];
        ((RichTextEmojiconEditText) mo192093a(R.id.input_content)).getLocationOnScreen(iArr);
        return iArr[1];
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        if (this.f140072d) {
            m220525c(false);
        }
        TodoKeyboardViewModel afVar = this.f140069a;
        if (afVar != null) {
            afVar.getKeyboardViewModel().saveDraft();
        }
        Log.m165389i(getTag(), LogMessageUtil.f139260a.mo191765a("onStop"));
    }

    /* renamed from: h */
    private final void m220526h() {
        int i;
        int i2;
        TodoGeneralHitPoint.f141070a.mo194204h();
        UDButton uDButton = (UDButton) mo192093a(R.id.button_create);
        Intrinsics.checkExpressionValueIsNotNull(uDButton, "button_create");
        uDButton.setEnabled(false);
        ((UDButton) mo192093a(R.id.button_create)).setStrokeColor(ResUtil.f139261a.mo191775a(R.color.text_disable));
        UDButton uDButton2 = (UDButton) mo192093a(R.id.button_create);
        if (m220530l()) {
            i = R.string.Todo_Task_CreateAndSendButton;
        } else {
            i = R.string.Todo_Task_CreateButton;
        }
        uDButton2.setText(i);
        SectionManager<ITodoDetailViewDataStore, TodoDetailModel> hVar = this.f140070b;
        if (hVar != null) {
            UDButton uDButton3 = (UDButton) mo192093a(R.id.button_create);
            Intrinsics.checkExpressionValueIsNotNull(uDButton3, "button_create");
            C25877a.m93661a(new DebounceView(uDButton3, 0, 2, null), hVar.mo92075d(), ActivityIdentificationData.WALKING, 0, 4, null);
        }
        ((ImageView) mo192093a(R.id.input_expand)).setOnClickListener(new View$OnClickListenerC56699h(this));
        ImageView imageView = (ImageView) mo192093a(R.id.input_close);
        Intrinsics.checkExpressionValueIsNotNull(imageView, "input_close");
        if (m220529k()) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        imageView.setVisibility(i2);
        ((ImageView) mo192093a(R.id.input_close)).setOnClickListener(new View$OnClickListenerC56700i(this));
        Ref.IntRef intRef = new Ref.IntRef();
        intRef.element = 0;
        SectionManager<ITodoDetailViewDataStore, TodoDetailModel> hVar2 = this.f140070b;
        if (!(hVar2 == null || hVar2.mo92048a() == null)) {
            intRef.element = UIUtils.dp2px(getContext(), 16.0f);
        }
        ((KeyboardScrollView) mo192093a(R.id.selected_condition_list)).setOnScrollChangeListener(new C56701j(this, intRef));
    }

    @Override // com.ss.android.lark.todo.impl.features.detail.DetailBaseFragment
    /* renamed from: a */
    public void mo192096a(boolean z) {
        this.f140073e = z;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00060\u0001R\u00020\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\n¢\u0006\u0002\b\u0006¨\u0006\u0007"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/todo/impl/features/detail/TodoKeyboardFragment$ActionManager;", "Lcom/ss/android/lark/todo/impl/features/detail/TodoKeyboardFragment;", "it", "Lcom/larksuite/framework/section/IViewAbility;", "Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/ITodoDetailViewDataStore;", "invoke", "com/ss/android/lark/todo/impl/features/detail/TodoKeyboardFragment$initMVComposer$1$3"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.e$c */
    static final class C56694c extends Lambda implements Function1<IViewAbility<ITodoDetailViewDataStore>, ActionManager> {
        final /* synthetic */ SectionManager $sectionMgr$inlined;
        final /* synthetic */ TodoKeyboardFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56694c(TodoKeyboardFragment eVar, SectionManager hVar) {
            super(1);
            this.this$0 = eVar;
            this.$sectionMgr$inlined = hVar;
        }

        public final ActionManager invoke(IViewAbility<ITodoDetailViewDataStore> fVar) {
            Intrinsics.checkParameterIsNotNull(fVar, "it");
            return new ActionManager(this.this$0, fVar);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/SummaryInlineViewModel;", "it", "Lcom/larksuite/framework/section/IViewModelAbility;", "Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/TodoDetailModel;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.e$g */
    static final class C56698g extends Lambda implements Function1<IViewModelAbility<TodoDetailModel>, SummaryInlineViewModel> {
        public static final C56698g INSTANCE = new C56698g();

        C56698g() {
            super(1);
        }

        public final SummaryInlineViewModel invoke(IViewModelAbility<TodoDetailModel> gVar) {
            Intrinsics.checkParameterIsNotNull(gVar, "it");
            return new SummaryInlineViewModel(gVar);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/todo/impl/features/detail/sections/TimeInlineSection;", "it", "Lcom/larksuite/framework/section/IViewAbility;", "Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/ITodoDetailViewDataStore;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.e$d */
    static final class C56695d extends Lambda implements Function1<IViewAbility<ITodoDetailViewDataStore>, TimeInlineSection> {
        final /* synthetic */ View $rootView;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56695d(View view) {
            super(1);
            this.$rootView = view;
        }

        public final TimeInlineSection invoke(IViewAbility<ITodoDetailViewDataStore> fVar) {
            Intrinsics.checkParameterIsNotNull(fVar, "it");
            View view = this.$rootView;
            Intrinsics.checkExpressionValueIsNotNull(view, "rootView");
            return new TimeInlineSection(view, fVar);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/todo/impl/features/detail/sections/AssigneeInlineSection;", "it", "Lcom/larksuite/framework/section/IViewAbility;", "Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/ITodoDetailViewDataStore;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.e$e */
    static final class C56696e extends Lambda implements Function1<IViewAbility<ITodoDetailViewDataStore>, AssigneeInlineSection> {
        final /* synthetic */ View $rootView;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56696e(View view) {
            super(1);
            this.$rootView = view;
        }

        public final AssigneeInlineSection invoke(IViewAbility<ITodoDetailViewDataStore> fVar) {
            Intrinsics.checkParameterIsNotNull(fVar, "it");
            View view = this.$rootView;
            Intrinsics.checkExpressionValueIsNotNull(view, "rootView");
            return new AssigneeInlineSection(view, fVar);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/todo/impl/features/detail/sections/SummaryInlineSection;", "it", "Lcom/larksuite/framework/section/IViewAbility;", "Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/ITodoDetailViewDataStore;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.e$f */
    static final class C56697f extends Lambda implements Function1<IViewAbility<ITodoDetailViewDataStore>, SummaryInlineSection> {
        final /* synthetic */ View $rootView;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56697f(View view) {
            super(1);
            this.$rootView = view;
        }

        public final SummaryInlineSection invoke(IViewAbility<ITodoDetailViewDataStore> fVar) {
            Intrinsics.checkParameterIsNotNull(fVar, "it");
            View view = this.$rootView;
            Intrinsics.checkExpressionValueIsNotNull(view, "rootView");
            return new SummaryInlineSection(view, fVar);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.e$i */
    public static final class View$OnClickListenerC56700i implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ TodoKeyboardFragment f140078a;

        View$OnClickListenerC56700i(TodoKeyboardFragment eVar) {
            this.f140078a = eVar;
        }

        public final void onClick(View view) {
            this.f140078a.setResult(-1, new Intent());
            this.f140078a.finish();
        }
    }

    /* renamed from: c */
    private final void m220525c(boolean z) {
        FragmentActivity activity = getActivity();
        if (!(activity instanceof TodoDetailActivity)) {
            activity = null;
        }
        TodoDetailActivity todoDetailActivity = (TodoDetailActivity) activity;
        if (todoDetailActivity != null) {
            todoDetailActivity.mo192029a(z);
        }
        if (z) {
            m220528j();
        }
    }

    @Override // com.ss.android.lark.todo.impl.features.detail.DetailBaseFragment
    /* renamed from: b */
    public void mo192100b(boolean z) {
        SectionManager<ITodoDetailViewDataStore, TodoDetailModel> hVar;
        IActionDispatcher d;
        this.f140072d = z;
        m220525c(z);
        if (z && (hVar = this.f140070b) != null && (d = hVar.mo92075d()) != null) {
            d.mo92064a(82);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.e$h */
    public static final class View$OnClickListenerC56699h implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ TodoKeyboardFragment f140077a;

        View$OnClickListenerC56699h(TodoKeyboardFragment eVar) {
            this.f140077a = eVar;
        }

        public final void onClick(View view) {
            TodoGeneralHitPoint.f141070a.mo194206i();
            TodoHitPoint.f141073a.mo194223b(true);
            TodoKeyboardViewModel afVar = this.f140077a.f140069a;
            if (afVar != null) {
                afVar.getKeyboardViewModel().saveDraft();
            }
            FragmentActivity activity = this.f140077a.getActivity();
            if (activity != null && (activity instanceof TodoDetailActivity)) {
                ((TodoDetailActivity) activity).mo192041k();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/todo/impl/features/detail/TodoKeyboardFragment$initView$5", "Lcom/ss/android/lark/todo/impl/features/detail/widget/KeyboardScrollView$OnScrollChangeListener;", "onDrawChange", "", "view", "Lcom/ss/android/lark/todo/impl/features/detail/widget/KeyboardScrollView;", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.e$j */
    public static final class C56701j implements KeyboardScrollView.OnScrollChangeListener {

        /* renamed from: a */
        final /* synthetic */ TodoKeyboardFragment f140079a;

        /* renamed from: b */
        final /* synthetic */ Ref.IntRef f140080b;

        @Override // com.ss.android.lark.todo.impl.features.detail.widget.KeyboardScrollView.OnScrollChangeListener
        /* renamed from: a */
        public void mo192707a(KeyboardScrollView keyboardScrollView) {
            Intrinsics.checkParameterIsNotNull(keyboardScrollView, "view");
            View a = this.f140079a.mo192093a(R.id.shader);
            Intrinsics.checkExpressionValueIsNotNull(a, "shader");
            boolean z = false;
            View childAt = keyboardScrollView.getChildAt(0);
            Intrinsics.checkExpressionValueIsNotNull(childAt, "view.getChildAt(\n                    0)");
            if (childAt.getMeasuredWidth() - this.f140080b.element > keyboardScrollView.getScrollX() + keyboardScrollView.getWidth()) {
                z = true;
            }
            C25877a.m93659a(a, z);
        }

        C56701j(TodoKeyboardFragment eVar, Ref.IntRef intRef) {
            this.f140079a = eVar;
            this.f140080b = intRef;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "state", "Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/ITodoKeyboardViewModel$State;", "kotlin.jvm.PlatformType", "onChanged", "com/ss/android/lark/todo/impl/features/detail/TodoKeyboardFragment$initViewModel$1$1"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.e$k */
    public static final class C56702k<T> implements AbstractC1178x<ITodoKeyboardViewModel.State> {

        /* renamed from: a */
        final /* synthetic */ TodoKeyboardViewModel f140081a;

        /* renamed from: b */
        final /* synthetic */ TodoKeyboardFragment f140082b;

        C56702k(TodoKeyboardViewModel afVar, TodoKeyboardFragment eVar) {
            this.f140081a = afVar;
            this.f140082b = eVar;
        }

        /* renamed from: a */
        public final void onChanged(ITodoKeyboardViewModel.State state) {
            TodoDetailModel e;
            MutableLiveDataPlus<RichTextShowBean> summaryInlineShowRichText;
            if (state == ITodoKeyboardViewModel.State.CreateSuccess) {
                this.f140081a.getKeyboardViewModel().reset();
                SectionManager<ITodoDetailViewDataStore, TodoDetailModel> hVar = this.f140082b.f140070b;
                if (!(hVar == null || (e = hVar.mo92076e()) == null || (summaryInlineShowRichText = e.getSummaryInlineShowRichText()) == null)) {
                    summaryInlineShowRichText.mo5929b(new RichTextShowBean(this.f140081a.getKeyboardViewModel().getRichTextSummary(), true, true));
                }
                ((RichTextEmojiconEditText) this.f140082b.mo192093a(R.id.input_content)).requestFocus();
            }
        }
    }

    @Override // com.ss.android.lark.todo.impl.features.detail.DetailBaseFragment
    /* renamed from: a */
    public void mo192095a(SectionManager<ITodoDetailViewDataStore, TodoDetailModel> hVar) {
        Intrinsics.checkParameterIsNotNull(hVar, "sectionMgr");
        View view = getView();
        if (view != null) {
            this.f140070b = hVar;
            m220526h();
            m220527i();
            hVar.mo92078a(new C56695d(view));
            hVar.mo92078a(new C56696e(view));
            hVar.mo92078a(new C56694c(this, hVar));
            hVar.mo92078a(new C56697f(view));
            hVar.mo92079b(C56698g.INSTANCE);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016J\b\u0010\u000b\u001a\u00020\u0007H\u0016J\b\u0010\f\u001a\u00020\u0007H\u0016¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/detail/TodoKeyboardFragment$ActionManager;", "Lcom/larksuite/framework/section/ViewSection;", "Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/ITodoDetailViewDataStore;", "viewAbility", "Lcom/larksuite/framework/section/IViewAbility;", "(Lcom/ss/android/lark/todo/impl/features/detail/TodoKeyboardFragment;Lcom/larksuite/framework/section/IViewAbility;)V", "handleAction", "", "action", "", "actionData", "initViewAction", "initViewObserver", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.e$a */
    public final class ActionManager extends ViewSection<ITodoDetailViewDataStore> {

        /* renamed from: a */
        final /* synthetic */ TodoKeyboardFragment f140076a;

        @Override // com.larksuite.framework.section.ViewSection
        /* renamed from: f */
        public void mo92109f() {
        }

        @Override // com.larksuite.framework.section.ViewSection
        /* renamed from: g */
        public void mo92110g() {
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ActionManager(TodoKeyboardFragment eVar, IViewAbility<ITodoDetailViewDataStore> fVar) {
            super(fVar);
            Intrinsics.checkParameterIsNotNull(fVar, "viewAbility");
            this.f140076a = eVar;
        }

        @Override // com.larksuite.framework.section.ViewSection
        /* renamed from: a */
        public void mo92098a(int i, int i2) {
            int i3;
            boolean z;
            if (i == 520) {
                UDButton uDButton = (UDButton) this.f140076a.mo192093a(R.id.button_create);
                if (uDButton != null) {
                    if (i2 > 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    uDButton.setEnabled(z);
                }
                UDButton uDButton2 = (UDButton) this.f140076a.mo192093a(R.id.button_create);
                if (uDButton2 != null) {
                    ResUtil eVar = ResUtil.f139261a;
                    if (i2 > 0) {
                        i3 = R.color.primary_pri_500;
                    } else {
                        i3 = R.color.text_disable;
                    }
                    uDButton2.setStrokeColor(eVar.mo191775a(i3));
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo192698a(TodoKeyboardViewModel afVar, SectionManager<ITodoDetailViewDataStore, TodoDetailModel> hVar) {
        Intrinsics.checkParameterIsNotNull(afVar, "viewModel");
        Intrinsics.checkParameterIsNotNull(hVar, "sectionMgr");
        this.f140069a = afVar;
        this.f140070b = hVar;
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        return mo192094a(layoutInflater, R.layout.todo_keyboard);
    }
}
