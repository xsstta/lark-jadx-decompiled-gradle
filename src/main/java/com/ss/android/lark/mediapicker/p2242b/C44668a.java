package com.ss.android.lark.mediapicker.p2242b;

import android.app.Activity;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.text.TextUtils;
import androidx.core.app.ActivityCompat;
import androidx.loader.content.C1197b;
import androidx.loader.content.C1198c;
import androidx.loader.p045a.AbstractC1181a;
import com.huawei.hms.framework.common.ContainerUtils;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.mediapicker.dependency.C44677b;
import com.ss.android.lark.mediapicker.entity.LocalMedia;
import com.ss.android.lark.mediapicker.entity.LocalMediaFolder;
import com.ss.android.lark.mediapicker.utils.C44742a;
import com.ss.android.lark.mediapicker.utils.C44753h;
import com.ss.android.lark.mediapicker.utils.C44758n;
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

/* renamed from: com.ss.android.lark.mediapicker.b.a */
public class C44668a {

    /* renamed from: a */
    public static final Uri f113192a = MediaStore.Files.getContentUri("external");

    /* renamed from: b */
    public static final String[] f113193b = {"_id", "_data", "mime_type", "width", "height", "bucket_id", "bucket_display_name", "date_added", "_size", "duration"};

    /* renamed from: c */
    public static final String[] f113194c = {String.valueOf(1), String.valueOf(3)};

    /* renamed from: d */
    public static long f113195d;

    /* renamed from: e */
    public static List<String> f113196e = new ArrayList();

    /* renamed from: f */
    private static Set<String> f113197f = new HashSet(5);

    /* renamed from: g */
    private static Set<String> f113198g = new HashSet(16);

    /* renamed from: h */
    private static Set<String> f113199h = new HashSet(4);

    /* renamed from: i */
    private static long f113200i = 0;

    /* renamed from: j */
    private static long f113201j = 0;

    /* renamed from: com.ss.android.lark.mediapicker.b.a$c */
    public interface AbstractC44672c {
        /* renamed from: a */
        void mo158175a(List<LocalMediaFolder> list);
    }

    /* renamed from: com.ss.android.lark.mediapicker.b.a$a */
    public static class CallableC44669a implements Callable<Object> {

        /* renamed from: a */
        public AbstractC44672c f113202a;

        /* renamed from: b */
        private WeakReference<Context> f113203b;

        /* renamed from: c */
        private WeakReference<Cursor> f113204c;

        /* renamed from: d */
        private Context f113205d;

        /* JADX WARNING: Removed duplicated region for block: B:38:0x0182 A[Catch:{ Exception -> 0x01ad }] */
        /* JADX WARNING: Removed duplicated region for block: B:50:0x018e A[ADDED_TO_REGION, EDGE_INSN: B:50:0x018e->B:41:0x018e ?: BREAK  , SYNTHETIC] */
        @Override // java.util.concurrent.Callable
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object call() {
            /*
            // Method dump skipped, instructions count: 461
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.mediapicker.p2242b.C44668a.CallableC44669a.call():java.lang.Object");
        }

        /* renamed from: a */
        private void m177186a(final List<LocalMediaFolder> list) {
            if (this.f113202a != null) {
                UICallbackExecutor.execute(new Runnable() {
                    /* class com.ss.android.lark.mediapicker.p2242b.C44668a.CallableC44669a.RunnableC446701 */

                    public void run() {
                        CallableC44669a.this.f113202a.mo158175a(list);
                    }
                });
            }
        }

        /* renamed from: c */
        private boolean m177190c(LocalMedia localMedia) {
            if (!localMedia.isImage() || !C44668a.m177182a(localMedia)) {
                return true;
            }
            return false;
        }

        /* renamed from: a */
        private boolean m177188a(LocalMedia localMedia) {
            return !TextUtils.isEmpty(localMedia.getPath());
        }

        /* renamed from: b */
        private boolean m177189b(LocalMedia localMedia) {
            if (!localMedia.isVideo()) {
                return true;
            }
            if (C44668a.m177183b(localMedia)) {
                return false;
            }
            return C44668a.m177184c(localMedia);
        }

        /* renamed from: a */
        public boolean mo158252a(Cursor cursor) {
            Context context = this.f113203b.get();
            if (!(context instanceof Activity) || !C44742a.m177480b((Activity) context) || cursor == null || cursor.isClosed()) {
                return true;
            }
            return false;
        }

        /* renamed from: a */
        private int m177185a(Cursor cursor, String str) {
            return cursor.getColumnIndexOrThrow(str);
        }

        /* renamed from: a */
        private void m177187a(List<LocalMediaFolder> list, List<LocalMedia> list2) {
            LocalMediaFolder localMediaFolder = new LocalMediaFolder();
            if (list2.size() > 0) {
                localMediaFolder.setCoverPath(list2.get(0).getPath());
                localMediaFolder.setLocalMedia(list2);
                localMediaFolder.setId("ALL");
                localMediaFolder.setName(UIUtils.getString(this.f113205d, R.string.Lark_MediaPicker_AllImage));
                list.add(0, localMediaFolder);
                C44677b.m177240c("MediaStoreHelper->result count: " + list2.size());
            }
            C44668a.m177181a(list);
            m177186a(list);
        }

        public CallableC44669a(Context context, Cursor cursor, AbstractC44672c cVar) {
            this.f113203b = new WeakReference<>(context);
            this.f113204c = new WeakReference<>(cursor);
            this.f113202a = cVar;
            this.f113205d = context.getApplicationContext();
        }
    }

