package com.ss.android.lark.invitation.v2.feat.external.p2054a;

import android.app.Activity;
import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.Pair;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.component.ui.dialog.C25639g;
import com.larksuite.component.ui.dialog.DialogC25637f;
import com.larksuite.framework.utils.DeviceUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.contact.entity.mobile.util.ContactMobileUtils;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.inv.export.util.C40103e;
import com.ss.android.lark.inv.export.util.C40109h;
import com.ss.android.lark.inv.export.util.C40129q;
import com.ss.android.lark.inv.export.util.C40140u;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57783ah;
import com.ss.android.lark.utils.C57832h;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.utils.ViewUtils;
import com.ss.android.lark.widget.dialog.AbstractC58413a;
import com.ss.android.lark.widget.popwindow.DesktopPopupWindow;

/* renamed from: com.ss.android.lark.invitation.v2.feat.external.a.c */
public class C40205c extends AbstractC58413a<C40205c> {

    /* renamed from: a */
    public static final int f102145a = 2131296327;

    /* renamed from: A */
    private TextView f102146A;

    /* renamed from: B */
    private boolean f102147B;

    /* renamed from: C */
    private DesktopPopupWindow f102148C;

    /* renamed from: b */
    public AbstractC40215a f102149b;

    /* renamed from: c */
    public ApiUtils.AbstractC57748a<Boolean> f102150c;

    /* renamed from: d */
    public EditText f102151d;

    /* renamed from: e */
    public TextView f102152e;

    /* renamed from: f */
    public TextView f102153f;

    /* renamed from: g */
    public EditText f102154g;

    /* renamed from: h */
    public TextView f102155h;

    /* renamed from: i */
    public ImageView f102156i;

    /* renamed from: j */
    public boolean f102157j;

    /* renamed from: k */
    public boolean f102158k;

    /* renamed from: t */
    private String f102159t;

    /* renamed from: u */
    private String f102160u;

    /* renamed from: v */
    private boolean f102161v;

    /* renamed from: w */
    private RelativeLayout f102162w;

    /* renamed from: x */
    private LinearLayout f102163x;

    /* renamed from: y */
    private LinearLayout f102164y;

    /* renamed from: z */
    private LinearLayout f102165z;

    /* renamed from: com.ss.android.lark.invitation.v2.feat.external.a.c$a */
    public interface AbstractC40215a {
        /* renamed from: a */
        void mo145893a(String str, boolean z, boolean z2);
    }

    @Override // com.ss.android.lark.widget.dialog.AbstractC58413a
    /* renamed from: a */
    public int mo145866a() {
        return R.layout.inv_invite_external_search_drawer_dialog_nothing;
    }

    /* renamed from: e */
    public void mo145875e() {
        DesktopPopupWindow aVar = this.f102148C;
        if (aVar != null) {
            aVar.dismiss();
        }
    }

    /* renamed from: l */
    private void m159366l() {
        C57832h.m224490a(this.f102156i);
    }

    /* renamed from: k */
    private void m159365k() {
        this.f102155h.setVisibility(8);
        this.f102154g.setVisibility(0);
        this.f102156i.setEnabled(true);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.widget.dialog.AbstractC58413a
    /* renamed from: b */
    public void mo145872b() {
        if (DesktopUtil.m144307b()) {
            C40129q.m159107a(ViewUtils.m224141a(this.f143774l));
        } else {
            super.mo145872b();
        }
    }

    /* renamed from: h */
    private void m159362h() {
        m159366l();
        String replace = this.f102159t.replace(" ", "");
        if (this.f102161v) {
            m159363i();
        } else {
            m159360a(replace);
        }
        mo197761a(new Runnable() {
            /* class com.ss.android.lark.invitation.v2.feat.external.p2054a.C40205c.RunnableC402061 */

            public void run() {
                if (C40205c.this.f102150c != null) {
                    C40205c.this.f102150c.consume(Boolean.valueOf(C40205c.this.f102158k));
                }
            }
        });
    }

    /* renamed from: j */
    private void m159364j() {
        this.f102155h.setText(this.f102154g.getText());
        this.f102155h.setVisibility(0);
        this.f102154g.setVisibility(8);
        ViewUtils.m224145a((int) R.string.Lark_UserGrowth_InviteMemberInvalidPhone);
        this.f102156i.setEnabled(false);
    }

    /* renamed from: i */
    private void m159363i() {
        this.f102146A.setText(this.f102160u);
        this.f102164y.setVisibility(0);
        this.f102151d.addTextChangedListener(new TextWatcher() {
            /* class com.ss.android.lark.invitation.v2.feat.external.p2054a.C40205c.C402116 */

            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public void afterTextChanged(Editable editable) {
                C40205c.this.f102158k = true;
                if (TextUtils.isEmpty(editable)) {
                    C40205c.this.f102156i.setEnabled(false);
                } else {
                    C40205c.this.f102156i.setEnabled(true);
                }
            }
        });
        this.f102151d.setText(this.f102159t);
        this.f102151d.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            /* class com.ss.android.lark.invitation.v2.feat.external.p2054a.C40205c.View$OnFocusChangeListenerC402127 */

            public void onFocusChange(View view, boolean z) {
                if (z) {
                    if (C40205c.this.f102151d.getText().length() == 0) {
                        C40205c.this.f102156i.setEnabled(false);
                    } else {
                        C40205c.this.f102156i.setEnabled(true);
                    }
                    C40205c.this.f102151d.setVisibility(0);
                    C40205c.this.f102152e.setVisibility(8);
                    return;
                }
                C40205c.this.mo145873c();
            }
        });
        this.f102151d.post(new Runnable() {
            /* class com.ss.android.lark.invitation.v2.feat.external.p2054a.C40205c.RunnableC402138 */

            public void run() {
                C40129q.m159109a(C40205c.this.f102151d);
                C40205c.this.f102151d.setSelection(C40205c.this.f102151d.getText().length());
            }
        });
        this.f102151d.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            /* class com.ss.android.lark.invitation.v2.feat.external.p2054a.C40205c.C402149 */

