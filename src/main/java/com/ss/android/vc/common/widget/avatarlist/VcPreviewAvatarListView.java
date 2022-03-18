package com.ss.android.vc.common.widget.avatarlist;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.component.ui.imageview.LKUIRoundedImageView;
import com.larksuite.suite.R;
import com.ss.android.lark.utils.rxjava.LarkRxSchedulers;
import com.ss.android.vc.common.p3083e.C60783v;
import com.ss.android.vc.common.widget.avatarlist.C60835a;
import com.ss.android.vc.dependency.ar;
import com.ss.android.vc.entity.Participant;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Consumer;
import java.util.ArrayList;
import java.util.List;

public class VcPreviewAvatarListView extends LinearLayout {

    /* renamed from: a */
    public TextView f152225a;

    /* renamed from: b */
    public LKUIRoundedImageView f152226b;

    /* renamed from: c */
    public RecyclerView f152227c;

    /* renamed from: d */
    private int f152228d = 5;

    /* renamed from: e */
    private int f152229e = 5;

    /* renamed from: f */
    private int f152230f = 6;

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ boolean m236472a(Bitmap bitmap) throws Exception {
        return bitmap != null;
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.vc.common.widget.avatarlist.VcPreviewAvatarListView$a */
    public class C60831a extends RecyclerView.Adapter<C60832a> {

        /* renamed from: b */
        private List<Bitmap> f152232b;

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.f152232b.size();
        }

        /* renamed from: com.ss.android.vc.common.widget.avatarlist.VcPreviewAvatarListView$a$a */
        public class C60832a extends RecyclerView.ViewHolder {

            /* renamed from: a */
            public ImageView f152233a;

            public C60832a(ImageView imageView) {
                super(imageView);
                this.f152233a = imageView;
            }
        }

        public C60831a(List<Bitmap> list) {
            this.f152232b = list;
        }

        /* renamed from: a */
        public void onBindViewHolder(C60832a aVar, int i) {
            Bitmap bitmap = this.f152232b.get(i);
            if (bitmap != null) {
                aVar.f152233a.setImageBitmap(bitmap);
            }
        }

        /* renamed from: a */
        public C60832a onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new C60832a((ImageView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.meeting_card_participant_photo_preview, viewGroup, false));
        }
    }

    public VcPreviewAvatarListView(Context context) {
        super(context);
        m236470a((AttributeSet) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ ObservableSource m236469a(ArrayList arrayList) throws Exception {
        if (arrayList != null) {
            return Observable.fromArray(arrayList.toArray());
        }
        return Observable.never();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ Bitmap m236468a(Object obj) throws Exception {
        C60835a.C60840c cVar;
        if (obj == null || !(obj instanceof C60835a.C60840c) || (cVar = (C60835a.C60840c) obj) == null) {
            return null;
        }
        return C60783v.m236225a(cVar.f152263b, cVar.f152262a, cVar.f152265d, 32, 32);
    }

    /* renamed from: a */
    private void m236470a(AttributeSet attributeSet) {
        setOrientation(0);
        LayoutInflater.from(getContext()).inflate(R.layout.vc_preview_avatar_list_layout, (ViewGroup) this, true);
        this.f152225a = (TextView) findViewById(R.id.video_meeting_card_participant_number);
        this.f152226b = (LKUIRoundedImageView) findViewById(R.id.video_meeting_card_last_participant);
        this.f152227c = (RecyclerView) findViewById(R.id.video_meeting_card_participant);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, new int[]{R.attr.avatarHeight, R.attr.avatarNum, R.attr.avatarWidth});
            int integer = obtainStyledAttributes.getInteger(1, 6);
            this.f152230f = integer;
            this.f152229e = integer - 1;
            this.f152228d = integer + 1;
            obtainStyledAttributes.recycle();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m236471a(List list) throws Exception {
        Bitmap bitmap;
        if (list != null) {
            if (list.size() >= 1 && (bitmap = (Bitmap) list.get(list.size() - 1)) != null) {
                this.f152226b.setImageBitmap(bitmap);
            }
            if (list.size() == 1) {
                this.f152227c.setVisibility(8);
                return;
            }
            this.f152227c.setVisibility(0);
            if (this.f152226b.getVisibility() == 0) {
                list = new ArrayList(list.subList(0, list.size() - 1));
            }
            this.f152227c.setAdapter(new C60831a(list));
        }
    }

    public VcPreviewAvatarListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m236470a(attributeSet);
    }

    /* renamed from: a */
    public void mo208618a(String str, List<Participant> list) {
        int i;
        if (list != null && list.size() > 0) {
            if (list.size() >= this.f152228d) {
                if (list.size() >= 1000) {
                    this.f152225a.setText("...");
                } else {
                    TextView textView = this.f152225a;
                    textView.setText("+" + (list.size() - this.f152229e));
                }
                this.f152225a.setVisibility(0);
                this.f152226b.setVisibility(8);
            } else {
                this.f152225a.setVisibility(8);
                this.f152226b.setVisibility(0);
            }
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(ar.m236694a());
            linearLayoutManager.setOrientation(0);
            this.f152227c.setLayoutManager(linearLayoutManager);
            if (list.size() >= this.f152228d) {
                i = this.f152229e;
            } else {
                i = this.f152230f;
            }
            C60835a.m236488a(str, list, i).observeOn(LarkRxSchedulers.io()).flatMap($$Lambda$VcPreviewAvatarListView$9BzRmKiDN3SLOo3KdGEAFVfi_M.INSTANCE).map($$Lambda$VcPreviewAvatarListView$odMqt31AfQk7VRx5UQPfZqMbvo.INSTANCE).filter($$Lambda$VcPreviewAvatarListView$wEB4tuOzl70cm8f2oAZ_KzqtBo.INSTANCE).toList().observeOn(LarkRxSchedulers.mainThread()).subscribe(new Consumer() {
                /* class com.ss.android.vc.common.widget.avatarlist.$$Lambda$VcPreviewAvatarListView$ALeiQiXwmWkWebuaU5DvM0Zwjgs */

                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    VcPreviewAvatarListView.this.m236471a((VcPreviewAvatarListView) ((List) obj));
                }
            });
        }
    }

    public VcPreviewAvatarListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m236470a(attributeSet);
    }
}
