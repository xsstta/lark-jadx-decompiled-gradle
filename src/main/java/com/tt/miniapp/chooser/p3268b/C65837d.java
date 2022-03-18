package com.tt.miniapp.chooser.p3268b;

import android.app.LoaderManager;
import android.content.Context;
import android.content.CursorLoader;
import android.content.Loader;
import android.database.Cursor;
import android.os.Bundle;
import android.provider.MediaStore;
import com.larksuite.suite.R;
import com.tt.miniapp.entity.Folder;
import com.tt.miniapphost.entity.MediaEntity;
import java.io.File;
import java.util.ArrayList;

/* renamed from: com.tt.miniapp.chooser.b.d */
public class C65837d extends C65836c implements LoaderManager.LoaderCallbacks {

    /* renamed from: a */
    String[] f165919a = {"_data", "_display_name", "date_added", "media_type", "_size", "_id", "parent"};

    /* renamed from: b */
    Context f165920b;

    /* renamed from: c */
    AbstractC65832a f165921c;

    @Override // android.app.LoaderManager.LoaderCallbacks
    public void onLoaderReset(Loader loader) {
    }

    public C65837d(Context context, AbstractC65832a aVar) {
        this.f165920b = context;
        this.f165921c = aVar;
    }

    @Override // android.app.LoaderManager.LoaderCallbacks
    public Loader onCreateLoader(int i, Bundle bundle) {
        return new CursorLoader(this.f165920b, MediaStore.Files.getContentUri("external"), this.f165919a, "media_type=1 OR media_type=3", null, "date_added DESC");
    }

    @Override // android.app.LoaderManager.LoaderCallbacks
    public void onLoadFinished(Loader loader, Object obj) {
        ArrayList<Folder> arrayList = new ArrayList<>();
        Folder folder = new Folder(this.f165920b.getResources().getString(R.string.microapp_m_all_dir_name));
        arrayList.add(folder);
        Folder folder2 = new Folder(this.f165920b.getResources().getString(R.string.microapp_m_video_dir_name));
        arrayList.add(folder2);
        Cursor cursor = (Cursor) obj;
        if (cursor != null) {
            while (cursor.moveToNext()) {
                String string = cursor.getString(cursor.getColumnIndexOrThrow("_data"));
                String string2 = cursor.getString(cursor.getColumnIndexOrThrow("_display_name"));
                long j = cursor.getLong(cursor.getColumnIndexOrThrow("date_added"));
                int i = cursor.getInt(cursor.getColumnIndexOrThrow("media_type"));
                long j2 = cursor.getLong(cursor.getColumnIndexOrThrow("_size"));
                int i2 = cursor.getInt(cursor.getColumnIndexOrThrow("_id"));
                if (j2 >= 1 && new File(string).exists()) {
                    String a = mo230564a(string);
                    MediaEntity mediaEntity = new MediaEntity(string, string2, j, i, j2, i2, a);
                    folder.mo231046a(mediaEntity);
                    if (i == 3) {
                        folder2.mo231046a(mediaEntity);
                    }
                    int a2 = mo230563a(arrayList, a);
                    if (a2 != -1) {
                        arrayList.get(a2).mo231046a(mediaEntity);
                    } else {
                        Folder folder3 = new Folder(a);
                        folder3.mo231046a(mediaEntity);
                        arrayList.add(folder3);
                    }
                    cursor = cursor;
                }
            }
            cursor.close();
        }
        this.f165921c.mo49267c(arrayList);
    }
}
