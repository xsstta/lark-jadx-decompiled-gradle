package com.bytedance.ee.bear.drive.view.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import com.bytedance.ee.bear.drive.view.preview.block.DriveBlockPreviewVM;
import com.bytedance.ee.bear.drive.view.preview.media.DriveMediaVM;
import com.bytedance.ee.bear.drive.view.preview.wrapper.C7553d;
import com.bytedance.ee.bear.drive.view.preview.wrapper.C7555f;
import com.bytedance.ee.bear.drive.view.preview.wrapper.C7557g;
import com.bytedance.ee.bear.drive.view.preview.wrapper.ViewOwner;
import com.bytedance.ee.bear.drive.view.widget.VolumeView;
import com.bytedance.ee.util.p717s.C13724b;
import com.larksuite.suite.R;

public class ProgressBar extends FrameLayout implements View.OnClickListener, SeekBar.OnSeekBarChangeListener {

    /* renamed from: a */
    private ViewGroup f20523a;

    /* renamed from: b */
    private ImageView f20524b;

    /* renamed from: c */
    private ImageView f20525c;

    /* renamed from: d */
    private SeekBar f20526d;

    /* renamed from: e */
    private TextView f20527e;

    /* renamed from: f */
    private TextView f20528f;

    /* renamed from: g */
    private boolean f20529g;

    /* renamed from: h */
    private TextView f20530h;

    /* renamed from: i */
    private VolumeView f20531i;

    /* renamed from: j */
    private View f20532j;

    /* renamed from: k */
    private View f20533k;

    /* renamed from: l */
    private int f20534l;

    /* renamed from: m */
    private int f20535m;

    /* renamed from: n */
    private boolean f20536n;

    /* renamed from: o */
    private AbstractC7563a f20537o;

    /* renamed from: p */
    private AbstractC7564b f20538p;

    /* renamed from: q */
    private boolean f20539q;

    /* renamed from: r */
    private C7555f f20540r;

    /* renamed from: s */
    private int f20541s = -1;

    /* renamed from: t */
    private boolean f20542t;

    /* renamed from: u */
    private DriveMediaVM f20543u;

    /* renamed from: v */
    private DriveBlockPreviewVM f20544v;

    /* renamed from: w */
    private boolean f20545w = true;

    /* renamed from: com.bytedance.ee.bear.drive.view.widget.ProgressBar$a */
    public interface AbstractC7563a {
        /* renamed from: b */
        void mo28322b(boolean z);
    }

    /* renamed from: com.bytedance.ee.bear.drive.view.widget.ProgressBar$b */
    public interface AbstractC7564b {
        /* renamed from: b */
        void mo28321b(int i);

        /* renamed from: e */
        void mo28326e();

        /* renamed from: f */
        void mo28327f();
    }

    public void setFileModel(C7553d dVar) {
    }

    /* renamed from: a */
    public boolean mo29650a() {
        return this.f20545w;
    }

    public int getMaxLength() {
        return this.f20535m;
    }

    public boolean getPlayState() {
        return this.f20536n;
    }

    public int getProgress() {
        return this.f20534l;
    }

    /* renamed from: d */
    public void mo29653d() {
        this.f20542t = false;
        setVisibility(4);
    }

    /* renamed from: b */
    public void mo29651b() {
        this.f20545w = false;
        this.f20544v.getBlockTitleViewVisibility().mo5926a((Boolean) true);
    }

    /* renamed from: c */
    public void mo29652c() {
        this.f20542t = false;
        setVisibility(0);
        if (this.f20529g) {
            this.f20530h.setVisibility(0);
        }
        this.f20526d.setVisibility(0);
        this.f20531i.setVisibility(0);
        this.f20523a.setVisibility(0);
        this.f20527e.setVisibility(0);
        this.f20532j.setVisibility(0);
        this.f20533k.setVisibility(8);
        this.f20528f.setVisibility(0);
        setBackgroundDrawable(getResources().getDrawable(R.drawable.drive_progressbar_bg));
    }

