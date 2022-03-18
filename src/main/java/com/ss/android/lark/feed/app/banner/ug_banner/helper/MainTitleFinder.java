package com.ss.android.lark.feed.app.banner.ug_banner.helper;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.larksuite.suite.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/feed/app/banner/ug_banner/helper/MainTitleFinder;", "", "()V", "findAvatar", "Landroid/view/View;", "anchorView", "im_feed_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.feed.app.banner.c.c.c */
public final class MainTitleFinder {
    /* renamed from: a */
    public final View mo137213a(View view) {
        Context context;
        View findViewById;
        View findViewById2;
        Intrinsics.checkParameterIsNotNull(view, "anchorView");
        ViewParent parent = view.getParent();
        if (!(parent instanceof ViewGroup)) {
            parent = null;
        }
        ViewGroup viewGroup = (ViewGroup) parent;
        while (viewGroup != null && !(viewGroup.getContext() instanceof Activity)) {
            ViewParent parent2 = viewGroup.getParent();
            if (!(parent2 instanceof ViewGroup)) {
                parent2 = null;
            }
            viewGroup = (ViewGroup) parent2;
        }
        if (viewGroup != null) {
            context = viewGroup.getContext();
        } else {
            context = null;
        }
        if (!(context instanceof Activity)) {
            context = null;
        }
        Activity activity = (Activity) context;
        if (activity == null || (findViewById = activity.findViewById(R.id.main_title)) == null || (findViewById2 = findViewById.findViewById(R.id.avatar)) == null) {
            return null;
        }
        return findViewById2;
    }
}
