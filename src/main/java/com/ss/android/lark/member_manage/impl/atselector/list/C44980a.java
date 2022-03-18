package com.ss.android.lark.member_manage.impl.atselector.list;

import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.suite.R;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.member_manage.GroupMemberManageModule;
import com.ss.android.lark.member_manage.impl.atselector.bean.BaseAtBean;
import com.ss.android.lark.member_manage.impl.atselector.list.AtFrameLayout;
import com.ss.android.lark.member_manage.impl.atselector.view.adapter.AbstractC45032b;
import com.ss.android.lark.member_manage.impl.atselector.view.adapter.binder.BottomSearchTipBinder;
import com.ss.android.lark.member_manage.impl.atselector.view.adapter.holder.AtLabelViewHolder;
import com.ss.android.lark.member_manage.impl.atselector.view.adapter.holder.AtSelectableViewHolder;
import com.ss.android.lark.member_manage.impl.atselector.view.adapter.holder.BottomSearchTipViewHolder;
import com.ss.android.lark.member_manage.impl.atselector.view.adapter.p2257a.C45023a;
import com.ss.android.lark.member_manage.impl.atselector.view.adapter.p2257a.C45025b;
import com.ss.android.lark.member_manage.impl.atselector.view.adapter.p2257a.C45026c;
import com.ss.android.lark.member_manage.impl.atselector.view.adapter.p2257a.C45027d;
import com.ss.android.lark.member_manage.impl.atselector.view.adapter.p2257a.C45031h;
import com.ss.android.lark.widget.status.UserStatusLinearLayout;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: com.ss.android.lark.member_manage.impl.atselector.list.a */
public class C44980a extends BaseAdapter implements Filterable {

    /* renamed from: a */
    public List<BaseAtBean> f113890a;

    /* renamed from: b */
    public AbstractC44986a f113891b;

    /* renamed from: c */
    public boolean f113892c;

    /* renamed from: d */
    public final Set<Integer> f113893d = new HashSet();

    /* renamed from: e */
    private AbstractC44987b f113894e;

    /* renamed from: f */
    private Filter f113895f = new Filter() {
        /* class com.ss.android.lark.member_manage.impl.atselector.list.C44980a.C449811 */

        /* access modifiers changed from: protected */
        public void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        }

