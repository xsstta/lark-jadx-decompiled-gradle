package com.ss.android.lark.openplatform.webapp.tab.p2410a;

import android.app.Dialog;
import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.maincore.AbstractC44545b;
import com.ss.android.lark.utils.p2905b.C57810a;
import com.ss.android.lark.utils.p2905b.C57811b;
import com.ss.android.lark.widget.listener.OnSingleClickListener;

/* renamed from: com.ss.android.lark.openplatform.webapp.tab.a.d */
public class C48884d implements AbstractC44545b {

    /* renamed from: a */
    public Context f122809a;

    /* renamed from: b */
    public AbstractC48889e f122810b;

    /* renamed from: c */
    private boolean f122811c;

    @Override // com.ss.android.lark.maincore.AbstractC44545b
    public View getContentView() {
        ImageView imageView = new ImageView(this.f122809a);
        imageView.setOnClickListener(new OnSingleClickListener() {
            /* class com.ss.android.lark.openplatform.webapp.tab.p2410a.C48884d.C488851 */

            @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
            public void onSingleClick(View view) {
                Log.m165383e("MoreButton", "click more");
                C48884d.this.mo170714a();
            }
        });
        imageView.setImageResource(R.drawable.webapp_icon_more_popupwindow);
        return imageView;
    }

    /* renamed from: a */
    public void mo170714a() {
        View view;
        View view2;
        Context context = this.f122809a;
        if (context == null) {
            Log.m165383e("MoreButton", "show webapp popup dialog");
            return;
        }
        View inflate = LayoutInflater.from(context).inflate(R.layout.webapp_title_more_popupwindow, (ViewGroup) null);
        final Dialog a = C57811b.m224342a(this.f122809a, inflate, (int) R.style.customDialog, true);
        C57810a.m224337a(this.f122809a, a, new float[]{12.0f, 49.0f});
        View findViewById = inflate.findViewById(R.id.btn_webapp_refresh);
        findViewById.setOnClickListener(new OnSingleClickListener() {
            /* class com.ss.android.lark.openplatform.webapp.tab.p2410a.C48884d.C488862 */

            @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
            public void onSingleClick(View view) {
                if (C48884d.this.f122810b != null) {
                    a.dismiss();
                    C48884d.this.f122810b.mo170724e();
                }
            }
        });
        AbstractC48889e eVar = this.f122810b;
        if (eVar != null) {
            final String f = eVar.mo170725f();
            final String g = this.f122810b.mo170726g();
            View findViewById2 = inflate.findViewById(R.id.layout_webapp_enter_bot);
            View findViewById3 = inflate.findViewById(R.id.btn_webapp_about);
            View findViewById4 = inflate.findViewById(R.id.btn_webapp_add_common);
            View findViewById5 = inflate.findViewById(R.id.btn_webapp_remove_common);
            if (!TextUtils.isEmpty(f) || !TextUtils.isEmpty(g)) {
                findViewById.setBackgroundResource(R.drawable.webapp_more_popupwindow_press_item_top_bg);
            } else {
                findViewById.setBackgroundResource(R.drawable.webapp_more_popupwindow_press_single_bg);
            }
            if (!TextUtils.isEmpty(f)) {
                if (!TextUtils.isEmpty(g)) {
                    findViewById2.setBackgroundResource(R.drawable.webapp_more_popupwindow_press_item_bg);
                } else {
                    findViewById2.setBackgroundResource(R.drawable.webapp_more_popupwindow_press_item_bottom_bg);
                }
                UIUtils.show(findViewById2);
                findViewById2.setOnClickListener(new OnSingleClickListener() {
                    /* class com.ss.android.lark.openplatform.webapp.tab.p2410a.C48884d.C488873 */

                    @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
                    public void onSingleClick(View view) {
                        Log.m165389i("MoreButton", " webapp click enter bot");
                        a.dismiss();
                        C48884d.this.f122810b.mo170715a(C48884d.this.f122809a, f);
                    }
                });
            } else {
                UIUtils.hide(findViewById2);
            }
            if (!TextUtils.isEmpty(g)) {
                UIUtils.show(findViewById3);
                findViewById3.setOnClickListener(new OnSingleClickListener() {
                    /* class com.ss.android.lark.openplatform.webapp.tab.p2410a.C48884d.C488884 */

                    @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
                    public void onSingleClick(View view) {
                        Log.m165389i("MoreButton", " webapp click enter about activity");
                        a.dismiss();
                        C48884d.this.f122810b.mo170719b(C48884d.this.f122809a, g);
                    }
                });
            } else {
                UIUtils.hide(findViewById3);
            }
            boolean a2 = this.f122810b.mo170717a(g);
            this.f122811c = a2;
            if (a2) {
                view = findViewById5;
            } else {
                view = findViewById4;
            }
            UIUtils.show(view);
            if (this.f122811c) {
                view2 = findViewById4;
            } else {
                view2 = findViewById5;
            }
            UIUtils.hide(view2);
            findViewById4.setOnClickListener(new View.OnClickListener(a) {
                /* class com.ss.android.lark.openplatform.webapp.tab.p2410a.$$Lambda$d$NN3by1fJP4nLz6fuN8FzHdt1eE */
                public final /* synthetic */ Dialog f$1;

                {
                    this.f$1 = r2;
                }

                public final void onClick(View view) {
                    C48884d.m270874lambda$NN3by1fJP4nLz6fuN8FzHdt1eE(C48884d.this, this.f$1, view);
                }
            });
            findViewById5.setOnClickListener(new View.OnClickListener(a) {
                /* class com.ss.android.lark.openplatform.webapp.tab.p2410a.$$Lambda$d$VT3DYz2Llx2JbseeNPynAAhNdDg */
                public final /* synthetic */ Dialog f$1;

                {
                    this.f$1 = r2;
                }

                public final void onClick(View view) {
                    C48884d.lambda$VT3DYz2Llx2JbseeNPynAAhNdDg(C48884d.this, this.f$1, view);
                }
            });
        }
    }

    public C48884d(Context context, AbstractC48889e eVar) {
        this.f122809a = context;
        this.f122810b = eVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m192582a(Dialog dialog, View view) {
        dialog.dismiss();
        AbstractC48889e eVar = this.f122810b;
        if (eVar == null) {
            Log.m165383e("MoreButton", "removeCommon but dependency is null");
        } else {
            eVar.mo170721c(eVar.mo170726g());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m192583b(Dialog dialog, View view) {
        dialog.dismiss();
        AbstractC48889e eVar = this.f122810b;
        if (eVar == null) {
            Log.m165383e("MoreButton", "addCommon but dependency is null");
        } else {
            eVar.mo170720b(eVar.mo170726g());
        }
    }
}
