package com.ss.android.vc.meeting.module.p3143n.p3146b.p3147a;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.airbnb.lottie.LottieAnimationView;
import com.larksuite.component.ui.imageview.LKUIRoundedImageView;
import com.larksuite.suite.R;
import com.ss.android.vc.common.widget.IconFontView;
import com.ss.android.vc.common.widget.tag.HostTag;
import com.ss.android.vc.common.widget.tag.InterpretationTag;

/* renamed from: com.ss.android.vc.meeting.module.n.b.a.f */
public class C62548f extends C62531a {

    /* renamed from: a */
    public LottieAnimationView f157407a;

    /* renamed from: b */
    public LKUIRoundedImageView f157408b;

    /* renamed from: c */
    public View f157409c;

    /* renamed from: d */
    public ConstraintLayout f157410d;

    /* renamed from: e */
    public TextView f157411e;

    /* renamed from: f */
    public TextView f157412f;

    /* renamed from: g */
    public HostTag f157413g;

    /* renamed from: h */
    public TextView f157414h;

    /* renamed from: i */
    public ImageView f157415i;

    /* renamed from: j */
    public ImageView f157416j;

    /* renamed from: k */
    public TextView f157417k;

    /* renamed from: l */
    public IconFontView f157418l;

    /* renamed from: m */
    public ImageView f157419m;

    /* renamed from: n */
    public ImageView f157420n;

    /* renamed from: o */
    public ImageView f157421o;

    /* renamed from: p */
    public View f157422p;

    /* renamed from: q */
    public View f157423q;

    /* renamed from: r */
    public InterpretationTag f157424r;

    public C62548f(View view) {
        super(view);
        this.f157407a = (LottieAnimationView) view.findViewById(R.id.participant_lottie);
        this.f157408b = (LKUIRoundedImageView) view.findViewById(R.id.participant_thumbnail);
        this.f157409c = view.findViewById(R.id.thumbnail_red_dot);
        this.f157410d = (ConstraintLayout) view.findViewById(R.id.participant_name_area);
        this.f157411e = (TextView) view.findViewById(R.id.participant_name);
        this.f157412f = (TextView) view.findViewById(R.id.participant_name_ext);
        this.f157413g = (HostTag) view.findViewById(R.id.description);
        this.f157414h = (TextView) view.findViewById(R.id.speak_request);
        this.f157415i = (ImageView) view.findViewById(R.id.participant_camera);
        this.f157416j = (ImageView) view.findViewById(R.id.participant_microphone);
        this.f157417k = (TextView) view.findViewById(R.id.participant_call_cancel);
        this.f157418l = (IconFontView) view.findViewById(R.id.desktop_participant_more);
        this.f157419m = (ImageView) view.findViewById(R.id.participant_share_screen);
        this.f157420n = (ImageView) view.findViewById(R.id.participant_signal_weak);
        this.f157421o = (ImageView) view.findViewById(R.id.participant_type_mobile);
        this.f157422p = view.findViewById(R.id.divide_line);
        this.f157423q = view.findViewById(R.id.externalTag);
        this.f157424r = (InterpretationTag) view.findViewById(R.id.interpretation_label);
    }
}
