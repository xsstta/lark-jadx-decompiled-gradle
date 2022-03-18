package com.ss.android.lark.setting.page.content.common.impl.translate.mvp;

import android.content.Context;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.setting.page.content.common.dto.LanguageInfo;
import com.ss.android.lark.setting.page.content.common.dto.MineTranslateLanguageSetting;
import com.ss.android.lark.setting.page.content.common.impl.translate.mvp.AbstractC54282e;
import com.ss.android.lark.widget.dialog.loadingdialog.LoadingDialog;
import com.ss.android.vc.meeting.framework.statemachine.SmEvents;
import java.util.List;

/* renamed from: com.ss.android.lark.setting.page.content.common.impl.translate.mvp.c */
public class C54279c implements AbstractC54282e.AbstractC54285b {

    /* renamed from: b */
    protected Context f134349b;

    /* renamed from: c */
    public AbstractC54280a f134350c;

    /* renamed from: d */
    public AbstractC54282e.AbstractC54285b.AbstractC54286a f134351d;

    /* renamed from: e */
    protected LoadingDialog f134352e;

    /* renamed from: com.ss.android.lark.setting.page.content.common.impl.translate.mvp.c$a */
    public static abstract class AbstractC54280a {
        /* renamed from: a */
        public void mo185591a() {
        }

        /* renamed from: a */
        public void mo185592a(C54279c cVar) {
        }

        /* renamed from: b */
        public void mo185789b() {
        }

        /* renamed from: c */
        public void mo185790c() {
        }

        /* renamed from: d */
        public void mo185791d() {
        }
    }

    @Override // com.ss.android.lark.setting.page.content.common.impl.translate.mvp.AbstractC54282e.AbstractC54285b
    /* renamed from: a */
    public void mo185767a(int i) {
    }

    @Override // com.ss.android.lark.setting.page.content.common.impl.translate.mvp.AbstractC54282e.AbstractC54285b
    /* renamed from: a */
    public void mo185766a(int i, List<LanguageInfo> list) {
    }

    @Override // com.ss.android.lark.setting.page.content.common.impl.translate.mvp.AbstractC54282e.AbstractC54285b
    /* renamed from: a */
    public void mo185778a(MineTranslateLanguageSetting mineTranslateLanguageSetting) {
    }

    @Override // com.ss.android.lark.setting.page.content.common.impl.translate.mvp.AbstractC54282e.AbstractC54285b
    /* renamed from: a */
    public void mo185768a(String str) {
    }

    @Override // com.ss.android.lark.setting.page.content.common.impl.translate.mvp.AbstractC54282e.AbstractC54285b
    /* renamed from: a */
    public void mo185764a(List<LanguageInfo> list) {
    }

    @Override // com.ss.android.lark.setting.page.content.common.impl.translate.mvp.AbstractC54282e.AbstractC54285b
    /* renamed from: a */
    public void mo185765a(boolean z) {
    }

    @Override // com.ss.android.lark.setting.page.content.common.impl.translate.mvp.AbstractC54282e.AbstractC54285b
    /* renamed from: b */
    public void mo185781b(int i) {
    }

    @Override // com.ss.android.lark.setting.page.content.common.impl.translate.mvp.AbstractC54282e.AbstractC54285b
    /* renamed from: b */
    public void mo185782b(List<LanguageInfo> list) {
    }

    @Override // com.ss.android.lark.setting.page.content.common.impl.translate.mvp.AbstractC54282e.AbstractC54285b
    /* renamed from: c */
    public void mo185785c(int i) {
    }

    @Override // com.ss.android.lark.setting.page.content.common.impl.translate.mvp.AbstractC54282e.AbstractC54285b
    /* renamed from: c */
    public void mo185769c(boolean z) {
    }

    @Override // com.ss.android.lark.setting.page.content.common.impl.translate.mvp.AbstractC54282e.AbstractC54285b
    /* renamed from: d */
    public void mo185786d() {
        mo185787e();
    }

    @Override // com.ss.android.lark.setting.page.content.common.impl.translate.mvp.AbstractC54282e.AbstractC54285b
    /* renamed from: a */
    public void mo185763a() {
        AbstractC54280a aVar = this.f134350c;
        if (aVar != null) {
            aVar.mo185591a();
        }
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        this.f134350c = null;
        this.f134351d = null;
    }

    @Override // com.ss.android.lark.setting.page.content.common.impl.translate.mvp.AbstractC54282e.AbstractC54285b
    /* renamed from: b */
    public void mo185780b() {
        if (!this.f134352e.mo197790b()) {
            this.f134352e.mo197780a();
        }
    }

    @Override // com.ss.android.lark.setting.page.content.common.impl.translate.mvp.AbstractC54282e.AbstractC54285b
    /* renamed from: c */
    public void mo185784c() {
        if (this.f134352e.mo197790b()) {
            this.f134352e.mo197792c();
        }
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        this.f134350c.mo185592a(this);
        mo186000g();
    }

    @Override // com.ss.android.lark.setting.page.content.common.impl.translate.mvp.AbstractC54282e.AbstractC54285b
    /* renamed from: e */
    public void mo185787e() {
        LKUIToast.show(this.f134349b, (int) R.string.Lark_Legacy_MineSettingTranslateError);
    }

    @Override // com.ss.android.lark.setting.page.content.common.impl.translate.mvp.AbstractC54282e.AbstractC54285b
    /* renamed from: f */
    public void mo185788f() {
        LKUIToast.show(this.f134349b, (int) R.string.Lark_Legacy_MineMessageSettingSetupFailed);
    }

    /* renamed from: g */
    private void mo186000g() {
        this.f134352e = LoadingDialog.m226492a(this.f134349b).mo197784a(LoadingDialog.Style.SPIN_INDETERMINATE).mo197789b(28, 28).mo197785a(this.f134349b.getString(R.string.Lark_Legacy_LanguageChangeLoadingTip)).mo197791c(14.0f).mo197783a(SmEvents.EVENT_NW, SmEvents.EVENT_NW).mo197787b(5.0f).mo197788b(2).mo197782a(UIUtils.getColor(this.f134349b, R.color.loading_dialog_background_color)).mo197781a(BitmapDescriptorFactory.HUE_RED);
    }

    @Override // com.ss.android.lark.setting.page.content.common.impl.translate.mvp.AbstractC54282e.AbstractC54285b
    /* renamed from: b */
    public void mo185783b(boolean z) {
        if (z) {
            LKUIToast.show(this.f134349b, (int) R.drawable.saving_pictures, (int) R.string.Lark_Legacy_LanguageChangeSucceeded);
        } else {
            LKUIToast.show(this.f134349b, (int) R.string.Lark_Legacy_MineMessageSettingSetupFailed);
        }
    }

    /* renamed from: a */
    public void setViewDelegate(AbstractC54282e.AbstractC54285b.AbstractC54286a aVar) {
        this.f134351d = aVar;
    }

    public C54279c(Context context, AbstractC54280a aVar) {
        this.f134349b = context;
        this.f134350c = aVar;
    }
}
