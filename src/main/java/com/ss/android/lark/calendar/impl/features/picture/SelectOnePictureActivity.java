package com.ss.android.lark.calendar.impl.features.picture;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.utils.DeviceUtils;
import com.ss.android.lark.base.fragment.BaseFragmentActivity;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.image.ImageLoader;
import com.ss.android.lark.image.api.C38818i;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;
import com.ss.android.lark.widget.photo_picker.C58557a;
import com.ss.android.lark.widget.photo_picker.PickerParams;
import com.ss.android.photoeditor.C59605a;
import com.ss.android.photoeditor.base.AbstractC59635g;
import io.reactivex.Observable;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.p3456d.C68279a;
import java.io.File;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.annotation.AnnotationRetention;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000  2\u00020\u0001:\u0001 B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u0012\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0002J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\"\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00162\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0014J\u0012\u0010\u001a\u001a\u00020\r2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0014J\b\u0010\u001d\u001a\u00020\rH\u0014J\b\u0010\u001e\u001a\u00020\rH\u0002J\u0012\u0010\u001f\u001a\u00020\r2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/picture/SelectOnePictureActivity;", "Lcom/ss/android/lark/base/fragment/BaseFragmentActivity;", "()V", "editContainer", "Landroid/widget/FrameLayout;", "photoEditor", "Lcom/ss/android/photoeditor/base/IPhotoEditor;", "saveDispose", "Lio/reactivex/disposables/Disposable;", "cropToSquare", "Landroid/graphics/Bitmap;", "bitmap", "editPicture", "", "path", "", "getPreviewBounds", "", "view", "Landroid/view/View;", "onActivityResult", "requestCode", "", "resultCode", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Landroid/content/Intent;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "pickPhoto", "saveCroppedBitmap", "Companion", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class SelectOnePictureActivity extends BaseFragmentActivity {

    /* renamed from: b */
    public static final Companion f82404b = new Companion(null);

    /* renamed from: a */
    public AbstractC59635g f82405a;

    /* renamed from: c */
    private FrameLayout f82406c;

    /* renamed from: d */
    private Disposable f82407d;

    /* renamed from: a */
    public Context mo117773a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo117774a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo117775a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m122803a(this, context);
    }

    /* renamed from: b */
    public void mo117778b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo117779c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m122801a(this, configuration);
    }

    public AssetManager getAssets() {
        return m122807c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m122802a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m122806b(this);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0016B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u00042\b\u0010\u0015\u001a\u0004\u0018\u00010\u000eR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bXT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bXT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\bXT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\bXT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\bXT¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/picture/SelectOnePictureActivity$Companion;", "", "()V", "KEY_CROP_SQUARE", "", "KEY_RESULT", "KEY_SOURCE", "PICK_PHOTO_REQUEST_CODE", "", "REQUEST_CODE", "RESULT_OK_CODE", "SOURCE_ALBUM", "SOURCE_CAMERA", "buildIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", ShareHitPoint.f121868c, "cropToSquare", "", "getPicturePath", "intent", "Source", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    public static final class Companion {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/picture/SelectOnePictureActivity$Companion$Source;", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
        @Retention(RetentionPolicy.SOURCE)
        @kotlin.annotation.Retention(AnnotationRetention.SOURCE)
        public @interface Source {
        }

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final String mo117783a(Intent intent) {
            if (intent != null) {
                return intent.getStringExtra("KEY_RESULT");
            }
            return null;
        }

        /* renamed from: a */
        public final Intent mo117782a(Context context, int i, boolean z) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            Intent putExtra = new Intent(context, SelectOnePictureActivity.class).putExtra("KEY_SOURCE", i).putExtra("KEY_CROP_SQUARE", z);
            Intrinsics.checkExpressionValueIsNotNull(putExtra, "Intent(context, SelectOn…ROP_SQUARE, cropToSquare)");
            return putExtra;
        }
    }

    /* renamed from: d */
    private final void m122808d() {
        C58557a.m227128a(PickerParams.f144865a.mo198927a(new C32218b(this))).mo198510a(this, 1234);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onDestroy() {
        super.onDestroy();
        Disposable disposable = this.f82407d;
        if (disposable != null) {
            disposable.dispose();
        }
        AbstractC59635g gVar = this.f82405a;
        if (gVar != null) {
            gVar.mo203028a();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/calendar/impl/features/picture/SelectOnePictureActivity$editPicture$1", "Lcom/ss/android/lark/image/api/SimpleTarget;", "Landroid/graphics/Bitmap;", "onResourceReady", "", "resource", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.picture.SelectOnePictureActivity$a */
    public static final class C32216a extends C38818i<Bitmap> {

        /* renamed from: a */
        final /* synthetic */ SelectOnePictureActivity f82408a;

        /* renamed from: b */
        final /* synthetic */ FrameLayout f82409b;

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/graphics/Bitmap;", "kotlin.jvm.PlatformType", "onFinalEdit"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.calendar.impl.features.picture.SelectOnePictureActivity$a$a */
        public static final class C32217a implements AbstractC59635g.AbstractC59636a {

            /* renamed from: a */
            final /* synthetic */ C32216a f82410a;

            C32217a(C32216a aVar) {
                this.f82410a = aVar;
            }

            @Override // com.ss.android.photoeditor.base.AbstractC59635g.AbstractC59636a
            /* renamed from: a */
            public final void mo117785a(Bitmap bitmap) {
                this.f82410a.f82408a.mo117776a(bitmap);
            }
        }

        /* renamed from: a */
        public void mo49248a(Bitmap bitmap) {
            this.f82408a.f82405a = new C59605a.C59607a().mo203033a(this.f82408a).mo203035a(this.f82409b).mo203034a(bitmap).mo203039a(new String[]{"crop_and_rotate_plugin"}).mo203040a().mo203027a(new C32217a(this));
        }

        C32216a(SelectOnePictureActivity selectOnePictureActivity, FrameLayout frameLayout) {
            this.f82408a = selectOnePictureActivity;
            this.f82409b = frameLayout;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/ss/android/lark/widget/photo_picker/PickerParams$Builder;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.picture.SelectOnePictureActivity$b */
    public static final class C32218b extends Lambda implements Function1<PickerParams.Builder, Unit> {
        final /* synthetic */ SelectOnePictureActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32218b(SelectOnePictureActivity selectOnePictureActivity) {
            super(1);
            this.this$0 = selectOnePictureActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(PickerParams.Builder aVar) {
            invoke(aVar);
            return Unit.INSTANCE;
        }

        public final void invoke(PickerParams.Builder aVar) {
            Intrinsics.checkParameterIsNotNull(aVar, "$receiver");
            int i = 0;
            aVar.mo198890b(0);
            if (this.this$0.getIntent().getIntExtra("KEY_SOURCE", 0) == 1) {
                i = 1;
            }
            aVar.mo198884a(i);
            aVar.mo198908h(2);
            aVar.mo198893c(1);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "throwable", "", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.picture.SelectOnePictureActivity$e */
    public static final class C32221e<T> implements Consumer<Throwable> {

        /* renamed from: a */
        final /* synthetic */ SelectOnePictureActivity f82414a;

        C32221e(SelectOnePictureActivity selectOnePictureActivity) {
            this.f82414a = selectOnePictureActivity;
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            String str = this.f82414a.TAG;
            Log.m165383e(str, "Save failed : " + th);
            this.f82414a.finish();
        }
    }

    /* renamed from: a */
    public static Resources m122802a(SelectOnePictureActivity selectOnePictureActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(selectOnePictureActivity);
        }
        return selectOnePictureActivity.mo117774a();
    }

    /* renamed from: c */
    public static AssetManager m122807c(SelectOnePictureActivity selectOnePictureActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(selectOnePictureActivity);
        }
        return selectOnePictureActivity.mo117779c();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.TAG = "SelectOnePictureActivity";
        FrameLayout frameLayout = new FrameLayout(this);
        this.f82406c = frameLayout;
        setContentView(frameLayout);
        m122808d();
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "file", "Ljava/io/File;", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.picture.SelectOnePictureActivity$d */
    public static final class C32220d<T> implements Consumer<File> {

        /* renamed from: a */
        final /* synthetic */ SelectOnePictureActivity f82413a;

        C32220d(SelectOnePictureActivity selectOnePictureActivity) {
            this.f82413a = selectOnePictureActivity;
        }

        /* renamed from: a */
        public final void accept(File file) {
            String str = this.f82413a.TAG;
            StringBuilder sb = new StringBuilder();
            sb.append("Save succeed after edit: ");
            Intrinsics.checkExpressionValueIsNotNull(file, "file");
            sb.append(file.getAbsolutePath());
            Log.m165389i(str, sb.toString());
            this.f82413a.setResult(-1, new Intent().putExtra("KEY_RESULT", file.getAbsolutePath()));
            this.f82413a.finish();
        }
    }

    /* renamed from: b */
    public static void m122806b(SelectOnePictureActivity selectOnePictureActivity) {
        selectOnePictureActivity.mo117778b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            SelectOnePictureActivity selectOnePictureActivity2 = selectOnePictureActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    selectOnePictureActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    private final void m122804a(String str) {
        boolean z;
        FrameLayout frameLayout = this.f82406c;
        if (frameLayout != null) {
            String str2 = str;
            if (str2 == null || str2.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                int[] a = m122805a(frameLayout, str);
                ImageLoader.with(this).load(new File(str)).asBitmap().override(a[0], a[1]).into(new C32216a(this, frameLayout));
                return;
            }
        }
        finish();
    }

    /* renamed from: b */
    public final Bitmap mo117777b(Bitmap bitmap) {
        int i;
        int min = Math.min(bitmap.getWidth(), bitmap.getHeight());
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (width < min || height < min) {
            return bitmap;
        }
        int max = (Math.max(width, height) * min) / Math.min(width, height);
        if (width > height) {
            i = max;
        } else {
            i = min;
        }
        if (width > height) {
            max = min;
        }
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, i, max, true);
        Intrinsics.checkExpressionValueIsNotNull(createScaledBitmap, "Bitmap.createScaledBitma…idth, scaledHeight, true)");
        Bitmap createBitmap = Bitmap.createBitmap(createScaledBitmap, (i - min) / 2, (max - min) / 2, min, min);
        Intrinsics.checkExpressionValueIsNotNull(createBitmap, "Bitmap.createBitmap(scal…, edgeLength, edgeLength)");
        createScaledBitmap.recycle();
        return createBitmap;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0014\u0010\u0002\u001a\u0010\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u00040\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "emitter", "Lio/reactivex/ObservableEmitter;", "Ljava/io/File;", "kotlin.jvm.PlatformType", "subscribe"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.picture.SelectOnePictureActivity$c */
    public static final class C32219c<T> implements ObservableOnSubscribe<File> {

        /* renamed from: a */
        final /* synthetic */ SelectOnePictureActivity f82411a;

        /* renamed from: b */
        final /* synthetic */ Bitmap f82412b;

        C32219c(SelectOnePictureActivity selectOnePictureActivity, Bitmap bitmap) {
            this.f82411a = selectOnePictureActivity;
            this.f82412b = bitmap;
        }

        /* JADX WARNING: Removed duplicated region for block: B:20:0x009f A[SYNTHETIC, Splitter:B:20:0x009f] */
        @Override // io.reactivex.ObservableOnSubscribe
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void subscribe(io.reactivex.ObservableEmitter<java.io.File> r7) {
            /*
            // Method dump skipped, instructions count: 175
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.calendar.impl.features.picture.SelectOnePictureActivity.C32219c.subscribe(io.reactivex.ObservableEmitter):void");
        }
    }

    /* renamed from: a */
    public final void mo117776a(Bitmap bitmap) {
        if (bitmap == null) {
            finish();
        } else {
            this.f82407d = Observable.create(new C32219c(this, bitmap)).subscribeOn(C68279a.m265023b()).observeOn(AndroidSchedulers.mainThread()).subscribe(new C32220d(this), new C32221e(this));
        }
    }

    /* renamed from: a */
    public static void m122803a(SelectOnePictureActivity selectOnePictureActivity, Context context) {
        selectOnePictureActivity.mo117775a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(selectOnePictureActivity);
        }
    }

    /* renamed from: a */
    public static Context m122801a(SelectOnePictureActivity selectOnePictureActivity, Configuration configuration) {
        Context a = selectOnePictureActivity.mo117773a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }

    /* renamed from: a */
    private final int[] m122805a(View view, String str) {
        int i;
        int i2;
        if (view.getWidth() > 0) {
            i = view.getWidth();
        } else {
            i = DeviceUtils.getScreenWidth(view.getContext());
        }
        float f = (float) i;
        if (view.getHeight() > 0) {
            i2 = view.getHeight();
        } else {
            i2 = DeviceUtils.getScreenHeight(view.getContext());
        }
        float f2 = (float) i2;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(new File(str).getPath(), options);
        float f3 = (float) options.outWidth;
        float f4 = (float) options.outHeight;
        if (f3 >= f || f4 >= f2) {
            float f5 = f3 / f4;
            if (f5 > ((float) 1)) {
                f2 = f / f5;
            } else {
                f = f2 * f5;
            }
        } else {
            f = f3;
            f2 = f4;
        }
        return new int[]{(int) f, (int) f2};
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.fragment.app.FragmentActivity
    public void onActivityResult(int i, int i2, Intent intent) {
        String str;
        ArrayList<String> stringArrayListExtra;
        super.onActivityResult(i, i2, intent);
        if (i == 1234) {
            if (intent == null || (stringArrayListExtra = intent.getStringArrayListExtra("SELECTED_PHOTOS")) == null) {
                str = null;
            } else {
                str = (String) CollectionsKt.getOrNull(stringArrayListExtra, 0);
            }
            m122804a(str);
        }
    }
}
