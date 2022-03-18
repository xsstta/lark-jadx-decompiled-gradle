package com.ss.android.lark.widget.richtext2.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.component.ui.layout.LKUIRoundableLayout;
import com.larksuite.framework.utils.C26325y;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.widget.richtext.Image;
import com.ss.android.lark.widget.richtext.RichTextElement;
import com.ss.android.lark.widget.richtext.media.RichTextVideoView;
import com.ss.android.lark.widget.richtext.preprocess.p2966a.C59042d;
import com.ss.android.lark.widget.richtext2.entity.AbstractParseResult;
import com.ss.android.lark.widget.richtext2.entity.ImageParseResult;
import com.ss.android.lark.widget.richtext2.entity.MediaParseResult;
import com.ss.android.lark.widget.richtext2.entity.RichTextParseResult;
import com.ss.android.lark.widget.richtext2.entity.SimpleCodeBlockParseResult;
import com.ss.android.lark.widget.richtext2.entity.TextParseResult;
import com.ss.android.lark.widget.richtext2.widget.codeblock.CodeBlockSimpleView;
import com.ss.android.lark.widget.richtext2.widget.p2977a.C59090a;
import com.ss.android.lark.widget.richtext2.widget.p2978b.C59091a;
import com.ss.android.lark.widget.richtext2.widget.p2979c.C59092a;
import com.ss.android.lark.widget.richtext2.widget.text.SimpleRichTextView;
import java.util.List;

public class RichTextView2 extends LinearLayout {

    /* renamed from: a */
    private final Context f146480a;

    /* renamed from: b */
    private float f146481b;

    /* renamed from: c */
    private RichTextParseResult f146482c;

    /* renamed from: d */
    private String f146483d;

    /* renamed from: e */
    private boolean f146484e;

    /* renamed from: f */
    private boolean f146485f;

    /* renamed from: g */
    private boolean f146486g;

    /* renamed from: h */
    private boolean f146487h;

    /* renamed from: i */
    private int f146488i;

    /* renamed from: j */
    private int f146489j;

    /* renamed from: k */
    private float f146490k;

    /* renamed from: l */
    private float f146491l;

    /* renamed from: m */
    private boolean f146492m;

    /* renamed from: n */
    private boolean f146493n;

    /* renamed from: o */
    private AbstractC59086a f146494o;

    /* renamed from: p */
    private AbstractC59088c f146495p;

    /* renamed from: q */
    private SimpleRichTextView.AbstractC59106c f146496q;

    /* renamed from: r */
    private SimpleRichTextView.AbstractC59104a f146497r;

    /* renamed from: s */
    private SimpleRichTextView.AbstractC59105b f146498s;

    /* renamed from: t */
    private AbstractC59087b f146499t;

    /* renamed from: com.ss.android.lark.widget.richtext2.widget.RichTextView2$a */
    public interface AbstractC59086a {
        /* renamed from: a */
        void mo200743a(Image image, View view);

        /* renamed from: a */
        boolean mo200744a(View view);
    }

    /* renamed from: com.ss.android.lark.widget.richtext2.widget.RichTextView2$b */
    public interface AbstractC59087b {
        /* renamed from: a */
        void mo200745a(TextView textView);

        /* renamed from: b */
        void mo200746b(TextView textView);
    }

    /* renamed from: com.ss.android.lark.widget.richtext2.widget.RichTextView2$c */
    public interface AbstractC59088c {
        /* renamed from: a */
        void mo200747a(View view, RichTextElement.MediaProperty mediaProperty);

        /* renamed from: b */
        boolean mo200748b(View view, RichTextElement.MediaProperty mediaProperty);
    }

    /* renamed from: a */
    public void mo200729a(RichTextParseResult richTextParseResult, String str) {
        RichTextParseResult richTextParseResult2 = this.f146482c;
        if (!(richTextParseResult2 != null && richTextParseResult2.equals(richTextParseResult) && C26325y.m95335a(this.f146483d, str))) {
            this.f146493n = true;
            boolean a = m229490a(this.f146482c, richTextParseResult);
            this.f146487h = a;
            if (!a) {
                removeAllViews();
            }
            this.f146483d = str;
            this.f146482c = richTextParseResult;
            m229482a();
        }
    }

