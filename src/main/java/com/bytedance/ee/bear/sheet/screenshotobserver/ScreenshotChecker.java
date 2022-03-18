package com.bytedance.ee.bear.sheet.screenshotobserver;

import android.app.Activity;
import android.graphics.Point;
import android.view.Display;
import android.view.WindowManager;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.common.C13608f;
import com.google.firebase.messaging.Constants;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J&\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012J\n\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0002J\u0010\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u0006H\u0002J\u0006\u0010\u0018\u001a\u00020\u0019J\u0006\u0010\u001a\u001a\u00020\u0019R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/bytedance/ee/bear/sheet/screenshotobserver/ScreenshotChecker;", "", "context", "Landroid/app/Activity;", "keywords", "", "", "(Landroid/app/Activity;Ljava/util/List;)V", "KEYWORDS", "", "recordedPaths", "startObserveTime", "", "checkScreenShot", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "dateAdded", "width", "", "height", "getRealScreenSize", "Landroid/graphics/Point;", "hasRecordPath", "imagePath", "startObserve", "", "stopObserve", "Companion", "sheet_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.sheet.screenshotobserver.b */
public final class ScreenshotChecker {

    /* renamed from: a */
    public static Point f30387a;

    /* renamed from: b */
    public static final Companion f30388b = new Companion(null);

    /* renamed from: c */
    private List<String> f30389c = new ArrayList();

    /* renamed from: d */
    private long f30390d;

    /* renamed from: e */
    private final List<String> f30391e = new CopyOnWriteArrayList();

    /* renamed from: f */
    private final Activity f30392f;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/bytedance/ee/bear/sheet/screenshotobserver/ScreenshotChecker$Companion;", "", "()V", "SCREENSHOT_INVALID_INTERNAL", "", "TAG", "", "sScreenRealSize", "Landroid/graphics/Point;", "getSScreenRealSize", "()Landroid/graphics/Point;", "setSScreenRealSize", "(Landroid/graphics/Point;)V", "sheet_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.sheet.screenshotobserver.b$a */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: a */
        public final Point mo43285a() {
            return ScreenshotChecker.f30387a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo43286a(Point point) {
            ScreenshotChecker.f30387a = point;
        }
    }

    /* renamed from: a */
    public final void mo43280a() {
        this.f30390d = System.currentTimeMillis();
    }

    /* renamed from: b */
    public final void mo43282b() {
        this.f30390d = 0;
        this.f30391e.clear();
    }

    /* renamed from: c */
    public final Point mo43283c() {
        Point point;
        Exception e;
        Point point2 = null;
        try {
            point = new Point();
            try {
                Object systemService = this.f30392f.getSystemService("window");
                if (systemService != null) {
                    Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
                    Intrinsics.checkExpressionValueIsNotNull(defaultDisplay, "windowManager.defaultDisplay");
                    defaultDisplay.getRealSize(point);
                    return point;
                }
                throw new TypeCastException("null cannot be cast to non-null type android.view.WindowManager");
            } catch (Exception e2) {
                e = e2;
                e.printStackTrace();
                return point;
            }
        } catch (Exception e3) {
            point = point2;
            e = e3;
            e.printStackTrace();
            return point;
        }
    }

    /* renamed from: a */
    private final boolean m46950a(String str) {
        if (this.f30391e.contains(str)) {
            C13479a.m54772d("ScreenshotChecker", "ScreenShot: imgPath has done; imagePath = " + str);
            return true;
        }
        if (this.f30391e.size() >= 20) {
            for (int i = 0; i <= 4; i++) {
                this.f30391e.remove(0);
            }
        }
        this.f30391e.add(str);
        return false;
    }

    public ScreenshotChecker(Activity activity, List<String> list) {
        Intrinsics.checkParameterIsNotNull(activity, "context");
        Intrinsics.checkParameterIsNotNull(list, "keywords");
        this.f30392f = activity;
        this.f30389c.addAll(list);
        C13608f.m55249a(new Runnable(this) {
            /* class com.bytedance.ee.bear.sheet.screenshotobserver.ScreenshotChecker.RunnableC112981 */

            /* renamed from: a */
            final /* synthetic */ ScreenshotChecker f30393a;

            {
                this.f30393a = r1;
            }

            public final void run() {
                Integer num;
                if (ScreenshotChecker.f30388b.mo43285a() == null) {
                    ScreenshotChecker.f30388b.mo43286a(this.f30393a.mo43283c());
                    if (ScreenshotChecker.f30388b.mo43285a() != null) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Screen Real Size: ");
                        Point a = ScreenshotChecker.f30388b.mo43285a();
                        Integer num2 = null;
                        if (a != null) {
                            num = Integer.valueOf(a.x);
                        } else {
                            num = null;
                        }
                        sb.append(num);
                        sb.append(" * ");
                        Point a2 = ScreenshotChecker.f30388b.mo43285a();
                        if (a2 != null) {
                            num2 = Integer.valueOf(a2.y);
                        }
                        sb.append(num2);
                        C13479a.m54772d("ScreenshotChecker", sb.toString());
                        return;
                    }
                    C13479a.m54758a("ScreenshotChecker", "Get screen real size failed.");
                }
            }
        });
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0034, code lost:
        if (r12 > r9) goto L_0x0036;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0048, code lost:
        if (r11 > r9) goto L_0x004a;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo43281a(java.lang.String r8, long r9, int r11, int r12) {
        /*
        // Method dump skipped, instructions count: 181
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.bear.sheet.screenshotobserver.ScreenshotChecker.mo43281a(java.lang.String, long, int, int):boolean");
    }
}
