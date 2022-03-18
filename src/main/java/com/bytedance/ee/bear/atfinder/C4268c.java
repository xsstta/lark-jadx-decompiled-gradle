package com.bytedance.ee.bear.atfinder;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bumptech.glide.C2124f;
import com.bumptech.glide.ComponentCallbacks2C2115c;
import com.bytedance.ee.bear.at.AtObject;
import com.bytedance.ee.bear.at.C4227b;
import com.bytedance.ee.bear.facade.common.icon.C7713a;
import com.bytedance.ee.bear.p522q.C10539a;
import com.bytedance.ee.bear.p526r.C10599b;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p703f.C13664a;
import com.bytedance.ee.util.p717s.C13723a;
import com.bytedance.ee.util.p718t.C13749l;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.C20923c;
import com.larksuite.suite.R;
import java.util.List;

/* renamed from: com.bytedance.ee.bear.atfinder.c */
public class C4268c extends BaseQuickAdapter<AtObject, C20923c> {

    /* renamed from: a */
    private boolean f12839a;

    /* renamed from: b */
    private final boolean f12840b = C4227b.m17586a().mo16662a();

    /* renamed from: a */
    public void mo16807a(boolean z) {
        this.f12839a = z;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter, com.chad.library.adapter.base.BaseQuickAdapter
    public int getItemViewType(int i) {
        return ((AtObject) mo70685d(i)).getType();
    }

    public C4268c(List<AtObject> list) {
        super(R.layout.at_atfinder_inner_recycler_item, list);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo16806a(C20923c cVar, AtObject atObject) {
        String str;
        int i;
        String edit_time = atObject.getEdit_time();
        if (!TextUtils.isEmpty(edit_time)) {
            str = C10539a.m43639a(this.f51211q, R.string.Doc_At_LastUpdate, "time", C13723a.m55654a(this.f51211q, Long.parseLong(edit_time) * 1000));
        } else {
            str = "";
        }
        TextView textView = (TextView) cVar.mo70740b(R.id.item_name);
        textView.setText(atObject.getContent().replaceAll("<em>", "").replaceAll("</em>", ""));
        if (atObject.isExternal()) {
            textView.setMaxEms(10);
        } else {
            textView.setMaxWidth(Integer.MAX_VALUE);
        }
        boolean a = C4227b.m17586a().mo16666e().mo16668a();
        View b = cVar.mo70740b(R.id.doc_external_tag);
        int i2 = 0;
        if (!atObject.isExternal() || !a) {
            i = 8;
        } else {
            i = 0;
        }
        b.setVisibility(i);
        int type = atObject.getType();
        if (type == 0) {
            m17743a(cVar, atObject, atObject.getAvatar_url(), R.drawable.facade_common_avatar_place_holder);
            View b2 = cVar.mo70740b(R.id.item_not_in_chatGroup);
            if (!this.f12839a || atObject.isJoinChat()) {
                i2 = 8;
            }
            b2.setVisibility(i2);
        } else if (type == 1) {
            m17742a(cVar, R.drawable.ud_icon_file_round_doc_colorful, str, atObject);
        } else if (type != 2) {
            if (type != 3) {
                if (type == 5 || type == 6) {
                    m17743a(cVar, atObject, atObject.getUrl(), R.drawable.at_atfinder_default_icon);
                    return;
                } else if (!(type == 8 || type == 22 || type == 11)) {
                    if (type == 12) {
                        m17741a(atObject, cVar, str);
                        return;
                    } else if (type != 15) {
                        if (type != 16) {
                            String str2 = f51185p;
                            C13479a.m54772d(str2, "attachIconToItemView: unhandle item.getType()=" + atObject.getType());
                            return;
                        }
                        m17742a(cVar, C7713a.m30839a(C10599b.m43905b(atObject.getSub_type()).mo32555b(), atObject.getContent()), str, atObject);
                        return;
                    }
                }
            }
            m17742a(cVar, C7713a.m30837a(atObject.getType()), str, atObject);
        } else {
            m17742a(cVar, R.drawable.ud_icon_file_folder_colorful, str, atObject);
        }
    }

    /* renamed from: a */
    private void m17741a(AtObject atObject, C20923c cVar, String str) {
        String str2;
        String content = atObject.getContent();
        if (content.lastIndexOf(".") != -1) {
            str2 = content.substring(content.lastIndexOf(".") + 1);
        } else {
            str2 = "";
        }
        m17742a(cVar, C10599b.m43904b(str2), str, atObject);
    }

    /* renamed from: a */
    private void m17742a(C20923c cVar, int i, String str, AtObject atObject) {
        if (!this.f12840b || TextUtils.isEmpty(atObject.getIcon_fsunit()) || TextUtils.isEmpty(atObject.getIcon_key())) {
            cVar.mo70733a(R.id.item_icon, i);
        } else {
            Drawable a = C4227b.m17589b().mo16659b().mo16661a(this.f51211q, atObject.getIcon_key(), atObject.getIcon_fsunit(), i);
            a.setBounds(0, 0, C13749l.m55738a(48), C13749l.m55738a(48));
            cVar.mo70734a(R.id.item_icon, a);
        }
        cVar.mo70740b(R.id.item_department).setVisibility(8);
        cVar.mo70737a(R.id.update_time, str);
    }

    /* renamed from: a */
    private void m17743a(C20923c cVar, AtObject atObject, String str, int i) {
        int i2;
        String department = atObject.getDepartment();
        LinearLayout linearLayout = (LinearLayout) cVar.mo70740b(R.id.item_ll_name);
        View b = cVar.mo70740b(R.id.item_department);
        if (TextUtils.isEmpty(department)) {
            i2 = 8;
        } else {
            i2 = 0;
        }
        b.setVisibility(i2);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) linearLayout.getLayoutParams();
        if (!TextUtils.isEmpty(department)) {
            cVar.mo70737a(R.id.item_department, department);
            layoutParams.addRule(2, R.id.item_department);
            layoutParams.addRule(15, 0);
        } else {
            layoutParams.addRule(2, 0);
            layoutParams.addRule(15);
        }
        linearLayout.setLayoutParams(layoutParams);
        ((C2124f) ((C2124f) ((C2124f) ((C2124f) ComponentCallbacks2C2115c.m9151c(this.f51211q).mo10414a(new C13664a(str)).mo11150h()).mo11123a(i)).mo11143c(i)).mo11139b(i)).mo10399a((ImageView) cVar.mo70740b(R.id.item_icon));
    }
}
