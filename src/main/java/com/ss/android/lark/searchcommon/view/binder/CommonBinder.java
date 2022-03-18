package com.ss.android.lark.searchcommon.view.binder;

import android.content.Context;
import com.google.firebase.messaging.Constants;
import com.larksuite.component.ui.avatar.v2.ChatterAvatar;
import com.larksuite.component.ui.badge.BadgeModel;
import com.larksuite.component.ui.badge.BadgeModelBuilder;
import com.ss.android.lark.searchcommon.SearchCommonModuleDependency;
import com.ss.android.lark.searchcommon.dto.info.SearchBaseInfo;
import com.ss.android.lark.searchcommon.view.ChatterChatViewHolder;
import com.ss.android.lark.searchcommon.view.SearchResultViewAdapter;
import com.ss.android.lark.searchcommon.view.avataritem.AvatarItemView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0010\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u00020\u00040\u0003B\u0015\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ%\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00020\u0004H\u0016¢\u0006\u0002\u0010\u0010J\u001d\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0012J\u001d\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010\u0012J%\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0015J%\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0015J\u0015\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u000e\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0019J\u0013\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u000e\u001a\u00028\u0000¢\u0006\u0002\u0010\u0019J\b\u0010\u001b\u001a\u00020\u0018H\u0016J\u0015\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u000e\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0019J\b\u0010\u001d\u001a\u00020\u000bH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/ss/android/lark/searchcommon/view/binder/CommonBinder;", "D", "Lcom/ss/android/lark/searchcommon/dto/info/SearchBaseInfo;", "Lcom/ss/android/lark/searchcommon/view/binder/IViewBinder;", "Lcom/ss/android/lark/searchcommon/view/ChatterChatViewHolder;", "mContext", "Landroid/content/Context;", "mOnItemClickHandler", "Lcom/ss/android/lark/searchcommon/view/SearchResultViewAdapter$IOnItemClickHandler;", "(Landroid/content/Context;Lcom/ss/android/lark/searchcommon/view/SearchResultViewAdapter$IOnItemClickHandler;)V", "bind", "", "position", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "holder", "(ILcom/ss/android/lark/searchcommon/dto/info/SearchBaseInfo;Lcom/ss/android/lark/searchcommon/view/ChatterChatViewHolder;)V", "bindAvatar", "(Lcom/ss/android/lark/searchcommon/view/ChatterChatViewHolder;Lcom/ss/android/lark/searchcommon/dto/info/SearchBaseInfo;)V", "bindBadge", "bindOthers", "(ILcom/ss/android/lark/searchcommon/view/ChatterChatViewHolder;Lcom/ss/android/lark/searchcommon/dto/info/SearchBaseInfo;)V", "bindTag", "checkDisable", "", "(Lcom/ss/android/lark/searchcommon/dto/info/SearchBaseInfo;)Z", "isExternal", "needBindSubTitle", "needBindSummary", "onDisableClickHandler", "search-common_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.searchcommon.view.binder.i */
public class CommonBinder<D extends SearchBaseInfo> extends IViewBinder<D, ChatterChatViewHolder> {

    /* renamed from: a */
    private final Context f133642a;

    /* renamed from: b */
    private final SearchResultViewAdapter.IOnItemClickHandler f133643b;

