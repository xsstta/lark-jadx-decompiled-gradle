package com.ss.android.lark.todo.impl.features.detail.assignee.list;

import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.AbstractC1178x;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.component.ui.avatar.AvatarModel;
import com.larksuite.component.ui.avatar.v2.LarkAvatarView;
import com.larksuite.component.universe_design.dialog.UDListDialogController;
import com.larksuite.component.universe_design.dialog.actionpanel.UDActionPanelBuilder;
import com.larksuite.component.universe_design.icon.UDIconUtils;
import com.larksuite.framework.section.IViewAbility;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.todo.dependency.TodoDependencyHolder;
import com.ss.android.lark.todo.dependency.idependency.IMessengerDependency;
import com.ss.android.lark.todo.impl.features.common.helper.ExternalTagHelper;
import com.ss.android.lark.todo.impl.features.detail.viewmodel.FollowerBean;
import com.ss.android.lark.todo.impl.features.detail.viewmodel.ITodoDetailViewDataStore;
import com.ss.android.lark.todo.impl.p2791b.C56263a;
import com.ss.android.lark.todo.impl.utils.ResUtil;
import com.ss.android.lark.widget.p2932c.C58339d;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u001c\u001dB\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\u0010\u0006J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u0018\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0011H\u0016J\u0018\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0011H\u0016J\u0018\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0016\u0010\u001a\u001a\u00020\u000b2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/detail/assignee/list/TodoFollowerAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/ss/android/lark/todo/impl/features/detail/assignee/list/TodoFollowerAdapter$ViewHolder;", "viewAbility", "Lcom/larksuite/framework/section/IViewAbility;", "Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/ITodoDetailViewDataStore;", "(Lcom/larksuite/framework/section/IViewAbility;)V", "followerList", "", "Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/FollowerBean;", "deleteDialog", "", "context", "Landroid/content/Context;", "listener", "Lcom/ss/android/lark/widget/menu/MenuUtils$DialogItemClickListener;", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "showDeleteSelfDialog", "updateData", "list", "AvatarBuilder", "ViewHolder", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.impl.features.detail.assignee.a.g */
public final class TodoFollowerAdapter extends RecyclerView.Adapter<ViewHolder> {

    /* renamed from: a */
    public final IViewAbility<ITodoDetailViewDataStore> f139548a;

    /* renamed from: b */
    private List<FollowerBean> f139549b = new ArrayList();

    /* access modifiers changed from: private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/detail/assignee/list/TodoFollowerAdapter$AvatarBuilder;", "Lcom/larksuite/component/ui/avatar/AvatarModel$Builder;", "()V", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.assignee.a.g$a */
    public static final class AvatarBuilder extends AvatarModel.Builder<AvatarBuilder> {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/detail/assignee/list/TodoFollowerAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Landroid/view/View;)V", "getView", "()Landroid/view/View;", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.assignee.a.g$b */
    public static final class ViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        private final View f139551a;

