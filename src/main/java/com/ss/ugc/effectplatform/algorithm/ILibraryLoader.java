package com.ss.ugc.effectplatform.algorithm;

import com.C1711a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0006J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0007"}, d2 = {"Lcom/ss/ugc/effectplatform/algorithm/ILibraryLoader;", "", "loadLibrary", "", "soName", "", "SoLibraryLoader", "effectplatform_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.ugc.effectplatform.algorithm.g */
public interface ILibraryLoader {
    /* renamed from: a */
    void mo227723a(String str);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lcom/ss/ugc/effectplatform/algorithm/ILibraryLoader$SoLibraryLoader;", "Lcom/ss/ugc/effectplatform/algorithm/ILibraryLoader;", "()V", "loadLibrary", "", "soName", "", "effectplatform_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.ugc.effectplatform.algorithm.g$a */
    public static final class SoLibraryLoader implements ILibraryLoader {

        /* renamed from: a */
        public static final SoLibraryLoader f164856a = new SoLibraryLoader();

        private SoLibraryLoader() {
        }

        @Override // com.ss.ugc.effectplatform.algorithm.ILibraryLoader
        /* renamed from: a */
        public void mo227723a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "soName");
            C1711a.m7628a(str);
        }
    }
}
