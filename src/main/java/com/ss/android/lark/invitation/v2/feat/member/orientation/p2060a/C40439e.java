package com.ss.android.lark.invitation.v2.feat.member.orientation.p2060a;

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
import com.ss.android.lark.inv.export.util.C40129q;
import com.ss.android.lark.inv.export.util.C40140u;
import com.ss.android.lark.invitation.v2.feat.member.common.C40341d;
import com.ss.android.lark.invitation.v2.feat.member.contact.C40351a;
import com.ss.android.lark.invitation.v2.feat.member.contact.InviteMemberContactActivity;
import com.ss.android.lark.invitation.v2.feat.member.orientation.InviteMemberOrientationActivity;
import com.ss.android.lark.invitation.v2.feat.member.orientation.p2060a.AbstractC40429a;
import com.ss.android.lark.invitation.v2.statistic.InvHitPoint;
import com.ss.android.lark.utils.C57783ah;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.utils.ViewUtils;

/* renamed from: com.ss.android.lark.invitation.v2.feat.member.orientation.a.e */
public class C40439e implements AbstractC40429a.AbstractC40431b {

    /* renamed from: a */
    public static final int UiMessageContactEmail = 2131296323;

    /* renamed from: b */
    public String f102723b;

    /* renamed from: c */
    public String f102724c;

    /* renamed from: d */
    public AbstractC40429a.AbstractC40431b.AbstractC40432a f102725d;

    /* renamed from: e */
    public InviteMemberOrientationActivity f102726e;

    /* renamed from: f */
    public LinearLayout f102727f;

    /* renamed from: g */
    public EditText f102728g;

    /* renamed from: h */
    public ImageButton f102729h;

    /* renamed from: i */
    public TextView f102730i;

    /* renamed from: j */
    public LinearLayout f102731j;

    /* renamed from: k */
    public EditText f102732k;

    /* renamed from: l */
    public ImageButton f102733l;

    /* renamed from: m */
    public TextView f102734m;

    /* renamed from: n */
    public UDButton f102735n;

    /* renamed from: o */
    private View f102736o;

    /* renamed from: p */
    private EditText f102737p;

    /* renamed from: q */
    private LinearLayout f102738q;

    /* renamed from: r */
    private TextView f102739r;

