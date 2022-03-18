package com.ss.android.lark.desktopmode.p1787a;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.larksuite.framework.utils.C26279i;
import com.ss.android.lark.desktopmode.base.FragmentParams;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.log.Log;

/* renamed from: com.ss.android.lark.desktopmode.a.a */
public class C36516a<T extends FragmentParams> extends Fragment {
    private Context mApplicationContext = null;
    private AbstractC36518c mCallback = null;
    private String mFragmentInfoId = generateFragmentInfoId();
    private T mFragmentParams = null;
    private int mRequestCode = -1;
    private int mResultCode;
    private Intent mResultIntent = new Intent();

    /* access modifiers changed from: protected */
    public void onFinish() {
    }

    public boolean onNewArguments(Bundle bundle) {
        return false;
    }

    public void onWindowFocusChanged(boolean z) {
    }

    public final String getFragmentInfoId() {
        return this.mFragmentInfoId;
    }

    public T getFragmentParams() {
        return this.mFragmentParams;
    }

    public AbstractC36518c getLifecycleCallback() {
        return this.mCallback;
    }

    public int getRequestCode() {
        return this.mRequestCode;
    }

    public void onFragmentBringToFront() {
        C36519d.m144080a().mo134821c();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        AbstractC36518c cVar = this.mCallback;
        if (cVar != null) {
            cVar.mo134799d();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        super.onDetach();
        AbstractC36518c cVar = this.mCallback;
        if (cVar != null) {
            cVar.mo134795b();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        AbstractC36518c cVar = this.mCallback;
        if (cVar != null) {
            cVar.mo134791a();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        AbstractC36518c cVar = this.mCallback;
        if (cVar != null) {
            cVar.mo134797c();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public Context getContext() {
        Context context = super.getContext();
        if (context != null) {
            return context;
        }
        Log.m165391i("CompatFragment", new RuntimeException("getContext returns null"));
        return this.mApplicationContext;
    }

    private String generateFragmentInfoId() {
        return C26279i.m95148a() + "_" + getClass().getName();
    }

    public final void finish() {
        onFinish();
        FragmentActivity activity = getActivity();
        if (activity != null) {
            if (DesktopUtil.m144301a((Context) activity)) {
                C36519d.m144080a().mo134802a(this);
                if (this.mRequestCode >= 0) {
                    C36519d.m144080a().mo134803a(this, this.mResultIntent, this.mRequestCode, this.mResultCode);
                }
            } else if (DesktopUtil.m144300a((Activity) activity)) {
                activity.finish();
            }
        }
    }

    public void setFragmentParams(T t) {
        this.mFragmentParams = t;
    }

    public void setLifecycleCallback(AbstractC36518c cVar) {
        this.mCallback = cVar;
    }

    public void setRequestCode(int i) {
        this.mRequestCode = i;
    }

    public void setResult(int i) {
        setResult(i, null);
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        AbstractC36518c cVar = this.mCallback;
        if (cVar != null) {
            cVar.mo134792a(context);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        AbstractC36518c cVar = this.mCallback;
        if (cVar != null) {
            cVar.mo134793a(bundle);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        AbstractC36518c cVar = this.mCallback;
        if (cVar != null) {
            cVar.mo134798c(bundle);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        if (getContext() != null) {
            this.mApplicationContext = getContext().getApplicationContext();
        }
        AbstractC36518c cVar = this.mCallback;
        if (cVar != null) {
            cVar.mo134796b(bundle);
        }
    }

    public void setResult(int i, Intent intent) {
        FragmentActivity activity = getActivity();
        if (activity == null) {
            Log.m165384e(getClass().getSimpleName(), "setResult", new IllegalAccessException("getActivity returns null"));
        } else if (DesktopUtil.m144301a((Context) activity)) {
            this.mResultCode = i;
            this.mResultIntent = intent;
        } else {
            activity.setResult(i, intent);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC36518c cVar = this.mCallback;
        if (cVar != null) {
            cVar.mo134794a(layoutInflater, viewGroup, bundle);
        }
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }
}
