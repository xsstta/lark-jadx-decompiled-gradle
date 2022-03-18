package com.ss.android.lark.anonymous.widget;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.component.ui.imageview.LKUIRoundedImageView;
import com.larksuite.suite.R;
import com.ss.android.lark.anonymous.model.C28694a;
import com.ss.android.lark.appreciablelib.Scene;
import com.ss.android.lark.base.adapter.LarkRecyclerViewBaseAdapter;
import com.ss.android.lark.chat.utils.C34336c;
import com.ss.android.lark.utils.UIHelper;
import java.util.List;

public class AnonymityPickAdapter extends LarkRecyclerViewBaseAdapter<AnonymityPickViewHolder, C28694a> {

    /* renamed from: a */
    public AbstractC28708a f72240a;

    /* renamed from: b */
    private boolean f72241b = true;

    /* renamed from: c */
    private final int f72242c = UIHelper.dp2px(48.0f);

    /* renamed from: com.ss.android.lark.anonymous.widget.AnonymityPickAdapter$a */
    public interface AbstractC28708a {
        void onItemSelect(C28694a aVar);
    }

    public class AnonymityPickViewHolder_ViewBinding implements Unbinder {

        /* renamed from: a */
        private AnonymityPickViewHolder f72247a;

        @Override // butterknife.Unbinder
        public void unbind() {
            AnonymityPickViewHolder anonymityPickViewHolder = this.f72247a;
            if (anonymityPickViewHolder != null) {
                this.f72247a = null;
                anonymityPickViewHolder.mAnonymityAvatar = null;
                anonymityPickViewHolder.mAnonymityLayout = null;
                anonymityPickViewHolder.mAnonymityNameTv = null;
                anonymityPickViewHolder.mAnonymityDesctv = null;
                anonymityPickViewHolder.mAnonymityIsCheckedIv = null;
                anonymityPickViewHolder.mDivider = null;
                anonymityPickViewHolder.mContentBg = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }

        public AnonymityPickViewHolder_ViewBinding(AnonymityPickViewHolder anonymityPickViewHolder, View view) {
            this.f72247a = anonymityPickViewHolder;
            anonymityPickViewHolder.mAnonymityAvatar = (LKUIRoundedImageView) Utils.findRequiredViewAsType(view, R.id.anonymity_avatar, "field 'mAnonymityAvatar'", LKUIRoundedImageView.class);
            anonymityPickViewHolder.mAnonymityLayout = (ViewGroup) Utils.findRequiredViewAsType(view, R.id.anonymity_layout, "field 'mAnonymityLayout'", ViewGroup.class);
            anonymityPickViewHolder.mAnonymityNameTv = (TextView) Utils.findRequiredViewAsType(view, R.id.anonymity_name_tv, "field 'mAnonymityNameTv'", TextView.class);
            anonymityPickViewHolder.mAnonymityDesctv = (TextView) Utils.findRequiredViewAsType(view, R.id.anonymity_desc_tv, "field 'mAnonymityDesctv'", TextView.class);
            anonymityPickViewHolder.mAnonymityIsCheckedIv = (ImageView) Utils.findRequiredViewAsType(view, R.id.anonymity_is_checked_iv, "field 'mAnonymityIsCheckedIv'", ImageView.class);
            anonymityPickViewHolder.mDivider = Utils.findRequiredView(view, R.id.anonymity_divider, "field 'mDivider'");
            anonymityPickViewHolder.mContentBg = Utils.findRequiredView(view, R.id.content_bg, "field 'mContentBg'");
        }
    }

    /* renamed from: a */
    public void mo102107a(AbstractC28708a aVar) {
        this.f72240a = aVar;
    }

    /* renamed from: a */
    public void mo102108a(boolean z) {
        this.f72241b = z;
    }

    /* renamed from: a */
    public void mo102105a(int i) {
        List<C28694a> items = getItems();
        for (C28694a aVar : items) {
            aVar.mo102058a(false);
        }
        ((C28694a) items.get(i)).mo102058a(true);
        notifyDataSetChanged();
    }

