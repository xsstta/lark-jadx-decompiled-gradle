package com.ss.android.lark.main.app.title;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.graphics.C0768a;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.component.dynamicresources.DynamicResourcesFacade;
import com.larksuite.component.universe_design.color.UDColorUtils;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.main.C44134a;
import com.ss.android.lark.main.app.title.LabelView;
import com.ss.android.lark.main.app.title.MainTitle;
import com.ss.android.lark.main.p2231a.AbstractC44136a;
import com.ss.android.lark.maincore.AbstractC44545b;
import com.ss.android.lark.maincore.AbstractC44549f;
import com.ss.android.lark.maincore.AbstractC44550g;
import com.ss.android.lark.maincore.IFunctionButtonV2;
import com.ss.android.lark.maincore.ITitleController;
import com.ss.android.lark.maincore.ITitleInfo;
import com.ss.android.lark.maincore.ITitleInfoWithCustomStatus;
import com.ss.android.lark.mm.module.participant.ParticipantRepo;
import com.ss.android.lark.passport.signinsdk_api.account.TenantInfo;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.ui.p2892a.C57582a;
import com.ss.android.lark.util.share_preference.C57744a;
import com.ss.android.lark.utils.C57820d;
import com.ss.android.lark.utils.UIHelper;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.lark.main.app.title.a */
public class C44404a implements AbstractC44549f {

    /* renamed from: a */
    public Animator f112668a;

    /* renamed from: b */
    public final MainTitle f112669b;

    /* renamed from: c */
    public C44411c f112670c;

    /* renamed from: d */
    public AbstractC44409a f112671d;

    /* renamed from: e */
    private String f112672e;

    /* renamed from: f */
    private Context f112673f;

    /* renamed from: g */
    private View f112674g;

    /* renamed from: h */
    private boolean f112675h;

    /* renamed from: i */
    private C44410b f112676i;

    /* renamed from: j */
    private boolean f112677j;

    /* renamed from: k */
    private boolean f112678k;

    /* renamed from: l */
    private int f112679l;

    /* renamed from: m */
    private int f112680m;

    /* renamed from: n */
    private String f112681n;

    /* renamed from: o */
    private boolean f112682o;

    /* renamed from: com.ss.android.lark.main.app.title.a$a */
    public interface AbstractC44409a {
        /* renamed from: a */
        void mo157393a();

        /* renamed from: a */
        void mo157394a(View view);

        /* renamed from: b */
        boolean mo157395b();

        /* renamed from: c */
        void mo157396c();

        /* renamed from: d */
        void mo157397d();
    }

    /* renamed from: h */
    public void mo157719h() {
    }

    /* renamed from: com.ss.android.lark.main.app.title.a$c */
    public static class C44411c {

        /* renamed from: a */
        public boolean f112690a;

        /* renamed from: b */
        private boolean f112691b;

        /* renamed from: c */
        private ITitleInfo.AbstractC44542a f112692c;

        /* renamed from: d */
        private AbstractC44550g.AbstractC44551a f112693d;

        /* renamed from: e */
        private ITitleInfo.Status f112694e;

        /* renamed from: f */
        private ITitleInfo.IconStyle f112695f;

        /* renamed from: g */
        private String f112696g;

        /* renamed from: h */
        private ITitleInfo.C44543b f112697h;

        /* renamed from: i */
        private List<AbstractC44545b> f112698i;

        /* renamed from: a */
        public boolean mo157741a() {
            return this.f112691b;
        }

        /* renamed from: b */
        public ITitleInfo.AbstractC44542a mo157742b() {
            return this.f112692c;
        }

        /* renamed from: c */
        public ITitleInfo.Status mo157743c() {
            return this.f112694e;
        }

        /* renamed from: d */
        public ITitleInfo.IconStyle mo157744d() {
            return this.f112695f;
        }

        /* renamed from: e */
        public String mo157745e() {
            return this.f112696g;
        }

        /* renamed from: f */
        public List<AbstractC44545b> mo157746f() {
            return this.f112698i;
        }

        /* renamed from: g */
        public ITitleInfo.C44543b mo157747g() {
            return this.f112697h;
        }

        /* renamed from: h */
        public AbstractC44550g.AbstractC44551a mo157748h() {
            return this.f112693d;
        }

