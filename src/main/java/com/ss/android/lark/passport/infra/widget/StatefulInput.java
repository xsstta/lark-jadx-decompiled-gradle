package com.ss.android.lark.passport.infra.widget;

import com.larksuite.suite.R;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\tJ\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0005\u001a\u00020\u0003H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&¨\u0006\n"}, d2 = {"Lcom/ss/android/lark/passport/infra/widget/StatefulInput;", "", "toError", "", "toFocused", "toNormal", "toState", "state", "Lcom/ss/android/lark/passport/infra/widget/StatefulInput$InputState;", "InputState", "passport-infra_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.passport.infra.widget.c */
public interface StatefulInput {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b&\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0005¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u00048gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0012\u0010\u0007\u001a\u00020\bX¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/passport/infra/widget/StatefulInput$InputState;", "", "()V", "colorRes", "", "getColorRes", "()I", "name", "", "getName", "()Ljava/lang/String;", "Companion", "passport-infra_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.passport.infra.widget.c$b */
    public static abstract class InputState {

        /* renamed from: a */
        public static final InputState f123624a = new C49254d();

        /* renamed from: b */
        public static final InputState f123625b = new C49253c();

        /* renamed from: c */
        public static final InputState f123626c = new C49252b();

        /* renamed from: d */
        public static final Companion f123627d = new Companion(null);

        /* renamed from: a */
        public abstract int mo171808a();

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0011\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\b¢\u0006\u0002\u0010\tR\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/ss/android/lark/passport/infra/widget/StatefulInput$InputState$Companion;", "", "()V", "Error", "Lcom/ss/android/lark/passport/infra/widget/StatefulInput$InputState;", "Focused", "Normal", "values", "", "()[Lcom/ss/android/lark/passport/infra/widget/StatefulInput$InputState;", "passport-infra_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.passport.infra.widget.c$b$a */
        public static final class Companion {
            private Companion() {
            }

            /* renamed from: a */
            public final InputState[] mo171809a() {
                return new InputState[]{InputState.f123624a, InputState.f123625b, InputState.f123626c};
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u0007XD¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/ss/android/lark/passport/infra/widget/StatefulInput$InputState$Companion$Error$1", "Lcom/ss/android/lark/passport/infra/widget/StatefulInput$InputState;", "colorRes", "", "getColorRes", "()I", "name", "", "getName", "()Ljava/lang/String;", "passport-infra_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.passport.infra.widget.c$b$b */
        public static final class C49252b extends InputState {

            /* renamed from: e */
            private final String f123628e = "Error";

            /* renamed from: f */
            private final int f123629f = R.color.function_danger_500;

            @Override // com.ss.android.lark.passport.infra.widget.StatefulInput.InputState
            /* renamed from: a */
            public int mo171808a() {
                return this.f123629f;
            }

            C49252b() {
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u0007XD¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/ss/android/lark/passport/infra/widget/StatefulInput$InputState$Companion$Focused$1", "Lcom/ss/android/lark/passport/infra/widget/StatefulInput$InputState;", "colorRes", "", "getColorRes", "()I", "name", "", "getName", "()Ljava/lang/String;", "passport-infra_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.passport.infra.widget.c$b$c */
        public static final class C49253c extends InputState {

            /* renamed from: e */
            private final String f123630e = "Focused";

            /* renamed from: f */
            private final int f123631f = R.color.primary_pri_500;

            @Override // com.ss.android.lark.passport.infra.widget.StatefulInput.InputState
            /* renamed from: a */
            public int mo171808a() {
                return this.f123631f;
            }

            C49253c() {
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u0007XD¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/ss/android/lark/passport/infra/widget/StatefulInput$InputState$Companion$Normal$1", "Lcom/ss/android/lark/passport/infra/widget/StatefulInput$InputState;", "colorRes", "", "getColorRes", "()I", "name", "", "getName", "()Ljava/lang/String;", "passport-infra_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.passport.infra.widget.c$b$d */
        public static final class C49254d extends InputState {

            /* renamed from: e */
            private final String f123632e = "Normal";

            /* renamed from: f */
            private final int f123633f = R.color.line_border_component;

            @Override // com.ss.android.lark.passport.infra.widget.StatefulInput.InputState
            /* renamed from: a */
            public int mo171808a() {
                return this.f123633f;
            }

            C49254d() {
            }
        }
    }

    /* renamed from: a */
    void mo171807a(InputState bVar);

    @Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.passport.infra.widget.c$a */
    public static final class C49251a {
        /* renamed from: a */
        public static void m194104a(StatefulInput cVar) {
            cVar.mo171807a(InputState.f123624a);
        }

        /* renamed from: b */
        public static void m194105b(StatefulInput cVar) {
            cVar.mo171807a(InputState.f123625b);
        }
    }
}
