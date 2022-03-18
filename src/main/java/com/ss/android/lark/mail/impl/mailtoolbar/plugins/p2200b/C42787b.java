package com.ss.android.lark.mail.impl.mailtoolbar.plugins.p2200b;

import android.text.TextUtils;
import androidx.lifecycle.AbstractC1142af;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mail.impl.entity.AddressType;
import com.ss.android.lark.mail.impl.entity.C42095h;
import com.ss.android.lark.mail.impl.entity.EntOptionalSignature;
import com.ss.android.lark.mail.impl.entity.EntSignatureUsage;
import com.ss.android.lark.mail.impl.entity.MailAddress;
import com.ss.android.lark.mail.impl.entity.MailEntSignature;
import com.ss.android.lark.mail.impl.entity.MailImage;
import com.ss.android.lark.mail.impl.p2171h.C42330c;
import com.ss.android.lark.mail.impl.service.C43362e;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.lark.mail.impl.mailtoolbar.plugins.b.b */
public class C42787b extends AbstractC1142af {
    private MailAddress currentAddress;
    private String currentSignatureId = "0";
    private AbstractC42788a delegate;
    private boolean isNewMail;
    private Map<String, EntOptionalSignature> optionalSignatureMap = new HashMap();
    private List<MailEntSignature> signatureList = new ArrayList();
    private Map<String, MailEntSignature> signatureMap = new HashMap();
    private List<EntSignatureUsage> signatureUsageList = new ArrayList();

    /* renamed from: com.ss.android.lark.mail.impl.mailtoolbar.plugins.b.b$a */
    public interface AbstractC42788a {
        /* renamed from: a */
        Boolean mo150679a();

        /* renamed from: a */
        void mo150680a(String str);

        /* renamed from: b */
        String mo150681b();

        /* renamed from: b */
        void mo150682b(String str);

        /* renamed from: c */
        String mo150683c();

        /* renamed from: d */
        void mo150684d();
    }

    public String getCurrentSignatureId() {
        return this.currentSignatureId;
    }

    public List<MailImage> getCurrentImageList() {
        return getImageListById(this.currentSignatureId);
    }

    public String getCurrentDefaultId() {
        return getDefaultId(getCurrentAddress());
    }

    public List<MailEntSignature> getCurrentUsableSignatureList() {
        return getUsableSignatureList(getCurrentAddress());
    }

    public void onSendClick() {
        reportEntSignatureEvent(C42330c.C42334c.f107681h, getSignatureType(getCurrentSignatureId()));
    }

    public void removeEditorSignature() {
        AbstractC42788a aVar = this.delegate;
        if (aVar != null) {
            aVar.mo150684d();
            reportEntSignatureEvent(C42330c.C42334c.f107680g, "none");
        }
    }

    public void resetEditorSignature() {
        AbstractC42788a aVar = this.delegate;
        if (aVar != null) {
            aVar.mo150682b(getCurrentAddress());
            reportEntSignatureEvent(C42330c.C42334c.f107680g, getSignatureType(getCurrentDefaultId()));
        }
    }

    public String getCurrentAddress() {
        AbstractC42788a aVar = this.delegate;
        if (aVar != null && !TextUtils.isEmpty(aVar.mo150683c())) {
            return this.delegate.mo150683c();
        }
        MailAddress mailAddress = this.currentAddress;
        if (mailAddress != null) {
            return mailAddress.mo151182e();
        }
        return "";
    }

    public String getCurrentAddressName() {
        AbstractC42788a aVar = this.delegate;
        if (aVar != null && !TextUtils.isEmpty(aVar.mo150681b())) {
            return this.delegate.mo150681b();
        }
        MailAddress mailAddress = this.currentAddress;
        if (mailAddress != null) {
            return mailAddress.mo151176a();
        }
        return "";
    }

    public boolean isCurrentForceApply() {
        EntOptionalSignature entOptionalSignature = this.optionalSignatureMap.get(this.currentAddress);
        if (entOptionalSignature != null) {
            return entOptionalSignature.mo151163b();
        }
        EntOptionalSignature entOptionalSignature2 = this.optionalSignatureMap.get("current_account");
        if (entOptionalSignature2 == null || !entOptionalSignature2.mo151163b()) {
            return false;
        }
        return true;
    }

