package com.ss.android.lark.chat.service.impl;

import android.graphics.Bitmap;
import com.bytedance.lark.pb.basic.v1.C14928Entity;
import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.basic.v1.Message;
import com.bytedance.lark.pb.basic.v1.SyncDataStrategy;
import com.bytedance.lark.pb.im.v1.GetRepliesRequest;
import com.bytedance.lark.pb.im.v1.GetRepliesResponse;
import com.larksuite.framework.callback.AbstractC25974h;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.utils.C26311p;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.appreciablelib.Biz;
import com.ss.android.lark.appreciablelib.Scene;
import com.ss.android.lark.chat.entity.chatter.C33982a;
import com.ss.android.lark.chat.entity.message.MessageInfo;
import com.ss.android.lark.dependency.AbstractC36450aa;
import com.ss.android.lark.dto.p1813b.C36865a;
import com.ss.android.lark.dto.p1813b.C36866b;
import com.ss.android.lark.image.entity.Image;
import com.ss.android.lark.keyboard.plugin.tool.photo.IPhotoDependency;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.p2851u.p2852a.C57304a;
import com.ss.android.lark.p2851u.p2852a.C57306b;
import com.ss.android.lark.p2851u.p2852a.C57322k;
import com.ss.android.lark.sdk.SdkSender;
import com.ss.android.lark.utils.C57820d;
import com.ss.android.lark.utils.C57881t;
import com.ss.android.lark.utils.ao;
import com.ss.android.lark.utils.rxjava.C57861a;
import com.ss.android.lark.utils.rxjava.LarkRxSchedulers;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.lark.chat.service.impl.w */
public class C34278w {

    /* renamed from: a */
    private final AbstractC36450aa f88564a;

    /* renamed from: com.ss.android.lark.chat.service.impl.w$a */
    private static final class C34287a {

        /* renamed from: a */
        public static final C34278w f88579a = new C34278w();
    }

    /* renamed from: a */
    public static C34278w m132953a() {
        return C34287a.f88579a;
    }

    private C34278w() {
        this.f88564a = C29990c.m110930b().mo134515N();
    }

    /* renamed from: a */
    public static ObservableSource<Image> m132954a(final C36865a aVar) {
        return Observable.create(new ObservableOnSubscribe<Image>() {
            /* class com.ss.android.lark.chat.service.impl.C34278w.C342791 */

            @Override // io.reactivex.ObservableOnSubscribe
            public void subscribe(ObservableEmitter<Image> observableEmitter) throws Exception {
                C36866b bVar = new C36866b(new File(aVar.f94735a), C57820d.m224436b(aVar.f94735a));
                Image image = new Image();
                image.setWidth(bVar.mo136023a());
                image.setHeight(bVar.mo136024b());
                image.setToken(aVar.f94736b);
                image.setUrls(Collections.singletonList(aVar.f94735a));
                observableEmitter.onNext(image);
                observableEmitter.onComplete();
            }
        });
    }

