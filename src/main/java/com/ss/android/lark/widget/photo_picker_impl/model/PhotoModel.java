package com.ss.android.lark.widget.photo_picker_impl.model;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import androidx.fragment.app.FragmentActivity;
import androidx.loader.p045a.AbstractC1181a;
import com.bytedance.platform.godzilla.thread.C20339a;
import com.bytedance.platform.godzilla.thread.p873a.C20341a;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.suite.R;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.rxjava.C57865c;
import com.ss.android.lark.widget.photo_picker.C58612c;
import com.ss.android.lark.widget.photo_picker.PickerParams;
import com.ss.android.lark.widget.photo_picker_impl.base.IOnInfoUpdateCallback;
import com.ss.android.lark.widget.photo_picker_impl.base.IOnPhotoDataUpdateCallback;
import com.ss.android.lark.widget.photo_picker_impl.base.PPCallBack;
import com.ss.android.lark.widget.photo_picker_impl.base.PPLog;
import com.ss.android.lark.widget.photo_picker_impl.bean.Photo;
import com.ss.android.lark.widget.photo_picker_impl.bean.PhotoDir;
import com.ss.android.lark.widget.photo_picker_impl.model.AlbumHelper;
import com.ss.android.lark.widget.photo_picker_impl.model.PhotoDataLoaderCallback;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b\u0005\u0018\u0000 V*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003:\u0002VWB#\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\t¢\u0006\u0002\u0010\nJ\b\u0010.\u001a\u00020/H\u0016J8\u00100\u001a\u00020/\"\u0004\b\u0001\u001012\f\u00102\u001a\b\u0012\u0004\u0012\u0002H1032\f\u00104\u001a\b\u0012\u0004\u0012\u0002H1052\f\u00106\u001a\b\u0012\u0004\u0012\u00020705H\u0002J\"\u00108\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000:\u0012\u0004\u0012\u00020\u0018092\u0006\u0010;\u001a\u00020\u0014H\u0002J\u0006\u0010<\u001a\u00020\u0018J\u0012\u0010=\u001a\u00020/2\b\u0010>\u001a\u0004\u0018\u00010*H\u0002J\b\u0010?\u001a\u00020/H\u0002J\b\u0010@\u001a\u00020/H\u0016J\u001c\u0010A\u001a\u00020/2\u0012\u0010B\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00110\u0010H\u0002J\b\u0010C\u001a\u00020/H\u0016J \u0010D\u001a\u00020/2\u0006\u0010E\u001a\u00020,2\u0006\u0010F\u001a\u00020,2\u0006\u0010G\u001a\u00020HH\u0016J\b\u0010I\u001a\u00020/H\u0016J\u0006\u0010J\u001a\u00020/J\u0010\u0010K\u001a\u00020/2\u0006\u0010B\u001a\u00020\u001cH\u0016J\u0016\u0010L\u001a\u00020/2\f\u0010B\u001a\b\u0012\u0004\u0012\u00028\u00000$H\u0016J\u0018\u0010M\u001a\u00020/2\u0006\u0010N\u001a\u00020,2\b\u0010>\u001a\u0004\u0018\u00010*J\u001b\u0010O\u001a\u0004\u0018\u00010,*\u00020\u00142\u0006\u0010P\u001a\u00020*H\u0002¢\u0006\u0002\u0010QJ\u001b\u0010R\u001a\u0004\u0018\u00010S*\u00020\u00142\u0006\u0010P\u001a\u00020*H\u0002¢\u0006\u0002\u0010TJ\u0016\u0010U\u001a\u0004\u0018\u00010**\u00020\u00142\u0006\u0010P\u001a\u00020*H\u0002R\u0014\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fRB\u0010\r\u001a6\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00110\u00100\u000f0\u000ej\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00110\u00100\u000f`\u0012X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\tX\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\"\u0010#\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010$X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u0010\u0010)\u001a\u0004\u0018\u00010*X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020,X\u000e¢\u0006\u0002\n\u0000R\u001e\u0010-\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u000ej\b\u0012\u0004\u0012\u00028\u0000`\u0012X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006X"}, d2 = {"Lcom/ss/android/lark/widget/photo_picker_impl/model/PhotoModel;", "T", "Lcom/ss/android/lark/widget/photo_picker_impl/bean/Photo;", "Lcom/ss/android/lark/widget/photo_picker_impl/model/IPhotoModel;", "mActivity", "Landroidx/fragment/app/FragmentActivity;", "pickerParams", "Lcom/ss/android/lark/widget/photo_picker/PickerParams;", "mPhotoDataFactory", "Lcom/ss/android/lark/widget/photo_picker_impl/model/IPhotoDataFactory;", "(Landroidx/fragment/app/FragmentActivity;Lcom/ss/android/lark/widget/photo_picker/PickerParams;Lcom/ss/android/lark/widget/photo_picker_impl/model/IPhotoDataFactory;)V", "getMActivity", "()Landroidx/fragment/app/FragmentActivity;", "mCallbackList", "Ljava/util/ArrayList;", "Ljava/lang/ref/WeakReference;", "Lcom/ss/android/lark/widget/photo_picker_impl/base/PPCallBack;", "Lcom/ss/android/lark/widget/photo_picker_impl/model/PhotoModel$LoadResult;", "Lkotlin/collections/ArrayList;", "mCursor", "Landroid/database/Cursor;", "mHandlerThread", "Landroid/os/HandlerThread;", "mHasMore", "", "mIOHandler", "Landroid/os/Handler;", "mInfoUpdateCallback", "Lcom/ss/android/lark/widget/photo_picker_impl/base/IOnInfoUpdateCallback;", "getMInfoUpdateCallback", "()Lcom/ss/android/lark/widget/photo_picker_impl/base/IOnInfoUpdateCallback;", "setMInfoUpdateCallback", "(Lcom/ss/android/lark/widget/photo_picker_impl/base/IOnInfoUpdateCallback;)V", "getMPhotoDataFactory", "()Lcom/ss/android/lark/widget/photo_picker_impl/model/IPhotoDataFactory;", "mPhotoDataUpdateCallback", "Lcom/ss/android/lark/widget/photo_picker_impl/base/IOnPhotoDataUpdateCallback;", "getMPhotoDataUpdateCallback", "()Lcom/ss/android/lark/widget/photo_picker_impl/base/IOnPhotoDataUpdateCallback;", "setMPhotoDataUpdateCallback", "(Lcom/ss/android/lark/widget/photo_picker_impl/base/IOnPhotoDataUpdateCallback;)V", "mPhotoDir", "", "mPhotoDirId", "", "mPhotos", "create", "", "execInIO", "D", "producer", "Lcom/ss/android/lark/utils/rxjava/RxScheduledExecutor$Producer;", "consumer", "Lcom/ss/android/lark/utils/rxjava/RxScheduledExecutor$Consumer;", "onError", "", "getDataFromCursor", "Lkotlin/Pair;", "", "cursor", "hasMore", "init", "photoDir", "loadInfos", "loadMore", "loadMoreImpl", "callBack", "loadPre", "onActivityResult", "requestCode", "resultCode", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Landroid/content/Intent;", "onDestroy", "refresh", "setInfoUpdateCallback", "setPhotoDataUpdateCallback", "setPhotoDir", "photoDirID", "getInt", "id", "(Landroid/database/Cursor;Ljava/lang/String;)Ljava/lang/Integer;", "getLong", "", "(Landroid/database/Cursor;Ljava/lang/String;)Ljava/lang/Long;", "getString", "Companion", "LoadResult", "photo-picker-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.widget.photo_picker_impl.model.f */
public final class PhotoModel<T extends Photo> implements IPhotoModel<T> {

