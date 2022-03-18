package com.bytedance.ee.bear.document.orientation;

import androidx.lifecycle.C1177w;
import com.bytedance.ee.bear.browser.C4933k;
import com.bytedance.ee.bear.browser.plugin.AbstractC4958n;
import com.bytedance.ee.bear.browser.plugin.C4943e;
import com.bytedance.ee.bear.document.C6095s;
import com.bytedance.ee.bear.document.DocumentPlugin;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p709l.AbstractC13696d;
import com.bytedance.ee.util.p709l.C13703h;

public class SensorOrientationDetectorPlugin extends DocumentPlugin {
    private C1177w<AbstractC13696d> mOrientation;
    private C13703h sensorOrientationDetector;

    public C1177w<AbstractC13696d> getOrientation() {
        if (this.mOrientation == null) {
            this.mOrientation = new C1177w<>();
        }
        return this.mOrientation;
    }

    public /* synthetic */ void lambda$onAttachToHost$0$SensorOrientationDetectorPlugin(AbstractC13696d dVar) {
        C13479a.m54772d("SensorOrientationDetectorPlugin", "onChange, orientation: " + dVar);
        getOrientation().mo5929b(dVar);
    }

    public void onAttachToHost(C6095s sVar) {
        super.onAttachToHost((C4943e) sVar);
        this.sensorOrientationDetector = new C13703h(getContext(), new C13703h.AbstractC13704a() {
            /* class com.bytedance.ee.bear.document.orientation.$$Lambda$SensorOrientationDetectorPlugin$Gb6m68b8FzoKEGAyMQAnrNGHhig */

            @Override // com.bytedance.ee.util.p709l.C13703h.AbstractC13704a
            public final void onOrientationChanged(AbstractC13696d dVar) {
                SensorOrientationDetectorPlugin.this.lambda$onAttachToHost$0$SensorOrientationDetectorPlugin(dVar);
            }
        });
    }

    public void onDetachFromUIContainer(C6095s sVar, AbstractC4958n nVar) {
        super.onDetachFromUIContainer((C4933k) sVar, nVar);
        this.sensorOrientationDetector.disable();
    }

    public void onAttachToUIContainer(C6095s sVar, AbstractC4958n nVar) {
        super.onAttachToUIContainer((C4943e) sVar, nVar);
        boolean canDetectOrientation = this.sensorOrientationDetector.canDetectOrientation();
        C13479a.m54764b("SensorOrientationDetectorPlugin", "canDetect: " + canDetectOrientation);
        if (canDetectOrientation) {
            this.sensorOrientationDetector.enable();
        }
    }
}
