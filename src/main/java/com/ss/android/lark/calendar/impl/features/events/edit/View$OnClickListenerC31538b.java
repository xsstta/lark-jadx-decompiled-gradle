package com.ss.android.lark.calendar.impl.features.events.edit;

import android.graphics.Typeface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.lark.calendar.impl.features.events.edit.C31534a;
import com.ss.android.lark.calendar.impl.framework.components.CalendarBaseFragment;

/* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.b */
public class View$OnClickListenerC31538b extends CalendarBaseFragment implements View.OnClickListener {

    /* renamed from: c */
    protected Bundle f79936c;

    /* renamed from: d */
    protected C31534a.AbstractC31535a f79937d = new C31534a.AbstractC31535a() {
        /* class com.ss.android.lark.calendar.impl.features.events.edit.View$OnClickListenerC31538b.C315391 */

        /* renamed from: b */
        private Typeface f79939b;

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.C31534a.AbstractC31535a
        /* renamed from: a */
        public Typeface mo114596a() {
            if (this.f79939b == null) {
                this.f79939b = Typeface.createFromAsset(View$OnClickListenerC31538b.this.getContext().getAssets(), "fonts/DINPro-Bold.ttf");
            }
            return this.f79939b;
        }
    };

    /* renamed from: e */
    public boolean mo113714e() {
        return false;
    }

    public void onClick(View view) {
    }

    public View$OnClickListenerC31538b() {
        super.setArguments(new Bundle());
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        view.setOnClickListener(this);
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f79936c = bundle;
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }
}
