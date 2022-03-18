package com.ss.lark.android.passport.biz.feature.company_login.p3222a;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.method.TextKeyListener;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.larksuite.component.universe_design.dialog.UDDialog;
import com.larksuite.component.universe_design.dialog.UDDialogBuilder;
import com.larksuite.suite.R;
import com.ss.android.lark.p2069j.p2070a.C40654u;
import com.ss.android.lark.passport.infra.base.architecture.BaseActivity;
import com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49023c;
import com.ss.android.lark.passport.infra.base.network.C49081e;
import com.ss.android.lark.passport.infra.base.storage.util.IsolateStorageUtil;
import com.ss.android.lark.passport.infra.config.PassportConfigCenter;
import com.ss.android.lark.passport.infra.log.PassportLog;
import com.ss.android.lark.passport.infra.service.ServiceFinder;
import com.ss.android.lark.passport.infra.util.C49154ag;
import com.ss.android.lark.passport.infra.util.C49157ai;
import com.ss.android.lark.passport.infra.util.C49203q;
import com.ss.android.lark.passport.infra.util.ak;
import com.ss.android.lark.passport.infra.watcher.WatcherHelper;
import com.ss.android.lark.passport.infra.widget.StatefulInputBgDrawable;
import com.ss.lark.android.passport.biz.account.UserGlobalKeys;
import com.ss.lark.android.passport.biz.base.ui.CommonUiContainer;
import com.ss.lark.android.passport.biz.feature.company_login.SSOLoginStatisticsHelper;
import com.ss.lark.android.passport.biz.feature.company_login.p3222a.C64696d;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: com.ss.lark.android.passport.biz.feature.company_login.a.c */
public class C64686c extends AbstractC49023c<C64696d.AbstractC64698b.AbstractC64699a> implements C64696d.AbstractC64698b {

    /* renamed from: c */
    public final Activity f163182c;

    /* renamed from: d */
    protected TextView f163183d;

    /* renamed from: e */
    EditText f163184e;

    /* renamed from: f */
    TextView f163185f;

    /* renamed from: g */
    EditText f163186g;

    /* renamed from: h */
    ConstraintLayout f163187h;

    /* renamed from: i */
    ImageView f163188i;

    /* renamed from: j */
    public final StatefulInputBgDrawable f163189j;

    /* renamed from: k */
    protected final CommonUiContainer f163190k;

    /* renamed from: l */
    private C64696d.AbstractC64698b.AbstractC64699a f163191l;

    /* renamed from: m */
    private final ArrayList<String> f163192m = new ArrayList<>();

    /* renamed from: n */
    private int f163193n = 0;

    @Override // com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49024d
    public void cn_() {
        this.f163191l = null;
    }

    @Override // com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49024d
    /* renamed from: a */
    public void mo171169a() {
        m254132i();
    }

    /* renamed from: k */
    private String m254134k() {
        if (ServiceFinder.m193748c().isLarkPackage()) {
            return ".larksuite.com";
        }
        return ".feishu.cn";
    }

    @Override // com.ss.lark.android.passport.biz.feature.company_login.p3222a.C64696d.AbstractC64698b
    /* renamed from: d */
    public void mo223496d() {
        Activity activity = this.f163182c;
        if (activity != null && (activity instanceof BaseActivity)) {
            ((BaseActivity) activity).mo171141m();
        }
    }

