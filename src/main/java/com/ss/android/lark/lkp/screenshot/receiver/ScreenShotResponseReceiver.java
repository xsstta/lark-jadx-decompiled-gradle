package com.ss.android.lark.lkp.screenshot.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.biz.im.api.IScreenshotCallBack;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u0000 \u00192\u00020\u00012\u00020\u0002:\u0001\u0019B\u0005¢\u0006\u0002\u0010\u0003J\u0012\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0012\u0010\r\u001a\u00020\u000e2\b\u0010\u000b\u001a\u0004\u0018\u00010\tH\u0002J\u001a\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J\u0010\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u0010\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\bH\u0016J\u0010\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\bH\u0016J\u0012\u0010\u0017\u001a\u00020\u00182\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X.¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007X\u000e¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/ss/android/lark/lkp/screenshot/receiver/ScreenShotResponseReceiver;", "Landroid/content/BroadcastReceiver;", "Lcom/ss/android/lark/lkp/screenshot/receiver/IScreenShotReceiver;", "()V", "mContext", "Landroid/content/Context;", "mListeners", "Ljava/util/concurrent/ConcurrentHashMap;", "Lcom/ss/android/lark/biz/im/api/IScreenshotCallBack;", "", "convertUriToPath", "uri", "Landroid/net/Uri;", "onBroadReceived", "", "onReceive", "context", "intent", "Landroid/content/Intent;", "onScreenshotSave", "registerReceiverObserver", "observer", "unRegisterReceiverObserver", "validate", "", "Companion", "im_screenshot-lkp_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class ScreenShotResponseReceiver extends BroadcastReceiver implements IScreenShotReceiver {

    /* renamed from: a */
    public static final Companion f105618a = new Companion(null);

    /* renamed from: b */
    private ConcurrentHashMap<IScreenshotCallBack, String> f105619b = new ConcurrentHashMap<>();

    /* renamed from: c */
    private Context f105620c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/lkp/screenshot/receiver/ScreenShotResponseReceiver$Companion;", "", "()V", "PRESENT", "", "im_screenshot-lkp_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.lkp.screenshot.receiver.ScreenShotResponseReceiver$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.lkp.screenshot.receiver.ScreenShotResponseReceiver$b */
    public static final class RunnableC41547b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ ScreenShotResponseReceiver f105621a;

        /* renamed from: b */
        final /* synthetic */ Intent f105622b;

        RunnableC41547b(ScreenShotResponseReceiver screenShotResponseReceiver, Intent intent) {
            this.f105621a = screenShotResponseReceiver;
            this.f105622b = intent;
        }

        public final void run() {
            if (this.f105621a.mo149477a(this.f105622b)) {
                this.f105621a.mo149476a(this.f105622b.getStringExtra("screen_shot_action_result"));
                return;
            }
            this.f105621a.mo149476a((String) null);
        }
    }

    @Override // com.ss.android.lark.lkp.screenshot.receiver.IScreenShotReceiver
    /* renamed from: a */
    public void mo149475a(IScreenshotCallBack uVar) {
        Intrinsics.checkParameterIsNotNull(uVar, "observer");
        this.f105619b.put(uVar, "");
    }

    @Override // com.ss.android.lark.lkp.screenshot.receiver.IScreenShotReceiver
    /* renamed from: b */
    public void mo149478b(IScreenshotCallBack uVar) {
        Intrinsics.checkParameterIsNotNull(uVar, "observer");
        this.f105619b.remove(uVar);
    }

    /* renamed from: b */
    private final void m164857b(Intent intent) {
        CoreThreadPool coreThreadPool = CoreThreadPool.getDefault();
        Intrinsics.checkExpressionValueIsNotNull(coreThreadPool, "CoreThreadPool.getDefault()");
        coreThreadPool.getCachedThreadPool().execute(new RunnableC41547b(this, intent));
    }

    /* renamed from: a */
    public final boolean mo149477a(Intent intent) {
        String str;
        if (intent != null) {
            str = intent.getStringExtra("screen_shot_action_result");
        } else {
            str = null;
        }
        if (str != null) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0045, code lost:
        if (r1 != null) goto L_0x0047;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0047, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0051, code lost:
        if (r1 == null) goto L_0x0054;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0054, code lost:
        return r0;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.String m164856a(android.net.Uri r10) {
        /*
            r9 = this;
            java.lang.String r0 = r10.getScheme()
            java.lang.String r1 = "content"
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            r0 = r0 ^ 1
            r1 = 0
            if (r0 == 0) goto L_0x0010
            return r1
        L_0x0010:
            r0 = r1
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r2 = "_data"
            java.lang.String[] r2 = new java.lang.String[]{r2}
            android.database.Cursor r1 = (android.database.Cursor) r1
            android.content.Context r3 = r9.f105620c     // Catch:{ Exception -> 0x004d }
            if (r3 != 0) goto L_0x0024
            java.lang.String r4 = "mContext"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r4)     // Catch:{ Exception -> 0x004d }
        L_0x0024:
            android.content.ContentResolver r3 = r3.getContentResolver()     // Catch:{ Exception -> 0x004d }
            r6 = 0
            r7 = 0
            r8 = 0
            r4 = r10
            r5 = r2
            android.database.Cursor r1 = r3.query(r4, r5, r6, r7, r8)     // Catch:{ Exception -> 0x004d }
            if (r1 == 0) goto L_0x0045
            boolean r10 = r1.moveToFirst()     // Catch:{ Exception -> 0x004d }
            if (r10 == 0) goto L_0x0045
            r10 = 0
            r10 = r2[r10]     // Catch:{ Exception -> 0x004d }
            int r10 = r1.getColumnIndexOrThrow(r10)     // Catch:{ Exception -> 0x004d }
            java.lang.String r10 = r1.getString(r10)     // Catch:{ Exception -> 0x004d }
            r0 = r10
        L_0x0045:
            if (r1 == 0) goto L_0x0054
        L_0x0047:
            r1.close()
            goto L_0x0054
        L_0x004b:
            r10 = move-exception
            goto L_0x0055
        L_0x004d:
            r10 = move-exception
            r10.printStackTrace()     // Catch:{ all -> 0x004b }
            if (r1 == 0) goto L_0x0054
            goto L_0x0047
        L_0x0054:
            return r0
        L_0x0055:
            if (r1 == 0) goto L_0x005a
            r1.close()
        L_0x005a:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.lkp.screenshot.receiver.ScreenShotResponseReceiver.m164856a(android.net.Uri):java.lang.String");
    }

    /* renamed from: a */
    public final void mo149476a(String str) {
        if (str == null) {
            for (Map.Entry<IScreenshotCallBack, String> entry : this.f105619b.entrySet()) {
                entry.getKey().mo106758a(2);
            }
            return;
        }
        Uri parse = Uri.parse(str);
        Intrinsics.checkExpressionValueIsNotNull(parse, "Uri.parse(uri)");
        String a = m164856a(parse);
        if (a == null) {
            for (Map.Entry<IScreenshotCallBack, String> entry2 : this.f105619b.entrySet()) {
                entry2.getKey().mo106758a(2);
            }
            return;
        }
        for (Map.Entry<IScreenshotCallBack, String> entry3 : this.f105619b.entrySet()) {
            entry3.getKey().mo106759a(a);
        }
    }

    public void onReceive(Context context, Intent intent) {
        String stringExtra;
        String str;
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f105620c = context;
        if (intent != null && (stringExtra = intent.getStringExtra("screen_shot_action_type")) != null) {
            switch (stringExtra.hashCode()) {
                case -1726493528:
                    str = "screen_shot_action_share";
                    break;
                case -194642123:
                    str = "screen_shot_action_exit";
                    break;
                case -194246764:
                    if (stringExtra.equals("screen_shot_action_save")) {
                        m164857b(intent);
                        return;
                    }
                    return;
                case 1849117393:
                    str = "screen_shot_action_cancel";
                    break;
                default:
                    return;
            }
            stringExtra.equals(str);
        }
    }
}
