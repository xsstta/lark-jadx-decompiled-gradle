package com.bytedance.ee.bear.drive.view.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.larksuite.suite.R;

public class VolumeView extends FrameLayout implements View.OnClickListener {

    /* renamed from: a */
    private ImageView f20560a;

    /* renamed from: b */
    private ImageView f20561b;

    /* renamed from: c */
    private boolean f20562c;

    /* renamed from: d */
    private AbstractC7567a f20563d;

    /* renamed from: com.bytedance.ee.bear.drive.view.widget.VolumeView$a */
    public interface AbstractC7567a {
        /* renamed from: c */
        void mo28324c(boolean z);
    }

    /* renamed from: a */
    private void m30356a() {
        LayoutInflater.from(getContext()).inflate(R.layout.drive_volume_view, this);
        this.f20560a = (ImageView) findViewById(R.id.silent);
        this.f20561b = (ImageView) findViewById(R.id.vocal);
        setSilent(this.f20562c);
        this.f20560a.setOnClickListener(this);
        this.f20561b.setOnClickListener(this);
    }

    public void setVolumeStateChangedListener(AbstractC7567a aVar) {
        this.f20563d = aVar;
    }

    public VolumeView(Context context) {
        super(context);
        m30356a();
    }

    public void setSilentDrawable(Drawable drawable) {
        this.f20560a.setImageDrawable(drawable);
    }

    public void setSilentSrc(int i) {
        this.f20560a.setImageResource(i);
    }

    public void setVocalDrawable(Drawable drawable) {
        this.f20561b.setImageDrawable(drawable);
    }

    public void setVocalSrc(int i) {
        this.f20561b.setImageResource(i);
    }

    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.silent) {
            setSilent(false);
        } else if (id == R.id.vocal) {
            setSilent(true);
        }
    }

    public void setSilent(boolean z) {
        this.f20562c = z;
        if (z) {
            this.f20560a.setVisibility(0);
            this.f20561b.setVisibility(8);
        } else {
            this.f20560a.setVisibility(8);
            this.f20561b.setVisibility(0);
        }
        AbstractC7567a aVar = this.f20563d;
        if (aVar != null) {
            aVar.mo28324c(z);
        }
    }

    public VolumeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m30356a();
    }

    public VolumeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m30356a();
    }
}
