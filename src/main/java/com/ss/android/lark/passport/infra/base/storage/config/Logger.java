package com.ss.android.lark.passport.infra.base.storage.config;

import com.ss.android.lark.log.Log;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007J\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005H&¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/passport/infra/base/storage/config/Logger;", "", "log", "", "msg", "", "level", "Companion", "passport-infra_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.passport.infra.base.c.a.c */
public interface Logger {

    /* renamed from: a */
    public static final Companion f123135a = Companion.f123136a;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u000e\u0010\t\u001a\u00020\nXT¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/passport/infra/base/storage/config/Logger$Companion;", "", "()V", "NULL", "Lcom/ss/android/lark/passport/infra/base/storage/config/Logger;", "getNULL", "()Lcom/ss/android/lark/passport/infra/base/storage/config/Logger;", "PASSPORT_LOG", "getPASSPORT_LOG", "TAG", "", "passport-infra_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.passport.infra.base.c.a.c$a */
    public static final class Companion {

        /* renamed from: a */
        static final /* synthetic */ Companion f123136a;

        /* renamed from: b */
        private static final Logger f123137b = new C49047a();

        /* renamed from: c */
        private static final Logger f123138c;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¨\u0006\u0007"}, d2 = {"com/ss/android/lark/passport/infra/base/storage/config/Logger$Companion$NULL$1", "Lcom/ss/android/lark/passport/infra/base/storage/config/Logger;", "log", "", "msg", "", "level", "passport-infra_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.passport.infra.base.c.a.c$a$a */
        public static final class C49047a implements Logger {
            @Override // com.ss.android.lark.passport.infra.base.storage.config.Logger
            /* renamed from: a */
            public void mo171234a(String str, String str2) {
                Intrinsics.checkParameterIsNotNull(str, "msg");
                Intrinsics.checkParameterIsNotNull(str2, "level");
            }

            C49047a() {
            }
        }

        private Companion() {
        }

        /* renamed from: a */
        public final Logger mo171235a() {
            return f123138c;
        }

        static {
            Companion aVar = new Companion();
            f123136a = aVar;
            f123138c = new C49048b(aVar);
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¨\u0006\u0007"}, d2 = {"com/ss/android/lark/passport/infra/base/storage/config/Logger$Companion$PASSPORT_LOG$1", "Lcom/ss/android/lark/passport/infra/base/storage/config/Logger;", "log", "", "msg", "", "level", "passport-infra_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.passport.infra.base.c.a.c$a$b */
        public static final class C49048b implements Logger {

            /* renamed from: b */
            final /* synthetic */ Companion f123139b;

            /* JADX WARN: Incorrect args count in method signature: ()V */
            C49048b(Companion aVar) {
                this.f123139b = aVar;
            }

            @Override // com.ss.android.lark.passport.infra.base.storage.config.Logger
            /* renamed from: a */
            public void mo171234a(String str, String str2) {
                Intrinsics.checkParameterIsNotNull(str, "msg");
                Intrinsics.checkParameterIsNotNull(str2, "level");
                switch (str2.hashCode()) {
                    case 2251950:
                        if (str2.equals("INFO")) {
                            Log.m165390i("IsolateStorage", str, null);
                            return;
                        }
                        return;
                    case 2656902:
                        if (str2.equals("WARN")) {
                            Log.m165398w("IsolateStorage", str, null);
                            return;
                        }
                        return;
                    case 64921139:
                        if (str2.equals("DEBUG")) {
                            Log.m165380d("IsolateStorage", str, null);
                            return;
                        }
                        return;
                    case 66247144:
                        if (str2.equals("ERROR")) {
                            Log.m165384e("IsolateStorage", str, (Throwable) null);
                            return;
                        }
                        return;
                    default:
                        return;
                }
            }
        }
    }

    /* renamed from: a */
    void mo171234a(String str, String str2);
}
