package com.google.android.material.internal;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.view.menu.AbstractC0339m;
import androidx.appcompat.view.menu.C0322f;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class NavigationMenuView extends RecyclerView implements AbstractC0339m {
    @Override // androidx.appcompat.view.menu.AbstractC0339m
    /* renamed from: a */
    public void mo1265a(C0322f fVar) {
    }

    public int getWindowAnimations() {
        return 0;
    }

    public NavigationMenuView(Context context) {
        this(context, null);
    }

    public NavigationMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NavigationMenuView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setLayoutManager(new LinearLayoutManager(context, 1, false));
    }
}
