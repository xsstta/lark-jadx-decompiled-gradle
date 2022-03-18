package com.ss.android.lark.widget.photo_picker.p2951f;

import android.app.Activity;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.text.TextUtils;
import androidx.fragment.app.FragmentActivity;
import androidx.loader.content.C1197b;
import androidx.loader.content.C1198c;
import androidx.loader.p045a.AbstractC1181a;
import com.huawei.hms.framework.common.ContainerUtils;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.thread.CoreThreadPool;
import com.larksuite.framework.utils.C26311p;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.ao;
import com.ss.android.lark.widget.photo_picker.entity.Photo;
import com.ss.android.lark.widget.photo_picker.entity.PhotoDirectory;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;

/* renamed from: com.ss.android.lark.widget.photo_picker.f.f */
public class C58654f {

    /* renamed from: a */
    public static final Uri f144845a = MediaStore.Files.getContentUri("external");

    /* renamed from: b */
    public static final String[] f144846b = {"_id", "_data", "mime_type", "width", "height", "bucket_id", "bucket_display_name", "date_added", "_size", "duration"};

    /* renamed from: c */
    public static final String[] f144847c = {String.valueOf(1), String.valueOf(3)};

    /* renamed from: d */
    static String[] f144848d = {String.valueOf(1)};

    /* renamed from: e */
    public static long f144849e;

    /* renamed from: f */
    private static long f144850f = 0;

    /* renamed from: g */
    private static long f144851g = 0;

    /* renamed from: h */
    private static Set<String> f144852h = new HashSet(16);

    /* renamed from: i */
    private static Set<String> f144853i = new HashSet(4);

    /* renamed from: com.ss.android.lark.widget.photo_picker.f.f$c */
    public interface AbstractC58658c {
        /* renamed from: a */
        void mo39869a(List<PhotoDirectory> list);
    }

    static {
        f144852h.add(".avi");
        f144852h.add(".wmv");
        f144852h.add(".mpeg");
        f144852h.add(".mkv");
        f144852h.add(".flv");
        f144852h.add(".f4v");
        f144852h.add(".m4v");
        f144852h.add(".rmvb");
        f144852h.add(".dat");
        f144852h.add(".ts");
        f144852h.add(".mts");
        f144852h.add(".vob");
        f144853i.add(".3gp");
        f144853i.add(".mp4");
        f144853i.add(".mov");
    }

    /* renamed from: com.ss.android.lark.widget.photo_picker.f.f$a */
    public static class CallableC58655a implements Callable<Object> {

        /* renamed from: a */
        public AbstractC58658c f144854a;

        /* renamed from: b */
        private WeakReference<Activity> f144855b;

        /* renamed from: c */
        private WeakReference<Cursor> f144856c;

        /* renamed from: d */
        private Context f144857d;

        @Override // java.util.concurrent.Callable
        public Object call() {
            Object obj;
            Exception e;
            String str;
            String str2 = "MediaStoreHelper";
            Log.m165389i(str2, "load db finish: " + (System.currentTimeMillis() - C58654f.f144849e));
            Object obj2 = new Object();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            Cursor cursor = this.f144856c.get();
            if (mo198859a(cursor) || cursor.getCount() <= 0) {
                m227494a(arrayList);
                return obj2;
            }
            try {
                Log.m165389i(str2, "total count: " + cursor.getCount());
                cursor.moveToFirst();
                while (true) {
                    int i = cursor.getInt(m227493a(cursor, "_id"));
                    String string = cursor.getString(m227493a(cursor, "_data"));
                    String string2 = cursor.getString(m227493a(cursor, "mime_type"));
                    String string3 = cursor.getString(m227493a(cursor, "bucket_display_name"));
                    obj = obj2;
                    try {
                        Photo photo = new Photo(i, string, string2, (long) cursor.getInt(m227493a(cursor, "duration")), cursor.getInt(m227493a(cursor, "width")), cursor.getInt(m227493a(cursor, "height")), cursor.getLong(m227493a(cursor, "_size")));
                        if (m227496a(photo)) {
                            if (m227497b(photo)) {
                                C58654f.m227486a(string, string3, arrayList).getPhotos().add(photo);
                                arrayList2.add(photo);
                                if (arrayList2.size() == 100 && cursor.getCount() > 300) {
                                    m227495a(new ArrayList(arrayList), new ArrayList(arrayList2));
                                    str = str2;
                                    Log.m165389i(str, "first page finish: " + (System.currentTimeMillis() - C58654f.f144849e));
                                    cursor = cursor;
                                    if (mo198859a(cursor) || !cursor.moveToNext()) {
                                        m227495a(arrayList, arrayList2);
                                        Log.m165389i(str, "all data finish: " + (System.currentTimeMillis() - C58654f.f144849e));
                                    } else {
                                        str2 = str;
                                        obj2 = obj;
                                    }
                                }
                            }
                        }
                        str = str2;
                        cursor = cursor;
                        if (mo198859a(cursor)) {
                            break;
                        }
                        break;
                    } catch (Exception e2) {
                        e = e2;
                        Log.m165386e("loading media data error: ", e);
                        return obj;
                    }
                }
                m227495a(arrayList, arrayList2);
                Log.m165389i(str, "all data finish: " + (System.currentTimeMillis() - C58654f.f144849e));
                return obj;
            } catch (Exception e3) {
                e = e3;
                obj = obj2;
                Log.m165386e("loading media data error: ", e);
                return obj;
            }
        }

