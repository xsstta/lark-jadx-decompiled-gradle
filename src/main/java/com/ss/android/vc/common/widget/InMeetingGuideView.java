package com.ss.android.vc.common.widget;

import android.content.Context;
import android.graphics.Rect;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.suite.R;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60773o;
import com.ss.android.vc.dependency.VideoChatModuleDependency;
import java.util.LinkedList;
import java.util.List;

public class InMeetingGuideView extends FrameLayout {

    /* renamed from: a */
    public TextView f152020a;

    /* renamed from: b */
    private final int f152021b = 240;

    /* renamed from: c */
    private List<C60800a> f152022c = new LinkedList();

    /* renamed from: d */
    private View f152023d;

    /* renamed from: e */
    private AbstractC60801b f152024e;

    /* renamed from: f */
    private View f152025f;

    /* renamed from: g */
    private View f152026g;

    /* renamed from: h */
    private View f152027h;

    /* renamed from: i */
    private View f152028i;

    /* renamed from: j */
    private ImageView f152029j;

    /* renamed from: k */
    private TextView f152030k;

    /* renamed from: l */
    private TextView f152031l;

    /* renamed from: m */
    private VCGuideMaskView f152032m;

    /* renamed from: n */
    private ThemeMode f152033n = ThemeMode.LIGHT;

    /* renamed from: o */
    private int f152034o;

    /* renamed from: p */
    private int f152035p = 0;

    public enum ThemeMode {
        DARK,
        LIGHT
    }

    /* renamed from: com.ss.android.vc.common.widget.InMeetingGuideView$b */
    public interface AbstractC60801b {
        void onDismiss();
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static /* synthetic */ void m236314c(View view) {
    }

