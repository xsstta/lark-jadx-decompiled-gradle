package com.ss.android.lark.todo.impl.features.detail.sections;

import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.appcompat.p017a.p018a.C0215a;
import com.huawei.hms.feature.dynamic.DynamicModule;
import com.larksuite.component.universe_design.button.UDButton;
import com.larksuite.component.universe_design.dialog.UDDialogBuilder;
import com.larksuite.component.universe_design.dialog.UDListDialogController;
import com.larksuite.component.universe_design.dialog.actionpanel.UDActionPanelBuilder;
import com.larksuite.framework.p1173a.p1174a.C25877a;
import com.larksuite.framework.section.IViewAbility;
import com.larksuite.framework.section.ViewSection;
import com.larksuite.suite.R;
import com.ss.android.lark.todo.impl.features.detail.viewmodel.ITodoDetailViewDataStore;
import com.ss.android.lark.todo.impl.utils.ResUtil;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u0010\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\b\u0010\u0014\u001a\u00020\u000eH\u0016J\b\u0010\u0015\u001a\u00020\u000eH\u0016J\b\u0010\u0016\u001a\u00020\u000eH\u0002J\u0018\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u0013H\u0002J\u0010\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u0013H\u0002J\u0010\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u0013H\u0002J\b\u0010\u001e\u001a\u00020\u000eH\u0002J\b\u0010\u001f\u001a\u00020\u000eH\u0002R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lcom/ss/android/lark/todo/impl/features/detail/sections/BottomContainerSection;", "Lcom/larksuite/framework/section/ViewSection;", "Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/ITodoDetailViewDataStore;", "view", "Landroid/view/View;", "viewAbility", "Lcom/larksuite/framework/section/IViewAbility;", "(Landroid/view/View;Lcom/larksuite/framework/section/IViewAbility;)V", "createDoneListener", "Landroid/view/View$OnClickListener;", "followListener", "todoDoneListener", "userDoneListener", "initDoneOrFollowBtn", "", "state", "", "initDraftRedDot", "has", "", "initViewAction", "initViewObserver", "showCompleteAllUserDialog", "showCreateAndAssigneeButton", "assigneeComplete", "todoComplete", "showOnlyCreateOrAssigneeButton", "complete", "showOnlyFollowerButton", "isFollow", "showUnCompleteAllUserDialog", "showUnFollowDialog", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.impl.features.detail.d.f */
public final class BottomContainerSection extends ViewSection<ITodoDetailViewDataStore> {

    /* renamed from: a */
    public final View f139973a;

    /* renamed from: b */
    private final View.OnClickListener f139974b;

    /* renamed from: c */
    private final View.OnClickListener f139975c;

    /* renamed from: d */
    private final View.OnClickListener f139976d;

    /* renamed from: e */
    private View.OnClickListener f139977e = new View$OnClickListenerC56592b(this);

    @Override // com.larksuite.framework.section.ViewSection
    /* renamed from: g */
    public void mo92110g() {
        ((UDButton) this.f139973a.findViewById(R.id.comment_btn)).setOnClickListener(new View$OnClickListenerC56593c(this));
    }

