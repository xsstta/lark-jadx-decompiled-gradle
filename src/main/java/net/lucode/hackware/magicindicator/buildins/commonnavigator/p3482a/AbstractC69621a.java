package net.lucode.hackware.magicindicator.buildins.commonnavigator.p3482a;

import android.content.Context;
import android.database.DataSetObservable;
import android.database.DataSetObserver;

/* renamed from: net.lucode.hackware.magicindicator.buildins.commonnavigator.a.a */
public abstract class AbstractC69621a {

    /* renamed from: a */
    private final DataSetObservable f174049a = new DataSetObservable();

    /* renamed from: a */
    public abstract int mo16055a();

    /* renamed from: a */
    public abstract AbstractC69623c mo16056a(Context context);

    /* renamed from: a */
    public abstract AbstractC69624d mo16057a(Context context, int i);

    /* renamed from: b */
    public float mo243217b(Context context, int i) {
        return 1.0f;
    }

    /* renamed from: b */
    public final void mo243218b() {
        this.f174049a.notifyChanged();
    }

    /* renamed from: b */
    public final void mo243219b(DataSetObserver dataSetObserver) {
        this.f174049a.unregisterObserver(dataSetObserver);
    }

    /* renamed from: a */
    public final void mo243216a(DataSetObserver dataSetObserver) {
        this.f174049a.registerObserver(dataSetObserver);
    }
}
