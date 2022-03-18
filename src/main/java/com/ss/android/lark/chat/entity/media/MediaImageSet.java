package com.ss.android.lark.chat.entity.media;

import com.ss.android.lark.chat.entity.image.ImageSet;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.message.MessageIdentity;
import com.ss.android.lark.chat.entity.message.content.MediaContent;

public class MediaImageSet extends ImageSet {
    private MediaExtra mediaExtra;

    public MediaImageSet() {
    }

    public MediaExtra getMediaExtra() {
        return this.mediaExtra;
    }

    public void setMediaExtra(MediaExtra mediaExtra2) {
        this.mediaExtra = mediaExtra2;
    }

    public MediaImageSet(ImageSet imageSet) {
        super(imageSet.getKey(), imageSet.getOrigin(), imageSet.getThumbnail(), imageSet.getMiddle(), imageSet.getInlinePreview(), imageSet.getMessageIdentity());
    }

    public MediaImageSet(Message message) {
        if (message.getType() == Message.Type.MEDIA) {
            MediaContent mediaContent = (MediaContent) message.getContent();
            ImageSet imageSet = mediaContent.getImageSet();
            this.key = imageSet.getKey();
            this.origin = imageSet.getOrigin();
            this.thumbnail = imageSet.getThumbnail();
            this.middle = imageSet.getMiddle();
            this.inlinePreview = imageSet.getInlinePreview();
            MediaExtra mediaExtra2 = new MediaExtra();
            this.mediaExtra = mediaExtra2;
            mediaExtra2.setFilePath(mediaContent.getPlayPath());
            this.mediaExtra.setKey(mediaContent.getKey());
            this.mediaExtra.setSize(mediaContent.getSize());
            this.mediaExtra.setMime(mediaContent.getMime());
            this.mediaExtra.setUrl(mediaContent.getUrl());
            this.mediaExtra.setDuration(mediaContent.getDuration());
            setMediaExtra(this.mediaExtra);
            setMessageIdentity(new MessageIdentity(message.getId(), message.getChatId(), message.getSourceId(), message.getSourceType()));
        }
    }
}
