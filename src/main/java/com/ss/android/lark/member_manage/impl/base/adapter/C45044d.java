package com.ss.android.lark.member_manage.impl.base.adapter;

import android.content.Context;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.collection.C0525g;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.framework.ui.p1198b.AbstractC26197e;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.member_manage.impl.base.adapter.IFuncBinder;
import com.ss.android.lark.member_manage.impl.bean.C45084c;
import com.ss.android.lark.member_manage.impl.bean.SelectBeansResult;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: com.ss.android.lark.member_manage.impl.base.adapter.d */
public class C45044d extends RecyclerView.Adapter<RecyclerView.ViewHolder> implements AbstractC26197e<RecyclerView.ViewHolder> {

    /* renamed from: a */
    protected List<C45084c> f114051a = new ArrayList();

    /* renamed from: b */
    private Context f114052b;

    /* renamed from: c */
    private C45043c f114053c;

    /* renamed from: d */
    private IFuncBinder f114054d;

    /* renamed from: e */
    private boolean f114055e;

    /* renamed from: f */
    private SparseArray<IAdapterBinder> f114056f = new SparseArray<>(2);

    /* renamed from: g */
    private C0525g<View> f114057g = new C0525g<>();

    /* renamed from: a */
    public List<C45084c> mo159348a() {
        return this.f114051a;
    }

