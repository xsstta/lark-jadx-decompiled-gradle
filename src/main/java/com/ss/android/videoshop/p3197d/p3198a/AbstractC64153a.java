package com.ss.android.videoshop.p3197d.p3198a;

import android.content.Context;
import android.os.Message;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.common.utility.collection.WeakHandler;
import com.ss.android.videoshop.api.AbstractC64101i;
import com.ss.android.videoshop.api.AbstractC64108o;
import com.ss.android.videoshop.p3194a.AbstractC64090d;
import com.ss.android.videoshop.p3195b.C64116b;
import com.ss.android.videoshop.p3196c.AbstractC64123g;
import com.ss.android.videoshop.p3197d.AbstractC64152a;
import com.ss.android.videoshop.p3197d.AbstractC64158b;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.ss.android.videoshop.d.a.a */
public abstract class AbstractC64153a implements WeakHandler.IHandler, AbstractC64152a, Comparable<AbstractC64153a> {

    /* renamed from: a */
    private AbstractC64158b f162046a;

    /* renamed from: b */
    private Map<ViewGroup, List<View>> f162047b = new HashMap();

    /* renamed from: c */
    private boolean f162048c;

    /* renamed from: e */
    protected WeakHandler f162049e = new WeakHandler(this);

    /* renamed from: a */
    public List<Pair<View, RelativeLayout.LayoutParams>> mo163777a(Context context, LayoutInflater layoutInflater) {
        return null;
    }

    /* renamed from: a */
    public Map<View, RelativeLayout.LayoutParams> mo222215a(Context context) {
        return null;
    }

    @Override // com.ss.android.videoshop.p3197d.AbstractC64152a
    /* renamed from: a */
    public void mo222204a(List<Integer> list, AbstractC64108o oVar) {
    }

    @Override // com.ss.android.videoshop.p3197d.AbstractC64152a
    /* renamed from: a */
    public boolean mo163782a(AbstractC64123g gVar) {
        return false;
    }

    /* renamed from: l */
    public boolean mo163922l() {
        return false;
    }

    @Override // com.ss.android.videoshop.p3197d.AbstractC64152a
    /* renamed from: m */
    public AbstractC64101i mo163923m() {
        return null;
    }

    @Override // com.ss.android.videoshop.p3197d.AbstractC64152a
    /* renamed from: r */
    public Set<Integer> mo222210r() {
        return null;
    }

    @Override // com.ss.android.videoshop.p3197d.AbstractC64152a
    /* renamed from: t */
    public boolean mo222212t() {
        return this.f162048c;
    }

    /* renamed from: v */
    public AbstractC64158b mo222221v() {
        return this.f162046a;
    }

    @Override // com.ss.android.videoshop.p3197d.AbstractC64152a
    /* renamed from: p */
    public int mo222208p() {
        return mo163783b();
    }

    public ViewGroup bi_() {
        AbstractC64158b v = mo222221v();
        if (v != null) {
            return v.mo222228a();
        }
        return null;
    }

    @Override // com.ss.android.videoshop.p3197d.AbstractC64152a
    /* renamed from: s */
    public AbstractC64108o mo222211s() {
        AbstractC64158b bVar = this.f162046a;
        if (bVar != null) {
            return bVar.mo222239c();
        }
        return null;
    }

    /* renamed from: y */
    public C64116b mo222224y() {
        AbstractC64158b v = mo222221v();
        if (v != null) {
            return v.mo222242f();
        }
        return null;
    }

    /* renamed from: z */
    public C64116b mo222225z() {
        AbstractC64158b v = mo222221v();
        if (v != null) {
            return v.mo222243g();
        }
        return null;
    }

    @Override // com.ss.android.videoshop.p3197d.AbstractC64152a
    /* renamed from: q */
    public boolean mo222209q() {
        List<View> list = this.f162047b.get(bi_());
        if (list == null || list.isEmpty()) {
            return false;
        }
        return true;
    }

    /* renamed from: x */
    public Context mo222223x() {
        if (mo222221v() != null) {
            return mo222221v().mo222241e();
        }
        return null;
    }

