package com.ss.android.lark.dependency;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.ChatChatter;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.desktopmode.p1787a.C36516a;
import com.ss.android.lark.p2392o.AbstractC48697c;
import com.ss.android.lark.widget.chat_function_view.ChatFunctionView;
import com.ss.android.lark.widget.chat_function_view.IChatFunctionBinder;
import com.ss.android.lark.widget.chat_function_view.IChatFunctionController;
import com.ss.android.lark.widget.chat_function_view.IChatFunctionItem;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;

public interface IChatSettingDependency {

    @Retention(RetentionPolicy.SOURCE)
    public @interface SourceToChatSetting {
    }

    /* renamed from: com.ss.android.lark.dependency.IChatSettingDependency$a */
    public interface AbstractC36448a {
        void onClick(View view, String str);
    }

    /* renamed from: a */
    int mo134347a();

    /* renamed from: a */
    <VH extends RecyclerView.ViewHolder, B extends IChatFunctionBinder<VH>> IChatFunctionController mo134348a(Activity activity, Chat chat, Chatter chatter, ChatFunctionView chatFunctionView, B b, RecyclerView.LayoutManager layoutManager, List<IChatFunctionItem> list);

    /* renamed from: a */
    IChatFunctionController mo134349a(Activity activity, Chat chat, Chatter chatter, List<IChatFunctionItem> list);

    /* renamed from: a */
    List<IChatFunctionItem> mo134350a(Chat chat);

    /* renamed from: a */
    List<IChatFunctionItem> mo134351a(ChatChatter chatChatter, ChatChatter chatChatter2, Chat chat, boolean z);

    /* renamed from: a */
    void mo134352a(Activity activity, Chat chat, int i);

    /* renamed from: a */
    void mo134353a(Activity activity, C36516a aVar, Chatter chatter, Chat chat, int i, int i2, int i3);

    /* renamed from: a */
    void mo134354a(Activity activity, String str, boolean z);

    /* renamed from: a */
    void mo134355a(Context context, AbstractC36448a aVar);

    /* renamed from: a */
    void mo134356a(Context context, C36516a aVar, String str, int i, boolean z, int i2, int i3);

    /* renamed from: a */
    void mo134357a(Context context, String str);

    /* renamed from: a */
    void mo134358a(Context context, String str, int i, boolean z, boolean z2, boolean z3, boolean z4);

    /* renamed from: a */
    void mo134359a(AbstractC48697c cVar);

    /* renamed from: b */
    int mo134360b();

    /* renamed from: b */
    void mo134361b(Context context, String str);

    /* renamed from: b */
    void mo134362b(AbstractC48697c cVar);

    /* renamed from: b */
    boolean mo134363b(Chat chat);

    /* renamed from: c */
    int mo134364c();

    /* renamed from: c */
    boolean mo134365c(Chat chat);
}
