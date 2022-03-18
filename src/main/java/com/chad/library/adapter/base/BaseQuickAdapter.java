package com.chad.library.adapter.base;

import android.animation.Animator;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.chad.library.adapter.base.C20923c;
import com.chad.library.adapter.base.entity.AbstractC20929b;
import com.chad.library.adapter.base.p934a.AbstractC20920b;
import com.chad.library.adapter.base.p934a.C20919a;
import com.chad.library.adapter.base.p937d.AbstractC20926a;
import com.chad.library.adapter.base.p937d.C20927b;
import com.chad.library.adapter.base.util.AbstractC20931a;
import com.huawei.hms.location.LocationRequest;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public abstract class BaseQuickAdapter<T, K extends C20923c> extends RecyclerView.Adapter<K> {

    /* renamed from: p */
    public static final String f51185p = "BaseQuickAdapter";

    /* renamed from: A */
    private boolean f51186A;

    /* renamed from: B */
    private RecyclerView f51187B;

    /* renamed from: C */
    private boolean f51188C;

    /* renamed from: D */
    private boolean f51189D;

    /* renamed from: E */
    private AbstractC20915e f51190E;

    /* renamed from: F */
    private int f51191F;

    /* renamed from: G */
    private boolean f51192G;

    /* renamed from: H */
    private boolean f51193H;

    /* renamed from: I */
    private AbstractC20931a<T> f51194I;

    /* renamed from: J */
    private int f51195J;

    /* renamed from: a */
    private boolean f51196a;

    /* renamed from: b */
    private boolean f51197b;

    /* renamed from: c */
    private boolean f51198c;

    /* renamed from: d */
    private AbstractC20911a f51199d;

    /* renamed from: e */
    private AbstractC20912b f51200e;

    /* renamed from: f */
    private boolean f51201f;

    /* renamed from: g */
    private boolean f51202g;

    /* renamed from: h */
    private Interpolator f51203h;

    /* renamed from: i */
    private int f51204i;

    /* renamed from: j */
    private int f51205j;

    /* renamed from: k */
    private AbstractC20920b f51206k;

    /* renamed from: l */
    private AbstractC20920b f51207l;

    /* renamed from: m */
    public AbstractC20926a f51208m;

    /* renamed from: n */
    public AbstractC20913c f51209n;

    /* renamed from: o */
    public boolean f51210o;

    /* renamed from: q */
    public Context f51211q;

    /* renamed from: r */
    protected int f51212r;

    /* renamed from: s */
    protected LayoutInflater f51213s;

    /* renamed from: t */
    protected List<T> f51214t;

    /* renamed from: u */
    public AbstractC20914d f51215u;

    /* renamed from: v */
    private LinearLayout f51216v;

    /* renamed from: w */
    private LinearLayout f51217w;

    /* renamed from: x */
    private FrameLayout f51218x;

    /* renamed from: y */
    private boolean f51219y;

    /* renamed from: z */
    private boolean f51220z;

    @Retention(RetentionPolicy.SOURCE)
    public @interface AnimationType {
    }

    /* renamed from: com.chad.library.adapter.base.BaseQuickAdapter$a */
    public interface AbstractC20911a {
        void onItemClick(BaseQuickAdapter baseQuickAdapter, View view, int i);
    }

    /* renamed from: com.chad.library.adapter.base.BaseQuickAdapter$b */
    public interface AbstractC20912b {
        /* renamed from: a */
        boolean mo70709a(BaseQuickAdapter baseQuickAdapter, View view, int i);
    }

    /* renamed from: com.chad.library.adapter.base.BaseQuickAdapter$c */
    public interface AbstractC20913c {
        /* renamed from: a */
        void mo70710a();
    }

    /* renamed from: com.chad.library.adapter.base.BaseQuickAdapter$d */
    public interface AbstractC20914d {
        /* renamed from: a */
        int mo70711a(GridLayoutManager gridLayoutManager, int i);
    }

    /* renamed from: com.chad.library.adapter.base.BaseQuickAdapter$e */
    public interface AbstractC20915e {
        /* renamed from: a */
        void mo70712a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo16806a(K k, T t);

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public boolean mo70687e(int i) {
        return i == 1365 || i == 273 || i == 819 || i == 546;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i) {
        return (long) i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public RecyclerView mo70689f() {
        return this.f51187B;
    }

    /* renamed from: g */
    public boolean mo70693g() {
        return this.f51188C;
    }

    /* renamed from: h */
    public boolean mo70694h() {
        return this.f51189D;
    }

    /* renamed from: n */
    public boolean mo70700n() {
        return this.f51192G;
    }

    /* renamed from: o */
    public boolean mo70701o() {
        return this.f51193H;
    }

    /* renamed from: q */
    public final AbstractC20912b mo70703q() {
        return this.f51200e;
    }

    /* renamed from: r */
    public final AbstractC20911a mo70704r() {
        return this.f51199d;
    }

    /* renamed from: a */
    public void mo70667a(RecyclerView recyclerView) {
        if (mo70689f() == null) {
            m76149b(recyclerView);
            mo70689f().setAdapter(this);
            return;
        }
        throw new RuntimeException("Don't bind twice");
    }

    /* renamed from: a */
    public void mo70664a(int i, T t) {
        this.f51214t.set(i, t);
        notifyItemChanged(i + mo70678c());
    }

    /* renamed from: a */
    public void onBindViewHolder(K k, int i) {
        mo33373b(i);
        m76152i(i);
        int itemViewType = k.getItemViewType();
        if (itemViewType == 0) {
            mo16806a(k, mo70685d(i - mo70678c()));
        } else if (itemViewType == 273) {
        } else {
            if (itemViewType == 546) {
                this.f51208m.mo70752a(k);
            } else if (itemViewType != 819 && itemViewType != 1365) {
                mo16806a(k, mo70685d(i - mo70678c()));
            }
        }
    }

    /* renamed from: a */
    public void mo70666a(View view, int i) {
        mo70704r().onItemClick(this, view, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public K mo32344a(ViewGroup viewGroup, int i) {
        int i2 = this.f51212r;
        AbstractC20931a<T> aVar = this.f51194I;
        if (aVar != null) {
            i2 = aVar.mo70770a(i);
        }
        return mo70684d(viewGroup, i2);
    }

    /* renamed from: a */
    public int mo70661a(View view) {
        return mo70679c(view, -1);
    }

    /* renamed from: a */
    public int mo70662a(View view, int i, int i2) {
        int a;
        if (this.f51216v == null) {
            LinearLayout linearLayout = new LinearLayout(view.getContext());
            this.f51216v = linearLayout;
            if (i2 == 1) {
                linearLayout.setOrientation(1);
                this.f51216v.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
            } else {
                linearLayout.setOrientation(0);
                this.f51216v.setLayoutParams(new RecyclerView.LayoutParams(-2, -1));
            }
        }
        int childCount = this.f51216v.getChildCount();
        if (i < 0 || i > childCount) {
            i = childCount;
        }
        this.f51216v.addView(view, i);
        if (this.f51216v.getChildCount() == 1 && (a = mo18916a()) != -1) {
            notifyItemInserted(a);
        }
        return i;
    }

    /* renamed from: a */
    public void mo70663a(int i, ViewGroup viewGroup) {
        mo70686e(LayoutInflater.from(viewGroup.getContext()).inflate(i, viewGroup, false));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo70665a(Animator animator, int i) {
        animator.setDuration((long) this.f51204i).start();
        animator.setInterpolator(this.f51203h);
    }

    /* renamed from: a */
    public boolean mo70670a(AbstractC20929b bVar) {
        List<T> subItems;
        if (bVar == null || (subItems = bVar.getSubItems()) == null || subItems.size() <= 0) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public boolean mo70671a(T t) {
        return t != null && (t instanceof AbstractC20929b);
    }

    /* renamed from: a */
    private int mo18916a() {
        if (mo70698l() != 1 || this.f51220z) {
            return 0;
        }
        return -1;
    }

    /* renamed from: b */
    public List<T> mo70673b() {
        return this.f51214t;
    }

    /* renamed from: c */
    public int mo70678c() {
        LinearLayout linearLayout = this.f51216v;
        if (linearLayout == null || linearLayout.getChildCount() == 0) {
            return 0;
        }
        return 1;
    }

    /* renamed from: j */
    public int mo70696j() {
        return mo70678c() + this.f51214t.size() + mo70697k();
    }

    /* renamed from: k */
    public int mo70697k() {
        LinearLayout linearLayout = this.f51217w;
        if (linearLayout == null || linearLayout.getChildCount() == 0) {
            return 0;
        }
        return 1;
    }

    /* renamed from: l */
    public int mo70698l() {
        FrameLayout frameLayout = this.f51218x;
        if (frameLayout == null || frameLayout.getChildCount() == 0 || !this.f51219y || this.f51214t.size() != 0) {
            return 0;
        }
        return 1;
    }

    /* renamed from: m */
    public void mo70699m() {
        if (this.f51208m.mo70750a() != 2) {
            this.f51208m.mo70751a(1);
            notifyItemChanged(mo70696j());
        }
    }

    /* renamed from: p */
    public void mo70702p() {
        if (mo70678c() != 0) {
            this.f51216v.removeAllViews();
            int a = mo18916a();
            if (a != -1) {
                notifyItemRemoved(a);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        int i = 1;
        if (mo70698l() == 1) {
            if (this.f51220z && mo70678c() != 0) {
                i = 2;
            }
            if (!this.f51186A || mo70697k() == 0) {
                return i;
            }
            return i + 1;
        }
        return mo70695i() + mo70678c() + this.f51214t.size() + mo70697k();
    }

    /* renamed from: i */
    public int mo70695i() {
        if (this.f51209n == null || !this.f51197b) {
            return 0;
        }
        if ((this.f51196a || !this.f51208m.mo70753b()) && this.f51214t.size() != 0) {
            return 1;
        }
        return 0;
    }

    /* renamed from: b */
    private void m76149b(RecyclerView recyclerView) {
        this.f51187B = recyclerView;
    }

    /* renamed from: a */
    public void mo70668a(AbstractC20911a aVar) {
        this.f51199d = aVar;
    }

    /* renamed from: c */
    public void mo70683c(boolean z) {
        this.f51219y = z;
    }

    public BaseQuickAdapter(int i) {
        this(i, null);
    }

    /* renamed from: f */
    public int mo70688f(int i) {
        return mo18768a(i, true, true);
    }

    /* renamed from: g */
    public int mo70691g(int i) {
        return mo18774b(i, true, true);
    }

    public BaseQuickAdapter(List<T> list) {
        this(0, list);
    }

    /* renamed from: h */
    private void m76151h(int i) {
        int i2;
        List<T> list = this.f51214t;
        if (list == null) {
            i2 = 0;
        } else {
            i2 = list.size();
        }
        if (i2 == i) {
            notifyDataSetChanged();
        }
    }

    /* renamed from: k */
    private AbstractC20929b m76154k(int i) {
        T d = mo70685d(i);
        if (mo70671a((Object) d)) {
            return d;
        }
        return null;
    }

    /* renamed from: a */
    private K m76143a(ViewGroup viewGroup) {
        K d = mo37650d(mo70672b(this.f51208m.mo70754c(), viewGroup));
        ((C20923c) d).itemView.setOnClickListener(new View.OnClickListener() {
            /* class com.chad.library.adapter.base.BaseQuickAdapter.View$OnClickListenerC209061 */

            public void onClick(View view) {
                if (BaseQuickAdapter.this.f51208m.mo70750a() == 3) {
                    BaseQuickAdapter.this.mo70699m();
                }
                if (BaseQuickAdapter.this.f51210o && BaseQuickAdapter.this.f51208m.mo70750a() == 4) {
                    BaseQuickAdapter.this.mo70699m();
                }
            }
        });
        return d;
    }

    /* renamed from: b */
    private void mo33373b(int i) {
        AbstractC20915e eVar;
        if (mo70693g() && !mo70694h() && i <= this.f51191F && (eVar = this.f51190E) != null) {
            eVar.mo70712a();
        }
    }

    /* renamed from: d */
    private int m76150d(T t) {
        List<T> list;
        if (t == null || (list = this.f51214t) == null || list.isEmpty()) {
            return -1;
        }
        return this.f51214t.indexOf(t);
    }

    /* renamed from: c */
    public void mo70682c(int i) {
        this.f51214t.remove(i);
        int c = i + mo70678c();
        notifyItemRemoved(c);
        m76151h(0);
        notifyItemRangeChanged(c, this.f51214t.size() - c);
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo70692g(RecyclerView.ViewHolder viewHolder) {
        if (viewHolder.itemView.getLayoutParams() instanceof StaggeredGridLayoutManager.LayoutParams) {
            ((StaggeredGridLayoutManager.LayoutParams) viewHolder.itemView.getLayoutParams()).mo7274a(true);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof GridLayoutManager) {
            final GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
            gridLayoutManager.mo6501a(new GridLayoutManager.AbstractC1297b() {
                /* class com.chad.library.adapter.base.BaseQuickAdapter.C209072 */

                @Override // androidx.recyclerview.widget.GridLayoutManager.AbstractC1297b
                /* renamed from: a */
                public int mo6533a(int i) {
                    int itemViewType = BaseQuickAdapter.this.getItemViewType(i);
                    if (itemViewType == 273 && BaseQuickAdapter.this.mo70700n()) {
                        return 1;
                    }
                    if (itemViewType == 819 && BaseQuickAdapter.this.mo70701o()) {
                        return 1;
                    }
                    if (BaseQuickAdapter.this.f51215u == null) {
                        if (BaseQuickAdapter.this.mo70687e(itemViewType)) {
                            return gridLayoutManager.mo6502b();
                        }
                        return 1;
                    } else if (BaseQuickAdapter.this.mo70687e(itemViewType)) {
                        return gridLayoutManager.mo6502b();
                    } else {
                        return BaseQuickAdapter.this.f51215u.mo70711a(gridLayoutManager, i - BaseQuickAdapter.this.mo70678c());
                    }
                }
            });
        }
    }

    /* renamed from: a */
    private void mo43415a(RecyclerView.ViewHolder viewHolder) {
        if (!this.f51202g) {
            return;
        }
        if (!this.f51201f || viewHolder.getLayoutPosition() > this.f51205j) {
            AbstractC20920b bVar = this.f51206k;
            if (bVar == null) {
                bVar = this.f51207l;
            }
            for (Animator animator : bVar.mo70725a(viewHolder.itemView)) {
                mo70665a(animator, viewHolder.getLayoutPosition());
            }
            this.f51205j = viewHolder.getLayoutPosition();
        }
    }

    /* renamed from: i */
    private void m76152i(int i) {
        if (mo70695i() != 0 && i >= getItemCount() - this.f51195J && this.f51208m.mo70750a() == 1) {
            this.f51208m.mo70751a(2);
            if (!this.f51198c) {
                this.f51198c = true;
                if (mo70689f() != null) {
                    mo70689f().post(new Runnable() {
                        /* class com.chad.library.adapter.base.BaseQuickAdapter.RunnableC209105 */

                        public void run() {
                            BaseQuickAdapter.this.f51209n.mo70710a();
                        }
                    });
                } else {
                    this.f51209n.mo70710a();
                }
            }
        }
    }

    /* renamed from: c */
    public int mo70680c(T t) {
        int i;
        int d = m76150d((Object) t);
        if (d == -1) {
            return -1;
        }
        if (t instanceof AbstractC20929b) {
            i = t.getLevel();
        } else {
            i = Integer.MAX_VALUE;
        }
        if (i == 0) {
            return d;
        }
        if (i == -1) {
            return -1;
        }
        while (d >= 0) {
            T t2 = this.f51214t.get(d);
            if (t2 instanceof AbstractC20929b) {
                T t3 = t2;
                if (t3.getLevel() >= 0 && t3.getLevel() < i) {
                    return d;
                }
            }
            d--;
        }
        return -1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public K mo37650d(View view) {
        Class<?> cls = getClass();
        Class cls2 = null;
        while (cls2 == null && cls != null) {
            cls2 = m76145a((Class) cls);
            cls = cls.getSuperclass();
        }
        K a = cls2 == null ? (K) new C20923c(view) : m76144a(cls2, view);
        return a != null ? a : (K) new C20923c(view);
    }

    /* renamed from: f */
    public void mo70690f(List<T> list) {
        if (list == null) {
            list = new ArrayList<>();
        }
        this.f51214t = list;
        if (this.f51209n != null) {
            this.f51196a = true;
            this.f51197b = true;
            this.f51198c = false;
            this.f51208m.mo70751a(1);
        }
        this.f51205j = -1;
        notifyDataSetChanged();
    }

    /* renamed from: j */
    private int m76153j(int i) {
        T d = mo70685d(i);
        int i2 = 0;
        if (!mo70671a((Object) d)) {
            return 0;
        }
        T t = d;
        if (t.isExpanded()) {
            List<T> subItems = t.getSubItems();
            if (subItems == null) {
                return 0;
            }
            for (int size = subItems.size() - 1; size >= 0; size--) {
                T t2 = subItems.get(size);
                int d2 = m76150d((Object) t2);
                if (d2 >= 0 && (d2 >= i || (d2 = i + size + 1) < this.f51214t.size())) {
                    if (t2 instanceof AbstractC20929b) {
                        i2 += m76153j(d2);
                    }
                    this.f51214t.remove(d2);
                    i2++;
                }
            }
        }
        return i2;
    }

    /* renamed from: b */
    public void mo70674b(View view) {
        int a;
        if (mo70678c() != 0) {
            this.f51216v.removeView(view);
            if (this.f51216v.getChildCount() == 0 && (a = mo18916a()) != -1) {
                notifyItemRemoved(a);
            }
        }
    }

    /* renamed from: d */
    public T mo70685d(int i) {
        if (i < 0 || i >= this.f51214t.size()) {
            return null;
        }
        return this.f51214t.get(i);
    }

    /* renamed from: e */
    public void mo70686e(View view) {
        boolean z;
        int i = 0;
        if (this.f51218x == null) {
            this.f51218x = new FrameLayout(view.getContext());
            RecyclerView.LayoutParams layoutParams = new RecyclerView.LayoutParams(-1, -1);
            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            if (layoutParams2 != null) {
                layoutParams.width = layoutParams2.width;
                layoutParams.height = layoutParams2.height;
            }
            this.f51218x.setLayoutParams(layoutParams);
            z = true;
        } else {
            z = false;
        }
        this.f51218x.removeAllViews();
        this.f51218x.addView(view);
        this.f51219y = true;
        if (z && mo70698l() == 1) {
            if (this.f51220z && mo70678c() != 0) {
                i = 1;
            }
            notifyItemInserted(i);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        boolean z;
        if (mo70698l() == 1) {
            if (!this.f51220z || mo70678c() == 0) {
                z = false;
            } else {
                z = true;
            }
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        return 1365;
                    }
                    return 819;
                } else if (z) {
                    return 1365;
                } else {
                    return 819;
                }
            } else if (z) {
                return 273;
            } else {
                return 1365;
            }
        } else {
            int c = mo70678c();
            if (i < c) {
                return 273;
            }
            int i2 = i - c;
            int size = this.f51214t.size();
            if (i2 < size) {
                return mo32796a(i2);
            }
            if (i2 - size < mo70697k()) {
                return 819;
            }
            return 546;
        }
    }

    /* renamed from: b */
    public void onViewAttachedToWindow(K k) {
        super.onViewAttachedToWindow(k);
        int itemViewType = k.getItemViewType();
        if (itemViewType == 1365 || itemViewType == 273 || itemViewType == 819 || itemViewType == 546) {
            mo70692g(k);
        } else {
            mo43415a((RecyclerView.ViewHolder) k);
        }
    }

    /* renamed from: a */
    private Class m76145a(Class cls) {
        Type genericSuperclass = cls.getGenericSuperclass();
        if (!(genericSuperclass instanceof ParameterizedType)) {
            return null;
        }
        Type[] actualTypeArguments = ((ParameterizedType) genericSuperclass).getActualTypeArguments();
        for (Type type : actualTypeArguments) {
            if (type instanceof Class) {
                Class cls2 = (Class) type;
                if (C20923c.class.isAssignableFrom(cls2)) {
                    return cls2;
                }
            } else if (type instanceof ParameterizedType) {
                Type rawType = ((ParameterizedType) type).getRawType();
                if (rawType instanceof Class) {
                    Class cls3 = (Class) rawType;
                    if (C20923c.class.isAssignableFrom(cls3)) {
                        return cls3;
                    }
                } else {
                    continue;
                }
            } else {
                continue;
            }
        }
        return null;
    }

    /* renamed from: b */
    public void mo70676b(T t) {
        this.f51214t.add(t);
        notifyItemInserted(this.f51214t.size() + mo70678c());
        m76151h(1);
    }

    /* renamed from: a */
    private void mo21129a(final C20923c cVar) {
        View view;
        if (cVar != null && (view = cVar.itemView) != null) {
            if (mo70704r() != null) {
                view.setOnClickListener(new View.OnClickListener() {
                    /* class com.chad.library.adapter.base.BaseQuickAdapter.View$OnClickListenerC209083 */

                    public void onClick(View view) {
                        BaseQuickAdapter.this.mo70666a(view, cVar.getLayoutPosition() - BaseQuickAdapter.this.mo70678c());
                    }
                });
            }
            if (mo70703q() != null) {
                view.setOnLongClickListener(new View.OnLongClickListener() {
                    /* class com.chad.library.adapter.base.BaseQuickAdapter.View$OnLongClickListenerC209094 */

                    public boolean onLongClick(View view) {
                        return BaseQuickAdapter.this.mo70677b(view, cVar.getLayoutPosition() - BaseQuickAdapter.this.mo70678c());
                    }
                });
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo32796a(int i) {
        AbstractC20931a<T> aVar = this.f51194I;
        if (aVar != null) {
            return aVar.mo70772a(this.f51214t, i);
        }
        return super.getItemViewType(i);
    }

    /* renamed from: a */
    public int mo70660a(int i, boolean z) {
        return mo18768a(i, z, true);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public View mo70672b(int i, ViewGroup viewGroup) {
        return this.f51213s.inflate(i, viewGroup, false);
    }

    /* renamed from: c */
    public int mo70679c(View view, int i) {
        return mo70662a(view, i, 1);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public K mo70684d(ViewGroup viewGroup, int i) {
        return mo37650d(mo70672b(i, viewGroup));
    }

    public BaseQuickAdapter(int i, List<T> list) {
        this.f51208m = new C20927b();
        this.f51210o = false;
        this.f51201f = true;
        this.f51202g = false;
        this.f51203h = new LinearInterpolator();
        this.f51204i = LocationRequest.PRIORITY_INDOOR;
        this.f51205j = -1;
        this.f51207l = new C20919a();
        this.f51219y = true;
        this.f51191F = 1;
        this.f51195J = 1;
        this.f51214t = list == null ? new ArrayList<>() : list;
        if (i != 0) {
            this.f51212r = i;
        }
    }

    /* renamed from: a */
    private int m76142a(int i, List list) {
        int size = list.size();
        int size2 = (i + list.size()) - 1;
        int size3 = list.size() - 1;
        while (size3 >= 0) {
            if (list.get(size3) instanceof AbstractC20929b) {
                AbstractC20929b bVar = (AbstractC20929b) list.get(size3);
                if (bVar.isExpanded() && mo70670a(bVar)) {
                    List<T> subItems = bVar.getSubItems();
                    int i2 = size2 + 1;
                    this.f51214t.addAll(i2, subItems);
                    size += m76142a(i2, (List) subItems);
                }
            }
            size3--;
            size2--;
        }
        return size;
    }

    /* renamed from: c */
    public K onCreateViewHolder(ViewGroup viewGroup, int i) {
        K k;
        Context context = viewGroup.getContext();
        this.f51211q = context;
        this.f51213s = LayoutInflater.from(context);
        if (i == 273) {
            k = mo37650d((View) this.f51216v);
        } else if (i == 546) {
            k = m76143a(viewGroup);
        } else if (i == 819) {
            k = mo37650d((View) this.f51217w);
        } else if (i != 1365) {
            k = mo32344a(viewGroup, i);
            mo21129a((C20923c) k);
        } else {
            k = mo37650d((View) this.f51218x);
        }
        k.mo70739a(this);
        return k;
    }

    /* JADX WARN: Type inference failed for: r6v11, types: [com.chad.library.adapter.base.c, K extends com.chad.library.adapter.base.c] */
    /* JADX WARN: Type inference failed for: r6v14, types: [com.chad.library.adapter.base.c, K extends com.chad.library.adapter.base.c] */
    /* renamed from: a */
    private K m76144a(Class cls, View view) {
        try {
            if (!cls.isMemberClass() || Modifier.isStatic(cls.getModifiers())) {
                Constructor<T> declaredConstructor = cls.getDeclaredConstructor(View.class);
                declaredConstructor.setAccessible(true);
                return declaredConstructor.newInstance(view);
            }
            Constructor<T> declaredConstructor2 = cls.getDeclaredConstructor(getClass(), View.class);
            declaredConstructor2.setAccessible(true);
            return declaredConstructor2.newInstance(this, view);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
            return null;
        } catch (IllegalAccessException e2) {
            e2.printStackTrace();
            return null;
        } catch (InstantiationException e3) {
            e3.printStackTrace();
            return null;
        } catch (InvocationTargetException e4) {
            e4.printStackTrace();
            return null;
        }
    }

    /* renamed from: b */
    public boolean mo70677b(View view, int i) {
        return mo70703q().mo70709a(this, view, i);
    }

    /* renamed from: b */
    public int mo18774b(int i, boolean z, boolean z2) {
        int c = i - mo70678c();
        AbstractC20929b k = m76154k(c);
        if (k == null) {
            return 0;
        }
        int j = m76153j(c);
        k.setExpanded(false);
        int c2 = c + mo70678c();
        if (z2) {
            if (z) {
                notifyItemChanged(c2);
                notifyItemRangeRemoved(c2 + 1, j);
            } else {
                notifyDataSetChanged();
            }
        }
        return j;
    }

    /* renamed from: a */
    public int mo18768a(int i, boolean z, boolean z2) {
        int c = i - mo70678c();
        AbstractC20929b k = m76154k(c);
        int i2 = 0;
        if (k == null) {
            return 0;
        }
        if (!mo70670a(k)) {
            k.setExpanded(true);
            notifyItemChanged(c);
            return 0;
        }
        if (!k.isExpanded()) {
            List<T> subItems = k.getSubItems();
            int i3 = c + 1;
            this.f51214t.addAll(i3, subItems);
            i2 = 0 + m76142a(i3, (List) subItems);
            k.setExpanded(true);
        }
        int c2 = c + mo70678c();
        if (z2) {
            if (z) {
                notifyItemChanged(c2);
                notifyItemRangeInserted(c2 + 1, i2);
            } else {
                notifyDataSetChanged();
            }
        }
        return i2;
    }
}
