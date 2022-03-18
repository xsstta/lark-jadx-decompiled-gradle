package com.ss.android.lark.create.groupchat.impl.util;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u0016\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0007J\u0006\u0010\u0011\u001a\u00020\fJ\u0016\u0010\u0012\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0007J\u000e\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0004R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/ss/android/lark/create/groupchat/impl/util/FragmentStateHelper;", "", "()V", "mFragmentManager", "Landroidx/fragment/app/FragmentManager;", "mFragmentSavedStates", "", "", "Landroidx/fragment/app/Fragment$SavedState;", "restoreHelperState", "", "savedState", "Landroid/os/Bundle;", "restoreState", "fragment", "Landroidx/fragment/app/Fragment;", "key", "saveHelperState", "saveState", "setFragmentManager", "fragmentManager", "im_create-group-chat_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.create.groupchat.impl.b.c */
public final class FragmentStateHelper {

    /* renamed from: a */
    private FragmentManager f93568a;

    /* renamed from: b */
    private final Map<Integer, Fragment.SavedState> f93569b = new LinkedHashMap();

    /* renamed from: a */
    public final Bundle mo133832a() {
        Bundle bundle = new Bundle();
        for (Map.Entry<Integer, Fragment.SavedState> entry : this.f93569b.entrySet()) {
            bundle.putParcelable(String.valueOf(entry.getKey().intValue()), entry.getValue());
        }
        return bundle;
    }

    /* renamed from: a */
    public final void mo133835a(FragmentManager fragmentManager) {
        Intrinsics.checkParameterIsNotNull(fragmentManager, "fragmentManager");
        this.f93568a = fragmentManager;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.Map<java.lang.Integer, androidx.fragment.app.Fragment$SavedState> */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public final void mo133833a(Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(bundle, "savedState");
        this.f93569b.clear();
        bundle.setClassLoader(getClass().getClassLoader());
        Set<String> keySet = bundle.keySet();
        Intrinsics.checkExpressionValueIsNotNull(keySet, "savedState.keySet()");
        for (T t : keySet) {
            Map<Integer, Fragment.SavedState> map = this.f93569b;
            Intrinsics.checkExpressionValueIsNotNull(t, "key");
            map.put(Integer.valueOf(Integer.parseInt(t)), bundle.getParcelable(t));
        }
    }

    /* renamed from: a */
    public final void mo133834a(Fragment fragment, int i) {
        Intrinsics.checkParameterIsNotNull(fragment, "fragment");
        Fragment.SavedState savedState = this.f93569b.get(Integer.valueOf(i));
        if (savedState != null && !fragment.isAdded()) {
            fragment.setInitialSavedState(savedState);
        }
    }

    /* renamed from: b */
    public final void mo133836b(Fragment fragment, int i) {
        Intrinsics.checkParameterIsNotNull(fragment, "fragment");
        FragmentManager fragmentManager = this.f93568a;
        if (fragmentManager != null && fragment.isAdded()) {
            this.f93569b.put(Integer.valueOf(i), fragmentManager.saveFragmentInstanceState(fragment));
        }
    }
}
