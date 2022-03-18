package com.ss.android.lark.browser.biz.messenger.jsapi;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.larksuite.component.webview.container.dto.AbstractC25832c;
import com.larksuite.component.webview.container.dto.AbstractInjectJSApiHandler;
import com.larksuite.suite.R;
import com.ss.android.lark.browser.C29638a;
import com.ss.android.lark.browser.dependency.IBrowserModuleDependency;
import com.ss.android.lark.openapi.jsapi.entity.MultiSelectParams;
import com.ss.android.lark.ui.dialog.C57596a;
import com.ss.android.lark.ui.dialog.ComponentDialog;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

public class MultiSelectHandlerV2 extends AbstractInjectJSApiHandler<MultiSelectParams> implements Parcelable {
    public static final Parcelable.Creator<MultiSelectHandlerV2> CREATOR = new Parcelable.Creator<MultiSelectHandlerV2>() {
        /* class com.ss.android.lark.browser.biz.messenger.jsapi.MultiSelectHandlerV2.C298042 */

        /* renamed from: a */
        public MultiSelectHandlerV2[] newArray(int i) {
            return new MultiSelectHandlerV2[i];
        }

        /* renamed from: a */
        public MultiSelectHandlerV2 createFromParcel(Parcel parcel) {
            return new MultiSelectHandlerV2(parcel);
        }
    };

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.browser.biz.messenger.jsapi.MultiSelectHandlerV2$a */
    public static class C29807a extends BaseAdapter {

        /* renamed from: a */
        public Set<Integer> f74528a = new HashSet();

        /* renamed from: b */
        private MultiSelectParams f74529b;

        /* renamed from: c */
        private LayoutInflater f74530c;

        public long getItemId(int i) {
            return (long) i;
        }

        /* renamed from: com.ss.android.lark.browser.biz.messenger.jsapi.MultiSelectHandlerV2$a$a */
        static class C29809a {

            /* renamed from: a */
            public RelativeLayout f74533a;

            /* renamed from: b */
            public TextView f74534b;

            /* renamed from: c */
            public RadioButton f74535c;

            C29809a() {
            }
        }

        /* renamed from: a */
        public Set<Integer> mo107355a() {
            return this.f74528a;
        }

        public int getCount() {
            return this.f74529b.getOptions().size();
        }

        /* renamed from: b */
        private void m110217b() {
            int size = this.f74529b.getOptions().size();
            if (size != 0) {
                for (int i = 0; i < size; i++) {
                    if (this.f74529b.getSelectOption().contains(this.f74529b.getOptions().get(i))) {
                        this.f74528a.add(Integer.valueOf(i));
                    }
                }
            }
        }

        public Object getItem(int i) {
            return this.f74529b.getOptions().get(i);
        }

        public C29807a(Context context, MultiSelectParams multiSelectParams) {
            this.f74529b = multiSelectParams;
            this.f74530c = LayoutInflater.from(context);
            m110217b();
        }

        public View getView(final int i, View view, ViewGroup viewGroup) {
            C29809a aVar = new C29809a();
            if (view == null) {
                view = this.f74530c.inflate(R.layout.dialog_web_chosen_item, (ViewGroup) null);
                aVar.f74534b = (TextView) view.findViewById(R.id.dialog_web_chosen_item_text);
                aVar.f74535c = (RadioButton) view.findViewById(R.id.dialog_web_chosen_item_radio);
                aVar.f74533a = (RelativeLayout) view.findViewById(R.id.dialog_web_chosen_item);
                view.setTag(aVar);
            } else {
                aVar = (C29809a) view.getTag();
            }
            aVar.f74534b.setText(this.f74529b.getOptions().get(i));
            if (this.f74528a.contains(Integer.valueOf(i))) {
                aVar.f74535c.setChecked(true);
            } else {
                aVar.f74535c.setChecked(false);
            }
            aVar.f74533a.setOnClickListener(new View.OnClickListener() {
                /* class com.ss.android.lark.browser.biz.messenger.jsapi.MultiSelectHandlerV2.C29807a.View$OnClickListenerC298081 */

                public void onClick(View view) {
                    if (C29807a.this.f74528a.contains(Integer.valueOf(i))) {
                        C29807a.this.f74528a.remove(Integer.valueOf(i));
                    } else {
                        C29807a.this.f74528a.add(Integer.valueOf(i));
                    }
                    C29807a.this.notifyDataSetChanged();
                }
            });
            return view;
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.larksuite.component.webview.container.dto.AbstractInjectJSApiHandler, com.larksuite.component.webview.container.impl.jsapi.AbstractC25869a
    /* renamed from: a */
    public void mo91860a(Bundle bundle) {
    }

    @Override // com.larksuite.component.webview.container.dto.AbstractInjectJSApiHandler
    public int describeContents() {
        return 0;
    }

    public MultiSelectHandlerV2() {
    }

    protected MultiSelectHandlerV2(Parcel parcel) {
        super(parcel);
    }

    /* renamed from: a */
    private void m110208a(ComponentDialog componentDialog) {
        FrameLayout a = componentDialog.mo195575a();
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) a.getLayoutParams();
        layoutParams.setMargins(0, 0, 0, 0);
        a.setLayoutParams(layoutParams);
        FrameLayout b = componentDialog.mo195577b();
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) b.getLayoutParams();
        layoutParams2.setMargins(0, 0, 0, 0);
        b.setLayoutParams(layoutParams2);
    }

