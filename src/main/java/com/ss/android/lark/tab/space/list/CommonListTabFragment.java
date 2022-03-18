package com.ss.android.lark.tab.space.list;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.larksuite.suite.R;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.base.fragment.BaseFragment;
import com.ss.android.lark.biz.im.api.C29604ae;
import com.ss.android.lark.biz.im.api.ChatBundle;
import com.ss.android.lark.chatwindow.C35228b;
import com.ss.android.lark.dependency.AbstractC36474h;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.tab.space.list.CommonListTabMVPCreator;
import com.ss.android.lark.tab.space.list.entity.BaseListViewData;
import com.ss.android.lark.tab.space.list.mvp.base.CommonListTabPresenter;
import com.ss.android.lark.threaddetail.C55831i;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.annotation.AnnotationRetention;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001:\u0001!B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0002J&\u0010\u0013\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u0012H\u0016J\u0006\u0010\u001b\u001a\u00020\u0012J\u0006\u0010\u001c\u001a\u00020\u0012J\u001a\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u001e\u001a\u00020\u00062\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\u000e\u0010\u001f\u001a\u00020\u00122\u0006\u0010 \u001a\u00020\u000eR\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\b\n\u0000\u0012\u0004\b\t\u0010\u0002R\u0018\u0010\n\u001a\f\u0012\u0006\b\u0001\u0012\u00020\f\u0018\u00010\u000bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lcom/ss/android/lark/tab/space/list/CommonListTabFragment;", "Lcom/ss/android/lark/base/fragment/BaseFragment;", "()V", "mChatId", "", "mRootView", "Landroid/view/View;", "mType", "", "mType$annotations", "presenter", "Lcom/ss/android/lark/tab/space/list/mvp/base/CommonListTabPresenter;", "Lcom/ss/android/lark/tab/space/list/entity/BaseListViewData;", "scrollListener", "Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;", "checkValidity", "", "initMVP", "", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "onPageHide", "onPageShow", "onViewCreated", "view", "setOnScrollListener", "listener", "ListType", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
public final class CommonListTabFragment extends BaseFragment {

    /* renamed from: a */
    private View f136439a;

    /* renamed from: b */
    private String f136440b;

    /* renamed from: c */
    private int f136441c;

    /* renamed from: d */
    private CommonListTabPresenter<? extends BaseListViewData> f136442d;

    /* renamed from: e */
    private RecyclerView.OnScrollListener f136443e;

    /* renamed from: f */
    private HashMap f136444f;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0002\b\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002B\u0000¨\u0006\u0003"}, d2 = {"Lcom/ss/android/lark/tab/space/list/CommonListTabFragment$ListType;", "", "Companion", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    @Retention(RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention(AnnotationRetention.SOURCE)
    public @interface ListType {
        public static final Companion Companion = Companion.f136445a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/tab/space/list/CommonListTabFragment$ListType$Companion;", "", "()V", "SPACE", "", GrsBaseInfo.CountryCodeSource.UNKNOWN, "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.tab.space.list.CommonListTabFragment$ListType$a */
        public static final class Companion {

            /* renamed from: a */
            static final /* synthetic */ Companion f136445a = new Companion();

            private Companion() {
            }
        }
    }

    /* renamed from: b */
    public void mo188432b() {
        HashMap hashMap = this.f136444f;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J \u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\tH\u0016J\u001a\u0010\r\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\u000f"}, d2 = {"com/ss/android/lark/tab/space/list/CommonListTabFragment$initMVP$1$creator$1", "Lcom/ss/android/lark/tab/space/list/CommonListTabMVPCreator$ViewDependency;", "openChat", "", "context", "Landroid/content/Context;", "chatId", "", "position", "", "openThreadDetail", "threadId", "threadPosition", "openUrl", "url", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.tab.space.list.CommonListTabFragment$a */
    public static final class C55293a implements CommonListTabMVPCreator.ViewDependency {
        C55293a() {
        }

        @Override // com.ss.android.lark.tab.space.list.CommonListTabMVPCreator.ViewDependency
        /* renamed from: a */
        public void mo188433a(Context context, String str) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            AbstractC36474h b = C29990c.m110930b();
            Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
            b.mo134593u().mo134330a(context, str);
        }

        @Override // com.ss.android.lark.tab.space.list.CommonListTabMVPCreator.ViewDependency
        /* renamed from: a */
        public void mo188434a(Context context, String str, int i) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            Intrinsics.checkParameterIsNotNull(str, "chatId");
            C35228b.m137564a().mo121114a(context, ChatBundle.m109259a().mo105927a(str).mo105933c("space_tab").mo105920a(i).mo105929a());
        }

        @Override // com.ss.android.lark.tab.space.list.CommonListTabMVPCreator.ViewDependency
        /* renamed from: b */
        public void mo188435b(Context context, String str, int i) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            Intrinsics.checkParameterIsNotNull(str, "threadId");
            C55831i.m216682a(context, new C29604ae.C29606a().mo106670b(str).mo106662a(i).mo106671b(true).mo106674d("space_tab").mo106668a());
        }
    }

    /* renamed from: a */
    public final void mo188430a() {
        CommonListTabPresenter<? extends BaseListViewData> bVar = this.f136442d;
        if (bVar != null) {
            bVar.mo188532a();
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.base.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        CommonListTabPresenter<? extends BaseListViewData> bVar = this.f136442d;
        if (bVar != null) {
            bVar.destroy();
        }
        mo188432b();
    }

    /* renamed from: c */
    private final void m214411c() {
        CommonListTabPresenter<? extends BaseListViewData> bVar;
        String str = this.f136440b;
        if (str != null) {
            CommonListTabPresenter<? extends BaseListViewData> a = new CommonListTabMVPCreator(getActivity(), this.f136441c, str, new C55293a()).mo188436a();
            this.f136442d = a;
            if (a != null) {
                a.create();
            }
            RecyclerView.OnScrollListener onScrollListener = this.f136443e;
            if (onScrollListener != null && (bVar = this.f136442d) != null) {
                bVar.mo188533a(onScrollListener);
            }
        }
    }

    /* renamed from: d */
    private final boolean m214412d() {
        Bundle arguments = getArguments();
        if (arguments == null) {
            return false;
        }
        String string = arguments.getString("key_chat_id");
        this.f136440b = string;
        if (TextUtils.isEmpty(string)) {
            return false;
        }
        int i = arguments.getInt(ShareHitPoint.f121869d);
        this.f136441c = i;
        if (i != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo188431a(RecyclerView.OnScrollListener onScrollListener) {
        Intrinsics.checkParameterIsNotNull(onScrollListener, "listener");
        this.f136443e = onScrollListener;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.onViewCreated(view, bundle);
        if (!m214412d()) {
            Log.m165383e(this.TAG, "common list tab init failed: data is invalid");
        } else {
            m214411c();
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.fragment_chat_tab_doclist, viewGroup, false);
        this.f136439a = inflate;
        return inflate;
    }
}
