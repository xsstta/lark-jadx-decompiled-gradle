package com.ss.android.lark.invitation.v2.feat.member.welcome;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.larksuite.framework.utils.KeyboardUtils;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.invitation.v2.feat.member.welcome.C40513a;
import com.ss.android.lark.invitation.v2.feat.member.welcome.C40526c;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.lark.invitation.v2.feat.member.welcome.b */
public class C40516b<T> {

    /* renamed from: a */
    public ViewPager f102897a;

    /* renamed from: b */
    public LinearLayout f102898b;

    /* renamed from: c */
    public List<RecyclerView> f102899c = new ArrayList();

    /* renamed from: d */
    public List<TabView> f102900d = new ArrayList();

    /* renamed from: e */
    public List<AbstractC40523b> f102901e = new ArrayList();

    /* renamed from: f */
    public C40516b<T>.C40524c f102902f;

    /* renamed from: g */
    public C40513a f102903g;

    /* renamed from: h */
    public int f102904h = -1;

    /* renamed from: i */
    public AbstractC40525d f102905i;

    /* renamed from: j */
    private Activity f102906j;

    /* renamed from: k */
    private View f102907k;

    /* renamed from: l */
    private ImageView f102908l;

    /* renamed from: m */
    private TextView f102909m;

    /* renamed from: n */
    private List<String> f102910n = new ArrayList();

    /* renamed from: o */
    private boolean f102911o = true;

    /* renamed from: p */
    private int f102912p;

    /* renamed from: com.ss.android.lark.invitation.v2.feat.member.welcome.b$b */
    public interface AbstractC40523b {
        String getContent();

        String getKey();

        List<AbstractC40523b> getPickDatas();
    }

    /* renamed from: com.ss.android.lark.invitation.v2.feat.member.welcome.b$d */
    public interface AbstractC40525d {
        /* renamed from: a */
        void mo146572a();

        /* renamed from: a */
        void mo146573a(List<AbstractC40523b> list);
    }

    /* renamed from: com.ss.android.lark.invitation.v2.feat.member.welcome.b$c */
    public class C40524c extends PagerAdapter {
        @Override // androidx.viewpager.widget.PagerAdapter
        public boolean isViewFromObject(View view, Object obj) {
            return view == obj;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public int getCount() {
            return C40516b.this.f102899c.size();
        }

        public C40524c(List<RecyclerView> list) {
            C40516b.this.f102899c = list;
        }

        /* renamed from: a */
        public View instantiateItem(ViewGroup viewGroup, int i) {
            RecyclerView recyclerView = C40516b.this.f102899c.get(i);
            viewGroup.addView(recyclerView);
            return recyclerView;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
            viewGroup.removeView((View) obj);
        }
    }

    /* renamed from: com.ss.android.lark.invitation.v2.feat.member.welcome.b$a */
    public static class C40522a<T> {

        /* renamed from: a */
        private Activity f102920a;

        /* renamed from: b */
        private List<AbstractC40523b> f102921b;

        /* renamed from: c */
        private AbstractC40525d f102922c;

        /* renamed from: d */
        private List<String> f102923d;

        /* renamed from: a */
        public C40516b mo146607a() {
            C40516b bVar = new C40516b();
            bVar.mo146597b(this.f102923d);
            bVar.mo146592a(this.f102920a);
            bVar.mo146596a(this.f102921b);
            bVar.mo146595a(this.f102922c);
            return bVar;
        }

        /* renamed from: a */
        public C40522a mo146604a(Activity activity) {
            this.f102920a = activity;
            return this;
        }

        /* renamed from: b */
        public C40522a mo146608b(List<String> list) {
            this.f102923d = list;
            return this;
        }

        /* renamed from: a */
        public C40522a mo146605a(AbstractC40525d dVar) {
            this.f102922c = dVar;
            return this;
        }

        /* renamed from: a */
        public C40522a mo146606a(List<AbstractC40523b> list) {
            this.f102921b = list;
            return this;
        }
    }

