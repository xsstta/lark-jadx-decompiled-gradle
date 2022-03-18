package com.bytedance.ee.bear.drive.biz.extra_info;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bumptech.glide.C2124f;
import com.bumptech.glide.ComponentCallbacks2C2115c;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.request.AbstractC2536f;
import com.bumptech.glide.request.p095a.AbstractC2522j;
import com.bytedance.ee.bear.drive.view.widget.CircleImageView;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p703f.C13664a;
import com.bytedance.ee.util.p718t.C13727b;
import com.larksuite.suite.R;
import java.util.List;

public class LikeCircleImageView extends FrameLayout {

    /* renamed from: a */
    private CircleImageView f17786a;

    /* renamed from: b */
    private CircleImageView f17787b;

    /* renamed from: c */
    private FrameLayout f17788c;

    /* renamed from: a */
    public void mo25783a() {
        setVisibility(8);
    }

    /* renamed from: b */
    public void mo25785b() {
        setVisibility(0);
    }

    /* renamed from: c */
    private void m25837c() {
        inflate(getContext(), R.layout.drive_like_count_layout, this);
        this.f17786a = (CircleImageView) findViewById(R.id.drive_like_count_image1);
        this.f17787b = (CircleImageView) findViewById(R.id.drive_like_count_image2);
        this.f17788c = (FrameLayout) findViewById(R.id.drive_like_header_view_root);
    }

    public LikeCircleImageView(Context context) {
        super(context);
        m25837c();
    }

    /* renamed from: a */
    public void mo25784a(List<String> list) {
        if (list == null) {
            C13479a.m54758a("LikeCircleImageView", "setHeaderView avatarList is null");
            return;
        }
        C13479a.m54764b("LikeCircleImageView", "avatarList.size = " + list.size());
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.drive_like_file_circle_view);
        if (list.size() == 0) {
            if (this.f17788c.getWidth() == dimensionPixelSize) {
                C13727b.m55682b(this.f17788c, dimensionPixelSize, 0).setDuration(150L).start();
            }
        } else if (list.size() == 1) {
            if (this.f17788c.getWidth() == 0) {
                C13727b.m55682b(this.f17788c, 0, dimensionPixelSize).setDuration(150L).start();
            }
            this.f17786a.setVisibility(0);
            this.f17787b.setVisibility(8);
            m25836a(list.get(0), this.f17786a);
        } else {
            if (this.f17788c.getWidth() == 0) {
                C13727b.m55682b(this.f17788c, 0, dimensionPixelSize).setDuration(150L).start();
            }
            this.f17786a.setVisibility(0);
            this.f17787b.setVisibility(0);
            m25836a(list.get(0), this.f17786a);
            m25836a(list.get(1), this.f17787b);
        }
    }

    public LikeCircleImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m25837c();
    }

    /* renamed from: a */
    private void m25836a(String str, ImageView imageView) {
        ((C2124f) ((C2124f) ((C2124f) ComponentCallbacks2C2115c.m9151c(getContext()).mo10414a(new C13664a(str)).mo11157n()).mo11123a(R.drawable.facade_common_avatar_place_holder)).mo11143c(R.drawable.facade_common_avatar_place_holder)).mo10392a((AbstractC2536f) new AbstractC2536f<Drawable>() {
            /* class com.bytedance.ee.bear.drive.biz.extra_info.LikeCircleImageView.C64361 */

            /* renamed from: a */
            public boolean mo11205a(Drawable drawable, Object obj, AbstractC2522j<Drawable> jVar, DataSource dataSource, boolean z) {
                return false;
            }

            @Override // com.bumptech.glide.request.AbstractC2536f
            /* renamed from: a */
            public boolean mo11204a(GlideException glideException, Object obj, AbstractC2522j<Drawable> jVar, boolean z) {
                C13479a.m54759a("LikeCircleImageView", "glide onLoadFailed(), error=", glideException);
                return false;
            }
        }).mo10399a(imageView);
    }

    public LikeCircleImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m25837c();
    }
}