    public View getAnchorView() {
        return this.f152023d;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public void m236320i() {
        m236312b(false);
    }

    /* renamed from: h */
    private boolean m236319h() {
        if (CollectionUtils.isEmpty(this.f152022c) || this.f152022c.size() != 1) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public void mo208436a() {
        setVisibility(8);
        this.f152034o = 0;
        AbstractC60801b bVar = this.f152024e;
        if (bVar != null) {
            bVar.onDismiss();
        }
    }

    /* renamed from: c */
    private void m236313c() {
        if (this.f152033n == ThemeMode.LIGHT) {
            this.f152026g.setBackground(C60773o.m236128f(R.drawable.subtitle_tip_body_bg));
            this.f152029j.setImageResource(R.drawable.vc_tip_down_arrow);
            return;
        }
        this.f152026g.setBackground(C60773o.m236128f(R.drawable.guide_view_dark_bg));
        this.f152029j.setImageResource(R.drawable.vc_dark_tip_down_arrow);
    }

    /* renamed from: f */
    private void m236317f() {
        String str = this.f152022c.get(this.f152034o).f152038a;
        C60700b.m235851b("InMeetingGuideView", "[completeCurrentGuide]", "Key: " + str);
        VideoChatModuleDependency.getGuideDependency().completeGuide(str, true);
    }

    /* renamed from: g */
    private void m236318g() {
        for (int i = this.f152034o; i < this.f152022c.size(); i++) {
            String str = this.f152022c.get(i).f152038a;
            C60700b.m235851b("InMeetingGuideView", "[completeAllGuide]", "Key: " + str);
            VideoChatModuleDependency.getGuideDependency().completeGuide(str, true);
        }
    }

    private int getGuideWidth() {
        if (m236319h()) {
            return Math.max((int) (Math.min(getSingleGuideMaxWidth(), (float) C60773o.m236115a(240.0d)) + ((float) C60773o.m236115a(40.0d)) + 1.0f), C60773o.m236115a(160.0d));
        }
        return C60773o.m236115a(280.0d);
    }

    private float getSingleGuideMaxWidth() {
        int lineCount = this.f152020a.getLineCount();
        if (lineCount == 0) {
            return (float) C60773o.m236115a(240.0d);
        }
        float f = BitmapDescriptorFactory.HUE_RED;
        Layout layout = this.f152020a.getLayout();
        for (int i = 0; i < lineCount; i++) {
            f = Math.max(f, layout.getLineWidth(i));
        }
        return f;
    }

    /* renamed from: b */
    private void m236310b() {
        LayoutInflater.from(getContext()).inflate(R.layout.view_guide_in_meeting, (ViewGroup) this, true);
        this.f152032m = (VCGuideMaskView) findViewById(R.id.view_mask);
        this.f152025f = findViewById(R.id.layout_settings_more_guide);
        this.f152026g = findViewById(R.id.settings_guide_content);
        this.f152027h = findViewById(R.id.layout_guide_op);
        this.f152030k = (TextView) findViewById(R.id.tv_page);
        this.f152028i = findViewById(R.id.btn_skip);
        this.f152031l = (TextView) findViewById(R.id.btn_next);
        this.f152029j = (ImageView) findViewById(R.id.view_arrow);
        this.f152020a = (TextView) findViewById(R.id.tv_guide_txt);
        this.f152035p = C60773o.m236115a(15.0d);
        m236313c();
        setVisibility(4);
    }

    /* renamed from: e */
    private void m236316e() {
        if (this.f152034o < this.f152022c.size()) {
            this.f152020a.setText(this.f152022c.get(this.f152034o).f152039b);
            this.f152030k.setText(String.format("%d/%d", Integer.valueOf(this.f152034o + 1), Integer.valueOf(this.f152022c.size())));
        }
    }

    public void setDismissListener(AbstractC60801b bVar) {
        this.f152024e = bVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m236308a(View view) {
        m236318g();
        mo208436a();
    }

    public void setThemeMode(ThemeMode themeMode) {
        this.f152033n = themeMode;
        m236313c();
    }

    public InMeetingGuideView(Context context) {
        super(context);
        m236310b();
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 0 && m236319h()) {
            m236317f();
            mo208436a();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m236311b(View view) {
        if (this.f152034o == this.f152022c.size() - 1) {
            m236317f();
            mo208436a();
            return;
        }
        m236317f();
        this.f152034o++;
        m236316e();
        if (this.f152034o == this.f152022c.size() - 1) {
            this.f152028i.setVisibility(8);
            this.f152031l.setText(R.string.View_G_GotItButton);
        }
    }

    /* renamed from: a */
    public void m236312b(boolean z) {
        setVisibility(0);
        Rect rect = new Rect();
        this.f152023d.getGlobalVisibleRect(rect);
        Rect rect2 = new Rect();
        getGlobalVisibleRect(rect2);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f152025f.getLayoutParams();
        if (z) {
            marginLayoutParams.bottomMargin = (rect2.height() - (rect.top - rect2.top)) - C60773o.m236115a(8.0d);
        } else {
            marginLayoutParams.bottomMargin = rect2.height() - (rect.top - rect2.top);
        }
        this.f152025f.setLayoutParams(marginLayoutParams);
        int i = rect.left - rect2.left;
        int width = ((this.f152023d.getWidth() / 2) + i) - (this.f152035p / 2);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f152029j.getLayoutParams();
        layoutParams.setMargins(width, C60773o.m236115a(-1.0d), 0, 0);
        this.f152029j.setLayoutParams(layoutParams);
        int guideWidth = getGuideWidth();
        int width2 = this.f152023d.getWidth() + i;
        int i2 = guideWidth / 2;
        int width3 = getWidth() - ((width2 - (this.f152023d.getWidth() / 2)) + i2);
        int width4 = (width2 - (this.f152023d.getWidth() / 2)) - i2;
        this.f152032m.mo208543a(i + (this.f152023d.getWidth() / 2), rect.top + (this.f152023d.getHeight() / 2), Math.min(this.f152023d.getWidth(), this.f152023d.getHeight()) / 2);
        int a = C60773o.m236115a(8.0d);
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f152026g.getLayoutParams();
        if (width4 < a || width3 < a) {
            if (width4 < a) {
                layoutParams2.setMargins(a, 0, 0, 0);
                layoutParams2.gravity = 3;
            }
            if (width3 < a) {
                layoutParams2.setMargins(0, 0, a, 0);
                layoutParams2.gravity = 5;
            }
        } else {
            layoutParams2.setMargins(width4, 0, 0, 0);
            layoutParams2.gravity = 3;
        }
        layoutParams2.width = guideWidth;
        this.f152026g.setLayoutParams(layoutParams2);
        if (m236319h()) {
            this.f152027h.setVisibility(8);
            this.f152032m.setVisibility(8);
            return;
        }
        C60700b.m235851b("InMeetingGuideView", "[showGuidesInternal]", "Touch is disabled.");
        setOnClickListener($$Lambda$InMeetingGuideView$LOun_EJvcys6OtbIRWksAsxXzA.INSTANCE);
        this.f152027h.setVisibility(0);
        m236316e();
        this.f152031l.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.vc.common.widget.$$Lambda$InMeetingGuideView$_L58GRO1w6WdkSxzMsQZ0fi787k */

            public final void onClick(View view) {
                InMeetingGuideView.this.m236311b((InMeetingGuideView) view);
            }
        });
        this.f152028i.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.vc.common.widget.$$Lambda$InMeetingGuideView$yN4KhfmTeSjJmx5_jnmSSSor58 */

            public final void onClick(View view) {
                InMeetingGuideView.this.m236308a((InMeetingGuideView) view);
            }
        });
    }

