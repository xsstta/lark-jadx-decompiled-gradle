package com.google.android.material.bottomnavigation;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.view.menu.AbstractC0337l;
import androidx.appcompat.view.menu.C0322f;
import androidx.appcompat.view.menu.C0326h;
import androidx.appcompat.view.menu.SubMenuC0346q;
import com.google.android.material.badge.C22143a;
import com.google.android.material.internal.ParcelableSparseArray;

public class BottomNavigationPresenter implements AbstractC0337l {

    /* renamed from: a */
    private C0322f f54009a;

    /* renamed from: b */
    private BottomNavigationMenuView f54010b;

    /* renamed from: c */
    private boolean f54011c;

    /* renamed from: d */
    private int f54012d;

    @Override // androidx.appcompat.view.menu.AbstractC0337l
    /* renamed from: a */
    public void mo1241a(C0322f fVar, boolean z) {
    }

    @Override // androidx.appcompat.view.menu.AbstractC0337l
    /* renamed from: a */
    public void mo1242a(AbstractC0337l.AbstractC0338a aVar) {
    }

    @Override // androidx.appcompat.view.menu.AbstractC0337l
    /* renamed from: a */
    public boolean mo1350a(C0322f fVar, C0326h hVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0337l
    /* renamed from: a */
    public boolean mo1244a(SubMenuC0346q qVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0337l
    /* renamed from: b */
    public boolean mo1247b() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0337l
    /* renamed from: b */
    public boolean mo1352b(C0322f fVar, C0326h hVar) {
        return false;
    }

    /* access modifiers changed from: package-private */
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() {
            /* class com.google.android.material.bottomnavigation.BottomNavigationPresenter.SavedState.C221641 */

            /* renamed from: a */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }

            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }
        };

        /* renamed from: a */
        int f54013a;

        /* renamed from: b */
        ParcelableSparseArray f54014b;

        public int describeContents() {
            return 0;
        }

        SavedState() {
        }

        SavedState(Parcel parcel) {
            this.f54013a = parcel.readInt();
            this.f54014b = (ParcelableSparseArray) parcel.readParcelable(getClass().getClassLoader());
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f54013a);
            parcel.writeParcelable(this.f54014b, 0);
        }
    }

    @Override // androidx.appcompat.view.menu.AbstractC0337l
    /* renamed from: c */
    public int mo1353c() {
        return this.f54012d;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0337l
    public Parcelable c_() {
        SavedState savedState = new SavedState();
        savedState.f54013a = this.f54010b.getSelectedItemId();
        savedState.f54014b = C22143a.m79827a(this.f54010b.getBadgeDrawables());
        return savedState;
    }

    /* renamed from: a */
    public void mo76651a(int i) {
        this.f54012d = i;
    }

    /* renamed from: b */
    public void mo76653b(boolean z) {
        this.f54011c = z;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0337l
    /* renamed from: a */
    public void mo1237a(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            this.f54010b.mo76623b(savedState.f54013a);
            this.f54010b.setBadgeDrawables(C22143a.m79826a(this.f54010b.getContext(), savedState.f54014b));
        }
    }

    /* renamed from: a */
    public void mo76652a(BottomNavigationMenuView bottomNavigationMenuView) {
        this.f54010b = bottomNavigationMenuView;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0337l
    /* renamed from: a */
    public void mo1243a(boolean z) {
        if (!this.f54011c) {
            if (z) {
                this.f54010b.mo76622b();
            } else {
                this.f54010b.mo76624c();
            }
        }
    }

    @Override // androidx.appcompat.view.menu.AbstractC0337l
    /* renamed from: a */
    public void mo1345a(Context context, C0322f fVar) {
        this.f54009a = fVar;
        this.f54010b.mo1265a(fVar);
    }
}
