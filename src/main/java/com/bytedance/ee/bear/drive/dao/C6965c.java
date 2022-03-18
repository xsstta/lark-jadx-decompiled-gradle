package com.bytedance.ee.bear.drive.dao;

import android.content.Context;
import androidx.p038g.p039a.AbstractC1082b;
import androidx.room.RoomDatabase;
import androidx.room.p047a.AbstractC1420a;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.db.DBController;
import com.bytedance.ee.util.p701d.C13615c;

/* renamed from: com.bytedance.ee.bear.drive.dao.c */
public class C6965c {

    /* renamed from: a */
    private static volatile C6965c f18846a;

    /* renamed from: b */
    public AbstractC6954a mo27478b() {
        return m27720d().mo16369m();
    }

    /* renamed from: c */
    public AbstractC6972d mo27479c() {
        return m27720d().mo27401n();
    }

    /* renamed from: a */
    public static C6965c m27719a() {
        if (f18846a == null) {
            synchronized (C6965c.class) {
                if (f18846a == null) {
                    f18846a = new C6965c(C13615c.f35773a);
                }
            }
        }
        return f18846a;
    }

    /* renamed from: d */
    private synchronized DriveDatabase m27720d() {
        return (DriveDatabase) DBController.m55314a().mo50590b("drive.db");
    }

    private C6965c(Context context) {
        DBController.m55314a().mo50588a("drive.db", new DBController.C13632a(context).mo50597a("drive.db").mo50596a(DriveDatabase.class).mo50595a(new RoomDatabase.AbstractC1417b() {
            /* class com.bytedance.ee.bear.drive.dao.C6965c.C69716 */

            @Override // androidx.room.RoomDatabase.AbstractC1417b
            /* renamed from: a */
            public void mo7559a(AbstractC1082b bVar) {
                super.mo7559a(bVar);
                C13479a.m54764b("DRIVE_DB", "onCreate");
            }

            @Override // androidx.room.RoomDatabase.AbstractC1417b
            /* renamed from: b */
            public void mo7560b(AbstractC1082b bVar) {
                super.mo7560b(bVar);
                C13479a.m54764b("DRIVE_DB", "onOpen");
            }
        }).mo50598a(new AbstractC1420a(1, 2) {
            /* class com.bytedance.ee.bear.drive.dao.C6965c.C69705 */

            @Override // androidx.room.p047a.AbstractC1420a
            /* renamed from: a */
            public void mo7566a(AbstractC1082b bVar) {
                bVar.execSQL("ALTER TABLE t_drive_cache ADD COLUMN cache_uid TEXT");
                bVar.execSQL("ALTER TABLE t_drive_cache ADD COLUMN cache_tenant_id TEXT");
            }
        }).mo50598a(new AbstractC1420a(2, 3) {
            /* class com.bytedance.ee.bear.drive.dao.C6965c.C69694 */

            @Override // androidx.room.p047a.AbstractC1420a
            /* renamed from: a */
            public void mo7566a(AbstractC1082b bVar) {
                bVar.execSQL("ALTER TABLE t_drive_cache ADD COLUMN partial_file_path TEXT");
                bVar.execSQL("ALTER TABLE t_drive_cache ADD COLUMN is_use_partial_file INTEGER NOT NULL DEFAULT 0");
                bVar.execSQL("ALTER TABLE t_drive_cache ADD COLUMN preview_extra TEXT");
            }
        }).mo50598a(new AbstractC1420a(3, 4) {
            /* class com.bytedance.ee.bear.drive.dao.C6965c.C69683 */

            @Override // androidx.room.p047a.AbstractC1420a
            /* renamed from: a */
            public void mo7566a(AbstractC1082b bVar) {
                bVar.execSQL("ALTER TABLE t_drive_cache ADD COLUMN cache_host Integer NOT NULL DEFAULT 0");
                bVar.execSQL("ALTER TABLE t_drive_cache ADD COLUMN sdk_app_id TEXT");
                bVar.execSQL("ALTER TABLE t_drive_cache ADD COLUMN sdk_extra TEXT");
            }
        }).mo50598a(new AbstractC1420a(4, 5) {
            /* class com.bytedance.ee.bear.drive.dao.C6965c.C69672 */

            @Override // androidx.room.p047a.AbstractC1420a
            /* renamed from: a */
            public void mo7566a(AbstractC1082b bVar) {
                bVar.execSQL("DROP TABLE IF EXISTS `drive_excel_sub_cache`");
                bVar.execSQL("CREATE TABLE IF NOT EXISTS `drive_excel_sub_cache` (`sdk_app_id` TEXT NOT NULL , `obj_token` TEXT NOT NULL, `data_version` TEXT NOT NULL, `sub_id` TEXT NOT NULL, `json_data_file_path` TEXT NOT NULL, `json_data` TEXT NOT NULL,PRIMARY KEY(`sdk_app_id`, `obj_token`, `data_version`, `sub_id`))");
                bVar.execSQL("ALTER TABLE t_drive_cache ADD COLUMN flags Integer NOT NULL DEFAULT 0");
            }
        }).mo50598a(new AbstractC1420a(5, 6) {
            /* class com.bytedance.ee.bear.drive.dao.C6965c.C69661 */

            @Override // androidx.room.p047a.AbstractC1420a
            /* renamed from: a */
            public void mo7566a(AbstractC1082b bVar) {
                bVar.execSQL("ALTER TABLE t_drive_cache ADD COLUMN mime_type TEXT");
            }
        }));
    }
}
