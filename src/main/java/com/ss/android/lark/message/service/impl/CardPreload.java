package com.ss.android.lark.message.service.impl;

import com.facebook.soloader.SoLoader;
import com.facebook.yoga.YogaNode;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.message.card.C45294c;
import com.ss.android.lark.message.card.p2261a.AbstractC45287a;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u001a\u001a\u00020\u001bH\u0007J\b\u0010\u001c\u001a\u00020\u001bH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0010\n\u0002\u0010\u000b\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR\u0011\u0010\u0013\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\r\"\u0004\b\u0019\u0010\u000f¨\u0006\u001d"}, d2 = {"Lcom/ss/android/lark/message/service/impl/CardPreload;", "", "()V", "TAG", "", "enable", "", "getEnable", "()Ljava/lang/Boolean;", "setEnable", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "isLoading", "()Z", "setLoading", "(Z)V", "loaded", "getLoaded", "setLoaded", "lock", "Ljava/util/concurrent/locks/ReentrantLock;", "getLock", "()Ljava/util/concurrent/locks/ReentrantLock;", "soInited", "getSoInited", "setSoInited", "acquireSoLoaded", "", "loadSoLib", "im_messages_card-message_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.message.service.a.a */
public final class CardPreload {

    /* renamed from: a */
    public static final CardPreload f114933a = new CardPreload();

    /* renamed from: b */
    private static final ReentrantLock f114934b = new ReentrantLock();

    /* renamed from: c */
    private static volatile boolean f114935c;

    /* renamed from: d */
    private static volatile boolean f114936d;

    /* renamed from: e */
    private static volatile boolean f114937e;

    private CardPreload() {
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: b */
    public final void mo160211b() {
        if (!f114935c && !f114936d) {
            f114935c = true;
            ReentrantLock reentrantLock = f114934b;
            reentrantLock.lock();
            try {
                new YogaNode();
                reentrantLock.unlock();
                f114936d = true;
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
    }

    /* renamed from: a */
    public final void mo160210a() {
        if (!f114937e) {
            try {
                StringBuilder sb = new StringBuilder();
                sb.append("current thread name");
                Thread currentThread = Thread.currentThread();
                Intrinsics.checkExpressionValueIsNotNull(currentThread, "Thread.currentThread()");
                sb.append(currentThread.getName());
                Log.m165389i("CardPreload", sb.toString());
                AbstractC45287a a = C45294c.m179871a();
                Intrinsics.checkExpressionValueIsNotNull(a, "MessageCardModule.getDependency()");
                SoLoader.init(a.mo143887a(), false);
            } catch (IllegalStateException e) {
                Log.m165389i("CardPreload", e.getMessage());
            }
            f114937e = true;
        }
        if (!f114936d) {
            if (f114935c) {
                ReentrantLock reentrantLock = f114934b;
                reentrantLock.lock();
                try {
                    Unit unit = Unit.INSTANCE;
                } finally {
                    reentrantLock.unlock();
                }
            } else {
                f114936d = true;
            }
        }
    }
}
