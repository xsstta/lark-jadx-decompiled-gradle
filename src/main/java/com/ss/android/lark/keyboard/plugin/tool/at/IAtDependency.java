package com.ss.android.lark.keyboard.plugin.tool.at;

import android.content.Intent;
import android.preference.PreferenceManager;
import android.widget.AutoCompleteTextView;
import com.bytedance.ee.bear.document.tips.BottomDialog;
import com.google.firebase.messaging.Constants;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0001\u0017J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H&J\u0018\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\u0010\f\u001a\u0004\u0018\u00010\rH&J \u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H&J\u0010\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0003H&J\b\u0010\u0016\u001a\u00020\u000fH&¨\u0006\u0018"}, d2 = {"Lcom/ss/android/lark/keyboard/plugin/tool/at/IAtDependency;", "", "getAtInputResultStatus", "", "chatId", "", "isClickAtBtn", "", "isDisableAtFunction", "parseAtSelectorResult", "", "Lcom/ss/android/lark/keyboard/plugin/tool/at/IAtDependency$ChatterInfo;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Landroid/content/Intent;", "startAtSelectList", "", "requestCode", "editText", "Landroid/widget/AutoCompleteTextView;", "listener", "Landroid/preference/PreferenceManager$OnActivityResultListener;", "startAtSelector", "stopAtSelectList", "ChatterInfo", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.keyboard.plugin.tool.b.b */
public interface IAtDependency {
    /* renamed from: a */
    int mo127064a(String str, boolean z, boolean z2);

    /* renamed from: a */
    List<ChatterInfo> mo127065a(Intent intent);

    /* renamed from: a */
    void mo127066a();

    /* renamed from: a */
    void mo127067a(int i);

    /* renamed from: a */
    void mo127068a(int i, AutoCompleteTextView autoCompleteTextView, PreferenceManager.OnActivityResultListener onActivityResultListener);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0002\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J1\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/ss/android/lark/keyboard/plugin/tool/at/IAtDependency$ChatterInfo;", "", BottomDialog.f17198f, "", "displayName", "isOutChatUser", "", "isAnonymous", "(Ljava/lang/String;Ljava/lang/String;ZZ)V", "getChatterId", "()Ljava/lang/String;", "getDisplayName", "()Z", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.tool.b.b$a */
    public static final class ChatterInfo {

        /* renamed from: a */
        private final String f103758a;

        /* renamed from: b */
        private final String f103759b;

        /* renamed from: c */
        private final boolean f103760c;

        /* renamed from: d */
        private final boolean f103761d;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ChatterInfo)) {
                return false;
            }
            ChatterInfo aVar = (ChatterInfo) obj;
            return Intrinsics.areEqual(this.f103758a, aVar.f103758a) && Intrinsics.areEqual(this.f103759b, aVar.f103759b) && this.f103760c == aVar.f103760c && this.f103761d == aVar.f103761d;
        }

        public int hashCode() {
            String str = this.f103758a;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.f103759b;
            if (str2 != null) {
                i = str2.hashCode();
            }
            int i2 = (hashCode + i) * 31;
            boolean z = this.f103760c;
            int i3 = 1;
            if (z) {
                z = true;
            }
            int i4 = z ? 1 : 0;
            int i5 = z ? 1 : 0;
            int i6 = z ? 1 : 0;
            int i7 = (i2 + i4) * 31;
            boolean z2 = this.f103761d;
            if (!z2) {
                i3 = z2 ? 1 : 0;
            }
            return i7 + i3;
        }

        public String toString() {
            return "ChatterInfo(chatterId=" + this.f103758a + ", displayName=" + this.f103759b + ", isOutChatUser=" + this.f103760c + ", isAnonymous=" + this.f103761d + ")";
        }

        /* renamed from: a */
        public final String mo147390a() {
            return this.f103758a;
        }

        /* renamed from: b */
        public final String mo147391b() {
            return this.f103759b;
        }

        /* renamed from: c */
        public final boolean mo147392c() {
            return this.f103760c;
        }

        /* renamed from: d */
        public final boolean mo147393d() {
            return this.f103761d;
        }

        public ChatterInfo(String str, String str2, boolean z, boolean z2) {
            Intrinsics.checkParameterIsNotNull(str, BottomDialog.f17198f);
            Intrinsics.checkParameterIsNotNull(str2, "displayName");
            this.f103758a = str;
            this.f103759b = str2;
            this.f103760c = z;
            this.f103761d = z2;
        }
    }
}
