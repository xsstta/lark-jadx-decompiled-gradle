package com.ss.android.lark.widget.fileview;

import android.app.Activity;
import android.content.Context;
import android.graphics.RectF;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.component.ui.imageview.LKUIRoundedImageView;
import com.larksuite.framework.utils.C26311p;
import com.larksuite.framework.utils.RomUtils;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.desktopmode.view.C36592a;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.permission.AbstractC51324c;
import com.ss.android.lark.permission.C51327f;
import com.ss.android.lark.utils.C57881t;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.C58323b;
import com.ss.android.lark.widget.fileview.FileView;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;

public class DesktopFileView extends ConstraintLayout {

    /* renamed from: p */
    private static final String[] f143902p = {".docx", ".doc"};

    /* renamed from: q */
    private static final String[] f143903q = {".xlsx", ".xls", ".csv"};

    /* renamed from: a */
    public LKUIRoundedImageView f143904a;

    /* renamed from: b */
    public TextView f143905b;

    /* renamed from: c */
    public TextView f143906c;

    /* renamed from: d */
    public TextView f143907d;

    /* renamed from: e */
    public TextView f143908e;

    /* renamed from: f */
    public ProgressBar f143909f;

    /* renamed from: g */
    public ProgressBar f143910g;

    /* renamed from: h */
    public View f143911h;

    /* renamed from: i */
    public View f143912i;

    /* renamed from: j */
    public LinearLayout f143913j;

    /* renamed from: k */
    public ImageView f143914k;

    /* renamed from: l */
    public ImageView f143915l;

    /* renamed from: m */
    public ImageView f143916m;

    /* renamed from: n */
    public TextView f143917n;

    /* renamed from: o */
    public AbstractC58445b f143918o;

    /* renamed from: r */
    private C36592a f143919r;

    /* renamed from: s */
    private int f143920s = -1;

    /* renamed from: t */
    private boolean f143921t;

    /* renamed from: u */
    private boolean f143922u;

    /* renamed from: v */
    private C58444a f143923v;

    @Retention(RetentionPolicy.SOURCE)
    public @interface Progress {
    }

    /* renamed from: com.ss.android.lark.widget.fileview.DesktopFileView$b */
    public interface AbstractC58445b {
        /* renamed from: a */
        void mo122684a(View view);

        /* renamed from: b */
        void mo122685b(View view);

        /* renamed from: c */
        void mo122686c(View view);

        /* renamed from: d */
        void mo122687d(View view);

        /* renamed from: e */
        void mo122688e(View view);

        /* renamed from: f */
        void mo122689f(View view);

        /* renamed from: g */
        void mo122690g(View view);
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public /* synthetic */ void m226600i() {
        this.f143920s = 0;
    }

    public LKUIRoundedImageView getFileIconView() {
        return this.f143904a;
    }

    /* renamed from: a */
    public boolean mo197888a(MotionEvent motionEvent) {
        ImageView imageView;
        int i;
        int action = motionEvent.getAction();
        if (action == 7) {
            boolean z = m226583a(this.f143914k, motionEvent) && this.f143921t;
            boolean a = m226583a(this.f143915l, motionEvent);
            boolean z2 = m226583a(this.f143916m, motionEvent) && this.f143922u;
            if (z) {
                imageView = this.f143914k;
                i = 1;
            } else if (a) {
                imageView = this.f143915l;
                i = 2;
            } else if (z2) {
                imageView = this.f143916m;
                i = 3;
            } else {
                imageView = null;
                i = 0;
            }
            m226582a(imageView, i);
            m226579a(i);
            if (i != 0) {
                return true;
            }
            return false;
        } else if (action != 10) {
            return false;
        } else {
            m226587b();
            return false;
        }
    }

    /* renamed from: b */
    private void m226587b() {
        C36592a aVar = this.f143919r;
        if (aVar != null) {
            aVar.dismiss();
        }
    }

    /* renamed from: g */
    private void m226598g() {
        int i;
        LinearLayout linearLayout = this.f143913j;
        if (m226599h()) {
            i = 8;
        } else {
            i = 0;
        }
        linearLayout.setVisibility(i);
    }

    /* renamed from: a */
    private void m226578a() {
        this.f143914k.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.widget.fileview.$$Lambda$DesktopFileView$Jb2gtgc4rojfILChCTiZ7YosR5w */

            public final void onClick(View view) {
                DesktopFileView.this.m226597f(view);
            }
        });
        this.f143916m.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.widget.fileview.$$Lambda$DesktopFileView$3ecBM40g2nUI8yxvKu3PxkvLr0U */

