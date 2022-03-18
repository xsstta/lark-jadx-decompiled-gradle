package com.ss.android.lark.inno.player.p1978c.p1980b.p1981a.p1985d;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.larksuite.suite.R;
import com.ss.android.lark.inno.player.layer.AbstractC39016b;
import com.ss.android.lark.ui.p2892a.C57582a;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.ss.android.lark.inno.player.c.b.a.d.c */
public class View$OnClickListenerC38970c extends AbstractC39016b<AbstractC38968a> implements View.OnClickListener, AbstractC38969b {

    /* renamed from: a */
    List<Float> f100132a = Arrays.asList(Float.valueOf(3.0f), Float.valueOf(2.0f), Float.valueOf(1.5f), Float.valueOf(1.25f), Float.valueOf(1.0f), Float.valueOf(0.75f), Float.valueOf(0.5f));

    /* renamed from: b */
    private ViewGroup f100133b;

    @Override // com.ss.android.lark.inno.player.layer.AbstractC39016b
    /* renamed from: a */
    public void mo142587a() {
        setVisibility(0);
        setSelectedSpeed(((AbstractC38968a) getDepend()).mo142609a());
    }

    @Override // com.ss.android.lark.inno.player.layer.AbstractC39016b
    /* renamed from: b */
    public void mo142588b() {
        if (getVisibility() == 0) {
            setVisibility(8);
            ((AbstractC38968a) getDepend()).mo142611b();
        }
    }

    /* renamed from: c */
    private void m153750c() {
        LayoutInflater.from(getContext()).inflate(R.layout.inno_livevideo_layer_choose_speed, (ViewGroup) this, true);
        this.f100133b = (ViewGroup) findViewById(R.id.speedPicker);
        mo142613a(this.f100132a);
        setVisibility(8);
        setOnClickListener(this);
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

    @Override // com.ss.android.lark.inno.player.p1978c.p1980b.p1981a.p1985d.AbstractC38969b
    /* renamed from: a */
    public void mo142612a(float f) {
        ((AbstractC38968a) getDepend()).mo142610a(f);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m153749a(View view) {
        if (view.getTag(R.id.inno_speed_item_tag) instanceof Float) {
            ((AbstractC38968a) getDepend()).mo142610a(((Float) view.getTag(R.id.inno_speed_item_tag)).floatValue());
            setSelectedSpeed(((Float) view.getTag(R.id.inno_speed_item_tag)).floatValue());
        }
    }

    public void setSelectedSpeed(float f) {
        int childCount = this.f100133b.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = this.f100133b.getChildAt(i);
            if (childAt instanceof TextView) {
                Object tag = childAt.getTag(R.id.inno_speed_item_tag);
                if (!(tag instanceof Float) || ((Float) tag).floatValue() != f) {
                    setUnselected((TextView) childAt);
                } else {
                    setSelected((TextView) childAt);
                }
            }
        }
    }

    public View$OnClickListenerC38970c(Context context) {
        super(context);
        m153750c();
    }

    /* renamed from: a */
    public void mo142613a(List<Float> list) {
        this.f100133b.removeAllViews();
        for (Float f : list) {
            if (f != null) {
                View inflate = LayoutInflater.from(getContext()).inflate(R.layout.inno_livevideo_layer_speed_item, this.f100133b, false);
                if (inflate instanceof TextView) {
                    ((TextView) inflate).setText(f + "X");
                }
                inflate.setTag(R.id.inno_speed_item_tag, f);
                inflate.setOnClickListener(new View.OnClickListener() {
                    /* class com.ss.android.lark.inno.player.p1978c.p1980b.p1981a.p1985d.$$Lambda$c$RdzCvFHswdUekLtdQcwOg2UO6ko */

                    public final void onClick(View view) {
                        View$OnClickListenerC38970c.lambda$RdzCvFHswdUekLtdQcwOg2UO6ko(View$OnClickListenerC38970c.this, view);
                    }
                });
                this.f100133b.addView(inflate);
            }
        }
    }
}
