package com.bytedance.kit.nglynx;

import android.content.Context;
import android.net.Uri;
import com.bytedance.ies.bullet.service.base.IResourceLoaderService;
import com.bytedance.ies.bullet.service.base.ResourceInfo;
import com.bytedance.ies.bullet.service.base.ResourceType;
import com.bytedance.ies.bullet.service.base.api.IServiceToken;
import com.bytedance.ies.bullet.service.base.resourceloader.config.CustomLoaderConfig;
import com.bytedance.ies.bullet.service.base.resourceloader.config.LoaderType;
import com.bytedance.ies.bullet.service.base.resourceloader.config.TaskConfig;
import com.bytedance.kit.nglynx.compatible.CompatibleUtil;
import com.google.firebase.messaging.Constants;
import com.lynx.tasm.AbstractC26911n;
import com.lynx.tasm.C26906i;
import com.lynx.tasm.LynxPerfMetric;
import com.lynx.tasm.behavior.AbstractC26674h;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import javax.xml.transform.Transformer;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJF\u0010\u0014\u001a\u00020\u00152\u0006\u0010\t\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0016J\b\u0010!\u001a\u00020\u0015H\u0016J\u0012\u0010\"\u001a\u00020\u00152\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J\b\u0010%\u001a\u00020\u0015H\u0016J\u0012\u0010&\u001a\u00020\u00152\b\u0010'\u001a\u0004\u0018\u00010\u0018H\u0016J\b\u0010(\u001a\u00020\u0015H\u0016J$\u0010)\u001a\u00020\u00152\b\u0010*\u001a\u0004\u0018\u00010\u00182\b\u0010+\u001a\u0004\u0018\u00010\u00182\u0006\u0010,\u001a\u00020-H\u0016J\u0012\u0010.\u001a\u00020\u00152\b\u0010/\u001a\u0004\u0018\u00010\u0018H\u0016J\b\u00100\u001a\u00020\u0015H\u0016J\u0012\u00101\u001a\u00020\u00152\b\u00102\u001a\u0004\u0018\u000103H\u0016J\b\u00104\u001a\u00020\u0015H\u0016J\b\u00105\u001a\u00020\u0015H\u0016J\u0012\u00106\u001a\u00020\u00152\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J\u0014\u00107\u001a\u0004\u0018\u00010\u00182\b\u0010/\u001a\u0004\u0018\u00010\u0018H\u0002J\u0014\u00108\u001a\u0004\u0018\u00010\u00182\b\u0010/\u001a\u0004\u0018\u00010\u0018H\u0016J\u0010\u00109\u001a\u00020\u00182\u0006\u0010:\u001a\u00020\u0018H\u0002J\u0010\u0010;\u001a\u00020\u00182\u0006\u0010:\u001a\u00020\u0018H\u0002R\u0010\u0010\t\u001a\u0004\u0018\u00010\u0007X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0010\u0010\r\u001a\u0004\u0018\u00010\u0005X\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006<"}, d2 = {"Lcom/bytedance/kit/nglynx/DefaultLynxViewClient;", "Lcom/lynx/tasm/LynxViewClient;", "initParams", "Lcom/bytedance/kit/nglynx/LynxKitInitParams;", "resLoader", "Lcom/bytedance/ies/bullet/service/base/IResourceLoaderService;", "token", "Lcom/bytedance/ies/bullet/service/base/api/IServiceToken;", "(Lcom/bytedance/kit/nglynx/LynxKitInitParams;Lcom/bytedance/ies/bullet/service/base/IResourceLoaderService;Lcom/bytedance/ies/bullet/service/base/api/IServiceToken;)V", "context", "params", "getParams", "()Lcom/bytedance/kit/nglynx/LynxKitInitParams;", "resourceLoader", "uri", "Landroid/net/Uri;", "getUri", "()Landroid/net/Uri;", "setUri", "(Landroid/net/Uri;)V", "loadImage", "", "Landroid/content/Context;", "cacheKey", "", "src", "width", "", "height", "transformer", "Ljavax/xml/transform/Transformer;", "handler", "Lcom/lynx/tasm/behavior/ImageInterceptor$CompletionHandler;", "onDestroy", "onFirstLoadPerfReady", "metric", "Lcom/lynx/tasm/LynxPerfMetric;", "onFirstScreen", "onLoadFailed", "message", "onLoadSuccess", "onModuleMethodInvoked", "module", "method", "error_code", "", "onPageStart", "url", "onPageUpdate", "onReceivedError", "error", "Lcom/lynx/tasm/LynxError;", "onRuntimeReady", "onUpdateDataWithoutChange", "onUpdatePerfReady", "redirectWithPipeline", "shouldRedirectImageUrl", "wrapAsset", "path", "wrapFile", "x-lynx-kit_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.bytedance.kit.nglynx.a */
public final class DefaultLynxViewClient extends AbstractC26911n {

    /* renamed from: a */
    private Uri f38524a;

    /* renamed from: b */
    private final LynxKitInitParams f38525b;

    /* renamed from: c */
    private final IResourceLoaderService f38526c;

    /* renamed from: d */
    private final IServiceToken f38527d;

    @Override // com.lynx.tasm.AbstractC26911n
    /* renamed from: a */
    public void mo11457a() {
        Iterator<T> it = this.f38525b.mo53731d().iterator();
        while (it.hasNext()) {
            it.next().mo11457a();
        }
    }

    @Override // com.lynx.tasm.AbstractC26911n
    /* renamed from: b */
    public void mo11461b() {
        Iterator<T> it = this.f38525b.mo53731d().iterator();
        while (it.hasNext()) {
            it.next().mo11461b();
        }
    }

    @Override // com.lynx.tasm.AbstractC26911n
    /* renamed from: c */
    public void mo11462c() {
        Iterator<T> it = this.f38525b.mo53731d().iterator();
        while (it.hasNext()) {
            it.next().mo11462c();
        }
    }

    @Override // com.lynx.tasm.AbstractC26911n
    /* renamed from: d */
    public void mo11463d() {
        Iterator<T> it = this.f38525b.mo53731d().iterator();
        while (it.hasNext()) {
            it.next().mo11463d();
        }
    }

    @Override // com.lynx.tasm.AbstractC26911n
    /* renamed from: e */
    public void mo11464e() {
        Iterator<T> it = this.f38525b.mo53731d().iterator();
        while (it.hasNext()) {
            it.next().mo11464e();
        }
    }

    @Override // com.lynx.tasm.AbstractC26911n
    /* renamed from: f */
    public void mo53710f() {
        Iterator<T> it = this.f38525b.mo53731d().iterator();
        while (it.hasNext()) {
            it.next().mo53710f();
        }
    }

    /* renamed from: g */
    private final String m58900g(String str) {
        String uri = Uri.fromFile(new File(str)).toString();
        Intrinsics.checkExpressionValueIsNotNull(uri, "Uri.fromFile(File(path)).toString()");
        return uri;
    }

    /* renamed from: f */
    private final String m58899f(String str) {
        String uri = new Uri.Builder().scheme("asset").authority("").path(str).build().toString();
        Intrinsics.checkExpressionValueIsNotNull(uri, "Uri.Builder()\n          …      .build().toString()");
        return uri;
    }

    @Override // com.lynx.tasm.AbstractC26911n
    /* renamed from: b */
    public void mo50245b(LynxPerfMetric lynxPerfMetric) {
        Iterator<T> it = this.f38525b.mo53731d().iterator();
        while (it.hasNext()) {
            it.next().mo50245b(lynxPerfMetric);
        }
    }

    @Override // com.lynx.tasm.AbstractC26911n
    /* renamed from: c */
    public void mo50246c(String str) {
        Iterator<T> it = this.f38525b.mo53731d().iterator();
        while (it.hasNext()) {
            it.next().mo50246c(str);
        }
    }

    /* renamed from: e */
    private final String m58898e(String str) {
        boolean z;
        IResourceLoaderService iResourceLoaderService;
        String str2 = str;
        boolean z2 = false;
        if (str2 == null || str2.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z || (iResourceLoaderService = this.f38526c) == null) {
            return str;
        }
        TaskConfig jVar = new TaskConfig(null, 1, null);
        jVar.mo52750a(this.f38527d);
        CustomLoaderConfig aVar = new CustomLoaderConfig(true);
        aVar.mo52720a(CollectionsKt.mutableListOf(LoaderType.GECKO, LoaderType.BUILTIN));
        jVar.mo52751a(aVar);
        ResourceInfo loadSync = iResourceLoaderService.loadSync(str, jVar);
        if (loadSync == null) {
            return str;
        }
        String c = loadSync.mo52705c();
        String str3 = c;
        if (str3 == null || str3.length() == 0) {
            z2 = true;
        }
        if (z2) {
            return str;
        }
        if (loadSync.mo52706d() == ResourceType.ASSET) {
            return m58899f(c);
        }
        if (loadSync.mo52706d() == ResourceType.DISK) {
            return m58900g(c);
        }
        return str;
    }

    @Override // com.lynx.tasm.AbstractC26911n
    /* renamed from: a */
    public void mo11458a(LynxPerfMetric lynxPerfMetric) {
        Iterator<T> it = this.f38525b.mo53731d().iterator();
        while (it.hasNext()) {
            it.next().mo11458a(lynxPerfMetric);
        }
    }

    @Override // com.lynx.tasm.AbstractC26911n
    /* renamed from: a */
    public void mo11459a(C26906i iVar) {
        Iterator<T> it = this.f38525b.mo53731d().iterator();
        while (it.hasNext()) {
            it.next().mo11459a(iVar);
        }
    }

    @Override // com.lynx.tasm.behavior.AbstractC26674h, com.lynx.tasm.AbstractC26911n
    /* renamed from: b */
    public String mo33934b(String str) {
        boolean z;
        Iterator<T> it = this.f38525b.mo53731d().iterator();
        while (it.hasNext()) {
            String b = it.next().mo33934b(str);
            if (b != null) {
                return b;
            }
        }
        Uri parse = Uri.parse(str);
        String a = CompatibleUtil.f38535a.mo53712a(this.f38526c, parse, this.f38527d);
        String str2 = a;
        boolean z2 = false;
        if (str2 == null || str2.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!(!z)) {
            a = null;
        }
        if (a != null) {
            return a;
        }
        String e = m58898e(str);
        if (e != null) {
            if (!(!equals(str))) {
                e = null;
            }
            if (e != null) {
                return e;
            }
        }
        String str3 = str;
        if (str3 == null || str3.length() == 0) {
            z2 = true;
        }
        if (!z2) {
            List listOf = CollectionsKt.listOf((Object[]) new String[]{"http", "https", "file", "content", "res", Constants.ScionAnalytics.MessageType.DATA_MESSAGE});
            Intrinsics.checkExpressionValueIsNotNull(parse, "uri");
            String scheme = parse.getScheme();
            if (scheme == null) {
                scheme = "";
            }
            if (listOf.contains(scheme)) {
                return str;
            }
            if (Intrinsics.areEqual(parse.getScheme(), "bundle") || Intrinsics.areEqual(parse.getScheme(), "relative")) {
                parse.getPath();
            }
        }
        return null;
    }

    @Override // com.lynx.tasm.AbstractC26911n
    /* renamed from: a */
    public void mo11460a(String str) {
        Iterator<T> it = this.f38525b.mo53731d().iterator();
        while (it.hasNext()) {
            it.next().mo11460a(str);
        }
        this.f38524a = Uri.parse(str);
    }

    public DefaultLynxViewClient(LynxKitInitParams cVar, IResourceLoaderService iResourceLoaderService, IServiceToken jVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "initParams");
        this.f38525b = cVar;
        this.f38526c = iResourceLoaderService;
        this.f38527d = jVar;
    }

    @Override // com.lynx.tasm.AbstractC26911n
    /* renamed from: a */
    public void mo53709a(String str, String str2, int i) {
        Iterator<T> it = this.f38525b.mo53731d().iterator();
        while (it.hasNext()) {
            it.next().mo53709a(str, str2, i);
        }
    }

    @Override // com.lynx.tasm.behavior.AbstractC26674h, com.lynx.tasm.AbstractC26911n
    /* renamed from: a */
    public void mo53708a(Context context, String str, String str2, float f, float f2, Transformer transformer, AbstractC26674h.AbstractC26675a aVar) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(aVar, "handler");
        Iterator<T> it = this.f38525b.mo53731d().iterator();
        while (it.hasNext()) {
            it.next().mo53708a(context, str, str2, f, f2, transformer, aVar);
        }
    }
}
