package com.ss.android.lark.inno.player.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.larksuite.suite.R;

public class VcTitleBar extends RelativeLayout {

    /* renamed from: a */
    private VcTitleView f100337a;

    /* renamed from: b */
    private ImageView f100338b;

    /* renamed from: c */
    private ImageView f100339c;

    /* renamed from: com.ss.android.lark.inno.player.widget.VcTitleBar$a */
    public interface AbstractC39082a {
        /* renamed from: a */
        void mo142654a();
    }

    /* renamed from: com.ss.android.lark.inno.player.widget.VcTitleBar$b */
    public interface AbstractC39083b {
        /* renamed from: a */
        void mo142655a();
    }

    /* renamed from: a */
    private void m154308a() {
        LayoutInflater.from(getContext()).inflate(R.layout.inno_livevideo_layer_title_bar, this);
        this.f100337a = (VcTitleView) findViewById(R.id.video_title_item);
        this.f100338b = (ImageView) findViewById(R.id.video_left);
        this.f100339c = (ImageView) findViewById(R.id.video_share);
        this.f100337a.setVisibility(0);
        this.f100338b.setVisibility(8);
        this.f100339c.setVisibility(8);
        setGravity(16);
    }

    public VcTitleBar(Context context) {
        this(context, null);
    }

    public void setTitleText(String str) {
        this.f100337a.setTitleText(str);
    }

    public void setOnLeftListener(final AbstractC39082a aVar) {
        if (aVar == null) {
            this.f100338b.setVisibility(8);
            return;
        }
        this.f100338b.setVisibility(0);
        this.f100338b.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.inno.player.widget.VcTitleBar.View$OnClickListenerC390801 */

            public void onClick(View view) {
                aVar.mo142654a();
            }
        });
    }

    public void setOnShareListener(final AbstractC39083b bVar) {
        if (bVar == null) {
            this.f100338b.setVisibility(8);
            return;
        }
        this.f100339c.setVisibility(0);
        this.f100339c.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.inno.player.widget.VcTitleBar.View$OnClickListenerC390812 */

            public void onClick(View view) {
                bVar.mo142655a();
            }
        });
    }

    public VcTitleBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public VcTitleBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m154308a();
    }
}
