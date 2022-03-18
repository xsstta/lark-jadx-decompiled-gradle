package com.ss.android.lark.member_manage.impl.atselector.view.adapter.p2257a;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.larksuite.suite.R;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.member_manage.GroupMemberManageModule;
import com.ss.android.lark.member_manage.impl.atselector.bean.C44977a;
import com.ss.android.lark.member_manage.impl.atselector.bean.WantAtMemBean;
import com.ss.android.lark.member_manage.impl.atselector.view.adapter.AbstractC45032b;
import com.ss.android.lark.member_manage.impl.atselector.view.adapter.holder.AtSelectableViewHolder;

/* renamed from: com.ss.android.lark.member_manage.impl.atselector.view.adapter.a.d */
public class C45027d implements AbstractC45032b<WantAtMemBean, AtSelectableViewHolder> {

    /* renamed from: c */
    private Context f114017c;

    /* renamed from: d */
    private AbstractC45030g<C44977a, AtSelectableViewHolder> f114018d = new C45028f();

    /* renamed from: e */
    private int f114019e;

    /* renamed from: f */
    private GroupMemberManageModule.IItemContainer f114020f;

    /* renamed from: a */
    public long mo159267a(WantAtMemBean wantAtMemBean) {
        return -1;
    }

    public C45027d(GroupMemberManageModule.IItemContainer iItemContainer) {
        this.f114020f = iItemContainer;
    }

    /* renamed from: b */
    public AtSelectableViewHolder mo159268a(ViewGroup viewGroup) {
        Context context = viewGroup.getContext();
        this.f114017c = context;
        return new AtSelectableViewHolder(LayoutInflater.from(context).inflate(R.layout.item_chat_at_select, viewGroup, false));
    }

    /* renamed from: a */
    public void mo159269a(AtSelectableViewHolder atSelectableViewHolder, WantAtMemBean wantAtMemBean, int i) {
        int i2;
        if (this.f114017c == null) {
            this.f114017c = atSelectableViewHolder.itemView.getContext();
        }
        this.f114019e = this.f114020f.mo158806a();
        atSelectableViewHolder.mNameTV.setText(wantAtMemBean.getDisplayName());
        if (DesktopUtil.m144301a(this.f114017c)) {
            i2 = f114026b;
        } else {
            i2 = f114025a;
        }
        wantAtMemBean.showAvatar(this.f114017c, atSelectableViewHolder.mSingleAvatarIV, i2, i2);
        C44977a chatterInfo = wantAtMemBean.getChatterInfo();
        this.f114018d.mo159298d(chatterInfo, atSelectableViewHolder);
        this.f114018d.mo159296c(chatterInfo, atSelectableViewHolder);
        this.f114018d.mo159294b(chatterInfo, atSelectableViewHolder);
        this.f114018d.mo159285a(atSelectableViewHolder, this.f114020f.getItemCount(), this.f114020f.getItems(), i);
        this.f114018d.mo159286a(wantAtMemBean, atSelectableViewHolder, this.f114019e);
        this.f114018d.mo159287a(wantAtMemBean, atSelectableViewHolder, this.f114020f, i);
        this.f114018d.mo159292a(chatterInfo, atSelectableViewHolder);
    }
}
