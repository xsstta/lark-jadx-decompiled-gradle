package com.ss.android.lark.member_manage.impl.atselector.view.adapter.p2257a;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.larksuite.suite.R;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.member_manage.GroupMemberManageModule;
import com.ss.android.lark.member_manage.impl.atselector.bean.C44977a;
import com.ss.android.lark.member_manage.impl.atselector.bean.SearchBean;
import com.ss.android.lark.member_manage.impl.atselector.view.adapter.AbstractC45032b;
import com.ss.android.lark.member_manage.impl.atselector.view.adapter.holder.AtSelectableViewHolder;
import com.ss.android.lark.utils.C57782ag;

/* renamed from: com.ss.android.lark.member_manage.impl.atselector.view.adapter.a.c */
public class C45026c implements AbstractC45032b<SearchBean, AtSelectableViewHolder> {

    /* renamed from: c */
    private Context f114013c;

    /* renamed from: d */
    private AbstractC45030g<C44977a, AtSelectableViewHolder> f114014d = new C45028f();

    /* renamed from: e */
    private int f114015e;

    /* renamed from: f */
    private GroupMemberManageModule.IItemContainer f114016f;

    /* renamed from: a */
    public long mo159267a(SearchBean searchBean) {
        return -1;
    }

    public C45026c(GroupMemberManageModule.IItemContainer iItemContainer) {
        this.f114016f = iItemContainer;
    }

    /* renamed from: b */
    public AtSelectableViewHolder mo159268a(ViewGroup viewGroup) {
        Context context = viewGroup.getContext();
        this.f114013c = context;
        return new AtSelectableViewHolder(LayoutInflater.from(context).inflate(R.layout.item_chat_at_select, viewGroup, false));
    }

    /* renamed from: a */
    public void mo159269a(AtSelectableViewHolder atSelectableViewHolder, SearchBean searchBean, int i) {
        int i2;
        if (this.f114013c == null) {
            this.f114013c = atSelectableViewHolder.itemView.getContext();
        }
        this.f114015e = this.f114016f.mo158806a();
        int color = this.f114013c.getResources().getColor(R.color.function_info_500);
        if (!searchBean.getChatterInfo().mo159188d().isEmpty()) {
            atSelectableViewHolder.mNameTV.setText(C57782ag.m224235a(searchBean.getDisplayName(), searchBean.getChatterInfo().mo159188d(), color));
        } else {
            atSelectableViewHolder.mNameTV.setText(searchBean.getDisplayName());
        }
        if (DesktopUtil.m144301a(this.f114013c)) {
            i2 = f114026b;
        } else {
            i2 = f114025a;
        }
        searchBean.showAvatar(this.f114013c, atSelectableViewHolder.mSingleAvatarIV, i2, i2);
        C44977a chatterInfo = searchBean.getChatterInfo();
        this.f114014d.mo159298d(chatterInfo, atSelectableViewHolder);
        this.f114014d.mo159296c(chatterInfo, atSelectableViewHolder);
        this.f114014d.mo159294b(chatterInfo, atSelectableViewHolder);
        this.f114014d.mo159285a(atSelectableViewHolder, this.f114016f.getItemCount(), this.f114016f.getItems(), i);
        this.f114014d.mo159286a(searchBean, atSelectableViewHolder, this.f114015e);
        this.f114014d.mo159287a(searchBean, atSelectableViewHolder, this.f114016f, i);
        this.f114014d.mo159292a(chatterInfo, atSelectableViewHolder);
    }
}
