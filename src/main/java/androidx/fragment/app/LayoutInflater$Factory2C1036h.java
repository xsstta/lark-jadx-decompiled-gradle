package androidx.fragment.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;

/* access modifiers changed from: package-private */
/* renamed from: androidx.fragment.app.h */
public class LayoutInflater$Factory2C1036h implements LayoutInflater.Factory2 {

    /* renamed from: a */
    private final FragmentManager f3948a;

    LayoutInflater$Factory2C1036h(FragmentManager fragmentManager) {
        this.f3948a = fragmentManager;
    }

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        int i;
        if (FragmentContainerView.class.getName().equals(str)) {
            return new FragmentContainerView(context, attributeSet, this.f3948a);
        }
        Fragment fragment = null;
        if (!"fragment".equals(str)) {
            return null;
        }
        String attributeValue = attributeSet.getAttributeValue(null, "class");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16842755, 16842960, 16842961});
        int i2 = 0;
        if (attributeValue == null) {
            attributeValue = obtainStyledAttributes.getString(0);
        }
        int resourceId = obtainStyledAttributes.getResourceId(1, -1);
        String string = obtainStyledAttributes.getString(2);
        obtainStyledAttributes.recycle();
        if (attributeValue == null || !C1034f.isFragmentClass(context.getClassLoader(), attributeValue)) {
            return null;
        }
        if (view != null) {
            i2 = view.getId();
        }
        if (i2 == -1 && resourceId == -1 && string == null) {
            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
        }
        if (resourceId != -1) {
            fragment = this.f3948a.findFragmentById(resourceId);
        }
        if (fragment == null && string != null) {
            fragment = this.f3948a.findFragmentByTag(string);
        }
        if (fragment == null && i2 != -1) {
            fragment = this.f3948a.findFragmentById(i2);
        }
        if (FragmentManager.isLoggingEnabled(2)) {
            Log.v("FragmentManager", "onCreateView: id=0x" + Integer.toHexString(resourceId) + " fname=" + attributeValue + " existing=" + fragment);
        }
        if (fragment == null) {
            fragment = this.f3948a.getFragmentFactory().instantiate(context.getClassLoader(), attributeValue);
            fragment.mFromLayout = true;
            if (resourceId != 0) {
                i = resourceId;
            } else {
                i = i2;
            }
            fragment.mFragmentId = i;
            fragment.mContainerId = i2;
            fragment.mTag = string;
            fragment.mInLayout = true;
            fragment.mFragmentManager = this.f3948a;
            fragment.mHost = this.f3948a.mHost;
            fragment.onInflate(this.f3948a.mHost.mo5557g(), attributeSet, fragment.mSavedFragmentState);
            this.f3948a.addFragment(fragment);
            this.f3948a.moveToState(fragment);
        } else if (!fragment.mInLayout) {
            fragment.mInLayout = true;
            fragment.mHost = this.f3948a.mHost;
            fragment.onInflate(this.f3948a.mHost.mo5557g(), attributeSet, fragment.mSavedFragmentState);
        } else {
            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(i2) + " with another fragment for " + attributeValue);
        }
        if (this.f3948a.mCurState >= 1 || !fragment.mFromLayout) {
            this.f3948a.moveToState(fragment);
        } else {
            this.f3948a.moveToState(fragment, 1);
        }
        if (fragment.mView != null) {
            if (resourceId != 0) {
                fragment.mView.setId(resourceId);
            }
            if (fragment.mView.getTag() == null) {
                fragment.mView.setTag(string);
            }
            return fragment.mView;
        }
        throw new IllegalStateException("Fragment " + attributeValue + " did not create a view.");
    }
}
