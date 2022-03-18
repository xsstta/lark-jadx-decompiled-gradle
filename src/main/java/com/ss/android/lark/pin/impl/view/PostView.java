package com.ss.android.lark.pin.impl.view;

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
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.widget.EllipsizedEmojiconTextView;
import com.ss.android.lark.widget.light.listener.IMentionSpanClickListener;
import com.ss.android.lark.widget.linked_emojicon.widget.LinkEmojiTextView;
import com.ss.android.lark.widget.richtext.C59035h;
import com.ss.android.lark.widget.richtext.RichText;
import com.ss.android.lark.widget.richtext.RichTextView;

public class PostView extends FrameLayout {

    /* renamed from: a */
    public View.OnLongClickListener f128499a;

    /* renamed from: b */
    public View.OnClickListener f128500b;

    /* renamed from: c */
    private CharSequence f128501c;

    /* renamed from: d */
    private RichText f128502d;

    /* renamed from: e */
    private int f128503e;

    /* renamed from: f */
    private int f128504f;

    /* renamed from: g */
    private int f128505g;

    /* renamed from: h */
    private int f128506h;

    /* renamed from: i */
    private int f128507i;

    /* renamed from: j */
    private int f128508j;

    /* renamed from: k */
    private EllipsizedEmojiconTextView f128509k;

    /* renamed from: l */
    private RichTextView.AbstractC59024b f128510l;

    /* renamed from: m */
    private RichTextView f128511m;

    public RichTextView getRichTextView() {
        return this.f128511m;
    }

    public EllipsizedEmojiconTextView getTitleView() {
        return this.f128509k;
    }

    public View.OnClickListener getOnClickListener() {
        return new View.OnClickListener() {
            /* class com.ss.android.lark.pin.impl.view.PostView.View$OnClickListenerC516473 */

            public void onClick(View view) {
                if (PostView.this.f128500b != null) {
                    PostView.this.f128500b.onClick(view);
                }
            }
        };
    }

    public PostView(Context context) {
        this(context, null);
    }

    public void setAbbreviationClickListener(LinkEmojiTextView.AbstractC58520e eVar) {
        this.f128511m.setAbbreviationListener(eVar);
    }

    public void setAtStringClickListener(LinkEmojiTextView.AbstractC58521f fVar) {
        this.f128511m.setAtStringClickListner(fVar);
    }

    public void setContentEmojiSize(int i) {
        this.f128511m.setEmojIconSize(i);
    }

    public void setContentMaxLine(int i) {
        this.f128508j = i;
        this.f128511m.setMaxLines(i);
    }

    public void setContentSize(float f) {
        this.f128511m.setTextSize(f);
    }

    public void setMentionStringClickListener(IMentionSpanClickListener fVar) {
        this.f128511m.setMentionListener(fVar);
    }

    public void setNeedShowAtDot(boolean z) {
        this.f128511m.setNeedShowAtDot(z);
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f128500b = onClickListener;
        super.setOnClickListener(onClickListener);
    }

