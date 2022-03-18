package com.ss.android.lark.member_manage.impl.show_member.common_group;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.larksuite.component.ui.dialog.C25639g;
import com.larksuite.component.ui.dialog.C25644o;
import com.larksuite.component.ui.dialog.DialogC25637f;
import com.larksuite.component.ui.dialog.LKUIListItemData;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.component.universe_design.icon.UDIconUtils;
import com.larksuite.component.universe_design.toast.UDToast;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.framework.utils.KeyboardUtils;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.ChatChatter;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.chat.entity.chatter.TagInfo;
import com.ss.android.lark.chat.entity.chatter.TagType;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.member_manage.GroupMemberManageModule;
import com.ss.android.lark.member_manage.dependency.IGroupMemberManageModuleDependency;
import com.ss.android.lark.member_manage.impl.GroupUtils;
import com.ss.android.lark.member_manage.impl.base.adapter.IFuncBinder;
import com.ss.android.lark.member_manage.impl.base.mvp.BaseGroupMemberManageView;
import com.ss.android.lark.member_manage.impl.bean.C45084c;
import com.ss.android.lark.member_manage.impl.bean.C45085e;
import com.ss.android.lark.member_manage.impl.bean.SelectBeansResult;
import com.ss.android.lark.member_manage.impl.show_member.common_group.C45190b;
import com.ss.android.lark.member_manage.impl.show_member.common_group.C45213i;
import com.ss.android.lark.member_manage.impl.statistics.GroupMemberManageExtraParams;
import com.ss.android.lark.member_manage.impl.statistics.GroupMemberManageHitPointNew;
import com.ss.android.lark.member_manage.impl.statistics.PerfGroupMemberMonitor;
import com.ss.android.lark.member_manage.impl.statistics.group.GroupHitPoint;
import com.ss.android.lark.statistics.extensions.TARGET_NONE;
import com.ss.android.lark.team.entity.Team;
import com.ss.android.lark.team.entity.TeamSetting;
import com.ss.android.lark.ui.CommonTitleBarConstants;
import com.ss.android.lark.ui.IActionTitlebar;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.listener.OnSingleClickListener;
import com.ss.android.lark.widget.p2932c.C58339d;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.lark.member_manage.impl.show_member.common_group.i */
public class C45213i extends BaseGroupMemberManageView<C45190b.AbstractC45193b.AbstractC45194a, BaseGroupMemberManageView.AbstractC45064a> implements C45190b.AbstractC45193b {

    /* renamed from: j */
    int f114426j;

    /* renamed from: k */
    IGroupMemberManageModuleDependency.AbstractC44878a f114427k = GroupMemberManageModule.m177902a().getAccountDependency();

    /* renamed from: l */
    IGroupMemberManageModuleDependency.AbstractC44882e f114428l = GroupMemberManageModule.m177902a().getChatterNameDependency();

    /* renamed from: m */
    public String f114429m;

    /* renamed from: n */
    public boolean f114430n = false;

    /* renamed from: o */
    private boolean f114431o = true;

    /* renamed from: p */
    private int f114432p;

    /* renamed from: q */
    private boolean f114433q;

    /* renamed from: r */
    private final String f114434r = "list_more_mobile";

    /* renamed from: s */
    private boolean f114435s = false;

    /* renamed from: t */
    private DialogC25637f f114436t = null;

    /* renamed from: u */
    private Team f114437u = null;

    /* renamed from: v */
    private boolean f114438v = GroupMemberManageModule.m177902a().getTeamDependency().mo143778a();

    @Override // com.ss.android.lark.member_manage.impl.base.mvp.BaseGroupMemberManageView
    /* renamed from: d */
    public int mo159409d() {
        return this.f114426j;
    }

    @Override // com.ss.android.lark.member_manage.impl.show_member.common_group.C45190b.AbstractC45193b
    /* renamed from: i */
    public boolean mo159768i() {
        return this.f114431o;
    }

    @Override // com.ss.android.lark.member_manage.impl.base.mvp.BaseGroupMemberManageView
    /* renamed from: a */
    public void mo159397a(Map<String, C45084c> map) {
        mo159403b(map);
    }

    @Override // com.ss.android.lark.member_manage.impl.show_member.common_group.C45190b.AbstractC45193b
    /* renamed from: a */
    public void mo159760a(List<String> list) {
        if (this.f114426j == 7) {
            this.f114431o = CollectionUtils.isEmpty(list);
            this.f114432p = list.size();
        }
        if (DesktopUtil.m144301a(mo159414h())) {
            this.f114431o = false;
        }
    }

    @Override // com.ss.android.lark.member_manage.impl.base.mvp.BaseGroupMemberManageView, com.ss.android.lark.member_manage.impl.base.mvp.IGroupMemberBaseContract.AbstractC45066b
    /* renamed from: a */
    public void mo159396a(String str, List<C45084c> list) {
        super.mo159396a(str, list);
        PerfGroupMemberMonitor.m179720a(PerfGroupMemberMonitor.ActionType.SEARCH, this.f114081f, null);
    }

