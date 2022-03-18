package com.ss.android.videoshop.api;

import android.content.Context;
import android.content.Intent;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.common.utility.NetworkUtils;
import com.ss.android.videoshop.context.VideoContext;

/* renamed from: com.ss.android.videoshop.api.j */
public interface AbstractC64102j {

    /* renamed from: com.ss.android.videoshop.api.j$a */
    public static class C64103a implements AbstractC64102j {
        @Override // com.ss.android.videoshop.api.AbstractC64102j
        /* renamed from: a */
        public void mo163670a(LifecycleOwner lifecycleOwner, VideoContext videoContext) {
        }

        @Override // com.ss.android.videoshop.api.AbstractC64102j
        /* renamed from: a */
        public void mo221903a(NetworkUtils.NetworkType networkType, VideoContext videoContext, Context context, Intent intent) {
        }

        @Override // com.ss.android.videoshop.api.AbstractC64102j
        /* renamed from: a */
        public void mo163671a(VideoContext videoContext, boolean z) {
        }

        @Override // com.ss.android.videoshop.api.AbstractC64102j
        /* renamed from: a */
        public void mo221904a(boolean z, int i, boolean z2) {
        }

        @Override // com.ss.android.videoshop.api.AbstractC64102j
        /* renamed from: a */
        public boolean mo163673a(VideoContext videoContext) {
            return false;
        }

        @Override // com.ss.android.videoshop.api.AbstractC64102j
        /* renamed from: b */
        public void mo163676b(LifecycleOwner lifecycleOwner, VideoContext videoContext) {
        }

        @Override // com.ss.android.videoshop.api.AbstractC64102j
        /* renamed from: b */
        public void mo163677b(VideoContext videoContext) {
        }

        @Override // com.ss.android.videoshop.api.AbstractC64102j
        /* renamed from: b */
        public void mo163678b(VideoContext videoContext, boolean z) {
        }

        @Override // com.ss.android.videoshop.api.AbstractC64102j
        /* renamed from: b */
        public boolean mo221905b(boolean z, int i, boolean z2) {
            return false;
        }

        @Override // com.ss.android.videoshop.api.AbstractC64102j
        /* renamed from: c */
        public void mo163679c(LifecycleOwner lifecycleOwner, VideoContext videoContext) {
        }

        @Override // com.ss.android.videoshop.api.AbstractC64102j
        /* renamed from: c */
        public void mo163680c(VideoContext videoContext) {
        }

        /* renamed from: c */
        public void mo221906c(VideoContext videoContext, boolean z) {
        }

        @Override // com.ss.android.videoshop.api.AbstractC64102j
        /* renamed from: d */
        public void mo163682d(LifecycleOwner lifecycleOwner, VideoContext videoContext) {
        }

        @Override // com.ss.android.videoshop.api.AbstractC64102j
        /* renamed from: e */
        public void mo163683e(LifecycleOwner lifecycleOwner, VideoContext videoContext) {
        }

        @Override // com.ss.android.videoshop.api.AbstractC64102j
        /* renamed from: f */
        public void mo163684f(LifecycleOwner lifecycleOwner, VideoContext videoContext) {
        }
    }

    /* renamed from: a */
    void mo163670a(LifecycleOwner lifecycleOwner, VideoContext videoContext);

    /* renamed from: a */
    void mo221903a(NetworkUtils.NetworkType networkType, VideoContext videoContext, Context context, Intent intent);

    /* renamed from: a */
    void mo163671a(VideoContext videoContext, boolean z);

    /* renamed from: a */
    void mo221904a(boolean z, int i, boolean z2);

    /* renamed from: a */
    boolean mo163673a(VideoContext videoContext);

    /* renamed from: b */
    void mo163676b(LifecycleOwner lifecycleOwner, VideoContext videoContext);

    /* renamed from: b */
    void mo163677b(VideoContext videoContext);

    /* renamed from: b */
    void mo163678b(VideoContext videoContext, boolean z);

    /* renamed from: b */
    boolean mo221905b(boolean z, int i, boolean z2);

    /* renamed from: c */
    void mo163679c(LifecycleOwner lifecycleOwner, VideoContext videoContext);

    /* renamed from: c */
    void mo163680c(VideoContext videoContext);

    /* renamed from: d */
    void mo163682d(LifecycleOwner lifecycleOwner, VideoContext videoContext);

    /* renamed from: e */
    void mo163683e(LifecycleOwner lifecycleOwner, VideoContext videoContext);

    /* renamed from: f */
    void mo163684f(LifecycleOwner lifecycleOwner, VideoContext videoContext);
}
