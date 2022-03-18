package com.ss.android.vc.common.widget.avatarlist;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.component.ui.imageview.LKUIRoundedImageView;
import com.larksuite.suite.R;
import com.ss.android.lark.utils.rxjava.LarkRxSchedulers;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60773o;
import com.ss.android.vc.common.p3083e.C60783v;
import com.ss.android.vc.common.widget.avatarlist.C60835a;
import com.ss.android.vc.dependency.ar;
import com.ss.android.vc.entity.VCParticipantAbbrInfo;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.util.ArrayList;
import java.util.List;

public class VcTabAvatarListView extends LinearLayout {

    /* renamed from: a */
    public TextView f152235a;

    /* renamed from: b */
    public View f152236b;

    /* renamed from: c */
    public LKUIRoundedImageView f152237c;

    /* renamed from: d */
    public RecyclerView f152238d;

    /* renamed from: e */
    private final int f152239e = 6;

    /* renamed from: f */
    private final int f152240f = 5;

    /* renamed from: g */
    private final int f152241g = 6;

    /* renamed from: h */
    private final int f152242h = 24;

    /* renamed from: i */
    private final int f152243i = 22;

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ boolean m236480a(Bitmap bitmap) throws Exception {
        return bitmap != null;
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.vc.common.widget.avatarlist.VcTabAvatarListView$a */
    public class C60833a extends RecyclerView.Adapter<C60834a> {

        /* renamed from: b */
        private List<Bitmap> f152245b;

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.f152245b.size();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.ss.android.vc.common.widget.avatarlist.VcTabAvatarListView$a$a */
        public class C60834a extends RecyclerView.ViewHolder {

            /* renamed from: a */
            VcCrescentPhotoImageView f152246a;

            C60834a(VcCrescentPhotoImageView vcCrescentPhotoImageView) {
                super(vcCrescentPhotoImageView);
                this.f152246a = vcCrescentPhotoImageView;
            }
        }

        C60833a(List<Bitmap> list) {
            this.f152245b = list;
        }

        /* renamed from: a */
        public void onBindViewHolder(C60834a aVar, int i) {
            Bitmap bitmap = this.f152245b.get(i);
            if (bitmap != null) {
                aVar.f152246a.setImageBitmap(bitmap);
            }
        }

        /* renamed from: a */
        public C60834a onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new C60834a((VcCrescentPhotoImageView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.meeting_card_participant_photo, viewGroup, false));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ ObservableSource m236477a(ArrayList arrayList) throws Exception {
        if (arrayList != null) {
            return Observable.fromArray(arrayList.toArray());
        }
        return Observable.never();
    }

    public VcTabAvatarListView(Context context) {
        super(context);
        m236478a((AttributeSet) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ Bitmap m236476a(Object obj) throws Exception {
        C60835a.C60840c cVar;
        if (obj == null || !(obj instanceof C60835a.C60840c) || (cVar = (C60835a.C60840c) obj) == null) {
            return null;
        }
        return C60783v.m236225a(cVar.f152263b, cVar.f152262a, cVar.f152265d, 24, 24);
    }

    /* renamed from: a */
    private void m236478a(AttributeSet attributeSet) {
        setOrientation(0);
        LayoutInflater.from(getContext()).inflate(R.layout.vc_crescent_avatar_list_layout, (ViewGroup) this, true);
        this.f152235a = (TextView) findViewById(R.id.video_meeting_card_participant_number);
        this.f152236b = findViewById(R.id.fl_video_meeting_card_participant_more);
        this.f152237c = (LKUIRoundedImageView) findViewById(R.id.video_meeting_card_last_participant);
        this.f152238d = (RecyclerView) findViewById(R.id.video_meeting_card_participant);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m236479a(List list) throws Exception {
        Bitmap bitmap;
        if (list == null) {
            C60700b.m235851b("VcCrescentAvatarListView", "setData2", "bitmaps is null");
            return;
        }
        C60700b.m235851b("VcCrescentAvatarListView", "setData3", "bitmaps size = " + list.size());
        if (list.size() >= 1 && (bitmap = (Bitmap) list.get(list.size() - 1)) != null) {
            this.f152237c.setImageBitmap(bitmap);
        }
        if (list.size() == 1) {
            this.f152238d.setVisibility(8);
            return;
        }
        this.f152238d.setVisibility(0);
        if (this.f152237c.getVisibility() == 0) {
            list = new ArrayList(list.subList(0, list.size() - 1));
        }
        this.f152238d.setAdapter(new C60833a(list));
    }

    public VcTabAvatarListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m236478a(attributeSet);
    }

    /* renamed from: a */
    public void mo208621a(String str, List<VCParticipantAbbrInfo> list) {
        if (list == null || list.size() <= 0) {
            C60700b.m235851b("VcCrescentAvatarListView", "setData1", "participants is empty");
            return;
        }
        int i = 5;
        if (list.size() <= 6) {
            this.f152235a.setVisibility(8);
            this.f152236b.setVisibility(8);
            this.f152237c.setVisibility(0);
        } else if (list.size() - 5 >= 100) {
            this.f152235a.setVisibility(8);
            this.f152237c.setVisibility(8);
            this.f152236b.setVisibility(0);
        } else {
            this.f152235a.setText("+" + (list.size() - 5));
            this.f152237c.setVisibility(8);
            this.f152236b.setVisibility(8);
            this.f152235a.setVisibility(0);
            this.f152235a.setBackground(C60773o.m236128f(R.drawable.video_tab_participant_number));
            this.f152235a.setTextColor(C60773o.m236126d(R.color.text_caption));
            this.f152235a.setTextSize(10.0f);
        }
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(ar.m236694a());
        linearLayoutManager.setOrientation(0);
        this.f152238d.setLayoutManager(linearLayoutManager);
        if (list.size() <= 6) {
            i = 6;
        }
        C60835a.m236494b(str, list, i).observeOn(LarkRxSchedulers.io()).flatMap($$Lambda$VcTabAvatarListView$ntNUpPFLAeEHvnYPKe9ZeuWUebY.INSTANCE).map(new Function() {
            /* class com.ss.android.vc.common.widget.avatarlist.$$Lambda$VcTabAvatarListView$ZFnWkvyp2FI6SC7MBN4ryNs6xM */

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return VcTabAvatarListView.this.m236476a(obj);
            }
        }).filter($$Lambda$VcTabAvatarListView$1kmVi7MieIU88bD4ka8k8CgCxxo.INSTANCE).toList().observeOn(LarkRxSchedulers.mainThread()).subscribe(new Consumer() {
            /* class com.ss.android.vc.common.widget.avatarlist.$$Lambda$VcTabAvatarListView$l53yy4yYLVcKAvchZ7zg9Xj5c */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                VcTabAvatarListView.this.m236479a((VcTabAvatarListView) ((List) obj));
            }
        });
    }

    public VcTabAvatarListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m236478a(attributeSet);
    }
}