    /* renamed from: a */
    public Observable<Map<String, IPhotoDependency.FrameInfo>> mo126826a(final List<IPhotoDependency.VideoInfo> list) {
        return Observable.create(new ObservableOnSubscribe<Map<String, IPhotoDependency.FrameInfo>>() {
            /* class com.ss.android.lark.chat.service.impl.C34278w.C342866 */

            @Override // io.reactivex.ObservableOnSubscribe
            public void subscribe(ObservableEmitter<Map<String, IPhotoDependency.FrameInfo>> observableEmitter) throws Exception {
                int i;
                String str;
                HashMap hashMap = new HashMap();
                for (IPhotoDependency.VideoInfo videoInfo : list) {
                    String path = videoInfo.getPath();
                    if (!hashMap.containsKey(path)) {
                        Bitmap d = ao.m224315d(path);
                        int i2 = 0;
                        if (d != null) {
                            str = C26311p.m95265a(d, C57881t.m224630d(C29990c.m110930b().mo134528a()) + Math.abs(path.hashCode()) + System.currentTimeMillis() + ".jpg");
                            int height = d.getHeight();
                            i2 = d.getWidth();
                            i = height;
                        } else {
                            Log.m165382e("Failed to get video first frame，video path: " + videoInfo.getPath());
                            str = "";
                            i = 0;
                        }
                        hashMap.put(path, new IPhotoDependency.FrameInfo(str, i2, i));
                    }
                }
                observableEmitter.onNext(hashMap);
                observableEmitter.onComplete();
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ List m132956a(String str, List list) throws Exception {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            MessageInfo messageInfo = (MessageInfo) it.next();
            if (messageInfo.getMessage().isRemoved() && !messageInfo.getMessage().getId().equals(str)) {
                it.remove();
            }
        }
        return list;
    }

    /* renamed from: b */
    public void mo126830b(String str, boolean z, IGetDataCallback<List<MessageInfo>> iGetDataCallback) {
        SyncDataStrategy syncDataStrategy;
        GetRepliesRequest.C17674a aVar = new GetRepliesRequest.C17674a();
        if (z) {
            syncDataStrategy = SyncDataStrategy.FORCE_SERVER;
        } else {
            syncDataStrategy = SyncDataStrategy.LOCAL;
        }
        SdkSender.asynSendRequestNonWrap(Command.GET_REPLIES, aVar.mo61754a(syncDataStrategy).mo61755a(str), iGetDataCallback, new SdkSender.IParser<List<MessageInfo>>() {
            /* class com.ss.android.lark.chat.service.impl.C34278w.C342813 */

            /* renamed from: a */
            public List<MessageInfo> parse(byte[] bArr) throws IOException {
                GetRepliesResponse decode = GetRepliesResponse.ADAPTER.decode(bArr);
                ArrayList arrayList = new ArrayList();
                arrayList.add(decode.root_id);
                arrayList.addAll(decode.child_ids);
                C14928Entity entity = decode.entity;
                Map<String, Message> map = entity.messages;
                List<com.ss.android.lark.chat.entity.message.Message> b = C57322k.m222131b(entity, arrayList);
                C33982a a = C57306b.m222058a(entity, true, "PostService::getMessageReplies");
                ArrayList arrayList2 = new ArrayList();
                for (com.ss.android.lark.chat.entity.message.Message message : b) {
                    arrayList2.add(C57304a.m222044a(message, map.get(message.getId()), entity, a));
                }
                for (com.ss.android.lark.chat.entity.message.Message message2 : C57322k.m222127a(entity, entity.quasi_messages).values()) {
                    MessageInfo a2 = C57322k.m222121a(message2, entity, a);
                    if (a2 != null) {
                        arrayList2.add(a2);
                    }
                }
                Collections.sort(arrayList2);
                return arrayList2;
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m132957a(String str, boolean z, final ObservableEmitter observableEmitter) throws Exception {
        mo126830b(str, z, new IGetDataCallback<List<MessageInfo>>() {
            /* class com.ss.android.lark.chat.service.impl.C34278w.C342802 */

            /* renamed from: a */
            public void onSuccess(List<MessageInfo> list) {
                observableEmitter.onNext(list);
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                observableEmitter.onError(errorResult.getException());
            }
        });
    }

    /* renamed from: a */
    public void mo126828a(String str, boolean z, IGetDataCallback<List<MessageInfo>> iGetDataCallback) {
        Observable subscribeOn = Observable.create(new ObservableOnSubscribe(str, z) {
            /* class com.ss.android.lark.chat.service.impl.$$Lambda$w$v1TviXtqMXQLJDUsQZZE_YOuUFk */
            public final /* synthetic */ String f$1;
            public final /* synthetic */ boolean f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            @Override // io.reactivex.ObservableOnSubscribe
            public final void subscribe(ObservableEmitter observableEmitter) {
                C34278w.this.m132957a((C34278w) this.f$1, (String) this.f$2, (boolean) observableEmitter);
            }
        }).map(new Function(str) {
            /* class com.ss.android.lark.chat.service.impl.$$Lambda$w$kf41O7FpbovmpmTAGboLZv2GfQ4 */
            public final /* synthetic */ String f$0;

            {
                this.f$0 = r1;
            }

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C34278w.m132956a(this.f$0, (List) obj);
            }
        }).subscribeOn(LarkRxSchedulers.io());
        iGetDataCallback.getClass();
        subscribeOn.subscribe(new Consumer() {
            /* class com.ss.android.lark.chat.service.impl.$$Lambda$qQGlKzOzaXzOSFtfFcbyYz4d6Q */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                IGetDataCallback.this.onSuccess((List) obj);
            }
        }, C57861a.m224572a());
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ ObservableSource m132955a(boolean z, AbstractC25974h hVar, Biz biz, Scene scene, String str) throws Exception {
        return C29990c.m110930b().mo134597y().mo134733a(C29990c.m110930b().mo134528a(), str, z, true, hVar, biz, scene);
    }

    /* renamed from: b */
    public Observable<Image> mo126829b(List<String> list, boolean z, AbstractC25974h hVar, Biz biz, Scene scene) {
        return Observable.fromIterable(list).concatMap(new Function(z, hVar, biz, scene) {
            /* class com.ss.android.lark.chat.service.impl.$$Lambda$w$NbV4mTZJ0s3wHHH_DFZ9lYKqKfw */
            public final /* synthetic */ boolean f$0;
            public final /* synthetic */ AbstractC25974h f$1;
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
                return C34278w.m132955a(this.f$0, this.f$1, this.f$2, this.f$3, (String) obj);
            }
        }).concatMap($$Lambda$w$ZzEKiuKy0wI4rDvaAK7YDXDrgQ.INSTANCE).subscribeOn(LarkRxSchedulers.io());
    }

    /* renamed from: a */
    public Observable<Image> mo126827a(List<String> list, final boolean z, final AbstractC25974h hVar, Biz biz, Scene scene) {
        if (C29990c.m110930b().mo134586n().mo134685a("lark.image.compress.post")) {
            return mo126829b(list, z, hVar, biz, scene);
        }
        return Observable.fromIterable(list).subscribeOn(LarkRxSchedulers.io()).observeOn(LarkRxSchedulers.io()).concatMapDelayError(new Function<String, ObservableSource<C36865a>>() {
            /* class com.ss.android.lark.chat.service.impl.C34278w.C342835 */

            /* renamed from: a */
            public ObservableSource<C36865a> apply(final String str) throws Exception {
                return Observable.create(new ObservableOnSubscribe<C36865a>() {
                    /* class com.ss.android.lark.chat.service.impl.C34278w.C342835.C342841 */

                    @Override // io.reactivex.ObservableOnSubscribe
                    public void subscribe(final ObservableEmitter<C36865a> observableEmitter) throws Exception {
                        C29990c.m110930b().mo134597y().mo134738a(C29990c.m110930b().mo134528a(), str, z, true, hVar, (IGetDataCallback<C36865a>) new IGetDataCallback<C36865a>() {
                            /* class com.ss.android.lark.chat.service.impl.C34278w.C342835.C342841.C342851 */

                            @Override // com.larksuite.framework.callback.IGetDataCallback
                            public void onError(ErrorResult errorResult) {
                                observableEmitter.onError(errorResult);
                            }

                            /* renamed from: a */
                            public void onSuccess(C36865a aVar) {
                                observableEmitter.onNext(aVar);
                                observableEmitter.onComplete();
                            }
                        });
                    }
                });
            }
        }).concatMapDelayError(new Function<C36865a, ObservableSource<Image>>() {
            /* class com.ss.android.lark.chat.service.impl.C34278w.C342824 */

            /* renamed from: a */
            public ObservableSource<Image> apply(C36865a aVar) throws Exception {
                return C34278w.m132954a(aVar);
            }
        });
    }
}
