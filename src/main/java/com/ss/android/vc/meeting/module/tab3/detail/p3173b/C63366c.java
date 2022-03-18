package com.ss.android.vc.meeting.module.tab3.detail.p3173b;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.suite.R;
import com.ss.android.lark.widget.listener.OnSingleClickListener;
import com.ss.android.vc.VideoChatModule;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60742af;
import com.ss.android.vc.common.p3083e.C60773o;
import com.ss.android.vc.entity.MeetingStatus;
import com.ss.android.vc.entity.tab.VCTabRecordInfo;
import com.ss.android.vc.meeting.module.tab3.detail.p3172a.C63328a;
import com.ss.android.vc.statistics.event.ce;
import com.ss.android.vc.statistics.event2.VcTabListEvent;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.vc.meeting.module.tab3.detail.b.c */
public class C63366c extends RecyclerView.Adapter<C63368a> {

    /* renamed from: a */
    public C63328a.AbstractC63332b.AbstractC63333a f159973a;

    /* renamed from: b */
    public String f159974b;

    /* renamed from: c */
    public String f159975c;

    /* renamed from: d */
    private VCTabRecordInfo.RecordType f159976d;

    /* renamed from: e */
    private List<String> f159977e;

    /* renamed from: f */
    private String f159978f;

    /* renamed from: a */
    public void mo219279a() {
        this.f159977e = new ArrayList();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f159977e.size();
    }

    /* renamed from: a */
    public void mo219282a(String str) {
        this.f159975c = str;
    }

    /* renamed from: a */
    private String m248268a(int i) {
        return this.f159977e.get(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.vc.meeting.module.tab3.detail.b.c$a */
    public static class C63368a extends RecyclerView.ViewHolder {

        /* renamed from: a */
        LinearLayout f159982a;

        /* renamed from: b */
        ImageView f159983b;

        /* renamed from: c */
        TextView f159984c;

        C63368a(View view) {
            super(view);
            this.f159982a = (LinearLayout) view.findViewById(R.id.record_item_layout);
            this.f159983b = (ImageView) view.findViewById(R.id.record_img);
            this.f159984c = (TextView) view.findViewById(R.id.record_file_name);
        }
    }

    /* renamed from: a */
    public void mo219280a(VCTabRecordInfo vCTabRecordInfo) {
        C60700b.m235851b("VideoChatTab_TabRecordAdapter", "[setData]", "recordInfo: type is " + vCTabRecordInfo.getRecordType() + ", urlSize = " + vCTabRecordInfo.getUrlList());
        this.f159976d = vCTabRecordInfo.getRecordType();
        this.f159977e.clear();
        if (C60742af.m236059a(vCTabRecordInfo.getUrlList())) {
            this.f159977e.add("");
        } else {
            this.f159977e.addAll(vCTabRecordInfo.getUrlList());
        }
        notifyDataSetChanged();
    }

    /* renamed from: a */
    public C63368a onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C63368a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.tab_meeting_record_item, viewGroup, false));
    }

    /* renamed from: a */
    public void onBindViewHolder(final C63368a aVar, int i) {
        int i2;
        final String a = m248268a(i);
        float f = 1.0f;
        if (this.f159976d == VCTabRecordInfo.RecordType.LARK_MINUTES) {
            aVar.f159983b.setImageDrawable(C60773o.m236128f(R.drawable.ud_icon_minutes_logo_filled));
            ImageView imageView = aVar.f159983b;
            if (TextUtils.isEmpty(a)) {
                i2 = R.color.icon_disable;
            } else {
                i2 = R.color.ud_W600;
            }
            imageView.setColorFilter(C60773o.m236126d(i2));
            aVar.f159983b.setAlpha(1.0f);
        } else {
            aVar.f159983b.setImageDrawable(C60773o.m236128f(R.drawable.ud_icon_file_video_colorful));
            aVar.f159983b.setColorFilter(R.color.ud_B500);
            ImageView imageView2 = aVar.f159983b;
            if (TextUtils.isEmpty(a)) {
                f = 0.5f;
            }
            imageView2.setAlpha(f);
        }
        if (TextUtils.isEmpty(a)) {
            aVar.f159984c.setText(R.string.View_G_Generating);
            aVar.f159984c.setTextColor(C60773o.m236126d(R.color.text_disable));
            return;
        }
        if (!TextUtils.isEmpty(this.f159978f)) {
            aVar.f159984c.setText(this.f159978f);
        } else {
            aVar.f159984c.setText(C60773o.m236119a((int) R.string.View_G_ServerNoTitle));
        }
        aVar.f159984c.setTextColor(C60773o.m236126d(R.color.text_title));
        aVar.f159982a.setOnClickListener(new OnSingleClickListener() {
            /* class com.ss.android.vc.meeting.module.tab3.detail.p3173b.C63366c.C633671 */

            @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
            public void onSingleClick(View view) {
                boolean z;
                String str = C63366c.this.f159974b;
                if (C63366c.this.f159973a.mo219200b() == MeetingStatus.MEETING_ON_THE_CALL) {
                    z = true;
                } else {
                    z = false;
                }
                ce.m250263a(str, z);
                VideoChatModule.getDependency().getDocsDependency().mo196378a(a, aVar.f159982a.getContext());
                VcTabListEvent.m249757a(C63366c.this.f159975c, "click_mm", "vc_minutes_detail_view");
            }
        });
    }

    public C63366c(String str, String str2, C63328a.AbstractC63332b.AbstractC63333a aVar) {
        this.f159974b = str;
        this.f159978f = str2;
        this.f159973a = aVar;
        mo219279a();
    }
}
