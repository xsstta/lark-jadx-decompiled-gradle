package bytekn.foundation.utils;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.sequences.C69294l;
import kotlin.sequences.Sequence;
import kotlin.text.MatchResult;
import kotlin.text.Regex;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lbytekn/foundation/utils/StringExtension;", "", "()V", "Companion", "kn_common_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: bytekn.foundation.e.f */
public final class StringExtension {

    /* renamed from: a */
    public static final Companion f5768a = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\t\u001a\u00020\u0004J\u001a\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lbytekn/foundation/utils/StringExtension$Companion;", "", "()V", "NOT_FOUND", "", "lastIndexOfRegex", "str", "", "toFind", "fromIndex", "kn_common_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: bytekn.foundation.e.f$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final int mo8677a(String str, String str2) {
            if (str == null || str2 == null) {
                return -1;
            }
            Sequence findAll$default = Regex.findAll$default(new Regex(str2), str, 0, 2, null);
            if (!findAll$default.mo4717a().hasNext()) {
                return -1;
            }
            return ((MatchResult) C69294l.m266139e(findAll$default)).mo242580a().mo239399a();
        }
    }
}
