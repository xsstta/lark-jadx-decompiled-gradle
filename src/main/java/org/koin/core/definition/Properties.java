package org.koin.core.definition;

import com.google.firebase.messaging.Constants;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\u0010\u0005J\u0015\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0003HÂ\u0003J\u001f\u0010\u0007\u001a\u00020\u00002\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0003HÆ\u0001J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\u001c\u0010\u000b\u001a\u0002H\f\"\u0004\b\u0000\u0010\f2\u0006\u0010\r\u001a\u00020\u0004H\u0002¢\u0006\u0002\u0010\u000eJ\u001b\u0010\u000f\u001a\u0004\u0018\u0001H\f\"\u0004\b\u0000\u0010\f2\u0006\u0010\r\u001a\u00020\u0004¢\u0006\u0002\u0010\u000eJ\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J$\u0010\u0012\u001a\u00020\u0013\"\u0004\b\u0000\u0010\f2\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u0002H\fH\u0002¢\u0006\u0002\u0010\u0015J\t\u0010\u0016\u001a\u00020\u0004HÖ\u0001R\u001a\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lorg/koin/core/definition/Properties;", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "", "(Ljava/util/Map;)V", "component1", "copy", "equals", "", "other", "get", "T", "key", "(Ljava/lang/String;)Ljava/lang/Object;", "getOrNull", "hashCode", "", "set", "", "value", "(Ljava/lang/String;Ljava/lang/Object;)V", "toString", "koin-core"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: org.koin.core.definition.f */
public final class Properties {

    /* renamed from: a */
    private final Map<String, Object> f175043a;

    public Properties() {
        this(null, 1, null);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof Properties) && Intrinsics.areEqual(this.f175043a, ((Properties) obj).f175043a);
        }
        return true;
    }

    public int hashCode() {
        Map<String, Object> map = this.f175043a;
        if (map != null) {
            return map.hashCode();
        }
        return 0;
    }

    public String toString() {
        return "Properties(data=" + this.f175043a + ")";
    }

    public Properties(Map<String, Object> map) {
        Intrinsics.checkParameterIsNotNull(map, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        this.f175043a = map;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Properties(Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new ConcurrentHashMap() : map);
    }
}
