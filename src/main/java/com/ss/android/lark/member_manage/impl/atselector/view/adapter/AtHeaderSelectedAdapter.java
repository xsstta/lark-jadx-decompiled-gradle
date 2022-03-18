package com.ss.android.lark.member_manage.impl.atselector.view.adapter;

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
import com.ss.android.lark.member_manage.impl.atselector.bean.BaseAtBean;
import com.ss.android.lark.utils.UIHelper;

public class AtHeaderSelectedAdapter extends LarkRecyclerViewBaseAdapter<SelectedChatterViewHolder, BaseAtBean> {

    /* renamed from: b */
    private static final int f113993b = UIHelper.getDimens(R.dimen.avatar_width_group_chat);

    /* renamed from: a */
    public AbstractC45020a f113994a;

    /* renamed from: c */
    private Context f113995c;

    /* renamed from: com.ss.android.lark.member_manage.impl.atselector.view.adapter.AtHeaderSelectedAdapter$a */
    public interface AbstractC45020a {
        /* renamed from: a */
        void mo159256a(BaseAtBean baseAtBean);
    }

    public class SelectedChatterViewHolder_ViewBinding implements Unbinder {

        /* renamed from: a */
        private SelectedChatterViewHolder f113998a;

        @Override // butterknife.Unbinder
        public void unbind() {
            SelectedChatterViewHolder selectedChatterViewHolder = this.f113998a;
            if (selectedChatterViewHolder != null) {
                this.f113998a = null;
                selectedChatterViewHolder.mAvatar = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }

        public SelectedChatterViewHolder_ViewBinding(SelectedChatterViewHolder selectedChatterViewHolder, View view) {
            this.f113998a = selectedChatterViewHolder;
            selectedChatterViewHolder.mAvatar = (SelectableRoundedImageView) Utils.findRequiredViewAsType(view, R.id.at_select_preview_avatar, "field 'mAvatar'", SelectableRoundedImageView.class);
        }
    }

    /* renamed from: a */
    public void mo159261a(AbstractC45020a aVar) {
        this.f113994a = aVar;
    }

    public static class SelectedChatterViewHolder extends RecyclerView.ViewHolder {
        @BindView(6348)
        SelectableRoundedImageView mAvatar;

        SelectedChatterViewHolder(View view) {
            super(view);
            ButterKnife.bind(this, view);
        }
    }

    /* renamed from: a */
    public SelectedChatterViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        this.f113995c = viewGroup.getContext();
        return new SelectedChatterViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.at_select_preview_item, viewGroup, false));
    }

    /* renamed from: a */
    public void onBindViewHolder(SelectedChatterViewHolder selectedChatterViewHolder, int i) {
        final BaseAtBean baseAtBean = (BaseAtBean) getItem(i);
        Context context = this.f113995c;
        SelectableRoundedImageView selectableRoundedImageView = selectedChatterViewHolder.mAvatar;
        int i2 = f113993b;
        baseAtBean.showAvatar(context, selectableRoundedImageView, i2, i2);
        selectedChatterViewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.member_manage.impl.atselector.view.adapter.AtHeaderSelectedAdapter.View$OnClickListenerC450191 */

            public void onClick(View view) {
                if (AtHeaderSelectedAdapter.this.f113994a != null) {
                    AtHeaderSelectedAdapter.this.f113994a.mo159256a(baseAtBean);
                }
            }
        });
    }
}
