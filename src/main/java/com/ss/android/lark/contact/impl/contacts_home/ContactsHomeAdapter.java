package com.ss.android.lark.contact.impl.contacts_home;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.component.universe_design.checkbox.UDCheckBox;
import com.larksuite.framework.ui.p1198b.AbstractC26197e;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.base.adapter.LarkRecyclerViewBaseAdapter;
import com.ss.android.lark.biz.core.api.AbstractC29565l;
import com.ss.android.lark.contact.C35358a;
import com.ss.android.lark.contact.impl.contacts_banner.C35510a;
import com.ss.android.lark.contact.impl.contacts_home.ContactsHomeAdapter;
import com.ss.android.lark.contact.impl.contacts_selector.ContactsSelectorFragment;
import com.ss.android.lark.contact.impl.viewdata.C36077a;
import com.ss.android.lark.contact.impl.viewdata.ContactViewDataWrapper;
import com.ss.android.lark.contact.p1733b.AbstractC35361b;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.utils.UserStatusHelper;

public class ContactsHomeAdapter extends LarkRecyclerViewBaseAdapter<RecyclerView.ViewHolder, ContactViewDataWrapper> implements AbstractC26197e {

    /* renamed from: h */
    private static final int f92140h = UIHelper.dp2px(36.0f);

    /* renamed from: i */
    private static final int f92141i = UIHelper.dp2px(70.0f);

    /* renamed from: j */
    private static final int f92142j = UIHelper.dp2px(9.0f);

    /* renamed from: a */
    public AbstractC35644c f92143a;

    /* renamed from: b */
    public AbstractC35645d f92144b;

    /* renamed from: c */
    public AbstractC35643b f92145c;

    /* renamed from: d */
    public AbstractC35642a f92146d;

    /* renamed from: e */
    public final C35510a f92147e = new C35510a();

    /* renamed from: f */
    public final boolean f92148f;

    /* renamed from: g */
    public boolean f92149g;

    /* renamed from: k */
    private Context f92150k;

    /* renamed from: l */
    private final Fragment f92151l;

    /* renamed from: m */
    private int f92152m;

    /* renamed from: n */
    private AbstractC29565l.AbstractC29567b f92153n;

    /* renamed from: o */
    private ContactsSelectorFragment f92154o;

    /* renamed from: p */
    private final AbstractC35361b.AbstractC35376o f92155p = C35358a.m138143a().mo130163h();

    /* renamed from: com.ss.android.lark.contact.impl.contacts_home.ContactsHomeAdapter$a */
    public interface AbstractC35642a {
        /* renamed from: a */
        void mo131340a(C36077a aVar);

        /* renamed from: a */
        void mo131341a(String str, boolean z);
    }

    /* renamed from: com.ss.android.lark.contact.impl.contacts_home.ContactsHomeAdapter$b */
    public interface AbstractC35643b {
        /* renamed from: a */
        void mo131342a();

        /* renamed from: b */
        void mo131343b();

        /* renamed from: c */
        void mo131344c();

        /* renamed from: d */
        void mo131345d();

        /* renamed from: e */
        void mo131346e();

        /* renamed from: f */
        void mo131347f();

        /* renamed from: g */
        void mo131348g();

        /* renamed from: h */
        void mo131349h();

        /* renamed from: i */
        void mo131350i();
    }

    /* renamed from: com.ss.android.lark.contact.impl.contacts_home.ContactsHomeAdapter$c */
    public interface AbstractC35644c {
        /* renamed from: a */
        void mo131351a(String str);
    }

    /* renamed from: com.ss.android.lark.contact.impl.contacts_home.ContactsHomeAdapter$d */
    public interface AbstractC35645d {
        /* renamed from: a */
        void mo131352a(String str, String str2);
    }

    /* renamed from: a */
    public void mo131332a(AbstractC35644c cVar) {
        this.f92143a = cVar;
    }

    /* renamed from: a */
    public void mo131333a(AbstractC35645d dVar) {
        this.f92144b = dVar;
    }

    /* renamed from: a */
    public void mo131331a(AbstractC35643b bVar) {
        this.f92145c = bVar;
    }

