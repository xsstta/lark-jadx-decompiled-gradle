package com.ss.android.lark.todo.impl.features.detail.sections;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import com.larksuite.component.ui.avatar.AvatarModel;
import com.larksuite.component.ui.avatar.v2.LarkAvatarView;
import com.larksuite.framework.p1173a.p1174a.C25877a;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003%&'B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\u0017\u001a\u00020\nH\u0016J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\nH\u0016J\u0018\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\nH\u0016J\u0018\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\nH\u0016J\u0014\u0010\"\u001a\u00020\u001c2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007J\u000e\u0010#\u001a\u00020\u001c2\u0006\u0010$\u001a\u00020\u0010R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0011\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\f\"\u0004\b\u0013\u0010\u000eR\u001a\u0010\u0014\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\f\"\u0004\b\u0016\u0010\u000e¨\u0006("}, d2 = {"Lcom/ss/android/lark/todo/impl/features/detail/sections/AssigneeAvatarAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "assignees", "", "Lcom/ss/android/lark/todo/impl/features/detail/sections/AssigneeAvatarBean;", "avatarWidth", "", "getAvatarWidth", "()I", "setAvatarWidth", "(I)V", "itemClickListener", "Lcom/ss/android/lark/todo/impl/features/detail/sections/AssigneeAvatarAdapter$ItemClickListener;", "paddingRight", "getPaddingRight", "setPaddingRight", "statusWidth", "getStatusWidth", "setStatusWidth", "getItemCount", "getItemId", "", "position", "onBindViewHolder", "", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setData", "setItemClickListener", "listener", "AssigneeViewHolder", "AvatarBuilder", "ItemClickListener", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.impl.features.detail.d.a */
public final class AssigneeAvatarAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* renamed from: a */
    public ItemClickListener f139932a;

    /* renamed from: b */
    private List<AssigneeAvatarBean> f139933b = new ArrayList();

    /* renamed from: c */
    private int f139934c;

    /* renamed from: d */
    private int f139935d;

    /* renamed from: e */
    private int f139936e;

    /* renamed from: f */
    private final Context f139937f;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/detail/sections/AssigneeAvatarAdapter$AvatarBuilder;", "Lcom/larksuite/component/ui/avatar/AvatarModel$Builder;", "()V", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.d.a$b */
    private static final class AvatarBuilder extends AvatarModel.Builder<AvatarBuilder> {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/detail/sections/AssigneeAvatarAdapter$ItemClickListener;", "", "onItemClick", "", "view", "Landroid/view/View;", "item", "Lcom/ss/android/lark/todo/impl/features/detail/sections/AssigneeAvatarBean;", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.d.a$c */
    public interface ItemClickListener {
        /* renamed from: a */
        void mo191810a(View view, AssigneeAvatarBean bVar);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/detail/sections/AssigneeAvatarAdapter$AssigneeViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Lcom/ss/android/lark/todo/impl/features/detail/sections/AssigneeAvatarAdapter;Landroid/view/View;)V", "avatar", "Lcom/larksuite/component/ui/avatar/v2/LarkAvatarView;", "getAvatar", "()Lcom/larksuite/component/ui/avatar/v2/LarkAvatarView;", "container", "Landroidx/constraintlayout/widget/ConstraintLayout;", "getContainer", "()Landroidx/constraintlayout/widget/ConstraintLayout;", UpdateKey.STATUS, "Landroid/widget/ImageView;", "getStatus", "()Landroid/widget/ImageView;", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.d.a$a */
    public final class AssigneeViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        final /* synthetic */ AssigneeAvatarAdapter f139938a;

        /* renamed from: b */
        private final LarkAvatarView f139939b;

        /* renamed from: c */
        private final ImageView f139940c;

        /* renamed from: d */
        private final ConstraintLayout f139941d;

        /* renamed from: a */
        public final LarkAvatarView mo192539a() {
            return this.f139939b;
        }

        /* renamed from: b */
        public final ImageView mo192540b() {
            return this.f139940c;
        }

        /* renamed from: c */
        public final ConstraintLayout mo192541c() {
            return this.f139941d;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public AssigneeViewHolder(AssigneeAvatarAdapter aVar, View view) {
            super(view);
            Intrinsics.checkParameterIsNotNull(view, "view");
            this.f139938a = aVar;
            LarkAvatarView larkAvatarView = (LarkAvatarView) view.findViewById(R.id.avatar);
            Intrinsics.checkExpressionValueIsNotNull(larkAvatarView, "view.avatar");
            this.f139939b = larkAvatarView;
            ImageView imageView = (ImageView) view.findViewById(R.id.status);
            Intrinsics.checkExpressionValueIsNotNull(imageView, "view.status");
            this.f139940c = imageView;
            ConstraintLayout constraintLayout = (ConstraintLayout) view.findViewById(R.id.avatarContainer);
            Intrinsics.checkExpressionValueIsNotNull(constraintLayout, "view.avatarContainer");
            this.f139941d = constraintLayout;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f139933b.size();
    }

    /* renamed from: a */
    public final void mo192535a(int i) {
        this.f139934c = i;
    }

    /* renamed from: b */
    public final void mo192538b(int i) {
        this.f139935d = i;
    }

    /* renamed from: a */
    public final void mo192536a(ItemClickListener cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "listener");
        this.f139932a = cVar;
    }

    /* renamed from: a */
    public final void mo192537a(List<AssigneeAvatarBean> list) {
        Intrinsics.checkParameterIsNotNull(list, "assignees");
        this.f139933b = list;
        notifyDataSetChanged();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.d.a$d */
    static final class View$OnClickListenerC56572d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AssigneeAvatarAdapter f139942a;

        /* renamed from: b */
        final /* synthetic */ AssigneeViewHolder f139943b;

        /* renamed from: c */
        final /* synthetic */ AssigneeAvatarBean f139944c;

        View$OnClickListenerC56572d(AssigneeAvatarAdapter aVar, AssigneeViewHolder aVar2, AssigneeAvatarBean bVar) {
            this.f139942a = aVar;
            this.f139943b = aVar2;
            this.f139944c = bVar;
        }

        public final void onClick(View view) {
            ItemClickListener cVar = this.f139942a.f139932a;
            if (cVar != null) {
                cVar.mo191810a(this.f139943b.mo192541c(), this.f139944c);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i) {
        return (long) this.f139933b.get(i).mo192543a().hashCode();
    }

    public AssigneeAvatarAdapter(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f139937f = context;
        this.f139934c = UIUtils.dp2px(context, 7.0f);
        this.f139935d = UIUtils.dp2px(context, 24.0f);
        this.f139936e = UIUtils.dp2px(context, 10.0f);
        setHasStableIds(true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        View inflate = LayoutInflater.from(this.f139937f).inflate(R.layout.todo_item_assignee_avator, viewGroup, false);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "view");
        return new AssigneeViewHolder(this, inflate);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        int i2;
        Intrinsics.checkParameterIsNotNull(viewHolder, "holder");
        AssigneeAvatarBean bVar = this.f139933b.get(i);
        AssigneeViewHolder aVar = (AssigneeViewHolder) viewHolder;
        aVar.mo192539a().mo89076a(((AvatarBuilder) ((AvatarBuilder) new AvatarBuilder().mo88962a(bVar.mo192544b())).mo88967b(bVar.mo192543a())).mo88976k());
        C25877a.m93659a(aVar.mo192540b(), bVar.mo192545c());
        ConstraintLayout c = aVar.mo192541c();
        if (i != this.f139933b.size() - 1) {
            i2 = this.f139934c;
        } else {
            i2 = 0;
        }
        c.setPadding(0, 0, i2, 0);
        aVar.mo192541c().setOnClickListener(new View$OnClickListenerC56572d(this, aVar, bVar));
        ViewGroup.LayoutParams layoutParams = aVar.mo192539a().getLayoutParams();
        ViewGroup.LayoutParams layoutParams2 = aVar.mo192540b().getLayoutParams();
        layoutParams.width = this.f139935d;
        layoutParams.height = this.f139935d;
        layoutParams2.width = this.f139936e;
        layoutParams2.height = this.f139936e;
        aVar.mo192539a().setLayoutParams(layoutParams);
        aVar.mo192540b().setLayoutParams(layoutParams2);
    }
}
