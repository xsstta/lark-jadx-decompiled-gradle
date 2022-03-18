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

public class LiveSettingGuideView extends FrameLayout {

    /* renamed from: a */
    public TextView f152054a;

    /* renamed from: b */
    private final int f152055b = 240;

    /* renamed from: c */
    private List<C60808a> f152056c = new LinkedList();

    /* renamed from: d */
    private View f152057d;

    /* renamed from: e */
    private AbstractC60809b f152058e;

    /* renamed from: f */
    private View f152059f;

    /* renamed from: g */
    private View f152060g;

    /* renamed from: h */
    private View f152061h;

    /* renamed from: i */
    private ImageView f152062i;

    /* renamed from: j */
    private VCGuideMaskView f152063j;

    /* renamed from: k */
    private ThemeMode f152064k = ThemeMode.LIGHT;

    /* renamed from: l */
    private int f152065l;

    public enum ThemeMode {
        DARK,
        LIGHT
    }

    /* renamed from: com.ss.android.vc.common.widget.LiveSettingGuideView$b */
    public interface AbstractC60809b {
        void onDismiss();
    }

    public View getAnchorView() {
        return this.f152057d;
    }

    /* renamed from: b */
    public void mo208462b() {
        setVisibility(8);
        this.f152065l = 0;
        AbstractC60809b bVar = this.f152058e;
        if (bVar != null) {
            bVar.onDismiss();
        }
    }

