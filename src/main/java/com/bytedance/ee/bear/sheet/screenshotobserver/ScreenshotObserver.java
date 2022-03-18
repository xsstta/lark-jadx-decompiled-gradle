package com.bytedance.ee.bear.sheet.screenshotobserver;

import android.app.Activity;
import android.content.ContentResolver;
import android.database.ContentObserver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.provider.MediaStore;
import com.bytedance.ee.bear.sheet.common.C11088a;
import com.bytedance.ee.bear.sheet.screenshotobserver.IScreenshotObserver;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p700c.C13598b;
import com.bytedance.ee.util.p701d.C13615c;
import com.bytedance.ee.util.p701d.C13619g;
import com.bytedance.ee.util.p710m.AbstractC13707b;
import com.bytedance.ee.util.p710m.C13708c;
import com.bytedance.ee.util.p718t.C13742g;
import com.bytedance.platform.godzilla.thread.C20339a;
import com.bytedance.platform.godzilla.thread.p873a.C20341a;
import com.google.firebase.messaging.Constants;
import com.larksuite.suite.R;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\t\u0018\u0000 52\u00020\u0001:\u0003567B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0019H\u0016J\u0010\u0010\u001f\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020!H\u0002J\u0010\u0010\"\u001a\u00020\u001d2\u0006\u0010#\u001a\u00020$H\u0002J(\u0010%\u001a\u00020\u001d2\u0006\u0010&\u001a\u00020\u00052\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020*H\u0002J\u0018\u0010,\u001a\u00020\u001d2\u0006\u0010&\u001a\u00020\u00052\u0006\u0010'\u001a\u00020(H\u0002J\u001e\u0010-\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020!2\f\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00050/H\u0016J\b\u00100\u001a\u00020\u001dH\u0016J\u0010\u00101\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0019H\u0016J\b\u00102\u001a\u00020\u001dH\u0002J\b\u00103\u001a\u00020\u001dH\u0016J\b\u00104\u001a\u00020\u001dH\u0016R\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0004¢\u0006\u0004\n\u0002\u0010\u0006R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0004¢\u0006\u0002\n\u0000¨\u00068"}, d2 = {"Lcom/bytedance/ee/bear/sheet/screenshotobserver/ScreenshotObserver;", "Lcom/bytedance/ee/bear/sheet/screenshotobserver/IScreenshotObserver;", "()V", "MEDIA_PROJECTIONS", "", "", "[Ljava/lang/String;", "contentResolver", "Landroid/content/ContentResolver;", "hasReadPermission", "", "lifeCycleState", "Lcom/bytedance/ee/bear/sheet/screenshotobserver/ScreenshotObserver$LifecycleState;", "mExternalObserver", "Landroid/database/ContentObserver;", "mHandler", "Landroid/os/Handler;", "mHandlerThread", "Landroid/os/HandlerThread;", "mInternalObserver", "requestedPermission", "screenshotChecker", "Lcom/bytedance/ee/bear/sheet/screenshotobserver/ScreenshotChecker;", "screenshotListenerList", "", "Lcom/bytedance/ee/bear/sheet/screenshotobserver/IScreenshotObserver$OnScreenshotListener;", "sheetAnalytic", "Lcom/bytedance/ee/bear/sheet/common/SheetAnalytic;", "addScreenshotListener", "", "listener", "checkReadPermission", "context", "Landroid/app/Activity;", "handleMediaContentChange", "contentUri", "Landroid/net/Uri;", "handleMediaRowData", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "dateAdded", "", "width", "", "height", "notifyListeners", "onCreate", "keywords", "", "onDestroy", "removeScreenshotListener", "requestReadPermission", "startObserve", "stopObserve", "Companion", "LifecycleState", "MediaContentObserver", "sheet_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class ScreenshotObserver implements IScreenshotObserver {

    /* renamed from: e */
    public static final String f30366e = f30366e;

    /* renamed from: f */
    public static final Companion f30367f = new Companion(null);

    /* renamed from: a */
    public final List<IScreenshotObserver.OnScreenshotListener> f30368a = new CopyOnWriteArrayList();

    /* renamed from: b */
    public boolean f30369b;

    /* renamed from: c */
    public LifecycleState f30370c = LifecycleState.NotInit;

    /* renamed from: d */
    public boolean f30371d;

    /* renamed from: g */
    private final String[] f30372g = {"_data", "date_added", "width", "height"};

    /* renamed from: h */
    private ContentObserver f30373h;

    /* renamed from: i */
    private ContentObserver f30374i;

    /* renamed from: j */
    private HandlerThread f30375j;

    /* renamed from: k */
    private Handler f30376k;

    /* renamed from: l */
    private ContentResolver f30377l;

    /* renamed from: m */
    private ScreenshotChecker f30378m;

    /* renamed from: n */
    private final C11088a f30379n = new C11088a();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/bytedance/ee/bear/sheet/screenshotobserver/ScreenshotObserver$LifecycleState;", "", "(Ljava/lang/String;I)V", "NotInit", "Created", "ObserveStarted", "ObserveStopped", "Destroyed", "sheet_release"}, mo238835k = 1, mv = {1, 1, 15})
    public enum LifecycleState {
        NotInit,
        Created,
        ObserveStarted,
        ObserveStopped,
        Destroyed
    }

    /* renamed from: a */
    public static HandlerThread m46936a(String str) {
        return C20341a.m74147a() ? C20339a.m74145a(str, 0, C20341a.f49621b) : new HandlerThread(str);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/bytedance/ee/bear/sheet/screenshotobserver/ScreenshotObserver$Companion;", "", "()V", "SCREENSHOT_HANDLER_NAME", "", "TAG", "getTAG", "()Ljava/lang/String;", "sheet_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.sheet.screenshotobserver.ScreenshotObserver$a */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: a */
        public final String mo43270a() {
            return ScreenshotObserver.f30366e;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.sheet.screenshotobserver.ScreenshotObserver$d */
    public static final class RunnableC11296d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ ScreenshotObserver f30385a;

        RunnableC11296d(ScreenshotObserver screenshotObserver) {
            this.f30385a = screenshotObserver;
        }

        public final void run() {
            C13708c.m55599a(C13615c.f35773a, "android.permission.READ_EXTERNAL_STORAGE", C13615c.f35773a.getString(R.string.Doc_Facade_ReadPermission), false, new AbstractC13707b(this) {
                /* class com.bytedance.ee.bear.sheet.screenshotobserver.ScreenshotObserver.RunnableC11296d.C112971 */

                /* renamed from: a */
                final /* synthetic */ RunnableC11296d f30386a;

                {
                    this.f30386a = r1;
                }

                @Override // com.bytedance.ee.util.p710m.AbstractC13707b
                public final void onCheckResult(boolean z) {
                    String a = ScreenshotObserver.f30367f.mo43270a();
                    C13479a.m54764b(a, "Request read permission result. isGranted: " + z);
                    this.f30386a.f30385a.f30369b = z;
                    if (z) {
                        this.f30386a.f30385a.mo43265a("unknown data", 0);
                    }
                }
            });
        }
    }

    /* renamed from: d */
    public void mo43269d() {
        C13479a.m54772d(f30366e, "onDestroy");
        this.f30370c = LifecycleState.Destroyed;
        this.f30368a.clear();
        HandlerThread handlerThread = this.f30375j;
        if (handlerThread != null) {
            handlerThread.quit();
        }
    }

    /* renamed from: a */
    public final void mo43261a() {
        if (!this.f30369b) {
            C13742g.m55705a(new RunnableC11296d(this));
        }
    }

    /* renamed from: b */
    public void mo43266b() {
        ContentResolver contentResolver;
        ContentResolver contentResolver2;
        boolean z;
        C13479a.m54772d(f30366e, "startObserve");
        ScreenshotChecker bVar = this.f30378m;
        if (bVar != null) {
            bVar.mo43280a();
        }
        ContentObserver contentObserver = this.f30373h;
        boolean z2 = true;
        if (!(contentObserver == null || (contentResolver2 = this.f30377l) == null)) {
            Uri uri = MediaStore.Images.Media.INTERNAL_CONTENT_URI;
            if (Build.VERSION.SDK_INT >= 29) {
                z = true;
            } else {
                z = false;
            }
            contentResolver2.registerContentObserver(uri, z, contentObserver);
        }
        ContentObserver contentObserver2 = this.f30374i;
        if (!(contentObserver2 == null || (contentResolver = this.f30377l) == null)) {
            Uri uri2 = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
            if (Build.VERSION.SDK_INT < 29) {
                z2 = false;
            }
            contentResolver.registerContentObserver(uri2, z2, contentObserver2);
        }
        this.f30370c = LifecycleState.ObserveStarted;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.sheet.screenshotobserver.ScreenshotObserver$c */
    public static final class RunnableC11295c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ ScreenshotObserver f30382a;

        /* renamed from: b */
        final /* synthetic */ String f30383b;

        /* renamed from: c */
        final /* synthetic */ long f30384c;

        RunnableC11295c(ScreenshotObserver screenshotObserver, String str, long j) {
            this.f30382a = screenshotObserver;
            this.f30383b = str;
            this.f30384c = j;
        }

        public final void run() {
            if (this.f30382a.f30370c == LifecycleState.ObserveStarted) {
                for (IScreenshotObserver.OnScreenshotListener aVar : this.f30382a.f30368a) {
                    aVar.mo42346a(this.f30383b, this.f30384c);
                }
                return;
            }
            String a = ScreenshotObserver.f30367f.mo43270a();
            C13479a.m54764b(a, "ScreenshotObserver's lifecycle state error: " + this.f30382a.f30370c);
        }
    }

    /* renamed from: c */
    public void mo43268c() {
        ContentResolver contentResolver;
        ContentResolver contentResolver2;
        C13479a.m54772d(f30366e, "stopObserve");
        this.f30370c = LifecycleState.ObserveStopped;
        ScreenshotChecker bVar = this.f30378m;
        if (bVar != null) {
            bVar.mo43282b();
        }
        try {
            ContentObserver contentObserver = this.f30373h;
            if (!(contentObserver == null || (contentResolver2 = this.f30377l) == null)) {
                contentResolver2.unregisterContentObserver(contentObserver);
            }
            ContentObserver contentObserver2 = this.f30374i;
            if (contentObserver2 != null && (contentResolver = this.f30377l) != null) {
                contentResolver.unregisterContentObserver(contentObserver2);
            }
        } catch (Exception e) {
            String str = f30366e;
            C13479a.m54758a(str, "unregisterContentObserver error: " + e);
        }
    }

    /* renamed from: a */
    private final void m46937a(Activity activity) {
        this.f30369b = C13619g.m55266a(activity, "android.permission.READ_EXTERNAL_STORAGE");
    }

    /* renamed from: b */
    public void mo43267b(IScreenshotObserver.OnScreenshotListener aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "listener");
        this.f30368a.remove(aVar);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/bytedance/ee/bear/sheet/screenshotobserver/ScreenshotObserver$MediaContentObserver;", "Landroid/database/ContentObserver;", "mContentUri", "Landroid/net/Uri;", "handler", "Landroid/os/Handler;", "(Lcom/bytedance/ee/bear/sheet/screenshotobserver/ScreenshotObserver;Landroid/net/Uri;Landroid/os/Handler;)V", "onChange", "", "selfChange", "", "sheet_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.sheet.screenshotobserver.ScreenshotObserver$b */
    public final class MediaContentObserver extends ContentObserver {

        /* renamed from: a */
        final /* synthetic */ ScreenshotObserver f30380a;

        /* renamed from: b */
        private final Uri f30381b;

        public void onChange(boolean z) {
            super.onChange(z);
            C13479a.m54772d(ScreenshotObserver.f30367f.mo43270a(), C13598b.m55197d(this.f30381b.toString()));
            if (this.f30380a.f30369b) {
                this.f30380a.mo43263a(this.f30381b);
            } else if (!this.f30380a.f30371d) {
                C13479a.m54764b(ScreenshotObserver.f30367f.mo43270a(), "No permission, request read permission.");
                this.f30380a.f30371d = true;
                this.f30380a.mo43261a();
            } else {
                C13479a.m54764b(ScreenshotObserver.f30367f.mo43270a(), "No permission, user rejected to grant read permission.");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public MediaContentObserver(ScreenshotObserver screenshotObserver, Uri uri, Handler handler) {
            super(handler);
            Intrinsics.checkParameterIsNotNull(uri, "mContentUri");
            this.f30380a = screenshotObserver;
            this.f30381b = uri;
        }
    }

    /* renamed from: a */
    public final void mo43263a(Uri uri) {
        Throwable th;
        Exception e;
        int i;
        int i2;
        Cursor cursor = null;
        Cursor cursor2 = null;
        try {
            ContentResolver contentResolver = this.f30377l;
            if (contentResolver != null) {
                cursor = contentResolver.query(uri, this.f30372g, null, null, "date_added desc limit 1");
            }
            if (cursor == null) {
                try {
                    C13479a.m54758a(f30366e, "Deviant logic.");
                } catch (Exception e2) {
                    e = e2;
                    cursor2 = cursor;
                    try {
                        e.printStackTrace();
                        if (cursor2 != null) {
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        cursor2.close();
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    cursor2 = cursor;
                    if (cursor2 != null && !cursor2.isClosed()) {
                        cursor2.close();
                    }
                    throw th;
                }
            } else if (!cursor.moveToFirst()) {
                C13479a.m54772d(f30366e, "Cursor no data.");
                if (!cursor.isClosed()) {
                    cursor.close();
                }
            } else {
                int columnIndex = cursor.getColumnIndex("_data");
                int columnIndex2 = cursor.getColumnIndex("date_added");
                int columnIndex3 = cursor.getColumnIndex("width");
                int columnIndex4 = cursor.getColumnIndex("height");
                String string = cursor.getString(columnIndex);
                long j = cursor.getLong(columnIndex2);
                if (columnIndex3 < 0 || columnIndex4 < 0) {
                    i2 = 0;
                    i = 0;
                } else {
                    i2 = cursor.getInt(columnIndex3);
                    i = cursor.getInt(columnIndex4);
                }
                Intrinsics.checkExpressionValueIsNotNull(string, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
                m46938a(string, j, i2, i);
                if (!cursor.isClosed()) {
                    cursor.close();
                }
            }
        } catch (Exception e3) {
            e = e3;
            e.printStackTrace();
            if (cursor2 != null && !cursor2.isClosed()) {
                cursor2.close();
            }
        }
    }

    /* renamed from: a */
    public void mo43264a(IScreenshotObserver.OnScreenshotListener aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "listener");
        if (!this.f30368a.contains(aVar)) {
            this.f30368a.add(aVar);
        }
    }

    /* renamed from: a */
    public void mo43262a(Activity activity, List<String> list) {
        Looper looper;
        Intrinsics.checkParameterIsNotNull(activity, "context");
        Intrinsics.checkParameterIsNotNull(list, "keywords");
        C13479a.m54772d(f30366e, "onCreate");
        this.f30378m = new ScreenshotChecker(activity, list);
        this.f30377l = activity.getContentResolver();
        HandlerThread a = m46936a("Screenshot_Observer");
        this.f30375j = a;
        if (a != null) {
            a.start();
        }
        HandlerThread handlerThread = this.f30375j;
        if (handlerThread != null) {
            looper = handlerThread.getLooper();
        } else {
            looper = null;
        }
        if (looper == null) {
            Intrinsics.throwNpe();
        }
        this.f30376k = new Handler(looper);
        Uri uri = MediaStore.Images.Media.INTERNAL_CONTENT_URI;
        Intrinsics.checkExpressionValueIsNotNull(uri, "MediaStore.Images.Media.INTERNAL_CONTENT_URI");
        this.f30373h = new MediaContentObserver(this, uri, this.f30376k);
        Uri uri2 = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
        Intrinsics.checkExpressionValueIsNotNull(uri2, "MediaStore.Images.Media.EXTERNAL_CONTENT_URI");
        this.f30374i = new MediaContentObserver(this, uri2, this.f30376k);
        m46937a(activity);
        this.f30370c = LifecycleState.Created;
    }

    /* renamed from: a */
    public final void mo43265a(String str, long j) {
        C13742g.m55705a(new RunnableC11295c(this, str, j));
    }

    /* renamed from: a */
    private final void m46938a(String str, long j, int i, int i2) {
        ScreenshotChecker bVar = this.f30378m;
        if (bVar == null || !bVar.mo43281a(str, j, i, i2)) {
            this.f30379n.mo42275d(str);
            C13479a.m54772d(f30366e, "Not screenshot event");
            return;
        }
        String str2 = f30366e;
        C13479a.m54772d(str2, "handleMediaRowData: is ScreenShot,path: " + str + "  dateAdded: " + j + ", " + "notify listeners");
        mo43265a(str, j);
    }
}
