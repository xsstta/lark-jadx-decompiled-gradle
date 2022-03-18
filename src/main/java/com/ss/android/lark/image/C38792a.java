package com.ss.android.lark.image;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Looper;
import android.text.TextUtils;
import android.widget.ImageView;
import com.bumptech.glide.load.p085b.C2219g;
import com.bytedance.lark.pb.basic.v1.ImageSet;
import com.bytedance.lark.pb.basic.v1.RichTextElement;
import com.larksuite.framework.callback.AbstractC25974h;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.utils.C26311p;
import com.ss.android.lark.appreciablelib.Biz;
import com.ss.android.lark.appreciablelib.Scene;
import com.ss.android.lark.biz.core.api.C29548at;
import com.ss.android.lark.biz.core.api.EncryptImageData;
import com.ss.android.lark.biz.core.api.LoadParams;
import com.ss.android.lark.image.ImageLoader;
import com.ss.android.lark.image.api.C38813d;
import com.ss.android.lark.image.api.DiskCacheStrategy;
import com.ss.android.lark.image.api.IRequestCreator;
import com.ss.android.lark.image.entity.AvatarImage;
import com.ss.android.lark.image.entity.C38824b;
import com.ss.android.lark.image.entity.C38825c;
import com.ss.android.lark.image.entity.C38826d;
import com.ss.android.lark.image.entity.Image;
import com.ss.android.lark.image.entity.PassThroughImage;
import com.ss.android.lark.image.impl.C38871c;
import com.ss.android.lark.image.impl.C38882d;
import com.ss.android.lark.image.impl.p1961a.C38842b;
import com.ss.android.lark.image.impl.p1963c.C38880b;
import com.ss.android.lark.image.impl.p1964d.C38884a;
import com.ss.android.lark.image.impl.p1965e.C38890b;
import com.ss.android.lark.image.impl.p1966f.C38893b;
import com.ss.android.lark.image.impl.p1968h.C38905a;
import com.ss.android.lark.image.impl.p1968h.C38907b;
import com.ss.android.lark.image.impl.p1969i.C38911a;
import com.ss.android.lark.image.impl.p1969i.C38918b;
import com.ss.android.lark.image.impl.p1970j.C38921b;
import com.ss.android.lark.image.p1959b.AbstractC38820a;
import com.ss.android.lark.image.service.IImageManisService;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.C57820d;
import com.ss.android.lark.utils.ImageUtils;
import com.ss.android.lark.utils.rxjava.C57865c;
import com.ss.android.lark.utils.rxjava.LarkRxSchedulers;
import com.ss.ttm.player.MediaPlayer;
import ee.android.framework.manis.C68183b;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.p3456d.C68279a;
import java.io.File;
import java.io.InputStream;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import okio.ByteString;

/* renamed from: com.ss.android.lark.image.a */
public class C38792a {

    /* renamed from: a */
    private static AbstractC38820a f99724a;

    /* renamed from: a */
    public static AbstractC38820a m153106a() {
        return f99724a;
    }