    /* renamed from: b */
    public void mo159357b() {
        this.f114051a.clear();
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter, com.larksuite.framework.ui.p1198b.AbstractC26197e
    public int getItemCount() {
        int size = this.f114051a.size();
        if (size > 0 && this.f114055e) {
            size++;
        }
        return this.f114057g.mo3049b() + size;
    }

    /* renamed from: com.ss.android.lark.member_manage.impl.base.adapter.d$a */
    private static class C45046a extends RecyclerView.ViewHolder {
        private C45046a(View view) {
            super(view);
        }
    }

    /* renamed from: a */
    public void mo159354a(Collection<? extends C45084c> collection) {
        this.f114055e = false;
        m178640b(collection);
    }

    /* renamed from: d */
    private boolean m178641d(int i) {
        if (i < this.f114057g.mo3049b()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public void mo159349a(View view) {
        C0525g<View> gVar = this.f114057g;
        gVar.mo3051b(gVar.mo3049b() + 1000, view);
    }

    /* renamed from: b */
    private void m178640b(Collection<? extends C45084c> collection) {
        this.f114051a.clear();
        if (!CollectionUtils.isEmpty(collection)) {
            this.f114051a.addAll(collection);
        }
        notifyDataSetChanged();
    }

    @Override // com.larksuite.framework.ui.p1198b.AbstractC26197e
    /* renamed from: a */
    public long mo93176a(int i) {
        C45084c b = mo159356b(i);
        if (b == null) {
            return -1;
        }
        return (long) this.f114054d.mo159326a(b, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i) {
        if (m178641d(i)) {
            return (long) (i + 1000);
        }
        return this.f114056f.get(0).mo159342a(mo159356b(i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        if (m178641d(i)) {
            return i + 1000;
        }
        if (this.f114051a.size() > i - this.f114057g.mo3049b()) {
            return 0;
        }
        return 1;
    }

    /* renamed from: b */
    public C45084c mo159356b(int i) {
        int b;
        if (!m178641d(i) && this.f114051a.size() > (b = i - this.f114057g.mo3049b())) {
            return this.f114051a.get(b);
        }
        return null;
    }

    /* renamed from: c */
    public void mo159358c(int i) {
        this.f114054d = this.f114053c.mo159347a(i);
        IAdapterBinder fVar = this.f114056f.get(0);
        if (fVar instanceof SelectMemberBinder) {
            ((SelectMemberBinder) fVar).mo159366a(this.f114054d);
        }
        for (C45084c cVar : this.f114051a) {
            cVar.mo159503b(false);
        }
        notifyDataSetChanged();
    }

    @Override // com.larksuite.framework.ui.p1198b.AbstractC26197e
    /* renamed from: a */
    public RecyclerView.ViewHolder mo93177a(ViewGroup viewGroup) {
        float f;
        Context context;
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.group_member_header, viewGroup, false);
        if (DesktopUtil.m144307b()) {
            context = this.f114052b;
            f = 2.0f;
        } else {
            context = this.f114052b;
            f = 9.0f;
        }
        int dp2px = UIUtils.dp2px(context, f);
        if (this.f114054d.mo159325a() == 1) {
            inflate.setPadding(UIUtils.dp2px(this.f114052b, 35.0f), dp2px, 0, dp2px);
        } else {
            inflate.setPadding(UIUtils.dp2px(this.f114052b, 69.0f), dp2px, 0, dp2px);
        }
        return new RecyclerView.ViewHolder(inflate) {
            /* class com.ss.android.lark.member_manage.impl.base.adapter.C45044d.C450451 */
        };
    }

    /* renamed from: a */
    public void mo159350a(IFuncBinder.AbstractC45038a aVar) {
        IAdapterBinder fVar = this.f114056f.get(0);
        if (fVar instanceof SelectMemberBinder) {
            ((SelectMemberBinder) fVar).mo159363a(aVar);
        }
    }

    /* renamed from: a */
    public void mo159351a(IFuncBinder.AbstractC45039b bVar) {
        IAdapterBinder fVar = this.f114056f.get(0);
        if (fVar instanceof SelectMemberBinder) {
            ((SelectMemberBinder) fVar).mo159364a(bVar);
        }
    }

    /* renamed from: a */
    public void mo159352a(IFuncBinder.AbstractC45040c cVar) {
        IAdapterBinder fVar = this.f114056f.get(0);
        if (fVar instanceof SelectMemberBinder) {
            ((SelectMemberBinder) fVar).mo159365a(cVar);
        }
    }

    /* renamed from: a */
    public void mo159353a(SelectBeansResult dVar) {
        this.f114055e = dVar.mo159515a();
        m178640b(dVar.mo159516b());
    }

    /* renamed from: a */
    public void mo159355a(boolean z) {
        IFuncBinder iFuncBinder = this.f114054d;
        if (iFuncBinder instanceof AbstractC45048g) {
            ((AbstractC45048g) iFuncBinder).mo159359a(z);
            for (C45084c cVar : this.f114051a) {
                cVar.mo159503b(false);
            }
            notifyDataSetChanged();
        }
    }

    @Override // com.larksuite.framework.ui.p1198b.AbstractC26197e
    /* renamed from: a */
    public void mo93178a(RecyclerView.ViewHolder viewHolder, int i) {
        C45084c b = mo159356b(i);
        TextView textView = (TextView) viewHolder.itemView;
        if (b != null) {
            textView.setText(String.valueOf(b.mo159514i()));
        } else {
            textView.setText("");
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        if (!m178641d(i)) {
            C45084c b = mo159356b(i);
            int size = this.f114051a.size() + this.f114057g.mo3049b();
            boolean z = true;
            if (getItemCount() <= size || i != size - 1) {
                z = false;
            }
            this.f114056f.get(getItemViewType(i)).mo159344a(viewHolder, b, z);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (this.f114057g.mo3047a(i) != null) {
            return new C45046a(this.f114057g.mo3047a(i));
        }
        return this.f114056f.get(i).mo159346b(viewGroup, i);
    }

    public C45044d(Context context, int i, Chat chat) {
        this.f114052b = context;
        C45043c cVar = new C45043c(chat);
        this.f114053c = cVar;
        IFuncBinder<C45047e, C45084c> a = cVar.mo159347a(i);
        this.f114054d = a;
        this.f114056f.put(0, new SelectMemberBinder(context, a));
        this.f114056f.put(1, new BottomSearchTipBinder());
    }
}