    public boolean isCurrentMailGroup() {
        AbstractC42788a aVar = this.delegate;
        if (aVar != null && aVar.mo150679a() != null) {
            return this.delegate.mo150679a().booleanValue();
        }
        if (this.currentAddress == null || !AddressType.ENTERPRISE_MAIL_GROUP.equals(this.currentAddress.mo151190k())) {
            return false;
        }
        return true;
    }

    public C42787b() {
        C42095h p = C43362e.m172201a().mo155101p();
        setSignatureList(p.mo151938a());
        setOptionalSignatureMap(p.mo151943c());
        setSignatureUsageList(p.mo151941b());
    }

    public void setCurrentAddress(MailAddress mailAddress) {
        this.currentAddress = mailAddress;
    }

    public void setDelegate(AbstractC42788a aVar) {
        this.delegate = aVar;
    }

    public void setNewMail(boolean z) {
        this.isNewMail = z;
    }

    public void setOptionalSignatureMap(Map<String, EntOptionalSignature> map) {
        if (map != null) {
            this.optionalSignatureMap = map;
        }
    }

    public void setSignatureUsageList(List<EntSignatureUsage> list) {
        if (list != null) {
            this.signatureUsageList = list;
        }
    }

    public void setCurrentSignatureId(String str) {
        if (TextUtils.isEmpty(str)) {
            this.currentSignatureId = "0";
        } else {
            this.currentSignatureId = str;
        }
    }

    public List<MailImage> getImageListById(String str) {
        MailEntSignature mailEntSignature = this.signatureMap.get(str);
        if (mailEntSignature == null || mailEntSignature.mo151393e() == null) {
            return new ArrayList();
        }
        return mailEntSignature.mo151393e();
    }

    public void setEditorSignature(String str) {
        AbstractC42788a aVar = this.delegate;
        if (aVar != null) {
            aVar.mo150680a(str);
            reportEntSignatureEvent(C42330c.C42334c.f107680g, getSignatureType(str));
        }
    }

    private String getSignatureType(String str) {
        if (isCurrentForceApply()) {
            return "assign";
        }
        MailEntSignature mailEntSignature = this.signatureMap.get(str);
        if (mailEntSignature == null || !MailEntSignature.SignatureType.CORPORATE.equals(mailEntSignature.mo151394f())) {
            return "custom";
        }
        return "template";
    }

    public String getDefaultId(String str) {
        if (TextUtils.isEmpty(str) || !CollectionUtils.isNotEmpty(this.signatureUsageList)) {
            return "0";
        }
        for (EntSignatureUsage entSignatureUsage : this.signatureUsageList) {
            if (entSignatureUsage != null && entSignatureUsage.getAddress().equals(str)) {
                if (this.isNewMail) {
                    return entSignatureUsage.getNewMailSignatureId();
                }
                return entSignatureUsage.getReplyMailSignatureId();
            }
        }
        return "0";
    }

    public void setSignatureList(List<MailEntSignature> list) {
        if (CollectionUtils.isNotEmpty(list)) {
            this.signatureList = list;
            this.signatureMap.clear();
            for (MailEntSignature mailEntSignature : list) {
                if (mailEntSignature != null) {
                    this.signatureMap.put(mailEntSignature.mo151380a(), mailEntSignature);
                }
            }
        }
    }

    public List<MailEntSignature> getUsableSignatureList(String str) {
        ArrayList arrayList = new ArrayList();
        if (!this.optionalSignatureMap.containsKey(str)) {
            str = "current_account";
        }
        EntOptionalSignature entOptionalSignature = this.optionalSignatureMap.get(str);
        if (entOptionalSignature != null && CollectionUtils.isNotEmpty(entOptionalSignature.mo151160a())) {
            for (String str2 : entOptionalSignature.mo151160a()) {
                if (!TextUtils.isEmpty(str2) && !"0".equals(str2)) {
                    arrayList.add(this.signatureMap.get(str2));
                }
            }
        }
        return arrayList;
    }

    private void reportEntSignatureEvent(String str, String str2) {
        String str3;
        Log.m165389i("MailSignatureSelectViewModel", "target: " + str + "; signatureType: " + str2 + "; isNewMail: " + this.isNewMail);
        if (this.isNewMail) {
            str3 = C42330c.C42335d.f107685a;
        } else {
            str3 = C42330c.C42335d.f107687c;
        }
        C42330c.m169066b(str, str2, str3);
    }
}
