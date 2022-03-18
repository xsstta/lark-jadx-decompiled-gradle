package com.google.android.material.p980a;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.Log;
import android.util.Property;
import androidx.collection.SimpleArrayMap;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.material.a.h */
public class C22123h {

    /* renamed from: a */
    private final SimpleArrayMap<String, C22124i> f53792a = new SimpleArrayMap<>();

    /* renamed from: b */
    private final SimpleArrayMap<String, PropertyValuesHolder[]> f53793b = new SimpleArrayMap<>();

    public int hashCode() {
        return this.f53792a.hashCode();
    }

    public String toString() {
        return '\n' + getClass().getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " timings: " + this.f53792a + "}\n";
    }

    /* renamed from: a */
    public long mo76288a() {
        int size = this.f53792a.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            C22124i valueAt = this.f53792a.valueAt(i);
            j = Math.max(j, valueAt.mo76299a() + valueAt.mo76301b());
        }
        return j;
    }

    /* renamed from: c */
    public boolean mo76294c(String str) {
        if (this.f53793b.get(str) != null) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public C22124i mo76293b(String str) {
        if (mo76292a(str)) {
            return this.f53792a.get(str);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: d */
    public PropertyValuesHolder[] mo76295d(String str) {
        if (mo76294c(str)) {
            return m79721a(this.f53793b.get(str));
        }
        throw new IllegalArgumentException();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C22123h)) {
            return false;
        }
        return this.f53792a.equals(((C22123h) obj).f53792a);
    }

    /* renamed from: a */
    private static C22123h m79719a(List<Animator> list) {
        C22123h hVar = new C22123h();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            m79720a(hVar, list.get(i));
        }
        return hVar;
    }

    /* renamed from: a */
    private PropertyValuesHolder[] m79721a(PropertyValuesHolder[] propertyValuesHolderArr) {
        PropertyValuesHolder[] propertyValuesHolderArr2 = new PropertyValuesHolder[propertyValuesHolderArr.length];
        for (int i = 0; i < propertyValuesHolderArr.length; i++) {
            propertyValuesHolderArr2[i] = propertyValuesHolderArr[i].clone();
        }
        return propertyValuesHolderArr2;
    }

    /* renamed from: a */
    public boolean mo76292a(String str) {
        if (this.f53792a.get(str) != null) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public void mo76290a(String str, C22124i iVar) {
        this.f53792a.put(str, iVar);
    }

    /* renamed from: a */
    public void mo76291a(String str, PropertyValuesHolder[] propertyValuesHolderArr) {
        this.f53793b.put(str, propertyValuesHolderArr);
    }

    /* renamed from: a */
    public static C22123h m79717a(Context context, int i) {
        try {
            Animator loadAnimator = AnimatorInflater.loadAnimator(context, i);
            if (loadAnimator instanceof AnimatorSet) {
                return m79719a(((AnimatorSet) loadAnimator).getChildAnimations());
            }
            if (loadAnimator == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(loadAnimator);
            return m79719a(arrayList);
        } catch (Exception e) {
            Log.w("MotionSpec", "Can't load animation resource ID #0x" + Integer.toHexString(i), e);
            return null;
        }
    }

    /* renamed from: a */
    private static void m79720a(C22123h hVar, Animator animator) {
        if (animator instanceof ObjectAnimator) {
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            hVar.mo76291a(objectAnimator.getPropertyName(), objectAnimator.getValues());
            hVar.mo76290a(objectAnimator.getPropertyName(), C22124i.m79730a((ValueAnimator) objectAnimator));
            return;
        }
        throw new IllegalArgumentException("Animator must be an ObjectAnimator: " + animator);
    }

    /* renamed from: a */
    public static C22123h m79718a(Context context, TypedArray typedArray, int i) {
        int resourceId;
        if (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) {
            return null;
        }
        return m79717a(context, resourceId);
    }

    /* renamed from: a */
    public <T> ObjectAnimator mo76289a(String str, T t, Property<T, ?> property) {
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(t, mo76295d(str));
        ofPropertyValuesHolder.setProperty(property);
        mo76293b(str).mo76300a((Animator) ofPropertyValuesHolder);
        return ofPropertyValuesHolder;
    }
}
