package com.ss.ugc.effectplatform.algorithm;

import android.content.Context;
import android.content.res.AssetManager;
import bytekn.foundation.io.file.FileInputStream;
import bytekn.foundation.io.file.FileManager;
import bytekn.foundation.logger.Logger;
import com.ss.ugc.effectplatform.util.ModelNameProcessor;
import java.io.InputStream;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.C69043h;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0005J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0004J\u000e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004J\u0016\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\u0004J\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\n\u001a\u00020\u0004H\u0002J\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000e\u001a\u00020\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/ss/ugc/effectplatform/algorithm/BuiltInResourceManager;", "", "appContext", "exclusionPattern", "", "(Ljava/lang/Object;Ljava/lang/String;)V", "getAppContext", "()Ljava/lang/Object;", "exists", "", "fileName", "getBuiltInPath", "list", "", "filePath", "open", "Lbytekn/foundation/io/file/FileInputStream;", "readFile", "effectplatform_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.ugc.effectplatform.algorithm.f */
public final class BuiltInResourceManager {

    /* renamed from: a */
    private final Object f164854a;

    /* renamed from: b */
    private final String f164855b;

    /* renamed from: a */
    public final Object mo227719a() {
        return this.f164854a;
    }

    /* renamed from: a */
    public final boolean mo227720a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "fileName");
        FileInputStream bVar = null;
        boolean z = false;
        try {
            FileInputStream d = m256717d(str);
            if (d != null) {
                z = true;
            }
            if (d != null) {
                FileManager.f5817a.mo8716a(d);
            }
            return z;
        } catch (Exception unused) {
            if (bVar != null) {
                FileManager.f5817a.mo8716a(bVar);
            }
            return false;
        } catch (Throwable th) {
            if (bVar != null) {
                FileManager.f5817a.mo8716a(bVar);
            }
            throw th;
        }
    }

    /* renamed from: d */
    private final FileInputStream m256717d(String str) {
        Object obj = this.f164854a;
        if (!(obj instanceof Context)) {
            return null;
        }
        if (obj != null) {
            Context applicationContext = ((Context) obj).getApplicationContext();
            Intrinsics.checkExpressionValueIsNotNull(applicationContext, "(appContext as Context).applicationContext");
            AssetManager assets = applicationContext.getAssets();
            String a = ModelNameProcessor.f165128a.mo228346a(str);
            String str2 = this.f164855b;
            if (str2 == null || !new Regex(str2).matches(a)) {
                FileInputStream bVar = new FileInputStream();
                InputStream open = assets.open(str, 2);
                Intrinsics.checkExpressionValueIsNotNull(open, "assetManager.open(fileNa…Manager.ACCESS_STREAMING)");
                bVar.mo8707a(open);
                return bVar;
            }
            throw new RuntimeException(str + " manually excluded by DownloadableModelSupport.exclusionPattern");
        }
        throw new TypeCastException("null cannot be cast to non-null type android.content.Context");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0058, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0059, code lost:
        kotlin.io.C69101b.m265907a(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005c, code lost:
        throw r3;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo227721b(java.lang.String r8) {
        /*
        // Method dump skipped, instructions count: 125
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ugc.effectplatform.algorithm.BuiltInResourceManager.mo227721b(java.lang.String):java.lang.String");
    }

    /* renamed from: c */
    public final List<String> mo227722c(String str) {
        Intrinsics.checkParameterIsNotNull(str, "filePath");
        Object obj = this.f164854a;
        if (!(obj instanceof Context)) {
            return null;
        }
        try {
            Context applicationContext = ((Context) obj).getApplicationContext();
            Intrinsics.checkExpressionValueIsNotNull(applicationContext, "appContext.applicationContext");
            String[] list = applicationContext.getAssets().list(str);
            if (list != null) {
                return C69043h.m265786k(list);
            }
            return null;
        } catch (Exception e) {
            Logger bVar = Logger.f5760a;
            bVar.mo8663a("effect_platform", "error in list file: " + str, e);
            return null;
        }
    }

    public BuiltInResourceManager(Object obj, String str) {
        this.f164854a = obj;
        this.f164855b = str;
    }
}
