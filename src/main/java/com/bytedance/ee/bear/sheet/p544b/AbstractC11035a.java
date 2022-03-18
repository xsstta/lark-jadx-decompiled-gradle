package com.bytedance.ee.bear.sheet.p544b;

import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.AbstractC1178x;
import com.bytedance.ee.bear.document.C6095s;
import com.bytedance.ee.bear.document.onboarding.AbstractC6041b;
import com.bytedance.ee.bear.document.orientation.SensorOrientationDetectorPlugin;
import com.bytedance.ee.bear.onboarding.export.p516a.AbstractC10387a;
import com.bytedance.ee.bear.sheet.orientation.SheetUnspecifiedOrientationPlugin;
import com.bytedance.ee.util.p709l.AbstractC13696d;

/* renamed from: com.bytedance.ee.bear.sheet.b.a */
public abstract class AbstractC11035a extends AbstractC6041b implements AbstractC10387a {

    /* renamed from: a */
    private boolean f29701a;

    @Override // com.bytedance.ee.bear.onboarding.export.p516a.AbstractC10397d
    /* renamed from: a */
    public String mo21350a() {
        return "sheet";
    }

    @Override // com.bytedance.ee.bear.document.onboarding.AbstractC6041b, com.bytedance.ee.bear.onboarding.export.p516a.AbstractC10397d
    /* renamed from: c */
    public String mo21356c() {
        return null;
    }

    @Override // com.bytedance.ee.bear.onboarding.export.p516a.AbstractC10387a
    /* renamed from: d */
    public String mo39548d() {
        if (mo24401e() != null) {
            return mo24401e().nextID;
        }
        return null;
    }

    /* renamed from: f */
    public boolean mo42113f() {
        boolean z;
        C6095s M_ = M_();
        SheetUnspecifiedOrientationPlugin sheetUnspecifiedOrientationPlugin = (SheetUnspecifiedOrientationPlugin) M_.mo19540a(SheetUnspecifiedOrientationPlugin.class);
        SensorOrientationDetectorPlugin sensorOrientationDetectorPlugin = (SensorOrientationDetectorPlugin) M_.mo19540a(SensorOrientationDetectorPlugin.class);
        if (!(sheetUnspecifiedOrientationPlugin == null || sensorOrientationDetectorPlugin == null)) {
            sensorOrientationDetectorPlugin.getOrientation().mo5923a(M_().mo19566h(), new AbstractC1178x() {
                /* class com.bytedance.ee.bear.sheet.p544b.$$Lambda$a$9C8mpOas7yw8bFy2QTXEqIdk0_0 */

                @Override // androidx.lifecycle.AbstractC1178x
                public final void onChanged(Object obj) {
                    AbstractC11035a.lambda$9C8mpOas7yw8bFy2QTXEqIdk0_0(AbstractC11035a.this, (AbstractC13696d) obj);
                }
            });
        }
        FragmentActivity f = M_().mo19564f();
        if (f == null || f.getResources().getConfiguration().orientation != 2) {
            z = false;
        } else {
            z = true;
        }
        if (z || this.f29701a) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m45942a(AbstractC13696d dVar) {
        if (dVar == null) {
            return;
        }
        if (dVar.mo50654c()) {
            this.f29701a = true;
        } else {
            this.f29701a = false;
        }
    }
}
