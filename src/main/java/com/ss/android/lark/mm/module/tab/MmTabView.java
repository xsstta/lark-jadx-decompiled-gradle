package com.ss.android.lark.mm.module.tab;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.larksuite.component.universe_design.icon.UDIconUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.mm.utils.ResString;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.tab.MainTabItemView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\b\u0010\u000b\u001a\u00020\fH\u0002¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/mm/module/tab/MmTabView;", "Lcom/ss/android/lark/widget/tab/MainTabItemView;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "init", "", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class MmTabView extends MainTabItemView {

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/graphics/drawable/Drawable;", "getDrawable"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.tab.MmTabView$a */
    public static final class C47037a implements MainTabItemView.AbstractC59196a {

        /* renamed from: a */
        final /* synthetic */ MmTabView f118390a;

        C47037a(MmTabView mmTabView) {
            this.f118390a = mmTabView;
        }

        @Override // com.ss.android.lark.widget.tab.MainTabItemView.AbstractC59196a
        public final Drawable getDrawable() {
            Context context = this.f118390a.getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "context");
            return UDIconUtils.getIconDrawable(context, R.drawable.ud_icon_tab_minutes_colorful);
        }
    }

    /* renamed from: c */
    private final void m186177c() {
        Context context = getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "context");
        mo201235a(UDIconUtils.getIconDrawable(context, (int) R.drawable.ud_icon_tab_minutes_filled, UIHelper.getColor(R.color.ud_N500)), new C47037a(this));
        setTabTitle(ResString.f118656a.mo165504a(R.string.MMWeb_G_MinutesNameShort));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public MmTabView(Context context) {
        this(context, null);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public MmTabView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MmTabView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
        m186177c();
    }
}
