package com.ss.android.lark.contact.impl.selector.little_app;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentManager;
import com.larksuite.component.ui.dialog.C25639g;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.contact.C35358a;
import com.ss.android.lark.contact.entity.Department;
import com.ss.android.lark.contact.impl.selector.little_app.AbstractC35977a;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.search.widget.BasePicker;
import com.ss.android.lark.search.widget.ChatterPicker;
import com.ss.android.lark.search.widget.constants.PickerUseCategory;
import com.ss.android.lark.search.widget.constants.PickerUsePage;
import com.ss.android.lark.search.widget.params.ChatterPickerParams;
import com.ss.android.lark.search.widget.reporter.PickerReporterDelegate;
import com.ss.android.lark.searchcommon.dto.info.SearchBaseInfo;
import com.ss.android.lark.searchcommon.view.SearchResultView;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.ui.CommonTitleBarConstants;
import com.ss.android.lark.utils.C57782ag;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.listener.OnSingleClickListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class LittleAppSelectMemberView implements AbstractC35977a.AbstractC35979b {

    /* renamed from: a */
    public AbstractC35977a.AbstractC35979b.AbstractC35980a f92999a;

    /* renamed from: b */
    public AbstractC35976a f93000b;

    /* renamed from: c */
    public Activity f93001c;

    /* renamed from: d */
    private boolean f93002d;

    /* renamed from: e */
    private boolean f93003e;

    /* renamed from: f */
    private boolean f93004f;
    RelativeLayout mBottomDetailRL;
    ChatterPicker mChatterPicker;
    TextView mConfirmBT;
    TextView mSelectCountTV;
    CommonTitleBar mTitleBar;

    /* renamed from: com.ss.android.lark.contact.impl.selector.little_app.LittleAppSelectMemberView$a */
    public interface AbstractC35976a {
        /* renamed from: a */
        void mo132325a();

        /* renamed from: a */
        void mo132326a(Intent intent);

        /* renamed from: a */
        void mo132327a(AbstractC35977a.AbstractC35979b bVar);

        /* renamed from: a */
        void mo132328a(List<SearchBaseInfo> list);

        /* renamed from: a */
        void mo132329a(List<String> list, UIGetDataCallback<Map<String, Chatter>> uIGetDataCallback);

        /* renamed from: b */
        FragmentManager mo132330b();

        /* renamed from: b */
        void mo132331b(Intent intent);
    }

    @Override // com.ss.android.lark.contact.impl.selector.little_app.AbstractC35977a.AbstractC35979b
    /* renamed from: d */
    public String mo132341d() {
        return this.mChatterPicker.getQuery();
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        this.mChatterPicker.mo183601l();
    }

    /* renamed from: f */
    private void m141005f() {
        this.mTitleBar.setTitle(R.string.Lark_Legacy_ChooseContact);
    }

    /* renamed from: g */
    private void m141006g() {
        this.mConfirmBT.setBackgroundResource(R.drawable.common_corner3dp_color_c12);
        this.mConfirmBT.setClickable(false);
    }

    /* renamed from: h */
    private void m141007h() {
        this.mSelectCountTV.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.contact.impl.selector.little_app.$$Lambda$LittleAppSelectMemberView$CPF9yAZ0C6icHhrNsw06rBQFZiE */

            public final void onClick(View view) {
                LittleAppSelectMemberView.lambda$CPF9yAZ0C6icHhrNsw06rBQFZiE(LittleAppSelectMemberView.this, view);
            }
        });
    }

    /* renamed from: i */
    private void m141008i() {
        m141009j();
        mo132342e();
        m141010k();
        m141007h();
    }

    /* renamed from: k */
    private void m141010k() {
        this.mConfirmBT.setOnClickListener(new OnSingleClickListener() {
            /* class com.ss.android.lark.contact.impl.selector.little_app.LittleAppSelectMemberView.C359711 */

            @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
            public void onSingleClick(View view) {
                LittleAppSelectMemberView.this.mConfirmBT.setEnabled(false);
                LittleAppSelectMemberView.this.f92999a.mo132359c();
            }
        });
        m141006g();
    }

    @Override // com.ss.android.lark.contact.impl.selector.little_app.AbstractC35977a.AbstractC35979b
    /* renamed from: a */
    public Department mo132332a() {
        return this.mChatterPicker.getCurDepartment();
    }

    @Override // com.ss.android.lark.contact.impl.selector.little_app.AbstractC35977a.AbstractC35979b
    /* renamed from: b */
    public int mo132338b() {
        return this.mChatterPicker.getFragmentType();
    }

    @Override // com.ss.android.lark.contact.impl.selector.little_app.AbstractC35977a.AbstractC35979b
    /* renamed from: c */
    public void mo132340c() {
        if (this.mChatterPicker.mo183501f()) {
            this.f93000b.mo132325a();
        }
    }

    /* renamed from: j */
    private void m141009j() {
        this.mTitleBar.setLeftImageResource(CommonTitleBarConstants.ICON_CLOSE);
        this.mTitleBar.setLeftClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.contact.impl.selector.little_app.$$Lambda$LittleAppSelectMemberView$15BsH0ZHXNyub1iepnIwH5hsRHA */

            public final void onClick(View view) {
                LittleAppSelectMemberView.lambda$15BsH0ZHXNyub1iepnIwH5hsRHA(LittleAppSelectMemberView.this, view);
            }
        });
        m141005f();
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        this.f93000b.mo132327a(this);
        m141008i();
        if (!this.f93002d) {
            this.mBottomDetailRL.setVisibility(8);
        }
    }

    /* access modifiers changed from: public */
    /* renamed from: l */
    private /* synthetic */ ChatterPickerParams m141011l() {
        return new ChatterPickerParams.Builder().mo183668d(false).mo183676h(this.f93003e).mo183678j(this.f92999a.mo132365h()).mo183664b(this.f92999a.mo132362e()).mo183675g();
    }

    /* renamed from: e */
    public void mo132342e() {
        ((ChatterPicker) ((ChatterPicker) ((ChatterPicker) ((ChatterPicker) ((ChatterPicker) ((ChatterPicker) ((ChatterPicker) ((ChatterPicker) ((ChatterPicker) ((ChatterPicker) ((ChatterPicker) ((ChatterPicker) this.mChatterPicker.mo183563a(PickerUsePage.LITTLE_APP_PICK_USER)).mo183562a(PickerUseCategory.LITTLE_APP)).mo183604p(this.f93002d)).mo183561a(new BasePicker.OnPickerParamsLoader() {
            /* class com.ss.android.lark.contact.impl.selector.little_app.$$Lambda$LittleAppSelectMemberView$scpXo8geZ2HaQa4RNoELoO648rI */

            @Override // com.ss.android.lark.search.widget.BasePicker.OnPickerParamsLoader
            public final Object onLoadPickerParams() {
                return LittleAppSelectMemberView.lambda$scpXo8geZ2HaQa4RNoELoO648rI(LittleAppSelectMemberView.this);
            }
        })).mo183496d(this.f93003e)).mo183516l(this.f93004f).mo183519o(this.f93004f)).mo183559a(new BasePicker.IOnPickNotify() {
            /* class com.ss.android.lark.contact.impl.selector.little_app.LittleAppSelectMemberView.C359755 */

            @Override // com.ss.android.lark.search.widget.BasePicker.IOnPickNotify
            /* renamed from: a */
            public void mo110051a(List<String> list, List<SearchBaseInfo> list2) {
            }

            @Override // com.ss.android.lark.search.widget.BasePicker.IOnPickNotify
            /* renamed from: a */
            public void mo110050a(String str, SearchBaseInfo searchBaseInfo) {
                LittleAppSelectMemberView.this.f92999a.mo132358b(searchBaseInfo);
            }

            @Override // com.ss.android.lark.search.widget.BasePicker.IOnPickNotify
            /* renamed from: b */
            public void mo110052b(String str, SearchBaseInfo searchBaseInfo) {
                LittleAppSelectMemberView.this.f92999a.mo132360c(searchBaseInfo);
            }
        })).mo183565a(new SearchResultView.IOnBusinessConsumeItem() {
            /* class com.ss.android.lark.contact.impl.selector.little_app.LittleAppSelectMemberView.C359744 */

            @Override // com.ss.android.lark.searchcommon.view.SearchResultView.IOnBusinessConsumeItem
            /* renamed from: a */
            public SearchResultView.CheckBoxBindStatus mo110048a(SearchBaseInfo searchBaseInfo) {
                boolean z;
                if (!LittleAppSelectMemberView.this.f92999a.mo132365h() || !LittleAppSelectMemberView.this.mo132337a(searchBaseInfo)) {
                    z = false;
                } else {
                    z = true;
                }
                return new SearchResultView.CheckBoxBindStatus(z, true, false);
            }

            @Override // com.ss.android.lark.searchcommon.view.SearchResultView.IOnBusinessConsumeItem
            /* renamed from: b */
            public boolean mo110049b(SearchBaseInfo searchBaseInfo) {
                Log.m165389i("LittleAppSelectMemberView", "onBusinessConsume ...");
                if (!LittleAppSelectMemberView.this.f92999a.mo132365h() || !LittleAppSelectMemberView.this.mo132337a(searchBaseInfo)) {
                    return LittleAppSelectMemberView.this.f92999a.mo132356a(searchBaseInfo);
                }
                return true;
            }
        })).mo183560a(new BasePicker.IViewDependency() {
            /* class com.ss.android.lark.contact.impl.selector.little_app.LittleAppSelectMemberView.C359733 */

            @Override // com.ss.android.lark.search.widget.BasePicker.IViewDependency
            /* renamed from: b */
            public Activity mo110056b() {
                return LittleAppSelectMemberView.this.f93001c;
            }

            @Override // com.ss.android.lark.search.widget.BasePicker.IViewDependency
            /* renamed from: c */
            public FragmentManager mo110057c() {
                return LittleAppSelectMemberView.this.f93000b.mo132330b();
            }
        })).mo183564a(new PickerReporterDelegate() {
            /* class com.ss.android.lark.contact.impl.selector.little_app.LittleAppSelectMemberView.C359722 */

            @Override // com.ss.android.lark.search.widget.reporter.PickerReporterDelegate
            /* renamed from: a */
            public void mo132343a() {
                LittleAppSelectMemberView.this.f92999a.mo132357b();
            }
        })).mo183624t(true)).mo183491b(this.f92999a.mo132363f())).mo183483a();
        this.mChatterPicker.mo183573b(new ArrayList(this.f92999a.mo132364g().values()));
    }

    /* renamed from: a */
    public void setViewDelegate(AbstractC35977a.AbstractC35979b.AbstractC35980a aVar) {
        this.f92999a = aVar;
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m141003a(View view) {
        this.f92999a.mo132355a();
    }

    /* access modifiers changed from: public */
    /* renamed from: b */
    private /* synthetic */ void m141004b(View view) {
        this.f92999a.mo132361d();
    }

    @Override // com.ss.android.lark.contact.impl.selector.little_app.AbstractC35977a.AbstractC35979b
    /* renamed from: a */
    public void mo132334a(String str) {
        new C25639g(this.f93001c).mo89237b(str).mo89238b(true).mo89224a(R.id.lkui_dialog_btn_right, R.string.Lark_Legacy_GroupSettingMemberLimitEnsure, (DialogInterface.OnClickListener) null).mo89239c();
    }

    @Override // com.ss.android.lark.contact.impl.selector.little_app.AbstractC35977a.AbstractC35979b
    /* renamed from: b */
    public void mo132339b(List<SearchBaseInfo> list) {
        if (!CollectionUtils.isEmpty(list)) {
            this.mChatterPicker.mo183577d(list);
        }
    }

    @Override // com.ss.android.lark.contact.impl.selector.little_app.AbstractC35977a.AbstractC35979b
    /* renamed from: a */
    public void mo132335a(List<SearchBaseInfo> list) {
        this.mChatterPicker.mo183573b(list);
    }

    @Override // com.ss.android.lark.contact.impl.selector.little_app.AbstractC35977a.AbstractC35979b
    /* renamed from: a */
    public void mo132336a(Map<String, SearchBaseInfo> map) {
        if (map != null) {
            String mustacheFormat = UIHelper.mustacheFormat((int) R.string.Lark_Legacy_GroupSettingSelectedNumber, "number", Integer.toString(map.size()));
            if (map.size() == 0) {
                this.mConfirmBT.setBackgroundResource(R.drawable.common_corner3dp_color_c12);
                this.mConfirmBT.setClickable(false);
                this.mSelectCountTV.setTextColor(UIHelper.getColor(R.color.function_info_300));
            } else {
                this.mConfirmBT.setBackgroundResource(R.drawable.group_chat_select_bg_selector);
                this.mConfirmBT.setClickable(true);
                this.mSelectCountTV.setTextColor(UIHelper.getColor(R.color.function_info_500));
            }
            this.mSelectCountTV.setText(mustacheFormat);
        }
    }

    /* renamed from: a */
    public boolean mo132337a(SearchBaseInfo searchBaseInfo) {
        String c = C35358a.m138143a().mo130163h().mo130231c();
        if (c == null) {
            c = "";
        }
        if (!c.equals(searchBaseInfo.getId()) || C57782ag.m224241a(c)) {
            return false;
        }
        return true;
    }

    public LittleAppSelectMemberView(Activity activity, AbstractC35976a aVar, boolean z, boolean z2, boolean z3) {
        this.f93001c = activity;
        this.f93000b = aVar;
        this.f93002d = z;
        this.f93003e = z2;
        this.f93004f = z3;
    }
}
