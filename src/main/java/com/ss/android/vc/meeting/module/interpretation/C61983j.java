package com.ss.android.vc.meeting.module.interpretation;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.larksuite.suite.R;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.vc.entity.LanguageType;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.module.interpretation.p3128c.C61958a;
import java.util.List;

/* renamed from: com.ss.android.vc.meeting.module.interpretation.j */
public class C61983j extends BaseAdapter {

    /* renamed from: a */
    public C61303k f155724a;

    /* renamed from: b */
    public ILanguageSelectListener f155725b;

    /* renamed from: c */
    private List<LanguageType> f155726c;

    /* renamed from: d */
    private Context f155727d;

    /* renamed from: com.ss.android.vc.meeting.module.interpretation.j$a */
    public static class C61985a {

        /* renamed from: a */
        TextView f155731a;

        /* renamed from: b */
        View f155732b;

        /* renamed from: c */
        View f155733c;

        /* renamed from: d */
        View f155734d;
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public int getCount() {
        List<LanguageType> list = this.f155726c;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    /* renamed from: a */
    public void mo214565a(List<LanguageType> list) {
        this.f155726c = list;
        notifyDataSetChanged();
    }

    public Object getItem(int i) {
        return this.f155726c.get(i);
    }

    public View getView(final int i, View view, ViewGroup viewGroup) {
        View view2;
        C61985a aVar;
        final LanguageType languageType = this.f155726c.get(i);
        if (view == null) {
            aVar = new C61985a();
            view2 = LayoutInflater.from(this.f155727d).inflate(R.layout.interpretation_select_item_layout, viewGroup, false);
            aVar.f155731a = (TextView) view2.findViewById(R.id.interpretation_tv);
            aVar.f155732b = view2.findViewById(R.id.select_view);
            aVar.f155733c = view2.findViewById(R.id.list_item);
            aVar.f155734d = view2.findViewById(R.id.divide_line);
            view2.setTag(aVar);
        } else {
            view2 = view;
            aVar = (C61985a) view.getTag();
        }
        LanguageType a = this.f155724a.mo212105W().mo212845x().mo214436a();
        if (a == null || languageType == null || !TextUtils.equals(a.languageType, languageType.languageType)) {
            aVar.f155732b.setVisibility(8);
        } else {
            aVar.f155732b.setVisibility(0);
        }
        if (aVar.f155734d.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) aVar.f155734d.getLayoutParams();
            if (i == getCount() - 1) {
                marginLayoutParams.leftMargin = 0;
            } else {
                marginLayoutParams.leftMargin = UIHelper.dp2px(16.0f);
            }
            aVar.f155734d.setLayoutParams(marginLayoutParams);
        }
        C61958a.m242072a(languageType, aVar.f155731a);
        aVar.f155733c.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.vc.meeting.module.interpretation.C61983j.View$OnClickListenerC619841 */

            public void onClick(View view) {
                C61983j.this.f155724a.mo212105W().mo212845x().mo214437a(languageType);
                C61983j.this.f155725b.mo214516a(i);
            }
        });
        return view2;
    }

    public C61983j(Context context, C61303k kVar, ILanguageSelectListener dVar, List<LanguageType> list) {
        this.f155727d = context;
        this.f155724a = kVar;
        this.f155726c = list;
        this.f155725b = dVar;
    }
}
