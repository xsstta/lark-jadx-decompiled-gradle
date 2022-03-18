package com.ss.android.lark.inno.player.live.p1989a.p1990a;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.larksuite.suite.R;
import com.ss.android.lark.inno.network.model.C38938a;
import com.ss.android.lark.inno.player.layer.AbstractC39016b;
import com.ss.android.lark.mm.p2288b.C45851c;
import com.ss.android.lark.ui.p2892a.C57582a;
import java.util.List;

/* renamed from: com.ss.android.lark.inno.player.live.a.a.b */
public class View$OnClickListenerC39023b extends AbstractC39016b<AbstractC39022a> implements View.OnClickListener {

    /* renamed from: a */
    private ViewGroup f100223a;

    @Override // com.ss.android.lark.inno.player.layer.AbstractC39016b
    /* renamed from: a */
    public void mo142587a() {
        setVisibility(0);
    }

    @Override // com.ss.android.lark.inno.player.layer.AbstractC39016b
    /* renamed from: b */
    public void mo142588b() {
        if (getVisibility() == 0) {
            setVisibility(8);
        }
    }

    /* renamed from: c */
    private void m154022c() {
        LayoutInflater.from(getContext()).inflate(R.layout.inno_live_layer_choose_resolution, (ViewGroup) this, true);
        this.f100223a = (ViewGroup) findViewById(R.id.resolutionPicker);
        setVisibility(8);
        setOnClickListener(this);
    }

    public View$OnClickListenerC39023b(Context context) {
        super(context);
        m154022c();
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

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m154021a(View view) {
        if (view.getTag(R.id.inno_channel_item_tag) instanceof C38938a) {
            ((AbstractC39022a) getDepend()).mo142784a((C38938a) view.getTag(R.id.inno_channel_item_tag));
            mo142588b();
        }
    }

    public void setSelectedChannel(C38938a aVar) {
        int childCount = this.f100223a.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = this.f100223a.getChildAt(i);
            if (childAt instanceof TextView) {
                if (childAt.getTag(R.id.inno_channel_item_tag) == aVar) {
                    setSelected((TextView) childAt);
                } else {
                    setUnselected((TextView) childAt);
                }
            }
        }
    }

    /* renamed from: a */
    public void mo142785a(List<C38938a> list) {
        String str;
        this.f100223a.removeAllViews();
        for (C38938a aVar : list) {
            if (aVar != null) {
                View inflate = LayoutInflater.from(getContext()).inflate(R.layout.inno_live_layer_choose_resolution_item, this.f100223a, false);
                if (inflate instanceof TextView) {
                    if (aVar.f100039c) {
                        str = C45851c.m181647a(R.string.tools_neiwang);
                    } else {
                        str = C45851c.m181647a(R.string.tools_waiwang);
                    }
                    ((TextView) inflate).setText(str);
                }
                inflate.setTag(R.id.inno_channel_item_tag, aVar);
                inflate.setOnClickListener(new View.OnClickListener() {
                    /* class com.ss.android.lark.inno.player.live.p1989a.p1990a.$$Lambda$b$V8J_WuwfmiA5hYkl9FAsGMYEoWw */

                    public final void onClick(View view) {
                        View$OnClickListenerC39023b.lambda$V8J_WuwfmiA5hYkl9FAsGMYEoWw(View$OnClickListenerC39023b.this, view);
                    }
                });
                this.f100223a.addView(inflate);
            }
        }
    }
}
