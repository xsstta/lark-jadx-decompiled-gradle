package com.ss.lark.android.avatar.ui;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.framework.utils.DeviceUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.image.ImageLoader;
import com.ss.android.lark.image.api.C38818i;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.C57881t;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.photoeditor.C59605a;
import com.ss.android.photoeditor.base.AbstractC59635g;
import io.reactivex.Observable;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.C68289a;
import io.reactivex.functions.Consumer;
import io.reactivex.p3456d.C68279a;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.collections.C69043h;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 /2\u00020\u0001:\u0002/0B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0017\u001a\u00020\u0016H\u0002J\u0014\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0006H\u0002J\u0012\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0016H\u0002J\u0012\u0010\u001e\u001a\u00020\u001c2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0006H\u0002J$\u0010\u001f\u001a\u00020\u00122\u0006\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#2\b\u0010$\u001a\u0004\u0018\u00010%H\u0016J\b\u0010&\u001a\u00020\u001cH\u0016J\b\u0010'\u001a\u00020\u001cH\u0016J\u001a\u0010(\u001a\u00020\u001c2\u0006\u0010)\u001a\u00020\u00122\b\u0010$\u001a\u0004\u0018\u00010%H\u0016J\u0006\u0010*\u001a\u00020\u001cJ\u0018\u0010+\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u0006H\u0002J\u000e\u0010,\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u0006J\u000e\u0010-\u001a\u00020\u001c2\u0006\u0010.\u001a\u00020\u000eR\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0007\u001a\u00020\b8BX\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X.¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u00061"}, d2 = {"Lcom/ss/lark/android/avatar/ui/AvatarCropFragment;", "Landroidx/fragment/app/Fragment;", "needCropSquare", "", "(Z)V", "mAvatarPath", "", "mCompositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "getMCompositeDisposable", "()Lio/reactivex/disposables/CompositeDisposable;", "mCompositeDisposable$delegate", "Lkotlin/Lazy;", "mCropCallback", "Lcom/ss/lark/android/avatar/ui/AvatarCropFragment$ICropAvatarCallback;", "mEditorContainer", "Landroid/widget/FrameLayout;", "mLoadingView", "Landroid/view/View;", "mPhotoEditor", "Lcom/ss/android/photoeditor/base/IPhotoEditor;", "cropToSquare", "Landroid/graphics/Bitmap;", "bitmap", "getPreviewBounds", "", "path", "handleResultBmp", "", "resultBmp", "loadBitmap", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onDestroyView", "onViewCreated", "view", "refreshImage", "saveToFile", "setAvatarPath", "setCropCallback", "cropCallback", "Companion", "ICropAvatarCallback", "core_avatar_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.lark.android.avatar.ui.a */
public final class AvatarCropFragment extends Fragment {

    /* renamed from: f */
    public static final Companion f162374f = new Companion(null);

    /* renamed from: a */
    public AbstractC59635g f162375a;

    /* renamed from: b */
    public ICropAvatarCallback f162376b;

    /* renamed from: c */
    public FrameLayout f162377c;

    /* renamed from: d */
    public View f162378d;

    /* renamed from: e */
    public final boolean f162379e;

    /* renamed from: g */
    private String f162380g;

    /* renamed from: h */
    private final Lazy f162381h = LazyKt.lazy(C64227d.INSTANCE);

    /* renamed from: i */
    private HashMap f162382i;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0006H&J\b\u0010\t\u001a\u00020\u0003H&¨\u0006\n"}, d2 = {"Lcom/ss/lark/android/avatar/ui/AvatarCropFragment$ICropAvatarCallback;", "", "onCropCancel", "", "onCropFail", "msg", "", "onCropSuccess", "path", "onLoadImageFail", "core_avatar_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.lark.android.avatar.ui.a$b */
    public interface ICropAvatarCallback {
        /* renamed from: a */
        void mo222634a();

        /* renamed from: a */
        void mo222635a(String str);

        /* renamed from: b */
        void mo222636b();

        /* renamed from: b */
        void mo222637b(String str);
    }

    /* renamed from: c */
    private final C68289a m252619c() {
        return (C68289a) this.f162381h.getValue();
    }

