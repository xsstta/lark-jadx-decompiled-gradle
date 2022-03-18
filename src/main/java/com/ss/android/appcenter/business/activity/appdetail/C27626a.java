package com.ss.android.appcenter.business.activity.appdetail;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.C1144ai;
import com.bytedance.lark.pb.basic.v1.SendHttpResponse;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.huawei.hms.location.LocationRequest;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.jaeger.library.StatusBarUtil;
import com.larksuite.component.ignition.widget.blur.BlurHelper;
import com.larksuite.component.ignition.widget.blur.BlurResultCallback;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.component.universe_design.button.UDButton;
import com.larksuite.component.universe_design.color.UDColorUtils;
import com.larksuite.component.universe_design.dialog.UDDialogBuilder;
import com.larksuite.component.universe_design.dialog.UDListDialogController;
import com.larksuite.component.universe_design.dialog.actionpanel.UDActionPanelBuilder;
import com.larksuite.component.universe_design.icon.UDIconUtils;
import com.larksuite.component.universe_design.toast.UDToast;
import com.larksuite.component.universe_design.udswitch.UDSwitchWithLoading;
import com.larksuite.component.universe_design.util.UDUiModeUtils;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.p078b.p079a.C2052c;
import com.p078b.p079a.C2057g;
import com.ss.android.appcenter.business.activity.appdetail.C27626a;
import com.ss.android.appcenter.business.activity.appfeedback.AppFeedbackActivity;
import com.ss.android.appcenter.business.activity.apppropose.AppProposeActivity;
import com.ss.android.appcenter.business.dto.AppDetailInfo;
import com.ss.android.appcenter.business.dto.AppInfo;
import com.ss.android.appcenter.business.dto.BotInfo;
import com.ss.android.appcenter.business.dto.BotInnerInfo;
import com.ss.android.appcenter.business.dto.C27699f;
import com.ss.android.appcenter.business.dto.DefaultResponse;
import com.ss.android.appcenter.business.dto.Status;
import com.ss.android.appcenter.business.monitor.monitor.GroupBotMonitorCode;
import com.ss.android.appcenter.business.monitor.statistics.C27710b;
import com.ss.android.appcenter.business.net.C27724c;
import com.ss.android.appcenter.business.net.p1270a.C27714b;
import com.ss.android.appcenter.business.p1265a.C27570c;
import com.ss.android.appcenter.common.util.C28176a;
import com.ss.android.appcenter.common.util.C28184h;
import com.ss.android.appcenter.common.util.C28191l;
import com.ss.android.appcenter.common.util.C28209p;
import com.ss.android.appcenter.p1262a.p1263a.C27548m;
import com.ss.android.lark.desktopmode.p1787a.C36516a;
import com.ss.android.lark.image.ImageLoader;
import com.ss.android.lark.image.api.AbstractC38817h;
import com.ss.android.lark.image.api.AbstractC38819j;
import com.ss.android.lark.image.api.DataSource;
import com.ss.android.lark.image.entity.AvatarImage;
import com.ss.android.lark.opmonitor.service.OPMonitor;
import com.ss.android.lark.sdk.C53241h;
import com.ss.android.lark.utils.C57782ag;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.appcenter.business.activity.appdetail.a */
public class C27626a extends C36516a {

    /* renamed from: A */
    private LinearLayout f68920A;

    /* renamed from: B */
    private LinearLayout f68921B;

    /* renamed from: C */
    private View f68922C;

    /* renamed from: D */
    private View f68923D;

    /* renamed from: E */
    private View f68924E;

    /* renamed from: F */
    private RelativeLayout f68925F;

    /* renamed from: G */
    private RelativeLayout f68926G;

    /* renamed from: H */
    private RelativeLayout f68927H;

    /* renamed from: I */
    private RelativeLayout f68928I;

    /* renamed from: J */
    private LinearLayout f68929J;

    /* renamed from: K */
    private RelativeLayout f68930K;

    /* renamed from: L */
    private FrameLayout f68931L;

    /* renamed from: M */
    private ViewGroup f68932M;

    /* renamed from: N */
    private View f68933N;

    /* renamed from: O */
    private FrameLayout f68934O;

    /* renamed from: P */
    private LinearLayout f68935P;

    /* renamed from: Q */
    private FrameLayout f68936Q;

    /* renamed from: R */
    private boolean f68937R;

    /* renamed from: S */
    private boolean f68938S;

    /* renamed from: T */
    private String f68939T;

    /* renamed from: U */
    private String f68940U;

    /* renamed from: V */
    private C27646d f68941V;

    /* renamed from: W */
    private boolean f68942W;

    /* renamed from: X */
    private boolean f68943X;

    /* renamed from: Y */
    private boolean f68944Y;

    /* renamed from: Z */
    private C2057g f68945Z;

    /* renamed from: a */
    View f68946a;

    /* renamed from: b */
    public ImageView f68947b;

    /* renamed from: c */
    public TextView f68948c;

    /* renamed from: d */
    public TextView f68949d;

    /* renamed from: e */
    public TextView f68950e;

    /* renamed from: f */
    public TextView f68951f;

    /* renamed from: g */
    public TextView f68952g;

    /* renamed from: h */
    public ImageView f68953h;

    /* renamed from: i */
    public ImageView f68954i;

    /* renamed from: j */
    public ImageView f68955j;

    /* renamed from: k */
    public UDSwitchWithLoading f68956k;

    /* renamed from: l */
    public FrameLayout f68957l;

    /* renamed from: m */
    public String f68958m;

    /* renamed from: n */
    public String f68959n;

    /* renamed from: o */
    private TextView f68960o;

    /* renamed from: p */
    private TextView f68961p;

    /* renamed from: q */
    private TextView f68962q;

    /* renamed from: r */
    private TextView f68963r;

    /* renamed from: s */
    private TextView f68964s;

    /* renamed from: t */
    private TextView f68965t;

    /* renamed from: u */
    private TextView f68966u;

    /* renamed from: v */
    private TextView f68967v;

    /* renamed from: w */
    private LinearLayout f68968w;

    /* renamed from: x */
    private TextView f68969x;

    /* renamed from: y */
    private ImageView f68970y;

    /* renamed from: z */
    private LinearLayout f68971z;

    /* renamed from: b */
    private void m100839b() {
        finish();
    }

