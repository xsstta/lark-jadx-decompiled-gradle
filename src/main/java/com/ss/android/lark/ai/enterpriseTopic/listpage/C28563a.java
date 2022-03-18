package com.ss.android.lark.ai.enterpriseTopic.listpage;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.suite.R;
import com.ss.android.lark.ai.enterpriseTopic.C28551a;
import com.ss.android.lark.ai.enterpriseTopic.listpage.viewdata.C28564a;
import com.ss.android.lark.ai.enterpriseTopic.listpage.viewdata.C28565b;
import com.ss.android.lark.ai.p1329c.AbstractC28534a;
import com.ss.android.lark.ai.p1330d.p1332b.C28540a;
import com.ss.android.lark.base.fragment.BaseFragment;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.pb.ai.EntityCard;
import com.ss.android.lark.pb.ai.WordCards;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.widget.recyclerview.p2964a.AbstractC58968a;
import com.ss.android.lark.widget.recyclerview.p2964a.C58973b;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: com.ss.android.lark.ai.enterpriseTopic.listpage.a */
public class C28563a extends BaseFragment {

    /* renamed from: a */
    private final AbstractC28534a f71833a;

    /* renamed from: b */
    private final C28540a f71834b = new C28540a();

    /* renamed from: c */
    private C58973b<AbstractC58968a> f71835c;

    /* renamed from: d */
    private List<AbstractC58968a> f71836d;

    /* renamed from: e */
    private List<WordCards> f71837e;

    /* renamed from: f */
    private View f71838f;

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: b */
    private /* synthetic */ void m104750b(View view) {
        finish();
    }

    C28563a(AbstractC28534a aVar) {
        this.f71833a = aVar;
    }

    /* renamed from: a */
    public boolean mo101704a(Bundle bundle) {
        if (bundle.getString("key_query_text") != null) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private void m104746a(EntityCard entityCard) {
        if (!TextUtils.isEmpty(entityCard.mlink_url)) {
            this.f71833a.mo101560b(this.mContext, C28551a.m104694a(getActivity(), entityCard.mlink_url, this.f71833a.mo101566g()));
        }
        this.f71834b.mo101585a();
    }

    /* renamed from: a */
    private void m104745a(View view) {
        CommonTitleBar commonTitleBar = (CommonTitleBar) view.findViewById(R.id.title_bar);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.rv_content);
        if (commonTitleBar != null) {
            commonTitleBar.setTitle(getString(R.string.Lark_Encyclopedia_Encyclopedia));
            commonTitleBar.getLeftLayout().setOnClickListener(new View.OnClickListener() {
                /* class com.ss.android.lark.ai.enterpriseTopic.listpage.$$Lambda$a$00eQ2dDSK12ew_ARjKS1h2ZfcM */

                public final void onClick(View view) {
                    C28563a.this.m104750b((C28563a) view);
                }
            });
        }
        C58973b<AbstractC58968a> bVar = new C58973b<>();
        this.f71835c = bVar;
        bVar.mo200080a(this.f71836d);
        recyclerView.setAdapter(this.f71835c);
        recyclerView.setLayoutManager(new LinearLayoutManager(this.mContext));
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        Bundle arguments = getArguments();
        if (arguments == null) {
            finish();
        } else if (arguments.getBoolean("key_from_entity_word", false) && arguments.getSerializable("key_cards_list_v2") != null && (arguments.getSerializable("key_cards_list_v2") instanceof String)) {
            m104751c(arguments);
        } else if (arguments.getSerializable("key_cards_list") != null && (arguments.getSerializable("key_cards_list") instanceof ArrayList) && ((ArrayList) arguments.getSerializable("key_cards_list")).size() > 0) {
            m104749b(arguments);
        }
    }

    /* renamed from: b */
    private void m104749b(Bundle bundle) {
        if (!mo101704a(bundle)) {
            finish();
            return;
        }
        this.f71837e = (ArrayList) getArguments().getSerializable("key_cards_list");
        String string = getArguments().getString("key_query_text", "");
        boolean z = getArguments().getBoolean("key_from_entity_word", false);
        this.f71836d = new LinkedList();
        ArrayList arrayList = new ArrayList();
        for (WordCards wordCards : this.f71837e) {
            for (int i = 0; i < wordCards.mcards.size(); i++) {
                this.f71836d.add(new C28565b(wordCards.mcards, i, new C28565b.AbstractC28567a() {
                    /* class com.ss.android.lark.ai.enterpriseTopic.listpage.$$Lambda$a$L2qhg7OOl1QLWFnYucg1pciVVmY */

                    @Override // com.ss.android.lark.ai.enterpriseTopic.listpage.viewdata.C28565b.AbstractC28567a
                    public final void onClick(int i, EntityCard entityCard) {
                        C28563a.this.m104748b(i, entityCard);
                    }
                }));
            }
            if (!TextUtils.isEmpty(wordCards.mname)) {
                arrayList.add(wordCards.mname);
            }
        }
        m104747a(string, arrayList, z);
        m104745a(this.f71838f);
    }

    /* renamed from: c */
    private void m104751c(Bundle bundle) {
        if (!mo101704a(bundle)) {
            finish();
            return;
        }
        try {
            JSONArray jSONArray = new JSONArray((String) getArguments().getSerializable("key_cards_list_v2"));
            String string = getArguments().getString("key_query_text", "");
            this.f71836d = new LinkedList();
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                this.f71836d.add(new C28565b(jSONArray.optJSONObject(i), i, new C28565b.AbstractC28567a() {
                    /* class com.ss.android.lark.ai.enterpriseTopic.listpage.$$Lambda$a$zeG15xJ8F0emwFxy3Y93bdS1RXQ */

                    @Override // com.ss.android.lark.ai.enterpriseTopic.listpage.viewdata.C28565b.AbstractC28567a
                    public final void onClick(int i, EntityCard entityCard) {
                        C28563a.this.m104744a(i, entityCard);
                    }
                }, length, this.mContext.getResources().getString(R.string.LarkAI_LarkAI_Definition)));
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(string);
            m104747a(string, arrayList, true);
            m104745a(this.f71838f);
        } catch (JSONException e) {
            String str = this.TAG;
            Log.m165383e(str, "err! " + e.getMessage());
            finish();
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m104744a(int i, EntityCard entityCard) {
        m104746a(entityCard);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: b */
    private /* synthetic */ void m104748b(int i, EntityCard entityCard) {
        m104746a(entityCard);
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.entity_list_page, viewGroup, false);
        this.f71838f = inflate;
        return inflate;
    }

    /* renamed from: a */
    private void m104747a(String str, List<String> list, boolean z) {
        if (z) {
            this.f71836d.add(0, new C28564a(str, true));
        } else {
            this.f71836d.add(0, new C28564a(str, list, false));
        }
    }
}
