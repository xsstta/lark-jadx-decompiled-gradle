package com.bytedance.ee.bear.list.cache.p425a;

import android.content.ContentValues;
import android.database.Cursor;
import androidx.p038g.p039a.AbstractC1082b;
import androidx.room.p047a.AbstractC1420a;
import com.bytedance.ee.util.common.C13606d;

/* renamed from: com.bytedance.ee.bear.list.cache.a.i */
public class C8171i extends AbstractC1420a {
    public C8171i() {
        super(49, 50);
    }

    /* renamed from: a */
    private void m33002a(Cursor cursor) {
        if (cursor != null && !cursor.isClosed()) {
            cursor.close();
        }
    }

    @Override // androidx.room.p047a.AbstractC1420a
    /* renamed from: a */
    public void mo7566a(AbstractC1082b bVar) {
        bVar.execSQL("ALTER TABLE `DocMetaInfo` ADD COLUMN is_share_folder INTEGER NOT NULL DEFAULT 0");
        bVar.execSQL("ALTER TABLE `FilterCache` ADD COLUMN node_type_folder INTEGER NOT NULL DEFAULT 0");
        bVar.execSQL("ALTER TABLE `FilterCache` ADD COLUMN shortcut_name_folder TEXT");
        bVar.execSQL("CREATE TABLE IF NOT EXISTS `ListTypes_New` (`obj_token` TEXT NOT NULL, `list_type` INTEGER NOT NULL DEFAULT 0, `file_path` TEXT NOT NULL DEFAULT '',`token` TEXT NOT NULL DEFAULT '', `extra` TEXT, `space_id` TEXT,`add_time_manualoffline` TEXT,`is_need_wifi_download` INTEGER NOT NULL DEFAULT 0,`open_time_recent` TEXT,`my_edit_time_recent` TEXT,`activity_time_recent` TEXT,`has_perm_folder` INTEGER NOT NULL DEFAULT 1,`show_external_hint_folder` INTEGER NOT NULL DEFAULT 0,`node_type_folder` INTEGER NOT NULL DEFAULT 0,`shortcut_name_folder` TEXT,FOREIGN KEY(`obj_token`) REFERENCES DocMetaInfo(`obj_token`) ON UPDATE CASCADE,PRIMARY KEY(`obj_token`, `list_type`, `token`))");
        try {
            m33003b(bVar);
        } catch (Exception e) {
            C13606d.m55244a(e);
        }
        bVar.execSQL("DROP TABLE IF EXISTS 'ListTypes'");
        bVar.execSQL("ALTER TABLE ListTypes_New RENAME TO ListTypes");
        bVar.execSQL("CREATE INDEX IF NOT EXISTS `index_ListTypes_obj_token_list_type` ON `ListTypes` (`obj_token`, `list_type`)");
    }

    /* renamed from: b */
    private void m33003b(AbstractC1082b bVar) {
        C8171i iVar;
        boolean z;
        boolean z2;
        Cursor query = bVar.query("select * from ListTypes");
        if (query == null || !query.moveToFirst()) {
            iVar = this;
        } else {
            while (true) {
                String string = query.getString(query.getColumnIndex("obj_token"));
                int i = query.getInt(query.getColumnIndex("list_type"));
                String string2 = query.getString(query.getColumnIndex("file_path"));
                String string3 = query.getString(query.getColumnIndex("token"));
                String string4 = query.getString(query.getColumnIndex("extra"));
                String string5 = query.getString(query.getColumnIndex("space_id"));
                String string6 = query.getString(query.getColumnIndex("add_time_manualoffline"));
                if (query.getInt(query.getColumnIndex("is_need_wifi_download")) == 1) {
                    z = true;
                } else {
                    z = false;
                }
                String string7 = query.getString(query.getColumnIndex("open_time_recent"));
                String string8 = query.getString(query.getColumnIndex("my_edit_time_recent"));
                String string9 = query.getString(query.getColumnIndex("activity_time_recent"));
                if (query.getInt(query.getColumnIndex("has_perm_folder")) == 1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                int i2 = query.getInt(query.getColumnIndex("show_external_hint_folder"));
                boolean z3 = true;
                if (i2 != 1) {
                    z3 = false;
                }
                ContentValues contentValues = new ContentValues();
                contentValues.put("obj_token", string);
                contentValues.put("list_type", Integer.valueOf(i));
                contentValues.put("file_path", string2);
                if (string3 == null) {
                    string3 = "";
                }
                contentValues.put("token", string3);
                contentValues.put("extra", string4);
                contentValues.put("space_id", string5);
                contentValues.put("add_time_manualoffline", string6);
                contentValues.put("is_need_wifi_download", Boolean.valueOf(z));
                contentValues.put("open_time_recent", string7);
                contentValues.put("my_edit_time_recent", string8);
                contentValues.put("activity_time_recent", string9);
                contentValues.put("has_perm_folder", Boolean.valueOf(z2));
                contentValues.put("show_external_hint_folder", Boolean.valueOf(z3));
                contentValues.put("node_type_folder", (Integer) 0);
                contentValues.put("shortcut_name_folder", "");
                bVar.insert("ListTypes_New", 5, contentValues);
                if (!query.moveToNext()) {
                    break;
                }
                query = query;
            }
            iVar = this;
            query = query;
        }
        iVar.m33002a(query);
    }
}