    public void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f128499a = onLongClickListener;
        super.setOnLongClickListener(onLongClickListener);
    }

    public void setPhoneStringClickListener(LinkEmojiTextView.AbstractC58524i iVar) {
        this.f128511m.setPhoneStringClickListener(iVar);
    }

    public void setPostImageListener(RichTextView.AbstractC59024b bVar) {
        if (bVar != null) {
            this.f128510l = bVar;
        }
    }

    public void setTextColor(int i) {
        this.f128509k.setTextColor(i);
    }

    public void setTitleEmojiSize(int i) {
        this.f128509k.setEmojiconSize(i);
    }

    public void setTitleSize(float f) {
        this.f128509k.setTextSize(0, f);
    }

    public void setUrlStringClickListener(LinkEmojiTextView.AbstractC58525j jVar) {
        this.f128511m.setUrlStringClickListner(jVar);
    }

    /* renamed from: a */
    private void m200360a(Context context) {
        LayoutInflater.from(context).inflate(R.layout.chatpin_post_saveitem_view, (ViewGroup) this, true);
        this.f128509k = (EllipsizedEmojiconTextView) findViewById(R.id.title);
        this.f128511m = (RichTextView) findViewById(R.id.post_content);
        int i = this.f128503e;
        if (i != 0) {
            this.f128509k.setTextSize(0, (float) i);
        }
        int i2 = this.f128504f;
        if (i2 != 0) {
            this.f128509k.setTextColor(i2);
        }
        int i3 = this.f128505g;
        if (i3 != 0) {
            this.f128509k.setMaxLines(i3);
        }
        int i4 = this.f128506h;
        if (i4 != 0) {
            this.f128511m.setTextSize((float) i4);
        }
        int i5 = this.f128507i;
        if (i5 != 0) {
            this.f128511m.setTextColor(i5);
        }
        int i6 = this.f128508j;
        if (i6 != 0) {
            this.f128511m.setMaxLines(i6);
        }
    }

    /* renamed from: a */
    private void m200361a(Context context, AttributeSet attributeSet) {
        m200363b(context, attributeSet);
        m200360a(context);
    }

    public PostView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: b */
    private void m200363b(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.postContentColor, R.attr.postContentMaxLine, R.attr.postContentSize, R.attr.postTitleColor, R.attr.postTitleMaxLine, R.attr.postTitleSize});
            this.f128503e = obtainStyledAttributes.getDimensionPixelSize(5, this.f128503e);
            this.f128504f = obtainStyledAttributes.getColor(3, this.f128504f);
            this.f128505g = obtainStyledAttributes.getInt(4, this.f128505g);
            this.f128506h = obtainStyledAttributes.getDimensionPixelSize(2, this.f128506h);
            this.f128507i = obtainStyledAttributes.getColor(0, this.f128507i);
            this.f128508j = obtainStyledAttributes.getInt(1, this.f128508j);
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: a */
    private void m200362a(RichText richText, final boolean z) {
        this.f128511m.setOnEllipsizeListener(new RichTextView.AbstractC59023a() {
            /* class com.ss.android.lark.pin.impl.view.PostView.C516451 */

            @Override // com.ss.android.lark.widget.richtext.RichTextView.AbstractC59023a
            /* renamed from: a */
            public void mo136816a(boolean z) {
            }
        });
        this.f128511m.setRichTextListener(new RichTextView.AbstractC59025c() {
            /* class com.ss.android.lark.pin.impl.view.PostView.C516462 */

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
                if (PostView.this.f128499a != null) {
                    PostView.this.f128499a.onLongClick(textView);
                }
            }
        });
        this.f128511m.setRichTextImageListener(this.f128510l);
        this.f128511m.setImageMode(0);
        if (DesktopUtil.m144301a(getContext())) {
            this.f128511m.setImageMode(4);
        }
        this.f128511m.setInfo(richText);
        if (C59035h.m229210a(richText)) {
            UIUtils.hide(this.f128511m);
        } else {
            UIUtils.show(this.f128511m);
        }
        if (DesktopUtil.m144301a(getContext())) {
            this.f128511m.setTextSize(UIUtils.sp2px(getContext(), 14.0f));
        }
    }

    public PostView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f128505g = 2;
        this.f128508j = 3;
        m200361a(context, attributeSet);
    }

    /* renamed from: a */
    public void mo177667a(CharSequence charSequence, RichText richText, boolean z) {
        this.f128501c = charSequence;
        this.f128502d = richText;
        if (z) {
            this.f128509k.setMaxLines(1000);
            this.f128511m.setMaxLines(1000);
            this.f128511m.setShowImage(true);
            this.f128511m.setShowVideo(true);
        } else {
            this.f128509k.setMaxLines(this.f128505g);
            this.f128511m.setMaxLines(this.f128508j);
            this.f128511m.setShowImage(false);
            this.f128511m.setShowVideo(false);
        }
        if (TextUtils.isEmpty(charSequence)) {
            this.f128509k.setVisibility(8);
        } else {
            this.f128509k.setVisibility(0);
            this.f128509k.setTranslateEmojiCode(false);
            this.f128509k.setText(charSequence);
        }
        m200362a(richText, z);
    }
}