    /* renamed from: s */
    private C40341d f102740s;

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        m160138k();
    }

    /* renamed from: n */
    private void m160141n() {
        C40103e.m159005a(this.f102739r, new View.OnClickListener() {
            /* class com.ss.android.lark.invitation.v2.feat.member.orientation.p2060a.C40439e.View$OnClickListenerC404423 */

            public void onClick(View view) {
                C40439e.this.mo146438c();
                InviteMemberContactActivity.m159903a(C40439e.this.f102726e, true, C40439e.this.f102723b, C40439e.this.f102724c, "add_by_email");
            }
        });
    }

    /* renamed from: c */
    public void mo146438c() {
        this.f102736o.clearFocus();
        C40129q.m159107a(this.f102726e);
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        C57783ah.m224245a().mo196094b(UiMessageContactEmail);
        C40351a.m159930a(true);
    }

    /* renamed from: l */
    private void m160139l() {
        this.f102728g.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            /* class com.ss.android.lark.invitation.v2.feat.member.orientation.p2060a.C40439e.View$OnFocusChangeListenerC404467 */

            public void onFocusChange(View view, boolean z) {
                if (z) {
                    C40439e.this.f102730i.setVisibility(8);
                    C40439e.this.f102727f.setBackgroundResource(R.drawable.inv_invite_member_input_focused_bg);
                    if (C40439e.this.f102728g.getText().length() > 0) {
                        C40439e.this.f102729h.setVisibility(0);
                        return;
                    }
                    return;
                }
                C40439e.this.mo146439d();
                C40439e.this.f102729h.setVisibility(8);
            }
        });
        this.f102728g.addTextChangedListener(new TextWatcher() {
            /* class com.ss.android.lark.invitation.v2.feat.member.orientation.p2060a.C40439e.C404478 */

            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public void afterTextChanged(Editable editable) {
                if (editable.toString().length() <= 0) {
                    C40439e.this.f102729h.setVisibility(8);
                } else if (C40439e.this.f102728g.hasFocus()) {
                    C40439e.this.f102729h.setVisibility(0);
                }
                C40439e.this.mo146444i();
            }
        });
        this.f102729h.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.invitation.v2.feat.member.orientation.p2060a.C40439e.View$OnClickListenerC404489 */

            public void onClick(View view) {
                C40439e.this.f102728g.setText("");
            }
        });
    }

    /* renamed from: m */
    private void m160140m() {
        this.f102732k.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            /* class com.ss.android.lark.invitation.v2.feat.member.orientation.p2060a.C40439e.AnonymousClass10 */

            public void onFocusChange(View view, boolean z) {
                if (z) {
                    C40439e.this.f102734m.setVisibility(8);
                    C40439e.this.f102731j.setBackgroundResource(R.drawable.inv_invite_member_input_focused_bg);
                    if (C40439e.this.f102732k.getText().length() > 0) {
                        C40439e.this.f102733l.setVisibility(0);
                    }
                    InvHitPoint.m160379e(C40439e.this.f102723b);
                    return;
                }
                C40439e.this.mo146442g();
                C40439e.this.f102733l.setVisibility(8);
            }
        });
        this.f102732k.addTextChangedListener(new TextWatcher() {
            /* class com.ss.android.lark.invitation.v2.feat.member.orientation.p2060a.C40439e.AnonymousClass11 */

            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public void afterTextChanged(Editable editable) {
                if (editable.toString().length() <= 0) {
                    C40439e.this.f102733l.setVisibility(8);
                } else if (C40439e.this.f102732k.hasFocus()) {
                    C40439e.this.f102733l.setVisibility(0);
                }
                C40439e.this.mo146444i();
            }
        });
        this.f102733l.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.invitation.v2.feat.member.orientation.p2060a.C40439e.View$OnClickListenerC404412 */

            public void onClick(View view) {
                C40439e.this.f102732k.setText("");
            }
        });
    }

    @Override // com.ss.android.lark.invitation.v2.feat.member.orientation.p2060a.AbstractC40429a.AbstractC40431b
    /* renamed from: b */
    public void mo146431b() {
        ViewUtils.m224146a(this.f102736o, true);
        C25717e.m92484a(this.f102735n, (int) R.string.Lark_Invitation_AddMembersSendInvitation);
        this.f102735n.setBackgroundColor(UDColorUtils.getColorStateList(this.f102726e, R.color.ud_button_blue_bg));
    }

    /* renamed from: e */
    public String mo146440e() {
        return this.f102728g.getText().toString().replace(" ", "");
    }

    /* renamed from: f */
    public boolean mo146441f() {
        return C40140u.m159138a((CharSequence) this.f102728g.getText().toString().replace(" ", ""));
    }

    /* renamed from: h */
    public boolean mo146443h() {
        if (this.f102732k.getText().toString().trim().length() > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    public void mo146444i() {
        if (!mo146441f() || !mo146443h()) {
            this.f102735n.setEnabled(false);
        } else {
            this.f102735n.setEnabled(true);
        }
    }

    @Override // com.ss.android.lark.invitation.v2.feat.member.orientation.p2060a.AbstractC40429a.AbstractC40431b
    /* renamed from: a */
    public void mo146428a() {
        ViewUtils.m224146a(this.f102736o, false);
        ProgressParams dVar = new ProgressParams();
        dVar.mo90339d(Integer.valueOf((int) R.color.static_white));
        dVar.mo90321a(Integer.valueOf((int) R.string.Lark_Invitation_AddMembersSendInvitation));
        C25717e.m92489a(this.f102735n, dVar);
        this.f102735n.setBackgroundColor(UDColorUtils.getColor(this.f102726e, R.color.primary_pri_300));
    }

    /* renamed from: d */
    public void mo146439d() {
        if (mo146441f() || this.f102728g.getText().length() == 0) {
            this.f102727f.setBackgroundResource(R.drawable.inv_invite_member_input_normal_bg);
            this.f102730i.setVisibility(8);
        } else {
            mo146429a(UIHelper.getString(R.string.Lark_UserGrowth_InviteMemberInvalidEmail));
        }
        mo146444i();
    }

    /* renamed from: g */
    public void mo146442g() {
        if (mo146443h() || this.f102732k.getText().length() == 0) {
            this.f102731j.setBackgroundResource(R.drawable.inv_invite_member_input_normal_bg);
            this.f102734m.setVisibility(8);
        } else {
            mo146432b(UIHelper.getString(R.string.Lark_Invitation_AddMembersNameCantEmpty));
        }
        mo146444i();
    }

    /* renamed from: j */
    public void mo146445j() {
        mo146438c();
        this.f102728g.setText("");
        this.f102732k.setText("");
        this.f102735n.setEnabled(false);
        this.f102727f.setBackgroundResource(R.drawable.inv_invite_member_input_normal_bg);
        this.f102730i.setVisibility(8);
        this.f102731j.setBackgroundResource(R.drawable.inv_invite_member_input_normal_bg);
        this.f102734m.setVisibility(8);
    }

    /* renamed from: k */
    private void m160138k() {
        this.f102737p = (EditText) this.f102736o.findViewById(R.id.immFocusEt);
        this.f102738q = (LinearLayout) this.f102736o.findViewById(R.id.immBlankAreaLl);
        this.f102727f = (LinearLayout) this.f102736o.findViewById(R.id.immEmailLl);
        this.f102728g = (EditText) this.f102736o.findViewById(R.id.immEmailInputEt);
        this.f102729h = (ImageButton) this.f102736o.findViewById(R.id.immEmailClearIb);
        this.f102730i = (TextView) this.f102736o.findViewById(R.id.immEmailErrorTv);
        this.f102731j = (LinearLayout) this.f102736o.findViewById(R.id.immNameLl);
        this.f102732k = (EditText) this.f102736o.findViewById(R.id.immNameInputEt);
        this.f102733l = (ImageButton) this.f102736o.findViewById(R.id.immNameClearIb);
        this.f102734m = (TextView) this.f102736o.findViewById(R.id.immNameErrorTv);
        this.f102739r = (TextView) this.f102736o.findViewById(R.id.immImportContactTv);
        this.f102735n = (UDButton) this.f102736o.findViewById(R.id.immInviteMembersBtn);
        this.f102738q.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.invitation.v2.feat.member.orientation.p2060a.C40439e.View$OnClickListenerC404445 */

            public void onClick(View view) {
                C40439e.this.mo146438c();
            }
        });
        m160139l();
        m160140m();
        m160141n();
        this.f102735n.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.invitation.v2.feat.member.orientation.p2060a.C40439e.View$OnClickListenerC404456 */

            public void onClick(View view) {
                C40439e.this.mo146438c();
                if (!C40439e.this.mo146441f() || !C40439e.this.mo146443h()) {
                    C40439e.this.f102735n.setEnabled(false);
                } else {
                    C40439e.this.f102725d.mo146434a(C40439e.this.mo146440e(), C40439e.this.f102732k.getText().toString());
                }
                InvHitPoint.m160365b(C40439e.this.f102723b);
            }
        });
        this.f102735n.setEnabled(false);
        DesktopUtil.m144299a(this.f102728g, this.f102732k, (TextView) this.f102736o.findViewById(R.id.immInviteMembersBtn), this.f102739r);
    }

    /* renamed from: a */
    public void setViewDelegate(AbstractC40429a.AbstractC40431b.AbstractC40432a aVar) {
        this.f102725d = aVar;
    }

    @Override // com.ss.android.lark.invitation.v2.feat.member.orientation.p2060a.AbstractC40429a.AbstractC40431b
    /* renamed from: c */
    public void mo146433c(String str) {
        LKUIToast.show(this.f102726e, str, 3500);
    }

    @Override // com.ss.android.lark.invitation.v2.feat.member.orientation.p2060a.AbstractC40429a.AbstractC40431b
    /* renamed from: a */
    public void mo146429a(String str) {
        this.f102727f.setBackgroundResource(R.drawable.inv_invite_member_input_error_bg);
        this.f102730i.setText(str);
        this.f102730i.setVisibility(0);
        this.f102735n.setEnabled(false);
    }

    @Override // com.ss.android.lark.invitation.v2.feat.member.orientation.p2060a.AbstractC40429a.AbstractC40431b
    /* renamed from: b */
    public void mo146432b(String str) {
        this.f102731j.setBackgroundResource(R.drawable.inv_invite_member_input_error_bg);
        this.f102734m.setText(str);
        this.f102734m.setVisibility(0);
        this.f102735n.setEnabled(false);
    }

    @Override // com.ss.android.lark.invitation.v2.feat.member.orientation.p2060a.AbstractC40429a.AbstractC40431b
    /* renamed from: a */
    public void mo146430a(final boolean z) {
        C40341d a = C40341d.m159898a(this.f102726e, z, true, new DialogC25637f.AbstractC25638a() {
            /* class com.ss.android.lark.invitation.v2.feat.member.orientation.p2060a.C40439e.C404401 */

            @Override // com.larksuite.component.ui.dialog.DialogC25637f.AbstractC25638a
            public void onClick(DialogC25637f fVar, int i) {
                C40439e.this.f102726e.mo146221a("invite_finish");
                C40439e.this.f102726e.finish();
                if (z) {
                    InvHitPoint.m160415w(C40439e.this.f102723b);
                } else {
                    InvHitPoint.m160409t(C40439e.this.f102723b);
                }
            }
        }, new DialogC25637f.AbstractC25638a() {
            /* class com.ss.android.lark.invitation.v2.feat.member.orientation.p2060a.C40439e.C404434 */

            @Override // com.larksuite.component.ui.dialog.DialogC25637f.AbstractC25638a
            public void onClick(DialogC25637f fVar, int i) {
                C40439e.this.mo146445j();
                fVar.dismiss();
                if (z) {
                    InvHitPoint.m160417x(C40439e.this.f102723b);
                } else {
                    InvHitPoint.m160411u(C40439e.this.f102723b);
                }
            }
        });
        this.f102740s = a;
        a.mo146231a();
        if (z) {
            InvHitPoint.m160413v(this.f102723b);
        } else {
            InvHitPoint.m160407s(this.f102723b);
        }
    }

    public C40439e(C40433b bVar, String str, String str2) {
        this.f102723b = str;
        this.f102724c = str2;
        this.f102726e = (InviteMemberOrientationActivity) bVar.getActivity();
        this.f102736o = bVar.getView();
    }
}
