package com.ss.android.lark.widget.light.span;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mm.module.participant.ParticipantRepo;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.light.listener.ISpanClickListener;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 #2\u00020\u0001:\u0001#B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007B\u001f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0013\u0010\u0017\u001a\u00020\u00062\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0002J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\u0010\u0010 \u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\"H\u0016R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0013\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0004¨\u0006$"}, d2 = {"Lcom/ss/android/lark/widget/light/span/UrlClickSpan;", "Landroid/text/style/ClickableSpan;", "text", "", "(Ljava/lang/String;)V", "isShowUrlUnderLine", "", "(Ljava/lang/String;Z)V", "context", "Landroid/content/Context;", "(Ljava/lang/String;ZLandroid/content/Context;)V", "mContext", "getMContext", "()Landroid/content/Context;", "setMContext", "(Landroid/content/Context;)V", "mLastClickTime", "", "mShowUrlUnderLine", "mUrl", "getMUrl", "()Ljava/lang/String;", "setMUrl", "equals", "other", "", "hashCode", "", "onClick", "", "widget", "Landroid/view/View;", "updateDrawState", "ds", "Landroid/text/TextPaint;", "Companion", "linked-emoji_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.widget.light.span.i */
public final class UrlClickSpan extends ClickableSpan {

    /* renamed from: a */
    public static final Companion f144222a = new Companion(null);

    /* renamed from: b */
    private String f144223b = "";

    /* renamed from: c */
    private Context f144224c;

    /* renamed from: d */
    private long f144225d;

    /* renamed from: e */
    private boolean f144226e;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/widget/light/span/UrlClickSpan$Companion;", "", "()V", "LENGTH_SHORT", "", "LOG_TAG", "", "linked-emoji_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.widget.light.span.i$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public final String mo198196a() {
        return this.f144223b;
    }

    public int hashCode() {
        return (this.f144223b.hashCode() * 31) + Boolean.valueOf(this.f144226e).hashCode();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UrlClickSpan)) {
            return false;
        }
        UrlClickSpan iVar = (UrlClickSpan) obj;
        if (!(!Intrinsics.areEqual(this.f144223b, iVar.f144223b)) && this.f144226e == iVar.f144226e) {
            return true;
        }
        return false;
    }

    public void updateDrawState(TextPaint textPaint) {
        Intrinsics.checkParameterIsNotNull(textPaint, "ds");
        super.updateDrawState(textPaint);
        Context context = this.f144224c;
        if (context != null) {
            textPaint.setColor(UIUtils.getColor(context, R.color.text_link_normal));
        } else {
            textPaint.setColor(UIHelper.getColor(R.color.lkui_B700));
        }
        textPaint.setUnderlineText(this.f144226e);
    }

    public void onClick(View view) {
        Intrinsics.checkParameterIsNotNull(view, "widget");
        if (view instanceof ISpanClickListener) {
            if (view.getTag(R.id.tag_long_press) != null) {
                view.setTag(R.id.tag_long_press, null);
                if (((ISpanClickListener) view).b_(view, this.f144223b)) {
                    view.performHapticFeedback(0);
                    return;
                }
                return;
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            this.f144225d = uptimeMillis;
            if (uptimeMillis - this.f144225d < ((long) ParticipantRepo.f117150c)) {
                Log.m165379d("UrlClickSpan", "url click elapsed too short");
            } else {
                ((ISpanClickListener) view).a_(view, this.f144223b);
            }
        }
    }

    public UrlClickSpan(String str, boolean z, Context context) {
        Intrinsics.checkParameterIsNotNull(str, "text");
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f144223b = str;
        this.f144226e = z;
        this.f144224c = context;
    }
}
