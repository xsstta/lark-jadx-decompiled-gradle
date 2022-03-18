package com.ss.android.lark.todo.impl.features.detail.assignee.list;

import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.component.ui.avatar.AvatarModel;
import com.larksuite.component.ui.avatar.v2.LarkAvatarView;
import com.larksuite.component.universe_design.dialog.UDListDialogController;
import com.larksuite.component.universe_design.dialog.actionpanel.UDActionPanelBuilder;
import com.larksuite.component.universe_design.icon.UDIconUtils;
import com.larksuite.framework.section.IActionData;
import com.larksuite.framework.section.IViewAbility;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.todo.dependency.TodoDependencyHolder;
import com.ss.android.lark.todo.dependency.idependency.IMessengerDependency;
import com.ss.android.lark.todo.impl.features.common.helper.ExternalTagHelper;
import com.ss.android.lark.todo.impl.features.common.helper.OperationToastHelper;
import com.ss.android.lark.todo.impl.features.detail.viewmodel.AssigneeBean;
import com.ss.android.lark.todo.impl.features.detail.viewmodel.CompleteInfo;
import com.ss.android.lark.todo.impl.features.detail.viewmodel.ITodoDetailViewDataStore;
import com.ss.android.lark.todo.impl.p2791b.C56263a;
import com.ss.android.lark.todo.impl.utils.ResUtil;
import com.ss.android.lark.widget.p2932c.C58339d;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002%&B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\tH\u0002J\u0018\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\u0018\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u0019H\u0016J\u0018\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0019H\u0016J\u0018\u0010!\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u0018\u0010\"\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\tH\u0002J\u0014\u0010#\u001a\u00020\u00112\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\t0\bR \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/detail/assignee/list/TodoAssigneeAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/ss/android/lark/todo/impl/features/detail/assignee/list/TodoAssigneeAdapter$ViewHolder;", "viewAbility", "Lcom/larksuite/framework/section/IViewAbility;", "Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/ITodoDetailViewDataStore;", "(Lcom/larksuite/framework/section/IViewAbility;)V", "assigneeList", "", "Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/AssigneeBean;", "getAssigneeList", "()Ljava/util/List;", "setAssigneeList", "(Ljava/util/List;)V", "userId", "", "assigneeMarkComplete", "", "item", "deleteDialog", "context", "Landroid/content/Context;", "listener", "Lcom/ss/android/lark/widget/menu/MenuUtils$DialogItemClickListener;", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "showDeleteSelfDialog", "showMoreDialog", "updateData", "list", "AvatarBuilder", "ViewHolder", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.impl.features.detail.assignee.a.b */
public final class TodoAssigneeAdapter extends RecyclerView.Adapter<ViewHolder> {

    /* renamed from: a */
    public final IViewAbility<ITodoDetailViewDataStore> f139496a;

    /* renamed from: b */
    private List<AssigneeBean> f139497b = new ArrayList();

    /* renamed from: c */
    private final String f139498c = TodoDependencyHolder.f139242a.mo191730a().loginDependency().mo145411a();

    /* access modifiers changed from: private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/detail/assignee/list/TodoAssigneeAdapter$AvatarBuilder;", "Lcom/larksuite/component/ui/avatar/AvatarModel$Builder;", "()V", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.assignee.a.b$a */
    public static final class AvatarBuilder extends AvatarModel.Builder<AvatarBuilder> {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/detail/assignee/list/TodoAssigneeAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Landroid/view/View;)V", "getView", "()Landroid/view/View;", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.assignee.a.b$b */
    public static final class ViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        private final View f139499a;

