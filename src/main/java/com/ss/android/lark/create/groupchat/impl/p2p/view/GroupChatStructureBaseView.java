package com.ss.android.lark.create.groupchat.impl.p2p.view;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentManager;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.component.universe_design.checkbox.UDCheckBox;
import com.larksuite.suite.R;
import com.ss.android.lark.contact.entity.Department;
import com.ss.android.lark.create.groupchat.impl.info.OnBusinessConsumeItemClick;
import com.ss.android.lark.create.groupchat.impl.p2p.AbstractC36349b;
import com.ss.android.lark.create.groupchat.impl.util.GroupFGUtils;
import com.ss.android.lark.search.widget.BasePicker;
import com.ss.android.lark.search.widget.ChatterPicker;
import com.ss.android.lark.search.widget.constants.PickerUseCategory;
import com.ss.android.lark.search.widget.constants.PickerUsePage;
import com.ss.android.lark.search.widget.params.ChatterPickerParams;
import com.ss.android.lark.search.widget.reporter.PickerReporterDelegate;
import com.ss.android.lark.searchcommon.dto.info.SearchBaseInfo;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.ui.CommonTitleBarConstants;
import com.ss.android.lark.widget.listener.OnSingleClickListener;
import java.util.ArrayList;
import java.util.List;

public abstract class GroupChatStructureBaseView implements AbstractC36349b.AbstractC36351b {

    /* renamed from: a */
    protected boolean f93818a;

    /* renamed from: b */
    AbstractC36349b.AbstractC36351b.AbstractC36352a f93819b;

    /* renamed from: c */
    AbstractC36362a f93820c;

    /* renamed from: d */
    Activity f93821d;
    ViewGroup mBottomDetailLayout;
    ChatterPicker mChatterPicker;
    TextView mConfirmBT;
    TextView mP2pBuildGroupTipTV;
    TextView mSelectCountTV;
    UDCheckBox mSyncMsgCB;
    View mSyncMsgLL;
    CommonTitleBar mTitleBar;

    /* renamed from: com.ss.android.lark.create.groupchat.impl.p2p.view.GroupChatStructureBaseView$a */
    public interface AbstractC36362a {
        /* renamed from: a */
        void mo134130a();

        /* renamed from: a */
        void mo134131a(Intent intent);

        /* renamed from: a */
        void mo134132a(AbstractC36349b.AbstractC36351b bVar);

        /* renamed from: a */
        void mo134133a(String str);

        /* renamed from: a */
        void mo134134a(List<SearchBaseInfo> list);

        /* renamed from: b */
        FragmentManager mo134135b();

        /* renamed from: c */
        void mo134136c();

        /* renamed from: d */
        Context mo134137d();
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public abstract void mo134148h();

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public abstract void mo134149i();

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public abstract void mo134150j();

    @Override // com.ss.android.lark.create.groupchat.impl.p2p.AbstractC36349b.AbstractC36351b
    /* renamed from: g */
    public Context mo134118g() {
        return this.f93821d;
    }

    /* renamed from: n */
    private boolean m143300n() {
        return !this.f93818a;
    }

    @Override // com.ss.android.lark.create.groupchat.impl.p2p.AbstractC36349b.AbstractC36351b
    /* renamed from: b */
    public boolean mo134113b() {
        return this.mSyncMsgCB.isChecked();
    }

    @Override // com.ss.android.lark.create.groupchat.impl.p2p.AbstractC36349b.AbstractC36351b
    /* renamed from: c */
    public Department mo134114c() {
        return this.mChatterPicker.getCurDepartment();
    }

    @Override // com.ss.android.lark.create.groupchat.impl.p2p.AbstractC36349b.AbstractC36351b
    /* renamed from: d */
    public int mo134115d() {
        return this.mChatterPicker.getFragmentType();
    }

    @Override // com.ss.android.lark.create.groupchat.impl.p2p.AbstractC36349b.AbstractC36351b
    /* renamed from: f */
    public String mo134117f() {
        return this.mChatterPicker.getQuery();
    }

    /* renamed from: k */
    private void m143297k() {
        m143298l();
        m143299m();
        m143301o();
        mo134150j();
    }

    /* renamed from: o */
    private void m143301o() {
        this.mConfirmBT.setOnClickListener(new OnSingleClickListener() {
            /* class com.ss.android.lark.create.groupchat.impl.p2p.view.GroupChatStructureBaseView.C363614 */

            @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
            public void onSingleClick(View view) {
                GroupChatStructureBaseView.this.mConfirmBT.setEnabled(false);
                GroupChatStructureBaseView.this.f93820c.mo134136c();
                GroupChatStructureBaseView.this.f93819b.mo134124c();
            }
        });
        mo134149i();
    }

    /* renamed from: p */
    private int m143302p() {
        if (m143300n()) {
            return R.string.Lark_Group_SearchContactsDepartmentsMyGroups;
        }
        return R.string.Lark_Legacy_Search;
    }

    @Override // com.ss.android.lark.create.groupchat.impl.p2p.AbstractC36349b.AbstractC36351b
    /* renamed from: a */
    public void mo134107a() {
        this.mConfirmBT.setEnabled(true);
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        this.f93820c.mo134132a(this);
        m143297k();
    }

    @Override // com.ss.android.lark.create.groupchat.impl.p2p.AbstractC36349b.AbstractC36351b
    /* renamed from: e */
    public void mo134116e() {
        if (this.mChatterPicker.mo183501f()) {
            this.f93821d.finish();
        }
    }

