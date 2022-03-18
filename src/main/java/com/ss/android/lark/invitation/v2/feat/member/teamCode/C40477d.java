package com.ss.android.lark.invitation.v2.feat.member.teamCode;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.bumptech.glide.load.resource.p093d.C2468c;
import com.larksuite.component.ui.dialog.C25639g;
import com.larksuite.suite.R;
import com.ss.android.lark.image.ImageLoader;
import com.ss.android.lark.image.api.C38811b;
import com.ss.android.lark.image.api.DiskCacheStrategy;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.inv.export.util.C40099a;
import com.ss.android.lark.inv.export.util.C40103e;
import com.ss.android.lark.inv.export.util.C40107f;
import com.ss.android.lark.inv.export.util.C40108g;
import com.ss.android.lark.inv.export.util.C40119m;
import com.ss.android.lark.inv.export.util.C40132r;
import com.ss.android.lark.inv.export.util.C40147z;
import com.ss.android.lark.inv.export.util.InvApmUtils;
import com.ss.android.lark.invitation.v2.feat.member.bean.MemberInvitationInfo;
import com.ss.android.lark.invitation.v2.feat.member.teamCode.C40469a;
import com.ss.android.lark.invitation.v2.feat.member.teamCode.C40477d;
import com.ss.android.lark.invitation.v2.p2052c.C40157a;
import com.ss.android.lark.invitation.v2.statistic.InvHitPoint;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.thirdshare.base.export.OnShareCallback;
import com.ss.android.lark.thirdshare.base.export.ShareActionType;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.utils.C57832h;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.utils.ViewUtils;
import java.util.Map;

/* renamed from: com.ss.android.lark.invitation.v2.feat.member.teamCode.d */
public class C40477d implements C40469a.AbstractC40471b {

    /* renamed from: a */
    public Activity f102804a;

    /* renamed from: b */
    public String f102805b;

    /* renamed from: c */
    public C40469a.AbstractC40471b.AbstractC40472a f102806c;

    /* renamed from: d */
    public LinearLayout f102807d;

    /* renamed from: e */
    public ImageView f102808e;

    /* renamed from: f */
    public FrameLayout f102809f;

    /* renamed from: g */
    public LinearLayout f102810g;

    /* renamed from: h */
    public ValueAnimator f102811h;

    /* renamed from: i */
    public ViewUtils.C57757c f102812i;

    /* renamed from: j */
    private CommonTitleBar f102813j;

    /* renamed from: k */
    private ScrollView f102814k;

    /* renamed from: l */
    private TextView f102815l;

    /* renamed from: m */
    private TextView f102816m;

    /* renamed from: n */
    private FrameLayout f102817n;

    /* renamed from: o */
    private FrameLayout f102818o;

    /* renamed from: p */
    private TextView f102819p;

    /* renamed from: q */
    private View f102820q;

    /* renamed from: r */
    private TextView f102821r;

    /* renamed from: s */
    private TextView f102822s;

    /* renamed from: t */
    private boolean f102823t;

    /* renamed from: u */
    private MemberInvitationInfo f102824u;

