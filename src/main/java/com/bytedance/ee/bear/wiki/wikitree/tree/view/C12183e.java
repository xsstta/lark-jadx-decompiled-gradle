package com.bytedance.ee.bear.wiki.wikitree.tree.view;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.ee.bear.facade.common.widget.BearLottieView;
import com.bytedance.ee.bear.facade.common.widget.recyclerview.SwipeMenuLayout;
import com.bytedance.ee.bear.wiki.wikitree.tree.view.AbstractC12174a;
import com.bytedance.ee.util.p718t.C13737d;
import com.bytedance.ee.util.p718t.C13749l;
import com.larksuite.component.ui.p1153e.C25653b;
import com.larksuite.suite.R;

/* renamed from: com.bytedance.ee.bear.wiki.wikitree.tree.view.e */
public class C12183e extends LinearLayout implements AbstractC12174a {

    /* renamed from: c */
    protected View f32786c;

    /* renamed from: d */
    protected LinearLayout f32787d;

    /* renamed from: e */
    protected FrameLayout f32788e;

    /* renamed from: f */
    protected BearLottieView f32789f;

    /* renamed from: g */
    protected ImageView f32790g;

    /* renamed from: h */
    protected LinearLayout f32791h;

    /* renamed from: i */
    protected ImageView f32792i;

    /* renamed from: j */
    protected TextView f32793j;

    /* renamed from: k */
    protected SwipeMenuLayout f32794k;

    /* renamed from: l */
    protected ImageView f32795l;

    /* renamed from: m */
    protected ImageView f32796m;

    /* renamed from: n */
    protected AbstractC12188a f32797n;

    /* renamed from: o */
    protected AbstractC12174a.AbstractC12175a f32798o;

    /* renamed from: p */
    protected AbstractC12174a.AbstractC12176b f32799p;

    /* renamed from: q */
    protected boolean f32800q;

    /* renamed from: r */
    protected boolean f32801r = true;

    /* renamed from: com.bytedance.ee.bear.wiki.wikitree.tree.view.e$a */
    public interface AbstractC12188a {
        void onItemClick(View view);
    }

    /* access modifiers changed from: protected */
    public float getItemHeightInDp() {
        return 50.0f;
    }

    @Override // com.bytedance.ee.bear.wiki.wikitree.tree.view.AbstractC12174a
    /* renamed from: a */
    public void mo46602a() {
        this.f32794k.mo30342a();
    }

    @Override // com.bytedance.ee.bear.wiki.wikitree.tree.view.AbstractC12174a
    /* renamed from: b */
    public void mo46603b() {
        this.f32794k.mo30345b();
    }

    public String getTitle() {
        return this.f32793j.getText().toString();
    }

    /* renamed from: c */
    public void mo46605c() {
        setFocus(false);
        setItemClickListener(null);
        setSwipeMenuClickListener(null);
        setUserSwipeMenuListener(null);
        setSwipeMenuEnable(false);
        setMenuClickEnable(true);
        setItemEnable(true);
    }

    public void setItemClickListener(AbstractC12188a aVar) {
        this.f32797n = aVar;
    }

    public void setSwipeMenuClickListener(AbstractC12174a.AbstractC12175a aVar) {
        this.f32798o = aVar;
    }

    public void setUserSwipeMenuListener(AbstractC12174a.AbstractC12176b bVar) {
        this.f32799p = bVar;
    }

    public void setIcon(int i) {
        this.f32792i.setImageResource(i);
    }

    public void setSwipeMenuEnable(boolean z) {
        this.f32794k.setSwipeEnable(z);
    }

    public C12183e(Context context) {
        super(context);
        mo46604a(context);
    }

    public void setTile(String str) {
        TextView textView = this.f32793j;
        boolean isEmpty = TextUtils.isEmpty(str);
        String str2 = str;
        if (isEmpty) {
            str2 = getResources().getText(R.string.Doc_Wiki_UntitledPage);
        }
        textView.setText(str2);
    }

    public void setFocus(boolean z) {
        this.f32800q = z;
        if (z) {
            this.f32786c.setVisibility(0);
            this.f32793j.setTextColor(getResources().getColor(R.color.ud_C500));
            this.f32793j.setTypeface(Typeface.defaultFromStyle(1));
            this.f32790g.setImageResource(R.drawable.icon_tool_circle_down);
            setBackgroundColor(getResources().getColor(R.color.bg_filler));
            return;
        }
        this.f32786c.setVisibility(8);
        this.f32793j.setTextColor(getResources().getColor(R.color.text_title));
        this.f32793j.setTypeface(Typeface.defaultFromStyle(0));
        this.f32790g.setImageResource(R.drawable.icon_tool_circle_nor);
        setBackgroundColor(getResources().getColor(R.color.bg_body));
    }

