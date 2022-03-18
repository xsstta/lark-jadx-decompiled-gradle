package com.bytedance.ee.bear.facade.common.extension;

import android.view.MotionEvent;
import androidx.appcompat.app.AppCompatActivity;
import com.bytedance.ee.bear.facade.common.AbstractC7719m;
import com.bytedance.ee.bear.facade.common.AbstractC7720n;
import com.bytedance.ee.bear.facade.common.C7661a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.bytedance.ee.bear.facade.common.extension.g */
public class C7706g extends C7661a implements AbstractC7719m {

    /* renamed from: a */
    private boolean f20821a;

    /* renamed from: c */
    private List<AbstractC7720n> f20822c = new ArrayList();

    @Override // com.bytedance.ee.bear.facade.common.AbstractC7719m
    /* renamed from: b */
    public void mo30101b(AbstractC7720n nVar) {
        List<AbstractC7720n> list = this.f20822c;
        if (list != null) {
            list.remove(nVar);
        }
    }

    public C7706g(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
    }

    @Override // com.bytedance.ee.bear.facade.common.AbstractC7719m
    /* renamed from: a */
    public void mo30100a(AbstractC7720n nVar) {
        if (this.f20822c == null) {
            this.f20822c = new ArrayList();
        }
        if (!this.f20822c.contains(nVar)) {
            this.f20822c.add(nVar);
        }
    }

    @Override // com.bytedance.ee.bear.facade.common.C7661a
    /* renamed from: a */
    public boolean mo30106a(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f20821a = false;
            List<AbstractC7720n> list = this.f20822c;
            if (list != null) {
                Iterator<AbstractC7720n> it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (it.next().onTouchStartIntercept(motionEvent)) {
                            this.f20821a = true;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
        } else if (this.f20821a) {
            motionEvent.setAction(3);
        }
        return super.mo30106a(motionEvent);
    }
}
