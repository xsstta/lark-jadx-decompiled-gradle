package com.ss.android.lark.widget.photo_picker_impl.model;

import android.content.Context;
import android.database.Cursor;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.loader.content.C1197b;
import androidx.loader.content.C1198c;
import com.larksuite.suite.R;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.photo_picker.C58612c;
import com.ss.android.lark.widget.photo_picker_impl.base.IOnInfoUpdateCallback;
import com.ss.android.lark.widget.photo_picker_impl.base.PPLog;
import com.ss.android.lark.widget.photo_picker_impl.base.PPThreadPool;
import com.ss.android.lark.widget.photo_picker_impl.bean.PhotoDir;
import com.ss.android.lark.widget.photo_picker_impl.model.AlbumHelper;
import java.io.File;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 #2\u00020\u0001:\u0001#B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u001c\u0010\u0014\u001a\u00020\u00152\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00180\u0017H\u0002J \u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2\u0006\u0010\u001c\u001a\u00020\u00052\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J \u0010\u001f\u001a\u00020\u00152\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2\b\u0010!\u001a\u0004\u0018\u00010\u001bH\u0016J\u0016\u0010\"\u001a\u00020\u00152\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0004¢\u0006\u0004\n\u0002\u0010\u000eR\u0016\u0010\u000f\u001a\n \u0010*\u0004\u0018\u00010\u00030\u0003X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006$"}, d2 = {"Lcom/ss/android/lark/widget/photo_picker_impl/model/PhotoInfoLoaderCallback;", "Lcom/ss/android/lark/widget/photo_picker_impl/model/BaseLoaderCallback;", "context", "Landroid/content/Context;", "mediaType", "", "showGif", "", "onInfoUpdateCallback", "Lcom/ss/android/lark/widget/photo_picker_impl/base/IOnInfoUpdateCallback;", "(Landroid/content/Context;IZLcom/ss/android/lark/widget/photo_picker_impl/base/IOnInfoUpdateCallback;)V", "infoProjection", "", "", "[Ljava/lang/String;", "mAppContext", "kotlin.jvm.PlatformType", "mFuture", "Ljava/util/concurrent/Future;", "", "logDirInfo", "", "photoDirMap", "", "Lcom/ss/android/lark/widget/photo_picker_impl/bean/PhotoDir;", "onCreateLoader", "Landroidx/loader/content/Loader;", "Landroid/database/Cursor;", "id", "args", "Landroid/os/Bundle;", "onLoadFinished", "loader", "cursor", "onLoaderReset", "Companion", "photo-picker-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.widget.photo_picker_impl.model.e */
public final class PhotoInfoLoaderCallback extends BaseLoaderCallback {

    /* renamed from: c */
    public static final Companion f145850c = new Companion(null);

    /* renamed from: a */
    public final Context f145851a;

    /* renamed from: b */
    public final IOnInfoUpdateCallback f145852b;

    /* renamed from: d */
    private final Context f145853d;

    /* renamed from: e */
    private Future<Object> f145854e;

    /* renamed from: f */
    private final String[] f145855f = {"_data", "bucket_display_name"};

    /* renamed from: g */
    private final int f145856g;

    /* renamed from: h */
    private final boolean f145857h;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/widget/photo_picker_impl/model/PhotoInfoLoaderCallback$Companion;", "", "()V", "ALL", "", "TAG", "", "photo-picker-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.widget.photo_picker_impl.model.e$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.widget.photo_picker_impl.model.e$b */
    public static final class CallableC58913b<V> implements Callable<Object> {

        /* renamed from: a */
        final /* synthetic */ PhotoInfoLoaderCallback f145858a;

        /* renamed from: b */
        final /* synthetic */ Cursor f145859b;

        CallableC58913b(PhotoInfoLoaderCallback eVar, Cursor cursor) {
            this.f145858a = eVar;
            this.f145859b = cursor;
        }

        @Override // java.util.concurrent.Callable
        public /* synthetic */ Object call() {
            mo199757a();
            return Unit.INSTANCE;
        }