    @Override // com.larksuite.component.webview.container.dto.AbstractInjectJSApiHandler
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
    }

    /* renamed from: b */
    private ComponentDialog m110210b(MultiSelectParams multiSelectParams, AbstractC25832c cVar) {
        ComponentDialog componentDialog = new ComponentDialog(mo91997u());
        ListView listView = new ListView(mo91997u());
        C29807a aVar = new C29807a(mo91997u(), multiSelectParams);
        listView.setAdapter((ListAdapter) aVar);
        m110208a(componentDialog);
        componentDialog.mo195576a(listView);
        m110209a(componentDialog, aVar, cVar);
        return componentDialog;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo91861a(MultiSelectParams multiSelectParams, AbstractC25832c cVar) {
        if (cVar != null && multiSelectParams != null && multiSelectParams.getOptions() != null && multiSelectParams.getOptions().size() != 0) {
            final ComponentDialog b = m110210b(multiSelectParams, cVar);
            IBrowserModuleDependency.AbstractC29900p watermarkDependency = C29638a.m109622a().getWatermarkDependency();
            if (!watermarkDependency.mo107726a()) {
                C29638a.m109622a().getLoginDependency().mo107681a(b.getContext(), R.color.lkui_transparent, new IBrowserModuleDependency.AbstractC29891h.AbstractC29892a() {
                    /* class com.ss.android.lark.browser.biz.messenger.jsapi.MultiSelectHandlerV2.C298031 */
                });
            } else {
                watermarkDependency.mo107725a(b);
            }
            b.show();
        }
    }

    /* renamed from: a */
    private void m110209a(final ComponentDialog componentDialog, final C29807a aVar, final AbstractC25832c cVar) {
        C57596a.C57600a.C57601a a = C57596a.C57600a.m223645a(1, mo91997u().getResources().getColor(R.color.black), "确定");
        C57596a.C57600a.C57601a a2 = C57596a.C57600a.m223645a(2, mo91997u().getResources().getColor(R.color.black), "取消");
        final RunnableC298053 r4 = new Runnable() {
            /* class com.ss.android.lark.browser.biz.messenger.jsapi.MultiSelectHandlerV2.RunnableC298053 */

            public void run() {
                Set<Integer> a = aVar.mo107355a();
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("code", 1);
                    jSONObject.put("indexArray", a);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
                cVar.mo91902a(jSONObject.toString());
            }
        };
        componentDialog.mo195578b(C57596a.m223644a(new C57596a.C57600a.C57601a[]{a, a2}, mo91997u(), new C57596a.AbstractC57602b() {
            /* class com.ss.android.lark.browser.biz.messenger.jsapi.MultiSelectHandlerV2.C298064 */

            @Override // com.ss.android.lark.ui.dialog.C57596a.AbstractC57602b
            /* renamed from: a */
            public void mo107354a(int i) {
                Runnable runnable;
                if (i == 1 && (runnable = r4) != null) {
                    runnable.run();
                }
                componentDialog.dismiss();
            }
        }));
    }
}
