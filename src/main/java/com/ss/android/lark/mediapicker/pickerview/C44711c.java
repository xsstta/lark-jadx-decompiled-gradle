package com.ss.android.lark.mediapicker.pickerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import com.larksuite.suite.R;
import com.ss.android.lark.mediapicker.MediaPickerConfig;
import com.ss.android.lark.mediapicker.album.base.AbstractC44634d;
import com.ss.android.lark.mediapicker.entity.LocalMedia;
import com.ss.android.lark.mediapicker.utils.C44748e;

/* renamed from: com.ss.android.lark.mediapicker.pickerview.c */
public class C44711c extends AbstractC44634d<C44713b, C44712a> {
    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mediapicker.album.base.AbstractC44634d
    /* renamed from: a */
    public void mo158203a(AbstractC44634d.AbstractC44638a aVar) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo158127a(C44712a aVar, LocalMedia localMedia) {
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mediapicker.album.base.AbstractC44634d
    /* renamed from: a */
    public boolean mo158130a() {
        return false;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mediapicker.album.base.AbstractC44634d
    /* renamed from: c */
    public AbstractC44634d.AbstractC44638a mo158133c(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: com.ss.android.lark.mediapicker.pickerview.c$a */
    public static class C44712a extends AbstractC44634d.AbstractC44638a {

        /* renamed from: a */
        ImageView f113279a;

        /* renamed from: b */
        CheckBox f113280b = ((CheckBox) this.itemView.findViewById(R.id.v_selected));

        /* renamed from: c */
        View f113281c = this.itemView.findViewById(R.id.v_mask);

        @Override // com.ss.android.lark.mediapicker.album.base.AbstractC44634d.AbstractC44638a
        /* renamed from: a */
        public ImageView mo158136a() {
            return this.f113279a;
        }

        @Override // com.ss.android.lark.mediapicker.album.base.AbstractC44634d.AbstractC44638a
        /* renamed from: b */
        public CheckBox mo158137b() {
            return this.f113280b;
        }

        @Override // com.ss.android.lark.mediapicker.album.base.AbstractC44634d.AbstractC44638a
        /* renamed from: c */
        public View mo158138c() {
            return this.f113281c;
        }

        C44712a(View view) {
            super(view);
            this.f113279a = (ImageView) view.findViewById(R.id.image_photo_preview);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: com.ss.android.lark.mediapicker.pickerview.c$b */
    public static class C44713b extends AbstractC44634d.AbstractC44638a {

        /* renamed from: a */
        ImageView f113282a;

        /* renamed from: b */
        CheckBox f113283b = ((CheckBox) this.itemView.findViewById(R.id.v_selected));

        /* renamed from: c */
        View f113284c = this.itemView.findViewById(R.id.v_mask);

        /* renamed from: d */
        TextView f113285d = ((TextView) this.itemView.findViewById(R.id.tv_duration));

        @Override // com.ss.android.lark.mediapicker.album.base.AbstractC44634d.AbstractC44638a
        /* renamed from: a */
        public ImageView mo158136a() {
            return this.f113282a;
        }

        @Override // com.ss.android.lark.mediapicker.album.base.AbstractC44634d.AbstractC44638a
        /* renamed from: b */
        public CheckBox mo158137b() {
            return this.f113283b;
        }

        @Override // com.ss.android.lark.mediapicker.album.base.AbstractC44634d.AbstractC44638a
        /* renamed from: c */
        public View mo158138c() {
            return this.f113284c;
        }

        C44713b(View view) {
            super(view);
            this.f113282a = (ImageView) view.findViewById(R.id.image_photo_preview);
        }
    }

    public C44711c(Context context, MediaPickerConfig mediaPickerConfig) {
        super(context, mediaPickerConfig);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C44713b mo158135e(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return new C44713b(layoutInflater.inflate(R.layout.picker_media_picker_view_item, viewGroup, false));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C44712a mo158134d(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return new C44712a(layoutInflater.inflate(R.layout.picker_media_picker_view_item, viewGroup, false));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo158132b(C44713b bVar, LocalMedia localMedia) {
        bVar.f113285d.setVisibility(0);
        bVar.f113285d.setText(C44748e.m177487a((int) localMedia.getDuration()));
    }
}
