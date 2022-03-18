package com.ss.android.lark.search.impl.func.chatinside.detail.folderinside;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.larksuite.suite.R;
import com.ss.android.lark.base.fragment.BaseFragment;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.search.impl.func.chatinside.detail.C53473d;
import com.ss.android.lark.search.impl.func.chatinside.detail.p2610a.C53417a;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\nH\u0002J\b\u0010\u000b\u001a\u00020\fH\u0002J&\u0010\r\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\b\u0010\u0014\u001a\u00020\fH\u0016J\b\u0010\u0015\u001a\u00020\fH\u0016J\u001a\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/ss/android/lark/search/impl/func/chatinside/detail/folderinside/FolderInsideSearchFragment;", "Lcom/ss/android/lark/base/fragment/BaseFragment;", "()V", "mChatId", "", "mPresenter", "Lcom/ss/android/lark/search/impl/func/chatinside/detail/ChatInsideSearchDetailPresenter;", "mRootView", "Landroid/view/View;", "checkValidity", "", "initMVP", "", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "onResume", "onViewCreated", "view", "Companion", "core_search_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.search.impl.func.chatinside.detail.folderinside.a */
public final class FolderInsideSearchFragment extends BaseFragment {

    /* renamed from: a */
    public static final Companion f132143a = new Companion(null);

    /* renamed from: b */
    private C53473d f132144b;

    /* renamed from: c */
    private String f132145c;

    /* renamed from: d */
    private View f132146d;

    /* renamed from: e */
    private HashMap f132147e;

    /* renamed from: a */
    public void mo182614a() {
        HashMap hashMap = this.f132147e;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/search/impl/func/chatinside/detail/folderinside/FolderInsideSearchFragment$Companion;", "", "()V", "KEY_CHAT_ID", "", "LOG_TAG", "core_search_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.search.impl.func.chatinside.detail.folderinside.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.base.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        C53473d dVar = this.f132144b;
        if (dVar != null) {
            dVar.destroy();
        }
        super.onDestroyView();
        mo182614a();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        C53473d dVar = this.f132144b;
        if (dVar != null) {
            dVar.mo182580a();
        }
        C53473d dVar2 = this.f132144b;
        if (dVar2 != null) {
            dVar2.mo182584c();
        }
    }

    /* renamed from: b */
    private final void m207147b() {
        Unit unit;
        View view = this.f132146d;
        if (view != null) {
            FolderInsideSearchFragment aVar = this;
            C53473d dVar = new C53473d(new C53417a(this.f132145c, 10000001), new FolderInsideSearchFileView(aVar, new FolderInsideSearchViewDependency(aVar, view)), 10000001);
            this.f132144b = dVar;
            if (dVar != null) {
                dVar.create();
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            if (unit != null) {
                return;
            }
        }
        finish();
        Unit unit2 = Unit.INSTANCE;
    }

    /* renamed from: c */
    private final boolean m207148c() {
        String str;
        boolean z;
        Bundle arguments = getArguments();
        if (arguments != null) {
            str = arguments.getString("extra.chat.id");
        } else {
            str = null;
        }
        this.f132145c = str;
        String str2 = str;
        if (str2 == null || str2.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        return !z;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.onViewCreated(view, bundle);
        if (!m207148c()) {
            Log.m165383e("FolderInsideSearchFragment", "folder inside search data is invalid");
        } else {
            m207147b();
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.fragment_folder_inside_search, viewGroup, false);
        this.f132146d = inflate;
        return inflate;
    }
}
