package com.ss.android.lark.openplatform.webapp.tab.p2410a;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import com.larksuite.suite.R;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.maincore.AbstractC44545b;
import com.ss.android.lark.openplatform.webapp.tab.C48898e;
import com.ss.android.lark.utils.UIHelper;

/* renamed from: com.ss.android.lark.openplatform.webapp.tab.a.a */
public class C48881a implements AbstractC44545b, C48898e.AbstractC48899a {

    /* renamed from: a */
    private Context f122800a;

    /* renamed from: b */
    private AbstractC48889e f122801b;

    /* renamed from: c */
    private ImageView f122802c;

    @Override // com.ss.android.lark.openplatform.webapp.tab.C48898e.AbstractC48899a
    /* renamed from: a */
    public void mo170712a() {
        m192569b();
    }

    @Override // com.ss.android.lark.maincore.AbstractC44545b
    public View getContentView() {
        if (this.f122802c == null) {
            ImageView imageView = new ImageView(this.f122800a);
            this.f122802c = imageView;
            imageView.setOnClickListener(new View.OnClickListener() {
                /* class com.ss.android.lark.openplatform.webapp.tab.p2410a.$$Lambda$a$5Ru26BM7elq32fOhvgqpwNnvxhk */

                public final void onClick(View view) {
                    C48881a.lambda$5Ru26BM7elq32fOhvgqpwNnvxhk(C48881a.this, view);
                }
            });
        }
        m192569b();
        return this.f122802c;
    }

    /* renamed from: b */
    private void m192569b() {
        AbstractC48889e eVar;
        if (this.f122802c != null && (eVar = this.f122801b) != null) {
            if (eVar.mo170716a()) {
                this.f122802c.setClickable(true);
                this.f122802c.setImageResource(R.drawable.webapp_icon_left_back);
                this.f122802c.setColorFilter(UIHelper.getColor(R.color.icon_n1));
                return;
            }
            this.f122802c.setClickable(false);
            this.f122802c.setImageResource(R.drawable.webapp_icon_left_back_disable);
            this.f122802c.setColorFilter(UIHelper.getColor(R.color.transparent));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m192568a(View view) {
        Log.m165379d("BackButton", "click back button");
        this.f122801b.mo170718b();
    }

    public C48881a(Context context, AbstractC48889e eVar) {
        this.f122800a = context;
        this.f122801b = eVar;
    }
}
