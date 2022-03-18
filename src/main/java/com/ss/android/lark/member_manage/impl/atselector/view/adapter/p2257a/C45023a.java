package com.ss.android.lark.member_manage.impl.atselector.view.adapter.p2257a;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.larksuite.suite.R;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.member_manage.GroupMemberManageModule;
import com.ss.android.lark.member_manage.impl.atselector.bean.AllAtBean;
import com.ss.android.lark.member_manage.impl.atselector.view.adapter.AbstractC45032b;
import com.ss.android.lark.member_manage.impl.atselector.view.adapter.holder.AtSelectableViewHolder;
import com.ss.android.lark.ui.p2892a.C57582a;

/* renamed from: com.ss.android.lark.member_manage.impl.atselector.view.adapter.a.a */
public class C45023a implements AbstractC45032b<AllAtBean, AtSelectableViewHolder> {

    /* renamed from: c */
    public GroupMemberManageModule.IItemContainer.AbstractC44875a f114003c;

    /* renamed from: d */
    private Context f114004d;

    /* renamed from: e */
    private int f114005e;

    /* renamed from: f */
    private GroupMemberManageModule.IItemContainer f114006f;

    /* renamed from: a */
    public long mo159267a(AllAtBean allAtBean) {
        return -1;
    }

    public C45023a(GroupMemberManageModule.IItemContainer iItemContainer) {
        this.f114006f = iItemContainer;
    }

    /* renamed from: b */
    public AtSelectableViewHolder mo159268a(ViewGroup viewGroup) {
        Context context = viewGroup.getContext();
        this.f114004d = context;
        return new AtSelectableViewHolder(LayoutInflater.from(context).inflate(R.layout.item_chat_at_select, viewGroup, false));
    }

    /* renamed from: a */
    public void mo159269a(AtSelectableViewHolder atSelectableViewHolder, final AllAtBean allAtBean, int i) {
        int i2;
        int i3;
        if (this.f114004d == null) {
            this.f114004d = atSelectableViewHolder.itemView.getContext();
        }
        this.f114005e = this.f114006f.mo158806a();
        this.f114003c = this.f114006f.mo158807b();
        atSelectableViewHolder.mTagWrapper.setVisibility(8);
        atSelectableViewHolder.mUserStatus.setVisibility(8);
        atSelectableViewHolder.mWorkStatus.setVisibility(8);
        if (this.f114005e == 0) {
            atSelectableViewHolder.mNameTV.setText(allAtBean.getDisplayName());
            atSelectableViewHolder.mDividerView.setVisibility(8);
            atSelectableViewHolder.mOwnerTV.setVisibility(0);
            atSelectableViewHolder.mOwnerTV.setText(R.string.Lark_Legacy_NotifyAllMembersInChat);
            if (DesktopUtil.m144301a(this.f114004d)) {
                TextView textView = atSelectableViewHolder.mOwnerTV;
                if (allAtBean.isSelected()) {
                    i3 = C57582a.m223616d(this.f114004d, R.color.static_white);
                } else {
                    i3 = C57582a.m223616d(this.f114004d, R.color.text_caption);
                }
                textView.setTextColor(i3);
            } else {
                atSelectableViewHolder.mOwnerTV.setTextColor(C57582a.m223616d(this.f114004d, R.color.text_caption));
            }
            atSelectableViewHolder.mAtSelectCheckBox.setVisibility(8);
            if (DesktopUtil.m144301a(this.f114004d)) {
                i2 = f114026b;
            } else {
                i2 = f114025a;
            }
            allAtBean.showAvatar(this.f114004d, atSelectableViewHolder.mSingleAvatarIV, i2, i2);
            atSelectableViewHolder.itemView.setOnClickListener(new View.OnClickListener() {
                /* class com.ss.android.lark.member_manage.impl.atselector.view.adapter.p2257a.C45023a.View$OnClickListenerC450241 */

                public void onClick(View view) {
                    if (C45023a.this.f114003c != null) {
                        C45023a.this.f114003c.mo158812c(allAtBean);
                    }
                }
            });
        }
    }
}
