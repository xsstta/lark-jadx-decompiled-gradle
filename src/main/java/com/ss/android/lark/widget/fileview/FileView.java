package com.ss.android.lark.widget.fileview;

import android.content.Context;
import android.content.res.ColorStateList;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.component.ui.display.manager.C25649b;
import com.larksuite.component.ui.display.manager.LKUIDisplayManager;
import com.larksuite.component.ui.display.manager.LarkFont;
import com.larksuite.component.ui.imageview.LKUIRoundedImageView;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.component.universe_design.color.UDColorUtils;
import com.larksuite.framework.utils.C26311p;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.C37030f;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.utils.C57881t;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.C58323b;
import com.ss.android.lark.widget.textview.TailTextView;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import org.json.JSONException;
import org.json.JSONObject;

public class FileView extends ConstraintLayout {

    /* renamed from: a */
    public TailTextView f143940a;

    /* renamed from: b */
    public TextView f143941b;

    /* renamed from: c */
    public TextView f143942c;

    /* renamed from: d */
    public TextView f143943d;

    /* renamed from: e */
    public TextView f143944e;

    /* renamed from: f */
    public LKUIRoundedImageView f143945f;

    /* renamed from: g */
    public LKUIRoundedImageView f143946g;

    /* renamed from: h */
    public ProgressBar f143947h;

    /* renamed from: i */
    public View f143948i;

    /* renamed from: j */
    public View f143949j;

    /* renamed from: k */
    public C58449a f143950k;

    /* renamed from: l */
    public C58450b f143951l;

    /* renamed from: com.ss.android.lark.widget.fileview.FileView$b */
    public static class C58450b {
        /* renamed from: a */
        public void mo122693a(C58449a aVar) {
        }

        /* renamed from: b */
        public void mo122694b(C58449a aVar) {
        }

        /* renamed from: c */
        public boolean mo122695c(C58449a aVar) {
            return false;
        }
    }

    public static class FileState {

        /* renamed from: a */
        public int f143955a;

        /* renamed from: b */
        private String f143956b;

        @Retention(RetentionPolicy.SOURCE)
        public @interface FileStateType {
        }

        /* renamed from: a */
        public String mo197905a() {
            return this.f143956b;
        }

        public FileState(int i, String str) {
            this.f143955a = i;
            this.f143956b = str;
        }
    }

    public LKUIRoundedImageView getFileIconView() {
        return this.f143945f;
    }

    /* renamed from: b */
    public void mo197893b() {
        LKUIToast.show(getContext(), (int) R.string.Lark_Legacy_FileWithdrawTip);
    }

    /* renamed from: c */
    public void mo197894c() {
        LKUIToast.show(getContext(), (int) R.string.Lark_ChatFileStorage_ChatFileNotFoundDialogOver90Days);
    }

    /* renamed from: d */
    public void mo197895d() {
        LKUIToast.show(getContext(), (int) R.string.Lark_ChatFileStorage_ChatFileNotFoundDialogWithin90Days);
    }

