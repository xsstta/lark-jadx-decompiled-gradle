package com.ss.android.lark.mm.module.reaction.panel;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.LruCache;
import android.view.View;
import com.larksuite.suite.R;
import com.ss.android.lark.mm.module.highlight.timeline.HighlightTimeLineItem;
import com.ss.android.lark.mm.module.highlight.timeline.HighlightTimeLineItemType;
import com.ss.android.lark.mm.module.reaction.model.EmojiReaction;
import com.ss.android.lark.mm.p2288b.C45851c;
import com.ss.android.lark.mm.p2288b.C45857i;
import com.ss.android.lark.mm.p2288b.C45859k;
import com.ss.android.lark.ui.p2892a.C57582a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class ReactionTimeLine extends View {

    /* renamed from: a */
    private Paint f117853a;

    /* renamed from: b */
    private long f117854b;

    /* renamed from: c */
    private List<C46821a> f117855c;

    /* renamed from: d */
    private LruCache<String, Bitmap> f117856d;

    /* renamed from: e */
    private Bitmap f117857e;

    /* renamed from: f */
    private boolean f117858f;

    /* renamed from: g */
    private boolean f117859g;

    /* renamed from: h */
    private boolean f117860h;

    /* renamed from: b */
    private void m185513b() {
        Paint paint = new Paint();
        this.f117853a = paint;
        paint.setAntiAlias(true);
    }

    private int getLineWidth() {
        return (getWidth() - getPaddingLeft()) - getPaddingRight();
    }

    /* renamed from: com.ss.android.lark.mm.module.reaction.panel.ReactionTimeLine$a */
    public static class C46821a {

        /* renamed from: a */
        public String f117861a;

        /* renamed from: b */
        public String f117862b;

        /* renamed from: c */
        public long f117863c;

        /* renamed from: d */
        public long f117864d;

        /* renamed from: e */
        public Bitmap f117865e;

        /* renamed from: f */
        public int f117866f;

        public int hashCode() {
            return Objects.hash(this.f117861a, this.f117862b, Long.valueOf(this.f117863c));
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C46821a aVar = (C46821a) obj;
            if (this.f117863c != aVar.f117863c || !Objects.equals(this.f117861a, aVar.f117861a) || !Objects.equals(this.f117862b, aVar.f117862b)) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: a */
    private void m185511a() {
        m185513b();
        Bitmap decodeResource = BitmapFactory.decodeResource(getResources(), R.drawable.mm_ic_reaction_comment);
        this.f117857e = decodeResource;
        this.f117857e = Bitmap.createScaledBitmap(decodeResource, C45851c.m181650c(R.dimen.dp_14), C45851c.m181650c(R.dimen.dp_14), true);
    }

    public void setPodcast(boolean z) {
        this.f117860h = z;
    }

    public void setTimeLineLength(long j) {
        this.f117854b = j;
    }

    public ReactionTimeLine(Context context) {
        this(context, null);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m185514b(List list) {
        this.f117855c = list;
        invalidate();
    }

    public void setShowComment(boolean z) {
        this.f117859g = z;
        invalidate();
    }

    public void setShowEmoji(boolean z) {
        this.f117858f = z;
        invalidate();
    }

    /* renamed from: a */
    public boolean mo164488a(int i) {
        if (i != HighlightTimeLineItemType.REACTION.getValue() || !this.f117858f) {
            return false;
        }
        return true;
    }

    public void setTimeLine(List<HighlightTimeLineItem> list) {
        if (!this.f117860h) {
            C45857i.m181676a(new Runnable(list) {
                /* class com.ss.android.lark.mm.module.reaction.panel.$$Lambda$ReactionTimeLine$zL8cPZFNZyuhAXQhVfeAmMq9SE */
                public final /* synthetic */ List f$1;

                {
                    this.f$1 = r2;
                }

                public final void run() {
                    ReactionTimeLine.this.m185512a((ReactionTimeLine) this.f$1);
                }
            });
        }
    }

    /* renamed from: b */
    public boolean mo164489b(int i) {
        if (i != HighlightTimeLineItemType.COMMENT.getValue() || !this.f117859g) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private Bitmap m185510a(String str) {
        synchronized (this.f117856d) {
            if (!TextUtils.isEmpty(str)) {
                Bitmap bitmap = this.f117856d.get(str);
                if (bitmap != null) {
                    return bitmap;
                }
                Bitmap a = C46825b.m185521a().mo164505a(str);
                if (a != null) {
                    this.f117856d.put(str, a);
                    return a;
                }
            }
            return null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m185512a(List list) {
        if (list != null) {
            LinkedList linkedList = new LinkedList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                HighlightTimeLineItem highlightTimeLineItem = (HighlightTimeLineItem) it.next();
                C46821a aVar = new C46821a();
                if (highlightTimeLineItem.type == HighlightTimeLineItemType.COMMENT.getValue()) {
                    aVar.f117863c = highlightTimeLineItem.start_time;
                    aVar.f117865e = this.f117857e;
                    aVar.f117866f = highlightTimeLineItem.type;
                    linkedList.add(aVar);
                }
            }
            C45859k.m181685a(new Runnable(linkedList) {
                /* class com.ss.android.lark.mm.module.reaction.panel.$$Lambda$ReactionTimeLine$bgst3xmDfTf3vwyFwW5tFl94E */
                public final /* synthetic */ List f$1;

                {
                    this.f$1 = r2;
                }

                public final void run() {
                    ReactionTimeLine.this.m185514b((ReactionTimeLine) this.f$1);
                }
            });
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        long j;
        long j2;
        int paddingLeft = getPaddingLeft();
        if (this.f117855c.size() > 0) {
            for (C46821a aVar : this.f117855c) {
                if (!this.f117860h && ((mo164488a(aVar.f117866f) || mo164489b(aVar.f117866f)) && aVar.f117865e != null)) {
                    aVar.f117864d = ((long) (((((float) aVar.f117863c) * 1.0f) / ((float) this.f117854b)) * ((float) getLineWidth()))) + ((long) getPaddingLeft());
                    long j3 = (long) paddingLeft;
                    if (aVar.f117864d < j3) {
                        j = j3;
                    } else {
                        j = aVar.f117864d;
                    }
                    aVar.f117864d = j;
                    if (aVar.f117864d > ((long) (getWidth() - paddingLeft))) {
                        j2 = (long) (getWidth() - paddingLeft);
                    } else {
                        j2 = aVar.f117864d;
                    }
                    aVar.f117864d = j2;
                    int i = 0;
                    if (aVar.f117866f == HighlightTimeLineItemType.COMMENT.getValue()) {
                        i = C57582a.m223600a(2);
                    }
                    canvas.drawBitmap(aVar.f117865e, (float) (aVar.f117864d - j3), (float) i, this.f117853a);
                }
            }
        }
    }

    /* renamed from: a */
    public void mo164487a(EmojiReaction emojiReaction) {
        C46821a aVar = new C46821a();
        aVar.f117861a = emojiReaction.uuid;
        aVar.f117862b = emojiReaction.emoji_code;
        aVar.f117865e = Bitmap.createScaledBitmap(m185510a(emojiReaction.emoji_code), C45851c.m181650c(R.dimen.dp_14), C45851c.m181650c(R.dimen.dp_14), true);
        aVar.f117863c = emojiReaction.start_time;
        aVar.f117864d = ((long) (((((float) emojiReaction.start_time) * 1.0f) / ((float) this.f117854b)) * ((float) getLineWidth()))) + ((long) getPaddingLeft());
        aVar.f117866f = HighlightTimeLineItemType.REACTION.getValue();
        this.f117855c.add(aVar);
        invalidate();
    }

    public ReactionTimeLine(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ReactionTimeLine(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f117855c = new ArrayList();
        this.f117856d = new LruCache<>(50);
        this.f117858f = true;
        this.f117859g = true;
        this.f117860h = false;
        m185511a();
    }
}
