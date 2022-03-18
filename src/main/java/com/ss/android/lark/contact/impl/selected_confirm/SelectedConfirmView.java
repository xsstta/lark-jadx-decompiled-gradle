package com.ss.android.lark.contact.impl.selected_confirm;

import android.content.Context;
import android.view.View;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.contact.entity.SelectedData;
import com.ss.android.lark.contact.impl.selected_confirm.AbstractC35958a;
import com.ss.android.lark.contact.impl.selected_confirm.SelectedConfirmAdapter;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.ui.CommonTitleBarConstants;
import com.ss.android.lark.ui.IActionTitlebar;
import com.ss.android.lark.utils.UIHelper;
import java.util.List;

public class SelectedConfirmView implements AbstractC35958a.AbstractC35960b {

    /* renamed from: a */
    protected Context f92979a;

    /* renamed from: b */
    protected AbstractC35967e f92980b;

    /* renamed from: c */
    protected AbstractC35958a.AbstractC35960b.AbstractC35961a f92981c;

    /* renamed from: d */
    private SelectedConfirmAdapter f92982d;
    CommonTitleBar mTitleBar;
    RecyclerView showSelectedRV;

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
    }

    /* renamed from: a */
    private void m140957a() {
        m140961c();
        m140960b();
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        this.f92980b.mo132307a(this);
        m140957a();
    }

    /* renamed from: c */
    private void m140961c() {
        this.showSelectedRV.setLayoutManager(new LinearLayoutManager(this.f92979a, 1, false));
        if (this.f92982d == null) {
            this.f92982d = new SelectedConfirmAdapter();
        }
        this.showSelectedRV.setAdapter(this.f92982d);
        this.f92982d.mo132296a(new SelectedConfirmAdapter.AbstractC35956a() {
            /* class com.ss.android.lark.contact.impl.selected_confirm.$$Lambda$SelectedConfirmView$bPN0YoEpNbTGjyg3FBFUGe6sYIA */

            @Override // com.ss.android.lark.contact.impl.selected_confirm.SelectedConfirmAdapter.AbstractC35956a
            public final void onCloseButtonClick(int i) {
                SelectedConfirmView.lambda$bPN0YoEpNbTGjyg3FBFUGe6sYIA(SelectedConfirmView.this, i);
            }
        });
    }

    /* renamed from: b */
    private void m140960b() {
        this.mTitleBar.setLeftText(UIUtils.getString(this.f92979a, R.string.Lark_Legacy_LarkBack));
        this.mTitleBar.setLeftClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.contact.impl.selected_confirm.$$Lambda$SelectedConfirmView$zKQDoHF2mr7o67729Bn4z1GAe3k */

            public final void onClick(View view) {
                SelectedConfirmView.lambda$zKQDoHF2mr7o67729Bn4z1GAe3k(SelectedConfirmView.this, view);
            }
        });
        this.mTitleBar.setLeftImageResource(CommonTitleBarConstants.ICON_BACK);
        this.mTitleBar.addAction(new IActionTitlebar.TextAction(this.f92979a.getResources().getString(R.string.Lark_Legacy_Save), R.color.lkui_B500) {
            /* class com.ss.android.lark.contact.impl.selected_confirm.SelectedConfirmView.C359571 */

            @Override // com.ss.android.lark.ui.IActionTitlebar.Action, com.ss.android.lark.ui.IActionTitlebar.BaseAction
            public void performAction(View view) {
                super.performAction(view);
                SelectedConfirmView.this.f92981c.mo132303a();
            }
        });
        this.mTitleBar.setTitle(UIHelper.mustacheFormat((int) R.string.Lark_Groups_SelectedCountMembers, "select_count", String.valueOf(0)));
        this.mTitleBar.setSubTitleColor(ContextCompat.getColor(this.f92979a, R.color.lkui_N600));
    }

    /* renamed from: a */
    public void setViewDelegate(AbstractC35958a.AbstractC35960b.AbstractC35961a aVar) {
        this.f92981c = aVar;
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m140958a(int i) {
        this.f92981c.mo132304a(i);
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m140959a(View view) {
        this.f92980b.mo132306a(0, null);
    }

    @Override // com.ss.android.lark.contact.impl.selected_confirm.AbstractC35958a.AbstractC35960b
    /* renamed from: a */
    public void mo132299a(List<SelectedData> list) {
        if (this.f92982d == null) {
            this.f92982d = new SelectedConfirmAdapter();
        }
        this.f92982d.resetAll(list);
        this.f92982d.notifyDataSetChanged();
    }

    @Override // com.ss.android.lark.contact.impl.selected_confirm.AbstractC35958a.AbstractC35960b
    /* renamed from: b */
    public void mo132300b(List<SelectedData> list) {
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        for (SelectedData selectedData : list) {
            if (selectedData.dataType == SelectedData.DataType.CHAT) {
                i2++;
            } else if (selectedData.dataType == SelectedData.DataType.CHATTER) {
                i++;
            } else if (selectedData.dataType == SelectedData.DataType.DEPARTAMENT) {
                i3++;
            }
        }
        StringBuilder sb = new StringBuilder();
        String quantityString = UIHelper.getQuantityString(R.plurals.Lark_Groups_MobileSelectedCountMembers, i);
        if (i > 0) {
            sb.append(" ");
            sb.append(quantityString);
        }
        if (i2 > 0) {
            String quantityString2 = UIHelper.getQuantityString(R.plurals.Lark_Legacy_NumberChats, i2);
            sb.append(" ");
            sb.append(quantityString2);
        }
        if (i3 > 0) {
            String quantityString3 = UIHelper.getQuantityString(R.plurals.Lark_Legacy_NumberOrganizations, i3);
            sb.append(" ");
            sb.append(quantityString3);
        }
        String string = UIHelper.getString(R.string.Lark_Groups_MobileYouveSelected);
        if (sb.length() > 0) {
            sb.insert(0, "\n");
        }
        sb.insert(0, string);
        this.mTitleBar.setTitle(sb.toString());
    }

    public SelectedConfirmView(Context context, AbstractC35967e eVar) {
        this.f92979a = context;
        this.f92980b = eVar;
    }
}
