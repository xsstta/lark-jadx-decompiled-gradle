package com.ss.android.lark.mm.settings;

import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.mm.depend.C45899c;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class MmSettingsConfig implements Serializable {
    public List<String> detail = new ArrayList();
    public List<String> homeList = new ArrayList();
    public List<String> hostList = new ArrayList();
    private C47079b mSettingHelper = new C47079b();
    public List<String> myList = new ArrayList();
    public List<String> shareList = new ArrayList();
    public List<String> trashList = new ArrayList();

    public C47079b getSettingHelper() {
        return this.mSettingHelper;
    }

    /* renamed from: com.ss.android.lark.mm.settings.MmSettingsConfig$a */
    public static class C47078a {

        /* renamed from: a */
        private static MmSettingsConfig f118504a;

        /* renamed from: a */
        public static MmSettingsConfig m186368a() {
            if (f118504a == null) {
                f118504a = new MmSettingsConfig();
                String d = C45899c.m181859a().getDomainDepend().mo144619d();
                List<String> list = f118504a.hostList;
                list.add(".*\\.(" + d + ")$");
                f118504a.myList.add("/(minutes|minutes_feishu)/me[/]?$");
                f118504a.homeList.add("/(minutes|minutes_feishu)/home[/]?$");
                f118504a.trashList.add("/(minutes|minutes_feishu)/trash[/]?$");
                f118504a.shareList.add("/(minutes|minutes_feishu)/shared[/]?$");
                f118504a.detail.add("/(minutes|minutes_feishu)/(ob|mm)(\\w{22})[/]?$");
                f118504a.getSettingHelper().mo165351a(f118504a);
            }
            return f118504a;
        }
    }

    /* renamed from: com.ss.android.lark.mm.settings.MmSettingsConfig$b */
    public class C47079b {

        /* renamed from: b */
        private List<Pattern> f118506b = new ArrayList();

        /* renamed from: c */
        private List<Pattern> f118507c = new ArrayList();

        /* renamed from: d */
        private List<Pattern> f118508d = new ArrayList();

        /* renamed from: e */
        private List<Pattern> f118509e = new ArrayList();

        /* renamed from: f */
        private List<Pattern> f118510f = new ArrayList();

        /* renamed from: g */
        private List<Pattern> f118511g = new ArrayList();

        public C47079b() {
        }

        /* renamed from: a */
        private List<Pattern> m186369a(List<String> list) {
            ArrayList arrayList = new ArrayList();
            if (!CollectionUtils.isEmpty(list)) {
                for (String str : list) {
                    arrayList.add(Pattern.compile(str));
                }
            }
            return arrayList;
        }

        /* renamed from: c */
        public boolean mo165354c(String str) {
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            String path = Uri.parse(str).getPath();
            if (TextUtils.isEmpty(path)) {
                return false;
            }
            synchronized (C47079b.class) {
                for (int i = 0; i < this.f118509e.size(); i++) {
                    if (this.f118509e.get(i).matcher(path).matches()) {
                        return true;
                    }
                }
                return false;
            }
        }

        /* renamed from: d */
        public boolean mo165355d(String str) {
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            String path = Uri.parse(str).getPath();
            if (TextUtils.isEmpty(path)) {
                return false;
            }
            synchronized (C47079b.class) {
                for (int i = 0; i < this.f118507c.size(); i++) {
                    if (this.f118507c.get(i).matcher(path).matches()) {
                        return true;
                    }
                }
                return false;
            }
        }

        /* renamed from: e */
        public boolean mo165356e(String str) {
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            String path = Uri.parse(str).getPath();
            if (TextUtils.isEmpty(path)) {
                return false;
            }
            synchronized (C47079b.class) {
                for (int i = 0; i < this.f118510f.size(); i++) {
                    if (this.f118510f.get(i).matcher(path).matches()) {
                        return true;
                    }
                }
                return false;
            }
        }

        /* renamed from: g */
        public boolean mo165358g(String str) {
            if (!mo165357f(str) || (!mo165355d(str) && !mo165356e(str) && !mo165353b(str) && !mo165354c(str))) {
                return false;
            }
            return true;
        }

        /* renamed from: a */
        public void mo165351a(MmSettingsConfig mmSettingsConfig) {
            if (mmSettingsConfig != null) {
                this.f118506b = m186369a(mmSettingsConfig.hostList);
                this.f118507c = m186369a(mmSettingsConfig.myList);
                this.f118508d = m186369a(mmSettingsConfig.homeList);
                this.f118509e = m186369a(mmSettingsConfig.trashList);
                this.f118510f = m186369a(mmSettingsConfig.shareList);
                this.f118511g = m186369a(mmSettingsConfig.detail);
                if (C45899c.m181859a().getHostDepend().mo144643k()) {
                    this.f118506b.add(Pattern.compile(".*\\.(feishu-pre.cn)$"));
                }
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:18:0x003c, code lost:
            r0 = r0.getQueryParameter("ref");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0046, code lost:
            if (mo165355d(r8) == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x004e, code lost:
            if ("home".equals(r0) == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x0050, code lost:
            return true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
            return false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
            return false;
         */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean mo165353b(java.lang.String r8) {
            /*
                r7 = this;
                boolean r0 = android.text.TextUtils.isEmpty(r8)
                r1 = 0
                if (r0 == 0) goto L_0x0008
                return r1
            L_0x0008:
                android.net.Uri r0 = android.net.Uri.parse(r8)
                java.lang.String r2 = r0.getPath()
                boolean r3 = android.text.TextUtils.isEmpty(r2)
                if (r3 == 0) goto L_0x0017
                return r1
            L_0x0017:
                java.lang.Class<com.ss.android.lark.mm.settings.MmSettingsConfig$b> r3 = com.ss.android.lark.mm.settings.MmSettingsConfig.C47079b.class
                monitor-enter(r3)
                r4 = 0
            L_0x001b:
                java.util.List<java.util.regex.Pattern> r5 = r7.f118508d     // Catch:{ all -> 0x0052 }
                int r5 = r5.size()     // Catch:{ all -> 0x0052 }
                r6 = 1
                if (r4 >= r5) goto L_0x003b
                java.util.List<java.util.regex.Pattern> r5 = r7.f118508d     // Catch:{ all -> 0x0052 }
                java.lang.Object r5 = r5.get(r4)     // Catch:{ all -> 0x0052 }
                java.util.regex.Pattern r5 = (java.util.regex.Pattern) r5     // Catch:{ all -> 0x0052 }
                java.util.regex.Matcher r5 = r5.matcher(r2)     // Catch:{ all -> 0x0052 }
                boolean r5 = r5.matches()     // Catch:{ all -> 0x0052 }
                if (r5 == 0) goto L_0x0038
                monitor-exit(r3)     // Catch:{ all -> 0x0052 }
                return r6
            L_0x0038:
                int r4 = r4 + 1
                goto L_0x001b
            L_0x003b:
                monitor-exit(r3)     // Catch:{ all -> 0x0052 }
                java.lang.String r2 = "ref"
                java.lang.String r0 = r0.getQueryParameter(r2)
                boolean r8 = r7.mo165355d(r8)
                if (r8 == 0) goto L_0x0051
                java.lang.String r8 = "home"
                boolean r8 = r8.equals(r0)
                if (r8 == 0) goto L_0x0051
                r1 = 1
            L_0x0051:
                return r1
            L_0x0052:
                r8 = move-exception
                monitor-exit(r3)
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.mm.settings.MmSettingsConfig.C47079b.mo165353b(java.lang.String):boolean");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0041, code lost:
            if (com.ss.android.lark.mm.depend.C45899c.m181859a().getShareDepend().mo144664a() != false) goto L_0x0054;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x0053, code lost:
            return r5.equals(com.ss.android.lark.mm.depend.C45899c.m181859a().getDomainDepend().mo144616a());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0054, code lost:
            return false;
         */
        /* renamed from: f */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean mo165357f(java.lang.String r5) {
            /*
                r4 = this;
                android.net.Uri r5 = android.net.Uri.parse(r5)
                java.lang.String r5 = r5.getHost()
                boolean r0 = android.text.TextUtils.isEmpty(r5)
                r1 = 0
                if (r0 == 0) goto L_0x0010
                return r1
            L_0x0010:
                java.lang.Class<com.ss.android.lark.mm.settings.MmSettingsConfig$b> r0 = com.ss.android.lark.mm.settings.MmSettingsConfig.C47079b.class
                monitor-enter(r0)
                r2 = 0
            L_0x0014:
                java.util.List<java.util.regex.Pattern> r3 = r4.f118506b     // Catch:{ all -> 0x0055 }
                int r3 = r3.size()     // Catch:{ all -> 0x0055 }
                if (r2 >= r3) goto L_0x0034
                java.util.List<java.util.regex.Pattern> r3 = r4.f118506b     // Catch:{ all -> 0x0055 }
                java.lang.Object r3 = r3.get(r2)     // Catch:{ all -> 0x0055 }
                java.util.regex.Pattern r3 = (java.util.regex.Pattern) r3     // Catch:{ all -> 0x0055 }
                java.util.regex.Matcher r3 = r3.matcher(r5)     // Catch:{ all -> 0x0055 }
                boolean r3 = r3.matches()     // Catch:{ all -> 0x0055 }
                if (r3 == 0) goto L_0x0031
                monitor-exit(r0)     // Catch:{ all -> 0x0055 }
                r5 = 1
                return r5
            L_0x0031:
                int r2 = r2 + 1
                goto L_0x0014
            L_0x0034:
                monitor-exit(r0)     // Catch:{ all -> 0x0055 }
                com.ss.android.lark.mm.depend.IMmDepend r0 = com.ss.android.lark.mm.depend.C45899c.m181859a()
                com.ss.android.lark.mm.depend.IMmDepend$r r0 = r0.getShareDepend()
                boolean r0 = r0.mo144664a()
                if (r0 != 0) goto L_0x0054
                com.ss.android.lark.mm.depend.IMmDepend r0 = com.ss.android.lark.mm.depend.C45899c.m181859a()
                com.ss.android.lark.mm.depend.IMmDepend$c r0 = r0.getDomainDepend()
                java.lang.String r0 = r0.mo144616a()
                boolean r5 = r5.equals(r0)
                return r5
            L_0x0054:
                return r1
            L_0x0055:
                r5 = move-exception
                monitor-exit(r0)
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.mm.settings.MmSettingsConfig.C47079b.mo165357f(java.lang.String):boolean");
        }

        /* renamed from: a */
        public boolean mo165352a(String str) {
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            Uri parse = Uri.parse(str);
            String scheme = parse.getScheme();
            if (TextUtils.isEmpty(scheme) || (!"http".equalsIgnoreCase(scheme) && !"https".equalsIgnoreCase(scheme))) {
                return false;
            }
            if (mo165358g(str)) {
                return true;
            }
            String path = parse.getPath();
            if (TextUtils.isEmpty(path)) {
                return false;
            }
            synchronized (C47079b.class) {
                for (int i = 0; i < this.f118511g.size(); i++) {
                    if (this.f118511g.get(i).matcher(path).matches()) {
                        return true;
                    }
                }
                return false;
            }
        }
    }

    public static MmSettingsConfig parser(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        new MmSettingsConfig();
        try {
            MmSettingsConfig mmSettingsConfig = (MmSettingsConfig) JSON.parseObject(str, MmSettingsConfig.class);
            if (mmSettingsConfig == null) {
                return null;
            }
            mmSettingsConfig.getSettingHelper().mo165351a(mmSettingsConfig);
            return mmSettingsConfig;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
