package com.ss.android.lark.setting.page.content.common.impl.display;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.larksuite.component.universe_design.checkbox.UDCheckBox;
import com.larksuite.component.universe_design.dialog.UDListDialogController;
import com.larksuite.component.universe_design.dialog.actionpanel.UDActionPanelBuilder;
import com.larksuite.suite.R;
import com.ss.android.lark.base.fragment.BaseFragment;
import com.ss.android.lark.setting.C54115c;
import com.ss.android.lark.setting.service.usersetting.appearance.UiModeService;
import com.ss.android.lark.ui.p2892a.C57582a;
import com.ss.android.lark.utils.UIHelper;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0002J\b\u0010\b\u001a\u00020\u0006H\u0002J&\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\u0010\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0004H\u0002J\b\u0010\u0013\u001a\u00020\u0006H\u0016J\u0010\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0004H\u0002J\f\u0010\u0016\u001a\u00020\u0004*\u00020\u0004H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/ss/android/lark/setting/page/content/common/impl/display/DisplayAppearanceSettingFragment;", "Lcom/ss/android/lark/base/fragment/BaseFragment;", "()V", "currentNightMode", "", "initChecked", "", "initView", "initVisibility", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onModeChangeAreaClicked", "mode", "onResume", "sendUserClickModeHitPoint", "clickMode", "dp", "Companion", "core_setting_setting_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.setting.page.content.common.impl.display.a */
public final class DisplayAppearanceSettingFragment extends BaseFragment {

    /* renamed from: a */
    public static final Companion f134076a = new Companion(null);

    /* renamed from: b */
    private int f134077b;

    /* renamed from: c */
    private HashMap f134078c;

