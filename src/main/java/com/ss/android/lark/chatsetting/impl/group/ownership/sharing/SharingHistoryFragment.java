package com.ss.android.lark.chatsetting.impl.group.ownership.sharing;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ee.bear.document.tips.BottomDialog;
import com.larksuite.suite.R;
import com.ss.android.lark.base.fragment.BaseFragment;
import com.ss.android.lark.chatsetting.ChatSettingModule;
import com.ss.android.lark.chatsetting.impl.group.ownership.sharing.SharingHistoryView;
import com.ss.android.lark.chatsetting.p1693a.AbstractC34461c;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000;\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0006\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\b\u001a\u00020\tH\u0002J\u0012\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J&\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J\b\u0010\u0013\u001a\u00020\tH\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0004\n\u0002\u0010\u0007¨\u0006\u0015"}, d2 = {"Lcom/ss/android/lark/chatsetting/impl/group/ownership/sharing/SharingHistoryFragment;", "Lcom/ss/android/lark/base/fragment/BaseFragment;", "()V", "mPresenter", "Lcom/ss/android/lark/chatsetting/impl/group/ownership/sharing/SharingHistoryPresenter;", "mViewDependency", "com/ss/android/lark/chatsetting/impl/group/ownership/sharing/SharingHistoryFragment$mViewDependency$1", "Lcom/ss/android/lark/chatsetting/impl/group/ownership/sharing/SharingHistoryFragment$mViewDependency$1;", "initMvp", "", "onActivityCreated", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroy", "Companion", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.sharing.g */
public final class SharingHistoryFragment extends BaseFragment {

    /* renamed from: a */
    public static final Companion f89878a = new Companion(null);

    /* renamed from: b */
    private SharingHistoryPresenter f89879b;

    /* renamed from: c */
    private final C34799b f89880c = new C34799b(this);

    /* renamed from: d */
    private HashMap f89881d;

    /* renamed from: a */
    public void mo128469a() {
        HashMap hashMap = this.f89881d;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.base.fragment.BaseFragment, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo128469a();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/chatsetting/impl/group/ownership/sharing/SharingHistoryFragment$Companion;", "", "()V", "KEY_PARAMS_CHAT_ID", "", "KEY_PARAMS_IS_THREAD", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.sharing.g$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0006H\u0016J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0006H\u0016J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0006H\u0016¨\u0006\r"}, d2 = {"com/ss/android/lark/chatsetting/impl/group/ownership/sharing/SharingHistoryFragment$mViewDependency$1", "Lcom/ss/android/lark/chatsetting/impl/group/ownership/sharing/SharingHistoryView$ViewDependency;", "finish", "", "goToBotProfile", BottomDialog.f17198f, "", "goToChatWindow", "chatId", "goToGroupChatProfile", "goToUserProfile", "openDocUrl", "url", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.sharing.g$b */
    public static final class C34799b implements SharingHistoryView.ViewDependency {

        /* renamed from: a */
        final /* synthetic */ SharingHistoryFragment f89882a;

        @Override // com.ss.android.lark.chatsetting.impl.group.ownership.sharing.SharingHistoryView.ViewDependency
        /* renamed from: a */
        public void mo128470a() {
            this.f89882a.finish();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C34799b(SharingHistoryFragment gVar) {
            this.f89882a = gVar;
        }

        @Override // com.ss.android.lark.chatsetting.impl.group.ownership.sharing.SharingHistoryView.ViewDependency
        /* renamed from: a */
        public void mo128471a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "chatId");
            AbstractC34461c a = ChatSettingModule.m133639a();
            Intrinsics.checkExpressionValueIsNotNull(a, "ChatSettingModule.getDependency()");
            a.mo127280j().mo127429c(this.f89882a.getContext(), str);
        }

        @Override // com.ss.android.lark.chatsetting.impl.group.ownership.sharing.SharingHistoryView.ViewDependency
        /* renamed from: b */
        public void mo128472b(String str) {
            Intrinsics.checkParameterIsNotNull(str, BottomDialog.f17198f);
            AbstractC34461c a = ChatSettingModule.m133639a();
            Intrinsics.checkExpressionValueIsNotNull(a, "ChatSettingModule.getDependency()");
            a.mo127280j().mo127428b(this.f89882a.getContext(), str);
        }

        @Override // com.ss.android.lark.chatsetting.impl.group.ownership.sharing.SharingHistoryView.ViewDependency
        /* renamed from: c */
        public void mo128473c(String str) {
            Intrinsics.checkParameterIsNotNull(str, "url");
            AbstractC34461c a = ChatSettingModule.m133639a();
            Intrinsics.checkExpressionValueIsNotNull(a, "ChatSettingModule.getDependency()");
            a.mo127272c().mo127303a(this.f89882a.getContext(), str, "");
        }

        @Override // com.ss.android.lark.chatsetting.impl.group.ownership.sharing.SharingHistoryView.ViewDependency
        /* renamed from: d */
        public void mo128474d(String str) {
            Intrinsics.checkParameterIsNotNull(str, "chatId");
            AbstractC34461c a = ChatSettingModule.m133639a();
            Intrinsics.checkExpressionValueIsNotNull(a, "ChatSettingModule.getDependency()");
            a.mo127274d().mo127318a(this.f89882a.getContext(), str);
        }

        @Override // com.ss.android.lark.chatsetting.impl.group.ownership.sharing.SharingHistoryView.ViewDependency
        /* renamed from: e */
        public void mo128475e(String str) {
            Intrinsics.checkParameterIsNotNull(str, BottomDialog.f17198f);
            AbstractC34461c a = ChatSettingModule.m133639a();
            Intrinsics.checkExpressionValueIsNotNull(a, "ChatSettingModule.getDependency()");
            a.mo127280j().mo127423a(this.f89882a.getContext(), str);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        SharingHistoryPresenter kVar = this.f89879b;
        if (kVar != null) {
            kVar.destroy();
        }
        super.onDestroy();
    }

    /* renamed from: b */
    private final void m135289b() {
        String str;
        boolean z;
        Bundle arguments = getArguments();
        if (arguments != null) {
            str = arguments.getString("key_params_chat_id");
        } else {
            str = null;
        }
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            z = arguments2.getBoolean("key_params_is_thread");
        } else {
            z = false;
        }
        if (TextUtils.isEmpty(str) || getContext() == null || getView() == null) {
            finish();
            return;
        }
        Context context = getContext();
        if (context == null) {
            Intrinsics.throwNpe();
        }
        Intrinsics.checkExpressionValueIsNotNull(context, "context!!");
        View view = getView();
        if (view == null) {
            Intrinsics.throwNpe();
        }
        Intrinsics.checkExpressionValueIsNotNull(view, "view!!");
        if (str == null) {
            Intrinsics.throwNpe();
        }
        SharingHistoryPresenter kVar = new SharingHistoryPresenter(context, view, str, z, this.f89880c);
        this.f89879b = kVar;
        if (kVar != null) {
            kVar.create();
        }
        SharingHistoryPresenter kVar2 = this.f89879b;
        if (kVar2 != null) {
            kVar2.mo128489b();
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        m135289b();
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.activity_sharing_history, viewGroup, false);
    }
}