        public C44411c(ITitleInfo iTitleInfo) {
            AbstractC44550g.AbstractC44551a aVar;
            this.f112691b = iTitleInfo.mo33255a();
            this.f112690a = iTitleInfo instanceof ITitleInfoWithCustomStatus;
            this.f112692c = iTitleInfo.mo33260f();
            if (CollectionUtils.isEmpty(iTitleInfo.mo33258d())) {
                this.f112698i = new ArrayList();
            } else {
                this.f112698i = new ArrayList(iTitleInfo.mo33258d());
            }
            this.f112696g = iTitleInfo.mo33256b();
            this.f112695f = iTitleInfo.mo33257c();
            this.f112694e = iTitleInfo.mo33259e();
            this.f112697h = iTitleInfo.mo33261g();
            if (iTitleInfo instanceof AbstractC44550g) {
                aVar = ((AbstractC44550g) iTitleInfo).mo158099h();
            } else {
                aVar = null;
            }
            this.f112693d = aVar;
        }
    }

    @Override // com.ss.android.lark.maincore.AbstractC44549f
    /* renamed from: e */
    public View mo99197e() {
        return this.f112669b;
    }

    /* renamed from: f */
    public String mo157717f() {
        return this.f112672e;
    }

    /* renamed from: i */
    public void mo157720i() {
        m176191w();
    }

    @Override // com.ss.android.lark.maincore.ITitleController
    /* renamed from: a */
    public void mo99192a(boolean z) {
        m176189a(true, z);
    }

    @Override // com.ss.android.lark.maincore.ITitleController
    /* renamed from: a */
    public void mo99191a(ITitleInfo iTitleInfo) {
        if (iTitleInfo == null) {
            m176189a(false, false);
            this.f112670c = null;
            return;
        }
        m176187a(new C44411c(iTitleInfo), true);
    }

    /* renamed from: a */
    public void mo157708a(Context context) {
        this.f112673f = context;
        this.f112669b.setOnTitleClickListener(new MainTitle.AbstractC44403a() {
            /* class com.ss.android.lark.main.app.title.C44404a.C444051 */

            @Override // com.ss.android.lark.main.app.title.MainTitle.AbstractC44403a
            /* renamed from: f */
            public void mo157706f() {
                if (C44404a.this.f112671d != null) {
                    C44404a.this.f112671d.mo157396c();
                }
            }

            @Override // com.ss.android.lark.main.app.title.MainTitle.AbstractC44403a
            /* renamed from: b */
            public void mo157702b() {
                if (C44404a.this.f112670c != null && C44404a.this.f112670c.mo157742b() != null) {
                    C44404a.this.f112670c.mo157742b().mo99210a();
                }
            }

            @Override // com.ss.android.lark.main.app.title.MainTitle.AbstractC44403a
            /* renamed from: c */
            public void mo157703c() {
                if (C44404a.this.f112670c != null && C44404a.this.f112670c.mo157748h() != null) {
                    C44404a.this.f112670c.mo157748h().mo158100a();
                }
            }

            @Override // com.ss.android.lark.main.app.title.MainTitle.AbstractC44403a
            /* renamed from: d */
            public void mo157704d() {
                if (C44404a.this.f112670c != null && C44404a.this.f112670c.mo157748h() != null) {
                    C44404a.this.f112670c.mo157748h().mo158101b();
                }
            }

            @Override // com.ss.android.lark.main.app.title.MainTitle.AbstractC44403a
            /* renamed from: e */
            public String mo157705e() {
                TenantInfo l = C44134a.m174959a().mo133188H().mo133422l();
                if (l == null) {
                    return "";
                }
                return l.getTenantName();
            }

            @Override // com.ss.android.lark.main.app.title.MainTitle.AbstractC44403a
            /* renamed from: a */
            public void mo157700a() {
                boolean z;
                if (C44404a.this.f112670c == null || C44404a.this.f112670c.mo157744d() != ITitleInfo.IconStyle.Up) {
                    z = false;
                } else {
                    z = true;
                }
                Log.m165389i("TitleController", "onClick: TenantDrawer, feedMenuShowing:" + z);
                if (!z) {
                    if (C44404a.this.f112671d != null) {
                        C44404a.this.f112671d.mo157393a();
                    }
                    if (C44404a.this.mo157730s()) {
                        C44134a.m174959a().mo133200T().mo133286c();
                    }
                }
            }

            @Override // com.ss.android.lark.main.app.title.MainTitle.AbstractC44403a
            /* renamed from: a */
            public void mo157701a(View view) {
                if (C44404a.this.f112671d != null) {
                    C44404a.this.f112671d.mo157394a(view);
                }
            }
        });
        m176191w();
        this.f112669b.mo157671a();
    }

