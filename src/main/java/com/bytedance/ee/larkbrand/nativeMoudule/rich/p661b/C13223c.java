package com.bytedance.ee.larkbrand.nativeMoudule.rich.p661b;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.RelativeLayout;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.larkbrand.nativeMoudule.rich.bean.C13233a;
import com.bytedance.ee.larkbrand.nativeMoudule.rich.p661b.C13220b;
import com.bytedance.ee.larkbrand.nativeMoudule.rich.util.C13264d;
import com.larksuite.suite.R;
import java.util.List;

/* renamed from: com.bytedance.ee.larkbrand.nativeMoudule.rich.b.c */
public class C13223c extends RelativeLayout implements C13220b.AbstractC13222a {

    /* renamed from: a */
    public C13220b f35043a;

    /* renamed from: b */
    public AbstractC13227b f35044b;

    /* renamed from: c */
    private ViewPager f35045c;

    /* renamed from: d */
    private GridView[] f35046d;

    /* renamed from: e */
    private List<C13233a> f35047e;

    /* renamed from: com.bytedance.ee.larkbrand.nativeMoudule.rich.b.c$a */
    public class C13226a extends PagerAdapter {

        /* renamed from: b */
        private final GridView[] f35051b;

        @Override // androidx.viewpager.widget.PagerAdapter
        public boolean isViewFromObject(View view, Object obj) {
            return view == obj;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public int getCount() {
            return this.f35051b.length;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public int getItemPosition(Object obj) {
            return super.getItemPosition(obj);
        }

        public C13226a(GridView[] gridViewArr) {
            this.f35051b = gridViewArr;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public Object instantiateItem(View view, int i) {
            ((ViewPager) view).addView(this.f35051b[i], new RelativeLayout.LayoutParams(-1, -2));
            AppBrandLogger.m52828d("emojiviewpager", "add gridview");
            return this.f35051b[i];
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public void destroyItem(View view, int i, Object obj) {
            ((ViewPager) view).removeView(this.f35051b[i]);
        }
    }

    /* renamed from: com.bytedance.ee.larkbrand.nativeMoudule.rich.b.c$b */
    public interface AbstractC13227b {
        /* renamed from: a */
        void mo49363a(C13233a aVar);

        /* renamed from: i */
        void mo49364i();
    }

    /* renamed from: c */
    private GridView m53931c() {
        GridView gridView = new GridView(getContext());
        gridView.setNumColumns(7);
        gridView.setGravity(17);
        gridView.setStretchMode(2);
        return gridView;
    }

    /* renamed from: a */
    private void m53929a() {
        setBackgroundColor(getContext().getResources().getColor(R.color.bg_base));
        this.f35047e = C13229d.m53936a().mo49367b();
        this.f35045c = new C13228c(getContext());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, C13264d.m54034a(getContext(), 170.0f));
        int i = 0;
        layoutParams.setMargins(0, C13264d.m54034a(getContext(), 20.0f), 0, 0);
        this.f35045c.setId(View.generateViewId());
        addView(this.f35045c, layoutParams);
        int size = this.f35047e.size();
        int i2 = size / 21;
        if (size % 21 != 0) {
            i = 1;
        }
        int i3 = i2 + i;
        mo49361b(i3);
        C13220b bVar = new C13220b(getContext());
        this.f35043a = bVar;
        bVar.mo49356a(i3);
        this.f35043a.setClickable(true);
        this.f35043a.setListener(this);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, C13264d.m54034a(getContext(), 10.0f));
        layoutParams2.addRule(3, this.f35045c.getId());
        layoutParams2.addRule(14);
        addView(this.f35043a, layoutParams2);
        m53930b();
    }

    /* renamed from: b */
    private void m53930b() {
        RelativeLayout relativeLayout = new RelativeLayout(getContext());
        relativeLayout.setBackgroundColor(getResources().getColor(R.color.bg_body));
        relativeLayout.setPadding(C13264d.m54034a(getContext(), 20.0f), 0, C13264d.m54034a(getContext(), 20.0f), 0);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, C13264d.m54034a(getContext(), 45.0f));
        layoutParams.addRule(12);
        addView(relativeLayout, layoutParams);
        ImageView imageView = new ImageView(getContext());
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(C13264d.m54034a(getContext(), 25.0f), C13264d.m54034a(getContext(), 25.0f));
        imageView.setImageResource(R.drawable.lark_brand_tab_bottom_emoji);
        layoutParams2.addRule(9);
        layoutParams2.addRule(15);
        relativeLayout.addView(imageView, layoutParams2);
        ImageView imageView2 = new ImageView(getContext());
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(C13264d.m54034a(getContext(), 25.0f), C13264d.m54034a(getContext(), 25.0f));
        imageView2.setImageResource(R.drawable.lark_brand_chat_box_emoji_delete);
        imageView2.setColorFilter(getResources().getColor(R.color.icon_n3));
        layoutParams3.addRule(11);
        layoutParams3.addRule(15);
        relativeLayout.addView(imageView2, layoutParams3);
        imageView2.setOnClickListener(new View.OnClickListener() {
            /* class com.bytedance.ee.larkbrand.nativeMoudule.rich.p661b.C13223c.View$OnClickListenerC132241 */

            public void onClick(View view) {
                if (C13223c.this.f35044b != null) {
                    C13223c.this.f35044b.mo49364i();
                }
            }
        });
        relativeLayout.setClickable(true);
        relativeLayout.setFocusable(true);
    }

