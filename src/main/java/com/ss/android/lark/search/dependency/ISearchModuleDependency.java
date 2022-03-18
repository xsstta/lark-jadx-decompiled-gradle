package com.ss.android.lark.search.dependency;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.base.fragment.BaseFragment;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.ChatChatter;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.chat.entity.image.ImageSet;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.message.content.FileContent;
import com.ss.android.lark.desktopmode.p1787a.C36516a;
import com.ss.android.lark.image.entity.Image;
import com.ss.android.lark.member_manage.export.p2253a.AbstractC44896a;
import com.ss.android.lark.search.impl.p2592b.p2594b.AbstractC53342a;
import com.ss.android.lark.search.impl.p2599c.p2602c.AbstractC53363a;
import com.ss.android.lark.searchcommon.constant.SearchCommonConstants;
import com.ss.android.lark.searchcommon.dto.C53893b;
import com.ss.android.lark.searchcommon.dto.SearchImageHistory;
import com.ss.android.lark.searchcommon.dto.SearchResponse;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public interface ISearchModuleDependency {

    public interface ISettingServiceDependency {

        @Retention(RetentionPolicy.SOURCE)
        public @interface TimeFormat {
        }

        /* renamed from: a */
        int mo181819a();

        /* renamed from: a */
        boolean mo181820a(long j);
    }

    /* renamed from: com.ss.android.lark.search.dependency.ISearchModuleDependency$a */
    public interface AbstractC53313a {
        boolean isAppConfigFeatureOn(String str);
    }

    /* renamed from: com.ss.android.lark.search.dependency.ISearchModuleDependency$b */
    public interface AbstractC53314b {
        /* renamed from: a */
        void mo181827a(String str);

        /* renamed from: a */
        boolean mo181828a(String str, boolean z);
    }

    /* renamed from: com.ss.android.lark.search.dependency.ISearchModuleDependency$c */
    public interface AbstractC53315c {
        /* renamed from: a */
        void mo181774a(Context context, String str);

        /* renamed from: b */
        void mo181775b(Context context, String str);

        /* renamed from: c */
        void mo181776c(Context context, String str);
    }

    /* renamed from: com.ss.android.lark.search.dependency.ISearchModuleDependency$d */
    public interface AbstractC53316d {
        /* renamed from: a */
        void mo181821a(Context context, String str, String str2);

        /* renamed from: a */
        void mo181822a(String str, String str2, IGetDataCallback<SearchResponse> iGetDataCallback);

        /* renamed from: a */
        void mo181823a(String str, String str2, Long l, Context context, Long l2, Long l3);
    }

    /* renamed from: com.ss.android.lark.search.dependency.ISearchModuleDependency$e */
    public interface AbstractC53317e {
        /* renamed from: a */
        Chatter mo181777a(String str);

        /* renamed from: a */
        String mo181778a(Chat chat);

        /* renamed from: a */
        String mo181779a(Chatter chatter);

        /* renamed from: a */
        String mo181780a(String str, boolean z);

        /* renamed from: a */
        Map<String, Chat> mo181781a(List<String> list);

        /* renamed from: a */
        void mo181782a(String str, int i);

        /* renamed from: a */
        void mo181783a(String str, IGetDataCallback<Chat> iGetDataCallback);

        /* renamed from: a */
        void mo181784a(String str, String str2, int i);

        /* renamed from: a */
        void mo181785a(String str, String str2, int i, boolean z, IGetDataCallback<SearchImageHistory> iGetDataCallback);

        /* renamed from: a */
        void mo181786a(String str, String str2, IGetDataCallback<Boolean> iGetDataCallback);

        /* renamed from: a */
        void mo181787a(String str, List<String> list, IGetDataCallback<Void> iGetDataCallback);

        /* renamed from: a */
        void mo181789a(List<String> list, IGetDataCallback<List<Message>> iGetDataCallback);

        /* renamed from: b */
        List<ImageSet> mo181790b(String str, String str2, int i);

        /* renamed from: b */
        Map<String, Chatter> mo181791b(List<String> list);

        /* renamed from: b */
        void mo181792b(String str);

        /* renamed from: b */
        void mo181793b(String str, int i);

        /* renamed from: b */
        void mo181794b(String str, IGetDataCallback<Chat> iGetDataCallback);

        /* renamed from: b */
        void mo181796b(List<String> list, IGetDataCallback<Boolean> iGetDataCallback);

        /* renamed from: c */
        List<ImageSet> mo181797c(String str, String str2, int i);

        /* renamed from: c */
        Map<String, Message> mo181798c(List<String> list);

        /* renamed from: c */
        void mo181799c(String str);

        /* renamed from: d */
        void mo181800d(String str);
    }

    /* renamed from: com.ss.android.lark.search.dependency.ISearchModuleDependency$f */
    public interface AbstractC53318f {

        /* renamed from: com.ss.android.lark.search.dependency.ISearchModuleDependency$f$a */
        public interface AbstractC53319a {
            /* renamed from: a */
            void mo181955a(View view, String str);
        }

        void showApplyDialog(Context context, AbstractC53319a aVar);
    }

    /* renamed from: com.ss.android.lark.search.dependency.ISearchModuleDependency$g */
    public interface AbstractC53320g {
        /* renamed from: a */
        boolean mo181829a();
    }

    /* renamed from: com.ss.android.lark.search.dependency.ISearchModuleDependency$h */
    public interface AbstractC53321h {

        /* renamed from: com.ss.android.lark.search.dependency.ISearchModuleDependency$h$a */
        public interface AbstractC53322a {
            /* renamed from: a */
            Fragment mo143225a();

            /* renamed from: a */
            void mo143226a(String str);
        }

        /* renamed from: a */
        int mo181809a(int i);

        /* renamed from: a */
        AbstractC53322a mo181810a(boolean z);
    }

    /* renamed from: com.ss.android.lark.search.dependency.ISearchModuleDependency$i */
    public interface AbstractC53323i {
        /* renamed from: a */
        void mo181826a(Context context, String str, String str2, String str3, int i, String str4, String str5, IGetDataCallback<String> iGetDataCallback);
    }

    /* renamed from: com.ss.android.lark.search.dependency.ISearchModuleDependency$j */
    public interface AbstractC53324j {
        /* renamed from: a */
        List<C53893b> mo181811a();

        /* renamed from: a */
        void mo181813a(Chat chat, String str);

        /* renamed from: a */
        void mo181814a(String str, SearchCommonConstants.FeedType feedType);
    }

    /* renamed from: com.ss.android.lark.search.dependency.ISearchModuleDependency$k */
    public interface AbstractC53325k {
        /* renamed from: a */
        void mo181824a(Context context, C36516a aVar, Chat chat, ArrayList<String> arrayList, int i);

        /* renamed from: b */
        void mo181825b(Context context, C36516a aVar, Chat chat, ArrayList<String> arrayList, int i);
    }

    /* renamed from: com.ss.android.lark.search.dependency.ISearchModuleDependency$l */
    public interface AbstractC53326l {
        /* renamed from: a */
        List<ChatChatter> mo181771a(Intent intent);

        /* renamed from: a */
        void mo181772a(Context context, String str, List<String> list, int i, AbstractC44896a aVar);

        /* renamed from: a */
        void mo181773a(BaseFragment baseFragment, String str, List<String> list, int i);
    }

    /* renamed from: com.ss.android.lark.search.dependency.ISearchModuleDependency$m */
    public interface AbstractC53327m {
        /* renamed from: a */
        void mo181804a(Context context, ImageView imageView, Image image, Drawable drawable, Drawable drawable2, int i, int i2, boolean z, ImageView.ScaleType scaleType, boolean z2, boolean z3, boolean z4);

        /* renamed from: a */
        void mo181805a(Context context, String str, ImageView imageView, String str2, int i, int i2);

        /* renamed from: a */
        void mo181806a(Context context, String str, Object obj, int i, int i2, IGetDataCallback<String> iGetDataCallback);

        /* renamed from: a */
        void mo181807a(List<String> list, List<String> list2, int i, int i2, IGetDataCallback<List<Bitmap>> iGetDataCallback);
    }

    /* renamed from: com.ss.android.lark.search.dependency.ISearchModuleDependency$n */
    public interface AbstractC53328n {
        /* renamed from: a */
        String mo181815a();

        /* renamed from: b */
        String mo181816b();

        /* renamed from: c */
        boolean mo181817c();

        /* renamed from: d */
        boolean mo181818d();
    }

    /* renamed from: a */
    String mo181732a(String str, int i, int i2);

    /* renamed from: a */
    Locale mo181733a();

    /* renamed from: a */
    void mo181734a(int i, ImageView imageView);

    /* renamed from: a */
    void mo181735a(Dialog dialog);

    /* renamed from: a */
    void mo181736a(Context context, FileContent fileContent, String str, String str2, int i, boolean z, boolean z2, boolean z3);

    /* renamed from: a */
    void mo181737a(Context context, String str);

    /* renamed from: a */
    void mo181738a(Context context, String str, String str2, String str3, String str4, String str5, int i, boolean z, boolean z2, long j);

    /* renamed from: a */
    void mo181739a(ImageView imageView);

    /* renamed from: a */
    void mo181740a(AbstractC53342a aVar);

    /* renamed from: a */
    void mo181741a(String str, Context context);

    /* renamed from: a */
    void mo181742a(String str, String str2, IGetDataCallback<String> iGetDataCallback);

    /* renamed from: a */
    void mo181743a(String str, boolean z);

    /* renamed from: a */
    void mo181744a(String str, boolean z, int i);

    /* renamed from: a */
    boolean mo181745a(String str);

    /* renamed from: b */
    void mo181746b(Context context, String str);

    /* renamed from: b */
    void mo181747b(AbstractC53342a aVar);

    /* renamed from: b */
    void mo181748b(String str, boolean z);

    /* renamed from: b */
    boolean mo181749b();

    /* renamed from: c */
    Context mo181750c();

    /* renamed from: c */
    void mo181751c(Context context, String str);

    /* renamed from: d */
    AbstractC53363a mo181752d();

    /* renamed from: d */
    void mo181753d(Context context, String str);

    /* renamed from: e */
    AbstractC53315c mo181754e();

    /* renamed from: e */
    boolean mo181755e(Context context, String str);

    /* renamed from: f */
    AbstractC53317e mo181756f();

    /* renamed from: f */
    void mo181757f(Context context, String str);

    /* renamed from: g */
    AbstractC53327m mo181758g();

    /* renamed from: h */
    AbstractC53321h mo181759h();

    /* renamed from: i */
    AbstractC53324j mo181760i();

    /* renamed from: j */
    AbstractC53328n mo181761j();

    /* renamed from: k */
    AbstractC53318f mo181762k();

    /* renamed from: l */
    AbstractC53326l mo181763l();

    /* renamed from: m */
    ISettingServiceDependency mo181764m();

    /* renamed from: n */
    AbstractC53316d mo181765n();

    /* renamed from: o */
    AbstractC53325k mo181766o();

    /* renamed from: p */
    AbstractC53320g mo181767p();

    /* renamed from: q */
    AbstractC53323i mo181768q();

    /* renamed from: r */
    AbstractC53314b mo181769r();

    /* renamed from: s */
    AbstractC53313a mo181770s();
}
