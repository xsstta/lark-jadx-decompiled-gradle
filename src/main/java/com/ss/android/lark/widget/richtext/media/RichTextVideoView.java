package com.ss.android.lark.widget.richtext.media;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.larksuite.component.ui.imageview.LKUIRoundedImageView;
import com.larksuite.framework.utils.C26279i;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.image.ImageLoader;
import com.ss.android.lark.utils.ImageUtils;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.richtext.C59032f;
import com.ss.android.lark.widget.richtext.Image;

public class RichTextVideoView extends FrameLayout {

    /* renamed from: a */
    private LKUIRoundedImageView f146312a;

    /* renamed from: b */
    private ImageView f146313b;

    /* renamed from: c */
    private TextView f146314c;

    /* renamed from: d */
    private View f146315d;

    /* renamed from: e */
    private View f146316e;

    /* renamed from: f */
    private C59036a f146317f;

    private int getMaxImageHeight() {
        return getMaxImageWidth();
    }

    private int getMinImageHeight() {
        return getMinImageWidth();
    }

    private int getMinImageWidth() {
        return UIHelper.dp2px(120.0f);
    }

    /* renamed from: a */
    private void m229217a() {
        LayoutInflater.from(getContext()).inflate(R.layout.layout_rich_text_media_view, (ViewGroup) this, true);
        m229221b();
    }

    /* renamed from: b */
    private void m229221b() {
        View findViewById = findViewById(R.id.media_content);
        this.f146315d = findViewById;
        this.f146312a = (LKUIRoundedImageView) findViewById.findViewById(R.id.media_cover);
        this.f146313b = (ImageView) this.f146315d.findViewById(R.id.media_media_play);
        this.f146314c = (TextView) this.f146315d.findViewById(R.id.media_duration);
        this.f146316e = this.f146315d.findViewById(R.id.media_cover_foreground);
    }

    private int getMaxImageWidth() {
        if (DesktopUtil.m144301a(getContext())) {
            return UIHelper.dp2px(360.0f);
        }
        return (int) (((double) UIHelper.getWindowWidth(getContext())) * 0.6d);
    }

    public RichTextVideoView(Context context) {
        super(context);
        m229217a();
    }

    /* renamed from: a */
    private void m229218a(long j) {
        this.f146314c.setText(C26279i.m95149a((int) j));
    }

    public void setInfo(C59036a aVar) {
        int i;
        this.f146317f = aVar;
        m229219a(aVar);
        m229218a(aVar.f146322e);
        boolean z = !TextUtils.isEmpty(aVar.f146321d);
        ImageView imageView = this.f146313b;
        int i2 = 0;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        imageView.setVisibility(i);
        View view = this.f146316e;
        if (z) {
            i2 = 8;
        }
        view.setVisibility(i2);
    }

    /* renamed from: a */
    public int[] mo200572a(Image image) {
        if (image != null) {
            return ImageUtils.m224135a(image.getWidth(), image.getHeight(), getMaxImageWidth(), getMaxImageHeight(), getMinImageWidth(), getMinImageHeight());
        }
        return new int[]{getMaxImageWidth(), getMaxImageHeight()};
    }

    /* renamed from: a */
    private void m229219a(C59036a aVar) {
        String str;
        Image image = this.f146317f.f146318a;
        int[] a = mo200572a(image);
        GradientDrawable b = m229220b(getContext(), a[0], a[1], (int) this.f146312a.getCornerRadius());
        GradientDrawable a2 = m229216a(getContext(), a[0], a[1], (int) this.f146312a.getCornerRadius());
        String str2 = "";
        if (image == null) {
            str = str2;
        } else {
            str = image.getKey();
        }
        if (!TextUtils.isEmpty(str)) {
            C59032f.m229191a().mo200570a(str, a[0], a[1], this.f146312a, b, a2);
            return;
        }
        if (!TextUtils.isEmpty(aVar.f146319b)) {
            str2 = aVar.f146319b;
        } else if (!TextUtils.isEmpty(aVar.f146321d)) {
            str2 = aVar.f146321d;
        }
        if (!TextUtils.isEmpty(str2)) {
            ImageLoader.with(getContext()).load(aVar.f146319b).placeholder(b).error(a2).into(this.f146312a);
        } else {
            this.f146312a.setImageDrawable(b);
        }
    }

    public RichTextVideoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m229217a();
    }

    public RichTextVideoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m229217a();
    }

    /* renamed from: a */
    public static GradientDrawable m229216a(Context context, int i, int i2, int i3) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius((float) i3);
        gradientDrawable.setColor(UIUtils.getColor(context, R.color.lkui_N200));
        gradientDrawable.setSize(i, i2);
        return gradientDrawable;
    }

    /* renamed from: b */
    private static GradientDrawable m229220b(Context context, int i, int i2, int i3) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius((float) i3);
        gradientDrawable.setColor(UIUtils.getColor(context, R.color.lkui_N100));
        gradientDrawable.setSize(i, i2);
        return gradientDrawable;
    }

    /* renamed from: com.ss.android.lark.widget.richtext.media.RichTextVideoView$a */
    public static class C59036a {

        /* renamed from: a */
        public Image f146318a;

        /* renamed from: b */
        public String f146319b;

        /* renamed from: c */
        public String f146320c;

        /* renamed from: d */
        public String f146321d;

        /* renamed from: e */
        public long f146322e;

        public C59036a(Image image, String str, String str2, String str3, long j) {
            this.f146318a = image;
            this.f146319b = str;
            this.f146320c = str2;
            this.f146321d = str3;
            this.f146322e = j;
        }
    }
}
