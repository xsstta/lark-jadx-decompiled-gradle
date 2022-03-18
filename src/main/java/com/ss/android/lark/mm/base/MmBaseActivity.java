package com.ss.android.lark.mm.base;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import com.larksuite.component.air.AirActivity;
import com.larksuite.component.universe_design.util.UDUiModeUtils;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.base.C29517a;
import com.ss.android.lark.mm.module.list.base.MinutesListActivity;
import com.ss.android.lark.mm.module.podcast.UltimateBarXInitializerWrapper;
import com.ss.android.lark.mm.p2288b.C45855f;
import com.ss.android.lark.mm.utils.C47103g;
import com.ss.android.lark.mm.utils.p2335a.C47096b;
import com.ss.android.lark.utils.C57764ab;
import com.ss.android.lark.utils.StatusBarUtil;
import com.zackratos.ultimatebarx.ultimatebarx.UltimateBarX;
import com.zackratos.ultimatebarx.ultimatebarx.operator.Operator;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.UninitializedPropertyAccessException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0002J\b\u0010\u000b\u001a\u00020\fH\u0002J\u0006\u0010\r\u001a\u00020\fJ\u0012\u0010\u000e\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\nH\u0014J\b\u0010\u0010\u001a\u00020\fH\u0014J\b\u0010\u0011\u001a\u00020\fH\u0014J\b\u0010\u0012\u001a\u00020\fH\u0014J\u0010\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0015H\u0004R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0017"}, d2 = {"Lcom/ss/android/lark/mm/base/MmBaseActivity;", "Lcom/larksuite/component/air/AirActivity;", "()V", "timerExecutor", "Lcom/ss/android/lark/mm/utils/timer/MmTimerExecutor;", "getTimerExecutor", "()Lcom/ss/android/lark/mm/utils/timer/MmTimerExecutor;", "clearFragmentRestore", "", "bundle", "Landroid/os/Bundle;", "initNavigationBarColor", "", "initStatusAndNavigationBar", "onCreate", "savedInstanceState", "onDestroy", "onPause", "onResume", "updateStatusNavBarPadding", "view", "Landroid/view/View;", "Companion", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
public class MmBaseActivity extends AirActivity {

    /* renamed from: a */
    public static final Companion f115683a = new Companion(null);

    /* renamed from: b */
    private final C47096b f115684b = new C47096b();

    /* renamed from: c */
    private HashMap f115685c;

    /* renamed from: a */
    public View mo161162a(int i) {
        if (this.f115685c == null) {
            this.f115685c = new HashMap();
        }
        View view = (View) this.f115685c.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f115685c.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/mm/base/MmBaseActivity$Companion;", "", "()V", "FRAGMENTS_TAG", "", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.base.MmBaseActivity$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: b */
    public final C47096b mo161164b() {
        return this.f115684b;
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity
    public void onDestroy() {
        if (!(this instanceof MinutesListActivity)) {
            MmActiveStateObservable.f115698a.mo161188b();
        }
        super.onDestroy();
        this.f115684b.mo165476c();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity
    public void onPause() {
        super.onPause();
        this.f115684b.mo165478d();
        C29517a.AbstractC29518a a = C29517a.m108723a();
        if (a != null) {
            a.mo102790b(this);
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity
    public void onResume() {
        super.onResume();
        this.f115684b.mo165480e();
        C29517a.AbstractC29518a a = C29517a.m108723a();
        if (a != null) {
            a.mo102786a((Activity) this);
        }
    }

    /* renamed from: a */
    private final void mo161315a() {
        int color = UIUtils.getColor(this, R.color.bg_body);
        getWindow().addFlags(Integer.MIN_VALUE);
        getWindow().clearFlags(134217728);
        Window window = getWindow();
        Intrinsics.checkExpressionValueIsNotNull(window, "window");
        window.setNavigationBarColor(color);
    }

    public final void bd_() {
        boolean z;
        try {
            if (Build.VERSION.SDK_INT >= 26) {
                UltimateBarXInitializerWrapper.f117659b.mo164306a();
                Operator d = UltimateBarX.f171308a.mo236950a(this).mo237001d();
                if (!UDUiModeUtils.m93319a(this)) {
                    z = true;
                } else {
                    z = false;
                }
                Operator a = d.mo236999a(z);
                a.mo236995a();
                a.mo236996b();
            } else if (!UDUiModeUtils.m93319a(this)) {
                C47103g.m186549b(this);
                Window window = getWindow();
                if (window != null) {
                    window.setNavigationBarColor(-16777216);
                }
            } else {
                C47103g.m186548a(this);
                Window window2 = getWindow();
                if (window2 != null) {
                    window2.setNavigationBarColor(-1);
                }
            }
        } catch (UninitializedPropertyAccessException unused) {
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity
    public void onCreate(Bundle bundle) {
        m181689a(bundle);
        super.onCreate(bundle);
        if (!(this instanceof MinutesListActivity)) {
            MmActiveStateObservable.f115698a.mo161186a();
        }
        mo161315a();
    }

    /* renamed from: a */
    private final boolean m181689a(Bundle bundle) {
        if (bundle != null) {
            try {
                if (bundle.get("android:support:fragments") != null) {
                    C45855f.m181664c("MmBaseActivity", "clearFragmentRestore fase");
                    bundle.putParcelable("android:support:fragments", null);
                    return false;
                }
            } catch (Exception e) {
                C45855f.m181666e("MmBaseActivity", "clearFragmentRestore exception");
                e.printStackTrace();
            }
        }
        C45855f.m181664c("MmBaseActivity", "clearFragmentRestore true");
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo161163a(View view) {
        int i;
        Intrinsics.checkParameterIsNotNull(view, "view");
        if (!C57764ab.m224186a((Activity) this) || Build.VERSION.SDK_INT < 26) {
            i = 0;
        } else {
            i = C57764ab.m224185a((Context) this);
        }
        view.setPadding(0, StatusBarUtil.getStatusBarHeight(this), 0, i);
    }
}
