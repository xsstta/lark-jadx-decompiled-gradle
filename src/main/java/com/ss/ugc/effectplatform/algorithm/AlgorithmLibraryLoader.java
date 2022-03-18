package com.ss.ugc.effectplatform.algorithm;

import com.ss.ugc.effectplatform.algorithm.ILibraryLoader;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u000f\u001a\u00020\u0010R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcom/ss/ugc/effectplatform/algorithm/AlgorithmLibraryLoader;", "", "()V", "hasLoadedLibrary", "", "getHasLoadedLibrary", "()Z", "setHasLoadedLibrary", "(Z)V", "libraryLoader", "Lcom/ss/ugc/effectplatform/algorithm/ILibraryLoader;", "getLibraryLoader", "()Lcom/ss/ugc/effectplatform/algorithm/ILibraryLoader;", "setLibraryLoader", "(Lcom/ss/ugc/effectplatform/algorithm/ILibraryLoader;)V", "loadLibrary", "", "effectplatform_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.ugc.effectplatform.algorithm.b */
public final class AlgorithmLibraryLoader {

    /* renamed from: a */
    public static final AlgorithmLibraryLoader f164838a = new AlgorithmLibraryLoader();

    /* renamed from: b */
    private static ILibraryLoader f164839b = ILibraryLoader.SoLibraryLoader.f164856a;

    /* renamed from: c */
    private static boolean f164840c;

    private AlgorithmLibraryLoader() {
    }

    /* renamed from: a */
    public final synchronized void mo227704a() {
        if (!f164840c) {
            f164839b.mo227723a("algorithmmanager");
            f164840c = true;
        }
    }
}
