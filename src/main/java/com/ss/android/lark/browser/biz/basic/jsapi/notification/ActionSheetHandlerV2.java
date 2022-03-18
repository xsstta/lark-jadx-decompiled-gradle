package com.ss.android.lark.browser.biz.basic.jsapi.notification;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.component.webview.container.dto.AbstractC25832c;
import com.larksuite.component.webview.container.dto.AbstractInjectJSApiHandler;
import com.larksuite.framework.ui.C26174a;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.openapi.jsapi.entity.ActionSheetModel;
import com.ss.android.lark.widget.p2932c.C58339d;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public class ActionSheetHandlerV2 extends AbstractInjectJSApiHandler<ActionSheetModel> implements Parcelable {
    public static final Parcelable.Creator<ActionSheetHandlerV2> CREATOR = new Parcelable.Creator<ActionSheetHandlerV2>() {
        /* class com.ss.android.lark.browser.biz.basic.jsapi.notification.ActionSheetHandlerV2.C297183 */

        /* renamed from: a */
        public ActionSheetHandlerV2[] newArray(int i) {
            return new ActionSheetHandlerV2[i];
        }

        /* renamed from: a */
        public ActionSheetHandlerV2 createFromParcel(Parcel parcel) {
            return new ActionSheetHandlerV2(parcel);
        }
    };

    /* renamed from: a */
    private Context f74418a;

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.browser.biz.basic.jsapi.notification.ActionSheetHandlerV2$d */
    public interface AbstractC29723d {
        /* renamed from: a */
        void mo107062a(int i);
    }

    @Override // com.larksuite.component.webview.container.dto.AbstractInjectJSApiHandler
    public int describeContents() {
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.browser.biz.basic.jsapi.notification.ActionSheetHandlerV2$a */
    public static class C29719a {

        /* renamed from: a */
        private String f74425a;

        /* renamed from: b */
        private int f74426b;

        /* renamed from: a */
        public String mo107067a() {
            return this.f74425a;
        }

        /* renamed from: b */
        public int mo107068b() {
            return this.f74426b;
        }

        public C29719a(String str, int i) {
            this.f74425a = str;
            this.f74426b = i;
        }
    }

    public ActionSheetHandlerV2() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.browser.biz.basic.jsapi.notification.ActionSheetHandlerV2$b */
    public static class C29720b extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

        /* renamed from: a */
        List<C29719a> f74427a;

        /* renamed from: b */
        AbstractC29723d f74428b;

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.f74427a.size();
        }

        /* renamed from: a */
        public void mo107069a(AbstractC29723d dVar) {
            this.f74428b = dVar;
        }

        public C29720b(List<C29719a> list) {
            ArrayList arrayList = new ArrayList();
            this.f74427a = arrayList;
            arrayList.addAll(list);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemViewType(int i) {
            return this.f74427a.get(i).mo107068b();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, final int i) {
            TextView textView = (TextView) viewHolder.itemView;
            textView.setText(this.f74427a.get(i).mo107067a());
            textView.setOnClickListener(new View.OnClickListener() {
                /* class com.ss.android.lark.browser.biz.basic.jsapi.notification.ActionSheetHandlerV2.C29720b.View$OnClickListenerC297211 */

                public void onClick(View view) {
                    if (C29720b.this.f74428b != null) {
                        C29720b.this.f74428b.mo107062a(i - 1);
                    }
                }
            });
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            TextView textView = new TextView(viewGroup.getContext());
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, UIUtils.dp2px(viewGroup.getContext(), 40.0f));
            textView.setGravity(17);
            if (i == 0) {
                textView.setTextColor(viewGroup.getContext().getResources().getColor(R.color.lkui_N600));
                textView.setTextSize(2, 13.0f);
            } else if (i == 1) {
                textView.setTextColor(viewGroup.getContext().getResources().getColor(R.color.lkui_B500));
                textView.setTextSize(2, 20.0f);
            }
            textView.setLayoutParams(layoutParams);
            return new C29722c(textView);
        }
    }

    /* renamed from: com.ss.android.lark.browser.biz.basic.jsapi.notification.ActionSheetHandlerV2$c */
    static class C29722c extends RecyclerView.ViewHolder {
        public C29722c(View view) {
            super(view);
        }
    }

    protected ActionSheetHandlerV2(Parcel parcel) {
        super(parcel);
    }

    /* access modifiers changed from: protected */
    @Override // com.larksuite.component.webview.container.dto.AbstractInjectJSApiHandler, com.larksuite.component.webview.container.impl.jsapi.AbstractC25869a
    /* renamed from: a */
    public void mo91860a(Bundle bundle) {
        this.f74418a = mo91997u();
    }

    /* renamed from: a */
    private ArrayList<C29719a> m109926a(ActionSheetModel actionSheetModel) {
        ArrayList<C29719a> arrayList = new ArrayList<>();
        arrayList.add(new C29719a(actionSheetModel.getTitle(), 0));
        for (String str : actionSheetModel.getOtherButtons()) {
            arrayList.add(new C29719a(str, 1));
        }
        return arrayList;
    }

    @Override // com.larksuite.component.webview.container.dto.AbstractInjectJSApiHandler
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo91861a(ActionSheetModel actionSheetModel, final AbstractC25832c cVar) {
        if (actionSheetModel != null && cVar != null && !TextUtils.isEmpty(actionSheetModel.getTitle()) && actionSheetModel.getOtherButtons() != null && actionSheetModel.getOtherButtons().size() != 0) {
            View inflate = LayoutInflater.from(this.f74418a).inflate(R.layout.dialog_action_sheet, (ViewGroup) null);
            RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.recycle_view_action_sheet);
            recyclerView.addItemDecoration(new C26174a.C26176a(this.f74418a).mo93154e(R.color.lkui_N600).mo93147a(1.0f).mo93149a());
            recyclerView.setLayoutManager(new LinearLayoutManager(this.f74418a, 1, false));
            TextView textView = (TextView) inflate.findViewById(R.id.text_action_sheet_cancel);
            final Dialog a = C58339d.m226190a(this.f74418a, inflate);
            if (a != null) {
                C29720b bVar = new C29720b(m109926a(actionSheetModel));
                textView.setOnClickListener(new View.OnClickListener() {
                    /* class com.ss.android.lark.browser.biz.basic.jsapi.notification.ActionSheetHandlerV2.View$OnClickListenerC297161 */

                    public void onClick(View view) {
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("buttonIndex", -1);
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                        cVar.mo91902a(jSONObject.toString());
                        a.dismiss();
                    }
                });
                bVar.mo107069a(new AbstractC29723d() {
                    /* class com.ss.android.lark.browser.biz.basic.jsapi.notification.ActionSheetHandlerV2.C297172 */

                    @Override // com.ss.android.lark.browser.biz.basic.jsapi.notification.ActionSheetHandlerV2.AbstractC29723d
                    /* renamed from: a */
                    public void mo107062a(int i) {
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("buttonIndex", i);
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                        cVar.mo91902a(jSONObject.toString());
                        a.dismiss();
                    }
                });
                recyclerView.setAdapter(bVar);
            }
        }
    }
}
