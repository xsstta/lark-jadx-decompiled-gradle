package com.ss.android.lark.apihandler.basic.jsapi.notification;

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
        /* class com.ss.android.lark.apihandler.basic.jsapi.notification.ActionSheetHandlerV2.C287853 */

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
    private Context f72351a;

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.apihandler.basic.jsapi.notification.ActionSheetHandlerV2$d */
    public interface AbstractC28790d {
        /* renamed from: a */
        void mo102310a(int i);
    }

    @Override // com.larksuite.component.webview.container.dto.AbstractInjectJSApiHandler
    public int describeContents() {
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.apihandler.basic.jsapi.notification.ActionSheetHandlerV2$a */
    public static class C28786a {

        /* renamed from: a */
        private String f72358a;

        /* renamed from: b */
        private int f72359b;

        /* renamed from: a */
        public String mo102315a() {
            return this.f72358a;
        }

        /* renamed from: b */
        public int mo102316b() {
            return this.f72359b;
        }

        public C28786a(String str, int i) {
            this.f72358a = str;
            this.f72359b = i;
        }
    }

    public ActionSheetHandlerV2() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.apihandler.basic.jsapi.notification.ActionSheetHandlerV2$b */
    public static class C28787b extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

        /* renamed from: a */
        List<C28786a> f72360a;

        /* renamed from: b */
        AbstractC28790d f72361b;

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.f72360a.size();
        }

        /* renamed from: a */
        public void mo102317a(AbstractC28790d dVar) {
            this.f72361b = dVar;
        }

        public C28787b(List<C28786a> list) {
            ArrayList arrayList = new ArrayList();
            this.f72360a = arrayList;
            arrayList.addAll(list);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemViewType(int i) {
            return this.f72360a.get(i).mo102316b();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, final int i) {
            TextView textView = (TextView) viewHolder.itemView;
            textView.setText(this.f72360a.get(i).mo102315a());
            textView.setOnClickListener(new View.OnClickListener() {
                /* class com.ss.android.lark.apihandler.basic.jsapi.notification.ActionSheetHandlerV2.C28787b.View$OnClickListenerC287881 */

                public void onClick(View view) {
                    if (C28787b.this.f72361b != null) {
                        C28787b.this.f72361b.mo102310a(i - 1);
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
            return new C28789c(textView);
        }
    }

    /* renamed from: com.ss.android.lark.apihandler.basic.jsapi.notification.ActionSheetHandlerV2$c */
    static class C28789c extends RecyclerView.ViewHolder {
        public C28789c(View view) {
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
        this.f72351a = mo91997u();
    }

    /* renamed from: a */
    private ArrayList<C28786a> m105489a(ActionSheetModel actionSheetModel) {
        ArrayList<C28786a> arrayList = new ArrayList<>();
        arrayList.add(new C28786a(actionSheetModel.getTitle(), 0));
        for (String str : actionSheetModel.getOtherButtons()) {
            arrayList.add(new C28786a(str, 1));
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
            View inflate = LayoutInflater.from(this.f72351a).inflate(R.layout.dialog_action_sheet, (ViewGroup) null);
            RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.recycle_view_action_sheet);
            recyclerView.addItemDecoration(new C26174a.C26176a(this.f72351a).mo93154e(R.color.lkui_N600).mo93147a(1.0f).mo93149a());
            recyclerView.setLayoutManager(new LinearLayoutManager(this.f72351a, 1, false));
            TextView textView = (TextView) inflate.findViewById(R.id.text_action_sheet_cancel);
            final Dialog a = C58339d.m226190a(this.f72351a, inflate);
            if (a != null) {
                C28787b bVar = new C28787b(m105489a(actionSheetModel));
                textView.setOnClickListener(new View.OnClickListener() {
                    /* class com.ss.android.lark.apihandler.basic.jsapi.notification.ActionSheetHandlerV2.View$OnClickListenerC287831 */

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
                bVar.mo102317a(new AbstractC28790d() {
                    /* class com.ss.android.lark.apihandler.basic.jsapi.notification.ActionSheetHandlerV2.C287842 */

                    @Override // com.ss.android.lark.apihandler.basic.jsapi.notification.ActionSheetHandlerV2.AbstractC28790d
                    /* renamed from: a */
                    public void mo102310a(int i) {
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
