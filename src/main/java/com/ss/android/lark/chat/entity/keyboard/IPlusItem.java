package com.ss.android.lark.chat.entity.keyboard;

import android.content.Intent;
import android.view.View;
import com.google.firebase.messaging.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u001aJ\b\u0010\u0002\u001a\u00020\u0003H'J\n\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\b\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\u0003H&J\b\u0010\t\u001a\u00020\nH&J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0003H\u0016J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H&J\u0010\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\nH\u0016J\u0010\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\nH&J\u0010\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u0019H&¨\u0006\u001b"}, d2 = {"Lcom/ss/android/lark/chat/entity/keyboard/IPlusItem;", "", "getIconId", "", "getIconUrlInfo", "Lcom/ss/android/lark/chat/entity/keyboard/IPlusItem$IconUrlInfo;", "getName", "", "getSortLevel", "isVisible", "", "onActivityResult", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Landroid/content/Intent;", "requestCode", "onClick", "", "view", "Landroid/view/View;", "onPlusItemSelected", "firstShow", "onReplyModeChanged", "replyMode", "setPlusHotPlugin", "host", "Lcom/ss/android/lark/chat/entity/keyboard/ISupportForItem;", "IconUrlInfo", "im_chat_chat-export_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.entity.b.b */
public interface IPlusItem {

    @Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.entity.b.b$a */
    public static final class C33976a {
        /* renamed from: a */
        public static void m131689a(IPlusItem bVar, boolean z) {
        }

        /* renamed from: a */
        public static boolean m131690a(IPlusItem bVar, Intent intent, int i) {
            Intrinsics.checkParameterIsNotNull(intent, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            return false;
        }
    }

    /* renamed from: a */
    int mo31048a();

    /* renamed from: a */
    void mo31049a(View view);

    /* renamed from: a */
    void mo31050a(ISupportForItem cVar);

    /* renamed from: a */
    void mo31051a(boolean z);

    /* renamed from: a */
    boolean mo31052a(Intent intent, int i);

    /* renamed from: b */
    IconUrlInfo mo31053b();

    /* renamed from: b */
    void mo31054b(boolean z);

    /* renamed from: c */
    String mo31055c();

    /* renamed from: d */
    boolean mo31056d();

    /* renamed from: e */
    int mo31057e();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0007R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u0004R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\t\"\u0004\b\f\u0010\u0004R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\t\"\u0004\b\u000e\u0010\u0004¨\u0006\u000f"}, d2 = {"Lcom/ss/android/lark/chat/entity/keyboard/IPlusItem$IconUrlInfo;", "", "iconUrl", "", "(Ljava/lang/String;)V", "avatarKey", "fsUnit", "(Ljava/lang/String;Ljava/lang/String;)V", "getAvatarKey", "()Ljava/lang/String;", "setAvatarKey", "getFsUnit", "setFsUnit", "getIconUrl", "setIconUrl", "im_chat_chat-export_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.entity.b.b$b */
    public static final class IconUrlInfo {

        /* renamed from: a */
        private String f87717a;

        /* renamed from: b */
        private String f87718b;

        /* renamed from: c */
        private String f87719c;

        /* renamed from: a */
        public final String mo124323a() {
            return this.f87717a;
        }

        /* renamed from: b */
        public final String mo124324b() {
            return this.f87718b;
        }

        /* renamed from: c */
        public final String mo124325c() {
            return this.f87719c;
        }

        public IconUrlInfo(String str) {
            Intrinsics.checkParameterIsNotNull(str, "iconUrl");
            this.f87717a = str;
        }

        public IconUrlInfo(String str, String str2) {
            Intrinsics.checkParameterIsNotNull(str, "avatarKey");
            this.f87718b = str;
            this.f87719c = str2;
        }
    }
}
