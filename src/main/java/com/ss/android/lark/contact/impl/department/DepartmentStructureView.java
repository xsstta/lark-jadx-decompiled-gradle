package com.ss.android.lark.contact.impl.department;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.larksuite.component.universe_design.dialog.UDListDialogController;
import com.larksuite.component.universe_design.dialog.actionpanel.UDActionPanelBuilder;
import com.larksuite.component.universe_design.icon.UDIconUtils;
import com.larksuite.framework.mvp.C26034b;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.biz.core.api.AbstractC29541ac;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.contact.C35358a;
import com.ss.android.lark.contact.entity.Department;
import com.ss.android.lark.contact.feat.statistics.ContactMobileHitPoint;
import com.ss.android.lark.contact.impl.department.C35812c;
import com.ss.android.lark.contact.impl.department.DepartmentStructureModel;
import com.ss.android.lark.contact.impl.department.detail.C35819a;
import com.ss.android.lark.contact.impl.department.detail.DepartmentDetailFragmentBuilder;
import com.ss.android.lark.contact.widget.C36081a;
import com.ss.android.lark.contact.widget.DesktopContactsTitle;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.ui.CommonTitleBarConstants;
import com.ss.android.lark.ui.IActionTitlebar;
import com.ss.android.lark.utils.C57820d;
import com.ss.android.lark.utils.C57832h;
import com.ss.android.lark.widget.listener.OnSingleClickListener;
import java.util.ArrayList;

public class DepartmentStructureView extends C26034b<C35812c.AbstractC35815b.AbstractC35816a> implements C35812c.AbstractC35815b {

    /* renamed from: a */
    public AbstractC35803a f92543a;

    /* renamed from: b */
    public Activity f92544b;

    /* renamed from: c */
    public C35819a f92545c;
    View contactDepartmentInviteMemberFl;

    /* renamed from: d */
    private C35812c.AbstractC35815b.AbstractC35816a f92546d;

    /* renamed from: e */
    private boolean f92547e;

    /* renamed from: f */
    private String f92548f;

    /* renamed from: g */
    private boolean f92549g;

    /* renamed from: h */
    private boolean f92550h;

    /* renamed from: i */
    private boolean f92551i;

    /* renamed from: j */
    private String f92552j;

    /* renamed from: k */
    private C36081a f92553k;
    View mContainerLayout;
    DesktopContactsTitle mDesktopTitleBar;
    TextView mInviteTv;
    View mSearchPlaceHolder;
    CommonTitleBar mTitleBar;

    /* renamed from: com.ss.android.lark.contact.impl.department.DepartmentStructureView$a */
    public interface AbstractC35803a {
        /* renamed from: a */
        void mo131731a();

        /* renamed from: a */
        void mo131732a(Context context, String str, String str2, int i);

        /* renamed from: a */
        void mo131733a(Bitmap bitmap);

        /* renamed from: a */
        void mo131734a(Chatter chatter);

        /* renamed from: a */
        void mo131735a(DepartmentStructureView departmentStructureView);
    }

