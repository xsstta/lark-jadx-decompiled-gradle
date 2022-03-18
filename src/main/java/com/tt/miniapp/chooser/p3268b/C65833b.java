package com.tt.miniapp.chooser.p3268b;

import android.app.LoaderManager;
import android.content.Context;
import android.content.CursorLoader;
import android.content.Loader;
import android.database.Cursor;
import android.os.Bundle;
import android.provider.MediaStore;
import com.bytedance.ee.lark.infra.foundation.schedulers.Action;
import com.bytedance.ee.lark.infra.foundation.schedulers.Observable;
import com.bytedance.ee.lark.infra.foundation.schedulers.Schedulers;
import com.bytedance.ee.lark.infra.foundation.schedulers.Subscriber;
import com.larksuite.suite.R;
import com.tt.miniapp.entity.Folder;
import com.tt.miniapphost.entity.MediaEntity;
import java.io.File;
import java.util.ArrayList;

/* renamed from: com.tt.miniapp.chooser.b.b */
public class C65833b extends C65836c implements LoaderManager.LoaderCallbacks {

    /* renamed from: a */
    String[] f165911a = {"_data", "_display_name", "date_added", "mime_type", "_size", "_id"};

    /* renamed from: b */
    Context f165912b;

    /* renamed from: c */
    AbstractC65832a f165913c;

    @Override // android.app.LoaderManager.LoaderCallbacks
    public void onLoaderReset(Loader loader) {
    }

    public C65833b(Context context, AbstractC65832a aVar) {
        this.f165912b = context;
        this.f165913c = aVar;
    }

    @Override // android.app.LoaderManager.LoaderCallbacks
    public Loader onCreateLoader(int i, Bundle bundle) {
        return new CursorLoader(this.f165912b, MediaStore.Images.Media.EXTERNAL_CONTENT_URI, this.f165911a, null, null, "date_added DESC");
    }

    @Override // android.app.LoaderManager.LoaderCallbacks
    public void onLoadFinished(Loader loader, final Object obj) {
        final ArrayList arrayList = new ArrayList();
        Observable.create(new Action() {
            /* class com.tt.miniapp.chooser.p3268b.C65833b.C658352 */

            @Override // com.bytedance.ee.lark.infra.foundation.schedulers.Action
            public void act() {
                Folder folder = new Folder(C65833b.this.f165912b.getResources().getString(R.string.microapp_m_all_image));
                arrayList.add(folder);
                Cursor cursor = (Cursor) obj;
                if (cursor != null) {
                    while (cursor.moveToNext()) {
                        String string = cursor.getString(cursor.getColumnIndexOrThrow("_data"));
                        String string2 = cursor.getString(cursor.getColumnIndexOrThrow("_display_name"));
                        long j = cursor.getLong(cursor.getColumnIndexOrThrow("date_added"));
                        int i = cursor.getInt(cursor.getColumnIndexOrThrow("mime_type"));
                        long j2 = cursor.getLong(cursor.getColumnIndexOrThrow("_size"));
                        int i2 = cursor.getInt(cursor.getColumnIndexOrThrow("_id"));
                        if (j2 >= 1 && new File(string).exists()) {
                            String a = C65833b.this.mo230564a(string);
                            MediaEntity mediaEntity = new MediaEntity(string, string2, j, i, j2, i2, a);
                            folder.mo231046a(mediaEntity);
                            int a2 = C65833b.this.mo230563a(arrayList, a);
                            if (a2 != -1) {
                                ((Folder) arrayList.get(a2)).mo231046a(mediaEntity);
                            } else {
                                Folder folder2 = new Folder(a);
                                folder2.mo231046a(mediaEntity);
                                arrayList.add(folder2);
                            }
                        }
                    }
                    cursor.close();
                }
            }
        }).schudleOn(Schedulers.longIO()).observeOn(Schedulers.ui()).subscribe(new Subscriber() {
            /* class com.tt.miniapp.chooser.p3268b.C65833b.C658341 */

            @Override // com.bytedance.ee.lark.infra.foundation.schedulers.Subscriber
            public void onSuccess(Object obj) {
            }

            @Override // com.bytedance.ee.lark.infra.foundation.schedulers.Subscriber
            public void onSuccess() {
                if (C65833b.this.f165913c != null) {
                    C65833b.this.f165913c.mo49267c(arrayList);
                }
            }

            @Override // com.bytedance.ee.lark.infra.foundation.schedulers.Subscriber
            public void onError(Throwable th) {
                if (C65833b.this.f165913c != null) {
                    C65833b.this.f165913c.mo49267c(arrayList);
                }
            }
        });
    }
}
