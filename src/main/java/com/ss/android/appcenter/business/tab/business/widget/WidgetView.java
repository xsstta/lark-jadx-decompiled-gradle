package com.ss.android.appcenter.business.tab.business.widget;

import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import com.bytedance.ee.ref.card.meta.CardAppInfo;
import com.bytedance.ee.ref.card.p686a.AbstractC13508d;
import com.bytedance.ee.ref.card.p686a.C13500a;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonSyntaxException;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.larksuite.component.ui.imageview.LKUIBadgeView;
import com.larksuite.component.universe_design.color.UDColorUtils;
import com.larksuite.component.universe_design.icon.UDIconUtils;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.p078b.p079a.AbstractC2055e;
import com.p078b.p079a.C2052c;
import com.ss.android.appcenter.business.monitor.p1269a.C27700a;
import com.ss.android.appcenter.business.monitor.p1269a.C27702b;
import com.ss.android.appcenter.business.monitor.statistics.C27710b;
import com.ss.android.appcenter.business.net.dto.ItemInfo;
import com.ss.android.appcenter.business.p1265a.C27569b;
import com.ss.android.appcenter.business.p1265a.C27576e;
import com.ss.android.appcenter.business.p1265a.C27577f;
import com.ss.android.appcenter.business.p1268b.C27688a;
import com.ss.android.appcenter.business.tab.business.widget.C27971l;
import com.ss.android.appcenter.business.tab.business.widget.WidgetView;
import com.ss.android.appcenter.business.view.StatusController;
import com.ss.android.appcenter.business.view.ViewWrapper;
import com.ss.android.appcenter.common.util.C28184h;
import com.ss.android.appcenter.common.util.C28190k;
import com.ss.android.appcenter.common.util.C28191l;
import com.ss.android.appcenter.common.util.C28209p;
import com.ss.android.appcenter.p1262a.p1263a.C27548m;
import com.ss.android.lark.opmonitor.service.OPMonitor;
import com.ss.android.lark.utils.UIHelper;
import org.json.JSONObject;

public class WidgetView extends FrameLayout {

    /* renamed from: A */
    private FrameLayout f69862A;

    /* renamed from: B */
    private ImageView f69863B;

    /* renamed from: C */
    private LinearLayout f69864C;

    /* renamed from: D */
    private LKUIBadgeView f69865D;

    /* renamed from: E */
    private final int f69866E;

    /* renamed from: F */
    private final Path f69867F;

    /* renamed from: G */
    private final RectF f69868G;

    /* renamed from: H */
    private boolean f69869H;

    /* renamed from: I */
    private String f69870I;

    /* renamed from: J */
    private String f69871J;

    /* renamed from: K */
    private WidgetData f69872K;

    /* renamed from: L */
    private HandlerC27948a f69873L;

    /* renamed from: M */
    private C27971l.AbstractC27972a f69874M;

    /* renamed from: N */
    private boolean f69875N;

    /* renamed from: O */
    private boolean f69876O;

    /* renamed from: P */
    private boolean f69877P;

    /* renamed from: Q */
    private C27576e f69878Q;

    /* renamed from: R */
    private String f69879R;

    /* renamed from: S */
    private boolean f69880S;

    /* renamed from: T */
    private boolean f69881T;

    /* renamed from: U */
    private Runnable f69882U;

    /* renamed from: a */
    public ConstraintLayout f69883a;

    /* renamed from: b */
    public ImageView f69884b;

    /* renamed from: c */
    public TextView f69885c;

    /* renamed from: d */
    public FrameLayout f69886d;

    /* renamed from: e */
    AbstractC2055e f69887e;

    /* renamed from: f */
    public LinearLayout f69888f;

    /* renamed from: g */
    public FrameLayout f69889g;

    /* renamed from: h */
    public ImageView f69890h;

    /* renamed from: i */
    public ViewStub f69891i;

    /* renamed from: j */
    public View f69892j;

    /* renamed from: k */
    public boolean f69893k;

    /* renamed from: l */
    public boolean f69894l;

    /* renamed from: m */
    public C13500a f69895m;

    /* renamed from: n */
    public String f69896n;

    /* renamed from: o */
    public String f69897o;

    /* renamed from: p */
    public C27965i f69898p;

    /* renamed from: q */
    public C27971l f69899q;

    /* renamed from: r */
    public boolean f69900r;

    /* renamed from: s */
    public StatusController f69901s;

    /* renamed from: t */
    public C27700a f69902t;

    /* renamed from: u */
    public boolean f69903u;

    /* renamed from: v */
    public C27950c f69904v;

    /* renamed from: w */
    public float f69905w;

    /* renamed from: x */
    public float f69906x;

    /* renamed from: y */
    public boolean f69907y;

    /* renamed from: z */
    public AbstractC27949b f69908z;

    /* renamed from: com.ss.android.appcenter.business.tab.business.widget.WidgetView$b */
    public interface AbstractC27949b {
        void onLongClick();
    }

    /* renamed from: a */
    public void mo99622a(String str, String str2, String str3) {
        this.f69896n = str3;
        this.f69897o = str;
        this.f69871J = str2;
    }

