package com.google.android.material.internal;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.Checkable;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.core.view.C0859a;
import androidx.core.view.ViewCompat;
import androidx.core.view.p029a.C0864d;
import androidx.customview.view.AbsSavedState;
import com.larksuite.suite.R;

public class CheckableImageButton extends AppCompatImageButton implements Checkable {

    /* renamed from: a */
    private static final int[] f54629a = {16842912};

    /* renamed from: b */
    private boolean f54630b;

    /* renamed from: c */
    private boolean f54631c;

    /* renamed from: d */
    private boolean f54632d;

    /* renamed from: a */
    public boolean mo77690a() {
        return this.f54631c;
    }

    public boolean isChecked() {
        return this.f54630b;
    }

    public void toggle() {
        setChecked(!this.f54630b);
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f54634a = this.f54630b;
        return savedState;
    }

    /* access modifiers changed from: package-private */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() {
            /* class com.google.android.material.internal.CheckableImageButton.SavedState.C223211 */

            /* renamed from: a */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }

            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }
        };

        /* renamed from: a */
        boolean f54634a;

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        /* renamed from: a */
        private void m80819a(Parcel parcel) {
            boolean z = true;
            if (parcel.readInt() != 1) {
                z = false;
            }
            this.f54634a = z;
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            m80819a(parcel);
        }

        @Override // androidx.customview.view.AbsSavedState
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f54634a ? 1 : 0);
        }
    }

    public void setPressable(boolean z) {
        this.f54632d = z;
    }

    public CheckableImageButton(Context context) {
        this(context, null);
    }

    public void setPressed(boolean z) {
        if (this.f54632d) {
            super.setPressed(z);
        }
    }

    public void setCheckable(boolean z) {
        if (this.f54631c != z) {
            this.f54631c = z;
            sendAccessibilityEvent(0);
        }
    }

    public int[] onCreateDrawableState(int i) {
        if (!this.f54630b) {
            return super.onCreateDrawableState(i);
        }
        int[] iArr = f54629a;
        return mergeDrawableStates(super.onCreateDrawableState(i + iArr.length), iArr);
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.mo4902a());
        setChecked(savedState.f54634a);
    }

    public void setChecked(boolean z) {
        if (this.f54631c && this.f54630b != z) {
            this.f54630b = z;
            refreshDrawableState();
            sendAccessibilityEvent(2048);
        }
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.imageButtonStyle);
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f54631c = true;
        this.f54632d = true;
        ViewCompat.m4043a(this, new C0859a() {
            /* class com.google.android.material.internal.CheckableImageButton.C223201 */

            @Override // androidx.core.view.C0859a
            /* renamed from: d */
            public void mo4540d(View view, AccessibilityEvent accessibilityEvent) {
                super.mo4540d(view, accessibilityEvent);
                accessibilityEvent.setChecked(CheckableImageButton.this.isChecked());
            }

            @Override // androidx.core.view.C0859a
            /* renamed from: a */
            public void mo4535a(View view, C0864d dVar) {
                super.mo4535a(view, dVar);
                dVar.mo4560a(CheckableImageButton.this.mo77690a());
                dVar.mo4568b(CheckableImageButton.this.isChecked());
            }
        });
    }
}
