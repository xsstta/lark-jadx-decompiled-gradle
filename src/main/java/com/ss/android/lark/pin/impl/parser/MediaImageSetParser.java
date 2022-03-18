package com.ss.android.lark.pin.impl.parser;

import com.ss.android.lark.chat.entity.media.MediaExtra;
import com.ss.android.lark.chat.entity.media.MediaImageSet;
import com.ss.android.lark.chat.entity.message.content.MediaContent;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/ss/android/lark/pin/impl/parser/MediaImageSetParser;", "", "()V", "Companion", "im_pin_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.pin.impl.a.a */
public final class MediaImageSetParser {

    /* renamed from: a */
    public static final Companion f128145a = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/pin/impl/parser/MediaImageSetParser$Companion;", "", "()V", "getOriginShowImageSet", "Lcom/ss/android/lark/chat/entity/media/MediaImageSet;", "mediaContent", "Lcom/ss/android/lark/chat/entity/message/content/MediaContent;", "im_pin_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.pin.impl.a.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final MediaImageSet mo177331a(MediaContent mediaContent) {
            Intrinsics.checkParameterIsNotNull(mediaContent, "mediaContent");
            MediaImageSet mediaImageSet = new MediaImageSet(mediaContent.getImageSet());
            MediaExtra mediaExtra = new MediaExtra();
            mediaExtra.setUrl(mediaContent.getUrl());
            mediaExtra.setKey(mediaContent.getKey());
            mediaExtra.setMime(mediaContent.getMime());
            mediaExtra.setSize(mediaContent.getSize());
            mediaExtra.setFilePath(mediaContent.getOriginPath());
            mediaExtra.setDuration(mediaContent.getDuration());
            mediaImageSet.setMediaExtra(mediaExtra);
            return mediaImageSet;
        }
    }
}
