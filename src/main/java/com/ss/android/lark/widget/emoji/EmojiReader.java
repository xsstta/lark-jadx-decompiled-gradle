package com.ss.android.lark.widget.emoji;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.am;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.IntRange;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0003\u0018\u0019\u001aB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0007J\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\tJ\u001c\u0010\n\u001a\u00020\u000b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\f\u001a\u00020\tJ\u0016\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\tJ\u001c\u0010\u000e\u001a\u00020\u000b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\f\u001a\u00020\tJ\u0016\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\tJ\u001e\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\tJ\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u00042\u0006\u0010\u0006\u001a\u00020\u0007J!\u0010\u0014\u001a\u00020\u0015*\u00020\u00072\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00150\u0017H\b¨\u0006\u001b"}, d2 = {"Lcom/ss/android/lark/widget/emoji/EmojiReader;", "", "()V", "analyzeText", "", "Lcom/ss/android/lark/widget/emoji/EmojiReader$Node;", "str", "", "getTextLength", "", "isEmojiOfCharIndex", "", "idx", "nodeList", "isEmojiOfVisionIndex", "subSequence", "end", "start", "transToUnicode", "", "forEachCodePoint", "", "action", "Lkotlin/Function1;", "InnerNode", "Node", "StateMachine", "linked-emoji_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.widget.emoji.a */
public final class EmojiReader {

    /* renamed from: a */
    public static final EmojiReader f143882a = new EmojiReader();

    /* access modifiers changed from: private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\"\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\r\n\u0002\b\u0003\b\u0002\u0018\u0000  2\u00020\u0001:\u0001 B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\r\u001a\u00020\u000eH\u0002J\b\u0010\u000f\u001a\u00020\u000eH\u0002J\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u0011J\u0006\u0010\u0012\u001a\u00020\bJ\u0006\u0010\u0013\u001a\u00020\bJ\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\bH\u0002J\u0010\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\bH\u0002J\u0010\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\bH\u0002J\u0010\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\bH\u0002J\b\u0010\u001a\u001a\u00020\u000eH\u0002J\b\u0010\u001b\u001a\u00020\u000eH\u0002J\u0018\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\u001f\u001a\u00020\bR\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\fX\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lcom/ss/android/lark/widget/emoji/EmojiReader$StateMachine;", "", "()V", "charUnitList", "", "Lcom/ss/android/lark/widget/emoji/EmojiReader$InnerNode;", "currentChar", "currentCodePoint", "", "currentIndex", "currentState", "emojiModifier", "", "assertEmoji", "", "endChar", "getCharList", "", "getCurrentCharSize", "getCurrentIndex", "isEmojiCodePoint", "", "codePoint", "isRegionalIndicator", "isSpecialSymbol", "maybeEmojiCodePoint", "moveToNext", "moveToPrev", "read", "str", "", "end", "Companion", "linked-emoji_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.widget.emoji.a$c */
    public static final class StateMachine {

        /* renamed from: a */
        public static final IntRange f143890a = new IntRange(917536, 917631);

        /* renamed from: b */
        public static final Companion f143891b = new Companion(null);

        /* renamed from: c */
        private final Set<Integer> f143892c = am.m265692a(am.m265689a((Object[]) new Integer[]{65038, 65039, 8419}), (Iterable) f143890a);

        /* renamed from: d */
        private final List<InnerNode> f143893d = new ArrayList();

        /* renamed from: e */
        private int f143894e;

        /* renamed from: f */
        private int f143895f;

        /* renamed from: g */
        private InnerNode f143896g = new InnerNode(0, false, null, 6, null);

        /* renamed from: h */
        private int f143897h;

        /* renamed from: b */
        private final boolean m226559b(int i) {
            return i == 12336 || i == 169 || i == 174 || i == 8482;
        }

        /* renamed from: c */
        private final boolean m226561c(int i) {
            return i >= 0 && 57 >= i;
        }

