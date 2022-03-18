package com.ss.android.lark.contact.impl.contacts_selector;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.component.ui.p1153e.C25653b;
import com.larksuite.suite.R;
import com.ss.android.lark.biz.core.api.AbstractC29565l;
import com.ss.android.lark.contact.impl.contacts_selector.ContactsSelectorFragment;
import com.ss.android.lark.contact.impl.contacts_selector.ContactsSelectorItemFactory;
import com.ss.android.lark.contact.impl.contacts_selector.IContactsSelectorContract;
import com.ss.android.lark.contact.impl.contacts_selector.school.ISchoolParentContactController;
import com.ss.android.lark.contact.impl.contacts_selector.school.ISchoolParentContactListener;
import com.ss.android.lark.contact.impl.contacts_selector.school.SchoolParentContactController;
import com.ss.android.lark.contact.impl.contacts_selector.subordinate.AbstractC35773a;
import com.ss.android.lark.contact.impl.contacts_selector.subordinate.AbstractC35774b;
import com.ss.android.lark.contact.impl.contacts_selector.subordinate.C35777d;
import com.ss.android.lark.contact.impl.contacts_selector.widget.FlatItemsAdapter;
import com.ss.android.lark.contact.impl.contacts_selector.widget.SingleItemAdapter;
import com.ss.android.lark.contact.impl.statistics.ContactHitPoint;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 :2\u00020\u0001:\u0001:B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0018\u001a\u00020\u0019H\u0002J\b\u0010\u001a\u001a\u00020\u0019H\u0016J\b\u0010\u001b\u001a\u00020\u0019H\u0016J\u0006\u0010\u001c\u001a\u00020\u001dJ\b\u0010\u001e\u001a\u00020\u001fH\u0002J\b\u0010 \u001a\u00020\u001fH\u0002J\b\u0010!\u001a\u00020\u001fH\u0002J\b\u0010\"\u001a\u00020\u0019H\u0002J\b\u0010#\u001a\u00020\u0019H\u0002J\u0018\u0010$\u001a\u00020\u00192\u0006\u0010%\u001a\u00020\u00052\u0006\u0010&\u001a\u00020'H\u0016J \u0010(\u001a\u00020\u00192\u0006\u0010%\u001a\u00020\u00052\u0006\u0010)\u001a\u00020'2\u0006\u0010*\u001a\u00020'H\u0016J\b\u0010+\u001a\u00020\u0019H\u0002J\u0012\u0010,\u001a\u00020\u00192\b\u0010-\u001a\u0004\u0018\u00010.H\u0016J\b\u0010/\u001a\u00020\u0019H\u0002J\b\u00100\u001a\u00020\u0019H\u0002J\u0010\u00101\u001a\u00020\u00192\u0006\u00102\u001a\u000203H\u0002J\b\u00104\u001a\u00020\u0019H\u0002J\b\u00105\u001a\u00020\u0019H\u0002J\u000e\u00106\u001a\u00020\u00192\u0006\u00107\u001a\u00020\u001dJ\u0012\u00108\u001a\u00020\u00192\b\u00109\u001a\u0004\u0018\u00010\u0011H\u0002R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\n \r*\u0004\u0018\u00010\f0\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u000e¢\u0006\u0002\n\u0000¨\u0006;"}, d2 = {"Lcom/ss/android/lark/contact/impl/contacts_selector/ContactSelectorView;", "Lcom/ss/android/lark/contact/impl/contacts_selector/IContactsSelectorContract$IView;", "containerRV", "Landroidx/recyclerview/widget/RecyclerView;", "params", "Lcom/ss/android/lark/contact/impl/contacts_selector/ContactsSelectorFragment$Builder;", "(Landroidx/recyclerview/widget/RecyclerView;Lcom/ss/android/lark/contact/impl/contacts_selector/ContactsSelectorFragment$Builder;)V", "contactAdapter", "Lcom/ss/android/lark/contact/impl/contacts_selector/ContactsSelectorItemFactory$DefaultContactsAdapter;", "contactsSelectorItemFactory", "Lcom/ss/android/lark/contact/impl/contacts_selector/ContactsSelectorItemFactory;", "context", "Landroid/content/Context;", "kotlin.jvm.PlatformType", "flatItemAdapter", "Lcom/ss/android/lark/contact/impl/contacts_selector/widget/FlatItemsAdapter;", "lastSelectedView", "Landroid/view/View;", "getParams", "()Lcom/ss/android/lark/contact/impl/contacts_selector/ContactsSelectorFragment$Builder;", "setParams", "(Lcom/ss/android/lark/contact/impl/contacts_selector/ContactsSelectorFragment$Builder;)V", "subordinateController", "Lcom/ss/android/lark/contact/impl/contacts_selector/subordinate/ISubordinateController;", "applyToRecyclerView", "", "create", "destroy", "getDepartmentCount", "", "getSchoolContactView", "Lcom/ss/android/lark/contact/impl/contacts_selector/widget/SingleItemAdapter;", "getSubordinateView", "getTrustPartyView", "initItem", "initRecyclerView", "onGetContactEntryResult", "newParams", "needUpdate", "", "onUpdateContactEntry", "needUpdateDefaultContact", "needUpdateDepartment", "setUpItems", "setViewDelegate", "viewDelegate", "Lcom/ss/android/lark/contact/impl/contacts_selector/IContactsSelectorContract$IView$Delegate;", "setupDefaultContact", "setupDepartment", "setupDepartmentDividerIfNeed", "container", "Landroid/widget/LinearLayout;", "setupFooters", "setupHeaders", "showNewFriendRequestBadge", "count", "updateSelectStatusForLKP", "view", "Companion", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.contact.impl.contacts_selector.a */
public final class ContactSelectorView implements IContactsSelectorContract.IView {

    /* renamed from: b */
    public static final int f92384b = View.generateViewId();

    /* renamed from: c */
    public static final Companion f92385c = new Companion(null);

    /* renamed from: a */
    public AbstractC35773a f92386a;

    /* renamed from: d */
    private final Context f92387d;

    /* renamed from: e */
    private final FlatItemsAdapter f92388e = new FlatItemsAdapter();

    /* renamed from: f */
    private View f92389f;

    /* renamed from: g */
    private ContactsSelectorItemFactory.DefaultContactsAdapter f92390g;

    /* renamed from: h */
    private final ContactsSelectorItemFactory f92391h = new ContactsSelectorItemFactory();

    /* renamed from: i */
    private final RecyclerView f92392i;

    /* renamed from: j */
    private ContactsSelectorFragment.Builder f92393j;

    /* renamed from: a */
    public void setViewDelegate(IContactsSelectorContract.IView.Delegate aVar) {
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0011\u0010\r\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/ss/android/lark/contact/impl/contacts_selector/ContactSelectorView$Companion;", "", "()V", "MASK_BOT", "", "MASK_EMAIL_CONTACT", "MASK_EXIST_GROUP", "MASK_EXTERNAL_CONTACT", "MASK_MINE_GROUP", "MASK_NEW_CONTACT", "MASK_ON_CALL", "MASK_OWNER_GROUP", "MASK_SPECIAL_FOCUS", "idDivider", "getIdDivider", "()I", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.contact.impl.contacts_selector.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: b */
    public final ContactsSelectorFragment.Builder mo131542b() {
        return this.f92393j;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.contact.impl.contacts_selector.a$b */
    public static final class RunnableC35736b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ ISchoolParentContactController f92394a;

        RunnableC35736b(ISchoolParentContactController aVar) {
            this.f92394a = aVar;
        }

        public final void run() {
            this.f92394a.mo131655a();
        }
    }

    /* renamed from: e */
    private final void m139848e() {
        this.f92392i.setOverScrollMode(2);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.contact.impl.contacts_selector.a$g */
    public static final class RunnableC35741g implements Runnable {

        /* renamed from: a */
        final /* synthetic */ ContactSelectorView f92401a;

        RunnableC35741g(ContactSelectorView aVar) {
            this.f92401a = aVar;
        }

        public final void run() {
            AbstractC35773a aVar = this.f92401a.f92386a;
            if (aVar != null) {
                aVar.mo131677a();
            }
        }
    }

    /* renamed from: c */
    private final void m139846c() {
        m139848e();
        m139847d();
        m139849f();
    }

    /* renamed from: d */
    private final void m139847d() {
        m139850g();
        m139851h();
        m139856m();
        m139855l();
    }

    /* renamed from: a */
    public final int mo131535a() {
        AbstractC35773a aVar = this.f92386a;
        if (aVar != null) {
            return aVar.mo131679b();
        }
        return 0;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/ss/android/lark/contact/impl/contacts_selector/ContactSelectorView$getSchoolContactView$controller$1", "Lcom/ss/android/lark/contact/impl/contacts_selector/school/ISchoolParentContactListener$IViewReady;", "onReady", "", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.contact.impl.contacts_selector.a$c */
    public static final class C35737c implements ISchoolParentContactListener.IViewReady {

        /* renamed from: a */
        final /* synthetic */ ContactSelectorView f92395a;

        /* renamed from: b */
        final /* synthetic */ LinearLayout f92396b;

        @Override // com.ss.android.lark.contact.impl.contacts_selector.school.ISchoolParentContactListener.IViewReady
        /* renamed from: a */
        public void mo131544a() {
            AbstractC29565l.AbstractC29567b i = this.f92395a.mo131542b().mo131594i();
            if (i != null) {
                i.onReady();
            }
            this.f92396b.setVisibility(0);
        }

        C35737c(ContactSelectorView aVar, LinearLayout linearLayout) {
            this.f92395a = aVar;
            this.f92396b = linearLayout;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "onReady"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.contact.impl.contacts_selector.a$e */
    public static final class C35739e implements AbstractC35774b.AbstractC35775a {

        /* renamed from: a */
        final /* synthetic */ ContactSelectorView f92398a;

        /* renamed from: b */
        final /* synthetic */ LinearLayout f92399b;

        C35739e(ContactSelectorView aVar, LinearLayout linearLayout) {
            this.f92398a = aVar;
            this.f92399b = linearLayout;
        }

        @Override // com.ss.android.lark.contact.impl.contacts_selector.subordinate.AbstractC35774b.AbstractC35775a
        /* renamed from: a */
        public final void mo131546a() {
            AbstractC29565l.AbstractC29567b i = this.f92398a.mo131542b().mo131594i();
            if (i != null) {
                i.onReady();
            }
            this.f92398a.mo131538a(this.f92399b);
        }
    }

    /* renamed from: f */
    private final void m139849f() {
        this.f92392i.setLayoutManager(new LinearLayoutManager(this.f92387d));
        this.f92392i.setAdapter(this.f92388e);
        this.f92392i.setItemAnimator(null);
    }

    /* renamed from: l */
    private final void m139855l() {
        Iterator<T> it = this.f92393j.mo131599k().iterator();
        while (it.hasNext()) {
            this.f92388e.mo131554b((RecyclerView.Adapter<?>) it.next());
        }
    }

    /* renamed from: m */
    private final void m139856m() {
        Iterator<T> it = this.f92393j.mo131597j().iterator();
        while (it.hasNext()) {
            this.f92388e.mo131550a((RecyclerView.Adapter<?>) it.next());
        }
    }

    /* renamed from: k */
    private final SingleItemAdapter m139854k() {
        boolean z;
        if (this.f92393j.mo131581c() == 65281 || this.f92393j.mo131587e()) {
            z = true;
        } else {
            z = false;
        }
        SingleItemAdapter.Companion aVar = SingleItemAdapter.f92409a;
        ContactsSelectorItemFactory a = new ContactsSelectorItemFactory().mo131605a(this.f92393j.mo131592h());
        Context context = this.f92387d;
        Intrinsics.checkExpressionValueIsNotNull(context, "context");
        return aVar.mo131565a(a.mo131602a(context, z));
    }

    /* renamed from: g */
    private final void m139850g() {
        boolean z;
        ContactsSelectorItemFactory a = this.f92391h.mo131604a(this.f92393j.mo131577b()).mo131605a(this.f92393j.mo131592h());
        boolean z2 = true;
        if (this.f92393j.mo131581c() == 65280) {
            z = true;
        } else {
            z = false;
        }
        ContactsSelectorItemFactory.DefaultContactsAdapter a2 = a.mo131606a(z).mo131603a();
        this.f92390g = a2;
        if (a2 != null) {
            if (this.f92393j.mo131581c() == 65280) {
                z2 = false;
            }
            a2.mo131634a(z2);
        }
        ContactsSelectorItemFactory.DefaultContactsAdapter cVar = this.f92390g;
        if (cVar != null) {
            cVar.mo131631a(this.f92393j.mo131590g());
        }
        FlatItemsAdapter aVar = this.f92388e;
        ContactsSelectorItemFactory.DefaultContactsAdapter cVar2 = this.f92390g;
        if (cVar2 != null) {
            aVar.mo131554b(cVar2);
            return;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    /* renamed from: i */
    private final SingleItemAdapter m139852i() {
        LinearLayout linearLayout = new LinearLayout(this.f92387d);
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        linearLayout.setOrientation(1);
        this.f92386a = new C35777d(this.f92387d, linearLayout, this.f92393j.mo131576a()).mo131683a(new C35739e(this, linearLayout)).mo131678a(new C35740f(this));
        linearLayout.post(new RunnableC35741g(this));
        return SingleItemAdapter.f92409a.mo131565a(linearLayout);
    }

    /* renamed from: h */
    private final void m139851h() {
        int c = this.f92393j.mo131581c();
        ArrayList<SingleItemAdapter> arrayList = new ArrayList();
        if (c == 65280) {
            if (this.f92393j.mo131585d()) {
                arrayList.add(m139852i());
            }
            if (this.f92393j.mo131589f()) {
                arrayList.add(m139854k());
            }
            if (this.f92393j.mo131587e()) {
                arrayList.add(m139853j());
            }
        } else {
            if (this.f92393j.mo131587e()) {
                arrayList.add(m139853j());
            }
            if (this.f92393j.mo131589f()) {
                arrayList.add(m139854k());
            }
            if (this.f92393j.mo131585d()) {
                arrayList.add(m139852i());
            }
        }
        if (c == 65280) {
            for (SingleItemAdapter bVar : arrayList) {
                this.f92388e.mo131554b(bVar);
            }
            return;
        }
        for (SingleItemAdapter bVar2 : arrayList) {
            this.f92388e.mo131550a(bVar2);
        }
    }

    /* renamed from: j */
    private final SingleItemAdapter m139853j() {
        LinearLayout linearLayout = new LinearLayout(this.f92387d);
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        linearLayout.setOrientation(1);
        Context context = this.f92387d;
        Intrinsics.checkExpressionValueIsNotNull(context, "context");
        ISchoolParentContactController a = new SchoolParentContactController(context, linearLayout).mo131659a(new C35737c(this, linearLayout)).mo131656a(new C35738d(this));
        if (this.f92393j.mo131581c() == 65281) {
            View view = new View(this.f92387d);
            view.setBackgroundColor(ContextCompat.getColor(view.getContext(), R.color.bg_base));
            linearLayout.addView(view, new LinearLayout.LayoutParams(-1, (int) C25653b.m91892a(this.f92387d, 8.0f)));
        }
        linearLayout.setVisibility(8);
        linearLayout.post(new RunnableC35736b(a));
        return SingleItemAdapter.f92409a.mo131565a(linearLayout);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J$\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/contact/impl/contacts_selector/ContactSelectorView$getSchoolContactView$controller$2", "Lcom/ss/android/lark/contact/impl/contacts_selector/school/ISchoolParentContactListener;", "onItemClick", "", "view", "Landroid/view/View;", "id", "", "schoolNodePreName", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.contact.impl.contacts_selector.a$d */
    public static final class C35738d implements ISchoolParentContactListener {

        /* renamed from: a */
        final /* synthetic */ ContactSelectorView f92397a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C35738d(ContactSelectorView aVar) {
            this.f92397a = aVar;
        }

        @Override // com.ss.android.lark.contact.impl.contacts_selector.school.ISchoolParentContactListener
        /* renamed from: a */
        public void mo131545a(View view, String str, String str2) {
            Intrinsics.checkParameterIsNotNull(str2, "schoolNodePreName");
            AbstractC29565l.AbstractC29566a h = this.f92397a.mo131542b().mo131592h();
            if (h != null) {
                h.mo102953a(str, str2);
            }
            this.f92397a.mo131537a(view);
        }
    }

    /* renamed from: a */
    public final void mo131536a(int i) {
        ContactsSelectorItemFactory.DefaultContactsAdapter cVar = this.f92390g;
        if (cVar != null) {
            cVar.mo131631a(i);
        }
    }

    /* renamed from: a */
    public final void mo131537a(View view) {
        if (DesktopUtil.m144301a(this.f92387d) && this.f92389f != view) {
            if (view != null) {
                view.setSelected(true);
            }
            View view2 = this.f92389f;
            if (!(view2 == null || view2 == null)) {
                view2.setSelected(false);
            }
            this.f92389f = view;
        }
    }

    /* renamed from: a */
    public final void mo131538a(LinearLayout linearLayout) {
        if (this.f92393j.mo131581c() != 65280 || this.f92393j.mo131589f() || this.f92393j.mo131587e()) {
            int i = f92384b;
            if (linearLayout.findViewById(i) == null) {
                View view = new View(this.f92387d);
                view.setLayoutParams(new LinearLayout.LayoutParams(-1, (int) C25653b.m91892a(view.getContext(), 8.0f)));
                view.setId(i);
                view.setBackgroundColor(ContextCompat.getColor(view.getContext(), R.color.bg_base));
                linearLayout.addView(view);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00060\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "view", "Landroid/view/View;", "kotlin.jvm.PlatformType", "id", "", "onItemClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.contact.impl.contacts_selector.a$f */
    public static final class C35740f implements AbstractC35774b {

        /* renamed from: a */
        final /* synthetic */ ContactSelectorView f92400a;

        C35740f(ContactSelectorView aVar) {
            this.f92400a = aVar;
        }

        @Override // com.ss.android.lark.contact.impl.contacts_selector.subordinate.AbstractC35774b
        /* renamed from: a */
        public final void mo131547a(View view, String str) {
            AbstractC29565l.AbstractC29566a h = this.f92400a.mo131542b().mo131592h();
            if (h != null) {
                h.mo102952a(str);
            }
            this.f92400a.mo131537a(view);
            ContactHitPoint.m140787a("organization");
        }
    }

    @Override // com.ss.android.lark.contact.impl.contacts_selector.IContactsSelectorContract.IView
    /* renamed from: a */
    public void mo131539a(ContactsSelectorFragment.Builder aVar, boolean z) {
        Intrinsics.checkParameterIsNotNull(aVar, "newParams");
        if (z) {
            this.f92393j = aVar;
        }
        m139846c();
    }

    public ContactSelectorView(RecyclerView recyclerView, ContactsSelectorFragment.Builder aVar) {
        Intrinsics.checkParameterIsNotNull(recyclerView, "containerRV");
        Intrinsics.checkParameterIsNotNull(aVar, "params");
        this.f92392i = recyclerView;
        this.f92393j = aVar;
        this.f92387d = recyclerView.getContext();
    }

    @Override // com.ss.android.lark.contact.impl.contacts_selector.IContactsSelectorContract.IView
    /* renamed from: a */
    public void mo131540a(ContactsSelectorFragment.Builder aVar, boolean z, boolean z2) {
        Intrinsics.checkParameterIsNotNull(aVar, "newParams");
        if (z || z2) {
            if (z) {
                this.f92393j.mo131574a(aVar.mo131577b());
            }
            if (z2) {
                this.f92393j.mo131595i(aVar.mo131585d());
                this.f92393j.mo131596j(aVar.mo131587e());
                this.f92393j.mo131598k(aVar.mo131589f());
            }
            if (!z || z2) {
                this.f92388e.mo131551a();
                this.f92391h.mo131617l();
                m139847d();
                return;
            }
            ContactsSelectorItemFactory.DefaultContactsAdapter cVar = this.f92390g;
            if (cVar != null) {
                cVar.mo131633a(this.f92391h.mo131604a(this.f92393j.mo131577b()).mo131607b());
            }
            ContactsSelectorItemFactory.DefaultContactsAdapter cVar2 = this.f92390g;
            if (cVar2 != null) {
                cVar2.mo131631a(this.f92393j.mo131590g());
            }
        }
    }
}
