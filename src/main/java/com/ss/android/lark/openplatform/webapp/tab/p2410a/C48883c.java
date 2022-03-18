package com.ss.android.lark.openplatform.webapp.tab.p2410a;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import com.larksuite.suite.R;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.maincore.AbstractC44545b;
import com.ss.android.lark.openplatform.webapp.tab.C48898e;
import com.ss.android.lark.utils.UIHelper;

/* renamed from: com.ss.android.lark.openplatform.webapp.tab.a.c */
public class C48883c implements AbstractC44545b, C48898e.AbstractC48899a {

    /* renamed from: a */
    private Context f122806a;

    /* renamed from: b */
    private AbstractC48889e f122807b;

    /* renamed from: c */
    private ImageView f122808c;

    @Override // com.ss.android.lark.openplatform.webapp.tab.C48898e.AbstractC48899a
    /* renamed from: a */
    public void mo170712a() {
        m192580b();
    }

    @Override // com.ss.android.lark.maincore.AbstractC44545b
    public View getContentView() {
        if (this.f122808c == null) {
            ImageView imageView = new ImageView(this.f122806a);
            this.f122808c = imageView;
            imageView.setOnClickListener(new View.OnClickListener() {
                /* class com.ss.android.lark.openplatform.webapp.tab.p2410a.$$Lambda$c$uoknjA6KNLsR_OJW2IBCaovlHs */

                public final void onClick(View view) {
                    C48883c.m270873lambda$uoknjA6KNLsR_OJW2IBCaovlHs(C48883c.this, view);
                }
            });
        }
        m192580b();
        return this.f122808c;
    }

    /* renamed from: b */
    private void m192580b() {
        AbstractC48889e eVar;
        if (this.f122808c != null && (eVar = this.f122807b) != null) {
            if (eVar.mo170722c()) {
                this.f122808c.setClickable(true);
                this.f122808c.setImageResource(R.drawable.webapp_icon_right_forward);
                this.f122808c.setColorFilter(UIHelper.getColor(R.color.icon_n1));
                return;
            }
            this.f122808c.setClickable(false);
            this.f122808c.setImageResource(R.drawable.webapp_icon_right_forward_disable);
            this.f122808c.setColorFilter(UIHelper.getColor(R.color.transparent));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m192579a(View view) {
        Log.m165389i("ForwardButton", "click forward button");
        this.f122807b.mo170723d();
    }

    public C48883c(Context context, AbstractC48889e eVar) {
        this.f122806a = context;
        this.f122807b = eVar;
    }
}
