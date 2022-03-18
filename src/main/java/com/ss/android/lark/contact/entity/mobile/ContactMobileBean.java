package com.ss.android.lark.contact.entity.mobile;

import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.Pair;
import android.widget.ImageView;
import android.widget.TextView;
import com.github.p964a.p965a.C21285b;
import com.larksuite.framework.utils.RomUtils;
import com.ss.android.lark.contact.entity.mobile.task.LoadBitmapTask;
import com.ss.android.lark.contact.entity.mobile.util.ContactMobileUtils;
import com.ss.android.lark.inv.export.util.C40140u;
import java.io.Serializable;
import java.util.ArrayList;

public class ContactMobileBean implements Serializable, Comparable<ContactMobileBean> {
    private static final long serialVersionUID = -9094813086945219750L;
    private String mAbbreviation;
    private String mAvatarUri;
    private Pair<Integer, String> mCountryCodePhonePair;
    private String mEmail;
    private String mInitial;
    private String mName;
    private String mPhone;
    private String mPhoneE164;
    private int matchType;
    private String namePinYin;
    private ArrayList<String> namePinyinList;

    public String getAvatarUri() {
        return this.mAvatarUri;
    }

    public String getEmail() {
        return this.mEmail;
    }

    public String getInitial() {
        return this.mInitial;
    }

    public String getName() {
        return this.mName;
    }

    public String getNamePinYin() {
        return this.namePinYin;
    }

    public ArrayList<String> getNamePinyinList() {
        return this.namePinyinList;
    }

    public String getPhone() {
        return this.mPhone;
    }

    public String getPhoneE164() {
        return this.mPhoneE164;
    }

    public String getEmailOrPhone() {
        if (isEmail()) {
            return getEmail();
        }
        return getPhone();
    }

    public String getEmailOrPhoneE164() {
        if (isEmail()) {
            return getEmail();
        }
        return getPhoneE164();
    }

    public boolean isEmail() {
        return !TextUtils.isEmpty(this.mEmail);
    }

    public boolean isRightEmail() {
        if (!isEmail()) {
            return false;
        }
        return ContactMobileUtils.m138441b(this.mEmail);
    }

    public boolean isRightPhone() {
        if (isEmail()) {
            return false;
        }
        return ContactMobileUtils.m138440a(this.mCountryCodePhonePair);
    }

    public String getUniquelyIdentifies() {
        return getName() + getEmail() + getPhone();
    }

    public boolean isAvailable() {
        if (isEmail()) {
            return ContactMobileUtils.m138441b(this.mEmail);
        }
        return ContactMobileUtils.m138440a(this.mCountryCodePhonePair);
    }

    private String getPhoneE164Real() {
        if (this.mCountryCodePhonePair == null) {
            return "";
        }
        return "+" + this.mCountryCodePhonePair.first + ((String) this.mCountryCodePhonePair.second);
    }

    private void init() {
        String c = ContactMobileUtils.m138442c(this.mName);
        this.mAbbreviation = c;
        this.mInitial = c.substring(0, 1);
        StringBuffer stringBuffer = new StringBuffer();
        StringBuffer stringBuffer2 = new StringBuffer();
        for (int i = 0; i < this.mName.length(); i++) {
            StringBuffer stringBuffer3 = new StringBuffer();
            String str = this.mName.charAt(i) + "";
            for (int i2 = 0; i2 < str.length(); i2++) {
                String upperCase = C21285b.m77122a(str.charAt(i2)).toUpperCase();
                stringBuffer3.append(upperCase);
                stringBuffer2.append(upperCase.charAt(0));
                stringBuffer.append(upperCase);
            }
            this.namePinyinList.add(stringBuffer3.toString());
        }
        this.namePinYin = stringBuffer.toString();
    }

    public String toString() {
        String str = "name: " + getName();
        if (isEmail()) {
            return str + ", email: " + getEmail();
        }
        return str + ", phone: " + this.mCountryCodePhonePair;
    }

    public String getAvatarName() {
        if (C40140u.m159141b(this.mName)) {
            String[] split = this.mName.split(" ");
            if (split.length < 2 || split[0].toCharArray().length <= 0 || split[split.length - 1].toCharArray().length <= 0) {
                return (this.mName.toCharArray()[0] + "").toUpperCase();
            }
            return (split[0].toCharArray()[0] + "" + split[split.length - 1].toCharArray()[0]).toUpperCase();
        }
        char[] charArray = this.mName.toCharArray();
        if (charArray.length < 2) {
            return this.mName.toUpperCase();
        }
        return (charArray[charArray.length - 2] + "" + charArray[charArray.length - 1]).toUpperCase();
    }

    public void setMatchType(int i) {
        this.matchType = i;
    }

    public int compareTo(ContactMobileBean contactMobileBean) {
        if (this.mAbbreviation.equals(contactMobileBean.mAbbreviation)) {
            return 0;
        }
        boolean startsWith = this.mAbbreviation.startsWith("#");
        if (!(contactMobileBean.mAbbreviation.startsWith("#") ^ startsWith)) {
            return getInitial().compareTo(contactMobileBean.getInitial());
        }
        if (startsWith) {
            return 1;
        }
        return -1;
    }

    public boolean isMatch(String str) {
        if (!TextUtils.isEmpty(str) && !getName().contains(str) && !getEmailOrPhone().contains(str) && !this.namePinYin.contains(str.toUpperCase())) {
            return false;
        }
        return true;
    }

    public void cancelLoadAvatar(TextView textView, ImageView imageView) {
        if (textView.getTag() != null) {
            ((AsyncTask) textView.getTag()).cancel(true);
        }
        if (imageView.getTag() != null) {
            ((AsyncTask) imageView.getTag()).cancel(true);
        }
    }

    public void loadAvatar(TextView textView, ImageView imageView) {
        if (TextUtils.isEmpty(this.mAvatarUri) || RomUtils.m94944c()) {
            textView.setText(getAvatarName());
            return;
        }
        LoadBitmapTask aVar = new LoadBitmapTask(textView, imageView, this);
        textView.setTag(aVar);
        imageView.setTag(aVar);
        aVar.execute(new Object[0]);
    }

    public ContactMobileBean(String str, String str2, String str3) {
        this.namePinYin = "";
        this.namePinyinList = new ArrayList<>();
        this.mName = str;
        this.mAvatarUri = str2;
        this.mEmail = str3;
        init();
    }

    public ContactMobileBean(String str, String str2, int i, String str3) {
        this(str, str2, str3, ContactMobileUtils.m138433a(i, str3));
    }

    public ContactMobileBean(String str, String str2, String str3, Pair<Integer, String> pair) {
        this.namePinYin = "";
        this.namePinyinList = new ArrayList<>();
        this.mName = str;
        this.mAvatarUri = str2;
        this.mPhone = str3;
        this.mCountryCodePhonePair = pair;
        this.mPhoneE164 = getPhoneE164Real();
        init();
    }
}