    /* renamed from: a */
    public void mo146595a(AbstractC40525d dVar) {
        this.f102905i = dVar;
    }

    /* renamed from: b */
    public void mo146597b(List<String> list) {
        this.f102910n = list;
    }

    /* renamed from: a */
    private int m160296a(double d) {
        return (int) (((double) this.f102906j.getResources().getDisplayMetrics().heightPixels) * d);
    }

    /* renamed from: b */
    private void m160297b(int i) {
        this.f102912p = m160296a(0.6d);
        int dp2px = UIUtils.dp2px(this.f102906j, 55.0f) * i;
        int i2 = this.f102912p;
        if (dp2px > i2) {
            dp2px = i2;
        }
        this.f102912p = dp2px;
        ViewGroup.LayoutParams layoutParams = this.f102897a.getLayoutParams();
        layoutParams.height = this.f102912p;
        this.f102897a.setLayoutParams(layoutParams);
    }

    /* renamed from: a */
    public void mo146591a(int i) {
        for (int i2 = 0; i2 < this.f102900d.size(); i2++) {
            if (i2 == i) {
                this.f102900d.get(i2).setChosen(true);
            } else {
                this.f102900d.get(i2).setChosen(false);
            }
        }
        this.f102897a.setCurrentItem(i);
    }