    public class AnonymityPickViewHolder extends RecyclerView.ViewHolder {
        @BindView(7186)
        LKUIRoundedImageView mAnonymityAvatar;
        @BindView(7187)
        TextView mAnonymityDesctv;
        @BindView(7189)
        ImageView mAnonymityIsCheckedIv;
        @BindView(7190)
        ViewGroup mAnonymityLayout;
        @BindView(7191)
        TextView mAnonymityNameTv;
        @BindView(7482)
        View mContentBg;
        @BindView(7188)
        View mDivider;

        public AnonymityPickViewHolder(View view) {
            super(view);
            ButterKnife.bind(this, view);
        }
    }

    /* renamed from: a */
    private void m105262a(AnonymityPickViewHolder anonymityPickViewHolder, boolean z) {
        if (z) {
            anonymityPickViewHolder.mAnonymityIsCheckedIv.setVisibility(0);
        } else {
            anonymityPickViewHolder.mAnonymityIsCheckedIv.setVisibility(8);
        }
    }

    /* renamed from: a */
    public AnonymityPickViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new AnonymityPickViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_thread_pick_anonymity, viewGroup, false));
    }

    /* renamed from: a */
    public void onBindViewHolder(AnonymityPickViewHolder anonymityPickViewHolder, final int i) {
        final C28694a aVar = (C28694a) getItem(i);
        if (aVar.mo102063e() != 1) {
            anonymityPickViewHolder.mAnonymityNameTv.setText(UIHelper.mustacheFormat((int) R.string.Lark_Groups_PostByRealName, "Name", aVar.mo102056a()));
        } else if (this.f72241b) {
            anonymityPickViewHolder.mAnonymityNameTv.setText(UIHelper.getString(R.string.Lark_Groups_PostAnonymoulsy) + UIHelper.getString(R.string.Lark_Groups_TopicOwner));
        } else {
            anonymityPickViewHolder.mAnonymityNameTv.setText(UIHelper.getString(R.string.Lark_Groups_PostAnonymoulsy) + UIHelper.getString(R.string.Lark_Groups_Audience));
        }
        if (aVar.mo102065g()) {
            anonymityPickViewHolder.mContentBg.setVisibility(8);
            anonymityPickViewHolder.mAnonymityDesctv.setVisibility(8);
            anonymityPickViewHolder.itemView.setOnClickListener(new View.OnClickListener() {
                /* class com.ss.android.lark.anonymous.widget.AnonymityPickAdapter.View$OnClickListenerC287071 */

                public void onClick(View view) {
                    if (AnonymityPickAdapter.this.f72240a != null) {
                        AnonymityPickAdapter.this.mo102105a(i);
                        AnonymityPickAdapter.this.f72240a.onItemSelect(aVar);
                    }
                }
            });
        } else {
            anonymityPickViewHolder.mAnonymityDesctv.setVisibility(0);
            anonymityPickViewHolder.mAnonymityDesctv.setText(aVar.mo102059b());
            anonymityPickViewHolder.mContentBg.setVisibility(0);
            anonymityPickViewHolder.itemView.setClickable(false);
        }
        m105262a(anonymityPickViewHolder, aVar.mo102061c());
        m105261a(anonymityPickViewHolder, aVar.mo102062d(), aVar.mo102064f());
        if (i == this.items.size() - 1) {
            anonymityPickViewHolder.mDivider.setVisibility(8);
        }
    }

    /* renamed from: a */
    private void m105261a(AnonymityPickViewHolder anonymityPickViewHolder, String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            Context context = anonymityPickViewHolder.itemView.getContext();
            LKUIRoundedImageView lKUIRoundedImageView = anonymityPickViewHolder.mAnonymityAvatar;
            int i = this.f72242c;
            C34336c.m133130a(context, lKUIRoundedImageView, str, str2, i, i, Scene.Thread);
            return;
        }
        LKUIRoundedImageView lKUIRoundedImageView2 = anonymityPickViewHolder.mAnonymityAvatar;
        Context context2 = anonymityPickViewHolder.itemView.getContext();
        int i2 = this.f72242c;
        lKUIRoundedImageView2.setImageDrawable(C34336c.m133122a(context2, i2, i2, anonymityPickViewHolder.mAnonymityAvatar));
    }
}
