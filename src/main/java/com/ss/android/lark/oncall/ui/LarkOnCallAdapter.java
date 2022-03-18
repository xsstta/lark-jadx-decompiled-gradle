package com.ss.android.lark.oncall.ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.joooonho.SelectableRoundedImageView;
import com.larksuite.framework.callback.CallbackManager;
import com.larksuite.suite.R;
import com.ss.android.lark.base.adapter.LarkRecyclerViewBaseAdapter;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.image.ImageLoader;
import com.ss.android.lark.oncall.entity.OnCall;
import com.ss.android.lark.oncall.util.OnCallShowAvatarUtils;

public class LarkOnCallAdapter extends LarkRecyclerViewBaseAdapter<RecyclerView.ViewHolder, OnCall> {

    /* renamed from: a */
    protected CallbackManager f122449a = new CallbackManager();

    /* renamed from: b */
    public AbstractC48720a f122450b;

    /* renamed from: c */
    private Context f122451c;

    /* renamed from: com.ss.android.lark.oncall.ui.LarkOnCallAdapter$a */
    interface AbstractC48720a {
        /* renamed from: a */
        void mo169977a(String str);
    }

    public class OnCallViewHolder_ViewBinding implements Unbinder {

        /* renamed from: a */
        private OnCallViewHolder f122455a;

        @Override // butterknife.Unbinder
        public void unbind() {
            OnCallViewHolder onCallViewHolder = this.f122455a;
            if (onCallViewHolder != null) {
                this.f122455a = null;
                onCallViewHolder.mOnCallAvatarIV = null;
                onCallViewHolder.mOncallName = null;
                onCallViewHolder.mDescriptionTv = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }

        public OnCallViewHolder_ViewBinding(OnCallViewHolder onCallViewHolder, View view) {
            this.f122455a = onCallViewHolder;
            onCallViewHolder.mOnCallAvatarIV = (SelectableRoundedImageView) Utils.findRequiredViewAsType(view, R.id.oncall_avatar, "field 'mOnCallAvatarIV'", SelectableRoundedImageView.class);
            onCallViewHolder.mOncallName = (TextView) Utils.findRequiredViewAsType(view, R.id.oncall_name, "field 'mOncallName'", TextView.class);
            onCallViewHolder.mDescriptionTv = (TextView) Utils.findRequiredViewAsType(view, R.id.tv_desc, "field 'mDescriptionTv'", TextView.class);
        }
    }

    /* renamed from: a */
    public void mo169975a(AbstractC48720a aVar) {
        this.f122450b = aVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
        ImageLoader.clear(((OnCallViewHolder) viewHolder).mOnCallAvatarIV);
        super.onViewRecycled(viewHolder);
    }

    protected class OnCallViewHolder extends RecyclerView.ViewHolder {
        @BindView(6651)
        TextView mDescriptionTv;
        @BindView(6364)
        SelectableRoundedImageView mOnCallAvatarIV;
        @BindView(6366)
        TextView mOncallName;

        OnCallViewHolder(View view) {
            super(view);
            ButterKnife.bind(this, view);
            view.setOnClickListener(new View.OnClickListener(LarkOnCallAdapter.this) {
                /* class com.ss.android.lark.oncall.ui.LarkOnCallAdapter.OnCallViewHolder.View$OnClickListenerC487191 */

                public void onClick(View view) {
                    if (OnCallViewHolder.this.getAdapterPosition() != -1) {
                        String id = ((OnCall) LarkOnCallAdapter.this.getItem(OnCallViewHolder.this.getAdapterPosition())).getId();
                        if (LarkOnCallAdapter.this.f122450b != null) {
                            LarkOnCallAdapter.this.f122450b.mo169977a(id);
                        }
                    }
                }
            });
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        OnCallViewHolder onCallViewHolder = (OnCallViewHolder) viewHolder;
        onCallViewHolder.mOncallName.setText(((OnCall) getItem(i)).getName());
        onCallViewHolder.mDescriptionTv.setText(((OnCall) getItem(i)).getDescription());
        OnCall onCall = (OnCall) getItem(i);
        OnCallShowAvatarUtils.f122439a.mo169928a(this.f122451c, onCall.getId(), onCall.getAvatarKey(), onCall.getId(), onCallViewHolder.mOnCallAvatarIV, 40, 40);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        int i2;
        this.f122451c = viewGroup.getContext();
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        if (DesktopUtil.m144301a(this.f122451c)) {
            i2 = R.layout.activity_oncall_item_desktop;
        } else {
            i2 = R.layout.activity_oncall_item;
        }
        return new OnCallViewHolder(from.inflate(i2, viewGroup, false));
    }
}
