package com.ss.android.lark.favorite.common.post;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.chatbase.p1690c.C34439b;
import com.ss.android.lark.widget.EllipsizedEmojiconTextView;
import com.ss.android.lark.widget.light.listener.IMentionSpanClickListener;
import com.ss.android.lark.widget.linked_emojicon.widget.LinkEmojiTextView;
import com.ss.android.lark.widget.richtext.C59035h;
import com.ss.android.lark.widget.richtext.RichText;
import com.ss.android.lark.widget.richtext.RichTextView;

public class PostView extends FrameLayout {

    /* renamed from: a */
    String f95472a;

    /* renamed from: b */
    RichText f95473b;

    /* renamed from: c */
    public View.OnLongClickListener f95474c;

    /* renamed from: d */
    public View.OnClickListener f95475d;

    /* renamed from: e */
    private int f95476e;

    /* renamed from: f */
    private int f95477f;

    /* renamed from: g */
    private int f95478g;

    /* renamed from: h */
    private int f95479h;

    /* renamed from: i */
    private int f95480i;

    /* renamed from: j */
    private int f95481j;

    /* renamed from: k */
    private EllipsizedEmojiconTextView f95482k;

    /* renamed from: l */
    private RichTextView.AbstractC59024b f95483l;

    /* renamed from: m */
    private RichTextView.AbstractC59026d f95484m;

    /* renamed from: n */
    private RichTextView f95485n;

    public RichTextView getRichTextView() {
        return this.f95485n;
    }

    public EllipsizedEmojiconTextView getTitleView() {
        return this.f95482k;
    }

    public View.OnClickListener getOnClickListener() {
        return new View.OnClickListener() {
            /* class com.ss.android.lark.favorite.common.post.PostView.View$OnClickListenerC371533 */

            public void onClick(View view) {
                if (PostView.this.f95475d != null) {
                    PostView.this.f95475d.onClick(view);
                }
            }
        };
    }

    /* renamed from: a */
    public void mo136799a() {
        this.f95482k.setVisibility(0);
    }

    public PostView(Context context) {
        this(context, null);
    }

    public void setAbbreviationClickListener(LinkEmojiTextView.AbstractC58520e eVar) {
        this.f95485n.setAbbreviationListener(eVar);
    }

    public void setAtStringClickListener(LinkEmojiTextView.AbstractC58521f fVar) {
        this.f95485n.setAtStringClickListner(fVar);
    }

    public void setContentMaxLine(int i) {
        this.f95481j = i;
        this.f95485n.setMaxLines(i);
    }

    public void setMentionStringClickListener(IMentionSpanClickListener fVar) {
        this.f95485n.setMentionListener(fVar);
    }

    public void setNeedShowAtDot(boolean z) {
        this.f95485n.setNeedShowAtDot(z);
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f95475d = onClickListener;
        super.setOnClickListener(onClickListener);
    }

