package com.tt.miniapp.feedback.entrance.image;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.larksuite.suite.R;
import com.tt.miniapphost.util.C67590h;
import java.util.ArrayList;

/* renamed from: com.tt.miniapp.feedback.entrance.image.a */
public class C66145a extends BaseAdapter {

    /* renamed from: a */
    public int f166963a = 9;

    /* renamed from: b */
    public ArrayList<C66152e> f166964b;

    /* renamed from: c */
    public AbstractC66149b f166965c;

    /* renamed from: d */
    private Context f166966d;

    /* renamed from: e */
    private AbstractC66150c f166967e;

    /* renamed from: f */
    private int f166968f;

    /* renamed from: g */
    private int f166969g;

    /* renamed from: h */
    private int f166970h;

    /* renamed from: i */
    private boolean f166971i;

    /* renamed from: com.tt.miniapp.feedback.entrance.image.a$a */
    public static class C66148a {

        /* renamed from: a */
        public ImageView f166976a;

        /* renamed from: b */
        public ImageView f166977b;

        /* renamed from: c */
        public ImageView f166978c;

        /* renamed from: d */
        public ProgressBar f166979d;
    }

    public Object getItem(int i) {
        return null;
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public int getCount() {
        int size = this.f166964b.size();
        int i = this.f166963a;
        if (size >= i) {
            return i;
        }
        return this.f166964b.size() + 1;
    }

    /* renamed from: a */
    public void mo231365a(int i) {
        this.f166963a = i;
    }

    /* renamed from: b */
    public void mo231369b(int i) {
        this.f166968f = i;
    }

    /* renamed from: c */
    public void mo231370c(int i) {
        this.f166969g = i;
    }

    /* renamed from: d */
    public void mo231371d(int i) {
        this.f166970h = i;
    }

    /* renamed from: a */
    public void mo231366a(AbstractC66149b bVar) {
        this.f166965c = bVar;
    }

    /* renamed from: a */
    public void mo231367a(AbstractC66150c cVar) {
        this.f166967e = cVar;
    }

    /* renamed from: e */
    private C66152e m258986e(int i) {
        if (i < 0 || i >= this.f166964b.size()) {
            return null;
        }
        return this.f166964b.get(i);
    }

    /* renamed from: a */
    public void mo231368a(boolean z) {
        this.f166971i = z;
    }

    public C66145a(Context context, ArrayList<C66152e> arrayList) {
        this.f166966d = context;
        this.f166964b = arrayList;
    }

    public View getView(final int i, View view, ViewGroup viewGroup) {
        FrameLayout frameLayout = new FrameLayout(this.f166966d);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        C66148a aVar = new C66148a();
        aVar.f166976a = new ImageView(this.f166966d);
        aVar.f166977b = new ImageView(this.f166966d);
        aVar.f166978c = new ImageView(this.f166966d);
        aVar.f166979d = new ProgressBar(this.f166966d, null, 16842873);
        frameLayout.addView(aVar.f166976a);
        frameLayout.addView(aVar.f166978c);
        frameLayout.addView(aVar.f166977b);
        frameLayout.addView(aVar.f166979d);
        frameLayout.setTag(aVar);
        int i2 = this.f166968f;
        aVar.f166976a.setLayoutParams(new FrameLayout.LayoutParams(i2, i2));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 8388661;
        int a = (int) C67590h.m263065a(this.f166966d, 4.0f);
        layoutParams.setMargins(a, a, a, a);
        aVar.f166977b.setLayoutParams(layoutParams);
        aVar.f166977b.setImageResource(this.f166969g);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(this.f166968f, (int) C67590h.m263065a(this.f166966d, 20.0f));
        layoutParams2.gravity = 48;
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{-2030043136, 0});
        aVar.f166978c.setLayoutParams(layoutParams2);
        aVar.f166978c.setBackground(gradientDrawable);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams((int) C67590h.m263065a(this.f166966d, 26.0f), (int) C67590h.m263065a(this.f166966d, 26.0f));
        layoutParams3.gravity = 17;
        aVar.f166979d.setLayoutParams(layoutParams3);
        aVar.f166979d.setIndeterminateDrawable(this.f166966d.getDrawable(R.drawable.microapp_m_loading_progress));
        aVar.f166979d.setIndeterminate(true);
        C66152e e = m258986e(i);
        if (e != null && e.mo231383c() == 1) {
            aVar.f166979d.setVisibility(0);
            aVar.f166978c.setVisibility(0);
            aVar.f166977b.setVisibility(8);
        } else if (e == null || e.mo231383c() != 2) {
            aVar.f166978c.setVisibility(8);
            aVar.f166977b.setVisibility(8);
            aVar.f166979d.setVisibility(8);
        } else {
            aVar.f166979d.setVisibility(8);
            aVar.f166978c.setVisibility(0);
            if (!this.f166971i || i == this.f166964b.size()) {
                aVar.f166977b.setVisibility(8);
            } else {
                aVar.f166977b.setVisibility(0);
            }
        }
        if (this.f166967e != null) {
            if (e != null && e.mo231383c() == 2) {
                this.f166967e.mo231379a(this.f166966d, this.f166964b.get(i).mo231380a(), aVar.f166976a);
            } else if (e != null && e.mo231383c() == 1) {
                this.f166967e.mo231378a(this.f166966d, (Integer) 2131234563, aVar.f166976a);
            } else if (i == this.f166964b.size()) {
                this.f166967e.mo231378a(this.f166966d, Integer.valueOf(this.f166970h), aVar.f166976a);
            }
        }
        aVar.f166976a.setOnClickListener(new View.OnClickListener() {
            /* class com.tt.miniapp.feedback.entrance.image.C66145a.View$OnClickListenerC661461 */

            public void onClick(View view) {
                if (C66145a.this.f166965c == null) {
                    return;
                }
                if (C66145a.this.f166964b.size() >= C66145a.this.f166963a || i != C66145a.this.f166964b.size()) {
                    C66145a.this.f166965c.mo231308a(C66145a.this.f166964b, i);
                } else {
                    C66145a.this.f166965c.mo231316k();
                }
            }
        });
        aVar.f166977b.setOnClickListener(new View.OnClickListener() {
            /* class com.tt.miniapp.feedback.entrance.image.C66145a.View$OnClickListenerC661472 */

            public void onClick(View view) {
                if (C66145a.this.f166965c != null) {
                    C66145a.this.f166965c.mo231303a(i);
                }
            }
        });
        return frameLayout;
    }
}
