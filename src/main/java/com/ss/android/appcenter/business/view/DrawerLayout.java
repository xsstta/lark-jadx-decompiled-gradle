package com.ss.android.appcenter.business.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.framework.ui.BasePopupWindow;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.appcenter.business.view.DrawerLayout;
import com.ss.android.appcenter.common.adapter.p1288a.AbstractC28109a;
import com.ss.android.appcenter.common.adapter.p1288a.C28112d;
import com.ss.android.appcenter.common.util.C28184h;
import com.ss.android.appcenter.common.util.C28190k;
import java.util.List;

public class DrawerLayout extends BasePopupWindow {

    /* renamed from: a */
    public View f70378a;

    /* renamed from: b */
    public AbstractC28103b f70379b;

    /* renamed from: c */
    private Context f70380c;

    /* renamed from: d */
    private View f70381d;

    /* renamed from: e */
    private View f70382e;

    /* renamed from: f */
    private List<String> f70383f;

    /* renamed from: g */
    private int f70384g;

    /* renamed from: h */
    private String f70385h;

    /* renamed from: com.ss.android.appcenter.business.view.DrawerLayout$b */
    public interface AbstractC28103b {
        void onTabSelected(int i);
    }

    /* access modifiers changed from: package-private */
    public static class AlphaAnimatorWrapper {
        View view;

        public float getAlpha() {
            View view2 = this.view;
            if (view2 == null) {
                return BitmapDescriptorFactory.HUE_RED;
            }
            return view2.getAlpha();
        }

        public AlphaAnimatorWrapper(View view2) {
            this.view = view2;
        }

        public void setAlpha(float f) {
            View view2 = this.view;
            if (view2 != null) {
                view2.setAlpha(f);
            }
        }
    }

    @Override // com.larksuite.framework.ui.BasePopupWindow
    public void dismiss() {
        C28184h.m103250d("DrawerLayout", "start dismiss.");
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(this.f70382e, "translationX", (float) UIUtils.dp2px(this.f70380c, 295.0f)), ObjectAnimator.ofFloat(new AlphaAnimatorWrapper(this.f70378a), "alpha", 1.0f, BitmapDescriptorFactory.HUE_RED));
        animatorSet.addListener(new AnimatorListenerAdapter() {
            /* class com.ss.android.appcenter.business.view.DrawerLayout.C281012 */

            public void onAnimationEnd(Animator animator) {
                C28184h.m103250d("DrawerLayout", "final dismiss.");
                if (DrawerLayout.this.f70378a != null) {
                    DrawerLayout.this.f70378a.setVisibility(8);
                }
                DrawerLayout.super.dismiss();
            }
        });
        animatorSet.setDuration(200L).start();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m102762b(View view) {
        dismiss();
    }

    /* renamed from: a */
    public void mo100027a(View view) {
        if (view != null) {
            showAtLocation(view.getRootView(), 0, C28190k.m103260b(this.f70380c) - getWidth(), 0);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(ObjectAnimator.ofFloat(this.f70382e, "translationX", (float) UIUtils.dp2px(this.f70380c, 295.0f), 0.0f), ObjectAnimator.ofFloat(new AlphaAnimatorWrapper(this.f70378a), "alpha", BitmapDescriptorFactory.HUE_RED, 1.0f));
            animatorSet.addListener(new AnimatorListenerAdapter() {
                /* class com.ss.android.appcenter.business.view.DrawerLayout.C281001 */

                public void onAnimationStart(Animator animator) {
                    if (DrawerLayout.this.f70378a != null) {
                        DrawerLayout.this.f70378a.setVisibility(0);
                    }
                }
            });
            animatorSet.setDuration(200L).start();
        }
    }