        /* renamed from: a */
        public final View mo192161a() {
            return this.f139551a;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ViewHolder(View view) {
            super(view);
            Intrinsics.checkParameterIsNotNull(view, "view");
            this.f139551a = view;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f139549b.size();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/todo/impl/features/detail/assignee/list/TodoFollowerAdapter$deleteDialog$1", "Lcom/larksuite/component/universe_design/dialog/UDListDialogController$OnItemClickListener;", "onItemClick", "", "index", "", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.assignee.a.g$c */
    public static final class C56430c implements UDListDialogController.OnItemClickListener {

        /* renamed from: a */
        final /* synthetic */ C58339d.AbstractC58343b f139552a;

        C56430c(C58339d.AbstractC58343b bVar) {
            this.f139552a = bVar;
        }

        @Override // com.larksuite.component.universe_design.dialog.UDListDialogController.OnItemClickListener
        public void onItemClick(int i) {
            this.f139552a.onMenuItemClick();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/todo/impl/features/detail/assignee/list/TodoFollowerAdapter$showDeleteSelfDialog$1", "Lcom/larksuite/component/universe_design/dialog/UDListDialogController$OnItemClickListener;", "onItemClick", "", "index", "", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.assignee.a.g$f */
    public static final class C56435f implements UDListDialogController.OnItemClickListener {

        /* renamed from: a */
        final /* synthetic */ C58339d.AbstractC58343b f139561a;

        C56435f(C58339d.AbstractC58343b bVar) {
            this.f139561a = bVar;
        }

        @Override // com.larksuite.component.universe_design.dialog.UDListDialogController.OnItemClickListener
        public void onItemClick(int i) {
            this.f139561a.onMenuItemClick();
        }
    }

    /* renamed from: a */
    public final void mo192158a(List<FollowerBean> list) {
        this.f139549b = list;
        notifyDataSetChanged();
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/ss/android/lark/todo/impl/features/detail/assignee/list/TodoFollowerAdapter$onBindViewHolder$1$1"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.assignee.a.g$d */
    public static final class View$OnClickListenerC56431d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ImageView f139553a;

        /* renamed from: b */
        final /* synthetic */ TodoFollowerAdapter f139554b;

        /* renamed from: c */
        final /* synthetic */ ViewHolder f139555c;

        /* renamed from: d */
        final /* synthetic */ FollowerBean f139556d;

        View$OnClickListenerC56431d(ImageView imageView, TodoFollowerAdapter gVar, ViewHolder bVar, FollowerBean lVar) {
            this.f139553a = imageView;
            this.f139554b = gVar;
            this.f139555c = bVar;
            this.f139556d = lVar;
        }

        public final void onClick(View view) {
            if (this.f139556d.mo193022e()) {
                TodoFollowerAdapter gVar = this.f139554b;
                Context context = this.f139553a.getContext();
                Intrinsics.checkExpressionValueIsNotNull(context, "context");
                gVar.mo192159b(context, new C58339d.AbstractC58343b(this) {
                    /* class com.ss.android.lark.todo.impl.features.detail.assignee.list.TodoFollowerAdapter.View$OnClickListenerC56431d.C564321 */

                    /* renamed from: a */
                    final /* synthetic */ View$OnClickListenerC56431d f139557a;

                    {
                        this.f139557a = r1;
                    }

                    @Override // com.ss.android.lark.widget.p2932c.C58339d.AbstractC58343b
                    public final void onMenuItemClick() {
                        this.f139557a.f139554b.f139548a.mo92075d().mo92068a(36, this.f139557a.f139556d.mo193018a());
                    }
                });
                return;
            }
            TodoFollowerAdapter gVar2 = this.f139554b;
            Context context2 = this.f139553a.getContext();
            Intrinsics.checkExpressionValueIsNotNull(context2, "context");
            gVar2.mo192156a(context2, new C58339d.AbstractC58343b(this) {
                /* class com.ss.android.lark.todo.impl.features.detail.assignee.list.TodoFollowerAdapter.View$OnClickListenerC56431d.C564332 */

                /* renamed from: a */
                final /* synthetic */ View$OnClickListenerC56431d f139558a;

                {
                    this.f139558a = r1;
                }

                @Override // com.ss.android.lark.widget.p2932c.C58339d.AbstractC58343b
                public final void onMenuItemClick() {
                    this.f139558a.f139554b.f139548a.mo92075d().mo92068a(35, this.f139558a.f139556d.mo193018a());
                }
            });
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.assignee.a.g$e */
    public static final class View$OnClickListenerC56434e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ViewHolder f139559a;

        /* renamed from: b */
        final /* synthetic */ FollowerBean f139560b;

        View$OnClickListenerC56434e(ViewHolder bVar, FollowerBean lVar) {
            this.f139559a = bVar;
            this.f139560b = lVar;
        }

        public final void onClick(View view) {
            IMessengerDependency messengerModuleDependency = TodoDependencyHolder.f139242a.mo191730a().messengerModuleDependency();
            Context context = this.f139559a.mo192161a().getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "holder.view.context");
            messengerModuleDependency.mo145420a(context, this.f139560b.mo193018a());
        }
    }

    public TodoFollowerAdapter(IViewAbility<ITodoDetailViewDataStore> fVar) {
        Intrinsics.checkParameterIsNotNull(fVar, "viewAbility");
        this.f139548a = fVar;
        fVar.mo92073b().getFollowers().mo5923a(fVar.mo92074c(), new AbstractC1178x<List<? extends FollowerBean>>(this) {
            /* class com.ss.android.lark.todo.impl.features.detail.assignee.list.TodoFollowerAdapter.C564291 */

            /* renamed from: a */
            final /* synthetic */ TodoFollowerAdapter f139550a;

            {
                this.f139550a = r1;
            }

            /* renamed from: a */
            public final void onChanged(List<FollowerBean> list) {
                TodoFollowerAdapter gVar = this.f139550a;
                Intrinsics.checkExpressionValueIsNotNull(list, "it");
                gVar.mo192158a(list);
            }
        });
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
    public final void mo192156a(Context context, C58339d.AbstractC58343b bVar) {
        UDActionPanelBuilder aVar = new UDActionPanelBuilder(context);
        List<? extends CharSequence> singletonList = Collections.singletonList(ResUtil.f139261a.mo191781c(R.string.Todo_Task_RemoveFollower));
        Intrinsics.checkExpressionValueIsNotNull(singletonList, "Collections.singletonLis…odo_Task_RemoveFollower))");
        ((UDActionPanelBuilder) ((UDActionPanelBuilder) ((UDActionPanelBuilder) aVar.mo90870a(singletonList)).mo90869a(new C56430c(bVar))).addActionButton(R.id.ud_dialog_btn_cancel, ResUtil.f139261a.mo191781c(R.string.Todo_Common_Cancel), (DialogInterface.OnClickListener) null)).show();
    }

    /* renamed from: b */
    public final void mo192159b(Context context, C58339d.AbstractC58343b bVar) {
        List<? extends CharSequence> singletonList = Collections.singletonList(ResUtil.f139261a.mo191781c(R.string.Todo_Task_Confirm));
        Intrinsics.checkExpressionValueIsNotNull(singletonList, "Collections.singletonLis…tring.Todo_Task_Confirm))");
        ((UDActionPanelBuilder) ((UDActionPanelBuilder) ((UDActionPanelBuilder) ((UDActionPanelBuilder) new UDActionPanelBuilder(context).title(ResUtil.f139261a.mo191781c(R.string.Todo_Task_RemoveYourselfFromFollowersDialogueContent))).mo90870a(singletonList)).mo90869a(new C56435f(bVar))).addActionButton(R.id.ud_dialog_btn_cancel, ResUtil.f139261a.mo191781c(R.string.Todo_Common_Cancel), (DialogInterface.OnClickListener) null)).show();
    }

    /* renamed from: a */
    public void onBindViewHolder(ViewHolder bVar, int i) {
        Intrinsics.checkParameterIsNotNull(bVar, "holder");
        FollowerBean lVar = this.f139549b.get(i);
        ((LarkAvatarView) bVar.mo192161a().findViewById(R.id.user_avatar)).mo89076a(((AvatarBuilder) ((AvatarBuilder) new AvatarBuilder().mo88962a(lVar.mo193020c())).mo88967b(lVar.mo193018a())).mo88976k());
        TextView textView = (TextView) bVar.mo192161a().findViewById(R.id.user_name);
        Intrinsics.checkExpressionValueIsNotNull(textView, "holder.view.user_name");
        textView.setText(lVar.mo193019b());
        ExternalTagHelper cVar = ExternalTagHelper.f139400a;
        TextView textView2 = (TextView) bVar.mo192161a().findViewById(R.id.user_name);
        Intrinsics.checkExpressionValueIsNotNull(textView2, "holder.view.user_name");
        cVar.mo192001a(textView2, lVar.mo193024f());
        if (lVar.mo193021d()) {
            ImageView imageView = (ImageView) bVar.mo192161a().findViewById(R.id.user_delete);
            imageView.setVisibility(0);
            Context context = bVar.mo192161a().getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "holder.view.context");
            imageView.setBackground(UDIconUtils.getIconDrawable(context, (int) R.drawable.ud_icon_close_outlined, ResUtil.f139261a.mo191775a(R.color.icon_n1)));
            imageView.setOnClickListener(new View$OnClickListenerC56431d(imageView, this, bVar, lVar));
        } else {
            ImageView imageView2 = (ImageView) bVar.mo192161a().findViewById(R.id.user_delete);
            Intrinsics.checkExpressionValueIsNotNull(imageView2, "holder.view.user_delete");
            imageView2.setVisibility(8);
        }
        bVar.mo192161a().setOnClickListener(new View$OnClickListenerC56434e(bVar, lVar));
    }
}
