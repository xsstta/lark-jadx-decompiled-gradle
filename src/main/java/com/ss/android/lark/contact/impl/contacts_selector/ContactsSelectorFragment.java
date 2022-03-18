package com.ss.android.lark.contact.impl.contacts_selector;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.hms.feature.dynamic.DynamicModule;
import com.larksuite.suite.R;
import com.ss.android.lark.base.fragment.BaseFragment;
import com.ss.android.lark.biz.core.api.AbstractC29565l;
import com.ss.android.lark.contact.C35358a;
import com.ss.android.lark.contact.impl.contacts_selector.IContactsSelectorContract;
import com.ss.android.lark.contact.impl.p1748c.C35503a;
import com.ss.android.lark.contact.p1733b.AbstractC35361b;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 $2\u00020\u00012\u00020\u0002:\u0002#$B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0010\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0006\u0010\u0013\u001a\u00020\u0014J\b\u0010\u0015\u001a\u00020\u000fH\u0002J&\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u000fH\u0016J\b\u0010\u001f\u001a\u00020\u000fH\u0016J\b\u0010 \u001a\u00020\u000fH\u0016J\u000e\u0010!\u001a\u00020\u000f2\u0006\u0010\"\u001a\u00020\u0014R\u0014\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX.¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"Lcom/ss/android/lark/contact/impl/contacts_selector/ContactsSelectorFragment;", "Lcom/ss/android/lark/base/fragment/BaseFragment;", "Lcom/ss/android/lark/contact/impl/contacts_selector/IContactsSelectorContract$IContactsSelectorFragmentDelegate;", "builder", "Lcom/ss/android/lark/contact/impl/contacts_selector/ContactsSelectorFragment$Builder;", "(Lcom/ss/android/lark/contact/impl/contacts_selector/ContactsSelectorFragment$Builder;)V", "getBuilder$core_contact_contact_release", "()Lcom/ss/android/lark/contact/impl/contacts_selector/ContactsSelectorFragment$Builder;", "contactSelectorView", "Lcom/ss/android/lark/contact/impl/contacts_selector/ContactSelectorView;", "mPresenter", "Lcom/ss/android/lark/contact/impl/contacts_selector/ContactsSelectorPresenter;", "rootView", "Landroidx/recyclerview/widget/RecyclerView;", "changeEmailContactVisibility", "", "isVisible", "", "changeExternalContactVisibility", "getDepartmentCount", "", "initMVP", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onDestroyView", "onResume", "showNewFriendRequestBadge", "count", "Builder", "Companion", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.contact.impl.contacts_selector.b */
public final class ContactsSelectorFragment extends BaseFragment implements IContactsSelectorContract.IContactsSelectorFragmentDelegate {

    /* renamed from: b */
    public static final Companion f92413b = new Companion(null);

    /* renamed from: a */
    public ContactsSelectorPresenter f92414a;

    /* renamed from: c */
    private RecyclerView f92415c;

    /* renamed from: d */
    private ContactSelectorView f92416d;

    /* renamed from: e */
    private final Builder f92417e;

    /* renamed from: f */
    private HashMap f92418f;