    /* renamed from: a */
    public void mo146592a(Activity activity) {
        this.f102906j = activity;
        View inflate = View.inflate(activity, R.layout.inv_multi_item_picker, null);
        this.f102907k = inflate;
        this.f102898b = (LinearLayout) inflate.findViewById(R.id.ll_tab);
        this.f102908l = (ImageView) this.f102907k.findViewById(R.id.iv_close);
        this.f102897a = (ViewPager) this.f102907k.findViewById(R.id.view_pager);
        this.f102909m = (TextView) this.f102907k.findViewById(R.id.tv_title);
        C40516b<T>.C40524c cVar = new C40524c(this.f102899c);
        this.f102902f = cVar;
        this.f102897a.setAdapter(cVar);
        this.f102908l.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.invitation.v2.feat.member.welcome.C40516b.View$OnClickListenerC405171 */

            public void onClick(View view) {
                if (C40516b.this.f102903g != null) {
                    C40516b.this.f102903g.mo146577a();
                }
            }
        });
    }

    /* renamed from: a */
    public void mo146593a(View view) {
        if (KeyboardUtils.isSoftShowing(this.f102906j)) {
            KeyboardUtils.hideKeyboard(this.f102906j);
        }
        if (this.f102903g == null) {
            C40513a a = new C40513a.C40514a().mo146583a(this.f102906j).mo146584a(this.f102907k).mo146581a(-1).mo146587b(-2).mo146585a(true).mo146588b(true).mo146589c(R.style.AnimBottom).mo146582a(this.f102906j, 0.7f).mo146586a();
            this.f102903g = a;
            a.mo146578a(new C40513a.AbstractC40515b() {
                /* class com.ss.android.lark.invitation.v2.feat.member.welcome.C40516b.C405182 */

                @Override // com.ss.android.lark.invitation.v2.feat.member.welcome.C40513a.AbstractC40515b
                /* renamed from: a */
                public void mo146590a() {
                    if (C40516b.this.f102905i != null) {
                        C40516b.this.f102905i.mo146572a();
                    }
                }
            });
        }
        this.f102903g.mo146576a(view, 80, 0, 0);
    }

    /* renamed from: a */
    public void mo146594a(AbstractC40523b bVar) {
        String str;
        if (bVar != null) {
            this.f102904h++;
            final TabView tabView = new TabView(this.f102906j);
            List<String> list = this.f102910n;
            if (list == null || this.f102904h > list.size() - 1) {
                str = bVar.getContent();
            } else {
                str = this.f102910n.get(this.f102904h);
            }
            tabView.f102847a.setText(str);
            this.f102909m.setText(str);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.rightMargin = 20;
            tabView.setLayoutParams(layoutParams);
            this.f102900d.add(tabView);
            this.f102898b.addView(tabView);
            tabView.setOnClickListener(new View.OnClickListener() {
                /* class com.ss.android.lark.invitation.v2.feat.member.welcome.C40516b.View$OnClickListenerC405204 */

                public void onClick(View view) {
                    if (C40516b.this.f102900d.indexOf(tabView) == C40516b.this.f102900d.size() - 2) {
                        int size = C40516b.this.f102900d.size() - 1;
                        C40516b bVar = C40516b.this;
                        bVar.f102904h = bVar.f102900d.indexOf(tabView);
                        C40516b.this.f102900d.remove(size);
                        C40516b.this.f102899c.remove(size);
                        C40516b.this.f102898b.removeViewAt(size);
                        C40516b.this.f102897a.setAdapter(C40516b.this.f102902f);
                        C40516b.this.f102902f.notifyDataSetChanged();
                        C40516b.this.f102901e.remove(C40516b.this.f102904h);
                        C40516b.this.f102897a.setCurrentItem(C40516b.this.f102904h);
                        C40516b bVar2 = C40516b.this;
                        bVar2.mo146591a(bVar2.f102904h);
                    }
                }
            });
            RecyclerView recyclerView = new RecyclerView(this.f102906j);
            recyclerView.setLayoutManager(new LinearLayoutManager(this.f102906j, 1, false));
            recyclerView.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
            C40526c cVar = new C40526c(this.f102906j);
            cVar.mo146613a(bVar.getPickDatas());
            cVar.mo146611a(new C40526c.AbstractC40528a() {
                /* class com.ss.android.lark.invitation.v2.feat.member.welcome.C40516b.C405215 */

                @Override // com.ss.android.lark.invitation.v2.feat.member.welcome.C40526c.AbstractC40528a
                /* renamed from: a */
                public void mo146603a(int i, AbstractC40523b bVar) {
                    C40516b.this.f102901e.add(C40516b.this.f102904h, bVar);
                    if (bVar.getPickDatas() != null) {
                        C40516b.this.mo146594a(bVar);
                    } else if (C40516b.this.f102905i != null) {
                        C40516b.this.f102905i.mo146573a(C40516b.this.f102901e);
                        C40516b.this.f102903g.mo146577a();
                    }
                }
            });
            recyclerView.setAdapter(cVar);
            cVar.notifyDataSetChanged();
            this.f102899c.add(recyclerView);
            this.f102902f.notifyDataSetChanged();
            this.f102897a.setCurrentItem(this.f102904h);
            mo146591a(this.f102904h);
        }
    }

    /* renamed from: a */
    public void mo146596a(final List<AbstractC40523b> list) {
        if (list != null && list.size() != 0) {
            this.f102911o = true;
            if (!(list.get(0) == null || list.get(0).getPickDatas() == null)) {
                this.f102911o = false;
            }
            if (this.f102911o) {
                this.f102909m.setVisibility(0);
                this.f102898b.setVisibility(8);
            } else {
                this.f102909m.setVisibility(8);
                this.f102898b.setVisibility(0);
            }
            this.f102898b.removeAllViews();
            this.f102897a.removeAllViews();
            this.f102900d.clear();
            this.f102899c.clear();
            m160297b(list.size());
            mo146594a(new AbstractC40523b() {
                /* class com.ss.android.lark.invitation.v2.feat.member.welcome.C40516b.C405193 */

                @Override // com.ss.android.lark.invitation.v2.feat.member.welcome.C40516b.AbstractC40523b
                public String getContent() {
                    return "";
                }

                @Override // com.ss.android.lark.invitation.v2.feat.member.welcome.C40516b.AbstractC40523b
                public String getKey() {
                    return "";
                }

                @Override // com.ss.android.lark.invitation.v2.feat.member.welcome.C40516b.AbstractC40523b
                public List<AbstractC40523b> getPickDatas() {
                    return list;
                }
            });
        }
    }
}
