package com.bytedance.ee.larkbrand.nativeMoudule.rich;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import com.larksuite.suite.R;
import com.tt.miniapphost.host.HostDependManager;

/* renamed from: com.bytedance.ee.larkbrand.nativeMoudule.rich.b */
public class C13213b {

    /* renamed from: a */
    public CheckBox f35019a;

    /* renamed from: b */
    public CheckBox f35020b;

    /* renamed from: c */
    public CheckBox f35021c;

    /* renamed from: d */
    public CheckBox f35022d;

    /* renamed from: e */
    public AbstractC13216a f35023e;

    /* renamed from: f */
    private Context f35024f;

    /* renamed from: g */
    private ImageView f35025g;

    /* renamed from: h */
    private TextView f35026h;

    /* renamed from: i */
    private ImageView f35027i;

    /* renamed from: j */
    private View f35028j;

    /* renamed from: k */
    private View f35029k;

    /* renamed from: com.bytedance.ee.larkbrand.nativeMoudule.rich.b$a */
    public interface AbstractC13216a {
        /* renamed from: a */
        void mo49348a(int i);

        /* renamed from: b */
        void mo49349b();
    }

    /* renamed from: b */
    public View mo49339b() {
        return this.f35029k;
    }

    /* renamed from: a */
    public void mo49333a() {
        View$OnClickListenerC132152 r0 = new View.OnClickListener() {
            /* class com.bytedance.ee.larkbrand.nativeMoudule.rich.C13213b.View$OnClickListenerC132152 */

            public void onClick(View view) {
                if (view == C13213b.this.f35019a) {
                    C13213b.this.mo49340b(1);
                } else if (view == C13213b.this.f35020b) {
                    C13213b.this.mo49340b(2);
                } else if (view == C13213b.this.f35021c) {
                    C13213b.this.mo49340b(3);
                } else if (view == C13213b.this.f35022d) {
                    C13213b.this.mo49340b(4);
                }
            }
        };
        this.f35020b.setOnClickListener(r0);
        this.f35019a.setOnClickListener(r0);
        this.f35021c.setOnClickListener(r0);
        this.f35022d.setOnClickListener(r0);
        this.f35022d.setClickable(false);
    }

    /* renamed from: c */
    private void m53909c() {
        this.f35019a = (CheckBox) this.f35029k.findViewById(R.id.edit_at);
        this.f35021c = (CheckBox) this.f35029k.findViewById(R.id.edit_photo);
        this.f35020b = (CheckBox) this.f35029k.findViewById(R.id.edit_emoji);
        this.f35022d = (CheckBox) this.f35029k.findViewById(R.id.edit_send);
        mo49333a();
    }

    /* renamed from: a */
    public void mo49335a(AbstractC13216a aVar) {
        this.f35023e = aVar;
    }

    /* renamed from: b */
    public void mo49341b(String str) {
        this.f35026h.setText(str);
    }

    /* renamed from: b */
    public void mo49340b(int i) {
        mo49334a(i);
        AbstractC13216a aVar = this.f35023e;
        if (aVar != null) {
            aVar.mo49348a(i);
        }
    }

    /* renamed from: c */
    public void mo49343c(boolean z) {
        int i;
        CheckBox checkBox = this.f35020b;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        checkBox.setVisibility(i);
    }

    /* renamed from: d */
    public void mo49344d(boolean z) {
        int i;
        CheckBox checkBox = this.f35019a;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        checkBox.setVisibility(i);
    }

    /* renamed from: e */
    public void mo49345e(boolean z) {
        int i;
        CheckBox checkBox = this.f35021c;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        checkBox.setVisibility(i);
    }

    /* renamed from: b */
    public void mo49342b(boolean z) {
        this.f35022d.setChecked(z);
        this.f35022d.setClickable(z);
    }

    /* renamed from: a */
    public void mo49334a(int i) {
        boolean z;
        boolean z2;
        CheckBox checkBox = this.f35020b;
        boolean z3 = false;
        if (i == 2) {
            z = true;
        } else {
            z = false;
        }
        checkBox.setChecked(z);
        CheckBox checkBox2 = this.f35019a;
        if (i == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        checkBox2.setChecked(z2);
        CheckBox checkBox3 = this.f35021c;
        if (i == 3) {
            z3 = true;
        }
        checkBox3.setChecked(z3);
    }

    /* renamed from: a */
    public void mo49336a(String str) {
        if (!TextUtils.isEmpty(str)) {
            HostDependManager.getInst().loadImage(this.f35024f, this.f35025g, Uri.parse(str));
        }
    }

    /* renamed from: a */
    public void mo49338a(boolean z) {
        int i;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        this.f35026h.setVisibility(i);
        this.f35027i.setVisibility(i);
    }

    /* renamed from: b */
    private void m53908b(String str, String str2) {
        this.f35028j = this.f35029k.findViewById(R.id.avatar);
        this.f35025g = (ImageView) this.f35029k.findViewById(R.id.avatar_img);
        this.f35026h = (TextView) this.f35029k.findViewById(R.id.avatar_name);
        this.f35027i = (ImageView) this.f35029k.findViewById(R.id.avatar_arrow);
        this.f35028j.setOnClickListener(new View.OnClickListener() {
            /* class com.bytedance.ee.larkbrand.nativeMoudule.rich.C13213b.View$OnClickListenerC132141 */

            public void onClick(View view) {
                if (C13213b.this.f35023e != null) {
                    C13213b.this.f35023e.mo49349b();
                }
            }
        });
        mo49336a(str);
        mo49341b(str2);
    }

    /* renamed from: a */
    public void mo49337a(String str, String str2) {
        this.f35029k = View.inflate(this.f35024f, R.layout.lark_brand_edit_tools_view_ex, null);
        m53909c();
        m53908b(str, str2);
    }

    public C13213b(Context context, String str, String str2) {
        this.f35024f = context;
        mo49337a(str, str2);
    }
}
