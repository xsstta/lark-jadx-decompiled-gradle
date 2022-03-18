package com.bytedance.ee.bear.middleground.record.viewhistory;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.C2124f;
import com.bumptech.glide.ComponentCallbacks2C2115c;
import com.bytedance.ee.bear.docshost.AbstractC5586d;
import com.bytedance.ee.bear.middleground.record.viewhistory.RecordListResult;
import com.bytedance.ee.bear.p522q.C10539a;
import com.bytedance.ee.bear.widgets.universedesign.SpaceTagTextView;
import com.bytedance.ee.util.p705h.C13666a;
import com.bytedance.ee.util.p717s.C13723a;
import com.bytedance.ee.util.p718t.C13749l;
import com.larksuite.component.universe_design.image.UDAvatar;
import com.larksuite.component.universe_design.tag.UDTagsDrawable;
import com.larksuite.suite.R;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.middleground.record.viewhistory.b */
public class C10145b extends RecyclerView.ViewHolder {

    /* renamed from: a */
    private UDAvatar f27401a;

    /* renamed from: b */
    private TextView f27402b;

    /* renamed from: c */
    private TextView f27403c;

    /* renamed from: d */
    private TextView f27404d;

    /* renamed from: e */
    private View f27405e;

    /* renamed from: f */
    private SpaceTagTextView f27406f;

    /* renamed from: g */
    private Context f27407g;

    /* renamed from: h */
    private String f27408h;

    /* renamed from: a */
    public void mo38570a() {
        this.f27405e.setVisibility(4);
    }

    /* renamed from: c */
    public void mo38573c(RecordListResult.C10143a aVar) {
        m42203e(aVar);
        this.f27403c.setText(C13749l.m55745a(this.f27407g, (int) R.string.CreationMobile_Stats_Visits_AnonVisitDesc));
    }

    /* renamed from: b */
    public void mo38572b(RecordListResult.C10143a aVar) {
        m42203e(aVar);
        this.f27403c.setVisibility(8);
        this.f27406f.mo45486a(new UDTagsDrawable.TagModel.Builder(this.f27407g).mo91418a(C13749l.m55745a(this.f27407g, (int) R.string.CreationMobile_Common_Tag_App)).mo91417a(UDTagsDrawable.TagColorSet.BLUE).mo91427g());
    }

    /* renamed from: d */
    public void mo38574d(RecordListResult.C10143a aVar) {
        m42203e(aVar);
        this.f27403c.setText(C10539a.m43639a(this.f27407g, R.string.CreationMobile_Stats_Visits_VisitFrom, "location", aVar.f27384e));
        if (TextUtils.isEmpty(aVar.f27384e)) {
            this.f27403c.setVisibility(8);
        }
    }

    /* renamed from: e */
    private void m42203e(RecordListResult.C10143a aVar) {
        this.f27401a.setAvatarSize(-2);
        ((C2124f) ComponentCallbacks2C2115c.m9151c(this.f27401a.getContext()).mo10415a(aVar.f27383d).mo11123a((int) R.drawable.facade_common_avatar_place_holder)).mo10399a((ImageView) this.f27401a);
        this.f27402b.setText(C13666a.m55443a(this.f27408h, aVar.f27381b, aVar.f27382c));
        this.f27404d.setText(C13723a.m55660b(this.f27407g, aVar.f27387h * 1000));
        this.f27405e.setVisibility(0);
    }

    /* renamed from: a */
    public void mo38571a(final RecordListResult.C10143a aVar) {
        m42203e(aVar);
        this.f27401a.setOnClickListener(new View.OnClickListener() {
            /* class com.bytedance.ee.bear.middleground.record.viewhistory.C10145b.View$OnClickListenerC101461 */

            public void onClick(View view) {
                ((AbstractC5586d) KoinJavaComponent.m268610a(AbstractC5586d.class)).mo22257a(aVar.f27380a, (CharSequence) null);
            }
        });
        if (!aVar.f27389j) {
            this.f27403c.setText(aVar.f27384e);
            this.f27406f.setVisibility(8);
            if (TextUtils.isEmpty(aVar.f27384e)) {
                this.f27403c.setVisibility(8);
                return;
            }
            return;
        }
        this.f27406f.mo45486a(new UDTagsDrawable.TagModel.Builder(this.f27407g).mo91418a(this.f27407g.getText(R.string.Doc_Widget_External).toString()).mo91417a(UDTagsDrawable.TagColorSet.BLUE).mo91427g());
        this.f27403c.setVisibility(8);
    }

    public C10145b(View view, String str) {
        super(view);
        this.f27407g = view.getContext();
        this.f27408h = str;
        this.f27401a = (UDAvatar) view.findViewById(R.id.read_record_item_avatar);
        this.f27402b = (TextView) view.findViewById(R.id.read_record_item_name);
        this.f27403c = (TextView) view.findViewById(R.id.read_record_item_group);
        this.f27404d = (TextView) view.findViewById(R.id.read_record_item_time);
        this.f27405e = view.findViewById(R.id.divider);
        this.f27406f = (SpaceTagTextView) view.findViewById(R.id.externalView);
    }
}
