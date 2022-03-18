package com.bytedance.ee.bear.drive.view.preview.wrapper;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import com.bytedance.ee.bear.drive.biz.preview.vc.C6738g;
import com.bytedance.ee.bear.drive.view.preview.audio.AudioView;
import java.io.File;

public class AudioPreviewView extends AbsPreviewView {

    /* renamed from: a */
    private AudioView f20348a;

    @Override // com.bytedance.ee.bear.drive.view.preview.wrapper.AbstractC7549a
    public boolean onBackPressed() {
        return false;
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.wrapper.AbstractC7549a
    public View getView() {
        return this.f20348a;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m30154a() {
        trackOpenSuccess("media_player");
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.wrapper.AbstractC7549a, com.bytedance.ee.bear.drive.view.preview.wrapper.AbsPreviewView
    public void show() {
        trackOpenStart();
        this.f20348a.mo28314a();
        this.f20348a.post(new Runnable() {
            /* class com.bytedance.ee.bear.drive.view.preview.wrapper.$$Lambda$AudioPreviewView$jOKygopP_ZPaelNxBU_JG9ugJMs */

            public final void run() {
                AudioPreviewView.this.m30154a();
            }
        });
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.wrapper.AbsPreviewView
    public void onPermissionChanged(boolean z) {
        this.f20348a.mo28319a(z);
    }

    public AudioPreviewView(ViewOwner viewOwner, Context context, C7553d dVar, C6738g gVar) {
        super(viewOwner, context, dVar, gVar);
        AudioView audioView = new AudioView(this.mContext);
        this.f20348a = audioView;
        audioView.setPreviewModel(viewOwner);
        this.f20348a.mo28317a(new AudioView.C7252a(Uri.fromFile(new File(dVar.mo29485e())).toString(), dVar));
    }
}
