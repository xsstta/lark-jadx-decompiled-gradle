package com.ss.lark.android.passport.biz.widget.picker;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.larksuite.suite.R;
import com.ss.android.lark.passport.infra.util.C49154ag;
import com.ss.android.lark.passport.infra.util.C49203q;
import com.ss.lark.android.passport.biz.widget.picker.C65326a;
import com.ss.lark.android.passport.biz.widget.picker.C65340c;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.lark.android.passport.biz.widget.picker.b */
public class C65329b<T> {

    /* renamed from: a */
    public ViewPager f164503a;

    /* renamed from: b */
    public LinearLayout f164504b;

    /* renamed from: c */
    public List<RecyclerView> f164505c = new ArrayList();

    /* renamed from: d */
    public final List<TabView> f164506d = new ArrayList();

    /* renamed from: e */
    public final List<AbstractC65337b> f164507e = new ArrayList();

    /* renamed from: f */
    public C65329b<T>.C65338c f164508f;

    /* renamed from: g */
    public C65326a f164509g;

    /* renamed from: h */
    public int f164510h = -1;

    /* renamed from: i */
    public AbstractC65339d f164511i;

    /* renamed from: j */
    private Activity f164512j;

    /* renamed from: k */
    private View f164513k;

    /* renamed from: l */
    private ImageView f164514l;

    /* renamed from: m */
    private TextView f164515m;

    /* renamed from: n */
    private List<String> f164516n = new ArrayList();

    /* renamed from: o */
    private boolean f164517o = true;

    /* renamed from: p */
    private int f164518p;

    /* renamed from: com.ss.lark.android.passport.biz.widget.picker.b$b */
    public interface AbstractC65337b {
        String getContent();

        String getKey();

        List<AbstractC65337b> getPickDatas();
    }

    /* renamed from: com.ss.lark.android.passport.biz.widget.picker.b$d */
    public interface AbstractC65339d {
        /* renamed from: a */
        void mo223629a();

        /* renamed from: a */
        void mo223630a(List<AbstractC65337b> list);
    }

    /* renamed from: com.ss.lark.android.passport.biz.widget.picker.b$c */
    public class C65338c extends PagerAdapter {
        @Override // androidx.viewpager.widget.PagerAdapter
        public boolean isViewFromObject(View view, Object obj) {
            return view == obj;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public int getCount() {
            return C65329b.this.f164505c.size();
        }

        public C65338c(List<RecyclerView> list) {
            C65329b.this.f164505c = list;
        }

        /* renamed from: a */
        public View instantiateItem(ViewGroup viewGroup, int i) {
            RecyclerView recyclerView = C65329b.this.f164505c.get(i);
            viewGroup.addView(recyclerView);
            return recyclerView;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
            viewGroup.removeView((View) obj);
        }
    }

    /* renamed from: com.ss.lark.android.passport.biz.widget.picker.b$a */
    public static class C65336a<T> {

        /* renamed from: a */
        private Activity f164528a;

        /* renamed from: b */
        private List<AbstractC65337b> f164529b;

        /* renamed from: c */
        private AbstractC65339d f164530c;

        /* renamed from: d */
        private List<String> f164531d;

        /* renamed from: a */
        public C65329b mo224750a() {
            C65329b bVar = new C65329b();
            bVar.mo224742b(this.f164531d);
            bVar.mo224737a(this.f164528a);
            bVar.mo224741a(this.f164529b);
            bVar.mo224740a(this.f164530c);
            return bVar;
        }

        /* renamed from: a */
        public C65336a mo224747a(Activity activity) {
            this.f164528a = activity;
            return this;
        }

        /* renamed from: b */
        public C65336a mo224751b(List<String> list) {
            this.f164531d = list;
            return this;
        }

        /* renamed from: a */
        public C65336a mo224748a(AbstractC65339d dVar) {
            this.f164530c = dVar;
            return this;
        }

        /* renamed from: a */
        public C65336a mo224749a(List<AbstractC65337b> list) {
            this.f164529b = list;
            return this;
        }
    }

