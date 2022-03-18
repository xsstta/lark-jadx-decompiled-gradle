package com.bytedance.ee.bear.list.cache.p425a;

import android.content.ContentValues;
import android.database.Cursor;
import android.text.TextUtils;
import androidx.p038g.p039a.AbstractC1082b;
import androidx.room.p047a.AbstractC1420a;
import com.bytedance.ee.log.C13479a;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.util.HashMap;

/* renamed from: com.bytedance.ee.bear.list.cache.a.a */
public class C8163a extends AbstractC1420a {
    public C8163a() {
        super(40, 41);
    }

    /* renamed from: a */
    private void m32992a(Cursor cursor) {
        if (cursor != null && !cursor.isClosed()) {
            cursor.close();
        }
    }

    @Override // androidx.room.p047a.AbstractC1420a
    /* renamed from: a */
    public void mo7566a(AbstractC1082b bVar) {
        bVar.execSQL("DROP TABLE IF EXISTS `ListTypes`");
        bVar.execSQL("DROP TABLE IF EXISTS `DocMetaInfo`");
        bVar.execSQL("CREATE TABLE IF NOT EXISTS `DocMetaInfo` (`obj_token` TEXT NOT NULL PRIMARY KEY, `name` TEXT, `type` TEXT, `owner_id` TEXT, `create_tenant_id` TEXT,`creator_cn_name` TEXT,`creator_en_name` TEXT,`edit_uid` TEXT,`edit_time` TEXT,`url` TEXT,`fake_token` TEXT,`is_stared` INTEGER NOT NULL DEFAULT 0,`is_pined` INTEGER NOT NULL DEFAULT 0,`extra_icon_url` TEXT,`extra_icon_key` TEXT,`extra_icon_nonce` TEXT,`extra_icon_encrypted_type` INTEGER NOT NULL DEFAULT 0,`extra_copiable` INTEGER NOT NULL DEFAULT 0,`extra_is_share_root` INTEGER NOT NULL DEFAULT 0,`extra_is_external` INTEGER NOT NULL DEFAULT 0,`extra_sub_type` TEXT,`is_visited` INTEGER NOT NULL DEFAULT 0,`create_time` TEXT,`thumbnail` TEXT,`thumbnail_url` TEXT,`thumbnail_secret` TEXT,`thumbnail_nonce` TEXT,`thumbnail_type` INTEGER NOT NULL DEFAULT 0,`permission` INTEGER NOT NULL DEFAULT 0,`share_time` TEXT,`share_version` INTEGER NOT NULL DEFAULT 0,`is_hidden` INTEGER NOT NULL DEFAULT 0,`need_sync` INTEGER NOT NULL DEFAULT 0,`size` TEXT,`document_icon_key` TEXT,`document_icon_type` INTEGER NOT NULL DEFAULT -1,`document_icon_fsunit` TEXT,`doc_cache_status` INTEGER NOT NULL DEFAULT 0,`is_offline_create` INTEGER NOT NULL DEFAULT 0)");
        bVar.execSQL("CREATE INDEX IF NOT EXISTS index_obj_token ON DocMetaInfo(`obj_token`)");
        bVar.execSQL("CREATE TABLE IF NOT EXISTS `ListTypes` (`obj_token` TEXT NOT NULL, `list_type` INTEGER NOT NULL DEFAULT 0, `file_path` TEXT NOT NULL DEFAULT '',`token` TEXT, `extra` TEXT, `space_id` TEXT,`add_time_manualoffline` TEXT,`is_need_wifi_download` INTEGER NOT NULL DEFAULT 0,`open_time_recent` TEXT,`my_edit_time_recent` TEXT,`activity_time_recent` TEXT,FOREIGN KEY(`obj_token`) REFERENCES DocMetaInfo(`obj_token`) ON UPDATE CASCADE,PRIMARY KEY(`obj_token`, `list_type`, `file_path`))");
        try {
            m32993b(bVar);
        } catch (Exception e) {
            C13479a.m54761a("Migration40_41", e);
        }
    }

