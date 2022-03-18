package com.ss.android.lark.keyboard.plugin.input;

import com.google.firebase.messaging.Constants;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.chat.entity.preview.UrlPreviewEntity;
import com.ss.android.lark.log.Log;
import java.lang.ref.WeakReference;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00162\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0016B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0012\u0010\u0014\u001a\u00020\u00112\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0004¢\u0006\u0002\n\u0000R!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8BX\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/ss/android/lark/keyboard/plugin/input/GetUrlInlineFromCallback;", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/chat/entity/preview/UrlPreviewEntity;", "mSelection", "", "mContent", "", "editText", "Lcom/ss/android/lark/keyboard/plugin/input/RichTextEmojiconEditText;", "(ILjava/lang/String;Lcom/ss/android/lark/keyboard/plugin/input/RichTextEmojiconEditText;)V", "mEditTextRef", "Ljava/lang/ref/WeakReference;", "getMEditTextRef", "()Ljava/lang/ref/WeakReference;", "mEditTextRef$delegate", "Lkotlin/Lazy;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Companion", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.keyboard.plugin.input.c */
public final class GetUrlInlineFromCallback implements IGetDataCallback<UrlPreviewEntity> {

    /* renamed from: b */
    public static final Companion f103452b = new Companion(null);

    /* renamed from: a */
    public final RichTextEmojiconEditText f103453a;

    /* renamed from: c */
    private final Lazy f103454c = LazyKt.lazy(new C40728b(this));

    /* renamed from: d */
    private final int f103455d;

    /* renamed from: e */
    private final String f103456e;

    /* renamed from: a */
    private final WeakReference<RichTextEmojiconEditText> m161128a() {
        return (WeakReference) this.f103454c.getValue();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/keyboard/plugin/input/GetUrlInlineFromCallback$Companion;", "", "()V", "TAG", "", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.input.c$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0010\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Ljava/lang/ref/WeakReference;", "Lcom/ss/android/lark/keyboard/plugin/input/RichTextEmojiconEditText;", "kotlin.jvm.PlatformType", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.input.c$b */
    static final class C40728b extends Lambda implements Function0<WeakReference<RichTextEmojiconEditText>> {
        final /* synthetic */ GetUrlInlineFromCallback this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C40728b(GetUrlInlineFromCallback cVar) {
            super(0);
            this.this$0 = cVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final WeakReference<RichTextEmojiconEditText> invoke() {
            return new WeakReference<>(this.this$0.f103453a);
        }
    }

    @Override // com.larksuite.framework.callback.IGetDataCallback
    public void onError(ErrorResult errorResult) {
        Intrinsics.checkParameterIsNotNull(errorResult, "err");
        Log.m165383e("GetUrlInlineFromCallback", errorResult.toString());
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x003c A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003d  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onSuccess(com.ss.android.lark.chat.entity.preview.UrlPreviewEntity r12) {
        /*
        // Method dump skipped, instructions count: 165
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.keyboard.plugin.input.GetUrlInlineFromCallback.onSuccess(com.ss.android.lark.chat.entity.preview.UrlPreviewEntity):void");
    }

    public GetUrlInlineFromCallback(int i, String str, RichTextEmojiconEditText richTextEmojiconEditText) {
        Intrinsics.checkParameterIsNotNull(richTextEmojiconEditText, "editText");
        this.f103455d = i;
        this.f103456e = str;
        this.f103453a = richTextEmojiconEditText;
    }
}
