package com.ss.android.lark.setting.page.content.common.impl.font;

import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.AbstractC1583a;
import com.ss.android.lark.setting.page.content.common.impl.font.chat.ChatFontSettingFragment;
import com.ss.android.lark.setting.page.content.common.impl.font.doc.DocFontSettingFragment;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\tH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/setting/page/content/common/impl/font/FontSettingViewPaperAdapter;", "Landroidx/viewpager2/adapter/FragmentStateAdapter;", "fragment", "Landroidx/fragment/app/Fragment;", "(Landroidx/fragment/app/Fragment;)V", "getFragment", "()Landroidx/fragment/app/Fragment;", "createFragment", "position", "", "getItemCount", "core_setting_setting_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.setting.page.content.common.impl.font.b */
public final class FontSettingViewPaperAdapter extends AbstractC1583a {

    /* renamed from: e */
    private final Fragment f134141e;

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return 2;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FontSettingViewPaperAdapter(Fragment fragment) {
        super(fragment);
        Intrinsics.checkParameterIsNotNull(fragment, "fragment");
        this.f134141e = fragment;
    }

    @Override // androidx.viewpager2.adapter.AbstractC1583a
    /* renamed from: a */
    public Fragment mo8246a(int i) {
        if (i == 0) {
            return new ChatFontSettingFragment();
        }
        return new DocFontSettingFragment();
    }
}
