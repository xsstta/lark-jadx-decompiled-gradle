package com.ss.android.lark.inno.player.live.p1989a.p1993d;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.larksuite.suite.R;
import com.ss.android.lark.inno.player.layer.AbstractC39016b;
import com.ss.android.lark.inno.player.live.p1997b.C39064b;
import com.ss.android.lark.inno.utils.C39093c;
import com.ss.android.lark.ui.p2892a.C57582a;
import java.util.List;

/* renamed from: com.ss.android.lark.inno.player.live.a.d.b */
public class View$OnClickListenerC39038b extends AbstractC39016b<AbstractC39037a> implements View.OnClickListener {

    /* renamed from: a */
    private C39064b f100236a;

    /* renamed from: b */
    private ViewGroup f100237b;

    @Override // com.ss.android.lark.inno.player.layer.AbstractC39016b
    /* renamed from: b */
    public void mo142588b() {
        if (getVisibility() == 0) {
            setVisibility(8);
        }
    }

    @Override // com.ss.android.lark.inno.player.layer.AbstractC39016b
    /* renamed from: a */
    public void mo142587a() {
        setVisibility(0);
        C39064b a = ((AbstractC39037a) getDepend()).mo142789a();
        this.f100236a = a;
        if (a != null) {
            setSelectedResolution(a.mo142860b());
        }
    }

    /* renamed from: c */
    private void m154058c() {
        LayoutInflater.from(getContext()).inflate(R.layout.inno_live_layer_choose_resolution, (ViewGroup) this, true);
        this.f100237b = (ViewGroup) findViewById(R.id.resolutionPicker);
        setVisibility(8);
        setOnClickListener(this);
    }

    public View$OnClickListenerC39038b(Context context) {
        super(context);
        m154058c();
    }

    public void onClick(View view) {
        if (view == this) {
            mo142588b();
        }
    }

    private void setSelected(TextView textView) {
        textView.setTextColor(C57582a.m223616d(getContext(), R.color.primary_pri_500));
    }

    private void setUnselected(TextView textView) {
        textView.setTextColor(C57582a.m223616d(getContext(), R.color.static_white));
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m154057a(View view) {
        if (view.getTag(R.id.inno_resolution_item_tag) instanceof Integer) {
            ((AbstractC39037a) getDepend()).mo142790a(((Integer) view.getTag(R.id.inno_resolution_item_tag)).intValue());
            mo142588b();
        }
    }

    public void setSelectedResolution(int i) {
        int childCount = this.f100237b.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = this.f100237b.getChildAt(i2);
            if (childAt instanceof TextView) {
                Object tag = childAt.getTag(R.id.inno_resolution_item_tag);
                if (!(tag instanceof Integer) || ((Integer) tag).intValue() != i) {
                    setUnselected((TextView) childAt);
                } else {
                    setSelected((TextView) childAt);
                }
            }
        }
    }

    /* renamed from: a */
    public void mo142791a(List<Integer> list) {
        this.f100237b.removeAllViews();
        for (Integer num : list) {
            if (num != null) {
                View inflate = LayoutInflater.from(getContext()).inflate(R.layout.inno_live_layer_choose_resolution_item, this.f100237b, false);
                if (inflate instanceof TextView) {
                    ((TextView) inflate).setText(C39093c.m154344a(num.intValue()));
                }
                inflate.setTag(R.id.inno_resolution_item_tag, num);
                inflate.setOnClickListener(new View.OnClickListener() {
                    /* class com.ss.android.lark.inno.player.live.p1989a.p1993d.$$Lambda$b$YGJjnwWTAy7zw9M3f6y8qkpfazI */

                    public final void onClick(View view) {
                        View$OnClickListenerC39038b.lambda$YGJjnwWTAy7zw9M3f6y8qkpfazI(View$OnClickListenerC39038b.this, view);
                    }
                });
                this.f100237b.addView(inflate);
            }
        }
    }
}
