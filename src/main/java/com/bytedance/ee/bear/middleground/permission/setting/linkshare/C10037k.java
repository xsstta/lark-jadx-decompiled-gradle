package com.bytedance.ee.bear.middleground.permission.setting.linkshare;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import com.bytedance.ee.bear.widgets.shape.C11852a;
import com.chad.library.adapter.base.AbstractC20921b;
import com.chad.library.adapter.base.C20923c;
import com.larksuite.component.universe_design.checkbox.UDCheckBox;
import com.larksuite.component.universe_design.util.UDDimenUtils;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import java.util.List;

/* renamed from: com.bytedance.ee.bear.middleground.permission.setting.linkshare.k */
public class C10037k extends AbstractC20921b<LinkShareItem, C20923c> {

    /* renamed from: a */
    private final GradientDrawable f27134a;

    /* renamed from: b */
    private final GradientDrawable f27135b;

    /* renamed from: c */
    private final GradientDrawable f27136c;

    /* renamed from: d */
    private final GradientDrawable f27137d;

    /* renamed from: e */
    private int f27138e = 1;

    /* renamed from: f */
    private AbstractC10038a f27139f;

    /* renamed from: g */
    private int f27140g = 2;

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ee.bear.middleground.permission.setting.linkshare.k$a */
    public interface AbstractC10038a {
        /* renamed from: a */
        void mo38346a(boolean z, View view);
    }

    /* renamed from: h */
    private boolean m41776h(int i) {
        return i == 5 || i == 6 || i == 7 || i == 8;
    }

    /* renamed from: a */
    public int mo18916a() {
        return this.f27138e;
    }

    /* renamed from: b */
    public void mo33373b(int i) {
        this.f27138e = i;
    }

    /* renamed from: a */
    public void mo38353a(AbstractC10038a aVar) {
        this.f27139f = aVar;
    }

    /* renamed from: a */
    private int m41775a(List<LinkShareItem> list) {
        if (list == null) {
            return 1;
        }
        for (LinkShareItem linkShareItem : list) {
            if (linkShareItem.getType() == 1000) {
                return 2;
            }
        }
        return 1;
    }

    public C10037k(Context context, List<LinkShareItem> list) {
        super(list);
        mo70726a(1, R.layout.share_list_link_share_only_title_item);
        mo70726a(2, R.layout.share_list_link_share_only_title_item);
        mo70726a(3, R.layout.share_list_link_share_only_title_item);
        mo70726a(4, R.layout.share_list_link_share_only_title_item);
        mo70726a(5, R.layout.share_list_link_share_only_title_item);
        mo70726a(6, R.layout.share_list_link_share_only_title_item);
        mo70726a(7, R.layout.share_list_link_share_only_title_item);
        mo70726a(8, R.layout.share_list_link_share_only_title_item);
        mo70726a(1000, R.layout.activity_set_share_link_password);
        mo70726a(9, R.layout.share_list_link_share_only_title_item);
        mo70726a(10, R.layout.share_list_link_share_only_title_item);
        mo70726a(11, R.layout.share_list_link_share_only_title_item);
        this.f27134a = C11852a.m49212a(UIUtils.getColor(context, R.color.bg_body), UDDimenUtils.m93308a(context, 10), (ColorStateList) null);
        this.f27135b = C11852a.m49215b(UIUtils.getColor(context, R.color.bg_body), UDDimenUtils.m93308a(context, 10), null);
        this.f27136c = C11852a.m49213a(UIUtils.getColor(context, R.color.bg_body), null);
        this.f27137d = C11852a.m49218e(UIUtils.getColor(context, R.color.bg_body), UDDimenUtils.m93308a(context, 10), null);
        this.f27140g = m41775a(list);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo16806a(C20923c cVar, LinkShareItem linkShareItem) {
        boolean z;
        if (linkShareItem.getType() == 1000) {
            AbstractC10038a aVar = this.f27139f;
            if (aVar != null) {
                aVar.mo38346a(m41776h(mo18916a()), cVar.mo70740b(R.id.link_password_root_view));
                return;
            }
            return;
        }
        cVar.mo70737a(R.id.share_link_item_title, linkShareItem.getDescription());
        UDCheckBox uDCheckBox = (UDCheckBox) cVar.mo70740b(R.id.share_checkbox);
        boolean z2 = false;
        if (mo18916a() == linkShareItem.getType()) {
            z = true;
        } else {
            z = false;
        }
        uDCheckBox.setChecked(z);
        if (!(cVar.getAdapterPosition() == 0 || linkShareItem.getType() == 1000)) {
            z2 = true;
        }
        cVar.mo70742b(R.id.share_link_divider, z2);
        if (getItemCount() == 1) {
            cVar.mo70740b(R.id.share_item_layout).setBackground(this.f27137d);
        } else if (cVar.getAdapterPosition() == 0) {
            cVar.mo70740b(R.id.share_item_layout).setBackground(this.f27134a);
        } else if (cVar.getAdapterPosition() == getItemCount() - this.f27140g) {
            cVar.mo70740b(R.id.share_item_layout).setBackground(this.f27135b);
        } else {
            cVar.mo70740b(R.id.share_item_layout).setBackground(this.f27136c);
        }
    }
}