        /* renamed from: a */
        public final void mo199757a() {
            String str;
            PhotoDir cVar;
            PhotoDir cVar2;
            String str2;
            boolean z;
            String str3;
            boolean z2;
            String str4;
            this.f145859b.moveToFirst();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            LinkedHashMap linkedHashMap2 = linkedHashMap;
            PhotoDir cVar3 = new PhotoDir();
            String string = UIHelper.getString(R.string.Lark_Legacy_PickerAllImage);
            Intrinsics.checkExpressionValueIsNotNull(string, "UIHelper.getString(R.str…rk_Legacy_PickerAllImage)");
            cVar3.mo199611a(string);
            cVar3.mo199610a(4096);
            linkedHashMap2.put(4096, cVar3);
            if (C58612c.m227290a().mo102854b("lark.photo-picker.album_helper")) {
                List<AlbumHelper.BucketInfo> c = AlbumHelper.m228617c(this.f145858a.f145851a, false);
                Intrinsics.checkExpressionValueIsNotNull(c, "AlbumHelper.getMediaBucketList(context, false)");
                for (AlbumHelper.BucketInfo bucketInfo : c) {
                    String name = bucketInfo.getName();
                    if (linkedHashMap.containsKey(Integer.valueOf(bucketInfo.getId()))) {
                        Object obj = linkedHashMap.get(Integer.valueOf(bucketInfo.getId()));
                        if (obj == null) {
                            Intrinsics.throwNpe();
                        }
                        cVar2 = (PhotoDir) obj;
                    } else {
                        cVar2 = new PhotoDir();
                        linkedHashMap2.put(Integer.valueOf(bucketInfo.getId()), cVar2);
                    }
                    File parentFile = new File(bucketInfo.getPath()).getParentFile();
                    if (parentFile != null) {
                        str2 = parentFile.getAbsolutePath();
                    } else {
                        str2 = null;
                    }
                    if (str2 == null) {
                        str2 = "";
                    }
                    Intrinsics.checkExpressionValueIsNotNull(name, "bucketName");
                    cVar2.mo199611a(name);
                    cVar2.mo199610a(bucketInfo.getId());
                    if (cVar2.mo199617e().length() == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        str3 = bucketInfo.getImgPath();
                        Intrinsics.checkExpressionValueIsNotNull(str3, "info.imgPath");
                    } else {
                        str3 = cVar2.mo199617e();
                    }
                    cVar2.mo199614b(str3);
                    cVar2.mo199615c().add(str2);
                    cVar2.mo199613b(cVar2.mo199616d() + 1);
                    PhotoDir cVar4 = (PhotoDir) linkedHashMap.get(4096);
                    if (cVar4 != null) {
                        if (cVar4.mo199617e().length() == 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (z2) {
                            str4 = bucketInfo.getImgPath();
                            Intrinsics.checkExpressionValueIsNotNull(str4, "info.imgPath");
                        } else {
                            str4 = cVar4.mo199617e();
                        }
                        cVar4.mo199614b(str4);
                        cVar4.mo199615c().add(str2);
                        cVar4.mo199613b(cVar4.mo199616d() + 1);
                    }
                }
                this.f145858a.f145852b.mo199564a(linkedHashMap2);
                return;
            }
            do {
                Cursor cursor = this.f145859b;
                String string2 = cursor.getString(cursor.getColumnIndex("_data"));
                Cursor cursor2 = this.f145859b;
                String string3 = cursor2.getString(cursor2.getColumnIndex("bucket_display_name"));
                int hashCode = string3.hashCode();
                File parentFile2 = new File(string2).getParentFile();
                if (parentFile2 == null || (str = parentFile2.getAbsolutePath()) == null) {
                    str = "";
                }
                if (linkedHashMap.containsKey(Integer.valueOf(hashCode))) {
                    Object obj2 = linkedHashMap.get(Integer.valueOf(hashCode));
                    if (obj2 == null) {
                        Intrinsics.throwNpe();
                    }
                    cVar = (PhotoDir) obj2;
                } else {
                    PhotoDir cVar5 = new PhotoDir();
                    linkedHashMap2.put(Integer.valueOf(hashCode), cVar5);
                    cVar = cVar5;
                }
                Intrinsics.checkExpressionValueIsNotNull(string3, "bucketName");
                cVar.mo199611a(string3);
                cVar.mo199610a(string3.hashCode());
                if (TextUtils.isEmpty(cVar.mo199617e())) {
                    Intrinsics.checkExpressionValueIsNotNull(string2, "path");
                    cVar.mo199614b(string2);
                }
                cVar.mo199615c().add(str);
                cVar.mo199613b(cVar.mo199616d() + 1);
                PhotoDir cVar6 = (PhotoDir) linkedHashMap.get(4096);
                if (cVar6 != null) {
                    if (TextUtils.isEmpty(cVar6.mo199617e())) {
                        Intrinsics.checkExpressionValueIsNotNull(string2, "path");
                        cVar6.mo199614b(string2);
                    }
                    cVar6.mo199615c().add(str);
                    cVar6.mo199613b(cVar6.mo199616d() + 1);
                }
                if (this.f145859b.isClosed()) {
                    break;
                }
            } while (this.f145859b.moveToNext());
            this.f145858a.mo199756a(linkedHashMap2);
            this.f145858a.f145852b.mo199564a(linkedHashMap2);
        }
    }

