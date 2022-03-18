package com.ss.android.lark.mail.impl.view.dialog.action;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.DialogC0259b;
import androidx.appcompat.p017a.p018a.C0215a;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.framework.thread.CoreThreadPool;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.framework.utils.DeviceUtils;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mail.impl.C41816b;
import com.ss.android.lark.mail.impl.utils.C43752b;
import com.ss.android.lark.mail.impl.utils.C43849u;
import com.ss.android.lark.utils.DevicePerfUtils;
import com.ss.android.lark.utils.UIHelper;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ActionDialog extends DialogC0259b {

    /* renamed from: p */
    private static final DevicePerfUtils.DevicePerfLevel f111410p = DevicePerfUtils.m224113b();

    /* renamed from: A */
    private TextView f111411A;

    /* renamed from: B */
    private RecyclerView f111412B;

    /* renamed from: C */
    private ImageView f111413C;

    /* renamed from: D */
    private C43933d f111414D;

    /* renamed from: E */
    private int f111415E;

    /* renamed from: F */
    private int f111416F;

    /* renamed from: G */
    private int f111417G;

    /* renamed from: H */
    private int f111418H;

    /* renamed from: a */
    public final Context f111419a;

    /* renamed from: b */
    public C43926b f111420b;

    /* renamed from: c */
    public List<AbstractC43928c> f111421c;

    /* renamed from: d */
    public List<ActionItem> f111422d;

    /* renamed from: e */
    public View f111423e;

    /* renamed from: f */
    public View f111424f;

    /* renamed from: g */
    public ImageView f111425g;

    /* renamed from: h */
    public int f111426h;

    /* renamed from: i */
    public int f111427i;

    /* renamed from: j */
    public int f111428j;

    /* renamed from: k */
    public int f111429k;

    /* renamed from: l */
    public int f111430l;

    /* renamed from: m */
    public int f111431m;

    /* renamed from: n */
    public float f111432n;

    /* renamed from: o */
    public AbstractC43930b f111433o;

    /* renamed from: q */
    private final String f111434q;

    /* renamed from: r */
    private final float f111435r;

    /* renamed from: s */
    private final float f111436s;

    /* renamed from: t */
    private final long f111437t;

    /* renamed from: u */
    private View f111438u;

    /* renamed from: v */
    private ViewGroup f111439v;

    /* renamed from: w */
    private ViewGroup f111440w;

    /* renamed from: x */
    private TextView f111441x;

    /* renamed from: y */
    private TextView f111442y;

    /* renamed from: z */
    private TextView f111443z;

    /* renamed from: com.ss.android.lark.mail.impl.view.dialog.action.ActionDialog$b */
    public static class C43926b {

        /* renamed from: a */
        public int f111457a;

        /* renamed from: b */
        public String f111458b;

        /* renamed from: c */
        public String f111459c;

        /* renamed from: d */
        public int f111460d;

        /* renamed from: e */
        public String f111461e;

        /* renamed from: f */
        public String f111462f;

        /* renamed from: com.ss.android.lark.mail.impl.view.dialog.action.ActionDialog$b$a */
        public static class C43927a {

            /* renamed from: a */
            private final C43926b f111463a = new C43926b();

            /* renamed from: a */
            public C43926b mo156369a() {
                return this.f111463a;
            }

            /* renamed from: a */
            public C43927a mo156367a(int i) {
                this.f111463a.f111460d = i;
                return this;
            }

            /* renamed from: b */
            public C43927a mo156370b(String str) {
                this.f111463a.f111459c = str;
                return this;
            }

            /* renamed from: c */
            public C43927a mo156371c(String str) {
                this.f111463a.f111461e = str;
                return this;
            }

            /* renamed from: d */
            public C43927a mo156372d(String str) {
                this.f111463a.f111462f = str;
                return this;
            }

            /* renamed from: a */
            public C43927a mo156368a(String str) {
                this.f111463a.f111458b = str;
                return this;
            }
        }

        public C43926b() {
        }

        public C43926b(int i, String str, String str2) {
            this.f111457a = i;
            this.f111461e = str;
            this.f111462f = str2;
        }
    }

    /* renamed from: com.ss.android.lark.mail.impl.view.dialog.action.ActionDialog$c */
    public static abstract class AbstractC43928c {

        /* renamed from: a */
        public int f111464a;

        /* renamed from: b */
        public String f111465b;

        /* renamed from: a */
        public abstract void mo156373a();
    }

    public static abstract class ActionItem {
        private final String TAG;
        private DisplayType displayType;
        private Map<String, Object> extraMap;
        public int iconResID;
        public String text;
        public int tintColorId;

        public enum DisplayType {
            CIRCLE,
            SQUARE,
            TOP_CIRCLE,
            BOTTOM_CIRCLE
        }

        public void onClick(View view, ActionDialog actionDialog) {
        }

        public DisplayType getDisplayType() {
            return this.displayType;
        }

        public void setDisplayType(DisplayType displayType2) {
            this.displayType = displayType2;
        }

        public Object getExtra(String str) {
            if (this.extraMap == null || TextUtils.isEmpty(str)) {
                return null;
            }
            return this.extraMap.get(str);
        }

        public ActionItem(int i, String str) {
            this(i, str, 0);
        }

        public void putExtra(String str, Object obj) {
            if (TextUtils.isEmpty(str)) {
                Log.m165397w("ActionItem", "putExtra empty key");
                return;
            }
            if (this.extraMap == null) {
                this.extraMap = new HashMap();
            }
            this.extraMap.put(str, obj);
        }

        public void setImageResourceWithTint(Context context, ImageView imageView) {
            int i;
            if (imageView != null) {
                imageView.setImageResource(this.iconResID);
                if (context != null && (i = this.tintColorId) != 0) {
                    imageView.setImageTintList(C0215a.m652a(context, i));
                }
            }
        }

        public ActionItem(int i, String str, int i2) {
            this.TAG = "ActionItem";
            this.displayType = DisplayType.CIRCLE;
            this.iconResID = i;
            this.text = str;
            this.tintColorId = i2;
        }
    }

    /* renamed from: com.ss.android.lark.mail.impl.view.dialog.action.ActionDialog$a */
    public static class C43925a {

        /* renamed from: a */
        private final ActionDialog f111456a;

        /* renamed from: a */
        public ActionDialog mo156366a() {
            return this.f111456a;
        }

        /* renamed from: a */
        public C43925a mo156363a(C43926b bVar) {
            this.f111456a.f111420b = bVar;
            return this;
        }

        /* renamed from: a */
        public C43925a mo156364a(AbstractC43930b bVar) {
            this.f111456a.f111433o = bVar;
            return this;
        }

        public C43925a(Context context) {
            if (context != null) {
                this.f111456a = new ActionDialog(context);
                return;
            }
            throw new IllegalArgumentException("A valid Context parameter is required.");
        }

        /* renamed from: a */
        public C43925a mo156365a(List<ActionItem> list) {
            this.f111456a.f111422d = list;
            return this;
        }
    }

    /* renamed from: a */
    public AbstractC43930b mo156336a() {
        return this.f111433o;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.mail.impl.view.dialog.action.ActionDialog$2 */
    public static /* synthetic */ class C439162 {

        /* renamed from: a */
        static final /* synthetic */ int[] f111446a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                com.ss.android.lark.mail.impl.view.dialog.action.ActionDialog$ActionItem$DisplayType[] r0 = com.ss.android.lark.mail.impl.view.dialog.action.ActionDialog.ActionItem.DisplayType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ss.android.lark.mail.impl.view.dialog.action.ActionDialog.C439162.f111446a = r0
                com.ss.android.lark.mail.impl.view.dialog.action.ActionDialog$ActionItem$DisplayType r1 = com.ss.android.lark.mail.impl.view.dialog.action.ActionDialog.ActionItem.DisplayType.BOTTOM_CIRCLE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.ss.android.lark.mail.impl.view.dialog.action.ActionDialog.C439162.f111446a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.ss.android.lark.mail.impl.view.dialog.action.ActionDialog$ActionItem$DisplayType r1 = com.ss.android.lark.mail.impl.view.dialog.action.ActionDialog.ActionItem.DisplayType.TOP_CIRCLE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.ss.android.lark.mail.impl.view.dialog.action.ActionDialog.C439162.f111446a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.ss.android.lark.mail.impl.view.dialog.action.ActionDialog$ActionItem$DisplayType r1 = com.ss.android.lark.mail.impl.view.dialog.action.ActionDialog.ActionItem.DisplayType.SQUARE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = com.ss.android.lark.mail.impl.view.dialog.action.ActionDialog.C439162.f111446a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.ss.android.lark.mail.impl.view.dialog.action.ActionDialog$ActionItem$DisplayType r1 = com.ss.android.lark.mail.impl.view.dialog.action.ActionDialog.ActionItem.DisplayType.CIRCLE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.mail.impl.view.dialog.action.ActionDialog.C439162.<clinit>():void");
        }
    }

    @Override // androidx.appcompat.app.DialogC0259b
    public void dismiss() {
        DevicePerfUtils.DevicePerfLevel devicePerfLevel = f111410p;
        if (devicePerfLevel == DevicePerfUtils.DevicePerfLevel.LOW || devicePerfLevel == DevicePerfUtils.DevicePerfLevel.ULTRALOW) {
            Context context = this.f111419a;
            if ((context instanceof Activity) && C43752b.m173436b((Activity) context)) {
                super.dismiss();
                return;
            }
            return;
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(0, this.f111428j);
        ofInt.setDuration(200L);
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            /* class com.ss.android.lark.mail.impl.view.dialog.action.ActionDialog.C439249 */

            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                ActionDialog.this.f111423e.setTranslationY((float) ((Integer) valueAnimator.getAnimatedValue()).intValue());
            }
        });
        ofInt.addListener(new Animator.AnimatorListener() {
            /* class com.ss.android.lark.mail.impl.view.dialog.action.ActionDialog.AnonymousClass10 */

            public void onAnimationCancel(Animator animator) {
            }

            public void onAnimationRepeat(Animator animator) {
            }

            public void onAnimationStart(Animator animator) {
                ActionDialog.this.f111423e.setEnabled(false);
            }

            public void onAnimationEnd(Animator animator) {
                if ((ActionDialog.this.f111419a instanceof Activity) && C43752b.m173436b((Activity) ActionDialog.this.f111419a)) {
                    ActionDialog.super.dismiss();
                }
            }
        });
        ofInt.start();
    }

    public void show() {
        if (this.f111420b != null || !CollectionUtils.isEmpty(this.f111421c) || !CollectionUtils.isEmpty(this.f111422d)) {
            m174039c();
            m174040d();
            super.show();
            DevicePerfUtils.DevicePerfLevel devicePerfLevel = f111410p;
            if (devicePerfLevel != DevicePerfUtils.DevicePerfLevel.LOW && devicePerfLevel != DevicePerfUtils.DevicePerfLevel.ULTRALOW) {
                ValueAnimator ofInt = ValueAnimator.ofInt(this.f111428j, 0);
                ofInt.setDuration(200L);
                ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    /* class com.ss.android.lark.mail.impl.view.dialog.action.ActionDialog.C439227 */

                    public void onAnimationUpdate(ValueAnimator valueAnimator) {
                        ActionDialog.this.f111423e.setTranslationY((float) ((Integer) valueAnimator.getAnimatedValue()).intValue());
                    }
                });
                ofInt.addListener(new Animator.AnimatorListener() {
                    /* class com.ss.android.lark.mail.impl.view.dialog.action.ActionDialog.C439238 */

                    public void onAnimationCancel(Animator animator) {
                    }

                    public void onAnimationRepeat(Animator animator) {
                    }

                    public void onAnimationEnd(Animator animator) {
                        ActionDialog.this.f111423e.setEnabled(true);
                    }

                    public void onAnimationStart(Animator animator) {
                        ActionDialog.this.f111423e.setEnabled(false);
                    }
                });
                ofInt.start();
                return;
            }
            return;
        }
        Log.m165383e("ActionDialog", "insufficient showing content");
    }

    /* renamed from: c */
    private void m174039c() {
        if (this.f111420b == null) {
            this.f111439v.setVisibility(8);
        } else {
            this.f111439v.setVisibility(0);
            if (!TextUtils.isEmpty(this.f111420b.f111459c)) {
                this.f111425g.setVisibility(4);
                this.f111441x.setVisibility(0);
                this.f111441x.setText(this.f111420b.f111459c);
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setColor(this.f111420b.f111460d);
                gradientDrawable.setCornerRadius((float) UIUtils.dp2px(this.f111419a, 20.0f));
                this.f111441x.setBackground(gradientDrawable);
            } else if (this.f111420b.f111458b != null) {
                this.f111425g.setVisibility(0);
                this.f111441x.setVisibility(4);
                CoreThreadPool.getBackgroundHandler().post(new Runnable() {
                    /* class com.ss.android.lark.mail.impl.view.dialog.action.ActionDialog.RunnableC439195 */

                    public void run() {
                        final String p = C41816b.m166115a().mo150115E().mo150184a(ActionDialog.this.f111420b.f111458b).mo151195p();
                        C43849u.m173826a(new Runnable() {
                            /* class com.ss.android.lark.mail.impl.view.dialog.action.ActionDialog.RunnableC439195.RunnableC439201 */

                            public void run() {
                                C41816b.m166115a().mo150155v().mo150206a(ActionDialog.this.f111419a, p, ActionDialog.this.f111420b.f111458b, ActionDialog.this.f111425g, 40, 40);
                            }
                        });
                    }
                });
            } else {
                LayerDrawable layerDrawable = (LayerDrawable) UIHelper.getDrawable(R.drawable.mail_action_dialog_icon);
                layerDrawable.findDrawableByLayerId(R.id.mail_action_dialog_inner_icon).setTint(UIHelper.getColor(R.color.static_white));
                this.f111425g.setImageDrawable(layerDrawable);
            }
            if (TextUtils.isEmpty(this.f111420b.f111461e)) {
                this.f111442y.setVisibility(8);
                this.f111442y.setText("");
            } else {
                this.f111442y.setVisibility(0);
                this.f111442y.setText(this.f111420b.f111461e);
            }
            if (TextUtils.isEmpty(this.f111420b.f111462f)) {
                this.f111443z.setVisibility(8);
                this.f111443z.setText("");
            } else {
                this.f111443z.setVisibility(0);
                this.f111443z.setText(this.f111420b.f111462f);
            }
        }
        if (!CollectionUtils.isEmpty(this.f111422d) || !CollectionUtils.isEmpty(this.f111421c)) {
            this.f111412B.setVisibility(0);
            this.f111414D.mo156376a(this.f111421c, this.f111422d);
            return;
        }
        this.f111412B.setVisibility(8);
    }

    /* renamed from: d */
    private void m174040d() {
        Resources resources = this.f111419a.getResources();
        this.f111430l = 0;
        if (this.f111420b != null) {
            this.f111430l = resources.getDimensionPixelSize(R.dimen.mail_action_dialog_info_container_height) + 0;
        }
        if (CollectionUtils.isNotEmpty(this.f111421c)) {
            this.f111430l += this.f111415E;
        }
        if (CollectionUtils.isNotEmpty(this.f111422d)) {
            for (ActionItem actionItem : this.f111422d) {
                this.f111430l += m174035a(actionItem);
            }
            this.f111430l += UIHelper.getDimens(R.dimen.mail_action_dialog_recyclerview_vertical_padding) * 2;
        }
        int i = this.f111430l;
        if (i > this.f111429k) {
            this.f111430l = i + resources.getDimensionPixelSize(R.dimen.mail_action_dialog_drag_bar_height);
            this.f111440w.setVisibility(0);
            this.f111438u.setVisibility(8);
        } else {
            this.f111430l = i + resources.getDimensionPixelSize(R.dimen.mail_action_dialog_top_space_bar_height);
            this.f111440w.setVisibility(8);
            this.f111438u.setVisibility(0);
        }
        mo156337a(Math.min(this.f111430l, this.f111429k));
    }

    /* renamed from: b */
    private void m174037b() {
        this.f111428j = DeviceUtils.getScreenHeight(this.f111419a) - DeviceUtils.getStatusHeight(this.f111419a);
        float screenHeight = (float) DeviceUtils.getScreenHeight(this.f111419a);
        this.f111431m = (int) (0.84000003f * screenHeight);
        this.f111429k = (int) (screenHeight * 0.75f);
        setCanceledOnTouchOutside(true);
        setCancelable(true);
        Window window = getWindow();
        if (window != null) {
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.gravity = 81;
            window.setAttributes(attributes);
            window.setBackgroundDrawableResource(R.color.bg_mask);
            window.clearFlags(201326592);
            window.addFlags(Integer.MIN_VALUE);
            window.setStatusBarColor(0);
        }
        this.f111423e = LayoutInflater.from(getContext()).inflate(R.layout.mail_action_dialog_layout, (ViewGroup) null);
        setContentView(this.f111423e, new ViewGroup.LayoutParams(-1, -1));
        View findViewById = this.f111423e.findViewById(R.id.action_dialog_space_holder);
        this.f111424f = findViewById;
        findViewById.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.mail.impl.view.dialog.action.ActionDialog.View$OnClickListenerC439151 */

            public void onClick(View view) {
                ActionDialog.this.dismiss();
            }
        });
        ViewGroup viewGroup = (ViewGroup) this.f111423e.findViewById(R.id.action_dialog_drag_bar);
        this.f111440w = viewGroup;
        viewGroup.setOnTouchListener(new View.OnTouchListener() {
            /* class com.ss.android.lark.mail.impl.view.dialog.action.ActionDialog.View$OnTouchListenerC439173 */

            public boolean onTouch(View view, MotionEvent motionEvent) {
                int action = motionEvent.getAction();
                if (action == 0) {
                    ActionDialog.this.f111432n = motionEvent.getRawY();
                    ActionDialog actionDialog = ActionDialog.this;
                    actionDialog.f111427i = actionDialog.f111428j - ActionDialog.this.f111424f.getLayoutParams().height;
                } else if (action == 1) {
                    ActionDialog.this.mo156338a(motionEvent);
                    if (ActionDialog.this.f111426h >= ActionDialog.this.f111431m) {
                        ActionDialog actionDialog2 = ActionDialog.this;
                        actionDialog2.mo156339b(actionDialog2.f111431m);
                    } else if (ActionDialog.this.f111426h >= ActionDialog.this.f111429k) {
                        if (ActionDialog.this.f111426h > ActionDialog.this.f111427i) {
                            ActionDialog actionDialog3 = ActionDialog.this;
                            actionDialog3.mo156339b(Math.min(actionDialog3.f111431m, ActionDialog.this.f111430l));
                        } else if (ActionDialog.this.f111426h == ActionDialog.this.f111427i) {
                            ActionDialog actionDialog4 = ActionDialog.this;
                            actionDialog4.mo156339b(actionDialog4.f111427i);
                        } else {
                            ActionDialog actionDialog5 = ActionDialog.this;
                            actionDialog5.mo156339b(actionDialog5.f111429k);
                        }
                    } else if (ActionDialog.this.f111426h < ActionDialog.this.f111430l) {
                        ActionDialog.this.dismiss();
                    } else {
                        ActionDialog actionDialog6 = ActionDialog.this;
                        actionDialog6.mo156339b(actionDialog6.f111430l);
                    }
                } else if (action == 2) {
                    ActionDialog.this.mo156338a(motionEvent);
                }
                return true;
            }
        });
        this.f111438u = this.f111423e.findViewById(R.id.action_dialog_top_space_bar);
        this.f111439v = (ViewGroup) this.f111423e.findViewById(R.id.action_dialog_info_container);
        this.f111425g = (ImageView) this.f111423e.findViewById(R.id.action_dialog_info_icon);
        this.f111441x = (TextView) this.f111423e.findViewById(R.id.action_dialog_info_text);
        this.f111442y = (TextView) this.f111423e.findViewById(R.id.action_dialog_info_title);
        this.f111443z = (TextView) this.f111423e.findViewById(R.id.action_dialog_info_description);
        ImageView imageView = (ImageView) this.f111423e.findViewById(R.id.action_dialog_close_button);
        this.f111413C = imageView;
        imageView.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.mail.impl.view.dialog.action.ActionDialog.View$OnClickListenerC439184 */

            public void onClick(View view) {
                ActionDialog.this.dismiss();
            }
        });
        RecyclerView recyclerView = (RecyclerView) this.f111423e.findViewById(R.id.action_dialog_action_list);
        this.f111412B = recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager(this.f111419a));
        C43933d dVar = new C43933d(this.f111419a, this);
        this.f111414D = dVar;
        this.f111412B.setAdapter(dVar);
        Resources resources = this.f111419a.getResources();
        int dimensionPixelSize = this.f111415E + resources.getDimensionPixelSize(R.dimen.mail_action_dialog_quick_access_list_height);
        this.f111415E = dimensionPixelSize;
        int dimensionPixelSize2 = dimensionPixelSize + resources.getDimensionPixelSize(R.dimen.mail_action_dialog_quick_access_list_boarder_line_height);
        this.f111415E = dimensionPixelSize2;
        this.f111415E = dimensionPixelSize2 + resources.getDimensionPixelSize(R.dimen.mail_action_dialog_quick_access_list_bottom_space_height);
        if (window != null) {
            window.setLayout(-1, -1);
        }
    }

    private ActionDialog(Context context) {
        super(context, R.style.ActionDialog);
        this.f111434q = "ActionDialog";
        this.f111435r = 0.75f;
        this.f111436s = 0.16f;
        this.f111437t = 200;
        this.f111419a = context;
        m174037b();
    }

    /* renamed from: a */
    public void mo156337a(int i) {
        this.f111426h = i;
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f111424f.getLayoutParams();
        layoutParams.height = this.f111428j - this.f111426h;
        this.f111424f.setLayoutParams(layoutParams);
    }

    /* renamed from: a */
    public void mo156338a(MotionEvent motionEvent) {
        int rawY = this.f111427i + ((int) (this.f111432n - motionEvent.getRawY()));
        int i = this.f111430l;
        if (rawY <= i) {
            mo156337a(Math.min(rawY, this.f111431m));
        } else {
            mo156337a(Math.min(i, this.f111431m));
        }
    }

    /* renamed from: b */
    public void mo156339b(int i) {
        int i2 = this.f111426h;
        if (i2 != i) {
            ValueAnimator ofInt = ValueAnimator.ofInt(i2, i);
            ofInt.setDuration(200L);
            ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                /* class com.ss.android.lark.mail.impl.view.dialog.action.ActionDialog.C439216 */

                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    ActionDialog.this.mo156337a(((Integer) valueAnimator.getAnimatedValue()).intValue());
                }
            });
            ofInt.start();
        }
    }

    /* renamed from: a */
    private int m174035a(ActionItem actionItem) {
        int i;
        if (this.f111411A == null) {
            Resources resources = this.f111419a.getResources();
            int dimensionPixelSize = this.f111416F + resources.getDimensionPixelSize(R.dimen.mail_action_dialog_action_item_icon_size);
            this.f111416F = dimensionPixelSize;
            this.f111416F = dimensionPixelSize + (resources.getDimensionPixelSize(R.dimen.mail_action_dialog_action_item_horizontal_space) * 2);
            int screenWidth = ((DeviceUtils.getScreenWidth(this.f111419a) - resources.getDimensionPixelSize(R.dimen.mail_action_dialog_action_item_icon_size)) - (UIHelper.getDimens(R.dimen.mail_action_dialog_action_item_vertical_space) + UIHelper.getDimens(R.dimen.mail_action_dialog_action_item_icon_left_margin))) - resources.getDimensionPixelSize(R.dimen.mail_action_dialog_action_item_right_margin);
            this.f111411A = (TextView) LayoutInflater.from(this.f111419a).inflate(R.layout.mail_action_dialog_action_item, (ViewGroup) null).findViewById(R.id.action_item_text);
            this.f111417G = View.MeasureSpec.makeMeasureSpec(screenWidth, 1073741824);
            this.f111418H = View.MeasureSpec.makeMeasureSpec(0, 0);
        }
        if (actionItem == null || TextUtils.isEmpty(actionItem.text)) {
            return this.f111416F;
        }
        this.f111411A.setText(actionItem.text);
        this.f111411A.measure(this.f111417G, this.f111418H);
        int measuredHeight = this.f111411A.getMeasuredHeight() + (this.f111419a.getResources().getDimensionPixelSize(R.dimen.mail_action_dialog_action_item_horizontal_space) * 2);
        int i2 = C439162.f111446a[actionItem.getDisplayType().ordinal()];
        if (i2 == 1 || i2 == 2) {
            i = UIHelper.getDimens(R.dimen.mail_action_dialog_action_item_vertical_margin);
        } else {
            if (i2 != 3) {
                i = UIHelper.getDimens(R.dimen.mail_action_dialog_action_item_vertical_margin) * 2;
            }
            return Math.max(measuredHeight, this.f111416F);
        }
        measuredHeight += i;
        return Math.max(measuredHeight, this.f111416F);
    }
}
