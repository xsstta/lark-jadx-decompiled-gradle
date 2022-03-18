package com.ss.android.lark.share.impl;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.utils.C26311p;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.biz.core.api.CommonShareData;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.message.content.TextContent;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.openapi.jsapi.entity.ShareModel;
import com.ss.android.lark.share.C54713a;
import com.ss.android.lark.share.dto.C54722a;
import com.ss.android.lark.share.dto.ShareChatDto;
import com.ss.android.lark.share.impl.p2682a.C54741f;
import com.ss.android.lark.share.impl.p2682a.p2683a.C54726b;
import com.ss.android.lark.share.p2681a.AbstractC54714a;
import com.ss.android.lark.utils.rxjava.LarkRxSchedulers;
import com.ss.android.lark.utils.rxjava.ReportErrorConsumer;
import com.ss.android.lark.widget.richtext.C59029c;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Consumer;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.lark.share.impl.c */
public class C54745c {

    /* renamed from: a */
    public static final Context f135183a = C54713a.m212321a().mo178386a();

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.share.impl.c$a */
    public static class C54755a implements IGetDataCallback<String> {
        /* renamed from: a */
        public void onSuccess(String str) {
        }

        private C54755a() {
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            if (!TextUtils.isEmpty(errorResult.getDisplayMsg())) {
                LKUIToast.show(C54745c.f135183a, errorResult.getDisplayMsg());
            }
        }
    }

    /* renamed from: a */
    private static void m212414a(final CommonShareData commonShareData, final String str, final String str2, final String str3, final String str4, final ShareChatDto shareChatDto) {
        Observable.create(new ObservableOnSubscribe<Integer>() {
            /* class com.ss.android.lark.share.impl.C54745c.C547549 */

            @Override // io.reactivex.ObservableOnSubscribe
            public void subscribe(ObservableEmitter<Integer> observableEmitter) throws Exception {
                observableEmitter.onNext(Integer.valueOf(C54745c.m212421b(shareChatDto)));
            }
        }).subscribeOn(LarkRxSchedulers.io()).subscribe(new Consumer<Integer>() {
            /* class com.ss.android.lark.share.impl.C54745c.C547527 */

            /* renamed from: a */
            public void accept(Integer num) throws Exception {
                C54745c.m212412a(commonShareData, shareChatDto, str, str2, str3, str4, num.intValue());
            }
        }, new Consumer<Throwable>() {
            /* class com.ss.android.lark.share.impl.C54745c.C547538 */

            /* renamed from: a */
            public void accept(Throwable th) throws Exception {
                LKUIToast.show(C54745c.f135183a, (int) R.string.Lark_Legacy_ShareFailed);
                Log.m165383e("ShareManager", "sendShareText failed: " + th.getMessage());
            }
        });
    }

