package com.ss.android.lark.integrator.calendar.dependency;

import android.content.Context;
import android.graphics.Bitmap;
import android.widget.ImageView;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.biz.core.api.LoadParams;
import com.ss.android.lark.calendar.p1430a.p1431a.AbstractC30051o;
import com.ss.android.lark.image.ImageLoader;
import com.ss.android.lark.image.entity.AvatarImage;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.utils.rxjava.LarkRxSchedulers;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.functions.Consumer;
import io.reactivex.p3457e.C68296b;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.lark.integrator.calendar.dependency.n */
public class C39217n implements AbstractC30051o {

    /* renamed from: a */
    private final ICoreApi f100515a = ((ICoreApi) ApiUtils.getApi(ICoreApi.class));

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m154645a(IGetDataCallback iGetDataCallback, List list) throws Exception {
        if (iGetDataCallback != null) {
            iGetDataCallback.onSuccess(list);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m154644a(IGetDataCallback iGetDataCallback, Throwable th) throws Exception {
        if (iGetDataCallback != null) {
            iGetDataCallback.onError(new ErrorResult(th.getMessage()));
        }
    }

    /* renamed from: a */
    private List<Bitmap> m154642a(Context context, Map<String, String> map, int i, int i2) throws Exception {
        ArrayList arrayList = new ArrayList();
        if (CollectionUtils.isEmpty(map)) {
            return arrayList;
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            Bitmap a = m154641a(context, entry.getKey(), entry.getValue(), i, i2);
            if (a != null) {
                arrayList.add(a);
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m154643a(Context context, Map map, int i, int i2, ObservableEmitter observableEmitter) throws Exception {
        observableEmitter.onNext(m154642a(context, map, i, i2));
        observableEmitter.onComplete();
    }

    /* renamed from: a */
    private Bitmap m154641a(Context context, String str, String str2, int i, int i2) throws Exception {
        return ImageLoader.with(context).load(AvatarImage.Builder.obtain(str, str2, i, i2).build()).asBitmap().centerCrop().error(R.drawable.kb_avatar_bg).getBitmap(i, i2);
    }

    @Override // com.ss.android.lark.calendar.p1430a.p1431a.AbstractC30051o
    /* renamed from: a */
    public void mo108245a(Context context, String str, ImageView imageView, int i, int i2) {
        this.f100515a.loadLocalOrUrlImage(context, imageView, str, new LoadParams().mo105413a(UIHelper.dp2px((float) i)).mo105422b(UIHelper.dp2px((float) i2)));
    }

    @Override // com.ss.android.lark.calendar.p1430a.p1431a.AbstractC30051o
    /* renamed from: a */
    public void mo108247a(Context context, Map<String, String> map, int i, int i2, IGetDataCallback<List<Bitmap>> iGetDataCallback) {
        C68296b.create(new ObservableOnSubscribe(context, map, i, i2) {
            /* class com.ss.android.lark.integrator.calendar.dependency.$$Lambda$n$1IUjpZVSLe8ZhcHoXg5LjgRQQro */
            public final /* synthetic */ Context f$1;
            public final /* synthetic */ Map f$2;
            public final /* synthetic */ int f$3;
            public final /* synthetic */ int f$4;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
                this.f$4 = r5;
            }

            @Override // io.reactivex.ObservableOnSubscribe
            public final void subscribe(ObservableEmitter observableEmitter) {
                C39217n.this.m154643a((C39217n) this.f$1, (Context) this.f$2, (Map) this.f$3, this.f$4, (int) observableEmitter);
            }
        }).subscribeOn(LarkRxSchedulers.io()).observeOn(LarkRxSchedulers.mainThread()).subscribe(new Consumer() {
            /* class com.ss.android.lark.integrator.calendar.dependency.$$Lambda$n$vNaSkA5OYbJyDbTOXMy8X8kZFI */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C39217n.m154645a(IGetDataCallback.this, (List) obj);
            }
        }, new Consumer() {
            /* class com.ss.android.lark.integrator.calendar.dependency.$$Lambda$n$1fVuvV41fxjeH_O6CtUsUtX58j0 */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C39217n.m154644a(IGetDataCallback.this, (Throwable) obj);
            }
        });
    }

    @Override // com.ss.android.lark.calendar.p1430a.p1431a.AbstractC30051o
    /* renamed from: a */
    public void mo108246a(Context context, String str, String str2, ImageView imageView, int i, int i2) {
        this.f100515a.loadAvatarImage(context, imageView, str, str2, new LoadParams().mo105413a(UIHelper.dp2px((float) i)).mo105422b(UIHelper.dp2px((float) i2)));
    }
}
