package com.ss.android.lark.openplatform.common;

import android.content.Intent;
import android.view.View;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.utils.UIUtils;
import com.ss.android.lark.chat.entity.keyboard.IPlusItem;
import com.ss.android.lark.chat.entity.keyboard.ISupportForItem;
import com.ss.android.lark.openplatform.OpenPlatformModule;
import com.ss.android.lark.openplatform.common.bean.C48826a;
import com.ss.android.lark.openplatform.p2399a.AbstractC48793a;
import com.ss.android.lark.openplatform.plus.C48835a;
import com.ss.android.openbusiness.data.netdata.C59572d;
import com.ss.android.openbusiness.data.netdata.Icon;
import com.ss.android.openbusiness.p3006c.C59549f;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bB\u001f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\fJ\b\u0010\u0010\u001a\u00020\u0003H\u0016J\n\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0003H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\u0010\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u0017H\u0016J\u0010\u0010\u001e\u001a\u00020\u00192\u0006\u0010\r\u001a\u00020\u000fH\u0016R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX.¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/ss/android/lark/openplatform/common/GadgetPlusItem;", "Lcom/ss/android/lark/chat/entity/keyboard/IPlusItem;", "sort", "", "gadgetManager", "Lcom/ss/android/lark/openplatform/plus/GadgetManager;", "gadget", "Lcom/ss/android/lark/openplatform/common/bean/PlusMenuGadget;", "(ILcom/ss/android/lark/openplatform/plus/GadgetManager;Lcom/ss/android/lark/openplatform/common/bean/PlusMenuGadget;)V", "gadgetShortItem", "Lcom/ss/android/openbusiness/data/netdata/OpbBaseAppItem;", "(ILcom/ss/android/lark/openplatform/plus/GadgetManager;Lcom/ss/android/openbusiness/data/netdata/OpbBaseAppItem;)V", "(ILcom/ss/android/lark/openplatform/plus/GadgetManager;)V", "host", "Ljava/lang/ref/WeakReference;", "Lcom/ss/android/lark/chat/entity/keyboard/ISupportForItem;", "getIconId", "getIconUrlInfo", "Lcom/ss/android/lark/chat/entity/keyboard/IPlusItem$IconUrlInfo;", "getName", "", "getSortLevel", "isVisible", "", "onClick", "", "view", "Landroid/view/View;", "onReplyModeChanged", "replyMode", "setPlusHotPlugin", "open-platform_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.openplatform.common.e */
public final class GadgetPlusItem implements IPlusItem {

    /* renamed from: a */
    private WeakReference<ISupportForItem> f122660a;

    /* renamed from: b */
    private C48826a f122661b;

    /* renamed from: c */
    private C59572d f122662c;

    /* renamed from: d */
    private final int f122663d;

    /* renamed from: e */
    private final C48835a f122664e;

    @Override // com.ss.android.lark.chat.entity.keyboard.IPlusItem
    /* renamed from: a */
    public int mo31048a() {
        return -1;
    }

    @Override // com.ss.android.lark.chat.entity.keyboard.IPlusItem
    /* renamed from: a */
    public void mo31051a(boolean z) {
    }

    @Override // com.ss.android.lark.chat.entity.keyboard.IPlusItem
    /* renamed from: d */
    public boolean mo31056d() {
        return true;
    }

    @Override // com.ss.android.lark.chat.entity.keyboard.IPlusItem
    /* renamed from: e */
    public int mo31057e() {
        return this.f122663d + 100;
    }

    @Override // com.ss.android.lark.chat.entity.keyboard.IPlusItem
    /* renamed from: c */
    public String mo31055c() {
        C48826a aVar = this.f122661b;
        if (aVar != null) {
            if (aVar == null) {
                Intrinsics.throwNpe();
            }
            String b = aVar.mo170571b();
            Intrinsics.checkExpressionValueIsNotNull(b, "gadget!!.name");
            return b;
        }
        C59572d dVar = this.f122662c;
        if (dVar == null) {
            Intrinsics.throwNpe();
        }
        String g = dVar.mo202975g();
        Intrinsics.checkExpressionValueIsNotNull(g, "gadgetShortItem!!.name");
        return g;
    }

