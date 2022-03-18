package com.bytedance.ee.bear.lark.selector;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import butterknife.ButterKnife;
import com.bytedance.ee.bear.lark.selector.base.C8106e;
import com.bytedance.ee.bear.lark.selector.base.C8114g;
import com.bytedance.ee.bear.lark.selector.base.ISelectorView;
import com.bytedance.ee.bear.lark.selector.base.SelectorView;
import com.bytedance.ee.log.C13479a;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.base.fragment.BaseFragment;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.recyclerview.AbstractView$OnClickListenerC58987e;
import com.ss.android.lark.widget.recyclerview.C58984d;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.ee.bear.lark.selector.b */
public class C8085b extends BaseFragment {

    /* renamed from: a */
    public View f21638a;

    /* renamed from: b */
    private SelectorView<DocSelectorViewData> f21639b;

    /* renamed from: c */
    private C8106e f21640c;

    /* renamed from: d */
    private String f21641d = "";

    /* renamed from: e */
    private int f21642e = 10;

    /* renamed from: f */
    private String f21643f = "";

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.lark.selector.b$a */
    public class C8087a implements ISelectorView.AbstractC8089b<DocSelectorViewData, ISelectorView> {
        @Override // com.bytedance.ee.bear.lark.selector.base.ISelectorView.AbstractC8089b
        /* renamed from: a */
        public void mo31238a() {
            C8085b.this.finish();
        }

        private C8087a() {
        }

        @Override // com.bytedance.ee.bear.lark.selector.base.ISelectorView.AbstractC8089b
        /* renamed from: a */
        public String mo31237a(int i) {
            return UIHelper.mustacheFormat((int) R.string.Lark_Legacy_SelectedCountHint, "select_count", Integer.toString(i));
        }

        @Override // com.bytedance.ee.bear.lark.selector.base.ISelectorView.AbstractC8089b
        /* renamed from: a */
        public void mo31239a(ISelectorView iSelectorView) {
            ButterKnife.bind(iSelectorView, C8085b.this.f21638a);
        }

        @Override // com.bytedance.ee.bear.lark.selector.base.ISelectorView.AbstractC8089b
        /* renamed from: b */
        public void mo31241b(List<DocSelectorViewData> list) {
            if (!CollectionUtils.isEmpty(list)) {
                Bundle bundle = new Bundle();
                bundle.putSerializable("selected_items", new ArrayList(list));
                Intent intent = new Intent(C8085b.this.getContext(), DocConfirmActivity.class);
                intent.putExtras(bundle);
                C8085b.this.startActivityForResult(intent, 1);
            }
        }

        @Override // com.bytedance.ee.bear.lark.selector.base.ISelectorView.AbstractC8089b
        /* renamed from: a */
        public void mo31240a(List<DocSelectorViewData> list) {
            if (list.isEmpty()) {
                C8085b.this.setResult(0);
            } else {
                ArrayList<String> arrayList = new ArrayList<>();
                JSONArray jSONArray = new JSONArray();
                for (DocSelectorViewData docSelectorViewData : list) {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("filePath", docSelectorViewData.docUrl);
                        jSONObject.put("fileName", docSelectorViewData.title);
                        jSONArray.put(jSONObject);
                    } catch (JSONException e) {
                        C13479a.m54758a(C8085b.this.TAG, e.toString());
                    }
                    arrayList.add(docSelectorViewData.docUrl);
                }
                Intent intent = new Intent();
                intent.putStringArrayListExtra(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, arrayList);
                intent.putExtra("extra_selected_data", jSONArray.toString());
                C8085b.this.setResult(-1, intent);
            }
            C8085b.this.finish();
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.base.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        C8106e eVar = this.f21640c;
        if (eVar != null) {
            eVar.destroy();
        }
    }

    /* renamed from: a */
    private void m32345a() {
        String str;
        String str2;
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f21641d = arguments.getString("extra_title");
            this.f21642e = arguments.getInt("extra_max_num", 10);
            this.f21643f = arguments.getString("extra_confirm_text");
        }
        C8118d dVar = new C8118d();
        SelectorView<DocSelectorViewData> selectorView = new SelectorView<>(getActivity(), new C8087a());
        this.f21639b = selectorView;
        C8114g.C8116a b = C8114g.m32398a().mo31287a(1).mo31291b(1);
        if (TextUtils.isEmpty(this.f21641d)) {
            str = getString(R.string.Lark_Legacy_SendDocTitle);
        } else {
            str = this.f21641d;
        }
        C8114g.C8116a a = b.mo31289a(str);
        if (TextUtils.isEmpty(this.f21643f)) {
            str2 = getString(R.string.Lark_Legacy_Send);
        } else {
            str2 = this.f21643f;
        }
        selectorView.mo31247a(a.mo31292b(str2).mo31293c(this.f21642e).mo31288a(new SelectorView.AbstractC8099a<DocSelectorViewData>() {
            /* class com.bytedance.ee.bear.lark.selector.C8085b.C80861 */

            @Override // com.bytedance.ee.bear.lark.selector.base.SelectorView.AbstractC8099a
            /* renamed from: a */
            public AbstractView$OnClickListenerC58987e.AbstractC58989b<DocSelectorViewData> mo31236a(C58984d dVar) {
                return new C8126g(C8085b.this.getContext(), dVar);
            }
        }).mo31290a());
        C8106e eVar = new C8106e(this.f21639b, dVar);
        this.f21640c = eVar;
        eVar.create();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        m32345a();
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.activity_chat_docs_select, viewGroup, false);
        this.f21638a = inflate;
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == -1 && i == 1) {
            this.f21639b.mo31248a((List) intent.getSerializableExtra("result_confirm_data"));
        }
    }
}
