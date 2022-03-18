package com.bytedance.ee.bear.bitable.card.view.cell.select;

import android.view.View;
import com.bytedance.ee.bear.widgets.FlowLayout;
import com.bytedance.ee.log.C13479a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.ee.bear.bitable.card.view.cell.select.f */
public abstract class AbstractC4652f<T> {

    /* renamed from: a */
    private List<T> f13747a;

    /* renamed from: b */
    private AbstractC4653a f13748b;

    /* renamed from: c */
    private List<Integer> f13749c = new ArrayList();

    /* renamed from: com.bytedance.ee.bear.bitable.card.view.cell.select.f$a */
    public interface AbstractC4653a {
    }

    /* renamed from: a */
    public abstract View mo18222a(FlowLayout flowLayout, int i, T t);

    /* renamed from: a */
    public boolean mo18290a(int i, T t) {
        return false;
    }

    /* renamed from: a */
    public List<Integer> mo18287a() {
        return this.f13749c;
    }

    /* renamed from: b */
    public int mo18291b() {
        List<T> list = this.f13747a;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    /* renamed from: a */
    public T mo18286a(int i) {
        return this.f13747a.get(i);
    }

    public AbstractC4652f(List<T> list) {
        this.f13747a = list;
    }

    /* renamed from: a */
    public void mo18289a(AbstractC4653a aVar) {
        this.f13748b = aVar;
    }

    /* renamed from: a */
    public void mo18288a(int i, View view) {
        C13479a.m54772d("zzh", "onSelected " + i);
    }

    /* renamed from: b */
    public void mo18292b(int i, View view) {
        C13479a.m54772d("zzh", "unSelected " + i);
    }
}
