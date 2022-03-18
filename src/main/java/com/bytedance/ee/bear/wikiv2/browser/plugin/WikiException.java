package com.bytedance.ee.bear.wikiv2.browser.plugin;

import android.content.Context;
import com.bytedance.ee.bear.contract.route.parcelable.WikiInfo;
import com.bytedance.ee.bear.document.fail.DocException;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.wikiv2.home.C12267b;
import com.bytedance.ee.log.C13479a;
import com.larksuite.suite.R;

public class WikiException extends DocException {
    private WikiException(int i) {
        this(i, null);
    }

    private WikiException(int i, String str) {
        super(i, str);
    }

    public static WikiInfo validate(Context context, C10917c cVar, WikiInfo wikiInfo) throws WikiException {
        if (wikiInfo != null) {
            int code = wikiInfo.getCode();
            if (code != 3) {
                if (code != 4) {
                    if (code != 920004002) {
                        if (!(code == 920004007 || code == 920004012)) {
                            if (wikiInfo.getObjType() != -1 && !C12267b.m51041a(cVar, wikiInfo.getObjType())) {
                                C13479a.m54758a("WikiException", "unsupported wiki type:" + wikiInfo);
                                throw new WikiException(-100001, "Unsupported wiki type:" + wikiInfo);
                            } else if (wikiInfo.isValid()) {
                                return wikiInfo;
                            } else {
                                throw new WikiException(wikiInfo.getCode());
                            }
                        }
                    }
                }
                throw new WikiException(-8010, "No wiki permission");
            }
            C13479a.m54764b("WikiException", "setwikiinfo code is 3, wiki token is wrong");
            throw new WikiException(920004002, context.getString(R.string.Doc_Wiki_PageRemovedText));
        }
        throw new WikiException(-8011, "Pull wiki token fail");
    }
}
