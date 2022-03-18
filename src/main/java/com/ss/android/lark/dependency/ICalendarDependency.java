package com.ss.android.lark.dependency;

import android.app.Activity;
import android.content.Context;
import com.bytedance.lark.pb.basic.v1.C14928Entity;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.p1663c.AbstractC33977a;
import com.ss.android.lark.chat.entity.p1663c.AbstractC33979c;
import com.ss.android.lark.chat.export.entity.message.Content;
import java.util.ArrayList;
import java.util.List;

public interface ICalendarDependency {
    /* renamed from: a */
    AbstractC33977a mo134335a(Activity activity, String str, String str2, AbstractC33979c cVar);

    /* renamed from: a */
    Content mo134336a(com.bytedance.lark.pb.basic.v1.Content content);

    /* renamed from: a */
    Content mo134337a(C14928Entity entity, com.bytedance.lark.pb.basic.v1.Content content);

    /* renamed from: a */
    String mo134338a(Context context, Message message);

    /* renamed from: a */
    void mo134339a(Activity activity, String str, boolean z, long j, long j2, String str2, ArrayList<String> arrayList, boolean z2, Scene scene);

    /* renamed from: a */
    void mo134340a(Context context, String str, List<String> list);

    /* renamed from: a */
    boolean mo134341a(Message message);

    /* renamed from: b */
    Content mo134342b(C14928Entity entity, com.bytedance.lark.pb.basic.v1.Content content);

    /* renamed from: b */
    String mo134343b(Message message);

    /* renamed from: c */
    String mo134344c(Message message);

    /* renamed from: d */
    String mo134345d(Message message);

    public enum Scene {
        EDIT(1),
        FREEBUSY(2);
        
        private int value;

        public int getNumber() {
            return this.value;
        }

        public static Scene valueOf(int i) {
            return forNumber(i);
        }

        public static Scene forNumber(int i) {
            if (i == 1) {
                return EDIT;
            }
            if (i != 2) {
                return FREEBUSY;
            }
            return FREEBUSY;
        }

        private Scene(int i) {
            this.value = i;
        }
    }
}
