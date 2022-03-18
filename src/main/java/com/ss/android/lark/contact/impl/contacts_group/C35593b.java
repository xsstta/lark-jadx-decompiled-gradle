package com.ss.android.lark.contact.impl.contacts_group;

import android.content.Context;
import android.os.Bundle;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import butterknife.ButterKnife;
import com.larksuite.suite.R;
import com.ss.android.lark.base.fragment.BaseFragment;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.contact.entity.SelectedData;
import com.ss.android.lark.contact.impl.contacts_group.C35593b;
import com.ss.android.lark.contact.impl.contacts_group.ContactsMyGroupView;
import com.ss.android.lark.contact.impl.contacts_group.hitpoint.ContactsMyGroupHitPoint;
import com.ss.android.lark.contact.impl.statistics.ContactHitPoint;
import com.ss.android.lark.monitor.p2372a.C48211b;

/* renamed from: com.ss.android.lark.contact.impl.contacts_group.b */
public class C35593b extends BaseFragment {

    /* renamed from: a */
    public boolean f92076a;

    /* renamed from: b */
    public View f92077b;

    /* renamed from: c */
    private C35597d f92078c;

    /* renamed from: d */
    private AbstractC35602f f92079d;

    /* renamed from: e */
    private final ContactsMyGroupView.AbstractC35589a f92080e = new ContactsMyGroupView.AbstractC35589a() {
        /* class com.ss.android.lark.contact.impl.contacts_group.C35593b.C355941 */

        @Override // com.ss.android.lark.contact.impl.contacts_group.ContactsMyGroupView.AbstractC35589a
        /* renamed from: a */
        public boolean mo131251a() {
            return C35593b.this.f92076a;
        }

        @Override // com.ss.android.lark.contact.impl.contacts_group.ContactsMyGroupView.AbstractC35589a
        /* renamed from: a */
        public void mo131250a(ContactsMyGroupView contactsMyGroupView) {
            ButterKnife.bind(contactsMyGroupView, C35593b.this.f92077b);
        }
    };

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.contact.impl.contacts_group.b$a */
    public static class C35595a {

        /* renamed from: a */
        private Message f92082a;

        /* renamed from: b */
        private Chat f92083b;

        /* renamed from: a */
        public void mo131268a() {
            m139374a(this.f92082a, this.f92083b);
        }

        /* renamed from: a */
        public void mo131269a(Chat chat) {
            this.f92083b = chat;
        }

        C35595a(Message message) {
            this.f92082a = message;
        }

        /* renamed from: a */
        private void m139374a(Message message, Chat chat) {
            Message obtain = Message.obtain();
            if (chat != null) {
                Bundle bundle = new Bundle();
                obtain.setData(bundle);
                SelectedData selectedData = new SelectedData();
                selectedData.dataType = SelectedData.DataType.CHAT;
                selectedData.id = chat.getId();
                selectedData.name = chat.getName();
                selectedData.avatarKey = chat.getAvatarKey();
                selectedData.addToBundle(bundle);
            }
            try {
                message.replyTo.send(obtain);
            } catch (RemoteException e) {
                Log.e("ContactsMyGroupFragment", "replyMessage error", e);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.f92078c.destroy();
    }

    /* renamed from: a */
    private void m139369a() {
        C35597d dVar = new C35597d(getActivity(), this.f92080e, this.f92079d, getChildFragmentManager());
        this.f92078c = dVar;
        dVar.create();
    }

    /* renamed from: a */
    private void m139370a(Message message) {
        if (message != null) {
            C35595a aVar = new C35595a(message);
            this.f92079d = new AbstractC35602f(aVar) {
                /* class com.ss.android.lark.contact.impl.contacts_group.$$Lambda$b$_TL12kqwKFDgqEvp22IuDU44S0Q */
                public final /* synthetic */ C35593b.C35595a f$1;

                {
                    this.f$1 = r2;
                }

                @Override // com.ss.android.lark.contact.impl.contacts_group.AbstractC35602f
                public final boolean onItemSelected(Chat chat, boolean z, int i) {
                    return C35593b.this.m139371a(this.f$1, chat, z, i);
                }
            };
            getLifecycle().addObserver(new ContactsMyGroupFragment$2(this, aVar));
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        if (getArguments() != null) {
            this.f92076a = getArguments().getBoolean("IS_FROM_CONTACT_TAB", false);
            m139370a((Message) getArguments().getParcelable("SELECT_GROUP_MSG"));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (getActivity() != null) {
            ContactsMyGroupHitPoint.f92084a.mo131272a(getActivity().getIntent().getStringExtra("APPRECIABLE_KEY_CONTACTS_MY_GROUP"));
            if (this.f92076a) {
                ContactHitPoint.m140813n();
            }
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f92077b = layoutInflater.inflate(R.layout.activity_contacts_my_group, viewGroup, false);
        C48211b.m190251a().mo168691c("onCreateView");
        C48211b.m190251a().mo168689b("initMVP");
        m139369a();
        ContactHitPoint.m140790b();
        ContactHitPoint.m140819t();
        C48211b.m190251a().mo168691c("initMVP");
        return this.f92077b;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ boolean m139371a(C35595a aVar, Chat chat, boolean z, int i) {
        aVar.mo131269a(chat);
        finish();
        return true;
    }
}
