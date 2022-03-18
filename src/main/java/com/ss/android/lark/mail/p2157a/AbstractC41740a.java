package com.ss.android.lark.mail.p2157a;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.ImageView;
import com.bytedance.ee.bear.contract.drive.AbstractC5138b;
import com.bytedance.lark.pb.basic.v1.DomainSettings;
import com.ss.android.lark.applink.AbstractC29186b;
import com.ss.android.lark.guidemgr.p1935b.p1937b.C38708a;
import com.ss.android.lark.mail.impl.AbstractC41849c;
import com.ss.android.lark.mail.impl.ExternalUseConstant;
import com.ss.android.lark.mail.impl.entity.DriveFile;
import com.ss.android.lark.mail.impl.entity.DriveFileOperationMask;
import com.ss.android.lark.mail.impl.entity.MailAddress;
import com.ss.android.lark.mail.impl.entity.MailAttachment;
import com.ss.android.lark.mail.impl.entity.TranslationSetting;
import com.ss.android.lark.mail.impl.network.NetworkChangeListener;
import com.ss.android.lark.mail.impl.p2164c.AbstractC41872d;
import com.ss.android.lark.mail.impl.utils.C43853v;
import com.ss.android.lark.notification.export.AbstractNotification;
import com.ss.android.lark.notification.export.entity.Notice;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.ss.android.lark.mail.a.a */
public interface AbstractC41740a {

    /* renamed from: com.ss.android.lark.mail.a.a$a */
    public interface AbstractC41741a {

        /* renamed from: com.ss.android.lark.mail.a.a$a$a */
        public interface AbstractC41742a {
            /* renamed from: a */
            void mo150110a();
        }

        /* renamed from: a */
        void mo144469a(AbstractC41742a aVar);
    }

    /* renamed from: com.ss.android.lark.mail.a.a$b */
    public interface AbstractC41743b {
        /* renamed from: a */
        void mo144454a(AbstractC41849c.AbstractC41852c cVar);

        /* renamed from: a */
        void mo144455a(AbstractC41849c.AbstractC41862m mVar);
    }

    /* renamed from: com.ss.android.lark.mail.a.a$c */
    public interface AbstractC41744c {
        /* renamed from: a */
        int mo144481a();

        /* renamed from: a */
        void mo144482a(Context context, int i);
    }

    /* renamed from: com.ss.android.lark.mail.a.a$d */
    public interface AbstractC41745d {
        /* renamed from: a */
        String mo144445a(String str, int i);

        /* renamed from: a */
        void mo144446a(Context context, String str);

        /* renamed from: a */
        void mo144447a(AbstractC41849c.AbstractC41866q qVar);

        /* renamed from: b */
        MailAddress mo144448b(String str);

        /* renamed from: b */
        void mo144449b(AbstractC41849c.AbstractC41866q qVar);
    }

    /* renamed from: com.ss.android.lark.mail.a.a$e */
    public interface AbstractC41746e {
        /* renamed from: a */
        int mo144474a(String[] strArr);

        /* renamed from: a */
        String mo144475a(Uri uri, String str, String str2, String str3, AbstractC5138b.AbstractC5140b bVar);

        /* renamed from: a */
        String mo144476a(String str, String str2, int i, boolean z, AbstractC5138b.AbstractC5139a aVar);

        /* renamed from: a */
        String mo144477a(String str, String str2, String str3, String str4, int i, String str5, AbstractC5138b.AbstractC5139a aVar);

        /* renamed from: a */
        String mo144478a(String str, String str2, String str3, String str4, AbstractC5138b.AbstractC5140b bVar);

        /* renamed from: a */
        void mo144479a();

        /* renamed from: b */
        int mo144480b(String[] strArr);
    }

    /* renamed from: com.ss.android.lark.mail.a.a$f */
    public interface AbstractC41747f {
        /* renamed from: a */
        boolean mo144467a(String str);

        /* renamed from: b */
        boolean mo144468b(String str);
    }

    /* renamed from: com.ss.android.lark.mail.a.a$g */
    public interface AbstractC41748g {
        /* renamed from: a */
        String mo144472a();

        /* renamed from: a */
        void mo144473a(Activity activity, int i, long j, String str, String str2);
    }

    /* renamed from: com.ss.android.lark.mail.a.a$h */
    public interface AbstractC41749h {
        /* renamed from: a */
        void mo144483a(MailAttachment mailAttachment, String str);
    }

    /* renamed from: com.ss.android.lark.mail.a.a$i */
    public interface AbstractC41750i {
        /* renamed from: a */
        int mo144484a(String str, String str2);
    }

    /* renamed from: com.ss.android.lark.mail.a.a$j */
    public interface AbstractC41751j {
        /* renamed from: a */
        long mo144456a();

        /* renamed from: b */
        String mo144457b();

        /* renamed from: c */
        String mo144458c();

        /* renamed from: d */
        String mo144459d();

        /* renamed from: e */
        String mo144460e();
    }

    /* renamed from: com.ss.android.lark.mail.a.a$k */
    public interface AbstractC41752k {
        /* renamed from: a */
        void mo144461a(List<String> list);

