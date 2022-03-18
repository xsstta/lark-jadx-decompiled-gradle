package com.bytedance.ee.android.file.picker.lib.utils;

import android.app.Application;
import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.provider.MediaStore;
import android.text.TextUtils;
import com.bytedance.ee.android.file.picker.lib.media.BaseFileEntry;
import com.bytedance.ee.android.file.picker.lib.media.FileEntry;
import com.huawei.hms.actions.SearchIntents;
import com.larksuite.framework.utils.LarkUriUtil;
import com.ss.android.lark.utils.LarkContext;
import java.io.File;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C69043h;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u0005\u001a\u00020\u0006\"\b\b\u0000\u0010\u0007*\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00070\nH\u0007J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J\u001e\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000f2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\u0012H\u0003J\"\u0010\u0013\u001a\u00020\u0006*\u00020\u00142\u0006\u0010\u000e\u001a\u00020\u000f2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\u0012H\u0002J\u0014\u0010\u0015\u001a\u00020\u0016*\u00020\b2\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J=\u0010\u0017\u001a\u00020\u0006*\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00040\u001c2\u0006\u0010\u001d\u001a\u00020\u00042\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\u0012H\u0002¢\u0006\u0002\u0010\u001eJ\"\u0010\u001f\u001a\u00020\u0006*\u00020 2\u0006\u0010!\u001a\u00020\u001a2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\u0012H\u0002J \u0010\"\u001a\u00020\u0006*\u00020\u00142\u0006\u0010\u000e\u001a\u00020\u000f2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\u0012R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lcom/bytedance/ee/android/file/picker/lib/utils/FileEntryUtils;", "", "()V", "TAG", "", "filterFileEntries", "", "T", "Lcom/bytedance/ee/android/file/picker/lib/media/BaseFileEntry;", "entries", "", "getReceivedFileEntries", "", "Lcom/bytedance/ee/android/file/picker/lib/media/FileEntry;", "context", "Landroid/content/Context;", "getReceivedFileEntriesForR", "set", "", "fileToFileEntry", "Ljava/io/File;", "isExist", "", SearchIntents.EXTRA_QUERY, "Landroid/content/ContentResolver;", "uri", "Landroid/net/Uri;", "projection", "", "select", "(Landroid/content/ContentResolver;Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;)V", "toFileEntry", "Landroid/database/Cursor;", "contentUri", "toFileEntryInner", "file-picker-lib_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.bytedance.ee.android.file.picker.lib.utils.e */
public final class FileEntryUtils {

    /* renamed from: a */
    public static final FileEntryUtils f12471a = new FileEntryUtils();

