package com.bytedance.ee.bear.drive.module.nativepreview.model;

import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.ee.bear.contract.drive.sdk.entity.open.BaseOpenEntity;
import com.bytedance.ee.bear.drive.module.nativepreview.p359a.C7104b;
import com.bytedance.ee.util.io.NonProguard;
import java.lang.ref.WeakReference;

public class FileBlockResModel implements NonProguard {
    private String key;
    private NativeViewHolder nativeViewHolder;
    private boolean needShow;
    private BaseOpenEntity openEntity;
    private long updateTime = System.currentTimeMillis();

    public static class NativeViewHolder implements NonProguard {
        private WeakReference<View> containerView;
        private Fragment fragment;

        public WeakReference<View> getContainerView() {
            return this.containerView;
        }

        public Fragment getFragment() {
            return this.fragment;
        }

        public void release() {
            if (C7104b.m28436b().mo27746a(this.fragment, true) != null) {
                FragmentManager a = C7104b.m28436b().mo27746a(this.fragment, true);
                if (a != null) {
                    a.beginTransaction().remove(this.fragment).commitAllowingStateLoss();
                } else {
                    return;
                }
            }
            if (getContainerView() != null && getContainerView().get() != null) {
                ((ViewGroup) getContainerView().get()).removeAllViews();
            }
        }

        public void setContainerView(WeakReference<View> weakReference) {
            this.containerView = weakReference;
        }

        public void setFragment(Fragment fragment2) {
            this.fragment = fragment2;
        }
    }

    public String getKey() {
        return this.key;
    }

    public NativeViewHolder getNativeViewHolder() {
        return this.nativeViewHolder;
    }

    public BaseOpenEntity getOpenEntity() {
        return this.openEntity;
    }

    public long getUpdateTime() {
        return this.updateTime;
    }

    public boolean isNeedShow() {
        return this.needShow;
    }

    public String toString() {
        return "FileBlockResModel{, needShow=" + this.needShow + ", openEntity=" + this.openEntity + ", updateTime=" + this.updateTime + '}';
    }

    public void setKey(String str) {
        this.key = str;
    }

    public void setNativeViewHolder(NativeViewHolder nativeViewHolder2) {
        this.nativeViewHolder = nativeViewHolder2;
    }

    public void setNeedShow(boolean z) {
        this.needShow = z;
    }

    public void setOpenEntity(BaseOpenEntity baseOpenEntity) {
        this.openEntity = baseOpenEntity;
    }

    public void setUpdateTime(long j) {
        this.updateTime = j;
    }

    public FileBlockResModel(String str, BaseOpenEntity baseOpenEntity, NativeViewHolder nativeViewHolder2) {
        this.key = str;
        this.openEntity = baseOpenEntity;
        this.nativeViewHolder = nativeViewHolder2;
    }
}
