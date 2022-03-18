package com.ss.android.lark.p2851u.p2852a;

import com.ss.android.lark.chat.base.view.vo.message.MediaContentVO;
import com.ss.android.lark.chat.entity.media.MediaExtra;
import com.ss.android.lark.chat.entity.media.MediaImageSet;
import com.ss.android.lark.chat.entity.message.MessageIdentity;
import com.ss.android.lark.chat.entity.message.content.MediaContent;
import com.ss.android.lark.widget.richtext.RichTextElement;

/* renamed from: com.ss.android.lark.u.a.c */
public class C57308c {
    /* renamed from: a */
    public static MediaImageSet m222069a(MediaContentVO gVar) {
        MediaImageSet mediaImageSet = new MediaImageSet(gVar.mo121863f());
        MediaExtra mediaExtra = new MediaExtra();
        mediaExtra.setUrl(gVar.mo121869l());
        mediaExtra.setKey(gVar.mo121854a());
        mediaExtra.setMime(gVar.mo121861d());
        mediaExtra.setSize(gVar.mo121860c());
        mediaExtra.setFilePath(gVar.mo121874q());
        mediaExtra.setDuration(gVar.mo121864g());
        mediaImageSet.setMediaExtra(mediaExtra);
        return mediaImageSet;
    }

    /* renamed from: a */
    public static MediaImageSet m222070a(MediaContent mediaContent) {
        MediaImageSet mediaImageSet = new MediaImageSet(mediaContent.getImageSet());
        MediaExtra mediaExtra = new MediaExtra();
        mediaExtra.setUrl(mediaContent.getUrl());
        mediaExtra.setKey(mediaContent.getKey());
        mediaExtra.setMime(mediaContent.getMime());
        mediaExtra.setSize(mediaContent.getSize());
        mediaExtra.setFilePath(mediaContent.getPlayPath());
        mediaExtra.setDuration(mediaContent.getDuration());
        mediaImageSet.setMediaExtra(mediaExtra);
        return mediaImageSet;
    }

    /* renamed from: a */
    public static MediaImageSet m222071a(String str, String str2, RichTextElement.MediaProperty mediaProperty) {
        MediaImageSet mediaImageSet = new MediaImageSet();
        mediaImageSet.setKey(mediaProperty.getKey());
        mediaImageSet.setOrigin(C57305aa.m222055a(mediaProperty.getOriginImage()));
        mediaImageSet.setThumbnail(C57305aa.m222055a(mediaProperty.getThumbImage()));
        MediaExtra mediaExtra = new MediaExtra();
        mediaExtra.setUrl(mediaProperty.getUrl());
        mediaExtra.setKey(mediaProperty.getKey());
        mediaExtra.setMime(mediaProperty.getMime());
        mediaExtra.setSize(mediaProperty.getSize());
        mediaExtra.setFilePath(mediaProperty.getOriginPath());
        mediaExtra.setDuration((long) mediaProperty.getDuration());
        mediaImageSet.setMediaExtra(mediaExtra);
        mediaImageSet.setMessageIdentity(new MessageIdentity(str, str2));
        return mediaImageSet;
    }
}
