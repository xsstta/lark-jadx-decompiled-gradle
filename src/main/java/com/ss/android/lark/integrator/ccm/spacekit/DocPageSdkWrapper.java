package com.ss.android.lark.integrator.ccm.spacekit;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.view.KeyEvent;
import android.view.MotionEvent;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import com.bytedance.ee.bear.basesdk.api.AbstractC4381f;
import com.bytedance.ee.bear.basesdk.apisupport.DocPageConfig;
import com.bytedance.ee.bear.facade.common.C7661a;
import com.bytedance.ee.bear.facade.common.ExtensionActivityImpl;
import com.bytedance.ee.bear.p391g.C7804b;
import com.google.firebase.messaging.Constants;
import com.ss.android.lark.base.activity.C29525a;
import com.ss.android.lark.chat.entity.page.DocPageConfig;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 32\u00020\u0001:\u000234B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0005H\u0016J*\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u0018\u0010\u0017\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\u0010\u0010\u001a\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\bH\u0016J\u0018\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\u0018\u0010\u001f\u001a\u00020\u001c2\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020 H\u0016J+\u0010!\u001a\u0004\u0018\u0001H\"\"\u0004\b\u0000\u0010\"2\u0006\u0010\u000e\u001a\u00020\b2\f\u0010#\u001a\b\u0012\u0004\u0012\u0002H\"0$H\u0016¢\u0006\u0002\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\bH\u0002J*\u0010'\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020)2\b\u0010+\u001a\u0004\u0018\u00010,H\u0016J\u0010\u0010-\u001a\u00020\u001c2\u0006\u0010\u000e\u001a\u00020\bH\u0016J\u0018\u0010.\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010/\u001a\u000200H\u0016J\u0018\u00101\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0018\u00102\u001a\u00020\u001c2\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0005H\u0016R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0004X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0004¢\u0006\u0002\n\u0000¨\u00065"}, d2 = {"Lcom/ss/android/lark/integrator/ccm/spacekit/DocPageSdkWrapper;", "Lcom/ss/android/lark/integrator/ccm/spacekit/IDocPageSdkWrapper;", "()V", "activityExtensionMap", "", "Lcom/ss/android/lark/base/activity/ActivityExtension;", "Lcom/bytedance/ee/bear/facade/common/ActivityExtension;", "extensionMap", "", "Lcom/bytedance/ee/bear/facade/common/ExtensionActivityImpl;", "loaderMap", "Lcom/bytedance/ee/bear/basesdk/api/IDocPageProvider;", "addExtension", "", "key", "extension", "createDocFragment", "Landroidx/fragment/app/Fragment;", "context", "Landroid/content/Context;", "url", "config", "Lcom/ss/android/lark/chat/entity/page/DocPageConfig;", "createDocPageExtension", "activity", "Landroidx/appcompat/app/AppCompatActivity;", "destroyDocPage", "dispatchKeyEvent", "", "event", "Landroid/view/KeyEvent;", "dispatchTouchEvent", "Landroid/view/MotionEvent;", "findExtension", "T", ShareHitPoint.f121869d, "Ljava/lang/Class;", "(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;", "getDocPageLoader", "onActivityResult", "requestCode", "", "resultCode", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Landroid/content/Intent;", "onBackPressed", "onConfigurationChanged", "newConfig", "Landroid/content/res/Configuration;", "preloadDocPage", "removeExtension", "Companion", "SingletonHolder", "ccm_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.integrator.ccm.c.a */
public final class DocPageSdkWrapper implements IDocPageSdkWrapper {

    /* renamed from: a */
    public static final DocPageSdkWrapper f100544a = SingletonHolder.f100549a.mo143065a();

    /* renamed from: b */
    public static final Companion f100545b = new Companion(null);

    /* renamed from: c */
    private final Map<String, AbstractC4381f> f100546c = new ConcurrentHashMap();

    /* renamed from: d */
    private final Map<String, ExtensionActivityImpl> f100547d = new ConcurrentHashMap();

    /* renamed from: e */
    private final Map<C29525a, C7661a> f100548e = new ConcurrentHashMap();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/integrator/ccm/spacekit/DocPageSdkWrapper$Companion;", "", "()V", "instance", "Lcom/ss/android/lark/integrator/ccm/spacekit/DocPageSdkWrapper;", "getInstance", "()Lcom/ss/android/lark/integrator/ccm/spacekit/DocPageSdkWrapper;", "ccm_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.integrator.ccm.c.a$a */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: a */
        public final DocPageSdkWrapper mo143064a() {
            return DocPageSdkWrapper.f100544a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/integrator/ccm/spacekit/DocPageSdkWrapper$SingletonHolder;", "", "()V", "holder", "Lcom/ss/android/lark/integrator/ccm/spacekit/DocPageSdkWrapper;", "getHolder", "()Lcom/ss/android/lark/integrator/ccm/spacekit/DocPageSdkWrapper;", "ccm_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.integrator.ccm.c.a$b */
    private static final class SingletonHolder {

        /* renamed from: a */
        public static final SingletonHolder f100549a = new SingletonHolder();

        /* renamed from: b */
        private static final DocPageSdkWrapper f100550b = new DocPageSdkWrapper();

        private SingletonHolder() {
        }

        /* renamed from: a */
        public final DocPageSdkWrapper mo143065a() {
            return f100550b;
        }
    }

    @Override // com.ss.android.lark.integrator.ccm.spacekit.IDocPageSdkWrapper
    /* renamed from: a */
    public void mo143059a(String str, C29525a aVar) {
        Intrinsics.checkParameterIsNotNull(str, "key");
        Intrinsics.checkParameterIsNotNull(aVar, "extension");
        if (!this.f100548e.containsKey(aVar)) {
            C7661a aVar2 = new C7661a(aVar.f73816a);
            this.f100548e.put(aVar, aVar2);
            ExtensionActivityImpl extensionActivityImpl = this.f100547d.get(str);
            if (extensionActivityImpl != null) {
                extensionActivityImpl.mo30093a(aVar2);
            }
        }
    }

    @Override // com.ss.android.lark.integrator.ccm.spacekit.IDocPageSdkWrapper
    /* renamed from: a */
    public boolean mo143060a(String str, KeyEvent keyEvent) {
        Intrinsics.checkParameterIsNotNull(str, "key");
        Intrinsics.checkParameterIsNotNull(keyEvent, "event");
        ExtensionActivityImpl extensionActivityImpl = this.f100547d.get(str);
        if (extensionActivityImpl != null) {
            return extensionActivityImpl.mo30095a(keyEvent);
        }
        return false;
    }

    @Override // com.ss.android.lark.integrator.ccm.spacekit.IDocPageSdkWrapper
    /* renamed from: a */
    public boolean mo143061a(String str, MotionEvent motionEvent) {
        Intrinsics.checkParameterIsNotNull(str, "key");
        Intrinsics.checkParameterIsNotNull(motionEvent, "event");
        ExtensionActivityImpl extensionActivityImpl = this.f100547d.get(str);
        if (extensionActivityImpl != null) {
            return extensionActivityImpl.mo30096a(motionEvent);
        }
        return false;
    }

    @Override // com.ss.android.lark.integrator.ccm.spacekit.IDocPageSdkWrapper
    /* renamed from: b */
    public boolean mo143062b(String str) {
        Intrinsics.checkParameterIsNotNull(str, "key");
        ExtensionActivityImpl extensionActivityImpl = this.f100547d.get(str);
        if (extensionActivityImpl != null) {
            return extensionActivityImpl.mo30094a();
        }
        return false;
    }

    /* renamed from: c */
    private final AbstractC4381f m154738c(String str) {
        if (this.f100546c.get(str) != null) {
            return this.f100546c.get(str);
        }
        AbstractC4381f b = C7804b.m31283a().mo17151r().mo17081b();
        Map<String, AbstractC4381f> map = this.f100546c;
        Intrinsics.checkExpressionValueIsNotNull(b, "loader");
        map.put(str, b);
        return b;
    }

    @Override // com.ss.android.lark.integrator.ccm.spacekit.IDocPageSdkWrapper
    /* renamed from: a */
    public void mo143054a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "key");
        AbstractC4381f c = m154738c(str);
        if (c != null) {
            c.mo17038a();
        }
        this.f100546c.remove(str);
    }

    @Override // com.ss.android.lark.integrator.ccm.spacekit.IDocPageSdkWrapper
    /* renamed from: a */
    public <T> T mo143053a(String str, Class<T> cls) {
        Intrinsics.checkParameterIsNotNull(str, "key");
        Intrinsics.checkParameterIsNotNull(cls, ShareHitPoint.f121869d);
        ExtensionActivityImpl extensionActivityImpl = this.f100547d.get(str);
        if (extensionActivityImpl != null) {
            return (T) extensionActivityImpl.mo17222a(cls);
        }
        return null;
    }

    @Override // com.ss.android.lark.integrator.ccm.spacekit.IDocPageSdkWrapper
    /* renamed from: b */
    public boolean mo143063b(String str, C29525a aVar) {
        Intrinsics.checkParameterIsNotNull(str, "key");
        Intrinsics.checkParameterIsNotNull(aVar, "extension");
        if (!this.f100548e.containsKey(aVar)) {
            return false;
        }
        C7661a aVar2 = this.f100548e.get(aVar);
        ExtensionActivityImpl extensionActivityImpl = this.f100547d.get(str);
        if (extensionActivityImpl != null) {
            extensionActivityImpl.mo30098b(aVar2);
        }
        this.f100548e.remove(aVar);
        return true;
    }

    @Override // com.ss.android.lark.integrator.ccm.spacekit.IDocPageSdkWrapper
    /* renamed from: a */
    public void mo143056a(String str, Context context) {
        Intrinsics.checkParameterIsNotNull(str, "key");
        Intrinsics.checkParameterIsNotNull(context, "context");
        AbstractC4381f c = m154738c(str);
        if (c != null) {
            c.mo17039a(context);
        }
    }

    @Override // com.ss.android.lark.integrator.ccm.spacekit.IDocPageSdkWrapper
    /* renamed from: a */
    public void mo143057a(String str, Configuration configuration) {
        Intrinsics.checkParameterIsNotNull(str, "key");
        Intrinsics.checkParameterIsNotNull(configuration, "newConfig");
        ExtensionActivityImpl extensionActivityImpl = this.f100547d.get(str);
        if (extensionActivityImpl != null) {
            extensionActivityImpl.mo30092a(configuration);
        }
    }

    @Override // com.ss.android.lark.integrator.ccm.spacekit.IDocPageSdkWrapper
    /* renamed from: a */
    public void mo143058a(String str, AppCompatActivity appCompatActivity) {
        ExtensionActivityImpl a;
        Intrinsics.checkParameterIsNotNull(str, "key");
        Intrinsics.checkParameterIsNotNull(appCompatActivity, "activity");
        AbstractC4381f fVar = this.f100546c.get(str);
        if (fVar != null && (a = fVar.mo17037a(appCompatActivity)) != null) {
            this.f100547d.put(str, a);
        }
    }

    @Override // com.ss.android.lark.integrator.ccm.spacekit.IDocPageSdkWrapper
    /* renamed from: a */
    public Fragment mo143052a(String str, Context context, String str2, DocPageConfig aVar) {
        Intrinsics.checkParameterIsNotNull(str, "key");
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(str2, "url");
        Intrinsics.checkParameterIsNotNull(aVar, "config");
        com.bytedance.ee.bear.basesdk.apisupport.DocPageConfig a = new DocPageConfig.Builder().mo17133g(aVar.mo124900a()).mo17129c(aVar.mo124901b()).mo17130d(aVar.mo124902c()).mo17132f(aVar.mo124903d()).mo17131e(aVar.mo124904e()).mo17128b(aVar.mo124906f()).mo17126a(aVar.mo124907g()).mo17127a();
        AbstractC4381f c = m154738c(str);
        if (c != null) {
            return c.mo17036a(context, str2, a);
        }
        return null;
    }

    @Override // com.ss.android.lark.integrator.ccm.spacekit.IDocPageSdkWrapper
    /* renamed from: a */
    public void mo143055a(String str, int i, int i2, Intent intent) {
        Intrinsics.checkParameterIsNotNull(str, "key");
        ExtensionActivityImpl extensionActivityImpl = this.f100547d.get(str);
        if (extensionActivityImpl != null) {
            extensionActivityImpl.mo30091a(i, i2, intent);
        }
    }
}