        /* renamed from: d */
        private final boolean m226563d(int i) {
            return 126976 <= i && 127487 >= i;
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/ss/android/lark/widget/emoji/EmojiReader$StateMachine$Companion;", "", "()V", "Joiner", "", "ModifierBlack", "ModifierColorFul", "ModifierKeyCap", "ModifierTagRange", "Lkotlin/ranges/IntRange;", "getModifierTagRange", "()Lkotlin/ranges/IntRange;", "STATE_DEFAULT", "STATE_EMOJI", "STATE_EMOJI_JOIN", "STATE_EMOJI_MODIFIER", "STATE_NATIONAL_FLAG", "STATE_PRE_EMOJI", "linked-emoji_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.widget.emoji.a$c$a */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* renamed from: b */
        public final List<InnerNode> mo197869b() {
            return this.f143893d;
        }

        /* renamed from: d */
        private final void m226562d() {
            this.f143896g.mo197855a(true);
        }

        /* renamed from: a */
        public final int mo197867a() {
            return this.f143893d.size();
        }

        /* renamed from: e */
        private final void m226564e() {
            this.f143896g.mo197857c().add(Integer.valueOf(this.f143895f));
            this.f143894e += Character.charCount(this.f143895f);
        }

        /* renamed from: f */
        private final void m226565f() {
            Integer removeLast = this.f143896g.mo197857c().removeLast();
            int i = this.f143894e;
            Intrinsics.checkExpressionValueIsNotNull(removeLast, "lastCodePoint");
            this.f143894e = i - Character.charCount(removeLast.intValue());
        }

        /* renamed from: c */
        private final void m226560c() {
            this.f143897h = 0;
            if (!this.f143896g.mo197857c().isEmpty()) {
                this.f143893d.add(this.f143896g);
                this.f143896g = new InnerNode(this.f143894e, false, null, 6, null);
            }
        }

        /* renamed from: a */
        private final boolean m226558a(int i) {
            if ((127488 > i || 131071 < i) && ((9472 > i || 12287 < i) && !m226559b(i))) {
                return false;
            }
            return true;
        }

        /* renamed from: a */
        public final void mo197868a(CharSequence charSequence, int i) {
            Intrinsics.checkParameterIsNotNull(charSequence, "str");
            while (this.f143894e < charSequence.length()) {
                int codePointAt = Character.codePointAt(charSequence, this.f143894e);
                this.f143895f = codePointAt;
                int i2 = this.f143897h;
                if (i2 == 65536) {
                    if (m226558a(codePointAt)) {
                        this.f143897h = 1;
                        m226564e();
                    } else {
                        m226565f();
                        m226560c();
                    }
                } else if (i2 == 257) {
                    if (m226563d(codePointAt)) {
                        m226564e();
                        m226562d();
                        m226560c();
                    } else {
                        m226562d();
                        m226560c();
                    }
                } else if (i2 == 16) {
                    if (this.f143892c.contains(Integer.valueOf(codePointAt))) {
                        this.f143897h = 4097;
                        m226564e();
                    } else {
                        m226560c();
                    }
                } else if ((i2 & 1) != 0) {
                    if (8205 == codePointAt) {
                        this.f143897h = 65536;
                        m226564e();
                    } else if (this.f143892c.contains(Integer.valueOf(codePointAt))) {
                        this.f143897h = 4097;
                        m226564e();
                    } else {
                        m226562d();
                        m226560c();
                    }
                } else if (m226563d(codePointAt)) {
                    this.f143897h = 257;
                    m226564e();
                } else if (m226561c(this.f143895f)) {
                    this.f143897h = 16;
                    m226564e();
                } else if (m226558a(this.f143895f)) {
                    this.f143897h = 1;
                    m226564e();
                } else {
                    m226564e();
                    m226560c();
                }
                if (mo197867a() >= i) {
                    break;
                }
            }
            int i3 = this.f143897h;
            if (i3 != 0) {
                if ((i3 & 1) != 0) {
                    m226562d();
                }
                m226560c();
            }
        }

        /* renamed from: a */
        public static /* synthetic */ void m226557a(StateMachine cVar, CharSequence charSequence, int i, int i2, Object obj) {
            if ((i2 & 2) != 0) {
                i = charSequence.length();
            }
            cVar.mo197868a(charSequence, i);
        }
    }

    /* access modifiers changed from: private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007HÆ\u0003J-\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00052\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\u000b\"\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, d2 = {"Lcom/ss/android/lark/widget/emoji/EmojiReader$InnerNode;", "", "startIndex", "", "isEmoji", "", "codePoint", "Ljava/util/Deque;", "(IZLjava/util/Deque;)V", "getCodePoint", "()Ljava/util/Deque;", "()Z", "setEmoji", "(Z)V", "getStartIndex", "()I", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "toString", "", "linked-emoji_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.widget.emoji.a$a */
    public static final class InnerNode {

        /* renamed from: a */
        private final int f143883a;

        /* renamed from: b */
        private boolean f143884b;