    /* renamed from: w */
    public void mo222222w() {
        for (Map.Entry<ViewGroup, List<View>> entry : this.f162047b.entrySet()) {
            if (entry.getValue() != null) {
                for (View view : entry.getValue()) {
                    UIUtils.detachFromParent(view);
                }
            }
        }
        this.f162047b.clear();
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public void mo222220u() {
        Context x = mo222223x();
        List<Pair<View, RelativeLayout.LayoutParams>> a = mo163777a(x, mo222217b(x));
        if (a == null || a.isEmpty()) {
            Map<View, RelativeLayout.LayoutParams> a2 = mo222215a(mo222223x());
            if (!(a2 == null || a2.isEmpty())) {
                for (Map.Entry entry : new HashMap(a2).entrySet()) {
                    mo222216a((View) entry.getKey(), bi_(), (ViewGroup.LayoutParams) entry.getValue());
                }
                return;
            }
            return;
        }
        for (Pair<View, RelativeLayout.LayoutParams> pair : a) {
            if (pair != null) {
                mo222216a((View) pair.first, bi_(), (ViewGroup.LayoutParams) pair.second);
            }
        }
    }

    /* renamed from: b */
    public void mo222218b(AbstractC64158b bVar) {
        this.f162046a = bVar;
    }

    @Override // com.ss.android.videoshop.p3197d.AbstractC64152a
    /* renamed from: d */
    public void mo222207d(boolean z) {
        this.f162048c = z;
    }

    @Override // com.ss.android.videoshop.p3197d.AbstractC64152a
    /* renamed from: a */
    public void mo222202a(AbstractC64090d dVar) {
        AbstractC64158b bVar = this.f162046a;
        if (bVar != null) {
            bVar.mo222230a(dVar);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public LayoutInflater mo222217b(Context context) {
        if (context == null) {
            return null;
        }
        return LayoutInflater.from(context);
    }

    @Override // com.ss.android.videoshop.p3197d.AbstractC64152a
    /* renamed from: b */
    public View mo222205b(ViewGroup viewGroup) {
        List<View> list = this.f162047b.get(viewGroup);
        if (list == null || list.isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    /* renamed from: a */
    public int compareTo(AbstractC64153a aVar) {
        if (aVar == null || mo163783b() > aVar.mo163783b()) {
            return 1;
        }
        if (mo163783b() < aVar.mo163783b()) {
            return -1;
        }
        return 0;
    }

    @Override // com.ss.android.videoshop.p3197d.AbstractC64152a
    /* renamed from: b */
    public boolean mo222206b(AbstractC64123g gVar) {
        AbstractC64158b bVar = this.f162046a;
        if (bVar == null || !bVar.mo222236a(gVar)) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.videoshop.p3197d.AbstractC64152a
    /* renamed from: a */
    public View mo222201a(ViewGroup viewGroup) {
        List<View> list = this.f162047b.get(viewGroup);
        if (list == null || list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public void handleMsg(Message message) {
        if (message.what == 100) {
            this.f162049e.removeMessages(100);
            AbstractC64158b bVar = this.f162046a;
            if (bVar == null || !bVar.mo222240d()) {
                mo222222w();
            } else {
                this.f162049e.sendEmptyMessageDelayed(100, 300);
            }
        } else if (message.what == 101) {
            AbstractC64158b bVar2 = this.f162046a;
            if (bVar2 != null && bVar2.mo222240d()) {
                this.f162049e.sendMessageDelayed(message, 300);
            } else if (message.obj instanceof View) {
                UIUtils.detachFromParent((View) message.obj);
            }
        }
    }

    @Override // com.ss.android.videoshop.p3197d.AbstractC64152a
    /* renamed from: a */
    public void mo222203a(AbstractC64158b bVar) {
        mo222218b(bVar);
        mo222220u();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo222213a(View view, ViewGroup viewGroup) {
        if (view == null || viewGroup == null) {
            return -2;
        }
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            if (view == viewGroup.getChildAt(i)) {
                return i;
            }
        }
        return -2;
    }

    /* renamed from: a */
    public void mo222216a(View view, ViewGroup viewGroup, ViewGroup.LayoutParams layoutParams) {
        List<View> list;
        if (view != null && viewGroup != null && view.getParent() == null && mo222221v() != null) {
            int a = mo222213a(mo222201a(viewGroup), viewGroup) + 1;
            if (a < 0) {
                a = mo222221v().mo222227a(this, viewGroup);
            }
            if (a >= 0) {
                if (layoutParams != null) {
                    viewGroup.addView(view, a, layoutParams);
                } else {
                    viewGroup.addView(view, a);
                }
                if (this.f162047b.containsKey(viewGroup)) {
                    list = this.f162047b.get(viewGroup);
                } else {
                    list = new LinkedList<>();
                }
                if (list != null) {
                    list.add(0, view);
                    this.f162047b.put(viewGroup, list);
                }
            }
        }
    }
}
