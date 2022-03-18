package com.ss.android.lark.mm.module.reaction.panel;

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
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mm.p2288b.C45851c;
import java.util.List;

public class MmReactionPanel extends LinearLayout {

    /* renamed from: a */
    public ViewPager f117831a;

    /* renamed from: b */
    public GridView[] f117832b;

    /* renamed from: c */
    private View f117833c;

    /* renamed from: d */
    private LinearLayout f117834d;

    /* renamed from: e */
    private CheckBox[] f117835e;

    /* renamed from: f */
    private int f117836f = 35;

    /* renamed from: g */
    private int f117837g = UIUtils.dp2px(C45851c.m181646a(), 64.0f);

    /* renamed from: h */
    private AbstractC46820b f117838h;

    /* renamed from: i */
    private int f117839i;

    /* renamed from: com.ss.android.lark.mm.module.reaction.panel.MmReactionPanel$a */
    public class C46819a extends PagerAdapter {

        /* renamed from: b */
        private final GridView[] f117850b;

        @Override // androidx.viewpager.widget.PagerAdapter
        public boolean isViewFromObject(View view, Object obj) {
            return view == obj;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public int getCount() {
            return this.f117850b.length;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public int getItemPosition(Object obj) {
            return super.getItemPosition(obj);
        }

        public C46819a(GridView[] gridViewArr) {
            this.f117850b = gridViewArr;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public Object instantiateItem(View view, int i) {
            ((ViewPager) view).addView(this.f117850b[i]);
            return this.f117850b[i];
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public void destroyItem(View view, int i, Object obj) {
            ((ViewPager) view).removeView(this.f117850b[i]);
        }
    }

    /* renamed from: com.ss.android.lark.mm.module.reaction.panel.MmReactionPanel$b */
    public interface AbstractC46820b {
        /* renamed from: a */
        void mo164479a(View view, String str);

        /* renamed from: a */
        void mo164480a(View view, String str, long j, boolean z);

        /* renamed from: a */
        void mo164481a(String str);
    }

    public void setReactionSelectListener(AbstractC46820b bVar) {
        this.f117838h = bVar;
    }

    public void setShowMoreBgColor(int i) {
        this.f117839i = i;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    public void setBackgroundColor(int i) {
        this.f117833c.setBackgroundColor(i);
    }

    public void setPageCount(int i) {
        if (i > 0) {
            this.f117836f = i;
        }
    }

    public MmReactionPanel(Context context) {
        super(context);
        m185501a(context);
    }

    /* renamed from: a */
    private void m185501a(Context context) {
        LayoutInflater.from(context).inflate(R.layout.mm_layout_reaction_display_panel, (ViewGroup) this, true);
        this.f117833c = findViewById(R.id.root);
        this.f117831a = (ViewPager) findViewById(R.id.frag_pager);
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.frag_point);
        this.f117834d = linearLayout;
        linearLayout.setClickable(true);
    }

    /* renamed from: a */
    private void m185500a(int i) {
        GridView gridView = this.f117832b[i];
        if (gridView == null) {
            Log.m165383e("ReactionPanel", "lasgGridView is null, page is:" + i + ", allPageViews size is:" + this.f117832b.length);
            return;
        }
        GridView gridView2 = (GridView) View.inflate(getContext(), R.layout.layout_reaction_detail_panel_gridview, null);
        final List<String> a = ((C46822a) gridView.getAdapter()).mo164498a();
        C46822a aVar = new C46822a(getContext(), gridView2, a, UIUtils.dp2px(getContext(), 42.0f), this.f117838h);
        aVar.mo164499a(this.f117839i);
        gridView2.setAdapter((ListAdapter) aVar);
        gridView2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            /* class com.ss.android.lark.mm.module.reaction.panel.MmReactionPanel.C468174 */

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                MmReactionPanel.this.mo164468a(a, i);
            }
        });
        GridView[] gridViewArr = this.f117832b;
        gridViewArr[0] = gridView2;
        GridView gridView3 = (GridView) View.inflate(getContext(), R.layout.layout_reaction_detail_panel_gridview, null);
        final List<String> a2 = ((C46822a) gridViewArr[1].getAdapter()).mo164498a();
        C46822a aVar2 = new C46822a(getContext(), gridView3, a2, UIUtils.dp2px(getContext(), 42.0f), this.f117838h);
        aVar2.mo164499a(this.f117839i);
        gridView3.setAdapter((ListAdapter) aVar2);
        gridView3.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            /* class com.ss.android.lark.mm.module.reaction.panel.MmReactionPanel.C468185 */

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                MmReactionPanel.this.mo164468a(a2, i);
            }
        });
        this.f117832b[i + 1] = gridView3;
    }

    /* renamed from: a */
    public void mo164468a(List<String> list, int i) {
        if (this.f117838h != null) {
            this.f117838h.mo164481a(list.get(i));
        }
    }

    public MmReactionPanel(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m185501a(context);
    }

    /* renamed from: a */
    public void mo164467a(int i, boolean z) {
        int length = this.f117835e.length;
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
                CheckBox[] checkBoxArr = this.f117835e;
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
    public void mo164469a(List<String> list, final boolean z) {
        int i;
        int i2;
        List<String> list2;
        int i3;
        int i4;
        int size = list.size();
        int i5 = this.f117836f;
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
        this.f117832b = new GridView[i2];
        this.f117835e = new CheckBox[i7];
        for (int i8 = 0; i8 < i7; i8++) {
            int i9 = this.f117836f;
            int i10 = i8 * i9;
            if (i10 + i9 > size) {
                list2 = list;
                i3 = size;
            } else {
                i3 = i9 + i10;
                list2 = list;
            }
            final List<String> subList = list2.subList(i10, i3);
            GridView gridView = (GridView) View.inflate(getContext(), R.layout.layout_reaction_detail_panel_gridview, null);
            C46822a aVar = new C46822a(getContext(), gridView, subList, this.f117837g, this.f117838h);
            aVar.mo164499a(this.f117839i);
            gridView.setAdapter((ListAdapter) aVar);
            gridView.setOnItemClickListener(new OnItemSingleClickListener() {
                /* class com.ss.android.lark.mm.module.reaction.panel.MmReactionPanel.C468141 */

                @Override // com.ss.android.lark.mm.module.reaction.panel.OnItemSingleClickListener
                /* renamed from: a */
                public void mo164475a(AdapterView<?> adapterView, View view, int i, long j) {
                    MmReactionPanel.this.mo164468a(subList, i);
                }
            });
            if (z) {
                this.f117832b[i8 + 1] = gridView;
            } else {
                this.f117832b[i8] = gridView;
            }
            CheckBox checkBox = new CheckBox(getContext());
            checkBox.setBackgroundResource(R.drawable.mm_reaction_face_tip_bg_selector);
            checkBox.setButtonDrawable((Drawable) null);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(UIUtils.dp2px(getContext(), 5.0f), UIUtils.dp2px(getContext(), 5.0f));
            if (i8 != 0) {
                layoutParams.leftMargin = UIUtils.dp2px(getContext(), 4.0f);
            }
            this.f117834d.addView(checkBox, layoutParams);
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
                /* class com.ss.android.lark.mm.module.reaction.panel.MmReactionPanel.View$OnClickListenerC468152 */

                public void onClick(View view) {
                    MmReactionPanel.this.f117831a.setCurrentItem(((Integer) view.getTag()).intValue());
                    ((CheckBox) view).setChecked(true);
                }
            });
            this.f117835e[i8] = checkBox;
        }
        this.f117831a.setAdapter(new C46819a(this.f117832b));
        this.f117831a.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            /* class com.ss.android.lark.mm.module.reaction.panel.MmReactionPanel.C468163 */

            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageScrollStateChanged(int i) {
            }

            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageSelected(int i) {
                MmReactionPanel.this.mo164467a(i, z);
            }

            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageScrolled(int i, float f, int i2) {
                if (!z || f != BitmapDescriptorFactory.HUE_RED) {
                    return;
                }
                if (i == 0) {
                    MmReactionPanel.this.f117831a.setCurrentItem(MmReactionPanel.this.f117832b.length - 2, false);
                } else if (i == MmReactionPanel.this.f117832b.length - 1) {
                    MmReactionPanel.this.f117831a.setCurrentItem(1, false);
                }
            }
        });
        if (z) {
            m185500a(i7);
            this.f117831a.setOffscreenPageLimit((i7 / 2) + 1);
            this.f117831a.setCurrentItem(1);
        }
    }

    public MmReactionPanel(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m185501a(context);
    }
}
