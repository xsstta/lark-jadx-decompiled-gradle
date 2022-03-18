package com.bytedance.ee.bear.drive.module.nativepreview;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.bytedance.ee.bear.browser.plugin.AbstractC4958n;
import com.bytedance.ee.bear.browser.plugin.C4943e;
import com.bytedance.ee.bear.drive.core.AbsDrivePlugin;
import com.bytedance.ee.bear.drive.core.DrivePluginHost;

public class SharedDriveBlockViewManagerPlugin extends AbsDrivePlugin {
    private ViewGroup findParent(View view) {
        while (view != null) {
            if (!"block_place_holder".equals(view.getTag())) {
                ViewParent parent = view.getParent();
                if (parent == null || !(parent instanceof View)) {
                    break;
                }
                view = (View) parent;
            } else {
                return (ViewGroup) view;
            }
        }
        return null;
    }

    private void removeFragmentView(ViewGroup viewGroup) {
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            if (!"loadingRoot".equals(childAt.getTag())) {
                viewGroup.removeView(childAt);
            }
        }
    }

    public void onDetachFromUIContainer(DrivePluginHost aVar, AbstractC4958n nVar) {
        ViewGroup findParent = findParent(nVar.mo19601f());
        if (findParent != null) {
            removeFragmentView(findParent);
        }
        super.onDetachFromUIContainer((C4943e) aVar, nVar);
    }
}
