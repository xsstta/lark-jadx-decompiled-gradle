package com.ss.android.lark.profile.func.v3.userprofile.di;

import androidx.lifecycle.AbstractC1142af;
import androidx.lifecycle.C1144ai;
import java.util.Iterator;
import java.util.Map;
import javax.inject.Inject;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B.\b\u0007\u0012%\u0010\u0002\u001a!\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00050\u0006¢\u0006\u0002\b\u00070\u0003¢\u0006\u0002\u0010\bJ%\u0010\t\u001a\u0002H\n\"\b\b\u0000\u0010\n*\u00020\u00052\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\n0\u0004H\u0016¢\u0006\u0002\u0010\fR-\u0010\u0002\u001a!\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00050\u0006¢\u0006\u0002\b\u00070\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/profile/func/v3/userprofile/di/ViewModelFactory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "creators", "", "Ljava/lang/Class;", "Landroidx/lifecycle/ViewModel;", "Ljavax/inject/Provider;", "Lkotlin/jvm/JvmSuppressWildcards;", "(Ljava/util/Map;)V", "create", "T", "modelClass", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.profile.func.v3.userprofile.di.e */
public final class ViewModelFactory implements C1144ai.AbstractC1146b {

    /* renamed from: a */
    private final Map<Class<? extends AbstractC1142af>, Provider<AbstractC1142af>> f130465a;

    @Inject
    public ViewModelFactory(Map<Class<? extends AbstractC1142af>, Provider<AbstractC1142af>> map) {
        Intrinsics.checkParameterIsNotNull(map, "creators");
        this.f130465a = map;
    }

    @Override // androidx.lifecycle.C1144ai.AbstractC1146b
    public <T extends AbstractC1142af> T create(Class<T> cls) {
        T t;
        Intrinsics.checkParameterIsNotNull(cls, "modelClass");
        Provider<AbstractC1142af> provider = this.f130465a.get(cls);
        if (provider == null) {
            Iterator<T> it = this.f130465a.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    t = null;
                    break;
                }
                t = it.next();
                if (cls.isAssignableFrom((Class) t.getKey())) {
                    break;
                }
            }
            T t2 = t;
            if (t2 != null) {
                provider = (Provider) t2.getValue();
            } else {
                provider = null;
            }
        }
        if (provider != null) {
            try {
                AbstractC1142af b = provider.mo47880b();
                if (b != null) {
                    return (T) b;
                }
                throw new TypeCastException("null cannot be cast to non-null type T");
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        } else {
            throw new IllegalArgumentException("unknown model class " + cls);
        }
    }
}