    /* renamed from: l */
    private void m143298l() {
        this.mTitleBar.setLeftTextOnly(CommonTitleBarConstants.Lark_Legacy_Cancel);
        this.mTitleBar.setLeftClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.create.groupchat.impl.p2p.view.$$Lambda$GroupChatStructureBaseView$BAfExZB1NtzsfFYrvX1v7T7CQM8 */

            public final void onClick(View view) {
                GroupChatStructureBaseView.lambda$BAfExZB1NtzsfFYrvX1v7T7CQM8(GroupChatStructureBaseView.this, view);
            }
        });
        mo134148h();
    }

    /* access modifiers changed from: public */
    /* renamed from: q */
    private /* synthetic */ ChatterPickerParams m143303q() {
        return new ChatterPickerParams.Builder().mo183676h(true).mo183668d(true).mo183673f(GroupFGUtils.m142840d()).mo183664b(this.f93819b.mo134126e()).mo183675g();
    }

    /* renamed from: m */
    private void m143299m() {
        ((ChatterPicker) ((ChatterPicker) ((ChatterPicker) ((ChatterPicker) ((ChatterPicker) ((ChatterPicker) ((ChatterPicker) ((ChatterPicker) ((ChatterPicker) ((ChatterPicker) ((ChatterPicker) ((ChatterPicker) ((ChatterPicker) ((ChatterPicker) this.mChatterPicker.mo183563a(PickerUsePage.CREATE_GROUP_FROM_P2P)).mo183562a(PickerUseCategory.GROUP)).mo183604p(true)).mo183561a(new BasePicker.OnPickerParamsLoader() {
            /* class com.ss.android.lark.create.groupchat.impl.p2p.view.$$Lambda$GroupChatStructureBaseView$9e23gJj6A3q9qEfz6EszPICCcVM */

            @Override // com.ss.android.lark.search.widget.BasePicker.OnPickerParamsLoader
            public final Object onLoadPickerParams() {
                return GroupChatStructureBaseView.lambda$9e23gJj6A3q9qEfz6EszPICCcVM(GroupChatStructureBaseView.this);
            }
        })).mo183559a(new BasePicker.IOnPickNotify() {
            /* class com.ss.android.lark.create.groupchat.impl.p2p.view.GroupChatStructureBaseView.C363603 */

            @Override // com.ss.android.lark.search.widget.BasePicker.IOnPickNotify
            /* renamed from: a */
            public void mo110050a(String str, SearchBaseInfo searchBaseInfo) {
                GroupChatStructureBaseView.this.f93819b.mo134120a(str, searchBaseInfo);
            }

            @Override // com.ss.android.lark.search.widget.BasePicker.IOnPickNotify
            /* renamed from: b */
            public void mo110052b(String str, SearchBaseInfo searchBaseInfo) {
                GroupChatStructureBaseView.this.f93819b.mo134123b(str, searchBaseInfo);
            }

            @Override // com.ss.android.lark.search.widget.BasePicker.IOnPickNotify
            /* renamed from: a */
            public void mo110051a(List<String> list, List<SearchBaseInfo> list2) {
                GroupChatStructureBaseView.this.f93819b.mo134121a(list, list2);
            }
        })).mo183492b(false)).mo183496d(true)).mo183494c(m143300n())).mo183513i(m143300n()).mo183570b(m143302p())).mo183491b(this.f93819b.mo134127f())).mo183560a(new BasePicker.IViewDependency() {
            /* class com.ss.android.lark.create.groupchat.impl.p2p.view.GroupChatStructureBaseView.C363592 */

            @Override // com.ss.android.lark.search.widget.BasePicker.IViewDependency
            /* renamed from: b */
            public Activity mo110056b() {
                return GroupChatStructureBaseView.this.f93821d;
            }

            @Override // com.ss.android.lark.search.widget.BasePicker.IViewDependency
            /* renamed from: c */
            public FragmentManager mo110057c() {
                return GroupChatStructureBaseView.this.f93820c.mo134135b();
            }
        })).mo183564a(new PickerReporterDelegate() {
            /* class com.ss.android.lark.create.groupchat.impl.p2p.view.GroupChatStructureBaseView.C363581 */

            @Override // com.ss.android.lark.search.widget.reporter.PickerReporterDelegate
            /* renamed from: a */
            public void mo132343a() {
                GroupChatStructureBaseView.this.f93819b.mo134122b();
            }
        })).mo183565a(new OnBusinessConsumeItemClick(this.f93821d))).mo183518n(true)).mo183483a();
        this.mChatterPicker.mo183573b(new ArrayList(this.f93819b.mo134128g().values()));
    }

    /* renamed from: a */
    public void setViewDelegate(AbstractC36349b.AbstractC36351b.AbstractC36352a aVar) {
        this.f93819b = aVar;
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m143296a(View view) {
        this.f93819b.mo134119a();
    }

    @Override // com.ss.android.lark.create.groupchat.impl.p2p.AbstractC36349b.AbstractC36351b
    /* renamed from: a */
    public void mo134109a(String str) {
        LKUIToast.show(this.f93821d, str);
    }

    public GroupChatStructureBaseView(Activity activity, AbstractC36362a aVar, boolean z) {
        this.f93821d = activity;
        this.f93820c = aVar;
        this.f93818a = z;
    }
}
