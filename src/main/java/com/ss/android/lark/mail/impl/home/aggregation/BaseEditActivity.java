package com.ss.android.lark.mail.impl.home.aggregation;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.Pair;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.lifecycle.AbstractC1178x;
import com.larksuite.component.universe_design.edittext.UDEditText;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.suite.R;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mail.impl.entity.MailLabelEntity;
import com.ss.android.lark.mail.impl.p2171h.C42187a;
import com.ss.android.lark.mail.impl.p2171h.p2172a.C42209j;
import com.ss.android.lark.mail.impl.service.C43374f;
import com.ss.android.lark.mail.impl.utils.C43752b;
import com.ss.android.lark.mail.impl.utils.C43819s;
import com.ss.android.lark.mail.impl.utils.C43821t;
import com.ss.android.lark.mail.impl.utils.C43849u;
import com.ss.android.lark.mail.impl.utils.toast.MailToast;
import com.ss.android.lark.mail.impl.view.BaseMailFragmentActivity;
import com.ss.android.lark.mail.impl.view.dialog.DialogC43910a;
import com.ss.android.lark.utils.UIHelper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class BaseEditActivity extends BaseMailFragmentActivity implements DialogC43910a.AbstractC43914a {

    /* renamed from: j */
    public static String f107874j;

    /* renamed from: a */
    protected RelativeLayout f107875a;

    /* renamed from: b */
    protected UDEditText f107876b;

    /* renamed from: c */
    protected TextView f107877c;

    /* renamed from: d */
    protected TextView f107878d;

    /* renamed from: e */
    protected TextView f107879e;

    /* renamed from: f */
    protected View f107880f;

    /* renamed from: g */
    protected DialogC43910a f107881g;

    /* renamed from: h */
    public MailLabelEntity f107882h;

    /* renamed from: i */
    public boolean f107883i;

    /* renamed from: k */
    protected int f107884k;

    /* renamed from: l */
    protected String f107885l;

    /* renamed from: m */
    int f107886m;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo152554a(MailLabelEntity mailLabelEntity, String str);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo152555a(String str, String str2, IGetDataCallback<MailLabelEntity> iGetDataCallback);

    @Override // com.ss.android.lark.mail.impl.view.BaseMailFragmentActivity
    public boolean aL_() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo152558b(String str, String str2, IGetDataCallback<MailLabelEntity> iGetDataCallback);

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract AbstractC42401a mo152561d();

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity, com.ss.android.lark.mail.impl.view.BaseMailFragmentActivity
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // com.ss.android.lark.mail.impl.view.BaseMailFragmentActivity
    /* renamed from: a */
    public String mo150444a() {
        if (this.f107883i) {
            return C42187a.C42190b.f107393C;
        }
        return C42187a.C42190b.f107394D;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public String mo152563f() {
        return mo152561d().mo152614a().mo151528l();
    }

    @Override // com.ss.android.lark.mail.impl.view.dialog.DialogC43910a.AbstractC43914a
    /* renamed from: i */
    public void mo152566i() {
        Log.m165389i("BaseEditActivity", "onBackPressedInLoadingDialog");
        C43752b.m173435a(this);
    }

    /* renamed from: j */
    public String mo152567j() {
        return this.f107876b.getText().toString().trim();
    }

    /* renamed from: k */
    private boolean mo152647k() {
        String str;
        if (getIntent() != null) {
            str = getIntent().getStringExtra("target_id");
        } else {
            str = null;
        }
        if (str == null) {
            this.f107883i = true;
        } else {
            MailLabelEntity a = mo152561d().mo152615a(str);
            this.f107882h = a;
            if (a == null) {
                finish();
                return true;
            }
        }
        mo152561d().mo152619b().mo5923a(this, new AbstractC1178x() {
            /* class com.ss.android.lark.mail.impl.home.aggregation.$$Lambda$BaseEditActivity$4XRFyMtR6lJWwqNtfykdW6wXbU */

            @Override // androidx.lifecycle.AbstractC1178x
            public final void onChanged(Object obj) {
                BaseEditActivity.m270753lambda$4XRFyMtR6lJWwqNtfykdW6wXbU(BaseEditActivity.this, (List) obj);
            }
        });
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public boolean mo152565h() {
        String str = this.f107885l;
        if (str == null) {
            str = this.f107882h.mo151492A();
        }
        if (!TextUtils.equals(this.f107876b.getText(), this.f107882h.mo151528l()) || !TextUtils.equals(str, this.f107882h.mo151492A())) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo152564g() {
        String j = mo152567j();
        if (TextUtils.isEmpty(j)) {
            MailToast.m173704a(mo152561d().mo152616a(R.string.Mail_Folder_PleaseEnterFolderName, new Pair[0]), MailToast.Type.UNSPECIFIC);
            C42209j.m168611a("label_create_empty_name", 40001, "toast", "", "", 1);
            return;
        }
        C43821t.m173694a(this.f107880f);
        if (this.f107883i) {
            mo152556a(true);
            mo152558b(j, this.f107885l, new IGetDataCallback<MailLabelEntity>() {
                /* class com.ss.android.lark.mail.impl.home.aggregation.BaseEditActivity.C423886 */

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    Log.m165389i("BaseEditActivity", "addEntity onError");
                    BaseEditActivity.this.mo152556a(false);
                }

                /* renamed from: a */
                public void onSuccess(MailLabelEntity mailLabelEntity) {
                    String str;
                    Log.m165389i("BaseEditActivity", "addLabel onSuccess");
                    if (mailLabelEntity != null) {
                        str = mailLabelEntity.mo151527k();
                    } else {
                        str = null;
                    }
                    BaseEditActivity.f107874j = str;
                    if (BaseEditActivity.this.f107884k != 1) {
                        BaseEditActivity.this.mo152556a(false);
                    }
                    C43752b.m173435a(BaseEditActivity.this);
                }
            });
            return;
        }
        String str = this.f107885l;
        if (str == null) {
            str = this.f107882h.mo151492A();
        }
        if (!mo152565h()) {
            Log.m165389i("BaseEditActivity", "ignore the same data");
            mo152556a(false);
            C43752b.m173435a(this);
            return;
        }
        mo152556a(true);
        mo152555a(j, str, new IGetDataCallback<MailLabelEntity>() {
            /* class com.ss.android.lark.mail.impl.home.aggregation.BaseEditActivity.C423897 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Log.m165389i("BaseEditActivity", "updateEntity onError");
                BaseEditActivity.this.mo152556a(false);
            }

            /* renamed from: a */
            public void onSuccess(MailLabelEntity mailLabelEntity) {
                Log.m165389i("BaseEditActivity", "updateEntity onSuccess");
                BaseEditActivity.this.mo152556a(false);
                C43752b.m173435a(BaseEditActivity.this);
            }
        });
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo150716e() {
        String str;
        Intent intent = getIntent();
        if (intent != null) {
            this.f107884k = intent.getIntExtra("jump_from", 0);
        }
        this.f107875a = (RelativeLayout) findViewById(R.id.mail_aggregation_edit_content_view);
        TextView textView = (TextView) findViewById(R.id.mail_aggregation_edit_title_tv);
        if (this.f107884k != 2) {
            str = mo152561d().mo152616a(R.string.Mail_Manage_CreateFolderLabel, new Pair[0]);
        } else {
            str = mo152561d().mo152616a(R.string.Mail_Folder_EditTabNameMobile, new Pair[0]);
        }
        textView.setText(str);
        findViewById(R.id.mail_aggregation_close).setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.mail.impl.home.aggregation.BaseEditActivity.View$OnClickListenerC423831 */

            public void onClick(View view) {
                BaseEditActivity.this.finish();
            }
        });
        View findViewById = findViewById(R.id.mail_aggregation_save_tv);
        this.f107880f = findViewById;
        findViewById.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.mail.impl.home.aggregation.BaseEditActivity.View$OnClickListenerC423842 */

            public void onClick(View view) {
                BaseEditActivity.this.mo152564g();
            }
        });
        UDEditText uDEditText = (UDEditText) findViewById(R.id.mail_aggregation_edit_input);
        this.f107876b = uDEditText;
        uDEditText.requestFocus();
        this.f107876b.postDelayed(new Runnable() {
            /* class com.ss.android.lark.mail.impl.home.aggregation.BaseEditActivity.RunnableC423853 */

            public void run() {
                ((InputMethodManager) BaseEditActivity.this.getSystemService("input_method")).showSoftInput(BaseEditActivity.this.f107876b, 1);
            }
        }, 100);
        this.f107876b.setHint(mo152553a(1));
        this.f107876b.addTextChangedListener(new TextWatcher() {
            /* class com.ss.android.lark.mail.impl.home.aggregation.BaseEditActivity.C423864 */

            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public void afterTextChanged(Editable editable) {
                if (editable != null) {
                    BaseEditActivity baseEditActivity = BaseEditActivity.this;
                    baseEditActivity.mo152560c(baseEditActivity.mo152567j());
                }
            }
        });
        this.f107877c = (TextView) findViewById(R.id.mail_aggregation_edit_input_error_text);
        MailLabelEntity mailLabelEntity = this.f107882h;
        if (mailLabelEntity != null) {
            this.f107876b.setText(mailLabelEntity.mo151528l());
            this.f107876b.setSelection(this.f107882h.mo151528l().length());
        }
        TextView textView2 = (TextView) findViewById(R.id.mail_aggregation_edit_location_tips);
        this.f107878d = textView2;
        textView2.setText(mo152561d().mo152616a(R.string.Mail_Manage_FolderLabelLocation, new Pair[0]));
        this.f107879e = (TextView) findViewById(R.id.mail_aggregation_edit_location);
        Drawable drawable = UIHelper.getDrawable(R.drawable.mail_icon_right_arrow);
        drawable.setBounds(0, 0, UIHelper.dp2px(16.0f), UIHelper.dp2px(16.0f));
        String str2 = null;
        this.f107879e.setCompoundDrawables(null, null, drawable, null);
        this.f107879e.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.mail.impl.home.aggregation.$$Lambda$BaseEditActivity$rAk1TFAX5zPL_fS46jOEf54KWkU */

            public final void onClick(View view) {
                BaseEditActivity.lambda$rAk1TFAX5zPL_fS46jOEf54KWkU(BaseEditActivity.this, view);
            }
        });
        AbstractC42401a d = mo152561d();
        MailLabelEntity mailLabelEntity2 = this.f107882h;
        if (mailLabelEntity2 != null) {
            str2 = mailLabelEntity2.mo151492A();
        }
        MailLabelEntity a = d.mo152615a(str2);
        if (a == null || TextUtils.isEmpty(a.mo151528l())) {
            this.f107879e.setText(mo152563f());
        } else {
            this.f107879e.setText(a.mo151528l());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public boolean mo152559b(String str) {
        return mo152557a(str, true);
    }

    /* renamed from: a */
    public void mo152556a(final boolean z) {
        C43849u.m173826a(new Runnable() {
            /* class com.ss.android.lark.mail.impl.home.aggregation.BaseEditActivity.RunnableC423908 */

            public void run() {
                if (BaseEditActivity.this.f107881g == null) {
                    BaseEditActivity.this.f107881g = new DialogC43910a(BaseEditActivity.this);
                    BaseEditActivity.this.f107881g.mo156330a(BaseEditActivity.this);
                }
                if (z) {
                    BaseEditActivity.this.f107881g.mo156331a(C43819s.m173684a((int) R.string.Mail_Normal_Loading));
                } else if (BaseEditActivity.this.f107881g.isShowing()) {
                    BaseEditActivity.this.f107881g.dismiss();
                }
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m169172a(View view) {
        String str = this.f107885l;
        if (str == null) {
            MailLabelEntity mailLabelEntity = this.f107882h;
            if (mailLabelEntity == null || TextUtils.isEmpty(mailLabelEntity.mo151492A())) {
                str = "0";
            } else {
                str = this.f107882h.mo151492A();
            }
        }
        mo152554a(this.f107882h, str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo152562d(String str) {
        this.f107880f.setAlpha(0.4f);
        this.f107880f.setOnClickListener(null);
        if (!TextUtils.isEmpty(str)) {
            this.f107876b.mo90934l();
            this.f107877c.setText(str);
            this.f107877c.setVisibility(0);
            return;
        }
        this.f107876b.mo90935m();
        this.f107877c.setVisibility(8);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity, com.ss.android.lark.mail.impl.view.BaseMailFragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.mail_aggregation_edit_layout);
        if (mo152647k()) {
            finish();
            return;
        }
        this.f107886m = UIHelper.getWindowWidth(this) - UIHelper.dp2px(64.0f);
        mo150716e();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m169173a(List list) {
        if (this.f107882h != null) {
            boolean z = true;
            Iterator it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (TextUtils.equals(this.f107882h.mo151527k(), ((MailLabelEntity) it.next()).mo151527k())) {
                        z = false;
                        break;
                    }
                } else {
                    break;
                }
            }
            if (z) {
                MailToast.m173700a(mo152561d().mo152616a(R.string.Mail_Folder_EditFolderLabelDeleted, new Pair[0]));
                finish();
            }
        }
    }

    /* renamed from: c */
    public void mo152560c(String str) {
        if (!TextUtils.isEmpty(str)) {
            Pair<Boolean, Integer> a = mo152552a(str);
            if (a != null && ((Boolean) a.first).booleanValue()) {
                String a2 = mo152553a(((Integer) a.second).intValue());
                if (!TextUtils.isEmpty(a2)) {
                    mo152562d(a2);
                    return;
                }
            }
            this.f107880f.setAlpha(1.0f);
            this.f107880f.setOnClickListener(new View.OnClickListener() {
                /* class com.ss.android.lark.mail.impl.home.aggregation.BaseEditActivity.View$OnClickListenerC423875 */

                public void onClick(View view) {
                    BaseEditActivity.this.mo152564g();
                }
            });
            this.f107876b.mo90935m();
            this.f107877c.setVisibility(8);
            return;
        }
        mo152562d(null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Pair<Boolean, Integer> mo152552a(String str) {
        if (str != null) {
            try {
                if (str.length() > 40) {
                    return new Pair<>(true, 2);
                }
            } catch (Throwable th) {
                Log.m165386e("isNameFormatError exception", th);
            }
        }
        if (mo152559b(str)) {
            return new Pair<>(true, 3);
        }
        return new Pair<>(false, 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String mo152553a(int i) {
        if (i == 1) {
            return mo152561d().mo152616a(R.string.Mail_Folder_PleaseEnterFolderName, new Pair[0]);
        }
        if (i == 2) {
            return C43819s.m173684a((int) R.string.Mail_Folder_MaximumCharacters);
        }
        if (i != 3) {
            return null;
        }
        return mo152561d().mo152616a(R.string.Mail_Folder_NameExists, new Pair[0]);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo152557a(String str, boolean z) {
        MailLabelEntity mailLabelEntity;
        if (z) {
            if (this.f107885l != null) {
                MailLabelEntity a = mo152561d().mo152615a(this.f107885l);
                if (a != null) {
                    str = C43374f.m172262c(a.mo151493B()) + "/" + str;
                }
            } else if (this.f107882h != null) {
                ArrayList arrayList = new ArrayList(this.f107882h.mo151493B());
                arrayList.remove(arrayList.size() - 1);
                arrayList.add(str);
                str = C43374f.m172262c(arrayList);
            }
        }
        List<MailLabelEntity> j = C43374f.m172264f().mo155122j();
        if (j != null) {
            for (MailLabelEntity mailLabelEntity2 : j) {
                if (mailLabelEntity2.mo151529m() && TextUtils.equals(mailLabelEntity2.mo151528l(), str)) {
                    return true;
                }
            }
        }
        List<MailLabelEntity> b = mo152561d().mo152619b().mo5927b();
        if (b != null) {
            for (int i = 0; i < b.size(); i++) {
                MailLabelEntity mailLabelEntity3 = b.get(i);
                if ((this.f107883i || ((mailLabelEntity = this.f107882h) != null && !mailLabelEntity.mo151527k().equals(mailLabelEntity3.mo151527k()))) && TextUtils.equals(str, C43374f.m172262c(mailLabelEntity3.mo151493B()))) {
                    return true;
                }
            }
        }
        return false;
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.fragment.app.FragmentActivity
    public void onActivityResult(int i, int i2, Intent intent) {
        String str;
        super.onActivityResult(i, i2, intent);
        String str2 = null;
        if (intent != null) {
            str = intent.getStringExtra("select_node_id");
        } else {
            str = null;
        }
        MailLabelEntity a = mo152561d().mo152615a(str);
        if (TextUtils.equals(str, "0")) {
            this.f107879e.setText(mo152563f());
        } else if (a == null || TextUtils.isEmpty(a.mo151528l())) {
            AbstractC42401a d = mo152561d();
            MailLabelEntity mailLabelEntity = this.f107882h;
            if (mailLabelEntity != null) {
                str2 = mailLabelEntity.mo151492A();
            }
            MailLabelEntity a2 = d.mo152615a(str2);
            if (a2 == null || TextUtils.isEmpty(a2.mo151528l())) {
                this.f107879e.setText(mo152563f());
            } else {
                this.f107879e.setText(a2.mo151528l());
            }
        } else {
            this.f107879e.setText(a.mo151528l());
        }
        this.f107885l = str;
        mo152560c(mo152567j());
    }
}
