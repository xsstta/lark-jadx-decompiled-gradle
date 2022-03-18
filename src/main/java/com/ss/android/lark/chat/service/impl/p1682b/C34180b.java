package com.ss.android.lark.chat.service.impl.p1682b;

import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.chat.api.service.p1600b.C32848e;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.message.SendStatus;
import com.ss.android.lark.chat.entity.message.content.FileState;
import com.ss.android.lark.chat.entity.message.content.MediaContent;
import com.ss.android.lark.chat.service.AbstractC34295j;
import com.ss.android.lark.chat.service.impl.AbstractC34231l;
import com.ss.android.lark.chat.service.impl.C34276v;
import com.ss.android.lark.chat.service.impl.IMediaSendCallback;
import com.ss.android.lark.chat.service.impl.MediaMessageMonitor;
import com.ss.android.lark.chat.service.impl.p1681a.AbstractC34135a;
import com.ss.android.lark.chat.service.impl.p1681a.C34136b;
import com.ss.android.lark.chat.service.impl.p1682b.C34180b;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.compress.VideoCompressErrorResult;
import com.ss.android.lark.utils.compress.VideoCompressResult;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.ss.android.lark.chat.service.impl.b.b */
public class C34180b {

    /* renamed from: a */
    private volatile Set<String> f88450a;

    /* renamed from: b */
    private ExecutorService f88451b;

    /* renamed from: com.ss.android.lark.chat.service.impl.b.b$a */
    private static final class C34182a {

        /* renamed from: a */
        public static final C34180b f88457a = new C34180b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.chat.service.impl.b.b$b */
    public static class C34183b {

        /* renamed from: a */
        Message f88458a;

        /* renamed from: b */
        int f88459b;

        /* renamed from: c */
        boolean f88460c;

        /* renamed from: d */
        IGetDataCallback<String> f88461d;

        /* renamed from: e */
        boolean f88462e;

        C34183b() {
        }
    }

    /* renamed from: a */
    public static C34180b m132694a() {
        return C34182a.f88457a;
    }

    private C34180b() {
        this.f88450a = new HashSet(8);
        this.f88451b = CoreThreadPool.getDefault().getCachedThreadPool();
    }

    /* renamed from: b */
    private synchronized void m132696b(C34183b bVar) {
        Message message = bVar.f88458a;
        Log.m165389i("MediaSendDispatcher", "compress is success, start to send msg: " + message.getId());
        if (bVar.f88461d instanceof AbstractC34295j) {
            if (bVar.f88460c) {
                MediaContent mediaContent = new MediaContent((MediaContent) message.getContent());
                mediaContent.setFileState(FileState.DOWNLOADING);
                mediaContent.setProgress(60);
                message.setMessageContent(mediaContent);
            }
            ((AbstractC34295j) bVar.f88461d).mo121315a(message);
        }
        if (bVar.f88462e) {
            C32848e.m126401b().mo121086a(message.getSendMessageParams(), bVar.f88461d);
        } else {
            C32848e.m126401b().mo121264b(message.getSendMessageParams(), bVar.f88461d);
        }
    }

    /* renamed from: a */
    public synchronized void mo126723a(C34183b bVar) {
        String compressPath;
        Message message = bVar.f88458a;
        if (this.f88450a.contains(message.getcId())) {
            Log.m165389i("MediaSendDispatcher", "same message is sending: " + message);
            return;
        }
        this.f88450a.add(message.getId());
        if (bVar.f88459b == 0) {
            m132696b(bVar);
            this.f88450a.remove(message.getId());
            return;
        }
        String id = message.getId();
        if ((message.getContent() instanceof MediaContent) && (compressPath = ((MediaContent) message.getContent()).getCompressPath()) != null) {
            MediaMessageMonitor.m132848a(id, compressPath);
        }
        this.f88451b.execute(new Runnable(message, bVar, id) {
            /* class com.ss.android.lark.chat.service.impl.p1682b.$$Lambda$b$GF3jJeVxQ0klv40FGamquRsxPlE */
            public final /* synthetic */ Message f$1;
            public final /* synthetic */ C34180b.C34183b f$2;
            public final /* synthetic */ String f$3;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
            }

            public final void run() {
                C34180b.this.m132695a((C34180b) this.f$1, (Message) this.f$2, (C34180b.C34183b) this.f$3);
            }
        });
    }

