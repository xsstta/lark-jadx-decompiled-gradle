package com.ss.android.lark.create.groupchat.impl.info;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.larksuite.framework.utils.KeyboardUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.base.fragment.BaseFragment;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.create.groupchat.dto.GroupCreateInfo;
import com.ss.android.lark.create.groupchat.impl.info.InputGroupInfoView;
import com.ss.android.lark.create.groupchat.impl.p1779b.C36275a;
import com.ss.android.lark.create.groupchat.impl.select_member.GroupCreateActivity;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000;\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0004\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\b\u001a\u00020\tJ\u0012\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J&\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J\b\u0010\u0013\u001a\u00020\tH\u0014R\u0010\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0004\n\u0002\u0010\u0005R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/ss/android/lark/create/groupchat/impl/info/InputGroupInfoFragment;", "Lcom/ss/android/lark/base/fragment/BaseFragment;", "()V", "dependency", "com/ss/android/lark/create/groupchat/impl/info/InputGroupInfoFragment$dependency$1", "Lcom/ss/android/lark/create/groupchat/impl/info/InputGroupInfoFragment$dependency$1;", "mPresenter", "Lcom/ss/android/lark/create/groupchat/impl/info/InputGroupInfoPresenter;", "mvp", "", "onActivityCreated", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onFinish", "Companion", "im_create-group-chat_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.create.groupchat.impl.info.b */
public final class InputGroupInfoFragment extends BaseFragment {

    /* renamed from: a */
    public static final Companion f93704a = new Companion(null);

    /* renamed from: b */
    private InputGroupInfoPresenter f93705b;

    /* renamed from: c */
    private final C36313b f93706c = new C36313b(this);

    /* renamed from: d */
    private HashMap f93707d;

    /* renamed from: a */
    public View mo133988a(int i) {
        if (this.f93707d == null) {
            this.f93707d = new HashMap();
        }
        View view = (View) this.f93707d.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f93707d.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: b */
    public void mo133990b() {
        HashMap hashMap = this.f93707d;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.base.fragment.BaseFragment, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo133990b();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/create/groupchat/impl/info/InputGroupInfoFragment$Companion;", "", "()V", "EXTRA_KEY_GROUP_CREATE_INFO", "", "EXTRA_KEY_PICK_CHAT_ENTITY", "EXTRA_KEY_START_EDIT_TIME", "im_create-group-chat_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.create.groupchat.impl.info.b$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/create/groupchat/impl/info/InputGroupInfoFragment$dependency$1", "Lcom/ss/android/lark/create/groupchat/impl/info/InputGroupInfoView$ViewDependency;", "closePage", "", "onGroupChatCreate", "chat", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "isCreateTopicGroup", "", "im_create-group-chat_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.create.groupchat.impl.info.b$b */
    public static final class C36313b implements InputGroupInfoView.ViewDependency {

        /* renamed from: a */
        final /* synthetic */ InputGroupInfoFragment f93708a;

        @Override // com.ss.android.lark.create.groupchat.impl.info.InputGroupInfoView.ViewDependency
        /* renamed from: a */
        public void mo133992a() {
            KeyboardUtils.hideKeyboard(this.f93708a.getActivity());
            this.f93708a.finish();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C36313b(InputGroupInfoFragment bVar) {
            this.f93708a = bVar;
        }

        @Override // com.ss.android.lark.create.groupchat.impl.info.InputGroupInfoView.ViewDependency
        /* renamed from: a */
        public void mo133993a(Chat chat, boolean z) {
            Intrinsics.checkParameterIsNotNull(chat, "chat");
            if (DesktopUtil.m144301a(this.f93708a.getContext())) {
                C36275a.m142823d(GroupCreateActivity.class.getSimpleName());
            } else if (!z || this.f93708a.getActivity() == null) {
                C36275a.m142822c(GroupCreateActivity.class.getSimpleName());
            } else {
                C36275a.m142818a(GroupCreateActivity.class.getSimpleName(), -1);
            }
            KeyboardUtils.hideKeyboard(this.f93708a.getActivity());
            this.f93708a.finish();
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a
    public void onFinish() {
        super.onFinish();
        if (DesktopUtil.m144301a(getContext())) {
            C36275a.m142821b(GroupCreateActivity.class.getSimpleName());
        }
    }

    /* renamed from: a */
    public final void mo133989a() {
        Serializable serializable;
        Bundle arguments = getArguments();
        if (arguments != null) {
            serializable = arguments.getSerializable("key_group_create_info");
        } else {
            serializable = null;
        }
        if (serializable != null) {
            GroupCreateInfo groupCreateInfo = (GroupCreateInfo) serializable;
            ArrayList parcelableArrayList = arguments.getParcelableArrayList("key_data_entity");
            long j = arguments.getLong("key_start_edit_time", 0);
            if (parcelableArrayList == null) {
                parcelableArrayList = new ArrayList();
            }
            ConstraintLayout constraintLayout = (ConstraintLayout) mo133988a(R.id.realRootView);
            Intrinsics.checkExpressionValueIsNotNull(constraintLayout, "realRootView");
            InputGroupInfoPresenter eVar = new InputGroupInfoPresenter(new InputGroupInfoModel(groupCreateInfo, parcelableArrayList), new InputGroupInfoView(getActivity(), constraintLayout, this.f93706c, groupCreateInfo.isCreateTopicGroup()), j);
            this.f93705b = eVar;
            if (eVar != null) {
                eVar.create();
            }
            InputGroupInfoPresenter eVar2 = this.f93705b;
            if (eVar2 != null) {
                eVar2.mo133994a();
                return;
            }
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.create.groupchat.dto.GroupCreateInfo");
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        mo133989a();
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.fragment_input_group_info, viewGroup, false);
    }
}
