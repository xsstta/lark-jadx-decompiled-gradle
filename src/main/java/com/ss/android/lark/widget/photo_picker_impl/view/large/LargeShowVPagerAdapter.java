package com.ss.android.lark.widget.photo_picker_impl.view.large;

import android.view.ViewGroup;
import androidx.fragment.app.AbstractC1045n;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.google.firebase.messaging.Constants;
import com.ss.android.lark.widget.photo_picker_impl.bean.Photo;
import com.ss.android.lark.widget.photo_picker_impl.view.base.IShowPluginFactory;
import com.ss.android.lark.widget.photo_picker_impl.view.large.LargeShowPlugin;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0004\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003:\u0001(B7\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b0\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ \u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u0016H\u0016J\u0016\u0010\u001f\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u000fj\b\u0012\u0004\u0012\u00028\u0000`\u0010J\u0006\u0010 \u001a\u00020\u0016J\u0010\u0010!\u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\u0016H\u0016J\u0018\u0010\"\u001a\u00020\u001d2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0016H\u0016J\u001c\u0010#\u001a\u00020\u00182\f\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00000%2\u0006\u0010&\u001a\u00020\u0016J\u0006\u0010'\u001a\u00020\u0018R\u001e\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u000fj\b\u0012\u0004\u0012\u00028\u0000`\u0010X\u0004¢\u0006\u0002\n\u0000R \u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b0\u0007X\u0004¢\u0006\u0002\n\u0000R6\u0010\u0011\u001a*\u0012\u0004\u0012\u00020\u0013\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b0\u0012j\u0014\u0012\u0004\u0012\u00020\u0013\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b`\u0014X\u0004¢\u0006\u0002\n\u0000R*\u0010\u0015\u001a\u001e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00130\u0012j\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0013`\u0014X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000¨\u0006)"}, d2 = {"Lcom/ss/android/lark/widget/photo_picker_impl/view/large/LargeShowVPagerAdapter;", "DATA", "Lcom/ss/android/lark/widget/photo_picker_impl/bean/Photo;", "Landroidx/fragment/app/FragmentStatePagerAdapter;", "fm", "Landroidx/fragment/app/FragmentManager;", "mFactory", "Lcom/ss/android/lark/widget/photo_picker_impl/view/base/IShowPluginFactory;", "Lcom/ss/android/lark/widget/photo_picker_impl/view/large/LargeShowPlugin;", "mLargeShowPluginContext", "Lcom/ss/android/lark/widget/photo_picker_impl/view/large/LargeShowPlugin$ILargeShowPluginContext;", "mFuncSupport", "Lcom/ss/android/lark/widget/photo_picker_impl/view/large/LargeShowVPagerAdapter$IFuncSupport;", "(Landroidx/fragment/app/FragmentManager;Lcom/ss/android/lark/widget/photo_picker_impl/view/base/IShowPluginFactory;Lcom/ss/android/lark/widget/photo_picker_impl/view/large/LargeShowPlugin$ILargeShowPluginContext;Lcom/ss/android/lark/widget/photo_picker_impl/view/large/LargeShowVPagerAdapter$IFuncSupport;)V", "mData", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "mFragToPlugin", "Ljava/util/HashMap;", "Landroidx/fragment/app/Fragment;", "Lkotlin/collections/HashMap;", "mFragmentMap", "", "destroyItem", "", "container", "Landroid/view/ViewGroup;", "position", "any", "", "getCount", "getData", "getDataSize", "getItem", "instantiateItem", "notifyDataChanged", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "append", "refreshExistingFragment", "IFuncSupport", "photo-picker-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.widget.photo_picker_impl.d.c.c */
public final class LargeShowVPagerAdapter<DATA extends Photo> extends AbstractC1045n {

    /* renamed from: a */
    private final HashMap<Integer, Fragment> f145815a = new HashMap<>();

    /* renamed from: b */
    private final HashMap<Fragment, LargeShowPlugin<DATA>> f145816b = new HashMap<>();

    /* renamed from: c */
    private final ArrayList<DATA> f145817c = new ArrayList<>();

    /* renamed from: d */
    private final IShowPluginFactory<DATA, LargeShowPlugin<DATA>> f145818d;

    /* renamed from: e */
    private final LargeShowPlugin.ILargeShowPluginContext f145819e;

    /* renamed from: f */
    private final IFuncSupport f145820f;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/widget/photo_picker_impl/view/large/LargeShowVPagerAdapter$IFuncSupport;", "", "getCurrentItem", "", "setCurrentItem", "", "position", "smoothScroll", "", "photo-picker-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.widget.photo_picker_impl.d.c.c$a */
    public interface IFuncSupport {
        /* renamed from: a */
        int mo199669a();

        /* renamed from: a */
        void mo199670a(int i, boolean z);
    }

    /* renamed from: c */
    public final ArrayList<DATA> mo199682c() {
        return this.f145817c;
    }

