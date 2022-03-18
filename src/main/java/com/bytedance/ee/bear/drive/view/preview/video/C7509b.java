package com.bytedance.ee.bear.drive.view.preview.video;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import com.bytedance.ee.bear.drive.biz.preview.block.DriveBlockTitleView;
import com.bytedance.ee.bear.drive.view.preview.media.DriveMediaVM;
import com.bytedance.ee.bear.drive.view.widget.ProgressBar;
import com.bytedance.ee.util.p718t.C13727b;
import com.bytedance.ee.util.p718t.C13749l;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;

/* renamed from: com.bytedance.ee.bear.drive.view.preview.video.b */
public class C7509b {

    /* renamed from: a */
    public boolean f20275a;

    /* renamed from: b */
    private ProgressBar f20276b;

    /* renamed from: c */
    private View f20277c;

    /* renamed from: d */
    private DriveBlockTitleView f20278d;

    /* renamed from: e */
    private int f20279e;

    /* renamed from: f */
    private int f20280f;

    /* renamed from: g */
    private AnimatorSet f20281g = new AnimatorSet();

    /* renamed from: h */
    private AnimatorSet f20282h = new AnimatorSet();

    /* renamed from: a */
    public AnimatorSet mo29326a() {
        return this.f20282h;
    }

    /* renamed from: b */
    public AnimatorSet mo29327b() {
        return this.f20281g;
    }

    /* renamed from: f */
    public boolean mo29331f() {
        return this.f20275a;
    }

    /* renamed from: c */
    public void mo29328c() {
        this.f20281g.start();
    }

    /* renamed from: d */
    public void mo29329d() {
        this.f20282h.start();
    }

    /* renamed from: e */
    public void mo29330e() {
        this.f20276b.getLayoutParams().height = this.f20280f;
        this.f20276b.requestLayout();
    }

    /* renamed from: g */
    public void mo29332g() {
        this.f20282h.cancel();
        this.f20281g.cancel();
    }

    public C7509b(Context context, ProgressBar progressBar, View view, DriveBlockTitleView driveBlockTitleView, DriveMediaVM bVar) {
        ValueAnimator valueAnimator;
        ValueAnimator valueAnimator2;
        this.f20276b = progressBar;
        this.f20277c = view;
        this.f20278d = driveBlockTitleView;
        this.f20279e = context.getResources().getDimensionPixelSize(R.dimen.space_kit_len_44);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.drive_progress_bar_height);
        this.f20280f = dimensionPixelSize;
        ValueAnimator duration = C13727b.m55678a(this.f20276b, dimensionPixelSize, 0).setDuration(150L);
        ValueAnimator e = C13727b.m55687e(this.f20277c, BitmapDescriptorFactory.HUE_RED, (float) (-C13749l.m55738a(100)), 150);
        DriveBlockTitleView driveBlockTitleView2 = this.f20278d;
        if (driveBlockTitleView2 != null) {
            valueAnimator = C13727b.m55678a(driveBlockTitleView2, this.f20279e, 0).setDuration(150L);
        } else {
            valueAnimator = ObjectAnimator.ofInt(0, 1);
        }
        duration.addListener(new C13727b.C13735a() {
            /* class com.bytedance.ee.bear.drive.view.preview.video.C7509b.C75101 */

            @Override // com.bytedance.ee.util.p718t.C13727b.C13735a
            public void onAnimationEnd(Animator animator) {
                C7509b.this.f20275a = false;
            }
        });
        this.f20282h.playTogether(duration, e, valueAnimator);
        ValueAnimator duration2 = C13727b.m55678a(this.f20276b, 0, this.f20280f).setDuration(150L);
        ValueAnimator e2 = C13727b.m55687e(this.f20277c, (float) (-C13749l.m55738a(100)), BitmapDescriptorFactory.HUE_RED, 150);
        DriveBlockTitleView driveBlockTitleView3 = this.f20278d;
        if (driveBlockTitleView3 != null) {
            valueAnimator2 = C13727b.m55678a(driveBlockTitleView3, 0, this.f20279e).setDuration(150L);
        } else {
            valueAnimator2 = ObjectAnimator.ofInt(0, 1);
        }
        duration2.addListener(new C13727b.C13735a() {
            /* class com.bytedance.ee.bear.drive.view.preview.video.C7509b.C75112 */

            @Override // com.bytedance.ee.util.p718t.C13727b.C13735a
            public void onAnimationStart(Animator animator) {
                C7509b.this.f20275a = true;
            }
        });
        this.f20281g.playTogether(duration2, e2, valueAnimator2);
    }
}