    @Override // androidx.loader.p045a.AbstractC1181a.AbstractC1182a
    /* renamed from: a */
    public void mo6054a(C1198c<Cursor> cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "loader");
        Future<Object> future = this.f145854e;
        if (future != null) {
            future.cancel(true);
        }
    }

    /* renamed from: a */
    public final void mo199756a(Map<Integer, PhotoDir> map) {
        StringBuilder sb = new StringBuilder();
        sb.append("Stinson PhotoDir info : \n");
        for (Map.Entry<Integer, PhotoDir> entry : map.entrySet()) {
            sb.append("key = ");
            sb.append(entry.getKey().intValue());
            sb.append(" , dir name = ");
            sb.append(entry.getValue().mo199612b());
            sb.append(" , paths = ");
            sb.append(entry.getValue().mo199615c());
            sb.append(" , count = ");
            sb.append(entry.getValue().mo199616d());
            sb.append("\n");
        }
        PPLog.Companion aVar = PPLog.f145728b;
        String sb2 = sb.toString();
        Intrinsics.checkExpressionValueIsNotNull(sb2, "sb.toString()");
        aVar.mo199573b("PP_InfoLoader", sb2);
    }

    /* renamed from: a */
    public void mo6055a(C1198c<Cursor> cVar, Cursor cursor) {
        Intrinsics.checkParameterIsNotNull(cVar, "loader");
        if (cursor != null) {
            this.f145854e = PPThreadPool.f145730b.mo199579a(new CallableC58913b(this, cursor));
        }
    }

    @Override // androidx.loader.p045a.AbstractC1181a.AbstractC1182a
    /* renamed from: a */
    public C1198c<Cursor> mo6053a(int i, Bundle bundle) {
        String[] strArr;
        String str;
        String str2;
        String[] strArr2;
        int i2 = this.f145856g;
        if (i2 == 2) {
            str = mo199741a(mo199740a(0, 0), this.f145857h);
            strArr = mo199743c();
        } else {
            if (i2 == 1) {
                str2 = mo199741a(mo199740a(0, 0), this.f145857h);
                strArr2 = new String[]{String.valueOf(3)};
            } else {
                if (this.f145857h) {
                    str2 = mo199744d();
                } else {
                    str2 = mo199745e();
                }
                strArr2 = new String[]{String.valueOf(1)};
            }
            str = str2;
            strArr = strArr2;
        }
        return new C1197b(this.f145853d, mo199739a(), this.f145855f, str, strArr, mo199742b());
    }

    public PhotoInfoLoaderCallback(Context context, int i, boolean z, IOnInfoUpdateCallback cVar) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(cVar, "onInfoUpdateCallback");
        this.f145851a = context;
        this.f145856g = i;
        this.f145857h = z;
        this.f145852b = cVar;
        this.f145853d = context.getApplicationContext();
    }
}
