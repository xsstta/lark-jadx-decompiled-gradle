package com.ss.android.vc.meeting.module.meetingdialog.pstn;

import android.content.Context;
import android.content.res.Resources;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.larksuite.framework.utils.KeyboardUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.widget.listener.OnSingleClickListener;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60773o;
import com.ss.android.vc.dependency.VideoChatModuleDependency;
import com.ss.android.vc.entity.response.C60987v;
import com.ss.android.vc.meeting.basedialog.AbstractC61222a;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.module.meetingdialog.pstn.IPstnInviteContract;
import com.ss.android.vc.meeting.module.meetingdialog.pstn.country.AbstractC62416f;
import com.ss.android.vc.meeting.module.meetingdialog.pstn.country.C62410c;
import com.ss.android.vc.meeting.module.meetingdialog.pstn.country.C62412d;
import com.ss.android.vc.meeting.module.meetingdialog.pstn.country.CountryInfo;
import com.ss.android.vc.statistics.event.MeetingChargingEvent;

public class PhoneInviteView extends FrameLayout implements IPstnInviteContract.AbstractC62389b {

    /* renamed from: A */
    private static String f156910A;

    /* renamed from: y */
    private static String f156911y;

    /* renamed from: z */
    private static String f156912z;

    /* renamed from: B */
    private AbstractC62395a f156913B;

    /* renamed from: C */
    private boolean f156914C;

    /* renamed from: D */
    private C60987v f156915D;

    /* renamed from: a */
    public EditText f156916a;

    /* renamed from: b */
    public View f156917b;

    /* renamed from: c */
    public EditText f156918c;

    /* renamed from: d */
    public View f156919d;

    /* renamed from: e */
    private C61303k f156920e;

    /* renamed from: f */
    private C62420e f156921f;

    /* renamed from: g */
    private IPstnInviteContract.AbstractC62389b.AbstractC62390a f156922g;

    /* renamed from: h */
    private int f156923h;

    /* renamed from: i */
    private int f156924i;

    /* renamed from: j */
    private int f156925j;

    /* renamed from: k */
    private int f156926k;

    /* renamed from: l */
    private int f156927l;

    /* renamed from: m */
    private int f156928m;

    /* renamed from: n */
    private View f156929n;

    /* renamed from: o */
    private TextView f156930o;

    /* renamed from: p */
    private View f156931p;

    /* renamed from: q */
    private TextView f156932q;

    /* renamed from: r */
    private TextView f156933r;

    /* renamed from: s */
    private View f156934s;

    /* renamed from: t */
    private ViewGroup f156935t;

    /* renamed from: u */
    private TextView f156936u;

    /* renamed from: v */
    private ViewGroup f156937v;

    /* renamed from: w */
    private ViewGroup f156938w;

    /* renamed from: x */
    private ViewGroup f156939x;

    /* renamed from: com.ss.android.vc.meeting.module.meetingdialog.pstn.PhoneInviteView$a */
    public interface AbstractC62395a {
        /* renamed from: k */
        void mo215726k();

        /* renamed from: l */
        void mo215727l();
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        this.f156922g = null;
    }

    /* renamed from: c */
    private void m243842c() {
        m243844d();
        m243846e();
    }

    /* renamed from: g */
    private void m243849g() {
        AbstractC62395a aVar = this.f156913B;
        if (aVar != null) {
            aVar.mo215726k();
        }
    }

    @Override // com.ss.android.vc.meeting.module.meetingdialog.pstn.IPstnInviteContract.AbstractC62389b
    public String getName() {
        return this.f156916a.getText().toString();
    }

    /* renamed from: f */
    private void m243848f() {
        C60700b.m235851b("PhoneInviteView@", "[resetInfo]", "resetInfo");
        f156911y = "";
        f156910A = "";
        f156912z = "";
    }

    /* renamed from: h */
    private void m243850h() {
        C60700b.m235851b("PhoneInviteView@", "[onCancelClicked]", "onCancelClicked");
        IPstnInviteContract.AbstractC62389b.AbstractC62390a aVar = this.f156922g;
        if (aVar != null) {
            aVar.mo215711b();
        }
    }

