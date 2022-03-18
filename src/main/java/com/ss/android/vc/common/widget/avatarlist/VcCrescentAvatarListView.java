package com.ss.android.vc.common.widget.avatarlist;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.component.ui.display.manager.C25649b;
import com.larksuite.component.ui.display.manager.LKUIDisplayManager;
import com.larksuite.component.ui.display.manager.LarkFont;
import com.larksuite.component.ui.imageview.LKUIRoundedImageView;
import com.larksuite.suite.R;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.utils.rxjava.LarkRxSchedulers;
import com.ss.android.vc.common.p3083e.C60773o;
import com.ss.android.vc.common.p3083e.C60783v;
import com.ss.android.vc.common.widget.avatarlist.C60835a;
import com.ss.android.vc.dependency.ar;
import com.ss.android.vc.entity.Participant;
import com.ss.android.vc.lark.message.vc.C61150c;
import com.ss.android.vc.service.C63634c;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.util.ArrayList;
import java.util.List;

public class VcCrescentAvatarListView extends LinearLayout {

    /* renamed from: a */
    public int f152210a = 24;

    /* renamed from: b */
    public int f152211b = 22;

    /* renamed from: c */
    public TextView f152212c;

    /* renamed from: d */
    public LKUIRoundedImageView f152213d;

    /* renamed from: e */
    public RecyclerView f152214e;

    /* renamed from: f */
    private int f152215f = 7;

    /* renamed from: g */
    private int f152216g = 5;

