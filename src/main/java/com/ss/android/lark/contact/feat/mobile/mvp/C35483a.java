package com.ss.android.lark.contact.feat.mobile.mvp;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.larksuite.suite.R;
import com.ss.android.lark.contact.entity.api.ContactMobileApi;
import com.ss.android.lark.contact.feat.mobile.mvp.C35489e;
import com.ss.android.lark.contact.feat.mobile.mvp.ContactMobileChooseBaseView;
import com.ss.android.lark.contact.feat.statistics.ContactMobileHitPoint;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.ui.IActionTitlebar;
import com.ss.android.lark.utils.UIHelper;

/* renamed from: com.ss.android.lark.contact.feat.mobile.mvp.a */
public class C35483a extends ContactMobileChooseBaseView {
    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.contact.feat.mobile.mvp.ContactMobileChooseBaseView
    /* renamed from: c */
    public int mo130906c() {
        return R.dimen.item_decoration_title_start_margin;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.contact.feat.mobile.mvp.ContactMobileChooseBaseView
    /* renamed from: d */
    public ContactMobileApi.C35402a mo130907d() {
        return ContactMobileApi.C35402a.m138370b();
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.contact.feat.mobile.mvp.ContactMobileChooseBaseView
    /* renamed from: a */
    public TextView mo130897a(CommonTitleBar commonTitleBar, final C35489e.AbstractC35491b.AbstractC35492a aVar) {
        commonTitleBar.addAction(new IActionTitlebar.TextAction(this.f91735j) {
            /* class com.ss.android.lark.contact.feat.mobile.mvp.C35483a.C354841 */

            @Override // com.ss.android.lark.ui.IActionTitlebar.Action, com.ss.android.lark.ui.IActionTitlebar.BaseAction
            public void performAction(View view) {
                super.performAction(view);
                C35489e.AbstractC35491b.AbstractC35492a aVar = aVar;
                if (aVar != null) {
                    aVar.mo130927a(C35483a.this.mo130910g());
                    ContactMobileHitPoint.m138531a(C35483a.this.f91738m.size());
                }
            }
        });
        TextView rightText = commonTitleBar.getRightText();
        rightText.setEnabled(false);
        rightText.setTextColor(UIHelper.getColor(R.color.lkui_B300));
        return rightText;
    }

    public C35483a(Context context, ContactMobileChooseBaseView.AbstractC35482a aVar, ContactMobileApi.AbstractC35403b bVar, String str, String str2, boolean z) {
        super(context, aVar, bVar, str);
        this.f91735j = str2;
        this.f91736k = z;
    }
}
