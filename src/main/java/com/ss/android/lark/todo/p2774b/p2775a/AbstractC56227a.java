package com.ss.android.lark.todo.p2774b.p2775a;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.export.ui.message.IOpenMessageCellFactory;
import com.ss.android.lark.widget.recyclerview.AbstractC58992f;
import java.util.List;

/* renamed from: com.ss.android.lark.todo.b.a.a */
public interface AbstractC56227a {

    /* renamed from: com.ss.android.lark.todo.b.a.a$a */
    public interface AbstractC56228a<T> {
        /* renamed from: a */
        void mo143009a(int i);

        /* renamed from: a */
        void mo143010a(View view);

        /* renamed from: a */
        void mo143011a(T t);

        /* renamed from: a */
        boolean mo143012a();

        /* renamed from: b */
        Message mo143013b();

        /* renamed from: c */
        String mo143014c();

        /* renamed from: d */
        String mo143015d();

        /* renamed from: e */
        String mo143016e();

        /* renamed from: f */
        String mo143017f();

        /* renamed from: g */
        boolean mo143018g();

        /* renamed from: h */
        String mo143019h();
    }

    /* renamed from: a */
    <T> AbstractC58992f<T, ? extends RecyclerView.ViewHolder> mo191673a(Context context, AbstractC56228a<T> aVar);

    /* renamed from: a */
    List<IOpenMessageCellFactory> mo191674a();

    /* renamed from: b */
    List<IOpenMessageCellFactory> mo191675b();
}