    /* renamed from: b */
    private void m32993b(AbstractC1082b bVar) {
        String str;
        String str2;
        C8163a aVar;
        String str3;
        AbstractC1082b bVar2;
        String str4;
        String str5;
        String str6;
        String str7;
        HashMap hashMap;
        String str8;
        String str9;
        String str10;
        String str11;
        HashMap hashMap2;
        String str12;
        AbstractC1082b bVar3;
        String str13;
        C8163a aVar2;
        String str14;
        Cursor cursor;
        String str15;
        String str16;
        String str17;
        String str18;
        String str19;
        String str20;
        String str21;
        String str22;
        String str23;
        Cursor cursor2;
        AbstractC1082b bVar4;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        String str24;
        boolean z5;
        boolean z6;
        boolean z7;
        String str25;
        boolean z8;
        boolean z9;
        boolean z10;
        Cursor cursor3;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        HashMap hashMap3 = new HashMap();
        Cursor query = bVar.query("select * from ManualOfflineDoc");
        String str26 = "thumbnail_secret";
        String str27 = "create_tenant_id";
        String str28 = "extra";
        String str29 = "create_time";
        String str30 = "edit_time";
        String str31 = "url";
        HashMap hashMap4 = hashMap3;
        String str32 = ShareHitPoint.f121869d;
        String str33 = "document_icon_type";
        String str34 = "name";
        String str35 = "document_icon_key";
        String str36 = "thumbnail";
        String str37 = "thumbnail_type";
        String str38 = "obj_token";
        String str39 = "thumbnail_nonce";
        if (query == null || !query.moveToFirst()) {
            str = str34;
            str8 = str36;
            str5 = str28;
            str6 = str32;
            str3 = str31;
            str4 = str29;
            hashMap = hashMap4;
            str2 = str26;
            bVar2 = bVar;
            aVar = this;
            str7 = str30;
        } else {
            while (true) {
                String string = query.getString(query.getColumnIndex(str38));
                String string2 = query.getString(query.getColumnIndex(str34));
                str = str34;
                String string3 = query.getString(query.getColumnIndex("size"));
                String string4 = query.getString(query.getColumnIndex(str32));
                String string5 = query.getString(query.getColumnIndex("subType"));
                String string6 = query.getString(query.getColumnIndex("icon_url"));
                String string7 = query.getString(query.getColumnIndex("icon_key"));
                String string8 = query.getString(query.getColumnIndex("icon_nonce"));
                int i = query.getInt(query.getColumnIndex("icon_encrypted_type"));
                if (query.getInt(query.getColumnIndex("is_external")) == 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                String string9 = query.getString(query.getColumnIndex(str31));
                String string10 = query.getString(query.getColumnIndex("add_time"));
                String string11 = query.getString(query.getColumnIndex(str30));
                if (query.getInt(query.getColumnIndex("copiable")) == 1) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                String string12 = query.getString(query.getColumnIndex("owner_id"));
                String string13 = query.getString(query.getColumnIndex(str27));
                String string14 = query.getString(query.getColumnIndex("creator_cn_name"));
                String string15 = query.getString(query.getColumnIndex("creator_en_name"));
                String string16 = query.getString(query.getColumnIndex("open_time"));
                String string17 = query.getString(query.getColumnIndex(str29));
                String string18 = query.getString(query.getColumnIndex("fake_token"));
                if (query.getInt(query.getColumnIndex("is_star")) == 1) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (query.getInt(query.getColumnIndex("is_top")) == 1) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                String string19 = query.getString(query.getColumnIndex(str28));
                String string20 = query.getString(query.getColumnIndex(str36));
                if (query.getInt(query.getColumnIndex("is_need_wifi_download")) == 1) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                String string21 = query.getString(query.getColumnIndex("thumbnail_url"));
                String string22 = query.getString(query.getColumnIndex(str26));
                String string23 = query.getString(query.getColumnIndex(str39));
                int i2 = query.getInt(query.getColumnIndex(str37));
                String string24 = query.getString(query.getColumnIndex(str35));
                int i3 = query.getInt(query.getColumnIndex(str33));
                String string25 = query.getString(query.getColumnIndex("document_icon_fsunit"));
                ContentValues contentValues = new ContentValues();
                contentValues.put(str38, string);
                contentValues.put(str, string2);
                str6 = str32;
                contentValues.put(str6, string4);
                contentValues.put("owner_id", string12);
                contentValues.put(str27, string13);
                contentValues.put("creator_cn_name", string14);
                contentValues.put("creator_en_name", string15);
                contentValues.put(str30, string11);
                contentValues.put(str31, string9);
                contentValues.put("fake_token", string18);
                contentValues.put("is_stared", Boolean.valueOf(z13));
                contentValues.put("is_pined", Boolean.valueOf(z14));
                contentValues.put("extra_icon_url", string6);
                contentValues.put("extra_icon_key", string7);
                contentValues.put("extra_icon_nonce", string8);
                contentValues.put("extra_icon_encrypted_type", Integer.valueOf(i));
                str8 = str36;
                contentValues.put(str8, string20);
                contentValues.put("extra_copiable", Boolean.valueOf(z12));
                contentValues.put("extra_is_external", Boolean.valueOf(z11));
                contentValues.put("extra_sub_type", string5);
                str4 = str29;
                contentValues.put(str4, string17);
                contentValues.put("thumbnail_url", string21);
                contentValues.put(str26, string22);
                contentValues.put(str39, string23);
                contentValues.put(str37, Integer.valueOf(i2));
                str37 = str37;
                contentValues.put("size", string3);
                hashMap = hashMap4;
                hashMap.put(string, string3);
                contentValues.put(str8, string20);
                contentValues.put(str35, string24);
                contentValues.put(str33, Integer.valueOf(i3));
                str33 = str33;
                contentValues.put("document_icon_fsunit", string25);
                bVar2 = bVar;
                str39 = str39;
                str35 = str35;
                str3 = str31;
                bVar2.insert("DocMetaInfo", 5, contentValues);
                ContentValues contentValues2 = new ContentValues();
                str38 = str38;
                contentValues2.put(str38, string);
                contentValues2.put("list_type", (Integer) 7);
                str5 = str28;
                contentValues2.put(str5, string19);
                str2 = str26;
                contentValues2.put("add_time_manualoffline", string10);
                contentValues2.put("open_time_recent", string16);
                contentValues2.put("is_need_wifi_download", Boolean.valueOf(z15));
                bVar2.insert("ListTypes", 5, contentValues2);
                if (!query.moveToNext()) {
                    break;
                }
                str29 = str4;
                str31 = str3;
                str26 = str2;
                str34 = str;
                query = query;
                hashMap4 = hashMap;
                str32 = str6;
                str28 = str5;
                str36 = str8;
                str30 = str30;
            }
            aVar = this;
            str7 = str30;
            query = query;
        }
        aVar.m32992a(query);
        bVar2.execSQL("DROP TABLE IF EXISTS `ManualOfflineDoc`");
        Cursor query2 = bVar2.query("select * from OfflineOperateDoc");
        String str40 = "thumbnail_url";
        String str41 = "edit_uid";
        if (query2 == null || !query2.moveToFirst()) {
            str9 = str8;
            str11 = str27;
            str10 = str3;
            str12 = str;
            hashMap2 = hashMap;
            str13 = str7;
            bVar3 = bVar2;
            aVar2 = this;
        } else {
            str9 = str8;
            while (true) {
                String string26 = query2.getString(query2.getColumnIndex("fakeToken"));
                if (query2.getInt(query2.getColumnIndex("needSync")) == 1) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                String string27 = query2.getString(query2.getColumnIndex("filepath"));
                str12 = str;
                hashMap2 = hashMap;
                String string28 = query2.getString(query2.getColumnIndex(str12));
                String string29 = query2.getString(query2.getColumnIndex("token"));
                String string30 = query2.getString(query2.getColumnIndex(str6));
                String string31 = query2.getString(query2.getColumnIndex("owner_id"));
                String string32 = query2.getString(query2.getColumnIndex(str27));
                String string33 = query2.getString(query2.getColumnIndex(str4));
                String string34 = query2.getString(query2.getColumnIndex("creator_cn_name"));
                String string35 = query2.getString(query2.getColumnIndex("creator_en_name"));
                String string36 = query2.getString(query2.getColumnIndex(str41));
                String string37 = query2.getString(query2.getColumnIndex(str7));
                String string38 = query2.getString(query2.getColumnIndex(str38));
                String string39 = query2.getString(query2.getColumnIndex(str3));
                String string40 = query2.getString(query2.getColumnIndex("subtype"));
                if (query2.getInt(query2.getColumnIndex("offline_create")) == 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                String string41 = query2.getString(query2.getColumnIndex(str5));
                if (TextUtils.isEmpty(string38)) {
                    cursor3 = query2;
                    string38 = string26;
                } else {
                    cursor3 = query2;
                }
                ContentValues contentValues3 = new ContentValues();
                contentValues3.put(str38, string38);
                contentValues3.put(str12, string28);
                contentValues3.put(str6, string30);
                contentValues3.put("owner_id", string31);
                contentValues3.put(str27, string32);
                contentValues3.put("creator_cn_name", string34);
                contentValues3.put("creator_en_name", string35);
                contentValues3.put(str41, string36);
                str13 = str7;
                contentValues3.put(str13, string37);
                contentValues3.put(str3, string39);
                str11 = str27;
                contentValues3.put("fake_token", string26);
                contentValues3.put("is_offline_create", Boolean.valueOf(z10));
                contentValues3.put("extra_sub_type", string40);
                contentValues3.put("need_sync", Boolean.valueOf(z9));
                str4 = str4;
                contentValues3.put(str4, string33);
                contentValues3.put("size", (String) hashMap2.get(string38));
                bVar3 = bVar;
                str10 = str3;
                bVar3.insert("DocMetaInfo", 5, contentValues3);
                ContentValues contentValues4 = new ContentValues();
                contentValues4.put(str38, string38);
                contentValues4.put("list_type", (Integer) 9);
                contentValues4.put("token", string29);
                contentValues4.put(str5, string41);
                contentValues4.put("file_path", string27);
                bVar3.insert("ListTypes", 5, contentValues4);
                if (!cursor3.moveToNext()) {
                    break;
                }
                str7 = str13;
                hashMap = hashMap2;
                str27 = str11;
                str3 = str10;
                query2 = cursor3;
                str = str12;
            }
            aVar2 = this;
            query2 = cursor3;
        }
        aVar2.m32992a(query2);
        bVar3.execSQL("DROP TABLE IF EXISTS `OfflineOperateDoc`");
        Cursor query3 = bVar3.query("select * from PinedDoc");
        if (query3 == null || !query3.moveToFirst()) {
            str16 = str13;
            cursor = query3;
            str22 = str5;
            str15 = str4;
            str20 = str41;
            str21 = str33;
            str19 = str35;
            str14 = str39;
            str23 = str11;
            str18 = str9;
            str17 = str2;
        } else {
            while (true) {
                String string42 = query3.getString(query3.getColumnIndex(str38));
                query3.getString(query3.getColumnIndex("user_id"));
                String string43 = query3.getString(query3.getColumnIndex(str12));
                String string44 = query3.getString(query3.getColumnIndex(str6));
                if (query3.getInt(query3.getColumnIndex("is_pined")) == 1) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                String string45 = query3.getString(query3.getColumnIndex(str41));
                String string46 = query3.getString(query3.getColumnIndex(str13));
                String string47 = query3.getString(query3.getColumnIndex("owner_id"));
                str16 = str13;
                String string48 = query3.getString(query3.getColumnIndex("creator_en_name"));
                String string49 = query3.getString(query3.getColumnIndex("creator_cn_name"));
                String string50 = query3.getString(query3.getColumnIndex(str4));
                str15 = str4;
                String string51 = query3.getString(query3.getColumnIndex("tenant_id"));
                String string52 = query3.getString(query3.getColumnIndex("space_id"));
                String string53 = query3.getString(query3.getColumnIndex("share_root"));
                if (query3.getInt(query3.getColumnIndex("is_stared")) == 1) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (query3.getInt(query3.getColumnIndex("is_external")) == 1) {
                    str25 = str9;
                    z7 = true;
                } else {
                    str25 = str9;
                    z7 = false;
                }
                String string54 = query3.getString(query3.getColumnIndex(str25));
                String string55 = query3.getString(query3.getColumnIndex(str10));
                String string56 = query3.getString(query3.getColumnIndex("subtype"));
                String string57 = query3.getString(query3.getColumnIndex(str5));
                if (query3.getInt(query3.getColumnIndex("copiable")) == 1) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                int i4 = query3.getInt(query3.getColumnIndex("share_version"));
                String string58 = query3.getString(query3.getColumnIndex(str40));
                String string59 = query3.getString(query3.getColumnIndex(str2));
                String string60 = query3.getString(query3.getColumnIndex(str39));
                str14 = str39;
                int i5 = query3.getInt(query3.getColumnIndex(str37));
                String string61 = query3.getString(query3.getColumnIndex(str35));
                int i6 = query3.getInt(query3.getColumnIndex(str33));
                String string62 = query3.getString(query3.getColumnIndex("document_icon_fsunit"));
                cursor = query3;
                ContentValues contentValues5 = new ContentValues();
                contentValues5.put(str38, string42);
                contentValues5.put(str12, string43);
                contentValues5.put(str6, string44);
                contentValues5.put("owner_id", string47);
                str23 = str11;
                contentValues5.put(str23, string51);
                contentValues5.put("creator_cn_name", string49);
                contentValues5.put("creator_en_name", string48);
                str20 = str41;
                contentValues5.put(str20, string45);
                contentValues5.put(str16, string46);
                contentValues5.put(str10, string55);
                contentValues5.put("is_stared", Boolean.valueOf(z6));
                contentValues5.put("is_pined", Boolean.valueOf(z5));
                str18 = str25;
                contentValues5.put(str18, string54);
                contentValues5.put("extra_copiable", Boolean.valueOf(z8));
                contentValues5.put("extra_is_external", Boolean.valueOf(z7));
                contentValues5.put("extra_sub_type", string56);
                contentValues5.put(str15, string50);
                contentValues5.put(str40, string58);
                str40 = str40;
                contentValues5.put(str2, string59);
                str17 = str2;
                contentValues5.put(str14, string60);
                contentValues5.put(str37, Integer.valueOf(i5));
                str37 = str37;
                contentValues5.put("size", (String) hashMap2.get(string42));
                contentValues5.put(str18, string54);
                str19 = str35;
                contentValues5.put(str19, string61);
                str21 = str33;
                contentValues5.put(str21, Integer.valueOf(i6));
                contentValues5.put("document_icon_fsunit", string62);
                contentValues5.put("share_version", Integer.valueOf(i4));
                contentValues5.put("extra_is_share_root", string53);
                bVar3 = bVar;
                bVar3.insert("DocMetaInfo", 5, contentValues5);
                ContentValues contentValues6 = new ContentValues();
                contentValues6.put(str38, string42);
                contentValues6.put("list_type", (Integer) 5);
                str22 = str5;
                contentValues6.put(str22, string57);
                contentValues6.put("space_id", string52);
                bVar3.insert("ListTypes", 5, contentValues6);
                if (!cursor.moveToNext()) {
                    break;
                }
                str11 = str23;
                str5 = str22;
                str33 = str21;
                str35 = str19;
                str9 = str18;
                str2 = str17;
                str13 = str16;
                str4 = str15;
                query3 = cursor;
                str39 = str14;
                str41 = str20;
            }
        }
        bVar3.execSQL("DROP TABLE IF EXISTS `PinedDoc`");
        m32992a(cursor);
        Cursor query4 = bVar3.query("select * from RecentDoc");
        if (query4 == null || !query4.moveToFirst()) {
            cursor2 = query4;
            bVar4 = bVar3;
        } else {
            while (true) {
                String string63 = query4.getString(query4.getColumnIndex(str38));
                query4.getString(query4.getColumnIndex("userid"));
                query4.getString(query4.getColumnIndex("filepath"));
                String string64 = query4.getString(query4.getColumnIndex(str12));
                String string65 = query4.getString(query4.getColumnIndex(str6));
                String string66 = query4.getString(query4.getColumnIndex("owner_id"));
                String string67 = query4.getString(query4.getColumnIndex(str23));
                String string68 = query4.getString(query4.getColumnIndex("creator_cn_name"));
                String string69 = query4.getString(query4.getColumnIndex("creator_en_name"));
                String string70 = query4.getString(query4.getColumnIndex(str20));
                String string71 = query4.getString(query4.getColumnIndex(str16));
                String string72 = query4.getString(query4.getColumnIndex(str10));
                String string73 = query4.getString(query4.getColumnIndex("fake_token"));
                if (query4.getInt(query4.getColumnIndex("is_external")) == 1) {
                    z = true;
                } else {
                    z = false;
                }
                if (query4.getInt(query4.getColumnIndex("is_star")) == 1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (query4.getInt(query4.getColumnIndex("is_pine")) == 1) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                String string74 = query4.getString(query4.getColumnIndex("open_time"));
                String string75 = query4.getString(query4.getColumnIndex("subtype"));
                String string76 = query4.getString(query4.getColumnIndex(str22));
                String string77 = query4.getString(query4.getColumnIndex("icon_url"));
                String string78 = query4.getString(query4.getColumnIndex("icon_key"));
                String string79 = query4.getString(query4.getColumnIndex("icon_nonce"));
                int i7 = query4.getInt(query4.getColumnIndex("icon_encrypted_type"));
                String string80 = query4.getString(query4.getColumnIndex(str18));
                String string81 = query4.getString(query4.getColumnIndex(str15));
                String string82 = query4.getString(query4.getColumnIndex("my_edit_time"));
                String string83 = query4.getString(query4.getColumnIndex("activity_time"));
                if (query4.getInt(query4.getColumnIndex("copiable")) == 1) {
                    str24 = str40;
                    z4 = true;
                } else {
                    str24 = str40;
                    z4 = false;
                }
                String string84 = query4.getString(query4.getColumnIndex(str24));
                String string85 = query4.getString(query4.getColumnIndex(str17));
                String string86 = query4.getString(query4.getColumnIndex(str14));
                int i8 = query4.getInt(query4.getColumnIndex(str37));
                String string87 = query4.getString(query4.getColumnIndex(str19));
                int i9 = query4.getInt(query4.getColumnIndex(str21));
                String string88 = query4.getString(query4.getColumnIndex("document_icon_fsunit"));
                cursor2 = query4;
                ContentValues contentValues7 = new ContentValues();
                contentValues7.put(str38, string63);
                contentValues7.put(str12, string64);
                contentValues7.put(str6, string65);
                contentValues7.put("owner_id", string66);
                contentValues7.put(str23, string67);
                contentValues7.put("creator_cn_name", string68);
                contentValues7.put("creator_en_name", string69);
                contentValues7.put(str20, string70);
                contentValues7.put(str16, string71);
                contentValues7.put(str10, string72);
                contentValues7.put("fake_token", string73);
                contentValues7.put("is_stared", Boolean.valueOf(z2));
                contentValues7.put("is_pined", Boolean.valueOf(z3));
                contentValues7.put("extra_icon_url", string77);
                contentValues7.put("extra_icon_key", string78);
                contentValues7.put("extra_icon_nonce", string79);
                contentValues7.put("extra_icon_encrypted_type", Integer.valueOf(i7));
                contentValues7.put(str18, string80);
                contentValues7.put("extra_copiable", Boolean.valueOf(z4));
                contentValues7.put("extra_is_external", Boolean.valueOf(z));
                contentValues7.put("extra_sub_type", string75);
                contentValues7.put(str15, string81);
                contentValues7.put(str24, string84);
                str40 = str24;
                contentValues7.put(str17, string85);
                str17 = str17;
                contentValues7.put(str14, string86);
                contentValues7.put(str37, Integer.valueOf(i8));
                str14 = str14;
                contentValues7.put("size", (String) hashMap2.get(string63));
                contentValues7.put(str18, string80);
                contentValues7.put(str19, string87);
                contentValues7.put(str21, Integer.valueOf(i9));
                contentValues7.put("document_icon_fsunit", string88);
                bVar4 = bVar;
                bVar4.insert("DocMetaInfo", 5, contentValues7);
                ContentValues contentValues8 = new ContentValues();
                contentValues8.put(str38, string63);
                contentValues8.put("list_type", (Integer) 1);
                contentValues8.put(str22, string76);
                contentValues8.put("open_time_recent", string74);
                contentValues8.put("my_edit_time_recent", string82);
                contentValues8.put("activity_time_recent", string83);
                bVar4.insert("ListTypes", 5, contentValues8);
                if (!cursor2.moveToNext()) {
                    break;
                }
                str23 = str23;
                str37 = str37;
                str20 = str20;
                query4 = cursor2;
                str18 = str18;
                str22 = str22;
                str21 = str21;
                str6 = str6;
            }
        }
        bVar4.execSQL("DROP TABLE IF EXISTS `RecentDoc`");
        m32992a(cursor2);
        Cursor query5 = bVar4.query("select * from StatusDoc");
        if (query5 != null && query5.moveToFirst()) {
            while (true) {
                String string89 = query5.getString(query5.getColumnIndex("doc_token"));
                int i10 = query5.getInt(query5.getColumnIndex("doc_cache_status"));
                ContentValues contentValues9 = new ContentValues();
                contentValues9.put(str38, string89);
                contentValues9.put("doc_cache_status", Integer.valueOf(i10));
                if (bVar.update("DocMetaInfo", 5, contentValues9, "obj_token=?", new String[]{string89}) <= 0) {
                    bVar4.insert("DocMetaInfo", 4, contentValues9);
                }
                if (!query5.moveToNext()) {
                    break;
                }
                str38 = str38;
            }
        }
        bVar4.execSQL("DROP TABLE IF EXISTS `StatusDoc`");
        m32992a(query5);
        bVar4.execSQL("DROP TABLE IF EXISTS `MineDoc`");
        bVar4.execSQL("DROP TABLE IF EXISTS `PersonalDoc`");
        bVar4.execSQL("DROP TABLE IF EXISTS `ShareDoc`");
        bVar4.execSQL("DROP TABLE IF EXISTS `StarDoc`");
        bVar4.execSQL("DROP TABLE IF EXISTS `TrashDoc`");
        bVar4.execSQL("DROP TABLE IF EXISTS `RecentPull`");
    }
}
