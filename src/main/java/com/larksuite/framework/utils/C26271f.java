package com.larksuite.framework.utils;

import android.content.ContentProviderOperation;
import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.provider.ContactsContract;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.larksuite.framework.utils.f */
public class C26271f {

    /* renamed from: a */
    private ContentResolver f64868a;

    /* renamed from: com.larksuite.framework.utils.f$a */
    public static class C26272a {

        /* renamed from: a */
        String f64869a;

        /* renamed from: b */
        List<String> f64870b;

        /* renamed from: c */
        byte[] f64871c;

        /* renamed from: a */
        public String mo93381a() {
            return this.f64869a;
        }

        /* renamed from: b */
        public List<String> mo93385b() {
            return this.f64870b;
        }

        /* renamed from: c */
        public byte[] mo93386c() {
            return this.f64871c;
        }

        /* renamed from: a */
        public void mo93382a(String str) {
            this.f64869a = str;
        }

        /* renamed from: a */
        public void mo93383a(List<String> list) {
            this.f64870b = list;
        }

        /* renamed from: a */
        public void mo93384a(byte[] bArr) {
            this.f64871c = bArr;
        }
    }

    public C26271f(Context context) {
        this.f64868a = context.getContentResolver();
    }

    /* renamed from: a */
    public String mo93378a(String str) {
        Cursor query = this.f64868a.query(ContactsContract.Contacts.CONTENT_URI, new String[]{"_id"}, "display_name='" + str + "'", null, null);
        if (query == null || !query.moveToNext()) {
            return "0";
        }
        return query.getString(query.getColumnIndex("_id"));
    }

    /* renamed from: b */
    public void mo93380b(C26272a aVar) {
        ArrayList<ContentProviderOperation> arrayList = new ArrayList<>();
        String a = mo93378a(aVar.mo93381a());
        ContentProviderOperation.Builder newDelete = ContentProviderOperation.newDelete(ContactsContract.RawContacts.CONTENT_URI);
        arrayList.add(newDelete.withSelection("contact_id=" + a, null).build());
        ContentProviderOperation.Builder newDelete2 = ContentProviderOperation.newDelete(ContactsContract.Data.CONTENT_URI);
        arrayList.add(newDelete2.withSelection("contact_id=" + a, null).build());
        try {
            this.f64868a.applyBatch("com.android.contacts", arrayList);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public void mo93379a(C26272a aVar) {
        ArrayList<ContentProviderOperation> arrayList = new ArrayList<>();
        if (mo93378a(aVar.mo93381a()).equals("0")) {
            arrayList.add(ContentProviderOperation.newInsert(ContactsContract.RawContacts.CONTENT_URI).withValue("account_type", null).withValue("account_name", null).build());
            arrayList.add(ContentProviderOperation.newInsert(ContactsContract.Data.CONTENT_URI).withValueBackReference("raw_contact_id", 0).withValue("mimetype", "vnd.android.cursor.item/name").withValue("data1", aVar.mo93381a()).build());
            arrayList.add(ContentProviderOperation.newInsert(ContactsContract.Data.CONTENT_URI).withValueBackReference("raw_contact_id", 0).withValue("mimetype", "vnd.android.cursor.item/photo").withValue("data15", aVar.mo93386c()).build());
            for (String str : aVar.mo93385b()) {
                if (!str.trim().equals("")) {
                    arrayList.add(ContentProviderOperation.newInsert(ContactsContract.Data.CONTENT_URI).withValueBackReference("raw_contact_id", 0).withValue("mimetype", "vnd.android.cursor.item/phone_v2").withValue("data1", str).withValue("data2", 2).build());
                }
            }
            try {
                this.f64868a.applyBatch("com.android.contacts", arrayList);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
