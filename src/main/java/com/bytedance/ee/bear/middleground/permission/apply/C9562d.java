package com.bytedance.ee.bear.middleground.permission.apply;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.bytedance.ee.bear.basesdk.C4484g;
import com.bytedance.ee.bear.contract.AccountService;
import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.contract.an;
import com.bytedance.ee.bear.facade.common.C7667e;
import com.bytedance.ee.bear.facade.common.widget.Toast;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.middleground.permission.C9897d;
import com.bytedance.ee.bear.middleground.permission.PermissionAnalyticV2;
import com.bytedance.ee.bear.middleground.permission.util.NotNotifyOperator;
import com.bytedance.ee.bear.p522q.C10539a;
import com.bytedance.ee.bear.p522q.p523a.C10548d;
import com.bytedance.ee.bear.widgets.BaseTitleBar;
import com.bytedance.ee.bear.widgets.C11811a;
import com.bytedance.ee.bear.widgets.p567a.C11816b;
import com.bytedance.ee.bear.widgets.universedesign.SpaceEditText;
import com.bytedance.ee.bear.widgets.universedesign.SpaceEmptyState;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p705h.C13666a;
import com.larksuite.suite.R;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.middleground.permission.apply.d */
public class C9562d extends C7667e {

    /* renamed from: b */
    static final /* synthetic */ boolean f25663b = true;

    /* renamed from: a */
    protected View f25664a;

    /* renamed from: c */
    private int f25665c = 1;

    /* renamed from: d */
    private TextView f25666d;

    /* renamed from: e */
    private TextView f25667e;

    /* renamed from: f */
    private SpaceEditText f25668f;

    /* renamed from: g */
    private BaseTitleBar f25669g;

    /* renamed from: h */
    private boolean f25670h;

    /* renamed from: i */
    private String f25671i = "";

    /* renamed from: j */
    private String f25672j;

    /* renamed from: k */
    private boolean f25673k;

    /* renamed from: l */
    private boolean f25674l = f25663b;

    /* renamed from: m */
    private String f25675m;

    /* renamed from: n */
    private C9560b f25676n;

    /* renamed from: o */
    private Disposable f25677o;

    /* renamed from: p */
    private String f25678p;

    /* renamed from: q */
    private String f25679q;

    /* renamed from: r */
    private SpaceEmptyState f25680r;

    /* renamed from: s */
    private boolean f25681s;

    /* renamed from: t */
    private String f25682t = "";

    /* renamed from: u */
    private boolean f25683u;

    /* renamed from: v */
    private boolean f25684v;

    /* renamed from: w */
    private String f25685w = "";

    /* renamed from: x */
    private String f25686x = "";

    /* renamed from: y */
    private String f25687y = "";

    /* renamed from: f */
    private void m39509f() {
        this.f25666d.setOnClickListener(new View.OnClickListener() {
            /* class com.bytedance.ee.bear.middleground.permission.apply.$$Lambda$d$15ToG6Gj7nin93zS5a2sU5P6o */

            public final void onClick(View view) {
                C9562d.this.m39507d(view);
            }
        });
        this.f25667e.setOnClickListener(new View.OnClickListener() {
            /* class com.bytedance.ee.bear.middleground.permission.apply.$$Lambda$d$GGPwTsWsAlJDHgkuoZ96BvrC8Xg */

            public final void onClick(View view) {
                C9562d.this.m39505c((C9562d) view);
            }
        });
    }

    @Override // com.bytedance.ee.bear.facade.common.C7718l, androidx.fragment.app.Fragment, com.bytedance.ee.bear.facade.common.C7667e
    public void onDestroy() {
        super.onDestroy();
        Disposable disposable = this.f25677o;
        if (disposable != null && !disposable.isDisposed()) {
            this.f25677o.dispose();
        }
    }

    /* renamed from: c */
    private void m39504c() {
        float dimension = (getResources().getDimension(R.dimen.ud_emptystate_padding_horizontal) * 2.0f) + getResources().getDimension(R.dimen.space_no_permission_max_width);
        ViewGroup.LayoutParams layoutParams = this.f25680r.getLayoutParams();
        layoutParams.width = (int) dimension;
        this.f25680r.setLayoutParams(layoutParams);
    }

    /* renamed from: b */
    private Spanned m39502b() {
        String str;
        AccountService.Account f = ((an) KoinJavaComponent.m268610a(an.class)).mo16408f();
        if (f == null) {
            C13479a.m54758a("NoPermissionDialogFragment", "getOwnerText()...account is null");
            return null;
        }
        String a = C13666a.m55443a(C4484g.m18494b().mo17252c(), f.f14595l, f.f14596m);
        if (f.mo19681c()) {
            str = getString(R.string.Doc_Permission_PersonalAccount);
        } else {
            str = f.f14593j;
        }
        Context context = getContext();
        return Html.fromHtml(C10539a.m43639a(context, R.string.Doc_Permission_CurrentUserCannotAccess, "user", C9561c.m39496a(a + "(" + str + ")")));
    }