        /* renamed from: a */
        private void m227494a(final List<PhotoDirectory> list) {
            if (this.f144854a != null) {
                UICallbackExecutor.execute(new Runnable() {
                    /* class com.ss.android.lark.widget.photo_picker.p2951f.C58654f.CallableC58655a.RunnableC586561 */

                    public void run() {
                        CallableC58655a.this.f144854a.mo39869a(list);
                    }
                });
            }
        }

        /* renamed from: a */
        private boolean m227496a(Photo photo) {
            if (photo.getPath() == null) {
                return false;
            }
            return true;
        }

        /* renamed from: a */
        public boolean mo198859a(Cursor cursor) {
            if (UIUtils.isActivityRunning(this.f144855b.get()) && cursor != null && !cursor.isClosed()) {
                return false;
            }
            return true;
        }

        /* renamed from: b */
        private boolean m227497b(Photo photo) {
            boolean z = true;
            if (!photo.isVideo()) {
                return true;
            }
            if (C58654f.m227491a(photo)) {
                return false;
            }
            if (C58654f.m227492b(photo)) {
                return true;
            }
            Boolean a = MediaKVDiskCacheUtils.f144844b.mo198857a(this.f144857d, photo.getPath());
            if (a != null) {
                return a.booleanValue();
            }
            long currentTimeMillis = System.currentTimeMillis();
            if (ao.m224314c(photo.getPath()) != 0) {
                z = false;
            }
            Log.m165397w("MediaStoreHelper", "check can compress time: " + (System.currentTimeMillis() - currentTimeMillis) + " path: " + photo.getPath());
            MediaKVDiskCacheUtils.f144844b.mo198858a(this.f144857d, photo.getPath(), z);
            return z;
        }

        /* renamed from: a */
        private int m227493a(Cursor cursor, String str) {
            return cursor.getColumnIndexOrThrow(str);
        }

        /* renamed from: a */
        private void m227495a(List<PhotoDirectory> list, List<Photo> list2) {
            PhotoDirectory photoDirectory = new PhotoDirectory();
            if (list2.size() > 0) {
                photoDirectory.setCoverPath(list2.get(0).getPath());
                photoDirectory.setPhotos(list2);
                photoDirectory.setId("ALL");
                photoDirectory.setName(UIUtils.getString(this.f144857d, R.string.Lark_Legacy_PickerAllImage));
                list.add(0, photoDirectory);
                Log.m165389i("MediaStoreHelper", "result count: " + list2.size());
            }
            C58654f.m227490a(list);
            m227494a(list);
        }

