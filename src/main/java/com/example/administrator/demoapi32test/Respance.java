package com.example.administrator.demoapi32test;

import java.util.List;

public class Respance {

    /**
     * Code : 0
     * Total : 26215
     * WeekTotal : 40
     * MonthTotal : 203
     * Status : true
     * Message : 请求成功
     * Data : [{"JobTitle":"IT/互联网","JobNumber":3459,"CompanyNumber":1930,"ArticleNumber":5210,"IndustyId":"1"},{"JobTitle":"地产/建筑/物业","JobNumber":2867,"CompanyNumber":1584,"ArticleNumber":3949,"IndustyId":"3"},{"JobTitle":"制造","JobNumber":2271,"CompanyNumber":1260,"ArticleNumber":3149,"IndustyId":"6"},{"JobTitle":"金融","JobNumber":1906,"CompanyNumber":1038,"ArticleNumber":2689,"IndustyId":"2"},{"JobTitle":"消费品","JobNumber":1756,"CompanyNumber":998,"ArticleNumber":2332,"IndustyId":"5"},{"JobTitle":"制药/医疗","JobNumber":1462,"CompanyNumber":803,"ArticleNumber":2094,"IndustyId":"11"},{"JobTitle":"能源/环保","JobNumber":1346,"CompanyNumber":743,"ArticleNumber":1904,"IndustyId":"12"},{"JobTitle":"服务/外包/中介","JobNumber":942,"CompanyNumber":623,"ArticleNumber":1756,"IndustyId":"7"},{"JobTitle":"电子/通信","JobNumber":1031,"CompanyNumber":565,"ArticleNumber":1451,"IndustyId":"4"},{"JobTitle":"教育","JobNumber":920,"CompanyNumber":564,"ArticleNumber":1249,"IndustyId":"8"},{"JobTitle":"政府/农林牧渔","JobNumber":563,"CompanyNumber":332,"ArticleNumber":796,"IndustyId":"13"},{"JobTitle":"贸易/物流","JobNumber":481,"CompanyNumber":289,"ArticleNumber":704,"IndustyId":"10"},{"JobTitle":"媒体/广告","JobNumber":427,"CompanyNumber":300,"ArticleNumber":544,"IndustyId":"9"},{"JobTitle":"其他","JobNumber":151,"CompanyNumber":117,"ArticleNumber":202,"IndustyId":"14"}]
     */

    private int Code;
    private int Total;
    private int WeekTotal;
    private int MonthTotal;
    private boolean Status;
    private String Message;
    private List<DataBean> Data;

    public int getCode() {
        return Code;
    }

    public void setCode(int Code) {
        this.Code = Code;
    }

    public int getTotal() {
        return Total;
    }

    public void setTotal(int Total) {
        this.Total = Total;
    }

    public int getWeekTotal() {
        return WeekTotal;
    }

    public void setWeekTotal(int WeekTotal) {
        this.WeekTotal = WeekTotal;
    }

    public int getMonthTotal() {
        return MonthTotal;
    }

    public void setMonthTotal(int MonthTotal) {
        this.MonthTotal = MonthTotal;
    }

    public boolean isStatus() {
        return Status;
    }

    public void setStatus(boolean Status) {
        this.Status = Status;
    }

    public String getMessage() {
        return Message;
    }

    public void setMessage(String Message) {
        this.Message = Message;
    }

    public List<DataBean> getData() {
        return Data;
    }

    public void setData(List<DataBean> Data) {
        this.Data = Data;
    }

    public static class DataBean {
        /**
         * JobTitle : IT/互联网
         * JobNumber : 3459
         * CompanyNumber : 1930
         * ArticleNumber : 5210
         * IndustyId : 1
         */

        private String JobTitle;
        private int JobNumber;
        private int CompanyNumber;
        private int ArticleNumber;
        private String IndustyId;

        public String getJobTitle() {
            return JobTitle;
        }

        public void setJobTitle(String JobTitle) {
            this.JobTitle = JobTitle;
        }

        public int getJobNumber() {
            return JobNumber;
        }

        public void setJobNumber(int JobNumber) {
            this.JobNumber = JobNumber;
        }

        public int getCompanyNumber() {
            return CompanyNumber;
        }

        public void setCompanyNumber(int CompanyNumber) {
            this.CompanyNumber = CompanyNumber;
        }

        public int getArticleNumber() {
            return ArticleNumber;
        }

        public void setArticleNumber(int ArticleNumber) {
            this.ArticleNumber = ArticleNumber;
        }

        public String getIndustyId() {
            return IndustyId;
        }

        public void setIndustyId(String IndustyId) {
            this.IndustyId = IndustyId;
        }
    }
}
