package com.ss.android.lark.mail.impl.widget.time;

import android.graphics.Typeface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.lark.base.fragment.BaseFragment;
import com.ss.android.lark.mail.impl.widget.time.p2230a.C44074a;

/* renamed from: com.ss.android.lark.mail.impl.widget.time.d */
public class View$OnClickListenerC44084d extends BaseFragment implements View.OnClickListener {

    /* renamed from: a */
    protected Bundle f111914a;

    /* renamed from: b */
    protected C44074a.AbstractC44075a f111915b = new C44074a.AbstractC44075a() {
        /* class com.ss.android.lark.mail.impl.widget.time.View$OnClickListenerC44084d.C440851 */

        /* renamed from: b */
        private Typeface f111917b;

        @Override // com.ss.android.lark.mail.impl.widget.time.p2230a.C44074a.AbstractC44075a
        /* renamed from: a */
        public Typeface mo156851a() {
            if (this.f111917b == null) {
                this.f111917b = Typeface.createFromAsset(View$OnClickListenerC44084d.this.getContext().getAssets(), "fonts/DINAlternateBold.ttf");
            }
            return this.f111917b;
        }
    };

    /* renamed from: a */
    public boolean mo156878a() {
        return false;
    }

    public void onClick(View view) {
    }

    public View$OnClickListenerC44084d() {
        super.setArguments(new Bundle());
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        view.setOnClickListener(this);
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f111914a = bundle;
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }
}
