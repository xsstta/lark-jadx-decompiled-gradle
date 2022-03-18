package com.ss.android.appcenter.business.activity.appaddv2.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.bumptech.glide.C2124f;
import com.bumptech.glide.ComponentCallbacks2C2115c;
import com.bumptech.glide.Priority;
import com.larksuite.component.ignition.widget.squircle.SquircleImageView;
import com.larksuite.component.universe_design.color.UDColorUtils;
import com.larksuite.suite.R;
import com.ss.android.appcenter.business.p1268b.C27688a;
import com.ss.android.appcenter.common.util.C28184h;
import com.ss.android.appcenter.common.util.C28209p;
import java.util.List;

public class AppBar extends FrameLayout {

    /* renamed from: a */
    public FrameLayout f68874a;

    /* renamed from: b */
    public int f68875b;

    /* renamed from: c */
    private TextView f68876c;

    /* renamed from: d */
    private int f68877d;

    /* renamed from: e */
    private int f68878e;

    /* renamed from: f */
    private List<String> f68879f;

    /* renamed from: g */
    private Bitmap f68880g;

    /* renamed from: h */
    private Context f68881h;

    /* renamed from: b */
    private void m100763b() {
        View inflate = LayoutInflater.from(this.f68881h).inflate(R.layout.workplace_addapp_appbar_view, (ViewGroup) this, false);
        addView(inflate, new LinearLayout.LayoutParams(-1, -1));
        this.f68874a = (FrameLayout) inflate.findViewById(R.id.container);
        this.f68876c = (TextView) inflate.findViewById(R.id.added);
        for (int i = 0; i < 12; i++) {
            SquircleImageView squircleImageView = new SquircleImageView(this.f68881h);
            squircleImageView.setBorderWidth((int) getResources().getDimension(R.dimen.workplace_small_icon_border_width));
            squircleImageView.setBorderColor(ContextCompat.getColor(this.f68881h, R.color.workplace_common_icon_border_color));
            squircleImageView.setRadius(this.f68878e);
            squircleImageView.setImageTintMode(PorterDuff.Mode.SRC_OVER);
            squircleImageView.setImageTintList(UDColorUtils.getColorStateList(getContext(), R.color.fill_img_mask));
            m100761a(squircleImageView, true);
            int i2 = this.f68877d;
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i2, i2);
            if (i == 0) {
                layoutParams.leftMargin = 0;
            } else {
                layoutParams.leftMargin = C28209p.m103293a(this.f68881h, 28.0f) * i;
            }
            layoutParams.gravity = 16;
            squircleImageView.setLayoutParams(layoutParams);
            this.f68874a.addView(squircleImageView);
        }
        getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
            /* class com.ss.android.appcenter.business.activity.appaddv2.view.AppBar.ViewTreeObserver$OnGlobalLayoutListenerC276111 */

            public void onGlobalLayout() {
                AppBar appBar = AppBar.this;
                int a = appBar.mo98342a(appBar.f68874a.getWidth());
                if (a != AppBar.this.f68875b) {
                    AppBar.this.f68875b = a;
                    AppBar.this.mo98343a();
                }
            }
        });
    }

    /* renamed from: a */
    public void mo98343a() {
        boolean z;
        List<String> list = this.f68879f;
        if (list != null) {
            int size = list.size();
            C28184h.m103250d("App_Add_Page", "renderAppBar width:" + this.f68874a.getWidth() + " maxNum:" + this.f68875b + " list size:" + size);
            int min = Math.min(size, this.f68875b);
            if (size > this.f68875b) {
                z = true;
            } else {
                z = false;
            }
            int i = -1;
            for (int i2 = 0; i2 < min; i2++) {
                SquircleImageView squircleImageView = (SquircleImageView) this.f68874a.getChildAt(i2);
                if (i2 != this.f68875b - 1 || !z) {
                    C27688a.m101209a(this.f68881h, this.f68879f.get(i2), squircleImageView);
                } else {
                    ((C2124f) ((C2124f) ((C2124f) ((C2124f) ComponentCallbacks2C2115c.m9151c(this.f68881h).mo10409a(this.f68880g).mo11123a((int) R.color.bg_filler)).mo11143c(R.color.bg_filler)).mo11157n()).mo11126a(Priority.HIGH)).mo10399a((ImageView) squircleImageView);
                }
                m100761a(squircleImageView, false);
                i = i2;
            }
            for (int i3 = i + 1; i3 < 12; i3++) {
                m100761a((SquircleImageView) this.f68874a.getChildAt(i3), true);
            }
        }
    }

    public AppBar(Context context) {
        this(context, null);
    }

    /* renamed from: b */
    private String m100762b(int i) {
        return C28209p.m103298a(this.f68881h, (int) R.string.OpenPlatform_AppCenter_AddedTitle, "count", String.valueOf(i));
    }

    /* renamed from: a */
    public int mo98342a(int i) {
        return (int) Math.min(12.0d, Math.floor((double) (i + C28209p.m103293a(this.f68881h, 4.0f))) / ((double) C28209p.m103293a(this.f68881h, 28.0f)));
    }

    /* renamed from: a */
    public void mo98344a(List<String> list) {
        this.f68876c.setText(m100762b(list.size()));
        this.f68879f = list;
        mo98343a();
    }

    public AppBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    /* renamed from: a */
    private void m100761a(SquircleImageView squircleImageView, boolean z) {
        if (z) {
            squircleImageView.setVisibility(8);
        } else {
            squircleImageView.setVisibility(0);
        }
    }

    public AppBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f68881h = context;
        this.f68877d = C28209p.m103293a(context, 24.0f);
        this.f68878e = C28209p.m103293a(this.f68881h, 6.0f);
        m100763b();
        this.f68880g = BitmapFactory.decodeResource(getResources(), R.drawable.workplace_addapp_appbar_more_icon);
    }
}
