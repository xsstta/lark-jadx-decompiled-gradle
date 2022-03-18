package com.bytedance.ee.bear.sheet.exportimage.imagedataprocessor;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.Base64;
import com.bytedance.ee.bear.screenshot.FastPngEncoder;
import com.bytedance.ee.bear.thread.BearExecutors;
import com.bytedance.ee.log.C13479a;
import com.google.firebase.messaging.Constants;
import java.io.File;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Future;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u00002\u00020\u0001:\u0002=>B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u000e\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/J\"\u00100\u001a\u0004\u0018\u00010\u000e2\u0006\u00101\u001a\u00020\u00062\u0006\u00102\u001a\u00020\u00032\u0006\u00103\u001a\u00020\u0003H\u0002J\u0006\u00104\u001a\u00020-J\u0006\u00105\u001a\u000206J\u0010\u00107\u001a\u00020-2\u0006\u00108\u001a\u00020\u0006H\u0002J\b\u00109\u001a\u00020-H\u0002J\b\u0010:\u001a\u00020-H\u0002J\b\u0010;\u001a\u00020-H\u0002J\u0006\u0010<\u001a\u00020-R\u000e\u0010\b\u001a\u00020\u0003XD¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0003XD¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u00020\u0006XD¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010$\u001a\b\u0012\u0004\u0012\u00020&0%X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010'\u001a\b\u0012\u0004\u0012\u00020(0%X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010)\u001a\b\u0012\u0002\b\u0003\u0018\u00010*X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010+\u001a\b\u0012\u0002\b\u0003\u0018\u00010*X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006?"}, d2 = {"Lcom/bytedance/ee/bear/sheet/exportimage/imagedataprocessor/ImageDataProcessor;", "", "totalWidth", "", "totalHeight", "filePath", "", "(IILjava/lang/String;)V", "MAX_BLOCKING_SIZE", "MAX_LINE_BLOCK_BLOCKING_SIZE", "TAG", "getTAG", "()Ljava/lang/String;", "currLineBitmap", "Landroid/graphics/Bitmap;", "getCurrLineBitmap", "()Landroid/graphics/Bitmap;", "setCurrLineBitmap", "(Landroid/graphics/Bitmap;)V", "currLineCanvas", "Landroid/graphics/Canvas;", "getCurrLineCanvas", "()Landroid/graphics/Canvas;", "setCurrLineCanvas", "(Landroid/graphics/Canvas;)V", "currLineUsedWidth", "getCurrLineUsedWidth", "()I", "setCurrLineUsedWidth", "(I)V", "exportImageListener", "Lcom/bytedance/ee/bear/sheet/exportimage/imagedataprocessor/ExportImageListener;", "getExportImageListener", "()Lcom/bytedance/ee/bear/sheet/exportimage/imagedataprocessor/ExportImageListener;", "setExportImageListener", "(Lcom/bytedance/ee/bear/sheet/exportimage/imagedataprocessor/ExportImageListener;)V", "imageBlockBlockingQueue", "Ljava/util/concurrent/BlockingQueue;", "Lcom/bytedance/ee/bear/sheet/exportimage/imagedataprocessor/ImageDataProcessor$LineImageBlockTask;", "lineImageBlockingQueue", "Lcom/bytedance/ee/bear/sheet/exportimage/imagedataprocessor/ImageDataProcessor$LineImageTask;", "lineImageConsumer", "Ljava/util/concurrent/Future;", "lineImageProducer", "concatBitmap", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/bytedance/ee/bear/sheet/exportimage/imagedataprocessor/ShareImageDataModel;", "decodeBitmap", "bitmapBase46String", "width", "height", "destroy", "isImageBlockingQueueFull", "", "onFailed", "e", "onImageBlockQueueAvailable", "onSuccess", "release", "start", "LineImageBlockTask", "LineImageTask", "sheet_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.sheet.exportimage.imagedataprocessor.b */
public final class ImageDataProcessor {

    /* renamed from: a */
    public final BlockingQueue<LineImageTask> f29861a = new ArrayBlockingQueue(5);

    /* renamed from: b */
    public final BlockingQueue<LineImageBlockTask> f29862b = new ArrayBlockingQueue(15);

    /* renamed from: c */
    public final int f29863c;

    /* renamed from: d */
    public final int f29864d;

    /* renamed from: e */
    public final String f29865e;

    /* renamed from: f */
    private final String f29866f = "ImageDataProcessor";

    /* renamed from: g */
    private Bitmap f29867g;

    /* renamed from: h */
    private Canvas f29868h;

    /* renamed from: i */
    private int f29869i;

    /* renamed from: j */
    private final int f29870j = 5;

    /* renamed from: k */
    private final int f29871k = 15;

    /* renamed from: l */
    private Future<?> f29872l;

    /* renamed from: m */
    private Future<?> f29873m;

    /* renamed from: n */
    private AbstractC11117a f29874n;

    /* access modifiers changed from: private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0011\"\u0004\b\u0015\u0010\u0013R\u001a\u0010\u0016\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\f\"\u0004\b\u0018\u0010\u000e¨\u0006\u0019"}, d2 = {"Lcom/bytedance/ee/bear/sheet/exportimage/imagedataprocessor/ImageDataProcessor$LineImageBlockTask;", "", "()V", "bitmapBase46String", "", "getBitmapBase46String", "()Ljava/lang/String;", "setBitmapBase46String", "(Ljava/lang/String;)V", "height", "", "getHeight", "()I", "setHeight", "(I)V", "isLast", "", "()Z", "setLast", "(Z)V", "isLastInRow", "setLastInRow", "width", "getWidth", "setWidth", "sheet_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.sheet.exportimage.imagedataprocessor.b$a */
    public static final class LineImageBlockTask {

        /* renamed from: a */
        private boolean f29875a;

        /* renamed from: b */
        private String f29876b = "";

        /* renamed from: c */
        private int f29877c;

        /* renamed from: d */
        private int f29878d;

        /* renamed from: e */
        private boolean f29879e;

        /* renamed from: b */
        public final String mo42456b() {
            return this.f29876b;
        }

        /* renamed from: c */
        public final int mo42459c() {
            return this.f29877c;
        }

        /* renamed from: d */
        public final int mo42460d() {
            return this.f29878d;
        }

        /* renamed from: e */
        public final boolean mo42461e() {
            return this.f29879e;
        }

        /* renamed from: a */
        public final boolean mo42455a() {
            return this.f29875a;
        }

        /* renamed from: a */
        public final void mo42452a(int i) {
            this.f29877c = i;
        }

        /* renamed from: a */
        public final void mo42453a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "<set-?>");
            this.f29876b = str;
        }

        /* renamed from: b */
        public final void mo42457b(int i) {
            this.f29878d = i;
        }

        /* renamed from: a */
        public final void mo42454a(boolean z) {
            this.f29875a = z;
        }

        /* renamed from: b */
        public final void mo42458b(boolean z) {
            this.f29879e = z;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/bytedance/ee/bear/sheet/exportimage/imagedataprocessor/ImageDataProcessor$LineImageTask;", "", "()V", "bitmap", "Landroid/graphics/Bitmap;", "getBitmap", "()Landroid/graphics/Bitmap;", "setBitmap", "(Landroid/graphics/Bitmap;)V", "isLast", "", "()Z", "setLast", "(Z)V", "sheet_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.sheet.exportimage.imagedataprocessor.b$b */
    private static final class LineImageTask {

        /* renamed from: a */
        private boolean f29880a;

        /* renamed from: b */
        private Bitmap f29881b;

        /* renamed from: b */
        public final Bitmap mo42465b() {
            return this.f29881b;
        }

        /* renamed from: a */
        public final boolean mo42464a() {
            return this.f29880a;
        }

        /* renamed from: a */
        public final void mo42462a(Bitmap bitmap) {
            this.f29881b = bitmap;
        }

        /* renamed from: a */
        public final void mo42463a(boolean z) {
            this.f29880a = z;
        }
    }

    /* renamed from: a */
    public final String mo42435a() {
        return this.f29866f;
    }

    /* renamed from: b */
    public final Bitmap mo42442b() {
        return this.f29867g;
    }

    /* renamed from: c */
    public final Canvas mo42443c() {
        return this.f29868h;
    }

    /* renamed from: d */
    public final int mo42444d() {
        return this.f29869i;
    }

    /* renamed from: e */
    public final AbstractC11117a mo42445e() {
        return this.f29874n;
    }

    /* renamed from: k */
    public final void mo42451k() {
        mo42449i();
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.sheet.exportimage.imagedataprocessor.b$d */
    public static final class RunnableC11119d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ ImageDataProcessor f29884a;

        RunnableC11119d(ImageDataProcessor bVar) {
            this.f29884a = bVar;
        }

        public final void run() {
            AbstractC11117a e = this.f29884a.mo42445e();
            if (e != null) {
                e.mo42431a();
            }
        }
    }

    /* renamed from: g */
    public final void mo42447g() {
        BearExecutors.m48468c().execute(new RunnableC11119d(this));
    }

    /* renamed from: h */
    public final void mo42448h() {
        BearExecutors.m48468c().execute(new RunnableC11120e(this));
    }

    /* renamed from: j */
    public final boolean mo42450j() {
        if (this.f29862b.size() >= this.f29871k) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.sheet.exportimage.imagedataprocessor.b$c */
    public static final class RunnableC11118c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ ImageDataProcessor f29882a;

        /* renamed from: b */
        final /* synthetic */ String f29883b;

        RunnableC11118c(ImageDataProcessor bVar, String str) {
            this.f29882a = bVar;
            this.f29883b = str;
        }

        public final void run() {
            C13479a.m54758a(this.f29882a.mo42435a(), this.f29883b);
            this.f29882a.mo42449i();
            AbstractC11117a e = this.f29882a.mo42445e();
            if (e != null) {
                e.mo42432a(-1, this.f29883b);
            }
        }
    }

    /* renamed from: i */
    public final void mo42449i() {
        Bitmap bitmap = this.f29867g;
        if (bitmap != null) {
            bitmap.recycle();
        }
        Future<?> future = this.f29872l;
        if (future != null) {
            future.cancel(true);
        }
        Future<?> future2 = this.f29873m;
        if (future2 != null) {
            future2.cancel(true);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.sheet.exportimage.imagedataprocessor.b$e */
    public static final class RunnableC11120e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ ImageDataProcessor f29885a;

        RunnableC11120e(ImageDataProcessor bVar) {
            this.f29885a = bVar;
        }

        public final void run() {
            this.f29885a.mo42449i();
            File file = new File(this.f29885a.f29865e);
            if (file.exists()) {
                AbstractC11117a e = this.f29885a.mo42445e();
                if (e != null) {
                    e.mo42433a(file);
                    return;
                }
                return;
            }
            AbstractC11117a e2 = this.f29885a.mo42445e();
            if (e2 != null) {
                e2.mo42432a(-1, "notExistFile");
            }
        }
    }

    /* renamed from: f */
    public final void mo42446f() {
        this.f29873m = BearExecutors.m48470e().submit(new RunnableC11121f(this));
        this.f29872l = BearExecutors.m48470e().submit(new RunnableC11122g(this));
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.sheet.exportimage.imagedataprocessor.b$f */
    public static final class RunnableC11121f implements Runnable {

        /* renamed from: a */
        final /* synthetic */ ImageDataProcessor f29886a;

        RunnableC11121f(ImageDataProcessor bVar) {
            this.f29886a = bVar;
        }

        public final void run() {
            while (true) {
                try {
                    LineImageBlockTask take = this.f29886a.f29862b.take();
                    Bitmap a = this.f29886a.mo42434a(take.mo42456b(), take.mo42459c(), take.mo42460d());
                    if (a == null) {
                        C13479a.m54758a(this.f29886a.mo42435a(), "decodedBitmap block is null!");
                        this.f29886a.mo42441a("cancatImage");
                        return;
                    }
                    int c = take.mo42459c();
                    int d = take.mo42460d();
                    if (this.f29886a.mo42442b() == null) {
                        ImageDataProcessor bVar = this.f29886a;
                        bVar.mo42437a(Bitmap.createBitmap(bVar.f29863c, d, Bitmap.Config.ARGB_8888));
                        ImageDataProcessor bVar2 = this.f29886a;
                        Bitmap b = this.f29886a.mo42442b();
                        if (b == null) {
                            Intrinsics.throwNpe();
                        }
                        bVar2.mo42438a(new Canvas(b));
                    }
                    Rect rect = new Rect(this.f29886a.mo42444d(), 0, this.f29886a.mo42444d() + c, d);
                    Rect rect2 = new Rect(0, 0, c, d);
                    Canvas c2 = this.f29886a.mo42443c();
                    if (c2 != null) {
                        c2.drawBitmap(a, rect2, rect, (Paint) null);
                    }
                    ImageDataProcessor bVar3 = this.f29886a;
                    bVar3.mo42436a(bVar3.mo42444d() + c);
                    if (take.mo42461e()) {
                        LineImageTask bVar4 = new LineImageTask();
                        bVar4.mo42462a(this.f29886a.mo42442b());
                        bVar4.mo42463a(take.mo42455a());
                        this.f29886a.f29861a.put(bVar4);
                        this.f29886a.mo42436a(0);
                        this.f29886a.mo42438a((Canvas) null);
                        this.f29886a.mo42437a((Bitmap) null);
                    }
                    a.recycle();
                    if (!take.mo42455a()) {
                        this.f29886a.mo42447g();
                    } else {
                        return;
                    }
                } catch (Exception e) {
                    this.f29886a.f29862b.clear();
                    String a2 = this.f29886a.mo42435a();
                    C13479a.m54775e(a2, "LineBitmap generate task is interrupted!" + e.toString());
                    return;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.sheet.exportimage.imagedataprocessor.b$g */
    public static final class RunnableC11122g implements Runnable {

        /* renamed from: a */
        final /* synthetic */ ImageDataProcessor f29887a;

        RunnableC11122g(ImageDataProcessor bVar) {
            this.f29887a = bVar;
        }

        public final void run() {
            Bitmap b;
            FastPngEncoder fastPngEncoder = null;
            while (true) {
                try {
                    LineImageTask take = this.f29887a.f29861a.take();
                    Intrinsics.checkExpressionValueIsNotNull(take, "lineImageBlockingQueue.take()");
                    LineImageTask bVar = take;
                    b = bVar.mo42465b();
                    if (b == null) {
                        Intrinsics.throwNpe();
                    }
                    b.getHeight();
                    if (fastPngEncoder == null) {
                        C13479a.m54764b(this.f29887a.mo42435a(), "init pngEncoder!");
                        fastPngEncoder = new FastPngEncoder(this.f29887a.f29865e, this.f29887a.f29863c, this.f29887a.f29864d);
                    }
                    if (bVar.mo42464a()) {
                        break;
                    }
                    fastPngEncoder.mo40675a(b);
                    b.recycle();
                } catch (InterruptedException e) {
                    while (!this.f29887a.f29861a.isEmpty()) {
                        Bitmap b2 = this.f29887a.f29861a.take().mo42465b();
                        if (b2 != null) {
                            b2.recycle();
                        }
                    }
                    C13479a.m54773d(this.f29887a.mo42435a(), "Png encode task is interrupted!", e);
                }
            }
            fastPngEncoder.mo40676a(b, 0, b.getHeight());
            C13479a.m54764b(this.f29887a.mo42435a(), "Last bitmap has successfully finished!");
            b.recycle();
            this.f29887a.mo42448h();
            if (fastPngEncoder != null) {
                fastPngEncoder.mo40674a();
            }
        }
    }

    /* renamed from: a */
    public final void mo42436a(int i) {
        this.f29869i = i;
    }

    /* renamed from: a */
    public final void mo42437a(Bitmap bitmap) {
        this.f29867g = bitmap;
    }

    /* renamed from: a */
    public final void mo42438a(Canvas canvas) {
        this.f29868h = canvas;
    }

    /* renamed from: a */
    public final void mo42439a(ShareImageDataModel shareImageDataModel) {
        Intrinsics.checkParameterIsNotNull(shareImageDataModel, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        BlockingQueue<LineImageBlockTask> blockingQueue = this.f29862b;
        LineImageBlockTask aVar = new LineImageBlockTask();
        aVar.mo42454a(shareImageDataModel.isLast());
        aVar.mo42452a(shareImageDataModel.getWidth());
        aVar.mo42457b(shareImageDataModel.getHeight());
        aVar.mo42458b(shareImageDataModel.isLastInRow());
        String img = shareImageDataModel.getImg();
        Intrinsics.checkExpressionValueIsNotNull(img, "data.img");
        aVar.mo42453a(img);
        blockingQueue.put(aVar);
    }

    /* renamed from: a */
    public final void mo42440a(AbstractC11117a aVar) {
        this.f29874n = aVar;
    }

    /* renamed from: a */
    public final void mo42441a(String str) {
        BearExecutors.m48468c().execute(new RunnableC11118c(this, str));
    }

    public ImageDataProcessor(int i, int i2, String str) {
        Intrinsics.checkParameterIsNotNull(str, "filePath");
        this.f29863c = i;
        this.f29864d = i2;
        this.f29865e = str;
    }

    /* renamed from: a */
    public final Bitmap mo42434a(String str, int i, int i2) {
        int indexOf$default = StringsKt.indexOf$default((CharSequence) str, ",", 0, false, 6, (Object) null) + 1;
        if (str != null) {
            String substring = str.substring(indexOf$default);
            Intrinsics.checkExpressionValueIsNotNull(substring, "(this as java.lang.String).substring(startIndex)");
            byte[] decode = Base64.decode(substring, 0);
            Intrinsics.checkExpressionValueIsNotNull(decode, "Base64.decode(base64Str, Base64.DEFAULT)");
            int length = decode.length;
            for (int i3 = 0; i3 < length; i3++) {
                if (decode[i3] < 0) {
                    decode[i3] = (byte) (decode[i3] + 256);
                }
            }
            return BitmapFactory.decodeByteArray(decode, 0, decode.length);
        }
        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
    }
}
