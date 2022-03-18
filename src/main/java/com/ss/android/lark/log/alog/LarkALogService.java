package com.ss.android.lark.log.alog;

import android.content.Intent;
import android.os.Bundle;
import com.ss.alog.middleware.ALogService;
import com.ss.android.lark.log.Log;
import com.ss.android.vc.statistics.p3180a.C63690d;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 *2\u00020\u0001:\u0001*B\u0005¢\u0006\u0002\u0010\u0002J$\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\tH\u0016J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0006H\u0016J\u001c\u0010\f\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\r\u001a\u0004\u0018\u00010\bH\u0016J\b\u0010\u000e\u001a\u00020\u0004H\u0016J\u001c\u0010\u000f\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\r\u001a\u0004\u0018\u00010\bH\u0016J&\u0010\u000f\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\r\u001a\u0004\u0018\u00010\b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\u001c\u0010\u000f\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0004H\u0016J\b\u0010\u0013\u001a\u00020\u0004H\u0016J$\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\r\u001a\u0004\u0018\u00010\bH\u0016J\u001c\u0010\u0015\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\r\u001a\u0004\u0018\u00010\bH\u0016J\b\u0010\u0016\u001a\u00020\u0004H\u0016J\u0012\u0010\u0016\u001a\u00020\u00042\b\u0010\u0017\u001a\u0004\u0018\u00010\bH\u0016J$\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\u0012\u0010\u001a\u001a\u00020\u001b2\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016J\u0010\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u0006H\u0016J$\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\r\u001a\u0004\u0018\u00010\bH\u0016J\b\u0010\u001f\u001a\u00020\u0004H\u0016J1\u0010 \u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0010\u0010!\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010#\u0018\u00010\"H\u0016¢\u0006\u0002\u0010$J$\u0010%\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010%\u001a\u0004\u0018\u00010&H\u0016J$\u0010'\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010'\u001a\u0004\u0018\u00010\u0011H\u0016J\u001c\u0010(\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\r\u001a\u0004\u0018\u00010\bH\u0016J\u001c\u0010)\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\r\u001a\u0004\u0018\u00010\bH\u0016J&\u0010)\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\r\u001a\u0004\u0018\u00010\b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\u001c\u0010)\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016¨\u0006+"}, d2 = {"Lcom/ss/android/lark/log/alog/LarkALogService;", "Lcom/ss/alog/middleware/ALogService;", "()V", "bundle", "", "priority", "", "tag", "", "Landroid/os/Bundle;", "changeLevel", "level", C63690d.f160779a, "msg", "destroy", "e", "tr", "", "flush", "forceLogSharding", "header", "i", "init", "customName", "intent", "Landroid/content/Intent;", "isBlackTag", "", "isLoggable", "logLevel", "json", "release", "statcktrace", "traceElements", "", "Ljava/lang/StackTraceElement;", "(ILjava/lang/String;[Ljava/lang/StackTraceElement;)V", "thread", "Ljava/lang/Thread;", "throwable", "v", "w", "Companion", "logger_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.log.alog.h */
public final class LarkALogService extends ALogService {

    /* renamed from: a */
    public static final Companion f105896a = new Companion(null);

    @JvmStatic
    /* renamed from: f */
    public static final synchronized void m165477f() {
        synchronized (LarkALogService.class) {
            f105896a.mo149961a();
        }
    }

    @Override // com.ss.alog.middleware.AbstractC27214a
    /* renamed from: a */
    public void mo97042a() {
    }

    @Override // com.ss.alog.middleware.AbstractC27214a
    /* renamed from: a */
    public void mo97043a(int i, String str, Intent intent) {
    }

    @Override // com.ss.alog.middleware.AbstractC27214a
    /* renamed from: a */
    public void mo97044a(int i, String str, Bundle bundle) {
    }

    @Override // com.ss.alog.middleware.AbstractC27214a
    /* renamed from: a */
    public void mo97045a(int i, String str, String str2) {
    }

    @Override // com.ss.alog.middleware.AbstractC27214a
    /* renamed from: a */
    public void mo97046a(int i, String str, Thread thread) {
    }

    @Override // com.ss.alog.middleware.AbstractC27214a
    /* renamed from: a */
    public void mo97047a(int i, String str, Throwable th) {
    }

    @Override // com.ss.alog.middleware.AbstractC27214a
    /* renamed from: a */
    public void mo97048a(int i, String str, StackTraceElement[] stackTraceElementArr) {
    }

    @Override // com.ss.alog.middleware.AbstractC27214a
    /* renamed from: a */
    public void mo97049a(String str) {
    }

    @Override // com.ss.alog.middleware.AbstractC27214a
    /* renamed from: a */
    public boolean mo97053a(int i) {
        return false;
    }

    @Override // com.ss.alog.middleware.AbstractC27214a
    /* renamed from: b */
    public void mo97054b() {
    }

    @Override // com.ss.alog.middleware.AbstractC27214a
    /* renamed from: b */
    public void mo97055b(int i) {
    }

    @Override // com.ss.alog.middleware.AbstractC27214a
    /* renamed from: b */
    public void mo97056b(int i, String str, String str2) {
    }

    @Override // com.ss.alog.middleware.AbstractC27214a
    /* renamed from: b */
    public boolean mo97060b(String str) {
        return false;
    }

    @Override // com.ss.alog.middleware.AbstractC27214a
    /* renamed from: c */
    public void mo97061c() {
    }

    @Override // com.ss.alog.middleware.AbstractC27214a
    /* renamed from: d */
    public void mo97063d() {
    }

    @Override // com.ss.alog.middleware.AbstractC27214a
    /* renamed from: e */
    public void mo97065e() {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/log/alog/LarkALogService$Companion;", "", "()V", "initService", "", "logger_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.log.alog.h$a */
    public static final class Companion {
        private Companion() {
        }

        @JvmStatic
        /* renamed from: a */
        public final synchronized void mo149961a() {
            if (ALogService.sInstance == null) {
                new LarkALogService();
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.ss.alog.middleware.AbstractC27214a
    /* renamed from: c */
    public void mo97062c(String str, String str2) {
        Log.m165389i(str, str2);
    }

    @Override // com.ss.alog.middleware.AbstractC27214a
    /* renamed from: d */
    public void mo97064d(String str, String str2) {
        Log.m165397w(str, str2);
    }

    @Override // com.ss.alog.middleware.AbstractC27214a
    /* renamed from: e */
    public void mo97066e(String str, String str2) {
        Log.m165383e(str, str2);
    }

    @Override // com.ss.alog.middleware.AbstractC27214a
    /* renamed from: b */
    public void mo97057b(String str, String str2) {
        Log.m165379d(str, str2);
    }

    @Override // com.ss.alog.middleware.AbstractC27214a
    /* renamed from: b */
    public void mo97059b(String str, Throwable th) {
        Log.m165386e(str, th);
    }

    @Override // com.ss.alog.middleware.AbstractC27214a
    /* renamed from: a */
    public void mo97050a(String str, String str2) {
        Log.m165393v(str, str2);
    }

    @Override // com.ss.alog.middleware.AbstractC27214a
    /* renamed from: a */
    public void mo97052a(String str, Throwable th) {
        Log.m165399w(str, th);
    }

    @Override // com.ss.alog.middleware.AbstractC27214a
    /* renamed from: b */
    public void mo97058b(String str, String str2, Throwable th) {
        Log.m165384e(str, str2, th);
    }

    @Override // com.ss.alog.middleware.AbstractC27214a
    /* renamed from: a */
    public void mo97051a(String str, String str2, Throwable th) {
        Log.m165398w(str, str2, th);
    }
}
