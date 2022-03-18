package com.ss.ugc.effectplatform.algorithm;

import bytekn.foundation.logger.Logger;
import com.ss.ugc.effectplatform.cache.AlgorithmModelCache;
import com.ss.ugc.effectplatform.listener.IModelDownloadEventListener;
import com.ss.ugc.effectplatform.model.Effect;
import com.ss.ugc.effectplatform.model.LoadedModelList;
import com.ss.ugc.effectplatform.model.LocalModelInfo;
import com.ss.ugc.effectplatform.model.algorithm.ExtendedUrlModel;
import com.ss.ugc.effectplatform.model.algorithm.ModelInfo;
import com.ss.ugc.effectplatform.task.ModelConfigArbiter;
import com.ss.ugc.effectplatform.util.ModelNameProcessor;
import com.ss.ugc.effectplatform.util.TextUtils;
import com.ss.ugc.effectplatform.util.UriUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\t\b\u0016\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\"\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\fH\u0002J\u0012\u0010\u0010\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\u0011\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\fH\u0014J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u0010\u0010\u0014\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0014J\u000e\u0010\u0015\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\fH\u0014J\u0018\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\fH\u0014J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\f2\u0006\u0010\u001c\u001a\u00020\fJ \u0010\u001d\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u001e\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lcom/ss/ugc/effectplatform/algorithm/AlgorithmResourceFinder;", "", "algorithmModelCache", "Lcom/ss/ugc/effectplatform/cache/AlgorithmModelCache;", "buildInAssetsManager", "Lcom/ss/ugc/effectplatform/algorithm/BuiltInResourceManager;", "eventListener", "Lcom/ss/ugc/effectplatform/listener/IModelDownloadEventListener;", "(Lcom/ss/ugc/effectplatform/cache/AlgorithmModelCache;Lcom/ss/ugc/effectplatform/algorithm/BuiltInResourceManager;Lcom/ss/ugc/effectplatform/listener/IModelDownloadEventListener;)V", "checkModelMd5", "", "nameStr", "", "businessId", "", "modelUri", "findResourceUri", "getBuiltInResourceUrl", "getEffectHandle", "", "isExactBuiltInResource", "isResourceAvailable", "onModelFound", "", "modelName", "onModelNotFound", "errorMessage", "readAssetFileAsString", "filePath", "realFindResourceUri", "dir", "Companion", "effectplatform_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.ugc.effectplatform.algorithm.d */
public class AlgorithmResourceFinder {
    public static final Companion Companion = new Companion(null);
    private final AlgorithmModelCache algorithmModelCache;
    private final BuiltInResourceManager buildInAssetsManager;
    private final IModelDownloadEventListener eventListener;

    public long getEffectHandle() {
        return 0;
    }

    /* access modifiers changed from: protected */
    public void onModelFound(String str) {
        Intrinsics.checkParameterIsNotNull(str, "modelName");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/ss/ugc/effectplatform/algorithm/AlgorithmResourceFinder$Companion;", "", "()V", "MD5_ERROR", "", "NOT_FOUND", "RESOURCE_MANAGER_NOT_INITIALIZED", "TAG", "effectplatform_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.ugc.effectplatform.algorithm.d$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final String readAssetFileAsString(String str) {
        Intrinsics.checkParameterIsNotNull(str, "filePath");
        return this.buildInAssetsManager.mo227721b(str);
    }

    /* access modifiers changed from: protected */
    public String getBuiltInResourceUrl(String str) {
        Intrinsics.checkParameterIsNotNull(str, "nameStr");
        return "asset://model/" + str;
    }

    /* access modifiers changed from: protected */
    public boolean isExactBuiltInResource(String str) {
        Intrinsics.checkParameterIsNotNull(str, "nameStr");
        BuiltInResourceManager fVar = this.buildInAssetsManager;
        return fVar.mo227720a("model/" + str);
    }

    public final boolean isResourceAvailable(String str) {
        Intrinsics.checkParameterIsNotNull(str, "nameStr");
        String findResourceUri = findResourceUri(str);
        if (findResourceUri == null || !(!Intrinsics.areEqual(findResourceUri, "asset://md5_error")) || !(!Intrinsics.areEqual(findResourceUri, "asset://not_found"))) {
            return false;
        }
        return true;
    }

    public String findResourceUri(String str) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(str, "nameStr");
        String str2 = null;
        String str3 = null;
        LocalModelInfo a = this.algorithmModelCache.mo227637a(ModelNameProcessor.f165128a.mo228346a(str));
        if (a != null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            UriUtil vVar = UriUtil.f165136a;
            StringBuilder sb = new StringBuilder();
            sb.append("file://");
            if (a != null) {
                str2 = a.mo227933f();
            }
            sb.append(str2);
            return vVar.mo228359a(sb.toString());
        } else if (isExactBuiltInResource(str)) {
            return getBuiltInResourceUrl(str);
        } else {
            return str3;
        }
    }

