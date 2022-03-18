package com.ss.android.lark.keyboard.plugin.tool.more;

import android.content.Intent;
import android.view.View;
import com.google.firebase.messaging.Constants;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.chat.entity.keyboard.IPlusItem;
import com.ss.android.lark.chat.entity.keyboard.ISupportForItem;
import com.ss.android.lark.chat.utils.ChatParamUtils;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.statistics.Statistics;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0001¢\u0006\u0002\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\n\u0010\b\u001a\u0004\u0018\u00010\tH\u0016J\b\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\u0007H\u0016J\b\u0010\r\u001a\u00020\u000eH\u0016J\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0007H\u0016J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u0010\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u000eH\u0016J\u0010\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u000eH\u0016J\u0010\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u001dH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0001X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/ss/android/lark/keyboard/plugin/tool/more/DocPlusItemWrapper;", "Lcom/ss/android/lark/chat/entity/keyboard/IPlusItem;", "chat", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "realItem", "(Lcom/ss/android/lark/chat/entity/chat/Chat;Lcom/ss/android/lark/chat/entity/keyboard/IPlusItem;)V", "getIconId", "", "getIconUrlInfo", "Lcom/ss/android/lark/chat/entity/keyboard/IPlusItem$IconUrlInfo;", "getName", "", "getSortLevel", "isVisible", "", "onActivityResult", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Landroid/content/Intent;", "requestCode", "onClick", "", "view", "Landroid/view/View;", "onPlusItemSelected", "firstShow", "onReplyModeChanged", "replyMode", "setPlusHotPlugin", "host", "Lcom/ss/android/lark/chat/entity/keyboard/ISupportForItem;", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.keyboard.plugin.tool.more.a */
public final class DocPlusItemWrapper implements IPlusItem {

    /* renamed from: a */
    private final Chat f104165a;

    /* renamed from: b */
    private final IPlusItem f104166b;

    @Override // com.ss.android.lark.chat.entity.keyboard.IPlusItem
    /* renamed from: a */
    public int mo31048a() {
        return R.drawable.kb_ic_svg_space;
    }

    @Override // com.ss.android.lark.chat.entity.keyboard.IPlusItem
    /* renamed from: b */
    public IPlusItem.IconUrlInfo mo31053b() {
        return this.f104166b.mo31053b();
    }

    @Override // com.ss.android.lark.chat.entity.keyboard.IPlusItem
    /* renamed from: c */
    public String mo31055c() {
        return this.f104166b.mo31055c();
    }

    @Override // com.ss.android.lark.chat.entity.keyboard.IPlusItem
    /* renamed from: d */
    public boolean mo31056d() {
        return this.f104166b.mo31056d();
    }

    @Override // com.ss.android.lark.chat.entity.keyboard.IPlusItem
    /* renamed from: e */
    public int mo31057e() {
        return this.f104166b.mo31057e();
    }

    @Override // com.ss.android.lark.chat.entity.keyboard.IPlusItem
    /* renamed from: a */
    public void mo31051a(boolean z) {
        this.f104166b.mo31051a(z);
    }

    @Override // com.ss.android.lark.chat.entity.keyboard.IPlusItem
    /* renamed from: a */
    public void mo31050a(ISupportForItem cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "host");
        this.f104166b.mo31050a(cVar);
    }

    @Override // com.ss.android.lark.chat.entity.keyboard.IPlusItem
    /* renamed from: b */
    public void mo31054b(boolean z) {
        this.f104166b.mo31054b(z);
    }

    @Override // com.ss.android.lark.chat.entity.keyboard.IPlusItem
    /* renamed from: a */
    public void mo31049a(View view) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        this.f104166b.mo31049a(view);
        try {
            Statistics.sendEvent("im_chat_input_plus_click", new JSONObject(ChatParamUtils.m133137a(this.f104165a, (String) null, (Chatter) null, 4, (Object) null)).put("click", "docs").put("target", "ccm_space_im_docs_send_view"));
        } catch (Throwable th) {
            String message = th.getMessage();
            if (message != null) {
                Log.m165382e(message);
            }
        }
    }

    public DocPlusItemWrapper(Chat chat, IPlusItem bVar) {
        Intrinsics.checkParameterIsNotNull(chat, "chat");
        Intrinsics.checkParameterIsNotNull(bVar, "realItem");
        this.f104165a = chat;
        this.f104166b = bVar;
    }

    @Override // com.ss.android.lark.chat.entity.keyboard.IPlusItem
    /* renamed from: a */
    public boolean mo31052a(Intent intent, int i) {
        Intrinsics.checkParameterIsNotNull(intent, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        return this.f104166b.mo31052a(intent, i);
    }
}
