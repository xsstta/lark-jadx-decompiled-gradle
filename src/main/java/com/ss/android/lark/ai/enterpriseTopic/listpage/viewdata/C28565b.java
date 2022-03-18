package com.ss.android.lark.ai.enterpriseTopic.listpage.viewdata;

import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.larksuite.suite.R;
import com.ss.android.lark.ai.enterpriseTopic.C28551a;
import com.ss.android.lark.pb.ai.EntityCard;
import com.ss.android.lark.reaction.widget.p2560b.C52990a;
import com.ss.android.lark.widget.recyclerview.p2964a.AbstractC58968a;
import com.ss.android.lark.widget.recyclerview.p2964a.C58974c;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.ss.android.lark.ai.enterpriseTopic.listpage.viewdata.b */
public class C28565b extends AbstractC58968a<C28565b> {

    /* renamed from: a */
    public final EntityCard f71842a;

    /* renamed from: b */
    public final AbstractC28567a f71843b;

    /* renamed from: f */
    private final List<EntityCard> f71844f;

    /* renamed from: g */
    private final int f71845g;

    /* renamed from: h */
    private String f71846h;

    /* renamed from: i */
    private String f71847i;

    /* renamed from: j */
    private String f71848j;

    /* renamed from: k */
    private String f71849k;

    /* renamed from: com.ss.android.lark.ai.enterpriseTopic.listpage.viewdata.b$a */
    public interface AbstractC28567a {
        void onClick(int i, EntityCard entityCard);
    }

    /* renamed from: b */
    private boolean m104759b() {
        if (this.f71845g == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private int m104756a() {
        if (this.f71844f.size() > 1) {
            return 3;
        }
        return 2;
    }

    /* renamed from: i */
    private boolean m104761i() {
        if (this.f71845g == this.f71844f.size() - 1) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private void m104757a(C58974c cVar) {
        m104760c(cVar);
        ((TextView) cVar.itemView.findViewById(R.id.tv_item_title)).setText(this.f71848j);
        ((TextView) cVar.itemView.findViewById(R.id.tv_item_summary)).setText(this.f71849k);
    }

    /* renamed from: b */
    private void m104758b(C58974c cVar) {
        int i;
        int i2;
        m104760c(cVar);
        ((TextView) cVar.itemView.findViewById(R.id.tv_item_title)).setText(String.format(Locale.getDefault(), "%s%d", this.f71848j, Integer.valueOf(this.f71845g + 1)));
        ((TextView) cVar.itemView.findViewById(R.id.tv_item_summary)).setText(this.f71849k);
        TextView textView = (TextView) cVar.itemView.findViewById(R.id.tv_abbr_name);
        int i3 = 8;
        if (m104759b()) {
            i = 0;
        } else {
            i = 8;
        }
        textView.setVisibility(i);
        ImageView imageView = (ImageView) cVar.itemView.findViewById(R.id.iv_divider);
        if (!m104761i()) {
            i3 = 0;
        }
        imageView.setVisibility(i3);
        LinearLayout linearLayout = (LinearLayout) cVar.itemView.findViewById(R.id.ll_container);
        if (m104761i()) {
            i2 = C52990a.m205224a(linearLayout.getContext(), 8.0f);
        } else {
            i2 = 0;
        }
        C52990a.m205230a(linearLayout, 0, 0, 0, i2);
    }

    /* renamed from: c */
    private void m104760c(C58974c cVar) {
        int i;
        TextView textView = (TextView) cVar.itemView.findViewById(R.id.tv_abbr_desc);
        TextView textView2 = (TextView) cVar.itemView.findViewById(R.id.tv_abbr_alias);
        LinearLayout linearLayout = (LinearLayout) cVar.itemView.findViewById(R.id.ll_cp);
        ((TextView) cVar.itemView.findViewById(R.id.tv_abbr_name)).setText(this.f71846h);
        textView.setText(this.f71847i);
        int i2 = 8;
        if (TextUtils.isEmpty(this.f71847i)) {
            i = 8;
        } else {
            i = 0;
        }
        textView.setVisibility(i);
        if (this.f71842a.malias == null || this.f71842a.malias.isEmpty()) {
            textView2.setVisibility(8);
        } else {
            textView2.setVisibility(0);
            textView2.setText(C28551a.m104695a(this.f71842a.malias, textView2.getContext()));
        }
        cVar.itemView.findViewById(R.id.ll_more).setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.ai.enterpriseTopic.listpage.viewdata.C28565b.View$OnClickListenerC285661 */

            public void onClick(View view) {
                if (C28565b.this.f71843b != null) {
                    C28565b.this.f71843b.onClick(C28565b.this.mo200069h(), C28565b.this.f71842a);
                }
            }
        });
        if (TextUtils.equals(this.f71842a.msource, "baike")) {
            i2 = 0;
        }
        linearLayout.setVisibility(i2);
    }

    @Override // com.ss.android.lark.widget.recyclerview.p2964a.AbstractC58968a
    /* renamed from: a */
    public void mo101671a(C58974c cVar, int i) {
        int a = m104756a();
        if (a == 2) {
            m104757a(cVar);
        } else if (a == 3) {
            m104758b(cVar);
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C28565b(java.util.List<com.ss.android.lark.pb.ai.EntityCard> r3, int r4, com.ss.android.lark.ai.enterpriseTopic.listpage.viewdata.C28565b.AbstractC28567a r5) {
        /*
        // Method dump skipped, instructions count: 146
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.ai.enterpriseTopic.listpage.viewdata.C28565b.<init>(java.util.List, int, com.ss.android.lark.ai.enterpriseTopic.listpage.viewdata.b$a):void");
    }

    public C28565b(JSONObject jSONObject, int i, AbstractC28567a aVar, int i2, String str) {
        super(R.layout.entity_list_item_multiple);
        this.f71845g = i;
        this.f71843b = aVar;
        this.f71844f = new ArrayList(i2);
        for (int i3 = 0; i3 < i2; i3++) {
            this.f71844f.add(new EntityCard.C49445a().mo172536a(new ArrayList()).mo172539c("").mo172535a("").mo172538b("").build());
        }
        this.f71846h = jSONObject.optString("Key", "");
        this.f71847i = jSONObject.optString("Fullname", "");
        this.f71848j = str;
        this.f71849k = jSONObject.optString("Description", "");
        ArrayList arrayList = new ArrayList();
        JSONArray optJSONArray = jSONObject.optJSONArray("Alias");
        if (optJSONArray != null) {
            for (int i4 = 0; i4 < optJSONArray.length(); i4++) {
                String optString = optJSONArray.optString(i4, "");
                if (!TextUtils.isEmpty(optString)) {
                    arrayList.add(optString);
                }
            }
        }
        this.f71842a = new EntityCard.C49445a().mo172536a(arrayList).mo172539c(jSONObject.optString("DescUrl", "")).mo172535a("").mo172538b("").build();
    }
}
