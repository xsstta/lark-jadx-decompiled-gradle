package com.ss.android.lark.keyboard.plugin.tool.photo;

import com.ss.android.lark.keyboard.plugin.tool.BaseKBPluginHitPoint;
import com.ss.android.lark.statistics.Statistics;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u0000 \t2\u00020\u0001:\u0002\t\nB\u000f\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00038VX\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/keyboard/plugin/tool/photo/PhotoKBPluginHitPoint;", "Lcom/ss/android/lark/keyboard/plugin/tool/BaseKBPluginHitPoint;", "paramValue", "", "(Ljava/lang/String;)V", "eventName", "getEventName", "()Ljava/lang/String;", "getParamValue", "Companion", "Scene", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class PhotoKBPluginHitPoint extends BaseKBPluginHitPoint {

    /* renamed from: a */
    public static final Companion f104276a = new Companion(null);

    /* renamed from: c */
    private final String f104277c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0002\b\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002B\u0000¨\u0006\u0003"}, d2 = {"Lcom/ss/android/lark/keyboard/plugin/tool/photo/PhotoKBPluginHitPoint$Scene;", "", "Companion", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
    @Retention(RetentionPolicy.RUNTIME)
    public @interface Scene {
        public static final Companion Companion = Companion.f104278a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/keyboard/plugin/tool/photo/PhotoKBPluginHitPoint$Scene$Companion;", "", "()V", "CAMERA", "", "PICTURE", "PREVIEW", "SEND", "VIEW", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.keyboard.plugin.tool.photo.PhotoKBPluginHitPoint$Scene$a */
        public static final class Companion {

            /* renamed from: a */
            static final /* synthetic */ Companion f104278a = new Companion();

            private Companion() {
            }
        }
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.BaseKBPluginHitPoint
    /* renamed from: a */
    public String mo147204a() {
        return "im_chat_input_toolbar_pic";
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0006J\u0006\u0010\u0007\u001a\u00020\u0006R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/keyboard/plugin/tool/photo/PhotoKBPluginHitPoint$Companion;", "", "()V", "PHOTO_KB_EVENT_NAME", "", "sendChatSendPhotoClick", "", "sendChatSendPhotoMoreClick", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.tool.photo.PhotoKBPluginHitPoint$a */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: a */
        public final void mo147736a() {
            Statistics.sendEvent("im_chat_send_photo_more_click");
        }

        /* renamed from: b */
        public final void mo147737b() {
            Statistics.sendEvent("im_chat_send_photo_click");
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.BaseKBPluginHitPoint
    /* renamed from: b */
    public String mo147205b() {
        return this.f104277c;
    }

    public PhotoKBPluginHitPoint(@Scene String str) {
        Intrinsics.checkParameterIsNotNull(str, "paramValue");
        this.f104277c = str;
    }
}