    /* renamed from: b */
    public void mo131569b() {
        HashMap hashMap = this.f92418f;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u00109\u001a\u00020:2\u0010\u0010;\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004J\u0018\u0010<\u001a\u00020:2\u0010\u0010=\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004J\u000e\u0010>\u001a\u00020\u00002\u0006\u0010?\u001a\u00020\u000bJ\u0006\u0010@\u001a\u00020AJ\u000e\u0010\n\u001a\u00020\u00002\u0006\u0010?\u001a\u00020\u000bJ\u000e\u0010B\u001a\u00020\u00002\u0006\u0010?\u001a\u00020\u000bJ\u0010\u0010\u0013\u001a\u00020\u00002\b\u0010C\u001a\u0004\u0018\u00010\u0014J\u000e\u0010D\u001a\u00020\u00002\u0006\u0010?\u001a\u00020\u000bJ\u000e\u0010E\u001a\u00020\u00002\u0006\u0010?\u001a\u00020\u000bJ\u000e\u0010F\u001a\u00020\u00002\u0006\u0010?\u001a\u00020\u000bJ\u000e\u0010'\u001a\u00020\u00002\u0006\u0010?\u001a\u00020\"J\u000e\u0010G\u001a\u00020\u00002\u0006\u0010?\u001a\u00020\u000bJ\u000e\u0010H\u001a\u00020\u00002\u0006\u0010?\u001a\u00020\u000bJ\b\u0010I\u001a\u00020:H\u0002J\u0018\u0010J\u001a\u00020:2\u0006\u0010K\u001a\u00020\"2\u0006\u0010?\u001a\u00020\u000bH\u0002J\u000e\u0010L\u001a\u00020:2\u0006\u0010\u001b\u001a\u00020\u000bJ\u000e\u0010*\u001a\u00020\u00002\u0006\u0010?\u001a\u00020\u000bJ\u000e\u0010-\u001a\u00020:2\u0006\u0010-\u001a\u00020\"J\u000e\u0010M\u001a\u00020\u00002\u0006\u0010?\u001a\u00020\u000bJ\u000e\u00100\u001a\u00020\u00002\u0006\u0010?\u001a\u00020\u000bJ\u0010\u00103\u001a\u00020\u00002\b\u0010C\u001a\u0004\u0018\u000104R\u001e\u0010\u0003\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001e\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u001a\u0010\n\u001a\u00020\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0010\u001a\n \u0012*\u0004\u0018\u00010\u00110\u0011X\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u000e\u0010\u0019\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u001b\u001a\u00020\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\r\"\u0004\b\u001d\u0010\u000fR\u000e\u0010\u001e\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u001a\u0010!\u001a\u00020\"X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001a\u0010'\u001a\u00020\"X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010$\"\u0004\b)\u0010&R\u001a\u0010*\u001a\u00020\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\r\"\u0004\b,\u0010\u000fR\u001a\u0010-\u001a\u00020\"X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010$\"\u0004\b/\u0010&R\u001a\u00100\u001a\u00020\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\r\"\u0004\b2\u0010\u000fR\u001c\u00103\u001a\u0004\u0018\u000104X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u00106\"\u0004\b7\u00108¨\u0006N"}, d2 = {"Lcom/ss/android/lark/contact/impl/contacts_selector/ContactsSelectorFragment$Builder;", "", "()V", "customFooters", "", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "getCustomFooters$core_contact_contact_release", "()Ljava/util/List;", "customHeaders", "getCustomHeaders$core_contact_contact_release", "depVisible", "", "getDepVisible$core_contact_contact_release", "()Z", "setDepVisible$core_contact_contact_release", "(Z)V", "dependency", "Lcom/ss/android/lark/contact/dependency/IContactModuleDependency;", "kotlin.jvm.PlatformType", "entranceClickListener", "Lcom/ss/android/lark/biz/core/api/IContactsSelectorController$IOnClickListener;", "getEntranceClickListener$core_contact_contact_release", "()Lcom/ss/android/lark/biz/core/api/IContactsSelectorController$IOnClickListener;", "setEntranceClickListener$core_contact_contact_release", "(Lcom/ss/android/lark/biz/core/api/IContactsSelectorController$IOnClickListener;)V", "isBotsEnable", "isBusinessCardEnable", "isFromContactHome", "isFromContactHome$core_contact_contact_release", "setFromContactHome$core_contact_contact_release", "isHelpDeskEnable", "isOrganizationEnable", "isTrustPartyEnable", "itemFlags", "", "getItemFlags$core_contact_contact_release", "()I", "setItemFlags$core_contact_contact_release", "(I)V", "newFriendBadgeCount", "getNewFriendBadgeCount$core_contact_contact_release", "setNewFriendBadgeCount$core_contact_contact_release", "showSchoolContact", "getShowSchoolContact$core_contact_contact_release", "setShowSchoolContact$core_contact_contact_release", "sourceType", "getSourceType$core_contact_contact_release", "setSourceType$core_contact_contact_release", "trustPartyVisible", "getTrustPartyVisible$core_contact_contact_release", "setTrustPartyVisible$core_contact_contact_release", "viewDataReadyListener", "Lcom/ss/android/lark/biz/core/api/IContactsSelectorController$IOnViewDataListener;", "getViewDataReadyListener$core_contact_contact_release", "()Lcom/ss/android/lark/biz/core/api/IContactsSelectorController$IOnViewDataListener;", "setViewDataReadyListener$core_contact_contact_release", "(Lcom/ss/android/lark/biz/core/api/IContactsSelectorController$IOnViewDataListener;)V", "addFooters", "", "footerList", "addHeaders", "headerList", "botVisible", "value", "build", "Lcom/ss/android/lark/contact/impl/contacts_selector/ContactsSelectorFragment;", "emailContactsVisible", "listener", "externalContactsVisible", "mineGroupVisible", "newContactsVisible", "onCallVisible", "ownerGroupVisible", "resetMineLabelIfNeed", "setFlagBits", "mask", "setIsFromContactHome", "specialFocusVisible", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.contact.impl.contacts_selector.b$a */
    public static final class Builder {

        /* renamed from: a */
        private final AbstractC35361b f92419a;

        /* renamed from: b */
        private final boolean f92420b;

        /* renamed from: c */
        private final boolean f92421c;

        /* renamed from: d */
        private final boolean f92422d;

        /* renamed from: e */
        private final boolean f92423e;

        /* renamed from: f */
        private final boolean f92424f;

        /* renamed from: g */
        private boolean f92425g;

        /* renamed from: h */
        private int f92426h;

        /* renamed from: i */
        private int f92427i = 65281;

        /* renamed from: j */
        private boolean f92428j;

        /* renamed from: k */
        private boolean f92429k;

        /* renamed from: l */
        private boolean f92430l;

        /* renamed from: m */
        private int f92431m;

        /* renamed from: n */
        private AbstractC29565l.AbstractC29566a f92432n;

        /* renamed from: o */
        private AbstractC29565l.AbstractC29567b f92433o;

        /* renamed from: p */
        private final List<RecyclerView.Adapter<?>> f92434p = new ArrayList();

        /* renamed from: q */
        private final List<RecyclerView.Adapter<?>> f92435q = new ArrayList();

        /* renamed from: b */
        public final int mo131577b() {
            return this.f92426h;
        }

        /* renamed from: c */
        public final int mo131581c() {
            return this.f92427i;
        }

        /* renamed from: d */
        public final boolean mo131585d() {
            return this.f92428j;
        }

        /* renamed from: e */
        public final boolean mo131587e() {
            return this.f92429k;
        }

        /* renamed from: f */
        public final boolean mo131589f() {
            return this.f92430l;
        }

        /* renamed from: g */
        public final int mo131590g() {
            return this.f92431m;
        }

        /* renamed from: h */
        public final AbstractC29565l.AbstractC29566a mo131592h() {
            return this.f92432n;
        }

        /* renamed from: i */
        public final AbstractC29565l.AbstractC29567b mo131594i() {
            return this.f92433o;
        }

        /* renamed from: j */
        public final List<RecyclerView.Adapter<?>> mo131597j() {
            return this.f92434p;
        }

        /* renamed from: k */
        public final List<RecyclerView.Adapter<?>> mo131599k() {
            return this.f92435q;
        }

        /* renamed from: l */
        public final ContactsSelectorFragment mo131600l() {
            return new ContactsSelectorFragment(this);
        }

        /* renamed from: m */
        private final void m139901m() {
            if (this.f92427i == 65280) {
                int i = this.f92426h;
                if ((i & 2) == 2) {
                    int i2 = i & -3;
                    this.f92426h = i2;
                    this.f92426h = i2 | 32;
                }
            }
        }

        public Builder() {
            AbstractC35361b a = C35358a.m138143a();
            this.f92419a = a;
            this.f92420b = a.mo130157d("contact.bots");
            this.f92421c = a.mo130157d("contact.helpdesk");
            this.f92422d = a.mo130157d("contact.organization");
            Intrinsics.checkExpressionValueIsNotNull(a, "dependency");
            this.f92423e = a.mo130150b().mo130208a("messenger.contacts.entry_refactor");
            Intrinsics.checkExpressionValueIsNotNull(a, "dependency");
            this.f92424f = a.mo130150b().mo130208a("contact.contactcards.email");
        }

        /* renamed from: a */
        public final boolean mo131576a() {
            return this.f92425g;
        }

        /* renamed from: a */
        public final void mo131574a(int i) {
            this.f92426h = i;
        }

        /* renamed from: l */
        public final void mo131601l(boolean z) {
            this.f92425g = z;
        }

        /* renamed from: a */
        public final Builder mo131571a(AbstractC29565l.AbstractC29566a aVar) {
            Builder aVar2 = this;
            aVar2.f92432n = aVar;
            return aVar2;
        }

        /* renamed from: b */
        public final Builder mo131578b(int i) {
            Builder aVar = this;
            aVar.f92431m = i;
            return aVar;
        }

        /* renamed from: c */
        public final void mo131583c(int i) {
            this.f92427i = i;
            m139901m();
        }

        /* renamed from: j */
        public final Builder mo131596j(boolean z) {
            Builder aVar = this;
            aVar.f92429k = z;
            return aVar;
        }

        /* renamed from: b */
        public final Builder mo131579b(boolean z) {
            Builder aVar = this;
            aVar.m139900a(2, z);
            return aVar;
        }

        /* renamed from: c */
        public final Builder mo131582c(boolean z) {
            Builder aVar = this;
            if (aVar.f92421c) {
                aVar.m139900a(8, z);
            }
            return aVar;
        }

        /* renamed from: d */
        public final Builder mo131584d(boolean z) {
            Builder aVar = this;
            if (aVar.f92420b) {
                aVar.m139900a(4, z);
            }
            return aVar;
        }

        /* renamed from: e */
        public final Builder mo131586e(boolean z) {
            Builder aVar = this;
            aVar.m139900a(16, z);
            return aVar;
        }

        /* renamed from: f */
        public final Builder mo131588f(boolean z) {
            Builder aVar = this;
            if (aVar.f92424f) {
                aVar.m139900a(SmActions.ACTION_ONTHECALL_EXIT, z);
            }
            return aVar;
        }

        /* renamed from: g */
        public final Builder mo131591g(boolean z) {
            Builder aVar = this;
            aVar.m139900a(DynamicModule.f58006b, z);
            return aVar;
        }

        /* renamed from: h */
        public final Builder mo131593h(boolean z) {
            Builder aVar = this;
            aVar.m139900a(64, z);
            return aVar;
        }

        /* renamed from: i */
        public final Builder mo131595i(boolean z) {
            Builder aVar = this;
            if (aVar.f92422d) {
                aVar.f92428j = z;
            }
            return aVar;
        }

        /* renamed from: k */
        public final Builder mo131598k(boolean z) {
            Builder aVar = this;
            if (aVar.f92423e) {
                aVar.f92430l = z;
            }
            return aVar;
        }

        /* renamed from: a */
        public final Builder mo131572a(AbstractC29565l.AbstractC29567b bVar) {
            Builder aVar = this;
            aVar.f92433o = bVar;
            return aVar;
        }

        /* renamed from: b */
        public final void mo131580b(List<RecyclerView.Adapter<?>> list) {
            Intrinsics.checkParameterIsNotNull(list, "footerList");
            this.f92435q.addAll(list);
        }

        /* renamed from: a */
        public final Builder mo131573a(boolean z) {
            Builder aVar = this;
            aVar.m139900a(1, z);
            return aVar;
        }

        /* renamed from: a */
        public final void mo131575a(List<RecyclerView.Adapter<?>> list) {
            Intrinsics.checkParameterIsNotNull(list, "headerList");
            this.f92434p.addAll(list);
        }

        /* renamed from: a */
        private final void m139900a(int i, boolean z) {
            int i2;
            if (z) {
                i2 = i | this.f92426h;
            } else {
                i2 = (~i) & this.f92426h;
            }
            this.f92426h = i2;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/contact/impl/contacts_selector/ContactsSelectorFragment$Companion;", "", "()V", "TAG", "", "TYPE_CHATTER_PICKER", "", "TYPE_HOME", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.contact.impl.contacts_selector.b$b */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public final int mo131566a() {
        ContactSelectorView aVar = this.f92416d;
        if (aVar != null) {
            return aVar.mo131535a();
        }
        return 0;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        ContactsSelectorPresenter eVar = this.f92414a;
        if (eVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPresenter");
        }
        eVar.destroy();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        C35503a.m138879a().mo130938b();
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.base.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        ContactSelectorView aVar = this.f92416d;
        if (aVar != null) {
            aVar.destroy();
        }
        this.f92416d = null;
        mo131569b();
    }

    /* renamed from: c */
    private final void m139894c() {
        RecyclerView recyclerView = this.f92415c;
        if (recyclerView != null) {
            this.f92416d = new ContactSelectorView(recyclerView, this.f92417e);
            ContactsSelectorPresenter eVar = new ContactsSelectorPresenter(new ContactsSelectorModel(), this.f92416d, this.f92417e);
            this.f92414a = eVar;
            if (eVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPresenter");
            }
            eVar.create();
            return;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    public ContactsSelectorFragment(Builder aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "builder");
        this.f92417e = aVar;
    }

    /* renamed from: a */
    public final void mo131567a(int i) {
        this.f92417e.mo131578b(i);
        ContactSelectorView aVar = this.f92416d;
        if (aVar != null) {
            aVar.mo131536a(i);
        }
    }

    @Override // com.ss.android.lark.contact.impl.contacts_selector.IContactsSelectorContract.IContactsSelectorFragmentDelegate
    /* renamed from: b */
    public void mo131570b(boolean z) {
        if (this.f92414a != null) {
            ContactsSelectorPresenter eVar = this.f92414a;
            if (eVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPresenter");
            }
            eVar.mo131643a(SmActions.ACTION_ONTHECALL_EXIT, z);
        }
    }

    @Override // com.ss.android.lark.contact.impl.contacts_selector.IContactsSelectorContract.IContactsSelectorFragmentDelegate
    /* renamed from: a */
    public void mo131568a(boolean z) {
        if (this.f92414a != null) {
            ContactsSelectorPresenter eVar = this.f92414a;
            if (eVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPresenter");
            }
            eVar.mo131643a(16, z);
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        if (this.f92415c == null) {
            if (viewGroup == null) {
                Intrinsics.throwNpe();
            }
            RecyclerView recyclerView = new RecyclerView(viewGroup.getContext());
            recyclerView.setBackgroundColor(ContextCompat.getColor(recyclerView.getContext(), R.color.bg_base));
            this.f92415c = recyclerView;
            m139894c();
        }
        return this.f92415c;
    }
}
