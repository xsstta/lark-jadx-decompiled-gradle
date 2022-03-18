package com.ss.ugc.effectplatform;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.sequences.C69294l;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\"\u0010\u0000\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001*\u00020\u00032\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001¨\u0006\u0005"}, d2 = {"decryptList", "", "", "Lcom/ss/ugc/effectplatform/IEffectPlatformEncryptor;", "contents", "effect_model_release"}, mo238835k = 2, mv = {1, 1, 16})
/* renamed from: com.ss.ugc.effectplatform.c */
public final class C65500c {

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "it", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.ugc.effectplatform.c$a */
    public static final class C65501a extends Lambda implements Function1<String, String> {
        final /* synthetic */ IEffectPlatformEncryptor $this_decryptList;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C65501a(IEffectPlatformEncryptor eVar) {
            super(1);
            this.$this_decryptList = eVar;
        }

        public final String invoke(String str) {
            Intrinsics.checkParameterIsNotNull(str, "it");
            String a = this.$this_decryptList.mo207361a(str);
            if (a != null) {
                return a;
            }
            return "";
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.ugc.effectplatform.c$b */
    public static final class C65502b extends Lambda implements Function1<String, Boolean> {
        public static final C65502b INSTANCE = new C65502b();

        C65502b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Boolean invoke(String str) {
            return Boolean.valueOf(invoke(str));
        }

        public final boolean invoke(String str) {
            Intrinsics.checkParameterIsNotNull(str, "it");
            return !StringsKt.isBlank(str);
        }
    }

    /* renamed from: a */
    public static final List<String> m256757a(IEffectPlatformEncryptor eVar, List<String> list) {
        Intrinsics.checkParameterIsNotNull(eVar, "$this$decryptList");
        if (list != null) {
            return C69294l.m266144h(C69294l.m266131a(C69294l.m266140e(CollectionsKt.asSequence(list), new C65501a(eVar)), (Function1) C65502b.INSTANCE));
        }
        return null;
    }
}
