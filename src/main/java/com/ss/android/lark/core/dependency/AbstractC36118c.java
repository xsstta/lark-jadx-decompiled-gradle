package com.ss.android.lark.core.dependency;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.widget.TextView;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.export.entity.message.Content;
import com.ss.android.lark.forward.dto.CalendarForwardData;
import com.ss.android.lark.searchcommon.dto.SearchResponse;
import java.util.ArrayList;
import java.util.List;
import pl.droidsonroids.gif.GifImageView;

/* renamed from: com.ss.android.lark.core.dependency.c */
public interface AbstractC36118c {
    /* renamed from: a */
    Intent mo132729a(ArrayList<String> arrayList, boolean z);

    /* renamed from: a */
    Content mo132730a(CalendarForwardData calendarForwardData);

    /* renamed from: a */
    void mo132731a();

    /* renamed from: a */
    void mo132732a(Activity activity);

    /* renamed from: a */
    void mo132733a(Activity activity, String str);

    /* renamed from: a */
    void mo132734a(Context context);

    /* renamed from: a */
    void mo132735a(Context context, String str);

    /* renamed from: a */
    void mo132736a(Context context, String str, String str2);

    /* renamed from: a */
    void mo132737a(TextView textView, TextView textView2, GifImageView gifImageView, Content content);

    /* renamed from: a */
    void mo132738a(CalendarForwardData calendarForwardData, String str, IGetDataCallback<Void> iGetDataCallback);

    /* renamed from: a */
    void mo132739a(String str, IGetDataCallback<String> iGetDataCallback);

    /* renamed from: a */
    void mo132740a(String str, String str2, IGetDataCallback<SearchResponse> iGetDataCallback);

    /* renamed from: a */
    void mo132741a(String str, String str2, Long l, Context context, Long l2, Long l3);

    /* renamed from: a */
    void mo132742a(List<String> list, String str, int i, String str2, IGetDataCallback<Boolean> iGetDataCallback);

    /* renamed from: a */
    boolean mo132743a(Uri uri, Context context);

    /* renamed from: a */
    boolean mo132744a(Message message);

    /* renamed from: a */
    boolean mo132745a(String str);

    /* renamed from: b */
    int mo132746b();

    /* renamed from: b */
    List<String> mo132747b(String str);

    /* renamed from: b */
    void mo132748b(String str, IGetDataCallback<Integer> iGetDataCallback);

    /* renamed from: c */
    Intent mo132749c(String str);

    /* renamed from: c */
    void mo132750c();

    /* renamed from: c */
    void mo132751c(String str, IGetDataCallback<String> iGetDataCallback);

    /* renamed from: d */
    boolean mo132752d();

    /* renamed from: e */
    void mo132753e();

    /* renamed from: f */
    void mo132754f();

    /* renamed from: g */
    String mo132755g();

    /* renamed from: h */
    boolean mo132756h();
}