        /* renamed from: a */
        boolean mo144462a(String str);

        /* renamed from: a */
        boolean mo144463a(String str, C38708a aVar);

        /* renamed from: b */
        boolean mo144464b(String str);
    }

    /* renamed from: com.ss.android.lark.mail.a.a$l */
    public interface AbstractC41753l {
        /* renamed from: a */
        void mo144470a(Context context, String str, ImageView imageView, int i, int i2);

        /* renamed from: a */
        void mo144471a(Context context, String str, String str2, ImageView imageView, int i, int i2);
    }

    /* renamed from: com.ss.android.lark.mail.a.a$m */
    public interface AbstractC41754m {
        /* renamed from: a */
        Map<String, AbstractC29186b> mo150207a(Context context);
    }

    /* renamed from: com.ss.android.lark.mail.a.a$n */
    public interface AbstractC41755n {
        /* renamed from: a */
        void mo144488a();

        /* renamed from: a */
        boolean mo144489a(String str);

        /* renamed from: b */
        Intent mo144490b();

        /* renamed from: c */
        void mo144491c();

        /* renamed from: d */
        void mo144492d();

        /* renamed from: e */
        void mo144493e();
    }

    /* renamed from: com.ss.android.lark.mail.a.a$o */
    public interface AbstractC41756o {
        /* renamed from: a */
        void mo144494a(String str, JSONObject jSONObject);

        /* renamed from: b */
        void mo144495b(String str, JSONObject jSONObject);

        /* renamed from: c */
        void mo144496c(String str, JSONObject jSONObject);
    }

    /* renamed from: com.ss.android.lark.mail.a.a$p */
    public interface AbstractC41757p {
        /* renamed from: a */
        AbstractNotification.AbstractC48496c<Notice> mo144442a();

        /* renamed from: a */
        String mo144443a(int i);
    }

    /* renamed from: com.ss.android.lark.mail.a.a$q */
    public interface AbstractC41758q {
        /* renamed from: a */
        void mo144466a(String str, String str2, String str3, String str4);
    }

    /* renamed from: com.ss.android.lark.mail.a.a$r */
    public interface AbstractC41759r {
        /* renamed from: a */
        void mo144450a(AbstractC41872d dVar);

        /* renamed from: a */
        boolean mo144451a();

        /* renamed from: b */
        void mo144452b(AbstractC41872d dVar);

        /* renamed from: b */
        boolean mo144453b();
    }

    /* renamed from: com.ss.android.lark.mail.a.a$s */
    public interface AbstractC41760s {
        /* renamed from: a */
        NetworkChangeListener.NetworkLevel mo144485a();

        /* renamed from: a */
        void mo144486a(NetworkChangeListener networkChangeListener);

        /* renamed from: b */
        void mo144487b(NetworkChangeListener networkChangeListener);
    }

    void forwardMailToChat(Context context, int i, Bundle bundle, int i2, String str);

    AbstractC41741a getAccountDependency();

    Context getAppContext();

    AbstractC41743b getAppLifecycleDependency();

    AbstractC41744c getBadgeDependency();

    AbstractC41745d getChatDependency();

    String getDomain();

    List<String> getDomains(DomainSettings.Alias alias);

    AbstractC41746e getDriveUploadDownProxy();

    int getEnv();

    ExternalUseConstant getExternalUseConstant();

    AbstractC41747f getFeatureGatingDependency();

    AbstractC41748g getFilePickerDependency();

    AbstractC41749h getFileReaderDependency();

    AbstractC41750i getFileUtilDependency();

    String getForwardModuleAdditionNoteKey();

    AbstractC41751j getGeckoDependency();

    AbstractC41752k getGuideDependency();

    AbstractC41753l getImageDependency();

    Locale getLocale();

    AbstractC41755n getMainDependency();

    AbstractC41756o getMetricsDependency();

    AbstractC41757p getNotificationDependency();

    AbstractC41758q getProfileDependency();

    AbstractC41759r getSettingDependency();

    String getTenantId();

    String getTenantName();

    String getUA();

    String getUserId();

    String getUserS();

    AbstractC41760s getWschannelDependency();

    boolean isAppRealForeground();

    boolean isCNEnv();

    boolean isDebug();

    boolean isGooglePlay();

    boolean isLeanModeOpen();

    boolean isSmartComposeEnabled();

    boolean isUsingTTWebView();

    void observeTranslationSetting(C43853v.AbstractC43859a aVar);

    void onCreateWebView(WebView webView, String str);

    void openCalendar(Context context, String str, String str2, long j);

    boolean openPrivacyPolicy(Context context);

    boolean openUserProtocol(Context context);

    TranslationSetting syncTranslationSetting();

    boolean tryOpenUrlWithAppBrowser(Context context, String str);

    boolean tryOpenUrlWithDoc(String str);

    boolean tryOpenUrlWithLittleApp(String str);

    boolean viewByDrive(Bundle bundle);

    boolean viewByDrive(String str, List<DriveFile> list, DriveFileOperationMask driveFileOperationMask, HashMap hashMap, AbstractC41849c.AbstractC41850a aVar);

    void viewLocalFileByDrive(Context context, String str);
}
