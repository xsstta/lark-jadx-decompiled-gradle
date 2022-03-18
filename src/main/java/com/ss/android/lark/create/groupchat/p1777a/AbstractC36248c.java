package com.ss.android.lark.create.groupchat.p1777a;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.bytedance.lark.pb.basic.v1.LocationContent;
import com.bytedance.lark.pb.basic.v1.PickEntities;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.chat.api.AbstractC32812c;
import com.ss.android.lark.chat.api.IChatParser;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chat.PickChatEntity;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.contact.entity.Contact;
import com.ss.android.lark.create.groupchat.dto.C36260c;
import com.ss.android.lark.create.groupchat.dto.SelectedData;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.lark.create.groupchat.a.c */
public interface AbstractC36248c {

    /* renamed from: com.ss.android.lark.create.groupchat.a.c$a */
    public interface AbstractC36249a {
        /* renamed from: a */
        boolean mo133719a();

        /* renamed from: a */
        boolean mo133720a(List<String> list);

        /* renamed from: b */
        String mo133721b();

        /* renamed from: c */
        boolean mo133722c();
    }

    /* renamed from: com.ss.android.lark.create.groupchat.a.c$b */
    public interface AbstractC36250b {
        /* renamed from: a */
        int mo133723a();

        /* renamed from: a */
        boolean mo133724a(String str);
    }

    /* renamed from: com.ss.android.lark.create.groupchat.a.c$c */
    public interface AbstractC36251c {
        /* renamed from: a */
        int mo133725a();
    }

    /* renamed from: com.ss.android.lark.create.groupchat.a.c$d */
    public interface AbstractC36252d {
        /* renamed from: a */
        IChatParser mo133726a();

        /* renamed from: a */
        Chat mo133727a(String str);

        /* renamed from: a */
        List<PickEntities> mo133728a(Collection<PickChatEntity> collection);

        /* renamed from: a */
        void mo133729a(Context context, String str);

        /* renamed from: a */
        void mo133730a(Context context, String str, List<Contact> list);

        /* renamed from: a */
        void mo133731a(String str, IGetDataCallback<Boolean> iGetDataCallback);

        /* renamed from: a */
        void mo133732a(boolean z, String str);

        /* renamed from: b */
        Chat mo133733b(String str);

        /* renamed from: b */
        void mo133734b(Context context, String str);

        /* renamed from: c */
        void mo133735c(String str);
    }

    /* renamed from: com.ss.android.lark.create.groupchat.a.c$e */
    public interface AbstractC36253e {
        /* renamed from: a */
        Map<String, Chatter> mo133736a(List<String> list);
    }

    /* renamed from: com.ss.android.lark.create.groupchat.a.c$f */
    public interface AbstractC36254f {
        /* renamed from: a */
        List<SelectedData> mo133737a(Intent intent);

        /* renamed from: a */
        void mo133738a(Activity activity, List<SelectedData> list, int i);

        /* renamed from: a */
        void mo133739a(Fragment fragment, List<SelectedData> list, int i);
    }

    /* renamed from: com.ss.android.lark.create.groupchat.a.c$g */
    public interface AbstractC36255g {
        /* renamed from: a */
        void mo133740a(String str, boolean z);
    }

    /* renamed from: com.ss.android.lark.create.groupchat.a.c$h */
    public interface AbstractC36256h {
        /* renamed from: a */
        void mo133741a(Context context, String str, Bundle bundle);
    }

    /* renamed from: com.ss.android.lark.create.groupchat.a.c$i */
    public interface AbstractC36257i {
        void getLocation(Context context, IGetDataCallback<LocationContent> iGetDataCallback);
    }

    /* renamed from: com.ss.android.lark.create.groupchat.a.c$j */
    public interface AbstractC36258j {
        /* renamed from: a */
        void mo133743a(String str, String str2, List<C36260c> list, IGetDataCallback<Void> iGetDataCallback);
    }

    /* renamed from: com.ss.android.lark.create.groupchat.a.c$k */
    public interface AbstractC36259k {
        /* renamed from: a */
        boolean mo133744a();
    }

    AbstractC36249a getAccountDependency();

    AbstractC36250b getAppConfigDependency();

    AbstractC36251c getAuditDependency();

    AbstractC36252d getChatDependency();

    AbstractC36253e getChatterDependency();

    AbstractC36254f getContactDependency();

    AbstractC36255g getGuideDependency();

    AbstractC36256h getMainDependency();

    AbstractC36257i getMapDependency();

    AbstractC32812c getPerfEnterChatMonitor();

    AbstractC36258j getSearchDependency();

    AbstractC36259k getSettingDependency();

    boolean isAllowSecret();

    boolean isFeatureGatingEnable(String str);

    boolean isSecretChatEnable();
}