    /* renamed from: a */
    public void mo99621a(String str, Activity activity, LifecycleOwner lifecycleOwner, C27971l lVar) {
        if (!this.f69869H) {
            this.f69870I = str;
            m102019i();
            if (m102015a(str, activity, lifecycleOwner)) {
                this.f69869H = true;
                this.f69878Q.mo98250a(getLogTag(), "render card. showLoading");
                m102017c(this.f69870I);
                this.f69904v.mo99652a(this.f69893k);
                m102020j();
                m102013a(lVar);
                m102010a(activity, lifecycleOwner);
                this.f69878Q.mo98254b(getLogTag(), "renderTemplate");
                this.f69895m.mo50227a(this.f69870I);
                this.f69878Q.mo98254b(getLogTag(), "renderTemplate finish");
            }
        }
    }

    /* renamed from: a */
    public void mo99617a(ItemInfo itemInfo) {
        if (!this.f69893k) {
            this.f69885c.setText(itemInfo.getName());
            C27688a.m101210a(getContext(), itemInfo.getName(), itemInfo.getIconKey(), this.f69884b);
            boolean z = C27577f.m100657a(itemInfo) || !TextUtils.isEmpty(this.f69879R);
            this.f69864C.setClickable(z);
            if (z) {
                this.f69864C.setOnClickListener(new View.OnClickListener(itemInfo) {
                    /* class com.ss.android.appcenter.business.tab.business.widget.$$Lambda$WidgetView$3rRRdu6_6oXe4HIj1DwdoTbJgGg */
                    public final /* synthetic */ ItemInfo f$1;

                    {
                        this.f$1 = r2;
                    }

                    public final void onClick(View view) {
                        WidgetView.lambda$3rRRdu6_6oXe4HIj1DwdoTbJgGg(WidgetView.this, this.f$1, view);
                    }
                });
            }
        }
    }

