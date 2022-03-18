package com.google.android.datatransport.runtime.scheduling.p974a;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build;
import java.util.Arrays;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Named;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.datatransport.runtime.scheduling.a.ab */
public final class C21454ab extends SQLiteOpenHelper {

    /* renamed from: a */
    static int f52085a = 3;

    /* renamed from: d */
    private static final AbstractC21455a f52086d;

    /* renamed from: e */
    private static final AbstractC21455a f52087e;

    /* renamed from: f */
    private static final AbstractC21455a f52088f;

    /* renamed from: g */
    private static final List<AbstractC21455a> f52089g;

    /* renamed from: b */
    private final int f52090b;

    /* renamed from: c */
    private boolean f52091c;

    /* renamed from: com.google.android.datatransport.runtime.scheduling.a.ab$a */
    public interface AbstractC21455a {
        /* renamed from: a */
        void mo72718a(SQLiteDatabase sQLiteDatabase);
    }

    static {
        AbstractC21455a a = C21456ac.m77620a();
        f52086d = a;
        AbstractC21455a a2 = C21457ad.m77622a();
        f52087e = a2;
        AbstractC21455a a3 = C21458ae.m77624a();
        f52088f = a3;
        f52089g = Arrays.asList(a, a2, a3);
    }

    public void onOpen(SQLiteDatabase sQLiteDatabase) {
        m77618d(sQLiteDatabase);
    }

    /* renamed from: d */
    private void m77618d(SQLiteDatabase sQLiteDatabase) {
        if (!this.f52091c) {
            onConfigure(sQLiteDatabase);
        }
    }

    /* renamed from: b */
    static /* synthetic */ void m77616b(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE transport_contexts ADD COLUMN extras BLOB");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX contexts_backend_priority_extras on transport_contexts(backend_name, priority, extras)");
        sQLiteDatabase.execSQL("DROP INDEX contexts_backend_priority");
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        m77618d(sQLiteDatabase);
        m77615a(sQLiteDatabase, 0, this.f52090b);
    }

    /* renamed from: c */
    static /* synthetic */ void m77617c(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE events (_id INTEGER PRIMARY KEY, context_id INTEGER NOT NULL, transport_name TEXT NOT NULL, timestamp_ms INTEGER NOT NULL, uptime_ms INTEGER NOT NULL, payload BLOB NOT NULL, code INTEGER, num_attempts INTEGER NOT NULL,FOREIGN KEY (context_id) REFERENCES transport_contexts(_id) ON DELETE CASCADE)");
        sQLiteDatabase.execSQL("CREATE TABLE event_metadata (_id INTEGER PRIMARY KEY, event_id INTEGER NOT NULL, name TEXT NOT NULL, value TEXT NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE)");
        sQLiteDatabase.execSQL("CREATE TABLE transport_contexts (_id INTEGER PRIMARY KEY, backend_name TEXT NOT NULL, priority INTEGER NOT NULL, next_request_ms INTEGER NOT NULL)");
        sQLiteDatabase.execSQL("CREATE INDEX events_backend_id on events(context_id)");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX contexts_backend_priority on transport_contexts(backend_name, priority)");
    }

    public void onConfigure(SQLiteDatabase sQLiteDatabase) {
        this.f52091c = true;
        sQLiteDatabase.rawQuery("PRAGMA busy_timeout=0;", new String[0]).close();
        if (Build.VERSION.SDK_INT >= 16) {
            sQLiteDatabase.setForeignKeyConstraintsEnabled(true);
        }
    }

    @Inject
    C21454ab(Context context, @Named("SCHEMA_VERSION") int i) {
        super(context, "com.google.android.datatransport.events", (SQLiteDatabase.CursorFactory) null, i);
        this.f52090b = i;
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        m77618d(sQLiteDatabase);
        m77615a(sQLiteDatabase, i, i2);
    }

    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.execSQL("DROP TABLE events");
        sQLiteDatabase.execSQL("DROP TABLE event_metadata");
        sQLiteDatabase.execSQL("DROP TABLE transport_contexts");
        onCreate(sQLiteDatabase);
    }

    /* renamed from: a */
    private void m77615a(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        List<AbstractC21455a> list = f52089g;
        if (i2 <= list.size()) {
            while (i < i2) {
                f52089g.get(i).mo72718a(sQLiteDatabase);
                i++;
            }
            return;
        }
        throw new IllegalArgumentException("Migration from " + i + " to " + i2 + " was requested, but cannot be performed. Only " + list.size() + " migrations are provided");
    }
}