    /* renamed from: a */
    public void mo224740a(AbstractC65339d dVar) {
        this.f164511i = dVar;
    }

    /* renamed from: b */
    public void mo224742b(List<String> list) {
        this.f164516n = list;
    }

    /* renamed from: a */
    private int m256292a(double d) {
        return (int) (((double) this.f164512j.getResources().getDisplayMetrics().heightPixels) * d);
    }

    /* renamed from: b */
    private void m256293b(int i) {
        this.f164518p = m256292a(0.5d);
        int a = C49154ag.m193828a((Context) this.f164512j, 55.0f) * i;
        int i2 = this.f164518p;
        if (a > i2) {
            a = i2;
        }
        this.f164518p = a;
        ViewGroup.LayoutParams layoutParams = this.f164503a.getLayoutParams();
        layoutParams.height = this.f164518p;
        this.f164503a.setLayoutParams(layoutParams);
    }

    /* renamed from: a */
    public void mo224736a(int i) {
        boolean z;
        for (int i2 = 0; i2 < this.f164506d.size(); i2++) {
            TabView tabView = this.f164506d.get(i2);
            if (i2 == i) {
                z = true;
            } else {
                z = false;
            }
            tabView.setChooseed(z);
        }
        this.f164503a.setCurrentItem(i);
    }