    /* renamed from: a */
    public void mo157711a(String str, ITitleInfo iTitleInfo) {
        this.f112672e = str;
        this.f112677j = this.f112671d.mo157395b();
        StringBuilder sb = new StringBuilder();
        sb.append("switchPage:");
        sb.append(this.f112677j);
        sb.append(" titleInfo isNull=");
        sb.append(iTitleInfo == null);
        Log.m165389i("TitleController", sb.toString());
        if (iTitleInfo == null) {
            m176189a(false, false);
            this.f112670c = null;
            return;
        }
        m176187a(new C44411c(iTitleInfo), false);
    }

    /* renamed from: a */
    public void mo157710a(C44410b bVar) {
        if (bVar == null) {
            Log.m165383e("TitleController", "show title fail: tenant data is null");
            return;
        }
        Log.m165389i("TitleController", "show title avatar: " + bVar.f112688b);
        C44410b bVar2 = this.f112676i;
        if (bVar2 == null || !TextUtils.equals(bVar2.f112688b, bVar.f112688b)) {
            this.f112669b.mo157678a(bVar.f112688b, bVar.f112687a);
        }
        String str = !this.f112677j ? "" : bVar.f112689c;
        if (!TextUtils.equals(this.f112681n, str)) {
            this.f112681n = str;
            this.f112669b.mo157677a(str);
        }
        this.f112676i = bVar;
    }

    /* renamed from: a */
    public void mo157707a(long j) {
        mo157715d(j > 0);
    }

    @Override // com.ss.android.lark.maincore.AbstractC44549f
    /* renamed from: a */
    public void mo99190a(View view) {
        this.f112669b.mo157673a(view);
    }

    /* renamed from: a */
    public void mo157712a(String str, String str2) {
        this.f112669b.mo157683b(str, str2);
    }

    /* renamed from: v */
    private void m176190v() {
        this.f112671d.mo157397d();
    }

    @Override // com.ss.android.lark.maincore.AbstractC44549f
    /* renamed from: d */
    public View mo99196d() {
        return this.f112669b.getMenuEntranceTextView();
    }

    /* renamed from: g */
    public View mo157718g() {
        return this.f112669b.getMenuEntranceView();
    }

    @Override // com.ss.android.lark.maincore.ITitleController
    /* renamed from: b */
    public ITitleController.Style mo99193b() {
        if (DesktopUtil.m144307b()) {
            return ITitleController.Style.Old;
        }
        return ITitleController.Style.New;
    }

    /* renamed from: k */
    public void mo157722k() {
        if (this.f112682o) {
            mo157727p();
        } else {
            mo157728q();
        }
    }

    /* renamed from: l */
    public void mo157723l() {
        int i = this.f112679l | 4;
        this.f112679l = i;
        m176181a(i);
    }

    /* renamed from: m */
    public void mo157724m() {
        int i = this.f112679l & -5;
        this.f112679l = i;
        m176181a(i);
    }

    /* renamed from: o */
    public void mo157726o() {
        int i = this.f112679l & -17;
        this.f112679l = i;
        m176181a(i);
    }

    /* renamed from: p */
    public void mo157727p() {
        int i = this.f112679l | 2;
        this.f112679l = i;
        m176181a(i);
    }

    /* renamed from: q */
    public void mo157728q() {
        int i = this.f112679l & -3;
        this.f112679l = i;
        m176181a(i);
    }

