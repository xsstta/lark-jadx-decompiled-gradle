package com.ss.android.lark.widget.photo_picker_impl.model;

import android.content.Context;
import android.database.Cursor;
import android.os.Bundle;
import androidx.loader.content.C1197b;
import androidx.loader.content.C1198c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u001fB/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\u0006\u0010\u0017\u001a\u00020\u00072\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J \u0010\u001a\u001a\u00020\u001b2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\b\u0010\u001d\u001a\u0004\u0018\u00010\u0016H\u0016J\u0016\u0010\u001e\u001a\u00020\u001b2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H\u0016R\u001c\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u000eX\u0004¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0012\u001a\n \u0013*\u0004\u0018\u00010\u00030\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lcom/ss/android/lark/widget/photo_picker_impl/model/PhotoDataLoaderCallback;", "Lcom/ss/android/lark/widget/photo_picker_impl/model/BaseLoaderCallback;", "context", "Landroid/content/Context;", "photoDir", "", "mediaType", "", "showGif", "", "cusorCallback", "Lcom/ss/android/lark/widget/photo_picker_impl/model/PhotoDataLoaderCallback$ICursorCallback;", "(Landroid/content/Context;Ljava/lang/String;IZLcom/ss/android/lark/widget/photo_picker_impl/model/PhotoDataLoaderCallback$ICursorCallback;)V", "PROJECTION", "", "getPROJECTION", "()[Ljava/lang/String;", "[Ljava/lang/String;", "mAppContext", "kotlin.jvm.PlatformType", "onCreateLoader", "Landroidx/loader/content/Loader;", "Landroid/database/Cursor;", "id", "args", "Landroid/os/Bundle;", "onLoadFinished", "", "loader", "cursor", "onLoaderReset", "ICursorCallback", "photo-picker-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.widget.photo_picker_impl.model.d */
public final class PhotoDataLoaderCallback extends BaseLoaderCallback {

    /* renamed from: a */
    private final Context f145844a;

    /* renamed from: b */
    private final String[] f145845b = {"_id", "_data", "mime_type", "width", "height", "bucket_id", "bucket_display_name", "date_added", "_size", "duration"};

    /* renamed from: c */
    private final String f145846c;

    /* renamed from: d */
    private final int f145847d;

    /* renamed from: e */
    private final boolean f145848e;

    /* renamed from: f */
    private final ICursorCallback f145849f;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/widget/photo_picker_impl/model/PhotoDataLoaderCallback$ICursorCallback;", "", "onCreateCursor", "", "cursor", "Landroid/database/Cursor;", "photo-picker-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.widget.photo_picker_impl.model.d$a */
    public interface ICursorCallback {
        /* renamed from: a */
        void mo199754a(Cursor cursor);
    }

    @Override // androidx.loader.p045a.AbstractC1181a.AbstractC1182a
    /* renamed from: a */
    public void mo6054a(C1198c<Cursor> cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "loader");
    }

    /* renamed from: a */
    public void mo6055a(C1198c<Cursor> cVar, Cursor cursor) {
        Intrinsics.checkParameterIsNotNull(cVar, "loader");
        if (cursor != null && !cursor.isClosed()) {
            cursor.moveToFirst();
        }
        this.f145849f.mo199754a(cursor);
    }

    @Override // androidx.loader.p045a.AbstractC1181a.AbstractC1182a
    /* renamed from: a */
    public C1198c<Cursor> mo6053a(int i, Bundle bundle) {
        String str;
        String[] strArr;
        int i2 = this.f145847d;
        if (i2 == 2 || i2 == 3) {
            str = mo199741a(mo199740a(0, 0), this.f145848e);
            strArr = mo199743c();
        } else if (i2 == 1) {
            str = mo199741a(mo199740a(0, 0), this.f145848e);
            strArr = new String[]{String.valueOf(3)};
        } else {
            if (this.f145848e) {
                str = mo199744d();
            } else {
                str = mo199745e();
            }
            strArr = new String[]{String.valueOf(1)};
        }
        if (this.f145846c != null) {
            str = str + " AND bucket_display_name='" + this.f145846c + "'";
        }
        return new C1197b(this.f145844a, mo199739a(), this.f145845b, str, strArr, mo199742b());
    }

    public PhotoDataLoaderCallback(Context context, String str, int i, boolean z, ICursorCallback aVar) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(aVar, "cusorCallback");
        this.f145846c = str;
        this.f145847d = i;
        this.f145848e = z;
        this.f145849f = aVar;
        this.f145844a = context.getApplicationContext();
    }
}