    /* renamed from: h */
    private int f152217h = 6;

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ boolean m236455a(Bitmap bitmap) throws Exception {
        return bitmap != null;
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.vc.common.widget.avatarlist.VcCrescentAvatarListView$a */
    public class C60828a extends RecyclerView.Adapter<C60829a> {

        /* renamed from: b */
        private List<Bitmap> f152219b;

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.f152219b.size();
        }

        /* renamed from: com.ss.android.vc.common.widget.avatarlist.VcCrescentAvatarListView$a$a */
        public class C60829a extends RecyclerView.ViewHolder {

            /* renamed from: a */
            public VcCrescentPhotoImageView f152220a;

            public C60829a(VcCrescentPhotoImageView vcCrescentPhotoImageView) {
                super(vcCrescentPhotoImageView);
                this.f152220a = vcCrescentPhotoImageView;
            }
        }

        public C60828a(List<Bitmap> list) {
            this.f152219b = list;
        }

        /* renamed from: a */
        public void onBindViewHolder(C60829a aVar, int i) {
            Bitmap bitmap = this.f152219b.get(i);
            if (bitmap != null) {
                aVar.f152220a.setImageBitmap(bitmap);
            }
        }

        /* renamed from: a */
        public C60829a onCreateViewHolder(ViewGroup viewGroup, int i) {
            VcCrescentPhotoImageView vcCrescentPhotoImageView = (VcCrescentPhotoImageView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.meeting_card_participant_photo, viewGroup, false);
            if (VcCrescentAvatarListView.this.mo208614a()) {
                C25649b.m91854a(vcCrescentPhotoImageView, VcCrescentAvatarListView.this.f152211b, VcCrescentAvatarListView.this.f152210a);
            } else {
                RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) vcCrescentPhotoImageView.getLayoutParams();
                layoutParams.width = C60773o.m236115a(22.0d);
                layoutParams.height = C60773o.m236115a(24.0d);
            }
            return new C60829a(vcCrescentPhotoImageView);
        }
    }

    /* renamed from: a */
    public boolean mo208614a() {
        if (!C63634c.m249496b("lark.mobile.display_textsize") || DesktopUtil.m144307b()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ ObservableSource m236452a(ArrayList arrayList) throws Exception {
        if (arrayList != null) {
            return Observable.fromArray(arrayList.toArray());
        }
        return Observable.never();
    }

    public VcCrescentAvatarListView(Context context) {
        super(context);
        m236453a((AttributeSet) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m236454a(List list) throws Exception {
        Bitmap bitmap;
        if (list != null) {
            if (list.size() >= 1 && (bitmap = (Bitmap) list.get(list.size() - 1)) != null) {
                this.f152213d.setImageBitmap(bitmap);
            }
            if (list.size() == 1) {
                this.f152214e.setVisibility(8);
                return;
            }
            this.f152214e.setVisibility(0);
            if (this.f152213d.getVisibility() == 0) {
                list = new ArrayList(list.subList(0, list.size() - 1));
            }
            this.f152214e.setAdapter(new C60828a(list));
        }
    }

    /* renamed from: a */
    private void m236453a(AttributeSet attributeSet) {
        setOrientation(0);
        LayoutInflater.from(getContext()).inflate(R.layout.vc_crescent_avatar_list_layout, (ViewGroup) this, true);
        this.f152212c = (TextView) findViewById(R.id.video_meeting_card_participant_number);
        this.f152213d = (LKUIRoundedImageView) findViewById(R.id.video_meeting_card_last_participant);
        this.f152214e = (RecyclerView) findViewById(R.id.video_meeting_card_participant);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, new int[]{R.attr.avatarHeight, R.attr.avatarNum, R.attr.avatarWidth});
            int integer = obtainStyledAttributes.getInteger(1, 6);
            this.f152217h = integer;
            this.f152216g = integer - 1;
            this.f152215f = integer + 1;
            if (mo208614a()) {
                C25649b.m91854a(this.f152213d, 24, 24);
                obtainStyledAttributes.recycle();
                return;
            }
            this.f152210a = (int) obtainStyledAttributes.getDimension(0, (float) C60773o.m236115a(24.0d));
            this.f152211b = (int) obtainStyledAttributes.getDimension(2, (float) C60773o.m236115a(22.0d));
            obtainStyledAttributes.recycle();
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f152213d.getLayoutParams();
            layoutParams.width = this.f152210a;
            layoutParams.height = this.f152210a;
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f152212c.getLayoutParams();
            layoutParams2.width = this.f152210a;
            layoutParams2.height = this.f152210a;
        }
    }

    public VcCrescentAvatarListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m236453a(attributeSet);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ Bitmap m236451a(Context context, Object obj) throws Exception {
        C60835a.C60840c cVar;
        if (obj == null || !(obj instanceof C60835a.C60840c) || (cVar = (C60835a.C60840c) obj) == null) {
            return null;
        }
        if (mo208614a()) {
            return C60783v.m236225a(cVar.f152263b, cVar.f152262a, cVar.f152265d, LKUIDisplayManager.m91881c(context, 24), LKUIDisplayManager.m91881c(context, 24));
        }
        return C60783v.m236225a(cVar.f152263b, cVar.f152262a, cVar.f152265d, 24, 24);
    }

    public VcCrescentAvatarListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m236453a(attributeSet);
    }

    /* renamed from: a */
    public void mo208613a(String str, List<Participant> list, long j) {
        int i;
        if (list != null && list.size() > 0) {
            if (j <= 0) {
                j = (long) list.size();
            }
            if (j >= ((long) this.f152215f)) {
                if (j - ((long) this.f152216g) > 99) {
                    this.f152212c.setText("···");
                } else {
                    TextView textView = this.f152212c;
                    textView.setText("+" + (j - ((long) this.f152216g)));
                }
                if (mo208614a()) {
                    C61150c.m237789a(this.f152212c, LarkFont.CAPTION1);
                    this.f152212c.setMinimumWidth(LKUIDisplayManager.m91881c(ar.m236694a(), 24));
                    if (j < 1000) {
                        C25649b.m91854a(this.f152212c, -2, 24);
                    } else {
                        this.f152212c.setPadding(C60773o.m236115a(4.0d), C60773o.m236115a(2.0d), C60773o.m236115a(4.0d), C60773o.m236115a(2.0d));
                        C25649b.m91854a(this.f152212c, -2, 24);
                    }
                } else if (j >= 1000) {
                    this.f152212c.setPadding(C60773o.m236115a(4.0d), C60773o.m236115a(2.0d), C60773o.m236115a(4.0d), C60773o.m236115a(2.0d));
                }
                this.f152212c.setVisibility(0);
                this.f152213d.setVisibility(8);
            } else {
                if (mo208614a()) {
                    C25649b.m91854a(this.f152213d, 24, 24);
                }
                this.f152212c.setVisibility(8);
                this.f152213d.setVisibility(0);
            }
            Context a = ar.m236694a();
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(a);
            linearLayoutManager.setOrientation(0);
            this.f152214e.setLayoutManager(linearLayoutManager);
            if (j >= ((long) this.f152215f)) {
                i = this.f152216g;
            } else {
                i = this.f152217h;
            }
            C60835a.m236488a(str, list, i).observeOn(LarkRxSchedulers.io()).flatMap($$Lambda$VcCrescentAvatarListView$4klxZCq4_EHVCzG3QBfybfo40x4.INSTANCE).map(new Function(a) {
                /* class com.ss.android.vc.common.widget.avatarlist.$$Lambda$VcCrescentAvatarListView$JCr5tJHbHx9jlT0hSWHuA4hLTs */
                public final /* synthetic */ Context f$1;

                {
                    this.f$1 = r2;
                }

                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    return VcCrescentAvatarListView.this.m236451a(this.f$1, obj);
                }
            }).filter($$Lambda$VcCrescentAvatarListView$VZjVOpOcEukRxFP9zVh5TpXRVU.INSTANCE).toList().observeOn(LarkRxSchedulers.mainThread()).subscribe(new Consumer() {
                /* class com.ss.android.vc.common.widget.avatarlist.$$Lambda$VcCrescentAvatarListView$qR9WbAXVblbaB_t9kC8a9u6noo8 */

                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    VcCrescentAvatarListView.this.m236454a((VcCrescentAvatarListView) ((List) obj));
                }
            });
        }
    }
}