    /* renamed from: d */
    public static int f145860d = 30;

    /* renamed from: e */
    public static final Companion f145861e = new Companion(null);

    /* renamed from: a */
    public Cursor f145862a;

    /* renamed from: b */
    public boolean f145863b = true;

    /* renamed from: c */
    public final ArrayList<T> f145864c = new ArrayList<>();

    /* renamed from: f */
    private IOnPhotoDataUpdateCallback<T> f145865f;

    /* renamed from: g */
    private IOnInfoUpdateCallback f145866g;

    /* renamed from: h */
    private String f145867h;

    /* renamed from: i */
    private int f145868i = 4096;

    /* renamed from: j */
    private final HandlerThread f145869j = m228645a("photo-picker-model-thread");

    /* renamed from: k */
    private Handler f145870k;

    /* renamed from: l */
    private ArrayList<WeakReference<PPCallBack<LoadResult<T>>>> f145871l = new ArrayList<>();

    /* renamed from: m */
    private final FragmentActivity f145872m;

    /* renamed from: n */
    private final PickerParams f145873n;

    /* renamed from: o */
    private final IPhotoDataFactory<T> f145874o;

    /* renamed from: a */
    public static HandlerThread m228645a(String str) {
        return C20341a.m74147a() ? C20339a.m74145a(str, 0, C20341a.f49621b) : new HandlerThread(str);
    }

