package com.ss.android.appcenter.business.activity.appsort;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.ss.android.appcenter.common.util.C28182f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TouchDetectFrameLayout extends FrameLayout {

    /* renamed from: a */
    private List<AbstractC27681b> f69158a = new ArrayList();

    /* renamed from: b */
    private AbstractC27680a f69159b;

    /* renamed from: com.ss.android.appcenter.business.activity.appsort.TouchDetectFrameLayout$a */
    public interface AbstractC27680a {
        /* renamed from: a */
        void mo98630a(MotionEvent motionEvent);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.appcenter.business.activity.appsort.TouchDetectFrameLayout$b */
    public interface AbstractC27681b {
        /* renamed from: a */
        void mo98625a();
    }

    /* renamed from: a */
    public boolean mo98627a() {
        return C28182f.m103238c(this.f69158a);
    }

    public void setOnAnyTouchEventListener(AbstractC27680a aVar) {
        this.f69159b = aVar;
    }

    /* renamed from: a */
    private void m101175a(MotionEvent motionEvent) {
        AbstractC27680a aVar = this.f69159b;
        if (aVar != null) {
            aVar.mo98630a(motionEvent);
        }
    }

    public TouchDetectFrameLayout(Context context) {
        super(context);
    }

    /* renamed from: a */
    public void mo98626a(AbstractC27681b bVar) {
        this.f69158a.add(bVar);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && !this.f69158a.isEmpty()) {
            Iterator<AbstractC27681b> it = this.f69158a.iterator();
            while (it.hasNext()) {
                it.next().mo98625a();
                it.remove();
            }
        }
        m101175a(motionEvent);
        return super.dispatchTouchEvent(motionEvent);
    }

    public TouchDetectFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public TouchDetectFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