            public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                if (i != 4) {
                    return false;
                }
                C40205c.this.f102156i.performClick();
                return true;
            }
        });
        this.f102152e.setOnTouchListener(new View.OnTouchListener() {
            /* class com.ss.android.lark.invitation.v2.feat.external.p2054a.C40205c.AnonymousClass10 */

            public boolean onTouch(View view, MotionEvent motionEvent) {
                C40205c.this.f102151d.setVisibility(0);
                C40205c.this.f102152e.setVisibility(8);
                C40129q.m159109a(C40205c.this.f102151d);
                return C40205c.this.f102151d.dispatchTouchEvent(motionEvent);
            }
        });
        this.f102156i.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.invitation.v2.feat.external.p2054a.C40205c.AnonymousClass11 */

            public void onClick(View view) {
                if (C40205c.this.f102151d.hasFocus()) {
                    C40205c.this.f102157j = true;
                    C40205c.this.mo145872b();
                } else if (C40205c.this.f102149b != null) {
                    C40205c.this.f102149b.mo145893a(C40205c.this.f102151d.getText().toString().replace(" ", ""), false, C40205c.this.f102158k);
                }
            }
        });
    }

    /* renamed from: m */
    private void m159367m() {
        this.f102162w = (RelativeLayout) mo197763b(R.id.iesnRootRl);
        this.f102163x = (LinearLayout) mo197763b(R.id.iesnContentLl);
        this.f102164y = (LinearLayout) mo197763b(R.id.iesnContentMailLl);
        this.f102151d = (EditText) mo197763b(R.id.iesnMailToEt);
        this.f102152e = (TextView) mo197763b(R.id.iesnMailToErrorTv);
        this.f102165z = (LinearLayout) mo197763b(R.id.iesnContentMobileLl);
        this.f102153f = (TextView) mo197763b(R.id.iesnCountryCodeTv);
        this.f102154g = (EditText) mo197763b(R.id.iesnMobileEt);
        this.f102155h = (TextView) mo197763b(R.id.iesnMobileErrorTv);
        this.f102146A = (TextView) mo197763b(R.id.iesnContentTv);
        this.f102156i = (ImageView) mo197763b(R.id.iesnSendIv);
    }

    /* renamed from: c */
    public void mo145873c() {
        if (this.f102151d.getText().length() == 0) {
            this.f102156i.setEnabled(false);
            return;
        }
        boolean z = true;
        if (!C40140u.m159138a((CharSequence) this.f102151d.getText().toString().replace(" ", ""))) {
            this.f102152e.setText(this.f102151d.getText());
            this.f102152e.setVisibility(0);
            this.f102151d.setVisibility(8);
            ViewUtils.m224145a((int) R.string.Lark_UserGrowth_InviteMemberInvalidEmail);
            this.f102156i.setEnabled(false);
            z = false;
        } else {
            this.f102152e.setVisibility(8);
            this.f102151d.setVisibility(0);
            this.f102156i.setEnabled(true);
        }
        if (z && this.f102157j) {
            this.f102157j = false;
            AbstractC40215a aVar = this.f102149b;
            if (aVar != null) {
                aVar.mo145893a(this.f102151d.getText().toString().replace(" ", ""), false, this.f102158k);
            }
        }
    }

    /* renamed from: n */
    private void m159368n() {
        View inflate = LayoutInflater.from(this.f143774l).inflate(mo145866a(), (ViewGroup) null);
        this.f102162w = (RelativeLayout) inflate.findViewById(R.id.iesnRootRl);
        this.f102163x = (LinearLayout) inflate.findViewById(R.id.iesnContentLl);
        this.f102164y = (LinearLayout) inflate.findViewById(R.id.iesnContentMailLl);
        this.f102151d = (EditText) inflate.findViewById(R.id.iesnMailToEt);
        this.f102152e = (TextView) inflate.findViewById(R.id.iesnMailToErrorTv);
        this.f102165z = (LinearLayout) inflate.findViewById(R.id.iesnContentMobileLl);
        this.f102153f = (TextView) inflate.findViewById(R.id.iesnCountryCodeTv);
        this.f102154g = (EditText) inflate.findViewById(R.id.iesnMobileEt);
        this.f102155h = (TextView) inflate.findViewById(R.id.iesnMobileErrorTv);
        this.f102146A = (TextView) inflate.findViewById(R.id.iesnContentTv);
        this.f102156i = (ImageView) inflate.findViewById(R.id.iesnSendIv);
        m159369o();
        ((ViewGroup) this.f102162w.getParent()).removeAllViews();
    }

    /* renamed from: o */
    private void m159369o() {
        if (DesktopUtil.m144307b()) {
            DesktopUtil.m144299a(this.f102153f, this.f102151d, this.f102154g, this.f102152e, this.f102155h);
            DesktopUtil.m144306b(this.f102146A);
            this.f102165z.getLayoutParams().height = UIHelper.dp2px(46.0f);
            this.f102164y.getLayoutParams().height = UIHelper.dp2px(46.0f);
            this.f102156i.getLayoutParams().width = UIHelper.dp2px(36.0f);
            this.f102156i.getLayoutParams().height = UIHelper.dp2px(36.0f);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f102146A.getLayoutParams();
            marginLayoutParams.setMargins(UIHelper.dp2px(16.0f), UIHelper.dp2px(10.0f), UIHelper.dp2px(16.0f), 0);
            this.f102146A.setLayoutParams(marginLayoutParams);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:26:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo145874d() {
        /*
        // Method dump skipped, instructions count: 139
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.invitation.v2.feat.external.p2054a.C40205c.mo145874d():void");
    }

    @Override // com.ss.android.lark.widget.dialog.AbstractC58413a
    /* renamed from: a */
    public C25639g mo145867a(C25639g gVar) {
        return gVar.mo89234b(1.0f);
    }

    @Override // com.ss.android.lark.widget.dialog.AbstractC58413a
    /* renamed from: c */
    public void mo145868c(DialogC25637f fVar) {
        if (fVar.getWindow() != null) {
            m159367m();
            m159362h();
            m159369o();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m159359a(C57783ah.C57786b bVar) {
        this.f102147B = false;
        if (bVar.mo196098b() != null) {
            String obj = bVar.mo196098b().toString();
            if (!this.f102153f.getText().toString().equals(obj)) {
                this.f102158k = true;
                this.f102153f.setText(obj);
            }
        }
        mo145874d();
        C57783ah.m224245a().mo196094b(f102145a);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m159361b(View view) {
        Activity a = ViewUtils.m224141a(this.f143774l);
        if (a != null) {
            this.f102147B = true;
            mo145872b();
            C40109h.m159017a(a);
            C57783ah.m224245a().mo196092a(f102145a, (C57783ah.AbstractC57787c) new C57783ah.AbstractC57787c() {
                /* class com.ss.android.lark.invitation.v2.feat.external.p2054a.$$Lambda$c$8PVlMu3gbB2sI43s6BXJCNxP70c */

                @Override // com.ss.android.lark.utils.C57783ah.AbstractC57787c
                public final void handleMessage(C57783ah.C57786b bVar) {
                    C40205c.lambda$8PVlMu3gbB2sI43s6BXJCNxP70c(C40205c.this, bVar);
                }
            });
        }
    }

    /* renamed from: a */
    public C40205c mo145871a(View view) {
        m159368n();
        m159362h();
        this.f102148C = new DesktopPopupWindow(this.f143774l, this.f102162w).mo199791a(324.0f).mo199793b(164.0f).mo199792a(view, 36.0f, BitmapDescriptorFactory.HUE_RED);
        return this;
    }

    /* renamed from: a */
    private void m159360a(String str) {
        this.f102146A.setText(this.f102160u);
        C40103e.m159005a(this.f102153f, new View.OnClickListener() {
            /* class com.ss.android.lark.invitation.v2.feat.external.p2054a.$$Lambda$c$SLMQFcAmaY1XCR4n4K8UYFAy0 */

            public final void onClick(View view) {
                C40205c.m270643lambda$SLMQFcAmaY1XCR4n4K8UYFAy0(C40205c.this, view);
            }
        });
        this.f102154g.addTextChangedListener(new TextWatcher() {
            /* class com.ss.android.lark.invitation.v2.feat.external.p2054a.C40205c.AnonymousClass12 */

            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public void afterTextChanged(Editable editable) {
                C40205c.this.f102158k = true;
                if (TextUtils.isEmpty(editable)) {
                    C40205c.this.f102156i.setEnabled(false);
                } else {
                    C40205c.this.f102156i.setEnabled(true);
                }
            }
        });
        this.f102165z.setVisibility(0);
        if (str.startsWith("+")) {
            Pair<Integer, String> a = ContactMobileUtils.m138433a(C40109h.m159018b(), str);
            TextView textView = this.f102153f;
            textView.setText("+" + a.first);
            this.f102154g.setText((CharSequence) a.second);
        } else {
            this.f102153f.setText(C40109h.m159016a());
            this.f102154g.setText(C40140u.m159137a(str));
        }
        this.f102154g.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            /* class com.ss.android.lark.invitation.v2.feat.external.p2054a.C40205c.AnonymousClass13 */

            public void onFocusChange(View view, boolean z) {
                if (z) {
                    if (C40205c.this.f102154g.getText().length() == 0) {
                        C40205c.this.f102156i.setEnabled(false);
                    } else {
                        C40205c.this.f102156i.setEnabled(true);
                    }
                    C40205c.this.f102154g.setVisibility(0);
                    C40205c.this.f102155h.setVisibility(8);
                } else if (!DesktopUtil.m144307b()) {
                    C40205c.this.mo145874d();
                }
            }
        });
        this.f102154g.post(new Runnable() {
            /* class com.ss.android.lark.invitation.v2.feat.external.p2054a.C40205c.RunnableC402072 */

            public void run() {
                C40129q.m159109a(C40205c.this.f102154g);
                C40205c.this.f102154g.setSelection(C40205c.this.f102154g.getText().length());
            }
        });
        this.f102154g.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            /* class com.ss.android.lark.invitation.v2.feat.external.p2054a.C40205c.C402083 */

            public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                if (i != 4) {
                    return false;
                }
                C40205c.this.f102156i.performClick();
                return true;
            }
        });
        this.f102155h.setOnTouchListener(new View.OnTouchListener() {
            /* class com.ss.android.lark.invitation.v2.feat.external.p2054a.C40205c.View$OnTouchListenerC402094 */

            public boolean onTouch(View view, MotionEvent motionEvent) {
                C40205c.this.f102154g.setVisibility(0);
                C40205c.this.f102155h.setVisibility(8);
                C40129q.m159109a(C40205c.this.f102154g);
                return C40205c.this.f102154g.dispatchTouchEvent(motionEvent);
            }
        });
        this.f102156i.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.invitation.v2.feat.external.p2054a.C40205c.View$OnClickListenerC402105 */

            public void onClick(View view) {
                if (!DesktopUtil.m144307b() && C40205c.this.f102154g.hasFocus()) {
                    C40205c.this.f102157j = true;
                    C40205c.this.mo145872b();
                } else if (C40205c.this.f102149b != null) {
                    AbstractC40215a aVar = C40205c.this.f102149b;
                    aVar.mo145893a(((Object) C40205c.this.f102153f.getText()) + C40140u.m159137a(C40205c.this.f102154g.getText().toString()), true, C40205c.this.f102158k);
                }
            }
        });
    }

    public C40205c(Context context, String str, String str2, AbstractC40215a aVar, ApiUtils.AbstractC57748a<Boolean> aVar2) {
        this(context, str, str2, str.contains("@"), aVar, aVar2);
    }

    public C40205c(Context context, String str, String str2, boolean z, AbstractC40215a aVar, ApiUtils.AbstractC57748a<Boolean> aVar2) {
        super(context);
        int i;
        this.f102159t = str;
        this.f102160u = str2;
        this.f102149b = aVar;
        this.f102150c = aVar2;
        this.f102161v = z;
        if (DesktopUtil.m144307b()) {
            i = UIHelper.dp2px(560.0f);
        } else {
            i = DeviceUtils.getScreenHeight(context);
        }
        ((C40205c) mo197764b(true)).mo197760a(i - UIHelper.dp2px(64.0f));
    }
}
