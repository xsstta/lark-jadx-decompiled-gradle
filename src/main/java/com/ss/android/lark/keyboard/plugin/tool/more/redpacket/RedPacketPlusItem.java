package com.ss.android.lark.keyboard.plugin.tool.more.redpacket;

import android.content.Intent;
import android.view.View;
import com.google.firebase.messaging.Constants;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.keyboard.IPlusItem;
import com.ss.android.lark.chat.entity.keyboard.ISupportForItem;
import com.ss.android.lark.keyboard.C40673a;
import com.ss.android.lark.keyboard.C40683h;
import com.ss.android.lark.keyboard.hitpoint.KeyboardHitPointExtraParams;
import com.ss.android.lark.keyboard.hitpoint.KeyboardHitPointNew;
import com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin;
import com.ss.android.lark.utils.UIHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH\u0016J\n\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J\b\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\bH\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0010\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u000fH\u0016J\b\u0010\u0016\u001a\u00020\u0011H\u0002J\u0010\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u0006H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/ss/android/lark/keyboard/plugin/tool/more/redpacket/RedPacketPlusItem;", "Lcom/ss/android/lark/chat/entity/keyboard/IPlusItem;", "dependency", "Lcom/ss/android/lark/keyboard/plugin/tool/more/redpacket/IRedPacketDependency;", "(Lcom/ss/android/lark/keyboard/plugin/tool/more/redpacket/IRedPacketDependency;)V", "host", "Lcom/ss/android/lark/chat/entity/keyboard/ISupportForItem;", "getIconId", "", "getIconUrlInfo", "Lcom/ss/android/lark/chat/entity/keyboard/IPlusItem$IconUrlInfo;", "getName", "", "getSortLevel", "isVisible", "", "onClick", "", "view", "Landroid/view/View;", "onReplyModeChanged", "replyMode", "sendRedPacketClickHitPoint", "setPlusHotPlugin", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.keyboard.plugin.tool.more.c.b */
public final class RedPacketPlusItem implements IPlusItem {

    /* renamed from: a */
    private ISupportForItem f104187a;

    /* renamed from: b */
    private final IRedPacketDependency f104188b;

    @Override // com.ss.android.lark.chat.entity.keyboard.IPlusItem
    /* renamed from: a */
    public int mo31048a() {
        return R.drawable.ic_icon_luckmoney_colorful;
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
        return 40;
    }

    @Override // com.ss.android.lark.chat.entity.keyboard.IPlusItem
    /* renamed from: c */
    public String mo31055c() {
        String string = UIHelper.getString(R.string.Lark_Legacy_Hongbao);
        Intrinsics.checkExpressionValueIsNotNull(string, "UIHelper.getString(R.string.Lark_Legacy_Hongbao)");
        return string;
    }

    /* renamed from: f */
    private final void m162347f() {
        ISupportForItem cVar = this.f104187a;
        if (cVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("host");
        }
        IKeyBoardPlugin.IKeyBoardContext a = C40673a.m160697a(cVar);
        if (a != null) {
            KeyboardHitPointNew.m160872a(C40683h.m160854d(a.mo147372b()), KeyboardHitPointExtraParams.Click.HONGBAO.plus(KeyboardHitPointExtraParams.Target.IM_MSG_HONGBAO_CONFIRM_VIEW).plus(C40673a.m160698a(a.mo147381z().mo146903h())));
        }
    }

    @Override // com.ss.android.lark.chat.entity.keyboard.IPlusItem
    /* renamed from: a */
    public void mo31050a(ISupportForItem cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "host");
        this.f104187a = cVar;
    }

    @Override // com.ss.android.lark.chat.entity.keyboard.IPlusItem
    /* renamed from: b */
    public void mo31054b(boolean z) {
        IPlusItem.C33976a.m131689a(this, z);
    }

    public RedPacketPlusItem(IRedPacketDependency aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "dependency");
        this.f104188b = aVar;
    }

    @Override // com.ss.android.lark.chat.entity.keyboard.IPlusItem
    /* renamed from: a */
    public void mo31049a(View view) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        if (this.f104188b.mo123213a()) {
            m162347f();
            ISupportForItem cVar = this.f104187a;
            if (cVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("host");
            }
            cVar.mo124326a();
        }
    }

    @Override // com.ss.android.lark.chat.entity.keyboard.IPlusItem
    /* renamed from: a */
    public boolean mo31052a(Intent intent, int i) {
        Intrinsics.checkParameterIsNotNull(intent, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        return IPlusItem.C33976a.m131690a(this, intent, i);
    }
}
