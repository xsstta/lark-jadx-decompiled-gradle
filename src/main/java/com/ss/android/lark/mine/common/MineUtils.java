package com.ss.android.lark.mine.common;

import com.ss.android.lark.mine.C45421b;
import com.ss.android.lark.mine.p2270a.AbstractC45399a;
import com.ss.android.lark.util.share_preference.UserSP;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/ss/android/lark/mine/common/MineUtils;", "", "()V", "Companion", "core_mine_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mine.common.b */
public final class MineUtils {

    /* renamed from: a */
    public static final Companion f114995a = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\f\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006J\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ\u000e\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0010¨\u0006\u0011"}, d2 = {"Lcom/ss/android/lark/mine/common/MineUtils$Companion;", "", "()V", "getLogFile", "", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Ljava/io/File;", "getUserSp", "Lcom/ss/android/lark/util/share_preference/UserSP;", "isChineseWord", "", "charSequence", "", "isEmojiCharacter", "codePoint", "", "core_mine_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.common.b$a */
    public static final class Companion {
        /* renamed from: a */
        public final boolean mo160280a(char c) {
            return (c == 0 || c == '\t' || c == '\n' || c == '\r' || (' ' <= c && 55295 >= c) || ((57344 <= c && 65533 >= c) || (0 <= c && 65535 >= c))) ? false : true;
        }

        private Companion() {
        }

        /* renamed from: a */
        public final UserSP mo160279a() {
            AbstractC45399a a = C45421b.m180420a();
            Intrinsics.checkExpressionValueIsNotNull(a, "MineModule.getDependency()");
            AbstractC45399a.AbstractC45410k q = a.mo133458q();
            Intrinsics.checkExpressionValueIsNotNull(q, "MineModule.getDependency().loginDependency");
            UserSP userSPById = UserSP.getUserSPById(q.mo133504e());
            if (userSPById != null) {
                return userSPById;
            }
            UserSP instance = UserSP.getInstance();
            Intrinsics.checkExpressionValueIsNotNull(instance, "UserSP.getInstance()");
            return instance;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final boolean mo160281a(CharSequence charSequence) {
            Intrinsics.checkParameterIsNotNull(charSequence, "charSequence");
            return Pattern.matches("[\\u4e00-\\u9fa5]", charSequence);
        }
    }
}