    @Override // com.ss.lark.android.passport.biz.feature.company_login.p3222a.C64696d.AbstractC64698b
    /* renamed from: e */
    public void mo223497e() {
        Activity activity = this.f163182c;
        if (activity != null && (activity instanceof BaseActivity)) {
            ((BaseActivity) activity).mo171143o();
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: l */
    private void m254135l() {
        this.f163186g.setFocusable(true);
        this.f163186g.setFocusableInTouchMode(true);
        this.f163186g.requestFocus();
        if (!C49203q.m193977c(this.f163182c)) {
            this.f163186g.postDelayed(new Runnable() {
                /* class com.ss.lark.android.passport.biz.feature.company_login.p3222a.C64686c.RunnableC646959 */

                public void run() {
                    ((InputMethodManager) C64686c.this.f163186g.getContext().getSystemService("input_method")).showSoftInput(C64686c.this.f163186g, 0);
                }
            }, 500);
        }
    }

    /* renamed from: h */
    private void m254131h() {
        String str = (String) IsolateStorageUtil.f123196a.mo171255c(UserGlobalKeys.f162505g);
        if (!TextUtils.isEmpty(str)) {
            this.f163184e.setText(str);
            this.f123085b.mo171465b("n_page_idp_login", "use local sso domain name");
            return;
        }
        EditText editText = this.f163184e;
        editText.setText("." + this.f163192m.get(this.f163193n));
        PassportLog passportLog = this.f123085b;
        passportLog.mo171465b("n_page_idp_login", "currentDomain index: " + this.f163193n);
    }

    @Override // com.ss.lark.android.passport.biz.feature.company_login.p3222a.C64696d.AbstractC64698b
    /* renamed from: f */
    public void mo223498f() {
        try {
            Map<String, String> map = PassportConfigCenter.f123034a.mo171113d().ssoHelpUrlMap;
            String b = C49081e.m193469b();
            if (map != null && !TextUtils.isEmpty(b) && map.containsKey(b)) {
                final String str = map.get(b);
                if (!TextUtils.isEmpty(str)) {
                    this.f163185f.setVisibility(0);
                    ak.m193850a(this.f163185f, new View.OnClickListener() {
                        /* class com.ss.lark.android.passport.biz.feature.company_login.p3222a.C64686c.View$OnClickListenerC646871 */

                        public void onClick(View view) {
                            SSOLoginStatisticsHelper.m254151b();
                            C49157ai.m193846a(C64686c.this.f163182c, str);
                        }
                    });
                }
            }
        } catch (Throwable th) {
            this.f123085b.mo171462a("CompanyLoginView", "showHelperView failed", th);
        }
        m254131h();
    }

    /* renamed from: j */
    private void m254133j() {
        UDDialogBuilder eVar = new UDDialogBuilder(this.f163182c);
        String k = m254134k();
        StringBuilder sb = new StringBuilder();
        Activity activity = this.f163182c;
        sb.append(C49154ag.m193831a(activity, (int) R.string.Lark_Login_SSO_ChangeDomainSuffix_content, "SSO_DOMAIN", "\"" + this.f163186g.getText().toString().concat(k), this.f123085b));
        sb.append("\"");
        ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) eVar.title(this.f163182c.getString(R.string.Lark_Login_SSO_ChangeDomainSuffix_title))).message(sb.toString())).titleBold(true)).addActionButton(R.id.ud_dialog_btn_secondary, this.f163182c.getString(R.string.Lark_Legacy_Cancel), new DialogInterface.OnClickListener() {
            /* class com.ss.lark.android.passport.biz.feature.company_login.p3222a.$$Lambda$c$2Fr5aNPejVeiuCSGxE6nUU4JY_E */

            public final void onClick(DialogInterface dialogInterface, int i) {
                C64686c.this.m254129a(dialogInterface, i);
            }
        })).addActionButton(R.id.ud_dialog_btn_primary, this.f163182c.getString(R.string.Lark_Legacy_Confirm), new DialogInterface.OnClickListener(k) {
            /* class com.ss.lark.android.passport.biz.feature.company_login.p3222a.$$Lambda$c$e68S7vveAActI9V42t0IHoVm6Rc */
            public final /* synthetic */ String f$1;

            {
                this.f$1 = r2;
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
                C64686c.this.m254130a(this.f$1, dialogInterface, i);
            }
        });
        UDDialog build = eVar.build();
        if (build != null) {
            build.show();
        }
    }

    /* renamed from: g */
    public void mo223499g() {
        if (C49203q.m193977c(this.f163182c)) {
            C49203q.m193973a((Context) this.f163182c);
        }
        if (!TextUtils.isEmpty(this.f163184e.getText().toString().trim()) && !TextUtils.isEmpty(this.f163186g.getText().toString().trim())) {
            WatcherHelper.m193664a(this.f123084a, C40654u.f103196s);
            if (this.f163184e.getText().toString().equals(".feishu.cn") || this.f163184e.getText().toString().equals(".larksuite.com")) {
                this.f123085b.mo171465b("n_action_idp_login_next", "domain is .feishu or .larksuite");
                this.f163191l.mo223494a(this.f163186g.getText().toString().trim(), this.f163184e.getText().toString().trim());
            } else if (this.f163184e.getText().toString().equals("feishu.cn")) {
                this.f123085b.mo171465b("n_action_idp_login_next", "domain is feishu");
                this.f163191l.mo223494a(this.f163186g.getText().toString().trim(), ".feishu.cn");
            } else if (this.f163184e.getText().toString().equals("larksuite.com")) {
                this.f123085b.mo171465b("n_action_idp_login_next", "domain is larksuite");
                this.f163191l.mo223494a(this.f163186g.getText().toString().trim(), ".larksuite.com");
            } else {
                this.f123085b.mo171465b("n_action_idp_login_next", "domain is custom");
                m254133j();
            }
        }
    }

    /* renamed from: i */
    private void m254132i() {
        String str = PassportConfigCenter.f123034a.mo171114e().defaultHostDomain;
        ArrayList arrayList = new ArrayList();
        arrayList.add("feishu.cn");
        arrayList.add("larksuite.com");
        PassportLog passportLog = this.f123085b;
        passportLog.mo171465b("CompanyLoginView", "domains.length: " + arrayList.size() + "default: " + str);
        this.f163192m.addAll(arrayList);
        int indexOf = arrayList.indexOf(str);
        if (indexOf >= 0) {
            this.f163193n = indexOf;
        }
        this.f163185f = (TextView) this.f163182c.findViewById(R.id.tvUnknowCompanyDomain);
        this.f163187h = (ConstraintLayout) this.f163182c.findViewById(R.id.clCompanyInput);
        this.f163184e = (EditText) this.f163182c.findViewById(R.id.tvDomainChoose);
        this.f163183d = (TextView) this.f163182c.findViewById(R.id.tv_title);
        this.f163186g = (EditText) this.f163182c.findViewById(R.id.et_company);
        this.f163188i = (ImageView) this.f163182c.findViewById(R.id.iv_clear_company);
        this.f163190k.mo222869a(R.string.Lark_Login_IdP_title);
        this.f163190k.mo222878b(R.string.Lark_Login_IdP_subtitle);
        this.f163190k.mo222881c(R.string.Lark_Login_IdP_nextstep);
        this.f163187h.setBackground(this.f163189j);
        this.f163186g.addTextChangedListener(new TextWatcher() {
            /* class com.ss.lark.android.passport.biz.feature.company_login.p3222a.C64686c.C646882 */

            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public void afterTextChanged(Editable editable) {
                boolean z;
                int i;
                int i2;
                CommonUiContainer commonUiContainer = C64686c.this.f163190k;
                if (TextUtils.isEmpty(C64686c.this.f163186g.getText().toString().trim()) || TextUtils.isEmpty(C64686c.this.f163184e.getText().toString().trim())) {
                    z = false;
                } else {
                    z = true;
                }
                commonUiContainer.mo222876a(z);
                if (TextUtils.isEmpty(editable.toString())) {
                    i = 8;
                } else {
                    i = 0;
                }
                C64686c.this.f163188i.setVisibility(i);
                if (TextUtils.isEmpty(editable.toString())) {
                    i2 = 0;
                } else {
                    i2 = C49154ag.m193828a((Context) C64686c.this.f163182c, 30.0f);
                }
                C64686c.this.f163186g.setPadding(C49154ag.m193828a((Context) C64686c.this.f163182c, 12.0f), 0, i2, 0);
            }
        });
        this.f163188i.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.lark.android.passport.biz.feature.company_login.p3222a.C64686c.View$OnClickListenerC646893 */

            public void onClick(View view) {
                C64686c.this.f163186g.setText("");
                C64686c.this.f163188i.setVisibility(8);
            }
        });
        this.f163186g.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            /* class com.ss.lark.android.passport.biz.feature.company_login.p3222a.C64686c.View$OnFocusChangeListenerC646904 */

            public void onFocusChange(View view, boolean z) {
                if (z) {
                    C64686c.this.f163189j.mo171827b();
                    C64686c.this.f163186g.setEllipsize(null);
                    C64686c.this.f163186g.setKeyListener(new TextKeyListener(TextKeyListener.Capitalize.NONE, false));
                    if (!C49203q.m193977c(C64686c.this.f163182c)) {
                        C49203q.m193975a(C64686c.this.f163186g);
                        return;
                    }
                    return;
                }
                C64686c.this.f163189j.mo171824a();
                C64686c.this.f163186g.setKeyListener(null);
                C64686c.this.f163186g.setEllipsize(TextUtils.TruncateAt.END);
            }
        });
        String str2 = (String) IsolateStorageUtil.f123196a.mo171255c(UserGlobalKeys.f162504f);
        if (!TextUtils.isEmpty(str2)) {
            this.f163186g.setText(str2);
        }
        EditText editText = this.f163186g;
        editText.setSelection(editText.length());
        this.f163184e.post(new Runnable() {
            /* class com.ss.lark.android.passport.biz.feature.company_login.p3222a.C64686c.RunnableC646915 */

            public void run() {
                C64686c.this.f163184e.setMaxWidth((int) (((double) C64686c.this.f163187h.getMeasuredWidth()) / 2.0d));
            }
        });
        this.f163184e.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            /* class com.ss.lark.android.passport.biz.feature.company_login.p3222a.C64686c.View$OnFocusChangeListenerC646926 */

            public void onFocusChange(View view, boolean z) {
                if (z) {
                    C64686c.this.f163189j.mo171827b();
                    C64686c.this.f163184e.setEllipsize(null);
                    C64686c.this.f163184e.setKeyListener(new TextKeyListener(TextKeyListener.Capitalize.NONE, false));
                    if (!C49203q.m193977c(C64686c.this.f163182c)) {
                        C49203q.m193975a(C64686c.this.f163184e);
                        return;
                    }
                    return;
                }
                C64686c.this.f163189j.mo171824a();
                C64686c.this.f163184e.setKeyListener(null);
                C64686c.this.f163184e.setEllipsize(TextUtils.TruncateAt.END);
            }
        });
        this.f163184e.addTextChangedListener(new TextWatcher() {
            /* class com.ss.lark.android.passport.biz.feature.company_login.p3222a.C64686c.C646937 */

            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public void afterTextChanged(Editable editable) {
                boolean z;
                CommonUiContainer commonUiContainer = C64686c.this.f163190k;
                if (TextUtils.isEmpty(C64686c.this.f163186g.getText().toString().trim()) || TextUtils.isEmpty(C64686c.this.f163184e.getText().toString().trim())) {
                    z = false;
                } else {
                    z = true;
                }
                commonUiContainer.mo222876a(z);
            }
        });
        this.f163190k.mo222873a((View.OnClickListener) new View.OnClickListener() {
            /* class com.ss.lark.android.passport.biz.feature.company_login.p3222a.C64686c.View$OnClickListenerC646948 */

            public void onClick(View view) {
                C64686c.this.f123085b.mo171465b("n_action_idp_login_next", "next button clicked");
                SSOLoginStatisticsHelper.m254150a();
                C64686c.this.mo223499g();
            }
        });
        this.f163190k.mo222876a(false);
        this.f163184e.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
        this.f163187h.post(new Runnable() {
            /* class com.ss.lark.android.passport.biz.feature.company_login.p3222a.$$Lambda$c$VVNYMgOVS9SKysuKhdr_ZzjePm0 */

            public final void run() {
                C64686c.this.m254135l();
            }
        });
    }

    /* renamed from: a */
    public void mo171188a(C64696d.AbstractC64698b.AbstractC64699a aVar) {
        this.f163191l = aVar;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m254129a(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        this.f123085b.mo171465b("CompanyLoginView", "you clicked negative button");
    }

    public C64686c(Activity activity, CommonUiContainer commonUiContainer) {
        this.f163182c = activity;
        this.f163190k = commonUiContainer;
        this.f163189j = new StatefulInputBgDrawable(activity);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m254130a(String str, DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        this.f163191l.mo223494a(this.f163186g.getText().toString().trim(), str);
    }
}
