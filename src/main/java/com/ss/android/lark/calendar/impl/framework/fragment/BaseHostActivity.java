package com.ss.android.lark.calendar.impl.framework.fragment;

import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentManager;
import com.ss.android.lark.calendar.impl.framework.components.CalendarBaseActivity;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\f\u001a\u00020\rH\u0016J\u0012\u0010\u000e\u001a\u00020\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0014J\b\u0010\u0011\u001a\u00020\u0012H\u0014R\u0014\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\tX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0013"}, d2 = {"Lcom/ss/android/lark/calendar/impl/framework/fragment/BaseHostActivity;", "Lcom/ss/android/lark/calendar/impl/framework/components/CalendarBaseActivity;", "Lcom/ss/android/lark/calendar/impl/framework/fragment/FragmentStackHost;", "()V", "fragmentStack", "Lcom/ss/android/lark/calendar/impl/framework/fragment/FragmentStackImpl;", "getFragmentStack", "()Lcom/ss/android/lark/calendar/impl/framework/fragment/FragmentStackImpl;", "hostId", "", "getHostId", "()I", "onBackPressed", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
public abstract class BaseHostActivity extends CalendarBaseActivity implements FragmentStackHost {

    /* renamed from: a */
    private final int f83312a;

    /* renamed from: b */
    private final FragmentStackImpl f83313b;

    /* renamed from: c */
    private HashMap f83314c;

    @Override // com.ss.android.lark.calendar.impl.framework.components.CalendarBaseActivity
    /* renamed from: a */
    public View mo108509a(int i) {
        if (this.f83314c == null) {
            this.f83314c = new HashMap();
        }
        View view = (View) this.f83314c.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f83314c.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: d */
    public FragmentStackImpl mo118659e() {
        return this.f83313b;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.framework.fragment.BaseHostActivity$a */
    static final class C32494a extends Lambda implements Function0<Boolean> {
        final /* synthetic */ BaseHostActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32494a(BaseHostActivity baseHostActivity) {
            super(0);
            this.this$0 = baseHostActivity;
        }

        /* Return type fixed from 'boolean' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            this.this$0.finish();
            return true;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public View mo118660f() {
        FrameLayout frameLayout = new FrameLayout(this);
        frameLayout.setId(this.f83312a);
        return frameLayout;
    }

    @Override // androidx.activity.ComponentActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onBackPressed() {
        if (!mo118659e().mo109350b()) {
            super.onBackPressed();
        }
    }

    public BaseHostActivity() {
        int generateViewId = View.generateViewId();
        this.f83312a = generateViewId;
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        Intrinsics.checkExpressionValueIsNotNull(supportFragmentManager, "supportFragmentManager");
        this.f83313b = new FragmentStackImpl(generateViewId, supportFragmentManager, new C32494a(this));
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(mo118660f());
    }
}
