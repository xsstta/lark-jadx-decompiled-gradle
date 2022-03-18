package com.ss.android.lark.image.impl.p1969i;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.basic.v1.ImageSet;
import com.bytedance.lark.pb.media.v1.GetImageCompressParametersRequest;
import com.bytedance.lark.pb.media.v1.GetImageCompressParametersResponse;
import com.bytedance.lark.pb.media.v1.UploadImageRequest;
import com.bytedance.lark.pb.media.v1.UploadImageResponse;
import com.bytedance.lark.pb.media.v1.UploadSecureImageRequest;
import com.bytedance.lark.pb.media.v1.UploadSecureImageResponse;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.utils.C26311p;
import com.ss.android.lark.appreciablelib.Biz;
import com.ss.android.lark.appreciablelib.Scene;
import com.ss.android.lark.biz.core.api.C29548at;
import com.ss.android.lark.image.C38792a;
import com.ss.android.lark.image.entity.Image;
import com.ss.android.lark.image.impl.ImageCompressHitPoint;
import com.ss.android.lark.image.impl.p1962b.C38852d;
import com.ss.android.lark.image.impl.p1962b.C38864l;
import com.ss.android.lark.image.impl.p1964d.C38884a;
import com.ss.android.lark.sdk.C53241h;
import com.ss.android.lark.sdk.SdkSender;
import com.ss.android.lark.utils.C57820d;
import com.ss.android.lark.utils.C57881t;
import com.ss.android.lark.utils.ImageUtils;
import com.ss.android.lark.utils.p2904a.C57760a;
import com.ss.ttm.player.MediaPlayer;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.Callable;
import okio.ByteString;

/* renamed from: com.ss.android.lark.image.impl.i.a */
public class C38911a {

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.image.impl.i.a$a */
    public static final class C38917a {

        /* renamed from: a */
        public static final C38911a f100009a = new C38911a();
    }

    /* renamed from: a */
    public static C38911a m153595a() {
        return C38917a.f100009a;
    }