    @Override // com.ss.android.lark.widget.photo_picker_impl.model.IPhotoModel
    /* renamed from: a */
    public void mo199747a(int i, int i2, Intent intent) {
        Intrinsics.checkParameterIsNotNull(intent, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
    }

    @Override // com.ss.android.lark.widget.photo_picker_impl.model.IPhotoModel
    /* renamed from: b */
    public void mo199750b() {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/widget/photo_picker_impl/model/PhotoModel$Companion;", "", "()V", "PAGE_SIZE", "", "getPAGE_SIZE", "()I", "setPAGE_SIZE", "(I)V", "photo-picker-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.widget.photo_picker_impl.model.f$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002B#\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tR\u001a\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR \u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/ss/android/lark/widget/photo_picker_impl/model/PhotoModel$LoadResult;", "DATA", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "hasMore", "", "append", "", "(Ljava/util/List;ZI)V", "getAppend", "()I", "setAppend", "(I)V", "getData", "()Ljava/util/List;", "setData", "(Ljava/util/List;)V", "getHasMore", "()Z", "setHasMore", "(Z)V", "photo-picker-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.widget.photo_picker_impl.model.f$b */
    public static final class LoadResult<DATA> {

        /* renamed from: a */
        private List<DATA> f145875a;

        /* renamed from: b */
        private boolean f145876b;

        /* renamed from: c */
        private int f145877c;

        /* renamed from: a */
        public final List<DATA> mo199765a() {
            return this.f145875a;
        }

        /* renamed from: b */
        public final boolean mo199766b() {
            return this.f145876b;
        }

        /* renamed from: c */
        public final int mo199767c() {
            return this.f145877c;
        }

        public LoadResult(List<DATA> list, boolean z, int i) {
            Intrinsics.checkParameterIsNotNull(list, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            this.f145875a = list;
            this.f145876b = z;
            this.f145877c = i;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final IOnPhotoDataUpdateCallback<T> mo199761e() {
        return this.f145865f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final IOnInfoUpdateCallback mo199762f() {
        return this.f145866g;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final IPhotoDataFactory<T> mo199764h() {
        return this.f145874o;
    }

    @Override // com.ss.android.lark.widget.photo_picker_impl.model.IPhotoModel
    /* renamed from: d */
    public void mo199752d() {
        Handler handler = this.f145870k;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        this.f145869j.quit();
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\b\b\u0001\u0010\u0003*\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "D", "T", "Lcom/ss/android/lark/widget/photo_picker_impl/bean/Photo;", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.widget.photo_picker_impl.model.f$c */
    public static final class RunnableC58914c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C57865c.AbstractC57873d f145878a;

        /* renamed from: b */
        final /* synthetic */ C57865c.AbstractC57871b f145879b;

        /* renamed from: c */
        final /* synthetic */ C57865c.AbstractC57871b f145880c;

        RunnableC58914c(C57865c.AbstractC57873d dVar, C57865c.AbstractC57871b bVar, C57865c.AbstractC57871b bVar2) {
            this.f145878a = dVar;
            this.f145879b = bVar;
            this.f145880c = bVar2;
        }

        public final void run() {
            try {
                final Object produce = this.f145878a.produce();
                UICallbackExecutor.execute(new Runnable(this) {
                    /* class com.ss.android.lark.widget.photo_picker_impl.model.PhotoModel.RunnableC58914c.RunnableC589151 */

                    /* renamed from: a */
                    final /* synthetic */ RunnableC58914c f145881a;

                    {
                        this.f145881a = r1;
                    }

                    public final void run() {
                        this.f145881a.f145879b.consume(produce);
                    }
                });
            } catch (Exception e) {
                UICallbackExecutor.execute(new Runnable(this) {
                    /* class com.ss.android.lark.widget.photo_picker_impl.model.PhotoModel.RunnableC58914c.RunnableC589162 */

                    /* renamed from: a */
                    final /* synthetic */ RunnableC58914c f145883a;

                    {
                        this.f145883a = r1;
                    }

                    public final void run() {
                        this.f145883a.f145880c.consume(new Throwable(e));
                    }
                });
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "T", "Lcom/ss/android/lark/widget/photo_picker_impl/bean/Photo;", "produce"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.widget.photo_picker_impl.model.f$j */
    static final class C58924j<T> implements C57865c.AbstractC57873d<List<T>> {

        /* renamed from: a */
        final /* synthetic */ PhotoModel f145894a;

        C58924j(PhotoModel fVar) {
            this.f145894a = fVar;
        }

        /* renamed from: a */
        public final List<T> produce() {
            return this.f145894a.mo199764h().mo197706a(new ArrayList(this.f145894a.f145864c));
        }
    }

    /* renamed from: g */
    public final void mo199763g() {
        m228647a(new C58924j(this), new C58925k(this), C58926l.f145896a);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0016¨\u0006\b"}, d2 = {"com/ss/android/lark/widget/photo_picker_impl/model/PhotoModel$loadInfos$callback$1", "Lcom/ss/android/lark/widget/photo_picker_impl/base/IOnInfoUpdateCallback;", "onUpdateInfo", "", "photoDirs", "", "", "Lcom/ss/android/lark/widget/photo_picker_impl/bean/PhotoDir;", "photo-picker-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.widget.photo_picker_impl.model.f$e */
    public static final class C58918e implements IOnInfoUpdateCallback {

        /* renamed from: a */
        final /* synthetic */ PhotoModel f145886a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "T", "Lcom/ss/android/lark/widget/photo_picker_impl/bean/Photo;", "run"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.widget.photo_picker_impl.model.f$e$a */
        static final class RunnableC58919a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C58918e f145887a;

            /* renamed from: b */
            final /* synthetic */ Map f145888b;

            RunnableC58919a(C58918e eVar, Map map) {
                this.f145887a = eVar;
                this.f145888b = map;
            }

            public final void run() {
                PPLog.Companion aVar = PPLog.f145728b;
                String str = C58927g.f145897a;
                aVar.mo199572a(str, "onUpdateInfo : " + this.f145888b);
                IOnInfoUpdateCallback f = this.f145887a.f145886a.mo199762f();
                if (f != null) {
                    f.mo199564a(this.f145888b);
                }
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C58918e(PhotoModel fVar) {
            this.f145886a = fVar;
        }

        @Override // com.ss.android.lark.widget.photo_picker_impl.base.IOnInfoUpdateCallback
        /* renamed from: a */
        public void mo199564a(Map<Integer, PhotoDir> map) {
            Intrinsics.checkParameterIsNotNull(map, "photoDirs");
            UICallbackExecutor.execute(new RunnableC58919a(this, map));
        }
    }

    @Override // com.ss.android.lark.widget.photo_picker_impl.model.IPhotoModel
    /* renamed from: c */
    public void mo199751c() {
        if (this.f145863b) {
            this.f145863b = false;
            C58920f fVar = new C58920f(this);
            this.f145871l.add(new WeakReference<>(fVar));
            m228648a(fVar);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0010\u0012\f\u0012\n \u0003*\u0004\u0018\u0001H\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/widget/photo_picker_impl/model/PhotoModel$LoadResult;", "T", "kotlin.jvm.PlatformType", "Lcom/ss/android/lark/widget/photo_picker_impl/bean/Photo;", "produce"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.widget.photo_picker_impl.model.f$g */
    public static final class C58921g<T> implements C57865c.AbstractC57873d<LoadResult<T>> {

        /* renamed from: a */
        final /* synthetic */ PhotoModel f145890a;

        /* renamed from: b */
        final /* synthetic */ Cursor f145891b;

        C58921g(PhotoModel fVar, Cursor cursor) {
            this.f145890a = fVar;
            this.f145891b = cursor;
        }

        /* renamed from: a */
        public final LoadResult<T> produce() {
            Pair<List<T>, Boolean> a = this.f145890a.mo199759a(this.f145891b);
            List<T> a2 = this.f145890a.mo199764h().mo197706a(a.getFirst());
            this.f145890a.f145864c.addAll(a2);
            ArrayList arrayList = new ArrayList(this.f145890a.f145864c);
            PPLog.Companion aVar = PPLog.f145728b;
            String str = C58927g.f145897a;
            aVar.mo199572a(str, "data : " + arrayList);
            return new LoadResult<>(arrayList, a.getSecond().booleanValue(), a2.size());
        }
    }

    /* renamed from: i */
    private final void m228652i() {
        AbstractC1181a supportLoaderManager = this.f145872m.getSupportLoaderManager();
        Intrinsics.checkExpressionValueIsNotNull(supportLoaderManager, "mActivity.getSupportLoaderManager()");
        PhotoInfoLoaderCallback eVar = new PhotoInfoLoaderCallback(this.f145872m, this.f145873n.mo198865b(), !this.f145873n.mo198874k(), new C58918e(this));
        Bundle bundle = new Bundle();
        if (supportLoaderManager.mo6050b(R.id.photo_picker_photo_info_loader) == null) {
            supportLoaderManager.mo6046a(R.id.photo_picker_photo_info_loader, bundle, eVar);
        } else {
            supportLoaderManager.mo6051b(R.id.photo_picker_photo_info_loader, bundle, eVar);
        }
    }

    @Override // com.ss.android.lark.widget.photo_picker_impl.model.IPhotoModel
    /* renamed from: a */
    public void mo199746a() {
        this.f145869j.start();
        this.f145870k = new Handler(this.f145869j.getLooper());
        m228650b(this.f145867h);
        m228652i();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/widget/photo_picker_impl/model/PhotoModel$init$callback$1", "Lcom/ss/android/lark/widget/photo_picker_impl/model/PhotoDataLoaderCallback$ICursorCallback;", "onCreateCursor", "", "cursor", "Landroid/database/Cursor;", "photo-picker-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.widget.photo_picker_impl.model.f$d */
    public static final class C58917d implements PhotoDataLoaderCallback.ICursorCallback {

        /* renamed from: a */
        final /* synthetic */ PhotoModel f145885a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C58917d(PhotoModel fVar) {
            this.f145885a = fVar;
        }

        @Override // com.ss.android.lark.widget.photo_picker_impl.model.PhotoDataLoaderCallback.ICursorCallback
        /* renamed from: a */
        public void mo199754a(Cursor cursor) {
            this.f145885a.f145862a = cursor;
            this.f145885a.mo199751c();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0014J\u0016\u0010\u0007\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0014¨\u0006\t"}, d2 = {"com/ss/android/lark/widget/photo_picker_impl/model/PhotoModel$loadMore$1", "Lcom/ss/android/lark/widget/photo_picker_impl/base/PPCallBack;", "Lcom/ss/android/lark/widget/photo_picker_impl/model/PhotoModel$LoadResult;", "onError", "", "throwable", "", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "photo-picker-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.widget.photo_picker_impl.model.f$f */
    public static final class C58920f extends PPCallBack<LoadResult<T>> {

        /* renamed from: a */
        final /* synthetic */ PhotoModel f145889a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C58920f(PhotoModel fVar) {
            this.f145889a = fVar;
        }

        @Override // com.ss.android.lark.widget.photo_picker_impl.base.PPCallBack
        /* renamed from: b */
        public /* synthetic */ void mo199569b(Object obj) {
            mo199772a((LoadResult) ((LoadResult) obj));
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo199772a(LoadResult<T> bVar) {
            Intrinsics.checkParameterIsNotNull(bVar, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            IOnPhotoDataUpdateCallback<T> e = this.f145889a.mo199761e();
            if (e != null) {
                e.mo199565a(bVar.mo199765a(), bVar.mo199767c(), false);
            }
            this.f145889a.f145863b = bVar.mo199766b();
        }

        /* access modifiers changed from: protected */
        @Override // com.ss.android.lark.widget.photo_picker_impl.base.PPCallBack
        /* renamed from: b */
        public void mo199570b(Throwable th) {
            Intrinsics.checkParameterIsNotNull(th, "throwable");
            IOnPhotoDataUpdateCallback<T> e = this.f145889a.mo199761e();
            if (e != null) {
                e.mo199565a(this.f145889a.f145864c, 0, false);
            }
            PPLog.Companion aVar = PPLog.f145728b;
            String str = C58927g.f145897a;
            aVar.mo199574c(str, "load data error : " + th);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\u001a\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u0002H\u0002 \u0006*\n\u0012\u0004\u0012\u0002H\u0002\u0018\u00010\u00050\u0005H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "T", "Lcom/ss/android/lark/widget/photo_picker_impl/bean/Photo;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/lark/widget/photo_picker_impl/model/PhotoModel$LoadResult;", "kotlin.jvm.PlatformType", "consume"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.widget.photo_picker_impl.model.f$h */
    public static final class C58922h<T> implements C57865c.AbstractC57871b<LoadResult<T>> {

        /* renamed from: a */
        final /* synthetic */ PPCallBack f145892a;

        C58922h(PPCallBack gVar) {
            this.f145892a = gVar;
        }

        /* renamed from: a */
        public final void consume(LoadResult<T> bVar) {
            PPCallBack gVar = this.f145892a;
            Intrinsics.checkExpressionValueIsNotNull(bVar, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            gVar.mo199567a(bVar);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\u000e\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u0005H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "T", "Lcom/ss/android/lark/widget/photo_picker_impl/bean/Photo;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "kotlin.jvm.PlatformType", "consume"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.widget.photo_picker_impl.model.f$i */
    public static final class C58923i<T> implements C57865c.AbstractC57871b<Throwable> {

        /* renamed from: a */
        final /* synthetic */ PPCallBack f145893a;

        C58923i(PPCallBack gVar) {
            this.f145893a = gVar;
        }

        /* renamed from: a */
        public final void consume(Throwable th) {
            PPCallBack gVar = this.f145893a;
            Intrinsics.checkExpressionValueIsNotNull(th, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            gVar.mo199568a(th);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\u001a\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u0002H\u0002 \u0006*\n\u0012\u0004\u0012\u0002H\u0002\u0018\u00010\u00050\u0005H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "T", "Lcom/ss/android/lark/widget/photo_picker_impl/bean/Photo;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "kotlin.jvm.PlatformType", "consume"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.widget.photo_picker_impl.model.f$k */
    static final class C58925k<T> implements C57865c.AbstractC57871b<List<T>> {

        /* renamed from: a */
        final /* synthetic */ PhotoModel f145895a;

        C58925k(PhotoModel fVar) {
            this.f145895a = fVar;
        }

        /* renamed from: a */
        public final void consume(List<T> list) {
            IOnPhotoDataUpdateCallback<T> e = this.f145895a.mo199761e();
            if (e != null) {
                Intrinsics.checkExpressionValueIsNotNull(list, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
                e.mo199565a(list, 0, true);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\u000e\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u0005H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "T", "Lcom/ss/android/lark/widget/photo_picker_impl/bean/Photo;", "error", "", "kotlin.jvm.PlatformType", "consume"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.widget.photo_picker_impl.model.f$l */
    static final class C58926l<T> implements C57865c.AbstractC57871b<Throwable> {

        /* renamed from: a */
        public static final C58926l f145896a = new C58926l();

        C58926l() {
        }

        /* renamed from: a */
        public final void consume(Throwable th) {
            PPLog.Companion aVar = PPLog.f145728b;
            String str = C58927g.f145897a;
            aVar.mo199574c(str, "refresh error : " + th);
        }
    }

    /* renamed from: a */
    private final void m228648a(PPCallBack<LoadResult<T>> gVar) {
        Cursor cursor = this.f145862a;
        if (cursor == null) {
            gVar.mo199568a(new Throwable("cursor is NULL"));
        } else {
            m228647a(new C58921g(this, cursor), new C58922h(gVar), new C58923i(gVar));
        }
    }

    /* renamed from: b */
    private final void m228650b(String str) {
        Iterator<T> it = this.f145871l.iterator();
        while (it.hasNext()) {
            PPCallBack gVar = (PPCallBack) it.next().get();
            if (gVar != null) {
                gVar.mo199566a();
            }
        }
        this.f145863b = true;
        this.f145864c.clear();
        if (this.f145873n.mo198882s()) {
            this.f145864c.add(0, this.f145874o.mo197705a());
        }
        this.f145867h = str;
        this.f145862a = null;
        AbstractC1181a supportLoaderManager = this.f145872m.getSupportLoaderManager();
        Intrinsics.checkExpressionValueIsNotNull(supportLoaderManager, "mActivity.supportLoaderManager");
        Bundle bundle = new Bundle();
        PhotoDataLoaderCallback dVar = new PhotoDataLoaderCallback(this.f145872m, str, this.f145873n.mo198865b(), !this.f145873n.mo198874k(), new C58917d(this));
        if (supportLoaderManager.mo6050b(R.id.photo_picker_photo_loader) == null) {
            supportLoaderManager.mo6046a(R.id.photo_picker_photo_loader, bundle, dVar);
        } else {
            supportLoaderManager.mo6051b(R.id.photo_picker_photo_loader, bundle, dVar);
        }
    }

    /* renamed from: a */
    public final Pair<List<T>, Boolean> mo199759a(Cursor cursor) {
        int i;
        int i2;
        int i3;
        long j;
        List<AlbumHelper.MediaInfo> list;
        int i4;
        if (C58612c.m227290a().mo102854b("lark.photo-picker.album_helper")) {
            int i5 = this.f145868i;
            if (i5 != 4096) {
                list = AlbumHelper.m228616c(this.f145872m, i5);
            } else {
                list = AlbumHelper.m228602a(this.f145872m);
            }
            Intrinsics.checkExpressionValueIsNotNull(list, "photoList");
            List<AlbumHelper.MediaInfo> list2 = list;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            for (AlbumHelper.MediaInfo mediaInfo : list2) {
                T a = this.f145874o.mo197705a();
                Intrinsics.checkExpressionValueIsNotNull(mediaInfo, "it");
                a.mo199592a(Integer.valueOf(mediaInfo.getId()));
                a.mo199593a(mediaInfo.getShowImagePath());
                a.mo199597b(mediaInfo.mimeType);
                a.mo199590a(mediaInfo.getImageWidth());
                a.mo199596b(mediaInfo.getImageHeight());
                if (mediaInfo instanceof AlbumHelper.VideoInfo) {
                    i4 = (int) ((AlbumHelper.VideoInfo) mediaInfo).getDuration();
                } else {
                    i4 = 0;
                }
                a.mo199600c(i4);
                a.mo199591a(mediaInfo.size);
                arrayList.add(a);
            }
            return new Pair<>(CollectionsKt.toMutableList((Collection) arrayList), false);
        }
        int i6 = f145860d;
        ArrayList arrayList2 = new ArrayList();
        int i7 = 0;
        boolean z = true;
        while (true) {
            Integer b = m228649b(cursor, "_id");
            String a2 = m228646a(cursor, "_data");
            String a3 = m228646a(cursor, "mime_type");
            String a4 = m228646a(cursor, "bucket_display_name");
            Integer b2 = m228649b(cursor, "width");
            Integer b3 = m228649b(cursor, "height");
            Integer b4 = m228649b(cursor, "duration");
            Long c = m228651c(cursor, "_size");
            T a5 = this.f145874o.mo197705a();
            a5.mo199592a(b);
            a5.mo199593a(a2);
            a5.mo199597b(a3);
            a5.mo199601c(a4);
            if (b2 != null) {
                i = b2.intValue();
            } else {
                i = 0;
            }
            a5.mo199590a(i);
            if (b3 != null) {
                i2 = b3.intValue();
            } else {
                i2 = 0;
            }
            a5.mo199596b(i2);
            if (b4 != null) {
                i3 = b4.intValue();
            } else {
                i3 = 0;
            }
            a5.mo199600c(i3);
            if (c != null) {
                j = c.longValue();
            } else {
                j = 0;
            }
            a5.mo199591a(j);
            if (a5.mo199589a() == null || a5.mo199595b() == null || !new File(a5.mo199595b()).exists()) {
                String str = C58927g.f145897a;
                Log.m165383e(str, "filter invalid media item : " + a5);
            } else {
                arrayList2.add(a5);
            }
            if (cursor.isClosed() || !(z = cursor.moveToNext()) || (i7 = i7 + 1) >= i6) {
            }
        }
        return new Pair<>(arrayList2, Boolean.valueOf(z));
    }

    @Override // com.ss.android.lark.widget.photo_picker_impl.model.IPhotoModel
    /* renamed from: a */
    public void mo199748a(IOnInfoUpdateCallback cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "callBack");
        this.f145866g = cVar;
    }

    @Override // com.ss.android.lark.widget.photo_picker_impl.model.IPhotoModel
    /* renamed from: a */
    public void mo199749a(IOnPhotoDataUpdateCallback<T> dVar) {
        Intrinsics.checkParameterIsNotNull(dVar, "callBack");
        this.f145865f = dVar;
    }

    /* renamed from: a */
    private final String m228646a(Cursor cursor, String str) {
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex == -1) {
            return null;
        }
        return cursor.getString(columnIndex);
    }

    /* renamed from: b */
    private final Integer m228649b(Cursor cursor, String str) {
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex == -1) {
            return null;
        }
        return Integer.valueOf(cursor.getInt(columnIndex));
    }

    /* renamed from: c */
    private final Long m228651c(Cursor cursor, String str) {
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex == -1) {
            return null;
        }
        return Long.valueOf(cursor.getLong(columnIndex));
    }

    /* renamed from: a */
    public final void mo199760a(int i, String str) {
        this.f145868i = i;
        if (i == 4096) {
            str = null;
        }
        if (!Intrinsics.areEqual(str, this.f145867h)) {
            this.f145867h = str;
            m228650b(str);
        }
    }

    public PhotoModel(FragmentActivity fragmentActivity, PickerParams gVar, IPhotoDataFactory<T> bVar) {
        Intrinsics.checkParameterIsNotNull(fragmentActivity, "mActivity");
        Intrinsics.checkParameterIsNotNull(gVar, "pickerParams");
        Intrinsics.checkParameterIsNotNull(bVar, "mPhotoDataFactory");
        this.f145872m = fragmentActivity;
        this.f145873n = gVar;
        this.f145874o = bVar;
    }

    /* renamed from: a */
    private final <D> void m228647a(C57865c.AbstractC57873d<D> dVar, C57865c.AbstractC57871b<D> bVar, C57865c.AbstractC57871b<Throwable> bVar2) {
        Handler handler = this.f145870k;
        if (handler != null) {
            handler.post(new RunnableC58914c(dVar, bVar, bVar2));
        }
    }
}