        /* renamed from: a */
        public final View mo192136a() {
            return this.f139499a;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ViewHolder(View view) {
            super(view);
            Intrinsics.checkParameterIsNotNull(view, "view");
            this.f139499a = view;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f139497b.size();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/todo/impl/features/detail/assignee/list/TodoAssigneeAdapter$showMoreDialog$builder$1", "Lcom/larksuite/component/universe_design/dialog/UDListDialogController$OnItemClickListener;", "onItemClick", "", "index", "", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.assignee.a.b$j */
    public static final class C56408j implements UDListDialogController.OnItemClickListener {

        /* renamed from: a */
        final /* synthetic */ TodoAssigneeAdapter f139519a;

        /* renamed from: b */
        final /* synthetic */ AssigneeBean f139520b;

        /* renamed from: c */
        final /* synthetic */ Context f139521c;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "onMenuItemClick"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.todo.impl.features.detail.assignee.a.b$j$a */
        static final class C56409a implements C58339d.AbstractC58343b {

            /* renamed from: a */
            final /* synthetic */ C56408j f139522a;

            C56409a(C56408j jVar) {
                this.f139522a = jVar;
            }

            @Override // com.ss.android.lark.widget.p2932c.C58339d.AbstractC58343b
            public final void onMenuItemClick() {
                this.f139522a.f139519a.f139496a.mo92075d().mo92068a(26, this.f139522a.f139520b.mo192757a());
            }
        }

        @Override // com.larksuite.component.universe_design.dialog.UDListDialogController.OnItemClickListener
        public void onItemClick(int i) {
            if (i == 0) {
                this.f139519a.mo192133a(this.f139520b);
            } else if (this.f139520b.mo192761e()) {
                this.f139519a.mo192135b(this.f139521c, new C56409a(this));
            } else {
                this.f139519a.f139496a.mo92075d().mo92068a(25, this.f139520b.mo192757a());
            }
        }

        C56408j(TodoAssigneeAdapter bVar, AssigneeBean aVar, Context context) {
            this.f139519a = bVar;
            this.f139520b = aVar;
            this.f139521c = context;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/todo/impl/features/detail/assignee/list/TodoAssigneeAdapter$deleteDialog$1", "Lcom/larksuite/component/universe_design/dialog/UDListDialogController$OnItemClickListener;", "onItemClick", "", "index", "", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.assignee.a.b$c */
    public static final class C56397c implements UDListDialogController.OnItemClickListener {

        /* renamed from: a */
        final /* synthetic */ C58339d.AbstractC58343b f139500a;

        C56397c(C58339d.AbstractC58343b bVar) {
            this.f139500a = bVar;
        }

        @Override // com.larksuite.component.universe_design.dialog.UDListDialogController.OnItemClickListener
        public void onItemClick(int i) {
            this.f139500a.onMenuItemClick();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/todo/impl/features/detail/assignee/list/TodoAssigneeAdapter$showDeleteSelfDialog$1", "Lcom/larksuite/component/universe_design/dialog/UDListDialogController$OnItemClickListener;", "onItemClick", "", "index", "", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.assignee.a.b$i */
    public static final class C56407i implements UDListDialogController.OnItemClickListener {

        /* renamed from: a */
        final /* synthetic */ C58339d.AbstractC58343b f139518a;

        C56407i(C58339d.AbstractC58343b bVar) {
            this.f139518a = bVar;
        }

        @Override // com.larksuite.component.universe_design.dialog.UDListDialogController.OnItemClickListener
        public void onItemClick(int i) {
            this.f139518a.onMenuItemClick();
        }
    }

    /* renamed from: a */
    public final void mo192134a(List<AssigneeBean> list) {
        Intrinsics.checkParameterIsNotNull(list, "list");
        this.f139497b = list;
        notifyDataSetChanged();
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/ss/android/lark/todo/impl/features/detail/assignee/list/TodoAssigneeAdapter$onBindViewHolder$4$1"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.assignee.a.b$e */
    public static final class View$OnClickListenerC56401e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ LinearLayout f139507a;

        /* renamed from: b */
        final /* synthetic */ TodoAssigneeAdapter f139508b;

        /* renamed from: c */
        final /* synthetic */ AssigneeBean f139509c;

        View$OnClickListenerC56401e(LinearLayout linearLayout, TodoAssigneeAdapter bVar, AssigneeBean aVar) {
            this.f139507a = linearLayout;
            this.f139508b = bVar;
            this.f139509c = aVar;
        }

        public final void onClick(View view) {
            TodoAssigneeAdapter bVar = this.f139508b;
            Context context = this.f139507a.getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "context");
            bVar.mo192130a(context, this.f139509c);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.assignee.a.b$h */
    public static final class View$OnClickListenerC56406h implements View.OnClickListener {

        /* renamed from: a */
        public static final View$OnClickListenerC56406h f139517a = new View$OnClickListenerC56406h();

        View$OnClickListenerC56406h() {
        }

        public final void onClick(View view) {
            OperationToastHelper operationToastHelper = OperationToastHelper.f139395a;
            Intrinsics.checkExpressionValueIsNotNull(view, "it");
            OperationToastHelper.m219777b(operationToastHelper, view.getContext(), R.string.Todo_Task_UnableEditTaskFromDocs, null, null, null, null, 60, null);
        }
    }

    /* renamed from: a */
    public final void mo192133a(AssigneeBean aVar) {
        this.f139496a.mo92075d().mo92066a(255, (IActionData) new CompleteInfo(aVar));
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/ss/android/lark/todo/impl/features/detail/assignee/list/TodoAssigneeAdapter$onBindViewHolder$3$1"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.assignee.a.b$d */
    public static final class View$OnClickListenerC56398d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ImageView f139501a;

        /* renamed from: b */
        final /* synthetic */ TodoAssigneeAdapter f139502b;

        /* renamed from: c */
        final /* synthetic */ ViewHolder f139503c;

        /* renamed from: d */
        final /* synthetic */ AssigneeBean f139504d;

        View$OnClickListenerC56398d(ImageView imageView, TodoAssigneeAdapter bVar, ViewHolder bVar2, AssigneeBean aVar) {
            this.f139501a = imageView;
            this.f139502b = bVar;
            this.f139503c = bVar2;
            this.f139504d = aVar;
        }

        public final void onClick(View view) {
            if (this.f139504d.mo192761e()) {
                TodoAssigneeAdapter bVar = this.f139502b;
                Context context = this.f139501a.getContext();
                Intrinsics.checkExpressionValueIsNotNull(context, "context");
                bVar.mo192135b(context, new C58339d.AbstractC58343b(this) {
                    /* class com.ss.android.lark.todo.impl.features.detail.assignee.list.TodoAssigneeAdapter.View$OnClickListenerC56398d.C563991 */

                    /* renamed from: a */
                    final /* synthetic */ View$OnClickListenerC56398d f139505a;

                    {
                        this.f139505a = r1;
                    }

                    @Override // com.ss.android.lark.widget.p2932c.C58339d.AbstractC58343b
                    public final void onMenuItemClick() {
                        this.f139505a.f139502b.f139496a.mo92075d().mo92068a(26, this.f139505a.f139504d.mo192757a());
                    }
                });
                return;
            }
            TodoAssigneeAdapter bVar2 = this.f139502b;
            Context context2 = this.f139501a.getContext();
            Intrinsics.checkExpressionValueIsNotNull(context2, "context");
            bVar2.mo192131a(context2, new C58339d.AbstractC58343b(this) {
                /* class com.ss.android.lark.todo.impl.features.detail.assignee.list.TodoAssigneeAdapter.View$OnClickListenerC56398d.C564002 */

                /* renamed from: a */
                final /* synthetic */ View$OnClickListenerC56398d f139506a;

                {
                    this.f139506a = r1;
                }

                @Override // com.ss.android.lark.widget.p2932c.C58339d.AbstractC58343b
                public final void onMenuItemClick() {
                    this.f139506a.f139502b.f139496a.mo92075d().mo92068a(25, this.f139506a.f139504d.mo192757a());
                }
            });
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/ss/android/lark/todo/impl/features/detail/assignee/list/TodoAssigneeAdapter$onBindViewHolder$5$1"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.assignee.a.b$f */
    public static final class View$OnClickListenerC56402f implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ LinearLayout f139510a;

        /* renamed from: b */
        final /* synthetic */ TodoAssigneeAdapter f139511b;

        /* renamed from: c */
        final /* synthetic */ AssigneeBean f139512c;

        View$OnClickListenerC56402f(LinearLayout linearLayout, TodoAssigneeAdapter bVar, AssigneeBean aVar) {
            this.f139510a = linearLayout;
            this.f139511b = bVar;
            this.f139512c = aVar;
        }

        public final void onClick(View view) {
            if (this.f139512c.mo192761e()) {
                TodoAssigneeAdapter bVar = this.f139511b;
                Context context = this.f139510a.getContext();
                Intrinsics.checkExpressionValueIsNotNull(context, "context");
                bVar.mo192135b(context, new C58339d.AbstractC58343b(this) {
                    /* class com.ss.android.lark.todo.impl.features.detail.assignee.list.TodoAssigneeAdapter.View$OnClickListenerC56402f.C564031 */

                    /* renamed from: a */
                    final /* synthetic */ View$OnClickListenerC56402f f139513a;

                    {
                        this.f139513a = r1;
                    }

                    @Override // com.ss.android.lark.widget.p2932c.C58339d.AbstractC58343b
                    public final void onMenuItemClick() {
                        this.f139513a.f139511b.f139496a.mo92075d().mo92068a(26, this.f139513a.f139512c.mo192757a());
                    }
                });
                return;
            }
            TodoAssigneeAdapter bVar2 = this.f139511b;
            Context context2 = this.f139510a.getContext();
            Intrinsics.checkExpressionValueIsNotNull(context2, "context");
            bVar2.mo192131a(context2, new C58339d.AbstractC58343b(this) {
                /* class com.ss.android.lark.todo.impl.features.detail.assignee.list.TodoAssigneeAdapter.View$OnClickListenerC56402f.C564042 */

                /* renamed from: a */
                final /* synthetic */ View$OnClickListenerC56402f f139514a;

                {
                    this.f139514a = r1;
                }

                @Override // com.ss.android.lark.widget.p2932c.C58339d.AbstractC58343b
                public final void onMenuItemClick() {
                    this.f139514a.f139511b.f139496a.mo92075d().mo92068a(25, this.f139514a.f139512c.mo192757a());
                }
            });
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.assignee.a.b$g */
    public static final class View$OnClickListenerC56405g implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ViewHolder f139515a;

        /* renamed from: b */
        final /* synthetic */ AssigneeBean f139516b;

        View$OnClickListenerC56405g(ViewHolder bVar, AssigneeBean aVar) {
            this.f139515a = bVar;
            this.f139516b = aVar;
        }

        public final void onClick(View view) {
            IMessengerDependency messengerModuleDependency = TodoDependencyHolder.f139242a.mo191730a().messengerModuleDependency();
            Context context = this.f139515a.mo192136a().getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "holder.view.context");
            messengerModuleDependency.mo145420a(context, this.f139516b.mo192757a());
        }
    }

    public TodoAssigneeAdapter(IViewAbility<ITodoDetailViewDataStore> fVar) {
        Intrinsics.checkParameterIsNotNull(fVar, "viewAbility");
        this.f139496a = fVar;
    }

    /* renamed from: a */
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.todo_detail_assginee_fragment_item, viewGroup, false);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "LayoutInflater.from(pare…ment_item, parent, false)");
        ImageView imageView = (ImageView) inflate.findViewById(R.id.user_delete);
        Intrinsics.checkExpressionValueIsNotNull(imageView, "view.user_delete");
        C56263a.m219590a(imageView, UIUtils.dp2px(viewGroup.getContext(), 16.0f));
        return new ViewHolder(inflate);
    }

    /* renamed from: a */
    public final void mo192130a(Context context, AssigneeBean aVar) {
        String str;
        if (aVar.mo192764g()) {
            str = ResUtil.f139261a.mo191781c(R.string.Todo_CollabTask_MarkAsNotComplete);
        } else {
            str = ResUtil.f139261a.mo191781c(R.string.Todo_CollabTask_MarkAsComplete);
        }
        String c = ResUtil.f139261a.mo191781c(R.string.Todo_CollabTask_RemovePeople);
        ((UDActionPanelBuilder) ((UDActionPanelBuilder) ((UDActionPanelBuilder) new UDActionPanelBuilder(context).mo90870a(CollectionsKt.listOf((Object[]) new String[]{str, c}))).mo90869a(new C56408j(this, aVar, context))).addActionButton(R.id.ud_dialog_btn_cancel, ResUtil.f139261a.mo191781c(R.string.Todo_Common_Cancel), (DialogInterface.OnClickListener) null)).show();
    }

    /* renamed from: b */
    public final void mo192135b(Context context, C58339d.AbstractC58343b bVar) {
        List<? extends CharSequence> singletonList = Collections.singletonList(ResUtil.f139261a.mo191781c(R.string.Todo_Task_RemoveOneselfFromAssigneesRemoveButton));
        Intrinsics.checkExpressionValueIsNotNull(singletonList, "Collections.singletonLis…omAssigneesRemoveButton))");
        ((UDActionPanelBuilder) ((UDActionPanelBuilder) ((UDActionPanelBuilder) ((UDActionPanelBuilder) new UDActionPanelBuilder(context).title(ResUtil.f139261a.mo191781c(R.string.Todo_Task_RemoveOneselfFromAssigneesDialogContent))).mo90870a(singletonList)).mo90869a(new C56407i(bVar))).addActionButton(R.id.ud_dialog_btn_cancel, ResUtil.f139261a.mo191781c(R.string.Todo_Common_Cancel), (DialogInterface.OnClickListener) null)).show();
    }

    /* renamed from: a */
    public final void mo192131a(Context context, C58339d.AbstractC58343b bVar) {
        UDActionPanelBuilder aVar = new UDActionPanelBuilder(context);
        List<? extends CharSequence> singletonList = Collections.singletonList(ResUtil.f139261a.mo191781c(R.string.Todo_Task_RemoveAssignee));
        Intrinsics.checkExpressionValueIsNotNull(singletonList, "Collections.singletonLis…odo_Task_RemoveAssignee))");
        ((UDActionPanelBuilder) ((UDActionPanelBuilder) ((UDActionPanelBuilder) aVar.mo90870a(singletonList)).mo90869a(new C56397c(bVar))).addActionButton(R.id.ud_dialog_btn_cancel, ResUtil.f139261a.mo191781c(R.string.Todo_Common_Cancel), (DialogInterface.OnClickListener) null)).show();
    }

    /* renamed from: a */
    public void onBindViewHolder(ViewHolder bVar, int i) {
        Intrinsics.checkParameterIsNotNull(bVar, "holder");
        AssigneeBean aVar = this.f139497b.get(i);
        ((LarkAvatarView) bVar.mo192136a().findViewById(R.id.user_avatar)).mo89076a(((AvatarBuilder) ((AvatarBuilder) new AvatarBuilder().mo88962a(aVar.mo192759c())).mo88967b(aVar.mo192757a())).mo88976k());
        TextView textView = (TextView) bVar.mo192136a().findViewById(R.id.user_name);
        Intrinsics.checkExpressionValueIsNotNull(textView, "holder.view.user_name");
        textView.setText(aVar.mo192758b());
        ExternalTagHelper cVar = ExternalTagHelper.f139400a;
        TextView textView2 = (TextView) bVar.mo192136a().findViewById(R.id.user_name);
        Intrinsics.checkExpressionValueIsNotNull(textView2, "holder.view.user_name");
        cVar.mo192001a(textView2, aVar.mo192763f());
        bVar.mo192136a().setOnClickListener(new View$OnClickListenerC56405g(bVar, aVar));
        int d = aVar.mo192760d();
        if (d == 0) {
            LinearLayout linearLayout = (LinearLayout) bVar.mo192136a().findViewById(R.id.user_more);
            Intrinsics.checkExpressionValueIsNotNull(linearLayout, "holder.view.user_more");
            linearLayout.setVisibility(8);
            ImageView imageView = (ImageView) bVar.mo192136a().findViewById(R.id.user_delete);
            imageView.setVisibility(0);
            Context context = bVar.mo192136a().getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "holder.view.context");
            imageView.setBackground(UDIconUtils.getIconDrawable(context, (int) R.drawable.ud_icon_close_outlined, ResUtil.f139261a.mo191775a(R.color.icon_n1)));
            imageView.setOnClickListener(new View$OnClickListenerC56398d(imageView, this, bVar, aVar));
        } else if (d == 1) {
            LinearLayout linearLayout2 = (LinearLayout) bVar.mo192136a().findViewById(R.id.user_more);
            Intrinsics.checkExpressionValueIsNotNull(linearLayout2, "holder.view.user_more");
            linearLayout2.setVisibility(8);
            ImageView imageView2 = (ImageView) bVar.mo192136a().findViewById(R.id.user_delete);
            imageView2.setVisibility(0);
            Context context2 = bVar.mo192136a().getContext();
            Intrinsics.checkExpressionValueIsNotNull(context2, "holder.view.context");
            imageView2.setBackground(UDIconUtils.getIconDrawable(context2, (int) R.drawable.ud_icon_close_outlined, ResUtil.f139261a.mo191775a(R.color.icon_n3)));
            imageView2.setOnClickListener(View$OnClickListenerC56406h.f139517a);
        } else if (d == 2) {
            LinearLayout linearLayout3 = (LinearLayout) bVar.mo192136a().findViewById(R.id.user_more);
            Intrinsics.checkExpressionValueIsNotNull(linearLayout3, "holder.view.user_more");
            linearLayout3.setVisibility(8);
            ImageView imageView3 = (ImageView) bVar.mo192136a().findViewById(R.id.user_delete);
            Intrinsics.checkExpressionValueIsNotNull(imageView3, "holder.view.user_delete");
            imageView3.setVisibility(8);
        } else if (d == 3) {
            ImageView imageView4 = (ImageView) bVar.mo192136a().findViewById(R.id.user_delete);
            Intrinsics.checkExpressionValueIsNotNull(imageView4, "holder.view.user_delete");
            imageView4.setVisibility(8);
            LinearLayout linearLayout4 = (LinearLayout) bVar.mo192136a().findViewById(R.id.user_more);
            linearLayout4.setVisibility(0);
            linearLayout4.setOnClickListener(new View$OnClickListenerC56401e(linearLayout4, this, aVar));
        } else if (d == 4) {
            ImageView imageView5 = (ImageView) bVar.mo192136a().findViewById(R.id.user_delete);
            Intrinsics.checkExpressionValueIsNotNull(imageView5, "holder.view.user_delete");
            imageView5.setVisibility(8);
            LinearLayout linearLayout5 = (LinearLayout) bVar.mo192136a().findViewById(R.id.user_more);
            linearLayout5.setVisibility(0);
            linearLayout5.setOnClickListener(new View$OnClickListenerC56402f(linearLayout5, this, aVar));
        }
    }
}
