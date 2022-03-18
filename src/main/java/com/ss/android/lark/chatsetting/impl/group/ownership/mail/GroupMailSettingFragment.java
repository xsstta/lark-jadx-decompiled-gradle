package com.ss.android.lark.chatsetting.impl.group.ownership.mail;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chatsetting.impl.group.ownership.mail.GroupMailSettingView;
import com.ss.android.lark.desktopmode.base.FloatWindowParams;
import com.ss.android.lark.desktopmode.p1787a.C36516a;
import java.io.Serializable;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0012\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0002J\u0012\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\rH\u0016J&\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\u0010\u0010\u001a\u0004\u0018\u00010\rH\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX.¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/ss/android/lark/chatsetting/impl/group/ownership/mail/GroupMailSettingFragment;", "Lcom/ss/android/lark/desktopmode/app/DesktopCompatFragment;", "Lcom/ss/android/lark/desktopmode/base/FloatWindowParams;", "()V", "dependency", "Lcom/ss/android/lark/chatsetting/impl/group/ownership/mail/GroupMailSettingView$ViewDependency;", "getDependency", "()Lcom/ss/android/lark/chatsetting/impl/group/ownership/mail/GroupMailSettingView$ViewDependency;", "presenter", "Lcom/ss/android/lark/chatsetting/impl/group/ownership/mail/GroupMailSettingPresenter;", "initMVP", "", "bundle", "Landroid/os/Bundle;", "onActivityCreated", "", "savedInstanceState", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.mail.a */
public final class GroupMailSettingFragment extends C36516a<FloatWindowParams> {

    /* renamed from: a */
    private GroupMailSettingPresenter f89731a;

    /* renamed from: b */
    private final GroupMailSettingView.ViewDependency f89732b = new C34737a(this);

    /* renamed from: c */
    private HashMap f89733c;

    /* renamed from: a */
    public void mo128274a() {
        HashMap hashMap = this.f89733c;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo128274a();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/ss/android/lark/chatsetting/impl/group/ownership/mail/GroupMailSettingFragment$dependency$1", "Lcom/ss/android/lark/chatsetting/impl/group/ownership/mail/GroupMailSettingView$ViewDependency;", "closeCurrent", "", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.mail.a$a */
    public static final class C34737a implements GroupMailSettingView.ViewDependency {

        /* renamed from: a */
        final /* synthetic */ GroupMailSettingFragment f89734a;

        @Override // com.ss.android.lark.chatsetting.impl.group.ownership.mail.GroupMailSettingView.ViewDependency
        /* renamed from: a */
        public void mo128275a() {
            this.f89734a.finish();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C34737a(GroupMailSettingFragment aVar) {
            this.f89734a = aVar;
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        if (!m135089a(getArguments())) {
            finish();
            return;
        }
        GroupMailSettingPresenter cVar = this.f89731a;
        if (cVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("presenter");
        }
        cVar.create();
    }

    /* renamed from: a */
    private final boolean m135089a(Bundle bundle) {
        if (bundle == null) {
            return false;
        }
        String string = bundle.getString("extra_chat_id", "");
        String string2 = bundle.getString("extra_owner_id", "");
        Serializable serializable = bundle.getSerializable("extra_permission_type");
        if (!(serializable instanceof Chat.GroupMailSendPermissionType)) {
            serializable = null;
        }
        Chat.GroupMailSendPermissionType groupMailSendPermissionType = (Chat.GroupMailSendPermissionType) serializable;
        boolean z = bundle.getBoolean("extra_is_thread", false);
        boolean z2 = bundle.getBoolean("extra_mail_enable", true);
        if (TextUtils.isEmpty(string) || TextUtils.isEmpty(string2) || groupMailSendPermissionType == null || getView() == null) {
            return false;
        }
        View view = getView();
        if (view == null) {
            Intrinsics.throwNpe();
        }
        Intrinsics.checkExpressionValueIsNotNull(view, "view!!");
        GroupMailSettingView.ViewDependency bVar = this.f89732b;
        Intrinsics.checkExpressionValueIsNotNull(string, "chatId");
        Intrinsics.checkExpressionValueIsNotNull(string2, "ownerId");
        this.f89731a = new GroupMailSettingPresenter(view, bVar, string, string2, groupMailSendPermissionType, z, z2);
        return true;
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.activity_group_mail_permission_type_setting, viewGroup, false);
    }
}
