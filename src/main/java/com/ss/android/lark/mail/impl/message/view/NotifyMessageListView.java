package com.ss.android.lark.mail.impl.message.view;

import android.content.Context;
import android.util.AttributeSet;

public class NotifyMessageListView extends MailMessageListView {
    @Override // com.ss.android.lark.mail.impl.message.view.AbsMessageTemplateView
    public int getThreadType() {
        return 7;
    }

    public NotifyMessageListView(Context context) {
        super(context);
    }

    public NotifyMessageListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
