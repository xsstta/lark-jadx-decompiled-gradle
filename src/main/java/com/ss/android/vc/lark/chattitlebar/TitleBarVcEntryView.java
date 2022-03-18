package com.ss.android.vc.lark.chattitlebar;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.larksuite.suite.R;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.vc.common.p3083e.C60773o;

public class TitleBarVcEntryView extends FrameLayout {

    /* renamed from: a */
    private ImageView f152992a;

    /* renamed from: b */
    private boolean f152993b;

    /* renamed from: c */
    private final Handler f152994c = new Handler();

    /* renamed from: d */
    private boolean f152995d;

    /* renamed from: e */
    private boolean f152996e;

    /* renamed from: f */
    private boolean f152997f;

    /* renamed from: a */
    public boolean mo211326a() {
        return this.f152993b;
    }

    /* renamed from: b */
    public boolean mo211327b() {
        return this.f152996e;
    }

    /* renamed from: c */
    public boolean mo211328c() {
        return this.f152997f;
    }

    /* renamed from: d */
    private void m237569d() {
        setClipToPadding(false);
        ImageView imageView = new ImageView(getContext());
        this.f152992a = imageView;
        imageView.setImageDrawable(C60773o.m236128f(R.drawable.ud_icon_video_outlined));
        this.f152992a.getDrawable().setTint(C60773o.m236126d(R.color.icon_n1));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        addView(this.f152992a, layoutParams);
    }

    /* renamed from: e */
    private void m237570e() {
        int i;
        if (mo211326a()) {
            this.f152992a.setImageDrawable(C60773o.m236128f(R.drawable.ud_icon_video_filled));
            this.f152992a.getDrawable().setTint(C60773o.m236126d(R.color.ud_G500));
        } else if (!this.f152996e || !this.f152997f) {
            this.f152992a.setImageDrawable(C60773o.m236128f(R.drawable.ud_icon_video_outlined));
            this.f152992a.getDrawable().setTint(C60773o.m236126d(R.color.icon_disable));
        } else {
            this.f152992a.setImageDrawable(C60773o.m236128f(R.drawable.ud_icon_video_outlined));
            Drawable drawable = this.f152992a.getDrawable();
            if (!this.f152995d || DesktopUtil.m144307b()) {
                i = R.color.icon_n1;
            } else {
                i = R.color.static_white;
            }
            drawable.setTint(C60773o.m236126d(i));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m237568b(boolean z) {
        this.f152993b = z;
        m237570e();
    }

    public void setAllowCreateMeeting(boolean z) {
        this.f152997f = z;
        m237570e();
    }

    public void setPostPermission(boolean z) {
        this.f152996e = z;
        m237570e();
    }

    public TitleBarVcEntryView(Context context) {
        super(context);
        m237569d();
    }

    /* renamed from: a */
    public void mo211325a(boolean z) {
        this.f152994c.post(new Runnable(z) {
            /* class com.ss.android.vc.lark.chattitlebar.$$Lambda$TitleBarVcEntryView$LBRjZBn0WA_KoRn8YeYzoqpbsA */
            public final /* synthetic */ boolean f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                TitleBarVcEntryView.this.m237568b(this.f$1);
            }
        });
    }

    public void setSecret(boolean z) {
        int i;
        this.f152995d = z;
        this.f152992a.setImageDrawable(C60773o.m236128f(R.drawable.ud_icon_video_outlined));
        Drawable drawable = this.f152992a.getDrawable();
        if (!this.f152995d || DesktopUtil.m144307b()) {
            i = R.color.icon_n1;
        } else {
            i = R.color.static_white;
        }
        drawable.setTint(C60773o.m236126d(i));
    }

    public TitleBarVcEntryView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m237569d();
    }

    public TitleBarVcEntryView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m237569d();
    }
}
