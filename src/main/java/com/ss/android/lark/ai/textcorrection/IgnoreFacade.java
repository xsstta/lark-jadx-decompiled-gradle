package com.ss.android.lark.ai.textcorrection;

import com.ss.android.lark.log.Log;
import com.ss.android.lark.pb.ai.AITextCorrectionMatch;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/ai/textcorrection/IgnoreFacade;", "", "()V", "storage", "Lcom/ss/android/lark/ai/textcorrection/SetStorage;", "generateId", "", "match", "Lcom/ss/android/lark/pb/ai/AITextCorrectionMatch;", "ignoreMatch", "", "isMatchIgnored", "Companion", "im_ai-modules_ai_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.ai.e.e */
public final class IgnoreFacade {

    /* renamed from: a */
    public static final Companion f71711a = new Companion(null);

    /* renamed from: b */
    private final SetStorage f71712b = new SetStorage("ai.correction.ignore");

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/ai/textcorrection/IgnoreFacade$Companion;", "", "()V", "STORAGE_KEY", "", "TAG", "im_ai-modules_ai_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.ai.e.e$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public final boolean mo101620a(AITextCorrectionMatch aITextCorrectionMatch) {
        Intrinsics.checkParameterIsNotNull(aITextCorrectionMatch, "match");
        if (this.f71712b.mo101640b(m104649c(aITextCorrectionMatch))) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    private final String m104649c(AITextCorrectionMatch aITextCorrectionMatch) {
        return aITextCorrectionMatch.msource_text + '#' + aITextCorrectionMatch.mtarget_text + '#' + aITextCorrectionMatch.mrule.mid;
    }

    /* renamed from: b */
    public final boolean mo101621b(AITextCorrectionMatch aITextCorrectionMatch) {
        Intrinsics.checkParameterIsNotNull(aITextCorrectionMatch, "match");
        Log.m165379d("IgnoreFacade", "ignore " + aITextCorrectionMatch);
        if (mo101620a(aITextCorrectionMatch)) {
            return false;
        }
        this.f71712b.mo101639a(m104649c(aITextCorrectionMatch));
        return true;
    }
}
