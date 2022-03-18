package bytekn.foundation.utils;

import java.util.List;
import java.util.Map;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0010$\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0010\u0010\u0006\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0004J\u0018\u0010\u0007\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\u0001J!\u0010\t\u001a\u00020\n\"\u0004\b\u0000\u0010\u000b2\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u0002H\u000b\u0018\u00010\r¢\u0006\u0002\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\n2\b\u0010\b\u001a\u0004\u0018\u00010\u0001J\u001c\u0010\u0010\u001a\u00020\n\"\u0004\b\u0000\u0010\u000b2\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u0002H\u000b\u0018\u00010\u0004J\u0018\u0010\u0011\u001a\u00020\n2\u0010\u0010\u0012\u001a\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\u0013¨\u0006\u0014"}, d2 = {"Lbytekn/foundation/utils/CollectionUtil;", "", "()V", "convertListObjToStr", "", "", "list", "convertObjectToList", "obj", "isArrayEmpty", "", "T", "array", "", "([Ljava/lang/Object;)Z", "isCollection", "isListEmpty", "isMapEmpty", "map", "", "kn_common_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: bytekn.foundation.e.a */
public final class CollectionUtil {

    /* renamed from: a */
    public static final CollectionUtil f5763a = new CollectionUtil();

    private CollectionUtil() {
    }

    /* renamed from: a */
    public final <T> boolean mo8668a(List<? extends T> list) {
        if (list == null || list.isEmpty()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final boolean mo8669a(Map<?, ?> map) {
        if (map == null || map.isEmpty()) {
            return true;
        }
        return false;
    }
}
