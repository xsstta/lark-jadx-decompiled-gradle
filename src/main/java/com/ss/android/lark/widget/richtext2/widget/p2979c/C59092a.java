package com.ss.android.lark.widget.richtext2.widget.p2979c;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import com.ss.android.lark.widget.richtext.RichTextElement;
import com.ss.android.lark.widget.richtext.media.RichTextVideoView;
import com.ss.android.lark.widget.richtext2.entity.MediaParseResult;
import com.ss.android.lark.widget.richtext2.widget.RichTextView2;

/* renamed from: com.ss.android.lark.widget.richtext2.widget.c.a */
public class C59092a {
    /* renamed from: a */
    private static LinearLayout.LayoutParams m229523a(int[] iArr) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 3;
        layoutParams.width = iArr[0];
        layoutParams.height = iArr[1];
        return layoutParams;
    }

    /* renamed from: a */
    public static RichTextVideoView m229524a(Context context, MediaParseResult mediaParseResult) {
        RichTextVideoView richTextVideoView = new RichTextVideoView(context);
        RichTextElement.MediaProperty property = mediaParseResult.getProperty();
        richTextVideoView.setLayoutParams(m229523a(richTextVideoView.mo200572a(property.getOriginImage())));
        richTextVideoView.setInfo(new RichTextVideoView.C59036a(property.getOriginImage(), property.getOriginPath(), property.getCompressPath(), property.getUrl(), (long) property.getDuration()));
        return richTextVideoView;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ void m229527b(RichTextView2.AbstractC59088c cVar, RichTextElement.MediaProperty mediaProperty, View view) {
        if (cVar != null) {
            cVar.mo200747a(view, mediaProperty);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ boolean m229526a(RichTextView2.AbstractC59088c cVar, RichTextElement.MediaProperty mediaProperty, View view) {
        if (cVar != null) {
            return cVar.mo200748b(view, mediaProperty);
        }
        return false;
    }

    /* renamed from: a */
    public static void m229525a(View view, RichTextView2.AbstractC59088c cVar, MediaParseResult mediaParseResult) {
        RichTextElement.MediaProperty property = mediaParseResult.getProperty();
        view.setOnClickListener(new View.OnClickListener(property) {
            /* class com.ss.android.lark.widget.richtext2.widget.p2979c.$$Lambda$a$V8S5g0kXgrL2WvlP8rmVgxMQreQ */
            public final /* synthetic */ RichTextElement.MediaProperty f$1;

            {
                this.f$1 = r2;
            }

            public final void onClick(View view) {
                C59092a.m229527b(RichTextView2.AbstractC59088c.this, this.f$1, view);
            }
        });
        view.setOnLongClickListener(new View.OnLongClickListener(property) {
            /* class com.ss.android.lark.widget.richtext2.widget.p2979c.$$Lambda$a$_tN4fcfOiKpvSlzllovM7sWWJ88 */
            public final /* synthetic */ RichTextElement.MediaProperty f$1;

            {
                this.f$1 = r2;
            }

            public final boolean onLongClick(View view) {
                return C59092a.m229526a(RichTextView2.AbstractC59088c.this, this.f$1, view);
            }
        });
    }
}