    /* renamed from: e */
    private void m39508e() {
        String str;
        BaseTitleBar baseTitleBar = (BaseTitleBar) this.f25664a.findViewById(R.id.permission_title_bar);
        this.f25669g = baseTitleBar;
        baseTitleBar.setLeftIconVisibility(this.f25674l);
        this.f25669g.setLeftClickListener(new View.OnClickListener() {
            /* class com.bytedance.ee.bear.middleground.permission.apply.C9562d.View$OnClickListenerC95631 */

            public void onClick(View view) {
                C9562d.this.mo36616a();
            }
        });
        if (TextUtils.isEmpty(this.f25679q)) {
            if (this.f25673k) {
                str = getResources().getString(R.string.Doc_Facade_CreateFolder);
            } else {
                str = getResources().getString(R.string.Doc_Facade_DefaultTitle);
            }
            this.f25679q = str;
        }
        this.f25669g.setTitle(this.f25679q);
    }

    /* renamed from: d */
    private void m39506d() {
        String str;
        this.f25666d = (TextView) this.f25664a.findViewById(R.id.permission_type);
        this.f25667e = (TextView) this.f25664a.findViewById(R.id.send_request);
        this.f25668f = (SpaceEditText) this.f25664a.findViewById(R.id.edit_optional);
        this.f25680r = (SpaceEmptyState) this.f25664a.findViewById(R.id.empty_state);
        Drawable drawable = getResources().getDrawable(R.drawable.ic_right_arrow);
        drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
        TextView textView = this.f25666d;
        if (this.f25673k) {
            drawable = null;
        }
        textView.setCompoundDrawables(null, null, drawable, null);
        this.f25680r.setDesc(C10539a.m43639a(getContext(), R.string.Doc_More_Owner, "owner", this.f25675m));
        m39508e();
        TextView textView2 = this.f25666d;
        if (!this.f25673k || this.f25681s) {
            str = getResources().getString(R.string.Doc_Facade_ReadPermission);
        } else {
            str = getResources().getString(R.string.Doc_Facade_Member);
        }
        textView2.setText(str);
    }

    /* renamed from: g */
    private void m39510g() {
        boolean z;
        int i = this.f25665c;
        int b = C9897d.m41199b(this.f25681s);
        boolean z2 = f25663b;
        if (i == b) {
            z = f25663b;
        } else {
            z = false;
        }
        if (this.f25665c != C9897d.m41198a(this.f25681s)) {
            z2 = false;
        }
        C11811a.m48976a(getActivity()).mo45219a(C11816b.m49006a().mo45254a((CharSequence) getContext().getString(R.string.Doc_Facade_ReadPermission)).mo45251a(m39497a(z)).mo45253a(new View.OnClickListener() {
            /* class com.bytedance.ee.bear.middleground.permission.apply.$$Lambda$d$QTnZ0QG4oAgYd9mKrRIvCnVo1A */

            public final void onClick(View view) {
                C9562d.this.m39503b(view);
            }
        }).mo45257a()).mo45219a(C11816b.m49006a().mo45254a((CharSequence) getContext().getString(R.string.Doc_Facade_EditPermission)).mo45251a(m39497a(z2)).mo45253a(new View.OnClickListener() {
            /* class com.bytedance.ee.bear.middleground.permission.apply.$$Lambda$d$BHbnPaU1JRW97HkzX7muJygb8JM */

            public final void onClick(View view) {
                C9562d.this.m39499a((C9562d) view);
            }
        }).mo45257a()).mo45213a().mo45231c();
    }

