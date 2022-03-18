package com.ss.android.lark.contact.impl.invite;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.component.ui.avatar.v2.LarkAvatarView;
import com.larksuite.suite.R;
import com.ss.android.lark.base.adapter.LarkRecyclerViewBaseAdapter;
import com.ss.android.lark.contact.entity.InactiveParent;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.listener.OnSingleClickListener;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00142\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u0014\u0015\u0016B\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0018\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000fH\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/ss/android/lark/contact/impl/invite/InviteInactiveListAdapter;", "Lcom/ss/android/lark/base/adapter/LarkRecyclerViewBaseAdapter;", "Lcom/ss/android/lark/contact/impl/invite/InviteInactiveListAdapter$InviteViewHolder;", "Lcom/ss/android/lark/contact/entity/InactiveParent;", "mContext", "Landroid/content/Context;", "mItemClickListener", "Lcom/ss/android/lark/contact/impl/invite/InviteInactiveListAdapter$OnItemClickListener;", "(Landroid/content/Context;Lcom/ss/android/lark/contact/impl/invite/InviteInactiveListAdapter$OnItemClickListener;)V", "getMContext", "()Landroid/content/Context;", "onBindViewHolder", "", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "Companion", "InviteViewHolder", "OnItemClickListener", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.contact.impl.invite.a */
public final class InviteInactiveListAdapter extends LarkRecyclerViewBaseAdapter<InviteViewHolder, InactiveParent> {

    /* renamed from: b */
    public static final int f92926b = UIHelper.dp2px(48.0f);

    /* renamed from: c */
    public static final Companion f92927c = new Companion(null);

    /* renamed from: a */
    public final OnItemClickListener f92928a;

    /* renamed from: d */
    private final Context f92929d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/contact/impl/invite/InviteInactiveListAdapter$OnItemClickListener;", "", "onItemClick", "", "id", "", "onItemInviteClick", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.contact.impl.invite.a$c */
    public interface OnItemClickListener {
        /* renamed from: a */
        void mo132267a(String str);

        /* renamed from: b */
        void mo132268b(String str);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/contact/impl/invite/InviteInactiveListAdapter$Companion;", "", "()V", "GROUP_AVATAR_SIZE", "", "getGROUP_AVATAR_SIZE", "()I", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.contact.impl.invite.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\b¨\u0006\u000f"}, d2 = {"Lcom/ss/android/lark/contact/impl/invite/InviteInactiveListAdapter$InviteViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "mAvatarIv", "Landroid/widget/ImageView;", "getMAvatarIv", "()Landroid/widget/ImageView;", "mNameTv", "Landroid/widget/TextView;", "getMNameTv", "()Landroid/widget/TextView;", "mSendBt", "getMSendBt", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.contact.impl.invite.a$b */
    public static final class InviteViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        private final ImageView f92930a;

        /* renamed from: b */
        private final TextView f92931b;

        /* renamed from: c */
        private final ImageView f92932c;

        /* renamed from: a */
        public final ImageView mo132264a() {
            return this.f92930a;
        }

        /* renamed from: b */
        public final TextView mo132265b() {
            return this.f92931b;
        }

        /* renamed from: c */
        public final ImageView mo132266c() {
            return this.f92932c;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public InviteViewHolder(View view) {
            super(view);
            Intrinsics.checkParameterIsNotNull(view, "itemView");
            LarkAvatarView larkAvatarView = (LarkAvatarView) view.findViewById(R.id.avatar);
            Intrinsics.checkExpressionValueIsNotNull(larkAvatarView, "itemView.avatar");
            this.f92930a = larkAvatarView;
            TextView textView = (TextView) view.findViewById(R.id.name);
            Intrinsics.checkExpressionValueIsNotNull(textView, "itemView.name");
            this.f92931b = textView;
            ImageView imageView = (ImageView) view.findViewById(R.id.send_button);
            Intrinsics.checkExpressionValueIsNotNull(imageView, "itemView.send_button");
            this.f92932c = imageView;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/contact/impl/invite/InviteInactiveListAdapter$onBindViewHolder$1", "Lcom/ss/android/lark/widget/listener/OnSingleClickListener;", "onSingleClick", "", "v", "Landroid/view/View;", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.contact.impl.invite.a$d */
    public static final class C35941d extends OnSingleClickListener {

        /* renamed from: a */
        final /* synthetic */ InviteInactiveListAdapter f92933a;

        /* renamed from: b */
        final /* synthetic */ InactiveParent f92934b;

        @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
        public void onSingleClick(View view) {
            String id = this.f92934b.getId();
            if (id != null) {
                this.f92933a.f92928a.mo132267a(id);
            }
        }

        C35941d(InviteInactiveListAdapter aVar, InactiveParent inactiveParent) {
            this.f92933a = aVar;
            this.f92934b = inactiveParent;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.contact.impl.invite.a$e */
    public static final class View$OnClickListenerC35942e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ InviteInactiveListAdapter f92935a;

        /* renamed from: b */
        final /* synthetic */ InactiveParent f92936b;

        View$OnClickListenerC35942e(InviteInactiveListAdapter aVar, InactiveParent inactiveParent) {
            this.f92935a = aVar;
            this.f92936b = inactiveParent;
        }

        public final void onClick(View view) {
            String id = this.f92936b.getId();
            if (id != null) {
                this.f92935a.f92928a.mo132268b(id);
            }
        }
    }

    public InviteInactiveListAdapter(Context context, OnItemClickListener cVar) {
        Intrinsics.checkParameterIsNotNull(context, "mContext");
        Intrinsics.checkParameterIsNotNull(cVar, "mItemClickListener");
        this.f92929d = context;
        this.f92928a = cVar;
    }

    /* renamed from: a */
    public InviteViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        View inflate = LayoutInflater.from(this.f92929d).inflate(R.layout.item_invite_inactive_parent_layout, viewGroup, false);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "itemView");
        return new InviteViewHolder(inflate);
    }

    /* renamed from: a */
    public void onBindViewHolder(InviteViewHolder bVar, int i) {
        Intrinsics.checkParameterIsNotNull(bVar, "holder");
        bVar.mo132264a().setImageResource(R.drawable.icon_inactive_parent);
        Object item = getItem(i);
        Intrinsics.checkExpressionValueIsNotNull(item, "getItem(position)");
        InactiveParent inactiveParent = (InactiveParent) item;
        bVar.itemView.setOnClickListener(new C35941d(this, inactiveParent));
        bVar.mo132266c().setOnClickListener(new View$OnClickListenerC35942e(this, inactiveParent));
        bVar.mo132265b().setText(inactiveParent.getName());
    }
}
