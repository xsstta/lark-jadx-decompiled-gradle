package com.ss.android.lark.mail.impl.settings.component.settingitem;

import android.content.Context;
import android.view.View;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import com.larksuite.suite.R;
import com.ss.android.lark.mail.impl.entity.ReplyLanguage;
import com.ss.android.lark.mail.impl.p2195i.C42699a;
import com.ss.android.lark.mail.impl.settings.component.settingitem.AbsSettingItemViewModel;
import com.ss.android.lark.mail.impl.settings.component.settingitem.ISettingItemModel;
import com.ss.android.lark.mail.impl.utils.C43819s;
import com.ss.android.lark.utils.UIHelper;

/* renamed from: com.ss.android.lark.mail.impl.settings.component.settingitem.i */
public class C43426i extends AbsSettingItemViewModel {

    /* renamed from: p */
    protected LiveData<Integer> f110337p;

    /* renamed from: q */
    protected AbstractC1178x f110338q;

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mail.impl.settings.component.settingitem.AbsSettingItemViewModel
    /* renamed from: a */
    public String mo155202a(boolean z) {
        return null;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mail.impl.settings.component.settingitem.AbsSettingItemViewModel
    /* renamed from: e */
    public String mo155213e() {
        return "";
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mail.impl.settings.component.settingitem.AbsSettingItemViewModel
    /* renamed from: b */
    public ISettingItemModel.Function mo155208b() {
        return ISettingItemModel.Function.FUNC_REPLY_LANGUAGE_SWITCH;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mail.impl.settings.component.settingitem.AbsSettingItemViewModel
    /* renamed from: c */
    public AbsSettingItemViewModel.ActionType mo155210c() {
        return AbsSettingItemViewModel.ActionType.Arrow;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mail.impl.settings.component.settingitem.AbsSettingItemViewModel
    /* renamed from: d */
    public String mo155212d() {
        return C43819s.m173684a((int) R.string.Mail_Setting_SubjectPrefix);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.mail.impl.settings.component.settingitem.i$2 */
    public static /* synthetic */ class C434282 {

        /* renamed from: a */
        static final /* synthetic */ int[] f110340a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.ss.android.lark.mail.impl.entity.ReplyLanguage[] r0 = com.ss.android.lark.mail.impl.entity.ReplyLanguage.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ss.android.lark.mail.impl.settings.component.settingitem.C43426i.C434282.f110340a = r0
                com.ss.android.lark.mail.impl.entity.ReplyLanguage r1 = com.ss.android.lark.mail.impl.entity.ReplyLanguage.US     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.ss.android.lark.mail.impl.settings.component.settingitem.C43426i.C434282.f110340a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.ss.android.lark.mail.impl.entity.ReplyLanguage r1 = com.ss.android.lark.mail.impl.entity.ReplyLanguage.ZH     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.mail.impl.settings.component.settingitem.C43426i.C434282.<clinit>():void");
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mail.impl.settings.component.settingitem.AbsSettingItemViewModel
    /* renamed from: b */
    public void mo155209b(boolean z) {
        super.mo155209b(z);
    }

    @Override // com.ss.android.lark.mail.impl.settings.component.settingitem.AbsSettingItemViewModel
    /* renamed from: a */
    public void mo155204a(Context context) {
        super.mo155204a(context);
        this.f110309a = context;
        this.f110312d = mo155215g();
        if (this.f110337p != null) {
            this.f110338q = new AbstractC1178x<Integer>() {
                /* class com.ss.android.lark.mail.impl.settings.component.settingitem.C43426i.C434271 */

                /* renamed from: a */
                public void onChanged(Integer num) {
                    C43426i.this.mo155231a(num);
                }
            };
            this.f110337p.mo5923a(this.f110310b, this.f110338q);
            return;
        }
        mo155231a((Integer) null);
    }

    /* renamed from: a */
    public void mo155231a(Integer num) {
        int i;
        if (num != null) {
            int i2 = C434282.f110340a[ReplyLanguage.fromValue(num.intValue()).ordinal()];
            if (i2 == 1) {
                i = R.string.Mail_Setting_SubjectPrefixEn;
            } else if (i2 != 2) {
                i = R.string.Mail_Setting_SubjectPrefixAuto;
            } else {
                i = R.string.Mail_Setting_SubjectPrefixCn;
            }
            this.f110320l.setText(UIHelper.getString(i));
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mail.impl.settings.component.settingitem.AbsSettingItemViewModel
    /* renamed from: a */
    public void mo155205a(View view, boolean z) {
        C42699a.m170286g(this.f110309a);
    }

    public C43426i(LifecycleOwner lifecycleOwner, ISettingItemModel iSettingItemModel) {
        super(lifecycleOwner, iSettingItemModel);
        if (iSettingItemModel != null) {
            this.f110337p = iSettingItemModel.aP_().mo155060z();
        }
    }
}
