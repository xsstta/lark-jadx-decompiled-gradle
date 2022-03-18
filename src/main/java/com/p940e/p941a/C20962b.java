package com.p940e.p941a;

import android.content.Context;
import com.bytedance.apm.AbstractC2913d;
import com.bytedance.services.apm.api.C20703h;

/* renamed from: com.e.a.b */
public class C20962b extends AbstractC2913d {
    @Override // com.bytedance.services.apm.api.AbstractC20702g, com.bytedance.apm.AbstractC2913d
    public boolean isOnlyMainProcess() {
        return false;
    }

    @Override // com.bytedance.services.apm.api.AbstractC20702g
    public void notifyParams(C20703h hVar) {
    }

    @Override // com.bytedance.apm.AbstractC2913d
    public void destroy() {
        super.destroy();
    }

    @Override // com.bytedance.services.apm.api.AbstractC20702g, com.bytedance.apm.AbstractC2913d
    public void start() {
        super.start();
    }

    @Override // com.bytedance.apm.AbstractC2913d
    public void stop() {
        super.stop();
    }

    @Override // com.bytedance.apm.AbstractC2913d
    public String getTag() {
        return C20962b.class.getSimpleName();
    }

    @Override // com.bytedance.services.apm.api.AbstractC20702g, com.bytedance.apm.AbstractC2913d
    public void init(Context context) {
        super.init(context);
    }
}