            public final void onClick(View view) {
                DesktopFileView.this.m226595e(view);
            }
        });
        setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.widget.fileview.$$Lambda$DesktopFileView$3CG6EnaUXMeSaZx0uzS9kt4Oib0 */

            public final void onClick(View view) {
                DesktopFileView.this.m226592d(view);
            }
        });
    }

    /* renamed from: c */
    private void m226590c() {
        int i;
        ImageView imageView = this.f143914k;
        int i2 = 8;
        if (this.f143921t) {
            i = 0;
        } else {
            i = 8;
        }
        imageView.setVisibility(i);
        this.f143915l.setVisibility(0);
        ImageView imageView2 = this.f143916m;
        if (this.f143922u) {
            i2 = 0;
        }
        imageView2.setVisibility(i2);
    }

    /* renamed from: d */
    private boolean m226593d() {
        C58444a aVar = this.f143923v;
        if (aVar == null || TextUtils.isEmpty(aVar.f143937l) || !C57881t.m224633e(this.f143923v.f143937l, this.f143923v.f143933h)) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    private void m226594e() {
        if (this.f143918o != null) {
            if (C51327f.m199081a(getContext(), "android.permission.WRITE_EXTERNAL_STORAGE") || !C51327f.f127826a) {
                this.f143918o.mo122686c(this.f143915l);
                return;
            }
            C51327f.f127826a = false;
            C51327f.m199079a((Activity) getContext(), new AbstractC51324c() {
                /* class com.ss.android.lark.widget.fileview.DesktopFileView.C584421 */

                @Override // com.ss.android.lark.permission.AbstractC51324c
                /* renamed from: a */
                public void mo49823a() {
                    DesktopFileView.this.f143918o.mo122686c(DesktopFileView.this.f143915l);
                }

                @Override // com.ss.android.lark.permission.AbstractC51324c
                /* renamed from: b */
                public void mo49824b() {
                    Log.m165383e("DesktopFileView", "apply premission failed");
                    DesktopFileView.this.f143918o.mo122686c(DesktopFileView.this.f143915l);
                }
            });
        }
    }

    /* renamed from: f */
    private void m226596f() {
        if (this.f143918o != null) {
            if (C51327f.m199081a(getContext(), "android.permission.WRITE_EXTERNAL_STORAGE") || !C51327f.f127826a) {
                this.f143918o.mo122687d(this.f143915l);
                return;
            }
            C51327f.f127826a = false;
            C51327f.m199079a((Activity) getContext(), new AbstractC51324c() {
                /* class com.ss.android.lark.widget.fileview.DesktopFileView.C584432 */

                @Override // com.ss.android.lark.permission.AbstractC51324c
                /* renamed from: a */
                public void mo49823a() {
                    DesktopFileView.this.f143918o.mo122687d(DesktopFileView.this.f143915l);
                }

                @Override // com.ss.android.lark.permission.AbstractC51324c
                /* renamed from: b */
                public void mo49824b() {
                    Log.m165383e("DesktopFileView", "apply premission failed");
                    DesktopFileView.this.f143918o.mo122687d(DesktopFileView.this.f143915l);
                }
            });
        }
    }

    /* renamed from: h */
    private boolean m226599h() {
        boolean z;
        boolean z2;
        C58444a aVar = this.f143923v;
        if (aVar == null) {
            return false;
        }
        if (aVar.f143932g.f143955a == 3) {
            z = true;
        } else {
            z = false;
        }
        if (this.f143923v.f143932g.f143955a == 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z || z2 || this.f143923v.f143927b || this.f143923v.f143929d || this.f143923v.f143928c) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m226588b(View view) {
        m226594e();
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m226591c(View view) {
        AbstractC58445b bVar = this.f143918o;
        if (bVar != null) {
            bVar.mo122690g(view);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ void m226592d(View view) {
        AbstractC58445b bVar = this.f143918o;
        if (bVar != null) {
            bVar.mo122684a(view);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public /* synthetic */ void m226597f(View view) {
        AbstractC58445b bVar = this.f143918o;
        if (bVar != null) {
            bVar.mo122685b(view);
        }
    }

    public DesktopFileView(Context context) {
        super(context);
        m226580a(context);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m226581a(View view) {
        if (m226593d()) {
            m226596f();
        } else {
            m226594e();
        }
    }

    /* renamed from: b */
    private boolean m226589b(C58444a aVar) {
        if (aVar != null && !aVar.f143926a && !aVar.f143936k) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ void m226595e(View view) {
        if (this.f143918o == null) {
            return;
        }
        if (this.f143923v.f143938m == 0 || this.f143923v.f143939n) {
            this.f143918o.mo122689f(view);
        } else {
            this.f143918o.mo122688e(view);
        }
    }

    /* renamed from: a */
    private void m226579a(int i) {
        boolean[] zArr = new boolean[3];
        if (i == 1) {
            zArr[0] = true;
        } else if (i == 2) {
            zArr[1] = true;
        } else if (i == 3) {
            zArr[2] = true;
        }
        this.f143914k.setSelected(zArr[0]);
        this.f143915l.setSelected(zArr[1]);
        this.f143916m.setSelected(zArr[2]);
    }

    private void setupDownloadProgress(C58444a aVar) {
        if (aVar.f143932g.f143955a == 2) {
            this.f143910g.setProgress(aVar.f143935j);
            this.f143910g.setVisibility(0);
            this.f143913j.setVisibility(8);
            return;
        }
        this.f143910g.setVisibility(8);
    }

    private void setupUploadProgress(C58444a aVar) {
        if (aVar.f143932g.f143955a == 3) {
            this.f143909f.setProgress(aVar.f143935j);
            this.f143909f.setVisibility(0);
            this.f143913j.setVisibility(8);
            return;
        }
        this.f143909f.setVisibility(8);
    }

    /* renamed from: b */
    private String m226586b(int i) {
        if (i == 1) {
            return UIHelper.getString(R.string.Lark_File_OpenWithDocsButtonTag);
        }
        if (i != 2) {
            if (i != 3) {
                return "";
            }
            if (this.f143923v.f143938m == 0 || this.f143923v.f143939n) {
                return UIHelper.getString(R.string.Lark_File_PreviewOnlineButtonTag);
            }
            return UIHelper.getString(R.string.Lark_File_SaveToDriveButtonTag);
        } else if (m226593d()) {
            return UIHelper.getString(R.string.Lark_File_ShowInFolderButtonTag);
        } else {
            return UIHelper.getString(R.string.Lark_File_SaveAsButtonTag);
        }
    }

    private void setupDownloadOrOpenIv(C58444a aVar) {
        boolean z;
        if (aVar.f143932g.f143955a == 2) {
            z = true;
        } else {
            z = false;
        }
        if (m226593d()) {
            this.f143915l.setImageResource(R.drawable.ic_file_open_local_selector);
            this.f143917n.setVisibility(8);
            this.f143911h.setVisibility(8);
        } else if (z) {
            this.f143917n.setVisibility(8);
            this.f143911h.setVisibility(0);
            this.f143911h.setOnClickListener(new View.OnClickListener() {
                /* class com.ss.android.lark.widget.fileview.$$Lambda$DesktopFileView$9oJOflMEFkAto3KzChpcPujPM */

                public final void onClick(View view) {
                    DesktopFileView.this.m226591c(view);
                }
            });
        } else {
            this.f143917n.setVisibility(8);
            this.f143911h.setVisibility(8);
            this.f143915l.setImageResource(R.drawable.ic_file_download_selector);
            this.f143915l.setOnClickListener(new View.OnClickListener() {
                /* class com.ss.android.lark.widget.fileview.$$Lambda$DesktopFileView$DJUMh6HxNFOKAVkYMoYTKBy2z0k */

                public final void onClick(View view) {
                    DesktopFileView.this.m226588b((DesktopFileView) view);
                }
            });
        }
        this.f143915l.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.widget.fileview.$$Lambda$DesktopFileView$84mIpwneQsreiZJnnPjGMv_8y4 */

            public final void onClick(View view) {
                DesktopFileView.this.m226581a((DesktopFileView) view);
            }
        });
    }

    private void setupSourceFileRecallTV(C58444a aVar) {
        if (aVar.f143927b) {
            this.f143908e.setVisibility(0);
            this.f143907d.setVisibility(8);
            this.f143917n.setVisibility(8);
            this.f143908e.setText(UIUtils.getString(getContext(), R.string.Lark_Legacy_FileStatusSourceDelete));
        } else if (aVar.f143928c || aVar.f143929d) {
            this.f143908e.setVisibility(0);
            this.f143907d.setVisibility(8);
            this.f143917n.setVisibility(8);
            this.f143908e.setText(UIUtils.getString(getContext(), R.string.Lark_ChatFileStorage_ChatFileDeletedByAdmin));
        } else {
            this.f143908e.setVisibility(8);
            this.f143907d.setVisibility(0);
        }
    }

    /* renamed from: a */
    private boolean m226584a(C58444a aVar) {
        this.f143914k.setImageResource(R.drawable.ic_file_open_online_selector);
        if (aVar != null && m226585a(aVar.f143933h) && aVar.f143934i <= 20971520) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private void m226580a(Context context) {
        setBackgroundResource(R.drawable.chat_bubble_self_bg_selector);
        View view = new View(context);
        this.f143912i = view;
        view.setId(R.id.bottom_line);
        this.f143912i.setBackgroundResource(R.color.lkui_N300);
        this.f143912i.setVisibility(8);
        ConstraintLayout.LayoutParams a = C58323b.m226142a(-1.0f, 1.0f);
        a.f2827s = 0;
        a.f2825q = 0;
        a.f2819k = 0;
        addView(this.f143912i, a);
        ProgressBar progressBar = new ProgressBar(context, null, 16842872);
        this.f143909f = progressBar;
        progressBar.setId(R.id.progressbar);
        this.f143909f.setProgressDrawable(UIUtils.getDrawable(context, R.drawable.file_message_progress_bar));
        ConstraintLayout.LayoutParams a2 = C58323b.m226143a(BitmapDescriptorFactory.HUE_RED, 3.0f, 0, 0, 0, 0);
        a2.f2819k = 0;
        a2.f2825q = 0;
        a2.f2827s = 0;
        a2.f2827s = 0;
        this.f143909f.setVisibility(8);
        addView(this.f143909f, a2);
        LKUIRoundedImageView lKUIRoundedImageView = new LKUIRoundedImageView(context);
        this.f143904a = lKUIRoundedImageView;
        lKUIRoundedImageView.setId(R.id.image_file_icon);
        this.f143904a.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        this.f143904a.setImageResource(R.drawable.icon_file_message_default);
        this.f143904a.setOval(false);
        this.f143904a.setCornerRadiusDP(10.0f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 10.0f);
        ConstraintLayout.LayoutParams a3 = C58323b.m226143a(30.0f, 38.0f, 16, 0, 16, 0);
        a3.f2825q = 0;
        a3.f2816h = 0;
        a3.f2819k = 0;
        addView(this.f143904a, a3);
        TextView textView = new TextView(context);
        this.f143905b = textView;
        textView.setId(R.id.tv_file_name);
        this.f143905b.setEllipsize(TextUtils.TruncateAt.END);
        this.f143905b.setSingleLine(true);
        this.f143905b.setTextColor(UIUtils.getColor(context, R.color.lkui_N900));
        this.f143905b.setTextSize(14.0f);
        ConstraintLayout.LayoutParams a4 = C58323b.m226143a(-2.0f, -2.0f, 10, 16, 0, 0);
        a4.f2834z = BitmapDescriptorFactory.HUE_RED;
        a4.f2802T = true;
        a4.f2789G = 2;
        a4.f2816h = 0;
        a4.f2824p = R.id.image_file_icon;
        a4.f2826r = R.id.tv_file_type;
        addView(this.f143905b, a4);
        TextView textView2 = new TextView(context);
        this.f143906c = textView2;
        textView2.setId(R.id.tv_file_type);
        this.f143906c.setSingleLine(true);
        this.f143906c.setTextColor(UIUtils.getColor(context, R.color.lkui_N900));
        this.f143906c.setTextSize(14.0f);
        ConstraintLayout.LayoutParams a5 = C58323b.m226142a(-2.0f, -2.0f);
        a5.f2816h = R.id.tv_file_name;
        a5.f2819k = R.id.tv_file_name;
        a5.f2824p = R.id.tv_file_name;
        a5.f2826r = R.id.file_info_padding;
        addView(this.f143906c, a5);
        TextView textView3 = new TextView(context);
        this.f143907d = textView3;
        textView3.setId(R.id.tv_file_size);
        this.f143907d.setSingleLine(true);
        this.f143907d.setTextColor(UIUtils.getColor(context, R.color.lkui_N500));
        this.f143907d.setTextSize(12.0f);
        ConstraintLayout.LayoutParams a6 = C58323b.m226142a(-2.0f, -2.0f);
        a6.f2819k = 0;
        a6.f2825q = R.id.tv_file_name;
        a6.bottomMargin = UIHelper.dp2px(16.0f);
        addView(this.f143907d, a6);
        View view2 = new View(context);
        view2.setId(R.id.file_info_padding);
        ConstraintLayout.LayoutParams a7 = C58323b.m226143a(18.0f, 1.0f, 0, 0, 0, 8);
        a7.f2817i = R.id.tv_file_name;
        a7.f2819k = 0;
        a7.f2827s = 0;
        addView(view2, a7);
        View view3 = new View(context);
        this.f143911h = view3;
        view3.setId(R.id.btn_file_progress_close);
        this.f143911h.setBackgroundResource(R.drawable.close_upload_btn_bg);
        this.f143911h.setVisibility(8);
        ConstraintLayout.LayoutParams a8 = C58323b.m226142a(20.0f, 20.0f);
        a8.f2819k = 0;
        a8.f2827s = 0;
        a8.bottomMargin = UIHelper.dp2px(10.0f);
        a8.rightMargin = UIHelper.dp2px(10.0f);
        addView(this.f143911h, a8);
        ProgressBar progressBar2 = new ProgressBar(context, null, 16842872);
        this.f143910g = progressBar2;
        progressBar2.setId(R.id.download_progressbar);
        this.f143910g.setProgressDrawable(UIUtils.getDrawable(context, R.drawable.file_message_progress_bar));
        ConstraintLayout.LayoutParams a9 = C58323b.m226143a(BitmapDescriptorFactory.HUE_RED, 3.0f, 0, 0, 0, 0);
        a9.f2812d = 0;
        a9.f2815g = 0;
        a9.f2819k = 0;
        this.f143910g.setVisibility(8);
        addView(this.f143910g, a9);
        TextView textView4 = new TextView(context);
        this.f143917n = textView4;
        textView4.setSingleLine(true);
        this.f143917n.setText(UIHelper.getString(R.string.Lark_Legacy_FileDownloading));
        this.f143917n.setTextColor(UIUtils.getColor(context, R.color.lkui_N500));
        this.f143917n.setTextSize(14.0f);
        ConstraintLayout.LayoutParams a10 = C58323b.m226142a(-2.0f, -2.0f);
        a10.f2813e = R.id.tv_file_size;
        a10.f2819k = 0;
        a10.bottomMargin = UIHelper.dp2px(10.0f);
        a10.leftMargin = UIHelper.dp2px(5.0f);
        addView(this.f143917n, a10);
        TextView textView5 = new TextView(context);
        this.f143908e = textView5;
        textView5.setText(UIUtils.getString(getContext(), R.string.Lark_Legacy_FileStatusSourceDelete));
        this.f143908e.setTextColor(UIUtils.getColor(getContext(), R.color.lkui_N500));
        this.f143908e.setTextSize(12.0f);
        ConstraintLayout.LayoutParams a11 = C58323b.m226142a(-2.0f, -2.0f);
        a11.f2819k = 0;
        a11.f2825q = R.id.tv_file_name;
        a11.bottomMargin = UIHelper.dp2px(10.0f);
        addView(this.f143908e, a11);
        LinearLayout linearLayout = new LinearLayout(context);
        this.f143913j = linearLayout;
        linearLayout.setOrientation(0);
        ConstraintLayout.LayoutParams a12 = C58323b.m226143a(-2.0f, -2.0f, 0, 0, 0, 10);
        a12.f2819k = 0;
        a12.f2815g = 0;
        addView(this.f143913j, a12);
        ImageView imageView = new ImageView(context);
        this.f143916m = imageView;
        imageView.setId(R.id.iv_cloud_upload);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.rightMargin = UIHelper.dp2px(20.0f);
        this.f143913j.addView(this.f143916m, layoutParams);
        this.f143916m.setVisibility(8);
        ImageView imageView2 = new ImageView(context);
        this.f143914k = imageView2;
        imageView2.setId(R.id.iv_open_online);
        if (RomUtils.m94953h()) {
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
            layoutParams2.rightMargin = UIHelper.dp2px(20.0f);
            this.f143913j.addView(this.f143914k, layoutParams2);
        }
        ImageView imageView3 = new ImageView(context);
        this.f143915l = imageView3;
        imageView3.setId(R.id.iv_open_or_download);
        this.f143915l.setVisibility(8);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams3.rightMargin = UIHelper.dp2px(16.0f);
        this.f143913j.addView(this.f143915l, layoutParams3);
        this.f143913j.setVisibility(8);
        m226578a();
    }

    /* renamed from: a */
    private static boolean m226585a(String str) {
        ArrayList<String> arrayList = new ArrayList();
        arrayList.addAll(Arrays.asList(f143902p));
        arrayList.addAll(Arrays.asList(f143903q));
        for (String str2 : arrayList) {
            if (str.endsWith(str2)) {
                return true;
            }
        }
        return false;
    }

    public DesktopFileView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m226580a(context);
    }

    /* renamed from: a */
    private void m226582a(View view, int i) {
        if (this.f143920s != i) {
            if (i == 0) {
                m226587b();
                return;
            }
            m226587b();
            C36592a a = new C36592a.C36593a().mo135002a(m226586b(i)).mo135003a(getContext());
            this.f143919r = a;
            this.f143920s = i;
            a.mo134996a(view);
            this.f143919r.setOnDismissListener(new PopupWindow.OnDismissListener() {
                /* class com.ss.android.lark.widget.fileview.$$Lambda$DesktopFileView$obLRYEngBzvT1uqEbtfdCaIX134 */

                public final void onDismiss() {
                    DesktopFileView.this.m226600i();
                }
            });
        }
    }

    /* renamed from: a */
    private boolean m226583a(View view, MotionEvent motionEvent) {
        if (!view.isShown()) {
            return false;
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return new RectF((float) iArr[0], (float) iArr[1], (float) (iArr[0] + view.getWidth()), (float) (iArr[1] + view.getHeight())).contains(motionEvent.getRawX(), motionEvent.getRawY());
    }

    /* renamed from: a */
    public void mo197887a(C58444a aVar, AbstractC58445b bVar) {
        this.f143918o = bVar;
        this.f143923v = aVar;
        if (aVar != null) {
            this.f143905b.setText(C26311p.m95286f(aVar.f143933h));
            this.f143906c.setText(C26311p.m95287g(this.f143923v.f143933h));
            this.f143907d.setText(C26311p.m95262a(this.f143923v.f143934i));
            this.f143904a.setImageResource(C57881t.m224626c(this.f143923v.f143931f, this.f143923v.f143933h));
            if (aVar.f143938m == 0 || aVar.f143939n) {
                this.f143916m.setImageResource(R.drawable.ic_icon_cloud_preview_selector);
            } else {
                this.f143916m.setImageResource(R.drawable.ic_icon_cloud_upload_selector);
            }
            this.f143921t = m226584a(aVar);
            this.f143922u = m226589b(aVar);
            setupUploadProgress(aVar);
            setupDownloadProgress(aVar);
            setupDownloadOrOpenIv(aVar);
            setupSourceFileRecallTV(aVar);
            m226587b();
            m226598g();
            m226590c();
        }
    }

    public DesktopFileView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m226580a(context);
    }

    /* renamed from: com.ss.android.lark.widget.fileview.DesktopFileView$a */
    public static class C58444a {

        /* renamed from: a */
        public final boolean f143926a;

        /* renamed from: b */
        public final boolean f143927b;

        /* renamed from: c */
        public final boolean f143928c;

        /* renamed from: d */
        public final boolean f143929d;

        /* renamed from: e */
        public final boolean f143930e;

        /* renamed from: f */
        public final String f143931f;

        /* renamed from: g */
        public final FileView.FileState f143932g;

        /* renamed from: h */
        public final String f143933h;

        /* renamed from: i */
        public final long f143934i;

        /* renamed from: j */
        public final int f143935j;

        /* renamed from: k */
        public final boolean f143936k;

        /* renamed from: l */
        public final String f143937l;

        /* renamed from: m */
        public final int f143938m;

        /* renamed from: n */
        public final boolean f143939n;

        public C58444a(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, String str, FileView.FileState fileState, String str2, long j, int i, boolean z6, String str3, int i2, boolean z7) {
            this.f143926a = z;
            this.f143927b = z2;
            this.f143928c = z3;
            this.f143929d = z4;
            this.f143930e = z5;
            this.f143931f = str;
            this.f143932g = fileState;
            this.f143933h = str2;
            this.f143934i = j;
            this.f143935j = i;
            this.f143936k = z6;
            this.f143937l = str3;
            this.f143938m = i2;
            this.f143939n = z7;
        }
    }
}