    /* renamed from: a */
    private synchronized AbstractC34135a<VideoCompressResult> m132693a(final CountDownLatch countDownLatch, final AtomicBoolean atomicBoolean, final C34183b bVar) {
        return new AbstractC34135a<VideoCompressResult>() {
            /* class com.ss.android.lark.chat.service.impl.p1682b.C34180b.C341811 */

            /* renamed from: e */
            private int f88456e;

            /* renamed from: a */
            public void onSuccess(VideoCompressResult videoCompressResult) {
                mo126686a(1.0f);
                if (bVar.f88461d instanceof IMediaSendCallback) {
                    ((IMediaSendCallback) bVar.f88461d).mo121316a(videoCompressResult);
                }
                countDownLatch.countDown();
            }

            @Override // com.ss.android.lark.utils.ao.AbstractC57802a
            /* renamed from: a */
            public void mo126686a(float f) {
                int i;
                if (bVar.f88460c && (bVar.f88461d instanceof AbstractC34231l) && this.f88456e != (i = (int) (f * 60.0f))) {
                    MediaContent mediaContent = new MediaContent((MediaContent) bVar.f88458a.getContent());
                    mediaContent.setProgress(i);
                    bVar.f88458a.setMessageContent(mediaContent);
                    ((AbstractC34231l) bVar.f88461d).mo121318b(bVar.f88458a);
                    this.f88456e = i;
                }
            }

            @Override // com.ss.android.lark.chat.service.impl.p1681a.AbstractC34135a
            /* renamed from: a */
            public void mo126663a(ErrorResult errorResult) {
                mo126686a(BitmapDescriptorFactory.HUE_RED);
                Log.m165383e("MediaSendDispatcher", "compress video fail: " + errorResult.getException());
                while (countDownLatch.getCount() > 0) {
                    countDownLatch.countDown();
                }
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                VideoCompressResult videoCompressResult;
                mo126686a(BitmapDescriptorFactory.HUE_RED);
                Log.m165383e("MediaSendDispatcher", "compress video fail: " + errorResult.getException());
                if ((bVar.f88461d instanceof IMediaSendCallback) && (errorResult instanceof VideoCompressErrorResult) && (videoCompressResult = ((VideoCompressErrorResult) errorResult).getVideoCompressResult()) != null) {
                    ((IMediaSendCallback) bVar.f88461d).mo121316a(videoCompressResult);
                }
                atomicBoolean.set(true);
                countDownLatch.countDown();
            }
        };
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m132695a(Message message, C34183b bVar, String str) {
        C32848e.m126401b().mo121259a(message.getcId(), SendStatus.SENDING);
        if (bVar.f88461d instanceof IMediaSendCallback) {
            ((IMediaSendCallback) bVar.f88461d).mo121312a();
        }
        CountDownLatch countDownLatch = new CountDownLatch(bVar.f88459b);
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        C34136b.m132589a().mo126664a(message, m132693a(countDownLatch, atomicBoolean, bVar));
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            Log.m165383e("MediaSendDispatcher", "Compress video interrupted, cid:" + message.getcId() + "msg: " + e.getMessage());
            atomicBoolean.set(true);
            MediaMessageMonitor.m132849a(str, "native", -1, e.getMessage());
        }
        if (atomicBoolean.get()) {
            C32848e.m126401b().mo121259a(message.getcId(), SendStatus.FAIL);
            C34276v.m132951a();
        } else {
            m132696b(bVar);
        }
        this.f88450a.remove(message.getId());
    }
}