    @Override // com.bytedance.ee.larkbrand.nativeMoudule.rich.p661b.C13220b.AbstractC13222a
    /* renamed from: a */
    public void mo49360a(int i) {
        this.f35045c.setCurrentItem(i);
    }

    /* renamed from: com.bytedance.ee.larkbrand.nativeMoudule.rich.b.c$c */
    public class C13228c extends ViewPager {

        /* renamed from: b */
        private int f35053b;

        /* renamed from: c */
        private int f35054c;

        public boolean dispatchTouchEvent(MotionEvent motionEvent) {
            int rawX = (int) motionEvent.getRawX();
            int rawY = (int) motionEvent.getRawY();
            int action = motionEvent.getAction();
            if (action == 0) {
                getParent().requestDisallowInterceptTouchEvent(true);
            } else if (action == 2) {
                if (Math.abs(rawX - this.f35053b) + 0 >= Math.abs(rawY - this.f35054c) + 0) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                } else {
                    getParent().requestDisallowInterceptTouchEvent(false);
                }
                this.f35053b = rawX;
                this.f35054c = rawY;
            }
            return super.dispatchTouchEvent(motionEvent);
        }

        public C13228c(Context context) {
            super(context);
        }
    }

    /* renamed from: b */
    public void mo49361b(int i) {
        int size = this.f35047e.size();
        AppBrandLogger.m52828d("emojiviewpager", "page num=" + i);
        this.f35046d = new GridView[i];
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = i2 * 21;
            int i4 = i3 + 21;
            if (i4 > size) {
                i4 = size;
            }
            List<C13233a> subList = this.f35047e.subList(i3, i4);
            GridView c = m53931c();
            c.setAdapter((ListAdapter) new C13217a(getContext(), c, subList, this.f35044b));
            this.f35046d[i2] = c;
            AppBrandLogger.m52828d("emojiviewpager", "create grid");
        }
        this.f35045c.setAdapter(new C13226a(this.f35046d));
        this.f35045c.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            /* class com.bytedance.ee.larkbrand.nativeMoudule.rich.p661b.C13223c.C132252 */

            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageScrollStateChanged(int i) {
            }

            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageScrolled(int i, float f, int i2) {
            }

            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageSelected(int i) {
                AppBrandLogger.m52828d("emojiviewpager", "onPageSelected index=" + i);
                C13223c.this.f35043a.mo49357b(i);
            }
        });
    }

    public C13223c(Context context, AbstractC13227b bVar) {
        super(context);
        this.f35044b = bVar;
        m53929a();
    }
}
