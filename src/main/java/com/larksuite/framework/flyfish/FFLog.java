package com.larksuite.framework.flyfish;

import android.util.Log;
import com.ss.android.vc.statistics.p3180a.C63690d;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u00032\u00020\u0001:\u0002\u0003\u0004B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0005"}, d2 = {"Lcom/larksuite/framework/flyfish/FFLog;", "", "()V", "Companion", "ILog", "flyfish_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.larksuite.framework.flyfish.a */
public final class FFLog {

    /* renamed from: a */
    public static ILog f64299a = new C25979b();

    /* renamed from: b */
    public static final Companion f64300b = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&J\u0018\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&¨\u0006\n"}, d2 = {"Lcom/larksuite/framework/flyfish/FFLog$ILog;", "", C63690d.f160779a, "", "tag", "", "msg", "e", "i", "w", "flyfish_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.larksuite.framework.flyfish.a$c */
    public interface ILog {
        /* renamed from: a */
        void mo92365a(String str, String str2);

        /* renamed from: b */
        void mo92366b(String str, String str2);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fJ\u0016\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fJ\u0016\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fJ\u0016\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fR\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u0011"}, d2 = {"Lcom/larksuite/framework/flyfish/FFLog$Companion;", "", "()V", "sLog", "Lcom/larksuite/framework/flyfish/FFLog$ILog;", "getSLog", "()Lcom/larksuite/framework/flyfish/FFLog$ILog;", "setSLog", "(Lcom/larksuite/framework/flyfish/FFLog$ILog;)V", C63690d.f160779a, "", "tag", "", "msg", "e", "i", "w", "flyfish_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.larksuite.framework.flyfish.a$a */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: a */
        public final ILog mo92362a() {
            return FFLog.f64299a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo92363a(String str, String str2) {
            Intrinsics.checkParameterIsNotNull(str, "tag");
            Intrinsics.checkParameterIsNotNull(str2, "msg");
            mo92362a().mo92365a(str, str2);
        }

        /* renamed from: b */
        public final void mo92364b(String str, String str2) {
            Intrinsics.checkParameterIsNotNull(str, "tag");
            Intrinsics.checkParameterIsNotNull(str2, "msg");
            mo92362a().mo92366b(str, str2);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0018\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¨\u0006\n"}, d2 = {"com/larksuite/framework/flyfish/FFLog$Companion$sLog$1", "Lcom/larksuite/framework/flyfish/FFLog$ILog;", C63690d.f160779a, "", "tag", "", "msg", "e", "i", "w", "flyfish_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.larksuite.framework.flyfish.a$b */
    public static final class C25979b implements ILog {
        C25979b() {
        }

        @Override // com.larksuite.framework.flyfish.FFLog.ILog
        /* renamed from: a */
        public void mo92365a(String str, String str2) {
            Intrinsics.checkParameterIsNotNull(str, "tag");
            Intrinsics.checkParameterIsNotNull(str2, "msg");
            Log.d(str, str2);
        }

        @Override // com.larksuite.framework.flyfish.FFLog.ILog
        /* renamed from: b */
        public void mo92366b(String str, String str2) {
            Intrinsics.checkParameterIsNotNull(str, "tag");
            Intrinsics.checkParameterIsNotNull(str2, "msg");
            Log.w(str, str2);
        }
    }
}
