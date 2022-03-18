package com.ss.android.lark.openplatform.common;

import android.content.Intent;
import android.view.View;
import com.google.firebase.messaging.Constants;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.keyboard.IPlusItem;
import com.ss.android.lark.chat.entity.keyboard.ISupportForItem;
import com.ss.android.lark.openplatform.plus.AbstractC48842c;
import com.ss.android.lark.utils.UIHelper;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\n\u001a\u00020\u0003H\u0016J\n\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J\b\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u0003H\u0016J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u0018\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0003H\u0016J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\u0010\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u0011H\u0016J\u0010\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u0011H\u0016J\u0010\u0010\u001e\u001a\u00020\u00172\u0006\u0010\u0007\u001a\u00020\tH\u0016R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX.¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lcom/ss/android/lark/openplatform/common/GadgetMorePlusItem;", "Lcom/ss/android/lark/chat/entity/keyboard/IPlusItem;", "index", "", "listener", "Lcom/ss/android/lark/openplatform/plus/PlusMenuGadgetManagerListener;", "(ILcom/ss/android/lark/openplatform/plus/PlusMenuGadgetManagerListener;)V", "host", "Ljava/lang/ref/WeakReference;", "Lcom/ss/android/lark/chat/entity/keyboard/ISupportForItem;", "getIconId", "getIconUrlInfo", "Lcom/ss/android/lark/chat/entity/keyboard/IPlusItem$IconUrlInfo;", "getName", "", "getSortLevel", "isVisible", "", "onActivityResult", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Landroid/content/Intent;", "requestCode", "onClick", "", "view", "Landroid/view/View;", "onPlusItemSelected", "firstShow", "onReplyModeChanged", "replyMode", "setPlusHotPlugin", "Companion", "open-platform_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.openplatform.common.d */
public final class GadgetMorePlusItem implements IPlusItem {

    /* renamed from: a */
    public static final Companion f122656a = new Companion(null);

    /* renamed from: b */
    private WeakReference<ISupportForItem> f122657b;

    /* renamed from: c */
    private final int f122658c;

    /* renamed from: d */
    private final AbstractC48842c f122659d;

    @Override // com.ss.android.lark.chat.entity.keyboard.IPlusItem
    /* renamed from: a */
    public int mo31048a() {
        return R.drawable.webapp_ic_app_more;
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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/openplatform/common/GadgetMorePlusItem$Companion;", "", "()V", "RANGE", "", "REQUEST_CODE", "TAG", "", "open-platform_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.openplatform.common.d$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.ss.android.lark.chat.entity.keyboard.IPlusItem
    /* renamed from: e */
    public int mo31057e() {
        return this.f122658c + 150;
    }

    @Override // com.ss.android.lark.chat.entity.keyboard.IPlusItem
    /* renamed from: c */
    public String mo31055c() {
        String string = UIHelper.getString(R.string.Lark_OpenPlatform_MoreBttn);
        Intrinsics.checkExpressionValueIsNotNull(string, "UIHelper.getString(R.str…rk_OpenPlatform_MoreBttn)");
        return string;
    }

    @Override // com.ss.android.lark.chat.entity.keyboard.IPlusItem
    /* renamed from: b */
    public void mo31054b(boolean z) {
        C48830g.m192397a();
    }

    @Override // com.ss.android.lark.chat.entity.keyboard.IPlusItem
    /* renamed from: a */
    public void mo31050a(ISupportForItem cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "host");
        this.f122657b = new WeakReference<>(cVar);
    }

    @Override // com.ss.android.lark.chat.entity.keyboard.IPlusItem
    /* renamed from: a */
    public void mo31049a(View view) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        this.f122659d.mo170621a(view.getContext(), 250);
        WeakReference<ISupportForItem> weakReference = this.f122657b;
        if (weakReference == null) {
            Intrinsics.throwUninitializedPropertyAccessException("host");
        }
        ISupportForItem cVar = weakReference.get();
        if (cVar != null) {
            cVar.mo124326a();
        }
    }

    public GadgetMorePlusItem(int i, AbstractC48842c cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "listener");
        this.f122658c = i;
        this.f122659d = cVar;
    }

    @Override // com.ss.android.lark.chat.entity.keyboard.IPlusItem
    /* renamed from: a */
    public boolean mo31052a(Intent intent, int i) {
        Intrinsics.checkParameterIsNotNull(intent, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        if (i == 250) {
            return this.f122659d.mo170625a(intent, i);
        }
        return IPlusItem.C33976a.m131690a(this, intent, i);
    }
}
