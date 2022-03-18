package com.ss.android.lark.photoeditor.impl.ui;

import android.graphics.Bitmap;
import android.graphics.PointF;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.larksuite.framework.mvp.BaseModel;
import com.larksuite.framework.thread.CoreThreadPool;
import com.larksuite.suite.R;
import com.squareup.wire.ProtoAdapter;
import com.ss.android.lark.diskmanage.cipher.C36808a;
import com.ss.android.lark.diskmanage.cipher.EncryptException;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.pb.ai.ImageInfo;
import com.ss.android.lark.pb.ai.Point;
import com.ss.android.lark.pb.ai.Polygon;
import com.ss.android.lark.pb.ai.SmartMosaicRequest;
import com.ss.android.lark.pb.ai.SmartMosaicResponse;
import com.ss.android.lark.pb.improto.Command;
import com.ss.android.lark.photoeditor.impl.ui.AbstractC51438a;
import com.ss.android.lark.sdk.SdkSender;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.photoeditor.mosaic.p3011a.AbstractC59737a;
import com.ss.android.photoeditor.mosaic.p3011a.C59739b;
import io.reactivex.Observable;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.p3456d.C68279a;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import okio.ByteString;

/* renamed from: com.ss.android.lark.photoeditor.impl.ui.c */
public class C51446c extends BaseModel implements AbstractC51438a.AbstractC51439a {
    /* renamed from: a */
    private ImageInfo m199410a(Bitmap bitmap) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
            return new ImageInfo(ByteString.of(byteArrayOutputStream.toByteArray()), null);
        } catch (Exception e) {
            Log.m165384e("PhotoEditorModel", "error in load imageInfo", e);
            return null;
        }
    }

    /* renamed from: a */
    public void mo177124a(File file) {
        try {
            C36808a.m145203a(file);
            Log.m165389i("PhotoEditorModel", "[cipher] file encrypt success, path = " + file.getAbsolutePath());
        } catch (EncryptException unused) {
            Log.m165383e("PhotoEditorModel", "[cipher] file encrypt failed, path = " + file.getAbsolutePath());
        }
    }

    @Override // com.ss.android.lark.photoeditor.impl.ui.AbstractC51438a.AbstractC51439a
    /* renamed from: a */
    public void mo177105a(Bitmap bitmap, AbstractC59737a.AbstractC59738a aVar) {
        CoreThreadPool.getDefault().getCachedThreadPool().execute(new Runnable(bitmap, aVar) {
            /* class com.ss.android.lark.photoeditor.impl.ui.$$Lambda$c$y4ZkDvIM9QDg9MvFwIpaFVjW2bk */
            public final /* synthetic */ Bitmap f$1;
            public final /* synthetic */ AbstractC59737a.AbstractC59738a f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void run() {
                C51446c.lambda$y4ZkDvIM9QDg9MvFwIpaFVjW2bk(C51446c.this, this.f$1, this.f$2);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m199412c(Bitmap bitmap, final AbstractC59737a.AbstractC59738a aVar) {
        SmartMosaicRequest.C49521a aVar2 = new SmartMosaicRequest.C49521a();
        ImageInfo a = m199410a(bitmap);
        if (a == null) {
            Log.m165383e("PhotoEditorModel", "img file load error");
            return;
        }
        aVar2.mo172721a(a);
        final int width = bitmap.getWidth();
        final int height = bitmap.getHeight();
        Command command = Command.SMART_MOSAIC;
        UIGetDataCallback uIGetDataCallback = new UIGetDataCallback(new IGetDataCallback<SmartMosaicResponse>() {
            /* class com.ss.android.lark.photoeditor.impl.ui.C51446c.C514504 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                AbstractC59737a.AbstractC59738a aVar = aVar;
                if (aVar != null) {
                    aVar.mo203389a();
                }
            }

            /* renamed from: a */
            public void onSuccess(SmartMosaicResponse smartMosaicResponse) {
                AbstractC59737a.AbstractC59738a aVar = aVar;
                if (aVar != null) {
                    aVar.mo203390a(C51446c.this.mo177123a(smartMosaicResponse, width, height));
                }
            }
        });
        ProtoAdapter<SmartMosaicResponse> protoAdapter = SmartMosaicResponse.ADAPTER;
        protoAdapter.getClass();
        SdkSender.sendPassThroughRequest(command, aVar2, uIGetDataCallback, new SdkSender.IParser() {
            /* class com.ss.android.lark.photoeditor.impl.ui.$$Lambda$cYjPCGQQCa0KvLrBSzIG0ID14bA */

            @Override // com.ss.android.lark.sdk.SdkSender.IParser
            public final Object parse(byte[] bArr) {
                return (SmartMosaicResponse) ProtoAdapter.this.decode(bArr);
            }
        });
    }

    /* renamed from: a */
    public List<C59739b> mo177123a(SmartMosaicResponse smartMosaicResponse, int i, int i2) {
        List<Polygon> list = smartMosaicResponse.mpolygons;
        ArrayList arrayList = new ArrayList();
        for (Polygon polygon : list) {
            ArrayList arrayList2 = new ArrayList();
            for (Point point : polygon.mpoints) {
                arrayList2.add(new PointF(point.mx.floatValue() / ((float) i), point.my.floatValue() / ((float) i2)));
            }
            arrayList.add(new C59739b(arrayList2));
        }
        return arrayList;
    }

    @Override // com.ss.android.lark.photoeditor.impl.ui.AbstractC51438a.AbstractC51439a
    /* renamed from: a */
    public void mo177106a(final Bitmap bitmap, final String str, final AbstractC51438a.AbstractC51439a.AbstractC51440a aVar) {
        Observable.create(new ObservableOnSubscribe<File>() {
            /* class com.ss.android.lark.photoeditor.impl.ui.C51446c.C514493 */

            /* JADX WARNING: Removed duplicated region for block: B:21:0x007b A[SYNTHETIC, Splitter:B:21:0x007b] */
            /* JADX WARNING: Removed duplicated region for block: B:27:0x008b A[SYNTHETIC, Splitter:B:27:0x008b] */
            /* JADX WARNING: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
            @Override // io.reactivex.ObservableOnSubscribe
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void subscribe(io.reactivex.ObservableEmitter<java.io.File> r7) throws java.lang.Exception {
                /*
                // Method dump skipped, instructions count: 153
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.photoeditor.impl.ui.C51446c.C514493.subscribe(io.reactivex.ObservableEmitter):void");
            }
        }).subscribeOn(C68279a.m265023b()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer<File>() {
            /* class com.ss.android.lark.photoeditor.impl.ui.C51446c.C514471 */

            /* renamed from: a */
            public void accept(File file) throws Exception {
                Log.m165389i("PhotoEditorModel", UIHelper.getString(R.string.Lark_Legacy_SuccessfulSaved) + " : " + file.getAbsolutePath());
                aVar.mo177107a(file);
            }
        }, new Consumer<Throwable>() {
            /* class com.ss.android.lark.photoeditor.impl.ui.C51446c.C514482 */

            /* renamed from: a */
            public void accept(Throwable th) throws Exception {
                Log.m165383e("PhotoEditorModel", UIHelper.getString(R.string.Lark_Legacy_SaveFail) + " : " + th.toString());
                aVar.mo177108a(UIHelper.getString(R.string.Lark_Legacy_SaveFail));
            }
        });
    }
}
