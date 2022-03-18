package com.google.android.material.datepicker;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.util.C0844e;
import java.util.Collection;

public interface DateSelector<S> extends Parcelable {
    /* renamed from: a */
    View mo77314a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle, CalendarConstraints calendarConstraints, AbstractC22260k<S> kVar);

    /* renamed from: a */
    S mo77315a();

    /* renamed from: a */
    String mo77316a(Context context);

    /* renamed from: a */
    void mo77317a(long j);

    /* renamed from: b */
    int mo77318b(Context context);

    /* renamed from: b */
    boolean mo77319b();

    /* renamed from: c */
    Collection<Long> mo77320c();

    /* renamed from: d */
    Collection<C0844e<Long, Long>> mo77321d();
}
