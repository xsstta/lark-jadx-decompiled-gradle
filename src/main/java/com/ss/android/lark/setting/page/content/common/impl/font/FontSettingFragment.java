package com.ss.android.lark.setting.page.content.common.impl.font;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager2.widget.ViewPager2;
import com.larksuite.component.ui.display.manager.LKUIDisplayManager;
import com.larksuite.component.ui.display.manager.ZoomLevel;
import com.larksuite.component.universe_design.color.UDColorUtils;
import com.larksuite.component.universe_design.dialog.UDDialogBuilder;
import com.larksuite.suite.R;
import com.ss.android.lark.base.fragment.BaseFragment;
import com.ss.android.lark.setting.C54115c;
import com.ss.android.lark.setting.page.content.common.impl.font.FontSizeSettingView;
import com.ss.android.lark.setting.service.usersetting.appearance.UiModeService;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.ui.CommonTitleBarConstants;
import com.ss.android.lark.ui.IActionTitlebar;
import com.ss.android.lark.utils.UIHelper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u001e2\u00020\u0001:\u0002\u001e\u001fB\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\bJ\b\u0010\r\u001a\u00020\u000bH\u0002J\b\u0010\u000e\u001a\u00020\u000bH\u0002J\b\u0010\u000f\u001a\u00020\u000bH\u0002J&\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u000bH\u0016J\u001a\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u00112\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\u000e\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\bJ\u0010\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u0004H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\tX\u0004¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lcom/ss/android/lark/setting/page/content/common/impl/font/FontSettingFragment;", "Lcom/ss/android/lark/base/fragment/BaseFragment;", "()V", "mCurrentPosition", "", "mSelectedPosition", "observerFragments", "Ljava/util/ArrayList;", "Lcom/ss/android/lark/setting/page/content/common/impl/font/FontSettingFragment$OnFontSettingViewSlideListener;", "Lkotlin/collections/ArrayList;", "addListener", "", "listener", "initFontSizeSettingView", "initTitleBar", "initViewPaper", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "onViewCreated", "view", "removeListener", "updateDot", "position", "Companion", "OnFontSettingViewSlideListener", "core_setting_setting_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.setting.page.content.common.impl.font.a */
public final class FontSettingFragment extends BaseFragment {

    /* renamed from: d */
    public static ZoomLevel f134119d = LKUIDisplayManager.m91870a();

    /* renamed from: e */
    public static final Companion f134120e = new Companion(null);

    /* renamed from: a */
    public final int f134121a;

    /* renamed from: b */
    public int f134122b;

    /* renamed from: c */
    public final ArrayList<OnFontSettingViewSlideListener> f134123c = new ArrayList<>();

    /* renamed from: f */
    private HashMap f134124f;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/setting/page/content/common/impl/font/FontSettingFragment$OnFontSettingViewSlideListener;", "", "onSlideListener", "", "zoomLevel", "Lcom/larksuite/component/ui/display/manager/ZoomLevel;", "core_setting_setting_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.setting.page.content.common.impl.font.a$b */
    public interface OnFontSettingViewSlideListener {
        /* renamed from: a */
        void mo185442a(ZoomLevel zoomLevel);
    }