    /* renamed from: a */
    public int[] mo142487a(long j, int i, int i2, int i3) {
        return (int[]) SdkSender.syncSend(Command.GET_IMAGE_COMPRESS_PARAMETERS, new GetImageCompressParametersRequest.C18242a().mo63214a(Integer.valueOf(i)).mo63217b(Integer.valueOf(i2)).mo63218c(Integer.valueOf(i3)).mo63215a(Long.valueOf(j)), $$Lambda$a$Y328KY9wTOsVuP_xO9_zH3e6ntQ.INSTANCE);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ C29548at m153597b(File file) throws Exception {
        return new C29548at(file, C57820d.m224436b(file.getPath()));
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static /* synthetic */ C29548at m153598c(File file) throws Exception {
        return new C29548at(file, C57820d.m224436b(file.getPath()));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ int[] m153596a(byte[] bArr) throws IOException {
        GetImageCompressParametersResponse decode = GetImageCompressParametersResponse.ADAPTER.decode(bArr);
        return new int[]{decode.short_side.intValue(), decode.quality.intValue()};
    }

    /* renamed from: a */
    private static Bitmap.CompressFormat m153594a(String str) {
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
    public Observable<C29548at> mo142483a(File file) {
        return Observable.fromCallable(new Callable(file) {
            /* class com.ss.android.lark.image.impl.p1969i.$$Lambda$a$JXyMYaZIdnQJ71HtKoVTOuBa6dY */
            public final /* synthetic */ File f$0;

            {
                this.f$0 = r1;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C38911a.m153597b(this.f$0);
            }
        });
    }

    /* renamed from: a */
    public void mo142486a(byte[] bArr, IGetDataCallback<Image> iGetDataCallback) {
        SdkSender.asynSendRequestNonWrap(Command.UPLOAD_IMAGE, new UploadImageRequest.C18304a().mo63379a(ByteString.of(bArr)), new C57760a(iGetDataCallback), new SdkSender.IParser<Image>() {
            /* class com.ss.android.lark.image.impl.p1969i.C38911a.C389132 */

            /* renamed from: a */
            public Image parse(byte[] bArr) throws IOException {
                com.bytedance.lark.pb.basic.v1.Image image;
                ImageSet imageSet = UploadImageResponse.ADAPTER.decode(bArr).image_set;
                if (imageSet == null) {
                    image = null;
                } else {
                    image = imageSet.origin;
                }
                return C38918b.m153610a(image);
            }
        });
    }

    /* renamed from: a */
    public Observable<C29548at> mo142481a(Context context, File file, Biz biz, Scene scene) {
        return mo142482a(context, file, false, biz, scene);
    }

    /* renamed from: a */
    public Observable<String> mo142484a(final File file, final int i, final int i2, final boolean z) {
        return Observable.create(new ObservableOnSubscribe<String>() {
            /* class com.ss.android.lark.image.impl.p1969i.C38911a.C389154 */

            @Override // io.reactivex.ObservableOnSubscribe
            public void subscribe(final ObservableEmitter<String> observableEmitter) throws Exception {
                C38911a.this.mo142485a(file, i, i2, z, new IGetDataCallback<String>() {
                    /* class com.ss.android.lark.image.impl.p1969i.C38911a.C389154.C389161 */

                    @Override // com.larksuite.framework.callback.IGetDataCallback
                    public void onError(ErrorResult errorResult) {
                        observableEmitter.onError(errorResult);
                    }

                    /* renamed from: a */
                    public void onSuccess(String str) {
                        observableEmitter.onNext(str);
                        observableEmitter.onComplete();
                    }
                });
            }
        });
    }

    /* renamed from: a */
    public Observable<C29548at> mo142482a(final Context context, final File file, final boolean z, final Biz biz, final Scene scene) {
        if (C38792a.m153106a().mo142263b("lark.image.compress.v2")) {
            return Observable.fromCallable(new Callable<C29548at>() {
                /* class com.ss.android.lark.image.impl.p1969i.C38911a.CallableC389121 */

                /* renamed from: a */
                public C29548at call() throws Exception {
                    String str;
                    boolean z;
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    C38864l a = C38864l.m153397a(context).mo142375a(new C38919c());
                    if (z) {
                        str = C57881t.m224608G(context);
                    } else {
                        str = null;
                    }
                    C38852d a2 = a.mo142376a(str).mo142374a(file);
                    long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
                    String value = ImageUtils.m224131a(a2.f99825b).getValue();
                    Biz biz = biz;
                    Scene scene = scene;
                    String valueOf = String.valueOf(elapsedRealtime2);
                    if (a2.f99824a == null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    ImageCompressHitPoint.m153345a(biz, scene, valueOf, z, value, a2.f99831h, (long) a2.f99829f, (long) a2.f99830g, a2.f99828e, (long) a2.f99826c, (long) a2.f99827d, 1, 0);
                    if (a2.f99824a == null) {
                        C53241h.m205898b("ImageService", String.format("compress image success: [%d,%d] -> [%d, %d], ratio: %.2f%%, out: %.1fKB, cost: %dms", Integer.valueOf(a2.f99829f), Integer.valueOf(a2.f99830g), Integer.valueOf(a2.f99826c), Integer.valueOf(a2.f99827d), Float.valueOf(a2.mo142350a() * 100.0f), Float.valueOf((((float) a2.f99828e) * 1.0f) / 1024.0f), Long.valueOf(elapsedRealtime2)));
                        return new C29548at(a2.f99825b, new int[]{a2.f99826c, a2.f99827d});
                    }
                    throw new IllegalStateException(a2.f99824a);
                }
            });
        }
        return C38884a.m153453a(context, file).mo142402b(MediaPlayer.MEDIA_PLAYER_OPTION_USE_CODEC_POOL).mo142399a(4).mo142400a(m153594a(file.getAbsolutePath())).mo142401a().map($$Lambda$a$LCTCXBGgrjHNB9FkwnaoqixwqzA.INSTANCE);
    }

    /* renamed from: a */
    public void mo142485a(File file, int i, int i2, boolean z, IGetDataCallback<String> iGetDataCallback) {
        UploadSecureImageRequest.Type type;
        byte[] a = C26311p.m95276a(file.getAbsolutePath());
        if (z) {
            type = UploadSecureImageRequest.Type.POST;
        } else {
            type = UploadSecureImageRequest.Type.NORMAL;
        }
        SdkSender.asynSendRequestNonWrap(Command.UPLOAD_SECURE_IMAGE, new UploadSecureImageRequest.C18312a().mo63399a(Integer.valueOf(i)).mo63402b(Integer.valueOf(i2)).mo63400a(ByteString.of(a)).mo63398a(type), new C57760a(iGetDataCallback), new SdkSender.IParser<String>() {
            /* class com.ss.android.lark.image.impl.p1969i.C38911a.C389143 */

            /* renamed from: a */
            public String parse(byte[] bArr) throws IOException {
                UploadSecureImageResponse decode = UploadSecureImageResponse.ADAPTER.decode(bArr);
                String str = decode.token;
                decode.width.intValue();
                decode.height.intValue();
                return str;
            }
        });
    }
}
