package com.ss.android.lark.contact.feat.contact_recommend;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.google.firebase.messaging.Constants;
import com.larksuite.suite.R;
import com.ss.android.lark.base.fragment.BaseFragment;
import com.ss.android.lark.contact.C35358a;
import com.ss.android.lark.contact.feat.contact_recommend.entity.ContactRecData;
import com.ss.android.lark.contact.feat.contact_recommend.mvp.ContactRecModel;
import com.ss.android.lark.contact.feat.contact_recommend.mvp.ContactRecPresenter;
import com.ss.android.lark.contact.feat.contact_recommend.mvp.ContactRecView;
import com.ss.android.lark.contact.feat.entity.C35471d;
import com.ss.android.lark.contact.feat.statistics.ContactMobileHitPoint;
import com.ss.android.lark.contact.p1733b.AbstractC35361b;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.ui.IActionTitlebar;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 +2\u00020\u0001:\u0001+B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0002J\u0012\u0010\u0018\u001a\u00020\u00172\b\u0010\u0019\u001a\u0004\u0018\u00010\u000eH\u0002J\u0012\u0010\u001a\u001a\u00020\u00172\b\u0010\u0019\u001a\u0004\u0018\u00010\u000eH\u0002J\b\u0010\u001b\u001a\u00020\u0017H\u0002J\b\u0010\u001c\u001a\u00020\u0017H\u0002J\"\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001f2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0016J&\u0010#\u001a\u0004\u0018\u00010\u000e2\u0006\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010'2\b\u0010(\u001a\u0004\u0018\u00010)H\u0016J\u001a\u0010*\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u000e2\b\u0010(\u001a\u0004\u0018\u00010)H\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0013X\u000e¢\u0006\u0002\n\u0000¨\u0006,"}, d2 = {"Lcom/ss/android/lark/contact/feat/contact_recommend/ContactRecFragment;", "Lcom/ss/android/lark/base/fragment/BaseFragment;", "()V", "commonTitleBar", "Lcom/ss/android/lark/ui/CommonTitleBar;", "confirmClickListener", "Landroid/view/View$OnClickListener;", "curClickItemData", "Lcom/ss/android/lark/contact/feat/contact_recommend/entity/ContactRecData;", "hasOneApplied", "", "presenter", "Lcom/ss/android/lark/contact/feat/contact_recommend/mvp/ContactRecPresenter;", "rootView", "Landroid/view/View;", "shouldSkipOnActivityResult", "skipBtn", "Landroid/widget/TextView;", "skipBtnStr", "", "skipClickListener", "titleStr", "changeSkipBtnTextToFinished", "", "doConfirm", "view", "doSkip", "initMVP", "initTitleBar", "onActivityResult", "requestCode", "", "resultCode", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Landroid/content/Intent;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "Companion", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.contact.feat.a.a */
public final class ContactRecFragment extends BaseFragment {

    /* renamed from: h */
    public static final Companion f91498h = new Companion(null);

    /* renamed from: a */
    public String f91499a;

    /* renamed from: b */
    public String f91500b;

    /* renamed from: c */
    public View.OnClickListener f91501c;

    /* renamed from: d */
    public View.OnClickListener f91502d;

    /* renamed from: e */
    public ContactRecData f91503e;

    /* renamed from: f */
    public boolean f91504f;

    /* renamed from: g */
    public boolean f91505g;

    /* renamed from: i */
    private ContactRecPresenter f91506i;

    /* renamed from: j */
    private View f91507j;

    /* renamed from: k */
    private CommonTitleBar f91508k;

    /* renamed from: l */
    private TextView f91509l;

    /* renamed from: m */
    private HashMap f91510m;

    @JvmStatic
    /* renamed from: a */
    public static final ContactRecFragment m138449a(String str, String str2, View.OnClickListener onClickListener, View.OnClickListener onClickListener2) {
        return f91498h.mo130665a(str, str2, onClickListener, onClickListener2);
    }

    /* renamed from: a */
    public void mo130662a() {
        HashMap hashMap = this.f91510m;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.base.fragment.BaseFragment, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo130662a();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J0\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/contact/feat/contact_recommend/ContactRecFragment$Companion;", "", "()V", "REQ_CODE_ADD_FRIEND", "", "newInstance", "Lcom/ss/android/lark/contact/feat/contact_recommend/ContactRecFragment;", "titleStr", "", "skipBtnStr", "skipClickListener", "Landroid/view/View$OnClickListener;", "confirmClickListener", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.contact.feat.a.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final ContactRecFragment mo130665a(String str, String str2, View.OnClickListener onClickListener, View.OnClickListener onClickListener2) {
            ContactRecFragment aVar = new ContactRecFragment();
            aVar.f91499a = str;
            aVar.f91500b = str2;
            aVar.f91501c = onClickListener;
            aVar.f91502d = onClickListener2;
            return aVar;
        }
    }

    /* renamed from: d */
    private final void m138452d() {
        String string;
        TextView textView;
        Context context = getContext();
        if (context != null && (string = context.getString(R.string.Lark_Legacy_Finished)) != null && (textView = this.f91509l) != null) {
            textView.setText(string);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\b\u001a\u00020\u0003H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/contact/feat/contact_recommend/ContactRecFragment$initMVP$view$1", "Lcom/ss/android/lark/contact/feat/contact_recommend/mvp/ContactRecView$ContactAddViewCallback;", "onAddBtnClick", "", "view", "Landroid/view/View;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/lark/contact/feat/contact_recommend/entity/ContactRecData;", "onInviteBtnClick", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.contact.feat.a.a$b */
    public static final class C35412b implements ContactRecView.ContactAddViewCallback {

        /* renamed from: a */
        final /* synthetic */ ContactRecFragment f91511a;

        @Override // com.ss.android.lark.contact.feat.contact_recommend.mvp.list.EmptyItemCallback
        /* renamed from: a */
        public void mo130666a() {
            FragmentActivity activity = this.f91511a.getActivity();
            if (activity != null) {
                AbstractC35361b a = C35358a.m138143a();
                Intrinsics.checkExpressionValueIsNotNull(a, "ContactModule.getDependency()");
                a.mo130158e().mo130212a((Activity) activity, "onboarding");
                this.f91511a.f91505g = true;
            }
            ContactMobileHitPoint.m138540h();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C35412b(ContactRecFragment aVar) {
            this.f91511a = aVar;
        }

        @Override // com.ss.android.lark.contact.feat.contact_recommend.mvp.list.ContactAddItemCallback
        /* renamed from: a */
        public void mo130667a(View view, ContactRecData aVar) {
            String str;
            String str2;
            boolean z;
            boolean z2;
            String str3;
            Intrinsics.checkParameterIsNotNull(aVar, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            C35471d f = aVar.mo130679f();
            if (f != null) {
                str = f.mo130886e();
            } else {
                str = null;
            }
            C35471d f2 = aVar.mo130679f();
            if (f2 != null) {
                str2 = f2.mo130883b();
            } else {
                str2 = null;
            }
            if (str != null) {
                if (str.length() > 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z && str2 != null) {
                    if (str2.length() > 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        String g = aVar.mo130680g();
                        if (g == null) {
                            str3 = "";
                        } else if (StringsKt.contains$default((CharSequence) g, (CharSequence) "@", false, 2, (Object) null)) {
                            str3 = "email";
                        } else {
                            str3 = "phone";
                        }
                        AbstractC35361b a = C35358a.m138143a();
                        Intrinsics.checkExpressionValueIsNotNull(a, "ContactModule.getDependency()");
                        a.mo130168m().mo130245a(this.f91511a.getContext(), str, str2, this.f91511a, str3, 1234);
                        this.f91511a.f91503e = aVar;
                    }
                }
            }
        }
    }

    /* renamed from: b */
    private final void m138450b() {
        View view = this.f91507j;
        if (view != null) {
            ContactRecPresenter bVar = new ContactRecPresenter(new ContactRecModel(), new ContactRecView(view, new C35412b(this)));
            bVar.create();
            this.f91506i = bVar;
            return;
        }
        Log.m165383e(this.TAG, "mRootView is null");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0038, code lost:
        if (r1 != null) goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0064, code lost:
        if (r1 != null) goto L_0x0074;
     */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m138451c() {
        /*
        // Method dump skipped, instructions count: 166
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.contact.feat.contact_recommend.ContactRecFragment.m138451c():void");
    }

    /* renamed from: b */
    public final void mo130664b(View view) {
        View.OnClickListener onClickListener = this.f91502d;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006¸\u0006\u0000"}, d2 = {"com/ss/android/lark/contact/feat/contact_recommend/ContactRecFragment$initTitleBar$4$1", "Lcom/ss/android/lark/ui/IActionTitlebar$TextAction;", "performAction", "", "view", "Landroid/view/View;", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.contact.feat.a.a$c */
    public static final class C35413c extends IActionTitlebar.TextAction {

        /* renamed from: a */
        final /* synthetic */ String f91512a;

        /* renamed from: b */
        final /* synthetic */ ContactRecFragment f91513b;

        /* renamed from: c */
        final /* synthetic */ CommonTitleBar f91514c;

        @Override // com.ss.android.lark.ui.IActionTitlebar.Action, com.ss.android.lark.ui.IActionTitlebar.BaseAction
        public void performAction(View view) {
            if (this.f91513b.f91504f) {
                this.f91513b.mo130664b(view);
            } else {
                this.f91513b.mo130663a(view);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C35413c(String str, String str2, int i, ContactRecFragment aVar, CommonTitleBar commonTitleBar) {
            super(str2, i);
            this.f91512a = str;
            this.f91513b = aVar;
            this.f91514c = commonTitleBar;
        }
    }

    /* renamed from: a */
    public final void mo130663a(View view) {
        View.OnClickListener onClickListener = this.f91501c;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.onViewCreated(view, bundle);
        m138451c();
        m138450b();
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.fragment_contact_rec, viewGroup, false);
        if (inflate == null) {
            return null;
        }
        this.f91507j = inflate;
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1234 && i2 == -1) {
            if (!this.f91504f) {
                this.f91504f = true;
                m138452d();
            }
            ContactRecPresenter bVar = this.f91506i;
            if (bVar != null) {
                bVar.mo130711a(this.f91503e);
            }
        } else if (this.f91505g) {
            mo130663a(null);
        }
    }
}