    @Override // com.larksuite.framework.mvp.C26034b, com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        super.destroy();
    }

    @Override // com.ss.android.lark.contact.impl.department.C35812c.AbstractC35815b
    /* renamed from: a */
    public void mo131724a(final String str, final String str2) {
        if (this.f92545c == null) {
            m140102a(str, str2, true);
        } else {
            this.mContainerLayout.post(new Runnable() {
                /* class com.ss.android.lark.contact.impl.department.DepartmentStructureView.RunnableC357963 */

                public void run() {
                    DepartmentStructureView.this.f92545c.mo131792a(str, str2);
                }
            });
        }
    }

    /* renamed from: a */
    public void mo131725a(String str, String str2, final String str3) {
        ContactMobileHitPoint.m138538f();
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        ((UDActionPanelBuilder) ((UDActionPanelBuilder) ((UDActionPanelBuilder) ((UDActionPanelBuilder) ((UDActionPanelBuilder) new UDActionPanelBuilder(this.f92544b).title(str2)).titleColor(R.color.text_caption)).mo90870a(arrayList)).mo90869a(new UDListDialogController.OnItemClickListener() {
            /* class com.ss.android.lark.contact.impl.department.DepartmentStructureView.C358029 */

            @Override // com.larksuite.component.universe_design.dialog.UDListDialogController.OnItemClickListener
            public void onItemClick(int i) {
                if (i == 0) {
                    C35358a.m138143a().mo130160f().mo130192a(DepartmentStructureView.this.f92544b, str3);
                }
            }
        })).addActionButton(R.id.ud_dialog_btn_cancel, UIUtils.getString(this.f92544b, R.string.lkui_navigation_cancel), (DialogInterface.OnClickListener) null)).show();
    }

    /* renamed from: g */
    private void m140106g() {
        m140107h();
        m140105f();
    }

    @Override // com.ss.android.lark.contact.impl.department.C35812c.AbstractC35815b
    /* renamed from: a */
    public void mo131718a() {
        this.f92545c.mo131796b();
    }

    /* renamed from: e */
    private void m140104e() {
        this.mSearchPlaceHolder.setOnClickListener(new OnSingleClickListener() {
            /* class com.ss.android.lark.contact.impl.department.DepartmentStructureView.C357941 */

            @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
            public void onSingleClick(View view) {
                DepartmentStructureView.this.f92543a.mo131733a(DepartmentStructureView.this.mo131726b());
            }
        });
        this.f92545c.mo131790a(new AbstractC29541ac() {
            /* class com.ss.android.lark.contact.impl.department.DepartmentStructureView.C357952 */

            @Override // com.ss.android.lark.biz.core.api.AbstractC29541ac
            /* renamed from: a */
            public /* synthetic */ void mo102980a(Chatter chatter, int i, int i2) {
                AbstractC29541ac.CC.$default$a(this, chatter, i, i2);
            }

            @Override // com.ss.android.lark.biz.core.api.AbstractC29541ac
            /* renamed from: a */
            public boolean mo102983a(Chatter chatter, boolean z, int i, String str, int i2) {
                return true;
            }

            @Override // com.ss.android.lark.biz.core.api.AbstractC29541ac
            /* renamed from: a */
            public boolean mo102984a(Department department, boolean z) {
                return true;
            }

            @Override // com.ss.android.lark.biz.core.api.AbstractC29541ac
            /* renamed from: b */
            public /* synthetic */ void mo102985b(boolean z) {
                AbstractC29541ac.CC.$default$b(this, z);
            }

            @Override // com.ss.android.lark.biz.core.api.AbstractC29541ac
            /* renamed from: c */
            public /* synthetic */ void mo102986c(boolean z) {
                AbstractC29541ac.CC.$default$c(this, z);
            }

            @Override // com.ss.android.lark.biz.core.api.AbstractC29541ac
            /* renamed from: a */
            public void mo102977a() {
                DepartmentStructureView.this.f92543a.mo131731a();
            }

            @Override // com.ss.android.lark.biz.core.api.AbstractC29541ac
            /* renamed from: a */
            public void mo102979a(Chatter chatter) {
                DepartmentStructureView.this.f92543a.mo131734a(chatter);
            }

            @Override // com.ss.android.lark.biz.core.api.AbstractC29541ac
            /* renamed from: a */
            public void mo102981a(String str) {
                if (DesktopUtil.m144301a((Context) DepartmentStructureView.this.f92544b)) {
                    DepartmentStructureView.this.mDesktopTitleBar.setTitle(str);
                } else {
                    DepartmentStructureView.this.mTitleBar.setTitle(str);
                }
            }

            @Override // com.ss.android.lark.biz.core.api.AbstractC29541ac
            /* renamed from: a */
            public void mo102982a(boolean z) {
                DepartmentStructureView.this.mTitleBar.setSecLeftVisible(z);
            }

            @Override // com.ss.android.lark.biz.core.api.AbstractC29541ac
            /* renamed from: a */
            public void mo102978a(Context context, String str, String str2, int i) {
                DepartmentStructureView.this.f92543a.mo131732a(context, str, str2, i);
            }
        });
    }

    /* renamed from: b */
    public Bitmap mo131726b() {
        return C57820d.m224429a(C57820d.m224432a(this.mTitleBar), C35358a.m138143a().mo130166k().mo130250a());
    }

    @Override // com.larksuite.framework.mvp.C26034b, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        this.f92543a.mo131735a(this);
        m140106g();
        m140104e();
        m140103a(this.f92550h);
    }

    @Override // com.ss.android.lark.contact.impl.department.C35812c.AbstractC35815b
    /* renamed from: d */
    public void mo131727d() {
        if (!this.f92547e) {
            this.contactDepartmentInviteMemberFl.setVisibility(0);
            C57832h.m224486a(this.contactDepartmentInviteMemberFl);
            this.contactDepartmentInviteMemberFl.setOnClickListener(new View.OnClickListener() {
                /* class com.ss.android.lark.contact.impl.department.$$Lambda$DepartmentStructureView$B2GiAcuRkX99C4YPYD0xuAikXA */

                public final void onClick(View view) {
                    DepartmentStructureView.m270490lambda$B2GiAcuRkX99C4YPYD0xuAikXA(DepartmentStructureView.this, view);
                }
            });
        }
    }

    /* renamed from: f */
    private void m140105f() {
        this.f92545c = (C35819a) new DepartmentDetailFragmentBuilder().mo105802a(true).mo105808d(true).mo105800a(Boolean.valueOf(this.f92547e)).mo105803b(Boolean.valueOf(this.f92550h)).mo105812h(this.f92549g).mo105804b(this.f92548f).mo105809e(true ^ DesktopUtil.m144307b()).mo105813i(this.f92551i).mo105806c(this.f92552j).mo105797a();
        ((FragmentActivity) this.f92544b).getSupportFragmentManager().beginTransaction().add(this.mContainerLayout.getId(), this.f92545c).commit();
    }

    /* renamed from: h */
    private void m140107h() {
        if (!DesktopUtil.m144301a((Context) this.f92544b)) {
            this.mTitleBar.setLeftImageResource(CommonTitleBarConstants.ICON_BACK);
            this.mTitleBar.setSecLeftImageResource(CommonTitleBarConstants.ICON_CLOSE, R.color.icon_n1);
            this.mTitleBar.setLeftClickListener(new View.OnClickListener() {
                /* class com.ss.android.lark.contact.impl.department.DepartmentStructureView.View$OnClickListenerC358007 */

                public void onClick(View view) {
                    DepartmentStructureView.this.mo131718a();
                }
            });
            this.mTitleBar.setSecLeftClickListener(new View.OnClickListener() {
                /* class com.ss.android.lark.contact.impl.department.DepartmentStructureView.View$OnClickListenerC358018 */

                public void onClick(View view) {
                    DepartmentStructureView.this.f92543a.mo131731a();
                }
            });
            this.mTitleBar.setSecLeftVisible(false);
            this.mSearchPlaceHolder.setVisibility(0);
            this.mDesktopTitleBar.setVisibility(8);
            return;
        }
        this.mSearchPlaceHolder.setVisibility(8);
        this.mDesktopTitleBar.setVisibility(0);
        this.mTitleBar.setVisibility(8);
    }

    /* renamed from: a */
    public void setViewDelegate(C35812c.AbstractC35815b.AbstractC35816a aVar) {
        this.f92546d = aVar;
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m140100a(View view) {
        if (this.f92550h) {
            C35358a.m138143a().mo130158e().mo130217b(this.f92544b);
        } else {
            C35358a.m138143a().mo130158e().mo130213a(this.f92544b);
        }
    }

    /* renamed from: a */
    private void m140103a(boolean z) {
        int i;
        int i2;
        this.f92550h = z;
        TextView textView = this.mInviteTv;
        if (z) {
            i = R.drawable.icon_b2b_invite;
        } else {
            i = R.drawable.contact_invite_member_icon;
        }
        textView.setCompoundDrawablesWithIntrinsicBounds(i, 0, 0, 0);
        TextView textView2 = this.mInviteTv;
        if (z) {
            i2 = R.string.Lark_B2B_AddTrust;
        } else {
            i2 = R.string.Lark_Invitation_InviteTeamMembers_TitleBar;
        }
        textView2.setText(i2);
    }

    @Override // com.ss.android.lark.contact.impl.department.C35812c.AbstractC35815b
    /* renamed from: a */
    public void mo131719a(Bundle bundle) {
        Department c = this.f92545c.mo131799c();
        if (c != null) {
            this.f92546d.mo131745a(bundle, c.getId(), this.f92547e, this.f92549g, this.f92548f);
        }
    }

    /* renamed from: a */
    public void mo131723a(String str) {
        C35819a aVar = this.f92545c;
        if (aVar != null && aVar.isAdded()) {
            this.f92545c.mo131791a(str);
        }
    }

    @Override // com.ss.android.lark.contact.impl.department.C35812c.AbstractC35815b
    /* renamed from: a */
    public void mo131720a(final DepartmentStructureModel.UnregisterCheckData unregisterCheckData, final String str) {
        boolean z;
        if (this.f92550h) {
            Log.m165383e("DepartmentStructureView", "showMoreIcon return when is Collaboration");
            return;
        }
        if (unregisterCheckData == null || !unregisterCheckData.enabled) {
            z = false;
        } else {
            z = true;
        }
        boolean isEmpty = true ^ TextUtils.isEmpty(str);
        Log.m165389i("DepartmentStructureView", "showMoreIcon, showUnregister = " + z + ", showManager = " + isEmpty);
        Activity activity = this.f92544b;
        Drawable iconDrawable = UDIconUtils.getIconDrawable(activity, (int) R.drawable.contact_icon_more, UIUtils.getColor(activity, R.color.icon_n1));
        if (z && isEmpty) {
            this.mTitleBar.addAction(new IActionTitlebar.C57573a(iconDrawable) {
                /* class com.ss.android.lark.contact.impl.department.DepartmentStructureView.C357974 */

                @Override // com.ss.android.lark.ui.IActionTitlebar.Action, com.ss.android.lark.ui.IActionTitlebar.BaseAction
                public void performAction(View view) {
                    super.performAction(view);
                    DepartmentStructureView.this.mo131722a(this, unregisterCheckData.title, unregisterCheckData.notice, unregisterCheckData.url, str);
                }
            });
        } else if (z) {
            this.mTitleBar.addAction(new IActionTitlebar.C57573a(iconDrawable) {
                /* class com.ss.android.lark.contact.impl.department.DepartmentStructureView.C357985 */

                @Override // com.ss.android.lark.ui.IActionTitlebar.Action, com.ss.android.lark.ui.IActionTitlebar.BaseAction
                public void performAction(View view) {
                    super.performAction(view);
                    DepartmentStructureView.this.mo131725a(unregisterCheckData.title, unregisterCheckData.notice, unregisterCheckData.url);
                }
            });
        } else if (isEmpty) {
            this.mTitleBar.addAction(new IActionTitlebar.TextAction(this.f92544b.getResources().getString(R.string.Lark_Contacts_Manage), R.color.lkui_B600, 14) {
                /* class com.ss.android.lark.contact.impl.department.DepartmentStructureView.C357996 */

                @Override // com.ss.android.lark.ui.IActionTitlebar.Action, com.ss.android.lark.ui.IActionTitlebar.BaseAction
                public void performAction(View view) {
                    super.performAction(view);
                    DepartmentStructureView.this.mo131723a(str);
                }
            });
        }
    }

    /* renamed from: a */
    private void m140102a(String str, String str2, boolean z) {
        this.f92545c = (C35819a) new DepartmentDetailFragmentBuilder().mo131804d(str).mo105801a(str2).mo105800a(Boolean.valueOf(this.f92547e)).mo105803b(Boolean.valueOf(this.f92550h)).mo105812h(this.f92549g).mo105804b(this.f92548f).mo105802a(z).mo105813i(this.f92551i).mo105806c(this.f92552j).mo105797a();
        ((FragmentActivity) this.f92544b).getSupportFragmentManager().beginTransaction().add(this.mContainerLayout.getId(), this.f92545c).commit();
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m140101a(String str, String str2, String str3, String str4, int i) {
        if (i == 0) {
            mo131725a(str, str2, str3);
        } else if (i == 1) {
            mo131723a(str4);
        }
    }

    /* renamed from: a */
    public void mo131722a(IActionTitlebar.Action action, String str, String str2, String str3, String str4) {
        if (!(this.f92544b instanceof FragmentActivity)) {
            Log.m165383e("DepartmentStructureView", "showPopupWindow failed");
            return;
        }
        C36081a aVar = this.f92553k;
        if (aVar != null && aVar.isAdded()) {
            this.f92553k.u_();
        }
        this.f92553k = C36081a.m141481a((FragmentActivity) this.f92544b, this.mTitleBar.getViewByAction(action), new C36081a.AbstractC36082a(str, str2, str3, str4) {
            /* class com.ss.android.lark.contact.impl.department.$$Lambda$DepartmentStructureView$PFujyllkUo4aJKqUZ7GoNRufc_s */
            public final /* synthetic */ String f$1;
            public final /* synthetic */ String f$2;
            public final /* synthetic */ String f$3;
            public final /* synthetic */ String f$4;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
                this.f$4 = r5;
            }

            @Override // com.ss.android.lark.contact.widget.C36081a.AbstractC36082a
            public final void onClick(int i) {
                DepartmentStructureView.lambda$PFujyllkUo4aJKqUZ7GoNRufc_s(DepartmentStructureView.this, this.f$1, this.f$2, this.f$3, this.f$4, i);
            }
        });
    }

    public DepartmentStructureView(Activity activity, AbstractC35803a aVar, boolean z, boolean z2, boolean z3, String str, boolean z4, String str2) {
        this.f92543a = aVar;
        this.f92544b = activity;
        this.f92547e = z;
        this.f92550h = z2;
        this.f92549g = z3;
        this.f92548f = str;
        this.f92551i = z4;
        this.f92552j = str2;
    }
}
