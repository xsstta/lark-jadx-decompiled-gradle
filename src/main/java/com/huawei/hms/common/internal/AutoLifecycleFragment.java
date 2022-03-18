package com.huawei.hms.common.internal;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;
import android.util.SparseArray;
import com.huawei.hms.api.HuaweiApiClient;

public class AutoLifecycleFragment extends Fragment {
    private static final String TAG = "HmsAutoLifecycleFrag";
    private final SparseArray<ClientInfo> mAutoClientInfoMap = new SparseArray<>();
    private boolean mStarted;

    /* access modifiers changed from: private */
    public class ClientInfo {
        public final HuaweiApiClient apiClient;
        public final int clientId;

        public void stopAutoManage() {
            this.apiClient.disconnect();
        }

        public ClientInfo(int i, HuaweiApiClient huaweiApiClient) {
            this.apiClient = huaweiApiClient;
            this.clientId = i;
        }
    }

    public void onStop() {
        super.onStop();
        this.mStarted = false;
        for (int i = 0; i < this.mAutoClientInfoMap.size(); i++) {
            this.mAutoClientInfoMap.valueAt(i).apiClient.disconnect();
        }
    }

    public void onStart() {
        super.onStart();
        this.mStarted = true;
        for (int i = 0; i < this.mAutoClientInfoMap.size(); i++) {
            this.mAutoClientInfoMap.valueAt(i).apiClient.connect((Activity) null);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    public void stopAutoManage(int i) {
        ClientInfo clientInfo = this.mAutoClientInfoMap.get(i);
        this.mAutoClientInfoMap.remove(i);
        if (clientInfo != null) {
            clientInfo.stopAutoManage();
        }
    }

    public static AutoLifecycleFragment getInstance(Activity activity) {
        Preconditions.checkMainThread("Must be called on the main thread");
        try {
            AutoLifecycleFragment autoLifecycleFragment = (AutoLifecycleFragment) activity.getFragmentManager().findFragmentByTag(TAG);
            FragmentManager fragmentManager = activity.getFragmentManager();
            if (autoLifecycleFragment != null) {
                return autoLifecycleFragment;
            }
            AutoLifecycleFragment autoLifecycleFragment2 = new AutoLifecycleFragment();
            fragmentManager.beginTransaction().add(autoLifecycleFragment2, TAG).commitAllowingStateLoss();
            fragmentManager.executePendingTransactions();
            return autoLifecycleFragment2;
        } catch (ClassCastException e) {
            throw new IllegalStateException("Fragment with tag HmsAutoLifecycleFrag is not a AutoLifecycleFragment", e);
        }
    }

    public void startAutoMange(int i, HuaweiApiClient huaweiApiClient) {
        boolean z;
        Preconditions.checkNotNull(huaweiApiClient, "HuaweiApiClient instance cannot be null");
        if (this.mAutoClientInfoMap.indexOfKey(i) < 0) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkState(z, "Already managing a HuaweiApiClient with this clientId: " + i);
        this.mAutoClientInfoMap.put(i, new ClientInfo(i, huaweiApiClient));
        if (this.mStarted) {
            huaweiApiClient.connect((Activity) null);
        }
    }
}
