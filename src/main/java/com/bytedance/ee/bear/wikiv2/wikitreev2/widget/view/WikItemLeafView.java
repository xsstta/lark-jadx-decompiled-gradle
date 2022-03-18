package com.bytedance.ee.bear.wikiv2.wikitreev2.widget.view;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.ee.bear.facade.common.widget.BearLottieView;
import com.bytedance.ee.bear.facade.common.widget.recyclerview.SwipeMenuLayout;
import com.bytedance.ee.bear.wikiv2.wikitreev2.widget.view.AbstractC12562a;
import com.bytedance.ee.util.p718t.C13737d;
import com.bytedance.ee.util.p718t.C13747j;
import com.bytedance.ee.util.p718t.C13749l;
import com.larksuite.component.ui.p1153e.C25653b;
import com.larksuite.suite.R;

public class WikItemLeafView extends LinearLayout implements AbstractC12562a {

    /* renamed from: c */
    protected View f33541c;

    /* renamed from: d */
    protected LinearLayout f33542d;

    /* renamed from: e */
    protected FrameLayout f33543e;

    /* renamed from: f */
    protected BearLottieView f33544f;

    /* renamed from: g */
    protected ImageView f33545g;

    /* renamed from: h */
    protected LinearLayout f33546h;

    /* renamed from: i */
    protected ImageView f33547i;

    /* renamed from: j */
    protected TextView f33548j;

    /* renamed from: k */
    protected SwipeMenuLayout f33549k;

    /* renamed from: l */
    protected ImageView f33550l;

    /* renamed from: m */
    protected ImageView f33551m;

    /* renamed from: n */
    protected AbstractC12517a f33552n;

    /* renamed from: o */
    protected AbstractC12562a.AbstractC12563a f33553o;

    /* renamed from: p */
    protected AbstractC12562a.AbstractC12564b f33554p;

    /* renamed from: q */
    protected boolean f33555q;

    /* renamed from: r */
    protected boolean f33556r = true;

    /* renamed from: com.bytedance.ee.bear.wikiv2.wikitreev2.widget.view.WikItemLeafView$a */
    public interface AbstractC12517a {
        void onItemClick(View view);
    }

    /* access modifiers changed from: protected */
    public float getItemHeightInDp() {
        return 50.0f;
    }

    @Override // com.bytedance.ee.bear.wikiv2.wikitreev2.widget.view.AbstractC12562a
    /* renamed from: a */
    public void mo47667a() {
        this.f33549k.mo30342a();
    }

    @Override // com.bytedance.ee.bear.wikiv2.wikitreev2.widget.view.AbstractC12562a
    /* renamed from: b */
    public void mo47670b() {
        this.f33549k.mo30345b();
    }

    public String getTitle() {
        return this.f33548j.getText().toString();
    }

    /* renamed from: f */
    public void mo47658f() {
        setFocus(false);
        setSwipeMenuEnable(false);
        setMenuClickEnable(false);
        setItemEnable(false);
        setItemClickListener(null);
    }

