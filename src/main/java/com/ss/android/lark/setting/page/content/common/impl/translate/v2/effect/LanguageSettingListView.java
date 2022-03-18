package com.ss.android.lark.setting.page.content.common.impl.translate.v2.effect;

import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import com.larksuite.component.ignition.widget.setting_group.SettingGroupHelper;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.framework.mvp.IView;
import com.larksuite.suite.R;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.setting.page.content.common.impl.translate.v2.effect.AbstractC54318a;
import com.ss.android.lark.setting.page.content.common.impl.translate.v2.effect.C54350b;
import com.ss.android.lark.setting.page.content.common.impl.translate.v2.entity.AbstractC54376b;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.ui.CommonTitleBarConstants;
import java.util.List;

public class LanguageSettingListView<V, H> implements AbstractC54318a.AbstractC54324d<V, H> {

    /* renamed from: a */
    public final AbstractC54317a f134403a;

    /* renamed from: b */
    public AbstractC54318a.AbstractC54324d.AbstractC54325a f134404b;

    /* renamed from: c */
    private Context f134405c;

    /* renamed from: d */
    private LinearLayoutManager f134406d;

    /* renamed from: e */
    private C54350b<H> f134407e;
    @BindView(7168)
    public RecyclerView mRecyclerView;
    @BindView(7636)
    public ImageView mSearchCleaner;
    @BindView(7641)
    public EditText mSearchEt;
    @BindView(7904)
    public CommonTitleBar mTitleBar;

    /* renamed from: com.ss.android.lark.setting.page.content.common.impl.translate.v2.effect.LanguageSettingListView$a */
    public interface AbstractC54317a<H> {
        /* renamed from: a */
        void mo185845a();

        /* renamed from: a */
        void mo185846a(IView iView);

        /* renamed from: a */
        void mo185847a(AbstractC54376b<H> bVar);

        /* renamed from: b */
        String mo185848b();
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        this.f134406d = null;
        this.f134407e = null;
        this.f134405c = null;
        this.f134404b = null;
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        this.f134403a.mo185846a(this);
        m210888b();
        m210886a();
        AbstractC54318a.AbstractC54324d.AbstractC54325a aVar = this.f134404b;
        if (aVar != null) {
            aVar.mo185859a();
        }
    }

    /* renamed from: a */
    private void m210886a() {
        EditText editText = this.mSearchEt;
        if (editText != null) {
            editText.addTextChangedListener(new TextWatcher() {
                /* class com.ss.android.lark.setting.page.content.common.impl.translate.v2.effect.LanguageSettingListView.C543131 */

                public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                }

                public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                }

                public void afterTextChanged(Editable editable) {
                    if (LanguageSettingListView.this.f134404b != null && editable != null) {
                        LanguageSettingListView.this.f134404b.mo185860a(editable.toString());
                        if (TextUtils.isEmpty(editable.toString())) {
                            LanguageSettingListView.this.mSearchCleaner.setVisibility(8);
                        } else {
                            LanguageSettingListView.this.mSearchCleaner.setVisibility(0);
                        }
                    }
                }
            });
        }
        ImageView imageView = this.mSearchCleaner;
        if (imageView != null) {
            imageView.setOnClickListener(new View.OnClickListener() {
                /* class com.ss.android.lark.setting.page.content.common.impl.translate.v2.effect.LanguageSettingListView.View$OnClickListenerC543142 */

                public void onClick(View view) {
                    LanguageSettingListView.this.mSearchEt.setText("");
                }
            });
        }
        CommonTitleBar commonTitleBar = this.mTitleBar;
        if (commonTitleBar != null) {
            commonTitleBar.getLeftLayout().setOnClickListener(new View.OnClickListener() {
                /* class com.ss.android.lark.setting.page.content.common.impl.translate.v2.effect.LanguageSettingListView.View$OnClickListenerC543153 */

                public void onClick(View view) {
                    LanguageSettingListView.this.f134403a.mo185845a();
                }
            });
        }
    }

    /* renamed from: b */
    private void m210888b() {
        if (this.mRecyclerView != null) {
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.f134405c);
            this.f134406d = linearLayoutManager;
            this.mRecyclerView.setLayoutManager(linearLayoutManager);
            C54350b<H> bVar = new C54350b<>(this.f134405c, new C54350b.AbstractC54353b() {
                /* class com.ss.android.lark.setting.page.content.common.impl.translate.v2.effect.LanguageSettingListView.C543164 */

                @Override // com.ss.android.lark.setting.page.content.common.impl.translate.v2.effect.C54350b.AbstractC54353b
                /* renamed from: a */
                public void mo185844a(AbstractC54376b bVar) {
                    LanguageSettingListView.this.f134403a.mo185847a(bVar);
                }
            });
            this.f134407e = bVar;
            this.mRecyclerView.setAdapter(bVar);
            SettingGroupHelper.m88812a(this.mRecyclerView);
            this.mTitleBar.setTitle(this.f134403a.mo185848b());
            this.mTitleBar.setLeftClickListener(new View.OnClickListener() {
                /* class com.ss.android.lark.setting.page.content.common.impl.translate.v2.effect.$$Lambda$LanguageSettingListView$VvUocvmoIwJA2SCLYqowz2J3wiE */

                public final void onClick(View view) {
                    LanguageSettingListView.lambda$VvUocvmoIwJA2SCLYqowz2J3wiE(LanguageSettingListView.this, view);
                }
            });
            if (DesktopUtil.m144301a(this.f134405c)) {
                this.mTitleBar.setLeftImageResource(CommonTitleBarConstants.ICON_CLOSE);
                DesktopUtil.m144306b(this.mSearchEt);
            }
        }
    }

    /* renamed from: a */
    public void setViewDelegate(AbstractC54318a.AbstractC54324d.AbstractC54325a aVar) {
        this.f134404b = aVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m210887a(View view) {
        this.f134403a.mo185845a();
    }

    @Override // com.ss.android.lark.setting.page.content.common.impl.translate.v2.effect.AbstractC54318a.AbstractC54324d
    /* renamed from: a */
    public void mo185838a(List<AbstractC54376b<H>> list) {
        C54350b<H> bVar = this.f134407e;
        if (bVar != null) {
            bVar.mo185900a(list);
        }
    }

    @Override // com.ss.android.lark.setting.page.content.common.impl.translate.v2.effect.AbstractC54318a.AbstractC54324d
    /* renamed from: a */
    public void mo185837a(String str) {
        if (TextUtils.isEmpty(str)) {
            LKUIToast.show(this.f134405c, (int) R.string.Lark_Legacy_MineMessageSettingSetupFailed);
        } else {
            LKUIToast.show(this.f134405c, str);
        }
    }

    public LanguageSettingListView(Context context, AbstractC54317a aVar) {
        this.f134405c = context;
        this.f134403a = aVar;
    }
}
