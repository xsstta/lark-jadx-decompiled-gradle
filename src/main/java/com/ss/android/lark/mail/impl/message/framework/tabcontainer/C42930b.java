package com.ss.android.lark.mail.impl.message.framework.tabcontainer;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.PagerAdapter;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mail.impl.message.framework.AbstractC42924a;
import com.ss.android.lark.mail.impl.message.framework.AbstractC42925b;
import com.ss.android.lark.mail.impl.message.p2203c.C42844a;
import com.ss.android.lark.mail.impl.message.view.AbsMessageTemplateView;
import com.ss.android.lark.mail.impl.p2171h.p2175c.C42344d;
import com.ss.android.lark.mail.impl.p2171h.p2177e.C42351b;
import com.ss.android.lark.mail.impl.p2171h.p2177e.C42352c;
import com.ss.android.lark.mail.impl.utils.C43849u;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.ss.android.lark.mail.impl.message.framework.tabcontainer.b */
public class C42930b extends PagerAdapter implements AbstractC42929a {

    /* renamed from: a */
    public List<AbsMessageTemplateView> f109343a = new ArrayList();

    /* renamed from: b */
    public MailViewPager f109344b;

    /* renamed from: c */
    private List<C42844a> f109345c;

    /* renamed from: d */
    private Activity f109346d;

    /* renamed from: e */
    private HashMap<Integer, AbsMessageTemplateView> f109347e = new HashMap<>();

    /* renamed from: f */
    private int f109348f;

    /* renamed from: g */
    private int f109349g = -1;

    /* renamed from: h */
    private AbstractC42925b f109350h;

    /* renamed from: i */
    private int f109351i;

    /* renamed from: j */
    private int f109352j;

    /* renamed from: k */
    private int f109353k;

    /* renamed from: l */
    private String f109354l;

    /* renamed from: m */
    private AbstractC42924a f109355m;

    /* renamed from: n */
    private boolean f109356n = true;

    /* renamed from: o */
    private boolean f109357o;

    @Override // androidx.viewpager.widget.PagerAdapter
    public boolean isViewFromObject(View view, Object obj) {
        return view == obj;
    }

