package com.ss.android.lark.create.groupchat.impl.inside;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.fragment.app.FragmentManager;
import butterknife.BindView;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.component.universe_design.button.UDButton;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.contact.entity.Department;
import com.ss.android.lark.create.groupchat.dto.CreateGroupMode;
import com.ss.android.lark.create.groupchat.dto.GroupCreateInfo;
import com.ss.android.lark.create.groupchat.impl.info.OnBusinessConsumeItemClick;
import com.ss.android.lark.create.groupchat.impl.inside.C36332a;
import com.ss.android.lark.create.groupchat.impl.statistics.CreateGroupHitPointNew;
import com.ss.android.lark.create.groupchat.impl.statistics.GroupHitPoint;
import com.ss.android.lark.create.groupchat.impl.util.GroupFGUtils;
import com.ss.android.lark.desktopmode.p1787a.C36516a;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.search.widget.BasePicker;
import com.ss.android.lark.search.widget.ChatterPicker;
import com.ss.android.lark.search.widget.business.ContactsSelectorBusiness;
import com.ss.android.lark.search.widget.constants.PickerUseCategory;
import com.ss.android.lark.search.widget.constants.PickerUsePage;
import com.ss.android.lark.search.widget.params.ChatterPickerParams;
import com.ss.android.lark.search.widget.reporter.PickerReporterDelegate;
import com.ss.android.lark.searchcommon.dto.info.SearchBaseInfo;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.listener.OnSingleClickListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class InsideGroupView implements C36332a.AbstractC36334b {

    /* renamed from: a */
    public Context f93734a;

    /* renamed from: b */
    boolean f93735b;

    /* renamed from: c */
    View f93736c;

    /* renamed from: d */
    View f93737d;

    /* renamed from: e */
    View f93738e;

    /* renamed from: f */
    View f93739f;

    /* renamed from: g */
    View f93740g;

    /* renamed from: h */
    TextView f93741h;

    /* renamed from: i */
    TextView f93742i;

    /* renamed from: j */
    View f93743j;

    /* renamed from: k */
    View f93744k;

    /* renamed from: l */
    View f93745l;

    /* renamed from: m */
    View f93746m;
    @BindView(7397)
    ViewGroup mBottomDetailRL;
    @BindView(6479)
    Button mCancelBT;
    @BindView(6810)
    ChatterPicker mChatterPicker;
    @BindView(6553)
    UDButton mConfirmBT;
    @BindView(7365)
    TextView mSelectCountTV;

    /* renamed from: n */
    View f93747n;

    /* renamed from: o */
    View f93748o;

    /* renamed from: p */
    TextView f93749p;

    /* renamed from: q */
    public C36332a.AbstractC36334b.AbstractC36335a f93750q;

    /* renamed from: r */
    public AbstractC36331a f93751r;

    /* renamed from: s */
    private final boolean f93752s = DesktopUtil.m144307b();

    /* renamed from: t */
    private boolean f93753t;

    /* renamed from: com.ss.android.lark.create.groupchat.impl.inside.InsideGroupView$a */
    public interface AbstractC36331a {
        /* renamed from: a */
        void mo134031a();

        /* renamed from: a */
        void mo134032a(GroupCreateInfo groupCreateInfo);

        /* renamed from: a */
        void mo134033a(C36332a.AbstractC36334b bVar);

        /* renamed from: a */
        void mo134034a(String str);

        /* renamed from: a */
        void mo134035a(List<SearchBaseInfo> list);

        /* renamed from: b */
        FragmentManager mo134036b();

        /* renamed from: c */
        Activity mo134037c();

        /* renamed from: d */
        void mo134038d();

        /* renamed from: e */
        void mo134039e();

        /* renamed from: f */
        C36516a<?> mo134040f();
    }

    /* renamed from: d */
    private int m143059d(boolean z) {
        return z ? R.string.Lark_Group_SearchContactsDepartmentsMyGroups : R.string.Lark_Legacy_Search;
    }

    @Override // com.ss.android.lark.create.groupchat.impl.inside.C36332a.AbstractC36334b
    /* renamed from: c */
    public int mo134025c() {
        return this.mChatterPicker.getFragmentType();
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        this.mChatterPicker.mo183601l();
    }

    @Override // com.ss.android.lark.create.groupchat.impl.inside.C36332a.AbstractC36334b
    /* renamed from: e */
    public void mo134028e() {
        this.mChatterPicker.mo183502g();
    }

    @Override // com.ss.android.lark.create.groupchat.impl.inside.C36332a.AbstractC36334b
    /* renamed from: f */
    public C36516a<?> mo134029f() {
        return this.f93751r.mo134040f();
    }

    /* renamed from: g */
    private void m143060g() {
        m143061h();
        m143062i();
        m143063j();
        m143065l();
    }

    /* renamed from: j */
    private void m143063j() {
        TextView textView = this.mSelectCountTV;
        if (textView != null) {
            textView.setOnClickListener(new View.OnClickListener() {
                /* class com.ss.android.lark.create.groupchat.impl.inside.$$Lambda$InsideGroupView$6Wd37MzKJ2tI763P2_OJzcMxPJI */

                public final void onClick(View view) {
                    InsideGroupView.this.m143057b((InsideGroupView) view);
                }
            });
        }
    }

    /* renamed from: k */
    private boolean m143064k() {
        if (!this.f93753t || !GroupFGUtils.m142836a()) {
            return false;
        }
        return true;
    }

    /* renamed from: l */
    private void m143065l() {
        if (this.f93752s) {
            this.f93736c.setVisibility(8);
        }
    }

    @Override // com.ss.android.lark.create.groupchat.impl.inside.C36332a.AbstractC36334b
    /* renamed from: a */
    public void mo134015a() {
        this.mConfirmBT.setEnabled(true);
    }

    @Override // com.ss.android.lark.create.groupchat.impl.inside.C36332a.AbstractC36334b
    /* renamed from: b */
    public Department mo134022b() {
        return this.mChatterPicker.getCurDepartment();
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        this.f93751r.mo134033a(this);
        m143060g();
    }

    /* renamed from: i */
    private void m143062i() {
        this.mConfirmBT.setOnClickListener(new OnSingleClickListener() {
            /* class com.ss.android.lark.create.groupchat.impl.inside.InsideGroupView.C363264 */

            @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
            public void onSingleClick(View view) {
                InsideGroupView.this.mConfirmBT.setEnabled(false);
                InsideGroupView.this.f93751r.mo134038d();
                InsideGroupView.this.f93750q.mo134057a(InsideGroupView.this.f93734a);
            }
        });
        Button button = this.mCancelBT;
        if (button != null) {
            button.setOnClickListener(new OnSingleClickListener() {
                /* class com.ss.android.lark.create.groupchat.impl.inside.InsideGroupView.C363275 */

                @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
                public void onSingleClick(View view) {
                    InsideGroupView.this.f93751r.mo134031a();
                }
            });
        }
    }

    @Override // com.ss.android.lark.create.groupchat.impl.inside.C36332a.AbstractC36334b
    /* renamed from: d */
    public boolean mo134027d() {
        if (!this.mChatterPicker.mo183501f()) {
            return false;
        }
        GroupHitPoint.f93889a.mo134207a();
        this.f93751r.mo134031a();
        return true;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: m */
    private /* synthetic */ ChatterPickerParams m143066m() {
        return new ChatterPickerParams.Builder().mo183676h(true).mo183668d(true).mo183673f(GroupFGUtils.m142840d()).mo183664b(this.f93750q.mo134061b()).mo183675g();
    }

    /* renamed from: h */
    private void m143061h() {
        this.f93736c = LayoutInflater.from(this.f93734a).inflate(R.layout.group_type_select_view, (ViewGroup) null, false);
        this.f93737d = LayoutInflater.from(this.f93734a).inflate(R.layout.group_type_f2f_create_item, (ViewGroup) null, false);
        this.f93739f = this.f93736c.findViewById(R.id.layout_group_type_select);
        this.f93740g = this.f93736c.findViewById(R.id.divider_group_type_bottom);
        this.f93741h = (TextView) this.f93736c.findViewById(R.id.text_group_select_title);
        this.f93742i = (TextView) this.f93736c.findViewById(R.id.text_group_type_select);
        this.f93738e = this.f93737d.findViewById(R.id.layout_create_f2f_group);
        this.f93737d.setVisibility(0);
        this.f93743j = this.f93736c.findViewById(R.id.topic_group_type_select);
        this.f93744k = this.f93736c.findViewById(R.id.group_type_private_layout);
        this.f93745l = this.f93736c.findViewById(R.id.group_type_public_layout);
        this.f93746m = this.f93736c.findViewById(R.id.privateCheckedIv);
        this.f93747n = this.f93736c.findViewById(R.id.publicCheckedIv);
        this.f93748o = this.f93736c.findViewById(R.id.group_member_tip_tv);
        this.f93749p = (TextView) this.f93736c.findViewById(R.id.group_type_tip_tv);
        this.mChatterPicker.mo183479a(new ContactsSelectorBusiness().mo183643a(this.f93736c).mo183648b(this.f93737d));
        ((ChatterPicker) ((ChatterPicker) ((ChatterPicker) ((ChatterPicker) ((ChatterPicker) ((ChatterPicker) ((ChatterPicker) ((ChatterPicker) ((ChatterPicker) ((ChatterPicker) ((ChatterPicker) ((ChatterPicker) ((ChatterPicker) ((ChatterPicker) ((ChatterPicker) this.mChatterPicker.mo183563a(PickerUsePage.CREATE_GROUP_FROM_FEED_AND_SHARE)).mo183562a(PickerUseCategory.GROUP)).mo183604p(true)).mo183561a(new BasePicker.OnPickerParamsLoader() {
            /* class com.ss.android.lark.create.groupchat.impl.inside.$$Lambda$InsideGroupView$vS0dgyBm_c8Aq0HZy352MFJ17iU */

            @Override // com.ss.android.lark.search.widget.BasePicker.OnPickerParamsLoader
            public final Object onLoadPickerParams() {
                return InsideGroupView.this.m143066m();
            }
        })).mo183559a(new BasePicker.IOnPickNotify() {
            /* class com.ss.android.lark.create.groupchat.impl.inside.InsideGroupView.C363253 */

            @Override // com.ss.android.lark.search.widget.BasePicker.IOnPickNotify
            /* renamed from: a */
            public void mo110050a(String str, SearchBaseInfo searchBaseInfo) {
                InsideGroupView.this.f93750q.mo134058a(str, searchBaseInfo);
            }

            @Override // com.ss.android.lark.search.widget.BasePicker.IOnPickNotify
            /* renamed from: b */
            public void mo110052b(String str, SearchBaseInfo searchBaseInfo) {
                InsideGroupView.this.f93750q.mo134062b(str, searchBaseInfo);
            }

            @Override // com.ss.android.lark.search.widget.BasePicker.IOnPickNotify
            /* renamed from: a */
            public void mo110051a(List<String> list, List<SearchBaseInfo> list2) {
                InsideGroupView.this.f93750q.mo134059a(list, list2);
            }
        })).mo183494c(true)).mo183492b(false)).mo183496d(true)).mo183570b(m143059d(true))).mo183560a(new BasePicker.IViewDependency() {
            /* class com.ss.android.lark.create.groupchat.impl.inside.InsideGroupView.C363242 */

            @Override // com.ss.android.lark.search.widget.BasePicker.IViewDependency
            /* renamed from: b */
            public Activity mo110056b() {
                return InsideGroupView.this.f93751r.mo134037c();
            }

            @Override // com.ss.android.lark.search.widget.BasePicker.IViewDependency
            /* renamed from: c */
            public FragmentManager mo110057c() {
                return InsideGroupView.this.f93751r.mo134036b();
            }
        })).mo183564a(new PickerReporterDelegate() {
            /* class com.ss.android.lark.create.groupchat.impl.inside.InsideGroupView.C363231 */

            @Override // com.ss.android.lark.search.widget.reporter.PickerReporterDelegate
            /* renamed from: b */
            public void mo134030b() {
                GroupHitPoint.f93889a.mo134211b();
            }
        })).mo183565a(new OnBusinessConsumeItemClick(this.f93734a))).mo183513i(true).mo183491b(this.f93750q.mo134063c())).mo183518n(true)).mo183579f("group_create")).mo183483a();
        this.mChatterPicker.mo183573b(new ArrayList(this.f93750q.mo134064d().values()));
    }

    /* renamed from: a */
    public void setViewDelegate(C36332a.AbstractC36334b.AbstractC36335a aVar) {
        this.f93750q = aVar;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m143056a(View view) {
        this.f93751r.mo134039e();
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: b */
    private /* synthetic */ void m143057b(View view) {
        this.f93750q.mo134056a();
    }

    @Override // com.ss.android.lark.create.groupchat.impl.inside.C36332a.AbstractC36334b
    /* renamed from: a */
    public void mo134018a(String str) {
        LKUIToast.show(this.f93734a, str);
    }

    @Override // com.ss.android.lark.create.groupchat.impl.inside.C36332a.AbstractC36334b
    /* renamed from: b */
    public void mo134023b(List<SearchBaseInfo> list) {
        this.mChatterPicker.mo183575c(list);
    }

    @Override // com.ss.android.lark.create.groupchat.impl.inside.C36332a.AbstractC36334b
    /* renamed from: a */
    public void mo134019a(List<SearchBaseInfo> list) {
        this.mChatterPicker.mo183573b(list);
    }

    @Override // com.ss.android.lark.create.groupchat.impl.inside.C36332a.AbstractC36334b
    /* renamed from: b */
    public void mo134024b(boolean z) {
        this.mChatterPicker.mo183570b(m143059d(z));
        this.mChatterPicker.setAddChatterFromChatAndDepartment(z);
    }

    /* renamed from: c */
    public void mo134026c(boolean z) {
        if (DesktopUtil.m144307b() || !z) {
            this.f93747n.setVisibility(4);
            this.f93746m.setVisibility(0);
            this.mConfirmBT.setText(UIHelper.getString(R.string.Lark_Group_CreateGroup_CreateGroup_TypePublic_CreateButton));
        } else {
            this.f93747n.setVisibility(0);
            this.f93746m.setVisibility(4);
            this.mConfirmBT.setText(UIHelper.getString(R.string.Lark_Group_CreateGroup_Next_Button));
        }
        this.f93750q.mo134060a(z);
    }

    /* renamed from: c */
    private String m143058c(List<SearchBaseInfo> list) {
        StringBuilder sb = new StringBuilder();
        sb.append(UIHelper.getString(R.string.Lark_Groups_MobileYouveSelected));
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        for (SearchBaseInfo searchBaseInfo : list) {
            if (searchBaseInfo.getType() == 1) {
                i++;
            }
            if (searchBaseInfo.getType() == 2) {
                i2++;
            }
            if (searchBaseInfo.getType() == 17) {
                i3++;
            }
        }
        if (i > 0) {
            String quantityString = UIHelper.getQuantityString(R.plurals.Lark_Groups_MobileSelectedCountMembers, i);
            sb.append(" ");
            sb.append(quantityString);
        }
        if (i2 > 0) {
            String quantityString2 = UIHelper.getQuantityString(R.plurals.Lark_Legacy_NumberChats, i2);
            sb.append(" ");
            sb.append(quantityString2);
        }
        if (i3 > 0) {
            String quantityString3 = UIHelper.getQuantityString(R.plurals.Lark_Legacy_NumberOrganizations, i3);
            sb.append(" ");
            sb.append(quantityString3);
        }
        return sb.toString();
    }

    @Override // com.ss.android.lark.create.groupchat.impl.inside.C36332a.AbstractC36334b
    /* renamed from: a */
    public void mo134020a(Map<String, SearchBaseInfo> map) {
        String str;
        if (this.mSelectCountTV != null) {
            if (map.isEmpty()) {
                str = UIHelper.mustacheFormat((int) R.string.Lark_Legacy_GroupSettingSelectedNumber, "number", Integer.toString(map.size()));
            } else {
                str = m143058c(new ArrayList(map.values()));
            }
            this.mSelectCountTV.setText(str);
        }
    }

    @Override // com.ss.android.lark.create.groupchat.impl.inside.C36332a.AbstractC36334b
    /* renamed from: a */
    public void mo134021a(boolean z) {
        this.mChatterPicker.setDisableExternalChatter(z);
    }

    @Override // com.ss.android.lark.create.groupchat.impl.inside.C36332a.AbstractC36334b
    /* renamed from: a */
    public void mo134016a(final GroupCreateInfo groupCreateInfo) {
        int i;
        int i2;
        if (groupCreateInfo != null) {
            boolean showGroupTypeSelector = groupCreateInfo.getShowGroupTypeSelector();
            this.f93735b = showGroupTypeSelector;
            if (!this.f93752s) {
                View view = this.f93739f;
                if (showGroupTypeSelector) {
                    i = 0;
                } else {
                    i = 8;
                }
                view.setVisibility(i);
                View view2 = this.f93740g;
                if (this.f93735b) {
                    i2 = 0;
                } else {
                    i2 = 8;
                }
                view2.setVisibility(i2);
            }
            StringBuilder sb = new StringBuilder();
            if (GroupFGUtils.m142836a()) {
                this.f93741h.setText(UIHelper.getString(R.string.Lark_Group_CreateGroup_GroupType));
                if (groupCreateInfo.isPublic()) {
                    sb.append(UIHelper.getString(R.string.Lark_Group_CreateGroup_TypeSwitch_Public));
                } else {
                    sb.append(UIHelper.getString(R.string.Lark_Group_CreateGroup_TypeSwitch_Private));
                }
            } else {
                this.f93741h.setText(UIHelper.getString(R.string.Lark_Group_CreateGroup_Mode_Title));
                groupCreateInfo.setPublic(false);
            }
            if (groupCreateInfo.getMode() == CreateGroupMode.CONVERSATION_MODE) {
                if (sb.length() > 0) {
                    sb.append(" · ");
                }
                sb.append(UIHelper.getString(R.string.Lark_Group_CreateGroup_Mode_Default_Name));
            } else if (groupCreateInfo.getMode() == CreateGroupMode.TOPIC_MODE) {
                if (sb.length() > 0) {
                    sb.append(" · ");
                }
                sb.append(UIHelper.getString(R.string.Lark_Group_CreateGroup_Mode_Topic_Name));
            } else if (groupCreateInfo.getMode() == CreateGroupMode.SECRET_MODE) {
                if (sb.length() > 0) {
                    sb.append(" · ");
                }
                sb.append(UIHelper.getString(R.string.Lark_Group_CreateGroup_Mode_Secret_Name));
            }
            this.f93742i.setText(sb.toString());
            this.f93739f.setOnClickListener(new OnSingleClickListener() {
                /* class com.ss.android.lark.create.groupchat.impl.inside.InsideGroupView.C363286 */

                @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
                public void onSingleClick(View view) {
                    GroupHitPoint.f93889a.mo134212c();
                    CreateGroupHitPointNew.f93887a.mo134197a("group_type", "im_chat_type_view");
                    InsideGroupView.this.f93751r.mo134032a(groupCreateInfo);
                }
            });
            this.f93738e.setOnClickListener(new View.OnClickListener() {
                /* class com.ss.android.lark.create.groupchat.impl.inside.$$Lambda$InsideGroupView$s_4ffziZX9_dhai_aLEfyaAxCM */

                public final void onClick(View view) {
                    InsideGroupView.this.m143056a((InsideGroupView) view);
                }
            });
            if (DesktopUtil.m144307b() || !groupCreateInfo.isPublic()) {
                this.mConfirmBT.setText(UIHelper.getString(R.string.Lark_Group_CreateGroup_CreateGroup_TypePublic_CreateButton));
            } else {
                this.mConfirmBT.setText(UIHelper.getString(R.string.Lark_Group_CreateGroup_Next_Button));
            }
            if (m143064k()) {
                this.f93743j.setVisibility(0);
                mo134026c(groupCreateInfo.isPublic());
                this.f93744k.setOnClickListener(new OnSingleClickListener() {
                    /* class com.ss.android.lark.create.groupchat.impl.inside.InsideGroupView.C363297 */

                    @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
                    public void onSingleClick(View view) {
                        InsideGroupView.this.mo134026c(false);
                    }
                });
                this.f93745l.setOnClickListener(new OnSingleClickListener() {
                    /* class com.ss.android.lark.create.groupchat.impl.inside.InsideGroupView.C363308 */

                    @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
                    public void onSingleClick(View view) {
                        InsideGroupView.this.mo134026c(true);
                    }
                });
                this.f93748o.setVisibility(0);
                this.f93749p.setText(UIUtils.getString(this.f93734a, R.string.Lark_Groups_Type));
                return;
            }
            this.f93743j.setVisibility(8);
        }
    }

    public InsideGroupView(Context context, AbstractC36331a aVar, boolean z) {
        this.f93734a = context;
        this.f93751r = aVar;
        this.f93753t = z;
    }
}