    private FileEntryUtils() {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "T", "Lcom/bytedance/ee/android/file/picker/lib/media/BaseFileEntry;", "entry", "invoke", "(Lcom/bytedance/ee/android/file/picker/lib/media/BaseFileEntry;)Z"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.bytedance.ee.android.file.picker.lib.utils.e$a */
    static final class C4121a extends Lambda implements Function1<T, Boolean> {
        final /* synthetic */ Application $context;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4121a(Application application) {
            super(1);
            this.$context = application;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Boolean invoke(Object obj) {
            return Boolean.valueOf(invoke((BaseFileEntry) obj));
        }

        public final boolean invoke(T t) {
            Intrinsics.checkParameterIsNotNull(t, "entry");
            return !FileEntryUtils.m17130a(t, this.$context);
        }
    }

    @JvmStatic
    /* renamed from: a */
    public static final <T extends BaseFileEntry> void m17129a(List<T> list) {
        Intrinsics.checkParameterIsNotNull(list, "entries");
        Application application = LarkContext.getApplication();
        if (application != null) {
            CollectionsKt.removeAll((List) list, (Function1) new C4121a(application));
        }
    }

    @JvmStatic
    /* renamed from: a */
    public static final List<FileEntry> m17125a(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        HashSet hashSet = new HashSet();
        if (Build.VERSION.SDK_INT <= 29 || context.getApplicationInfo().targetSdkVersion <= 29) {
            Iterator<T> it = FileUtils.m17140b(context).iterator();
            while (it.hasNext()) {
                f12471a.mo16097a(it.next(), context, hashSet);
            }
        } else {
            f12471a.m17127a(context, hashSet);
        }
        return CollectionsKt.toList(hashSet);
    }

    /* renamed from: a */
    private final void m17127a(Context context, Set<FileEntry> set) {
        File[] listFiles;
        String[] strArr = {"_id", "_display_name", "_size", "date_modified"};
        ContentResolver contentResolver = context.getContentResolver();
        FileEntryUtils eVar = f12471a;
        Uri uri = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
        Intrinsics.checkExpressionValueIsNotNull(uri, "MediaStore.Images.Media.EXTERNAL_CONTENT_URI");
        eVar.m17126a(contentResolver, uri, strArr, "relative_path like '%Lark%'", set);
        Uri uri2 = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
        Intrinsics.checkExpressionValueIsNotNull(uri2, "MediaStore.Audio.Media.EXTERNAL_CONTENT_URI");
        eVar.m17126a(contentResolver, uri2, strArr, "relative_path like '%Lark%'", set);
        Uri uri3 = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
        Intrinsics.checkExpressionValueIsNotNull(uri3, "MediaStore.Video.Media.EXTERNAL_CONTENT_URI");
        eVar.m17126a(contentResolver, uri3, strArr, "relative_path like '%Lark%'", set);
        File file = new File(FileUtils.f12473a.mo16112e(context));
        if ((file.exists() && file.isDirectory()) && (listFiles = file.listFiles()) != null) {
            for (File file2 : listFiles) {
                FileEntryUtils eVar2 = f12471a;
                Intrinsics.checkExpressionValueIsNotNull(file2, "it");
                eVar2.mo16097a(file2, context, set);
            }
        }
    }

    @JvmStatic
    /* renamed from: a */
    public static final boolean m17130a(BaseFileEntry baseFileEntry, Context context) {
        Intrinsics.checkParameterIsNotNull(baseFileEntry, "$this$isExist");
        Intrinsics.checkParameterIsNotNull(context, "context");
        if (!TextUtils.isEmpty(baseFileEntry.path())) {
            return new File(baseFileEntry.path()).exists();
        }
        Uri uri = baseFileEntry.getUri();
        Intrinsics.checkExpressionValueIsNotNull(uri, "uri");
        return LarkUriUtil.m95311g(context, uri);
    }

    /* renamed from: b */
    private final void m17131b(File file, Context context, Set<FileEntry> set) {
        FileEntry fileEntry = new FileEntry();
        String name = file.getName();
        Intrinsics.checkExpressionValueIsNotNull(name, "name");
        if (!StringsKt.endsWith$default(name, ".cache", false, 2, (Object) null) && !StringsKt.endsWith$default(name, ".larkcache", false, 2, (Object) null)) {
            fileEntry.setName(name);
            fileEntry.setUri(FileProviderUtils.f12472a.mo16099a(context, file));
            fileEntry.setSize(FileUtils.f12473a.mo16102a(file));
            if (StringsKt.endsWith$default(name, ".apk", false, 2, (Object) null)) {
                ApkUtil aVar = ApkUtil.f12468a;
                String path = file.getPath();
                Intrinsics.checkExpressionValueIsNotNull(path, "path");
                fileEntry.setApkIcon(aVar.mo16094a(path, context));
            }
            fileEntry.setLastModifyTime(file.lastModified());
            set.add(fileEntry);
        }
    }

    /* renamed from: a */
    private final void m17128a(Cursor cursor, Uri uri, Set<FileEntry> set) {
        Uri withAppendedId = ContentUris.withAppendedId(uri, cursor.getLong(cursor.getColumnIndex("_id")));
        Intrinsics.checkExpressionValueIsNotNull(withAppendedId, "ContentUris.withAppended…nIndex(BaseColumns._ID)))");
        String a = LarkUriUtil.m95301a(cursor);
        if (a != null) {
            long b = LarkUriUtil.m95303b(cursor);
            long c = LarkUriUtil.m95304c(cursor);
            String d = LarkUriUtil.m95307d(cursor);
            if (!StringsKt.endsWith$default(a, ".cache", false, 2, (Object) null) && !StringsKt.endsWith$default(a, ".larkcache", false, 2, (Object) null)) {
                FileEntry fileEntry = new FileEntry();
                fileEntry.setName(a);
                fileEntry.setUri(withAppendedId);
                fileEntry.setSize(b);
                fileEntry.setLastModifyTime(c);
                fileEntry.setPath(d);
                set.add(fileEntry);
            }
        }
    }

    /* renamed from: a */
    public final void mo16097a(File file, Context context, Set<FileEntry> set) {
        List<File> h;
        Intrinsics.checkParameterIsNotNull(file, "$this$toFileEntryInner");
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(set, "set");
        if (file.exists()) {
            if (file.isFile()) {
                m17131b(file, context, set);
                return;
            }
            File[] listFiles = file.listFiles();
            if (!(listFiles == null || (h = C69043h.m265783h(listFiles)) == null)) {
                for (File file2 : h) {
                    f12471a.mo16097a(file2, context, set);
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0030, code lost:
        r9 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0031, code lost:
        kotlin.io.C69101b.m265907a(r7, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0034, code lost:
        throw r9;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m17126a(android.content.ContentResolver r7, android.net.Uri r8, java.lang.String[] r9, java.lang.String r10, java.util.Set<com.bytedance.ee.android.file.picker.lib.media.FileEntry> r11) {
        /*
            r6 = this;
            r4 = 0
            r5 = 0
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            android.database.Cursor r7 = r0.query(r1, r2, r3, r4, r5)
            if (r7 == 0) goto L_0x0035
            java.io.Closeable r7 = (java.io.Closeable) r7
            r9 = 0
            java.lang.Throwable r9 = (java.lang.Throwable) r9
            r10 = r7
            android.database.Cursor r10 = (android.database.Cursor) r10     // Catch:{ all -> 0x002e }
            r10.moveToFirst()     // Catch:{ all -> 0x002e }
        L_0x0017:
            boolean r0 = r10.moveToNext()     // Catch:{ all -> 0x002e }
            if (r0 == 0) goto L_0x0028
            com.bytedance.ee.android.file.picker.lib.utils.e r0 = com.bytedance.ee.android.file.picker.lib.utils.FileEntryUtils.f12471a     // Catch:{ all -> 0x002e }
            java.lang.String r1 = "cursor"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r10, r1)     // Catch:{ all -> 0x002e }
            r0.m17128a(r10, r8, r11)     // Catch:{ all -> 0x002e }
            goto L_0x0017
        L_0x0028:
            kotlin.Unit r8 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x002e }
            kotlin.io.C69101b.m265907a(r7, r9)
            goto L_0x0035
        L_0x002e:
            r8 = move-exception
            throw r8     // Catch:{ all -> 0x0030 }
        L_0x0030:
            r9 = move-exception
            kotlin.io.C69101b.m265907a(r7, r8)
            throw r9
        L_0x0035:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.android.file.picker.lib.utils.FileEntryUtils.m17126a(android.content.ContentResolver, android.net.Uri, java.lang.String[], java.lang.String, java.util.Set):void");
    }
}
