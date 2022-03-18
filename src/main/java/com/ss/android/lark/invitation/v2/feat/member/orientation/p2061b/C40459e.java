package com.ss.android.lark.invitation.v2.feat.member.orientation.p2061b;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.larksuite.component.ui.dialog.DialogC25637f;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.component.universe_design.button.C25717e;
import com.larksuite.component.universe_design.button.ProgressParams;
import com.larksuite.component.universe_design.button.UDButton;
import com.larksuite.component.universe_design.color.UDColorUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.inv.export.util.C40103e;
import com.ss.android.lark.inv.export.util.C40109h;
import com.ss.android.lark.inv.export.util.C40129q;
import com.ss.android.lark.inv.export.util.C40140u;
import com.ss.android.lark.invitation.v2.feat.member.common.C40341d;
import com.ss.android.lark.invitation.v2.feat.member.contact.C40351a;
import com.ss.android.lark.invitation.v2.feat.member.contact.InviteMemberContactActivity;
import com.ss.android.lark.invitation.v2.feat.member.orientation.InviteMemberOrientationActivity;
import com.ss.android.lark.invitation.v2.feat.member.orientation.p2061b.AbstractC40449a;
import com.ss.android.lark.invitation.v2.statistic.InvHitPoint;
import com.ss.android.lark.utils.C57783ah;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.utils.ViewUtils;

/* renamed from: com.ss.android.lark.invitation.v2.feat.member.orientation.b.e */
public class C40459e implements AbstractC40449a.AbstractC40451b {

    /* renamed from: a */
    public static final int f102761a = 2131296327;

    /* renamed from: b */
    public String f102762b;

    /* renamed from: c */
    public String f102763c;

    /* renamed from: d */
    public AbstractC40449a.AbstractC40451b.AbstractC40452a f102764d;

    /* renamed from: e */
    public InviteMemberOrientationActivity f102765e;

    /* renamed from: f */
    public LinearLayout f102766f;

    /* renamed from: g */
    public TextView f102767g;

    /* renamed from: h */
    public EditText f102768h;

    /* renamed from: i */
    public ImageButton f102769i;

    /* renamed from: j */
    public TextView f102770j;

    /* renamed from: k */
    public LinearLayout f102771k;

    /* renamed from: l */
    public EditText f102772l;

    /* renamed from: m */
    public ImageButton f102773m;

    /* renamed from: n */
    public TextView f102774n;

    /* renamed from: o */
    public UDButton f102775o;

    /* renamed from: p */
    private View f102776p;

    /* renamed from: q */
    private EditText f102777q;

    /* renamed from: r */
    private LinearLayout f102778r;

    /* renamed from: s */
    private LinearLayout f102779s;

    /* renamed from: t */
    private TextView f102780t;