    /* renamed from: b */
    public final int mo199681b() {
        return this.f145817c.size();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getCount() {
        return this.f145817c.size();
    }

    /* renamed from: a */
    public final void mo199679a() {
        LargeShowPlugin<DATA> bVar;
        for (Map.Entry<Integer, Fragment> entry : this.f145815a.entrySet()) {
            int intValue = entry.getKey().intValue();
            Fragment value = entry.getValue();
            if (intValue < this.f145817c.size() && (bVar = this.f145816b.get(value)) != null) {
                DATA data = this.f145817c.get(intValue);
                Intrinsics.checkExpressionValueIsNotNull(data, "mData[pos]");
                bVar.mo197692b(data);
            }
        }
    }

    @Override // androidx.fragment.app.AbstractC1045n
    /* renamed from: a */
    public Fragment mo5615a(int i) {
        IShowPluginFactory<DATA, LargeShowPlugin<DATA>> bVar = this.f145818d;
        DATA data = this.f145817c.get(i);
        Intrinsics.checkExpressionValueIsNotNull(data, "mData[position]");
        LargeShowPlugin<DATA> a = bVar.mo197712a(bVar.mo197711a(i, data));
        a.mo199678a(this.f145819e);
        DATA data2 = this.f145817c.get(i);
        Intrinsics.checkExpressionValueIsNotNull(data2, "mData[position]");
        a.mo197690a(data2);
        Fragment a2 = a.mo197688a();
        this.f145816b.put(a2, a);
        return a2;
    }

    @Override // androidx.fragment.app.AbstractC1045n, androidx.viewpager.widget.PagerAdapter
    public Object instantiateItem(ViewGroup viewGroup, int i) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "container");
        Object instantiateItem = super.instantiateItem(viewGroup, i);
        Intrinsics.checkExpressionValueIsNotNull(instantiateItem, "super.instantiateItem(container, position)");
        HashMap<Integer, Fragment> hashMap = this.f145815a;
        Integer valueOf = Integer.valueOf(i);
        if (instantiateItem != null) {
            hashMap.put(valueOf, (Fragment) instantiateItem);
            return instantiateItem;
        }
        throw new TypeCastException("null cannot be cast to non-null type androidx.fragment.app.Fragment");
    }

    /* renamed from: a */
    public final void mo199680a(List<? extends DATA> list, int i) {
        LargeShowPlugin<DATA> bVar;
        LargeShowPlugin<DATA> bVar2;
        Intrinsics.checkParameterIsNotNull(list, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        this.f145817c.clear();
        this.f145817c.addAll(list);
        if (i > 0) {
            notifyDataSetChanged();
            for (Map.Entry<Integer, Fragment> entry : this.f145815a.entrySet()) {
                int intValue = entry.getKey().intValue();
                Fragment value = entry.getValue();
                if (intValue < this.f145817c.size() && (bVar2 = this.f145816b.get(value)) != null) {
                    DATA data = this.f145817c.get(intValue);
                    Intrinsics.checkExpressionValueIsNotNull(data, "mData[pos]");
                    bVar2.mo197692b(data);
                }
            }
        } else if (i < 0) {
            int i2 = -i;
            for (Map.Entry<Integer, Fragment> entry2 : this.f145815a.entrySet()) {
                int intValue2 = entry2.getKey().intValue();
                Fragment value2 = entry2.getValue();
                int i3 = intValue2 + i2;
                if (i3 < this.f145817c.size() && (bVar = this.f145816b.get(value2)) != null) {
                    DATA data2 = this.f145817c.get(i3);
                    Intrinsics.checkExpressionValueIsNotNull(data2, "mData[pos + offset]");
                    bVar.mo197692b(data2);
                }
            }
            notifyDataSetChanged();
            this.f145820f.mo199670a(this.f145820f.mo199669a() - i, false);
        } else {
            notifyDataSetChanged();
        }
    }

    @Override // androidx.fragment.app.AbstractC1045n, androidx.viewpager.widget.PagerAdapter
    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "container");
        Intrinsics.checkParameterIsNotNull(obj, "any");
        super.destroyItem(viewGroup, i, obj);
        Fragment remove = this.f145815a.remove(Integer.valueOf(i));
        if (remove != null) {
            this.f145816b.remove(remove);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LargeShowVPagerAdapter(FragmentManager fragmentManager, IShowPluginFactory<DATA, LargeShowPlugin<DATA>> bVar, LargeShowPlugin.ILargeShowPluginContext aVar, IFuncSupport aVar2) {
        super(fragmentManager);
        Intrinsics.checkParameterIsNotNull(fragmentManager, "fm");
        Intrinsics.checkParameterIsNotNull(bVar, "mFactory");
        Intrinsics.checkParameterIsNotNull(aVar, "mLargeShowPluginContext");
        Intrinsics.checkParameterIsNotNull(aVar2, "mFuncSupport");
        this.f145818d = bVar;
        this.f145819e = aVar;
        this.f145820f = aVar2;
    }
}