    @Override // com.ss.android.lark.invitation.v2.feat.member.teamCode.C40469a.AbstractC40471b
    /* renamed from: a */
    public void mo146501a() {
        this.f102823t = true;
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        ValueAnimator valueAnimator = this.f102811h;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    /* renamed from: c */
    public void mo146511c() {
        C40157a.m159187b(this.f102804a, this.f102824u, new OnShareCallback() {
            /* class com.ss.android.lark.invitation.v2.feat.member.teamCode.C40477d.C404877 */

            @Override // com.ss.android.lark.thirdshare.base.export.OnShareCallback
            public boolean intercept(ShareActionType shareActionType) {
                if (shareActionType.equals(ShareActionType.WX)) {
                    InvHitPoint.m160380f();
                    return false;
                } else if (!shareActionType.equals(ShareActionType.COPY)) {
                    return false;
                } else {
                    C40477d.this.mo146512d();
                    return true;
                }
            }

            @Override // com.ss.android.lark.thirdshare.base.export.OnShareCallback
            public void onSuccess(ShareActionType shareActionType) {
                InvHitPoint.m160372c(C40477d.this.f102805b, shareActionType);
                InvApmUtils.m158968a("ug_invite_member_nondirectional_share", true, (Map<String, ? extends Object>) C40108g.m159014a(Pair.create(ShareHitPoint.f121869d, "teamcode"), Pair.create("item", shareActionType.name())));
            }

            @Override // com.ss.android.lark.thirdshare.base.export.OnShareCallback
            public void onFailed(ShareActionType shareActionType, OnShareCallback.ShareError shareError) {
                if (OnShareCallback.NOT_INSTALLED.equals(shareError)) {
                    ViewUtils.m224145a((int) R.string.Lark_UserGrowth_InvitePeopleContactsShareNotInstalled);
                }
                InvApmUtils.m158961a("ug_invite_member_nondirectional_share", C40108g.m159014a(Pair.create(ShareHitPoint.f121869d, "teamcode"), Pair.create("item", shareActionType.name())), shareError.getCode(), shareError.getMsg());
            }
        });
    }

    /* renamed from: g */
    private void m160213g() {
        ViewUtils.C57757c d = ViewUtils.m224155d(this.f102804a);
        this.f102812i = d;
        d.mo196036a(new DialogInterface.OnCancelListener() {
            /* class com.ss.android.lark.invitation.v2.feat.member.teamCode.C40477d.DialogInterface$OnCancelListenerC404825 */

            public void onCancel(DialogInterface dialogInterface) {
                C40477d.this.f102804a.finish();
            }
        });
        this.f102812i.mo196039b();
    }

    /* renamed from: b */
    public void mo146510b() {
        ViewGroup.LayoutParams layoutParams = this.f102809f.getLayoutParams();
        layoutParams.width = this.f102808e.getWidth();
        layoutParams.height = this.f102808e.getHeight();
        this.f102809f.setLayoutParams(layoutParams);
    }

    /* renamed from: f */
    public void mo146514f() {
        if (this.f102811h == null) {
            this.f102811h = C40099a.m158956a(this.f102820q, new Runnable() {
                /* class com.ss.android.lark.invitation.v2.feat.member.teamCode.C40477d.AnonymousClass10 */

                public void run() {
                    C40477d.this.f102811h.cancel();
                    ViewUtils.m224146a((View) C40477d.this.f102807d, true);
                }
            });
        }
        ViewUtils.m224146a((View) this.f102807d, false);
        this.f102823t = false;
        this.f102811h.start();
    }

    /* renamed from: h */
    private void m160214h() {
        ImageLoader.with(this.f102804a).load(C40119m.m159076a("team_code_help_gif")).dontAnimate(false).placeholder(R.drawable.inv_team_code_cover).error(R.drawable.inv_team_code_cover).diskCacheStrategy(DiskCacheStrategy.SOURCE).into(new C38811b(this.f102808e) {
            /* class com.ss.android.lark.invitation.v2.feat.member.teamCode.C40477d.C404836 */

            /* access modifiers changed from: private */
            /* access modifiers changed from: public */
            /* renamed from: a */
            private /* synthetic */ void m160226a(View view) {
                C40132r.m159121c();
                InvHitPoint.m160331J(C40477d.this.f102805b);
            }

            @Override // com.ss.android.lark.image.api.AbstractC38819j, com.ss.android.lark.image.api.C38818i
            /* renamed from: a */
            public void mo49247a(Drawable drawable) {
                C40477d.this.f102808e.setOnClickListener(new View.OnClickListener() {
                    /* class com.ss.android.lark.invitation.v2.feat.member.teamCode.$$Lambda$d$6$W8fR34GjswgOkLxtPqTWrR8ho7o */

                    public final void onClick(View view) {
                        C40477d.C404836.this.m160226a((C40477d.C404836) view);
                    }
                });
            }

            /* renamed from: d */
            public void mo49248a(Drawable drawable) {
                if (drawable instanceof C2468c) {
                    final C2468c cVar = (C2468c) drawable;
                    ViewUtils.m224149a(new Runnable() {
                        /* class com.ss.android.lark.invitation.v2.feat.member.teamCode.C40477d.C404836.RunnableC404841 */

                        public void run() {
                            C40477d.this.f102808e.setOnClickListener(new View.OnClickListener() {
                                /* class com.ss.android.lark.invitation.v2.feat.member.teamCode.C40477d.C404836.RunnableC404841.View$OnClickListenerC404851 */

                                public void onClick(View view) {
                                    if (cVar.isRunning()) {
                                        cVar.stop();
                                        C40477d.this.mo146510b();
                                        C40477d.this.f102809f.setVisibility(0);
                                        return;
                                    }
                                    cVar.start();
                                }
                            });
                            C57832h.m224490a(C40477d.this.f102809f);
                            C40103e.m159005a(C40477d.this.f102809f, new View.OnClickListener() {
                                /* class com.ss.android.lark.invitation.v2.feat.member.teamCode.C40477d.C404836.RunnableC404841.View$OnClickListenerC404862 */

                                public void onClick(View view) {
                                    cVar.start();
                                    C40477d.this.f102809f.setVisibility(8);
                                }
                            });
                        }
                    }, 500);
                }
            }
        });
    }

    /* renamed from: i */
    private void m160215i() {
        String str;
        if (C40147z.m159160a().isLarkEnv()) {
            str = UIHelper.getString(R.string.Lark_Invitation_TeamCodeHelp_CenterLark);
        } else {
            str = UIHelper.getString(R.string.Lark_Invitation_TeamCodeHelp_CenterFeishu);
        }
        this.f102821r.setText(str);
        this.f102821r.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.invitation.v2.feat.member.teamCode.$$Lambda$d$P9esDQ0PLr_Dzc_j3WL4W9nAKi4 */

            public final void onClick(View view) {
                C40477d.this.m160212a((C40477d) view);
            }
        });
    }

    /* renamed from: d */
    public void mo146512d() {
        C40107f.m159012a(this.f102824u.getTeamCodeMsg());
        ViewUtils.m224145a((int) R.string.Lark_Legacy_CopyReady);
        InvHitPoint.m160330I(this.f102805b);
        InvApmUtils.m158960a("ug_invite_member_nondirectional_copy", C40108g.m159014a(Pair.create(ShareHitPoint.f121869d, "teamcode")));
    }

    /* renamed from: j */
    private void m160216j() {
        if (TextUtils.isEmpty(this.f102824u.teamCode)) {
            Log.m165383e("InviteMemberTeamCodeVie", "teamCode: " + this.f102824u.teamCode + " is empty");
            ViewUtils.m224144a();
            return;
        }
        int length = this.f102824u.teamCode.length() / 2;
        this.f102816m.setText(String.format("%s  %s", this.f102824u.teamCode.substring(0, length), this.f102824u.teamCode.substring(length)));
        TextView textView = this.f102819p;
        textView.setText(UIHelper.getString(R.string.Lark_Invitation_AddMembersExpiredTime) + this.f102824u.getExpiredTime());
    }

    /* renamed from: e */
    public void mo146513e() {
        InvHitPoint.m160356a(this.f102805b, "team_code");
        new C25639g(this.f102804a).mo89248g(R.string.Lark_Legacy_Hint).mo89242c(UIHelper.getString(R.string.Lark_Invitation_AddMembersRefreshDialogContentTeamCode)).mo89224a(R.id.lkui_dialog_btn_left, R.string.Lark_Invitation_AddMembersRefreshDialogCancel, new DialogInterface.OnClickListener() {
            /* class com.ss.android.lark.invitation.v2.feat.member.teamCode.C40477d.DialogInterface$OnClickListenerC404899 */

            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
                InvHitPoint.m160405r(C40477d.this.f102805b);
            }
        }).mo89224a(R.id.lkui_dialog_btn_right, R.string.Lark_Invitation_AddMembersRefreshDialogConfirm, new DialogInterface.OnClickListener() {
            /* class com.ss.android.lark.invitation.v2.feat.member.teamCode.C40477d.DialogInterface$OnClickListenerC404888 */

            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
                C40477d.this.mo146514f();
                C40477d.this.f102806c.mo146505b();
                InvHitPoint.m160403q(C40477d.this.f102805b);
            }
        }).mo89239c();
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        int i;
        this.f102813j = (CommonTitleBar) this.f102804a.findViewById(R.id.imtcTitleBar);
        this.f102814k = (ScrollView) this.f102804a.findViewById(R.id.imtcContentSv);
        this.f102815l = (TextView) this.f102804a.findViewById(R.id.imtcTipTv);
        this.f102816m = (TextView) this.f102804a.findViewById(R.id.imtcTeamCodeTv);
        this.f102817n = (FrameLayout) this.f102804a.findViewById(R.id.imtcCopyTeamCodeFl);
        this.f102818o = (FrameLayout) this.f102804a.findViewById(R.id.imtcShareTeamCodeFl);
        this.f102819p = (TextView) this.f102804a.findViewById(R.id.imtcExpiredTimeTv);
        this.f102807d = (LinearLayout) this.f102804a.findViewById(R.id.imtcRefreshLl);
        this.f102820q = this.f102804a.findViewById(R.id.imtcRefreshView);
        this.f102808e = (ImageView) this.f102804a.findViewById(R.id.imtcTeamCodeHelpIv);
        this.f102809f = (FrameLayout) this.f102804a.findViewById(R.id.imtcTeamCodeHelpPlayFl);
        this.f102821r = (TextView) this.f102804a.findViewById(R.id.imtcTeamCodeHelpTv);
        this.f102810g = (LinearLayout) this.f102804a.findViewById(R.id.imtcErrorContentLl);
        this.f102822s = (TextView) this.f102804a.findViewById(R.id.imtcErrorTv);
        this.f102807d.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.invitation.v2.feat.member.teamCode.C40477d.View$OnClickListenerC404781 */

            public void onClick(View view) {
                C40477d.this.mo146513e();
            }
        });
        if (C40147z.m159160a().isFgEnable("invite.member.teamcode.copy.enable")) {
            this.f102817n.setOnClickListener(new View.OnClickListener() {
                /* class com.ss.android.lark.invitation.v2.feat.member.teamCode.C40477d.View$OnClickListenerC404803 */

                public void onClick(View view) {
                    C40477d.this.mo146512d();
                }
            });
        } else {
            this.f102817n.setVisibility(8);
        }
        this.f102818o.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.invitation.v2.feat.member.teamCode.C40477d.View$OnClickListenerC404814 */

            public void onClick(View view) {
                C40477d.this.mo146511c();
            }
        });
        m160213g();
        TextView textView = this.f102815l;
        if (C40147z.m159160a().isLarkEnv()) {
            i = R.string.Lark_Invitation_TeamCodeDescriptionLark;
        } else {
            i = R.string.Lark_Invitation_TeamCodeDescriptionFeishu;
        }
        textView.setText(i);
        m160215i();
        InvHitPoint.m160329H(this.f102805b);
    }

    /* renamed from: a */
    public void setViewDelegate(C40469a.AbstractC40471b.AbstractC40472a aVar) {
        this.f102806c = aVar;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m160212a(View view) {
        C40132r.m159121c();
        InvHitPoint.m160331J(this.f102805b);
    }

    @Override // com.ss.android.lark.invitation.v2.feat.member.teamCode.C40469a.AbstractC40471b
    /* renamed from: a */
    public void mo146502a(MemberInvitationInfo memberInvitationInfo) {
        if (this.f102824u == null) {
            m160214h();
        }
        mo146501a();
        this.f102812i.mo196042e();
        this.f102814k.setVisibility(0);
        this.f102824u = memberInvitationInfo;
        m160216j();
    }

    @Override // com.ss.android.lark.invitation.v2.feat.member.teamCode.C40469a.AbstractC40471b
    /* renamed from: a */
    public void mo146503a(String str) {
        View$OnClickListenerC404792 r3;
        this.f102812i.mo196042e();
        this.f102822s.setText(str);
        this.f102810g.setVisibility(0);
        if (!UIHelper.getString(R.string.Lark_UserGrowth_InviteMemberPermissionDeny).equals(str)) {
            r3 = new View.OnClickListener() {
                /* class com.ss.android.lark.invitation.v2.feat.member.teamCode.C40477d.View$OnClickListenerC404792 */

                public void onClick(View view) {
                    C40477d.this.f102812i.mo196039b();
                    C40477d.this.f102810g.setVisibility(8);
                    C40477d.this.f102806c.mo146504a();
                }
            };
        } else {
            r3 = null;
        }
        this.f102810g.setOnClickListener(r3);
    }

    public C40477d(Activity activity, String str) {
        this.f102804a = activity;
        this.f102805b = str;
    }
}
