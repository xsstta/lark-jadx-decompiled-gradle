package com.ss.android.lark.chat.chatwindow.chat.data.p1620a;

import com.ss.android.lark.dependency.IStickerDependency;
import com.ss.android.lark.keyboard.plugin.tool.face.C40964l;
import com.ss.android.lark.log.Log;

/* renamed from: com.ss.android.lark.chat.chatwindow.chat.data.a.n */
public class C33224n {
    /* renamed from: a */
    public static IStickerDependency.StickerFileInfo m128431a(C40964l lVar) {
        if (lVar != null) {
            return new IStickerDependency.StickerFileInfo(lVar.mo147620a(), lVar.mo147622b(), lVar.mo147624c(), lVar.mo147625d(), lVar.mo147626e(), lVar.mo147627f(), lVar.mo147628g());
        }
        Log.m165383e("StickerFileInfoConverter", "convert called. stickerFileInfo is null");
        return null;
    }
}
