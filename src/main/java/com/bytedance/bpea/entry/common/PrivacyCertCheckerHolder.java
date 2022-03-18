package com.bytedance.bpea.entry.common;

import android.util.Log;
import com.bytedance.bpea.basics.BPEAException;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.bpea.basics.PrivacyCertChecker;
import com.bytedance.bpea.basics.PrivacyCertContext;
import java.lang.reflect.Field;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\nR\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/bytedance/bpea/entry/common/PrivacyCertCheckerHolder;", "", "()V", "privacyCertChecker", "Lcom/bytedance/bpea/basics/PrivacyCertChecker;", "check", "", "privacyCert", "Lcom/bytedance/bpea/basics/PrivacyCert;", "privacyCertContext", "Lcom/bytedance/bpea/basics/PrivacyCertContext;", "common-entry_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.bytedance.bpea.a.b.b */
public final class PrivacyCertCheckerHolder {

    /* renamed from: a */
    public static final PrivacyCertCheckerHolder f11330a = new PrivacyCertCheckerHolder();

    /* renamed from: b */
    private static PrivacyCertChecker f11331b;

    private PrivacyCertCheckerHolder() {
    }

    static {
        try {
            Class<?> cls = Class.forName("com.bytedance.bpea.core.checker.PrivacyCertCheckerProvider");
            Field declaredField = cls.getDeclaredField("INSTANCE");
            Intrinsics.checkExpressionValueIsNotNull(declaredField, "getInstance");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(null);
            Field declaredField2 = cls.getDeclaredField("CHECKER");
            Intrinsics.checkExpressionValueIsNotNull(declaredField2, "getChecker");
            declaredField2.setAccessible(true);
            Object obj2 = declaredField2.get(obj);
            if (obj2 != null) {
                f11331b = (PrivacyCertChecker) obj2;
                if (f11331b != null) {
                    Log.d("CheckerHolder", "checker working");
                } else {
                    Log.d("CheckerHolder", "checker not work");
                }
            } else {
                throw new TypeCastException("null cannot be cast to non-null type com.bytedance.bpea.basics.PrivacyCertChecker");
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public final void mo14448a(PrivacyCert privacyCert, PrivacyCertContext bVar) throws BPEAException {
        PrivacyCertChecker aVar = f11331b;
        if (aVar != null) {
            aVar.mo14488a(privacyCert, bVar);
        }
    }
}
