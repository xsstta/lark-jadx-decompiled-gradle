package com.ss.android.lark.mm.module.list.widget;

import android.view.View;
import android.widget.TextView;
import com.google.firebase.messaging.Constants;
import com.larksuite.suite.R;
import com.ss.android.lark.mm.module.detail.baseinfo.ObjectStatus;
import com.ss.android.lark.mm.module.list.control.MmListControl;
import com.ss.android.lark.mm.module.list.data.MinutesSummaryData;
import com.ss.android.lark.mm.statistics.hitpoint.C47083e;
import com.ss.android.lark.mm.statistics.hitpoint.C47085h;
import com.ss.android.lark.mm.statistics.hitpoint.C47086i;
import com.ss.android.lark.mm.utils.ktextensions.C47110e;
import com.ss.android.lark.utils.UIHelper;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0014B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J.\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\nJ(\u0010\u0010\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J \u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J \u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J \u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002¨\u0006\u0015"}, d2 = {"Lcom/ss/android/lark/mm/module/list/widget/MmListItemMenuHelper;", "", "()V", "showDeleteMenu", "", "menuView", "Landroid/widget/TextView;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/lark/mm/module/list/data/MinutesSummaryData;", "callback", "Lcom/ss/android/lark/mm/module/list/widget/MmListItemMenuHelper$IListMenuCallback;", "showMenu", "ds", "Lcom/ss/android/lark/mm/module/list/control/MmListControl$DataSource;", "menuLeftView", "menuRightView", "showRemoveMenu", "showRenameMenu", "showTrashDeleteMenu", "showTrashRestoreMenu", "IListMenuCallback", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mm.module.list.widget.e */
public final class MmListItemMenuHelper {

    /* renamed from: a */
    public static final MmListItemMenuHelper f117032a = new MmListItemMenuHelper();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\n"}, d2 = {"Lcom/ss/android/lark/mm/module/list/widget/MmListItemMenuHelper$IListMenuCallback;", "", "onDelete", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/lark/mm/module/list/data/MinutesSummaryData;", "onDeletePermanently", "onRemove", "onRename", "onRestore", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.list.widget.e$a */
    public interface IListMenuCallback {
        /* renamed from: a */
        void mo163307a(MinutesSummaryData minutesSummaryData);

        /* renamed from: b */
        void mo163308b(MinutesSummaryData minutesSummaryData);

        /* renamed from: c */
        void mo163309c(MinutesSummaryData minutesSummaryData);

        /* renamed from: d */
        void mo163310d(MinutesSummaryData minutesSummaryData);

        /* renamed from: e */
        void mo163311e(MinutesSummaryData minutesSummaryData);
    }

    private MmListItemMenuHelper() {
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.list.widget.e$b */
    public static final class C46478b extends Lambda implements Function1<View, Unit> {
        final /* synthetic */ IListMenuCallback $callback;
        final /* synthetic */ MinutesSummaryData $data;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C46478b(MinutesSummaryData minutesSummaryData, IListMenuCallback aVar) {
            super(1);
            this.$data = minutesSummaryData;
            this.$callback = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke(view);
            return Unit.INSTANCE;
        }

        public final void invoke(View view) {
            Intrinsics.checkParameterIsNotNull(view, "it");
            C47083e.m186425a(C47085h.m186431a(this.$data), "vc_minutes_list_click", C47086i.m186432a().mo165422d("delete").mo165423e("vc_minutes_delete_view").mo165426h("my_content").mo165414a("is_batch", false).mo165410a("batch_num", 1).mo165421c());
            this.$callback.mo163309c(this.$data);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.list.widget.e$c */
    public static final class C46479c extends Lambda implements Function1<View, Unit> {
        final /* synthetic */ IListMenuCallback $callback;
        final /* synthetic */ MinutesSummaryData $data;
        final /* synthetic */ MmListControl.DataSource $ds;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C46479c(MmListControl.DataSource dataSource, MinutesSummaryData minutesSummaryData, IListMenuCallback aVar) {
            super(1);
            this.$ds = dataSource;
            this.$data = minutesSummaryData;
            this.$callback = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke(view);
            return Unit.INSTANCE;
        }

        public final void invoke(View view) {
            Intrinsics.checkParameterIsNotNull(view, "it");
            if (this.$ds == MmListControl.DataSource.HomeList) {
                C47083e.m186425a(C47085h.m186431a(this.$data), "vc_minutes_list_click", C47086i.m186432a().mo165422d("remove").mo165423e("vc_minutes_remove_view").mo165426h("home_page").mo165414a("is_batch", false).mo165410a("batch_num", 1).mo165421c());
            } else if (this.$ds == MmListControl.DataSource.ShareList) {
                C47083e.m186425a(C47085h.m186431a(this.$data), "vc_minutes_list_click", C47086i.m186432a().mo165422d("remove").mo165423e("vc_minutes_remove_view").mo165426h("shared_with_me").mo165414a("is_batch", false).mo165410a("batch_num", 1).mo165421c());
            }
            this.$callback.mo163308b(this.$data);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.list.widget.e$d */
    public static final class C46480d extends Lambda implements Function1<View, Unit> {
        final /* synthetic */ IListMenuCallback $callback;
        final /* synthetic */ MinutesSummaryData $data;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C46480d(IListMenuCallback aVar, MinutesSummaryData minutesSummaryData) {
            super(1);
            this.$callback = aVar;
            this.$data = minutesSummaryData;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke(view);
            return Unit.INSTANCE;
        }

        public final void invoke(View view) {
            Intrinsics.checkParameterIsNotNull(view, "it");
            this.$callback.mo163307a(this.$data);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.list.widget.e$e */
    public static final class C46481e extends Lambda implements Function1<View, Unit> {
        final /* synthetic */ IListMenuCallback $callback;
        final /* synthetic */ MinutesSummaryData $data;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C46481e(MinutesSummaryData minutesSummaryData, IListMenuCallback aVar) {
            super(1);
            this.$data = minutesSummaryData;
            this.$callback = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke(view);
            return Unit.INSTANCE;
        }

        public final void invoke(View view) {
            Intrinsics.checkParameterIsNotNull(view, "it");
            C47083e.m186425a(C47085h.m186431a(this.$data), "vc_minutes_list_click", C47086i.m186432a().mo165422d("delete_permanently").mo165423e("vc_minutes_delete_view").mo165426h("trash_box").mo165414a("is_batch", false).mo165410a("batch_num", 1).mo165421c());
            this.$callback.mo163310d(this.$data);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.list.widget.e$f */
    public static final class C46482f extends Lambda implements Function1<View, Unit> {
        final /* synthetic */ IListMenuCallback $callback;
        final /* synthetic */ MinutesSummaryData $data;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C46482f(MinutesSummaryData minutesSummaryData, IListMenuCallback aVar) {
            super(1);
            this.$data = minutesSummaryData;
            this.$callback = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke(view);
            return Unit.INSTANCE;
        }

        public final void invoke(View view) {
            Intrinsics.checkParameterIsNotNull(view, "it");
            C47083e.m186425a(C47085h.m186431a(this.$data), "vc_minutes_list_click", C47086i.m186432a().mo165422d("restore").mo165423e("vc_minutes_list_view").mo165426h("trash_box").mo165414a("is_batch", false).mo165410a("batch_num", 1).mo165421c());
            this.$callback.mo163311e(this.$data);
        }
    }

    /* renamed from: a */
    private final void m183829a(TextView textView, MinutesSummaryData minutesSummaryData, IListMenuCallback aVar) {
        textView.setVisibility(0);
        textView.setText(UIHelper.getString(R.string.MMWeb_G_Rename));
        C47110e.m186573a(textView, new C46480d(aVar, minutesSummaryData));
    }

    /* renamed from: c */
    private final void m183832c(TextView textView, MinutesSummaryData minutesSummaryData, IListMenuCallback aVar) {
        textView.setVisibility(0);
        textView.setText(UIHelper.getString(R.string.MMWeb_G_Trash_DeletePermanently_Option));
        C47110e.m186573a(textView, new C46481e(minutesSummaryData, aVar));
    }

    /* renamed from: d */
    private final void m183833d(TextView textView, MinutesSummaryData minutesSummaryData, IListMenuCallback aVar) {
        textView.setVisibility(0);
        textView.setText(UIHelper.getString(R.string.MMWeb_G_Trash_Restore_Option));
        C47110e.m186573a(textView, new C46482f(minutesSummaryData, aVar));
    }

    /* renamed from: b */
    private final void m183831b(TextView textView, MinutesSummaryData minutesSummaryData, IListMenuCallback aVar) {
        boolean z;
        int i = 0;
        if (!ObjectStatus.Companion.mo161608c(minutesSummaryData.getStatus()) || ObjectStatus.Companion.mo161611f(minutesSummaryData.getStatus())) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            i = 8;
        }
        textView.setVisibility(i);
        textView.setText(UIHelper.getString(R.string.MMWeb_G_Delete));
        C47110e.m186573a(textView, new C46478b(minutesSummaryData, aVar));
    }

    /* renamed from: a */
    private final void m183830a(MmListControl.DataSource dataSource, TextView textView, MinutesSummaryData minutesSummaryData, IListMenuCallback aVar) {
        textView.setVisibility(0);
        textView.setText(UIHelper.getString(R.string.MMWeb_G_Remove));
        C47110e.m186573a(textView, new C46479c(dataSource, minutesSummaryData, aVar));
    }

    /* renamed from: a */
    public final void mo163335a(MmListControl.DataSource dataSource, MinutesSummaryData minutesSummaryData, TextView textView, TextView textView2, IListMenuCallback aVar) {
        Intrinsics.checkParameterIsNotNull(dataSource, "ds");
        Intrinsics.checkParameterIsNotNull(minutesSummaryData, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        Intrinsics.checkParameterIsNotNull(textView, "menuLeftView");
        Intrinsics.checkParameterIsNotNull(textView2, "menuRightView");
        Intrinsics.checkParameterIsNotNull(aVar, "callback");
        if (dataSource == MmListControl.DataSource.HomeList) {
            if (minutesSummaryData.isOwner()) {
                m183830a(dataSource, textView2, minutesSummaryData, aVar);
                m183829a(textView, minutesSummaryData, aVar);
                return;
            }
            textView.setVisibility(8);
            m183830a(dataSource, textView2, minutesSummaryData, aVar);
        } else if (dataSource == MmListControl.DataSource.MyList) {
            m183831b(textView2, minutesSummaryData, aVar);
            m183829a(textView, minutesSummaryData, aVar);
        } else if (dataSource == MmListControl.DataSource.ShareList) {
            m183830a(dataSource, textView2, minutesSummaryData, aVar);
            textView.setVisibility(8);
        } else if (dataSource == MmListControl.DataSource.TrashList) {
            m183832c(textView2, minutesSummaryData, aVar);
            m183833d(textView, minutesSummaryData, aVar);
        }
    }
}
