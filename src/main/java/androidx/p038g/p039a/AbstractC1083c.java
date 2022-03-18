package androidx.p038g.p039a;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Build;
import android.util.Log;
import java.io.File;

/* renamed from: androidx.g.a.c */
public interface AbstractC1083c {

    /* renamed from: androidx.g.a.c$c */
    public interface AbstractC1087c {
        AbstractC1083c create(C1085b bVar);
    }

    AbstractC1082b getWritableDatabase();

    void setWriteAheadLoggingEnabled(boolean z);

    /* renamed from: androidx.g.a.c$b */
    public static class C1085b {

        /* renamed from: a */
        public final Context f4070a;

        /* renamed from: b */
        public final String f4071b;

        /* renamed from: c */
        public final AbstractC1084a f4072c;

        /* renamed from: androidx.g.a.c$b$a */
        public static class C1086a {

            /* renamed from: a */
            Context f4073a;

            /* renamed from: b */
            String f4074b;

            /* renamed from: c */
            AbstractC1084a f4075c;

            /* renamed from: a */
            public C1085b mo5743a() {
                AbstractC1084a aVar = this.f4075c;
                if (aVar != null) {
                    Context context = this.f4073a;
                    if (context != null) {
                        return new C1085b(context, this.f4074b, aVar);
                    }
                    throw new IllegalArgumentException("Must set a non-null context to create the configuration.");
                }
                throw new IllegalArgumentException("Must set a callback to create the configuration.");
            }

            /* renamed from: a */
            public C1086a mo5741a(AbstractC1084a aVar) {
                this.f4075c = aVar;
                return this;
            }

            C1086a(Context context) {
                this.f4073a = context;
            }

            /* renamed from: a */
            public C1086a mo5742a(String str) {
                this.f4074b = str;
                return this;
            }
        }

        /* renamed from: a */
        public static C1086a m5191a(Context context) {
            return new C1086a(context);
        }

        C1085b(Context context, String str, AbstractC1084a aVar) {
            this.f4070a = context;
            this.f4071b = str;
            this.f4072c = aVar;
        }
    }

    /* renamed from: androidx.g.a.c$a */
    public static abstract class AbstractC1084a {

        /* renamed from: a */
        public final int f4069a;

        /* renamed from: a */
        public void mo5735a(AbstractC1082b bVar) {
        }

        /* renamed from: a */
        public abstract void mo5736a(AbstractC1082b bVar, int i, int i2);

        /* renamed from: b */
        public abstract void mo5737b(AbstractC1082b bVar);

        /* renamed from: c */
        public void mo5739c(AbstractC1082b bVar) {
        }

        public AbstractC1084a(int i) {
            this.f4069a = i;
        }

        /* renamed from: a */
        private void m5184a(String str) {
            if (!str.equalsIgnoreCase(":memory:") && str.trim().length() != 0) {
                Log.w("SupportSQLite", "deleting the database file: " + str);
                try {
                    if (Build.VERSION.SDK_INT >= 16) {
                        SQLiteDatabase.deleteDatabase(new File(str));
                        return;
                    }
                    try {
                        if (!new File(str).delete()) {
                            Log.e("SupportSQLite", "Could not delete the database file " + str);
                        }
                    } catch (Exception e) {
                        Log.e("SupportSQLite", "error while deleting corrupted database file", e);
                    }
                } catch (Exception e2) {
                    Log.w("SupportSQLite", "delete failed: ", e2);
                }
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0034, code lost:
            if (r0 != null) goto L_0x0036;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0036, code lost:
            r3 = r0.iterator();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x003e, code lost:
            if (r3.hasNext() != false) goto L_0x0040;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0040, code lost:
            m5184a((java.lang.String) r3.next().second);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x004e, code lost:
            m5184a(r3.getPath());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0055, code lost:
            throw r1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:7:0x002e, code lost:
            r1 = move-exception;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0030 */
        /* JADX WARNING: Removed duplicated region for block: B:19:0x0059  */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x0071  */
        /* JADX WARNING: Removed duplicated region for block: B:7:0x002e A[ExcHandler: all (r1v3 'th' java.lang.Throwable A[CUSTOM_DECLARE]), PHI: r0 
          PHI: (r0v10 java.util.List<android.util.Pair<java.lang.String, java.lang.String>>) = (r0v3 java.util.List<android.util.Pair<java.lang.String, java.lang.String>>), (r0v4 java.util.List<android.util.Pair<java.lang.String, java.lang.String>>), (r0v4 java.util.List<android.util.Pair<java.lang.String, java.lang.String>>) binds: [B:5:0x0029, B:8:0x0030, B:9:?] A[DONT_GENERATE, DONT_INLINE], Splitter:B:5:0x0029] */
        /* renamed from: d */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo5740d(androidx.p038g.p039a.AbstractC1082b r3) {
            /*
            // Method dump skipped, instructions count: 121
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.p038g.p039a.AbstractC1083c.AbstractC1084a.mo5740d(androidx.g.a.b):void");
        }

        /* renamed from: b */
        public void mo5738b(AbstractC1082b bVar, int i, int i2) {
            throw new SQLiteException("Can't downgrade database from version " + i + " to " + i2);
        }
    }
}
