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
import com.ss.android.lark.contact.impl.contacts_email.mvp.BusinessCardsModel;
import com.ss.android.lark.contact.impl.contacts_email.mvp.BusinessCardsPresenter;
import com.ss.android.lark.contact.impl.contacts_email.mvp.BusinessCardsView;
import com.ss.android.lark.contact.impl.p1761f.C35883b;
import com.ss.android.lark.contact.impl.statistics.ContactHitPoint;
import com.ss.android.lark.log.Log;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000K\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\b\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\n\u001a\u00020\u000bH\u0002J\"\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J&\u0010\u0012\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u000bH\u0016J\u001a\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u00042\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0004\n\u0002\u0010\t¨\u0006\u001d"}, d2 = {"Lcom/ss/android/lark/contact/impl/contacts_email/BusinessCardsFragment;", "Lcom/ss/android/lark/base/fragment/BaseFragment;", "()V", "mRootView", "Landroid/view/View;", "presenter", "Lcom/ss/android/lark/contact/impl/contacts_email/mvp/BusinessCardsPresenter;", "viewDependency", "com/ss/android/lark/contact/impl/contacts_email/BusinessCardsFragment$viewDependency$1", "Lcom/ss/android/lark/contact/impl/contacts_email/BusinessCardsFragment$viewDependency$1;", "initMVP", "", "onActivityResult", "requestCode", "", "resultCode", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Landroid/content/Intent;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onViewCreated", "view", "Companion", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.contact.impl.contacts_email.b */
public final class BusinessCardsFragment extends BaseFragment {

    /* renamed from: b */
    public static final Companion f91871b = new Companion(null);

    /* renamed from: a */
    public View f91872a;

    /* renamed from: c */
    private BusinessCardsPresenter f91873c;

    /* renamed from: d */
    private final C35531b f91874d = new C35531b(this);

    /* renamed from: e */
    private HashMap f91875e;

    /* renamed from: a */
    public void mo131030a() {
        HashMap hashMap = this.f91875e;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.base.fragment.BaseFragment, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo131030a();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/contact/impl/contacts_email/BusinessCardsFragment$Companion;", "", "()V", "TAG", "", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.contact.impl.contacts_email.b$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\u0007\u001a\u00020\u0003H\u0016J\b\u0010\b\u001a\u00020\u0003H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/contact/impl/contacts_email/BusinessCardsFragment$viewDependency$1", "Lcom/ss/android/lark/contact/impl/contacts_email/mvp/BusinessCardsView$ViewDependency;", "finishActivity", "", "injectView", "view", "Lcom/ss/android/lark/contact/impl/contacts_email/mvp/BusinessCardsView;", "onFinish", "startCardEditActivity", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.contact.impl.contacts_email.b$b */
    public static final class C35531b implements BusinessCardsView.ViewDependency {

        /* renamed from: a */
        final /* synthetic */ BusinessCardsFragment f91876a;

        @Override // com.ss.android.lark.contact.impl.contacts_email.mvp.BusinessCardsView.ViewDependency
        /* renamed from: c */
        public void mo131034c() {
        }

        @Override // com.ss.android.lark.contact.impl.contacts_email.mvp.BusinessCardsView.ViewDependency
        /* renamed from: a */
        public void mo131031a() {
            this.f91876a.finish();
        }

        @Override // com.ss.android.lark.contact.impl.contacts_email.mvp.BusinessCardsView.ViewDependency
        /* renamed from: b */
        public void mo131033b() {
            C35883b.m140625a().mo130269a(this.f91876a.getActivity(), "", "", 100);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C35531b(BusinessCardsFragment bVar) {
            this.f91876a = bVar;
        }

        @Override // com.ss.android.lark.contact.impl.contacts_email.mvp.BusinessCardsView.ViewDependency
        /* renamed from: a */
        public void mo131032a(BusinessCardsView businessCardsView) {
            Intrinsics.checkParameterIsNotNull(businessCardsView, "view");
            ButterKnife.bind(businessCardsView, BusinessCardsFragment.m139014a(this.f91876a));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        BusinessCardsPresenter bVar = this.f91873c;
        if (bVar != null) {
            bVar.destroy();
        }
    }

    /* renamed from: b */
    private final void m139015b() {
        BusinessCardsPresenter bVar = new BusinessCardsPresenter(new BusinessCardsModel(), new BusinessCardsView(this.f91874d, false, false, 6, null));
        this.f91873c = bVar;
        if (bVar != null) {
            bVar.create();
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ View m139014a(BusinessCardsFragment bVar) {
        View view = bVar.f91872a;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRootView");
        }
        return view;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.onViewCreated(view, bundle);
        m139015b();
        ContactHitPoint.m140794c();
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.fragment_business_cards, viewGroup, false);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "inflater.inflate(R.layou…_cards, container, false)");
        this.f91872a = inflate;
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
            Log.m165397w("BusinessCardsFragment", sb.toString());
            return;
        }
        boolean booleanExtra = intent.getBooleanExtra("card_edited", false);
        if ((i == 100 || i == 101) && booleanExtra && (bVar = this.f91873c) != null) {
            bVar.mo131176d();
        }
    }
}