    /* renamed from: a */
    public void mo131334a(boolean z) {
        this.f92149g = z;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m139478b() {
        AbstractC29565l.AbstractC29567b bVar = this.f92153n;
        if (bVar != null) {
            bVar.onReady();
        }
    }

    public class ContactsHomeLetterHeaderViewHolder_ViewBinding implements Unbinder {

        /* renamed from: a */
        private ContactsHomeLetterHeaderViewHolder f92168a;

        @Override // butterknife.Unbinder
        public void unbind() {
            ContactsHomeLetterHeaderViewHolder contactsHomeLetterHeaderViewHolder = this.f92168a;
            if (contactsHomeLetterHeaderViewHolder != null) {
                this.f92168a = null;
                contactsHomeLetterHeaderViewHolder.mLetterTV = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }

        public ContactsHomeLetterHeaderViewHolder_ViewBinding(ContactsHomeLetterHeaderViewHolder contactsHomeLetterHeaderViewHolder, View view) {
            this.f92168a = contactsHomeLetterHeaderViewHolder;
            contactsHomeLetterHeaderViewHolder.mLetterTV = (TextView) Utils.findRequiredViewAsType(view, R.id.text, "field 'mLetterTV'", TextView.class);
        }
    }

    public class DepartmentBodyViewHolder_ViewBinding implements Unbinder {

        /* renamed from: a */
        private DepartmentBodyViewHolder f92170a;

        @Override // butterknife.Unbinder
        public void unbind() {
            DepartmentBodyViewHolder departmentBodyViewHolder = this.f92170a;
            if (departmentBodyViewHolder != null) {
                this.f92170a = null;
                departmentBodyViewHolder.mContactsOptionsPlaceholder = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }

        public DepartmentBodyViewHolder_ViewBinding(DepartmentBodyViewHolder departmentBodyViewHolder, View view) {
            this.f92170a = departmentBodyViewHolder;
            departmentBodyViewHolder.mContactsOptionsPlaceholder = (ViewGroup) Utils.findRequiredViewAsType(view, R.id.contacts_options_fragment_placeholder, "field 'mContactsOptionsPlaceholder'", ViewGroup.class);
        }
    }

    public class DepartmentHeaderViewHolder_ViewBinding implements Unbinder {

        /* renamed from: a */
        private DepartmentHeaderViewHolder f92174a;

        @Override // butterknife.Unbinder
        public void unbind() {
            DepartmentHeaderViewHolder departmentHeaderViewHolder = this.f92174a;
            if (departmentHeaderViewHolder != null) {
                this.f92174a = null;
                departmentHeaderViewHolder.mSearchHolder = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }

        public DepartmentHeaderViewHolder_ViewBinding(DepartmentHeaderViewHolder departmentHeaderViewHolder, View view) {
            this.f92174a = departmentHeaderViewHolder;
            departmentHeaderViewHolder.mSearchHolder = (FrameLayout) Utils.findRequiredViewAsType(view, R.id.search_placeholder, "field 'mSearchHolder'", FrameLayout.class);
        }
    }

    /* renamed from: a */
    public int mo131328a() {
        ContactsSelectorFragment bVar = this.f92154o;
        if (bVar != null) {
            return bVar.mo131566a();
        }
        return 0;
    }

    /* renamed from: a */
    public void mo131329a(AbstractC29565l.AbstractC29567b bVar) {
        this.f92153n = bVar;
    }

    /* renamed from: a */
    public void mo131330a(AbstractC35642a aVar) {
        this.f92146d = aVar;
    }

    /* renamed from: b */
    public void mo131335b(int i) {
        this.f92152m = i;
        ContactsSelectorFragment bVar = this.f92154o;
        if (bVar != null) {
            bVar.mo131567a(i);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return ((ContactViewDataWrapper) getItem(i)).getType();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        if (recyclerView != null) {
            this.f92150k = recyclerView.getContext();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter, com.ss.android.lark.base.adapter.LarkRecyclerViewBaseAdapter
    public long getItemId(int i) {
        int type;
        ContactViewDataWrapper contactViewDataWrapper = (ContactViewDataWrapper) getItem(i);
        if (contactViewDataWrapper.getType() == 2) {
            type = contactViewDataWrapper.getViewData().f93246d.hashCode();
        } else {
            type = contactViewDataWrapper.getType();
        }
        return (long) type;
    }

    @Override // com.larksuite.framework.ui.p1198b.AbstractC26197e
    /* renamed from: a */
    public long mo93176a(int i) {
        ContactViewDataWrapper contactViewDataWrapper = (ContactViewDataWrapper) getItem(i);
        if (contactViewDataWrapper.getType() != 2) {
            return -1;
        }
        return (long) contactViewDataWrapper.getViewData().f93251i;
    }

    /* renamed from: a */
    private void m139475a(DepartmentBodyViewHolder departmentBodyViewHolder) {
        ContactsSelectorFragment.Builder aVar;
        if (this.f92155p.mo130230b()) {
            aVar = new ContactsSelectorFragment.Builder().mo131573a(true).mo131579b(true).mo131582c(true).mo131586e(true).mo131588f(true).mo131591g(true).mo131578b(this.f92152m);
        } else {
            aVar = new ContactsSelectorFragment.Builder().mo131582c(C35358a.m138143a().mo130150b().mo130208a("oncall.enable")).mo131595i(true).mo131598k(true).mo131596j(true).mo131579b(true).mo131573a(true).mo131586e(true).mo131591g(true).mo131588f(true).mo131578b(this.f92152m);
        }
        aVar.mo131601l(true);
        aVar.mo131571a(new AbstractC29565l.AbstractC29566a() {
            /* class com.ss.android.lark.contact.impl.contacts_home.ContactsHomeAdapter.C356385 */

            @Override // com.ss.android.lark.biz.core.api.AbstractC29565l.AbstractC29566a
            /* renamed from: h */
            public void mo102960h() {
            }

            @Override // com.ss.android.lark.biz.core.api.AbstractC29565l.AbstractC29566a
            /* renamed from: a */
            public void mo102951a() {
                if (ContactsHomeAdapter.this.f92145c != null) {
                    ContactsHomeAdapter.this.f92145c.mo131343b();
                }
            }

            @Override // com.ss.android.lark.biz.core.api.AbstractC29565l.AbstractC29566a
            /* renamed from: b */
            public void mo102954b() {
                if (ContactsHomeAdapter.this.f92145c != null) {
                    ContactsHomeAdapter.this.f92145c.mo131344c();
                }
            }

            @Override // com.ss.android.lark.biz.core.api.AbstractC29565l.AbstractC29566a
            /* renamed from: c */
            public void mo102955c() {
                if (ContactsHomeAdapter.this.f92145c != null) {
                    ContactsHomeAdapter.this.f92145c.mo131345d();
                }
            }

            @Override // com.ss.android.lark.biz.core.api.AbstractC29565l.AbstractC29566a
            /* renamed from: d */
            public void mo102956d() {
                if (ContactsHomeAdapter.this.f92145c != null) {
                    ContactsHomeAdapter.this.f92145c.mo131346e();
                }
            }

            @Override // com.ss.android.lark.biz.core.api.AbstractC29565l.AbstractC29566a
            /* renamed from: e */
            public void mo102957e() {
                if (ContactsHomeAdapter.this.f92145c != null) {
                    ContactsHomeAdapter.this.f92145c.mo131347f();
                }
            }

            @Override // com.ss.android.lark.biz.core.api.AbstractC29565l.AbstractC29566a
            /* renamed from: f */
            public void mo102958f() {
                if (ContactsHomeAdapter.this.f92145c != null) {
                    ContactsHomeAdapter.this.f92145c.mo131348g();
                }
            }

            @Override // com.ss.android.lark.biz.core.api.AbstractC29565l.AbstractC29566a
            /* renamed from: g */
            public void mo102959g() {
                if (ContactsHomeAdapter.this.f92145c != null) {
                    ContactsHomeAdapter.this.f92145c.mo131349h();
                }
            }

            @Override // com.ss.android.lark.biz.core.api.AbstractC29565l.AbstractC29566a
            /* renamed from: i */
            public void mo102961i() {
                if (ContactsHomeAdapter.this.f92145c != null) {
                    ContactsHomeAdapter.this.f92145c.mo131350i();
                }
            }

            @Override // com.ss.android.lark.biz.core.api.AbstractC29565l.AbstractC29566a
            /* renamed from: a */
            public void mo102952a(String str) {
                if (ContactsHomeAdapter.this.f92143a != null) {
                    ContactsHomeAdapter.this.f92143a.mo131351a(str);
                }
            }

            @Override // com.ss.android.lark.biz.core.api.AbstractC29565l.AbstractC29566a
            /* renamed from: a */
            public void mo102953a(String str, String str2) {
                if (ContactsHomeAdapter.this.f92144b != null) {
                    ContactsHomeAdapter.this.f92144b.mo131352a(str, str2);
                }
            }
        });
        aVar.mo131572a(new AbstractC29565l.AbstractC29567b() {
            /* class com.ss.android.lark.contact.impl.contacts_home.$$Lambda$ContactsHomeAdapter$qM3gbRqhxGCjG9sMUkRyxzUuPA */

            @Override // com.ss.android.lark.biz.core.api.AbstractC29565l.AbstractC29567b
            public final void onReady() {
                ContactsHomeAdapter.m270485lambda$qM3gbRqhxGCjG9sMUkRyxzUuPA(ContactsHomeAdapter.this);
            }
        });
        this.f92154o = aVar.mo131600l();
        departmentBodyViewHolder.mContactsOptionsPlaceholder.post(new Runnable(this.f92151l.getChildFragmentManager().beginTransaction(), departmentBodyViewHolder) {
            /* class com.ss.android.lark.contact.impl.contacts_home.$$Lambda$ContactsHomeAdapter$NHYsjet1o7rNAZ0aEYvlC9f0vLk */
            public final /* synthetic */ FragmentTransaction f$1;
            public final /* synthetic */ ContactsHomeAdapter.DepartmentBodyViewHolder f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void run() {
                ContactsHomeAdapter.lambda$NHYsjet1o7rNAZ0aEYvlC9f0vLk(ContactsHomeAdapter.this, this.f$1, this.f$2);
            }
        });
    }

    @Override // com.larksuite.framework.ui.p1198b.AbstractC26197e
    /* renamed from: a */
    public RecyclerView.ViewHolder mo93177a(ViewGroup viewGroup) {
        return new ContactsHomeLetterHeaderViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.contacts_home_letter_header, viewGroup, false));
    }

    public class ContactsHomeLetterHeaderViewHolder extends RecyclerView.ViewHolder {
        @BindView(8192)
        public TextView mLetterTV;

        public ContactsHomeLetterHeaderViewHolder(View view) {
            super(view);
            ButterKnife.bind(this, view);
        }
    }

    public class DepartmentBodyViewHolder extends RecyclerView.ViewHolder {
        @BindView(7066)
        ViewGroup mContactsOptionsPlaceholder;

        public DepartmentBodyViewHolder(View view) {
            super(view);
            ButterKnife.bind(this, view);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m139474a(FragmentTransaction fragmentTransaction, DepartmentBodyViewHolder departmentBodyViewHolder) {
        fragmentTransaction.replace(departmentBodyViewHolder.mContactsOptionsPlaceholder.getId(), this.f92154o).commitAllowingStateLoss();
    }

    public class DepartmentHeaderViewHolder extends RecyclerView.ViewHolder {
        @BindView(8007)
        public FrameLayout mSearchHolder;

        public DepartmentHeaderViewHolder(View view) {
            super(view);
            ButterKnife.bind(this, view);
            this.mSearchHolder.setOnClickListener(new View.OnClickListener(ContactsHomeAdapter.this) {
                /* class com.ss.android.lark.contact.impl.contacts_home.ContactsHomeAdapter.DepartmentHeaderViewHolder.View$OnClickListenerC356411 */

                public void onClick(View view) {
                    ContactsHomeAdapter.this.f92145c.mo131342a();
                }
            });
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ boolean m139477a(C36077a aVar, View view) {
        AbstractC35642a aVar2 = this.f92146d;
        if (aVar2 == null) {
            return true;
        }
        aVar2.mo131340a(aVar);
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(final RecyclerView.ViewHolder viewHolder, int i) {
        int itemViewType = getItemViewType(i);
        if (itemViewType == 0) {
            DepartmentHeaderViewHolder departmentHeaderViewHolder = (DepartmentHeaderViewHolder) viewHolder;
        } else if (itemViewType == 5) {
            if (viewHolder.itemView instanceof FrameLayout) {
                viewHolder.itemView.postDelayed(new Runnable() {
                    /* class com.ss.android.lark.contact.impl.contacts_home.ContactsHomeAdapter.RunnableC356374 */

                    public void run() {
                        ContactsHomeAdapter.this.f92147e.mo130943a((FrameLayout) viewHolder.itemView);
                    }
                }, 1000);
            } else {
                viewHolder.itemView.setVisibility(8);
            }
        } else if (itemViewType == 1) {
            m139475a((DepartmentBodyViewHolder) viewHolder);
        } else if (itemViewType == 2) {
            m139476a((ContactsHomeItemViewHolder) viewHolder, ((ContactViewDataWrapper) getItem(i)).getViewData());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        int i2;
        if (i == 0) {
            View inflate = LayoutInflater.from(this.f92150k).inflate(R.layout.fragment_contacts_department_header, viewGroup, false);
            if (DesktopUtil.m144307b()) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) inflate.getLayoutParams();
                marginLayoutParams.topMargin = UIHelper.getDimens(R.dimen.title_height);
                inflate.setLayoutParams(marginLayoutParams);
            }
            return new DepartmentHeaderViewHolder(inflate);
        } else if (i == 1) {
            return new DepartmentBodyViewHolder(LayoutInflater.from(this.f92150k).inflate(R.layout.fragment_contacts_department_body, viewGroup, false));
        } else {
            if (i == 3) {
                return new RecyclerView.ViewHolder(LayoutInflater.from(this.f92150k).inflate(R.layout.activity_contacts_home_empty_holder, viewGroup, false)) {
                    /* class com.ss.android.lark.contact.impl.contacts_home.ContactsHomeAdapter.C356352 */
                };
            }
            if (i == 4) {
                return new RecyclerView.ViewHolder(LayoutInflater.from(this.f92150k).inflate(R.layout.activity_contacts_home_loading_holder, viewGroup, false)) {
                    /* class com.ss.android.lark.contact.impl.contacts_home.ContactsHomeAdapter.C356363 */
                };
            }
            if (i != 5) {
                LayoutInflater from = LayoutInflater.from(this.f92150k);
                if (DesktopUtil.m144307b()) {
                    i2 = R.layout.activity_contacts_home_item_desktop;
                } else {
                    i2 = R.layout.activity_contacts_home_item;
                }
                return new ContactsHomeItemViewHolder(from.inflate(i2, viewGroup, false));
            }
            FrameLayout frameLayout = new FrameLayout(this.f92150k);
            frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
            return new RecyclerView.ViewHolder(frameLayout) {
                /* class com.ss.android.lark.contact.impl.contacts_home.ContactsHomeAdapter.C356341 */
            };
        }
    }

    /* renamed from: a */
    private void m139476a(final ContactsHomeItemViewHolder contactsHomeItemViewHolder, final C36077a aVar) {
        int i;
        String str = aVar.f93243a;
        String str2 = aVar.f93244b;
        contactsHomeItemViewHolder.contactNameTV.setText(str);
        contactsHomeItemViewHolder.contactTenantTV.setText(str2);
        if (!TextUtils.isEmpty(str2)) {
            contactsHomeItemViewHolder.contactTenantTV.setVisibility(0);
            contactsHomeItemViewHolder.contactTenantTV.setText(str2);
            contactsHomeItemViewHolder.contactNameTV.setPadding(0, UIHelper.dp2px(4.0f), 0, 0);
            contactsHomeItemViewHolder.contactUserStatus.setPadding(0, UIHelper.dp2px(4.0f), 0, 0);
        } else {
            contactsHomeItemViewHolder.contactTenantTV.setVisibility(8);
            contactsHomeItemViewHolder.contactNameTV.setPadding(0, 0, 0, 0);
            contactsHomeItemViewHolder.contactUserStatus.setPadding(0, 0, 0, 0);
        }
        int dp2px = UIHelper.dp2px(48.0f);
        C35358a.m138143a().mo130164i().mo130211a(this.f92151l.getContext(), aVar.f93245c, aVar.f93246d, contactsHomeItemViewHolder.contactAvatar, dp2px, dp2px);
        UDCheckBox uDCheckBox = contactsHomeItemViewHolder.checkBox;
        if (!this.f92148f || !this.f92149g) {
            i = 8;
        } else {
            i = 0;
        }
        uDCheckBox.setVisibility(i);
        if (this.f92148f) {
            contactsHomeItemViewHolder.checkBox.setChecked(aVar.f93252j);
        }
        if (aVar.f93250h == null || TextUtils.isEmpty(aVar.f93250h.description)) {
            contactsHomeItemViewHolder.contactUserStatus.setVisibility(8);
        } else {
            contactsHomeItemViewHolder.contactUserStatus.setVisibility(0);
            contactsHomeItemViewHolder.contactUserStatus.setTextColor(this.f92150k.getResources().getColor(R.color.lkui_N500));
            contactsHomeItemViewHolder.contactUserStatus.mo201154a(aVar.f93250h.description, UIUtils.getDrawable(this.f92150k, UserStatusHelper.m224138a().mo195998a(aVar.f93250h.type.getNumber())));
        }
        contactsHomeItemViewHolder.checkBox.setClickable(false);
        if (!aVar.f93253k) {
            contactsHomeItemViewHolder.checkBox.setChecked(true);
            contactsHomeItemViewHolder.checkBox.setEnabled(false);
            contactsHomeItemViewHolder.contactLayout.setOnClickListener(null);
        } else {
            contactsHomeItemViewHolder.checkBox.setEnabled(true);
            contactsHomeItemViewHolder.contactLayout.setOnClickListener(new View.OnClickListener() {
                /* class com.ss.android.lark.contact.impl.contacts_home.ContactsHomeAdapter.View$OnClickListenerC356396 */

                public void onClick(View view) {
                    if (ContactsHomeAdapter.this.f92146d != null) {
                        if (ContactsHomeAdapter.this.f92148f) {
                            contactsHomeItemViewHolder.checkBox.setChecked(!contactsHomeItemViewHolder.checkBox.isChecked());
                            aVar.f93252j = contactsHomeItemViewHolder.checkBox.isChecked();
                            if (!ContactsHomeAdapter.this.f92149g) {
                                for (ContactViewDataWrapper contactViewDataWrapper : ContactsHomeAdapter.this.getItems()) {
                                    if (contactViewDataWrapper.getType() == 2 && !contactViewDataWrapper.getViewData().equals(aVar)) {
                                        contactViewDataWrapper.getViewData().f93252j = false;
                                    }
                                }
                            }
                        }
                        ContactsHomeAdapter.this.f92146d.mo131341a(aVar.f93246d, contactsHomeItemViewHolder.checkBox.isChecked());
                    }
                }
            });
        }
        if (!this.f92148f) {
            contactsHomeItemViewHolder.contactLayout.setOnLongClickListener(new View.OnLongClickListener(aVar) {
                /* class com.ss.android.lark.contact.impl.contacts_home.$$Lambda$ContactsHomeAdapter$EGKxHYfgaZ7XrmIu1SAQFhlvIgQ */
                public final /* synthetic */ C36077a f$1;

                {
                    this.f$1 = r2;
                }

                public final boolean onLongClick(View view) {
                    return ContactsHomeAdapter.lambda$EGKxHYfgaZ7XrmIu1SAQFhlvIgQ(ContactsHomeAdapter.this, this.f$1, view);
                }
            });
            contactsHomeItemViewHolder.deleteBtn.setOnClickListener(new View.OnClickListener() {
                /* class com.ss.android.lark.contact.impl.contacts_home.ContactsHomeAdapter.View$OnClickListenerC356407 */

                public void onClick(View view) {
                    if (ContactsHomeAdapter.this.f92146d != null) {
                        ContactsHomeAdapter.this.f92146d.mo131340a(aVar);
                    }
                }
            });
        }
    }

    @Override // com.larksuite.framework.ui.p1198b.AbstractC26197e
    /* renamed from: a */
    public void mo93178a(RecyclerView.ViewHolder viewHolder, int i) {
        ContactViewDataWrapper contactViewDataWrapper = (ContactViewDataWrapper) getItem(i);
        if (contactViewDataWrapper.getType() != 2) {
            Log.m165397w("ContactsHomeAdapter", "onBindHeaderViewHolder item type is not TYPE_CONTACT_ITEM, type is : " + contactViewDataWrapper.getType());
        } else if (contactViewDataWrapper.getViewData() == null) {
            Log.m165397w("ContactsHomeAdapter", "onBindHeaderViewHolder view data is null");
        } else {
            char c = contactViewDataWrapper.getViewData().f93251i;
            TextView textView = ((ContactsHomeLetterHeaderViewHolder) viewHolder).mLetterTV;
            textView.setText(String.valueOf(c));
            if (this.f92148f) {
                int i2 = f92141i;
                int i3 = f92142j;
                textView.setPadding(i2, i3, 0, i3);
                return;
            }
            int i4 = f92140h;
            int i5 = f92142j;
            textView.setPadding(i4, i5, 0, i5);
        }
    }

    public ContactsHomeAdapter(Fragment fragment, boolean z, boolean z2) {
        this.f92151l = fragment;
        this.f92148f = z;
        this.f92149g = z2;
    }
}