    @Override // com.ss.android.lark.chat.entity.keyboard.IPlusItem
    /* renamed from: b */
    public IPlusItem.IconUrlInfo mo31053b() {
        IPlusItem.IconUrlInfo bVar;
        AbstractC48793a d = OpenPlatformModule.m192198d();
        Intrinsics.checkExpressionValueIsNotNull(d, "OpenPlatformModule.getDependency()");
        int dp2px = UIUtils.dp2px(d.getContext(), 40.0f);
        AbstractC48793a d2 = OpenPlatformModule.m192198d();
        Intrinsics.checkExpressionValueIsNotNull(d2, "OpenPlatformModule.getDependency()");
        int dp2px2 = UIUtils.dp2px(d2.getContext(), 40.0f);
        C48826a aVar = this.f122661b;
        if (aVar != null) {
            C48835a aVar2 = this.f122664e;
            if (aVar == null) {
                Intrinsics.throwNpe();
            }
            String a = aVar2.mo170619a(aVar.mo170572c(), dp2px, dp2px2);
            Intrinsics.checkExpressionValueIsNotNull(a, "gadgetManager.getImageUr…l, iconWidth, iconHeight)");
            bVar = new IPlusItem.IconUrlInfo(a);
        } else {
            C59572d dVar = this.f122662c;
            if (dVar == null) {
                Intrinsics.throwNpe();
            }
            Icon h = dVar.mo202976h();
            Intrinsics.checkExpressionValueIsNotNull(h, "gadgetShortItem!!.icon");
            String key = h.getKey();
            Intrinsics.checkExpressionValueIsNotNull(key, "gadgetShortItem!!.icon.key");
            C59572d dVar2 = this.f122662c;
            if (dVar2 == null) {
                Intrinsics.throwNpe();
            }
            Icon h2 = dVar2.mo202976h();
            Intrinsics.checkExpressionValueIsNotNull(h2, "gadgetShortItem!!.icon");
            bVar = new IPlusItem.IconUrlInfo(key, h2.getFsUnit());
        }
        return bVar;
    }

    @Override // com.ss.android.lark.chat.entity.keyboard.IPlusItem
    /* renamed from: b */
    public void mo31054b(boolean z) {
        IPlusItem.C33976a.m131689a(this, z);
    }

    @Override // com.ss.android.lark.chat.entity.keyboard.IPlusItem
    /* renamed from: a */
    public void mo31050a(ISupportForItem cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "host");
        this.f122660a = new WeakReference<>(cVar);
    }

    @Override // com.ss.android.lark.chat.entity.keyboard.IPlusItem
    /* renamed from: a */
    public void mo31049a(View view) {
        String str;
        String str2;
        String str3;
        Intrinsics.checkParameterIsNotNull(view, "view");
        C48826a aVar = this.f122661b;
        if (aVar != null) {
            if (aVar == null) {
                Intrinsics.throwNpe();
            }
            str = aVar.mo170570a();
        } else {
            C59572d dVar = this.f122662c;
            if (dVar == null) {
                Intrinsics.throwNpe();
            }
            str = dVar.mo202974f();
        }
        C48826a aVar2 = this.f122661b;
        if (aVar2 != null) {
            if (aVar2 == null) {
                Intrinsics.throwNpe();
            }
            str2 = aVar2.mo170573d();
        } else {
            C59572d dVar2 = this.f122662c;
            if (dVar2 == null) {
                Intrinsics.throwNpe();
            }
            str2 = dVar2.mo202977i();
        }
        if (this.f122661b != null) {
            str3 = null;
        } else {
            C59572d dVar3 = this.f122662c;
            if (dVar3 == null) {
                Intrinsics.throwNpe();
            }
            str3 = dVar3.mo202970b();
        }
        C59549f.m231040a(this.f122664e.mo170618a(), false, str);
        this.f122664e.mo170622a(view.getContext(), str, str2, str3);
        WeakReference<ISupportForItem> weakReference = this.f122660a;
        if (weakReference == null) {
            Intrinsics.throwUninitializedPropertyAccessException("host");
        }
        ISupportForItem cVar = weakReference.get();
        if (cVar != null) {
            cVar.mo124326a();
        }
    }

    public GadgetPlusItem(int i, C48835a aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "gadgetManager");
        this.f122663d = i;
        this.f122664e = aVar;
    }

    @Override // com.ss.android.lark.chat.entity.keyboard.IPlusItem
    /* renamed from: a */
    public boolean mo31052a(Intent intent, int i) {
        Intrinsics.checkParameterIsNotNull(intent, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        return IPlusItem.C33976a.m131690a(this, intent, i);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public GadgetPlusItem(int i, C48835a aVar, C48826a aVar2) {
        this(i, aVar);
        Intrinsics.checkParameterIsNotNull(aVar, "gadgetManager");
        Intrinsics.checkParameterIsNotNull(aVar2, "gadget");
        this.f122661b = aVar2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public GadgetPlusItem(int i, C48835a aVar, C59572d dVar) {
        this(i, aVar);
        Intrinsics.checkParameterIsNotNull(aVar, "gadgetManager");
        Intrinsics.checkParameterIsNotNull(dVar, "gadgetShortItem");
        this.f122662c = dVar;
    }
}