    /* renamed from: a */
    private static void m212415a(final CommonShareData commonShareData, List<String> list, final ShareChatDto shareChatDto) {
        final int size = list.size();
        C54713a.m212321a().mo178392e().mo178408a(shareChatDto.getChatId(), list, true, (IGetDataCallback<String>) new IGetDataCallback<String>() {
            /* class com.ss.android.lark.share.impl.C54745c.AnonymousClass10 */

            /* renamed from: a */
            int f135187a;

            /* renamed from: b */
            String f135188b;

            /* renamed from: a */
            public void onSuccess(String str) {
                Log.m165383e("ShareManager", "sendShareImage success: " + str);
                this.f135187a = this.f135187a + 1;
                this.f135188b = str;
                m212427a(true);
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                this.f135187a++;
                Log.m165383e("ShareManager", "sendShareImage failed: " + errorResult.getMessage());
                m212427a(false);
            }

            /* renamed from: a */
            private void m212427a(boolean z) {
                boolean z2;
                if (this.f135187a != size || TextUtils.isEmpty(this.f135188b)) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (z2) {
                    if (commonShareData.isSdkShare()) {
                        if (z) {
                            C54745c.m212417a(commonShareData.getHashKey());
                        } else {
                            C54745c.m212423b(commonShareData.getHashKey());
                        }
                    }
                    C54745c.m212420a(shareChatDto.getChatId(), this.f135188b, shareChatDto.getExtraInfo(), 0);
                }
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m212419a(String str, ObservableEmitter observableEmitter) throws Exception {
        File file = new File(str);
        observableEmitter.onNext(new C54722a(file, C26311p.m95283c(str), file.length()));
        observableEmitter.onComplete();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m212418a(String str, CommonShareData commonShareData, ShareChatDto shareChatDto, C54722a aVar) throws Exception {
        String str2;
        File file = aVar.f135141a;
        if (file == null) {
            str2 = null;
        } else {
            str2 = file.getAbsolutePath();
        }
        m212410a(commonShareData, shareChatDto, aVar, TextUtils.equals(str, str2));
    }

    /* renamed from: a */
    public static void m212416a(ShareChatDto shareChatDto) {
        if (shareChatDto != null && !TextUtils.isEmpty(shareChatDto.getExtraInfo())) {
            C54713a.m212321a().mo178392e().mo178404a(shareChatDto.getChatId(), Integer.valueOf(m212421b(shareChatDto) + 1), C59029c.m229161b(shareChatDto.getExtraInfo()), new C54755a());
        }
    }

    /* renamed from: a */
    public static void m212420a(String str, String str2, String str3, int i) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            Log.m165383e("ShareManager", "replyImageMessage failed: chatId is " + str + ", msgId is " + str2 + ", extraInfo is " + str3);
            return;
        }
        C54713a.m212321a().mo178392e().mo178407a(str, str3, str2, i, new IGetDataCallback<String>() {
            /* class com.ss.android.lark.share.impl.C54745c.C547494 */

            /* renamed from: a */
            public void onSuccess(String str) {
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Log.m165383e("ShareManager", "replyMessage failed: " + errorResult.getDebugMsg());
            }
        });
    }

    /* renamed from: a */
    public static void m212417a(String str) {
        C54741f.m212395a().mo186876a(str, 0);
    }

    /* renamed from: b */
    public static void m212423b(String str) {
        C54741f.m212395a().mo186876a(str, -3);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static /* synthetic */ ObservableSource m212424c(String str) throws Exception {
        return Observable.create(new ObservableOnSubscribe(str) {
            /* class com.ss.android.lark.share.impl.$$Lambda$c$0MZ72t9MwaGUuejjRNAkooHEqPo */
            public final /* synthetic */ String f$0;

            {
                this.f$0 = r1;
            }

            @Override // io.reactivex.ObservableOnSubscribe
            public final void subscribe(ObservableEmitter observableEmitter) {
                C54745c.m212419a(this.f$0, observableEmitter);
            }
        });
    }

    /* renamed from: b */
    public static int m212421b(ShareChatDto shareChatDto) {
        Message a = C54713a.m212321a().mo178392e().mo178400a(shareChatDto.getChatId());
        if (a == null) {
            return shareChatDto.getMessagePosition();
        }
        return a.getPosition();
    }

    /* renamed from: a */
    private static Message m212407a(ShareModel shareModel) {
        String str;
        if (shareModel == null || TextUtils.isEmpty(shareModel.getUrl())) {
            str = "";
        } else {
            str = shareModel.getUrl();
        }
        Message message = new Message();
        message.setType(Message.Type.TEXT);
        TextContent textContent = new TextContent();
        textContent.setRichText(C59029c.m229161b(str));
        message.setMessageContent(textContent);
        return message;
    }

    /* renamed from: a */
    public static void m212408a(Context context, ShareModel shareModel) {
        Message a = m212407a(shareModel);
        a.setShared(true);
        AbstractC54714a.AbstractC54716b c = C54713a.m212321a().mo178390c();
        if (context == null) {
            context = f135183a;
        }
        c.mo178396a(context, a, shareModel);
    }

    /* renamed from: a */
    public static void m212409a(CommonShareData commonShareData, ShareChatDto shareChatDto) {
        ArrayList arrayList;
        if (commonShareData == null || commonShareData.isEmpty()) {
            LKUIToast.show(f135183a, (int) R.string.Lark_Legacy_ShareUnsupportTypeError);
            return;
        }
        int type = commonShareData.getType();
        if (commonShareData.isSdkShare()) {
            ShareHitPoint.f121870e.mo169316c(commonShareData.getSource(), C54726b.m212362a(type));
        }
        AbstractC54714a.AbstractC54719e f = C54713a.m212321a().mo178393f();
        if (f != null) {
            Context context = f135183a;
            if (!f.mo178410a(context)) {
                f.mo178411b(context);
            }
        }
        String content = commonShareData.getContent();
        String title = commonShareData.getTitle();
        String url = commonShareData.getUrl();
        String iconPath = commonShareData.getIconPath();
        List<String> images = commonShareData.getImages();
        List<String> files = commonShareData.getFiles();
        Map<String, Long> videos = commonShareData.getVideos();
        if (CollectionUtils.isEmpty(videos)) {
            arrayList = new ArrayList();
        } else {
            arrayList = new ArrayList(videos.keySet());
        }
        if (!CollectionUtils.isEmpty(arrayList)) {
            m212422b(commonShareData, arrayList, shareChatDto);
            Log.m165389i("ShareManager", "sendShareContentToChat sendVideo count:" + arrayList.size());
        }
        if (!CollectionUtils.isEmpty(images)) {
            m212415a(commonShareData, images, shareChatDto);
        }
        if (!CollectionUtils.isEmpty(files)) {
            m212425c(commonShareData, files, shareChatDto);
        }
        if (type != 1 || TextUtils.isEmpty(title) || TextUtils.isEmpty(url)) {
            if (!TextUtils.isEmpty(content)) {
                m212413a(commonShareData, content, shareChatDto);
            }
        } else if (commonShareData.isNewStyle()) {
            m212414a(commonShareData, title, content, url, iconPath, shareChatDto);
        } else {
            m212413a(commonShareData, url, shareChatDto);
        }
    }

    /* renamed from: b */
    private static void m212422b(CommonShareData commonShareData, List<String> list, ShareChatDto shareChatDto) {
        String str;
        if (list.size() == 0) {
            str = "";
        } else {
            str = list.get(list.size() - 1);
        }
        Observable.fromIterable(list).concatMap($$Lambda$c$vx6rqnIRds4mQBrAdtr89hqroxc.INSTANCE).subscribeOn(LarkRxSchedulers.io()).subscribe(new Consumer(str, commonShareData, shareChatDto) {
            /* class com.ss.android.lark.share.impl.$$Lambda$c$tbtudmFQY11kfNR5j2YYgtyJfqQ */
            public final /* synthetic */ String f$0;
            public final /* synthetic */ CommonShareData f$1;
            public final /* synthetic */ ShareChatDto f$2;

            {
                this.f$0 = r1;
                this.f$1 = r2;
                this.f$2 = r3;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C54745c.m212418a(this.f$0, this.f$1, this.f$2, (C54722a) obj);
            }
        }, new ReportErrorConsumer() {
            /* class com.ss.android.lark.share.impl.C54745c.AnonymousClass11 */

            /* access modifiers changed from: protected */
            @Override // com.ss.android.lark.utils.rxjava.ReportErrorConsumer
            public void error(Throwable th) throws Exception {
                th.printStackTrace();
            }
        });
    }

    /* renamed from: c */
    private static void m212425c(CommonShareData commonShareData, List<String> list, ShareChatDto shareChatDto) {
        int b = m212421b(shareChatDto);
        for (String str : list) {
            File file = new File(str);
            if (file.canRead()) {
                C54713a.m212321a().mo178392e().mo178405a(shareChatDto.getChatId(), Integer.valueOf(b), file, new C54755a());
            } else {
                C54713a.m212321a().mo178392e().mo178402a(shareChatDto.getChatId(), Integer.valueOf(b), Uri.parse(str), new C54755a());
            }
        }
    }

    /* renamed from: a */
    private static void m212413a(final CommonShareData commonShareData, final String str, final ShareChatDto shareChatDto) {
        Observable.create(new ObservableOnSubscribe<Integer>() {
            /* class com.ss.android.lark.share.impl.C54745c.C547516 */

            @Override // io.reactivex.ObservableOnSubscribe
            public void subscribe(ObservableEmitter<Integer> observableEmitter) throws Exception {
                observableEmitter.onNext(Integer.valueOf(C54745c.m212421b(shareChatDto)));
            }
        }).subscribeOn(LarkRxSchedulers.io()).subscribe(new Consumer<Integer>() {
            /* class com.ss.android.lark.share.impl.C54745c.C547461 */

            /* renamed from: a */
            public void accept(Integer num) throws Exception {
                C54745c.m212411a(commonShareData, shareChatDto, str, num.intValue());
            }
        }, new Consumer<Throwable>() {
            /* class com.ss.android.lark.share.impl.C54745c.C547505 */

            /* renamed from: a */
            public void accept(Throwable th) throws Exception {
                LKUIToast.show(C54745c.f135183a, (int) R.string.Lark_Legacy_ShareFailed);
                Log.m165383e("ShareManager", "sendShareText failed: " + th.getMessage());
            }
        });
    }

    /* renamed from: a */
    private static void m212410a(final CommonShareData commonShareData, final ShareChatDto shareChatDto, C54722a aVar, final boolean z) {
        final int b = m212421b(shareChatDto);
        C54713a.m212321a().mo178392e().mo178403a(shareChatDto.getChatId(), Integer.valueOf(b), aVar, new IGetDataCallback<String>() {
            /* class com.ss.android.lark.share.impl.C54745c.C547483 */

            /* renamed from: a */
            public void onSuccess(String str) {
                if (z) {
                    C54745c.m212420a(shareChatDto.getChatId(), str, shareChatDto.getExtraInfo(), b);
                    if (commonShareData.isSdkShare()) {
                        C54745c.m212417a(commonShareData.getHashKey());
                    }
                }
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Log.m165383e("ShareManager", "sendVideoMessage failed: " + errorResult.getDebugMsg());
                if (!TextUtils.isEmpty(errorResult.getDisplayMsg())) {
                    LKUIToast.show(C54745c.f135183a, errorResult.getDisplayMsg());
                }
                if (z) {
                    C54745c.m212416a(shareChatDto);
                    if (commonShareData.isSdkShare()) {
                        C54745c.m212423b(commonShareData.getHashKey());
                    }
                }
            }
        });
    }

    /* renamed from: a */
    public static void m212411a(final CommonShareData commonShareData, final ShareChatDto shareChatDto, String str, final int i) {
        C54713a.m212321a().mo178392e().mo178404a(shareChatDto.getChatId(), Integer.valueOf(i), C59029c.m229161b(str), new IGetDataCallback<String>() {
            /* class com.ss.android.lark.share.impl.C54745c.AnonymousClass12 */

            /* renamed from: a */
            public void onSuccess(String str) {
                C54745c.m212420a(shareChatDto.getChatId(), str, shareChatDto.getExtraInfo(), i);
                if (commonShareData.isSdkShare()) {
                    C54745c.m212417a(commonShareData.getHashKey());
                }
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Log.m165383e("ShareManager", "sendImageMessage failed: " + errorResult.getDebugMsg());
                if (!TextUtils.isEmpty(errorResult.getDisplayMsg())) {
                    LKUIToast.show(C54745c.f135183a, errorResult.getDisplayMsg());
                }
                C54745c.m212416a(shareChatDto);
                if (commonShareData.isSdkShare()) {
                    C54745c.m212423b(commonShareData.getHashKey());
                }
            }
        });
    }

    /* renamed from: a */
    public static void m212412a(final CommonShareData commonShareData, final ShareChatDto shareChatDto, String str, String str2, String str3, String str4, final int i) {
        C54713a.m212321a().mo178392e().mo178406a(shareChatDto.getChatId(), Integer.valueOf(i), str, str2, str3, str4, new IGetDataCallback<String>() {
            /* class com.ss.android.lark.share.impl.C54745c.C547472 */

            /* renamed from: a */
            public void onSuccess(String str) {
                C54745c.m212420a(shareChatDto.getChatId(), str, shareChatDto.getExtraInfo(), i);
                if (commonShareData.isSdkShare()) {
                    C54745c.m212417a(commonShareData.getHashKey());
                }
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Log.m165383e("ShareManager", "sendWebPageMessage failed: " + errorResult.getDebugMsg());
                if (!TextUtils.isEmpty(errorResult.getDisplayMsg())) {
                    LKUIToast.show(C54745c.f135183a, errorResult.getDisplayMsg());
                }
                C54745c.m212416a(shareChatDto);
                if (commonShareData.isSdkShare()) {
                    C54745c.m212423b(commonShareData.getHashKey());
                }
            }
        });
    }
}
