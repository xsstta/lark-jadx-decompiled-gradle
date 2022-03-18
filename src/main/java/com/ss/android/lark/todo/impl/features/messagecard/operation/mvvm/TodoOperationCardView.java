package com.ss.android.lark.todo.impl.features.messagecard.operation.mvvm;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.TouchDelegate;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.C1143ag;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.lark.pb.basic.v1.TodoDetail;
import com.larksuite.component.universe_design.button.UDButton;
import com.larksuite.framework.p1173a.p1174a.C25877a;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.todo.dependency.TodoDependencyHolder;
import com.ss.android.lark.todo.dependency.idependency.IMainModuleDependency;
import com.ss.android.lark.todo.dependency.idependency.IMessengerDependency;
import com.ss.android.lark.todo.impl.features.common.entity.EndTimeTextAttribute;
import com.ss.android.lark.todo.impl.features.common.helper.MultiCompleteHelper;
import com.ss.android.lark.todo.impl.features.common.helper.OperationToastHelper;
import com.ss.android.lark.todo.impl.features.common.urlpreview.UrlPreviewLoader;
import com.ss.android.lark.todo.impl.features.detail.sections.AssigneeAvatarAdapter;
import com.ss.android.lark.todo.impl.features.detail.sections.AssigneeAvatarBean;
import com.ss.android.lark.todo.impl.features.detail.viewmodel.data.TodoToastUnit;
import com.ss.android.lark.todo.impl.features.messagecard.entity.TextAttributes;
import com.ss.android.lark.todo.impl.features.messagecard.helper.TodoRichTextHelper;
import com.ss.android.lark.todo.impl.features.messagecard.listener.FollowerTodoClickListener;
import com.ss.android.lark.todo.impl.features.messagecard.listener.OpenTodoDetailActivityClickListener;
import com.ss.android.lark.todo.impl.features.messagecard.operation.mvvm.TodoOperationCardViewModel;
import com.ss.android.lark.todo.impl.framework.hitpoint.event.TodoGeneralHitPoint;
import com.ss.android.lark.todo.impl.p2791b.C56263a;
import com.ss.android.lark.todo.impl.utils.ResUtil;
import com.ss.android.lark.widget.richtext.RichTextView;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.C69097g;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.C69086a;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.C69553g;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 ,2\u00020\u00012\u00020\u0002:\u0001,B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\u001a\u001a\u00020\u001bH\u0002J\u0006\u0010\u001c\u001a\u00020\u001bJ\b\u0010\u001d\u001a\u00020\u001bH\u0002J\b\u0010\u001e\u001a\u00020\u001bH\u0002J\b\u0010\u001f\u001a\u00020\u001bH\u0002J\b\u0010 \u001a\u00020\u001bH\u0002J\b\u0010!\u001a\u00020\u001bH\u0002J\b\u0010\"\u001a\u00020\u0011H\u0016J\b\u0010#\u001a\u00020\u001bH\u0002J\b\u0010$\u001a\u00020\u001bH\u0002J\u000e\u0010%\u001a\u00020\u001b2\u0006\u0010\u0005\u001a\u00020\u0006J\u0010\u0010&\u001a\u00020\u001b2\u0006\u0010'\u001a\u00020(H\u0002J\b\u0010)\u001a\u00020\u001bH\u0002J\u0010\u0010*\u001a\u00020\u001b2\u0006\u0010'\u001a\u00020(H\u0002J\u0006\u0010+\u001a\u00020\u001bR\u001b\u0010\b\u001a\u00020\t8BX\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0010\u001a\u00020\u00118BX\u0002¢\u0006\f\n\u0004\b\u0014\u0010\r\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0015\u001a\u00020\u00168BX\u0002¢\u0006\f\n\u0004\b\u0019\u0010\r\u001a\u0004\b\u0017\u0010\u0018R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006-"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/messagecard/operation/mvvm/TodoOperationCardView;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroidx/lifecycle/LifecycleOwner;", "holderView", "Landroid/view/View;", "viewModel", "Lcom/ss/android/lark/todo/impl/features/messagecard/operation/mvvm/TodoOperationCardViewModel;", "(Landroid/view/View;Lcom/ss/android/lark/todo/impl/features/messagecard/operation/mvvm/TodoOperationCardViewModel;)V", "assigneeAdapter", "Lcom/ss/android/lark/todo/impl/features/detail/sections/AssigneeAvatarAdapter;", "getAssigneeAdapter", "()Lcom/ss/android/lark/todo/impl/features/detail/sections/AssigneeAvatarAdapter;", "assigneeAdapter$delegate", "Lkotlin/Lazy;", "centerEnable", "", "mLifecycleRegistry", "Landroidx/lifecycle/LifecycleRegistry;", "getMLifecycleRegistry", "()Landroidx/lifecycle/LifecycleRegistry;", "mLifecycleRegistry$delegate", "messageDependency", "Lcom/ss/android/lark/todo/dependency/idependency/IMessengerDependency;", "getMessageDependency", "()Lcom/ss/android/lark/todo/dependency/idependency/IMessengerDependency;", "messageDependency$delegate", "bindCardButton", "", "bindCardContent", "bindCardItemView", "bindCheckBoxListener", "bindEnterDetailIcon", "bindLiveData", "bindTodoFollowIcon", "getLifecycle", "registerLifeCycle", "setCheckboxDrawable", "setViewModel", "showActiveConfirmDialog", "todoDetail", "Lcom/bytedance/lark/pb/basic/v1/TodoDetail;", "showAssigneeAvatar", "showCompleteConfirmDialog", "unRegisterLifeCycle", "Companion", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.impl.features.messagecard.operation.mvvm.a */
public final class TodoOperationCardView extends RecyclerView.ViewHolder implements LifecycleOwner {

