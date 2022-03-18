package com.bytedance.ies.xelement.text.emoji;

import android.content.Context;
import android.graphics.drawable.Drawable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\u0018\u0000 !2\u00020\u0001:\u0001!B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J,\u0010\b\u001a\u001e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tj\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b`\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eJ\b\u0010\u000f\u001a\u00020\u000bH\u0016J\n\u0010\u0010\u001a\u0004\u0018\u00010\nH\u0016J\u001e\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\u0010\r\u001a\u0004\u0018\u00010\nH\u0016J\u0014\u0010\u0015\u001a\u0004\u0018\u00010\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J\u0012\u0010\u0016\u001a\u00020\u00172\b\u0010\r\u001a\u0004\u0018\u00010\nH\u0016J\u001e\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u000bH\u0016J&\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\u000e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u001f2\u0006\u0010 \u001a\u00020\u000bH\u0016R\u001a\u0010\u0003\u001a\u00020\u0001X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007¨\u0006\""}, d2 = {"Lcom/bytedance/ies/xelement/text/emoji/LynxEmojiResHelper;", "Lcom/bytedance/ies/xelement/text/emoji/ILynxEmojiAdapter;", "()V", "adapter", "getAdapter", "()Lcom/bytedance/ies/xelement/text/emoji/ILynxEmojiAdapter;", "setAdapter", "(Lcom/bytedance/ies/xelement/text/emoji/ILynxEmojiAdapter;)V", "calculateEmojiCount", "Ljava/util/LinkedHashMap;", "", "", "Lkotlin/collections/LinkedHashMap;", "text", "", "getAllEmojiCount", "getEmojiResourceMd5", "getRealDrawable", "Landroid/graphics/drawable/Drawable;", "context", "Landroid/content/Context;", "getTabIcon", "isValidEmojiText", "", "loadBaseEmoji", "", "Lcom/bytedance/ies/xelement/text/emoji/LynxBaseEmoji;", "startIndex", "size", "loadBaseEmojiAndEnsureSize", "textList", "", "minSize", "Companion", "x-element-emoji_newelement"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.bytedance.ies.xelement.text.emoji.c */
public final class LynxEmojiResHelper implements ILynxEmojiAdapter {

    /* renamed from: b */
    public static LynxEmojiResHelper f38514b;

    /* renamed from: c */
    public static final Companion f38515c = new Companion(null);

    /* renamed from: a */
    public ILynxEmojiAdapter f38516a;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/bytedance/ies/xelement/text/emoji/LynxEmojiResHelper$Companion;", "", "()V", "TAG", "", "sInstance", "Lcom/bytedance/ies/xelement/text/emoji/LynxEmojiResHelper;", "getInstance", "x-element-emoji_newelement"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.bytedance.ies.xelement.text.emoji.c$a */
    public static final class Companion {
        private Companion() {
        }

        @JvmStatic
        /* renamed from: a */
        public final LynxEmojiResHelper mo53619a() {
            if (LynxEmojiResHelper.f38514b == null) {
                synchronized (LynxEmojiResHelper.class) {
                    if (LynxEmojiResHelper.f38514b == null) {
                        LynxEmojiResHelper.f38514b = new LynxEmojiResHelper(null);
                    }
                    Unit unit = Unit.INSTANCE;
                }
            }
            LynxEmojiResHelper cVar = LynxEmojiResHelper.f38514b;
            if (cVar == null) {
                Intrinsics.throwNpe();
            }
            return cVar;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private LynxEmojiResHelper() {
    }

    public /* synthetic */ LynxEmojiResHelper(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* renamed from: a */
    public final void mo53618a(ILynxEmojiAdapter bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "<set-?>");
        this.f38516a = bVar;
    }

    @Override // com.bytedance.ies.xelement.text.emoji.ILynxEmojiAdapter
    /* renamed from: a */
    public Drawable mo53617a(Context context, String str) {
        ILynxEmojiAdapter bVar = this.f38516a;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
        }
        return bVar.mo53617a(context, str);
    }
}
