package com.ss.android.lark.widget.recyclerview.hive;

import android.content.MutableContextWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.lark.p1786d.AbstractC36435f;
import com.ss.android.lark.widget.recyclerview.hive.AbstractC59010e;
import java.lang.reflect.Constructor;
import java.lang.reflect.ParameterizedType;

/* renamed from: com.ss.android.lark.widget.recyclerview.hive.b */
public abstract class AbstractC59004b<Value, VH extends AbstractC59010e> {

    /* renamed from: a */
    private Class<?> f146198a;

    /* renamed from: b */
    private Constructor<VH> f146199b;

    /* renamed from: f */
    protected AbstractC59012g<Value> f146200f;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo122700a(VH vh) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo122649a(VH vh, Value value);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo191549b(VH vh) {
    }

    /* renamed from: c */
    public abstract int mo122651c();

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo200135c(VH vh) {
    }

    public int ao_() {
        return getClass().hashCode();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final Class<?> mo200136g() {
        if (this.f146198a == null) {
            this.f146198a = mo122646a();
        }
        return this.f146198a;
    }

    /* renamed from: d */
    private final Constructor<VH> mo122719d() throws NoSuchMethodException {
        if (this.f146199b == null) {
            Constructor<VH> declaredConstructor = mo122650b().getDeclaredConstructor(new Class[0]);
            this.f146199b = declaredConstructor;
            declaredConstructor.setAccessible(true);
        }
        return this.f146199b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Class<?> mo122646a() {
        return (Class) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public Class<VH> mo122650b() {
        return (Class) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[1];
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public VH mo200137h() {
        try {
            return mo122719d().newInstance(new Object[0]);
        } catch (Exception e) {
            e.printStackTrace();
            throw new IllegalStateException(e.getMessage());
        }
    }

    /* renamed from: a */
    public AbstractC59004b mo200134a(AbstractC59012g<Value> gVar) {
        this.f146200f = gVar;
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public View mo122823a(ViewGroup viewGroup) {
        if (mo122651c() <= 0) {
            return null;
        }
        if (viewGroup.getContext() instanceof AbstractC36435f) {
            return ((AbstractC36435f) viewGroup.getContext()).mo129674a().mo134294a(viewGroup.getContext(), mo122651c(), viewGroup, true);
        }
        if (!(viewGroup.getContext() instanceof MutableContextWrapper) || !(((MutableContextWrapper) viewGroup.getContext()).getBaseContext() instanceof AbstractC36435f)) {
            return LayoutInflater.from(viewGroup.getContext()).inflate(mo122651c(), viewGroup, false);
        }
        return ((AbstractC36435f) ((MutableContextWrapper) viewGroup.getContext()).getBaseContext()).mo129674a().mo134294a(viewGroup.getContext(), mo122651c(), viewGroup, true);
    }

    /* renamed from: b */
    public boolean mo122755b(VH vh, Value value) {
        AbstractC59012g<Value> gVar = this.f146200f;
        if (gVar != null) {
            return gVar.mo122581d(this, vh, value);
        }
        return false;
    }

    /* renamed from: c */
    public void mo122683c(VH vh, Value value) {
        AbstractC59012g<Value> gVar = this.f146200f;
        if (gVar != null) {
            gVar.mo123401e(this, vh, value);
        }
    }
}
