package com.bytedance.ee.bear.middleground.calendar.plugin;

import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ee.bear.browser.C4929h;
import com.bytedance.ee.bear.browser.C4933k;
import com.bytedance.ee.bear.browser.plugin.AbstractC4948i;
import com.bytedance.ee.bear.browser.plugin.C4943e;
import com.bytedance.ee.bear.browser.plugin.C4946h;
import com.bytedance.ee.bear.browser.plugin.TitleBar;
import com.bytedance.ee.bear.middleground.calendar.p440a.C8891a;
import com.bytedance.ee.bear.middleground.calendar.plugin.toolbar.CalendarToolBarPlugin;
import com.bytedance.ee.bear.middleground.docsdk.C9307b;
import com.bytedance.ee.bear.middleground.docsdk.C9310c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n¨\u0006\u000b"}, d2 = {"Lcom/bytedance/ee/bear/middleground/calendar/plugin/EditorInitHelper;", "", "()V", "newDocSdk", "", "lifecycleOwner", "Landroidx/fragment/app/Fragment;", "webView", "Lcom/bytedance/ee/bear/middleground/calendar/jsbridge/CalendarWebView;", "contentView", "Landroid/view/ViewGroup;", "middleground-calendar_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.bytedance.ee.bear.middleground.calendar.plugin.a */
public final class EditorInitHelper {

    /* renamed from: a */
    public static final EditorInitHelper f24081a = new EditorInitHelper();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0007H\u0016J%\u0010\b\u001a\u0004\u0018\u0001H\t\"\u0004\b\u0000\u0010\t2\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001H\t0\u000bH\u0016¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"com/bytedance/ee/bear/middleground/calendar/plugin/EditorInitHelper$newDocSdk$pluginHostDelegate$1", "Lcom/bytedance/ee/bear/browser/plugin/PluginHost$Delegate;", "getActivity", "Landroidx/fragment/app/FragmentActivity;", "getLifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "getPluginListProvider", "Lcom/bytedance/ee/bear/browser/plugin/PluginListProvider;", "getService", "T", "aClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Ljava/lang/Object;", "middleground-calendar_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.bytedance.ee.bear.middleground.calendar.plugin.a$b */
    public static final class C8924b implements C4943e.AbstractC4944a {

        /* renamed from: a */
        final /* synthetic */ FragmentActivity f24083a;

        /* renamed from: b */
        final /* synthetic */ Fragment f24084b;

        @Override // com.bytedance.ee.bear.browser.plugin.C4943e.AbstractC4944a
        /* renamed from: a */
        public <T> T mo19325a(Class<T> cls) {
            Intrinsics.checkParameterIsNotNull(cls, "aClass");
            return null;
        }

        @Override // com.bytedance.ee.bear.browser.plugin.C4943e.AbstractC4944a
        public FragmentActivity getActivity() {
            return this.f24083a;
        }

        @Override // com.bytedance.ee.bear.browser.plugin.C4943e.AbstractC4944a
        /* renamed from: a */
        public LifecycleOwner mo19324a() {
            return this.f24084b;
        }

        @Override // com.bytedance.ee.bear.browser.plugin.C4943e.AbstractC4944a
        /* renamed from: b */
        public AbstractC4948i mo19326b() {
            return C8925a.f24085a;
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/bytedance/ee/bear/browser/plugin/PluginList;", "kotlin.jvm.PlatformType", "it", "Lcom/bytedance/ee/bear/browser/plugin/PluginHost;", "getPluginList"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.bytedance.ee.bear.middleground.calendar.plugin.a$b$a */
        static final class C8925a implements AbstractC4948i {

            /* renamed from: a */
            public static final C8925a f24085a = new C8925a();

            C8925a() {
            }

            @Override // com.bytedance.ee.bear.browser.plugin.AbstractC4948i
            /* renamed from: a */
            public final C4946h mo17011a(C4943e eVar) {
                return C4946h.m20453a(C4946h.m20455b(new CalendarToolBarPlugin()));
            }
        }

        C8924b(FragmentActivity fragmentActivity, Fragment fragment) {
            this.f24083a = fragmentActivity;
            this.f24084b = fragment;
        }
    }

    private EditorInitHelper() {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/bytedance/ee/bear/browser/WebPluginHost;", "createPluginHost"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.bytedance.ee.bear.middleground.calendar.plugin.a$a */
    static final class C8923a implements C4943e.AbstractC4945b {

        /* renamed from: a */
        final /* synthetic */ C8891a f24082a;

        C8923a(C8891a aVar) {
            this.f24082a = aVar;
        }

        /* renamed from: a */
        public final C4933k createPluginHost() {
            C8891a aVar = this.f24082a;
            return new C4933k(new C4929h(aVar, aVar.getBridge()));
        }
    }

    /* renamed from: a */
    public final void mo34223a(Fragment fragment, C8891a aVar, ViewGroup viewGroup) {
        Intrinsics.checkParameterIsNotNull(fragment, "lifecycleOwner");
        Intrinsics.checkParameterIsNotNull(aVar, "webView");
        Intrinsics.checkParameterIsNotNull(viewGroup, "contentView");
        FragmentActivity activity = fragment.getActivity();
        if (activity != null) {
            Intrinsics.checkExpressionValueIsNotNull(activity, "lifecycleOwner.activity ?: return");
            new C9307b.C9309a().mo35531a(fragment).mo35532a(new C8924b(activity, fragment)).mo35534a(new C9310c(fragment, viewGroup, (TitleBar) null)).mo35533a(new C8923a(aVar)).mo35535a();
        }
    }
}
