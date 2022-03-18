package com.ss.android.appcenter.business.activity.appsort;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.component.universe_design.shadow.UDShadowLayout;
import com.larksuite.component.universe_design.tag.UDTagsDrawable;
import com.larksuite.component.universe_design.util.UDDimenUtils;
import com.larksuite.suite.R;
import com.ss.android.appcenter.business.dto.NameTag;
import com.ss.android.appcenter.business.net.dto.ItemInfo;
import com.ss.android.appcenter.business.p1268b.C27688a;
import com.ss.android.appcenter.common.util.C28209p;

/* renamed from: com.ss.android.appcenter.business.activity.appsort.b */
public class C27683b {

    /* renamed from: a */
    public int f69160a;

    /* renamed from: b */
    private Context f69161b;

    /* renamed from: c */
    private UDShadowLayout f69162c;

    /* renamed from: d */
    private View f69163d;

    /* renamed from: e */
    private View f69164e;

    /* renamed from: f */
    private ImageView f69165f;

    /* renamed from: g */
    private TextView f69166g;

    /* renamed from: h */
    private ImageView f69167h;

    /* renamed from: i */
    private ImageView f69168i;

    /* renamed from: j */
    private View f69169j;

    /* renamed from: k */
    private TextView f69170k;

    /* renamed from: l */
    private TextView f69171l;

    /* renamed from: m */
    private AnimatorSet f69172m;

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.appcenter.business.activity.appsort.b$a */
    public interface AbstractC27685a {
        /* renamed from: a */
        void mo98624a();
    }

    /* renamed from: c */
    private void m101183c() {
        AnimatorSet animatorSet = this.f69172m;
        if (animatorSet != null && animatorSet.isRunning()) {
            this.f69172m.end();
        }
        this.f69163d.setTranslationX(BitmapDescriptorFactory.HUE_RED);
        this.f69171l.setTranslationX((float) this.f69160a);
    }

    /* renamed from: a */
    public void mo98634a() {
        this.f69163d.setBackgroundResource(R.drawable.workplace_adapter_item_round_mid_bg);
        m101182a(false);
        this.f69162c.mo91199a(2131887167);
    }

    /* renamed from: b */
    public void mo98637b() {
        AnimatorSet animatorSet = new AnimatorSet();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f69163d, "translationX", 0.0f);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f69171l, "translationX", (float) this.f69160a);
        animatorSet.setDuration(300L).playTogether(ofFloat, ofFloat2);
        animatorSet.start();
    }

    /* renamed from: a */
    private void m101182a(boolean z) {
        int i;
        View view = this.f69169j;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        view.setVisibility(i);
    }

    /* renamed from: a */
    private void m101180a(int i) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f69170k.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.f69169j.getLayoutParams();
        if (i == 1) {
            this.f69165f.setVisibility(8);
            this.f69168i.setVisibility(8);
            marginLayoutParams.rightMargin = (int) this.f69161b.getResources().getDimension(R.dimen.workplace_common_safe_margin);
            marginLayoutParams2.leftMargin = C28209p.m103293a(this.f69161b, 60.0f);
        } else {
            this.f69165f.setVisibility(0);
            this.f69168i.setVisibility(0);
            marginLayoutParams.rightMargin = 0;
            marginLayoutParams2.leftMargin = C28209p.m103293a(this.f69161b, 90.0f);
        }
        this.f69170k.setLayoutParams(marginLayoutParams);
        this.f69169j.setLayoutParams(marginLayoutParams2);
    }

    /* renamed from: a */
    public void mo98636a(final AbstractC27685a aVar) {
        this.f69172m = new AnimatorSet();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f69163d, "translationX", 0.0f, (float) (-this.f69160a));
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f69171l, "translationX", (float) this.f69160a, 0.0f);
        this.f69172m.addListener(new AnimatorListenerAdapter() {
            /* class com.ss.android.appcenter.business.activity.appsort.C27683b.C276841 */

            public void onAnimationEnd(Animator animator) {
                aVar.mo98624a();
            }
        });
        this.f69172m.setDuration(300L).playTogether(ofFloat, ofFloat2);
        this.f69172m.start();
    }

    public C27683b(Context context, View view) {
        this.f69161b = context;
        this.f69162c = (UDShadowLayout) view.findViewById(R.id.shadow_view);
        this.f69163d = view.findViewById(R.id.content);
        this.f69164e = view.findViewById(R.id.content_view_wrapper);
        this.f69166g = (TextView) view.findViewById(R.id.name);
        this.f69167h = (ImageView) view.findViewById(R.id.icon);
        this.f69165f = (ImageView) view.findViewById(R.id.delete);
        this.f69168i = (ImageView) view.findViewById(R.id.sort_icon);
        this.f69169j = view.findViewById(R.id.bottom_divide);
        this.f69170k = (TextView) view.findViewById(R.id.tag);
        this.f69171l = (TextView) view.findViewById(R.id.delete_bt);
        this.f69160a = C28209p.m103293a(context, 70.0f);
    }

    /* renamed from: a */
    private void m101181a(int i, ItemInfo itemInfo) {
        NameTag nameTag;
        UDTagsDrawable.Builder bVar = new UDTagsDrawable.Builder(this.f69161b);
        if (i == 1) {
            nameTag = NameTag.RECOMMEND;
        } else if (i == 2) {
            nameTag = NameTag.WIDGET;
        } else if (itemInfo.isBookmark()) {
            nameTag = NameTag.BOOKMARK;
        } else if (itemInfo.isSingleBot()) {
            nameTag = NameTag.BOT;
        } else {
            nameTag = null;
        }
        if (nameTag == null) {
            this.f69170k.setVisibility(8);
            return;
        }
        this.f69170k.setVisibility(0);
        UDTagsDrawable i2 = bVar.mo91384a(new UDTagsDrawable.TagModel.Builder(this.f69161b).mo91418a(this.f69161b.getString(nameTag.getTextResId())).mo91417a(nameTag.getColorSet()).mo91427g()).mo91383a(UDDimenUtils.m93308a(this.f69161b, 12)).mo91388c(UDDimenUtils.m93308a(this.f69161b, 18)).mo91398i();
        if (i2 != null) {
            i2.mo91368a((View) this.f69170k);
        }
    }

    /* renamed from: a */
    public void mo98635a(int i, ItemInfo itemInfo, boolean z, boolean z2) {
        int i2;
        this.f69166g.setText(itemInfo.getName());
        C27688a.m101210a(this.f69161b, itemInfo.getName(), itemInfo.getIconKey(), this.f69167h);
        m101180a(i);
        m101181a(i, itemInfo);
        m101183c();
        boolean z3 = false;
        if (z && z2) {
            i2 = R.drawable.workplace_adapter_item_round_single_bg;
        } else if (z) {
            z3 = true;
            i2 = R.drawable.workplace_adapter_item_round_top_bg;
        } else if (z2) {
            i2 = R.drawable.workplace_adapter_item_round_bottom_bg;
        } else {
            z3 = true;
            i2 = R.drawable.workplace_adapter_item_round_mid_bg;
        }
        m101182a(z3);
        this.f69163d.setBackgroundResource(i2);
        this.f69162c.mo91199a(2131887142);
        this.f69162c.setLayoutParams((ViewGroup.MarginLayoutParams) this.f69162c.getLayoutParams());
    }
}
