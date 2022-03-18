package com.ss.android.lark.search.impl.func.pick.chatterpick.mvp;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.FragmentManager;
import butterknife.BindView;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.framework.utils.KeyboardUtils;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.search.impl.func.pick.chatterpick.mvp.AbstractC53672a;
import com.ss.android.lark.search.impl.func.pick.p2623a.C53634b;
import com.ss.android.lark.search.impl.func.pick.viewdata.BasePickViewData;
import com.ss.android.lark.search.impl.func.pick.viewdata.PickChatterViewData;
import com.ss.android.lark.search.widget.BasePicker;
import com.ss.android.lark.search.widget.ChatterPicker;
import com.ss.android.lark.search.widget.constants.PickerUseCategory;
import com.ss.android.lark.search.widget.constants.PickerUsePage;
import com.ss.android.lark.search.widget.params.ChatterPickerParams;
import com.ss.android.lark.searchcommon.dto.info.SearchBaseInfo;
import com.ss.android.lark.searchcommon.dto.info.SearchChatterInfo;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.ui.CommonTitleBarConstants;
import com.ss.android.lark.ui.IActionTitlebar;
import com.ss.android.lark.utils.UIHelper;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Collections;
import java.util.List;

public class PickChatterView implements AbstractC53672a.AbstractC53674b {

    /* renamed from: a */
    public AbstractC53671a f132452a;

    /* renamed from: b */
    public AbstractC53672a.AbstractC53674b.AbstractC53675a f132453b;

    /* renamed from: c */
    public int f132454c;

    /* renamed from: d */
    boolean f132455d;

    /* renamed from: e */
    private TextView f132456e;

    /* renamed from: f */
    private Context f132457f;
    @BindView(6737)
    ChatterPicker mChatterPicker;
    @BindView(7825)
    CommonTitleBar mTitleBar;

    @Retention(RetentionPolicy.SOURCE)
    public @interface PickType {
    }

    /* renamed from: com.ss.android.lark.search.impl.func.pick.chatterpick.mvp.PickChatterView$a */
    public interface AbstractC53671a {
        /* renamed from: a */
        void mo183001a();

        /* renamed from: a */
        void mo183002a(PickChatterView pickChatterView);

        /* renamed from: a */
        void mo183003a(List<PickChatterViewData> list);

        /* renamed from: b */
        FragmentManager mo183004b();

        /* renamed from: c */
        Activity mo183005c();
    }

    public static /* synthetic */ ChatterPickerParams lambda$RGdCokcImlYAhJNWw9SKaVJ5nJ0() {
        return m207756i();
    }

    /* renamed from: d */
    private void m207751d() {
        m207752e();
        m207753f();
    }

    /* renamed from: g */
    private void m207754g() {
        mo183013b(true);
    }

    /* renamed from: h */
    private void m207755h() {
        mo183013b(false);
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        this.f132452a.mo183002a(this);
        m207751d();
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        this.f132452a = null;
        this.f132453b = null;
        this.mChatterPicker.mo183601l();
    }

    @Override // com.ss.android.lark.search.impl.func.pick.chatterpick.mvp.AbstractC53672a.AbstractC53674b
    /* renamed from: a */
    public void mo183008a() {
        int i = (this.f132454c + 1) % 2;
        this.f132454c = i;
        if (i == 1) {
            m207754g();
        } else {
            m207755h();
        }
    }

    @Override // com.ss.android.lark.search.impl.func.pick.chatterpick.mvp.AbstractC53672a.AbstractC53674b
    /* renamed from: b */
    public boolean mo183014b() {
        return DesktopUtil.m144301a(this.f132457f);
    }

    @Override // com.ss.android.lark.search.impl.func.pick.chatterpick.mvp.AbstractC53672a.AbstractC53674b
    /* renamed from: c */
    public boolean mo183016c() {
        if (!this.mChatterPicker.mo183501f()) {
            return false;
        }
        this.f132452a.mo183001a();
        return true;
    }

