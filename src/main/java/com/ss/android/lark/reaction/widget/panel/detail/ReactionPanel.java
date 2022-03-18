package com.ss.android.lark.reaction.widget.panel.detail;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.CheckBox;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.reaction.widget.p2560b.C52990a;
import java.util.List;

public class ReactionPanel extends LinearLayout {

    /* renamed from: a */
    public ViewPager f131260a;

    /* renamed from: b */
    public GridView[] f131261b;

    /* renamed from: c */
    public AbstractC53093b f131262c;

    /* renamed from: d */
    private View f131263d;

    /* renamed from: e */
    private LinearLayout f131264e;

    /* renamed from: f */
    private CheckBox[] f131265f;

    /* renamed from: g */
    private int f131266g = 35;

    /* renamed from: h */
    private int f131267h;

    /* renamed from: com.ss.android.lark.reaction.widget.panel.detail.ReactionPanel$a */
    public class C53092a extends PagerAdapter {

        /* renamed from: b */
        private final GridView[] f131278b;

        @Override // androidx.viewpager.widget.PagerAdapter
        public boolean isViewFromObject(View view, Object obj) {
            return view == obj;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public int getCount() {
            return this.f131278b.length;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public int getItemPosition(Object obj) {
            return super.getItemPosition(obj);
        }

        public C53092a(GridView[] gridViewArr) {
            this.f131278b = gridViewArr;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public Object instantiateItem(View view, int i) {
            ((ViewPager) view).addView(this.f131278b[i]);
            return this.f131278b[i];
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public void destroyItem(View view, int i, Object obj) {
            ((ViewPager) view).removeView(this.f131278b[i]);
        }
    }

    /* renamed from: com.ss.android.lark.reaction.widget.panel.detail.ReactionPanel$b */
    public interface AbstractC53093b {
        /* renamed from: a */
        void mo181304a(String str);
    }

    public void setReactionSelectListener(AbstractC53093b bVar) {
        this.f131262c = bVar;
    }

    public void setShowMoreBgColor(int i) {
        this.f131267h = i;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    public void setBackgroundColor(int i) {
        this.f131263d.setBackgroundColor(i);
    }

    public void setPageCount(int i) {
        if (i > 0) {
            this.f131266g = i;
        }
    }

    public ReactionPanel(Context context) {
        super(context);
        m205495a(context);
    }

    /* renamed from: a */
    private void m205495a(Context context) {
        LayoutInflater.from(context).inflate(R.layout.layout_reaction_display_panel, (ViewGroup) this, true);
        this.f131263d = findViewById(R.id.root);
        this.f131260a = (ViewPager) findViewById(R.id.frag_pager);
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.frag_point);
        this.f131264e = linearLayout;
        linearLayout.setClickable(true);
    }

    /* renamed from: a */
    private void m205494a(int i) {
        GridView gridView = this.f131261b[i];
        if (gridView == null) {
            Log.m165383e("ReactionPanel", "lasgGridView is null, page is:" + i + ", allPageViews size is:" + this.f131261b.length);
            return;
        }
        GridView gridView2 = (GridView) View.inflate(getContext(), R.layout.layout_reaction_detail_panel_gridview, null);
        final List<String> a = ((C53094a) gridView.getAdapter()).mo181345a();
        C53094a aVar = new C53094a(getContext(), gridView2, a, C52990a.m205224a(getContext(), 42.0f));
        aVar.mo181346a(this.f131267h);
        gridView2.setAdapter((ListAdapter) aVar);
        gridView2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            /* class com.ss.android.lark.reaction.widget.panel.detail.ReactionPanel.C530904 */

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                if (ReactionPanel.this.f131262c != null) {
                    ReactionPanel.this.f131262c.mo181304a((String) a.get(i));
                }
            }
        });
        GridView[] gridViewArr = this.f131261b;
        gridViewArr[0] = gridView2;
        GridView gridView3 = (GridView) View.inflate(getContext(), R.layout.layout_reaction_detail_panel_gridview, null);
        final List<String> a2 = ((C53094a) gridViewArr[1].getAdapter()).mo181345a();
        C53094a aVar2 = new C53094a(getContext(), gridView3, a2, C52990a.m205224a(getContext(), 42.0f));
        aVar2.mo181346a(this.f131267h);
        gridView3.setAdapter((ListAdapter) aVar2);
        gridView3.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            /* class com.ss.android.lark.reaction.widget.panel.detail.ReactionPanel.C530915 */

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                if (ReactionPanel.this.f131262c != null) {
                    ReactionPanel.this.f131262c.mo181304a((String) a2.get(i));
                }
            }
        });
        this.f131261b[i + 1] = gridView3;
    }

    public ReactionPanel(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m205495a(context);
    }

    /* renamed from: a */
    public void mo181333a(int i, boolean z) {
        int length = this.f131265f.length;
        if (z) {
            if (i == 0) {
                i = length - 1;
            } else if (i == length + 1) {
                i = 0;
            } else {
                i--;
            }
        }
        if (i >= 0 && i < length) {
            int i2 = 0;
            while (true) {
                CheckBox[] checkBoxArr = this.f131265f;
                if (i2 < checkBoxArr.length) {
                    if (i2 != i) {
                        checkBoxArr[i2].setChecked(false);
                    }
                    i2++;
                } else {
                    checkBoxArr[i].setChecked(true);
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    public void mo181334a(List<String> list, final boolean z) {
        int i;
        int i2;
        int i3;
        int i4;
        int size = list.size();
        int i5 = this.f131266g;
        int i6 = size / i5;
        if (size % i5 == 0) {
            i = 0;
        } else {
            i = 1;
        }
        int i7 = i6 + i;
        if (z) {
            i2 = i7 + 2;
        } else {
            i2 = i7;
        }
        this.f131261b = new GridView[i2];
        this.f131265f = new CheckBox[i7];
        for (int i8 = 0; i8 < i7; i8++) {
            int i9 = this.f131266g;
            int i10 = i8 * i9;
            if (i10 + i9 > size) {
                i3 = size;
            } else {
                i3 = i9 + i10;
            }
            final List<String> subList = list.subList(i10, i3);
            GridView gridView = (GridView) View.inflate(getContext(), R.layout.layout_reaction_detail_panel_gridview, null);
            C53094a aVar = new C53094a(getContext(), gridView, subList, C52990a.m205224a(getContext(), 42.0f));
            aVar.mo181346a(this.f131267h);
            gridView.setAdapter((ListAdapter) aVar);
            gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                /* class com.ss.android.lark.reaction.widget.panel.detail.ReactionPanel.C530871 */

                @Override // android.widget.AdapterView.OnItemClickListener
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                    if (ReactionPanel.this.f131262c != null) {
                        ReactionPanel.this.f131262c.mo181304a((String) subList.get(i));
                    }
                }
            });
            if (z) {
                this.f131261b[i8 + 1] = gridView;
            } else {
                this.f131261b[i8] = gridView;
            }
            CheckBox checkBox = new CheckBox(getContext());
            checkBox.setBackgroundResource(R.drawable.reaction_face_tip_bg_selector);
            checkBox.setButtonDrawable((Drawable) null);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(C52990a.m205224a(getContext(), 4.0f), C52990a.m205224a(getContext(), 4.0f));
            if (i8 != 0) {
                layoutParams.leftMargin = C52990a.m205224a(getContext(), 4.0f);
            }
            this.f131264e.addView(checkBox, layoutParams);
            if (i8 == 0) {
                checkBox.setChecked(true);
            }
            if (z) {
                i4 = i8 + 1;
            } else {
                i4 = i8;
            }
            checkBox.setTag(Integer.valueOf(i4));
            checkBox.setOnClickListener(new View.OnClickListener() {
                /* class com.ss.android.lark.reaction.widget.panel.detail.ReactionPanel.View$OnClickListenerC530882 */

                public void onClick(View view) {
                    ReactionPanel.this.f131260a.setCurrentItem(((Integer) view.getTag()).intValue());
                    ((CheckBox) view).setChecked(true);
                }
            });
            this.f131265f[i8] = checkBox;
        }
        this.f131260a.setAdapter(new C53092a(this.f131261b));
        this.f131260a.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            /* class com.ss.android.lark.reaction.widget.panel.detail.ReactionPanel.C530893 */

            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageScrollStateChanged(int i) {
            }

            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageSelected(int i) {
                ReactionPanel.this.mo181333a(i, z);
            }

            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageScrolled(int i, float f, int i2) {
                if (!z || f != BitmapDescriptorFactory.HUE_RED) {
                    return;
                }
                if (i == 0) {
                    ReactionPanel.this.f131260a.setCurrentItem(ReactionPanel.this.f131261b.length - 2, false);
                } else if (i == ReactionPanel.this.f131261b.length - 1) {
                    ReactionPanel.this.f131260a.setCurrentItem(1, false);
                }
            }
        });
        if (z) {
            m205494a(i7);
            this.f131260a.setOffscreenPageLimit((i7 / 2) + 1);
            this.f131260a.setCurrentItem(1);
        }
    }

    public ReactionPanel(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m205495a(context);
    }

    /* renamed from: a */
    public void mo181332a(int i, int i2, int i3, int i4) {
        this.f131260a.setPadding(i, i2, i3, i4);
    }
}
