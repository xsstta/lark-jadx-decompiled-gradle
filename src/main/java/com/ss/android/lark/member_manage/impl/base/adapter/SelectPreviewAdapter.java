package com.ss.android.lark.member_manage.impl.base.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.joooonho.SelectableRoundedImageView;
import com.larksuite.suite.R;
import com.ss.android.lark.base.adapter.LarkRecyclerViewBaseAdapter;
import com.ss.android.lark.image.ImageLoader;
import com.ss.android.lark.member_manage.GroupMemberManageModule;
import com.ss.android.lark.member_manage.dependency.IGroupMemberManageModuleDependency;
import com.ss.android.lark.member_manage.impl.bean.C45084c;
import com.ss.android.lark.member_manage.impl.bean.C45085e;
import com.ss.android.lark.utils.UIHelper;

public class SelectPreviewAdapter extends LarkRecyclerViewBaseAdapter<RecyclerView.ViewHolder, C45084c> {

    /* renamed from: b */
    private static final int f114044b = UIHelper.dp2px(30.0f);

    /* renamed from: a */
    public AbstractC45042a f114045a;

    /* renamed from: c */
    private Context f114046c;

    /* renamed from: com.ss.android.lark.member_manage.impl.base.adapter.SelectPreviewAdapter$a */
    public interface AbstractC45042a {
        /* renamed from: a */
        void mo159340a(C45084c cVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter, com.ss.android.lark.base.adapter.LarkRecyclerViewBaseAdapter
    public long getItemId(int i) {
        return (long) i;
    }

    public class GroupChatSelectPreviewViewHolder_ViewBinding implements Unbinder {

        /* renamed from: a */
        private GroupChatSelectPreviewViewHolder f114049a;

        @Override // butterknife.Unbinder
        public void unbind() {
            GroupChatSelectPreviewViewHolder groupChatSelectPreviewViewHolder = this.f114049a;
            if (groupChatSelectPreviewViewHolder != null) {
                this.f114049a = null;
                groupChatSelectPreviewViewHolder.mAvatar = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }

        public GroupChatSelectPreviewViewHolder_ViewBinding(GroupChatSelectPreviewViewHolder groupChatSelectPreviewViewHolder, View view) {
            this.f114049a = groupChatSelectPreviewViewHolder;
            groupChatSelectPreviewViewHolder.mAvatar = (SelectableRoundedImageView) Utils.findRequiredViewAsType(view, R.id.preview_avatar, "field 'mAvatar'", SelectableRoundedImageView.class);
        }
    }

    /* renamed from: a */
    public void mo159338a(AbstractC45042a aVar) {
        this.f114045a = aVar;
    }

    protected static class GroupChatSelectPreviewViewHolder extends RecyclerView.ViewHolder {
        @BindView(7101)
        SelectableRoundedImageView mAvatar;

        GroupChatSelectPreviewViewHolder(View view) {
            super(view);
            ButterKnife.bind(this, view);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
        ImageLoader.clear(((GroupChatSelectPreviewViewHolder) viewHolder).mAvatar);
        super.onViewRecycled(viewHolder);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        this.f114046c = viewGroup.getContext();
        return new GroupChatSelectPreviewViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.group_member_selected_preview_item, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        final C45084c cVar = (C45084c) getItem(i);
        C45085e g = cVar.mo159512g();
        IGroupMemberManageModuleDependency.AbstractC44886h imageDependency = GroupMemberManageModule.m177902a().getImageDependency();
        Context context = this.f114046c;
        String b = g.mo159526b();
        String a = g.mo159522a();
        SelectableRoundedImageView selectableRoundedImageView = ((GroupChatSelectPreviewViewHolder) viewHolder).mAvatar;
        int i2 = f114044b;
        imageDependency.mo143815a(context, b, a, selectableRoundedImageView, i2, i2);
        viewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.member_manage.impl.base.adapter.SelectPreviewAdapter.View$OnClickListenerC450411 */

            public void onClick(View view) {
                if (SelectPreviewAdapter.this.f114045a != null) {
                    SelectPreviewAdapter.this.f114045a.mo159340a(cVar);
                }
            }
        });
    }
}
