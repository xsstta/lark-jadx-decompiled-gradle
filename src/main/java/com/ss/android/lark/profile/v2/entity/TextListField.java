package com.ss.android.lark.profile.v2.entity;

import com.google.firebase.messaging.Constants;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u000b2\u00020\u00012\u00020\u0002:\u0001\u000bB\u0005¢\u0006\u0002\u0010\u0003R\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/profile/v2/entity/TextListField;", "Lcom/ss/android/lark/profile/v2/entity/BaseField;", "Ljava/io/Serializable;", "()V", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "Lcom/ss/android/lark/profile/v2/entity/TextField;", "getData", "()Ljava/util/List;", "setData", "(Ljava/util/List;)V", "Companion", "core_profile_profile-entity_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class TextListField extends BaseField implements Serializable {
    public static final Companion Companion = new Companion(null);
    private static final long serialVersionUID = -90018355;
    private List<TextField> data = new ArrayList();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/profile/v2/entity/TextListField$Companion;", "", "()V", "serialVersionUID", "", "core_profile_profile-entity_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.v2.entity.TextListField$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final List<TextField> getData() {
        return this.data;
    }

    public final void setData(List<TextField> list) {
        this.data = list;
    }
}
