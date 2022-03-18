package com.ss.ugc.effectplatform.bridge;

import com.ss.ugc.effectplatform.model.Effect;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0006HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0006HÖ\u0001R\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lcom/ss/ugc/effectplatform/bridge/EffectFetcherArguments;", "", "effect", "Lcom/ss/ugc/effectplatform/model/Effect;", "downloadUrl", "", "", "effectDir", "(Lcom/ss/ugc/effectplatform/model/Effect;Ljava/util/List;Ljava/lang/String;)V", "getDownloadUrl", "()Ljava/util/List;", "getEffect", "()Lcom/ss/ugc/effectplatform/model/Effect;", "getEffectDir", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "effectplatform_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.ugc.effectplatform.bridge.b */
public final class EffectFetcherArguments {

    /* renamed from: a */
    private final Effect f164864a;

    /* renamed from: b */
    private final List<String> f164865b;

    /* renamed from: c */
    private final String f164866c;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EffectFetcherArguments)) {
            return false;
        }
        EffectFetcherArguments bVar = (EffectFetcherArguments) obj;
        return Intrinsics.areEqual(this.f164864a, bVar.f164864a) && Intrinsics.areEqual(this.f164865b, bVar.f164865b) && Intrinsics.areEqual(this.f164866c, bVar.f164866c);
    }

    public int hashCode() {
        Effect effect = this.f164864a;
        int i = 0;
        int hashCode = (effect != null ? effect.hashCode() : 0) * 31;
        List<String> list = this.f164865b;
        int hashCode2 = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        String str = this.f164866c;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        return "EffectFetcherArguments(effect=" + this.f164864a + ", downloadUrl=" + this.f164865b + ", effectDir=" + this.f164866c + ")";
    }

    /* renamed from: a */
    public final Effect mo227733a() {
        return this.f164864a;
    }

    /* renamed from: b */
    public final List<String> mo227734b() {
        return this.f164865b;
    }

    /* renamed from: c */
    public final String mo227735c() {
        return this.f164866c;
    }

    public EffectFetcherArguments(Effect effect, List<String> list, String str) {
        Intrinsics.checkParameterIsNotNull(effect, "effect");
        this.f164864a = effect;
        this.f164865b = list;
        this.f164866c = str;
    }
}
