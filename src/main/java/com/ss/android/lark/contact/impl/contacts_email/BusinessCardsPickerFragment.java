package com.ss.android.lark.contact.impl.contacts_email;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import butterknife.ButterKnife;
import com.google.firebase.messaging.Constants;
import com.larksuite.suite.R;
import com.ss.android.lark.base.fragment.BaseFragment;
import com.ss.android.lark.biz.core.api.AbstractC29583s;
import com.ss.android.lark.contact.impl.contacts_email.mvp.BusinessCardsModel;
import com.ss.android.lark.contact.impl.contacts_email.mvp.BusinessCardsPresenter;
import com.ss.android.lark.contact.impl.contacts_email.mvp.BusinessCardsView;
import com.ss.android.lark.contact.impl.p1761f.C35883b;
import com.ss.android.lark.contact.impl.statistics.ContactHitPoint;
import com.ss.android.lark.log.Log;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000s\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u001f\n\u0002\b\u0003*\u0001\"\u0018\u0000 ;2\u00020\u0001:\u0001;B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010$\u001a\u00020%H\u0002J\"\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020(2\b\u0010*\u001a\u0004\u0018\u00010+H\u0016J\u0012\u0010,\u001a\u00020%2\b\u0010-\u001a\u0004\u0018\u00010.H\u0016J&\u0010/\u001a\u0004\u0018\u00010\b2\u0006\u00100\u001a\u0002012\b\u00102\u001a\u0004\u0018\u0001032\b\u0010-\u001a\u0004\u0018\u00010.H\u0016J\b\u00104\u001a\u00020%H\u0016J\u001a\u00105\u001a\u00020%2\u0006\u00106\u001a\u00020\b2\b\u0010-\u001a\u0004\u0018\u00010.H\u0016J\u0014\u00107\u001a\u00020%2\f\u00108\u001a\b\u0012\u0004\u0012\u00020\u000b09J\u0014\u0010:\u001a\u00020%2\f\u00108\u001a\b\u0012\u0004\u0012\u00020\u000b0\nR\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX.¢\u0006\u0002\n\u0000R\"\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0011\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u000e¢\u0006\u0002\n\u0000R\"\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\r\"\u0004\b \u0010\u000fR\u0010\u0010!\u001a\u00020\"X\u0004¢\u0006\u0004\n\u0002\u0010#¨\u0006<"}, d2 = {"Lcom/ss/android/lark/contact/impl/contacts_email/BusinessCardsPickerFragment;", "Lcom/ss/android/lark/base/fragment/BaseFragment;", "()V", "mHideContacts", "", "mHideHeader", "mIsMulti", "mRootView", "Landroid/view/View;", "mSelectedMemberList", "", "", "getMSelectedMemberList", "()Ljava/util/List;", "setMSelectedMemberList", "(Ljava/util/List;)V", "mShowSelect", "multiSelect", "getMultiSelect", "()Z", "setMultiSelect", "(Z)V", "onItemSelectedListener", "Lcom/ss/android/lark/biz/core/api/IEmailContactController$IOnItemSelectedListener;", "getOnItemSelectedListener", "()Lcom/ss/android/lark/biz/core/api/IEmailContactController$IOnItemSelectedListener;", "setOnItemSelectedListener", "(Lcom/ss/android/lark/biz/core/api/IEmailContactController$IOnItemSelectedListener;)V", "presenter", "Lcom/ss/android/lark/contact/impl/contacts_email/mvp/BusinessCardsPresenter;", "selectedView", "getSelectedView", "setSelectedView", "viewDependency", "com/ss/android/lark/contact/impl/contacts_email/BusinessCardsPickerFragment$viewDependency$1", "Lcom/ss/android/lark/contact/impl/contacts_email/BusinessCardsPickerFragment$viewDependency$1;", "initMVP", "", "onActivityResult", "requestCode", "", "resultCode", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Landroid/content/Intent;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroy", "onViewCreated", "view", "updateContainsView", "values", "", "updateSelectedView", "Companion", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.contact.impl.contacts_email.c */
public final class BusinessCardsPickerFragment extends BaseFragment {

    /* renamed from: b */
    public static final Companion f91877b = new Companion(null);

    /* renamed from: a */
    public View f91878a;

    /* renamed from: c */
    private boolean f91879c;

    /* renamed from: d */
    private boolean f91880d;

    /* renamed from: e */
    private boolean f91881e;

    /* renamed from: f */
    private boolean f91882f;

    /* renamed from: g */
    private List<String> f91883g;

    /* renamed from: h */
    private boolean f91884h = true;

    /* renamed from: i */
    private AbstractC29583s.AbstractC29584a f91885i;

    /* renamed from: j */
    private BusinessCardsPresenter f91886j;

    /* renamed from: k */
    private final C35532b f91887k = new C35532b(this);

    /* renamed from: l */
    private HashMap f91888l;

    @JvmStatic
    /* renamed from: a */
    public static final BusinessCardsPickerFragment m139022a(boolean z, boolean z2, boolean z3) {
        return f91877b.mo131039a(z, z2, z3);
    }

    /* renamed from: b */
    public void mo131038b() {
        HashMap hashMap = this.f91888l;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.base.fragment.BaseFragment, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo131038b();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J:\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00112\b\u0010\u0015\u001a\u0004\u0018\u00010\u0004H\u0002J \u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0011H\u0007J0\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/ss/android/lark/contact/impl/contacts_email/BusinessCardsPickerFragment$Companion;", "", "()V", "KEY_CHAT_ID", "", "KEY_CONTACT_SEARCH_TITLE", "KEY_HIDE_CONTACTS", "KEY_HIDE_HEADER", "KEY_IS_MULTI_SELECT", "KEY_SELECTED_IDS", "KEY_SHOW_SELECT", "TAG", "initCommonBundleData", "", "bundle", "Landroid/os/Bundle;", "hideAllHeader", "", "showSelect", "isMultiSelect", "hideContacts", "chatId", "newInstance", "Lcom/ss/android/lark/contact/impl/contacts_email/BusinessCardsPickerFragment;", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.contact.impl.contacts_email.c$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final BusinessCardsPickerFragment mo131039a(boolean z, boolean z2, boolean z3) {
            return mo131040a(z, z2, z3, false, "");
        }

        @JvmStatic
        /* renamed from: a */
        public final BusinessCardsPickerFragment mo131040a(boolean z, boolean z2, boolean z3, boolean z4, String str) {
            Intrinsics.checkParameterIsNotNull(str, "chatId");
            BusinessCardsPickerFragment cVar = new BusinessCardsPickerFragment();
            Bundle bundle = new Bundle();
            m139028a(bundle, z, z2, z3, z4, str);
            cVar.setArguments(bundle);
            return cVar;
        }

        /* renamed from: a */
        private final void m139028a(Bundle bundle, boolean z, boolean z2, boolean z3, boolean z4, String str) {
            bundle.putBoolean("key_hide_header", z);
            bundle.putBoolean("key_show_select", z2);
            bundle.putString("key_chat_id", str);
            bundle.putBoolean("key_is_multi_select", z3);
            bundle.putBoolean("key_hide_contacts", z4);
        }
    }

    /* renamed from: a */
    public final AbstractC29583s.AbstractC29584a mo131035a() {
        return this.f91885i;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\u0007\u001a\u00020\u0003H\u0016J\b\u0010\b\u001a\u00020\u0003H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/contact/impl/contacts_email/BusinessCardsPickerFragment$viewDependency$1", "Lcom/ss/android/lark/contact/impl/contacts_email/mvp/BusinessCardsView$ViewDependency;", "finishActivity", "", "injectView", "view", "Lcom/ss/android/lark/contact/impl/contacts_email/mvp/BusinessCardsView;", "onFinish", "startCardEditActivity", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.contact.impl.contacts_email.c$b */
    public static final class C35532b implements BusinessCardsView.ViewDependency {

        /* renamed from: a */
        final /* synthetic */ BusinessCardsPickerFragment f91889a;

        @Override // com.ss.android.lark.contact.impl.contacts_email.mvp.BusinessCardsView.ViewDependency
        /* renamed from: a */
        public void mo131031a() {
            this.f91889a.finish();
        }

        @Override // com.ss.android.lark.contact.impl.contacts_email.mvp.BusinessCardsView.ViewDependency
        /* renamed from: c */
        public void mo131034c() {
            AbstractC29583s.AbstractC29584a a = this.f91889a.mo131035a();
            if (a != null) {
                a.mo102944a();
            }
        }

        @Override // com.ss.android.lark.contact.impl.contacts_email.mvp.BusinessCardsView.ViewDependency
        /* renamed from: b */
        public void mo131033b() {
            C35883b.m140625a().mo130269a(this.f91889a.getActivity(), "", "", 100);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C35532b(BusinessCardsPickerFragment cVar) {
            this.f91889a = cVar;
        }

        @Override // com.ss.android.lark.contact.impl.contacts_email.mvp.BusinessCardsView.ViewDependency
        /* renamed from: a */
        public void mo131032a(BusinessCardsView businessCardsView) {
            Intrinsics.checkParameterIsNotNull(businessCardsView, "view");
            ButterKnife.bind(businessCardsView, BusinessCardsPickerFragment.m139021a(this.f91889a));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        BusinessCardsPresenter bVar = this.f91886j;
        if (bVar != null) {
            bVar.destroy();
        }
    }

    /* renamed from: c */
    private final void m139023c() {
        BusinessCardsPresenter bVar = new BusinessCardsPresenter(new BusinessCardsModel(), new BusinessCardsView(this.f91887k, this.f91880d, this.f91881e));
        this.f91886j = bVar;
        if (bVar != null) {
            bVar.create();
            bVar.mo131171a(this.f91885i);
            bVar.mo131172a(bVar.mo131173b());
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ View m139021a(BusinessCardsPickerFragment cVar) {
        View view = cVar.f91878a;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRootView");
        }
        return view;
    }

    /* renamed from: a */
    public final void mo131036a(AbstractC29583s.AbstractC29584a aVar) {
        this.f91885i = aVar;
    }

    /* renamed from: a */
    public final void mo131037a(List<String> list) {
        Intrinsics.checkParameterIsNotNull(list, "values");
        BusinessCardsPresenter bVar = this.f91886j;
        if (bVar != null) {
            bVar.mo131174b(list);
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.base.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f91879c = arguments.getBoolean("key_hide_header", false);
            this.f91880d = arguments.getBoolean("key_show_select", false);
            this.f91881e = arguments.getBoolean("key_is_multi_select", false);
            this.f91882f = arguments.getBoolean("key_hide_contacts", false);
            this.f91883g = arguments.getStringArrayList("key_selected_ids");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.onViewCreated(view, bundle);
        m139023c();
        ContactHitPoint.m140794c();
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.fragment_business_cards_picker, viewGroup, false);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "inflater.inflate(R.layou…picker, container, false)");
        this.f91878a = inflate;
        if (inflate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRootView");
        }
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        BusinessCardsPresenter bVar;
        super.onActivityResult(i, i2, intent);
        boolean z = false;
        if (i2 != -1 || intent == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("onActivityResult failed, resultCode: ");
            sb.append(i2);
            sb.append("; data is null: ");
            if (intent == null) {
                z = true;
            }
            sb.append(z);
            Log.m165397w("BusinessCardsCustomFragment", sb.toString());
            return;
        }
        boolean booleanExtra = intent.getBooleanExtra("card_edited", false);
        if ((i == 100 || i == 101) && booleanExtra && (bVar = this.f91886j) != null) {
            bVar.mo131176d();
        }
    }
}