    /* renamed from: a */
    public void mo98412a() {
        this.f68935P.setVisibility(8);
        this.f68931L.setVisibility(0);
        this.f68945Z.mo10130b();
        this.f68934O.setVisibility(8);
        this.f68929J.setVisibility(8);
        this.f68930K.setVisibility(8);
        this.f68954i.setVisibility(8);
        this.f68955j.setVisibility(8);
        Context context = this.f68953h.getContext();
        this.f68953h.setImageDrawable(UDIconUtils.getIconDrawable(context, (int) R.drawable.appcenter_back_black, UDColorUtils.getColor(context, R.color.icon_n1)));
        this.f68931L.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.appcenter.business.activity.appdetail.$$Lambda$a$DAAlrAEsTgRVn0KlOFXznaRM */

            public final void onClick(View view) {
                C27626a.this.m100861e((C27626a) view);
            }
        });
    }

    /* renamed from: a */
    public void mo98413a(AppDetailInfo appDetailInfo) {
        this.f68931L.setVisibility(8);
        this.f68945Z.mo10130b();
        this.f68935P.setVisibility(0);
        this.f68934O.setVisibility(8);
        this.f68929J.setVisibility(0);
        this.f68953h.setImageResource(R.drawable.appcenter_back_white);
        Status status = appDetailInfo.getStatus();
        boolean hasH5 = appDetailInfo.hasH5();
        boolean hasMicroApp = appDetailInfo.hasMicroApp();
        boolean hasBot = appDetailInfo.hasBot();
        boolean isOncall = appDetailInfo.isOncall();
        float f = getResources().getDisplayMetrics().density;
        if (TextUtils.isEmpty(appDetailInfo.getAppDescription())) {
            this.f68949d.setVisibility(8);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f68968w.getLayoutParams();
            layoutParams.topMargin = (int) (f * 8.0f);
            this.f68968w.setLayoutParams(layoutParams);
        } else {
            this.f68949d.setVisibility(0);
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f68968w.getLayoutParams();
            layoutParams2.topMargin = (int) (f * 12.0f);
            this.f68968w.setLayoutParams(layoutParams2);
        }
        m100850c(appDetailInfo);
        m100836a(status, hasH5, hasMicroApp, hasBot, isOncall);
        m100833a(appDetailInfo, status);
        m100857d(appDetailInfo);
        m100862e(appDetailInfo);
        m100865f(appDetailInfo);
        m100842b(appDetailInfo, status);
        m100834a(appDetailInfo, status, hasH5, hasMicroApp, hasBot, isOncall);
        m100869h(appDetailInfo);
        m100871i(appDetailInfo);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m100837a(StringBuilder sb, int i) {
        if (i == 0 && C27548m.m100547m().mo98222f() != null) {
            C27548m.m100547m().mo98222f().mo98202a(getContext(), sb.toString(), null, false, null, null);
        }
    }

    /* renamed from: a */
    public void mo98418a(boolean z) {
        FrameLayout frameLayout = (FrameLayout) this.f68946a.findViewById(R.id.group_bot_wrapper);
        UDButton uDButton = (UDButton) this.f68946a.findViewById(R.id.add_group_bot);
        UDButton uDButton2 = (UDButton) this.f68946a.findViewById(R.id.remove_group_bot);
        if (!this.f68943X || TextUtils.isEmpty(this.f68959n)) {
            frameLayout.setVisibility(8);
        } else {
            frameLayout.setVisibility(0);
            if (this.f68944Y) {
                uDButton.setVisibility(8);
                if (z) {
                    C28184h.m103250d("AppDetailFragment", "can delete so show removeBotItem");
                    uDButton2.setVisibility(0);
                } else {
                    uDButton2.setVisibility(8);
                    frameLayout.setVisibility(8);
                }
                m100846b(z);
            } else {
                uDButton.setVisibility(0);
                uDButton2.setVisibility(8);
            }
        }
        if (frameLayout.getVisibility() == 0) {
            ((FrameLayout.LayoutParams) this.f68935P.getLayoutParams()).bottomMargin = C28209p.m103291a(80.0f);
        } else {
            ((FrameLayout.LayoutParams) this.f68935P.getLayoutParams()).bottomMargin = C28209p.m103291a((float) BitmapDescriptorFactory.HUE_RED);
        }
        uDButton.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.appcenter.business.activity.appdetail.$$Lambda$a$X2nc2EeJYNrAm0YSEyVwgD62Uc */

            public final void onClick(View view) {
                C27626a.this.m100856d((C27626a) view);
            }
        });
        uDButton2.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.appcenter.business.activity.appdetail.$$Lambda$a$dULB03zsZB2Fuf1z2aohdm8kcvQ */

            public final void onClick(View view) {
                C27626a.this.m100849c((C27626a) view);
            }
        });
    }

    /* renamed from: a */
    public void mo98414a(AppDetailInfo appDetailInfo, BotInfo botInfo) {
        this.f68932M.setVisibility(botInfo.isShowCheckMender() ? 0 : 8);
        if (botInfo.isShowCheckMender()) {
            BotInnerInfo botInnerInfo = null;
            Iterator<JsonElement> it = botInfo.getFields().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                BotInnerInfo botInnerInfo2 = (BotInnerInfo) new Gson().fromJson(it.next(), BotInnerInfo.class);
                if ("check_mender".equalsIgnoreCase(botInnerInfo2.getFieldKey())) {
                    botInnerInfo = botInnerInfo2;
                    break;
                }
            }
            if (botInnerInfo == null) {
                C28184h.m103248b("AppDetailFragment", "botInnerInfo == null, so return");
                return;
            }
            boolean booleanValue = Boolean.valueOf(botInnerInfo.getDefaultValue()).booleanValue();
            C28184h.m103250d("AppDetailFragment", "checkStatus = " + booleanValue);
            this.f68956k.setChecked(booleanValue);
            this.f68956k.setOnLoadingStatusChangeListener(new UDSwitchWithLoading.OnLoadingStatusChangeListener(appDetailInfo) {
                /* class com.ss.android.appcenter.business.activity.appdetail.$$Lambda$a$qXeuKjN5CdqOlKKtrjhZ5k1uRr4 */
                public final /* synthetic */ AppDetailInfo f$1;

                {
                    this.f$1 = r2;
                }

                @Override // com.larksuite.component.universe_design.udswitch.UDSwitchWithLoading.OnLoadingStatusChangeListener
                public final void onLoadingStatus(boolean z) {
                    C27626a.this.m100853c((C27626a) this.f$1, (AppDetailInfo) z);
                }
            });
        }
    }

    /* renamed from: a */
    public void mo98415a(AppDetailInfo appDetailInfo, C27699f fVar) {
        this.f68932M.setVisibility(fVar.mo98857b() ? 0 : 8);
        boolean booleanValue = Boolean.valueOf(fVar.mo98858c()).booleanValue();
        C28184h.m103250d("AppDetailFragment", "handleWebHookBotSwitch checkStatus = " + booleanValue);
        this.f68956k.setChecked(booleanValue);
        this.f68956k.setOnLoadingStatusChangeListener(new UDSwitchWithLoading.OnLoadingStatusChangeListener(appDetailInfo) {
            /* class com.ss.android.appcenter.business.activity.appdetail.$$Lambda$a$vTH5DYsz8pJstyfVbZIZ8jeOnE */
            public final /* synthetic */ AppDetailInfo f$1;

            {
                this.f$1 = r2;
            }

            @Override // com.larksuite.component.universe_design.udswitch.UDSwitchWithLoading.OnLoadingStatusChangeListener
            public final void onLoadingStatus(boolean z) {
                C27626a.this.m100844b((C27626a) this.f$1, (AppDetailInfo) z);
            }
        });
    }

    /* renamed from: a */
    public void mo98417a(String str) {
        mo98416a(new Runnable(str) {
            /* class com.ss.android.appcenter.business.activity.appdetail.$$Lambda$a$_CY_owa8PO0Ms5PduSUWsKL0MJU */
            public final /* synthetic */ String f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                C27626a.this.m100845b((C27626a) this.f$1);
            }
        });
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.appcenter.business.activity.appdetail.a$4 */
    public static /* synthetic */ class C276304 {

        /* renamed from: a */
        static final /* synthetic */ int[] f68981a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.ss.android.appcenter.business.dto.Status[] r0 = com.ss.android.appcenter.business.dto.Status.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ss.android.appcenter.business.activity.appdetail.C27626a.C276304.f68981a = r0
                com.ss.android.appcenter.business.dto.Status r1 = com.ss.android.appcenter.business.dto.Status.OFFLINE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.ss.android.appcenter.business.activity.appdetail.C27626a.C276304.f68981a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.ss.android.appcenter.business.dto.Status r1 = com.ss.android.appcenter.business.dto.Status.DELETE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.appcenter.business.activity.appdetail.C27626a.C276304.<clinit>():void");
        }
    }

    /* renamed from: d */
    private C27646d m100855d() {
        if (this.f68941V == null) {
            this.f68941V = (C27646d) new C1144ai(this).mo6005a(C27646d.class);
        }
        return this.f68941V;
    }

    /* renamed from: c */
    private void m100848c() {
        if (getArguments() != null) {
            Bundle arguments = getArguments();
            this.f68958m = arguments.getString("id");
            this.f68937R = arguments.getBoolean("is_app", false);
            this.f68939T = arguments.getString("inviter_name");
            this.f68940U = arguments.getString("inviter_chat_id");
            if (TextUtils.isEmpty(this.f68939T) || TextUtils.isEmpty(this.f68940U)) {
                this.f68938S = false;
            } else {
                this.f68938S = true;
            }
            this.f68943X = arguments.getBoolean("from_add_group_bot", false);
            this.f68959n = arguments.getString("chat_id", "");
            this.f68944Y = arguments.getBoolean("added_to_group", false);
            return;
        }
        this.f68938S = false;
    }

    /* renamed from: e */
    private void m100860e() {
        this.f68935P.setVisibility(8);
        this.f68931L.setVisibility(8);
        this.f68934O.setVisibility(0);
        this.f68945Z.mo10129a();
        this.f68929J.setVisibility(8);
        this.f68930K.setVisibility(8);
        this.f68954i.setVisibility(8);
        this.f68955j.setVisibility(8);
        Context context = this.f68953h.getContext();
        this.f68953h.setImageDrawable(UDIconUtils.getIconDrawable(context, (int) R.drawable.appcenter_back_black, UDColorUtils.getColor(context, R.color.icon_n1)));
    }

    /* renamed from: f */
    private void m100864f() {
        this.f68920A.setOrientation(1);
        this.f68971z.setOrientation(1);
        this.f68921B.setOrientation(1);
        this.f68950e.setTextSize(11.0f);
        this.f68952g.setTextSize(11.0f);
        this.f68951f.setTextSize(11.0f);
        ((LinearLayout.LayoutParams) this.f68950e.getLayoutParams()).leftMargin = 0;
        ((LinearLayout.LayoutParams) this.f68952g.getLayoutParams()).leftMargin = 0;
        ((LinearLayout.LayoutParams) this.f68951f.getLayoutParams()).leftMargin = 0;
        this.f68950e.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
            /* class com.ss.android.appcenter.business.activity.appdetail.C27626a.ViewTreeObserver$OnGlobalLayoutListenerC276347 */

            public void onGlobalLayout() {
                C27626a.this.f68950e.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                C27626a.this.f68950e.setPadding(C28209p.m103291a(5.0f), 0, C28209p.m103291a(5.0f), 0);
            }
        });
        this.f68951f.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
            /* class com.ss.android.appcenter.business.activity.appdetail.C27626a.ViewTreeObserver$OnGlobalLayoutListenerC276358 */

            public void onGlobalLayout() {
                C27626a.this.f68951f.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                C27626a.this.f68951f.setPadding(C28209p.m103291a(5.0f), 0, C28209p.m103291a(5.0f), 0);
            }
        });
        this.f68952g.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
            /* class com.ss.android.appcenter.business.activity.appdetail.C27626a.ViewTreeObserver$OnGlobalLayoutListenerC276369 */

            public void onGlobalLayout() {
                C27626a.this.f68952g.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                C27626a.this.f68952g.setPadding(C28209p.m103291a(5.0f), 0, C28209p.m103291a(5.0f), 0);
            }
        });
    }

    /* renamed from: a */
    private boolean m100838a(Status status) {
        return Status.isAvailable(status);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m100840b(View view) {
        m100839b();
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ void m100859d(boolean z) {
        this.f68956k.mo91763a(!z);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m100854c(boolean z) {
        this.f68956k.postDelayed(new Runnable(z) {
            /* class com.ss.android.appcenter.business.activity.appdetail.$$Lambda$a$Nnyd8iHfThmIaD7oF9D6GT8WUkk */
            public final /* synthetic */ boolean f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                C27626a.this.m100859d((C27626a) this.f$1);
            }
        }, 100);
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ void m100861e(View view) {
        m100860e();
        m100855d().getAppDetailInfoMediatorLiveData(this.f68958m, this.f68937R, "");
    }

    /* renamed from: m */
    private void m100876m(AppDetailInfo appDetailInfo) {
        this.f68932M.setVisibility(0);
        this.f68956k.setChecked(false);
        this.f68956k.setOnLoadingStatusChangeListener(new UDSwitchWithLoading.OnLoadingStatusChangeListener() {
            /* class com.ss.android.appcenter.business.activity.appdetail.$$Lambda$a$99i7xVDxPZeNfAzNMBYbrz83pdg */

            @Override // com.larksuite.component.universe_design.udswitch.UDSwitchWithLoading.OnLoadingStatusChangeListener
            public final void onLoadingStatus(boolean z) {
                C27626a.this.m100854c((C27626a) z);
            }
        });
    }

    /* renamed from: a */
    public void mo98416a(Runnable runnable) {
        if (getActivity() != null) {
            getActivity().runOnUiThread(runnable);
        } else {
            C28184h.m103248b("AppDetailFragment", "activity is null so discard the runnable");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ void m100856d(View view) {
        boolean z;
        AnonymousClass11 r5 = new C27714b.AbstractC27716a() {
            /* class com.ss.android.appcenter.business.activity.appdetail.C27626a.AnonymousClass11 */

            @Override // com.ss.android.appcenter.business.net.p1270a.C27714b.AbstractC27716a
            /* renamed from: a */
            public void mo98364a(ErrorResult errorResult, C27714b.C27717b bVar) {
                C53241h.m205894a("AppDetailFragment", "add bot error " + errorResult.getDebugMsg());
                LKUIToast.show(C27626a.this.f68946a.getContext(), C28209p.m103297a(C27626a.this.f68946a.getContext(), (int) R.string.Lark_GroupBot_AddBotFailed));
                new OPMonitor("op_groupbot_add_to_chat", GroupBotMonitorCode.f69266k.mo98862b()).flush();
            }

            @Override // com.ss.android.appcenter.business.net.p1270a.C27714b.AbstractC27716a
            /* renamed from: a */
            public void mo98363a(SendHttpResponse sendHttpResponse, C27714b.C27717b bVar) {
                try {
                    if (C57782ag.m224241a(sendHttpResponse.json_body) || !new JSONObject(sendHttpResponse.json_body).has("ok") || !new JSONObject(sendHttpResponse.json_body).getBoolean("ok")) {
                        C53241h.m205894a("AppDetailFragment", "add bot error: " + sendHttpResponse.json_body);
                        String string = new JSONObject(sendHttpResponse.json_body).getString("msg");
                        C53241h.m205898b("AppDetailFragment", "msg = " + string);
                        if (TextUtils.isEmpty(string)) {
                            LKUIToast.show(C27626a.this.f68946a.getContext(), C28209p.m103297a(C27626a.this.f68946a.getContext(), (int) R.string.Lark_GroupBot_AddBotFailed));
                        } else {
                            C27626a.this.mo98417a(string);
                        }
                        new OPMonitor("op_groupbot_add_to_chat", GroupBotMonitorCode.f69266k.mo98862b()).flush();
                    } else if (C27548m.m100547m().mo98222f() != null) {
                        C27710b.m101249B(C27626a.this.f68958m);
                        C27548m.m100547m().mo98222f().mo98208e(C27626a.this.getContext(), C27626a.this.f68959n);
                        new OPMonitor("op_groupbot_add_to_chat", GroupBotMonitorCode.f69266k.mo98861a()).flush();
                    } else {
                        C53241h.m205894a("AppDetailFragment", "router provider null");
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                    C53241h.m205894a("AppDetailFragment", "add bot error: " + sendHttpResponse.json_body);
                    LKUIToast.show(C27626a.this.f68946a.getContext(), C28209p.m103297a(C27626a.this.f68946a.getContext(), (int) R.string.Lark_GroupBot_AddBotFailed));
                    new OPMonitor("op_groupbot_add_to_chat", GroupBotMonitorCode.f69266k.mo98862b()).flush();
                }
            }
        };
        if (this.f68956k.getVisibility() == 0) {
            z = this.f68956k.isChecked();
        } else {
            z = false;
        }
        C53241h.m205898b("AppDetailFragment", "addBotToGroup checkMender = " + z);
        C27645c.m100932a(this.f68958m, this.f68959n, "0", z, r5);
    }

    /* renamed from: f */
    private void m100865f(AppDetailInfo appDetailInfo) {
        if (appDetailInfo == null || TextUtils.isEmpty(appDetailInfo.getAppHelpFile())) {
            C27710b.m101269a(false, m100867g(appDetailInfo));
            this.f68928I.setVisibility(8);
            return;
        }
        this.f68928I.setVisibility(0);
        this.f68928I.setOnClickListener(new View.OnClickListener(appDetailInfo) {
            /* class com.ss.android.appcenter.business.activity.appdetail.$$Lambda$a$VW5t7c8aXNCa6f1sslSmIwp7bnc */
            public final /* synthetic */ AppDetailInfo f$1;

            {
                this.f$1 = r2;
            }

            public final void onClick(View view) {
                C27626a.this.m100868g(this.f$1, view);
            }
        });
        C27710b.m101269a(true, m100867g(appDetailInfo));
    }

    /* renamed from: g */
    private String m100867g(AppDetailInfo appDetailInfo) {
        if (appDetailInfo == null) {
            return "others";
        }
        if (appDetailInfo.getAppSceneType() == AppDetailInfo.AppSceneType.OWN) {
            return "customapp";
        }
        if (appDetailInfo.getAppSceneType() == AppDetailInfo.AppSceneType.ISV || appDetailInfo.getAppSceneType() == AppDetailInfo.AppSceneType.ISV_PERSONAL) {
            return "publicapp";
        }
        if (appDetailInfo.isOncall()) {
            return "oncall";
        }
        return "others";
    }

    /* renamed from: i */
    private void m100871i(AppDetailInfo appDetailInfo) {
        if (!C28176a.m103222a(appDetailInfo.getAppId())) {
            this.f68954i.setVisibility(8);
            return;
        }
        this.f68954i.setVisibility(0);
        this.f68954i.setOnClickListener(new View.OnClickListener(appDetailInfo) {
            /* class com.ss.android.appcenter.business.activity.appdetail.$$Lambda$a$nhea0C8HSJrMNqnten8RxkcmxDA */
            public final /* synthetic */ AppDetailInfo f$1;

            {
                this.f$1 = r2;
            }

            public final void onClick(View view) {
                C27626a.this.m100832a((C27626a) this.f$1, (AppDetailInfo) view);
            }
        });
    }

    /* renamed from: j */
    private void m100873j(AppDetailInfo appDetailInfo) {
        AppInfo appInfo = new AppInfo();
        appInfo.setAppId(appDetailInfo.getAppId());
        appInfo.setUrl(appDetailInfo.getAppUrl());
        appInfo.setBotId(appDetailInfo.getBotId());
        appInfo.setIcon_key(appDetailInfo.getAvatarKey());
        C27570c.m100620a(getContext(), appInfo, -1, 1000);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m100845b(String str) {
        UDToast.show(getContext(), str);
    }

    /* renamed from: h */
    private void m100869h(final AppDetailInfo appDetailInfo) {
        if (!Status.isUnauthorized(appDetailInfo.getStatus())) {
            this.f68930K.setVisibility(8);
        } else if (!appDetailInfo.isCanApplyVisibility()) {
            this.f68930K.setVisibility(0);
        } else {
            this.f68930K.setVisibility(0);
            this.f68969x.setVisibility(0);
            C28191l.m103263a(getContext(), this.f68969x, C28209p.m103297a(getContext(), (int) R.string.Lark_GroupBot_NoAccessToBotDesc), R.color.text_placeholder, C28209p.m103297a(getContext(), (int) R.string.AppDetail_Application_Mechanism_ApplyAccess), R.color.text_link_normal, new View.OnClickListener() {
                /* class com.ss.android.appcenter.business.activity.appdetail.C27626a.AnonymousClass10 */

                public void onClick(View view) {
                    AppProposeActivity.m101007a(C27626a.this.getContext(), appDetailInfo.getAppId(), appDetailInfo.getBotId(), appDetailInfo.getAppName());
                }
            });
            if (!this.f68942W) {
                C27710b.m101252a();
                this.f68942W = true;
            }
        }
    }

    /* renamed from: k */
    private void m100874k(AppDetailInfo appDetailInfo) {
        if (C27548m.m100547m().mo98222f() == null) {
            return;
        }
        if (TextUtils.isEmpty(appDetailInfo.getBotId())) {
            C28184h.m103248b("AppDetailFragment", "open bot, bot id is null! appId: " + appDetailInfo.getAppId());
        } else if (C27548m.m100547m().mo98225i().mo98187a("lark.feed.openapp.v2")) {
            C27548m.m100547m().mo98222f().mo98209f(getContext(), appDetailInfo.getBotId());
        } else {
            C27548m.m100547m().mo98222f().mo98207d(getContext(), appDetailInfo.getBotId());
        }
    }

    /* renamed from: l */
    private void m100875l(final AppDetailInfo appDetailInfo) {
        if (!appDetailInfo.getBotId().equalsIgnoreCase(this.f68958m)) {
            C28184h.m103250d("AppDetailFragment", "mAppIdOrBotId = " + this.f68958m + ", detailAppId = " + appDetailInfo.getBotId() + ", not equal");
            return;
        }
        C27645c.m100933a(appDetailInfo.getBotId(), this.f68959n, !TextUtils.isEmpty(appDetailInfo.getBotInviterName()), new C27714b.AbstractC27716a() {
            /* class com.ss.android.appcenter.business.activity.appdetail.C27626a.C276282 */

            /* access modifiers changed from: private */
            /* renamed from: a */
            public /* synthetic */ void m100890a() {
                C27626a.this.mo98412a();
            }

            /* access modifiers changed from: private */
            /* renamed from: b */
            public /* synthetic */ void m100893b() {
                C27626a.this.mo98412a();
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public /* synthetic */ void m100891a(AppDetailInfo appDetailInfo) {
                C27626a.this.mo98413a(appDetailInfo);
            }

            @Override // com.ss.android.appcenter.business.net.p1270a.C27714b.AbstractC27716a
            /* renamed from: a */
            public void mo98364a(ErrorResult errorResult, C27714b.C27717b bVar) {
                C28184h.m103248b("AppDetailFragment", "handleBotEdit onError : " + errorResult);
                C27626a.this.mo98417a(errorResult.getDisplayMsg());
                C27626a.this.mo98416a(new Runnable() {
                    /* class com.ss.android.appcenter.business.activity.appdetail.$$Lambda$a$2$aglWnJLEY0477m1_GH5YRdMGQ */

                    public final void run() {
                        C27626a.C276282.this.m100890a();
                    }
                });
            }

            @Override // com.ss.android.appcenter.business.net.p1270a.C27714b.AbstractC27716a
            /* renamed from: a */
            public void mo98363a(SendHttpResponse sendHttpResponse, C27714b.C27717b bVar) {
                C27699f fVar;
                C28184h.m103250d("AppDetailFragment", "handleBotEdit onSuccess " + sendHttpResponse);
                if (sendHttpResponse.http_status_code.intValue() == 200) {
                    try {
                        BotInfo botInfo = (BotInfo) new Gson().fromJson(sendHttpResponse.json_body, BotInfo.class);
                        C53241h.m205898b("AppDetailFragment", "handleBotEdit info = " + botInfo);
                        if (botInfo != null) {
                            if (botInfo.getCode() == 0) {
                                if (botInfo.getData() == null) {
                                    fVar = null;
                                } else {
                                    fVar = (C27699f) new Gson().fromJson((JsonElement) botInfo.getData(), C27699f.class);
                                }
                                C28184h.m103250d("AppDetailFragment", "webHookBotInfo = " + fVar);
                                C27626a.this.mo98416a(new Runnable(fVar, botInfo, appDetailInfo) {
                                    /* class com.ss.android.appcenter.business.activity.appdetail.$$Lambda$a$2$barsXbaBassT1l7d0eEI8JmVb4 */
                                    public final /* synthetic */ C27699f f$1;
                                    public final /* synthetic */ BotInfo f$2;
                                    public final /* synthetic */ AppDetailInfo f$3;

                                    {
                                        this.f$1 = r2;
                                        this.f$2 = r3;
                                        this.f$3 = r4;
                                    }

                                    public final void run() {
                                        C27626a.C276282.this.m100892a(this.f$1, this.f$2, this.f$3);
                                    }
                                });
                                return;
                            }
                        }
                        C28184h.m103248b("AppDetailFragment", "botInfo = null || code = 0");
                        C27626a.this.mo98416a(new Runnable(appDetailInfo) {
                            /* class com.ss.android.appcenter.business.activity.appdetail.$$Lambda$a$2$PJSeXSfZjRTtzhf1iZzFMYoWSTk */
                            public final /* synthetic */ AppDetailInfo f$1;

                            {
                                this.f$1 = r2;
                            }

                            public final void run() {
                                C27626a.C276282.this.m100891a(this.f$1);
                            }
                        });
                    } catch (Exception e) {
                        C28184h.m103247a("AppDetailFragment", "occur exception , ", e);
                        C27626a.this.mo98413a(appDetailInfo);
                    }
                } else {
                    C27626a.this.mo98416a(new Runnable() {
                        /* class com.ss.android.appcenter.business.activity.appdetail.$$Lambda$a$2$IJJvX1gJaxae4VOrZGLsdLB2_bA */

                        public final void run() {
                            C27626a.C276282.this.m100893b();
                        }
                    });
                }
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public /* synthetic */ void m100892a(C27699f fVar, BotInfo botInfo, AppDetailInfo appDetailInfo) {
                boolean z = true;
                if (fVar != null ? fVar.mo98856a() : botInfo.isNoPermission()) {
                    z = false;
                }
                C27626a.this.mo98413a(appDetailInfo);
                C27626a.this.mo98418a(z);
                if (fVar == null) {
                    C27626a.this.mo98414a(appDetailInfo, botInfo);
                } else {
                    C27626a.this.mo98415a(appDetailInfo, fVar);
                }
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m100849c(View view) {
        if (getContext() == null) {
            C53241h.m205894a("AppDetailFragment", "fragment context null");
            return;
        }
        ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) new UDDialogBuilder(view.getContext()).message(R.string.Lark_GroupBot_Remove_Content)).addActionButton(R.id.ud_dialog_btn_secondary, R.string.Lark_Legacy_Cancel, (DialogInterface.OnClickListener) null)).addActionButton(R.id.ud_dialog_btn_primary, R.string.Lark_Legacy_ConfirmTip, new DialogInterface.OnClickListener() {
            /* class com.ss.android.appcenter.business.activity.appdetail.$$Lambda$a$dyuJ9Wkqb7lH_bugfIqHO4UXxA */

            public final void onClick(DialogInterface dialogInterface, int i) {
                C27626a.this.m100830a((C27626a) dialogInterface, (DialogInterface) i);
            }
        })).show();
    }

    /* renamed from: d */
    private void m100857d(AppDetailInfo appDetailInfo) {
        if (!TextUtils.isEmpty(appDetailInfo.getBotInviterName())) {
            this.f68926G.setVisibility(8);
            return;
        }
        this.f68926G.setVisibility(0);
        this.f68961p.setText(appDetailInfo.getDeveloperName());
        if (appDetailInfo.getAppSceneType() == AppDetailInfo.AppSceneType.OWN) {
            this.f68970y.setVisibility(8);
        } else {
            this.f68970y.setVisibility(0);
        }
        getResources();
        if (getResources().getDisplayMetrics() != null) {
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            RelativeLayout relativeLayout = (RelativeLayout) this.f68926G.findViewById(R.id.app_developer_info);
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) relativeLayout.getLayoutParams();
            layoutParams.leftMargin = (int) (((double) displayMetrics.widthPixels) * 0.48d);
            relativeLayout.setLayoutParams(layoutParams);
            this.f68961p.setMaxWidth((int) ((((double) displayMetrics.widthPixels) * 0.52d) - ((double) (displayMetrics.density * 44.0f))));
        }
        if (TextUtils.isEmpty(appDetailInfo.getDeveloperId()) || C27548m.m100547m().mo98222f() == null) {
            this.f68961p.setTextColor(ContextCompat.getColor(getContext(), R.color.text_placeholder));
            this.f68926G.setOnClickListener(null);
            this.f68926G.setClickable(false);
            return;
        }
        this.f68961p.setTextColor(ContextCompat.getColor(getContext(), R.color.text_link_normal));
        this.f68926G.setClickable(true);
        this.f68926G.setOnClickListener(new View.OnClickListener(appDetailInfo) {
            /* class com.ss.android.appcenter.business.activity.appdetail.$$Lambda$a$uGeSnMU5qaVQctfM9w5Q1X4z1QQ */
            public final /* synthetic */ AppDetailInfo f$1;

            {
                this.f$1 = r2;
            }

            public final void onClick(View view) {
                C27626a.this.m100872i(this.f$1, view);
            }
        });
    }

    /* renamed from: e */
    private void m100862e(AppDetailInfo appDetailInfo) {
        if (TextUtils.isEmpty(appDetailInfo.getBotInviterName())) {
            this.f68927H.setVisibility(8);
            return;
        }
        this.f68927H.setVisibility(0);
        this.f68962q.setText(appDetailInfo.getBotInviterName());
        if (TextUtils.isEmpty(appDetailInfo.getBotInviterId()) || C27548m.m100547m().mo98222f() == null) {
            this.f68962q.setTextColor(ContextCompat.getColor(getContext(), R.color.text_caption));
            this.f68927H.setOnClickListener(null);
            this.f68927H.setClickable(false);
            return;
        }
        this.f68962q.setTextColor(ContextCompat.getColor(getContext(), R.color.text_link_normal));
        this.f68927H.setClickable(true);
        this.f68927H.setOnClickListener(new View.OnClickListener(appDetailInfo) {
            /* class com.ss.android.appcenter.business.activity.appdetail.$$Lambda$a$krJSX5LQjRak921C7h4jSxJngu0 */
            public final /* synthetic */ AppDetailInfo f$1;

            {
                this.f$1 = r2;
            }

            public final void onClick(View view) {
                C27626a.this.m100870h(this.f$1, view);
            }
        });
    }

    /* renamed from: a */
    private void m100831a(View view) {
        this.f68947b = (ImageView) view.findViewById(R.id.app_image);
        this.f68948c = (TextView) view.findViewById(R.id.app_name);
        this.f68949d = (TextView) view.findViewById(R.id.app_desc);
        this.f68960o = (TextView) view.findViewById(R.id.app_desc_tail);
        this.f68961p = (TextView) view.findViewById(R.id.app_developer);
        this.f68962q = (TextView) view.findViewById(R.id.app_inviter);
        this.f68963r = (TextView) view.findViewById(R.id.lark_app_label);
        this.f68964s = (TextView) view.findViewById(R.id.lark_h5_label);
        this.f68965t = (TextView) view.findViewById(R.id.bot_label);
        this.f68966u = (TextView) view.findViewById(R.id.oncall_label);
        this.f68967v = (TextView) view.findViewById(R.id.app_status_label);
        this.f68968w = (LinearLayout) view.findViewById(R.id.app_label_wrapper);
        this.f68969x = (TextView) view.findViewById(R.id.appdetail_propose);
        this.f68950e = (TextView) view.findViewById(R.id.bot_interact_text);
        this.f68951f = (TextView) view.findViewById(R.id.app_interact_text);
        this.f68952g = (TextView) view.findViewById(R.id.feedback_interact_text);
        this.f68953h = (ImageView) view.findViewById(R.id.back);
        this.f68954i = (ImageView) view.findViewById(R.id.menu);
        this.f68955j = (ImageView) view.findViewById(R.id.iv_share);
        this.f68970y = (ImageView) view.findViewById(R.id.app_developer_icon);
        this.f68971z = (LinearLayout) view.findViewById(R.id.app_open_app);
        this.f68920A = (LinearLayout) view.findViewById(R.id.app_message);
        this.f68925F = (RelativeLayout) view.findViewById(R.id.app_desc_tail_wrapper);
        this.f68926G = (RelativeLayout) view.findViewById(R.id.app_developer_wrapper);
        this.f68927H = (RelativeLayout) view.findViewById(R.id.app_inviter_wrapper);
        this.f68921B = (LinearLayout) view.findViewById(R.id.app_feedback);
        this.f68928I = (RelativeLayout) view.findViewById(R.id.app_help_file_wrapper);
        this.f68929J = (LinearLayout) view.findViewById(R.id.enter_wrapper);
        this.f68930K = (RelativeLayout) view.findViewById(R.id.propose_wrapper);
        this.f68931L = (FrameLayout) view.findViewById(R.id.error_view);
        this.f68956k = (UDSwitchWithLoading) view.findViewById(R.id.bot_edit_control_switch);
        this.f68932M = (ViewGroup) view.findViewById(R.id.bot_edit_control);
        this.f68933N = view.findViewById(R.id.bot_edit_no_perm);
        this.f68953h.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.appcenter.business.activity.appdetail.$$Lambda$a$xjqVMJeCHzuEbJ5zvRrCMS7hCA */

            public final void onClick(View view) {
                C27626a.this.m100840b((C27626a) view);
            }
        });
        this.f68922C = view.findViewById(R.id.enter_wrapper_divider1);
        this.f68923D = view.findViewById(R.id.enter_wrapper_divider2);
        this.f68924E = view.findViewById(R.id.toolbar_divider);
        this.f68934O = (FrameLayout) view.findViewById(R.id.loading_holder);
        this.f68935P = (LinearLayout) view.findViewById(R.id.container);
        this.f68957l = (FrameLayout) view.findViewById(R.id.header_blur);
        this.f68936Q = (FrameLayout) view.findViewById(R.id.header_layout);
    }

    /* renamed from: b */
    private void m100846b(boolean z) {
        if (z) {
            this.f68933N.setVisibility(8);
            return;
        }
        if (this.f68930K.getVisibility() == 8) {
            this.f68930K.setVisibility(0);
            this.f68969x.setVisibility(8);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f68933N.getLayoutParams();
            layoutParams.topMargin = 0;
            this.f68933N.setLayoutParams(layoutParams);
        }
        this.f68933N.setVisibility(0);
    }

    /* renamed from: c */
    private void m100850c(AppDetailInfo appDetailInfo) {
        ImageLoader.with(getContext()).load(AvatarImage.Builder.obtain(appDetailInfo.getAvatarKey(), "", LocationRequest.PRIORITY_INDOOR, LocationRequest.PRIORITY_INDOOR).build()).asBitmap().placeholder(R.color.bg_filler).listener(new AbstractC38817h<AvatarImage, Bitmap>() {
            /* class com.ss.android.appcenter.business.activity.appdetail.C27626a.C276315 */

            /* renamed from: a */
            public boolean mo53861a(Exception exc, AvatarImage avatarImage, AbstractC38819j<Bitmap> jVar, boolean z) {
                return false;
            }

            /* renamed from: a */
            public boolean mo53862a(Bitmap bitmap, AvatarImage avatarImage, AbstractC38819j<Bitmap> jVar, DataSource dataSource, boolean z) {
                C53241h.m205898b("AppDetailFragment", "resourceReady, bitmap: " + bitmap);
                BlurHelper.f59989a.mo87028a().mo87027a(C27626a.this.f68947b.getContext(), bitmap, new BlurResultCallback() {
                    /* class com.ss.android.appcenter.business.activity.appdetail.C27626a.C276315.C276321 */

                    @Override // com.larksuite.component.ignition.widget.blur.BlurResultCallback
                    /* renamed from: a */
                    public void mo87032a(Drawable drawable) {
                        C53241h.m205898b("AppDetailFragment", "blur drawable: " + drawable);
                        C27626a.this.f68957l.setBackground(drawable);
                    }
                });
                return false;
            }
        }).error(R.color.bg_filler).into(this.f68947b);
        if (Build.VERSION.SDK_INT >= 24) {
            this.f68936Q.setBackgroundResource(R.drawable.appcenter_appdetail_gradient);
        } else {
            this.f68936Q.setBackgroundResource(R.drawable.appcenter_appdetail_gradient_low);
        }
        this.f68948c.setText(appDetailInfo.getAppName());
        this.f68948c.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() {
            /* class com.ss.android.appcenter.business.activity.appdetail.C27626a.ViewTreeObserver$OnPreDrawListenerC276336 */

            public boolean onPreDraw() {
                if (C27626a.this.f68948c.getLineCount() == 1) {
                    C27626a.this.f68949d.setMaxLines(2);
                } else {
                    C27626a.this.f68949d.setMaxLines(1);
                }
                C27626a.this.f68948c.getViewTreeObserver().removeOnPreDrawListener(this);
                return false;
            }
        });
        this.f68949d.setText(appDetailInfo.getAppDescription());
    }

    /* renamed from: b */
    private boolean m100847b(Status status) {
        if (Status.isAvailable(status) || Status.isUnauthorized(status)) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public void mo98419b(AppDetailInfo appDetailInfo) {
        if (!this.f68943X) {
            mo98413a(appDetailInfo);
        } else if (this.f68944Y) {
            m100875l(appDetailInfo);
        } else {
            mo98413a(appDetailInfo);
            mo98418a(false);
            m100876m(appDetailInfo);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m100853c(AppDetailInfo appDetailInfo, boolean z) {
        m100835a(appDetailInfo, !z);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m100830a(DialogInterface dialogInterface, int i) {
        C27645c.m100931a(this.f68958m, this.f68959n, new C27714b.AbstractC27716a() {
            /* class com.ss.android.appcenter.business.activity.appdetail.C27626a.AnonymousClass12 */

            @Override // com.ss.android.appcenter.business.net.p1270a.C27714b.AbstractC27716a
            /* renamed from: a */
            public void mo98364a(ErrorResult errorResult, C27714b.C27717b bVar) {
                C53241h.m205894a("AppDetailFragment", "remove bot error " + errorResult);
                new OPMonitor("op_groupbot_delete", GroupBotMonitorCode.f69266k.mo98864d()).flush();
                LKUIToast.show(C27626a.this.f68946a.getContext(), C28209p.m103297a(C27626a.this.f68946a.getContext(), (int) R.string.Lark_GroupBot_DeleteBotFailed));
            }

            @Override // com.ss.android.appcenter.business.net.p1270a.C27714b.AbstractC27716a
            /* renamed from: a */
            public void mo98363a(SendHttpResponse sendHttpResponse, C27714b.C27717b bVar) {
                try {
                    if (C57782ag.m224241a(sendHttpResponse.json_body) || !new JSONObject(sendHttpResponse.json_body).has("ok") || !new JSONObject(sendHttpResponse.json_body).getBoolean("ok")) {
                        C53241h.m205894a("AppDetailFragment", "remove bot fail " + sendHttpResponse.json_body);
                        String string = new JSONObject(sendHttpResponse.json_body).getString("msg");
                        new OPMonitor("op_groupbot_delete", GroupBotMonitorCode.f69266k.mo98864d()).flush();
                        if (TextUtils.isEmpty(string)) {
                            LKUIToast.show(C27626a.this.f68946a.getContext(), C28209p.m103297a(C27626a.this.f68946a.getContext(), (int) R.string.Lark_GroupBot_DeleteBotFailed));
                        } else {
                            C27626a.this.mo98417a(string);
                        }
                    } else if (C27548m.m100547m().mo98222f() != null) {
                        new OPMonitor("op_groupbot_delete", GroupBotMonitorCode.f69266k.mo98863c()).flush();
                        C27548m.m100547m().mo98222f().mo98208e(C27626a.this.getContext(), C27626a.this.f68959n);
                    } else {
                        C53241h.m205894a("AppDetailFragment", "remove bot error, provider null");
                        new OPMonitor("op_groupbot_delete", GroupBotMonitorCode.f69266k.mo98864d()).flush();
                        LKUIToast.show(C27626a.this.f68946a.getContext(), C28209p.m103297a(C27626a.this.f68946a.getContext(), (int) R.string.Lark_GroupBot_DeleteBotFailed));
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                    C53241h.m205894a("AppDetailFragment", "remove bot error: " + sendHttpResponse.json_body);
                    new OPMonitor("op_groupbot_delete", GroupBotMonitorCode.f69266k.mo98864d()).flush();
                    LKUIToast.show(C27626a.this.f68946a.getContext(), C28209p.m103297a(C27626a.this.f68946a.getContext(), (int) R.string.Lark_GroupBot_DeleteBotFailed));
                }
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m100841b(AppDetailInfo appDetailInfo, View view) {
        C27710b.m101274b("openapp", m100867g(appDetailInfo));
        m100873j(appDetailInfo);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m100851c(AppDetailInfo appDetailInfo, View view) {
        m100874k(appDetailInfo);
        C27710b.m101274b("openchat", m100867g(appDetailInfo));
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ void m100858d(AppDetailInfo appDetailInfo, View view) {
        m100874k(appDetailInfo);
        C27710b.m101274b("openchat", m100867g(appDetailInfo));
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m100844b(AppDetailInfo appDetailInfo, boolean z) {
        m100835a(appDetailInfo, !z);
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public /* synthetic */ void m100870h(AppDetailInfo appDetailInfo, View view) {
        C27548m.m100547m().mo98222f().mo98207d(getContext(), appDetailInfo.getBotInviterId());
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public /* synthetic */ void m100872i(AppDetailInfo appDetailInfo, View view) {
        C27548m.m100547m().mo98222f().mo98207d(getContext(), appDetailInfo.getDeveloperId());
    }

    /* renamed from: a */
    private void m100835a(AppDetailInfo appDetailInfo, final boolean z) {
        if (!this.f68944Y) {
            C28184h.m103248b("AppDetailFragment", "handleUpdateBotEditStatus not add to group so return ");
            return;
        }
        C27645c.m100934a(appDetailInfo.getBotId(), this.f68959n, !TextUtils.isEmpty(appDetailInfo.getBotInviterName()), z, new C27714b.AbstractC27716a() {
            /* class com.ss.android.appcenter.business.activity.appdetail.C27626a.C276293 */

            /* access modifiers changed from: private */
            /* renamed from: a */
            public /* synthetic */ void m100897a(boolean z) {
                C27626a.this.f68956k.mo91763a(!z);
            }

            /* access modifiers changed from: private */
            /* renamed from: b */
            public /* synthetic */ void m100898b(boolean z) {
                C27626a.this.f68956k.mo91763a(!z);
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public /* synthetic */ void m100896a(DefaultResponse defaultResponse, boolean z) {
                if (defaultResponse.getCode() == 0) {
                    C27626a.this.f68956k.mo91763a(z);
                    return;
                }
                C27626a.this.f68956k.mo91763a(!z);
                C27626a.this.mo98417a(defaultResponse.getMsg());
            }

            @Override // com.ss.android.appcenter.business.net.p1270a.C27714b.AbstractC27716a
            /* renamed from: a */
            public void mo98363a(SendHttpResponse sendHttpResponse, C27714b.C27717b bVar) {
                C28184h.m103250d("AppDetailFragment", "handleUpdateBotEditStatus onSuccess = " + sendHttpResponse);
                if (sendHttpResponse.http_status_code.intValue() == 200) {
                    C27626a.this.mo98416a(new Runnable((DefaultResponse) new Gson().fromJson(sendHttpResponse.json_body, DefaultResponse.class), z) {
                        /* class com.ss.android.appcenter.business.activity.appdetail.$$Lambda$a$3$EeKsgfEq_TAkbOjPnGYNuiWEA */
                        public final /* synthetic */ DefaultResponse f$1;
                        public final /* synthetic */ boolean f$2;

                        {
                            this.f$1 = r2;
                            this.f$2 = r3;
                        }

                        public final void run() {
                            C27626a.C276293.this.m100896a((C27626a.C276293) this.f$1, (DefaultResponse) this.f$2);
                        }
                    });
                    return;
                }
                C27626a.this.mo98416a(new Runnable(z) {
                    /* class com.ss.android.appcenter.business.activity.appdetail.$$Lambda$a$3$la7DKn9Aus3syGk5mk1f_gMrhA */
                    public final /* synthetic */ boolean f$1;

                    {
                        this.f$1 = r2;
                    }

                    public final void run() {
                        C27626a.C276293.this.m100898b(this.f$1);
                    }
                });
                C28184h.m103248b("AppDetailFragment", "handleUpdateBotEditStatus occur exception");
            }

            @Override // com.ss.android.appcenter.business.net.p1270a.C27714b.AbstractC27716a
            /* renamed from: a */
            public void mo98364a(ErrorResult errorResult, C27714b.C27717b bVar) {
                C28184h.m103248b("AppDetailFragment", "handleUpdateBotEditStatus error " + errorResult);
                C27626a.this.mo98417a(errorResult.getDisplayMsg());
                C27626a.this.mo98416a(new Runnable(z) {
                    /* class com.ss.android.appcenter.business.activity.appdetail.$$Lambda$a$3$3vTNwj6p1zs1tthg45_NlnXXQ8s */
                    public final /* synthetic */ boolean f$1;

                    {
                        this.f$1 = r2;
                    }

                    public final void run() {
                        C27626a.C276293.this.m100897a(this.f$1);
                    }
                });
            }
        });
    }

    /* renamed from: b */
    private void m100842b(AppDetailInfo appDetailInfo, Status status) {
        if (!m100838a(status)) {
            this.f68955j.setVisibility(8);
        } else if (!TextUtils.isEmpty(appDetailInfo.getAppId())) {
            this.f68955j.setVisibility(0);
            C27710b.m101273b(appDetailInfo.getAppId());
            this.f68955j.setOnClickListener(new View.OnClickListener(appDetailInfo) {
                /* class com.ss.android.appcenter.business.activity.appdetail.$$Lambda$a$cBXS5yDhiCd_7YrCIYes7_CMjeY */
                public final /* synthetic */ AppDetailInfo f$1;

                {
                    this.f$1 = r2;
                }

                public final void onClick(View view) {
                    C27626a.this.m100866f(this.f$1, view);
                }
            });
        } else {
            this.f68955j.setVisibility(8);
        }
    }

    /* renamed from: c */
    private void m100852c(AppDetailInfo appDetailInfo, Status status) {
        if (!m100838a(status)) {
            this.f68921B.setVisibility(8);
        } else if (!appDetailInfo.isOpenFeedback()) {
            this.f68921B.setVisibility(8);
        } else {
            this.f68921B.setVisibility(0);
            this.f68921B.setOnClickListener(new View.OnClickListener(appDetailInfo) {
                /* class com.ss.android.appcenter.business.activity.appdetail.$$Lambda$a$oCVrq2B9o4esTSMzMVqP3p7gPCY */
                public final /* synthetic */ AppDetailInfo f$1;

                {
                    this.f$1 = r2;
                }

                public final void onClick(View view) {
                    C27626a.this.m100863e(this.f$1, view);
                }
            });
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ void m100863e(AppDetailInfo appDetailInfo, View view) {
        AppFeedbackActivity.m100937a(getContext(), appDetailInfo.getAppName(), appDetailInfo.getAppId(), "MobileAppDetail", null, null);
        C27710b.m101274b("feedback", m100867g(appDetailInfo));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m100832a(AppDetailInfo appDetailInfo, View view) {
        StringBuilder sb = new StringBuilder(C27724c.m101392k());
        sb.append('?');
        sb.append("type=app");
        sb.append("&params=");
        HashMap hashMap = new HashMap();
        hashMap.put("app_id", appDetailInfo.getAppId());
        try {
            sb.append(URLEncoder.encode(new Gson().toJson(hashMap), StandardCharsets.UTF_8.name()));
        } catch (UnsupportedEncodingException unused) {
            C28184h.m103248b("AppDetailFragment", "UnsupportedEncodingException");
        }
        ((UDActionPanelBuilder) ((UDActionPanelBuilder) new UDActionPanelBuilder(this.f68954i.getContext()).mo90870a(Arrays.asList(getString(R.string.OpenPlatform_AppCenter_AppReport), getString(R.string.OpenPlatform_AppCenter_Cancel)))).mo90869a(new UDListDialogController.OnItemClickListener(sb) {
            /* class com.ss.android.appcenter.business.activity.appdetail.$$Lambda$a$TYj55zsSURoThlZxpJVnPUNtAnE */
            public final /* synthetic */ StringBuilder f$1;

            {
                this.f$1 = r2;
            }

            @Override // com.larksuite.component.universe_design.dialog.UDListDialogController.OnItemClickListener
            public final void onItemClick(int i) {
                C27626a.this.m100837a((C27626a) this.f$1, (StringBuilder) i);
            }
        })).show();
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public /* synthetic */ void m100868g(AppDetailInfo appDetailInfo, View view) {
        C27548m.m100547m().mo98222f().mo98202a(getContext(), appDetailInfo.getAppHelpFile(), null, false, null, null);
        C27710b.m101274b("help", m100867g(appDetailInfo));
    }

    /* renamed from: a */
    private void m100833a(AppDetailInfo appDetailInfo, Status status) {
        if (!m100838a(status)) {
            this.f68925F.setVisibility(8);
        } else if (TextUtils.isEmpty(appDetailInfo.getUsageInfo())) {
            this.f68925F.setVisibility(8);
        } else {
            this.f68925F.setVisibility(0);
            this.f68960o.setText(appDetailInfo.getUsageInfo());
            getResources();
            if (getResources().getDisplayMetrics() != null) {
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f68960o.getLayoutParams();
                layoutParams.leftMargin = (int) (((double) getResources().getDisplayMetrics().widthPixels) * 0.48d);
                this.f68960o.setLayoutParams(layoutParams);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public /* synthetic */ void m100866f(AppDetailInfo appDetailInfo, View view) {
        C27548m.m100547m().mo98216a().mo98155a(getContext(), "opshare_profile", appDetailInfo.getAppId(), appDetailInfo.getAvatarKey(), appDetailInfo.getAppName(), appDetailInfo.getAppDescription());
        C27710b.m101282c(appDetailInfo.getAppId());
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        View inflate = layoutInflater.inflate(R.layout.appcenter_appdetail_layout, viewGroup, false);
        this.f68946a = inflate;
        m100831a(inflate);
        this.f68942W = false;
        m100848c();
        if (UDUiModeUtils.m93319a(layoutInflater.getContext())) {
            i = R.color.appdetail_skeleton_night;
        } else {
            i = R.color.appdetail_skeleton_light;
        }
        this.f68945Z = C2052c.m8961a(this.f68934O).mo10151a(R.layout.appcenter_appdetail_loading_layout).mo10154b(i).mo10152a(UIUtils.canShowSkeleton()).mo10153a();
        m100860e();
        m100855d().getAppDetailInfoMediatorLiveData().mo5923a(getViewLifecycleOwner(), new AbstractC1178x<AppDetailInfo>() {
            /* class com.ss.android.appcenter.business.activity.appdetail.C27626a.C276271 */

            /* renamed from: a */
            public void onChanged(AppDetailInfo appDetailInfo) {
                if (appDetailInfo == null) {
                    C27626a.this.mo98412a();
                    return;
                }
                StatusBarUtil.setTransparentForImageView(C27626a.this.getActivity(), C27626a.this.f68953h);
                StatusBarUtil.setTransparentForImageView(C27626a.this.getActivity(), C27626a.this.f68954i);
                StatusBarUtil.setTransparentForImageView(C27626a.this.getActivity(), C27626a.this.f68955j);
                if (C27626a.this.f68958m == null || (!C27626a.this.f68958m.equals(appDetailInfo.getAppId()) && !C27626a.this.f68958m.equals(appDetailInfo.getBotId()) && !C27626a.this.f68958m.equals(appDetailInfo.getOnCallId()))) {
                    C53241h.m205894a("AppDetailFragment", "id not match, ignore " + C27626a.this.f68958m + ": " + appDetailInfo.getAppId() + ", " + appDetailInfo.getBotId());
                    return;
                }
                C27626a.this.mo98419b(appDetailInfo);
            }
        });
        m100855d().getAppDetailInfoMediatorLiveData(this.f68958m, this.f68937R, "");
        return this.f68946a;
    }

    /* renamed from: a */
    private void m100836a(Status status, boolean z, boolean z2, boolean z3, boolean z4) {
        if (z4) {
            this.f68965t.setVisibility(8);
            this.f68963r.setVisibility(8);
            this.f68964s.setVisibility(8);
            this.f68967v.setVisibility(8);
            this.f68966u.setVisibility(0);
            return;
        }
        this.f68966u.setVisibility(8);
        if (!m100847b(status)) {
            this.f68967v.setVisibility(0);
            this.f68963r.setVisibility(8);
            this.f68964s.setVisibility(8);
            this.f68965t.setVisibility(8);
            int i = C276304.f68981a[status.ordinal()];
            if (i == 1) {
                this.f68967v.setText(R.string.OpenPlatform_AppCenter_AppOfflineTag);
            } else if (i != 2) {
                this.f68967v.setText(R.string.OpenPlatform_AppCenter_Deactivated);
            } else {
                this.f68967v.setText(R.string.OpenPlatform_AppCenter_AppDeletedTag);
            }
        }
        if (m100847b(status)) {
            this.f68967v.setVisibility(8);
            if (!z2) {
                this.f68963r.setVisibility(8);
            } else {
                this.f68963r.setVisibility(0);
            }
            if (!z) {
                this.f68964s.setVisibility(8);
            } else {
                this.f68964s.setVisibility(0);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f68964s.getLayoutParams();
                if (marginLayoutParams != null) {
                    if (this.f68963r.getVisibility() != 0) {
                        marginLayoutParams.leftMargin = 0;
                    } else {
                        marginLayoutParams.leftMargin = C28209p.m103293a(getContext(), 4.0f);
                    }
                    this.f68964s.setLayoutParams(marginLayoutParams);
                }
            }
            if (!z3) {
                this.f68965t.setVisibility(8);
            } else {
                this.f68965t.setVisibility(0);
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.f68965t.getLayoutParams();
                if (marginLayoutParams2 != null) {
                    if (this.f68963r.getVisibility() == 0 || this.f68964s.getVisibility() == 0) {
                        marginLayoutParams2.leftMargin = C28209p.m103293a(getContext(), 4.0f);
                    } else {
                        marginLayoutParams2.leftMargin = 0;
                    }
                    this.f68965t.setLayoutParams(marginLayoutParams2);
                }
            }
        }
        if (this.f68963r.getVisibility() == 0 || this.f68964s.getVisibility() == 0 || this.f68965t.getVisibility() == 0 || this.f68967v.getVisibility() == 0 || this.f68966u.getVisibility() == 0) {
            this.f68968w.setVisibility(0);
            ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) this.f68949d.getLayoutParams();
            if (marginLayoutParams3 != null) {
                marginLayoutParams3.bottomMargin = 0;
                this.f68949d.setLayoutParams(marginLayoutParams3);
                return;
            }
            return;
        }
        this.f68968w.setVisibility(8);
        ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) this.f68949d.getLayoutParams();
        if (marginLayoutParams4 != null) {
            marginLayoutParams4.bottomMargin = C28209p.m103293a(getContext(), 33.0f);
            this.f68949d.setLayoutParams(marginLayoutParams4);
        }
    }

    /* renamed from: b */
    private void m100843b(AppDetailInfo appDetailInfo, Status status, boolean z, boolean z2, boolean z3, boolean z4) {
        AppDetailInfo.ChatType chatType = appDetailInfo.getChatType();
        if (!m100838a(status)) {
            int i = C276304.f68981a[status.ordinal()];
            if (i == 1 || i == 2) {
                if (!z3 || !chatType.hasHistory()) {
                    this.f68920A.setVisibility(8);
                } else {
                    this.f68920A.setVisibility(0);
                    this.f68920A.setOnClickListener(new View.OnClickListener(appDetailInfo) {
                        /* class com.ss.android.appcenter.business.activity.appdetail.$$Lambda$a$todE0YlbQr2tftevohB1PQAfQM */
                        public final /* synthetic */ AppDetailInfo f$1;

                        {
                            this.f$1 = r2;
                        }

                        public final void onClick(View view) {
                            C27626a.this.m100858d(this.f$1, view);
                        }
                    });
                    this.f68950e.setText(R.string.OpenPlatform_AppCenter_ViewHistoryNews);
                }
                this.f68971z.setVisibility(8);
            } else {
                this.f68971z.setVisibility(8);
                this.f68920A.setVisibility(8);
            }
        }
        if (m100838a(status)) {
            AppDetailInfo.ChatType chatType2 = appDetailInfo.getChatType();
            if (!z3 || !chatType2.canOpenChat()) {
                this.f68920A.setVisibility(8);
            } else {
                this.f68920A.setVisibility(0);
                this.f68920A.setOnClickListener(new View.OnClickListener(appDetailInfo) {
                    /* class com.ss.android.appcenter.business.activity.appdetail.$$Lambda$a$oLJ88zhR9rgeLsKqA6FgDvywtpg */
                    public final /* synthetic */ AppDetailInfo f$1;

                    {
                        this.f$1 = r2;
                    }

                    public final void onClick(View view) {
                        C27626a.this.m100851c((C27626a) this.f$1, (AppDetailInfo) view);
                    }
                });
                if (chatType2.canInteract()) {
                    this.f68950e.setText(R.string.AppDetail_Card_MessageBotTooltip);
                } else {
                    this.f68950e.setText(R.string.AppDetail_Card_ViewMessage);
                }
            }
            if ((z || z2) && !TextUtils.isEmpty(appDetailInfo.getAppUrl())) {
                this.f68971z.setVisibility(0);
                this.f68971z.setOnClickListener(new View.OnClickListener(appDetailInfo) {
                    /* class com.ss.android.appcenter.business.activity.appdetail.$$Lambda$a$M6wIvz7o0hrcN8pFOCqvTo8wcNg */
                    public final /* synthetic */ AppDetailInfo f$1;

                    {
                        this.f$1 = r2;
                    }

                    public final void onClick(View view) {
                        C27626a.this.m100841b((C27626a) this.f$1, (AppDetailInfo) view);
                    }
                });
            } else {
                this.f68971z.setVisibility(8);
            }
        }
        if (z4) {
            this.f68920A.setVisibility(8);
        }
    }

    /* renamed from: a */
    private void m100834a(AppDetailInfo appDetailInfo, Status status, boolean z, boolean z2, boolean z3, boolean z4) {
        m100852c(appDetailInfo, status);
        m100843b(appDetailInfo, status, z, z2, z3, z4);
        this.f68922C.setVisibility(8);
        this.f68923D.setVisibility(8);
        this.f68920A.setOrientation(0);
        this.f68971z.setOrientation(0);
        this.f68921B.setOrientation(0);
        this.f68950e.setTextSize(16.0f);
        ((LinearLayout.LayoutParams) this.f68950e.getLayoutParams()).leftMargin = C28209p.m103291a(5.0f);
        this.f68952g.setTextSize(16.0f);
        ((LinearLayout.LayoutParams) this.f68952g.getLayoutParams()).leftMargin = C28209p.m103291a(5.0f);
        this.f68951f.setTextSize(16.0f);
        ((LinearLayout.LayoutParams) this.f68951f.getLayoutParams()).leftMargin = C28209p.m103291a(5.0f);
        if (this.f68920A.getVisibility() == 0 && this.f68971z.getVisibility() == 0 && this.f68921B.getVisibility() == 0) {
            this.f68922C.setVisibility(0);
            this.f68923D.setVisibility(0);
            m100864f();
        } else if (this.f68920A.getVisibility() == 0 && ((this.f68971z.getVisibility() == 8 && this.f68921B.getVisibility() == 0) || (this.f68971z.getVisibility() == 0 && this.f68921B.getVisibility() == 8))) {
            this.f68922C.setVisibility(0);
            m100864f();
        } else if (this.f68920A.getVisibility() == 8 && this.f68971z.getVisibility() == 0 && this.f68921B.getVisibility() == 0) {
            this.f68923D.setVisibility(0);
            m100864f();
        }
        if (this.f68920A.getVisibility() == 0 || this.f68971z.getVisibility() == 0 || this.f68921B.getVisibility() == 0) {
            this.f68929J.setVisibility(0);
            this.f68924E.setVisibility(8);
            return;
        }
        this.f68929J.setVisibility(8);
        this.f68924E.setVisibility(0);
    }
}
