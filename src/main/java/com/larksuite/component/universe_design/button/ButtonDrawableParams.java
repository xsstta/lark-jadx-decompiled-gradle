package com.larksuite.component.universe_design.button;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0012\b\u0016\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u000e¢\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u0010\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0015\u001a\u00020\n8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0012\"\u0004\b\u0017\u0010\u0014R\"\u0010\u0018\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u000e¢\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u0019\u0010\f\"\u0004\b\u001a\u0010\u000e¨\u0006\u001c"}, d2 = {"Lcom/larksuite/component/universe_design/button/ButtonDrawableParams;", "", "()V", "buttonText", "", "getButtonText", "()Ljava/lang/CharSequence;", "setButtonText", "(Ljava/lang/CharSequence;)V", "buttonTextRes", "", "getButtonTextRes", "()Ljava/lang/Integer;", "setButtonTextRes", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "gravity", "getGravity", "()I", "setGravity", "(I)V", "textMarginPx", "getTextMarginPx", "setTextMarginPx", "textMarginRes", "getTextMarginRes", "setTextMarginRes", "Companion", "universe-ui-button_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.larksuite.component.universe_design.button.a */
public class ButtonDrawableParams {

    /* renamed from: a */
    public static final Companion f63097a = new Companion(null);

    /* renamed from: b */
    private Integer f63098b;

    /* renamed from: c */
    private CharSequence f63099c;

    /* renamed from: d */
    private int f63100d;

    /* renamed from: e */
    private Integer f63101e;

    /* renamed from: f */
    private int f63102f = -1;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/larksuite/component/universe_design/button/ButtonDrawableParams$Companion;", "", "()V", "DEFAULT", "", "GRAVITY_CENTER", "GRAVITY_TEXT_LEFT", "GRAVITY_TEXT_RIGHT", "universe-ui-button_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.universe_design.button.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public final Integer mo90318a() {
        return this.f63098b;
    }

    /* renamed from: b */
    public final CharSequence mo90322b() {
        return this.f63099c;
    }

    /* renamed from: c */
    public final int mo90325c() {
        return this.f63100d;
    }

    /* renamed from: d */
    public final Integer mo90326d() {
        return this.f63101e;
    }

    /* renamed from: e */
    public final int mo90327e() {
        return this.f63102f;
    }

    /* renamed from: a */
    public final void mo90319a(int i) {
        this.f63100d = i;
    }

    /* renamed from: b */
    public final void mo90323b(int i) {
        this.f63102f = i;
    }

    /* renamed from: a */
    public final void mo90320a(CharSequence charSequence) {
        this.f63099c = charSequence;
    }

    /* renamed from: b */
    public final void mo90324b(Integer num) {
        this.f63101e = num;
    }

    /* renamed from: a */
    public final void mo90321a(Integer num) {
        this.f63098b = num;
    }
}
