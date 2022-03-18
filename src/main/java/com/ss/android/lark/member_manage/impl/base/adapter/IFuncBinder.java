package com.ss.android.lark.member_manage.impl.base.adapter;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.ss.android.lark.member_manage.impl.bean.C45084c;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public interface IFuncBinder<VH extends RecyclerView.ViewHolder, D> {

    @Retention(RetentionPolicy.SOURCE)
    public @interface SELECT_MODE {
    }

    /* renamed from: com.ss.android.lark.member_manage.impl.base.adapter.IFuncBinder$a */
    public interface AbstractC45038a {
        void onItemLongClick(C45084c cVar);
    }

    /* renamed from: com.ss.android.lark.member_manage.impl.base.adapter.IFuncBinder$b */
    public interface AbstractC45039b {
        /* renamed from: a */
        void mo159334a(C45084c cVar);

        /* renamed from: b */
        void mo159335b(C45084c cVar);

        /* renamed from: c */
        void mo159336c(C45084c cVar);
    }

    /* renamed from: com.ss.android.lark.member_manage.impl.base.adapter.IFuncBinder$c */
    public interface AbstractC45040c {
        /* renamed from: a */
        void mo159337a(C45084c cVar);
    }

    /* renamed from: a */
    int mo159325a();

    /* renamed from: a */
    int mo159326a(C45084c cVar, int i);

    /* renamed from: a */
    void mo159327a(VH vh, D d);

    /* renamed from: a */
    void mo159328a(C45084c cVar, AbstractC45038a aVar);

    /* renamed from: a */
    void mo159329a(C45084c cVar, AbstractC45039b bVar);

    /* renamed from: a */
    void mo159330a(C45084c cVar, AbstractC45040c cVar2);

    /* renamed from: a */
    boolean mo159331a(C45084c cVar);

    /* renamed from: b */
    boolean mo159332b();

    /* renamed from: com.ss.android.lark.member_manage.impl.base.adapter.IFuncBinder$-CC  reason: invalid class name */
    public final /* synthetic */ class CC {
        public static void $default$a(IFuncBinder iFuncBinder, C45084c cVar, AbstractC45038a aVar) {
            if (aVar != null) {
                aVar.onItemLongClick(cVar);
            }
        }
    }
}