    /* renamed from: a */
    private void m102760a(Context context) {
        boolean z;
        this.f70380c = context;
        View inflate = LayoutInflater.from(context).inflate(R.layout.appcenter_drawer_layout, (ViewGroup) null);
        this.f70381d = inflate;
        setContentView(inflate);
        TextView textView = (TextView) this.f70381d.findViewById(R.id.title);
        if (!TextUtils.isEmpty(this.f70385h)) {
            textView.setText(this.f70385h);
        }
        this.f70378a = this.f70381d.findViewById(R.id.v_bg_mask);
        this.f70382e = this.f70381d.findViewById(R.id.ll_drawer_content);
        RecyclerView recyclerView = (RecyclerView) this.f70381d.findViewById(R.id.recycler);
        recyclerView.setLayoutManager(new GridLayoutManager(this.f70380c, 2));
        recyclerView.setAdapter(new C28102a(this.f70383f, this.f70384g));
        setWidth(C28190k.m103260b(context));
        int screenHeight = UIUtils.getScreenHeight(context);
        setHeight(screenHeight);
        int d = C28190k.m103262d(context);
        int c = C28190k.m103261c(context);
        int a = C28190k.m103259a(context);
        if (c + a + d > screenHeight && a + d > screenHeight) {
            z = false;
        } else {
            z = true;
        }
        View view = this.f70382e;
        if (!z) {
            d = 0;
        }
        view.setPadding(0, c, 0, d);
        setTouchable(true);
        setFocusable(true);
        setOutsideTouchable(true);
        setBackgroundDrawable(new BitmapDrawable((Resources) null, (Bitmap) null));
        setClippingEnabled(false);
        this.f70378a.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.appcenter.business.view.$$Lambda$DrawerLayout$lwMruVA64PvTNlzTlbGfO2h3iM */

            public final void onClick(View view) {
                DrawerLayout.this.m102762b(view);
            }
        });
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.appcenter.business.view.DrawerLayout$a */
    public class C28102a extends AbstractC28109a<String, C28112d> {

        /* renamed from: b */
        private int f70389b;

        /* access modifiers changed from: private */
        @Override // com.ss.android.appcenter.common.adapter.p1288a.AbstractC28109a
        /* renamed from: a */
        public /* synthetic */ void m102764a(int i, View view) {
            DrawerLayout.this.dismiss();
            DrawerLayout.this.f70379b.onTabSelected(i);
        }

        /* access modifiers changed from: protected */
        @Override // com.ss.android.appcenter.common.adapter.p1288a.AbstractC28109a
        /* renamed from: a */
        public C28112d mo98307a(ViewGroup viewGroup, int i) {
            return new C28112d(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.appcenter_drawer_item_layout, viewGroup, false));
        }

        /* access modifiers changed from: protected */
        @Override // com.ss.android.appcenter.common.adapter.p1288a.AbstractC28109a
        /* renamed from: a */
        public void mo98309a(C28112d dVar, int i) {
            boolean z;
            ((TextView) dVar.mo100072a(R.id.name)).setText((CharSequence) mo100065b(i));
            dVar.mo100071a().setOnClickListener(new View.OnClickListener(i) {
                /* class com.ss.android.appcenter.business.view.$$Lambda$DrawerLayout$a$sUBtom9gsLy9W5IZzjXpvu9TGps */
                public final /* synthetic */ int f$1;

                {
                    this.f$1 = r2;
                }

                public final void onClick(View view) {
                    DrawerLayout.C28102a.this.m102764a((DrawerLayout.C28102a) this.f$1, (int) view);
                }
            });
            View a = dVar.mo100071a();
            if (this.f70389b == i) {
                z = true;
            } else {
                z = false;
            }
            a.setSelected(z);
        }

        public C28102a(List<String> list, int i) {
            super(list);
            this.f70389b = i;
        }
    }

    public DrawerLayout(Context context, List<String> list, AbstractC28103b bVar, int i, String str) {
        super(context);
        this.f70383f = list;
        this.f70379b = bVar;
        this.f70384g = i;
        this.f70385h = str;
        m102760a(context);
    }
}