    /* renamed from: k */
    public final void mo192568k() {
        ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) new UDDialogBuilder(mo92106c()).title(R.string.Todo_CollabTask_CompletedTask)).message(R.string.Todo_CollabTask_NotCompletedDialog)).addActionButton(R.id.ud_dialog_btn_primary, R.string.Todo_CollabTask_ConfirmComplete, new DialogInterface$OnClickListenerC56600j(this))).addActionButton(R.id.ud_dialog_btn_secondary, R.string.Todo_CollabTask_CancelButton, (DialogInterface.OnClickListener) null)).show();
    }

    /* renamed from: l */
    public final void mo192569l() {
        ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) new UDDialogBuilder(mo92106c()).title(R.string.Todo_CollabTask_RestoreTask)).message(R.string.Todo_CollabTask_RestoreTaskDesc)).addActionButton(R.id.ud_dialog_btn_primary, R.string.Todo_CollabTask_ComfirmRestore, new DialogInterface$OnClickListenerC56601k(this))).addActionButton(R.id.ud_dialog_btn_secondary, R.string.Todo_CollabTask_CancelButton, (DialogInterface.OnClickListener) null)).show();
    }

    @Override // com.larksuite.framework.section.ViewSection
    /* renamed from: f */
    public void mo92109f() {
        ITodoDetailViewDataStore qVar = (ITodoDetailViewDataStore) mo92096a();
        mo92103a(qVar.getBottomButtonVisible(), new C56594d(this));
        mo92103a(qVar.getBottomUnFollowDialog(), new C56595e(this));
        mo92103a(qVar.getBottomButtonState(), new C56596f(this));
        mo92103a(qVar.getBottomHasDraft(), new C56597g(this));
        mo92103a(qVar.getAllUsersCompletedDialog(), new C56598h(this));
        mo92103a(qVar.getAllUsersUnCompletedDialog(), new C56599i(this));
    }

    /* renamed from: j */
    public final void mo192567j() {
        ((UDActionPanelBuilder) ((UDActionPanelBuilder) ((UDActionPanelBuilder) ((UDActionPanelBuilder) new UDActionPanelBuilder(mo92106c()).title(R.string.Todo_Task_UnfollowCantSeeInTaskCenter)).mo90870a(CollectionsKt.listOf(ResUtil.f139261a.mo191781c(R.string.Todo_Task_Unfollow)))).mo90869a(new C56602l(this))).addActionButton(R.id.ud_dialog_btn_cancel, R.string.Todo_Task_CancelButton, (DialogInterface.OnClickListener) null)).show();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "com/ss/android/lark/todo/impl/features/detail/sections/BottomContainerSection$initViewObserver$1$2"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.d.f$e */
    static final class C56595e extends Lambda implements Function1<Boolean, Unit> {
        final /* synthetic */ BottomContainerSection this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56595e(BottomContainerSection fVar) {
            super(1);
            this.this$0 = fVar;
        }

        public final void invoke(boolean z) {
            this.this$0.mo192567j();
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "com/ss/android/lark/todo/impl/features/detail/sections/BottomContainerSection$initViewObserver$1$3"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.d.f$f */
    static final class C56596f extends Lambda implements Function1<Integer, Unit> {
        final /* synthetic */ BottomContainerSection this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56596f(BottomContainerSection fVar) {
            super(1);
            this.this$0 = fVar;
        }

        public final void invoke(int i) {
            this.this$0.mo192566b(i);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(Integer num) {
            invoke(num.intValue());
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "com/ss/android/lark/todo/impl/features/detail/sections/BottomContainerSection$initViewObserver$1$4"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.d.f$g */
    static final class C56597g extends Lambda implements Function1<Boolean, Unit> {
        final /* synthetic */ BottomContainerSection this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56597g(BottomContainerSection fVar) {
            super(1);
            this.this$0 = fVar;
        }

        public final void invoke(boolean z) {
            this.this$0.mo192565a(z);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "com/ss/android/lark/todo/impl/features/detail/sections/BottomContainerSection$initViewObserver$1$5"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.d.f$h */
    static final class C56598h extends Lambda implements Function1<Boolean, Unit> {
        final /* synthetic */ BottomContainerSection this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56598h(BottomContainerSection fVar) {
            super(1);
            this.this$0 = fVar;
        }

        public final void invoke(boolean z) {
            this.this$0.mo192568k();
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "com/ss/android/lark/todo/impl/features/detail/sections/BottomContainerSection$initViewObserver$1$6"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.d.f$i */
    static final class C56599i extends Lambda implements Function1<Boolean, Unit> {
        final /* synthetic */ BottomContainerSection this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56599i(BottomContainerSection fVar) {
            super(1);
            this.this$0 = fVar;
        }

        public final void invoke(boolean z) {
            this.this$0.mo192569l();
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/todo/impl/features/detail/sections/BottomContainerSection$showUnFollowDialog$1", "Lcom/larksuite/component/universe_design/dialog/UDListDialogController$OnItemClickListener;", "onItemClick", "", "index", "", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.d.f$l */
    public static final class C56602l implements UDListDialogController.OnItemClickListener {

        /* renamed from: a */
        final /* synthetic */ BottomContainerSection f139983a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C56602l(BottomContainerSection fVar) {
            this.f139983a = fVar;
        }

        @Override // com.larksuite.component.universe_design.dialog.UDListDialogController.OnItemClickListener
        public void onItemClick(int i) {
            if (i == 0) {
                this.f139983a.mo92107d().mo92064a(253);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.d.f$a */
    static final class View$OnClickListenerC56591a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ BottomContainerSection f139978a;

        View$OnClickListenerC56591a(BottomContainerSection fVar) {
            this.f139978a = fVar;
        }

        public final void onClick(View view) {
            this.f139978a.mo92107d().mo92064a(259);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.d.f$b */
    static final class View$OnClickListenerC56592b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ BottomContainerSection f139979a;

        View$OnClickListenerC56592b(BottomContainerSection fVar) {
            this.f139979a = fVar;
        }

        public final void onClick(View view) {
            this.f139979a.mo92107d().mo92064a(37);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.d.f$c */
    static final class View$OnClickListenerC56593c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ BottomContainerSection f139980a;

        View$OnClickListenerC56593c(BottomContainerSection fVar) {
            this.f139980a = fVar;
        }

        public final void onClick(View view) {
            this.f139980a.mo92107d().mo92064a(257);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "com/ss/android/lark/todo/impl/features/detail/sections/BottomContainerSection$initViewObserver$1$1"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.d.f$d */
    static final class C56594d extends Lambda implements Function1<Boolean, Unit> {
        final /* synthetic */ BottomContainerSection this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56594d(BottomContainerSection fVar) {
            super(1);
            this.this$0 = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(boolean z) {
            RelativeLayout relativeLayout = (RelativeLayout) this.this$0.f139973a.findViewById(R.id.bottom_button_container);
            Intrinsics.checkExpressionValueIsNotNull(relativeLayout, "view.bottom_button_container");
            C25877a.m93659a(relativeLayout, z);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.d.f$m */
    static final class View$OnClickListenerC56603m implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ BottomContainerSection f139984a;

        View$OnClickListenerC56603m(BottomContainerSection fVar) {
            this.f139984a = fVar;
        }

        public final void onClick(View view) {
            this.f139984a.mo92107d().mo92064a(DynamicModule.f58006b);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.d.f$n */
    static final class View$OnClickListenerC56604n implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ BottomContainerSection f139985a;

        View$OnClickListenerC56604n(BottomContainerSection fVar) {
            this.f139985a = fVar;
        }

        public final void onClick(View view) {
            this.f139985a.mo92107d().mo92064a(251);
        }
    }

    /* renamed from: a */
    public final void mo192565a(boolean z) {
        View findViewById = this.f139973a.findViewById(R.id.comment_red_dot);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "view.comment_red_dot");
        C25877a.m93659a(findViewById, z);
    }

    /* renamed from: c */
    private final void m220418c(boolean z) {
        int i;
        UDButton uDButton = (UDButton) this.f139973a.findViewById(R.id.only_follower_follow_btn);
        Intrinsics.checkExpressionValueIsNotNull(uDButton, "view.only_follower_follow_btn");
        uDButton.setVisibility(0);
        UDButton uDButton2 = (UDButton) this.f139973a.findViewById(R.id.only_follower_follow_btn);
        if (z) {
            i = R.string.Todo_Task_Following;
        } else {
            i = R.string.Todo_Task_FollowButton;
        }
        uDButton2.setText(i);
    }

    /* renamed from: b */
    private final void m220417b(boolean z) {
        int i;
        int i2;
        int i3;
        UDButton uDButton = (UDButton) this.f139973a.findViewById(R.id.only_assignee_or_create_done_btn);
        Intrinsics.checkExpressionValueIsNotNull(uDButton, "view.only_assignee_or_create_done_btn");
        uDButton.setVisibility(0);
        UDButton uDButton2 = (UDButton) this.f139973a.findViewById(R.id.only_assignee_or_create_done_btn);
        if (z) {
            i = R.string.Todo_Task_CompletedTaskButton;
        } else {
            i = R.string.Todo_Task_CompleteTaskButton;
        }
        uDButton2.setText(i);
        UDButton uDButton3 = (UDButton) this.f139973a.findViewById(R.id.only_assignee_or_create_done_btn);
        Context c = mo92106c();
        if (z) {
            i2 = R.color.ud_button_white_grey_bg;
        } else {
            i2 = R.color.ud_button_white_blue_bg;
        }
        uDButton3.setBackgroundColor(C0215a.m652a(c, i2));
        UDButton uDButton4 = (UDButton) this.f139973a.findViewById(R.id.only_assignee_or_create_done_btn);
        ResUtil eVar = ResUtil.f139261a;
        int i4 = R.color.primary_pri_500;
        if (z) {
            i3 = R.color.text_title;
        } else {
            i3 = R.color.primary_pri_500;
        }
        uDButton4.setTextColor(eVar.mo191775a(i3));
        UDButton uDButton5 = (UDButton) this.f139973a.findViewById(R.id.only_assignee_or_create_done_btn);
        ResUtil eVar2 = ResUtil.f139261a;
        if (z) {
            i4 = R.color.line_border_component;
        }
        uDButton5.setStrokeColor(eVar2.mo191775a(i4));
    }

    /* renamed from: b */
    public final void mo192566b(int i) {
        boolean z;
        UDButton uDButton = (UDButton) this.f139973a.findViewById(R.id.only_assignee_or_create_done_btn);
        Intrinsics.checkExpressionValueIsNotNull(uDButton, "view.only_assignee_or_create_done_btn");
        uDButton.setVisibility(8);
        UDButton uDButton2 = (UDButton) this.f139973a.findViewById(R.id.only_follower_follow_btn);
        Intrinsics.checkExpressionValueIsNotNull(uDButton2, "view.only_follower_follow_btn");
        uDButton2.setVisibility(8);
        RelativeLayout relativeLayout = (RelativeLayout) this.f139973a.findViewById(R.id.creator_assignee_done_container);
        Intrinsics.checkExpressionValueIsNotNull(relativeLayout, "view.creator_assignee_done_container");
        relativeLayout.setVisibility(8);
        boolean z2 = false;
        if (i == 0 || i == 7 || i == 1 || i == 8) {
            if (i == 0 || i == 7) {
                z2 = true;
            }
            m220417b(z2);
        } else if (i == 2 || i == 3) {
            if (i == 2) {
                z2 = true;
            }
            m220418c(z2);
        } else if (i == 5 || i == 6 || i == 4) {
            if (i == 5 || i == 4) {
                z = true;
            } else {
                z = false;
            }
            if (i == 5) {
                z2 = true;
            }
            m220416a(z, z2);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.d.f$j */
    public static final class DialogInterface$OnClickListenerC56600j implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ BottomContainerSection f139981a;

        DialogInterface$OnClickListenerC56600j(BottomContainerSection fVar) {
            this.f139981a = fVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            this.f139981a.mo92107d().mo92064a(258);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.d.f$k */
    public static final class DialogInterface$OnClickListenerC56601k implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ BottomContainerSection f139982a;

        DialogInterface$OnClickListenerC56601k(BottomContainerSection fVar) {
            this.f139982a = fVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            this.f139982a.mo92107d().mo92064a(258);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BottomContainerSection(View view, IViewAbility<ITodoDetailViewDataStore> fVar) {
        super(fVar);
        Intrinsics.checkParameterIsNotNull(view, "view");
        Intrinsics.checkParameterIsNotNull(fVar, "viewAbility");
        this.f139973a = view;
        View$OnClickListenerC56604n nVar = new View$OnClickListenerC56604n(this);
        this.f139974b = nVar;
        View$OnClickListenerC56603m mVar = new View$OnClickListenerC56603m(this);
        this.f139975c = mVar;
        View$OnClickListenerC56591a aVar = new View$OnClickListenerC56591a(this);
        this.f139976d = aVar;
        ((UDButton) view.findViewById(R.id.only_assignee_or_create_done_btn)).setOnClickListener(nVar);
        ((UDButton) view.findViewById(R.id.create_assignee_done_btn)).setOnClickListener(aVar);
        ((UDButton) view.findViewById(R.id.create_assignee_done_all_btn)).setOnClickListener(mVar);
        ((UDButton) view.findViewById(R.id.only_follower_follow_btn)).setOnClickListener(this.f139977e);
    }

    /* renamed from: a */
    private final void m220416a(boolean z, boolean z2) {
        int i;
        int i2;
        int i3;
        RelativeLayout relativeLayout = (RelativeLayout) this.f139973a.findViewById(R.id.creator_assignee_done_container);
        Intrinsics.checkExpressionValueIsNotNull(relativeLayout, "view.creator_assignee_done_container");
        relativeLayout.setVisibility(0);
        UDButton uDButton = (UDButton) this.f139973a.findViewById(R.id.create_assignee_done_btn);
        if (z) {
            i = R.string.Todo_CollabTask_MeCompleted;
        } else {
            i = R.string.Todo_CollabTask_OnlyMeCompleted;
        }
        uDButton.setText(i);
        UDButton uDButton2 = (UDButton) this.f139973a.findViewById(R.id.create_assignee_done_btn);
        Context c = mo92106c();
        if (z) {
            i2 = R.color.todo_creator_self_btn_bg;
        } else {
            i2 = R.color.ud_button_white_grey_bg;
        }
        uDButton2.setBackgroundColor(C0215a.m652a(c, i2));
        UDButton uDButton3 = (UDButton) this.f139973a.findViewById(R.id.create_assignee_done_all_btn);
        if (z2) {
            i3 = R.string.Todo_Task_CompletedTaskButton;
        } else {
            i3 = R.string.Todo_Task_CompleteTaskButton;
        }
        uDButton3.setText(i3);
    }
}
