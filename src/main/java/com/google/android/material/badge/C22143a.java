package com.google.android.material.badge;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.internal.ParcelableSparseArray;

/* renamed from: com.google.android.material.badge.a */
public class C22143a {

    /* renamed from: a */
    public static final boolean f53895a;

    static {
        boolean z;
        if (Build.VERSION.SDK_INT < 18) {
            z = true;
        } else {
            z = false;
        }
        f53895a = z;
    }

    /* renamed from: a */
    public static ParcelableSparseArray m79827a(SparseArray<BadgeDrawable> sparseArray) {
        ParcelableSparseArray parcelableSparseArray = new ParcelableSparseArray();
        for (int i = 0; i < sparseArray.size(); i++) {
            int keyAt = sparseArray.keyAt(i);
            BadgeDrawable valueAt = sparseArray.valueAt(i);
            if (valueAt != null) {
                parcelableSparseArray.put(keyAt, valueAt.mo76486a());
            } else {
                throw new IllegalArgumentException("badgeDrawable cannot be null");
            }
        }
        return parcelableSparseArray;
    }

    /* renamed from: a */
    public static SparseArray<BadgeDrawable> m79826a(Context context, ParcelableSparseArray parcelableSparseArray) {
        SparseArray<BadgeDrawable> sparseArray = new SparseArray<>(parcelableSparseArray.size());
        for (int i = 0; i < parcelableSparseArray.size(); i++) {
            int keyAt = parcelableSparseArray.keyAt(i);
            BadgeDrawable.SavedState savedState = (BadgeDrawable.SavedState) parcelableSparseArray.valueAt(i);
            if (savedState != null) {
                sparseArray.put(keyAt, BadgeDrawable.m79800a(context, savedState));
            } else {
                throw new IllegalArgumentException("BadgeDrawable's savedState cannot be null");
            }
        }
        return sparseArray;
    }

    /* renamed from: a */
    public static void m79829a(BadgeDrawable badgeDrawable, View view, FrameLayout frameLayout) {
        m79831c(badgeDrawable, view, frameLayout);
        if (f53895a) {
            frameLayout.setForeground(badgeDrawable);
        } else {
            view.getOverlay().add(badgeDrawable);
        }
    }

    /* renamed from: b */
    public static void m79830b(BadgeDrawable badgeDrawable, View view, FrameLayout frameLayout) {
        if (badgeDrawable != null) {
            if (f53895a) {
                frameLayout.setForeground(null);
            } else {
                view.getOverlay().remove(badgeDrawable);
            }
        }
    }

    /* renamed from: c */
    public static void m79831c(BadgeDrawable badgeDrawable, View view, FrameLayout frameLayout) {
        FrameLayout frameLayout2;
        Rect rect = new Rect();
        if (f53895a) {
            frameLayout2 = frameLayout;
        } else {
            frameLayout2 = view;
        }
        frameLayout2.getDrawingRect(rect);
        badgeDrawable.setBounds(rect);
        badgeDrawable.mo76488a(view, frameLayout);
    }

    /* renamed from: a */
    public static void m79828a(Rect rect, float f, float f2, float f3, float f4) {
        rect.set((int) (f - f3), (int) (f2 - f4), (int) (f + f3), (int) (f2 + f4));
    }
}
