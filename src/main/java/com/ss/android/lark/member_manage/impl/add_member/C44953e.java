package com.ss.android.lark.member_manage.impl.add_member;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.Pair;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chat.PickChatEntity;
import com.ss.android.lark.contact.entity.Contact;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.member_manage.GroupMemberManageModule;
import com.ss.android.lark.member_manage.dependency.IGroupMemberManageModuleDependency;
import com.ss.android.lark.member_manage.export.p2253a.AbstractC44896a;
import com.ss.android.lark.member_manage.impl.add_member.AddGroupMemberView;
import com.ss.android.lark.member_manage.impl.add_member.C44953e;
import com.ss.android.lark.member_manage.impl.add_member.IAddGroupMemberContract;
import com.ss.android.lark.member_manage.impl.statistics.PerfGroupMemberMonitor;
import com.ss.android.lark.member_manage.impl.statistics.group.GroupHitPoint;
import com.ss.android.lark.searchcommon.dto.info.SearchBaseInfo;
import com.ss.android.lark.searchcommon.dto.info.SearchChatInfo;
import com.ss.android.lark.searchcommon.dto.info.SearchChatterInfo;
import com.ss.android.lark.searchcommon.dto.info.SearchDepartmentInfo;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.billing.BillingTipsDialog;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.ss.android.lark.member_manage.impl.add_member.e */
public class C44953e implements IAddGroupMemberContract.IView.AbstractC44928a {

    /* renamed from: a */
    protected IAddGroupMemberContract.AbstractC44929a f113830a;

    /* renamed from: b */
    protected IAddGroupMemberContract.IView f113831b;

    /* renamed from: c */
    protected AddGroupMemberView.AbstractC44927a f113832c;

    /* renamed from: d */
    protected Context f113833d;

    /* renamed from: e */
    private IGroupMemberManageModuleDependency.AbstractC44880c f113834e = GroupMemberManageModule.m177902a().getChatSettingDependency();

    @Override // com.ss.android.lark.member_manage.impl.add_member.IAddGroupMemberContract.IView.AbstractC44928a
    /* renamed from: a */
    public void mo158998a(List<String> list, List<SearchBaseInfo> list2) {
    }

    @Override // com.ss.android.lark.member_manage.impl.add_member.IAddGroupMemberContract.IView.AbstractC44928a
    /* renamed from: d */
    public void mo159005d() {
        m178259p();
    }

    @Override // com.ss.android.lark.member_manage.impl.add_member.IAddGroupMemberContract.IView.AbstractC44928a
    /* renamed from: l */
    public boolean mo159013l() {
        return this.f113830a.mo159033g();
    }

    @Override // com.ss.android.lark.member_manage.impl.add_member.IAddGroupMemberContract.IView.AbstractC44928a
    /* renamed from: m */
    public String mo159014m() {
        return this.f113830a.mo159031e();
    }

    @Override // com.ss.android.lark.member_manage.impl.add_member.IAddGroupMemberContract.IView.AbstractC44928a
    /* renamed from: n */
    public Map<String, SearchBaseInfo> mo159015n() {
        return this.f113830a.mo159017a();
    }

    @Override // com.ss.android.lark.member_manage.impl.add_member.IAddGroupMemberContract.IView.AbstractC44928a
    /* renamed from: a */
    public void mo158995a() {
        m178259p();
        this.f113832c.mo158988a();
    }

    @Override // com.ss.android.lark.member_manage.impl.add_member.IAddGroupMemberContract.IView.AbstractC44928a
    /* renamed from: e */
    public boolean mo159006e() {
        return this.f113830a.mo159029c().isCrossTenant();
    }

    @Override // com.ss.android.lark.member_manage.impl.add_member.IAddGroupMemberContract.IView.AbstractC44928a
    /* renamed from: f */
    public boolean mo159007f() {
        return this.f113830a.mo159029c().isPublic();
    }

    @Override // com.ss.android.lark.member_manage.impl.add_member.IAddGroupMemberContract.IView.AbstractC44928a
    /* renamed from: g */
    public boolean mo159008g() {
        return this.f113830a.mo159029c().isThread();
    }

