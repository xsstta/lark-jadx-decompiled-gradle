package com.ss.android.lark.chatbase.keyboard;

import android.app.Activity;
import android.content.Intent;
import android.preference.PreferenceManager;
import android.widget.AutoCompleteTextView;
import com.google.firebase.messaging.Constants;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.biz.im.api.ChatterNameDisplayRule;
import com.ss.android.lark.chat.api.service.p1600b.C32832c;
import com.ss.android.lark.chat.entity.chatter.ChatChatter;
import com.ss.android.lark.dependency.AbstractC36474h;
import com.ss.android.lark.dependency.AbstractC36507u;
import com.ss.android.lark.keyboard.plugin.tool.at.IAtDependency;
import com.ss.android.lark.statistics.perf.PerfChatPerformanceMonitor;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ \u0010\f\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0007H\u0016J\u0018\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J\u000e\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0007J \u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\u0010\u0010\u001e\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\rH\u0016J\b\u0010\u001f\u001a\u00020\u0016H\u0016J\u000e\u0010 \u001a\u00020\u00162\u0006\u0010\u0004\u001a\u00020\u0005R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lcom/ss/android/lark/chatbase/keyboard/AtKBPluginDependency;", "Lcom/ss/android/lark/keyboard/plugin/tool/at/IAtDependency;", "activity", "Landroid/app/Activity;", "chatId", "", "isP2pChat", "", "(Landroid/app/Activity;Ljava/lang/String;Z)V", "mGroupMemberManagerDependency", "Lcom/ss/android/lark/dependency/IGroupMemberManageDependency;", "mInterruptAtAll", "getAtInputResultStatus", "", "isClickAtBtn", "isDisableAtFunction", "parseAtSelectorResult", "", "Lcom/ss/android/lark/keyboard/plugin/tool/at/IAtDependency$ChatterInfo;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Landroid/content/Intent;", "setIsInterruptAtAll", "", "isInterrup", "startAtSelectList", "requestCode", "editText", "Landroid/widget/AutoCompleteTextView;", "listener", "Landroid/preference/PreferenceManager$OnActivityResultListener;", "startAtSelector", "stopAtSelectList", "updateCurrentChatId", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chatbase.a.a */
public final class AtKBPluginDependency implements IAtDependency {

    /* renamed from: a */
    private final AbstractC36507u f88872a;

    /* renamed from: b */
    private boolean f88873b;

    /* renamed from: c */
    private final Activity f88874c;

    /* renamed from: d */
    private String f88875d;

    /* renamed from: e */
    private final boolean f88876e;

    @Override // com.ss.android.lark.keyboard.plugin.tool.at.IAtDependency
    /* renamed from: a */
    public void mo127066a() {
        this.f88872a.mo134717b();
    }

    /* renamed from: a */
    public final void mo127070a(boolean z) {
        this.f88873b = z;
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.at.IAtDependency
    /* renamed from: a */
    public void mo127067a(int i) {
        PerfChatPerformanceMonitor.m213455a(7);
        this.f88872a.mo134714a(this.f88874c, this.f88875d, Boolean.valueOf(this.f88873b), i);
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.at.IAtDependency
    /* renamed from: a */
    public List<IAtDependency.ChatterInfo> mo127065a(Intent intent) {
        Serializable serializable;
        ChatterNameDisplayRule chatterNameDisplayRule;
        if (intent != null) {
            serializable = intent.getSerializableExtra("chatters_info");
        } else {
            serializable = null;
        }
        if (serializable != null) {
            List<ChatChatter> list = (List) serializable;
            C32832c a = C32832c.m126312a();
            if (this.f88876e) {
                chatterNameDisplayRule = ChatterNameDisplayRule.ALIAS_NAME;
            } else {
                chatterNameDisplayRule = ChatterNameDisplayRule.NICKNAME_ALIAS_NAME;
            }
            ArrayList arrayList = new ArrayList();
            for (ChatChatter chatChatter : list) {
                String a2 = a.mo121121a(chatChatter, chatterNameDisplayRule);
                String id = chatChatter.getId();
                Intrinsics.checkExpressionValueIsNotNull(id, "chatter.getId()");
                Intrinsics.checkExpressionValueIsNotNull(a2, "displayName");
                arrayList.add(new IAtDependency.ChatterInfo(id, a2, chatChatter.isOutChatUser(), chatChatter.isAnonymous()));
            }
            return arrayList;
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.List<com.ss.android.lark.chat.entity.chatter.ChatChatter>");
    }

    /* renamed from: a */
    public final void mo127069a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "chatId");
        this.f88875d = str;
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.at.IAtDependency
    /* renamed from: a */
    public int mo127064a(String str, boolean z, boolean z2) {
        Intrinsics.checkParameterIsNotNull(str, "chatId");
        return this.f88872a.mo134711a(str, z, z2);
    }

    public AtKBPluginDependency(Activity activity, String str, boolean z) {
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        Intrinsics.checkParameterIsNotNull(str, "chatId");
        this.f88874c = activity;
        this.f88875d = str;
        this.f88876e = z;
        AbstractC36474h b = C29990c.m110930b();
        Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
        AbstractC36507u T = b.mo134521T();
        Intrinsics.checkExpressionValueIsNotNull(T, "ChatModuleInstanceHolder…oupMemberManageDependency");
        this.f88872a = T;
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.at.IAtDependency
    /* renamed from: a */
    public void mo127068a(int i, AutoCompleteTextView autoCompleteTextView, PreferenceManager.OnActivityResultListener onActivityResultListener) {
        Intrinsics.checkParameterIsNotNull(autoCompleteTextView, "editText");
        Intrinsics.checkParameterIsNotNull(onActivityResultListener, "listener");
        this.f88872a.mo134712a(i, this.f88875d, this.f88873b, autoCompleteTextView, onActivityResultListener);
    }
}