        /* renamed from: c */
        private final Deque<Integer> f143885c;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InnerNode)) {
                return false;
            }
            InnerNode aVar = (InnerNode) obj;
            return this.f143883a == aVar.f143883a && this.f143884b == aVar.f143884b && Intrinsics.areEqual(this.f143885c, aVar.f143885c);
        }

        public int hashCode() {
            int i = this.f143883a * 31;
            boolean z = this.f143884b;
            if (z) {
                z = true;
            }
            int i2 = z ? 1 : 0;
            int i3 = z ? 1 : 0;
            int i4 = z ? 1 : 0;
            int i5 = (i + i2) * 31;
            Deque<Integer> deque = this.f143885c;
            return i5 + (deque != null ? deque.hashCode() : 0);
        }

        public String toString() {
            return "InnerNode(startIndex=" + this.f143883a + ", isEmoji=" + this.f143884b + ", codePoint=" + this.f143885c + ")";
        }

        /* renamed from: a */
        public final int mo197854a() {
            return this.f143883a;
        }

        /* renamed from: b */
        public final boolean mo197856b() {
            return this.f143884b;
        }

        /* renamed from: c */
        public final Deque<Integer> mo197857c() {
            return this.f143885c;
        }

        /* renamed from: a */
        public final void mo197855a(boolean z) {
            this.f143884b = z;
        }

        public InnerNode(int i, boolean z, Deque<Integer> deque) {
            Intrinsics.checkParameterIsNotNull(deque, "codePoint");
            this.f143883a = i;
            this.f143884b = z;
            this.f143885c = deque;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ InnerNode(int i, boolean z, Deque deque, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(i, (i2 & 2) != 0 ? false : z, (i2 & 4) != 0 ? new LinkedList() : deque);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\u0010\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\b¢\u0006\u0002\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\bHÆ\u0003J7\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\bHÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00062\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000e¨\u0006\u001a"}, d2 = {"Lcom/ss/android/lark/widget/emoji/EmojiReader$Node;", "", "startIndex", "", "length", "isEmoji", "", "codePoint", "", "(IIZLjava/util/List;)V", "getCodePoint", "()Ljava/util/List;", "()Z", "getLength", "()I", "getStartIndex", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "toString", "", "linked-emoji_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.widget.emoji.a$b */
    public static final class Node {

        /* renamed from: a */
        private final int f143886a;

        /* renamed from: b */
        private final int f143887b;

        /* renamed from: c */
        private final boolean f143888c;

        /* renamed from: d */
        private final List<Integer> f143889d;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Node)) {
                return false;
            }
            Node bVar = (Node) obj;
            return this.f143886a == bVar.f143886a && this.f143887b == bVar.f143887b && this.f143888c == bVar.f143888c && Intrinsics.areEqual(this.f143889d, bVar.f143889d);
        }

        public int hashCode() {
            int i = ((this.f143886a * 31) + this.f143887b) * 31;
            boolean z = this.f143888c;
            if (z) {
                z = true;
            }
            int i2 = z ? 1 : 0;
            int i3 = z ? 1 : 0;
            int i4 = z ? 1 : 0;
            int i5 = (i + i2) * 31;
            List<Integer> list = this.f143889d;
            return i5 + (list != null ? list.hashCode() : 0);
        }

        public String toString() {
            return "Node(startIndex=" + this.f143886a + ", length=" + this.f143887b + ", isEmoji=" + this.f143888c + ", codePoint=" + this.f143889d + ")";
        }

        /* renamed from: a */
        public final int mo197861a() {
            return this.f143886a;
        }

        /* renamed from: b */
        public final int mo197862b() {
            return this.f143887b;
        }

        /* renamed from: c */
        public final boolean mo197863c() {
            return this.f143888c;
        }

        public Node(int i, int i2, boolean z, List<Integer> list) {
            Intrinsics.checkParameterIsNotNull(list, "codePoint");
            this.f143886a = i;
            this.f143887b = i2;
            this.f143888c = z;
            this.f143889d = list;
        }
    }

    private EmojiReader() {
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "node", "Lcom/ss/android/lark/widget/emoji/EmojiReader$Node;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.widget.emoji.a$d */
    public static final class C58440d extends Lambda implements Function1<Node, Integer> {
        final /* synthetic */ int $idx;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C58440d(int i) {
            super(1);
            this.$idx = i;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Integer invoke(Node bVar) {
            return Integer.valueOf(invoke(bVar));
        }

        public final int invoke(Node bVar) {
            Intrinsics.checkParameterIsNotNull(bVar, "node");
            if (this.$idx < bVar.mo197861a()) {
                return 1;
            }
            if (this.$idx >= bVar.mo197861a() + bVar.mo197862b()) {
                return -1;
            }
            return 0;
        }
    }

    /* renamed from: a */
    public final List<Node> mo197850a(CharSequence charSequence) {
        Intrinsics.checkParameterIsNotNull(charSequence, "str");
        StateMachine cVar = new StateMachine();
        StateMachine.m226557a(cVar, charSequence, 0, 2, null);
        List<InnerNode> b = cVar.mo197869b();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(b, 10));
        for (T t : b) {
            int i = 0;
            for (T t2 : t.mo197857c()) {
                Intrinsics.checkExpressionValueIsNotNull(t2, "code");
                i += Character.charCount(t2.intValue());
            }
            arrayList.add(new Node(t.mo197854a(), i, t.mo197856b(), CollectionsKt.toList(t.mo197857c())));
        }
        return arrayList;
    }

    /* renamed from: a */
    public final boolean mo197851a(CharSequence charSequence, int i) {
        Intrinsics.checkParameterIsNotNull(charSequence, "str");
        return mo197853b(mo197850a(charSequence), i);
    }

    /* renamed from: a */
    public final boolean mo197852a(List<Node> list, int i) {
        Intrinsics.checkParameterIsNotNull(list, "nodeList");
        return list.get(i).mo197863c();
    }

    /* renamed from: b */
    public final boolean mo197853b(List<Node> list, int i) {
        Intrinsics.checkParameterIsNotNull(list, "nodeList");
        int binarySearch$default = CollectionsKt.binarySearch$default(list, 0, 0, new C58440d(i), 3, (Object) null);
        if (binarySearch$default < 0) {
            return false;
        }
        return mo197852a(list, binarySearch$default);
    }
}