    @Override // com.ss.android.lark.member_manage.impl.add_member.IAddGroupMemberContract.IView.AbstractC44928a
    /* renamed from: h */
    public boolean mo159009h() {
        return this.f113830a.mo159029c().isSecret();
    }

    @Override // com.ss.android.lark.member_manage.impl.add_member.IAddGroupMemberContract.IView.AbstractC44928a
    /* renamed from: j */
    public int mo159011j() {
        return this.f113830a.mo159029c().getMemberCount();
    }

    @Override // com.ss.android.lark.member_manage.impl.add_member.IAddGroupMemberContract.IView.AbstractC44928a
    /* renamed from: o */
    public boolean mo159016o() {
        return this.f113830a.mo159029c().isCrossWithKa();
    }

    /* renamed from: q */
    private void m178260q() {
        GroupHitPoint.f114612b.mo159954a(this.f113830a.mo159029c(), this.f113830a.mo159035h());
    }

    @Override // com.ss.android.lark.member_manage.impl.add_member.IAddGroupMemberContract.IView.AbstractC44928a
    /* renamed from: c */
    public void mo159004c() {
        Map<String, SearchBaseInfo> a = this.f113830a.mo159017a();
        if (a != null && a.size() > 0) {
            this.f113832c.mo158992a(new ArrayList(a.values()));
        }
    }

    @Override // com.ss.android.lark.member_manage.impl.add_member.IAddGroupMemberContract.IView.AbstractC44928a
    /* renamed from: k */
    public boolean mo159012k() {
        return GroupMemberManageModule.m177902a().getAccountDependency().mo143793a(this.f113830a.mo159029c().getOwnerId());
    }

    /* renamed from: p */
    private void m178259p() {
        if (CollectionUtils.isNotEmpty(this.f113830a.mo159017a())) {
            this.f113830a.mo159023a(this.f113831b.mo158985l(), this.f113830a.mo159029c(), new ArrayList(this.f113830a.mo159017a().values()));
        }
    }