        /* access modifiers changed from: protected */
        public Filter.FilterResults performFiltering(CharSequence charSequence) {
            Filter.FilterResults filterResults = new Filter.FilterResults();
            filterResults.values = C44980a.this.f113890a;
            filterResults.count = C44980a.this.f113890a.size();
            return filterResults;
        }
    };

    /* renamed from: g */
    private final GroupMemberManageModule.IItemContainer f113896g = new GroupMemberManageModule.IItemContainer() {
        /* class com.ss.android.lark.member_manage.impl.atselector.list.C44980a.C449855 */

        @Override // com.ss.android.lark.member_manage.GroupMemberManageModule.IItemContainer
        /* renamed from: a */
        public int mo158806a() {
            return 0;
        }

        @Override // com.ss.android.lark.member_manage.GroupMemberManageModule.IItemContainer
        /* renamed from: b */
        public GroupMemberManageModule.IItemContainer.AbstractC44875a mo158807b() {
            return null;
        }

        @Override // com.ss.android.lark.member_manage.GroupMemberManageModule.IItemContainer
        public int getItemCount() {
            return C44980a.this.getCount();
        }

        @Override // com.ss.android.lark.member_manage.GroupMemberManageModule.IItemContainer
        public List<BaseAtBean> getItems() {
            return C44980a.this.f113890a;
        }
    };

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.member_manage.impl.atselector.list.a$a */
    public interface AbstractC44986a {
        void onItemClickListener(BaseAtBean baseAtBean);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.member_manage.impl.atselector.list.a$b */
    public interface AbstractC44987b {
        /* renamed from: a */
        void mo159221a(int i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo159201a() {
        this.f113895f = null;
    }

    /* renamed from: c */
    public void mo159209c() {
        this.f113892c = false;
    }

    public boolean hasStableIds() {
        return true;
    }

    public Filter getFilter() {
        return this.f113895f;
    }

    public int getCount() {
        List<BaseAtBean> list = this.f113890a;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public boolean areAllItemsEnabled() {
        return Thread.currentThread().getStackTrace()[3].getMethodName().equals("onKeyDown");
    }

    /* renamed from: b */
    public void mo159208b() {
        for (BaseAtBean baseAtBean : this.f113890a) {
            baseAtBean.setSelected(false);
        }
        this.f113893d.clear();
        notifyDataSetChanged();
    }

    /* renamed from: a */
    public void mo159202a(int i) {
        mo159203a(i, true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo159204a(AbstractC44986a aVar) {
        this.f113891b = aVar;
    }

    public Object getItem(int i) {
        List<BaseAtBean> list = this.f113890a;
        if (list == null || list.size() <= i) {
            return null;
        }
        return this.f113890a.get(i);
    }

    public long getItemId(int i) {
        if (i >= this.f113890a.size()) {
            return (long) i;
        }
        return (long) this.f113890a.get(i).hashCode();
    }

    public boolean isEnabled(int i) {
        BaseAtBean baseAtBean = this.f113890a.get(i);
        if (baseAtBean.getType() == 3 || baseAtBean.getType() == 5) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private void m178405a(final View view) {
        ((UserStatusLinearLayout) view.findViewById(R.id.user_status)).setTextSize(11);
        if (view instanceof AtFrameLayout) {
            AtFrameLayout atFrameLayout = (AtFrameLayout) view;
            TextView textView = (TextView) atFrameLayout.findViewById(R.id.name);
            atFrameLayout.setOnHoverListener(new View.OnHoverListener() {
                /* class com.ss.android.lark.member_manage.impl.atselector.list.C44980a.View$OnHoverListenerC449833 */

                public boolean onHover(View view, MotionEvent motionEvent) {
                    C44980a.this.f113892c = true;
                    if (motionEvent.getAction() == 9) {
                        int intValue = ((Integer) view.getTag()).intValue();
                        if (C44980a.this.f113893d.contains(Integer.valueOf(intValue))) {
                            return false;
                        }
                        C44980a.this.mo159208b();
                        C44980a.this.f113893d.add(Integer.valueOf(intValue));
                        C44980a.this.mo159203a(intValue, true);
                    } else if (motionEvent.getAction() == 10) {
                        int intValue2 = ((Integer) view.getTag()).intValue();
                        if (!C44980a.this.f113893d.contains(Integer.valueOf(intValue2))) {
                            return false;
                        }
                        C44980a.this.f113893d.remove(Integer.valueOf(intValue2));
                        C44980a.this.mo159203a(intValue2, false);
                    }
                    return false;
                }
            });
            atFrameLayout.setOnSelectedListener(new AtFrameLayout.AbstractC44979a() {
                /* class com.ss.android.lark.member_manage.impl.atselector.list.C44980a.C449844 */

                @Override // com.ss.android.lark.member_manage.impl.atselector.list.AtFrameLayout.AbstractC44979a
                /* renamed from: a */
                public void mo159200a(boolean z) {
                    int intValue = ((Integer) view.getTag()).intValue();
                    if (!z) {
                        C44980a.this.f113893d.remove(Integer.valueOf(intValue));
                        C44980a.this.mo159203a(intValue, false);
                    } else if (!C44980a.this.f113892c) {
                        C44980a.this.mo159208b();
                        C44980a.this.f113893d.add(Integer.valueOf(intValue));
                        C44980a.this.mo159203a(intValue, true);
                    }
                }
            });
        }
    }

    /* renamed from: b */
    private AbstractC45032b m178407b(int i) {
        if (i == 0) {
            return new C45025b(this.f113896g);
        }
        if (i == 1) {
            return new C45023a(this.f113896g);
        }
        if (i == 2) {
            return new C45027d(this.f113896g);
        }
        if (i == 3) {
            return new C45031h();
        }
        if (i == 4) {
            return new C45026c(this.f113896g);
        }
        if (i != 5) {
            return null;
        }
        return new BottomSearchTipBinder(this.f113896g);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo159205a(AbstractC44987b bVar) {
        this.f113894e = bVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo159206a(List<BaseAtBean> list) {
        this.f113890a = list;
    }

    /* renamed from: a */
    public void mo159203a(int i, boolean z) {
        AbstractC44987b bVar;
        if (i >= 0 && i < this.f113890a.size()) {
            this.f113890a.get(i).setSelected(z);
            if (z && (bVar = this.f113894e) != null) {
                bVar.mo159221a(i);
            }
        }
    }

    /* renamed from: a */
    private void m178406a(AtFrameLayout atFrameLayout, boolean z) {
        UserStatusLinearLayout userStatusLinearLayout = (UserStatusLinearLayout) atFrameLayout.findViewById(R.id.user_status);
        TextView textView = (TextView) atFrameLayout.findViewById(R.id.name);
        if (z) {
            userStatusLinearLayout.setTextColor(atFrameLayout.getResources().getColor(R.color.static_white));
            userStatusLinearLayout.setRecognizeTextColor(atFrameLayout.getResources().getColor(R.color.static_white));
            textView.setTextColor(atFrameLayout.getResources().getColor(R.color.static_white));
            atFrameLayout.setBackgroundColor(atFrameLayout.getResources().getColor(R.color.primary_pri_500));
            return;
        }
        userStatusLinearLayout.setTextColor(atFrameLayout.getResources().getColor(R.color.text_caption));
        userStatusLinearLayout.setRecognizeTextColor(atFrameLayout.getResources().getColor(R.color.primary_pri_700));
        textView.setTextColor(atFrameLayout.getResources().getColor(R.color.text_title));
        atFrameLayout.setBackgroundColor(atFrameLayout.getResources().getColor(R.color.static_white));
    }

    /* renamed from: a */
    private RecyclerView.ViewHolder m178404a(int i, View view, ViewGroup viewGroup) {
        if (!(i == 0 || i == 1 || i == 2)) {
            if (i == 3) {
                return new AtLabelViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_chat_at_label_desktop, viewGroup, false));
            }
            if (i != 4) {
                if (i != 5) {
                    return null;
                }
                return new BottomSearchTipViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.group_member_item_bottom_search_tip, viewGroup, false));
            }
        }
        if (view == null || view.findViewById(R.id.at_select_box) == null) {
            view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_chat_at_select_desktop, viewGroup, false);
            m178405a(view);
        }
        return new AtSelectableViewHolder(view);
    }

    public View getView(final int i, View view, ViewGroup viewGroup) {
        BaseAtBean baseAtBean = this.f113890a.get(i);
        AbstractC45032b b = m178407b(baseAtBean.getType());
        RecyclerView.ViewHolder a = m178404a(baseAtBean.getType(), view, viewGroup);
        if (a == null) {
            return null;
        }
        b.mo159269a(a, baseAtBean, i);
        if (!(baseAtBean.getType() == 3 || baseAtBean.getType() == 5)) {
            a.itemView.setOnClickListener(new View.OnClickListener() {
                /* class com.ss.android.lark.member_manage.impl.atselector.list.C44980a.View$OnClickListenerC449822 */

                public void onClick(View view) {
                    C44980a.this.f113891b.onItemClickListener((BaseAtBean) C44980a.this.getItem(i));
                }
            });
            if (!(a.itemView instanceof AtFrameLayout)) {
                return a.itemView;
            }
            Log.m165389i("AtSelectBaseAdapter", "select item " + i + "is selected: " + baseAtBean.isSelected());
            m178406a((AtFrameLayout) a.itemView, baseAtBean.isSelected());
        }
        a.itemView.setTag(Integer.valueOf(i));
        return a.itemView;
    }
}
