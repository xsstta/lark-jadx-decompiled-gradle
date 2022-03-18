package com.ss.android.lark.mediarecorder.p2245c;

import android.content.Context;
import android.database.Cursor;
import android.os.SystemClock;
import com.ss.android.lark.mediarecorder.entity.Media;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u001a\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u001a\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0002¨\u0006\u0007"}, d2 = {"getMediaInfo", "Lcom/ss/android/lark/mediarecorder/entity/Media;", "context", "Landroid/content/Context;", "path", "", "getMediaInfoInner", "mediarecorder_release"}, mo238835k = 2, mv = {1, 1, 13})
/* renamed from: com.ss.android.lark.mediarecorder.c.f */
public final class C44793f {

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"condition", "", "invoke"}, mo238835k = 3, mv = {1, 1, 13})
    /* renamed from: com.ss.android.lark.mediarecorder.c.f$b */
    public static final class C44795b extends Lambda implements Function0<String> {
        public static final C44795b INSTANCE = new C44795b();

        C44795b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "media_type=? AND _size>0 AND _data=?";
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"getIndex", "", "cursor", "Landroid/database/Cursor;", "id", "", "invoke"}, mo238835k = 3, mv = {1, 1, 13})
    /* renamed from: com.ss.android.lark.mediarecorder.c.f$a */
    public static final class C44794a extends Lambda implements Function2<Cursor, String, Integer> {
        public static final C44794a INSTANCE = new C44794a();

        C44794a() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public /* synthetic */ Integer invoke(Cursor cursor, String str) {
            return Integer.valueOf(invoke(cursor, str));
        }

        public final int invoke(Cursor cursor, String str) {
            Intrinsics.checkParameterIsNotNull(cursor, "cursor");
            Intrinsics.checkParameterIsNotNull(str, "id");
            return cursor.getColumnIndexOrThrow(str);
        }
    }

    /* renamed from: a */
    public static final Media m177632a(Context context, String str) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        if (str == null) {
            return null;
        }
        Media b = m177633b(context, str);
        if (b == null) {
            C44792e.m177629a(context, str);
        }
        int i = 0;
        while (b == null && i < 15) {
            SystemClock.sleep(200);
            b = m177633b(context, str);
            i++;
        }
        return b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x00ce, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x00cf, code lost:
        kotlin.io.C69101b.m265907a(r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x00d3, code lost:
        throw r0;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final com.ss.android.lark.mediarecorder.entity.Media m177633b(android.content.Context r17, java.lang.String r18) {
        /*
        // Method dump skipped, instructions count: 212
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.mediarecorder.p2245c.C44793f.m177633b(android.content.Context, java.lang.String):com.ss.android.lark.mediarecorder.entity.Media");
    }
}