    static {
        f113198g.add(".avi");
        f113198g.add(".wmv");
        f113198g.add(".mpeg");
        f113198g.add(".mkv");
        f113198g.add(".flv");
        f113198g.add(".f4v");
        f113198g.add(".m4v");
        f113198g.add(".rmvb");
        f113198g.add(".dat");
        f113198g.add(".ts");
        f113198g.add(".mts");
        f113198g.add(".vob");
        f113197f.add(".svg");
        f113197f.add(".tif");
        f113197f.add(".tiff");
        f113197f.add(".heic");
        f113197f.add(".heif");
        f113199h.add(".3gp");
        f113199h.add(".mp4");
        f113199h.add(".mov");
        f113196e.add("image/jpeg");
        f113196e.add("image/png");
        f113196e.add("image/gif");
        f113196e.add("video/mp4");
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.mediapicker.b.a$b */
    public static class C44671b implements AbstractC1181a.AbstractC1182a<Cursor> {

        /* renamed from: a */
        private WeakReference<Context> f113208a;

        /* renamed from: b */
        private Context f113209b;

        /* renamed from: c */
        private WeakReference<AbstractC44672c> f113210c;

        /* renamed from: d */
        private Future<Object> f113211d;

        @Override // androidx.loader.p045a.AbstractC1181a.AbstractC1182a
        /* renamed from: a */
        public void mo6054a(C1198c<Cursor> cVar) {
            Future<Object> future = this.f113211d;
            if (future != null) {
                future.cancel(true);
                this.f113211d = null;
            }
        }

        public C44671b(Context context, AbstractC44672c cVar) {
            this.f113208a = new WeakReference<>(context);
            this.f113209b = context.getApplicationContext();
            this.f113210c = new WeakReference<>(cVar);
        }

        @Override // androidx.loader.p045a.AbstractC1181a.AbstractC1182a
        /* renamed from: a */
        public C1198c<Cursor> mo6053a(int i, Bundle bundle) {
            return m177192a(this.f113209b, bundle.getBoolean("SHOW_GIF", false), bundle.getBoolean("SHOW_VIDEO", false));
        }

        /* renamed from: a */
        public void mo6055a(C1198c<Cursor> cVar, Cursor cursor) {
            if (cursor != null) {
                Context context = this.f113208a.get();
                AbstractC44672c cVar2 = this.f113210c.get();
                if (context != null && cVar2 != null) {
                    this.f113211d = C44758n.m177507a().mo158473a(new CallableC44669a(context, cursor, cVar2));
                }
            }
        }

        /* renamed from: a */
        private C1198c<Cursor> m177192a(Context context, boolean z, boolean z2) {
            String str;
            if (z2) {
                return new C1197b(context, C44668a.f113192a, C44668a.f113193b, C44668a.m177179a(C44668a.m177178a(0, 0), z), C44668a.f113194c, "_id DESC");
            }
            String[] strArr = {String.valueOf(1)};
            Uri uri = C44668a.f113192a;
            String[] strArr2 = C44668a.f113193b;
            if (z) {
                str = "media_type=? AND _size>0";
            } else {
                str = "media_type=? AND _size>0 AND mime_type!='image/gif'";
            }
            return new C1197b(context, uri, strArr2, str, strArr, "_id DESC");
        }
    }

    /* renamed from: a */
    public static void m177181a(List<LocalMediaFolder> list) {
        Iterator<LocalMediaFolder> it = list.iterator();
        while (it.hasNext()) {
            if (CollectionUtils.isEmpty(it.next().getLocalMedia())) {
                it.remove();
            }
        }
    }

    /* renamed from: b */
    public static boolean m177183b(LocalMedia localMedia) {
        String a = C44753h.m177494a(localMedia.getPath());
        if (TextUtils.isEmpty(a)) {
            return true;
        }
        return f113198g.contains(a.toLowerCase());
    }

    /* renamed from: c */
    public static boolean m177184c(LocalMedia localMedia) {
        String a = C44753h.m177494a(localMedia.getPath());
        if (TextUtils.isEmpty(a)) {
            return false;
        }
        return f113199h.contains(a.toLowerCase());
    }

    /* renamed from: a */
    public static boolean m177182a(LocalMedia localMedia) {
        String a = C44753h.m177494a(localMedia.getPath());
        if (TextUtils.isEmpty(a)) {
            return true;
        }
        return f113197f.contains(a.toLowerCase());
    }

    /* renamed from: a */
    public static String m177179a(String str, boolean z) {
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
        sb.append("media_type=? ");
        sb.append(")");
        return sb.toString();
    }

    /* renamed from: a */
    public static String m177178a(long j, long j2) {
        String str;
        long j3 = f113200i;
        if (j3 == 0) {
            j3 = Long.MAX_VALUE;
        }
        if (j != 0) {
            j3 = Math.min(j3, j);
        }
        StringBuilder sb = new StringBuilder();
        Locale locale = Locale.CHINA;
        Object[] objArr = new Object[3];
        objArr[0] = Long.valueOf(Math.max(j2, f113201j));
        if (Math.max(j2, f113201j) == 0) {
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
    public static LocalMediaFolder m177177a(String str, String str2, List<LocalMediaFolder> list) {
        String str3;
        LocalMediaFolder next;
        String name;
        File file = new File(str);
        File parentFile = file.getParentFile();
        if (parentFile == null) {
            C44677b.m177239b("MediaStoreHelper->folderFile is null;  file is " + file.getPath() + " , absPath = " + file.getAbsolutePath());
        }
        Iterator<LocalMediaFolder> it = list.iterator();
        do {
            str3 = "";
            if (it.hasNext()) {
                next = it.next();
                name = next.getName();
                if (parentFile != null) {
                    str3 = parentFile.getName();
                }
            } else {
                LocalMediaFolder localMediaFolder = new LocalMediaFolder();
                if (parentFile == null) {
                    localMediaFolder.setName(str3);
                    localMediaFolder.setPath(str3);
                } else {
                    localMediaFolder.setName(parentFile.getName());
                    localMediaFolder.setPath(parentFile.getAbsolutePath());
                }
                localMediaFolder.setCoverPath(str);
                list.add(localMediaFolder);
                return localMediaFolder;
            }
        } while (!name.equals(str3));
        return next;
    }

    /* renamed from: a */
    public static void m177180a(AbstractC1181a aVar, Context context, Bundle bundle, AbstractC44672c cVar) {
        if (ActivityCompat.checkSelfPermission(context.getApplicationContext(), "android.permission.READ_EXTERNAL_STORAGE") != 0) {
            cVar.mo158175a(new ArrayList());
            return;
        }
        f113195d = System.currentTimeMillis();
        C44671b bVar = new C44671b(context, cVar);
        if (aVar.mo6050b(R.id.picker_loader_photo) == null) {
            aVar.mo6046a(R.id.picker_loader_photo, bundle, bVar);
        } else {
            aVar.mo6051b(R.id.picker_loader_photo, bundle, bVar);
        }
    }
}
