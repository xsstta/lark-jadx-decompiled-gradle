package com.ss.android.lark.profile.statistics;

import com.ss.android.lark.statistics.extensions.IClickParam;
import com.ss.android.lark.statistics.extensions.IParam;
import com.ss.android.lark.statistics.extensions.ITargetParam;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/profile/statistics/EditAliasExtraParams;", "", "()V", "Click", "Target", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class EditAliasExtraParams {

    /* renamed from: a */
    public static final EditAliasExtraParams f130727a = new EditAliasExtraParams();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\u000f\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005R\u0014\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0013"}, d2 = {"Lcom/ss/android/lark/profile/statistics/EditAliasExtraParams$Click;", "", "Lcom/ss/android/lark/statistics/extensions/IClickParam;", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "PIC_DETAIL", "PIC_ADD", "CANCEL", "PIC_DELETE", "CHANGE", "ALIAS", "DESCRIPTION", "ALIAS_NAME", "PIC_CHANGE", "DELETE", "SAVE", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
    public enum Click implements IClickParam {
        PIC_DETAIL("pic_detail"),
        PIC_ADD("pic_add"),
        CANCEL("cancel"),
        PIC_DELETE("pic_delete"),
        CHANGE("change"),
        ALIAS("alias"),
        DESCRIPTION("description"),
        ALIAS_NAME("alias_name"),
        PIC_CHANGE("pic_change"),
        DELETE("delete"),
        SAVE("save");
        
        private final String value;

        @Override // com.ss.android.lark.statistics.extensions.IParam
        public String getValue() {
            return this.value;
        }

        @Override // com.ss.android.lark.statistics.extensions.IParam
        public String getKey() {
            return IClickParam.C54953a.m213210a(this);
        }

        @Override // com.ss.android.lark.statistics.extensions.IParam
        public JSONObject toJson() {
            return IClickParam.C54953a.m213211b(this);
        }

        @Override // com.ss.android.lark.statistics.extensions.IParam
        public IParam plus(IParam cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "target");
            return IClickParam.C54953a.m213209a(this, cVar);
        }

        private Click(String str) {
            this.value = str;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\u000f\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005R\u0014\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/profile/statistics/EditAliasExtraParams$Target;", "", "Lcom/ss/android/lark/statistics/extensions/ITargetParam;", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "PUBLIC_PICBROWSER_VIEW", "PROFILE_ALIAS_SETTING_VIEW", "PROFILE_MAIN_VIEW", "NONE", "PROFILE_PIC_DETAIL_VIEW", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
    public enum Target implements ITargetParam {
        PUBLIC_PICBROWSER_VIEW("public_picbrowser_view"),
        PROFILE_ALIAS_SETTING_VIEW("profile_alias_setting_view"),
        PROFILE_MAIN_VIEW("profile_main_view"),
        NONE("none"),
        PROFILE_PIC_DETAIL_VIEW("profile_pic_detail_view");
        
        private final String value;

        @Override // com.ss.android.lark.statistics.extensions.IParam
        public String getValue() {
            return this.value;
        }

        @Override // com.ss.android.lark.statistics.extensions.IParam
        public String getKey() {
            return ITargetParam.C54955a.m213215a(this);
        }

        @Override // com.ss.android.lark.statistics.extensions.IParam
        public JSONObject toJson() {
            return ITargetParam.C54955a.m213216b(this);
        }

        @Override // com.ss.android.lark.statistics.extensions.IParam
        public IParam plus(IParam cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "target");
            return ITargetParam.C54955a.m213214a(this, cVar);
        }

        private Target(String str) {
            this.value = str;
        }
    }

    private EditAliasExtraParams() {
    }
}
