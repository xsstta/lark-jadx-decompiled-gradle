package com.ss.android.lark.chatsetting.impl.group.ownership.applicant;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.larksuite.suite.R;
import com.ss.android.lark.chatsetting.ChatSettingModule;
import com.ss.android.lark.chatsetting.impl.group.ownership.applicant.ApplicantListView;
import com.ss.android.lark.chatsetting.p1693a.AbstractC34461c;
import com.ss.android.lark.desktopmode.base.FloatWindowParams;
import com.ss.android.lark.desktopmode.p1787a.C36516a;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0017B\u0005¢\u0006\u0002\u0010\u0003J\u0012\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J&\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J\b\u0010\u0016\u001a\u00020\rH\u0016R\u001a\u0010\u0004\u001a\u00020\u0005X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/ss/android/lark/chatsetting/impl/group/ownership/applicant/ApplicantListFragment;", "Lcom/ss/android/lark/desktopmode/app/DesktopCompatFragment;", "Lcom/ss/android/lark/desktopmode/base/FloatWindowParams;", "()V", "chatId", "", "getChatId", "()Ljava/lang/String;", "setChatId", "(Ljava/lang/String;)V", "presenter", "Lcom/ss/android/lark/chatsetting/impl/group/ownership/applicant/ApplicantListPresenter;", "onActivityCreated", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroy", "Dependency", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.applicant.c */
public final class ApplicantListFragment extends C36516a<FloatWindowParams> {

    /* renamed from: a */
    public String f89558a;

    /* renamed from: b */
    private ApplicantListPresenter f89559b;

    /* renamed from: c */
    private HashMap f89560c;

    /* renamed from: b */
    public void mo128093b() {
        HashMap hashMap = this.f89560c;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo128093b();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\u001a\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/chatsetting/impl/group/ownership/applicant/ApplicantListFragment$Dependency;", "Lcom/ss/android/lark/chatsetting/impl/group/ownership/applicant/ApplicantListView$ViewDependency;", "(Lcom/ss/android/lark/chatsetting/impl/group/ownership/applicant/ApplicantListFragment;)V", "finish", "", "goToProfileActivity", "id", "", "chatName", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.applicant.c$a */
    private final class Dependency implements ApplicantListView.ViewDependency {
        @Override // com.ss.android.lark.chatsetting.impl.group.ownership.applicant.ApplicantListView.ViewDependency
        /* renamed from: a */
        public void mo128094a() {
            ApplicantListFragment.this.finish();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public Dependency() {
        }

        @Override // com.ss.android.lark.chatsetting.impl.group.ownership.applicant.ApplicantListView.ViewDependency
        /* renamed from: a */
        public void mo128095a(String str, String str2) {
            Intrinsics.checkParameterIsNotNull(str, "id");
            AbstractC34461c a = ChatSettingModule.m133639a();
            Intrinsics.checkExpressionValueIsNotNull(a, "ChatSettingModule.getDependency()");
            a.mo127280j().mo127424a(ApplicantListFragment.this.getContext(), str, ApplicantListFragment.this.mo128092a(), str2);
        }
    }

    /* renamed from: a */
    public final String mo128092a() {
        String str = this.f89558a;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("chatId");
        }
        return str;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        ApplicantListPresenter eVar = this.f89559b;
        if (eVar != null) {
            eVar.destroy();
        }
        super.onDestroy();
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        String str;
        boolean z;
        super.onActivityCreated(bundle);
        Bundle arguments = getArguments();
        Boolean bool = null;
        if (arguments != null) {
            str = arguments.getString("key_params_chat_id");
        } else {
            str = null;
        }
        if (str == null) {
            str = "";
        }
        this.f89558a = str;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("chatId");
        }
        if (TextUtils.isEmpty(str) || getActivity() == null || getView() == null) {
            finish();
            return;
        }
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            bool = Boolean.valueOf(arguments2.getBoolean("key_params_is_thread"));
        }
        String str2 = this.f89558a;
        if (str2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("chatId");
        }
        FragmentActivity activity = getActivity();
        if (activity == null) {
            Intrinsics.throwNpe();
        }
        Intrinsics.checkExpressionValueIsNotNull(activity, "activity!!");
        FragmentActivity fragmentActivity = activity;
        View view = getView();
        if (view == null) {
            Intrinsics.throwNpe();
        }
        Intrinsics.checkExpressionValueIsNotNull(view, "view!!");
        Dependency aVar = new Dependency();
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            z = false;
        }
        ApplicantListPresenter eVar = new ApplicantListPresenter(str2, fragmentActivity, view, aVar, z);
        this.f89559b = eVar;
        if (eVar != null) {
            eVar.create();
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.activity_applicant_list, viewGroup, false);
    }
}
