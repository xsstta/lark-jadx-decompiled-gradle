package com.bytedance.ee.bear.drive.view.preview.video.videopopupwindow;

import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p702e.C13657b;
import com.larksuite.suite.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.ee.bear.drive.view.preview.video.videopopupwindow.c */
public class C7514c extends RecyclerView.Adapter<C7517b> {

    /* renamed from: a */
    public List<C7512a> f20295a = new ArrayList();

    /* renamed from: b */
    public AbstractC7516a f20296b;

    /* renamed from: c */
    private Context f20297c;

    /* renamed from: com.bytedance.ee.bear.drive.view.preview.video.videopopupwindow.c$a */
    public interface AbstractC7516a {
        /* renamed from: a */
        void mo29207a(String str, String str2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f20295a.size();
    }

    /* renamed from: a */
    public void mo29348a(AbstractC7516a aVar) {
        this.f20296b = aVar;
    }

    /* renamed from: com.bytedance.ee.bear.drive.view.preview.video.videopopupwindow.c$b */
    public static class C7517b extends RecyclerView.ViewHolder {

        /* renamed from: a */
        LinearLayout f20300a;

        /* renamed from: b */
        ImageView f20301b;

        /* renamed from: c */
        TextView f20302c;

        /* renamed from: d */
        View f20303d;

        public C7517b(View view) {
            super(view);
            this.f20300a = (LinearLayout) view.findViewById(R.id.drive_horizontal_video_resolution_layout);
            this.f20301b = (ImageView) view.findViewById(R.id.drive_horizontal_video_resolution_image);
            this.f20302c = (TextView) view.findViewById(R.id.drive_horizontal_video_resolution_text);
            this.f20303d = view.findViewById(R.id.drive_horizontal_video_resolution_divider);
        }
    }

    /* renamed from: a */
    public void mo29350a(List<C7512a> list) {
        if (C13657b.m55421a(list)) {
            C13479a.m54758a("DRIVE_VideoPlayer", "resolution list is empty or null");
            return;
        }
        this.f20295a.clear();
        this.f20295a.addAll(list);
        notifyDataSetChanged();
    }

    /* renamed from: a */
    public C7517b onCreateViewHolder(ViewGroup viewGroup, int i) {
        this.f20297c = viewGroup.getContext();
        return new C7517b(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.drive_horizontal_video_view_resolution_content_item, viewGroup, false));
    }

    /* renamed from: a */
    public void onBindViewHolder(C7517b bVar, final int i) {
        if (i > this.f20295a.size()) {
            C13479a.m54758a("DRIVE_VideoPlayer", "out of max position");
            return;
        }
        if (i == this.f20295a.size() - 1) {
            bVar.f20303d.setVisibility(8);
        } else {
            bVar.f20303d.setVisibility(0);
        }
        if (this.f20295a.get(i).mo29339a()) {
            bVar.f20301b.setVisibility(0);
            bVar.f20302c.setTypeface(Typeface.defaultFromStyle(1));
            bVar.f20302c.setTextColor(this.f20297c.getResources().getColor(R.color.primary_pri_500));
        } else {
            bVar.f20301b.setVisibility(4);
            bVar.f20302c.setTypeface(Typeface.defaultFromStyle(0));
            bVar.f20302c.setTextColor(this.f20297c.getResources().getColor(R.color.text_title));
        }
        bVar.f20302c.setText(this.f20295a.get(i).mo29341c());
        bVar.f20300a.setOnClickListener(new View.OnClickListener() {
            /* class com.bytedance.ee.bear.drive.view.preview.video.videopopupwindow.C7514c.View$OnClickListenerC75151 */

            public void onClick(View view) {
                if (C7514c.this.f20296b != null) {
                    C7514c.this.f20296b.mo29207a(C7514c.this.f20295a.get(i).mo29340b(), C7514c.this.f20295a.get(i).mo29341c());
                }
            }
        });
    }
}
