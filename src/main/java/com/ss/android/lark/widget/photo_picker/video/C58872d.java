package com.ss.android.lark.widget.photo_picker.video;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.larksuite.component.ui.p1153e.C25653b;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.player.p2511a.AbstractC52092k;
import com.ss.android.lark.player.p2511a.AbstractView$OnAttachStateChangeListenerC52070a;
import com.ss.android.lark.widget.DonutProgress;
import com.ss.android.lark.widget.photo_picker.p2951f.C58650b;

/* renamed from: com.ss.android.lark.widget.photo_picker.video.d */
public class C58872d extends AbstractView$OnAttachStateChangeListenerC52070a {

    /* renamed from: a */
    private View f145642a;

    /* renamed from: b */
    private View f145643b;

    /* renamed from: c */
    private DonutProgress f145644c;

    /* renamed from: d */
    private boolean f145645d;

    /* renamed from: e */
    private Context f145646e;

    /* renamed from: f */
    private C58650b f145647f = new C58650b();

    /* renamed from: c */
    public void mo199487c() {
        m228376m();
        mo178440d(-66018, null);
    }

    /* renamed from: d */
    public void mo199488d() {
        m228376m();
        mo178440d(-66018, null);
    }

    /* renamed from: m */
    private void m228376m() {
        this.f145645d = false;
        this.f145644c.setVisibility(8);
        this.f145643b.setVisibility(0);
        mo178425b(8);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.player.p2511a.AbstractView$OnAttachStateChangeListenerC52070a
    /* renamed from: b */
    public void mo127043b() {
        AbstractC52092k j = mo178441j();
        this.f145644c.setShowText(false);
        this.f145644c.setFinishedStrokeColor(UIUtils.getColor(this.f145646e, R.color.lkui_N00));
        this.f145644c.setUnfinishedStrokeColor(C25653b.m91894a(this.f145646e, R.color.lkui_N00, 0.5f));
        float dp2px = (float) UIUtils.dp2px(this.f145646e, 2.0f);
        this.f145644c.setFinishedStrokeWidth(dp2px);
        this.f145644c.setUnfinishedStrokeWidth(dp2px);
        this.f145644c.setStartingDegree(-90);
        this.f145644c.setInnerBackgroundColor(C25653b.m91894a(this.f145646e, R.color.lkui_N900, 0.5f));
        this.f145644c.setMax(100);
        if (j == null || !m228375a(j)) {
            m228374a(false);
        } else {
            m228374a(j.mo178467c());
        }
    }

    @Override // com.ss.android.lark.player.p2511a.AbstractC52086h
    /* renamed from: a */
    public void mo127010a() {
        this.f145643b = this.f145642a.findViewById(R.id.loading_progress);
        this.f145644c = (DonutProgress) this.f145642a.findViewById(R.id.down_load_percent);
    }

    public C58872d(Context context) {
        super(context);
    }

    /* renamed from: a */
    private boolean m228375a(AbstractC52092k kVar) {
        int a = kVar.mo178465a();
        if (a == -2 || a == -1 || a == 0 || a == 1 || a == 4 || a == 5) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private void m228374a(boolean z) {
        if (!this.f145645d) {
            if (z) {
                mo178441j();
                this.f145644c.setVisibility(8);
                this.f145643b.setVisibility(0);
                this.f145647f.mo198847a(new Runnable() {
                    /* class com.ss.android.lark.widget.photo_picker.video.C58872d.RunnableC588731 */

                    public void run() {
                        C58872d.this.mo178425b(0);
                    }
                });
                return;
            }
            this.f145647f.mo198848b(new Runnable() {
                /* class com.ss.android.lark.widget.photo_picker.video.C58872d.RunnableC588742 */

                public void run() {
                    C58872d.this.mo178425b(8);
                }
            });
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.player.p2511a.AbstractView$OnAttachStateChangeListenerC52070a
    /* renamed from: a */
    public View mo127009a(Context context) {
        this.f145646e = context;
        View inflate = LayoutInflater.from(context).inflate(R.layout.online_loading_cover, (ViewGroup) null);
        this.f145642a = inflate;
        return inflate;
    }

    /* renamed from: a */
    public void mo199486a(int i) {
        if (!this.f145645d) {
            mo178425b(0);
            mo178440d(-66017, null);
        }
        this.f145643b.setVisibility(8);
        this.f145644c.setVisibility(0);
        this.f145644c.setProgress((float) i);
    }

    @Override // com.ss.android.lark.player.p2511a.AbstractC52086h, com.ss.android.lark.player.p2511a.AbstractC52071b
    /* renamed from: c */
    public void mo127025c(int i, Bundle bundle) {
        mo178425b(8);
    }

    @Override // com.ss.android.lark.player.p2511a.AbstractC52086h, com.ss.android.lark.player.p2511a.AbstractC52071b
    /* renamed from: a */
    public void mo127014a(int i, Bundle bundle) {
        switch (i) {
            case -99052:
            case -99015:
            case -99014:
            case -99011:
            case -99007:
                m228374a(false);
                return;
            case -99050:
            case -99013:
            case -99010:
            case -99001:
                m228374a(true);
                return;
            default:
                return;
        }
    }
}