    /* renamed from: a */
    public void mo99618a(CardConfig cardConfig) {
        boolean z = true;
        if (!TextUtils.isEmpty(cardConfig.getMobileHeaderLinkUrl())) {
            this.f69879R = cardConfig.getMobileHeaderLinkUrl();
            if (!this.f69864C.isClickable()) {
                this.f69864C.setClickable(true);
            }
        }
        this.f69900r = cardConfig.isNeedRequestBusinessData();
        if (!cardConfig.isNeedRequestBusinessData()) {
            mo99620a("onGetCardConfig. need not to update. showLocalCard.");
            mo99631f();
        }
        if (!cardConfig.isWidgetCanExpand() || !C27548m.m100547m().mo98225i().mo98187a("lark.appcenter.widget.expand")) {
            z = false;
        }
        UICallbackExecutor.post(new Runnable(z) {
            /* class com.ss.android.appcenter.business.tab.business.widget.$$Lambda$WidgetView$H3ojtd_xDsRiSgS4a35qV_lYsg */
            public final /* synthetic */ boolean f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                WidgetView.m270215lambda$H3ojtd_xDsRiSgS4a35qV_lYsg(WidgetView.this, this.f$1);
            }
        });
    }

    /* renamed from: a */
    public void mo99619a(WidgetData widgetData) {
        if (!this.f69900r) {
            mo99620a("WidgetData onChanged. but widget need not to update.");
        } else if (widgetData == null || TextUtils.isEmpty(widgetData.getContent())) {
            mo99625b("WidgetData onChanged. data error." + widgetData);
            mo99627d();
            OPMonitor monitorCode = this.f69902t.setMonitorCode(C27702b.f69236g);
            monitorCode.setErrorMessage(getBaseErrorMsg() + "data error").flush();
        } else {
            this.f69872K = widgetData;
            mo99620a("WidgetData onChanged. " + widgetData + " showNetCard");
            mo99632g();
        }
    }

    /* renamed from: a */
    public void mo99623a(boolean z) {
        JsonObject jsonObject = new JsonObject();
        JsonObject jsonObject2 = new JsonObject();
        jsonObject2.addProperty("widgetVerticalMode", z ? "expand" : "fold");
        jsonObject.add("widgetContainerState", jsonObject2);
        this.f69895m.mo50257b(jsonObject.toString());
    }

    /* renamed from: a */
    public void mo99620a(String str) {
        C28184h.m103250d(getLogTag(), str);
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.appcenter.business.tab.business.widget.WidgetView$a */
    public class HandlerC27948a extends Handler {
        /* renamed from: a */
        public void mo99645a() {
            sendEmptyMessageDelayed(1, 30000);
        }

        /* renamed from: b */
        public void mo99646b() {
            removeMessages(1);
        }

        private HandlerC27948a() {
        }

        public void handleMessage(Message message) {
            if (message.what == 1 && WidgetView.this.f69901s.mo100039c()) {
                WidgetView.this.f69901s.mo100033a(StatusController.Status.ERROR);
                WidgetView.this.f69902t.setMonitorCode(C27702b.f69236g).setErrorMessage("workplace_widget_business_data_timeout").flush();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.appcenter.business.tab.business.widget.WidgetView$c */
    public class C27950c {

        /* renamed from: a */
        public boolean f69922a;

        /* renamed from: c */
        private int f69924c;

        /* renamed from: d */
        private int f69925d;

        /* renamed from: e */
        private int f69926e;

        /* renamed from: f */
        private int f69927f;

        /* renamed from: g */
        private int f69928g;

        /* renamed from: h */
        private float f69929h;

        /* renamed from: e */
        private void m102062e() {
            m102059b(this.f69924c);
        }

        /* renamed from: b */
        public void mo99653b() {
            m102058a(WidgetView.this.f69883a, -1, this.f69925d);
        }

        /* renamed from: a */
        public void mo99649a() {
            WidgetView.this.getLayoutParams().height = this.f69924c;
        }

        /* renamed from: d */
        public void mo99657d() {
            FrameLayout frameLayout = WidgetView.this.f69886d;
            int i = this.f69928g;
            frameLayout.setPadding(i, 0, i, 0);
            LinearLayout linearLayout = WidgetView.this.f69888f;
            int i2 = this.f69928g;
            linearLayout.setPadding(i2, 0, i2, 0);
            ((ViewGroup.MarginLayoutParams) WidgetView.this.f69888f.getLayoutParams()).topMargin = 0;
        }

        /* renamed from: c */
        public void mo99655c() {
            FrameLayout frameLayout = WidgetView.this.f69886d;
            int i = this.f69928g;
            frameLayout.setPadding(i, 0, i, 0);
            LinearLayout linearLayout = WidgetView.this.f69888f;
            int i2 = this.f69928g;
            linearLayout.setPadding(i2, 0, i2, 0);
            ((ViewGroup.MarginLayoutParams) WidgetView.this.f69888f.getLayoutParams()).topMargin = -this.f69928g;
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public /* synthetic */ void m102061c(View view) {
            mo99654b(!this.f69922a);
        }

        /* renamed from: b */
        private void m102059b(int i) {
            ObjectAnimator.ofInt(new ViewWrapper(WidgetView.this), "height", i).setDuration(300L).start();
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public /* synthetic */ void m102060b(View view) {
            C27548m.m100547m().mo98216a().mo98154a(WidgetView.this.getContext());
        }

        /* renamed from: a */
        public void mo99650a(int i) {
            if (i >= this.f69926e) {
                int i2 = this.f69925d;
                int i3 = i2 + i;
                int i4 = this.f69927f;
                if (i3 > i4) {
                    m102059b(i4);
                } else {
                    m102059b(i2 + i);
                }
            }
        }

        /* renamed from: d */
        public void mo99658d(boolean z) {
            Context a = C28209p.m103294a(WidgetView.this.f69890h.getContext(), false);
            int color = UDColorUtils.getColor(a, R.color.icon_n2);
            if (z) {
                WidgetView.this.f69890h.setImageDrawable(UDIconUtils.getIconDrawable(a, (int) R.drawable.ud_icon_up_bold_outlined, color));
            } else {
                WidgetView.this.f69890h.setImageDrawable(UDIconUtils.getIconDrawable(a, (int) R.drawable.ud_icon_down_bold_outlined, color));
            }
        }

        /* renamed from: a */
        public void mo99651a(View view) {
            if (WidgetView.this.f69893k) {
                int i = this.f69928g;
                view.setPadding(i, 0, i, 0);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                marginLayoutParams.topMargin = 0;
                view.setLayoutParams(marginLayoutParams);
            } else {
                int i2 = this.f69928g;
                view.setPadding(i2, 0, i2, 0);
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                marginLayoutParams2.topMargin = -this.f69928g;
                view.setLayoutParams(marginLayoutParams2);
            }
            TextView textView = (TextView) view.findViewById(R.id.tv_upgrade);
            C28191l.m103263a(WidgetView.this.getContext(), textView, UIHelper.mustacheFormat(WidgetView.this.getContext().getString(R.string.OpenPlatform_AppCenter_UpdtVerMsg), "App_Display_Name", C28209p.m103297a(WidgetView.this.getContext(), (int) R.string.Lark_App_Name)), R.color.lkui_N600, WidgetView.this.getContext().getString(R.string.OpenPlatform_AppCenter_UpdtVerBttn), R.color.lkui_B500, null);
            View.OnClickListener r1 = new View.OnClickListener() {
                /* class com.ss.android.appcenter.business.tab.business.widget.$$Lambda$WidgetView$c$ZkNAzhuq_2vuL3MoGSzxLRoJ9Ug */

                public final void onClick(View view) {
                    WidgetView.C27950c.lambda$ZkNAzhuq_2vuL3MoGSzxLRoJ9Ug(WidgetView.C27950c.this, view);
                }
            };
            textView.setOnClickListener(r1);
            view.setOnClickListener(r1);
        }

        /* renamed from: b */
        public void mo99654b(boolean z) {
            this.f69922a = z;
            String logTag = WidgetView.this.getLogTag();
            C28184h.m103250d(logTag, "click button. change to expand:" + z);
            if (z) {
                WidgetView.this.f69895m.mo50255a(new AbstractC13508d.AbstractC13511c() {
                    /* class com.ss.android.appcenter.business.tab.business.widget.WidgetView.C27950c.C279511 */

                    @Override // com.bytedance.ee.ref.card.p686a.AbstractC13508d.AbstractC13511c
                    /* renamed from: a */
                    public void mo50265a(int i, int i2) {
                        String logTag = WidgetView.this.getLogTag();
                        C28184h.m103250d(logTag, "onViewSizeChange width:" + i + " height:" + i2);
                        if (C27950c.this.f69922a) {
                            C27950c.this.mo99650a(i2);
                        }
                    }
                });
                WidgetView.this.mo99623a(true);
                mo99658d(true);
            } else {
                WidgetView.this.mo99623a(false);
                mo99658d(false);
                m102062e();
            }
            C27710b.m101278b(WidgetView.this.f69896n, z);
        }

        /* renamed from: c */
        public void mo99656c(boolean z) {
            if (z) {
                WidgetView.this.f69889g.setVisibility(0);
                WidgetView.this.f69889g.setOnClickListener(new View.OnClickListener() {
                    /* class com.ss.android.appcenter.business.tab.business.widget.$$Lambda$WidgetView$c$de73t92HZTUbDCPZaOpFjBePb6Y */

                    public final void onClick(View view) {
                        WidgetView.C27950c.lambda$de73t92HZTUbDCPZaOpFjBePb6Y(WidgetView.C27950c.this, view);
                    }
                });
                return;
            }
            WidgetView.this.f69889g.setVisibility(8);
            WidgetView.this.f69889g.setOnClickListener(null);
        }

        /* renamed from: a */
        public void mo99652a(boolean z) {
            mo99649a();
            if (z) {
                WidgetView.this.f69883a.setVisibility(8);
                mo99657d();
                WidgetView.this.requestLayout();
                return;
            }
            WidgetView.this.f69883a.setVisibility(0);
            mo99653b();
            mo99655c();
        }

        public C27950c(Context context) {
            this.f69929h = ((float) context.getResources().getDisplayMetrics().widthPixels) / 375.0f;
            if (C27548m.m100547m().mo98225i().mo98187a("lark.appcenter.widget.px_mode")) {
                this.f69924c = C28209p.m103293a(context, 150.0f);
                this.f69925d = C28209p.m103293a(context, 44.0f);
                this.f69927f = C28209p.m103293a(context, 500.0f);
                this.f69928g = C28209p.m103293a(context, 16.0f);
            } else {
                float f = this.f69929h;
                this.f69924c = (int) (150.0f * f);
                this.f69925d = (int) (44.0f * f);
                this.f69927f = (int) (500.0f * f);
                this.f69928g = (int) (f * 16.0f);
            }
            this.f69926e = this.f69924c - this.f69925d;
        }

        /* renamed from: a */
        private void m102058a(View view, int i, int i2) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.width = i;
            layoutParams.height = i2;
            view.setLayoutParams(layoutParams);
        }
    }

    /* renamed from: j */
    private void m102020j() {
        this.f69873L.mo99645a();
        this.f69901s.mo100033a(StatusController.Status.LOADING);
    }

    /* renamed from: e */
    public void mo99630e() {
        this.f69873L.mo99645a();
        this.f69901s.mo100033a(StatusController.Status.UPGRADE);
    }

    /* renamed from: k */
    private void m102021k() {
        if (!this.f69877P) {
            this.f69877P = true;
            this.f69902t.setMonitorCode(C27702b.aH).flush();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public /* synthetic */ void m102023m() {
        C27700a.m101232a("op_workplace_event").setMonitorCode(C27702b.f69235f).addCategoryValue("app_name", this.f69871J).addCategoryValue("app_id", this.f69896n).flush();
    }

    public String getBaseErrorMsg() {
        String str;
        Object[] objArr = new Object[2];
        objArr[0] = this.f69871J;
        C27965i iVar = this.f69898p;
        if (iVar != null) {
            str = iVar.mo99683a();
        } else {
            str = "null";
        }
        objArr[1] = str;
        return String.format("widgetName: %s, cardId: %s. other>>>:", objArr);
    }

    public String getLogTag() {
        return "Workplace_Widget" + this.f69871J;
    }

    /* renamed from: i */
    private void m102019i() {
        StatusController statusController = new StatusController(this.f69862A, this.f69888f, new StatusController.AbstractC28105b() {
            /* class com.ss.android.appcenter.business.tab.business.widget.WidgetView.C279402 */

            @Override // com.ss.android.appcenter.business.view.StatusController.AbstractC28105b
            /* renamed from: b */
            public void mo98318b() {
                WidgetView.this.f69886d.setVisibility(8);
                if (WidgetView.this.f69887e != null) {
                    WidgetView.this.f69887e.mo10130b();
                }
            }

            @Override // com.ss.android.appcenter.business.view.StatusController.AbstractC28105b
            /* renamed from: a */
            public void mo98317a() {
                WidgetView.this.f69886d.setVisibility(0);
                if (WidgetView.this.f69887e == null) {
                    WidgetView widgetView = WidgetView.this;
                    widgetView.f69887e = C2052c.m8961a(widgetView.f69886d).mo10151a(R.layout.workplace_widget_loading_skeleton_static_light).mo10152a(UIUtils.canShowSkeleton()).mo10155c(2000).mo10153a();
                    return;
                }
                WidgetView.this.f69887e.mo10129a();
            }
        });
        this.f69901s = statusController;
        statusController.mo100035a(new StatusController.AbstractC28105b() {
            /* class com.ss.android.appcenter.business.tab.business.widget.WidgetView.C279413 */

            @Override // com.ss.android.appcenter.business.view.StatusController.AbstractC28105b
            /* renamed from: b */
            public void mo98318b() {
                if (WidgetView.this.f69892j != null) {
                    WidgetView.this.f69892j.setVisibility(8);
                }
            }

            @Override // com.ss.android.appcenter.business.view.StatusController.AbstractC28105b
            /* renamed from: a */
            public void mo98317a() {
                if (WidgetView.this.f69891i != null && WidgetView.this.f69892j == null) {
                    WidgetView widgetView = WidgetView.this;
                    widgetView.f69892j = widgetView.f69891i.inflate();
                    WidgetView.this.f69904v.mo99651a(WidgetView.this.f69892j);
                }
                if (WidgetView.this.f69892j != null) {
                    WidgetView.this.f69892j.setVisibility(0);
                }
            }
        }, StatusController.Status.UPGRADE);
        this.f69901s.mo100036a(true);
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public /* synthetic */ void m102022l() {
        C27700a.m101232a("op_workplace_event").setMonitorCode(C27702b.f69234e).addCategoryValue("app_name", this.f69871J).addCategoryValue("app_id", this.f69896n).addCategoryValue("widget_version", this.f69898p.mo99685b()).addCategoryValue("renderEnd", Long.valueOf(this.f69878Q.mo98249a())).flush();
    }

    /* renamed from: d */
    public void mo99627d() {
        this.f69873L.mo99646b();
        if (this.f69901s.mo100039c()) {
            m102016b(false);
        }
        this.f69901s.mo100034a(StatusController.Status.ERROR, new StatusController.AbstractC28104a() {
            /* class com.ss.android.appcenter.business.tab.business.widget.$$Lambda$WidgetView$Bul_nyTssWFwiDys6q3zfBzYvo */

            @Override // com.ss.android.appcenter.business.view.StatusController.AbstractC28104a
            public final void onStatusChanged() {
                WidgetView.m270214lambda$Bul_nyTssWFwiDys6q3zfBzYvo(WidgetView.this);
            }
        });
        this.f69878Q.mo98256c(getLogTag(), "showError");
        this.f69876O = true;
    }

    /* renamed from: f */
    public void mo99631f() {
        mo99620a("showLocalCard");
        if (this.f69903u) {
            this.f69901s.mo100033a(StatusController.Status.CONTENT);
            this.f69899q.registerReloadTask(this.f69874M);
            this.f69878Q.mo98256c(getLogTag(), "showLocalCard");
            m102016b(true);
            m102009a(this.f69878Q.mo98249a());
            m102021k();
        }
    }

    /* renamed from: h */
    public void mo99635h() {
        if (!this.f69869H) {
            mo99627d();
            mo99625b("init fail retry");
            return;
        }
        if (!this.f69903u) {
            mo99620a("retry. card is not ready. renderTemplate");
            this.f69895m.mo50227a(this.f69870I);
        }
        if (!this.f69880S) {
            mo99620a("retry. data is not ready. requestData");
            mo99626c();
        }
        m102020j();
    }

    /* renamed from: b */
    public void mo99624b() {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("isPxMode", Boolean.valueOf(C27548m.m100547m().mo98225i().mo98187a("lark.appcenter.widget.px_mode")));
        jsonObject.addProperty("containerWidthPx", Integer.valueOf((int) ((((double) (((float) C28190k.m103260b(getContext())) / getContext().getResources().getDisplayMetrics().density)) + 0.5d) - ((double) 32))));
        this.f69895m.mo50257b(jsonObject.toString());
    }

    /* renamed from: c */
    public void mo99626c() {
        boolean z;
        C27965i iVar;
        if (!this.f69900r || (iVar = this.f69898p) == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("invoke requestWidgetData invalid. needReqyest:");
            sb.append(this.f69900r);
            sb.append(" meta is null:");
            if (this.f69898p == null) {
                z = true;
            } else {
                z = false;
            }
            sb.append(z);
            mo99620a(sb.toString());
            return;
        }
        this.f69899q.requestWidgetDataFromNet(this.f69894l, iVar);
    }

    /* renamed from: g */
    public void mo99632g() {
        if (!this.f69903u) {
            mo99620a("showNetCard. card is not ready when update data");
            return;
        }
        WidgetData widgetData = this.f69872K;
        if (widgetData == null || TextUtils.isEmpty(widgetData.getContent())) {
            mo99620a("showNetCard. updateData. data is null or empty." + this.f69872K);
            return;
        }
        this.f69895m.mo50257b(this.f69872K.getContent());
        this.f69880S = true;
        mo99620a("showNetCard. updateData and change to content.");
        this.f69873L.mo99646b();
        this.f69878Q.mo98256c(getLogTag(), "showContent");
        this.f69901s.mo100034a(StatusController.Status.CONTENT, new StatusController.AbstractC28104a() {
            /* class com.ss.android.appcenter.business.tab.business.widget.$$Lambda$WidgetView$SIqPzFnE3LsqpyKBxUo7xVYEF6s */

            @Override // com.ss.android.appcenter.business.view.StatusController.AbstractC28104a
            public final void onStatusChanged() {
                WidgetView.lambda$SIqPzFnE3LsqpyKBxUo7xVYEF6s(WidgetView.this);
            }
        });
        this.f69899q.registerReloadTask(this.f69874M);
        m102016b(true);
        m102009a(this.f69878Q.mo98249a());
        m102021k();
    }

    /* renamed from: a */
    public void mo99615a() {
        if (this.f69904v.f69922a) {
            this.f69904v.mo99649a();
            this.f69904v.mo99658d(false);
            this.f69904v.f69922a = false;
            mo99623a(false);
            requestLayout();
        }
    }

    public void setOnWidgetLongClickListener(AbstractC27949b bVar) {
        this.f69908z = bVar;
    }

    public WidgetView(Context context) {
        this(context, null);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m102018c(boolean z) {
        this.f69904v.mo99656c(z);
    }

    /* renamed from: b */
    public void mo99625b(String str) {
        C28184h.m103248b(getLogTag(), str);
    }

    /* renamed from: a */
    private void m102009a(long j) {
        if (!this.f69876O) {
            this.f69876O = true;
            C27710b.m101258a(this.f69896n, j);
        }
    }

    public void dispatchDraw(Canvas canvas) {
        canvas.clipPath(this.f69867F);
        canvas.save();
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    /* renamed from: a */
    private void m102013a(C27971l lVar) {
        this.f69888f.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.appcenter.business.tab.business.widget.WidgetView.View$OnClickListenerC279424 */

            public void onClick(View view) {
                WidgetView.this.mo99620a("click retry. showLoading");
                WidgetView.this.mo99635h();
            }
        });
        this.f69899q = lVar;
        this.f69903u = false;
        this.f69880S = false;
    }

    /* renamed from: b */
    private void m102016b(boolean z) {
        if (this.f69875N) {
            return;
        }
        if (z) {
            this.f69875N = true;
            C27710b.m101266a(this.f69896n, true);
            this.f69874M.mo99640c();
            return;
        }
        C27710b.m101266a(this.f69896n, false);
    }

    /* renamed from: c */
    private void m102017c(String str) {
        Uri parse = Uri.parse(str);
        this.f69893k = TextUtils.equals(parse.getQueryParameter("no_header"), "1");
        this.f69894l = TextUtils.equals(parse.getQueryParameter(HiAnalyticsConstant.HaKey.BI_KEY_VERSION), "preview");
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (!(action == 3 || action == 4)) {
                        removeCallbacks(this.f69882U);
                    }
                } else if (!this.f69881T && (Math.abs(this.f69905w - x) > 20.0f || Math.abs(this.f69906x - y) > 20.0f)) {
                    this.f69881T = true;
                    removeCallbacks(this.f69882U);
                }
            }
            removeCallbacks(this.f69882U);
            if (this.f69907y) {
                motionEvent.setAction(3);
                super.dispatchTouchEvent(motionEvent);
                return true;
            }
        } else {
            this.f69881T = false;
            this.f69907y = false;
            this.f69905w = x;
            this.f69906x = y;
            postDelayed(this.f69882U, (long) ViewConfiguration.getLongPressTimeout());
        }
        boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
        if (motionEvent.getAction() != 0 || dispatchTouchEvent) {
            return dispatchTouchEvent;
        }
        return true;
    }

    /* renamed from: a */
    public void mo99616a(int i) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f69864C.getLayoutParams();
        if (i <= 0) {
            marginLayoutParams.rightMargin = 0;
        } else if (i > 10) {
            marginLayoutParams.rightMargin = C28209p.m103293a(getContext(), 40.0f);
        } else {
            marginLayoutParams.rightMargin = C28209p.m103293a(getContext(), 20.0f);
        }
        this.f69864C.setLayoutParams(marginLayoutParams);
        C27569b.m100617a(this.f69865D, i);
    }

    public WidgetView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    private void m102010a(Activity activity, final LifecycleOwner lifecycleOwner) {
        C13500a aVar = new C13500a(activity);
        this.f69895m = aVar;
        aVar.mo50253a(this.f69862A);
        this.f69895m.mo50254a(new AbstractC13508d.AbstractC13510b() {
            /* class com.ss.android.appcenter.business.tab.business.widget.WidgetView.C279435 */

            @Override // com.bytedance.ee.ref.card.p686a.AbstractC13508d.AbstractC13510b
            /* renamed from: a */
            public void mo50261a() {
                WidgetView.this.f69903u = true;
                WidgetView.this.mo99624b();
                if (WidgetView.this.f69900r) {
                    WidgetView.this.mo99620a("onLoadSuccess. needBizData. showNetCard");
                    WidgetView.this.mo99632g();
                    return;
                }
                WidgetView.this.mo99620a("onLoadSuccess. noNeedBizData. showLocalCard");
                WidgetView.this.mo99631f();
            }

            @Override // com.bytedance.ee.ref.card.p686a.AbstractC13508d.AbstractC13510b
            /* renamed from: a */
            public void mo50262a(String str) {
                WidgetView widgetView = WidgetView.this;
                widgetView.mo99620a("onPageStart" + str);
            }

            @Override // com.bytedance.ee.ref.card.p686a.AbstractC13508d.AbstractC13510b
            /* renamed from: c */
            public void mo50264c(String str) {
                WidgetView widgetView = WidgetView.this;
                widgetView.mo99620a("onReceivedError" + str);
            }

            @Override // com.bytedance.ee.ref.card.p686a.AbstractC13508d.AbstractC13510b
            /* renamed from: b */
            public void mo50263b(String str) {
                WidgetView widgetView = WidgetView.this;
                widgetView.mo99625b("onLoadFailed" + str);
                WidgetView.this.mo99627d();
                OPMonitor monitorCode = WidgetView.this.f69902t.setMonitorCode(C27702b.f69236g);
                monitorCode.setErrorMessage(WidgetView.this.getBaseErrorMsg() + str).flush();
            }
        });
        this.f69895m.mo50224a(new AbstractC13508d.AbstractC13509a() {
            /* class com.ss.android.appcenter.business.tab.business.widget.WidgetView.C279446 */

            @Override // com.bytedance.ee.ref.card.p686a.AbstractC13508d.AbstractC13509a
            /* renamed from: a */
            public void mo50258a(final CardAppInfo cardAppInfo) {
                if (cardAppInfo != null) {
                    WidgetView widgetView = WidgetView.this;
                    widgetView.mo99620a("onGetAppInfoResult: " + cardAppInfo + " request");
                    WidgetView.this.f69898p = new C27965i(cardAppInfo.getIdentifier(), cardAppInfo.getAppVersion());
                    WidgetView.this.mo99626c();
                    final LiveData<WidgetData> registerWidget = WidgetView.this.f69899q.registerWidget(WidgetView.this.f69898p);
                    UICallbackExecutor.post(new Runnable() {
                        /* class com.ss.android.appcenter.business.tab.business.widget.WidgetView.C279446.RunnableC279451 */

                        public void run() {
                            registerWidget.mo5923a(lifecycleOwner, new AbstractC1178x<WidgetData>() {
                                /* class com.ss.android.appcenter.business.tab.business.widget.WidgetView.C279446.RunnableC279451.C279461 */

                                /* renamed from: a */
                                public void onChanged(WidgetData widgetData) {
                                    WidgetView.this.mo99619a(widgetData);
                                }
                            });
                            if (WidgetView.this.f69894l) {
                                WidgetView.this.f69885c.setText(cardAppInfo.getName());
                                C27688a.m101213a(cardAppInfo.getIcon(), WidgetView.this.f69884b);
                            }
                        }
                    });
                    return;
                }
                WidgetView.this.mo99625b("cardAppInfo is null. showError");
                WidgetView.this.mo99627d();
            }

            @Override // com.bytedance.ee.ref.card.p686a.AbstractC13508d.AbstractC13509a
            /* renamed from: a */
            public void mo50259a(String str) {
                WidgetView widgetView = WidgetView.this;
                widgetView.mo99620a("onGetCardConfig" + str);
                if (!TextUtils.isEmpty(str)) {
                    try {
                        CardConfig cardConfig = (CardConfig) new Gson().fromJson(str, CardConfig.class);
                        if (cardConfig != null) {
                            WidgetView.this.mo99618a(cardConfig);
                            return;
                        }
                    } catch (JsonSyntaxException e) {
                        C28184h.m103247a(WidgetView.this.getLogTag(), "fromJson error", e);
                    }
                }
                WidgetView.this.f69900r = true;
            }

            @Override // com.bytedance.ee.ref.card.p686a.AbstractC13508d.AbstractC13509a
            /* renamed from: a */
            public void mo50260a(String str, Object... objArr) {
                WidgetView widgetView = WidgetView.this;
                widgetView.mo99625b("onCardInfoError" + str);
                if (objArr != null && objArr.length > 0) {
                    Object obj = objArr[0];
                    if (obj instanceof JSONObject) {
                        WidgetView widgetView2 = WidgetView.this;
                        widgetView2.mo99625b("onCardInfoError json:" + obj.toString());
                        if (((JSONObject) obj).optInt("invalidType", 0) == 1) {
                            WidgetView.this.mo99630e();
                            OPMonitor monitorCode = WidgetView.this.f69902t.setMonitorCode(C27702b.f69236g);
                            monitorCode.setErrorMessage(WidgetView.this.getBaseErrorMsg() + "need upgrade" + str).flush();
                            return;
                        }
                    }
                }
                WidgetView.this.mo99627d();
                OPMonitor monitorCode2 = WidgetView.this.f69902t.setMonitorCode(C27702b.f69236g);
                monitorCode2.setErrorMessage(WidgetView.this.getBaseErrorMsg() + str).flush();
            }
        });
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f69867F.reset();
        this.f69868G.set(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (float) getMeasuredWidth(), (float) getMeasuredHeight());
        Path path = this.f69867F;
        RectF rectF = this.f69868G;
        int i3 = this.f69866E;
        path.addRoundRect(rectF, (float) i3, (float) i3, Path.Direction.CCW);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m102012a(ItemInfo itemInfo, View view) {
        if (!TextUtils.isEmpty(this.f69879R)) {
            C27548m.m100547m().mo98222f().mo98205b(getContext(), this.f69879R);
            return;
        }
        C27577f.m100655a(getContext(), itemInfo);
        C27710b.m101259a(itemInfo.getAppId(), itemInfo.getItemId());
        C27710b.m101303i(itemInfo.getAppId());
    }

    /* renamed from: a */
    private void m102011a(Context context, View view) {
        this.f69883a = (ConstraintLayout) view.findViewById(R.id.header);
        this.f69884b = (ImageView) view.findViewById(R.id.icon);
        this.f69885c = (TextView) view.findViewById(R.id.name);
        this.f69862A = (FrameLayout) view.findViewById(R.id.container);
        this.f69886d = (FrameLayout) view.findViewById(R.id.loading);
        this.f69888f = (LinearLayout) view.findViewById(R.id.error);
        this.f69863B = (ImageView) view.findViewById(R.id.error_image);
        this.f69864C = (LinearLayout) view.findViewById(R.id.header_wrapper);
        this.f69889g = (FrameLayout) view.findViewById(R.id.fl_expend);
        this.f69890h = (ImageView) view.findViewById(R.id.iv_expend);
        this.f69891i = (ViewStub) view.findViewById(R.id.upgrade);
        this.f69865D = (LKUIBadgeView) view.findViewById(R.id.widget_icon_badge);
        Context a = C28209p.m103294a(context, false);
        this.f69863B.setImageDrawable(UDIconUtils.getIconDrawable(a, R.drawable.illustration_empty_negative_load_failed));
        this.f69890h.setImageDrawable(UDIconUtils.getIconDrawable(a, (int) R.drawable.ud_icon_down_bold_outlined, UDColorUtils.getColor(a, R.color.icon_n2)));
    }

    public WidgetView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f69866E = C28209p.m103293a(getContext(), 12.0f);
        this.f69867F = new Path();
        this.f69868G = new RectF();
        this.f69869H = false;
        this.f69873L = new HandlerC27948a();
        this.f69900r = true;
        this.f69874M = new C27971l.AbstractC27972a() {
            /* class com.ss.android.appcenter.business.tab.business.widget.WidgetView.C279391 */

            @Override // com.ss.android.appcenter.business.tab.business.widget.C27971l.AbstractC27972a
            /* renamed from: b */
            public C27965i mo99639b() {
                return WidgetView.this.f69898p;
            }

            @Override // com.ss.android.appcenter.business.tab.business.widget.C27971l.AbstractC27972a
            /* renamed from: c */
            public void mo99640c() {
                C27710b.m101322v(WidgetView.this.f69897o);
            }

            @Override // com.ss.android.appcenter.business.tab.business.widget.C27971l.AbstractC27972a
            /* renamed from: a */
            public void mo99638a() {
                WidgetView.this.mo99620a("onReload");
                WidgetView.this.f69895m.mo50223a();
            }
        };
        this.f69878Q = new C27576e(false);
        this.f69902t = C27700a.m101232a("op_workplace_event");
        this.f69907y = false;
        this.f69882U = new Runnable() {
            /* class com.ss.android.appcenter.business.tab.business.widget.WidgetView.RunnableC279477 */

            public void run() {
                if (WidgetView.this.f69908z != null) {
                    WidgetView.this.f69908z.onLongClick();
                    WidgetView.this.f69907y = true;
                    long currentTimeMillis = System.currentTimeMillis();
                    WidgetView widgetView = WidgetView.this;
                    WidgetView.super.dispatchTouchEvent(MotionEvent.obtain(currentTimeMillis, currentTimeMillis, 3, widgetView.f69905w, WidgetView.this.f69906x, 0));
                }
            }
        };
        m102011a(context, LayoutInflater.from(context).inflate(R.layout.workplace_widget_view, (ViewGroup) this, true));
        this.f69904v = new C27950c(context);
    }

    /* renamed from: a */
    private boolean m102015a(String str, Activity activity, LifecycleOwner lifecycleOwner) {
        if (TextUtils.isEmpty(str)) {
            mo99627d();
            mo99625b("ensureInitAndRenderParams>>> widget url is null. showError");
            return false;
        } else if (lifecycleOwner == null) {
            mo99627d();
            mo99625b("ensureInitAndRenderParams>>> lifecycleOwner is null. showError");
            return false;
        } else if (activity != null) {
            return true;
        } else {
            mo99627d();
            mo99625b("ensureInitAndRenderParams>>> activity is null. showError");
            return false;
        }
    }
}
