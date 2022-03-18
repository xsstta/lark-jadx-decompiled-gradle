package com.ss.android.lark.feed.app.entity;

public class ThreadFeedPreview extends FeedPreview {
    private String chatId;

    public ThreadFeedPreview() {
    }

    public String getChatId() {
        return this.chatId;
    }

    public void setChatId(String str) {
        this.chatId = str;
    }

    public ThreadFeedPreview(ThreadFeedPreview threadFeedPreview) {
        super(threadFeedPreview);
        setChatId(threadFeedPreview.getChatId());
    }
}
