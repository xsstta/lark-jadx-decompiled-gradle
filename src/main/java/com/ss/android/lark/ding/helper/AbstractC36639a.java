package com.ss.android.lark.ding.helper;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.WindowManager;
import com.larksuite.framework.utils.DeviceUtils;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.ding.helper.AbstractC36654g;
import com.ss.android.lark.log.Log;
import com.ss.ttm.player.MediaPlayer;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.ss.android.lark.ding.helper.a */
public abstract class AbstractC36639a implements AbstractC36654g {

    /* renamed from: a */
    Context f94246a;

    /* renamed from: b */
    View f94247b;

    /* renamed from: c */
    AbstractC36654g.AbstractC36655a f94248c;

    /* renamed from: d */
    private WindowManager f94249d;

    /* renamed from: e */
    private WindowManager.LayoutParams f94250e;

    /* renamed from: f */
    private AtomicBoolean f94251f = new AtomicBoolean(false);

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract WindowManager.LayoutParams mo135194a(WindowManager.LayoutParams layoutParams);

    @Override // com.ss.android.lark.ding.helper.AbstractC36654g
    /* renamed from: a */
    public void mo135196a(Activity activity) {
    }

    @Override // com.ss.android.lark.ding.helper.AbstractC36654g
    /* renamed from: c */
    public int mo135200c() {
        return 0;
    }

    @Override // com.ss.android.lark.ding.helper.AbstractC36654g
    /* renamed from: b */
    public int mo135199b() {
        return UIUtils.dp2px(this.f94246a, 12.0f);
    }

    @Override // com.ss.android.lark.ding.helper.AbstractC36654g
    /* renamed from: a */
    public void mo135195a() {
        Log.m165389i("FloatDialogBaseWindowPlan", "dismissDialog");
        if (this.f94249d != null && this.f94247b != null) {
            try {
                if (this.f94251f.get()) {
                    this.f94249d.removeViewImmediate(this.f94247b);
                    this.f94251f.set(false);
                }
            } catch (IllegalArgumentException e) {
                e.printStackTrace();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    @Override // com.ss.android.lark.ding.helper.AbstractC36654g
    /* renamed from: a */
    public void mo135197a(View view) {
        this.f94247b = view;
    }

    @Override // com.ss.android.lark.ding.helper.AbstractC36654g
    /* renamed from: a */
    public void mo135198a(boolean z) {
        Log.m165389i("FloatDialogBaseWindowPlan", "showFloatDialog isAppForeground > " + z);
        if (z) {
            if (this.f94249d == null) {
                this.f94249d = (WindowManager) this.f94246a.getSystemService("window");
            }
            if (this.f94250e == null) {
                WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
                this.f94250e = layoutParams;
                WindowManager.LayoutParams a = mo135194a(layoutParams);
                this.f94250e = a;
                a.format = 1;
                this.f94250e.windowAnimations = R.style.AnimBottomInFadeOut;
                this.f94250e.flags = 8;
                this.f94250e.flags |= 262144;
                this.f94250e.flags |= MediaPlayer.MEDIA_PLAYER_OPTION_APPID;
                this.f94250e.alpha = 1.0f;
                this.f94250e.gravity = 49;
                this.f94250e.x = 0;
                this.f94250e.y = 0;
                this.f94250e.width = DeviceUtils.getScreenWidth(this.f94246a) - UIUtils.dp2px(this.f94246a, 24.0f);
                this.f94250e.height = -2;
            }
            try {
                if (!this.f94251f.get()) {
                    Log.m165389i("FloatDialogBaseWindowPlan", "mWindowManager.addView");
                    this.f94249d.addView(this.f94247b, this.f94250e);
                    this.f94251f.set(true);
                }
            } catch (Exception e) {
                Log.m165397w("FloatDialogBaseWindowPlan", "onPlanShowFail");
                Log.m165382e(e.getMessage());
                AbstractC36654g.AbstractC36655a aVar = this.f94248c;
                if (aVar != null) {
                    aVar.mo135232a();
                }
            }
        }
    }

    public AbstractC36639a(Context context, AbstractC36654g.AbstractC36655a aVar) {
        this.f94246a = context;
        this.f94248c = aVar;
    }
}