    /* renamed from: a */
    public void mo185435a() {
        HashMap hashMap = this.f134124f;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    /* renamed from: b */
    public View mo185438b(int i) {
        if (this.f134124f == null) {
            this.f134124f = new HashMap();
        }
        View view = (View) this.f134124f.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f134124f.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.base.fragment.BaseFragment, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo185435a();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/setting/page/content/common/impl/font/FontSettingFragment$Companion;", "", "()V", "currentZoomLevel", "Lcom/larksuite/component/ui/display/manager/ZoomLevel;", "getCurrentZoomLevel", "()Lcom/larksuite/component/ui/display/manager/ZoomLevel;", "setCurrentZoomLevel", "(Lcom/larksuite/component/ui/display/manager/ZoomLevel;)V", "core_setting_setting_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.setting.page.content.common.impl.font.a$a */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: a */
        public final ZoomLevel mo185440a() {
            return FontSettingFragment.f134119d;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo185441a(ZoomLevel zoomLevel) {
            Intrinsics.checkParameterIsNotNull(zoomLevel, "<set-?>");
            FontSettingFragment.f134119d = zoomLevel;
        }
    }

    public FontSettingFragment() {
        int level = LKUIDisplayManager.m91870a().getLevel() + 1;
        this.f134121a = level;
        this.f134122b = level;
    }

    /* renamed from: c */
    private final void m210325c() {
        ((FontSizeSettingView) mo185438b(R.id.slide_font_size_setting)).setDefaultPosition(this.f134121a);
        ((FontSizeSettingView) mo185438b(R.id.slide_font_size_setting)).setChangeCallbackListener(new C54171c(this));
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        m210324b();
        m210325c();
        m210326d();
        f134119d = LKUIDisplayManager.m91870a();
    }

    /* renamed from: b */
    private final void m210324b() {
        ((CommonTitleBar) mo185438b(R.id.titleBar)).setLeftTextOnly(CommonTitleBarConstants.Lark_Legacy_Cancel);
        ((CommonTitleBar) mo185438b(R.id.titleBar)).addAction(new C54172d(this, UIHelper.getString(R.string.Lark_NewSettings_ConfirmButton), R.color.primary_pri_500));
    }

    /* renamed from: d */
    private final void m210326d() {
        ViewPager2 viewPager2 = (ViewPager2) mo185438b(R.id.font_setting_vp);
        if (viewPager2 != null) {
            viewPager2.setAdapter(new FontSettingViewPaperAdapter(this));
            ViewPager2 viewPager22 = (ViewPager2) mo185438b(R.id.font_setting_vp);
            if (viewPager22 != null) {
                viewPager22.registerOnPageChangeCallback(new C54175e(this));
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type androidx.viewpager2.widget.ViewPager2");
        }
        throw new TypeCastException("null cannot be cast to non-null type androidx.viewpager2.widget.ViewPager2");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/setting/page/content/common/impl/font/FontSettingFragment$initFontSizeSettingView$1", "Lcom/ss/android/lark/setting/page/content/common/impl/font/FontSizeSettingView$OnProgressChangeListener;", "onChangeListener", "", "position", "", "core_setting_setting_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.setting.page.content.common.impl.font.a$c */
    public static final class C54171c implements FontSizeSettingView.OnProgressChangeListener {

        /* renamed from: a */
        final /* synthetic */ FontSettingFragment f134125a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C54171c(FontSettingFragment aVar) {
            this.f134125a = aVar;
        }

        @Override // com.ss.android.lark.setting.page.content.common.impl.font.FontSizeSettingView.OnProgressChangeListener
        /* renamed from: a */
        public void mo185434a(int i) {
            this.f134125a.f134122b = i;
            ZoomLevel[] values = ZoomLevel.values();
            for (ZoomLevel zoomLevel : values) {
                if (i - 1 == zoomLevel.getLevel()) {
                    FontSettingFragment.f134120e.mo185441a(zoomLevel);
                    Iterator<T> it = this.f134125a.f134123c.iterator();
                    while (it.hasNext()) {
                        it.next().mo185442a(zoomLevel);
                    }
                }
            }
            FontSizeSettingHitPoint.f134143a.mo185456a(i);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/setting/page/content/common/impl/font/FontSettingFragment$initViewPaper$1", "Landroidx/viewpager2/widget/ViewPager2$OnPageChangeCallback;", "onPageSelected", "", "position", "", "core_setting_setting_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.setting.page.content.common.impl.font.a$e */
    public static final class C54175e extends ViewPager2.AbstractC1603e {

        /* renamed from: a */
        final /* synthetic */ FontSettingFragment f134129a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C54175e(FontSettingFragment aVar) {
            this.f134129a = aVar;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC1603e
        public void onPageSelected(int i) {
            this.f134129a.mo185436a(i);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016J\u0018\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\u000b"}, d2 = {"com/ss/android/lark/setting/page/content/common/impl/font/FontSettingFragment$onViewCreated$1", "Landroidx/fragment/app/FragmentManager$FragmentLifecycleCallbacks;", "onFragmentActivityCreated", "", "fm", "Landroidx/fragment/app/FragmentManager;", "fragment", "Landroidx/fragment/app/Fragment;", "savedInstanceState", "Landroid/os/Bundle;", "onFragmentDestroyed", "core_setting_setting_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.setting.page.content.common.impl.font.a$f */
    public static final class C54176f extends FragmentManager.AbstractC1010b {

        /* renamed from: a */
        final /* synthetic */ FontSettingFragment f134130a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C54176f(FontSettingFragment aVar) {
            this.f134130a = aVar;
        }

        @Override // androidx.fragment.app.FragmentManager.AbstractC1010b
        /* renamed from: f */
        public void mo5412f(FragmentManager fragmentManager, Fragment fragment) {
            Intrinsics.checkParameterIsNotNull(fragmentManager, "fm");
            Intrinsics.checkParameterIsNotNull(fragment, "fragment");
            if (fragment instanceof OnFontSettingViewSlideListener) {
                this.f134130a.mo185439b((OnFontSettingViewSlideListener) fragment);
            }
        }

        @Override // androidx.fragment.app.FragmentManager.AbstractC1010b
        /* renamed from: c */
        public void mo5408c(FragmentManager fragmentManager, Fragment fragment, Bundle bundle) {
            Intrinsics.checkParameterIsNotNull(fragmentManager, "fm");
            Intrinsics.checkParameterIsNotNull(fragment, "fragment");
            if (fragment instanceof OnFontSettingViewSlideListener) {
                this.f134130a.mo185437a((OnFontSettingViewSlideListener) fragment);
            }
        }
    }

    /* renamed from: a */
    public final void mo185437a(OnFontSettingViewSlideListener bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "listener");
        this.f134123c.add(bVar);
    }

    /* renamed from: b */
    public final void mo185439b(OnFontSettingViewSlideListener bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "listener");
        this.f134123c.remove(bVar);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/setting/page/content/common/impl/font/FontSettingFragment$initTitleBar$1", "Lcom/ss/android/lark/ui/IActionTitlebar$TextAction;", "performAction", "", "view", "Landroid/view/View;", "core_setting_setting_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.setting.page.content.common.impl.font.a$d */
    public static final class C54172d extends IActionTitlebar.TextAction {

        /* renamed from: a */
        final /* synthetic */ FontSettingFragment f134126a;

        @Override // com.ss.android.lark.ui.IActionTitlebar.Action, com.ss.android.lark.ui.IActionTitlebar.BaseAction
        public void performAction(View view) {
            FontSizeSettingHitPoint.f134143a.mo185460d();
            if (this.f134126a.f134121a == this.f134126a.f134122b) {
                this.f134126a.finish();
            }
            Context context = this.f134126a.mContext;
            Intrinsics.checkExpressionValueIsNotNull(context, "mContext");
            ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) new UDDialogBuilder(context).title(R.string.Lark_NewSettings_RestartDialog)).message(R.string.Lark_NewSettings_RestartToTakeEffectTextSize)).addActionButton(R.id.ud_dialog_btn_secondary, R.string.Lark_Legacy_Cancel, DialogInterface$OnClickListenerC54173a.f134127a)).addActionButton(R.id.ud_dialog_btn_primary, R.string.Lark_Legacy_LarkRestart, new DialogInterface$OnClickListenerC54174b(this))).show();
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.setting.page.content.common.impl.font.a$d$a */
        static final class DialogInterface$OnClickListenerC54173a implements DialogInterface.OnClickListener {

            /* renamed from: a */
            public static final DialogInterface$OnClickListenerC54173a f134127a = new DialogInterface$OnClickListenerC54173a();

            DialogInterface$OnClickListenerC54173a() {
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
                FontSizeSettingHitPoint.f134143a.mo185457a("cancel");
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.setting.page.content.common.impl.font.a$d$b */
        static final class DialogInterface$OnClickListenerC54174b implements DialogInterface.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ C54172d f134128a;

            DialogInterface$OnClickListenerC54174b(C54172d dVar) {
                this.f134128a = dVar;
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
                ZoomLevel[] values = ZoomLevel.values();
                for (ZoomLevel zoomLevel : values) {
                    if (this.f134128a.f134126a.f134122b - 1 == zoomLevel.getLevel()) {
                        LKUIDisplayManager.m91872a(zoomLevel);
                    }
                }
                FontSizeSettingHitPoint.f134143a.mo185457a("restart");
                C54115c.m210080a().mo178295g().mo178363a(this.f134128a.f134126a.mContext);
                UiModeService dVar = UiModeService.f135042b;
                Context context = this.f134128a.f134126a.mContext;
                Intrinsics.checkExpressionValueIsNotNull(context, "mContext");
                dVar.mo186691a(context, true);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C54172d(FontSettingFragment aVar, String str, int i) {
            super(str, i);
            this.f134126a = aVar;
        }
    }

    /* renamed from: a */
    public final void mo185436a(int i) {
        if (i == 0) {
            ImageView imageView = (ImageView) mo185438b(R.id.dot_left);
            Intrinsics.checkExpressionValueIsNotNull(imageView, "dot_left");
            Context requireContext = requireContext();
            Intrinsics.checkExpressionValueIsNotNull(requireContext, "requireContext()");
            imageView.setImageTintList(UDColorUtils.getColorStateList(requireContext, R.color.primary_pri_400));
            ImageView imageView2 = (ImageView) mo185438b(R.id.dot_right);
            Intrinsics.checkExpressionValueIsNotNull(imageView2, "dot_right");
            Context requireContext2 = requireContext();
            Intrinsics.checkExpressionValueIsNotNull(requireContext2, "requireContext()");
            imageView2.setImageTintList(UDColorUtils.getColorStateList(requireContext2, R.color.text_placeholder));
        } else if (i == 1) {
            ImageView imageView3 = (ImageView) mo185438b(R.id.dot_left);
            Intrinsics.checkExpressionValueIsNotNull(imageView3, "dot_left");
            Context requireContext3 = requireContext();
            Intrinsics.checkExpressionValueIsNotNull(requireContext3, "requireContext()");
            imageView3.setImageTintList(UDColorUtils.getColorStateList(requireContext3, R.color.text_placeholder));
            ImageView imageView4 = (ImageView) mo185438b(R.id.dot_right);
            Intrinsics.checkExpressionValueIsNotNull(imageView4, "dot_right");
            Context requireContext4 = requireContext();
            Intrinsics.checkExpressionValueIsNotNull(requireContext4, "requireContext()");
            imageView4.setImageTintList(UDColorUtils.getColorStateList(requireContext4, R.color.primary_pri_400));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.onViewCreated(view, bundle);
        getChildFragmentManager().registerFragmentLifecycleCallbacks(new C54176f(this), true);
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.activity_font_setting, viewGroup, false);
    }
}
