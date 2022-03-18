package androidx.fragment.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TabHost;
import java.util.ArrayList;

public class FragmentTabHost extends TabHost implements TabHost.OnTabChangeListener {

    /* renamed from: a */
    private final ArrayList<C1018a> f3884a = new ArrayList<>();

    /* renamed from: b */
    private Context f3885b;

    /* renamed from: c */
    private FragmentManager f3886c;

    /* renamed from: d */
    private int f3887d;

    /* renamed from: e */
    private TabHost.OnTabChangeListener f3888e;

    /* renamed from: f */
    private C1018a f3889f;

    /* renamed from: g */
    private boolean f3890g;

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.FragmentTabHost$a */
    public static final class C1018a {

        /* renamed from: a */
        final String f3892a;

        /* renamed from: b */
        final Class<?> f3893b;

        /* renamed from: c */
        final Bundle f3894c;

        /* renamed from: d */
        Fragment f3895d;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f3890g = false;
    }

    public void setup() {
        throw new IllegalStateException("Must call setup() that takes a Context and FragmentManager");
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f3891a = getCurrentTabTag();
        return savedState;
    }

    /* access modifiers changed from: package-private */
    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() {
            /* class androidx.fragment.app.FragmentTabHost.SavedState.C10171 */

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
        String f3891a;

        public String toString() {
            return "FragmentTabHost.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " curTab=" + this.f3891a + "}";
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        SavedState(Parcel parcel) {
            super(parcel);
            this.f3891a = parcel.readString();
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.f3891a);
        }
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String currentTabTag = getCurrentTabTag();
        int size = this.f3884a.size();
        FragmentTransaction fragmentTransaction = null;
        for (int i = 0; i < size; i++) {
            C1018a aVar = this.f3884a.get(i);
            aVar.f3895d = this.f3886c.findFragmentByTag(aVar.f3892a);
            if (aVar.f3895d != null && !aVar.f3895d.isDetached()) {
                if (aVar.f3892a.equals(currentTabTag)) {
                    this.f3889f = aVar;
                } else {
                    if (fragmentTransaction == null) {
                        fragmentTransaction = this.f3886c.beginTransaction();
                    }
                    fragmentTransaction.detach(aVar.f3895d);
                }
            }
        }
        this.f3890g = true;
        FragmentTransaction a = m4953a(currentTabTag, fragmentTransaction);
        if (a != null) {
            a.commit();
            this.f3886c.executePendingTransactions();
        }
    }

    public void setOnTabChangedListener(TabHost.OnTabChangeListener onTabChangeListener) {
        this.f3888e = onTabChangeListener;
    }

    public FragmentTabHost(Context context) {
        super(context, null);
        m4954a(context, (AttributeSet) null);
    }

    /* renamed from: a */
    private C1018a m4952a(String str) {
        int size = this.f3884a.size();
        for (int i = 0; i < size; i++) {
            C1018a aVar = this.f3884a.get(i);
            if (aVar.f3892a.equals(str)) {
                return aVar;
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setCurrentTabByTag(savedState.f3891a);
    }

    public void onTabChanged(String str) {
        FragmentTransaction a;
        if (this.f3890g && (a = m4953a(str, (FragmentTransaction) null)) != null) {
            a.commit();
        }
        TabHost.OnTabChangeListener onTabChangeListener = this.f3888e;
        if (onTabChangeListener != null) {
            onTabChangeListener.onTabChanged(str);
        }
    }

    public FragmentTabHost(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m4954a(context, attributeSet);
    }

    /* renamed from: a */
    private void m4954a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16842995}, 0, 0);
        this.f3887d = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        super.setOnTabChangedListener(this);
    }

    /* renamed from: a */
    private FragmentTransaction m4953a(String str, FragmentTransaction fragmentTransaction) {
        C1018a a = m4952a(str);
        if (this.f3889f != a) {
            if (fragmentTransaction == null) {
                fragmentTransaction = this.f3886c.beginTransaction();
            }
            C1018a aVar = this.f3889f;
            if (!(aVar == null || aVar.f3895d == null)) {
                fragmentTransaction.detach(this.f3889f.f3895d);
            }
            if (a != null) {
                if (a.f3895d == null) {
                    a.f3895d = this.f3886c.getFragmentFactory().instantiate(this.f3885b.getClassLoader(), a.f3893b.getName());
                    a.f3895d.setArguments(a.f3894c);
                    fragmentTransaction.add(this.f3887d, a.f3895d, a.f3892a);
                } else {
                    fragmentTransaction.attach(a.f3895d);
                }
            }
            this.f3889f = a;
        }
        return fragmentTransaction;
    }
}