    /* renamed from: f */
    private void m226616f() {
        setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.widget.fileview.FileView.View$OnClickListenerC584461 */

            public void onClick(View view) {
                if (FileView.this.f143951l != null) {
                    FileView.this.mo197896e();
                }
            }
        });
        this.f143948i.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.widget.fileview.FileView.View$OnClickListenerC584472 */

            public void onClick(View view) {
                FileView.this.f143947h.setVisibility(8);
                if ((FileView.this.f143951l == null || !FileView.this.f143951l.mo122695c(FileView.this.f143950k)) && FileView.this.f143950k.f143963g.f143955a == 2) {
                    FileView.this.f143950k.f143963g.f143955a = 1;
                    FileView.this.f143947h.setVisibility(8);
                    if (FileView.this.f143951l != null) {
                        FileView.this.f143951l.mo122694b(FileView.this.f143950k);
                    }
                }
            }
        });
    }

    /* renamed from: g */
    private void m226617g() {
        this.f143940a.setText(this.f143950k.f143964h);
        if (this.f143950k.f143969m) {
            this.f143940a.setEllipsize(TextUtils.TruncateAt.END);
            return;
        }
        this.f143940a.setTailContent(C26311p.m95287g(this.f143950k.f143964h));
    }

    /* renamed from: e */
    public void mo197896e() {
        C58450b bVar;
        if (this.f143950k.f143961e) {
            if (!this.f143950k.f143969m) {
                m226615a(this.f143950k.f143962f);
            }
            if (this.f143950k.f143958b) {
                mo197893b();
            } else if (this.f143950k.f143960d) {
                mo197895d();
            } else if (this.f143950k.f143959c) {
                mo197894c();
            } else if (!this.f143950k.f143967k) {
                if ((this.f143950k.f143963g.f143955a == 1 || this.f143950k.f143963g.f143955a == 2 || this.f143950k.f143963g.f143955a == 6) && (bVar = this.f143951l) != null) {
                    bVar.mo122693a(this.f143950k);
                }
            }
        }
    }

    /* renamed from: a */
    public void mo197890a() {
        int dp2px = ((UIHelper.dp2px(32.0f) + (LKUIDisplayManager.m91881c(getContext(), 40) - UIHelper.dp2px(40.0f))) - (LKUIDisplayManager.m91881c(getContext(), 22) - UIHelper.dp2px(22.0f))) + (LKUIDisplayManager.m91881c(getContext(), 8) - UIHelper.dp2px(8.0f));
        int dp2px2 = ((UIHelper.dp2px(36.0f) + (LKUIDisplayManager.m91881c(getContext(), 40) - UIHelper.dp2px(40.0f))) - (LKUIDisplayManager.m91881c(getContext(), 22) - UIHelper.dp2px(22.0f))) + (LKUIDisplayManager.m91881c(getContext(), 5) - UIHelper.dp2px(5.0f));
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) this.f143946g.getLayoutParams();
        layoutParams.setMargins(dp2px, dp2px2, 0, 0);
        layoutParams.width = LKUIDisplayManager.m91881c(getContext(), 22);
        layoutParams.height = LKUIDisplayManager.m91881c(getContext(), 22);
        this.f143946g.setLayoutParams(layoutParams);
        C25649b.m91857a(this.f143941b, LarkFont.CAPTION0);
        C25649b.m91857a(this.f143944e, LarkFont.CAPTION0);
        C25649b.m91857a(this.f143943d, LarkFont.CAPTION0);
        C25649b.m91857a(this.f143942c, LarkFont.CAPTION0);
        C25649b.m91857a(this.f143940a, LarkFont.HEADLINE);
        C25649b.m91853a(this.f143948i, 20);
        C25649b.m91854a(this.f143945f, 40, 40);
    }

    public FileView(Context context) {
        this(context, null);
    }

    public void setCallback(C58450b bVar) {
        this.f143951l = bVar;
        setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.widget.fileview.FileView.View$OnClickListenerC584483 */

            public void onClick(View view) {
                FileView.this.mo197896e();
            }
        });
    }

    /* renamed from: a */
    private void m226615a(String str) {
        try {
            C37030f.m146093a().mo103026a("open_attach_card", new JSONObject().put("file_type", str));
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public void setBottomMargin(boolean z) {
        if (z) {
            ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) this.f143949j.getLayoutParams();
            layoutParams.setMargins(0, UIHelper.dp2px(4.0f), UIHelper.dp2px(16.0f), UIHelper.dp2px(12.0f));
            this.f143949j.setLayoutParams(layoutParams);
            return;
        }
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) this.f143949j.getLayoutParams();
        layoutParams2.setMargins(0, UIHelper.dp2px(4.0f), UIHelper.dp2px(16.0f), 0);
        this.f143949j.setLayoutParams(layoutParams2);
    }

    public void setFileSizeVisibility(boolean z) {
        if (z) {
            this.f143944e.setGravity(8388613);
            this.f143941b.setVisibility(0);
            return;
        }
        this.f143944e.setGravity(8388611);
        this.f143941b.setVisibility(8);
    }

    /* renamed from: a */
    public void mo197891a(C58449a aVar) {
        if (aVar.f143958b) {
            this.f143944e.setVisibility(0);
            this.f143944e.setTextColor(UIUtils.getColor(getContext(), R.color.text_placeholder));
            this.f143944e.setText(UIUtils.getString(getContext(), R.string.Lark_Legacy_FileStatusSourceDelete));
        } else if (aVar.f143959c || aVar.f143960d) {
            this.f143944e.setVisibility(0);
            this.f143944e.setTextColor(UIUtils.getColor(getContext(), R.color.text_placeholder));
            this.f143944e.setText(UIUtils.getString(getContext(), R.string.Lark_ChatFileStorage_ChatFileDeletedByAdmin));
        } else {
            this.f143944e.setVisibility(8);
            this.f143944e.setTextColor(UIUtils.getColor(getContext(), R.color.primary_pri_500));
            this.f143944e.setText(this.f143950k.f143963g.mo197905a());
        }
    }

    public void setInfo(C58449a aVar) {
        boolean z;
        int i;
        this.f143950k = aVar;
        if (aVar != null) {
            if (aVar.f143967k) {
                UIUtils.show(this.f143942c);
                UIUtils.show(this.f143946g);
                UIUtils.hide(this.f143941b);
                UIUtils.hide(this.f143943d);
                UIUtils.hide(this.f143947h);
                TextView textView = this.f143942c;
                if (aVar.f143968l) {
                    i = R.string.Lark_Message_file_lan_sendreceived;
                } else {
                    i = R.string.Lark_Message_file_lan_mobilereceived;
                }
                textView.setText(i);
            } else {
                UIUtils.hide(this.f143942c);
                UIUtils.hide(this.f143946g);
                UIUtils.show(this.f143941b);
                UIUtils.show(this.f143943d);
                if (this.f143950k.f143957a) {
                    UIUtils.show(this.f143943d);
                } else {
                    UIUtils.hide(this.f143943d);
                }
                if (this.f143950k.f143963g.f143955a == 3) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    this.f143947h.setProgress(this.f143950k.f143966j);
                    UIUtils.show(this.f143947h);
                } else {
                    UIUtils.hide(this.f143947h);
                }
                mo197891a(this.f143950k);
                this.f143941b.setText(C26311p.m95262a(this.f143950k.f143965i));
            }
            m226617g();
            this.f143945f.setImageResource(C57881t.m224622b(this.f143950k.f143962f, this.f143950k.f143964h, this.f143950k.f143969m));
        }
    }

    /* renamed from: a */
    private void m226614a(Context context) {
        ProgressBar progressBar = new ProgressBar(context, null, 16842872);
        this.f143947h = progressBar;
        progressBar.setId(R.id.progressbar);
        this.f143947h.setProgressDrawable(UIUtils.getDrawable(context, R.drawable.file_message_progress_bar));
        ConstraintLayout.LayoutParams a = C58323b.m226142a(BitmapDescriptorFactory.HUE_RED, 3.0f);
        a.f2819k = 0;
        a.f2825q = 0;
        a.f2827s = 0;
        addView(this.f143947h, a);
        TextView textView = new TextView(context);
        this.f143941b = textView;
        textView.setId(R.id.tv_file_size);
        this.f143941b.setSingleLine(true);
        this.f143941b.setTextColor(UIUtils.getColor(context, R.color.text_placeholder));
        this.f143941b.setTextSize(12.0f);
        ConstraintLayout.LayoutParams a2 = C58323b.m226142a(-2.0f, -2.0f);
        a2.f2816h = R.id.info_ruler;
        a2.f2819k = R.id.info_ruler;
        a2.f2825q = R.id.tv_file_name;
        addView(this.f143941b, a2);
        TextView textView2 = new TextView(context);
        this.f143944e = textView2;
        textView2.setId(R.id.tv_file_state);
        this.f143944e.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        this.f143944e.setSingleLine(true);
        this.f143944e.setTextColor(UIUtils.getColor(context, R.color.primary_pri_500));
        this.f143944e.setTextSize(12.0f);
        this.f143944e.setGravity(8388613);
        ConstraintLayout.LayoutParams a3 = C58323b.m226143a(BitmapDescriptorFactory.HUE_RED, -2.0f, 2, 0, 0, 0);
        a3.f2816h = R.id.info_ruler;
        a3.f2819k = R.id.info_ruler;
        a3.f2826r = R.id.tv_from_drive;
        a3.f2824p = R.id.tv_file_size;
        a3.f2832x = 0;
        addView(this.f143944e, a3);
        TextView textView3 = new TextView(context);
        this.f143943d = textView3;
        textView3.setId(R.id.tv_from_drive);
        this.f143943d.setText(R.string.Lark_Legacy_FileFromDrive);
        this.f143943d.setGravity(8388613);
        this.f143943d.setTextColor(UIUtils.getColor(context, R.color.text_placeholder));
        this.f143943d.setTextSize(12.0f);
        ConstraintLayout.LayoutParams a4 = C58323b.m226142a(BitmapDescriptorFactory.HUE_RED, -2.0f);
        a4.f2816h = R.id.info_ruler;
        a4.f2819k = R.id.info_ruler;
        a4.f2826r = R.id.btn_file_progress_close;
        addView(this.f143943d, a4);
        View view = new View(context);
        this.f143949j = view;
        view.setId(R.id.info_ruler);
        this.f143949j.setBackgroundResource(R.color.lkui_transparent);
        ConstraintLayout.LayoutParams a5 = C58323b.m226143a(16.0f, 17.0f, 0, 4, 0, 12);
        a5.f2817i = R.id.tv_file_name;
        a5.f2819k = 0;
        a5.f2827s = 0;
        addView(this.f143949j, a5);
        View view2 = new View(context);
        view2.setVisibility(4);
        ConstraintLayout.LayoutParams a6 = C58323b.m226142a(-1.0f, 1.0f);
        a6.f2817i = 0;
        a6.f2825q = 0;
        a6.f2827s = 0;
        addView(view2, a6);
        View view3 = new View(context);
        this.f143948i = view3;
        view3.setId(R.id.btn_file_progress_close);
        this.f143948i.setBackgroundResource(R.drawable.ud_icon_close_outlined);
        this.f143948i.setBackgroundTintList(ColorStateList.valueOf(UDColorUtils.getColor(context, R.color.icon_n1)));
        this.f143948i.setVisibility(8);
        ConstraintLayout.LayoutParams a7 = C58323b.m226142a(20.0f, 20.0f);
        a7.f2816h = R.id.info_ruler;
        a7.f2819k = R.id.info_ruler;
        a7.f2826r = R.id.info_ruler;
        addView(this.f143948i, a7);
        LKUIRoundedImageView lKUIRoundedImageView = new LKUIRoundedImageView(context);
        this.f143945f = lKUIRoundedImageView;
        lKUIRoundedImageView.setId(R.id.image_file_icon);
        this.f143945f.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        this.f143945f.setOval(false);
        ConstraintLayout.LayoutParams a8 = C58323b.m226143a(40.0f, 40.0f, 8, 14, 0, 0);
        a8.f2825q = 0;
        a8.f2816h = 0;
        addView(this.f143945f, a8);
        TailTextView tailTextView = new TailTextView(context);
        this.f143940a = tailTextView;
        tailTextView.setId(R.id.tv_file_name);
        this.f143940a.setMaxLines(3);
        this.f143940a.setLineSpacing(2.5f, 1.0f);
        this.f143940a.setTextColor(UIUtils.getColor(context, R.color.text_title));
        if (DesktopUtil.m144301a(getContext())) {
            this.f143940a.setTextSize(1, 17.0f);
        } else {
            this.f143940a.setTextSize(16.0f);
        }
        ConstraintLayout.LayoutParams a9 = C58323b.m226143a(BitmapDescriptorFactory.HUE_RED, -2.0f, 16, 12, 12, 0);
        a9.f2816h = 0;
        a9.f2824p = R.id.image_file_icon;
        a9.f2827s = 0;
        addView(this.f143940a, a9);
        TextView textView4 = new TextView(context);
        this.f143942c = textView4;
        textView4.setId(R.id.lan_trans_notice);
        this.f143942c.setMaxLines(3);
        this.f143942c.setTextColor(UIUtils.getColor(context, R.color.text_placeholder));
        this.f143942c.setTextSize(12.0f);
        ConstraintLayout.LayoutParams a10 = C58323b.m226143a(BitmapDescriptorFactory.HUE_RED, -2.0f, 16, 6, 16, 12);
        a10.f2817i = R.id.tv_file_name;
        a10.f2824p = R.id.image_file_icon;
        a10.f2827s = 0;
        a10.f2819k = 0;
        addView(this.f143942c, a10);
        LKUIRoundedImageView lKUIRoundedImageView2 = new LKUIRoundedImageView(context);
        this.f143946g = lKUIRoundedImageView2;
        lKUIRoundedImageView2.setId(R.id.lan_trans_indicator);
        this.f143946g.setScaleType(ImageView.ScaleType.FIT_CENTER);
        this.f143946g.setOval(false);
        this.f143946g.setImageResource(R.drawable.ic_icon_file_lan_trans);
        ConstraintLayout.LayoutParams a11 = C58323b.m226143a(16.0f, 16.0f, 38, 45, 0, 0);
        a11.f2825q = 0;
        a11.f2816h = 0;
        addView(this.f143946g, a11);
        m226616f();
    }

    /* renamed from: a */
    public void mo197892a(C58449a aVar, C58450b bVar) {
        setCallback(bVar);
        setInfo(aVar);
    }

    public FileView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FileView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m226614a(context);
    }

    /* renamed from: com.ss.android.lark.widget.fileview.FileView$a */
    public static class C58449a {

        /* renamed from: a */
        public final boolean f143957a;

        /* renamed from: b */
        public final boolean f143958b;

        /* renamed from: c */
        public final boolean f143959c;

        /* renamed from: d */
        public final boolean f143960d;

        /* renamed from: e */
        public final boolean f143961e;

        /* renamed from: f */
        public final String f143962f;

        /* renamed from: g */
        public final FileState f143963g;

        /* renamed from: h */
        public final String f143964h;

        /* renamed from: i */
        public final long f143965i;

        /* renamed from: j */
        public final int f143966j;

        /* renamed from: k */
        public final boolean f143967k;

        /* renamed from: l */
        public final boolean f143968l;

        /* renamed from: m */
        public final boolean f143969m;

        public C58449a(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, String str, FileState fileState, String str2, long j, int i) {
            this.f143957a = z;
            this.f143967k = z2;
            this.f143968l = z3;
            this.f143958b = z4;
            this.f143959c = z5;
            this.f143960d = z6;
            this.f143961e = z7;
            this.f143962f = str;
            this.f143963g = fileState;
            this.f143964h = str2;
            this.f143965i = j;
            this.f143966j = i;
        }

        public C58449a(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, String str, FileState fileState, String str2, long j, int i, boolean z8) {
            this.f143957a = z;
            this.f143967k = z2;
            this.f143968l = z3;
            this.f143958b = z4;
            this.f143959c = z5;
            this.f143960d = z6;
            this.f143961e = z7;
            this.f143969m = z8;
            this.f143962f = str;
            this.f143963g = fileState;
            this.f143964h = str2;
            this.f143965i = j;
            this.f143966j = i;
        }
    }
}