    /* renamed from: a */
    public void mo36616a() {
        if (this.f25670h) {
            PermissionAnalyticV2.m39657c(this.f25671i, C8275a.m34051b(this.f25672j), this.f25682t, this.f25683u, this.f25684v, this.f25685w, this.f25686x, this.f25687y);
        } else {
            PermissionAnalyticV2.m39667d(this.f25671i, C8275a.m34051b(this.f25672j), this.f25682t, this.f25683u, this.f25684v, this.f25685w, this.f25686x, this.f25687y);
        }
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ void m39507d(View view) {
        if (!this.f25673k || this.f25681s) {
            m39510g();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m39499a(View view) {
        this.f25666d.setText(getResources().getString(R.string.Doc_Facade_EditPermission));
        this.f25665c = C9897d.m41198a(this.f25681s);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m39503b(View view) {
        this.f25666d.setText(getResources().getString(R.string.Doc_Facade_ReadPermission));
        this.f25665c = C9897d.m41199b(this.f25681s);
    }

    /* renamed from: a */
    private int m39497a(boolean z) {
        return z ? getContext().getResources().getColor(R.color.primary_pri_500) : getContext().getResources().getColor(R.color.text_title);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m39505c(View view) {
        String obj = this.f25668f.getText().toString();
        this.f25677o = this.f25676n.mo36615a(this.f25673k, obj, this.f25665c).mo238001b(new Consumer() {
            /* class com.bytedance.ee.bear.middleground.permission.apply.$$Lambda$d$FPf8Do2SA8F0t_y5BoQjiDBuKJ4 */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C9562d.this.m39500a((C9562d) ((NetService.Result) obj));
            }
        }, new Consumer() {
            /* class com.bytedance.ee.bear.middleground.permission.apply.$$Lambda$d$LpEKKnSfu45H4rtARPYps9i2Rc */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C9562d.this.m39501a((C9562d) ((Throwable) obj));
            }
        });
        C10548d.m43697a(view);
        PermissionAnalyticV2.m39620a(this.f25671i, C8275a.m34051b(this.f25672j), this.f25682t, this.f25683u, this.f25684v, this.f25685w, this.f25686x, this.f25687y, this.f25665c, obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m39500a(NetService.Result result) throws Exception {
        if (!isAdded()) {
            return;
        }
        if (result.code == 0) {
            Toast.showSuccessText(getContext(), getString(R.string.Doc_Facade_SendRequestSuccessfully), 0);
        } else {
            Toast.showFailureText(getContext(), getString(R.string.Doc_Facade_SendRequestFailed), 0);
        }
    }

    @Override // com.bytedance.ee.bear.facade.common.C7718l, androidx.fragment.app.Fragment, com.bytedance.ee.bear.facade.common.C7667e
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f25670h = arguments.getBoolean("CAN_APPLY");
            this.f25671i = arguments.getString("TOKEN", "");
            this.f25672j = arguments.getString("DOCUMENT_TYPE", "");
            this.f25675m = arguments.getString("OWNER_NAME", "");
            this.f25678p = arguments.getString("TIP_TEXT", "");
            this.f25679q = arguments.getString("TITLE", "");
            this.f25673k = arguments.getBoolean("IS_FOLDER");
            this.f25674l = arguments.getBoolean("SHOW_BACK", f25663b);
            this.f25682t = arguments.getString("SUB_TYPE", "");
            this.f25683u = arguments.getBoolean("FROM_VC", false);
            this.f25684v = arguments.getBoolean("IS_WIKI", false);
            this.f25685w = arguments.getString("MODULE", "");
            this.f25686x = arguments.getString("USER_PERM", "");
            this.f25687y = arguments.getString("PUBLIC_PERM", "");
            this.f25681s = arguments.getBoolean("IS_SHARE_FOLDER_V2", false);
        }
        this.f25676n = new C9560b((NetService) KoinJavaComponent.m268610a(NetService.class), this.f25671i, this.f25672j, this.f25681s);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m39501a(Throwable th) throws Exception {
        C13479a.m54765b("NoPermissionDialogFragment", "send folder permission request failed", th);
        if (!isAdded()) {
            return;
        }
        if (f25663b || getContext() != null) {
            NotNotifyOperator.m41298a(getContext(), th, this.f25675m, this.f25671i, this.f25672j);
            return;
        }
        throw new AssertionError();
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (this.f25670h) {
            this.f25664a = layoutInflater.inflate(R.layout.no_permission, viewGroup, false);
            m39506d();
            m39509f();
            PermissionAnalyticV2.m39619a(this.f25671i, C8275a.m34051b(this.f25672j), this.f25682t, this.f25683u, this.f25684v, this.f25685w, this.f25686x, this.f25687y);
        } else {
            View inflate = layoutInflater.inflate(R.layout.forbidden_permission, viewGroup, false);
            this.f25664a = inflate;
            this.f25680r = (SpaceEmptyState) inflate.findViewById(R.id.empty_state);
            if (!TextUtils.isEmpty(m39502b())) {
                this.f25680r.setDesc(m39502b());
            }
            m39508e();
            PermissionAnalyticV2.m39647b(this.f25671i, C8275a.m34051b(this.f25672j), this.f25682t, this.f25683u, this.f25684v, this.f25685w, this.f25686x, this.f25687y);
        }
        this.f25680r.setTitle(this.f25678p);
        m39504c();
        return this.f25664a;
    }

    /* renamed from: a */
    static C9562d m39498a(String str, String str2, String str3, boolean z, String str4, String str5, boolean z2, boolean z3, String str6, boolean z4, boolean z5, String str7, String str8, String str9, boolean z6) {
        C9562d dVar = new C9562d();
        Bundle bundle = new Bundle();
        bundle.putString("TOKEN", str);
        bundle.putString("DOCUMENT_TYPE", str2);
        bundle.putString("OWNER_NAME", str3);
        bundle.putString("TIP_TEXT", str4);
        bundle.putString("TITLE", str5);
        bundle.putBoolean("IS_FOLDER", z);
        bundle.putBoolean("CAN_APPLY", z2);
        bundle.putBoolean("SHOW_BACK", z3);
        bundle.putString("SUB_TYPE", str6);
        bundle.putBoolean("FROM_VC", z4);
        bundle.putBoolean("IS_WIKI", z5);
        bundle.putString("MODULE", str7);
        bundle.putString("USER_PERM", str8);
        bundle.putString("PUBLIC_PERM", str9);
        bundle.putBoolean("IS_SHARE_FOLDER_V2", z6);
        dVar.setArguments(bundle);
        return dVar;
    }
}
