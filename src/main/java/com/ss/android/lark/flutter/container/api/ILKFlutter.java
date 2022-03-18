package com.ss.android.lark.flutter.container.api;

import androidx.fragment.app.Fragment;
import java.io.Serializable;

public interface ILKFlutter {
    void init(InitParams initParams);

    Fragment newFragment(String str, Serializable serializable, String str2);
}