    /* access modifiers changed from: protected */
    public void onModelNotFound(String str, String str2) {
        Intrinsics.checkParameterIsNotNull(str, "modelName");
        Intrinsics.checkParameterIsNotNull(str2, "errorMessage");
        RuntimeException runtimeException = new RuntimeException("model not found neither in asset nor disk " + str2);
        IModelDownloadEventListener eVar = this.eventListener;
        if (eVar != null) {
            eVar.mo227761a((Effect) null, runtimeException);
        }
    }

    public AlgorithmResourceFinder(AlgorithmModelCache aVar, BuiltInResourceManager fVar, IModelDownloadEventListener eVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "algorithmModelCache");
        Intrinsics.checkParameterIsNotNull(fVar, "buildInAssetsManager");
        this.algorithmModelCache = aVar;
        this.buildInAssetsManager = fVar;
        this.eventListener = eVar;
    }

    private final boolean checkModelMd5(String str, int i, String str2) {
        if (str2 != null && !isExactBuiltInResource(str)) {
            String a = ModelNameProcessor.f165128a.mo228346a(str);
            String d = ModelNameProcessor.f165128a.mo228350d(str2);
            ExtendedUrlModel extendedUrlModel = null;
            LoadedModelList b = ModelConfigArbiter.m257007b(ModelConfigArbiter.f165064g.mo228283b(), i, false, 2, null);
            if (b != null) {
                try {
                    extendedUrlModel = b.mo227915a(a);
                } catch (IllegalArgumentException e) {
                    Logger.f5760a.mo8663a("AlgorithmResourceFinder", "model info not found in model list", e);
                    ModelInfo a2 = ModelConfigArbiter.m257005a(ModelConfigArbiter.f165064g.mo228283b(), i, a, false, 4, null);
                    if (a2 != null) {
                        extendedUrlModel = a2.getFile_url();
                    }
                }
            }
            if (extendedUrlModel == null) {
                Logger.m7508a(Logger.f5760a, "AlgorithmResourceFinder", "expected model info not found in model list", null, 4, null);
                return false;
            }
            String uri = extendedUrlModel.getUri();
            if (!TextUtils.f165135a.mo228358a(d, uri)) {
                String str3 = str + " md5 = " + d + " expectedMd5 = " + uri;
                Logger.f5760a.mo8662a("AlgorithmResourceFinder", "findResourceUri called with nameStr = [" + str + "], asset://md5_error\n" + str3);
                onModelNotFound(a, str3);
                return true;
            }
        }
        return false;
    }

    public final String realFindResourceUri(int i, String str, String str2) {
        Intrinsics.checkParameterIsNotNull(str2, "nameStr");
        Logger bVar = Logger.f5760a;
        bVar.mo8662a("AlgorithmResourceFinder", "findResourceUri() called with nameStr = [" + str2 + ']');
        String findResourceUri = findResourceUri(str2);
        try {
            if (checkModelMd5(str2, i, findResourceUri)) {
                return "asset://md5_error";
            }
        } catch (RuntimeException e) {
            Logger bVar2 = Logger.f5760a;
            bVar2.mo8663a("AlgorithmResourceFinder", "findResourceUri called with nameStr = [" + str2 + "], exception hanppens", e);
        }
        if (findResourceUri == null) {
            Logger bVar3 = Logger.f5760a;
            Logger.m7508a(bVar3, "AlgorithmResourceFinder", "findResourceUri called with nameStr = [" + str2 + "], returned result: [asset://not_found]", null, 4, null);
            return "asset://not_found";
        }
        Logger bVar4 = Logger.f5760a;
        bVar4.mo8662a("AlgorithmResourceFinder", "findResourceUri called with nameStr = [" + str2 + "], returned result: [" + findResourceUri + ']');
        onModelFound(str2);
        return findResourceUri;
    }
}