    /* renamed from: a */
    public void mo224737a(Activity activity) {
        this.f164512j = activity;
        View inflate = View.inflate(activity, R.layout.sigin_sdk_picker, null);
        this.f164513k = inflate;
        this.f164504b = (LinearLayout) inflate.findViewById(R.id.ll_tab);
        this.f164514l = (ImageView) this.f164513k.findViewById(R.id.iv_close);
        this.f164503a = (ViewPager) this.f164513k.findViewById(R.id.view_pager);
        this.f164515m = (TextView) this.f164513k.findViewById(R.id.tv_title);
        C65329b<T>.C65338c cVar = new C65338c(this.f164505c);
        this.f164508f = cVar;
        this.f164503a.setAdapter(cVar);
        this.f164514l.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.lark.android.passport.biz.widget.picker.C65329b.View$OnClickListenerC653301 */

            public void onClick(View view) {
                if (C65329b.this.f164509g != null) {
                    C65329b.this.f164509g.mo224722a();
                }
            }
        });
    }

    /* renamed from: a */
    public void mo224738a(final View view) {
        if (C49203q.m193977c(this.f164512j)) {
            C49203q.m193973a((Context) this.f164512j);
        }
        if (this.f164509g == null) {
            C65326a a = new C65326a.C65327a().mo224728a(this.f164512j).mo224729a(this.f164513k).mo224726a(-1).mo224732b(-2).mo224730a(true).mo224733b(true).mo224734c(R.style.AnimBottom).mo224727a(this.f164512j, true).mo224731a();
            this.f164509g = a;
            a.mo224723a(new C65326a.AbstractC65328b() {
                /* class com.ss.lark.android.passport.biz.widget.picker.C65329b.C653312 */

                @Override // com.ss.lark.android.passport.biz.widget.picker.C65326a.AbstractC65328b
                /* renamed from: a */
                public void mo224735a() {
                    if (C65329b.this.f164511i != null) {
                        C65329b.this.f164511i.mo223629a();
                    }
                }
            });
        }
        new Handler().postDelayed(new Runnable() {
            /* class com.ss.lark.android.passport.biz.widget.picker.C65329b.RunnableC653323 */

            public void run() {
                C65329b.this.f164509g.mo224721a(view, 80, 0, 0);
            }
        }, 100);
    }

    /* renamed from: a */
    public void mo224739a(AbstractC65337b bVar) {
        String str;
        if (bVar != null) {
            this.f164510h++;
            final TabView tabView = new TabView(this.f164512j);
            List<String> list = this.f164516n;
            if (list == null || this.f164510h > list.size() - 1) {
                str = bVar.getContent();
            } else {
                str = this.f164516n.get(this.f164510h);
            }
            tabView.f164484a.setText(str);
            this.f164515m.setText(str);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.rightMargin = 20;
            tabView.setLayoutParams(layoutParams);
            this.f164506d.add(tabView);
            this.f164504b.addView(tabView);
            tabView.setOnClickListener(new View.OnClickListener() {
                /* class com.ss.lark.android.passport.biz.widget.picker.C65329b.View$OnClickListenerC653345 */

                public void onClick(View view) {
                    if (C65329b.this.f164506d.indexOf(tabView) == C65329b.this.f164506d.size() - 2) {
                        int size = C65329b.this.f164506d.size() - 1;
                        C65329b bVar = C65329b.this;
                        bVar.f164510h = bVar.f164506d.indexOf(tabView);
                        C65329b.this.f164506d.remove(size);
                        C65329b.this.f164505c.remove(size);
                        C65329b.this.f164504b.removeViewAt(size);
                        C65329b.this.f164503a.setAdapter(C65329b.this.f164508f);
                        C65329b.this.f164508f.notifyDataSetChanged();
                        C65329b.this.f164507e.remove(C65329b.this.f164510h);
                        C65329b.this.f164503a.setCurrentItem(C65329b.this.f164510h);
                        C65329b bVar2 = C65329b.this;
                        bVar2.mo224736a(bVar2.f164510h);
                    }
                }
            });
            RecyclerView recyclerView = new RecyclerView(this.f164512j);
            recyclerView.setLayoutManager(new LinearLayoutManager(this.f164512j, 1, false));
            recyclerView.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
            C65340c cVar = new C65340c(this.f164512j);
            cVar.mo224756a(bVar.getPickDatas());
            cVar.mo224754a(new C65340c.AbstractC65342a() {
                /* class com.ss.lark.android.passport.biz.widget.picker.C65329b.C653356 */

                @Override // com.ss.lark.android.passport.biz.widget.picker.C65340c.AbstractC65342a
                /* renamed from: a */
                public void mo224746a(int i, AbstractC65337b bVar) {
                    C65329b.this.f164507e.add(C65329b.this.f164510h, bVar);
                    if (bVar.getPickDatas() != null) {
                        C65329b.this.mo224739a(bVar);
                    } else if (C65329b.this.f164511i != null) {
                        C65329b.this.f164511i.mo223630a(C65329b.this.f164507e);
                        C65329b.this.f164509g.mo224722a();
                    }
                }
            });
            recyclerView.setAdapter(cVar);
            cVar.notifyDataSetChanged();
            this.f164505c.add(recyclerView);
            this.f164508f.notifyDataSetChanged();
            this.f164503a.setCurrentItem(this.f164510h);
            mo224736a(this.f164510h);
        }
    }

    /* renamed from: a */
    public void mo224741a(final List<AbstractC65337b> list) {
        boolean z;
        if (list != null && list.size() != 0) {
            if (list.get(0) == null || list.get(0).getPickDatas() == null) {
                z = true;
            } else {
                z = false;
            }
            this.f164517o = z;
            if (z) {
                this.f164515m.setVisibility(0);
                this.f164504b.setVisibility(8);
            } else {
                this.f164515m.setVisibility(8);
                this.f164504b.setVisibility(0);
            }
            this.f164504b.removeAllViews();
            this.f164503a.removeAllViews();
            this.f164506d.clear();
            this.f164505c.clear();
            m256293b(list.size());
            mo224739a(new AbstractC65337b() {
                /* class com.ss.lark.android.passport.biz.widget.picker.C65329b.C653334 */

                @Override // com.ss.lark.android.passport.biz.widget.picker.C65329b.AbstractC65337b
                public String getContent() {
                    return "";
                }

                @Override // com.ss.lark.android.passport.biz.widget.picker.C65329b.AbstractC65337b
                public String getKey() {
                    return "";
                }

                @Override // com.ss.lark.android.passport.biz.widget.picker.C65329b.AbstractC65337b
                public List<AbstractC65337b> getPickDatas() {
                    return list;
                }
            });
        }
    }
}
