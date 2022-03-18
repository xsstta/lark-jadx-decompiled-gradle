package com.ss.android.lark.chatsetting.impl.group.info.time;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.larksuite.suite.R;
import com.ss.android.eventbus.EventBus;
import com.ss.android.lark.base.fragment.BaseFragment;
import com.ss.android.lark.chatsetting.impl.group.DesktopShareTimeFinishEvent;
import com.ss.android.lark.chatsetting.impl.group.info.time.GroupShareTimeView;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0007\u001a\u00020\bH\u0002J\u0006\u0010\t\u001a\u00020\bJ&\u0010\n\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\b\u0010\u0011\u001a\u00020\bH\u0016J\u001a\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/ss/android/lark/chatsetting/impl/group/info/time/GroupShareTimeFragment;", "Lcom/ss/android/lark/base/fragment/BaseFragment;", "()V", "mPresenter", "Lcom/ss/android/lark/chatsetting/impl/group/info/time/GroupShareTimePresenter;", "mRootView", "Landroid/view/View;", "initMVP", "", "onBackPressed", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "onViewCreated", "view", "Companion", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chatsetting.impl.group.info.time.c */
public final class GroupShareTimeFragment extends BaseFragment {

    /* renamed from: a */
    public static final Companion f89511a = new Companion(null);

    /* renamed from: b */
    private GroupShareTimePresenter f89512b;

    /* renamed from: c */
    private View f89513c;

    /* renamed from: d */
    private HashMap f89514d;

    /* renamed from: a */
    public View mo128054a(int i) {
        if (this.f89514d == null) {
            this.f89514d = new HashMap();
        }
        View view = (View) this.f89514d.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f89514d.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: b */
    public void mo128056b() {
        HashMap hashMap = this.f89514d;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bXT¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/chatsetting/impl/group/info/time/GroupShareTimeFragment$Companion;", "", "()V", "KEY_PARAMS_CHAT_ID", "", "KEY_PARAMS_GROUP_SHARE_TIME_TYPE", "KEY_PARAMS_SHARE_SOURCE", "REQUEST_CODE_GROUP_SHARE_TIME", "", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.group.info.time.c$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public final void mo128055a() {
        GroupShareTimePresenter eVar = this.f89512b;
        if (eVar != null) {
            eVar.mo128063b();
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.base.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        GroupShareTimePresenter eVar = this.f89512b;
        if (eVar != null) {
            eVar.destroy();
        }
        this.f89512b = null;
        super.onDestroyView();
        mo128056b();
    }

    /* renamed from: c */
    private final void m134781c() {
        String str;
        String str2;
        Bundle arguments = getArguments();
        if (arguments != null) {
            str = arguments.getString("key_params_chat_id");
        } else {
            str = null;
        }
        Bundle arguments2 = getArguments();
        if (arguments2 == null || (str2 = arguments2.getString("key_params_share_source")) == null) {
            str2 = "qrcode";
        }
        if (TextUtils.isEmpty(str) || getContext() == null) {
            finish();
        } else if (str != null) {
            GroupShareTimePresenter eVar = new GroupShareTimePresenter(new GroupShareTimeModel(str, str2), new GroupShareTimeView(this, new C34681b(this, str, str2), str, str2));
            this.f89512b = eVar;
            if (eVar != null) {
                eVar.create();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006¸\u0006\u0000"}, d2 = {"com/ss/android/lark/chatsetting/impl/group/info/time/GroupShareTimeFragment$initMVP$1$view$1", "Lcom/ss/android/lark/chatsetting/impl/group/info/time/GroupShareTimeView$IViewDependency;", "gotoLastPage", "", "selectType", "", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.group.info.time.c$b */
    public static final class C34681b implements GroupShareTimeView.IViewDependency {

        /* renamed from: a */
        final /* synthetic */ GroupShareTimeFragment f89515a;

        /* renamed from: b */
        final /* synthetic */ String f89516b;

        /* renamed from: c */
        final /* synthetic */ String f89517c;

        @Override // com.ss.android.lark.chatsetting.impl.group.info.time.GroupShareTimeView.IViewDependency
        /* renamed from: a */
        public void mo128057a(int i) {
            Intent intent = new Intent();
            intent.putExtra("key_params_group_share_time", i);
            this.f89515a.setResult(-1, intent);
            this.f89515a.setRequestCode(2020);
            if (DesktopUtil.m144301a(this.f89515a.getContext())) {
                EventBus.getDefault().trigger(new DesktopShareTimeFinishEvent(this.f89515a.getRequestCode(), -1, intent));
            }
            this.f89515a.finish();
        }

        C34681b(GroupShareTimeFragment cVar, String str, String str2) {
            this.f89515a = cVar;
            this.f89516b = str;
            this.f89517c = str2;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.onViewCreated(view, bundle);
        m134781c();
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.activity_group_share_edit_time, viewGroup, false);
        this.f89513c = inflate;
        return inflate;
    }
}
