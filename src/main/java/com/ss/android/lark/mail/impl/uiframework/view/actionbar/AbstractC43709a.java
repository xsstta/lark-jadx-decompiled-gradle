package com.ss.android.lark.mail.impl.uiframework.view.actionbar;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mail.impl.uiframework.view.actionbar.AbstractC43712b;
import com.ss.android.lark.mail.impl.utils.C43849u;
import com.ss.android.lark.mail.impl.view.titlebar.AbsButton;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.lark.mail.impl.uiframework.view.actionbar.a */
public abstract class AbstractC43709a<T extends AbsButton, M extends AbstractC43712b> {

    /* renamed from: a */
    protected ActionBar f110926a;

    /* renamed from: b */
    protected ArrayList<T> f110927b = new ArrayList<>();

    /* renamed from: c */
    protected int f110928c = 1;

    /* renamed from: d */
    protected int f110929d;

    /* renamed from: e */
    protected int f110930e;

    /* renamed from: f */
    protected Context f110931f;

    /* renamed from: g */
    protected ArrayList<M> f110932g = new ArrayList<>();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo154558a(M m, int i);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract M mo154559b(ViewGroup viewGroup, int i, T t);

    /* renamed from: a */
    public ArrayList<T> mo155821a() {
        return this.f110927b;
    }

    /* renamed from: c */
    public void mo155825c() {
        m173320d();
    }

    /* renamed from: b */
    public void mo155824b() {
        C43849u.m173826a(new Runnable() {
            /* class com.ss.android.lark.mail.impl.uiframework.view.actionbar.AbstractC43709a.RunnableC437101 */

            /* JADX DEBUG: Multi-variable search result rejected for r2v2, resolved type: java.util.ArrayList<M extends com.ss.android.lark.mail.impl.uiframework.view.actionbar.b> */
            /* JADX DEBUG: Multi-variable search result rejected for r3v7, resolved type: com.ss.android.lark.mail.impl.uiframework.view.actionbar.a */
            /* JADX WARN: Multi-variable type inference failed */
            public void run() {
                AbstractC43709a.this.mo155825c();
                if (AbstractC43709a.this.f110926a.getChildCount() > 0) {
                    AbstractC43709a.this.f110926a.removeAllViews();
                }
                for (final int i = 0; i < AbstractC43709a.this.f110927b.size(); i++) {
                    AbstractC43709a aVar = AbstractC43709a.this;
                    AbstractC43712b b = aVar.mo154559b(aVar.f110926a, i, AbstractC43709a.this.f110927b.get(i));
                    AbstractC43709a.this.f110932g.add(b);
                    final View a = b.mo154561a();
                    Log.m165388i("ActionBarAdapter mItemW: " + AbstractC43709a.this.f110929d + " mItemH:" + AbstractC43709a.this.f110930e);
                    AbstractC43709a.this.f110926a.addView(a, new LinearLayout.LayoutParams(AbstractC43709a.this.f110929d, AbstractC43709a.this.f110930e));
                    AbstractC43709a.this.mo154558a(b, i);
                    a.setOnClickListener(new View.OnClickListener() {
                        /* class com.ss.android.lark.mail.impl.uiframework.view.actionbar.AbstractC43709a.RunnableC437101.View$OnClickListenerC437111 */

                        public void onClick(View view) {
                            if (i < AbstractC43709a.this.f110927b.size()) {
                                AbstractC43709a.this.f110927b.get(i).onClick(a);
                            }
                        }
                    });
                }
            }
        });
    }

    /* renamed from: d */
    private void m173320d() {
        if (!CollectionUtils.isEmpty(this.f110927b)) {
            if (this.f110926a.getOrientation() == 0) {
                this.f110929d = this.f110926a.getWidth() / this.f110927b.size();
                this.f110930e = -2;
                return;
            }
            this.f110929d = -2;
            this.f110930e = this.f110926a.getHeight() / this.f110927b.size();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo155822a(ActionBar actionBar) {
        this.f110926a = actionBar;
        this.f110931f = actionBar.getContext();
    }

    /* renamed from: a */
    public void mo155823a(List<T> list) {
        this.f110927b.clear();
        this.f110927b.addAll(list);
    }
}
