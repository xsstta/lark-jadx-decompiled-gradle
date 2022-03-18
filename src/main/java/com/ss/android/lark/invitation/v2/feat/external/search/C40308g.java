package com.ss.android.lark.invitation.v2.feat.external.search;

import android.app.Activity;
import android.content.DialogInterface;
import android.text.Editable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.component.ui.button.LKUIButton;
import com.larksuite.component.ui.dialog.C25639g;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.suite.R;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.inv.export.util.C40129q;
import com.ss.android.lark.inv.export.util.C40144w;
import com.ss.android.lark.inv.export.util.C40147z;
import com.ss.android.lark.invitation.v2.feat.external.common.InviteExternalViewDependency;
import com.ss.android.lark.invitation.v2.feat.external.p2054a.C40205c;
import com.ss.android.lark.invitation.v2.feat.external.search.AbstractC40294a;
import com.ss.android.lark.invitation.v2.statistic.InvHitPoint;
import com.ss.android.lark.profile.dto.ProfileFinishResult;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57832h;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.utils.ViewUtils;
import com.ss.android.lark.widget.recyclerview.p2964a.C58973b;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.ss.android.lark.invitation.v2.feat.external.search.g */
public class C40308g implements AbstractC40294a.AbstractC40296b {

    /* renamed from: a */
    public final InviteExternalViewDependency f102401a;

    /* renamed from: b */
    public AbstractC40294a.AbstractC40296b.AbstractC40297a f102402b;

    /* renamed from: c */
    public EditText f102403c;

    /* renamed from: d */
    public ImageView f102404d;

    /* renamed from: e */
    public String f102405e;

    /* renamed from: f */
    private ConstraintLayout f102406f;

    /* renamed from: g */
    private CommonTitleBar f102407g;

    /* renamed from: h */
    private TextView f102408h;

    /* renamed from: i */
    private RelativeLayout f102409i;

    /* renamed from: j */
    private RecyclerView f102410j;

    /* renamed from: k */
    private LinearLayout f102411k;

    /* renamed from: l */
    private ViewUtils.C57751a f102412l;

    /* renamed from: m */
    private C58973b<C40303e> f102413m;

    /* renamed from: n */
    private C40205c f102414n;

    /* renamed from: o */
    private FrameLayout f102415o;

    /* renamed from: p */
    private RelativeLayout f102416p;

    /* renamed from: q */
    private LinearLayout f102417q;

    /* renamed from: r */
    private LKUIButton f102418r;

