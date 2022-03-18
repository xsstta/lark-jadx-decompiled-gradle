package com.ss.android.lark.mm.module.detail.titlebar;

import android.app.Dialog;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import com.larksuite.suite.R;
import com.ss.android.lark.mm.base.p2289a.C45861b;
import com.ss.android.lark.mm.module.detail.C45950b;
import com.ss.android.lark.mm.module.detail.baseinfo.MediaType;
import com.ss.android.lark.mm.module.detail.baseinfo.MmBaseInfo;
import com.ss.android.lark.mm.module.detail.main.MmDetailStickyNavLayout;
import com.ss.android.lark.mm.module.detail.menu.MmDetailMenuFactory;
import com.ss.android.lark.mm.module.detail.subtitles.edit.speaker.state.MmEditStateManager;
import com.ss.android.lark.mm.module.detail.translate.MmTranslateLangType;
import com.ss.android.lark.mm.module.framework.IMmInquirer;
import com.ss.android.lark.mm.module.framework.IMmViewControlContext;
import com.ss.android.lark.mm.module.framework.MmBaseViewControl;
import com.ss.android.lark.mm.module.framework.MmBaseViewControlAdapter;
import com.ss.android.lark.mm.module.list.data.MinutesSummaryData;
import com.ss.android.lark.mm.p2288b.C45855f;
import com.ss.android.lark.mm.statistics.hitpoint.C47083e;
import com.ss.android.lark.mm.statistics.hitpoint.C47084f;
import com.ss.android.lark.mm.statistics.hitpoint.C47085h;
import com.ss.android.lark.mm.statistics.hitpoint.C47086i;
import com.ss.android.lark.mm.utils.C47098d;
import com.ss.android.lark.mm.utils.C47103g;
import com.ss.android.lark.mm.utils.ktextensions.C47107a;
import com.ss.android.lark.mm.widget.MmDetailTitleBar;
import com.ss.android.lark.mm.widget.MoreMenuDialog;
import com.ss.android.lark.statistics.chat.ChatTypeStateKeeper;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00022\u00020\u0004:\u00011B!\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\b¢\u0006\u0002\u0010\tJ\n\u0010\u0019\u001a\u0004\u0018\u00010\rH\u0016J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u0002H\u0016J\b\u0010\u001d\u001a\u00020\u001eH\u0016J\b\u0010\u001f\u001a\u00020\u001eH\u0002J\b\u0010 \u001a\u00020\u000fH\u0016J\b\u0010!\u001a\u00020\u000fH\u0016J\b\u0010\"\u001a\u00020\u001eH\u0016J\u0010\u0010#\u001a\u00020\u001e2\u0006\u0010$\u001a\u00020%H\u0016J\b\u0010&\u001a\u00020\u001eH\u0016J\b\u0010'\u001a\u00020\u001eH\u0016J\u0010\u0010(\u001a\u00020\u001e2\u0006\u0010)\u001a\u00020*H\u0016J\u0010\u0010+\u001a\u00020\u001e2\u0006\u0010,\u001a\u00020%H\u0016J\u0010\u0010-\u001a\u00020\u001e2\u0006\u0010.\u001a\u00020\u000fH\u0016J\b\u0010/\u001a\u00020\u001eH\u0016J\b\u00100\u001a\u00020\u001eH\u0016R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u000e¢\u0006\u0002\n\u0000¨\u00062"}, d2 = {"Lcom/ss/android/lark/mm/module/detail/titlebar/MmDetailTitleBarViewControl;", "Lcom/ss/android/lark/mm/module/framework/MmBaseViewControl;", "Lcom/ss/android/lark/mm/module/detail/titlebar/IMmDetailTitleBarListener;", "Lcom/ss/android/lark/mm/module/detail/titlebar/IMmDetailTitleBarDependency;", "Lcom/ss/android/lark/mm/module/detail/titlebar/IMmDetailTitleBarInquirer;", "vcContext", "Lcom/ss/android/lark/mm/module/framework/IMmViewControlContext;", "controlAdapter", "Lcom/ss/android/lark/mm/module/framework/MmBaseViewControlAdapter;", "(Lcom/ss/android/lark/mm/module/framework/IMmViewControlContext;Lcom/ss/android/lark/mm/module/framework/MmBaseViewControlAdapter;)V", "baseInfo", "Lcom/ss/android/lark/mm/module/detail/baseinfo/MmBaseInfo;", "editStateManager", "Lcom/ss/android/lark/mm/module/detail/subtitles/edit/speaker/state/MmEditStateManager;", "isSwitchCommentOn", "", "isSwitchReactionOn", "moreMenuDialog", "Lcom/ss/android/lark/mm/widget/MoreMenuDialog;", "stickyLayout", "Lcom/ss/android/lark/mm/module/detail/main/MmDetailStickyNavLayout;", "titleBar", "Lcom/ss/android/lark/mm/widget/MmDetailTitleBar;", "videoPlayerMode", "Lcom/ss/android/lark/mm/module/detail/titlebar/MmDetailTitleBarViewControl$VideoPlayerMode;", "getEditSm", "getMmInquirer", "Lcom/ss/android/lark/mm/module/framework/IMmInquirer;", "getMmListener", "hideTitleBar", "", "initTitleBar", "isEditMode", "isSmallVideoViewShown", "onCreate", "onEditStatusContentChange", "content", "", "onEnterEditMode", "onExitEditMode", "onStatusChange", UpdateKey.STATUS, "Lcom/ss/android/lark/mm/module/share/model/PermissionStatus;", "onTitleChange", ChatTypeStateKeeper.f135670e, "onVideoPlayerVisibilityChange", "isVisible", "showMoreMenu", "showTitleBar", "VideoPlayerMode", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class MmDetailTitleBarViewControl extends MmBaseViewControl<IMmDetailTitleBarListener, IMmDetailTitleBarDependency> implements IMmDetailTitleBarInquirer, IMmDetailTitleBarListener {

    /* renamed from: a */
    public final MmDetailTitleBar f116615a;

    /* renamed from: b */
    public boolean f116616b = true;

    /* renamed from: c */
    public boolean f116617c = true;

    /* renamed from: d */
    public final MmBaseInfo f116618d;

    /* renamed from: e */
    public final MmEditStateManager f116619e;

    /* renamed from: f */
    public final IMmViewControlContext f116620f;

    /* renamed from: g */
    public final MmBaseViewControlAdapter<IMmDetailTitleBarListener, IMmDetailTitleBarDependency> f116621g;

    /* renamed from: h */
    private final MmDetailStickyNavLayout f116622h;

    /* renamed from: i */
    private VideoPlayerMode f116623i = VideoPlayerMode.Normal;

    /* renamed from: j */
    private MoreMenuDialog f116624j;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/mm/module/detail/titlebar/MmDetailTitleBarViewControl$VideoPlayerMode;", "", "(Ljava/lang/String;I)V", "TitleBarSmallWindow", "Normal", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    public enum VideoPlayerMode {
        TitleBarSmallWindow,
        Normal
    }

    @Override // com.ss.android.lark.mm.module.framework.MmBaseViewControl
    /* renamed from: e */
    public IMmInquirer mo161244e() {
        return this;
    }

    /* renamed from: l */
    public IMmDetailTitleBarListener mo161243c() {
        return this;
    }

    @Override // com.ss.android.lark.mm.module.detail.titlebar.IMmDetailTitleBarInquirer
    /* renamed from: b */
    public MmEditStateManager mo162723b() {
        return this.f116619e;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\b\n\n\u0002\b\n\n\u0002\b\n\n\u0002\b\n\n\u0002\b\n\n\u0002\b\n\n\u0002\b\n\n\u0002\b\n\n\u0002\b\n*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u0005H\u0016J\b\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\u0006H\u0016J\n\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J\n\u0010\f\u001a\u0004\u0018\u00010\u0006H\u0016J\b\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0016J\b\u0010\u0012\u001a\u00020\u0010H\u0016J\b\u0010\u0013\u001a\u00020\u0010H\u0016J\b\u0010\u0014\u001a\u00020\u0003H\u0016J\u0010\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0006H\u0016J\u0010\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0010H\u0016J\u0010\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0010H\u0016¨\u0006\u001a¸\u0006\u0000"}, d2 = {"com/ss/android/lark/mm/module/detail/titlebar/MmDetailTitleBarViewControl$showMoreMenu$1$1", "Lcom/ss/android/lark/mm/module/detail/menu/MmDetailMenuFactory$IMenuDependency;", "deleteMm", "", "onData", "Lkotlin/Function1;", "", "getBaseInfo", "Lcom/ss/android/lark/mm/module/detail/baseinfo/MmBaseInfo;", "getHost", "getMmHitPointContext", "Lcom/ss/android/lark/mm/statistics/hitpoint/MmHitPointContext;", "getToken", "getTranslateType", "Lcom/ss/android/lark/mm/module/detail/translate/MmTranslateLangType;", "isPageOwner", "", "isRemoteVideoPlayable", "isSwitchCommentOn", "isSwitchReactionOn", "onEditSpeakerCallback", "onRenameEditorCallback", "newName", "onSwitchComment", "isSwitchOn", "onSwitchReaction", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.detail.titlebar.MmDetailTitleBarViewControl$d */
    public static final class C46290d implements MmDetailMenuFactory.IMenuDependency {

        /* renamed from: a */
        final /* synthetic */ MmDetailTitleBarViewControl f116625a;

        @Override // com.ss.android.lark.mm.module.detail.menu.MmDetailMenuFactory.IMenuDependency
        /* renamed from: a */
        public boolean mo161955a() {
            return this.f116625a.f116616b;
        }

        @Override // com.ss.android.lark.mm.module.detail.menu.MmDetailMenuFactory.IMenuDependency
        /* renamed from: b */
        public boolean mo161957b() {
            return this.f116625a.f116617c;
        }

        @Override // com.ss.android.lark.mm.module.detail.menu.MmDetailMenuFactory.IMenuDependency
        /* renamed from: c */
        public MmTranslateLangType mo161958c() {
            return this.f116625a.f116621g.mo161230c().mo162740d();
        }

        @Override // com.ss.android.lark.mm.module.detail.menu.MmDetailMenuFactory.IMenuDependency
        /* renamed from: f */
        public boolean mo161961f() {
            return mo161959d().isOwner();
        }

        @Override // com.ss.android.lark.mm.module.detail.menu.MmDetailMenuFactory.IMenuDependency
        /* renamed from: g */
        public String mo161962g() {
            return mo161959d().getObjectToken();
        }

        @Override // com.ss.android.lark.mm.module.detail.menu.MmDetailMenuFactory.IMenuDependency
        /* renamed from: h */
        public boolean mo161963h() {
            return ((IMmDetailTitleBarDependency) this.f116625a.mo161247w()).mo162742f();
        }

        @Override // com.ss.android.lark.mm.module.detail.menu.MmDetailMenuFactory.IMenuDependency
        /* renamed from: j */
        public String mo161965j() {
            return ((IMmDetailTitleBarDependency) this.f116625a.mo161247w()).mo162745i();
        }

        @Override // com.ss.android.lark.mm.module.detail.menu.MmDetailMenuFactory.IMenuDependency
        /* renamed from: d */
        public MmBaseInfo mo161959d() {
            MmBaseInfo a = ((IMmDetailTitleBarDependency) this.f116625a.mo161247w()).mo162732a();
            if (a != null) {
                return a;
            }
            return this.f116625a.f116618d;
        }

        @Override // com.ss.android.lark.mm.module.detail.menu.MmDetailMenuFactory.IMenuDependency
        /* renamed from: e */
        public C47084f mo161960e() {
            return C45950b.m182104a(this.f116625a.f116620f.mo161232n()).mo161231e();
        }

        @Override // com.ss.android.lark.mm.module.detail.menu.MmDetailMenuFactory.IMenuDependency
        /* renamed from: i */
        public void mo161964i() {
            MmBaseInfo a = ((IMmDetailTitleBarDependency) this.f116625a.mo161247w()).mo162732a();
            if (a != null) {
                C47083e.m186425a(C47085h.m186430a(a), "vc_minutes_detail_click", C47086i.m186432a().mo165422d("speaker_edit_enter").mo165416b().mo165421c());
                this.f116625a.f116619e.mo162458a(((IMmDetailTitleBarDependency) this.f116625a.mo161247w()).mo162744h(), a, ((IMmDetailTitleBarDependency) this.f116625a.mo161247w()).mo162745i(), this.f116625a.f116620f.mo161234p());
            }
        }

        C46290d(MmDetailTitleBarViewControl mmDetailTitleBarViewControl) {
            this.f116625a = mmDetailTitleBarViewControl;
        }

        @Override // com.ss.android.lark.mm.module.detail.menu.MmDetailMenuFactory.IMenuDependency
        /* renamed from: a */
        public void mo161952a(final String str) {
            Intrinsics.checkParameterIsNotNull(str, "newName");
            ((IMmDetailTitleBarDependency) this.f116625a.mo161247w()).mo162734a(str, new Function0<Unit>(this) {
                /* class com.ss.android.lark.mm.module.detail.titlebar.MmDetailTitleBarViewControl.C46290d.C462922 */
                final /* synthetic */ C46290d this$0;

                {
                    this.this$0 = r1;
                }

                @Override // kotlin.jvm.functions.Function0
                public final void invoke() {
                    C47083e.m186425a(this.this$0.f116625a.f116620f.mo161231e(), "vc_minutes_detail_click", C47086i.m186432a().mo165422d("header_title_edit").mo165423e("none").mo165414a("is_change", !Intrinsics.areEqual(str, this.this$0.f116625a.f116615a.getTitle())).mo165421c());
                    this.this$0.f116625a.f116615a.setTitle(str);
                    String objectToken = this.this$0.f116625a.f116618d.getObjectToken();
                    Intrinsics.checkExpressionValueIsNotNull(objectToken, "baseInfo.objectToken");
                    ((IMmDetailTitleBarDependency) this.this$0.f116625a.mo161247w()).mo162733a(objectToken, str);
                    C45861b.m181700a().f115693d.mo161176a(new MinutesSummaryData(this.this$0.f116625a.f116618d.getObjectToken(), null, null, null, null, null, null, str, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, false, null, null, null, 268435326, null));
                }
            });
        }

        @Override // com.ss.android.lark.mm.module.detail.menu.MmDetailMenuFactory.IMenuDependency
        /* renamed from: b */
        public void mo161956b(boolean z) {
            this.f116625a.f116617c = z;
            this.f116625a.f116621g.mo161230c().mo162738b(z);
        }

        @Override // com.ss.android.lark.mm.module.detail.menu.MmDetailMenuFactory.IMenuDependency
        /* renamed from: a */
        public void mo161953a(final Function1<? super String, Unit> function1) {
            Intrinsics.checkParameterIsNotNull(function1, "onData");
            this.f116625a.f116621g.mo161230c().mo162735a(new Function1<String, Unit>(this) {
                /* class com.ss.android.lark.mm.module.detail.titlebar.MmDetailTitleBarViewControl.C46290d.C462911 */
                final /* synthetic */ C46290d this$0;

                {
                    this.this$0 = r1;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(String str) {
                    invoke(str);
                    return Unit.INSTANCE;
                }

                public final void invoke(String str) {
                    boolean z;
                    Intrinsics.checkParameterIsNotNull(str, "errorMsg");
                    if (str.length() == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        this.this$0.f116625a.f116615a.mo165593d();
                        ((IMmDetailTitleBarDependency) this.this$0.f116625a.mo161247w()).mo162743g();
                        C45861b.m181700a().f115692c.mo161176a(new MinutesSummaryData(this.this$0.f116625a.f116618d.getObjectToken(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, false, null, null, null, 268435454, null));
                    }
                    function1.invoke(str);
                }
            });
        }

        @Override // com.ss.android.lark.mm.module.detail.menu.MmDetailMenuFactory.IMenuDependency
        /* renamed from: a */
        public void mo161954a(boolean z) {
            this.f116625a.f116616b = z;
            this.f116625a.f116621g.mo161230c().mo162736a(z);
        }
    }

    @Override // com.ss.android.lark.mm.module.detail.titlebar.IMmDetailTitleBarInquirer
    /* renamed from: a */
    public boolean mo162722a() {
        return this.f116615a.mo165590a();
    }

    /* renamed from: j */
    public void mo162728j() {
        this.f116615a.setVisibility(8);
    }

    /* renamed from: k */
    public void mo162729k() {
        this.f116615a.setVisibility(0);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "invoke", "com/ss/android/lark/mm/module/detail/titlebar/MmDetailTitleBarViewControl$initTitleBar$1$2"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.detail.titlebar.MmDetailTitleBarViewControl$b */
    public static final class C46288b extends Lambda implements Function0<Unit> {
        final /* synthetic */ MmDetailTitleBarViewControl this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C46288b(MmDetailTitleBarViewControl mmDetailTitleBarViewControl) {
            super(0);
            this.this$0 = mmDetailTitleBarViewControl;
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
            this.this$0.f116619e.mo162474j();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "invoke", "com/ss/android/lark/mm/module/detail/titlebar/MmDetailTitleBarViewControl$initTitleBar$1$3"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.detail.titlebar.MmDetailTitleBarViewControl$c */
    public static final class C46289c extends Lambda implements Function0<Unit> {
        final /* synthetic */ MmDetailTitleBarViewControl this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C46289c(MmDetailTitleBarViewControl mmDetailTitleBarViewControl) {
            super(0);
            this.this$0 = mmDetailTitleBarViewControl;
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
            this.this$0.mo162727i();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "invoke", "com/ss/android/lark/mm/module/detail/titlebar/MmDetailTitleBarViewControl$showMoreMenu$1$2"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.detail.titlebar.MmDetailTitleBarViewControl$e */
    public static final class C46293e extends Lambda implements Function0<Unit> {
        final /* synthetic */ MmDetailTitleBarViewControl this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C46293e(MmDetailTitleBarViewControl mmDetailTitleBarViewControl) {
            super(0);
            this.this$0 = mmDetailTitleBarViewControl;
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
            this.this$0.f116621g.mo161230c().mo162737b();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "invoke", "com/ss/android/lark/mm/module/detail/titlebar/MmDetailTitleBarViewControl$showMoreMenu$1$3"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.detail.titlebar.MmDetailTitleBarViewControl$f */
    public static final class C46294f extends Lambda implements Function0<Unit> {
        final /* synthetic */ MmDetailTitleBarViewControl this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C46294f(MmDetailTitleBarViewControl mmDetailTitleBarViewControl) {
            super(0);
            this.this$0 = mmDetailTitleBarViewControl;
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
            this.this$0.f116621g.mo161230c().mo162739c();
        }
    }

    @Override // com.ss.android.lark.mm.module.framework.MmBaseViewControl
    public void be_() {
        super.be_();
        C45855f.m181664c("MmDetailTitleBarViewControl", "onCreate");
        m183276m();
    }

    @Override // com.ss.android.lark.mm.module.detail.titlebar.IMmDetailTitleBarInquirer
    /* renamed from: f */
    public boolean mo162725f() {
        if (this.f116623i == VideoPlayerMode.TitleBarSmallWindow) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "invoke", "com/ss/android/lark/mm/module/detail/titlebar/MmDetailTitleBarViewControl$initTitleBar$1$1"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.detail.titlebar.MmDetailTitleBarViewControl$a */
    public static final class C46287a extends Lambda implements Function0<Unit> {
        final /* synthetic */ MmDetailTitleBarViewControl this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C46287a(MmDetailTitleBarViewControl mmDetailTitleBarViewControl) {
            super(0);
            this.this$0 = mmDetailTitleBarViewControl;
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
            FragmentActivity a = C47107a.m186565a(this.this$0.f116620f.mo161232n());
            if (a != null) {
                a.finish();
            }
        }
    }

    @Override // com.ss.android.lark.mm.module.detail.titlebar.IMmDetailTitleBarListener
    public void bg_() {
        MmBaseInfo a = ((IMmDetailTitleBarDependency) mo161247w()).mo162732a();
        if (a == null || !a.isVideoType()) {
            this.f116622h.setForceHideTopView(false);
        } else {
            C47103g.m186550c(C47098d.m186533a(this.f116620f.mo161232n()));
            mo162728j();
        }
        this.f116615a.setIsEditMode(false);
    }

    /* renamed from: m */
    private final void m183276m() {
        MmDetailTitleBar mmDetailTitleBar = this.f116615a;
        MmBaseInfo a = ((IMmDetailTitleBarDependency) mo161247w()).mo162732a();
        if (a == null || !a.isVideoType()) {
            mo162729k();
        } else {
            mo162728j();
        }
        mmDetailTitleBar.setOnBackListener(new C46287a(this));
        mmDetailTitleBar.setOnExitEditModeListener(new C46288b(this));
        if (this.f116618d != null && ((IMmDetailTitleBarDependency) mo161247w()).mo162741e()) {
            mmDetailTitleBar.setOnMoreListener(new C46289c(this));
            mmDetailTitleBar.mo165589a(((IMmDetailTitleBarDependency) mo161247w()).mo162732a());
        }
    }

    @Override // com.ss.android.lark.mm.module.detail.titlebar.IMmDetailTitleBarListener
    /* renamed from: g */
    public void mo162726g() {
        String str;
        MmBaseInfo a = ((IMmDetailTitleBarDependency) mo161247w()).mo162732a();
        if (a == null || !a.isVideoType()) {
            this.f116622h.setForceHideTopView(true);
        } else {
            C47103g.m186551d(C47098d.m186533a(this.f116620f.mo161232n()));
            mo162729k();
            MmDetailTitleBar mmDetailTitleBar = this.f116615a;
            MmBaseInfo a2 = ((IMmDetailTitleBarDependency) mo161247w()).mo162732a();
            if (a2 != null) {
                str = a2.getTopic();
            } else {
                str = null;
            }
            mmDetailTitleBar.setTitle(str);
        }
        this.f116615a.setIsEditMode(true);
    }

    @Override // com.ss.android.lark.mm.module.detail.titlebar.IMmDetailTitleBarListener
    /* renamed from: i */
    public void mo162727i() {
        FragmentActivity a;
        Dialog v_;
        if (this.f116618d != null && ((IMmDetailTitleBarDependency) mo161247w()).mo162741e() && (a = C47107a.m186565a(this.f116620f.mo161232n())) != null) {
            MoreMenuDialog fVar = this.f116624j;
            if (fVar == null || (v_ = fVar.v_()) == null || !v_.isShowing()) {
                C47083e.m186423a(this.f116620f.mo161232n(), "vc_mm_click_button", C47086i.m186432a().mo165409a("more").mo165421c());
                C47083e.m186423a(this.f116620f.mo161232n(), "vc_minutes_detail_click", C47086i.m186432a().mo165422d("more").mo165423e("vc_minutes_detail_more_view").mo165421c());
                MoreMenuDialog fVar2 = new MoreMenuDialog(C45950b.m182104a(this.f116620f.mo161232n()).mo161321d(), new C46290d(this));
                this.f116624j = fVar2;
                if (fVar2 != null) {
                    FragmentManager supportFragmentManager = a.getSupportFragmentManager();
                    Intrinsics.checkExpressionValueIsNotNull(supportFragmentManager, "it.supportFragmentManager");
                    fVar2.mo5511a(supportFragmentManager, "more");
                }
                MoreMenuDialog fVar3 = this.f116624j;
                if (fVar3 != null) {
                    fVar3.mo165769a(new C46293e(this));
                }
                MoreMenuDialog fVar4 = this.f116624j;
                if (fVar4 != null) {
                    fVar4.mo165770b(new C46294f(this));
                }
            }
        }
    }

    @Override // com.ss.android.lark.mm.module.detail.titlebar.IMmDetailTitleBarListener
    /* renamed from: a */
    public void mo162720a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "content");
        this.f116615a.setEditStatusText(str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0057, code lost:
        if (r3.intValue() != r0) goto L_0x005c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    @Override // com.ss.android.lark.mm.module.detail.titlebar.IMmDetailTitleBarListener
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo162719a(com.ss.android.lark.mm.module.share.model.PermissionStatus r3) {
        /*
        // Method dump skipped, instructions count: 108
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.mm.module.detail.titlebar.MmDetailTitleBarViewControl.mo162719a(com.ss.android.lark.mm.module.share.model.PermissionStatus):void");
    }

    @Override // com.ss.android.lark.mm.module.detail.titlebar.IMmDetailTitleBarListener
    /* renamed from: a */
    public void mo162721a(boolean z) {
        String str;
        String topic;
        MediaType.Companion aVar = MediaType.Companion;
        MmBaseInfo mmBaseInfo = this.f116618d;
        if (mmBaseInfo != null) {
            str = mmBaseInfo.getMediaType();
        } else {
            str = null;
        }
        if (aVar.mo161472a(str) != MediaType.Video) {
            String str2 = "";
            if (z) {
                if (this.f116623i == VideoPlayerMode.TitleBarSmallWindow) {
                    this.f116623i = VideoPlayerMode.Normal;
                    this.f116615a.setTitle(str2);
                    this.f116615a.mo165592c();
                }
            } else if (this.f116623i == VideoPlayerMode.Normal) {
                this.f116623i = VideoPlayerMode.TitleBarSmallWindow;
                MmDetailTitleBar mmDetailTitleBar = this.f116615a;
                MmBaseInfo mmBaseInfo2 = this.f116618d;
                if (!(mmBaseInfo2 == null || (topic = mmBaseInfo2.getTopic()) == null)) {
                    str2 = topic;
                }
                mmDetailTitleBar.setTitle(str2);
                this.f116615a.mo165591b();
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MmDetailTitleBarViewControl(IMmViewControlContext gVar, MmBaseViewControlAdapter<IMmDetailTitleBarListener, IMmDetailTitleBarDependency> jVar) {
        super(gVar, jVar);
        Intrinsics.checkParameterIsNotNull(gVar, "vcContext");
        Intrinsics.checkParameterIsNotNull(jVar, "controlAdapter");
        this.f116620f = gVar;
        this.f116621g = jVar;
        View findViewById = gVar.mo161233o().findViewById(R.id.titleBar);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "vcContext.getRootView().…ndViewById(R.id.titleBar)");
        this.f116615a = (MmDetailTitleBar) findViewById;
        View findViewById2 = gVar.mo161233o().findViewById(R.id.stickyLayout);
        Intrinsics.checkExpressionValueIsNotNull(findViewById2, "vcContext.getRootView().…ewById(R.id.stickyLayout)");
        this.f116622h = (MmDetailStickyNavLayout) findViewById2;
        this.f116618d = jVar.mo161230c().mo162732a();
        this.f116619e = new MmEditStateManager();
    }
}
