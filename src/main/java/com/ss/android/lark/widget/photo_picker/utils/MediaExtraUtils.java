package com.ss.android.lark.widget.photo_picker.utils;

import android.content.ContentValues;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import com.larksuite.framework.thread.CoreThreadPool;
import com.larksuite.framework.utils.C26311p;
import com.larksuite.framework.utils.MediaStoreUtil;
import com.larksuite.framework.utils.file.direct.DirectFileAccess;
import com.ss.android.lark.chat.entity.media.MediaExtra;
import com.ss.android.lark.utils.C57881t;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u0004*\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0007J\u0016\u0010\n\u001a\u00020\t*\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0007J\n\u0010\u000b\u001a\u00020\t*\u00020\u0005J\u0018\u0010\f\u001a\u0004\u0018\u00010\t*\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0007J\u0018\u0010\r\u001a\u0004\u0018\u00010\u000e*\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0007¨\u0006\u000f"}, d2 = {"Lcom/ss/android/lark/widget/photo_picker/utils/MediaExtraUtils;", "", "()V", "copyFileToMediaStore", "", "Lcom/ss/android/lark/chat/entity/media/MediaExtra;", "context", "Landroid/content/Context;", "path", "", "getDownloadVideoWorkSpace", "toFilename", "toMediaStoreFilePath", "toMediaStoreUri", "Landroid/net/Uri;", "photo-picker-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.widget.photo_picker.f.d */
public final class MediaExtraUtils {

    /* renamed from: a */
    public static final MediaExtraUtils f144839a = new MediaExtraUtils();

    private MediaExtraUtils() {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.widget.photo_picker.f.d$a */
    static final class RunnableC58653a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ File f144840a;

        /* renamed from: b */
        final /* synthetic */ Uri f144841b;

        /* renamed from: c */
        final /* synthetic */ Context f144842c;

        RunnableC58653a(File file, Uri uri, Context context) {
            this.f144840a = file;
            this.f144841b = uri;
            this.f144842c = context;
        }

        public final void run() {
            MediaStoreUtil.m94890a(this.f144840a, this.f144841b, this.f144842c);
        }
    }

    /* renamed from: a */
    public final String mo198855a(MediaExtra mediaExtra) {
        Intrinsics.checkParameterIsNotNull(mediaExtra, "$this$toFilename");
        int abs = Math.abs(mediaExtra.getKey().hashCode());
        String h = C26311p.m95288h(mediaExtra.getMime());
        return abs + '.' + h;
    }

    @JvmStatic
    /* renamed from: a */
    public static final Uri m227479a(MediaExtra mediaExtra, Context context) {
        Intrinsics.checkParameterIsNotNull(mediaExtra, "$this$toMediaStoreUri");
        String a = f144839a.mo198855a(mediaExtra);
        String mime = mediaExtra.getMime();
        Intrinsics.checkExpressionValueIsNotNull(mime, "mime");
        return MediaStoreUtil.m94882a(context, a, mime, (MediaStoreUtil.DirType) null, (ContentValues) null, 24, (Object) null);
    }

    @JvmStatic
    /* renamed from: b */
    public static final String m227481b(MediaExtra mediaExtra, Context context) {
        Intrinsics.checkParameterIsNotNull(mediaExtra, "$this$getDownloadVideoWorkSpace");
        if (Build.VERSION.SDK_INT > 29) {
            return C57881t.m224646r(context) + f144839a.mo198855a(mediaExtra);
        }
        File a = DirectFileAccess.m95103a(new DirectFileAccess.StorageParams(DirectFileAccess.ScopedStorage.SHARED, DirectFileAccess.StorageLocation.EXTERNAL, null, Environment.DIRECTORY_MOVIES, context, null, null, null, 228, null));
        String absolutePath = new File(a, "/Lark/" + f144839a.mo198855a(mediaExtra)).getAbsolutePath();
        Intrinsics.checkExpressionValueIsNotNull(absolutePath, "File(dir, \"/Lark/${toFilename()}\").absolutePath");
        return absolutePath;
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m227480a(MediaExtra mediaExtra, Context context, String str) {
        Intrinsics.checkParameterIsNotNull(mediaExtra, "$this$copyFileToMediaStore");
        if (Build.VERSION.SDK_INT > 29 && str != null && context != null) {
            File file = new File(str);
            Uri a = m227479a(mediaExtra, context);
            if (a != null && file.exists() && file.isFile()) {
                CoreThreadPool coreThreadPool = CoreThreadPool.getDefault();
                Intrinsics.checkExpressionValueIsNotNull(coreThreadPool, "CoreThreadPool.getDefault()");
                coreThreadPool.getCachedThreadPool().execute(new RunnableC58653a(file, a, context));
            }
        }
    }
}
