package com.tt.refer.common.config;

import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.huawei.hms.framework.common.ContainerUtils;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.socialbase.downloader.downloader.AbstractC60044a;
import com.ss.android.vesdk.p3188b.C63954b;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0004\n\u0002\b\u0007\b\u0016\u0018\u0000 &*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001&B\u0005¢\u0006\u0002\u0010\u0003J\u0017\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00018\u0000H\u0002¢\u0006\u0002\u0010\u001cJ)\u0010\u001d\u001a\u00020\u001e\"\b\b\u0001\u0010\u001f*\u00020 2\u0006\u0010!\u001a\u0002H\u001f2\b\u0010\"\u001a\u0004\u0018\u0001H\u001fH\u0002¢\u0006\u0002\u0010#J\u0006\u0010$\u001a\u00020\u001aJ\b\u0010%\u001a\u00020\u000bH\u0016R\u001e\u0010\u0004\u001a\u0004\u0018\u00018\u0000X\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\u00020\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR\u001a\u0010\u0013\u001a\u00020\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\r\"\u0004\b\u0015\u0010\u000fR\u001e\u0010\u0016\u001a\u0004\u0018\u00018\u0000X\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0017\u0010\u0006\"\u0004\b\u0018\u0010\b¨\u0006'"}, d2 = {"Lcom/tt/refer/common/config/Config;", "T", "", "()V", "dest", "getDest", "()Ljava/lang/Object;", "setDest", "(Ljava/lang/Object;)V", "Ljava/lang/Object;", "name", "", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "operation", "getOperation", "setOperation", ShareHitPoint.f121869d, "getType", "setType", "value", "getValue", "setValue", "analyzingConditions", "", "ext", "(Ljava/lang/Object;)Z", "compare", "", "F", "", AbstractC60044a.f149675a, C63954b.f161494a, "(Ljava/lang/Number;Ljava/lang/Number;)I", "isOk", "toString", "Companion", "miniapp_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.tt.refer.common.b.b */
public class Config<T> {

    /* renamed from: a */
    public static final Companion f170586a = new Companion(null);

    /* renamed from: b */
    private String f170587b = "";

    /* renamed from: c */
    private String f170588c = "";

    /* renamed from: d */
    private T f170589d;

    /* renamed from: e */
    private T f170590e;

    /* renamed from: f */
    private String f170591f = "";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/tt/refer/common/config/Config$Companion;", "", "()V", "TAG", "", "miniapp_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.tt.refer.common.b.b$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public final String mo235117a() {
        return this.f170587b;
    }

    /* renamed from: b */
    public final T mo235120b() {
        return this.f170589d;
    }

    /* renamed from: c */
    public final boolean mo235123c() {
        boolean c = m263588c(this.f170590e);
        AppBrandLogger.m52829e("StrategyConfig", "run action type = " + this.f170587b + ", value = " + ((Object) this.f170589d) + " , action = " + this.f170588c + " , dest = " + ((Object) this.f170590e) + ", result = " + c);
        this.f170590e = null;
        return c;
    }

    public String toString() {
        return "Config(type='" + this.f170587b + "', operation='" + this.f170588c + "', value=" + ((Object) this.f170589d) + ", dest=" + ((Object) this.f170590e) + ", name='" + this.f170591f + "')";
    }

    /* renamed from: a */
    public final void mo235118a(T t) {
        this.f170589d = t;
    }

    /* renamed from: b */
    public final void mo235121b(T t) {
        this.f170590e = t;
    }

    /* renamed from: a */
    public final void mo235119a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f170587b = str;
    }

    /* renamed from: b */
    public final void mo235122b(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f170588c = str;
    }

    /* renamed from: c */
    private final boolean m263588c(T t) {
        AppBrandLogger.m52830i("StrategyConfig", "action = " + this.f170588c);
        String str = this.f170588c;
        int hashCode = str.hashCode();
        if (hashCode != 1921) {
            if (hashCode != 1983) {
                switch (hashCode) {
                    case 60:
                        if (str.equals("<")) {
                            AppBrandLogger.m52830i("StrategyConfig", "run <");
                            if (t instanceof Number) {
                                T t2 = t;
                                T t3 = this.f170589d;
                                if (t3 == null) {
                                    throw new TypeCastException("null cannot be cast to non-null type kotlin.Number");
                                } else if (m263587a(t2, t3) < 0) {
                                    return true;
                                }
                            }
                            return false;
                        }
                        break;
                    case 61:
                        if (str.equals(ContainerUtils.KEY_VALUE_DELIMITER)) {
                            AppBrandLogger.m52830i("StrategyConfig", "run =");
                            if ((t instanceof Number) || (t instanceof String)) {
                                return Intrinsics.areEqual((Object) this.f170589d, (Object) t);
                            }
                            if (t instanceof Boolean) {
                                return Intrinsics.areEqual((Object) this.f170589d, (Object) t);
                            }
                            return false;
                        }
                        break;
                    case 62:
                        if (str.equals(">")) {
                            AppBrandLogger.m52830i("StrategyConfig", "run  > ");
                            if (t instanceof Number) {
                                T t4 = t;
                                T t5 = this.f170589d;
                                if (t5 == null) {
                                    throw new TypeCastException("null cannot be cast to non-null type kotlin.Number");
                                } else if (m263587a(t4, t5) > 0) {
                                    return true;
                                }
                            }
                            return false;
                        }
                        break;
                }
            } else if (str.equals(">=")) {
                AppBrandLogger.m52830i("StrategyConfig", "run  >= ");
                if (t instanceof Number) {
                    T t6 = t;
                    T t7 = this.f170589d;
                    if (t7 == null) {
                        throw new TypeCastException("null cannot be cast to non-null type kotlin.Number");
                    } else if (m263587a(t6, t7) >= 0) {
                        return true;
                    }
                }
                return false;
            }
        } else if (str.equals("<=")) {
            AppBrandLogger.m52830i("StrategyConfig", "run <=");
            if (t instanceof Number) {
                T t8 = t;
                T t9 = this.f170589d;
                if (t9 == null) {
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.Number");
                } else if (m263587a(t8, t9) <= 0) {
                    return true;
                }
            }
            return false;
        }
        AppBrandLogger.m52830i("StrategyConfig", "run else");
        return false;
    }

    /* renamed from: a */
    private final <F extends Number> int m263587a(F f, F f2) {
        if (f == null || f2 == null) {
            return 0;
        }
        if (f instanceof Double) {
            AppBrandLogger.m52830i("StrategyConfig", "run double");
            return Double.compare(f.doubleValue(), f2.doubleValue());
        } else if (f instanceof Float) {
            AppBrandLogger.m52830i("StrategyConfig", "run float");
            return Float.compare(f.floatValue(), f2.floatValue());
        } else if (f instanceof Long) {
            AppBrandLogger.m52830i("StrategyConfig", "run long");
            return (f.longValue() > f2.longValue() ? 1 : (f.longValue() == f2.longValue() ? 0 : -1));
        } else if (f instanceof Integer) {
            AppBrandLogger.m52830i("StrategyConfig", "run int");
            return Intrinsics.compare(f.intValue(), f2.intValue());
        } else if (f instanceof Short) {
            AppBrandLogger.m52830i("StrategyConfig", "run short");
            return Intrinsics.compare((int) f.shortValue(), (int) f2.shortValue());
        } else if (f instanceof Byte) {
            AppBrandLogger.m52830i("StrategyConfig", "run byte");
            return Intrinsics.compare((int) f.byteValue(), (int) f2.byteValue());
        } else {
            AppBrandLogger.m52830i("StrategyConfig", "run else");
            return 0;
        }
    }
}