    /* renamed from: e */
    public void mo47657e() {
        setFocus(false);
        setItemClickListener(null);
        setSwipeMenuClickListener(null);
        setUserSwipeMenuListener(null);
        setSwipeMenuEnable(false);
        setMenuClickEnable(true);
        setItemEnable(true);
        mo47665a(R.id.swipe_menu_more, true);
        mo47665a(R.id.swipe_menu_add, true);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo47655c() {
        setLayoutParams(new ViewGroup.LayoutParams(-1, C13749l.m55737a(getItemHeightInDp())));
        setOrientation(1);
        LayoutInflater.from(getContext()).inflate(R.layout.wiki_tree_item_v2, this);
        this.f33541c = findViewById(R.id.focus);
        this.f33543e = (FrameLayout) findViewById(R.id.header);
        this.f33542d = (LinearLayout) findViewById(R.id.container);
        this.f33544f = (BearLottieView) findViewById(R.id.loading);
        this.f33545g = (ImageView) findViewById(R.id.indicator);
        this.f33546h = (LinearLayout) findViewById(R.id.content);
        this.f33547i = (ImageView) findViewById(R.id.icon);
        this.f33548j = (TextView) findViewById(R.id.title);
        this.f33549k = (SwipeMenuLayout) findViewById(R.id.swipe_menu_layout);
        this.f33550l = (ImageView) findViewById(R.id.swipe_menu_more);
        this.f33551m = (ImageView) findViewById(R.id.swipe_menu_add);
        setFocus(false);
        this.f33544f.setVisibility(8);
        this.f33549k.setSwipeEnable(false);
        this.f33546h.setOnClickListener(new View.OnClickListener() {
            /* class com.bytedance.ee.bear.wikiv2.wikitreev2.widget.view.WikItemLeafView.View$OnClickListenerC125131 */

            public void onClick(View view) {
                if (C13737d.m55693a(500) && WikItemLeafView.this.f33552n != null) {
                    WikItemLeafView.this.f33552n.onItemClick(WikItemLeafView.this);
                }
            }
        });
        this.f33550l.setOnClickListener(new View.OnClickListener() {
            /* class com.bytedance.ee.bear.wikiv2.wikitreev2.widget.view.WikItemLeafView.View$OnClickListenerC125142 */

            public void onClick(View view) {
                if (WikItemLeafView.this.f33553o != null) {
                    WikItemLeafView.this.f33553o.mo47790a(view.getId(), view);
                }
            }
        });
        this.f33551m.setOnClickListener(new View.OnClickListener() {
            /* class com.bytedance.ee.bear.wikiv2.wikitreev2.widget.view.WikItemLeafView.View$OnClickListenerC125153 */

            public void onClick(View view) {
                if (WikItemLeafView.this.f33553o != null) {
                    WikItemLeafView.this.f33553o.mo47790a(view.getId(), view);
                }
            }
        });
        this.f33549k.setOnUserSwipeMenuListener(new SwipeMenuLayout.AbstractC7740b() {
            /* class com.bytedance.ee.bear.wikiv2.wikitreev2.widget.view.WikItemLeafView.C125164 */

            @Override // com.bytedance.ee.bear.facade.common.widget.recyclerview.SwipeMenuLayout.AbstractC7740b
            public void onSwipe(SwipeMenuLayout swipeMenuLayout, boolean z) {
                if (WikItemLeafView.this.f33554p != null) {
                    WikItemLeafView.this.f33554p.mo47791a(swipeMenuLayout, z);
                }
            }
        });
    }

    public void setItemClickListener(AbstractC12517a aVar) {
        this.f33552n = aVar;
    }

    public void setSwipeMenuClickListener(AbstractC12562a.AbstractC12563a aVar) {
        this.f33553o = aVar;
    }

    public void setUserSwipeMenuListener(AbstractC12562a.AbstractC12564b bVar) {
        this.f33554p = bVar;
    }

    public void setIconPadding(int i) {
        this.f33547i.setPadding(i, i, i, i);
    }

    public void setSwipeMenuEnable(boolean z) {
        this.f33549k.setSwipeEnable(z);
    }

    public void setTitleStyle(Typeface typeface) {
        this.f33548j.setTypeface(typeface);
    }

    public WikItemLeafView(Context context) {
        super(context);
        mo47655c();
    }

    public void setMenuClickEnable(boolean z) {
        mo47672b(R.id.swipe_menu_more, z);
        mo47672b(R.id.swipe_menu_add, z);
    }

    public void setTile(String str) {
        TextView textView = this.f33548j;
        boolean isEmpty = TextUtils.isEmpty(str);
        String str2 = str;
        if (isEmpty) {
            str2 = getResources().getText(R.string.Doc_Wiki_UntitledPage);
        }
        textView.setText(str2);
    }

    public void setFocus(boolean z) {
        this.f33555q = z;
        if (z) {
            this.f33541c.setVisibility(0);
            this.f33548j.setTextColor(getResources().getColor(R.color.ud_C500));
            this.f33548j.setTypeface(Typeface.defaultFromStyle(1));
            this.f33545g.setImageResource(R.drawable.icon_tool_circle_nor_v2);
            C13747j.m55728a(this.f33545g, (int) R.color.ud_C500);
            setBackgroundColor(getResources().getColor(R.color.bg_filler));
            return;
        }
        this.f33541c.setVisibility(8);
        this.f33548j.setTextColor(getResources().getColor(R.color.text_title));
        this.f33548j.setTypeface(Typeface.defaultFromStyle(0));
        this.f33545g.setImageResource(R.drawable.icon_tool_circle_nor_v2);
        C13747j.m55728a(this.f33545g, (int) R.color.icon_n2);
        setBackgroundColor(getResources().getColor(R.color.bg_body));
    }

    public void setItemEnable(boolean z) {
        this.f33556r = z;
        if (z) {
            this.f33548j.setTextColor(getResources().getColor(R.color.text_title));
            this.f33547i.setImageTintList(null);
            this.f33545g.setImageTintList(null);
            return;
        }
        this.f33548j.setTextColor(getResources().getColor(R.color.text_disable));
        this.f33547i.setImageTintList(ColorStateList.valueOf(getResources().getColor(R.color.icon_disable)));
        this.f33545g.setImageTintList(ColorStateList.valueOf(getResources().getColor(R.color.icon_disable)));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo47669a(View view, boolean z) {
        if (z) {
            view.setVisibility(0);
        } else {
            view.setVisibility(8);
        }
    }

    public WikItemLeafView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo47655c();
    }

    /* renamed from: a */
    public void mo47665a(int i, boolean z) {
        if (i == R.id.swipe_menu_more) {
            mo47669a(this.f33550l, z);
        } else if (i == R.id.swipe_menu_add) {
            mo47669a(this.f33551m, z);
        }
    }

    /* renamed from: b */
    public void mo47671b(int i, int i2) {
        this.f33547i.setImageResource(i);
        if (i2 == 0) {
            this.f33547i.setImageTintList(null);
        } else {
            C13747j.m55728a(this.f33547i, i2);
        }
    }

    /* renamed from: a */
    public void mo47668a(int i, int i2) {
        int i3;
        if (i > 0) {
            if (i2 <= 8) {
                i3 = i * 24;
            } else {
                int i4 = 24 - ((i2 - 8) * 3);
                if (i4 < 6) {
                    i4 = 6;
                }
                i3 = ((i - 1) * i4) + 24;
            }
            this.f33543e.setPadding(C13749l.m55738a(i3 + 23), 0, 0, 0);
        }
    }

    /* renamed from: b */
    public void mo47672b(int i, boolean z) {
        int color = getResources().getColor(R.color.static_white);
        if (i == R.id.swipe_menu_more) {
            if (z) {
                this.f33550l.setImageTintList(ColorStateList.valueOf(color));
                this.f33550l.setBackgroundColor(getResources().getColor(R.color.icon_n3));
                this.f33550l.setClickable(true);
                return;
            }
            this.f33550l.setImageTintList(ColorStateList.valueOf(C25653b.m91893a(color, 0.5f)));
            this.f33550l.setBackgroundColor(getResources().getColor(R.color.icon_disable));
            this.f33550l.setClickable(false);
        } else if (i != R.id.swipe_menu_add) {
        } else {
            if (z) {
                this.f33551m.setImageTintList(ColorStateList.valueOf(color));
                this.f33551m.setBackgroundColor(getResources().getColor(R.color.ud_I500));
                this.f33551m.setClickable(true);
                return;
            }
            this.f33551m.setImageTintList(ColorStateList.valueOf(C25653b.m91893a(color, 0.5f)));
            this.f33551m.setBackgroundColor(getResources().getColor(R.color.ud_I300));
            this.f33551m.setClickable(false);
        }
    }
}
