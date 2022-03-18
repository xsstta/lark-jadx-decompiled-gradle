package com.ss.android.lark.inno.player.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.larksuite.suite.R;
import com.ss.android.lark.inno.player.p1978c.p1980b.p1981a.p1985d.AbstractC38969b;
import com.ss.android.lark.ui.p2892a.C57582a;
import java.lang.ref.WeakReference;

public class VcSpeedItem extends FrameLayout {

    /* renamed from: a */
    static WeakReference<VcSpeedItem> f100333a;

    /* renamed from: b */
    private float f100334b;

    /* renamed from: c */
    private TextView f100335c;

    public float getSpeed() {
        return this.f100334b;
    }

    public VcSpeedItem(Context context) {
        this(context, null);
    }

    public VcSpeedItem(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    public void mo142927a(boolean z, boolean z2) {
        ViewParent parent;
        if (z) {
            WeakReference<VcSpeedItem> weakReference = f100333a;
            if (weakReference != null) {
                if (weakReference.get() != this) {
                    if (f100333a.get() != null) {
                        f100333a.get().mo142927a(false, false);
                    }
                } else {
                    return;
                }
            }
            f100333a = new WeakReference<>(this);
            if (!(!z2 || (parent = getParent()) == null || parent.getParent() == null)) {
                ((AbstractC38969b) parent.getParent()).mo142612a(this.f100334b);
            }
            this.f100335c.setTextColor(C57582a.m223616d(getContext(), R.color.bg_pricolor));
            return;
        }
        this.f100335c.setTextColor(C57582a.m223616d(getContext(), R.color.static_white));
    }

    public VcSpeedItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f100334b = 1.0f;
        m154306a(attributeSet, i, i);
    }

    /* renamed from: a */
    private void m154306a(AttributeSet attributeSet, int i, int i2) {
        LayoutInflater.from(getContext()).inflate(R.layout.inno_livevideo_layer_speed_item, this);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, new int[]{R.attr.bar_size, R.attr.show_value, R.attr.value}, i, i2);
        this.f100334b = obtainStyledAttributes.getFloat(2, 1.0f);
        TextView textView = (TextView) findViewById(R.id.speedItem);
        this.f100335c = textView;
        textView.setVisibility(0);
        this.f100335c.setTextColor(C57582a.m223616d(getContext(), R.color.static_white));
        TextView textView2 = this.f100335c;
        textView2.setText(this.f100334b + "X");
        setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.inno.player.widget.VcSpeedItem.View$OnClickListenerC390791 */

            public void onClick(View view) {
                VcSpeedItem.this.mo142927a(true, true);
            }
        });
        obtainStyledAttributes.recycle();
    }
}
