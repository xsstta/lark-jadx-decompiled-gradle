package com.ss.android.lark.mm.module.share.setting;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import com.larksuite.suite.R;
import com.ss.android.lark.mm.module.share.model.LinkShare;
import com.ss.android.lark.mm.statistics.hitpoint.C47083e;
import com.ss.android.lark.mm.statistics.hitpoint.C47086i;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nB)\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0002\u0010\fJm\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132K\u0010\u0014\u001aG\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0018\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0019\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u001a\u0012\u0004\u0012\u00020\u000e0\u0015J\b\u0010\u001b\u001a\u00020\u000eH\u0002¨\u0006\u001c"}, d2 = {"Lcom/ss/android/lark/mm/module/share/setting/SettingPanel;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "bindData", "", "allowLinkShare", "", "allowExternalShare", "linkShare", "Lcom/ss/android/lark/mm/module/share/model/LinkShare;", "onChange", "Lkotlin/Function3;", "Lkotlin/ParameterName;", "name", "isOpen", "isInternal", "isViewOnly", "init", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class SettingPanel extends LinearLayout {

    /* renamed from: a */
    private HashMap f118360a;

    /* renamed from: a */
    public View mo165235a(int i) {
        if (this.f118360a == null) {
            this.f118360a = new HashMap();
        }
        View view = (View) this.f118360a.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f118360a.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: a */
    private final void m186151a() {
        LayoutInflater.from(getContext()).inflate(R.layout.mm_view_share_setting_panel, this);
        setOrientation(1);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.share.setting.SettingPanel$b */
    public static final class C47026b extends Lambda implements Function0<Unit> {
        final /* synthetic */ Function3 $onChange;
        final /* synthetic */ SettingPanel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47026b(SettingPanel settingPanel, Function3 oVar) {
            super(0);
            this.this$0 = settingPanel;
            this.$onChange = oVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
            Function3 oVar = this.$onChange;
            SettingSwitch settingSwitch = (SettingSwitch) this.this$0.mo165235a(R.id.shareSwitch);
            Intrinsics.checkExpressionValueIsNotNull(settingSwitch, "shareSwitch");
            oVar.invoke(Boolean.valueOf(settingSwitch.isSelected()), Boolean.valueOf(((SettingItem) this.this$0.mo165235a(R.id.shareWho)).mo165232a()), Boolean.valueOf(((SettingItem) this.this$0.mo165235a(R.id.shareWhat)).mo165232a()));
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.share.setting.SettingPanel$c */
    public static final class C47027c extends Lambda implements Function0<Unit> {
        final /* synthetic */ Function3 $onChange;
        final /* synthetic */ SettingPanel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47027c(SettingPanel settingPanel, Function3 oVar) {
            super(0);
            this.this$0 = settingPanel;
            this.$onChange = oVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
            Function3 oVar = this.$onChange;
            SettingSwitch settingSwitch = (SettingSwitch) this.this$0.mo165235a(R.id.shareSwitch);
            Intrinsics.checkExpressionValueIsNotNull(settingSwitch, "shareSwitch");
            oVar.invoke(Boolean.valueOf(settingSwitch.isSelected()), Boolean.valueOf(((SettingItem) this.this$0.mo165235a(R.id.shareWho)).mo165232a()), Boolean.valueOf(((SettingItem) this.this$0.mo165235a(R.id.shareWhat)).mo165232a()));
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.share.setting.SettingPanel$a */
    public static final class C47025a extends Lambda implements Function0<Unit> {
        final /* synthetic */ Function3 $onChange;
        final /* synthetic */ SettingPanel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47025a(SettingPanel settingPanel, Function3 oVar) {
            super(0);
            this.this$0 = settingPanel;
            this.$onChange = oVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
            int i;
            Context context = this.this$0.getContext();
            C47086i e = C47086i.m186432a().mo165422d("link_share").mo165423e("none");
            SettingSwitch settingSwitch = (SettingSwitch) this.this$0.mo165235a(R.id.shareSwitch);
            Intrinsics.checkExpressionValueIsNotNull(settingSwitch, "shareSwitch");
            C47083e.m186423a(context, "vc_minutes_share_click", e.mo165425g(String.valueOf(settingSwitch.isSelected())).mo165421c());
            Function3 oVar = this.$onChange;
            SettingSwitch settingSwitch2 = (SettingSwitch) this.this$0.mo165235a(R.id.shareSwitch);
            Intrinsics.checkExpressionValueIsNotNull(settingSwitch2, "shareSwitch");
            oVar.invoke(Boolean.valueOf(settingSwitch2.isSelected()), Boolean.valueOf(((SettingItem) this.this$0.mo165235a(R.id.shareWho)).mo165232a()), Boolean.valueOf(((SettingItem) this.this$0.mo165235a(R.id.shareWhat)).mo165232a()));
            SettingItem settingItem = (SettingItem) this.this$0.mo165235a(R.id.shareWho);
            Intrinsics.checkExpressionValueIsNotNull(settingItem, "shareWho");
            SettingSwitch settingSwitch3 = (SettingSwitch) this.this$0.mo165235a(R.id.shareSwitch);
            Intrinsics.checkExpressionValueIsNotNull(settingSwitch3, "shareSwitch");
            int i2 = 0;
            if (settingSwitch3.isSelected()) {
                i = 0;
            } else {
                i = 8;
            }
            settingItem.setVisibility(i);
            SettingItem settingItem2 = (SettingItem) this.this$0.mo165235a(R.id.shareWhat);
            Intrinsics.checkExpressionValueIsNotNull(settingItem2, "shareWhat");
            SettingSwitch settingSwitch4 = (SettingSwitch) this.this$0.mo165235a(R.id.shareSwitch);
            Intrinsics.checkExpressionValueIsNotNull(settingSwitch4, "shareSwitch");
            if (!settingSwitch4.isSelected()) {
                i2 = 8;
            }
            settingItem2.setVisibility(i2);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public SettingPanel(Context context) {
        this(context, null);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public SettingPanel(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public SettingPanel(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SettingPanel(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Intrinsics.checkParameterIsNotNull(context, "context");
        m186151a();
    }

    /* renamed from: a */
    public final void mo165236a(boolean z, boolean z2, LinkShare linkShare, Function3<? super Boolean, ? super Boolean, ? super Boolean, Unit> oVar) {
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        int i;
        boolean z7;
        Boolean isOpen;
        Boolean canModify;
        Intrinsics.checkParameterIsNotNull(oVar, "onChange");
        int i2 = 0;
        if (linkShare == null || (canModify = linkShare.getCanModify()) == null) {
            z3 = false;
        } else {
            z3 = canModify.booleanValue();
        }
        if (linkShare == null || (isOpen = linkShare.isOpen()) == null) {
            z4 = false;
        } else {
            z4 = isOpen.booleanValue();
        }
        if (linkShare != null) {
            z5 = linkShare.isInternal();
        } else {
            z5 = true;
        }
        if (linkShare != null) {
            z6 = linkShare.canEdit();
        } else {
            z6 = false;
        }
        boolean z8 = !z6;
        ((SettingSwitch) mo165235a(R.id.shareSwitch)).mo165238a(z, z3, z4, z5, z8, new C47025a(this, oVar));
        SettingItem settingItem = (SettingItem) mo165235a(R.id.shareWho);
        Intrinsics.checkExpressionValueIsNotNull(settingItem, "shareWho");
        if (!z || !z3 || !z4) {
            i = 8;
        } else {
            i = 0;
        }
        settingItem.setVisibility(i);
        SettingItem settingItem2 = (SettingItem) mo165235a(R.id.shareWho);
        if (!z2 || z5) {
            z7 = true;
        } else {
            z7 = false;
        }
        settingItem2.mo165231a(z7, z2, new C47026b(this, oVar));
        SettingItem settingItem3 = (SettingItem) mo165235a(R.id.shareWhat);
        Intrinsics.checkExpressionValueIsNotNull(settingItem3, "shareWhat");
        if (!z || !z3 || !z4) {
            i2 = 8;
        }
        settingItem3.setVisibility(i2);
        ((SettingItem) mo165235a(R.id.shareWhat)).mo165231a(z8, true, (Function0<Unit>) new C47027c(this, oVar));
    }
}
