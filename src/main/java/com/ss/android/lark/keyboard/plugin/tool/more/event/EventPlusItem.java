package com.ss.android.lark.keyboard.plugin.tool.more.event;

import android.content.Intent;
import android.view.View;
import com.google.firebase.messaging.Constants;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.keyboard.IPlusItem;
import com.ss.android.lark.chat.entity.keyboard.ISupportForItem;
import com.ss.android.lark.keyboard.plugin.tool.more.PlusItemHitPoint;
import com.ss.android.lark.utils.UIHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH\u0016J\n\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J\b\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\bH\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0010\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u000fH\u0016J\u0010\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u0006H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/ss/android/lark/keyboard/plugin/tool/more/event/EventPlusItem;", "Lcom/ss/android/lark/chat/entity/keyboard/IPlusItem;", "dependency", "Lcom/ss/android/lark/keyboard/plugin/tool/more/event/IEventDependency;", "(Lcom/ss/android/lark/keyboard/plugin/tool/more/event/IEventDependency;)V", "host", "Lcom/ss/android/lark/chat/entity/keyboard/ISupportForItem;", "getIconId", "", "getIconUrlInfo", "Lcom/ss/android/lark/chat/entity/keyboard/IPlusItem$IconUrlInfo;", "getName", "", "getSortLevel", "isVisible", "", "onClick", "", "view", "Landroid/view/View;", "onReplyModeChanged", "replyMode", "setPlusHotPlugin", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.keyboard.plugin.tool.more.a.a */
public final class EventPlusItem implements IPlusItem {

    /* renamed from: a */
    private ISupportForItem f104167a;

    /* renamed from: b */
    private final IEventDependency f104168b;

    @Override // com.ss.android.lark.chat.entity.keyboard.IPlusItem
    /* renamed from: a */
    public int mo31048a() {
        return R.drawable.kb_ic_svg_event;
    }

    @Override // com.ss.android.lark.chat.entity.keyboard.IPlusItem
    /* renamed from: a */
    public void mo31051a(boolean z) {
    }

    @Override // com.ss.android.lark.chat.entity.keyboard.IPlusItem
    /* renamed from: b */
    public IPlusItem.IconUrlInfo mo31053b() {
        return null;
    }

    @Override // com.ss.android.lark.chat.entity.keyboard.IPlusItem
    /* renamed from: d */
    public boolean mo31056d() {
        return true;
    }

    @Override // com.ss.android.lark.chat.entity.keyboard.IPlusItem
    /* renamed from: e */
    public int mo31057e() {
        return 50;
    }

    @Override // com.ss.android.lark.chat.entity.keyboard.IPlusItem
    /* renamed from: c */
    public String mo31055c() {
        String string = UIHelper.getString(R.string.Calendar_Meeting_Event);
        Intrinsics.checkExpressionValueIsNotNull(string, "UIHelper.getString(R.str…g.Calendar_Meeting_Event)");
        return string;
    }

    @Override // com.ss.android.lark.chat.entity.keyboard.IPlusItem
    /* renamed from: a */
    public void mo31050a(ISupportForItem cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "host");
        this.f104167a = cVar;
    }

    @Override // com.ss.android.lark.chat.entity.keyboard.IPlusItem
    /* renamed from: b */
    public void mo31054b(boolean z) {
        IPlusItem.C33976a.m131689a(this, z);
    }

    public EventPlusItem(IEventDependency bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "dependency");
        this.f104168b = bVar;
    }

    @Override // com.ss.android.lark.chat.entity.keyboard.IPlusItem
    /* renamed from: a */
    public void mo31049a(View view) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        this.f104168b.mo123210a();
        ISupportForItem cVar = this.f104167a;
        if (cVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("host");
        }
        cVar.mo124326a();
        PlusItemHitPoint.f104161a.mo147640a(this.f104168b.mo123211b(), this.f104168b.mo123212c(), PlusItemHitPoint.PlusItemAction.EVENT, PlusItemHitPoint.PlusItemTarget.CAL_EVENT_FULL_CREATE_VIEW);
    }

    @Override // com.ss.android.lark.chat.entity.keyboard.IPlusItem
    /* renamed from: a */
    public boolean mo31052a(Intent intent, int i) {
        Intrinsics.checkParameterIsNotNull(intent, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        return IPlusItem.C33976a.m131690a(this, intent, i);
    }
}
