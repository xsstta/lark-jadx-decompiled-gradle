package com.bytedance.ee.larkbrand.nativeMoudule.rich;

import android.content.Context;
import android.view.View;
import android.widget.RelativeLayout;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.bytedance.ee.larkbrand.nativeMoudule.rich.util.C13256a;
import com.bytedance.ee.larkbrand.nativeMoudule.rich.util.C13264d;
import com.larksuite.suite.R;

/* renamed from: com.bytedance.ee.larkbrand.nativeMoudule.rich.a */
public class C13208a extends RelativeLayout {

    /* renamed from: a */
    public AbstractC13211a f35007a;

    /* renamed from: b */
    private C13240e f35008b;

    /* renamed from: c */
    private RelativeLayout f35009c;

    /* renamed from: d */
    private C13256a f35010d;

    /* renamed from: e */
    private IAppContext f35011e;

    /* renamed from: com.bytedance.ee.larkbrand.nativeMoudule.rich.a$a */
    public interface AbstractC13211a {
        /* renamed from: a */
        void mo49327a();
    }

    public C13256a getAttach() {
        return this.f35010d;
    }

    public C13240e getEdit() {
        return this.f35008b;
    }

    /* renamed from: a */
    private void m53898a() {
        setBackgroundColor(getContext().getResources().getColor(R.color.ud_N300));
        m53899b();
        m53900c();
        m53901d();
    }

    /* renamed from: b */
    private void m53899b() {
        RelativeLayout relativeLayout = new RelativeLayout(getContext());
        this.f35009c = relativeLayout;
        relativeLayout.setId(View.generateViewId());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(C13264d.f35134h, C13264d.f35134h, 0, 0);
        this.f35009c.setBackgroundColor(getResources().getColor(R.color.bg_body));
        addView(this.f35009c, layoutParams);
    }

    /* renamed from: d */
    private void m53901d() {
        this.f35010d = new C13256a(getContext(), this.f35011e);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(C13264d.f35127a, C13264d.f35127a);
        layoutParams.setMargins(C13264d.f35134h, 0, C13264d.f35134h, 0);
        layoutParams.addRule(15);
        layoutParams.addRule(1, this.f35008b.getId());
        this.f35009c.addView(this.f35010d, layoutParams);
    }

    /* renamed from: c */
    private void m53900c() {
        C13240e eVar = new C13240e(getContext());
        this.f35008b = eVar;
        eVar.setId(View.generateViewId());
        this.f35008b.setMaxLines(6);
        this.f35008b.setMinHeight(1);
        this.f35008b.setMinimumHeight(1);
        this.f35008b.setTextSize(2, 16.0f);
        this.f35008b.setTextColor(getContext().getResources().getColor(R.color.text_title));
        this.f35008b.setHintTextColor(getContext().getResources().getColor(R.color.text_placeholder));
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(C13264d.f35135i, -2);
        this.f35008b.setBackground(null);
        this.f35008b.setOnClickListener(new View.OnClickListener() {
            /* class com.bytedance.ee.larkbrand.nativeMoudule.rich.C13208a.View$OnClickListenerC132091 */

            public void onClick(View view) {
                if (C13208a.this.f35007a != null) {
                    C13208a.this.f35007a.mo49327a();
                }
            }
        });
        this.f35008b.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            /* class com.bytedance.ee.larkbrand.nativeMoudule.rich.C13208a.View$OnFocusChangeListenerC132102 */

            public void onFocusChange(View view, boolean z) {
                if (z && C13208a.this.f35007a != null) {
                    C13208a.this.f35007a.mo49327a();
                }
            }
        });
        this.f35008b.setGravity(48);
        this.f35009c.addView(this.f35008b, layoutParams);
    }

    /* renamed from: a */
    public void mo49321a(String str) {
        this.f35008b.setHint(str);
    }

    public void setListener(C13243f fVar) {
        this.f35007a = fVar;
        this.f35008b.setListener(fVar);
    }

    public C13208a(Context context, IAppContext iAppContext) {
        super(context);
        this.f35011e = iAppContext;
        m53898a();
    }
}