    /* renamed from: c */
    public boolean mo154030c() {
        return this.f109357o;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getCount() {
        return this.f109345c.size();
    }

    /* renamed from: b */
    public void mo154027b() {
        AbsMessageTemplateView c = mo154029c(this.f109348f);
        if (c != null) {
            c.mo154332b();
        }
    }

    /* renamed from: a */
    public void mo154023a() {
        for (int i = 0; i < this.f109343a.size(); i++) {
            this.f109343a.get(i).mo154298I();
        }
    }

    /* renamed from: c */
    public AbsMessageTemplateView mo154029c(int i) {
        return this.f109347e.get(Integer.valueOf(i));
    }

    /* renamed from: a */
    private void m170959a(Context context) {
        for (int i = 0; i < 3; i++) {
            AbsMessageTemplateView a = this.f109350h.mo154012a(context);
            a.setITabPageLoadCallback(this);
            a.setRenderProcessCallback(new AbsMessageTemplateView.AbstractC43116b() {
                /* class com.ss.android.lark.mail.impl.message.framework.tabcontainer.C42930b.C429311 */

                @Override // com.ss.android.lark.mail.impl.message.view.AbsMessageTemplateView.AbstractC43116b
                /* renamed from: a */
                public void mo154031a() {
                    Log.m165389i("MessageListTabAdapter", "testReload onRenderProcessGone mIsReload true");
                    C42930b.this.f109344b.setScanScroll(false);
                }
            });
            this.f109343a.add(a);
            this.f109347e.put(Integer.valueOf(i), a);
        }
    }

    /* renamed from: d */
    private AbsMessageTemplateView m170960d(int i) {
        AbsMessageTemplateView absMessageTemplateView = null;
        for (int i2 = 0; i2 < this.f109343a.size(); i2++) {
            if (this.f109343a.get(i2).f109708p) {
                absMessageTemplateView = this.f109343a.get(i2);
            }
        }
        return absMessageTemplateView;
    }

    @Override // com.ss.android.lark.mail.impl.message.framework.tabcontainer.AbstractC42929a
    /* renamed from: a */
    public void mo153995a(int i) {
        Log.m165389i("MessageListTabAdapter", "testAsynRender testReload onPageLoadDone pageIndex:" + i);
        this.f109357o = true;
        ((C42351b) C42344d.m169091a(C42351b.class, this.f109346d)).mo152462a(0);
        ((C42352c) C42344d.m169091a(C42352c.class, this.f109346d)).mo152462a(0);
        for (final int i2 = 0; i2 < this.f109343a.size(); i2++) {
            if (!this.f109343a.get(i2).mo154348c() && this.f109343a.get(i2).f109705m != null) {
                C43849u.m173827a(new Runnable() {
                    /* class com.ss.android.lark.mail.impl.message.framework.tabcontainer.C42930b.RunnableC429322 */

                    public void run() {
                        Log.m165389i("MessageListTabAdapter", "testAsynRender init 33333" + C42930b.this.f109343a.get(i2));
                        C42930b.this.f109343a.get(i2).mo154350d();
                    }
                }, 500);
                return;
            }
        }
        if (!this.f109344b.mo154013a()) {
            this.f109344b.setScanScroll(true);
        }
    }

    /* renamed from: b */
    public void mo154028b(int i) {
        Log.m165389i("MessageListTabAdapter", "MessageListTabAdapter onPageSelected position :" + i);
        this.f109348f = i;
        for (int i2 = 0; i2 < this.f109345c.size(); i2++) {
            if (i2 == i) {
                this.f109345c.get(i2).mo153785b().mo154048a(true);
                AbsMessageTemplateView c = mo154029c(i2);
                if (c != null) {
                    c.mo154366h();
                }
            } else {
                this.f109345c.get(i2).mo153785b().mo154048a(false);
            }
        }
    }

    /* renamed from: a */
    public void mo154026a(boolean z) {
        for (int i = 0; i < this.f109343a.size(); i++) {
            AbsMessageTemplateView absMessageTemplateView = this.f109343a.get(i);
            if (absMessageTemplateView != null) {
                absMessageTemplateView.mo154329a(z);
            }
        }
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public Object instantiateItem(ViewGroup viewGroup, int i) {
        AbsMessageTemplateView d = m170960d(i);
        if (d == null) {
            Log.m165389i("MessageListTabAdapter", "MessageListTabAdapter testWebview testAsynRender instantiateItem mailMessageListView == null position :" + i);
            int i2 = i + 3;
            destroyItem(viewGroup, i2, (Object) null);
            this.f109349g = i2;
            d = m170960d(i);
        }
        Log.m165389i("MessageListTabAdapter", "MessageListTabAdapter testWebview testAsynRender instantiateItem position :" + i + " absMessageTemplateView:" + d.toString());
        d.f109707o = viewGroup;
        d.f109707o.removeView(d);
        this.f109347e.put(Integer.valueOf(i), d);
        boolean z = true;
        if (this.f109356n) {
            d.setFirstLoad(true);
            this.f109356n = false;
        } else {
            int i3 = this.f109351i;
            if (i3 > 0) {
                this.f109351i = i3 - 1;
                Log.m165389i("MessageListTabAdapter", "testWebview testAsynRender MessageListTabAdapter bindViewData position:" + i);
                this.f109345c.get(i).mo153782a(this.f109354l);
                d.mo154321a(this.f109345c.get(i), z, this.f109355m, this.f109353k);
                viewGroup.addView(d);
                return d;
            }
        }
        z = false;
        Log.m165389i("MessageListTabAdapter", "testWebview testAsynRender MessageListTabAdapter bindViewData position:" + i);
        this.f109345c.get(i).mo153782a(this.f109354l);
        d.mo154321a(this.f109345c.get(i), z, this.f109355m, this.f109353k);
        viewGroup.addView(d);
        return d;
    }

    /* renamed from: a */
    public void mo154024a(int i, float f, int i2) {
        mo154026a(false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo154025a(int i, int i2, Intent intent) {
        AbsMessageTemplateView c = mo154029c(this.f109348f);
        if (c != null) {
            c.mo154311a(i, i2, intent);
        }
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        if (this.f109349g != i) {
            AbsMessageTemplateView c = mo154029c(i);
            if (c != null) {
                c.mo154310a();
                Log.m165389i("MessageListTabAdapter", "MessageListTabAdapter destroyItem position :" + i + " absMessageTemplateView:" + c.toString());
            }
            viewGroup.removeView(c);
            this.f109347e.put(Integer.valueOf(i), null);
            return;
        }
        this.f109349g = -1;
    }

    public C42930b(Activity activity, List<C42844a> list, AbstractC42925b bVar, int i, MailViewPager mailViewPager, AbstractC42924a aVar, int i2, String str) {
        this.f109355m = aVar;
        this.f109353k = i2;
        this.f109345c = list;
        this.f109344b = mailViewPager;
        this.f109354l = str;
        this.f109346d = activity;
        this.f109352j = i;
        if (i < 0) {
            this.f109352j = 0;
        }
        int i3 = this.f109352j;
        this.f109348f = i3;
        this.f109350h = bVar;
        if (i3 == 0 || i3 == list.size() - 1) {
            this.f109351i = 1;
        } else {
            this.f109351i = 2;
        }
        if (this.f109351i < 0) {
            this.f109351i = 0;
        }
        m170959a(this.f109346d);
    }
}
