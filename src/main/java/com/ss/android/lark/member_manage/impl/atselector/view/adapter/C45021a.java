package com.ss.android.lark.member_manage.impl.atselector.view.adapter;

import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.framework.ui.p1198b.AbstractC26197e;
import com.larksuite.suite.R;
import com.ss.android.lark.image.ImageLoader;
import com.ss.android.lark.member_manage.GroupMemberManageModule;
import com.ss.android.lark.member_manage.impl.atselector.bean.BaseAtBean;
import com.ss.android.lark.member_manage.impl.atselector.bean.SearchBean;
import com.ss.android.lark.member_manage.impl.atselector.bean.WantAtMemBean;
import com.ss.android.lark.member_manage.impl.atselector.view.adapter.binder.BottomSearchTipBinder;
import com.ss.android.lark.member_manage.impl.atselector.view.adapter.holder.AtSelectableViewHolder;
import com.ss.android.lark.member_manage.impl.atselector.view.adapter.p2257a.C45023a;
import com.ss.android.lark.member_manage.impl.atselector.view.adapter.p2257a.C45025b;
import com.ss.android.lark.member_manage.impl.atselector.view.adapter.p2257a.C45026c;
import com.ss.android.lark.member_manage.impl.atselector.view.adapter.p2257a.C45027d;
import com.ss.android.lark.member_manage.impl.atselector.view.adapter.p2257a.C45031h;
import com.ss.android.lark.searchcommon.view.SearchRecyclerViewBaseAdapter;

/* renamed from: com.ss.android.lark.member_manage.impl.atselector.view.adapter.a */
public class C45021a extends SearchRecyclerViewBaseAdapter<RecyclerView.ViewHolder, BaseAtBean> implements AbstractC26197e<RecyclerView.ViewHolder>, GroupMemberManageModule.IItemContainer {

    /* renamed from: a */
    SparseArray<AbstractC45032b<? extends BaseAtBean, ?>> f113999a = new SparseArray<>();

    /* renamed from: c */
    private int f114000c;

    /* renamed from: d */
    private GroupMemberManageModule.IItemContainer.AbstractC44875a f114001d;

    @Override // com.ss.android.lark.member_manage.GroupMemberManageModule.IItemContainer
    /* renamed from: a */
    public int mo158806a() {
        return this.f114000c;
    }

    @Override // com.ss.android.lark.member_manage.GroupMemberManageModule.IItemContainer
    /* renamed from: b */
    public GroupMemberManageModule.IItemContainer.AbstractC44875a mo158807b() {
        return this.f114001d;
    }

    public C45021a() {
        m178525c();
    }

    /* renamed from: c */
    private void m178525c() {
        this.f113999a.put(1, new C45023a(this));
        this.f113999a.put(0, new C45025b(this));
        this.f113999a.put(3, new C45031h());
        this.f113999a.put(2, new C45027d(this));
        this.f113999a.put(4, new C45026c(this));
        this.f113999a.put(5, new BottomSearchTipBinder(this));
    }

    /* renamed from: a */
    public void mo159263a(GroupMemberManageModule.IItemContainer.AbstractC44875a aVar) {
        this.f114001d = aVar;
    }

    /* renamed from: b */
    public void mo159264b(int i) {
        this.f114000c = i;
        notifyItemRangeChanged(0, getItemCount());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter, com.ss.android.lark.base.adapter.LarkRecyclerViewBaseAdapter
    public long getItemId(int i) {
        return (long) ((BaseAtBean) getItem(i)).getId().hashCode();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return ((BaseAtBean) getItem(i)).getType();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
        if (viewHolder instanceof AtSelectableViewHolder) {
            ImageLoader.clear(((AtSelectableViewHolder) viewHolder).mSingleAvatarIV);
        }
        super.onViewRecycled(viewHolder);
    }

    @Override // com.larksuite.framework.ui.p1198b.AbstractC26197e
    /* renamed from: a */
    public long mo93176a(int i) {
        return this.f113999a.get(getItemViewType(i)).mo159267a(getItem(i));
    }

    @Override // com.ss.android.lark.searchcommon.view.SearchRecyclerViewBaseAdapter
    /* renamed from: c */
    public String mo159265c(int i) {
        BaseAtBean baseAtBean = (BaseAtBean) getItem(i);
        if ((baseAtBean instanceof SearchBean) || (baseAtBean instanceof WantAtMemBean)) {
            return baseAtBean.getId();
        }
        return null;
    }

    @Override // com.larksuite.framework.ui.p1198b.AbstractC26197e
    /* renamed from: a */
    public RecyclerView.ViewHolder mo93177a(ViewGroup viewGroup) {
        return new RecyclerView.ViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_chat_at_select_header, viewGroup, false)) {
            /* class com.ss.android.lark.member_manage.impl.atselector.view.adapter.C45021a.C450221 */
        };
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return this.f113999a.get(i).mo159268a(viewGroup);
    }

    @Override // com.ss.android.lark.searchcommon.view.SearchRecyclerViewBaseAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        super.onBindViewHolder(viewHolder, i);
        this.f113999a.get(getItemViewType(i)).mo159269a(viewHolder, (BaseAtBean) getItem(i), i);
    }

    @Override // com.larksuite.framework.ui.p1198b.AbstractC26197e
    /* renamed from: a */
    public void mo93178a(RecyclerView.ViewHolder viewHolder, int i) {
        ((TextView) viewHolder.itemView).setText(String.valueOf(((BaseAtBean) getItem(i)).getPinyin()));
    }
}