    /* renamed from: a */
    public void mo184804a(int i, ChatterChatViewHolder aVar, D d) {
        Intrinsics.checkParameterIsNotNull(aVar, "holder");
        Intrinsics.checkParameterIsNotNull(d, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
    }

    /* renamed from: a */
    public boolean mo184806a(D d) {
        Intrinsics.checkParameterIsNotNull(d, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        return true;
    }

    /* renamed from: b */
    public void mo184807b(int i, ChatterChatViewHolder aVar, D d) {
        Intrinsics.checkParameterIsNotNull(aVar, "holder");
        Intrinsics.checkParameterIsNotNull(d, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
    }

    /* renamed from: b */
    public boolean mo184823b(D d) {
        Intrinsics.checkParameterIsNotNull(d, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        return false;
    }

    public void bk_() {
    }

    /* renamed from: c */
    public boolean mo184836c() {
        return true;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "D", "Lcom/ss/android/lark/searchcommon/dto/info/SearchBaseInfo;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.searchcommon.view.binder.i$c */
    public static final class C53991c extends Lambda implements Function0<Unit> {
        final /* synthetic */ CommonBinder this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C53991c(CommonBinder iVar) {
            super(0);
            this.this$0 = iVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
            this.this$0.bk_();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "D", "Lcom/ss/android/lark/searchcommon/dto/info/SearchBaseInfo;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.searchcommon.view.binder.i$a */
    public static final class C53989a extends Lambda implements Function0<Boolean> {
        final /* synthetic */ SearchBaseInfo $data;
        final /* synthetic */ CommonBinder this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C53989a(CommonBinder iVar, SearchBaseInfo searchBaseInfo) {
            super(0);
            this.this$0 = iVar;
            this.$data = searchBaseInfo;
        }

        /* Return type fixed from 'boolean' to match base method */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.ss.android.lark.searchcommon.view.binder.i */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return this.this$0.mo184823b(this.$data);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "D", "Lcom/ss/android/lark/searchcommon/dto/info/SearchBaseInfo;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.searchcommon.view.binder.i$b */
    public static final class C53990b extends Lambda implements Function0<Boolean> {
        final /* synthetic */ SearchBaseInfo $data;
        final /* synthetic */ CommonBinder this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C53990b(CommonBinder iVar, SearchBaseInfo searchBaseInfo) {
            super(0);
            this.this$0 = iVar;
            this.$data = searchBaseInfo;
        }

        /* Return type fixed from 'boolean' to match base method */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.ss.android.lark.searchcommon.view.binder.i */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return this.this$0.mo184823b(this.$data);
        }
    }

    /* renamed from: c */
    public final boolean mo184837c(D d) {
        Intrinsics.checkParameterIsNotNull(d, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        if (SearchCommonModuleDependency.m208732b().mo102917g() || SearchCommonModuleDependency.m208732b().mo102916f() || !d.isCrossTenant()) {
            return false;
        }
        return true;
    }

    public CommonBinder(Context context, SearchResultViewAdapter.IOnItemClickHandler bVar) {
        Intrinsics.checkParameterIsNotNull(context, "mContext");
        Intrinsics.checkParameterIsNotNull(bVar, "mOnItemClickHandler");
        this.f133642a = context;
        this.f133643b = bVar;
    }

    /* renamed from: a */
    public void mo184769a(ChatterChatViewHolder aVar, D d) {
        Intrinsics.checkParameterIsNotNull(aVar, "holder");
        Intrinsics.checkParameterIsNotNull(d, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        aVar.mo184645a().getItem().mo184662a(((ChatterAvatar.Builder) ((ChatterAvatar.Builder) new ChatterAvatar.Builder().mo88962a(d.getAvatarKey())).mo88967b(d.getId())).mo88976k());
    }

    /* renamed from: b */
    private final void m209537b(ChatterChatViewHolder aVar, D d) {
        if (!d.isShowBadge() || d.getNewMsgCount() <= 0) {
            aVar.mo184645a().getItem().mo184661a(new BadgeModel().mo88922a(false));
            return;
        }
        AvatarItemView item = aVar.mo184645a().getItem();
        BadgeModelBuilder a = new BadgeModelBuilder(this.f133642a).mo88943a(String.valueOf(d.getNewMsgCount()));
        if (d.isRemind()) {
            a.mo88942a(1);
        } else {
            a.mo88942a(0);
        }
        item.mo184661a(a.mo88941a());
    }

    /* renamed from: a */
    public void mo184835a(int i, D d, ChatterChatViewHolder aVar) {
        Intrinsics.checkParameterIsNotNull(d, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        Intrinsics.checkParameterIsNotNull(aVar, "holder");
        mo184769a(aVar, d);
        m209537b(aVar, d);
        mo184851a((SearchBaseInfo) d, aVar, true);
        if (mo184836c()) {
            mo184808b(d, aVar);
        }
        if (mo184806a(d)) {
            mo184805a(d, aVar);
        }
        mo184849a(d, aVar, i, new C53989a(this, d), mo184854d(), this.f133643b);
        mo184850a(d, aVar, i, new C53990b(this, d), new C53991c(this), mo184854d(), this.f133643b);
        mo184807b(i, aVar, d);
        mo184804a(i, aVar, d);
    }
}
