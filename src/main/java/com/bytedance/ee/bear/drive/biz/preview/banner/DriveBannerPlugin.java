package com.bytedance.ee.bear.drive.biz.preview.banner;

import android.text.TextUtils;
import android.view.View;
import androidx.lifecycle.AbstractC1178x;
import com.bytedance.ee.bear.browser.plugin.AbstractC4958n;
import com.bytedance.ee.bear.drive.biz.preview.AbsDrivePreviewPlugin;
import com.bytedance.ee.bear.drive.common.p342b.C6891a;
import com.bytedance.ee.bear.drive.core.DrivePluginHost;
import com.bytedance.ee.bear.drive.core.load.IFileLoader;
import com.bytedance.ee.bear.drive.loader.model.InfoCode;
import com.bytedance.ee.bear.drive.view.preview.wrapper.C7555f;
import com.bytedance.ee.log.C13479a;
import com.google.firebase.messaging.Constants;
import com.larksuite.component.universe_design.notice.UDNotice;
import com.larksuite.suite.R;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import java.util.Iterator;
import java.util.LinkedList;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001$B\u0005¢\u0006\u0002\u0010\u0002JZ\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\f2\b\b\u0002\u0010\u0014\u001a\u00020\u00122\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0002J\u0010\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\fH\u0002J\b\u0010\u001a\u001a\u00020\nH\u0002J\u0010\u0010\u001b\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\u0018\u0010\u001e\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020 H\u0016J\n\u0010!\u001a\u0004\u0018\u00010\u0004H\u0002J\u0010\u0010\"\u001a\u00020\n2\u0006\u0010#\u001a\u00020\u0004H\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\bX\u0004¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"Lcom/bytedance/ee/bear/drive/biz/preview/banner/DriveBannerPlugin;", "Lcom/bytedance/ee/bear/drive/biz/preview/AbsDrivePreviewPlugin;", "()V", "mCurrentNotice", "Lcom/bytedance/ee/bear/drive/biz/preview/banner/DriveBannerPlugin$Notice;", "mNoticeLayout", "Lcom/larksuite/component/universe_design/notice/UDNotice;", "mNoticeQueue", "Ljava/util/LinkedList;", "add", "", "drawableRes", "", ShareHitPoint.f121869d, "Lcom/larksuite/component/universe_design/notice/UDNotice$Type;", "tip", "", "canClose", "", "id", "overlay", "clickText", "clickListener", "Landroid/view/View$OnClickListener;", "handlePolicyError", "permissionStatusCode", "handleShowNoticeImpl", "onAttachToHost", "host", "Lcom/bytedance/ee/bear/drive/core/DrivePluginHost;", "onAttachToUIContainer", "uiContainer", "Lcom/bytedance/ee/bear/browser/plugin/UIContainer;", "poll", "showNoticeView", "notice", "Notice", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class DriveBannerPlugin extends AbsDrivePreviewPlugin {
    private Notice mCurrentNotice;
    public UDNotice mNoticeLayout;
    private final LinkedList<Notice> mNoticeQueue = new LinkedList<>();

    /* access modifiers changed from: private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001c\b\b\u0018\u00002\u00020\u0001BS\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0002\u0010\u000fJ\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0007HÆ\u0003J\t\u0010 \u001a\u00020\tHÆ\u0003J\t\u0010!\u001a\u00020\u0005HÆ\u0003J\t\u0010\"\u001a\u00020\tHÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u000eHÆ\u0003J]\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eHÆ\u0001J\u0013\u0010&\u001a\u00020\t2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010(\u001a\u00020\u0005HÖ\u0001J\t\u0010)\u001a\u00020\u0007HÖ\u0001R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0011\u0010\u000b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0013R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u0006*"}, d2 = {"Lcom/bytedance/ee/bear/drive/biz/preview/banner/DriveBannerPlugin$Notice;", "", ShareHitPoint.f121869d, "Lcom/larksuite/component/universe_design/notice/UDNotice$Type;", "drawableRes", "", "tips", "", "showClose", "", "id", "overlay", "clickText", "clickListener", "Landroid/view/View$OnClickListener;", "(Lcom/larksuite/component/universe_design/notice/UDNotice$Type;ILjava/lang/String;ZIZLjava/lang/String;Landroid/view/View$OnClickListener;)V", "getClickListener", "()Landroid/view/View$OnClickListener;", "getClickText", "()Ljava/lang/String;", "getDrawableRes", "()I", "getId", "getOverlay", "()Z", "getShowClose", "getTips", "getType", "()Lcom/larksuite/component/universe_design/notice/UDNotice$Type;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "toString", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.biz.preview.banner.DriveBannerPlugin$a */
    public static final class Notice {

        /* renamed from: a */
        private final UDNotice.Type f17995a;

        /* renamed from: b */
        private final int f17996b;

        /* renamed from: c */
        private final String f17997c;

        /* renamed from: d */
        private final boolean f17998d;

        /* renamed from: e */
        private final int f17999e;

        /* renamed from: f */
        private final boolean f18000f;

        /* renamed from: g */
        private final String f18001g;

        /* renamed from: h */
        private final View.OnClickListener f18002h;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Notice) {
                    Notice aVar = (Notice) obj;
                    if (Intrinsics.areEqual(this.f17995a, aVar.f17995a)) {
                        if ((this.f17996b == aVar.f17996b) && Intrinsics.areEqual(this.f17997c, aVar.f17997c)) {
                            if (this.f17998d == aVar.f17998d) {
                                if (this.f17999e == aVar.f17999e) {
                                    if (!(this.f18000f == aVar.f18000f) || !Intrinsics.areEqual(this.f18001g, aVar.f18001g) || !Intrinsics.areEqual(this.f18002h, aVar.f18002h)) {
                                        return false;
                                    }
                                }
                            }
                        }
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            UDNotice.Type type = this.f17995a;
            int i = 0;
            int hashCode = (((type != null ? type.hashCode() : 0) * 31) + this.f17996b) * 31;
            String str = this.f17997c;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
            boolean z = this.f17998d;
            int i2 = 1;
            if (z) {
                z = true;
            }
            int i3 = z ? 1 : 0;
            int i4 = z ? 1 : 0;
            int i5 = z ? 1 : 0;
            int i6 = (((hashCode2 + i3) * 31) + this.f17999e) * 31;
            boolean z2 = this.f18000f;
            if (!z2) {
                i2 = z2 ? 1 : 0;
            }
            int i7 = (i6 + i2) * 31;
            String str2 = this.f18001g;
            int hashCode3 = (i7 + (str2 != null ? str2.hashCode() : 0)) * 31;
            View.OnClickListener onClickListener = this.f18002h;
            if (onClickListener != null) {
                i = onClickListener.hashCode();
            }
            return hashCode3 + i;
        }

        public String toString() {
            return "Notice(type=" + this.f17995a + ", drawableRes=" + this.f17996b + ", tips=" + this.f17997c + ", showClose=" + this.f17998d + ", id=" + this.f17999e + ", overlay=" + this.f18000f + ", clickText=" + this.f18001g + ", clickListener=" + this.f18002h + ")";
        }

        /* renamed from: a */
        public final UDNotice.Type mo26124a() {
            return this.f17995a;
        }

        /* renamed from: b */
        public final int mo26125b() {
            return this.f17996b;
        }

        /* renamed from: c */
        public final String mo26126c() {
            return this.f17997c;
        }

        /* renamed from: d */
        public final boolean mo26127d() {
            return this.f17998d;
        }

        /* renamed from: e */
        public final int mo26128e() {
            return this.f17999e;
        }

        /* renamed from: f */
        public final String mo26130f() {
            return this.f18001g;
        }

        /* renamed from: g */
        public final View.OnClickListener mo26131g() {
            return this.f18002h;
        }

        public Notice(UDNotice.Type type, int i, String str, boolean z, int i2, boolean z2, String str2, View.OnClickListener onClickListener) {
            Intrinsics.checkParameterIsNotNull(type, ShareHitPoint.f121869d);
            Intrinsics.checkParameterIsNotNull(str, "tips");
            this.f17995a = type;
            this.f17996b = i;
            this.f17997c = str;
            this.f17998d = z;
            this.f17999e = i2;
            this.f18000f = z2;
            this.f18001g = str2;
            this.f18002h = onClickListener;
        }
    }

    private final Notice poll() {
        return this.mNoticeQueue.poll();
    }

    public final void handleShowNoticeImpl() {
        Notice poll = poll();
        if (poll != null) {
            showNoticeView(poll);
            return;
        }
        UDNotice uDNotice = this.mNoticeLayout;
        if (uDNotice != null) {
            uDNotice.setVisibility(8);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J%\u0010\u0002\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u0001H\u0004H\u0016¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"com/bytedance/ee/bear/drive/biz/preview/banner/DriveBannerPlugin$onAttachToHost$1", "Lcom/bytedance/ee/bear/drive/core/load/IFileLoader$SimpleLoadListener;", "onInfo", "", "T", "code", "Lcom/bytedance/ee/bear/drive/loader/model/InfoCode;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "(Lcom/bytedance/ee/bear/drive/loader/model/InfoCode;Ljava/lang/Object;)V", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.biz.preview.banner.DriveBannerPlugin$b */
    public static final class C6541b extends IFileLoader.SimpleLoadListener {

        /* renamed from: a */
        final /* synthetic */ DriveBannerPlugin f18003a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C6541b(DriveBannerPlugin driveBannerPlugin) {
            this.f18003a = driveBannerPlugin;
        }

        @Override // com.bytedance.ee.bear.drive.core.load.IFileLoader.SimpleLoadListener, com.bytedance.ee.bear.drive.core.load.IFileLoader.LoadListener
        /* renamed from: a */
        public <T> void mo25427a(InfoCode infoCode, T t) {
            Intrinsics.checkParameterIsNotNull(infoCode, "code");
            if (C6545a.f18008a[infoCode.ordinal()] == 1 && (t instanceof Integer)) {
                this.f18003a.handlePolicyError(t.intValue());
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.biz.preview.banner.DriveBannerPlugin$d */
    public static final class View$OnClickListenerC6543d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ DriveBannerPlugin f18005a;

        View$OnClickListenerC6543d(DriveBannerPlugin driveBannerPlugin) {
            this.f18005a = driveBannerPlugin;
        }

        public final void onClick(View view) {
            this.f18005a.handleShowNoticeImpl();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.biz.preview.banner.DriveBannerPlugin$e */
    public static final class View$OnClickListenerC6544e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ DriveBannerPlugin f18006a;

        /* renamed from: b */
        final /* synthetic */ Notice f18007b;

        View$OnClickListenerC6544e(DriveBannerPlugin driveBannerPlugin, Notice aVar) {
            this.f18006a = driveBannerPlugin;
            this.f18007b = aVar;
        }

        public final void onClick(View view) {
            this.f18007b.mo26131g().onClick(view);
            UDNotice uDNotice = this.f18006a.mNoticeLayout;
            if (uDNotice != null) {
                uDNotice.setVisibility(8);
            }
            this.f18006a.handleShowNoticeImpl();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/bytedance/ee/bear/drive/view/preview/wrapper/PreviewViewModel$DriveTipsData;", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.biz.preview.banner.DriveBannerPlugin$c */
    public static final class C6542c<T> implements AbstractC1178x<C7555f.C7556a> {

        /* renamed from: a */
        final /* synthetic */ DriveBannerPlugin f18004a;

        C6542c(DriveBannerPlugin driveBannerPlugin) {
            this.f18004a = driveBannerPlugin;
        }

        /* renamed from: a */
        public final void onChanged(C7555f.C7556a aVar) {
            UDNotice.Type type;
            int i;
            if (aVar != null) {
                if (aVar.mo29564b() == 1) {
                    type = UDNotice.Type.WARNING;
                    i = R.drawable.ud_icon_warning_hollow_filled;
                } else {
                    type = UDNotice.Type.INFO;
                    i = R.drawable.ud_icon_info_hollow_filled;
                }
                this.f18004a.add(i, type, aVar.mo29559a(), true, aVar.mo29570f(), aVar.mo29569e(), aVar.mo29567c(), aVar.mo29568d());
            }
        }
    }

    public final void handlePolicyError(int i) {
        if (i == 10009) {
            add$default(this, R.drawable.ud_icon_warning_hollow_filled, UDNotice.Type.ERROR, getString(R.string.Drive_Drive_DisableShareByPolicy), false, 0, false, null, null, 240, null);
        } else if (i == 10013) {
            add$default(this, R.drawable.ud_icon_warning_hollow_filled, UDNotice.Type.ERROR, getString(R.string.Drive_Drive_DiscardedFileHint), false, 0, false, null, null, 240, null);
        }
    }

    @Override // com.bytedance.ee.bear.drive.core.AbsDrivePlugin
    public void onAttachToHost(DrivePluginHost aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "host");
        super.onAttachToHost(aVar);
        aVar.mo27262m().mo27297a(new C6541b(this));
        C6891a.m27236d(aVar).getLiveInnerChangeTipsState().mo5923a(getLifecycleOwner(), new C6542c(this));
    }

    private final void showNoticeView(Notice aVar) {
        UDNotice uDNotice;
        UDNotice uDNotice2 = this.mNoticeLayout;
        if ((uDNotice2 == null || uDNotice2.getVisibility() != 0) && (uDNotice = this.mNoticeLayout) != null) {
            uDNotice.setVisibility(0);
        }
        UDNotice uDNotice3 = this.mNoticeLayout;
        if (uDNotice3 != null) {
            uDNotice3.setType(aVar.mo26124a());
        }
        if (TextUtils.isEmpty(aVar.mo26130f()) || aVar.mo26131g() == null) {
            UDNotice uDNotice4 = this.mNoticeLayout;
            if (uDNotice4 != null) {
                uDNotice4.setText(aVar.mo26126c());
            }
        } else {
            String str = aVar.mo26126c() + aVar.mo26130f();
            UDNotice uDNotice5 = this.mNoticeLayout;
            if (uDNotice5 != null) {
                uDNotice5.setText(str);
            }
            try {
                UDNotice uDNotice6 = this.mNoticeLayout;
                if (uDNotice6 != null) {
                    uDNotice6.mo91029a(aVar.mo26126c().length(), str.length(), new View$OnClickListenerC6544e(this, aVar));
                }
            } catch (Exception e) {
                C13479a.m54761a("DriveComponent", e);
            }
        }
        UDNotice uDNotice7 = this.mNoticeLayout;
        if (uDNotice7 != null) {
            uDNotice7.setIcon(aVar.mo26125b());
        }
        if (aVar.mo26127d()) {
            UDNotice uDNotice8 = this.mNoticeLayout;
            if (uDNotice8 != null) {
                uDNotice8.mo91032b(true);
            }
            UDNotice uDNotice9 = this.mNoticeLayout;
            if (uDNotice9 != null) {
                uDNotice9.setIconButton(R.drawable.ud_icon_close_small_outlined);
            }
        } else {
            UDNotice uDNotice10 = this.mNoticeLayout;
            if (uDNotice10 != null) {
                uDNotice10.mo91032b(false);
            }
        }
        this.mCurrentNotice = aVar;
    }

    @Override // com.bytedance.ee.bear.drive.biz.preview.AbsDrivePreviewPlugin
    public void onAttachToUIContainer(DrivePluginHost aVar, AbstractC4958n nVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "host");
        Intrinsics.checkParameterIsNotNull(nVar, "uiContainer");
        super.onAttachToUIContainer(aVar, nVar);
        View a = nVar.mo19583a(R.id.drive_notice_layout);
        if (a != null) {
            UDNotice uDNotice = (UDNotice) a;
            this.mNoticeLayout = uDNotice;
            if (uDNotice != null) {
                uDNotice.setIconButtonListener(new View$OnClickListenerC6543d(this));
                return;
            }
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.larksuite.component.universe_design.notice.UDNotice");
    }

    public final void add(int i, UDNotice.Type type, String str, boolean z, int i2, boolean z2, String str2, View.OnClickListener onClickListener) {
        String str3;
        if (z2) {
            Notice aVar = this.mCurrentNotice;
            if (aVar == null || aVar.mo26128e() != i2) {
                Iterator<Notice> it = this.mNoticeQueue.iterator();
                while (it.hasNext()) {
                    if (it.next().mo26128e() == i2) {
                        return;
                    }
                }
            } else {
                return;
            }
        }
        LinkedList<Notice> linkedList = this.mNoticeQueue;
        if (str != null) {
            str3 = str;
        } else {
            str3 = "";
        }
        linkedList.add(new Notice(type, i, str3, z, i2, z2, str2, onClickListener));
        UDNotice uDNotice = this.mNoticeLayout;
        if (uDNotice == null || uDNotice.getVisibility() != 0) {
            handleShowNoticeImpl();
        }
    }

    static /* synthetic */ void add$default(DriveBannerPlugin driveBannerPlugin, int i, UDNotice.Type type, String str, boolean z, int i2, boolean z2, String str2, View.OnClickListener onClickListener, int i3, Object obj) {
        int i4;
        boolean z3;
        int i5;
        boolean z4;
        String str3;
        View.OnClickListener onClickListener2;
        if ((i3 & 1) != 0) {
            i4 = R.drawable.ud_icon_info_hollow_filled;
        } else {
            i4 = i;
        }
        if ((i3 & 8) != 0) {
            z3 = true;
        } else {
            z3 = z;
        }
        if ((i3 & 16) != 0) {
            i5 = 0;
        } else {
            i5 = i2;
        }
        if ((i3 & 32) != 0) {
            z4 = false;
        } else {
            z4 = z2;
        }
        if ((i3 & 64) != 0) {
            str3 = null;
        } else {
            str3 = str2;
        }
        if ((i3 & SmActions.ACTION_ONTHECALL_EXIT) != 0) {
            onClickListener2 = null;
        } else {
            onClickListener2 = onClickListener;
        }
        driveBannerPlugin.add(i4, type, str, z3, i5, z4, str3, onClickListener2);
    }
}