    @Override // com.ss.android.lark.member_manage.impl.show_member.common_group.C45190b.AbstractC45193b
    /* renamed from: a */
    public void mo159761a(boolean z) {
        if (z) {
            this.f114430n = z;
            ((C45190b.AbstractC45193b.AbstractC45194a) this.f114080e).mo159461f();
            GroupMemberManageHitPointNew.m179748b();
        }
    }

    /* renamed from: a */
    public void mo159792a(String str, Boolean bool) {
        ArrayList arrayList;
        if (this.f114077b != null) {
            List<C45084c> a = this.f114077b.mo159348a();
            for (int i = 0; i < a.size(); i++) {
                C45085e g = a.get(i).mo159512g();
                if (g.mo159522a().equals(str)) {
                    if (bool.booleanValue()) {
                        arrayList = new ArrayList(g.mo159542p());
                        arrayList.add(new TagInfo(UIHelper.getString(R.string.Lark_Group_GroupAdministratorLabel), TagType.ADMIN_USER));
                    } else {
                        arrayList = new ArrayList();
                        for (TagInfo tagInfo : g.mo159542p()) {
                            if (tagInfo.getType() != TagType.ADMIN_USER) {
                                arrayList.add(tagInfo);
                            }
                        }
                    }
                    g.mo159524a(arrayList);
                    this.f114077b.notifyItemChanged(i);
                    return;
                }
            }
        }
    }

    /* access modifiers changed from: public */
    /* renamed from: u */
    private /* synthetic */ void m179462u() {
        this.mSelectedRV.setVisibility(8);
    }

    /* renamed from: o */
    private void m179456o() {
        mo159390a(new IFuncBinder.AbstractC45038a() {
            /* class com.ss.android.lark.member_manage.impl.show_member.common_group.$$Lambda$i$7JVG73xfrOSwV9dprGL6uJCdIQ */

            @Override // com.ss.android.lark.member_manage.impl.base.adapter.IFuncBinder.AbstractC45038a
            public final void onItemLongClick(C45084c cVar) {
                C45213i.m270816lambda$7JVG73xfrOSwV9dprGL6uJCdIQ(C45213i.this, cVar);
            }
        });
    }

    @Override // com.ss.android.lark.member_manage.impl.base.mvp.BaseGroupMemberManageView
    /* renamed from: e */
    public void mo159411e() {
        super.mo159411e();
        m179456o();
        m179455n();
    }

