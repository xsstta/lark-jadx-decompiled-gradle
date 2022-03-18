package com.larksuite.framework.utils;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import com.huawei.hms.actions.SearchIntents;
import com.ss.android.lark.log.Log;
import java.io.File;
import kotlin.Metadata;
import kotlin.io.C69104g;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001/B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\f\u0010\u0016\u001a\u00020\u0017*\u00020\nH\u0002J\u0016\u0010\u0018\u001a\u0004\u0018\u00010\u0019*\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\u0016\u0010\u001d\u001a\u0004\u0018\u00010\n*\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\u000e\u0010\u001e\u001a\u0004\u0018\u00010\u0006*\u00020\nH\u0007J\u0016\u0010\u001f\u001a\u0004\u0018\u00010\u0006*\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0007J\u000e\u0010\u001f\u001a\u0004\u0018\u00010\u0006*\u00020\nH\u0007J\"\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\f\u0018\u00010!*\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0007J\u001c\u0010\"\u001a\u00020\f*\u00020\u001a2\u0006\u0010#\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u001cH\u0007J\u0014\u0010\"\u001a\u00020\f*\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0007J\f\u0010\"\u001a\u00020\f*\u00020\nH\u0007J\u0014\u0010$\u001a\u00020\f*\u00020%2\u0006\u0010\u001b\u001a\u00020\u001cH\u0007J\u0014\u0010$\u001a\u00020\f*\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0007J\u001b\u0010&\u001a\u0004\u0018\u00010\f*\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0007¢\u0006\u0002\u0010'J\f\u0010&\u001a\u00020\f*\u00020\nH\u0007J\u0016\u0010(\u001a\u0004\u0018\u00010\u0006*\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0007J\u0014\u0010)\u001a\u00020**\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0007J\u0014\u0010+\u001a\u00020**\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0007J/\u0010,\u001a\u0004\u0018\u0001H-\"\u0004\b\u0000\u0010-*\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\f\u0010,\u001a\b\u0012\u0004\u0012\u0002H-0\u0012H\u0002¢\u0006\u0002\u0010.R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\"\u0010\b\u001a\u0016\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f0\tX\u0004¢\u0006\u0002\n\u0000R\"\u0010\r\u001a\u0016\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00060\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u0018\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00128\u0006X\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00128\u0006X\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u00128\u0006X\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u00128\u0006X\u0004¢\u0006\u0002\n\u0000¨\u00060"}, d2 = {"Lcom/larksuite/framework/utils/LarkUriUtil;", "", "()V", "CIPHER_FILE_HEADER", "", "DATA", "", "DISPLAY_NAME", "GET_LONG", "Lkotlin/Function2;", "Landroid/database/Cursor;", "", "", "GET_STRING", "LAST_MODIFY", "SIZE", "TAG", "queryData", "Lcom/larksuite/framework/utils/LarkUriUtil$Query;", "queryDisplayName", "queryLastModified", "querySize", "closeQuiet", "", "convertUriToFile", "Ljava/io/File;", "Landroid/content/Context;", "uri", "Landroid/net/Uri;", "getCursor", "getPathData", "getUriFileName", "getUriFileNameAndSize", "Lkotlin/Pair;", "getUriFileSize", "cursor", "getUriFileSizeByFD", "Landroid/content/ContentResolver;", "getUriLastModified", "(Landroid/content/Context;Landroid/net/Uri;)Ljava/lang/Long;", "getUriMimeType", "isUriCipherFile", "", "isUriOpenable", SearchIntents.EXTRA_QUERY, "T", "(Landroid/content/Context;Landroid/net/Uri;Lcom/larksuite/framework/utils/LarkUriUtil$Query;)Ljava/lang/Object;", "Query", "utils_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.larksuite.framework.utils.r */
public final class LarkUriUtil {

    /* renamed from: a */
    public static final Query<String> f64951a;

    /* renamed from: b */
    public static final Query<Long> f64952b;

    /* renamed from: c */
    public static final Query<Long> f64953c;

    /* renamed from: d */
    public static final Query<String> f64954d;

    /* renamed from: e */
    public static final LarkUriUtil f64955e = new LarkUriUtil();

    /* renamed from: f */
    private static final byte[] f64956f = {5, 69, 69, 83, 0, 0, 0, 0};

    /* renamed from: g */
    private static final Function2<Cursor, Integer, String> f64957g;

    /* renamed from: h */
    private static final Function2<Cursor, Integer, Long> f64958h;

    private LarkUriUtil() {
    }

    static {
        C26316b bVar = C26316b.INSTANCE;
        f64957g = bVar;
        C26315a aVar = C26315a.INSTANCE;
        f64958h = aVar;
        f64951a = new Query<>("_display_name", bVar, null, 4, null);
        f64952b = new Query<>("_size", aVar, null, 4, null);
        f64953c = new Query<>("date_modified", aVar, null, 4, null);
        f64954d = new Query<>("_data", bVar, null, 4, null);
    }

    /* renamed from: e */
    private final void m95309e(Cursor cursor) {
        try {
            cursor.close();
        } catch (Exception unused) {
        }
    }

    @JvmStatic
    /* renamed from: d */
    public static final String m95307d(Cursor cursor) {
        Intrinsics.checkParameterIsNotNull(cursor, "$this$getPathData");
        return f64954d.mo93438a(cursor);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B1\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0018\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004¢\u0006\u0002\u0010\nJ\t\u0010\u0010\u001a\u00020\u0004HÆ\u0003J\u001b\u0010\u0011\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00028\u00000\u0006HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0004HÆ\u0003J?\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\u001a\b\u0002\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00028\u00000\u00062\b\b\u0002\u0010\t\u001a\u00020\u0004HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÖ\u0003J\u0015\u0010\u000e\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0017\u001a\u00020\u0007¢\u0006\u0002\u0010\u0018J\t\u0010\u0019\u001a\u00020\bHÖ\u0001J\t\u0010\u001a\u001a\u00020\u0004HÖ\u0001R\u0011\u0010\t\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR#\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lcom/larksuite/framework/utils/LarkUriUtil$Query;", "T", "", "projection", "", "result", "Lkotlin/Function2;", "Landroid/database/Cursor;", "", "column", "(Ljava/lang/String;Lkotlin/jvm/functions/Function2;Ljava/lang/String;)V", "getColumn", "()Ljava/lang/String;", "getProjection", "getResult", "()Lkotlin/jvm/functions/Function2;", "component1", "component2", "component3", "copy", "equals", "", "other", "cursor", "(Landroid/database/Cursor;)Ljava/lang/Object;", "hashCode", "toString", "utils_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.larksuite.framework.utils.r$c */
    public static final class Query<T> {

        /* renamed from: a */
        private final String f64959a;

        /* renamed from: b */
        private final Function2<Cursor, Integer, T> f64960b;

        /* renamed from: c */
        private final String f64961c;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Query)) {
                return false;
            }
            Query cVar = (Query) obj;
            return Intrinsics.areEqual(this.f64959a, cVar.f64959a) && Intrinsics.areEqual(this.f64960b, cVar.f64960b) && Intrinsics.areEqual(this.f64961c, cVar.f64961c);
        }

        public int hashCode() {
            String str = this.f64959a;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            Function2<Cursor, Integer, T> kVar = this.f64960b;
            int hashCode2 = (hashCode + (kVar != null ? kVar.hashCode() : 0)) * 31;
            String str2 = this.f64961c;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return hashCode2 + i;
        }

        public String toString() {
            return "Query(projection=" + this.f64959a + ", result=" + this.f64960b + ", column=" + this.f64961c + ")";
        }

        /* renamed from: a */
        public final T mo93438a(Cursor cursor) {
            Intrinsics.checkParameterIsNotNull(cursor, "cursor");
            int columnIndex = cursor.getColumnIndex(this.f64961c);
            if (columnIndex < 0 || cursor.isNull(columnIndex)) {
                return null;
            }
            return this.f64960b.invoke(cursor, Integer.valueOf(columnIndex));
        }

        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.k<? super android.database.Cursor, ? super java.lang.Integer, ? extends T> */
        /* JADX WARN: Multi-variable type inference failed */
        public Query(String str, Function2<? super Cursor, ? super Integer, ? extends T> kVar, String str2) {
            Intrinsics.checkParameterIsNotNull(str, "projection");
            Intrinsics.checkParameterIsNotNull(kVar, "result");
            Intrinsics.checkParameterIsNotNull(str2, "column");
            this.f64959a = str;
            this.f64960b = kVar;
            this.f64961c = str2;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Query(String str, Function2 kVar, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, kVar, (i & 4) != 0 ? str : str2);
        }
    }

    @JvmStatic
    /* renamed from: b */
    public static final long m95303b(Cursor cursor) {
        Intrinsics.checkParameterIsNotNull(cursor, "$this$getUriFileSize");
        Long a = f64952b.mo93438a(cursor);
        if (a != null) {
            return a.longValue();
        }
        return 0;
    }

    @JvmStatic
    /* renamed from: c */
    public static final long m95304c(Cursor cursor) {
        Intrinsics.checkParameterIsNotNull(cursor, "$this$getUriLastModified");
        Long a = f64953c.mo93438a(cursor);
        if (a != null) {
            return a.longValue();
        }
        return 0;
    }

    @JvmStatic
    /* renamed from: a */
    public static final String m95301a(Cursor cursor) {
        Intrinsics.checkParameterIsNotNull(cursor, "$this$getUriFileName");
        String a = f64951a.mo93438a(cursor);
        if (a != null) {
            return a;
        }
        String a2 = f64954d.mo93438a(cursor);
        if (a2 != null) {
            return new File(a2).getName();
        }
        return null;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "cursor", "Landroid/database/Cursor;", "i", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.larksuite.framework.utils.r$a */
    static final class C26315a extends Lambda implements Function2<Cursor, Integer, Long> {
        public static final C26315a INSTANCE = new C26315a();

        C26315a() {
            super(2);
        }

        public final long invoke(Cursor cursor, int i) {
            Intrinsics.checkParameterIsNotNull(cursor, "cursor");
            return cursor.getLong(i);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public /* synthetic */ Long invoke(Cursor cursor, Integer num) {
            return Long.valueOf(invoke(cursor, num.intValue()));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "cursor", "Landroid/database/Cursor;", "i", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.larksuite.framework.utils.r$b */
    static final class C26316b extends Lambda implements Function2<Cursor, Integer, String> {
        public static final C26316b INSTANCE = new C26316b();

        C26316b() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public /* synthetic */ String invoke(Cursor cursor, Integer num) {
            return invoke(cursor, num.intValue());
        }

        public final String invoke(Cursor cursor, int i) {
            Intrinsics.checkParameterIsNotNull(cursor, "cursor");
            return cursor.getString(i);
        }
    }

    @JvmStatic
    /* renamed from: b */
    public static final long m95302b(Context context, Uri uri) {
        Long l;
        Intrinsics.checkParameterIsNotNull(context, "$this$getUriFileSize");
        Intrinsics.checkParameterIsNotNull(uri, "uri");
        LarkUriUtil rVar = f64955e;
        Cursor i = rVar.m95313i(context, uri);
        if (i != null) {
            l = Long.valueOf(m95303b(i));
        } else {
            l = null;
        }
        if (i != null) {
            rVar.m95309e(i);
        }
        if (l != null) {
            return l.longValue();
        }
        File j = rVar.m95314j(context, uri);
        if (j != null) {
            return j.length();
        }
        Log.m165383e("LarkUriUtil", "failed to get file size from uri");
        return 0;
    }

    @JvmStatic
    /* renamed from: c */
    public static final Long m95305c(Context context, Uri uri) {
        Intrinsics.checkParameterIsNotNull(context, "$this$getUriLastModified");
        Intrinsics.checkParameterIsNotNull(uri, "uri");
        LarkUriUtil rVar = f64955e;
        Long l = (Long) rVar.m95299a(context, uri, f64953c);
        if (l != null) {
            return l;
        }
        File j = rVar.m95314j(context, uri);
        if (j != null) {
            return Long.valueOf(j.lastModified());
        }
        Log.m165383e("LarkUriUtil", "failed to get file last modified from uri");
        return null;
    }

    @JvmStatic
    /* renamed from: d */
    public static final long m95306d(Context context, Uri uri) {
        Long l;
        Intrinsics.checkParameterIsNotNull(context, "$this$getUriFileSizeByFD");
        Intrinsics.checkParameterIsNotNull(uri, "uri");
        ContentResolver contentResolver = context.getContentResolver();
        if (contentResolver != null) {
            l = Long.valueOf(m95297a(contentResolver, uri));
        } else {
            l = null;
        }
        if (l != null) {
            return l.longValue();
        }
        File j = f64955e.m95314j(context, uri);
        if (j != null) {
            return j.length();
        }
        Log.m165383e("LarkUriUtil", "");
        return 0;
    }

    @JvmStatic
    /* renamed from: f */
    public static final String m95310f(Context context, Uri uri) {
        Intrinsics.checkParameterIsNotNull(context, "$this$getUriMimeType");
        Intrinsics.checkParameterIsNotNull(uri, "uri");
        String type = context.getContentResolver().getType(uri);
        if (type != null && !Intrinsics.areEqual(type, "*/*")) {
            return type;
        }
        File j = f64955e.m95314j(context, uri);
        if (j != null) {
            return C26311p.m95280b(C69104g.m265935d(j));
        }
        return "*/*";
    }

    /* renamed from: j */
    private final File m95314j(Context context, Uri uri) {
        File a = UriCompatUtil.m95042a(context, uri, false, 4, null);
        if (a != null) {
            try {
                if (a.exists()) {
                    return a;
                }
            } catch (Exception e) {
                Log.m165383e("LarkUriUtil", e.getMessage());
            }
        }
        Log.m165383e("LarkUriUtil", "Failed to convert uri: " + uri + " to file, or file does not exists");
        return null;
    }

    @JvmStatic
    /* renamed from: a */
    public static final String m95300a(Context context, Uri uri) {
        String str;
        Intrinsics.checkParameterIsNotNull(context, "$this$getUriFileName");
        Intrinsics.checkParameterIsNotNull(uri, "uri");
        LarkUriUtil rVar = f64955e;
        Cursor i = rVar.m95313i(context, uri);
        if (i != null) {
            str = m95301a(i);
        } else {
            str = null;
        }
        if (i != null) {
            rVar.m95309e(i);
        }
        if (str != null) {
            return str;
        }
        File j = rVar.m95314j(context, uri);
        if (j != null) {
            return j.getName();
        }
        Log.m165383e("LarkUriUtil", "failed to get filename from uri");
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003f, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0040, code lost:
        kotlin.io.C69101b.m265907a(r0, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0043, code lost:
        throw r6;
     */
    @kotlin.jvm.JvmStatic
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final kotlin.Pair<java.lang.String, java.lang.Long> m95308e(android.content.Context r5, android.net.Uri r6) {
        /*
            java.lang.String r0 = "$this$getUriFileNameAndSize"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r5, r0)
            java.lang.String r0 = "uri"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r6, r0)
            com.larksuite.framework.utils.r r0 = com.larksuite.framework.utils.LarkUriUtil.f64955e
            android.database.Cursor r0 = r0.m95313i(r5, r6)
            r1 = 0
            if (r0 == 0) goto L_0x0044
            java.io.Closeable r0 = (java.io.Closeable) r0
            r2 = r1
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            r3 = r0
            android.database.Cursor r3 = (android.database.Cursor) r3     // Catch:{ all -> 0x003d }
            boolean r4 = r3.moveToFirst()     // Catch:{ all -> 0x003d }
            if (r4 == 0) goto L_0x0037
            java.lang.String r4 = m95301a(r3)     // Catch:{ all -> 0x003d }
            if (r4 == 0) goto L_0x0037
            long r5 = m95303b(r3)     // Catch:{ all -> 0x003d }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x003d }
            kotlin.Pair r5 = kotlin.TuplesKt.to(r4, r5)     // Catch:{ all -> 0x003d }
            kotlin.io.C69101b.m265907a(r0, r2)
            return r5
        L_0x0037:
            kotlin.Unit r3 = kotlin.Unit.INSTANCE
            kotlin.io.C69101b.m265907a(r0, r2)
            goto L_0x0044
        L_0x003d:
            r5 = move-exception
            throw r5     // Catch:{ all -> 0x003f }
        L_0x003f:
            r6 = move-exception
            kotlin.io.C69101b.m265907a(r0, r5)
            throw r6
        L_0x0044:
            java.lang.String r0 = m95300a(r5, r6)
            long r5 = m95302b(r5, r6)
            if (r0 == 0) goto L_0x0057
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            kotlin.Pair r5 = kotlin.TuplesKt.to(r0, r5)
            return r5
        L_0x0057:
            java.lang.String r5 = "LarkUriUtil"
            java.lang.String r6 = "failed to get filename and size"
            com.ss.android.lark.log.Log.m165383e(r5, r6)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.larksuite.framework.utils.LarkUriUtil.m95308e(android.content.Context, android.net.Uri):kotlin.Pair");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0025, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0026, code lost:
        kotlin.io.C69101b.m265907a(r0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0029, code lost:
        throw r3;
     */
    @kotlin.jvm.JvmStatic
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean m95311g(android.content.Context r2, android.net.Uri r3) {
        /*
            java.lang.String r0 = "$this$isUriOpenable"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r2, r0)
            java.lang.String r0 = "uri"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r3, r0)
            android.content.ContentResolver r0 = r2.getContentResolver()     // Catch:{ Exception -> 0x0033 }
            java.lang.String r1 = "r"
            android.content.res.AssetFileDescriptor r0 = r0.openAssetFileDescriptor(r3, r1)     // Catch:{ Exception -> 0x0033 }
            r1 = 1
            if (r0 == 0) goto L_0x002a
            java.io.Closeable r0 = (java.io.Closeable) r0     // Catch:{ Exception -> 0x0033 }
            r2 = 0
            java.lang.Throwable r2 = (java.lang.Throwable) r2     // Catch:{ Exception -> 0x0033 }
            r3 = r0
            android.content.res.AssetFileDescriptor r3 = (android.content.res.AssetFileDescriptor) r3     // Catch:{ all -> 0x0023 }
            kotlin.io.C69101b.m265907a(r0, r2)
            return r1
        L_0x0023:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x0025 }
        L_0x0025:
            r3 = move-exception
            kotlin.io.C69101b.m265907a(r0, r2)
            throw r3
        L_0x002a:
            com.larksuite.framework.utils.r r0 = com.larksuite.framework.utils.LarkUriUtil.f64955e
            java.io.File r2 = r0.m95314j(r2, r3)
            if (r2 == 0) goto L_0x0047
            return r1
        L_0x0033:
            r2 = move-exception
            boolean r3 = r2 instanceof java.io.FileNotFoundException
            if (r3 == 0) goto L_0x0039
            goto L_0x0047
        L_0x0039:
            boolean r3 = r2 instanceof java.lang.SecurityException
            if (r3 == 0) goto L_0x003e
            goto L_0x0047
        L_0x003e:
            java.lang.String r2 = r2.getMessage()
            java.lang.String r3 = "LarkUriUtil"
            com.ss.android.lark.log.Log.m165383e(r3, r2)
        L_0x0047:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.larksuite.framework.utils.LarkUriUtil.m95311g(android.content.Context, android.net.Uri):boolean");
    }

    /* renamed from: i */
    private final Cursor m95313i(Context context, Uri uri) {
        try {
            Cursor query = context.getContentResolver().query(uri, null, null, null, null);
            if (query == null) {
                Log.m165397w("LarkUriUtil", "failed to get cursor for uri: " + uri);
                return null;
            } else if (query.moveToFirst()) {
                return query;
            } else {
                try {
                    query.close();
                } catch (Exception unused) {
                }
                Log.m165397w("LarkUriUtil", "cannot move cursor to first for uri: " + uri);
                return null;
            }
        } catch (Exception e) {
            if (!(e instanceof IllegalArgumentException) && !(e instanceof SecurityException) && !(e instanceof UnsupportedOperationException)) {
                Log.m165383e("LarkUriUtil", "unknown exception: " + e);
            } else {
                Log.m165397w("LarkUriUtil", e + " caught");
            }
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0044, code lost:
        r9 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0045, code lost:
        kotlin.io.C69101b.m265907a(r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0048, code lost:
        throw r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0080, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0081, code lost:
        kotlin.io.C69101b.m265907a(r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0084, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00af, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00b0, code lost:
        kotlin.io.C69101b.m265907a(r12, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00b3, code lost:
        throw r1;
     */
    @kotlin.jvm.JvmStatic
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final long m95297a(android.content.ContentResolver r12, android.net.Uri r13) {
        /*
        // Method dump skipped, instructions count: 201
        */
        throw new UnsupportedOperationException("Method not decompiled: com.larksuite.framework.utils.LarkUriUtil.m95297a(android.content.ContentResolver, android.net.Uri):long");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0031, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0032, code lost:
        kotlin.io.C69101b.m265907a(r1, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0035, code lost:
        throw r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x006f, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0070, code lost:
        kotlin.io.C69101b.m265907a(r6, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0073, code lost:
        throw r1;
     */
    @kotlin.jvm.JvmStatic
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean m95312h(android.content.Context r5, android.net.Uri r6) {
        /*
        // Method dump skipped, instructions count: 129
        */
        throw new UnsupportedOperationException("Method not decompiled: com.larksuite.framework.utils.LarkUriUtil.m95312h(android.content.Context, android.net.Uri):boolean");
    }

    @JvmStatic
    /* renamed from: a */
    public static final long m95298a(Context context, Cursor cursor, Uri uri) {
        Intrinsics.checkParameterIsNotNull(context, "$this$getUriFileSize");
        Intrinsics.checkParameterIsNotNull(cursor, "cursor");
        Intrinsics.checkParameterIsNotNull(uri, "uri");
        long b = m95303b(cursor);
        if (b == 0) {
            return m95306d(context, uri);
        }
        return b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0033, code lost:
        r9 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0034, code lost:
        kotlin.io.C69101b.m265907a(r7, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0037, code lost:
        throw r9;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final <T> T m95299a(android.content.Context r7, android.net.Uri r8, com.larksuite.framework.utils.LarkUriUtil.Query<T> r9) {
        /*
            r6 = this;
            android.content.ContentResolver r0 = r7.getContentResolver()
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r1 = r8
            android.database.Cursor r7 = r0.query(r1, r2, r3, r4, r5)
            r8 = 0
            if (r7 == 0) goto L_0x0038
            java.io.Closeable r7 = (java.io.Closeable) r7
            r0 = r8
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            r1 = r7
            android.database.Cursor r1 = (android.database.Cursor) r1     // Catch:{ all -> 0x0031 }
            boolean r2 = r1.moveToFirst()     // Catch:{ all -> 0x0031 }
            if (r2 == 0) goto L_0x002b
            java.lang.String r8 = "it"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r8)     // Catch:{ all -> 0x0031 }
            java.lang.Object r8 = r9.mo93438a(r1)     // Catch:{ all -> 0x0031 }
            kotlin.io.C69101b.m265907a(r7, r0)
            return r8
        L_0x002b:
            kotlin.Unit r9 = kotlin.Unit.INSTANCE
            kotlin.io.C69101b.m265907a(r7, r0)
            goto L_0x0038
        L_0x0031:
            r8 = move-exception
            throw r8     // Catch:{ all -> 0x0033 }
        L_0x0033:
            r9 = move-exception
            kotlin.io.C69101b.m265907a(r7, r8)
            throw r9
        L_0x0038:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.larksuite.framework.utils.LarkUriUtil.m95299a(android.content.Context, android.net.Uri, com.larksuite.framework.utils.r$c):java.lang.Object");
    }
}
