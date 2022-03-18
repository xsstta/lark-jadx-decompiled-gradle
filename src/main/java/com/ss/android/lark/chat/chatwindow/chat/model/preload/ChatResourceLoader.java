package com.ss.android.lark.chat.chatwindow.chat.model.preload;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.chatwindow.chat.model.p1636b.C33397a;
import com.ss.android.lark.chat.utils.ChatResourceCache;
import com.ss.android.lark.log.Log;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\u0002H\u0016J\u0010\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\bH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0004¢\u0006\u0004\n\u0002\u0010\t¨\u0006\u0011"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/chat/model/preload/ChatResourceLoader;", "Lcom/ss/android/lark/chat/chatwindow/chat/model/preload/ChatPreLoader$Loader;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "resIds", "", "", "[Ljava/lang/Integer;", "destroy", "", "key", "", "load", "loadDrawable", "resId", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.chatwindow.chat.model.b.b */
public final class ChatResourceLoader implements C33397a.AbstractC33398a<Object> {

    /* renamed from: a */
    public final Context f86019a;

    /* renamed from: b */
    private final Integer[] f86020b;

    @Override // com.ss.android.lark.chat.chatwindow.chat.model.p1636b.C33397a.AbstractC33398a
    /* renamed from: b */
    public String mo122930b() {
        return "ChatResourceLoader";
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.model.p1636b.C33397a.AbstractC33398a
    /* renamed from: a */
    public Object mo122929a() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        for (Integer num : this.f86020b) {
            m129388a(num.intValue());
        }
        Log.m165389i("ChatWindowLog", "resource preload finished, cost:" + (SystemClock.elapsedRealtime() - elapsedRealtime));
        return true;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Landroid/graphics/drawable/Drawable;", "it", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.model.b.b$a */
    public static final class C33399a extends Lambda implements Function1<Integer, Drawable> {
        final /* synthetic */ int $resId;
        final /* synthetic */ ChatResourceLoader this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33399a(ChatResourceLoader bVar, int i) {
            super(1);
            this.this$0 = bVar;
            this.$resId = i;
        }

        public final Drawable invoke(int i) {
            return this.this$0.f86019a.getDrawable(this.$resId);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Drawable invoke(Integer num) {
            return invoke(num.intValue());
        }
    }

    /* renamed from: a */
    private final void m129388a(int i) {
        ChatResourceCache.f88672a.mo126920a(i, new C33399a(this, i));
    }

    public ChatResourceLoader(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f86019a = context;
        Integer valueOf = Integer.valueOf((int) R.drawable.common_round11dp_gray_c6_bg);
        this.f86020b = new Integer[]{valueOf, Integer.valueOf((int) R.drawable.titlebar_back_white_bg_selector), Integer.valueOf((int) R.drawable.titlebar_close_white_bg_selector), Integer.valueOf((int) R.drawable.titlebar_back_bg_selector), Integer.valueOf((int) R.drawable.titlebar_close_bg_selector), Integer.valueOf((int) R.drawable.ud_icon_send_colorful), Integer.valueOf((int) R.drawable.ud_icon_emoji_outlined), Integer.valueOf((int) R.drawable.ud_icon_at_outlined), Integer.valueOf((int) R.drawable.ud_icon_image_outlined), Integer.valueOf((int) R.drawable.ud_icon_voice_outlined), Integer.valueOf((int) R.drawable.ud_icon_voice2text_outlined), Integer.valueOf((int) R.drawable.ud_icon_voice_text_outlined), Integer.valueOf((int) R.drawable.icon_do_not_disturb_tag), Integer.valueOf((int) R.drawable.icon_secret_chat_white), Integer.valueOf((int) R.drawable.post_show_more_bg_blue), Integer.valueOf((int) R.drawable.post_show_more_bg_gray), valueOf, Integer.valueOf((int) R.drawable.chat_title_left_count_bg_static_white), Integer.valueOf((int) R.drawable.chat_window_badge_point), Integer.valueOf((int) R.drawable.kb_more_btn_bg_selector)};
    }
}
