package com.ss.android.vc.meeting.module.tab.detail.p3170b;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
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
import com.ss.android.vc.meeting.module.tab.detail.p3169a.C63230a;
import com.ss.android.vc.meeting.module.tab.detail.p3170b.C63271d;
import com.ss.android.vc.statistics.event.ce;
import com.ss.android.vc.statistics.event2.VcTabListEvent;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.vc.meeting.module.tab.detail.b.d */
public class C63271d extends RecyclerView.Adapter<C63273a> {

    /* renamed from: a */
    public C63230a.AbstractC63234b.AbstractC63235a f159598a;

    /* renamed from: b */
    public String f159599b;

    /* renamed from: c */
    private Context f159600c;

    /* renamed from: d */
    private VCTabRecordInfo.RecordType f159601d;

    /* renamed from: e */
    private List<String> f159602e;

    /* renamed from: a */
    public void mo218961a() {
        this.f159602e = new ArrayList();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f159602e.size();
    }

    /* renamed from: a */
    public void mo218964a(String str) {
        this.f159599b = str;
    }

    /* renamed from: a */
    private String m247812a(int i) {
        return this.f159602e.get(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.vc.meeting.module.tab.detail.b.d$a */
    public static class C63273a extends RecyclerView.ViewHolder {

        /* renamed from: a */
        LinearLayout f159606a;

        /* renamed from: b */
        ImageView f159607b;

        /* renamed from: c */
        TextView f159608c;

        /* renamed from: d */
        View f159609d;

        C63273a(View view) {
            super(view);
            this.f159606a = (LinearLayout) view.findViewById(R.id.record_item_layout);
            this.f159607b = (ImageView) view.findViewById(R.id.record_img);
            this.f159608c = (TextView) view.findViewById(R.id.record_file_name);
            this.f159609d = view.findViewById(R.id.divider);
        }
    }

    /* renamed from: a */
    public void mo218962a(VCTabRecordInfo vCTabRecordInfo) {
        C60700b.m235851b("VideoChatTab_TabRecordAdapter", "[setData]", "recordInfo: type is " + vCTabRecordInfo.getRecordType() + ", urlSize = " + vCTabRecordInfo.getUrlList().size());
        this.f159601d = vCTabRecordInfo.getRecordType();
        this.f159602e.clear();
        if (C60742af.m236059a(vCTabRecordInfo.getUrlList())) {
            this.f159602e.add("");
        } else {
            this.f159602e.addAll(vCTabRecordInfo.getUrlList());
        }
        notifyDataSetChanged();
    }

    public C63271d(Context context, C63230a.AbstractC63234b.AbstractC63235a aVar) {
        this.f159600c = context;
        this.f159598a = aVar;
        mo218961a();
    }

    /* renamed from: a */
    public C63273a onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C63273a(LayoutInflater.from(this.f159600c).inflate(R.layout.tab_meeting_record_item, viewGroup, false));
    }

    /* renamed from: a */
    public void onBindViewHolder(final C63273a aVar, int i) {
        int i2;
        int i3;
        final String a = m247812a(i);
        if (this.f159601d == VCTabRecordInfo.RecordType.LARK_MINUTES) {
            ImageView imageView = aVar.f159607b;
            if (TextUtils.isEmpty(a)) {
                i3 = R.drawable.icon_minutes_disabled;
            } else {
                i3 = R.drawable.icon_minutes;
            }
            imageView.setImageDrawable(C60773o.m236128f(i3));
        } else if (this.f159601d == VCTabRecordInfo.RecordType.RECORD) {
            ImageView imageView2 = aVar.f159607b;
            if (TextUtils.isEmpty(a)) {
                i2 = R.drawable.icon_video_disabled;
            } else {
                i2 = R.drawable.ud_icon_file_video_colorful;
            }
            imageView2.setImageDrawable(C60773o.m236128f(i2));
        }
        if (TextUtils.isEmpty(a)) {
            aVar.f159608c.setText(R.string.View_G_Generating);
            aVar.f159608c.setTextColor(C60773o.m236126d(R.color.text_disable));
        } else {
            if (!TextUtils.isEmpty(this.f159598a.mo218891f())) {
                aVar.f159608c.setText(this.f159598a.mo218891f());
            } else {
                aVar.f159608c.setText(C60773o.m236119a((int) R.string.View_G_ServerNoTitle));
            }
            aVar.f159608c.setTextColor(C60773o.m236126d(R.color.text_title));
            aVar.f159606a.setOnClickListener(new OnSingleClickListener() {
                /* class com.ss.android.vc.meeting.module.tab.detail.p3170b.C63271d.C632721 */

                @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
                public void onSingleClick(View view) {
                    boolean z;
                    String e = C63271d.this.f159598a.mo218890e();
                    if (C63271d.this.f159598a.mo218889d() == MeetingStatus.MEETING_ON_THE_CALL) {
                        z = true;
                    } else {
                        z = false;
                    }
                    ce.m250263a(e, z);
                    VideoChatModule.getDependency().getDocsDependency().mo196378a(a, aVar.f159606a.getContext());
                    VcTabListEvent.m249757a(C63271d.this.f159599b, "click_mm", "vc_minutes_detail_view");
                }
            });
            aVar.f159606a.setOnTouchListener(new View.OnTouchListener(i, aVar) {
                /* class com.ss.android.vc.meeting.module.tab.detail.p3170b.$$Lambda$d$QGJEzDBJsgBBCk_NTSDUx_Y7Hc */
                public final /* synthetic */ int f$1;
                public final /* synthetic */ C63271d.C63273a f$2;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                }

                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    return C63271d.m271435lambda$QGJEzDBJsgBBCk_NTSDUx_Y7Hc(C63271d.this, this.f$1, this.f$2, view, motionEvent);
                }
            });
        }
        if (i == getItemCount() - 1) {
            aVar.f159609d.setVisibility(8);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ boolean m247813a(int i, C63273a aVar, View view, MotionEvent motionEvent) {
        C63273a aVar2;
        C63273a aVar3;
        int action = motionEvent.getAction();
        if (action == 0) {
            int i2 = i - 1;
            if (i2 >= 0 && (aVar2 = (C63273a) this.f159598a.mo218888c().findViewHolderForAdapterPosition(i2)) != null) {
                aVar2.f159609d.setVisibility(4);
            }
            aVar.f159609d.setVisibility(4);
        } else if (action != 2) {
            int i3 = i - 1;
            if (i3 >= 0 && (aVar3 = (C63273a) this.f159598a.mo218888c().findViewHolderForAdapterPosition(i3)) != null) {
                aVar3.f159609d.setVisibility(0);
            }
            if (i != getItemCount() - 1) {
                aVar.f159609d.setVisibility(0);
            }
        }
        return false;
    }
}
