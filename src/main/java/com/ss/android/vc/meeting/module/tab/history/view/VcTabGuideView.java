package com.ss.android.vc.meeting.module.tab.history.view;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.p034e.p035a.C0978a;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.vc.common.p3083e.C60773o;
import com.ss.android.vc.dependency.ar;
import com.ss.android.vc.meeting.module.tab.history.view.VcTabGuideView;
import java.util.LinkedList;
import java.util.List;

public class VcTabGuideView extends FrameLayout {

    /* renamed from: a */
    private final int f159670a = 240;

    /* renamed from: b */
    private List<C63298a> f159671b = new LinkedList();

    /* renamed from: c */
    private AbstractC63299b f159672c;

    /* renamed from: d */
    private View f159673d;

    /* renamed from: e */
    private View f159674e;

    /* renamed from: f */
    private View f159675f;

    /* renamed from: g */
    private View f159676g;

    /* renamed from: h */
    private TextView f159677h;

    /* renamed from: i */
    private TextView f159678i;

    /* renamed from: j */
    private TextView f159679j;

    /* renamed from: k */
    private int f159680k;

    /* renamed from: l */
    private int f159681l = 0;

    /* renamed from: m */
    private BroadcastReceiver f159682m = new BroadcastReceiver() {
        /* class com.ss.android.vc.meeting.module.tab.history.view.VcTabGuideView.C632951 */

        public void onReceive(Context context, Intent intent) {
            if ("action.broadcast.orientation".equals(intent.getAction())) {
                intent.getBooleanExtra("orientation_landscape", false);
                VcTabGuideView.this.post(new Runnable() {
                    /* class com.ss.android.vc.meeting.module.tab.history.view.VcTabGuideView.C632951.RunnableC632961 */

                    public void run() {
                        VcTabGuideView.this.mo219047a();
                    }
                });
            }
        }
    };

    /* renamed from: com.ss.android.vc.meeting.module.tab.history.view.VcTabGuideView$b */
    public interface AbstractC63299b {
        /* renamed from: a */
        void mo218688a();
    }

