package com.ss.android.lark.moments.impl.mainview;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.lark.pb.moments.v1.Tab;
import com.ss.android.lark.moments.impl.feed.MomentsFeedFragment;
import com.ss.android.lark.moments.impl.feed.TitleApi;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\r\u001a\u00020\u000eH\u0016J\u0017\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u000e¢\u0006\u0002\u0010\u0012J\u0017\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\u0010\u0011\u001a\u0004\u0018\u00010\u000e¢\u0006\u0002\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u000eH\u0016J\u0010\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u0011\u001a\u00020\u000eH\u0016R!\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\t0\bj\b\u0012\u0004\u0012\u00020\t`\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/ss/android/lark/moments/impl/mainview/MomentsFeedPagerAdapter;", "Lcom/ss/android/lark/moments/impl/mainview/FragmentStatePagerAdapter;", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "fromCategoryDetail", "", "(Landroidx/fragment/app/FragmentManager;Z)V", "fragmentInfoList", "Ljava/util/ArrayList;", "Lcom/ss/android/lark/moments/impl/mainview/TabFragmentInfo;", "Lkotlin/collections/ArrayList;", "getFragmentInfoList", "()Ljava/util/ArrayList;", "getCount", "", "getFragmentItem", "Landroidx/fragment/app/Fragment;", "position", "(Ljava/lang/Integer;)Landroidx/fragment/app/Fragment;", "getFragmentTabId", "", "(Ljava/lang/Integer;)Ljava/lang/String;", "getItem", "getItemPosition", "obj", "", "getPageTitle", "", "Companion", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.moments.impl.mainview.c */
public final class MomentsFeedPagerAdapter extends AbstractC47704a {

    /* renamed from: b */
    public static WeakReference<MomentsFeedFragment> f120269b = new WeakReference<>(null);

    /* renamed from: c */
    public static final Companion f120270c = new Companion(null);

    /* renamed from: d */
    private final ArrayList<TabFragmentInfo> f120271d;

    /* renamed from: e */
    private final boolean f120272e;

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getItemPosition(Object obj) {
        Intrinsics.checkParameterIsNotNull(obj, "obj");
        return -2;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\"\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/ss/android/lark/moments/impl/mainview/MomentsFeedPagerAdapter$Companion;", "", "()V", "recommendFragment", "Ljava/lang/ref/WeakReference;", "Lcom/ss/android/lark/moments/impl/feed/MomentsFeedFragment;", "getRecommendFragment", "()Ljava/lang/ref/WeakReference;", "setRecommendFragment", "(Ljava/lang/ref/WeakReference;)V", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.mainview.c$a */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: a */
        public final WeakReference<MomentsFeedFragment> mo167404a() {
            return MomentsFeedPagerAdapter.f120269b;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public final ArrayList<TabFragmentInfo> mo167402a() {
        return this.f120271d;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getCount() {
        return this.f120271d.size();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public CharSequence getPageTitle(int i) {
        return this.f120271d.get(i).mo167436b();
    }

    /* renamed from: a */
    public final Fragment mo167401a(Integer num) {
        if (num == null) {
            return null;
        }
        num.intValue();
        if (Intrinsics.compare(this.f120218a.size(), num.intValue()) <= 0 || num.intValue() < 0) {
            return null;
        }
        return (Fragment) this.f120218a.get(num.intValue());
    }

    /* renamed from: b */
    public final String mo167403b(Integer num) {
        if (num == null) {
            return null;
        }
        int size = this.f120271d.size();
        int intValue = num.intValue();
        if (intValue >= 0 && size > intValue) {
            return this.f120271d.get(num.intValue()).mo167434a();
        }
        return null;
    }

    @Override // com.ss.android.lark.moments.impl.mainview.AbstractC47704a
    /* renamed from: a */
    public Fragment mo167345a(int i) {
        TabFragmentInfo hVar = this.f120271d.get(i);
        Intrinsics.checkExpressionValueIsNotNull(hVar, "fragmentInfoList[position]");
        TabFragmentInfo hVar2 = hVar;
        MomentsFeedFragment momentsFeedFragment = new MomentsFeedFragment();
        Bundle bundle = new Bundle();
        bundle.putString("arguments_tab_id", hVar2.mo167434a());
        bundle.putString("arguments_from", hVar2.mo167441g());
        bundle.putString("arguments_hash_tag_content", hVar2.mo167442h());
        bundle.putInt("arguments_feed_order", hVar2.mo167437c());
        bundle.putBoolean("arguments_top_round", hVar2.mo167443i());
        momentsFeedFragment.setArguments(bundle);
        momentsFeedFragment.mo166895a(this.f120272e);
        TitleApi d = hVar2.mo167438d();
        if (d != null) {
            momentsFeedFragment.mo166893a(d);
        }
        MomentsFeedFragment.OutPageApi e = hVar2.mo167439e();
        if (e != null) {
            momentsFeedFragment.mo166892a(e);
        }
        MomentsFeedFragment.OnDisableTabListener f = hVar2.mo167440f();
        if (f != null) {
            momentsFeedFragment.mo166891a(f);
        }
        if (Intrinsics.areEqual(hVar2.mo167434a(), String.valueOf(Tab.FeedTabId.FEED_RECOMMEND.getValue()))) {
            f120269b = new WeakReference<>(momentsFeedFragment);
        }
        return momentsFeedFragment;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MomentsFeedPagerAdapter(FragmentManager fragmentManager, boolean z) {
        super(fragmentManager, 1);
        Intrinsics.checkParameterIsNotNull(fragmentManager, "fragmentManager");
        this.f120272e = z;
        this.f120271d = new ArrayList<>();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MomentsFeedPagerAdapter(FragmentManager fragmentManager, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(fragmentManager, (i & 2) != 0 ? false : z);
    }
}
