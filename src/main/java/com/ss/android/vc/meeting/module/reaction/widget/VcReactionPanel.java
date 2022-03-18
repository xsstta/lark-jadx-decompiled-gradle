package com.ss.android.vc.meeting.module.reaction.widget;

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
import com.ss.android.vc.common.p3077b.C60700b;
import java.util.List;

public class VcReactionPanel extends LinearLayout {

    /* renamed from: a */
    public ViewPager f158285a;

    /* renamed from: b */
    public GridView[] f158286b;

    /* renamed from: c */
    private View f158287c;

    /* renamed from: d */
    private LinearLayout f158288d;

    /* renamed from: e */
    private CheckBox[] f158289e;

    /* renamed from: f */
    private int f158290f = 35;

    /* renamed from: g */
    private AbstractC62867b f158291g;

    /* renamed from: h */
    private int f158292h;

    /* renamed from: com.ss.android.vc.meeting.module.reaction.widget.VcReactionPanel$a */
    public class C62866a extends PagerAdapter {

        /* renamed from: b */
        private final GridView[] f158303b;

        @Override // androidx.viewpager.widget.PagerAdapter
        public boolean isViewFromObject(View view, Object obj) {
            return view == obj;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public int getCount() {
            return this.f158303b.length;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public int getItemPosition(Object obj) {
            return super.getItemPosition(obj);
        }

        public C62866a(GridView[] gridViewArr) {
            this.f158303b = gridViewArr;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public Object instantiateItem(View view, int i) {
            GridView gridView = this.f158303b[i];
            if (gridView == null) {
                C60700b.m235851b("VcReactionPanel", "[instantiateItem]", "arg1 = " + i + ", listSize = " + this.f158303b.length);
            } else {
                ((ViewPager) view).addView(gridView);
            }
            return this.f158303b[i];
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public void destroyItem(View view, int i, Object obj) {
            ((ViewPager) view).removeView(this.f158303b[i]);
        }
    }

    /* renamed from: com.ss.android.vc.meeting.module.reaction.widget.VcReactionPanel$b */
    public interface AbstractC62867b {
        /* renamed from: a */
        void mo217239a(View view, String str);

        /* renamed from: a */
        void mo217240a(View view, String str, long j, boolean z);

        /* renamed from: a */
        void mo217241a(String str);
    }

    public void setReactionSelectListener(AbstractC62867b bVar) {
        this.f158291g = bVar;
    }

    public void setShowMoreBgColor(int i) {
        this.f158292h = i;
    }

    /* renamed from: a */
    public void mo217227a(Context context) {
        removeAllViews();
        m246070b(context);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    public void setBackgroundColor(int i) {
        this.f158287c.setBackgroundColor(i);
    }

    public void setPageCount(int i) {
        if (i > 0) {
            this.f158290f = i;
        }
    }

    public VcReactionPanel(Context context) {
        super(context);
        m246070b(context);
    }

    /* renamed from: b */
    private void m246070b(Context context) {
        LayoutInflater.from(context).inflate(R.layout.layout_vc_reaction_display_panel, (ViewGroup) this, true);
        this.f158287c = findViewById(R.id.root);
        this.f158285a = (ViewPager) findViewById(R.id.frag_pager);
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.frag_point);
        this.f158288d = linearLayout;
        linearLayout.setClickable(true);
    }

    /* renamed from: a */
    private void m246069a(int i) {
        GridView gridView = this.f158286b[i];
        if (gridView == null) {
            Log.m165383e("VcReactionPanel", "lasgGridView is null, page is:" + i + ", allPageViews size is:" + this.f158286b.length);
            return;
        }
        GridView gridView2 = (GridView) View.inflate(getContext(), R.layout.layout_reaction_detail_panel_gridview, null);
        final List<String> a = ((C62874c) gridView.getAdapter()).mo217255a();
        C62874c cVar = new C62874c(getContext(), gridView2, a, C52990a.m205224a(getContext(), 42.0f), this.f158291g);
        cVar.mo217256a(this.f158292h);
        gridView2.setAdapter((ListAdapter) cVar);
        gridView2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            /* class com.ss.android.vc.meeting.module.reaction.widget.VcReactionPanel.C628644 */

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                VcReactionPanel.this.mo217228a(a, i);
            }
        });
        GridView[] gridViewArr = this.f158286b;
        gridViewArr[0] = gridView2;
        GridView gridView3 = (GridView) View.inflate(getContext(), R.layout.layout_reaction_detail_panel_gridview, null);
        final List<String> a2 = ((C62874c) gridViewArr[1].getAdapter()).mo217255a();
        C62874c cVar2 = new C62874c(getContext(), gridView3, a2, C52990a.m205224a(getContext(), 42.0f), this.f158291g);
        cVar2.mo217256a(this.f158292h);
        gridView3.setAdapter((ListAdapter) cVar2);
        gridView3.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            /* class com.ss.android.vc.meeting.module.reaction.widget.VcReactionPanel.C628655 */

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                VcReactionPanel.this.mo217228a(a2, i);
            }
        });
        this.f158286b[i + 1] = gridView3;
    }

    /* renamed from: a */
    public void mo217228a(List<String> list, int i) {
        if (this.f158291g != null) {
            this.f158291g.mo217241a(list.get(i));
        }
    }

    public VcReactionPanel(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m246070b(context);
    }

    /* renamed from: a */
    public void mo217226a(int i, boolean z) {
        int length = this.f158289e.length;
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
                CheckBox[] checkBoxArr = this.f158289e;
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
    public void mo217229a(List<String> list, final boolean z) {
        int i;
        int i2;
        List<String> list2;
        int i3;
        int i4;
        int size = list.size();
        int i5 = this.f158290f;
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
        this.f158286b = new GridView[i2];
        this.f158289e = new CheckBox[i7];
        for (int i8 = 0; i8 < i7; i8++) {
            int i9 = this.f158290f;
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
            C62874c cVar = new C62874c(getContext(), gridView, subList, C52990a.m205224a(getContext(), 42.0f), this.f158291g);
            cVar.mo217256a(this.f158292h);
            gridView.setAdapter((ListAdapter) cVar);
            gridView.setOnItemClickListener(new OnItemSingleClickListener() {
                /* class com.ss.android.vc.meeting.module.reaction.widget.VcReactionPanel.C628611 */

                @Override // com.ss.android.vc.meeting.module.reaction.widget.OnItemSingleClickListener
                /* renamed from: a */
                public void mo217235a(AdapterView<?> adapterView, View view, int i, long j) {
                    VcReactionPanel.this.mo217228a(subList, i);
                }
            });
            if (z) {
                this.f158286b[i8 + 1] = gridView;
            } else {
                this.f158286b[i8] = gridView;
            }
            CheckBox checkBox = new CheckBox(getContext());
            checkBox.setBackgroundResource(R.drawable.vc_reaction_face_tip_bg_selector);
            checkBox.setButtonDrawable((Drawable) null);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(C52990a.m205224a(getContext(), 5.0f), C52990a.m205224a(getContext(), 5.0f));
            if (i8 != 0) {
                layoutParams.leftMargin = C52990a.m205224a(getContext(), 4.0f);
            }
            this.f158288d.addView(checkBox, layoutParams);
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
                /* class com.ss.android.vc.meeting.module.reaction.widget.VcReactionPanel.View$OnClickListenerC628622 */

                public void onClick(View view) {
                    VcReactionPanel.this.f158285a.setCurrentItem(((Integer) view.getTag()).intValue());
                    ((CheckBox) view).setChecked(true);
                }
            });
            this.f158289e[i8] = checkBox;
        }
        if (z) {
            m246069a(i7);
        }
        this.f158285a.setAdapter(new C62866a(this.f158286b));
        this.f158285a.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            /* class com.ss.android.vc.meeting.module.reaction.widget.VcReactionPanel.C628633 */

            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageScrollStateChanged(int i) {
            }

            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageSelected(int i) {
                VcReactionPanel.this.mo217226a(i, z);
            }

            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageScrolled(int i, float f, int i2) {
                if (!z || f != BitmapDescriptorFactory.HUE_RED) {
                    return;
                }
                if (i == 0) {
                    VcReactionPanel.this.f158285a.setCurrentItem(VcReactionPanel.this.f158286b.length - 2, false);
                } else if (i == VcReactionPanel.this.f158286b.length - 1) {
                    VcReactionPanel.this.f158285a.setCurrentItem(1, false);
                }
            }
        });
        if (z) {
            this.f158285a.setOffscreenPageLimit((i7 / 2) + 1);
            this.f158285a.setCurrentItem(1);
        }
    }

    public VcReactionPanel(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m246070b(context);
    }
}
