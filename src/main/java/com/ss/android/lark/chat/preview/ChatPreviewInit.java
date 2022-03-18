package com.ss.android.lark.chat.preview;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.chat.entity.preview.Parameters;
import com.ss.android.lark.chat.preview.entity.component.property.ChattersPreviewProperty;
import com.ss.android.lark.image.entity.Image;
import com.ss.android.lark.widget.richtext.RichText;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\fB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004H\u0007R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/chat/preview/ChatPreviewInit;", "", "()V", "sDependency", "Lcom/ss/android/lark/chat/preview/ChatPreviewInit$IChatPreviewModuleDependency;", "getSDependency", "()Lcom/ss/android/lark/chat/preview/ChatPreviewInit$IChatPreviewModuleDependency;", "setSDependency", "(Lcom/ss/android/lark/chat/preview/ChatPreviewInit$IChatPreviewModuleDependency;)V", "setDependency", "", "dependency", "IChatPreviewModuleDependency", "im_chat_chat-preview_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.preview.a */
public final class ChatPreviewInit {

    /* renamed from: a */
    public static final ChatPreviewInit f88086a = new ChatPreviewInit();

    /* renamed from: b */
    private static IChatPreviewModuleDependency f88087b;

    private ChatPreviewInit() {
    }

    /* renamed from: a */
    public final IChatPreviewModuleDependency mo126246a() {
        return f88087b;
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m132227a(IChatPreviewModuleDependency aVar) {
        f88087b = aVar;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0002+,J\b\u0010\u0002\u001a\u00020\u0003H&J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&J.\u0010\n\u001a\u00020\u000b2\u000e\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\r2\u0014\u0010\u000f\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\r0\u0010H&J\u001e\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u00142\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH&J\u0010\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0012\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u0018H&J\b\u0010\u001a\u001a\u00020\u001bH&J4\u0010\u001c\u001a\u00020\u000b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u000e2 \u0010\u000f\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u001ej\n\u0012\u0004\u0012\u00020\u000e\u0018\u0001`\u001f0\u0010H&JV\u0010 \u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010!\u001a\u0004\u0018\u00010\"2\u0006\u0010#\u001a\u00020\u000e2\u0006\u0010$\u001a\u00020\u000e2\b\u0010%\u001a\u0004\u0018\u00010\u000e2\u0006\u0010&\u001a\u00020\u000e2\u0006\u0010'\u001a\u00020\u00052\b\u0010(\u001a\u0004\u0018\u00010)2\u0006\u0010*\u001a\u00020\tH&¨\u0006-"}, d2 = {"Lcom/ss/android/lark/chat/preview/ChatPreviewInit$IChatPreviewModuleDependency;", "", "getActionDependency", "Lcom/ss/android/lark/chat/preview/ChatPreviewInit$IChatPreviewModuleDependency$IActionDependency;", "getChatThreadOrThreadItemWidth", "", "context", "Landroid/content/Context;", "isChatThread", "", "getChattersById", "", "chatterIds", "", "", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/chat/preview/entity/component/property/ChattersPreviewProperty$ChatterInfo;", "getGroupMemberManageDependency", "activity", "Landroid/app/Activity;", "chatterIdList", "getMaxChatMessageWidth", "getNtpTime", "", "interval", "getRichTextDependency", "Lcom/ss/android/lark/chat/preview/ChatPreviewInit$IChatPreviewModuleDependency$IRichTextDependency;", "getUrlPreviewChatterList", "previewId", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "openUrlToPlayVideo", "videoPreview", "Landroid/view/View;", "srcUrl", "iFrameUrl", "originUrl", "vid", "site", "coverImage", "Lcom/ss/android/lark/image/entity/Image;", "isGroup", "IActionDependency", "IRichTextDependency", "im_chat_chat-preview_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.preview.a$a */
    public interface IChatPreviewModuleDependency {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0004H&J\u001a\u0010\u0005\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\u0004H&J$\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\f\u001a\u00020\u0004H&¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/chat/preview/ChatPreviewInit$IChatPreviewModuleDependency$IActionDependency;", "", "openUrl", "", "", "putReviewAction", "parameters", "Lcom/ss/android/lark/chat/entity/preview/Parameters;", "actionId", "sendHitPoint", "url", "priViewId", "clickParam", "im_chat_chat-preview_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.chat.preview.a$a$b */
        public interface IActionDependency {
            /* renamed from: a */
            void mo102703a(Parameters parameters, String str);

            /* renamed from: a */
            void mo102704a(String str);

            /* renamed from: a */
            void mo102705a(String str, String str2, String str3);
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/chat/preview/ChatPreviewInit$IChatPreviewModuleDependency$IRichTextDependency;", "", "parseRichTextFromPb", "Lcom/ss/android/lark/widget/richtext/RichText;", "pbRichText", "Lcom/bytedance/lark/pb/basic/v1/RichText;", "im_chat_chat-preview_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.chat.preview.a$a$c */
        public interface IRichTextDependency {
            /* renamed from: a */
            RichText mo102712a(com.bytedance.lark.pb.basic.v1.RichText richText);
        }

        /* renamed from: a */
        int mo102694a(Context context);

        /* renamed from: a */
        int mo102695a(Context context, boolean z);

        /* renamed from: a */
        long mo102696a(long j);

        /* renamed from: a */
        IRichTextDependency mo102697a();

        /* renamed from: a */
        void mo102698a(Activity activity, List<String> list);

        /* renamed from: a */
        void mo102699a(Context context, View view, String str, String str2, String str3, String str4, int i, Image image, boolean z);

        /* renamed from: a */
        void mo102700a(String str, IGetDataCallback<ArrayList<String>> iGetDataCallback);

        /* renamed from: a */
        void mo102701a(List<String> list, IGetDataCallback<List<ChattersPreviewProperty.ChatterInfo>> iGetDataCallback);

        /* renamed from: b */
        IActionDependency mo102702b();

        @Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.chat.preview.a$a$a */
        public static final class C34076a {
            /* renamed from: a */
            public static /* synthetic */ long m132238a(IChatPreviewModuleDependency aVar, long j, int i, Object obj) {
                if (obj == null) {
                    if ((i & 1) != 0) {
                        j = 0;
                    }
                    return aVar.mo102696a(j);
                }
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getNtpTime");
            }
        }
    }
}