    /* renamed from: e */
    private boolean m236336e() {
        if (CollectionUtils.isEmpty(this.f152056c) || this.f152056c.size() != 1) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    private void m236335d() {
        String str = this.f152056c.get(this.f152065l).f152067a;
        C60700b.m235851b("LiveSettingGuideView", "[completeCurrentGuide]", "Key: " + str);
        VideoChatModuleDependency.getGuideDependency().completeGuide(str, true);
    }

    private int getGuideWidth() {
        if (m236336e()) {
            return Math.max((int) (Math.min(getSingleGuideMaxWidth(), (float) C60773o.m236115a(240.0d)) + ((float) C60773o.m236115a(40.0d)) + 1.0f), C60773o.m236115a(160.0d));
        }
        return C60773o.m236115a(280.0d);
    }

    private float getSingleGuideMaxWidth() {
        int lineCount = this.f152054a.getLineCount();
        if (lineCount == 0) {
            return (float) C60773o.m236115a(240.0d);
        }
        float f = BitmapDescriptorFactory.HUE_RED;
        Layout layout = this.f152054a.getLayout();
        for (int i = 0; i < lineCount; i++) {
            f = Math.max(f, layout.getLineWidth(i));
        }
        return f;
    }

    /* renamed from: c */
    private void m236334c() {
        LayoutInflater.from(getContext()).inflate(R.layout.view_guide_in_meeting, (ViewGroup) this, true);
        this.f152063j = (VCGuideMaskView) findViewById(R.id.view_mask);
        this.f152059f = findViewById(R.id.layout_settings_more_guide);
        this.f152060g = findViewById(R.id.settings_guide_content);
        this.f152061h = findViewById(R.id.layout_guide_op);
        this.f152062i = (ImageView) findViewById(R.id.view_arrow);
        this.f152054a = (TextView) findViewById(R.id.tv_guide_txt);
        this.f152061h.setVisibility(8);
        this.f152063j.setVisibility(8);
        setVisibility(4);
    }

    /* renamed from: a */
    public void m236337f() {
        setVisibility(0);
        Rect rect = new Rect();
        this.f152057d.getGlobalVisibleRect(rect);
        Rect rect2 = new Rect();
        getGlobalVisibleRect(rect2);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f152059f.getLayoutParams();
        marginLayoutParams.bottomMargin = rect2.height() - (rect.top - rect2.top);
        this.f152059f.setLayoutParams(marginLayoutParams);
        int i = rect.left - rect2.left;
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f152062i.getLayoutParams();
        layoutParams.setMargins(C60773o.m236115a(16.0d) + i, C60773o.m236115a(-1.0d), 0, 0);
        this.f152062i.setLayoutParams(layoutParams);
        int guideWidth = getGuideWidth();
        int width = i + this.f152057d.getWidth();
        int i2 = guideWidth / 2;
        int width2 = getWidth() - ((width - (this.f152057d.getWidth() / 2)) + i2);
        int width3 = (width - (this.f152057d.getWidth() / 2)) - i2;
        int a = C60773o.m236115a(16.0d);
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f152060g.getLayoutParams();
        if (width3 < a || width2 < a) {
            if (width3 < a) {
                layoutParams2.setMargins(a, 0, 0, 0);
                layoutParams2.gravity = 3;
            }
            if (width2 < a) {
                layoutParams2.setMargins(0, 0, a, 0);
                layoutParams2.gravity = 5;
            }
        } else {
            layoutParams2.setMargins(width3, 0, 0, 0);
            layoutParams2.gravity = 3;
        }
        layoutParams2.width = guideWidth;
        this.f152060g.setLayoutParams(layoutParams2);
    }

    public void setDismissListener(AbstractC60809b bVar) {
        this.f152058e = bVar;
    }

    public LiveSettingGuideView(Context context) {
        super(context);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 0 && m236336e()) {
            m236335d();
            mo208462b();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    /* renamed from: com.ss.android.vc.common.widget.LiveSettingGuideView$a */
    public static class C60808a {

        /* renamed from: a */
        public String f152067a;

        /* renamed from: b */
        public String f152068b;

        public C60808a(String str, String str2) {
            this.f152067a = str;
            this.f152068b = str2;
        }
    }

    public LiveSettingGuideView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    public void mo208461a(View view, List<C60808a> list) {
        if (CollectionUtils.isEmpty(list)) {
            setVisibility(8);
            return;
        }
        removeAllViews();
        m236334c();
        this.f152057d = view;
        this.f152056c.clear();
        this.f152056c.addAll(list);
        this.f152065l = 0;
        if (m236336e()) {
            this.f152054a.setText(this.f152056c.get(0).f152068b);
            this.f152054a.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() {
                /* class com.ss.android.vc.common.widget.LiveSettingGuideView.ViewTreeObserver$OnPreDrawListenerC608071 */

                public boolean onPreDraw() {
                    int lineCount = LiveSettingGuideView.this.f152054a.getLineCount();
                    C60700b.m235851b("LiveSettingGuideView", "[showGuides]", "onPreDraw count=" + lineCount);
                    if (lineCount == 0) {
                        return false;
                    }
                    LiveSettingGuideView.this.f152054a.getViewTreeObserver().removeOnPreDrawListener(this);
                    LiveSettingGuideView.this.m236337f();
                    return false;
                }
            });
        } else {
            m236337f();
        }
        view.addOnLayoutChangeListener(new View.OnLayoutChangeListener() {
            /* class com.ss.android.vc.common.widget.$$Lambda$LiveSettingGuideView$pYITnmApL0mWuw_cXFk7z7qMRdM */

            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                LiveSettingGuideView.lambda$pYITnmApL0mWuw_cXFk7z7qMRdM(LiveSettingGuideView.this, view, i, i2, i3, i4, i5, i6, i7, i8);
            }
        });
    }

    public LiveSettingGuideView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m236333a(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (isShown()) {
            post(new Runnable() {
                /* class com.ss.android.vc.common.widget.$$Lambda$LiveSettingGuideView$OzylyvkyFIQgDUmvQ1snvrAgiTQ */

                public final void run() {
                    LiveSettingGuideView.lambda$OzylyvkyFIQgDUmvQ1snvrAgiTQ(LiveSettingGuideView.this);
                }
            });
        }
    }
}