    /* renamed from: e */
    private void m30335e() {
        LayoutInflater.from(getContext()).inflate(R.layout.drive_progress_bar, this);
        this.f20523a = (ViewGroup) findViewById(R.id.start_pause_root);
        this.f20524b = (ImageView) findViewById(R.id.start);
        this.f20525c = (ImageView) findViewById(R.id.pause);
        this.f20526d = (SeekBar) findViewById(R.id.seek_bar);
        this.f20527e = (TextView) findViewById(R.id.current);
        this.f20528f = (TextView) findViewById(R.id.length);
        this.f20530h = (TextView) findViewById(R.id.resolution_switch);
        this.f20531i = (VolumeView) findViewById(R.id.drive_video_player_volume_view);
        this.f20532j = findViewById(R.id.length_split);
        this.f20533k = findViewById(R.id.block_enter_full);
        this.f20531i.setVocalSrc(R.drawable.icon_tool_volume_on_in_dark);
        this.f20531i.setSilentSrc(R.drawable.icon_tool_volume_off_in_dark);
        this.f20524b.setVisibility(0);
        this.f20525c.setVisibility(8);
        setMaxLength(this.f20535m);
        setProgressInternal(this.f20534l);
        setPlayState(this.f20536n);
        this.f20525c.setOnClickListener(this);
        this.f20524b.setOnClickListener(this);
        this.f20526d.setOnSeekBarChangeListener(this);
        this.f20533k.setOnClickListener(new View.OnClickListener() {
            /* class com.bytedance.ee.bear.drive.view.widget.$$Lambda$ProgressBar$ntLWvp2HnuRmAZgqdunGwkaidA */

            public final void onClick(View view) {
                ProgressBar.this.m30333a((ProgressBar) view);
            }
        });
        this.f20523a.setTag(R.id.drive_preview_block_fun_location_tag, true);
        this.f20526d.setTag(R.id.drive_preview_block_fun_location_tag, true);
        this.f20531i.setTag(R.id.drive_preview_block_fun_location_tag, true);
        this.f20533k.setTag(R.id.drive_preview_block_fun_location_tag, true);
    }

    public void setPlayStateChangedListener(AbstractC7563a aVar) {
        this.f20537o = aVar;
    }

    public void setProgressSeekedListener(AbstractC7564b bVar) {
        this.f20538p = bVar;
    }

    public void setPauseBtnBg(int i) {
        this.f20525c.setImageResource(i);
    }

    public void setPauseBtnDrawable(Drawable drawable) {
        this.f20525c.setImageDrawable(drawable);
    }

    public void setResolution(String str) {
        this.f20530h.setText(str);
    }

    public void setResolutionClickListener(View.OnClickListener onClickListener) {
        this.f20530h.setOnClickListener(onClickListener);
    }

    public void setSilent(boolean z) {
        this.f20531i.setSilent(z);
    }

    public void setStartBtnBg(int i) {
        this.f20524b.setImageResource(i);
    }

    public void setStartBtnDrawable(Drawable drawable) {
        this.f20524b.setImageDrawable(drawable);
    }

    public void setVolumeStateChangedListener(VolumeView.AbstractC7567a aVar) {
        this.f20531i.setVolumeStateChangedListener(aVar);
    }

    public ProgressBar(Context context) {
        super(context);
        m30335e();
    }

    public void onStartTrackingTouch(SeekBar seekBar) {
        this.f20539q = true;
        AbstractC7564b bVar = this.f20538p;
        if (bVar != null) {
            bVar.mo28326e();
        }
    }

    public void setMaxLengthTextColor(int i) {
        this.f20528f.setTextColor(getResources().getColor(i));
    }

    public void setPlayState(boolean z) {
        if (z != this.f20536n) {
            m30334b(z);
            AbstractC7563a aVar = this.f20537o;
            if (aVar != null) {
                aVar.mo28322b(z);
            }
        }
    }

    public void setPlayerState(int i) {
        boolean z = true;
        if (i == 5) {
            this.f20545w = true;
        }
        if (i != 4) {
            z = false;
        }
        m30334b(z);
    }

    public void setProgress(int i) {
        if (i >= 0 && i <= this.f20535m && !this.f20539q) {
            setProgressInternal(i);
        }
    }

    public void setProgressBg(int i) {
        this.f20526d.setProgressDrawable(getResources().getDrawable(i, null));
    }

