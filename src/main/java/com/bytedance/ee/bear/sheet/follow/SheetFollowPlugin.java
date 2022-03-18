package com.bytedance.ee.bear.sheet.follow;

import android.os.Bundle;
import com.bytedance.ee.bear.browser.plugin.AbstractC4958n;
import com.bytedance.ee.bear.document.C6095s;
import com.bytedance.ee.bear.document.follow.FollowPlugin;
import com.bytedance.ee.bear.document.orientation.UnspecifiedOrientationPlugin;

public class SheetFollowPlugin extends FollowPlugin {
    private void handleOrientation() {
        UnspecifiedOrientationPlugin unspecifiedOrientationPlugin = (UnspecifiedOrientationPlugin) findPlugin(UnspecifiedOrientationPlugin.class);
        if (unspecifiedOrientationPlugin != null) {
            Bundle arguments = ((C6095s) getHost()).mo24597l().getArguments();
            if (arguments == null || !arguments.getBoolean("vc_refresh", false)) {
                unspecifiedOrientationPlugin.forceLandscape();
            } else if (getContext().getResources().getConfiguration().orientation != 1) {
                unspecifiedOrientationPlugin.forceLandscape();
            }
        }
    }

    @Override // com.bytedance.ee.bear.document.follow.FollowPlugin
    public void onAttachToUIContainer(C6095s sVar, AbstractC4958n nVar) {
        super.onAttachToUIContainer(sVar, nVar);
        handleOrientation();
    }
}
