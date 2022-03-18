package com.ss.android.lark.invitation.v2.feat.member.common;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.larksuite.component.ui.dialog.C25639g;
import com.larksuite.component.ui.dialog.DialogC25637f;
import com.larksuite.suite.R;
import com.ss.android.lark.inv.export.api.InvitationServiceApi;
import com.ss.android.lark.inv.export.util.C40147z;
import com.ss.android.lark.invitation.v2.statistic.InvHitPoint;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.dialog.AbstractC58413a;
import com.ss.android.lark.widget.recyclerview.PullDownRecyclerView;
import com.ss.android.lark.widget.recyclerview.p2964a.AbstractC58968a;
import com.ss.android.lark.widget.recyclerview.p2964a.C58973b;
import com.ss.android.lark.widget.recyclerview.p2964a.C58974c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.lark.invitation.v2.feat.member.common.b */
public class C40334b extends AbstractC58413a<C40334b> {

    /* renamed from: a */
    private List<String> f102477a;

    /* renamed from: b */
    private List<String> f102478b;

    /* renamed from: c */
    private Map<String, InvitationServiceApi.C40082a> f102479c;

    /* renamed from: d */
    private TextView f102480d;

    /* renamed from: e */
    private PullDownRecyclerView f102481e;

    /* renamed from: f */
    private TextView f102482f;

    @Override // com.ss.android.lark.widget.dialog.AbstractC58413a
    /* renamed from: a */
    public int mo145866a() {
        return R.layout.inv_invite_member_bulk_failed_drawer_dialog;
    }

    /* renamed from: c */
    private String m159883c() {
        HashMap hashMap = new HashMap();
        hashMap.put("SUM", String.valueOf(this.f102477a.size()));
        hashMap.put("SUC_SUM", String.valueOf(this.f102477a.size() - this.f102479c.size()));
        return UIHelper.mustacheFormat((int) R.string.Lark_Invitation_MembersBatchFeedHasFailedContent, hashMap);
    }

    /* renamed from: d */
    private Map<String, List<String>> m159884d() {
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, InvitationServiceApi.C40082a> entry : this.f102479c.entrySet()) {
            String str = entry.getValue().f101872b;
            List list = (List) hashMap.get(str);
            if (list == null) {
                list = new ArrayList();
                hashMap.put(str, list);
            }
            int indexOf = this.f102477a.indexOf(entry.getKey());
            if (indexOf != -1) {
                list.add(this.f102478b.get(indexOf));
            }
        }
        return hashMap;
    }

    @Override // com.ss.android.lark.widget.dialog.AbstractC58413a
    /* renamed from: a */
    public C25639g mo145867a(C25639g gVar) {
        return gVar.mo89234b(1.0f);
    }

    /* renamed from: com.ss.android.lark.invitation.v2.feat.member.common.b$a */
    static class C40337a extends AbstractC58968a<C40337a> {

        /* renamed from: a */
        private String f102485a;

        /* renamed from: b */
        private List<String> f102486b;

        /* renamed from: a */
        static List<C40337a> m159890a(Map<String, List<String>> map) {
            ArrayList arrayList = new ArrayList();
            for (Map.Entry<String, List<String>> entry : map.entrySet()) {
                arrayList.add(new C40337a(entry.getKey(), entry.getValue()));
            }
            return arrayList;
        }

        public C40337a(String str, List<String> list) {
            super(R.layout.inv_invite_member_bulk_failed_item);
            this.f102485a = str;
            this.f102486b = list;
        }

        @Override // com.ss.android.lark.widget.recyclerview.p2964a.AbstractC58968a
        /* renamed from: a */
        public void mo101671a(C58974c cVar, int i) {
            String str;
            TextView textView = (TextView) cVar.mo200081a(R.id.imbfItemTv);
            if (C40147z.m159160a().isEnLanguage()) {
                str = ", ";
            } else {
                str = "、";
            }
            StringBuilder sb = new StringBuilder();
            for (String str2 : this.f102486b) {
                sb.append(str);
                sb.append(str2);
            }
            sb.delete(0, str.length());
            textView.setText(this.f102485a + "\n" + sb.toString());
        }
    }

    @Override // com.ss.android.lark.widget.dialog.AbstractC58413a
    /* renamed from: c */
    public void mo145868c(DialogC25637f fVar) {
        this.f102480d = (TextView) fVar.findViewById(R.id.imbfSubTitleTv);
        this.f102481e = (PullDownRecyclerView) fVar.findViewById(R.id.imbfRv);
        this.f102482f = (TextView) fVar.findViewById(R.id.imbfOkTv);
        this.f102480d.setText(m159883c());
        C58973b bVar = new C58973b();
        bVar.mo200080a(C40337a.m159890a(m159884d()));
        this.f102481e.setAdapter(bVar);
        this.f102481e.setLayoutManager(new LinearLayoutManager(this.f143774l));
        this.f102481e.setOnPullDownListener(new PullDownRecyclerView.AbstractC58966a() {
            /* class com.ss.android.lark.invitation.v2.feat.member.common.C40334b.C403351 */

            @Override // com.ss.android.lark.widget.recyclerview.PullDownRecyclerView.AbstractC58966a
            /* renamed from: a */
            public void mo145869a(MotionEvent motionEvent) {
                C40334b.this.f143778p.dispatchTouchEvent(motionEvent);
            }

            @Override // com.ss.android.lark.widget.recyclerview.PullDownRecyclerView.AbstractC58966a
            /* renamed from: b */
            public void mo145870b(MotionEvent motionEvent) {
                C40334b.this.f143778p.dispatchTouchEvent(motionEvent);
            }
        });
        this.f102482f.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.invitation.v2.feat.member.common.C40334b.View$OnClickListenerC403362 */

            public void onClick(View view) {
                C40334b.this.mo197766g();
                InvHitPoint.m160394m();
            }
        });
    }

    public C40334b(Context context, List<String> list, List<String> list2, Map<String, InvitationServiceApi.C40082a> map) {
        super(context);
        this.f102477a = list;
        this.f102478b = list2;
        this.f102479c = map;
        mo197762a(false);
    }
}