    public void setProgressTextColor(int i) {
        this.f20527e.setTextColor(getResources().getColor(i));
    }

    public void setResolutionTextColor(int i) {
        this.f20530h.setTextColor(getResources().getColor(i));
    }

    public void setThumbBg(int i) {
        this.f20526d.setThumb(getResources().getDrawable(i, null));
    }

    public void setWholeBackgroundColor(int i) {
        setBackgroundColor(getResources().getColor(i));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m30333a(View view) {
        this.f20540r.liveInnerReportMsg().mo28018a(C7557g.m30300a(29));
        this.f20544v.getEnterFullScreen().mo5926a((Object) null);
    }

    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.start) {
            setPlayState(true);
            mo29651b();
        } else if (id == R.id.pause) {
            setPlayState(false);
        }
    }

    public void setMaxLength(int i) {
        this.f20535m = i;
        this.f20526d.setMax(i);
        this.f20528f.setText(C13724b.m55670a(i));
    }

    public void setResolutionVisible(boolean z) {
        int i;
        this.f20529g = z;
        TextView textView = this.f20530h;
        if (!z || this.f20542t) {
            i = 8;
        } else {
            i = 0;
        }
        textView.setVisibility(i);
    }

    public void setViewModel(ViewOwner viewOwner) {
        this.f20540r = (C7555f) viewOwner.viewModel(C7555f.class);
        this.f20543u = (DriveMediaVM) viewOwner.viewModel(DriveMediaVM.class);
        this.f20544v = (DriveBlockPreviewVM) viewOwner.viewModel(DriveBlockPreviewVM.class);
    }

    /* renamed from: b */
    private void m30334b(boolean z) {
        if (z != this.f20536n) {
            this.f20536n = z;
            if (z) {
                this.f20524b.setVisibility(8);
                this.f20525c.setVisibility(0);
                return;
            }
            this.f20524b.setVisibility(0);
            this.f20525c.setVisibility(8);
        }
    }

    private void setProgressInternal(int i) {
        this.f20534l = i;
        this.f20526d.setProgress(i);
        this.f20527e.setText(C13724b.m55670a(i));
        DriveMediaVM bVar = this.f20543u;
        if (bVar != null) {
            bVar.getPlayPosition().mo5926a(Long.valueOf((long) i));
        }
    }

    /* renamed from: a */
    public void mo29649a(boolean z) {
        this.f20542t = true;
        setVisibility(0);
        this.f20530h.setVisibility(8);
        if (z) {
            this.f20526d.setVisibility(8);
            this.f20531i.setVisibility(8);
            this.f20523a.setVisibility(8);
            this.f20527e.setVisibility(8);
            this.f20532j.setVisibility(8);
            this.f20533k.setVisibility(8);
            this.f20528f.setVisibility(8);
            setBackground(null);
            return;
        }
        this.f20526d.setVisibility(0);
        this.f20531i.setVisibility(0);
        this.f20523a.setVisibility(0);
        this.f20527e.setVisibility(0);
        this.f20528f.setVisibility(0);
        this.f20532j.setVisibility(0);
        this.f20533k.setVisibility(0);
        setBackgroundDrawable(getResources().getDrawable(R.drawable.drive_progressbar_bg));
    }

    public void onStopTrackingTouch(SeekBar seekBar) {
        this.f20539q = false;
        AbstractC7564b bVar = this.f20538p;
        if (bVar != null) {
            bVar.mo28321b(seekBar.getProgress());
            this.f20538p.mo28327f();
        }
        if (seekBar.getProgress() > this.f20541s) {
            C7555f fVar = this.f20540r;
            if (fVar != null) {
                fVar.liveInnerReportMsg().mo28018a(C7557g.m30300a(4));
            }
        } else {
            C7555f fVar2 = this.f20540r;
            if (fVar2 != null) {
                fVar2.liveInnerReportMsg().mo28018a(C7557g.m30300a(5));
            }
        }
        this.f20541s = seekBar.getProgress();
    }

    public ProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m30335e();
    }

    public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        setProgressInternal(i);
    }

    public ProgressBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m30335e();
    }
}
