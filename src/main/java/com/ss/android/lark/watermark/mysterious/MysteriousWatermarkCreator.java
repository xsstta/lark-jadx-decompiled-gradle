package com.ss.android.lark.watermark.mysterious;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.larksuite.framework.utils.UIUtils;
import com.ss.android.lark.image.ImageLoader;
import com.ss.android.lark.image.api.C38818i;
import com.ss.android.lark.watermark.dto.WatermarkInfo;
import com.ss.android.lark.watermark.p2925b.C58244b;
import com.ss.android.lark.watermark.p2929f.AbstractC58289c;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J*\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\n0\b2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002J(\u0010\u000f\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\f2\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012H\u0015J\u001e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\t0\u00152\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/ss/android/lark/watermark/mysterious/MysteriousWatermarkCreator;", "Lcom/ss/android/lark/watermark/creator/WatermarkCreator;", "composer", "Lcom/ss/android/lark/watermark/mysterious/MysteriousWatermarkContentComposer;", "(Lcom/ss/android/lark/watermark/mysterious/MysteriousWatermarkContentComposer;)V", "painter", "Lcom/ss/android/lark/watermark/mysterious/MysteriousWatermarkPainter;", "composeHiddenWatermark", "Lio/reactivex/functions/Function;", "Landroid/graphics/Bitmap;", "Lio/reactivex/ObservableSource;", "watermarkInfo", "Lcom/ss/android/lark/watermark/dto/WatermarkInfo;", "context", "Landroid/content/Context;", "createDrawable", "", "callback", "Lcom/ss/android/lark/watermark/util/IGetDataCallback;", "Landroid/graphics/drawable/Drawable;", "createWatermarkBitmap", "Lio/reactivex/ObservableOnSubscribe;", "core_watermark_watermark_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.watermark.mysterious.b */
public final class MysteriousWatermarkCreator extends C58244b {

    /* renamed from: a */
    public final MysteriousWatermarkPainter f143300a = new MysteriousWatermarkPainter();

    /* renamed from: b */
    public final MysteriousWatermarkContentComposer f143301b;

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0002H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lio/reactivex/Observable;", "Landroid/graphics/Bitmap;", "kotlin.jvm.PlatformType", "watermark", "apply"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.watermark.mysterious.b$a */
    public static final class C58291a<T, R> implements Function<Bitmap, ObservableSource<Bitmap>> {

        /* renamed from: a */
        final /* synthetic */ MysteriousWatermarkCreator f143302a;

        /* renamed from: b */
        final /* synthetic */ WatermarkInfo f143303b;

        /* renamed from: c */
        final /* synthetic */ Context f143304c;

        C58291a(MysteriousWatermarkCreator bVar, WatermarkInfo watermarkInfo, Context context) {
            this.f143302a = bVar;
            this.f143303b = watermarkInfo;
            this.f143304c = context;
        }

        /* renamed from: a */
        public final Observable<Bitmap> apply(final Bitmap bitmap) {
            Intrinsics.checkParameterIsNotNull(bitmap, "watermark");
            return Observable.create(new ObservableOnSubscribe<Bitmap>(this) {
                /* class com.ss.android.lark.watermark.mysterious.MysteriousWatermarkCreator.C58291a.C582921 */

                /* renamed from: a */
                final /* synthetic */ C58291a f143305a;

                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\b¸\u0006\t"}, d2 = {"com/ss/android/lark/watermark/mysterious/MysteriousWatermarkCreator$composeHiddenWatermark$1$1$subscribe$1$1$1", "Lcom/ss/android/lark/image/api/SimpleTarget;", "Landroid/graphics/drawable/BitmapDrawable;", "onLoadFailed", "", "p0", "Landroid/graphics/drawable/Drawable;", "onResourceReady", "core_watermark_watermark_release", "com/ss/android/lark/watermark/mysterious/MysteriousWatermarkCreator$composeHiddenWatermark$1$1$$special$$inlined$let$lambda$1"}, mo238835k = 1, mv = {1, 1, 16})
                /* renamed from: com.ss.android.lark.watermark.mysterious.b$a$1$a */
                public static final class C58293a extends C38818i<BitmapDrawable> {

                    /* renamed from: a */
                    final /* synthetic */ C582921 f143307a;

                    /* renamed from: b */
                    final /* synthetic */ ObservableEmitter f143308b;

                    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: io.reactivex.ObservableEmitter */
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // com.ss.android.lark.image.api.AbstractC38819j, com.ss.android.lark.image.api.C38818i
                    /* renamed from: a */
                    public void mo49247a(Drawable drawable) {
                        this.f143308b.onNext(bitmap);
                    }

                    /* JADX DEBUG: Multi-variable search result rejected for r4v1, resolved type: io.reactivex.ObservableEmitter */
                    /* JADX WARN: Multi-variable type inference failed */
                    /* renamed from: a */
                    public void mo49248a(BitmapDrawable bitmapDrawable) {
                        if (bitmapDrawable != null) {
                            MysteriousWatermarkPainter dVar = this.f143307a.f143305a.f143302a.f143300a;
                            Bitmap bitmap = bitmapDrawable.getBitmap();
                            Intrinsics.checkExpressionValueIsNotNull(bitmap, "p0.bitmap");
                            Bitmap bitmap2 = bitmap;
                            Intrinsics.checkExpressionValueIsNotNull(bitmap2, "watermark");
                            dVar.mo197411a(bitmap, bitmap2);
                        }
                        this.f143308b.onNext(bitmap);
                    }

                    C58293a(C582921 r1, ObservableEmitter observableEmitter) {
                        this.f143307a = r1;
                        this.f143308b = observableEmitter;
                    }
                }

                @Override // io.reactivex.ObservableOnSubscribe
                public void subscribe(ObservableEmitter<Bitmap> observableEmitter) {
                    Intrinsics.checkParameterIsNotNull(observableEmitter, "emitter");
                    WatermarkInfo watermarkInfo = this.f143305a.f143303b;
                    if (!(watermarkInfo instanceof MysteriousWatermarkInfo)) {
                        watermarkInfo = null;
                    }
                    MysteriousWatermarkInfo mysteriousWatermarkInfo = (MysteriousWatermarkInfo) watermarkInfo;
                    if (mysteriousWatermarkInfo != null) {
                        String a = mysteriousWatermarkInfo.mo197386a();
                        if (a != null) {
                            ImageLoader.with(this.f143305a.f143304c).asBitmap().load(a).into(new C58293a(this, observableEmitter));
                        }
                        if (mysteriousWatermarkInfo.mo197386a() == null) {
                            observableEmitter.onNext(bitmap);
                        }
                    }
                }

                {
                    this.f143305a = r1;
                }
            });
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "watermark", "Landroid/graphics/Bitmap;", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.watermark.mysterious.b$b */
    static final class C58294b<T> implements Consumer<Bitmap> {

        /* renamed from: a */
        final /* synthetic */ MysteriousWatermarkCreator f143309a;

        /* renamed from: b */
        final /* synthetic */ Context f143310b;

        /* renamed from: c */
        final /* synthetic */ AbstractC58289c f143311c;

        C58294b(MysteriousWatermarkCreator bVar, Context context, AbstractC58289c cVar) {
            this.f143309a = bVar;
            this.f143310b = context;
            this.f143311c = cVar;
        }

        /* renamed from: a */
        public final void accept(Bitmap bitmap) {
            MysteriousWatermarkPainter dVar = this.f143309a.f143300a;
            Context context = this.f143310b;
            Intrinsics.checkExpressionValueIsNotNull(bitmap, "watermark");
            BitmapDrawable a = dVar.mo197410a(context, bitmap);
            AbstractC58289c cVar = this.f143311c;
            if (cVar != null) {
                cVar.mo197242a(a);
            }
        }
    }

    public MysteriousWatermarkCreator(MysteriousWatermarkContentComposer aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "composer");
        this.f143301b = aVar;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0014\u0010\u0002\u001a\u0010\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u00040\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "emitter", "Lio/reactivex/ObservableEmitter;", "Landroid/graphics/Bitmap;", "kotlin.jvm.PlatformType", "subscribe"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.watermark.mysterious.b$c */
    public static final class C58295c<T> implements ObservableOnSubscribe<Bitmap> {

        /* renamed from: a */
        final /* synthetic */ MysteriousWatermarkCreator f143312a;

        /* renamed from: b */
        final /* synthetic */ WatermarkInfo f143313b;

        /* renamed from: c */
        final /* synthetic */ Context f143314c;

        C58295c(MysteriousWatermarkCreator bVar, WatermarkInfo watermarkInfo, Context context) {
            this.f143312a = bVar;
            this.f143313b = watermarkInfo;
            this.f143314c = context;
        }

        @Override // io.reactivex.ObservableOnSubscribe
        public final void subscribe(ObservableEmitter<Bitmap> observableEmitter) {
            Intrinsics.checkParameterIsNotNull(observableEmitter, "emitter");
            String a = this.f143312a.f143301b.mo197392a(this.f143313b.getWatermarkContent());
            int color = UIUtils.getColor(this.f143314c, this.f143313b.getBgColor());
            float alpha = this.f143313b.getAlpha();
            if (a.length() < 5) {
                a = a + "      ";
            }
            observableEmitter.onNext(this.f143312a.f143300a.mo197409a(this.f143314c, a, 14, color, alpha));
        }
    }

    /* renamed from: a */
    private final Function<Bitmap, ObservableSource<Bitmap>> m226032a(WatermarkInfo watermarkInfo, Context context) {
        return new C58291a(this, watermarkInfo, context);
    }

    /* renamed from: b */
    private final ObservableOnSubscribe<Bitmap> m226033b(WatermarkInfo watermarkInfo, Context context) {
        return new C58295c(this, watermarkInfo, context);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.watermark.p2925b.C58244b
    /* renamed from: b */
    public void mo197297b(Context context, WatermarkInfo watermarkInfo, AbstractC58289c<Drawable> cVar) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(watermarkInfo, "watermarkInfo");
        Observable.create(m226033b(watermarkInfo, context)).flatMap(m226032a(watermarkInfo, context)).subscribe(new C58294b(this, context, cVar));
    }
}
