package com.google.android.flexbox;

import android.view.View;
import java.util.List;

/* renamed from: com.google.android.flexbox.a */
interface AbstractC21535a {
    /* renamed from: a */
    int mo72806a(int i, int i2, int i3);

    /* renamed from: a */
    int mo72807a(View view);

    /* renamed from: a */
    int mo72808a(View view, int i, int i2);

    /* renamed from: a */
    View mo72809a(int i);

    /* renamed from: a */
    void mo72811a(int i, View view);

    /* renamed from: a */
    void mo72812a(View view, int i, int i2, C21536b bVar);

    /* renamed from: a */
    void mo72813a(C21536b bVar);

    /* renamed from: a */
    boolean mo72814a();

    /* renamed from: b */
    int mo72816b(int i, int i2, int i3);

    /* renamed from: b */
    View mo72817b(int i);

    int getAlignContent();

    int getAlignItems();

    int getFlexDirection();

    int getFlexItemCount();

    List<C21536b> getFlexLinesInternal();

    int getFlexWrap();

    int getLargestMainSize();

    int getMaxLine();

    int getPaddingBottom();

    int getPaddingEnd();

    int getPaddingLeft();

    int getPaddingRight();

    int getPaddingStart();

    int getPaddingTop();

    int getSumOfCrossSize();

    void setFlexLines(List<C21536b> list);
}
