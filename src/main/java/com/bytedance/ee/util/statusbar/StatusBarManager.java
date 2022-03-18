package com.bytedance.ee.util.statusbar;

import android.app.Activity;
import android.os.Build;
import android.view.View;
import android.view.Window;
import com.bytedance.ee.bear.widget.statusbar.C11789c;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0007B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\b"}, d2 = {"Lcom/bytedance/ee/util/statusbar/StatusBarManager;", "", "()V", "of", "Lcom/bytedance/ee/util/statusbar/IStatusBar;", "activity", "Landroid/app/Activity;", "StatusBar", "util_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.util.q.b */
public final class StatusBarManager {

    /* renamed from: a */
    public static final StatusBarManager f35915a = new StatusBarManager();

    private StatusBarManager() {
    }

    /* access modifiers changed from: private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0011H\u0016J\u0018\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u000bH\u0016J\u0018\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u000bH\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00038BX\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u0004\n\u0002\u0010\fR\u0012\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0004\n\u0002\u0010\u000f¨\u0006\u0018"}, d2 = {"Lcom/bytedance/ee/util/statusbar/StatusBarManager$StatusBar;", "Lcom/bytedance/ee/util/statusbar/IStatusBar;", "activity", "Landroid/app/Activity;", "(Landroid/app/Activity;)V", "activityRef", "Ljava/lang/ref/WeakReference;", "mActivity", "getMActivity", "()Landroid/app/Activity;", "oldLightStatusBar", "", "Ljava/lang/Boolean;", "oldStatusBarColor", "", "Ljava/lang/Integer;", "resetState", "", "saveState", "setColor", "statusBarColor", "lightStatusBar", "setColorRes", "statusBarColorRes", "util_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.util.q.b$a */
    public static final class StatusBar implements IStatusBar {

        /* renamed from: a */
        private final WeakReference<Activity> f35916a;

        /* renamed from: b */
        private Integer f35917b;

        /* renamed from: c */
        private Boolean f35918c;

        /* renamed from: c */
        private final Activity m55629c() {
            return this.f35916a.get();
        }

        @Override // com.bytedance.ee.util.statusbar.IStatusBar
        /* renamed from: b */
        public void mo50689b() {
            Integer num;
            Activity c = m55629c();
            if (c != null && (num = this.f35917b) != null) {
                int intValue = num.intValue();
                Boolean bool = this.f35918c;
                if (bool != null) {
                    C11789c.m48865a(c, intValue, bool.booleanValue());
                } else {
                    C11789c.m48864a(c, intValue);
                }
            }
        }

        @Override // com.bytedance.ee.util.statusbar.IStatusBar
        /* renamed from: a */
        public void mo50687a() {
            boolean z;
            Activity c = m55629c();
            if (c != null) {
                Window window = c.getWindow();
                Intrinsics.checkExpressionValueIsNotNull(window, "it.window");
                this.f35917b = Integer.valueOf(window.getStatusBarColor());
                if (Build.VERSION.SDK_INT >= 23) {
                    Window window2 = c.getWindow();
                    Intrinsics.checkExpressionValueIsNotNull(window2, "it.window");
                    View decorView = window2.getDecorView();
                    Intrinsics.checkExpressionValueIsNotNull(decorView, "it.window.decorView");
                    if ((decorView.getSystemUiVisibility() & 8192) == 8192) {
                        z = true;
                    } else {
                        z = false;
                    }
                    this.f35918c = Boolean.valueOf(z);
                }
            }
        }

        public StatusBar(Activity activity) {
            Intrinsics.checkParameterIsNotNull(activity, "activity");
            this.f35916a = new WeakReference<>(activity);
        }

        @Override // com.bytedance.ee.util.statusbar.IStatusBar
        /* renamed from: a */
        public void mo50688a(int i, boolean z) {
            Activity c = m55629c();
            if (c != null) {
                C11789c.m48865a(c, i, z);
            }
        }

        @Override // com.bytedance.ee.util.statusbar.IStatusBar
        /* renamed from: b */
        public void mo50690b(int i, boolean z) {
            Activity c = m55629c();
            if (c != null) {
                mo50688a(c.getResources().getColor(i), z);
            }
        }
    }

    @JvmStatic
    /* renamed from: a */
    public static final IStatusBar m55628a(Activity activity) {
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        return new StatusBar(activity);
    }
}
