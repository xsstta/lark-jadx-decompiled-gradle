package com.ss.android.lark.mediapicker.album;

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

/* renamed from: com.ss.android.lark.mediapicker.album.a */
public class C44618a extends AbstractC44634d<C44667d, C44666c> {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo158127a(C44666c cVar, LocalMedia localMedia) {
    }

    /* renamed from: com.ss.android.lark.mediapicker.album.a$a */
    private static class C44619a extends AbstractC44634d.AbstractC44638a {

        /* renamed from: a */
        private ImageView f113095a;

        /* renamed from: b */
        private TextView f113096b;

        @Override // com.ss.android.lark.mediapicker.album.base.AbstractC44634d.AbstractC44638a
        /* renamed from: b */
        public CheckBox mo158137b() {
            return null;
        }

        @Override // com.ss.android.lark.mediapicker.album.base.AbstractC44634d.AbstractC44638a
        /* renamed from: c */
        public View mo158138c() {
            return null;
        }

        @Override // com.ss.android.lark.mediapicker.album.base.AbstractC44634d.AbstractC44638a
        /* renamed from: a */
        public ImageView mo158136a() {
            return this.f113095a;
        }

        public C44619a(View view) {
            super(view);
            this.f113095a = (ImageView) view.findViewById(R.id.iv_photo);
            this.f113096b = (TextView) view.findViewById(R.id.tv_tip);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mediapicker.album.base.AbstractC44634d
    /* renamed from: a */
    public boolean mo158130a() {
        return this.f113133a.f113086s;
    }

    public C44618a(Context context, MediaPickerConfig mediaPickerConfig) {
        super(context, mediaPickerConfig);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C44667d mo158135e(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return new C44667d(layoutInflater.inflate(R.layout.picker_media_picker_item, viewGroup, false));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C44666c mo158134d(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return new C44666c(layoutInflater.inflate(R.layout.picker_media_picker_item, viewGroup, false));
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mediapicker.album.base.AbstractC44634d
    /* renamed from: c */
    public AbstractC44634d.AbstractC44638a mo158133c(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return new C44619a(layoutInflater.inflate(R.layout.picker_camera_item, viewGroup, false));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo158132b(C44667d dVar, LocalMedia localMedia) {
        dVar.mo158251d().setText(C44748e.m177487a((int) localMedia.getDuration()));
    }
}
