package com.bytedance.ee.bear.bizwidget.shareview;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ee.bear.bizwidget.shareview.C4882b;
import com.bytedance.ee.bear.facade.common.widget.Toast;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p702e.C13657b;
import com.huawei.hms.android.HwBuildEx;
import com.larksuite.suite.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ExternalShareView extends LinearLayout {

    /* renamed from: a */
    private Context f14366a;

    /* renamed from: b */
    private AbstractC4881a f14367b;

    /* renamed from: c */
    private RecyclerView f14368c;

    /* renamed from: d */
    private C4882b f14369d;

    /* renamed from: e */
    private List<ShareItemModel> f14370e;

    /* renamed from: f */
    private boolean f14371f;

    /* renamed from: a */
    private void m20123a() {
        View inflate = LayoutInflater.from(this.f14366a).inflate(R.layout.share_widget_share_view, (ViewGroup) this, true);
        C4882b bVar = new C4882b();
        this.f14369d = bVar;
        bVar.mo19189a(this.f14370e);
        this.f14368c = (RecyclerView) inflate.findViewById(R.id.share_recycler_view);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        linearLayoutManager.setOrientation(0);
        this.f14368c.setLayoutManager(linearLayoutManager);
        this.f14368c.addItemDecoration(new C4886c(this.f14366a, linearLayoutManager));
        this.f14368c.setAdapter(this.f14369d);
        this.f14369d.mo19187a(new C4882b.AbstractC4884a() {
            /* class com.bytedance.ee.bear.bizwidget.shareview.$$Lambda$ExternalShareView$YrMfWnubWNpMAoxHG4ySIhWkWK0 */

            @Override // com.bytedance.ee.bear.bizwidget.shareview.C4882b.AbstractC4884a
            public final void onItemClick(ShareItemModel shareItemModel) {
                ExternalShareView.lambda$YrMfWnubWNpMAoxHG4ySIhWkWK0(ExternalShareView.this, shareItemModel);
            }
        });
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ee.bear.bizwidget.shareview.ExternalShareView$1 */
    public static /* synthetic */ class C48801 {

        /* renamed from: a */
        static final /* synthetic */ int[] f14372a;

        /* JADX WARNING: Can't wrap try/catch for region: R(26:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|26) */
        /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0084 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
            // Method dump skipped, instructions count: 145
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.bear.bizwidget.shareview.ExternalShareView.C48801.<clinit>():void");
        }
    }

    public void setInterceptNotClick(boolean z) {
        this.f14371f = z;
    }

    public void setOnShareItemClickListener(AbstractC4881a aVar) {
        this.f14367b = aVar;
    }

    public ExternalShareView(Context context) {
        this(context, null);
    }

    public void setItemImageIconSize(int i) {
        this.f14369d.mo19186a(i);
    }

    public void setLayoutManager(RecyclerView.LayoutManager layoutManager) {
        this.f14368c.removeItemDecorationAt(0);
        this.f14368c.setLayoutManager(layoutManager);
        this.f14368c.addItemDecoration(new C4886c(getContext(), layoutManager));
    }

    /* renamed from: a */
    private void m20124a(int i) {
        Resources resources = this.f14366a.getResources();
        this.f14370e = new ArrayList(Arrays.asList(new ShareItemModel(ShareType.Download, R.drawable.ud_icon_download_outlined, resources.getString(R.string.Doc_BizWidget_Download), R.color.icon_n1, i), new ShareItemModel(ShareType.Lark, R.drawable.ud_icon_forward_outlined, resources.getString(R.string.Doc_BizWidget_SendToChat), R.color.icon_n1, i), new ShareItemModel(ShareType.CopyText, R.drawable.ud_icon_copy_outlined, resources.getString(R.string.CreationMobile_CopyText), R.color.icon_n1, i), new ShareItemModel(ShareType.CopyLink, R.drawable.ud_icon_link_copy_outlined, resources.getString(R.string.Doc_Facade_CopyLink), R.color.icon_n1, i), new ShareItemModel(ShareType.ExportImage, R.drawable.ud_icon_image_outlined, resources.getString(R.string.Doc_BizWidget_ShareImage), R.color.icon_n1, i), new ShareItemModel(ShareType.SlideExport, R.drawable.ud_icon_export_outlined, resources.getString(R.string.Doc_BizWidget_Export), R.color.icon_n1, i), new ShareItemModel(ShareType.Wechat, R.drawable.ud_icon_wechat_colorful, resources.getString(R.string.Doc_BizWidget_WeChat), 0, i), new ShareItemModel(ShareType.WechatMoments, R.drawable.ud_icon_wechat_friend_colorful, resources.getString(R.string.Doc_BizWidget_Moments), 0, i), new ShareItemModel(ShareType.QQ, R.drawable.ud_icon_qq_colorful, resources.getString(R.string.Doc_BizWidget_QQ), 0, i), new ShareItemModel(ShareType.Weibo, R.drawable.ud_icon_weibo_colorful, resources.getString(R.string.Doc_BizWidget_Weibo), 0, i), new ShareItemModel(ShareType.ByteMoments, R.drawable.icon_share_byte_moment, resources.getString(R.string.Doc_BizWidget_ShareToByMoments), 0, i), new ShareItemModel(ShareType.More, R.drawable.ud_icon_more_outlined, resources.getString(R.string.Doc_BizWidget_More), R.color.icon_n1, i)));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m20126a(ShareItemModel shareItemModel) {
        if (this.f14367b != null) {
            switch (C48801.f14372a[shareItemModel.getType().ordinal()]) {
                case 1:
                    this.f14367b.mo19175a();
                    return;
                case 2:
                    this.f14367b.H_();
                    return;
                case 3:
                    this.f14367b.mo19176c();
                    return;
                case 4:
                    if (shareItemModel.isClickable()) {
                        this.f14367b.mo19177d();
                        return;
                    } else if (shareItemModel.getState() == ShareState.ADMIN_NOT_CLICK) {
                        Toast.showText(this.f14366a, (int) R.string.CreationMobile_ECM_AdminDisableToast);
                        return;
                    } else if (shareItemModel.getState() == ShareState.NOT_CLICK) {
                        Context context = this.f14366a;
                        Toast.showText(context, context.getString(R.string.Doc_BizWidget_CannotExportImage), 0);
                        return;
                    } else {
                        return;
                    }
                case 5:
                    if (shareItemModel.isClickable()) {
                        this.f14367b.I_();
                        return;
                    } else if (shareItemModel.getState() == ShareState.ADMIN_NOT_CLICK) {
                        Toast.showText(this.f14366a, (int) R.string.CreationMobile_ECM_AdminDisableToast);
                        return;
                    } else if (shareItemModel.getState() == ShareState.NOT_CLICK) {
                        Context context2 = this.f14366a;
                        Toast.showText(context2, context2.getString(R.string.Doc_BizWidget_CannotExportImage), 0);
                        return;
                    } else {
                        return;
                    }
                case 6:
                    this.f14367b.mo19178f();
                    return;
                case 7:
                    this.f14367b.mo19179g();
                    return;
                case 8:
                    this.f14367b.mo19180h();
                    return;
                case 9:
                    this.f14367b.mo19181i();
                    return;
                case 10:
                    this.f14367b.mo19182j();
                    return;
                case 11:
                    this.f14367b.mo19183k();
                    return;
                case HwBuildEx.VersionCodes.EMUI_5_1 /*{ENCODED_INT: 12}*/:
                    if (shareItemModel.isClickable()) {
                        this.f14367b.mo19184l();
                        return;
                    } else if (shareItemModel.getState() == ShareState.ADMIN_NOT_CLICK) {
                        Toast.showText(this.f14366a, (int) R.string.CreationMobile_ECM_AdminDisableToast);
                        return;
                    } else if (shareItemModel.getState() != ShareState.NOT_CLICK || !this.f14371f) {
                        this.f14367b.mo19184l();
                        return;
                    } else {
                        Context context3 = this.f14366a;
                        Toast.showText(context3, context3.getString(R.string.Doc_BizWidget_CannotExportImage), 0);
                        return;
                    }
                default:
                    return;
            }
        }
    }

    /* renamed from: a */
    public void mo19155a(List<ShareItemModel> list) {
        if (!C13657b.m55421a(list)) {
            C13479a.m54764b("ExternalShareView", "updateShareItemState(), size:" + list.size());
            for (ShareItemModel shareItemModel : list) {
                Iterator<ShareItemModel> it = this.f14370e.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    ShareItemModel next = it.next();
                    if (next.getType() == shareItemModel.getType()) {
                        next.setState(shareItemModel.getState());
                        break;
                    }
                }
            }
            this.f14369d.mo19189a(this.f14370e);
            this.f14369d.notifyDataSetChanged();
        }
    }

    /* renamed from: a */
    private void m20125a(Context context, int i) {
        this.f14366a = context;
        m20124a(i);
        m20123a();
    }

    public ExternalShareView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f14371f = true;
        m20125a(context, context.obtainStyledAttributes(attributeSet, new int[]{R.attr.shareItemBackground}).getResourceId(0, R.color.bg_float));
    }

    /* renamed from: a */
    public void mo19154a(ShareType shareType, ShareState shareState) {
        C13479a.m54764b("ExternalShareView", "setShareItem: type = " + shareType + " state = " + shareState);
        Iterator<ShareItemModel> it = this.f14370e.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            ShareItemModel next = it.next();
            if (next.getType() == shareType) {
                next.setState(shareState);
                break;
            }
        }
        this.f14369d.mo19189a(this.f14370e);
        this.f14369d.notifyDataSetChanged();
    }

    public ExternalShareView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet);
    }
}
