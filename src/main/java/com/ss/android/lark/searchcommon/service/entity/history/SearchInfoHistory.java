package com.ss.android.lark.searchcommon.service.entity.history;

import com.ss.android.lark.searchcommon.constant.SearchCommonConstants;
import com.ss.android.lark.searchcommon.service.entity.request.NetSearchRequest;
import java.io.Serializable;
import java.util.Objects;

public class SearchInfoHistory implements Serializable {
    private NetSearchRequest.ChatFilter chatFilter;
    private NetSearchRequest.Filter filter;
    private SearchCommonConstants.SearchHistorySource historySource;
    private String id;
    private MainSubSource mainSubSource;
    private MessageSubSource messageSubSource;
    private String query;
    private SpaceSubSource spaceSubSource;

    public static class MainSubSource implements Serializable {
    }

    public static class MessageSubSource implements Serializable {
        private static final long serialVersionUID = -7081848925865122018L;
        private Type type;

        public enum Type {
            ALL(0),
            LINK(1),
            FILE(2);
            
            private int value;

            public int getNumber() {
                return this.value;
            }

            public static Type valueOf(int i) {
                return forNumber(i);
            }

            public static Type forNumber(int i) {
                if (i == 0) {
                    return ALL;
                }
                if (i == 1) {
                    return LINK;
                }
                if (i != 2) {
                    return ALL;
                }
                return FILE;
            }

            private Type(int i) {
                this.value = i;
            }
        }

        public Type getType() {
            return this.type;
        }

        public void setType(Type type2) {
            this.type = type2;
        }

        public MessageSubSource(Type type2) {
            this.type = type2;
        }
    }

    public static class SpaceSubSource implements Serializable {
    }

    public NetSearchRequest.ChatFilter getChatFilter() {
        return this.chatFilter;
    }

    public NetSearchRequest.Filter getFilter() {
        return this.filter;
    }

    public SearchCommonConstants.SearchHistorySource getHistorySource() {
        return this.historySource;
    }

    public String getId() {
        return this.id;
    }

    public MainSubSource getMainSubSource() {
        return this.mainSubSource;
    }

    public MessageSubSource getMessageSubSource() {
        return this.messageSubSource;
    }

    public String getQuery() {
        return this.query;
    }

    public SpaceSubSource getSpaceSubSource() {
        return this.spaceSubSource;
    }

    public int hashCode() {
        return Objects.hash(this.id, this.query);
    }

    public void setChatFilter(NetSearchRequest.ChatFilter chatFilter2) {
        this.chatFilter = chatFilter2;
    }

    public void setFilter(NetSearchRequest.Filter filter2) {
        this.filter = filter2;
    }

    public void setHistorySource(SearchCommonConstants.SearchHistorySource searchHistorySource) {
        this.historySource = searchHistorySource;
    }

    public void setId(String str) {
        this.id = str;
    }

    public void setMainSubSource(MainSubSource mainSubSource2) {
        this.mainSubSource = mainSubSource2;
    }

    public void setMessageSubSource(MessageSubSource messageSubSource2) {
        this.messageSubSource = messageSubSource2;
    }

    public void setQuery(String str) {
        this.query = str;
    }

    public void setSpaceSubSource(SpaceSubSource spaceSubSource2) {
        this.spaceSubSource = spaceSubSource2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SearchInfoHistory searchInfoHistory = (SearchInfoHistory) obj;
        if (!Objects.equals(this.id, searchInfoHistory.id) || !Objects.equals(this.query, searchInfoHistory.query)) {
            return false;
        }
        return true;
    }
}