    /* renamed from: s */
    private TextView f102419s;

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
    }

    @Override // com.ss.android.lark.invitation.v2.feat.external.search.AbstractC40294a.AbstractC40296b
    /* renamed from: a */
    public Activity mo146128a() {
        return this.f102401a.mo145900a();
    }

    @Override // com.ss.android.lark.invitation.v2.feat.external.search.AbstractC40294a.AbstractC40296b
    /* renamed from: c */
    public void mo146134c() {
        ViewUtils.C57751a aVar = this.f102412l;
        if (aVar != null) {
            aVar.mo196042e();
        }
    }

    /* renamed from: i */
    private void m159767i() {
        HashMap hashMap = new HashMap();
        hashMap.put("APP_DISPLAY_NAME", UIHelper.getAppName());
        C40144w.m159156a(UIHelper.mustacheFormat((int) R.string.Lark_UserGrowth_InvitePeopleSearchPrivacyTip, hashMap), new ClickableSpan() {
            /* class com.ss.android.lark.invitation.v2.feat.external.search.C40308g.C403179 */

            public void updateDrawState(TextPaint textPaint) {
                textPaint.setColor(UIHelper.getColor(R.color.lkui_B500));
                textPaint.setUnderlineText(false);
            }

            public void onClick(View view) {
                Activity a = ViewUtils.m224142a(view);
                if (a != null) {
                    new C25639g(a).mo89247e(false).mo89248g(R.string.Lark_UserGrowth_InvitePeopleContactsPrivacyTitle).mo89238b(true).mo89254m(R.string.Lark_UserGrowth_InvitePeopleContactsPrivacy).mo89225a(R.id.lkui_dialog_btn_left, UIHelper.getString(R.string.Lark_UserGrowth_InvitePeopleContactsPrivacyCTA), new DialogInterface.OnClickListener() {
                        /* class com.ss.android.lark.invitation.v2.feat.external.search.C40308g.C403179.DialogInterface$OnClickListenerC403181 */

                        public void onClick(DialogInterface dialogInterface, int i) {
                            dialogInterface.dismiss();
                        }
                    }).mo89239c();
                    InvHitPoint.m160342U(C40308g.this.f102405e);
                }
            }
        });
    }

    @Override // com.ss.android.lark.invitation.v2.feat.external.search.AbstractC40294a.AbstractC40296b
    /* renamed from: b */
    public void mo146133b() {
        if (this.f102412l == null) {
            this.f102412l = ViewUtils.m224154c(this.f102401a.mo145900a());
        }
        this.f102412l.mo196039b();
    }

    @Override // com.ss.android.lark.invitation.v2.feat.external.search.AbstractC40294a.AbstractC40296b
    /* renamed from: e */
    public void mo146136e() {
        this.f102411k.setVisibility(0);
        this.f102415o.setVisibility(8);
        this.f102413m.mo200080a(C40303e.m159757b());
        this.f102413m.notifyDataSetChanged();
    }

    /* renamed from: h */
    private void m159766h() {
        this.f102415o.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.invitation.v2.feat.external.search.C40308g.View$OnClickListenerC403146 */

            public void onClick(View view) {
                C40129q.m159107a(C40308g.this.f102401a.mo145900a());
            }
        });
        C57832h.m224486a(this.f102416p);
        this.f102416p.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.invitation.v2.feat.external.search.C40308g.View$OnClickListenerC403157 */

            public void onClick(View view) {
                C40308g.this.f102402b.mo146139a(C40308g.this.f102403c.getText().toString().replace(" ", ""));
                C40129q.m159107a(C40308g.this.f102401a.mo145900a());
            }
        });
        this.f102418r.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.invitation.v2.feat.external.search.C40308g.View$OnClickListenerC403168 */

            public void onClick(View view) {
                InvHitPoint.m160338Q(C40308g.this.f102405e);
                C40308g.this.f102402b.mo146138a();
            }
        });
        m159767i();
    }

    @Override // com.ss.android.lark.invitation.v2.feat.external.search.AbstractC40294a.AbstractC40296b
    /* renamed from: d */
    public void mo146135d() {
        this.f102411k.setVisibility(8);
        this.f102415o.setVisibility(0);
        this.f102416p.setVisibility(8);
        this.f102417q.setVisibility(0);
        if (this.f102403c.getText().toString().contains("@")) {
            this.f102418r.setText(R.string.Lark_UserGrowth_InvitePeopleContactsSearchShareLinkEmail);
        } else {
            this.f102418r.setText(R.string.Lark_UserGrowth_InvitePeopleContactsSearchShareLinkText);
        }
    }

    @Override // com.ss.android.lark.invitation.v2.feat.external.search.AbstractC40294a.AbstractC40296b
    /* renamed from: f */
    public void mo146137f() {
        C40205c cVar = this.f102414n;
        if (cVar != null) {
            cVar.mo145875e();
            this.f102414n.mo197766g();
        }
        if (!DesktopUtil.m144307b()) {
            this.f102403c.setText("");
            this.f102415o.setVisibility(8);
        }
        C40129q.m159109a(this.f102403c);
    }

    /* renamed from: g */
    public void mo146164g() {
        this.f102411k.setVisibility(8);
        this.f102415o.setVisibility(0);
        this.f102416p.setVisibility(0);
        this.f102417q.setVisibility(8);
        this.f102413m.mo200080a(C40303e.m159757b());
        this.f102413m.notifyDataSetChanged();
    }

    /* renamed from: k */
    private void m159769k() {
        if (DesktopUtil.m144307b()) {
            this.f102418r.getLayoutParams().height = UIHelper.dp2px(36.0f);
            DesktopUtil.m144299a(this.f102418r);
            DesktopUtil.m144306b(this.f102408h);
            DesktopUtil.m144299a((TextView) this.f102401a.mo145901a(R.id.ipseTipsTv), this.f102419s, this.f102408h, (TextView) this.f102401a.mo145901a(R.id.ieLoadingTv));
        }
    }

    /* renamed from: j */
    private void m159768j() {
        this.f102406f = (ConstraintLayout) this.f102401a.mo145901a(R.id.ipsRootCl);
        this.f102407g = (CommonTitleBar) this.f102401a.mo145901a(R.id.ipsTitleBar);
        this.f102403c = (EditText) this.f102401a.mo145901a(R.id.ipsSearchEt);
        this.f102404d = (ImageView) this.f102401a.mo145901a(R.id.ipsSearchClearIv);
        this.f102409i = (RelativeLayout) this.f102401a.mo145901a(R.id.ipsSearchRl);
        this.f102410j = (RecyclerView) this.f102401a.mo145901a(R.id.ipSearchResultRv);
        this.f102411k = (LinearLayout) this.f102401a.mo145901a(R.id.ipslRootLl);
        this.f102415o = (FrameLayout) this.f102401a.mo145901a(R.id.ipseRootFl);
        this.f102416p = (RelativeLayout) this.f102401a.mo145901a(R.id.ipseSearchRl);
        this.f102408h = (TextView) this.f102401a.mo145901a(R.id.ipseNoResultsTv);
        this.f102417q = (LinearLayout) this.f102401a.mo145901a(R.id.ipseInviteFl);
        this.f102418r = (LKUIButton) this.f102401a.mo145901a(R.id.ipseInviteBtn);
        this.f102419s = (TextView) this.f102401a.mo145901a(R.id.ipseSearchContentTv);
        m159769k();
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        m159768j();
        this.f102406f.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.invitation.v2.feat.external.search.C40308g.View$OnClickListenerC403091 */

            public void onClick(View view) {
                C40129q.m159107a(C40308g.this.f102401a.mo145900a());
            }
        });
        this.f102403c.post(new Runnable() {
            /* class com.ss.android.lark.invitation.v2.feat.external.search.C40308g.RunnableC403113 */

            public void run() {
                C40129q.m159109a(C40308g.this.f102403c);
            }
        });
        this.f102403c.addTextChangedListener(new TextWatcher() {
            /* class com.ss.android.lark.invitation.v2.feat.external.search.C40308g.C403124 */

            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public void afterTextChanged(Editable editable) {
                int i;
                String replace = editable.toString().replace(" ", "");
                ImageView imageView = C40308g.this.f102404d;
                if (TextUtils.isEmpty(replace)) {
                    i = 8;
                } else {
                    i = 0;
                }
                imageView.setVisibility(i);
                if (TextUtils.isEmpty(replace)) {
                    C40308g.this.mo146132a(C40303e.m159757b());
                    return;
                }
                C40308g.this.mo146164g();
                C40308g.this.mo146161b(replace);
            }
        });
        this.f102407g.setLeftClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.invitation.v2.feat.external.search.$$Lambda$g$Nbwyh78nNxXmHG72N8K2g9h2kY */

            public final void onClick(View view) {
                C40308g.this.m159765a((C40308g) view);
            }
        });
        if (C40147z.m159160a().getLoginDependency().mo145589e()) {
            this.f102407g.setTitle(R.string.Lark_NewContacts_AddContactsb);
        } else {
            this.f102407g.setTitle(R.string.Lark_NewContacts_AddExternalContactsB);
        }
        C57832h.m224490a(this.f102404d);
        this.f102404d.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.invitation.v2.feat.external.search.C40308g.View$OnClickListenerC403135 */

            public void onClick(View view) {
                C40308g.this.f102403c.setText("");
                C40308g.this.f102404d.setVisibility(8);
            }
        });
        C58973b<C40303e> bVar = new C58973b<>();
        this.f102413m = bVar;
        bVar.mo200080a(C40303e.m159757b());
        this.f102410j.setAdapter(this.f102413m);
        this.f102410j.setLayoutManager(new LinearLayoutManager(this.f102401a.mo145900a()));
        m159766h();
    }

    /* renamed from: a */
    public void setViewDelegate(AbstractC40294a.AbstractC40296b.AbstractC40297a aVar) {
        this.f102402b = aVar;
    }

    public C40308g(InviteExternalViewDependency eVar) {
        this.f102401a = eVar;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m159765a(View view) {
        C40129q.m159115b(view);
        this.f102401a.mo145902b();
    }

    @Override // com.ss.android.lark.invitation.v2.feat.external.search.AbstractC40294a.AbstractC40296b
    /* renamed from: a */
    public void mo146130a(String str) {
        LKUIToast.show(this.f102401a.mo145900a(), str);
    }

    @Override // com.ss.android.lark.invitation.v2.feat.external.search.AbstractC40294a.AbstractC40296b
    /* renamed from: a */
    public void mo146129a(ProfileFinishResult profileFinishResult) {
        int i;
        C58973b<C40303e> bVar = this.f102413m;
        if (bVar != null) {
            Iterator<Item> it = bVar.f146125a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                }
                C40303e eVar = (C40303e) it.next();
                if (eVar.mo146156a(profileFinishResult.userId)) {
                    i = eVar.mo146154a();
                    eVar.mo146155a(profileFinishResult);
                    break;
                }
            }
            if (i != -1) {
                this.f102413m.notifyItemChanged(i);
            }
        }
    }

    /* renamed from: b */
    public void mo146161b(String str) {
        if (str.contains("@")) {
            this.f102418r.setText(R.string.Lark_UserGrowth_InvitePeopleContactsSearchShareLinkEmail);
        } else {
            this.f102418r.setText(R.string.Lark_UserGrowth_InvitePeopleContactsSearchShareLinkText);
        }
        this.f102419s.setText(str);
    }

    /* renamed from: c */
    public void mo146163c(String str) {
        if (str.contains("@")) {
            InvHitPoint.m160358a("link", "invite_email", this.f102402b.mo146141b());
        } else {
            InvHitPoint.m160358a("link", "invite_message", this.f102402b.mo146141b());
        }
    }

    @Override // com.ss.android.lark.invitation.v2.feat.external.search.AbstractC40294a.AbstractC40296b
    /* renamed from: a */
    public void mo146132a(List<C40303e> list) {
        this.f102411k.setVisibility(8);
        this.f102415o.setVisibility(8);
        this.f102413m.mo200080a(list);
        this.f102413m.notifyDataSetChanged();
    }

    @Override // com.ss.android.lark.invitation.v2.feat.external.search.AbstractC40294a.AbstractC40296b
    /* renamed from: a */
    public void mo146131a(String str, String str2) {
        mo146162b(this.f102403c.getText().toString(), str2);
        InvHitPoint.m160337P(this.f102405e);
        InvHitPoint.m160339R(this.f102405e);
    }

    /* renamed from: b */
    public void mo146162b(final String str, String str2) {
        C40205c cVar = new C40205c(this.f102401a.mo145900a(), str, str2, new C40205c.AbstractC40215a() {
            /* class com.ss.android.lark.invitation.v2.feat.external.search.C40308g.AnonymousClass10 */

            @Override // com.ss.android.lark.invitation.v2.feat.external.p2054a.C40205c.AbstractC40215a
            /* renamed from: a */
            public void mo145893a(String str, boolean z, boolean z2) {
                C40308g.this.f102402b.mo146140a(str, z);
                InvHitPoint.m160373c(z2);
                C40308g.this.mo146163c(str);
            }
        }, new ApiUtils.AbstractC57748a<Boolean>() {
            /* class com.ss.android.lark.invitation.v2.feat.external.search.C40308g.C403102 */

            /* renamed from: a */
            public void consume(Boolean bool) {
                InvHitPoint.m160377d(bool.booleanValue());
            }
        });
        if (DesktopUtil.m144307b()) {
            this.f102414n = cVar.mo145871a(this.f102418r);
        } else {
            this.f102414n = (C40205c) cVar.mo197765f();
        }
    }
}
