package com.ss.android.lark.contact.impl.contacts_email.edit;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import butterknife.ButterKnife;
import com.google.firebase.messaging.Constants;
import com.larksuite.suite.R;
import com.ss.android.lark.contact.C35358a;
import com.ss.android.lark.contact.impl.contacts_email.edit.mvp.CardEditModel;
import com.ss.android.lark.contact.impl.contacts_email.edit.mvp.CardEditPresenter;
import com.ss.android.lark.contact.impl.contacts_email.edit.mvp.CardEditView;
import com.ss.android.lark.contact.p1733b.AbstractC35361b;
import com.ss.android.lark.desktopmode.base.FloatWindowParams;
import com.ss.android.lark.desktopmode.p1787a.C36516a;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.passport.signinsdk_api.country.CountryBean;
import java.io.Serializable;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000g\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0014\u0018\u0000 +2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001+B\u0005¢\u0006\u0002\u0010\u0003J\"\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\u0010\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J&\u0010 \u001a\u0004\u0018\u00010\t2\u0006\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$2\b\u0010%\u001a\u0004\u0018\u00010&H\u0016J\b\u0010'\u001a\u00020\u0017H\u0016J\u001a\u0010(\u001a\u00020\u00172\u0006\u0010)\u001a\u00020\t2\b\u0010%\u001a\u0004\u0018\u00010&H\u0016J\u0006\u0010*\u001a\u00020\u0017R\u000e\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X.¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u00020\tX.¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u00020\u0014X\u0004¢\u0006\u0004\n\u0002\u0010\u0015¨\u0006,"}, d2 = {"Lcom/ss/android/lark/contact/impl/contacts_email/edit/CardEditFragment;", "Lcom/ss/android/lark/desktopmode/app/DesktopCompatFragment;", "Lcom/ss/android/lark/desktopmode/base/FloatWindowParams;", "()V", "cardId", "", "email", "enterMode", "mRootView", "Landroid/view/View;", "getMRootView", "()Landroid/view/View;", "setMRootView", "(Landroid/view/View;)V", "model", "Lcom/ss/android/lark/contact/impl/contacts_email/edit/mvp/CardEditModel;", "name", "presenter", "Lcom/ss/android/lark/contact/impl/contacts_email/edit/mvp/CardEditPresenter;", "viewDependency", "com/ss/android/lark/contact/impl/contacts_email/edit/CardEditFragment$viewDependency$1", "Lcom/ss/android/lark/contact/impl/contacts_email/edit/CardEditFragment$viewDependency$1;", "onActivityResult", "", "requestCode", "", "resultCode", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Landroid/content/Intent;", "onAttach", "context", "Landroid/content/Context;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "onViewCreated", "view", "quite", "Companion", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.contact.impl.contacts_email.edit.a */
public final class CardEditFragment extends C36516a<FloatWindowParams> {

    /* renamed from: b */
    public static final Companion f91892b = new Companion(null);

    /* renamed from: a */
    public View f91893a;

    /* renamed from: c */
    private String f91894c = "";

    /* renamed from: d */
    private String f91895d;

    /* renamed from: e */
    private String f91896e;

    /* renamed from: f */
    private String f91897f;

    /* renamed from: g */
    private CardEditModel f91898g;

    /* renamed from: h */
    private CardEditPresenter f91899h;

    /* renamed from: i */
    private final C35533b f91900i = new C35533b(this);

    /* renamed from: j */
    private HashMap f91901j;

    /* renamed from: c */
    public void mo131050c() {
        HashMap hashMap = this.f91901j;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/contact/impl/contacts_email/edit/CardEditFragment$Companion;", "", "()V", "TAG", "", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.contact.impl.contacts_email.edit.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: b */
    public final void mo131049b() {
        CardEditPresenter bVar = this.f91899h;
        if (bVar != null) {
            bVar.mo131133c();
        }
    }

    /* renamed from: a */
    public final View mo131048a() {
        View view = this.f91893a;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRootView");
        }
        return view;
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public void onDestroyView() {
        CardEditPresenter bVar = this.f91899h;
        if (bVar != null) {
            bVar.destroy();
        }
        super.onDestroyView();
        mo131050c();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\u0003H\u0016¨\u0006\n"}, d2 = {"com/ss/android/lark/contact/impl/contacts_email/edit/CardEditFragment$viewDependency$1", "Lcom/ss/android/lark/contact/impl/contacts_email/edit/mvp/CardEditView$ViewDependency;", "finishActivity", "", "cardEdited", "", "injectView", "view", "Lcom/ss/android/lark/contact/impl/contacts_email/edit/mvp/CardEditView;", "startCountrySelectActivity", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.contact.impl.contacts_email.edit.a$b */
    public static final class C35533b implements CardEditView.ViewDependency {

        /* renamed from: a */
        final /* synthetic */ CardEditFragment f91902a;

        @Override // com.ss.android.lark.contact.impl.contacts_email.edit.mvp.CardEditView.ViewDependency
        /* renamed from: a */
        public void mo131051a() {
            AbstractC35361b a = C35358a.m138143a();
            Intrinsics.checkExpressionValueIsNotNull(a, "ContactModule.getDependency()");
            a.mo130163h().mo130226a(this.f91902a.getActivity(), 10010);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C35533b(CardEditFragment aVar) {
            this.f91902a = aVar;
        }

        @Override // com.ss.android.lark.contact.impl.contacts_email.edit.mvp.CardEditView.ViewDependency
        /* renamed from: a */
        public void mo131052a(CardEditView cardEditView) {
            Intrinsics.checkParameterIsNotNull(cardEditView, "view");
            ButterKnife.bind(cardEditView, this.f91902a.mo131048a());
        }

        @Override // com.ss.android.lark.contact.impl.contacts_email.edit.mvp.CardEditView.ViewDependency
        /* renamed from: a */
        public void mo131053a(boolean z) {
            Intent intent = new Intent();
            intent.putExtra("card_edited", z);
            FragmentActivity activity = this.f91902a.getActivity();
            if (activity != null) {
                activity.setResult(-1, intent);
            }
            this.f91902a.finish();
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        String str;
        String str2;
        String str3;
        String string;
        Intrinsics.checkParameterIsNotNull(context, "context");
        super.onAttach(context);
        Bundle arguments = getArguments();
        String str4 = "";
        if (arguments == null || (str = arguments.getString("card_id")) == null) {
            str = str4;
        }
        this.f91894c = str;
        Bundle arguments2 = getArguments();
        if (arguments2 == null || (str2 = arguments2.getString("key_enter_mode")) == null) {
            str2 = str4;
        }
        this.f91895d = str2;
        Bundle arguments3 = getArguments();
        if (arguments3 == null || (str3 = arguments3.getString("name")) == null) {
            str3 = str4;
        }
        this.f91896e = str3;
        Bundle arguments4 = getArguments();
        if (!(arguments4 == null || (string = arguments4.getString("email")) == null)) {
            str4 = string;
        }
        this.f91897f = str4;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.onViewCreated(view, bundle);
        CardEditView cardEditView = new CardEditView(this.f91900i);
        String str = this.f91894c;
        String str2 = this.f91895d;
        if (str2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("enterMode");
        }
        CardEditModel aVar = new CardEditModel(str, str2, this.f91896e, this.f91897f);
        this.f91898g = aVar;
        CardEditPresenter bVar = new CardEditPresenter(aVar, cardEditView);
        this.f91899h = bVar;
        if (bVar != null) {
            bVar.create();
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.fragment_business_card_edit, viewGroup, false);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "inflater.inflate(R.layou…d_edit, container, false)");
        this.f91893a = inflate;
        if (inflate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRootView");
        }
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        boolean z;
        super.onActivityResult(i, i2, intent);
        if (i2 != -1 || intent == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("onActivityResult failed, resultCode: ");
            sb.append(i2);
            sb.append(" and data is null: ");
            if (intent == null) {
                z = true;
            } else {
                z = false;
            }
            sb.append(z);
            Log.m165389i("CardEditFragment", sb.toString());
        } else if (i == 10010) {
            Serializable serializableExtra = intent.getSerializableExtra(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            if (!(serializableExtra instanceof CountryBean)) {
                serializableExtra = null;
            }
            CountryBean countryBean = (CountryBean) serializableExtra;
            CardEditModel aVar = this.f91898g;
            if (aVar != null) {
                aVar.mo131127a(countryBean);
            }
        }
    }
}
