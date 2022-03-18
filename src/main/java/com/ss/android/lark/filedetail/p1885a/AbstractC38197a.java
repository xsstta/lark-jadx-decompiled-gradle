package com.ss.android.lark.filedetail.p1885a;

import android.content.Context;
import android.content.DialogInterface;
import androidx.fragment.app.FragmentActivity;
import com.bytedance.ee.bear.basesdk.api.AbstractC4385i;
import com.bytedance.ee.bear.quoto.FullQuotoConfig;
import com.larksuite.framework.callback.AbstractC25974h;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.biz.im.api.AbstractC29625q;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.favorite.FavoriteMessageInfo;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.filedetail.dto.AbstractC38215b;
import com.ss.android.lark.filedetail.dto.C38212a;
import com.ss.android.lark.filedetail.dto.FileState;
import com.ss.android.lark.filedetail.impl.detail.listener.IPushMessageListener;
import java.util.List;

/* renamed from: com.ss.android.lark.filedetail.a.a */
public interface AbstractC38197a {

    /* renamed from: com.ss.android.lark.filedetail.a.a$a */
    public interface AbstractC38198a {
        /* renamed from: a */
        String mo139593a(int i);

        /* renamed from: a */
        void mo139594a(Context context, int i);

        /* renamed from: a */
        void mo139595a(Context context, String str, DialogInterface.OnDismissListener onDismissListener);

        /* renamed from: a */
        void mo139596a(String str);

        /* renamed from: a */
        boolean mo139597a(String str, boolean z);

        /* renamed from: b */
        void mo139598b(String str);
    }

    /* renamed from: com.ss.android.lark.filedetail.a.a$b */
    public interface AbstractC38199b {
        /* renamed from: a */
        Chat mo139599a(String str);

        /* renamed from: a */
        void mo139600a(Context context, String str, int i);

        /* renamed from: a */
        void mo139601a(Context context, String str, String str2, int i);

        /* renamed from: a */
        void mo139602a(List<String> list, IGetDataCallback<List<Message>> iGetDataCallback);

        /* renamed from: b */
        Message mo139603b(String str);

        /* renamed from: c */
        Chat mo139604c(String str);
    }

    /* renamed from: com.ss.android.lark.filedetail.a.a$c */
    public interface AbstractC38200c {
        /* renamed from: a */
        int mo139605a(String str);

        /* renamed from: a */
        void mo139606a(Context context, String str, String str2, String str3, int i, int i2, String str4, String str5, IGetDataCallback<String> iGetDataCallback, AbstractC25974h hVar);

        /* renamed from: a */
        void mo139607a(Context context, String str, String str2, String str3, IGetDataCallback<String> iGetDataCallback, AbstractC25974h hVar);

        /* renamed from: a */
        void mo139608a(String str, String str2);

        /* renamed from: a */
        void mo139609a(String str, String str2, int i, int i2, IGetDataCallback<FileState> iGetDataCallback);

        /* renamed from: a */
        void mo139610a(String str, String str2, int i, IGetDataCallback<FileState> iGetDataCallback);

        /* renamed from: a */
        void mo139611a(String str, String str2, IGetDataCallback<Boolean> iGetDataCallback);

        /* renamed from: a */
        void mo139612a(String str, String str2, String str3, int i);

        /* renamed from: a */
        void mo139613a(String str, String str2, String str3, int i, IGetDataCallback<Boolean> iGetDataCallback);

        /* renamed from: b */
        String mo139614b(String str);
    }

    /* renamed from: com.ss.android.lark.filedetail.a.a$d */
    public interface AbstractC38201d {
        /* renamed from: a */
        int mo139617a();

        /* renamed from: a */
        int mo139618a(Context context);

        /* renamed from: a */
        void mo139619a(C38212a aVar);

        /* renamed from: a */
        void mo139620a(String str, String str2);
    }

    /* renamed from: com.ss.android.lark.filedetail.a.a$e */
    public interface AbstractC38202e {
        /* renamed from: a */
        void mo139621a(String str, String str2, String str3, Message.SourceType sourceType, IGetDataCallback<String> iGetDataCallback);
    }

    /* renamed from: com.ss.android.lark.filedetail.a.a$f */
    public interface AbstractC38203f {
        /* renamed from: a */
        void mo139622a(List<String> list, IGetDataCallback<List<FavoriteMessageInfo>> iGetDataCallback);
    }

    /* renamed from: com.ss.android.lark.filedetail.a.a$g */
    public interface AbstractC38204g {
        /* renamed from: a */
        boolean mo139623a();

        /* renamed from: b */
        boolean mo139624b();
    }

    /* renamed from: com.ss.android.lark.filedetail.a.a$h */
    public interface AbstractC38205h {
        /* renamed from: a */
        void mo139625a(Context context, FavoriteMessageInfo favoriteMessageInfo, int i);

        /* renamed from: a */
        void mo139626a(Context context, Message message, String str);

        /* renamed from: a */
        void mo139627a(Context context, String str, String str2, long j, boolean z, String str3);
    }

    /* renamed from: com.ss.android.lark.filedetail.a.a$i */
    public interface AbstractC38206i {
        /* renamed from: a */
        void mo139628a(String str, String str2, IPushMessageListener aVar);

        /* renamed from: b */
        void mo139629b(String str, String str2, IPushMessageListener aVar);
    }

    /* renamed from: com.ss.android.lark.filedetail.a.a$j */
    public interface AbstractC38207j {
        /* renamed from: a */
        void mo139630a(Context context, String str);
    }

    void addListenerToDriveSaveStateEventPush(AbstractC29625q qVar);

    void addListenerToNetworkTypeDispatcher(AbstractC38215b bVar);

    void checkAndInitDoc();

    AbstractC38198a getAuditDependency();

    AbstractC38199b getChatDependency();

    Context getContext();

    AbstractC38200c getDownloadDependency();

    AbstractC38201d getDownloadFileMonitorDependency();

    AbstractC38202e getDriveDependency();

    AbstractC4385i getDriveSdkWrapper();

    AbstractC38203f getFavoriteDependency();

    AbstractC38204g getFeatureConfigDependency();

    AbstractC38205h getForwardDependency();

    AbstractC38206i getPushDependency();

    AbstractC38207j getSearchDependency();

    String getUserId();

    boolean isFeatureGatingCurrentEnable(String str);

    boolean isFeatureGatingEnable(String str);

    boolean isOverseaTenant();

    void removeListenerToDriveSaveStateEventPush(AbstractC29625q qVar);

    void removeListenerToNetworkTypeDispatcher(AbstractC38215b bVar);

    void showFullQuotoDialog(FragmentActivity fragmentActivity, FullQuotoConfig fullQuotoConfig);
}
