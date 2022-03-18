package com.bytedance.ee.bear.mindnote.share;

import com.bytedance.ee.bear.document.C6095s;
import com.bytedance.ee.bear.document.share.SharePlugin;

public class MindNoteSharePlugin extends SharePlugin {
    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.document.share.SharePlugin
    public C10186a createHandler(C6095s sVar) {
        return new C10186a(sVar);
    }
}
