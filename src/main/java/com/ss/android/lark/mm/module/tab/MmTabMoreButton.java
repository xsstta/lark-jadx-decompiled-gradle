package com.ss.android.lark.mm.module.tab;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import com.larksuite.component.universe_design.icon.UDIconUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.maincore.AbstractC44545b;
import com.ss.android.lark.mm.depend.C45899c;
import com.ss.android.lark.mm.depend.IMmDepend;
import com.ss.android.lark.mm.module.list.base.MinutesListActivity;
import com.ss.android.lark.mm.module.list.home.MmListMoreMenu;
import com.ss.android.lark.mm.p2288b.C45851c;
import com.ss.android.lark.mm.p2288b.C45855f;
import com.ss.android.lark.mm.p2288b.C45859k;
import com.ss.android.lark.mm.utils.ResString;
import com.ss.android.lark.mm.widget.onboarding.MmNewGuideConfig;
import com.ss.android.lark.ui.p2892a.C57582a;
import com.ss.android.lark.widget.listener.OnSingleClickListener;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bXD¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/ss/android/lark/mm/module/tab/MmTabMoreButton;", "Lcom/ss/android/lark/maincore/IFunctionButton;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "guideKey", "", "getContentView", "Landroid/view/View;", "updateImageViewWidth", "", "moreView", "Landroid/widget/ImageView;", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mm.module.tab.c */
public final class MmTabMoreButton implements AbstractC44545b {

    /* renamed from: a */
    public final String f118412a = "vc_minutes_trash_box";

    /* renamed from: b */
    private final Context f118413b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/mm/module/tab/MmTabMoreButton$getContentView$1", "Lcom/ss/android/lark/widget/listener/OnSingleClickListener;", "onSingleClick", "", "v", "Landroid/view/View;", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.tab.c$a */
    public static final class C47050a extends OnSingleClickListener {
        C47050a() {
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.mm.module.tab.c$a$a */
        static final class C47051a extends Lambda implements Function0<Unit> {
            public static final C47051a INSTANCE = new C47051a();

            C47051a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final void invoke() {
                MinutesListActivity.Companion aVar = MinutesListActivity.f116750b;
                Context a = C45851c.m181646a();
                Intrinsics.checkExpressionValueIsNotNull(a, "MmContext.getContext()");
                aVar.mo162920a(a, "", 19, "trash");
            }
        }

        @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
        public void onSingleClick(View view) {
            Intrinsics.checkParameterIsNotNull(view, "v");
            MmListMoreMenu.m183478a(view, C47051a.INSTANCE);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.tab.c$b */
    static final class RunnableC47052b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ MmTabMoreButton f118414a;

        /* renamed from: b */
        final /* synthetic */ ImageView f118415b;

        RunnableC47052b(MmTabMoreButton cVar, ImageView imageView) {
            this.f118414a = cVar;
            this.f118415b = imageView;
        }

        public final void run() {
            this.f118414a.mo165271a(this.f118415b);
            C45859k.m181686a(new Runnable(this) {
                /* class com.ss.android.lark.mm.module.tab.MmTabMoreButton.RunnableC47052b.RunnableC470531 */

                /* renamed from: a */
                final /* synthetic */ RunnableC47052b f118416a;

                {
                    this.f118416a = r1;
                }

                public final void run() {
                    MmNewGuideConfig mmNewGuideConfig = new MmNewGuideConfig(this.f118416a.f118415b, this.f118416a.f118414a.f118412a, null, ResString.f118656a.mo165504a(R.string.MMWeb_M_ViewTrashHere_Onboard_Tooltip), 80);
                    IMmDepend a = C45899c.m181859a();
                    Intrinsics.checkExpressionValueIsNotNull(a, "MmDepend.impl()");
                    a.getGuideDependency().mo144593a(mmNewGuideConfig, null);
                }
            }, 200);
        }
    }

    @Override // com.ss.android.lark.maincore.AbstractC44545b
    public View getContentView() {
        ImageView imageView = new ImageView(this.f118413b);
        imageView.setOnClickListener(new C47050a());
        Context context = this.f118413b;
        imageView.setImageDrawable(UDIconUtils.getIconDrawable(context, (int) R.drawable.ud_icon_more_outlined, ContextCompat.getColor(context, R.color.icon_n1)));
        IMmDepend a = C45899c.m181859a();
        Intrinsics.checkExpressionValueIsNotNull(a, "MmDepend.impl()");
        if (!a.getGuideDependency().mo144594a(this.f118412a)) {
            imageView.setVisibility(0);
        } else {
            imageView.setVisibility(4);
            C45859k.m181686a(new RunnableC47052b(this, imageView), 200);
        }
        return imageView;
    }

    public MmTabMoreButton(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f118413b = context;
    }

    /* renamed from: a */
    public final void mo165271a(ImageView imageView) {
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        Integer num = null;
        if (!(layoutParams instanceof ConstraintLayout.LayoutParams)) {
            layoutParams = null;
        }
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
        StringBuilder sb = new StringBuilder();
        sb.append("lp: ");
        if (layoutParams2 != null) {
            num = Integer.valueOf(layoutParams2.width);
        }
        sb.append(num);
        C45855f.m181663b("MmTabMoreButton", sb.toString());
        if (layoutParams2 != null) {
            layoutParams2.width = C57582a.m223600a(48);
        }
        imageView.setLayoutParams(layoutParams2);
        imageView.setVisibility(0);
    }
}
