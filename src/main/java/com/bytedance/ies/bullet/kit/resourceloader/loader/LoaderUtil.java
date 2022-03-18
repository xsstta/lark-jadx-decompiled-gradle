package com.bytedance.ies.bullet.kit.resourceloader.loader;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.ies.bullet.service.base.resourceloader.config.GeckoConfig;
import com.bytedance.ies.bullet.service.base.resourceloader.config.ResourceLoaderConfig;
import java.io.File;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0004J\u001a\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\f\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000f\u001a\u00020\u000bJ9\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u000e2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00110\u00142\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00110\u0014H\bJ9\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u001a2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00110\u00142\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00110\u0014H\bJ\u0012\u0010\u001b\u001a\u00020\u001c*\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0004J\n\u0010\u001f\u001a\u00020\u0004*\u00020 J\f\u0010!\u001a\u00020\u000b*\u0004\u0018\u00010\u0004R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lcom/bytedance/ies/bullet/kit/resourceloader/loader/LoaderUtil;", "", "()V", "AUTHORITY_ABSOLUTE", "", "SCHEMA_HTTP", "SCHEMA_HTTPS", "buildRawUri", "channel", "bundle", "checkFileExists", "", "path", "createFile", "Ljava/io/File;", "isFile", "readFile", "", "file", "resolve", "Lkotlin/Function1;", "", "reject", "", "readStream", "inputStream", "Ljava/io/InputStream;", "getGeckoConfig", "Lcom/bytedance/ies/bullet/service/base/resourceloader/config/GeckoConfig;", "Lcom/bytedance/ies/bullet/service/base/resourceloader/config/ResourceLoaderConfig;", "ak", "getUriWithoutQuery", "Landroid/net/Uri;", "isNotNullOrEmpty", "x-resourceloader_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.bytedance.ies.bullet.a.a.a.d */
public final class LoaderUtil {

    /* renamed from: a */
    public static final LoaderUtil f37766a = new LoaderUtil();

    private LoaderUtil() {
    }

    /* renamed from: b */
    public final boolean mo52547b(String str) {
        if (str == null || str.length() <= 0) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final String mo52544a(Uri uri) {
        Intrinsics.checkParameterIsNotNull(uri, "$this$getUriWithoutQuery");
        return uri.getScheme() + "://" + uri.getAuthority() + '/' + uri.getHost() + '/' + uri.getPath();
    }

    /* renamed from: a */
    public final boolean mo52546a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "path");
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return new File(str).exists();
    }

    /* renamed from: a */
    public final GeckoConfig mo52542a(ResourceLoaderConfig iVar, String str) {
        Intrinsics.checkParameterIsNotNull(iVar, "$this$getGeckoConfig");
        Intrinsics.checkParameterIsNotNull(str, "ak");
        GeckoConfig cVar = iVar.mo52743h().get(str);
        if (cVar != null) {
            return cVar;
        }
        return iVar.mo52742g();
    }

    /* renamed from: a */
    public final File mo52543a(String str, boolean z) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str == null) {
            str = "";
        }
        File file = new File(str);
        if (!file.exists()) {
            if (!z) {
                file.mkdirs();
            } else {
                try {
                    File parentFile = file.getParentFile();
                    if (parentFile != null && !parentFile.exists()) {
                        parentFile.mkdirs();
                    }
                    file.createNewFile();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return file;
    }

    /* renamed from: a */
    public final String mo52545a(String str, String str2) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(str, "channel");
        Intrinsics.checkParameterIsNotNull(str2, "bundle");
        if (str2.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return str;
        }
        return str + '/' + StringsKt.removePrefix(str2, (CharSequence) "/");
    }
}