    /* renamed from: c */
    public static final Companion f140921c = new Companion(null);

    /* renamed from: a */
    public final View f140922a;

    /* renamed from: b */
    public TodoOperationCardViewModel f140923b;

    /* renamed from: d */
    private final Lazy f140924d = LazyKt.lazy(C57160k.INSTANCE);

    /* renamed from: e */
    private final Lazy f140925e = LazyKt.lazy(new C57159j(this));

    /* renamed from: f */
    private final Lazy f140926f = LazyKt.lazy(new C57150b(this));

    /* renamed from: g */
    private final boolean f140927g = TodoDependencyHolder.f139242a.mo191731b().mo191938k();

    /* renamed from: e */
    private final LifecycleRegistry m221460e() {
        return (LifecycleRegistry) this.f140925e.getValue();
    }

    /* renamed from: f */
    private final AssigneeAvatarAdapter m221461f() {
        return (AssigneeAvatarAdapter) this.f140926f.getValue();
    }

    /* renamed from: a */
    public final IMessengerDependency mo193979a() {
        return (IMessengerDependency) this.f140924d.getValue();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/messagecard/operation/mvvm/TodoOperationCardView$Companion;", "", "()V", "CHECKBOX_EXPAND_SIZE_IN_DP", "", "OPERATION_MORE_IN_DP", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.messagecard.operation.mvvm.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004¸\u0006\u0000"}, d2 = {"com/ss/android/lark/todo/impl/features/messagecard/operation/mvvm/TodoOperationCardView$bindTodoFollowIcon$1$1", "Lcom/ss/android/lark/todo/impl/features/messagecard/listener/FollowerTodoClickListener$ITodoCardFollowListener;", "onFollowTodoClicked", "", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.messagecard.operation.mvvm.a$i */
    public static final class C57158i implements FollowerTodoClickListener.ITodoCardFollowListener {

        /* renamed from: a */
        final /* synthetic */ TodoOperationCardView f140937a;

        /* renamed from: b */
        final /* synthetic */ TextAttributes f140938b;

        @Override // com.ss.android.lark.todo.impl.features.messagecard.listener.FollowerTodoClickListener.ITodoCardFollowListener
        /* renamed from: a */
        public void mo193947a() {
            this.f140937a.f140923b.onFollowIconClicked();
        }

        C57158i(TodoOperationCardView aVar, TextAttributes aVar2) {
            this.f140937a = aVar;
            this.f140938b = aVar2;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0005"}, d2 = {"com/ss/android/lark/todo/impl/features/messagecard/operation/mvvm/TodoOperationCardView$showActiveConfirmDialog$1", "Lcom/ss/android/lark/todo/impl/features/common/helper/MultiCompleteHelper$IMultiCompleteDialogListener;", "onCancelBtnClicked", "", "onConfirmBtnClicked", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.messagecard.operation.mvvm.a$l */
    public static final class C57161l implements MultiCompleteHelper.IMultiCompleteDialogListener {

        /* renamed from: a */
        final /* synthetic */ TodoOperationCardView f140939a;

        /* renamed from: b */
        final /* synthetic */ TodoDetail f140940b;

        @Override // com.ss.android.lark.todo.impl.features.common.helper.MultiCompleteHelper.IMultiCompleteDialogListener
        /* renamed from: b */
        public void mo191870b() {
            this.f140939a.mo193984c();
        }

        @Override // com.ss.android.lark.todo.impl.features.common.helper.MultiCompleteHelper.IMultiCompleteDialogListener
        /* renamed from: a */
        public void mo191869a() {
            this.f140939a.f140923b.setTodoCompleteStatus(this.f140940b, false);
        }

        C57161l(TodoOperationCardView aVar, TodoDetail todoDetail) {
            this.f140939a = aVar;
            this.f140940b = todoDetail;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0005"}, d2 = {"com/ss/android/lark/todo/impl/features/messagecard/operation/mvvm/TodoOperationCardView$showCompleteConfirmDialog$1", "Lcom/ss/android/lark/todo/impl/features/common/helper/MultiCompleteHelper$IMultiCompleteDialogListener;", "onCancelBtnClicked", "", "onConfirmBtnClicked", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.messagecard.operation.mvvm.a$m */
    public static final class C57162m implements MultiCompleteHelper.IMultiCompleteDialogListener {

        /* renamed from: a */
        final /* synthetic */ TodoOperationCardView f140941a;

        /* renamed from: b */
        final /* synthetic */ TodoDetail f140942b;

        @Override // com.ss.android.lark.todo.impl.features.common.helper.MultiCompleteHelper.IMultiCompleteDialogListener
        /* renamed from: b */
        public void mo191870b() {
            this.f140941a.mo193984c();
        }

        @Override // com.ss.android.lark.todo.impl.features.common.helper.MultiCompleteHelper.IMultiCompleteDialogListener
        /* renamed from: a */
        public void mo191869a() {
            this.f140941a.f140923b.setTodoCompleteStatus(this.f140942b, true);
        }

        C57162m(TodoOperationCardView aVar, TodoDetail todoDetail) {
            this.f140941a = aVar;
            this.f140942b = todoDetail;
        }
    }

    /* renamed from: d */
    public LifecycleRegistry getLifecycle() {
        return m221460e();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroidx/lifecycle/LifecycleRegistry;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.messagecard.operation.mvvm.a$j */
    static final class C57159j extends Lambda implements Function0<LifecycleRegistry> {
        final /* synthetic */ TodoOperationCardView this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C57159j(TodoOperationCardView aVar) {
            super(0);
            this.this$0 = aVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final LifecycleRegistry invoke() {
            return new LifecycleRegistry(this.this$0);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/todo/dependency/idependency/IMessengerDependency;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.messagecard.operation.mvvm.a$k */
    static final class C57160k extends Lambda implements Function0<IMessengerDependency> {
        public static final C57160k INSTANCE = new C57160k();

        C57160k() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final IMessengerDependency invoke() {
            return TodoDependencyHolder.f139242a.mo191730a().messengerModuleDependency();
        }
    }

    /* renamed from: k */
    private final void m221466k() {
        m221467l();
        m221468m();
        m221469n();
    }

    /* renamed from: b */
    public final void mo193982b() {
        m221462g();
        m221464i();
        m221466k();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/todo/impl/features/detail/sections/AssigneeAvatarAdapter;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.messagecard.operation.mvvm.a$b */
    static final class C57150b extends Lambda implements Function0<AssigneeAvatarAdapter> {
        final /* synthetic */ TodoOperationCardView this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C57150b(TodoOperationCardView aVar) {
            super(0);
            this.this$0 = aVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final AssigneeAvatarAdapter invoke() {
            Context context = this.this$0.f140922a.getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "holderView.context");
            AssigneeAvatarAdapter aVar = new AssigneeAvatarAdapter(context);
            aVar.mo192536a(new AssigneeAvatarAdapter.ItemClickListener(this) {
                /* class com.ss.android.lark.todo.impl.features.messagecard.operation.mvvm.TodoOperationCardView.C57150b.C571511 */

                /* renamed from: a */
                final /* synthetic */ C57150b f140930a;

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f140930a = r1;
                }

                @Override // com.ss.android.lark.todo.impl.features.detail.sections.AssigneeAvatarAdapter.ItemClickListener
                /* renamed from: a */
                public void mo191810a(View view, AssigneeAvatarBean bVar) {
                    Intrinsics.checkParameterIsNotNull(view, "view");
                    Intrinsics.checkParameterIsNotNull(bVar, "item");
                    TodoGeneralHitPoint.f141070a.mo194199e(this.f140930a.this$0.f140923b.getTodoGuid());
                    IMessengerDependency a = this.f140930a.this$0.mo193979a();
                    Context context = view.getContext();
                    Intrinsics.checkExpressionValueIsNotNull(context, "view.context");
                    a.mo145420a(context, bVar.mo192543a());
                }
            });
            return aVar;
        }
    }

    /* renamed from: h */
    private final void m221463h() {
        m221460e().handleLifecycleEvent(Lifecycle.Event.ON_CREATE);
        m221460e().handleLifecycleEvent(Lifecycle.Event.ON_START);
    }

    /* renamed from: l */
    private final void m221467l() {
        ((ImageView) this.f140922a.findViewById(R.id.complete_checkbox)).setOnClickListener(new View$OnClickListenerC57153d(this));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004¸\u0006\u0000"}, d2 = {"com/ss/android/lark/todo/impl/features/messagecard/operation/mvvm/TodoOperationCardView$bindEnterDetailIcon$1$1", "Lcom/ss/android/lark/todo/impl/features/messagecard/listener/OpenTodoDetailActivityClickListener$ITodoCardEnterDetailListener;", "onEnterDetailClicked", "", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.messagecard.operation.mvvm.a$e */
    public static final class C57154e implements OpenTodoDetailActivityClickListener.ITodoCardEnterDetailListener {

        /* renamed from: a */
        final /* synthetic */ TodoOperationCardView f140932a;

        /* renamed from: b */
        final /* synthetic */ TextAttributes f140933b;

        @Override // com.ss.android.lark.todo.impl.features.messagecard.listener.OpenTodoDetailActivityClickListener.ITodoCardEnterDetailListener
        /* renamed from: a */
        public void mo193920a() {
            TodoOperationCardViewModel todoOperationCardViewModel = this.f140932a.f140923b;
            UDButton uDButton = (UDButton) this.f140932a.f140922a.findViewById(R.id.todo_icon_detail);
            Intrinsics.checkExpressionValueIsNotNull(uDButton, "holderView.todo_icon_detail");
            Context context = uDButton.getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "holderView.todo_icon_detail.context");
            todoOperationCardViewModel.onOpenTodoDetailClicked(context);
        }

        C57154e(TodoOperationCardView aVar, TextAttributes aVar2) {
            this.f140932a = aVar;
            this.f140933b = aVar2;
        }
    }

    /* renamed from: g */
    private final void m221462g() {
        m221463h();
        TodoOperationCardView aVar = this;
        this.f140923b.getShowToastLiveData().mo5923a(aVar, new C57155f(this));
        this.f140923b.getShowActiveDialog().mo5923a(aVar, new C57156g(this));
        this.f140923b.getShowCompleteDialog().mo5923a(aVar, new C57157h(this));
    }

    /* renamed from: n */
    private final void m221469n() {
        TextAttributes enterDetailIconAttr = this.f140923b.getEnterDetailIconAttr();
        UDButton uDButton = (UDButton) this.f140922a.findViewById(R.id.todo_icon_detail);
        uDButton.setOnClickListener(new OpenTodoDetailActivityClickListener(new C57154e(this, enterDetailIconAttr)));
        uDButton.setText(enterDetailIconAttr.mo193938a());
        uDButton.setTextColor(enterDetailIconAttr.mo193939b());
        uDButton.setEnabled(enterDetailIconAttr.mo193940c());
    }

    /* renamed from: c */
    public final void mo193984c() {
        Drawable drawable;
        TodoOperationCardViewModel.CheckBoxStatus checkBoxStatus = this.f140923b.getCheckBoxStatus();
        ImageView imageView = (ImageView) this.f140922a.findViewById(R.id.complete_checkbox);
        int i = C57163b.f140943a[checkBoxStatus.ordinal()];
        if (i == 1) {
            drawable = ResUtil.f139261a.mo191782d(R.drawable.todo_svg_icon_checked);
        } else if (i == 2) {
            drawable = ResUtil.f139261a.mo191782d(R.drawable.todo_svg_icon_checked_dis);
        } else if (i == 3) {
            drawable = ResUtil.f139261a.mo191782d(R.drawable.todo_svg_icon_uncheck);
        } else if (i == 4) {
            drawable = ResUtil.f139261a.mo191782d(R.drawable.todo_svg_icon_uncheckable);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        imageView.setImageDrawable(drawable);
    }

    /* renamed from: j */
    private final void m221465j() {
        boolean z;
        int assigneeNum = this.f140923b.getAssigneeNum();
        AssigneeAvatarAdapter f = m221461f();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = this.f140923b.getShowAssignees().iterator();
        while (true) {
            z = true;
            if (!it.hasNext()) {
                break;
            }
            T next = it.next();
            String str = next.assignee_id;
            Intrinsics.checkExpressionValueIsNotNull(str, "it.assignee_id");
            String str2 = next.avatar_key;
            Intrinsics.checkExpressionValueIsNotNull(str2, "it.avatar_key");
            if (next.completed_milli_time.longValue() <= 0 || !this.f140923b.isInMultiCompleteStrategy()) {
                z = false;
            }
            arrayList.add(new AssigneeAvatarBean(str, str2, z));
        }
        f.mo192537a(arrayList);
        TextView textView = (TextView) this.f140922a.findViewById(R.id.assignee_avatar_count);
        Intrinsics.checkExpressionValueIsNotNull(textView, "holderView.assignee_avatar_count");
        TextView textView2 = textView;
        if (assigneeNum <= 4) {
            z = false;
        }
        C25877a.m93659a(textView2, z);
        if (assigneeNum > 4) {
            TextView textView3 = (TextView) this.f140922a.findViewById(R.id.assignee_avatar_count);
            Intrinsics.checkExpressionValueIsNotNull(textView3, "holderView.assignee_avatar_count");
            textView3.setText("+" + (assigneeNum - 4));
        }
    }

    /* renamed from: m */
    private final void m221468m() {
        if (!this.f140923b.isFollowIconShow()) {
            UDButton uDButton = (UDButton) this.f140922a.findViewById(R.id.todo_icon_follow);
            Intrinsics.checkExpressionValueIsNotNull(uDButton, "holderView.todo_icon_follow");
            uDButton.setVisibility(8);
            return;
        }
        UDButton uDButton2 = (UDButton) this.f140922a.findViewById(R.id.todo_icon_follow);
        Intrinsics.checkExpressionValueIsNotNull(uDButton2, "holderView.todo_icon_follow");
        uDButton2.setVisibility(0);
        TextAttributes followIconAttr = this.f140923b.getFollowIconAttr();
        UDButton uDButton3 = (UDButton) this.f140922a.findViewById(R.id.todo_icon_follow);
        uDButton3.setOnClickListener(new FollowerTodoClickListener(new C57158i(this, followIconAttr)));
        uDButton3.setText(followIconAttr.mo193938a());
        uDButton3.setTextColor(followIconAttr.mo193939b());
        uDButton3.setEnabled(followIconAttr.mo193940c());
        if (followIconAttr.mo193941d()) {
            uDButton3.setBackgroundColor(ResUtil.f139261a.mo191775a(R.color.udtoken_btn_se_bg_neutral_hover));
        } else {
            uDButton3.setBackgroundColor(ResUtil.f139261a.mo191780b(R.color.ud_button_white_grey_bg));
        }
    }

    /* renamed from: i */
    private final void m221464i() {
        int i;
        TextView textView = (TextView) this.f140922a.findViewById(R.id.todo_operation_title);
        Intrinsics.checkExpressionValueIsNotNull(textView, "holderView.todo_operation_title");
        textView.setText(this.f140923b.getOperationTitleStr());
        ImageView imageView = (ImageView) this.f140922a.findViewById(R.id.complete_checkbox);
        Intrinsics.checkExpressionValueIsNotNull(imageView, "holderView.complete_checkbox");
        ImageView imageView2 = (ImageView) this.f140922a.findViewById(R.id.complete_checkbox);
        Intrinsics.checkExpressionValueIsNotNull(imageView2, "holderView.complete_checkbox");
        C56263a.m219590a(imageView, UIUtils.dp2px(imageView2.getContext(), 12.0f));
        mo193984c();
        ((RichTextView) this.f140922a.findViewById(R.id.todo_summary)).setIsTextStrikeThrough(this.f140923b.isTodoCompleted());
        ((RichTextView) this.f140922a.findViewById(R.id.todo_summary)).mo200506a();
        RichTextView richTextView = (RichTextView) this.f140922a.findViewById(R.id.todo_summary);
        ResUtil eVar = ResUtil.f139261a;
        if (this.f140923b.isTodoCompleted()) {
            i = R.color.text_caption;
        } else {
            i = R.color.text_title;
        }
        richTextView.setTextColor(eVar.mo191775a(i));
        TodoRichTextHelper aVar = TodoRichTextHelper.f140904a;
        RichTextView richTextView2 = (RichTextView) this.f140922a.findViewById(R.id.todo_summary);
        Intrinsics.checkExpressionValueIsNotNull(richTextView2, "holderView.todo_summary");
        aVar.mo193946a(richTextView2, this.f140923b.getTodoSummaryRichText(), this.f140923b.getTodoGuid(), 5, false);
        Job unused = C69553g.m266944a(C1143ag.m5356a(this.f140923b), null, null, new C57152c(this, null), 3, null);
        boolean z = false;
        if (this.f140923b.isShowAssigneeContainer()) {
            LinearLayout linearLayout = (LinearLayout) this.f140922a.findViewById(R.id.todo_assignee_container);
            Intrinsics.checkExpressionValueIsNotNull(linearLayout, "holderView.todo_assignee_container");
            linearLayout.setVisibility(0);
            m221465j();
        } else {
            LinearLayout linearLayout2 = (LinearLayout) this.f140922a.findViewById(R.id.todo_assignee_container);
            Intrinsics.checkExpressionValueIsNotNull(linearLayout2, "holderView.todo_assignee_container");
            linearLayout2.setVisibility(8);
        }
        if (this.f140923b.isShowTimeContainer()) {
            LinearLayout linearLayout3 = (LinearLayout) this.f140922a.findViewById(R.id.todo_time_container);
            Intrinsics.checkExpressionValueIsNotNull(linearLayout3, "holderView.todo_time_container");
            linearLayout3.setVisibility(0);
            TodoOperationCardViewModel todoOperationCardViewModel = this.f140923b;
            TextView textView2 = (TextView) this.f140922a.findViewById(R.id.tv_time);
            Intrinsics.checkExpressionValueIsNotNull(textView2, "holderView.tv_time");
            Context context = textView2.getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "holderView.tv_time.context");
            EndTimeTextAttribute showTimeAttrs = todoOperationCardViewModel.getShowTimeAttrs(context);
            if (showTimeAttrs != null) {
                TextView textView3 = (TextView) this.f140922a.findViewById(R.id.tv_time);
                Intrinsics.checkExpressionValueIsNotNull(textView3, "holderView.tv_time");
                textView3.setText(showTimeAttrs.getEndTimeStr());
                ((TextView) this.f140922a.findViewById(R.id.tv_time)).setTextColor(showTimeAttrs.getEndTimeColor());
            }
        } else {
            LinearLayout linearLayout4 = (LinearLayout) this.f140922a.findViewById(R.id.todo_time_container);
            Intrinsics.checkExpressionValueIsNotNull(linearLayout4, "holderView.todo_time_container");
            linearLayout4.setVisibility(8);
        }
        boolean isTodoDeleted = this.f140923b.isTodoDeleted();
        LinearLayout linearLayout5 = (LinearLayout) this.f140922a.findViewById(R.id.operate_more_container);
        Intrinsics.checkExpressionValueIsNotNull(linearLayout5, "holderView.operate_more_container");
        LinearLayout linearLayout6 = linearLayout5;
        if (this.f140927g && !isTodoDeleted && this.f140923b.isUserInTodo() && TodoDependencyHolder.f139242a.mo191730a().mainModuleDependency().mo145418b()) {
            z = true;
        }
        C25877a.m93659a(linearLayout6, z);
    }

    /* renamed from: a */
    public final void mo193981a(TodoOperationCardViewModel todoOperationCardViewModel) {
        Intrinsics.checkParameterIsNotNull(todoOperationCardViewModel, "viewModel");
        this.f140923b = todoOperationCardViewModel;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/bytedance/lark/pb/basic/v1/TodoDetail;", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.messagecard.operation.mvvm.a$g */
    public static final class C57156g<T> implements AbstractC1178x<TodoDetail> {

        /* renamed from: a */
        final /* synthetic */ TodoOperationCardView f140935a;

        C57156g(TodoOperationCardView aVar) {
            this.f140935a = aVar;
        }

        /* renamed from: a */
        public final void onChanged(TodoDetail todoDetail) {
            TodoOperationCardView aVar = this.f140935a;
            Intrinsics.checkExpressionValueIsNotNull(todoDetail, "it");
            aVar.mo193980a(todoDetail);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/bytedance/lark/pb/basic/v1/TodoDetail;", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.messagecard.operation.mvvm.a$h */
    public static final class C57157h<T> implements AbstractC1178x<TodoDetail> {

        /* renamed from: a */
        final /* synthetic */ TodoOperationCardView f140936a;

        C57157h(TodoOperationCardView aVar) {
            this.f140936a = aVar;
        }

        /* renamed from: a */
        public final void onChanged(TodoDetail todoDetail) {
            TodoOperationCardView aVar = this.f140936a;
            Intrinsics.checkExpressionValueIsNotNull(todoDetail, "it");
            aVar.mo193983b(todoDetail);
        }
    }

    /* renamed from: a */
    public final void mo193980a(TodoDetail todoDetail) {
        MultiCompleteHelper multiCompleteHelper = MultiCompleteHelper.f139390a;
        Context context = this.f140922a.getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "holderView.context");
        multiCompleteHelper.mo191983a(context, new C57161l(this, todoDetail));
    }

    /* renamed from: b */
    public final void mo193983b(TodoDetail todoDetail) {
        MultiCompleteHelper multiCompleteHelper = MultiCompleteHelper.f139390a;
        Context context = this.f140922a.getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "holderView.context");
        multiCompleteHelper.mo191985b(context, new C57162m(this, todoDetail));
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.todo.impl.features.messagecard.operation.mvvm.TodoOperationCardView$bindCardItemView$1", mo239173f = "TodoOperationCardView.kt", mo239174i = {0}, mo239175l = {171}, mo239176m = "invokeSuspend", mo239177n = {"$this$launch"}, mo239178s = {"L$0"})
    /* renamed from: com.ss.android.lark.todo.impl.features.messagecard.operation.mvvm.a$c */
    public static final class C57152c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;
        private CoroutineScope p$;
        final /* synthetic */ TodoOperationCardView this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C57152c(TodoOperationCardView aVar, Continuation cVar) {
            super(2, cVar);
            this.this$0 = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C57152c cVar2 = new C57152c(this.this$0, cVar);
            cVar2.p$ = (CoroutineScope) obj;
            return cVar2;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C57152c) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object a = C69086a.m265828a();
            int i = this.label;
            if (i == 0) {
                C69097g.m265891a(obj);
                CoroutineScope ahVar = this.p$;
                UrlPreviewLoader aVar = UrlPreviewLoader.f139388a;
                RichTextView richTextView = (RichTextView) this.this$0.f140922a.findViewById(R.id.todo_summary);
                Intrinsics.checkExpressionValueIsNotNull(richTextView, "holderView.todo_summary");
                String todoGuid = this.this$0.f140923b.getTodoGuid();
                TodoDetail todoSummaryDetail = this.this$0.f140923b.getTodoSummaryDetail();
                this.L$0 = ahVar;
                this.label = 1;
                if (aVar.mo191967a(richTextView, todoGuid, todoSummaryDetail, this) == a) {
                    return a;
                }
            } else if (i == 1) {
                CoroutineScope ahVar2 = (CoroutineScope) this.L$0;
                C69097g.m265891a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return Unit.INSTANCE;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "toastUnit", "Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/data/TodoToastUnit;", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.messagecard.operation.mvvm.a$f */
    public static final class C57155f<T> implements AbstractC1178x<TodoToastUnit> {

        /* renamed from: a */
        final /* synthetic */ TodoOperationCardView f140934a;

        C57155f(TodoOperationCardView aVar) {
            this.f140934a = aVar;
        }

        /* renamed from: a */
        public final void onChanged(TodoToastUnit aVar) {
            int b = aVar.mo192768b();
            if (b == 1) {
                OperationToastHelper.m219774a(OperationToastHelper.f139395a, this.f140934a.f140922a.getContext(), aVar.mo192767a(), null, null, null, 28, null);
            } else if (b == 2) {
                OperationToastHelper.m219775a(OperationToastHelper.f139395a, this.f140934a.f140922a.getContext(), aVar.mo192767a(), aVar.mo192769c(), null, null, null, 56, null);
            } else if (b == 3) {
                OperationToastHelper.f139395a.mo191991a(this.f140934a.f140922a.getContext(), aVar.mo192767a());
            } else if (b == 4) {
                OperationToastHelper.m219777b(OperationToastHelper.f139395a, this.f140934a.f140922a.getContext(), aVar.mo192767a(), aVar.mo192769c(), null, null, null, 56, null);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.messagecard.operation.mvvm.a$d */
    public static final class View$OnClickListenerC57153d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ TodoOperationCardView f140931a;

        View$OnClickListenerC57153d(TodoOperationCardView aVar) {
            this.f140931a = aVar;
        }

        public final void onClick(View view) {
            int i;
            Drawable drawable;
            if (this.f140931a.f140923b.getCheckBoxStatus() == TodoOperationCardViewModel.CheckBoxStatus.CHECKED_UNABLE || this.f140931a.f140923b.getCheckBoxStatus() == TodoOperationCardViewModel.CheckBoxStatus.UNCHECK_UNABLE) {
                TodoGeneralHitPoint.f141070a.mo194177a(this.f140931a.f140923b.getTodoGuid(), "no_authorization", "check_box");
                OperationToastHelper operationToastHelper = OperationToastHelper.f139395a;
                Context context = this.f140931a.f140922a.getContext();
                if (this.f140931a.f140923b.isTodoDeleted()) {
                    i = R.string.Todo_Task_TaskHasBeenDeleted;
                } else {
                    i = R.string.Todo_Notify_NoPermissionCompleteTask;
                }
                OperationToastHelper.m219777b(operationToastHelper, context, i, null, null, null, null, 60, null);
                return;
            }
            TodoOperationCardViewModel todoOperationCardViewModel = this.f140931a.f140923b;
            Intrinsics.checkExpressionValueIsNotNull(view, "it");
            Context context2 = view.getContext();
            Intrinsics.checkExpressionValueIsNotNull(context2, "it.context");
            if (!todoOperationCardViewModel.isInCustomCompleteStrategy(context2)) {
                if (!this.f140931a.f140923b.isInMultiCompleteStrategy()) {
                    ImageView imageView = (ImageView) this.f140931a.f140922a.findViewById(R.id.complete_checkbox);
                    if (this.f140931a.f140923b.isTodoCompleted()) {
                        drawable = ResUtil.f139261a.mo191782d(R.drawable.todo_svg_icon_uncheck);
                    } else {
                        drawable = ResUtil.f139261a.mo191782d(R.drawable.todo_svg_icon_checked);
                    }
                    imageView.setImageDrawable(drawable);
                }
                this.f140931a.f140923b.onCheckBoxClicked();
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TodoOperationCardView(View view, TodoOperationCardViewModel todoOperationCardViewModel) {
        super(view);
        Intrinsics.checkParameterIsNotNull(view, "holderView");
        Intrinsics.checkParameterIsNotNull(todoOperationCardViewModel, "viewModel");
        this.f140922a = view;
        this.f140923b = todoOperationCardViewModel;
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.assignee_avatar_list);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView, "holderView.assignee_avatar_list");
        recyclerView.setLayoutManager(new LinearLayoutManager(view.getContext(), 0, false));
        RecyclerView recyclerView2 = (RecyclerView) view.findViewById(R.id.assignee_avatar_list);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView2, "holderView.assignee_avatar_list");
        recyclerView2.setAdapter(m221461f());
        ((LinearLayout) view.findViewById(R.id.operate_more)).post(new Runnable(this) {
            /* class com.ss.android.lark.todo.impl.features.messagecard.operation.mvvm.TodoOperationCardView.RunnableC571481 */

            /* renamed from: a */
            final /* synthetic */ TodoOperationCardView f140928a;

            {
                this.f140928a = r1;
            }

            public final void run() {
                LinearLayout linearLayout = (LinearLayout) this.f140928a.f140922a.findViewById(R.id.operate_more);
                Intrinsics.checkExpressionValueIsNotNull(linearLayout, "holderView.operate_more");
                linearLayout.setTouchDelegate(new TouchDelegate(new Rect(0, 0, 0, UIUtils.dp2px(this.f140928a.f140922a.getContext(), 10.0f)), (LinearLayout) this.f140928a.f140922a.findViewById(R.id.operate_more)));
            }
        });
        ((LinearLayout) view.findViewById(R.id.operate_more)).setOnClickListener(new View.OnClickListener(this) {
            /* class com.ss.android.lark.todo.impl.features.messagecard.operation.mvvm.TodoOperationCardView.View$OnClickListenerC571492 */

            /* renamed from: a */
            final /* synthetic */ TodoOperationCardView f140929a;

            {
                this.f140929a = r1;
            }

            public final void onClick(View view) {
                TodoGeneralHitPoint.f141070a.mo194220p(this.f140929a.f140923b.getTodoGuid());
                IMainModuleDependency mainModuleDependency = TodoDependencyHolder.f139242a.mo191730a().mainModuleDependency();
                Context context = this.f140929a.f140922a.getContext();
                Intrinsics.checkExpressionValueIsNotNull(context, "holderView.context");
                mainModuleDependency.mo145417b(context);
            }
        });
    }
}