        public CallableC58655a(Activity activity, Cursor cursor, AbstractC58658c cVar) {
            this.f144855b = new WeakReference<>(activity);
            this.f144856c = new WeakReference<>(cursor);
            this.f144854a = cVar;
            this.f144857d = activity.getApplicationContext();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.widget.photo_picker.f.f$b */
    public static class C58657b implements AbstractC1181a.AbstractC1182a<Cursor> {

        /* renamed from: a */
        private WeakReference<Activity> f144860a;

        /* renamed from: b */
        private Context f144861b;

        /* renamed from: c */
        private AbstractC58658c f144862c;

        /* renamed from: d */
        private Future<Object> f144863d;

        /* renamed from: a */
        private static String[] m227500a(int i) {
            return new String[]{String.valueOf(i)};
        }

        @Override // androidx.loader.p045a.AbstractC1181a.AbstractC1182a
        /* renamed from: a */
        public void mo6054a(C1198c<Cursor> cVar) {
            Future<Object> future = this.f144863d;
            if (future != null) {
                future.cancel(true);
                this.f144863d = null;
            }
        }

        public C58657b(Activity activity, AbstractC58658c cVar) {
            this.f144860a = new WeakReference<>(activity);
            this.f144861b = activity.getApplicationContext();
            this.f144862c = cVar;
        }

        @Override // androidx.loader.p045a.AbstractC1181a.AbstractC1182a
        /* renamed from: a */
        public C1198c<Cursor> mo6053a(int i, Bundle bundle) {
            return m227499a(this.f144861b, bundle.getBoolean("SHOW_GIF", false), bundle.getBoolean("SHOW_VIDEO", false));
        }

        /* renamed from: a */
        public void mo6055a(C1198c<Cursor> cVar, Cursor cursor) {
            Activity activity;
            if (cursor != null && (activity = this.f144860a.get()) != null && this.f144862c != null) {
                this.f144863d = CoreThreadPool.getDefault().getCachedThreadPool().submit(new CallableC58655a(activity, cursor, this.f144862c));
            }
        }

        /* renamed from: a */
        private C1198c<Cursor> m227499a(Context context, boolean z, boolean z2) {
            String str;
            if (z2) {
                return new C1197b(context, C58654f.f144845a, C58654f.f144846b, C58654f.m227488a(C58654f.m227487a(0, 0), z), C58654f.f144847c, "_id DESC");
            }
            String[] a = m227500a(1);
            Uri uri = C58654f.f144845a;
            String[] strArr = C58654f.f144846b;
            if (z) {
                str = "media_type=? AND _size>0";
            } else {
                str = "media_type=? AND _size>0 AND mime_type!='image/gif'";
            }
            return new C1197b(context, uri, strArr, str, a, "_id DESC");
        }
    }

    /* renamed from: b */
    public static boolean m227492b(Photo photo) {
        String g = C26311p.m95287g(photo.getPath());
        if (TextUtils.isEmpty(g)) {
            return false;
        }
        return f144853i.contains(g.toLowerCase());
    }

    /* renamed from: a */
    public static void m227490a(List<PhotoDirectory> list) {
        Iterator<PhotoDirectory> it = list.iterator();
        while (it.hasNext()) {
            if (CollectionUtils.isEmpty(it.next().getPhotos())) {
                it.remove();
            }
        }
    }

    /* renamed from: a */
    public static boolean m227491a(Photo photo) {
        String g = C26311p.m95287g(photo.getPath());
        if (TextUtils.isEmpty(g)) {
            return true;
        }
        return f144852h.contains(g.toLowerCase());
    }

    /* renamed from: a */
    public static String m227488a(String str, boolean z) {
        String str2;
        StringBuilder sb = new StringBuilder();
        sb.append("(media_type=?");
        if (z) {
            str2 = "";
        } else {
            str2 = " AND mime_type!='image/gif'";
        }
        sb.append(str2);
        sb.append(" OR ");
        sb.append("media_type=? AND ");
        sb.append(str);
        sb.append(") AND ");
        sb.append("_size");
        sb.append(">0");
        return sb.toString();
    }

    /* renamed from: a */
    public static String m227487a(long j, long j2) {
        String str;
        long j3 = f144850f;
        if (j3 == 0) {
            j3 = Long.MAX_VALUE;
        }
        if (j != 0) {
            j3 = Math.min(j3, j);
        }
        StringBuilder sb = new StringBuilder();
        Locale locale = Locale.CHINA;
        Object[] objArr = new Object[3];
        objArr[0] = Long.valueOf(Math.max(j2, f144851g));
        if (Math.max(j2, f144851g) == 0) {
            str = "";
        } else {
            str = ContainerUtils.KEY_VALUE_DELIMITER;
        }
        objArr[1] = str;
        objArr[2] = Long.valueOf(j3);
        String format = String.format(locale, "(%d <%s duration and duration <= %d)", objArr);
        sb.append("((duration is NULL) OR ");
        sb.append(format);
        sb.append(")");
        return sb.toString();
    }

    /* renamed from: a */
    public static void m227489a(FragmentActivity fragmentActivity, Bundle bundle, AbstractC58658c cVar) {
        f144849e = System.currentTimeMillis();
        AbstractC1181a supportLoaderManager = fragmentActivity.getSupportLoaderManager();
        C58657b bVar = new C58657b(fragmentActivity, cVar);
        if (supportLoaderManager.mo6050b(R.id.loader_photo) == null) {
            supportLoaderManager.mo6046a(R.id.loader_photo, bundle, bVar);
        } else {
            supportLoaderManager.mo6051b(R.id.loader_photo, bundle, bVar);
        }
    }

    /* renamed from: a */
    public static PhotoDirectory m227486a(String str, String str2, List<PhotoDirectory> list) {
        String str3;
        PhotoDirectory next;
        String name;
        File file = new File(str);
        File parentFile = file.getParentFile();
        if (parentFile == null) {
            Log.m165397w("MediaStoreHelper", "folderFile is null;  file is " + file.getPath() + " , absPath = " + file.getAbsolutePath());
        }
        Iterator<PhotoDirectory> it = list.iterator();
        do {
            str3 = "";
            if (it.hasNext()) {
                next = it.next();
                name = next.getName();
                if (parentFile != null) {
                    str3 = parentFile.getName();
                }
            } else {
                PhotoDirectory photoDirectory = new PhotoDirectory();
                if (parentFile == null) {
                    photoDirectory.setName(str3);
                    photoDirectory.setPath(str3);
                } else {
                    photoDirectory.setName(parentFile.getName());
                    photoDirectory.setPath(parentFile.getAbsolutePath());
                }
                photoDirectory.setCoverPath(str);
                list.add(photoDirectory);
                return photoDirectory;
            }
        } while (!name.equals(str3));
        return next;
    }
}
