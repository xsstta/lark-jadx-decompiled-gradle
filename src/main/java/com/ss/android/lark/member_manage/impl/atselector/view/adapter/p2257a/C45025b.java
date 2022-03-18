package com.ss.android.lark.member_manage.impl.atselector.view.adapter.p2257a;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.larksuite.suite.R;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.member_manage.GroupMemberManageModule;
import com.ss.android.lark.member_manage.impl.atselector.bean.C44977a;
import com.ss.android.lark.member_manage.impl.atselector.bean.GroupMemAtBean;
import com.ss.android.lark.member_manage.impl.atselector.view.adapter.AbstractC45032b;
import com.ss.android.lark.member_manage.impl.atselector.view.adapter.holder.AtSelectableViewHolder;

/* renamed from: com.ss.android.lark.member_manage.impl.atselector.view.adapter.a.b */
public class C45025b implements AbstractC45032b<GroupMemAtBean, AtSelectableViewHolder> {

    /* renamed from: c */
    private Context f114009c;

    /* renamed from: d */
    private AbstractC45030g<C44977a, AtSelectableViewHolder> f114010d = new C45028f();

    /* renamed from: e */
    private int f114011e;

    /* renamed from: f */
    private GroupMemberManageModule.IItemContainer f114012f;

    /* renamed from: a */
    public long mo159267a(GroupMemAtBean groupMemAtBean) {
        return (long) groupMemAtBean.getPinyin();
    }

    public C45025b(GroupMemberManageModule.IItemContainer iItemContainer) {
        this.f114012f = iItemContainer;
    }

    /* renamed from: b */
    public AtSelectableViewHolder mo159268a(ViewGroup viewGroup) {
        Context context = viewGroup.getContext();
        this.f114009c = context;
        return new AtSelectableViewHolder(LayoutInflater.from(context).inflate(R.layout.item_chat_at_select, viewGroup, false));
    }

    /* renamed from: a */
    public void mo159269a(AtSelectableViewHolder atSelectableViewHolder, GroupMemAtBean groupMemAtBean, int i) {
        int i2;
        if (this.f114009c == null) {
            this.f114009c = atSelectableViewHolder.itemView.getContext();
        }
        this.f114011e = this.f114012f.mo158806a();
        atSelectableViewHolder.mNameTV.setText(groupMemAtBean.getDisplayName());
        if (DesktopUtil.m144301a(this.f114009c)) {
            i2 = f114026b;
        } else {
            i2 = f114025a;
        }
        groupMemAtBean.showAvatar(this.f114009c, atSelectableViewHolder.mSingleAvatarIV, i2, i2);
        C44977a chatterInfo = groupMemAtBean.getChatterInfo();
        this.f114010d.mo159298d(chatterInfo, atSelectableViewHolder);
        this.f114010d.mo159296c(chatterInfo, atSelectableViewHolder);
        this.f114010d.mo159294b(chatterInfo, atSelectableViewHolder);
        this.f114010d.mo159285a(atSelectableViewHolder, this.f114012f.getItemCount(), this.f114012f.getItems(), i);
        this.f114010d.mo159286a(groupMemAtBean, atSelectableViewHolder, this.f114011e);
        this.f114010d.mo159287a(groupMemAtBean, atSelectableViewHolder, this.f114012f, i);
        if (groupMemAtBean.isShowShadow()) {
            atSelectableViewHolder.mShadow.setVisibility(0);
            atSelectableViewHolder.mDividerView.setVisibility(8);
        } else {
            atSelectableViewHolder.mShadow.setVisibility(8);
            atSelectableViewHolder.mDividerView.setVisibility(0);
        }
        this.f114010d.mo159292a(chatterInfo, atSelectableViewHolder);
    }
}
