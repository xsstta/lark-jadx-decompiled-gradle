package io.reactivex.internal.operators.flowable;

import io.reactivex.functions.AbstractC68309a;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.p3459a.C68326a;
import io.reactivex.internal.p3459a.C68362b;
import io.reactivex.internal.subscribers.BlockingSubscriber;
import io.reactivex.internal.subscribers.LambdaSubscriber;
import io.reactivex.internal.util.C68978c;
import io.reactivex.internal.util.NotificationLite;
import java.util.concurrent.LinkedBlockingQueue;
import org.p3511d.AbstractC70020b;
import org.p3511d.AbstractC70021c;

/* renamed from: io.reactivex.internal.operators.flowable.b */
public final class C68567b {
    /* renamed from: a */
    public static <T> void m265323a(AbstractC70020b<? extends T> bVar, AbstractC70021c<? super T> cVar) {
        Object poll;
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        BlockingSubscriber blockingSubscriber = new BlockingSubscriber(linkedBlockingQueue);
        bVar.subscribe(blockingSubscriber);
        do {
            try {
                if (!blockingSubscriber.isCancelled()) {
                    poll = linkedBlockingQueue.poll();
                    if (poll == null) {
                        if (!blockingSubscriber.isCancelled()) {
                            C68978c.m265550a();
                            poll = linkedBlockingQueue.take();
                        } else {
                            return;
                        }
                    }
                    if (!blockingSubscriber.isCancelled()) {
                        if (poll == BlockingSubscriber.TERMINATED) {
                            return;
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            } catch (InterruptedException e) {
                blockingSubscriber.cancel();
                cVar.onError(e);
                return;
            }
        } while (!NotificationLite.acceptFull(poll, cVar));
    }

    /* renamed from: a */
    public static <T> void m265322a(AbstractC70020b<? extends T> bVar, Consumer<? super T> consumer, Consumer<? super Throwable> consumer2, AbstractC68309a aVar) {
        C68362b.m265229a((Object) consumer, "onNext is null");
        C68362b.m265229a((Object) consumer2, "onError is null");
        C68362b.m265229a((Object) aVar, "onComplete is null");
        m265323a(bVar, new LambdaSubscriber(consumer, consumer2, aVar, C68326a.f171650l));
    }
}