    /* renamed from: e */
    private boolean m247941e() {
        if (CollectionUtils.isEmpty(this.f159671b) || this.f159671b.size() != 1) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public void mo219049b() {
        setVisibility(8);
        AbstractC63299b bVar = this.f159672c;
        if (bVar != null) {
            bVar.mo218688a();
        }
        C0978a.m4782a(ar.m236694a()).mo4990a(this.f159682m);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C0978a.m4782a(ar.m236694a()).mo4990a(this.f159682m);
    }

    /* renamed from: d */
    private void m247940d() {
        this.f159677h.setText(this.f159671b.get(this.f159680k).f159686a);
        this.f159678i.setText(String.format("%d/%d", Integer.valueOf(this.f159680k + 1), Integer.valueOf(this.f159671b.size())));
    }

    private int getGuideWidth() {
        return Math.max((int) (Math.min(this.f159677h.getPaint().measureText(this.f159671b.get(this.f159680k).f159686a), (float) C60773o.m236115a(240.0d)) + ((float) C60773o.m236115a(40.0d)) + 1.0f), C60773o.m236115a(200.0d));
    }

    /* renamed from: c */
    private void m247939c() {
        LayoutInflater.from(getContext()).inflate(R.layout.view_guide_in_tab, (ViewGroup) this, true);
        this.f159673d = findViewById(R.id.settings_guide_content);
        this.f159674e = findViewById(R.id.layout_guide_op);
        this.f159678i = (TextView) findViewById(R.id.tv_page);
        this.f159676g = findViewById(R.id.btn_skip);
        this.f159679j = (TextView) findViewById(R.id.btn_next);
        this.f159675f = findViewById(R.id.view_arrow);
        this.f159677h = (TextView) findViewById(R.id.tv_guide_txt);
        this.f159681l = C60773o.m236115a(15.0d);
        setVisibility(4);
        C0978a.m4782a(ar.m236694a()).mo4991a(this.f159682m, new IntentFilter("action.broadcast.orientation"));
    }

    /* renamed from: a */
    public void mo219047a() {
        if (CollectionUtils.isEmpty(this.f159671b)) {
            setVisibility(4);
            return;
        }
        View view = this.f159671b.get(this.f159680k).f159687b;
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int[] iArr2 = new int[2];
        getLocationOnScreen(iArr2);
        int i = iArr[0] - iArr2[0];
        int width = ((view.getWidth() / 2) + i) - (this.f159681l / 2);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f159675f.getLayoutParams();
        marginLayoutParams.setMargins(width, 0, 0, 0);
        this.f159675f.setLayoutParams(marginLayoutParams);
        int guideWidth = getGuideWidth();
        int width2 = i + view.getWidth();
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.f159673d.getLayoutParams();
        marginLayoutParams2.setMargins(0, UIHelper.dp2px(7.0f), Math.max(getWidth() - ((width2 - (view.getWidth() / 2)) + (guideWidth / 2)), C60773o.m236115a(8.0d)), 0);
        marginLayoutParams2.width = guideWidth;
        this.f159673d.setLayoutParams(marginLayoutParams2);
        m247940d();
        setVisibility(0);
        if (m247941e()) {
            this.f159674e.setVisibility(8);
        } else {
            this.f159674e.setVisibility(0);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m247937a(View view) {
        mo219049b();
    }

    public void setDismissListener(AbstractC63299b bVar) {
        this.f159672c = bVar;
    }

    public VcTabGuideView(Context context) {
        super(context);
        m247939c();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m247938b(View view) {
        if (this.f159680k >= this.f159671b.size() - 1) {
            mo219049b();
            return;
        }
        this.f159680k++;
        mo219047a();
        if (this.f159680k == this.f159671b.size() - 1) {
            this.f159676g.setVisibility(8);
            this.f159679j.setText(R.string.View_G_GotItButton);
        }
    }

    /* renamed from: a */
    public void mo219048a(List<C63298a> list) {
        if (CollectionUtils.isEmpty(list)) {
            setVisibility(4);
            return;
        }
        this.f159680k = 0;
        this.f159671b.clear();
        this.f159671b.addAll(list);
        getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() {
            /* class com.ss.android.vc.meeting.module.tab.history.view.VcTabGuideView.ViewTreeObserver$OnPreDrawListenerC632972 */

            /* access modifiers changed from: private */
            /* renamed from: a */
            public /* synthetic */ void m247945a() {
                VcTabGuideView.this.mo219047a();
            }

            public boolean onPreDraw() {
                VcTabGuideView.this.getViewTreeObserver().removeOnPreDrawListener(this);
                if (!VcTabGuideView.this.isShown()) {
                    return false;
                }
                VcTabGuideView.this.post(new Runnable() {
                    /* class com.ss.android.vc.meeting.module.tab.history.view.$$Lambda$VcTabGuideView$2$iRvw62RoiFL9W17s5J1SdL464Ms */

                    public final void run() {
                        VcTabGuideView.ViewTreeObserver$OnPreDrawListenerC632972.this.m247945a();
                    }
                });
                return false;
            }
        });
        this.f159679j.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.vc.meeting.module.tab.history.view.$$Lambda$VcTabGuideView$hJbOejNcHQyzL9YU4Bk8iHo5HAw */

            public final void onClick(View view) {
                VcTabGuideView.this.m247938b(view);
            }
        });
        this.f159676g.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.vc.meeting.module.tab.history.view.$$Lambda$VcTabGuideView$50Ct58Y8OsLnYGizBndpy7oIg */

            public final void onClick(View view) {
                VcTabGuideView.this.m247937a((VcTabGuideView) view);
            }
        });
        mo219047a();
    }

    /* renamed from: com.ss.android.vc.meeting.module.tab.history.view.VcTabGuideView$a */
    public static class C63298a {

        /* renamed from: a */
        public String f159686a;

        /* renamed from: b */
        public View f159687b;

        public C63298a(String str, View view) {
            this.f159686a = str;
            this.f159687b = view;
        }
    }

    public VcTabGuideView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m247939c();
    }

    public VcTabGuideView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m247939c();
    }
}
