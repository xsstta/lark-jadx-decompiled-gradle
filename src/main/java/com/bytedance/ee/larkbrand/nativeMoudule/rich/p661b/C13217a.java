package com.bytedance.ee.larkbrand.nativeMoudule.rich.p661b;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.TextView;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.larkbrand.nativeMoudule.rich.bean.C13233a;
import com.bytedance.ee.larkbrand.nativeMoudule.rich.p661b.C13223c;
import com.bytedance.ee.larkbrand.nativeMoudule.rich.util.C13264d;
import com.larksuite.suite.R;
import java.util.List;

/* renamed from: com.bytedance.ee.larkbrand.nativeMoudule.rich.b.a */
public class C13217a extends BaseAdapter {

    /* renamed from: a */
    public List<C13233a> f35032a;

    /* renamed from: b */
    public Context f35033b;

    /* renamed from: c */
    public C13223c.AbstractC13227b f35034c;

    /* renamed from: d */
    private GridView f35035d;

    public long getItemId(int i) {
        return (long) i;
    }

    public int getCount() {
        return this.f35032a.size();
    }

    /* renamed from: com.bytedance.ee.larkbrand.nativeMoudule.rich.b.a$a */
    protected class C13219a {

        /* renamed from: a */
        public TextView f35038a;

        protected C13219a() {
        }

        /* renamed from: a */
        public void mo49355a(String str) {
            if (!TextUtils.isEmpty(str)) {
                AppBrandLogger.m52828d("EmojiAdapter", "EmojiAdapter item value=" + str);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
                C13229d.m53936a().mo49366a(C13217a.this.f35033b, spannableStringBuilder, C13264d.f35128b, C13264d.f35129c, C13264d.f35130d, C13264d.f35131e, C13264d.f35132f, false);
                this.f35038a.setText(spannableStringBuilder);
            }
        }
    }

    public Object getItem(int i) {
        return this.f35032a.get(i);
    }

    public View getView(final int i, View view, ViewGroup viewGroup) {
        C13219a aVar;
        if (view == null) {
            view = View.inflate(this.f35033b, R.layout.lark_brand_richtext_emoji_gridview_item, null);
            aVar = new C13219a();
            aVar.f35038a = (TextView) view.findViewById(R.id.itemEmoji);
            view.setTag(aVar);
        } else {
            aVar = (C13219a) view.getTag();
        }
        aVar.mo49355a(this.f35032a.get(i).mo49406a());
        aVar.f35038a.setOnClickListener(new View.OnClickListener() {
            /* class com.bytedance.ee.larkbrand.nativeMoudule.rich.p661b.C13217a.View$OnClickListenerC132181 */

            public void onClick(View view) {
                C13217a.this.f35034c.mo49363a(C13217a.this.f35032a.get(i));
            }
        });
        return view;
    }

    public C13217a(Context context, GridView gridView, List<C13233a> list, C13223c.AbstractC13227b bVar) {
        this.f35034c = bVar;
        this.f35035d = gridView;
        this.f35032a = list;
        this.f35033b = context;
        C13264d.m54035a(context);
    }
}
