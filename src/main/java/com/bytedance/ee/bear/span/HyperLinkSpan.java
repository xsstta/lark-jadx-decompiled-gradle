package com.bytedance.ee.bear.span;

import android.content.Context;
import android.text.TextPaint;
import com.bytedance.ee.bear.p519p.AbstractC10460a;
import com.larksuite.suite.R;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u0000 \u00152\u00020\u00012\u00020\u0002:\u0001\u0015B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\b\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0016"}, d2 = {"Lcom/bytedance/ee/bear/span/HyperLinkSpan;", "Lcom/bytedance/ee/bear/span/AbsSpan;", "Lcom/bytedance/ee/bear/span/RichTextSpan;", "context", "Landroid/content/Context;", "href", "", "clickListener", "Lcom/bytedance/ee/bear/span/AbsSpan$ISpanClickListener;", "(Landroid/content/Context;Ljava/lang/String;Lcom/bytedance/ee/bear/span/AbsSpan$ISpanClickListener;)V", "getContext", "()Landroid/content/Context;", "getHref", "()Ljava/lang/String;", "canModify", "", "isExtensible", "updateDrawState", "", "ds", "Landroid/text/TextPaint;", "Companion", "at_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.p.f */
public class HyperLinkSpan extends AbstractC10460a implements AbstractC10466g {

    /* renamed from: c */
    public static final Companion f28150c = new Companion(null);

    /* renamed from: d */
    private final Context f28151d;

    /* renamed from: e */
    private final String f28152e;

    @Override // com.bytedance.ee.bear.p519p.AbstractC10466g
    /* renamed from: e */
    public boolean mo39745e() {
        return true;
    }

    @Override // com.bytedance.ee.bear.p519p.AbstractC10466g
    /* renamed from: f */
    public boolean mo39746f() {
        return false;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ee/bear/span/HyperLinkSpan$Companion;", "", "()V", "TAG", "", "at_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.p.f$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: g */
    public final String mo39763g() {
        return this.f28152e;
    }

    public void updateDrawState(TextPaint textPaint) {
        Intrinsics.checkParameterIsNotNull(textPaint, "ds");
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
        if (this.f28126b != -1) {
            textPaint.setColor(this.f28126b);
        } else {
            textPaint.setColor(this.f28151d.getResources().getColor(R.color.space_kit_b500));
        }
    }

    public HyperLinkSpan(Context context, String str, AbstractC10460a.AbstractC10461a aVar) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(str, "href");
        this.f28151d = context;
        this.f28152e = str;
        mo39737a(aVar);
    }
}
