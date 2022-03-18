package com.google.firebase.components;

import com.google.firebase.events.AbstractC22792a;
import com.google.firebase.events.Event;
import com.google.firebase.events.EventHandler;
import com.google.firebase.events.Subscriber;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* renamed from: com.google.firebase.components.k */
public class C22773k implements Subscriber, AbstractC22792a {

    /* renamed from: a */
    private final Map<Class<?>, ConcurrentHashMap<EventHandler<Object>, Executor>> f56311a = new HashMap();

    /* renamed from: b */
    private Queue<Event<?>> f56312b = new ArrayDeque();

    /* renamed from: c */
    private final Executor f56313c;

    /* renamed from: a */
    public void mo79192a() {
        Queue<Event<?>> queue;
        synchronized (this) {
            queue = this.f56312b;
            if (queue != null) {
                this.f56312b = null;
            } else {
                queue = null;
            }
        }
        if (queue != null) {
            for (Event<?> event : queue) {
                mo79193a(event);
            }
        }
    }

    C22773k(Executor executor) {
        this.f56313c = executor;
    }

    /* renamed from: b */
    private synchronized Set<Map.Entry<EventHandler<Object>, Executor>> m82758b(Event<?> event) {
        Set<Map.Entry<EventHandler<Object>, Executor>> set;
        ConcurrentHashMap<EventHandler<Object>, Executor> concurrentHashMap = this.f56311a.get(event.getType());
        if (concurrentHashMap == null) {
            set = Collections.emptySet();
        } else {
            set = concurrentHashMap.entrySet();
        }
        return set;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001a, code lost:
        if (r0.hasNext() == false) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001c, code lost:
        r1 = r0.next();
        r1.getValue().execute(com.google.firebase.components.RunnableC22774l.m82761a(r1, r4));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0030, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x000e, code lost:
        r0 = m82758b(r4).iterator();
     */
    @Override // com.google.firebase.events.AbstractC22792a
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo79193a(com.google.firebase.events.Event<?> r4) {
        /*
            r3 = this;
            com.google.firebase.components.C22776n.m82763a(r4)
            monitor-enter(r3)
            java.util.Queue<com.google.firebase.events.Event<?>> r0 = r3.f56312b     // Catch:{ all -> 0x0031 }
            if (r0 == 0) goto L_0x000d
            r0.add(r4)     // Catch:{ all -> 0x0031 }
            monitor-exit(r3)     // Catch:{ all -> 0x0031 }
            return
        L_0x000d:
            monitor-exit(r3)     // Catch:{ all -> 0x0031 }
            java.util.Set r0 = r3.m82758b(r4)
            java.util.Iterator r0 = r0.iterator()
        L_0x0016:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0030
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getValue()
            java.util.concurrent.Executor r2 = (java.util.concurrent.Executor) r2
            java.lang.Runnable r1 = com.google.firebase.components.RunnableC22774l.m82761a(r1, r4)
            r2.execute(r1)
            goto L_0x0016
        L_0x0030:
            return
        L_0x0031:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.components.C22773k.mo79193a(com.google.firebase.events.Event):void");
    }

    @Override // com.google.firebase.events.Subscriber
    public <T> void subscribe(Class<T> cls, EventHandler<? super T> eventHandler) {
        subscribe(cls, this.f56313c, eventHandler);
    }

    @Override // com.google.firebase.events.Subscriber
    public synchronized <T> void unsubscribe(Class<T> cls, EventHandler<? super T> eventHandler) {
        C22776n.m82763a(cls);
        C22776n.m82763a(eventHandler);
        if (this.f56311a.containsKey(cls)) {
            ConcurrentHashMap<EventHandler<Object>, Executor> concurrentHashMap = this.f56311a.get(cls);
            concurrentHashMap.remove(eventHandler);
            if (concurrentHashMap.isEmpty()) {
                this.f56311a.remove(cls);
            }
        }
    }

    @Override // com.google.firebase.events.Subscriber
    public synchronized <T> void subscribe(Class<T> cls, Executor executor, EventHandler<? super T> eventHandler) {
        C22776n.m82763a(cls);
        C22776n.m82763a(eventHandler);
        C22776n.m82763a(executor);
        if (!this.f56311a.containsKey(cls)) {
            this.f56311a.put(cls, new ConcurrentHashMap<>());
        }
        this.f56311a.get(cls).put(eventHandler, executor);
    }
}
