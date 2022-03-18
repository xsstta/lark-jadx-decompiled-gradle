package com.ss.android.lark.contact.impl.contacts_robot;

import android.content.Context;
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
import com.ss.android.lark.base.adapter.LarkRecyclerViewBaseAdapter;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.contact.C35358a;
import com.ss.android.lark.contact.p1733b.AbstractC35361b;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.utils.UIHelper;

public class LarkRobotAdapter extends LarkRecyclerViewBaseAdapter<RecyclerView.ViewHolder, Chatter> {

    /* renamed from: a */
    AbstractC35361b.AbstractC35367f f92350a = C35358a.m138143a().mo130165j();

    /* renamed from: b */
    private Context f92351b;

    public class BotsViewHolder_ViewBinding implements Unbinder {

        /* renamed from: a */
        private BotsViewHolder f92355a;

        @Override // butterknife.Unbinder
        public void unbind() {
            BotsViewHolder botsViewHolder = this.f92355a;
            if (botsViewHolder != null) {
                this.f92355a = null;
                botsViewHolder.mBotAvatorIV = null;
                botsViewHolder.mBotNameTV = null;
                botsViewHolder.mBotDescTV = null;
                botsViewHolder.mBotTagIV = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }

        public BotsViewHolder_ViewBinding(BotsViewHolder botsViewHolder, View view) {
            this.f92355a = botsViewHolder;
            botsViewHolder.mBotAvatorIV = (LKUIRoundedImageView) Utils.findRequiredViewAsType(view, R.id.group_avatar, "field 'mBotAvatorIV'", LKUIRoundedImageView.class);
            botsViewHolder.mBotNameTV = (TextView) Utils.findRequiredViewAsType(view, R.id.group_name, "field 'mBotNameTV'", TextView.class);
            botsViewHolder.mBotDescTV = (TextView) Utils.findRequiredViewAsType(view, R.id.group_description, "field 'mBotDescTV'", TextView.class);
            botsViewHolder.mBotTagIV = (ImageView) Utils.findRequiredViewAsType(view, R.id.bot_tag, "field 'mBotTagIV'", ImageView.class);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
        C35358a.m138143a().mo130147a(((BotsViewHolder) viewHolder).mBotAvatorIV);
        super.onViewRecycled(viewHolder);
    }

    /* renamed from: a */
    public void mo131500a(String str) {
        if (C35358a.m138143a().mo130150b().mo130208a("lark.feed.openapp.v2")) {
            C35358a.m138143a().mo130155c(str);
            return;
        }
        this.f92350a.mo130199a(str);
        if (DesktopUtil.m144301a(this.f92351b)) {
            C35358a.m138143a().mo130149a(str);
        }
    }

    protected class BotsViewHolder extends RecyclerView.ViewHolder {
        @BindView(7342)
        LKUIRoundedImageView mBotAvatorIV;
        @BindView(7344)
        TextView mBotDescTV;
        @BindView(7347)
        TextView mBotNameTV;
        @BindView(6916)
        ImageView mBotTagIV;

        BotsViewHolder(View view) {
            super(view);
            ButterKnife.bind(this, view);
            view.setOnClickListener(new View.OnClickListener(LarkRobotAdapter.this) {
                /* class com.ss.android.lark.contact.impl.contacts_robot.LarkRobotAdapter.BotsViewHolder.View$OnClickListenerC357131 */

                public void onClick(View view) {
                    if (BotsViewHolder.this.getAdapterPosition() != -1) {
                        LarkRobotAdapter.this.mo131500a(((Chatter) LarkRobotAdapter.this.getItem(BotsViewHolder.this.getAdapterPosition())).getId());
                    }
                }
            });
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        int i2;
        this.f92351b = viewGroup.getContext();
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        if (DesktopUtil.m144301a(this.f92351b)) {
            i2 = R.layout.activity_group_contacts_item_desktop;
        } else {
            i2 = R.layout.activity_group_contacts_item;
        }
        return new BotsViewHolder(from.inflate(i2, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        float f;
        BotsViewHolder botsViewHolder = (BotsViewHolder) viewHolder;
        botsViewHolder.mBotNameTV.setText(this.f92350a.mo130195a((Chatter) getItem(i)));
        botsViewHolder.mBotNameTV.setTextColor(this.f92351b.getResources().getColor(R.color.text_title));
        botsViewHolder.mBotDescTV.setVisibility(8);
        botsViewHolder.mBotTagIV.setVisibility(0);
        if (DesktopUtil.m144301a(this.f92351b)) {
            f = 32.0f;
        } else {
            f = 40.0f;
        }
        int dp2px = UIHelper.dp2px(f);
        C35358a.m138143a().mo130164i().mo130211a(this.f92351b, ((Chatter) getItem(i)).getAvatarKey(), ((Chatter) getItem(i)).getId(), botsViewHolder.mBotAvatorIV, dp2px, dp2px);
    }
}