    /* renamed from: d */
    private void m243844d() {
        this.f156923h = C60773o.m236126d(R.color.primary_pri_500);
        this.f156924i = C60773o.m236126d(R.color.function_warning_500);
        this.f156925j = C60773o.m236126d(R.color.function_success_500);
        this.f156926k = C60773o.m236126d(R.color.primary_pri_400);
        this.f156927l = C60773o.m236126d(R.color.function_warning_500);
        this.f156928m = C60773o.m236126d(R.color.function_success_500);
    }

    @Override // com.ss.android.vc.meeting.module.meetingdialog.pstn.IPstnInviteContract.AbstractC62389b
    public String getPhone() {
        String charSequence = this.f156936u.getText().toString();
        String replaceAll = this.f156918c.getText().toString().replaceAll(" ", "");
        return charSequence + "-" + replaceAll;
    }

    /* renamed from: com.ss.android.vc.meeting.module.meetingdialog.pstn.PhoneInviteView$4 */
    public static /* synthetic */ class C623944 {

        /* renamed from: a */
        static final /* synthetic */ int[] f156943a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|14) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.ss.android.vc.meeting.module.meetingdialog.pstn.IPstnInviteContract$InviteState[] r0 = com.ss.android.vc.meeting.module.meetingdialog.pstn.IPstnInviteContract.InviteState.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ss.android.vc.meeting.module.meetingdialog.pstn.PhoneInviteView.C623944.f156943a = r0
                com.ss.android.vc.meeting.module.meetingdialog.pstn.IPstnInviteContract$InviteState r1 = com.ss.android.vc.meeting.module.meetingdialog.pstn.IPstnInviteContract.InviteState.CALLING     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.ss.android.vc.meeting.module.meetingdialog.pstn.PhoneInviteView.C623944.f156943a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.ss.android.vc.meeting.module.meetingdialog.pstn.IPstnInviteContract$InviteState r1 = com.ss.android.vc.meeting.module.meetingdialog.pstn.IPstnInviteContract.InviteState.CANCELED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.ss.android.vc.meeting.module.meetingdialog.pstn.PhoneInviteView.C623944.f156943a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.ss.android.vc.meeting.module.meetingdialog.pstn.IPstnInviteContract$InviteState r1 = com.ss.android.vc.meeting.module.meetingdialog.pstn.IPstnInviteContract.InviteState.BUSY     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = com.ss.android.vc.meeting.module.meetingdialog.pstn.PhoneInviteView.C623944.f156943a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.ss.android.vc.meeting.module.meetingdialog.pstn.IPstnInviteContract$InviteState r1 = com.ss.android.vc.meeting.module.meetingdialog.pstn.IPstnInviteContract.InviteState.REFUSE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = com.ss.android.vc.meeting.module.meetingdialog.pstn.PhoneInviteView.C623944.f156943a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.ss.android.vc.meeting.module.meetingdialog.pstn.IPstnInviteContract$InviteState r1 = com.ss.android.vc.meeting.module.meetingdialog.pstn.IPstnInviteContract.InviteState.FORBIDDEN     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = com.ss.android.vc.meeting.module.meetingdialog.pstn.PhoneInviteView.C623944.f156943a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.ss.android.vc.meeting.module.meetingdialog.pstn.IPstnInviteContract$InviteState r1 = com.ss.android.vc.meeting.module.meetingdialog.pstn.IPstnInviteContract.InviteState.SUCCEED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vc.meeting.module.meetingdialog.pstn.PhoneInviteView.C623944.<clinit>():void");
        }
    }

    /* renamed from: i */
    private void m243851i() {
        AbstractC61222a a = C62412d.m243941a(C60773o.m236124b(getContext()), this.f156920e);
        AbstractC62416f fVar = (AbstractC62416f) a;
        fVar.mo215801a(new C62410c.AbstractC62411a() {
            /* class com.ss.android.vc.meeting.module.meetingdialog.pstn.$$Lambda$PhoneInviteView$gIIVpImMkUtlNLvg2TIHVuNIxb0 */

            @Override // com.ss.android.vc.meeting.module.meetingdialog.pstn.country.C62410c.AbstractC62411a
            public final void onSelected(CountryInfo countryInfo) {
                PhoneInviteView.lambda$gIIVpImMkUtlNLvg2TIHVuNIxb0(PhoneInviteView.this, countryInfo);
            }
        });
        String charSequence = this.f156936u.getText().toString();
        C60700b.m235851b("PhoneInviteView@", "[onChooseCountry]", "selected country code: " + charSequence);
        if (!TextUtils.isEmpty(charSequence)) {
            fVar.mo215802b(charSequence);
        }
        a.mo211606a();
    }

    /* renamed from: a */
    public void mo215712a() {
        C60700b.m235851b("PhoneInviteView@", "[onCallClicked]", "onCallClicked");
        this.f156916a.clearFocus();
        this.f156918c.clearFocus();
        IPstnInviteContract.AbstractC62389b.AbstractC62390a aVar = this.f156922g;
        if (aVar != null) {
            aVar.mo215710a();
        }
        AbstractC62395a aVar2 = this.f156913B;
        if (aVar2 != null) {
            aVar2.mo215727l();
        }
    }

    /* renamed from: b */
    public void mo215717b() {
        C60700b.m235851b("PhoneInviteView@", "[onDestroy]", "onDestroy");
        KeyboardUtils.hideKeyboard(getContext());
        f156911y = this.f156936u.getText().toString();
        f156912z = this.f156918c.getText().toString();
        f156910A = this.f156916a.getText().toString();
        C62420e eVar = this.f156921f;
        if (eVar != null) {
            eVar.destroy();
        }
    }

    /* renamed from: e */
    private void m243846e() {
        String str;
        LayoutInflater.from(getContext()).inflate(R.layout.phone_invite_layout, (ViewGroup) this, true);
        setBackgroundColor(C60773o.m236126d(R.color.bg_body));
        View findViewById = findViewById(R.id.invite_icon_close);
        this.f156929n = findViewById;
        findViewById.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.vc.meeting.module.meetingdialog.pstn.$$Lambda$PhoneInviteView$wgHYGotKwVb5tmmzsdozSYins5E */

            public final void onClick(View view) {
                PhoneInviteView.lambda$wgHYGotKwVb5tmmzsdozSYins5E(PhoneInviteView.this, view);
            }
        });
        this.f156930o = (TextView) findViewById(R.id.invite_calling_status_txt);
        this.f156931p = findViewById(R.id.invite_calling_status_bg);
        this.f156932q = (TextView) findViewById(R.id.invite_btn_call);
        mo215716a(false);
        this.f156932q.setOnClickListener(new OnSingleClickListener() {
            /* class com.ss.android.vc.meeting.module.meetingdialog.pstn.PhoneInviteView.C623911 */

            @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
            public void onSingleClick(View view) {
                PhoneInviteView.this.mo215712a();
            }
        });
        TextView textView = (TextView) findViewById(R.id.invite_btn_cancel);
        this.f156933r = textView;
        textView.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.vc.meeting.module.meetingdialog.pstn.$$Lambda$PhoneInviteView$Y011lP2n3iRf_fcZuBXB1Yed3V8 */

            public final void onClick(View view) {
                PhoneInviteView.lambda$Y011lP2n3iRf_fcZuBXB1Yed3V8(PhoneInviteView.this, view);
            }
        });
        this.f156934s = findViewById(R.id.invite_sub_title_name);
        this.f156935t = (ViewGroup) findViewById(R.id.invite_edit_name_container);
        this.f156916a = (EditText) findViewById(R.id.invite_edit_name);
        this.f156917b = findViewById(R.id.invite_icon_clear_name);
        TextView textView2 = (TextView) findViewById(R.id.invite_country_code);
        this.f156936u = textView2;
        if (VideoChatModuleDependency.getAppEnvDependency().mo196333c()) {
            str = "+1";
        } else {
            str = "+86";
        }
        textView2.setText(str);
        this.f156937v = (ViewGroup) findViewById(R.id.invite_edit_phone_container);
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.invite_country_choose_container);
        this.f156938w = viewGroup;
        viewGroup.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.vc.meeting.module.meetingdialog.pstn.$$Lambda$PhoneInviteView$ekEpknef9xwXm4h9SkC4AlG7uBY */

            public final void onClick(View view) {
                PhoneInviteView.lambda$ekEpknef9xwXm4h9SkC4AlG7uBY(PhoneInviteView.this, view);
            }
        });
        this.f156918c = (EditText) findViewById(R.id.invite_edit_phone_editor);
        this.f156919d = findViewById(R.id.invite_icon_clear_phone);
        this.f156939x = (ViewGroup) findViewById(R.id.charging_status_view);
        this.f156916a.addTextChangedListener(new TextWatcher() {
            /* class com.ss.android.vc.meeting.module.meetingdialog.pstn.PhoneInviteView.C623922 */

            public void afterTextChanged(Editable editable) {
            }

            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                if (!PhoneInviteView.this.f156916a.hasFocus() || TextUtils.isEmpty(charSequence)) {
                    PhoneInviteView.this.f156917b.setVisibility(8);
                } else {
                    PhoneInviteView.this.f156917b.setVisibility(0);
                }
            }
        });
        this.f156916a.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            /* class com.ss.android.vc.meeting.module.meetingdialog.pstn.$$Lambda$PhoneInviteView$ukD19ikbyzp9OejiWscqIC7n_mQ */

            public final void onFocusChange(View view, boolean z) {
                PhoneInviteView.lambda$ukD19ikbyzp9OejiWscqIC7n_mQ(PhoneInviteView.this, view, z);
            }
        });
        this.f156917b.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.vc.meeting.module.meetingdialog.pstn.$$Lambda$PhoneInviteView$BiAeJpUoCvr4lFFekH3qdZqhCg8 */

            public final void onClick(View view) {
                PhoneInviteView.lambda$BiAeJpUoCvr4lFFekH3qdZqhCg8(PhoneInviteView.this, view);
            }
        });
        this.f156918c.addTextChangedListener(new TextWatcher() {
            /* class com.ss.android.vc.meeting.module.meetingdialog.pstn.PhoneInviteView.C623933 */

            public void afterTextChanged(Editable editable) {
            }

            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                if (!PhoneInviteView.this.f156918c.hasFocus() || TextUtils.isEmpty(charSequence)) {
                    PhoneInviteView.this.f156919d.setVisibility(8);
                } else {
                    PhoneInviteView.this.f156919d.setVisibility(0);
                }
                PhoneInviteView.this.mo215715a(charSequence);
            }
        });
        this.f156918c.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            /* class com.ss.android.vc.meeting.module.meetingdialog.pstn.$$Lambda$PhoneInviteView$l5aO2dmdgOxdE3CP2iZRwK8WxF0 */

            public final void onFocusChange(View view, boolean z) {
                PhoneInviteView.lambda$l5aO2dmdgOxdE3CP2iZRwK8WxF0(PhoneInviteView.this, view, z);
            }
        });
        this.f156919d.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.vc.meeting.module.meetingdialog.pstn.$$Lambda$PhoneInviteView$OPH8nEomnqNYy2rDP6jVmgG2TVE */

            public final void onClick(View view) {
                PhoneInviteView.lambda$OPH8nEomnqNYy2rDP6jVmgG2TVE(PhoneInviteView.this, view);
            }
        });
    }

    /* access modifiers changed from: public */
    /* renamed from: c */
    private /* synthetic */ void m243843c(View view) {
        m243851i();
    }

    /* access modifiers changed from: public */
    /* renamed from: d */
    private /* synthetic */ void m243845d(View view) {
        m243850h();
    }

    /* access modifiers changed from: public */
    /* renamed from: e */
    private /* synthetic */ void m243847e(View view) {
        m243849g();
    }

    public void setActionListener(AbstractC62395a aVar) {
        this.f156913B = aVar;
    }

    public void setViewDelegate(IPstnInviteContract.AbstractC62389b.AbstractC62390a aVar) {
        this.f156922g = aVar;
    }

    public PhoneInviteView(Context context) {
        super(context);
        m243842c();
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m243836a(View view) {
        this.f156918c.setText("");
    }

    /* access modifiers changed from: public */
    /* renamed from: b */
    private /* synthetic */ void m243839b(View view) {
        this.f156916a.setText("");
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private void m243838a(CountryInfo countryInfo) {
        if (countryInfo != null) {
            this.f156914C = true;
            this.f156936u.setText(countryInfo.getCode());
        }
    }

    /* renamed from: b */
    private boolean m243841b(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence) || charSequence.length() < 3) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public void mo215714a(C61303k kVar) {
        this.f156920e = kVar;
        C62420e eVar = new C62420e(this, kVar);
        this.f156921f = eVar;
        eVar.create();
    }

    @Override // com.ss.android.vc.meeting.module.meetingdialog.pstn.IPstnInviteContract.AbstractC62389b
    public void setDefaultCountryCode(String str) {
        C60700b.m235851b("PhoneInviteView@", "[setDefaultCountryCode]", "code = " + str);
        if (!this.f156914C) {
            this.f156936u.setText(str);
        }
    }

    @Override // com.ss.android.vc.meeting.module.meetingdialog.pstn.IPstnInviteContract.AbstractC62389b
    /* renamed from: a */
    public void mo215704a(C60987v vVar) {
        String str;
        EditText editText = this.f156918c;
        if (editText != null) {
            str = editText.getText().toString();
        } else {
            str = "";
        }
        this.f156915D = vVar;
        if (vVar == null || vVar.f152725c) {
            this.f156939x.setVisibility(8);
            mo215716a(m243841b(str));
            return;
        }
        C60700b.m235851b("PhoneInviteView@", "[updateSuiteQuotaSetting]", "GetSuiteQuotaEntity.pstnCall : " + vVar.f152725c);
        MeetingChargingEvent.m249932a(MeetingChargingEvent.Type.PSTN, null);
        this.f156939x.setVisibility(0);
        mo215716a(false);
    }

    @Override // com.ss.android.vc.meeting.module.meetingdialog.pstn.IPstnInviteContract.AbstractC62389b
    public void setState(IPstnInviteContract.InviteState inviteState) {
        int i;
        int i2;
        int i3;
        C60700b.m235851b("PhoneInviteView@", "[setState]", "" + inviteState);
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) this.f156934s.getLayoutParams();
        int i4 = layoutParams.leftMargin;
        Resources resources = getResources();
        if (inviteState == IPstnInviteContract.InviteState.IDLE) {
            i = R.dimen.pstn_invite_name_margin_top_idle;
        } else {
            i = R.dimen.pstn_invite_name_margin_top;
        }
        layoutParams.setMargins(i4, resources.getDimensionPixelSize(i), layoutParams.rightMargin, layoutParams.bottomMargin);
        this.f156934s.setLayoutParams(layoutParams);
        TextView textView = this.f156930o;
        if (inviteState == IPstnInviteContract.InviteState.IDLE) {
            i2 = 8;
        } else {
            i2 = 0;
        }
        textView.setVisibility(i2);
        View view = this.f156931p;
        if (inviteState == IPstnInviteContract.InviteState.IDLE) {
            i3 = 8;
        } else {
            i3 = 0;
        }
        view.setVisibility(i3);
        switch (C623944.f156943a[inviteState.ordinal()]) {
            case 1:
                this.f156931p.setBackgroundColor(this.f156923h);
                this.f156930o.setTextColor(this.f156926k);
                this.f156930o.setText(getResources().getString(R.string.View_G_CallingEllipsis));
                break;
            case 2:
                this.f156931p.setBackgroundColor(this.f156924i);
                this.f156930o.setTextColor(this.f156927l);
                this.f156930o.setText(getResources().getString(R.string.View_G_CallCanceledBySelf));
                break;
            case 3:
                this.f156931p.setBackgroundColor(this.f156924i);
                this.f156930o.setTextColor(this.f156927l);
                this.f156930o.setText(getResources().getString(R.string.View_G_Busy));
                break;
            case 4:
                this.f156931p.setBackgroundColor(this.f156924i);
                this.f156930o.setTextColor(this.f156927l);
                this.f156930o.setText(getResources().getString(R.string.View_G_CallDeclined));
                break;
            case 5:
                this.f156931p.setBackgroundColor(this.f156924i);
                this.f156930o.setTextColor(this.f156927l);
                this.f156930o.setText(getResources().getString(R.string.View_G_RestrictedNumber));
                break;
            case 6:
                this.f156931p.setBackgroundColor(this.f156925j);
                this.f156930o.setTextColor(this.f156928m);
                this.f156930o.setText(getResources().getString(R.string.View_G_CallConnected));
                break;
        }
        if (inviteState == IPstnInviteContract.InviteState.CALLING) {
            this.f156933r.setVisibility(0);
            this.f156932q.setVisibility(8);
            this.f156935t.setAlpha(0.3f);
            this.f156937v.setAlpha(0.3f);
            this.f156916a.setInputType(0);
            this.f156916a.setFocusable(false);
            this.f156918c.setInputType(0);
            this.f156918c.setFocusable(false);
            return;
        }
        this.f156933r.setVisibility(8);
        this.f156932q.setVisibility(0);
        this.f156935t.setAlpha(1.0f);
        this.f156937v.setAlpha(1.0f);
        this.f156916a.setInputType(1);
        this.f156916a.setFocusableInTouchMode(true);
        this.f156918c.setInputType(3);
        this.f156918c.setFocusableInTouchMode(true);
    }

    @Override // com.ss.android.vc.meeting.module.meetingdialog.pstn.IPstnInviteContract.AbstractC62389b
    /* renamed from: a */
    public void mo215705a(IPstnInviteContract.InviteState inviteState) {
        m243848f();
        setState(inviteState);
    }

    /* renamed from: a */
    public void mo215715a(CharSequence charSequence) {
        boolean z;
        if (this.f156915D != null) {
            if (!m243841b(charSequence) || !this.f156915D.f152725c) {
                z = false;
            } else {
                z = true;
            }
            mo215716a(z);
            return;
        }
        mo215716a(m243841b(charSequence));
    }

    /* renamed from: a */
    public void mo215716a(boolean z) {
        C60700b.m235851b("PhoneInviteView@", "[enableCall]", "enableCall: " + z);
        this.f156932q.setEnabled(z);
    }

    public PhoneInviteView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m243842c();
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m243837a(View view, boolean z) {
        int i;
        if (!z || TextUtils.isEmpty(this.f156918c.getText())) {
            this.f156919d.setVisibility(8);
        } else {
            this.f156919d.setVisibility(0);
        }
        ViewGroup viewGroup = this.f156937v;
        if (z) {
            i = R.drawable.invite_edit_bg_selected;
        } else {
            i = R.drawable.invite_edit_bg;
        }
        viewGroup.setBackgroundResource(i);
    }

    /* access modifiers changed from: public */
    /* renamed from: b */
    private /* synthetic */ void m243840b(View view, boolean z) {
        int i;
        if (!z || TextUtils.isEmpty(this.f156916a.getText())) {
            this.f156917b.setVisibility(8);
        } else {
            this.f156917b.setVisibility(0);
        }
        ViewGroup viewGroup = this.f156935t;
        if (z) {
            i = R.drawable.invite_edit_bg_selected;
        } else {
            i = R.drawable.invite_edit_bg;
        }
        viewGroup.setBackgroundResource(i);
    }

    /* renamed from: a */
    public void mo215713a(int i, int i2) {
        C60700b.m235851b("PhoneInviteView@", "[onKeyboardHeightChanged]", "height = " + i);
        setPadding(getPaddingLeft(), getPaddingTop(), getPaddingRight(), i);
    }

    public PhoneInviteView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m243842c();
    }
}
