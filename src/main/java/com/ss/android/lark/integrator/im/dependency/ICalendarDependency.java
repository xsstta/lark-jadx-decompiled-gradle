package com.ss.android.lark.integrator.im.dependency;

import android.app.Activity;
import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.ChatChatter;
import com.ss.android.lark.chat.entity.p1663c.AbstractC33978b;
import com.ss.android.lark.chat.entity.p1663c.AbstractC33980d;
import com.ss.android.lark.chat.entity.p1665e.AbstractC33988a;
import com.ss.android.lark.dependency.ao;
import com.ss.android.lark.widget.recyclerview.AbstractC58992f;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;

public interface ICalendarDependency {

    @Retention(RetentionPolicy.SOURCE)
    public @interface SCENE {
    }

    /* renamed from: a */
    AbstractC33978b mo143308a(Activity activity, String str, String str2, AbstractC33980d dVar);

    /* renamed from: a */
    <T> AbstractC58992f<T, ? extends RecyclerView.ViewHolder> mo143309a(Context context, AbstractC33988a<T> aVar);

    /* renamed from: a */
    void mo143310a();

    /* renamed from: a */
    void mo143311a(Activity activity, String str, boolean z, String str2, ArrayList<String> arrayList, long j, long j2, boolean z2, int i);

    /* renamed from: a */
    void mo143312a(Context context, Chat chat, ChatChatter chatChatter);

    /* renamed from: a */
    void mo143313a(String str, IGetDataCallback<Boolean> iGetDataCallback);

    /* renamed from: a */
    boolean mo143314a(int i);

    /* renamed from: a */
    boolean mo143315a(Chat chat, ChatChatter chatChatter);

    /* renamed from: b */
    com.ss.android.lark.dependency.ICalendarDependency mo143316b();

    /* renamed from: b */
    <T> AbstractC58992f<T, ? extends RecyclerView.ViewHolder> mo143317b(Context context, AbstractC33988a<T> aVar);

    /* renamed from: b */
    boolean mo143318b(int i);

    /* renamed from: c */
    ao mo143319c();
}
