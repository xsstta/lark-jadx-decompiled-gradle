package com.ss.android.lark.integrator.ccm.config.viewbinder;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.util.LongSparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.request.AbstractC2536f;
import com.bumptech.glide.request.p095a.AbstractC2522j;
import com.bytedance.ee.bear.basesdk.api.AbstractC4394r;
import com.bytedance.ee.bear.lark.p413a.C7962a;
import com.bytedance.ee.bear.lark.p417e.C8033a;
import com.bytedance.ee.bear.lark.p417e.C8035c;
import com.bytedance.ee.bear.lark.p421h.C8043a;
import com.bytedance.ee.bear.lark.statistics.doc.DocHitPoint;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.p391g.C7804b;
import com.bytedance.ee.util.C13655e;
import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.space.doc.v1.UpdateDocPermissionRequest;
import com.bytedance.lark.pb.space.doc.v1.UpdateDocPermissionResponse;
import com.larksuite.component.ui.display.manager.C25649b;
import com.larksuite.component.universe_design.dialog.UDBaseListDialogBuilder;
import com.larksuite.component.universe_design.dialog.UDListDialogController;
import com.larksuite.component.universe_design.dialog.actionpanel.UDActionPanelBuilder;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.biz.im.api.IIMApi;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.doc.entity.AbstractC36839d;
import com.ss.android.lark.doc.entity.Doc;
import com.ss.android.lark.doc.entity.DocCard;
import com.ss.android.lark.doc.entity.DocPermPair;
import com.ss.android.lark.doc.entity.DocPermission;
import com.ss.android.lark.doc.entity.DocResult;
import com.ss.android.lark.doc.entity.DocType;
import com.ss.android.lark.doc.entity.Extra;
import com.ss.android.lark.doc.entity.ThumbnailDetail;
import com.ss.android.lark.featuregating.C37239a;
import com.ss.android.lark.integrator.ccm.p2006c.C39242e;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.p1786d.C36443k;
import com.ss.android.lark.sdk.SdkSender;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.utils.rxjava.C57865c;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class DocCardViewBinder implements AbstractC36839d {

    /* renamed from: b */
    private static int f100601b = -1;

    /* renamed from: a */
    private Context f100602a;

    @Override // com.ss.android.lark.doc.entity.AbstractC36839d
    /* renamed from: a */
    public void mo135981a(View view, DocResult docResult, String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z, boolean z2, boolean z3, boolean z4) {
        String str8;
        String str9;
        String str10;
        Log.m165379d("DocCardViewBinder", "start onBindView");
        DocCardViewHolder docCardViewHolder = (DocCardViewHolder) view.getTag();
        Doc doc = docResult.getDoc();
        if (doc != null) {
            docCardViewHolder.f100611a.setVisibility(0);
            String str11 = doc.getAbstract();
            if (!TextUtils.isEmpty(str11)) {
                m154928a(str11, docCardViewHolder.thumbImageView);
                C39242e.m154771a().mo143085a(m154912a(str11, doc, docCardViewHolder));
            } else {
                Log.m165383e("DocCardViewBinder", "previewThumbUrl is empty");
            }
            docCardViewHolder.previewThumbContainer.setOnClickListener(new View.OnClickListener(z2, str6, docResult) {
                /* class com.ss.android.lark.integrator.ccm.config.viewbinder.$$Lambda$DocCardViewBinder$BrvTV9rna8TcEIwuqjCCrp86wNM */
                public final /* synthetic */ boolean f$1;
                public final /* synthetic */ String f$2;
                public final /* synthetic */ DocResult f$3;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                    this.f$3 = r4;
                }

                public final void onClick(View view) {
                    DocCardViewBinder.lambda$BrvTV9rna8TcEIwuqjCCrp86wNM(Doc.this, this.f$1, this.f$2, this.f$3, view);
                }
            });
            if (z4) {
                docCardViewHolder.previewThumbContainer.setBackground(UIUtils.getDrawable(this.f100602a, R.drawable.doc_bg_doc_preview_thumb_container));
                int dp2px = UIUtils.dp2px(this.f100602a, 1.0f);
                docCardViewHolder.previewThumbContainer.setPadding(dp2px, dp2px, dp2px, dp2px);
            } else {
                docCardViewHolder.previewThumbContainer.setBackgroundColor(UIUtils.getColor(this.f100602a, R.color.transparent));
                docCardViewHolder.previewThumbContainer.setPadding(0, 0, 0, 0);
            }
            if (!z2) {
                str9 = str2;
                str10 = str3;
                str8 = str4;
            } else {
                str9 = str5;
                str8 = str7;
                str10 = str6;
            }
            m154925a(docCardViewHolder, docResult, str2, z2, z3, z, str, str3, new C7962a((FragmentActivity) this.f100602a, doc.getId(), m154909a(doc.getDocType()), doc.getOwnerId(), doc.getOwnerName(), z2 ? C7962a.f21397b : C7962a.f21396a, z, str10, str9, str8), doc.getDocType());
        } else {
            docCardViewHolder.f100611a.setVisibility(8);
            Log.m165383e("DocCardViewBinder", "doc is null");
        }
        if (doc != null && !TextUtils.isEmpty(doc.getUrl())) {
            m154927a(doc.getUrl());
        }
        Log.m165379d("DocCardViewBinder", "end onBindView");
    }

    /* renamed from: a */
    private void m154928a(String str, ImageView imageView) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) imageView.getLayoutParams();
        int measuredWidth = imageView.getMeasuredWidth();
        int i = f100601b;
        if (i > 0) {
            measuredWidth = i;
        }
        if (measuredWidth > 0) {
            layoutParams.width = measuredWidth;
            int i2 = (int) (((float) measuredWidth) / 1.7f);
            if (i2 > 0) {
                layoutParams.height = i2;
                imageView.setLayoutParams(layoutParams);
            }
            f100601b = measuredWidth;
        }
        Log.m165379d("HWC", "width:" + layoutParams.width + "--height:" + layoutParams.height + "--url:" + str);
    }

    /* renamed from: a */
    private void m154925a(DocCardViewHolder docCardViewHolder, DocResult docResult, String str, boolean z, boolean z2, boolean z3, String str2, String str3, C7962a aVar, DocType docType) {
        String str4;
        DocCard docCard = docResult.getDocCard();
        Log.m165389i("DocCardViewBinder", "showDocPermStatusView & isSlef= " + z2);
        Log.m165389i("DocCardViewBinder", "sendId=" + str2 + " p2pChatterId= " + str3);
        if (!z2 || TextUtils.equals(str2, str3)) {
            Log.m165379d("DocCardViewBinder", "not sender");
            docCardViewHolder.permStatusContainer.setVisibility(0);
            docCardViewHolder.askOwnerView.setVisibility(8);
            docCardViewHolder.permStatusView.setVisibility(8);
            DocPermission userPermission = docCard.getUserPermission();
            if (userPermission.canEdit() || userPermission.canRead()) {
                docCardViewHolder.pointIv.setVisibility(8);
                str4 = UIHelper.mustacheFormat((int) R.string.Lark_Docs_ShareDocsPermission, "permission", m154930b(userPermission));
            } else {
                docCardViewHolder.pointIv.setVisibility(0);
                str4 = UIHelper.getString(R.string.Lark_Docs_ShareDocsNoPermission);
            }
            docCardViewHolder.shareInfoView.setText(str4);
            return;
        }
        docCardViewHolder.permStatusView.setVisibility(0);
        long shareStatus = docCard.getShareStatus();
        LongSparseArray<Integer> a = C8033a.m32093a();
        Log.m165389i("DocCardViewBinder", "shareStatus = " + shareStatus);
        if (shareStatus > 1) {
            boolean z4 = !z || (docCard.getExtra() != null && docCard.getExtra().owner_in_group);
            if (!C8033a.m32094a(shareStatus) || !z4) {
                int i = R.string.Lark_Docs_ShareDocs_DefaultInfo;
                if (a.indexOfKey(shareStatus) >= 0) {
                    i = a.get(shareStatus).intValue();
                }
                docCardViewHolder.askOwnerView.setVisibility(8);
                docCardViewHolder.permStatusContainer.setVisibility(0);
                String string = UIHelper.getString(i);
                Log.m165389i("DocCardViewBinder", "hasSharePerm：" + string);
                docCardViewHolder.shareInfoView.setText(string);
                docCardViewHolder.permStatusView.setVisibility(8);
                if (C8033a.m32096b(shareStatus)) {
                    docCardViewHolder.pointIv.setVisibility(0);
                } else {
                    docCardViewHolder.pointIv.setVisibility(8);
                }
            } else {
                Log.m165389i("DocCardViewBinder", "noSharePerm");
                if (docCard.getReceiverPermission().canRead()) {
                    m154924a(docCardViewHolder, docCard, z, str);
                } else {
                    m154926a(docCardViewHolder, z, aVar);
                }
            }
        } else if (m154929a(docCard, z3)) {
            m154931b(docCardViewHolder, docCard, z, str);
            m154923a(docCardViewHolder, docCard, docType, z3, z, aVar);
        } else {
            m154931b(docCardViewHolder, docCard, z, str);
        }
    }

    /* renamed from: a */
    private boolean m154929a(DocCard docCard, boolean z) {
        boolean a = C37239a.m146648b().mo136952a("spacekit.mobile.external_share_tips_enable", false);
        boolean senderIsExternal = docCard.getSenderIsExternal();
        Extra extra = docCard.getExtra();
        boolean hasReadOrEditPer = extra != null ? extra.hasReadOrEditPer() : false;
        Log.m165389i("DocCardViewBinder", "senderIsExternal = " + senderIsExternal + " isCrossTenant = " + z + " = " + hasReadOrEditPer);
        if (!a || !hasReadOrEditPer) {
            return false;
        }
        if ((!senderIsExternal || z) && (senderIsExternal || !z)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private void m154924a(DocCardViewHolder docCardViewHolder, DocCard docCard, boolean z, String str) {
        Log.m165379d("DocCardViewBinder", "showTextWithoutSharePerm");
        docCardViewHolder.permStatusView.setVisibility(8);
        docCardViewHolder.permStatusContainer.setVisibility(0);
        docCardViewHolder.askOwnerView.setVisibility(8);
        docCardViewHolder.pointIv.setVisibility(8);
        docCardViewHolder.shareInfoView.setText(C8035c.m32108a(z, str, m154913a(docCard.getReceiverPermission())));
    }

    /* renamed from: a */
    private void m154926a(DocCardViewHolder docCardViewHolder, boolean z, C7962a aVar) {
        Log.m165379d("DocCardViewBinder", "showAskOwnerUI");
        docCardViewHolder.permStatusView.setVisibility(8);
        docCardViewHolder.permStatusContainer.setVisibility(8);
        docCardViewHolder.askOwnerView.setVisibility(0);
        docCardViewHolder.pointIv.setVisibility(8);
        ((ViewGroup.MarginLayoutParams) docCardViewHolder.orangeTipsIV.getLayoutParams()).leftMargin = 0;
        ((ViewGroup.MarginLayoutParams) docCardViewHolder.askOwnerTv.getLayoutParams()).rightMargin = 0;
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) docCardViewHolder.askOwnerView.getLayoutParams();
        layoutParams.bottomMargin = 0;
        layoutParams.topMargin = 0;
        String charSequence = this.f100602a.getText(z ? R.string.Lark_Docs_ChatDocAskOwnerText : R.string.Lark_Docs_AskOwerP2PText).toString();
        String str = charSequence + this.f100602a.getText(R.string.Lark_Docs_ChatDocAskOwnerButton).toString();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f100602a.getResources().getColor(R.color.text_title)), 0, charSequence.length(), 33);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f100602a.getResources().getColor(R.color.text_link_normal)), charSequence.length(), str.length(), 33);
        docCardViewHolder.askOwnerTv.setText(spannableStringBuilder);
        docCardViewHolder.askOwnerTv.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.integrator.ccm.config.viewbinder.$$Lambda$DocCardViewBinder$b5ZTlIZNsnwovF5jDtL8VfWMbLc */

            public final void onClick(View view) {
                DocCardViewBinder.lambda$b5ZTlIZNsnwovF5jDtL8VfWMbLc(C7962a.this, view);
            }
        });
        docCardViewHolder.askOwnerView.setVisibility(0);
    }

    /* renamed from: a */
    private void m154923a(DocCardViewHolder docCardViewHolder, DocCard docCard, DocType docType, boolean z, boolean z2, C7962a aVar) {
        Log.m165379d("DocCardViewBinder", "showCancelSharedUI  isGroup = " + z2);
        docCardViewHolder.askOwnerView.setVisibility(0);
        docCardViewHolder.pointIv.setVisibility(8);
        ((ViewGroup.MarginLayoutParams) docCardViewHolder.orangeTipsIV.getLayoutParams()).leftMargin = UIUtils.dp2px(this.f100602a, 8.0f);
        ((ViewGroup.MarginLayoutParams) docCardViewHolder.askOwnerTv.getLayoutParams()).rightMargin = UIUtils.dp2px(this.f100602a, 8.0f);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) docCardViewHolder.askOwnerView.getLayoutParams();
        layoutParams.bottomMargin = C13655e.m55411a(6);
        layoutParams.topMargin = C13655e.m55411a(12);
        String string = this.f100602a.getString(z ? z2 ? R.string.Lark_Permission_ChatExternalDesc : R.string.Lark_Permission_ExternalPersonTips : R.string.Lark_Permission_ExternalOwnerShareTips);
        String str = string + this.f100602a.getText(R.string.Lark_Permission_CancelGrantButton).toString();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f100602a.getResources().getColor(R.color.text_title)), 0, string.length(), 33);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f100602a.getResources().getColor(R.color.text_link_normal)), string.length(), str.length(), 33);
        docCardViewHolder.askOwnerTv.setText(spannableStringBuilder);
        docCardViewHolder.askOwnerTv.setOnClickListener(new View.OnClickListener(docType, docCard, aVar) {
            /* class com.ss.android.lark.integrator.ccm.config.viewbinder.$$Lambda$DocCardViewBinder$eEOxruRNtl_sxapc0qAEoG5bevM */
            public final /* synthetic */ DocType f$1;
            public final /* synthetic */ DocCard f$2;
            public final /* synthetic */ C7962a f$3;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
            }

            public final void onClick(View view) {
                DocCardViewBinder.lambda$eEOxruRNtl_sxapc0qAEoG5bevM(DocCardViewBinder.this, this.f$1, this.f$2, this.f$3, view);
            }
        });
        docCardViewHolder.askOwnerView.setVisibility(0);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m154921a(DocType docType, DocCard docCard, C7962a aVar, View view) {
        Log.m165389i("DocCardViewBinder", "removeUserPermission");
        C7804b.m31283a().mo17149p().mo17075a(m154909a(docType), docCard.getDocId(), aVar.mo30880f(), aVar.mo30882h(), docCard.getExtra().isPageStateSinglePage() ? 2 : 1, new AbstractC4394r() {
            /* class com.ss.android.lark.integrator.ccm.config.viewbinder.DocCardViewBinder.C392732 */

            @Override // com.bytedance.ee.bear.middleground_permission_export.model.AbstractC10169g
            /* renamed from: a */
            public void mo17110a() {
            }

            @Override // com.bytedance.ee.bear.middleground_permission_export.model.AbstractC10169g
            /* renamed from: a */
            public void mo17112a(Throwable th) {
                Log.m165384e("DocCardViewBinder", "removePermission fail", th);
            }

            @Override // com.bytedance.ee.bear.middleground_permission_export.model.AbstractC10169g
            /* renamed from: a */
            public void mo17111a(int i) {
                Log.m165389i("DocCardViewBinder", "removePermission onRequestSuccess permission = " + i);
            }
        });
    }

    /* renamed from: a */
    private void m154918a(DocCard docCard, String str, boolean z) {
        String str2;
        String str3;
        DocPermission currentDocPerm = docCard.getCurrentDocPerm();
        ArrayList arrayList = new ArrayList();
        if (z) {
            str2 = this.f100602a.getString(R.string.Lark_Docs_ChatDocPermissionRead3rdpl);
        } else {
            str2 = this.f100602a.getString(R.string.Lark_Docs_ChatDocPermissionRead);
        }
        String a = C8035c.m32108a(z, str, str2);
        if (z) {
            str3 = this.f100602a.getString(R.string.Lark_Docs_ChatDocPermissionEdit3rdpl);
        } else {
            str3 = this.f100602a.getString(R.string.Lark_Docs_ChatDocPermissionEdit);
        }
        String a2 = C8035c.m32108a(z, str, str3);
        UDBaseListDialogBuilder.ListItemBuilder bVar = new UDBaseListDialogBuilder.ListItemBuilder(a);
        DocPermPair.PermType forNumber = DocPermPair.PermType.forNumber(currentDocPerm.getPermTypeNum());
        DocPermPair.PermType permType = DocPermPair.PermType.READ;
        int i = R.color.function_info_700;
        arrayList.add(bVar.mo90888b(forNumber == permType ? R.color.function_info_700 : R.color.text_title).mo90889c());
        UDBaseListDialogBuilder.ListItemBuilder bVar2 = new UDBaseListDialogBuilder.ListItemBuilder(a2);
        if (DocPermPair.PermType.forNumber(currentDocPerm.getPermTypeNum()) != DocPermPair.PermType.EDIT) {
            i = R.color.text_title;
        }
        arrayList.add(bVar2.mo90888b(i).mo90889c());
        ((UDActionPanelBuilder) ((UDActionPanelBuilder) ((UDActionPanelBuilder) new UDActionPanelBuilder(this.f100602a).mo90873b(arrayList)).mo90869a(new UDListDialogController.OnItemClickListener(currentDocPerm, docCard) {
            /* class com.ss.android.lark.integrator.ccm.config.viewbinder.$$Lambda$DocCardViewBinder$vLMtoGG7evJjlh03d6W2Zb_Adg4 */
            public final /* synthetic */ DocPermission f$1;
            public final /* synthetic */ DocCard f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            @Override // com.larksuite.component.universe_design.dialog.UDListDialogController.OnItemClickListener
            public final void onItemClick(int i) {
                DocCardViewBinder.lambda$vLMtoGG7evJjlh03d6W2Zb_Adg4(DocCardViewBinder.this, this.f$1, this.f$2, i);
            }
        })).addActionButton(R.id.ud_dialog_btn_cancel, R.string.Lark_Legacy_Cancel, (DialogInterface.OnClickListener) null)).show();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m154920a(DocPermission docPermission, DocCard docCard, int i) {
        if (i != 0) {
            if (i == 1 && DocPermPair.PermType.EDIT.getNumber() != docPermission.getPermTypeNum()) {
                m154917a(docCard, DocPermPair.PermType.forNumber(DocPermPair.PermType.EDIT.getNumber()));
            }
        } else if (DocPermPair.PermType.READ.getNumber() != docPermission.getPermTypeNum()) {
            m154917a(docCard, DocPermPair.PermType.forNumber(DocPermPair.PermType.READ.getNumber()));
        }
    }

    /* renamed from: a */
    private void m154917a(final DocCard docCard, final DocPermPair.PermType permType) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new DocPermPair(docCard.getMessageId(), docCard.getDocId(), permType));
        mo143146a(arrayList, new UIGetDataCallback<List<String>>() {
            /* class com.ss.android.lark.integrator.ccm.config.viewbinder.DocCardViewBinder.C392743 */

            @Override // com.larksuite.framework.callback.UIGetDataCallback
            public void onErrored(ErrorResult errorResult) {
                Log.m165383e("DocCardViewBinder", errorResult.toString());
            }

            /* renamed from: a */
            public void onSuccessed(List<String> list) {
                boolean z;
                Iterator<DocPermission> it = docCard.getPermissions().iterator();
                while (true) {
                    z = true;
                    if (!it.hasNext()) {
                        break;
                    }
                    DocPermission next = it.next();
                    if (next.getPermTypeNum() != permType.getNumber()) {
                        z = false;
                    }
                    next.setIsSet(z);
                }
                DocHitPoint.Companion aVar = DocHitPoint.f21534a;
                if (permType != DocPermPair.PermType.EDIT) {
                    z = false;
                }
                aVar.mo31081a(z);
            }
        });
    }

    /* renamed from: a */
    public void mo143146a(List<DocPermPair> list, UIGetDataCallback<List<String>> uIGetDataCallback) {
        if (list != null && list.size() > 0) {
            ArrayList arrayList = new ArrayList();
            for (DocPermPair docPermPair : list) {
                arrayList.add(new UpdateDocPermissionRequest.Pair(docPermPair.getMessageId(), UpdateDocPermissionRequest.Permission.fromValue(docPermPair.getPerm().getNumber()), docPermPair.getDocToken()));
            }
            SdkSender.asynSendRequestNonWrap(Command.UPDATE_DOC_PERMISSION, new UpdateDocPermissionRequest.C19291a().mo65791a(arrayList), uIGetDataCallback, new SdkSender.IParser<List<String>>() {
                /* class com.ss.android.lark.integrator.ccm.config.viewbinder.DocCardViewBinder.C392754 */

                /* renamed from: a */
                public List<String> parse(byte[] bArr) throws IOException {
                    return UpdateDocPermissionResponse.ADAPTER.decode(bArr).success_message_ids;
                }
            });
        }
    }

    /* renamed from: a */
    private void m154927a(String str) {
        C39242e.m154771a().mo143091a(Collections.singletonList(str));
    }

    /* renamed from: a */
    public static void m154922a(DocCardViewHolder docCardViewHolder) {
        C25649b.m91853a(docCardViewHolder.pointIv, 14);
        C25649b.m91856a(docCardViewHolder.shareInfoView, 14);
        C25649b.m91856a(docCardViewHolder.permStatusView, 14);
        C25649b.m91853a(docCardViewHolder.orangeTipsIV, 14);
        C25649b.m91856a(docCardViewHolder.askOwnerTv, 14);
    }

    public class DocCardViewHolder_ViewBinding implements Unbinder {

        /* renamed from: a */
        private DocCardViewHolder f100612a;

        @Override // butterknife.Unbinder
        public void unbind() {
            DocCardViewHolder docCardViewHolder = this.f100612a;
            if (docCardViewHolder != null) {
                this.f100612a = null;
                docCardViewHolder.previewThumbContainer = null;
                docCardViewHolder.thumbImageView = null;
                docCardViewHolder.thumbLoadFailView = null;
                docCardViewHolder.permStatusContainer = null;
                docCardViewHolder.shareInfoView = null;
                docCardViewHolder.permStatusView = null;
                docCardViewHolder.askOwnerView = null;
                docCardViewHolder.askOwnerTv = null;
                docCardViewHolder.pointIv = null;
                docCardViewHolder.orangeTipsIV = null;
                docCardViewHolder.permTypeTv = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }

        public DocCardViewHolder_ViewBinding(DocCardViewHolder docCardViewHolder, View view) {
            this.f100612a = docCardViewHolder;
            docCardViewHolder.previewThumbContainer = (ViewGroup) Utils.findRequiredViewAsType(view, R.id.doc_card_preview_thumb_layout, "field 'previewThumbContainer'", ViewGroup.class);
            docCardViewHolder.thumbImageView = (ImageView) Utils.findRequiredViewAsType(view, R.id.doc_card_preview_thumb, "field 'thumbImageView'", ImageView.class);
            docCardViewHolder.thumbLoadFailView = (ImageView) Utils.findRequiredViewAsType(view, R.id.doc_card_preview_image_load_fail, "field 'thumbLoadFailView'", ImageView.class);
            docCardViewHolder.permStatusContainer = Utils.findRequiredView(view, R.id.doc_card_perm_status_layout, "field 'permStatusContainer'");
            docCardViewHolder.shareInfoView = (TextView) Utils.findRequiredViewAsType(view, R.id.doc_card_perm_share_info, "field 'shareInfoView'", TextView.class);
            docCardViewHolder.permStatusView = (TextView) Utils.findRequiredViewAsType(view, R.id.doc_card_perm_status, "field 'permStatusView'", TextView.class);
            docCardViewHolder.askOwnerView = Utils.findRequiredView(view, R.id.doc_card_ask_owner, "field 'askOwnerView'");
            docCardViewHolder.askOwnerTv = (TextView) Utils.findRequiredViewAsType(view, R.id.askOwnerTv, "field 'askOwnerTv'", TextView.class);
            docCardViewHolder.pointIv = Utils.findRequiredView(view, R.id.doc_card_exclamation_point, "field 'pointIv'");
            docCardViewHolder.orangeTipsIV = (ImageView) Utils.findRequiredViewAsType(view, R.id.doc_card_exclamation_point_orange, "field 'orangeTipsIV'", ImageView.class);
            docCardViewHolder.permTypeTv = (TextView) Utils.findRequiredViewAsType(view, R.id.doc_card_perm_type, "field 'permTypeTv'", TextView.class);
        }
    }

    /* renamed from: a */
    private Drawable m154910a() {
        int dp2px = UIUtils.dp2px(this.f100602a, 10.0f);
        Drawable drawable = this.f100602a.getDrawable(R.drawable.ud_icon_av_set_down_outlined);
        drawable.setTint(UIUtils.getColor(this.f100602a, R.color.primary_pri_500));
        drawable.setBounds(0, 0, dp2px, dp2px);
        return drawable;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.integrator.ccm.config.viewbinder.DocCardViewBinder$5 */
    public static /* synthetic */ class C392765 {

        /* renamed from: a */
        static final /* synthetic */ int[] f100610a;

        /* JADX WARNING: Can't wrap try/catch for region: R(18:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|(3:17|18|20)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
            // Method dump skipped, instructions count: 109
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.integrator.ccm.config.viewbinder.DocCardViewBinder.C392765.<clinit>():void");
        }
    }

    public DocCardViewBinder(Context context) {
        this.f100602a = context;
    }

    @Override // com.ss.android.lark.doc.entity.AbstractC36839d
    /* renamed from: a */
    public View mo135980a(ViewGroup viewGroup) {
        return DocCardViewHolder.m154943a(viewGroup).f100611a;
    }

    /* access modifiers changed from: protected */
    public static class DocCardViewHolder {

        /* renamed from: a */
        View f100611a;
        @BindView(8164)
        public TextView askOwnerTv;
        @BindView(8534)
        public View askOwnerView;
        @BindView(8536)
        public ImageView orangeTipsIV;
        @BindView(8539)
        public View permStatusContainer;
        @BindView(8538)
        public TextView permStatusView;
        @BindView(8540)
        public TextView permTypeTv;
        @BindView(8535)
        public View pointIv;
        @BindView(8544)
        public ViewGroup previewThumbContainer;
        @BindView(8537)
        public TextView shareInfoView;
        @BindView(8543)
        public ImageView thumbImageView;
        @BindView(8541)
        public ImageView thumbLoadFailView;

        public DocCardViewHolder(View view) {
            this.f100611a = view;
            view.setTag(this);
            ButterKnife.bind(this, view);
        }

        /* renamed from: a */
        public static DocCardViewHolder m154943a(ViewGroup viewGroup) {
            View a = C36443k.m143598a(viewGroup.getContext()).mo134293a(viewGroup.getContext(), R.layout.doc_message_card_layout, viewGroup);
            DocCardViewHolder docCardViewHolder = new DocCardViewHolder(a);
            if (DesktopUtil.m144301a(viewGroup.getContext())) {
                ViewGroup.LayoutParams layoutParams = a.findViewById(R.id.doc_card_preview_thumb_layout).getLayoutParams();
                layoutParams.width = Math.min(UIHelper.dp2px(346.0f), (int) ((((float) UIHelper.getWindowWidth(viewGroup.getContext())) * 2.0f) / 3.0f));
                layoutParams.height = Math.min(UIHelper.dp2px(176.0f), (int) ((((float) layoutParams.width) * 3.0f) / 4.0f));
                a.getLayoutParams().width = -2;
            } else {
                DocCardViewBinder.m154922a(docCardViewHolder);
            }
            return docCardViewHolder;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ C7962a m154911a(C7962a aVar) {
        aVar.mo30875a(((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getResUrlByResKey(aVar.mo30884j(), 240, 240));
        return aVar;
    }

    /* renamed from: b */
    private String m154930b(DocPermission docPermission) {
        Log.m165379d("DocCardViewBinder", "can Edit = " + docPermission.canEdit() + " can Read = " + docPermission.canRead());
        if (docPermission.canEdit()) {
            return UIHelper.getString(R.string.Lark_Legacy_ChatDocPermissionEdit);
        }
        return UIHelper.getString(R.string.Lark_Legacy_ChatDocPermissionView);
    }

    /* renamed from: c */
    private String m154932c(DocPermission docPermission) {
        Log.m165379d("DocCardViewBinder", "can Edit = " + docPermission.canEdit() + " can Read = " + docPermission.canRead());
        if (docPermission.canEdit()) {
            return UIHelper.getString(R.string.Lark_Docs_ChatDocPermissionEdit3rdpl);
        }
        return UIHelper.getString(R.string.Lark_Docs_ChatDocPermissionRead3rdpl);
    }

    /* renamed from: a */
    private int m154909a(DocType docType) {
        if (docType == null) {
            return C8275a.f22369b.mo32555b();
        }
        switch (C392765.f100610a[docType.ordinal()]) {
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 12;
            case 4:
                return 11;
            case 5:
                return 15;
            case 6:
                return 8;
            case 7:
                return 16;
            case 8:
                return C8275a.f22378k.mo32555b();
            default:
                return C8275a.f22369b.mo32555b();
        }
    }

    /* renamed from: a */
    private String m154913a(DocPermission docPermission) {
        Log.m165379d("DocCardViewBinder", "can Edit = " + docPermission.canEdit() + " can Read = " + docPermission.canRead());
        if (docPermission.canEdit()) {
            return UIHelper.getString(R.string.Lark_Docs_ChatDocPermissionEdit);
        }
        return UIHelper.getString(R.string.Lark_Docs_ChatDocPermissionRead);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m154914a(C7962a aVar, View view) {
        C57865c.m224574a(new C57865c.AbstractC57873d() {
            /* class com.ss.android.lark.integrator.ccm.config.viewbinder.$$Lambda$DocCardViewBinder$OjGge5dnng2fqB4FKy7iW_bLF5o */

            @Override // com.ss.android.lark.utils.rxjava.C57865c.AbstractC57873d
            public final Object produce() {
                return DocCardViewBinder.lambda$OjGge5dnng2fqB4FKy7iW_bLF5o(C7962a.this);
            }
        }, new C57865c.AbstractC57871b() {
            /* class com.ss.android.lark.integrator.ccm.config.viewbinder.$$Lambda$DocCardViewBinder$nMveuxCmYgGdrD0dD3X1iL7UeBA */

            @Override // com.ss.android.lark.utils.rxjava.C57865c.AbstractC57871b
            public final void consume(Object obj) {
                DocCardViewBinder.lambda$nMveuxCmYgGdrD0dD3X1iL7UeBA(C7962a.this, (C7962a) obj);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m154915a(C7962a aVar, C7962a aVar2) {
        C7804b.m31283a().mo17149p().mo17076a(aVar);
    }

    /* renamed from: a */
    private C8043a m154912a(String str, Doc doc, final DocCardViewHolder docCardViewHolder) {
        C8043a.C8044a a = new C8043a.C8044a().mo31099a(this.f100602a).mo31102a(str).mo31100a(docCardViewHolder.thumbImageView).mo31105b(R.color.lkui_N100).mo31108c(doc.getDocType().getNumber()).mo31101a(new AbstractC2536f() {
            /* class com.ss.android.lark.integrator.ccm.config.viewbinder.DocCardViewBinder.C392721 */

            @Override // com.bumptech.glide.request.AbstractC2536f
            /* renamed from: a */
            public boolean mo11204a(GlideException glideException, Object obj, AbstractC2522j jVar, boolean z) {
                Log.m165386e("DocCardViewBinder", glideException);
                docCardViewHolder.thumbImageView.setVisibility(8);
                docCardViewHolder.thumbLoadFailView.setImageResource(R.drawable.common_failed_chat_picture);
                docCardViewHolder.thumbLoadFailView.setVisibility(0);
                return true;
            }

            @Override // com.bumptech.glide.request.AbstractC2536f
            /* renamed from: a */
            public boolean mo11205a(Object obj, Object obj2, AbstractC2522j jVar, DataSource dataSource, boolean z) {
                docCardViewHolder.thumbImageView.setVisibility(0);
                docCardViewHolder.thumbLoadFailView.setVisibility(8);
                return false;
            }
        });
        ThumbnailDetail thumbnaimDetail = doc.getThumbnaimDetail();
        if (thumbnaimDetail != null) {
            try {
                a.mo31111e("chat").mo31098a(Integer.parseInt(thumbnaimDetail.cipherType)).mo31106b(thumbnaimDetail.thumbnailUrlMobile).mo31109c(thumbnaimDetail.decryptKeyMobile).mo31110d(thumbnaimDetail.decryptNonceMobile);
            } catch (Exception e) {
                Log.m165386e("DocCardViewBinder", e);
            }
        }
        return a.mo31104a();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m154919a(DocCard docCard, String str, boolean z, View view) {
        m154918a(docCard, str, z);
    }

    /* renamed from: b */
    private void m154931b(DocCardViewHolder docCardViewHolder, DocCard docCard, boolean z, String str) {
        String str2;
        int i;
        String str3;
        Log.m165379d("DocCardViewBinder", "showPermissionCouldPutText");
        List<DocPermission> permissions = docCard.getPermissions();
        DocPermission userPermission = docCard.getUserPermission();
        docCardViewHolder.askOwnerView.setVisibility(8);
        docCardViewHolder.pointIv.setVisibility(8);
        if (userPermission.canShare()) {
            Log.m165379d("DocCardViewBinder", "userPermission.canShare");
            boolean z2 = false;
            docCardViewHolder.permStatusView.setVisibility(0);
            if (z) {
                str2 = UIHelper.getString(R.string.Lark_Docs_DocsActionsheetTip);
            } else {
                str2 = str;
            }
            if (permissions.size() != 0) {
                docCardViewHolder.permStatusContainer.setVisibility(0);
                if (permissions.size() > 1) {
                    z2 = true;
                }
                Log.m165389i("DocCardViewBinder", "canEditPerm" + z2);
                docCardViewHolder.permStatusView.setEnabled(z2);
                TextView textView = docCardViewHolder.permStatusView;
                if (z2) {
                    i = R.color.primary_pri_500;
                } else {
                    i = R.color.text_title;
                }
                textView.setTextColor(UIHelper.getColor(i));
                Drawable a = m154910a();
                TextView textView2 = docCardViewHolder.permStatusView;
                if (!z2) {
                    a = null;
                }
                textView2.setCompoundDrawables(null, null, a, null);
                DocPermission currentDocPerm = docCard.getCurrentDocPerm();
                if (z) {
                    str3 = m154932c(currentDocPerm);
                } else {
                    str3 = m154913a(currentDocPerm);
                }
                docCardViewHolder.permStatusView.setText(str3);
            } else {
                Log.m165383e("DocCardViewBinder", "docPermissions.size() == 0 !");
                docCardViewHolder.permStatusContainer.setVisibility(8);
            }
            docCardViewHolder.permStatusView.setOnClickListener(new View.OnClickListener(docCard, str, z) {
                /* class com.ss.android.lark.integrator.ccm.config.viewbinder.$$Lambda$DocCardViewBinder$HpHBRSax4ggfqA8ESE0ZMVNmSF8 */
                public final /* synthetic */ DocCard f$1;
                public final /* synthetic */ String f$2;
                public final /* synthetic */ boolean f$3;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                    this.f$3 = r4;
                }

                public final void onClick(View view) {
                    DocCardViewBinder.lambda$HpHBRSax4ggfqA8ESE0ZMVNmSF8(DocCardViewBinder.this, this.f$1, this.f$2, this.f$3, view);
                }
            });
            docCardViewHolder.permTypeTv.setVisibility(8);
        } else {
            docCardViewHolder.permStatusView.setVisibility(8);
            str2 = UIHelper.getString(R.string.Lark_Docs_NoSharePermission);
        }
        docCardViewHolder.shareInfoView.setText(str2);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m154916a(Doc doc, boolean z, String str, DocResult docResult, View view) {
        C39242e.m154771a().mo143097a(C39242e.m154771a().mo143101b(doc.getUrl(), "message"), (Map<String, String>) null);
        DocHitPoint.f21534a.mo31082a(z, 1);
        ((IIMApi) ApiUtils.getApi(IIMApi.class)).sendChatDocsClicked(str, docResult);
        ((IIMApi) ApiUtils.getApi(IIMApi.class)).auditLinkEvent(doc.getUrl());
    }
}