    /* renamed from: com.ss.android.vc.common.widget.InMeetingGuideView$a */
    public static class C60800a {

        /* renamed from: a */
        public String f152038a;

        /* renamed from: b */
        public String f152039b;

        public C60800a(String str, String str2) {
            this.f152038a = str;
            this.f152039b = str2;
        }
    }

    /* renamed from: b */
    public void mo208441b(View view, List<C60800a> list) {
        mo208438a(view, list, false);
    }

    public InMeetingGuideView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m236310b();
    }

    /* renamed from: a */
    public void mo208440a(boolean z, boolean z2) {
        C60700b.m235851b("InMeetingGuideView", "[onOrientation]", " isLandscape :  " + z + " isRotate : " + z2);
        if (isShown()) {
            post(new Runnable() {
                /* class com.ss.android.vc.common.widget.$$Lambda$InMeetingGuideView$IJmwymXiyXbIFimSOcknlzaEMp0 */

                public final void run() {
                    InMeetingGuideView.this.m236320i();
                }
            });
        }
    }

    /* renamed from: a */
    public void mo208437a(View view, List<C60800a> list) {
        if (!CollectionUtils.isEmpty(list) && getVisibility() != 8) {
            this.f152022c.addAll(list);
            LinkedList linkedList = new LinkedList();
            linkedList.addAll(this.f152022c);
            mo208441b(view, linkedList);
            if (this.f152034o < this.f152022c.size() - 1) {
                this.f152028i.setVisibility(0);
                this.f152031l.setText(R.string.View_G_NextOne);
                return;
            }
            this.f152028i.setVisibility(8);
            this.f152031l.setText(R.string.View_G_GotItButton);
        }
    }

    public InMeetingGuideView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m236310b();
    }

    /* renamed from: a */
    public void mo208438a(View view, List<C60800a> list, final boolean z) {
        if (CollectionUtils.isEmpty(list)) {
            setVisibility(8);
            return;
        }
        removeAllViews();
        m236310b();
        this.f152023d = view;
        this.f152022c.clear();
        this.f152022c.addAll(list);
        this.f152034o = 0;
        if (m236319h()) {
            this.f152020a.setText(this.f152022c.get(0).f152039b);
            this.f152020a.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() {
                /* class com.ss.android.vc.common.widget.InMeetingGuideView.ViewTreeObserver$OnPreDrawListenerC607991 */

                public boolean onPreDraw() {
                    int lineCount = InMeetingGuideView.this.f152020a.getLineCount();
                    C60700b.m235851b("InMeetingGuideView", "[showGuides]", "onPreDraw count=" + lineCount);
                    if (lineCount == 0) {
                        return false;
                    }
                    InMeetingGuideView.this.f152020a.getViewTreeObserver().removeOnPreDrawListener(this);
                    InMeetingGuideView.this.m236312b(z);
                    return false;
                }
            });
        } else {
            m236312b(z);
        }
        view.addOnLayoutChangeListener(new View.OnLayoutChangeListener(z) {
            /* class com.ss.android.vc.common.widget.$$Lambda$InMeetingGuideView$k9eDJO41juu5_FDjca_9L3Sf27A */
            public final /* synthetic */ boolean f$1;

            {
                this.f$1 = r2;
            }

            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                InMeetingGuideView.this.m236309a(this.f$1, view, i, i2, i3, i4, i5, i6, i7, i8);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m236309a(boolean z, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (isShown()) {
            post(new Runnable(z) {
                /* class com.ss.android.vc.common.widget.$$Lambda$InMeetingGuideView$Klq4eLaQjLsOqql3JNAxNPG7Y */
                public final /* synthetic */ boolean f$1;

                {
                    this.f$1 = r2;
                }

                public final void run() {
                    InMeetingGuideView.this.m236312b((InMeetingGuideView) this.f$1);
                }
            });
        }
    }
}