    @Override // com.ss.android.lark.member_manage.impl.add_member.IAddGroupMemberContract.IView.AbstractC44928a
    /* renamed from: i */
    public boolean mo159010i() {
        String d = this.f113830a.mo159030d();
        Chat c = this.f113830a.mo159029c();
        if (c.getAddMemberApply() != Chat.AddMemberApply.NEED_APPLY || TextUtils.equals(c.getOwnerId(), d) || c.isAdmin()) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.lark.member_manage.impl.add_member.IAddGroupMemberContract.IView.AbstractC44928a
    /* renamed from: b */
    public void mo159001b() {
        boolean z;
        String str;
        m178260q();
        final Set<SearchBaseInfo> b = this.f113830a.mo159026b();
        Map<String, SearchBaseInfo> a = this.f113830a.mo159017a();
        final HashSet hashSet = new HashSet(a.values());
        hashSet.removeAll(b);
        if (b.size() > 0) {
            ArrayList arrayList = new ArrayList();
            if (hashSet.size() == 0) {
                str = null;
                z = false;
            } else {
                str = UIUtils.getString(this.f113833d, R.string.Lark_Legacy_ChooseContact);
                z = true;
            }
            for (SearchBaseInfo searchBaseInfo : b) {
                arrayList.add(new Contact(searchBaseInfo.getId(), searchBaseInfo.getAvatarKey(), searchBaseInfo.getTitle()));
            }
            GroupMemberManageModule.m177902a().getContactDependency().mo143739a(this.f113833d, str, arrayList, z, new IGroupMemberManageModuleDependency.AbstractC44883f.AbstractC44884a() {
                /* class com.ss.android.lark.member_manage.impl.add_member.C44953e.C449541 */

                @Override // com.ss.android.lark.member_manage.dependency.IGroupMemberManageModuleDependency.AbstractC44883f.AbstractC44884a
                /* renamed from: a */
                public void mo158814a() {
                    C44953e.this.f113831b.mo158983j();
                }

                @Override // com.ss.android.lark.member_manage.dependency.IGroupMemberManageModuleDependency.AbstractC44883f.AbstractC44884a
                /* renamed from: b */
                public void mo158816b() {
                    C44953e.this.f113831b.mo158983j();
                }

                @Override // com.ss.android.lark.member_manage.dependency.IGroupMemberManageModuleDependency.AbstractC44883f.AbstractC44884a
                /* renamed from: a */
                public void mo158815a(boolean z, String str) {
                    hashSet.removeAll(b);
                    if (!hashSet.isEmpty()) {
                        C44953e.this.mo159076a(hashSet);
                    } else {
                        C44953e.this.f113832c.mo158988a();
                    }
                }
            });
            return;
        }
        mo159076a(a.values());
    }

    @Override // com.ss.android.lark.member_manage.impl.add_member.IAddGroupMemberContract.IView.AbstractC44928a
    /* renamed from: a */
    public void mo158999a(boolean z) {
        m178259p();
        mo159077b(z);
    }

    @Override // com.ss.android.lark.member_manage.impl.add_member.IAddGroupMemberContract.IView.AbstractC44928a
    /* renamed from: b */
    public boolean mo159003b(int i) {
        return this.f113830a.mo159028b(i);
    }

    @Override // com.ss.android.lark.member_manage.impl.add_member.IAddGroupMemberContract.IView.AbstractC44928a
    /* renamed from: a */
    public void mo158996a(Activity activity) {
        this.f113834e.mo143809a(activity, this.f113830a.mo159029c());
    }

    /* renamed from: a */
    public void mo159075a(ErrorResult errorResult) {
        final String displayMsg = errorResult.getDisplayMsg(this.f113833d.getString(R.string.Lark_Legacy_ErrorMessageTip));
        this.f113830a.mo159020a(new IGetDataCallback<Boolean>() {
            /* class com.ss.android.lark.member_manage.impl.add_member.C44953e.C449563 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                UICallbackExecutor.execute(new Runnable(displayMsg) {
                    /* class com.ss.android.lark.member_manage.impl.add_member.$$Lambda$e$3$pvhxLfH5PK4lgUbDPg_M6yA30DI */
                    public final /* synthetic */ String f$1;

                    {
                        this.f$1 = r2;
                    }

                    public final void run() {
                        C44953e.C449563.lambda$pvhxLfH5PK4lgUbDPg_M6yA30DI(C44953e.C449563.this, this.f$1);
                    }
                });
            }

            /* access modifiers changed from: public */
            /* renamed from: a */
            private /* synthetic */ void m178295a(String str) {
                C44953e.this.f113831b.mo158971a(false, str);
            }

            /* renamed from: a */
            public void onSuccess(Boolean bool) {
                UICallbackExecutor.execute(new Runnable(bool, displayMsg) {
                    /* class com.ss.android.lark.member_manage.impl.add_member.$$Lambda$e$3$GL8bANgl1aZF1igLKiLpTUMZZQ */
                    public final /* synthetic */ Boolean f$1;
                    public final /* synthetic */ String f$2;

                    {
                        this.f$1 = r2;
                        this.f$2 = r3;
                    }

                    public final void run() {
                        C44953e.C449563.m270808lambda$GL8bANgl1aZF1igLKiLpTUMZZQ(C44953e.C449563.this, this.f$1, this.f$2);
                    }
                });
            }

            /* access modifiers changed from: public */
            /* renamed from: a */
            private /* synthetic */ void m178294a(Boolean bool, String str) {
                C44953e.this.f113831b.mo158971a(bool.booleanValue(), str);
            }
        });
    }

    /* renamed from: a */
    private ArrayList<PickChatEntity> m178258a(List<SearchBaseInfo> list) {
        ArrayList<PickChatEntity> arrayList = new ArrayList<>(list.size());
        for (SearchBaseInfo searchBaseInfo : list) {
            if (searchBaseInfo instanceof SearchChatterInfo) {
                arrayList.add(new PickChatEntity(1, searchBaseInfo.getId()));
            }
            if (searchBaseInfo instanceof SearchChatInfo) {
                arrayList.add(new PickChatEntity(2, searchBaseInfo.getId()));
            }
            if (searchBaseInfo instanceof SearchDepartmentInfo) {
                arrayList.add(new PickChatEntity(3, searchBaseInfo.getId()));
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    public void mo159077b(boolean z) {
        boolean z2;
        boolean z3;
        ArrayList arrayList = new ArrayList(this.f113830a.mo159017a().values());
        if (!z || this.f113830a.mo159029c() == null || this.f113830a.mo159029c().getLastMessagePosition() < 0) {
            Chat c = this.f113830a.mo159029c();
            if (c != null) {
                boolean isSecret = c.isSecret();
                z2 = c.isThread();
                z3 = isSecret;
            } else {
                z3 = false;
                z2 = false;
            }
            this.f113830a.mo159019a(this.f113833d, z3, z2, arrayList, this.f113830a.getCallbackManager().wrapAndAddGetDataCallback(new IGetDataCallback<Chat>() {
                /* class com.ss.android.lark.member_manage.impl.add_member.C44953e.C449585 */

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    C44953e.this.f113831b.mo158983j();
                }

                /* renamed from: a */
                public void onSuccess(Chat chat) {
                    GroupHitPoint.f114612b.mo159955a(chat.isPublic(), chat.isCrossTenant(), chat.getChatMode(), chat.getMemberCount());
                }
            }));
            return;
        }
        HashSet hashSet = new HashSet(arrayList);
        Set<SearchBaseInfo> b = this.f113830a.mo159026b();
        hashSet.removeAll(b);
        final ArrayList<PickChatEntity> a = m178258a((List<SearchBaseInfo>) new ArrayList(hashSet));
        final ArrayList arrayList2 = new ArrayList();
        for (SearchBaseInfo searchBaseInfo : b) {
            arrayList2.add(new Contact(searchBaseInfo.getId(), searchBaseInfo.getAvatarKey(), searchBaseInfo.getTitle()));
        }
        C449574 r0 = new IGetDataCallback<Pair<Boolean, String>>() {
            /* class com.ss.android.lark.member_manage.impl.add_member.C44953e.C449574 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                C44953e.this.f113831b.mo158975c(errorResult.getDisplayMsg());
            }

            /* renamed from: a */
            public void onSuccess(Pair<Boolean, String> pair) {
                if (!((Boolean) pair.first).booleanValue()) {
                    C44953e.this.f113831b.mo158971a(false, (String) pair.second);
                    return;
                }
                Intent intent = new Intent();
                intent.putParcelableArrayListExtra("param_chatter_ids", a);
                intent.putParcelableArrayListExtra("contacts_to_apply", arrayList2);
                C44953e.this.f113832c.mo158990a(intent, -1);
            }
        };
        Chat c2 = this.f113830a.mo159029c();
        this.f113830a.mo159021a(c2.getChatMode(), a, c2, this.f113830a.getCallbackManager().wrapAndAddGetDataCallback(r0));
    }

    /* renamed from: a */
    public void mo159076a(Collection<SearchBaseInfo> collection) {
        ArrayList arrayList = new ArrayList(collection);
        PerfGroupMemberMonitor.m179719a(PerfGroupMemberMonitor.ActionType.ADD);
        if (CollectionUtils.isNotEmpty(arrayList)) {
            this.f113830a.mo159023a(this.f113831b.mo158985l(), this.f113830a.mo159029c(), arrayList);
        }
        this.f113830a.mo159018a(this.f113833d, m178258a((List<SearchBaseInfo>) arrayList), new AbstractC44896a() {
            /* class com.ss.android.lark.member_manage.impl.add_member.C44953e.C449552 */

            @Override // com.ss.android.lark.member_manage.export.p2253a.AbstractC44896a
            /* renamed from: b */
            public void mo128966b() {
            }

            @Override // com.ss.android.lark.member_manage.export.p2253a.AbstractC44896a
            /* renamed from: a */
            public void mo128963a() {
                C44953e.this.f113831b.mo158975c(UIUtils.getString(C44953e.this.f113833d, R.string.Lark_Legacy_RequestSentApprovalPendingToast));
                C44953e.this.f113832c.mo158988a();
                PerfGroupMemberMonitor.m179720a(PerfGroupMemberMonitor.ActionType.ADD, C44953e.this.f113830a.mo159029c(), null);
            }

            @Override // com.ss.android.lark.member_manage.export.p2253a.AbstractC44896a
            /* renamed from: b */
            public void mo128967b(ErrorResult errorResult) {
                mo128964a(errorResult);
            }

            @Override // com.ss.android.lark.member_manage.export.p2253a.AbstractC44896a
            /* renamed from: a */
            public void mo128964a(ErrorResult errorResult) {
                Log.m165383e("AddGroupMemberViewDelegate", errorResult.toString());
                if (BillingTipsDialog.m226153a(errorResult.getErrorCode())) {
                    BillingTipsDialog.m226151a(C44953e.this.f113833d, errorResult.getDisplayMsg(), BillingTipsDialog.Type.CHAT_ADD_MEM_NUMBER_LIMIT);
                } else if (errorResult.getErrorCode() == 4013) {
                    C44953e.this.mo159075a(errorResult);
                } else {
                    C44953e.this.f113831b.mo158973b(errorResult.getDisplayMsg(UIHelper.getString(R.string.Lark_Legacy_GroupAddMemberFailTip)));
                    PerfGroupMemberMonitor.m179720a(PerfGroupMemberMonitor.ActionType.ADD, C44953e.this.f113830a.mo159029c(), errorResult);
                }
            }

            @Override // com.ss.android.lark.member_manage.export.p2253a.AbstractC44896a
            /* renamed from: a */
            public void mo128965a(String str) {
                Intent intent = new Intent();
                intent.putExtra("params_chat", C44953e.this.f113830a.mo159029c());
                C44953e.this.f113832c.mo158990a(intent, 0);
                PerfGroupMemberMonitor.m179720a(PerfGroupMemberMonitor.ActionType.ADD, C44953e.this.f113830a.mo159029c(), null);
            }
        });
        this.f113831b.mo158983j();
    }

    @Override // com.ss.android.lark.member_manage.impl.add_member.IAddGroupMemberContract.IView.AbstractC44928a
    /* renamed from: a */
    public boolean mo159000a(int i) {
        return this.f113830a.mo159025a(i);
    }

    @Override // com.ss.android.lark.member_manage.impl.add_member.IAddGroupMemberContract.IView.AbstractC44928a
    /* renamed from: b */
    public void mo159002b(String str, SearchBaseInfo searchBaseInfo) {
        this.f113830a.mo159027b(searchBaseInfo);
        this.f113831b.mo158970a(this.f113830a.mo159017a());
    }

    public C44953e(Context context, C44951d dVar) {
        this.f113833d = context;
        this.f113830a = dVar.mo159072d();
        this.f113831b = dVar.mo159071c();
        this.f113832c = dVar.mo159073e();
    }

    @Override // com.ss.android.lark.member_manage.impl.add_member.IAddGroupMemberContract.IView.AbstractC44928a
    /* renamed from: a */
    public void mo158997a(String str, SearchBaseInfo searchBaseInfo) {
        if (this.f113830a.mo159026b().size() > GroupMemberManageModule.m177902a().getAppConfigDependency().mo143802a()) {
            this.f113831b.mo158975c(UIUtils.getString(this.f113833d, R.string.Lark_NewContacts_PermissionRequestSelectUserMax));
        } else if (this.f113830a.mo159017a().size() >= 100) {
            this.f113831b.mo158975c(UIHelper.getString(R.string.Lark_Legacy_AddGuestLimit));
        } else {
            this.f113830a.mo159022a(searchBaseInfo);
            this.f113831b.mo158970a(this.f113830a.mo159017a());
        }
    }
}
