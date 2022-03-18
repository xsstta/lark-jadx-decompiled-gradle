package com.ss.android.lark.widget.photo_picker_impl.model;

import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import androidx.loader.p045a.AbstractC1181a;
import com.huawei.hms.framework.common.ContainerUtils;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\b&\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0018\u0010!\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020\u00192\u0006\u0010#\u001a\u00020\u0019H\u0004J\u0018\u0010$\u001a\u00020\u00052\u0006\u0010%\u001a\u00020\u00052\u0006\u0010&\u001a\u00020'H\u0004R\u0014\u0010\u0004\u001a\u00020\u0005XD¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u0005XD¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u001c\u0010\n\u001a\n \f*\u0004\u0018\u00010\u000b0\u000bX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u0005XD¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0007R\u001c\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u0012X\u0004¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u0005XD¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0007R\u001a\u0010\u0018\u001a\u00020\u0019X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001e\u001a\u00020\u0019X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u001b\"\u0004\b \u0010\u001d¨\u0006("}, d2 = {"Lcom/ss/android/lark/widget/photo_picker_impl/model/BaseLoaderCallback;", "Landroidx/loader/app/LoaderManager$LoaderCallbacks;", "Landroid/database/Cursor;", "()V", "NOT_GIF", "", "getNOT_GIF", "()Ljava/lang/String;", "ORDER_BY", "getORDER_BY", "QUERY_URI", "Landroid/net/Uri;", "kotlin.jvm.PlatformType", "getQUERY_URI", "()Landroid/net/Uri;", "SELECTION", "getSELECTION", "SELECTION_ALL_ARGS", "", "getSELECTION_ALL_ARGS", "()[Ljava/lang/String;", "[Ljava/lang/String;", "SELECTION_NOT_GIF", "getSELECTION_NOT_GIF", "videoMaxS", "", "getVideoMaxS", "()J", "setVideoMaxS", "(J)V", "videoMinS", "getVideoMinS", "setVideoMinS", "getDurationSelection", "exMaxLimit", "exMinLimit", "getSelectionArgsForAllMediaCondition", "timeCondition", "isGif", "", "photo-picker-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.widget.photo_picker_impl.model.a */
public abstract class BaseLoaderCallback implements AbstractC1181a.AbstractC1182a<Cursor> {

    /* renamed from: a */
    private final String f145836a = "!='image/gif'";

    /* renamed from: b */
    private final Uri f145837b = MediaStore.Files.getContentUri("external");

    /* renamed from: c */
    private final String f145838c = "_id DESC";

    /* renamed from: d */
    private final String[] f145839d = {String.valueOf(1), String.valueOf(3)};

    /* renamed from: e */
    private final String f145840e = "media_type=? AND _size>0";

    /* renamed from: f */
    private final String f145841f = ("media_type=? AND _size>0 AND mime_type" + "!='image/gif'");

    /* renamed from: g */
    private long f145842g;

    /* renamed from: h */
    private long f145843h;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Uri mo199739a() {
        return this.f145837b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final String mo199742b() {
        return this.f145838c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final String[] mo199743c() {
        return this.f145839d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final String mo199744d() {
        return this.f145840e;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final String mo199745e() {
        return this.f145841f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo199740a(long j, long j2) {
        String str;
        long j3 = this.f145842g;
        if (j3 == 0) {
            j3 = Long.MAX_VALUE;
        }
        if (j != 0) {
            j3 = Math.min(j3, j);
        }
        StringBuilder sb = new StringBuilder();
        StringCompanionObject mVar = StringCompanionObject.f173215a;
        Locale locale = Locale.CHINA;
        Intrinsics.checkExpressionValueIsNotNull(locale, "Locale.CHINA");
        Object[] objArr = new Object[3];
        objArr[0] = Long.valueOf(Math.max(j2, this.f145843h));
        if (Math.max(j2, this.f145843h) == 0) {
            str = "";
        } else {
            str = ContainerUtils.KEY_VALUE_DELIMITER;
        }
        objArr[1] = str;
        objArr[2] = Long.valueOf(j3);
        String format = String.format(locale, "(%d <%s duration and duration <= %d)", Arrays.copyOf(objArr, 3));
        Intrinsics.checkExpressionValueIsNotNull(format, "java.lang.String.format(locale, format, *args)");
        sb.append("((duration is NULL) OR ");
        sb.append(format);
        sb.append(")");
        String sb2 = sb.toString();
        Intrinsics.checkExpressionValueIsNotNull(sb2, "selection.toString()");
        return sb2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo199741a(String str, boolean z) {
        String str2;
        Intrinsics.checkParameterIsNotNull(str, "timeCondition");
        StringBuilder sb = new StringBuilder();
        sb.append("(media_type=?");
        if (z) {
            str2 = "";
        } else {
            str2 = " AND mime_type" + this.f145836a;
        }
        sb.append(str2);
        sb.append(" OR ");
        sb.append("media_type=? AND ");
        sb.append(str);
        sb.append(")");
        sb.append(" AND ");
        sb.append("_size");
        sb.append(">0");
        return sb.toString();
    }
}
