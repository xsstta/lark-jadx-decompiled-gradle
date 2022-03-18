package com.ss.android.lark.browser.biz.messenger;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.larksuite.component.webview.container.dto.C25838g;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.browser.C29638a;
import com.ss.android.lark.browser.dependency.IBrowserModuleDependency;
import com.ss.android.lark.utils.PackageChannelManager;
import com.ss.android.lark.widget.listener.OnSingleClickListener;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J*\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0002J\u0016\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0010J\u001e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u00122\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J(\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00122\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0010J\u0012\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/ss/android/lark/browser/biz/messenger/ShareItemHelper;", "", "()V", "CHANNEL_HTONE", "", "createShareItem", "Lcom/larksuite/component/webview/container/dto/WebMoreMenuItem;", "fragment", "Landroidx/fragment/app/Fragment;", "iconResId", "", "titleId", "clickListener", "Lcom/ss/android/lark/widget/listener/OnSingleClickListener;", "getDefaultItems", "itemClicked", "Lcom/ss/android/lark/browser/dependency/IBrowserModuleDependency$ISharedItemClicked;", "getSaasSupportItems", "Ljava/util/ArrayList;", "getShareItems", "activity", "Landroid/app/Activity;", "isHtoneChannel", "", "context", "Landroid/content/Context;", "core_browser_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.browser.biz.messenger.c */
public final class ShareItemHelper {

    /* renamed from: a */
    public static final ShareItemHelper f74495a = new ShareItemHelper();

    private ShareItemHelper() {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/browser/biz/messenger/ShareItemHelper$createShareItem$1", "Lcom/ss/android/lark/widget/listener/OnSingleClickListener;", "onSingleClick", "", "v", "Landroid/view/View;", "core_browser_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.browser.biz.messenger.c$a */
    public static final class C29783a extends OnSingleClickListener {

        /* renamed from: a */
        final /* synthetic */ OnSingleClickListener f74496a;

        C29783a(OnSingleClickListener onSingleClickListener) {
            this.f74496a = onSingleClickListener;
        }

        @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
        public void onSingleClick(View view) {
            OnSingleClickListener onSingleClickListener = this.f74496a;
            if (onSingleClickListener != null) {
                onSingleClickListener.onSingleClick(view);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/browser/biz/messenger/ShareItemHelper$getDefaultItems$1", "Lcom/ss/android/lark/widget/listener/OnSingleClickListener;", "onSingleClick", "", "v", "Landroid/view/View;", "core_browser_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.browser.biz.messenger.c$b */
    public static final class C29784b extends OnSingleClickListener {

        /* renamed from: a */
        final /* synthetic */ IBrowserModuleDependency.AbstractC29897m f74497a;

        C29784b(IBrowserModuleDependency.AbstractC29897m mVar) {
            this.f74497a = mVar;
        }

        @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
        public void onSingleClick(View view) {
            this.f74497a.itemClicked(0);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006¸\u0006\u0000"}, d2 = {"com/ss/android/lark/browser/biz/messenger/ShareItemHelper$getSaasSupportItems$1$1", "Lcom/ss/android/lark/widget/listener/OnSingleClickListener;", "onSingleClick", "", "v", "Landroid/view/View;", "core_browser_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.browser.biz.messenger.c$c */
    public static final class C29785c extends OnSingleClickListener {

        /* renamed from: a */
        final /* synthetic */ Fragment f74498a;

        /* renamed from: b */
        final /* synthetic */ int f74499b;

        /* renamed from: c */
        final /* synthetic */ IBrowserModuleDependency.AbstractC29897m f74500c;

        @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
        public void onSingleClick(View view) {
            this.f74500c.itemClicked(0);
        }

        C29785c(Fragment fragment, int i, IBrowserModuleDependency.AbstractC29897m mVar) {
            this.f74498a = fragment;
            this.f74499b = i;
            this.f74500c = mVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006¸\u0006\u0000"}, d2 = {"com/ss/android/lark/browser/biz/messenger/ShareItemHelper$getSaasSupportItems$1$3", "Lcom/ss/android/lark/widget/listener/OnSingleClickListener;", "onSingleClick", "", "v", "Landroid/view/View;", "core_browser_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.browser.biz.messenger.c$d */
    public static final class C29786d extends OnSingleClickListener {

        /* renamed from: a */
        final /* synthetic */ Fragment f74501a;

        /* renamed from: b */
        final /* synthetic */ int f74502b;

        /* renamed from: c */
        final /* synthetic */ IBrowserModuleDependency.AbstractC29897m f74503c;

        @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
        public void onSingleClick(View view) {
            this.f74503c.itemClicked(1);
        }

        C29786d(Fragment fragment, int i, IBrowserModuleDependency.AbstractC29897m mVar) {
            this.f74501a = fragment;
            this.f74502b = i;
            this.f74503c = mVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006¸\u0006\u0000"}, d2 = {"com/ss/android/lark/browser/biz/messenger/ShareItemHelper$getSaasSupportItems$1$5", "Lcom/ss/android/lark/widget/listener/OnSingleClickListener;", "onSingleClick", "", "v", "Landroid/view/View;", "core_browser_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.browser.biz.messenger.c$e */
    public static final class C29787e extends OnSingleClickListener {

        /* renamed from: a */
        final /* synthetic */ Fragment f74504a;

        /* renamed from: b */
        final /* synthetic */ int f74505b;

        /* renamed from: c */
        final /* synthetic */ IBrowserModuleDependency.AbstractC29897m f74506c;

        @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
        public void onSingleClick(View view) {
            this.f74506c.itemClicked(2);
        }

        C29787e(Fragment fragment, int i, IBrowserModuleDependency.AbstractC29897m mVar) {
            this.f74504a = fragment;
            this.f74505b = i;
            this.f74506c = mVar;
        }
    }

    /* renamed from: a */
    private final boolean m110132a(Context context) {
        if (context != null) {
            return "htone".equals(PackageChannelManager.getBuildPackageChannel(context));
        }
        return false;
    }

    /* renamed from: b */
    private final ArrayList<C25838g> m110133b(Fragment fragment, IBrowserModuleDependency.AbstractC29897m mVar) {
        int i;
        if (fragment.getContext() != null) {
            i = R.drawable.ud_icon_forward_outlined;
        } else {
            i = R.drawable.browser_menu_ic_share;
        }
        ArrayList<C25838g> arrayList = new ArrayList<>();
        ShareItemHelper cVar = f74495a;
        C25838g a = cVar.m110131a(fragment, i, R.string.OpenPlatform_Share_Chat, new C29785c(fragment, i, mVar));
        a.mo91922c(false);
        arrayList.add(a);
        C25838g a2 = cVar.m110131a(fragment, R.drawable.ud_icon_wechat_colorful, R.string.OpenPlatform_Share_WeChat, new C29786d(fragment, i, mVar));
        a2.mo91922c(true);
        arrayList.add(a2);
        if (cVar.m110132a(fragment.getContext())) {
            C25838g a3 = cVar.m110131a(fragment, R.drawable.ud_icon_wechat_friend_colorful, R.string.OpenPlatform_Share_WeChat_Moments, new C29787e(fragment, i, mVar));
            a3.mo91922c(true);
            arrayList.add(a3);
        }
        return arrayList;
    }

    /* renamed from: a */
    public final C25838g mo107263a(Fragment fragment, IBrowserModuleDependency.AbstractC29897m mVar) {
        Intrinsics.checkParameterIsNotNull(fragment, "fragment");
        Intrinsics.checkParameterIsNotNull(mVar, "itemClicked");
        return m110131a(fragment, R.drawable.browser_menu_ic_share, R.string.OpenPlatform_Share_Chat, new C29784b(mVar));
    }

    /* renamed from: a */
    public final ArrayList<C25838g> mo107264a(Activity activity, Fragment fragment, IBrowserModuleDependency.AbstractC29897m mVar) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(fragment, "fragment");
        Intrinsics.checkParameterIsNotNull(mVar, "itemClicked");
        ArrayList<C25838g> arrayList = new ArrayList<>();
        IBrowserModuleDependency a = C29638a.m109622a();
        if (a != null) {
            z = a.isGooglePlay();
        } else {
            z = false;
        }
        Activity activity2 = activity;
        if (PackageChannelManager.getDeployMode(activity2) != 1) {
            arrayList.add(f74495a.mo107263a(fragment, mVar));
            return arrayList;
        } else if (!PackageChannelManager.isKABuildPackage(activity2) && !z) {
            arrayList.addAll(f74495a.m110133b(fragment, mVar));
            return arrayList;
        } else if (m110132a(activity2)) {
            arrayList.addAll(f74495a.m110133b(fragment, mVar));
            return arrayList;
        } else {
            arrayList.add(f74495a.mo107263a(fragment, mVar));
            return arrayList;
        }
    }

    /* renamed from: a */
    private final C25838g m110131a(Fragment fragment, int i, int i2, OnSingleClickListener onSingleClickListener) {
        return new C25838g(i, UIUtils.getString(fragment.getContext(), i2), new C29783a(onSingleClickListener));
    }
}
