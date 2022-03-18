package com.bytedance.ee.bear.drive.view.preview.ttreader;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ee.bear.drive.biz.plugin.C6535d;
import com.bytedance.ee.bear.drive.view.preview.ttreader.TTReaderExcelView;
import com.bytedance.ee.bear.drive.view.preview.wrapper.C7553d;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.plugin.common.PluginManager;
import com.bytedance.ee.plugin.common.ttreader.ITTOfficePlugin;
import com.bytedance.ee.plugin.common.ttreader.ITTReaderViewWrapper;
import com.larksuite.suite.R;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import org.json.JSONObject;

public class TTReaderExcelView extends TTReaderBaseView {

    /* renamed from: e */
    private C7436b f20029e;

    /* renamed from: com.bytedance.ee.bear.drive.view.preview.ttreader.TTReaderExcelView$a */
    public class C7434a extends RecyclerView.Adapter<C7435a> {

        /* renamed from: b */
        private ArrayList<String> f20033b;

        /* renamed from: c */
        private int f20034c;

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            ArrayList<String> arrayList = this.f20033b;
            if (arrayList != null) {
                return arrayList.size();
            }
            return 0;
        }

        /* renamed from: a */
        public void mo29025a(int i) {
            this.f20034c = i;
        }

        public C7434a() {
        }

        /* renamed from: a */
        public void mo29027a(ArrayList<String> arrayList) {
            this.f20033b = arrayList;
        }

        /* access modifiers changed from: private */
        /* renamed from: com.bytedance.ee.bear.drive.view.preview.ttreader.TTReaderExcelView$a$a */
        public class C7435a extends RecyclerView.ViewHolder {

            /* renamed from: a */
            TextView f20035a;

            /* access modifiers changed from: private */
            /* renamed from: a */
            public /* synthetic */ void m29754a(View view) {
                TTReaderExcelView.this.f20014a.turnTo(getAdapterPosition());
                C7434a.this.mo29025a(getAdapterPosition());
                C7434a.this.notifyDataSetChanged();
            }

            public C7435a(View view) {
                super(view);
                this.f20035a = (TextView) view.findViewById(R.id.excel_header_itemName);
                view.setOnClickListener(new View.OnClickListener() {
                    /* class com.bytedance.ee.bear.drive.view.preview.ttreader.$$Lambda$TTReaderExcelView$a$a$OAnAOy4jB8BHshhFUcAVTIH_MZg */

                    public final void onClick(View view) {
                        TTReaderExcelView.C7434a.C7435a.lambda$OAnAOy4jB8BHshhFUcAVTIH_MZg(TTReaderExcelView.C7434a.C7435a.this, view);
                    }
                });
            }
        }

        /* renamed from: a */
        public C7435a onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new C7435a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.drive_excel_tab_item, viewGroup, false));
        }

        /* renamed from: a */
        public void onBindViewHolder(C7435a aVar, int i) {
            aVar.f20035a.setText(this.f20033b.get(i));
            if (i == this.f20034c) {
                aVar.f20035a.setTextColor(TTReaderExcelView.this.getResources().getColor(R.color.primary_pri_500));
                aVar.f20035a.setBackgroundColor(TTReaderExcelView.this.getResources().getColor(R.color.bg_body));
                return;
            }
            aVar.f20035a.setTextColor(TTReaderExcelView.this.getResources().getColor(R.color.text_title));
            aVar.f20035a.setBackgroundColor(TTReaderExcelView.this.getResources().getColor(R.color.bg_body_overlay));
        }
    }

    /* renamed from: a */
    public void mo29023a(C7436b bVar) {
        this.f20029e = bVar;
    }

    /* renamed from: com.bytedance.ee.bear.drive.view.preview.ttreader.TTReaderExcelView$b */
    public static class C7436b {

        /* renamed from: a */
        public C7553d f20037a;

        public C7436b(C7553d dVar) {
            this.f20037a = dVar;
        }
    }

    public TTReaderExcelView(Context context) {
        super(context);
        m29747a(context);
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.ttreader.TTReaderBaseView
    /* renamed from: d */
    public void mo29013d(String str) {
        String str2;
        Uri fromFile = Uri.fromFile(new File(this.f20029e.f20037a.mo29485e()));
        if (!TextUtils.isEmpty(this.f20029e.f20037a.mo29483d())) {
            str2 = this.f20029e.f20037a.mo29483d();
        } else {
            str2 = this.f20029e.f20037a.mo29494m();
        }
        this.f20014a.openBook(fromFile, str, str2);
        this.f20014a.turnTo(0);
    }

    /* renamed from: a */
    private void m29747a(Context context) {
        LayoutInflater.from(context).inflate(R.layout.drive_ttreader_excel_view, (ViewGroup) this, true);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.excel_header_recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
        final C7434a aVar = new C7434a();
        recyclerView.setAdapter(aVar);
        this.f20014a = ((ITTOfficePlugin) PluginManager.getPluginApi(ITTOfficePlugin.class)).newTTReaderViewWrapper(C6535d.m26238a().mo26099i());
        ((LinearLayout) findViewById(R.id.excel_content)).addView(this.f20014a.getTTReaderView(), new ViewGroup.LayoutParams(-1, -1));
        this.f20014a.setListener(new ITTReaderViewWrapper.Listener() {
            /* class com.bytedance.ee.bear.drive.view.preview.ttreader.TTReaderExcelView.C74331 */

            @Override // com.bytedance.ee.plugin.common.ttreader.ITTReaderViewWrapper.Listener
            public void onReport(String str, JSONObject jSONObject) {
                TTReaderExcelView.this.mo29010a(str, jSONObject);
            }

            @Override // com.bytedance.ee.plugin.common.ttreader.ITTReaderViewWrapper.Listener
            public void onError(int i, Bundle bundle) {
                String str;
                if (bundle != null) {
                    str = bundle.toString();
                } else {
                    str = "";
                }
                String format = String.format("onError what: %s, data: %s", String.valueOf(i), str);
                Throwable th = new Throwable(format);
                C13479a.m54758a("TTReaderExcelView", format);
                if (i != 2002) {
                    TTReaderExcelView.this.mo29009a("tt_excel", th);
                }
                if (i == 2000 || i == 2001) {
                    if (TTReaderExcelView.this.f20017d != null) {
                        TTReaderExcelView.this.f20017d.getliveInnerDowngrade().mo5926a((Integer) 2);
                    }
                } else if (i == 2002) {
                    TTReaderExcelView.this.mo29006a();
                }
            }

            @Override // com.bytedance.ee.plugin.common.ttreader.ITTReaderViewWrapper.Listener
            public void onInfo(int i, Bundle bundle) {
                C13479a.m54764b("TTReaderExcelView", "onInfo what: " + i);
                if (i == 1000) {
                    String string = bundle.getString("page_list");
                    if (string != null) {
                        String[] split = string.split(":");
                        ArrayList<String> arrayList = new ArrayList<>(split.length);
                        Collections.addAll(arrayList, split);
                        aVar.mo29027a(arrayList);
                        aVar.notifyDataSetChanged();
                    }
                    TTReaderExcelView.this.mo29011b("tt_excel");
                    TTReaderExcelView.this.mo29008a("tt_excel");
                } else if (i == 1004 && bundle != null) {
                    TTReaderExcelView.this.mo29012c(bundle.getString("link"));
                }
            }
        });
    }

    public TTReaderExcelView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m29747a(context);
    }

    public TTReaderExcelView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m29747a(context);
    }
}
