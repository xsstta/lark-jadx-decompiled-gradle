package com.ss.android.lark.mail.impl.utils;

import android.text.TextUtils;
import android.util.Pair;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.android.HwBuildEx;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mail.impl.entity.MailLabelEntity;
import com.ss.android.lark.mail.impl.entity.MailThread;
import com.ss.android.lark.mm.module.list.control.MmListControl;
import com.ss.android.lark.utils.UIHelper;
import com.ss.ttvideoengine.TTVideoEngine;
import com.ss.ttvideoengine.log.IVideoEventLogger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.lark.mail.impl.utils.k */
public class C43769k {
    /* renamed from: a */
    public static byte m173495a(Map<String, Boolean> map) {
        Log.m165389i("LabelUtil", "mask");
        byte b = 0;
        if (CollectionUtils.isEmpty(map)) {
            return 0;
        }
        if (map.get("INBOX") == Boolean.TRUE) {
            b = (byte) 1;
        }
        if (map.get("ARCHIVED") == Boolean.TRUE) {
            return (byte) (b | 2);
        }
        return b;
    }

    /* renamed from: a */
    public static Pair<Integer, Integer> m173496a(String str) {
        Pair<Integer, Integer> b = m173500b(str);
        return new Pair<>(Integer.valueOf(UIHelper.getColor(((Integer) b.first).intValue())), Integer.valueOf(UIHelper.getColor(((Integer) b.second).intValue())));
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0054 A[EDGE_INSN: B:22:0x0054->B:20:0x0054 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0018 A[SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte m173499b(java.util.List<com.ss.android.lark.mail.impl.entity.MailLabelEntity> r3) {
        /*
            java.lang.String r0 = "LabelUtil"
            java.lang.String r1 = "mask"
            com.ss.android.lark.log.Log.m165389i(r0, r1)
            boolean r1 = com.larksuite.framework.utils.CollectionUtils.isEmpty(r3)
            r2 = 0
            if (r1 == 0) goto L_0x0014
            java.lang.String r3 = "mask empty list"
            com.ss.android.lark.log.Log.m165383e(r0, r3)
            return r2
        L_0x0014:
            java.util.Iterator r3 = r3.iterator()
        L_0x0018:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0054
            java.lang.Object r0 = r3.next()
            com.ss.android.lark.mail.impl.entity.MailLabelEntity r0 = (com.ss.android.lark.mail.impl.entity.MailLabelEntity) r0
            if (r0 == 0) goto L_0x0018
            java.lang.String r1 = r0.mo151527k()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L_0x0031
            goto L_0x0018
        L_0x0031:
            java.lang.String r0 = r0.mo151527k()
            r0.hashCode()
            java.lang.String r1 = "ARCHIVED"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L_0x004e
            java.lang.String r1 = "INBOX"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0049
            goto L_0x0051
        L_0x0049:
            r0 = r2 | 1
        L_0x004b:
            byte r0 = (byte) r0
            r2 = r0
            goto L_0x0051
        L_0x004e:
            r0 = r2 | 2
            goto L_0x004b
        L_0x0051:
            r0 = 3
            if (r2 != r0) goto L_0x0018
        L_0x0054:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.mail.impl.utils.C43769k.m173499b(java.util.List):byte");
    }

    /* renamed from: a */
    public static HashMap<String, MailLabelEntity> m173497a(List<MailLabelEntity> list) {
        if (CollectionUtils.isEmpty(list)) {
            Log.m165383e("LabelUtil", "getLabelIDMap empty data");
            return null;
        }
        HashMap<String, MailLabelEntity> hashMap = new HashMap<>();
        for (MailLabelEntity mailLabelEntity : list) {
            if (mailLabelEntity != null && !TextUtils.isEmpty(mailLabelEntity.mo151527k())) {
                hashMap.put(mailLabelEntity.mo151527k(), mailLabelEntity);
            }
        }
        return hashMap;
    }

    /* renamed from: b */
    public static Pair<Integer, Integer> m173500b(String str) {
        if (str == null) {
            str = "";
        }
        String lowerCase = str.toLowerCase();
        lowerCase.hashCode();
        char c = 65535;
        switch (lowerCase.hashCode()) {
            case -1877103645:
                if (lowerCase.equals("#000000")) {
                    c = 0;
                    break;
                }
                break;
            case -1811306794:
                if (lowerCase.equals("#296b22")) {
                    c = 1;
                    break;
                }
                break;
            case -1742951187:
                if (lowerCase.equals("#4E83FD")) {
                    c = 2;
                    break;
                }
                break;
            case -1704177735:
                if (lowerCase.equals("#616ae5")) {
                    c = 3;
                    break;
                }
                break;
            case -1701930482:
                if (lowerCase.equals("#62d256")) {
                    c = 4;
                    break;
                }
                break;
            case -1645981930:
                if (lowerCase.equals("#828386")) {
                    c = 5;
                    break;
                }
                break;
            case -464331091:
                if (lowerCase.equals("#a9efe6")) {
                    c = 6;
                    break;
                }
                break;
            case -443134238:
                if (lowerCase.equals("#b1e8fc")) {
                    c = 7;
                    break;
                }
                break;
            case -437551002:
                if (lowerCase.equals("#b7edb1")) {
                    c = '\b';
                    break;
                }
                break;
            case -412647153:
                if (lowerCase.equals("#c3dd40")) {
                    c = '\t';
                    break;
                }
                break;
            case -397927016:
                if (lowerCase.equals("#bbbfc4")) {
                    c = '\n';
                    break;
                }
                break;
            case -386798545:
                if (lowerCase.equals("#d0e9f2")) {
                    c = 11;
                    break;
                }
                break;
            case -385875024:
                if (lowerCase.equals("#d1e9f2")) {
                    c = '\f';
                    break;
                }
                break;
            case -384986099:
                if (lowerCase.equals("#d2d4f2")) {
                    c = '\r';
                    break;
                }
                break;
            case -384017411:
                if (lowerCase.equals("#d3dcf2")) {
                    c = 14;
                    break;
                }
                break;
            case -384016450:
                if (lowerCase.equals("#d3ddf2")) {
                    c = 15;
                    break;
                }
                break;
            case -383092929:
                if (lowerCase.equals("#d4ddf2")) {
                    c = 16;
                    break;
                }
                break;
            case -382212653:
                if (lowerCase.equals("#d5d7f2")) {
                    c = 17;
                    break;
                }
                break;
            case -382169408:
                if (lowerCase.equals("#d5ddf2")) {
                    c = 18;
                    break;
                }
                break;
            case -382168447:
                if (lowerCase.equals("#d5def2")) {
                    c = 19;
                    break;
                }
                break;
            case -382154032:
                if (lowerCase.equals("#d5f6f2")) {
                    c = 20;
                    break;
                }
                break;
            case -380310894:
                if (lowerCase.equals("#d7f2d4")) {
                    c = 21;
                    break;
                }
                break;
            case -379387372:
                if (lowerCase.equals("#d8f2d5")) {
                    c = 22;
                    break;
                }
                break;
            case -378477246:
                if (lowerCase.equals("#d9dbf2")) {
                    c = 23;
                    break;
                }
                break;
            case -378462781:
                if (lowerCase.equals("#d9f3fd")) {
                    c = 24;
                    break;
                }
                break;
            case -378460967:
                if (lowerCase.equals("#d9f5d6")) {
                    c = 25;
                    break;
                }
                break;
            case -367381521:
                if (lowerCase.equals("#cdf2ed")) {
                    c = 26;
                    break;
                }
                break;
            case -366482044:
                if (lowerCase.equals("#cee8f2")) {
                    c = 27;
                    break;
                }
                break;
            case -366458000:
                if (lowerCase.equals("#cef2ed")) {
                    c = 28;
                    break;
                }
                break;
            case -365557562:
                if (lowerCase.equals("#cfe9f2")) {
                    c = 29;
                    break;
                }
                break;
            case -365534479:
                if (lowerCase.equals("#cff2ed")) {
                    c = 30;
                    break;
                }
                break;
            case -358202068:
                if (lowerCase.equals("#e0d6f2")) {
                    c = 31;
                    break;
                }
                break;
            case -358176074:
                if (lowerCase.equals("#e0e2fa")) {
                    c = ' ';
                    break;
                }
                break;
            case -357277586:
                if (lowerCase.equals("#e1d7f2")) {
                    c = '!';
                    break;
                }
                break;
            case -357251666:
                if (lowerCase.equals("#e1e3e6")) {
                    c = '\"';
                    break;
                }
                break;
            case -357207381:
                if (lowerCase.equals("#e1eaff")) {
                    c = '#';
                    break;
                }
                break;
            case -342025569:
                if (lowerCase.equals("#db66db")) {
                    c = '$';
                    break;
                }
                break;
            case -337887489:
                if (lowerCase.equals("#ded3f2")) {
                    c = '%';
                    break;
                }
                break;
            case -337860611:
                if (lowerCase.equals("#dee0e3")) {
                    c = '&';
                    break;
                }
                break;
            case -336963007:
                if (lowerCase.equals("#dfd4f2")) {
                    c = '\'';
                    break;
                }
                break;
            case -336887518:
                if (lowerCase.equals("#dfee96")) {
                    c = '(';
                    break;
                }
                break;
            case -327731671:
                if (lowerCase.equals("#f2d0e3")) {
                    c = ')';
                    break;
                }
                break;
            case -327729748:
                if (lowerCase.equals("#f2d2e4")) {
                    c = '*';
                    break;
                }
                break;
            case -327727797:
                if (lowerCase.equals("#f2d4f2")) {
                    c = '+';
                    break;
                }
                break;
            case -327725875:
                if (lowerCase.equals("#f2d6f2")) {
                    c = ',';
                    break;
                }
                break;
            case -327724972:
                if (lowerCase.equals("#f2d7d6")) {
                    c = '-';
                    break;
                }
                break;
            case -327724914:
                if (lowerCase.equals("#f2d7f2")) {
                    c = '.';
                    break;
                }
                break;
            case -327724011:
                if (lowerCase.equals("#f2d8d6")) {
                    c = '/';
                    break;
                }
                break;
            case -327724009:
                if (lowerCase.equals("#f2d8d8")) {
                    c = '0';
                    break;
                }
                break;
            case -327723048:
                if (lowerCase.equals("#f2d9d8")) {
                    c = '1';
                    break;
                }
                break;
            case -327700932:
                if (lowerCase.equals("#f2e1cd")) {
                    c = '2';
                    break;
                }
                break;
            case -327700931:
                if (lowerCase.equals("#f2e1ce")) {
                    c = '3';
                    break;
                }
                break;
            case -327700930:
                if (lowerCase.equals("#f2e1cf")) {
                    c = '4';
                    break;
                }
                break;
            case -327699970:
                if (lowerCase.equals("#f2e2ce")) {
                    c = '5';
                    break;
                }
                break;
            case -327695166:
                if (lowerCase.equals("#f2e7cd")) {
                    c = '6';
                    break;
                }
                break;
            case -327695165:
                if (lowerCase.equals("#f2e7ce")) {
                    c = '7';
                    break;
                }
                break;
            case -327694203:
                if (lowerCase.equals("#f2e8cf")) {
                    c = '8';
                    break;
                }
                break;
            case -327654802:
                if (lowerCase.equals("#f2eacf")) {
                    c = '9';
                    break;
                }
                break;
            case -327654793:
                if (lowerCase.equals("#f2eae1")) {
                    c = ':';
                    break;
                }
                break;
            case -324477259:
                if (lowerCase.equals("#f76964")) {
                    c = ';';
                    break;
                }
                break;
            case -322155065:
                if (lowerCase.equals("#f8e6ab")) {
                    c = '<';
                    break;
                }
                break;
            case -322139576:
                if (lowerCase.equals("#f8def8")) {
                    c = '=';
                    break;
                }
                break;
            case -311076499:
                if (lowerCase.equals("#ece2fe")) {
                    c = '>';
                    break;
                }
                break;
            case -311046802:
                if (lowerCase.equals("#ecf2cd")) {
                    c = '?';
                    break;
                }
                break;
            case -311046801:
                if (lowerCase.equals("#ecf2ce")) {
                    c = '@';
                    break;
                }
                break;
            case -309195962:
                if (lowerCase.equals("#eef6c6")) {
                    c = 'A';
                    break;
                }
                break;
            case -284324787:
                if (lowerCase.equals("#fad355")) {
                    c = 'B';
                    break;
                }
                break;
            case -284265674:
                if (lowerCase.equals("#faf1d1")) {
                    c = 'C';
                    break;
                }
                break;
            case -281523909:
                if (lowerCase.equals("#fde2e2")) {
                    c = 'D';
                    break;
                }
                break;
            case -281505598:
                if (lowerCase.equals("#fdddef")) {
                    c = 'E';
                    break;
                }
                break;
            case -280555252:
                if (lowerCase.equals("#feead2")) {
                    c = 'F';
                    break;
                }
                break;
            case -279597021:
                if (lowerCase.equals("#ffffff")) {
                    c = 'G';
                    break;
                }
                break;
        }
        int i = R.color.udtoken_tag_bg_blue;
        int i2 = R.color.udtoken_tag_text_s_blue;
        switch (c) {
            case 0:
            case 2:
            case 5:
            case '\n':
            case 14:
            case 15:
            case 16:
            case 18:
            case 19:
            case '\"':
            case '#':
            case '&':
            case 'G':
                break;
            case 1:
            case 4:
            case '\b':
            case 21:
            case 22:
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT:
                i2 = R.color.udtoken_tag_text_s_green;
                i = R.color.udtoken_tag_bg_green;
                break;
            case 3:
            case '\r':
            case 17:
            case 23:
            case ' ':
                i2 = R.color.udtoken_tag_text_s_indigo;
                i = R.color.udtoken_tag_bg_indigo;
                break;
            case 6:
            case 20:
            case 26:
            case IVideoEventLogger.LOGGER_OPTION_ENABLE_SR /*{ENCODED_INT: 28}*/:
            case 30:
                i2 = R.color.udtoken_tag_text_s_turquoise;
                i = R.color.udtoken_tag_bg_turquoise;
                break;
            case 7:
            case 11:
            case HwBuildEx.VersionCodes.EMUI_5_1:
            case 24:
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP:
            case 29:
                i2 = R.color.udtoken_tag_text_s_wathet;
                i = R.color.udtoken_tag_bg_wathet;
                break;
            case '\t':
            case '(':
            case '?':
            case '@':
            case 'A':
                i2 = R.color.udtoken_tag_text_s_lime;
                i = R.color.udtoken_tag_bg_lime;
                break;
            case TTVideoEngine.PLAYER_OPTION_ENABLE_PLAYER3_HARDWARE_DECODE /*{ENCODED_INT: 31}*/:
            case '!':
            case '%':
            case '\'':
            case '>':
                i2 = R.color.udtoken_tag_text_s_purple;
                i = R.color.udtoken_tag_bg_purple;
                break;
            case '$':
            case '+':
            case ',':
            case '.':
            case '=':
                i2 = R.color.udtoken_tag_text_s_violet;
                i = R.color.udtoken_tag_bg_violet;
                break;
            case ')':
            case '*':
            case 'E':
                i2 = R.color.udtoken_tag_text_s_carmine;
                i = R.color.udtoken_tag_bg_carmine;
                break;
            case '-':
            case '/':
            case '0':
            case '1':
            case ';':
            case 'D':
                i2 = R.color.udtoken_tag_text_s_red;
                i = R.color.udtoken_tag_bg_red;
                break;
            case MmListControl.f116813f /*{ENCODED_INT: 50}*/:
            case '3':
            case '4':
            case '5':
            case ':':
            case 'F':
                i2 = R.color.udtoken_tag_text_s_orange;
                i = R.color.udtoken_tag_bg_orange;
                break;
            case '6':
            case '7':
            case '8':
            case '9':
            case '<':
            case 'B':
            case 'C':
                i2 = R.color.udtoken_tag_text_s_yellow;
                i = R.color.udtoken_tag_bg_yellow;
                break;
            default:
                Log.m165397w("LabelUtil", "transformLabelColor switch to default");
                break;
        }
        return new Pair<>(Integer.valueOf(i2), Integer.valueOf(i));
    }

    /* renamed from: a */
    public static Map<String, Boolean> m173498a(ArrayList<String> arrayList, List<MailThread> list) {
        HashMap hashMap = new HashMap();
        if (!CollectionUtils.isEmpty(arrayList) && !CollectionUtils.isEmpty(list)) {
            Iterator<String> it = arrayList.iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (next != null) {
                    hashMap.put(next, false);
                }
            }
            int size = hashMap.size();
            for (MailThread mailThread : list) {
                if (size == 0) {
                    break;
                } else if (mailThread != null && !CollectionUtils.isEmpty(mailThread.mo151723r())) {
                    for (MailLabelEntity mailLabelEntity : mailThread.mo151723r()) {
                        if (mailLabelEntity != null && !TextUtils.isEmpty(mailLabelEntity.mo151527k())) {
                            String k = mailLabelEntity.mo151527k();
                            if (hashMap.get(k) == Boolean.FALSE) {
                                hashMap.put(k, true);
                                size--;
                            }
                            if (size == 0) {
                                break;
                            }
                        }
                    }
                }
            }
        }
        return hashMap;
    }
}