    /* renamed from: a */
    public void mo142160a(Context context, File file, boolean z, final IGetDataCallback<C29548at> iGetDataCallback, Biz biz, Scene scene) {
        boolean z2 = Thread.currentThread() == Looper.getMainLooper().getThread();
        Observable<C29548at> a = C38911a.m153595a().mo142482a(context, file, z, biz, scene);
        if (z2) {
            a = a.subscribeOn(C68279a.m265023b()).observeOn(AndroidSchedulers.mainThread());
        }
        a.subscribe(new Consumer() {
            /* class com.ss.android.lark.image.$$Lambda$a$adcNgDxoX5OZroX5IHGigvETbzI */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                IGetDataCallback.this.onSuccess((C29548at) obj);
            }
        }, new Consumer<Throwable>() {
            /* class com.ss.android.lark.image.C38792a.C387931 */

            /* renamed from: a */
            public void accept(Throwable th) {
                iGetDataCallback.onError(new ErrorResult(th.getMessage()));
            }
        });
    }

    /* renamed from: a */
    public void mo142159a(Context context, File file, IGetDataCallback<C29548at> iGetDataCallback, Biz biz, Scene scene) {
        mo142160a(context, file, false, iGetDataCallback, biz, scene);
    }

    /* renamed from: a */
    public void mo142164a(final String str, final IGetDataCallback<Image> iGetDataCallback) {
        Observable.just(str).map(new Function<String, byte[]>() {
            /* class com.ss.android.lark.image.C38792a.C387996 */

            /* renamed from: a */
            public byte[] apply(String str) throws Exception {
                return C26311p.m95276a(str);
            }
        }).subscribeOn(LarkRxSchedulers.io()).subscribe(new Consumer<byte[]>() {
            /* class com.ss.android.lark.image.C38792a.C387964 */

            /* renamed from: a */
            public void accept(byte[] bArr) throws Exception {
                C38911a.m153595a().mo142486a(bArr, new IGetDataCallback<Image>() {
                    /* class com.ss.android.lark.image.C38792a.C387964.C387971 */

                    /* renamed from: a */
                    public void onSuccess(Image image) {
                        iGetDataCallback.onSuccess(image);
                    }

                    @Override // com.larksuite.framework.callback.IGetDataCallback
                    public void onError(ErrorResult errorResult) {
                        iGetDataCallback.onError(errorResult);
                    }
                });
            }
        }, new Consumer<Throwable>() {
            /* class com.ss.android.lark.image.C38792a.C387985 */

            /* renamed from: a */
            public void accept(Throwable th) throws Exception {
                iGetDataCallback.onError(new ErrorResult("upload photos fail!"));
            }
        });
    }

    /* renamed from: a */
    public void mo142163a(Context context, final String str, boolean z, final boolean z2, final AbstractC25974h hVar, final IGetDataCallback<EncryptImageData> iGetDataCallback) {
        boolean z3 = false;
        if (hVar != null) {
            hVar.onUpdateProgress(100, 0);
        }
        if (z2 || z) {
            z3 = true;
        }
        mo142162a(context, str, z3, new IGetDataCallback<C29548at>() {
            /* class com.ss.android.lark.image.C38792a.C388007 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                iGetDataCallback.onError(errorResult);
            }

            /* renamed from: a */
            public void onSuccess(C29548at atVar) {
                String e = atVar.mo105610e();
                if (TextUtils.isEmpty(e)) {
                    e = str;
                }
                File file = new File(e);
                int c = atVar.mo105608c();
                int d = atVar.mo105609d();
                AbstractC25974h hVar = hVar;
                if (hVar != null) {
                    hVar.onUpdateProgress(100, 30);
                }
                C38911a.m153595a().mo142485a(file, c, d, z2, new IGetDataCallback<String>() {
                    /* class com.ss.android.lark.image.C38792a.C388007.C388011 */

                    @Override // com.larksuite.framework.callback.IGetDataCallback
                    public void onError(ErrorResult errorResult) {
                        iGetDataCallback.onError(errorResult);
                    }

                    /* renamed from: a */
                    public void onSuccess(String str) {
                        EncryptImageData encryptImageData = new EncryptImageData();
                        encryptImageData.f73837a = str;
                        encryptImageData.f73838b = str;
                        iGetDataCallback.onSuccess(encryptImageData);
                        if (hVar != null) {
                            hVar.onUpdateProgress(100, 100);
                        }
                    }
                });
            }
        });
    }

    /* renamed from: a */
    public Observable<EncryptImageData> mo142152a(Context context, String str, boolean z, boolean z2, AbstractC25974h hVar, Biz biz, Scene scene) {
        if (hVar != null) {
            hVar.onUpdateProgress(100, 0);
        }
        return Observable.just(Boolean.valueOf(z)).flatMap(new Function(str, context, biz, scene) {
            /* class com.ss.android.lark.image.$$Lambda$a$tXAFxqDDWpvyq2XZ4b_yDAa3uys */
            public final /* synthetic */ String f$0;
            public final /* synthetic */ Context f$1;
            public final /* synthetic */ Biz f$2;
            public final /* synthetic */ Scene f$3;

            {
                this.f$0 = r1;
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
            }

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C38792a.m153109a(this.f$0, this.f$1, this.f$2, this.f$3, (Boolean) obj);
            }
        }).flatMap(new Function(z2) {
            /* class com.ss.android.lark.image.$$Lambda$a$MigktJKwO4yi8tVEEx66nBtvWU */
            public final /* synthetic */ boolean f$1;

            {
                this.f$1 = r2;
            }

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C38792a.m153108a(AbstractC25974h.this, this.f$1, (C29548at) obj);
            }
        }).map(new Function(str) {
            /* class com.ss.android.lark.image.$$Lambda$a$YYeCxYZGzSr72fwAmd3wriuomqo */
            public final /* synthetic */ String f$1;

            {
                this.f$1 = r2;
            }

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C38792a.m153105a(AbstractC25974h.this, this.f$1, (String) obj);
            }
        });
    }

    /* renamed from: a */
    public void mo142162a(Context context, final String str, final boolean z, final IGetDataCallback<C29548at> iGetDataCallback) {
        final long currentTimeMillis = System.currentTimeMillis();
        m153107a(context, str, z).subscribe(new Consumer<File>() {
            /* class com.ss.android.lark.image.C38792a.C388028 */

            /* renamed from: a */
            public void accept(File file) throws Exception {
                boolean z;
                String path = file.getPath();
                if (z || Objects.equals(str, path)) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    C38882d.m153451a(System.currentTimeMillis() - currentTimeMillis, str, path);
                }
                iGetDataCallback.onSuccess(new C29548at(file, C57820d.m224436b(file.getPath())));
            }
        }, new Consumer<Throwable>() {
            /* class com.ss.android.lark.image.C38792a.C388039 */

            /* renamed from: a */
            public void accept(Throwable th) throws Exception {
                C38882d.m153450a();
                iGetDataCallback.onError(new ErrorResult(new RuntimeException(th)));
            }
        });
    }

    /* renamed from: a */
    public void mo142157a(Context context, ImageView imageView, String str, LoadParams loadParams) {
        C38824b bVar = new C38824b(str);
        bVar.mo142317a(loadParams.mo105436j());
        C38871c.m153434a(context, imageView, bVar, loadParams);
    }

    /* renamed from: a */
    public void mo142158a(Context context, ImageView imageView, String str, String str2, LoadParams loadParams) {
        C38871c.m153434a(context, imageView, AvatarImage.Builder.obtain(str, str2, loadParams.mo105412a(), loadParams.mo105421b()).build(), loadParams);
    }

    /* renamed from: a */
    public File mo142153a(Context context, String str, Object obj, int i, int i2, boolean z) {
        return mo142154a(context, str, obj, i, i2, z, false);
    }

    /* renamed from: a */
    public File mo142154a(Context context, String str, Object obj, int i, int i2, boolean z, boolean z2) {
        try {
            if ((obj instanceof C38824b) && z) {
                ((C38824b) obj).mo142317a(true);
            }
            IRequestCreator onlyRetrieveFromCache = ImageLoader.with(context).load(obj).diskCacheStrategy(z ? DiskCacheStrategy.NONE : DiskCacheStrategy.ALL).onlyRetrieveFromCache(z2);
            if (i == 0) {
                i = Integer.MIN_VALUE;
            }
            if (i2 == 0) {
                i2 = Integer.MIN_VALUE;
            }
            File downloadOnly = onlyRetrieveFromCache.downloadOnly(i, i2);
            if (downloadOnly == null || TextUtils.isEmpty(str)) {
                return downloadOnly;
            }
            String path = downloadOnly.getPath();
            String str2 = str + "." + ImageUtils.m224131a(downloadOnly).getValue();
            C26311p.m95274a(path, str2);
            if (!TextUtils.isEmpty(str2)) {
                return new File(str2);
            }
            return downloadOnly;
        } catch (InterruptedException e) {
            e.printStackTrace();
            Log.m165384e("ImageModule", "downloadImage", e);
            return null;
        } catch (ExecutionException e2) {
            e2.printStackTrace();
            Log.m165384e("ImageModule", "downloadImage", e2);
            return null;
        }
    }

    /* renamed from: a */
    public void mo142161a(final Context context, final String str, final Object obj, final int i, final int i2, final IGetDataCallback<File> iGetDataCallback) {
        C57865c.m224574a(new C57865c.AbstractC57873d<File>() {
            /* class com.ss.android.lark.image.C38792a.AnonymousClass10 */

            /* renamed from: a */
            public File produce() {
                return C38792a.this.mo142153a(context, str, obj, i, i2, false);
            }
        }, new C57865c.AbstractC57871b<File>() {
            /* class com.ss.android.lark.image.C38792a.C387942 */

            /* renamed from: a */
            public void consume(File file) {
                if (file == null || !file.exists()) {
                    iGetDataCallback.onError(new ErrorResult("download image failed"));
                } else {
                    iGetDataCallback.onSuccess(file);
                }
            }
        });
    }

    /* renamed from: a */
    public String mo142155a(RichTextElement.ImageProperty imageProperty) {
        return C38918b.m153612a(imageProperty);
    }

    /* renamed from: a */
    public void mo142156a(Context context) {
        UICallbackExecutor.execute(new Runnable(context) {
            /* class com.ss.android.lark.image.$$Lambda$a$BFyhvLB4iCGGy8h5On2yJlE7wZg */
            public final /* synthetic */ Context f$0;

            {
                this.f$0 = r1;
            }

            public final void run() {
                ImageLoader.clearMemoryCache(this.f$0);
            }
        });
    }

    /* renamed from: b */
    public IImageManisService mo142166b() {
        return (IImageManisService) C68183b.m264839a().mo237086a(m153106a().mo142254a(), IImageManisService.class);
    }

    public C38792a(AbstractC38820a aVar) {
        f99724a = aVar;
    }

    /* renamed from: b */
    public Image mo142165b(ImageSet imageSet) {
        return C38918b.m153613b(imageSet);
    }

    /* renamed from: c */
    public ByteString mo142169c(ImageSet imageSet) {
        return C38918b.m153615c(imageSet);
    }

    /* renamed from: a */
    public Image mo142150a(com.bytedance.lark.pb.basic.v1.Image image) {
        return C38918b.m153610a(image);
    }

    /* renamed from: b */
    public String mo142167b(RichTextElement.ImageProperty imageProperty) {
        return C38918b.m153614b(imageProperty);
    }

    /* renamed from: a */
    private static Bitmap.CompressFormat m153104a(String str) {
        if (TextUtils.isEmpty(str)) {
            return Bitmap.CompressFormat.JPEG;
        }
        String lowerCase = str.toLowerCase();
        if (lowerCase.endsWith(".png")) {
            return Bitmap.CompressFormat.PNG;
        }
        if (lowerCase.endsWith(".webp")) {
            return Bitmap.CompressFormat.WEBP;
        }
        return Bitmap.CompressFormat.JPEG;
    }

    /* renamed from: a */
    public Image mo142151a(ImageSet imageSet) {
        return C38918b.m153611a(imageSet);
    }

    /* renamed from: a */
    public static void m153110a(Context context, boolean z) {
        ImageLoader.init(new ImageLoader.AbstractC38791a() {
            /* class com.ss.android.lark.image.C38792a.C387953 */

            @Override // com.ss.android.lark.image.ImageLoader.AbstractC38791a
            /* renamed from: a */
            public void mo142149a(String str, String str2) {
                Log.m165387e(str + "_" + str2, (Throwable) new Exception(str2), true);
            }
        });
        if (z) {
            ImageLoader.registerLoadModelHook(context, C2219g.class, InputStream.class, new C38905a.C38906a());
            ImageLoader.registerLoadModelHook(context, C38813d.class, InputStream.class, new C38907b.C38908a());
        }
        ImageLoader.registerLoadModelHook(context, AvatarImage.class, InputStream.class, new C38842b.C38843a());
        ImageLoader.registerLoadModelHook(context, C38825c.class, InputStream.class, new C38893b.C38894a());
        ImageLoader.registerLoadModelHook(context, C38824b.class, InputStream.class, new C38880b.C38881a());
        ImageLoader.registerLoadModelHook(context, C38826d.class, InputStream.class, new C38921b.C38922a());
        ImageLoader.registerLoadModelHook(context, PassThroughImage.class, InputStream.class, new C38890b.C38891a());
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ EncryptImageData m153105a(AbstractC25974h hVar, String str, String str2) throws Exception {
        if (hVar != null) {
            hVar.onUpdateProgress(100, 100);
        }
        EncryptImageData encryptImageData = new EncryptImageData();
        encryptImageData.f73837a = str;
        encryptImageData.f73838b = str2;
        return encryptImageData;
    }

    /* renamed from: a */
    private static Observable<File> m153107a(Context context, String str, boolean z) {
        File file = new File(str);
        ImageUtils.ImageType a = ImageUtils.m224131a(file);
        if (z || a == ImageUtils.ImageType.TYPE_GIF) {
            return Observable.just(file).subscribeOn(C68279a.m265023b()).observeOn(AndroidSchedulers.mainThread());
        }
        return C38884a.m153453a(context, file).mo142402b(MediaPlayer.MEDIA_PLAYER_OPTION_USE_CODEC_POOL).mo142399a(4).mo142400a(m153104a(str)).mo142401a();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ ObservableSource m153108a(AbstractC25974h hVar, boolean z, C29548at atVar) throws Exception {
        if (hVar != null) {
            hVar.onUpdateProgress(100, 30);
        }
        return C38911a.m153595a().mo142484a(atVar.f73941a, atVar.mo105608c(), atVar.mo105609d(), z);
    }

    /* renamed from: b */
    public void mo142168b(Context context, ImageView imageView, String str, LoadParams loadParams) {
        C38871c.m153434a(context, imageView, str, loadParams);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ ObservableSource m153109a(String str, Context context, Biz biz, Scene scene, Boolean bool) throws Exception {
        boolean z;
        if (bool.booleanValue() || ImageUtils.m224131a(new File(str)) == ImageUtils.ImageType.TYPE_GIF) {
            z = true;
        } else {
            z = false;
        }
        if (Boolean.valueOf(z).booleanValue()) {
            return C38911a.m153595a().mo142483a(new File(str));
        }
        return C38911a.m153595a().mo142481a(context, new File(str), biz, scene);
    }
}