    public void setItemEnable(boolean z) {
        this.f32801r = z;
        if (z) {
            this.f32793j.setTextColor(getResources().getColor(R.color.text_title));
            this.f32792i.setImageTintList(null);
            this.f32790g.setImageTintList(null);
            return;
        }
        this.f32793j.setTextColor(getResources().getColor(R.color.text_disable));
        this.f32792i.setImageTintList(ColorStateList.valueOf(getResources().getColor(R.color.icon_disable)));
        this.f32790g.setImageTintList(ColorStateList.valueOf(getResources().getColor(R.color.icon_disable)));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo46604a(Context context) {
        setLayoutParams(new ViewGroup.LayoutParams(-1, C13749l.m55737a(getItemHeightInDp())));
        setOrientation(1);
        LayoutInflater.from(context).inflate(R.layout.wiki_tree_item, this);
        this.f32786c = findViewById(R.id.focus);
        this.f32788e = (FrameLayout) findViewById(R.id.header);
        this.f32787d = (LinearLayout) findViewById(R.id.container);
        this.f32789f = (BearLottieView) findViewById(R.id.loading);
        this.f32790g = (ImageView) findViewById(R.id.indicator);
        this.f32791h = (LinearLayout) findViewById(R.id.content);
        this.f32792i = (ImageView) findViewById(R.id.icon);
        this.f32793j = (TextView) findViewById(R.id.title);
        this.f32794k = (SwipeMenuLayout) findViewById(R.id.swipe_menu_layout);
        this.f32795l = (ImageView) findViewById(R.id.swipe_menu_more);
        this.f32796m = (ImageView) findViewById(R.id.swipe_menu_add);
        setFocus(false);
        this.f32795l.setVisibility(8);
        this.f32789f.setVisibility(8);
        this.f32794k.setSwipeEnable(false);
        this.f32791h.setOnClickListener(new View.OnClickListener() {
            /* class com.bytedance.ee.bear.wiki.wikitree.tree.view.C12183e.View$OnClickListenerC121841 */

            public void onClick(View view) {
                if (C13737d.m55693a(500) && C12183e.this.f32797n != null) {
                    C12183e.this.f32797n.onItemClick(C12183e.this);
                }
            }
        });
        this.f32795l.setOnClickListener(new View.OnClickListener() {
            /* class com.bytedance.ee.bear.wiki.wikitree.tree.view.C12183e.View$OnClickListenerC121852 */

            public void onClick(View view) {
                if (C12183e.this.f32798o != null) {
                    C12183e.this.f32798o.onMenuItemClick(view.getId(), view);
                }
            }
        });
        this.f32796m.setOnClickListener(new View.OnClickListener() {
            /* class com.bytedance.ee.bear.wiki.wikitree.tree.view.C12183e.View$OnClickListenerC121863 */

            public void onClick(View view) {
                if (C12183e.this.f32798o != null) {
                    C12183e.this.f32798o.onMenuItemClick(view.getId(), view);
                }
            }
        });
        this.f32794k.setOnUserSwipeMenuListener(new SwipeMenuLayout.AbstractC7740b() {
            /* class com.bytedance.ee.bear.wiki.wikitree.tree.view.C12183e.C121874 */

            @Override // com.bytedance.ee.bear.facade.common.widget.recyclerview.SwipeMenuLayout.AbstractC7740b
            public void onSwipe(SwipeMenuLayout swipeMenuLayout, boolean z) {
                if (C12183e.this.f32799p != null) {
                    C12183e.this.f32799p.onUserSwipeMenu(swipeMenuLayout, z);
                }
            }
        });
    }

    public void setMenuClickEnable(boolean z) {
        if (z) {
            int color = getResources().getColor(R.color.static_white);
            this.f32795l.setImageTintList(ColorStateList.valueOf(color));
            this.f32795l.setBackgroundColor(getResources().getColor(R.color.icon_n3));
            this.f32795l.setClickable(true);
            this.f32796m.setImageTintList(ColorStateList.valueOf(color));
            this.f32796m.setBackgroundColor(getResources().getColor(R.color.ud_I500));
            this.f32796m.setClickable(true);
            return;
        }
        int a = C25653b.m91893a(getResources().getColor(R.color.static_white), 0.5f);
        this.f32795l.setImageTintList(ColorStateList.valueOf(a));
        this.f32795l.setBackgroundColor(getResources().getColor(R.color.icon_disable));
        this.f32795l.setClickable(false);
        this.f32796m.setImageTintList(ColorStateList.valueOf(a));
        this.f32796m.setBackgroundColor(getResources().getColor(R.color.ud_I300));
        this.f32796m.setClickable(false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo46615a(View view, boolean z) {
        if (z) {
            view.setVisibility(0);
        } else {
            view.setVisibility(8);
        }
    }

    /* renamed from: a */
    public void mo46612a(int i, boolean z) {
        if (i == R.id.swipe_menu_more) {
            mo46615a(this.f32795l, z);
        } else if (i == R.id.swipe_menu_add) {
            mo46615a(this.f32796m, z);
        }
    }

    /* renamed from: a */
    public void mo46614a(int i, int i2) {
        int i3;
        if (i > 0) {
            if (i2 <= 8) {
                i3 = i * 21;
            } else {
                int i4 = 21 - ((i2 - 8) * 3);
                if (i4 < 6) {
                    i4 = 6;
                }
                i3 = ((i - 1) * i4) + 21;
            }
            this.f32788e.setPadding(C13749l.m55738a(i3), 0, 0, 0);
        }
    }
}
