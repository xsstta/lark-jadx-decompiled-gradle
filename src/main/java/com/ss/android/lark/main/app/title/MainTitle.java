package com.ss.android.lark.main.app.title;

import android.app.Activity;
import android.content.Context;
import android.content.MutableContextWrapper;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Point;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Size;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.component.ui.imageview.LKUIBadgeView;
import com.larksuite.component.ui.imageview.LKUIRoundedImageView;
import com.larksuite.component.universe_design.icon.UDIconUtils;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.framework.utils.ak;
import com.larksuite.suite.R;
import com.ss.android.lark.guide.ui.GuideComponent;
import com.ss.android.lark.guide.ui.config.AnchorConfig;
import com.ss.android.lark.guide.ui.config.ButtonBubbleConfig;
import com.ss.android.lark.guide.ui.config.ButtonConfig;
import com.ss.android.lark.guide.ui.config.GuideDelegate;
import com.ss.android.lark.guide.ui.config.ImageConfig;
import com.ss.android.lark.guide.ui.config.MaskConfig;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.main.C44134a;
import com.ss.android.lark.main.app.title.LabelView;
import com.ss.android.lark.main.statistics.MainHitPointHelper;
import com.ss.android.lark.maincore.IFunctionButtonV2;
import com.ss.android.lark.maincore.ITitleInfo;
import com.ss.android.lark.passport.signinsdk_api.account.TenantInfo;
import com.ss.android.lark.passport.signinsdk_api.account.User;
import com.ss.android.lark.reaction.p2557b.C52977a;
import com.ss.android.lark.util.share_preference.C57744a;
import com.ss.android.lark.utils.UIHelper;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MainTitle extends ConstraintLayout {

    /* renamed from: e */
    private static final int f112630e = UIHelper.dp2px(24.0f);

    /* renamed from: f */
    private static final int f112631f = UIHelper.dp2px(32.0f);

    /* renamed from: g */
    private static final int f112632g = UIHelper.dp2px(10.0f);

    /* renamed from: h */
    private static final int f112633h = UIHelper.dp2px(240.0f);

    /* renamed from: i */
    private static final int f112634i = UIHelper.dp2px(146.0f);

    /* renamed from: A */
    private View f112635A;

    /* renamed from: B */
    private final View.OnLayoutChangeListener f112636B;

    /* renamed from: a */
    public LKUIRoundedImageView f112637a;

    /* renamed from: b */
    public ImageView f112638b;

    /* renamed from: c */
    public AbstractC44403a f112639c;

    /* renamed from: d */
    public LabelView.LabelStatus f112640d;

    /* renamed from: j */
    private ConstraintLayout f112641j;

    /* renamed from: k */
    private TextView f112642k;

    /* renamed from: l */
    private View f112643l;

    /* renamed from: m */
    private LabelView f112644m;

    /* renamed from: n */
    private View f112645n;

    /* renamed from: o */
    private ImageView f112646o;

    /* renamed from: p */
    private ImageView f112647p;

    /* renamed from: q */
    private ImageView f112648q;

    /* renamed from: r */
    private LKUIBadgeView f112649r;

    /* renamed from: s */
    private ConstraintLayout f112650s;

    /* renamed from: t */
    private Group f112651t;

    /* renamed from: u */
    private ImageView f112652u;

    /* renamed from: v */
    private TextView f112653v;

    /* renamed from: w */
    private int[] f112654w;

    /* renamed from: x */
    private List<IFunctionButtonV2.C44541a> f112655x;

    /* renamed from: y */
    private boolean f112656y;

    /* renamed from: z */
    private boolean f112657z;

    /* renamed from: com.ss.android.lark.main.app.title.MainTitle$a */
    public interface AbstractC44403a {
        /* renamed from: a */
        void mo157700a();

        /* renamed from: a */
        void mo157701a(View view);

        /* renamed from: b */
        void mo157702b();

        /* renamed from: c */
        void mo157703c();

        /* renamed from: d */
        void mo157704d();

        /* renamed from: e */
        String mo157705e();

        /* renamed from: f */
        void mo157706f();
    }

    public View getMenuEntranceView() {
        return this.f112644m;
    }

    /* renamed from: a */
    public void mo157678a(String str, String str2) {
        Log.m165389i("MainModule_MainTitle", "showChatterAvatar：" + str);
        C44134a.m174959a().mo133215a(getContext(), str, str2, this.f112637a, UIHelper.dp2px(32.0f), UIHelper.dp2px(32.0f));
        mo157680a(C44134a.m174959a().mo133187G().mo133371a());
    }

    /* renamed from: a */
    public void mo157680a(boolean z) {
        this.f112637a.setBorderWidthDP(z ? 2.0f : BitmapDescriptorFactory.HUE_RED);
        this.f112637a.setBorderColor(z ? UIUtils.getColor(getContext(), R.color.lkui_B500) : 0);
    }

    /* renamed from: a */
    public void mo157679a(List<View> list, List<IFunctionButtonV2.C44541a> list2) {
        View view;
        Log.m165389i("MainModule_MainTitle", "setFunctionButton: funcButtonSize= " + list.size());
        if (list.isEmpty()) {
            this.f112650s.removeAllViews();
            this.f112650s.setVisibility(8);
            return;
        }
        this.f112650s.setVisibility(0);
        boolean z = true;
        boolean z2 = list.size() == this.f112650s.getChildCount();
        int i = 0;
        while (true) {
            if (i >= list.size()) {
                break;
            } else if (list.get(i) != this.f112650s.getChildAt(i)) {
                z2 = false;
                break;
            } else {
                i++;
            }
        }
        if (!z2 || list2.size() != this.f112655x.size()) {
            z = false;
        }
        if (z) {
            int i2 = 0;
            while (true) {
                if (i2 >= list2.size()) {
                    break;
                } else if (!IFunctionButtonV2.C44541a.m176738a(list2.get(i2), this.f112655x.get(i2))) {
                    z = false;
                    break;
                } else {
                    i2++;
                }
            }
        }
        if (!z) {
            this.f112650s.removeAllViews();
            Log.m165389i("MainModule_MainTitle", "existChildCount=" + this.f112650s.getChildCount() + " funcButtonSize=" + list.size());
            for (int i3 = 0; i3 < list.size(); i3++) {
                ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(UIHelper.dp2px(24.0f), UIHelper.dp2px(24.0f));
                View view2 = list.get(i3);
                if (view2.getId() == -1) {
                    view2.setId(this.f112654w[i3]);
                }
                if (i3 != 0) {
                    layoutParams.leftMargin = UIHelper.dp2px(20.0f);
                    layoutParams.f2813e = list.get(i3 - 1).getId();
                } else {
                    layoutParams.leftMargin = UIHelper.dp2px(10.0f);
                    layoutParams.f2812d = this.f112650s.getId();
                }
                layoutParams.f2816h = this.f112650s.getId();
                layoutParams.f2819k = this.f112650s.getId();
                view2.setLayoutParams(layoutParams);
                if (view2.getParent() != null) {
                    Log.m165383e("MainModule_MainTitle", "button:" + view2 + ",index=" + i3 + ",already has parent = " + view2.getParent().getClass() + ", " + view2.getParent());
                }
                this.f112650s.addView(view2);
                IFunctionButtonV2.C44541a aVar = list2.get(i3);
                if (aVar != null && aVar.mo158042c()) {
                    ConstraintLayout.LayoutParams layoutParams2 = new ConstraintLayout.LayoutParams(UIHelper.dp2px(10.0f), UIHelper.dp2px(10.0f));
                    if (aVar.mo158041b() == IFunctionButtonV2.TipStyle.Custom) {
                        view = aVar.mo158040a();
                    } else {
                        view = new View(getContext());
                        view.setBackgroundResource(R.drawable.badge_orange_bg_no_count_no_stroke);
                    }
                    layoutParams2.f2813e = view2.getId();
                    layoutParams2.f2815g = view2.getId();
                    layoutParams2.f2816h = view2.getId();
                    layoutParams2.f2818j = view2.getId();
                    this.f112650s.addView(view, layoutParams2);
                }
                ak.m95026a(view2, UIHelper.dp2px(10.0f));
            }
            this.f112655x = list2;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public /* synthetic */ void m176160f() {
        m176155b(this.f112637a);
    }

    public View getMenuEntranceTextView() {
        return this.f112644m.getLabelTextView();
    }

    /* renamed from: b */
    public void mo157681b() {
        View view = this.f112635A;
        if (view != null) {
            removeView(view);
            this.f112635A = null;
        }
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ConstraintLayout constraintLayout = this.f112650s;
        if (constraintLayout != null) {
            constraintLayout.addOnLayoutChangeListener(this.f112636B);
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ConstraintLayout constraintLayout = this.f112650s;
        if (constraintLayout != null) {
            constraintLayout.removeOnLayoutChangeListener(this.f112636B);
        }
    }

    /* renamed from: e */
    private void m176159e() {
        if (!this.f112656y || !this.f112657z) {
            this.f112651t.setVisibility(8);
        } else {
            this.f112651t.setVisibility(0);
        }
    }

    private Activity getActivity() {
        Context context;
        if (getContext() instanceof Activity) {
            context = getContext();
        } else {
            context = ((MutableContextWrapper) getContext()).getBaseContext();
        }
        return (Activity) context;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.main.app.title.MainTitle$9 */
    public static /* synthetic */ class C444029 {

        /* renamed from: a */
        static final /* synthetic */ int[] f112667a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.ss.android.lark.maincore.ITitleInfo$IconStyle[] r0 = com.ss.android.lark.maincore.ITitleInfo.IconStyle.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ss.android.lark.main.app.title.MainTitle.C444029.f112667a = r0
                com.ss.android.lark.maincore.ITitleInfo$IconStyle r1 = com.ss.android.lark.maincore.ITitleInfo.IconStyle.Up     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.ss.android.lark.main.app.title.MainTitle.C444029.f112667a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.ss.android.lark.maincore.ITitleInfo$IconStyle r1 = com.ss.android.lark.maincore.ITitleInfo.IconStyle.Down     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.ss.android.lark.main.app.title.MainTitle.C444029.f112667a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.ss.android.lark.maincore.ITitleInfo$IconStyle r1 = com.ss.android.lark.maincore.ITitleInfo.IconStyle.Hide     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.main.app.title.MainTitle.C444029.<clinit>():void");
        }
    }

    private Drawable getTenantGuideDrawable() {
        Activity activity = getActivity();
        Drawable drawable = UIUtils.getDrawable(getContext(), R.drawable.icon_tenant_guide_tip);
        if (activity == null) {
            Log.m165383e("MainModule_MainTitle", "activity is null");
            return drawable;
        }
        return new BitmapDrawable(activity.getResources(), Bitmap.createScaledBitmap(BitmapFactory.decodeResource(activity.getResources(), R.drawable.icon_tenant_guide_tip), f112633h, f112634i, true));
    }

    /* renamed from: d */
    private void m176158d() {
        View$OnClickListenerC443952 r0 = new View.OnClickListener() {
            /* class com.ss.android.lark.main.app.title.MainTitle.View$OnClickListenerC443952 */

            public void onClick(View view) {
                if (MainTitle.this.f112639c != null) {
                    if (!C57744a.m224104a().getBoolean("key_param_activity_avatar_hide", false)) {
                        C57744a.m224104a().putBoolean("key_param_activity_avatar_hide", true);
                        MainHitPointHelper.m176662a();
                        MainTitle.this.f112638b.setVisibility(8);
                    }
                    MainTitle.this.f112639c.mo157700a();
                }
            }
        };
        this.f112637a.setOnClickListener(r0);
        this.f112643l.setOnClickListener(r0);
        View$OnClickListenerC443963 r02 = new View.OnClickListener() {
            /* class com.ss.android.lark.main.app.title.MainTitle.View$OnClickListenerC443963 */

            public void onClick(View view) {
                if (MainTitle.this.f112639c != null) {
                    MainTitle.this.f112639c.mo157702b();
                }
            }
        };
        this.f112644m.setOnClickListener(r02);
        this.f112645n.setOnClickListener(r02);
        setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.main.app.title.MainTitle.View$OnClickListenerC443974 */

            public void onClick(View view) {
                if (MainTitle.this.f112639c != null) {
                    MainTitle.this.f112639c.mo157703c();
                }
            }
        });
        final GestureDetector gestureDetector = new GestureDetector(getContext(), new GestureDetector.SimpleOnGestureListener() {
            /* class com.ss.android.lark.main.app.title.MainTitle.C443985 */

            public boolean onDoubleTap(MotionEvent motionEvent) {
                if (MainTitle.this.f112639c != null) {
                    MainTitle.this.f112639c.mo157704d();
                }
                return super.onDoubleTap(motionEvent);
            }
        });
        setOnTouchListener(new View.OnTouchListener() {
            /* class com.ss.android.lark.main.app.title.MainTitle.View$OnTouchListenerC443996 */

            public boolean onTouch(View view, MotionEvent motionEvent) {
                gestureDetector.onTouchEvent(motionEvent);
                return MainTitle.this.onTouchEvent(motionEvent);
            }
        });
        this.f112637a.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
            /* class com.ss.android.lark.main.app.title.MainTitle.ViewTreeObserver$OnGlobalLayoutListenerC444007 */

            public void onGlobalLayout() {
                if (MainTitle.this.f112639c != null) {
                    MainTitle.this.f112639c.mo157701a(MainTitle.this.f112637a);
                }
                MainTitle.this.f112637a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            }
        });
        $$Lambda$MainTitle$lNigpd_XWdAlSaNAC9WfCGIGp3c r03 = new View.OnClickListener() {
            /* class com.ss.android.lark.main.app.title.$$Lambda$MainTitle$lNigpd_XWdAlSaNAC9WfCGIGp3c */

            public final void onClick(View view) {
                MainTitle.this.m176157c(view);
            }
        };
        for (int i : this.f112651t.getReferencedIds()) {
            findViewById(i).setOnClickListener(r03);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo157671a() {
        User m = C44134a.m174959a().mo133188H().mo133423m();
        List<TenantInfo> a = C44134a.m174959a().mo133188H().mo133395a();
        if (m == null || a == null) {
            Log.m165397w("MainModule_MainTitle", "foregroundUser or tenantInfos is null");
            return;
        }
        boolean a2 = C44134a.m174959a().mo133200T().mo133283a("mobile_entry_new_Homepage");
        if (m176154a(m.createTime) && a.size() > 1 && a2) {
            LKUIRoundedImageView lKUIRoundedImageView = this.f112637a;
            if (lKUIRoundedImageView == null) {
                Log.m165397w("MainModule_MainTitle", "mAvatar is null!");
            } else {
                lKUIRoundedImageView.post(new Runnable() {
                    /* class com.ss.android.lark.main.app.title.$$Lambda$MainTitle$_Y74FeEjVA64yqKoC5l_12428gk */

                    public final void run() {
                        MainTitle.this.m176160f();
                    }
                });
            }
        }
    }

    /* renamed from: c */
    private void m176156c() {
        LayoutInflater.from(getContext()).inflate(R.layout.main_title, (ViewGroup) this, true);
        this.f112641j = (ConstraintLayout) findViewById(R.id.title_content_layout);
        this.f112650s = (ConstraintLayout) findViewById(R.id.function_btn_container);
        this.f112637a = (LKUIRoundedImageView) findViewById(R.id.avatar);
        this.f112643l = findViewById(R.id.avatar_click_wrapper);
        this.f112644m = (LabelView) findViewById(R.id.label);
        this.f112642k = (TextView) findViewById(R.id.tenant_desc);
        this.f112638b = (ImageView) findViewById(R.id.reward_tip_view);
        this.f112645n = findViewById(R.id.label_click_wrapper);
        this.f112646o = (ImageView) findViewById(R.id.update_tip);
        this.f112647p = (ImageView) findViewById(R.id.bottom_tip);
        this.f112648q = (ImageView) findViewById(R.id.tenant_avatar_badge);
        this.f112649r = (LKUIBadgeView) findViewById(R.id.new_user_tip);
        this.f112651t = (Group) findViewById(R.id.custom_status_layout);
        this.f112652u = (ImageView) findViewById(R.id.custom_status_icon);
        this.f112653v = (TextView) findViewById(R.id.custom_status_title);
        m176158d();
        TypedArray obtainTypedArray = getContext().getResources().obtainTypedArray(R.array.function_btn_ids);
        int length = obtainTypedArray.length();
        this.f112654w = new int[length];
        for (int i = 0; i < length; i++) {
            this.f112654w[i] = obtainTypedArray.getResourceId(i, 0);
        }
        obtainTypedArray.recycle();
    }

    public void setOnTitleClickListener(AbstractC44403a aVar) {
        this.f112639c = aVar;
    }

    public MainTitle(Context context) {
        this(context, null);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m176157c(View view) {
        AbstractC44403a aVar = this.f112639c;
        if (aVar != null) {
            aVar.mo157706f();
        }
    }

    public void setCustomStatusEnabled(boolean z) {
        this.f112656y = z;
        m176159e();
    }

    public void setTintedArrowView(int i) {
        this.f112644m.setTintedArrowView(i);
    }

    public void setCustomStatus(Drawable drawable) {
        if (this.f112657z) {
            this.f112652u.setImageDrawable(drawable);
        }
    }

    /* renamed from: a */
    public void mo157673a(View view) {
        int i;
        this.f112635A = view;
        if (view.getLayoutParams() != null) {
            i = view.getLayoutParams().height;
        } else {
            i = -2;
        }
        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(-1, i);
        layoutParams.f2817i = R.id.title_content_layout;
        addView(view, layoutParams);
    }

    public void setName(String str) {
        Log.m165389i("MainModule_MainTitle", "set title name: " + str);
        this.f112644m.setLabelName(str);
    }

    /* renamed from: a */
    private boolean m176154a(long j) {
        try {
            Date parse = new SimpleDateFormat("yyyy-MM-dd").parse("2021-06-28");
            if (parse == null || j <= parse.getTime()) {
                return false;
            }
            return true;
        } catch (ParseException e) {
            e.printStackTrace();
            Log.m165399w("MainModule_MainTitle", e);
        }
        return false;
    }

    /* renamed from: b */
    private void m176155b(View view) {
        AnchorConfig anchorConfig = new AnchorConfig(view, AnchorConfig.AnchorGravity.END, new Point(f112630e, 0));
        float f = (float) f112632g;
        MaskConfig.ShapeType shapeType = MaskConfig.ShapeType.CIRCLE;
        int i = f112631f;
        MaskConfig maskConfig = new MaskConfig(76, f, shapeType, null, new Size(i, i));
        ButtonConfig eVar = new ButtonConfig(UIHelper.getString(R.string.Lark_Accounts_OnboardWelcomeToTenantButton), new ButtonConfig.ButtonAction() {
            /* class com.ss.android.lark.main.app.title.MainTitle.C443941 */

            @Override // com.ss.android.lark.guide.ui.config.ButtonConfig.ButtonAction
            public void onClick(View view, GuideDelegate gVar) {
                if (gVar.mo141658a()) {
                    gVar.mo141659b();
                }
            }
        });
        ImageConfig hVar = new ImageConfig(getTenantGuideDrawable());
        AbstractC44403a aVar = this.f112639c;
        if (aVar != null) {
            String e = aVar.mo157705e();
            if (!TextUtils.isEmpty(e)) {
                GuideComponent.m152612a(getActivity(), new ButtonBubbleConfig(anchorConfig, maskConfig, null, UIHelper.mustacheFormat((int) R.string.Lark_Accounts_OnboardWelcomeToTenant, "TenantName", e), hVar, null, eVar));
                C44134a.m174959a().mo133200T().mo133284b("mobile_entry_new_Homepage");
            }
        }
    }

    /* renamed from: a */
    public void mo157672a(int i) {
        Log.m165389i("MainModule_MainTitle", "updateTipView:" + i);
        this.f112647p.setVisibility(8);
        this.f112648q.setVisibility(8);
        this.f112638b.setVisibility(8);
        this.f112646o.setVisibility(8);
        this.f112649r.setVisibility(8);
        if ((i & 16) == 16) {
            this.f112647p.setImageDrawable(UIHelper.getDrawable(R.drawable.main_icon_do_not_disturb_mark));
            this.f112647p.setVisibility(0);
        } else if ((i & 8) == 8 && C44134a.m174959a().mo133248e().mo133308b()) {
            this.f112648q.setVisibility(0);
        } else if ((i & 4) == 4) {
            this.f112646o.setImageDrawable(UIHelper.getDrawable(R.drawable.ic_upgrade_badge));
            this.f112646o.setVisibility(0);
        } else if ((i & 2) == 2) {
            this.f112638b.setImageDrawable(UDIconUtils.getIconDrawable(getContext(), (int) R.drawable.ud_icon_activity_filled, UIHelper.getColor(R.color.static_white)));
            this.f112638b.setVisibility(0);
        } else if ((i & 1) == 1) {
            this.f112649r.setVisibility(0);
        }
    }

    /* renamed from: b */
    public void mo157682b(LabelView.LabelStatus labelStatus) {
        this.f112640d = labelStatus;
        float windowWidth = (float) ((UIHelper.getWindowWidth(getContext()) - this.f112641j.getPaddingLeft()) - this.f112641j.getPaddingRight());
        if (this.f112643l.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f112643l.getLayoutParams();
            windowWidth = ((windowWidth - ((float) this.f112643l.getWidth())) - ((float) marginLayoutParams.leftMargin)) - ((float) marginLayoutParams.rightMargin);
        }
        if (this.f112650s.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.f112650s.getLayoutParams();
            windowWidth = ((windowWidth - ((float) this.f112650s.getWidth())) - ((float) marginLayoutParams2.leftMargin)) - ((float) marginLayoutParams2.rightMargin);
        }
        this.f112644m.mo157663a(labelStatus, windowWidth);
    }

    /* renamed from: a */
    public void mo157674a(LabelView.LabelStatus labelStatus) {
        Log.m165389i("MainModule_MainTitle", "updateTitleStatus:" + labelStatus);
        if (labelStatus == LabelView.LabelStatus.Loading) {
            MainHitPointHelper.m176674d();
        } else {
            MainHitPointHelper.m176675e();
        }
        mo157682b(labelStatus);
    }

    /* renamed from: a */
    public void mo157675a(ITitleInfo.IconStyle iconStyle) {
        Log.m165389i("MainModule_MainTitle", "updateLabelIconStatus:" + iconStyle);
        int i = C444029.f112667a[iconStyle.ordinal()];
        if (i == 1) {
            this.f112644m.mo157662a(LabelView.IconStatus.Open);
        } else if (i == 2) {
            this.f112644m.mo157662a(LabelView.IconStatus.Close);
        } else if (i == 3) {
            this.f112644m.mo157662a(LabelView.IconStatus.Hide);
        }
    }

    /* renamed from: a */
    public void mo157676a(ITitleInfo.C44543b bVar) {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("updateSelectedItem:");
        if (bVar == null) {
            str = null;
        } else {
            str = bVar.mo158046a();
        }
        sb.append(str);
        Log.m165389i("MainModule_MainTitle", sb.toString());
        this.f112644m.mo157664a(bVar);
    }

    /* renamed from: a */
    public void mo157677a(String str) {
        Log.m165389i("MainModule_MainTitle", "showTenantDecs：" + str);
        if (TextUtils.isEmpty(str)) {
            this.f112642k.setVisibility(8);
            this.f112644m.setTextSizeMode(LabelView.LabelMode.Large);
            return;
        }
        this.f112642k.setVisibility(0);
        this.f112642k.setText(str);
        this.f112644m.setTextSizeMode(LabelView.LabelMode.Small);
    }

    public MainTitle(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: b */
    public void mo157683b(String str, String str2) {
        boolean z;
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str)) {
            z = false;
        } else {
            z = true;
        }
        this.f112657z = z;
        if (z) {
            C52977a.m205190a().mo180995a(this.f112652u, str);
            this.f112653v.setText(str2);
        }
        m176159e();
    }

    public MainTitle(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f112655x = new ArrayList();
        this.f112640d = null;
        this.f112636B = new View.OnLayoutChangeListener() {
            /* class com.ss.android.lark.main.app.title.MainTitle.View$OnLayoutChangeListenerC444018 */

            public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                if (i3 - i != i7 - i5 && MainTitle.this.f112640d != null && MainTitle.this.f112640d == LabelView.LabelStatus.Normal) {
                    MainTitle mainTitle = MainTitle.this;
                    mainTitle.mo157682b(mainTitle.f112640d);
                }
            }
        };
        m176156c();
    }
}
