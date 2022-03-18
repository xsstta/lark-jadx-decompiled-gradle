package com.tt.miniapp.preload;

import android.content.Context;
import com.tt.miniapp.AppbrandFragment;

public interface IRenderViewPreload {
    void clean();

    void preloadOnIdle();

    void preloadOnProcessInit();

    AppbrandFragment takePreloadFragment(Context context, String str);
}