    /* renamed from: a */
    public void mo185415a() {
        HashMap hashMap = this.f134078c;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    /* renamed from: c */
    public View mo185418c(int i) {
        if (this.f134078c == null) {
            this.f134078c = new HashMap();
        }
        View view = (View) this.f134078c.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f134078c.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.base.fragment.BaseFragment, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo185415a();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/setting/page/content/common/impl/display/DisplayAppearanceSettingFragment$Companion;", "", "()V", "IMAGE_WIDTH", "", "core_setting_setting_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.setting.page.content.common.impl.display.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        this.f134077b = UiModeService.f135042b.mo186697d();
        m210301b();
        m210302c();
        m210304d();
    }

    /* renamed from: b */
    private final void m210301b() {
        int i;
        int i2;
        int windowWidth = UIHelper.getWindowWidth(getContext());
        boolean b = UiModeService.f135042b.mo186694b();
        int d = m210303d(64);
        if (b) {
            i = d * 3;
        } else {
            i = d * 2;
        }
        int i3 = windowWidth - i;
        if (b) {
            i2 = i3 / 4;
        } else {
            i2 = i3 / 3;
        }
        int i4 = d + i2;
        TextView textView = (TextView) mo185418c(R.id.follow_system_tip);
        Intrinsics.checkExpressionValueIsNotNull(textView, "follow_system_tip");
        textView.setMaxWidth(i4);
        View c = mo185418c(R.id.follow_system_area);
        Intrinsics.checkExpressionValueIsNotNull(c, "follow_system_area");
        ViewGroup.LayoutParams layoutParams = c.getLayoutParams();
        layoutParams.width = i4;
        View c2 = mo185418c(R.id.follow_system_area);
        Intrinsics.checkExpressionValueIsNotNull(c2, "follow_system_area");
        c2.setLayoutParams(layoutParams);
        TextView textView2 = (TextView) mo185418c(R.id.night_tip);
        Intrinsics.checkExpressionValueIsNotNull(textView2, "night_tip");
        textView2.setMaxWidth(i4);
        View c3 = mo185418c(R.id.night_area);
        Intrinsics.checkExpressionValueIsNotNull(c3, "night_area");
        ViewGroup.LayoutParams layoutParams2 = c3.getLayoutParams();
        layoutParams2.width = i4;
        View c4 = mo185418c(R.id.night_area);
        Intrinsics.checkExpressionValueIsNotNull(c4, "night_area");
        c4.setLayoutParams(layoutParams2);
        TextView textView3 = (TextView) mo185418c(R.id.light_tip);
        Intrinsics.checkExpressionValueIsNotNull(textView3, "light_tip");
        textView3.setMaxWidth(i4);
        View c5 = mo185418c(R.id.light_area);
        Intrinsics.checkExpressionValueIsNotNull(c5, "light_area");
        ViewGroup.LayoutParams layoutParams3 = c5.getLayoutParams();
        layoutParams3.width = i4;
        View c6 = mo185418c(R.id.light_area);
        Intrinsics.checkExpressionValueIsNotNull(c6, "light_area");
        c6.setLayoutParams(layoutParams3);
        mo185418c(R.id.follow_system_area).setOnClickListener(new View$OnClickListenerC54167b(this));
        mo185418c(R.id.night_area).setOnClickListener(new View$OnClickListenerC54168c(this));
        mo185418c(R.id.light_area).setOnClickListener(new View$OnClickListenerC54169d(this));
    }

    /* renamed from: c */
    private final void m210302c() {
        if (UiModeService.f135042b.mo186694b()) {
            ImageView imageView = (ImageView) mo185418c(R.id.follow_system_image);
            Intrinsics.checkExpressionValueIsNotNull(imageView, "follow_system_image");
            imageView.setVisibility(0);
            TextView textView = (TextView) mo185418c(R.id.follow_system_tip);
            Intrinsics.checkExpressionValueIsNotNull(textView, "follow_system_tip");
            textView.setVisibility(0);
            UDCheckBox uDCheckBox = (UDCheckBox) mo185418c(R.id.follow_system_radio);
            Intrinsics.checkExpressionValueIsNotNull(uDCheckBox, "follow_system_radio");
            uDCheckBox.setVisibility(0);
            View c = mo185418c(R.id.follow_system_area);
            Intrinsics.checkExpressionValueIsNotNull(c, "follow_system_area");
            c.setVisibility(0);
        } else {
            ImageView imageView2 = (ImageView) mo185418c(R.id.follow_system_image);
            Intrinsics.checkExpressionValueIsNotNull(imageView2, "follow_system_image");
            imageView2.setVisibility(8);
            TextView textView2 = (TextView) mo185418c(R.id.follow_system_tip);
            Intrinsics.checkExpressionValueIsNotNull(textView2, "follow_system_tip");
            textView2.setVisibility(8);
            UDCheckBox uDCheckBox2 = (UDCheckBox) mo185418c(R.id.follow_system_radio);
            Intrinsics.checkExpressionValueIsNotNull(uDCheckBox2, "follow_system_radio");
            uDCheckBox2.setVisibility(8);
            View c2 = mo185418c(R.id.follow_system_area);
            Intrinsics.checkExpressionValueIsNotNull(c2, "follow_system_area");
            c2.setVisibility(8);
        }
        if (UiModeService.f135042b.mo186697d() == 0) {
            TextView textView3 = (TextView) mo185418c(R.id.display_tip);
            Intrinsics.checkExpressionValueIsNotNull(textView3, "display_tip");
            textView3.setVisibility(0);
            return;
        }
        TextView textView4 = (TextView) mo185418c(R.id.display_tip);
        Intrinsics.checkExpressionValueIsNotNull(textView4, "display_tip");
        textView4.setVisibility(8);
    }

    /* renamed from: d */
    private final void m210304d() {
        int d = UiModeService.f135042b.mo186697d();
        if (d == 0) {
            UDCheckBox uDCheckBox = (UDCheckBox) mo185418c(R.id.follow_system_radio);
            Intrinsics.checkExpressionValueIsNotNull(uDCheckBox, "follow_system_radio");
            uDCheckBox.setChecked(true);
            UDCheckBox uDCheckBox2 = (UDCheckBox) mo185418c(R.id.light_radio);
            Intrinsics.checkExpressionValueIsNotNull(uDCheckBox2, "light_radio");
            uDCheckBox2.setChecked(false);
            UDCheckBox uDCheckBox3 = (UDCheckBox) mo185418c(R.id.night_radio);
            Intrinsics.checkExpressionValueIsNotNull(uDCheckBox3, "night_radio");
            uDCheckBox3.setChecked(false);
        } else if (d == 1) {
            UDCheckBox uDCheckBox4 = (UDCheckBox) mo185418c(R.id.follow_system_radio);
            Intrinsics.checkExpressionValueIsNotNull(uDCheckBox4, "follow_system_radio");
            uDCheckBox4.setChecked(false);
            UDCheckBox uDCheckBox5 = (UDCheckBox) mo185418c(R.id.light_radio);
            Intrinsics.checkExpressionValueIsNotNull(uDCheckBox5, "light_radio");
            uDCheckBox5.setChecked(false);
            UDCheckBox uDCheckBox6 = (UDCheckBox) mo185418c(R.id.night_radio);
            Intrinsics.checkExpressionValueIsNotNull(uDCheckBox6, "night_radio");
            uDCheckBox6.setChecked(true);
        } else if (d == 2) {
            UDCheckBox uDCheckBox7 = (UDCheckBox) mo185418c(R.id.follow_system_radio);
            Intrinsics.checkExpressionValueIsNotNull(uDCheckBox7, "follow_system_radio");
            uDCheckBox7.setChecked(false);
            UDCheckBox uDCheckBox8 = (UDCheckBox) mo185418c(R.id.light_radio);
            Intrinsics.checkExpressionValueIsNotNull(uDCheckBox8, "light_radio");
            uDCheckBox8.setChecked(true);
            UDCheckBox uDCheckBox9 = (UDCheckBox) mo185418c(R.id.night_radio);
            Intrinsics.checkExpressionValueIsNotNull(uDCheckBox9, "night_radio");
            uDCheckBox9.setChecked(false);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.setting.page.content.common.impl.display.a$b */
    public static final class View$OnClickListenerC54167b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ DisplayAppearanceSettingFragment f134079a;

        View$OnClickListenerC54167b(DisplayAppearanceSettingFragment aVar) {
            this.f134079a = aVar;
        }

        public final void onClick(View view) {
            this.f134079a.mo185416a(0);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.setting.page.content.common.impl.display.a$c */
    public static final class View$OnClickListenerC54168c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ DisplayAppearanceSettingFragment f134080a;

        View$OnClickListenerC54168c(DisplayAppearanceSettingFragment aVar) {
            this.f134080a = aVar;
        }

        public final void onClick(View view) {
            this.f134080a.mo185416a(1);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.setting.page.content.common.impl.display.a$d */
    public static final class View$OnClickListenerC54169d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ DisplayAppearanceSettingFragment f134081a;

        View$OnClickListenerC54169d(DisplayAppearanceSettingFragment aVar) {
            this.f134081a = aVar;
        }

        public final void onClick(View view) {
            this.f134081a.mo185416a(2);
        }
    }

    /* renamed from: d */
    private final int m210303d(int i) {
        return UIHelper.dp2px((float) i);
    }

    /* renamed from: b */
    public final void mo185417b(int i) {
        Context context;
        if (this.f134077b != i && (context = getContext()) != null) {
            Intrinsics.checkExpressionValueIsNotNull(context, "context ?: return");
            UiModeService.f135042b.mo186700e(context);
            UiModeService.f135042b.mo186688a(this.f134077b);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/setting/page/content/common/impl/display/DisplayAppearanceSettingFragment$onModeChangeAreaClicked$1", "Lcom/larksuite/component/universe_design/dialog/UDListDialogController$OnItemClickListener;", "onItemClick", "", "index", "", "core_setting_setting_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.setting.page.content.common.impl.display.a$e */
    public static final class C54170e implements UDListDialogController.OnItemClickListener {

        /* renamed from: a */
        final /* synthetic */ DisplayAppearanceSettingFragment f134082a;

        /* renamed from: b */
        final /* synthetic */ Context f134083b;

        /* renamed from: c */
        final /* synthetic */ int f134084c;

        @Override // com.larksuite.component.universe_design.dialog.UDListDialogController.OnItemClickListener
        public void onItemClick(int i) {
            UiModeService.f135042b.mo186690a(this.f134083b, this.f134084c);
            this.f134082a.mo185417b(this.f134084c);
            C54115c.m210080a().mo178295g().mo178363a(this.f134082a.mContext);
            UiModeService.f135042b.mo186691a(this.f134083b, true);
        }

        C54170e(DisplayAppearanceSettingFragment aVar, Context context, int i) {
            this.f134082a = aVar;
            this.f134083b = context;
            this.f134084c = i;
        }
    }

    /* renamed from: a */
    public final void mo185416a(int i) {
        Context context;
        if (i != this.f134077b && (context = getContext()) != null) {
            Intrinsics.checkExpressionValueIsNotNull(context, "context ?: return");
            ((UDActionPanelBuilder) ((UDActionPanelBuilder) ((UDActionPanelBuilder) ((UDActionPanelBuilder) ((UDActionPanelBuilder) new UDActionPanelBuilder(context).title(R.string.Lark_Settings_DisplaySwitchRestartNotice)).mo90876c(R.color.function_danger_500)).mo90870a(CollectionsKt.listOf(C57582a.m223604a(context, (int) R.string.Lark_Settings_DispalySwitchButton)))).mo90869a(new C54170e(this, context, i))).addActionButton(R.id.ud_dialog_btn_cancel, R.string.Lark_Settings_DisplayCancelButton, (DialogInterface.OnClickListener) null)).show();
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.activity_display_appearance_setting, viewGroup, false);
    }
}
