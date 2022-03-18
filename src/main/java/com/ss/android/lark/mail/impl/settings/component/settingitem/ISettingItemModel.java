package com.ss.android.lark.mail.impl.settings.component.settingitem;

import androidx.lifecycle.LiveData;
import com.bytedance.lark.pb.email.client.v1.Setting;
import com.larksuite.framework.mvp.IModel;
import com.ss.android.lark.mail.impl.entity.C42093e;
import com.ss.android.lark.mail.impl.entity.C42094f;
import com.ss.android.lark.mail.impl.service.C43350d;

public interface ISettingItemModel extends IModel {
    /* renamed from: a */
    LiveData<Boolean> mo155222a(Function function);

    /* renamed from: a */
    void mo155223a(Setting setting, Function function);

    C43350d aP_();

    /* renamed from: c */
    C42093e mo155225c();

    /* renamed from: d */
    C42094f mo155226d();

    public enum Function {
        FUNC_NOTIFICATION_SWITCH(1),
        FUNC_SMART_INBOX_SWITCH(4),
        FUNC_SMART_REPLY_SWITCH(5),
        FUNC_SIGNATURE_SWITCH(2),
        FUNC_ENT_SIGNATURE_SWITCH(16),
        FUNC_AUTO_REPLY_SWITCH(3),
        FUNC_REPLY_LANGUAGE_SWITCH(10),
        FUNC_UNDO_SWITCH(9),
        FUNC_THREAD_SWITCH(13),
        FUNC_NOTIFICATION_ALL_SWITCH(14);
        
        int settingType;

        public int getSettingType() {
            return this.settingType;
        }

        private Function(int i) {
            this.settingType = i;
        }
    }
}