    public void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f95474c = onLongClickListener;
        super.setOnLongClickListener(onLongClickListener);
    }

    public void setPhoneStringClickListener(LinkEmojiTextView.AbstractC58524i iVar) {
        this.f95485n.setPhoneStringClickListener(iVar);
    }

    public void setPostImageListener(RichTextView.AbstractC59024b bVar) {
        if (bVar != null) {
            this.f95483l = bVar;
        }
    }

    public void setPostVideoListener(RichTextView.AbstractC59026d dVar) {
        if (dVar != null) {
            this.f95484m = dVar;
        }
    }

    public void setTextColor(int i) {
        this.f95482k.setTextColor(i);
    }

    public void setUrlStringClickListener(LinkEmojiTextView.AbstractC58525j jVar) {
        this.f95485n.setUrlStringClickListner(jVar);
    }

    /* renamed from: a */
    private void m146409a(Context context) {
        LayoutInflater.from(context).inflate(R.layout.post_saveitem_view, (ViewGroup) this, true);
        this.f95482k = (EllipsizedEmojiconTextView) findViewById(R.id.title);
        this.f95485n = (RichTextView) findViewById(R.id.post_content);
        int i = this.f95476e;
        if (i != 0) {
            this.f95482k.setTextSize(0, (float) i);
        }
        int i2 = this.f95477f;
        if (i2 != 0) {
            this.f95482k.setTextColor(i2);
        }
        int i3 = this.f95478g;
        if (i3 != 0) {
            this.f95482k.setMaxLines(i3);
        }
        int i4 = this.f95479h;
        if (i4 != 0) {
            this.f95485n.setTextSize((float) i4);
        }
        int i5 = this.f95480i;
        if (i5 != 0) {
            this.f95485n.setTextColor(i5);
        }
        int i6 = this.f95481j;
        if (i6 != 0) {
            this.f95485n.setMaxLines(i6);
        }
    }

    /* renamed from: a */
    private void m146410a(Context context, AttributeSet attributeSet) {
        m146412b(context, attributeSet);
        m146409a(context);
    }

    public PostView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: b */
    private void m146412b(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.postContentColor, R.attr.postContentMaxLine, R.attr.postContentSize, R.attr.postTitleColor, R.attr.postTitleMaxLine, R.attr.postTitleSize});
            this.f95476e = obtainStyledAttributes.getDimensionPixelSize(5, this.f95476e);
            this.f95477f = obtainStyledAttributes.getColor(3, this.f95477f);
            this.f95478g = obtainStyledAttributes.getInt(4, this.f95478g);
            this.f95479h = obtainStyledAttributes.getDimensionPixelSize(2, this.f95479h);
            this.f95480i = obtainStyledAttributes.getColor(0, this.f95480i);
            this.f95481j = obtainStyledAttributes.getInt(1, this.f95481j);
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: a */
    private void m146411a(RichText richText, final boolean z) {
        this.f95485n.setOnEllipsizeListener(new RichTextView.AbstractC59023a() {
            /* class com.ss.android.lark.favorite.common.post.PostView.C371511 */

            @Override // com.ss.android.lark.widget.richtext.RichTextView.AbstractC59023a
            /* renamed from: a */
            public void mo136816a(boolean z) {
            }
        });
        this.f95485n.setRichTextListener(new RichTextView.AbstractC59025c() {
            /* class com.ss.android.lark.favorite.common.post.PostView.C371522 */

            @Override // com.ss.android.lark.widget.richtext.RichTextView.AbstractC59025c
            /* renamed from: a */
            public void mo124117a(TextView textView) {
                View.OnClickListener onClickListener = PostView.this.getOnClickListener();
                if (onClickListener != null && !z) {
                    onClickListener.onClick(textView);
                }
            }

            @Override // com.ss.android.lark.widget.richtext.RichTextView.AbstractC59025c
            /* renamed from: a */
            public void mo124118a(String str, TextView textView) {
                if (PostView.this.f95474c != null) {
                    PostView.this.f95474c.onLongClick(textView);
                }
            }
        });
        this.f95485n.setRichTextImageListener(this.f95483l);
        this.f95485n.setRichTextVideoListener(this.f95484m);
        this.f95485n.setImageMode(0);
        C34439b.m133587a(this.f95485n);
        this.f95485n.setInfo(richText);
        if (C59035h.m229210a(richText)) {
            UIUtils.hide(this.f95485n);
        } else {
            UIUtils.show(this.f95485n);
        }
    }

    public PostView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f95478g = 2;
        this.f95481j = 3;
        m146410a(context, attributeSet);
    }

    /* renamed from: a */
    public void mo136800a(String str, RichText richText, boolean z) {
        this.f95472a = str;
        this.f95473b = richText;
        if (z) {
            this.f95482k.setMaxLines(1000);
            this.f95485n.setMaxLines(1000);
            this.f95485n.setShowImage(true);
            this.f95485n.setShowVideo(true);
        } else {
            this.f95482k.setMaxLines(this.f95478g);
            this.f95485n.setMaxLines(this.f95481j);
            this.f95485n.setShowImage(false);
            this.f95485n.setShowVideo(false);
        }
        if (TextUtils.isEmpty(str)) {
            this.f95482k.setVisibility(8);
        } else {
            this.f95482k.setVisibility(0);
            this.f95482k.setTranslateEmojiCode(false);
            this.f95482k.setText(str);
        }
        m146411a(richText, z);
    }
}
