package com.tt.miniapp.render;

import android.app.Activity;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.tt.miniapp.C65966d;
import com.tt.miniapp.RenderViewManager;

public interface IAppbrandRenderHost extends RenderViewManager.IRender {
    void attachRenderView(View view);

    void attachRenderView(Fragment fragment);

    void detachRenderView(View view);

    Activity getActivity();

    IAppContext getAppContext();

    Fragment getFragment();

    View getFragmentView();

    RenderViewManager getRenderViewManager();

    C65966d getTitleBar();

    boolean isHidden();

    boolean isStarted();
}