    /* renamed from: n */
    private void m179455n() {
        this.mConfirmBT.setOnClickListener(new OnSingleClickListener() {
            /* class com.ss.android.lark.member_manage.impl.show_member.common_group.C45213i.C452141 */

            @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
            public void onSingleClick(View view) {
                C45213i.this.mConfirmBT.setEnabled(false);
                GroupMemberManageHitPointNew.m179749b(GroupMemberManageExtraParams.Click.CONFIRM.plus(GroupMemberManageExtraParams.Target.IM_CHAT_SETTING_VIEW));
                ((C45190b.AbstractC45193b.AbstractC45194a) C45213i.this.f114080e).mo159460e();
            }
        });
        this.mSearchBar.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.member_manage.impl.show_member.common_group.C45213i.AnonymousClass11 */

            public void onClick(View view) {
                C45213i.this.mSearchEt.setFocusable(true);
                C45213i.this.mSearchEt.setFocusableInTouchMode(true);
                C45213i.this.mSearchEt.requestFocus();
                KeyboardUtils.showKeyboard(C45213i.this.mo159414h());
                GroupMemberManageHitPointNew.m179749b(GroupMemberManageExtraParams.Click.SEARCH.plus(TARGET_NONE.f135700a));
                GroupHitPoint.f114612b.mo159956b();
            }
        });
    }

    /* renamed from: q */
    private void m179458q() {
        this.mTitleBar.setTitle(UIHelper.getString(R.string.Lark_Groups_member));
        this.mTitleBar.setLeftClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.member_manage.impl.show_member.common_group.C45213i.AnonymousClass12 */

            public void onClick(View view) {
                KeyboardUtils.hideKeyboard(C45213i.this.mo159414h());
                C45213i.this.f114082g.mo159423a();
            }
        });
        this.mBottomDetailRL.setVisibility(8);
    }

    /* renamed from: t */
    private void m179461t() {
        if (this.f114426j == 7 && !this.f114431o) {
            this.f114077b.mo159355a(false);
            this.f114078c.mo159355a(false);
        }
    }

    @Override // com.ss.android.lark.member_manage.impl.show_member.common_group.C45190b.AbstractC45193b
    public void aU_() {
        this.mConfirmBT.setEnabled(true);
        this.f114426j = 2;
        this.f114077b.mo159358c(this.f114426j);
        this.f114078c.mo159358c(this.f114426j);
        this.mBottomDetailRL.setVisibility(8);
        this.f114079d.clear();
        this.mSelectAvatarsView.post(new Runnable() {
            /* class com.ss.android.lark.member_manage.impl.show_member.common_group.C45213i.RunnableC452163 */

            public void run() {
                C45213i.this.mSelectAvatarsView.setVisibility(8);
            }
        });
        this.mTitleBar.removeAllActions();
        mo159400b();
    }

    @Override // com.ss.android.lark.member_manage.impl.show_member.common_group.C45190b.AbstractC45193b
    public void aV_() {
        this.f114426j = 1;
        this.f114079d.clear();
        this.f114077b.mo159358c(this.f114426j);
        this.f114078c.mo159358c(this.f114426j);
        this.mBottomDetailRL.setVisibility(0);
        mo159386a(0);
        this.mTitleBar.removeAllActions();
        mo159400b();
    }

    @Override // com.ss.android.lark.member_manage.impl.show_member.common_group.C45190b.AbstractC45193b
    public void aW_() {
        this.f114431o = !this.f114431o;
        this.f114079d.clear();
        if (this.f114431o) {
            this.mSelectedRV.post(new Runnable() {
                /* class com.ss.android.lark.member_manage.impl.show_member.common_group.$$Lambda$i$CFdZGWwErmqwAOlfsW1klpMvcoQ */

                public final void run() {
                    C45213i.lambda$CFdZGWwErmqwAOlfsW1klpMvcoQ(C45213i.this);
                }
            });
        } else {
            this.mSelectedRV.setVisibility(0);
        }
        this.f114077b.mo159355a(this.f114431o);
        this.f114078c.mo159355a(this.f114431o);
        this.mTitleBar.removeAllActions();
        mo159400b();
    }

    @Override // com.ss.android.lark.member_manage.impl.base.mvp.BaseGroupMemberManageView
    /* renamed from: b */
    public void mo159400b() {
        this.mConfirmBT.setVisibility(4);
        int i = this.f114426j;
        if (i == 1) {
            m179460s();
        } else if (i == 2) {
            m179459r();
        } else if (i == 7) {
            m179457p();
        } else if (i == 11) {
            m179458q();
        }
        if (DesktopUtil.m144307b()) {
            this.mTitleBar.setLeftImageResource(CommonTitleBarConstants.ICON_CLOSE);
        }
    }

    /* renamed from: l */
    public void mo159643l() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C58339d.C58341a(UIHelper.getString(R.string.Lark_Legacy_Add), new C58339d.AbstractC58343b() {
            /* class com.ss.android.lark.member_manage.impl.show_member.common_group.C45213i.AnonymousClass16 */

            @Override // com.ss.android.lark.widget.p2932c.C58339d.AbstractC58343b
            public void onMenuItemClick() {
                C45213i.this.mo159572k();
            }
        }));
        arrayList.add(new C58339d.C58341a(UIHelper.getString(R.string.Lark_Legacy_Remove), new C58339d.AbstractC58343b() {
            /* class com.ss.android.lark.member_manage.impl.show_member.common_group.C45213i.AnonymousClass17 */

            @Override // com.ss.android.lark.widget.p2932c.C58339d.AbstractC58343b
            public void onMenuItemClick() {
                GroupMemberManageModule.m177902a().getChatSettingDependency().mo143813a(C45213i.this.f114429m, "list_more_mobile");
                if (!C45213i.this.mo159644m()) {
                    ((C45190b.AbstractC45193b.AbstractC45194a) C45213i.this.f114080e).mo159461f();
                }
            }
        }).mo197568a(R.color.function_danger_500));
        C58339d.m226198b(mo159414h(), arrayList, true);
    }

    /* renamed from: s */
    private void m179460s() {
        int i;
        if (this.f114433q) {
            i = R.string.Lark_Groups_DeleteCircleMemberDialogTitle;
        } else {
            i = R.string.Lark_Legacy_GroupReduceMemberTitle;
        }
        this.mTitleBar.setTitle(UIHelper.getString(i));
        this.mTitleBar.addAction(new IActionTitlebar.TextAction(UIHelper.getString(R.string.Lark_Legacy_Cancel), R.color.text_title) {
            /* class com.ss.android.lark.member_manage.impl.show_member.common_group.C45213i.AnonymousClass18 */

            @Override // com.ss.android.lark.ui.IActionTitlebar.Action, com.ss.android.lark.ui.IActionTitlebar.BaseAction
            public void performAction(View view) {
                super.performAction(view);
                GroupMemberManageHitPointNew.m179749b(GroupMemberManageExtraParams.Click.CANCEL.plus(GroupMemberManageExtraParams.Target.IM_CHAT_SETTING_VIEW));
                ((C45190b.AbstractC45193b.AbstractC45194a) C45213i.this.f114080e).mo159461f();
            }
        });
        this.f114076a = this.mTitleBar.getRightText();
        this.f114076a.setPadding(0, 0, UIUtils.dp2px(mo159414h(), 15.0f), 0);
        this.mTitleBar.setLeftClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.member_manage.impl.show_member.common_group.C45213i.View$OnClickListenerC452152 */

            public void onClick(View view) {
                KeyboardUtils.hideKeyboard(C45213i.this.mo159414h());
                if (!(C45213i.this.f114080e instanceof C45190b.AbstractC45193b.AbstractC45194a)) {
                    return;
                }
                if (C45213i.this.f114430n) {
                    C45213i.this.f114082g.mo159423a();
                } else {
                    ((C45190b.AbstractC45193b.AbstractC45194a) C45213i.this.f114080e).mo159772g();
                }
            }
        });
        this.f114076a.setVisibility(0);
    }

    /* renamed from: m */
    public boolean mo159644m() {
        int i;
        String b = GroupMemberManageModule.m177902a().getAccountDependency().mo143795b();
        boolean z = false;
        if (!this.f114081f.isTeam() || !this.f114438v) {
            return false;
        }
        Team team = this.f114437u;
        if (team != null && String.valueOf(team.getOwnerId()).equals(b)) {
            z = true;
        }
        if (z) {
            i = R.string.Project_T_CannotAddOrLeave;
        } else {
            i = R.string.Project_MV_DueToAdminSet;
        }
        UDToast.makeToast(mo159414h(), i).show();
        return true;
    }

    /* renamed from: p */
    private void m179457p() {
        this.mBottomDetailRL.setVisibility(8);
        this.mTitleBar.setLeftImageDrawable(UIUtils.getDrawable(mo159414h(), R.drawable.titlebar_close_bg_selector));
        this.mTitleBar.setTitle(UIHelper.getString(R.string.Lark_Legacy_SelectLark));
        int i = this.f114432p;
        if (i != 0) {
            mo159394a(UIHelper.mustacheFormat((int) R.string.Lark_Legacy_SelectConfirm, "select_count", Integer.toString(i)), R.color.primary_pri_500);
            this.f114076a.setEnabled(true);
        } else if (this.f114431o) {
            mo159387a(R.string.Lark_Legacy_MultipleChoice, R.color.text_title);
            this.f114076a.setEnabled(true);
        } else {
            mo159387a(R.string.Lark_Legacy_LarkConfirm, R.color.primary_pri_300);
            this.f114076a.setEnabled(false);
        }
        this.mTitleBar.setLeftClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.member_manage.impl.show_member.common_group.$$Lambda$i$szckKu1dkjy5iMAS6zmldosBbQc */

            public final void onClick(View view) {
                C45213i.lambda$szckKu1dkjy5iMAS6zmldosBbQc(C45213i.this, view);
            }
        });
        if ((mo159414h() instanceof Activity) && ((Activity) mo159414h()).getIntent().getBooleanExtra("key_single_choice", false)) {
            this.f114076a.setVisibility(8);
        }
    }

    /* renamed from: r */
    private void m179459r() {
        int i;
        if (this.f114433q) {
            i = R.string.Lark_Groups_member;
        } else {
            i = R.string.Lark_Legacy_GroupShowMemberTitle;
        }
        this.mBottomDetailRL.setVisibility(8);
        this.mTitleBar.setTitle(UIHelper.getString(i));
        this.mTitleBar.setLeftClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.member_manage.impl.show_member.common_group.C45213i.AnonymousClass13 */

            public void onClick(View view) {
                KeyboardUtils.hideKeyboard(C45213i.this.mo159414h());
                C45213i.this.f114082g.mo159423a();
            }
        });
        Chat.AddMemberPermission addMemberPermission = this.f114081f.getAddMemberPermission();
        if ((!GroupUtils.m178040b(this.f114081f) && addMemberPermission != Chat.AddMemberPermission.ALL_MEMBERS) || this.f114435s) {
            return;
        }
        if (!GroupUtils.m178040b(this.f114081f) || this.f114081f.getMemberCount() <= 1) {
            this.mTitleBar.addAction(new IActionTitlebar.TextAction(UIHelper.getString(R.string.Lark_Legacy_Add), R.color.text_title) {
                /* class com.ss.android.lark.member_manage.impl.show_member.common_group.C45213i.AnonymousClass14 */

                @Override // com.ss.android.lark.ui.IActionTitlebar.Action, com.ss.android.lark.ui.IActionTitlebar.BaseAction
                public void performAction(View view) {
                    super.performAction(view);
                    KeyboardUtils.hideKeyboard(C45213i.this.mo159414h());
                    C45213i.this.mo159572k();
                }
            });
            return;
        }
        this.mTitleBar.addAction(new IActionTitlebar.C57573a(UDIconUtils.getIconDrawable(mo159414h(), (int) R.drawable.ud_icon_more_outlined, UIUtils.getColor(mo159414h(), R.color.icon_n1))) {
            /* class com.ss.android.lark.member_manage.impl.show_member.common_group.C45213i.AnonymousClass15 */

            @Override // com.ss.android.lark.ui.IActionTitlebar.Action, com.ss.android.lark.ui.IActionTitlebar.BaseAction
            public void performAction(View view) {
                super.performAction(view);
                KeyboardUtils.hideKeyboard(C45213i.this.mo159414h());
                C45213i.this.mo159643l();
            }
        });
    }

    /* renamed from: k */
    public void mo159572k() {
        boolean z;
        int i;
        if (this.f114081f.isTeam() && this.f114438v) {
            String b = GroupMemberManageModule.m177902a().getAccountDependency().mo143795b();
            Team team = this.f114437u;
            boolean z2 = true;
            if (team == null || !String.valueOf(team.getOwnerId()).equals(b)) {
                z = false;
            } else {
                z = true;
            }
            Team team2 = this.f114437u;
            if (team2 == null || team2.getTeamSetting() == null || this.f114437u.getTeamSetting().getAddMemberPermission() != TeamSetting.AddMemberPermission.ALL_MEMBERS) {
                z2 = false;
            }
            if (z2 || z) {
                i = R.string.Project_T_CannotAddOrLeave;
            } else {
                i = R.string.Project_MV_TeamMembersUnableToAdd;
            }
            UDToast.show(mo159414h(), i);
        } else if (this.f114081f.isSecret() || !this.f114081f.isCrossTenant()) {
            this.f114082g.mo159426a(this.f114081f, this.f114081f.isEdu(), 10006, "list_more_mobile");
        } else {
            this.f114082g.mo159425a(this.f114081f, "list_more_mobile");
        }
    }

    @Override // com.ss.android.lark.member_manage.impl.show_member.common_group.C45190b.AbstractC45193b
    /* renamed from: a */
    public void mo159759a(Team team) {
        this.f114437u = team;
    }

    /* renamed from: b */
    public void mo159793b(int i) {
        this.f114426j = i;
    }

    @Override // com.ss.android.lark.member_manage.impl.show_member.common_group.C45190b.AbstractC45193b
    /* renamed from: c */
    public void mo159570c(List<ChatChatter> list) {
        this.f114082g.mo159431a(list);
    }

    @Override // com.ss.android.lark.member_manage.impl.base.mvp.IGroupMemberBaseContract.AbstractC45066b
    /* renamed from: d */
    public void mo159449d(SelectBeansResult dVar) {
        b_(dVar);
        a_(dVar);
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m179444a(View view) {
        KeyboardUtils.hideKeyboard(mo159414h());
        this.f114082g.mo159423a();
    }

    @Override // com.ss.android.lark.member_manage.impl.base.mvp.IGroupMemberBaseContract.AbstractC45066b
    /* renamed from: b */
    public void mo159448b(List<C45084c> list) {
        b_(list);
    }

    /* renamed from: e */
    private void m179453e(String str) {
        GroupMemberManageModule.m177902a().getChatterDependency().mo143782a(str, new IGetDataCallback<Chatter>() {
            /* class com.ss.android.lark.member_manage.impl.show_member.common_group.C45213i.C452229 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                UDToast.show(C45213i.this.mo159414h(), errorResult.getDisplayMsg());
            }

            /* renamed from: a */
            public void onSuccess(Chatter chatter) {
                new C25639g(C45213i.this.mo159414h()).mo89248g(R.string.Lark_Legacy_ChangeOwner).mo89238b(true).mo89251j(2).mo89242c(UIHelper.mustacheFormat((int) R.string.Lark_Legacy_ChatGroupInfoTransferSure, "group_owner", GroupMemberManageModule.m177902a().getChatterNameDependency().mo143789a(chatter))).mo89224a(R.id.lkui_dialog_btn_left, R.string.Lark_Legacy_Cancel, (DialogInterface.OnClickListener) null).mo89224a(R.id.lkui_dialog_btn_right, R.string.Lark_Legacy_Confirm, new DialogInterface.OnClickListener(chatter) {
                    /* class com.ss.android.lark.member_manage.impl.show_member.common_group.$$Lambda$i$9$mBqUCgik92IwhlPXtky170yX4fE */
                    public final /* synthetic */ Chatter f$1;

                    {
                        this.f$1 = r2;
                    }

                    public final void onClick(DialogInterface dialogInterface, int i) {
                        C45213i.C452229.lambda$mBqUCgik92IwhlPXtky170yX4fE(C45213i.C452229.this, this.f$1, dialogInterface, i);
                    }
                }).mo89239c();
            }

            /* access modifiers changed from: public */
            /* renamed from: a */
            private /* synthetic */ void m179488a(Chatter chatter, DialogInterface dialogInterface, int i) {
                ((C45190b.AbstractC45193b.AbstractC45194a) C45213i.this.f114080e).mo159770a(chatter.getId(), new IGetDataCallback<Chat>() {
                    /* class com.ss.android.lark.member_manage.impl.show_member.common_group.C45213i.C452229.C452231 */

                    @Override // com.larksuite.framework.callback.IGetDataCallback
                    public void onError(ErrorResult errorResult) {
                        UDToast.show(C45213i.this.mo159414h(), (int) R.string.Lark_Legacy_ChangeOwnerFailed);
                    }

                    /* renamed from: a */
                    public void onSuccess(Chat chat) {
                        ((C45190b.AbstractC45193b.AbstractC45194a) C45213i.this.f114080e).mo159769a(chat, new IGetDataCallback<SelectBeansResult>() {
                            /* class com.ss.android.lark.member_manage.impl.show_member.common_group.C45213i.C452229.C452231.C452241 */

                            @Override // com.larksuite.framework.callback.IGetDataCallback
                            public void onError(ErrorResult errorResult) {
                            }

                            /* renamed from: a */
                            public void onSuccess(SelectBeansResult dVar) {
                                C45213i.this.mo159449d(dVar);
                            }
                        });
                        UDToast.show(C45213i.this.mo159414h(), (int) R.string.Lark_Legacy_ChangeOwnerSuccess);
                    }
                });
                GroupHitPoint.f114612b.mo159960c(C45213i.this.f114081f, GroupHitPoint.GroupMemberAction.TRANSFER_OWNER);
            }
        });
        GroupHitPoint.f114612b.mo159958b(this.f114081f, GroupHitPoint.GroupMemberAction.TRANSFER_OWNER);
    }

    /* renamed from: b */
    public void mo159794b(boolean z) {
        this.f114435s = z;
    }

    @Override // com.ss.android.lark.member_manage.impl.show_member.common_group.C45190b.AbstractC45193b
    /* renamed from: c */
    public void mo159765c(SelectBeansResult dVar) {
        this.f114081f.setMemberCount(dVar.mo159516b().size());
        mo159449d(dVar);
        this.mTitleBar.removeAllActions();
        mo159400b();
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private void m179445a(C45084c cVar) {
        if (this.f114426j != 2 || this.f114081f.isSecret() || this.f114435s || !GroupUtils.m178040b(this.f114081f)) {
            return;
        }
        if (GroupUtils.m178039a(this.f114081f)) {
            m179450b(cVar);
        } else {
            m179451c(cVar);
        }
    }

    @Override // com.ss.android.lark.member_manage.impl.base.mvp.BaseGroupMemberManageView
    /* renamed from: c */
    public void mo159408c(Map<String, C45084c> map) {
        super.mo159408c(map);
        if (this.f114426j == 7) {
            this.f114076a.setVisibility(0);
            if (this.f114432p == 0) {
                m179454e(map);
            } else {
                m179452d(map);
            }
        }
    }

    @Override // com.ss.android.lark.member_manage.impl.show_member.common_group.C45190b.AbstractC45193b
    public void e_(final int i) {
        if (i > 0) {
            View inflate = LayoutInflater.from(mo159414h()).inflate(R.layout.layout_inactive_banner, (ViewGroup) null);
            ((TextView) inflate.findViewById(R.id.tips_tv)).setText(UIHelper.getQuantityString(R.plurals.Lark_Education_ClassXParentsInactive, i));
            inflate.setOnClickListener(new OnSingleClickListener() {
                /* class com.ss.android.lark.member_manage.impl.show_member.common_group.C45213i.C452174 */

                @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
                public void onSingleClick(View view) {
                    GroupHitPoint.f114612b.mo159961d();
                    C45213i.this.f114082g.mo159424a(view.getContext(), C45213i.this.f114429m, i);
                }
            });
            this.mBannerContainer.addView(inflate);
            this.mBannerContainer.setVisibility(0);
        }
    }

    /* renamed from: b */
    private void m179450b(C45084c cVar) {
        DialogC25637f fVar = this.f114436t;
        if (fVar != null) {
            fVar.dismiss();
            this.f114436t = null;
        }
        if (cVar.mo159512g() != null && !cVar.mo159508d()) {
            boolean f = cVar.mo159511f();
            DialogC25637f b = ((C25644o) ((C25644o) ((C25644o) new C25644o(mo159414h()).mo89205a(new ArrayList<LKUIListItemData>(f) {
                /* class com.ss.android.lark.member_manage.impl.show_member.common_group.C45213i.C452185 */
                final /* synthetic */ boolean val$isAdmin;

                {
                    LKUIListItemData nVar;
                    this.val$isAdmin = r3;
                    add(new LKUIListItemData(UIHelper.getString(R.string.Lark_Legacy_AssignGroupOwner)));
                    if (r3) {
                        nVar = new LKUIListItemData(UIHelper.getString(R.string.Lark_Legacy_RemoveGroupAdmins));
                        nVar.mo89289b(R.color.function_danger_500);
                    } else {
                        nVar = new LKUIListItemData(UIHelper.getString(R.string.Lark_Legacy_AssignGroupAdmin));
                    }
                    add(nVar);
                    LKUIListItemData nVar2 = new LKUIListItemData(UIHelper.getString(R.string.Lark_Legacy_RemoveMember));
                    nVar2.mo89289b(R.color.function_danger_500);
                    add(nVar2);
                }
            })).mo89224a(R.id.lkui_dialog_btn_cancel, R.string.Lark_Legacy_Cancel, $$Lambda$i$Q0NAQjwwKagS8KijajS4oM9CA1A.INSTANCE)).mo89202a(new DialogInterface.OnClickListener(cVar, f) {
                /* class com.ss.android.lark.member_manage.impl.show_member.common_group.$$Lambda$i$GwLoA1iH_UiTEgHiSseLFR7deGg */
                public final /* synthetic */ C45084c f$1;
                public final /* synthetic */ boolean f$2;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                }

                public final void onClick(DialogInterface dialogInterface, int i) {
                    C45213i.lambda$GwLoA1iH_UiTEgHiSseLFR7deGg(C45213i.this, this.f$1, this.f$2, dialogInterface, i);
                }
            })).mo89233b();
            this.f114436t = b;
            b.show();
        }
    }

    /* renamed from: c */
    private void m179451c(C45084c cVar) {
        DialogC25637f fVar = this.f114436t;
        if (fVar != null) {
            fVar.dismiss();
            this.f114436t = null;
        }
        if (cVar.mo159512g() != null && !cVar.mo159508d() && !cVar.mo159511f()) {
            DialogC25637f b = ((C25644o) ((C25644o) ((C25644o) new C25644o(mo159414h()).mo89205a(new ArrayList<LKUIListItemData>() {
                /* class com.ss.android.lark.member_manage.impl.show_member.common_group.C45213i.C452207 */

                {
                    LKUIListItemData nVar = new LKUIListItemData(UIHelper.getString(R.string.Lark_Legacy_RemoveMember));
                    nVar.mo89289b(R.color.function_danger_500);
                    add(nVar);
                }
            })).mo89224a(R.id.lkui_dialog_btn_cancel, R.string.Lark_Legacy_Cancel, $$Lambda$i$uSVav36GUr_WCGTd1ll2Qz5UY.INSTANCE)).mo89202a(new DialogInterface.OnClickListener(cVar) {
                /* class com.ss.android.lark.member_manage.impl.show_member.common_group.$$Lambda$i$OSb3fQ_XzEs6bAJ5B0SZB9mMOM4 */
                public final /* synthetic */ C45084c f$1;

                {
                    this.f$1 = r2;
                }

                public final void onClick(DialogInterface dialogInterface, int i) {
                    C45213i.lambda$OSb3fQ_XzEs6bAJ5B0SZB9mMOM4(C45213i.this, this.f$1, dialogInterface, i);
                }
            })).mo89233b();
            this.f114436t = b;
            b.show();
        }
    }

    /* renamed from: d */
    private void m179452d(Map<String, C45084c> map) {
        this.f114076a.setEnabled(true);
        if (CollectionUtils.isEmpty(map.keySet())) {
            this.f114076a.setText(UIHelper.getString(R.string.Lark_Legacy_LarkConfirm));
        } else {
            this.f114076a.setText(UIHelper.mustacheFormat((int) R.string.Lark_Legacy_SelectConfirm, "select_count", Integer.toString(map.keySet().size())));
        }
        this.f114076a.setTextColor(UIUtils.getColor(mo159414h(), R.color.primary_pri_500));
    }

    /* renamed from: e */
    private void m179454e(Map<String, C45084c> map) {
        if (this.f114431o) {
            this.f114076a.setEnabled(true);
            this.f114076a.setText(UIHelper.getString(R.string.Lark_Legacy_MultipleChoice));
            this.f114076a.setTextColor(UIUtils.getColor(mo159414h(), R.color.text_title));
        } else if (CollectionUtils.isEmpty(map.keySet())) {
            this.f114076a.setEnabled(false);
            this.f114076a.setText(UIHelper.getString(R.string.Lark_Legacy_LarkConfirm));
            this.f114076a.setTextColor(UIUtils.getColor(mo159414h(), R.color.primary_pri_300));
        } else {
            this.f114076a.setEnabled(true);
            this.f114076a.setText(UIHelper.mustacheFormat((int) R.string.Lark_Legacy_SelectConfirm, "select_count", Integer.toString(map.keySet().size())));
            this.f114076a.setTextColor(UIUtils.getColor(mo159414h(), R.color.primary_pri_500));
        }
    }

    @Override // com.ss.android.lark.member_manage.impl.show_member.common_group.C45190b.AbstractC45193b
    /* renamed from: a */
    public void mo159757a(ErrorResult errorResult) {
        LKUIToast.show(mo159414h(), UIHelper.getString(R.string.Lark_Legacy_GroupDeleteMemberFailTip));
        this.mConfirmBT.setEnabled(true);
        PerfGroupMemberMonitor.m179720a(PerfGroupMemberMonitor.ActionType.DELETE, this.f114081f, errorResult);
    }

    @Override // com.ss.android.lark.member_manage.impl.base.mvp.IGroupMemberBaseContract.AbstractC45066b
    /* renamed from: a */
    public void mo159447a(Chat chat) {
        this.f114081f = chat;
        mo159385a();
        m179461t();
        if (mo159409d() == 2) {
            GroupHitPoint.f114612b.mo159951a(chat);
        }
    }

    @Override // com.ss.android.lark.member_manage.impl.show_member.common_group.C45190b.AbstractC45193b
    /* renamed from: a */
    public void mo159758a(SelectBeansResult dVar) {
        this.f114081f.setMemberCount(dVar.mo159516b().size());
        this.mConfirmBT.setEnabled(true);
        this.f114077b.mo159357b();
        mo159449d(dVar);
        PerfGroupMemberMonitor.m179720a(PerfGroupMemberMonitor.ActionType.DELETE, this.f114081f, null);
    }

    /* renamed from: a */
    private void m179447a(final C45084c cVar, final boolean z) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (z) {
            arrayList.add(cVar.mo159513h());
        } else {
            arrayList2.add(cVar.mo159513h());
        }
        ((C45200g) this.f114080e).mo159775a(this.f114429m, arrayList, arrayList2, new IGetDataCallback<Boolean>() {
            /* class com.ss.android.lark.member_manage.impl.show_member.common_group.C45213i.AnonymousClass10 */

            /* renamed from: a */
            public void onSuccess(Boolean bool) {
                int i;
                C45213i.this.mo159792a(cVar.mo159513h(), Boolean.valueOf(z));
                Context h = C45213i.this.mo159414h();
                if (z) {
                    i = R.string.Lark_Legacy_GroupAdminAdded;
                } else {
                    i = R.string.Lark_Legacy_GroupAdminRemoved;
                }
                LKUIToast.show(h, UIHelper.getString(i));
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                int i;
                if (!TextUtils.isEmpty(errorResult.getDisplayMsg())) {
                    LKUIToast.show(C45213i.this.mo159414h(), errorResult.getDisplayMsg());
                    return;
                }
                Context h = C45213i.this.mo159414h();
                if (z) {
                    i = R.string.Lark_Legacy_GroupAdminAddFailedToast;
                } else {
                    i = R.string.Lark_Legacy_UnableToRemoveToast;
                }
                LKUIToast.show(h, i);
            }
        });
    }

    @Override // com.ss.android.lark.member_manage.impl.base.mvp.BaseGroupMemberManageView, com.ss.android.lark.member_manage.impl.base.mvp.IGroupMemberBaseContract.AbstractC45066b
    /* renamed from: a */
    public void mo159395a(String str, ErrorResult errorResult) {
        super.mo159395a(str, errorResult);
        PerfGroupMemberMonitor.m179720a(PerfGroupMemberMonitor.ActionType.SEARCH, this.f114081f, errorResult);
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m179446a(C45084c cVar, DialogInterface dialogInterface, int i) {
        if (i == 0 && !mo159644m()) {
            ((C45190b.AbstractC45193b.AbstractC45194a) this.f114080e).mo159771a(new ArrayList<String>(cVar) {
                /* class com.ss.android.lark.member_manage.impl.show_member.common_group.C45213i.C452218 */
                final /* synthetic */ C45084c val$item;

                {
                    this.val$item = r2;
                    add(r2.mo159513h());
                }
            });
            GroupHitPoint.f114612b.mo159952a(this.f114081f, GroupHitPoint.GroupMemberAction.DELETE_GROUP_MEMBERS);
        }
    }

    public C45213i(Activity activity, BaseGroupMemberManageView.AbstractC45064a aVar, boolean z, String str) {
        super(activity, aVar);
        this.f114433q = z;
        this.f114429m = str;
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m179448a(C45084c cVar, boolean z, DialogInterface dialogInterface, int i) {
        GroupHitPoint.GroupMemberAction groupMemberAction;
        Team team;
        if (i == 0) {
            if (!this.f114438v || this.f114081f == null || !this.f114081f.isTeam() || (team = this.f114437u) == null || !String.valueOf(team.getDefaultChatId()).equals(this.f114081f.getId())) {
                m179453e(cVar.mo159513h());
                GroupHitPoint.f114612b.mo159952a(this.f114081f, GroupHitPoint.GroupMemberAction.TRANSFER_OWNER);
                return;
            }
            UDToast.show(mo159414h(), (int) R.string.Project_MV_MustBeAligned);
        } else if (i == 1) {
            m179447a(cVar, !z);
            GroupHitPoint.Companion aVar = GroupHitPoint.f114612b;
            Chat chat = this.f114081f;
            if (z) {
                groupMemberAction = GroupHitPoint.GroupMemberAction.DELETE_ADMIN;
            } else {
                groupMemberAction = GroupHitPoint.GroupMemberAction.ASSIGN_ADMIN;
            }
            aVar.mo159952a(chat, groupMemberAction);
        } else if (i == 2 && !mo159644m()) {
            ((C45190b.AbstractC45193b.AbstractC45194a) this.f114080e).mo159771a(new ArrayList<String>(cVar) {
                /* class com.ss.android.lark.member_manage.impl.show_member.common_group.C45213i.C452196 */
                final /* synthetic */ C45084c val$item;

                {
                    this.val$item = r2;
                    add(r2.mo159513h());
                }
            });
            GroupHitPoint.f114612b.mo159952a(this.f114081f, GroupHitPoint.GroupMemberAction.DELETE_GROUP_MEMBERS);
        }
    }
}
