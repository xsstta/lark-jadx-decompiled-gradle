package com.bytedance.kit.nglynx.compatible;

import android.net.Uri;
import com.bytedance.ies.bullet.service.base.IResourceLoaderService;
import com.bytedance.ies.bullet.service.base.ResourceInfo;
import com.bytedance.ies.bullet.service.base.api.IServiceToken;
import com.bytedance.ies.bullet.service.base.resourceloader.config.CustomLoaderConfig;
import com.bytedance.ies.bullet.service.base.resourceloader.config.LoaderType;
import com.bytedance.ies.bullet.service.base.resourceloader.config.TaskConfig;
import java.io.File;
import java.io.FileInputStream;
import java.util.Iterator;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J-\u0010\r\u001a\u0004\u0018\u00010\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0001¢\u0006\u0002\b\u0014J\u001a\u0010\u0015\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000b\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0004H\u0002J\u001e\u0010\u0018\u001a\u00020\u00042\b\b\u0002\u0010\u0019\u001a\u00020\u00042\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0011H\u0002J@\u0010\u001b\u001a\u0004\u0018\u00010\u00042\b\u0010\u001c\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u00042\b\u0010\u001f\u001a\u0004\u0018\u00010\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0002J\u001a\u0010 \u001a\u00020\u00042\u0006\u0010!\u001a\u00020\u00042\b\u0010\u001f\u001a\u0004\u0018\u00010\u0004H\u0002J\u0018\u0010\"\u001a\u00020#*\u00020#2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0011H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000¨\u0006$"}, d2 = {"Lcom/bytedance/kit/nglynx/compatible/CompatibleUtil;", "", "()V", "CONFIG_FILE_NAME", "", "KEY_ACCESS_KEY", "KEY_CARD_ID", "KEY_GECKO_FORMAT", "KEY_GROUP_ID", "RES_CHANNEL_SUFFIX", "SCHEMA_FILE", "config", "Lcom/bytedance/kit/nglynx/compatible/GroupConfig;", "bdlynxCompatible", "resourceLoader", "Lcom/bytedance/ies/bullet/service/base/IResourceLoaderService;", "uri", "Landroid/net/Uri;", "context", "Lcom/bytedance/ies/bullet/service/base/api/IServiceToken;", "bdlynxCompatible$x_lynx_kit_release", "cutOffHttpPrefixByConfig", "Lcom/bytedance/kit/nglynx/compatible/CardConfig;", "url", "makeRelativeUri", "path", "sourceUri", "redirectImgUrl", "resLoader", "cardConfig", "resGroup", "resFormat", "replaceResSuffixByFormat", "resPath", "appendExtraPart", "Landroid/net/Uri$Builder;", "x-lynx-kit_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.bytedance.kit.nglynx.a.b */
public final class CompatibleUtil {

    /* renamed from: a */
    public static final CompatibleUtil f38535a = new CompatibleUtil();

    /* renamed from: b */
    private static GroupConfig f38536b;

    private CompatibleUtil() {
    }

    /* renamed from: a */
    private final Uri.Builder m58916a(Uri.Builder builder, Uri uri) {
        if (uri != null) {
            builder.encodedQuery(uri.getEncodedQuery());
        }
        return builder;
    }

    /* renamed from: a */
    private final String m58920a(String str, Uri uri) {
        Uri.Builder path = new Uri.Builder().scheme("local_file").authority("relative").path(str);
        Intrinsics.checkExpressionValueIsNotNull(path, "Uri.Builder()\n        .s…ty(\"relative\").path(path)");
        String uri2 = m58916a(path, uri).build().toString();
        Intrinsics.checkExpressionValueIsNotNull(uri2, "Uri.Builder()\n        .s…ceUri).build().toString()");
        return uri2;
    }

    /* renamed from: a */
    private final String m58918a(CardConfig aVar, String str) {
        T t;
        List<String> a = aVar.mo53711a();
        if (a != null) {
            Iterator<T> it = a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    t = null;
                    break;
                }
                t = it.next();
                if (StringsKt.startsWith$default(str, (String) t, false, 2, (Object) null)) {
                    break;
                }
            }
            T t2 = t;
            if (t2 != null) {
                int length = t2.length();
                if (str != null) {
                    String substring = str.substring(length);
                    Intrinsics.checkExpressionValueIsNotNull(substring, "(this as java.lang.String).substring(startIndex)");
                    return StringsKt.substringBefore$default(substring, '?', (String) null, 2, (Object) null);
                }
                throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
            }
        }
        return null;
    }

    /* renamed from: a */
    private final String m58921a(String str, String str2) {
        boolean z;
        String str3 = str2;
        if (str3 == null || str3.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return str;
        }
        return StringsKt.replaceAfterLast$default(str, '.', str2, (String) null, 4, (Object) null);
    }

    @Deprecated(message = "compatible code for only BDLynx, url like:  https://xxxxx?groupId=xxx&cardId=xxxx")
    /* renamed from: a */
    public final String mo53712a(IResourceLoaderService iResourceLoaderService, Uri uri, IServiceToken jVar) {
        Uri uri2;
        String queryParameter;
        ResourceInfo mVar;
        GroupConfig a;
        CardConfig aVar;
        if (uri != null) {
            if (uri.isHierarchical()) {
                uri2 = uri;
            } else {
                uri2 = null;
            }
            if (!(uri2 == null || (queryParameter = uri2.getQueryParameter("groupId")) == null)) {
                if (iResourceLoaderService != null) {
                    CompatibleUtil bVar = f38535a;
                    Intrinsics.checkExpressionValueIsNotNull(queryParameter, "groupId");
                    String a2 = m58919a(bVar, queryParameter, null, 2, null);
                    TaskConfig jVar2 = new TaskConfig(null, 1, null);
                    jVar2.mo52752a(queryParameter);
                    jVar2.mo52750a(jVar);
                    String queryParameter2 = uri.getQueryParameter("accessKey");
                    if (queryParameter2 != null) {
                        Intrinsics.checkExpressionValueIsNotNull(queryParameter2, "it");
                        jVar2.mo52758d(queryParameter2);
                    }
                    CustomLoaderConfig aVar2 = new CustomLoaderConfig(true);
                    aVar2.mo52720a(CollectionsKt.mutableListOf(LoaderType.GECKO, LoaderType.BUILTIN));
                    jVar2.mo52751a(aVar2);
                    mVar = iResourceLoaderService.loadSync(a2, jVar2);
                } else {
                    mVar = null;
                }
                if (mVar != null) {
                    File file = new File(mVar.mo52705c() + File.separator + "config.json");
                    if (!file.exists()) {
                        file = null;
                    }
                    if (!(file == null || (a = C14562d.m58924a(new FileInputStream(file))) == null)) {
                        f38536b = a;
                        String queryParameter3 = uri.getQueryParameter("cardId");
                        if (!(queryParameter3 == null || (aVar = a.mo53713a().get(queryParameter3)) == null)) {
                            CompatibleUtil bVar2 = f38535a;
                            String uri3 = uri.toString();
                            Intrinsics.checkExpressionValueIsNotNull(uri3, "uri.toString()");
                            String a3 = bVar2.m58917a(iResourceLoaderService, aVar, uri3, queryParameter + "_resource", uri.getQueryParameter("gecko_format"), jVar);
                            if (a3 != null) {
                                return new Uri.Builder().scheme("file").path(a3).build().toString();
                            }
                        }
                    }
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    static /* synthetic */ String m58919a(CompatibleUtil bVar, String str, Uri uri, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        if ((i & 2) != 0) {
            uri = null;
        }
        return bVar.m58920a(str, uri);
    }

    /* renamed from: a */
    private final String m58917a(IResourceLoaderService iResourceLoaderService, CardConfig aVar, String str, String str2, String str3, IServiceToken jVar) {
        String a = m58918a(aVar, str);
        if (a == null) {
            return null;
        }
        CompatibleUtil bVar = f38535a;
        String a2 = bVar.m58921a(a, str3);
        if (iResourceLoaderService == null) {
            return null;
        }
        String a3 = m58919a(bVar, str, null, 2, null);
        TaskConfig jVar2 = new TaskConfig(null, 1, null);
        jVar2.mo52750a(jVar);
        CustomLoaderConfig aVar2 = new CustomLoaderConfig(true);
        aVar2.mo52720a(CollectionsKt.mutableListOf(LoaderType.GECKO, LoaderType.BUILTIN));
        jVar2.mo52751a(aVar2);
        ResourceInfo loadSync = iResourceLoaderService.loadSync(a3, jVar2);
        if (loadSync == null) {
            return null;
        }
        File file = new File(loadSync + File.separator + a2);
        if (!file.exists()) {
            file = null;
        }
        if (file != null) {
            return file.getAbsolutePath();
        }
        return null;
    }
}
