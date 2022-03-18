package com.ss.android.lark.chat.video;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.larksuite.suite.R;
import com.ss.android.lark.player.p2511a.AbstractC52092k;
import com.ss.android.lark.player.p2511a.AbstractView$OnAttachStateChangeListenerC52070a;

/* renamed from: com.ss.android.lark.chat.video.f */
public class C34408f extends AbstractView$OnAttachStateChangeListenerC52070a {

    /* renamed from: a */
    private View f88845a;

    /* renamed from: b */
    private View f88846b;

    /* renamed from: c */
    private Context f88847c;

    @Override // com.ss.android.lark.player.p2511a.AbstractC52086h
    /* renamed from: a */
    public void mo127010a() {
        this.f88846b = this.f88845a.findViewById(R.id.loading_progress);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.player.p2511a.AbstractView$OnAttachStateChangeListenerC52070a
    /* renamed from: b */
    public void mo127043b() {
        AbstractC52092k j = mo178441j();
        if (j == null || !m133415a(j)) {
            m133414a(false);
        } else {
            m133414a(j.mo178467c());
        }
    }

    public C34408f(Context context) {
        super(context);
    }

    /* renamed from: a */
    private void m133414a(boolean z) {
        if (z) {
            mo178441j();
            this.f88846b.setVisibility(0);
            mo178425b(0);
            return;
        }
        mo178425b(8);
    }

    /* renamed from: a */
    private boolean m133415a(AbstractC52092k kVar) {
        int a = kVar.mo178465a();
        if (a == -2 || a == -1 || a == 0 || a == 1 || a == 4 || a == 5) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.player.p2511a.AbstractView$OnAttachStateChangeListenerC52070a
    /* renamed from: a */
    public View mo127009a(Context context) {
        this.f88847c = context;
        View inflate = LayoutInflater.from(context).inflate(R.layout.online_loading_cover, (ViewGroup) null);
        this.f88845a = inflate;
        return inflate;
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
                m133414a(false);
                return;
            case -99050:
            case -99013:
            case -99010:
            case -99001:
                m133414a(true);
                return;
            default:
                return;
        }
    }
}
