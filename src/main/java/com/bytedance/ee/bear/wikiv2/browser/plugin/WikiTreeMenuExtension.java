package com.bytedance.ee.bear.wikiv2.browser.plugin;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.ee.bear.document.DocActivity;
import com.bytedance.ee.bear.facade.common.BaseActivity;
import com.bytedance.ee.bear.facade.common.C7661a;
import com.bytedance.ee.bear.wikiv2.WikiActivity;
import com.bytedance.ee.bear.wikiv2.wikitreev2.FocusChangeEvent;
import com.bytedance.ee.bear.wikiv2.wikitreev2.NonStickyMutableLiveData;
import com.bytedance.ee.bear.wikiv2.wikitreev2.WikiTreeObserver;
import com.bytedance.ee.bear.wikiv2.wikitreev2.panel.WikiTreePanelDialog;
import com.bytedance.ee.bear.wikiv2.wikitreev2.widget.model.C12504l;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p701d.C13615c;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000 \r2\u00020\u0001:\u0001\rB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0002\u001a\u00020\u0003H\u0002R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/bytedance/ee/bear/wikiv2/browser/plugin/WikiTreeMenuExtension;", "Lcom/bytedance/ee/bear/facade/common/ActivityExtension;", "context", "Lcom/bytedance/ee/bear/facade/common/BaseActivity;", "(Lcom/bytedance/ee/bear/facade/common/BaseActivity;)V", "wikiViewModel", "Lcom/bytedance/ee/bear/wikiv2/browser/plugin/WikiViewModel;", "getWikiViewModel", "()Lcom/bytedance/ee/bear/wikiv2/browser/plugin/WikiViewModel;", "setWikiViewModel", "(Lcom/bytedance/ee/bear/wikiv2/browser/plugin/WikiViewModel;)V", "treeSync", "", "Companion", "wiki-implv2_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.wikiv2.browser.plugin.g */
public final class WikiTreeMenuExtension extends C7661a {

    /* renamed from: a */
    public static final Companion f32870a = new Companion(null);

    /* renamed from: c */
    private WikiViewModel f32871c;

    @JvmStatic
    /* renamed from: b */
    public static final WikiTreeMenuExtension m50884b(BaseActivity baseActivity) {
        return f32870a.mo46735a(baseActivity);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/bytedance/ee/bear/wikiv2/browser/plugin/WikiTreeMenuExtension$Companion;", "", "()V", "TAG", "", "attach", "Lcom/bytedance/ee/bear/wikiv2/browser/plugin/WikiTreeMenuExtension;", "context", "Lcom/bytedance/ee/bear/facade/common/BaseActivity;", "wiki-implv2_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.browser.plugin.g$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final WikiTreeMenuExtension mo46735a(BaseActivity baseActivity) {
            Intrinsics.checkParameterIsNotNull(baseActivity, "context");
            WikiTreeMenuExtension gVar = (WikiTreeMenuExtension) baseActivity.mo17222a(WikiTreeMenuExtension.class);
            if (gVar != null) {
                return gVar;
            }
            WikiTreeMenuExtension gVar2 = new WikiTreeMenuExtension(baseActivity);
            baseActivity.mo30077a(gVar2);
            return gVar2;
        }
    }

    /* renamed from: a */
    public final void mo46727a(WikiViewModel hVar) {
        this.f32871c = hVar;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WikiTreeMenuExtension(final BaseActivity baseActivity) {
        super(baseActivity);
        Intrinsics.checkParameterIsNotNull(baseActivity, "context");
        C13615c.f35773a.registerActivityLifecycleCallbacks(new Application.ActivityLifecycleCallbacks(this) {
            /* class com.bytedance.ee.bear.wikiv2.browser.plugin.WikiTreeMenuExtension.C122281 */

            /* renamed from: a */
            final /* synthetic */ WikiTreeMenuExtension f32872a;

            public void onActivityCreated(Activity activity, Bundle bundle) {
                Intrinsics.checkParameterIsNotNull(activity, "activity");
            }

            public void onActivityPaused(Activity activity) {
                Intrinsics.checkParameterIsNotNull(activity, "activity");
            }

            public void onActivityResumed(Activity activity) {
                Intrinsics.checkParameterIsNotNull(activity, "activity");
            }

            public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
                Intrinsics.checkParameterIsNotNull(activity, "activity");
                Intrinsics.checkParameterIsNotNull(bundle, "outState");
            }

            public void onActivityStarted(Activity activity) {
                Intrinsics.checkParameterIsNotNull(activity, "activity");
            }

            public void onActivityDestroyed(Activity activity) {
                Intrinsics.checkParameterIsNotNull(activity, "activity");
                if ((activity instanceof DocActivity) || (activity instanceof WikiActivity)) {
                    C13615c.f35773a.unregisterActivityLifecycleCallbacks(this);
                }
            }

            public void onActivityStopped(Activity activity) {
                Intrinsics.checkParameterIsNotNull(activity, "activity");
                if ((activity instanceof DocActivity) || (activity instanceof WikiActivity)) {
                    this.f32872a.mo46726a(baseActivity);
                }
            }

            {
                this.f32872a = r1;
            }
        });
    }

    /* renamed from: a */
    public final void mo46726a(BaseActivity baseActivity) {
        String str;
        boolean z;
        WikiViewModel hVar = this.f32871c;
        if (hVar != null) {
            String str2 = null;
            if (hVar != null) {
                str = hVar.getSpaceId();
            } else {
                str = null;
            }
            WikiViewModel hVar2 = this.f32871c;
            if (hVar2 != null) {
                str2 = hVar2.getWikiToken();
            }
            if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
                C13479a.m54764b("WikiTreeMenuExtension", "invalid params, return. ");
                return;
            }
            C12504l b = WikiTreePanelDialog.f33305d.mo47286b(baseActivity);
            StringBuilder sb = new StringBuilder();
            sb.append("activity destroy. treeSync, send tree changed. tmpWorkspace: ");
            if (b != null) {
                z = true;
            } else {
                z = false;
            }
            sb.append(z);
            C13479a.m54764b("WikiTreeMenuExtension", sb.toString());
            WikiTreeObserver.f33320a.mo47309a(b);
            NonStickyMutableLiveData<FocusChangeEvent> b2 = WikiTreeObserver.f33320a.mo47310b();
            if (str == null) {
                Intrinsics.throwNpe();
            }
            if (str2 == null) {
                Intrinsics.throwNpe();
            }
            b2.mo47278a(new FocusChangeEvent(str, str2));
        }
    }
}
