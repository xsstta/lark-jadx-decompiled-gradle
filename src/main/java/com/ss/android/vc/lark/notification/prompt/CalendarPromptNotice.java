package com.ss.android.vc.lark.notification.prompt;

import com.ss.android.lark.notification.export.entity.Notice;
import com.ss.android.vc.entity.VideoChatPrompt;

public class CalendarPromptNotice extends Notice {
    private VideoChatPrompt.CalendarStartPrompt calendarStartPrompt;

    public VideoChatPrompt.CalendarStartPrompt getCalendarStartPrompt() {
        return this.calendarStartPrompt;
    }

    public CalendarPromptNotice(Notice notice, VideoChatPrompt.CalendarStartPrompt calendarStartPrompt2) {
        super(notice);
        this.calendarStartPrompt = calendarStartPrompt2;
    }
}