    /* renamed from: b */
    public void mo222679b() {
        HashMap hashMap = this.f162382i;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/ss/lark/android/avatar/ui/AvatarCropFragment$Companion;", "", "()V", "AVATAR_MAX_SIZE", "", "TAG", "", "core_avatar_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.lark.android.avatar.ui.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lio/reactivex/disposables/CompositeDisposable;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.lark.android.avatar.ui.a$d */
    static final class C64227d extends Lambda implements Function0<C68289a> {
        public static final C64227d INSTANCE = new C64227d();

        C64227d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C68289a invoke() {
            return new C68289a();
        }
    }

    /* renamed from: a */
    public final void mo222674a() {
        m252618b(this.f162380g);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        m252619c().dispose();
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        AbstractC59635g gVar = this.f162375a;
        if (gVar != null) {
            gVar.mo203028a();
        }
        mo222679b();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\u0006"}, d2 = {"com/ss/lark/android/avatar/ui/AvatarCropFragment$loadBitmap$1", "Lcom/ss/android/lark/image/api/SimpleTarget;", "Landroid/graphics/Bitmap;", "onResourceReady", "", "resource", "core_avatar_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.lark.android.avatar.ui.a$c */
    public static final class C64225c extends C38818i<Bitmap> {

        /* renamed from: a */
        final /* synthetic */ AvatarCropFragment f162383a;

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/graphics/Bitmap;", "kotlin.jvm.PlatformType", "onFinalEdit"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.lark.android.avatar.ui.a$c$a */
        public static final class C64226a implements AbstractC59635g.AbstractC59636a {

            /* renamed from: a */
            final /* synthetic */ C64225c f162384a;

            C64226a(C64225c cVar) {
                this.f162384a = cVar;
            }

            @Override // com.ss.android.photoeditor.base.AbstractC59635g.AbstractC59636a
            /* renamed from: a */
            public final void mo117785a(Bitmap bitmap) {
                this.f162384a.f162383a.mo222675a(bitmap);
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C64225c(AvatarCropFragment aVar) {
            this.f162383a = aVar;
        }

        /* renamed from: a */
        public void mo49248a(Bitmap bitmap) {
            FragmentActivity activity = this.f162383a.getActivity();
            if (activity != null) {
                Intrinsics.checkExpressionValueIsNotNull(activity, "activity ?: return");
                AvatarCropFragment.m252615a(this.f162383a).setVisibility(8);
                this.f162383a.f162375a = new C59605a.C59607a().mo203033a(activity).mo203035a(AvatarCropFragment.m252617b(this.f162383a)).mo203034a(bitmap).mo203039a(new String[]{"crop_and_rotate_plugin"}).mo203040a().mo203027a(new C64226a(this));
            }
        }
    }

    public AvatarCropFragment(boolean z) {
        this.f162379e = z;
    }

    /* renamed from: a */
    public static final /* synthetic */ View m252615a(AvatarCropFragment aVar) {
        View view = aVar.f162378d;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mLoadingView");
        }
        return view;
    }

    /* renamed from: b */
    public static final /* synthetic */ FrameLayout m252617b(AvatarCropFragment aVar) {
        FrameLayout frameLayout = aVar.f162377c;
        if (frameLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mEditorContainer");
        }
        return frameLayout;
    }

    /* renamed from: a */
    public final void mo222676a(ICropAvatarCallback bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "cropCallback");
        this.f162376b = bVar;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "file", "Ljava/io/File;", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.lark.android.avatar.ui.a$f */
    public static final class C64229f<T> implements Consumer<File> {

        /* renamed from: a */
        final /* synthetic */ AvatarCropFragment f162388a;

        C64229f(AvatarCropFragment aVar) {
            this.f162388a = aVar;
        }

        /* renamed from: a */
        public final void accept(File file) {
            StringBuilder sb = new StringBuilder();
            sb.append("Save succeed after edit: ");
            Intrinsics.checkExpressionValueIsNotNull(file, "file");
            sb.append(file.getAbsolutePath());
            Log.m165389i("AvatarCropFragment", sb.toString());
            ICropAvatarCallback bVar = this.f162388a.f162376b;
            if (bVar != null) {
                String absolutePath = file.getAbsolutePath();
                Intrinsics.checkExpressionValueIsNotNull(absolutePath, "file.absolutePath");
                bVar.mo222635a(absolutePath);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "throwable", "", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.lark.android.avatar.ui.a$g */
    public static final class C64230g<T> implements Consumer<Throwable> {

        /* renamed from: a */
        final /* synthetic */ AvatarCropFragment f162389a;

        C64230g(AvatarCropFragment aVar) {
            this.f162389a = aVar;
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            Log.m165383e("AvatarCropFragment", "Save failed : " + th);
            ICropAvatarCallback bVar = this.f162389a.f162376b;
            if (bVar != null) {
                String string = UIHelper.getString(R.string.Lark_Legacy_UcropUploadingAvatarFail);
                Intrinsics.checkExpressionValueIsNotNull(string, "UIHelper.getString(R.str…UcropUploadingAvatarFail)");
                bVar.mo222637b(string);
            }
        }
    }

    /* renamed from: b */
    private final void m252618b(String str) {
        boolean z;
        String str2 = str;
        if (str2 == null || str2.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            int[] c = m252620c(str);
            if (c == null) {
                ICropAvatarCallback bVar = this.f162376b;
                if (bVar != null) {
                    bVar.mo222636b();
                    return;
                }
                return;
            }
            View view = this.f162378d;
            if (view == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mLoadingView");
            }
            view.setVisibility(0);
            ImageLoader.with(this).load(new File(str)).asBitmap().override(c[0], c[1]).into(new C64225c(this));
        }
    }

    /* renamed from: a */
    public final void mo222675a(Bitmap bitmap) {
        String str = C57881t.m224606E(getActivity()) + System.currentTimeMillis() + ".jpg";
        if (bitmap != null) {
            m252616a(bitmap, str);
            return;
        }
        ICropAvatarCallback bVar = this.f162376b;
        if (bVar != null) {
            bVar.mo222634a();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0014\u0010\u0002\u001a\u0010\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u00040\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "emitter", "Lio/reactivex/ObservableEmitter;", "Ljava/io/File;", "kotlin.jvm.PlatformType", "subscribe"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.lark.android.avatar.ui.a$e */
    public static final class C64228e<T> implements ObservableOnSubscribe<File> {

        /* renamed from: a */
        final /* synthetic */ AvatarCropFragment f162385a;

        /* renamed from: b */
        final /* synthetic */ String f162386b;

        /* renamed from: c */
        final /* synthetic */ Bitmap f162387c;

        C64228e(AvatarCropFragment aVar, String str, Bitmap bitmap) {
            this.f162385a = aVar;
            this.f162386b = str;
            this.f162387c = bitmap;
        }

        /* JADX WARNING: Removed duplicated region for block: B:28:0x0085 A[SYNTHETIC, Splitter:B:28:0x0085] */
        /* JADX WARNING: Removed duplicated region for block: B:33:0x0095 A[SYNTHETIC, Splitter:B:33:0x0095] */
        /* JADX WARNING: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
        @Override // io.reactivex.ObservableOnSubscribe
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void subscribe(io.reactivex.ObservableEmitter<java.io.File> r7) {
            /*
            // Method dump skipped, instructions count: 165
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.lark.android.avatar.ui.AvatarCropFragment.C64228e.subscribe(io.reactivex.ObservableEmitter):void");
        }
    }

    /* renamed from: c */
    private final int[] m252620c(String str) {
        float[] fArr;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        if (str == null || this.f162377c == null) {
            return null;
        }
        FrameLayout frameLayout = this.f162377c;
        if (frameLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mEditorContainer");
        }
        float screenWidth = (float) DeviceUtils.getScreenWidth(frameLayout.getContext());
        if (frameLayout.getWidth() > 0) {
            screenWidth = (float) frameLayout.getWidth();
        }
        float screenHeight = (float) DeviceUtils.getScreenHeight(frameLayout.getContext());
        if (frameLayout.getHeight() > 0) {
            screenHeight = (float) frameLayout.getHeight();
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(new File(str).getPath(), options);
        float f = (float) options.outWidth;
        float f2 = (float) options.outHeight;
        if (f2 >= screenHeight || f >= screenWidth) {
            float f3 = f / f2;
            fArr = f3 > ((float) 1) ? new float[]{screenWidth, screenWidth / f3} : new float[]{f3 * screenHeight, screenHeight};
        } else {
            fArr = new float[]{f, f2};
        }
        int length = fArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                z = true;
                break;
            }
            if (fArr[i] > 1080.0f) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (!z4) {
                z = false;
                break;
            }
            i++;
        }
        if (z) {
            ArrayList arrayList = new ArrayList(fArr.length);
            for (float f4 : fArr) {
                float f5 = f4 * 1080.0f;
                Float d = C69043h.m265777d(fArr);
                if (d == null) {
                    Intrinsics.throwNpe();
                }
                arrayList.add(Float.valueOf(f5 / d.floatValue()));
            }
        }
        int length2 = fArr.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length2) {
                z2 = false;
                break;
            }
            if (fArr[i2] <= BitmapDescriptorFactory.HUE_RED) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3) {
                z2 = true;
                break;
            }
            i2++;
        }
        if (z2) {
            return null;
        }
        return new int[]{(int) fArr[0], (int) fArr[1]};
    }

    /* renamed from: a */
    public final void mo222677a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "path");
        this.f162380g = str;
    }

    /* renamed from: b */
    public final Bitmap mo222678b(Bitmap bitmap) {
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
        try {
            Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, i, max, true);
            Intrinsics.checkExpressionValueIsNotNull(createScaledBitmap, "Bitmap.createScaledBitma…idth, scaledHeight, true)");
            Bitmap createBitmap = Bitmap.createBitmap(createScaledBitmap, (i - min) / 2, (max - min) / 2, min, min);
            createScaledBitmap.recycle();
            return createBitmap;
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    private final void m252616a(Bitmap bitmap, String str) {
        m252619c().mo237937a(Observable.create(new C64228e(this, str, bitmap)).subscribeOn(C68279a.m265023b()).observeOn(AndroidSchedulers.mainThread()).subscribe(new C64229f(this), new C64230g(this)));
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.onViewCreated(view, bundle);
        View findViewById = view.findViewById(R.id.fl_container);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "view.findViewById(R.id.fl_container)");
        this.f162377c = (FrameLayout) findViewById;
        View findViewById2 = view.findViewById(R.id.loading);
        Intrinsics.checkExpressionValueIsNotNull(findViewById2, "view.findViewById(R.id.loading)");
        this.f162378d = findViewById2;
        m252618b(this.f162380g);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.avatar_fragment_crop, viewGroup, false);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "inflater.inflate(R.layou…t_crop, container, false)");
        return inflate;
    }
}