    /* renamed from: u */
    private C40341d f102781u;

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        m160170k();
    }

    /* renamed from: o */
    private void m160174o() {
        C40103e.m159005a(this.f102780t, new View.OnClickListener() {
            /* class com.ss.android.lark.invitation.v2.feat.member.orientation.p2061b.C40459e.View$OnClickListenerC404645 */

            public void onClick(View view) {
                C40459e.this.mo146470c();
                InviteMemberContactActivity.m159903a(C40459e.this.f102765e, false, C40459e.this.f102762b, C40459e.this.f102763c, "add_by_phone");
            }
        });
    }

    /* renamed from: c */
    public void mo146470c() {
        this.f102776p.clearFocus();
        C40129q.m159107a(this.f102765e);
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        C57783ah.m224245a().mo196094b(f102761a);
        C40351a.m159930a(false);
    }

    /* renamed from: n */
    private void m160173n() {
        this.f102772l.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            /* class com.ss.android.lark.invitation.v2.feat.member.orientation.p2061b.C40459e.View$OnFocusChangeListenerC404612 */

            public void onFocusChange(View view, boolean z) {
                if (z) {
                    C40459e.this.f102774n.setVisibility(8);
                    C40459e.this.f102771k.setBackgroundResource(R.drawable.inv_invite_member_input_focused_bg);
                    if (C40459e.this.f102772l.getText().length() > 0) {
                        C40459e.this.f102773m.setVisibility(0);
                    }
                    InvHitPoint.m160379e(C40459e.this.f102762b);
                    return;
                }
                C40459e.this.mo146474g();
                C40459e.this.f102773m.setVisibility(8);
            }
        });
        this.f102772l.addTextChangedListener(new TextWatcher() {
            /* class com.ss.android.lark.invitation.v2.feat.member.orientation.p2061b.C40459e.C404623 */

            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public void afterTextChanged(Editable editable) {
                if (editable.toString().length() <= 0) {
                    C40459e.this.f102773m.setVisibility(8);
                } else if (C40459e.this.f102772l.hasFocus()) {
                    C40459e.this.f102773m.setVisibility(0);
                }
                C40459e.this.mo146476i();
            }
        });
        this.f102773m.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.invitation.v2.feat.member.orientation.p2061b.C40459e.View$OnClickListenerC404634 */

            public void onClick(View view) {
                C40459e.this.f102772l.setText("");
            }
        });
    }

    @Override // com.ss.android.lark.invitation.v2.feat.member.orientation.p2061b.AbstractC40449a.AbstractC40451b
    /* renamed from: b */
    public void mo146463b() {
        ViewUtils.m224146a(this.f102776p, true);
        C25717e.m92484a(this.f102775o, (int) R.string.Lark_Invitation_AddMembersSendInvitation);
        this.f102775o.setBackgroundColor(UDColorUtils.getColorStateList(this.f102765e, R.color.ud_button_blue_bg));
    }

    /* renamed from: h */
    public boolean mo146475h() {
        if (this.f102772l.getText().toString().trim().length() > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    public void mo146476i() {
        if (!mo146473f() || !mo146475h()) {
            this.f102775o.setEnabled(false);
        } else {
            this.f102775o.setEnabled(true);
        }
    }

    /* renamed from: l */
    private void m160171l() {
        m160172m();
        this.f102768h.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            /* class com.ss.android.lark.invitation.v2.feat.member.orientation.p2061b.C40459e.View$OnFocusChangeListenerC404689 */

            public void onFocusChange(View view, boolean z) {
                if (z) {
                    C40459e.this.f102770j.setVisibility(8);
                    C40459e.this.f102766f.setBackgroundResource(R.drawable.inv_invite_member_input_focused_bg);
                    if (C40459e.this.f102768h.getText().length() > 0) {
                        C40459e.this.f102769i.setVisibility(0);
                        return;
                    }
                    return;
                }
                C40459e.this.mo146471d();
                C40459e.this.f102769i.setVisibility(8);
            }
        });
        this.f102768h.addTextChangedListener(new TextWatcher() {
            /* class com.ss.android.lark.invitation.v2.feat.member.orientation.p2061b.C40459e.AnonymousClass10 */

            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public void afterTextChanged(Editable editable) {
                if (editable.toString().length() <= 0) {
                    C40459e.this.f102769i.setVisibility(8);
                } else if (C40459e.this.f102768h.hasFocus()) {
                    C40459e.this.f102769i.setVisibility(0);
                }
                C40459e.this.mo146476i();
            }
        });
        this.f102769i.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.invitation.v2.feat.member.orientation.p2061b.C40459e.AnonymousClass11 */

            public void onClick(View view) {
                C40459e.this.f102768h.setText("");
            }
        });
    }

    /* renamed from: m */
    private void m160172m() {
        C57783ah.m224245a().mo196092a(f102761a, (C57783ah.AbstractC57787c) new C57783ah.AbstractC57787c() {
            /* class com.ss.android.lark.invitation.v2.feat.member.orientation.p2061b.C40459e.AnonymousClass12 */

            @Override // com.ss.android.lark.utils.C57783ah.AbstractC57787c
            public void handleMessage(C57783ah.C57786b bVar) {
                if (bVar.mo196098b() != null) {
                    String obj = bVar.mo196098b().toString();
                    if (!C40459e.this.f102767g.getText().toString().equals(obj)) {
                        C40459e.this.f102767g.setText(obj);
                    }
                }
                C40459e.this.mo146471d();
            }
        });
        this.f102779s.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.invitation.v2.feat.member.orientation.p2061b.C40459e.AnonymousClass13 */

            public void onClick(View view) {
                C40459e.this.mo146470c();
                C40109h.m159017a(C40459e.this.f102765e);
            }
        });
        this.f102767g.setText(C40109h.m159016a());
    }

    @Override // com.ss.android.lark.invitation.v2.feat.member.orientation.p2061b.AbstractC40449a.AbstractC40451b
    /* renamed from: a */
    public void mo146460a() {
        ViewUtils.m224146a(this.f102776p, false);
        ProgressParams dVar = new ProgressParams();
        dVar.mo90339d(Integer.valueOf((int) R.color.static_white));
        dVar.mo90321a(Integer.valueOf((int) R.string.Lark_Invitation_AddMembersSendInvitation));
        C25717e.m92489a(this.f102775o, dVar);
        this.f102775o.setBackgroundColor(UDColorUtils.getColor(this.f102765e, R.color.primary_pri_300));
    }

    /* renamed from: d */
    public void mo146471d() {
        if (mo146473f() || this.f102768h.getText().length() == 0) {
            this.f102766f.setBackgroundResource(R.drawable.inv_invite_member_input_normal_bg);
            this.f102770j.setVisibility(8);
        } else {
            mo146461a(UIHelper.getString(R.string.Lark_UserGrowth_InviteMemberInvalidPhone));
        }
        mo146476i();
    }

    /* renamed from: e */
    public String mo146472e() {
        return ((Object) this.f102767g.getText()) + C40140u.m159137a(this.f102768h.getText().toString());
    }

    /* renamed from: f */
    public boolean mo146473f() {
        String a = C40140u.m159137a(this.f102768h.getText().toString());
        if ("+86".equals(this.f102767g.getText().toString())) {
            return C40140u.m159142c(a);
        }
        return C40140u.m159140b((CharSequence) a);
    }

    /* renamed from: g */
    public void mo146474g() {
        if (mo146475h() || this.f102772l.getText().length() == 0) {
            this.f102771k.setBackgroundResource(R.drawable.inv_invite_member_input_normal_bg);
            this.f102774n.setVisibility(8);
        } else {
            mo146464b(UIHelper.getString(R.string.Lark_Invitation_AddMembersNameCantEmpty));
        }
        mo146476i();
    }

    /* renamed from: j */
    public void mo146477j() {
        mo146470c();
        this.f102767g.setText(C40109h.m159016a());
        this.f102768h.setText("");
        this.f102772l.setText("");
        this.f102775o.setEnabled(false);
        this.f102766f.setBackgroundResource(R.drawable.inv_invite_member_input_normal_bg);
        this.f102770j.setVisibility(8);
        this.f102771k.setBackgroundResource(R.drawable.inv_invite_member_input_normal_bg);
        this.f102774n.setVisibility(8);
    }

    /* renamed from: k */
    private void m160170k() {
        this.f102777q = (EditText) this.f102776p.findViewById(R.id.immFocusEt);
        this.f102778r = (LinearLayout) this.f102776p.findViewById(R.id.immBlankAreaLl);
        this.f102766f = (LinearLayout) this.f102776p.findViewById(R.id.immMobileLl);
        this.f102779s = (LinearLayout) this.f102776p.findViewById(R.id.immCountryCodeLl);
        this.f102767g = (TextView) this.f102776p.findViewById(R.id.immCountryCodeTv);
        this.f102768h = (EditText) this.f102776p.findViewById(R.id.immMobileInputEt);
        this.f102769i = (ImageButton) this.f102776p.findViewById(R.id.immMobileClearIb);
        this.f102770j = (TextView) this.f102776p.findViewById(R.id.immMobileErrorTv);
        this.f102771k = (LinearLayout) this.f102776p.findViewById(R.id.immNameLl);
        this.f102772l = (EditText) this.f102776p.findViewById(R.id.immNameInputEt);
        this.f102773m = (ImageButton) this.f102776p.findViewById(R.id.immNameClearIb);
        this.f102774n = (TextView) this.f102776p.findViewById(R.id.immNameErrorTv);
        this.f102780t = (TextView) this.f102776p.findViewById(R.id.immImportContactTv);
        this.f102775o = (UDButton) this.f102776p.findViewById(R.id.immInviteMembersBtn);
        this.f102778r.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.invitation.v2.feat.member.orientation.p2061b.C40459e.View$OnClickListenerC404667 */

            public void onClick(View view) {
                C40459e.this.mo146470c();
            }
        });
        m160171l();
        m160173n();
        m160174o();
        this.f102775o.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.invitation.v2.feat.member.orientation.p2061b.C40459e.View$OnClickListenerC404678 */

            public void onClick(View view) {
                C40459e.this.mo146470c();
                if (!C40459e.this.mo146473f() || !C40459e.this.mo146475h()) {
                    C40459e.this.f102775o.setEnabled(false);
                } else {
                    C40459e.this.f102764d.mo146466a(C40459e.this.mo146472e(), C40459e.this.f102772l.getText().toString());
                }
                InvHitPoint.m160365b(C40459e.this.f102762b);
            }
        });
        this.f102775o.setEnabled(false);
        DesktopUtil.m144299a(this.f102767g, this.f102768h, this.f102772l, (TextView) this.f102776p.findViewById(R.id.immInviteMembersBtn), this.f102780t);
    }

    /* renamed from: a */
    public void setViewDelegate(AbstractC40449a.AbstractC40451b.AbstractC40452a aVar) {
        this.f102764d = aVar;
    }

    @Override // com.ss.android.lark.invitation.v2.feat.member.orientation.p2061b.AbstractC40449a.AbstractC40451b
    /* renamed from: c */
    public void mo146465c(String str) {
        LKUIToast.show(this.f102765e, str, 3500);
    }

    @Override // com.ss.android.lark.invitation.v2.feat.member.orientation.p2061b.AbstractC40449a.AbstractC40451b
    /* renamed from: a */
    public void mo146461a(String str) {
        this.f102766f.setBackgroundResource(R.drawable.inv_invite_member_input_error_bg);
        this.f102770j.setText(str);
        this.f102770j.setVisibility(0);
        this.f102775o.setEnabled(false);
    }

    @Override // com.ss.android.lark.invitation.v2.feat.member.orientation.p2061b.AbstractC40449a.AbstractC40451b
    /* renamed from: b */
    public void mo146464b(String str) {
        this.f102771k.setBackgroundResource(R.drawable.inv_invite_member_input_error_bg);
        this.f102774n.setText(str);
        this.f102774n.setVisibility(0);
        this.f102775o.setEnabled(false);
    }

    @Override // com.ss.android.lark.invitation.v2.feat.member.orientation.p2061b.AbstractC40449a.AbstractC40451b
    /* renamed from: a */
    public void mo146462a(final boolean z) {
        C40341d a = C40341d.m159898a(this.f102765e, z, false, new DialogC25637f.AbstractC25638a() {
            /* class com.ss.android.lark.invitation.v2.feat.member.orientation.p2061b.C40459e.C404601 */

            @Override // com.larksuite.component.ui.dialog.DialogC25637f.AbstractC25638a
            public void onClick(DialogC25637f fVar, int i) {
                C40459e.this.f102765e.mo146221a("invite_finish");
                C40459e.this.f102765e.finish();
                if (z) {
                    InvHitPoint.m160415w(C40459e.this.f102762b);
                } else {
                    InvHitPoint.m160409t(C40459e.this.f102762b);
                }
            }
        }, new DialogC25637f.AbstractC25638a() {
            /* class com.ss.android.lark.invitation.v2.feat.member.orientation.p2061b.C40459e.C404656 */

            @Override // com.larksuite.component.ui.dialog.DialogC25637f.AbstractC25638a
            public void onClick(DialogC25637f fVar, int i) {
                C40459e.this.mo146477j();
                fVar.dismiss();
                if (z) {
                    InvHitPoint.m160417x(C40459e.this.f102762b);
                } else {
                    InvHitPoint.m160411u(C40459e.this.f102762b);
                }
            }
        });
        this.f102781u = a;
        a.mo146231a();
        if (z) {
            InvHitPoint.m160413v(this.f102762b);
        } else {
            InvHitPoint.m160407s(this.f102762b);
        }
    }

    public C40459e(C40453b bVar, String str, String str2) {
        this.f102762b = str;
        this.f102763c = str2;
        this.f102765e = (InviteMemberOrientationActivity) bVar.getActivity();
        this.f102776p = bVar.getView();
    }
}
