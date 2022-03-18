package com.ss.android.lark.base.fragment;

import android.content.Context;
import android.os.Bundle;
import butterknife.Unbinder;
import com.larksuite.framework.callback.CallbackManager;
import com.ss.android.lark.desktopmode.p1787a.C36516a;

public class BaseFragment extends C36516a {
    public String TAG = "time";
    protected Unbinder mBkUnbinder;
    public CallbackManager mCallbackManager;
    public Context mContext;

    public CallbackManager getCallbackManager() {
        return this.mCallbackManager;
    }

    public boolean isActive() {
        if (!isAdded() || getActivity() == null) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.mCallbackManager.cancelCallbacks();
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.mContext = getContext();
        this.mCallbackManager = new CallbackManager();
    }
}