    /* renamed from: r */
    public void mo157729r() {
        int i = this.f112679l | 1;
        this.f112679l = i;
        m176181a(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.main.app.title.a$4 */
    public static /* synthetic */ class C444084 {

        /* renamed from: a */
        static final /* synthetic */ int[] f112686a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.ss.android.lark.maincore.ITitleInfo$Status[] r0 = com.ss.android.lark.maincore.ITitleInfo.Status.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ss.android.lark.main.app.title.C44404a.C444084.f112686a = r0
                com.ss.android.lark.maincore.ITitleInfo$Status r1 = com.ss.android.lark.maincore.ITitleInfo.Status.Normal     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.ss.android.lark.main.app.title.C44404a.C444084.f112686a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.ss.android.lark.maincore.ITitleInfo$Status r1 = com.ss.android.lark.maincore.ITitleInfo.Status.Loading     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.main.app.title.C44404a.C444084.<clinit>():void");
        }
    }

    @Override // com.ss.android.lark.maincore.ITitleController
    /* renamed from: c */
    public Bitmap mo99195c() {
        this.f112669b.invalidate();
        Bitmap a = C57820d.m224432a(this.f112669b);
        if (a != null) {
            return C57820d.m224429a(a, (int) ParticipantRepo.f117150c);
        }
        Log.m165383e("TitleController", "getTitleLayoutBitmap failed: bitmap is null");
        return null;
    }

    /* renamed from: n */
    public void mo157725n() {
        if (!C44134a.m174959a().mo133270z().mo133361a("lark.core.status.5.0")) {
            int i = this.f112679l | 16;
            this.f112679l = i;
            m176181a(i);
        }
    }

    /* renamed from: s */
    public boolean mo157730s() {
        int i = this.f112679l;
        if ((i & 1) != 1) {
            return false;
        }
        int i2 = i & -2;
        this.f112679l = i2;
        m176181a(i2);
        return true;
    }

    /* renamed from: t */
    public void mo157731t() {
        ITitleInfo.Status status;
        this.f112678k = true;
        C44411c cVar = this.f112670c;
        if (cVar == null) {
            status = ITitleInfo.Status.Normal;
        } else {
            status = cVar.mo157743c();
        }
        m176188a(status);
    }

    /* renamed from: u */
    public void mo157732u() {
        ITitleInfo.Status status;
        this.f112678k = false;
        C44411c cVar = this.f112670c;
        if (cVar == null) {
            status = ITitleInfo.Status.Normal;
        } else {
            status = cVar.mo157743c();
        }
        m176188a(status);
    }

    /* renamed from: w */
    private void m176191w() {
        boolean z;
        boolean z2;
        AbstractC44136a.AbstractC44153i z3 = C44134a.m174959a().mo133270z();
        boolean z4 = true;
        if (z3.mo133361a("activity.award.enable") || z3.mo133361a("invite.member.award.enable")) {
            z = true;
        } else {
            z = false;
        }
        if (z || z3.mo133361a("invite.external.award.enable")) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (C57744a.m224104a().getBoolean("key_param_activity_avatar_hide", false) || !z2) {
            z4 = false;
        }
        this.f112682o = z4;
    }

    /* renamed from: j */
    public void mo157721j() {
        if (DynamicResourcesFacade.m88635b((int) R.color.suite_skin_vi_content_color)) {
            ((TextView) mo99196d()).setTextColor(C57582a.m223616d(this.f112673f, R.color.suite_skin_vi_content_color));
            ((TextView) this.f112669b.findViewById(R.id.tenant_desc)).setTextColor(C57582a.m223616d(this.f112673f, R.color.suite_skin_vi_content_color));
            this.f112669b.setTintedArrowView(C57582a.m223616d(this.f112673f, R.color.suite_skin_vi_content_color));
            Log.m165389i("TitleController", "the vi skin of MainTitle arrow and text has worked");
        } else {
            ((TextView) mo99196d()).setTextColor(UDColorUtils.getColor(this.f112673f, R.color.text_title));
            ((TextView) this.f112669b.findViewById(R.id.tenant_desc)).setTextColor(UDColorUtils.getColor(this.f112673f, R.color.text_placeholder));
            this.f112669b.setTintedArrowView(C57582a.m223616d(this.f112673f, R.color.text_title));
        }
        if (DynamicResourcesFacade.m88635b((int) R.color.suite_skin_vi_color)) {
            this.f112669b.setBackgroundColor(C57582a.m223616d(this.f112673f, R.color.suite_skin_vi_color));
            Log.m165389i("TitleController", "the vi skin of MainTitle background has worked");
            Context context = this.f112673f;
            if (context instanceof Activity) {
                int d = C57582a.m223616d(context, R.color.suite_skin_vi_color);
                View view = this.f112674g;
                if (view != null) {
                    view.setBackgroundColor(d);
                    this.f112674g.setVisibility(0);
                    Log.m165389i("TitleController", "the vi skin of statusBar background has worked");
                }
                m176182a(this.f112673f, d);
                Log.m165389i("TitleController", "the vi skin of statusBar text has worked");
                return;
            }
            return;
        }
        this.f112669b.setBackgroundColor(UDColorUtils.getColor(this.f112673f, R.color.bg_body));
        Context context2 = this.f112673f;
        if (context2 instanceof Activity) {
            View view2 = this.f112674g;
            if (view2 != null) {
                view2.setBackgroundColor(C57582a.m223616d(context2, R.color.bg_body));
                this.f112674g.setVisibility(0);
            }
            Context context3 = this.f112673f;
            m176182a(context3, C57582a.m223616d(context3, R.color.bg_body));
        }
    }

    @Override // com.ss.android.lark.maincore.ITitleController
    /* renamed from: a */
    public int mo99189a() {
        MainTitle mainTitle = this.f112669b;
        if (mainTitle == null || mainTitle.getHeight() <= 0) {
            return UIHelper.dp2px(60.0f);
        }
        return this.f112669b.getHeight();
    }

    /* renamed from: a */
    public void mo157709a(AbstractC44409a aVar) {
        this.f112671d = aVar;
    }

    public C44404a(MainTitle mainTitle) {
        this.f112669b = mainTitle;
    }

    @Override // com.ss.android.lark.maincore.ITitleController
    /* renamed from: b */
    public void mo99194b(boolean z) {
        m176189a(false, z);
    }

    /* renamed from: c */
    public void mo157714c(boolean z) {
        this.f112669b.mo157680a(z);
    }

    /* renamed from: e */
    public void mo157716e(boolean z) {
        this.f112669b.setCustomStatusEnabled(z);
    }

    /* renamed from: a */
    private void m176181a(int i) {
        if (this.f112680m != i) {
            this.f112680m = i;
            this.f112669b.mo157672a(i);
        }
    }

    /* renamed from: b */
    public void mo157713b(View view) {
        this.f112674g = view;
        CoordinatorLayout.LayoutParams layoutParams = (CoordinatorLayout.LayoutParams) view.getLayoutParams();
        layoutParams.height = CommonTitleBar.getStatusBarHeight();
        this.f112674g.setLayoutParams(layoutParams);
    }

    /* renamed from: d */
    public void mo157715d(boolean z) {
        if (z) {
            this.f112679l |= 8;
        } else {
            this.f112679l &= -9;
        }
        m176181a(this.f112679l);
    }

    /* renamed from: a */
    private void m176188a(ITitleInfo.Status status) {
        LabelView.LabelStatus labelStatus = LabelView.LabelStatus.Normal;
        if (!this.f112677j || !this.f112678k) {
            int i = C444084.f112686a[status.ordinal()];
            if (i == 1) {
                labelStatus = LabelView.LabelStatus.Normal;
            } else if (i == 2) {
                labelStatus = LabelView.LabelStatus.Loading;
            }
        } else {
            labelStatus = LabelView.LabelStatus.Error;
        }
        this.f112669b.mo157674a(labelStatus);
    }

    /* renamed from: a */
    private void m176186a(TextView textView, int i) {
        if (i != 0) {
            textView.setTextColor(i);
        }
    }

    /* renamed from: a */
    private void m176182a(Context context, int i) {
        boolean z;
        double b = C0768a.m3714b(-1, i);
        Window window = ((Activity) context).getWindow();
        if (b <= 3.0d) {
            z = true;
        } else {
            z = false;
        }
        m176184a(window, z);
    }

    /* renamed from: a */
    private void m176183a(View view, int i) {
        if (view instanceof ImageView) {
            m176185a((ImageView) view, i);
        } else if (view instanceof TextView) {
            m176186a((TextView) view, i);
        } else if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                m176183a(viewGroup.getChildAt(i2), i);
            }
        }
    }

    /* renamed from: a */
    private void m176184a(Window window, boolean z) {
        int i;
        if (Build.VERSION.SDK_INT >= 23) {
            int systemUiVisibility = window.getDecorView().getSystemUiVisibility();
            View decorView = window.getDecorView();
            if (z) {
                i = systemUiVisibility | 8192;
            } else {
                i = systemUiVisibility & -8193;
            }
            decorView.setSystemUiVisibility(i);
        }
    }

    /* renamed from: a */
    private void m176185a(ImageView imageView, int i) {
        Drawable drawable = imageView.getDrawable();
        drawable.mutate();
        if (i == 0) {
            drawable.setTintList(null);
        } else {
            drawable.setTintList(new ColorStateList(new int[][]{new int[]{16842910}}, new int[]{UIUtils.getColor(this.f112673f, i)}));
            drawable.setTint(UIUtils.getColor(this.f112673f, i));
        }
        imageView.setImageDrawable(drawable);
    }

    /* renamed from: a */
    private void m176187a(C44411c cVar, boolean z) {
        m176189a(cVar.mo157741a(), z);
        C44411c cVar2 = this.f112670c;
        if (cVar2 == null || !TextUtils.equals(cVar2.mo157745e(), cVar.mo157745e())) {
            this.f112669b.setName(cVar.mo157745e());
            mo157721j();
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (AbstractC44545b bVar : cVar.mo157746f()) {
            View contentView = bVar.getContentView();
            if (DynamicResourcesFacade.m88635b((int) R.color.suite_skin_vi_content_color)) {
                m176183a(contentView, R.color.suite_skin_vi_content_color);
                Log.m165389i("TitleController", "the vi skin of MainTab icon has worked");
            } else {
                m176183a(contentView, R.color.icon_n1);
            }
            arrayList.add(contentView);
            if (bVar instanceof IFunctionButtonV2) {
                arrayList2.add(((IFunctionButtonV2) bVar).mo33238a());
            } else {
                arrayList2.add(null);
            }
        }
        this.f112669b.mo157679a(arrayList, arrayList2);
        C44411c cVar3 = this.f112670c;
        if (cVar3 == null || cVar3.mo157744d() != cVar.mo157744d()) {
            this.f112669b.mo157675a(cVar.mo157744d());
        }
        mo157722k();
        m176181a(this.f112679l);
        mo157716e(cVar.f112690a);
        m176190v();
        mo157710a(this.f112676i);
        this.f112669b.mo157676a(cVar.mo157747g());
        m176188a(cVar.mo157743c());
        this.f112670c = cVar;
    }

    /* renamed from: a */
    private void m176189a(boolean z, boolean z2) {
        float f;
        int i;
        if (z != this.f112675h) {
            Log.m165389i("TitleController", "showTitleBarImpl visible=" + z + " , withAnim=" + z2);
            this.f112675h = z;
            Animator animator = this.f112668a;
            if (animator != null) {
                animator.cancel();
            }
            if (!z2) {
                MainTitle mainTitle = this.f112669b;
                if (z) {
                    f = 1.0f;
                } else {
                    f = BitmapDescriptorFactory.HUE_RED;
                }
                mainTitle.setAlpha(f);
                MainTitle mainTitle2 = this.f112669b;
                if (z) {
                    i = 0;
                } else {
                    i = 8;
                }
                mainTitle2.setVisibility(i);
            } else if (z) {
                ObjectAnimator duration = ObjectAnimator.ofFloat(this.f112669b, "alpha", BitmapDescriptorFactory.HUE_RED, 1.0f).setDuration(200L);
                this.f112668a = duration;
                duration.addListener(new Animator.AnimatorListener() {
                    /* class com.ss.android.lark.main.app.title.C44404a.C444062 */

                    public void onAnimationRepeat(Animator animator) {
                    }

                    public void onAnimationCancel(Animator animator) {
                        C44404a.this.f112668a = null;
                    }

                    public void onAnimationEnd(Animator animator) {
                        C44404a.this.f112668a = null;
                    }

                    public void onAnimationStart(Animator animator) {
                        C44404a.this.f112669b.setVisibility(0);
                    }
                });
                this.f112668a.start();
            } else {
                ObjectAnimator duration2 = ObjectAnimator.ofFloat(this.f112669b, "alpha", 1.0f, BitmapDescriptorFactory.HUE_RED).setDuration(200L);
                this.f112668a = duration2;
                duration2.addListener(new Animator.AnimatorListener() {
                    /* class com.ss.android.lark.main.app.title.C44404a.C444073 */

                    public void onAnimationRepeat(Animator animator) {
                    }

                    public void onAnimationStart(Animator animator) {
                    }

                    public void onAnimationCancel(Animator animator) {
                        C44404a.this.f112668a = null;
                    }

                    public void onAnimationEnd(Animator animator) {
                        C44404a.this.f112669b.setVisibility(4);
                        C44404a.this.f112668a = null;
                    }
                });
                this.f112668a.start();
            }
        }
    }

    /* renamed from: com.ss.android.lark.main.app.title.a$b */
    public static class C44410b {

        /* renamed from: a */
        public String f112687a;

        /* renamed from: b */
        public String f112688b;

        /* renamed from: c */
        public String f112689c;

        public C44410b(String str, String str2, String str3) {
            this.f112687a = str;
            this.f112688b = str2;
            this.f112689c = str3;
        }
    }
}
