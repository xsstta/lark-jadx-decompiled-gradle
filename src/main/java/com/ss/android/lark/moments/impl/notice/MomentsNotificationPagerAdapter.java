package com.ss.android.lark.moments.impl.notice;

import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import com.ss.android.lark.base.fragment.C29527a;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J \u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\rH\u0016J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\f\u001a\u00020\rH\u0016J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\f\u001a\u00020\rH\u0016J\u0018\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/ss/android/lark/moments/impl/notice/MomentsNotificationPagerAdapter;", "Landroidx/fragment/app/FragmentPagerAdapter;", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "fragmentInfoList", "", "Lcom/ss/android/lark/base/fragment/FragmentInfo;", "(Landroidx/fragment/app/FragmentManager;Ljava/util/List;)V", "destroyItem", "", "container", "Landroid/view/ViewGroup;", "position", "", "object", "", "getCount", "getItem", "Landroidx/fragment/app/Fragment;", "getPageTitle", "", "instantiateItem", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.moments.impl.notice.c */
public final class MomentsNotificationPagerAdapter extends FragmentPagerAdapter {

    /* renamed from: a */
    private final FragmentManager f120428a;

    /* renamed from: b */
    private final List<C29527a> f120429b;

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getCount() {
        return this.f120429b.size();
    }

    @Override // androidx.fragment.app.FragmentPagerAdapter
    public Fragment getItem(int i) {
        Fragment fragment = this.f120429b.get(i).f73820a;
        Intrinsics.checkExpressionValueIsNotNull(fragment, "fragmentInfoList[position].fragment");
        return fragment;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public CharSequence getPageTitle(int i) {
        return this.f120429b.get(i).f73821b;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.List<? extends com.ss.android.lark.base.fragment.a> */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MomentsNotificationPagerAdapter(FragmentManager fragmentManager, List<? extends C29527a> list) {
        super(fragmentManager, 1);
        Intrinsics.checkParameterIsNotNull(fragmentManager, "fragmentManager");
        Intrinsics.checkParameterIsNotNull(list, "fragmentInfoList");
        this.f120428a = fragmentManager;
        this.f120429b = list;
    }

    @Override // androidx.viewpager.widget.PagerAdapter, androidx.fragment.app.FragmentPagerAdapter
    public Object instantiateItem(ViewGroup viewGroup, int i) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "container");
        Object instantiateItem = super.instantiateItem(viewGroup, i);
        if (instantiateItem != null) {
            Fragment fragment = (Fragment) instantiateItem;
            this.f120428a.beginTransaction().show(fragment).commitAllowingStateLoss();
            return fragment;
        }
        throw new TypeCastException("null cannot be cast to non-null type androidx.fragment.app.Fragment");
    }

    @Override // androidx.viewpager.widget.PagerAdapter, androidx.fragment.app.FragmentPagerAdapter
    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "container");
        Intrinsics.checkParameterIsNotNull(obj, "object");
        Fragment fragment = this.f120429b.get(i).f73820a;
        Intrinsics.checkExpressionValueIsNotNull(fragment, "fragmentInfoList[position].fragment");
        this.f120428a.beginTransaction().hide(fragment).commitAllowingStateLoss();
    }
}