    /* renamed from: i */
    private static /* synthetic */ ChatterPickerParams m207756i() {
        return new ChatterPickerParams.Builder().mo183714l(true).mo183716m(false).mo183718n(true).mo183720o(true).mo183722p(false).mo183676h(true).mo183675g();
    }

    /* renamed from: e */
    private void m207752e() {
        this.mTitleBar.setTitle(UIUtils.getString(this.f132457f, R.string.Lark_Legacy_SelectTip));
        this.mTitleBar.setLeftText(CommonTitleBarConstants.Lark_Legacy_Cancel);
        this.mTitleBar.setLeftImageDrawable(null);
        this.mTitleBar.setLeftClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.search.impl.func.pick.chatterpick.mvp.$$Lambda$PickChatterView$gMKMxqY5X3df1TS4413_8xRIX4 */

            public final void onClick(View view) {
                PickChatterView.this.m207750a((PickChatterView) view);
            }
        });
        this.mTitleBar.addAction(new IActionTitlebar.TextAction(UIHelper.getString(R.string.Lark_Legacy_Select)) {
            /* class com.ss.android.lark.search.impl.func.pick.chatterpick.mvp.PickChatterView.C536681 */

            @Override // com.ss.android.lark.ui.IActionTitlebar.Action, com.ss.android.lark.ui.IActionTitlebar.BaseAction
            public void performAction(View view) {
                if (PickChatterView.this.f132453b != null) {
                    PickChatterView.this.f132453b.mo183020a(PickChatterView.this.f132454c);
                }
            }
        });
        TextView rightText = this.mTitleBar.getRightText();
        this.f132456e = rightText;
        rightText.setTextColor(UIUtils.getColor(this.f132457f, R.color.text_title));
    }

    /* renamed from: f */
    private void m207753f() {
        ((ChatterPicker) ((ChatterPicker) ((ChatterPicker) ((ChatterPicker) ((ChatterPicker) ((ChatterPicker) ((ChatterPicker) ((ChatterPicker) this.mChatterPicker.mo183563a(PickerUsePage.SEARCH)).mo183562a(PickerUseCategory.SEARCH)).mo183604p(false)).mo183561a($$Lambda$PickChatterView$RGdCokcImlYAhJNWw9SKaVJ5nJ0.INSTANCE)).mo183559a(new BasePicker.IOnPickNotify() {
            /* class com.ss.android.lark.search.impl.func.pick.chatterpick.mvp.PickChatterView.C536703 */

            /* renamed from: a */
            final C53634b f132460a = new C53634b();

            @Override // com.ss.android.lark.search.widget.BasePicker.IOnPickNotify
            /* renamed from: a */
            public void mo110051a(List<String> list, List<SearchBaseInfo> list2) {
            }

            @Override // com.ss.android.lark.search.widget.BasePicker.IOnPickNotify
            /* renamed from: b */
            public void mo110052b(String str, SearchBaseInfo searchBaseInfo) {
                if (PickChatterView.this.f132453b != null) {
                    BasePickViewData a = this.f132460a.mo182942a(searchBaseInfo);
                    if (a instanceof PickChatterViewData) {
                        PickChatterView.this.f132453b.mo183021a((PickChatterViewData) a, false);
                    }
                }
            }

            @Override // com.ss.android.lark.search.widget.BasePicker.IOnPickNotify
            /* renamed from: a */
            public void mo110050a(String str, SearchBaseInfo searchBaseInfo) {
                if (PickChatterView.this.f132453b != null) {
                    BasePickViewData a = this.f132460a.mo182942a(searchBaseInfo);
                    if (!(a instanceof PickChatterViewData)) {
                        return;
                    }
                    if (PickChatterView.this.f132454c == 0) {
                        PickChatterView.this.f132452a.mo183003a(Collections.singletonList((PickChatterViewData) a));
                    } else {
                        PickChatterView.this.f132453b.mo183021a((PickChatterViewData) a, true);
                    }
                }
            }
        })).mo183496d(true)).mo183560a(new BasePicker.IViewDependency() {
            /* class com.ss.android.lark.search.impl.func.pick.chatterpick.mvp.PickChatterView.C536692 */

            @Override // com.ss.android.lark.search.widget.BasePicker.IViewDependency
            /* renamed from: b */
            public Activity mo110056b() {
                return PickChatterView.this.f132452a.mo183005c();
            }

            @Override // com.ss.android.lark.search.widget.BasePicker.IViewDependency
            /* renamed from: c */
            public FragmentManager mo110057c() {
                return PickChatterView.this.f132452a.mo183004b();
            }
        })).mo183624t(true)).mo183483a();
    }

    /* renamed from: a */
    public void setViewDelegate(AbstractC53672a.AbstractC53674b.AbstractC53675a aVar) {
        this.f132453b = aVar;
    }

    @Override // com.ss.android.lark.search.impl.func.pick.chatterpick.mvp.AbstractC53672a.AbstractC53674b
    /* renamed from: a */
    public void mo183011a(boolean z) {
        this.f132454c = z ? 1 : 0;
    }

    @Override // com.ss.android.lark.search.impl.func.pick.chatterpick.mvp.AbstractC53672a.AbstractC53674b
    /* renamed from: b */
    public void mo183012b(List<PickChatterViewData> list) {
        AbstractC53671a aVar = this.f132452a;
        if (aVar != null) {
            aVar.mo183003a(list);
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m207750a(View view) {
        KeyboardUtils.hideKeyboard(this.f132457f);
        AbstractC53671a aVar = this.f132452a;
        if (aVar != null) {
            aVar.mo183001a();
        }
    }

    @Override // com.ss.android.lark.search.impl.func.pick.chatterpick.mvp.AbstractC53672a.AbstractC53674b
    /* renamed from: b */
    public void mo183013b(boolean z) {
        this.mChatterPicker.mo183503g(z);
    }

    @Override // com.ss.android.lark.search.impl.func.pick.chatterpick.mvp.AbstractC53672a.AbstractC53674b
    /* renamed from: c */
    public void mo183015c(List<SearchChatterInfo> list) {
        if (!CollectionUtils.isEmpty(list)) {
            this.f132455d = true;
            this.mChatterPicker.mo183577d(list);
        }
    }

    @Override // com.ss.android.lark.search.impl.func.pick.chatterpick.mvp.AbstractC53672a.AbstractC53674b
    /* renamed from: a */
    public void mo183010a(List<PickChatterViewData> list) {
        int i = this.f132454c;
        if (i == 0) {
            this.f132456e.setEnabled(true);
            this.f132456e.setTextColor(UIUtils.getColor(this.f132457f, R.color.text_title));
            this.f132456e.setText(UIUtils.getString(this.f132457f, R.string.Lark_Legacy_Select));
        } else if (i != 1) {
        } else {
            if (CollectionUtils.isEmpty(list)) {
                if (this.f132455d) {
                    this.f132456e.setEnabled(true);
                    this.f132456e.setTextColor(UIUtils.getColor(this.f132457f, R.color.primary_pri_500));
                } else {
                    this.f132456e.setEnabled(false);
                    this.f132456e.setTextColor(UIUtils.getColor(this.f132457f, R.color.text_disable));
                }
                this.f132456e.setText(UIUtils.getString(this.f132457f, R.string.Lark_Legacy_ConfirmDone));
                return;
            }
            this.f132456e.setEnabled(true);
            this.f132456e.setTextColor(UIUtils.getColor(this.f132457f, R.color.primary_pri_500));
            this.f132456e.setText(UIHelper.mustacheFormat((int) R.string.Lark_Legacy_SelectConfirm, "select_count", Integer.toString(list.size())));
        }
    }

    public PickChatterView(Context context, AbstractC53671a aVar) {
        this.f132457f = context;
        this.f132452a = aVar;
    }
}