    /* renamed from: a */
    private boolean m229490a(RichTextParseResult richTextParseResult, RichTextParseResult richTextParseResult2) {
        if (richTextParseResult == null || richTextParseResult2 == null) {
            return false;
        }
        List<AbstractParseResult> resultList = richTextParseResult.getResultList();
        List<AbstractParseResult> resultList2 = richTextParseResult2.getResultList();
        if (resultList.size() != resultList2.size()) {
            return false;
        }
        for (int i = 0; i < resultList.size(); i++) {
            if (!resultList.get(i).canPartialUpdate(resultList2.get(i))) {
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ boolean m229491a(SimpleRichTextView simpleRichTextView, View view) {
        AbstractC59087b bVar = this.f146499t;
        if (bVar == null) {
            return true;
        }
        bVar.mo200745a(simpleRichTextView);
        return true;
    }

    /* renamed from: a */
    private void m229482a() {
        RichTextParseResult richTextParseResult = this.f146482c;
        if (richTextParseResult != null) {
            List<AbstractParseResult> resultList = richTextParseResult.getResultList();
            for (int i = 0; i < resultList.size(); i++) {
                AbstractParseResult abstractParseResult = resultList.get(i);
                if (abstractParseResult instanceof TextParseResult) {
                    m229489a((TextParseResult) abstractParseResult, i);
                } else if (abstractParseResult instanceof ImageParseResult) {
                    m229485a((ImageParseResult) abstractParseResult);
                } else if (abstractParseResult instanceof MediaParseResult) {
                    m229486a((MediaParseResult) abstractParseResult);
                } else if (abstractParseResult instanceof SimpleCodeBlockParseResult) {
                    m229487a((SimpleCodeBlockParseResult) abstractParseResult);
                }
            }
        }
    }

    /* access modifiers changed from: public */
    /* renamed from: b */
    private void m229495b() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if ((childAt instanceof SimpleRichTextView) && childAt.getWidth() != getWidth()) {
                ((SimpleRichTextView) childAt).setWidth(getWidth());
            }
        }
    }

    public void setAtClickListener(SimpleRichTextView.AbstractC59104a aVar) {
        this.f146497r = aVar;
    }

    public void setImageListener(AbstractC59086a aVar) {
        this.f146494o = aVar;
    }

    public void setPhoneClickListener(SimpleRichTextView.AbstractC59105b bVar) {
        this.f146498s = bVar;
    }

    public void setRichTextListener(AbstractC59087b bVar) {
        this.f146499t = bVar;
    }

    public void setShowCodeBlock(boolean z) {
        this.f146486g = z;
    }

    public void setShowImage(boolean z) {
        this.f146484e = z;
    }

    public void setShowVideo(boolean z) {
        this.f146485f = z;
    }

    public void setTextColor(int i) {
        this.f146488i = i;
    }

    public void setTextSize(int i) {
        this.f146481b = (float) i;
    }

    public void setUrlClickListener(SimpleRichTextView.AbstractC59106c cVar) {
        this.f146496q = cVar;
    }

    public void setVideoListener(AbstractC59088c cVar) {
        this.f146495p = cVar;
    }

    public RichTextView2(Context context) {
        this(context, null);
    }

    public void setInfo(RichTextParseResult richTextParseResult) {
        mo200729a(richTextParseResult, "");
    }

    /* renamed from: a */
    private void m229484a(AttributeSet attributeSet) {
        m229483a(this.f146480a, attributeSet);
        setOrientation(1);
    }

    /* renamed from: b */
    private View m229493b(MediaParseResult mediaParseResult) {
        RichTextVideoView a = C59092a.m229524a(this.f146480a, mediaParseResult);
        C59092a.m229525a(a, this.f146495p, mediaParseResult);
        return a;
    }

    /* renamed from: a */
    private TextView m229481a(String str) {
        TextView textView = new TextView(this.f146480a);
        textView.setTextSize(0, this.f146481b);
        textView.setTextColor(this.f146488i);
        textView.setText(str);
        return textView;
    }

    /* renamed from: b */
    private View m229492b(ImageParseResult imageParseResult) {
        LKUIRoundableLayout a = C59091a.m229517a(getContext(), imageParseResult, this.f146492m, this.f146494o);
        C59091a.m229519a(a, this.f146489j, this.f146490k, (int) this.f146491l);
        return a;
    }

    /* renamed from: a */
    private void m229485a(ImageParseResult imageParseResult) {
        View view;
        if (!this.f146487h) {
            String string = getResources().getString(R.string.Lark_Legacy_MessagePoPhoto);
            if (this.f146484e) {
                view = m229492b(imageParseResult);
            } else {
                view = m229481a(string);
            }
            C59090a.m229512a(this.f146480a, view, imageParseResult, this);
        }
    }

    /* renamed from: b */
    private CodeBlockSimpleView m229494b(SimpleCodeBlockParseResult simpleCodeBlockParseResult) {
        CodeBlockSimpleView a = CodeBlockSimpleView.m229535a(this.f146480a, null, false);
        a.mo200763a(simpleCodeBlockParseResult);
        return a;
    }

    /* renamed from: a */
    private void m229486a(MediaParseResult mediaParseResult) {
        View view;
        if (!this.f146487h) {
            String string = getResources().getString(R.string.Lark_Legacy_MessagePoVideo);
            if (this.f146485f) {
                view = m229493b(mediaParseResult);
            } else {
                view = m229481a(string);
            }
            C59090a.m229512a(this.f146480a, view, mediaParseResult, this);
        }
    }

    /* renamed from: a */
    private void m229487a(SimpleCodeBlockParseResult simpleCodeBlockParseResult) {
        View view;
        if (!this.f146487h) {
            String string = getResources().getString(R.string.Lark_Message_Codeblock);
            if (this.f146486g) {
                view = m229494b(simpleCodeBlockParseResult);
            } else {
                view = m229481a(string);
            }
            C59090a.m229512a(this.f146480a, view, simpleCodeBlockParseResult, this);
        }
    }

    /* renamed from: a */
    private void m229488a(TextParseResult textParseResult) {
        SimpleRichTextView simpleRichTextView = new SimpleRichTextView(this.f146480a);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        simpleRichTextView.setLayoutParams(layoutParams);
        simpleRichTextView.setTextSize(0, this.f146481b);
        simpleRichTextView.setTextColor(this.f146488i);
        simpleRichTextView.setUrlClickListener(this.f146496q);
        simpleRichTextView.setAtClickListener(this.f146497r);
        simpleRichTextView.setPhoneClickListener(this.f146498s);
        simpleRichTextView.setOnClickListener(new View.OnClickListener(simpleRichTextView) {
            /* class com.ss.android.lark.widget.richtext2.widget.$$Lambda$RichTextView2$h6msZ4uDI2w70E1IpwKJWTrtLmw */
            public final /* synthetic */ SimpleRichTextView f$1;

            {
                this.f$1 = r2;
            }

            public final void onClick(View view) {
                RichTextView2.lambda$h6msZ4uDI2w70E1IpwKJWTrtLmw(RichTextView2.this, this.f$1, view);
            }
        });
        simpleRichTextView.setOnLongClickListener(new View.OnLongClickListener(simpleRichTextView) {
            /* class com.ss.android.lark.widget.richtext2.widget.$$Lambda$RichTextView2$swEgsOwjLZxJo3zX3yy5FzrfpJ4 */
            public final /* synthetic */ SimpleRichTextView f$1;

            {
                this.f$1 = r2;
            }

            public final boolean onLongClick(View view) {
                return RichTextView2.lambda$swEgsOwjLZxJo3zX3yy5FzrfpJ4(RichTextView2.this, this.f$1, view);
            }
        });
        simpleRichTextView.setInfo(textParseResult);
        layoutParams.topMargin = C59089a.m229504a(getChildCount(), C59042d.m229246a(textParseResult.getSpanBuilder(), 0, 1), true);
        addView(simpleRichTextView);
    }

    public RichTextView2(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    private void m229483a(Context context, AttributeSet attributeSet) {
        if (attributeSet == null) {
            this.f146481b = (float) ((int) UIUtils.sp2px(context, 16.0f));
            this.f146488i = UIUtils.getColor(context, R.color.lkui_N900);
            this.f146489j = 16777215;
            this.f146492m = true;
            return;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.image_border_color, R.attr.image_border_radius, R.attr.image_border_widthDp, R.attr.rich_text_color, R.attr.rich_text_size, R.attr.show_thumb_image});
        this.f146481b = (float) obtainStyledAttributes.getDimensionPixelSize(4, (int) UIUtils.sp2px(context, 16.0f));
        this.f146488i = obtainStyledAttributes.getColor(3, UIUtils.getColor(context, R.color.lkui_N900));
        this.f146489j = obtainStyledAttributes.getColor(0, 16777215);
        this.f146490k = obtainStyledAttributes.getDimension(2, BitmapDescriptorFactory.HUE_RED);
        this.f146491l = obtainStyledAttributes.getDimension(1, BitmapDescriptorFactory.HUE_RED);
        this.f146492m = obtainStyledAttributes.getBoolean(5, true);
        obtainStyledAttributes.recycle();
    }

    /* access modifiers changed from: public */
    /* renamed from: b */
    private /* synthetic */ void m229496b(SimpleRichTextView simpleRichTextView, View view) {
        if (this.f146499t != null && simpleRichTextView.getSelectionStart() == -1 && simpleRichTextView.getSelectionEnd() == -1) {
            this.f146499t.mo200746b(simpleRichTextView);
        }
    }

    /* renamed from: a */
    private void m229489a(TextParseResult textParseResult, int i) {
        if (this.f146487h) {
            View childAt = getChildAt(i);
            if (childAt instanceof SimpleRichTextView) {
                ((SimpleRichTextView) childAt).setInfo(textParseResult);
                return;
            }
            return;
        }
        m229488a(textParseResult);
    }

    public RichTextView2(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f146483d = "";
        this.f146484e = true;
        this.f146486g = true;
        this.f146493n = true;
        this.f146480a = context;
        m229484a(attributeSet);
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.f146493n) {
            post(new Runnable() {
                /* class com.ss.android.lark.widget.richtext2.widget.$$Lambda$RichTextView2$RO2fTkNiRh1Xz5TiLuqnetS3heo */

                public final void run() {
                    RichTextView2.lambda$RO2fTkNiRh1Xz5TiLuqnetS3heo(RichTextView2.this);
                }
            });
            this.f146493n = false;
        }
    }
}
